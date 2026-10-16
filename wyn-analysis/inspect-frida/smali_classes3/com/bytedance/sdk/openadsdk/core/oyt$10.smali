.class Lcom/bytedance/sdk/openadsdk/core/oyt$10;
.super Lcom/bytedance/sdk/component/bcc/oa/yo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(Landroid/net/Uri;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

.field final synthetic uef:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$10;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$10;->uef:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Lcom/bytedance/sdk/component/bcc/oa/yo;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 14

    .line 1
    const-string v0, "ad_extra_data"

    .line 2
    .line 3
    const-string v1, "extra"

    .line 4
    .line 5
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$10;->uef:Landroid/net/Uri;

    .line 6
    .line 7
    const-string v3, "category"

    .line 8
    .line 9
    invoke-virtual {v2, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$10;->uef:Landroid/net/Uri;

    .line 14
    .line 15
    const-string v3, "tag"

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$10;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 22
    .line 23
    invoke-static {v3, v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$10;->uef:Landroid/net/Uri;

    .line 27
    .line 28
    const-string v4, "label"

    .line 29
    .line 30
    invoke-virtual {v3, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$10;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 35
    .line 36
    invoke-static {v3, v7}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_0

    .line 41
    .line 42
    goto/16 :goto_5

    .line 43
    .line 44
    :cond_0
    const-wide/16 v3, 0x0

    .line 45
    .line 46
    :try_start_0
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$10;->uef:Landroid/net/Uri;

    .line 47
    .line 48
    const-string v8, "value"

    .line 49
    .line 50
    invoke-virtual {v6, v8}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 55
    .line 56
    .line 57
    move-result-wide v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    goto :goto_0

    .line 59
    :catch_0
    move-wide v8, v3

    .line 60
    :goto_0
    :try_start_1
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$10;->uef:Landroid/net/Uri;

    .line 61
    .line 62
    const-string v10, "ext_value"

    .line 63
    .line 64
    invoke-virtual {v6, v10}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 69
    .line 70
    .line 71
    move-result-wide v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 72
    :catch_1
    move-wide v10, v3

    .line 73
    const/4 v3, 0x0

    .line 74
    :try_start_2
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$10;->uef:Landroid/net/Uri;

    .line 75
    .line 76
    invoke-virtual {v4, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-nez v6, :cond_1

    .line 85
    .line 86
    new-instance v6, Lorg/json/JSONObject;

    .line 87
    .line 88
    invoke-direct {v6, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 89
    .line 90
    .line 91
    :try_start_3
    const-string v3, "ua_policy"

    .line 92
    .line 93
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$10;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 94
    .line 95
    invoke-static {v4}, Lcom/bytedance/sdk/openadsdk/core/oyt;->yo(Lcom/bytedance/sdk/openadsdk/core/oyt;)I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v6, v3, v4}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 104
    .line 105
    .line 106
    :catchall_0
    move-object v3, v6

    .line 107
    :catchall_1
    :cond_1
    const-string v4, "click"

    .line 108
    .line 109
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_2

    .line 114
    .line 115
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$10;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 116
    .line 117
    invoke-static {v4, v3}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(Lcom/bytedance/sdk/openadsdk/core/oyt;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    :cond_2
    const-string v4, "landing_perf_error"

    .line 122
    .line 123
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-nez v4, :cond_4

    .line 128
    .line 129
    const-string v4, "landing_perf_stats"

    .line 130
    .line 131
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-eqz v4, :cond_3

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$10;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 139
    .line 140
    invoke-static {v0, v2, v7}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    :goto_1
    move-object v6, v0

    .line 145
    move-object v12, v3

    .line 146
    goto :goto_4

    .line 147
    :cond_4
    :goto_2
    :try_start_4
    new-instance v3, Lorg/json/JSONObject;

    .line 148
    .line 149
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 150
    .line 151
    .line 152
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$10;->uef:Landroid/net/Uri;

    .line 153
    .line 154
    invoke-virtual {v2}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    :catch_2
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-eqz v4, :cond_6

    .line 167
    .line 168
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    check-cast v4, Ljava/lang/String;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 173
    .line 174
    :try_start_5
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    if-eqz v6, :cond_5

    .line 179
    .line 180
    new-instance v6, Lorg/json/JSONObject;

    .line 181
    .line 182
    iget-object v12, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$10;->uef:Landroid/net/Uri;

    .line 183
    .line 184
    invoke-virtual {v12, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-direct {v6, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 196
    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_5
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$10;->uef:Landroid/net/Uri;

    .line 200
    .line 201
    invoke-virtual {v6, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    invoke-virtual {v3, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 206
    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_6
    :try_start_6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$10;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 210
    .line 211
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->moa(Lcom/bytedance/sdk/openadsdk/core/oyt;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 215
    goto :goto_1

    .line 216
    :goto_4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$10;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 217
    .line 218
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw(Lcom/bytedance/sdk/openadsdk/core/oyt;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$10;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 223
    .line 224
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw(Lcom/bytedance/sdk/openadsdk/core/oyt;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/dhk;->xs(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 229
    .line 230
    .line 231
    move-result v13

    .line 232
    invoke-static/range {v4 .. v13}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLorg/json/JSONObject;Z)V

    .line 233
    .line 234
    .line 235
    :catch_3
    :goto_5
    return-void
.end method
