.class public interface abstract Lorg/apache/tika/pipes/fetcher/RangeFetcher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/pipes/fetcher/Fetcher;


# virtual methods
.method public abstract fetch(Ljava/lang/String;JJLorg/apache/tika/metadata/Metadata;)Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/tika/exception/TikaException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract fetch(Ljava/lang/String;JJLorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/tika/exception/TikaException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method
