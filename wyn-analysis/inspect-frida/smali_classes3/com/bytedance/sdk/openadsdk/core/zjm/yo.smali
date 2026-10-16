.class public Lcom/bytedance/sdk/openadsdk/core/zjm/yo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/core/zjm/yo$oa;,
        Lcom/bytedance/sdk/openadsdk/core/zjm/yo$yo;,
        Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;
    }
.end annotation


# instance fields
.field private bcc:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private cz:I

.field private ivm:I

.field private lw:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

.field private moa:Lcom/bytedance/sdk/component/adexpress/oa/wk;

.field private final oa:Landroid/content/Context;

.field uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field private xs:I

.field private yo:Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->oa:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->lw:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 9
    .line 10
    invoke-direct {p0, p2}, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;

    .line 14
    .line 15
    iget v3, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->ivm:I

    .line 16
    .line 17
    iget v4, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->xs:I

    .line 18
    .line 19
    iget v6, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->cz:I

    .line 20
    .line 21
    move-object v1, p1

    .line 22
    move-object v2, p3

    .line 23
    move-object v5, p4

    .line 24
    invoke-direct/range {v0 .. v6}, Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IILjava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->yo:Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;

    .line 28
    .line 29
    return-void
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/core/zjm/yo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->yo()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/core/zjm/yo;)Lcom/bytedance/sdk/component/adexpress/oa/wk;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->moa:Lcom/bytedance/sdk/component/adexpress/oa/wk;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/zjm/yo;)Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->lw:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    return-object p0
.end method

.method private uef(Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ib()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, -0x1

    .line 3
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->ivm:I

    .line 4
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->xs:I

    return-void

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getExpectExpressWidth()I

    move-result v0

    .line 6
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getExpectExpressHeight()I

    move-result v1

    .line 7
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/moa/oa;->uef(II)Lcom/bytedance/sdk/openadsdk/core/zjm/oib;

    move-result-object v0

    .line 8
    iget v1, v0, Lcom/bytedance/sdk/openadsdk/core/zjm/oib;->uef:I

    iput v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->cz:I

    .line 9
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getExpectExpressWidth()I

    move-result v1

    if-lez v1, :cond_1

    .line 10
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getExpectExpressHeight()I

    move-result v1

    if-lez v1, :cond_1

    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->oa:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getExpectExpressWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->ivm:I

    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->oa:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getExpectExpressHeight()I

    move-result p1

    int-to-float p1, p1

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/utils/af;->oa(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->xs:I

    goto :goto_0

    .line 13
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->oa:Landroid/content/Context;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/af;->yo(Landroid/content/Context;)I

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->ivm:I

    int-to-float p1, p1

    .line 14
    iget v0, v0, Lcom/bytedance/sdk/openadsdk/core/zjm/oib;->oa:F

    div-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Float;->intValue()I

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->xs:I

    .line 15
    :goto_0
    iget p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->ivm:I

    if-lez p1, :cond_2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->oa:Landroid/content/Context;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/af;->yo(Landroid/content/Context;)I

    move-result v0

    if-le p1, v0, :cond_2

    .line 16
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->oa:Landroid/content/Context;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/af;->yo(Landroid/content/Context;)I

    move-result p1

    int-to-float p1, p1

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->ivm:I

    int-to-float v0, v0

    div-float/2addr p1, v0

    .line 17
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->oa:Landroid/content/Context;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/af;->yo(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->ivm:I

    .line 18
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->xs:I

    int-to-float v0, v0

    mul-float/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Float;->intValue()I

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->xs:I

    :cond_2
    return-void
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/core/zjm/yo;)Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->yo:Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;

    return-object p0
.end method

.method private yo()V
    .locals 2

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->bcc:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->bcc:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->bcc:Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method


# virtual methods
.method public oa()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->yo:Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;->moa()V

    .line 4
    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->yo:Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;

    .line 5
    :cond_0
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->yo()V

    .line 6
    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->moa:Lcom/bytedance/sdk/component/adexpress/oa/wk;

    .line 7
    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->lw:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    return-void
.end method

.method public uef()V
    .locals 5

    .line 20
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ib()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 21
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/zjm/yo$oa;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->yo:Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;

    .line 22
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;->uef(Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;)Lcom/bytedance/sdk/openadsdk/core/zjm/ivm;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/bytedance/sdk/openadsdk/core/zjm/yo$oa;-><init>(Lcom/bytedance/sdk/openadsdk/core/zjm/yo$yo;)V

    .line 23
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->oyt()I

    move-result v2

    int-to-long v2, v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 24
    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->bcc:Ljava/util/concurrent/ScheduledFuture;

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->yo:Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;

    if-eqz v0, :cond_2

    .line 26
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/zjm/yo$1;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/yo$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/zjm/yo;)V

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;->uef(Lcom/bytedance/sdk/component/adexpress/oa/xs;)V

    .line 27
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->yo:Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;->lw()Landroid/view/View;

    move-result-object v0

    .line 28
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->lw:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 31
    :cond_1
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->lw:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 32
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->moa:Lcom/bytedance/sdk/component/adexpress/oa/wk;

    if-eqz v0, :cond_3

    const/16 v1, 0x6a

    .line 33
    invoke-interface {v0, v1}, Lcom/bytedance/sdk/component/adexpress/oa/wk;->a_(I)V

    :cond_3
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/adexpress/oa/wk;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->moa:Lcom/bytedance/sdk/component/adexpress/oa/wk;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/TTDislikeDialogAbstract;)V
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->yo:Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;

    if-eqz v0, :cond_0

    .line 37
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;->uef(Lcom/bytedance/sdk/openadsdk/TTDislikeDialogAbstract;)V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/api/PAGExpressAdWrapperListener;)V
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->yo:Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;

    if-eqz v0, :cond_0

    .line 41
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;->uef(Lcom/bytedance/sdk/openadsdk/api/PAGExpressAdWrapperListener;)V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/ku;)V
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->yo:Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;

    if-eqz v0, :cond_0

    .line 35
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;->uef(Lcom/bytedance/sdk/openadsdk/core/ku;)V

    :cond_0
    return-void
.end method

.method public uef(Ljava/lang/String;)V
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo;->yo:Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;

    if-eqz v0, :cond_0

    .line 39
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;->uef(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
