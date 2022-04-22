package com.example.demo;

import com.example.demo.entity.Member;

import com.example.demo.entity.QArticle;
import com.example.demo.entity.QMember;
import com.example.demo.entity.QReactionPoint;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.Tuple;
import com.querydsl.core.types.dsl.CaseBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
        int actorId = 1;
        int actorLevel = 3;

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
                        new CaseBuilder()
                                .when(reactionPoint.point.gt(0))
                                .then(reactionPoint.point)
                                .otherwise(0)
                                .sum()
                                .as("goodReactionPoint"),
                        new CaseBuilder()
                                .when(reactionPoint.point.lt(0))
                                .then(reactionPoint.point.multiply(-1))
                                .otherwise(0)
                                .sum()
                                .as("badReactionPoint"),
                        new CaseBuilder()
                                .when(article.memberId.eq(actorId))
                                .then(true)
                                .otherwise(false)
                                .as("actorCanDelete"),
                        new CaseBuilder()
                                .when(article.memberId.eq(actorId))
                                .then(true)
                                .otherwise(false)
                                .as("actorCanModify")
                )
                .from(article)
                .leftJoin(reactionPoint).on(article.id.eq(reactionPoint.relId.longValue()))
                .leftJoin(member).on(member.id.eq(article.memberId.longValue()))
                .where(reactionPoint.relTypeCode.eq("article"))
                .groupBy(article.id)
                .fetch();
        
        for (Tuple tuple : articles) {
            System.out.println("MemberQDTest.ArticleListItemDto");
            System.out.println("tuple = " + tuple.toString());
            System.out.println("tuple.get(article.id) = " + tuple.get(article.id));
            System.out.println("tuple.get(article.id) = " + tuple.get(article.regDate));
            System.out.println("tuple.get(article.id) = " + tuple.get(article.updateDate));
            System.out.println("tuple.get(article.id) = " + tuple.get(article.title));
            System.out.println("tuple.get(article.id) = " + tuple.get(article.body));
            System.out.println("tuple.get(article.id) = " + tuple.get(article.memberId));
            System.out.println("tuple.get(article.id) = " + tuple.get(article.boardId));
            System.out.println("tuple.get(article.id) = " + tuple.get(article.hitCount));
            System.out.println("tuple.get(reactionPoint.as(\"good\")) = " + tuple.get(reactionPoint.as("good")));
            System.out.println("tuple.get(reactionPoint.as(\"bad\")) = " + tuple.get(reactionPoint.as("bad")));
        }
    }
}
