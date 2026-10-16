.class public final LVa/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-class p2, Lcom/google/android/gms/ads/formats/NativeContentAdView;

    .line 2
    .line 3
    sget v0, LVa/W0;->T:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x2b

    .line 6
    .line 7
    rem-int/lit16 v1, v0, 0x80

    .line 8
    .line 9
    sput v1, LVa/W0;->U:I

    .line 10
    .line 11
    rem-int/lit8 v0, v0, 0x2

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-static {p1, v0, p2}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {p1, v1, p2}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :goto_0
    sget p2, LVa/W0;->T:I

    .line 27
    .line 28
    add-int/lit8 p2, p2, 0x5

    .line 29
    .line 30
    rem-int/lit16 v0, p2, 0x80

    .line 31
    .line 32
    sput v0, LVa/W0;->U:I

    .line 33
    .line 34
    rem-int/lit8 p2, p2, 0x2

    .line 35
    .line 36
    if-nez p2, :cond_1

    .line 37
    .line 38
    const/16 p2, 0x32

    .line 39
    .line 40
    div-int/2addr p2, v1

    .line 41
    :cond_1
    check-cast p1, Lcom/google/android/gms/ads/formats/NativeContentAdView;

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/google/android/gms/ads/formats/NativeContentAdView;->getHeadlineView()Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1
.end method
