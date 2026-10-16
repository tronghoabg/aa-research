.class public final enum LVa/u8;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:LVa/u8;

.field public static final enum b:LVa/u8;

.field public static final enum c:LVa/u8;

.field public static final enum d:LVa/u8;

.field public static final enum e:LVa/u8;

.field public static final enum f:LVa/u8;

.field public static final enum g:LVa/u8;

.field public static final enum h:LVa/u8;

.field public static final synthetic i:[LVa/u8;

.field public static final j:[B

.field public static final k:[C

.field public static l:I = 0x0

.field public static m:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 28

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    const/4 v3, 0x2

    .line 4
    const/4 v6, 0x5

    .line 5
    const/4 v7, 0x6

    .line 6
    const/4 v8, 0x3

    .line 7
    const/4 v9, 0x1

    .line 8
    const/4 v10, 0x0

    .line 9
    const/16 v11, 0x49

    .line 10
    .line 11
    new-array v11, v11, [B

    .line 12
    .line 13
    fill-array-data v11, :array_0

    .line 14
    .line 15
    .line 16
    sput-object v11, LVa/u8;->j:[B

    .line 17
    .line 18
    new-array v0, v0, [C

    .line 19
    .line 20
    fill-array-data v0, :array_1

    .line 21
    .line 22
    .line 23
    sput-object v0, LVa/u8;->k:[C

    .line 24
    .line 25
    new-instance v0, LVa/u8;

    .line 26
    .line 27
    invoke-static {v10}, Landroid/os/Process;->getThreadPriority(I)I

    .line 28
    .line 29
    .line 30
    move-result v11

    .line 31
    add-int/lit8 v11, v11, 0x14

    .line 32
    .line 33
    shr-int/2addr v11, v7

    .line 34
    int-to-short v11, v11

    .line 35
    const v12, 0x2763adf6

    .line 36
    .line 37
    .line 38
    invoke-static {v10, v10}, Landroid/view/View;->getDefaultSize(II)I

    .line 39
    .line 40
    .line 41
    move-result v13

    .line 42
    sub-int/2addr v12, v13

    .line 43
    invoke-static {v10}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 44
    .line 45
    .line 46
    move-result v13

    .line 47
    add-int/lit8 v13, v13, -0x5c

    .line 48
    .line 49
    const v14, -0x536ee5a6

    .line 50
    .line 51
    .line 52
    invoke-static {v10, v10}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 53
    .line 54
    .line 55
    move-result v15

    .line 56
    add-int/2addr v15, v14

    .line 57
    const-string v14, ""

    .line 58
    .line 59
    const/16 v4, 0x30

    .line 60
    .line 61
    invoke-static {v14, v4, v10, v10}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 62
    .line 63
    .line 64
    move-result v16

    .line 65
    add-int/lit8 v2, v16, 0x1

    .line 66
    .line 67
    int-to-byte v2, v2

    .line 68
    invoke-static {v12, v13, v2, v11, v15}, LVa/u8;->a(IIBSI)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-direct {v0, v2, v10}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    sput-object v0, LVa/u8;->a:LVa/u8;

    .line 80
    .line 81
    new-instance v2, LVa/u8;

    .line 82
    .line 83
    invoke-static {v14, v14, v10, v10}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    int-to-short v11, v11

    .line 88
    const v12, 0x2763adf3

    .line 89
    .line 90
    .line 91
    invoke-static {v14, v4}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 92
    .line 93
    .line 94
    move-result v13

    .line 95
    sub-int/2addr v12, v13

    .line 96
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 97
    .line 98
    .line 99
    move-result-wide v18

    .line 100
    const-wide/16 v20, 0x0

    .line 101
    .line 102
    cmp-long v13, v18, v20

    .line 103
    .line 104
    rsub-int/lit8 v13, v13, -0x59

    .line 105
    .line 106
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 107
    .line 108
    .line 109
    move-result-wide v18

    .line 110
    cmp-long v15, v18, v20

    .line 111
    .line 112
    const v16, -0x536ee5a1

    .line 113
    .line 114
    .line 115
    add-int v15, v15, v16

    .line 116
    .line 117
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 118
    .line 119
    .line 120
    move-result v16

    .line 121
    shr-int/lit8 v5, v16, 0x10

    .line 122
    .line 123
    int-to-byte v5, v5

    .line 124
    invoke-static {v12, v13, v5, v11, v15}, LVa/u8;->a(IIBSI)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-direct {v2, v5, v9}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 133
    .line 134
    .line 135
    sput-object v2, LVa/u8;->b:LVa/u8;

    .line 136
    .line 137
    new-instance v5, LVa/u8;

    .line 138
    .line 139
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 140
    .line 141
    .line 142
    move-result v11

    .line 143
    const/4 v12, 0x0

    .line 144
    cmpl-float v11, v11, v12

    .line 145
    .line 146
    int-to-short v11, v11

    .line 147
    const v13, 0x2663adfa

    .line 148
    .line 149
    .line 150
    invoke-static {v10, v10, v10}, Landroid/graphics/Color;->rgb(III)I

    .line 151
    .line 152
    .line 153
    move-result v15

    .line 154
    sub-int/2addr v13, v15

    .line 155
    invoke-static {v14, v10}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 156
    .line 157
    .line 158
    move-result v15

    .line 159
    rsub-int/lit8 v15, v15, -0x5c

    .line 160
    .line 161
    const v16, -0x536ee596

    .line 162
    .line 163
    .line 164
    invoke-static {v14, v4, v10, v10}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 165
    .line 166
    .line 167
    move-result v19

    .line 168
    move/from16 v22, v9

    .line 169
    .line 170
    add-int v9, v19, v16

    .line 171
    .line 172
    invoke-static {v10, v10}, Landroid/view/View;->getDefaultSize(II)I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    int-to-byte v1, v1

    .line 177
    invoke-static {v13, v15, v1, v11, v9}, LVa/u8;->a(IIBSI)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-direct {v5, v1, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 186
    .line 187
    .line 188
    sput-object v5, LVa/u8;->c:LVa/u8;

    .line 189
    .line 190
    new-instance v1, LVa/u8;

    .line 191
    .line 192
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    shr-int/lit8 v9, v9, 0x10

    .line 197
    .line 198
    int-to-short v9, v9

    .line 199
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 200
    .line 201
    .line 202
    move-result v11

    .line 203
    shr-int/lit8 v11, v11, 0x10

    .line 204
    .line 205
    const v13, 0x2763adfe

    .line 206
    .line 207
    .line 208
    add-int/2addr v11, v13

    .line 209
    invoke-static {v12, v12}, Landroid/graphics/PointF;->length(FF)F

    .line 210
    .line 211
    .line 212
    move-result v13

    .line 213
    cmpl-float v13, v13, v12

    .line 214
    .line 215
    add-int/lit8 v13, v13, -0x5e

    .line 216
    .line 217
    const v15, -0x536ee590

    .line 218
    .line 219
    .line 220
    invoke-static {v10, v10, v10}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 221
    .line 222
    .line 223
    move-result v19

    .line 224
    sub-int v15, v15, v19

    .line 225
    .line 226
    invoke-static {v14, v4, v10, v10}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 227
    .line 228
    .line 229
    move-result v19

    .line 230
    move/from16 v23, v3

    .line 231
    .line 232
    rsub-int/lit8 v3, v19, -0x1

    .line 233
    .line 234
    int-to-byte v3, v3

    .line 235
    invoke-static {v11, v13, v3, v9, v15}, LVa/u8;->a(IIBSI)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    invoke-direct {v1, v3, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 244
    .line 245
    .line 246
    sput-object v1, LVa/u8;->d:LVa/u8;

    .line 247
    .line 248
    new-instance v3, LVa/u8;

    .line 249
    .line 250
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    shr-int/lit8 v9, v9, 0x10

    .line 255
    .line 256
    int-to-char v9, v9

    .line 257
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 258
    .line 259
    .line 260
    move-result v11

    .line 261
    shr-int/lit8 v11, v11, 0x10

    .line 262
    .line 263
    invoke-static {v10}, Landroid/os/Process;->getThreadPriority(I)I

    .line 264
    .line 265
    .line 266
    move-result v13

    .line 267
    add-int/lit8 v13, v13, 0x14

    .line 268
    .line 269
    shr-int/2addr v13, v7

    .line 270
    const/4 v15, 0x7

    .line 271
    rsub-int/lit8 v13, v13, 0x7

    .line 272
    .line 273
    invoke-static {v11, v13, v9}, LVa/u8;->b(IIC)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v9

    .line 277
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v9

    .line 281
    const/4 v11, 0x4

    .line 282
    invoke-direct {v3, v9, v11}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 283
    .line 284
    .line 285
    sput-object v3, LVa/u8;->e:LVa/u8;

    .line 286
    .line 287
    new-instance v9, LVa/u8;

    .line 288
    .line 289
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 290
    .line 291
    .line 292
    move-result v11

    .line 293
    shr-int/lit8 v11, v11, 0x18

    .line 294
    .line 295
    int-to-short v11, v11

    .line 296
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 297
    .line 298
    .line 299
    move-result v13

    .line 300
    shr-int/lit8 v13, v13, 0x16

    .line 301
    .line 302
    const v19, 0x2763adef

    .line 303
    .line 304
    .line 305
    sub-int v13, v19, v13

    .line 306
    .line 307
    invoke-static {v14, v4, v10}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 308
    .line 309
    .line 310
    move-result v19

    .line 311
    move/from16 v24, v8

    .line 312
    .line 313
    rsub-int/lit8 v8, v19, -0x5f

    .line 314
    .line 315
    const v19, -0x536ee58b

    .line 316
    .line 317
    .line 318
    invoke-static {v14, v14, v10}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 319
    .line 320
    .line 321
    move-result v25

    .line 322
    add-int v4, v25, v19

    .line 323
    .line 324
    move/from16 v19, v15

    .line 325
    .line 326
    invoke-static {v10}, Landroid/graphics/Color;->blue(I)I

    .line 327
    .line 328
    .line 329
    move-result v15

    .line 330
    int-to-byte v15, v15

    .line 331
    invoke-static {v13, v8, v15, v11, v4}, LVa/u8;->a(IIBSI)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    invoke-direct {v9, v4, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 340
    .line 341
    .line 342
    sput-object v9, LVa/u8;->f:LVa/u8;

    .line 343
    .line 344
    new-instance v4, LVa/u8;

    .line 345
    .line 346
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 347
    .line 348
    .line 349
    move-result v8

    .line 350
    cmpl-float v8, v8, v12

    .line 351
    .line 352
    rsub-int/lit8 v8, v8, 0x1

    .line 353
    .line 354
    int-to-short v8, v8

    .line 355
    const v11, 0x2763aded

    .line 356
    .line 357
    .line 358
    invoke-static {v10, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 359
    .line 360
    .line 361
    move-result v13

    .line 362
    add-int/2addr v13, v11

    .line 363
    invoke-static {v14, v14, v10}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 364
    .line 365
    .line 366
    move-result v11

    .line 367
    add-int/lit8 v11, v11, -0x5d

    .line 368
    .line 369
    invoke-static {v10, v12, v12}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 370
    .line 371
    .line 372
    move-result v15

    .line 373
    cmpl-float v12, v15, v12

    .line 374
    .line 375
    const v15, -0x536ee586

    .line 376
    .line 377
    .line 378
    sub-int/2addr v15, v12

    .line 379
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 380
    .line 381
    .line 382
    move-result v12

    .line 383
    shr-int/lit8 v12, v12, 0x10

    .line 384
    .line 385
    int-to-byte v12, v12

    .line 386
    invoke-static {v13, v11, v12, v8, v15}, LVa/u8;->a(IIBSI)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v8

    .line 390
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v8

    .line 394
    invoke-direct {v4, v8, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 395
    .line 396
    .line 397
    sput-object v4, LVa/u8;->g:LVa/u8;

    .line 398
    .line 399
    new-instance v8, LVa/u8;

    .line 400
    .line 401
    invoke-static {v10}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 402
    .line 403
    .line 404
    move-result v11

    .line 405
    int-to-char v11, v11

    .line 406
    invoke-static {v14, v14}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 407
    .line 408
    .line 409
    move-result v12

    .line 410
    rsub-int/lit8 v15, v12, 0x7

    .line 411
    .line 412
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 413
    .line 414
    .line 415
    move-result-wide v12

    .line 416
    cmp-long v12, v12, v20

    .line 417
    .line 418
    rsub-int/lit8 v12, v12, 0x6

    .line 419
    .line 420
    invoke-static {v15, v12, v11}, LVa/u8;->b(IIC)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v11

    .line 424
    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v11

    .line 428
    move/from16 v12, v19

    .line 429
    .line 430
    invoke-direct {v8, v11, v12}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 431
    .line 432
    .line 433
    sput-object v8, LVa/u8;->h:LVa/u8;

    .line 434
    .line 435
    new-instance v11, LVa/u8;

    .line 436
    .line 437
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 438
    .line 439
    .line 440
    move-result v12

    .line 441
    shr-int/lit8 v12, v12, 0x16

    .line 442
    .line 443
    int-to-short v12, v12

    .line 444
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 445
    .line 446
    .line 447
    move-result v13

    .line 448
    shr-int/lit8 v13, v13, 0x10

    .line 449
    .line 450
    const v15, 0x2763ae02

    .line 451
    .line 452
    .line 453
    add-int/2addr v13, v15

    .line 454
    invoke-static {v10, v10}, Landroid/view/View;->getDefaultSize(II)I

    .line 455
    .line 456
    .line 457
    move-result v15

    .line 458
    rsub-int/lit8 v15, v15, -0x5a

    .line 459
    .line 460
    invoke-static {v10}, Landroid/os/Process;->getThreadPriority(I)I

    .line 461
    .line 462
    .line 463
    move-result v19

    .line 464
    add-int/lit8 v19, v19, 0x14

    .line 465
    .line 466
    shr-int/lit8 v19, v19, 0x6

    .line 467
    .line 468
    const v25, -0x536ee580

    .line 469
    .line 470
    .line 471
    move/from16 v27, v6

    .line 472
    .line 473
    add-int v6, v19, v25

    .line 474
    .line 475
    move/from16 v19, v7

    .line 476
    .line 477
    invoke-static {v10}, Landroid/graphics/Color;->blue(I)I

    .line 478
    .line 479
    .line 480
    move-result v7

    .line 481
    int-to-byte v7, v7

    .line 482
    invoke-static {v13, v15, v7, v12, v6}, LVa/u8;->a(IIBSI)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v6

    .line 486
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v6

    .line 490
    const/16 v7, 0x8

    .line 491
    .line 492
    invoke-direct {v11, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 493
    .line 494
    .line 495
    new-instance v6, LVa/u8;

    .line 496
    .line 497
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 498
    .line 499
    .line 500
    move-result-wide v12

    .line 501
    cmp-long v7, v12, v20

    .line 502
    .line 503
    rsub-int/lit8 v7, v7, 0x1

    .line 504
    .line 505
    int-to-short v7, v7

    .line 506
    const v12, 0x2763adf7

    .line 507
    .line 508
    .line 509
    invoke-static {v10, v10}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 510
    .line 511
    .line 512
    move-result v13

    .line 513
    add-int/2addr v13, v12

    .line 514
    invoke-static {v10}, Landroid/os/Process;->getThreadPriority(I)I

    .line 515
    .line 516
    .line 517
    move-result v12

    .line 518
    add-int/lit8 v12, v12, 0x14

    .line 519
    .line 520
    shr-int/lit8 v12, v12, 0x6

    .line 521
    .line 522
    add-int/lit8 v12, v12, -0x58

    .line 523
    .line 524
    const/16 v15, 0x30

    .line 525
    .line 526
    const v25, -0x536ee578

    .line 527
    .line 528
    .line 529
    invoke-static {v14, v15}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 530
    .line 531
    .line 532
    move-result v14

    .line 533
    sub-int v15, v25, v14

    .line 534
    .line 535
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 536
    .line 537
    .line 538
    move-result-wide v25

    .line 539
    cmp-long v14, v25, v20

    .line 540
    .line 541
    rsub-int/lit8 v14, v14, 0x1

    .line 542
    .line 543
    int-to-byte v14, v14

    .line 544
    invoke-static {v13, v12, v14, v7, v15}, LVa/u8;->a(IIBSI)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v7

    .line 548
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v7

    .line 552
    const/16 v12, 0x9

    .line 553
    .line 554
    invoke-direct {v6, v7, v12}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 555
    .line 556
    .line 557
    new-instance v7, LVa/u8;

    .line 558
    .line 559
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 560
    .line 561
    .line 562
    move-result-wide v12

    .line 563
    const-wide/16 v14, -0x1

    .line 564
    .line 565
    cmp-long v12, v12, v14

    .line 566
    .line 567
    add-int/lit8 v12, v12, -0x1

    .line 568
    .line 569
    int-to-short v12, v12

    .line 570
    const v13, 0x2763adf4

    .line 571
    .line 572
    .line 573
    invoke-static {v10, v10, v10}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 574
    .line 575
    .line 576
    move-result v14

    .line 577
    sub-int/2addr v13, v14

    .line 578
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 579
    .line 580
    .line 581
    move-result v14

    .line 582
    shr-int/lit8 v14, v14, 0x10

    .line 583
    .line 584
    add-int/lit8 v14, v14, -0x5d

    .line 585
    .line 586
    invoke-static {v10, v10}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 587
    .line 588
    .line 589
    move-result-wide v25

    .line 590
    cmp-long v15, v25, v20

    .line 591
    .line 592
    const v20, -0x536ee56b

    .line 593
    .line 594
    .line 595
    add-int v15, v15, v20

    .line 596
    .line 597
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 598
    .line 599
    .line 600
    move-result v20

    .line 601
    move/from16 v21, v10

    .line 602
    .line 603
    shr-int/lit8 v10, v20, 0x10

    .line 604
    .line 605
    int-to-byte v10, v10

    .line 606
    invoke-static {v13, v14, v10, v12, v15}, LVa/u8;->a(IIBSI)Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v10

    .line 610
    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v10

    .line 614
    const/16 v12, 0xa

    .line 615
    .line 616
    invoke-direct {v7, v10, v12}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 617
    .line 618
    .line 619
    const/16 v10, 0xb

    .line 620
    .line 621
    new-array v10, v10, [LVa/u8;

    .line 622
    .line 623
    aput-object v0, v10, v21

    .line 624
    .line 625
    aput-object v2, v10, v22

    .line 626
    .line 627
    aput-object v5, v10, v23

    .line 628
    .line 629
    aput-object v1, v10, v24

    .line 630
    .line 631
    const/4 v0, 0x4

    .line 632
    aput-object v3, v10, v0

    .line 633
    .line 634
    aput-object v9, v10, v27

    .line 635
    .line 636
    aput-object v4, v10, v19

    .line 637
    .line 638
    const/4 v0, 0x7

    .line 639
    aput-object v8, v10, v0

    .line 640
    .line 641
    const/16 v16, 0x8

    .line 642
    .line 643
    aput-object v11, v10, v16

    .line 644
    .line 645
    const/16 v18, 0x9

    .line 646
    .line 647
    aput-object v6, v10, v18

    .line 648
    .line 649
    const/16 v17, 0xa

    .line 650
    .line 651
    aput-object v7, v10, v17

    .line 652
    .line 653
    sput-object v10, LVa/u8;->i:[LVa/u8;

    .line 654
    .line 655
    sget v0, LVa/u8;->m:I

    .line 656
    .line 657
    add-int/lit8 v0, v0, 0x31

    .line 658
    .line 659
    rem-int/lit16 v1, v0, 0x80

    .line 660
    .line 661
    sput v1, LVa/u8;->l:I

    .line 662
    .line 663
    rem-int/lit8 v0, v0, 0x2

    .line 664
    .line 665
    if-nez v0, :cond_0

    .line 666
    .line 667
    return-void

    .line 668
    :cond_0
    const/4 v0, 0x0

    .line 669
    throw v0

    .line 670
    nop

    .line 671
    :array_0
    .array-data 1
        -0xet
        0x3t
        -0x8t
        -0x2t
        0x14t
        -0x6t
        0xdt
        -0x4t
        0x3t
        -0x3t
        -0xbt
        0x6t
        0x9t
        0x1t
        -0x5t
        0x3t
        -0x5t
        0x13t
        -0x11t
        0xdt
        -0xbt
        0x1t
        -0x7t
        0x5t
        -0x9t
        -0x2t
        0x1t
        -0x7t
        0xat
        -0x13t
        0x6t
        0xbt
        0xdt
        -0x4t
        -0x7t
        -0x3t
        0x0t
        0xdt
        0x2t
        0x2t
        -0xft
        -0x3t
        0xet
        -0xft
        0xbt
        0x1t
        -0xft
        0x6t
        0x9t
        -0x8t
        0x0t
        -0x2t
        0xct
        -0x1ct
        0x1at
        -0x9t
        0x5t
        -0x3t
        -0x5t
        -0x3t
        0xbt
        -0x15t
        0x8t
        0x5t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data

    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    nop

    .line 713
    :array_1
    .array-data 2
        0x49s
        -0x496as
        0x6de4s
        0x24cds
        -0x24d9s
        -0x6d83s
        0x4942s
        0x43s
        -0x496cs
        0x6df1s
        0x24dbs
        -0x24cds
    .end array-data
.end method

.method public static a(IIBSI)Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, LVa/pb;->J:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x64

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, -0x1

    .line 13
    if-ne p1, v3, :cond_0

    .line 14
    .line 15
    move v3, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v3, 0x0

    .line 18
    :goto_0
    if-eqz v3, :cond_1

    .line 19
    .line 20
    sget-object p1, LVa/u8;->j:[B

    .line 21
    .line 22
    const v4, 0x536ee5a6

    .line 23
    .line 24
    .line 25
    add-int/2addr v4, p4

    .line 26
    aget-byte p1, p1, v4

    .line 27
    .line 28
    add-int/lit8 p1, p1, 0x64

    .line 29
    .line 30
    int-to-byte p1, p1

    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_3

    .line 34
    :cond_1
    :goto_1
    if-lez p1, :cond_2

    .line 35
    .line 36
    add-int/2addr p4, p1

    .line 37
    const v4, -0x536ee5a4

    .line 38
    .line 39
    .line 40
    sub-int/2addr p4, v4

    .line 41
    add-int/2addr p4, v3

    .line 42
    sput p4, LVa/pb;->F:I

    .line 43
    .line 44
    sput-byte p2, LVa/pb;->G:B

    .line 45
    .line 46
    const p2, -0x2763adab

    .line 47
    .line 48
    .line 49
    add-int/2addr p0, p2

    .line 50
    int-to-char p0, p0

    .line 51
    sput-char p0, LVa/pb;->H:C

    .line 52
    .line 53
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    sget-char p0, LVa/pb;->H:C

    .line 57
    .line 58
    sput-char p0, LVa/pb;->I:C

    .line 59
    .line 60
    sput v2, LVa/pb;->E:I

    .line 61
    .line 62
    :goto_2
    sget p0, LVa/pb;->E:I

    .line 63
    .line 64
    if-ge p0, p1, :cond_2

    .line 65
    .line 66
    sget-object p0, LVa/u8;->j:[B

    .line 67
    .line 68
    sget p2, LVa/pb;->F:I

    .line 69
    .line 70
    add-int/lit8 p4, p2, -0x1

    .line 71
    .line 72
    sput p4, LVa/pb;->F:I

    .line 73
    .line 74
    aget-byte p0, p0, p2

    .line 75
    .line 76
    sget-char p2, LVa/pb;->I:C

    .line 77
    .line 78
    add-int/2addr p0, p3

    .line 79
    int-to-byte p0, p0

    .line 80
    sget-byte p4, LVa/pb;->G:B

    .line 81
    .line 82
    xor-int/2addr p0, p4

    .line 83
    add-int/2addr p2, p0

    .line 84
    int-to-char p0, p2

    .line 85
    sput-char p0, LVa/pb;->H:C

    .line 86
    .line 87
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    sget-char p0, LVa/pb;->H:C

    .line 91
    .line 92
    sput-char p0, LVa/pb;->I:C

    .line 93
    .line 94
    sget p0, LVa/pb;->E:I

    .line 95
    .line 96
    add-int/2addr p0, v2

    .line 97
    sput p0, LVa/pb;->E:I

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    return-object p0

    .line 106
    :goto_3
    monitor-exit v0

    .line 107
    throw p0
.end method

.method public static b(IIC)Ljava/lang/String;
    .locals 9

    .line 1
    sget-object v0, LVa/Ab;->u:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-array v1, p1, [C

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    sput v2, LVa/Ab;->t:I

    .line 8
    .line 9
    :goto_0
    sget v2, LVa/Ab;->t:I

    .line 10
    .line 11
    if-ge v2, p1, :cond_0

    .line 12
    .line 13
    sget-object v3, LVa/u8;->k:[C

    .line 14
    .line 15
    add-int v4, p0, v2

    .line 16
    .line 17
    aget-char v3, v3, v4

    .line 18
    .line 19
    int-to-long v3, v3

    .line 20
    int-to-long v5, v2

    .line 21
    const-wide v7, 0x102693d312ffb6d8L    # 7.271232328589461E-231

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    mul-long/2addr v5, v7

    .line 27
    xor-long/2addr v3, v5

    .line 28
    int-to-long v5, p2

    .line 29
    xor-long/2addr v3, v5

    .line 30
    long-to-int v3, v3

    .line 31
    int-to-char v3, v3

    .line 32
    aput-char v3, v1, v2

    .line 33
    .line 34
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    sput v2, LVa/Ab;->t:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 42
    .line 43
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 44
    .line 45
    .line 46
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    return-object p0

    .line 48
    :goto_1
    monitor-exit v0

    .line 49
    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)LVa/u8;
    .locals 2

    .line 1
    sget v0, LVa/u8;->m:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x61

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/u8;->l:I

    .line 8
    .line 9
    const-class v0, LVa/u8;

    .line 10
    .line 11
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, LVa/u8;

    .line 16
    .line 17
    sget v0, LVa/u8;->m:I

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x2f

    .line 20
    .line 21
    rem-int/lit16 v1, v0, 0x80

    .line 22
    .line 23
    sput v1, LVa/u8;->l:I

    .line 24
    .line 25
    rem-int/lit8 v0, v0, 0x2

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const/16 v0, 0x9

    .line 30
    .line 31
    div-int/lit8 v0, v0, 0x0

    .line 32
    .line 33
    :cond_0
    return-object p0
.end method

.method public static values()[LVa/u8;
    .locals 3

    .line 1
    sget v0, LVa/u8;->m:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x57

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/u8;->l:I

    .line 8
    .line 9
    sget-object v0, LVa/u8;->i:[LVa/u8;

    .line 10
    .line 11
    invoke-virtual {v0}, [LVa/u8;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, [LVa/u8;

    .line 16
    .line 17
    sget v1, LVa/u8;->l:I

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x21

    .line 20
    .line 21
    rem-int/lit16 v2, v1, 0x80

    .line 22
    .line 23
    sput v2, LVa/u8;->m:I

    .line 24
    .line 25
    rem-int/lit8 v1, v1, 0x2

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    const/16 v1, 0x14

    .line 30
    .line 31
    div-int/lit8 v1, v1, 0x0

    .line 32
    .line 33
    :cond_0
    return-object v0
.end method
