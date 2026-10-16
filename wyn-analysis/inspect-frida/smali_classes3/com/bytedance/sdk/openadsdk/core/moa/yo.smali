.class public Lcom/bytedance/sdk/openadsdk/core/moa/yo;
.super Lcom/bytedance/sdk/openadsdk/core/moa/moa;
.source "SourceFile"


# instance fields
.field private bcc:Lcom/bytedance/sdk/openadsdk/uef/uef/oa;

.field private cz:I

.field private zjm:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/bytedance/sdk/openadsdk/core/moa/moa;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;Z)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/yo;->cz:I

    .line 6
    .line 7
    const/4 p1, -0x1

    .line 8
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/yo;->zjm:I

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/core/moa/yo;)Lcom/bytedance/sdk/openadsdk/uef/uef/oa;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/yo;->bcc:Lcom/bytedance/sdk/openadsdk/uef/uef/oa;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/moa/yo;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/yo;->zjm:I

    return p0
.end method


# virtual methods
.method public getVideoModel()Lcom/bytedance/sdk/openadsdk/oib/yo/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->oa:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/zjm/dhk;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/dhk;->getVideoModel()Lcom/bytedance/sdk/openadsdk/oib/yo/uef;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public moa()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->oa:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/bytedance/sdk/openadsdk/core/zjm/dhk;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/zjm/dhk;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/dhk;->getVideoController()Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;->gb()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/yo;->cz:I

    .line 20
    .line 21
    :cond_0
    invoke-super {p0}, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->moa()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public oa()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->oa:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    if-eqz v0, :cond_0

    .line 3
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/zjm/dhk;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/dhk;->sy()V

    :cond_0
    return-void
.end method

.method public uef()V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->oa:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    if-eqz v0, :cond_0

    .line 7
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/zjm/dhk;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/dhk;->ab()V

    const/4 v0, 0x2

    .line 8
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/yo;->zjm:I

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/uef/uef/oa;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->oa:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    if-eqz v0, :cond_0

    .line 3
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/zjm/dhk;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/dhk;->bs()V

    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/yo;->bcc:Lcom/bytedance/sdk/openadsdk/uef/uef/oa;

    const/4 p1, 0x3

    .line 5
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/yo;->zjm:I

    :cond_0
    return-void
.end method

.method public yo()V
    .locals 7

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/moa/yo$1;

    .line 2
    .line 3
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->uef:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 6
    .line 7
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->moa:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 8
    .line 9
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->ivm:Ljava/lang/String;

    .line 10
    .line 11
    iget-boolean v6, p0, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->xs:Z

    .line 12
    .line 13
    move-object v1, p0

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/bytedance/sdk/openadsdk/core/moa/yo$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/moa/yo;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    iput-object v0, v1, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->oa:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 18
    .line 19
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/zjm/dhk;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/dhk;->getVideoController()Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget v2, v1, Lcom/bytedance/sdk/openadsdk/core/moa/yo;->cz:I

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;->moa(I)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object v0, v1, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->oa:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 33
    .line 34
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    .line 35
    .line 36
    const/4 v3, -0x1

    .line 37
    invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, v1, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->lw:Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdWrapperListener;

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->setExpressInteractionListener(Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdWrapperListener;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    iget-object v0, v1, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->oa:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/zjm/dhk;

    .line 55
    .line 56
    new-instance v2, Lcom/bytedance/sdk/openadsdk/core/moa/yo$2;

    .line 57
    .line 58
    invoke-direct {v2, p0}, Lcom/bytedance/sdk/openadsdk/core/moa/yo$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/moa/yo;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/core/zjm/dhk;->setVideoAdListener(Lcom/bytedance/sdk/openadsdk/uef/oa/yo;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    return-void
.end method
