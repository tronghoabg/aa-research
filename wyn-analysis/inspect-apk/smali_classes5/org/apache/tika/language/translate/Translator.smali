.class public interface abstract Lorg/apache/tika/language/translate/Translator;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract isAvailable()Z
.end method

.method public abstract translate(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/tika/exception/TikaException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract translate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/tika/exception/TikaException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method
