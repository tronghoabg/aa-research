.class public final Lcom/moloco/sdk/internal/publisher/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/publisher/RewardedInterstitialAdShowListener;
.implements Lcom/moloco/sdk/publisher/AdShowListener;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/ads/nativead/l;

.field public final b:Lcom/moloco/sdk/publisher/RewardedInterstitialAdShowListener;

.field public final c:Lcom/moloco/sdk/internal/publisher/f;

.field public final d:Lcom/moloco/sdk/internal/B;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/publisher/RewardedInterstitialAdShowListener;Lcom/moloco/sdk/internal/publisher/f;Lcom/moloco/sdk/internal/B;)V
    .locals 2

    .line 1
    const-string v0, "sdkEventUrlTracker"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/google/android/gms/ads/nativead/l;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/ads/nativead/l;-><init>(Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/moloco/sdk/internal/publisher/i;->a:Lcom/google/android/gms/ads/nativead/l;

    .line 16
    .line 17
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/i;->b:Lcom/moloco/sdk/publisher/RewardedInterstitialAdShowListener;

    .line 18
    .line 19
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/i;->c:Lcom/moloco/sdk/internal/publisher/f;

    .line 20
    .line 21
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/i;->d:Lcom/moloco/sdk/internal/B;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final onAdClicked(Lcom/moloco/sdk/publisher/MolocoAd;)V
    .locals 1

    const-string v0, "molocoAd"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/i;->a:Lcom/google/android/gms/ads/nativead/l;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/nativead/l;->onAdClicked(Lcom/moloco/sdk/publisher/MolocoAd;)V

    return-void
.end method

.method public final onAdHidden(Lcom/moloco/sdk/publisher/MolocoAd;)V
    .locals 1

    const-string v0, "molocoAd"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/i;->a:Lcom/google/android/gms/ads/nativead/l;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/nativead/l;->onAdHidden(Lcom/moloco/sdk/publisher/MolocoAd;)V

    return-void
.end method

.method public final onAdShowFailed(Lcom/moloco/sdk/publisher/MolocoAdError;)V
    .locals 1

    .line 1
    const-string v0, "molocoAdError"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/i;->b:Lcom/moloco/sdk/publisher/RewardedInterstitialAdShowListener;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0, p1}, Lcom/moloco/sdk/publisher/AdShowListener;->onAdShowFailed(Lcom/moloco/sdk/publisher/MolocoAdError;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final onAdShowSuccess(Lcom/moloco/sdk/publisher/MolocoAd;)V
    .locals 1

    const-string v0, "molocoAd"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/i;->a:Lcom/google/android/gms/ads/nativead/l;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/nativead/l;->onAdShowSuccess(Lcom/moloco/sdk/publisher/MolocoAd;)V

    return-void
.end method

.method public final onRewardedVideoCompleted(Lcom/moloco/sdk/publisher/MolocoAd;)V
    .locals 5

    .line 1
    const-string v0, "molocoAd"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/i;->c:Lcom/moloco/sdk/internal/publisher/f;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/publisher/f;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/moloco/sdk/internal/ortb/model/d;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, v0, Lcom/moloco/sdk/internal/ortb/model/d;->j:Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    const/4 v3, 0x0

    .line 25
    iget-object v4, p0, Lcom/moloco/sdk/internal/publisher/i;->d:Lcom/moloco/sdk/internal/B;

    .line 26
    .line 27
    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/moloco/sdk/internal/B;->a(Ljava/lang/String;JLcom/moloco/sdk/internal/r;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/i;->b:Lcom/moloco/sdk/publisher/RewardedInterstitialAdShowListener;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-interface {v0, p1}, Lcom/moloco/sdk/publisher/RewardedInterstitialAdShowListener;->onRewardedVideoCompleted(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public final onRewardedVideoStarted(Lcom/moloco/sdk/publisher/MolocoAd;)V
    .locals 5

    .line 1
    const-string v0, "molocoAd"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/i;->c:Lcom/moloco/sdk/internal/publisher/f;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/publisher/f;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/moloco/sdk/internal/ortb/model/d;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, v0, Lcom/moloco/sdk/internal/ortb/model/d;->i:Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    const/4 v3, 0x0

    .line 25
    iget-object v4, p0, Lcom/moloco/sdk/internal/publisher/i;->d:Lcom/moloco/sdk/internal/B;

    .line 26
    .line 27
    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/moloco/sdk/internal/B;->a(Ljava/lang/String;JLcom/moloco/sdk/internal/r;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/i;->b:Lcom/moloco/sdk/publisher/RewardedInterstitialAdShowListener;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-interface {v0, p1}, Lcom/moloco/sdk/publisher/RewardedInterstitialAdShowListener;->onRewardedVideoStarted(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public final onUserRewarded(Lcom/moloco/sdk/publisher/MolocoAd;)V
    .locals 5

    .line 1
    const-string v0, "molocoAd"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/i;->c:Lcom/moloco/sdk/internal/publisher/f;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/publisher/f;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/moloco/sdk/internal/ortb/model/d;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, v0, Lcom/moloco/sdk/internal/ortb/model/d;->h:Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    const/4 v3, 0x0

    .line 25
    iget-object v4, p0, Lcom/moloco/sdk/internal/publisher/i;->d:Lcom/moloco/sdk/internal/B;

    .line 26
    .line 27
    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/moloco/sdk/internal/B;->a(Ljava/lang/String;JLcom/moloco/sdk/internal/r;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/i;->b:Lcom/moloco/sdk/publisher/RewardedInterstitialAdShowListener;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-interface {v0, p1}, Lcom/moloco/sdk/publisher/RewardedInterstitialAdShowListener;->onUserRewarded(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method
