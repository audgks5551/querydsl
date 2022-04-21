package com.example.demo.repository;

import com.example.demo.entity.Member;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberQD {

    private final JPAQueryFactory queryFactory;

//    public List<Member> findMemberAll() {
//
//        QMember member = QMember.member;
//
//        return queryFactory.selectFrom(member)
//                .fetch();
//    }



}
