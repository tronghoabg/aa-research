.class public final LVa/B0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-class p2, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;

    .line 2
    .line 3
    sget v0, LVa/W0;->T:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x1

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
    add-int/lit8 p2, p2, 0x1f

    .line 19
    .line 20
    rem-int/lit16 p2, p2, 0x80

    .line 21
    .line 22
    sput p2, LVa/W0;->U:I

    .line 23
    .line 24
    check-cast p1, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->getAdSize()Lcom/google/android/gms/ads/AdSize;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
.end method
