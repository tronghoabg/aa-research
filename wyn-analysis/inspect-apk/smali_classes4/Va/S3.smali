.class public final LVa/S3;
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
    check-cast v0, Lcom/mintegral/msdk/out/MTGBannerView;

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
    check-cast p1, Lcom/mintegral/msdk/out/BannerAdListener;

    .line 14
    .line 15
    sget v1, LVa/Z3;->X:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x57

    .line 18
    .line 19
    rem-int/lit16 v1, v1, 0x80

    .line 20
    .line 21
    sput v1, LVa/Z3;->W:I

    .line 22
    .line 23
    invoke-static {v0, p1}, LVa/Z3;->O0(Lcom/mintegral/msdk/out/MTGBannerView;Lcom/mintegral/msdk/out/BannerAdListener;)V

    .line 24
    .line 25
    .line 26
    sget p1, LVa/Z3;->W:I

    .line 27
    .line 28
    add-int/lit8 p1, p1, 0x79

    .line 29
    .line 30
    rem-int/lit16 v0, p1, 0x80

    .line 31
    .line 32
    sput v0, LVa/Z3;->X:I

    .line 33
    .line 34
    rem-int/lit8 p1, p1, 0x2

    .line 35
    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    const/16 p1, 0x2a

    .line 39
    .line 40
    div-int/2addr p1, p2

    .line 41
    :cond_0
    const/4 p1, 0x0

    .line 42
    return-object p1
.end method
