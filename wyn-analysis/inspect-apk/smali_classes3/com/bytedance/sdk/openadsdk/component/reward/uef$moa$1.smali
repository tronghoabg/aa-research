.class Lcom/bytedance/sdk/openadsdk/component/reward/uef$moa$1;
.super Lcom/bykv/vk/openvk/uef/uef/uef/lw/oa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/uef$moa;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef$moa;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef$moa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$moa$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef$moa;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/bykv/vk/openvk/uef/uef/uef/lw/oa;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uef(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;I)V
    .locals 1

    .line 2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$moa$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef$moa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef$moa;->moa:Lcom/bytedance/sdk/openadsdk/component/reward/uef;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef;->uef()Lcom/bytedance/sdk/openadsdk/component/reward/wk;

    move-result-object p1

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef$moa$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef$moa;

    iget-object v0, p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef$moa;->oa:Lcom/bytedance/sdk/openadsdk/AdSlot;

    iget-object p2, p2, Lcom/bytedance/sdk/openadsdk/component/reward/uef$moa;->yo:Lcom/bytedance/sdk/openadsdk/core/model/uef;

    invoke-virtual {p1, v0, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/wk;->uef(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/uef;)V

    return-void
.end method

.method public uef(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;ILjava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method
