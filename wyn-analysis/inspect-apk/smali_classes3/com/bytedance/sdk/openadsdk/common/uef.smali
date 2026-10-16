.class public Lcom/bytedance/sdk/openadsdk/common/uef;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/common/uef$oa;,
        Lcom/bytedance/sdk/openadsdk/common/uef$uef;
    }
.end annotation


# direct methods
.method public static oa(Lcom/bytedance/sdk/openadsdk/common/dz;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/common/uef;->uef(Lcom/bytedance/sdk/openadsdk/common/dz;)V

    .line 2
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/common/uef;->yo(Lcom/bytedance/sdk/openadsdk/common/dz;)Lcom/bytedance/sdk/openadsdk/component/reward/top/oa;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/common/dz;->uef()Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    move-result-object p0

    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/top/oa;)V

    return-void
.end method

.method public static oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    .line 33
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-eqz v0, :cond_1

    .line 34
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->odd()Lcom/bytedance/sdk/openadsdk/core/model/moa;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 35
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/moa;->uef()Lcom/bytedance/sdk/openadsdk/core/dz/moa;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 36
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cq()J

    move-result-wide v1

    .line 37
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->ivm(J)V

    .line 38
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->lw(J)V

    .line 39
    :cond_1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const/4 v0, 0x5

    invoke-static {p0, v0}, Lcom/bytedance/sdk/openadsdk/gsd/oa/lw;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;I)V

    return-void
.end method

.method private static oa(Lcom/bytedance/sdk/openadsdk/common/ab;Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;ZLjava/lang/String;)Z
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 4
    :cond_0
    iget-object p3, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 5
    invoke-static {p3}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p3

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p3, p2, v0}, Lcom/bytedance/sdk/openadsdk/common/ab;->uef(ZZLjava/lang/Runnable;)Z

    move-result p0

    const/4 p2, 0x1

    if-eqz p0, :cond_1

    return p2

    .line 7
    :cond_1
    iget-object p0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    instance-of p0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    if-nez p0, :cond_2

    return p2

    .line 8
    :cond_2
    iget-object p0, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    check-cast p0, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    .line 9
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/activity/single/lw;->bcc()Z

    move-result p0

    return p0
.end method

