.class public Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;
.super Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;
.source "SourceFile"


# instance fields
.field private moa:Z

.field private oa:Lcom/bytedance/sdk/openadsdk/core/zjm/lw;

.field public uef:I

.field private yo:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;-><init>(Landroid/app/Activity;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    const/4 p2, 0x1

    .line 6
    iput p2, p1, Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;->uef:I

    .line 7
    .line 8
    iput-boolean p2, p1, Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;->moa:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public bcc()V
    .locals 4

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/moa/oib;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->zjm:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->wrv:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 6
    .line 7
    const/16 v3, 0xb

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/oib;-><init>(ILjava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->bs:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    .line 13
    .line 14
    return-void
.end method

.method public dhk()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;->moa:Z

    .line 2
    .line 3
    return v0
.end method

.method public dz()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getJsObject()Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getJsObject()Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->dhk()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public ivm()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;->oa:Lcom/bytedance/sdk/openadsdk/core/zjm/lw;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;->yo:Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/lw;->uef(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setAdInteractionListener(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getJsObject()Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getJsObject()Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setDislikeClickListener(Lcom/bytedance/sdk/openadsdk/core/zjm/lw;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;->oa:Lcom/bytedance/sdk/openadsdk/core/zjm/lw;

    .line 2
    .line 3
    return-void
.end method

.method public setHeartBeatListener(Lcom/bytedance/sdk/openadsdk/component/reward/yo/moa;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getJsObject()Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getJsObject()Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/moa;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setRewardControlListener(Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getJsObject()Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getJsObject()Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/ivm;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setShouldNotifyAdVisibility(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;->moa:Z

    .line 2
    .line 3
    return-void
.end method

.method public setVideoTrackListener(Lcom/bytedance/sdk/openadsdk/component/reward/yo/cz;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getJsObject()Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getJsObject()Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/cz;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public uef(Landroid/view/View;ILcom/bytedance/sdk/component/adexpress/yo;)V
    .locals 1

    const/4 v0, -0x1

    if-eq p2, v0, :cond_1

    if-eqz p3, :cond_1

    const/4 v0, 0x3

    if-ne p2, v0, :cond_1

    .line 3
    instance-of p1, p3, Lcom/bytedance/sdk/openadsdk/core/model/ab;

    if-eqz p1, :cond_0

    .line 4
    check-cast p3, Lcom/bytedance/sdk/openadsdk/core/model/ab;

    iget-object p1, p3, Lcom/bytedance/sdk/openadsdk/core/model/ab;->ab:Ljava/lang/String;

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;->yo:Ljava/lang/String;

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/gsd;->ivm()V

    return-void

    .line 6
    :cond_1
    invoke-super {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->uef(Landroid/view/View;ILcom/bytedance/sdk/component/adexpress/yo;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/adexpress/oa/moa;Lcom/bytedance/sdk/component/adexpress/oa/dz;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/sdk/component/adexpress/oa/moa<",
            "+",
            "Landroid/view/View;",
            ">;",
            "Lcom/bytedance/sdk/component/adexpress/oa/dz;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->cp:Lcom/bytedance/sdk/component/adexpress/oa/moa;

    .line 2
    invoke-super {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->uef(Lcom/bytedance/sdk/component/adexpress/oa/moa;Lcom/bytedance/sdk/component/adexpress/oa/dz;)V

    return-void
.end method

.method public xs()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->wk:Z

    .line 3
    .line 4
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->xs()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getWebView()Lcom/bytedance/sdk/component/cz/ivm;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/cz/ivm;->setBackgroundColor(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
