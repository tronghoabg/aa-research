.class public interface abstract Lorg/apache/tika/extractor/EmbeddedStreamTranslator;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract shouldTranslate(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract translate(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
