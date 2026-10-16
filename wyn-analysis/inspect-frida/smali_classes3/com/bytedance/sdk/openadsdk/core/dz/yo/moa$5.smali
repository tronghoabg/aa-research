.class final Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$5;
.super Lcom/bytedance/sdk/component/bcc/oa/yo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/dz/uef;JLcom/bytedance/sdk/openadsdk/core/dz/uef/oa$uef;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field final synthetic lw:Ljava/lang/String;

.field final synthetic moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/core/dz/uef;

.field final synthetic uef:J

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/core/dz/uef/oa$uef;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLcom/bytedance/sdk/openadsdk/core/dz/uef;Lcom/bytedance/sdk/openadsdk/core/dz/uef/oa$uef;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-wide p2, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$5;->uef:J

    .line 2
    .line 3
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$5;->oa:Lcom/bytedance/sdk/openadsdk/core/dz/uef;

    .line 4
    .line 5
    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$5;->yo:Lcom/bytedance/sdk/openadsdk/core/dz/uef/oa$uef;

    .line 6
    .line 7
    iput-object p6, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$5;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 8
    .line 9
    iput-object p7, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$5;->lw:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/bcc/oa/yo;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "duration"

    .line 7
    .line 8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    iget-wide v4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$5;->uef:J

    .line 13
    .line 14
    sub-long/2addr v2, v4

    .line 15
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$5;->oa:Lcom/bytedance/sdk/openadsdk/core/dz/uef;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    const-string v2, "load_vast_fail"

    .line 21
    .line 22
    const-string v3, "error_code"

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    :try_start_1
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->cz()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$5;->oa:Lcom/bytedance/sdk/openadsdk/core/dz/uef;

    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->ivm()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_1

    .line 47
    .line 48
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$5;->oa:Lcom/bytedance/sdk/openadsdk/core/dz/uef;

    .line 49
    .line 50
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->bcc()D

    .line 51
    .line 52
    .line 53
    move-result-wide v4

    .line 54
    const-wide/16 v6, 0x0

    .line 55
    .line 56
    cmpg-double v1, v4, v6

    .line 57
    .line 58
    if-gtz v1, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const-string v2, "load_vast_success"

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    :goto_0
    const/4 v1, -0x3

    .line 65
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$5;->yo:Lcom/bytedance/sdk/openadsdk/core/dz/uef/oa$uef;

    .line 70
    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    iget v1, v1, Lcom/bytedance/sdk/openadsdk/core/dz/uef/oa$uef;->uef:I

    .line 74
    .line 75
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 76
    .line 77
    .line 78
    :cond_3
    :goto_1
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$5;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 79
    .line 80
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$5;->lw:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v1, v4, v2, v0}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$5;->oa:Lcom/bytedance/sdk/openadsdk/core/dz/uef;

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->oa()Lcom/bytedance/sdk/openadsdk/core/dz/oa;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$5;->oa:Lcom/bytedance/sdk/openadsdk/core/dz/uef;

    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->oa()Lcom/bytedance/sdk/openadsdk/core/dz/oa;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/dz/yo;->lw()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    new-instance v0, Lorg/json/JSONObject;

    .line 112
    .line 113
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 114
    .line 115
    .line 116
    const/16 v1, 0x3e8

    .line 117
    .line 118
    :try_start_2
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 119
    .line 120
    .line 121
    const-string v1, "description"

    .line 122
    .line 123
    const-string v2, "1000:Image url is null"

    .line 124
    .line 125
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    .line 127
    .line 128
    :catchall_0
    :try_start_3
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$5;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 129
    .line 130
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$5;->lw:Ljava/lang/String;

    .line 131
    .line 132
    const-string v3, "load_vast_icon_fail"

    .line 133
    .line 134
    invoke-static {v1, v2, v3, v0}, Lcom/bytedance/sdk/openadsdk/moa/yo;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 135
    .line 136
    .line 137
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dz/yo/moa$5;->oa:Lcom/bytedance/sdk/openadsdk/core/dz/uef;

    .line 138
    .line 139
    const/4 v1, 0x0

    .line 140
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/dz/oa;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 141
    .line 142
    .line 143
    :catch_0
    :cond_4
    return-void
.end method
