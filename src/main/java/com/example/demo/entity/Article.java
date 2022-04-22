package com.example.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "article")
public class Article {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime regDate;

    @Column(nullable = false)
    private LocalDateTime updateDate;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String body;

    @Column(nullable = false)
    private String memberId;

    @Column(nullable = false)
    private String boardId;

    @Column(nullable = false)
    private Integer hitCount;
}
