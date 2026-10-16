.class public final LVa/Y7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/ma;
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements LP2/l;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    new-instance p1, LE4/b;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, v0}, LE4/b;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v0, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, LVa/Y7;->b:Ljava/lang/Object;

    .line 23
    .line 24
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, LVa/Y7;->c:Ljava/lang/Object;

    .line 30
    .line 31
    iput-object p1, p0, LVa/Y7;->a:Ljava/lang/Object;

    .line 32
    .line 33
    new-instance v0, LA7/V;

    .line 34
    .line 35
    const/16 v1, 0x9

    .line 36
    .line 37
    invoke-direct {v0, p0, v1}, LA7/V;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    new-instance p1, LQ1/o;

    .line 48
    .line 49
    invoke-direct {p1}, LQ1/o;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, LVa/Y7;->a:Ljava/lang/Object;

    .line 53
    .line 54
    new-instance p1, LQ1/o;

    .line 55
    .line 56
    invoke-direct {p1}, LQ1/o;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, LVa/Y7;->b:Ljava/lang/Object;

    .line 60
    .line 61
    new-instance p1, LS2/a;

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    invoke-direct {p1, v0}, LS2/a;-><init>(I)V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, LVa/Y7;->c:Ljava/lang/Object;

    .line 68
    .line 69
    return-void

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public E([BIILP2/k;LQ1/c;)V
    .locals 38

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p2

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/16 v3, 0x80

    .line 7
    .line 8
    add-int v5, v0, p3

    .line 9
    .line 10
    iget-object v6, v1, LVa/Y7;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v6, LQ1/o;

    .line 13
    .line 14
    move-object/from16 v7, p1

    .line 15
    .line 16
    invoke-virtual {v6, v5, v7}, LQ1/o;->E(I[B)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v6, v0}, LQ1/o;->G(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v6}, LQ1/o;->a()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v7, 0x2

    .line 28
    if-lez v0, :cond_8

    .line 29
    .line 30
    invoke-virtual {v6}, LQ1/o;->e()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/16 v8, 0x78

    .line 35
    .line 36
    if-ne v0, v8, :cond_8

    .line 37
    .line 38
    iget-object v0, v1, LVa/Y7;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ljava/util/zip/Inflater;

    .line 41
    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    new-instance v0, Ljava/util/zip/Inflater;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/zip/Inflater;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v0, v1, LVa/Y7;->d:Ljava/lang/Object;

    .line 50
    .line 51
    :cond_0
    iget-object v0, v1, LVa/Y7;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Ljava/util/zip/Inflater;

    .line 54
    .line 55
    sget v8, LQ1/x;->a:I

    .line 56
    .line 57
    invoke-virtual {v6}, LQ1/o;->a()I

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-gtz v8, :cond_1

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_1
    iget-object v8, v1, LVa/Y7;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v8, LQ1/o;

    .line 67
    .line 68
    iget-object v9, v8, LQ1/o;->a:[B

    .line 69
    .line 70
    array-length v9, v9

    .line 71
    invoke-virtual {v6}, LQ1/o;->a()I

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    if-ge v9, v10, :cond_2

    .line 76
    .line 77
    invoke-virtual {v6}, LQ1/o;->a()I

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    mul-int/2addr v9, v7

    .line 82
    invoke-virtual {v8, v9}, LQ1/o;->b(I)V

    .line 83
    .line 84
    .line 85
    :cond_2
    if-nez v0, :cond_3

    .line 86
    .line 87
    new-instance v0, Ljava/util/zip/Inflater;

    .line 88
    .line 89
    invoke-direct {v0}, Ljava/util/zip/Inflater;-><init>()V

    .line 90
    .line 91
    .line 92
    :cond_3
    move-object v9, v0

    .line 93
    iget-object v0, v6, LQ1/o;->a:[B

    .line 94
    .line 95
    iget v10, v6, LQ1/o;->b:I

    .line 96
    .line 97
    invoke-virtual {v6}, LQ1/o;->a()I

    .line 98
    .line 99
    .line 100
    move-result v11

    .line 101
    invoke-virtual {v9, v0, v10, v11}, Ljava/util/zip/Inflater;->setInput([BII)V

    .line 102
    .line 103
    .line 104
    move v0, v5

    .line 105
    :cond_4
    :goto_0
    :try_start_0
    iget-object v10, v8, LQ1/o;->a:[B

    .line 106
    .line 107
    array-length v11, v10

    .line 108
    sub-int/2addr v11, v0

    .line 109
    invoke-virtual {v9, v10, v0, v11}, Ljava/util/zip/Inflater;->inflate([BII)I

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    add-int/2addr v0, v10

    .line 114
    invoke-virtual {v9}, Ljava/util/zip/Inflater;->finished()Z

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    if-eqz v10, :cond_5

    .line 119
    .line 120
    invoke-virtual {v8, v0}, LQ1/o;->F(I)V
    :try_end_0
    .catch Ljava/util/zip/DataFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    .line 122
    .line 123
    invoke-virtual {v9}, Ljava/util/zip/Inflater;->reset()V

    .line 124
    .line 125
    .line 126
    iget-object v0, v8, LQ1/o;->a:[B

    .line 127
    .line 128
    iget v8, v8, LQ1/o;->c:I

    .line 129
    .line 130
    invoke-virtual {v6, v8, v0}, LQ1/o;->E(I[B)V

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :catchall_0
    move-exception v0

    .line 135
    goto :goto_2

    .line 136
    :cond_5
    :try_start_1
    invoke-virtual {v9}, Ljava/util/zip/Inflater;->needsDictionary()Z

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    if-nez v10, :cond_7

    .line 141
    .line 142
    invoke-virtual {v9}, Ljava/util/zip/Inflater;->needsInput()Z

    .line 143
    .line 144
    .line 145
    move-result v10

    .line 146
    if-eqz v10, :cond_6

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_6
    iget-object v10, v8, LQ1/o;->a:[B

    .line 150
    .line 151
    array-length v11, v10

    .line 152
    if-ne v0, v11, :cond_4

    .line 153
    .line 154
    array-length v10, v10

    .line 155
    mul-int/2addr v10, v7

    .line 156
    invoke-virtual {v8, v10}, LQ1/o;->b(I)V
    :try_end_1
    .catch Ljava/util/zip/DataFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :catch_0
    :cond_7
    :goto_1
    invoke-virtual {v9}, Ljava/util/zip/Inflater;->reset()V

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :goto_2
    invoke-virtual {v9}, Ljava/util/zip/Inflater;->reset()V

    .line 165
    .line 166
    .line 167
    throw v0

    .line 168
    :cond_8
    :goto_3
    iget-object v0, v1, LVa/Y7;->c:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v0, LS2/a;

    .line 171
    .line 172
    iput v5, v0, LS2/a;->c:I

    .line 173
    .line 174
    iput v5, v0, LS2/a;->d:I

    .line 175
    .line 176
    iput v5, v0, LS2/a;->e:I

    .line 177
    .line 178
    iput v5, v0, LS2/a;->f:I

    .line 179
    .line 180
    iput v5, v0, LS2/a;->g:I

    .line 181
    .line 182
    iput v5, v0, LS2/a;->h:I

    .line 183
    .line 184
    iget-object v8, v0, LS2/a;->i:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v8, LQ1/o;

    .line 187
    .line 188
    invoke-virtual {v8, v5}, LQ1/o;->D(I)V

    .line 189
    .line 190
    .line 191
    iput-boolean v5, v0, LS2/a;->b:Z

    .line 192
    .line 193
    new-instance v10, Ljava/util/ArrayList;

    .line 194
    .line 195
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 196
    .line 197
    .line 198
    :goto_4
    invoke-virtual {v6}, LQ1/o;->a()I

    .line 199
    .line 200
    .line 201
    move-result v9

    .line 202
    const/4 v11, 0x3

    .line 203
    if-lt v9, v11, :cond_1d

    .line 204
    .line 205
    iget v9, v6, LQ1/o;->c:I

    .line 206
    .line 207
    invoke-virtual {v6}, LQ1/o;->u()I

    .line 208
    .line 209
    .line 210
    move-result v12

    .line 211
    invoke-virtual {v6}, LQ1/o;->A()I

    .line 212
    .line 213
    .line 214
    move-result v13

    .line 215
    iget v14, v6, LQ1/o;->b:I

    .line 216
    .line 217
    add-int/2addr v14, v13

    .line 218
    const/4 v15, 0x0

    .line 219
    if-le v14, v9, :cond_9

    .line 220
    .line 221
    invoke-virtual {v6, v9}, LQ1/o;->G(I)V

    .line 222
    .line 223
    .line 224
    move v11, v3

    .line 225
    move v2, v5

    .line 226
    const/16 v19, 0x1

    .line 227
    .line 228
    goto/16 :goto_13

    .line 229
    .line 230
    :cond_9
    iget-object v9, v0, LS2/a;->a:[I

    .line 231
    .line 232
    if-eq v12, v3, :cond_13

    .line 233
    .line 234
    packed-switch v12, :pswitch_data_0

    .line 235
    .line 236
    .line 237
    :cond_a
    :goto_5
    move/from16 v16, v3

    .line 238
    .line 239
    move-object/from16 p3, v6

    .line 240
    .line 241
    move-object/from16 p2, v8

    .line 242
    .line 243
    goto/16 :goto_8

    .line 244
    .line 245
    :pswitch_0
    const/16 v9, 0x13

    .line 246
    .line 247
    if-ge v13, v9, :cond_b

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_b
    invoke-virtual {v6}, LQ1/o;->A()I

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    iput v9, v0, LS2/a;->c:I

    .line 255
    .line 256
    invoke-virtual {v6}, LQ1/o;->A()I

    .line 257
    .line 258
    .line 259
    move-result v9

    .line 260
    iput v9, v0, LS2/a;->d:I

    .line 261
    .line 262
    const/16 v9, 0xb

    .line 263
    .line 264
    invoke-virtual {v6, v9}, LQ1/o;->H(I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v6}, LQ1/o;->A()I

    .line 268
    .line 269
    .line 270
    move-result v9

    .line 271
    iput v9, v0, LS2/a;->e:I

    .line 272
    .line 273
    invoke-virtual {v6}, LQ1/o;->A()I

    .line 274
    .line 275
    .line 276
    move-result v9

    .line 277
    iput v9, v0, LS2/a;->f:I

    .line 278
    .line 279
    goto :goto_5

    .line 280
    :pswitch_1
    if-ge v13, v2, :cond_c

    .line 281
    .line 282
    goto :goto_5

    .line 283
    :cond_c
    invoke-virtual {v6, v11}, LQ1/o;->H(I)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v6}, LQ1/o;->u()I

    .line 287
    .line 288
    .line 289
    move-result v9

    .line 290
    and-int/2addr v9, v3

    .line 291
    if-eqz v9, :cond_d

    .line 292
    .line 293
    const/4 v9, 0x1

    .line 294
    goto :goto_6

    .line 295
    :cond_d
    move v9, v5

    .line 296
    :goto_6
    add-int/lit8 v11, v13, -0x4

    .line 297
    .line 298
    if-eqz v9, :cond_10

    .line 299
    .line 300
    const/4 v9, 0x7

    .line 301
    if-ge v11, v9, :cond_e

    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_e
    invoke-virtual {v6}, LQ1/o;->x()I

    .line 305
    .line 306
    .line 307
    move-result v9

    .line 308
    if-ge v9, v2, :cond_f

    .line 309
    .line 310
    goto :goto_5

    .line 311
    :cond_f
    invoke-virtual {v6}, LQ1/o;->A()I

    .line 312
    .line 313
    .line 314
    move-result v11

    .line 315
    iput v11, v0, LS2/a;->g:I

    .line 316
    .line 317
    invoke-virtual {v6}, LQ1/o;->A()I

    .line 318
    .line 319
    .line 320
    move-result v11

    .line 321
    iput v11, v0, LS2/a;->h:I

    .line 322
    .line 323
    sub-int/2addr v9, v2

    .line 324
    invoke-virtual {v8, v9}, LQ1/o;->D(I)V

    .line 325
    .line 326
    .line 327
    add-int/lit8 v11, v13, -0xb

    .line 328
    .line 329
    :cond_10
    iget v9, v8, LQ1/o;->b:I

    .line 330
    .line 331
    iget v12, v8, LQ1/o;->c:I

    .line 332
    .line 333
    if-ge v9, v12, :cond_a

    .line 334
    .line 335
    if-lez v11, :cond_a

    .line 336
    .line 337
    sub-int/2addr v12, v9

    .line 338
    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    .line 339
    .line 340
    .line 341
    move-result v11

    .line 342
    iget-object v12, v8, LQ1/o;->a:[B

    .line 343
    .line 344
    invoke-virtual {v6, v9, v11, v12}, LQ1/o;->f(II[B)V

    .line 345
    .line 346
    .line 347
    add-int/2addr v9, v11

    .line 348
    invoke-virtual {v8, v9}, LQ1/o;->G(I)V

    .line 349
    .line 350
    .line 351
    goto :goto_5

    .line 352
    :pswitch_2
    rem-int/lit8 v11, v13, 0x5

    .line 353
    .line 354
    if-eq v11, v7, :cond_11

    .line 355
    .line 356
    goto :goto_5

    .line 357
    :cond_11
    invoke-virtual {v6, v7}, LQ1/o;->H(I)V

    .line 358
    .line 359
    .line 360
    invoke-static {v9, v5}, Ljava/util/Arrays;->fill([II)V

    .line 361
    .line 362
    .line 363
    div-int/lit8 v13, v13, 0x5

    .line 364
    .line 365
    move v11, v5

    .line 366
    :goto_7
    if-ge v11, v13, :cond_12

    .line 367
    .line 368
    invoke-virtual {v6}, LQ1/o;->u()I

    .line 369
    .line 370
    .line 371
    move-result v12

    .line 372
    invoke-virtual {v6}, LQ1/o;->u()I

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    invoke-virtual {v6}, LQ1/o;->u()I

    .line 377
    .line 378
    .line 379
    move-result v16

    .line 380
    invoke-virtual {v6}, LQ1/o;->u()I

    .line 381
    .line 382
    .line 383
    move-result v17

    .line 384
    invoke-virtual {v6}, LQ1/o;->u()I

    .line 385
    .line 386
    .line 387
    move-result v18

    .line 388
    move-object/from16 p2, v8

    .line 389
    .line 390
    int-to-double v7, v2

    .line 391
    add-int/lit8 v2, v16, -0x80

    .line 392
    .line 393
    move/from16 v16, v3

    .line 394
    .line 395
    const/16 v19, 0x1

    .line 396
    .line 397
    int-to-double v3, v2

    .line 398
    const-wide v20, 0x3ff66e978d4fdf3bL    # 1.402

    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    mul-double v20, v20, v3

    .line 404
    .line 405
    move-object/from16 p3, v6

    .line 406
    .line 407
    add-double v5, v20, v7

    .line 408
    .line 409
    double-to-int v5, v5

    .line 410
    add-int/lit8 v6, v17, -0x80

    .line 411
    .line 412
    move-wide/from16 v20, v3

    .line 413
    .line 414
    int-to-double v2, v6

    .line 415
    const-wide v22, 0x3fd60663c74fb54aL    # 0.34414

    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    mul-double v22, v22, v2

    .line 421
    .line 422
    sub-double v22, v7, v22

    .line 423
    .line 424
    const-wide v24, 0x3fe6da3c21187e7cL    # 0.71414

    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    mul-double v20, v20, v24

    .line 430
    .line 431
    move v6, v5

    .line 432
    sub-double v4, v22, v20

    .line 433
    .line 434
    double-to-int v4, v4

    .line 435
    const-wide v20, 0x3ffc5a1cac083127L    # 1.772

    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    mul-double v2, v2, v20

    .line 441
    .line 442
    add-double/2addr v2, v7

    .line 443
    double-to-int v2, v2

    .line 444
    shl-int/lit8 v3, v18, 0x18

    .line 445
    .line 446
    const/16 v5, 0xff

    .line 447
    .line 448
    move v7, v6

    .line 449
    const/4 v6, 0x0

    .line 450
    invoke-static {v7, v6, v5}, LQ1/x;->i(III)I

    .line 451
    .line 452
    .line 453
    move-result v7

    .line 454
    shl-int/lit8 v7, v7, 0x10

    .line 455
    .line 456
    or-int/2addr v3, v7

    .line 457
    invoke-static {v4, v6, v5}, LQ1/x;->i(III)I

    .line 458
    .line 459
    .line 460
    move-result v4

    .line 461
    shl-int/lit8 v4, v4, 0x8

    .line 462
    .line 463
    or-int/2addr v3, v4

    .line 464
    invoke-static {v2, v6, v5}, LQ1/x;->i(III)I

    .line 465
    .line 466
    .line 467
    move-result v4

    .line 468
    or-int/2addr v3, v4

    .line 469
    aput v3, v9, v12

    .line 470
    .line 471
    add-int/lit8 v11, v11, 0x1

    .line 472
    .line 473
    move-object/from16 v8, p2

    .line 474
    .line 475
    move-object/from16 v6, p3

    .line 476
    .line 477
    move/from16 v3, v16

    .line 478
    .line 479
    const/4 v2, 0x4

    .line 480
    const/4 v5, 0x0

    .line 481
    const/4 v7, 0x2

    .line 482
    goto :goto_7

    .line 483
    :cond_12
    move/from16 v16, v3

    .line 484
    .line 485
    move-object/from16 p3, v6

    .line 486
    .line 487
    move-object/from16 p2, v8

    .line 488
    .line 489
    const/4 v3, 0x1

    .line 490
    iput-boolean v3, v0, LS2/a;->b:Z

    .line 491
    .line 492
    :goto_8
    move-object/from16 v8, p2

    .line 493
    .line 494
    move/from16 v11, v16

    .line 495
    .line 496
    const/4 v2, 0x0

    .line 497
    const/16 v19, 0x1

    .line 498
    .line 499
    :goto_9
    move-object/from16 v6, p3

    .line 500
    .line 501
    goto/16 :goto_12

    .line 502
    .line 503
    :cond_13
    move/from16 v16, v3

    .line 504
    .line 505
    move-object/from16 p3, v6

    .line 506
    .line 507
    move-object/from16 p2, v8

    .line 508
    .line 509
    iget v3, v0, LS2/a;->c:I

    .line 510
    .line 511
    if-eqz v3, :cond_1b

    .line 512
    .line 513
    iget v3, v0, LS2/a;->d:I

    .line 514
    .line 515
    if-eqz v3, :cond_1b

    .line 516
    .line 517
    iget v3, v0, LS2/a;->g:I

    .line 518
    .line 519
    if-eqz v3, :cond_1b

    .line 520
    .line 521
    iget v3, v0, LS2/a;->h:I

    .line 522
    .line 523
    if-eqz v3, :cond_1b

    .line 524
    .line 525
    move-object/from16 v8, p2

    .line 526
    .line 527
    iget v3, v8, LQ1/o;->c:I

    .line 528
    .line 529
    if-eqz v3, :cond_14

    .line 530
    .line 531
    iget v4, v8, LQ1/o;->b:I

    .line 532
    .line 533
    if-ne v4, v3, :cond_14

    .line 534
    .line 535
    iget-boolean v3, v0, LS2/a;->b:Z

    .line 536
    .line 537
    if-nez v3, :cond_15

    .line 538
    .line 539
    :cond_14
    :goto_a
    move/from16 v11, v16

    .line 540
    .line 541
    const/16 v19, 0x1

    .line 542
    .line 543
    goto/16 :goto_10

    .line 544
    .line 545
    :cond_15
    const/4 v2, 0x0

    .line 546
    invoke-virtual {v8, v2}, LQ1/o;->G(I)V

    .line 547
    .line 548
    .line 549
    iget v3, v0, LS2/a;->g:I

    .line 550
    .line 551
    iget v4, v0, LS2/a;->h:I

    .line 552
    .line 553
    mul-int/2addr v3, v4

    .line 554
    new-array v4, v3, [I

    .line 555
    .line 556
    const/4 v5, 0x0

    .line 557
    :goto_b
    if-ge v5, v3, :cond_1a

    .line 558
    .line 559
    invoke-virtual {v8}, LQ1/o;->u()I

    .line 560
    .line 561
    .line 562
    move-result v6

    .line 563
    if-eqz v6, :cond_17

    .line 564
    .line 565
    const/16 v19, 0x1

    .line 566
    .line 567
    add-int/lit8 v7, v5, 0x1

    .line 568
    .line 569
    aget v6, v9, v6

    .line 570
    .line 571
    aput v6, v4, v5

    .line 572
    .line 573
    move v5, v7

    .line 574
    :cond_16
    move/from16 v11, v16

    .line 575
    .line 576
    goto :goto_f

    .line 577
    :cond_17
    const/16 v19, 0x1

    .line 578
    .line 579
    invoke-virtual {v8}, LQ1/o;->u()I

    .line 580
    .line 581
    .line 582
    move-result v6

    .line 583
    if-eqz v6, :cond_16

    .line 584
    .line 585
    and-int/lit8 v7, v6, 0x40

    .line 586
    .line 587
    if-nez v7, :cond_18

    .line 588
    .line 589
    and-int/lit8 v7, v6, 0x3f

    .line 590
    .line 591
    :goto_c
    move/from16 v11, v16

    .line 592
    .line 593
    goto :goto_d

    .line 594
    :cond_18
    and-int/lit8 v7, v6, 0x3f

    .line 595
    .line 596
    shl-int/lit8 v7, v7, 0x8

    .line 597
    .line 598
    invoke-virtual {v8}, LQ1/o;->u()I

    .line 599
    .line 600
    .line 601
    move-result v11

    .line 602
    or-int/2addr v7, v11

    .line 603
    goto :goto_c

    .line 604
    :goto_d
    and-int/2addr v6, v11

    .line 605
    if-nez v6, :cond_19

    .line 606
    .line 607
    const/4 v2, 0x0

    .line 608
    aget v6, v9, v2

    .line 609
    .line 610
    goto :goto_e

    .line 611
    :cond_19
    invoke-virtual {v8}, LQ1/o;->u()I

    .line 612
    .line 613
    .line 614
    move-result v6

    .line 615
    aget v6, v9, v6

    .line 616
    .line 617
    :goto_e
    add-int/2addr v7, v5

    .line 618
    invoke-static {v4, v5, v7, v6}, Ljava/util/Arrays;->fill([IIII)V

    .line 619
    .line 620
    .line 621
    move v5, v7

    .line 622
    :goto_f
    move/from16 v16, v11

    .line 623
    .line 624
    goto :goto_b

    .line 625
    :cond_1a
    move/from16 v11, v16

    .line 626
    .line 627
    const/16 v19, 0x1

    .line 628
    .line 629
    iget v3, v0, LS2/a;->g:I

    .line 630
    .line 631
    iget v5, v0, LS2/a;->h:I

    .line 632
    .line 633
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 634
    .line 635
    invoke-static {v4, v3, v5, v6}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 636
    .line 637
    .line 638
    move-result-object v24

    .line 639
    iget v3, v0, LS2/a;->e:I

    .line 640
    .line 641
    int-to-float v3, v3

    .line 642
    iget v4, v0, LS2/a;->c:I

    .line 643
    .line 644
    int-to-float v4, v4

    .line 645
    div-float v28, v3, v4

    .line 646
    .line 647
    iget v3, v0, LS2/a;->f:I

    .line 648
    .line 649
    int-to-float v3, v3

    .line 650
    iget v5, v0, LS2/a;->d:I

    .line 651
    .line 652
    int-to-float v5, v5

    .line 653
    div-float v25, v3, v5

    .line 654
    .line 655
    iget v3, v0, LS2/a;->g:I

    .line 656
    .line 657
    int-to-float v3, v3

    .line 658
    div-float v32, v3, v4

    .line 659
    .line 660
    iget v3, v0, LS2/a;->h:I

    .line 661
    .line 662
    int-to-float v3, v3

    .line 663
    div-float v33, v3, v5

    .line 664
    .line 665
    new-instance v20, LP1/b;

    .line 666
    .line 667
    const/high16 v35, -0x1000000

    .line 668
    .line 669
    const/16 v37, 0x0

    .line 670
    .line 671
    const/16 v21, 0x0

    .line 672
    .line 673
    const/16 v26, 0x0

    .line 674
    .line 675
    const/16 v27, 0x0

    .line 676
    .line 677
    const/16 v29, 0x0

    .line 678
    .line 679
    const/high16 v30, -0x80000000

    .line 680
    .line 681
    const v31, -0x800001

    .line 682
    .line 683
    .line 684
    const/16 v34, 0x0

    .line 685
    .line 686
    move-object/from16 v22, v21

    .line 687
    .line 688
    move-object/from16 v23, v21

    .line 689
    .line 690
    move/from16 v36, v30

    .line 691
    .line 692
    invoke-direct/range {v20 .. v37}, LP1/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 693
    .line 694
    .line 695
    move-object/from16 v15, v20

    .line 696
    .line 697
    :goto_10
    const/4 v2, 0x0

    .line 698
    goto :goto_11

    .line 699
    :cond_1b
    move-object/from16 v8, p2

    .line 700
    .line 701
    goto/16 :goto_a

    .line 702
    .line 703
    :goto_11
    iput v2, v0, LS2/a;->c:I

    .line 704
    .line 705
    iput v2, v0, LS2/a;->d:I

    .line 706
    .line 707
    iput v2, v0, LS2/a;->e:I

    .line 708
    .line 709
    iput v2, v0, LS2/a;->f:I

    .line 710
    .line 711
    iput v2, v0, LS2/a;->g:I

    .line 712
    .line 713
    iput v2, v0, LS2/a;->h:I

    .line 714
    .line 715
    invoke-virtual {v8, v2}, LQ1/o;->D(I)V

    .line 716
    .line 717
    .line 718
    iput-boolean v2, v0, LS2/a;->b:Z

    .line 719
    .line 720
    goto/16 :goto_9

    .line 721
    .line 722
    :goto_12
    invoke-virtual {v6, v14}, LQ1/o;->G(I)V

    .line 723
    .line 724
    .line 725
    :goto_13
    if-eqz v15, :cond_1c

    .line 726
    .line 727
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 728
    .line 729
    .line 730
    :cond_1c
    move v5, v2

    .line 731
    move v3, v11

    .line 732
    const/4 v2, 0x4

    .line 733
    const/4 v7, 0x2

    .line 734
    goto/16 :goto_4

    .line 735
    .line 736
    :cond_1d
    new-instance v9, LP2/a;

    .line 737
    .line 738
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    invoke-direct/range {v9 .. v14}, LP2/a;-><init>(Ljava/util/List;JJ)V

    .line 749
    .line 750
    .line 751
    move-object/from16 v0, p5

    .line 752
    .line 753
    invoke-interface {v0, v9}, LQ1/c;->accept(Ljava/lang/Object;)V

    .line 754
    .line 755
    .line 756
    return-void

    .line 757
    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic H(II[B)LP2/d;
    .locals 0

    .line 1
    invoke-static {p0, p3, p2}, LN0/a;->a(LP2/l;[BI)LP2/b;

    move-result-object p1

    return-object p1
.end method

.method public P()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
.end method

.method public declared-synchronized a(LE4/t;LE4/u;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, LE4/c;

    .line 3
    .line 4
    iget-object v1, p0, LVa/Y7;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ljava/lang/ref/ReferenceQueue;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2, v1}, LE4/c;-><init>(LE4/t;LE4/u;Ljava/lang/ref/ReferenceQueue;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, LVa/Y7;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p2, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, LE4/c;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const/4 p2, 0x0

    .line 24
    iput-object p2, p1, LE4/c;->c:LE4/B;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    :cond_0
    monitor-exit p0

    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw p1
.end method

.method public b()V
    .locals 4

    .line 1
    iget-object v0, p0, LVa/Y7;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/16 v1, 0xe

    .line 8
    .line 9
    iget-object v2, p0, LVa/Y7;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {v2, v0, v3, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/G;->g(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/L0;Ljava/util/List;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/E;I)V

    .line 15
    .line 16
    .line 17
    iput-object v3, p0, LVa/Y7;->d:Ljava/lang/Object;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public declared-synchronized c()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LVa/Y7;->a:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, LVa/Y7;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Laa/n;

    .line 15
    .line 16
    const-wide/16 v1, 0x0

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Laa/n;->e(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    :cond_0
    monitor-exit p0

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw v0
.end method

.method public d(LE4/c;)V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LVa/Y7;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/HashMap;

    .line 5
    .line 6
    iget-object v1, p1, LE4/c;->a:LE4/t;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p1, LE4/c;->b:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v2, p1, LE4/c;->c:LE4/B;

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    new-instance v1, LE4/u;

    .line 22
    .line 23
    iget-object v5, p1, LE4/c;->a:LE4/t;

    .line 24
    .line 25
    iget-object v0, p0, LVa/Y7;->d:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v6, v0

    .line 28
    check-cast v6, LE4/o;

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-direct/range {v1 .. v6}, LE4/u;-><init>(LE4/B;ZZLE4/t;LE4/o;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, LVa/Y7;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, LE4/o;

    .line 38
    .line 39
    iget-object p1, p1, LE4/c;->a:LE4/t;

    .line 40
    .line 41
    invoke-virtual {v0, p1, v1}, LE4/o;->f(LE4/t;LE4/u;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    move-object p1, v0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit p0

    .line 49
    return-void

    .line 50
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    throw p1
.end method

.method public e(LVa/na;)Z
    .locals 4

    .line 1
    iget-object v0, p0, LVa/Y7;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LVa/A7;

    .line 4
    .line 5
    iget-object v0, v0, LVa/A7;->b:LVa/ha;

    .line 6
    .line 7
    iget-object v1, p0, LVa/Y7;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, LVa/y7;

    .line 10
    .line 11
    iget-object v2, p0, LVa/Y7;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ljava/util/List;

    .line 14
    .line 15
    iget-object v3, p0, LVa/Y7;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, LVa/x8;

    .line 18
    .line 19
    invoke-virtual {v0, p1, v3, v1, v2}, LVa/ha;->c(LVa/na;LVa/x8;LVa/y7;Ljava/util/List;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1
.end method

.method public f()Z
    .locals 9

    .line 1
    iget-object v0, p0, LVa/Y7;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v3, v1, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, Lz0/g;

    .line 18
    .line 19
    iget-object v4, v4, Lz0/g;->a:LH0/c;

    .line 20
    .line 21
    iget-object v4, v4, LH0/c;->j:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    move v6, v2

    .line 28
    :goto_1
    if-ge v6, v5, :cond_1

    .line 29
    .line 30
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    check-cast v7, LH0/e;

    .line 35
    .line 36
    iget-object v8, v7, LH0/e;->a:LE0/q;

    .line 37
    .line 38
    iget-object v8, v8, LE0/q;->a:Ljava/lang/Object;

    .line 39
    .line 40
    iget-object v7, v7, LH0/e;->b:Ljava/lang/Object;

    .line 41
    .line 42
    if-eq v8, v7, :cond_0

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    return v0

    .line 46
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    return v2
.end method

.method public g()Z
    .locals 2

    .line 1
    iget-object v0, p0, LVa/Y7;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    const-string v1, "connectivity"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method public h(Lmd/k0;)V
    .locals 2

    .line 1
    iget-object v0, p0, LVa/Y7;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LVa/Y7;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lmd/k0;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iput-object p1, p0, LVa/Y7;->c:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v1, p0, LVa/Y7;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/util/HashSet;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, LVa/Y7;->d:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lod/M0;

    .line 30
    .line 31
    iget-object v0, v0, Lod/M0;->E:Lod/H;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lod/H;->d(Lmd/k0;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void

    .line 37
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    throw p1
.end method

.method public i(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, LVa/Y7;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, LVa/Y7;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lw9/g;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    sget-object v3, Lv9/f;->b:Lv9/f;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_2

    .line 33
    :cond_0
    sget-object v3, Lv9/f;->a:Lv9/f;

    .line 34
    .line 35
    :goto_1
    invoke-interface {v2, v3}, Lw9/g;->accept(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    monitor-exit v0

    .line 40
    return-void

    .line 41
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw p1
.end method

.method public j()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    const-string v2, "AndroidConnectivityMonitor"

    .line 6
    .line 7
    const-string v3, "App has entered the foreground."

    .line 8
    .line 9
    invoke-static {v2, v3, v1, v0}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, LVa/Y7;->g()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v1}, LVa/Y7;->i(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    .line 1
    iget-object v0, p0, LVa/Y7;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LK8/b;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, LVa/Y7;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lcom/google/android/play/core/integrity/IntegrityTokenResponse;

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/google/android/play/core/integrity/IntegrityTokenResponse;->token()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lcom/google/android/play/core/integrity/IntegrityTokenResponse;

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/google/android/play/core/integrity/IntegrityTokenResponse;->token()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance v0, LK8/K;

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-direct {v0, v2, p1, v2}, LK8/K;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-nez v0, :cond_1

    .line 65
    .line 66
    const-string p1, ""

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    :goto_0
    const-string v0, "Play Integrity Token fetch failed, falling back to Recaptcha"

    .line 78
    .line 79
    const-string v2, "b"

    .line 80
    .line 81
    invoke-static {v0, p1, v2}, Lcb/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, LVa/Y7;->c:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p1, Lcom/google/firebase/auth/FirebaseAuth;

    .line 87
    .line 88
    iget-object v0, p0, LVa/Y7;->d:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Landroid/app/Activity;

    .line 91
    .line 92
    invoke-static {p1, v0, v1}, LK8/b;->b(Lcom/google/firebase/auth/FirebaseAuth;Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public synthetic reset()V
    .locals 0

    .line 1
    return-void
.end method
