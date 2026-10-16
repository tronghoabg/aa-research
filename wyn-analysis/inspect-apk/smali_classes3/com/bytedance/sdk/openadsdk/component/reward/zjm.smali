.class Lcom/bytedance/sdk/openadsdk/component/reward/zjm;
.super Lcom/bytedance/sdk/openadsdk/api/reward/PAGRewardedAd;
.source "SourceFile"


# instance fields
.field private final lw:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

.field private final moa:Ljava/lang/String;

.field private final oa:Lcom/bytedance/sdk/openadsdk/AdSlot;

.field private final uef:Lcom/bytedance/sdk/openadsdk/core/model/uef;

.field private yo:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/AdSlot;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/api/reward/PAGRewardedAd;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->uef:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->oa:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 7
    .line 8
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/ue;->uef()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->moa:Ljava/lang/String;

    .line 13
    .line 14
    new-instance p3, Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    .line 15
    .line 16
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm$1;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/zjm$1;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/zjm;)V

    .line 19
    .line 20
    .line 21
    const-string v1, "rewarded_video"

    .line 22
    .line 23
    invoke-direct {p3, p1, p2, v1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/cq;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/uef;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/component/reward/cq$uef;)V

    .line 24
    .line 25
    .line 26
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    .line 27
    .line 28
    return-void
.end method

.method public static synthetic lw(Lcom/bytedance/sdk/openadsdk/component/reward/zjm;)Lcom/bytedance/sdk/openadsdk/uef/lw/uef;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->yo:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/component/reward/zjm;)Lcom/bytedance/sdk/openadsdk/AdSlot;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->oa:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/component/reward/zjm;)Lcom/bytedance/sdk/openadsdk/core/model/uef;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->uef:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/zjm;)Lcom/bytedance/sdk/openadsdk/component/reward/cq;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/zjm;Lcom/bytedance/sdk/openadsdk/uef/lw/uef;)Lcom/bytedance/sdk/openadsdk/uef/lw/uef;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->yo:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    return-object p1
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/component/reward/zjm;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->moa:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public getExtraInfo(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

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
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

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
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/component/reward/cq;->uef(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setAdInteractionCallback(Lcom/bytedance/sdk/openadsdk/api/reward/PAGRewardedAdInteractionCallback;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/dj;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->uef:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/dj;-><init>(Lcom/bytedance/sdk/openadsdk/api/reward/PAGRewardedAdInteractionCallback;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->yo:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    .line 9
    .line 10
    return-void
.end method

.method public setAdInteractionListener(Lcom/bytedance/sdk/openadsdk/api/reward/PAGRewardedAdInteractionListener;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/reward/dj;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->uef:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/dj;-><init>(Lcom/bytedance/sdk/openadsdk/api/reward/PAGRewardedAdInteractionListener;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->yo:Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    .line 9
    .line 10
    return-void
.end method

.method public show(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

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
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/cq;->uef()V

    return-void
.end method

.method public win(Ljava/lang/Double;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/cq;->uef(Ljava/lang/Double;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
