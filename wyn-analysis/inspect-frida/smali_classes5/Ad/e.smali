.class public final LAd/e;
.super Lzd/e;
.source "SourceFile"


# instance fields
.field public final d:LAd/h;

.field public final e:Ljava/util/Set;


# direct methods
.method public constructor <init>(LAd/h;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lzd/e;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LAd/e;->d:LAd/h;

    .line 5
    .line 6
    const/4 p1, 0x2

    .line 7
    new-array p1, p1, [Lzd/f;

    .line 8
    .line 9
    sget-object v0, LCd/m0;->a:LCd/m0;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    aput-object v0, p1, v1

    .line 13
    .line 14
    sget-object v0, LEd/a;->a:LEd/a;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    aput-object v0, p1, v1

    .line 18
    .line 19
    invoke-static {p1}, Lff/m;->P0([Ljava/lang/Object;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, LAd/e;->e:Ljava/util/Set;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(LFd/d;Llf/c;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    instance-of v4, v1, LAd/c;

    .line 7
    .line 8
    if-eqz v4, :cond_0

    .line 9
    .line 10
    move-object v4, v1

    .line 11
    check-cast v4, LAd/c;

    .line 12
    .line 13
    iget v5, v4, LAd/c;->h:I

    .line 14
    .line 15
    const/high16 v6, -0x80000000

    .line 16
    .line 17
    and-int v7, v5, v6

    .line 18
    .line 19
    if-eqz v7, :cond_0

    .line 20
    .line 21
    sub-int/2addr v5, v6

    .line 22
    iput v5, v4, LAd/c;->h:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v4, LAd/c;

    .line 26
    .line 27
    invoke-direct {v4, v0, v1}, LAd/c;-><init>(LAd/e;Llf/c;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object v1, v4, LAd/c;->f:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v5, Lkf/a;->a:Lkf/a;

    .line 33
    .line 34
    iget v6, v4, LAd/c;->h:I

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v8, 0x3

    .line 38
    const/4 v9, 0x2

    .line 39
    if-eqz v6, :cond_4

    .line 40
    .line 41
    if-eq v6, v3, :cond_3

    .line 42
    .line 43
    if-eq v6, v9, :cond_2

    .line 44
    .line 45
    if-ne v6, v8, :cond_1

    .line 46
    .line 47
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v1

    .line 59
    :cond_2
    iget-object v2, v4, LAd/c;->e:Ljava/net/HttpURLConnection;

    .line 60
    .line 61
    iget-object v3, v4, LAd/c;->d:LMd/c;

    .line 62
    .line 63
    iget-object v6, v4, LAd/c;->c:LQd/d;

    .line 64
    .line 65
    iget-object v9, v4, LAd/c;->b:Ljf/h;

    .line 66
    .line 67
    iget-object v10, v4, LAd/c;->a:LFd/d;

    .line 68
    .line 69
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    move-object v15, v3

    .line 73
    move-object v3, v5

    .line 74
    goto/16 :goto_a

    .line 75
    .line 76
    :cond_3
    iget-object v6, v4, LAd/c;->a:LFd/d;

    .line 77
    .line 78
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    move-object/from16 v24, v6

    .line 82
    .line 83
    move-object v6, v1

    .line 84
    move-object/from16 v1, v24

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    move-object/from16 v1, p1

    .line 91
    .line 92
    iput-object v1, v4, LAd/c;->a:LFd/d;

    .line 93
    .line 94
    iput v3, v4, LAd/c;->h:I

    .line 95
    .line 96
    sget-object v6, Lzd/j;->a:Ljava/util/Set;

    .line 97
    .line 98
    invoke-interface {v4}, Ljf/c;->getContext()Ljf/h;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    sget-object v10, Lzd/i;->b:Lab/b;

    .line 103
    .line 104
    invoke-interface {v6, v10}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-static {v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    check-cast v6, Lzd/i;

    .line 112
    .line 113
    iget-object v6, v6, Lzd/i;->a:Ljf/h;

    .line 114
    .line 115
    if-ne v6, v5, :cond_5

    .line 116
    .line 117
    move-object v3, v5

    .line 118
    goto/16 :goto_c

    .line 119
    .line 120
    :cond_5
    :goto_1
    check-cast v6, Ljf/h;

    .line 121
    .line 122
    invoke-static {v7}, LQd/a;->a(Ljava/lang/Long;)LQd/d;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    iget-object v11, v1, LFd/d;->a:LJd/H;

    .line 127
    .line 128
    iget-object v11, v11, LJd/H;->f:Ljava/lang/String;

    .line 129
    .line 130
    sget-object v12, LJd/p;->a:Ljava/util/List;

    .line 131
    .line 132
    iget-object v12, v1, LFd/d;->c:LJd/o;

    .line 133
    .line 134
    const-string v13, "Content-Length"

    .line 135
    .line 136
    invoke-virtual {v12, v13}, LNd/l;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v14

    .line 140
    iget-object v15, v1, LFd/d;->d:LMd/c;

    .line 141
    .line 142
    if-eqz v14, :cond_6

    .line 143
    .line 144
    invoke-static {v14}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 145
    .line 146
    .line 147
    move-result-wide v7

    .line 148
    new-instance v14, Ljava/lang/Long;

    .line 149
    .line 150
    invoke-direct {v14, v7, v8}, Ljava/lang/Long;-><init>(J)V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_6
    invoke-virtual {v15}, LMd/c;->a()Ljava/lang/Long;

    .line 155
    .line 156
    .line 157
    move-result-object v14

    .line 158
    :goto_2
    new-instance v7, Ljava/net/URL;

    .line 159
    .line 160
    invoke-direct {v7, v11}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    iget-object v8, v0, LAd/e;->d:LAd/h;

    .line 164
    .line 165
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v7}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    const-string v11, "openConnection(...)"

    .line 173
    .line 174
    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    check-cast v7, Ljava/net/HttpURLConnection;

    .line 178
    .line 179
    const v11, 0x186a0

    .line 180
    .line 181
    .line 182
    invoke-virtual {v7, v11}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v7, v11}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 186
    .line 187
    .line 188
    sget-object v11, LCd/m0;->a:LCd/m0;

    .line 189
    .line 190
    sget-object v9, Lzd/g;->a:LNd/a;

    .line 191
    .line 192
    move/from16 v16, v3

    .line 193
    .line 194
    iget-object v3, v1, LFd/d;->f:LNd/d;

    .line 195
    .line 196
    invoke-virtual {v3, v9}, LNd/d;->d(LNd/a;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    check-cast v3, Ljava/util/Map;

    .line 201
    .line 202
    if-eqz v3, :cond_7

    .line 203
    .line 204
    invoke-interface {v3, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    goto :goto_3

    .line 209
    :cond_7
    const/4 v3, 0x0

    .line 210
    :goto_3
    check-cast v3, LCd/n0;

    .line 211
    .line 212
    if-eqz v3, :cond_b

    .line 213
    .line 214
    iget-object v9, v3, LCd/n0;->b:Ljava/lang/Long;

    .line 215
    .line 216
    if-eqz v9, :cond_8

    .line 217
    .line 218
    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    .line 219
    .line 220
    .line 221
    move-result-wide v17

    .line 222
    invoke-static/range {v17 .. v18}, LCd/q0;->a(J)I

    .line 223
    .line 224
    .line 225
    move-result v9

    .line 226
    invoke-virtual {v7, v9}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 227
    .line 228
    .line 229
    :cond_8
    iget-object v9, v3, LCd/n0;->c:Ljava/lang/Long;

    .line 230
    .line 231
    if-eqz v9, :cond_9

    .line 232
    .line 233
    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    .line 234
    .line 235
    .line 236
    move-result-wide v17

    .line 237
    invoke-static/range {v17 .. v18}, LCd/q0;->a(J)I

    .line 238
    .line 239
    .line 240
    move-result v9

    .line 241
    invoke-virtual {v7, v9}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 242
    .line 243
    .line 244
    :cond_9
    iget-object v3, v3, LCd/n0;->a:Ljava/lang/Long;

    .line 245
    .line 246
    if-eqz v3, :cond_b

    .line 247
    .line 248
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 249
    .line 250
    .line 251
    move-result-wide v17

    .line 252
    const-wide v19, 0x7fffffffffffffffL

    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    cmp-long v3, v17, v19

    .line 258
    .line 259
    if-eqz v3, :cond_b

    .line 260
    .line 261
    invoke-virtual {v7}, Ljava/net/URLConnection;->getConnectTimeout()I

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-eqz v3, :cond_a

    .line 266
    .line 267
    invoke-virtual {v7}, Ljava/net/URLConnection;->getConnectTimeout()I

    .line 268
    .line 269
    .line 270
    move-result v3

    .line 271
    int-to-long v2, v3

    .line 272
    cmp-long v2, v2, v17

    .line 273
    .line 274
    if-lez v2, :cond_b

    .line 275
    .line 276
    :cond_a
    invoke-static/range {v17 .. v18}, LCd/q0;->a(J)I

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    invoke-virtual {v7, v2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 281
    .line 282
    .line 283
    :cond_b
    instance-of v2, v7, Ljavax/net/ssl/HttpsURLConnection;

    .line 284
    .line 285
    if-eqz v2, :cond_c

    .line 286
    .line 287
    iget-object v2, v8, LAd/h;->a:LAd/g;

    .line 288
    .line 289
    invoke-virtual {v2, v7}, LAd/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    :cond_c
    iget-object v2, v1, LFd/d;->b:LJd/s;

    .line 293
    .line 294
    iget-object v3, v2, LJd/s;->a:Ljava/lang/String;

    .line 295
    .line 296
    invoke-virtual {v7, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    const/4 v9, 0x0

    .line 300
    invoke-virtual {v7, v9}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v7, v9}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 304
    .line 305
    .line 306
    sget-object v3, LJd/t;->a:Ljava/util/Set;

    .line 307
    .line 308
    sget-object v3, LJd/t;->a:Ljava/util/Set;

    .line 309
    .line 310
    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v11

    .line 314
    if-eqz v11, :cond_d

    .line 315
    .line 316
    instance-of v11, v15, LHd/b;

    .line 317
    .line 318
    if-eqz v11, :cond_d

    .line 319
    .line 320
    move/from16 v11, v16

    .line 321
    .line 322
    goto :goto_4

    .line 323
    :cond_d
    const/4 v11, 0x0

    .line 324
    :goto_4
    new-instance v9, LAd/d;

    .line 325
    .line 326
    const/4 v0, 0x0

    .line 327
    invoke-direct {v9, v0, v7, v11}, LAd/d;-><init>(ILjava/lang/Object;Z)V

    .line 328
    .line 329
    .line 330
    sget-object v11, Lzd/j;->a:Ljava/util/Set;

    .line 331
    .line 332
    new-instance v11, LJd/n;

    .line 333
    .line 334
    const/16 v0, 0x8

    .line 335
    .line 336
    invoke-direct {v11, v0}, LA7/B0;-><init>(I)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v11, v12}, LA7/B0;->A(LNd/j;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v15}, LMd/c;->c()LJd/m;

    .line 343
    .line 344
    .line 345
    sget-object v0, LJd/g;->c:LJd/g;

    .line 346
    .line 347
    invoke-virtual {v11, v0}, LA7/B0;->A(LNd/j;)V

    .line 348
    .line 349
    .line 350
    iget-object v0, v11, LA7/B0;->a:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v0, Ljava/util/Map;

    .line 353
    .line 354
    const-string v11, "values"

    .line 355
    .line 356
    invoke-static {v0, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    new-instance v11, LNd/b;

    .line 360
    .line 361
    invoke-direct {v11}, LNd/b;-><init>()V

    .line 362
    .line 363
    .line 364
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 373
    .line 374
    .line 375
    move-result v17

    .line 376
    if-eqz v17, :cond_f

    .line 377
    .line 378
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v17

    .line 382
    check-cast v17, Ljava/util/Map$Entry;

    .line 383
    .line 384
    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v18

    .line 388
    move-object/from16 v19, v0

    .line 389
    .line 390
    move-object/from16 v0, v18

    .line 391
    .line 392
    check-cast v0, Ljava/lang/String;

    .line 393
    .line 394
    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v17

    .line 398
    move-object/from16 v18, v14

    .line 399
    .line 400
    move-object/from16 v14, v17

    .line 401
    .line 402
    check-cast v14, Ljava/util/List;

    .line 403
    .line 404
    move-object/from16 v17, v5

    .line 405
    .line 406
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 407
    .line 408
    .line 409
    move-result v5

    .line 410
    move-object/from16 v20, v10

    .line 411
    .line 412
    new-instance v10, Ljava/util/ArrayList;

    .line 413
    .line 414
    invoke-direct {v10, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 415
    .line 416
    .line 417
    move-object/from16 v21, v6

    .line 418
    .line 419
    const/4 v6, 0x0

    .line 420
    :goto_6
    if-ge v6, v5, :cond_e

    .line 421
    .line 422
    invoke-interface {v14, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v22

    .line 426
    move/from16 v23, v5

    .line 427
    .line 428
    move-object/from16 v5, v22

    .line 429
    .line 430
    check-cast v5, Ljava/lang/String;

    .line 431
    .line 432
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    add-int/lit8 v6, v6, 0x1

    .line 436
    .line 437
    move/from16 v5, v23

    .line 438
    .line 439
    goto :goto_6

    .line 440
    :cond_e
    invoke-interface {v11, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-object/from16 v5, v17

    .line 444
    .line 445
    move-object/from16 v14, v18

    .line 446
    .line 447
    move-object/from16 v0, v19

    .line 448
    .line 449
    move-object/from16 v10, v20

    .line 450
    .line 451
    move-object/from16 v6, v21

    .line 452
    .line 453
    goto :goto_5

    .line 454
    :cond_f
    move-object/from16 v17, v5

    .line 455
    .line 456
    move-object/from16 v21, v6

    .line 457
    .line 458
    move-object/from16 v20, v10

    .line 459
    .line 460
    move-object/from16 v18, v14

    .line 461
    .line 462
    new-instance v0, LBf/s;

    .line 463
    .line 464
    const/16 v5, 0xc

    .line 465
    .line 466
    invoke-direct {v0, v9, v5}, LBf/s;-><init>(Ljava/lang/Object;I)V

    .line 467
    .line 468
    .line 469
    invoke-interface {v11}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 470
    .line 471
    .line 472
    move-result-object v5

    .line 473
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 474
    .line 475
    .line 476
    move-result-object v5

    .line 477
    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 478
    .line 479
    .line 480
    move-result v6

    .line 481
    if-eqz v6, :cond_10

    .line 482
    .line 483
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v6

    .line 487
    check-cast v6, Ljava/util/Map$Entry;

    .line 488
    .line 489
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v10

    .line 493
    check-cast v10, Ljava/lang/String;

    .line 494
    .line 495
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v6

    .line 499
    check-cast v6, Ljava/util/List;

    .line 500
    .line 501
    invoke-interface {v0, v10, v6}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    goto :goto_7

    .line 505
    :cond_10
    const-string v0, "User-Agent"

    .line 506
    .line 507
    invoke-virtual {v12, v0}, LNd/l;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v5

    .line 511
    if-nez v5, :cond_11

    .line 512
    .line 513
    invoke-virtual {v15}, LMd/c;->c()LJd/m;

    .line 514
    .line 515
    .line 516
    sget v5, LNd/i;->a:I

    .line 517
    .line 518
    const-string v5, "ktor-client"

    .line 519
    .line 520
    invoke-virtual {v9, v0, v5}, LAd/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    :cond_11
    invoke-virtual {v15}, LMd/c;->b()LJd/f;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    const-string v5, "Content-Type"

    .line 528
    .line 529
    if-eqz v0, :cond_12

    .line 530
    .line 531
    invoke-virtual {v0}, LJ4/d;->toString()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    if-nez v0, :cond_13

    .line 536
    .line 537
    :cond_12
    invoke-virtual {v15}, LMd/c;->c()LJd/m;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12, v5}, LNd/l;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    :cond_13
    invoke-virtual {v15}, LMd/c;->a()Ljava/lang/Long;

    .line 545
    .line 546
    .line 547
    move-result-object v6

    .line 548
    if-eqz v6, :cond_14

    .line 549
    .line 550
    invoke-virtual {v6}, Ljava/lang/Long;->toString()Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v6

    .line 554
    if-nez v6, :cond_15

    .line 555
    .line 556
    :cond_14
    invoke-virtual {v15}, LMd/c;->c()LJd/m;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12, v13}, LNd/l;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v6

    .line 563
    :cond_15
    if-eqz v0, :cond_16

    .line 564
    .line 565
    invoke-virtual {v9, v5, v0}, LAd/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    :cond_16
    if-eqz v6, :cond_17

    .line 569
    .line 570
    invoke-virtual {v9, v13, v6}, LAd/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    :cond_17
    iget-object v0, v8, LAd/h;->b:LAd/g;

    .line 574
    .line 575
    invoke-virtual {v0, v7}, LAd/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    move-result v0

    .line 582
    if-eqz v0, :cond_19

    .line 583
    .line 584
    instance-of v0, v15, LHd/b;

    .line 585
    .line 586
    if-eqz v0, :cond_18

    .line 587
    .line 588
    move-object/from16 v3, v17

    .line 589
    .line 590
    move-object/from16 v10, v20

    .line 591
    .line 592
    move-object/from16 v6, v21

    .line 593
    .line 594
    goto/16 :goto_b

    .line 595
    .line 596
    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 597
    .line 598
    new-instance v1, Ljava/lang/StringBuilder;

    .line 599
    .line 600
    const-string v3, "Request of type "

    .line 601
    .line 602
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 603
    .line 604
    .line 605
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 606
    .line 607
    .line 608
    const-string v2, " couldn\'t send a body with the [Android] engine."

    .line 609
    .line 610
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v1

    .line 621
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    throw v0

    .line 625
    :cond_19
    if-nez v18, :cond_1a

    .line 626
    .line 627
    const-string v0, "Transfer-Encoding"

    .line 628
    .line 629
    invoke-virtual {v7, v0}, Ljava/net/URLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v2

    .line 633
    if-nez v2, :cond_1a

    .line 634
    .line 635
    const-string v2, "chunked"

    .line 636
    .line 637
    invoke-virtual {v7, v0, v2}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    :cond_1a
    if-eqz v18, :cond_1b

    .line 641
    .line 642
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Number;->longValue()J

    .line 643
    .line 644
    .line 645
    move-result-wide v2

    .line 646
    invoke-virtual {v7, v2, v3}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(J)V

    .line 647
    .line 648
    .line 649
    :goto_8
    move/from16 v0, v16

    .line 650
    .line 651
    goto :goto_9

    .line 652
    :cond_1b
    const/4 v9, 0x0

    .line 653
    invoke-virtual {v7, v9}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    .line 654
    .line 655
    .line 656
    goto :goto_8

    .line 657
    :goto_9
    invoke-virtual {v7, v0}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v7}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    const-string v2, "getOutputStream(...)"

    .line 665
    .line 666
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 667
    .line 668
    .line 669
    iput-object v1, v4, LAd/c;->a:LFd/d;

    .line 670
    .line 671
    move-object/from16 v6, v21

    .line 672
    .line 673
    iput-object v6, v4, LAd/c;->b:Ljf/h;

    .line 674
    .line 675
    move-object/from16 v2, v20

    .line 676
    .line 677
    iput-object v2, v4, LAd/c;->c:LQd/d;

    .line 678
    .line 679
    iput-object v15, v4, LAd/c;->d:LMd/c;

    .line 680
    .line 681
    iput-object v7, v4, LAd/c;->e:Ljava/net/HttpURLConnection;

    .line 682
    .line 683
    const/4 v3, 0x2

    .line 684
    iput v3, v4, LAd/c;->h:I

    .line 685
    .line 686
    invoke-static {v15, v0, v4}, LFe/c;->I(LMd/c;Ljava/io/OutputStream;Llf/c;)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    move-object/from16 v3, v17

    .line 691
    .line 692
    if-ne v0, v3, :cond_1c

    .line 693
    .line 694
    goto :goto_c

    .line 695
    :cond_1c
    move-object v10, v1

    .line 696
    move-object v9, v6

    .line 697
    move-object v6, v2

    .line 698
    move-object v2, v7

    .line 699
    :goto_a
    move-object v7, v2

    .line 700
    move-object v1, v10

    .line 701
    move-object v10, v6

    .line 702
    move-object v6, v9

    .line 703
    :goto_b
    new-instance v0, LAd/b;

    .line 704
    .line 705
    invoke-direct {v0, v6, v1, v15, v10}, LAd/b;-><init>(Ljf/h;LFd/d;LMd/c;LQd/d;)V

    .line 706
    .line 707
    .line 708
    const/4 v2, 0x0

    .line 709
    iput-object v2, v4, LAd/c;->a:LFd/d;

    .line 710
    .line 711
    iput-object v2, v4, LAd/c;->b:Ljf/h;

    .line 712
    .line 713
    iput-object v2, v4, LAd/c;->c:LQd/d;

    .line 714
    .line 715
    iput-object v2, v4, LAd/c;->d:LMd/c;

    .line 716
    .line 717
    iput-object v2, v4, LAd/c;->e:Ljava/net/HttpURLConnection;

    .line 718
    .line 719
    const/4 v2, 0x3

    .line 720
    iput v2, v4, LAd/c;->h:I

    .line 721
    .line 722
    invoke-static {v7, v1, v0, v4}, LFe/e;->V(Ljava/net/HttpURLConnection;LFd/d;LAd/b;Llf/c;)Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    if-ne v0, v3, :cond_1d

    .line 727
    .line 728
    :goto_c
    return-object v3

    .line 729
    :cond_1d
    return-object v0
.end method
