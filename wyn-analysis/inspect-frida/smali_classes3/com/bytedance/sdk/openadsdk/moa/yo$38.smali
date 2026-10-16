.class final Lcom/bytedance/sdk/openadsdk/moa/yo$38;
.super Lcom/bytedance/sdk/component/bcc/oa/yo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLorg/json/JSONObject;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field final synthetic bcc:Ljava/lang/String;

.field final synthetic cz:J

.field final synthetic ivm:J

.field final synthetic lw:Ljava/lang/String;

.field final synthetic moa:Z

.field final synthetic oa:Lorg/json/JSONObject;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field final synthetic xs:J

.field final synthetic yo:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lorg/json/JSONObject;Ljava/lang/String;ZLjava/lang/String;JJLjava/lang/String;J)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->oa:Lorg/json/JSONObject;

    .line 4
    .line 5
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->yo:Ljava/lang/String;

    .line 6
    .line 7
    iput-boolean p5, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->moa:Z

    .line 8
    .line 9
    iput-object p6, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->lw:Ljava/lang/String;

    .line 10
    .line 11
    iput-wide p7, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->ivm:J

    .line 12
    .line 13
    iput-wide p9, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->xs:J

    .line 14
    .line 15
    iput-object p11, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->bcc:Ljava/lang/String;

    .line 16
    .line 17
    iput-wide p12, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->cz:J

    .line 18
    .line 19
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/bcc/oa/yo;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    .line 1
    const-string v0, "ad_extra_data"

    .line 2
    .line 3
    const-string v1, "click"

    .line 4
    .line 5
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 6
    .line 7
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->try()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->oa:Lorg/json/JSONObject;

    .line 12
    .line 13
    if-eqz v3, :cond_f

    .line 14
    .line 15
    new-instance v3, Lorg/json/JSONObject;

    .line 16
    .line 17
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 18
    .line 19
    .line 20
    :try_start_0
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->oa:Lorg/json/JSONObject;

    .line 21
    .line 22
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-nez v5, :cond_0

    .line 31
    .line 32
    new-instance v3, Lorg/json/JSONObject;

    .line 33
    .line 34
    invoke-direct {v3, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->yo:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_1

    .line 44
    .line 45
    const-string v4, "device"

    .line 46
    .line 47
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-static {v5}, Lcom/bytedance/sdk/openadsdk/utils/DeviceUtils;->xs(Landroid/content/Context;)Lorg/json/JSONObject;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    :cond_1
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->yo:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    const/4 v5, 0x1

    .line 69
    if-eqz v4, :cond_3

    .line 70
    .line 71
    iget-boolean v4, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->moa:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    const-string v6, "click_scence"

    .line 74
    .line 75
    if-eqz v4, :cond_2

    .line 76
    .line 77
    :try_start_1
    invoke-virtual {v3, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 82
    .line 83
    invoke-static {v4}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-eqz v4, :cond_3

    .line 88
    .line 89
    const/4 v4, 0x3

    .line 90
    invoke-virtual {v3, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    :cond_3
    :goto_0
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 94
    .line 95
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->geh()Z

    .line 96
    .line 97
    .line 98
    move-result v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 99
    const-string v6, "pag_json_data"

    .line 100
    .line 101
    if-eqz v4, :cond_6

    .line 102
    .line 103
    :try_start_2
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    if-nez v4, :cond_4

    .line 108
    .line 109
    new-instance v4, Lorg/json/JSONObject;

    .line 110
    .line 111
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 112
    .line 113
    .line 114
    :cond_4
    const-string v7, "is_new_playable"

    .line 115
    .line 116
    invoke-virtual {v4, v7, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 117
    .line 118
    .line 119
    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 120
    .line 121
    invoke-virtual {v7}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nuo()Z

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    if-eqz v7, :cond_5

    .line 126
    .line 127
    const-string v7, "is_pre_render"

    .line 128
    .line 129
    invoke-virtual {v4, v7, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 130
    .line 131
    .line 132
    :cond_5
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-virtual {v3, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 137
    .line 138
    .line 139
    :catchall_0
    :cond_6
    :try_start_3
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    if-nez v4, :cond_7

    .line 144
    .line 145
    new-instance v4, Lorg/json/JSONObject;

    .line 146
    .line 147
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 148
    .line 149
    .line 150
    :cond_7
    const-string v7, "render_sequence"

    .line 151
    .line 152
    iget-object v8, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 153
    .line 154
    invoke-virtual {v8}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ix()I

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 159
    .line 160
    .line 161
    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 162
    .line 163
    invoke-static {v7}, Lcom/bytedance/sdk/openadsdk/dz/uef;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    const/4 v8, 0x0

    .line 168
    if-eqz v7, :cond_8

    .line 169
    .line 170
    const-string v7, "is_lp_pre_render"

    .line 171
    .line 172
    iget-object v9, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 173
    .line 174
    invoke-virtual {v9}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->kkq()Z

    .line 175
    .line 176
    .line 177
    move-result v9

    .line 178
    invoke-virtual {v4, v7, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 179
    .line 180
    .line 181
    :cond_8
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    invoke-virtual {v3, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 186
    .line 187
    .line 188
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->oa:Lorg/json/JSONObject;

    .line 189
    .line 190
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    invoke-virtual {v4, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 195
    .line 196
    .line 197
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->oa:Lorg/json/JSONObject;

    .line 198
    .line 199
    const-string v4, "tag"

    .line 200
    .line 201
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->lw:Ljava/lang/String;

    .line 202
    .line 203
    invoke-virtual {v0, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 204
    .line 205
    .line 206
    const-string v0, "agg_request_type"

    .line 207
    .line 208
    const/4 v4, -0x1

    .line 209
    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    iget-boolean v4, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->moa:Z

    .line 214
    .line 215
    const/4 v6, 0x2

    .line 216
    if-eqz v4, :cond_9

    .line 217
    .line 218
    if-ne v0, v6, :cond_9

    .line 219
    .line 220
    const-string v4, "app_log_url"

    .line 221
    .line 222
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    :cond_9
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->yo:Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-eqz v1, :cond_d

    .line 233
    .line 234
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 235
    .line 236
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/pz;->yo(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 237
    .line 238
    .line 239
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->oa:Lorg/json/JSONObject;

    .line 240
    .line 241
    const-string v4, "log_extra"

    .line 242
    .line 243
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 248
    .line 249
    .line 250
    move-result-wide v9

    .line 251
    const-wide/16 v11, 0x3e8

    .line 252
    .line 253
    div-long/2addr v9, v11

    .line 254
    long-to-double v9, v9

    .line 255
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->oa(Ljava/lang/String;)D

    .line 256
    .line 257
    .line 258
    move-result-wide v11

    .line 259
    sub-double/2addr v9, v11

    .line 260
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-virtual {v1}, Ljava/lang/Double;->floatValue()F

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->oa:Lorg/json/JSONObject;

    .line 269
    .line 270
    const-string v7, "show_time"

    .line 271
    .line 272
    const/4 v9, 0x0

    .line 273
    cmpl-float v10, v1, v9

    .line 274
    .line 275
    if-lez v10, :cond_a

    .line 276
    .line 277
    goto :goto_1

    .line 278
    :cond_a
    move v1, v9

    .line 279
    :goto_1
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    invoke-virtual {v4, v7, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 284
    .line 285
    .line 286
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/cq;->uef(Landroid/content/Context;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    if-nez v1, :cond_f

    .line 299
    .line 300
    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->moa:Z

    .line 301
    .line 302
    if-eqz v1, :cond_c

    .line 303
    .line 304
    if-ne v0, v6, :cond_c

    .line 305
    .line 306
    const-string v0, "click_tracking_url"

    .line 307
    .line 308
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    if-eqz v0, :cond_f

    .line 313
    .line 314
    new-instance v1, Ljava/util/ArrayList;

    .line 315
    .line 316
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 317
    .line 318
    .line 319
    :goto_2
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 320
    .line 321
    .line 322
    move-result v3

    .line 323
    if-ge v8, v3, :cond_b

    .line 324
    .line 325
    invoke-virtual {v0, v8}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    add-int/lit8 v8, v8, 0x1

    .line 333
    .line 334
    goto :goto_2

    .line 335
    :cond_b
    invoke-static {v1, v5}, Lcom/bytedance/sdk/openadsdk/gsd/uef;->uef(Ljava/util/List;Z)Ljava/util/List;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    iget-wide v3, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->ivm:J

    .line 340
    .line 341
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    invoke-static {v0, v6, v1}, Lcom/bytedance/sdk/openadsdk/moa/uef/oa;->uef(Ljava/util/List;ILjava/lang/String;)V

    .line 346
    .line 347
    .line 348
    goto :goto_4

    .line 349
    :cond_c
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 350
    .line 351
    if-eqz v0, :cond_f

    .line 352
    .line 353
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->uxr()Ljava/util/List;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-static {v0, v5}, Lcom/bytedance/sdk/openadsdk/gsd/uef;->uef(Ljava/util/List;Z)Ljava/util/List;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 362
    .line 363
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->iou()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    invoke-static {v0, v6, v1}, Lcom/bytedance/sdk/openadsdk/moa/uef/oa;->uef(Ljava/util/List;ILjava/lang/String;)V

    .line 368
    .line 369
    .line 370
    goto :goto_4

    .line 371
    :cond_d
    const-string v1, "show"

    .line 372
    .line 373
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->yo:Ljava/lang/String;

    .line 374
    .line 375
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    if-eqz v1, :cond_f

    .line 380
    .line 381
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/cq;->uef(Landroid/content/Context;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 390
    .line 391
    .line 392
    move-result v1

    .line 393
    if-nez v1, :cond_f

    .line 394
    .line 395
    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->moa:Z

    .line 396
    .line 397
    if-eqz v1, :cond_f

    .line 398
    .line 399
    if-ne v0, v6, :cond_f

    .line 400
    .line 401
    const-string v0, "show_tracking_url"

    .line 402
    .line 403
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    if-eqz v0, :cond_f

    .line 408
    .line 409
    new-instance v1, Ljava/util/ArrayList;

    .line 410
    .line 411
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 412
    .line 413
    .line 414
    :goto_3
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 415
    .line 416
    .line 417
    move-result v3

    .line 418
    if-ge v8, v3, :cond_e

    .line 419
    .line 420
    invoke-virtual {v0, v8}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    add-int/lit8 v8, v8, 0x1

    .line 428
    .line 429
    goto :goto_3

    .line 430
    :cond_e
    invoke-static {v1, v5}, Lcom/bytedance/sdk/openadsdk/gsd/uef;->uef(Ljava/util/List;Z)Ljava/util/List;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    iget-wide v3, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->ivm:J

    .line 435
    .line 436
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    invoke-static {v0, v5, v1}, Lcom/bytedance/sdk/openadsdk/moa/uef/oa;->uef(Ljava/util/List;ILjava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 441
    .line 442
    .line 443
    :catch_0
    :cond_f
    :goto_4
    new-instance v0, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 444
    .line 445
    iget-wide v3, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->xs:J

    .line 446
    .line 447
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 448
    .line 449
    invoke-direct {v0, v3, v4, v1}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;-><init>(JLcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 450
    .line 451
    .line 452
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->bcc:Ljava/lang/String;

    .line 453
    .line 454
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->moa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->lw:Ljava/lang/String;

    .line 459
    .line 460
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->yo:Ljava/lang/String;

    .line 465
    .line 466
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->yo(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    iget-wide v3, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->ivm:J

    .line 471
    .line 472
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->lw(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    iget-wide v3, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->cz:J

    .line 481
    .line 482
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->ivm(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 495
    .line 496
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nau()Ljava/util/List;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->uef(Ljava/util/List;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->oa:Lorg/json/JSONObject;

    .line 505
    .line 506
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->uef(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 511
    .line 512
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->au()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->bcc(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/moa/yo$38;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 521
    .line 522
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ofp()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->xs(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/moa/uef$uef;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    const/4 v1, 0x0

    .line 531
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/uef$uef;->uef(Lcom/bytedance/sdk/openadsdk/moa/oa/uef;)V

    .line 532
    .line 533
    .line 534
    return-void
.end method
