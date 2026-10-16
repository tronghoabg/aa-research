.class public final synthetic Lcom/applovin/mediation/adapters/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/applovin/mediation/adapters/MolocoMediationAdapter;Lcom/applovin/mediation/adapter/listeners/MaxAdapterListener;Lcom/applovin/mediation/adapter/parameters/MaxAdapterResponseParameters;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/applovin/mediation/adapters/e;->a:I

    iput-object p1, p0, Lcom/applovin/mediation/adapters/e;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/applovin/mediation/adapters/e;->d:Ljava/lang/Object;

    iput-object p3, p0, Lcom/applovin/mediation/adapters/e;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;Ltf/a;LZ/k;I)V
    .locals 0

    .line 2
    const/4 p4, 0x2

    iput p4, p0, Lcom/applovin/mediation/adapters/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/applovin/mediation/adapters/e;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/applovin/mediation/adapters/e;->d:Ljava/lang/Object;

    iput-object p3, p0, Lcom/applovin/mediation/adapters/e;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lcom/applovin/mediation/adapters/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LN/o;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, Lcom/applovin/mediation/adapters/e;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/applovin/mediation/adapters/e;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ltf/a;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/applovin/mediation/adapters/e;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, LZ/k;

    .line 24
    .line 25
    const/16 v2, 0x181

    .line 26
    .line 27
    invoke-static {p2, v0, v1, p1, v2}, Lcom/moloco/sdk/internal/publisher/H;->M(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;Ltf/a;LZ/k;LN/o;I)V

    .line 28
    .line 29
    .line 30
    sget-object p1, Lef/C;->a:Lef/C;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_0
    check-cast p1, Lcom/moloco/sdk/publisher/RewardedInterstitialAd;

    .line 34
    .line 35
    check-cast p2, Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;

    .line 36
    .line 37
    iget-object v0, p0, Lcom/applovin/mediation/adapters/e;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lcom/applovin/mediation/adapters/MolocoMediationAdapter;

    .line 40
    .line 41
    iget-object v1, p0, Lcom/applovin/mediation/adapters/e;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Lcom/applovin/mediation/adapter/parameters/MaxAdapterResponseParameters;

    .line 44
    .line 45
    iget-object v2, p0, Lcom/applovin/mediation/adapters/e;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, Lcom/applovin/mediation/adapter/listeners/MaxRewardedAdapterListener;

    .line 48
    .line 49
    invoke-static {v0, v2, v1, p1, p2}, Lcom/applovin/mediation/adapters/MolocoMediationAdapter;->f(Lcom/applovin/mediation/adapters/MolocoMediationAdapter;Lcom/applovin/mediation/adapter/listeners/MaxRewardedAdapterListener;Lcom/applovin/mediation/adapter/parameters/MaxAdapterResponseParameters;Lcom/moloco/sdk/publisher/RewardedInterstitialAd;Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;)Lef/C;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    :pswitch_1
    check-cast p1, Lcom/moloco/sdk/publisher/InterstitialAd;

    .line 55
    .line 56
    check-cast p2, Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;

    .line 57
    .line 58
    iget-object v0, p0, Lcom/applovin/mediation/adapters/e;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Lcom/applovin/mediation/adapters/MolocoMediationAdapter;

    .line 61
    .line 62
    iget-object v1, p0, Lcom/applovin/mediation/adapters/e;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Lcom/applovin/mediation/adapter/parameters/MaxAdapterResponseParameters;

    .line 65
    .line 66
    iget-object v2, p0, Lcom/applovin/mediation/adapters/e;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Lcom/applovin/mediation/adapter/listeners/MaxInterstitialAdapterListener;

    .line 69
    .line 70
    invoke-static {v0, v2, v1, p1, p2}, Lcom/applovin/mediation/adapters/MolocoMediationAdapter;->a(Lcom/applovin/mediation/adapters/MolocoMediationAdapter;Lcom/applovin/mediation/adapter/listeners/MaxInterstitialAdapterListener;Lcom/applovin/mediation/adapter/parameters/MaxAdapterResponseParameters;Lcom/moloco/sdk/publisher/InterstitialAd;Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;)Lef/C;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
