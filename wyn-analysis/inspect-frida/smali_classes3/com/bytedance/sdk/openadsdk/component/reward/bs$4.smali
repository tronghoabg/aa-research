.class Lcom/bytedance/sdk/openadsdk/component/reward/bs$4;
.super Lcom/bykv/vk/openvk/uef/uef/uef/lw/oa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/bs;->uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/component/reward/dhk;Lcom/bytedance/sdk/openadsdk/AdSlot;ZLcom/bytedance/sdk/openadsdk/component/reward/bs$yo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic ivm:Lcom/bytedance/sdk/openadsdk/component/reward/bs;

.field final synthetic lw:Lcom/bytedance/sdk/openadsdk/component/reward/bs$yo;

.field final synthetic moa:Lcom/bytedance/sdk/openadsdk/core/model/uef;

.field final synthetic oa:Z

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/component/reward/dhk;

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/AdSlot;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/bs;Lcom/bytedance/sdk/openadsdk/component/reward/dhk;ZLcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/component/reward/bs$yo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$4;->ivm:Lcom/bytedance/sdk/openadsdk/component/reward/bs;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$4;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/dhk;

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$4;->oa:Z

    .line 6
    .line 7
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$4;->yo:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$4;->moa:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$4;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/bs$yo;

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/lw/oa;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public uef(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$4;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/dhk;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/dhk;->oa()V

    .line 2
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$4;->oa:Z

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$4;->ivm:Lcom/bytedance/sdk/openadsdk/component/reward/bs;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/bs;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/bs;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/ab;->uef(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/component/reward/ab;

    move-result-object p1

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$4;->yo:Lcom/bytedance/sdk/openadsdk/AdSlot;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$4;->moa:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    invoke-virtual {p1, p2, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/ab;->uef(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V

    return-void

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$4;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/bs$yo;

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->pz()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    .line 5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$4;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/bs$yo;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$4;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/dhk;

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/component/reward/dhk;->uef()Lcom/bytedance/sdk/openadsdk/component/reward/zjm;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/bs$yo;->uef(Lcom/bytedance/sdk/openadsdk/api/reward/PAGRewardedAd;)V

    :cond_1
    return-void
.end method

.method public uef(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;ILjava/lang/String;)V
    .locals 1

    .line 6
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$4;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/bs$yo;

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->pz()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 7
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$4;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/bs$yo;

    invoke-virtual {p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/component/reward/bs$yo;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method
