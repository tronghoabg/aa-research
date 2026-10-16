.class public final LVa/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    check-cast p1, Lcom/amazon/device/ads/DTBAdSize;

    .line 7
    .line 8
    sget p2, LVa/x1;->T:I

    .line 9
    .line 10
    add-int/lit8 p2, p2, 0x45

    .line 11
    .line 12
    rem-int/lit16 v0, p2, 0x80

    .line 13
    .line 14
    sput v0, LVa/x1;->U:I

    .line 15
    .line 16
    rem-int/lit8 p2, p2, 0x2

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    invoke-static {p1}, LVa/x1;->M0(Lcom/amazon/device/ads/DTBAdSize;)Lcom/amazon/device/ads/AdType;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    sget p2, LVa/x1;->T:I

    .line 26
    .line 27
    add-int/lit8 p2, p2, 0x55

    .line 28
    .line 29
    rem-int/lit16 v1, p2, 0x80

    .line 30
    .line 31
    sput v1, LVa/x1;->U:I

    .line 32
    .line 33
    rem-int/lit8 p2, p2, 0x2

    .line 34
    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_0
    throw v0

    .line 39
    :cond_1
    invoke-static {p1}, LVa/x1;->M0(Lcom/amazon/device/ads/DTBAdSize;)Lcom/amazon/device/ads/AdType;

    .line 40
    .line 41
    .line 42
    throw v0
.end method
