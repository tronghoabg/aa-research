.class public final LVa/P2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    check-cast p1, Lcom/fyber/fairbid/ads/ImpressionData;

    .line 7
    .line 8
    sget p2, LVa/a3;->S:I

    .line 9
    .line 10
    add-int/lit8 p2, p2, 0x67

    .line 11
    .line 12
    rem-int/lit16 p2, p2, 0x80

    .line 13
    .line 14
    sput p2, LVa/a3;->T:I

    .line 15
    .line 16
    invoke-static {p1}, LVa/a3;->F0(Lcom/fyber/fairbid/ads/ImpressionData;)D

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    sget v0, LVa/a3;->T:I

    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x6b

    .line 23
    .line 24
    rem-int/lit16 v0, v0, 0x80

    .line 25
    .line 26
    sput v0, LVa/a3;->S:I

    .line 27
    .line 28
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
.end method
