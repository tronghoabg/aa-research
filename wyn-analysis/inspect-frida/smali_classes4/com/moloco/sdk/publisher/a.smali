.class public final synthetic Lcom/moloco/sdk/publisher/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/moloco/sdk/publisher/a;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/publisher/a;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/moloco/sdk/publisher/a;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/moloco/sdk/publisher/RewardedInterstitialAd;

    check-cast p2, Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;

    iget-object v0, p0, Lcom/moloco/sdk/publisher/a;->b:Landroid/app/Activity;

    check-cast v0, Lcom/moloco/sdk/publisher/RewardedInterstitialAdSample;

    invoke-static {v0, p1, p2}, Lcom/moloco/sdk/publisher/RewardedInterstitialAdSample;->a(Lcom/moloco/sdk/publisher/RewardedInterstitialAdSample;Lcom/moloco/sdk/publisher/RewardedInterstitialAd;Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;)Lef/C;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/moloco/sdk/publisher/InterstitialAd;

    check-cast p2, Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;

    iget-object v0, p0, Lcom/moloco/sdk/publisher/a;->b:Landroid/app/Activity;

    check-cast v0, Lcom/moloco/sdk/publisher/InterstitialAdActivitySample;

    invoke-static {v0, p1, p2}, Lcom/moloco/sdk/publisher/InterstitialAdActivitySample;->a(Lcom/moloco/sdk/publisher/InterstitialAdActivitySample;Lcom/moloco/sdk/publisher/InterstitialAd;Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;)Lef/C;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lcom/moloco/sdk/publisher/Banner;

    check-cast p2, Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;

    iget-object v0, p0, Lcom/moloco/sdk/publisher/a;->b:Landroid/app/Activity;

    check-cast v0, Lcom/moloco/sdk/publisher/BannerActivitySample;

    invoke-static {v0, p1, p2}, Lcom/moloco/sdk/publisher/BannerActivitySample;->a(Lcom/moloco/sdk/publisher/BannerActivitySample;Lcom/moloco/sdk/publisher/Banner;Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;)Lef/C;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
