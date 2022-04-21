package com.example.demo.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QReply is a Querydsl query type for Reply
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReply extends EntityPathBase<Reply> {

    private static final long serialVersionUID = -150478471L;

    public static final QReply reply = new QReply("reply");

    public final NumberPath<Integer> badReactionPoint = createNumber("badReactionPoint", Integer.class);

    public final StringPath body = createString("body");

    public final NumberPath<Integer> goodReactionPoint = createNumber("goodReactionPoint", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath memberId = createString("memberId");

    public final DateTimePath<java.time.LocalDateTime> regDate = createDateTime("regDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> relId = createNumber("relId", Integer.class);

    public final StringPath relTypeCode = createString("relTypeCode");

    public final DateTimePath<java.time.LocalDateTime> updateDate = createDateTime("updateDate", java.time.LocalDateTime.class);

    public QReply(String variable) {
        super(Reply.class, forVariable(variable));
    }

    public QReply(Path<? extends Reply> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReply(PathMetadata metadata) {
        super(Reply.class, metadata);
    }

}

