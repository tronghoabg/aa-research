.class public final LU5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ5/k;


# instance fields
.field public a:Lf6/N;

.field public b:LJ5/w;

.field public c:I

.field public d:J

.field public e:LU5/b;

.field public f:I

.field public g:J


# virtual methods
.method public final a(JJ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p1, 0x4

    .line 10
    :goto_0
    iput p1, p0, LU5/d;->c:I

    .line 11
    .line 12
    iget-object p1, p0, LU5/d;->e:LU5/b;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-interface {p1, p3, p4}, LU5/b;->b(J)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final g(LJ5/l;LJ5/n;)I
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LU5/d;->b:LJ5/w;

    .line 4
    .line 5
    invoke-static {v1}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget v1, Lu6/v;->a:I

    .line 9
    .line 10
    iget v1, v0, LU5/d;->c:I

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, -0x1

    .line 14
    const/4 v4, 0x4

    .line 15
    const/4 v5, 0x1

    .line 16
    if-eqz v1, :cond_12

    .line 17
    .line 18
    const/16 v6, 0x8

    .line 19
    .line 20
    const/4 v7, 0x2

    .line 21
    const-wide/16 v8, -0x1

    .line 22
    .line 23
    if-eq v1, v5, :cond_10

    .line 24
    .line 25
    const/4 v10, 0x3

    .line 26
    if-eq v1, v7, :cond_6

    .line 27
    .line 28
    if-eq v1, v10, :cond_3

    .line 29
    .line 30
    if-ne v1, v4, :cond_2

    .line 31
    .line 32
    iget-wide v6, v0, LU5/d;->g:J

    .line 33
    .line 34
    cmp-long v1, v6, v8

    .line 35
    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v5, v2

    .line 40
    :goto_0
    invoke-static {v5}, Lu6/a;->i(Z)V

    .line 41
    .line 42
    .line 43
    iget-wide v4, v0, LU5/d;->g:J

    .line 44
    .line 45
    move-object/from16 v1, p1

    .line 46
    .line 47
    check-cast v1, LJ5/h;

    .line 48
    .line 49
    iget-wide v6, v1, LJ5/h;->d:J

    .line 50
    .line 51
    sub-long/2addr v4, v6

    .line 52
    iget-object v1, v0, LU5/d;->e:LU5/b;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-object/from16 v6, p1

    .line 58
    .line 59
    check-cast v6, LJ5/h;

    .line 60
    .line 61
    invoke-interface {v1, v6, v4, v5}, LU5/b;->d(LJ5/h;J)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    return v3

    .line 68
    :cond_1
    return v2

    .line 69
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 72
    .line 73
    .line 74
    throw v1

    .line 75
    :cond_3
    move-object/from16 v1, p1

    .line 76
    .line 77
    check-cast v1, LJ5/h;

    .line 78
    .line 79
    iput v2, v1, LJ5/h;->f:I

    .line 80
    .line 81
    new-instance v1, LY4/b;

    .line 82
    .line 83
    invoke-direct {v1, v6}, LY4/b;-><init>(I)V

    .line 84
    .line 85
    .line 86
    move-object/from16 v3, p1

    .line 87
    .line 88
    check-cast v3, LJ5/h;

    .line 89
    .line 90
    const v5, 0x64617461

    .line 91
    .line 92
    .line 93
    invoke-static {v5, v3, v1}, LA6/c;->N(ILJ5/h;LY4/b;)LU5/f;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v3, v6}, LJ5/h;->j(I)V

    .line 98
    .line 99
    .line 100
    iget-wide v5, v3, LJ5/h;->d:J

    .line 101
    .line 102
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    iget-wide v6, v1, LU5/f;->b:J

    .line 107
    .line 108
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-static {v5, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    iget-object v5, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v5, Ljava/lang/Long;

    .line 119
    .line 120
    invoke-virtual {v5}, Ljava/lang/Long;->intValue()I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    iput v5, v0, LU5/d;->f:I

    .line 125
    .line 126
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, Ljava/lang/Long;

    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 131
    .line 132
    .line 133
    move-result-wide v5

    .line 134
    iget-wide v10, v0, LU5/d;->d:J

    .line 135
    .line 136
    cmp-long v1, v10, v8

    .line 137
    .line 138
    if-eqz v1, :cond_4

    .line 139
    .line 140
    const-wide v12, 0xffffffffL

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    cmp-long v1, v5, v12

    .line 146
    .line 147
    if-nez v1, :cond_4

    .line 148
    .line 149
    move-wide v5, v10

    .line 150
    :cond_4
    iget v1, v0, LU5/d;->f:I

    .line 151
    .line 152
    int-to-long v10, v1

    .line 153
    add-long/2addr v10, v5

    .line 154
    iput-wide v10, v0, LU5/d;->g:J

    .line 155
    .line 156
    iget-wide v5, v3, LJ5/h;->c:J

    .line 157
    .line 158
    cmp-long v1, v5, v8

    .line 159
    .line 160
    if-eqz v1, :cond_5

    .line 161
    .line 162
    cmp-long v1, v10, v5

    .line 163
    .line 164
    if-lez v1, :cond_5

    .line 165
    .line 166
    new-instance v1, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    const-string v3, "Data exceeds input length: "

    .line 169
    .line 170
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    iget-wide v7, v0, LU5/d;->g:J

    .line 174
    .line 175
    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v3, ", "

    .line 179
    .line 180
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    const-string v3, "WavExtractor"

    .line 191
    .line 192
    invoke-static {v3, v1}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    iput-wide v5, v0, LU5/d;->g:J

    .line 196
    .line 197
    :cond_5
    iget-object v1, v0, LU5/d;->e:LU5/b;

    .line 198
    .line 199
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    iget v3, v0, LU5/d;->f:I

    .line 203
    .line 204
    iget-wide v5, v0, LU5/d;->g:J

    .line 205
    .line 206
    invoke-interface {v1, v3, v5, v6}, LU5/b;->a(IJ)V

    .line 207
    .line 208
    .line 209
    iput v4, v0, LU5/d;->c:I

    .line 210
    .line 211
    return v2

    .line 212
    :cond_6
    new-instance v1, LY4/b;

    .line 213
    .line 214
    const/16 v3, 0x10

    .line 215
    .line 216
    invoke-direct {v1, v3}, LY4/b;-><init>(I)V

    .line 217
    .line 218
    .line 219
    move-object/from16 v6, p1

    .line 220
    .line 221
    check-cast v6, LJ5/h;

    .line 222
    .line 223
    const v7, 0x666d7420

    .line 224
    .line 225
    .line 226
    invoke-static {v7, v6, v1}, LA6/c;->N(ILJ5/h;LY4/b;)LU5/f;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    iget-wide v7, v7, LU5/f;->b:J

    .line 231
    .line 232
    const-wide/16 v11, 0x10

    .line 233
    .line 234
    cmp-long v9, v7, v11

    .line 235
    .line 236
    if-ltz v9, :cond_7

    .line 237
    .line 238
    move v9, v5

    .line 239
    goto :goto_1

    .line 240
    :cond_7
    move v9, v2

    .line 241
    :goto_1
    invoke-static {v9}, Lu6/a;->i(Z)V

    .line 242
    .line 243
    .line 244
    iget-object v9, v1, LY4/b;->a:[B

    .line 245
    .line 246
    invoke-virtual {v6, v9, v2, v3, v2}, LJ5/h;->c([BIIZ)Z

    .line 247
    .line 248
    .line 249
    invoke-virtual {v1, v2}, LY4/b;->A(I)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1}, LY4/b;->j()I

    .line 253
    .line 254
    .line 255
    move-result v12

    .line 256
    invoke-virtual {v1}, LY4/b;->j()I

    .line 257
    .line 258
    .line 259
    move-result v13

    .line 260
    invoke-virtual {v1}, LY4/b;->i()I

    .line 261
    .line 262
    .line 263
    move-result v14

    .line 264
    invoke-virtual {v1}, LY4/b;->i()I

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1}, LY4/b;->j()I

    .line 268
    .line 269
    .line 270
    move-result v15

    .line 271
    invoke-virtual {v1}, LY4/b;->j()I

    .line 272
    .line 273
    .line 274
    move-result v16

    .line 275
    long-to-int v1, v7

    .line 276
    sub-int/2addr v1, v3

    .line 277
    if-lez v1, :cond_8

    .line 278
    .line 279
    new-array v3, v1, [B

    .line 280
    .line 281
    move-object/from16 v6, p1

    .line 282
    .line 283
    check-cast v6, LJ5/h;

    .line 284
    .line 285
    invoke-virtual {v6, v3, v2, v1, v2}, LJ5/h;->c([BIIZ)Z

    .line 286
    .line 287
    .line 288
    :goto_2
    move-object/from16 v17, v3

    .line 289
    .line 290
    goto :goto_3

    .line 291
    :cond_8
    sget-object v3, Lu6/v;->f:[B

    .line 292
    .line 293
    goto :goto_2

    .line 294
    :goto_3
    move-object/from16 v1, p1

    .line 295
    .line 296
    check-cast v1, LJ5/h;

    .line 297
    .line 298
    invoke-virtual {v1}, LJ5/h;->g()J

    .line 299
    .line 300
    .line 301
    move-result-wide v6

    .line 302
    iget-wide v8, v1, LJ5/h;->d:J

    .line 303
    .line 304
    sub-long/2addr v6, v8

    .line 305
    long-to-int v3, v6

    .line 306
    invoke-virtual {v1, v3}, LJ5/h;->j(I)V

    .line 307
    .line 308
    .line 309
    new-instance v21, LU5/e;

    .line 310
    .line 311
    move-object/from16 v11, v21

    .line 312
    .line 313
    invoke-direct/range {v11 .. v17}, LU5/e;-><init>(IIIII[B)V

    .line 314
    .line 315
    .line 316
    move/from16 v1, v16

    .line 317
    .line 318
    const/16 v3, 0x11

    .line 319
    .line 320
    if-ne v12, v3, :cond_9

    .line 321
    .line 322
    new-instance v1, LU5/a;

    .line 323
    .line 324
    iget-object v3, v0, LU5/d;->a:Lf6/N;

    .line 325
    .line 326
    iget-object v4, v0, LU5/d;->b:LJ5/w;

    .line 327
    .line 328
    invoke-direct {v1, v3, v4, v11}, LU5/a;-><init>(Lf6/N;LJ5/w;LU5/e;)V

    .line 329
    .line 330
    .line 331
    iput-object v1, v0, LU5/d;->e:LU5/b;

    .line 332
    .line 333
    goto/16 :goto_6

    .line 334
    .line 335
    :cond_9
    const/4 v3, 0x6

    .line 336
    if-ne v12, v3, :cond_a

    .line 337
    .line 338
    new-instance v18, LU5/c;

    .line 339
    .line 340
    iget-object v1, v0, LU5/d;->a:Lf6/N;

    .line 341
    .line 342
    iget-object v3, v0, LU5/d;->b:LJ5/w;

    .line 343
    .line 344
    const-string v22, "audio/g711-alaw"

    .line 345
    .line 346
    const/16 v23, -0x1

    .line 347
    .line 348
    move-object/from16 v19, v1

    .line 349
    .line 350
    move-object/from16 v20, v3

    .line 351
    .line 352
    move-object/from16 v21, v11

    .line 353
    .line 354
    invoke-direct/range {v18 .. v23}, LU5/c;-><init>(Lf6/N;LJ5/w;LU5/e;Ljava/lang/String;I)V

    .line 355
    .line 356
    .line 357
    move-object/from16 v1, v18

    .line 358
    .line 359
    iput-object v1, v0, LU5/d;->e:LU5/b;

    .line 360
    .line 361
    goto :goto_6

    .line 362
    :cond_a
    move-object/from16 v21, v11

    .line 363
    .line 364
    const/4 v3, 0x7

    .line 365
    if-ne v12, v3, :cond_b

    .line 366
    .line 367
    new-instance v18, LU5/c;

    .line 368
    .line 369
    iget-object v1, v0, LU5/d;->a:Lf6/N;

    .line 370
    .line 371
    iget-object v3, v0, LU5/d;->b:LJ5/w;

    .line 372
    .line 373
    const-string v22, "audio/g711-mlaw"

    .line 374
    .line 375
    const/16 v23, -0x1

    .line 376
    .line 377
    move-object/from16 v19, v1

    .line 378
    .line 379
    move-object/from16 v20, v3

    .line 380
    .line 381
    invoke-direct/range {v18 .. v23}, LU5/c;-><init>(Lf6/N;LJ5/w;LU5/e;Ljava/lang/String;I)V

    .line 382
    .line 383
    .line 384
    move-object/from16 v1, v18

    .line 385
    .line 386
    iput-object v1, v0, LU5/d;->e:LU5/b;

    .line 387
    .line 388
    goto :goto_6

    .line 389
    :cond_b
    if-eq v12, v5, :cond_e

    .line 390
    .line 391
    if-eq v12, v10, :cond_d

    .line 392
    .line 393
    const v3, 0xfffe

    .line 394
    .line 395
    .line 396
    if-eq v12, v3, :cond_e

    .line 397
    .line 398
    :cond_c
    move/from16 v23, v2

    .line 399
    .line 400
    goto :goto_5

    .line 401
    :cond_d
    const/16 v3, 0x20

    .line 402
    .line 403
    if-ne v1, v3, :cond_c

    .line 404
    .line 405
    :goto_4
    move/from16 v23, v4

    .line 406
    .line 407
    goto :goto_5

    .line 408
    :cond_e
    invoke-static {v1}, Lu6/v;->o(I)I

    .line 409
    .line 410
    .line 411
    move-result v4

    .line 412
    goto :goto_4

    .line 413
    :goto_5
    if-eqz v23, :cond_f

    .line 414
    .line 415
    new-instance v18, LU5/c;

    .line 416
    .line 417
    iget-object v1, v0, LU5/d;->a:Lf6/N;

    .line 418
    .line 419
    iget-object v3, v0, LU5/d;->b:LJ5/w;

    .line 420
    .line 421
    const-string v22, "audio/raw"

    .line 422
    .line 423
    move-object/from16 v19, v1

    .line 424
    .line 425
    move-object/from16 v20, v3

    .line 426
    .line 427
    invoke-direct/range {v18 .. v23}, LU5/c;-><init>(Lf6/N;LJ5/w;LU5/e;Ljava/lang/String;I)V

    .line 428
    .line 429
    .line 430
    move-object/from16 v1, v18

    .line 431
    .line 432
    iput-object v1, v0, LU5/d;->e:LU5/b;

    .line 433
    .line 434
    :goto_6
    iput v10, v0, LU5/d;->c:I

    .line 435
    .line 436
    return v2

    .line 437
    :cond_f
    new-instance v1, Ljava/lang/StringBuilder;

    .line 438
    .line 439
    const-string v2, "Unsupported WAV format type: "

    .line 440
    .line 441
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    invoke-static {v1}, LE5/o0;->b(Ljava/lang/String;)LE5/o0;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    throw v1

    .line 456
    :cond_10
    new-instance v1, LY4/b;

    .line 457
    .line 458
    invoke-direct {v1, v6}, LY4/b;-><init>(I)V

    .line 459
    .line 460
    .line 461
    move-object/from16 v3, p1

    .line 462
    .line 463
    check-cast v3, LJ5/h;

    .line 464
    .line 465
    invoke-static {v3, v1}, LU5/f;->b(LJ5/h;LY4/b;)LU5/f;

    .line 466
    .line 467
    .line 468
    move-result-object v4

    .line 469
    iget v5, v4, LU5/f;->a:I

    .line 470
    .line 471
    const v10, 0x64733634

    .line 472
    .line 473
    .line 474
    if-eq v5, v10, :cond_11

    .line 475
    .line 476
    iput v2, v3, LJ5/h;->f:I

    .line 477
    .line 478
    goto :goto_7

    .line 479
    :cond_11
    invoke-virtual {v3, v6, v2}, LJ5/h;->b(IZ)Z

    .line 480
    .line 481
    .line 482
    invoke-virtual {v1, v2}, LY4/b;->A(I)V

    .line 483
    .line 484
    .line 485
    iget-object v3, v1, LY4/b;->a:[B

    .line 486
    .line 487
    move-object/from16 v5, p1

    .line 488
    .line 489
    check-cast v5, LJ5/h;

    .line 490
    .line 491
    invoke-virtual {v5, v3, v2, v6, v2}, LJ5/h;->c([BIIZ)Z

    .line 492
    .line 493
    .line 494
    invoke-virtual {v1}, LY4/b;->g()J

    .line 495
    .line 496
    .line 497
    move-result-wide v8

    .line 498
    iget-wide v3, v4, LU5/f;->b:J

    .line 499
    .line 500
    long-to-int v1, v3

    .line 501
    add-int/2addr v1, v6

    .line 502
    invoke-virtual {v5, v1}, LJ5/h;->j(I)V

    .line 503
    .line 504
    .line 505
    :goto_7
    iput-wide v8, v0, LU5/d;->d:J

    .line 506
    .line 507
    iput v7, v0, LU5/d;->c:I

    .line 508
    .line 509
    return v2

    .line 510
    :cond_12
    move-object/from16 v1, p1

    .line 511
    .line 512
    check-cast v1, LJ5/h;

    .line 513
    .line 514
    iget-wide v6, v1, LJ5/h;->d:J

    .line 515
    .line 516
    const-wide/16 v8, 0x0

    .line 517
    .line 518
    cmp-long v1, v6, v8

    .line 519
    .line 520
    if-nez v1, :cond_13

    .line 521
    .line 522
    move v1, v5

    .line 523
    goto :goto_8

    .line 524
    :cond_13
    move v1, v2

    .line 525
    :goto_8
    invoke-static {v1}, Lu6/a;->i(Z)V

    .line 526
    .line 527
    .line 528
    iget v1, v0, LU5/d;->f:I

    .line 529
    .line 530
    if-eq v1, v3, :cond_14

    .line 531
    .line 532
    move-object/from16 v3, p1

    .line 533
    .line 534
    check-cast v3, LJ5/h;

    .line 535
    .line 536
    invoke-virtual {v3, v1}, LJ5/h;->j(I)V

    .line 537
    .line 538
    .line 539
    iput v4, v0, LU5/d;->c:I

    .line 540
    .line 541
    return v2

    .line 542
    :cond_14
    move-object/from16 v1, p1

    .line 543
    .line 544
    check-cast v1, LJ5/h;

    .line 545
    .line 546
    invoke-static {v1}, LA6/c;->m(LJ5/h;)Z

    .line 547
    .line 548
    .line 549
    move-result v3

    .line 550
    if-eqz v3, :cond_15

    .line 551
    .line 552
    invoke-virtual {v1}, LJ5/h;->g()J

    .line 553
    .line 554
    .line 555
    move-result-wide v3

    .line 556
    iget-wide v6, v1, LJ5/h;->d:J

    .line 557
    .line 558
    sub-long/2addr v3, v6

    .line 559
    long-to-int v3, v3

    .line 560
    invoke-virtual {v1, v3}, LJ5/h;->j(I)V

    .line 561
    .line 562
    .line 563
    iput v5, v0, LU5/d;->c:I

    .line 564
    .line 565
    return v2

    .line 566
    :cond_15
    const-string v1, "Unsupported or unrecognized wav file type."

    .line 567
    .line 568
    const/4 v2, 0x0

    .line 569
    invoke-static {v1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    throw v1
.end method

.method public final h(Lf6/N;)V
    .locals 2

    .line 1
    iput-object p1, p0, LU5/d;->a:Lf6/N;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-virtual {p1, v0, v1}, Lf6/N;->m(II)LJ5/w;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LU5/d;->b:LJ5/w;

    .line 10
    .line 11
    invoke-virtual {p1}, Lf6/N;->l()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final i(LJ5/l;)Z
    .locals 0

    .line 1
    check-cast p1, LJ5/h;

    .line 2
    .line 3
    invoke-static {p1}, LA6/c;->m(LJ5/h;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
