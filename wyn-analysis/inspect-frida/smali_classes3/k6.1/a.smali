.class public final Lk6/a;
.super Lh6/e;
.source "SourceFile"


# instance fields
.field public final m:LY4/b;

.field public final n:LY4/b;

.field public final o:LS2/a;

.field public p:Ljava/util/zip/Inflater;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lh6/e;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LY4/b;

    .line 5
    .line 6
    invoke-direct {v0}, LY4/b;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lk6/a;->m:LY4/b;

    .line 10
    .line 11
    new-instance v0, LY4/b;

    .line 12
    .line 13
    invoke-direct {v0}, LY4/b;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lk6/a;->n:LY4/b;

    .line 17
    .line 18
    new-instance v0, LS2/a;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-direct {v0, v1}, LS2/a;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lk6/a;->o:LS2/a;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final e([BIZ)Lh6/f;
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lk6/a;->m:LY4/b;

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    move/from16 v3, p2

    .line 8
    .line 9
    invoke-virtual {v1, v3, v2}, LY4/b;->y(I[B)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, LY4/b;->a()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/16 v3, 0xff

    .line 17
    .line 18
    if-lez v2, :cond_1

    .line 19
    .line 20
    iget-object v2, v1, LY4/b;->a:[B

    .line 21
    .line 22
    iget v4, v1, LY4/b;->b:I

    .line 23
    .line 24
    aget-byte v2, v2, v4

    .line 25
    .line 26
    and-int/2addr v2, v3

    .line 27
    const/16 v4, 0x78

    .line 28
    .line 29
    if-ne v2, v4, :cond_1

    .line 30
    .line 31
    iget-object v2, v0, Lk6/a;->p:Ljava/util/zip/Inflater;

    .line 32
    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    new-instance v2, Ljava/util/zip/Inflater;

    .line 36
    .line 37
    invoke-direct {v2}, Ljava/util/zip/Inflater;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v2, v0, Lk6/a;->p:Ljava/util/zip/Inflater;

    .line 41
    .line 42
    :cond_0
    iget-object v2, v0, Lk6/a;->p:Ljava/util/zip/Inflater;

    .line 43
    .line 44
    iget-object v4, v0, Lk6/a;->n:LY4/b;

    .line 45
    .line 46
    invoke-static {v1, v4, v2}, Lu6/v;->v(LY4/b;LY4/b;Ljava/util/zip/Inflater;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    iget-object v2, v4, LY4/b;->a:[B

    .line 53
    .line 54
    iget v4, v4, LY4/b;->c:I

    .line 55
    .line 56
    invoke-virtual {v1, v4, v2}, LY4/b;->y(I[B)V

    .line 57
    .line 58
    .line 59
    :cond_1
    iget-object v2, v0, Lk6/a;->o:LS2/a;

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    iput v4, v2, LS2/a;->c:I

    .line 63
    .line 64
    iput v4, v2, LS2/a;->d:I

    .line 65
    .line 66
    iput v4, v2, LS2/a;->e:I

    .line 67
    .line 68
    iput v4, v2, LS2/a;->f:I

    .line 69
    .line 70
    iput v4, v2, LS2/a;->g:I

    .line 71
    .line 72
    iput v4, v2, LS2/a;->h:I

    .line 73
    .line 74
    iget-object v5, v2, LS2/a;->i:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v5, LY4/b;

    .line 77
    .line 78
    invoke-virtual {v5, v4}, LY4/b;->x(I)V

    .line 79
    .line 80
    .line 81
    iput-boolean v4, v2, LS2/a;->b:Z

    .line 82
    .line 83
    new-instance v6, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    :goto_0
    invoke-virtual {v1}, LY4/b;->a()I

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    const/4 v8, 0x3

    .line 93
    if-lt v7, v8, :cond_15

    .line 94
    .line 95
    iget v7, v1, LY4/b;->c:I

    .line 96
    .line 97
    invoke-virtual {v1}, LY4/b;->q()I

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    invoke-virtual {v1}, LY4/b;->v()I

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    iget v11, v1, LY4/b;->b:I

    .line 106
    .line 107
    add-int/2addr v11, v10

    .line 108
    if-le v11, v7, :cond_2

    .line 109
    .line 110
    invoke-virtual {v1, v7}, LY4/b;->A(I)V

    .line 111
    .line 112
    .line 113
    move v7, v3

    .line 114
    move v8, v4

    .line 115
    const/4 v12, 0x0

    .line 116
    goto/16 :goto_d

    .line 117
    .line 118
    :cond_2
    const/16 v7, 0x80

    .line 119
    .line 120
    iget-object v13, v2, LS2/a;->a:[I

    .line 121
    .line 122
    if-eq v9, v7, :cond_c

    .line 123
    .line 124
    packed-switch v9, :pswitch_data_0

    .line 125
    .line 126
    .line 127
    :cond_3
    :goto_1
    move v7, v3

    .line 128
    goto/16 :goto_4

    .line 129
    .line 130
    :pswitch_0
    const/16 v7, 0x13

    .line 131
    .line 132
    if-ge v10, v7, :cond_4

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_4
    invoke-virtual {v1}, LY4/b;->v()I

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    iput v7, v2, LS2/a;->c:I

    .line 140
    .line 141
    invoke-virtual {v1}, LY4/b;->v()I

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    iput v7, v2, LS2/a;->d:I

    .line 146
    .line 147
    const/16 v7, 0xb

    .line 148
    .line 149
    invoke-virtual {v1, v7}, LY4/b;->B(I)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, LY4/b;->v()I

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    iput v7, v2, LS2/a;->e:I

    .line 157
    .line 158
    invoke-virtual {v1}, LY4/b;->v()I

    .line 159
    .line 160
    .line 161
    move-result v7

    .line 162
    iput v7, v2, LS2/a;->f:I

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :pswitch_1
    const/4 v9, 0x4

    .line 166
    if-ge v10, v9, :cond_5

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_5
    invoke-virtual {v1, v8}, LY4/b;->B(I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1}, LY4/b;->q()I

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    and-int/2addr v7, v8

    .line 177
    if-eqz v7, :cond_6

    .line 178
    .line 179
    const/4 v14, 0x1

    .line 180
    goto :goto_2

    .line 181
    :cond_6
    move v14, v4

    .line 182
    :goto_2
    add-int/lit8 v7, v10, -0x4

    .line 183
    .line 184
    if-eqz v14, :cond_9

    .line 185
    .line 186
    const/4 v8, 0x7

    .line 187
    if-ge v7, v8, :cond_7

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_7
    invoke-virtual {v1}, LY4/b;->s()I

    .line 191
    .line 192
    .line 193
    move-result v7

    .line 194
    if-ge v7, v9, :cond_8

    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_8
    invoke-virtual {v1}, LY4/b;->v()I

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    iput v8, v2, LS2/a;->g:I

    .line 202
    .line 203
    invoke-virtual {v1}, LY4/b;->v()I

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    iput v8, v2, LS2/a;->h:I

    .line 208
    .line 209
    add-int/lit8 v7, v7, -0x4

    .line 210
    .line 211
    invoke-virtual {v5, v7}, LY4/b;->x(I)V

    .line 212
    .line 213
    .line 214
    add-int/lit8 v7, v10, -0xb

    .line 215
    .line 216
    :cond_9
    iget v8, v5, LY4/b;->b:I

    .line 217
    .line 218
    iget v9, v5, LY4/b;->c:I

    .line 219
    .line 220
    if-ge v8, v9, :cond_3

    .line 221
    .line 222
    if-lez v7, :cond_3

    .line 223
    .line 224
    sub-int/2addr v9, v8

    .line 225
    invoke-static {v7, v9}, Ljava/lang/Math;->min(II)I

    .line 226
    .line 227
    .line 228
    move-result v7

    .line 229
    iget-object v9, v5, LY4/b;->a:[B

    .line 230
    .line 231
    invoke-virtual {v1, v8, v7, v9}, LY4/b;->c(II[B)V

    .line 232
    .line 233
    .line 234
    add-int/2addr v8, v7

    .line 235
    invoke-virtual {v5, v8}, LY4/b;->A(I)V

    .line 236
    .line 237
    .line 238
    goto :goto_1

    .line 239
    :pswitch_2
    rem-int/lit8 v8, v10, 0x5

    .line 240
    .line 241
    const/4 v9, 0x2

    .line 242
    if-eq v8, v9, :cond_a

    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_a
    invoke-virtual {v1, v9}, LY4/b;->B(I)V

    .line 246
    .line 247
    .line 248
    invoke-static {v13, v4}, Ljava/util/Arrays;->fill([II)V

    .line 249
    .line 250
    .line 251
    div-int/lit8 v10, v10, 0x5

    .line 252
    .line 253
    move v8, v4

    .line 254
    :goto_3
    if-ge v8, v10, :cond_b

    .line 255
    .line 256
    invoke-virtual {v1}, LY4/b;->q()I

    .line 257
    .line 258
    .line 259
    move-result v9

    .line 260
    invoke-virtual {v1}, LY4/b;->q()I

    .line 261
    .line 262
    .line 263
    move-result v15

    .line 264
    invoke-virtual {v1}, LY4/b;->q()I

    .line 265
    .line 266
    .line 267
    move-result v16

    .line 268
    invoke-virtual {v1}, LY4/b;->q()I

    .line 269
    .line 270
    .line 271
    move-result v17

    .line 272
    invoke-virtual {v1}, LY4/b;->q()I

    .line 273
    .line 274
    .line 275
    move-result v18

    .line 276
    move/from16 p1, v7

    .line 277
    .line 278
    move/from16 p2, v8

    .line 279
    .line 280
    int-to-double v7, v15

    .line 281
    add-int/lit8 v15, v16, -0x80

    .line 282
    .line 283
    move-object/from16 v16, v13

    .line 284
    .line 285
    int-to-double v12, v15

    .line 286
    const-wide v19, 0x3ff66e978d4fdf3bL    # 1.402

    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    mul-double v19, v19, v12

    .line 292
    .line 293
    add-double v14, v19, v7

    .line 294
    .line 295
    double-to-int v14, v14

    .line 296
    add-int/lit8 v15, v17, -0x80

    .line 297
    .line 298
    int-to-double v3, v15

    .line 299
    const-wide v22, 0x3fd60663c74fb54aL    # 0.34414

    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    mul-double v22, v22, v3

    .line 305
    .line 306
    sub-double v22, v7, v22

    .line 307
    .line 308
    const-wide v24, 0x3fe6da3c21187e7cL    # 0.71414

    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    mul-double v12, v12, v24

    .line 314
    .line 315
    sub-double v12, v22, v12

    .line 316
    .line 317
    double-to-int v12, v12

    .line 318
    const-wide v22, 0x3ffc5a1cac083127L    # 1.772

    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    mul-double v3, v3, v22

    .line 324
    .line 325
    add-double/2addr v3, v7

    .line 326
    double-to-int v3, v3

    .line 327
    shl-int/lit8 v4, v18, 0x18

    .line 328
    .line 329
    const/16 v7, 0xff

    .line 330
    .line 331
    const/4 v8, 0x0

    .line 332
    invoke-static {v14, v8, v7}, Lu6/v;->h(III)I

    .line 333
    .line 334
    .line 335
    move-result v13

    .line 336
    shl-int/lit8 v13, v13, 0x10

    .line 337
    .line 338
    or-int/2addr v4, v13

    .line 339
    invoke-static {v12, v8, v7}, Lu6/v;->h(III)I

    .line 340
    .line 341
    .line 342
    move-result v12

    .line 343
    shl-int/lit8 v12, v12, 0x8

    .line 344
    .line 345
    or-int/2addr v4, v12

    .line 346
    invoke-static {v3, v8, v7}, Lu6/v;->h(III)I

    .line 347
    .line 348
    .line 349
    move-result v3

    .line 350
    or-int/2addr v3, v4

    .line 351
    aput v3, v16, v9

    .line 352
    .line 353
    add-int/lit8 v8, p2, 0x1

    .line 354
    .line 355
    move v3, v7

    .line 356
    move-object/from16 v13, v16

    .line 357
    .line 358
    const/4 v4, 0x0

    .line 359
    move/from16 v7, p1

    .line 360
    .line 361
    goto :goto_3

    .line 362
    :cond_b
    move v7, v3

    .line 363
    const/4 v3, 0x1

    .line 364
    iput-boolean v3, v2, LS2/a;->b:Z

    .line 365
    .line 366
    :goto_4
    const/4 v8, 0x0

    .line 367
    const/4 v12, 0x0

    .line 368
    goto/16 :goto_c

    .line 369
    .line 370
    :cond_c
    move v7, v3

    .line 371
    move-object/from16 v16, v13

    .line 372
    .line 373
    iget v3, v2, LS2/a;->c:I

    .line 374
    .line 375
    if-eqz v3, :cond_13

    .line 376
    .line 377
    iget v3, v2, LS2/a;->d:I

    .line 378
    .line 379
    if-eqz v3, :cond_13

    .line 380
    .line 381
    iget v3, v2, LS2/a;->g:I

    .line 382
    .line 383
    if-eqz v3, :cond_13

    .line 384
    .line 385
    iget v3, v2, LS2/a;->h:I

    .line 386
    .line 387
    if-eqz v3, :cond_13

    .line 388
    .line 389
    iget v3, v5, LY4/b;->c:I

    .line 390
    .line 391
    if-eqz v3, :cond_13

    .line 392
    .line 393
    iget v4, v5, LY4/b;->b:I

    .line 394
    .line 395
    if-ne v4, v3, :cond_13

    .line 396
    .line 397
    iget-boolean v3, v2, LS2/a;->b:Z

    .line 398
    .line 399
    if-nez v3, :cond_d

    .line 400
    .line 401
    goto/16 :goto_a

    .line 402
    .line 403
    :cond_d
    const/4 v8, 0x0

    .line 404
    invoke-virtual {v5, v8}, LY4/b;->A(I)V

    .line 405
    .line 406
    .line 407
    iget v3, v2, LS2/a;->g:I

    .line 408
    .line 409
    iget v4, v2, LS2/a;->h:I

    .line 410
    .line 411
    mul-int/2addr v3, v4

    .line 412
    new-array v4, v3, [I

    .line 413
    .line 414
    const/4 v8, 0x0

    .line 415
    :cond_e
    :goto_5
    if-ge v8, v3, :cond_12

    .line 416
    .line 417
    invoke-virtual {v5}, LY4/b;->q()I

    .line 418
    .line 419
    .line 420
    move-result v9

    .line 421
    if-eqz v9, :cond_f

    .line 422
    .line 423
    add-int/lit8 v10, v8, 0x1

    .line 424
    .line 425
    aget v9, v16, v9

    .line 426
    .line 427
    aput v9, v4, v8

    .line 428
    .line 429
    :goto_6
    move v8, v10

    .line 430
    goto :goto_5

    .line 431
    :cond_f
    invoke-virtual {v5}, LY4/b;->q()I

    .line 432
    .line 433
    .line 434
    move-result v9

    .line 435
    if-eqz v9, :cond_e

    .line 436
    .line 437
    and-int/lit8 v10, v9, 0x40

    .line 438
    .line 439
    if-nez v10, :cond_10

    .line 440
    .line 441
    and-int/lit8 v10, v9, 0x3f

    .line 442
    .line 443
    goto :goto_7

    .line 444
    :cond_10
    and-int/lit8 v10, v9, 0x3f

    .line 445
    .line 446
    shl-int/lit8 v10, v10, 0x8

    .line 447
    .line 448
    invoke-virtual {v5}, LY4/b;->q()I

    .line 449
    .line 450
    .line 451
    move-result v12

    .line 452
    or-int/2addr v10, v12

    .line 453
    :goto_7
    and-int/lit16 v9, v9, 0x80

    .line 454
    .line 455
    if-nez v9, :cond_11

    .line 456
    .line 457
    const/4 v9, 0x0

    .line 458
    goto :goto_8

    .line 459
    :cond_11
    invoke-virtual {v5}, LY4/b;->q()I

    .line 460
    .line 461
    .line 462
    move-result v9

    .line 463
    aget v9, v16, v9

    .line 464
    .line 465
    :goto_8
    add-int/2addr v10, v8

    .line 466
    invoke-static {v4, v8, v10, v9}, Ljava/util/Arrays;->fill([IIII)V

    .line 467
    .line 468
    .line 469
    goto :goto_6

    .line 470
    :cond_12
    iget v3, v2, LS2/a;->g:I

    .line 471
    .line 472
    iget v8, v2, LS2/a;->h:I

    .line 473
    .line 474
    sget-object v9, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 475
    .line 476
    invoke-static {v4, v3, v8, v9}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 477
    .line 478
    .line 479
    move-result-object v24

    .line 480
    iget v3, v2, LS2/a;->e:I

    .line 481
    .line 482
    int-to-float v3, v3

    .line 483
    iget v4, v2, LS2/a;->c:I

    .line 484
    .line 485
    int-to-float v4, v4

    .line 486
    div-float v28, v3, v4

    .line 487
    .line 488
    iget v3, v2, LS2/a;->f:I

    .line 489
    .line 490
    int-to-float v3, v3

    .line 491
    iget v8, v2, LS2/a;->d:I

    .line 492
    .line 493
    int-to-float v8, v8

    .line 494
    div-float v25, v3, v8

    .line 495
    .line 496
    iget v3, v2, LS2/a;->g:I

    .line 497
    .line 498
    int-to-float v3, v3

    .line 499
    div-float v32, v3, v4

    .line 500
    .line 501
    iget v3, v2, LS2/a;->h:I

    .line 502
    .line 503
    int-to-float v3, v3

    .line 504
    div-float v33, v3, v8

    .line 505
    .line 506
    new-instance v20, Lh6/b;

    .line 507
    .line 508
    const/high16 v35, -0x1000000

    .line 509
    .line 510
    const/16 v37, 0x0

    .line 511
    .line 512
    const/16 v21, 0x0

    .line 513
    .line 514
    const/16 v26, 0x0

    .line 515
    .line 516
    const/16 v27, 0x0

    .line 517
    .line 518
    const/16 v29, 0x0

    .line 519
    .line 520
    const/high16 v30, -0x80000000

    .line 521
    .line 522
    const v31, -0x800001

    .line 523
    .line 524
    .line 525
    const/16 v34, 0x0

    .line 526
    .line 527
    move-object/from16 v22, v21

    .line 528
    .line 529
    move-object/from16 v23, v21

    .line 530
    .line 531
    move/from16 v36, v30

    .line 532
    .line 533
    invoke-direct/range {v20 .. v37}, Lh6/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 534
    .line 535
    .line 536
    move-object/from16 v12, v20

    .line 537
    .line 538
    :goto_9
    const/4 v8, 0x0

    .line 539
    goto :goto_b

    .line 540
    :cond_13
    :goto_a
    const/4 v12, 0x0

    .line 541
    goto :goto_9

    .line 542
    :goto_b
    iput v8, v2, LS2/a;->c:I

    .line 543
    .line 544
    iput v8, v2, LS2/a;->d:I

    .line 545
    .line 546
    iput v8, v2, LS2/a;->e:I

    .line 547
    .line 548
    iput v8, v2, LS2/a;->f:I

    .line 549
    .line 550
    iput v8, v2, LS2/a;->g:I

    .line 551
    .line 552
    iput v8, v2, LS2/a;->h:I

    .line 553
    .line 554
    invoke-virtual {v5, v8}, LY4/b;->x(I)V

    .line 555
    .line 556
    .line 557
    iput-boolean v8, v2, LS2/a;->b:Z

    .line 558
    .line 559
    :goto_c
    invoke-virtual {v1, v11}, LY4/b;->A(I)V

    .line 560
    .line 561
    .line 562
    :goto_d
    if-eqz v12, :cond_14

    .line 563
    .line 564
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    :cond_14
    move v3, v7

    .line 568
    move v4, v8

    .line 569
    goto/16 :goto_0

    .line 570
    .line 571
    :cond_15
    new-instance v1, Lac/a;

    .line 572
    .line 573
    invoke-static {v6}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 574
    .line 575
    .line 576
    move-result-object v2

    .line 577
    const/16 v3, 0xa

    .line 578
    .line 579
    invoke-direct {v1, v2, v3}, Lac/a;-><init>(Ljava/lang/Object;I)V

    .line 580
    .line 581
    .line 582
    return-object v1

    .line 583
    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
