.class public final LT5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/f;


# instance fields
.field public final a:LY4/b;

.field public final b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:LJ5/w;

.field public e:I

.field public f:I

.field public g:I

.field public h:J

.field public i:LE5/T;

.field public j:I

.field public k:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LY4/b;

    .line 5
    .line 6
    const/16 v1, 0x12

    .line 7
    .line 8
    new-array v1, v1, [B

    .line 9
    .line 10
    invoke-direct {v0, v1}, LY4/b;-><init>([B)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, LT5/d;->a:LY4/b;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput v0, p0, LT5/d;->e:I

    .line 17
    .line 18
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    iput-wide v0, p0, LT5/d;->k:J

    .line 24
    .line 25
    iput-object p1, p0, LT5/d;->b:Ljava/lang/String;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LT5/d;->e:I

    .line 3
    .line 4
    iput v0, p0, LT5/d;->f:I

    .line 5
    .line 6
    iput v0, p0, LT5/d;->g:I

    .line 7
    .line 8
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v0, p0, LT5/d;->k:J

    .line 14
    .line 15
    return-void
.end method

.method public final c(LY4/b;)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, LT5/d;->d:LJ5/w;

    .line 6
    .line 7
    invoke-static {v2}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    :goto_0
    invoke-virtual {v1}, LY4/b;->a()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-lez v2, :cond_16

    .line 15
    .line 16
    iget v2, v0, LT5/d;->e:I

    .line 17
    .line 18
    iget-object v3, v0, LT5/d;->a:LY4/b;

    .line 19
    .line 20
    const/4 v4, 0x2

    .line 21
    const/4 v5, 0x1

    .line 22
    const/16 v6, 0x8

    .line 23
    .line 24
    const/4 v9, 0x0

    .line 25
    if-eqz v2, :cond_13

    .line 26
    .line 27
    if-eq v2, v5, :cond_3

    .line 28
    .line 29
    if-ne v2, v4, :cond_2

    .line 30
    .line 31
    invoke-virtual {v1}, LY4/b;->a()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    iget v3, v0, LT5/d;->j:I

    .line 36
    .line 37
    iget v4, v0, LT5/d;->f:I

    .line 38
    .line 39
    sub-int/2addr v3, v4

    .line 40
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    iget-object v3, v0, LT5/d;->d:LJ5/w;

    .line 45
    .line 46
    invoke-interface {v3, v2, v1}, LJ5/w;->c(ILY4/b;)V

    .line 47
    .line 48
    .line 49
    iget v3, v0, LT5/d;->f:I

    .line 50
    .line 51
    add-int/2addr v3, v2

    .line 52
    iput v3, v0, LT5/d;->f:I

    .line 53
    .line 54
    iget v14, v0, LT5/d;->j:I

    .line 55
    .line 56
    if-ne v3, v14, :cond_0

    .line 57
    .line 58
    iget-wide v11, v0, LT5/d;->k:J

    .line 59
    .line 60
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    cmp-long v2, v11, v2

    .line 66
    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    iget-object v10, v0, LT5/d;->d:LJ5/w;

    .line 70
    .line 71
    const/16 v16, 0x0

    .line 72
    .line 73
    const/4 v13, 0x1

    .line 74
    const/4 v15, 0x0

    .line 75
    invoke-interface/range {v10 .. v16}, LJ5/w;->b(JIIILJ5/v;)V

    .line 76
    .line 77
    .line 78
    iget-wide v2, v0, LT5/d;->k:J

    .line 79
    .line 80
    iget-wide v4, v0, LT5/d;->h:J

    .line 81
    .line 82
    add-long/2addr v2, v4

    .line 83
    iput-wide v2, v0, LT5/d;->k:J

    .line 84
    .line 85
    :cond_1
    iput v9, v0, LT5/d;->e:I

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 89
    .line 90
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 91
    .line 92
    .line 93
    throw v1

    .line 94
    :cond_3
    iget-object v2, v3, LY4/b;->a:[B

    .line 95
    .line 96
    invoke-virtual {v1}, LY4/b;->a()I

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    iget v11, v0, LT5/d;->f:I

    .line 101
    .line 102
    const/16 v12, 0x12

    .line 103
    .line 104
    rsub-int/lit8 v11, v11, 0x12

    .line 105
    .line 106
    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    iget v11, v0, LT5/d;->f:I

    .line 111
    .line 112
    invoke-virtual {v1, v11, v10, v2}, LY4/b;->c(II[B)V

    .line 113
    .line 114
    .line 115
    iget v2, v0, LT5/d;->f:I

    .line 116
    .line 117
    add-int/2addr v2, v10

    .line 118
    iput v2, v0, LT5/d;->f:I

    .line 119
    .line 120
    if-ne v2, v12, :cond_0

    .line 121
    .line 122
    iget-object v2, v3, LY4/b;->a:[B

    .line 123
    .line 124
    iget-object v10, v0, LT5/d;->i:LE5/T;

    .line 125
    .line 126
    const/16 v11, 0xe

    .line 127
    .line 128
    const/16 v15, 0x3c

    .line 129
    .line 130
    const/16 v16, 0x3

    .line 131
    .line 132
    const/16 v7, 0x1f

    .line 133
    .line 134
    move/from16 v17, v5

    .line 135
    .line 136
    const/4 v5, -0x2

    .line 137
    const/4 v12, -0x1

    .line 138
    if-nez v10, :cond_b

    .line 139
    .line 140
    iget-object v10, v0, LT5/d;->c:Ljava/lang/String;

    .line 141
    .line 142
    move/from16 v18, v9

    .line 143
    .line 144
    aget-byte v9, v2, v18

    .line 145
    .line 146
    const/16 v13, 0x7f

    .line 147
    .line 148
    if-ne v9, v13, :cond_4

    .line 149
    .line 150
    new-instance v9, LJ5/y;

    .line 151
    .line 152
    array-length v13, v2

    .line 153
    const/4 v8, 0x6

    .line 154
    const/4 v14, 0x0

    .line 155
    invoke-direct {v9, v2, v13, v8, v14}, LJ5/y;-><init>([BIIB)V

    .line 156
    .line 157
    .line 158
    move/from16 v25, v4

    .line 159
    .line 160
    move/from16 v26, v6

    .line 161
    .line 162
    goto/16 :goto_4

    .line 163
    .line 164
    :cond_4
    array-length v8, v2

    .line 165
    invoke-static {v2, v8}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    aget-byte v9, v8, v18

    .line 170
    .line 171
    if-eq v9, v5, :cond_5

    .line 172
    .line 173
    if-ne v9, v12, :cond_6

    .line 174
    .line 175
    :cond_5
    move/from16 v9, v18

    .line 176
    .line 177
    :goto_1
    array-length v13, v8

    .line 178
    add-int/lit8 v13, v13, -0x1

    .line 179
    .line 180
    if-ge v9, v13, :cond_6

    .line 181
    .line 182
    aget-byte v13, v8, v9

    .line 183
    .line 184
    add-int/lit8 v14, v9, 0x1

    .line 185
    .line 186
    aget-byte v22, v8, v14

    .line 187
    .line 188
    aput-byte v22, v8, v9

    .line 189
    .line 190
    aput-byte v13, v8, v14

    .line 191
    .line 192
    add-int/lit8 v9, v9, 0x2

    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_6
    new-instance v9, LJ5/y;

    .line 196
    .line 197
    array-length v13, v8

    .line 198
    const/4 v14, 0x6

    .line 199
    const/4 v12, 0x0

    .line 200
    invoke-direct {v9, v8, v13, v14, v12}, LJ5/y;-><init>([BIIB)V

    .line 201
    .line 202
    .line 203
    aget-byte v12, v8, v18

    .line 204
    .line 205
    if-ne v12, v7, :cond_8

    .line 206
    .line 207
    new-instance v12, LJ5/y;

    .line 208
    .line 209
    array-length v13, v8

    .line 210
    const/4 v14, 0x6

    .line 211
    const/4 v7, 0x0

    .line 212
    invoke-direct {v12, v8, v13, v14, v7}, LJ5/y;-><init>([BIIB)V

    .line 213
    .line 214
    .line 215
    :goto_2
    invoke-virtual {v12}, LJ5/y;->b()I

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    const/16 v13, 0x10

    .line 220
    .line 221
    if-lt v7, v13, :cond_8

    .line 222
    .line 223
    invoke-virtual {v12, v4}, LJ5/y;->t(I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v11}, LJ5/y;->i(I)I

    .line 227
    .line 228
    .line 229
    move-result v7

    .line 230
    and-int/lit16 v7, v7, 0x3fff

    .line 231
    .line 232
    iget v13, v9, LJ5/y;->d:I

    .line 233
    .line 234
    rsub-int/lit8 v13, v13, 0x8

    .line 235
    .line 236
    invoke-static {v13, v11}, Ljava/lang/Math;->min(II)I

    .line 237
    .line 238
    .line 239
    move-result v13

    .line 240
    iget v14, v9, LJ5/y;->d:I

    .line 241
    .line 242
    rsub-int/lit8 v23, v14, 0x8

    .line 243
    .line 244
    sub-int v23, v23, v13

    .line 245
    .line 246
    const v24, 0xff00

    .line 247
    .line 248
    .line 249
    shr-int v14, v24, v14

    .line 250
    .line 251
    shl-int v24, v17, v23

    .line 252
    .line 253
    add-int/lit8 v24, v24, -0x1

    .line 254
    .line 255
    or-int v14, v14, v24

    .line 256
    .line 257
    iget-object v5, v9, LJ5/y;->b:[B

    .line 258
    .line 259
    move/from16 v25, v4

    .line 260
    .line 261
    iget v4, v9, LJ5/y;->c:I

    .line 262
    .line 263
    aget-byte v26, v5, v4

    .line 264
    .line 265
    and-int v14, v26, v14

    .line 266
    .line 267
    int-to-byte v14, v14

    .line 268
    aput-byte v14, v5, v4

    .line 269
    .line 270
    rsub-int/lit8 v13, v13, 0xe

    .line 271
    .line 272
    ushr-int v26, v7, v13

    .line 273
    .line 274
    shl-int v23, v26, v23

    .line 275
    .line 276
    or-int v14, v14, v23

    .line 277
    .line 278
    int-to-byte v14, v14

    .line 279
    aput-byte v14, v5, v4

    .line 280
    .line 281
    add-int/lit8 v4, v4, 0x1

    .line 282
    .line 283
    :goto_3
    if-le v13, v6, :cond_7

    .line 284
    .line 285
    iget-object v5, v9, LJ5/y;->b:[B

    .line 286
    .line 287
    add-int/lit8 v14, v4, 0x1

    .line 288
    .line 289
    add-int/lit8 v23, v13, -0x8

    .line 290
    .line 291
    move/from16 v26, v6

    .line 292
    .line 293
    ushr-int v6, v7, v23

    .line 294
    .line 295
    int-to-byte v6, v6

    .line 296
    aput-byte v6, v5, v4

    .line 297
    .line 298
    add-int/lit8 v13, v13, -0x8

    .line 299
    .line 300
    move v4, v14

    .line 301
    move/from16 v6, v26

    .line 302
    .line 303
    goto :goto_3

    .line 304
    :cond_7
    move/from16 v26, v6

    .line 305
    .line 306
    rsub-int/lit8 v5, v13, 0x8

    .line 307
    .line 308
    iget-object v6, v9, LJ5/y;->b:[B

    .line 309
    .line 310
    aget-byte v14, v6, v4

    .line 311
    .line 312
    shl-int v23, v17, v5

    .line 313
    .line 314
    add-int/lit8 v23, v23, -0x1

    .line 315
    .line 316
    and-int v14, v14, v23

    .line 317
    .line 318
    int-to-byte v14, v14

    .line 319
    aput-byte v14, v6, v4

    .line 320
    .line 321
    shl-int v13, v17, v13

    .line 322
    .line 323
    add-int/lit8 v13, v13, -0x1

    .line 324
    .line 325
    and-int/2addr v7, v13

    .line 326
    shl-int v5, v7, v5

    .line 327
    .line 328
    or-int/2addr v5, v14

    .line 329
    int-to-byte v5, v5

    .line 330
    aput-byte v5, v6, v4

    .line 331
    .line 332
    invoke-virtual {v9, v11}, LJ5/y;->t(I)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v9}, LJ5/y;->a()V

    .line 336
    .line 337
    .line 338
    move/from16 v4, v25

    .line 339
    .line 340
    move/from16 v6, v26

    .line 341
    .line 342
    const/4 v5, -0x2

    .line 343
    goto/16 :goto_2

    .line 344
    .line 345
    :cond_8
    move/from16 v25, v4

    .line 346
    .line 347
    move/from16 v26, v6

    .line 348
    .line 349
    array-length v4, v8

    .line 350
    invoke-virtual {v9, v4, v8}, LJ5/y;->o(I[B)V

    .line 351
    .line 352
    .line 353
    :goto_4
    invoke-virtual {v9, v15}, LJ5/y;->t(I)V

    .line 354
    .line 355
    .line 356
    const/4 v4, 0x6

    .line 357
    invoke-virtual {v9, v4}, LJ5/y;->i(I)I

    .line 358
    .line 359
    .line 360
    move-result v5

    .line 361
    sget-object v4, LG5/b;->j:[I

    .line 362
    .line 363
    aget v4, v4, v5

    .line 364
    .line 365
    const/4 v5, 0x4

    .line 366
    invoke-virtual {v9, v5}, LJ5/y;->i(I)I

    .line 367
    .line 368
    .line 369
    move-result v6

    .line 370
    sget-object v5, LG5/b;->k:[I

    .line 371
    .line 372
    aget v5, v5, v6

    .line 373
    .line 374
    const/4 v6, 0x5

    .line 375
    invoke-virtual {v9, v6}, LJ5/y;->i(I)I

    .line 376
    .line 377
    .line 378
    move-result v7

    .line 379
    const/16 v6, 0x1d

    .line 380
    .line 381
    if-lt v7, v6, :cond_9

    .line 382
    .line 383
    const/4 v6, -0x1

    .line 384
    goto :goto_5

    .line 385
    :cond_9
    sget-object v6, LG5/b;->l:[I

    .line 386
    .line 387
    aget v6, v6, v7

    .line 388
    .line 389
    mul-int/lit16 v6, v6, 0x3e8

    .line 390
    .line 391
    div-int/lit8 v6, v6, 0x2

    .line 392
    .line 393
    :goto_5
    const/16 v7, 0xa

    .line 394
    .line 395
    invoke-virtual {v9, v7}, LJ5/y;->t(I)V

    .line 396
    .line 397
    .line 398
    move/from16 v7, v25

    .line 399
    .line 400
    invoke-virtual {v9, v7}, LJ5/y;->i(I)I

    .line 401
    .line 402
    .line 403
    move-result v8

    .line 404
    if-lez v8, :cond_a

    .line 405
    .line 406
    move/from16 v7, v17

    .line 407
    .line 408
    goto :goto_6

    .line 409
    :cond_a
    move/from16 v7, v18

    .line 410
    .line 411
    :goto_6
    add-int/2addr v4, v7

    .line 412
    new-instance v7, LE5/S;

    .line 413
    .line 414
    invoke-direct {v7}, LE5/S;-><init>()V

    .line 415
    .line 416
    .line 417
    iput-object v10, v7, LE5/S;->a:Ljava/lang/String;

    .line 418
    .line 419
    const-string v8, "audio/vnd.dts"

    .line 420
    .line 421
    iput-object v8, v7, LE5/S;->k:Ljava/lang/String;

    .line 422
    .line 423
    iput v6, v7, LE5/S;->f:I

    .line 424
    .line 425
    iput v4, v7, LE5/S;->x:I

    .line 426
    .line 427
    iput v5, v7, LE5/S;->y:I

    .line 428
    .line 429
    const/4 v4, 0x0

    .line 430
    iput-object v4, v7, LE5/S;->n:LI5/c;

    .line 431
    .line 432
    iget-object v4, v0, LT5/d;->b:Ljava/lang/String;

    .line 433
    .line 434
    iput-object v4, v7, LE5/S;->c:Ljava/lang/String;

    .line 435
    .line 436
    new-instance v4, LE5/T;

    .line 437
    .line 438
    invoke-direct {v4, v7}, LE5/T;-><init>(LE5/S;)V

    .line 439
    .line 440
    .line 441
    iput-object v4, v0, LT5/d;->i:LE5/T;

    .line 442
    .line 443
    iget-object v5, v0, LT5/d;->d:LJ5/w;

    .line 444
    .line 445
    invoke-interface {v5, v4}, LJ5/w;->a(LE5/T;)V

    .line 446
    .line 447
    .line 448
    goto :goto_7

    .line 449
    :cond_b
    move/from16 v26, v6

    .line 450
    .line 451
    move/from16 v18, v9

    .line 452
    .line 453
    :goto_7
    aget-byte v4, v2, v18

    .line 454
    .line 455
    const/4 v5, 0x7

    .line 456
    const/4 v6, -0x2

    .line 457
    if-eq v4, v6, :cond_e

    .line 458
    .line 459
    const/4 v6, -0x1

    .line 460
    if-eq v4, v6, :cond_d

    .line 461
    .line 462
    const/16 v6, 0x1f

    .line 463
    .line 464
    if-eq v4, v6, :cond_c

    .line 465
    .line 466
    const/16 v19, 0x5

    .line 467
    .line 468
    aget-byte v6, v2, v19

    .line 469
    .line 470
    and-int/lit8 v6, v6, 0x3

    .line 471
    .line 472
    shl-int/lit8 v6, v6, 0xc

    .line 473
    .line 474
    const/16 v21, 0x6

    .line 475
    .line 476
    aget-byte v7, v2, v21

    .line 477
    .line 478
    and-int/lit16 v7, v7, 0xff

    .line 479
    .line 480
    const/16 v20, 0x4

    .line 481
    .line 482
    shl-int/lit8 v7, v7, 0x4

    .line 483
    .line 484
    or-int/2addr v6, v7

    .line 485
    aget-byte v7, v2, v5

    .line 486
    .line 487
    :goto_8
    and-int/lit16 v7, v7, 0xf0

    .line 488
    .line 489
    shr-int/lit8 v7, v7, 0x4

    .line 490
    .line 491
    or-int/2addr v6, v7

    .line 492
    add-int/lit8 v6, v6, 0x1

    .line 493
    .line 494
    move/from16 v7, v18

    .line 495
    .line 496
    goto :goto_a

    .line 497
    :cond_c
    const/16 v20, 0x4

    .line 498
    .line 499
    const/16 v21, 0x6

    .line 500
    .line 501
    aget-byte v6, v2, v21

    .line 502
    .line 503
    and-int/lit8 v6, v6, 0x3

    .line 504
    .line 505
    shl-int/lit8 v6, v6, 0xc

    .line 506
    .line 507
    aget-byte v7, v2, v5

    .line 508
    .line 509
    and-int/lit16 v7, v7, 0xff

    .line 510
    .line 511
    shl-int/lit8 v7, v7, 0x4

    .line 512
    .line 513
    or-int/2addr v6, v7

    .line 514
    aget-byte v7, v2, v26

    .line 515
    .line 516
    :goto_9
    and-int/2addr v7, v15

    .line 517
    const/16 v25, 0x2

    .line 518
    .line 519
    shr-int/lit8 v7, v7, 0x2

    .line 520
    .line 521
    or-int/2addr v6, v7

    .line 522
    add-int/lit8 v6, v6, 0x1

    .line 523
    .line 524
    move/from16 v7, v17

    .line 525
    .line 526
    goto :goto_a

    .line 527
    :cond_d
    aget-byte v6, v2, v5

    .line 528
    .line 529
    and-int/lit8 v6, v6, 0x3

    .line 530
    .line 531
    shl-int/lit8 v6, v6, 0xc

    .line 532
    .line 533
    const/16 v21, 0x6

    .line 534
    .line 535
    aget-byte v7, v2, v21

    .line 536
    .line 537
    and-int/lit16 v7, v7, 0xff

    .line 538
    .line 539
    const/16 v20, 0x4

    .line 540
    .line 541
    shl-int/lit8 v7, v7, 0x4

    .line 542
    .line 543
    or-int/2addr v6, v7

    .line 544
    const/16 v7, 0x9

    .line 545
    .line 546
    aget-byte v7, v2, v7

    .line 547
    .line 548
    goto :goto_9

    .line 549
    :cond_e
    const/16 v20, 0x4

    .line 550
    .line 551
    aget-byte v6, v2, v20

    .line 552
    .line 553
    and-int/lit8 v6, v6, 0x3

    .line 554
    .line 555
    shl-int/lit8 v6, v6, 0xc

    .line 556
    .line 557
    aget-byte v7, v2, v5

    .line 558
    .line 559
    and-int/lit16 v7, v7, 0xff

    .line 560
    .line 561
    shl-int/lit8 v7, v7, 0x4

    .line 562
    .line 563
    or-int/2addr v6, v7

    .line 564
    const/16 v21, 0x6

    .line 565
    .line 566
    aget-byte v7, v2, v21

    .line 567
    .line 568
    goto :goto_8

    .line 569
    :goto_a
    if-eqz v7, :cond_f

    .line 570
    .line 571
    mul-int/lit8 v6, v6, 0x10

    .line 572
    .line 573
    div-int/2addr v6, v11

    .line 574
    :cond_f
    iput v6, v0, LT5/d;->j:I

    .line 575
    .line 576
    const/4 v6, -0x2

    .line 577
    if-eq v4, v6, :cond_12

    .line 578
    .line 579
    const/4 v6, -0x1

    .line 580
    if-eq v4, v6, :cond_11

    .line 581
    .line 582
    const/16 v6, 0x1f

    .line 583
    .line 584
    if-eq v4, v6, :cond_10

    .line 585
    .line 586
    const/16 v20, 0x4

    .line 587
    .line 588
    aget-byte v4, v2, v20

    .line 589
    .line 590
    and-int/lit8 v4, v4, 0x1

    .line 591
    .line 592
    const/16 v21, 0x6

    .line 593
    .line 594
    shl-int/lit8 v4, v4, 0x6

    .line 595
    .line 596
    const/16 v19, 0x5

    .line 597
    .line 598
    aget-byte v2, v2, v19

    .line 599
    .line 600
    and-int/lit16 v2, v2, 0xfc

    .line 601
    .line 602
    const/16 v25, 0x2

    .line 603
    .line 604
    :goto_b
    shr-int/lit8 v2, v2, 0x2

    .line 605
    .line 606
    or-int/2addr v2, v4

    .line 607
    goto :goto_d

    .line 608
    :cond_10
    const/16 v19, 0x5

    .line 609
    .line 610
    const/16 v20, 0x4

    .line 611
    .line 612
    const/16 v21, 0x6

    .line 613
    .line 614
    const/16 v25, 0x2

    .line 615
    .line 616
    aget-byte v4, v2, v19

    .line 617
    .line 618
    and-int/2addr v4, v5

    .line 619
    shl-int/lit8 v4, v4, 0x4

    .line 620
    .line 621
    aget-byte v2, v2, v21

    .line 622
    .line 623
    :goto_c
    and-int/2addr v2, v15

    .line 624
    goto :goto_b

    .line 625
    :cond_11
    const/16 v20, 0x4

    .line 626
    .line 627
    const/16 v25, 0x2

    .line 628
    .line 629
    aget-byte v4, v2, v20

    .line 630
    .line 631
    and-int/2addr v4, v5

    .line 632
    shl-int/lit8 v4, v4, 0x4

    .line 633
    .line 634
    aget-byte v2, v2, v5

    .line 635
    .line 636
    goto :goto_c

    .line 637
    :cond_12
    const/16 v19, 0x5

    .line 638
    .line 639
    const/16 v20, 0x4

    .line 640
    .line 641
    const/16 v25, 0x2

    .line 642
    .line 643
    aget-byte v4, v2, v19

    .line 644
    .line 645
    and-int/lit8 v4, v4, 0x1

    .line 646
    .line 647
    const/16 v21, 0x6

    .line 648
    .line 649
    shl-int/lit8 v4, v4, 0x6

    .line 650
    .line 651
    aget-byte v2, v2, v20

    .line 652
    .line 653
    and-int/lit16 v2, v2, 0xfc

    .line 654
    .line 655
    goto :goto_b

    .line 656
    :goto_d
    add-int/lit8 v2, v2, 0x1

    .line 657
    .line 658
    mul-int/lit8 v2, v2, 0x20

    .line 659
    .line 660
    int-to-long v4, v2

    .line 661
    const-wide/32 v6, 0xf4240

    .line 662
    .line 663
    .line 664
    mul-long/2addr v4, v6

    .line 665
    iget-object v2, v0, LT5/d;->i:LE5/T;

    .line 666
    .line 667
    iget v2, v2, LE5/T;->z:I

    .line 668
    .line 669
    int-to-long v6, v2

    .line 670
    div-long/2addr v4, v6

    .line 671
    long-to-int v2, v4

    .line 672
    int-to-long v4, v2

    .line 673
    iput-wide v4, v0, LT5/d;->h:J

    .line 674
    .line 675
    move/from16 v2, v18

    .line 676
    .line 677
    invoke-virtual {v3, v2}, LY4/b;->A(I)V

    .line 678
    .line 679
    .line 680
    iget-object v2, v0, LT5/d;->d:LJ5/w;

    .line 681
    .line 682
    const/16 v4, 0x12

    .line 683
    .line 684
    invoke-interface {v2, v4, v3}, LJ5/w;->c(ILY4/b;)V

    .line 685
    .line 686
    .line 687
    const/4 v7, 0x2

    .line 688
    iput v7, v0, LT5/d;->e:I

    .line 689
    .line 690
    goto/16 :goto_0

    .line 691
    .line 692
    :cond_13
    move/from16 v17, v5

    .line 693
    .line 694
    move/from16 v26, v6

    .line 695
    .line 696
    const/16 v16, 0x3

    .line 697
    .line 698
    :cond_14
    invoke-virtual {v1}, LY4/b;->a()I

    .line 699
    .line 700
    .line 701
    move-result v2

    .line 702
    if-lez v2, :cond_0

    .line 703
    .line 704
    iget v2, v0, LT5/d;->g:I

    .line 705
    .line 706
    shl-int/lit8 v2, v2, 0x8

    .line 707
    .line 708
    iput v2, v0, LT5/d;->g:I

    .line 709
    .line 710
    invoke-virtual {v1}, LY4/b;->q()I

    .line 711
    .line 712
    .line 713
    move-result v4

    .line 714
    or-int/2addr v2, v4

    .line 715
    iput v2, v0, LT5/d;->g:I

    .line 716
    .line 717
    const v4, 0x7ffe8001

    .line 718
    .line 719
    .line 720
    if-eq v2, v4, :cond_15

    .line 721
    .line 722
    const v4, -0x180fe80

    .line 723
    .line 724
    .line 725
    if-eq v2, v4, :cond_15

    .line 726
    .line 727
    const v4, 0x1fffe800

    .line 728
    .line 729
    .line 730
    if-eq v2, v4, :cond_15

    .line 731
    .line 732
    const v4, -0xe0ff18

    .line 733
    .line 734
    .line 735
    if-ne v2, v4, :cond_14

    .line 736
    .line 737
    :cond_15
    iget-object v3, v3, LY4/b;->a:[B

    .line 738
    .line 739
    shr-int/lit8 v4, v2, 0x18

    .line 740
    .line 741
    and-int/lit16 v4, v4, 0xff

    .line 742
    .line 743
    int-to-byte v4, v4

    .line 744
    const/16 v18, 0x0

    .line 745
    .line 746
    aput-byte v4, v3, v18

    .line 747
    .line 748
    shr-int/lit8 v4, v2, 0x10

    .line 749
    .line 750
    and-int/lit16 v4, v4, 0xff

    .line 751
    .line 752
    int-to-byte v4, v4

    .line 753
    aput-byte v4, v3, v17

    .line 754
    .line 755
    shr-int/lit8 v4, v2, 0x8

    .line 756
    .line 757
    and-int/lit16 v4, v4, 0xff

    .line 758
    .line 759
    int-to-byte v4, v4

    .line 760
    const/16 v25, 0x2

    .line 761
    .line 762
    aput-byte v4, v3, v25

    .line 763
    .line 764
    and-int/lit16 v2, v2, 0xff

    .line 765
    .line 766
    int-to-byte v2, v2

    .line 767
    aput-byte v2, v3, v16

    .line 768
    .line 769
    const/4 v5, 0x4

    .line 770
    iput v5, v0, LT5/d;->f:I

    .line 771
    .line 772
    const/4 v2, 0x0

    .line 773
    iput v2, v0, LT5/d;->g:I

    .line 774
    .line 775
    move/from16 v2, v17

    .line 776
    .line 777
    iput v2, v0, LT5/d;->e:I

    .line 778
    .line 779
    goto/16 :goto_0

    .line 780
    .line 781
    :cond_16
    return-void
.end method

.method public final d(IJ)V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long p1, p2, v0

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iput-wide p2, p0, LT5/d;->k:J

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final g(LJ5/m;LT5/B;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, LT5/B;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, LT5/B;->b()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, LT5/B;->f:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, LT5/d;->c:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, LT5/B;->b()V

    .line 12
    .line 13
    .line 14
    iget p2, p2, LT5/B;->e:I

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-interface {p1, p2, v0}, LJ5/m;->m(II)LJ5/w;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, LT5/d;->d:LJ5/w;

    .line 22
    .line 23
    return-void
.end method

.method public final i()V
    .locals 0

    .line 1
    return-void
.end method
