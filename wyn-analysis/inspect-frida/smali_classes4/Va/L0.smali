.class public final LVa/L0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget p2, LVa/W0;->T:I

    .line 2
    .line 3
    add-int/lit8 p2, p2, 0x25

    .line 4
    .line 5
    rem-int/lit16 p2, p2, 0x80

    .line 6
    .line 7
    sput p2, LVa/W0;->U:I

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    const-class v0, Lx6/h;

    .line 11
    .line 12
    invoke-static {p1, p2, v0}, LVa/pb;->U(Ljava/util/List;ILjava/lang/Class;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget p2, LVa/W0;->T:I

    .line 17
    .line 18
    add-int/lit8 p2, p2, 0x47

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
    check-cast p1, Lx6/h;

    .line 29
    .line 30
    invoke-virtual {p1}, Lx6/h;->getVideoController()Lcom/google/android/gms/ads/VideoController;

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
