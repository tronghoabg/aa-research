.class Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/core/widget/lw;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Lcom/bytedance/sdk/openadsdk/cq/xs;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$8;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$8;->uef:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public uef()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$8;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$8;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->moa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;->yo()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$8;->uef:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;->hts()V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method
