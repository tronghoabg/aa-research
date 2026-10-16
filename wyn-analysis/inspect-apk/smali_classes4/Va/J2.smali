.class public final LVa/J2;
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
    check-cast p1, Lcom/fyber/fairbid/ads/interstitial/InterstitialListener;

    .line 7
    .line 8
    sget v0, LVa/a3;->S:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x1b

    .line 11
    .line 12
    rem-int/lit16 v1, v0, 0x80

    .line 13
    .line 14
    sput v1, LVa/a3;->T:I

    .line 15
    .line 16
    rem-int/lit8 v0, v0, 0x2

    .line 17
    .line 18
    invoke-static {p1}, LVa/a3;->W0(Lcom/fyber/fairbid/ads/interstitial/InterstitialListener;)V

    .line 19
    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    const/16 p1, 0x55

    .line 24
    .line 25
    div-int/2addr p1, p2

    .line 26
    :cond_0
    sget p1, LVa/a3;->S:I

    .line 27
    .line 28
    add-int/lit8 p1, p1, 0x73

    .line 29
    .line 30
    rem-int/lit16 p2, p1, 0x80

    .line 31
    .line 32
    sput p2, LVa/a3;->T:I

    .line 33
    .line 34
    rem-int/lit8 p1, p1, 0x2

    .line 35
    .line 36
    const/4 p2, 0x0

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    return-object p2

    .line 40
    :cond_1
    throw p2
.end method
