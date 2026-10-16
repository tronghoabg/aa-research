.class public abstract LQ0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [Z

    .line 3
    .line 4
    sput-object v0, LQ0/j;->a:[Z

    .line 5
    .line 6
    return-void
.end method

.method public static a(LQ0/e;LO0/c;Ljava/util/ArrayList;I)V
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v10, p2

    .line 6
    .line 7
    if-nez p3, :cond_0

    .line 8
    .line 9
    iget v2, v0, LQ0/e;->z0:I

    .line 10
    .line 11
    iget-object v3, v0, LQ0/e;->C0:[LQ0/b;

    .line 12
    .line 13
    const/4 v15, 0x0

    .line 14
    :goto_0
    move v13, v2

    .line 15
    move-object v14, v3

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    iget v2, v0, LQ0/e;->A0:I

    .line 18
    .line 19
    iget-object v3, v0, LQ0/e;->B0:[LQ0/b;

    .line 20
    .line 21
    const/4 v15, 0x2

    .line 22
    goto :goto_0

    .line 23
    :goto_1
    const/4 v2, 0x0

    .line 24
    :goto_2
    if-ge v2, v13, :cond_71

    .line 25
    .line 26
    aget-object v3, v14, v2

    .line 27
    .line 28
    iget-boolean v4, v3, LQ0/b;->q:Z

    .line 29
    .line 30
    iget-object v5, v3, LQ0/b;->a:LQ0/d;

    .line 31
    .line 32
    const/4 v6, 0x3

    .line 33
    const/16 v9, 0x8

    .line 34
    .line 35
    const/16 v16, 0x0

    .line 36
    .line 37
    if-nez v4, :cond_19

    .line 38
    .line 39
    iget v4, v3, LQ0/b;->l:I

    .line 40
    .line 41
    mul-int/lit8 v17, v4, 0x2

    .line 42
    .line 43
    move-object v8, v5

    .line 44
    move-object v12, v8

    .line 45
    const/16 v18, 0x0

    .line 46
    .line 47
    const/16 v19, 0x0

    .line 48
    .line 49
    :goto_3
    if-nez v18, :cond_14

    .line 50
    .line 51
    const/16 v20, 0x1

    .line 52
    .line 53
    iget v7, v3, LQ0/b;->i:I

    .line 54
    .line 55
    add-int/lit8 v7, v7, 0x1

    .line 56
    .line 57
    iput v7, v3, LQ0/b;->i:I

    .line 58
    .line 59
    iget-object v7, v8, LQ0/d;->m0:[LQ0/d;

    .line 60
    .line 61
    aput-object v16, v7, v4

    .line 62
    .line 63
    iget-object v7, v8, LQ0/d;->l0:[LQ0/d;

    .line 64
    .line 65
    aput-object v16, v7, v4

    .line 66
    .line 67
    iget v7, v8, LQ0/d;->g0:I

    .line 68
    .line 69
    iget-object v11, v8, LQ0/d;->Q:[LQ0/c;

    .line 70
    .line 71
    if-eq v7, v9, :cond_e

    .line 72
    .line 73
    invoke-virtual {v8, v4}, LQ0/d;->j(I)I

    .line 74
    .line 75
    .line 76
    aget-object v7, v11, v17

    .line 77
    .line 78
    invoke-virtual {v7}, LQ0/c;->e()I

    .line 79
    .line 80
    .line 81
    add-int/lit8 v7, v17, 0x1

    .line 82
    .line 83
    aget-object v22, v11, v7

    .line 84
    .line 85
    invoke-virtual/range {v22 .. v22}, LQ0/c;->e()I

    .line 86
    .line 87
    .line 88
    aget-object v22, v11, v17

    .line 89
    .line 90
    invoke-virtual/range {v22 .. v22}, LQ0/c;->e()I

    .line 91
    .line 92
    .line 93
    aget-object v7, v11, v7

    .line 94
    .line 95
    invoke-virtual {v7}, LQ0/c;->e()I

    .line 96
    .line 97
    .line 98
    iget-object v7, v3, LQ0/b;->b:LQ0/d;

    .line 99
    .line 100
    if-nez v7, :cond_1

    .line 101
    .line 102
    iput-object v8, v3, LQ0/b;->b:LQ0/d;

    .line 103
    .line 104
    :cond_1
    iput-object v8, v3, LQ0/b;->d:LQ0/d;

    .line 105
    .line 106
    iget-object v7, v8, LQ0/d;->p0:[I

    .line 107
    .line 108
    aget v7, v7, v4

    .line 109
    .line 110
    if-ne v7, v6, :cond_e

    .line 111
    .line 112
    iget-object v9, v8, LQ0/d;->t:[I

    .line 113
    .line 114
    aget v9, v9, v4

    .line 115
    .line 116
    if-eqz v9, :cond_3

    .line 117
    .line 118
    if-eq v9, v6, :cond_3

    .line 119
    .line 120
    const/4 v6, 0x2

    .line 121
    if-ne v9, v6, :cond_2

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_2
    move/from16 v24, v2

    .line 125
    .line 126
    move/from16 v25, v4

    .line 127
    .line 128
    goto :goto_7

    .line 129
    :cond_3
    :goto_4
    iget v6, v3, LQ0/b;->j:I

    .line 130
    .line 131
    add-int/lit8 v6, v6, 0x1

    .line 132
    .line 133
    iput v6, v3, LQ0/b;->j:I

    .line 134
    .line 135
    iget-object v6, v8, LQ0/d;->k0:[F

    .line 136
    .line 137
    aget v6, v6, v4

    .line 138
    .line 139
    cmpl-float v24, v6, v19

    .line 140
    .line 141
    if-lez v24, :cond_4

    .line 142
    .line 143
    move/from16 v24, v2

    .line 144
    .line 145
    iget v2, v3, LQ0/b;->k:F

    .line 146
    .line 147
    add-float/2addr v2, v6

    .line 148
    iput v2, v3, LQ0/b;->k:F

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_4
    move/from16 v24, v2

    .line 152
    .line 153
    :goto_5
    iget v2, v8, LQ0/d;->g0:I

    .line 154
    .line 155
    move/from16 v25, v4

    .line 156
    .line 157
    const/16 v4, 0x8

    .line 158
    .line 159
    if-eq v2, v4, :cond_8

    .line 160
    .line 161
    const/4 v2, 0x3

    .line 162
    if-ne v7, v2, :cond_8

    .line 163
    .line 164
    if-eqz v9, :cond_5

    .line 165
    .line 166
    if-ne v9, v2, :cond_8

    .line 167
    .line 168
    :cond_5
    cmpg-float v2, v6, v19

    .line 169
    .line 170
    if-gez v2, :cond_6

    .line 171
    .line 172
    move/from16 v2, v20

    .line 173
    .line 174
    iput-boolean v2, v3, LQ0/b;->n:Z

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_6
    move/from16 v2, v20

    .line 178
    .line 179
    iput-boolean v2, v3, LQ0/b;->o:Z

    .line 180
    .line 181
    :goto_6
    iget-object v2, v3, LQ0/b;->h:Ljava/util/ArrayList;

    .line 182
    .line 183
    if-nez v2, :cond_7

    .line 184
    .line 185
    new-instance v2, Ljava/util/ArrayList;

    .line 186
    .line 187
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 188
    .line 189
    .line 190
    iput-object v2, v3, LQ0/b;->h:Ljava/util/ArrayList;

    .line 191
    .line 192
    :cond_7
    iget-object v2, v3, LQ0/b;->h:Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    :cond_8
    iget-object v2, v3, LQ0/b;->f:LQ0/d;

    .line 198
    .line 199
    if-nez v2, :cond_9

    .line 200
    .line 201
    iput-object v8, v3, LQ0/b;->f:LQ0/d;

    .line 202
    .line 203
    :cond_9
    iget-object v2, v3, LQ0/b;->g:LQ0/d;

    .line 204
    .line 205
    if-eqz v2, :cond_a

    .line 206
    .line 207
    iget-object v2, v2, LQ0/d;->l0:[LQ0/d;

    .line 208
    .line 209
    aput-object v8, v2, v25

    .line 210
    .line 211
    :cond_a
    iput-object v8, v3, LQ0/b;->g:LQ0/d;

    .line 212
    .line 213
    :goto_7
    if-nez v25, :cond_c

    .line 214
    .line 215
    iget v2, v8, LQ0/d;->r:I

    .line 216
    .line 217
    if-eqz v2, :cond_b

    .line 218
    .line 219
    goto :goto_8

    .line 220
    :cond_b
    iget v2, v8, LQ0/d;->u:I

    .line 221
    .line 222
    if-nez v2, :cond_f

    .line 223
    .line 224
    iget v2, v8, LQ0/d;->v:I

    .line 225
    .line 226
    goto :goto_8

    .line 227
    :cond_c
    iget v2, v8, LQ0/d;->s:I

    .line 228
    .line 229
    if-eqz v2, :cond_d

    .line 230
    .line 231
    goto :goto_8

    .line 232
    :cond_d
    iget v2, v8, LQ0/d;->x:I

    .line 233
    .line 234
    if-nez v2, :cond_f

    .line 235
    .line 236
    iget v2, v8, LQ0/d;->y:I

    .line 237
    .line 238
    goto :goto_8

    .line 239
    :cond_e
    move/from16 v24, v2

    .line 240
    .line 241
    move/from16 v25, v4

    .line 242
    .line 243
    :cond_f
    :goto_8
    if-eq v12, v8, :cond_10

    .line 244
    .line 245
    iget-object v2, v12, LQ0/d;->m0:[LQ0/d;

    .line 246
    .line 247
    aput-object v8, v2, v25

    .line 248
    .line 249
    :cond_10
    add-int/lit8 v2, v17, 0x1

    .line 250
    .line 251
    aget-object v2, v11, v2

    .line 252
    .line 253
    iget-object v2, v2, LQ0/c;->f:LQ0/c;

    .line 254
    .line 255
    if-eqz v2, :cond_11

    .line 256
    .line 257
    iget-object v2, v2, LQ0/c;->d:LQ0/d;

    .line 258
    .line 259
    iget-object v4, v2, LQ0/d;->Q:[LQ0/c;

    .line 260
    .line 261
    aget-object v4, v4, v17

    .line 262
    .line 263
    iget-object v4, v4, LQ0/c;->f:LQ0/c;

    .line 264
    .line 265
    if-eqz v4, :cond_11

    .line 266
    .line 267
    iget-object v4, v4, LQ0/c;->d:LQ0/d;

    .line 268
    .line 269
    if-eq v4, v8, :cond_12

    .line 270
    .line 271
    :cond_11
    move-object/from16 v2, v16

    .line 272
    .line 273
    :cond_12
    if-eqz v2, :cond_13

    .line 274
    .line 275
    goto :goto_9

    .line 276
    :cond_13
    move-object v2, v8

    .line 277
    const/16 v18, 0x1

    .line 278
    .line 279
    :goto_9
    move-object v12, v8

    .line 280
    move/from16 v4, v25

    .line 281
    .line 282
    const/4 v6, 0x3

    .line 283
    const/16 v9, 0x8

    .line 284
    .line 285
    move-object v8, v2

    .line 286
    move/from16 v2, v24

    .line 287
    .line 288
    goto/16 :goto_3

    .line 289
    .line 290
    :cond_14
    move/from16 v24, v2

    .line 291
    .line 292
    move/from16 v25, v4

    .line 293
    .line 294
    iget-object v2, v3, LQ0/b;->b:LQ0/d;

    .line 295
    .line 296
    if-eqz v2, :cond_15

    .line 297
    .line 298
    iget-object v2, v2, LQ0/d;->Q:[LQ0/c;

    .line 299
    .line 300
    aget-object v2, v2, v17

    .line 301
    .line 302
    invoke-virtual {v2}, LQ0/c;->e()I

    .line 303
    .line 304
    .line 305
    :cond_15
    iget-object v2, v3, LQ0/b;->d:LQ0/d;

    .line 306
    .line 307
    if-eqz v2, :cond_16

    .line 308
    .line 309
    add-int/lit8 v17, v17, 0x1

    .line 310
    .line 311
    iget-object v2, v2, LQ0/d;->Q:[LQ0/c;

    .line 312
    .line 313
    aget-object v2, v2, v17

    .line 314
    .line 315
    invoke-virtual {v2}, LQ0/c;->e()I

    .line 316
    .line 317
    .line 318
    :cond_16
    iput-object v8, v3, LQ0/b;->c:LQ0/d;

    .line 319
    .line 320
    if-nez v25, :cond_17

    .line 321
    .line 322
    iget-boolean v2, v3, LQ0/b;->m:Z

    .line 323
    .line 324
    if-eqz v2, :cond_17

    .line 325
    .line 326
    iput-object v8, v3, LQ0/b;->e:LQ0/d;

    .line 327
    .line 328
    goto :goto_a

    .line 329
    :cond_17
    iput-object v5, v3, LQ0/b;->e:LQ0/d;

    .line 330
    .line 331
    :goto_a
    iget-boolean v2, v3, LQ0/b;->o:Z

    .line 332
    .line 333
    if-eqz v2, :cond_18

    .line 334
    .line 335
    iget-boolean v2, v3, LQ0/b;->n:Z

    .line 336
    .line 337
    if-eqz v2, :cond_18

    .line 338
    .line 339
    const/4 v2, 0x1

    .line 340
    goto :goto_b

    .line 341
    :cond_18
    const/4 v2, 0x0

    .line 342
    :goto_b
    iput-boolean v2, v3, LQ0/b;->p:Z

    .line 343
    .line 344
    :goto_c
    const/4 v2, 0x1

    .line 345
    goto :goto_d

    .line 346
    :cond_19
    move/from16 v24, v2

    .line 347
    .line 348
    const/16 v19, 0x0

    .line 349
    .line 350
    goto :goto_c

    .line 351
    :goto_d
    iput-boolean v2, v3, LQ0/b;->q:Z

    .line 352
    .line 353
    if-eqz v10, :cond_1b

    .line 354
    .line 355
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v2

    .line 359
    if-eqz v2, :cond_1a

    .line 360
    .line 361
    goto :goto_e

    .line 362
    :cond_1a
    move/from16 v35, v13

    .line 363
    .line 364
    move-object/from16 v19, v14

    .line 365
    .line 366
    const/16 v25, 0x2

    .line 367
    .line 368
    const/16 v26, 0x0

    .line 369
    .line 370
    goto/16 :goto_49

    .line 371
    .line 372
    :cond_1b
    :goto_e
    iget-object v11, v3, LQ0/b;->c:LQ0/d;

    .line 373
    .line 374
    iget-object v12, v3, LQ0/b;->b:LQ0/d;

    .line 375
    .line 376
    iget-object v2, v3, LQ0/b;->d:LQ0/d;

    .line 377
    .line 378
    iget-object v4, v3, LQ0/b;->e:LQ0/d;

    .line 379
    .line 380
    iget v6, v3, LQ0/b;->k:F

    .line 381
    .line 382
    iget-object v7, v0, LQ0/d;->p0:[I

    .line 383
    .line 384
    aget v7, v7, p3

    .line 385
    .line 386
    const/4 v8, 0x2

    .line 387
    if-ne v7, v8, :cond_1c

    .line 388
    .line 389
    const/4 v7, 0x1

    .line 390
    goto :goto_f

    .line 391
    :cond_1c
    const/4 v7, 0x0

    .line 392
    :goto_f
    if-nez p3, :cond_20

    .line 393
    .line 394
    iget v9, v4, LQ0/d;->i0:I

    .line 395
    .line 396
    if-nez v9, :cond_1d

    .line 397
    .line 398
    const/16 v20, 0x1

    .line 399
    .line 400
    :goto_10
    const/4 v8, 0x1

    .line 401
    goto :goto_11

    .line 402
    :cond_1d
    const/16 v20, 0x0

    .line 403
    .line 404
    goto :goto_10

    .line 405
    :goto_11
    if-ne v9, v8, :cond_1e

    .line 406
    .line 407
    move/from16 v17, v8

    .line 408
    .line 409
    :goto_12
    const/4 v8, 0x2

    .line 410
    goto :goto_13

    .line 411
    :cond_1e
    const/16 v17, 0x0

    .line 412
    .line 413
    goto :goto_12

    .line 414
    :goto_13
    if-ne v9, v8, :cond_1f

    .line 415
    .line 416
    const/4 v9, 0x1

    .line 417
    goto :goto_14

    .line 418
    :cond_1f
    const/4 v9, 0x0

    .line 419
    :goto_14
    move/from16 v26, v7

    .line 420
    .line 421
    move/from16 v18, v17

    .line 422
    .line 423
    move/from16 v21, v20

    .line 424
    .line 425
    const/4 v8, 0x0

    .line 426
    move/from16 v17, v6

    .line 427
    .line 428
    move-object v6, v5

    .line 429
    goto :goto_1a

    .line 430
    :cond_20
    iget v9, v4, LQ0/d;->j0:I

    .line 431
    .line 432
    if-nez v9, :cond_21

    .line 433
    .line 434
    const/16 v18, 0x1

    .line 435
    .line 436
    :goto_15
    const/4 v8, 0x1

    .line 437
    goto :goto_16

    .line 438
    :cond_21
    const/16 v18, 0x0

    .line 439
    .line 440
    goto :goto_15

    .line 441
    :goto_16
    if-ne v9, v8, :cond_22

    .line 442
    .line 443
    const/4 v8, 0x1

    .line 444
    :goto_17
    move/from16 v17, v6

    .line 445
    .line 446
    const/4 v6, 0x2

    .line 447
    goto :goto_18

    .line 448
    :cond_22
    const/4 v8, 0x0

    .line 449
    goto :goto_17

    .line 450
    :goto_18
    if-ne v9, v6, :cond_23

    .line 451
    .line 452
    const/4 v9, 0x1

    .line 453
    goto :goto_19

    .line 454
    :cond_23
    const/4 v9, 0x0

    .line 455
    :goto_19
    move-object v6, v5

    .line 456
    move/from16 v26, v7

    .line 457
    .line 458
    move/from16 v21, v18

    .line 459
    .line 460
    move/from16 v18, v8

    .line 461
    .line 462
    const/4 v8, 0x0

    .line 463
    :goto_1a
    iget-object v7, v0, LQ0/d;->Q:[LQ0/c;

    .line 464
    .line 465
    move-object/from16 v27, v7

    .line 466
    .line 467
    if-nez v8, :cond_31

    .line 468
    .line 469
    iget-object v7, v6, LQ0/d;->Q:[LQ0/c;

    .line 470
    .line 471
    aget-object v7, v7, v15

    .line 472
    .line 473
    if-eqz v9, :cond_24

    .line 474
    .line 475
    const/16 v29, 0x1

    .line 476
    .line 477
    goto :goto_1b

    .line 478
    :cond_24
    const/16 v29, 0x4

    .line 479
    .line 480
    :goto_1b
    invoke-virtual {v7}, LQ0/c;->e()I

    .line 481
    .line 482
    .line 483
    move-result v31

    .line 484
    move/from16 v32, v8

    .line 485
    .line 486
    iget-object v8, v6, LQ0/d;->p0:[I

    .line 487
    .line 488
    move-object/from16 v33, v8

    .line 489
    .line 490
    aget v8, v33, p3

    .line 491
    .line 492
    move/from16 v34, v9

    .line 493
    .line 494
    const/4 v9, 0x3

    .line 495
    if-ne v8, v9, :cond_25

    .line 496
    .line 497
    iget-object v8, v6, LQ0/d;->t:[I

    .line 498
    .line 499
    aget v8, v8, p3

    .line 500
    .line 501
    if-nez v8, :cond_25

    .line 502
    .line 503
    const/4 v8, 0x1

    .line 504
    goto :goto_1c

    .line 505
    :cond_25
    const/4 v8, 0x0

    .line 506
    :goto_1c
    iget-object v9, v7, LQ0/c;->f:LQ0/c;

    .line 507
    .line 508
    if-eqz v9, :cond_26

    .line 509
    .line 510
    if-eq v6, v5, :cond_26

    .line 511
    .line 512
    invoke-virtual {v9}, LQ0/c;->e()I

    .line 513
    .line 514
    .line 515
    move-result v9

    .line 516
    add-int v31, v9, v31

    .line 517
    .line 518
    :cond_26
    move/from16 v9, v31

    .line 519
    .line 520
    if-eqz v34, :cond_27

    .line 521
    .line 522
    if-eq v6, v5, :cond_27

    .line 523
    .line 524
    if-eq v6, v12, :cond_27

    .line 525
    .line 526
    const/16 v29, 0x8

    .line 527
    .line 528
    :cond_27
    move/from16 v31, v8

    .line 529
    .line 530
    iget-object v8, v7, LQ0/c;->f:LQ0/c;

    .line 531
    .line 532
    if-eqz v8, :cond_2b

    .line 533
    .line 534
    if-ne v6, v12, :cond_28

    .line 535
    .line 536
    iget-object v10, v7, LQ0/c;->i:LO0/f;

    .line 537
    .line 538
    iget-object v8, v8, LQ0/c;->i:LO0/f;

    .line 539
    .line 540
    move/from16 v35, v13

    .line 541
    .line 542
    const/4 v13, 0x6

    .line 543
    invoke-virtual {v1, v10, v8, v9, v13}, LO0/c;->f(LO0/f;LO0/f;II)V

    .line 544
    .line 545
    .line 546
    goto :goto_1d

    .line 547
    :cond_28
    move/from16 v35, v13

    .line 548
    .line 549
    iget-object v10, v7, LQ0/c;->i:LO0/f;

    .line 550
    .line 551
    iget-object v8, v8, LQ0/c;->i:LO0/f;

    .line 552
    .line 553
    const/16 v13, 0x8

    .line 554
    .line 555
    invoke-virtual {v1, v10, v8, v9, v13}, LO0/c;->f(LO0/f;LO0/f;II)V

    .line 556
    .line 557
    .line 558
    :goto_1d
    if-eqz v31, :cond_29

    .line 559
    .line 560
    if-nez v34, :cond_29

    .line 561
    .line 562
    const/16 v29, 0x5

    .line 563
    .line 564
    :cond_29
    if-ne v6, v12, :cond_2a

    .line 565
    .line 566
    if-eqz v34, :cond_2a

    .line 567
    .line 568
    iget-object v8, v6, LQ0/d;->S:[Z

    .line 569
    .line 570
    aget-boolean v8, v8, p3

    .line 571
    .line 572
    if-eqz v8, :cond_2a

    .line 573
    .line 574
    const/4 v8, 0x5

    .line 575
    goto :goto_1e

    .line 576
    :cond_2a
    move/from16 v8, v29

    .line 577
    .line 578
    :goto_1e
    iget-object v10, v7, LQ0/c;->i:LO0/f;

    .line 579
    .line 580
    iget-object v7, v7, LQ0/c;->f:LQ0/c;

    .line 581
    .line 582
    iget-object v7, v7, LQ0/c;->i:LO0/f;

    .line 583
    .line 584
    invoke-virtual {v1, v10, v7, v9, v8}, LO0/c;->e(LO0/f;LO0/f;II)V

    .line 585
    .line 586
    .line 587
    goto :goto_1f

    .line 588
    :cond_2b
    move/from16 v35, v13

    .line 589
    .line 590
    :goto_1f
    iget-object v7, v6, LQ0/d;->Q:[LQ0/c;

    .line 591
    .line 592
    if-eqz v26, :cond_2d

    .line 593
    .line 594
    iget v8, v6, LQ0/d;->g0:I

    .line 595
    .line 596
    const/16 v13, 0x8

    .line 597
    .line 598
    if-eq v8, v13, :cond_2c

    .line 599
    .line 600
    aget v8, v33, p3

    .line 601
    .line 602
    const/4 v9, 0x3

    .line 603
    if-ne v8, v9, :cond_2c

    .line 604
    .line 605
    add-int/lit8 v8, v15, 0x1

    .line 606
    .line 607
    aget-object v8, v7, v8

    .line 608
    .line 609
    iget-object v8, v8, LQ0/c;->i:LO0/f;

    .line 610
    .line 611
    aget-object v9, v7, v15

    .line 612
    .line 613
    iget-object v9, v9, LQ0/c;->i:LO0/f;

    .line 614
    .line 615
    const/4 v10, 0x0

    .line 616
    const/4 v13, 0x5

    .line 617
    invoke-virtual {v1, v8, v9, v10, v13}, LO0/c;->f(LO0/f;LO0/f;II)V

    .line 618
    .line 619
    .line 620
    goto :goto_20

    .line 621
    :cond_2c
    const/4 v10, 0x0

    .line 622
    :goto_20
    aget-object v8, v7, v15

    .line 623
    .line 624
    iget-object v8, v8, LQ0/c;->i:LO0/f;

    .line 625
    .line 626
    aget-object v9, v27, v15

    .line 627
    .line 628
    iget-object v9, v9, LQ0/c;->i:LO0/f;

    .line 629
    .line 630
    const/16 v13, 0x8

    .line 631
    .line 632
    invoke-virtual {v1, v8, v9, v10, v13}, LO0/c;->f(LO0/f;LO0/f;II)V

    .line 633
    .line 634
    .line 635
    :cond_2d
    add-int/lit8 v8, v15, 0x1

    .line 636
    .line 637
    aget-object v7, v7, v8

    .line 638
    .line 639
    iget-object v7, v7, LQ0/c;->f:LQ0/c;

    .line 640
    .line 641
    if-eqz v7, :cond_2e

    .line 642
    .line 643
    iget-object v7, v7, LQ0/c;->d:LQ0/d;

    .line 644
    .line 645
    iget-object v8, v7, LQ0/d;->Q:[LQ0/c;

    .line 646
    .line 647
    aget-object v8, v8, v15

    .line 648
    .line 649
    iget-object v8, v8, LQ0/c;->f:LQ0/c;

    .line 650
    .line 651
    if-eqz v8, :cond_2e

    .line 652
    .line 653
    iget-object v8, v8, LQ0/c;->d:LQ0/d;

    .line 654
    .line 655
    if-eq v8, v6, :cond_2f

    .line 656
    .line 657
    :cond_2e
    move-object/from16 v7, v16

    .line 658
    .line 659
    :cond_2f
    if-eqz v7, :cond_30

    .line 660
    .line 661
    move-object v6, v7

    .line 662
    move/from16 v8, v32

    .line 663
    .line 664
    goto :goto_21

    .line 665
    :cond_30
    const/4 v8, 0x1

    .line 666
    :goto_21
    move-object/from16 v10, p2

    .line 667
    .line 668
    move/from16 v9, v34

    .line 669
    .line 670
    move/from16 v13, v35

    .line 671
    .line 672
    goto/16 :goto_1a

    .line 673
    .line 674
    :cond_31
    move/from16 v34, v9

    .line 675
    .line 676
    move/from16 v35, v13

    .line 677
    .line 678
    if-eqz v2, :cond_34

    .line 679
    .line 680
    iget-object v6, v11, LQ0/d;->Q:[LQ0/c;

    .line 681
    .line 682
    add-int/lit8 v7, v15, 0x1

    .line 683
    .line 684
    aget-object v6, v6, v7

    .line 685
    .line 686
    iget-object v6, v6, LQ0/c;->f:LQ0/c;

    .line 687
    .line 688
    if-eqz v6, :cond_34

    .line 689
    .line 690
    iget-object v6, v2, LQ0/d;->Q:[LQ0/c;

    .line 691
    .line 692
    aget-object v6, v6, v7

    .line 693
    .line 694
    iget-object v8, v2, LQ0/d;->p0:[I

    .line 695
    .line 696
    aget v8, v8, p3

    .line 697
    .line 698
    const/4 v9, 0x3

    .line 699
    if-ne v8, v9, :cond_32

    .line 700
    .line 701
    iget-object v8, v2, LQ0/d;->t:[I

    .line 702
    .line 703
    aget v8, v8, p3

    .line 704
    .line 705
    if-nez v8, :cond_32

    .line 706
    .line 707
    if-nez v34, :cond_32

    .line 708
    .line 709
    iget-object v8, v6, LQ0/c;->f:LQ0/c;

    .line 710
    .line 711
    iget-object v9, v8, LQ0/c;->d:LQ0/d;

    .line 712
    .line 713
    if-ne v9, v0, :cond_32

    .line 714
    .line 715
    iget-object v9, v6, LQ0/c;->i:LO0/f;

    .line 716
    .line 717
    iget-object v8, v8, LQ0/c;->i:LO0/f;

    .line 718
    .line 719
    invoke-virtual {v6}, LQ0/c;->e()I

    .line 720
    .line 721
    .line 722
    move-result v10

    .line 723
    neg-int v10, v10

    .line 724
    const/4 v13, 0x5

    .line 725
    invoke-virtual {v1, v9, v8, v10, v13}, LO0/c;->e(LO0/f;LO0/f;II)V

    .line 726
    .line 727
    .line 728
    goto :goto_22

    .line 729
    :cond_32
    const/4 v13, 0x5

    .line 730
    if-eqz v34, :cond_33

    .line 731
    .line 732
    iget-object v8, v6, LQ0/c;->f:LQ0/c;

    .line 733
    .line 734
    iget-object v9, v8, LQ0/c;->d:LQ0/d;

    .line 735
    .line 736
    if-ne v9, v0, :cond_33

    .line 737
    .line 738
    iget-object v9, v6, LQ0/c;->i:LO0/f;

    .line 739
    .line 740
    iget-object v8, v8, LQ0/c;->i:LO0/f;

    .line 741
    .line 742
    invoke-virtual {v6}, LQ0/c;->e()I

    .line 743
    .line 744
    .line 745
    move-result v10

    .line 746
    neg-int v10, v10

    .line 747
    const/4 v13, 0x4

    .line 748
    invoke-virtual {v1, v9, v8, v10, v13}, LO0/c;->e(LO0/f;LO0/f;II)V

    .line 749
    .line 750
    .line 751
    :cond_33
    :goto_22
    iget-object v8, v6, LQ0/c;->i:LO0/f;

    .line 752
    .line 753
    iget-object v9, v11, LQ0/d;->Q:[LQ0/c;

    .line 754
    .line 755
    aget-object v7, v9, v7

    .line 756
    .line 757
    iget-object v7, v7, LQ0/c;->f:LQ0/c;

    .line 758
    .line 759
    iget-object v7, v7, LQ0/c;->i:LO0/f;

    .line 760
    .line 761
    invoke-virtual {v6}, LQ0/c;->e()I

    .line 762
    .line 763
    .line 764
    move-result v6

    .line 765
    neg-int v6, v6

    .line 766
    const/4 v13, 0x6

    .line 767
    invoke-virtual {v1, v8, v7, v6, v13}, LO0/c;->g(LO0/f;LO0/f;II)V

    .line 768
    .line 769
    .line 770
    :cond_34
    if-eqz v26, :cond_35

    .line 771
    .line 772
    add-int/lit8 v6, v15, 0x1

    .line 773
    .line 774
    aget-object v7, v27, v6

    .line 775
    .line 776
    iget-object v7, v7, LQ0/c;->i:LO0/f;

    .line 777
    .line 778
    iget-object v8, v11, LQ0/d;->Q:[LQ0/c;

    .line 779
    .line 780
    aget-object v6, v8, v6

    .line 781
    .line 782
    iget-object v8, v6, LQ0/c;->i:LO0/f;

    .line 783
    .line 784
    invoke-virtual {v6}, LQ0/c;->e()I

    .line 785
    .line 786
    .line 787
    move-result v6

    .line 788
    const/16 v13, 0x8

    .line 789
    .line 790
    invoke-virtual {v1, v7, v8, v6, v13}, LO0/c;->f(LO0/f;LO0/f;II)V

    .line 791
    .line 792
    .line 793
    :cond_35
    iget-object v6, v3, LQ0/b;->h:Ljava/util/ArrayList;

    .line 794
    .line 795
    if-eqz v6, :cond_3f

    .line 796
    .line 797
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 798
    .line 799
    .line 800
    move-result v7

    .line 801
    const/4 v8, 0x1

    .line 802
    if-le v7, v8, :cond_3f

    .line 803
    .line 804
    iget-boolean v9, v3, LQ0/b;->n:Z

    .line 805
    .line 806
    if-eqz v9, :cond_36

    .line 807
    .line 808
    iget-boolean v9, v3, LQ0/b;->p:Z

    .line 809
    .line 810
    if-nez v9, :cond_36

    .line 811
    .line 812
    iget v9, v3, LQ0/b;->j:I

    .line 813
    .line 814
    int-to-float v9, v9

    .line 815
    move/from16 v17, v9

    .line 816
    .line 817
    :cond_36
    move-object/from16 v9, v16

    .line 818
    .line 819
    move/from16 v13, v19

    .line 820
    .line 821
    const/4 v10, 0x0

    .line 822
    :goto_23
    if-ge v10, v7, :cond_3f

    .line 823
    .line 824
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v20

    .line 828
    move-object/from16 v8, v20

    .line 829
    .line 830
    check-cast v8, LQ0/d;

    .line 831
    .line 832
    iget-object v0, v8, LQ0/d;->k0:[F

    .line 833
    .line 834
    aget v0, v0, p3

    .line 835
    .line 836
    cmpg-float v20, v0, v19

    .line 837
    .line 838
    move/from16 v26, v0

    .line 839
    .line 840
    iget-object v0, v8, LQ0/d;->Q:[LQ0/c;

    .line 841
    .line 842
    move-object/from16 v27, v0

    .line 843
    .line 844
    if-gez v20, :cond_38

    .line 845
    .line 846
    iget-boolean v0, v3, LQ0/b;->p:Z

    .line 847
    .line 848
    if-eqz v0, :cond_37

    .line 849
    .line 850
    add-int/lit8 v0, v15, 0x1

    .line 851
    .line 852
    aget-object v0, v27, v0

    .line 853
    .line 854
    iget-object v0, v0, LQ0/c;->i:LO0/f;

    .line 855
    .line 856
    aget-object v8, v27, v15

    .line 857
    .line 858
    iget-object v8, v8, LQ0/c;->i:LO0/f;

    .line 859
    .line 860
    move-object/from16 v28, v6

    .line 861
    .line 862
    move/from16 v29, v7

    .line 863
    .line 864
    const/4 v6, 0x0

    .line 865
    const/4 v7, 0x4

    .line 866
    invoke-virtual {v1, v0, v8, v6, v7}, LO0/c;->e(LO0/f;LO0/f;II)V

    .line 867
    .line 868
    .line 869
    move v8, v6

    .line 870
    goto :goto_26

    .line 871
    :cond_37
    const/high16 v0, 0x3f800000    # 1.0f

    .line 872
    .line 873
    :goto_24
    move-object/from16 v28, v6

    .line 874
    .line 875
    move/from16 v29, v7

    .line 876
    .line 877
    const/4 v7, 0x4

    .line 878
    goto :goto_25

    .line 879
    :cond_38
    move/from16 v0, v26

    .line 880
    .line 881
    goto :goto_24

    .line 882
    :goto_25
    cmpl-float v6, v0, v19

    .line 883
    .line 884
    if-nez v6, :cond_39

    .line 885
    .line 886
    add-int/lit8 v0, v15, 0x1

    .line 887
    .line 888
    aget-object v0, v27, v0

    .line 889
    .line 890
    iget-object v0, v0, LQ0/c;->i:LO0/f;

    .line 891
    .line 892
    aget-object v6, v27, v15

    .line 893
    .line 894
    iget-object v6, v6, LQ0/c;->i:LO0/f;

    .line 895
    .line 896
    const/16 v7, 0x8

    .line 897
    .line 898
    const/4 v8, 0x0

    .line 899
    invoke-virtual {v1, v0, v6, v8, v7}, LO0/c;->e(LO0/f;LO0/f;II)V

    .line 900
    .line 901
    .line 902
    :goto_26
    move/from16 v26, v8

    .line 903
    .line 904
    move/from16 v31, v10

    .line 905
    .line 906
    move/from16 v36, v19

    .line 907
    .line 908
    move-object/from16 v19, v14

    .line 909
    .line 910
    goto/16 :goto_2b

    .line 911
    .line 912
    :cond_39
    const/16 v26, 0x0

    .line 913
    .line 914
    if-eqz v9, :cond_3e

    .line 915
    .line 916
    iget-object v7, v9, LQ0/d;->Q:[LQ0/c;

    .line 917
    .line 918
    aget-object v9, v7, v15

    .line 919
    .line 920
    iget-object v9, v9, LQ0/c;->i:LO0/f;

    .line 921
    .line 922
    add-int/lit8 v31, v15, 0x1

    .line 923
    .line 924
    aget-object v7, v7, v31

    .line 925
    .line 926
    iget-object v7, v7, LQ0/c;->i:LO0/f;

    .line 927
    .line 928
    move/from16 v32, v0

    .line 929
    .line 930
    aget-object v0, v27, v15

    .line 931
    .line 932
    iget-object v0, v0, LQ0/c;->i:LO0/f;

    .line 933
    .line 934
    move/from16 v33, v6

    .line 935
    .line 936
    aget-object v6, v27, v31

    .line 937
    .line 938
    iget-object v6, v6, LQ0/c;->i:LO0/f;

    .line 939
    .line 940
    move-object/from16 v27, v8

    .line 941
    .line 942
    invoke-virtual {v1}, LO0/c;->l()LO0/b;

    .line 943
    .line 944
    .line 945
    move-result-object v8

    .line 946
    move/from16 v31, v10

    .line 947
    .line 948
    move/from16 v10, v19

    .line 949
    .line 950
    iput v10, v8, LO0/b;->b:F

    .line 951
    .line 952
    cmpl-float v19, v17, v10

    .line 953
    .line 954
    move/from16 v36, v10

    .line 955
    .line 956
    const/high16 v10, -0x40800000    # -1.0f

    .line 957
    .line 958
    if-eqz v19, :cond_3a

    .line 959
    .line 960
    cmpl-float v19, v13, v32

    .line 961
    .line 962
    if-nez v19, :cond_3b

    .line 963
    .line 964
    :cond_3a
    move-object/from16 v19, v14

    .line 965
    .line 966
    move v14, v10

    .line 967
    const/high16 v10, 0x3f800000    # 1.0f

    .line 968
    .line 969
    goto :goto_28

    .line 970
    :cond_3b
    cmpl-float v19, v13, v36

    .line 971
    .line 972
    if-nez v19, :cond_3c

    .line 973
    .line 974
    iget-object v0, v8, LO0/b;->d:LO0/a;

    .line 975
    .line 976
    const/high16 v6, 0x3f800000    # 1.0f

    .line 977
    .line 978
    invoke-virtual {v0, v9, v6}, LO0/a;->g(LO0/f;F)V

    .line 979
    .line 980
    .line 981
    iget-object v0, v8, LO0/b;->d:LO0/a;

    .line 982
    .line 983
    invoke-virtual {v0, v7, v10}, LO0/a;->g(LO0/f;F)V

    .line 984
    .line 985
    .line 986
    :goto_27
    move-object/from16 v19, v14

    .line 987
    .line 988
    goto :goto_29

    .line 989
    :cond_3c
    const/high16 v10, 0x3f800000    # 1.0f

    .line 990
    .line 991
    if-nez v33, :cond_3d

    .line 992
    .line 993
    iget-object v7, v8, LO0/b;->d:LO0/a;

    .line 994
    .line 995
    invoke-virtual {v7, v0, v10}, LO0/a;->g(LO0/f;F)V

    .line 996
    .line 997
    .line 998
    iget-object v0, v8, LO0/b;->d:LO0/a;

    .line 999
    .line 1000
    const/high16 v7, -0x40800000    # -1.0f

    .line 1001
    .line 1002
    invoke-virtual {v0, v6, v7}, LO0/a;->g(LO0/f;F)V

    .line 1003
    .line 1004
    .line 1005
    goto :goto_27

    .line 1006
    :cond_3d
    div-float v13, v13, v17

    .line 1007
    .line 1008
    div-float v19, v32, v17

    .line 1009
    .line 1010
    div-float v13, v13, v19

    .line 1011
    .line 1012
    move-object/from16 v19, v14

    .line 1013
    .line 1014
    iget-object v14, v8, LO0/b;->d:LO0/a;

    .line 1015
    .line 1016
    invoke-virtual {v14, v9, v10}, LO0/a;->g(LO0/f;F)V

    .line 1017
    .line 1018
    .line 1019
    iget-object v9, v8, LO0/b;->d:LO0/a;

    .line 1020
    .line 1021
    const/high16 v14, -0x40800000    # -1.0f

    .line 1022
    .line 1023
    invoke-virtual {v9, v7, v14}, LO0/a;->g(LO0/f;F)V

    .line 1024
    .line 1025
    .line 1026
    iget-object v7, v8, LO0/b;->d:LO0/a;

    .line 1027
    .line 1028
    invoke-virtual {v7, v6, v13}, LO0/a;->g(LO0/f;F)V

    .line 1029
    .line 1030
    .line 1031
    iget-object v6, v8, LO0/b;->d:LO0/a;

    .line 1032
    .line 1033
    neg-float v7, v13

    .line 1034
    invoke-virtual {v6, v0, v7}, LO0/a;->g(LO0/f;F)V

    .line 1035
    .line 1036
    .line 1037
    goto :goto_29

    .line 1038
    :goto_28
    iget-object v13, v8, LO0/b;->d:LO0/a;

    .line 1039
    .line 1040
    invoke-virtual {v13, v9, v10}, LO0/a;->g(LO0/f;F)V

    .line 1041
    .line 1042
    .line 1043
    iget-object v9, v8, LO0/b;->d:LO0/a;

    .line 1044
    .line 1045
    invoke-virtual {v9, v7, v14}, LO0/a;->g(LO0/f;F)V

    .line 1046
    .line 1047
    .line 1048
    iget-object v7, v8, LO0/b;->d:LO0/a;

    .line 1049
    .line 1050
    invoke-virtual {v7, v6, v10}, LO0/a;->g(LO0/f;F)V

    .line 1051
    .line 1052
    .line 1053
    iget-object v6, v8, LO0/b;->d:LO0/a;

    .line 1054
    .line 1055
    invoke-virtual {v6, v0, v14}, LO0/a;->g(LO0/f;F)V

    .line 1056
    .line 1057
    .line 1058
    :goto_29
    invoke-virtual {v1, v8}, LO0/c;->c(LO0/b;)V

    .line 1059
    .line 1060
    .line 1061
    goto :goto_2a

    .line 1062
    :cond_3e
    move/from16 v32, v0

    .line 1063
    .line 1064
    move-object/from16 v27, v8

    .line 1065
    .line 1066
    move/from16 v31, v10

    .line 1067
    .line 1068
    move/from16 v36, v19

    .line 1069
    .line 1070
    move-object/from16 v19, v14

    .line 1071
    .line 1072
    :goto_2a
    move-object/from16 v9, v27

    .line 1073
    .line 1074
    move/from16 v13, v32

    .line 1075
    .line 1076
    :goto_2b
    add-int/lit8 v10, v31, 0x1

    .line 1077
    .line 1078
    const/4 v8, 0x1

    .line 1079
    move-object/from16 v0, p0

    .line 1080
    .line 1081
    move-object/from16 v14, v19

    .line 1082
    .line 1083
    move-object/from16 v6, v28

    .line 1084
    .line 1085
    move/from16 v7, v29

    .line 1086
    .line 1087
    move/from16 v19, v36

    .line 1088
    .line 1089
    goto/16 :goto_23

    .line 1090
    .line 1091
    :cond_3f
    move-object/from16 v19, v14

    .line 1092
    .line 1093
    const/16 v26, 0x0

    .line 1094
    .line 1095
    if-eqz v12, :cond_40

    .line 1096
    .line 1097
    if-eq v12, v2, :cond_41

    .line 1098
    .line 1099
    if-eqz v34, :cond_40

    .line 1100
    .line 1101
    goto :goto_2c

    .line 1102
    :cond_40
    move-object v0, v2

    .line 1103
    const/16 v25, 0x2

    .line 1104
    .line 1105
    goto :goto_32

    .line 1106
    :cond_41
    :goto_2c
    iget-object v0, v5, LQ0/d;->Q:[LQ0/c;

    .line 1107
    .line 1108
    aget-object v0, v0, v15

    .line 1109
    .line 1110
    iget-object v3, v11, LQ0/d;->Q:[LQ0/c;

    .line 1111
    .line 1112
    add-int/lit8 v5, v15, 0x1

    .line 1113
    .line 1114
    aget-object v3, v3, v5

    .line 1115
    .line 1116
    iget-object v0, v0, LQ0/c;->f:LQ0/c;

    .line 1117
    .line 1118
    if-eqz v0, :cond_42

    .line 1119
    .line 1120
    iget-object v0, v0, LQ0/c;->i:LO0/f;

    .line 1121
    .line 1122
    goto :goto_2d

    .line 1123
    :cond_42
    move-object/from16 v0, v16

    .line 1124
    .line 1125
    :goto_2d
    iget-object v6, v3, LQ0/c;->f:LQ0/c;

    .line 1126
    .line 1127
    if-eqz v6, :cond_43

    .line 1128
    .line 1129
    iget-object v6, v6, LQ0/c;->i:LO0/f;

    .line 1130
    .line 1131
    goto :goto_2e

    .line 1132
    :cond_43
    move-object/from16 v6, v16

    .line 1133
    .line 1134
    :goto_2e
    iget-object v7, v12, LQ0/d;->Q:[LQ0/c;

    .line 1135
    .line 1136
    aget-object v7, v7, v15

    .line 1137
    .line 1138
    if-eqz v2, :cond_44

    .line 1139
    .line 1140
    iget-object v3, v2, LQ0/d;->Q:[LQ0/c;

    .line 1141
    .line 1142
    aget-object v3, v3, v5

    .line 1143
    .line 1144
    :cond_44
    if-eqz v0, :cond_46

    .line 1145
    .line 1146
    if-eqz v6, :cond_46

    .line 1147
    .line 1148
    if-nez p3, :cond_45

    .line 1149
    .line 1150
    iget v4, v4, LQ0/d;->d0:F

    .line 1151
    .line 1152
    :goto_2f
    move v5, v4

    .line 1153
    goto :goto_30

    .line 1154
    :cond_45
    iget v4, v4, LQ0/d;->e0:F

    .line 1155
    .line 1156
    goto :goto_2f

    .line 1157
    :goto_30
    invoke-virtual {v7}, LQ0/c;->e()I

    .line 1158
    .line 1159
    .line 1160
    move-result v4

    .line 1161
    invoke-virtual {v3}, LQ0/c;->e()I

    .line 1162
    .line 1163
    .line 1164
    move-result v8

    .line 1165
    iget-object v7, v7, LQ0/c;->i:LO0/f;

    .line 1166
    .line 1167
    iget-object v3, v3, LQ0/c;->i:LO0/f;

    .line 1168
    .line 1169
    const/4 v9, 0x7

    .line 1170
    move-object/from16 v25, v3

    .line 1171
    .line 1172
    move-object v3, v0

    .line 1173
    move-object v0, v2

    .line 1174
    move-object v2, v7

    .line 1175
    move-object/from16 v7, v25

    .line 1176
    .line 1177
    const/16 v25, 0x2

    .line 1178
    .line 1179
    invoke-virtual/range {v1 .. v9}, LO0/c;->b(LO0/f;LO0/f;IFLO0/f;LO0/f;II)V

    .line 1180
    .line 1181
    .line 1182
    goto :goto_31

    .line 1183
    :cond_46
    move-object v0, v2

    .line 1184
    const/16 v25, 0x2

    .line 1185
    .line 1186
    :cond_47
    :goto_31
    move-object/from16 v1, p1

    .line 1187
    .line 1188
    goto/16 :goto_46

    .line 1189
    .line 1190
    :goto_32
    if-eqz v21, :cond_59

    .line 1191
    .line 1192
    if-eqz v12, :cond_59

    .line 1193
    .line 1194
    iget v1, v3, LQ0/b;->j:I

    .line 1195
    .line 1196
    if-lez v1, :cond_48

    .line 1197
    .line 1198
    iget v2, v3, LQ0/b;->i:I

    .line 1199
    .line 1200
    if-ne v2, v1, :cond_48

    .line 1201
    .line 1202
    const/16 v23, 0x1

    .line 1203
    .line 1204
    goto :goto_33

    .line 1205
    :cond_48
    move/from16 v23, v26

    .line 1206
    .line 1207
    :goto_33
    move-object v10, v12

    .line 1208
    move-object v13, v10

    .line 1209
    :goto_34
    if-eqz v10, :cond_47

    .line 1210
    .line 1211
    iget-object v1, v10, LQ0/d;->m0:[LQ0/d;

    .line 1212
    .line 1213
    aget-object v1, v1, p3

    .line 1214
    .line 1215
    move-object v14, v1

    .line 1216
    :goto_35
    if-eqz v14, :cond_49

    .line 1217
    .line 1218
    iget v1, v14, LQ0/d;->g0:I

    .line 1219
    .line 1220
    const/16 v4, 0x8

    .line 1221
    .line 1222
    if-ne v1, v4, :cond_4a

    .line 1223
    .line 1224
    iget-object v1, v14, LQ0/d;->m0:[LQ0/d;

    .line 1225
    .line 1226
    aget-object v14, v1, p3

    .line 1227
    .line 1228
    goto :goto_35

    .line 1229
    :cond_49
    const/16 v4, 0x8

    .line 1230
    .line 1231
    :cond_4a
    if-nez v14, :cond_4c

    .line 1232
    .line 1233
    if-ne v10, v0, :cond_4b

    .line 1234
    .line 1235
    goto :goto_36

    .line 1236
    :cond_4b
    move-object/from16 v37, v5

    .line 1237
    .line 1238
    move-object/from16 v17, v13

    .line 1239
    .line 1240
    const/16 v30, 0x5

    .line 1241
    .line 1242
    move v13, v4

    .line 1243
    goto/16 :goto_3c

    .line 1244
    .line 1245
    :cond_4c
    :goto_36
    iget-object v1, v10, LQ0/d;->Q:[LQ0/c;

    .line 1246
    .line 1247
    aget-object v2, v1, v15

    .line 1248
    .line 1249
    iget-object v3, v2, LQ0/c;->i:LO0/f;

    .line 1250
    .line 1251
    iget-object v6, v2, LQ0/c;->f:LQ0/c;

    .line 1252
    .line 1253
    if-eqz v6, :cond_4d

    .line 1254
    .line 1255
    iget-object v6, v6, LQ0/c;->i:LO0/f;

    .line 1256
    .line 1257
    goto :goto_37

    .line 1258
    :cond_4d
    move-object/from16 v6, v16

    .line 1259
    .line 1260
    :goto_37
    if-eq v13, v10, :cond_4e

    .line 1261
    .line 1262
    iget-object v6, v13, LQ0/d;->Q:[LQ0/c;

    .line 1263
    .line 1264
    add-int/lit8 v7, v15, 0x1

    .line 1265
    .line 1266
    aget-object v6, v6, v7

    .line 1267
    .line 1268
    iget-object v6, v6, LQ0/c;->i:LO0/f;

    .line 1269
    .line 1270
    goto :goto_38

    .line 1271
    :cond_4e
    if-ne v10, v12, :cond_50

    .line 1272
    .line 1273
    iget-object v6, v5, LQ0/d;->Q:[LQ0/c;

    .line 1274
    .line 1275
    aget-object v6, v6, v15

    .line 1276
    .line 1277
    iget-object v6, v6, LQ0/c;->f:LQ0/c;

    .line 1278
    .line 1279
    if-eqz v6, :cond_4f

    .line 1280
    .line 1281
    iget-object v6, v6, LQ0/c;->i:LO0/f;

    .line 1282
    .line 1283
    goto :goto_38

    .line 1284
    :cond_4f
    move-object/from16 v6, v16

    .line 1285
    .line 1286
    :cond_50
    :goto_38
    invoke-virtual {v2}, LQ0/c;->e()I

    .line 1287
    .line 1288
    .line 1289
    move-result v2

    .line 1290
    add-int/lit8 v7, v15, 0x1

    .line 1291
    .line 1292
    aget-object v8, v1, v7

    .line 1293
    .line 1294
    invoke-virtual {v8}, LQ0/c;->e()I

    .line 1295
    .line 1296
    .line 1297
    move-result v8

    .line 1298
    if-eqz v14, :cond_51

    .line 1299
    .line 1300
    iget-object v9, v14, LQ0/d;->Q:[LQ0/c;

    .line 1301
    .line 1302
    aget-object v9, v9, v15

    .line 1303
    .line 1304
    iget-object v4, v9, LQ0/c;->i:LO0/f;

    .line 1305
    .line 1306
    goto :goto_39

    .line 1307
    :cond_51
    iget-object v4, v11, LQ0/d;->Q:[LQ0/c;

    .line 1308
    .line 1309
    aget-object v4, v4, v7

    .line 1310
    .line 1311
    iget-object v9, v4, LQ0/c;->f:LQ0/c;

    .line 1312
    .line 1313
    if-eqz v9, :cond_52

    .line 1314
    .line 1315
    iget-object v4, v9, LQ0/c;->i:LO0/f;

    .line 1316
    .line 1317
    goto :goto_39

    .line 1318
    :cond_52
    move-object/from16 v4, v16

    .line 1319
    .line 1320
    :goto_39
    aget-object v1, v1, v7

    .line 1321
    .line 1322
    iget-object v1, v1, LQ0/c;->i:LO0/f;

    .line 1323
    .line 1324
    if-eqz v9, :cond_53

    .line 1325
    .line 1326
    invoke-virtual {v9}, LQ0/c;->e()I

    .line 1327
    .line 1328
    .line 1329
    move-result v9

    .line 1330
    add-int/2addr v8, v9

    .line 1331
    :cond_53
    iget-object v9, v13, LQ0/d;->Q:[LQ0/c;

    .line 1332
    .line 1333
    aget-object v9, v9, v7

    .line 1334
    .line 1335
    invoke-virtual {v9}, LQ0/c;->e()I

    .line 1336
    .line 1337
    .line 1338
    move-result v9

    .line 1339
    add-int/2addr v9, v2

    .line 1340
    if-eqz v3, :cond_57

    .line 1341
    .line 1342
    if-eqz v6, :cond_57

    .line 1343
    .line 1344
    if-eqz v4, :cond_57

    .line 1345
    .line 1346
    if-eqz v1, :cond_57

    .line 1347
    .line 1348
    if-ne v10, v12, :cond_54

    .line 1349
    .line 1350
    iget-object v2, v12, LQ0/d;->Q:[LQ0/c;

    .line 1351
    .line 1352
    aget-object v2, v2, v15

    .line 1353
    .line 1354
    invoke-virtual {v2}, LQ0/c;->e()I

    .line 1355
    .line 1356
    .line 1357
    move-result v9

    .line 1358
    :cond_54
    if-ne v10, v0, :cond_55

    .line 1359
    .line 1360
    iget-object v2, v0, LQ0/d;->Q:[LQ0/c;

    .line 1361
    .line 1362
    aget-object v2, v2, v7

    .line 1363
    .line 1364
    invoke-virtual {v2}, LQ0/c;->e()I

    .line 1365
    .line 1366
    .line 1367
    move-result v8

    .line 1368
    :cond_55
    move-object v2, v3

    .line 1369
    move-object v3, v6

    .line 1370
    move-object v6, v4

    .line 1371
    move v4, v9

    .line 1372
    if-eqz v23, :cond_56

    .line 1373
    .line 1374
    const/16 v9, 0x8

    .line 1375
    .line 1376
    :goto_3a
    move-object v7, v5

    .line 1377
    goto :goto_3b

    .line 1378
    :cond_56
    const/4 v9, 0x5

    .line 1379
    goto :goto_3a

    .line 1380
    :goto_3b
    const/high16 v5, 0x3f000000    # 0.5f

    .line 1381
    .line 1382
    move-object/from16 v37, v7

    .line 1383
    .line 1384
    move-object/from16 v17, v13

    .line 1385
    .line 1386
    const/16 v13, 0x8

    .line 1387
    .line 1388
    const/16 v30, 0x5

    .line 1389
    .line 1390
    move-object v7, v1

    .line 1391
    move-object/from16 v1, p1

    .line 1392
    .line 1393
    invoke-virtual/range {v1 .. v9}, LO0/c;->b(LO0/f;LO0/f;IFLO0/f;LO0/f;II)V

    .line 1394
    .line 1395
    .line 1396
    goto :goto_3c

    .line 1397
    :cond_57
    move-object/from16 v37, v5

    .line 1398
    .line 1399
    move-object/from16 v17, v13

    .line 1400
    .line 1401
    const/16 v13, 0x8

    .line 1402
    .line 1403
    const/16 v30, 0x5

    .line 1404
    .line 1405
    :goto_3c
    iget v1, v10, LQ0/d;->g0:I

    .line 1406
    .line 1407
    if-eq v1, v13, :cond_58

    .line 1408
    .line 1409
    move-object/from16 v17, v10

    .line 1410
    .line 1411
    :cond_58
    move-object v10, v14

    .line 1412
    move-object/from16 v13, v17

    .line 1413
    .line 1414
    move-object/from16 v5, v37

    .line 1415
    .line 1416
    goto/16 :goto_34

    .line 1417
    .line 1418
    :cond_59
    move-object/from16 v37, v5

    .line 1419
    .line 1420
    const/16 v13, 0x8

    .line 1421
    .line 1422
    if-eqz v18, :cond_47

    .line 1423
    .line 1424
    if-eqz v12, :cond_47

    .line 1425
    .line 1426
    iget v1, v3, LQ0/b;->j:I

    .line 1427
    .line 1428
    if-lez v1, :cond_5a

    .line 1429
    .line 1430
    iget v2, v3, LQ0/b;->i:I

    .line 1431
    .line 1432
    if-ne v2, v1, :cond_5a

    .line 1433
    .line 1434
    const/16 v23, 0x1

    .line 1435
    .line 1436
    goto :goto_3d

    .line 1437
    :cond_5a
    move/from16 v23, v26

    .line 1438
    .line 1439
    :goto_3d
    move-object v10, v12

    .line 1440
    move-object v14, v10

    .line 1441
    :goto_3e
    if-eqz v10, :cond_65

    .line 1442
    .line 1443
    iget-object v1, v10, LQ0/d;->m0:[LQ0/d;

    .line 1444
    .line 1445
    aget-object v1, v1, p3

    .line 1446
    .line 1447
    :goto_3f
    if-eqz v1, :cond_5b

    .line 1448
    .line 1449
    iget v2, v1, LQ0/d;->g0:I

    .line 1450
    .line 1451
    if-ne v2, v13, :cond_5b

    .line 1452
    .line 1453
    iget-object v1, v1, LQ0/d;->m0:[LQ0/d;

    .line 1454
    .line 1455
    aget-object v1, v1, p3

    .line 1456
    .line 1457
    goto :goto_3f

    .line 1458
    :cond_5b
    if-eq v10, v12, :cond_63

    .line 1459
    .line 1460
    if-eq v10, v0, :cond_63

    .line 1461
    .line 1462
    if-eqz v1, :cond_63

    .line 1463
    .line 1464
    if-ne v1, v0, :cond_5c

    .line 1465
    .line 1466
    move-object/from16 v1, v16

    .line 1467
    .line 1468
    :cond_5c
    iget-object v2, v10, LQ0/d;->Q:[LQ0/c;

    .line 1469
    .line 1470
    aget-object v3, v2, v15

    .line 1471
    .line 1472
    move-object v4, v2

    .line 1473
    iget-object v2, v3, LQ0/c;->i:LO0/f;

    .line 1474
    .line 1475
    iget-object v5, v14, LQ0/d;->Q:[LQ0/c;

    .line 1476
    .line 1477
    add-int/lit8 v6, v15, 0x1

    .line 1478
    .line 1479
    aget-object v5, v5, v6

    .line 1480
    .line 1481
    iget-object v5, v5, LQ0/c;->i:LO0/f;

    .line 1482
    .line 1483
    invoke-virtual {v3}, LQ0/c;->e()I

    .line 1484
    .line 1485
    .line 1486
    move-result v3

    .line 1487
    aget-object v7, v4, v6

    .line 1488
    .line 1489
    invoke-virtual {v7}, LQ0/c;->e()I

    .line 1490
    .line 1491
    .line 1492
    move-result v7

    .line 1493
    if-eqz v1, :cond_5e

    .line 1494
    .line 1495
    iget-object v4, v1, LQ0/d;->Q:[LQ0/c;

    .line 1496
    .line 1497
    aget-object v4, v4, v15

    .line 1498
    .line 1499
    iget-object v8, v4, LQ0/c;->i:LO0/f;

    .line 1500
    .line 1501
    iget-object v9, v4, LQ0/c;->f:LQ0/c;

    .line 1502
    .line 1503
    if-eqz v9, :cond_5d

    .line 1504
    .line 1505
    iget-object v9, v9, LQ0/c;->i:LO0/f;

    .line 1506
    .line 1507
    goto :goto_41

    .line 1508
    :cond_5d
    move-object/from16 v9, v16

    .line 1509
    .line 1510
    goto :goto_41

    .line 1511
    :cond_5e
    iget-object v8, v0, LQ0/d;->Q:[LQ0/c;

    .line 1512
    .line 1513
    aget-object v8, v8, v15

    .line 1514
    .line 1515
    if-eqz v8, :cond_5f

    .line 1516
    .line 1517
    iget-object v9, v8, LQ0/c;->i:LO0/f;

    .line 1518
    .line 1519
    goto :goto_40

    .line 1520
    :cond_5f
    move-object/from16 v9, v16

    .line 1521
    .line 1522
    :goto_40
    aget-object v4, v4, v6

    .line 1523
    .line 1524
    iget-object v4, v4, LQ0/c;->i:LO0/f;

    .line 1525
    .line 1526
    move-object/from16 v38, v9

    .line 1527
    .line 1528
    move-object v9, v4

    .line 1529
    move-object v4, v8

    .line 1530
    move-object/from16 v8, v38

    .line 1531
    .line 1532
    :goto_41
    if-eqz v4, :cond_60

    .line 1533
    .line 1534
    invoke-virtual {v4}, LQ0/c;->e()I

    .line 1535
    .line 1536
    .line 1537
    move-result v4

    .line 1538
    add-int/2addr v7, v4

    .line 1539
    :cond_60
    iget-object v4, v14, LQ0/d;->Q:[LQ0/c;

    .line 1540
    .line 1541
    aget-object v4, v4, v6

    .line 1542
    .line 1543
    invoke-virtual {v4}, LQ0/c;->e()I

    .line 1544
    .line 1545
    .line 1546
    move-result v4

    .line 1547
    add-int/2addr v4, v3

    .line 1548
    move-object v6, v8

    .line 1549
    move v8, v7

    .line 1550
    move-object v7, v9

    .line 1551
    if-eqz v23, :cond_61

    .line 1552
    .line 1553
    move v9, v13

    .line 1554
    goto :goto_42

    .line 1555
    :cond_61
    const/4 v9, 0x4

    .line 1556
    :goto_42
    if-eqz v2, :cond_62

    .line 1557
    .line 1558
    if-eqz v5, :cond_62

    .line 1559
    .line 1560
    if-eqz v6, :cond_62

    .line 1561
    .line 1562
    if-eqz v7, :cond_62

    .line 1563
    .line 1564
    move-object v3, v5

    .line 1565
    const/high16 v5, 0x3f000000    # 0.5f

    .line 1566
    .line 1567
    move-object/from16 v17, v1

    .line 1568
    .line 1569
    const/16 v29, 0x4

    .line 1570
    .line 1571
    move-object/from16 v1, p1

    .line 1572
    .line 1573
    invoke-virtual/range {v1 .. v9}, LO0/c;->b(LO0/f;LO0/f;IFLO0/f;LO0/f;II)V

    .line 1574
    .line 1575
    .line 1576
    move-object v2, v1

    .line 1577
    goto :goto_43

    .line 1578
    :cond_62
    move-object/from16 v2, p1

    .line 1579
    .line 1580
    move-object/from16 v17, v1

    .line 1581
    .line 1582
    const/16 v29, 0x4

    .line 1583
    .line 1584
    :goto_43
    move-object/from16 v1, v17

    .line 1585
    .line 1586
    goto :goto_44

    .line 1587
    :cond_63
    move-object/from16 v2, p1

    .line 1588
    .line 1589
    const/16 v29, 0x4

    .line 1590
    .line 1591
    :goto_44
    iget v3, v10, LQ0/d;->g0:I

    .line 1592
    .line 1593
    if-eq v3, v13, :cond_64

    .line 1594
    .line 1595
    move-object v14, v10

    .line 1596
    :cond_64
    move-object v10, v1

    .line 1597
    goto/16 :goto_3e

    .line 1598
    .line 1599
    :cond_65
    move-object/from16 v2, p1

    .line 1600
    .line 1601
    iget-object v1, v12, LQ0/d;->Q:[LQ0/c;

    .line 1602
    .line 1603
    aget-object v1, v1, v15

    .line 1604
    .line 1605
    move-object/from16 v7, v37

    .line 1606
    .line 1607
    iget-object v3, v7, LQ0/d;->Q:[LQ0/c;

    .line 1608
    .line 1609
    aget-object v3, v3, v15

    .line 1610
    .line 1611
    iget-object v3, v3, LQ0/c;->f:LQ0/c;

    .line 1612
    .line 1613
    iget-object v4, v0, LQ0/d;->Q:[LQ0/c;

    .line 1614
    .line 1615
    add-int/lit8 v5, v15, 0x1

    .line 1616
    .line 1617
    aget-object v10, v4, v5

    .line 1618
    .line 1619
    iget-object v4, v11, LQ0/d;->Q:[LQ0/c;

    .line 1620
    .line 1621
    aget-object v4, v4, v5

    .line 1622
    .line 1623
    iget-object v13, v4, LQ0/c;->f:LQ0/c;

    .line 1624
    .line 1625
    const/4 v9, 0x5

    .line 1626
    if-eqz v3, :cond_66

    .line 1627
    .line 1628
    if-eq v12, v0, :cond_67

    .line 1629
    .line 1630
    iget-object v4, v1, LQ0/c;->i:LO0/f;

    .line 1631
    .line 1632
    iget-object v3, v3, LQ0/c;->i:LO0/f;

    .line 1633
    .line 1634
    invoke-virtual {v1}, LQ0/c;->e()I

    .line 1635
    .line 1636
    .line 1637
    move-result v1

    .line 1638
    invoke-virtual {v2, v4, v3, v1, v9}, LO0/c;->e(LO0/f;LO0/f;II)V

    .line 1639
    .line 1640
    .line 1641
    :cond_66
    move-object v1, v2

    .line 1642
    goto :goto_45

    .line 1643
    :cond_67
    if-eqz v13, :cond_66

    .line 1644
    .line 1645
    iget-object v2, v1, LQ0/c;->i:LO0/f;

    .line 1646
    .line 1647
    iget-object v3, v3, LQ0/c;->i:LO0/f;

    .line 1648
    .line 1649
    invoke-virtual {v1}, LQ0/c;->e()I

    .line 1650
    .line 1651
    .line 1652
    move-result v4

    .line 1653
    iget-object v6, v10, LQ0/c;->i:LO0/f;

    .line 1654
    .line 1655
    iget-object v7, v13, LQ0/c;->i:LO0/f;

    .line 1656
    .line 1657
    invoke-virtual {v10}, LQ0/c;->e()I

    .line 1658
    .line 1659
    .line 1660
    move-result v8

    .line 1661
    const/high16 v5, 0x3f000000    # 0.5f

    .line 1662
    .line 1663
    move-object/from16 v1, p1

    .line 1664
    .line 1665
    invoke-virtual/range {v1 .. v9}, LO0/c;->b(LO0/f;LO0/f;IFLO0/f;LO0/f;II)V

    .line 1666
    .line 1667
    .line 1668
    :goto_45
    if-eqz v13, :cond_68

    .line 1669
    .line 1670
    if-eq v12, v0, :cond_68

    .line 1671
    .line 1672
    iget-object v2, v10, LQ0/c;->i:LO0/f;

    .line 1673
    .line 1674
    iget-object v3, v13, LQ0/c;->i:LO0/f;

    .line 1675
    .line 1676
    invoke-virtual {v10}, LQ0/c;->e()I

    .line 1677
    .line 1678
    .line 1679
    move-result v4

    .line 1680
    neg-int v4, v4

    .line 1681
    invoke-virtual {v1, v2, v3, v4, v9}, LO0/c;->e(LO0/f;LO0/f;II)V

    .line 1682
    .line 1683
    .line 1684
    :cond_68
    :goto_46
    if-nez v21, :cond_69

    .line 1685
    .line 1686
    if-eqz v18, :cond_70

    .line 1687
    .line 1688
    :cond_69
    if-eqz v12, :cond_70

    .line 1689
    .line 1690
    if-eq v12, v0, :cond_70

    .line 1691
    .line 1692
    iget-object v2, v12, LQ0/d;->Q:[LQ0/c;

    .line 1693
    .line 1694
    aget-object v3, v2, v15

    .line 1695
    .line 1696
    if-nez v0, :cond_6a

    .line 1697
    .line 1698
    move-object v0, v12

    .line 1699
    :cond_6a
    add-int/lit8 v4, v15, 0x1

    .line 1700
    .line 1701
    iget-object v5, v0, LQ0/d;->Q:[LQ0/c;

    .line 1702
    .line 1703
    aget-object v6, v5, v4

    .line 1704
    .line 1705
    iget-object v7, v3, LQ0/c;->f:LQ0/c;

    .line 1706
    .line 1707
    if-eqz v7, :cond_6b

    .line 1708
    .line 1709
    iget-object v7, v7, LQ0/c;->i:LO0/f;

    .line 1710
    .line 1711
    goto :goto_47

    .line 1712
    :cond_6b
    move-object/from16 v7, v16

    .line 1713
    .line 1714
    :goto_47
    iget-object v8, v6, LQ0/c;->f:LQ0/c;

    .line 1715
    .line 1716
    if-eqz v8, :cond_6c

    .line 1717
    .line 1718
    iget-object v8, v8, LQ0/c;->i:LO0/f;

    .line 1719
    .line 1720
    goto :goto_48

    .line 1721
    :cond_6c
    move-object/from16 v8, v16

    .line 1722
    .line 1723
    :goto_48
    if-eq v11, v0, :cond_6e

    .line 1724
    .line 1725
    iget-object v8, v11, LQ0/d;->Q:[LQ0/c;

    .line 1726
    .line 1727
    aget-object v8, v8, v4

    .line 1728
    .line 1729
    iget-object v8, v8, LQ0/c;->f:LQ0/c;

    .line 1730
    .line 1731
    if-eqz v8, :cond_6d

    .line 1732
    .line 1733
    iget-object v8, v8, LQ0/c;->i:LO0/f;

    .line 1734
    .line 1735
    move-object/from16 v16, v8

    .line 1736
    .line 1737
    :cond_6d
    move-object/from16 v8, v16

    .line 1738
    .line 1739
    :cond_6e
    if-ne v12, v0, :cond_6f

    .line 1740
    .line 1741
    aget-object v6, v2, v4

    .line 1742
    .line 1743
    :cond_6f
    if-eqz v7, :cond_70

    .line 1744
    .line 1745
    if-eqz v8, :cond_70

    .line 1746
    .line 1747
    move v0, v4

    .line 1748
    invoke-virtual {v3}, LQ0/c;->e()I

    .line 1749
    .line 1750
    .line 1751
    move-result v4

    .line 1752
    aget-object v0, v5, v0

    .line 1753
    .line 1754
    invoke-virtual {v0}, LQ0/c;->e()I

    .line 1755
    .line 1756
    .line 1757
    move-result v0

    .line 1758
    iget-object v2, v3, LQ0/c;->i:LO0/f;

    .line 1759
    .line 1760
    iget-object v3, v6, LQ0/c;->i:LO0/f;

    .line 1761
    .line 1762
    const/4 v9, 0x5

    .line 1763
    const/high16 v5, 0x3f000000    # 0.5f

    .line 1764
    .line 1765
    move-object v6, v7

    .line 1766
    move-object v7, v3

    .line 1767
    move-object v3, v6

    .line 1768
    move-object v6, v8

    .line 1769
    move v8, v0

    .line 1770
    invoke-virtual/range {v1 .. v9}, LO0/c;->b(LO0/f;LO0/f;IFLO0/f;LO0/f;II)V

    .line 1771
    .line 1772
    .line 1773
    :cond_70
    :goto_49
    add-int/lit8 v2, v24, 0x1

    .line 1774
    .line 1775
    move-object/from16 v0, p0

    .line 1776
    .line 1777
    move-object/from16 v1, p1

    .line 1778
    .line 1779
    move-object/from16 v10, p2

    .line 1780
    .line 1781
    move-object/from16 v14, v19

    .line 1782
    .line 1783
    move/from16 v13, v35

    .line 1784
    .line 1785
    goto/16 :goto_2

    .line 1786
    .line 1787
    :cond_71
    return-void
.end method

.method public static b(LQ0/e;LO0/c;LQ0/d;)V
    .locals 8

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p2, LQ0/d;->o:I

    .line 3
    .line 4
    iput v0, p2, LQ0/d;->p:I

    .line 5
    .line 6
    iget-object v0, p0, LQ0/d;->p0:[I

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    aget v0, v0, v1

    .line 10
    .line 11
    iget-object v2, p2, LQ0/d;->p0:[I

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    const/4 v4, 0x4

    .line 15
    if-eq v0, v3, :cond_0

    .line 16
    .line 17
    aget v0, v2, v1

    .line 18
    .line 19
    if-ne v0, v4, :cond_0

    .line 20
    .line 21
    iget-object v0, p2, LQ0/d;->I:LQ0/c;

    .line 22
    .line 23
    iget v1, v0, LQ0/c;->g:I

    .line 24
    .line 25
    invoke-virtual {p0}, LQ0/d;->q()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    iget-object v6, p2, LQ0/d;->K:LQ0/c;

    .line 30
    .line 31
    iget v7, v6, LQ0/c;->g:I

    .line 32
    .line 33
    sub-int/2addr v5, v7

    .line 34
    invoke-virtual {p1, v0}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    iput-object v7, v0, LQ0/c;->i:LO0/f;

    .line 39
    .line 40
    invoke-virtual {p1, v6}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    iput-object v7, v6, LQ0/c;->i:LO0/f;

    .line 45
    .line 46
    iget-object v0, v0, LQ0/c;->i:LO0/f;

    .line 47
    .line 48
    invoke-virtual {p1, v0, v1}, LO0/c;->d(LO0/f;I)V

    .line 49
    .line 50
    .line 51
    iget-object v0, v6, LQ0/c;->i:LO0/f;

    .line 52
    .line 53
    invoke-virtual {p1, v0, v5}, LO0/c;->d(LO0/f;I)V

    .line 54
    .line 55
    .line 56
    iput v3, p2, LQ0/d;->o:I

    .line 57
    .line 58
    iput v1, p2, LQ0/d;->Y:I

    .line 59
    .line 60
    sub-int/2addr v5, v1

    .line 61
    iput v5, p2, LQ0/d;->U:I

    .line 62
    .line 63
    iget v0, p2, LQ0/d;->b0:I

    .line 64
    .line 65
    if-ge v5, v0, :cond_0

    .line 66
    .line 67
    iput v0, p2, LQ0/d;->U:I

    .line 68
    .line 69
    :cond_0
    iget-object v0, p0, LQ0/d;->p0:[I

    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    aget v0, v0, v1

    .line 73
    .line 74
    if-eq v0, v3, :cond_3

    .line 75
    .line 76
    aget v0, v2, v1

    .line 77
    .line 78
    if-ne v0, v4, :cond_3

    .line 79
    .line 80
    iget-object v0, p2, LQ0/d;->J:LQ0/c;

    .line 81
    .line 82
    iget v1, v0, LQ0/c;->g:I

    .line 83
    .line 84
    invoke-virtual {p0}, LQ0/d;->k()I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    iget-object v2, p2, LQ0/d;->L:LQ0/c;

    .line 89
    .line 90
    iget v4, v2, LQ0/c;->g:I

    .line 91
    .line 92
    sub-int/2addr p0, v4

    .line 93
    invoke-virtual {p1, v0}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    iput-object v4, v0, LQ0/c;->i:LO0/f;

    .line 98
    .line 99
    invoke-virtual {p1, v2}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    iput-object v4, v2, LQ0/c;->i:LO0/f;

    .line 104
    .line 105
    iget-object v0, v0, LQ0/c;->i:LO0/f;

    .line 106
    .line 107
    invoke-virtual {p1, v0, v1}, LO0/c;->d(LO0/f;I)V

    .line 108
    .line 109
    .line 110
    iget-object v0, v2, LQ0/c;->i:LO0/f;

    .line 111
    .line 112
    invoke-virtual {p1, v0, p0}, LO0/c;->d(LO0/f;I)V

    .line 113
    .line 114
    .line 115
    iget v0, p2, LQ0/d;->a0:I

    .line 116
    .line 117
    if-gtz v0, :cond_1

    .line 118
    .line 119
    iget v0, p2, LQ0/d;->g0:I

    .line 120
    .line 121
    const/16 v2, 0x8

    .line 122
    .line 123
    if-ne v0, v2, :cond_2

    .line 124
    .line 125
    :cond_1
    iget-object v0, p2, LQ0/d;->M:LQ0/c;

    .line 126
    .line 127
    invoke-virtual {p1, v0}, LO0/c;->k(Ljava/lang/Object;)LO0/f;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    iput-object v2, v0, LQ0/c;->i:LO0/f;

    .line 132
    .line 133
    iget v0, p2, LQ0/d;->a0:I

    .line 134
    .line 135
    add-int/2addr v0, v1

    .line 136
    invoke-virtual {p1, v2, v0}, LO0/c;->d(LO0/f;I)V

    .line 137
    .line 138
    .line 139
    :cond_2
    iput v3, p2, LQ0/d;->p:I

    .line 140
    .line 141
    iput v1, p2, LQ0/d;->Z:I

    .line 142
    .line 143
    sub-int/2addr p0, v1

    .line 144
    iput p0, p2, LQ0/d;->V:I

    .line 145
    .line 146
    iget p1, p2, LQ0/d;->c0:I

    .line 147
    .line 148
    if-ge p0, p1, :cond_3

    .line 149
    .line 150
    iput p1, p2, LQ0/d;->V:I

    .line 151
    .line 152
    :cond_3
    return-void
.end method

.method public static final c(II)Z
    .locals 0

    .line 1
    and-int/2addr p0, p1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0

    .line 6
    :cond_0
    const/4 p0, 0x0

    .line 7
    return p0
.end method
