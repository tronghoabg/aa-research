.class Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1$1;
.super Lcom/bytedance/sdk/openadsdk/ab/oa/uef;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lorg/json/JSONObject;

.field final synthetic uef:Lorg/json/JSONObject;

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1;Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1$1;->yo:Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1$1;->uef:Lorg/json/JSONObject;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1$1;->oa:Lorg/json/JSONObject;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/ab/oa/uef;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public uef()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1$1;->oa:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public yo()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gsd/oa/moa$1$1;->uef:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object v0
.end method
