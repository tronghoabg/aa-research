.class Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/core/ue;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->ab()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm$2;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public n_()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm$2;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;)Lcom/bytedance/sdk/openadsdk/core/widget/sy;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm$2;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;)Lcom/bytedance/sdk/openadsdk/core/widget/sy;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm$2;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    .line 16
    .line 17
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->wrv:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 18
    .line 19
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/widget/sy;->uef(Landroid/app/Activity;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public o_()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm$2;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;)Lcom/bytedance/sdk/openadsdk/core/widget/sy;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm$2;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;)Lcom/bytedance/sdk/openadsdk/core/widget/sy;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/widget/sy;->o_()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public p_()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm$2;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->wrv:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 4
    .line 5
    iget-boolean v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->vjj:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->wrv()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0

    .line 14
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->bcc()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public q_()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm$2;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public r_()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm$2;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/zjm;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public s_()V
    .locals 0

    return-void
.end method
