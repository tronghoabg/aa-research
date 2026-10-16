.class Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/core/cq/xs/moa;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->uef(Lorg/json/JSONObject;Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa$2;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uef(ILjava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa$2;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->oa(Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;)Lcom/bytedance/sdk/openadsdk/core/cq/xs/oa;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa$2;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->oa(Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;)Lcom/bytedance/sdk/openadsdk/core/cq/xs/oa;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/cq/xs/oa;->uef(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/oa/yo;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bytedance/adsdk/ugeno/oa/yo<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa$2;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->oa(Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;)Lcom/bytedance/sdk/openadsdk/core/cq/xs/oa;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa$2;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->oa(Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;)Lcom/bytedance/sdk/openadsdk/core/cq/xs/oa;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/cq/xs/oa;->uef(Lcom/bytedance/adsdk/ugeno/oa/yo;)V

    :cond_0
    return-void
.end method
