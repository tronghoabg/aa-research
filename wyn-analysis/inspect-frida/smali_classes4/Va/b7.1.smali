.class public final LVa/b7;
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
    move-result-object p2

    .line 6
    check-cast p2, Lcom/yandex/mobile/ads/common/VideoController;

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
    check-cast p1, Lcom/yandex/mobile/ads/common/VideoEventListener;

    .line 14
    .line 15
    sget v0, LVa/e7;->T:I

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x4d

    .line 18
    .line 19
    rem-int/lit16 v1, v0, 0x80

    .line 20
    .line 21
    sput v1, LVa/e7;->S:I

    .line 22
    .line 23
    rem-int/lit8 v0, v0, 0x2

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-static {p2, p1}, LVa/e7;->H0(Lcom/yandex/mobile/ads/common/VideoController;Lcom/yandex/mobile/ads/common/VideoEventListener;)V

    .line 27
    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    sget p1, LVa/e7;->S:I

    .line 32
    .line 33
    add-int/lit8 p1, p1, 0x5d

    .line 34
    .line 35
    rem-int/lit16 p2, p1, 0x80

    .line 36
    .line 37
    sput p2, LVa/e7;->T:I

    .line 38
    .line 39
    rem-int/lit8 p1, p1, 0x2

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    return-object v1

    .line 44
    :cond_0
    throw v1

    .line 45
    :cond_1
    throw v1
.end method
