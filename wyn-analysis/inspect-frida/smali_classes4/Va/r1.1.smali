.class public final LVa/r1;
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
    move-result-object v0

    .line 6
    check-cast v0, Lcom/amazon/device/ads/DTBAdResponse;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/amazon/device/ads/DTBAdSize;

    .line 14
    .line 15
    sget v1, LVa/x1;->T:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x5f

    .line 18
    .line 19
    rem-int/lit16 v1, v1, 0x80

    .line 20
    .line 21
    sput v1, LVa/x1;->U:I

    .line 22
    .line 23
    invoke-static {v0, p1}, LVa/x1;->X0(Lcom/amazon/device/ads/DTBAdResponse;Lcom/amazon/device/ads/DTBAdSize;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    sget v0, LVa/x1;->T:I

    .line 28
    .line 29
    add-int/lit8 v0, v0, 0x2d

    .line 30
    .line 31
    rem-int/lit16 v1, v0, 0x80

    .line 32
    .line 33
    sput v1, LVa/x1;->U:I

    .line 34
    .line 35
    rem-int/lit8 v0, v0, 0x2

    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    const/16 v0, 0x2b

    .line 40
    .line 41
    div-int/2addr v0, p2

    .line 42
    :cond_0
    return-object p1
.end method
