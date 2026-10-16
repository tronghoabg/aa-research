.class public final Lpb/b;
.super LCa/d;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/unity3d/scar/adapter/common/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Lpb/b;->e:I

    invoke-direct {p0, p1}, LCa/d;-><init>(Lcom/unity3d/scar/adapter/common/c;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lnb/c;Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;)V
    .locals 6

    .line 1
    iget v0, p0, Lpb/b;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lvb/c;

    .line 7
    .line 8
    iget-object v1, p0, Lpb/b;->f:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v3, v1

    .line 11
    check-cast v3, Ltc/j;

    .line 12
    .line 13
    iget-object v1, p0, LCa/d;->d:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v4, v1

    .line 16
    check-cast v4, Lcom/unity3d/scar/adapter/common/c;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    move-object v1, p1

    .line 20
    move-object v2, p2

    .line 21
    invoke-direct/range {v0 .. v5}, Lvb/c;-><init>(Landroid/content/Context;Lnb/c;Ltc/j;Lcom/unity3d/scar/adapter/common/c;I)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lvb/d;

    .line 25
    .line 26
    invoke-direct {v1, p3, v0}, Lvb/d;-><init>(Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;Lvb/c;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, v0, Lrb/a;->g:Ljava/lang/Object;

    .line 30
    .line 31
    new-instance v1, Lpb/a;

    .line 32
    .line 33
    const/4 v3, 0x5

    .line 34
    invoke-direct {v1, p0, v0, p2, v3}, Lpb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, LFe/e;->Q(Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_0
    new-instance v0, Lrb/f;

    .line 42
    .line 43
    iget-object v1, p0, Lpb/b;->f:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v3, v1

    .line 46
    check-cast v3, Lad/L;

    .line 47
    .line 48
    iget-object v1, p0, LCa/d;->d:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v4, v1

    .line 51
    check-cast v4, Lcom/unity3d/scar/adapter/common/c;

    .line 52
    .line 53
    const/4 v5, 0x0

    .line 54
    move-object v1, p1

    .line 55
    move-object v2, p2

    .line 56
    invoke-direct/range {v0 .. v5}, Lrb/f;-><init>(Landroid/content/Context;Lnb/c;Lad/L;Lcom/unity3d/scar/adapter/common/c;I)V

    .line 57
    .line 58
    .line 59
    new-instance v1, Lrb/h;

    .line 60
    .line 61
    invoke-direct {v1, p3, v0}, Lrb/h;-><init>(Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;Lrb/f;)V

    .line 62
    .line 63
    .line 64
    iput-object v1, v0, Lrb/a;->g:Ljava/lang/Object;

    .line 65
    .line 66
    new-instance v1, Lpb/a;

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    invoke-direct {v1, p0, v0, p2, v3}, Lpb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 70
    .line 71
    .line 72
    invoke-static {v1}, LFe/e;->Q(Ljava/lang/Runnable;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Landroid/content/Context;Lcom/unity3d/services/banners/BannerView;Lnb/c;IILcom/unity3d/services/ads/gmascar/handlers/ScarBannerAdHandler;)V
    .locals 8

    .line 1
    move v6, p5

    .line 2
    move-object v7, p6

    .line 3
    iget v0, p0, Lpb/b;->e:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lvb/a;

    .line 9
    .line 10
    iget-object v1, p0, Lpb/b;->f:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v3, v1

    .line 13
    check-cast v3, Ltc/j;

    .line 14
    .line 15
    iget-object v1, p0, LCa/d;->d:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v4, v1

    .line 18
    check-cast v4, Lcom/unity3d/scar/adapter/common/c;

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    move-object v1, p1

    .line 22
    move-object v2, p3

    .line 23
    invoke-direct/range {v0 .. v5}, Lrb/a;-><init>(Landroid/content/Context;Lnb/c;Ljava/lang/Object;Lcom/unity3d/scar/adapter/common/c;I)V

    .line 24
    .line 25
    .line 26
    iput-object p2, v0, Lvb/a;->h:Lcom/unity3d/services/banners/BannerView;

    .line 27
    .line 28
    iput p4, v0, Lvb/a;->i:I

    .line 29
    .line 30
    iput v6, v0, Lvb/a;->j:I

    .line 31
    .line 32
    new-instance v2, Lx6/h;

    .line 33
    .line 34
    invoke-direct {v2, p1}, Lx6/h;-><init>(Landroid/content/Context;)V

    .line 35
    .line 36
    .line 37
    iput-object v2, v0, Lvb/a;->k:Lx6/h;

    .line 38
    .line 39
    new-instance v1, Lvb/b;

    .line 40
    .line 41
    invoke-direct {v1, p6, v0}, Lvb/b;-><init>(Lcom/unity3d/services/ads/gmascar/handlers/ScarBannerAdHandler;Lvb/a;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, v0, Lrb/a;->g:Ljava/lang/Object;

    .line 45
    .line 46
    new-instance v1, Lg5/d;

    .line 47
    .line 48
    const/16 v2, 0x1a

    .line 49
    .line 50
    invoke-direct {v1, v0, v2}, Lg5/d;-><init>(Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    invoke-static {v1}, LFe/e;->Q(Ljava/lang/Runnable;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_0
    new-instance v0, Lrb/c;

    .line 58
    .line 59
    iget-object v2, p0, Lpb/b;->f:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v3, v2

    .line 62
    check-cast v3, Lad/L;

    .line 63
    .line 64
    iget-object v2, p0, LCa/d;->d:Ljava/lang/Object;

    .line 65
    .line 66
    move-object v4, v2

    .line 67
    check-cast v4, Lcom/unity3d/scar/adapter/common/c;

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    move-object v1, p1

    .line 71
    move-object v2, p3

    .line 72
    invoke-direct/range {v0 .. v5}, Lrb/a;-><init>(Landroid/content/Context;Lnb/c;Ljava/lang/Object;Lcom/unity3d/scar/adapter/common/c;I)V

    .line 73
    .line 74
    .line 75
    iput-object p2, v0, Lrb/c;->h:Lcom/unity3d/services/banners/BannerView;

    .line 76
    .line 77
    iput p4, v0, Lrb/c;->i:I

    .line 78
    .line 79
    iput v6, v0, Lrb/c;->j:I

    .line 80
    .line 81
    new-instance v2, Lx6/h;

    .line 82
    .line 83
    invoke-direct {v2, p1}, Lx6/h;-><init>(Landroid/content/Context;)V

    .line 84
    .line 85
    .line 86
    iput-object v2, v0, Lrb/c;->k:Lx6/h;

    .line 87
    .line 88
    new-instance v1, Lrb/e;

    .line 89
    .line 90
    invoke-direct {v1, p6, v0}, Lrb/e;-><init>(Lcom/unity3d/services/ads/gmascar/handlers/ScarBannerAdHandler;Lrb/c;)V

    .line 91
    .line 92
    .line 93
    iput-object v1, v0, Lrb/a;->g:Ljava/lang/Object;

    .line 94
    .line 95
    new-instance v1, Lg5/d;

    .line 96
    .line 97
    const/16 v2, 0x10

    .line 98
    .line 99
    invoke-direct {v1, v0, v2}, Lg5/d;-><init>(Ljava/lang/Object;I)V

    .line 100
    .line 101
    .line 102
    invoke-static {v1}, LFe/e;->Q(Ljava/lang/Runnable;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Landroid/content/Context;Lnb/c;Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;)V
    .locals 6

    .line 1
    iget v0, p0, Lpb/b;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lvb/c;

    .line 7
    .line 8
    iget-object v1, p0, Lpb/b;->f:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v3, v1

    .line 11
    check-cast v3, Ltc/j;

    .line 12
    .line 13
    iget-object v1, p0, LCa/d;->d:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v4, v1

    .line 16
    check-cast v4, Lcom/unity3d/scar/adapter/common/c;

    .line 17
    .line 18
    const/4 v5, 0x1

    .line 19
    move-object v1, p1

    .line 20
    move-object v2, p2

    .line 21
    invoke-direct/range {v0 .. v5}, Lvb/c;-><init>(Landroid/content/Context;Lnb/c;Ltc/j;Lcom/unity3d/scar/adapter/common/c;I)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lvb/f;

    .line 25
    .line 26
    invoke-direct {v1, p3, v0}, Lvb/f;-><init>(Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;Lvb/c;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, v0, Lrb/a;->g:Ljava/lang/Object;

    .line 30
    .line 31
    new-instance v1, Lpb/a;

    .line 32
    .line 33
    const/4 v3, 0x6

    .line 34
    invoke-direct {v1, p0, v0, p2, v3}, Lpb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, LFe/e;->Q(Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_0
    new-instance v0, Lrb/f;

    .line 42
    .line 43
    iget-object v1, p0, Lpb/b;->f:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v3, v1

    .line 46
    check-cast v3, Lad/L;

    .line 47
    .line 48
    iget-object v1, p0, LCa/d;->d:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v4, v1

    .line 51
    check-cast v4, Lcom/unity3d/scar/adapter/common/c;

    .line 52
    .line 53
    const/4 v5, 0x1

    .line 54
    move-object v1, p1

    .line 55
    move-object v2, p2

    .line 56
    invoke-direct/range {v0 .. v5}, Lrb/f;-><init>(Landroid/content/Context;Lnb/c;Lad/L;Lcom/unity3d/scar/adapter/common/c;I)V

    .line 57
    .line 58
    .line 59
    new-instance v1, Lrb/j;

    .line 60
    .line 61
    invoke-direct {v1, p3, v0}, Lrb/j;-><init>(Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;Lrb/f;)V

    .line 62
    .line 63
    .line 64
    iput-object v1, v0, Lrb/a;->g:Ljava/lang/Object;

    .line 65
    .line 66
    new-instance v1, Lpb/a;

    .line 67
    .line 68
    const/4 v3, 0x1

    .line 69
    invoke-direct {v1, p0, v0, p2, v3}, Lpb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 70
    .line 71
    .line 72
    invoke-static {v1}, LFe/e;->Q(Ljava/lang/Runnable;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
