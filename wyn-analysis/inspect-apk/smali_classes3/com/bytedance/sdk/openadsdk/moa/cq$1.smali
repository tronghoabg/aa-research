.class Lcom/bytedance/sdk/openadsdk/moa/cq$1;
.super Lcom/bytedance/sdk/openadsdk/ab/oa/uef;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/moa/cq;->uef(Ljava/lang/String;Lorg/json/JSONObject;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic lw:Lcom/bytedance/sdk/openadsdk/moa/cq;

.field final synthetic moa:I

.field final synthetic oa:Lorg/json/JSONObject;

.field final synthetic uef:J

.field final synthetic yo:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/moa/cq;JLorg/json/JSONObject;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->lw:Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 2
    .line 3
    iput-wide p2, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->uef:J

    .line 4
    .line 5
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->oa:Lorg/json/JSONObject;

    .line 6
    .line 7
    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->yo:Ljava/lang/String;

    .line 8
    .line 9
    iput p6, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->moa:I

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
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-wide v1, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->uef:J

    .line 7
    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    cmp-long v3, v1, v3

    .line 11
    .line 12
    if-lez v3, :cond_0

    .line 13
    .line 14
    const-string v3, "duration"

    .line 15
    .line 16
    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    :catchall_0
    :cond_0
    return-object v0
.end method

.method public uef()Lorg/json/JSONObject;
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "load_start"

    .line 7
    .line 8
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->yo:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    const-string v1, "load_finish"

    .line 17
    .line 18
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->yo:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    const-string v1, "progress_load_finish"

    .line 27
    .line 28
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->yo:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    :cond_0
    const-string v1, "is_reused"

    .line 37
    .line 38
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->lw:Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 39
    .line 40
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/moa/cq;->moa(Lcom/bytedance/sdk/openadsdk/moa/cq;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 45
    .line 46
    .line 47
    :cond_1
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->lw:Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 48
    .line 49
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/moa/cq;->uef(Lcom/bytedance/sdk/openadsdk/moa/cq;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/dz/uef;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    const-string v1, "is_lp_pre_render"

    .line 60
    .line 61
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->lw:Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 62
    .line 63
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/moa/cq;->lw(Lcom/bytedance/sdk/openadsdk/moa/cq;)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    :cond_2
    return-object v0

    .line 71
    :catchall_0
    const/4 v0, 0x0

    .line 72
    return-object v0
.end method

.method public yo()Lorg/json/JSONObject;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->oa:Lorg/json/JSONObject;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->lw:Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 6
    .line 7
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/moa/cq;->uef(Lcom/bytedance/sdk/openadsdk/moa/cq;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->oa:Lorg/json/JSONObject;

    .line 16
    .line 17
    const-string v2, "is_playable"

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x1

    .line 21
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->oa:Lorg/json/JSONObject;

    .line 25
    .line 26
    const-string v2, "usecache"

    .line 27
    .line 28
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;->uef()Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->lw:Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 33
    .line 34
    invoke-static {v6}, Lcom/bytedance/sdk/openadsdk/moa/cq;->uef(Lcom/bytedance/sdk/openadsdk/moa/cq;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-virtual {v5, v6}, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-virtual {v1, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    const-string v0, "load_finish"

    .line 48
    .line 49
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->yo:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_0

    .line 56
    .line 57
    const-string v0, "load_fail"

    .line 58
    .line 59
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->yo:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->oa:Lorg/json/JSONObject;

    .line 68
    .line 69
    const-string v1, "playable_has_show"

    .line 70
    .line 71
    iget v2, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->moa:I

    .line 72
    .line 73
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    :cond_1
    const-string v0, "stay_page"

    .line 77
    .line 78
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->yo:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->oa:Lorg/json/JSONObject;

    .line 87
    .line 88
    const-string v1, "first_page"

    .line 89
    .line 90
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->lw:Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 91
    .line 92
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/moa/cq;->oa(Lcom/bytedance/sdk/openadsdk/moa/cq;)I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-le v2, v4, :cond_2

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    move v3, v4

    .line 100
    :goto_0
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    .line 102
    .line 103
    :catch_0
    :cond_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->lw:Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 104
    .line 105
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/moa/cq;->yo(Lcom/bytedance/sdk/openadsdk/moa/cq;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/cq$1;->oa:Lorg/json/JSONObject;

    .line 109
    .line 110
    return-object v0
.end method
