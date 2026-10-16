.class Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;
.super Lcom/bytedance/sdk/openadsdk/ab/oa/uef;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/moa/yo$49;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/moa/yo$49;

.field final synthetic uef:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/moa/yo$49;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->oa:Lcom/bytedance/sdk/openadsdk/moa/yo$49;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->uef:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/ab/oa/uef;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public oa()Lorg/json/JSONObject;
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->oa:Lcom/bytedance/sdk/openadsdk/moa/yo$49;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/pz;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lorg/json/JSONObject;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    :try_start_1
    const-string v1, "log_extra"

    .line 14
    .line 15
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->oa:Lcom/bytedance/sdk/openadsdk/moa/yo$49;

    .line 16
    .line 17
    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->em()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    const-wide/16 v3, 0x3e8

    .line 31
    .line 32
    div-long/2addr v1, v3

    .line 33
    long-to-double v1, v1

    .line 34
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->oa:Lcom/bytedance/sdk/openadsdk/moa/yo$49;

    .line 35
    .line 36
    iget-object v3, v3, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 37
    .line 38
    invoke-virtual {v3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->jn()D

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    sub-double/2addr v1, v3

    .line 43
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Ljava/lang/Double;->floatValue()F

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    const-string v2, "show_time"

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    cmpl-float v4, v1, v3

    .line 55
    .line 56
    if-lez v4, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move v1, v3

    .line 60
    :goto_0
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->oa:Lcom/bytedance/sdk/openadsdk/moa/yo$49;

    .line 68
    .line 69
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 70
    .line 71
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cz()J

    .line 72
    .line 73
    .line 74
    move-result-wide v1

    .line 75
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 76
    .line 77
    .line 78
    move-result-wide v3

    .line 79
    sub-long/2addr v3, v1

    .line 80
    const-wide/16 v1, 0x0

    .line 81
    .line 82
    cmp-long v1, v3, v1

    .line 83
    .line 84
    if-lez v1, :cond_1

    .line 85
    .line 86
    const-string v1, "duration"

    .line 87
    .line 88
    invoke-virtual {v0, v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 89
    .line 90
    .line 91
    :cond_1
    const-string v1, "ua_policy"

    .line 92
    .line 93
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->oa:Lcom/bytedance/sdk/openadsdk/moa/yo$49;

    .line 94
    .line 95
    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 96
    .line 97
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->us()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->oa:Lcom/bytedance/sdk/openadsdk/moa/yo$49;

    .line 109
    .line 110
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 111
    .line 112
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->dh()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 117
    .line 118
    .line 119
    move-result v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 120
    const-string v3, "ttdsp_price"

    .line 121
    .line 122
    if-nez v2, :cond_2

    .line 123
    .line 124
    :try_start_2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 125
    .line 126
    .line 127
    move-result v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 128
    if-nez v2, :cond_2

    .line 129
    .line 130
    :try_start_3
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    const v2, 0x47c35000    # 100000.0f

    .line 135
    .line 136
    .line 137
    mul-float/2addr v1, v2

    .line 138
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :catchall_0
    move-exception v1

    .line 147
    const/4 v2, 0x0

    .line 148
    :try_start_4
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->oa:Lcom/bytedance/sdk/openadsdk/moa/yo$49;

    .line 155
    .line 156
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 157
    .line 158
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->hjx()Ljava/util/Map;

    .line 159
    .line 160
    .line 161
    move-result-object v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 162
    if-eqz v1, :cond_3

    .line 163
    .line 164
    :try_start_5
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->oa:Lcom/bytedance/sdk/openadsdk/moa/yo$49;

    .line 165
    .line 166
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 167
    .line 168
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->hjx()Ljava/util/Map;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    const-string v2, "sdk_bidding_type"

    .line 173
    .line 174
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    if-eqz v1, :cond_3

    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    const/4 v2, 0x2

    .line 189
    if-ne v1, v2, :cond_3

    .line 190
    .line 191
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->oa:Lcom/bytedance/sdk/openadsdk/moa/yo$49;

    .line 192
    .line 193
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 194
    .line 195
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->hjx()Ljava/util/Map;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    const-string v2, "price"

    .line 200
    .line 201
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    if-eqz v1, :cond_3

    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 212
    .line 213
    .line 214
    move-result-wide v1

    .line 215
    const-wide v4, 0x40f86a0000000000L    # 100000.0

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    mul-double/2addr v1, v4

    .line 221
    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    .line 222
    .line 223
    .line 224
    move-result-wide v1

    .line 225
    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 226
    .line 227
    .line 228
    goto :goto_2

    .line 229
    :catch_0
    const/4 v0, 0x0

    .line 230
    :catch_1
    :catchall_1
    :cond_3
    :goto_2
    return-object v0
.end method

.method public uef()Lorg/json/JSONObject;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->oa:Lcom/bytedance/sdk/openadsdk/moa/yo$49;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->ivm:Lorg/json/JSONObject;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 8
    .line 9
    new-instance v1, Lorg/json/JSONObject;

    .line 10
    .line 11
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_0
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public yo()Lorg/json/JSONObject;
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->oa:Lcom/bytedance/sdk/openadsdk/moa/yo$49;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->lw:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    const-string v2, "au_show"

    .line 6
    .line 7
    const-string v3, "video_skip_result"

    .line 8
    .line 9
    const-string v4, "real_interaction_method"

    .line 10
    .line 11
    const-string v5, "interaction_method"

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    :try_start_1
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->hg()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {v1, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->oa:Lcom/bytedance/sdk/openadsdk/moa/yo$49;

    .line 25
    .line 26
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->lw:Lorg/json/JSONObject;

    .line 27
    .line 28
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->wxf()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {v1, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->oa:Lcom/bytedance/sdk/openadsdk/moa/yo$49;

    .line 38
    .line 39
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->lw:Lorg/json/JSONObject;

    .line 40
    .line 41
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->oa:Lcom/bytedance/sdk/openadsdk/moa/yo$49;

    .line 46
    .line 47
    iget-object v4, v4, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 48
    .line 49
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->jnk()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v1, v4}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->dz(Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->oa:Lcom/bytedance/sdk/openadsdk/moa/yo$49;

    .line 65
    .line 66
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->lw:Lorg/json/JSONObject;

    .line 67
    .line 68
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->uef:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->oa:Lcom/bytedance/sdk/openadsdk/moa/yo$49;

    .line 74
    .line 75
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->lw:Lorg/json/JSONObject;

    .line 76
    .line 77
    return-object v0

    .line 78
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    .line 79
    .line 80
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->oa:Lcom/bytedance/sdk/openadsdk/moa/yo$49;

    .line 84
    .line 85
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 86
    .line 87
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->hg()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-virtual {v0, v5, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 92
    .line 93
    .line 94
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->oa:Lcom/bytedance/sdk/openadsdk/moa/yo$49;

    .line 95
    .line 96
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 97
    .line 98
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->wxf()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 103
    .line 104
    .line 105
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->oa:Lcom/bytedance/sdk/openadsdk/moa/yo$49;

    .line 110
    .line 111
    iget-object v4, v4, Lcom/bytedance/sdk/openadsdk/moa/yo$49;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 112
    .line 113
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->jnk()I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-virtual {v1, v4}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->dz(Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$49$1;->uef:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    .line 132
    .line 133
    return-object v0

    .line 134
    :catchall_0
    const/4 v0, 0x0

    .line 135
    return-object v0
.end method
