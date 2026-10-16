.class abstract Lorg/apache/tika/utils/XMLReaderUtils$PoolSAXParser;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/utils/XMLReaderUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "PoolSAXParser"
.end annotation


# instance fields
.field final poolGeneration:I

.field final saxParser:Ljavax/xml/parsers/SAXParser;


# direct methods
.method public constructor <init>(ILjavax/xml/parsers/SAXParser;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lorg/apache/tika/utils/XMLReaderUtils$PoolSAXParser;->poolGeneration:I

    .line 5
    .line 6
    iput-object p2, p0, Lorg/apache/tika/utils/XMLReaderUtils$PoolSAXParser;->saxParser:Ljavax/xml/parsers/SAXParser;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getGeneration()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/utils/XMLReaderUtils$PoolSAXParser;->poolGeneration:I

    .line 2
    .line 3
    return v0
.end method

.method public getSAXParser()Ljavax/xml/parsers/SAXParser;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/utils/XMLReaderUtils$PoolSAXParser;->saxParser:Ljavax/xml/parsers/SAXParser;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract reset()V
.end method
