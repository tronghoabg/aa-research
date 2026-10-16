.class Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;
.super Lcom/bytedance/sdk/openadsdk/core/orq;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/uef;->oa(Lcom/bytedance/sdk/openadsdk/AdSlot;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef;

.field final synthetic moa:J

.field final synthetic oa:Ljava/lang/Object;

.field uef:Z

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/AdSlot;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef;Ljava/lang/Object;Lcom/bytedance/sdk/openadsdk/AdSlot;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->oa:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->yo:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 6
    .line 7
    iput-wide p4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->moa:J

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/orq;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->uef:Z

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public uef()Ljava/lang/String;
    .locals 3

    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->yo:Lcom/bytedance/sdk/openadsdk/AdSlot;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getBidAdm()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef;->uef()Lcom/bytedance/sdk/openadsdk/component/reward/wk;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->yo:Lcom/bytedance/sdk/openadsdk/AdSlot;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getCodeId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/wk;->uef(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    .line 21
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public uef(ILjava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->oa:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef;

    invoke-virtual {v1, v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef;->uef(Ljava/lang/Object;ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/yo;)V
    .locals 8

    .line 3
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->lw()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->lw()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 4
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef;

    iget-object v0, p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef;->uef:Landroid/content/Context;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->yo:Lcom/bytedance/sdk/openadsdk/AdSlot;

    invoke-virtual {p2, v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef;->uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/AdSlot;)Ljava/lang/Object;

    move-result-object v4

    .line 5
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->yo:Lcom/bytedance/sdk/openadsdk/AdSlot;

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getBidAdm()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 6
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/orq/uef/moa;->uef()Lcom/bytedance/sdk/openadsdk/orq/uef/moa;

    move-result-object p2

    .line 7
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->lw()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->lw()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 8
    :goto_0
    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/orq/uef/moa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->moa:J

    sub-long/2addr v0, v2

    .line 10
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->xs()Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    move-result-object p2

    invoke-static {p2, v0, v1}, Lcom/bytedance/sdk/openadsdk/ab/moa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;J)V

    .line 11
    :cond_1
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->oa:Ljava/lang/Object;

    if-eqz p2, :cond_2

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->pz()I

    move-result p2

    if-nez p2, :cond_2

    .line 12
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->yo:Lcom/bytedance/sdk/openadsdk/AdSlot;

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->oa:Ljava/lang/Object;

    iget-boolean v7, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->uef:Z

    move-object v6, v4

    move-object v4, p1

    invoke-virtual/range {v2 .. v7}, Lcom/bytedance/sdk/openadsdk/component/reward/uef;->uef(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/uef;Ljava/lang/Object;Ljava/lang/Object;Z)V

    move-object v3, v4

    move-object v4, v6

    goto :goto_1

    :cond_2
    move-object v3, p1

    .line 13
    :goto_1
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef;

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->yo:Lcom/bytedance/sdk/openadsdk/AdSlot;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->oa:Ljava/lang/Object;

    invoke-virtual/range {v2 .. v7}, Lcom/bytedance/sdk/openadsdk/component/reward/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;Ljava/lang/Object;Lcom/bytedance/sdk/openadsdk/AdSlot;ZLjava/lang/Object;)V

    return-void

    .line 14
    :cond_3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->oa:Ljava/lang/Object;

    if-eqz p1, :cond_4

    .line 15
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef;

    const/4 v1, -0x3

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/cz;->uef(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef;->uef(Ljava/lang/Object;ILjava/lang/String;)V

    .line 16
    invoke-virtual {p2, v1}, Lcom/bytedance/sdk/openadsdk/core/model/yo;->uef(I)V

    .line 17
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef;->ivm()I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/openadsdk/core/model/yo;->yo(I)V

    .line 18
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/model/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/yo;)V

    :cond_4
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;)Z
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef;->uef()Lcom/bytedance/sdk/openadsdk/component/reward/wk;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/wk;->uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$2;->uef:Z

    return p1
.end method
