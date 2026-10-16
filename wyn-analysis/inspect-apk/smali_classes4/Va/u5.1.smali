.class public final LVa/u5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    check-cast v0, Lio/presage/interstitial/optinvideo/PresageOptinVideo;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lio/presage/interstitial/optinvideo/PresageOptinVideoCallback;

    .line 14
    .line 15
    sget v1, LVa/v5;->T:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x2f

    .line 18
    .line 19
    rem-int/lit16 v2, v1, 0x80

    .line 20
    .line 21
    sput v2, LVa/v5;->U:I

    .line 22
    .line 23
    rem-int/lit8 v1, v1, 0x2

    .line 24
    .line 25
    invoke-static {v0, p1}, LVa/v5;->E0(Lio/presage/interstitial/optinvideo/PresageOptinVideo;Lio/presage/interstitial/optinvideo/PresageOptinVideoCallback;)V

    .line 26
    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    const/16 p1, 0x56

    .line 31
    .line 32
    div-int/2addr p1, p2

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    return-object p1
.end method
