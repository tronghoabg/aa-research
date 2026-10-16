.class public Lorg/apache/tika/pipes/async/OfferLargerThanQueueSize;
.super Ljava/lang/IllegalArgumentException;
.source "SourceFile"


# instance fields
.field private final queueSize:I

.field private final sizeOffered:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lorg/apache/tika/pipes/async/OfferLargerThanQueueSize;->sizeOffered:I

    .line 5
    .line 6
    iput p2, p0, Lorg/apache/tika/pipes/async/OfferLargerThanQueueSize;->queueSize:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Lorg/apache/tika/pipes/async/OfferLargerThanQueueSize;->sizeOffered:I

    .line 2
    .line 3
    iget v1, p0, Lorg/apache/tika/pipes/async/OfferLargerThanQueueSize;->queueSize:I

    .line 4
    .line 5
    const-string v2, "sizeOffered ("

    .line 6
    .line 7
    const-string v3, ") is greater than queue size ("

    .line 8
    .line 9
    const-string v4, ")"

    .line 10
    .line 11
    invoke-static {v2, v0, v3, v1, v4}, LN0/a;->e(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public getQueueSize()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/pipes/async/OfferLargerThanQueueSize;->queueSize:I

    .line 2
    .line 3
    return v0
.end method

.method public getSizeOffered()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/pipes/async/OfferLargerThanQueueSize;->sizeOffered:I

    .line 2
    .line 3
    return v0
.end method
