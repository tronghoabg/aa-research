.class Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/utils/sk$oa;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic lw:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

.field final synthetic moa:Lcom/bytedance/sdk/openadsdk/core/moa/xs$uef;

.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field final synthetic yo:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/moa/uef;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/moa/xs$uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->lw:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->oa:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->yo:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->moa:Lcom/bytedance/sdk/openadsdk/core/moa/xs$uef;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public oa()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->lw:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->yo(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/moa/uef;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public uef()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->lw:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->lw:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->xs(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)V

    :cond_0
    return-void
.end method

.method public uef(Landroid/view/View;Z)V
    .locals 8

    if-nez p2, :cond_0

    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->lw:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->yo(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    move-result-object p1

    const/16 p2, 0x8

    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/gsd/uef/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;I)V

    return-void

    .line 5
    :cond_0
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->lw:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->yo(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    move-result-object p2

    const/4 v0, 0x4

    invoke-static {p2, v0}, Lcom/bytedance/sdk/openadsdk/gsd/uef/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;I)V

    .line 6
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->lw:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->bcc(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 7
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->lw:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->oa:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->yo:Ljava/lang/String;

    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->moa:Lcom/bytedance/sdk/openadsdk/core/moa/xs$uef;

    move-object v3, p1

    invoke-static/range {v2 .. v7}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/moa/uef;Landroid/view/View;Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/moa/xs$uef;)V

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->lw:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->getCurView()Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 9
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->lw:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->getCurView()Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->dj()V

    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->lw:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->getCurView()Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->oib()V

    .line 11
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->lw:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    invoke-virtual {p1, v1}, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->setIsShow(Z)V

    :cond_2
    return-void
.end method

.method public uef(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->lw:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/moa/uef;ZLcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    return-void
.end method
