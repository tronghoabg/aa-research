.class Lcom/bytedance/sdk/openadsdk/core/oyt$2;
.super Lcom/bytedance/sdk/component/bcc/oa/yo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/oyt;->wrv(Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

.field final synthetic uef:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$2;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$2;->uef:Lorg/json/JSONObject;

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
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$2;->uef:Lorg/json/JSONObject;

    .line 2
    .line 3
    const-string v1, "extJson"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_5

    .line 10
    .line 11
    const-string v1, "category"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_5

    .line 18
    .line 19
    const-string v2, "tag"

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_5

    .line 26
    .line 27
    const-string v3, "label"

    .line 28
    .line 29
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_5

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$2;->uef:Lorg/json/JSONObject;

    .line 48
    .line 49
    const-string v5, "value"

    .line 50
    .line 51
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v4

    .line 55
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$2;->uef:Lorg/json/JSONObject;

    .line 56
    .line 57
    const-string v7, "extValue"

    .line 58
    .line 59
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 60
    .line 61
    .line 62
    move-result-wide v6

    .line 63
    :try_start_0
    const-string v8, "ua_policy"

    .line 64
    .line 65
    iget-object v9, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$2;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 66
    .line 67
    invoke-static {v9}, Lcom/bytedance/sdk/openadsdk/core/oyt;->yo(Lcom/bytedance/sdk/openadsdk/core/oyt;)I

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    invoke-virtual {v0, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    :catch_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-static {v8}, Lcom/bytedance/sdk/openadsdk/core/cq;->uef(Landroid/content/Context;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    if-nez v8, :cond_0

    .line 87
    .line 88
    const-string v8, "click"

    .line 89
    .line 90
    invoke-static {v3, v8}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-eqz v8, :cond_0

    .line 95
    .line 96
    iget-object v8, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$2;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 97
    .line 98
    invoke-static {v8}, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw(Lcom/bytedance/sdk/openadsdk/core/oyt;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    if-eqz v8, :cond_0

    .line 103
    .line 104
    iget-object v8, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$2;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 105
    .line 106
    invoke-static {v8}, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw(Lcom/bytedance/sdk/openadsdk/core/oyt;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    invoke-virtual {v8}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->uxr()Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    const/4 v9, 0x1

    .line 115
    invoke-static {v8, v9}, Lcom/bytedance/sdk/openadsdk/gsd/uef;->uef(Ljava/util/List;Z)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    iget-object v9, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$2;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 120
    .line 121
    invoke-static {v9}, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw(Lcom/bytedance/sdk/openadsdk/core/oyt;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    invoke-virtual {v9}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->iou()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    const/4 v10, 0x2

    .line 130
    invoke-static {v8, v10, v9}, Lcom/bytedance/sdk/openadsdk/moa/uef/oa;->uef(Ljava/util/List;ILjava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_0
    new-instance v8, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 134
    .line 135
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 136
    .line 137
    .line 138
    move-result-wide v9

    .line 139
    iget-object v11, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$2;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 140
    .line 141
    invoke-static {v11}, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw(Lcom/bytedance/sdk/openadsdk/core/oyt;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    invoke-direct {v8, v9, v10, v11}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;-><init>(JLcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v8, v1}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->moa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-virtual {v1, v3}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->yo(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$2;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 161
    .line 162
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw(Lcom/bytedance/sdk/openadsdk/core/oyt;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    const-string v3, ""

    .line 167
    .line 168
    if-nez v2, :cond_1

    .line 169
    .line 170
    move-object v2, v3

    .line 171
    goto :goto_0

    .line 172
    :cond_1
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$2;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 173
    .line 174
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw(Lcom/bytedance/sdk/openadsdk/core/oyt;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->try()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    :goto_0
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$2;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 187
    .line 188
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw(Lcom/bytedance/sdk/openadsdk/core/oyt;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    const/4 v8, 0x0

    .line 193
    if-nez v2, :cond_2

    .line 194
    .line 195
    move-object v2, v8

    .line 196
    goto :goto_1

    .line 197
    :cond_2
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$2;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 198
    .line 199
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw(Lcom/bytedance/sdk/openadsdk/core/oyt;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nau()Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    :goto_1
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->uef(Ljava/util/List;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->lw(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$2;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 220
    .line 221
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw(Lcom/bytedance/sdk/openadsdk/core/oyt;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    if-nez v2, :cond_3

    .line 226
    .line 227
    move-object v2, v3

    .line 228
    goto :goto_2

    .line 229
    :cond_3
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$2;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 230
    .line 231
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw(Lcom/bytedance/sdk/openadsdk/core/oyt;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->au()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    :goto_2
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->bcc(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$2;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 244
    .line 245
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw(Lcom/bytedance/sdk/openadsdk/core/oyt;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    if-nez v2, :cond_4

    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_4
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/oyt$2;->oa:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 253
    .line 254
    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw(Lcom/bytedance/sdk/openadsdk/core/oyt;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ofp()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    :goto_3
    invoke-virtual {v1, v3}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->xs(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->ivm(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->uef(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-virtual {v0, v8}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->uef(Lcom/bytedance/sdk/openadsdk/moa/oa/uef;)V

    .line 279
    .line 280
    .line 281
    :cond_5
    return-void
.end method
