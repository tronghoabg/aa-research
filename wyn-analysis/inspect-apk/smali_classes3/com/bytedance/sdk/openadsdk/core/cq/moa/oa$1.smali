.class Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->uef()V
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
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uef(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->oa(Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;)Lcom/bytedance/sdk/openadsdk/core/cq/xs/oa;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/core/cq/xs/yo;->uef(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public uef(Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->oa(Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;)Lcom/bytedance/sdk/openadsdk/core/cq/xs/oa;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/cq/xs/yo;->oa(Ljava/lang/String;)V

    return-void
.end method
