.class public final synthetic Lcom/applovin/mediation/adapters/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p6, p0, Lcom/applovin/mediation/adapters/c;->a:I

    iput-object p1, p0, Lcom/applovin/mediation/adapters/c;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/applovin/mediation/adapters/c;->c:Ljava/lang/Object;

    iput-object p3, p0, Lcom/applovin/mediation/adapters/c;->d:Ljava/lang/Object;

    iput-object p4, p0, Lcom/applovin/mediation/adapters/c;->e:Ljava/lang/Object;

    iput-object p5, p0, Lcom/applovin/mediation/adapters/c;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lcom/applovin/mediation/adapters/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v4, p1

    .line 7
    check-cast v4, Lcom/moloco/sdk/publisher/InterstitialAd;

    .line 8
    .line 9
    check-cast p2, Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;

    .line 10
    .line 11
    sget-object p1, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/applovin/mediation/adapters/c;->b:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v5, v0

    .line 16
    check-cast v5, Landroid/os/Handler;

    .line 17
    .line 18
    iget-object v0, p0, Lcom/applovin/mediation/adapters/c;->d:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v3, v0

    .line 21
    check-cast v3, Ljava/lang/String;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/applovin/mediation/adapters/c;->f:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v6, v0

    .line 26
    check-cast v6, Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;

    .line 27
    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    new-instance v0, Lcom/applovin/impl/mediation/ads/f;

    .line 31
    .line 32
    const/16 v1, 0x9

    .line 33
    .line 34
    invoke-direct {v0, v6, v3, p2, v1}, Lcom/applovin/impl/mediation/ads/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string p2, "null cannot be cast to non-null type com.moloco.sdk.publisher.InterstitialAd"

    .line 42
    .line 43
    invoke-static {v4, p2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object p2, p0, Lcom/applovin/mediation/adapters/c;->c:Ljava/lang/Object;

    .line 47
    .line 48
    move-object v2, p2

    .line 49
    check-cast v2, Lcom/moloco/sdk/internal/unity_bridge/internal/e;

    .line 50
    .line 51
    iget-object p2, v2, Lcom/moloco/sdk/internal/unity_bridge/internal/e;->a:LPd/a;

    .line 52
    .line 53
    iget-object p2, p2, LPd/a;->a:Lj$/util/concurrent/ConcurrentHashMap;

    .line 54
    .line 55
    invoke-virtual {p2, v3}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    check-cast p2, Lcom/moloco/sdk/publisher/InterstitialAd;

    .line 60
    .line 61
    if-eqz p2, :cond_2

    .line 62
    .line 63
    invoke-interface {p2}, Lcom/moloco/sdk/publisher/AdLoad;->isLoaded()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    new-instance p2, Lcom/moloco/sdk/internal/unity_bridge/internal/a;

    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    invoke-direct {p2, v6, v3, v0}, Lcom/moloco/sdk/internal/unity_bridge/internal/a;-><init>(Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;Ljava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    invoke-interface {p2}, Lcom/moloco/sdk/publisher/Destroyable;->destroy()V

    .line 80
    .line 81
    .line 82
    :cond_2
    new-instance v1, Lcom/moloco/sdk/internal/unity_bridge/internal/b;

    .line 83
    .line 84
    invoke-direct/range {v1 .. v6}, Lcom/moloco/sdk/internal/unity_bridge/internal/b;-><init>(Lcom/moloco/sdk/internal/unity_bridge/internal/e;Ljava/lang/String;Lcom/moloco/sdk/publisher/InterstitialAd;Landroid/os/Handler;Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;)V

    .line 85
    .line 86
    .line 87
    iget-object p2, p0, Lcom/applovin/mediation/adapters/c;->e:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p2, Ljava/lang/String;

    .line 90
    .line 91
    invoke-interface {v4, p2, v1}, Lcom/moloco/sdk/publisher/AdLoad;->load(Ljava/lang/String;Lcom/moloco/sdk/publisher/AdLoad$Listener;)V

    .line 92
    .line 93
    .line 94
    :goto_0
    return-object p1

    .line 95
    :pswitch_0
    move-object v10, p1

    .line 96
    check-cast v10, Lcom/moloco/sdk/publisher/NativeAd;

    .line 97
    .line 98
    move-object v11, p2

    .line 99
    check-cast v11, Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;

    .line 100
    .line 101
    iget-object p1, p0, Lcom/applovin/mediation/adapters/c;->b:Ljava/lang/Object;

    .line 102
    .line 103
    move-object v5, p1

    .line 104
    check-cast v5, Lcom/applovin/mediation/adapters/MolocoMediationAdapter;

    .line 105
    .line 106
    iget-object p1, p0, Lcom/applovin/mediation/adapters/c;->c:Ljava/lang/Object;

    .line 107
    .line 108
    move-object v6, p1

    .line 109
    check-cast v6, Lcom/applovin/mediation/MaxAdFormat;

    .line 110
    .line 111
    iget-object p1, p0, Lcom/applovin/mediation/adapters/c;->e:Ljava/lang/Object;

    .line 112
    .line 113
    move-object v8, p1

    .line 114
    check-cast v8, Lcom/applovin/mediation/adapter/parameters/MaxAdapterResponseParameters;

    .line 115
    .line 116
    iget-object p1, p0, Lcom/applovin/mediation/adapters/c;->f:Ljava/lang/Object;

    .line 117
    .line 118
    move-object v9, p1

    .line 119
    check-cast v9, Landroid/app/Activity;

    .line 120
    .line 121
    iget-object p1, p0, Lcom/applovin/mediation/adapters/c;->d:Ljava/lang/Object;

    .line 122
    .line 123
    move-object v7, p1

    .line 124
    check-cast v7, Lcom/applovin/mediation/adapter/listeners/MaxAdViewAdapterListener;

    .line 125
    .line 126
    invoke-static/range {v5 .. v11}, Lcom/applovin/mediation/adapters/MolocoMediationAdapter;->c(Lcom/applovin/mediation/adapters/MolocoMediationAdapter;Lcom/applovin/mediation/MaxAdFormat;Lcom/applovin/mediation/adapter/listeners/MaxAdViewAdapterListener;Lcom/applovin/mediation/adapter/parameters/MaxAdapterResponseParameters;Landroid/app/Activity;Lcom/moloco/sdk/publisher/NativeAd;Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;)Lef/C;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    return-object p1

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
