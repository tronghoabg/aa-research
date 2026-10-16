.class public final LI/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/n;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LI/i;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LI/h;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LI/h;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lz/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LI/h;->a:I

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LI/h;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lt0/r;LP/a;J)LD0/b;
    .locals 52

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    move-wide/from16 v2, p3

    .line 8
    .line 9
    const-string v6, ""

    .line 10
    .line 11
    const-string v7, "fontFamilyResolver"

    .line 12
    .line 13
    const-string v8, "density"

    .line 14
    .line 15
    sget-object v9, Lff/v;->a:Lff/v;

    .line 16
    .line 17
    iget-object v10, v0, LI/h;->b:Ljava/lang/Object;

    .line 18
    .line 19
    const/16 v17, 0x0

    .line 20
    .line 21
    const-string v11, "$this$measure"

    .line 22
    .line 23
    const/4 v12, 0x2

    .line 24
    const/4 v13, 0x0

    .line 25
    const/4 v14, 0x1

    .line 26
    iget v15, v0, LI/h;->a:I

    .line 27
    .line 28
    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    packed-switch v15, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    new-instance v4, Ljava/util/ArrayList;

    .line 35
    .line 36
    const/16 v6, 0xa

    .line 37
    .line 38
    invoke-static {v1, v6}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_0

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    check-cast v6, Lr0/m;

    .line 60
    .line 61
    invoke-interface {v6, v2, v3}, Lr0/m;->e(J)Lr0/t;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_1

    .line 74
    .line 75
    move-object/from16 v1, v17

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_1
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    move-object v2, v1

    .line 83
    check-cast v2, Lr0/t;

    .line 84
    .line 85
    iget v2, v2, Lr0/t;->a:I

    .line 86
    .line 87
    invoke-static {v4}, Lr7/e;->z(Ljava/util/List;)I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-gt v14, v3, :cond_3

    .line 92
    .line 93
    move v6, v14

    .line 94
    :goto_1
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    move-object v8, v7

    .line 99
    check-cast v8, Lr0/t;

    .line 100
    .line 101
    iget v8, v8, Lr0/t;->a:I

    .line 102
    .line 103
    if-ge v2, v8, :cond_2

    .line 104
    .line 105
    move-object v1, v7

    .line 106
    move v2, v8

    .line 107
    :cond_2
    if-eq v6, v3, :cond_3

    .line 108
    .line 109
    add-int/2addr v6, v14

    .line 110
    goto :goto_1

    .line 111
    :cond_3
    :goto_2
    check-cast v1, Lr0/t;

    .line 112
    .line 113
    if-eqz v1, :cond_4

    .line 114
    .line 115
    iget v1, v1, Lr0/t;->a:I

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_4
    move v1, v13

    .line 119
    :goto_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_5

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_5
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    move-object v3, v2

    .line 131
    check-cast v3, Lr0/t;

    .line 132
    .line 133
    iget v3, v3, Lr0/t;->b:I

    .line 134
    .line 135
    invoke-static {v4}, Lr7/e;->z(Ljava/util/List;)I

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-gt v14, v6, :cond_7

    .line 140
    .line 141
    move v7, v14

    .line 142
    :goto_4
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    move-object v9, v8

    .line 147
    check-cast v9, Lr0/t;

    .line 148
    .line 149
    iget v9, v9, Lr0/t;->b:I

    .line 150
    .line 151
    if-ge v3, v9, :cond_6

    .line 152
    .line 153
    move-object v2, v8

    .line 154
    move v3, v9

    .line 155
    :cond_6
    if-eq v7, v6, :cond_7

    .line 156
    .line 157
    add-int/2addr v7, v14

    .line 158
    goto :goto_4

    .line 159
    :cond_7
    move-object/from16 v17, v2

    .line 160
    .line 161
    :goto_5
    move-object/from16 v2, v17

    .line 162
    .line 163
    check-cast v2, Lr0/t;

    .line 164
    .line 165
    if-eqz v2, :cond_8

    .line 166
    .line 167
    iget v13, v2, Lr0/t;->b:I

    .line 168
    .line 169
    :cond_8
    check-cast v10, Lz/d;

    .line 170
    .line 171
    iget-object v2, v10, Lz/d;->a:LN/Y;

    .line 172
    .line 173
    invoke-static {v1, v13}, LBa/c;->a(II)J

    .line 174
    .line 175
    .line 176
    move-result-wide v6

    .line 177
    new-instance v3, LL0/h;

    .line 178
    .line 179
    invoke-direct {v3, v6, v7}, LL0/h;-><init>(J)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, v3}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    new-instance v2, LI/g;

    .line 186
    .line 187
    invoke-direct {v2, v4, v12}, LI/g;-><init>(Ljava/util/ArrayList;I)V

    .line 188
    .line 189
    .line 190
    invoke-static {v5, v1, v13, v2}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    return-object v1

    .line 195
    :pswitch_0
    check-cast v10, LI/i;

    .line 196
    .line 197
    iget-object v11, v10, LI/i;->a:LVa/X7;

    .line 198
    .line 199
    iget-object v15, v11, LVa/X7;->c:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v15, Lz0/n;

    .line 202
    .line 203
    iget-object v11, v11, LVa/X7;->a:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v11, LI/j;

    .line 206
    .line 207
    iget-object v13, v5, Lt0/r;->a:Lt0/t;

    .line 208
    .line 209
    iget-object v13, v13, Lt0/t;->p:LL0/i;

    .line 210
    .line 211
    const-string v14, "layoutDirection"

    .line 212
    .line 213
    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    iget-object v14, v11, LI/j;->g:LE0/e;

    .line 217
    .line 218
    iget-object v4, v11, LI/j;->f:LL0/b;

    .line 219
    .line 220
    iget-object v12, v11, LI/j;->a:Lz0/b;

    .line 221
    .line 222
    const-string v0, "style"

    .line 223
    .line 224
    iget v2, v11, LI/j;->e:I

    .line 225
    .line 226
    iget-boolean v3, v11, LI/j;->d:Z

    .line 227
    .line 228
    iget v5, v11, LI/j;->c:I

    .line 229
    .line 230
    move-object/from16 v26, v6

    .line 231
    .line 232
    iget-object v6, v11, LI/j;->b:Lz0/p;

    .line 233
    .line 234
    if-eqz v15, :cond_12

    .line 235
    .line 236
    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-static {v14, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    iget-object v1, v15, Lz0/n;->b:Lz0/d;

    .line 246
    .line 247
    move-object/from16 v22, v10

    .line 248
    .line 249
    iget-object v10, v1, Lz0/d;->a:LVa/Y7;

    .line 250
    .line 251
    invoke-virtual {v10}, LVa/Y7;->f()Z

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    if-eqz v10, :cond_9

    .line 256
    .line 257
    move/from16 v28, v3

    .line 258
    .line 259
    move-object/from16 v25, v7

    .line 260
    .line 261
    move-object/from16 v27, v12

    .line 262
    .line 263
    move-object v12, v14

    .line 264
    move-object v7, v15

    .line 265
    move-object/from16 v1, v22

    .line 266
    .line 267
    goto/16 :goto_a

    .line 268
    .line 269
    :cond_9
    iget-object v10, v15, Lz0/n;->a:Lz0/m;

    .line 270
    .line 271
    move-object/from16 v23, v15

    .line 272
    .line 273
    move-object v15, v7

    .line 274
    iget-object v7, v10, Lz0/m;->a:Lz0/b;

    .line 275
    .line 276
    invoke-virtual {v7, v12}, Lz0/b;->equals(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v24

    .line 280
    if-eqz v24, :cond_11

    .line 281
    .line 282
    move-object/from16 v24, v7

    .line 283
    .line 284
    iget-object v7, v10, Lz0/m;->b:Lz0/p;

    .line 285
    .line 286
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    move-object/from16 v27, v12

    .line 290
    .line 291
    if-eq v7, v6, :cond_b

    .line 292
    .line 293
    iget-object v12, v7, Lz0/p;->b:Lz0/h;

    .line 294
    .line 295
    move-object/from16 v25, v15

    .line 296
    .line 297
    iget-object v15, v6, Lz0/p;->b:Lz0/h;

    .line 298
    .line 299
    invoke-static {v12, v15}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v12

    .line 303
    if-eqz v12, :cond_a

    .line 304
    .line 305
    iget-object v7, v7, Lz0/p;->a:Lz0/j;

    .line 306
    .line 307
    iget-object v12, v6, Lz0/p;->a:Lz0/j;

    .line 308
    .line 309
    invoke-virtual {v7, v12}, Lz0/j;->a(Lz0/j;)Z

    .line 310
    .line 311
    .line 312
    move-result v7

    .line 313
    if-eqz v7, :cond_a

    .line 314
    .line 315
    goto :goto_8

    .line 316
    :cond_a
    :goto_6
    move/from16 v28, v3

    .line 317
    .line 318
    move-object v12, v14

    .line 319
    :goto_7
    move-object/from16 v1, v22

    .line 320
    .line 321
    move-object/from16 v7, v23

    .line 322
    .line 323
    goto/16 :goto_a

    .line 324
    .line 325
    :cond_b
    move-object/from16 v25, v15

    .line 326
    .line 327
    :goto_8
    invoke-virtual {v9, v9}, Lff/v;->equals(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v7

    .line 331
    if-eqz v7, :cond_a

    .line 332
    .line 333
    iget v7, v10, Lz0/m;->c:I

    .line 334
    .line 335
    if-ne v7, v5, :cond_a

    .line 336
    .line 337
    iget-boolean v7, v10, Lz0/m;->d:Z

    .line 338
    .line 339
    if-ne v7, v3, :cond_a

    .line 340
    .line 341
    iget v7, v10, Lz0/m;->e:I

    .line 342
    .line 343
    if-ne v7, v2, :cond_a

    .line 344
    .line 345
    iget-object v7, v10, Lz0/m;->f:LL0/b;

    .line 346
    .line 347
    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v7

    .line 351
    if-eqz v7, :cond_a

    .line 352
    .line 353
    iget-object v7, v10, Lz0/m;->g:LL0/i;

    .line 354
    .line 355
    if-ne v7, v13, :cond_a

    .line 356
    .line 357
    iget-object v7, v10, Lz0/m;->h:LE0/e;

    .line 358
    .line 359
    invoke-static {v7, v14}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v7

    .line 363
    if-nez v7, :cond_c

    .line 364
    .line 365
    goto :goto_6

    .line 366
    :cond_c
    invoke-static/range {p3 .. p4}, LL0/a;->g(J)I

    .line 367
    .line 368
    .line 369
    move-result v7

    .line 370
    move-object v12, v14

    .line 371
    iget-wide v14, v10, Lz0/m;->i:J

    .line 372
    .line 373
    move/from16 v28, v3

    .line 374
    .line 375
    invoke-static {v14, v15}, LL0/a;->g(J)I

    .line 376
    .line 377
    .line 378
    move-result v3

    .line 379
    if-eq v7, v3, :cond_d

    .line 380
    .line 381
    goto :goto_9

    .line 382
    :cond_d
    const/4 v3, 0x2

    .line 383
    if-nez v28, :cond_e

    .line 384
    .line 385
    if-ne v2, v3, :cond_f

    .line 386
    .line 387
    :cond_e
    invoke-static/range {p3 .. p4}, LL0/a;->e(J)I

    .line 388
    .line 389
    .line 390
    move-result v7

    .line 391
    invoke-static {v14, v15}, LL0/a;->e(J)I

    .line 392
    .line 393
    .line 394
    move-result v3

    .line 395
    if-ne v7, v3, :cond_10

    .line 396
    .line 397
    invoke-static/range {p3 .. p4}, LL0/a;->d(J)I

    .line 398
    .line 399
    .line 400
    move-result v3

    .line 401
    invoke-static {v14, v15}, LL0/a;->d(J)I

    .line 402
    .line 403
    .line 404
    move-result v7

    .line 405
    if-ne v3, v7, :cond_10

    .line 406
    .line 407
    :cond_f
    new-instance v6, Lz0/m;

    .line 408
    .line 409
    iget-object v13, v10, Lz0/m;->g:LL0/i;

    .line 410
    .line 411
    iget-object v14, v10, Lz0/m;->h:LE0/e;

    .line 412
    .line 413
    iget-object v8, v11, LI/j;->b:Lz0/p;

    .line 414
    .line 415
    iget v9, v10, Lz0/m;->c:I

    .line 416
    .line 417
    iget-boolean v0, v10, Lz0/m;->d:Z

    .line 418
    .line 419
    iget v11, v10, Lz0/m;->e:I

    .line 420
    .line 421
    iget-object v12, v10, Lz0/m;->f:LL0/b;

    .line 422
    .line 423
    move-wide/from16 v15, p3

    .line 424
    .line 425
    move v10, v0

    .line 426
    move-object/from16 v7, v24

    .line 427
    .line 428
    const/4 v0, 0x0

    .line 429
    const/4 v3, 0x2

    .line 430
    const/16 v18, 0x1

    .line 431
    .line 432
    const/16 v19, 0x5

    .line 433
    .line 434
    invoke-direct/range {v6 .. v16}, Lz0/m;-><init>(Lz0/b;Lz0/p;IZILL0/b;LL0/i;LE0/e;J)V

    .line 435
    .line 436
    .line 437
    move-wide v14, v15

    .line 438
    iget v2, v1, Lz0/d;->d:F

    .line 439
    .line 440
    float-to-double v4, v2

    .line 441
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 442
    .line 443
    .line 444
    move-result-wide v4

    .line 445
    double-to-float v2, v4

    .line 446
    float-to-int v2, v2

    .line 447
    iget v4, v1, Lz0/d;->e:F

    .line 448
    .line 449
    float-to-double v4, v4

    .line 450
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 451
    .line 452
    .line 453
    move-result-wide v4

    .line 454
    double-to-float v4, v4

    .line 455
    float-to-int v4, v4

    .line 456
    invoke-static {v2, v4}, LBa/c;->a(II)J

    .line 457
    .line 458
    .line 459
    move-result-wide v4

    .line 460
    invoke-static {v14, v15, v4, v5}, Lxg/g;->s(JJ)J

    .line 461
    .line 462
    .line 463
    move-result-wide v4

    .line 464
    new-instance v2, Lz0/n;

    .line 465
    .line 466
    invoke-direct {v2, v6, v1, v4, v5}, Lz0/n;-><init>(Lz0/m;Lz0/d;J)V

    .line 467
    .line 468
    .line 469
    move/from16 v29, v18

    .line 470
    .line 471
    move/from16 v5, v19

    .line 472
    .line 473
    move-object/from16 v27, v22

    .line 474
    .line 475
    move-object/from16 v3, v23

    .line 476
    .line 477
    goto/16 :goto_27

    .line 478
    .line 479
    :cond_10
    :goto_9
    move-wide/from16 v14, p3

    .line 480
    .line 481
    move-object/from16 v1, v22

    .line 482
    .line 483
    move-object/from16 v7, v23

    .line 484
    .line 485
    const/4 v3, 0x0

    .line 486
    const/4 v10, 0x1

    .line 487
    goto :goto_b

    .line 488
    :cond_11
    move/from16 v28, v3

    .line 489
    .line 490
    move-object/from16 v27, v12

    .line 491
    .line 492
    move-object v12, v14

    .line 493
    move-object/from16 v25, v15

    .line 494
    .line 495
    goto/16 :goto_7

    .line 496
    .line 497
    :cond_12
    move/from16 v28, v3

    .line 498
    .line 499
    move-object/from16 v25, v7

    .line 500
    .line 501
    move-object v1, v10

    .line 502
    move-object/from16 v27, v12

    .line 503
    .line 504
    move-object v12, v14

    .line 505
    move-object v7, v15

    .line 506
    :goto_a
    const/4 v3, 0x0

    .line 507
    const/4 v10, 0x1

    .line 508
    move-wide/from16 v14, p3

    .line 509
    .line 510
    :goto_b
    iget-object v3, v11, LI/j;->h:LVa/Y7;

    .line 511
    .line 512
    move/from16 v29, v10

    .line 513
    .line 514
    if-eqz v3, :cond_14

    .line 515
    .line 516
    iget-object v10, v11, LI/j;->i:LL0/i;

    .line 517
    .line 518
    if-ne v13, v10, :cond_14

    .line 519
    .line 520
    invoke-virtual {v3}, LVa/Y7;->f()Z

    .line 521
    .line 522
    .line 523
    move-result v10

    .line 524
    if-eqz v10, :cond_13

    .line 525
    .line 526
    goto :goto_c

    .line 527
    :cond_13
    move/from16 v30, v5

    .line 528
    .line 529
    move-object/from16 v31, v7

    .line 530
    .line 531
    move-object/from16 v50, v13

    .line 532
    .line 533
    move-object/from16 v34, v27

    .line 534
    .line 535
    move-object/from16 v27, v1

    .line 536
    .line 537
    goto/16 :goto_22

    .line 538
    .line 539
    :cond_14
    :goto_c
    iput-object v13, v11, LI/j;->i:LL0/i;

    .line 540
    .line 541
    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    new-instance v3, Lz0/p;

    .line 545
    .line 546
    sget v10, Lz0/l;->e:I

    .line 547
    .line 548
    iget-object v10, v6, Lz0/p;->a:Lz0/j;

    .line 549
    .line 550
    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    move/from16 v30, v5

    .line 554
    .line 555
    sget-object v5, Lz0/k;->i:Lz0/k;

    .line 556
    .line 557
    move-object/from16 v31, v7

    .line 558
    .line 559
    iget-object v7, v10, Lz0/j;->a:LK0/g;

    .line 560
    .line 561
    invoke-interface {v7, v5}, LK0/g;->b(Ltf/a;)LK0/g;

    .line 562
    .line 563
    .line 564
    move-result-object v33

    .line 565
    move-object/from16 v24, v12

    .line 566
    .line 567
    move-object v5, v13

    .line 568
    iget-wide v12, v10, Lz0/j;->b:J

    .line 569
    .line 570
    invoke-static {v12, v13}, LFe/b;->H(J)Z

    .line 571
    .line 572
    .line 573
    move-result v7

    .line 574
    if-eqz v7, :cond_15

    .line 575
    .line 576
    sget-wide v12, Lz0/l;->a:J

    .line 577
    .line 578
    :cond_15
    move-wide/from16 v34, v12

    .line 579
    .line 580
    iget-object v7, v10, Lz0/j;->c:LE0/l;

    .line 581
    .line 582
    if-nez v7, :cond_16

    .line 583
    .line 584
    sget-object v7, LE0/l;->d:LE0/l;

    .line 585
    .line 586
    :cond_16
    move-object/from16 v36, v7

    .line 587
    .line 588
    iget-object v7, v10, Lz0/j;->d:LE0/j;

    .line 589
    .line 590
    if-eqz v7, :cond_17

    .line 591
    .line 592
    iget v13, v7, LE0/j;->a:I

    .line 593
    .line 594
    goto :goto_d

    .line 595
    :cond_17
    const/4 v13, 0x0

    .line 596
    :goto_d
    new-instance v7, LE0/j;

    .line 597
    .line 598
    invoke-direct {v7, v13}, LE0/j;-><init>(I)V

    .line 599
    .line 600
    .line 601
    iget-object v12, v10, Lz0/j;->e:LE0/k;

    .line 602
    .line 603
    if-eqz v12, :cond_18

    .line 604
    .line 605
    iget v12, v12, LE0/k;->a:I

    .line 606
    .line 607
    goto :goto_e

    .line 608
    :cond_18
    move/from16 v12, v29

    .line 609
    .line 610
    :goto_e
    new-instance v13, LE0/k;

    .line 611
    .line 612
    invoke-direct {v13, v12}, LE0/k;-><init>(I)V

    .line 613
    .line 614
    .line 615
    iget-object v12, v10, Lz0/j;->f:LE0/o;

    .line 616
    .line 617
    if-nez v12, :cond_19

    .line 618
    .line 619
    sget-object v12, LE0/o;->a:LE0/c;

    .line 620
    .line 621
    :cond_19
    move-object/from16 v39, v12

    .line 622
    .line 623
    iget-object v12, v10, Lz0/j;->g:Ljava/lang/String;

    .line 624
    .line 625
    if-nez v12, :cond_1a

    .line 626
    .line 627
    move-object/from16 v40, v26

    .line 628
    .line 629
    :goto_f
    move-object/from16 v38, v13

    .line 630
    .line 631
    goto :goto_10

    .line 632
    :cond_1a
    move-object/from16 v40, v12

    .line 633
    .line 634
    goto :goto_f

    .line 635
    :goto_10
    iget-wide v12, v10, Lz0/j;->h:J

    .line 636
    .line 637
    invoke-static {v12, v13}, LFe/b;->H(J)Z

    .line 638
    .line 639
    .line 640
    move-result v19

    .line 641
    if-eqz v19, :cond_1b

    .line 642
    .line 643
    sget-wide v12, Lz0/l;->b:J

    .line 644
    .line 645
    :cond_1b
    move-wide/from16 v41, v12

    .line 646
    .line 647
    iget-object v12, v10, Lz0/j;->i:LK0/a;

    .line 648
    .line 649
    if-eqz v12, :cond_1c

    .line 650
    .line 651
    iget v12, v12, LK0/a;->a:F

    .line 652
    .line 653
    goto :goto_11

    .line 654
    :cond_1c
    const/4 v12, 0x0

    .line 655
    :goto_11
    new-instance v13, LK0/a;

    .line 656
    .line 657
    invoke-direct {v13, v12}, LK0/a;-><init>(F)V

    .line 658
    .line 659
    .line 660
    iget-object v12, v10, Lz0/j;->j:LK0/h;

    .line 661
    .line 662
    if-nez v12, :cond_1d

    .line 663
    .line 664
    sget-object v12, LK0/h;->c:LK0/h;

    .line 665
    .line 666
    :cond_1d
    move-object/from16 v44, v12

    .line 667
    .line 668
    iget-object v12, v10, Lz0/j;->k:LG0/c;

    .line 669
    .line 670
    if-nez v12, :cond_1f

    .line 671
    .line 672
    sget-object v12, LG0/e;->a:LG0/d;

    .line 673
    .line 674
    invoke-interface {v12}, LG0/d;->b()Ljava/util/List;

    .line 675
    .line 676
    .line 677
    move-result-object v12

    .line 678
    move-object/from16 v50, v5

    .line 679
    .line 680
    new-instance v5, Ljava/util/ArrayList;

    .line 681
    .line 682
    move-object/from16 v37, v7

    .line 683
    .line 684
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 685
    .line 686
    .line 687
    move-result v7

    .line 688
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 689
    .line 690
    .line 691
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 692
    .line 693
    .line 694
    move-result v7

    .line 695
    move-object/from16 v51, v9

    .line 696
    .line 697
    const/4 v9, 0x0

    .line 698
    :goto_12
    if-ge v9, v7, :cond_1e

    .line 699
    .line 700
    invoke-interface {v12, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object v19

    .line 704
    move/from16 v21, v7

    .line 705
    .line 706
    move-object/from16 v7, v19

    .line 707
    .line 708
    check-cast v7, LG0/a;

    .line 709
    .line 710
    move/from16 v19, v9

    .line 711
    .line 712
    new-instance v9, LG0/b;

    .line 713
    .line 714
    invoke-direct {v9, v7}, LG0/b;-><init>(LG0/a;)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 718
    .line 719
    .line 720
    add-int/lit8 v9, v19, 0x1

    .line 721
    .line 722
    move/from16 v7, v21

    .line 723
    .line 724
    goto :goto_12

    .line 725
    :cond_1e
    new-instance v12, LG0/c;

    .line 726
    .line 727
    invoke-direct {v12, v5}, LG0/c;-><init>(Ljava/util/ArrayList;)V

    .line 728
    .line 729
    .line 730
    :goto_13
    move-object/from16 v45, v12

    .line 731
    .line 732
    goto :goto_14

    .line 733
    :cond_1f
    move-object/from16 v50, v5

    .line 734
    .line 735
    move-object/from16 v37, v7

    .line 736
    .line 737
    move-object/from16 v51, v9

    .line 738
    .line 739
    goto :goto_13

    .line 740
    :goto_14
    sget-wide v21, Le0/q;->i:J

    .line 741
    .line 742
    move-object/from16 v43, v13

    .line 743
    .line 744
    iget-wide v12, v10, Lz0/j;->l:J

    .line 745
    .line 746
    cmp-long v5, v12, v21

    .line 747
    .line 748
    if-eqz v5, :cond_20

    .line 749
    .line 750
    :goto_15
    move-wide/from16 v46, v12

    .line 751
    .line 752
    goto :goto_16

    .line 753
    :cond_20
    sget-wide v12, Lz0/l;->c:J

    .line 754
    .line 755
    goto :goto_15

    .line 756
    :goto_16
    iget-object v5, v10, Lz0/j;->m:LK0/d;

    .line 757
    .line 758
    if-nez v5, :cond_21

    .line 759
    .line 760
    sget-object v5, LK0/d;->b:LK0/d;

    .line 761
    .line 762
    :cond_21
    move-object/from16 v48, v5

    .line 763
    .line 764
    iget-object v5, v10, Lz0/j;->n:Le0/D;

    .line 765
    .line 766
    if-nez v5, :cond_22

    .line 767
    .line 768
    sget-object v5, Le0/D;->d:Le0/D;

    .line 769
    .line 770
    :cond_22
    move-object/from16 v49, v5

    .line 771
    .line 772
    new-instance v32, Lz0/j;

    .line 773
    .line 774
    invoke-direct/range {v32 .. v49}, Lz0/j;-><init>(LK0/g;JLE0/l;LE0/j;LE0/k;LE0/o;Ljava/lang/String;JLK0/a;LK0/h;LG0/c;JLK0/d;Le0/D;)V

    .line 775
    .line 776
    .line 777
    move-object/from16 v5, v32

    .line 778
    .line 779
    sget v7, Lz0/i;->b:I

    .line 780
    .line 781
    iget-object v6, v6, Lz0/p;->b:Lz0/h;

    .line 782
    .line 783
    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 784
    .line 785
    .line 786
    new-instance v32, Lz0/h;

    .line 787
    .line 788
    iget-object v0, v6, Lz0/h;->a:LK0/c;

    .line 789
    .line 790
    if-eqz v0, :cond_23

    .line 791
    .line 792
    iget v0, v0, LK0/c;->a:I

    .line 793
    .line 794
    goto :goto_17

    .line 795
    :cond_23
    const/4 v0, 0x5

    .line 796
    :goto_17
    new-instance v7, LK0/c;

    .line 797
    .line 798
    invoke-direct {v7, v0}, LK0/c;-><init>(I)V

    .line 799
    .line 800
    .line 801
    iget-object v0, v6, Lz0/h;->b:LK0/e;

    .line 802
    .line 803
    if-nez v0, :cond_24

    .line 804
    .line 805
    goto :goto_18

    .line 806
    :cond_24
    const/4 v9, 0x3

    .line 807
    iget v10, v0, LK0/e;->a:I

    .line 808
    .line 809
    if-ne v10, v9, :cond_27

    .line 810
    .line 811
    invoke-virtual/range {v50 .. v50}, Ljava/lang/Enum;->ordinal()I

    .line 812
    .line 813
    .line 814
    move-result v0

    .line 815
    if-eqz v0, :cond_26

    .line 816
    .line 817
    move/from16 v10, v29

    .line 818
    .line 819
    if-ne v0, v10, :cond_25

    .line 820
    .line 821
    const/4 v12, 0x5

    .line 822
    goto :goto_19

    .line 823
    :cond_25
    new-instance v0, LE5/Q;

    .line 824
    .line 825
    const/16 v1, 0x9

    .line 826
    .line 827
    const/4 v3, 0x0

    .line 828
    invoke-direct {v0, v3, v1}, LE5/Q;-><init>(BI)V

    .line 829
    .line 830
    .line 831
    throw v0

    .line 832
    :cond_26
    const/4 v12, 0x4

    .line 833
    goto :goto_19

    .line 834
    :cond_27
    :goto_18
    if-nez v0, :cond_2a

    .line 835
    .line 836
    invoke-virtual/range {v50 .. v50}, Ljava/lang/Enum;->ordinal()I

    .line 837
    .line 838
    .line 839
    move-result v0

    .line 840
    if-eqz v0, :cond_29

    .line 841
    .line 842
    const/4 v10, 0x1

    .line 843
    if-ne v0, v10, :cond_28

    .line 844
    .line 845
    const/4 v12, 0x2

    .line 846
    goto :goto_19

    .line 847
    :cond_28
    new-instance v0, LE5/Q;

    .line 848
    .line 849
    const/16 v1, 0x9

    .line 850
    .line 851
    const/4 v3, 0x0

    .line 852
    invoke-direct {v0, v3, v1}, LE5/Q;-><init>(BI)V

    .line 853
    .line 854
    .line 855
    throw v0

    .line 856
    :cond_29
    const/4 v12, 0x1

    .line 857
    goto :goto_19

    .line 858
    :cond_2a
    iget v12, v0, LK0/e;->a:I

    .line 859
    .line 860
    :goto_19
    new-instance v0, LK0/e;

    .line 861
    .line 862
    invoke-direct {v0, v12}, LK0/e;-><init>(I)V

    .line 863
    .line 864
    .line 865
    iget-wide v9, v6, Lz0/h;->c:J

    .line 866
    .line 867
    invoke-static {v9, v10}, LFe/b;->H(J)Z

    .line 868
    .line 869
    .line 870
    move-result v12

    .line 871
    if-eqz v12, :cond_2b

    .line 872
    .line 873
    sget-wide v9, Lz0/i;->a:J

    .line 874
    .line 875
    :cond_2b
    move-wide/from16 v35, v9

    .line 876
    .line 877
    iget-object v6, v6, Lz0/h;->d:LK0/i;

    .line 878
    .line 879
    if-nez v6, :cond_2c

    .line 880
    .line 881
    sget-object v6, LK0/i;->c:LK0/i;

    .line 882
    .line 883
    :cond_2c
    move-object/from16 v37, v6

    .line 884
    .line 885
    const/16 v38, 0x0

    .line 886
    .line 887
    move-object/from16 v34, v0

    .line 888
    .line 889
    move-object/from16 v33, v7

    .line 890
    .line 891
    invoke-direct/range {v32 .. v38}, Lz0/h;-><init>(LK0/c;LK0/e;JLK0/i;LS3/f;)V

    .line 892
    .line 893
    .line 894
    move-object/from16 v0, v32

    .line 895
    .line 896
    const/4 v6, 0x0

    .line 897
    invoke-direct {v3, v5, v0, v6}, Lz0/p;-><init>(Lz0/j;Lz0/h;I)V

    .line 898
    .line 899
    .line 900
    new-instance v0, LVa/Y7;

    .line 901
    .line 902
    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 903
    .line 904
    .line 905
    move-object/from16 v12, v24

    .line 906
    .line 907
    move-object/from16 v5, v25

    .line 908
    .line 909
    invoke-static {v12, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 910
    .line 911
    .line 912
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 913
    .line 914
    .line 915
    move-object/from16 v7, v27

    .line 916
    .line 917
    iput-object v7, v0, LVa/Y7;->a:Ljava/lang/Object;

    .line 918
    .line 919
    sget-object v5, Lef/j;->c:Lef/j;

    .line 920
    .line 921
    new-instance v6, Lz0/e;

    .line 922
    .line 923
    const/4 v10, 0x1

    .line 924
    invoke-direct {v6, v0, v10}, Lz0/e;-><init>(LVa/Y7;I)V

    .line 925
    .line 926
    .line 927
    invoke-static {v5, v6}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    .line 928
    .line 929
    .line 930
    move-result-object v6

    .line 931
    iput-object v6, v0, LVa/Y7;->b:Ljava/lang/Object;

    .line 932
    .line 933
    new-instance v6, Lz0/e;

    .line 934
    .line 935
    const/4 v8, 0x0

    .line 936
    invoke-direct {v6, v0, v8}, Lz0/e;-><init>(LVa/Y7;I)V

    .line 937
    .line 938
    .line 939
    invoke-static {v5, v6}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    .line 940
    .line 941
    .line 942
    move-result-object v5

    .line 943
    iput-object v5, v0, LVa/Y7;->c:Ljava/lang/Object;

    .line 944
    .line 945
    sget v5, Lz0/c;->a:I

    .line 946
    .line 947
    iget-object v5, v3, Lz0/p;->b:Lz0/h;

    .line 948
    .line 949
    const-string v6, "defaultParagraphStyle"

    .line 950
    .line 951
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 952
    .line 953
    .line 954
    iget-object v6, v7, Lz0/b;->a:Ljava/lang/String;

    .line 955
    .line 956
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 957
    .line 958
    .line 959
    move-result v8

    .line 960
    new-instance v9, Ljava/util/ArrayList;

    .line 961
    .line 962
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 963
    .line 964
    .line 965
    iget-object v10, v7, Lz0/b;->c:Ljava/util/List;

    .line 966
    .line 967
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 968
    .line 969
    .line 970
    move-result v13

    .line 971
    move-object/from16 v25, v4

    .line 972
    .line 973
    move-object/from16 v24, v12

    .line 974
    .line 975
    const/4 v4, 0x0

    .line 976
    const/4 v12, 0x0

    .line 977
    :goto_1a
    if-ge v4, v13, :cond_2e

    .line 978
    .line 979
    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 980
    .line 981
    .line 982
    move-result-object v19

    .line 983
    move/from16 v20, v4

    .line 984
    .line 985
    move-object/from16 v4, v19

    .line 986
    .line 987
    check-cast v4, Lz0/a;

    .line 988
    .line 989
    move-object/from16 v19, v10

    .line 990
    .line 991
    iget-object v10, v4, Lz0/a;->a:Ljava/lang/Object;

    .line 992
    .line 993
    check-cast v10, Lz0/h;

    .line 994
    .line 995
    move/from16 v21, v13

    .line 996
    .line 997
    iget v13, v4, Lz0/a;->b:I

    .line 998
    .line 999
    move-object/from16 v27, v1

    .line 1000
    .line 1001
    if-eq v13, v12, :cond_2d

    .line 1002
    .line 1003
    new-instance v1, Lz0/a;

    .line 1004
    .line 1005
    invoke-direct {v1, v5, v12, v13}, Lz0/a;-><init>(Ljava/lang/Object;II)V

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1009
    .line 1010
    .line 1011
    :cond_2d
    new-instance v1, Lz0/a;

    .line 1012
    .line 1013
    invoke-virtual {v5, v10}, Lz0/h;->a(Lz0/h;)Lz0/h;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v10

    .line 1017
    iget v12, v4, Lz0/a;->c:I

    .line 1018
    .line 1019
    invoke-direct {v1, v10, v13, v12}, Lz0/a;-><init>(Ljava/lang/Object;II)V

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1023
    .line 1024
    .line 1025
    const/16 v29, 0x1

    .line 1026
    .line 1027
    add-int/lit8 v4, v20, 0x1

    .line 1028
    .line 1029
    move-object/from16 v10, v19

    .line 1030
    .line 1031
    move/from16 v13, v21

    .line 1032
    .line 1033
    move-object/from16 v1, v27

    .line 1034
    .line 1035
    goto :goto_1a

    .line 1036
    :cond_2e
    move-object/from16 v27, v1

    .line 1037
    .line 1038
    if-eq v12, v8, :cond_2f

    .line 1039
    .line 1040
    new-instance v1, Lz0/a;

    .line 1041
    .line 1042
    invoke-direct {v1, v5, v12, v8}, Lz0/a;-><init>(Ljava/lang/Object;II)V

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1046
    .line 1047
    .line 1048
    :cond_2f
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1049
    .line 1050
    .line 1051
    move-result v1

    .line 1052
    if-eqz v1, :cond_30

    .line 1053
    .line 1054
    new-instance v1, Lz0/a;

    .line 1055
    .line 1056
    const/4 v8, 0x0

    .line 1057
    invoke-direct {v1, v5, v8, v8}, Lz0/a;-><init>(Ljava/lang/Object;II)V

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1061
    .line 1062
    .line 1063
    :cond_30
    new-instance v1, Ljava/util/ArrayList;

    .line 1064
    .line 1065
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1066
    .line 1067
    .line 1068
    move-result v4

    .line 1069
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1070
    .line 1071
    .line 1072
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1073
    .line 1074
    .line 1075
    move-result v4

    .line 1076
    const/4 v13, 0x0

    .line 1077
    :goto_1b
    if-ge v13, v4, :cond_3a

    .line 1078
    .line 1079
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v8

    .line 1083
    check-cast v8, Lz0/a;

    .line 1084
    .line 1085
    iget v10, v8, Lz0/a;->b:I

    .line 1086
    .line 1087
    iget v12, v8, Lz0/a;->c:I

    .line 1088
    .line 1089
    move/from16 v32, v4

    .line 1090
    .line 1091
    if-eq v10, v12, :cond_31

    .line 1092
    .line 1093
    invoke-virtual {v6, v10, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v4

    .line 1097
    move-object/from16 v33, v6

    .line 1098
    .line 1099
    const-string v6, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 1100
    .line 1101
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1102
    .line 1103
    .line 1104
    move-object/from16 v20, v4

    .line 1105
    .line 1106
    goto :goto_1c

    .line 1107
    :cond_31
    move-object/from16 v33, v6

    .line 1108
    .line 1109
    move-object/from16 v20, v26

    .line 1110
    .line 1111
    :goto_1c
    if-ne v10, v12, :cond_32

    .line 1112
    .line 1113
    move-object/from16 v34, v7

    .line 1114
    .line 1115
    move-object/from16 v35, v9

    .line 1116
    .line 1117
    move/from16 v36, v13

    .line 1118
    .line 1119
    move-object/from16 v4, v51

    .line 1120
    .line 1121
    goto/16 :goto_1f

    .line 1122
    .line 1123
    :cond_32
    iget-object v4, v7, Lz0/b;->b:Ljava/util/List;

    .line 1124
    .line 1125
    if-nez v10, :cond_34

    .line 1126
    .line 1127
    invoke-virtual/range {v33 .. v33}, Ljava/lang/String;->length()I

    .line 1128
    .line 1129
    .line 1130
    move-result v6

    .line 1131
    if-lt v12, v6, :cond_34

    .line 1132
    .line 1133
    move-object/from16 v34, v7

    .line 1134
    .line 1135
    move-object/from16 v35, v9

    .line 1136
    .line 1137
    :cond_33
    move/from16 v36, v13

    .line 1138
    .line 1139
    goto/16 :goto_1f

    .line 1140
    .line 1141
    :cond_34
    new-instance v6, Ljava/util/ArrayList;

    .line 1142
    .line 1143
    move-object/from16 v34, v7

    .line 1144
    .line 1145
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1146
    .line 1147
    .line 1148
    move-result v7

    .line 1149
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 1150
    .line 1151
    .line 1152
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1153
    .line 1154
    .line 1155
    move-result v7

    .line 1156
    move-object/from16 v35, v9

    .line 1157
    .line 1158
    const/4 v9, 0x0

    .line 1159
    :goto_1d
    if-ge v9, v7, :cond_36

    .line 1160
    .line 1161
    move/from16 v19, v7

    .line 1162
    .line 1163
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v7

    .line 1167
    move-object/from16 v21, v4

    .line 1168
    .line 1169
    move-object v4, v7

    .line 1170
    check-cast v4, Lz0/a;

    .line 1171
    .line 1172
    move/from16 v22, v9

    .line 1173
    .line 1174
    iget v9, v4, Lz0/a;->b:I

    .line 1175
    .line 1176
    iget v4, v4, Lz0/a;->c:I

    .line 1177
    .line 1178
    invoke-static {v10, v12, v9, v4}, Lz0/c;->b(IIII)Z

    .line 1179
    .line 1180
    .line 1181
    move-result v4

    .line 1182
    if-eqz v4, :cond_35

    .line 1183
    .line 1184
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1185
    .line 1186
    .line 1187
    :cond_35
    const/16 v29, 0x1

    .line 1188
    .line 1189
    add-int/lit8 v9, v22, 0x1

    .line 1190
    .line 1191
    move/from16 v7, v19

    .line 1192
    .line 1193
    move-object/from16 v4, v21

    .line 1194
    .line 1195
    goto :goto_1d

    .line 1196
    :cond_36
    new-instance v4, Ljava/util/ArrayList;

    .line 1197
    .line 1198
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1199
    .line 1200
    .line 1201
    move-result v7

    .line 1202
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1206
    .line 1207
    .line 1208
    move-result v7

    .line 1209
    const/4 v9, 0x0

    .line 1210
    :goto_1e
    if-ge v9, v7, :cond_33

    .line 1211
    .line 1212
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v19

    .line 1216
    move-object/from16 v21, v6

    .line 1217
    .line 1218
    move-object/from16 v6, v19

    .line 1219
    .line 1220
    check-cast v6, Lz0/a;

    .line 1221
    .line 1222
    move/from16 v19, v7

    .line 1223
    .line 1224
    new-instance v7, Lz0/a;

    .line 1225
    .line 1226
    move/from16 v22, v9

    .line 1227
    .line 1228
    iget-object v9, v6, Lz0/a;->a:Ljava/lang/Object;

    .line 1229
    .line 1230
    move/from16 v36, v13

    .line 1231
    .line 1232
    iget v13, v6, Lz0/a;->b:I

    .line 1233
    .line 1234
    invoke-static {v13, v10, v12}, Landroid/support/v4/media/session/b;->S(III)I

    .line 1235
    .line 1236
    .line 1237
    move-result v13

    .line 1238
    sub-int/2addr v13, v10

    .line 1239
    iget v6, v6, Lz0/a;->c:I

    .line 1240
    .line 1241
    invoke-static {v6, v10, v12}, Landroid/support/v4/media/session/b;->S(III)I

    .line 1242
    .line 1243
    .line 1244
    move-result v6

    .line 1245
    sub-int/2addr v6, v10

    .line 1246
    invoke-direct {v7, v9, v13, v6}, Lz0/a;-><init>(Ljava/lang/Object;II)V

    .line 1247
    .line 1248
    .line 1249
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1250
    .line 1251
    .line 1252
    const/16 v29, 0x1

    .line 1253
    .line 1254
    add-int/lit8 v9, v22, 0x1

    .line 1255
    .line 1256
    move/from16 v7, v19

    .line 1257
    .line 1258
    move-object/from16 v6, v21

    .line 1259
    .line 1260
    move/from16 v13, v36

    .line 1261
    .line 1262
    goto :goto_1e

    .line 1263
    :goto_1f
    const-string v6, "spanStyles"

    .line 1264
    .line 1265
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1266
    .line 1267
    .line 1268
    iget-object v6, v8, Lz0/a;->a:Ljava/lang/Object;

    .line 1269
    .line 1270
    check-cast v6, Lz0/h;

    .line 1271
    .line 1272
    iget-object v7, v6, Lz0/h;->b:LK0/e;

    .line 1273
    .line 1274
    if-eqz v7, :cond_37

    .line 1275
    .line 1276
    goto :goto_20

    .line 1277
    :cond_37
    new-instance v37, Lz0/h;

    .line 1278
    .line 1279
    iget-object v7, v6, Lz0/h;->d:LK0/i;

    .line 1280
    .line 1281
    const/16 v43, 0x0

    .line 1282
    .line 1283
    iget-object v9, v6, Lz0/h;->a:LK0/c;

    .line 1284
    .line 1285
    iget-object v10, v5, Lz0/h;->b:LK0/e;

    .line 1286
    .line 1287
    move-object/from16 v42, v7

    .line 1288
    .line 1289
    iget-wide v6, v6, Lz0/h;->c:J

    .line 1290
    .line 1291
    move-wide/from16 v40, v6

    .line 1292
    .line 1293
    move-object/from16 v38, v9

    .line 1294
    .line 1295
    move-object/from16 v39, v10

    .line 1296
    .line 1297
    invoke-direct/range {v37 .. v43}, Lz0/h;-><init>(LK0/c;LK0/e;JLK0/i;LS3/f;)V

    .line 1298
    .line 1299
    .line 1300
    move-object/from16 v6, v37

    .line 1301
    .line 1302
    :goto_20
    new-instance v7, Lz0/g;

    .line 1303
    .line 1304
    new-instance v9, Lz0/p;

    .line 1305
    .line 1306
    invoke-virtual {v5, v6}, Lz0/h;->a(Lz0/h;)Lz0/h;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v6

    .line 1310
    iget-object v10, v3, Lz0/p;->a:Lz0/j;

    .line 1311
    .line 1312
    invoke-direct {v9, v10, v6}, Lz0/p;-><init>(Lz0/j;Lz0/h;)V

    .line 1313
    .line 1314
    .line 1315
    new-instance v6, Ljava/util/ArrayList;

    .line 1316
    .line 1317
    const/4 v10, 0x0

    .line 1318
    invoke-direct {v6, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 1319
    .line 1320
    .line 1321
    new-instance v10, Ljava/util/ArrayList;

    .line 1322
    .line 1323
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1324
    .line 1325
    .line 1326
    move-result v13

    .line 1327
    invoke-direct {v10, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 1328
    .line 1329
    .line 1330
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1331
    .line 1332
    .line 1333
    move-result v13

    .line 1334
    move-object/from16 v37, v3

    .line 1335
    .line 1336
    move-object/from16 v22, v4

    .line 1337
    .line 1338
    const/4 v3, 0x0

    .line 1339
    :goto_21
    iget v4, v8, Lz0/a;->b:I

    .line 1340
    .line 1341
    if-ge v3, v13, :cond_39

    .line 1342
    .line 1343
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v19

    .line 1347
    move/from16 v21, v3

    .line 1348
    .line 1349
    move-object/from16 v3, v19

    .line 1350
    .line 1351
    check-cast v3, Lz0/a;

    .line 1352
    .line 1353
    move-object/from16 v38, v5

    .line 1354
    .line 1355
    iget v5, v3, Lz0/a;->b:I

    .line 1356
    .line 1357
    if-gt v4, v5, :cond_38

    .line 1358
    .line 1359
    move/from16 v19, v5

    .line 1360
    .line 1361
    iget v5, v3, Lz0/a;->c:I

    .line 1362
    .line 1363
    if-gt v5, v12, :cond_38

    .line 1364
    .line 1365
    move/from16 v23, v5

    .line 1366
    .line 1367
    new-instance v5, Lz0/a;

    .line 1368
    .line 1369
    move-object/from16 v39, v6

    .line 1370
    .line 1371
    sub-int v6, v19, v4

    .line 1372
    .line 1373
    sub-int v4, v23, v4

    .line 1374
    .line 1375
    iget-object v3, v3, Lz0/a;->a:Ljava/lang/Object;

    .line 1376
    .line 1377
    invoke-direct {v5, v3, v6, v4}, Lz0/a;-><init>(Ljava/lang/Object;II)V

    .line 1378
    .line 1379
    .line 1380
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1381
    .line 1382
    .line 1383
    const/16 v29, 0x1

    .line 1384
    .line 1385
    add-int/lit8 v3, v21, 0x1

    .line 1386
    .line 1387
    move-object/from16 v5, v38

    .line 1388
    .line 1389
    move-object/from16 v6, v39

    .line 1390
    .line 1391
    goto :goto_21

    .line 1392
    :cond_38
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1393
    .line 1394
    const-string v1, "placeholder can not overlap with paragraph."

    .line 1395
    .line 1396
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1397
    .line 1398
    .line 1399
    throw v0

    .line 1400
    :cond_39
    move-object/from16 v38, v5

    .line 1401
    .line 1402
    new-instance v19, LH0/c;

    .line 1403
    .line 1404
    move-object/from16 v21, v9

    .line 1405
    .line 1406
    move-object/from16 v23, v10

    .line 1407
    .line 1408
    invoke-direct/range {v19 .. v25}, LH0/c;-><init>(Ljava/lang/String;Lz0/p;Ljava/util/List;Ljava/util/ArrayList;LE0/e;LL0/b;)V

    .line 1409
    .line 1410
    .line 1411
    move-object/from16 v3, v19

    .line 1412
    .line 1413
    invoke-direct {v7, v3, v4, v12}, Lz0/g;-><init>(LH0/c;II)V

    .line 1414
    .line 1415
    .line 1416
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1417
    .line 1418
    .line 1419
    const/16 v29, 0x1

    .line 1420
    .line 1421
    add-int/lit8 v13, v36, 0x1

    .line 1422
    .line 1423
    move/from16 v4, v32

    .line 1424
    .line 1425
    move-object/from16 v6, v33

    .line 1426
    .line 1427
    move-object/from16 v7, v34

    .line 1428
    .line 1429
    move-object/from16 v9, v35

    .line 1430
    .line 1431
    move-object/from16 v3, v37

    .line 1432
    .line 1433
    move-object/from16 v5, v38

    .line 1434
    .line 1435
    goto/16 :goto_1b

    .line 1436
    .line 1437
    :cond_3a
    move-object/from16 v34, v7

    .line 1438
    .line 1439
    const/16 v29, 0x1

    .line 1440
    .line 1441
    iput-object v1, v0, LVa/Y7;->d:Ljava/lang/Object;

    .line 1442
    .line 1443
    move-object v3, v0

    .line 1444
    :goto_22
    iput-object v3, v11, LI/j;->h:LVa/Y7;

    .line 1445
    .line 1446
    invoke-static {v14, v15}, LL0/a;->g(J)I

    .line 1447
    .line 1448
    .line 1449
    move-result v0

    .line 1450
    if-nez v28, :cond_3b

    .line 1451
    .line 1452
    const/4 v3, 0x2

    .line 1453
    if-ne v2, v3, :cond_3c

    .line 1454
    .line 1455
    :cond_3b
    invoke-static {v14, v15}, LL0/a;->c(J)Z

    .line 1456
    .line 1457
    .line 1458
    move-result v1

    .line 1459
    if-eqz v1, :cond_3c

    .line 1460
    .line 1461
    invoke-static {v14, v15}, LL0/a;->e(J)I

    .line 1462
    .line 1463
    .line 1464
    move-result v1

    .line 1465
    goto :goto_23

    .line 1466
    :cond_3c
    const v1, 0x7fffffff

    .line 1467
    .line 1468
    .line 1469
    :goto_23
    if-nez v28, :cond_3d

    .line 1470
    .line 1471
    const/4 v3, 0x2

    .line 1472
    if-ne v2, v3, :cond_3d

    .line 1473
    .line 1474
    move/from16 v8, v29

    .line 1475
    .line 1476
    goto :goto_24

    .line 1477
    :cond_3d
    move/from16 v8, v30

    .line 1478
    .line 1479
    :goto_24
    const-string v3, "layoutIntrinsics must be called first"

    .line 1480
    .line 1481
    if-ne v0, v1, :cond_3e

    .line 1482
    .line 1483
    goto :goto_25

    .line 1484
    :cond_3e
    iget-object v4, v11, LI/j;->h:LVa/Y7;

    .line 1485
    .line 1486
    if-eqz v4, :cond_46

    .line 1487
    .line 1488
    iget-object v4, v4, LVa/Y7;->c:Ljava/lang/Object;

    .line 1489
    .line 1490
    invoke-interface {v4}, Lef/i;->getValue()Ljava/lang/Object;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v4

    .line 1494
    check-cast v4, Ljava/lang/Number;

    .line 1495
    .line 1496
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 1497
    .line 1498
    .line 1499
    move-result v4

    .line 1500
    float-to-double v4, v4

    .line 1501
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 1502
    .line 1503
    .line 1504
    move-result-wide v4

    .line 1505
    double-to-float v4, v4

    .line 1506
    float-to-int v4, v4

    .line 1507
    invoke-static {v4, v0, v1}, Landroid/support/v4/media/session/b;->S(III)I

    .line 1508
    .line 1509
    .line 1510
    move-result v1

    .line 1511
    :goto_25
    new-instance v4, Lz0/d;

    .line 1512
    .line 1513
    iget-object v5, v11, LI/j;->h:LVa/Y7;

    .line 1514
    .line 1515
    if-eqz v5, :cond_45

    .line 1516
    .line 1517
    invoke-static {v14, v15}, LL0/a;->d(J)I

    .line 1518
    .line 1519
    .line 1520
    move-result v0

    .line 1521
    const/4 v3, 0x5

    .line 1522
    invoke-static {v1, v0, v3}, Lxg/g;->b(III)J

    .line 1523
    .line 1524
    .line 1525
    move-result-wide v6

    .line 1526
    const/4 v0, 0x2

    .line 1527
    if-ne v2, v0, :cond_3f

    .line 1528
    .line 1529
    move/from16 v9, v29

    .line 1530
    .line 1531
    goto :goto_26

    .line 1532
    :cond_3f
    const/4 v9, 0x0

    .line 1533
    :goto_26
    invoke-direct/range {v4 .. v9}, Lz0/d;-><init>(LVa/Y7;JIZ)V

    .line 1534
    .line 1535
    .line 1536
    iget v0, v4, Lz0/d;->d:F

    .line 1537
    .line 1538
    float-to-double v0, v0

    .line 1539
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 1540
    .line 1541
    .line 1542
    move-result-wide v0

    .line 1543
    double-to-float v0, v0

    .line 1544
    float-to-int v0, v0

    .line 1545
    iget v1, v4, Lz0/d;->e:F

    .line 1546
    .line 1547
    float-to-double v1, v1

    .line 1548
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 1549
    .line 1550
    .line 1551
    move-result-wide v1

    .line 1552
    double-to-float v1, v1

    .line 1553
    float-to-int v1, v1

    .line 1554
    invoke-static {v0, v1}, LBa/c;->a(II)J

    .line 1555
    .line 1556
    .line 1557
    move-result-wide v0

    .line 1558
    invoke-static {v14, v15, v0, v1}, Lxg/g;->s(JJ)J

    .line 1559
    .line 1560
    .line 1561
    move-result-wide v0

    .line 1562
    new-instance v2, Lz0/n;

    .line 1563
    .line 1564
    new-instance v6, Lz0/m;

    .line 1565
    .line 1566
    iget-boolean v10, v11, LI/j;->d:Z

    .line 1567
    .line 1568
    iget-object v14, v11, LI/j;->g:LE0/e;

    .line 1569
    .line 1570
    iget-object v8, v11, LI/j;->b:Lz0/p;

    .line 1571
    .line 1572
    iget v9, v11, LI/j;->c:I

    .line 1573
    .line 1574
    iget v5, v11, LI/j;->e:I

    .line 1575
    .line 1576
    iget-object v12, v11, LI/j;->f:LL0/b;

    .line 1577
    .line 1578
    move-wide/from16 v15, p3

    .line 1579
    .line 1580
    move v11, v5

    .line 1581
    move-object/from16 v7, v34

    .line 1582
    .line 1583
    move-object/from16 v13, v50

    .line 1584
    .line 1585
    move v5, v3

    .line 1586
    move-object/from16 v3, v31

    .line 1587
    .line 1588
    invoke-direct/range {v6 .. v16}, Lz0/m;-><init>(Lz0/b;Lz0/p;IZILL0/b;LL0/i;LE0/e;J)V

    .line 1589
    .line 1590
    .line 1591
    invoke-direct {v2, v6, v4, v0, v1}, Lz0/n;-><init>(Lz0/m;Lz0/d;J)V

    .line 1592
    .line 1593
    .line 1594
    :goto_27
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1595
    .line 1596
    .line 1597
    move-result v0

    .line 1598
    move-object/from16 v1, v27

    .line 1599
    .line 1600
    iget-object v1, v1, LI/i;->a:LVa/X7;

    .line 1601
    .line 1602
    if-nez v0, :cond_40

    .line 1603
    .line 1604
    iget-object v0, v1, LVa/X7;->b:Ljava/lang/Object;

    .line 1605
    .line 1606
    check-cast v0, Ltf/l;

    .line 1607
    .line 1608
    invoke-interface {v0, v2}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1609
    .line 1610
    .line 1611
    if-eqz v3, :cond_40

    .line 1612
    .line 1613
    iget-object v0, v3, Lz0/n;->a:Lz0/m;

    .line 1614
    .line 1615
    iget-object v0, v0, Lz0/m;->a:Lz0/b;

    .line 1616
    .line 1617
    iget-object v3, v2, Lz0/n;->a:Lz0/m;

    .line 1618
    .line 1619
    iget-object v3, v3, Lz0/m;->a:Lz0/b;

    .line 1620
    .line 1621
    invoke-virtual {v0, v3}, Lz0/b;->equals(Ljava/lang/Object;)Z

    .line 1622
    .line 1623
    .line 1624
    :cond_40
    sget-object v0, Lef/C;->a:Lef/C;

    .line 1625
    .line 1626
    iget-object v3, v1, LVa/X7;->d:Ljava/lang/Object;

    .line 1627
    .line 1628
    check-cast v3, LN/Y;

    .line 1629
    .line 1630
    invoke-virtual {v3, v0}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 1631
    .line 1632
    .line 1633
    iput-object v2, v1, LVa/X7;->c:Ljava/lang/Object;

    .line 1634
    .line 1635
    move-object/from16 v1, p2

    .line 1636
    .line 1637
    iget-object v0, v1, LP/a;->a:LP/d;

    .line 1638
    .line 1639
    iget v0, v0, LP/d;->c:I

    .line 1640
    .line 1641
    iget-object v3, v2, Lz0/n;->f:Ljava/util/ArrayList;

    .line 1642
    .line 1643
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1644
    .line 1645
    .line 1646
    move-result v4

    .line 1647
    if-lt v0, v4, :cond_44

    .line 1648
    .line 1649
    new-instance v0, Ljava/util/ArrayList;

    .line 1650
    .line 1651
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1652
    .line 1653
    .line 1654
    move-result v4

    .line 1655
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1656
    .line 1657
    .line 1658
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1659
    .line 1660
    .line 1661
    move-result v4

    .line 1662
    const/4 v13, 0x0

    .line 1663
    :goto_28
    if-ge v13, v4, :cond_43

    .line 1664
    .line 1665
    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v6

    .line 1669
    check-cast v6, Ld0/d;

    .line 1670
    .line 1671
    if-eqz v6, :cond_41

    .line 1672
    .line 1673
    new-instance v7, Lef/k;

    .line 1674
    .line 1675
    invoke-virtual {v1, v13}, LP/a;->get(I)Ljava/lang/Object;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v8

    .line 1679
    check-cast v8, Lr0/m;

    .line 1680
    .line 1681
    invoke-virtual {v6}, Ld0/d;->c()F

    .line 1682
    .line 1683
    .line 1684
    move-result v9

    .line 1685
    float-to-double v9, v9

    .line 1686
    invoke-static {v9, v10}, Ljava/lang/Math;->floor(D)D

    .line 1687
    .line 1688
    .line 1689
    move-result-wide v9

    .line 1690
    double-to-float v9, v9

    .line 1691
    float-to-int v9, v9

    .line 1692
    invoke-virtual {v6}, Ld0/d;->b()F

    .line 1693
    .line 1694
    .line 1695
    move-result v10

    .line 1696
    float-to-double v10, v10

    .line 1697
    invoke-static {v10, v11}, Ljava/lang/Math;->floor(D)D

    .line 1698
    .line 1699
    .line 1700
    move-result-wide v10

    .line 1701
    double-to-float v10, v10

    .line 1702
    float-to-int v10, v10

    .line 1703
    invoke-static {v9, v10, v5}, Lxg/g;->b(III)J

    .line 1704
    .line 1705
    .line 1706
    move-result-wide v9

    .line 1707
    invoke-interface {v8, v9, v10}, Lr0/m;->e(J)Lr0/t;

    .line 1708
    .line 1709
    .line 1710
    move-result-object v8

    .line 1711
    iget v9, v6, Ld0/d;->a:F

    .line 1712
    .line 1713
    invoke-static {v9}, Lvf/a;->H(F)I

    .line 1714
    .line 1715
    .line 1716
    move-result v9

    .line 1717
    iget v6, v6, Ld0/d;->b:F

    .line 1718
    .line 1719
    invoke-static {v6}, Lvf/a;->H(F)I

    .line 1720
    .line 1721
    .line 1722
    move-result v6

    .line 1723
    invoke-static {v9, v6}, LA6/h;->b(II)J

    .line 1724
    .line 1725
    .line 1726
    move-result-wide v9

    .line 1727
    new-instance v6, LL0/g;

    .line 1728
    .line 1729
    invoke-direct {v6, v9, v10}, LL0/g;-><init>(J)V

    .line 1730
    .line 1731
    .line 1732
    invoke-direct {v7, v8, v6}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1733
    .line 1734
    .line 1735
    goto :goto_29

    .line 1736
    :cond_41
    move-object/from16 v7, v17

    .line 1737
    .line 1738
    :goto_29
    if-eqz v7, :cond_42

    .line 1739
    .line 1740
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1741
    .line 1742
    .line 1743
    :cond_42
    add-int/lit8 v13, v13, 0x1

    .line 1744
    .line 1745
    goto :goto_28

    .line 1746
    :cond_43
    iget-wide v3, v2, Lz0/n;->c:J

    .line 1747
    .line 1748
    const/16 v1, 0x20

    .line 1749
    .line 1750
    shr-long v5, v3, v1

    .line 1751
    .line 1752
    long-to-int v1, v5

    .line 1753
    const-wide v5, 0xffffffffL

    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    and-long/2addr v3, v5

    .line 1759
    long-to-int v3, v3

    .line 1760
    sget-object v4, Lr0/c;->a:Lr0/j;

    .line 1761
    .line 1762
    iget v5, v2, Lz0/n;->d:F

    .line 1763
    .line 1764
    invoke-static {v5}, Lvf/a;->H(F)I

    .line 1765
    .line 1766
    .line 1767
    move-result v5

    .line 1768
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v5

    .line 1772
    new-instance v6, Lef/k;

    .line 1773
    .line 1774
    invoke-direct {v6, v4, v5}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1775
    .line 1776
    .line 1777
    sget-object v4, Lr0/c;->b:Lr0/j;

    .line 1778
    .line 1779
    iget v2, v2, Lz0/n;->e:F

    .line 1780
    .line 1781
    invoke-static {v2}, Lvf/a;->H(F)I

    .line 1782
    .line 1783
    .line 1784
    move-result v2

    .line 1785
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1786
    .line 1787
    .line 1788
    move-result-object v2

    .line 1789
    new-instance v5, Lef/k;

    .line 1790
    .line 1791
    invoke-direct {v5, v4, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1792
    .line 1793
    .line 1794
    const/4 v2, 0x2

    .line 1795
    new-array v2, v2, [Lef/k;

    .line 1796
    .line 1797
    const/4 v8, 0x0

    .line 1798
    aput-object v6, v2, v8

    .line 1799
    .line 1800
    aput-object v5, v2, v29

    .line 1801
    .line 1802
    invoke-static {v2}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v4

    .line 1806
    new-instance v6, LI/g;

    .line 1807
    .line 1808
    invoke-direct {v6, v0, v8}, LI/g;-><init>(Ljava/util/ArrayList;I)V

    .line 1809
    .line 1810
    .line 1811
    move v2, v1

    .line 1812
    new-instance v1, LD0/b;

    .line 1813
    .line 1814
    move-object/from16 v5, p1

    .line 1815
    .line 1816
    invoke-direct/range {v1 .. v6}, LD0/b;-><init>(IILjava/util/Map;Lt0/r;Ltf/l;)V

    .line 1817
    .line 1818
    .line 1819
    return-object v1

    .line 1820
    :cond_44
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1821
    .line 1822
    const-string v1, "Check failed."

    .line 1823
    .line 1824
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1825
    .line 1826
    .line 1827
    throw v0

    .line 1828
    :cond_45
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1829
    .line 1830
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1831
    .line 1832
    .line 1833
    throw v0

    .line 1834
    :cond_46
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1835
    .line 1836
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1837
    .line 1838
    .line 1839
    throw v0

    .line 1840
    nop

    .line 1841
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
