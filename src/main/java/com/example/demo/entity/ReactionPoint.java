package com.example.demo.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "reactionPoint")
public class ReactionPoint {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime regDate;

    @Column(nullable = false)
    private LocalDateTime updateDate;

    @Column(nullable = false)
    private Long memberId;

    @Column(nullable = false)
    private String relTypeCode;

    @Column(nullable = false)
    private Integer relId;

    @Column(nullable = false)
    private Integer point;
}
