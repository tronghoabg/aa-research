.class public final Lsb/b;
.super La/a;
.source "SourceFile"


# instance fields
.field public b:Lad/L;


# virtual methods
.method public final n0(Lnb/d;)Lx6/b;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p1, v0, :cond_2

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    if-eq p1, v0, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x3

    .line 12
    if-eq p1, v0, :cond_0

    .line 13
    .line 14
    sget-object p1, Lx6/b;->UNKNOWN:Lx6/b;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    sget-object p1, Lx6/b;->b:Lx6/b;

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_1
    sget-object p1, Lx6/b;->d:Lx6/b;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_2
    sget-object p1, Lx6/b;->c:Lx6/b;

    .line 24
    .line 25
    return-object p1
.end method

.method public final v(Landroid/content/Context;Ljava/lang/String;Lnb/d;LA/x;Lh9/c;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lsb/b;->b:Lad/L;

    .line 2
    .line 3
    invoke-virtual {v0}, Lad/L;->n()Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v1, Lx6/g;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lx6/g;-><init>(LA7/B0;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lsb/a;

    .line 16
    .line 17
    new-instance v2, Lba/a;

    .line 18
    .line 19
    const/16 v3, 0x11

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v2, p4, v4, p5, v3}, Lba/a;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    const/4 p4, 0x0

    .line 26
    invoke-direct {v0, p4}, Lsb/a;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object p2, v0, Lsb/a;->b:Ljava/lang/String;

    .line 30
    .line 31
    iput-object v2, v0, Lsb/a;->c:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-virtual {p0, p3}, Lsb/b;->n0(Lnb/d;)Lx6/b;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-static {p1, p2, v1, v0}, LQ6/a;->a(Landroid/content/Context;Lx6/b;Lx6/g;LQ6/b;)V

    .line 38
    .line 39
    .line 40
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
    invoke-virtual/range {v1 .. v6}, Lsb/b;->v(Landroid/content/Context;Ljava/lang/String;Lnb/d;LA/x;Lh9/c;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
