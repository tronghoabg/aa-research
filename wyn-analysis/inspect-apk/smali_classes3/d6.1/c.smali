.class public final Ld6/c;
.super Lic/d;
.source "SourceFile"


# instance fields
.field public final b:LY4/b;

.field public final c:LJ5/y;

.field public d:Lu6/t;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    iput-object v0, p0, Ld6/c;->b:LY4/b;

    .line 10
    .line 11
    new-instance v0, LJ5/y;

    .line 12
    .line 13
    const/4 v1, 0x6

    .line 14
    invoke-direct {v0, v1}, LJ5/y;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ld6/c;->c:LJ5/y;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final r(LW5/e;Ljava/nio/ByteBuffer;)LW5/c;
    .locals 54

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/16 v3, 0x20

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, v0, Ld6/c;->d:Lu6/t;

    .line 9
    .line 10
    if-eqz v5, :cond_0

    .line 11
    .line 12
    iget-wide v6, v1, LW5/e;->i:J

    .line 13
    .line 14
    invoke-virtual {v5}, Lu6/t;->d()J

    .line 15
    .line 16
    .line 17
    move-result-wide v8

    .line 18
    cmp-long v5, v6, v8

    .line 19
    .line 20
    if-eqz v5, :cond_1

    .line 21
    .line 22
    :cond_0
    new-instance v5, Lu6/t;

    .line 23
    .line 24
    iget-wide v6, v1, LH5/h;->f:J

    .line 25
    .line 26
    invoke-direct {v5, v6, v7}, Lu6/t;-><init>(J)V

    .line 27
    .line 28
    .line 29
    iput-object v5, v0, Ld6/c;->d:Lu6/t;

    .line 30
    .line 31
    iget-wide v6, v1, LH5/h;->f:J

    .line 32
    .line 33
    iget-wide v8, v1, LW5/e;->i:J

    .line 34
    .line 35
    sub-long/2addr v6, v8

    .line 36
    invoke-virtual {v5, v6, v7}, Lu6/t;->a(J)J

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual/range {p2 .. p2}, Ljava/nio/Buffer;->limit()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    iget-object v6, v0, Ld6/c;->b:LY4/b;

    .line 48
    .line 49
    invoke-virtual {v6, v5, v1}, LY4/b;->y(I[B)V

    .line 50
    .line 51
    .line 52
    iget-object v7, v0, Ld6/c;->c:LJ5/y;

    .line 53
    .line 54
    invoke-virtual {v7, v5, v1}, LJ5/y;->o(I[B)V

    .line 55
    .line 56
    .line 57
    const/16 v1, 0x27

    .line 58
    .line 59
    invoke-virtual {v7, v1}, LJ5/y;->t(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v7, v4}, LJ5/y;->i(I)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    int-to-long v8, v1

    .line 67
    shl-long/2addr v8, v3

    .line 68
    invoke-virtual {v7, v3}, LJ5/y;->i(I)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    int-to-long v10, v1

    .line 73
    or-long/2addr v8, v10

    .line 74
    const/16 v1, 0x14

    .line 75
    .line 76
    invoke-virtual {v7, v1}, LJ5/y;->t(I)V

    .line 77
    .line 78
    .line 79
    const/16 v1, 0xc

    .line 80
    .line 81
    invoke-virtual {v7, v1}, LJ5/y;->i(I)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    const/16 v5, 0x8

    .line 86
    .line 87
    invoke-virtual {v7, v5}, LJ5/y;->i(I)I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    const/16 v7, 0xe

    .line 92
    .line 93
    invoke-virtual {v6, v7}, LY4/b;->B(I)V

    .line 94
    .line 95
    .line 96
    if-eqz v5, :cond_1d

    .line 97
    .line 98
    const/16 v7, 0xff

    .line 99
    .line 100
    const/4 v10, 0x4

    .line 101
    if-eq v5, v7, :cond_1c

    .line 102
    .line 103
    const-wide/16 v15, 0x1

    .line 104
    .line 105
    const-wide/16 v17, 0x0

    .line 106
    .line 107
    const-wide/16 v19, 0x80

    .line 108
    .line 109
    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    if-eq v5, v10, :cond_10

    .line 115
    .line 116
    const/4 v1, 0x5

    .line 117
    if-eq v5, v1, :cond_3

    .line 118
    .line 119
    const/4 v1, 0x6

    .line 120
    if-eq v5, v1, :cond_2

    .line 121
    .line 122
    const/4 v1, 0x0

    .line 123
    :goto_0
    move/from16 v25, v4

    .line 124
    .line 125
    goto/16 :goto_1a

    .line 126
    .line 127
    :cond_2
    iget-object v1, v0, Ld6/c;->d:Lu6/t;

    .line 128
    .line 129
    invoke-static {v8, v9, v6}, Ld6/j;->c(JLY4/b;)J

    .line 130
    .line 131
    .line 132
    move-result-wide v5

    .line 133
    invoke-virtual {v1, v5, v6}, Lu6/t;->b(J)J

    .line 134
    .line 135
    .line 136
    move-result-wide v7

    .line 137
    new-instance v1, Ld6/j;

    .line 138
    .line 139
    invoke-direct {v1, v5, v6, v7, v8}, Ld6/j;-><init>(JJ)V

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_3
    iget-object v1, v0, Ld6/c;->d:Lu6/t;

    .line 144
    .line 145
    invoke-virtual {v6}, LY4/b;->r()J

    .line 146
    .line 147
    .line 148
    move-result-wide v24

    .line 149
    invoke-virtual {v6}, LY4/b;->q()I

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    and-int/lit16 v5, v5, 0x80

    .line 154
    .line 155
    if-eqz v5, :cond_4

    .line 156
    .line 157
    move/from16 v26, v4

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_4
    const/16 v26, 0x0

    .line 161
    .line 162
    :goto_1
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 163
    .line 164
    if-nez v26, :cond_f

    .line 165
    .line 166
    invoke-virtual {v6}, LY4/b;->q()I

    .line 167
    .line 168
    .line 169
    move-result v7

    .line 170
    and-int/lit16 v10, v7, 0x80

    .line 171
    .line 172
    if-eqz v10, :cond_5

    .line 173
    .line 174
    move v10, v4

    .line 175
    goto :goto_2

    .line 176
    :cond_5
    const/4 v10, 0x0

    .line 177
    :goto_2
    and-int/lit8 v23, v7, 0x40

    .line 178
    .line 179
    if-eqz v23, :cond_6

    .line 180
    .line 181
    move/from16 v23, v4

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_6
    const/16 v23, 0x0

    .line 185
    .line 186
    :goto_3
    and-int/lit8 v27, v7, 0x20

    .line 187
    .line 188
    if-eqz v27, :cond_7

    .line 189
    .line 190
    move/from16 v27, v4

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_7
    const/16 v27, 0x0

    .line 194
    .line 195
    :goto_4
    and-int/lit8 v7, v7, 0x10

    .line 196
    .line 197
    if-eqz v7, :cond_8

    .line 198
    .line 199
    move v7, v4

    .line 200
    goto :goto_5

    .line 201
    :cond_8
    const/4 v7, 0x0

    .line 202
    :goto_5
    if-eqz v23, :cond_9

    .line 203
    .line 204
    if-nez v7, :cond_9

    .line 205
    .line 206
    invoke-static {v8, v9, v6}, Ld6/j;->c(JLY4/b;)J

    .line 207
    .line 208
    .line 209
    move-result-wide v28

    .line 210
    goto :goto_6

    .line 211
    :cond_9
    move-wide/from16 v28, v21

    .line 212
    .line 213
    :goto_6
    if-nez v23, :cond_c

    .line 214
    .line 215
    invoke-virtual {v6}, LY4/b;->q()I

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    move/from16 v30, v3

    .line 220
    .line 221
    new-instance v3, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 224
    .line 225
    .line 226
    const-wide/16 p1, 0x5a

    .line 227
    .line 228
    const/4 v11, 0x0

    .line 229
    :goto_7
    if-ge v11, v5, :cond_b

    .line 230
    .line 231
    invoke-virtual {v6}, LY4/b;->q()I

    .line 232
    .line 233
    .line 234
    move-result v32

    .line 235
    if-nez v7, :cond_a

    .line 236
    .line 237
    invoke-static {v8, v9, v6}, Ld6/j;->c(JLY4/b;)J

    .line 238
    .line 239
    .line 240
    move-result-wide v33

    .line 241
    move-wide/from16 v13, v33

    .line 242
    .line 243
    :goto_8
    const-wide/16 v37, 0x3e8

    .line 244
    .line 245
    goto :goto_9

    .line 246
    :cond_a
    move-wide/from16 v13, v21

    .line 247
    .line 248
    goto :goto_8

    .line 249
    :goto_9
    new-instance v31, Ld6/d;

    .line 250
    .line 251
    invoke-virtual {v1, v13, v14}, Lu6/t;->b(J)J

    .line 252
    .line 253
    .line 254
    move-result-wide v35

    .line 255
    move-wide/from16 v33, v13

    .line 256
    .line 257
    invoke-direct/range {v31 .. v36}, Ld6/d;-><init>(IJJ)V

    .line 258
    .line 259
    .line 260
    move-object/from16 v12, v31

    .line 261
    .line 262
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    add-int/2addr v11, v4

    .line 266
    goto :goto_7

    .line 267
    :cond_b
    move-object v5, v3

    .line 268
    :goto_a
    const-wide/16 v37, 0x3e8

    .line 269
    .line 270
    goto :goto_b

    .line 271
    :cond_c
    move/from16 v30, v3

    .line 272
    .line 273
    const-wide/16 p1, 0x5a

    .line 274
    .line 275
    goto :goto_a

    .line 276
    :goto_b
    if-eqz v27, :cond_e

    .line 277
    .line 278
    invoke-virtual {v6}, LY4/b;->q()I

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    int-to-long v8, v3

    .line 283
    and-long v11, v8, v19

    .line 284
    .line 285
    cmp-long v3, v11, v17

    .line 286
    .line 287
    if-eqz v3, :cond_d

    .line 288
    .line 289
    move v3, v4

    .line 290
    goto :goto_c

    .line 291
    :cond_d
    const/4 v3, 0x0

    .line 292
    :goto_c
    and-long/2addr v8, v15

    .line 293
    shl-long v8, v8, v30

    .line 294
    .line 295
    invoke-virtual {v6}, LY4/b;->r()J

    .line 296
    .line 297
    .line 298
    move-result-wide v11

    .line 299
    or-long/2addr v8, v11

    .line 300
    mul-long v8, v8, v37

    .line 301
    .line 302
    div-long v21, v8, p1

    .line 303
    .line 304
    goto :goto_d

    .line 305
    :cond_e
    const/4 v3, 0x0

    .line 306
    :goto_d
    invoke-virtual {v6}, LY4/b;->v()I

    .line 307
    .line 308
    .line 309
    move-result v8

    .line 310
    invoke-virtual {v6}, LY4/b;->q()I

    .line 311
    .line 312
    .line 313
    move-result v9

    .line 314
    invoke-virtual {v6}, LY4/b;->q()I

    .line 315
    .line 316
    .line 317
    move-result v6

    .line 318
    move/from16 v35, v3

    .line 319
    .line 320
    move-object/from16 v34, v5

    .line 321
    .line 322
    move/from16 v40, v6

    .line 323
    .line 324
    move/from16 v38, v8

    .line 325
    .line 326
    move/from16 v39, v9

    .line 327
    .line 328
    move/from16 v27, v10

    .line 329
    .line 330
    move-wide/from16 v36, v21

    .line 331
    .line 332
    move-wide/from16 v5, v28

    .line 333
    .line 334
    move/from16 v29, v7

    .line 335
    .line 336
    move/from16 v28, v23

    .line 337
    .line 338
    goto :goto_e

    .line 339
    :cond_f
    move-object/from16 v34, v5

    .line 340
    .line 341
    move-wide/from16 v5, v21

    .line 342
    .line 343
    move-wide/from16 v36, v5

    .line 344
    .line 345
    const/16 v27, 0x0

    .line 346
    .line 347
    const/16 v28, 0x0

    .line 348
    .line 349
    const/16 v29, 0x0

    .line 350
    .line 351
    const/16 v35, 0x0

    .line 352
    .line 353
    const/16 v38, 0x0

    .line 354
    .line 355
    const/16 v39, 0x0

    .line 356
    .line 357
    const/16 v40, 0x0

    .line 358
    .line 359
    :goto_e
    new-instance v23, Ld6/e;

    .line 360
    .line 361
    invoke-virtual {v1, v5, v6}, Lu6/t;->b(J)J

    .line 362
    .line 363
    .line 364
    move-result-wide v32

    .line 365
    move-wide/from16 v30, v5

    .line 366
    .line 367
    invoke-direct/range {v23 .. v40}, Ld6/e;-><init>(JZZZZJJLjava/util/List;ZJIII)V

    .line 368
    .line 369
    .line 370
    move/from16 v25, v4

    .line 371
    .line 372
    move-object/from16 v1, v23

    .line 373
    .line 374
    goto/16 :goto_1a

    .line 375
    .line 376
    :cond_10
    move/from16 v30, v3

    .line 377
    .line 378
    const-wide/16 p1, 0x5a

    .line 379
    .line 380
    const-wide/16 v37, 0x3e8

    .line 381
    .line 382
    invoke-virtual {v6}, LY4/b;->q()I

    .line 383
    .line 384
    .line 385
    move-result v1

    .line 386
    new-instance v3, Ljava/util/ArrayList;

    .line 387
    .line 388
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 389
    .line 390
    .line 391
    const/4 v5, 0x0

    .line 392
    :goto_f
    if-ge v5, v1, :cond_1b

    .line 393
    .line 394
    invoke-virtual {v6}, LY4/b;->r()J

    .line 395
    .line 396
    .line 397
    move-result-wide v40

    .line 398
    invoke-virtual {v6}, LY4/b;->q()I

    .line 399
    .line 400
    .line 401
    move-result v7

    .line 402
    and-int/lit16 v7, v7, 0x80

    .line 403
    .line 404
    if-eqz v7, :cond_11

    .line 405
    .line 406
    move/from16 v42, v4

    .line 407
    .line 408
    goto :goto_10

    .line 409
    :cond_11
    const/16 v42, 0x0

    .line 410
    .line 411
    :goto_10
    new-instance v7, Ljava/util/ArrayList;

    .line 412
    .line 413
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 414
    .line 415
    .line 416
    if-nez v42, :cond_1a

    .line 417
    .line 418
    invoke-virtual {v6}, LY4/b;->q()I

    .line 419
    .line 420
    .line 421
    move-result v8

    .line 422
    and-int/lit16 v9, v8, 0x80

    .line 423
    .line 424
    if-eqz v9, :cond_12

    .line 425
    .line 426
    move v9, v4

    .line 427
    goto :goto_11

    .line 428
    :cond_12
    const/4 v9, 0x0

    .line 429
    :goto_11
    and-int/lit8 v10, v8, 0x40

    .line 430
    .line 431
    if-eqz v10, :cond_13

    .line 432
    .line 433
    move v10, v4

    .line 434
    goto :goto_12

    .line 435
    :cond_13
    const/4 v10, 0x0

    .line 436
    :goto_12
    and-int/lit8 v8, v8, 0x20

    .line 437
    .line 438
    if-eqz v8, :cond_14

    .line 439
    .line 440
    move v8, v4

    .line 441
    goto :goto_13

    .line 442
    :cond_14
    const/4 v8, 0x0

    .line 443
    :goto_13
    if-eqz v10, :cond_15

    .line 444
    .line 445
    invoke-virtual {v6}, LY4/b;->r()J

    .line 446
    .line 447
    .line 448
    move-result-wide v11

    .line 449
    goto :goto_14

    .line 450
    :cond_15
    move-wide/from16 v11, v21

    .line 451
    .line 452
    :goto_14
    if-nez v10, :cond_17

    .line 453
    .line 454
    invoke-virtual {v6}, LY4/b;->q()I

    .line 455
    .line 456
    .line 457
    move-result v7

    .line 458
    new-instance v13, Ljava/util/ArrayList;

    .line 459
    .line 460
    invoke-direct {v13, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 461
    .line 462
    .line 463
    const/4 v14, 0x0

    .line 464
    :goto_15
    if-ge v14, v7, :cond_16

    .line 465
    .line 466
    move-wide/from16 v23, v15

    .line 467
    .line 468
    invoke-virtual {v6}, LY4/b;->q()I

    .line 469
    .line 470
    .line 471
    move-result v15

    .line 472
    move/from16 v25, v4

    .line 473
    .line 474
    move/from16 v16, v5

    .line 475
    .line 476
    invoke-virtual {v6}, LY4/b;->r()J

    .line 477
    .line 478
    .line 479
    move-result-wide v4

    .line 480
    new-instance v2, Ld6/g;

    .line 481
    .line 482
    invoke-direct {v2, v15, v4, v5}, Ld6/g;-><init>(IJ)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    add-int/lit8 v14, v14, 0x1

    .line 489
    .line 490
    move/from16 v5, v16

    .line 491
    .line 492
    move-wide/from16 v15, v23

    .line 493
    .line 494
    move/from16 v4, v25

    .line 495
    .line 496
    goto :goto_15

    .line 497
    :cond_16
    move-object v7, v13

    .line 498
    :cond_17
    move/from16 v25, v4

    .line 499
    .line 500
    move-wide/from16 v23, v15

    .line 501
    .line 502
    move/from16 v16, v5

    .line 503
    .line 504
    if-eqz v8, :cond_19

    .line 505
    .line 506
    invoke-virtual {v6}, LY4/b;->q()I

    .line 507
    .line 508
    .line 509
    move-result v2

    .line 510
    int-to-long v4, v2

    .line 511
    and-long v13, v4, v19

    .line 512
    .line 513
    cmp-long v2, v13, v17

    .line 514
    .line 515
    if-eqz v2, :cond_18

    .line 516
    .line 517
    move/from16 v2, v25

    .line 518
    .line 519
    goto :goto_16

    .line 520
    :cond_18
    const/4 v2, 0x0

    .line 521
    :goto_16
    and-long v4, v4, v23

    .line 522
    .line 523
    shl-long v4, v4, v30

    .line 524
    .line 525
    invoke-virtual {v6}, LY4/b;->r()J

    .line 526
    .line 527
    .line 528
    move-result-wide v13

    .line 529
    or-long/2addr v4, v13

    .line 530
    mul-long v4, v4, v37

    .line 531
    .line 532
    div-long v4, v4, p1

    .line 533
    .line 534
    goto :goto_17

    .line 535
    :cond_19
    move-wide/from16 v4, v21

    .line 536
    .line 537
    const/4 v2, 0x0

    .line 538
    :goto_17
    invoke-virtual {v6}, LY4/b;->v()I

    .line 539
    .line 540
    .line 541
    move-result v8

    .line 542
    invoke-virtual {v6}, LY4/b;->q()I

    .line 543
    .line 544
    .line 545
    move-result v13

    .line 546
    invoke-virtual {v6}, LY4/b;->q()I

    .line 547
    .line 548
    .line 549
    move-result v14

    .line 550
    move/from16 v48, v2

    .line 551
    .line 552
    move-wide/from16 v49, v4

    .line 553
    .line 554
    move/from16 v51, v8

    .line 555
    .line 556
    move/from16 v43, v9

    .line 557
    .line 558
    move/from16 v44, v10

    .line 559
    .line 560
    move-wide/from16 v46, v11

    .line 561
    .line 562
    move/from16 v52, v13

    .line 563
    .line 564
    move/from16 v53, v14

    .line 565
    .line 566
    :goto_18
    move-object/from16 v45, v7

    .line 567
    .line 568
    goto :goto_19

    .line 569
    :cond_1a
    move/from16 v25, v4

    .line 570
    .line 571
    move-wide/from16 v23, v15

    .line 572
    .line 573
    move/from16 v16, v5

    .line 574
    .line 575
    move-wide/from16 v46, v21

    .line 576
    .line 577
    move-wide/from16 v49, v46

    .line 578
    .line 579
    const/16 v43, 0x0

    .line 580
    .line 581
    const/16 v44, 0x0

    .line 582
    .line 583
    const/16 v48, 0x0

    .line 584
    .line 585
    const/16 v51, 0x0

    .line 586
    .line 587
    const/16 v52, 0x0

    .line 588
    .line 589
    const/16 v53, 0x0

    .line 590
    .line 591
    goto :goto_18

    .line 592
    :goto_19
    new-instance v39, Ld6/h;

    .line 593
    .line 594
    invoke-direct/range {v39 .. v53}, Ld6/h;-><init>(JZZZLjava/util/ArrayList;JZJIII)V

    .line 595
    .line 596
    .line 597
    move-object/from16 v2, v39

    .line 598
    .line 599
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    add-int/lit8 v5, v16, 0x1

    .line 603
    .line 604
    move-wide/from16 v15, v23

    .line 605
    .line 606
    move/from16 v4, v25

    .line 607
    .line 608
    goto/16 :goto_f

    .line 609
    .line 610
    :cond_1b
    move/from16 v25, v4

    .line 611
    .line 612
    new-instance v1, Ld6/i;

    .line 613
    .line 614
    invoke-direct {v1, v3}, Ld6/i;-><init>(Ljava/util/ArrayList;)V

    .line 615
    .line 616
    .line 617
    goto :goto_1a

    .line 618
    :cond_1c
    move/from16 v25, v4

    .line 619
    .line 620
    invoke-virtual {v6}, LY4/b;->r()J

    .line 621
    .line 622
    .line 623
    move-result-wide v13

    .line 624
    sub-int/2addr v1, v10

    .line 625
    new-array v15, v1, [B

    .line 626
    .line 627
    const/4 v2, 0x0

    .line 628
    invoke-virtual {v6, v2, v1, v15}, LY4/b;->c(II[B)V

    .line 629
    .line 630
    .line 631
    new-instance v12, Ld6/a;

    .line 632
    .line 633
    move-wide/from16 v16, v8

    .line 634
    .line 635
    invoke-direct/range {v12 .. v17}, Ld6/a;-><init>(J[BJ)V

    .line 636
    .line 637
    .line 638
    move-object v1, v12

    .line 639
    goto :goto_1a

    .line 640
    :cond_1d
    move/from16 v25, v4

    .line 641
    .line 642
    new-instance v1, Ld6/f;

    .line 643
    .line 644
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 645
    .line 646
    .line 647
    :goto_1a
    if-nez v1, :cond_1e

    .line 648
    .line 649
    new-instance v1, LW5/c;

    .line 650
    .line 651
    const/4 v2, 0x0

    .line 652
    new-array v2, v2, [LW5/b;

    .line 653
    .line 654
    invoke-direct {v1, v2}, LW5/c;-><init>([LW5/b;)V

    .line 655
    .line 656
    .line 657
    return-object v1

    .line 658
    :cond_1e
    const/4 v2, 0x0

    .line 659
    new-instance v3, LW5/c;

    .line 660
    .line 661
    move/from16 v4, v25

    .line 662
    .line 663
    new-array v4, v4, [LW5/b;

    .line 664
    .line 665
    aput-object v1, v4, v2

    .line 666
    .line 667
    invoke-direct {v3, v4}, LW5/c;-><init>([LW5/b;)V

    .line 668
    .line 669
    .line 670
    return-object v3
.end method
