.class public final Lj6/a;
.super Lh6/e;
.source "SourceFile"


# instance fields
.field public final synthetic m:I

.field public final n:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lj6/a;->m:I

    .line 7
    invoke-direct {p0}, Lh6/e;-><init>()V

    .line 8
    new-instance v0, LY4/b;

    invoke-direct {v0}, LY4/b;-><init>()V

    iput-object v0, p0, Lj6/a;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lj6/a;->m:I

    .line 1
    invoke-direct {p0}, Lh6/e;-><init>()V

    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    .line 3
    array-length v1, p1

    .line 4
    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    const/4 v1, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    const/4 v1, 0x2

    .line 5
    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    const/4 v2, 0x3

    aget-byte p1, p1, v2

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p1, v1

    .line 6
    new-instance v1, Lj6/g;

    invoke-direct {v1, v0, p1}, Lj6/g;-><init>(II)V

    iput-object v1, p0, Lj6/a;->n:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e([BIZ)Lh6/f;
    .locals 35

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
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    iget-object v6, v0, Lj6/a;->n:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    const/16 v8, 0x8

    .line 14
    .line 15
    iget v9, v0, Lj6/a;->m:I

    .line 16
    .line 17
    packed-switch v9, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v6, LY4/b;

    .line 21
    .line 22
    invoke-virtual {v6, v2, v1}, LY4/b;->y(I[B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-virtual {v6}, LY4/b;->a()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-lez v2, :cond_8

    .line 35
    .line 36
    invoke-virtual {v6}, LY4/b;->a()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-lt v2, v8, :cond_7

    .line 41
    .line 42
    invoke-virtual {v6}, LY4/b;->d()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {v6}, LY4/b;->d()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    const v4, 0x76747463

    .line 51
    .line 52
    .line 53
    if-ne v3, v4, :cond_6

    .line 54
    .line 55
    sub-int/2addr v2, v8

    .line 56
    move-object v3, v5

    .line 57
    move-object v4, v3

    .line 58
    :cond_0
    :goto_1
    if-lez v2, :cond_3

    .line 59
    .line 60
    if-lt v2, v8, :cond_2

    .line 61
    .line 62
    invoke-virtual {v6}, LY4/b;->d()I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    invoke-virtual {v6}, LY4/b;->d()I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    add-int/lit8 v2, v2, -0x8

    .line 71
    .line 72
    sub-int/2addr v7, v8

    .line 73
    iget-object v10, v6, LY4/b;->a:[B

    .line 74
    .line 75
    iget v11, v6, LY4/b;->b:I

    .line 76
    .line 77
    sget v12, Lu6/v;->a:I

    .line 78
    .line 79
    new-instance v12, Ljava/lang/String;

    .line 80
    .line 81
    sget-object v13, Lk8/g;->c:Ljava/nio/charset/Charset;

    .line 82
    .line 83
    invoke-direct {v12, v10, v11, v7, v13}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v6, v7}, LY4/b;->B(I)V

    .line 87
    .line 88
    .line 89
    sub-int/2addr v2, v7

    .line 90
    const v7, 0x73747467

    .line 91
    .line 92
    .line 93
    if-ne v9, v7, :cond_1

    .line 94
    .line 95
    new-instance v4, LX2/h;

    .line 96
    .line 97
    invoke-direct {v4}, LX2/h;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-static {v12, v4}, Lq6/h;->e(Ljava/lang/String;LX2/h;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4}, LX2/h;->b()Lh6/a;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    goto :goto_1

    .line 108
    :cond_1
    const v7, 0x7061796c

    .line 109
    .line 110
    .line 111
    if-ne v9, v7, :cond_0

    .line 112
    .line 113
    invoke-virtual {v12}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 118
    .line 119
    invoke-static {v5, v3, v7}, Lq6/h;->f(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Landroid/text/SpannedString;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    goto :goto_1

    .line 124
    :cond_2
    new-instance v1, Lh6/h;

    .line 125
    .line 126
    const-string v2, "Incomplete vtt cue box header found."

    .line 127
    .line 128
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v1

    .line 132
    :cond_3
    if-nez v3, :cond_4

    .line 133
    .line 134
    const-string v3, ""

    .line 135
    .line 136
    :cond_4
    if-eqz v4, :cond_5

    .line 137
    .line 138
    iput-object v3, v4, Lh6/a;->a:Ljava/lang/CharSequence;

    .line 139
    .line 140
    invoke-virtual {v4}, Lh6/a;->a()Lh6/b;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    goto :goto_2

    .line 145
    :cond_5
    sget-object v2, Lq6/h;->a:Ljava/util/regex/Pattern;

    .line 146
    .line 147
    new-instance v2, LX2/h;

    .line 148
    .line 149
    invoke-direct {v2}, LX2/h;-><init>()V

    .line 150
    .line 151
    .line 152
    iput-object v3, v2, LX2/h;->c:Ljava/lang/CharSequence;

    .line 153
    .line 154
    invoke-virtual {v2}, LX2/h;->b()Lh6/a;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-virtual {v2}, Lh6/a;->a()Lh6/b;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    :goto_2
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    goto/16 :goto_0

    .line 166
    .line 167
    :cond_6
    sub-int/2addr v2, v8

    .line 168
    invoke-virtual {v6, v2}, LY4/b;->B(I)V

    .line 169
    .line 170
    .line 171
    goto/16 :goto_0

    .line 172
    .line 173
    :cond_7
    new-instance v1, Lh6/h;

    .line 174
    .line 175
    const-string v2, "Incomplete Mp4Webvtt Top Level box header found."

    .line 176
    .line 177
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw v1

    .line 181
    :cond_8
    new-instance v2, La2/v;

    .line 182
    .line 183
    invoke-direct {v2, v1}, La2/v;-><init>(Ljava/util/ArrayList;)V

    .line 184
    .line 185
    .line 186
    return-object v2

    .line 187
    :pswitch_0
    check-cast v6, Lj6/g;

    .line 188
    .line 189
    if-eqz p3, :cond_9

    .line 190
    .line 191
    iget-object v9, v6, Lj6/g;->f:LR2/h;

    .line 192
    .line 193
    iget-object v10, v9, LR2/h;->c:Landroid/util/SparseArray;

    .line 194
    .line 195
    invoke-virtual {v10}, Landroid/util/SparseArray;->clear()V

    .line 196
    .line 197
    .line 198
    iget-object v10, v9, LR2/h;->d:Landroid/util/SparseArray;

    .line 199
    .line 200
    invoke-virtual {v10}, Landroid/util/SparseArray;->clear()V

    .line 201
    .line 202
    .line 203
    iget-object v10, v9, LR2/h;->e:Landroid/util/SparseArray;

    .line 204
    .line 205
    invoke-virtual {v10}, Landroid/util/SparseArray;->clear()V

    .line 206
    .line 207
    .line 208
    iget-object v10, v9, LR2/h;->f:Landroid/util/SparseArray;

    .line 209
    .line 210
    invoke-virtual {v10}, Landroid/util/SparseArray;->clear()V

    .line 211
    .line 212
    .line 213
    iget-object v10, v9, LR2/h;->g:Landroid/util/SparseArray;

    .line 214
    .line 215
    invoke-virtual {v10}, Landroid/util/SparseArray;->clear()V

    .line 216
    .line 217
    .line 218
    iput-object v5, v9, LR2/h;->h:Ljava/lang/Object;

    .line 219
    .line 220
    iput-object v5, v9, LR2/h;->i:Ljava/lang/Object;

    .line 221
    .line 222
    :cond_9
    new-instance v9, Li6/i;

    .line 223
    .line 224
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    new-instance v10, LJ5/y;

    .line 228
    .line 229
    const/4 v11, 0x6

    .line 230
    invoke-direct {v10, v1, v2, v11, v4}, LJ5/y;-><init>([BIIB)V

    .line 231
    .line 232
    .line 233
    :goto_3
    invoke-virtual {v10}, LJ5/y;->b()I

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    const/16 v2, 0x30

    .line 238
    .line 239
    const/4 v11, 0x3

    .line 240
    iget-object v12, v6, Lj6/g;->f:LR2/h;

    .line 241
    .line 242
    if-lt v1, v2, :cond_16

    .line 243
    .line 244
    invoke-virtual {v10, v8}, LJ5/y;->i(I)I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    const/16 v2, 0xf

    .line 249
    .line 250
    if-ne v1, v2, :cond_16

    .line 251
    .line 252
    invoke-virtual {v10, v8}, LJ5/y;->i(I)I

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    const/16 v2, 0x10

    .line 257
    .line 258
    invoke-virtual {v10, v2}, LJ5/y;->i(I)I

    .line 259
    .line 260
    .line 261
    move-result v13

    .line 262
    invoke-virtual {v10, v2}, LJ5/y;->i(I)I

    .line 263
    .line 264
    .line 265
    move-result v14

    .line 266
    invoke-virtual {v10}, LJ5/y;->f()I

    .line 267
    .line 268
    .line 269
    move-result v15

    .line 270
    add-int/2addr v15, v14

    .line 271
    mul-int/lit8 v5, v14, 0x8

    .line 272
    .line 273
    invoke-virtual {v10}, LJ5/y;->b()I

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    if-le v5, v4, :cond_a

    .line 278
    .line 279
    const-string v1, "DvbParser"

    .line 280
    .line 281
    const-string v2, "Data field length exceeds limit"

    .line 282
    .line 283
    invoke-static {v1, v2}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v10}, LJ5/y;->b()I

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    invoke-virtual {v10, v1}, LJ5/y;->t(I)V

    .line 291
    .line 292
    .line 293
    move/from16 v16, v7

    .line 294
    .line 295
    goto/16 :goto_c

    .line 296
    .line 297
    :cond_a
    const/4 v4, 0x4

    .line 298
    packed-switch v1, :pswitch_data_1

    .line 299
    .line 300
    .line 301
    :cond_b
    :goto_4
    move/from16 v16, v7

    .line 302
    .line 303
    goto/16 :goto_b

    .line 304
    .line 305
    :pswitch_1
    iget v1, v12, LR2/h;->a:I

    .line 306
    .line 307
    if-ne v13, v1, :cond_b

    .line 308
    .line 309
    invoke-virtual {v10, v4}, LJ5/y;->t(I)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v10}, LJ5/y;->h()Z

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    invoke-virtual {v10, v11}, LJ5/y;->t(I)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v10, v2}, LJ5/y;->i(I)I

    .line 320
    .line 321
    .line 322
    move-result v17

    .line 323
    invoke-virtual {v10, v2}, LJ5/y;->i(I)I

    .line 324
    .line 325
    .line 326
    move-result v18

    .line 327
    if-eqz v1, :cond_c

    .line 328
    .line 329
    invoke-virtual {v10, v2}, LJ5/y;->i(I)I

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    invoke-virtual {v10, v2}, LJ5/y;->i(I)I

    .line 334
    .line 335
    .line 336
    move-result v4

    .line 337
    invoke-virtual {v10, v2}, LJ5/y;->i(I)I

    .line 338
    .line 339
    .line 340
    move-result v5

    .line 341
    invoke-virtual {v10, v2}, LJ5/y;->i(I)I

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    move/from16 v19, v1

    .line 346
    .line 347
    move/from16 v22, v2

    .line 348
    .line 349
    move/from16 v20, v4

    .line 350
    .line 351
    move/from16 v21, v5

    .line 352
    .line 353
    goto :goto_5

    .line 354
    :cond_c
    move/from16 v20, v17

    .line 355
    .line 356
    move/from16 v22, v18

    .line 357
    .line 358
    const/16 v19, 0x0

    .line 359
    .line 360
    const/16 v21, 0x0

    .line 361
    .line 362
    :goto_5
    new-instance v16, LR2/b;

    .line 363
    .line 364
    invoke-direct/range {v16 .. v22}, LR2/b;-><init>(IIIIII)V

    .line 365
    .line 366
    .line 367
    move-object/from16 v1, v16

    .line 368
    .line 369
    iput-object v1, v12, LR2/h;->h:Ljava/lang/Object;

    .line 370
    .line 371
    goto :goto_4

    .line 372
    :pswitch_2
    iget v1, v12, LR2/h;->a:I

    .line 373
    .line 374
    if-ne v13, v1, :cond_d

    .line 375
    .line 376
    invoke-static {v10}, Lj6/g;->g(LJ5/y;)Lj6/c;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    iget-object v2, v12, LR2/h;->e:Landroid/util/SparseArray;

    .line 381
    .line 382
    iget v4, v1, Lj6/c;->a:I

    .line 383
    .line 384
    invoke-virtual {v2, v4, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    goto :goto_4

    .line 388
    :cond_d
    iget v1, v12, LR2/h;->b:I

    .line 389
    .line 390
    if-ne v13, v1, :cond_b

    .line 391
    .line 392
    invoke-static {v10}, Lj6/g;->g(LJ5/y;)Lj6/c;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    iget-object v2, v12, LR2/h;->g:Landroid/util/SparseArray;

    .line 397
    .line 398
    iget v4, v1, Lj6/c;->a:I

    .line 399
    .line 400
    invoke-virtual {v2, v4, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    goto :goto_4

    .line 404
    :pswitch_3
    iget v1, v12, LR2/h;->a:I

    .line 405
    .line 406
    if-ne v13, v1, :cond_e

    .line 407
    .line 408
    invoke-static {v10, v14}, Lj6/g;->f(LJ5/y;I)Lj6/b;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    iget-object v2, v12, LR2/h;->d:Landroid/util/SparseArray;

    .line 413
    .line 414
    iget v4, v1, Lj6/b;->a:I

    .line 415
    .line 416
    invoke-virtual {v2, v4, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    goto :goto_4

    .line 420
    :cond_e
    iget v1, v12, LR2/h;->b:I

    .line 421
    .line 422
    if-ne v13, v1, :cond_b

    .line 423
    .line 424
    invoke-static {v10, v14}, Lj6/g;->f(LJ5/y;I)Lj6/b;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    iget-object v2, v12, LR2/h;->f:Landroid/util/SparseArray;

    .line 429
    .line 430
    iget v4, v1, Lj6/b;->a:I

    .line 431
    .line 432
    invoke-virtual {v2, v4, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    goto/16 :goto_4

    .line 436
    .line 437
    :pswitch_4
    iget-object v1, v12, LR2/h;->i:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v1, LR2/d;

    .line 440
    .line 441
    iget v5, v12, LR2/h;->a:I

    .line 442
    .line 443
    if-ne v13, v5, :cond_b

    .line 444
    .line 445
    if-eqz v1, :cond_b

    .line 446
    .line 447
    invoke-virtual {v10, v8}, LJ5/y;->i(I)I

    .line 448
    .line 449
    .line 450
    move-result v17

    .line 451
    invoke-virtual {v10, v4}, LJ5/y;->t(I)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v10}, LJ5/y;->h()Z

    .line 455
    .line 456
    .line 457
    move-result v18

    .line 458
    invoke-virtual {v10, v11}, LJ5/y;->t(I)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v10, v2}, LJ5/y;->i(I)I

    .line 462
    .line 463
    .line 464
    move-result v19

    .line 465
    invoke-virtual {v10, v2}, LJ5/y;->i(I)I

    .line 466
    .line 467
    .line 468
    move-result v20

    .line 469
    invoke-virtual {v10, v11}, LJ5/y;->i(I)I

    .line 470
    .line 471
    .line 472
    invoke-virtual {v10, v11}, LJ5/y;->i(I)I

    .line 473
    .line 474
    .line 475
    move-result v21

    .line 476
    invoke-virtual {v10, v3}, LJ5/y;->t(I)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v10, v8}, LJ5/y;->i(I)I

    .line 480
    .line 481
    .line 482
    move-result v22

    .line 483
    invoke-virtual {v10, v8}, LJ5/y;->i(I)I

    .line 484
    .line 485
    .line 486
    move-result v23

    .line 487
    invoke-virtual {v10, v4}, LJ5/y;->i(I)I

    .line 488
    .line 489
    .line 490
    move-result v24

    .line 491
    invoke-virtual {v10, v3}, LJ5/y;->i(I)I

    .line 492
    .line 493
    .line 494
    move-result v25

    .line 495
    invoke-virtual {v10, v3}, LJ5/y;->t(I)V

    .line 496
    .line 497
    .line 498
    add-int/lit8 v14, v14, -0xa

    .line 499
    .line 500
    new-instance v5, Landroid/util/SparseArray;

    .line 501
    .line 502
    invoke-direct {v5}, Landroid/util/SparseArray;-><init>()V

    .line 503
    .line 504
    .line 505
    :goto_6
    if-lez v14, :cond_11

    .line 506
    .line 507
    invoke-virtual {v10, v2}, LJ5/y;->i(I)I

    .line 508
    .line 509
    .line 510
    move-result v11

    .line 511
    invoke-virtual {v10, v3}, LJ5/y;->i(I)I

    .line 512
    .line 513
    .line 514
    move-result v13

    .line 515
    invoke-virtual {v10, v3}, LJ5/y;->i(I)I

    .line 516
    .line 517
    .line 518
    const/16 v2, 0xc

    .line 519
    .line 520
    invoke-virtual {v10, v2}, LJ5/y;->i(I)I

    .line 521
    .line 522
    .line 523
    move-result v8

    .line 524
    invoke-virtual {v10, v4}, LJ5/y;->t(I)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v10, v2}, LJ5/y;->i(I)I

    .line 528
    .line 529
    .line 530
    move-result v2

    .line 531
    add-int/lit8 v16, v14, -0x6

    .line 532
    .line 533
    if-eq v13, v7, :cond_f

    .line 534
    .line 535
    if-ne v13, v3, :cond_10

    .line 536
    .line 537
    :cond_f
    const/16 v13, 0x8

    .line 538
    .line 539
    goto :goto_7

    .line 540
    :cond_10
    move/from16 v14, v16

    .line 541
    .line 542
    goto :goto_8

    .line 543
    :goto_7
    invoke-virtual {v10, v13}, LJ5/y;->i(I)I

    .line 544
    .line 545
    .line 546
    invoke-virtual {v10, v13}, LJ5/y;->i(I)I

    .line 547
    .line 548
    .line 549
    add-int/lit8 v14, v14, -0x8

    .line 550
    .line 551
    :goto_8
    new-instance v13, Lj6/f;

    .line 552
    .line 553
    invoke-direct {v13, v8, v2}, Lj6/f;-><init>(II)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v5, v11, v13}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    const/16 v2, 0x10

    .line 560
    .line 561
    const/16 v8, 0x8

    .line 562
    .line 563
    goto :goto_6

    .line 564
    :cond_11
    new-instance v16, Lj6/e;

    .line 565
    .line 566
    move-object/from16 v26, v5

    .line 567
    .line 568
    invoke-direct/range {v16 .. v26}, Lj6/e;-><init>(IZIIIIIIILandroid/util/SparseArray;)V

    .line 569
    .line 570
    .line 571
    move-object/from16 v4, v16

    .line 572
    .line 573
    move/from16 v2, v17

    .line 574
    .line 575
    iget-object v5, v12, LR2/h;->c:Landroid/util/SparseArray;

    .line 576
    .line 577
    iget v1, v1, LR2/d;->b:I

    .line 578
    .line 579
    if-nez v1, :cond_12

    .line 580
    .line 581
    invoke-virtual {v5, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    check-cast v1, Lj6/e;

    .line 586
    .line 587
    if-eqz v1, :cond_12

    .line 588
    .line 589
    const/4 v2, 0x0

    .line 590
    :goto_9
    iget-object v8, v1, Lj6/e;->j:Landroid/util/SparseArray;

    .line 591
    .line 592
    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    .line 593
    .line 594
    .line 595
    move-result v11

    .line 596
    if-ge v2, v11, :cond_12

    .line 597
    .line 598
    invoke-virtual {v8, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 599
    .line 600
    .line 601
    move-result v11

    .line 602
    invoke-virtual {v8, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v8

    .line 606
    check-cast v8, Lj6/f;

    .line 607
    .line 608
    iget-object v12, v4, Lj6/e;->j:Landroid/util/SparseArray;

    .line 609
    .line 610
    invoke-virtual {v12, v11, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 611
    .line 612
    .line 613
    add-int/2addr v2, v7

    .line 614
    goto :goto_9

    .line 615
    :cond_12
    iget v1, v4, Lj6/e;->a:I

    .line 616
    .line 617
    invoke-virtual {v5, v1, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 618
    .line 619
    .line 620
    goto/16 :goto_4

    .line 621
    .line 622
    :pswitch_5
    iget v1, v12, LR2/h;->a:I

    .line 623
    .line 624
    if-ne v13, v1, :cond_b

    .line 625
    .line 626
    iget-object v1, v12, LR2/h;->i:Ljava/lang/Object;

    .line 627
    .line 628
    check-cast v1, LR2/d;

    .line 629
    .line 630
    const/16 v13, 0x8

    .line 631
    .line 632
    invoke-virtual {v10, v13}, LJ5/y;->i(I)I

    .line 633
    .line 634
    .line 635
    invoke-virtual {v10, v4}, LJ5/y;->i(I)I

    .line 636
    .line 637
    .line 638
    move-result v2

    .line 639
    invoke-virtual {v10, v3}, LJ5/y;->i(I)I

    .line 640
    .line 641
    .line 642
    move-result v4

    .line 643
    invoke-virtual {v10, v3}, LJ5/y;->t(I)V

    .line 644
    .line 645
    .line 646
    sub-int/2addr v14, v3

    .line 647
    new-instance v5, Landroid/util/SparseArray;

    .line 648
    .line 649
    invoke-direct {v5}, Landroid/util/SparseArray;-><init>()V

    .line 650
    .line 651
    .line 652
    :goto_a
    if-lez v14, :cond_13

    .line 653
    .line 654
    invoke-virtual {v10, v13}, LJ5/y;->i(I)I

    .line 655
    .line 656
    .line 657
    move-result v8

    .line 658
    invoke-virtual {v10, v13}, LJ5/y;->t(I)V

    .line 659
    .line 660
    .line 661
    const/16 v11, 0x10

    .line 662
    .line 663
    invoke-virtual {v10, v11}, LJ5/y;->i(I)I

    .line 664
    .line 665
    .line 666
    move-result v13

    .line 667
    move/from16 v16, v7

    .line 668
    .line 669
    invoke-virtual {v10, v11}, LJ5/y;->i(I)I

    .line 670
    .line 671
    .line 672
    move-result v7

    .line 673
    add-int/lit8 v14, v14, -0x6

    .line 674
    .line 675
    new-instance v11, Lj6/d;

    .line 676
    .line 677
    invoke-direct {v11, v13, v7}, Lj6/d;-><init>(II)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v5, v8, v11}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 681
    .line 682
    .line 683
    move/from16 v7, v16

    .line 684
    .line 685
    const/16 v13, 0x8

    .line 686
    .line 687
    goto :goto_a

    .line 688
    :cond_13
    move/from16 v16, v7

    .line 689
    .line 690
    new-instance v7, LR2/d;

    .line 691
    .line 692
    invoke-direct {v7, v2, v4, v5}, LR2/d;-><init>(IILandroid/util/SparseArray;)V

    .line 693
    .line 694
    .line 695
    if-eqz v4, :cond_14

    .line 696
    .line 697
    iput-object v7, v12, LR2/h;->i:Ljava/lang/Object;

    .line 698
    .line 699
    iget-object v1, v12, LR2/h;->c:Landroid/util/SparseArray;

    .line 700
    .line 701
    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    .line 702
    .line 703
    .line 704
    iget-object v1, v12, LR2/h;->d:Landroid/util/SparseArray;

    .line 705
    .line 706
    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    .line 707
    .line 708
    .line 709
    iget-object v1, v12, LR2/h;->e:Landroid/util/SparseArray;

    .line 710
    .line 711
    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    .line 712
    .line 713
    .line 714
    goto :goto_b

    .line 715
    :cond_14
    if-eqz v1, :cond_15

    .line 716
    .line 717
    iget v1, v1, LR2/d;->a:I

    .line 718
    .line 719
    if-eq v1, v2, :cond_15

    .line 720
    .line 721
    iput-object v7, v12, LR2/h;->i:Ljava/lang/Object;

    .line 722
    .line 723
    :cond_15
    :goto_b
    invoke-virtual {v10}, LJ5/y;->f()I

    .line 724
    .line 725
    .line 726
    move-result v1

    .line 727
    sub-int/2addr v15, v1

    .line 728
    invoke-virtual {v10, v15}, LJ5/y;->u(I)V

    .line 729
    .line 730
    .line 731
    :goto_c
    move/from16 v7, v16

    .line 732
    .line 733
    const/4 v4, 0x0

    .line 734
    const/4 v5, 0x0

    .line 735
    const/16 v8, 0x8

    .line 736
    .line 737
    goto/16 :goto_3

    .line 738
    .line 739
    :cond_16
    move/from16 v16, v7

    .line 740
    .line 741
    iget-object v1, v12, LR2/h;->i:Ljava/lang/Object;

    .line 742
    .line 743
    check-cast v1, LR2/d;

    .line 744
    .line 745
    if-nez v1, :cond_17

    .line 746
    .line 747
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 748
    .line 749
    :goto_d
    move/from16 v0, v16

    .line 750
    .line 751
    goto/16 :goto_16

    .line 752
    .line 753
    :cond_17
    iget-object v2, v12, LR2/h;->h:Ljava/lang/Object;

    .line 754
    .line 755
    check-cast v2, LR2/b;

    .line 756
    .line 757
    if-eqz v2, :cond_18

    .line 758
    .line 759
    goto :goto_e

    .line 760
    :cond_18
    iget-object v2, v6, Lj6/g;->d:LR2/b;

    .line 761
    .line 762
    :goto_e
    iget-object v4, v6, Lj6/g;->g:Landroid/graphics/Bitmap;

    .line 763
    .line 764
    iget-object v5, v6, Lj6/g;->c:Landroid/graphics/Canvas;

    .line 765
    .line 766
    if-eqz v4, :cond_19

    .line 767
    .line 768
    iget v7, v2, LR2/b;->a:I

    .line 769
    .line 770
    add-int/lit8 v7, v7, 0x1

    .line 771
    .line 772
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 773
    .line 774
    .line 775
    move-result v4

    .line 776
    if-ne v7, v4, :cond_19

    .line 777
    .line 778
    iget v4, v2, LR2/b;->b:I

    .line 779
    .line 780
    add-int/lit8 v4, v4, 0x1

    .line 781
    .line 782
    iget-object v7, v6, Lj6/g;->g:Landroid/graphics/Bitmap;

    .line 783
    .line 784
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    .line 785
    .line 786
    .line 787
    move-result v7

    .line 788
    if-eq v4, v7, :cond_1a

    .line 789
    .line 790
    :cond_19
    iget v4, v2, LR2/b;->a:I

    .line 791
    .line 792
    add-int/lit8 v4, v4, 0x1

    .line 793
    .line 794
    iget v7, v2, LR2/b;->b:I

    .line 795
    .line 796
    add-int/lit8 v7, v7, 0x1

    .line 797
    .line 798
    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 799
    .line 800
    invoke-static {v4, v7, v8}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 801
    .line 802
    .line 803
    move-result-object v4

    .line 804
    iput-object v4, v6, Lj6/g;->g:Landroid/graphics/Bitmap;

    .line 805
    .line 806
    invoke-virtual {v5, v4}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 807
    .line 808
    .line 809
    :cond_1a
    new-instance v4, Ljava/util/ArrayList;

    .line 810
    .line 811
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 812
    .line 813
    .line 814
    const/4 v7, 0x0

    .line 815
    :goto_f
    iget-object v8, v1, LR2/d;->c:Landroid/util/SparseArray;

    .line 816
    .line 817
    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    .line 818
    .line 819
    .line 820
    move-result v10

    .line 821
    if-ge v7, v10, :cond_25

    .line 822
    .line 823
    invoke-virtual {v5}, Landroid/graphics/Canvas;->save()I

    .line 824
    .line 825
    .line 826
    invoke-virtual {v8, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v10

    .line 830
    check-cast v10, Lj6/d;

    .line 831
    .line 832
    invoke-virtual {v8, v7}, Landroid/util/SparseArray;->keyAt(I)I

    .line 833
    .line 834
    .line 835
    move-result v8

    .line 836
    iget-object v13, v12, LR2/h;->c:Landroid/util/SparseArray;

    .line 837
    .line 838
    invoke-virtual {v13, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v8

    .line 842
    check-cast v8, Lj6/e;

    .line 843
    .line 844
    iget v13, v10, Lj6/d;->a:I

    .line 845
    .line 846
    iget v14, v2, LR2/b;->c:I

    .line 847
    .line 848
    add-int/2addr v13, v14

    .line 849
    iget v10, v10, Lj6/d;->b:I

    .line 850
    .line 851
    iget v14, v2, LR2/b;->e:I

    .line 852
    .line 853
    add-int/2addr v10, v14

    .line 854
    iget v14, v8, Lj6/e;->c:I

    .line 855
    .line 856
    add-int/2addr v14, v13

    .line 857
    iget v15, v2, LR2/b;->d:I

    .line 858
    .line 859
    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    .line 860
    .line 861
    .line 862
    move-result v14

    .line 863
    iget v15, v8, Lj6/e;->d:I

    .line 864
    .line 865
    add-int v3, v10, v15

    .line 866
    .line 867
    iget v11, v2, LR2/b;->f:I

    .line 868
    .line 869
    invoke-static {v3, v11}, Ljava/lang/Math;->min(II)I

    .line 870
    .line 871
    .line 872
    move-result v11

    .line 873
    invoke-virtual {v5, v13, v10, v14, v11}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    .line 874
    .line 875
    .line 876
    iget-object v11, v12, LR2/h;->d:Landroid/util/SparseArray;

    .line 877
    .line 878
    iget v14, v8, Lj6/e;->f:I

    .line 879
    .line 880
    invoke-virtual {v11, v14}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 881
    .line 882
    .line 883
    move-result-object v11

    .line 884
    check-cast v11, Lj6/b;

    .line 885
    .line 886
    if-nez v11, :cond_1b

    .line 887
    .line 888
    iget-object v11, v12, LR2/h;->f:Landroid/util/SparseArray;

    .line 889
    .line 890
    invoke-virtual {v11, v14}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object v11

    .line 894
    check-cast v11, Lj6/b;

    .line 895
    .line 896
    if-nez v11, :cond_1b

    .line 897
    .line 898
    iget-object v11, v6, Lj6/g;->e:Lj6/b;

    .line 899
    .line 900
    :cond_1b
    const/4 v14, 0x0

    .line 901
    :goto_10
    iget-object v0, v8, Lj6/e;->j:Landroid/util/SparseArray;

    .line 902
    .line 903
    move-object/from16 p2, v1

    .line 904
    .line 905
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 906
    .line 907
    .line 908
    move-result v1

    .line 909
    if-ge v14, v1, :cond_21

    .line 910
    .line 911
    invoke-virtual {v0, v14}, Landroid/util/SparseArray;->keyAt(I)I

    .line 912
    .line 913
    .line 914
    move-result v1

    .line 915
    invoke-virtual {v0, v14}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    check-cast v0, Lj6/f;

    .line 920
    .line 921
    move-object/from16 v23, v5

    .line 922
    .line 923
    iget-object v5, v12, LR2/h;->e:Landroid/util/SparseArray;

    .line 924
    .line 925
    invoke-virtual {v5, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 926
    .line 927
    .line 928
    move-result-object v5

    .line 929
    check-cast v5, Lj6/c;

    .line 930
    .line 931
    if-nez v5, :cond_1c

    .line 932
    .line 933
    iget-object v5, v12, LR2/h;->g:Landroid/util/SparseArray;

    .line 934
    .line 935
    invoke-virtual {v5, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 936
    .line 937
    .line 938
    move-result-object v1

    .line 939
    move-object v5, v1

    .line 940
    check-cast v5, Lj6/c;

    .line 941
    .line 942
    :cond_1c
    if-eqz v5, :cond_20

    .line 943
    .line 944
    iget-boolean v1, v5, Lj6/c;->b:Z

    .line 945
    .line 946
    if-eqz v1, :cond_1d

    .line 947
    .line 948
    const/16 v22, 0x0

    .line 949
    .line 950
    goto :goto_11

    .line 951
    :cond_1d
    iget-object v1, v6, Lj6/g;->a:Landroid/graphics/Paint;

    .line 952
    .line 953
    move-object/from16 v22, v1

    .line 954
    .line 955
    :goto_11
    iget v1, v0, Lj6/f;->a:I

    .line 956
    .line 957
    add-int v20, v13, v1

    .line 958
    .line 959
    iget v0, v0, Lj6/f;->b:I

    .line 960
    .line 961
    add-int v21, v10, v0

    .line 962
    .line 963
    iget v0, v8, Lj6/e;->e:I

    .line 964
    .line 965
    const/4 v1, 0x3

    .line 966
    if-ne v0, v1, :cond_1e

    .line 967
    .line 968
    iget-object v1, v11, Lj6/b;->d:[I

    .line 969
    .line 970
    :goto_12
    move-object/from16 v18, v1

    .line 971
    .line 972
    goto :goto_13

    .line 973
    :cond_1e
    const/4 v1, 0x2

    .line 974
    if-ne v0, v1, :cond_1f

    .line 975
    .line 976
    iget-object v1, v11, Lj6/b;->c:[I

    .line 977
    .line 978
    goto :goto_12

    .line 979
    :cond_1f
    iget-object v1, v11, Lj6/b;->b:[I

    .line 980
    .line 981
    goto :goto_12

    .line 982
    :goto_13
    iget-object v1, v5, Lj6/c;->c:[B

    .line 983
    .line 984
    move/from16 v19, v0

    .line 985
    .line 986
    move-object/from16 v17, v1

    .line 987
    .line 988
    invoke-static/range {v17 .. v23}, Lj6/g;->e([B[IIIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V

    .line 989
    .line 990
    .line 991
    add-int/lit8 v21, v21, 0x1

    .line 992
    .line 993
    iget-object v0, v5, Lj6/c;->d:[B

    .line 994
    .line 995
    move-object/from16 v17, v0

    .line 996
    .line 997
    invoke-static/range {v17 .. v23}, Lj6/g;->e([B[IIIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V

    .line 998
    .line 999
    .line 1000
    :cond_20
    add-int/lit8 v14, v14, 0x1

    .line 1001
    .line 1002
    move-object/from16 v1, p2

    .line 1003
    .line 1004
    move-object/from16 v5, v23

    .line 1005
    .line 1006
    goto :goto_10

    .line 1007
    :cond_21
    move-object/from16 v23, v5

    .line 1008
    .line 1009
    iget-boolean v0, v8, Lj6/e;->b:Z

    .line 1010
    .line 1011
    iget v1, v8, Lj6/e;->c:I

    .line 1012
    .line 1013
    if-eqz v0, :cond_24

    .line 1014
    .line 1015
    iget v0, v8, Lj6/e;->e:I

    .line 1016
    .line 1017
    const/4 v5, 0x3

    .line 1018
    if-ne v0, v5, :cond_22

    .line 1019
    .line 1020
    iget-object v0, v11, Lj6/b;->d:[I

    .line 1021
    .line 1022
    iget v8, v8, Lj6/e;->g:I

    .line 1023
    .line 1024
    aget v0, v0, v8

    .line 1025
    .line 1026
    const/4 v14, 0x2

    .line 1027
    goto :goto_14

    .line 1028
    :cond_22
    const/4 v14, 0x2

    .line 1029
    if-ne v0, v14, :cond_23

    .line 1030
    .line 1031
    iget-object v0, v11, Lj6/b;->c:[I

    .line 1032
    .line 1033
    iget v8, v8, Lj6/e;->h:I

    .line 1034
    .line 1035
    aget v0, v0, v8

    .line 1036
    .line 1037
    goto :goto_14

    .line 1038
    :cond_23
    iget-object v0, v11, Lj6/b;->b:[I

    .line 1039
    .line 1040
    iget v8, v8, Lj6/e;->i:I

    .line 1041
    .line 1042
    aget v0, v0, v8

    .line 1043
    .line 1044
    :goto_14
    iget-object v8, v6, Lj6/g;->b:Landroid/graphics/Paint;

    .line 1045
    .line 1046
    invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 1047
    .line 1048
    .line 1049
    int-to-float v0, v13

    .line 1050
    int-to-float v11, v10

    .line 1051
    add-int v5, v13, v1

    .line 1052
    .line 1053
    int-to-float v5, v5

    .line 1054
    int-to-float v3, v3

    .line 1055
    move/from16 v18, v0

    .line 1056
    .line 1057
    move/from16 v21, v3

    .line 1058
    .line 1059
    move/from16 v20, v5

    .line 1060
    .line 1061
    move-object/from16 v22, v8

    .line 1062
    .line 1063
    move/from16 v19, v11

    .line 1064
    .line 1065
    move-object/from16 v17, v23

    .line 1066
    .line 1067
    invoke-virtual/range {v17 .. v22}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 1068
    .line 1069
    .line 1070
    move-object/from16 v0, v17

    .line 1071
    .line 1072
    goto :goto_15

    .line 1073
    :cond_24
    move-object/from16 v0, v23

    .line 1074
    .line 1075
    const/4 v14, 0x2

    .line 1076
    :goto_15
    iget-object v3, v6, Lj6/g;->g:Landroid/graphics/Bitmap;

    .line 1077
    .line 1078
    invoke-static {v3, v13, v10, v1, v15}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v21

    .line 1082
    int-to-float v3, v13

    .line 1083
    iget v5, v2, LR2/b;->a:I

    .line 1084
    .line 1085
    int-to-float v5, v5

    .line 1086
    div-float v25, v3, v5

    .line 1087
    .line 1088
    int-to-float v3, v10

    .line 1089
    iget v8, v2, LR2/b;->b:I

    .line 1090
    .line 1091
    int-to-float v8, v8

    .line 1092
    div-float v22, v3, v8

    .line 1093
    .line 1094
    int-to-float v1, v1

    .line 1095
    div-float v29, v1, v5

    .line 1096
    .line 1097
    int-to-float v1, v15

    .line 1098
    div-float v30, v1, v8

    .line 1099
    .line 1100
    new-instance v17, Lh6/b;

    .line 1101
    .line 1102
    const v28, -0x800001

    .line 1103
    .line 1104
    .line 1105
    const/16 v31, 0x0

    .line 1106
    .line 1107
    const/16 v18, 0x0

    .line 1108
    .line 1109
    const/16 v23, 0x0

    .line 1110
    .line 1111
    const/16 v24, 0x0

    .line 1112
    .line 1113
    const/16 v26, 0x0

    .line 1114
    .line 1115
    const/high16 v27, -0x80000000

    .line 1116
    .line 1117
    const/high16 v32, -0x1000000

    .line 1118
    .line 1119
    const/16 v34, 0x0

    .line 1120
    .line 1121
    move-object/from16 v19, v18

    .line 1122
    .line 1123
    move-object/from16 v20, v18

    .line 1124
    .line 1125
    move/from16 v33, v27

    .line 1126
    .line 1127
    invoke-direct/range {v17 .. v34}, Lh6/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 1128
    .line 1129
    .line 1130
    move-object/from16 v1, v17

    .line 1131
    .line 1132
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1133
    .line 1134
    .line 1135
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 1136
    .line 1137
    const/4 v3, 0x0

    .line 1138
    invoke-virtual {v0, v3, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    .line 1142
    .line 1143
    .line 1144
    add-int/lit8 v7, v7, 0x1

    .line 1145
    .line 1146
    move-object/from16 v1, p2

    .line 1147
    .line 1148
    move-object v5, v0

    .line 1149
    move v3, v14

    .line 1150
    const/4 v11, 0x3

    .line 1151
    move-object/from16 v0, p0

    .line 1152
    .line 1153
    goto/16 :goto_f

    .line 1154
    .line 1155
    :cond_25
    invoke-static {v4}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v1

    .line 1159
    goto/16 :goto_d

    .line 1160
    .line 1161
    :goto_16
    invoke-direct {v9, v0, v1}, Li6/i;-><init>(ILjava/util/List;)V

    .line 1162
    .line 1163
    .line 1164
    return-object v9

    .line 1165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    :pswitch_data_1
    .packed-switch 0x10
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
