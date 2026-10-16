.class Lcom/bytedance/sdk/openadsdk/core/dj/yo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/sy/moa;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/dj/yo;->uef()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/dj/yo;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/dj/yo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dj/yo$1;->uef:Lcom/bytedance/sdk/openadsdk/core/dj/yo;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uef()Lcom/bytedance/sdk/openadsdk/sy/oa/uef;
    .locals 3

    .line 1
    const-string v0, "register_status"

    .line 2
    .line 3
    invoke-static {v0}, Lcb/a;->f(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/sy/oa/uef;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dj/yo$1;->uef:Lcom/bytedance/sdk/openadsdk/core/dj/yo;

    .line 8
    .line 9
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v1, v2}, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/dj/yo;Landroid/content/Context;)Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->xs(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method
