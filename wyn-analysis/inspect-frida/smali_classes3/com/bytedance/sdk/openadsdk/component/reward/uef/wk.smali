.class public Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;
.super Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Landroid/app/Activity;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;-><init>(Landroid/view/ViewGroup;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Landroid/app/Activity;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public uef()V
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    if-eqz v0, :cond_0

    .line 10
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;->dz()V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/cz;)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;->setVideoTrackListener(Lcom/bytedance/sdk/openadsdk/component/reward/yo/cz;)V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;->setRewardControlListener(Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;)V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/moa;)V
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;->setHeartBeatListener(Lcom/bytedance/sdk/openadsdk/component/reward/yo/moa;)V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/uef/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;->setAdInteractionListener(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;)V

    :cond_0
    return-void
.end method
