.class public Lcom/bytedance/sdk/openadsdk/core/cq/oa/ivm/oa;
.super Lcom/bytedance/adsdk/ugeno/cz/xs/uef;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/adsdk/ugeno/cz/xs/uef;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public moa()Lcom/bytedance/adsdk/ugeno/cz/oa/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw:Landroid/view/View;

    .line 2
    .line 3
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/ivm/uef;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/ivm/uef;->getVideoView()Lcom/bytedance/adsdk/ugeno/cz/oa/uef;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public oa()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/bytedance/adsdk/ugeno/cz/xs/uef;->oa()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public synthetic uef()Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/ivm/oa;->yo()Lcom/bytedance/sdk/openadsdk/core/cq/oa/ivm/uef;

    move-result-object v0

    return-object v0
.end method

.method public uef(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/bytedance/adsdk/ugeno/cz/xs/uef;->uef(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public yo()Lcom/bytedance/sdk/openadsdk/core/cq/oa/ivm/uef;
    .locals 2

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/ivm/uef;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/oa/yo;->oa:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/ivm/uef;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lcom/bytedance/adsdk/ugeno/cz/oa/uef;->uef(Lcom/bytedance/adsdk/ugeno/moa;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
