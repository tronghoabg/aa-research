.class public interface abstract Lorg/apache/tika/extractor/EmbeddedDocumentExtractor;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract parseEmbedded(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Z)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;,
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract shouldParseEmbedded(Lorg/apache/tika/metadata/Metadata;)Z
.end method