.method private static oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;Landroid/view/View;)Z
    .locals 5

    .line 23
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->dhk()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->vjj:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cz:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->fz:Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/dz;->cq()Z

    move-result v0

    .line 25
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    invoke-virtual {v2, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->ivm(Z)V

    .line 26
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->ivm(I)V

    .line 27
    instance-of v2, p1, Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    if-eqz v2, :cond_1

    .line 28
    check-cast p1, Lcom/bytedance/sdk/openadsdk/core/ivm/moa;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->af:Landroid/content/Context;

    const-string v3, "tt_close_btn"

    .line 29
    invoke-static {v2, v3}, Lcom/bytedance/sdk/component/utils/orq;->moa(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    .line 30
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 31
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sk:Lcom/bytedance/sdk/component/utils/ue;

    const/16 v2, 0x258

    const-wide/16 v3, 0x1388

    invoke-virtual {p1, v2, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 32
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p0

    if-eqz p0, :cond_3

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    return v1

    :cond_3
    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_4
    return v1
.end method

.method private static oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/common/uef$oa;)Z
    .locals 3

    .line 10
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    instance-of p1, p1, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 11
    invoke-interface {p2}, Lcom/bytedance/sdk/openadsdk/common/uef$oa;->uef()V

    return v0

    .line 12
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->bcc(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p1

    .line 13
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->ivm(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v1

    .line 14
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->lw(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v2

    if-nez v1, :cond_3

    if-eqz v2, :cond_1

    .line 15
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;

    sget v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->oa:I

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->moa(I)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 16
    :cond_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cq:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_2

    .line 17
    invoke-interface {p2}, Lcom/bytedance/sdk/openadsdk/common/uef$oa;->uef()V

    return v0

    .line 18
    :cond_2
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dxx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cq;->moa(Z)V

    return p1

    :cond_3
    :goto_0
    if-eqz p1, :cond_4

    .line 19
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->cz()V

    goto :goto_1

    .line 20
    :cond_4
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->zjm()Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_5

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    goto :goto_1

    .line 22
    :cond_5
    invoke-interface {p2}, Lcom/bytedance/sdk/openadsdk/common/uef$oa;->uef()V

    :goto_1
    return v0
.end method

.method public static uef(Lcom/bytedance/sdk/openadsdk/common/dz;)V
    .locals 4

    .line 4
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/common/dz;->uef()Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 5
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    if-nez v1, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->zjm()Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/common/dz;->oa()Ljava/lang/String;

    move-result-object v2

    .line 8
    new-instance v3, Lcom/bytedance/sdk/openadsdk/common/uef$1;

    invoke-direct {v3, v2, v0, v1, p0}, Lcom/bytedance/sdk/openadsdk/common/uef$1;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;Landroid/view/View;Lcom/bytedance/sdk/openadsdk/common/dz;)V

    .line 9
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result p0

    invoke-virtual {v1, p0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    .line 11
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;-><init>()V

    .line 12
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cq()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->oa(J)V

    .line 13
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->gr()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->moa(J)V

    .line 14
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bs()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->yo(J)V

    const/4 v1, 0x3

    .line 15
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->yo(I)V

    .line 16
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->rt()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->moa(I)V

    .line 17
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->oa()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;->uef(J)V

    .line 18
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    .line 19
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->bcc()Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;

    move-result-object v1

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    .line 20
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->lw()Lcom/bytedance/sdk/openadsdk/moa/xs;

    move-result-object v2

    .line 21
    invoke-static {v1, v0, v2}, Lcom/bytedance/sdk/openadsdk/moa/lw/uef/uef;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/oa/uef;Lcom/bytedance/sdk/openadsdk/moa/lw/oa/wk$uef;Lcom/bytedance/sdk/openadsdk/moa/xs;)V

    .line 22
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ivm:I

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/pz;->yo(I)V

    .line 23
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    const-string v0, "skip"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->uef(Ljava/lang/String;Z)V

    return-void
.end method

.method public static uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;Lcom/bytedance/sdk/openadsdk/common/uef$oa;)V
    .locals 3

    .line 24
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->yo:Z

    if-eqz v0, :cond_2

    .line 25
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 26
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gsd:Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;->uef()Lcom/bytedance/sdk/openadsdk/component/reward/view/yo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 27
    iget v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/view/yo;->moa:I

    if-eqz v0, :cond_2

    .line 28
    :cond_0
    invoke-interface {p1, v2, v1}, Lcom/bytedance/sdk/openadsdk/common/uef$oa;->uef(ZI)V

    goto :goto_0

    .line 29
    :cond_1
    invoke-interface {p1, v2, v1}, Lcom/bytedance/sdk/openadsdk/common/uef$oa;->uef(ZI)V

    .line 30
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->cq:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_3

    .line 31
    :cond_2
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/common/uef$oa;->uef()V

    .line 32
    :cond_3
    :goto_0
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/common/uef;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    return-void
.end method

.method public static uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;Ljava/lang/String;)V
    .locals 2

    if-eqz p0, :cond_2

    .line 33
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->hg:Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;

    if-nez p1, :cond_0

    goto :goto_0

    .line 34
    :cond_0
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    .line 35
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    instance-of p1, p1, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    .line 36
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->vjj:Z

    if-eqz v0, :cond_1

    if-nez p1, :cond_1

    .line 37
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gsd:Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;->uef()Lcom/bytedance/sdk/openadsdk/component/reward/view/yo;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 38
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gsd:Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/cz;->uef()Lcom/bytedance/sdk/openadsdk/component/reward/view/yo;

    move-result-object v0

    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/view/yo;->setSoundMute(Z)V

    .line 39
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    invoke-virtual {v0, v1, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->uef(ZLjava/lang/String;)V

    .line 40
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->ku:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->lw(Z)V

    .line 41
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gzw:Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;

    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/cz;->oa(Z)V

    if-nez p1, :cond_2

    .line 42
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/common/uef;->yo(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/common/ab;Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;ZLjava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/common/uef;->oa(Lcom/bytedance/sdk/openadsdk/common/ab;Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;ZLjava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;Landroid/view/View;)Z
    .locals 0

    .line 2
    invoke-static {p0, p1}, Lcom/bytedance/sdk/openadsdk/common/uef;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/common/uef$oa;)Z
    .locals 0

    .line 3
    invoke-static {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/common/uef;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/common/uef$oa;)Z

    move-result p0

    return p0
.end method

.method private static yo(Lcom/bytedance/sdk/openadsdk/common/dz;)Lcom/bytedance/sdk/openadsdk/component/reward/top/oa;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/common/dz;->uef()Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    move-result-object v3

    .line 2
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/common/dz;->oa()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/common/dz;->moa()Lcom/bytedance/sdk/openadsdk/common/uef$oa;

    move-result-object v5

    .line 4
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/common/dz;->ivm()Lcom/bytedance/sdk/openadsdk/common/ab;

    move-result-object v2

    .line 5
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/common/dz;->lw()Z

    move-result v4

    .line 6
    new-instance v0, Lcom/bytedance/sdk/openadsdk/common/uef$2;

    move-object v6, p0

    invoke-direct/range {v0 .. v6}, Lcom/bytedance/sdk/openadsdk/common/uef$2;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/common/ab;Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;ZLcom/bytedance/sdk/openadsdk/common/uef$oa;Lcom/bytedance/sdk/openadsdk/common/dz;)V

    return-object v0
.end method

.method private static yo(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V
    .locals 3

    if-eqz p0, :cond_3

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-nez v0, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->odd()Lcom/bytedance/sdk/openadsdk/core/model/moa;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/moa;->uef()Lcom/bytedance/sdk/openadsdk/core/dz/moa;

    move-result-object v0

    .line 10
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->tpx:Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/bs;->cq()J

    move-result-wide v1

    .line 11
    iget-boolean p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    if-eqz p0, :cond_2

    .line 12
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->bcc(J)V

    return-void

    .line 13
    :cond_2
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->cz(J)V

    :cond_3
    :goto_0
    return-void
.end method
