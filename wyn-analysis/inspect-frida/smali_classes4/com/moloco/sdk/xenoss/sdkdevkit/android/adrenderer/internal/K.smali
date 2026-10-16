.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;

.field public final synthetic c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/r;

.field public final synthetic d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/s;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/r;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/s;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/r;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/s;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Llf/j;-><init>(ILjf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/r;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/s;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/r;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/s;Ljf/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/16 v0, 0x9

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 7
    .line 8
    iget v4, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K;->a:I

    .line 9
    .line 10
    sget-object v5, Lef/C;->a:Lef/C;

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    iget-object v8, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;

    .line 14
    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    if-ne v4, v7, :cond_0

    .line 18
    .line 19
    :try_start_0
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v23, v5

    .line 23
    .line 24
    goto/16 :goto_b

    .line 25
    .line 26
    :catchall_0
    move-exception v0

    .line 27
    goto/16 :goto_c

    .line 28
    .line 29
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :cond_1
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object v4, v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;

    .line 41
    .line 42
    iget-object v4, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->g:Lcom/moloco/sdk/internal/A;

    .line 43
    .line 44
    instance-of v9, v4, Lcom/moloco/sdk/internal/y;

    .line 45
    .line 46
    iget-object v10, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/r;

    .line 47
    .line 48
    if-eqz v9, :cond_2

    .line 49
    .line 50
    check-cast v4, Lcom/moloco/sdk/internal/y;

    .line 51
    .line 52
    iget-object v0, v4, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;

    .line 55
    .line 56
    invoke-interface {v10, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/i;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V

    .line 57
    .line 58
    .line 59
    return-object v5

    .line 60
    :cond_2
    instance-of v9, v4, Lcom/moloco/sdk/internal/z;

    .line 61
    .line 62
    if-eqz v9, :cond_1f

    .line 63
    .line 64
    check-cast v4, Lcom/moloco/sdk/internal/z;

    .line 65
    .line 66
    iget-object v4, v4, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 67
    .line 68
    move-object v12, v4

    .line 69
    check-cast v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;

    .line 70
    .line 71
    iget-object v4, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;

    .line 72
    .line 73
    iget-object v4, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;->b:Ljava/io/File;

    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    iget-object v15, v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->a:Landroid/content/Context;

    .line 80
    .line 81
    if-nez v4, :cond_1c

    .line 82
    .line 83
    sget-object v16, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 84
    .line 85
    const/16 v19, 0x0

    .line 86
    .line 87
    const/16 v20, 0x0

    .line 88
    .line 89
    const-string v17, "VastFullscreenAdImpl"

    .line 90
    .line 91
    const-string v18, "VAST ad media file does not exist"

    .line 92
    .line 93
    const/16 v21, 0xc

    .line 94
    .line 95
    const/16 v22, 0x0

    .line 96
    .line 97
    invoke-static/range {v16 .. v22}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iget-object v3, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;

    .line 101
    .line 102
    invoke-virtual {v15}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    const-string v9, "getCacheDir(...)"

    .line 107
    .line 108
    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :try_start_1
    new-instance v9, Landroid/os/StatFs;

    .line 112
    .line 113
    invoke-virtual {v4}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    if-nez v11, :cond_3

    .line 118
    .line 119
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v11

    .line 123
    :cond_3
    invoke-direct {v9, v11}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    new-instance v4, Lcom/moloco/sdk/internal/utils/d;

    .line 127
    .line 128
    invoke-virtual {v9}, Landroid/os/StatFs;->getAvailableBytes()J

    .line 129
    .line 130
    .line 131
    move-result-wide v11

    .line 132
    invoke-virtual {v9}, Landroid/os/StatFs;->getTotalBytes()J

    .line 133
    .line 134
    .line 135
    move-result-wide v13

    .line 136
    invoke-direct {v4, v11, v12, v13, v14}, Lcom/moloco/sdk/internal/utils/d;-><init>(JJ)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :catch_0
    const/4 v4, 0x0

    .line 141
    :goto_0
    const/16 v9, 0x64

    .line 142
    .line 143
    const-wide/16 v11, 0x0

    .line 144
    .line 145
    if-eqz v4, :cond_7

    .line 146
    .line 147
    iget-wide v13, v4, Lcom/moloco/sdk/internal/utils/d;->b:J

    .line 148
    .line 149
    cmp-long v17, v13, v11

    .line 150
    .line 151
    if-lez v17, :cond_4

    .line 152
    .line 153
    move-wide/from16 v17, v11

    .line 154
    .line 155
    iget-wide v11, v4, Lcom/moloco/sdk/internal/utils/d;->a:J

    .line 156
    .line 157
    sub-long v11, v13, v11

    .line 158
    .line 159
    int-to-long v6, v9

    .line 160
    mul-long/2addr v11, v6

    .line 161
    div-long/2addr v11, v13

    .line 162
    long-to-int v6, v11

    .line 163
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    goto :goto_1

    .line 168
    :cond_4
    move-wide/from16 v17, v11

    .line 169
    .line 170
    const/4 v6, 0x0

    .line 171
    :goto_1
    if-eqz v6, :cond_8

    .line 172
    .line 173
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    const/16 v7, 0x32

    .line 178
    .line 179
    if-ge v6, v7, :cond_5

    .line 180
    .line 181
    const-string v6, "low"

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_5
    const/16 v7, 0x4b

    .line 185
    .line 186
    if-ge v6, v7, :cond_6

    .line 187
    .line 188
    const-string v6, "medium"

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_6
    const-string v6, "high"

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_7
    move-wide/from16 v17, v11

    .line 195
    .line 196
    :cond_8
    const/4 v6, 0x0

    .line 197
    :goto_2
    iget-object v3, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;->b:Ljava/io/File;

    .line 198
    .line 199
    const-string v7, "file"

    .line 200
    .line 201
    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v15}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    const-string v12, "getAbsolutePath(...)"

    .line 213
    .line 214
    if-eqz v7, :cond_9

    .line 215
    .line 216
    invoke-static {v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-static {v11, v7, v2}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 227
    .line 228
    .line 229
    move-result v7

    .line 230
    if-eqz v7, :cond_9

    .line 231
    .line 232
    const-string v7, "external"

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_9
    invoke-static {v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v15}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-static {v11, v7, v2}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 250
    .line 251
    .line 252
    move-result v7

    .line 253
    if-eqz v7, :cond_a

    .line 254
    .line 255
    const-string v7, "internal"

    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_a
    const/4 v7, 0x0

    .line 259
    :goto_3
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    iget-object v11, v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;

    .line 264
    .line 265
    iget-object v12, v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->g:Lcom/moloco/sdk/internal/A;

    .line 266
    .line 267
    instance-of v13, v12, Lcom/moloco/sdk/internal/z;

    .line 268
    .line 269
    if-eqz v13, :cond_b

    .line 270
    .line 271
    check-cast v12, Lcom/moloco/sdk/internal/z;

    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_b
    const/4 v12, 0x0

    .line 275
    :goto_4
    if-eqz v12, :cond_e

    .line 276
    .line 277
    iget-object v12, v12, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;

    .line 280
    .line 281
    if-nez v12, :cond_c

    .line 282
    .line 283
    goto :goto_5

    .line 284
    :cond_c
    iget-object v12, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;

    .line 285
    .line 286
    iget-object v13, v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 287
    .line 288
    const-string v14, "url"

    .line 289
    .line 290
    iget-object v12, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/i;->d:Ljava/lang/String;

    .line 291
    .line 292
    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    iget-object v13, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;

    .line 296
    .line 297
    invoke-virtual {v13, v12}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/o;->a(Ljava/lang/String;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/h;

    .line 298
    .line 299
    .line 300
    move-result-object v12

    .line 301
    instance-of v13, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/d;

    .line 302
    .line 303
    if-eqz v13, :cond_d

    .line 304
    .line 305
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    move-object/from16 v23, v5

    .line 310
    .line 311
    goto :goto_7

    .line 312
    :cond_d
    instance-of v13, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/f;

    .line 313
    .line 314
    if-eqz v13, :cond_f

    .line 315
    .line 316
    check-cast v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/f;

    .line 317
    .line 318
    iget-object v0, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/f;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/g;

    .line 319
    .line 320
    iget-wide v12, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/g;->b:J

    .line 321
    .line 322
    cmp-long v14, v12, v17

    .line 323
    .line 324
    if-lez v14, :cond_e

    .line 325
    .line 326
    int-to-long v14, v9

    .line 327
    move-object/from16 v23, v5

    .line 328
    .line 329
    iget-wide v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/g;->a:J

    .line 330
    .line 331
    mul-long/2addr v4, v14

    .line 332
    div-long/2addr v4, v12

    .line 333
    long-to-int v0, v4

    .line 334
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    goto :goto_7

    .line 339
    :cond_e
    :goto_5
    move-object/from16 v23, v5

    .line 340
    .line 341
    goto :goto_6

    .line 342
    :cond_f
    move-object/from16 v23, v5

    .line 343
    .line 344
    instance-of v4, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/e;

    .line 345
    .line 346
    if-eqz v4, :cond_10

    .line 347
    .line 348
    :goto_6
    const/4 v0, 0x0

    .line 349
    goto :goto_7

    .line 350
    :cond_10
    new-instance v3, LE5/Q;

    .line 351
    .line 352
    invoke-direct {v3, v2, v0}, LE5/Q;-><init>(BI)V

    .line 353
    .line 354
    .line 355
    throw v3

    .line 356
    :goto_7
    if-eqz v0, :cond_14

    .line 357
    .line 358
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    const/16 v4, 0x21

    .line 363
    .line 364
    if-gt v0, v4, :cond_11

    .line 365
    .line 366
    const-string v0, "0-33"

    .line 367
    .line 368
    goto :goto_8

    .line 369
    :cond_11
    const/16 v4, 0x42

    .line 370
    .line 371
    if-gt v0, v4, :cond_12

    .line 372
    .line 373
    const-string v0, "34-66"

    .line 374
    .line 375
    goto :goto_8

    .line 376
    :cond_12
    if-ge v0, v9, :cond_13

    .line 377
    .line 378
    const-string v0, "67-99"

    .line 379
    .line 380
    goto :goto_8

    .line 381
    :cond_13
    const-string v0, "100"

    .line 382
    .line 383
    goto :goto_8

    .line 384
    :cond_14
    const/4 v0, 0x0

    .line 385
    :goto_8
    const-string v4, "\n                    ACM Event: vast_show_file_not_exists\n                    - storage_bucket_at_show: "

    .line 386
    .line 387
    const-string v5, "\n                    - storage_bucket_at_load: "

    .line 388
    .line 389
    invoke-static {v4, v6, v5}, Lcom/google/android/gms/internal/consent_sdk/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    move-result-object v5

    .line 393
    iget-object v4, v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->l:Ljava/lang/String;

    .line 394
    .line 395
    const-string v9, "\n                    - download_bucket_at_show: "

    .line 396
    .line 397
    const-string v12, "\n                    - cache_location_type: "

    .line 398
    .line 399
    invoke-static {v5, v4, v9, v0, v12}, Lka/n;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    const-string v4, "\n                    - cache_dir_exists: "

    .line 406
    .line 407
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    if-eqz v3, :cond_15

    .line 411
    .line 412
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 413
    .line 414
    .line 415
    move-result v4

    .line 416
    const/4 v9, 0x1

    .line 417
    if-ne v4, v9, :cond_15

    .line 418
    .line 419
    const/4 v9, 0x1

    .line 420
    goto :goto_9

    .line 421
    :cond_15
    move v9, v2

    .line 422
    :goto_9
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    const-string v9, "\n                "

    .line 426
    .line 427
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v5

    .line 434
    invoke-static {v5}, LBf/l;->V(Ljava/lang/String;)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v18

    .line 438
    const/16 v19, 0x0

    .line 439
    .line 440
    const/16 v20, 0x0

    .line 441
    .line 442
    const-string v17, "VastFullscreenAdImpl"

    .line 443
    .line 444
    const/16 v21, 0xc

    .line 445
    .line 446
    const/16 v22, 0x0

    .line 447
    .line 448
    invoke-static/range {v16 .. v22}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    iget-object v5, v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->k:Lcom/moloco/sdk/acm/l;

    .line 452
    .line 453
    iget-object v8, v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->d:Lcom/moloco/sdk/acm/recorder/c;

    .line 454
    .line 455
    if-eqz v5, :cond_16

    .line 456
    .line 457
    invoke-virtual {v8, v5}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 458
    .line 459
    .line 460
    :cond_16
    new-instance v5, Lcom/moloco/sdk/acm/h;

    .line 461
    .line 462
    sget-object v9, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 463
    .line 464
    const-string v9, "vast_show_file_not_exists"

    .line 465
    .line 466
    invoke-direct {v5, v9}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    if-eqz v3, :cond_17

    .line 470
    .line 471
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    const/4 v4, 0x1

    .line 476
    if-ne v3, v4, :cond_17

    .line 477
    .line 478
    const/4 v2, 0x1

    .line 479
    :cond_17
    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    const-string v3, "cache_dir_exists"

    .line 484
    .line 485
    invoke-virtual {v5, v3, v2}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    if-eqz v6, :cond_18

    .line 489
    .line 490
    const-string v2, "storage_bucket_at_show"

    .line 491
    .line 492
    invoke-virtual {v5, v2, v6}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    :cond_18
    iget-object v2, v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/H;->l:Ljava/lang/String;

    .line 496
    .line 497
    if-eqz v2, :cond_19

    .line 498
    .line 499
    const-string v3, "storage_bucket_at_load"

    .line 500
    .line 501
    invoke-virtual {v5, v3, v2}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    :cond_19
    if-eqz v0, :cond_1a

    .line 505
    .line 506
    const-string v2, "download_bucket_at_show"

    .line 507
    .line 508
    invoke-virtual {v5, v2, v0}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    :cond_1a
    if-eqz v7, :cond_1b

    .line 512
    .line 513
    const-string v0, "cache_location_type"

    .line 514
    .line 515
    invoke-virtual {v5, v0, v7}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    :cond_1b
    invoke-virtual {v8, v5}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 519
    .line 520
    .line 521
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/l;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/l;

    .line 522
    .line 523
    invoke-interface {v10, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/i;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V

    .line 524
    .line 525
    .line 526
    return-object v23

    .line 527
    :cond_1c
    move-object/from16 v23, v5

    .line 528
    .line 529
    :try_start_2
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/VastActivity;->e:LHf/j0;

    .line 530
    .line 531
    iget-object v13, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/s;

    .line 532
    .line 533
    new-instance v24, LS8/d;

    .line 534
    .line 535
    iget-object v0, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;

    .line 536
    .line 537
    const-class v27, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;

    .line 538
    .line 539
    const-string v28, "onClose"

    .line 540
    .line 541
    const-string v29, "onClose()V"

    .line 542
    .line 543
    const/16 v30, 0x0

    .line 544
    .line 545
    const/16 v25, 0x0

    .line 546
    .line 547
    const/16 v31, 0x9

    .line 548
    .line 549
    move-object/from16 v26, v0

    .line 550
    .line 551
    invoke-direct/range {v24 .. v31}, LS8/d;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 552
    .line 553
    .line 554
    iget-object v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 555
    .line 556
    iget-object v5, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->b:Lcom/moloco/sdk/internal/ortb/model/u;

    .line 557
    .line 558
    iget-object v5, v5, Lcom/moloco/sdk/internal/ortb/model/u;->f:Ljava/lang/String;

    .line 559
    .line 560
    iget-object v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->d:Lcom/moloco/sdk/acm/recorder/c;

    .line 561
    .line 562
    new-instance v14, LFf/d;

    .line 563
    .line 564
    const/4 v7, 0x3

    .line 565
    invoke-direct {v14, v7, v0, v10}, LFf/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    const/4 v4, 0x1

    .line 569
    iput v4, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/K;->a:I

    .line 570
    .line 571
    sput-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/VastActivity;->k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;

    .line 572
    .line 573
    sput-object v24, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/VastActivity;->i:LS8/d;

    .line 574
    .line 575
    sput-object v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/VastActivity;->l:Lcom/moloco/sdk/acm/recorder/c;

    .line 576
    .line 577
    sget-object v0, LEf/S;->a:LLf/e;

    .line 578
    .line 579
    sget-object v0, LJf/n;->a:LFf/e;

    .line 580
    .line 581
    new-instance v11, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/f;

    .line 582
    .line 583
    const/16 v17, 0x0

    .line 584
    .line 585
    move-object/from16 v16, v5

    .line 586
    .line 587
    invoke-direct/range {v11 .. v17}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/f;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/s;LFf/d;Landroid/content/Context;Ljava/lang/String;Ljf/c;)V

    .line 588
    .line 589
    .line 590
    invoke-static {v0, v11, v1}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 594
    if-ne v0, v3, :cond_1d

    .line 595
    .line 596
    goto :goto_a

    .line 597
    :cond_1d
    move-object/from16 v0, v23

    .line 598
    .line 599
    :goto_a
    if-ne v0, v3, :cond_1e

    .line 600
    .line 601
    return-object v3

    .line 602
    :cond_1e
    :goto_b
    iget-object v0, v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->h:LHf/x0;

    .line 603
    .line 604
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 605
    .line 606
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    const/4 v3, 0x0

    .line 610
    invoke-virtual {v0, v3, v2}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 611
    .line 612
    .line 613
    return-object v23

    .line 614
    :goto_c
    iget-object v2, v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->h:LHf/x0;

    .line 615
    .line 616
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 617
    .line 618
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    const/4 v4, 0x0

    .line 622
    invoke-virtual {v2, v4, v3}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 623
    .line 624
    .line 625
    throw v0

    .line 626
    :cond_1f
    new-instance v3, LE5/Q;

    .line 627
    .line 628
    invoke-direct {v3, v2, v0}, LE5/Q;-><init>(BI)V

    .line 629
    .line 630
    .line 631
    throw v3
.end method
