.class public final LVa/d1;
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
    check-cast p1, Lcom/amazon/aps/ads/ApsAd;

    .line 7
    .line 8
    sget v0, LVa/x1;->U:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x43

    .line 11
    .line 12
    rem-int/lit16 v1, v0, 0x80

    .line 13
    .line 14
    sput v1, LVa/x1;->T:I

    .line 15
    .line 16
    rem-int/lit8 v0, v0, 0x2

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-static {p1}, LVa/x1;->Q0(Lcom/amazon/aps/ads/ApsAd;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    sget v0, LVa/x1;->T:I

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x2f

    .line 27
    .line 28
    rem-int/lit16 v1, v0, 0x80

    .line 29
    .line 30
    sput v1, LVa/x1;->U:I

    .line 31
    .line 32
    rem-int/lit8 v0, v0, 0x2

    .line 33
    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    const/16 v0, 0x17

    .line 37
    .line 38
    div-int/2addr v0, p2

    .line 39
    :cond_0
    return-object p1

    .line 40
    :cond_1
    invoke-static {p1}, LVa/x1;->Q0(Lcom/amazon/aps/ads/ApsAd;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    throw p1
.end method
