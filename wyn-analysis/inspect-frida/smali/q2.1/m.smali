.class public final Lq2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lq2/e;

.field public final b:Lq2/o;

.field public c:Z

.field public d:I

.field public e:J

.field public f:J

.field public g:J

.field public h:J

.field public i:Z

.field public j:F

.field public k:LQ1/q;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lq2/e;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lq2/m;->a:Lq2/e;

    .line 5
    .line 6
    new-instance p2, Lq2/o;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p2, p1, v0}, Lq2/o;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Lq2/m;->b:Lq2/o;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput p1, p0, Lq2/m;->d:I

    .line 16
    .line 17
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    iput-wide p1, p0, Lq2/m;->e:J

    .line 23
    .line 24
    iput-wide p1, p0, Lq2/m;->g:J

    .line 25
    .line 26
    iput-wide p1, p0, Lq2/m;->h:J

    .line 27
    .line 28
    const/high16 p1, 0x3f800000    # 1.0f

    .line 29
    .line 30
    iput p1, p0, Lq2/m;->j:F

    .line 31
    .line 32
    sget-object p1, LQ1/q;->a:LQ1/q;

    .line 33
    .line 34
    iput-object p1, p0, Lq2/m;->k:LQ1/q;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final a(JJJJZLC8/j;)I
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v3, p3

    .line 6
    .line 7
    move-object/from16 v5, p10

    .line 8
    .line 9
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    iput-wide v6, v5, LC8/j;->a:J

    .line 15
    .line 16
    iput-wide v6, v5, LC8/j;->b:J

    .line 17
    .line 18
    iget-wide v8, v0, Lq2/m;->e:J

    .line 19
    .line 20
    cmp-long v8, v8, v6

    .line 21
    .line 22
    if-nez v8, :cond_0

    .line 23
    .line 24
    iput-wide v3, v0, Lq2/m;->e:J

    .line 25
    .line 26
    :cond_0
    iget-wide v8, v0, Lq2/m;->g:J

    .line 27
    .line 28
    cmp-long v8, v8, v1

    .line 29
    .line 30
    const-wide/16 v9, -0x1

    .line 31
    .line 32
    const/4 v15, 0x0

    .line 33
    move-wide/from16 v16, v6

    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    if-eqz v8, :cond_9

    .line 37
    .line 38
    iget-object v7, v0, Lq2/m;->b:Lq2/o;

    .line 39
    .line 40
    const-wide/16 v18, 0x3e8

    .line 41
    .line 42
    iget-wide v13, v7, Lq2/o;->l:J

    .line 43
    .line 44
    cmp-long v8, v13, v9

    .line 45
    .line 46
    if-eqz v8, :cond_1

    .line 47
    .line 48
    iput-wide v13, v7, Lq2/o;->n:J

    .line 49
    .line 50
    iget-wide v13, v7, Lq2/o;->m:J

    .line 51
    .line 52
    iput-wide v13, v7, Lq2/o;->o:J

    .line 53
    .line 54
    :cond_1
    iget-wide v13, v7, Lq2/o;->k:J

    .line 55
    .line 56
    const-wide/16 v20, 0x1

    .line 57
    .line 58
    add-long v13, v13, v20

    .line 59
    .line 60
    iput-wide v13, v7, Lq2/o;->k:J

    .line 61
    .line 62
    mul-long v13, v1, v18

    .line 63
    .line 64
    iget-object v8, v7, Lq2/o;->p:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v8, Lq2/b;

    .line 67
    .line 68
    move-wide/from16 v22, v9

    .line 69
    .line 70
    iget-object v9, v8, Lq2/b;->d:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v9, Lq2/a;

    .line 73
    .line 74
    invoke-virtual {v9, v13, v14}, Lq2/a;->b(J)V

    .line 75
    .line 76
    .line 77
    iget-object v9, v8, Lq2/b;->d:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v9, Lq2/a;

    .line 80
    .line 81
    invoke-virtual {v9}, Lq2/a;->a()Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    if-eqz v9, :cond_3

    .line 86
    .line 87
    iput-boolean v15, v8, Lq2/b;->a:Z

    .line 88
    .line 89
    :cond_2
    const-wide/16 v24, 0x0

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_3
    iget-wide v9, v8, Lq2/b;->b:J

    .line 93
    .line 94
    cmp-long v9, v9, v16

    .line 95
    .line 96
    if-eqz v9, :cond_2

    .line 97
    .line 98
    iget-boolean v9, v8, Lq2/b;->a:Z

    .line 99
    .line 100
    if-eqz v9, :cond_5

    .line 101
    .line 102
    iget-object v9, v8, Lq2/b;->e:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v9, Lq2/a;

    .line 105
    .line 106
    const-wide/16 v24, 0x0

    .line 107
    .line 108
    iget-wide v11, v9, Lq2/a;->e:J

    .line 109
    .line 110
    cmp-long v10, v11, v24

    .line 111
    .line 112
    if-nez v10, :cond_4

    .line 113
    .line 114
    move v9, v15

    .line 115
    goto :goto_0

    .line 116
    :cond_4
    sub-long v11, v11, v20

    .line 117
    .line 118
    const-wide/16 v20, 0xf

    .line 119
    .line 120
    rem-long v11, v11, v20

    .line 121
    .line 122
    long-to-int v10, v11

    .line 123
    iget-object v9, v9, Lq2/a;->h:[Z

    .line 124
    .line 125
    aget-boolean v9, v9, v10

    .line 126
    .line 127
    :goto_0
    if-eqz v9, :cond_6

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_5
    const-wide/16 v24, 0x0

    .line 131
    .line 132
    :goto_1
    iget-object v9, v8, Lq2/b;->e:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v9, Lq2/a;

    .line 135
    .line 136
    invoke-virtual {v9}, Lq2/a;->c()V

    .line 137
    .line 138
    .line 139
    iget-object v9, v8, Lq2/b;->e:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v9, Lq2/a;

    .line 142
    .line 143
    iget-wide v10, v8, Lq2/b;->b:J

    .line 144
    .line 145
    invoke-virtual {v9, v10, v11}, Lq2/a;->b(J)V

    .line 146
    .line 147
    .line 148
    :cond_6
    iput-boolean v6, v8, Lq2/b;->a:Z

    .line 149
    .line 150
    iget-object v9, v8, Lq2/b;->e:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v9, Lq2/a;

    .line 153
    .line 154
    invoke-virtual {v9, v13, v14}, Lq2/a;->b(J)V

    .line 155
    .line 156
    .line 157
    :goto_2
    iget-boolean v9, v8, Lq2/b;->a:Z

    .line 158
    .line 159
    if-eqz v9, :cond_7

    .line 160
    .line 161
    iget-object v9, v8, Lq2/b;->e:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v9, Lq2/a;

    .line 164
    .line 165
    invoke-virtual {v9}, Lq2/a;->a()Z

    .line 166
    .line 167
    .line 168
    move-result v9

    .line 169
    if-eqz v9, :cond_7

    .line 170
    .line 171
    iget-object v9, v8, Lq2/b;->d:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v9, Lq2/a;

    .line 174
    .line 175
    iget-object v10, v8, Lq2/b;->e:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v10, Lq2/a;

    .line 178
    .line 179
    iput-object v10, v8, Lq2/b;->d:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object v9, v8, Lq2/b;->e:Ljava/lang/Object;

    .line 182
    .line 183
    iput-boolean v15, v8, Lq2/b;->a:Z

    .line 184
    .line 185
    :cond_7
    iput-wide v13, v8, Lq2/b;->b:J

    .line 186
    .line 187
    iget-object v9, v8, Lq2/b;->d:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v9, Lq2/a;

    .line 190
    .line 191
    invoke-virtual {v9}, Lq2/a;->a()Z

    .line 192
    .line 193
    .line 194
    move-result v9

    .line 195
    if-eqz v9, :cond_8

    .line 196
    .line 197
    move v9, v15

    .line 198
    goto :goto_3

    .line 199
    :cond_8
    iget v9, v8, Lq2/b;->c:I

    .line 200
    .line 201
    add-int/2addr v9, v6

    .line 202
    :goto_3
    iput v9, v8, Lq2/b;->c:I

    .line 203
    .line 204
    invoke-virtual {v7}, Lq2/o;->c()V

    .line 205
    .line 206
    .line 207
    iput-wide v1, v0, Lq2/m;->g:J

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_9
    move-wide/from16 v22, v9

    .line 211
    .line 212
    const-wide/16 v18, 0x3e8

    .line 213
    .line 214
    const-wide/16 v24, 0x0

    .line 215
    .line 216
    :goto_4
    sub-long/2addr v1, v3

    .line 217
    long-to-double v1, v1

    .line 218
    iget v7, v0, Lq2/m;->j:F

    .line 219
    .line 220
    float-to-double v7, v7

    .line 221
    div-double/2addr v1, v7

    .line 222
    double-to-long v1, v1

    .line 223
    iget-boolean v7, v0, Lq2/m;->c:Z

    .line 224
    .line 225
    if-eqz v7, :cond_a

    .line 226
    .line 227
    iget-object v7, v0, Lq2/m;->k:LQ1/q;

    .line 228
    .line 229
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 233
    .line 234
    .line 235
    move-result-wide v7

    .line 236
    invoke-static {v7, v8}, LQ1/x;->K(J)J

    .line 237
    .line 238
    .line 239
    move-result-wide v7

    .line 240
    sub-long v7, v7, p5

    .line 241
    .line 242
    sub-long/2addr v1, v7

    .line 243
    :cond_a
    iput-wide v1, v5, LC8/j;->a:J

    .line 244
    .line 245
    iget-wide v7, v0, Lq2/m;->h:J

    .line 246
    .line 247
    cmp-long v7, v7, v16

    .line 248
    .line 249
    const-wide/16 v8, -0x7530

    .line 250
    .line 251
    const/4 v10, 0x3

    .line 252
    const/4 v11, 0x2

    .line 253
    if-eqz v7, :cond_c

    .line 254
    .line 255
    iget-boolean v7, v0, Lq2/m;->i:Z

    .line 256
    .line 257
    if-nez v7, :cond_c

    .line 258
    .line 259
    move v14, v6

    .line 260
    :cond_b
    move v1, v15

    .line 261
    goto :goto_6

    .line 262
    :cond_c
    iget v7, v0, Lq2/m;->d:I

    .line 263
    .line 264
    if-eqz v7, :cond_10

    .line 265
    .line 266
    if-eq v7, v6, :cond_f

    .line 267
    .line 268
    if-eq v7, v11, :cond_e

    .line 269
    .line 270
    if-ne v7, v10, :cond_d

    .line 271
    .line 272
    iget-object v7, v0, Lq2/m;->k:LQ1/q;

    .line 273
    .line 274
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 278
    .line 279
    .line 280
    move-result-wide v12

    .line 281
    invoke-static {v12, v13}, LQ1/x;->K(J)J

    .line 282
    .line 283
    .line 284
    move-result-wide v12

    .line 285
    move v14, v6

    .line 286
    iget-wide v6, v0, Lq2/m;->f:J

    .line 287
    .line 288
    sub-long/2addr v12, v6

    .line 289
    iget-boolean v6, v0, Lq2/m;->c:Z

    .line 290
    .line 291
    if-eqz v6, :cond_b

    .line 292
    .line 293
    cmp-long v1, v1, v8

    .line 294
    .line 295
    if-gez v1, :cond_b

    .line 296
    .line 297
    const-wide/32 v1, 0x186a0

    .line 298
    .line 299
    .line 300
    cmp-long v1, v12, v1

    .line 301
    .line 302
    if-lez v1, :cond_b

    .line 303
    .line 304
    :goto_5
    move v1, v14

    .line 305
    goto :goto_6

    .line 306
    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 307
    .line 308
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 309
    .line 310
    .line 311
    throw v1

    .line 312
    :cond_e
    move v14, v6

    .line 313
    cmp-long v1, v3, p7

    .line 314
    .line 315
    if-ltz v1, :cond_b

    .line 316
    .line 317
    goto :goto_5

    .line 318
    :cond_f
    move v14, v6

    .line 319
    goto :goto_5

    .line 320
    :cond_10
    move v14, v6

    .line 321
    iget-boolean v1, v0, Lq2/m;->c:Z

    .line 322
    .line 323
    :goto_6
    if-eqz v1, :cond_11

    .line 324
    .line 325
    return v15

    .line 326
    :cond_11
    iget-boolean v1, v0, Lq2/m;->c:Z

    .line 327
    .line 328
    if-eqz v1, :cond_27

    .line 329
    .line 330
    iget-wide v1, v0, Lq2/m;->e:J

    .line 331
    .line 332
    cmp-long v1, v3, v1

    .line 333
    .line 334
    if-nez v1, :cond_12

    .line 335
    .line 336
    goto/16 :goto_11

    .line 337
    .line 338
    :cond_12
    iget-object v1, v0, Lq2/m;->k:LQ1/q;

    .line 339
    .line 340
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 344
    .line 345
    .line 346
    move-result-wide v1

    .line 347
    iget-object v6, v0, Lq2/m;->b:Lq2/o;

    .line 348
    .line 349
    iget-wide v12, v5, LC8/j;->a:J

    .line 350
    .line 351
    invoke-static {v12, v13}, Ljava/lang/Long;->signum(J)I

    .line 352
    .line 353
    .line 354
    mul-long v12, v12, v18

    .line 355
    .line 356
    add-long/2addr v12, v1

    .line 357
    move-wide/from16 p1, v8

    .line 358
    .line 359
    iget-wide v8, v6, Lq2/o;->n:J

    .line 360
    .line 361
    cmp-long v7, v8, v22

    .line 362
    .line 363
    if-eqz v7, :cond_16

    .line 364
    .line 365
    iget-object v7, v6, Lq2/o;->p:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v7, Lq2/b;

    .line 368
    .line 369
    iget-object v7, v7, Lq2/b;->d:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v7, Lq2/a;

    .line 372
    .line 373
    invoke-virtual {v7}, Lq2/a;->a()Z

    .line 374
    .line 375
    .line 376
    move-result v7

    .line 377
    if-eqz v7, :cond_16

    .line 378
    .line 379
    iget-object v7, v6, Lq2/o;->p:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v7, Lq2/b;

    .line 382
    .line 383
    iget-object v8, v7, Lq2/b;->d:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v8, Lq2/a;

    .line 386
    .line 387
    invoke-virtual {v8}, Lq2/a;->a()Z

    .line 388
    .line 389
    .line 390
    move-result v8

    .line 391
    if-eqz v8, :cond_14

    .line 392
    .line 393
    iget-object v7, v7, Lq2/b;->d:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v7, Lq2/a;

    .line 396
    .line 397
    iget-wide v8, v7, Lq2/a;->f:J

    .line 398
    .line 399
    cmp-long v20, v8, v24

    .line 400
    .line 401
    move/from16 p5, v10

    .line 402
    .line 403
    move/from16 p6, v11

    .line 404
    .line 405
    if-nez v20, :cond_13

    .line 406
    .line 407
    move-wide/from16 v10, v24

    .line 408
    .line 409
    goto :goto_7

    .line 410
    :cond_13
    iget-wide v10, v7, Lq2/a;->g:J

    .line 411
    .line 412
    div-long/2addr v10, v8

    .line 413
    goto :goto_7

    .line 414
    :cond_14
    move/from16 p5, v10

    .line 415
    .line 416
    move/from16 p6, v11

    .line 417
    .line 418
    move-wide/from16 v10, v16

    .line 419
    .line 420
    :goto_7
    iget-wide v7, v6, Lq2/o;->o:J

    .line 421
    .line 422
    move/from16 v20, v14

    .line 423
    .line 424
    iget-wide v14, v6, Lq2/o;->k:J

    .line 425
    .line 426
    move-wide/from16 p7, v10

    .line 427
    .line 428
    iget-wide v9, v6, Lq2/o;->n:J

    .line 429
    .line 430
    sub-long/2addr v14, v9

    .line 431
    mul-long v14, v14, p7

    .line 432
    .line 433
    long-to-float v9, v14

    .line 434
    iget v10, v6, Lq2/o;->g:F

    .line 435
    .line 436
    div-float/2addr v9, v10

    .line 437
    float-to-long v9, v9

    .line 438
    add-long/2addr v7, v9

    .line 439
    sub-long v9, v12, v7

    .line 440
    .line 441
    invoke-static {v9, v10}, Ljava/lang/Math;->abs(J)J

    .line 442
    .line 443
    .line 444
    move-result-wide v9

    .line 445
    const-wide/32 v14, 0x1312d00

    .line 446
    .line 447
    .line 448
    cmp-long v9, v9, v14

    .line 449
    .line 450
    if-gtz v9, :cond_15

    .line 451
    .line 452
    move-wide v12, v7

    .line 453
    goto :goto_8

    .line 454
    :cond_15
    move-wide/from16 v7, v24

    .line 455
    .line 456
    iput-wide v7, v6, Lq2/o;->k:J

    .line 457
    .line 458
    move-wide/from16 v7, v22

    .line 459
    .line 460
    iput-wide v7, v6, Lq2/o;->n:J

    .line 461
    .line 462
    iput-wide v7, v6, Lq2/o;->l:J

    .line 463
    .line 464
    goto :goto_8

    .line 465
    :cond_16
    move/from16 p5, v10

    .line 466
    .line 467
    move/from16 p6, v11

    .line 468
    .line 469
    move/from16 v20, v14

    .line 470
    .line 471
    :goto_8
    iget-wide v7, v6, Lq2/o;->k:J

    .line 472
    .line 473
    iput-wide v7, v6, Lq2/o;->l:J

    .line 474
    .line 475
    iput-wide v12, v6, Lq2/o;->m:J

    .line 476
    .line 477
    iget-object v7, v6, Lq2/o;->r:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v7, Lq2/n;

    .line 480
    .line 481
    if-eqz v7, :cond_1b

    .line 482
    .line 483
    iget-wide v8, v6, Lq2/o;->i:J

    .line 484
    .line 485
    cmp-long v8, v8, v16

    .line 486
    .line 487
    if-nez v8, :cond_17

    .line 488
    .line 489
    goto :goto_b

    .line 490
    :cond_17
    iget-wide v7, v7, Lq2/n;->a:J

    .line 491
    .line 492
    cmp-long v9, v7, v16

    .line 493
    .line 494
    if-nez v9, :cond_18

    .line 495
    .line 496
    goto :goto_b

    .line 497
    :cond_18
    iget-wide v9, v6, Lq2/o;->i:J

    .line 498
    .line 499
    sub-long v14, v12, v7

    .line 500
    .line 501
    div-long/2addr v14, v9

    .line 502
    mul-long/2addr v14, v9

    .line 503
    add-long/2addr v14, v7

    .line 504
    cmp-long v7, v12, v14

    .line 505
    .line 506
    if-gtz v7, :cond_19

    .line 507
    .line 508
    sub-long v7, v14, v9

    .line 509
    .line 510
    goto :goto_9

    .line 511
    :cond_19
    add-long/2addr v9, v14

    .line 512
    move-wide v7, v14

    .line 513
    move-wide v14, v9

    .line 514
    :goto_9
    sub-long v9, v14, v12

    .line 515
    .line 516
    sub-long/2addr v12, v7

    .line 517
    cmp-long v9, v9, v12

    .line 518
    .line 519
    if-gez v9, :cond_1a

    .line 520
    .line 521
    goto :goto_a

    .line 522
    :cond_1a
    move-wide v14, v7

    .line 523
    :goto_a
    iget-wide v6, v6, Lq2/o;->j:J

    .line 524
    .line 525
    sub-long v12, v14, v6

    .line 526
    .line 527
    :cond_1b
    :goto_b
    iput-wide v12, v5, LC8/j;->b:J

    .line 528
    .line 529
    sub-long/2addr v12, v1

    .line 530
    div-long v12, v12, v18

    .line 531
    .line 532
    iput-wide v12, v5, LC8/j;->a:J

    .line 533
    .line 534
    iget-wide v1, v0, Lq2/m;->h:J

    .line 535
    .line 536
    cmp-long v1, v1, v16

    .line 537
    .line 538
    if-eqz v1, :cond_1c

    .line 539
    .line 540
    iget-boolean v1, v0, Lq2/m;->i:Z

    .line 541
    .line 542
    if-nez v1, :cond_1c

    .line 543
    .line 544
    move/from16 v1, v20

    .line 545
    .line 546
    goto :goto_c

    .line 547
    :cond_1c
    const/4 v1, 0x0

    .line 548
    :goto_c
    iget-object v2, v0, Lq2/m;->a:Lq2/e;

    .line 549
    .line 550
    const-wide/32 v6, -0x7a120

    .line 551
    .line 552
    .line 553
    cmp-long v6, v12, v6

    .line 554
    .line 555
    if-gez v6, :cond_1d

    .line 556
    .line 557
    if-nez p9, :cond_1d

    .line 558
    .line 559
    iget-object v6, v2, LU1/d;->i:Lk2/d0;

    .line 560
    .line 561
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    iget-wide v7, v2, LU1/d;->k:J

    .line 565
    .line 566
    sub-long/2addr v3, v7

    .line 567
    invoke-interface {v6, v3, v4}, Lk2/d0;->g(J)I

    .line 568
    .line 569
    .line 570
    move-result v3

    .line 571
    if-nez v3, :cond_1e

    .line 572
    .line 573
    :cond_1d
    const/4 v9, 0x0

    .line 574
    goto :goto_e

    .line 575
    :cond_1e
    if-eqz v1, :cond_1f

    .line 576
    .line 577
    iget-object v4, v2, Ld2/q;->x0:LH5/e;

    .line 578
    .line 579
    iget v6, v4, LH5/e;->e:I

    .line 580
    .line 581
    add-int/2addr v6, v3

    .line 582
    iput v6, v4, LH5/e;->e:I

    .line 583
    .line 584
    iget v3, v4, LH5/e;->g:I

    .line 585
    .line 586
    iget v6, v2, Lq2/e;->Y0:I

    .line 587
    .line 588
    add-int/2addr v3, v6

    .line 589
    iput v3, v4, LH5/e;->g:I

    .line 590
    .line 591
    goto :goto_d

    .line 592
    :cond_1f
    iget-object v4, v2, Ld2/q;->x0:LH5/e;

    .line 593
    .line 594
    iget v6, v4, LH5/e;->k:I

    .line 595
    .line 596
    add-int/lit8 v6, v6, 0x1

    .line 597
    .line 598
    iput v6, v4, LH5/e;->k:I

    .line 599
    .line 600
    iget v4, v2, Lq2/e;->Y0:I

    .line 601
    .line 602
    invoke-virtual {v2, v3, v4}, Lq2/e;->Q0(II)V

    .line 603
    .line 604
    .line 605
    :goto_d
    invoke-virtual {v2}, Ld2/q;->U()Z

    .line 606
    .line 607
    .line 608
    move-result v3

    .line 609
    if-eqz v3, :cond_20

    .line 610
    .line 611
    invoke-virtual {v2}, Ld2/q;->e0()V

    .line 612
    .line 613
    .line 614
    :cond_20
    iget-object v2, v2, Lq2/e;->M0:Lq2/i;

    .line 615
    .line 616
    const/4 v9, 0x0

    .line 617
    if-eqz v2, :cond_21

    .line 618
    .line 619
    invoke-virtual {v2, v9}, Lq2/i;->a(Z)V

    .line 620
    .line 621
    .line 622
    :cond_21
    move/from16 v11, v20

    .line 623
    .line 624
    goto :goto_f

    .line 625
    :goto_e
    move v11, v9

    .line 626
    :goto_f
    if-eqz v11, :cond_22

    .line 627
    .line 628
    const/4 v1, 0x4

    .line 629
    return v1

    .line 630
    :cond_22
    iget-wide v2, v5, LC8/j;->a:J

    .line 631
    .line 632
    cmp-long v4, v2, p1

    .line 633
    .line 634
    if-gez v4, :cond_23

    .line 635
    .line 636
    if-nez p9, :cond_23

    .line 637
    .line 638
    move/from16 v15, v20

    .line 639
    .line 640
    goto :goto_10

    .line 641
    :cond_23
    move v15, v9

    .line 642
    :goto_10
    if-eqz v15, :cond_25

    .line 643
    .line 644
    if-eqz v1, :cond_24

    .line 645
    .line 646
    return p5

    .line 647
    :cond_24
    return p6

    .line 648
    :cond_25
    const-wide/32 v4, 0xc350

    .line 649
    .line 650
    .line 651
    cmp-long v1, v2, v4

    .line 652
    .line 653
    if-lez v1, :cond_26

    .line 654
    .line 655
    goto :goto_11

    .line 656
    :cond_26
    return v20

    .line 657
    :cond_27
    :goto_11
    const/4 v1, 0x5

    .line 658
    return v1
.end method

.method public final b(Z)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget p1, p0, Lq2/m;->d:I

    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    if-ne p1, v3, :cond_0

    .line 13
    .line 14
    iput-wide v1, p0, Lq2/m;->h:J

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    iget-wide v3, p0, Lq2/m;->h:J

    .line 18
    .line 19
    cmp-long p1, v3, v1

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    return v3

    .line 25
    :cond_1
    iget-object p1, p0, Lq2/m;->k:LQ1/q;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    iget-wide v6, p0, Lq2/m;->h:J

    .line 35
    .line 36
    cmp-long p1, v4, v6

    .line 37
    .line 38
    if-gez p1, :cond_2

    .line 39
    .line 40
    return v0

    .line 41
    :cond_2
    iput-wide v1, p0, Lq2/m;->h:J

    .line 42
    .line 43
    return v3
.end method

.method public final c(Z)V
    .locals 4

    .line 1
    iput-boolean p1, p0, Lq2/m;->i:Z

    .line 2
    .line 3
    iget-object p1, p0, Lq2/m;->k:LQ1/q;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    const-wide/16 v2, 0x1388

    .line 13
    .line 14
    add-long/2addr v0, v2

    .line 15
    iput-wide v0, p0, Lq2/m;->h:J

    .line 16
    .line 17
    return-void
.end method

.method public final d(I)V
    .locals 1

    .line 1
    iget v0, p0, Lq2/m;->d:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, Lq2/m;->d:I

    .line 8
    .line 9
    return-void
.end method

.method public final e()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lq2/m;->c:Z

    .line 3
    .line 4
    iget-object v1, p0, Lq2/m;->k:LQ1/q;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-static {v1, v2}, LQ1/x;->K(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    iput-wide v1, p0, Lq2/m;->f:J

    .line 18
    .line 19
    iget-object v1, p0, Lq2/m;->b:Lq2/o;

    .line 20
    .line 21
    iput-boolean v0, v1, Lq2/o;->b:Z

    .line 22
    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    iput-wide v2, v1, Lq2/o;->k:J

    .line 26
    .line 27
    const-wide/16 v2, -0x1

    .line 28
    .line 29
    iput-wide v2, v1, Lq2/o;->n:J

    .line 30
    .line 31
    iput-wide v2, v1, Lq2/o;->l:J

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    iget-object v2, v1, Lq2/o;->q:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lio/flutter/view/s;

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    iget-object v3, v1, Lq2/o;->r:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Lq2/n;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object v3, v3, Lq2/n;->b:Landroid/os/Handler;

    .line 48
    .line 49
    const/4 v4, 0x2

    .line 50
    invoke-virtual {v3, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 51
    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    invoke-static {v3}, LQ1/x;->m(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iget-object v4, v2, Lio/flutter/view/s;->b:Landroid/hardware/display/DisplayManager;

    .line 59
    .line 60
    invoke-virtual {v4, v2, v3}, Landroid/hardware/display/DisplayManager;->registerDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;Landroid/os/Handler;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v0}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    iget-object v2, v2, Lio/flutter/view/s;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Lq2/o;

    .line 70
    .line 71
    invoke-static {v2, v3}, Lq2/o;->a(Lq2/o;Landroid/view/Display;)V

    .line 72
    .line 73
    .line 74
    :cond_0
    invoke-virtual {v1, v0}, Lq2/o;->d(Z)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final f()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lq2/m;->c:Z

    .line 3
    .line 4
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v1, p0, Lq2/m;->h:J

    .line 10
    .line 11
    iget-object v1, p0, Lq2/m;->b:Lq2/o;

    .line 12
    .line 13
    iput-boolean v0, v1, Lq2/o;->b:Z

    .line 14
    .line 15
    iget-object v0, v1, Lq2/o;->q:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lio/flutter/view/s;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v2, v0, Lio/flutter/view/s;->b:Landroid/hardware/display/DisplayManager;

    .line 22
    .line 23
    invoke-virtual {v2, v0}, Landroid/hardware/display/DisplayManager;->unregisterDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, v1, Lq2/o;->r:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lq2/n;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v0, v0, Lq2/n;->b:Landroid/os/Handler;

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {v1}, Lq2/o;->b()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final g(F)V
    .locals 4

    .line 1
    iget-object v0, p0, Lq2/m;->b:Lq2/o;

    .line 2
    .line 3
    iput p1, v0, Lq2/o;->d:F

    .line 4
    .line 5
    iget-object p1, v0, Lq2/o;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Lq2/b;

    .line 8
    .line 9
    iget-object v1, p1, Lq2/b;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lq2/a;

    .line 12
    .line 13
    invoke-virtual {v1}, Lq2/a;->c()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p1, Lq2/b;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lq2/a;

    .line 19
    .line 20
    invoke-virtual {v1}, Lq2/a;->c()V

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    iput-boolean v1, p1, Lq2/b;->a:Z

    .line 25
    .line 26
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    iput-wide v2, p1, Lq2/b;->b:J

    .line 32
    .line 33
    iput v1, p1, Lq2/b;->c:I

    .line 34
    .line 35
    invoke-virtual {v0}, Lq2/o;->c()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final h(F)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    invoke-static {v0}, LQ1/k;->c(Z)V

    .line 11
    .line 12
    .line 13
    iget v0, p0, Lq2/m;->j:F

    .line 14
    .line 15
    cmpl-float v0, p1, v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    iput p1, p0, Lq2/m;->j:F

    .line 21
    .line 22
    iget-object v0, p0, Lq2/m;->b:Lq2/o;

    .line 23
    .line 24
    iput p1, v0, Lq2/o;->g:F

    .line 25
    .line 26
    const-wide/16 v2, 0x0

    .line 27
    .line 28
    iput-wide v2, v0, Lq2/o;->k:J

    .line 29
    .line 30
    const-wide/16 v2, -0x1

    .line 31
    .line 32
    iput-wide v2, v0, Lq2/o;->n:J

    .line 33
    .line 34
    iput-wide v2, v0, Lq2/o;->l:J

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lq2/o;->d(Z)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
