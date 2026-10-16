.class public Lcom/bytedance/sdk/openadsdk/moa/lw/oa/bcc;
.super Lcom/bytedance/sdk/openadsdk/moa/lw/oa/yo;
.source "SourceFile"


# instance fields
.field private moa:I

.field private oa:J

.field private final uef:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

.field private yo:J


# direct methods
.method public constructor <init>(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/yo;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/bcc;->uef:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public oa(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/bcc;->yo:J

    .line 2
    .line 3
    return-void
.end method

.method public uef(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/bcc;->moa:I

    return-void
.end method

.method public uef(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/bcc;->oa:J

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;)V
    .locals 3

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/bcc;->uef:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->gr()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/bcc;->uef:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->lw()Ljava/lang/String;

    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/bcc;->uef:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {v1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->bs()Ljava/lang/String;

    move-result-object v1

    .line 10
    invoke-static {v0, v1}, Lcom/bykv/vk/openvk/uef/uef/oa/moa/oa;->oa(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 11
    invoke-static {v0, v1}, Lcom/bykv/vk/openvk/uef/uef/oa/moa/oa;->yo(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v2, v0

    :cond_0
    invoke-static {v2}, Lcom/bykv/vk/openvk/uef/uef/uef/xs/moa;->uef(Ljava/io/File;)I

    move-result v0

    .line 13
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->moa()Lorg/json/JSONObject;

    move-result-object p1

    .line 14
    :try_start_0
    const-string v1, "moov_box_pos"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method

.method public uef(Lorg/json/JSONObject;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    :try_start_0
    const-string v0, "video_start_duration"

    iget-wide v1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/bcc;->oa:J

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 4
    const-string v0, "video_cache_size"

    iget-wide v1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/bcc;->yo:J

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 5
    const-string v0, "is_auto_play"

    iget v1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/bcc;->moa:I

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 6
    const-string v0, "FeedPlayModel"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
