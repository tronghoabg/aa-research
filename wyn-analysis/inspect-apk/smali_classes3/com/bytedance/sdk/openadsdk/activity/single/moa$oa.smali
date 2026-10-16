.class Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;
.super Lcom/bytedance/sdk/openadsdk/activity/single/moa$lw;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/activity/single/moa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "oa"
.end annotation


# instance fields
.field private final oa:Lcom/bytedance/sdk/openadsdk/component/reward/view/oa;

.field private final uef:Lcom/bytedance/sdk/openadsdk/activity/single/moa$uef;

.field private yo:Lcom/bytedance/sdk/openadsdk/activity/single/uef;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/activity/single/moa$uef;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/moa$lw;-><init>(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->uef:Lcom/bytedance/sdk/openadsdk/activity/single/moa$uef;

    .line 5
    .line 6
    check-cast p2, Lcom/bytedance/sdk/openadsdk/component/reward/view/oa;

    .line 7
    .line 8
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/view/oa;

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;)Lcom/bytedance/sdk/openadsdk/activity/single/uef;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->yo:Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    return-object p0
.end method

.method private uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z
    .locals 4

    .line 28
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->fz()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 29
    :cond_0
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->aje()Lcom/bytedance/sdk/openadsdk/core/model/dxx;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 30
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->aje()Lcom/bytedance/sdk/openadsdk/core/model/dxx;

    move-result-object p2

    .line 31
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dxx;->uef()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/dxx;->uef()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 32
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dxx;->oa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/dxx;->oa()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 33
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->dxx()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method


# virtual methods
.method public uef()Lcom/bytedance/sdk/openadsdk/activity/single/bcc;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->yo:Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    return-object v0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/activity/single/moa;Lcom/bytedance/sdk/openadsdk/activity/single/moa$moa;I)V
    .locals 7

    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/m0;->getBindingAdapterPosition()I

    move-result v3

    .line 4
    iget-object v6, p1, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->uef:Landroid/app/Activity;

    .line 5
    invoke-static {v6}, Lcom/bytedance/sdk/component/utils/oa;->uef(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 6
    :cond_0
    iget-object v2, p2, Lcom/bytedance/sdk/openadsdk/activity/single/moa$moa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 7
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->yo:Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    if-eqz p2, :cond_2

    .line 8
    invoke-direct {p0, p2, v2}, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 9
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->yo:Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    invoke-virtual {p2, v2, v3, p3}, Lcom/bytedance/sdk/openadsdk/activity/single/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;II)V

    goto :goto_0

    .line 10
    :cond_1
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->uef:Lcom/bytedance/sdk/openadsdk/activity/single/moa$uef;

    const/4 v0, 0x0

    invoke-virtual {p2, p0, v0}, Lcom/bytedance/sdk/openadsdk/activity/single/moa$uef;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;Z)V

    .line 11
    :cond_2
    :goto_0
    iget-object v1, p1, Lcom/bytedance/sdk/openadsdk/activity/single/yo;->moa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    .line 12
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->yo:Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    if-nez p2, :cond_4

    .line 13
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nyn()Z

    move-result p2

    if-eqz p2, :cond_3

    new-instance v0, Lcom/bytedance/sdk/openadsdk/activity/single/xs;

    const/4 v5, 0x0

    move v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/activity/single/xs;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IIZ)V

    goto :goto_1

    :cond_3
    move v4, p3

    new-instance v0, Lcom/bytedance/sdk/openadsdk/activity/single/ivm;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/activity/single/ivm;-><init>(Lcom/bytedance/sdk/openadsdk/activity/single/oa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IIZ)V

    :goto_1
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->yo:Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    .line 14
    :cond_4
    new-instance p2, Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;

    const/4 p3, 0x1

    const/4 v0, 0x0

    invoke-direct {p2, p3, v0}, Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;-><init>(ILcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    .line 15
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->yo(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Z

    move-result p3

    iput-boolean p3, p2, Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;->moa:Z

    .line 16
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->yo:Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    invoke-virtual {p3, v6, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->oa(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/activity/single/oa$lw;)V

    .line 17
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->uef:Lcom/bytedance/sdk/openadsdk/activity/single/moa$uef;

    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->yo:Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    invoke-virtual {p2, p3}, Lcom/bytedance/sdk/openadsdk/activity/single/moa$uef;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;)V

    .line 18
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->yo:Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/activity/single/uef;->uef()Lcom/bytedance/sdk/openadsdk/component/reward/view/bcc;

    move-result-object p2

    if-nez p2, :cond_5

    :goto_2
    return-void

    .line 19
    :cond_5
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p3

    .line 20
    instance-of v0, p3, Landroid/view/ViewGroup;

    if-eqz v0, :cond_6

    .line 21
    check-cast p3, Landroid/view/ViewGroup;

    invoke-virtual {p3, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 22
    :cond_6
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->gzw(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Z

    move-result p1

    if-nez p1, :cond_8

    .line 23
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->knp()F

    move-result p1

    const/4 p3, 0x0

    cmpl-float p3, p1, p3

    if-lez p3, :cond_7

    .line 24
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/view/oa;

    invoke-virtual {p3, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/view/oa;->setWidthAndHeightRatio(F)V

    goto :goto_3

    .line 25
    :cond_7
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/view/oa;

    const p3, 0x3f4ccccd    # 0.8f

    invoke-virtual {p1, p3}, Lcom/bytedance/sdk/openadsdk/component/reward/view/oa;->setWidthOrHeightInParentRatio(F)V

    .line 26
    :cond_8
    :goto_3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/view/oa;

    new-instance p3, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {p3, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/component/reward/view/oa;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/view/bcc;Landroid/widget/FrameLayout$LayoutParams;)V

    .line 27
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/view/oa;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->yo:Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/view/oa;->setScene(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;)V

    return-void
.end method

.method public uef(Z)V
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->yo:Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    if-nez v0, :cond_0

    return-void

    .line 35
    :cond_0
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->ivm(Z)V

    .line 36
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->yo:Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/uef;->oib()V

    if-nez p1, :cond_1

    const/4 p1, 0x0

    .line 37
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->yo:Lcom/bytedance/sdk/openadsdk/activity/single/uef;

    .line 38
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$oa;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/view/oa;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/view/oa;->uef()V

    return-void
.end method
