.class public final LVa/K0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-class p2, Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    .line 2
    .line 3
    sget v0, LVa/W0;->T:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x77

    .line 6
    .line 7
    rem-int/lit16 v0, v0, 0x80

    .line 8
    .line 9
    sput v0, LVa/W0;->U:I

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
    sget p2, LVa/W0;->T:I

    .line 17
    .line 18
    add-int/lit8 p2, p2, 0x4b

    .line 19
    .line 20
    rem-int/lit16 v0, p2, 0x80

    .line 21
    .line 22
    sput v0, LVa/W0;->U:I

    .line 23
    .line 24
    rem-int/lit8 p2, p2, 0x2

    .line 25
    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    check-cast p1, Lcom/google/android/gms/ads/reward/RewardedVideoAd;

    .line 29
    .line 30
    invoke-interface {p1}, Lcom/google/android/gms/ads/reward/RewardedVideoAd;->getAdMetadata()Landroid/os/Bundle;

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
