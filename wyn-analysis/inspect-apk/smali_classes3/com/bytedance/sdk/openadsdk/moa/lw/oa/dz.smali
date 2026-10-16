.class public Lcom/bytedance/sdk/openadsdk/moa/lw/oa/dz;
.super Lcom/bytedance/sdk/openadsdk/moa/lw/oa/yo;
.source "SourceFile"


# instance fields
.field private final lw:Ljava/lang/String;

.field private final moa:I

.field private oa:J

.field private uef:J

.field private final yo:I


# direct methods
.method public constructor <init>(Lcom/bykv/vk/openvk/uef/uef/uef/yo/uef;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/yo;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/uef;->uef()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/dz;->yo:I

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/uef;->oa()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/dz;->moa:I

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/uef;->yo()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/dz;->lw:Ljava/lang/String;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public oa(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/dz;->oa:J

    .line 2
    .line 3
    return-void
.end method

.method public uef(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/dz;->uef:J

    return-void
.end method

.method public uef(Lorg/json/JSONObject;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    :try_start_0
    const-string v0, "buffers_time"

    iget-wide v1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/dz;->uef:J

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 3
    const-string v0, "total_duration"

    iget-wide v1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/dz;->oa:J

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 4
    const-string v0, "error_code"

    iget v1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/dz;->yo:I

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 5
    const-string v0, "extra_error_code"

    iget v1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/dz;->moa:I

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 6
    const-string v0, "error_message"

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/dz;->lw:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 7
    const-string v0, "PlayErrorModel"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
