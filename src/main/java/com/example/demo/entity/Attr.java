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
@Table(name = "attr", indexes =
        {
                @Index(name = "relTypeCode", columnList = "relTypeCode, typeCode, type2Code"),
                @Index(name = "relTypeCode_2", columnList = "relTypeCode, relId, typeCode, type2Code", unique = true)
        }
)
public class Attr {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime regDate;

    @Column(nullable = false)
    private LocalDateTime updateDate;

    @Column(nullable = false)
    private String relTypeCode;

    @Column(nullable = false)
    private Integer relId;

    @Column(nullable = false)
    private String TypeCode;

    @Column(nullable = false)
    private String Type2Code;

    @Column(nullable = false)
    private String value;

    @Column(nullable = true)
    private LocalDateTime expireDate;
}
