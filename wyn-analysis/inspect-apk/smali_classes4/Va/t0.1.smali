.class public final LVa/t0;
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
    add-int/lit8 v0, v0, 0x31

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
    invoke-static {p1, v1, p2}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget p2, LVa/W0;->U:I

    .line 19
    .line 20
    add-int/lit8 p2, p2, 0x5

    .line 21
    .line 22
    rem-int/lit16 p2, p2, 0x80

    .line 23
    .line 24
    sput p2, LVa/W0;->T:I

    .line 25
    .line 26
    check-cast p1, Lcom/google/android/gms/ads/formats/NativeContentAdView;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/google/android/gms/ads/formats/NativeContentAdView;->getImageView()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
.end method
