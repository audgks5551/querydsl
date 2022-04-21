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
@Table(name = "reply", indexes =
        {
            @Index(name = "relTypeCode", columnList = "relTypeCode, relId"),
        }
)
public class Reply {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime regDate;

    @Column(nullable = false)
    private LocalDateTime updateDate;

    @JoinColumn(nullable = false)
    private String memberId;

    @Column(nullable = false)
    private String relTypeCode;

    @Column(nullable = false)
    private Integer relId;

    @Column(nullable = false)
    private String body;

    @ColumnDefault(value = "0")
    @Column(nullable = false)
    private Integer goodReactionPoint;

    @ColumnDefault(value = "0")
    @Column(nullable = false)
    private Integer badReactionPoint;
}
