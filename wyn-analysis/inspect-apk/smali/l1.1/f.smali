.class public Ll1/f;
.super Landroid/view/accessibility/AccessibilityNodeProvider;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lad/L;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ll1/f;->a:I

    .line 1
    invoke-direct {p0}, Landroid/view/accessibility/AccessibilityNodeProvider;-><init>()V

    .line 2
    iput-object p1, p0, Ll1/f;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu0/s;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ll1/f;->a:I

    .line 3
    iput-object p1, p0, Ll1/f;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/view/accessibility/AccessibilityNodeProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public addExtraDataToAccessibilityNodeInfo(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    iget v3, v0, Ll1/f;->a:I

    .line 8
    .line 9
    packed-switch v3, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-super/range {p0 .. p4}, Landroid/view/accessibility/AccessibilityNodeProvider;->addExtraDataToAccessibilityNodeInfo(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    const-string v3, "info"

    .line 17
    .line 18
    move-object/from16 v4, p2

    .line 19
    .line 20
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v3, "extraDataKey"

    .line 24
    .line 25
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v3, v0, Ll1/f;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v3, Lu0/s;

    .line 31
    .line 32
    invoke-virtual {v3}, Lu0/s;->p()Ljava/util/Map;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, Lu0/m0;

    .line 45
    .line 46
    if-eqz v5, :cond_10

    .line 47
    .line 48
    iget-object v5, v5, Lu0/m0;->a:Lx0/k;

    .line 49
    .line 50
    if-nez v5, :cond_0

    .line 51
    .line 52
    goto/16 :goto_9

    .line 53
    .line 54
    :cond_0
    invoke-static {v5}, Lu0/s;->q(Lx0/k;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    sget-object v7, Lx0/f;->a:Lx0/q;

    .line 59
    .line 60
    iget-object v8, v5, Lx0/k;->e:Lx0/g;

    .line 61
    .line 62
    invoke-virtual {v8, v7}, Lx0/g;->a(Lx0/q;)Z

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    if-eqz v9, :cond_f

    .line 67
    .line 68
    if-eqz v2, :cond_f

    .line 69
    .line 70
    const-string v9, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"

    .line 71
    .line 72
    invoke-virtual {v1, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    if-eqz v9, :cond_f

    .line 77
    .line 78
    const-string v9, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX"

    .line 79
    .line 80
    const/4 v10, -0x1

    .line 81
    invoke-virtual {v2, v9, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    const-string v11, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH"

    .line 86
    .line 87
    invoke-virtual {v2, v11, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-lez v2, :cond_e

    .line 92
    .line 93
    if-ltz v9, :cond_e

    .line 94
    .line 95
    if-eqz v6, :cond_1

    .line 96
    .line 97
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    goto :goto_0

    .line 102
    :cond_1
    const v6, 0x7fffffff

    .line 103
    .line 104
    .line 105
    :goto_0
    if-lt v9, v6, :cond_2

    .line 106
    .line 107
    goto/16 :goto_8

    .line 108
    .line 109
    :cond_2
    new-instance v6, Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v8, v7}, Lx0/g;->c(Lx0/q;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    check-cast v7, Lx0/a;

    .line 119
    .line 120
    iget-object v7, v7, Lx0/a;->b:Lef/e;

    .line 121
    .line 122
    check-cast v7, Ltf/l;

    .line 123
    .line 124
    const/4 v8, 0x0

    .line 125
    if-eqz v7, :cond_3

    .line 126
    .line 127
    invoke-interface {v7, v6}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    check-cast v7, Ljava/lang/Boolean;

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    move-object v7, v8

    .line 135
    :goto_1
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 136
    .line 137
    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    if-eqz v7, :cond_10

    .line 142
    .line 143
    const/4 v7, 0x0

    .line 144
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    check-cast v6, Lz0/n;

    .line 149
    .line 150
    new-instance v10, Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 153
    .line 154
    .line 155
    move v11, v7

    .line 156
    :goto_2
    if-ge v11, v2, :cond_c

    .line 157
    .line 158
    add-int v12, v9, v11

    .line 159
    .line 160
    iget-object v13, v6, Lz0/n;->a:Lz0/m;

    .line 161
    .line 162
    iget-object v13, v13, Lz0/m;->a:Lz0/b;

    .line 163
    .line 164
    iget-object v13, v13, Lz0/b;->a:Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result v13

    .line 170
    if-lt v12, v13, :cond_4

    .line 171
    .line 172
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move/from16 v16, v2

    .line 176
    .line 177
    goto/16 :goto_7

    .line 178
    .line 179
    :cond_4
    iget-object v13, v6, Lz0/n;->b:Lz0/d;

    .line 180
    .line 181
    iget-object v14, v13, Lz0/d;->a:LVa/Y7;

    .line 182
    .line 183
    iget-object v14, v14, LVa/Y7;->a:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v14, Lz0/b;

    .line 186
    .line 187
    if-ltz v12, :cond_b

    .line 188
    .line 189
    iget-object v15, v14, Lz0/b;->a:Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 192
    .line 193
    .line 194
    move-result v15

    .line 195
    if-ge v12, v15, :cond_b

    .line 196
    .line 197
    iget-object v13, v13, Lz0/d;->h:Ljava/util/ArrayList;

    .line 198
    .line 199
    invoke-static {v13, v12}, LS3/f;->q(Ljava/util/ArrayList;I)I

    .line 200
    .line 201
    .line 202
    move-result v14

    .line 203
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v13

    .line 207
    check-cast v13, Lz0/f;

    .line 208
    .line 209
    iget-object v14, v13, Lz0/f;->a:LH0/a;

    .line 210
    .line 211
    iget v15, v13, Lz0/f;->b:I

    .line 212
    .line 213
    iget v8, v13, Lz0/f;->c:I

    .line 214
    .line 215
    invoke-static {v12, v15, v8}, Landroid/support/v4/media/session/b;->S(III)I

    .line 216
    .line 217
    .line 218
    move-result v8

    .line 219
    sub-int/2addr v8, v15

    .line 220
    iget-object v12, v14, LH0/a;->d:LA0/q;

    .line 221
    .line 222
    iget-object v14, v12, LA0/q;->f:Ljava/lang/Object;

    .line 223
    .line 224
    invoke-interface {v14}, Lef/i;->getValue()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v14

    .line 228
    check-cast v14, LA0/b;

    .line 229
    .line 230
    const/4 v15, 0x1

    .line 231
    invoke-virtual {v14, v8, v15}, LA0/b;->a(IZ)F

    .line 232
    .line 233
    .line 234
    move-result v14

    .line 235
    add-int/lit8 v7, v8, 0x1

    .line 236
    .line 237
    iget-object v15, v12, LA0/q;->f:Ljava/lang/Object;

    .line 238
    .line 239
    invoke-interface {v15}, Lef/i;->getValue()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v15

    .line 243
    check-cast v15, LA0/b;

    .line 244
    .line 245
    const/4 v0, 0x1

    .line 246
    invoke-virtual {v15, v7, v0}, LA0/b;->a(IZ)F

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    iget-object v7, v12, LA0/q;->b:Landroid/text/Layout;

    .line 251
    .line 252
    invoke-virtual {v7, v8}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 253
    .line 254
    .line 255
    move-result v7

    .line 256
    invoke-virtual {v12, v7}, LA0/q;->c(I)F

    .line 257
    .line 258
    .line 259
    move-result v8

    .line 260
    invoke-virtual {v12, v7}, LA0/q;->b(I)F

    .line 261
    .line 262
    .line 263
    move-result v7

    .line 264
    const/4 v12, 0x0

    .line 265
    iget v13, v13, Lz0/f;->f:F

    .line 266
    .line 267
    invoke-static {v12, v13}, LU8/v0;->f(FF)J

    .line 268
    .line 269
    .line 270
    move-result-wide v12

    .line 271
    new-instance v15, Ld0/d;

    .line 272
    .line 273
    invoke-static {v12, v13}, Ld0/c;->b(J)F

    .line 274
    .line 275
    .line 276
    move-result v16

    .line 277
    add-float v14, v16, v14

    .line 278
    .line 279
    invoke-static {v12, v13}, Ld0/c;->c(J)F

    .line 280
    .line 281
    .line 282
    move-result v16

    .line 283
    add-float v8, v16, v8

    .line 284
    .line 285
    invoke-static {v12, v13}, Ld0/c;->b(J)F

    .line 286
    .line 287
    .line 288
    move-result v16

    .line 289
    add-float v0, v16, v0

    .line 290
    .line 291
    invoke-static {v12, v13}, Ld0/c;->c(J)F

    .line 292
    .line 293
    .line 294
    move-result v12

    .line 295
    add-float/2addr v12, v7

    .line 296
    invoke-direct {v15, v14, v8, v0, v12}, Ld0/d;-><init>(FFFF)V

    .line 297
    .line 298
    .line 299
    iget-object v0, v5, Lx0/k;->g:Lt0/t;

    .line 300
    .line 301
    invoke-virtual {v0}, Lt0/t;->r()Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    if-nez v0, :cond_5

    .line 306
    .line 307
    sget-wide v7, Ld0/c;->b:J

    .line 308
    .line 309
    goto :goto_3

    .line 310
    :cond_5
    invoke-virtual {v5}, Lx0/k;->c()Lt0/y;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-static {v0}, LFe/g;->G(Lr0/k;)J

    .line 315
    .line 316
    .line 317
    move-result-wide v7

    .line 318
    :goto_3
    invoke-virtual {v15, v7, v8}, Ld0/d;->e(J)Ld0/d;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {v5}, Lx0/k;->d()Ld0/d;

    .line 323
    .line 324
    .line 325
    move-result-object v7

    .line 326
    iget v8, v0, Ld0/d;->c:F

    .line 327
    .line 328
    iget v12, v7, Ld0/d;->a:F

    .line 329
    .line 330
    cmpg-float v13, v8, v12

    .line 331
    .line 332
    if-lez v13, :cond_6

    .line 333
    .line 334
    iget v13, v7, Ld0/d;->c:F

    .line 335
    .line 336
    iget v14, v0, Ld0/d;->a:F

    .line 337
    .line 338
    cmpg-float v15, v13, v14

    .line 339
    .line 340
    if-gtz v15, :cond_7

    .line 341
    .line 342
    :cond_6
    move/from16 v16, v2

    .line 343
    .line 344
    goto :goto_4

    .line 345
    :cond_7
    iget v15, v0, Ld0/d;->d:F

    .line 346
    .line 347
    move/from16 v16, v2

    .line 348
    .line 349
    iget v2, v7, Ld0/d;->b:F

    .line 350
    .line 351
    cmpg-float v17, v15, v2

    .line 352
    .line 353
    if-lez v17, :cond_9

    .line 354
    .line 355
    iget v7, v7, Ld0/d;->d:F

    .line 356
    .line 357
    iget v0, v0, Ld0/d;->b:F

    .line 358
    .line 359
    cmpg-float v17, v7, v0

    .line 360
    .line 361
    if-gtz v17, :cond_8

    .line 362
    .line 363
    goto :goto_4

    .line 364
    :cond_8
    new-instance v4, Ld0/d;

    .line 365
    .line 366
    invoke-static {v14, v12}, Ljava/lang/Math;->max(FF)F

    .line 367
    .line 368
    .line 369
    move-result v12

    .line 370
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    invoke-static {v8, v13}, Ljava/lang/Math;->min(FF)F

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    invoke-static {v15, v7}, Ljava/lang/Math;->min(FF)F

    .line 379
    .line 380
    .line 381
    move-result v7

    .line 382
    invoke-direct {v4, v12, v0, v2, v7}, Ld0/d;-><init>(FFFF)V

    .line 383
    .line 384
    .line 385
    goto :goto_5

    .line 386
    :cond_9
    :goto_4
    const/4 v4, 0x0

    .line 387
    :goto_5
    if-eqz v4, :cond_a

    .line 388
    .line 389
    iget v0, v4, Ld0/d;->a:F

    .line 390
    .line 391
    iget v2, v4, Ld0/d;->b:F

    .line 392
    .line 393
    invoke-static {v0, v2}, LU8/v0;->f(FF)J

    .line 394
    .line 395
    .line 396
    move-result-wide v7

    .line 397
    iget-object v0, v3, Lu0/s;->d:Lu0/n;

    .line 398
    .line 399
    invoke-virtual {v0, v7, v8}, Lu0/n;->j(J)J

    .line 400
    .line 401
    .line 402
    move-result-wide v7

    .line 403
    iget v2, v4, Ld0/d;->c:F

    .line 404
    .line 405
    iget v4, v4, Ld0/d;->d:F

    .line 406
    .line 407
    invoke-static {v2, v4}, LU8/v0;->f(FF)J

    .line 408
    .line 409
    .line 410
    move-result-wide v12

    .line 411
    invoke-virtual {v0, v12, v13}, Lu0/n;->j(J)J

    .line 412
    .line 413
    .line 414
    move-result-wide v12

    .line 415
    new-instance v0, Landroid/graphics/RectF;

    .line 416
    .line 417
    invoke-static {v7, v8}, Ld0/c;->b(J)F

    .line 418
    .line 419
    .line 420
    move-result v2

    .line 421
    invoke-static {v7, v8}, Ld0/c;->c(J)F

    .line 422
    .line 423
    .line 424
    move-result v4

    .line 425
    invoke-static {v12, v13}, Ld0/c;->b(J)F

    .line 426
    .line 427
    .line 428
    move-result v7

    .line 429
    invoke-static {v12, v13}, Ld0/c;->c(J)F

    .line 430
    .line 431
    .line 432
    move-result v8

    .line 433
    invoke-direct {v0, v2, v4, v7, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 434
    .line 435
    .line 436
    goto :goto_6

    .line 437
    :cond_a
    const/4 v0, 0x0

    .line 438
    :goto_6
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    :goto_7
    add-int/lit8 v11, v11, 0x1

    .line 442
    .line 443
    move-object/from16 v0, p0

    .line 444
    .line 445
    move-object/from16 v4, p2

    .line 446
    .line 447
    move/from16 v2, v16

    .line 448
    .line 449
    const/4 v7, 0x0

    .line 450
    const/4 v8, 0x0

    .line 451
    goto/16 :goto_2

    .line 452
    .line 453
    :cond_b
    const-string v0, "offset("

    .line 454
    .line 455
    const-string v1, ") is out of bounds [0, "

    .line 456
    .line 457
    invoke-static {v12, v0, v1}, Lpd/f;->l(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    iget-object v1, v14, Lz0/b;->a:Ljava/lang/String;

    .line 462
    .line 463
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 464
    .line 465
    .line 466
    move-result v1

    .line 467
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    const/16 v1, 0x29

    .line 471
    .line 472
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 480
    .line 481
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    throw v1

    .line 489
    :cond_c
    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    const/4 v2, 0x0

    .line 494
    new-array v2, v2, [Landroid/graphics/RectF;

    .line 495
    .line 496
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    if-eqz v2, :cond_d

    .line 501
    .line 502
    check-cast v2, [Landroid/os/Parcelable;

    .line 503
    .line 504
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 505
    .line 506
    .line 507
    goto :goto_9

    .line 508
    :cond_d
    new-instance v0, Ljava/lang/NullPointerException;

    .line 509
    .line 510
    const-string v1, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    .line 511
    .line 512
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    throw v0

    .line 516
    :cond_e
    :goto_8
    const-string v0, "AccessibilityDelegate"

    .line 517
    .line 518
    const-string v1, "Invalid arguments for accessibility character locations"

    .line 519
    .line 520
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 521
    .line 522
    .line 523
    goto :goto_9

    .line 524
    :cond_f
    sget-object v0, Lx0/n;->p:Lx0/q;

    .line 525
    .line 526
    invoke-virtual {v8, v0}, Lx0/g;->a(Lx0/q;)Z

    .line 527
    .line 528
    .line 529
    move-result v3

    .line 530
    if-eqz v3, :cond_10

    .line 531
    .line 532
    if-eqz v2, :cond_10

    .line 533
    .line 534
    const-string v2, "androidx.compose.ui.semantics.testTag"

    .line 535
    .line 536
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    move-result v2

    .line 540
    if-eqz v2, :cond_10

    .line 541
    .line 542
    invoke-static {v8, v0}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    check-cast v0, Ljava/lang/String;

    .line 547
    .line 548
    if-eqz v0, :cond_10

    .line 549
    .line 550
    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    invoke-virtual {v2, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 555
    .line 556
    .line 557
    :cond_10
    :goto_9
    return-void

    .line 558
    nop

    .line 559
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v4, v0, Ll1/f;->b:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v5, 0x1

    .line 9
    iget v6, v0, Ll1/f;->a:I

    .line 10
    .line 11
    packed-switch v6, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v4, Lu0/s;

    .line 15
    .line 16
    iget-object v6, v4, Lu0/s;->d:Lu0/n;

    .line 17
    .line 18
    invoke-virtual {v6}, Lu0/n;->getViewTreeOwners()Lu0/j;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    iget-object v7, v7, Lu0/j;->a:Landroidx/lifecycle/v;

    .line 25
    .line 26
    invoke-interface {v7}, Landroidx/lifecycle/v;->getLifecycle()Landroidx/lifecycle/o;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    invoke-virtual {v7}, Landroidx/lifecycle/o;->b()Landroidx/lifecycle/n;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v7, 0x0

    .line 38
    :goto_0
    sget-object v8, Landroidx/lifecycle/n;->a:Landroidx/lifecycle/n;

    .line 39
    .line 40
    if-ne v7, v8, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    new-instance v8, Ll1/e;

    .line 48
    .line 49
    invoke-direct {v8, v7}, Ll1/e;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4}, Lu0/s;->p()Ljava/util/Map;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    check-cast v9, Lu0/m0;

    .line 65
    .line 66
    if-nez v9, :cond_2

    .line 67
    .line 68
    :goto_1
    const/4 v3, 0x0

    .line 69
    goto/16 :goto_3e

    .line 70
    .line 71
    :cond_2
    const/4 v10, -0x1

    .line 72
    iget-object v11, v9, Lu0/m0;->a:Lx0/k;

    .line 73
    .line 74
    if-ne v1, v10, :cond_4

    .line 75
    .line 76
    sget-object v12, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 77
    .line 78
    invoke-virtual {v6}, Landroid/view/View;->getParentForAccessibility()Landroid/view/ViewParent;

    .line 79
    .line 80
    .line 81
    move-result-object v12

    .line 82
    instance-of v13, v12, Landroid/view/View;

    .line 83
    .line 84
    if-eqz v13, :cond_3

    .line 85
    .line 86
    check-cast v12, Landroid/view/View;

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    const/4 v12, 0x0

    .line 90
    :goto_2
    iput v10, v8, Ll1/e;->b:I

    .line 91
    .line 92
    invoke-virtual {v7, v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;)V

    .line 93
    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_4
    invoke-virtual {v11}, Lx0/k;->g()Lx0/k;

    .line 97
    .line 98
    .line 99
    move-result-object v12

    .line 100
    if-eqz v12, :cond_79

    .line 101
    .line 102
    invoke-virtual {v11}, Lx0/k;->g()Lx0/k;

    .line 103
    .line 104
    .line 105
    move-result-object v12

    .line 106
    invoke-static {v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6}, Lu0/n;->getSemanticsOwner()Lx0/l;

    .line 110
    .line 111
    .line 112
    move-result-object v13

    .line 113
    invoke-virtual {v13}, Lx0/l;->a()Lx0/k;

    .line 114
    .line 115
    .line 116
    move-result-object v13

    .line 117
    iget v13, v13, Lx0/k;->f:I

    .line 118
    .line 119
    iget v12, v12, Lx0/k;->f:I

    .line 120
    .line 121
    if-ne v12, v13, :cond_5

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_5
    move v10, v12

    .line 125
    :goto_3
    iput v10, v8, Ll1/e;->b:I

    .line 126
    .line 127
    invoke-virtual {v7, v6, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;I)V

    .line 128
    .line 129
    .line 130
    :goto_4
    iput v1, v8, Ll1/e;->c:I

    .line 131
    .line 132
    invoke-virtual {v7, v6, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;I)V

    .line 133
    .line 134
    .line 135
    iget-object v9, v9, Lu0/m0;->b:Landroid/graphics/Rect;

    .line 136
    .line 137
    iget v10, v9, Landroid/graphics/Rect;->left:I

    .line 138
    .line 139
    int-to-float v10, v10

    .line 140
    iget v12, v9, Landroid/graphics/Rect;->top:I

    .line 141
    .line 142
    int-to-float v12, v12

    .line 143
    invoke-static {v10, v12}, LU8/v0;->f(FF)J

    .line 144
    .line 145
    .line 146
    move-result-wide v12

    .line 147
    invoke-virtual {v6, v12, v13}, Lu0/n;->j(J)J

    .line 148
    .line 149
    .line 150
    move-result-wide v12

    .line 151
    iget v10, v9, Landroid/graphics/Rect;->right:I

    .line 152
    .line 153
    int-to-float v10, v10

    .line 154
    iget v9, v9, Landroid/graphics/Rect;->bottom:I

    .line 155
    .line 156
    int-to-float v9, v9

    .line 157
    invoke-static {v10, v9}, LU8/v0;->f(FF)J

    .line 158
    .line 159
    .line 160
    move-result-wide v9

    .line 161
    invoke-virtual {v6, v9, v10}, Lu0/n;->j(J)J

    .line 162
    .line 163
    .line 164
    move-result-wide v9

    .line 165
    new-instance v14, Landroid/graphics/Rect;

    .line 166
    .line 167
    invoke-static {v12, v13}, Ld0/c;->b(J)F

    .line 168
    .line 169
    .line 170
    move-result v15

    .line 171
    move-object/from16 v17, v4

    .line 172
    .line 173
    const/16 v16, 0x0

    .line 174
    .line 175
    float-to-double v3, v15

    .line 176
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 177
    .line 178
    .line 179
    move-result-wide v3

    .line 180
    double-to-float v3, v3

    .line 181
    float-to-int v3, v3

    .line 182
    invoke-static {v12, v13}, Ld0/c;->c(J)F

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    float-to-double v12, v4

    .line 187
    invoke-static {v12, v13}, Ljava/lang/Math;->floor(D)D

    .line 188
    .line 189
    .line 190
    move-result-wide v12

    .line 191
    double-to-float v4, v12

    .line 192
    float-to-int v4, v4

    .line 193
    invoke-static {v9, v10}, Ld0/c;->b(J)F

    .line 194
    .line 195
    .line 196
    move-result v12

    .line 197
    float-to-double v12, v12

    .line 198
    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    .line 199
    .line 200
    .line 201
    move-result-wide v12

    .line 202
    double-to-float v12, v12

    .line 203
    float-to-int v12, v12

    .line 204
    invoke-static {v9, v10}, Ld0/c;->c(J)F

    .line 205
    .line 206
    .line 207
    move-result v9

    .line 208
    float-to-double v9, v9

    .line 209
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 210
    .line 211
    .line 212
    move-result-wide v9

    .line 213
    double-to-float v9, v9

    .line 214
    float-to-int v9, v9

    .line 215
    invoke-direct {v14, v3, v4, v12, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v7, v14}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V

    .line 219
    .line 220
    .line 221
    const-string v3, "semanticsNode"

    .line 222
    .line 223
    invoke-static {v11, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    const-string v3, "android.view.View"

    .line 227
    .line 228
    invoke-virtual {v8, v3}, Ll1/e;->j(Ljava/lang/CharSequence;)V

    .line 229
    .line 230
    .line 231
    sget-object v3, Lx0/n;->o:Lx0/q;

    .line 232
    .line 233
    iget-object v4, v11, Lx0/k;->e:Lx0/g;

    .line 234
    .line 235
    invoke-static {v4, v3}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    check-cast v3, Lx0/e;

    .line 240
    .line 241
    const/4 v9, 0x2

    .line 242
    const/4 v10, 0x4

    .line 243
    iget-object v12, v11, Lx0/k;->g:Lt0/t;

    .line 244
    .line 245
    if-eqz v3, :cond_11

    .line 246
    .line 247
    iget-boolean v13, v11, Lx0/k;->c:Z

    .line 248
    .line 249
    if-nez v13, :cond_6

    .line 250
    .line 251
    invoke-virtual {v11, v2}, Lx0/k;->e(Z)Ljava/util/List;

    .line 252
    .line 253
    .line 254
    move-result-object v13

    .line 255
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    .line 256
    .line 257
    .line 258
    move-result v13

    .line 259
    if-eqz v13, :cond_11

    .line 260
    .line 261
    :cond_6
    iget v13, v3, Lx0/e;->a:I

    .line 262
    .line 263
    if-ne v13, v10, :cond_7

    .line 264
    .line 265
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 266
    .line 267
    .line 268
    move-result-object v13

    .line 269
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 270
    .line 271
    .line 272
    move-result-object v13

    .line 273
    const v14, 0x7f130147

    .line 274
    .line 275
    .line 276
    invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v13

    .line 280
    invoke-virtual {v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 281
    .line 282
    .line 283
    move-result-object v14

    .line 284
    const-string v15, "AccessibilityNodeInfo.roleDescription"

    .line 285
    .line 286
    invoke-virtual {v14, v15, v13}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 287
    .line 288
    .line 289
    goto :goto_8

    .line 290
    :cond_7
    const/4 v14, 0x5

    .line 291
    if-nez v13, :cond_8

    .line 292
    .line 293
    const-string v15, "android.widget.Button"

    .line 294
    .line 295
    goto :goto_5

    .line 296
    :cond_8
    if-ne v13, v5, :cond_9

    .line 297
    .line 298
    const-string v15, "android.widget.CheckBox"

    .line 299
    .line 300
    goto :goto_5

    .line 301
    :cond_9
    if-ne v13, v9, :cond_a

    .line 302
    .line 303
    const-string v15, "android.widget.Switch"

    .line 304
    .line 305
    goto :goto_5

    .line 306
    :cond_a
    const/4 v15, 0x3

    .line 307
    if-ne v13, v15, :cond_b

    .line 308
    .line 309
    const-string v15, "android.widget.RadioButton"

    .line 310
    .line 311
    goto :goto_5

    .line 312
    :cond_b
    if-ne v13, v14, :cond_c

    .line 313
    .line 314
    const-string v15, "android.widget.ImageView"

    .line 315
    .line 316
    goto :goto_5

    .line 317
    :cond_c
    move-object/from16 v15, v16

    .line 318
    .line 319
    :goto_5
    if-ne v13, v14, :cond_10

    .line 320
    .line 321
    invoke-virtual {v12}, Lt0/t;->j()Lt0/t;

    .line 322
    .line 323
    .line 324
    move-result-object v13

    .line 325
    :goto_6
    if-eqz v13, :cond_e

    .line 326
    .line 327
    invoke-static {v13}, LS3/f;->v(Lt0/t;)Lx0/h;

    .line 328
    .line 329
    .line 330
    move-result-object v14

    .line 331
    if-eqz v14, :cond_d

    .line 332
    .line 333
    invoke-virtual {v14}, Lx0/h;->j()Lx0/g;

    .line 334
    .line 335
    .line 336
    move-result-object v14

    .line 337
    if-eqz v14, :cond_d

    .line 338
    .line 339
    iget-boolean v14, v14, Lx0/g;->b:Z

    .line 340
    .line 341
    if-ne v14, v5, :cond_d

    .line 342
    .line 343
    goto :goto_7

    .line 344
    :cond_d
    invoke-virtual {v13}, Lt0/t;->j()Lt0/t;

    .line 345
    .line 346
    .line 347
    move-result-object v13

    .line 348
    goto :goto_6

    .line 349
    :cond_e
    move-object/from16 v13, v16

    .line 350
    .line 351
    :goto_7
    if-eqz v13, :cond_f

    .line 352
    .line 353
    iget-boolean v13, v4, Lx0/g;->b:Z

    .line 354
    .line 355
    if-eqz v13, :cond_11

    .line 356
    .line 357
    :cond_f
    invoke-virtual {v8, v15}, Ll1/e;->j(Ljava/lang/CharSequence;)V

    .line 358
    .line 359
    .line 360
    goto :goto_8

    .line 361
    :cond_10
    invoke-virtual {v8, v15}, Ll1/e;->j(Ljava/lang/CharSequence;)V

    .line 362
    .line 363
    .line 364
    :cond_11
    :goto_8
    sget-object v13, Lx0/f;->g:Lx0/q;

    .line 365
    .line 366
    invoke-virtual {v4, v13}, Lx0/g;->a(Lx0/q;)Z

    .line 367
    .line 368
    .line 369
    move-result v13

    .line 370
    if-eqz v13, :cond_12

    .line 371
    .line 372
    const-string v13, "android.widget.EditText"

    .line 373
    .line 374
    invoke-virtual {v8, v13}, Ll1/e;->j(Ljava/lang/CharSequence;)V

    .line 375
    .line 376
    .line 377
    :cond_12
    invoke-virtual {v11}, Lx0/k;->f()Lx0/g;

    .line 378
    .line 379
    .line 380
    move-result-object v13

    .line 381
    sget-object v14, Lx0/n;->q:Lx0/q;

    .line 382
    .line 383
    invoke-virtual {v13, v14}, Lx0/g;->a(Lx0/q;)Z

    .line 384
    .line 385
    .line 386
    move-result v13

    .line 387
    if-eqz v13, :cond_13

    .line 388
    .line 389
    const-string v13, "android.widget.TextView"

    .line 390
    .line 391
    invoke-virtual {v8, v13}, Ll1/e;->j(Ljava/lang/CharSequence;)V

    .line 392
    .line 393
    .line 394
    :cond_13
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 395
    .line 396
    .line 397
    move-result-object v13

    .line 398
    invoke-virtual {v13}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v13

    .line 402
    iget-object v14, v8, Ll1/e;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 403
    .line 404
    invoke-virtual {v14, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPackageName(Ljava/lang/CharSequence;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v11, v5}, Lx0/k;->e(Z)Ljava/util/List;

    .line 408
    .line 409
    .line 410
    move-result-object v13

    .line 411
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 412
    .line 413
    .line 414
    move-result v15

    .line 415
    move v10, v2

    .line 416
    :goto_9
    if-ge v10, v15, :cond_16

    .line 417
    .line 418
    invoke-interface {v13, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v18

    .line 422
    move-object/from16 v9, v18

    .line 423
    .line 424
    check-cast v9, Lx0/k;

    .line 425
    .line 426
    invoke-virtual/range {v17 .. v17}, Lu0/s;->p()Ljava/util/Map;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    move/from16 v19, v5

    .line 431
    .line 432
    iget v5, v9, Lx0/k;->f:I

    .line 433
    .line 434
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 435
    .line 436
    .line 437
    move-result-object v5

    .line 438
    invoke-interface {v2, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v2

    .line 442
    if-eqz v2, :cond_15

    .line 443
    .line 444
    invoke-virtual {v6}, Lu0/n;->getAndroidViewsHandler$ui_release()Lu0/F;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    invoke-virtual {v2}, Lu0/F;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    iget-object v5, v9, Lx0/k;->g:Lt0/t;

    .line 453
    .line 454
    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    check-cast v2, LM0/i;

    .line 459
    .line 460
    if-eqz v2, :cond_14

    .line 461
    .line 462
    invoke-virtual {v7, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;)V

    .line 463
    .line 464
    .line 465
    goto :goto_a

    .line 466
    :cond_14
    iget v2, v9, Lx0/k;->f:I

    .line 467
    .line 468
    invoke-virtual {v14, v6, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V

    .line 469
    .line 470
    .line 471
    :cond_15
    :goto_a
    add-int/lit8 v10, v10, 0x1

    .line 472
    .line 473
    move/from16 v5, v19

    .line 474
    .line 475
    const/4 v2, 0x0

    .line 476
    const/4 v9, 0x2

    .line 477
    goto :goto_9

    .line 478
    :cond_16
    move/from16 v19, v5

    .line 479
    .line 480
    move-object/from16 v2, v17

    .line 481
    .line 482
    iget v5, v2, Lu0/s;->i:I

    .line 483
    .line 484
    if-ne v5, v1, :cond_17

    .line 485
    .line 486
    move/from16 v5, v19

    .line 487
    .line 488
    invoke-virtual {v14, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 489
    .line 490
    .line 491
    sget-object v5, Ll1/c;->g:Ll1/c;

    .line 492
    .line 493
    invoke-virtual {v8, v5}, Ll1/e;->b(Ll1/c;)V

    .line 494
    .line 495
    .line 496
    goto :goto_b

    .line 497
    :cond_17
    const/4 v5, 0x0

    .line 498
    invoke-virtual {v14, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V

    .line 499
    .line 500
    .line 501
    sget-object v5, Ll1/c;->f:Ll1/c;

    .line 502
    .line 503
    invoke-virtual {v8, v5}, Ll1/e;->b(Ll1/c;)V

    .line 504
    .line 505
    .line 506
    :goto_b
    invoke-virtual {v6}, Lu0/n;->getFontFamilyResolver()LE0/e;

    .line 507
    .line 508
    .line 509
    move-result-object v5

    .line 510
    sget-object v9, Lx0/n;->r:Lx0/q;

    .line 511
    .line 512
    invoke-static {v4, v9}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v9

    .line 516
    check-cast v9, Lz0/b;

    .line 517
    .line 518
    if-eqz v9, :cond_18

    .line 519
    .line 520
    invoke-virtual {v6}, Lu0/n;->getDensity()LL0/b;

    .line 521
    .line 522
    .line 523
    move-result-object v10

    .line 524
    invoke-static {v9, v10, v5}, Lr7/e;->Q(Lz0/b;LL0/b;LE0/e;)Landroid/text/SpannableString;

    .line 525
    .line 526
    .line 527
    move-result-object v9

    .line 528
    goto :goto_c

    .line 529
    :cond_18
    move-object/from16 v9, v16

    .line 530
    .line 531
    :goto_c
    invoke-static {v9}, Lu0/s;->C(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 532
    .line 533
    .line 534
    move-result-object v9

    .line 535
    check-cast v9, Landroid/text/SpannableString;

    .line 536
    .line 537
    sget-object v10, Lx0/n;->q:Lx0/q;

    .line 538
    .line 539
    invoke-static {v4, v10}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v10

    .line 543
    check-cast v10, Ljava/util/List;

    .line 544
    .line 545
    if-eqz v10, :cond_19

    .line 546
    .line 547
    invoke-static {v10}, Lff/o;->s0(Ljava/util/List;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v10

    .line 551
    check-cast v10, Lz0/b;

    .line 552
    .line 553
    if-eqz v10, :cond_19

    .line 554
    .line 555
    invoke-virtual {v6}, Lu0/n;->getDensity()LL0/b;

    .line 556
    .line 557
    .line 558
    move-result-object v13

    .line 559
    invoke-static {v10, v13, v5}, Lr7/e;->Q(Lz0/b;LL0/b;LE0/e;)Landroid/text/SpannableString;

    .line 560
    .line 561
    .line 562
    move-result-object v5

    .line 563
    goto :goto_d

    .line 564
    :cond_19
    move-object/from16 v5, v16

    .line 565
    .line 566
    :goto_d
    invoke-static {v5}, Lu0/s;->C(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 567
    .line 568
    .line 569
    move-result-object v5

    .line 570
    check-cast v5, Landroid/text/SpannableString;

    .line 571
    .line 572
    if-eqz v9, :cond_1a

    .line 573
    .line 574
    goto :goto_e

    .line 575
    :cond_1a
    move-object v9, v5

    .line 576
    :goto_e
    invoke-virtual {v8, v9}, Ll1/e;->n(Ljava/lang/CharSequence;)V

    .line 577
    .line 578
    .line 579
    sget-object v5, Lx0/n;->w:Lx0/q;

    .line 580
    .line 581
    invoke-virtual {v4, v5}, Lx0/g;->a(Lx0/q;)Z

    .line 582
    .line 583
    .line 584
    move-result v9

    .line 585
    if-eqz v9, :cond_1b

    .line 586
    .line 587
    const/4 v9, 0x1

    .line 588
    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentInvalid(Z)V

    .line 589
    .line 590
    .line 591
    invoke-static {v4, v5}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v5

    .line 595
    check-cast v5, Ljava/lang/CharSequence;

    .line 596
    .line 597
    invoke-virtual {v14, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setError(Ljava/lang/CharSequence;)V

    .line 598
    .line 599
    .line 600
    :cond_1b
    sget-object v5, Lx0/n;->b:Lx0/q;

    .line 601
    .line 602
    invoke-static {v4, v5}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v5

    .line 606
    check-cast v5, Ljava/lang/CharSequence;

    .line 607
    .line 608
    invoke-virtual {v8, v5}, Ll1/e;->m(Ljava/lang/CharSequence;)V

    .line 609
    .line 610
    .line 611
    sget-object v5, Lx0/n;->u:Lx0/q;

    .line 612
    .line 613
    invoke-static {v4, v5}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v5

    .line 617
    check-cast v5, Ly0/a;

    .line 618
    .line 619
    if-eqz v5, :cond_21

    .line 620
    .line 621
    const/4 v9, 0x1

    .line 622
    invoke-virtual {v14, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 626
    .line 627
    .line 628
    move-result v5

    .line 629
    if-eqz v5, :cond_1f

    .line 630
    .line 631
    if-eq v5, v9, :cond_1d

    .line 632
    .line 633
    const/4 v9, 0x2

    .line 634
    if-eq v5, v9, :cond_1c

    .line 635
    .line 636
    goto :goto_f

    .line 637
    :cond_1c
    invoke-virtual {v8}, Ll1/e;->g()Ljava/lang/CharSequence;

    .line 638
    .line 639
    .line 640
    move-result-object v5

    .line 641
    if-nez v5, :cond_21

    .line 642
    .line 643
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 644
    .line 645
    .line 646
    move-result-object v5

    .line 647
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 648
    .line 649
    .line 650
    move-result-object v5

    .line 651
    const v9, 0x7f1300a8

    .line 652
    .line 653
    .line 654
    invoke-virtual {v5, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v5

    .line 658
    invoke-virtual {v8, v5}, Ll1/e;->m(Ljava/lang/CharSequence;)V

    .line 659
    .line 660
    .line 661
    goto :goto_f

    .line 662
    :cond_1d
    const/4 v5, 0x0

    .line 663
    invoke-virtual {v14, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 664
    .line 665
    .line 666
    if-nez v3, :cond_1e

    .line 667
    .line 668
    goto :goto_f

    .line 669
    :cond_1e
    iget v5, v3, Lx0/e;->a:I

    .line 670
    .line 671
    const/4 v9, 0x2

    .line 672
    if-ne v5, v9, :cond_21

    .line 673
    .line 674
    invoke-virtual {v8}, Ll1/e;->g()Ljava/lang/CharSequence;

    .line 675
    .line 676
    .line 677
    move-result-object v5

    .line 678
    if-nez v5, :cond_21

    .line 679
    .line 680
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 681
    .line 682
    .line 683
    move-result-object v5

    .line 684
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 685
    .line 686
    .line 687
    move-result-object v5

    .line 688
    const v9, 0x7f130122

    .line 689
    .line 690
    .line 691
    invoke-virtual {v5, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v5

    .line 695
    invoke-virtual {v8, v5}, Ll1/e;->m(Ljava/lang/CharSequence;)V

    .line 696
    .line 697
    .line 698
    goto :goto_f

    .line 699
    :cond_1f
    invoke-virtual {v14, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 700
    .line 701
    .line 702
    if-nez v3, :cond_20

    .line 703
    .line 704
    goto :goto_f

    .line 705
    :cond_20
    iget v5, v3, Lx0/e;->a:I

    .line 706
    .line 707
    const/4 v9, 0x2

    .line 708
    if-ne v5, v9, :cond_21

    .line 709
    .line 710
    invoke-virtual {v8}, Ll1/e;->g()Ljava/lang/CharSequence;

    .line 711
    .line 712
    .line 713
    move-result-object v5

    .line 714
    if-nez v5, :cond_21

    .line 715
    .line 716
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 717
    .line 718
    .line 719
    move-result-object v5

    .line 720
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 721
    .line 722
    .line 723
    move-result-object v5

    .line 724
    const v9, 0x7f13012b

    .line 725
    .line 726
    .line 727
    invoke-virtual {v5, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v5

    .line 731
    invoke-virtual {v8, v5}, Ll1/e;->m(Ljava/lang/CharSequence;)V

    .line 732
    .line 733
    .line 734
    :cond_21
    :goto_f
    sget-object v5, Lx0/n;->t:Lx0/q;

    .line 735
    .line 736
    invoke-static {v4, v5}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-result-object v5

    .line 740
    check-cast v5, Ljava/lang/Boolean;

    .line 741
    .line 742
    if-eqz v5, :cond_25

    .line 743
    .line 744
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 745
    .line 746
    .line 747
    move-result v5

    .line 748
    if-nez v3, :cond_23

    .line 749
    .line 750
    :cond_22
    const/4 v9, 0x1

    .line 751
    goto :goto_10

    .line 752
    :cond_23
    iget v3, v3, Lx0/e;->a:I

    .line 753
    .line 754
    const/4 v9, 0x4

    .line 755
    if-ne v3, v9, :cond_22

    .line 756
    .line 757
    invoke-virtual {v7, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSelected(Z)V

    .line 758
    .line 759
    .line 760
    goto :goto_12

    .line 761
    :goto_10
    invoke-virtual {v14, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 762
    .line 763
    .line 764
    invoke-virtual {v14, v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v8}, Ll1/e;->g()Ljava/lang/CharSequence;

    .line 768
    .line 769
    .line 770
    move-result-object v3

    .line 771
    if-nez v3, :cond_25

    .line 772
    .line 773
    if-eqz v5, :cond_24

    .line 774
    .line 775
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 776
    .line 777
    .line 778
    move-result-object v3

    .line 779
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 780
    .line 781
    .line 782
    move-result-object v3

    .line 783
    const v5, 0x7f130142

    .line 784
    .line 785
    .line 786
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    move-result-object v3

    .line 790
    goto :goto_11

    .line 791
    :cond_24
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 792
    .line 793
    .line 794
    move-result-object v3

    .line 795
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 796
    .line 797
    .line 798
    move-result-object v3

    .line 799
    const v5, 0x7f13011d

    .line 800
    .line 801
    .line 802
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v3

    .line 806
    :goto_11
    invoke-virtual {v8, v3}, Ll1/e;->m(Ljava/lang/CharSequence;)V

    .line 807
    .line 808
    .line 809
    :cond_25
    :goto_12
    iget-boolean v3, v4, Lx0/g;->b:Z

    .line 810
    .line 811
    if-eqz v3, :cond_26

    .line 812
    .line 813
    const/4 v5, 0x0

    .line 814
    invoke-virtual {v11, v5}, Lx0/k;->e(Z)Ljava/util/List;

    .line 815
    .line 816
    .line 817
    move-result-object v3

    .line 818
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 819
    .line 820
    .line 821
    move-result v3

    .line 822
    if-eqz v3, :cond_28

    .line 823
    .line 824
    :cond_26
    sget-object v3, Lx0/n;->a:Lx0/q;

    .line 825
    .line 826
    invoke-static {v4, v3}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v3

    .line 830
    check-cast v3, Ljava/util/List;

    .line 831
    .line 832
    if-eqz v3, :cond_27

    .line 833
    .line 834
    invoke-static {v3}, Lff/o;->s0(Ljava/util/List;)Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    move-result-object v3

    .line 838
    check-cast v3, Ljava/lang/String;

    .line 839
    .line 840
    goto :goto_13

    .line 841
    :cond_27
    move-object/from16 v3, v16

    .line 842
    .line 843
    :goto_13
    invoke-virtual {v14, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 844
    .line 845
    .line 846
    :cond_28
    iget-boolean v3, v4, Lx0/g;->b:Z

    .line 847
    .line 848
    const/16 v5, 0x1c

    .line 849
    .line 850
    if-eqz v3, :cond_2a

    .line 851
    .line 852
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 853
    .line 854
    if-lt v3, v5, :cond_29

    .line 855
    .line 856
    const/4 v9, 0x1

    .line 857
    invoke-static {v14, v9}, Ldb/b;->w(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 858
    .line 859
    .line 860
    goto :goto_14

    .line 861
    :cond_29
    const/4 v9, 0x1

    .line 862
    invoke-virtual {v8, v9, v9}, Ll1/e;->i(IZ)V

    .line 863
    .line 864
    .line 865
    :cond_2a
    :goto_14
    sget-object v3, Lx0/n;->p:Lx0/q;

    .line 866
    .line 867
    invoke-static {v4, v3}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    move-result-object v3

    .line 871
    check-cast v3, Ljava/lang/String;

    .line 872
    .line 873
    if-eqz v3, :cond_2d

    .line 874
    .line 875
    move-object v9, v11

    .line 876
    :goto_15
    if-eqz v9, :cond_2c

    .line 877
    .line 878
    sget-object v10, Lx0/o;->a:Lx0/q;

    .line 879
    .line 880
    iget-object v13, v9, Lx0/k;->e:Lx0/g;

    .line 881
    .line 882
    invoke-virtual {v13, v10}, Lx0/g;->a(Lx0/q;)Z

    .line 883
    .line 884
    .line 885
    move-result v15

    .line 886
    if-eqz v15, :cond_2b

    .line 887
    .line 888
    invoke-virtual {v13, v10}, Lx0/g;->c(Lx0/q;)Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v9

    .line 892
    check-cast v9, Ljava/lang/Boolean;

    .line 893
    .line 894
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 895
    .line 896
    .line 897
    move-result v9

    .line 898
    goto :goto_16

    .line 899
    :cond_2b
    invoke-virtual {v9}, Lx0/k;->g()Lx0/k;

    .line 900
    .line 901
    .line 902
    move-result-object v9

    .line 903
    goto :goto_15

    .line 904
    :cond_2c
    const/4 v9, 0x0

    .line 905
    :goto_16
    if-eqz v9, :cond_2d

    .line 906
    .line 907
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setViewIdResourceName(Ljava/lang/String;)V

    .line 908
    .line 909
    .line 910
    :cond_2d
    sget-object v3, Lx0/n;->h:Lx0/q;

    .line 911
    .line 912
    invoke-static {v4, v3}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v3

    .line 916
    check-cast v3, Lef/C;

    .line 917
    .line 918
    if-eqz v3, :cond_2f

    .line 919
    .line 920
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 921
    .line 922
    if-lt v3, v5, :cond_2e

    .line 923
    .line 924
    const/4 v9, 0x1

    .line 925
    invoke-static {v14, v9}, Ldb/b;->C(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 926
    .line 927
    .line 928
    goto :goto_17

    .line 929
    :cond_2e
    const/4 v3, 0x2

    .line 930
    const/4 v9, 0x1

    .line 931
    invoke-virtual {v8, v3, v9}, Ll1/e;->i(IZ)V

    .line 932
    .line 933
    .line 934
    :cond_2f
    :goto_17
    invoke-virtual {v11}, Lx0/k;->f()Lx0/g;

    .line 935
    .line 936
    .line 937
    move-result-object v3

    .line 938
    sget-object v9, Lx0/n;->v:Lx0/q;

    .line 939
    .line 940
    invoke-virtual {v3, v9}, Lx0/g;->a(Lx0/q;)Z

    .line 941
    .line 942
    .line 943
    move-result v3

    .line 944
    invoke-virtual {v7, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPassword(Z)V

    .line 945
    .line 946
    .line 947
    sget-object v3, Lx0/f;->g:Lx0/q;

    .line 948
    .line 949
    invoke-virtual {v4, v3}, Lx0/g;->a(Lx0/q;)Z

    .line 950
    .line 951
    .line 952
    move-result v9

    .line 953
    invoke-virtual {v7, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEditable(Z)V

    .line 954
    .line 955
    .line 956
    invoke-static {v11}, Lu0/Q;->a(Lx0/k;)Z

    .line 957
    .line 958
    .line 959
    move-result v9

    .line 960
    invoke-virtual {v14, v9}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    .line 961
    .line 962
    .line 963
    sget-object v9, Lx0/n;->k:Lx0/q;

    .line 964
    .line 965
    invoke-virtual {v4, v9}, Lx0/g;->a(Lx0/q;)Z

    .line 966
    .line 967
    .line 968
    move-result v10

    .line 969
    invoke-virtual {v14, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocusable(Z)V

    .line 970
    .line 971
    .line 972
    invoke-virtual {v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocusable()Z

    .line 973
    .line 974
    .line 975
    move-result v10

    .line 976
    if-eqz v10, :cond_31

    .line 977
    .line 978
    invoke-virtual {v4, v9}, Lx0/g;->c(Lx0/q;)Ljava/lang/Object;

    .line 979
    .line 980
    .line 981
    move-result-object v10

    .line 982
    check-cast v10, Ljava/lang/Boolean;

    .line 983
    .line 984
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 985
    .line 986
    .line 987
    move-result v10

    .line 988
    invoke-virtual {v14, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocused(Z)V

    .line 989
    .line 990
    .line 991
    invoke-virtual {v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    .line 992
    .line 993
    .line 994
    move-result v10

    .line 995
    if-eqz v10, :cond_30

    .line 996
    .line 997
    const/4 v10, 0x2

    .line 998
    invoke-virtual {v8, v10}, Ll1/e;->a(I)V

    .line 999
    .line 1000
    .line 1001
    goto :goto_18

    .line 1002
    :cond_30
    const/4 v10, 0x1

    .line 1003
    invoke-virtual {v8, v10}, Ll1/e;->a(I)V

    .line 1004
    .line 1005
    .line 1006
    :cond_31
    :goto_18
    iget-boolean v10, v11, Lx0/k;->c:Z

    .line 1007
    .line 1008
    if-eqz v10, :cond_33

    .line 1009
    .line 1010
    invoke-virtual {v11}, Lx0/k;->g()Lx0/k;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v10

    .line 1014
    if-eqz v10, :cond_32

    .line 1015
    .line 1016
    invoke-virtual {v10}, Lx0/k;->c()Lt0/y;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v10

    .line 1020
    goto :goto_19

    .line 1021
    :cond_32
    move-object/from16 v10, v16

    .line 1022
    .line 1023
    goto :goto_19

    .line 1024
    :cond_33
    invoke-virtual {v11}, Lx0/k;->c()Lt0/y;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v10

    .line 1028
    :goto_19
    if-eqz v10, :cond_34

    .line 1029
    .line 1030
    invoke-virtual {v10}, Lt0/y;->T()Z

    .line 1031
    .line 1032
    .line 1033
    move-result v10

    .line 1034
    goto :goto_1a

    .line 1035
    :cond_34
    const/4 v10, 0x0

    .line 1036
    :goto_1a
    if-nez v10, :cond_35

    .line 1037
    .line 1038
    sget-object v10, Lx0/n;->l:Lx0/q;

    .line 1039
    .line 1040
    invoke-static {v4, v10}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v10

    .line 1044
    if-nez v10, :cond_35

    .line 1045
    .line 1046
    const/4 v10, 0x1

    .line 1047
    goto :goto_1b

    .line 1048
    :cond_35
    const/4 v10, 0x0

    .line 1049
    :goto_1b
    invoke-virtual {v14, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 1050
    .line 1051
    .line 1052
    sget-object v10, Lx0/n;->j:Lx0/q;

    .line 1053
    .line 1054
    invoke-static {v4, v10}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v10

    .line 1058
    if-nez v10, :cond_78

    .line 1059
    .line 1060
    const/4 v10, 0x0

    .line 1061
    invoke-virtual {v14, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 1062
    .line 1063
    .line 1064
    sget-object v10, Lx0/f;->b:Lx0/q;

    .line 1065
    .line 1066
    invoke-static {v4, v10}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v10

    .line 1070
    check-cast v10, Lx0/a;

    .line 1071
    .line 1072
    if-eqz v10, :cond_36

    .line 1073
    .line 1074
    sget-object v13, Lx0/n;->t:Lx0/q;

    .line 1075
    .line 1076
    invoke-static {v4, v13}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v13

    .line 1080
    sget-object v15, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1081
    .line 1082
    invoke-static {v13, v15}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1083
    .line 1084
    .line 1085
    move-result v13

    .line 1086
    const/16 v19, 0x1

    .line 1087
    .line 1088
    xor-int/lit8 v15, v13, 0x1

    .line 1089
    .line 1090
    invoke-virtual {v14, v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 1091
    .line 1092
    .line 1093
    invoke-static {v11}, Lu0/Q;->a(Lx0/k;)Z

    .line 1094
    .line 1095
    .line 1096
    move-result v15

    .line 1097
    if-eqz v15, :cond_36

    .line 1098
    .line 1099
    if-nez v13, :cond_36

    .line 1100
    .line 1101
    new-instance v13, Ll1/c;

    .line 1102
    .line 1103
    const/16 v15, 0x10

    .line 1104
    .line 1105
    iget-object v10, v10, Lx0/a;->a:Ljava/lang/String;

    .line 1106
    .line 1107
    invoke-direct {v13, v15, v10}, Ll1/c;-><init>(ILjava/lang/String;)V

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual {v8, v13}, Ll1/e;->b(Ll1/c;)V

    .line 1111
    .line 1112
    .line 1113
    :cond_36
    const/4 v10, 0x0

    .line 1114
    invoke-virtual {v14, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    .line 1115
    .line 1116
    .line 1117
    sget-object v10, Lx0/f;->c:Lx0/q;

    .line 1118
    .line 1119
    invoke-static {v4, v10}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v10

    .line 1123
    check-cast v10, Lx0/a;

    .line 1124
    .line 1125
    const/16 v13, 0x20

    .line 1126
    .line 1127
    if-eqz v10, :cond_37

    .line 1128
    .line 1129
    const/4 v15, 0x1

    .line 1130
    invoke-virtual {v14, v15}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V

    .line 1131
    .line 1132
    .line 1133
    invoke-static {v11}, Lu0/Q;->a(Lx0/k;)Z

    .line 1134
    .line 1135
    .line 1136
    move-result v15

    .line 1137
    if-eqz v15, :cond_37

    .line 1138
    .line 1139
    new-instance v15, Ll1/c;

    .line 1140
    .line 1141
    iget-object v10, v10, Lx0/a;->a:Ljava/lang/String;

    .line 1142
    .line 1143
    invoke-direct {v15, v13, v10}, Ll1/c;-><init>(ILjava/lang/String;)V

    .line 1144
    .line 1145
    .line 1146
    invoke-virtual {v8, v15}, Ll1/e;->b(Ll1/c;)V

    .line 1147
    .line 1148
    .line 1149
    :cond_37
    sget-object v10, Lx0/f;->h:Lx0/q;

    .line 1150
    .line 1151
    invoke-static {v4, v10}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v10

    .line 1155
    check-cast v10, Lx0/a;

    .line 1156
    .line 1157
    if-eqz v10, :cond_38

    .line 1158
    .line 1159
    new-instance v15, Ll1/c;

    .line 1160
    .line 1161
    const/16 v13, 0x4000

    .line 1162
    .line 1163
    iget-object v10, v10, Lx0/a;->a:Ljava/lang/String;

    .line 1164
    .line 1165
    invoke-direct {v15, v13, v10}, Ll1/c;-><init>(ILjava/lang/String;)V

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual {v8, v15}, Ll1/e;->b(Ll1/c;)V

    .line 1169
    .line 1170
    .line 1171
    :cond_38
    invoke-static {v11}, Lu0/Q;->a(Lx0/k;)Z

    .line 1172
    .line 1173
    .line 1174
    move-result v10

    .line 1175
    if-eqz v10, :cond_3c

    .line 1176
    .line 1177
    invoke-static {v4, v3}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v10

    .line 1181
    check-cast v10, Lx0/a;

    .line 1182
    .line 1183
    if-eqz v10, :cond_39

    .line 1184
    .line 1185
    new-instance v13, Ll1/c;

    .line 1186
    .line 1187
    const/high16 v15, 0x200000

    .line 1188
    .line 1189
    iget-object v10, v10, Lx0/a;->a:Ljava/lang/String;

    .line 1190
    .line 1191
    invoke-direct {v13, v15, v10}, Ll1/c;-><init>(ILjava/lang/String;)V

    .line 1192
    .line 1193
    .line 1194
    invoke-virtual {v8, v13}, Ll1/e;->b(Ll1/c;)V

    .line 1195
    .line 1196
    .line 1197
    :cond_39
    sget-object v10, Lx0/f;->i:Lx0/q;

    .line 1198
    .line 1199
    invoke-static {v4, v10}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v10

    .line 1203
    check-cast v10, Lx0/a;

    .line 1204
    .line 1205
    if-eqz v10, :cond_3a

    .line 1206
    .line 1207
    new-instance v13, Ll1/c;

    .line 1208
    .line 1209
    const/high16 v15, 0x10000

    .line 1210
    .line 1211
    iget-object v10, v10, Lx0/a;->a:Ljava/lang/String;

    .line 1212
    .line 1213
    invoke-direct {v13, v15, v10}, Ll1/c;-><init>(ILjava/lang/String;)V

    .line 1214
    .line 1215
    .line 1216
    invoke-virtual {v8, v13}, Ll1/e;->b(Ll1/c;)V

    .line 1217
    .line 1218
    .line 1219
    :cond_3a
    sget-object v10, Lx0/f;->j:Lx0/q;

    .line 1220
    .line 1221
    invoke-static {v4, v10}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v10

    .line 1225
    check-cast v10, Lx0/a;

    .line 1226
    .line 1227
    if-eqz v10, :cond_3c

    .line 1228
    .line 1229
    invoke-virtual {v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z

    .line 1230
    .line 1231
    .line 1232
    move-result v13

    .line 1233
    if-eqz v13, :cond_3c

    .line 1234
    .line 1235
    invoke-virtual {v6}, Lu0/n;->getClipboardManager()Lu0/h;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v13

    .line 1239
    iget-object v13, v13, Lu0/h;->a:Landroid/content/ClipboardManager;

    .line 1240
    .line 1241
    invoke-virtual {v13}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v13

    .line 1245
    if-eqz v13, :cond_3b

    .line 1246
    .line 1247
    const-string v15, "text/plain"

    .line 1248
    .line 1249
    invoke-virtual {v13, v15}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    .line 1250
    .line 1251
    .line 1252
    move-result v13

    .line 1253
    goto :goto_1c

    .line 1254
    :cond_3b
    const/4 v13, 0x0

    .line 1255
    :goto_1c
    if-eqz v13, :cond_3c

    .line 1256
    .line 1257
    new-instance v13, Ll1/c;

    .line 1258
    .line 1259
    const v15, 0x8000

    .line 1260
    .line 1261
    .line 1262
    iget-object v10, v10, Lx0/a;->a:Ljava/lang/String;

    .line 1263
    .line 1264
    invoke-direct {v13, v15, v10}, Ll1/c;-><init>(ILjava/lang/String;)V

    .line 1265
    .line 1266
    .line 1267
    invoke-virtual {v8, v13}, Ll1/e;->b(Ll1/c;)V

    .line 1268
    .line 1269
    .line 1270
    :cond_3c
    invoke-static {v11}, Lu0/s;->q(Lx0/k;)Ljava/lang/String;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v10

    .line 1274
    if-eqz v10, :cond_3e

    .line 1275
    .line 1276
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 1277
    .line 1278
    .line 1279
    move-result v10

    .line 1280
    if-nez v10, :cond_3d

    .line 1281
    .line 1282
    goto :goto_1d

    .line 1283
    :cond_3d
    const/4 v10, 0x0

    .line 1284
    goto :goto_1e

    .line 1285
    :cond_3e
    :goto_1d
    const/4 v10, 0x1

    .line 1286
    :goto_1e
    if-nez v10, :cond_49

    .line 1287
    .line 1288
    invoke-virtual {v2, v11}, Lu0/s;->o(Lx0/k;)I

    .line 1289
    .line 1290
    .line 1291
    move-result v10

    .line 1292
    invoke-virtual {v2, v11}, Lu0/s;->n(Lx0/k;)I

    .line 1293
    .line 1294
    .line 1295
    move-result v13

    .line 1296
    invoke-virtual {v7, v10, v13}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTextSelection(II)V

    .line 1297
    .line 1298
    .line 1299
    sget-object v10, Lx0/f;->f:Lx0/q;

    .line 1300
    .line 1301
    invoke-static {v4, v10}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v10

    .line 1305
    check-cast v10, Lx0/a;

    .line 1306
    .line 1307
    new-instance v13, Ll1/c;

    .line 1308
    .line 1309
    if-eqz v10, :cond_3f

    .line 1310
    .line 1311
    iget-object v10, v10, Lx0/a;->a:Ljava/lang/String;

    .line 1312
    .line 1313
    goto :goto_1f

    .line 1314
    :cond_3f
    move-object/from16 v10, v16

    .line 1315
    .line 1316
    :goto_1f
    const/high16 v15, 0x20000

    .line 1317
    .line 1318
    invoke-direct {v13, v15, v10}, Ll1/c;-><init>(ILjava/lang/String;)V

    .line 1319
    .line 1320
    .line 1321
    invoke-virtual {v8, v13}, Ll1/e;->b(Ll1/c;)V

    .line 1322
    .line 1323
    .line 1324
    const/16 v10, 0x100

    .line 1325
    .line 1326
    invoke-virtual {v8, v10}, Ll1/e;->a(I)V

    .line 1327
    .line 1328
    .line 1329
    const/16 v10, 0x200

    .line 1330
    .line 1331
    invoke-virtual {v8, v10}, Ll1/e;->a(I)V

    .line 1332
    .line 1333
    .line 1334
    const/16 v10, 0xb

    .line 1335
    .line 1336
    invoke-virtual {v14, v10}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    .line 1337
    .line 1338
    .line 1339
    sget-object v10, Lx0/n;->a:Lx0/q;

    .line 1340
    .line 1341
    invoke-static {v4, v10}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v10

    .line 1345
    check-cast v10, Ljava/util/List;

    .line 1346
    .line 1347
    check-cast v10, Ljava/util/Collection;

    .line 1348
    .line 1349
    if-eqz v10, :cond_41

    .line 1350
    .line 1351
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 1352
    .line 1353
    .line 1354
    move-result v10

    .line 1355
    if-eqz v10, :cond_40

    .line 1356
    .line 1357
    goto :goto_20

    .line 1358
    :cond_40
    const/4 v10, 0x0

    .line 1359
    goto :goto_21

    .line 1360
    :cond_41
    :goto_20
    const/4 v10, 0x1

    .line 1361
    :goto_21
    if-eqz v10, :cond_49

    .line 1362
    .line 1363
    sget-object v10, Lx0/f;->a:Lx0/q;

    .line 1364
    .line 1365
    invoke-virtual {v4, v10}, Lx0/g;->a(Lx0/q;)Z

    .line 1366
    .line 1367
    .line 1368
    move-result v10

    .line 1369
    if-eqz v10, :cond_49

    .line 1370
    .line 1371
    invoke-virtual {v4, v3}, Lx0/g;->a(Lx0/q;)Z

    .line 1372
    .line 1373
    .line 1374
    move-result v3

    .line 1375
    if-eqz v3, :cond_42

    .line 1376
    .line 1377
    invoke-static {v4, v9}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v3

    .line 1381
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1382
    .line 1383
    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1384
    .line 1385
    .line 1386
    move-result v3

    .line 1387
    if-nez v3, :cond_42

    .line 1388
    .line 1389
    goto :goto_27

    .line 1390
    :cond_42
    invoke-virtual {v12}, Lt0/t;->j()Lt0/t;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v3

    .line 1394
    :goto_22
    if-eqz v3, :cond_46

    .line 1395
    .line 1396
    invoke-static {v3}, LS3/f;->v(Lt0/t;)Lx0/h;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v10

    .line 1400
    if-eqz v10, :cond_43

    .line 1401
    .line 1402
    invoke-virtual {v10}, Lx0/h;->j()Lx0/g;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v10

    .line 1406
    goto :goto_23

    .line 1407
    :cond_43
    move-object/from16 v10, v16

    .line 1408
    .line 1409
    :goto_23
    if-eqz v10, :cond_44

    .line 1410
    .line 1411
    iget-boolean v12, v10, Lx0/g;->b:Z

    .line 1412
    .line 1413
    const/4 v15, 0x1

    .line 1414
    if-ne v12, v15, :cond_44

    .line 1415
    .line 1416
    sget-object v12, Lx0/f;->g:Lx0/q;

    .line 1417
    .line 1418
    invoke-virtual {v10, v12}, Lx0/g;->a(Lx0/q;)Z

    .line 1419
    .line 1420
    .line 1421
    move-result v10

    .line 1422
    if-eqz v10, :cond_44

    .line 1423
    .line 1424
    const/4 v10, 0x1

    .line 1425
    goto :goto_24

    .line 1426
    :cond_44
    const/4 v10, 0x0

    .line 1427
    :goto_24
    if-eqz v10, :cond_45

    .line 1428
    .line 1429
    goto :goto_25

    .line 1430
    :cond_45
    invoke-virtual {v3}, Lt0/t;->j()Lt0/t;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v3

    .line 1434
    goto :goto_22

    .line 1435
    :cond_46
    move-object/from16 v3, v16

    .line 1436
    .line 1437
    :goto_25
    if-eqz v3, :cond_48

    .line 1438
    .line 1439
    invoke-static {v3}, LS3/f;->v(Lt0/t;)Lx0/h;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v3

    .line 1443
    if-eqz v3, :cond_47

    .line 1444
    .line 1445
    invoke-virtual {v3}, Lx0/h;->j()Lx0/g;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v3

    .line 1449
    if-eqz v3, :cond_47

    .line 1450
    .line 1451
    invoke-static {v3, v9}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v3

    .line 1455
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1456
    .line 1457
    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1458
    .line 1459
    .line 1460
    move-result v3

    .line 1461
    goto :goto_26

    .line 1462
    :cond_47
    const/4 v3, 0x0

    .line 1463
    :goto_26
    if-nez v3, :cond_48

    .line 1464
    .line 1465
    :goto_27
    const/4 v3, 0x1

    .line 1466
    goto :goto_28

    .line 1467
    :cond_48
    const/4 v3, 0x0

    .line 1468
    :goto_28
    if-nez v3, :cond_49

    .line 1469
    .line 1470
    invoke-virtual {v7}, Landroid/view/accessibility/AccessibilityNodeInfo;->getMovementGranularities()I

    .line 1471
    .line 1472
    .line 1473
    move-result v3

    .line 1474
    or-int/lit8 v3, v3, 0x14

    .line 1475
    .line 1476
    invoke-virtual {v14, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V

    .line 1477
    .line 1478
    .line 1479
    :cond_49
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1480
    .line 1481
    const/16 v9, 0x1a

    .line 1482
    .line 1483
    if-lt v3, v9, :cond_4e

    .line 1484
    .line 1485
    new-instance v9, Ljava/util/ArrayList;

    .line 1486
    .line 1487
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1488
    .line 1489
    .line 1490
    invoke-virtual {v8}, Ll1/e;->h()Ljava/lang/CharSequence;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v10

    .line 1494
    if-eqz v10, :cond_4b

    .line 1495
    .line 1496
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 1497
    .line 1498
    .line 1499
    move-result v10

    .line 1500
    if-nez v10, :cond_4a

    .line 1501
    .line 1502
    goto :goto_29

    .line 1503
    :cond_4a
    const/4 v10, 0x0

    .line 1504
    goto :goto_2a

    .line 1505
    :cond_4b
    :goto_29
    const/4 v10, 0x1

    .line 1506
    :goto_2a
    if-nez v10, :cond_4c

    .line 1507
    .line 1508
    sget-object v10, Lx0/f;->a:Lx0/q;

    .line 1509
    .line 1510
    invoke-virtual {v4, v10}, Lx0/g;->a(Lx0/q;)Z

    .line 1511
    .line 1512
    .line 1513
    move-result v10

    .line 1514
    if-eqz v10, :cond_4c

    .line 1515
    .line 1516
    const-string v10, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"

    .line 1517
    .line 1518
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1519
    .line 1520
    .line 1521
    :cond_4c
    sget-object v10, Lx0/n;->p:Lx0/q;

    .line 1522
    .line 1523
    invoke-virtual {v4, v10}, Lx0/g;->a(Lx0/q;)Z

    .line 1524
    .line 1525
    .line 1526
    move-result v10

    .line 1527
    if-eqz v10, :cond_4d

    .line 1528
    .line 1529
    const-string v10, "androidx.compose.ui.semantics.testTag"

    .line 1530
    .line 1531
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1532
    .line 1533
    .line 1534
    :cond_4d
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1535
    .line 1536
    .line 1537
    move-result v10

    .line 1538
    if-nez v10, :cond_4e

    .line 1539
    .line 1540
    sget-object v10, Lu0/f;->a:Lu0/f;

    .line 1541
    .line 1542
    invoke-virtual {v10, v7, v9}, Lu0/f;->a(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/util/List;)V

    .line 1543
    .line 1544
    .line 1545
    :cond_4e
    sget-object v9, Lx0/n;->c:Lx0/q;

    .line 1546
    .line 1547
    invoke-static {v4, v9}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v9

    .line 1551
    check-cast v9, Lx0/d;

    .line 1552
    .line 1553
    if-eqz v9, :cond_56

    .line 1554
    .line 1555
    sget-object v10, Lx0/f;->e:Lx0/q;

    .line 1556
    .line 1557
    invoke-virtual {v4, v10}, Lx0/g;->a(Lx0/q;)Z

    .line 1558
    .line 1559
    .line 1560
    move-result v12

    .line 1561
    if-eqz v12, :cond_4f

    .line 1562
    .line 1563
    const-string v12, "android.widget.SeekBar"

    .line 1564
    .line 1565
    invoke-virtual {v8, v12}, Ll1/e;->j(Ljava/lang/CharSequence;)V

    .line 1566
    .line 1567
    .line 1568
    goto :goto_2b

    .line 1569
    :cond_4f
    const-string v12, "android.widget.ProgressBar"

    .line 1570
    .line 1571
    invoke-virtual {v8, v12}, Ll1/e;->j(Ljava/lang/CharSequence;)V

    .line 1572
    .line 1573
    .line 1574
    :goto_2b
    sget-object v12, Lx0/d;->b:Lx0/d;

    .line 1575
    .line 1576
    if-eq v9, v12, :cond_54

    .line 1577
    .line 1578
    const/4 v9, 0x0

    .line 1579
    const/4 v15, 0x1

    .line 1580
    invoke-static {v15, v9, v9, v9}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->obtain(IFFF)Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v12

    .line 1584
    invoke-virtual {v7, v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->setRangeInfo(Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;)V

    .line 1585
    .line 1586
    .line 1587
    invoke-virtual {v8}, Ll1/e;->g()Ljava/lang/CharSequence;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v12

    .line 1591
    if-nez v12, :cond_55

    .line 1592
    .line 1593
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1594
    .line 1595
    invoke-static {v9, v9, v12}, Landroid/support/v4/media/session/b;->R(FFF)F

    .line 1596
    .line 1597
    .line 1598
    move-result v13

    .line 1599
    cmpg-float v9, v13, v9

    .line 1600
    .line 1601
    if-nez v9, :cond_50

    .line 1602
    .line 1603
    const/4 v9, 0x1

    .line 1604
    goto :goto_2c

    .line 1605
    :cond_50
    const/4 v9, 0x0

    .line 1606
    :goto_2c
    if-eqz v9, :cond_51

    .line 1607
    .line 1608
    const/4 v9, 0x0

    .line 1609
    :goto_2d
    const/4 v15, 0x1

    .line 1610
    goto :goto_2f

    .line 1611
    :cond_51
    cmpg-float v9, v13, v12

    .line 1612
    .line 1613
    if-nez v9, :cond_52

    .line 1614
    .line 1615
    const/4 v9, 0x1

    .line 1616
    goto :goto_2e

    .line 1617
    :cond_52
    const/4 v9, 0x0

    .line 1618
    :goto_2e
    const/16 v12, 0x64

    .line 1619
    .line 1620
    if-eqz v9, :cond_53

    .line 1621
    .line 1622
    move v9, v12

    .line 1623
    goto :goto_2d

    .line 1624
    :cond_53
    int-to-float v9, v12

    .line 1625
    mul-float/2addr v13, v9

    .line 1626
    invoke-static {v13}, Lvf/a;->H(F)I

    .line 1627
    .line 1628
    .line 1629
    move-result v9

    .line 1630
    const/16 v12, 0x63

    .line 1631
    .line 1632
    const/4 v15, 0x1

    .line 1633
    invoke-static {v9, v15, v12}, Landroid/support/v4/media/session/b;->S(III)I

    .line 1634
    .line 1635
    .line 1636
    move-result v9

    .line 1637
    :goto_2f
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v6

    .line 1641
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v6

    .line 1645
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v9

    .line 1649
    new-array v12, v15, [Ljava/lang/Object;

    .line 1650
    .line 1651
    const/16 v18, 0x0

    .line 1652
    .line 1653
    aput-object v9, v12, v18

    .line 1654
    .line 1655
    const v9, 0x7f130148

    .line 1656
    .line 1657
    .line 1658
    invoke-virtual {v6, v9, v12}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v6

    .line 1662
    invoke-virtual {v8, v6}, Ll1/e;->m(Ljava/lang/CharSequence;)V

    .line 1663
    .line 1664
    .line 1665
    goto :goto_30

    .line 1666
    :cond_54
    invoke-virtual {v8}, Ll1/e;->g()Ljava/lang/CharSequence;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v9

    .line 1670
    if-nez v9, :cond_55

    .line 1671
    .line 1672
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v6

    .line 1676
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v6

    .line 1680
    const v9, 0x7f1300a7

    .line 1681
    .line 1682
    .line 1683
    invoke-virtual {v6, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v6

    .line 1687
    invoke-virtual {v8, v6}, Ll1/e;->m(Ljava/lang/CharSequence;)V

    .line 1688
    .line 1689
    .line 1690
    :cond_55
    :goto_30
    invoke-virtual {v4, v10}, Lx0/g;->a(Lx0/q;)Z

    .line 1691
    .line 1692
    .line 1693
    move-result v6

    .line 1694
    if-eqz v6, :cond_56

    .line 1695
    .line 1696
    invoke-static {v11}, Lu0/Q;->a(Lx0/k;)Z

    .line 1697
    .line 1698
    .line 1699
    :cond_56
    const/16 v6, 0x18

    .line 1700
    .line 1701
    if-lt v3, v6, :cond_57

    .line 1702
    .line 1703
    invoke-static {v8, v11}, Lu0/o;->a(Ll1/e;Lx0/k;)V

    .line 1704
    .line 1705
    .line 1706
    :cond_57
    invoke-virtual {v11}, Lx0/k;->f()Lx0/g;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v3

    .line 1710
    sget-object v6, Lx0/n;->f:Lx0/q;

    .line 1711
    .line 1712
    invoke-static {v3, v6}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v3

    .line 1716
    if-nez v3, :cond_77

    .line 1717
    .line 1718
    new-instance v3, Ljava/util/ArrayList;

    .line 1719
    .line 1720
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1721
    .line 1722
    .line 1723
    invoke-virtual {v11}, Lx0/k;->f()Lx0/g;

    .line 1724
    .line 1725
    .line 1726
    move-result-object v6

    .line 1727
    sget-object v9, Lx0/n;->e:Lx0/q;

    .line 1728
    .line 1729
    invoke-static {v6, v9}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v6

    .line 1733
    if-eqz v6, :cond_59

    .line 1734
    .line 1735
    const/4 v10, 0x0

    .line 1736
    invoke-virtual {v11, v10}, Lx0/k;->e(Z)Ljava/util/List;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v6

    .line 1740
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 1741
    .line 1742
    .line 1743
    move-result v9

    .line 1744
    const/4 v10, 0x0

    .line 1745
    :goto_31
    if-ge v10, v9, :cond_59

    .line 1746
    .line 1747
    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v12

    .line 1751
    check-cast v12, Lx0/k;

    .line 1752
    .line 1753
    invoke-virtual {v12}, Lx0/k;->f()Lx0/g;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v13

    .line 1757
    sget-object v15, Lx0/n;->t:Lx0/q;

    .line 1758
    .line 1759
    invoke-virtual {v13, v15}, Lx0/g;->a(Lx0/q;)Z

    .line 1760
    .line 1761
    .line 1762
    move-result v13

    .line 1763
    if-eqz v13, :cond_58

    .line 1764
    .line 1765
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1766
    .line 1767
    .line 1768
    :cond_58
    const/16 v19, 0x1

    .line 1769
    .line 1770
    add-int/lit8 v10, v10, 0x1

    .line 1771
    .line 1772
    goto :goto_31

    .line 1773
    :cond_59
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1774
    .line 1775
    .line 1776
    move-result v6

    .line 1777
    if-nez v6, :cond_5c

    .line 1778
    .line 1779
    invoke-static {v3}, Lp7/b;->g(Ljava/util/ArrayList;)Z

    .line 1780
    .line 1781
    .line 1782
    move-result v6

    .line 1783
    if-eqz v6, :cond_5a

    .line 1784
    .line 1785
    const/4 v9, 0x1

    .line 1786
    goto :goto_32

    .line 1787
    :cond_5a
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 1788
    .line 1789
    .line 1790
    move-result v9

    .line 1791
    :goto_32
    if-eqz v6, :cond_5b

    .line 1792
    .line 1793
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 1794
    .line 1795
    .line 1796
    move-result v3

    .line 1797
    :goto_33
    const/4 v10, 0x0

    .line 1798
    goto :goto_34

    .line 1799
    :cond_5b
    const/4 v3, 0x1

    .line 1800
    goto :goto_33

    .line 1801
    :goto_34
    invoke-static {v9, v3, v10, v10}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZI)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    .line 1802
    .line 1803
    .line 1804
    move-result-object v3

    .line 1805
    invoke-virtual {v14, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    .line 1806
    .line 1807
    .line 1808
    :cond_5c
    invoke-virtual {v11}, Lx0/k;->f()Lx0/g;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v3

    .line 1812
    sget-object v6, Lx0/n;->g:Lx0/q;

    .line 1813
    .line 1814
    invoke-static {v3, v6}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 1815
    .line 1816
    .line 1817
    move-result-object v3

    .line 1818
    if-nez v3, :cond_76

    .line 1819
    .line 1820
    invoke-virtual {v11}, Lx0/k;->g()Lx0/k;

    .line 1821
    .line 1822
    .line 1823
    move-result-object v3

    .line 1824
    if-nez v3, :cond_5e

    .line 1825
    .line 1826
    :cond_5d
    :goto_35
    const/16 v19, 0x1

    .line 1827
    .line 1828
    goto/16 :goto_3a

    .line 1829
    .line 1830
    :cond_5e
    invoke-virtual {v3}, Lx0/k;->f()Lx0/g;

    .line 1831
    .line 1832
    .line 1833
    move-result-object v6

    .line 1834
    sget-object v9, Lx0/n;->e:Lx0/q;

    .line 1835
    .line 1836
    invoke-static {v6, v9}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v6

    .line 1840
    if-eqz v6, :cond_5d

    .line 1841
    .line 1842
    invoke-virtual {v3}, Lx0/k;->f()Lx0/g;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v6

    .line 1846
    sget-object v9, Lx0/n;->f:Lx0/q;

    .line 1847
    .line 1848
    invoke-static {v6, v9}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v6

    .line 1852
    if-nez v6, :cond_66

    .line 1853
    .line 1854
    invoke-virtual {v11}, Lx0/k;->f()Lx0/g;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v6

    .line 1858
    sget-object v9, Lx0/n;->t:Lx0/q;

    .line 1859
    .line 1860
    invoke-virtual {v6, v9}, Lx0/g;->a(Lx0/q;)Z

    .line 1861
    .line 1862
    .line 1863
    move-result v6

    .line 1864
    if-nez v6, :cond_5f

    .line 1865
    .line 1866
    goto :goto_35

    .line 1867
    :cond_5f
    new-instance v6, Ljava/util/ArrayList;

    .line 1868
    .line 1869
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1870
    .line 1871
    .line 1872
    const/4 v10, 0x0

    .line 1873
    invoke-virtual {v3, v10}, Lx0/k;->e(Z)Ljava/util/List;

    .line 1874
    .line 1875
    .line 1876
    move-result-object v3

    .line 1877
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1878
    .line 1879
    .line 1880
    move-result v9

    .line 1881
    const/4 v10, 0x0

    .line 1882
    :goto_36
    if-ge v10, v9, :cond_61

    .line 1883
    .line 1884
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v12

    .line 1888
    check-cast v12, Lx0/k;

    .line 1889
    .line 1890
    invoke-virtual {v12}, Lx0/k;->f()Lx0/g;

    .line 1891
    .line 1892
    .line 1893
    move-result-object v13

    .line 1894
    sget-object v15, Lx0/n;->t:Lx0/q;

    .line 1895
    .line 1896
    invoke-virtual {v13, v15}, Lx0/g;->a(Lx0/q;)Z

    .line 1897
    .line 1898
    .line 1899
    move-result v13

    .line 1900
    if-eqz v13, :cond_60

    .line 1901
    .line 1902
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1903
    .line 1904
    .line 1905
    :cond_60
    const/16 v19, 0x1

    .line 1906
    .line 1907
    add-int/lit8 v10, v10, 0x1

    .line 1908
    .line 1909
    goto :goto_36

    .line 1910
    :cond_61
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1911
    .line 1912
    .line 1913
    move-result v3

    .line 1914
    if-nez v3, :cond_5d

    .line 1915
    .line 1916
    invoke-static {v6}, Lp7/b;->g(Ljava/util/ArrayList;)Z

    .line 1917
    .line 1918
    .line 1919
    move-result v3

    .line 1920
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1921
    .line 1922
    .line 1923
    move-result v9

    .line 1924
    const/4 v10, 0x0

    .line 1925
    :goto_37
    if-ge v10, v9, :cond_5d

    .line 1926
    .line 1927
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1928
    .line 1929
    .line 1930
    move-result-object v12

    .line 1931
    check-cast v12, Lx0/k;

    .line 1932
    .line 1933
    iget v13, v12, Lx0/k;->f:I

    .line 1934
    .line 1935
    iget v15, v11, Lx0/k;->f:I

    .line 1936
    .line 1937
    if-ne v13, v15, :cond_65

    .line 1938
    .line 1939
    if-eqz v3, :cond_62

    .line 1940
    .line 1941
    const/16 v20, 0x0

    .line 1942
    .line 1943
    goto :goto_38

    .line 1944
    :cond_62
    move/from16 v20, v10

    .line 1945
    .line 1946
    :goto_38
    if-eqz v3, :cond_63

    .line 1947
    .line 1948
    move/from16 v22, v10

    .line 1949
    .line 1950
    goto :goto_39

    .line 1951
    :cond_63
    const/16 v22, 0x0

    .line 1952
    .line 1953
    :goto_39
    invoke-virtual {v12}, Lx0/k;->f()Lx0/g;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v12

    .line 1957
    sget-object v13, Lx0/n;->t:Lx0/q;

    .line 1958
    .line 1959
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1960
    .line 1961
    .line 1962
    const-string v15, "key"

    .line 1963
    .line 1964
    invoke-static {v13, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1965
    .line 1966
    .line 1967
    iget-object v12, v12, Lx0/g;->a:Ljava/util/LinkedHashMap;

    .line 1968
    .line 1969
    invoke-virtual {v12, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1970
    .line 1971
    .line 1972
    move-result-object v12

    .line 1973
    if-nez v12, :cond_64

    .line 1974
    .line 1975
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1976
    .line 1977
    :cond_64
    check-cast v12, Ljava/lang/Boolean;

    .line 1978
    .line 1979
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1980
    .line 1981
    .line 1982
    move-result v25

    .line 1983
    const/16 v21, 0x1

    .line 1984
    .line 1985
    const/16 v23, 0x1

    .line 1986
    .line 1987
    const/16 v24, 0x0

    .line 1988
    .line 1989
    invoke-static/range {v20 .. v25}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    .line 1990
    .line 1991
    .line 1992
    move-result-object v12

    .line 1993
    invoke-virtual {v14, v12}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    .line 1994
    .line 1995
    .line 1996
    :cond_65
    const/16 v19, 0x1

    .line 1997
    .line 1998
    add-int/lit8 v10, v10, 0x1

    .line 1999
    .line 2000
    goto :goto_37

    .line 2001
    :cond_66
    new-instance v1, Ljava/lang/ClassCastException;

    .line 2002
    .line 2003
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 2004
    .line 2005
    .line 2006
    throw v1

    .line 2007
    :goto_3a
    sget-object v3, Lx0/n;->m:Lx0/q;

    .line 2008
    .line 2009
    invoke-static {v4, v3}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v3

    .line 2013
    if-nez v3, :cond_75

    .line 2014
    .line 2015
    sget-object v3, Lx0/f;->d:Lx0/q;

    .line 2016
    .line 2017
    invoke-static {v4, v3}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 2018
    .line 2019
    .line 2020
    move-result-object v3

    .line 2021
    check-cast v3, Lx0/a;

    .line 2022
    .line 2023
    sget-object v3, Lx0/n;->n:Lx0/q;

    .line 2024
    .line 2025
    invoke-static {v4, v3}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v3

    .line 2029
    if-nez v3, :cond_74

    .line 2030
    .line 2031
    sget-object v3, Lx0/n;->d:Lx0/q;

    .line 2032
    .line 2033
    invoke-static {v4, v3}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v3

    .line 2037
    check-cast v3, Ljava/lang/CharSequence;

    .line 2038
    .line 2039
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2040
    .line 2041
    if-lt v6, v5, :cond_67

    .line 2042
    .line 2043
    invoke-static {v14, v3}, Ldb/b;->u(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 2044
    .line 2045
    .line 2046
    goto :goto_3b

    .line 2047
    :cond_67
    invoke-virtual {v14}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 2048
    .line 2049
    .line 2050
    move-result-object v5

    .line 2051
    const-string v6, "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"

    .line 2052
    .line 2053
    invoke-virtual {v5, v6, v3}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 2054
    .line 2055
    .line 2056
    :goto_3b
    invoke-static {v11}, Lu0/Q;->a(Lx0/k;)Z

    .line 2057
    .line 2058
    .line 2059
    move-result v3

    .line 2060
    if-eqz v3, :cond_71

    .line 2061
    .line 2062
    sget-object v3, Lx0/f;->k:Lx0/q;

    .line 2063
    .line 2064
    invoke-static {v4, v3}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 2065
    .line 2066
    .line 2067
    move-result-object v3

    .line 2068
    check-cast v3, Lx0/a;

    .line 2069
    .line 2070
    if-eqz v3, :cond_68

    .line 2071
    .line 2072
    new-instance v5, Ll1/c;

    .line 2073
    .line 2074
    const/high16 v6, 0x40000

    .line 2075
    .line 2076
    iget-object v3, v3, Lx0/a;->a:Ljava/lang/String;

    .line 2077
    .line 2078
    invoke-direct {v5, v6, v3}, Ll1/c;-><init>(ILjava/lang/String;)V

    .line 2079
    .line 2080
    .line 2081
    invoke-virtual {v8, v5}, Ll1/e;->b(Ll1/c;)V

    .line 2082
    .line 2083
    .line 2084
    :cond_68
    sget-object v3, Lx0/f;->l:Lx0/q;

    .line 2085
    .line 2086
    invoke-static {v4, v3}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 2087
    .line 2088
    .line 2089
    move-result-object v3

    .line 2090
    check-cast v3, Lx0/a;

    .line 2091
    .line 2092
    if-eqz v3, :cond_69

    .line 2093
    .line 2094
    new-instance v5, Ll1/c;

    .line 2095
    .line 2096
    const/high16 v6, 0x80000

    .line 2097
    .line 2098
    iget-object v3, v3, Lx0/a;->a:Ljava/lang/String;

    .line 2099
    .line 2100
    invoke-direct {v5, v6, v3}, Ll1/c;-><init>(ILjava/lang/String;)V

    .line 2101
    .line 2102
    .line 2103
    invoke-virtual {v8, v5}, Ll1/e;->b(Ll1/c;)V

    .line 2104
    .line 2105
    .line 2106
    :cond_69
    sget-object v3, Lx0/f;->m:Lx0/q;

    .line 2107
    .line 2108
    invoke-static {v4, v3}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 2109
    .line 2110
    .line 2111
    move-result-object v3

    .line 2112
    check-cast v3, Lx0/a;

    .line 2113
    .line 2114
    if-eqz v3, :cond_6a

    .line 2115
    .line 2116
    new-instance v5, Ll1/c;

    .line 2117
    .line 2118
    const/high16 v6, 0x100000

    .line 2119
    .line 2120
    iget-object v3, v3, Lx0/a;->a:Ljava/lang/String;

    .line 2121
    .line 2122
    invoke-direct {v5, v6, v3}, Ll1/c;-><init>(ILjava/lang/String;)V

    .line 2123
    .line 2124
    .line 2125
    invoke-virtual {v8, v5}, Ll1/e;->b(Ll1/c;)V

    .line 2126
    .line 2127
    .line 2128
    :cond_6a
    sget-object v3, Lx0/f;->o:Lx0/q;

    .line 2129
    .line 2130
    invoke-virtual {v4, v3}, Lx0/g;->a(Lx0/q;)Z

    .line 2131
    .line 2132
    .line 2133
    move-result v5

    .line 2134
    if-eqz v5, :cond_71

    .line 2135
    .line 2136
    invoke-virtual {v4, v3}, Lx0/g;->c(Lx0/q;)Ljava/lang/Object;

    .line 2137
    .line 2138
    .line 2139
    move-result-object v3

    .line 2140
    check-cast v3, Ljava/util/List;

    .line 2141
    .line 2142
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2143
    .line 2144
    .line 2145
    move-result v4

    .line 2146
    const/16 v5, 0x20

    .line 2147
    .line 2148
    if-ge v4, v5, :cond_73

    .line 2149
    .line 2150
    new-instance v4, Lx/w;

    .line 2151
    .line 2152
    invoke-direct {v4}, Lx/w;-><init>()V

    .line 2153
    .line 2154
    .line 2155
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 2156
    .line 2157
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 2158
    .line 2159
    .line 2160
    iget-object v6, v2, Lu0/s;->k:Lx/w;

    .line 2161
    .line 2162
    iget-object v8, v6, Lx/w;->a:[I

    .line 2163
    .line 2164
    iget v9, v6, Lx/w;->c:I

    .line 2165
    .line 2166
    invoke-static {v9, v1, v8}, Ly/a;->a(II[I)I

    .line 2167
    .line 2168
    .line 2169
    move-result v8

    .line 2170
    if-ltz v8, :cond_6b

    .line 2171
    .line 2172
    goto :goto_3c

    .line 2173
    :cond_6b
    const/16 v19, 0x0

    .line 2174
    .line 2175
    :goto_3c
    if-eqz v19, :cond_70

    .line 2176
    .line 2177
    invoke-virtual {v6, v1}, Lx/w;->c(I)Ljava/lang/Object;

    .line 2178
    .line 2179
    .line 2180
    move-result-object v8

    .line 2181
    check-cast v8, Ljava/util/Map;

    .line 2182
    .line 2183
    sget-object v9, Lu0/s;->z:[I

    .line 2184
    .line 2185
    invoke-static {v9}, Lff/m;->N0([I)Ljava/util/ArrayList;

    .line 2186
    .line 2187
    .line 2188
    move-result-object v9

    .line 2189
    new-instance v10, Ljava/util/ArrayList;

    .line 2190
    .line 2191
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 2192
    .line 2193
    .line 2194
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2195
    .line 2196
    .line 2197
    move-result v11

    .line 2198
    if-gtz v11, :cond_6e

    .line 2199
    .line 2200
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 2201
    .line 2202
    .line 2203
    move-result v3

    .line 2204
    if-gtz v3, :cond_6c

    .line 2205
    .line 2206
    goto :goto_3d

    .line 2207
    :cond_6c
    const/4 v11, 0x0

    .line 2208
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2209
    .line 2210
    .line 2211
    move-result-object v1

    .line 2212
    if-nez v1, :cond_6d

    .line 2213
    .line 2214
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2215
    .line 2216
    .line 2217
    move-result-object v1

    .line 2218
    check-cast v1, Ljava/lang/Number;

    .line 2219
    .line 2220
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 2221
    .line 2222
    .line 2223
    throw v16

    .line 2224
    :cond_6d
    new-instance v1, Ljava/lang/ClassCastException;

    .line 2225
    .line 2226
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 2227
    .line 2228
    .line 2229
    throw v1

    .line 2230
    :cond_6e
    const/4 v11, 0x0

    .line 2231
    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2232
    .line 2233
    .line 2234
    move-result-object v1

    .line 2235
    if-nez v1, :cond_6f

    .line 2236
    .line 2237
    invoke-static {v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 2238
    .line 2239
    .line 2240
    throw v16

    .line 2241
    :cond_6f
    new-instance v1, Ljava/lang/ClassCastException;

    .line 2242
    .line 2243
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 2244
    .line 2245
    .line 2246
    throw v1

    .line 2247
    :cond_70
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 2248
    .line 2249
    .line 2250
    move-result v8

    .line 2251
    if-gtz v8, :cond_72

    .line 2252
    .line 2253
    :goto_3d
    iget-object v2, v2, Lu0/s;->j:Lx/w;

    .line 2254
    .line 2255
    invoke-virtual {v2, v1, v4}, Lx/w;->d(ILjava/lang/Object;)V

    .line 2256
    .line 2257
    .line 2258
    invoke-virtual {v6, v1, v5}, Lx/w;->d(ILjava/lang/Object;)V

    .line 2259
    .line 2260
    .line 2261
    :cond_71
    move-object v3, v7

    .line 2262
    goto :goto_3e

    .line 2263
    :cond_72
    const/4 v10, 0x0

    .line 2264
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2265
    .line 2266
    .line 2267
    move-result-object v1

    .line 2268
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2269
    .line 2270
    .line 2271
    new-instance v1, Ljava/lang/ClassCastException;

    .line 2272
    .line 2273
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 2274
    .line 2275
    .line 2276
    throw v1

    .line 2277
    :cond_73
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 2278
    .line 2279
    const-string v2, "Can\'t have more than 32 custom actions for one widget"

    .line 2280
    .line 2281
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2282
    .line 2283
    .line 2284
    throw v1

    .line 2285
    :goto_3e
    return-object v3

    .line 2286
    :cond_74
    new-instance v1, Ljava/lang/ClassCastException;

    .line 2287
    .line 2288
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 2289
    .line 2290
    .line 2291
    throw v1

    .line 2292
    :cond_75
    new-instance v1, Ljava/lang/ClassCastException;

    .line 2293
    .line 2294
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 2295
    .line 2296
    .line 2297
    throw v1

    .line 2298
    :cond_76
    new-instance v1, Ljava/lang/ClassCastException;

    .line 2299
    .line 2300
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 2301
    .line 2302
    .line 2303
    throw v1

    .line 2304
    :cond_77
    new-instance v1, Ljava/lang/ClassCastException;

    .line 2305
    .line 2306
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 2307
    .line 2308
    .line 2309
    throw v1

    .line 2310
    :cond_78
    new-instance v1, Ljava/lang/ClassCastException;

    .line 2311
    .line 2312
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 2313
    .line 2314
    .line 2315
    throw v1

    .line 2316
    :cond_79
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 2317
    .line 2318
    const-string v3, "semanticsNode "

    .line 2319
    .line 2320
    const-string v4, " has null parent"

    .line 2321
    .line 2322
    invoke-static {v1, v3, v4}, LA7/p0;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2323
    .line 2324
    .line 2325
    move-result-object v1

    .line 2326
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2327
    .line 2328
    .line 2329
    throw v2

    .line 2330
    :pswitch_0
    const/16 v16, 0x0

    .line 2331
    .line 2332
    check-cast v4, Lad/L;

    .line 2333
    .line 2334
    invoke-virtual {v4, v1}, Lad/L;->i(I)Ll1/e;

    .line 2335
    .line 2336
    .line 2337
    move-result-object v1

    .line 2338
    if-nez v1, :cond_7a

    .line 2339
    .line 2340
    move-object/from16 v3, v16

    .line 2341
    .line 2342
    goto :goto_3f

    .line 2343
    :cond_7a
    iget-object v3, v1, Ll1/e;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 2344
    .line 2345
    :goto_3f
    return-object v3

    .line 2346
    nop

    .line 2347
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public findAccessibilityNodeInfosByText(Ljava/lang/String;I)Ljava/util/List;
    .locals 1

    .line 1
    iget v0, p0, Ll1/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/view/accessibility/AccessibilityNodeProvider;->findAccessibilityNodeInfosByText(Ljava/lang/String;I)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    iget-object p1, p0, Ll1/f;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lad/L;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public findFocus(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 1

    .line 1
    iget v0, p0, Ll1/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/view/accessibility/AccessibilityNodeProvider;->findFocus(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    iget-object v0, p0, Ll1/f;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lad/L;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lad/L;->k(I)Ll1/e;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p1, p1, Ll1/e;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 24
    .line 25
    :goto_0
    return-object p1

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final performAction(IILandroid/os/Bundle;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget v4, v0, Ll1/f;->a:I

    .line 10
    .line 11
    packed-switch v4, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v4, v0, Ll1/f;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v4, Lu0/s;

    .line 17
    .line 18
    invoke-virtual {v4}, Lu0/s;->p()Ljava/util/Map;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Lu0/m0;

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    if-eqz v5, :cond_51

    .line 34
    .line 35
    iget-object v8, v5, Lu0/m0;->a:Lx0/k;

    .line 36
    .line 37
    if-nez v8, :cond_0

    .line 38
    .line 39
    goto/16 :goto_1d

    .line 40
    .line 41
    :cond_0
    const/high16 v5, 0x10000

    .line 42
    .line 43
    const/4 v15, 0x1

    .line 44
    const/16 v7, 0xc

    .line 45
    .line 46
    const/4 v9, 0x0

    .line 47
    const/16 v10, 0x40

    .line 48
    .line 49
    const/high16 v11, -0x80000000

    .line 50
    .line 51
    iget-object v12, v4, Lu0/s;->d:Lu0/n;

    .line 52
    .line 53
    if-eq v2, v10, :cond_4d

    .line 54
    .line 55
    const/16 v10, 0x80

    .line 56
    .line 57
    if-eq v2, v10, :cond_4c

    .line 58
    .line 59
    const/4 v5, 0x2

    .line 60
    const/16 v10, 0x200

    .line 61
    .line 62
    const/16 v11, 0x100

    .line 63
    .line 64
    iget v14, v8, Lx0/k;->f:I

    .line 65
    .line 66
    iget-object v13, v8, Lx0/k;->e:Lx0/g;

    .line 67
    .line 68
    if-eq v2, v11, :cond_29

    .line 69
    .line 70
    if-eq v2, v10, :cond_29

    .line 71
    .line 72
    const/16 v10, 0x4000

    .line 73
    .line 74
    if-eq v2, v10, :cond_28

    .line 75
    .line 76
    const/high16 v10, 0x20000

    .line 77
    .line 78
    if-eq v2, v10, :cond_24

    .line 79
    .line 80
    invoke-static {v8}, Lu0/Q;->a(Lx0/k;)Z

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    if-nez v10, :cond_1

    .line 85
    .line 86
    goto/16 :goto_1d

    .line 87
    .line 88
    :cond_1
    if-eq v2, v15, :cond_23

    .line 89
    .line 90
    if-eq v2, v5, :cond_22

    .line 91
    .line 92
    const/4 v5, 0x0

    .line 93
    iget-object v10, v8, Lx0/k;->g:Lt0/t;

    .line 94
    .line 95
    sparse-switch v2, :sswitch_data_0

    .line 96
    .line 97
    .line 98
    packed-switch v2, :pswitch_data_1

    .line 99
    .line 100
    .line 101
    iget-object v3, v4, Lu0/s;->j:Lx/w;

    .line 102
    .line 103
    invoke-virtual {v3, v1}, Lx/w;->c(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    check-cast v1, Lx/w;

    .line 108
    .line 109
    if-eqz v1, :cond_51

    .line 110
    .line 111
    invoke-virtual {v1, v2}, Lx/w;->c(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    check-cast v1, Ljava/lang/CharSequence;

    .line 116
    .line 117
    if-nez v1, :cond_2

    .line 118
    .line 119
    goto/16 :goto_1d

    .line 120
    .line 121
    :cond_2
    sget-object v1, Lx0/f;->o:Lx0/q;

    .line 122
    .line 123
    invoke-static {v13, v1}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Ljava/util/List;

    .line 128
    .line 129
    if-nez v1, :cond_3

    .line 130
    .line 131
    goto/16 :goto_1d

    .line 132
    .line 133
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-gtz v2, :cond_4

    .line 138
    .line 139
    goto/16 :goto_1d

    .line 140
    .line 141
    :cond_4
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    new-instance v1, Ljava/lang/ClassCastException;

    .line 149
    .line 150
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 151
    .line 152
    .line 153
    throw v1

    .line 154
    :sswitch_0
    if-eqz v3, :cond_51

    .line 155
    .line 156
    const-string v1, "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"

    .line 157
    .line 158
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-nez v2, :cond_5

    .line 163
    .line 164
    goto/16 :goto_1d

    .line 165
    .line 166
    :cond_5
    sget-object v2, Lx0/f;->e:Lx0/q;

    .line 167
    .line 168
    invoke-static {v13, v2}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    check-cast v2, Lx0/a;

    .line 173
    .line 174
    if-eqz v2, :cond_51

    .line 175
    .line 176
    iget-object v2, v2, Lx0/a;->b:Lef/e;

    .line 177
    .line 178
    check-cast v2, Ltf/l;

    .line 179
    .line 180
    if-eqz v2, :cond_51

    .line 181
    .line 182
    invoke-virtual {v3, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-interface {v2, v1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    check-cast v1, Ljava/lang/Boolean;

    .line 195
    .line 196
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 197
    .line 198
    .line 199
    move-result v6

    .line 200
    goto/16 :goto_1d

    .line 201
    .line 202
    :sswitch_1
    invoke-virtual {v8}, Lx0/k;->g()Lx0/k;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    if-eqz v1, :cond_6

    .line 207
    .line 208
    invoke-virtual {v1}, Lx0/k;->f()Lx0/g;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    if-eqz v2, :cond_6

    .line 213
    .line 214
    sget-object v3, Lx0/f;->d:Lx0/q;

    .line 215
    .line 216
    invoke-static {v2, v3}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    check-cast v2, Lx0/a;

    .line 221
    .line 222
    goto :goto_0

    .line 223
    :cond_6
    move-object v2, v9

    .line 224
    :goto_0
    if-eqz v1, :cond_8

    .line 225
    .line 226
    if-eqz v2, :cond_7

    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_7
    invoke-virtual {v1}, Lx0/k;->g()Lx0/k;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    if-eqz v1, :cond_6

    .line 234
    .line 235
    invoke-virtual {v1}, Lx0/k;->f()Lx0/g;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    if-eqz v2, :cond_6

    .line 240
    .line 241
    sget-object v3, Lx0/f;->d:Lx0/q;

    .line 242
    .line 243
    invoke-static {v2, v3}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    check-cast v2, Lx0/a;

    .line 248
    .line 249
    goto :goto_0

    .line 250
    :cond_8
    :goto_1
    if-nez v1, :cond_9

    .line 251
    .line 252
    goto/16 :goto_1d

    .line 253
    .line 254
    :cond_9
    iget-object v3, v1, Lx0/k;->g:Lt0/t;

    .line 255
    .line 256
    iget-object v4, v3, Lt0/t;->x:Lt0/i;

    .line 257
    .line 258
    invoke-static {v4}, LFe/g;->p(Lt0/i;)Ld0/d;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    iget-object v3, v3, Lt0/t;->x:Lt0/i;

    .line 263
    .line 264
    invoke-virtual {v3}, Lt0/y;->M()Lt0/y;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    if-eqz v3, :cond_a

    .line 269
    .line 270
    invoke-static {v3}, LFe/g;->G(Lr0/k;)J

    .line 271
    .line 272
    .line 273
    move-result-wide v11

    .line 274
    goto :goto_2

    .line 275
    :cond_a
    sget-wide v11, Ld0/c;->b:J

    .line 276
    .line 277
    :goto_2
    invoke-virtual {v4, v11, v12}, Ld0/d;->e(J)Ld0/d;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    invoke-virtual {v10}, Lt0/t;->r()Z

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    if-nez v4, :cond_b

    .line 286
    .line 287
    sget-wide v11, Ld0/c;->b:J

    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_b
    invoke-virtual {v8}, Lx0/k;->c()Lt0/y;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    invoke-static {v4}, LFe/g;->G(Lr0/k;)J

    .line 295
    .line 296
    .line 297
    move-result-wide v11

    .line 298
    :goto_3
    invoke-virtual {v8}, Lx0/k;->c()Lt0/y;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    iget-wide v7, v4, Lr0/t;->c:J

    .line 303
    .line 304
    invoke-static {v7, v8}, LBa/c;->R(J)J

    .line 305
    .line 306
    .line 307
    move-result-wide v7

    .line 308
    invoke-static {v11, v12, v7, v8}, La/a;->f(JJ)Ld0/d;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    sget-object v7, Lx0/n;->m:Lx0/q;

    .line 313
    .line 314
    iget-object v1, v1, Lx0/k;->e:Lx0/g;

    .line 315
    .line 316
    invoke-static {v1, v7}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v7

    .line 320
    if-nez v7, :cond_12

    .line 321
    .line 322
    sget-object v7, Lx0/n;->n:Lx0/q;

    .line 323
    .line 324
    invoke-static {v1, v7}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    if-nez v1, :cond_11

    .line 329
    .line 330
    iget v1, v4, Ld0/d;->a:F

    .line 331
    .line 332
    iget v7, v3, Ld0/d;->a:F

    .line 333
    .line 334
    sub-float/2addr v1, v7

    .line 335
    iget v7, v4, Ld0/d;->c:F

    .line 336
    .line 337
    iget v8, v3, Ld0/d;->c:F

    .line 338
    .line 339
    sub-float/2addr v7, v8

    .line 340
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 341
    .line 342
    .line 343
    move-result v8

    .line 344
    invoke-static {v7}, Ljava/lang/Math;->signum(F)F

    .line 345
    .line 346
    .line 347
    move-result v9

    .line 348
    cmpg-float v8, v8, v9

    .line 349
    .line 350
    if-nez v8, :cond_d

    .line 351
    .line 352
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 353
    .line 354
    .line 355
    move-result v8

    .line 356
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 357
    .line 358
    .line 359
    move-result v9

    .line 360
    cmpg-float v8, v8, v9

    .line 361
    .line 362
    if-gez v8, :cond_c

    .line 363
    .line 364
    goto :goto_4

    .line 365
    :cond_c
    move v1, v7

    .line 366
    goto :goto_4

    .line 367
    :cond_d
    move v1, v5

    .line 368
    :goto_4
    iget-object v7, v10, Lt0/t;->p:LL0/i;

    .line 369
    .line 370
    sget-object v8, LL0/i;->b:LL0/i;

    .line 371
    .line 372
    if-ne v7, v8, :cond_e

    .line 373
    .line 374
    neg-float v1, v1

    .line 375
    :cond_e
    iget v7, v4, Ld0/d;->b:F

    .line 376
    .line 377
    iget v8, v3, Ld0/d;->b:F

    .line 378
    .line 379
    sub-float/2addr v7, v8

    .line 380
    iget v4, v4, Ld0/d;->d:F

    .line 381
    .line 382
    iget v3, v3, Ld0/d;->d:F

    .line 383
    .line 384
    sub-float/2addr v4, v3

    .line 385
    invoke-static {v7}, Ljava/lang/Math;->signum(F)F

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    .line 390
    .line 391
    .line 392
    move-result v8

    .line 393
    cmpg-float v3, v3, v8

    .line 394
    .line 395
    if-nez v3, :cond_10

    .line 396
    .line 397
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 398
    .line 399
    .line 400
    move-result v3

    .line 401
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 402
    .line 403
    .line 404
    move-result v5

    .line 405
    cmpg-float v3, v3, v5

    .line 406
    .line 407
    if-gez v3, :cond_f

    .line 408
    .line 409
    move v5, v7

    .line 410
    goto :goto_5

    .line 411
    :cond_f
    move v5, v4

    .line 412
    :cond_10
    :goto_5
    if-eqz v2, :cond_51

    .line 413
    .line 414
    iget-object v2, v2, Lx0/a;->b:Lef/e;

    .line 415
    .line 416
    check-cast v2, Ltf/p;

    .line 417
    .line 418
    if-eqz v2, :cond_51

    .line 419
    .line 420
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    invoke-interface {v2, v1, v3}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    check-cast v1, Ljava/lang/Boolean;

    .line 433
    .line 434
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 435
    .line 436
    .line 437
    move-result v6

    .line 438
    goto/16 :goto_1d

    .line 439
    .line 440
    :cond_11
    new-instance v1, Ljava/lang/ClassCastException;

    .line 441
    .line 442
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 443
    .line 444
    .line 445
    throw v1

    .line 446
    :cond_12
    new-instance v1, Ljava/lang/ClassCastException;

    .line 447
    .line 448
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 449
    .line 450
    .line 451
    throw v1

    .line 452
    :sswitch_2
    if-eqz v3, :cond_13

    .line 453
    .line 454
    const-string v1, "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"

    .line 455
    .line 456
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    goto :goto_6

    .line 461
    :cond_13
    move-object v1, v9

    .line 462
    :goto_6
    sget-object v2, Lx0/f;->g:Lx0/q;

    .line 463
    .line 464
    invoke-static {v13, v2}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    check-cast v2, Lx0/a;

    .line 469
    .line 470
    if-eqz v2, :cond_51

    .line 471
    .line 472
    iget-object v2, v2, Lx0/a;->b:Lef/e;

    .line 473
    .line 474
    check-cast v2, Ltf/l;

    .line 475
    .line 476
    if-eqz v2, :cond_51

    .line 477
    .line 478
    new-instance v3, Lz0/b;

    .line 479
    .line 480
    if-nez v1, :cond_14

    .line 481
    .line 482
    const-string v1, ""

    .line 483
    .line 484
    :cond_14
    const/4 v4, 0x6

    .line 485
    invoke-direct {v3, v4, v9, v1}, Lz0/b;-><init>(ILjava/util/List;Ljava/lang/String;)V

    .line 486
    .line 487
    .line 488
    invoke-interface {v2, v3}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    check-cast v1, Ljava/lang/Boolean;

    .line 493
    .line 494
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 495
    .line 496
    .line 497
    move-result v6

    .line 498
    goto/16 :goto_1d

    .line 499
    .line 500
    :sswitch_3
    sget-object v1, Lx0/f;->m:Lx0/q;

    .line 501
    .line 502
    invoke-static {v13, v1}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v1

    .line 506
    check-cast v1, Lx0/a;

    .line 507
    .line 508
    if-eqz v1, :cond_51

    .line 509
    .line 510
    iget-object v1, v1, Lx0/a;->b:Lef/e;

    .line 511
    .line 512
    check-cast v1, Ltf/a;

    .line 513
    .line 514
    if-eqz v1, :cond_51

    .line 515
    .line 516
    invoke-interface {v1}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    check-cast v1, Ljava/lang/Boolean;

    .line 521
    .line 522
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 523
    .line 524
    .line 525
    move-result v6

    .line 526
    goto/16 :goto_1d

    .line 527
    .line 528
    :sswitch_4
    sget-object v1, Lx0/f;->l:Lx0/q;

    .line 529
    .line 530
    invoke-static {v13, v1}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    check-cast v1, Lx0/a;

    .line 535
    .line 536
    if-eqz v1, :cond_51

    .line 537
    .line 538
    iget-object v1, v1, Lx0/a;->b:Lef/e;

    .line 539
    .line 540
    check-cast v1, Ltf/a;

    .line 541
    .line 542
    if-eqz v1, :cond_51

    .line 543
    .line 544
    invoke-interface {v1}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    check-cast v1, Ljava/lang/Boolean;

    .line 549
    .line 550
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 551
    .line 552
    .line 553
    move-result v6

    .line 554
    goto/16 :goto_1d

    .line 555
    .line 556
    :sswitch_5
    sget-object v1, Lx0/f;->k:Lx0/q;

    .line 557
    .line 558
    invoke-static {v13, v1}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    check-cast v1, Lx0/a;

    .line 563
    .line 564
    if-eqz v1, :cond_51

    .line 565
    .line 566
    iget-object v1, v1, Lx0/a;->b:Lef/e;

    .line 567
    .line 568
    check-cast v1, Ltf/a;

    .line 569
    .line 570
    if-eqz v1, :cond_51

    .line 571
    .line 572
    invoke-interface {v1}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    check-cast v1, Ljava/lang/Boolean;

    .line 577
    .line 578
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 579
    .line 580
    .line 581
    move-result v6

    .line 582
    goto/16 :goto_1d

    .line 583
    .line 584
    :sswitch_6
    sget-object v1, Lx0/f;->i:Lx0/q;

    .line 585
    .line 586
    invoke-static {v13, v1}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v1

    .line 590
    check-cast v1, Lx0/a;

    .line 591
    .line 592
    if-eqz v1, :cond_51

    .line 593
    .line 594
    iget-object v1, v1, Lx0/a;->b:Lef/e;

    .line 595
    .line 596
    check-cast v1, Ltf/a;

    .line 597
    .line 598
    if-eqz v1, :cond_51

    .line 599
    .line 600
    invoke-interface {v1}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v1

    .line 604
    check-cast v1, Ljava/lang/Boolean;

    .line 605
    .line 606
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 607
    .line 608
    .line 609
    move-result v6

    .line 610
    goto/16 :goto_1d

    .line 611
    .line 612
    :sswitch_7
    sget-object v1, Lx0/f;->j:Lx0/q;

    .line 613
    .line 614
    invoke-static {v13, v1}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    check-cast v1, Lx0/a;

    .line 619
    .line 620
    if-eqz v1, :cond_51

    .line 621
    .line 622
    iget-object v1, v1, Lx0/a;->b:Lef/e;

    .line 623
    .line 624
    check-cast v1, Ltf/a;

    .line 625
    .line 626
    if-eqz v1, :cond_51

    .line 627
    .line 628
    invoke-interface {v1}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v1

    .line 632
    check-cast v1, Ljava/lang/Boolean;

    .line 633
    .line 634
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 635
    .line 636
    .line 637
    move-result v6

    .line 638
    goto/16 :goto_1d

    .line 639
    .line 640
    :pswitch_0
    :sswitch_8
    const/16 v1, 0x1000

    .line 641
    .line 642
    if-ne v2, v1, :cond_15

    .line 643
    .line 644
    move v1, v15

    .line 645
    goto :goto_7

    .line 646
    :cond_15
    move v1, v6

    .line 647
    :goto_7
    const/16 v3, 0x2000

    .line 648
    .line 649
    if-ne v2, v3, :cond_16

    .line 650
    .line 651
    move v3, v15

    .line 652
    goto :goto_8

    .line 653
    :cond_16
    move v3, v6

    .line 654
    :goto_8
    const v4, 0x1020039

    .line 655
    .line 656
    .line 657
    if-ne v2, v4, :cond_17

    .line 658
    .line 659
    move v4, v15

    .line 660
    goto :goto_9

    .line 661
    :cond_17
    move v4, v6

    .line 662
    :goto_9
    const v7, 0x102003b

    .line 663
    .line 664
    .line 665
    if-ne v2, v7, :cond_18

    .line 666
    .line 667
    move v7, v15

    .line 668
    goto :goto_a

    .line 669
    :cond_18
    move v7, v6

    .line 670
    :goto_a
    const v8, 0x1020038

    .line 671
    .line 672
    .line 673
    if-ne v2, v8, :cond_19

    .line 674
    .line 675
    move v8, v15

    .line 676
    goto :goto_b

    .line 677
    :cond_19
    move v8, v6

    .line 678
    :goto_b
    const v9, 0x102003a

    .line 679
    .line 680
    .line 681
    if-ne v2, v9, :cond_1a

    .line 682
    .line 683
    goto :goto_c

    .line 684
    :cond_1a
    move v15, v6

    .line 685
    :goto_c
    if-nez v1, :cond_1b

    .line 686
    .line 687
    if-eqz v3, :cond_1d

    .line 688
    .line 689
    :cond_1b
    sget-object v1, Lx0/n;->c:Lx0/q;

    .line 690
    .line 691
    invoke-static {v13, v1}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    check-cast v1, Lx0/d;

    .line 696
    .line 697
    sget-object v2, Lx0/f;->e:Lx0/q;

    .line 698
    .line 699
    invoke-static {v13, v2}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v2

    .line 703
    check-cast v2, Lx0/a;

    .line 704
    .line 705
    if-eqz v1, :cond_1d

    .line 706
    .line 707
    if-eqz v2, :cond_1d

    .line 708
    .line 709
    const/16 v1, 0x14

    .line 710
    .line 711
    int-to-float v1, v1

    .line 712
    div-float v1, v5, v1

    .line 713
    .line 714
    if-eqz v3, :cond_1c

    .line 715
    .line 716
    neg-float v1, v1

    .line 717
    :cond_1c
    iget-object v2, v2, Lx0/a;->b:Lef/e;

    .line 718
    .line 719
    check-cast v2, Ltf/l;

    .line 720
    .line 721
    if-eqz v2, :cond_51

    .line 722
    .line 723
    add-float/2addr v5, v1

    .line 724
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 725
    .line 726
    .line 727
    move-result-object v1

    .line 728
    invoke-interface {v2, v1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v1

    .line 732
    check-cast v1, Ljava/lang/Boolean;

    .line 733
    .line 734
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 735
    .line 736
    .line 737
    move-result v6

    .line 738
    goto/16 :goto_1d

    .line 739
    .line 740
    :cond_1d
    iget-object v1, v10, Lt0/t;->x:Lt0/i;

    .line 741
    .line 742
    invoke-static {v1}, LFe/g;->p(Lt0/i;)Ld0/d;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    invoke-virtual {v1}, Ld0/d;->c()F

    .line 747
    .line 748
    .line 749
    move-result v2

    .line 750
    invoke-virtual {v1}, Ld0/d;->b()F

    .line 751
    .line 752
    .line 753
    move-result v1

    .line 754
    invoke-static {v2, v1}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 755
    .line 756
    .line 757
    sget-object v1, Lx0/f;->d:Lx0/q;

    .line 758
    .line 759
    invoke-static {v13, v1}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object v1

    .line 763
    check-cast v1, Lx0/a;

    .line 764
    .line 765
    if-nez v1, :cond_1e

    .line 766
    .line 767
    goto/16 :goto_1d

    .line 768
    .line 769
    :cond_1e
    sget-object v1, Lx0/n;->m:Lx0/q;

    .line 770
    .line 771
    invoke-static {v13, v1}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v1

    .line 775
    if-nez v1, :cond_20

    .line 776
    .line 777
    sget-object v1, Lx0/n;->n:Lx0/q;

    .line 778
    .line 779
    invoke-static {v13, v1}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v1

    .line 783
    if-nez v1, :cond_1f

    .line 784
    .line 785
    goto/16 :goto_1d

    .line 786
    .line 787
    :cond_1f
    new-instance v1, Ljava/lang/ClassCastException;

    .line 788
    .line 789
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 790
    .line 791
    .line 792
    throw v1

    .line 793
    :cond_20
    new-instance v1, Ljava/lang/ClassCastException;

    .line 794
    .line 795
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 796
    .line 797
    .line 798
    throw v1

    .line 799
    :sswitch_9
    sget-object v1, Lx0/f;->c:Lx0/q;

    .line 800
    .line 801
    invoke-static {v13, v1}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v1

    .line 805
    check-cast v1, Lx0/a;

    .line 806
    .line 807
    if-eqz v1, :cond_51

    .line 808
    .line 809
    iget-object v1, v1, Lx0/a;->b:Lef/e;

    .line 810
    .line 811
    check-cast v1, Ltf/a;

    .line 812
    .line 813
    if-eqz v1, :cond_51

    .line 814
    .line 815
    invoke-interface {v1}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v1

    .line 819
    check-cast v1, Ljava/lang/Boolean;

    .line 820
    .line 821
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 822
    .line 823
    .line 824
    move-result v6

    .line 825
    goto/16 :goto_1d

    .line 826
    .line 827
    :sswitch_a
    sget-object v2, Lx0/f;->b:Lx0/q;

    .line 828
    .line 829
    invoke-static {v13, v2}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    check-cast v2, Lx0/a;

    .line 834
    .line 835
    if-eqz v2, :cond_21

    .line 836
    .line 837
    iget-object v2, v2, Lx0/a;->b:Lef/e;

    .line 838
    .line 839
    check-cast v2, Ltf/a;

    .line 840
    .line 841
    if-eqz v2, :cond_21

    .line 842
    .line 843
    invoke-interface {v2}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v2

    .line 847
    check-cast v2, Ljava/lang/Boolean;

    .line 848
    .line 849
    goto :goto_d

    .line 850
    :cond_21
    move-object v2, v9

    .line 851
    :goto_d
    invoke-static {v4, v1, v15, v9, v7}, Lu0/s;->w(Lu0/s;IILjava/lang/Integer;I)V

    .line 852
    .line 853
    .line 854
    if-eqz v2, :cond_51

    .line 855
    .line 856
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 857
    .line 858
    .line 859
    move-result v6

    .line 860
    goto/16 :goto_1d

    .line 861
    .line 862
    :cond_22
    sget-object v1, Lx0/n;->k:Lx0/q;

    .line 863
    .line 864
    invoke-static {v13, v1}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 865
    .line 866
    .line 867
    move-result-object v1

    .line 868
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 869
    .line 870
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 871
    .line 872
    .line 873
    move-result v1

    .line 874
    if-eqz v1, :cond_51

    .line 875
    .line 876
    invoke-virtual {v12}, Lu0/n;->getFocusManager()Lc0/e;

    .line 877
    .line 878
    .line 879
    move-result-object v1

    .line 880
    check-cast v1, Lb7/k;

    .line 881
    .line 882
    invoke-virtual {v1, v6}, Lb7/k;->p(Z)V

    .line 883
    .line 884
    .line 885
    :goto_e
    move v6, v15

    .line 886
    goto/16 :goto_1d

    .line 887
    .line 888
    :cond_23
    sget-object v1, Lx0/f;->n:Lx0/q;

    .line 889
    .line 890
    invoke-static {v13, v1}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object v1

    .line 894
    check-cast v1, Lx0/a;

    .line 895
    .line 896
    if-eqz v1, :cond_51

    .line 897
    .line 898
    iget-object v1, v1, Lx0/a;->b:Lef/e;

    .line 899
    .line 900
    check-cast v1, Ltf/a;

    .line 901
    .line 902
    if-eqz v1, :cond_51

    .line 903
    .line 904
    invoke-interface {v1}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move-result-object v1

    .line 908
    check-cast v1, Ljava/lang/Boolean;

    .line 909
    .line 910
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 911
    .line 912
    .line 913
    move-result v6

    .line 914
    goto/16 :goto_1d

    .line 915
    .line 916
    :cond_24
    if-eqz v3, :cond_25

    .line 917
    .line 918
    const-string v1, "ACTION_ARGUMENT_SELECTION_START_INT"

    .line 919
    .line 920
    const/4 v2, -0x1

    .line 921
    invoke-virtual {v3, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 922
    .line 923
    .line 924
    move-result v16

    .line 925
    move/from16 v1, v16

    .line 926
    .line 927
    goto :goto_f

    .line 928
    :cond_25
    const/4 v2, -0x1

    .line 929
    move v1, v2

    .line 930
    :goto_f
    if-eqz v3, :cond_26

    .line 931
    .line 932
    const-string v5, "ACTION_ARGUMENT_SELECTION_END_INT"

    .line 933
    .line 934
    invoke-virtual {v3, v5, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 935
    .line 936
    .line 937
    move-result v13

    .line 938
    goto :goto_10

    .line 939
    :cond_26
    const/4 v13, -0x1

    .line 940
    :goto_10
    invoke-virtual {v4, v8, v1, v13, v6}, Lu0/s;->B(Lx0/k;IIZ)Z

    .line 941
    .line 942
    .line 943
    move-result v1

    .line 944
    if-eqz v1, :cond_27

    .line 945
    .line 946
    invoke-virtual {v4, v14}, Lu0/s;->t(I)I

    .line 947
    .line 948
    .line 949
    move-result v2

    .line 950
    invoke-static {v4, v2, v6, v9, v7}, Lu0/s;->w(Lu0/s;IILjava/lang/Integer;I)V

    .line 951
    .line 952
    .line 953
    :cond_27
    move v6, v1

    .line 954
    goto/16 :goto_1d

    .line 955
    .line 956
    :cond_28
    sget-object v1, Lx0/f;->h:Lx0/q;

    .line 957
    .line 958
    invoke-static {v13, v1}, LFe/e;->F(Lx0/g;Lx0/q;)Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v1

    .line 962
    check-cast v1, Lx0/a;

    .line 963
    .line 964
    if-eqz v1, :cond_51

    .line 965
    .line 966
    iget-object v1, v1, Lx0/a;->b:Lef/e;

    .line 967
    .line 968
    check-cast v1, Ltf/a;

    .line 969
    .line 970
    if-eqz v1, :cond_51

    .line 971
    .line 972
    invoke-interface {v1}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    move-result-object v1

    .line 976
    check-cast v1, Ljava/lang/Boolean;

    .line 977
    .line 978
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 979
    .line 980
    .line 981
    move-result v6

    .line 982
    goto/16 :goto_1d

    .line 983
    .line 984
    :cond_29
    if-eqz v3, :cond_51

    .line 985
    .line 986
    const-string v1, "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"

    .line 987
    .line 988
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 989
    .line 990
    .line 991
    move-result v1

    .line 992
    const-string v7, "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"

    .line 993
    .line 994
    invoke-virtual {v3, v7}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 995
    .line 996
    .line 997
    move-result v3

    .line 998
    if-ne v2, v11, :cond_2a

    .line 999
    .line 1000
    move v2, v15

    .line 1001
    goto :goto_11

    .line 1002
    :cond_2a
    move v2, v6

    .line 1003
    :goto_11
    iget-object v7, v4, Lu0/s;->m:Ljava/lang/Integer;

    .line 1004
    .line 1005
    if-nez v7, :cond_2b

    .line 1006
    .line 1007
    :goto_12
    const/4 v7, -0x1

    .line 1008
    goto :goto_13

    .line 1009
    :cond_2b
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 1010
    .line 1011
    .line 1012
    move-result v7

    .line 1013
    if-eq v14, v7, :cond_2c

    .line 1014
    .line 1015
    goto :goto_12

    .line 1016
    :goto_13
    iput v7, v4, Lu0/s;->l:I

    .line 1017
    .line 1018
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v7

    .line 1022
    iput-object v7, v4, Lu0/s;->m:Ljava/lang/Integer;

    .line 1023
    .line 1024
    :cond_2c
    invoke-static {v8}, Lu0/s;->q(Lx0/k;)Ljava/lang/String;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v7

    .line 1028
    if-eqz v7, :cond_51

    .line 1029
    .line 1030
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 1031
    .line 1032
    .line 1033
    move-result v14

    .line 1034
    if-nez v14, :cond_2d

    .line 1035
    .line 1036
    goto/16 :goto_1d

    .line 1037
    .line 1038
    :cond_2d
    invoke-static {v8}, Lu0/s;->q(Lx0/k;)Ljava/lang/String;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v14

    .line 1042
    if-eqz v14, :cond_40

    .line 1043
    .line 1044
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 1045
    .line 1046
    .line 1047
    move-result v17

    .line 1048
    if-nez v17, :cond_2e

    .line 1049
    .line 1050
    goto/16 :goto_16

    .line 1051
    .line 1052
    :cond_2e
    const-string v10, "view.context.resources.configuration.locale"

    .line 1053
    .line 1054
    if-eq v1, v15, :cond_3d

    .line 1055
    .line 1056
    if-eq v1, v5, :cond_3a

    .line 1057
    .line 1058
    const/4 v5, 0x4

    .line 1059
    if-eq v1, v5, :cond_32

    .line 1060
    .line 1061
    const/16 v10, 0x8

    .line 1062
    .line 1063
    if-eq v1, v10, :cond_2f

    .line 1064
    .line 1065
    const/16 v10, 0x10

    .line 1066
    .line 1067
    if-eq v1, v10, :cond_32

    .line 1068
    .line 1069
    goto/16 :goto_16

    .line 1070
    .line 1071
    :cond_2f
    sget-object v5, Lu0/d;->d:Lu0/d;

    .line 1072
    .line 1073
    if-nez v5, :cond_30

    .line 1074
    .line 1075
    new-instance v5, Lu0/d;

    .line 1076
    .line 1077
    invoke-direct {v5}, LJ4/d;-><init>()V

    .line 1078
    .line 1079
    .line 1080
    sput-object v5, Lu0/d;->d:Lu0/d;

    .line 1081
    .line 1082
    :cond_30
    sget-object v9, Lu0/d;->d:Lu0/d;

    .line 1083
    .line 1084
    if-eqz v9, :cond_31

    .line 1085
    .line 1086
    iput-object v14, v9, LJ4/d;->b:Ljava/lang/Object;

    .line 1087
    .line 1088
    goto/16 :goto_16

    .line 1089
    .line 1090
    :cond_31
    new-instance v1, Ljava/lang/NullPointerException;

    .line 1091
    .line 1092
    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator"

    .line 1093
    .line 1094
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1095
    .line 1096
    .line 1097
    throw v1

    .line 1098
    :cond_32
    sget-object v10, Lx0/f;->a:Lx0/q;

    .line 1099
    .line 1100
    invoke-virtual {v13, v10}, Lx0/g;->a(Lx0/q;)Z

    .line 1101
    .line 1102
    .line 1103
    move-result v12

    .line 1104
    if-nez v12, :cond_33

    .line 1105
    .line 1106
    goto/16 :goto_16

    .line 1107
    .line 1108
    :cond_33
    new-instance v12, Ljava/util/ArrayList;

    .line 1109
    .line 1110
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v13, v10}, Lx0/g;->c(Lx0/q;)Ljava/lang/Object;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v10

    .line 1117
    check-cast v10, Lx0/a;

    .line 1118
    .line 1119
    iget-object v10, v10, Lx0/a;->b:Lef/e;

    .line 1120
    .line 1121
    check-cast v10, Ltf/l;

    .line 1122
    .line 1123
    if-eqz v10, :cond_34

    .line 1124
    .line 1125
    invoke-interface {v10, v12}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v10

    .line 1129
    check-cast v10, Ljava/lang/Boolean;

    .line 1130
    .line 1131
    goto :goto_14

    .line 1132
    :cond_34
    move-object v10, v9

    .line 1133
    :goto_14
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1134
    .line 1135
    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1136
    .line 1137
    .line 1138
    move-result v10

    .line 1139
    if-eqz v10, :cond_40

    .line 1140
    .line 1141
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v9

    .line 1145
    check-cast v9, Lz0/n;

    .line 1146
    .line 1147
    const-string v10, "layoutResult"

    .line 1148
    .line 1149
    if-ne v1, v5, :cond_37

    .line 1150
    .line 1151
    sget-object v5, Lu0/b;->h:Lu0/b;

    .line 1152
    .line 1153
    if-nez v5, :cond_35

    .line 1154
    .line 1155
    new-instance v5, Lu0/b;

    .line 1156
    .line 1157
    const/4 v11, 0x2

    .line 1158
    invoke-direct {v5, v11}, Lu0/b;-><init>(I)V

    .line 1159
    .line 1160
    .line 1161
    sput-object v5, Lu0/b;->h:Lu0/b;

    .line 1162
    .line 1163
    :cond_35
    sget-object v5, Lu0/b;->h:Lu0/b;

    .line 1164
    .line 1165
    if-eqz v5, :cond_36

    .line 1166
    .line 1167
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1168
    .line 1169
    .line 1170
    iput-object v14, v5, LJ4/d;->b:Ljava/lang/Object;

    .line 1171
    .line 1172
    iput-object v9, v5, Lu0/b;->e:Ljava/lang/Object;

    .line 1173
    .line 1174
    :goto_15
    move-object v9, v5

    .line 1175
    goto/16 :goto_16

    .line 1176
    .line 1177
    :cond_36
    new-instance v1, Ljava/lang/NullPointerException;

    .line 1178
    .line 1179
    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator"

    .line 1180
    .line 1181
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1182
    .line 1183
    .line 1184
    throw v1

    .line 1185
    :cond_37
    sget-object v5, Lu0/c;->f:Lu0/c;

    .line 1186
    .line 1187
    if-nez v5, :cond_38

    .line 1188
    .line 1189
    new-instance v5, Lu0/c;

    .line 1190
    .line 1191
    invoke-direct {v5}, LJ4/d;-><init>()V

    .line 1192
    .line 1193
    .line 1194
    new-instance v11, Landroid/graphics/Rect;

    .line 1195
    .line 1196
    invoke-direct {v11}, Landroid/graphics/Rect;-><init>()V

    .line 1197
    .line 1198
    .line 1199
    sput-object v5, Lu0/c;->f:Lu0/c;

    .line 1200
    .line 1201
    :cond_38
    sget-object v5, Lu0/c;->f:Lu0/c;

    .line 1202
    .line 1203
    if-eqz v5, :cond_39

    .line 1204
    .line 1205
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1206
    .line 1207
    .line 1208
    iput-object v14, v5, LJ4/d;->b:Ljava/lang/Object;

    .line 1209
    .line 1210
    iput-object v9, v5, Lu0/c;->d:Lz0/n;

    .line 1211
    .line 1212
    iput-object v8, v5, Lu0/c;->e:Lx0/k;

    .line 1213
    .line 1214
    goto :goto_15

    .line 1215
    :cond_39
    new-instance v1, Ljava/lang/NullPointerException;

    .line 1216
    .line 1217
    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator"

    .line 1218
    .line 1219
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1220
    .line 1221
    .line 1222
    throw v1

    .line 1223
    :cond_3a
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v5

    .line 1227
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v5

    .line 1231
    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v5

    .line 1235
    iget-object v5, v5, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 1236
    .line 1237
    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1238
    .line 1239
    .line 1240
    sget-object v9, Lu0/b;->g:Lu0/b;

    .line 1241
    .line 1242
    if-nez v9, :cond_3b

    .line 1243
    .line 1244
    new-instance v9, Lu0/b;

    .line 1245
    .line 1246
    const/4 v10, 0x1

    .line 1247
    invoke-direct {v9, v10}, Lu0/b;-><init>(I)V

    .line 1248
    .line 1249
    .line 1250
    invoke-static {v5}, Ljava/text/BreakIterator;->getWordInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v5

    .line 1254
    const-string v10, "getWordInstance(locale)"

    .line 1255
    .line 1256
    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1257
    .line 1258
    .line 1259
    iput-object v5, v9, Lu0/b;->e:Ljava/lang/Object;

    .line 1260
    .line 1261
    sput-object v9, Lu0/b;->g:Lu0/b;

    .line 1262
    .line 1263
    :cond_3b
    sget-object v9, Lu0/b;->g:Lu0/b;

    .line 1264
    .line 1265
    if-eqz v9, :cond_3c

    .line 1266
    .line 1267
    invoke-virtual {v9, v14}, Lu0/b;->p(Ljava/lang/String;)V

    .line 1268
    .line 1269
    .line 1270
    goto :goto_16

    .line 1271
    :cond_3c
    new-instance v1, Ljava/lang/NullPointerException;

    .line 1272
    .line 1273
    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator"

    .line 1274
    .line 1275
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1276
    .line 1277
    .line 1278
    throw v1

    .line 1279
    :cond_3d
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v5

    .line 1283
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v5

    .line 1287
    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v5

    .line 1291
    iget-object v5, v5, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 1292
    .line 1293
    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1294
    .line 1295
    .line 1296
    sget-object v9, Lu0/b;->f:Lu0/b;

    .line 1297
    .line 1298
    if-nez v9, :cond_3e

    .line 1299
    .line 1300
    new-instance v9, Lu0/b;

    .line 1301
    .line 1302
    const/4 v10, 0x0

    .line 1303
    invoke-direct {v9, v10}, Lu0/b;-><init>(I)V

    .line 1304
    .line 1305
    .line 1306
    invoke-static {v5}, Ljava/text/BreakIterator;->getCharacterInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v5

    .line 1310
    const-string v10, "getCharacterInstance(locale)"

    .line 1311
    .line 1312
    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1313
    .line 1314
    .line 1315
    iput-object v5, v9, Lu0/b;->e:Ljava/lang/Object;

    .line 1316
    .line 1317
    sput-object v9, Lu0/b;->f:Lu0/b;

    .line 1318
    .line 1319
    :cond_3e
    sget-object v9, Lu0/b;->f:Lu0/b;

    .line 1320
    .line 1321
    if-eqz v9, :cond_3f

    .line 1322
    .line 1323
    invoke-virtual {v9, v14}, Lu0/b;->p(Ljava/lang/String;)V

    .line 1324
    .line 1325
    .line 1326
    goto :goto_16

    .line 1327
    :cond_3f
    new-instance v1, Ljava/lang/NullPointerException;

    .line 1328
    .line 1329
    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator"

    .line 1330
    .line 1331
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1332
    .line 1333
    .line 1334
    throw v1

    .line 1335
    :cond_40
    :goto_16
    if-nez v9, :cond_41

    .line 1336
    .line 1337
    goto/16 :goto_1d

    .line 1338
    .line 1339
    :cond_41
    invoke-virtual {v4, v8}, Lu0/s;->n(Lx0/k;)I

    .line 1340
    .line 1341
    .line 1342
    move-result v5

    .line 1343
    const/4 v10, -0x1

    .line 1344
    if-ne v5, v10, :cond_43

    .line 1345
    .line 1346
    if-eqz v2, :cond_42

    .line 1347
    .line 1348
    move v5, v6

    .line 1349
    goto :goto_17

    .line 1350
    :cond_42
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 1351
    .line 1352
    .line 1353
    move-result v5

    .line 1354
    :cond_43
    :goto_17
    if-eqz v2, :cond_44

    .line 1355
    .line 1356
    invoke-virtual {v9, v5}, LJ4/d;->f(I)[I

    .line 1357
    .line 1358
    .line 1359
    move-result-object v5

    .line 1360
    goto :goto_18

    .line 1361
    :cond_44
    invoke-virtual {v9, v5}, LJ4/d;->m(I)[I

    .line 1362
    .line 1363
    .line 1364
    move-result-object v5

    .line 1365
    :goto_18
    if-nez v5, :cond_45

    .line 1366
    .line 1367
    goto/16 :goto_1d

    .line 1368
    .line 1369
    :cond_45
    aget v11, v5, v6

    .line 1370
    .line 1371
    aget v12, v5, v15

    .line 1372
    .line 1373
    if-eqz v3, :cond_49

    .line 1374
    .line 1375
    sget-object v3, Lx0/n;->a:Lx0/q;

    .line 1376
    .line 1377
    invoke-virtual {v13, v3}, Lx0/g;->a(Lx0/q;)Z

    .line 1378
    .line 1379
    .line 1380
    move-result v3

    .line 1381
    if-nez v3, :cond_49

    .line 1382
    .line 1383
    sget-object v3, Lx0/n;->r:Lx0/q;

    .line 1384
    .line 1385
    invoke-virtual {v13, v3}, Lx0/g;->a(Lx0/q;)Z

    .line 1386
    .line 1387
    .line 1388
    move-result v3

    .line 1389
    if-eqz v3, :cond_49

    .line 1390
    .line 1391
    invoke-virtual {v4, v8}, Lu0/s;->o(Lx0/k;)I

    .line 1392
    .line 1393
    .line 1394
    move-result v3

    .line 1395
    const/4 v7, -0x1

    .line 1396
    if-ne v3, v7, :cond_47

    .line 1397
    .line 1398
    if-eqz v2, :cond_46

    .line 1399
    .line 1400
    move v3, v11

    .line 1401
    goto :goto_19

    .line 1402
    :cond_46
    move v3, v12

    .line 1403
    :cond_47
    :goto_19
    if-eqz v2, :cond_48

    .line 1404
    .line 1405
    move v5, v12

    .line 1406
    goto :goto_1b

    .line 1407
    :cond_48
    move v5, v11

    .line 1408
    goto :goto_1b

    .line 1409
    :cond_49
    if-eqz v2, :cond_4a

    .line 1410
    .line 1411
    move v3, v12

    .line 1412
    goto :goto_1a

    .line 1413
    :cond_4a
    move v3, v11

    .line 1414
    :goto_1a
    move v5, v3

    .line 1415
    :goto_1b
    if-eqz v2, :cond_4b

    .line 1416
    .line 1417
    const/16 v9, 0x100

    .line 1418
    .line 1419
    goto :goto_1c

    .line 1420
    :cond_4b
    const/16 v9, 0x200

    .line 1421
    .line 1422
    :goto_1c
    new-instance v7, Lu0/p;

    .line 1423
    .line 1424
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1425
    .line 1426
    .line 1427
    move-result-wide v13

    .line 1428
    move v10, v1

    .line 1429
    invoke-direct/range {v7 .. v14}, Lu0/p;-><init>(Lx0/k;IIIIJ)V

    .line 1430
    .line 1431
    .line 1432
    iput-object v7, v4, Lu0/s;->q:Lu0/p;

    .line 1433
    .line 1434
    invoke-virtual {v4, v8, v3, v5, v15}, Lu0/s;->B(Lx0/k;IIZ)Z

    .line 1435
    .line 1436
    .line 1437
    goto/16 :goto_e

    .line 1438
    .line 1439
    :cond_4c
    iget v2, v4, Lu0/s;->i:I

    .line 1440
    .line 1441
    if-ne v2, v1, :cond_51

    .line 1442
    .line 1443
    iput v11, v4, Lu0/s;->i:I

    .line 1444
    .line 1445
    invoke-virtual {v12}, Landroid/view/View;->invalidate()V

    .line 1446
    .line 1447
    .line 1448
    invoke-static {v4, v1, v5, v9, v7}, Lu0/s;->w(Lu0/s;IILjava/lang/Integer;I)V

    .line 1449
    .line 1450
    .line 1451
    goto/16 :goto_e

    .line 1452
    .line 1453
    :cond_4d
    invoke-virtual {v4}, Lu0/s;->r()Z

    .line 1454
    .line 1455
    .line 1456
    move-result v2

    .line 1457
    if-nez v2, :cond_4e

    .line 1458
    .line 1459
    goto :goto_1d

    .line 1460
    :cond_4e
    iget v2, v4, Lu0/s;->i:I

    .line 1461
    .line 1462
    if-ne v2, v1, :cond_4f

    .line 1463
    .line 1464
    goto :goto_1d

    .line 1465
    :cond_4f
    if-eq v2, v11, :cond_50

    .line 1466
    .line 1467
    invoke-static {v4, v2, v5, v9, v7}, Lu0/s;->w(Lu0/s;IILjava/lang/Integer;I)V

    .line 1468
    .line 1469
    .line 1470
    :cond_50
    iput v1, v4, Lu0/s;->i:I

    .line 1471
    .line 1472
    invoke-virtual {v12}, Landroid/view/View;->invalidate()V

    .line 1473
    .line 1474
    .line 1475
    const v2, 0x8000

    .line 1476
    .line 1477
    .line 1478
    invoke-static {v4, v1, v2, v9, v7}, Lu0/s;->w(Lu0/s;IILjava/lang/Integer;I)V

    .line 1479
    .line 1480
    .line 1481
    goto/16 :goto_e

    .line 1482
    .line 1483
    :cond_51
    :goto_1d
    return v6

    .line 1484
    :pswitch_1
    iget-object v4, v0, Ll1/f;->b:Ljava/lang/Object;

    .line 1485
    .line 1486
    check-cast v4, Lad/L;

    .line 1487
    .line 1488
    invoke-virtual {v4, v1, v2, v3}, Lad/L;->t(IILandroid/os/Bundle;)Z

    .line 1489
    .line 1490
    .line 1491
    move-result v1

    .line 1492
    return v1

    .line 1493
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_a
        0x20 -> :sswitch_9
        0x1000 -> :sswitch_8
        0x2000 -> :sswitch_8
        0x8000 -> :sswitch_7
        0x10000 -> :sswitch_6
        0x40000 -> :sswitch_5
        0x80000 -> :sswitch_4
        0x100000 -> :sswitch_3
        0x200000 -> :sswitch_2
        0x1020036 -> :sswitch_1
        0x102003d -> :sswitch_0
    .end sparse-switch

    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    :pswitch_data_1
    .packed-switch 0x1020038
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
