.class public interface abstract Lorg/apache/tika/pipes/emitter/StreamEmitter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/tika/pipes/emitter/Emitter;


# virtual methods
.method public abstract emit(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/apache/tika/pipes/emitter/TikaEmitterException;
        }
    .end annotation
.end method
