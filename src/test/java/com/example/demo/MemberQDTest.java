package com.example.demo;

import com.example.demo.entity.Member;

import com.example.demo.entity.QArticle;
import com.example.demo.entity.QMember;
import com.example.demo.entity.QReactionPoint;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

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

    public void ArticleListItemDto() {
        QMember member = QMember.member;
        QArticle article = QArticle.article;
        QReactionPoint reactPoint = QReactionPoint.reactionPoint;

        int id;
        LocalDateTime regDate;
        String title;

        int goodReactionPoint;
        int badReactionPoint;
        boolean actorCanDelete;
        boolean actorCanModify;
        boolean actorHadGoodReaction;
        boolean actorHadBadReaction;
    }
}
