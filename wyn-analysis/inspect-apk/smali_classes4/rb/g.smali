.class public final Lrb/g;
.super Lx6/k;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lrb/g;->a:I

    iput-object p1, p0, Lrb/g;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdClicked()V
    .locals 1

    .line 1
    iget v0, p0, Lrb/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrb/g;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lvb/f;

    .line 9
    .line 10
    iget-object v0, v0, Lvb/f;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;

    .line 11
    .line 12
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/d;->onAdClicked()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lrb/g;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lvb/d;

    .line 19
    .line 20
    iget-object v0, v0, Lvb/d;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;

    .line 21
    .line 22
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/d;->onAdClicked()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object v0, p0, Lrb/g;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lrb/j;

    .line 29
    .line 30
    iget-object v0, v0, Lrb/j;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;

    .line 31
    .line 32
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/d;->onAdClicked()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_2
    iget-object v0, p0, Lrb/g;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lrb/h;

    .line 39
    .line 40
    iget-object v0, v0, Lrb/h;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;

    .line 41
    .line 42
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/d;->onAdClicked()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAdDismissedFullScreenContent()V
    .locals 1

    .line 1
    iget v0, p0, Lrb/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrb/g;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lvb/f;

    .line 9
    .line 10
    iget-object v0, v0, Lvb/f;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;

    .line 11
    .line 12
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/d;->onAdClosed()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lrb/g;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lvb/d;

    .line 19
    .line 20
    iget-object v0, v0, Lvb/d;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;

    .line 21
    .line 22
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/d;->onAdClosed()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object v0, p0, Lrb/g;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lrb/j;

    .line 29
    .line 30
    iget-object v0, v0, Lrb/j;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;

    .line 31
    .line 32
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/d;->onAdClosed()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_2
    iget-object v0, p0, Lrb/g;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lrb/h;

    .line 39
    .line 40
    iget-object v0, v0, Lrb/h;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;

    .line 41
    .line 42
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/d;->onAdClosed()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAdFailedToShowFullScreenContent(Lx6/a;)V
    .locals 2

    .line 1
    iget v0, p0, Lrb/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrb/g;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lvb/f;

    .line 9
    .line 10
    iget-object v0, v0, Lvb/f;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;

    .line 11
    .line 12
    invoke-virtual {p1}, Lx6/a;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget p1, p1, Lx6/a;->a:I

    .line 17
    .line 18
    invoke-virtual {v0, p1, v1}, Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;->onAdFailedToShow(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, Lrb/g;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lvb/d;

    .line 25
    .line 26
    iget-object v0, v0, Lvb/d;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;

    .line 27
    .line 28
    invoke-virtual {p1}, Lx6/a;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget p1, p1, Lx6/a;->a:I

    .line 33
    .line 34
    invoke-virtual {v0, p1, v1}, Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;->onAdFailedToShow(ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_1
    iget-object v0, p0, Lrb/g;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Lrb/j;

    .line 41
    .line 42
    iget-object v0, v0, Lrb/j;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;

    .line 43
    .line 44
    invoke-virtual {p1}, Lx6/a;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget p1, p1, Lx6/a;->a:I

    .line 49
    .line 50
    invoke-virtual {v0, p1, v1}, Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;->onAdFailedToShow(ILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_2
    iget-object v0, p0, Lrb/g;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lrb/h;

    .line 57
    .line 58
    iget-object v0, v0, Lrb/h;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;

    .line 59
    .line 60
    invoke-virtual {p1}, Lx6/a;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget p1, p1, Lx6/a;->a:I

    .line 65
    .line 66
    invoke-virtual {v0, p1, v1}, Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;->onAdFailedToShow(ILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAdImpression()V
    .locals 1

    .line 1
    iget v0, p0, Lrb/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrb/g;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lvb/f;

    .line 9
    .line 10
    iget-object v0, v0, Lvb/f;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;->onAdImpression()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lrb/g;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lvb/d;

    .line 19
    .line 20
    iget-object v0, v0, Lvb/d;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;->onAdImpression()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object v0, p0, Lrb/g;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lrb/j;

    .line 29
    .line 30
    iget-object v0, v0, Lrb/j;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;->onAdImpression()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_2
    iget-object v0, p0, Lrb/g;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lrb/h;

    .line 39
    .line 40
    iget-object v0, v0, Lrb/h;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;->onAdImpression()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAdShowedFullScreenContent()V
    .locals 1

    .line 1
    iget v0, p0, Lrb/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrb/g;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lvb/f;

    .line 9
    .line 10
    iget-object v0, v0, Lvb/f;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;

    .line 11
    .line 12
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/d;->onAdOpened()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lrb/g;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lvb/d;

    .line 19
    .line 20
    iget-object v0, v0, Lvb/d;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;

    .line 21
    .line 22
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/d;->onAdOpened()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object v0, p0, Lrb/g;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lrb/j;

    .line 29
    .line 30
    iget-object v0, v0, Lrb/j;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarRewardedAdHandler;

    .line 31
    .line 32
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/d;->onAdOpened()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_2
    iget-object v0, p0, Lrb/g;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lrb/h;

    .line 39
    .line 40
    iget-object v0, v0, Lrb/h;->c:Lcom/unity3d/services/ads/gmascar/handlers/ScarInterstitialAdHandler;

    .line 41
    .line 42
    invoke-interface {v0}, Lcom/unity3d/scar/adapter/common/d;->onAdOpened()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
