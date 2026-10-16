.class public final Landroidx/work/impl/workers/DiagnosticsWorker;
.super Landroidx/work/Worker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/work/impl/workers/DiagnosticsWorker;",
        "Landroidx/work/Worker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "parameters",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/WorkerParameters;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "parameters"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Landroidx/work/Worker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final doWork()LJ3/p;
    .locals 75

    .line 1
    invoke-virtual/range {p0 .. p0}, LJ3/q;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LK3/q;->c(Landroid/content/Context;)LK3/q;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, LK3/q;->c:Landroidx/work/impl/WorkDatabase;

    .line 10
    .line 11
    const-string v1, "workManager.workDatabase"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->u()LS3/q;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->s()LS3/l;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->v()LS3/s;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->r()LS3/i;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 33
    .line 34
    .line 35
    move-result-wide v4

    .line 36
    sget-object v6, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 37
    .line 38
    const-wide/16 v7, 0x1

    .line 39
    .line 40
    invoke-virtual {v6, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v6

    .line 44
    sub-long/2addr v4, v6

    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const-string v6, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC"

    .line 49
    .line 50
    const/4 v7, 0x1

    .line 51
    invoke-static {v7, v6}, Lk3/q;->d(ILjava/lang/String;)Lk3/q;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-virtual {v6, v7, v4, v5}, Lk3/q;->G(IJ)V

    .line 56
    .line 57
    .line 58
    iget-object v4, v1, LS3/q;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v4, Landroidx/work/impl/WorkDatabase_Impl;

    .line 61
    .line 62
    invoke-virtual {v4}, Lk3/m;->b()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v6}, Lk3/m;->l(Lo3/f;)Landroid/database/Cursor;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    :try_start_0
    const-string v5, "id"

    .line 70
    .line 71
    invoke-static {v4, v5}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    const-string v8, "state"

    .line 76
    .line 77
    invoke-static {v4, v8}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    const-string v9, "worker_class_name"

    .line 82
    .line 83
    invoke-static {v4, v9}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    const-string v10, "input_merger_class_name"

    .line 88
    .line 89
    invoke-static {v4, v10}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    const-string v11, "input"

    .line 94
    .line 95
    invoke-static {v4, v11}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    const-string v12, "output"

    .line 100
    .line 101
    invoke-static {v4, v12}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v12

    .line 105
    const-string v13, "initial_delay"

    .line 106
    .line 107
    invoke-static {v4, v13}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result v13

    .line 111
    const-string v14, "interval_duration"

    .line 112
    .line 113
    invoke-static {v4, v14}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    move-result v14

    .line 117
    const-string v15, "flex_duration"

    .line 118
    .line 119
    invoke-static {v4, v15}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result v15

    .line 123
    const-string v7, "run_attempt_count"

    .line 124
    .line 125
    invoke-static {v4, v7}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    move-object/from16 v16, v1

    .line 130
    .line 131
    const-string v1, "backoff_policy"

    .line 132
    .line 133
    invoke-static {v4, v1}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 137
    move-object/from16 v17, v6

    .line 138
    .line 139
    :try_start_1
    const-string v6, "backoff_delay_duration"

    .line 140
    .line 141
    invoke-static {v4, v6}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    move-object/from16 v18, v0

    .line 146
    .line 147
    const-string v0, "last_enqueue_time"

    .line 148
    .line 149
    invoke-static {v4, v0}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    move-object/from16 v19, v2

    .line 154
    .line 155
    const-string v2, "minimum_retention_duration"

    .line 156
    .line 157
    invoke-static {v4, v2}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    move-object/from16 v20, v3

    .line 162
    .line 163
    const-string v3, "schedule_requested_at"

    .line 164
    .line 165
    invoke-static {v4, v3}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    move/from16 v21, v3

    .line 170
    .line 171
    const-string v3, "run_in_foreground"

    .line 172
    .line 173
    invoke-static {v4, v3}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    move/from16 v22, v3

    .line 178
    .line 179
    const-string v3, "out_of_quota_policy"

    .line 180
    .line 181
    invoke-static {v4, v3}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    move/from16 v23, v3

    .line 186
    .line 187
    const-string v3, "period_count"

    .line 188
    .line 189
    invoke-static {v4, v3}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    move/from16 v24, v3

    .line 194
    .line 195
    const-string v3, "generation"

    .line 196
    .line 197
    invoke-static {v4, v3}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    move/from16 v25, v3

    .line 202
    .line 203
    const-string v3, "required_network_type"

    .line 204
    .line 205
    invoke-static {v4, v3}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    move/from16 v26, v3

    .line 210
    .line 211
    const-string v3, "requires_charging"

    .line 212
    .line 213
    invoke-static {v4, v3}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    move/from16 v27, v3

    .line 218
    .line 219
    const-string v3, "requires_device_idle"

    .line 220
    .line 221
    invoke-static {v4, v3}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    move/from16 v28, v3

    .line 226
    .line 227
    const-string v3, "requires_battery_not_low"

    .line 228
    .line 229
    invoke-static {v4, v3}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    move/from16 v29, v3

    .line 234
    .line 235
    const-string v3, "requires_storage_not_low"

    .line 236
    .line 237
    invoke-static {v4, v3}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    move/from16 v30, v3

    .line 242
    .line 243
    const-string v3, "trigger_content_update_delay"

    .line 244
    .line 245
    invoke-static {v4, v3}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    move/from16 v31, v3

    .line 250
    .line 251
    const-string v3, "trigger_max_content_delay"

    .line 252
    .line 253
    invoke-static {v4, v3}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    move/from16 v32, v3

    .line 258
    .line 259
    const-string v3, "content_uri_triggers"

    .line 260
    .line 261
    invoke-static {v4, v3}, LU8/v0;->K(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    move/from16 v33, v3

    .line 266
    .line 267
    new-instance v3, Ljava/util/ArrayList;

    .line 268
    .line 269
    move/from16 v34, v2

    .line 270
    .line 271
    invoke-interface {v4}, Landroid/database/Cursor;->getCount()I

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 276
    .line 277
    .line 278
    :goto_0
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    if-eqz v2, :cond_b

    .line 283
    .line 284
    invoke-interface {v4, v5}, Landroid/database/Cursor;->isNull(I)Z

    .line 285
    .line 286
    .line 287
    move-result v2

    .line 288
    const/16 v35, 0x0

    .line 289
    .line 290
    if-eqz v2, :cond_0

    .line 291
    .line 292
    move-object/from16 v37, v35

    .line 293
    .line 294
    goto :goto_1

    .line 295
    :cond_0
    invoke-interface {v4, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    move-object/from16 v37, v2

    .line 300
    .line 301
    :goto_1
    invoke-interface {v4, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    invoke-static {v2}, LFe/e;->M(I)I

    .line 306
    .line 307
    .line 308
    move-result v38

    .line 309
    invoke-interface {v4, v9}, Landroid/database/Cursor;->isNull(I)Z

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    if-eqz v2, :cond_1

    .line 314
    .line 315
    move-object/from16 v39, v35

    .line 316
    .line 317
    goto :goto_2

    .line 318
    :cond_1
    invoke-interface {v4, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    move-object/from16 v39, v2

    .line 323
    .line 324
    :goto_2
    invoke-interface {v4, v10}, Landroid/database/Cursor;->isNull(I)Z

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    if-eqz v2, :cond_2

    .line 329
    .line 330
    move-object/from16 v40, v35

    .line 331
    .line 332
    goto :goto_3

    .line 333
    :cond_2
    invoke-interface {v4, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    move-object/from16 v40, v2

    .line 338
    .line 339
    :goto_3
    invoke-interface {v4, v11}, Landroid/database/Cursor;->isNull(I)Z

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    if-eqz v2, :cond_3

    .line 344
    .line 345
    move-object/from16 v2, v35

    .line 346
    .line 347
    goto :goto_4

    .line 348
    :cond_3
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getBlob(I)[B

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    :goto_4
    invoke-static {v2}, LJ3/h;->a([B)LJ3/h;

    .line 353
    .line 354
    .line 355
    move-result-object v41

    .line 356
    invoke-interface {v4, v12}, Landroid/database/Cursor;->isNull(I)Z

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    if-eqz v2, :cond_4

    .line 361
    .line 362
    move-object/from16 v2, v35

    .line 363
    .line 364
    goto :goto_5

    .line 365
    :cond_4
    invoke-interface {v4, v12}, Landroid/database/Cursor;->getBlob(I)[B

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    :goto_5
    invoke-static {v2}, LJ3/h;->a([B)LJ3/h;

    .line 370
    .line 371
    .line 372
    move-result-object v42

    .line 373
    invoke-interface {v4, v13}, Landroid/database/Cursor;->getLong(I)J

    .line 374
    .line 375
    .line 376
    move-result-wide v43

    .line 377
    invoke-interface {v4, v14}, Landroid/database/Cursor;->getLong(I)J

    .line 378
    .line 379
    .line 380
    move-result-wide v45

    .line 381
    invoke-interface {v4, v15}, Landroid/database/Cursor;->getLong(I)J

    .line 382
    .line 383
    .line 384
    move-result-wide v47

    .line 385
    invoke-interface {v4, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 386
    .line 387
    .line 388
    move-result v50

    .line 389
    invoke-interface {v4, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    invoke-static {v2}, LFe/e;->J(I)I

    .line 394
    .line 395
    .line 396
    move-result v51

    .line 397
    invoke-interface {v4, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 398
    .line 399
    .line 400
    move-result-wide v52

    .line 401
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 402
    .line 403
    .line 404
    move-result-wide v54

    .line 405
    move/from16 v2, v34

    .line 406
    .line 407
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 408
    .line 409
    .line 410
    move-result-wide v56

    .line 411
    move/from16 v34, v0

    .line 412
    .line 413
    move/from16 v0, v21

    .line 414
    .line 415
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 416
    .line 417
    .line 418
    move-result-wide v58

    .line 419
    move/from16 v21, v0

    .line 420
    .line 421
    move/from16 v0, v22

    .line 422
    .line 423
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 424
    .line 425
    .line 426
    move-result v22

    .line 427
    const/16 v36, 0x0

    .line 428
    .line 429
    if-eqz v22, :cond_5

    .line 430
    .line 431
    const/16 v60, 0x1

    .line 432
    .line 433
    :goto_6
    move/from16 v22, v0

    .line 434
    .line 435
    move/from16 v0, v23

    .line 436
    .line 437
    goto :goto_7

    .line 438
    :cond_5
    move/from16 v60, v36

    .line 439
    .line 440
    goto :goto_6

    .line 441
    :goto_7
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 442
    .line 443
    .line 444
    move-result v23

    .line 445
    invoke-static/range {v23 .. v23}, LFe/e;->L(I)I

    .line 446
    .line 447
    .line 448
    move-result v61

    .line 449
    move/from16 v23, v0

    .line 450
    .line 451
    move/from16 v0, v24

    .line 452
    .line 453
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 454
    .line 455
    .line 456
    move-result v62

    .line 457
    move/from16 v24, v0

    .line 458
    .line 459
    move/from16 v0, v25

    .line 460
    .line 461
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 462
    .line 463
    .line 464
    move-result v63

    .line 465
    move/from16 v25, v0

    .line 466
    .line 467
    move/from16 v0, v26

    .line 468
    .line 469
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 470
    .line 471
    .line 472
    move-result v26

    .line 473
    invoke-static/range {v26 .. v26}, LFe/e;->K(I)I

    .line 474
    .line 475
    .line 476
    move-result v65

    .line 477
    move/from16 v26, v0

    .line 478
    .line 479
    move/from16 v0, v27

    .line 480
    .line 481
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 482
    .line 483
    .line 484
    move-result v27

    .line 485
    if-eqz v27, :cond_6

    .line 486
    .line 487
    const/16 v66, 0x1

    .line 488
    .line 489
    :goto_8
    move/from16 v27, v0

    .line 490
    .line 491
    move/from16 v0, v28

    .line 492
    .line 493
    goto :goto_9

    .line 494
    :cond_6
    move/from16 v66, v36

    .line 495
    .line 496
    goto :goto_8

    .line 497
    :goto_9
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 498
    .line 499
    .line 500
    move-result v28

    .line 501
    if-eqz v28, :cond_7

    .line 502
    .line 503
    const/16 v67, 0x1

    .line 504
    .line 505
    :goto_a
    move/from16 v28, v0

    .line 506
    .line 507
    move/from16 v0, v29

    .line 508
    .line 509
    goto :goto_b

    .line 510
    :cond_7
    move/from16 v67, v36

    .line 511
    .line 512
    goto :goto_a

    .line 513
    :goto_b
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 514
    .line 515
    .line 516
    move-result v29

    .line 517
    if-eqz v29, :cond_8

    .line 518
    .line 519
    const/16 v68, 0x1

    .line 520
    .line 521
    :goto_c
    move/from16 v29, v0

    .line 522
    .line 523
    move/from16 v0, v30

    .line 524
    .line 525
    goto :goto_d

    .line 526
    :cond_8
    move/from16 v68, v36

    .line 527
    .line 528
    goto :goto_c

    .line 529
    :goto_d
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 530
    .line 531
    .line 532
    move-result v30

    .line 533
    if-eqz v30, :cond_9

    .line 534
    .line 535
    const/16 v69, 0x1

    .line 536
    .line 537
    :goto_e
    move/from16 v30, v0

    .line 538
    .line 539
    move/from16 v0, v31

    .line 540
    .line 541
    goto :goto_f

    .line 542
    :cond_9
    move/from16 v69, v36

    .line 543
    .line 544
    goto :goto_e

    .line 545
    :goto_f
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 546
    .line 547
    .line 548
    move-result-wide v70

    .line 549
    move/from16 v31, v0

    .line 550
    .line 551
    move/from16 v0, v32

    .line 552
    .line 553
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 554
    .line 555
    .line 556
    move-result-wide v72

    .line 557
    move/from16 v32, v0

    .line 558
    .line 559
    move/from16 v0, v33

    .line 560
    .line 561
    invoke-interface {v4, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 562
    .line 563
    .line 564
    move-result v33

    .line 565
    if-eqz v33, :cond_a

    .line 566
    .line 567
    goto :goto_10

    .line 568
    :cond_a
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 569
    .line 570
    .line 571
    move-result-object v35

    .line 572
    :goto_10
    invoke-static/range {v35 .. v35}, LFe/e;->m([B)Ljava/util/LinkedHashSet;

    .line 573
    .line 574
    .line 575
    move-result-object v74

    .line 576
    new-instance v64, LJ3/d;

    .line 577
    .line 578
    invoke-direct/range {v64 .. v74}, LJ3/d;-><init>(IZZZZJJLjava/util/Set;)V

    .line 579
    .line 580
    .line 581
    new-instance v36, LS3/p;

    .line 582
    .line 583
    move-object/from16 v49, v64

    .line 584
    .line 585
    invoke-direct/range {v36 .. v63}, LS3/p;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;LJ3/h;LJ3/h;JJJLJ3/d;IIJJJJZIII)V

    .line 586
    .line 587
    .line 588
    move/from16 v33, v0

    .line 589
    .line 590
    move-object/from16 v0, v36

    .line 591
    .line 592
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 593
    .line 594
    .line 595
    move/from16 v0, v34

    .line 596
    .line 597
    move/from16 v34, v2

    .line 598
    .line 599
    goto/16 :goto_0

    .line 600
    .line 601
    :catchall_0
    move-exception v0

    .line 602
    goto/16 :goto_12

    .line 603
    .line 604
    :cond_b
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v17 .. v17}, Lk3/q;->h()V

    .line 608
    .line 609
    .line 610
    invoke-virtual/range {v16 .. v16}, LS3/q;->c()Ljava/util/ArrayList;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    invoke-virtual/range {v16 .. v16}, LS3/q;->a()Ljava/util/ArrayList;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 619
    .line 620
    .line 621
    move-result v2

    .line 622
    if-nez v2, :cond_c

    .line 623
    .line 624
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    sget-object v4, LW3/b;->a:Ljava/lang/String;

    .line 629
    .line 630
    const-string v5, "Recently completed work:\n\n"

    .line 631
    .line 632
    invoke-virtual {v2, v4, v5}, LJ3/r;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 633
    .line 634
    .line 635
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 636
    .line 637
    .line 638
    move-result-object v2

    .line 639
    move-object/from16 v7, v18

    .line 640
    .line 641
    move-object/from16 v5, v19

    .line 642
    .line 643
    move-object/from16 v6, v20

    .line 644
    .line 645
    invoke-static {v5, v6, v7, v3}, LW3/b;->a(LS3/l;LS3/s;LS3/i;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v3

    .line 649
    invoke-virtual {v2, v4, v3}, LJ3/r;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    goto :goto_11

    .line 653
    :cond_c
    move-object/from16 v7, v18

    .line 654
    .line 655
    move-object/from16 v5, v19

    .line 656
    .line 657
    move-object/from16 v6, v20

    .line 658
    .line 659
    :goto_11
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 660
    .line 661
    .line 662
    move-result v2

    .line 663
    if-nez v2, :cond_d

    .line 664
    .line 665
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    sget-object v3, LW3/b;->a:Ljava/lang/String;

    .line 670
    .line 671
    const-string v4, "Running work:\n\n"

    .line 672
    .line 673
    invoke-virtual {v2, v3, v4}, LJ3/r;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 677
    .line 678
    .line 679
    move-result-object v2

    .line 680
    invoke-static {v5, v6, v7, v0}, LW3/b;->a(LS3/l;LS3/s;LS3/i;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    invoke-virtual {v2, v3, v0}, LJ3/r;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    :cond_d
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 688
    .line 689
    .line 690
    move-result v0

    .line 691
    if-nez v0, :cond_e

    .line 692
    .line 693
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    sget-object v2, LW3/b;->a:Ljava/lang/String;

    .line 698
    .line 699
    const-string v3, "Enqueued work:\n\n"

    .line 700
    .line 701
    invoke-virtual {v0, v2, v3}, LJ3/r;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 702
    .line 703
    .line 704
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    invoke-static {v5, v6, v7, v1}, LW3/b;->a(LS3/l;LS3/s;LS3/i;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v1

    .line 712
    invoke-virtual {v0, v2, v1}, LJ3/r;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 713
    .line 714
    .line 715
    :cond_e
    invoke-static {}, LJ3/p;->a()LJ3/o;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    return-object v0

    .line 720
    :catchall_1
    move-exception v0

    .line 721
    move-object/from16 v17, v6

    .line 722
    .line 723
    :goto_12
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 724
    .line 725
    .line 726
    invoke-virtual/range {v17 .. v17}, Lk3/q;->h()V

    .line 727
    .line 728
    .line 729
    throw v0
.end method
