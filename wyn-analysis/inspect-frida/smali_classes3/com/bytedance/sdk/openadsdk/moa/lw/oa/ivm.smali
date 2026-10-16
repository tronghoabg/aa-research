.class public Lcom/bytedance/sdk/openadsdk/moa/lw/oa/ivm;
.super Lcom/bytedance/sdk/openadsdk/moa/lw/oa/yo;
.source "SourceFile"


# instance fields
.field private moa:I

.field private oa:J

.field private final uef:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

.field private yo:J


# direct methods
.method public constructor <init>(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/yo;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/ivm;->moa:I

    .line 6
    .line 7
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/ivm;->uef:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public oa(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/ivm;->yo:J

    .line 2
    .line 3
    return-void
.end method

.method public uef(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/ivm;->moa:I

    return-void
.end method

.method public uef(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/ivm;->oa:J

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;)V
    .locals 5

    .line 7
    invoke-super {p0, p1}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/yo;->uef(Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;)V

    .line 8
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->moa()Lorg/json/JSONObject;

    move-result-object p1

    .line 9
    const-string v0, "re_vi_en_le"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/gzw/lw;->uef(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/ivm;->uef:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {v1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->lw()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/ivm;->uef:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {v2}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->bs()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    .line 13
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/xs/moa;->uef(Ljava/lang/String;)I

    move-result v0

    .line 14
    :try_start_0
    const-string v3, "level"

    invoke-virtual {p1, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 15
    const-string v0, "level_cost_time"

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    sub-long/2addr v3, v1

    invoke-virtual {p1, v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method public uef(Lorg/json/JSONObject;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    :try_start_0
    const-string v0, "total_duration"

    iget-wide v1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/ivm;->oa:J

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 4
    const-string v0, "buffers_time"

    iget-wide v1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/ivm;->yo:J

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 5
    const-string v0, "video_backup"

    iget v1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/ivm;->moa:I

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 6
    const-string v0, "FeedOverModel"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
