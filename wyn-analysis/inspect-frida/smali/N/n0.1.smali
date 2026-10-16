.class public final LN/n0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:LN/p0;

.field public final synthetic j:Lx/r;

.field public final synthetic k:Lx/r;

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:Ljava/util/List;

.field public final synthetic n:Lx/r;

.field public final synthetic o:Ljava/util/List;

.field public final synthetic p:Lx/r;

.field public final synthetic q:Ljava/util/Set;


# direct methods
.method public constructor <init>(LN/p0;Lx/r;Lx/r;Ljava/util/List;Ljava/util/List;Lx/r;Ljava/util/List;Lx/r;Ljava/util/Set;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/n0;->i:LN/p0;

    .line 2
    .line 3
    iput-object p2, p0, LN/n0;->j:Lx/r;

    .line 4
    .line 5
    iput-object p3, p0, LN/n0;->k:Lx/r;

    .line 6
    .line 7
    iput-object p4, p0, LN/n0;->l:Ljava/util/List;

    .line 8
    .line 9
    iput-object p5, p0, LN/n0;->m:Ljava/util/List;

    .line 10
    .line 11
    iput-object p6, p0, LN/n0;->n:Lx/r;

    .line 12
    .line 13
    iput-object p7, p0, LN/n0;->o:Ljava/util/List;

    .line 14
    .line 15
    iput-object p8, p0, LN/n0;->p:Lx/r;

    .line 16
    .line 17
    iput-object p9, p0, LN/n0;->q:Ljava/util/Set;

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    check-cast v0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    iget-object v0, v1, LN/n0;->i:LN/p0;

    .line 12
    .line 13
    invoke-static {v0}, LN/p0;->r(LN/p0;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-string v0, "Recomposer:animation"

    .line 20
    .line 21
    iget-object v4, v1, LN/n0;->i:LN/p0;

    .line 22
    .line 23
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :try_start_0
    iget-object v0, v4, LN/p0;->a:LN/g;

    .line 27
    .line 28
    invoke-virtual {v0, v2, v3}, LN/g;->b(J)V

    .line 29
    .line 30
    .line 31
    invoke-static {}, LX/q;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :cond_0
    :goto_0
    const-string v0, "Recomposer:recompose"

    .line 44
    .line 45
    iget-object v2, v1, LN/n0;->i:LN/p0;

    .line 46
    .line 47
    iget-object v8, v1, LN/n0;->j:Lx/r;

    .line 48
    .line 49
    iget-object v9, v1, LN/n0;->k:Lx/r;

    .line 50
    .line 51
    iget-object v3, v1, LN/n0;->l:Ljava/util/List;

    .line 52
    .line 53
    iget-object v4, v1, LN/n0;->m:Ljava/util/List;

    .line 54
    .line 55
    iget-object v6, v1, LN/n0;->n:Lx/r;

    .line 56
    .line 57
    iget-object v5, v1, LN/n0;->o:Ljava/util/List;

    .line 58
    .line 59
    iget-object v7, v1, LN/n0;->p:Lx/r;

    .line 60
    .line 61
    iget-object v10, v1, LN/n0;->q:Ljava/util/Set;

    .line 62
    .line 63
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :try_start_1
    invoke-static {v2}, LN/p0;->t(LN/p0;)Z

    .line 67
    .line 68
    .line 69
    iget-object v11, v2, LN/p0;->b:Ljava/lang/Object;

    .line 70
    .line 71
    monitor-enter v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 72
    :try_start_2
    iget-object v0, v2, LN/p0;->h:LP/d;

    .line 73
    .line 74
    iget v12, v0, LP/d;->c:I

    .line 75
    .line 76
    if-lez v12, :cond_2

    .line 77
    .line 78
    iget-object v0, v0, LP/d;->a:[Ljava/lang/Object;

    .line 79
    .line 80
    const/4 v14, 0x0

    .line 81
    :cond_1
    aget-object v15, v0, v14

    .line 82
    .line 83
    check-cast v15, LN/s;

    .line 84
    .line 85
    move-object v13, v3

    .line 86
    check-cast v13, Ljava/util/Collection;

    .line 87
    .line 88
    invoke-interface {v13, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    add-int/lit8 v14, v14, 0x1

    .line 92
    .line 93
    if-lt v14, v12, :cond_1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :catchall_1
    move-exception v0

    .line 97
    goto/16 :goto_27

    .line 98
    .line 99
    :cond_2
    :goto_1
    iget-object v0, v2, LN/p0;->h:LP/d;

    .line 100
    .line 101
    invoke-virtual {v0}, LP/d;->e()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 102
    .line 103
    .line 104
    :try_start_3
    monitor-exit v11

    .line 105
    invoke-virtual {v8}, Lx/r;->b()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v9}, Lx/r;->b()V

    .line 109
    .line 110
    .line 111
    :goto_2
    move-object v0, v3

    .line 112
    check-cast v0, Ljava/util/Collection;

    .line 113
    .line 114
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    const/4 v11, 0x0

    .line 119
    if-eqz v0, :cond_12

    .line 120
    .line 121
    move-object v0, v4

    .line 122
    check-cast v0, Ljava/util/Collection;

    .line 123
    .line 124
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-nez v0, :cond_3

    .line 129
    .line 130
    goto/16 :goto_19

    .line 131
    .line 132
    :cond_3
    move-object v0, v5

    .line 133
    check-cast v0, Ljava/util/Collection;

    .line 134
    .line 135
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 139
    if-nez v0, :cond_6

    .line 140
    .line 141
    :try_start_4
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    const/4 v10, 0x0

    .line 146
    :goto_3
    if-ge v10, v0, :cond_4

    .line 147
    .line 148
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v12

    .line 152
    check-cast v12, LN/s;

    .line 153
    .line 154
    invoke-virtual {v7, v12}, Lx/r;->a(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    add-int/lit8 v10, v10, 0x1

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :catchall_2
    move-exception v0

    .line 161
    goto :goto_6

    .line 162
    :catch_0
    move-exception v0

    .line 163
    goto :goto_5

    .line 164
    :cond_4
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    const/4 v10, 0x0

    .line 169
    :goto_4
    if-ge v10, v0, :cond_5

    .line 170
    .line 171
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v12

    .line 175
    check-cast v12, LN/s;

    .line 176
    .line 177
    invoke-virtual {v12}, LN/s;->f()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 178
    .line 179
    .line 180
    add-int/lit8 v10, v10, 0x1

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_5
    :try_start_5
    invoke-interface {v5}, Ljava/util/List;->clear()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 184
    .line 185
    .line 186
    goto :goto_7

    .line 187
    :catchall_3
    move-exception v0

    .line 188
    goto/16 :goto_28

    .line 189
    .line 190
    :goto_5
    :try_start_6
    invoke-virtual {v2, v0, v11}, LN/p0;->E(Ljava/lang/Exception;LN/s;)V

    .line 191
    .line 192
    .line 193
    invoke-static/range {v2 .. v9}, LN/o0;->d(LN/p0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lx/r;Lx/r;Lx/r;Lx/r;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 194
    .line 195
    .line 196
    :try_start_7
    invoke-interface {v5}, Ljava/util/List;->clear()V

    .line 197
    .line 198
    .line 199
    goto/16 :goto_18

    .line 200
    .line 201
    :goto_6
    invoke-interface {v5}, Ljava/util/List;->clear()V

    .line 202
    .line 203
    .line 204
    throw v0

    .line 205
    :cond_6
    :goto_7
    invoke-virtual {v6}, Lx/r;->h()Z

    .line 206
    .line 207
    .line 208
    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 209
    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    const/16 v18, 0x7

    .line 215
    .line 216
    const/16 v10, 0x8

    .line 217
    .line 218
    if-eqz v0, :cond_c

    .line 219
    .line 220
    :try_start_8
    invoke-virtual {v7, v6}, Lx/r;->i(Lx/r;)V

    .line 221
    .line 222
    .line 223
    iget-object v0, v6, Lx/r;->b:[Ljava/lang/Object;

    .line 224
    .line 225
    const-wide/16 v19, 0x80

    .line 226
    .line 227
    iget-object v12, v6, Lx/r;->a:[J

    .line 228
    .line 229
    array-length v13, v12

    .line 230
    add-int/lit8 v13, v13, -0x2

    .line 231
    .line 232
    if-ltz v13, :cond_a

    .line 233
    .line 234
    move-object/from16 v23, v12

    .line 235
    .line 236
    const/4 v14, 0x0

    .line 237
    const-wide/16 v21, 0xff

    .line 238
    .line 239
    :goto_8
    aget-wide v11, v23, v14

    .line 240
    .line 241
    move-object/from16 v24, v0

    .line 242
    .line 243
    not-long v0, v11

    .line 244
    shl-long v0, v0, v18

    .line 245
    .line 246
    and-long/2addr v0, v11

    .line 247
    and-long v0, v0, v16

    .line 248
    .line 249
    cmp-long v0, v0, v16

    .line 250
    .line 251
    if-eqz v0, :cond_9

    .line 252
    .line 253
    sub-int v0, v14, v13

    .line 254
    .line 255
    not-int v0, v0

    .line 256
    ushr-int/lit8 v0, v0, 0x1f

    .line 257
    .line 258
    rsub-int/lit8 v0, v0, 0x8

    .line 259
    .line 260
    const/4 v1, 0x0

    .line 261
    :goto_9
    if-ge v1, v0, :cond_8

    .line 262
    .line 263
    and-long v25, v11, v21

    .line 264
    .line 265
    cmp-long v25, v25, v19

    .line 266
    .line 267
    if-gez v25, :cond_7

    .line 268
    .line 269
    shl-int/lit8 v25, v14, 0x3

    .line 270
    .line 271
    add-int v25, v25, v1

    .line 272
    .line 273
    aget-object v25, v24, v25

    .line 274
    .line 275
    check-cast v25, LN/s;

    .line 276
    .line 277
    invoke-virtual/range {v25 .. v25}, LN/s;->h()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 278
    .line 279
    .line 280
    goto :goto_b

    .line 281
    :goto_a
    const/4 v15, 0x0

    .line 282
    goto :goto_c

    .line 283
    :catchall_4
    move-exception v0

    .line 284
    goto :goto_d

    .line 285
    :catch_1
    move-exception v0

    .line 286
    goto :goto_a

    .line 287
    :cond_7
    :goto_b
    shr-long/2addr v11, v10

    .line 288
    add-int/lit8 v1, v1, 0x1

    .line 289
    .line 290
    goto :goto_9

    .line 291
    :cond_8
    if-ne v0, v10, :cond_b

    .line 292
    .line 293
    :cond_9
    if-eq v14, v13, :cond_b

    .line 294
    .line 295
    add-int/lit8 v14, v14, 0x1

    .line 296
    .line 297
    move-object/from16 v1, p0

    .line 298
    .line 299
    move-object/from16 v0, v24

    .line 300
    .line 301
    goto :goto_8

    .line 302
    :cond_a
    const-wide/16 v21, 0xff

    .line 303
    .line 304
    :cond_b
    :try_start_9
    invoke-virtual {v6}, Lx/r;->b()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 305
    .line 306
    .line 307
    goto :goto_e

    .line 308
    :goto_c
    :try_start_a
    invoke-virtual {v2, v0, v15}, LN/p0;->E(Ljava/lang/Exception;LN/s;)V

    .line 309
    .line 310
    .line 311
    invoke-static/range {v2 .. v9}, LN/o0;->d(LN/p0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lx/r;Lx/r;Lx/r;Lx/r;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 312
    .line 313
    .line 314
    :try_start_b
    invoke-virtual {v6}, Lx/r;->b()V

    .line 315
    .line 316
    .line 317
    goto/16 :goto_18

    .line 318
    .line 319
    :goto_d
    invoke-virtual {v6}, Lx/r;->b()V

    .line 320
    .line 321
    .line 322
    throw v0

    .line 323
    :cond_c
    const-wide/16 v19, 0x80

    .line 324
    .line 325
    const-wide/16 v21, 0xff

    .line 326
    .line 327
    :goto_e
    invoke-virtual {v7}, Lx/r;->h()Z

    .line 328
    .line 329
    .line 330
    move-result v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 331
    if-eqz v0, :cond_11

    .line 332
    .line 333
    :try_start_c
    iget-object v0, v7, Lx/r;->b:[Ljava/lang/Object;

    .line 334
    .line 335
    iget-object v1, v7, Lx/r;->a:[J

    .line 336
    .line 337
    array-length v11, v1

    .line 338
    add-int/lit8 v11, v11, -0x2

    .line 339
    .line 340
    if-ltz v11, :cond_10

    .line 341
    .line 342
    const/4 v12, 0x0

    .line 343
    :goto_f
    aget-wide v13, v1, v12

    .line 344
    .line 345
    move/from16 v23, v10

    .line 346
    .line 347
    move/from16 v24, v11

    .line 348
    .line 349
    not-long v10, v13

    .line 350
    shl-long v10, v10, v18

    .line 351
    .line 352
    and-long/2addr v10, v13

    .line 353
    and-long v10, v10, v16

    .line 354
    .line 355
    cmp-long v10, v10, v16

    .line 356
    .line 357
    if-eqz v10, :cond_f

    .line 358
    .line 359
    sub-int v10, v12, v24

    .line 360
    .line 361
    not-int v10, v10

    .line 362
    ushr-int/lit8 v10, v10, 0x1f

    .line 363
    .line 364
    rsub-int/lit8 v10, v10, 0x8

    .line 365
    .line 366
    const/4 v11, 0x0

    .line 367
    :goto_10
    if-ge v11, v10, :cond_e

    .line 368
    .line 369
    and-long v25, v13, v21

    .line 370
    .line 371
    cmp-long v25, v25, v19

    .line 372
    .line 373
    if-gez v25, :cond_d

    .line 374
    .line 375
    shl-int/lit8 v25, v12, 0x3

    .line 376
    .line 377
    add-int v25, v25, v11

    .line 378
    .line 379
    aget-object v25, v0, v25

    .line 380
    .line 381
    check-cast v25, LN/s;

    .line 382
    .line 383
    invoke-virtual/range {v25 .. v25}, LN/s;->i()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_2
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 384
    .line 385
    .line 386
    goto :goto_12

    .line 387
    :goto_11
    const/4 v15, 0x0

    .line 388
    goto :goto_15

    .line 389
    :catchall_5
    move-exception v0

    .line 390
    goto :goto_16

    .line 391
    :catch_2
    move-exception v0

    .line 392
    goto :goto_11

    .line 393
    :cond_d
    :goto_12
    shr-long v13, v13, v23

    .line 394
    .line 395
    add-int/lit8 v11, v11, 0x1

    .line 396
    .line 397
    goto :goto_10

    .line 398
    :cond_e
    move/from16 v11, v23

    .line 399
    .line 400
    if-ne v10, v11, :cond_10

    .line 401
    .line 402
    :goto_13
    move/from16 v10, v24

    .line 403
    .line 404
    goto :goto_14

    .line 405
    :cond_f
    move/from16 v11, v23

    .line 406
    .line 407
    goto :goto_13

    .line 408
    :goto_14
    if-eq v12, v10, :cond_10

    .line 409
    .line 410
    add-int/lit8 v12, v12, 0x1

    .line 411
    .line 412
    move/from16 v27, v11

    .line 413
    .line 414
    move v11, v10

    .line 415
    move/from16 v10, v27

    .line 416
    .line 417
    goto :goto_f

    .line 418
    :cond_10
    :try_start_d
    invoke-virtual {v7}, Lx/r;->b()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 419
    .line 420
    .line 421
    goto :goto_17

    .line 422
    :goto_15
    :try_start_e
    invoke-virtual {v2, v0, v15}, LN/p0;->E(Ljava/lang/Exception;LN/s;)V

    .line 423
    .line 424
    .line 425
    invoke-static/range {v2 .. v9}, LN/o0;->d(LN/p0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lx/r;Lx/r;Lx/r;Lx/r;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 426
    .line 427
    .line 428
    :try_start_f
    invoke-virtual {v7}, Lx/r;->b()V

    .line 429
    .line 430
    .line 431
    goto :goto_18

    .line 432
    :goto_16
    invoke-virtual {v7}, Lx/r;->b()V

    .line 433
    .line 434
    .line 435
    throw v0

    .line 436
    :cond_11
    :goto_17
    iget-object v1, v2, LN/p0;->b:Ljava/lang/Object;

    .line 437
    .line 438
    monitor-enter v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 439
    :try_start_10
    invoke-virtual {v2}, LN/p0;->x()LEf/l;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    .line 440
    .line 441
    .line 442
    :try_start_11
    monitor-exit v1

    .line 443
    invoke-static {}, LX/m;->k()LX/g;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-virtual {v0}, LX/g;->m()V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v9}, Lx/r;->b()V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v8}, Lx/r;->b()V

    .line 454
    .line 455
    .line 456
    const/4 v15, 0x0

    .line 457
    iput-object v15, v2, LN/p0;->n:Ljava/util/LinkedHashSet;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    .line 458
    .line 459
    :goto_18
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 460
    .line 461
    .line 462
    goto/16 :goto_25

    .line 463
    .line 464
    :catchall_6
    move-exception v0

    .line 465
    :try_start_12
    monitor-exit v1

    .line 466
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    .line 467
    :cond_12
    :goto_19
    :try_start_13
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 468
    .line 469
    .line 470
    move-result v0

    .line 471
    const/4 v1, 0x0

    .line 472
    :goto_1a
    if-ge v1, v0, :cond_14

    .line 473
    .line 474
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v11

    .line 478
    check-cast v11, LN/s;

    .line 479
    .line 480
    invoke-static {v2, v11, v8}, LN/p0;->s(LN/p0;LN/s;Lx/r;)LN/s;

    .line 481
    .line 482
    .line 483
    move-result-object v12

    .line 484
    if-eqz v12, :cond_13

    .line 485
    .line 486
    move-object v13, v5

    .line 487
    check-cast v13, Ljava/util/Collection;

    .line 488
    .line 489
    invoke-interface {v13, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    goto :goto_1b

    .line 493
    :catchall_7
    move-exception v0

    .line 494
    goto/16 :goto_26

    .line 495
    .line 496
    :catch_3
    move-exception v0

    .line 497
    const/4 v15, 0x0

    .line 498
    goto/16 :goto_24

    .line 499
    .line 500
    :cond_13
    :goto_1b
    invoke-virtual {v9, v11}, Lx/r;->a(Ljava/lang/Object;)Z
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_3
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    .line 501
    .line 502
    .line 503
    add-int/lit8 v1, v1, 0x1

    .line 504
    .line 505
    goto :goto_1a

    .line 506
    :cond_14
    :try_start_14
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v8}, Lx/r;->h()Z

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    if-nez v0, :cond_15

    .line 514
    .line 515
    iget-object v0, v2, LN/p0;->h:LP/d;

    .line 516
    .line 517
    invoke-virtual {v0}, LP/d;->j()Z

    .line 518
    .line 519
    .line 520
    move-result v0

    .line 521
    if-eqz v0, :cond_1b

    .line 522
    .line 523
    :cond_15
    iget-object v1, v2, LN/p0;->b:Ljava/lang/Object;

    .line 524
    .line 525
    monitor-enter v1
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    .line 526
    :try_start_15
    invoke-virtual {v2}, LN/p0;->A()Ljava/util/List;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 531
    .line 532
    .line 533
    move-result v11

    .line 534
    const/4 v12, 0x0

    .line 535
    :goto_1c
    if-ge v12, v11, :cond_17

    .line 536
    .line 537
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v13

    .line 541
    check-cast v13, LN/s;

    .line 542
    .line 543
    invoke-virtual {v9, v13}, Lx/r;->c(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v14

    .line 547
    if-nez v14, :cond_16

    .line 548
    .line 549
    invoke-virtual {v13, v10}, LN/s;->s(Ljava/util/Set;)Z

    .line 550
    .line 551
    .line 552
    move-result v14

    .line 553
    if-eqz v14, :cond_16

    .line 554
    .line 555
    move-object v14, v3

    .line 556
    check-cast v14, Ljava/util/Collection;

    .line 557
    .line 558
    invoke-interface {v14, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    goto :goto_1d

    .line 562
    :catchall_8
    move-exception v0

    .line 563
    goto/16 :goto_23

    .line 564
    .line 565
    :cond_16
    :goto_1d
    add-int/lit8 v12, v12, 0x1

    .line 566
    .line 567
    goto :goto_1c

    .line 568
    :cond_17
    iget-object v0, v2, LN/p0;->h:LP/d;

    .line 569
    .line 570
    iget v11, v0, LP/d;->c:I

    .line 571
    .line 572
    const/4 v12, 0x0

    .line 573
    const/4 v13, 0x0

    .line 574
    :goto_1e
    if-ge v12, v11, :cond_1a

    .line 575
    .line 576
    iget-object v14, v0, LP/d;->a:[Ljava/lang/Object;

    .line 577
    .line 578
    aget-object v14, v14, v12

    .line 579
    .line 580
    check-cast v14, LN/s;

    .line 581
    .line 582
    invoke-virtual {v9, v14}, Lx/r;->c(Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    move-result v16

    .line 586
    if-nez v16, :cond_18

    .line 587
    .line 588
    invoke-interface {v3, v14}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    move-result v16

    .line 592
    if-nez v16, :cond_18

    .line 593
    .line 594
    move-object v15, v3

    .line 595
    check-cast v15, Ljava/util/Collection;

    .line 596
    .line 597
    invoke-interface {v15, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    add-int/lit8 v13, v13, 0x1

    .line 601
    .line 602
    goto :goto_1f

    .line 603
    :cond_18
    if-lez v13, :cond_19

    .line 604
    .line 605
    iget-object v14, v0, LP/d;->a:[Ljava/lang/Object;

    .line 606
    .line 607
    sub-int v15, v12, v13

    .line 608
    .line 609
    aget-object v17, v14, v12

    .line 610
    .line 611
    aput-object v17, v14, v15

    .line 612
    .line 613
    :cond_19
    :goto_1f
    add-int/lit8 v12, v12, 0x1

    .line 614
    .line 615
    goto :goto_1e

    .line 616
    :cond_1a
    iget-object v12, v0, LP/d;->a:[Ljava/lang/Object;

    .line 617
    .line 618
    sub-int v13, v11, v13

    .line 619
    .line 620
    const/4 v15, 0x0

    .line 621
    invoke-static {v12, v13, v11, v15}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 622
    .line 623
    .line 624
    iput v13, v0, LP/d;->c:I
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_8

    .line 625
    .line 626
    :try_start_16
    monitor-exit v1

    .line 627
    :cond_1b
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 628
    .line 629
    .line 630
    move-result v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_3

    .line 631
    if-eqz v0, :cond_1d

    .line 632
    .line 633
    :try_start_17
    invoke-static {v4, v2}, LN/o0;->e(Ljava/util/List;LN/p0;)V

    .line 634
    .line 635
    .line 636
    :goto_20
    move-object v0, v4

    .line 637
    check-cast v0, Ljava/util/Collection;

    .line 638
    .line 639
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 640
    .line 641
    .line 642
    move-result v0

    .line 643
    if-nez v0, :cond_1d

    .line 644
    .line 645
    invoke-virtual {v2, v4, v8}, LN/p0;->D(Ljava/util/List;Lx/r;)Ljava/util/List;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    check-cast v0, Ljava/lang/Iterable;

    .line 650
    .line 651
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 652
    .line 653
    .line 654
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    :goto_21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 659
    .line 660
    .line 661
    move-result v1

    .line 662
    if-eqz v1, :cond_1c

    .line 663
    .line 664
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    invoke-virtual {v6, v1}, Lx/r;->d(Ljava/lang/Object;)I

    .line 669
    .line 670
    .line 671
    move-result v11

    .line 672
    iget-object v12, v6, Lx/r;->b:[Ljava/lang/Object;

    .line 673
    .line 674
    aput-object v1, v12, v11

    .line 675
    .line 676
    goto :goto_21

    .line 677
    :cond_1c
    invoke-static {v4, v2}, LN/o0;->e(Ljava/util/List;LN/p0;)V
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_4
    .catchall {:try_start_17 .. :try_end_17} :catchall_3

    .line 678
    .line 679
    .line 680
    goto :goto_20

    .line 681
    :catch_4
    move-exception v0

    .line 682
    const/4 v15, 0x0

    .line 683
    goto :goto_22

    .line 684
    :cond_1d
    move-object/from16 v1, p0

    .line 685
    .line 686
    goto/16 :goto_2

    .line 687
    .line 688
    :goto_22
    :try_start_18
    invoke-virtual {v2, v0, v15}, LN/p0;->E(Ljava/lang/Exception;LN/s;)V

    .line 689
    .line 690
    .line 691
    invoke-static/range {v2 .. v9}, LN/o0;->d(LN/p0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lx/r;Lx/r;Lx/r;Lx/r;)V

    .line 692
    .line 693
    .line 694
    goto/16 :goto_18

    .line 695
    .line 696
    :goto_23
    monitor-exit v1

    .line 697
    throw v0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_3

    .line 698
    :goto_24
    :try_start_19
    invoke-virtual {v2, v0, v15}, LN/p0;->E(Ljava/lang/Exception;LN/s;)V

    .line 699
    .line 700
    .line 701
    invoke-static/range {v2 .. v9}, LN/o0;->d(LN/p0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lx/r;Lx/r;Lx/r;Lx/r;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_7

    .line 702
    .line 703
    .line 704
    :try_start_1a
    invoke-interface {v3}, Ljava/util/List;->clear()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_3

    .line 705
    .line 706
    .line 707
    goto/16 :goto_18

    .line 708
    .line 709
    :goto_25
    sget-object v0, Lef/C;->a:Lef/C;

    .line 710
    .line 711
    return-object v0

    .line 712
    :goto_26
    :try_start_1b
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 713
    .line 714
    .line 715
    throw v0

    .line 716
    :goto_27
    monitor-exit v11

    .line 717
    throw v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_3

    .line 718
    :goto_28
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 719
    .line 720
    .line 721
    throw v0
.end method
