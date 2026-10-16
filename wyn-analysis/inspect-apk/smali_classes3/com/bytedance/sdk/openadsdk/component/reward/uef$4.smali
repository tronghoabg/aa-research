.class Lcom/bytedance/sdk/openadsdk/component/reward/uef$4;
.super Lcom/bykv/vk/openvk/uef/uef/uef/lw/oa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/uef;Ljava/lang/Object;ZLcom/bytedance/sdk/openadsdk/component/reward/uef$yo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic ivm:Lcom/bytedance/sdk/openadsdk/component/reward/uef;

.field final synthetic lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef$yo;

.field final synthetic moa:Lcom/bytedance/sdk/openadsdk/core/model/uef;

.field final synthetic oa:Z

.field final synthetic uef:Ljava/lang/Object;

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/AdSlot;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef;Ljava/lang/Object;ZLcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/component/reward/uef$yo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$4;->ivm:Lcom/bytedance/sdk/openadsdk/component/reward/uef;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$4;->uef:Ljava/lang/Object;

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$4;->oa:Z

    .line 6
    .line 7
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$4;->yo:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$4;->moa:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$4;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef$yo;

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
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$4;->ivm:Lcom/bytedance/sdk/openadsdk/component/reward/uef;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$4;->uef:Ljava/lang/Object;

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef;->oa(Ljava/lang/Object;)V

    .line 2
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$4;->oa:Z

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$4;->ivm:Lcom/bytedance/sdk/openadsdk/component/reward/uef;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef;->uef()Lcom/bytedance/sdk/openadsdk/component/reward/wk;

    move-result-object p1

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$4;->yo:Lcom/bytedance/sdk/openadsdk/AdSlot;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$4;->moa:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    invoke-virtual {p1, p2, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/wk;->uef(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V

    return-void

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$4;->ivm:Lcom/bytedance/sdk/openadsdk/component/reward/uef;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$4;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef$yo;

    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef;Lcom/bytedance/sdk/openadsdk/component/reward/uef$yo;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$4;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef$yo;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$4;->uef:Ljava/lang/Object;

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef$yo;->uef(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public uef(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;ILjava/lang/String;)V
    .locals 1

    .line 6
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$4;->ivm:Lcom/bytedance/sdk/openadsdk/component/reward/uef;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$4;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef$yo;

    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef;Lcom/bytedance/sdk/openadsdk/component/reward/uef$yo;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 7
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$4;->lw:Lcom/bytedance/sdk/openadsdk/component/reward/uef$yo;

    invoke-virtual {p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef$yo;->uef(ILjava/lang/String;)V

    :cond_0
    return-void
.end method
