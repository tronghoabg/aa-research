.class public final LVa/G0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-class p2, Lcom/google/android/gms/ads/formats/UnifiedNativeAdView;

    .line 2
    .line 3
    sget v0, LVa/W0;->U:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x35

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
    add-int/lit8 p2, p2, 0x67

    .line 19
    .line 20
    rem-int/lit16 v1, p2, 0x80

    .line 21
    .line 22
    sput v1, LVa/W0;->T:I

    .line 23
    .line 24
    rem-int/lit8 p2, p2, 0x2

    .line 25
    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    const/16 p2, 0x3c

    .line 29
    .line 30
    div-int/2addr p2, v0

    .line 31
    :cond_0
    check-cast p1, Lcom/google/android/gms/ads/formats/UnifiedNativeAdView;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/google/android/gms/ads/formats/UnifiedNativeAdView;->getPriceView()Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
.end method
