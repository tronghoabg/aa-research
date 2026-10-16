.class public final Lrb/d;
.super Lcom/google/android/gms/ads/AdListener;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lrb/d;->a:I

    iput-object p1, p0, Lrb/d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdClicked()V
    .locals 1

    .line 1
    iget v0, p0, Lrb/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lcom/google/android/gms/ads/AdListener;->onAdClicked()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lrb/d;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lvb/b;

    .line 12
    .line 13
    iget-object v0, v0, Lvb/b;->b:Lcom/unity3d/services/ads/gmascar/handlers/ScarBannerAdHandler;

    .line 14
    .line 15
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/d;->onAdClicked()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-super {p0}, Lcom/google/android/gms/ads/AdListener;->onAdClicked()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lrb/d;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lrb/e;

    .line 25
    .line 26
    iget-object v0, v0, Lrb/e;->b:Lcom/unity3d/services/ads/gmascar/handlers/ScarBannerAdHandler;

    .line 27
    .line 28
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/d;->onAdClicked()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onAdClosed()V
    .locals 1

    .line 1
    iget v0, p0, Lrb/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lcom/google/android/gms/ads/AdListener;->onAdClosed()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lrb/d;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lvb/b;

    .line 12
    .line 13
    iget-object v0, v0, Lvb/b;->b:Lcom/unity3d/services/ads/gmascar/handlers/ScarBannerAdHandler;

    .line 14
    .line 15
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/d;->onAdClosed()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-super {p0}, Lcom/google/android/gms/ads/AdListener;->onAdClosed()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lrb/d;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lrb/e;

    .line 25
    .line 26
    iget-object v0, v0, Lrb/e;->b:Lcom/unity3d/services/ads/gmascar/handlers/ScarBannerAdHandler;

    .line 27
    .line 28
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/d;->onAdClosed()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onAdFailedToLoad(Lx6/l;)V
    .locals 3

    .line 1
    iget v0, p0, Lrb/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrb/d;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lvb/b;

    .line 9
    .line 10
    iget-object v1, v0, Lvb/b;->c:Lvb/a;

    .line 11
    .line 12
    iget-object v2, v1, Lvb/a;->h:Lcom/unity3d/services/banners/BannerView;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v1, v1, Lvb/a;->k:Lx6/h;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, v0, Lvb/b;->b:Lcom/unity3d/services/ads/gmascar/handlers/ScarBannerAdHandler;

    .line 24
    .line 25
    iget-object v1, p1, Lx6/a;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget p1, p1, Lx6/a;->a:I

    .line 28
    .line 29
    invoke-interface {v0, p1, v1}, Lcom/unity3d/scar/adapter/common/d;->onAdFailedToLoad(ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    iget-object v0, p0, Lrb/d;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lrb/e;

    .line 36
    .line 37
    iget-object v1, v0, Lrb/e;->c:Lrb/c;

    .line 38
    .line 39
    iget-object v2, v1, Lrb/c;->h:Lcom/unity3d/services/banners/BannerView;

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    iget-object v1, v1, Lrb/c;->k:Lx6/h;

    .line 44
    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    iget-object v0, v0, Lrb/e;->b:Lcom/unity3d/services/ads/gmascar/handlers/ScarBannerAdHandler;

    .line 51
    .line 52
    iget-object v1, p1, Lx6/a;->b:Ljava/lang/String;

    .line 53
    .line 54
    iget p1, p1, Lx6/a;->a:I

    .line 55
    .line 56
    invoke-interface {v0, p1, v1}, Lcom/unity3d/scar/adapter/common/d;->onAdFailedToLoad(ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onAdImpression()V
    .locals 1

    .line 1
    iget v0, p0, Lrb/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lcom/google/android/gms/ads/AdListener;->onAdImpression()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lrb/d;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lvb/b;

    .line 12
    .line 13
    iget-object v0, v0, Lvb/b;->b:Lcom/unity3d/services/ads/gmascar/handlers/ScarBannerAdHandler;

    .line 14
    .line 15
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/f;->onAdImpression()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-super {p0}, Lcom/google/android/gms/ads/AdListener;->onAdImpression()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lrb/d;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lrb/e;

    .line 25
    .line 26
    iget-object v0, v0, Lrb/e;->b:Lcom/unity3d/services/ads/gmascar/handlers/ScarBannerAdHandler;

    .line 27
    .line 28
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/f;->onAdImpression()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onAdLoaded()V
    .locals 1

    .line 1
    iget v0, p0, Lrb/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lcom/google/android/gms/ads/AdListener;->onAdLoaded()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lrb/d;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lvb/b;

    .line 12
    .line 13
    iget-object v0, v0, Lvb/b;->b:Lcom/unity3d/services/ads/gmascar/handlers/ScarBannerAdHandler;

    .line 14
    .line 15
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/d;->onAdLoaded()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-super {p0}, Lcom/google/android/gms/ads/AdListener;->onAdLoaded()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lrb/d;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lrb/e;

    .line 25
    .line 26
    iget-object v0, v0, Lrb/e;->b:Lcom/unity3d/services/ads/gmascar/handlers/ScarBannerAdHandler;

    .line 27
    .line 28
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/d;->onAdLoaded()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onAdOpened()V
    .locals 1

    .line 1
    iget v0, p0, Lrb/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lcom/google/android/gms/ads/AdListener;->onAdOpened()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lrb/d;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lvb/b;

    .line 12
    .line 13
    iget-object v0, v0, Lvb/b;->b:Lcom/unity3d/services/ads/gmascar/handlers/ScarBannerAdHandler;

    .line 14
    .line 15
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/d;->onAdOpened()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-super {p0}, Lcom/google/android/gms/ads/AdListener;->onAdOpened()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lrb/d;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lrb/e;

    .line 25
    .line 26
    iget-object v0, v0, Lrb/e;->b:Lcom/unity3d/services/ads/gmascar/handlers/ScarBannerAdHandler;

    .line 27
    .line 28
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/d;->onAdOpened()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
