package com.example.demo.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QReactionPoint is a Querydsl query type for ReactionPoint
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReactionPoint extends EntityPathBase<ReactionPoint> {

    private static final long serialVersionUID = 1344097398L;

    public static final QReactionPoint reactionPoint = new QReactionPoint("reactionPoint");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> memberId = createNumber("memberId", Long.class);

    public final NumberPath<Integer> point = createNumber("point", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> regDate = createDateTime("regDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> relId = createNumber("relId", Integer.class);

    public final StringPath relTypeCode = createString("relTypeCode");

    public final DateTimePath<java.time.LocalDateTime> updateDate = createDateTime("updateDate", java.time.LocalDateTime.class);

    public QReactionPoint(String variable) {
        super(ReactionPoint.class, forVariable(variable));
    }

    public QReactionPoint(Path<? extends ReactionPoint> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReactionPoint(PathMetadata metadata) {
        super(ReactionPoint.class, metadata);
    }

}

