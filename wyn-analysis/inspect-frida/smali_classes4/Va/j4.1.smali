.class public final LVa/j4;
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
    check-cast p1, Lcom/mbridge/msdk/out/RewardInfo;

    .line 7
    .line 8
    sget v0, LVa/z4;->W:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x63

    .line 11
    .line 12
    rem-int/lit16 v1, v0, 0x80

    .line 13
    .line 14
    sput v1, LVa/z4;->X:I

    .line 15
    .line 16
    rem-int/lit8 v0, v0, 0x2

    .line 17
    .line 18
    invoke-static {p1}, LVa/z4;->c1(Lcom/mbridge/msdk/out/RewardInfo;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    const/16 v0, 0x3f

    .line 25
    .line 26
    div-int/2addr v0, p2

    .line 27
    :cond_0
    sget p2, LVa/z4;->W:I

    .line 28
    .line 29
    add-int/lit8 p2, p2, 0x33

    .line 30
    .line 31
    rem-int/lit16 p2, p2, 0x80

    .line 32
    .line 33
    sput p2, LVa/z4;->X:I

    .line 34
    .line 35
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1
.end method
