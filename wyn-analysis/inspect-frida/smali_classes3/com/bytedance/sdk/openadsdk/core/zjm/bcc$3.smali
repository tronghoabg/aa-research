.class Lcom/bytedance/sdk/openadsdk/core/zjm/bcc$3;
.super Lcom/bytedance/sdk/openadsdk/ab/oa/uef;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/zjm/bcc;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;JJJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic lw:Lcom/bytedance/sdk/openadsdk/core/zjm/bcc;

.field final synthetic moa:J

.field final synthetic oa:J

.field final synthetic uef:Lorg/json/JSONObject;

.field final synthetic yo:J


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/zjm/bcc;Lorg/json/JSONObject;JJJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/bcc$3;->lw:Lcom/bytedance/sdk/openadsdk/core/zjm/bcc;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/bcc$3;->uef:Lorg/json/JSONObject;

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/bcc$3;->oa:J

    .line 6
    .line 7
    iput-wide p5, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/bcc$3;->yo:J

    .line 8
    .line 9
    iput-wide p7, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/bcc$3;->moa:J

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/ab/oa/uef;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public oa()Lorg/json/JSONObject;
    .locals 5

    .line 1
    const-string v0, "duration"

    .line 2
    .line 3
    new-instance v1, Lorg/json/JSONObject;

    .line 4
    .line 5
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/bcc$3;->uef:Lorg/json/JSONObject;

    .line 9
    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    invoke-virtual {v2, v0, v3, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    :catchall_0
    return-object v1
.end method

.method public yo()Lorg/json/JSONObject;
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/bcc$3;->uef:Lorg/json/JSONObject;

    .line 2
    .line 3
    const-string v1, "callback_start"

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget-wide v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/bcc$3;->oa:J

    .line 12
    .line 13
    sub-long v0, v2, v0

    .line 14
    .line 15
    iget-wide v4, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/bcc$3;->yo:J

    .line 16
    .line 17
    sub-long/2addr v4, v2

    .line 18
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/bcc$3;->uef:Lorg/json/JSONObject;

    .line 19
    .line 20
    const-string v3, "extra_data"

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    new-instance v2, Lorg/json/JSONObject;

    .line 29
    .line 30
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 31
    .line 32
    .line 33
    :cond_0
    const-string v3, "thread_dispatch_duration"

    .line 34
    .line 35
    invoke-virtual {v2, v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 36
    .line 37
    .line 38
    const-string v0, "build_banner_ad_duration"

    .line 39
    .line 40
    invoke-virtual {v2, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    const-string v0, "ad_load_duration_full"

    .line 44
    .line 45
    iget-wide v3, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/bcc$3;->moa:J

    .line 46
    .line 47
    invoke-virtual {v2, v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    return-object v2

    .line 51
    :catchall_0
    const/4 v0, 0x0

    .line 52
    return-object v0
.end method
