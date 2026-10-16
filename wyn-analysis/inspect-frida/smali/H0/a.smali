.class public final LH0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LH0/c;

.field public final b:I

.field public final c:J

.field public final d:LA0/q;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LH0/c;IZJ)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v1, v0, LH0/a;->a:LH0/c;

    .line 11
    .line 12
    iput v2, v0, LH0/a;->b:I

    .line 13
    .line 14
    move-wide/from16 v3, p4

    .line 15
    .line 16
    iput-wide v3, v0, LH0/a;->c:J

    .line 17
    .line 18
    invoke-static {v3, v4}, LL0/a;->f(J)I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-nez v5, :cond_22

    .line 23
    .line 24
    invoke-static {v3, v4}, LL0/a;->g(J)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-nez v5, :cond_22

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    if-lt v2, v5, :cond_21

    .line 32
    .line 33
    iget-object v1, v1, LH0/c;->b:Lz0/p;

    .line 34
    .line 35
    iget-object v6, v1, Lz0/p;->b:Lz0/h;

    .line 36
    .line 37
    iget-object v6, v6, Lz0/h;->a:LK0/c;

    .line 38
    .line 39
    const/4 v7, 0x2

    .line 40
    const/4 v8, 0x4

    .line 41
    const/4 v9, 0x0

    .line 42
    const/4 v10, 0x3

    .line 43
    if-nez v6, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    iget v11, v6, LK0/c;->a:I

    .line 47
    .line 48
    if-ne v11, v5, :cond_1

    .line 49
    .line 50
    goto :goto_5

    .line 51
    :cond_1
    :goto_0
    if-nez v6, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    iget v11, v6, LK0/c;->a:I

    .line 55
    .line 56
    if-ne v11, v7, :cond_3

    .line 57
    .line 58
    move v10, v8

    .line 59
    goto :goto_5

    .line 60
    :cond_3
    :goto_1
    if-nez v6, :cond_4

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    iget v11, v6, LK0/c;->a:I

    .line 64
    .line 65
    if-ne v11, v10, :cond_5

    .line 66
    .line 67
    move v10, v7

    .line 68
    goto :goto_5

    .line 69
    :cond_5
    :goto_2
    if-nez v6, :cond_6

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_6
    const/4 v10, 0x5

    .line 73
    iget v11, v6, LK0/c;->a:I

    .line 74
    .line 75
    if-ne v11, v10, :cond_7

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_7
    :goto_3
    if-nez v6, :cond_8

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_8
    const/4 v10, 0x6

    .line 82
    iget v11, v6, LK0/c;->a:I

    .line 83
    .line 84
    if-ne v11, v10, :cond_9

    .line 85
    .line 86
    move v10, v5

    .line 87
    goto :goto_5

    .line 88
    :cond_9
    :goto_4
    move v10, v9

    .line 89
    :goto_5
    if-nez v6, :cond_b

    .line 90
    .line 91
    :cond_a
    move v6, v9

    .line 92
    goto :goto_6

    .line 93
    :cond_b
    iget v6, v6, LK0/c;->a:I

    .line 94
    .line 95
    if-ne v6, v8, :cond_a

    .line 96
    .line 97
    move v6, v5

    .line 98
    :goto_6
    const/4 v8, 0x0

    .line 99
    if-eqz p3, :cond_c

    .line 100
    .line 101
    sget-object v11, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 102
    .line 103
    goto :goto_7

    .line 104
    :cond_c
    move-object v11, v8

    .line 105
    :goto_7
    invoke-virtual {v0, v10, v6, v11, v2}, LH0/a;->a(IILandroid/text/TextUtils$TruncateAt;I)LA0/q;

    .line 106
    .line 107
    .line 108
    move-result-object v12

    .line 109
    if-eqz p3, :cond_11

    .line 110
    .line 111
    iget v13, v12, LA0/q;->c:I

    .line 112
    .line 113
    iget-boolean v14, v12, LA0/q;->a:Z

    .line 114
    .line 115
    iget-object v15, v12, LA0/q;->b:Landroid/text/Layout;

    .line 116
    .line 117
    if-eqz v14, :cond_d

    .line 118
    .line 119
    add-int/lit8 v14, v13, -0x1

    .line 120
    .line 121
    invoke-virtual {v15, v14}, Landroid/text/Layout;->getLineBottom(I)I

    .line 122
    .line 123
    .line 124
    move-result v14

    .line 125
    goto :goto_8

    .line 126
    :cond_d
    invoke-virtual {v15}, Landroid/text/Layout;->getHeight()I

    .line 127
    .line 128
    .line 129
    move-result v14

    .line 130
    :goto_8
    iget v15, v12, LA0/q;->d:I

    .line 131
    .line 132
    add-int/2addr v14, v15

    .line 133
    iget v15, v12, LA0/q;->e:I

    .line 134
    .line 135
    add-int/2addr v14, v15

    .line 136
    invoke-static {v3, v4}, LL0/a;->d(J)I

    .line 137
    .line 138
    .line 139
    move-result v15

    .line 140
    if-le v14, v15, :cond_11

    .line 141
    .line 142
    if-le v2, v5, :cond_11

    .line 143
    .line 144
    invoke-static {v3, v4}, LL0/a;->d(J)I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    move v3, v9

    .line 149
    :goto_9
    if-ge v3, v13, :cond_f

    .line 150
    .line 151
    invoke-virtual {v12, v3}, LA0/q;->b(I)F

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    int-to-float v14, v2

    .line 156
    cmpl-float v4, v4, v14

    .line 157
    .line 158
    if-lez v4, :cond_e

    .line 159
    .line 160
    move v13, v3

    .line 161
    goto :goto_a

    .line 162
    :cond_e
    add-int/lit8 v3, v3, 0x1

    .line 163
    .line 164
    goto :goto_9

    .line 165
    :cond_f
    :goto_a
    if-lez v13, :cond_10

    .line 166
    .line 167
    iget v2, v0, LH0/a;->b:I

    .line 168
    .line 169
    if-eq v13, v2, :cond_10

    .line 170
    .line 171
    invoke-virtual {v0, v10, v6, v11, v13}, LH0/a;->a(IILandroid/text/TextUtils$TruncateAt;I)LA0/q;

    .line 172
    .line 173
    .line 174
    move-result-object v12

    .line 175
    :cond_10
    iput-object v12, v0, LH0/a;->d:LA0/q;

    .line 176
    .line 177
    goto :goto_b

    .line 178
    :cond_11
    iput-object v12, v0, LH0/a;->d:LA0/q;

    .line 179
    .line 180
    :goto_b
    iget-object v2, v0, LH0/a;->a:LH0/c;

    .line 181
    .line 182
    iget-object v1, v1, Lz0/p;->a:Lz0/j;

    .line 183
    .line 184
    iget-object v1, v1, Lz0/j;->a:LK0/g;

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, LH0/a;->c()F

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    invoke-virtual {v0}, LH0/a;->b()F

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    invoke-static {v1, v3}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 198
    .line 199
    .line 200
    iget-object v1, v2, LH0/c;->g:LH0/d;

    .line 201
    .line 202
    invoke-virtual {v1, v8}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 203
    .line 204
    .line 205
    iget-object v1, v0, LH0/a;->d:LA0/q;

    .line 206
    .line 207
    invoke-virtual {v1}, LA0/q;->d()Ljava/lang/CharSequence;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    instance-of v2, v2, Landroid/text/Spanned;

    .line 212
    .line 213
    if-nez v2, :cond_12

    .line 214
    .line 215
    new-array v1, v9, [LJ0/a;

    .line 216
    .line 217
    goto :goto_c

    .line 218
    :cond_12
    invoke-virtual {v1}, LA0/q;->d()Ljava/lang/CharSequence;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    check-cast v2, Landroid/text/Spanned;

    .line 223
    .line 224
    invoke-virtual {v1}, LA0/q;->d()Ljava/lang/CharSequence;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    const-class v3, LJ0/a;

    .line 233
    .line 234
    invoke-interface {v2, v9, v1, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    check-cast v1, [LJ0/a;

    .line 239
    .line 240
    const-string v2, "brushSpans"

    .line 241
    .line 242
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    array-length v2, v1

    .line 246
    if-nez v2, :cond_13

    .line 247
    .line 248
    new-array v1, v9, [LJ0/a;

    .line 249
    .line 250
    :cond_13
    :goto_c
    array-length v2, v1

    .line 251
    move v3, v9

    .line 252
    :goto_d
    if-ge v3, v2, :cond_14

    .line 253
    .line 254
    aget-object v4, v1, v3

    .line 255
    .line 256
    invoke-virtual {v0}, LH0/a;->c()F

    .line 257
    .line 258
    .line 259
    move-result v6

    .line 260
    invoke-virtual {v0}, LH0/a;->b()F

    .line 261
    .line 262
    .line 263
    move-result v10

    .line 264
    invoke-static {v6, v10}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 265
    .line 266
    .line 267
    move-result-wide v10

    .line 268
    new-instance v6, Ld0/f;

    .line 269
    .line 270
    invoke-direct {v6, v10, v11}, Ld0/f;-><init>(J)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    add-int/lit8 v3, v3, 0x1

    .line 277
    .line 278
    goto :goto_d

    .line 279
    :cond_14
    iget-object v1, v0, LH0/a;->a:LH0/c;

    .line 280
    .line 281
    iget-object v1, v1, LH0/c;->h:Ljava/lang/CharSequence;

    .line 282
    .line 283
    instance-of v2, v1, Landroid/text/Spanned;

    .line 284
    .line 285
    if-nez v2, :cond_15

    .line 286
    .line 287
    sget-object v1, Lff/v;->a:Lff/v;

    .line 288
    .line 289
    goto/16 :goto_16

    .line 290
    .line 291
    :cond_15
    move-object v2, v1

    .line 292
    check-cast v2, Landroid/text/Spanned;

    .line 293
    .line 294
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    const-class v3, LC0/g;

    .line 299
    .line 300
    invoke-interface {v2, v9, v1, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    const-string v3, "getSpans(0, length, PlaceholderSpan::class.java)"

    .line 305
    .line 306
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    new-instance v3, Ljava/util/ArrayList;

    .line 310
    .line 311
    array-length v4, v1

    .line 312
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 313
    .line 314
    .line 315
    array-length v4, v1

    .line 316
    move v6, v9

    .line 317
    :goto_e
    if-ge v6, v4, :cond_20

    .line 318
    .line 319
    aget-object v10, v1, v6

    .line 320
    .line 321
    check-cast v10, LC0/g;

    .line 322
    .line 323
    invoke-interface {v2, v10}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 324
    .line 325
    .line 326
    move-result v11

    .line 327
    invoke-interface {v2, v10}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 328
    .line 329
    .line 330
    move-result v12

    .line 331
    iget-object v13, v0, LH0/a;->d:LA0/q;

    .line 332
    .line 333
    iget-object v13, v13, LA0/q;->b:Landroid/text/Layout;

    .line 334
    .line 335
    invoke-virtual {v13, v11}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 336
    .line 337
    .line 338
    move-result v13

    .line 339
    iget-object v14, v0, LH0/a;->d:LA0/q;

    .line 340
    .line 341
    iget-object v14, v14, LA0/q;->b:Landroid/text/Layout;

    .line 342
    .line 343
    invoke-virtual {v14, v13}, Landroid/text/Layout;->getEllipsisCount(I)I

    .line 344
    .line 345
    .line 346
    move-result v14

    .line 347
    if-lez v14, :cond_16

    .line 348
    .line 349
    iget-object v14, v0, LH0/a;->d:LA0/q;

    .line 350
    .line 351
    iget-object v14, v14, LA0/q;->b:Landroid/text/Layout;

    .line 352
    .line 353
    invoke-virtual {v14, v13}, Landroid/text/Layout;->getEllipsisStart(I)I

    .line 354
    .line 355
    .line 356
    move-result v14

    .line 357
    if-le v12, v14, :cond_16

    .line 358
    .line 359
    move v14, v5

    .line 360
    goto :goto_f

    .line 361
    :cond_16
    move v14, v9

    .line 362
    :goto_f
    iget-object v15, v0, LH0/a;->d:LA0/q;

    .line 363
    .line 364
    iget-object v15, v15, LA0/q;->b:Landroid/text/Layout;

    .line 365
    .line 366
    invoke-virtual {v15, v13}, Landroid/text/Layout;->getEllipsisStart(I)I

    .line 367
    .line 368
    .line 369
    move-result v16

    .line 370
    if-nez v16, :cond_17

    .line 371
    .line 372
    invoke-virtual {v15, v13}, Landroid/text/Layout;->getLineEnd(I)I

    .line 373
    .line 374
    .line 375
    move-result v15

    .line 376
    goto :goto_10

    .line 377
    :cond_17
    invoke-virtual {v15}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 378
    .line 379
    .line 380
    move-result-object v15

    .line 381
    invoke-interface {v15}, Ljava/lang/CharSequence;->length()I

    .line 382
    .line 383
    .line 384
    move-result v15

    .line 385
    :goto_10
    if-le v12, v15, :cond_18

    .line 386
    .line 387
    move v12, v5

    .line 388
    goto :goto_11

    .line 389
    :cond_18
    move v12, v9

    .line 390
    :goto_11
    if-nez v14, :cond_1f

    .line 391
    .line 392
    if-eqz v12, :cond_19

    .line 393
    .line 394
    goto/16 :goto_14

    .line 395
    .line 396
    :cond_19
    iget-object v12, v0, LH0/a;->d:LA0/q;

    .line 397
    .line 398
    iget-object v12, v12, LA0/q;->b:Landroid/text/Layout;

    .line 399
    .line 400
    invoke-virtual {v12, v11}, Landroid/text/Layout;->isRtlCharAt(I)Z

    .line 401
    .line 402
    .line 403
    move-result v12

    .line 404
    if-eqz v12, :cond_1a

    .line 405
    .line 406
    move v12, v7

    .line 407
    goto :goto_12

    .line 408
    :cond_1a
    move v12, v5

    .line 409
    :goto_12
    invoke-static {v12}, LA/f;->f(I)I

    .line 410
    .line 411
    .line 412
    move-result v12

    .line 413
    const-string v14, "PlaceholderSpan is not laid out yet."

    .line 414
    .line 415
    if-eqz v12, :cond_1d

    .line 416
    .line 417
    if-ne v12, v5, :cond_1c

    .line 418
    .line 419
    iget-object v12, v0, LH0/a;->d:LA0/q;

    .line 420
    .line 421
    iget-object v12, v12, LA0/q;->f:Ljava/lang/Object;

    .line 422
    .line 423
    invoke-interface {v12}, Lef/i;->getValue()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v12

    .line 427
    check-cast v12, LA0/b;

    .line 428
    .line 429
    invoke-virtual {v12, v11, v5}, LA0/b;->a(IZ)F

    .line 430
    .line 431
    .line 432
    move-result v11

    .line 433
    iget-boolean v12, v10, LC0/g;->d:Z

    .line 434
    .line 435
    if-eqz v12, :cond_1b

    .line 436
    .line 437
    iget v12, v10, LC0/g;->b:I

    .line 438
    .line 439
    int-to-float v12, v12

    .line 440
    sub-float/2addr v11, v12

    .line 441
    goto :goto_13

    .line 442
    :cond_1b
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 443
    .line 444
    invoke-direct {v1, v14}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    throw v1

    .line 448
    :cond_1c
    new-instance v1, LE5/Q;

    .line 449
    .line 450
    const/16 v2, 0x9

    .line 451
    .line 452
    const/4 v3, 0x0

    .line 453
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 454
    .line 455
    .line 456
    throw v1

    .line 457
    :cond_1d
    iget-object v12, v0, LH0/a;->d:LA0/q;

    .line 458
    .line 459
    iget-object v12, v12, LA0/q;->f:Ljava/lang/Object;

    .line 460
    .line 461
    invoke-interface {v12}, Lef/i;->getValue()Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v12

    .line 465
    check-cast v12, LA0/b;

    .line 466
    .line 467
    invoke-virtual {v12, v11, v5}, LA0/b;->a(IZ)F

    .line 468
    .line 469
    .line 470
    move-result v11

    .line 471
    :goto_13
    iget-boolean v12, v10, LC0/g;->d:Z

    .line 472
    .line 473
    if-eqz v12, :cond_1e

    .line 474
    .line 475
    iget v12, v10, LC0/g;->b:I

    .line 476
    .line 477
    int-to-float v12, v12

    .line 478
    add-float/2addr v12, v11

    .line 479
    iget-object v14, v0, LH0/a;->d:LA0/q;

    .line 480
    .line 481
    invoke-virtual {v14, v13}, LA0/q;->a(I)F

    .line 482
    .line 483
    .line 484
    move-result v13

    .line 485
    invoke-virtual {v10}, LC0/g;->b()I

    .line 486
    .line 487
    .line 488
    move-result v14

    .line 489
    int-to-float v14, v14

    .line 490
    sub-float/2addr v13, v14

    .line 491
    invoke-virtual {v10}, LC0/g;->b()I

    .line 492
    .line 493
    .line 494
    move-result v10

    .line 495
    int-to-float v10, v10

    .line 496
    add-float/2addr v10, v13

    .line 497
    new-instance v14, Ld0/d;

    .line 498
    .line 499
    invoke-direct {v14, v11, v13, v12, v10}, Ld0/d;-><init>(FFFF)V

    .line 500
    .line 501
    .line 502
    goto :goto_15

    .line 503
    :cond_1e
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 504
    .line 505
    invoke-direct {v1, v14}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    throw v1

    .line 509
    :cond_1f
    :goto_14
    move-object v14, v8

    .line 510
    :goto_15
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    add-int/lit8 v6, v6, 0x1

    .line 514
    .line 515
    goto/16 :goto_e

    .line 516
    .line 517
    :cond_20
    move-object v1, v3

    .line 518
    :goto_16
    iput-object v1, v0, LH0/a;->e:Ljava/lang/Object;

    .line 519
    .line 520
    sget-object v1, Lef/j;->c:Lef/j;

    .line 521
    .line 522
    new-instance v2, LA0/p;

    .line 523
    .line 524
    const/4 v3, 0x6

    .line 525
    invoke-direct {v2, v0, v3}, LA0/p;-><init>(Ljava/lang/Object;I)V

    .line 526
    .line 527
    .line 528
    invoke-static {v1, v2}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    .line 529
    .line 530
    .line 531
    return-void

    .line 532
    :cond_21
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 533
    .line 534
    const-string v2, "maxLines should be greater than 0"

    .line 535
    .line 536
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    throw v1

    .line 540
    :cond_22
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 541
    .line 542
    const-string v2, "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."

    .line 543
    .line 544
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 545
    .line 546
    .line 547
    throw v1
.end method


# virtual methods
.method public final a(IILandroid/text/TextUtils$TruncateAt;I)LA0/q;
    .locals 11

    .line 1
    iget-object v0, p0, LH0/a;->a:LH0/c;

    .line 2
    .line 3
    invoke-virtual {p0}, LH0/a;->c()F

    .line 4
    .line 5
    .line 6
    move-result v3

    .line 7
    new-instance v1, LA0/q;

    .line 8
    .line 9
    iget-object v2, v0, LH0/c;->h:Ljava/lang/CharSequence;

    .line 10
    .line 11
    iget-object v4, v0, LH0/c;->g:LH0/d;

    .line 12
    .line 13
    iget v7, v0, LH0/c;->k:I

    .line 14
    .line 15
    iget-object v10, v0, LH0/c;->i:LDd/c;

    .line 16
    .line 17
    move v5, p1

    .line 18
    move v9, p2

    .line 19
    move-object v6, p3

    .line 20
    move v8, p4

    .line 21
    invoke-direct/range {v1 .. v10}, LA0/q;-><init>(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IIILDd/c;)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method

.method public final b()F
    .locals 3

    .line 1
    iget-object v0, p0, LH0/a;->d:LA0/q;

    .line 2
    .line 3
    iget-boolean v1, v0, LA0/q;->a:Z

    .line 4
    .line 5
    iget-object v2, v0, LA0/q;->b:Landroid/text/Layout;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget v1, v0, LA0/q;->c:I

    .line 10
    .line 11
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Landroid/text/Layout;->getLineBottom(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v2}, Landroid/text/Layout;->getHeight()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    :goto_0
    iget v2, v0, LA0/q;->d:I

    .line 23
    .line 24
    add-int/2addr v1, v2

    .line 25
    iget v0, v0, LA0/q;->e:I

    .line 26
    .line 27
    add-int/2addr v1, v0

    .line 28
    int-to-float v0, v1

    .line 29
    return v0
.end method

.method public final c()F
    .locals 2

    .line 1
    iget-wide v0, p0, LH0/a;->c:J

    .line 2
    .line 3
    invoke-static {v0, v1}, LL0/a;->e(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    return v0
.end method
