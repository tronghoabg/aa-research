.class Lcom/bytedance/sdk/openadsdk/core/oyt$9;
.super Lcom/bytedance/sdk/openadsdk/core/orq;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/cq/moa;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/cq/moa;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/oyt;Lcom/bytedance/sdk/openadsdk/cq/moa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$9;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$9;->uef:Lcom/bytedance/sdk/openadsdk/cq/moa;

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/orq;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public uef(ILjava/lang/String;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$9;->uef:Lcom/bytedance/sdk/openadsdk/cq/moa;

    const/4 p2, 0x0

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lcom/bytedance/sdk/openadsdk/cq/moa;->uef(ZLcom/bytedance/sdk/openadsdk/core/model/uef;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/yo;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$9;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$9;->uef:Lcom/bytedance/sdk/openadsdk/cq/moa;

    invoke-static {v0, p1, p2, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/core/oyt;Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/core/model/yo;Lcom/bytedance/sdk/openadsdk/cq/moa;)V

    return-void
.end method
