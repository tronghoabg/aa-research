.class Lcom/bytedance/sdk/openadsdk/component/reward/bs$1;
.super Lcom/bytedance/sdk/openadsdk/core/orq;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/bs;->oa(Lcom/bytedance/sdk/openadsdk/AdSlot;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/AdSlot;

.field uef:Z

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/component/reward/bs;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/bs;Lcom/bytedance/sdk/openadsdk/AdSlot;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$1;->yo:Lcom/bytedance/sdk/openadsdk/component/reward/bs;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$1;->oa:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/orq;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$1;->uef:Z

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public uef()Ljava/lang/String;
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$1;->yo:Lcom/bytedance/sdk/openadsdk/component/reward/bs;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/bs;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/bs;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/ab;->uef(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/component/reward/ab;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$1;->oa:Lcom/bytedance/sdk/openadsdk/AdSlot;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getCodeId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/ab;->uef(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uef(ILjava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/yo;)V
    .locals 6

    .line 4
    iget-boolean p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$1;->uef:Z

    if-eqz p2, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->lw()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->lw()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    .line 6
    new-instance v2, Lcom/bytedance/sdk/openadsdk/component/reward/dhk;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$1;->yo:Lcom/bytedance/sdk/openadsdk/component/reward/bs;

    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/component/reward/bs;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/bs;)Landroid/content/Context;

    move-result-object p2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$1;->oa:Lcom/bytedance/sdk/openadsdk/AdSlot;

    invoke-direct {v2, p2, p1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/dhk;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/AdSlot;)V

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$1;->yo:Lcom/bytedance/sdk/openadsdk/component/reward/bs;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$1;->oa:Lcom/bytedance/sdk/openadsdk/AdSlot;

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/component/reward/bs;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/bs;Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/component/reward/dhk;Lcom/bytedance/sdk/openadsdk/AdSlot;ZLcom/bytedance/sdk/openadsdk/api/reward/PAGRewardedAdLoadListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;)Z
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$1;->yo:Lcom/bytedance/sdk/openadsdk/component/reward/bs;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/bs;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/bs;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/ab;->uef(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/component/reward/ab;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/ab;->uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/bs$1;->uef:Z

    return p1
.end method
