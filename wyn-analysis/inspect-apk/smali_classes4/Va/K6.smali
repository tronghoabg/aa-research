.class public final LVa/K6;
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
    move-result-object p2

    .line 6
    check-cast p2, Lcom/unity3d/services/banners/BannerView;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/unity3d/services/banners/BannerView$IListener;

    .line 14
    .line 15
    sget v0, LVa/P6;->U:I

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x45

    .line 18
    .line 19
    rem-int/lit16 v0, v0, 0x80

    .line 20
    .line 21
    sput v0, LVa/P6;->T:I

    .line 22
    .line 23
    invoke-virtual {p2, p1}, Lcom/unity3d/services/banners/BannerView;->setListener(Lcom/unity3d/services/banners/BannerView$IListener;)V

    .line 24
    .line 25
    .line 26
    sget p1, LVa/P6;->U:I

    .line 27
    .line 28
    add-int/lit8 p1, p1, 0x75

    .line 29
    .line 30
    rem-int/lit16 p2, p1, 0x80

    .line 31
    .line 32
    sput p2, LVa/P6;->T:I

    .line 33
    .line 34
    rem-int/lit8 p1, p1, 0x2

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    if-nez p1, :cond_0

    .line 38
    .line 39
    add-int/lit8 p2, p2, 0x79

    .line 40
    .line 41
    rem-int/lit16 p2, p2, 0x80

    .line 42
    .line 43
    sput p2, LVa/P6;->U:I

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_0
    throw v0
.end method
