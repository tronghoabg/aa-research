.class public final Lp0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public final b:Landroid/util/SparseLongArray;

.field public final c:Landroid/util/SparseBooleanArray;

.field public final d:Ljava/util/ArrayList;

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/util/SparseLongArray;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/util/SparseLongArray;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lp0/c;->b:Landroid/util/SparseLongArray;

    .line 10
    .line 11
    new-instance v0, Landroid/util/SparseBooleanArray;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lp0/c;->c:Landroid/util/SparseBooleanArray;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lp0/c;->d:Ljava/util/ArrayList;

    .line 24
    .line 25
    const/4 v0, -0x1

    .line 26
    iput v0, p0, Lp0/c;->e:I

    .line 27
    .line 28
    iput v0, p0, Lp0/c;->f:I

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;Lu0/n;)LY2/B;
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "motionEvent"

    .line 8
    .line 9
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    iget-object v4, v0, Lp0/c;->b:Landroid/util/SparseLongArray;

    .line 17
    .line 18
    iget-object v5, v0, Lp0/c;->c:Landroid/util/SparseBooleanArray;

    .line 19
    .line 20
    const/4 v6, 0x3

    .line 21
    if-ne v3, v6, :cond_0

    .line 22
    .line 23
    invoke-virtual {v4}, Landroid/util/SparseLongArray;->clear()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v5}, Landroid/util/SparseBooleanArray;->clear()V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    return-object v1

    .line 31
    :cond_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    const/4 v8, 0x1

    .line 36
    const/4 v9, 0x0

    .line 37
    if-eq v7, v8, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    .line 45
    .line 46
    .line 47
    move-result v10

    .line 48
    iget v11, v0, Lp0/c;->e:I

    .line 49
    .line 50
    if-ne v7, v11, :cond_2

    .line 51
    .line 52
    iget v11, v0, Lp0/c;->f:I

    .line 53
    .line 54
    if-eq v10, v11, :cond_3

    .line 55
    .line 56
    :cond_2
    iput v7, v0, Lp0/c;->e:I

    .line 57
    .line 58
    iput v10, v0, Lp0/c;->f:I

    .line 59
    .line 60
    invoke-virtual {v5}, Landroid/util/SparseBooleanArray;->clear()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4}, Landroid/util/SparseLongArray;->clear()V

    .line 64
    .line 65
    .line 66
    :cond_3
    :goto_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    const/16 v12, 0x9

    .line 71
    .line 72
    if-eqz v7, :cond_6

    .line 73
    .line 74
    const/4 v13, 0x5

    .line 75
    if-eq v7, v13, :cond_6

    .line 76
    .line 77
    if-eq v7, v12, :cond_5

    .line 78
    .line 79
    :cond_4
    const-wide/16 v15, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    invoke-virtual {v4, v7}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    .line 87
    .line 88
    .line 89
    move-result v13

    .line 90
    if-gez v13, :cond_4

    .line 91
    .line 92
    iget-wide v13, v0, Lp0/c;->a:J

    .line 93
    .line 94
    const-wide/16 v15, 0x1

    .line 95
    .line 96
    add-long v10, v13, v15

    .line 97
    .line 98
    iput-wide v10, v0, Lp0/c;->a:J

    .line 99
    .line 100
    invoke-virtual {v4, v7, v13, v14}, Landroid/util/SparseLongArray;->put(IJ)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_6
    const-wide/16 v15, 0x1

    .line 105
    .line 106
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    invoke-virtual {v4, v10}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    .line 115
    .line 116
    .line 117
    move-result v11

    .line 118
    if-gez v11, :cond_7

    .line 119
    .line 120
    iget-wide v13, v0, Lp0/c;->a:J

    .line 121
    .line 122
    add-long v8, v13, v15

    .line 123
    .line 124
    iput-wide v8, v0, Lp0/c;->a:J

    .line 125
    .line 126
    invoke-virtual {v4, v10, v13, v14}, Landroid/util/SparseLongArray;->put(IJ)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    if-ne v7, v6, :cond_7

    .line 134
    .line 135
    const/4 v11, 0x1

    .line 136
    invoke-virtual {v5, v10, v11}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 137
    .line 138
    .line 139
    :cond_7
    :goto_1
    const/16 v7, 0xa

    .line 140
    .line 141
    if-eq v3, v7, :cond_9

    .line 142
    .line 143
    const/4 v8, 0x7

    .line 144
    if-eq v3, v8, :cond_9

    .line 145
    .line 146
    if-ne v3, v12, :cond_8

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_8
    const/4 v8, 0x0

    .line 150
    goto :goto_3

    .line 151
    :cond_9
    :goto_2
    const/4 v8, 0x1

    .line 152
    :goto_3
    const/16 v9, 0x8

    .line 153
    .line 154
    if-ne v3, v9, :cond_a

    .line 155
    .line 156
    const/4 v10, 0x1

    .line 157
    goto :goto_4

    .line 158
    :cond_a
    const/4 v10, 0x0

    .line 159
    :goto_4
    if-eqz v8, :cond_b

    .line 160
    .line 161
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 162
    .line 163
    .line 164
    move-result v13

    .line 165
    invoke-virtual {v1, v13}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 166
    .line 167
    .line 168
    move-result v13

    .line 169
    const/4 v11, 0x1

    .line 170
    invoke-virtual {v5, v13, v11}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 171
    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_b
    const/4 v11, 0x1

    .line 175
    :goto_5
    const/4 v14, 0x6

    .line 176
    if-eq v3, v11, :cond_d

    .line 177
    .line 178
    if-eq v3, v14, :cond_c

    .line 179
    .line 180
    const/4 v3, -0x1

    .line 181
    goto :goto_6

    .line 182
    :cond_c
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    goto :goto_6

    .line 187
    :cond_d
    const/4 v3, 0x0

    .line 188
    :goto_6
    iget-object v11, v0, Lp0/c;->d:Ljava/util/ArrayList;

    .line 189
    .line 190
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 191
    .line 192
    .line 193
    move-wide/from16 v18, v15

    .line 194
    .line 195
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 196
    .line 197
    .line 198
    move-result v15

    .line 199
    const/4 v13, 0x0

    .line 200
    :goto_7
    if-ge v13, v15, :cond_1a

    .line 201
    .line 202
    if-nez v8, :cond_f

    .line 203
    .line 204
    if-eq v13, v3, :cond_f

    .line 205
    .line 206
    if-eqz v10, :cond_e

    .line 207
    .line 208
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 209
    .line 210
    .line 211
    move-result v20

    .line 212
    if-eqz v20, :cond_f

    .line 213
    .line 214
    :cond_e
    const/16 v30, 0x1

    .line 215
    .line 216
    goto :goto_8

    .line 217
    :cond_f
    const/16 v30, 0x0

    .line 218
    .line 219
    :goto_8
    invoke-virtual {v1, v13}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 220
    .line 221
    .line 222
    move-result v14

    .line 223
    invoke-virtual {v4, v14}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    .line 224
    .line 225
    .line 226
    move-result v12

    .line 227
    if-ltz v12, :cond_10

    .line 228
    .line 229
    invoke-virtual {v4, v12}, Landroid/util/SparseLongArray;->valueAt(I)J

    .line 230
    .line 231
    .line 232
    move-result-wide v21

    .line 233
    move/from16 v36, v8

    .line 234
    .line 235
    move/from16 v37, v10

    .line 236
    .line 237
    move-wide/from16 v22, v21

    .line 238
    .line 239
    goto :goto_9

    .line 240
    :cond_10
    move/from16 v36, v8

    .line 241
    .line 242
    iget-wide v7, v0, Lp0/c;->a:J

    .line 243
    .line 244
    move/from16 v37, v10

    .line 245
    .line 246
    add-long v9, v7, v18

    .line 247
    .line 248
    iput-wide v9, v0, Lp0/c;->a:J

    .line 249
    .line 250
    invoke-virtual {v4, v14, v7, v8}, Landroid/util/SparseLongArray;->put(IJ)V

    .line 251
    .line 252
    .line 253
    move-wide/from16 v22, v7

    .line 254
    .line 255
    :goto_9
    invoke-virtual {v1, v13}, Landroid/view/MotionEvent;->getX(I)F

    .line 256
    .line 257
    .line 258
    move-result v7

    .line 259
    invoke-virtual {v1, v13}, Landroid/view/MotionEvent;->getY(I)F

    .line 260
    .line 261
    .line 262
    move-result v8

    .line 263
    invoke-static {v7, v8}, LU8/v0;->f(FF)J

    .line 264
    .line 265
    .line 266
    move-result-wide v7

    .line 267
    if-nez v13, :cond_11

    .line 268
    .line 269
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 270
    .line 271
    .line 272
    move-result v7

    .line 273
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 274
    .line 275
    .line 276
    move-result v8

    .line 277
    invoke-static {v7, v8}, LU8/v0;->f(FF)J

    .line 278
    .line 279
    .line 280
    move-result-wide v7

    .line 281
    invoke-virtual {v2, v7, v8}, Lu0/n;->t(J)J

    .line 282
    .line 283
    .line 284
    move-result-wide v9

    .line 285
    :goto_a
    move-wide/from16 v26, v7

    .line 286
    .line 287
    move-wide/from16 v28, v9

    .line 288
    .line 289
    goto :goto_b

    .line 290
    :cond_11
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 291
    .line 292
    const/16 v10, 0x1d

    .line 293
    .line 294
    if-lt v9, v10, :cond_12

    .line 295
    .line 296
    sget-object v7, Lp0/d;->a:Lp0/d;

    .line 297
    .line 298
    invoke-virtual {v7, v1, v13}, Lp0/d;->a(Landroid/view/MotionEvent;I)J

    .line 299
    .line 300
    .line 301
    move-result-wide v7

    .line 302
    invoke-virtual {v2, v7, v8}, Lu0/n;->t(J)J

    .line 303
    .line 304
    .line 305
    move-result-wide v9

    .line 306
    goto :goto_a

    .line 307
    :cond_12
    invoke-virtual {v2, v7, v8}, Lu0/n;->j(J)J

    .line 308
    .line 309
    .line 310
    move-result-wide v9

    .line 311
    move-wide/from16 v28, v7

    .line 312
    .line 313
    move-wide/from16 v26, v9

    .line 314
    .line 315
    :goto_b
    invoke-virtual {v1, v13}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 316
    .line 317
    .line 318
    move-result v7

    .line 319
    if-eqz v7, :cond_13

    .line 320
    .line 321
    const/4 v8, 0x1

    .line 322
    if-eq v7, v8, :cond_16

    .line 323
    .line 324
    const/4 v8, 0x2

    .line 325
    if-eq v7, v8, :cond_15

    .line 326
    .line 327
    if-eq v7, v6, :cond_14

    .line 328
    .line 329
    const/4 v8, 0x4

    .line 330
    if-eq v7, v8, :cond_14

    .line 331
    .line 332
    :cond_13
    const/16 v31, 0x0

    .line 333
    .line 334
    goto :goto_c

    .line 335
    :cond_14
    move/from16 v31, v8

    .line 336
    .line 337
    goto :goto_c

    .line 338
    :cond_15
    move/from16 v31, v6

    .line 339
    .line 340
    goto :goto_c

    .line 341
    :cond_16
    const/16 v31, 0x1

    .line 342
    .line 343
    :goto_c
    new-instance v7, Ljava/util/ArrayList;

    .line 344
    .line 345
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getHistorySize()I

    .line 349
    .line 350
    .line 351
    move-result v8

    .line 352
    const/4 v9, 0x0

    .line 353
    :goto_d
    if-ge v9, v8, :cond_18

    .line 354
    .line 355
    invoke-virtual {v1, v13, v9}, Landroid/view/MotionEvent;->getHistoricalX(II)F

    .line 356
    .line 357
    .line 358
    move-result v10

    .line 359
    invoke-virtual {v1, v13, v9}, Landroid/view/MotionEvent;->getHistoricalY(II)F

    .line 360
    .line 361
    .line 362
    move-result v14

    .line 363
    invoke-static {v10}, Ljava/lang/Float;->isInfinite(F)Z

    .line 364
    .line 365
    .line 366
    move-result v21

    .line 367
    if-nez v21, :cond_17

    .line 368
    .line 369
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    .line 370
    .line 371
    .line 372
    move-result v21

    .line 373
    if-nez v21, :cond_17

    .line 374
    .line 375
    invoke-static {v14}, Ljava/lang/Float;->isInfinite(F)Z

    .line 376
    .line 377
    .line 378
    move-result v21

    .line 379
    if-nez v21, :cond_17

    .line 380
    .line 381
    invoke-static {v14}, Ljava/lang/Float;->isNaN(F)Z

    .line 382
    .line 383
    .line 384
    move-result v21

    .line 385
    if-nez v21, :cond_17

    .line 386
    .line 387
    new-instance v6, Lp0/b;

    .line 388
    .line 389
    move/from16 v38, v13

    .line 390
    .line 391
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getHistoricalEventTime(I)J

    .line 392
    .line 393
    .line 394
    move-result-wide v12

    .line 395
    move/from16 v39, v3

    .line 396
    .line 397
    invoke-static {v10, v14}, LU8/v0;->f(FF)J

    .line 398
    .line 399
    .line 400
    move-result-wide v2

    .line 401
    invoke-direct {v6, v12, v13, v2, v3}, Lp0/b;-><init>(JJ)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    goto :goto_e

    .line 408
    :cond_17
    move/from16 v39, v3

    .line 409
    .line 410
    move/from16 v38, v13

    .line 411
    .line 412
    :goto_e
    add-int/lit8 v9, v9, 0x1

    .line 413
    .line 414
    move-object/from16 v2, p2

    .line 415
    .line 416
    move/from16 v13, v38

    .line 417
    .line 418
    move/from16 v3, v39

    .line 419
    .line 420
    const/4 v6, 0x3

    .line 421
    goto :goto_d

    .line 422
    :cond_18
    move/from16 v39, v3

    .line 423
    .line 424
    move/from16 v38, v13

    .line 425
    .line 426
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 427
    .line 428
    .line 429
    move-result v2

    .line 430
    const/16 v3, 0x8

    .line 431
    .line 432
    if-ne v2, v3, :cond_19

    .line 433
    .line 434
    const/16 v12, 0xa

    .line 435
    .line 436
    invoke-virtual {v1, v12}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 437
    .line 438
    .line 439
    move-result v2

    .line 440
    const/16 v6, 0x9

    .line 441
    .line 442
    invoke-virtual {v1, v6}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 443
    .line 444
    .line 445
    move-result v8

    .line 446
    neg-float v8, v8

    .line 447
    invoke-static {v2, v8}, LU8/v0;->f(FF)J

    .line 448
    .line 449
    .line 450
    move-result-wide v8

    .line 451
    :goto_f
    move-wide/from16 v34, v8

    .line 452
    .line 453
    move/from16 v2, v38

    .line 454
    .line 455
    goto :goto_10

    .line 456
    :cond_19
    const/16 v6, 0x9

    .line 457
    .line 458
    const/16 v12, 0xa

    .line 459
    .line 460
    sget-wide v8, Ld0/c;->b:J

    .line 461
    .line 462
    goto :goto_f

    .line 463
    :goto_10
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 464
    .line 465
    .line 466
    move-result v8

    .line 467
    const/4 v9, 0x0

    .line 468
    invoke-virtual {v5, v8, v9}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    .line 469
    .line 470
    .line 471
    move-result v32

    .line 472
    new-instance v21, Lp0/m;

    .line 473
    .line 474
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 475
    .line 476
    .line 477
    move-result-wide v24

    .line 478
    move-object/from16 v33, v7

    .line 479
    .line 480
    invoke-direct/range {v21 .. v35}, Lp0/m;-><init>(JJJJZIZLjava/util/ArrayList;J)V

    .line 481
    .line 482
    .line 483
    move-object/from16 v7, v21

    .line 484
    .line 485
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    add-int/lit8 v13, v2, 0x1

    .line 489
    .line 490
    move-object/from16 v2, p2

    .line 491
    .line 492
    move v9, v3

    .line 493
    move v7, v12

    .line 494
    move/from16 v8, v36

    .line 495
    .line 496
    move/from16 v10, v37

    .line 497
    .line 498
    move/from16 v3, v39

    .line 499
    .line 500
    const/4 v14, 0x6

    .line 501
    move v12, v6

    .line 502
    const/4 v6, 0x3

    .line 503
    goto/16 :goto_7

    .line 504
    .line 505
    :cond_1a
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 506
    .line 507
    .line 508
    move-result v2

    .line 509
    const/4 v8, 0x1

    .line 510
    if-eq v2, v8, :cond_1b

    .line 511
    .line 512
    const/4 v3, 0x6

    .line 513
    if-eq v2, v3, :cond_1b

    .line 514
    .line 515
    const/4 v9, 0x0

    .line 516
    goto :goto_11

    .line 517
    :cond_1b
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 518
    .line 519
    .line 520
    move-result v2

    .line 521
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 522
    .line 523
    .line 524
    move-result v2

    .line 525
    const/4 v9, 0x0

    .line 526
    invoke-virtual {v5, v2, v9}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    .line 527
    .line 528
    .line 529
    move-result v3

    .line 530
    if-nez v3, :cond_1c

    .line 531
    .line 532
    invoke-virtual {v4, v2}, Landroid/util/SparseLongArray;->delete(I)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v5, v2}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 536
    .line 537
    .line 538
    :cond_1c
    :goto_11
    invoke-virtual {v4}, Landroid/util/SparseLongArray;->size()I

    .line 539
    .line 540
    .line 541
    move-result v2

    .line 542
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 543
    .line 544
    .line 545
    move-result v3

    .line 546
    if-le v2, v3, :cond_1f

    .line 547
    .line 548
    invoke-virtual {v4}, Landroid/util/SparseLongArray;->size()I

    .line 549
    .line 550
    .line 551
    move-result v2

    .line 552
    const/16 v17, 0x1

    .line 553
    .line 554
    add-int/lit8 v2, v2, -0x1

    .line 555
    .line 556
    const/4 v3, -0x1

    .line 557
    :goto_12
    if-ge v3, v2, :cond_1f

    .line 558
    .line 559
    invoke-virtual {v4, v2}, Landroid/util/SparseLongArray;->keyAt(I)I

    .line 560
    .line 561
    .line 562
    move-result v6

    .line 563
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 564
    .line 565
    .line 566
    move-result v7

    .line 567
    move v8, v9

    .line 568
    :goto_13
    if-ge v8, v7, :cond_1e

    .line 569
    .line 570
    invoke-virtual {v1, v8}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 571
    .line 572
    .line 573
    move-result v10

    .line 574
    if-ne v10, v6, :cond_1d

    .line 575
    .line 576
    goto :goto_14

    .line 577
    :cond_1d
    add-int/lit8 v8, v8, 0x1

    .line 578
    .line 579
    goto :goto_13

    .line 580
    :cond_1e
    invoke-virtual {v4, v2}, Landroid/util/SparseLongArray;->removeAt(I)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v5, v6}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 584
    .line 585
    .line 586
    :goto_14
    add-int/lit8 v2, v2, -0x1

    .line 587
    .line 588
    goto :goto_12

    .line 589
    :cond_1f
    new-instance v2, LY2/B;

    .line 590
    .line 591
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 592
    .line 593
    .line 594
    invoke-direct {v2, v11, v1}, LY2/B;-><init>(Ljava/util/ArrayList;Landroid/view/MotionEvent;)V

    .line 595
    .line 596
    .line 597
    return-object v2
.end method
