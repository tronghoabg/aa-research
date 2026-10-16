.class public final LT3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final c:Ljava/lang/String;


# instance fields
.field public final a:LK3/k;

.field public final b:LS3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "EnqueueRunnable"

    .line 2
    .line 3
    invoke-static {v0}, LJ3/r;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LT3/e;->c:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LK3/k;)V
    .locals 2

    .line 1
    new-instance v0, LS3/e;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, LS3/e;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LT3/e;->a:LK3/k;

    .line 12
    .line 13
    iput-object v0, p0, LT3/e;->b:LS3/e;

    .line 14
    .line 15
    return-void
.end method

.method public static a(LK3/k;)Z
    .locals 51

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, LK3/k;->h0(LK3/k;)Ljava/util/HashSet;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    new-array v3, v2, [Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, [Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    iget-object v5, v0, LK3/k;->a:LK3/q;

    .line 24
    .line 25
    iget-object v6, v5, LK3/q;->c:Landroidx/work/impl/WorkDatabase;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    array-length v8, v1

    .line 30
    if-lez v8, :cond_0

    .line 31
    .line 32
    const/4 v8, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v8, v2

    .line 35
    :goto_0
    const/4 v9, 0x6

    .line 36
    const/4 v10, 0x4

    .line 37
    if-eqz v8, :cond_6

    .line 38
    .line 39
    array-length v11, v1

    .line 40
    move v12, v2

    .line 41
    move v14, v12

    .line 42
    move v15, v14

    .line 43
    const/4 v13, 0x1

    .line 44
    :goto_1
    if-ge v12, v11, :cond_7

    .line 45
    .line 46
    aget-object v2, v1, v12

    .line 47
    .line 48
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->u()LS3/q;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    invoke-virtual {v7, v2}, LS3/q;->h(Ljava/lang/String;)LS3/p;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    if-nez v7, :cond_2

    .line 57
    .line 58
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    const-string v3, "Prerequisite "

    .line 63
    .line 64
    const-string v4, " doesn\'t exist; not enqueuing"

    .line 65
    .line 66
    invoke-static {v3, v2, v4}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    sget-object v3, LT3/e;->c:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v1, v3, v2}, LJ3/r;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    :goto_2
    const/4 v2, 0x0

    .line 76
    :goto_3
    const/4 v9, 0x1

    .line 77
    goto/16 :goto_12

    .line 78
    .line 79
    :cond_2
    iget v2, v7, LS3/p;->b:I

    .line 80
    .line 81
    const/4 v7, 0x3

    .line 82
    if-ne v2, v7, :cond_3

    .line 83
    .line 84
    const/4 v7, 0x1

    .line 85
    goto :goto_4

    .line 86
    :cond_3
    const/4 v7, 0x0

    .line 87
    :goto_4
    and-int/2addr v13, v7

    .line 88
    if-ne v2, v10, :cond_4

    .line 89
    .line 90
    const/4 v15, 0x1

    .line 91
    goto :goto_5

    .line 92
    :cond_4
    if-ne v2, v9, :cond_5

    .line 93
    .line 94
    const/4 v14, 0x1

    .line 95
    :cond_5
    :goto_5
    add-int/lit8 v12, v12, 0x1

    .line 96
    .line 97
    const/4 v2, 0x0

    .line 98
    goto :goto_1

    .line 99
    :cond_6
    const/4 v13, 0x1

    .line 100
    const/4 v14, 0x0

    .line 101
    const/4 v15, 0x0

    .line 102
    :cond_7
    const/4 v2, 0x0

    .line 103
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    const-string v11, "id"

    .line 108
    .line 109
    if-nez v7, :cond_e

    .line 110
    .line 111
    if-nez v8, :cond_e

    .line 112
    .line 113
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->u()LS3/q;

    .line 114
    .line 115
    .line 116
    move-result-object v12

    .line 117
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    const-string v2, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"

    .line 121
    .line 122
    const/4 v9, 0x1

    .line 123
    invoke-static {v9, v2}, Lk3/q;->d(ILjava/lang/String;)Lk3/q;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v2, v9}, Lk3/q;->N(I)V

    .line 128
    .line 129
    .line 130
    iget-object v9, v12, LS3/q;->a:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v9, Landroidx/work/impl/WorkDatabase_Impl;

    .line 133
    .line 134
    invoke-virtual {v9}, Lk3/m;->b()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v9, v2}, Lk3/m;->l(Lo3/f;)Landroid/database/Cursor;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    :try_start_0
    new-instance v12, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-interface {v9}, Landroid/database/Cursor;->getCount()I

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    invoke-direct {v12, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 148
    .line 149
    .line 150
    :goto_6
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    if-eqz v10, :cond_9

    .line 155
    .line 156
    const/4 v10, 0x0

    .line 157
    invoke-interface {v9, v10}, Landroid/database/Cursor;->isNull(I)Z

    .line 158
    .line 159
    .line 160
    move-result v16

    .line 161
    if-eqz v16, :cond_8

    .line 162
    .line 163
    const/4 v10, 0x0

    .line 164
    :goto_7
    move-object/from16 v16, v2

    .line 165
    .line 166
    const/4 v2, 0x1

    .line 167
    goto :goto_8

    .line 168
    :cond_8
    invoke-interface {v9, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 172
    move-object/from16 v10, v16

    .line 173
    .line 174
    goto :goto_7

    .line 175
    :goto_8
    :try_start_1
    invoke-interface {v9, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 176
    .line 177
    .line 178
    move-result v17

    .line 179
    invoke-static/range {v17 .. v17}, LFe/e;->M(I)I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    move-object/from16 v17, v6

    .line 184
    .line 185
    new-instance v6, LS3/o;

    .line 186
    .line 187
    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 191
    .line 192
    .line 193
    iput-object v10, v6, LS3/o;->a:Ljava/lang/String;

    .line 194
    .line 195
    iput v2, v6, LS3/o;->b:I

    .line 196
    .line 197
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 198
    .line 199
    .line 200
    move-object/from16 v2, v16

    .line 201
    .line 202
    move-object/from16 v6, v17

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :catchall_0
    move-exception v0

    .line 206
    goto/16 :goto_b

    .line 207
    .line 208
    :catchall_1
    move-exception v0

    .line 209
    move-object/from16 v16, v2

    .line 210
    .line 211
    goto/16 :goto_b

    .line 212
    .line 213
    :cond_9
    move-object/from16 v16, v2

    .line 214
    .line 215
    move-object/from16 v17, v6

    .line 216
    .line 217
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v16 .. v16}, Lk3/q;->h()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    if-nez v2, :cond_f

    .line 228
    .line 229
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    if-eqz v6, :cond_b

    .line 238
    .line 239
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    check-cast v6, LS3/o;

    .line 244
    .line 245
    iget v6, v6, LS3/o;->b:I

    .line 246
    .line 247
    const/4 v9, 0x1

    .line 248
    if-eq v6, v9, :cond_1

    .line 249
    .line 250
    const/4 v9, 0x2

    .line 251
    if-ne v6, v9, :cond_a

    .line 252
    .line 253
    goto/16 :goto_2

    .line 254
    .line 255
    :cond_b
    new-instance v2, LT3/c;

    .line 256
    .line 257
    const/4 v6, 0x1

    .line 258
    invoke-direct {v2, v5, v6}, LT3/c;-><init>(LK3/q;I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2}, LT3/d;->run()V

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->u()LS3/q;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    :goto_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v9

    .line 276
    if-eqz v9, :cond_d

    .line 277
    .line 278
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v9

    .line 282
    check-cast v9, LS3/o;

    .line 283
    .line 284
    iget-object v9, v9, LS3/o;->a:Ljava/lang/String;

    .line 285
    .line 286
    iget-object v10, v2, LS3/q;->a:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v10, Landroidx/work/impl/WorkDatabase_Impl;

    .line 289
    .line 290
    invoke-virtual {v10}, Lk3/m;->b()V

    .line 291
    .line 292
    .line 293
    iget-object v12, v2, LS3/q;->c:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v12, LS3/h;

    .line 296
    .line 297
    move-object/from16 v16, v2

    .line 298
    .line 299
    invoke-virtual {v12}, LE9/c;->a()Lo3/g;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    if-nez v9, :cond_c

    .line 304
    .line 305
    move-object/from16 v18, v6

    .line 306
    .line 307
    const/4 v6, 0x1

    .line 308
    invoke-interface {v2, v6}, Lo3/e;->N(I)V

    .line 309
    .line 310
    .line 311
    goto :goto_a

    .line 312
    :cond_c
    move-object/from16 v18, v6

    .line 313
    .line 314
    const/4 v6, 0x1

    .line 315
    invoke-interface {v2, v6, v9}, Lo3/e;->x(ILjava/lang/String;)V

    .line 316
    .line 317
    .line 318
    :goto_a
    invoke-virtual {v10}, Lk3/m;->c()V

    .line 319
    .line 320
    .line 321
    :try_start_2
    invoke-interface {v2}, Lo3/g;->g()I

    .line 322
    .line 323
    .line 324
    invoke-virtual {v10}, Lk3/m;->n()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 325
    .line 326
    .line 327
    invoke-virtual {v10}, Lk3/m;->j()V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v2}, LE9/c;->q(Lo3/g;)V

    .line 331
    .line 332
    .line 333
    move-object/from16 v2, v16

    .line 334
    .line 335
    move-object/from16 v6, v18

    .line 336
    .line 337
    goto :goto_9

    .line 338
    :catchall_2
    move-exception v0

    .line 339
    invoke-virtual {v10}, Lk3/m;->j()V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12, v2}, LE9/c;->q(Lo3/g;)V

    .line 343
    .line 344
    .line 345
    throw v0

    .line 346
    :cond_d
    const/4 v2, 0x1

    .line 347
    goto :goto_c

    .line 348
    :goto_b
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v16 .. v16}, Lk3/q;->h()V

    .line 352
    .line 353
    .line 354
    throw v0

    .line 355
    :cond_e
    move-object/from16 v17, v6

    .line 356
    .line 357
    :cond_f
    const/4 v2, 0x0

    .line 358
    :goto_c
    iget-object v6, v0, LK3/k;->b:Ljava/util/List;

    .line 359
    .line 360
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 361
    .line 362
    .line 363
    move-result-object v6

    .line 364
    move v9, v2

    .line 365
    :goto_d
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    if-eqz v2, :cond_1a

    .line 370
    .line 371
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    check-cast v2, LJ3/s;

    .line 376
    .line 377
    iget-object v10, v2, LJ3/s;->b:LS3/p;

    .line 378
    .line 379
    if-eqz v8, :cond_12

    .line 380
    .line 381
    if-nez v13, :cond_12

    .line 382
    .line 383
    if-eqz v15, :cond_10

    .line 384
    .line 385
    const/4 v12, 0x4

    .line 386
    iput v12, v10, LS3/p;->b:I

    .line 387
    .line 388
    goto :goto_e

    .line 389
    :cond_10
    const/4 v12, 0x4

    .line 390
    if-eqz v14, :cond_11

    .line 391
    .line 392
    const/4 v12, 0x6

    .line 393
    iput v12, v10, LS3/p;->b:I

    .line 394
    .line 395
    goto :goto_e

    .line 396
    :cond_11
    const/4 v12, 0x5

    .line 397
    iput v12, v10, LS3/p;->b:I

    .line 398
    .line 399
    goto :goto_e

    .line 400
    :cond_12
    iput-wide v3, v10, LS3/p;->n:J

    .line 401
    .line 402
    :goto_e
    iget v12, v10, LS3/p;->b:I

    .line 403
    .line 404
    move-wide/from16 v18, v3

    .line 405
    .line 406
    const/4 v3, 0x1

    .line 407
    if-ne v12, v3, :cond_13

    .line 408
    .line 409
    const/4 v9, 0x1

    .line 410
    :cond_13
    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->u()LS3/q;

    .line 411
    .line 412
    .line 413
    move-result-object v3

    .line 414
    iget-object v4, v5, LK3/q;->e:Ljava/util/List;

    .line 415
    .line 416
    const-string v12, "schedulers"

    .line 417
    .line 418
    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 422
    .line 423
    const/16 v12, 0x1a

    .line 424
    .line 425
    if-ge v4, v12, :cond_15

    .line 426
    .line 427
    iget-object v4, v10, LS3/p;->j:LJ3/d;

    .line 428
    .line 429
    const-class v12, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 430
    .line 431
    move-object/from16 v16, v5

    .line 432
    .line 433
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v5

    .line 437
    move-object/from16 v20, v6

    .line 438
    .line 439
    iget-object v6, v10, LS3/p;->c:Ljava/lang/String;

    .line 440
    .line 441
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result v5

    .line 445
    if-nez v5, :cond_16

    .line 446
    .line 447
    iget-boolean v5, v4, LJ3/d;->d:Z

    .line 448
    .line 449
    if-nez v5, :cond_14

    .line 450
    .line 451
    iget-boolean v4, v4, LJ3/d;->e:Z

    .line 452
    .line 453
    if-eqz v4, :cond_16

    .line 454
    .line 455
    :cond_14
    new-instance v4, LJ3/g;

    .line 456
    .line 457
    const/4 v5, 0x0

    .line 458
    invoke-direct {v4, v5}, LJ3/g;-><init>(I)V

    .line 459
    .line 460
    .line 461
    iget-object v5, v10, LS3/p;->e:LJ3/h;

    .line 462
    .line 463
    iget-object v5, v5, LJ3/h;->a:Ljava/util/HashMap;

    .line 464
    .line 465
    invoke-virtual {v4, v5}, LJ3/g;->j(Ljava/util/HashMap;)V

    .line 466
    .line 467
    .line 468
    iget-object v5, v4, LJ3/g;->a:Ljava/util/HashMap;

    .line 469
    .line 470
    move-object/from16 v21, v4

    .line 471
    .line 472
    const-string v4, "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"

    .line 473
    .line 474
    invoke-virtual {v5, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v21 .. v21}, LJ3/g;->a()LJ3/h;

    .line 478
    .line 479
    .line 480
    move-result-object v27

    .line 481
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v25

    .line 485
    iget v4, v10, LS3/p;->b:I

    .line 486
    .line 487
    iget-object v5, v10, LS3/p;->d:Ljava/lang/String;

    .line 488
    .line 489
    iget-object v6, v10, LS3/p;->j:LJ3/d;

    .line 490
    .line 491
    iget v12, v10, LS3/p;->l:I

    .line 492
    .line 493
    move/from16 v50, v7

    .line 494
    .line 495
    move/from16 v21, v8

    .line 496
    .line 497
    iget-wide v7, v10, LS3/p;->m:J

    .line 498
    .line 499
    move-wide/from16 v38, v7

    .line 500
    .line 501
    iget-wide v7, v10, LS3/p;->n:J

    .line 502
    .line 503
    move-object/from16 v26, v5

    .line 504
    .line 505
    iget-boolean v5, v10, LS3/p;->q:Z

    .line 506
    .line 507
    move/from16 v46, v5

    .line 508
    .line 509
    iget-object v5, v10, LS3/p;->a:Ljava/lang/String;

    .line 510
    .line 511
    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    move-object/from16 v23, v5

    .line 515
    .line 516
    const-string v5, "state"

    .line 517
    .line 518
    invoke-static {v4, v5}, Lka/n;->m(ILjava/lang/String;)V

    .line 519
    .line 520
    .line 521
    iget-object v5, v10, LS3/p;->f:LJ3/h;

    .line 522
    .line 523
    move/from16 v24, v4

    .line 524
    .line 525
    const-string v4, "output"

    .line 526
    .line 527
    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    const-string v4, "constraints"

    .line 531
    .line 532
    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    const-string v4, "backoffPolicy"

    .line 536
    .line 537
    invoke-static {v12, v4}, Lka/n;->m(ILjava/lang/String;)V

    .line 538
    .line 539
    .line 540
    iget v4, v10, LS3/p;->r:I

    .line 541
    .line 542
    move-object/from16 v28, v5

    .line 543
    .line 544
    const-string v5, "outOfQuotaPolicy"

    .line 545
    .line 546
    invoke-static {v4, v5}, Lka/n;->m(ILjava/lang/String;)V

    .line 547
    .line 548
    .line 549
    new-instance v22, LS3/p;

    .line 550
    .line 551
    move/from16 v47, v4

    .line 552
    .line 553
    iget-wide v4, v10, LS3/p;->g:J

    .line 554
    .line 555
    move-wide/from16 v29, v4

    .line 556
    .line 557
    iget-wide v4, v10, LS3/p;->h:J

    .line 558
    .line 559
    move-wide/from16 v31, v4

    .line 560
    .line 561
    iget-wide v4, v10, LS3/p;->i:J

    .line 562
    .line 563
    move-wide/from16 v33, v4

    .line 564
    .line 565
    iget v4, v10, LS3/p;->k:I

    .line 566
    .line 567
    move/from16 v36, v4

    .line 568
    .line 569
    iget-wide v4, v10, LS3/p;->o:J

    .line 570
    .line 571
    move-wide/from16 v42, v4

    .line 572
    .line 573
    iget-wide v4, v10, LS3/p;->p:J

    .line 574
    .line 575
    move-wide/from16 v44, v4

    .line 576
    .line 577
    iget v4, v10, LS3/p;->s:I

    .line 578
    .line 579
    iget v5, v10, LS3/p;->t:I

    .line 580
    .line 581
    move/from16 v48, v4

    .line 582
    .line 583
    move/from16 v49, v5

    .line 584
    .line 585
    move-object/from16 v35, v6

    .line 586
    .line 587
    move-wide/from16 v40, v7

    .line 588
    .line 589
    move/from16 v37, v12

    .line 590
    .line 591
    invoke-direct/range {v22 .. v49}, LS3/p;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;LJ3/h;LJ3/h;JJJLJ3/d;IIJJJJZIII)V

    .line 592
    .line 593
    .line 594
    move-object/from16 v10, v22

    .line 595
    .line 596
    goto :goto_f

    .line 597
    :cond_15
    move-object/from16 v16, v5

    .line 598
    .line 599
    move-object/from16 v20, v6

    .line 600
    .line 601
    :cond_16
    move/from16 v50, v7

    .line 602
    .line 603
    move/from16 v21, v8

    .line 604
    .line 605
    :goto_f
    iget-object v4, v3, LS3/q;->a:Ljava/lang/Object;

    .line 606
    .line 607
    check-cast v4, Landroidx/work/impl/WorkDatabase_Impl;

    .line 608
    .line 609
    invoke-virtual {v4}, Lk3/m;->b()V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v4}, Lk3/m;->c()V

    .line 613
    .line 614
    .line 615
    :try_start_3
    iget-object v3, v3, LS3/q;->b:Ljava/lang/Object;

    .line 616
    .line 617
    check-cast v3, LS3/b;

    .line 618
    .line 619
    invoke-virtual {v3, v10}, Lk3/e;->x(Ljava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    invoke-virtual {v4}, Lk3/m;->n()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 623
    .line 624
    .line 625
    invoke-virtual {v4}, Lk3/m;->j()V

    .line 626
    .line 627
    .line 628
    const-string v3, "id.toString()"

    .line 629
    .line 630
    iget-object v4, v2, LJ3/s;->a:Ljava/util/UUID;

    .line 631
    .line 632
    if-eqz v21, :cond_17

    .line 633
    .line 634
    array-length v5, v1

    .line 635
    const/4 v6, 0x0

    .line 636
    :goto_10
    if-ge v6, v5, :cond_17

    .line 637
    .line 638
    aget-object v7, v1, v6

    .line 639
    .line 640
    new-instance v8, LS3/a;

    .line 641
    .line 642
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v10

    .line 646
    invoke-static {v10, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    invoke-direct {v8, v10, v7}, LS3/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->p()LS3/c;

    .line 653
    .line 654
    .line 655
    move-result-object v7

    .line 656
    iget-object v10, v7, LS3/c;->b:Ljava/lang/Object;

    .line 657
    .line 658
    check-cast v10, Landroidx/work/impl/WorkDatabase_Impl;

    .line 659
    .line 660
    invoke-virtual {v10}, Lk3/m;->b()V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v10}, Lk3/m;->c()V

    .line 664
    .line 665
    .line 666
    :try_start_4
    iget-object v7, v7, LS3/c;->c:Ljava/lang/Object;

    .line 667
    .line 668
    check-cast v7, LS3/b;

    .line 669
    .line 670
    invoke-virtual {v7, v8}, Lk3/e;->x(Ljava/lang/Object;)V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v10}, Lk3/m;->n()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 674
    .line 675
    .line 676
    invoke-virtual {v10}, Lk3/m;->j()V

    .line 677
    .line 678
    .line 679
    add-int/lit8 v6, v6, 0x1

    .line 680
    .line 681
    goto :goto_10

    .line 682
    :catchall_3
    move-exception v0

    .line 683
    invoke-virtual {v10}, Lk3/m;->j()V

    .line 684
    .line 685
    .line 686
    throw v0

    .line 687
    :cond_17
    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->v()LS3/s;

    .line 688
    .line 689
    .line 690
    move-result-object v5

    .line 691
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v6

    .line 695
    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 699
    .line 700
    .line 701
    iget-object v2, v2, LJ3/s;->c:Ljava/util/Set;

    .line 702
    .line 703
    const-string v7, "tags"

    .line 704
    .line 705
    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    check-cast v2, Ljava/lang/Iterable;

    .line 709
    .line 710
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 711
    .line 712
    .line 713
    move-result-object v2

    .line 714
    :goto_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 715
    .line 716
    .line 717
    move-result v7

    .line 718
    if-eqz v7, :cond_18

    .line 719
    .line 720
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v7

    .line 724
    check-cast v7, Ljava/lang/String;

    .line 725
    .line 726
    new-instance v8, LS3/r;

    .line 727
    .line 728
    invoke-direct {v8, v7, v6}, LS3/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 729
    .line 730
    .line 731
    iget-object v7, v5, LS3/s;->b:Ljava/lang/Object;

    .line 732
    .line 733
    check-cast v7, Landroidx/work/impl/WorkDatabase_Impl;

    .line 734
    .line 735
    invoke-virtual {v7}, Lk3/m;->b()V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v7}, Lk3/m;->c()V

    .line 739
    .line 740
    .line 741
    :try_start_5
    iget-object v10, v5, LS3/s;->c:Ljava/lang/Object;

    .line 742
    .line 743
    check-cast v10, LS3/b;

    .line 744
    .line 745
    invoke-virtual {v10, v8}, Lk3/e;->x(Ljava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    invoke-virtual {v7}, Lk3/m;->n()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 749
    .line 750
    .line 751
    invoke-virtual {v7}, Lk3/m;->j()V

    .line 752
    .line 753
    .line 754
    goto :goto_11

    .line 755
    :catchall_4
    move-exception v0

    .line 756
    invoke-virtual {v7}, Lk3/m;->j()V

    .line 757
    .line 758
    .line 759
    throw v0

    .line 760
    :cond_18
    if-eqz v50, :cond_19

    .line 761
    .line 762
    move-object/from16 v5, v16

    .line 763
    .line 764
    move-wide/from16 v3, v18

    .line 765
    .line 766
    move-object/from16 v6, v20

    .line 767
    .line 768
    move/from16 v8, v21

    .line 769
    .line 770
    move/from16 v7, v50

    .line 771
    .line 772
    goto/16 :goto_d

    .line 773
    .line 774
    :cond_19
    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->s()LS3/l;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    const-string v0, "name"

    .line 785
    .line 786
    const/4 v1, 0x0

    .line 787
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 788
    .line 789
    .line 790
    throw v1

    .line 791
    :catchall_5
    move-exception v0

    .line 792
    invoke-virtual {v4}, Lk3/m;->j()V

    .line 793
    .line 794
    .line 795
    throw v0

    .line 796
    :cond_1a
    move v2, v9

    .line 797
    goto/16 :goto_3

    .line 798
    .line 799
    :goto_12
    iput-boolean v9, v0, LK3/k;->e:Z

    .line 800
    .line 801
    return v2
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, LT3/e;->b:LS3/e;

    .line 2
    .line 3
    iget-object v1, p0, LT3/e;->a:LK3/k;

    .line 4
    .line 5
    const-string v2, "WorkContinuation has cycles ("

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v3, Ljava/util/HashSet;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v4, v1, LK3/k;->c:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-interface {v3, v4}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, LK3/k;->h0(LK3/k;)Ljava/util/HashSet;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    if-eqz v6, :cond_1

    .line 33
    .line 34
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    check-cast v6, Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v4, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eqz v6, :cond_0

    .line 45
    .line 46
    const/4 v3, 0x1

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object v4, v1, LK3/k;->c:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-interface {v3, v4}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    :goto_0
    if-nez v3, :cond_3

    .line 55
    .line 56
    iget-object v2, v1, LK3/k;->a:LK3/q;

    .line 57
    .line 58
    :try_start_1
    iget-object v3, v2, LK3/q;->c:Landroidx/work/impl/WorkDatabase;

    .line 59
    .line 60
    invoke-virtual {v3}, Lk3/m;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    .line 63
    :try_start_2
    invoke-static {v1}, LT3/e;->a(LK3/k;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {v3}, Lk3/m;->n()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 68
    .line 69
    .line 70
    :try_start_3
    invoke-virtual {v3}, Lk3/m;->j()V

    .line 71
    .line 72
    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    iget-object v1, v2, LK3/q;->a:Landroid/content/Context;

    .line 76
    .line 77
    const-class v3, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;

    .line 78
    .line 79
    const/4 v4, 0x1

    .line 80
    invoke-static {v1, v3, v4}, LT3/k;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 81
    .line 82
    .line 83
    iget-object v1, v2, LK3/q;->b:LJ3/b;

    .line 84
    .line 85
    iget-object v3, v2, LK3/q;->c:Landroidx/work/impl/WorkDatabase;

    .line 86
    .line 87
    iget-object v2, v2, LK3/q;->e:Ljava/util/List;

    .line 88
    .line 89
    invoke-static {v1, v3, v2}, LK3/i;->a(LJ3/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception v1

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    :goto_1
    sget-object v1, LJ3/w;->L8:LJ3/v;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, LS3/e;->r(LFe/c;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :catchall_1
    move-exception v1

    .line 102
    invoke-virtual {v3}, Lk3/m;->j()V

    .line 103
    .line 104
    .line 105
    throw v1

    .line 106
    :cond_3
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 107
    .line 108
    new-instance v4, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v1, ")"

    .line 117
    .line 118
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-direct {v3, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 129
    :goto_2
    new-instance v2, LJ3/t;

    .line 130
    .line 131
    invoke-direct {v2, v1}, LJ3/t;-><init>(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v2}, LS3/e;->r(LFe/c;)V

    .line 135
    .line 136
    .line 137
    return-void
.end method
