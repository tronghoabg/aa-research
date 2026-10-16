.class Lcom/bytedance/sdk/openadsdk/activity/single/lw$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/component/reward/top/oa;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/activity/single/lw;->b_()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/activity/single/lw;

.field final synthetic uef:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/activity/single/lw;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/lw$2;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/lw$2;->uef:Landroid/view/View;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public moa(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/lw$2;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public oa(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/lw$2;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/lw;->f_()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public uef(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/lw$2;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/activity/single/lw;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/lw;ZZLjava/lang/Runnable;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/lw$2;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/lw;->bcc()Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    return-void

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/lw$2;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->lw(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/lw$2;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->bcc(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/lw$2;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->cz()V

    return-void

    .line 6
    :cond_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/lw$2;->uef:Landroid/view/View;

    if-eqz p1, :cond_3

    .line 7
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    return-void

    .line 8
    :cond_3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/lw$2;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->swd()V

    return-void

    .line 9
    :cond_4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/lw$2;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/lw$2;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->cz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cq:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_5

    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/lw$2;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->swd()V

    return-void

    .line 11
    :cond_5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/lw$2;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->swd()V

    return-void
.end method

.method public uef(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 12
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/lw$2;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/lw;->uef(Ljava/lang/String;)V

    return-void
.end method

.method public yo(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/lw$2;->uef:Landroid/view/View;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
