.class Lcom/bytedance/sdk/openadsdk/component/reward/bcc;
.super Lcom/bytedance/sdk/openadsdk/api/interstitial/PAGInterstitialAd;
.source "SourceFile"


# instance fields
.field private final moa:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

.field private oa:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

.field private final uef:Lcom/bytedance/sdk/openadsdk/core/model/uef;

.field private final yo:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/api/interstitial/PAGInterstitialAd;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bcc;->uef:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    .line 5
    .line 6
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/ue;->uef()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bcc;->yo:Ljava/lang/String;

    .line 11
    .line 12
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    .line 13
    .line 14
    new-instance v1, Lcom/bytedance/sdk/openadsdk/component/reward/bcc$1;

    .line 15
    .line 16
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/bcc$1;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/bcc;)V

    .line 17
    .line 18
    .line 19
    const-string v2, "fullscreen_interstitial_ad"

    .line 20
    .line 21
    invoke-direct {v0, p1, p2, v2, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/cq;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/uef;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/component/reward/cq$uef;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bcc;->moa:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    .line 25
    .line 26
    return-void
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/component/reward/bcc;)Lcom/bytedance/sdk/openadsdk/uef/yo/oa;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bcc;->oa:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/component/reward/bcc;)Lcom/bytedance/sdk/openadsdk/core/model/uef;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bcc;->uef:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/bcc;)Lcom/bytedance/sdk/openadsdk/component/reward/cq;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bcc;->moa:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/bcc;Lcom/bytedance/sdk/openadsdk/uef/yo/oa;)Lcom/bytedance/sdk/openadsdk/uef/yo/oa;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bcc;->oa:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    return-object p1
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/component/reward/bcc;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bcc;->yo:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public getExtraInfo(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bcc;->moa:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/cq;->uef(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getMediaExtraInfo()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bcc;->moa:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/cq;->oa()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public loss(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bcc;->moa:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/component/reward/cq;->uef(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setAdInteractionCallback(Lcom/bytedance/sdk/openadsdk/api/interstitial/PAGInterstitialAdInteractionCallback;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/yo/uef;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bcc;->uef:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/component/yo/uef;-><init>(Lcom/bytedance/sdk/openadsdk/api/interstitial/PAGInterstitialAdInteractionListener;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bcc;->oa:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 9
    .line 10
    return-void
.end method

.method public setAdInteractionListener(Lcom/bytedance/sdk/openadsdk/api/interstitial/PAGInterstitialAdInteractionListener;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/yo/uef;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bcc;->uef:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/component/yo/uef;-><init>(Lcom/bytedance/sdk/openadsdk/api/interstitial/PAGInterstitialAdInteractionListener;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bcc;->oa:Lcom/bytedance/sdk/openadsdk/uef/yo/oa;

    .line 9
    .line 10
    return-void
.end method

.method public show(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bcc;->moa:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/cq;->uef(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public uef()V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bcc;->moa:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/cq;->uef()V

    return-void
.end method

.method public win(Ljava/lang/Double;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bcc;->moa:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/cq;->uef(Ljava/lang/Double;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
