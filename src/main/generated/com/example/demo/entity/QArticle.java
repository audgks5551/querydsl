package com.example.demo.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QArticle is a Querydsl query type for Article
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QArticle extends EntityPathBase<Article> {

    private static final long serialVersionUID = -407817275L;

    public static final QArticle article = new QArticle("article");

    public final NumberPath<Integer> badReactionPoint = createNumber("badReactionPoint", Integer.class);

    public final StringPath boardId = createString("boardId");

    public final StringPath body = createString("body");

    public final NumberPath<Integer> goodReactionPoint = createNumber("goodReactionPoint", Integer.class);

    public final NumberPath<Integer> hitCount = createNumber("hitCount", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath memberId = createString("memberId");

    public final DateTimePath<java.time.LocalDateTime> regDate = createDateTime("regDate", java.time.LocalDateTime.class);

    public final StringPath title = createString("title");

    public final DateTimePath<java.time.LocalDateTime> updateDate = createDateTime("updateDate", java.time.LocalDateTime.class);

    public QArticle(String variable) {
        super(Article.class, forVariable(variable));
    }

    public QArticle(Path<? extends Article> path) {
        super(path.getType(), path.getMetadata());
    }

    public QArticle(PathMetadata metadata) {
        super(Article.class, metadata);
    }

}

