package com.example.demo.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAttr is a Querydsl query type for Attr
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAttr extends EntityPathBase<Attr> {

    private static final long serialVersionUID = 133201282L;

    public static final QAttr attr = new QAttr("attr");

    public final DateTimePath<java.time.LocalDateTime> expireDate = createDateTime("expireDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.LocalDateTime> regDate = createDateTime("regDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> relId = createNumber("relId", Integer.class);

    public final StringPath relTypeCode = createString("relTypeCode");

    public final StringPath Type2Code = createString("Type2Code");

    public final StringPath TypeCode = createString("TypeCode");

    public final DateTimePath<java.time.LocalDateTime> updateDate = createDateTime("updateDate", java.time.LocalDateTime.class);

    public final StringPath value = createString("value");

    public QAttr(String variable) {
        super(Attr.class, forVariable(variable));
    }

    public QAttr(Path<? extends Attr> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAttr(PathMetadata metadata) {
        super(Attr.class, metadata);
    }

}

