.class Lcom/bytedance/sdk/openadsdk/core/oyt$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/cq/moa;


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
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$8;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$8;->uef:Lcom/bytedance/sdk/openadsdk/cq/moa;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public uef(ZLcom/bytedance/sdk/openadsdk/core/model/uef;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/oyt$8$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/oyt$8$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/oyt$8;ZLcom/bytedance/sdk/openadsdk/core/model/uef;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
