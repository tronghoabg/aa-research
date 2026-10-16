.class Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/cq/yo;


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

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$9;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$9;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

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
    .locals 2

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$9;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Z)Z

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$9;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    move-result-object v0

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oyt:Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/view/dj;->zjm()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    return-void
.end method

.method public uef(ZILjava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$9;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->cz:Z

    .line 2
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->lw(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$9;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;Z)Z

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$9;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;)Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    move-result-object v2

    iget-boolean v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->gem:Z

    invoke-virtual {v0, v2, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(ZZ)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$9;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->moa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy$9;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;

    invoke-virtual {v0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/sy;->uef(ZILjava/lang/String;)V

    :cond_1
    return-void
.end method
