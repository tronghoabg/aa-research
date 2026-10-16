.class public Lcom/bytedance/sdk/openadsdk/common/wrv;
.super Lcom/bytedance/sdk/openadsdk/core/ivm/yo;
.source "SourceFile"


# instance fields
.field private bcc:I

.field private ivm:Ljava/lang/Runnable;

.field private lw:Ljava/lang/Runnable;

.field private moa:J

.field protected oa:Z

.field protected uef:Lcom/bytedance/sdk/openadsdk/common/dj;

.field private xs:Z

.field private yo:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/ivm/yo;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0xa

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->moa:J

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->oa:Z

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->xs:Z

    .line 13
    .line 14
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->bcc:I

    .line 15
    .line 16
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/common/wrv;->yo()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private oa(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->uef:Lcom/bytedance/sdk/openadsdk/common/dj;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/common/dj;->uef(I)V

    :cond_0
    const/16 v0, 0x64

    if-ne p1, v0, :cond_1

    .line 3
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->oa:Z

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/common/wrv;->oa()V

    :cond_1
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/common/wrv;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->yo:I

    return p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/common/wrv;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/common/wrv;->oa(I)V

    return-void
.end method

.method private yo()V
    .locals 1

    .line 1
    const-string v0, "#2E2E2E"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    const/16 v0, 0x8

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private yo(I)V
    .locals 1

    .line 3
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->bcc:I

    if-eq v0, p1, :cond_0

    .line 4
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->bcc:I

    :cond_0
    return-void
.end method


# virtual methods
.method public getLoadingStyle()Lcom/bytedance/sdk/openadsdk/common/dj;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->uef:Lcom/bytedance/sdk/openadsdk/common/dj;

    .line 2
    .line 3
    return-object v0
.end method

.method public oa()V
    .locals 2

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->yo:I

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->uef:Lcom/bytedance/sdk/openadsdk/common/dj;

    if-eqz v0, :cond_0

    .line 7
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/common/dj;->uef:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->uef:Lcom/bytedance/sdk/openadsdk/common/dj;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/common/dj;->moa()V

    :cond_0
    const/16 v0, 0x8

    .line 9
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->uef:Lcom/bytedance/sdk/openadsdk/common/dj;

    .line 11
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->lw:Ljava/lang/Runnable;

    if-eqz v1, :cond_1

    .line 12
    invoke-virtual {p0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 13
    :cond_1
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->ivm:Ljava/lang/Runnable;

    if-eqz v1, :cond_2

    .line 14
    invoke-virtual {p0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 15
    :cond_2
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->ivm:Ljava/lang/Runnable;

    .line 16
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->lw:Ljava/lang/Runnable;

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/common/wrv;->yo(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->lw:Ljava/lang/Runnable;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->lw:Ljava/lang/Runnable;

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setOnlyLoading(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->xs:Z

    .line 2
    .line 3
    return-void
.end method

.method public uef()V
    .locals 5

    .line 29
    new-instance v0, Lcom/bytedance/sdk/openadsdk/common/wrv$1;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/common/wrv$1;-><init>(Lcom/bytedance/sdk/openadsdk/common/wrv;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 30
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->lw:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    .line 31
    new-instance v0, Lcom/bytedance/sdk/openadsdk/common/wrv$2;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/common/wrv$2;-><init>(Lcom/bytedance/sdk/openadsdk/common/wrv;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->lw:Ljava/lang/Runnable;

    .line 32
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->lw:Ljava/lang/Runnable;

    iget-wide v1, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->moa:J

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public uef(I)V
    .locals 2

    const/16 v0, 0x64

    if-eq p1, v0, :cond_0

    .line 33
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->yo:I

    sub-int v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/4 v1, 0x7

    if-ge v0, v1, :cond_0

    return-void

    .line 34
    :cond_0
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->yo:I

    .line 35
    invoke-static {}, Lcom/bykv/vk/openvk/uef/uef/oa/oa/uef;->uef()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 36
    iget p1, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->yo:I

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/common/wrv;->oa(I)V

    return-void

    .line 37
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->ivm:Ljava/lang/Runnable;

    if-nez p1, :cond_2

    .line 38
    new-instance p1, Lcom/bytedance/sdk/openadsdk/common/wrv$3;

    invoke-direct {p1, p0}, Lcom/bytedance/sdk/openadsdk/common/wrv$3;-><init>(Lcom/bytedance/sdk/openadsdk/common/wrv;)V

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->ivm:Ljava/lang/Runnable;

    .line 39
    :cond_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->ivm:Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 8

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->gsd()Lcom/bytedance/sdk/openadsdk/core/model/tpx;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/tpx;->uef()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->moa:J

    .line 5
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/common/dj;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/common/dj;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->uef:Lcom/bytedance/sdk/openadsdk/common/dj;

    .line 6
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/common/dj;->uef()Landroid/view/View;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v1, v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_1

    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 9
    :cond_1
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v2, 0x11

    .line 10
    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    if-eqz p1, :cond_a

    .line 12
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->dy()Z

    move-result v1

    .line 13
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->uef:Lcom/bytedance/sdk/openadsdk/common/dj;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/common/dj;->oa()Lcom/bytedance/sdk/openadsdk/core/widget/bs;

    move-result-object v2

    const/16 v3, 0x8

    if-eqz v2, :cond_6

    .line 14
    iget-boolean v4, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->xs:Z

    if-nez v4, :cond_5

    if-eqz v1, :cond_2

    goto :goto_1

    .line 15
    :cond_2
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ifk()Lcom/bytedance/sdk/openadsdk/core/model/sy;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ifk()Lcom/bytedance/sdk/openadsdk/core/model/sy;

    move-result-object v4

    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->uef()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 16
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ifk()Lcom/bytedance/sdk/openadsdk/core/model/sy;

    move-result-object v4

    goto :goto_0

    :cond_3
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_4

    .line 17
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->uef()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_4

    .line 18
    :try_start_0
    invoke-static {v4}, Lcom/bytedance/sdk/openadsdk/zjm/moa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/sy;)Lcom/bytedance/sdk/component/lw/zjm;

    move-result-object v5

    const/4 v6, 0x1

    invoke-interface {v5, v6}, Lcom/bytedance/sdk/component/lw/zjm;->yo(I)Lcom/bytedance/sdk/component/lw/zjm;

    move-result-object v5

    new-instance v6, Lcom/bytedance/sdk/openadsdk/zjm/oa;

    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/core/model/sy;->uef()Ljava/lang/String;

    move-result-object v4

    new-instance v7, Lcom/bytedance/sdk/openadsdk/utils/cp;

    invoke-direct {v7, v2}, Lcom/bytedance/sdk/openadsdk/utils/cp;-><init>(Landroid/widget/ImageView;)V

    invoke-direct {v6, p1, v4, v7}, Lcom/bytedance/sdk/openadsdk/zjm/oa;-><init>(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Lcom/bytedance/sdk/component/lw/ab;)V

    invoke-interface {v5, v6}, Lcom/bytedance/sdk/component/lw/zjm;->uef(Lcom/bytedance/sdk/component/lw/ab;)Lcom/bytedance/sdk/component/lw/cz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    .line 19
    :catchall_0
    :cond_4
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 20
    :cond_5
    :goto_1
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 21
    :cond_6
    :goto_2
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->uef:Lcom/bytedance/sdk/openadsdk/common/dj;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/common/dj;->yo()Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    move-result-object v2

    if-eqz v2, :cond_a

    .line 22
    iget-boolean v4, p0, Lcom/bytedance/sdk/openadsdk/common/wrv;->xs:Z

    if-nez v4, :cond_9

    if-eqz v1, :cond_7

    goto :goto_3

    .line 23
    :cond_7
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->xw()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 24
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->xw()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 25
    :cond_8
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4

    .line 26
    :cond_9
    :goto_3
    const-string p1, "Loading"

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    :cond_a
    :goto_4
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/common/wrv;->yo(I)V

    return-void
.end method
