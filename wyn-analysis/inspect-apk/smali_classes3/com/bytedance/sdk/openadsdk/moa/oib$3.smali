.class Lcom/bytedance/sdk/openadsdk/moa/oib$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/moa/oib;->bcc()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/moa/oib;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/moa/oib;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/moa/oib$3;->uef:Lcom/bytedance/sdk/openadsdk/moa/oib;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    new-instance v2, Lorg/json/JSONObject;

    .line 6
    .line 7
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/moa/oib$3;->uef:Lcom/bytedance/sdk/openadsdk/moa/oib;

    .line 11
    .line 12
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "ts"

    .line 17
    .line 18
    invoke-static {v3, v2, v1, v0}, Lcom/bytedance/sdk/openadsdk/moa/oib;->uef(Lcom/bytedance/sdk/openadsdk/moa/oib;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/oib$3;->uef:Lcom/bytedance/sdk/openadsdk/moa/oib;

    .line 22
    .line 23
    const-string v1, "type"

    .line 24
    .line 25
    const-string v3, "native_enterBackground"

    .line 26
    .line 27
    invoke-static {v0, v2, v1, v3}, Lcom/bytedance/sdk/openadsdk/moa/oib;->uef(Lcom/bytedance/sdk/openadsdk/moa/oib;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/oib$3;->uef:Lcom/bytedance/sdk/openadsdk/moa/oib;

    .line 31
    .line 32
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/moa/oib;->yo(Lcom/bytedance/sdk/openadsdk/moa/oib;)Lorg/json/JSONArray;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/oib;->uef(Lcom/bytedance/sdk/openadsdk/moa/oib;Lorg/json/JSONArray;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
