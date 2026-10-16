.class public final Lwb/a;
.super La/a;
.source "SourceFile"


# instance fields
.field public b:Ltc/j;


# virtual methods
.method public final v(Landroid/content/Context;Ljava/lang/String;Lnb/d;LA/x;Lh9/c;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lwb/a;->b:Ltc/j;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    invoke-direct {v1, v2}, LA7/B0;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Ltc/j;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LD6/c1;

    .line 13
    .line 14
    iget-object v0, v0, LD6/c1;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, LA7/B0;->V(Ljava/lang/String;)LA7/B0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 21
    .line 22
    new-instance v1, Landroid/os/Bundle;

    .line 23
    .line 24
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v2, "query_info_type"

    .line 28
    .line 29
    const-string v3, "requester_type_5"

    .line 30
    .line 31
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-class v2, Lcom/google/ads/mediation/admob/AdMobAdapter;

    .line 35
    .line 36
    invoke-virtual {v0, v2, v1}, LA7/B0;->x(Ljava/lang/Class;Landroid/os/Bundle;)LA7/B0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 41
    .line 42
    new-instance v1, Lx6/g;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Lx6/g;-><init>(LA7/B0;)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Lsb/a;

    .line 48
    .line 49
    new-instance v2, Lba/a;

    .line 50
    .line 51
    const/16 v3, 0x11

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    invoke-direct {v2, p4, v4, p5, v3}, Lba/a;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 55
    .line 56
    .line 57
    const/4 p4, 0x1

    .line 58
    invoke-direct {v0, p4}, Lsb/a;-><init>(I)V

    .line 59
    .line 60
    .line 61
    iput-object p2, v0, Lsb/a;->b:Ljava/lang/String;

    .line 62
    .line 63
    iput-object v2, v0, Lsb/a;->c:Ljava/lang/Object;

    .line 64
    .line 65
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    const/4 p3, 0x2

    .line 70
    if-eq p2, p3, :cond_1

    .line 71
    .line 72
    const/4 p3, 0x3

    .line 73
    if-eq p2, p3, :cond_0

    .line 74
    .line 75
    sget-object p2, Lx6/b;->c:Lx6/b;

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    sget-object p2, Lx6/b;->b:Lx6/b;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    sget-object p2, Lx6/b;->d:Lx6/b;

    .line 82
    .line 83
    :goto_0
    invoke-static {p1, p2, v1, v0}, LQ6/a;->a(Landroid/content/Context;Lx6/b;Lx6/g;LQ6/b;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final w(Landroid/content/Context;Lnb/d;LA/x;Lh9/c;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_2

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    const-string v0, ""

    .line 15
    .line 16
    :goto_0
    move-object v1, p0

    .line 17
    move-object v2, p1

    .line 18
    move-object v4, p2

    .line 19
    move-object v5, p3

    .line 20
    move-object v6, p4

    .line 21
    move-object v3, v0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const-string v0, "gmaScarBiddingBannerSignal"

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const-string v0, "gmaScarBiddingRewardedSignal"

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    const-string v0, "gmaScarBiddingInterstitialSignal"

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :goto_1
    invoke-virtual/range {v1 .. v6}, Lwb/a;->v(Landroid/content/Context;Ljava/lang/String;Lnb/d;LA/x;Lh9/c;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
