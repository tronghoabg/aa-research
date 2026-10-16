.class Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa;Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$2;->oa:Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$2;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public uef(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$2;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;->uef(ILjava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public uef(Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$2;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;->uef(Lorg/json/JSONObject;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
