.class public final LE/k;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LE/k;->i:I

    iput-object p1, p0, LE/k;->j:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p3, p0, LE/k;->i:I

    iput-object p1, p0, LE/k;->j:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, LE/k;->i:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v0, p1

    .line 9
    .line 10
    check-cast v0, LN/o;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    check-cast v2, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 17
    .line 18
    .line 19
    const/16 v2, 0x9

    .line 20
    .line 21
    iget-object v3, v1, LE/k;->j:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Lu0/L;

    .line 24
    .line 25
    invoke-virtual {v3, v2, v0}, Lu0/L;->a(ILN/o;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Lef/C;->a:Lef/C;

    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_0
    move-object/from16 v0, p1

    .line 32
    .line 33
    check-cast v0, LN/o;

    .line 34
    .line 35
    move-object/from16 v2, p2

    .line 36
    .line 37
    check-cast v2, Ljava/lang/Number;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    and-int/lit8 v2, v2, 0xb

    .line 44
    .line 45
    const/4 v3, 0x2

    .line 46
    if-ne v2, v3, :cond_1

    .line 47
    .line 48
    invoke-virtual {v0}, LN/o;->x()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {v0}, LN/o;->I()V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    :goto_0
    iget-object v2, v1, LE/k;->j:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Lu0/a;

    .line 62
    .line 63
    const/16 v3, 0x8

    .line 64
    .line 65
    invoke-virtual {v2, v3, v0}, Lu0/a;->a(ILN/o;)V

    .line 66
    .line 67
    .line 68
    :goto_1
    sget-object v0, Lef/C;->a:Lef/C;

    .line 69
    .line 70
    return-object v0

    .line 71
    :pswitch_1
    move-object/from16 v0, p1

    .line 72
    .line 73
    check-cast v0, LZ/j;

    .line 74
    .line 75
    move-object/from16 v2, p2

    .line 76
    .line 77
    check-cast v2, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    const-string v3, "mod"

    .line 84
    .line 85
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    if-nez v2, :cond_6

    .line 89
    .line 90
    instance-of v2, v0, Lr0/o;

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    if-eqz v2, :cond_7

    .line 94
    .line 95
    const/4 v2, 0x0

    .line 96
    iget-object v4, v1, LE/k;->j:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v4, LP/d;

    .line 99
    .line 100
    if-eqz v4, :cond_5

    .line 101
    .line 102
    iget v5, v4, LP/d;->c:I

    .line 103
    .line 104
    if-lez v5, :cond_4

    .line 105
    .line 106
    iget-object v4, v4, LP/d;->a:[Ljava/lang/Object;

    .line 107
    .line 108
    move v6, v3

    .line 109
    :cond_2
    aget-object v7, v4, v6

    .line 110
    .line 111
    move-object v8, v7

    .line 112
    check-cast v8, Lef/k;

    .line 113
    .line 114
    iget-object v8, v8, Lef/k;->b:Ljava/lang/Object;

    .line 115
    .line 116
    invoke-virtual {v0, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    if-eqz v8, :cond_3

    .line 121
    .line 122
    move-object v2, v7

    .line 123
    goto :goto_2

    .line 124
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 125
    .line 126
    if-lt v6, v5, :cond_2

    .line 127
    .line 128
    :cond_4
    :goto_2
    check-cast v2, Lef/k;

    .line 129
    .line 130
    :cond_5
    if-nez v2, :cond_7

    .line 131
    .line 132
    :cond_6
    const/4 v3, 0x1

    .line 133
    :cond_7
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    return-object v0

    .line 138
    :pswitch_2
    move-object/from16 v0, p1

    .line 139
    .line 140
    check-cast v0, LZ/k;

    .line 141
    .line 142
    move-object/from16 v2, p2

    .line 143
    .line 144
    check-cast v2, LZ/j;

    .line 145
    .line 146
    const-string v3, "acc"

    .line 147
    .line 148
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    const-string v3, "element"

    .line 152
    .line 153
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    instance-of v3, v2, LZ/g;

    .line 157
    .line 158
    if-eqz v3, :cond_8

    .line 159
    .line 160
    check-cast v2, LZ/g;

    .line 161
    .line 162
    iget-object v2, v2, LZ/g;->b:Lkotlin/jvm/internal/n;

    .line 163
    .line 164
    const/4 v3, 0x3

    .line 165
    invoke-static {v3, v2}, Lkotlin/jvm/internal/K;->e(ILjava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    sget-object v3, LZ/i;->a:LZ/i;

    .line 169
    .line 170
    const/4 v4, 0x0

    .line 171
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    iget-object v5, v1, LE/k;->j:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v5, LN/o;

    .line 178
    .line 179
    invoke-interface {v2, v3, v5, v4}, Ltf/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    check-cast v2, LZ/k;

    .line 184
    .line 185
    invoke-static {v5, v2}, Lr7/e;->F(LN/o;LZ/k;)LZ/k;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    :cond_8
    invoke-interface {v0, v2}, LZ/k;->g(LZ/k;)LZ/k;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    return-object v0

    .line 194
    :pswitch_3
    move-object/from16 v0, p1

    .line 195
    .line 196
    check-cast v0, Ljava/util/Set;

    .line 197
    .line 198
    move-object/from16 v2, p2

    .line 199
    .line 200
    check-cast v2, LX/g;

    .line 201
    .line 202
    :goto_3
    iget-object v2, v1, LE/k;->j:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v2, LX/u;

    .line 205
    .line 206
    iget-object v3, v2, LX/u;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 207
    .line 208
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    if-nez v4, :cond_9

    .line 213
    .line 214
    move-object v5, v0

    .line 215
    check-cast v5, Ljava/util/Collection;

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_9
    instance-of v5, v4, Ljava/util/Set;

    .line 219
    .line 220
    if-eqz v5, :cond_a

    .line 221
    .line 222
    const/4 v5, 0x2

    .line 223
    new-array v5, v5, [Ljava/util/Set;

    .line 224
    .line 225
    const/4 v6, 0x0

    .line 226
    aput-object v4, v5, v6

    .line 227
    .line 228
    const/4 v6, 0x1

    .line 229
    aput-object v0, v5, v6

    .line 230
    .line 231
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    check-cast v5, Ljava/util/Collection;

    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_a
    instance-of v5, v4, Ljava/util/List;

    .line 239
    .line 240
    if-eqz v5, :cond_e

    .line 241
    .line 242
    move-object v5, v4

    .line 243
    check-cast v5, Ljava/util/Collection;

    .line 244
    .line 245
    invoke-static {v0}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    check-cast v6, Ljava/lang/Iterable;

    .line 250
    .line 251
    invoke-static {v6, v5}, Lff/o;->E0(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    :cond_b
    :goto_4
    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    if-eqz v6, :cond_d

    .line 260
    .line 261
    invoke-static {v2}, LX/u;->a(LX/u;)Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-eqz v0, :cond_c

    .line 266
    .line 267
    new-instance v0, LA0/p;

    .line 268
    .line 269
    const/16 v3, 0xe

    .line 270
    .line 271
    invoke-direct {v0, v2, v3}, LA0/p;-><init>(Ljava/lang/Object;I)V

    .line 272
    .line 273
    .line 274
    iget-object v2, v2, LX/u;->a:Lkotlin/jvm/internal/n;

    .line 275
    .line 276
    invoke-interface {v2, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    :cond_c
    sget-object v0, Lef/C;->a:Lef/C;

    .line 280
    .line 281
    return-object v0

    .line 282
    :cond_d
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v6

    .line 286
    if-eq v6, v4, :cond_b

    .line 287
    .line 288
    goto :goto_3

    .line 289
    :cond_e
    const-string v0, "Unexpected notification"

    .line 290
    .line 291
    invoke-static {v0}, LN/d;->w(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    const/4 v0, 0x0

    .line 295
    throw v0

    .line 296
    :pswitch_4
    move-object/from16 v0, p1

    .line 297
    .line 298
    check-cast v0, Ljava/util/Set;

    .line 299
    .line 300
    move-object/from16 v2, p2

    .line 301
    .line 302
    check-cast v2, LX/g;

    .line 303
    .line 304
    instance-of v2, v0, LP/f;

    .line 305
    .line 306
    const/4 v3, 0x4

    .line 307
    if-eqz v2, :cond_12

    .line 308
    .line 309
    move-object v2, v0

    .line 310
    check-cast v2, LP/f;

    .line 311
    .line 312
    iget-object v2, v2, LP/f;->a:Lx/r;

    .line 313
    .line 314
    iget-object v4, v2, Lx/r;->b:[Ljava/lang/Object;

    .line 315
    .line 316
    iget-object v2, v2, Lx/r;->a:[J

    .line 317
    .line 318
    array-length v5, v2

    .line 319
    add-int/lit8 v5, v5, -0x2

    .line 320
    .line 321
    if-ltz v5, :cond_16

    .line 322
    .line 323
    const/4 v6, 0x0

    .line 324
    move v7, v6

    .line 325
    :goto_5
    aget-wide v8, v2, v7

    .line 326
    .line 327
    not-long v10, v8

    .line 328
    const/4 v12, 0x7

    .line 329
    shl-long/2addr v10, v12

    .line 330
    and-long/2addr v10, v8

    .line 331
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    and-long/2addr v10, v12

    .line 337
    cmp-long v10, v10, v12

    .line 338
    .line 339
    if-eqz v10, :cond_11

    .line 340
    .line 341
    sub-int v10, v7, v5

    .line 342
    .line 343
    not-int v10, v10

    .line 344
    ushr-int/lit8 v10, v10, 0x1f

    .line 345
    .line 346
    const/16 v11, 0x8

    .line 347
    .line 348
    rsub-int/lit8 v10, v10, 0x8

    .line 349
    .line 350
    move v12, v6

    .line 351
    :goto_6
    if-ge v12, v10, :cond_10

    .line 352
    .line 353
    const-wide/16 v13, 0xff

    .line 354
    .line 355
    and-long/2addr v13, v8

    .line 356
    const-wide/16 v15, 0x80

    .line 357
    .line 358
    cmp-long v13, v13, v15

    .line 359
    .line 360
    if-gez v13, :cond_f

    .line 361
    .line 362
    shl-int/lit8 v13, v7, 0x3

    .line 363
    .line 364
    add-int/2addr v13, v12

    .line 365
    aget-object v13, v4, v13

    .line 366
    .line 367
    instance-of v14, v13, LX/z;

    .line 368
    .line 369
    if-eqz v14, :cond_15

    .line 370
    .line 371
    check-cast v13, LX/z;

    .line 372
    .line 373
    invoke-virtual {v13, v3}, LX/z;->g(I)Z

    .line 374
    .line 375
    .line 376
    move-result v13

    .line 377
    if-eqz v13, :cond_f

    .line 378
    .line 379
    goto :goto_7

    .line 380
    :cond_f
    shr-long/2addr v8, v11

    .line 381
    add-int/lit8 v12, v12, 0x1

    .line 382
    .line 383
    goto :goto_6

    .line 384
    :cond_10
    if-ne v10, v11, :cond_16

    .line 385
    .line 386
    :cond_11
    if-eq v7, v5, :cond_16

    .line 387
    .line 388
    add-int/lit8 v7, v7, 0x1

    .line 389
    .line 390
    goto :goto_5

    .line 391
    :cond_12
    move-object v2, v0

    .line 392
    check-cast v2, Ljava/lang/Iterable;

    .line 393
    .line 394
    instance-of v4, v2, Ljava/util/Collection;

    .line 395
    .line 396
    if-eqz v4, :cond_13

    .line 397
    .line 398
    move-object v4, v2

    .line 399
    check-cast v4, Ljava/util/Collection;

    .line 400
    .line 401
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 402
    .line 403
    .line 404
    move-result v4

    .line 405
    if-eqz v4, :cond_13

    .line 406
    .line 407
    goto :goto_8

    .line 408
    :cond_13
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    :cond_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 413
    .line 414
    .line 415
    move-result v4

    .line 416
    if-eqz v4, :cond_16

    .line 417
    .line 418
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    instance-of v5, v4, LX/z;

    .line 423
    .line 424
    if-eqz v5, :cond_15

    .line 425
    .line 426
    check-cast v4, LX/z;

    .line 427
    .line 428
    invoke-virtual {v4, v3}, LX/z;->g(I)Z

    .line 429
    .line 430
    .line 431
    move-result v4

    .line 432
    if-eqz v4, :cond_14

    .line 433
    .line 434
    :cond_15
    :goto_7
    iget-object v2, v1, LE/k;->j:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v2, LGf/e;

    .line 437
    .line 438
    invoke-interface {v2, v0}, LGf/w;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    :cond_16
    :goto_8
    sget-object v0, Lef/C;->a:Lef/C;

    .line 442
    .line 443
    return-object v0

    .line 444
    :pswitch_5
    move-object/from16 v0, p1

    .line 445
    .line 446
    check-cast v0, Ljava/util/Set;

    .line 447
    .line 448
    move-object/from16 v2, p2

    .line 449
    .line 450
    check-cast v2, LX/g;

    .line 451
    .line 452
    iget-object v2, v1, LE/k;->j:Ljava/lang/Object;

    .line 453
    .line 454
    check-cast v2, LN/p0;

    .line 455
    .line 456
    iget-object v3, v2, LN/p0;->b:Ljava/lang/Object;

    .line 457
    .line 458
    monitor-enter v3

    .line 459
    :try_start_0
    iget-object v4, v2, LN/p0;->q:LHf/x0;

    .line 460
    .line 461
    invoke-virtual {v4}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v4

    .line 465
    check-cast v4, LN/j0;

    .line 466
    .line 467
    sget-object v5, LN/j0;->e:LN/j0;

    .line 468
    .line 469
    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 470
    .line 471
    .line 472
    move-result v4

    .line 473
    if-ltz v4, :cond_1e

    .line 474
    .line 475
    iget-object v4, v2, LN/p0;->g:Lx/r;

    .line 476
    .line 477
    instance-of v5, v0, LP/f;

    .line 478
    .line 479
    const/4 v6, 0x1

    .line 480
    if-eqz v5, :cond_1b

    .line 481
    .line 482
    check-cast v0, LP/f;

    .line 483
    .line 484
    iget-object v0, v0, LP/f;->a:Lx/r;

    .line 485
    .line 486
    iget-object v5, v0, Lx/r;->b:[Ljava/lang/Object;

    .line 487
    .line 488
    iget-object v0, v0, Lx/r;->a:[J

    .line 489
    .line 490
    array-length v7, v0

    .line 491
    add-int/lit8 v7, v7, -0x2

    .line 492
    .line 493
    if-ltz v7, :cond_1d

    .line 494
    .line 495
    const/4 v9, 0x0

    .line 496
    :goto_9
    aget-wide v10, v0, v9

    .line 497
    .line 498
    not-long v12, v10

    .line 499
    const/4 v14, 0x7

    .line 500
    shl-long/2addr v12, v14

    .line 501
    and-long/2addr v12, v10

    .line 502
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    and-long/2addr v12, v14

    .line 508
    cmp-long v12, v12, v14

    .line 509
    .line 510
    if-eqz v12, :cond_1a

    .line 511
    .line 512
    sub-int v12, v9, v7

    .line 513
    .line 514
    not-int v12, v12

    .line 515
    ushr-int/lit8 v12, v12, 0x1f

    .line 516
    .line 517
    const/16 v13, 0x8

    .line 518
    .line 519
    rsub-int/lit8 v12, v12, 0x8

    .line 520
    .line 521
    const/4 v14, 0x0

    .line 522
    :goto_a
    if-ge v14, v12, :cond_19

    .line 523
    .line 524
    const-wide/16 v15, 0xff

    .line 525
    .line 526
    and-long/2addr v15, v10

    .line 527
    const-wide/16 v17, 0x80

    .line 528
    .line 529
    cmp-long v15, v15, v17

    .line 530
    .line 531
    if-gez v15, :cond_18

    .line 532
    .line 533
    shl-int/lit8 v15, v9, 0x3

    .line 534
    .line 535
    add-int/2addr v15, v14

    .line 536
    aget-object v15, v5, v15

    .line 537
    .line 538
    instance-of v8, v15, LX/z;

    .line 539
    .line 540
    if-eqz v8, :cond_17

    .line 541
    .line 542
    move-object v8, v15

    .line 543
    check-cast v8, LX/z;

    .line 544
    .line 545
    invoke-virtual {v8, v6}, LX/z;->g(I)Z

    .line 546
    .line 547
    .line 548
    move-result v8

    .line 549
    if-nez v8, :cond_17

    .line 550
    .line 551
    goto :goto_b

    .line 552
    :catchall_0
    move-exception v0

    .line 553
    goto :goto_e

    .line 554
    :cond_17
    invoke-virtual {v4, v15}, Lx/r;->a(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    :cond_18
    :goto_b
    shr-long/2addr v10, v13

    .line 558
    add-int/lit8 v14, v14, 0x1

    .line 559
    .line 560
    goto :goto_a

    .line 561
    :cond_19
    if-ne v12, v13, :cond_1d

    .line 562
    .line 563
    :cond_1a
    if-eq v9, v7, :cond_1d

    .line 564
    .line 565
    add-int/lit8 v9, v9, 0x1

    .line 566
    .line 567
    goto :goto_9

    .line 568
    :cond_1b
    check-cast v0, Ljava/lang/Iterable;

    .line 569
    .line 570
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 575
    .line 576
    .line 577
    move-result v5

    .line 578
    if-eqz v5, :cond_1d

    .line 579
    .line 580
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v5

    .line 584
    instance-of v7, v5, LX/z;

    .line 585
    .line 586
    if-eqz v7, :cond_1c

    .line 587
    .line 588
    move-object v7, v5

    .line 589
    check-cast v7, LX/z;

    .line 590
    .line 591
    invoke-virtual {v7, v6}, LX/z;->g(I)Z

    .line 592
    .line 593
    .line 594
    move-result v7

    .line 595
    if-nez v7, :cond_1c

    .line 596
    .line 597
    goto :goto_c

    .line 598
    :cond_1c
    invoke-virtual {v4, v5}, Lx/r;->a(Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    goto :goto_c

    .line 602
    :cond_1d
    invoke-virtual {v2}, LN/p0;->x()LEf/l;

    .line 603
    .line 604
    .line 605
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 606
    goto :goto_d

    .line 607
    :cond_1e
    const/4 v0, 0x0

    .line 608
    :goto_d
    monitor-exit v3

    .line 609
    if-eqz v0, :cond_1f

    .line 610
    .line 611
    sget-object v2, Lef/C;->a:Lef/C;

    .line 612
    .line 613
    check-cast v0, LEf/n;

    .line 614
    .line 615
    invoke-virtual {v0, v2}, LEf/n;->resumeWith(Ljava/lang/Object;)V

    .line 616
    .line 617
    .line 618
    :cond_1f
    sget-object v0, Lef/C;->a:Lef/C;

    .line 619
    .line 620
    return-object v0

    .line 621
    :goto_e
    monitor-exit v3

    .line 622
    throw v0

    .line 623
    :pswitch_6
    move-object/from16 v0, p1

    .line 624
    .line 625
    check-cast v0, LN/o;

    .line 626
    .line 627
    move-object/from16 v2, p2

    .line 628
    .line 629
    check-cast v2, Ljava/lang/Number;

    .line 630
    .line 631
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 632
    .line 633
    .line 634
    const/4 v2, 0x1

    .line 635
    iget-object v3, v1, LE/k;->j:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast v3, LZ/k;

    .line 638
    .line 639
    invoke-static {v3, v0, v2}, LE/p;->a(LZ/k;LN/o;I)V

    .line 640
    .line 641
    .line 642
    sget-object v0, Lef/C;->a:Lef/C;

    .line 643
    .line 644
    return-object v0

    .line 645
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
