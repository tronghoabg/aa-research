.class Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$uef;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->onRenderSuccess(Landroid/view/View;FF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$4;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uef()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$4;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->xs:Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/wk;->uef()V

    .line 3
    const-string v0, "BaseManagerBundle"

    const-string v1, "onSendHeartbeat: "

    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$oa;)V
    .locals 2

    .line 4
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onHeartbeatStatusChanged: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "BaseManagerBundle"

    invoke-static {v1, v0}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    sget-object v0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$oa;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/oa$oa;

    if-ne p1, v0, :cond_0

    .line 6
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$4;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;)Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/uef;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/uef;->oa()V

    .line 7
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$4;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;)Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/uef;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa$4;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    :cond_0
    return-void
.end method
