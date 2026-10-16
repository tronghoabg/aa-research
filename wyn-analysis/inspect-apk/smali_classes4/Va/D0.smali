.class public final LVa/D0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-class p2, Lcom/google/android/gms/ads/formats/UnifiedNativeAdView;

    .line 2
    .line 3
    sget v0, LVa/W0;->U:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x55

    .line 6
    .line 7
    rem-int/lit16 v0, v0, 0x80

    .line 8
    .line 9
    sput v0, LVa/W0;->T:I

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p1, v0, p2}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget p2, LVa/W0;->U:I

    .line 17
    .line 18
    add-int/lit8 p2, p2, 0x1b

    .line 19
    .line 20
    rem-int/lit16 v0, p2, 0x80

    .line 21
    .line 22
    sput v0, LVa/W0;->T:I

    .line 23
    .line 24
    rem-int/lit8 p2, p2, 0x2

    .line 25
    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    check-cast p1, Lcom/google/android/gms/ads/formats/UnifiedNativeAdView;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/google/android/gms/ads/formats/UnifiedNativeAdView;->getStarRatingView()Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :cond_0
    const/4 p1, 0x0

    .line 36
    throw p1
.end method
