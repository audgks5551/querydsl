package com.example.demo;

import com.example.demo.entity.Member;

import com.example.demo.entity.QArticle;
import com.example.demo.entity.QMember;
import com.example.demo.entity.QReactionPoint;
import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class MemberQDTest {

    @Autowired
    private JPAQueryFactory queryFactory;

    @Test
    public void 모든_멤버_조회() {
        QMember member = QMember.member;

        List<Member> members = queryFactory.selectFrom(member)
                .fetch();

        Assertions.assertThat(members.size()).isEqualTo(5);
    }

    @Test
    public void ArticleListItemDto() {
        QMember member = QMember.member;
        QArticle article = QArticle.article;
        QReactionPoint reactionPoint = QReactionPoint.reactionPoint;

        List<Tuple> articles = queryFactory
                .select(
                        article.id,
                        article.regDate,
                        article.updateDate,
                        article.title,
                        article.body,
                        article.memberId,
                        article.boardId,
                        article.hitCount,
                        reactionPoint.point.sum().gt(0).as("goodReactionPoint"),
                        reactionPoint.point.sum().lt(0).as("badReactionPoint")
                )
                .from(article)
                .leftJoin(reactionPoint).on(article.id.eq(reactionPoint.relId.longValue()))
                .where(reactionPoint.relTypeCode.eq("article"))
                .groupBy(article.id)
                .fetch();
        for (Tuple tuple : articles) {
            System.out.println("MemberQDTest.ArticleListItemDto");
            System.out.println("tuple.toString() = " + tuple.toString());
        }
    }
}
