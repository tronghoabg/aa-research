.class public final LVa/Ib;
.super LVa/Ba;
.source "SourceFile"


# static fields
.field public static e:I = 0x0

.field public static f:I = 0x1


# instance fields
.field public synthetic c:Z

.field public synthetic d:LVa/Ra;


# direct methods
.method public static b(ILjava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, [C

    .line 6
    .line 7
    sget-object v0, LVa/a;->u:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    sput p0, LVa/a;->t:I

    .line 11
    .line 12
    array-length p0, p1

    .line 13
    new-array p0, p0, [C

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    sput v1, LVa/a;->s:I

    .line 17
    .line 18
    :goto_0
    sget v1, LVa/a;->s:I

    .line 19
    .line 20
    array-length v2, p1

    .line 21
    if-ge v1, v2, :cond_0

    .line 22
    .line 23
    aget-char v2, p1, v1

    .line 24
    .line 25
    sget v3, LVa/a;->t:I

    .line 26
    .line 27
    mul-int/2addr v3, v1

    .line 28
    xor-int/2addr v2, v3

    .line 29
    int-to-long v2, v2

    .line 30
    const-wide v4, -0x19b27dc41123eac4L    # -6.269282412954638E184

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    xor-long/2addr v2, v4

    .line 36
    long-to-int v2, v2

    .line 37
    int-to-char v2, v2

    .line 38
    aput-char v2, p0, v1

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    sput v1, LVa/a;->s:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/String;

    .line 48
    .line 49
    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    .line 50
    .line 51
    .line 52
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    return-object p1

    .line 54
    :goto_1
    monitor-exit v0

    .line 55
    throw p0
.end method


# virtual methods
.method public final c()V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget v0, LVa/Ib;->f:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x45

    .line 6
    .line 7
    rem-int/lit16 v0, v0, 0x80

    .line 8
    .line 9
    sput v0, LVa/Ib;->e:I

    .line 10
    .line 11
    iget-object v0, v1, LVa/Ib;->d:LVa/Ra;

    .line 12
    .line 13
    iget-object v0, v0, LVa/Ra;->a:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v2, v0

    .line 16
    check-cast v2, LVa/v;

    .line 17
    .line 18
    iget-object v0, v2, LVa/v;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, LVa/v;

    .line 21
    .line 22
    iget-object v0, v0, LVa/v;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, LVa/Jb;

    .line 25
    .line 26
    iget-object v0, v0, LVa/Jb;->f:LVa/Kb;

    .line 27
    .line 28
    invoke-static {v0}, LVa/Kb;->i(LVa/Kb;)LVa/x;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    shr-int/lit8 v0, v0, 0x10

    .line 37
    .line 38
    add-int/lit16 v0, v0, 0x69c1

    .line 39
    .line 40
    const-string v4, "\u1548\u7c8d\uc6e1\u2816\ub256\u0590\u6fce"

    .line 41
    .line 42
    invoke-static {v0, v4}, LVa/Ib;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    iget-object v0, v2, LVa/v;->d:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, LVa/v;

    .line 53
    .line 54
    iget-object v0, v0, LVa/v;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, LVa/Jb;

    .line 57
    .line 58
    iget-boolean v5, v0, LVa/Jb;->c:Z

    .line 59
    .line 60
    const-string v6, ""

    .line 61
    .line 62
    const/4 v8, 0x0

    .line 63
    if-eqz v5, :cond_1

    .line 64
    .line 65
    iget-object v0, v0, LVa/Jb;->d:Ljava/lang/String;

    .line 66
    .line 67
    if-eqz v0, :cond_0

    .line 68
    .line 69
    sget v5, LVa/Ib;->e:I

    .line 70
    .line 71
    add-int/lit8 v5, v5, 0x3b

    .line 72
    .line 73
    rem-int/lit16 v5, v5, 0x80

    .line 74
    .line 75
    sput v5, LVa/Ib;->f:I

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    const v0, 0xa387

    .line 79
    .line 80
    .line 81
    invoke-static {v6, v8, v8}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    sub-int/2addr v0, v5

    .line 86
    const-string v5, "\u1552\ub6ce\u525e\uffc5"

    .line 87
    .line 88
    invoke-static {v0, v5}, LVa/Ib;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    goto :goto_0

    .line 97
    :cond_1
    const/4 v0, 0x0

    .line 98
    :goto_0
    iget-object v5, v2, LVa/v;->d:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v5, LVa/v;

    .line 101
    .line 102
    iget-object v5, v5, LVa/v;->d:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v5, LVa/Jb;

    .line 105
    .line 106
    iget-object v5, v5, LVa/Jb;->f:LVa/Kb;

    .line 107
    .line 108
    invoke-static {v5}, LVa/Kb;->j(LVa/Kb;)LVa/V;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    iget-object v9, v2, LVa/v;->d:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v9, LVa/v;

    .line 115
    .line 116
    iget-object v9, v9, LVa/v;->d:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v9, LVa/Jb;

    .line 119
    .line 120
    iget-object v9, v9, LVa/Jb;->f:LVa/Kb;

    .line 121
    .line 122
    invoke-static {v9}, LVa/Kb;->f(LVa/Kb;)Landroid/content/Context;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    invoke-virtual {v9}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 127
    .line 128
    .line 129
    iget-object v9, v2, LVa/v;->d:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v9, LVa/v;

    .line 132
    .line 133
    iget-object v9, v9, LVa/v;->d:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v9, LVa/Jb;

    .line 136
    .line 137
    iget-object v9, v9, LVa/Jb;->f:LVa/Kb;

    .line 138
    .line 139
    invoke-static {v9}, LVa/Kb;->f(LVa/Kb;)Landroid/content/Context;

    .line 140
    .line 141
    .line 142
    iget-object v9, v2, LVa/v;->d:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v9, LVa/v;

    .line 145
    .line 146
    iget-object v9, v9, LVa/v;->d:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v9, LVa/Jb;

    .line 149
    .line 150
    iget-object v9, v9, LVa/Jb;->f:LVa/Kb;

    .line 151
    .line 152
    invoke-static {v9}, LVa/Kb;->k(LVa/Kb;)LVa/H;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    new-instance v10, Lorg/json/JSONObject;

    .line 157
    .line 158
    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 159
    .line 160
    .line 161
    iget-boolean v11, v1, LVa/Ib;->c:Z

    .line 162
    .line 163
    const/16 v12, 0x30

    .line 164
    .line 165
    const/4 v13, 0x1

    .line 166
    if-eqz v11, :cond_2

    .line 167
    .line 168
    :try_start_0
    invoke-static {v6, v12, v8, v8}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 169
    .line 170
    .line 171
    move-result v11

    .line 172
    rsub-int/lit8 v11, v11, 0x44

    .line 173
    .line 174
    int-to-short v11, v11

    .line 175
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 176
    .line 177
    .line 178
    move-result v15

    .line 179
    shr-int/lit8 v15, v15, 0x10

    .line 180
    .line 181
    const v16, 0x327f813c

    .line 182
    .line 183
    .line 184
    add-int v15, v15, v16

    .line 185
    .line 186
    invoke-static {v6, v8}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 187
    .line 188
    .line 189
    move-result v16
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_3

    .line 190
    const/16 v17, 0x0

    .line 191
    .line 192
    add-int/lit8 v7, v16, -0x2c

    .line 193
    .line 194
    :try_start_1
    invoke-static {v6, v12, v8}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 195
    .line 196
    .line 197
    move-result v16
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2

    .line 198
    const v18, -0x5166aaea

    .line 199
    .line 200
    .line 201
    const/16 v19, 0x0

    .line 202
    .line 203
    sub-int v14, v18, v16

    .line 204
    .line 205
    :try_start_2
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 206
    .line 207
    .line 208
    move-result v16
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 209
    move/from16 v18, v8

    .line 210
    .line 211
    shr-int/lit8 v8, v16, 0x10

    .line 212
    .line 213
    int-to-byte v8, v8

    .line 214
    :try_start_3
    invoke-static {v11, v15, v7, v14, v8}, LVa/Ab;->J(SIIIB)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v7

    .line 222
    invoke-virtual {v10, v7, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 223
    .line 224
    .line 225
    goto :goto_2

    .line 226
    :catch_0
    move-exception v0

    .line 227
    goto/16 :goto_5

    .line 228
    .line 229
    :catch_1
    move-exception v0

    .line 230
    move/from16 v18, v8

    .line 231
    .line 232
    goto/16 :goto_5

    .line 233
    .line 234
    :catch_2
    move-exception v0

    .line 235
    move/from16 v18, v8

    .line 236
    .line 237
    :goto_1
    const/16 v19, 0x0

    .line 238
    .line 239
    goto/16 :goto_5

    .line 240
    .line 241
    :catch_3
    move-exception v0

    .line 242
    move/from16 v18, v8

    .line 243
    .line 244
    const/16 v17, 0x0

    .line 245
    .line 246
    goto :goto_1

    .line 247
    :cond_2
    move/from16 v18, v8

    .line 248
    .line 249
    const/16 v17, 0x0

    .line 250
    .line 251
    const/16 v19, 0x0

    .line 252
    .line 253
    :goto_2
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    sget v7, LVa/H;->j:I

    .line 257
    .line 258
    add-int/lit8 v7, v7, 0x49

    .line 259
    .line 260
    rem-int/lit16 v8, v7, 0x80

    .line 261
    .line 262
    sput v8, LVa/H;->k:I

    .line 263
    .line 264
    rem-int/lit8 v7, v7, 0x2

    .line 265
    .line 266
    if-nez v7, :cond_3

    .line 267
    .line 268
    iget-boolean v7, v9, LVa/H;->c:Z

    .line 269
    .line 270
    const/16 v9, 0x15

    .line 271
    .line 272
    div-int/lit8 v9, v9, 0x0

    .line 273
    .line 274
    goto :goto_3

    .line 275
    :cond_3
    iget-boolean v7, v9, LVa/H;->c:Z

    .line 276
    .line 277
    :goto_3
    add-int/lit8 v8, v8, 0x67

    .line 278
    .line 279
    rem-int/lit16 v8, v8, 0x80

    .line 280
    .line 281
    sput v8, LVa/H;->j:I

    .line 282
    .line 283
    if-eq v7, v13, :cond_4

    .line 284
    .line 285
    goto :goto_4

    .line 286
    :cond_4
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 287
    .line 288
    .line 289
    move-result v7

    .line 290
    cmpl-float v7, v7, v19

    .line 291
    .line 292
    rsub-int/lit8 v7, v7, -0x60

    .line 293
    .line 294
    int-to-short v7, v7

    .line 295
    invoke-static/range {v18 .. v18}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 296
    .line 297
    .line 298
    move-result v8

    .line 299
    const v9, 0x327f8137

    .line 300
    .line 301
    .line 302
    add-int/2addr v8, v9

    .line 303
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 304
    .line 305
    .line 306
    move-result v9

    .line 307
    shr-int/lit8 v9, v9, 0x10

    .line 308
    .line 309
    rsub-int/lit8 v9, v9, -0x2c

    .line 310
    .line 311
    move/from16 v11, v18

    .line 312
    .line 313
    invoke-static {v6, v12, v11}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 314
    .line 315
    .line 316
    move-result v12

    .line 317
    const v11, -0x5166aae6

    .line 318
    .line 319
    .line 320
    add-int/2addr v12, v11

    .line 321
    move/from16 v11, v19

    .line 322
    .line 323
    invoke-static {v11, v11}, Landroid/graphics/PointF;->length(FF)F

    .line 324
    .line 325
    .line 326
    move-result v14

    .line 327
    cmpl-float v14, v14, v11

    .line 328
    .line 329
    int-to-byte v11, v14

    .line 330
    invoke-static {v7, v8, v9, v12, v11}, LVa/Ab;->J(SIIIB)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v7

    .line 338
    invoke-virtual {v10, v7, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 339
    .line 340
    .line 341
    :goto_4
    invoke-static {v6}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 342
    .line 343
    .line 344
    move-result v7

    .line 345
    add-int/lit8 v7, v7, -0x69

    .line 346
    .line 347
    int-to-short v7, v7

    .line 348
    const/4 v11, 0x0

    .line 349
    invoke-static {v11, v11}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 350
    .line 351
    .line 352
    move-result v8

    .line 353
    const v9, 0x327f8146

    .line 354
    .line 355
    .line 356
    add-int/2addr v8, v9

    .line 357
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 358
    .line 359
    .line 360
    move-result v9

    .line 361
    shr-int/lit8 v9, v9, 0x10

    .line 362
    .line 363
    add-int/lit8 v9, v9, -0x2c

    .line 364
    .line 365
    invoke-static {v11, v11}, Landroid/view/View;->getDefaultSize(II)I

    .line 366
    .line 367
    .line 368
    move-result v12

    .line 369
    const v14, -0x5166aae2

    .line 370
    .line 371
    .line 372
    add-int/2addr v12, v14

    .line 373
    invoke-static {v11, v11, v11}, Landroid/graphics/Color;->rgb(III)I

    .line 374
    .line 375
    .line 376
    move-result v14

    .line 377
    const/high16 v11, -0x1000000

    .line 378
    .line 379
    sub-int/2addr v11, v14

    .line 380
    int-to-byte v11, v11

    .line 381
    invoke-static {v7, v8, v9, v12, v11}, LVa/Ab;->J(SIIIB)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v7

    .line 385
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    invoke-virtual {v10, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    .line 390
    .line 391
    .line 392
    goto :goto_6

    .line 393
    :goto_5
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 394
    .line 395
    .line 396
    move-result v7

    .line 397
    shr-int/lit8 v7, v7, 0x10

    .line 398
    .line 399
    add-int/lit8 v7, v7, 0x75

    .line 400
    .line 401
    int-to-short v7, v7

    .line 402
    const/4 v11, 0x0

    .line 403
    invoke-static {v11, v11}, Landroid/graphics/PointF;->length(FF)F

    .line 404
    .line 405
    .line 406
    move-result v8

    .line 407
    cmpl-float v8, v8, v11

    .line 408
    .line 409
    const v9, 0x327f8117

    .line 410
    .line 411
    .line 412
    add-int/2addr v8, v9

    .line 413
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 414
    .line 415
    .line 416
    move-result-wide v11

    .line 417
    const-wide/16 v14, 0x0

    .line 418
    .line 419
    cmp-long v9, v11, v14

    .line 420
    .line 421
    rsub-int/lit8 v9, v9, -0x2b

    .line 422
    .line 423
    const v11, -0x5166aade

    .line 424
    .line 425
    .line 426
    const/4 v12, 0x0

    .line 427
    invoke-static {v6, v12, v12}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 428
    .line 429
    .line 430
    move-result v16

    .line 431
    add-int v11, v16, v11

    .line 432
    .line 433
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 434
    .line 435
    .line 436
    move-result v12

    .line 437
    shr-int/lit8 v12, v12, 0x10

    .line 438
    .line 439
    int-to-byte v12, v12

    .line 440
    invoke-static {v7, v8, v9, v11, v12}, LVa/Ab;->J(SIIIB)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v7

    .line 444
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v7

    .line 448
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 449
    .line 450
    .line 451
    move-result v8

    .line 452
    shr-int/lit8 v8, v8, 0x10

    .line 453
    .line 454
    rsub-int/lit8 v8, v8, 0x62

    .line 455
    .line 456
    int-to-short v8, v8

    .line 457
    const v9, 0x327f811b

    .line 458
    .line 459
    .line 460
    const/4 v11, 0x0

    .line 461
    invoke-static {v6, v11}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 462
    .line 463
    .line 464
    move-result v12

    .line 465
    sub-int/2addr v9, v12

    .line 466
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 467
    .line 468
    .line 469
    move-result-wide v20

    .line 470
    cmp-long v12, v20, v14

    .line 471
    .line 472
    rsub-int/lit8 v12, v12, -0x2b

    .line 473
    .line 474
    invoke-static {v11}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 475
    .line 476
    .line 477
    move-result-wide v20

    .line 478
    cmp-long v14, v20, v14

    .line 479
    .line 480
    const v15, -0x5166aac4

    .line 481
    .line 482
    .line 483
    sub-int/2addr v15, v14

    .line 484
    invoke-static {v6, v6, v11, v11}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 485
    .line 486
    .line 487
    move-result v6

    .line 488
    int-to-byte v6, v6

    .line 489
    invoke-static {v8, v9, v12, v15, v6}, LVa/Ab;->J(SIIIB)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v6

    .line 493
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v6

    .line 497
    invoke-static {v7, v6, v0}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 498
    .line 499
    .line 500
    :goto_6
    invoke-virtual {v5}, LVa/V;->u()Lorg/json/JSONObject;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-static {v10, v0}, LVa/Ab;->g0(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 505
    .line 506
    .line 507
    new-instance v6, Lorg/json/JSONObject;

    .line 508
    .line 509
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 510
    .line 511
    .line 512
    new-instance v0, Lorg/json/JSONObject;

    .line 513
    .line 514
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 515
    .line 516
    .line 517
    const/16 v7, 0x1d

    .line 518
    .line 519
    :try_start_4
    new-instance v8, Ljava/util/HashSet;

    .line 520
    .line 521
    invoke-virtual {v5}, LVa/V;->c()Ljava/util/HashMap;

    .line 522
    .line 523
    .line 524
    move-result-object v9

    .line 525
    invoke-virtual {v9}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 526
    .line 527
    .line 528
    move-result-object v9

    .line 529
    invoke-direct {v8, v9}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v8}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 533
    .line 534
    .line 535
    move-result-object v8

    .line 536
    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 537
    .line 538
    .line 539
    move-result v9

    .line 540
    if-eq v9, v13, :cond_5

    .line 541
    .line 542
    const-string v5, "\u8349\ud817\u35cc\u9284"

    .line 543
    .line 544
    const/4 v11, 0x0

    .line 545
    invoke-static {v11, v11}, Landroid/graphics/PointF;->length(FF)F

    .line 546
    .line 547
    .line 548
    move-result v8

    .line 549
    cmpl-float v8, v8, v11

    .line 550
    .line 551
    add-int/lit16 v8, v8, 0x5b49

    .line 552
    .line 553
    invoke-static {v8, v5}, LVa/V;->B(ILjava/lang/String;)Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v5

    .line 557
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v5

    .line 561
    invoke-virtual {v6, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_4

    .line 562
    .line 563
    .line 564
    goto :goto_9

    .line 565
    :catch_4
    move-exception v0

    .line 566
    const/16 v18, 0x0

    .line 567
    .line 568
    goto :goto_8

    .line 569
    :cond_5
    const/4 v11, 0x0

    .line 570
    sget v9, LVa/V;->q:I

    .line 571
    .line 572
    add-int/lit8 v9, v9, 0x73

    .line 573
    .line 574
    rem-int/lit16 v9, v9, 0x80

    .line 575
    .line 576
    sput v9, LVa/V;->p:I

    .line 577
    .line 578
    :try_start_5
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v9

    .line 582
    check-cast v9, Ljava/lang/String;

    .line 583
    .line 584
    invoke-virtual {v5}, LVa/V;->c()Ljava/util/HashMap;

    .line 585
    .line 586
    .line 587
    move-result-object v12

    .line 588
    invoke-virtual {v12, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v12

    .line 592
    check-cast v12, Ljava/lang/String;

    .line 593
    .line 594
    invoke-virtual {v0, v9, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_4

    .line 595
    .line 596
    .line 597
    sget v9, LVa/V;->p:I

    .line 598
    .line 599
    add-int/lit8 v9, v9, 0x5b

    .line 600
    .line 601
    rem-int/lit16 v9, v9, 0x80

    .line 602
    .line 603
    sput v9, LVa/V;->q:I

    .line 604
    .line 605
    goto :goto_7

    .line 606
    :goto_8
    invoke-static/range {v18 .. v18}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 607
    .line 608
    .line 609
    move-result v5

    .line 610
    add-int/lit16 v5, v5, 0xe57

    .line 611
    .line 612
    const-string v8, "\u836f\u8d14\u9fec\ua847\uba15\uc4fc\ud552\ue722\uf1e6\u026e\u0c2b\u1eff\u2f59\u3920\u4b8b\u5447"

    .line 613
    .line 614
    invoke-static {v5, v8}, LVa/V;->B(ILjava/lang/String;)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v5

    .line 618
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v5

    .line 622
    const/4 v8, 0x3

    .line 623
    const/16 v9, 0xf

    .line 624
    .line 625
    const/16 v11, 0x11

    .line 626
    .line 627
    filled-new-array {v9, v7, v11, v8}, [I

    .line 628
    .line 629
    .line 630
    move-result-object v8

    .line 631
    const-string v9, "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001"

    .line 632
    .line 633
    invoke-static {v9, v8}, LVa/V;->l(Ljava/lang/String;[I)Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v8

    .line 637
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v8

    .line 641
    invoke-static {v5, v8, v0}, LVa/Ab;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 642
    .line 643
    .line 644
    :goto_9
    invoke-static {v10, v6}, LVa/Ab;->g0(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 645
    .line 646
    .line 647
    invoke-virtual {v3, v4, v10}, LVa/x;->x(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 648
    .line 649
    .line 650
    iget-object v0, v2, LVa/v;->d:Ljava/lang/Object;

    .line 651
    .line 652
    check-cast v0, LVa/v;

    .line 653
    .line 654
    iget-object v0, v0, LVa/v;->d:Ljava/lang/Object;

    .line 655
    .line 656
    check-cast v0, LVa/Jb;

    .line 657
    .line 658
    iget-boolean v2, v0, LVa/Jb;->e:Z

    .line 659
    .line 660
    if-nez v2, :cond_6

    .line 661
    .line 662
    goto :goto_a

    .line 663
    :cond_6
    sget v2, LVa/Ib;->f:I

    .line 664
    .line 665
    add-int/2addr v2, v7

    .line 666
    rem-int/lit16 v3, v2, 0x80

    .line 667
    .line 668
    sput v3, LVa/Ib;->e:I

    .line 669
    .line 670
    rem-int/lit8 v2, v2, 0x2

    .line 671
    .line 672
    iget-object v0, v0, LVa/Jb;->f:LVa/Kb;

    .line 673
    .line 674
    invoke-static {v0}, LVa/Kb;->i(LVa/Kb;)LVa/x;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    invoke-virtual {v0}, LVa/x;->s()V

    .line 679
    .line 680
    .line 681
    if-nez v2, :cond_7

    .line 682
    .line 683
    :goto_a
    return-void

    .line 684
    :cond_7
    throw v17
.end method
