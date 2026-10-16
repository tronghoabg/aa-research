.class public final LVa/R0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-class p2, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;

    .line 2
    .line 3
    sget v0, LVa/W0;->U:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x59

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
    move-result-object p2

    .line 16
    sget v0, LVa/W0;->U:I

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x11

    .line 19
    .line 20
    rem-int/lit16 v0, v0, 0x80

    .line 21
    .line 22
    sput v0, LVa/W0;->T:I

    .line 23
    .line 24
    check-cast p2, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;

    .line 25
    .line 26
    sget v0, LVa/W0;->U:I

    .line 27
    .line 28
    add-int/lit8 v0, v0, 0x57

    .line 29
    .line 30
    rem-int/lit16 v0, v0, 0x80

    .line 31
    .line 32
    sput v0, LVa/W0;->T:I

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    const-class v1, Lcom/google/android/gms/ads/AdListener;

    .line 36
    .line 37
    invoke-static {p1, v0, v1}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    sget v0, LVa/W0;->T:I

    .line 42
    .line 43
    add-int/lit8 v0, v0, 0x6b

    .line 44
    .line 45
    rem-int/lit16 v1, v0, 0x80

    .line 46
    .line 47
    sput v1, LVa/W0;->U:I

    .line 48
    .line 49
    rem-int/lit8 v0, v0, 0x2

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    check-cast p1, Lcom/google/android/gms/ads/AdListener;

    .line 55
    .line 56
    invoke-virtual {p2, p1}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_0
    throw v1
.end method
