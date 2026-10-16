.class public final Lcom/moloco/sdk/internal/publisher/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/publisher/RewardedInterstitialAdShowListener;


# instance fields
.field public final a:Lcom/moloco/sdk/internal/publisher/i;

.field public final b:Z

.field public final c:Lcom/moloco/sdk/internal/publisher/f;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Lcom/moloco/sdk/internal/publisher/f;

.field public final g:Lcom/moloco/sdk/acm/recorder/c;

.field public h:Z


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/publisher/i;ZLcom/moloco/sdk/internal/publisher/f;Ljava/lang/String;ZLcom/moloco/sdk/internal/publisher/f;Lcom/moloco/sdk/acm/recorder/c;)V
    .locals 1

    .line 1
    const-string v0, "adUnitId"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/h;->a:Lcom/moloco/sdk/internal/publisher/i;

    .line 10
    .line 11
    iput-boolean p2, p0, Lcom/moloco/sdk/internal/publisher/h;->b:Z

    .line 12
    .line 13
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/h;->c:Lcom/moloco/sdk/internal/publisher/f;

    .line 14
    .line 15
    iput-object p4, p0, Lcom/moloco/sdk/internal/publisher/h;->d:Ljava/lang/String;

    .line 16
    .line 17
    iput-boolean p5, p0, Lcom/moloco/sdk/internal/publisher/h;->e:Z

    .line 18
    .line 19
    iput-object p6, p0, Lcom/moloco/sdk/internal/publisher/h;->f:Lcom/moloco/sdk/internal/publisher/f;

    .line 20
    .line 21
    iput-object p7, p0, Lcom/moloco/sdk/internal/publisher/h;->g:Lcom/moloco/sdk/acm/recorder/c;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(Lcom/moloco/sdk/publisher/MolocoAd;)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/moloco/sdk/internal/publisher/h;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 6
    .line 7
    const-string v3, "issuing of reward is already handled"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v2, "RewardedInterstitialAdShowListenerImpl"

    .line 11
    .line 12
    const/4 v5, 0x4

    .line 13
    const/4 v6, 0x0

    .line 14
    invoke-static/range {v1 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lcom/moloco/sdk/internal/publisher/h;->h:Z

    .line 20
    .line 21
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/h;->c:Lcom/moloco/sdk/internal/publisher/f;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/publisher/f;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/h;->f:Lcom/moloco/sdk/internal/publisher/f;

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/moloco/sdk/internal/publisher/f;->invoke()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 42
    .line 43
    sget-object v1, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 44
    .line 45
    new-instance v2, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v3, "issuing of reward... creativeType: "

    .line 48
    .line 49
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    const-string v2, "RewardedInterstitialAdShowListenerImpl"

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    const/4 v5, 0x4

    .line 63
    const/4 v6, 0x0

    .line 64
    invoke-static/range {v1 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    new-instance v1, Lcom/moloco/sdk/acm/h;

    .line 68
    .line 69
    sget-object v2, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 70
    .line 71
    const-string v2, "reward_issued"

    .line 72
    .line 73
    invoke-direct {v1, v2}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    sget-object v2, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 77
    .line 78
    const-string v2, "toLowerCase(...)"

    .line 79
    .line 80
    if-eqz v0, :cond_1

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-eqz v0, :cond_1

    .line 87
    .line 88
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 89
    .line 90
    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    goto :goto_0

    .line 95
    :cond_1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 96
    .line 97
    const-string v3, "UNKNOWN"

    .line 98
    .line 99
    invoke-virtual {v3, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :goto_0
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const-string v2, "creative_type"

    .line 107
    .line 108
    invoke-virtual {v1, v2, v0}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/h;->g:Lcom/moloco/sdk/acm/recorder/c;

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, p1}, Lcom/moloco/sdk/internal/publisher/h;->onUserRewarded(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_2
    sget-object v2, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 121
    .line 122
    const-string v4, "reward can\'t be issued: ad was forcibly closed or ad was missing"

    .line 123
    .line 124
    const/4 v5, 0x0

    .line 125
    const-string v3, "RewardedInterstitialAdShowListenerImpl"

    .line 126
    .line 127
    const/4 v6, 0x4

    .line 128
    const/4 v7, 0x0

    .line 129
    invoke-static/range {v2 .. v7}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public final onAdClicked(Lcom/moloco/sdk/publisher/MolocoAd;)V
    .locals 1

    .line 1
    const-string v0, "molocoAd"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/h;->a:Lcom/moloco/sdk/internal/publisher/i;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/moloco/sdk/internal/publisher/i;->onAdClicked(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onAdHidden(Lcom/moloco/sdk/publisher/MolocoAd;)V
    .locals 1

    .line 1
    const-string v0, "molocoAd"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/moloco/sdk/internal/publisher/h;->a(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/h;->a:Lcom/moloco/sdk/internal/publisher/i;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/moloco/sdk/internal/publisher/i;->onAdHidden(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 12
    .line 13
    .line 14
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
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/h;->a:Lcom/moloco/sdk/internal/publisher/i;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/moloco/sdk/internal/publisher/i;->onAdShowFailed(Lcom/moloco/sdk/publisher/MolocoAdError;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onAdShowSuccess(Lcom/moloco/sdk/publisher/MolocoAd;)V
    .locals 1

    .line 1
    const-string v0, "molocoAd"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/h;->a:Lcom/moloco/sdk/internal/publisher/i;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/moloco/sdk/internal/publisher/i;->onAdShowSuccess(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/moloco/sdk/internal/publisher/h;->b:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/moloco/sdk/internal/publisher/h;->onRewardedVideoStarted(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final onRewardedVideoCompleted(Lcom/moloco/sdk/publisher/MolocoAd;)V
    .locals 1

    .line 1
    const-string v0, "molocoAd"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/moloco/sdk/internal/publisher/h;->a(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/h;->a:Lcom/moloco/sdk/internal/publisher/i;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/moloco/sdk/internal/publisher/i;->onRewardedVideoCompleted(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onRewardedVideoStarted(Lcom/moloco/sdk/publisher/MolocoAd;)V
    .locals 1

    .line 1
    const-string v0, "molocoAd"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/h;->a:Lcom/moloco/sdk/internal/publisher/i;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/moloco/sdk/internal/publisher/i;->onRewardedVideoStarted(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onUserRewarded(Lcom/moloco/sdk/publisher/MolocoAd;)V
    .locals 1

    .line 1
    const-string v0, "molocoAd"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/h;->a:Lcom/moloco/sdk/internal/publisher/i;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/moloco/sdk/internal/publisher/i;->onUserRewarded(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
