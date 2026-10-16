.class public final Lcom/moloco/sdk/internal/publisher/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/publisher/RewardedInterstitialAd;
.implements Lcom/moloco/sdk/internal/publisher/b0;
.implements Lcom/moloco/sdk/publisher/FullscreenAd;


# instance fields
.field public final a:Lcom/moloco/sdk/internal/publisher/l0;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/moloco/sdk/internal/services/config/a;

.field public final d:Lcom/moloco/sdk/acm/recorder/c;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/publisher/l0;Ljava/lang/String;Lcom/moloco/sdk/internal/services/config/a;Lcom/moloco/sdk/acm/recorder/c;)V
    .locals 1

    .line 1
    const-string v0, "adUnitId"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/moloco/sdk/internal/publisher/g;->a:Lcom/moloco/sdk/internal/publisher/l0;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/moloco/sdk/internal/publisher/g;->b:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/moloco/sdk/internal/publisher/g;->c:Lcom/moloco/sdk/internal/services/config/a;

    .line 14
    .line 15
    iput-object p4, p0, Lcom/moloco/sdk/internal/publisher/g;->d:Lcom/moloco/sdk/acm/recorder/c;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/g;->a:Lcom/moloco/sdk/internal/publisher/l0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/moloco/sdk/internal/publisher/l0;->a(JJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final destroy()V
    .locals 1

    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/g;->a:Lcom/moloco/sdk/internal/publisher/l0;

    invoke-virtual {v0}, Lcom/moloco/sdk/internal/publisher/l0;->destroy()V

    return-void
.end method

.method public final isLoaded()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/g;->a:Lcom/moloco/sdk/internal/publisher/l0;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/moloco/sdk/internal/publisher/l0;->p:Lcom/moloco/sdk/internal/publisher/B;

    .line 4
    .line 5
    iget-boolean v0, v0, Lcom/moloco/sdk/internal/publisher/B;->k:Z

    .line 6
    .line 7
    return v0
.end method

.method public final load(Ljava/lang/String;Lcom/moloco/sdk/publisher/AdLoad$Listener;)V
    .locals 1

    const-string v0, "bidResponseJson"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/moloco/sdk/internal/publisher/g;->a:Lcom/moloco/sdk/internal/publisher/l0;

    invoke-virtual {v0, p1, p2}, Lcom/moloco/sdk/internal/publisher/l0;->load(Ljava/lang/String;Lcom/moloco/sdk/publisher/AdLoad$Listener;)V

    return-void
.end method

.method public final show(Lcom/moloco/sdk/publisher/AdShowListener;)V
    .locals 8

    .line 1
    check-cast p1, Lcom/moloco/sdk/publisher/RewardedInterstitialAdShowListener;

    .line 2
    .line 3
    new-instance v1, Lcom/moloco/sdk/internal/publisher/i;

    .line 4
    .line 5
    new-instance v0, Lcom/moloco/sdk/internal/publisher/f;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, p0, v2}, Lcom/moloco/sdk/internal/publisher/f;-><init>(Lcom/moloco/sdk/internal/publisher/g;I)V

    .line 9
    .line 10
    .line 11
    sget-object v2, Lcom/moloco/sdk/internal/C;->a:Lef/p;

    .line 12
    .line 13
    invoke-virtual {v2}, Lef/p;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lcom/moloco/sdk/internal/B;

    .line 18
    .line 19
    invoke-direct {v1, p1, v0, v2}, Lcom/moloco/sdk/internal/publisher/i;-><init>(Lcom/moloco/sdk/publisher/RewardedInterstitialAdShowListener;Lcom/moloco/sdk/internal/publisher/f;Lcom/moloco/sdk/internal/B;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/moloco/sdk/internal/publisher/g;->c:Lcom/moloco/sdk/internal/services/config/a;

    .line 23
    .line 24
    iget-object p1, p1, Lcom/moloco/sdk/internal/services/config/a;->b:Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    const-string v0, "reward_on_skip_visible"

    .line 27
    .line 28
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    new-instance v0, Lcom/moloco/sdk/internal/publisher/h;

    .line 33
    .line 34
    iget-object p1, p0, Lcom/moloco/sdk/internal/publisher/g;->a:Lcom/moloco/sdk/internal/publisher/l0;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/moloco/sdk/internal/publisher/l0;->c()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 41
    .line 42
    if-ne v2, v3, :cond_0

    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 v2, 0x0

    .line 47
    :goto_0
    new-instance v3, Lcom/moloco/sdk/internal/publisher/f;

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    invoke-direct {v3, p0, v4}, Lcom/moloco/sdk/internal/publisher/f;-><init>(Lcom/moloco/sdk/internal/publisher/g;I)V

    .line 51
    .line 52
    .line 53
    new-instance v6, Lcom/moloco/sdk/internal/publisher/f;

    .line 54
    .line 55
    const/4 v4, 0x2

    .line 56
    invoke-direct {v6, p0, v4}, Lcom/moloco/sdk/internal/publisher/f;-><init>(Lcom/moloco/sdk/internal/publisher/g;I)V

    .line 57
    .line 58
    .line 59
    iget-object v7, p0, Lcom/moloco/sdk/internal/publisher/g;->d:Lcom/moloco/sdk/acm/recorder/c;

    .line 60
    .line 61
    iget-object v4, p0, Lcom/moloco/sdk/internal/publisher/g;->b:Ljava/lang/String;

    .line 62
    .line 63
    invoke-direct/range {v0 .. v7}, Lcom/moloco/sdk/internal/publisher/h;-><init>(Lcom/moloco/sdk/internal/publisher/i;ZLcom/moloco/sdk/internal/publisher/f;Ljava/lang/String;ZLcom/moloco/sdk/internal/publisher/f;Lcom/moloco/sdk/acm/recorder/c;)V

    .line 64
    .line 65
    .line 66
    new-instance v1, LFf/d;

    .line 67
    .line 68
    const/4 v2, 0x2

    .line 69
    invoke-direct {v1, v2, v0, p0}, LFf/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iput-object v1, p1, Lcom/moloco/sdk/internal/publisher/l0;->s:LFf/d;

    .line 73
    .line 74
    new-instance v1, LAf/q;

    .line 75
    .line 76
    const/16 v2, 0x9

    .line 77
    .line 78
    invoke-direct {v1, v0, v2}, LAf/q;-><init>(Ljava/lang/Object;I)V

    .line 79
    .line 80
    .line 81
    iput-object v1, p1, Lcom/moloco/sdk/internal/publisher/l0;->t:LAf/q;

    .line 82
    .line 83
    invoke-virtual {p1, v0}, Lcom/moloco/sdk/internal/publisher/l0;->show(Lcom/moloco/sdk/publisher/AdShowListener;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method
