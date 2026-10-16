.class Lcom/bytedance/sdk/openadsdk/activity/single/bcc$1;
.super Lcom/bytedance/sdk/openadsdk/common/ab;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->bcc()Lcom/bytedance/sdk/openadsdk/common/ab;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/activity/single/bcc;Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc$1;->uef:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/bytedance/sdk/openadsdk/common/ab;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public oa()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc$1;->uef:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->xs:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->wrv()Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "reward_verify"

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc$1;->uef:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 19
    .line 20
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->xs:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->bs()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return v2

    .line 30
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 31
    return v0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc$1;->uef:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V

    return-void
.end method

.method public uef(Z)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc$1;->uef:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->xs:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->oa(Z)V

    return-void
.end method

.method public uef()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc$1;->uef:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->xs:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->cq()Z

    move-result v0

    return v0
.end method

.method public yo()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/bcc$1;->uef:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->swd()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
