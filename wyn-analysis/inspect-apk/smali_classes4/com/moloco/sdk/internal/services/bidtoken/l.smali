.class public final Lcom/moloco/sdk/internal/services/bidtoken/l;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/moloco/sdk/internal/services/bidtoken/l;

    if-nez v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/moloco/sdk/internal/services/bidtoken/l;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v0
.end method

.method public final hashCode()I
    .locals 3

    const-wide/16 v0, 0xaf0

    long-to-int v0, v0

    mul-int/lit8 v0, v0, 0x1f

    add-int/lit8 v0, v0, 0x3

    mul-int/lit8 v0, v0, 0x1f

    const-wide/16 v1, 0xc8

    long-to-int v1, v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "BidTokenHttpRequestInfo(requestTimeoutMillis=2800, fetchRetryMax=3, fetchRetryDelayMillis=200)"

    return-object v0
.end method
