.class public Lcom/bytedance/sdk/openadsdk/core/cq/oa/oa/oa;
.super Lcom/bytedance/adsdk/oa/ivm;
.source "SourceFile"


# instance fields
.field private uef:Lcom/bytedance/adsdk/ugeno/moa;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/adsdk/oa/ivm;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/bytedance/adsdk/oa/ivm;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/oa/oa;->uef:Lcom/bytedance/adsdk/ugeno/moa;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/bytedance/adsdk/ugeno/moa;->xs()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/bytedance/adsdk/oa/ivm;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/oa/oa;->uef:Lcom/bytedance/adsdk/ugeno/moa;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Lcom/bytedance/adsdk/ugeno/moa;->bcc()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/moa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/oa/oa;->uef:Lcom/bytedance/adsdk/ugeno/moa;

    .line 2
    .line 3
    return-void
.end method
