.class final Lcom/bytedance/sdk/openadsdk/core/wrv$1;
.super Lcom/bytedance/sdk/component/bcc/oa/yo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/wrv;->oa(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field final synthetic uef:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/wrv$1;->uef:Ljava/lang/String;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/bcc/oa/yo;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 14

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/gb;->oib()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const/4 v6, 0x0

    .line 6
    invoke-static {v6, v1}, Lcom/bytedance/sdk/openadsdk/ab/moa;->uef(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/oa;->uef()Z

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    if-nez v5, :cond_0

    .line 14
    .line 15
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$1;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/wrv$1$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/wrv$1;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/sy/yo;->uef(Lcom/bytedance/sdk/openadsdk/sy/moa;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v7, -0x1

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    const-string v0, "url is null"

    .line 31
    .line 32
    invoke-static {v7, v1, v7, v0}, Lcom/bytedance/sdk/openadsdk/ab/moa;->uef(ILjava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 v12, 0x0

    .line 36
    const/4 v13, 0x0

    .line 37
    const-string v8, "ipv6"

    .line 38
    .line 39
    const-string v9, ""

    .line 40
    .line 41
    const/4 v10, -0x2

    .line 42
    const-string v11, "url is null"

    .line 43
    .line 44
    invoke-static/range {v8 .. v13}, Lcom/bytedance/sdk/openadsdk/ab/uef/lw;->uef(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 45
    .line 46
    .line 47
    if-nez v5, :cond_1

    .line 48
    .line 49
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$2;

    .line 50
    .line 51
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/wrv$1$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/wrv$1;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/sy/yo;->yo(Lcom/bytedance/sdk/openadsdk/sy/moa;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    move-object v8, p0

    .line 59
    goto/16 :goto_5

    .line 60
    .line 61
    :cond_2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/dhk/oa;->oa()Lcom/bytedance/sdk/openadsdk/dhk/oa;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/dhk/oa;->yo()Lcom/bytedance/sdk/component/xs/uef;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/xs/uef;->oa()Lcom/bytedance/sdk/component/xs/oa/moa;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    if-eqz v5, :cond_3

    .line 74
    .line 75
    :try_start_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$3;

    .line 76
    .line 77
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/wrv$1$3;-><init>(Lcom/bytedance/sdk/openadsdk/core/wrv$1;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, v0}, Lcom/bytedance/sdk/component/xs/oa/yo;->uef(Lcom/bytedance/sdk/openadsdk/sy/moa;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :catch_0
    move-exception v0

    .line 85
    move-object v8, p0

    .line 86
    move-object v10, v0

    .line 87
    move v9, v5

    .line 88
    goto/16 :goto_8

    .line 89
    .line 90
    :cond_3
    :goto_0
    :try_start_1
    invoke-virtual {v4, v1}, Lcom/bytedance/sdk/component/xs/oa/yo;->yo(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/oa;->oa()Z

    .line 94
    .line 95
    .line 96
    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 97
    const/4 v2, 0x0

    .line 98
    if-eqz v0, :cond_5

    .line 99
    .line 100
    :try_start_2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/gb;->dhk()Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-nez v3, :cond_4

    .line 109
    .line 110
    invoke-virtual {v4, v0}, Lcom/bytedance/sdk/component/xs/oa/yo;->uef(Ljava/util/List;)V

    .line 111
    .line 112
    .line 113
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 114
    .line 115
    const-wide/16 v8, 0x3c

    .line 116
    .line 117
    invoke-virtual {v4, v8, v9, v3}, Lcom/bytedance/sdk/component/xs/oa/yo;->uef(JLjava/util/concurrent/TimeUnit;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 118
    .line 119
    .line 120
    :cond_4
    move-object v3, v0

    .line 121
    goto :goto_1

    .line 122
    :cond_5
    move-object v3, v2

    .line 123
    :goto_1
    :try_start_3
    new-instance v8, Lorg/json/JSONObject;

    .line 124
    .line 125
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v0, "connect_type"

    .line 129
    .line 130
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    .line 131
    .line 132
    .line 133
    move-result-object v9

    .line 134
    const-wide/16 v10, 0x0

    .line 135
    .line 136
    invoke-static {v9, v10, v11}, Lcom/bytedance/sdk/component/utils/gr;->uef(Landroid/content/Context;J)I

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    invoke-virtual {v8, v0, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 141
    .line 142
    .line 143
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wrv$1;->uef:Ljava/lang/String;

    .line 144
    .line 145
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 146
    .line 147
    .line 148
    move-result v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 149
    if-nez v0, :cond_6

    .line 150
    .line 151
    :try_start_4
    const-string v0, "device_id"

    .line 152
    .line 153
    iget-object v9, p0, Lcom/bytedance/sdk/openadsdk/core/wrv$1;->uef:Ljava/lang/String;

    .line 154
    .line 155
    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 156
    .line 157
    .line 158
    move-result-wide v9

    .line 159
    invoke-virtual {v8, v0, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 160
    .line 161
    .line 162
    :cond_6
    :try_start_5
    const-string v0, "header"

    .line 163
    .line 164
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/moa/uef/uef;->uef()Lcom/bytedance/sdk/openadsdk/moa/uef/uef;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    invoke-virtual {v9}, Lcom/bytedance/sdk/openadsdk/moa/uef/uef;->oa()Lorg/json/JSONObject;

    .line 169
    .line 170
    .line 171
    move-result-object v9

    .line 172
    invoke-virtual {v8, v0, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 173
    .line 174
    .line 175
    :try_start_6
    const-string v0, "id"

    .line 176
    .line 177
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->yo()Lcom/bytedance/sdk/openadsdk/core/gzw;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    invoke-interface {v9, v2, v2, v6}, Lcom/bytedance/sdk/openadsdk/core/gzw;->uef(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/model/ue;I)Lorg/json/JSONObject;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-virtual {v8, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 186
    .line 187
    .line 188
    goto :goto_2

    .line 189
    :catchall_0
    move-exception v0

    .line 190
    :try_start_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    :goto_2
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/rt;

    .line 194
    .line 195
    sget-object v2, Lcom/bytedance/sdk/component/embedapplog/PangleEncryptConstant$CryptDataScene;->DUAL_EVENT:Lcom/bytedance/sdk/component/embedapplog/PangleEncryptConstant$CryptDataScene;

    .line 196
    .line 197
    invoke-direct {v0, v2}, Lcom/bytedance/sdk/openadsdk/core/rt;-><init>(Lcom/bytedance/sdk/component/embedapplog/PangleEncryptConstant$CryptDataScene;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v8, v0}, Lcom/bytedance/sdk/component/embedapplog/PangleEncryptManager;->encryptType4(Lorg/json/JSONObject;Lcom/bytedance/sdk/component/embedapplog/IDefaultEncrypt;)Lorg/json/JSONObject;

    .line 201
    .line 202
    .line 203
    move-result-object v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 204
    const-string v2, "application/json; charset=utf-8"

    .line 205
    .line 206
    const-string v9, "Content-Type"

    .line 207
    .line 208
    if-eqz v0, :cond_7

    .line 209
    .line 210
    :try_start_8
    const-string v10, "cypher"

    .line 211
    .line 212
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    move-result v10

    .line 216
    const/4 v11, 0x4

    .line 217
    if-ne v10, v11, :cond_7

    .line 218
    .line 219
    const/4 v10, 0x1

    .line 220
    invoke-static {v10}, Lcom/bytedance/sdk/openadsdk/core/gr;->oa(Z)V

    .line 221
    .line 222
    .line 223
    const-string v10, "x-pgli18n"

    .line 224
    .line 225
    const-string v11, "4"

    .line 226
    .line 227
    invoke-virtual {v4, v10, v11}, Lcom/bytedance/sdk/component/xs/oa/yo;->oa(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4, v9, v2}, Lcom/bytedance/sdk/component/xs/oa/yo;->oa(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 231
    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_7
    :try_start_9
    invoke-static {v6}, Lcom/bytedance/sdk/openadsdk/core/gr;->oa(Z)V

    .line 235
    .line 236
    .line 237
    :goto_3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/wrv;->uef(Lorg/json/JSONObject;)Z

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    if-nez v10, :cond_8

    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_8
    move-object v8, v0

    .line 245
    :goto_4
    invoke-virtual {v4, v9, v2}, Lcom/bytedance/sdk/component/xs/oa/yo;->oa(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    const-string v0, "User-Agent"

    .line 249
    .line 250
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/gb;->moa()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    invoke-virtual {v4, v0, v2}, Lcom/bytedance/sdk/component/xs/oa/yo;->oa(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v4, v8}, Lcom/bytedance/sdk/component/xs/oa/moa;->uef(Lorg/json/JSONObject;)V

    .line 258
    .line 259
    .line 260
    const/4 v0, 0x6

    .line 261
    invoke-virtual {v4, v0}, Lcom/bytedance/sdk/component/xs/oa/yo;->uef(I)V

    .line 262
    .line 263
    .line 264
    const-string v0, "send_i_p_v6"

    .line 265
    .line 266
    invoke-virtual {v4, v0}, Lcom/bytedance/sdk/component/xs/oa/yo;->oa(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3

    .line 270
    .line 271
    move-object v2, v1

    .line 272
    move-object v1, p0

    .line 273
    :try_start_a
    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/core/wrv$1$4;-><init>(Lcom/bytedance/sdk/openadsdk/core/wrv$1;Ljava/lang/String;Ljava/util/List;Lcom/bytedance/sdk/component/xs/oa/moa;Z)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2

    .line 274
    .line 275
    .line 276
    move-object v8, v1

    .line 277
    move-object v1, v2

    .line 278
    move v9, v5

    .line 279
    :try_start_b
    invoke-virtual {v4, v0}, Lcom/bytedance/sdk/component/xs/oa/yo;->oa(Lcom/bytedance/sdk/component/xs/uef/uef;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1

    .line 280
    .line 281
    .line 282
    :goto_5
    return-void

    .line 283
    :catch_1
    move-exception v0

    .line 284
    :goto_6
    move-object v10, v0

    .line 285
    goto :goto_8

    .line 286
    :catch_2
    move-exception v0

    .line 287
    move-object v8, v1

    .line 288
    move-object v1, v2

    .line 289
    :goto_7
    move v9, v5

    .line 290
    goto :goto_6

    .line 291
    :catch_3
    move-exception v0

    .line 292
    move-object v8, p0

    .line 293
    goto :goto_7

    .line 294
    :goto_8
    const/4 v0, -0x2

    .line 295
    invoke-virtual {v10}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    invoke-static {v7, v1, v0, v2}, Lcom/bytedance/sdk/openadsdk/ab/moa;->uef(ILjava/lang/String;ILjava/lang/String;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v10}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    const/4 v4, 0x0

    .line 307
    const/4 v5, 0x0

    .line 308
    const-string v0, "ipv6"

    .line 309
    .line 310
    const/4 v2, -0x3

    .line 311
    invoke-static/range {v0 .. v5}, Lcom/bytedance/sdk/openadsdk/ab/uef/lw;->uef(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 312
    .line 313
    .line 314
    if-nez v9, :cond_9

    .line 315
    .line 316
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/wrv$1$5;

    .line 317
    .line 318
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/wrv$1$5;-><init>(Lcom/bytedance/sdk/openadsdk/core/wrv$1;)V

    .line 319
    .line 320
    .line 321
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/sy/yo;->yo(Lcom/bytedance/sdk/openadsdk/sy/moa;)V

    .line 322
    .line 323
    .line 324
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 325
    .line 326
    const-string v1, "build ipv6 request failed:"

    .line 327
    .line 328
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v10}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    new-array v1, v6, [Ljava/lang/Object;

    .line 343
    .line 344
    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    return-void
.end method
