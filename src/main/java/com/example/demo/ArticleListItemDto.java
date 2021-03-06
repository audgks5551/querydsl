package com.example.demo;

import com.querydsl.core.types.dsl.NumberPath;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ArticleListItemDto {
    private NumberPath<Long> id;
    private LocalDateTime regDate;
    private LocalDateTime updateDate;
    private String title;
    private String body;
    private String memberId;
    private String boardId;
    private Integer hitCount;

    private Integer goodReactionPoint;
    private Integer badReactionPoint;

    private boolean actorCanDelete;
    private boolean actorCanModify;
    private boolean actorHadGoodReaction;
    private boolean actorHadBadReaction;
}
