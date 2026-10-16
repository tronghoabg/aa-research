.class Lorg/apache/tika/extractor/ParserContainerExtractor$RecursiveParser;
.super Lorg/apache/tika/parser/StatefulParser;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/extractor/ParserContainerExtractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "RecursiveParser"
.end annotation


# instance fields
.field private final extractor:Lorg/apache/tika/extractor/ContainerExtractor;

.field private final handler:Lorg/apache/tika/extractor/EmbeddedResourceHandler;

.field final synthetic this$0:Lorg/apache/tika/extractor/ParserContainerExtractor;


# direct methods
.method private constructor <init>(Lorg/apache/tika/extractor/ParserContainerExtractor;Lorg/apache/tika/parser/Parser;Lorg/apache/tika/extractor/ContainerExtractor;Lorg/apache/tika/extractor/EmbeddedResourceHandler;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lorg/apache/tika/extractor/ParserContainerExtractor$RecursiveParser;->this$0:Lorg/apache/tika/extractor/ParserContainerExtractor;

    .line 3
    invoke-direct {p0, p2}, Lorg/apache/tika/parser/StatefulParser;-><init>(Lorg/apache/tika/parser/Parser;)V

    .line 4
    iput-object p3, p0, Lorg/apache/tika/extractor/ParserContainerExtractor$RecursiveParser;->extractor:Lorg/apache/tika/extractor/ContainerExtractor;

    .line 5
    iput-object p4, p0, Lorg/apache/tika/extractor/ParserContainerExtractor$RecursiveParser;->handler:Lorg/apache/tika/extractor/EmbeddedResourceHandler;

    return-void
.end method

.method public synthetic constructor <init>(Lorg/apache/tika/extractor/ParserContainerExtractor;Lorg/apache/tika/parser/Parser;Lorg/apache/tika/extractor/ContainerExtractor;Lorg/apache/tika/extractor/EmbeddedResourceHandler;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lorg/apache/tika/extractor/ParserContainerExtractor$RecursiveParser;-><init>(Lorg/apache/tika/extractor/ParserContainerExtractor;Lorg/apache/tika/parser/Parser;Lorg/apache/tika/extractor/ContainerExtractor;Lorg/apache/tika/extractor/EmbeddedResourceHandler;)V

    return-void
.end method


# virtual methods
.method public getSupportedTypes(Lorg/apache/tika/parser/ParseContext;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/tika/parser/ParseContext;",
            ")",
            "Ljava/util/Set<",
            "Lorg/apache/tika/mime/MediaType;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/tika/extractor/ParserContainerExtractor$RecursiveParser;->this$0:Lorg/apache/tika/extractor/ParserContainerExtractor;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/extractor/ParserContainerExtractor;->b(Lorg/apache/tika/extractor/ParserContainerExtractor;)Lorg/apache/tika/parser/Parser;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1}, Lorg/apache/tika/parser/Parser;->getSupportedTypes(Lorg/apache/tika/parser/ParseContext;)Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public parse(Ljava/io/InputStream;Lorg/xml/sax/ContentHandler;Lorg/apache/tika/metadata/Metadata;Lorg/apache/tika/parser/ParseContext;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xml/sax/SAXException;,
            Lorg/apache/tika/exception/TikaException;
        }
    .end annotation

    .line 1
    new-instance p2, Lorg/apache/tika/io/TemporaryResources;

    .line 2
    .line 3
    invoke-direct {p2}, Lorg/apache/tika/io/TemporaryResources;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {p1, p2, p3}, Lorg/apache/tika/io/TikaInputStream;->get(Ljava/io/InputStream;Lorg/apache/tika/io/TemporaryResources;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/io/TikaInputStream;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string p4, "resourceName"

    .line 11
    .line 12
    invoke-virtual {p3, p4}, Lorg/apache/tika/metadata/Metadata;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p4

    .line 16
    iget-object v0, p0, Lorg/apache/tika/extractor/ParserContainerExtractor$RecursiveParser;->this$0:Lorg/apache/tika/extractor/ParserContainerExtractor;

    .line 17
    .line 18
    invoke-static {v0}, Lorg/apache/tika/extractor/ParserContainerExtractor;->a(Lorg/apache/tika/extractor/ParserContainerExtractor;)Lorg/apache/tika/detect/Detector;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0, p1, p3}, Lorg/apache/tika/detect/Detector;->detect(Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)Lorg/apache/tika/mime/MediaType;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    iget-object v0, p0, Lorg/apache/tika/extractor/ParserContainerExtractor$RecursiveParser;->extractor:Lorg/apache/tika/extractor/ContainerExtractor;

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, Lorg/apache/tika/extractor/ParserContainerExtractor$RecursiveParser;->handler:Lorg/apache/tika/extractor/EmbeddedResourceHandler;

    .line 31
    .line 32
    invoke-interface {v0, p4, p3, p1}, Lorg/apache/tika/extractor/EmbeddedResourceHandler;->handle(Ljava/lang/String;Lorg/apache/tika/mime/MediaType;Ljava/io/InputStream;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_2

    .line 38
    :cond_0
    invoke-virtual {p1}, Lorg/apache/tika/io/TikaInputStream;->getFile()Ljava/io/File;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lorg/apache/tika/io/TikaInputStream;->get(Ljava/io/File;)Lorg/apache/tika/io/TikaInputStream;

    .line 43
    .line 44
    .line 45
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    :try_start_1
    iget-object v1, p0, Lorg/apache/tika/extractor/ParserContainerExtractor$RecursiveParser;->handler:Lorg/apache/tika/extractor/EmbeddedResourceHandler;

    .line 47
    .line 48
    invoke-interface {v1, p4, p3, v0}, Lorg/apache/tika/extractor/EmbeddedResourceHandler;->handle(Ljava/lang/String;Lorg/apache/tika/mime/MediaType;Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 49
    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    :try_start_2
    invoke-virtual {v0}, Lorg/apache/tika/io/TikaInputStream;->close()V

    .line 54
    .line 55
    .line 56
    :cond_1
    iget-object p3, p0, Lorg/apache/tika/extractor/ParserContainerExtractor$RecursiveParser;->extractor:Lorg/apache/tika/extractor/ContainerExtractor;

    .line 57
    .line 58
    iget-object p4, p0, Lorg/apache/tika/extractor/ParserContainerExtractor$RecursiveParser;->handler:Lorg/apache/tika/extractor/EmbeddedResourceHandler;

    .line 59
    .line 60
    invoke-interface {p3, p1, p3, p4}, Lorg/apache/tika/extractor/ContainerExtractor;->extract(Lorg/apache/tika/io/TikaInputStream;Lorg/apache/tika/extractor/ContainerExtractor;Lorg/apache/tika/extractor/EmbeddedResourceHandler;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 61
    .line 62
    .line 63
    :goto_0
    invoke-virtual {p2}, Lorg/apache/tika/io/TemporaryResources;->dispose()V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :catchall_1
    move-exception p1

    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    :try_start_3
    invoke-virtual {v0}, Lorg/apache/tika/io/TikaInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :catchall_2
    move-exception p3

    .line 75
    :try_start_4
    invoke-virtual {p1, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    :goto_1
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 79
    :goto_2
    invoke-virtual {p2}, Lorg/apache/tika/io/TemporaryResources;->dispose()V

    .line 80
    .line 81
    .line 82
    throw p1
.end method
