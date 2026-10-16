.class Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef;->uef(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/core/cq/xs/moa;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic moa:Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef;

.field final synthetic oa:Lorg/json/JSONObject;

.field final synthetic uef:Lorg/json/JSONObject;

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/core/cq/xs/moa;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef;Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/core/cq/xs/moa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef$1;->moa:Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef$1;->uef:Lorg/json/JSONObject;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef$1;->oa:Lorg/json/JSONObject;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef$1;->yo:Lcom/bytedance/sdk/openadsdk/core/cq/xs/moa;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef$1;->moa:Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef$1;->uef:Lorg/json/JSONObject;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef$1;->oa:Lorg/json/JSONObject;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef$1;->yo:Lcom/bytedance/sdk/openadsdk/core/cq/xs/moa;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef;Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/core/cq/xs/moa;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
