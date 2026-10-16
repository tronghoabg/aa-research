.class public abstract Lcom/bytedance/sdk/openadsdk/component/cz/yo;
.super Lcom/bytedance/sdk/openadsdk/core/ivm/xs;
.source "SourceFile"


# instance fields
.field final bcc:Lcom/bytedance/sdk/openadsdk/component/cz/xs;

.field cz:Lcom/bytedance/sdk/openadsdk/core/widget/bs;

.field dj:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

.field ivm:Lcom/bytedance/sdk/openadsdk/core/widget/bs;

.field lw:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

.field moa:Lcom/bytedance/sdk/openadsdk/core/widget/PAGLogoView;

.field oa:Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

.field uef:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

.field wrv:Lcom/bytedance/sdk/openadsdk/core/widget/yo;

.field xs:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

.field yo:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

.field zjm:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/ivm/xs;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/bytedance/sdk/openadsdk/component/cz/xs;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lcom/bytedance/sdk/openadsdk/component/cz/xs;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->bcc:Lcom/bytedance/sdk/openadsdk/component/cz/xs;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public abstract getAdIconView()Lcom/bytedance/sdk/openadsdk/core/ivm/moa;
.end method

.method public getAdLogo()Lcom/bytedance/sdk/openadsdk/core/widget/PAGLogoView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->moa:Lcom/bytedance/sdk/openadsdk/core/widget/PAGLogoView;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract getAdTitleTextView()Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;
.end method

.method public getBackImage()Lcom/bytedance/sdk/openadsdk/core/ivm/moa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->uef:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    .line 2
    .line 3
    return-object v0
.end method

.method public getClickButton()Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->lw:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 2
    .line 3
    return-object v0
.end method

.method public getContent()Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->dj:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDspAdChoice()Lcom/bytedance/sdk/openadsdk/core/widget/yo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->wrv:Lcom/bytedance/sdk/openadsdk/core/widget/yo;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHostAppIcon()Lcom/bytedance/sdk/openadsdk/core/widget/bs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->ivm:Lcom/bytedance/sdk/openadsdk/core/widget/bs;

    .line 2
    .line 3
    return-object v0
.end method

.method public getHostAppName()Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->xs:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 2
    .line 3
    return-object v0
.end method

.method public getIconOnlyView()Lcom/bytedance/sdk/openadsdk/core/widget/bs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->cz:Lcom/bytedance/sdk/openadsdk/core/widget/bs;

    .line 2
    .line 3
    return-object v0
.end method

.method public getImageView()Lcom/bytedance/sdk/openadsdk/core/ivm/moa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->yo:Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    .line 2
    .line 3
    return-object v0
.end method

.method public getOverlayLayout()Lcom/bytedance/sdk/openadsdk/core/ivm/lw;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract getScoreBar()Lcom/bytedance/sdk/openadsdk/core/widget/ab;
.end method

.method public getTitle()Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->zjm:Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTopCountDown()Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->bcc:Lcom/bytedance/sdk/openadsdk/component/cz/xs;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/cz/xs;->getTopCountDown()Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public getTopDisLike()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->bcc:Lcom/bytedance/sdk/openadsdk/component/cz/xs;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/cz/xs;->getTopDislike()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public getTopSkip()Lcom/bytedance/sdk/openadsdk/core/ivm/moa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->bcc:Lcom/bytedance/sdk/openadsdk/component/cz/xs;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/cz/xs;->getTopSkip()Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public abstract getUserInfo()Landroid/view/View;
.end method

.method public getVideoContainer()Lcom/bytedance/sdk/openadsdk/core/ivm/yo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/cz/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/ivm/yo;

    .line 2
    .line 3
    return-object v0
.end method
