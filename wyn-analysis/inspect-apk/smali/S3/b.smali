.class public final LS3/b;
.super Lk3/e;
.source "SourceFile"


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lk3/m;I)V
    .locals 0

    .line 1
    iput p2, p0, LS3/b;->d:I

    invoke-direct {p0, p1}, LE9/c;-><init>(Lk3/m;)V

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, LS3/b;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)"

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    const-string v0, "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_1
    const-string v0, "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)"

    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_2
    const-string v0, "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)"

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_3
    const-string v0, "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)"

    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_4
    const-string v0, "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)"

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_5
    const-string v0, "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)"

    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final w(Lo3/g;Ljava/lang/Object;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget v2, v1, LS3/b;->d:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p2

    .line 11
    .line 12
    check-cast v2, LS3/r;

    .line 13
    .line 14
    iget-object v3, v2, LS3/r;->a:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    invoke-interface {v0, v4}, Lo3/e;->N(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-interface {v0, v4, v3}, Lo3/e;->x(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    iget-object v2, v2, LS3/r;->b:Ljava/lang/String;

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    invoke-interface {v0, v3, v2}, Lo3/e;->x(ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    move-object/from16 v2, p2

    .line 34
    .line 35
    check-cast v2, LS3/p;

    .line 36
    .line 37
    iget-object v3, v2, LS3/p;->a:Ljava/lang/String;

    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    if-nez v3, :cond_1

    .line 41
    .line 42
    invoke-interface {v0, v4}, Lo3/e;->N(I)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-interface {v0, v4, v3}, Lo3/e;->x(ILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :goto_1
    iget v3, v2, LS3/p;->b:I

    .line 50
    .line 51
    invoke-static {v3}, LFe/e;->T(I)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    int-to-long v5, v3

    .line 56
    const/4 v3, 0x2

    .line 57
    invoke-interface {v0, v3, v5, v6}, Lo3/e;->G(IJ)V

    .line 58
    .line 59
    .line 60
    iget-object v5, v2, LS3/p;->c:Ljava/lang/String;

    .line 61
    .line 62
    const/4 v6, 0x3

    .line 63
    if-nez v5, :cond_2

    .line 64
    .line 65
    invoke-interface {v0, v6}, Lo3/e;->N(I)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    invoke-interface {v0, v6, v5}, Lo3/e;->x(ILjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :goto_2
    iget-object v5, v2, LS3/p;->d:Ljava/lang/String;

    .line 73
    .line 74
    const/4 v7, 0x4

    .line 75
    if-nez v5, :cond_3

    .line 76
    .line 77
    invoke-interface {v0, v7}, Lo3/e;->N(I)V

    .line 78
    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_3
    invoke-interface {v0, v7, v5}, Lo3/e;->x(ILjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_3
    iget-object v5, v2, LS3/p;->e:LJ3/h;

    .line 85
    .line 86
    invoke-static {v5}, LJ3/h;->c(LJ3/h;)[B

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    const/4 v8, 0x5

    .line 91
    if-nez v5, :cond_4

    .line 92
    .line 93
    invoke-interface {v0, v8}, Lo3/e;->N(I)V

    .line 94
    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_4
    invoke-interface {v0, v8, v5}, Lo3/e;->H(I[B)V

    .line 98
    .line 99
    .line 100
    :goto_4
    iget-object v5, v2, LS3/p;->f:LJ3/h;

    .line 101
    .line 102
    invoke-static {v5}, LJ3/h;->c(LJ3/h;)[B

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    const/4 v9, 0x6

    .line 107
    if-nez v5, :cond_5

    .line 108
    .line 109
    invoke-interface {v0, v9}, Lo3/e;->N(I)V

    .line 110
    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_5
    invoke-interface {v0, v9, v5}, Lo3/e;->H(I[B)V

    .line 114
    .line 115
    .line 116
    :goto_5
    const/4 v5, 0x7

    .line 117
    iget-wide v10, v2, LS3/p;->g:J

    .line 118
    .line 119
    invoke-interface {v0, v5, v10, v11}, Lo3/e;->G(IJ)V

    .line 120
    .line 121
    .line 122
    const/16 v5, 0x8

    .line 123
    .line 124
    iget-wide v10, v2, LS3/p;->h:J

    .line 125
    .line 126
    invoke-interface {v0, v5, v10, v11}, Lo3/e;->G(IJ)V

    .line 127
    .line 128
    .line 129
    const/16 v5, 0x9

    .line 130
    .line 131
    iget-wide v10, v2, LS3/p;->i:J

    .line 132
    .line 133
    invoke-interface {v0, v5, v10, v11}, Lo3/e;->G(IJ)V

    .line 134
    .line 135
    .line 136
    iget v5, v2, LS3/p;->k:I

    .line 137
    .line 138
    int-to-long v10, v5

    .line 139
    const/16 v5, 0xa

    .line 140
    .line 141
    invoke-interface {v0, v5, v10, v11}, Lo3/e;->G(IJ)V

    .line 142
    .line 143
    .line 144
    iget v5, v2, LS3/p;->l:I

    .line 145
    .line 146
    const-string v10, "backoffPolicy"

    .line 147
    .line 148
    invoke-static {v5, v10}, Lka/n;->m(ILjava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-static {v5}, LA/f;->f(I)I

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-eqz v5, :cond_7

    .line 156
    .line 157
    if-ne v5, v4, :cond_6

    .line 158
    .line 159
    move v5, v4

    .line 160
    goto :goto_6

    .line 161
    :cond_6
    new-instance v0, LE5/Q;

    .line 162
    .line 163
    const/16 v2, 0x9

    .line 164
    .line 165
    const/4 v3, 0x0

    .line 166
    invoke-direct {v0, v3, v2}, LE5/Q;-><init>(BI)V

    .line 167
    .line 168
    .line 169
    throw v0

    .line 170
    :cond_7
    const/4 v5, 0x0

    .line 171
    :goto_6
    const/16 v11, 0xb

    .line 172
    .line 173
    int-to-long v12, v5

    .line 174
    invoke-interface {v0, v11, v12, v13}, Lo3/e;->G(IJ)V

    .line 175
    .line 176
    .line 177
    const/16 v5, 0xc

    .line 178
    .line 179
    iget-wide v11, v2, LS3/p;->m:J

    .line 180
    .line 181
    invoke-interface {v0, v5, v11, v12}, Lo3/e;->G(IJ)V

    .line 182
    .line 183
    .line 184
    const/16 v5, 0xd

    .line 185
    .line 186
    iget-wide v11, v2, LS3/p;->n:J

    .line 187
    .line 188
    invoke-interface {v0, v5, v11, v12}, Lo3/e;->G(IJ)V

    .line 189
    .line 190
    .line 191
    const/16 v5, 0xe

    .line 192
    .line 193
    iget-wide v11, v2, LS3/p;->o:J

    .line 194
    .line 195
    invoke-interface {v0, v5, v11, v12}, Lo3/e;->G(IJ)V

    .line 196
    .line 197
    .line 198
    const/16 v5, 0xf

    .line 199
    .line 200
    iget-wide v11, v2, LS3/p;->p:J

    .line 201
    .line 202
    invoke-interface {v0, v5, v11, v12}, Lo3/e;->G(IJ)V

    .line 203
    .line 204
    .line 205
    iget-boolean v5, v2, LS3/p;->q:Z

    .line 206
    .line 207
    const/16 v11, 0x10

    .line 208
    .line 209
    int-to-long v12, v5

    .line 210
    invoke-interface {v0, v11, v12, v13}, Lo3/e;->G(IJ)V

    .line 211
    .line 212
    .line 213
    iget v5, v2, LS3/p;->r:I

    .line 214
    .line 215
    const-string v11, "policy"

    .line 216
    .line 217
    invoke-static {v5, v11}, Lka/n;->m(ILjava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-static {v5}, LA/f;->f(I)I

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    if-eqz v5, :cond_9

    .line 225
    .line 226
    if-ne v5, v4, :cond_8

    .line 227
    .line 228
    move v5, v4

    .line 229
    goto :goto_7

    .line 230
    :cond_8
    new-instance v0, LE5/Q;

    .line 231
    .line 232
    const/16 v2, 0x9

    .line 233
    .line 234
    const/4 v3, 0x0

    .line 235
    invoke-direct {v0, v3, v2}, LE5/Q;-><init>(BI)V

    .line 236
    .line 237
    .line 238
    throw v0

    .line 239
    :cond_9
    const/4 v5, 0x0

    .line 240
    :goto_7
    const/16 v11, 0x11

    .line 241
    .line 242
    int-to-long v12, v5

    .line 243
    invoke-interface {v0, v11, v12, v13}, Lo3/e;->G(IJ)V

    .line 244
    .line 245
    .line 246
    iget v5, v2, LS3/p;->s:I

    .line 247
    .line 248
    int-to-long v11, v5

    .line 249
    const/16 v5, 0x12

    .line 250
    .line 251
    invoke-interface {v0, v5, v11, v12}, Lo3/e;->G(IJ)V

    .line 252
    .line 253
    .line 254
    iget v5, v2, LS3/p;->t:I

    .line 255
    .line 256
    int-to-long v11, v5

    .line 257
    const/16 v5, 0x13

    .line 258
    .line 259
    invoke-interface {v0, v5, v11, v12}, Lo3/e;->G(IJ)V

    .line 260
    .line 261
    .line 262
    iget-object v2, v2, LS3/p;->j:LJ3/d;

    .line 263
    .line 264
    const/16 v12, 0x19

    .line 265
    .line 266
    const/16 v13, 0x18

    .line 267
    .line 268
    const/16 v14, 0x17

    .line 269
    .line 270
    const/16 v15, 0x16

    .line 271
    .line 272
    const/16 v8, 0x15

    .line 273
    .line 274
    const/16 v5, 0x14

    .line 275
    .line 276
    if-eqz v2, :cond_12

    .line 277
    .line 278
    const-string v10, "networkType"

    .line 279
    .line 280
    iget v11, v2, LJ3/d;->a:I

    .line 281
    .line 282
    invoke-static {v11, v10}, Lka/n;->m(ILjava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-static {v11}, LA/f;->f(I)I

    .line 286
    .line 287
    .line 288
    move-result v10

    .line 289
    if-eqz v10, :cond_e

    .line 290
    .line 291
    if-eq v10, v4, :cond_f

    .line 292
    .line 293
    if-eq v10, v3, :cond_d

    .line 294
    .line 295
    if-eq v10, v6, :cond_c

    .line 296
    .line 297
    if-eq v10, v7, :cond_b

    .line 298
    .line 299
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 300
    .line 301
    const/16 v4, 0x1e

    .line 302
    .line 303
    if-lt v3, v4, :cond_a

    .line 304
    .line 305
    if-ne v11, v9, :cond_a

    .line 306
    .line 307
    const/4 v4, 0x5

    .line 308
    goto :goto_8

    .line 309
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 310
    .line 311
    new-instance v2, Ljava/lang/StringBuilder;

    .line 312
    .line 313
    const-string v3, "Could not convert "

    .line 314
    .line 315
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    invoke-static {v11}, LA7/p0;->A(I)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    const-string v3, " to int"

    .line 326
    .line 327
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    throw v0

    .line 338
    :cond_b
    move v4, v7

    .line 339
    goto :goto_8

    .line 340
    :cond_c
    move v4, v6

    .line 341
    goto :goto_8

    .line 342
    :cond_d
    move v4, v3

    .line 343
    goto :goto_8

    .line 344
    :cond_e
    const/4 v4, 0x0

    .line 345
    :cond_f
    :goto_8
    int-to-long v3, v4

    .line 346
    invoke-interface {v0, v5, v3, v4}, Lo3/e;->G(IJ)V

    .line 347
    .line 348
    .line 349
    iget-boolean v3, v2, LJ3/d;->b:Z

    .line 350
    .line 351
    int-to-long v3, v3

    .line 352
    invoke-interface {v0, v8, v3, v4}, Lo3/e;->G(IJ)V

    .line 353
    .line 354
    .line 355
    iget-boolean v3, v2, LJ3/d;->c:Z

    .line 356
    .line 357
    int-to-long v3, v3

    .line 358
    invoke-interface {v0, v15, v3, v4}, Lo3/e;->G(IJ)V

    .line 359
    .line 360
    .line 361
    iget-boolean v3, v2, LJ3/d;->d:Z

    .line 362
    .line 363
    int-to-long v3, v3

    .line 364
    invoke-interface {v0, v14, v3, v4}, Lo3/e;->G(IJ)V

    .line 365
    .line 366
    .line 367
    iget-boolean v3, v2, LJ3/d;->e:Z

    .line 368
    .line 369
    int-to-long v3, v3

    .line 370
    invoke-interface {v0, v13, v3, v4}, Lo3/e;->G(IJ)V

    .line 371
    .line 372
    .line 373
    iget-wide v3, v2, LJ3/d;->f:J

    .line 374
    .line 375
    invoke-interface {v0, v12, v3, v4}, Lo3/e;->G(IJ)V

    .line 376
    .line 377
    .line 378
    iget-wide v3, v2, LJ3/d;->g:J

    .line 379
    .line 380
    const/16 v5, 0x1a

    .line 381
    .line 382
    invoke-interface {v0, v5, v3, v4}, Lo3/e;->G(IJ)V

    .line 383
    .line 384
    .line 385
    const-string v3, "triggers"

    .line 386
    .line 387
    iget-object v2, v2, LJ3/d;->h:Ljava/util/Set;

    .line 388
    .line 389
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 393
    .line 394
    .line 395
    move-result v3

    .line 396
    if-eqz v3, :cond_10

    .line 397
    .line 398
    const/4 v3, 0x0

    .line 399
    new-array v2, v3, [B

    .line 400
    .line 401
    :goto_9
    const/16 v3, 0x1b

    .line 402
    .line 403
    goto :goto_b

    .line 404
    :cond_10
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    .line 405
    .line 406
    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 407
    .line 408
    .line 409
    :try_start_0
    new-instance v4, Ljava/io/ObjectOutputStream;

    .line 410
    .line 411
    invoke-direct {v4, v3}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 412
    .line 413
    .line 414
    :try_start_1
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 415
    .line 416
    .line 417
    move-result v5

    .line 418
    invoke-virtual {v4, v5}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 419
    .line 420
    .line 421
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 426
    .line 427
    .line 428
    move-result v5

    .line 429
    if-eqz v5, :cond_11

    .line 430
    .line 431
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v5

    .line 435
    check-cast v5, LJ3/c;

    .line 436
    .line 437
    iget-object v6, v5, LJ3/c;->a:Landroid/net/Uri;

    .line 438
    .line 439
    invoke-virtual {v6}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v6

    .line 443
    invoke-virtual {v4, v6}, Ljava/io/ObjectOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    iget-boolean v5, v5, LJ3/c;->b:Z

    .line 447
    .line 448
    invoke-virtual {v4, v5}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 449
    .line 450
    .line 451
    goto :goto_a

    .line 452
    :catchall_0
    move-exception v0

    .line 453
    move-object v2, v0

    .line 454
    goto :goto_d

    .line 455
    :cond_11
    :try_start_2
    invoke-virtual {v4}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 456
    .line 457
    .line 458
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    const-string v3, "outputStream.toByteArray()"

    .line 466
    .line 467
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    goto :goto_9

    .line 471
    :goto_b
    invoke-interface {v0, v3, v2}, Lo3/e;->H(I[B)V

    .line 472
    .line 473
    .line 474
    goto :goto_f

    .line 475
    :goto_c
    move-object v2, v0

    .line 476
    goto :goto_e

    .line 477
    :goto_d
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 478
    :catchall_1
    move-exception v0

    .line 479
    :try_start_4
    invoke-static {v4, v2}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 480
    .line 481
    .line 482
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 483
    :catchall_2
    move-exception v0

    .line 484
    goto :goto_c

    .line 485
    :goto_e
    :try_start_5
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 486
    :catchall_3
    move-exception v0

    .line 487
    invoke-static {v3, v2}, LBa/c;->n(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 488
    .line 489
    .line 490
    throw v0

    .line 491
    :cond_12
    invoke-interface {v0, v5}, Lo3/e;->N(I)V

    .line 492
    .line 493
    .line 494
    invoke-interface {v0, v8}, Lo3/e;->N(I)V

    .line 495
    .line 496
    .line 497
    invoke-interface {v0, v15}, Lo3/e;->N(I)V

    .line 498
    .line 499
    .line 500
    invoke-interface {v0, v14}, Lo3/e;->N(I)V

    .line 501
    .line 502
    .line 503
    invoke-interface {v0, v13}, Lo3/e;->N(I)V

    .line 504
    .line 505
    .line 506
    invoke-interface {v0, v12}, Lo3/e;->N(I)V

    .line 507
    .line 508
    .line 509
    const/16 v5, 0x1a

    .line 510
    .line 511
    invoke-interface {v0, v5}, Lo3/e;->N(I)V

    .line 512
    .line 513
    .line 514
    const/16 v3, 0x1b

    .line 515
    .line 516
    invoke-interface {v0, v3}, Lo3/e;->N(I)V

    .line 517
    .line 518
    .line 519
    :goto_f
    return-void

    .line 520
    :pswitch_1
    move-object/from16 v2, p2

    .line 521
    .line 522
    check-cast v2, LS3/m;

    .line 523
    .line 524
    iget-object v3, v2, LS3/m;->a:Ljava/lang/String;

    .line 525
    .line 526
    const/4 v4, 0x1

    .line 527
    if-nez v3, :cond_13

    .line 528
    .line 529
    invoke-interface {v0, v4}, Lo3/e;->N(I)V

    .line 530
    .line 531
    .line 532
    goto :goto_10

    .line 533
    :cond_13
    invoke-interface {v0, v4, v3}, Lo3/e;->x(ILjava/lang/String;)V

    .line 534
    .line 535
    .line 536
    :goto_10
    iget-object v2, v2, LS3/m;->b:LJ3/h;

    .line 537
    .line 538
    invoke-static {v2}, LJ3/h;->c(LJ3/h;)[B

    .line 539
    .line 540
    .line 541
    move-result-object v2

    .line 542
    const/4 v3, 0x2

    .line 543
    if-nez v2, :cond_14

    .line 544
    .line 545
    invoke-interface {v0, v3}, Lo3/e;->N(I)V

    .line 546
    .line 547
    .line 548
    goto :goto_11

    .line 549
    :cond_14
    invoke-interface {v0, v3, v2}, Lo3/e;->H(I[B)V

    .line 550
    .line 551
    .line 552
    :goto_11
    return-void

    .line 553
    :pswitch_2
    move-object/from16 v0, p2

    .line 554
    .line 555
    check-cast v0, LS3/k;

    .line 556
    .line 557
    const/4 v0, 0x0

    .line 558
    throw v0

    .line 559
    :pswitch_3
    move-object/from16 v2, p2

    .line 560
    .line 561
    check-cast v2, LS3/g;

    .line 562
    .line 563
    iget-object v3, v2, LS3/g;->a:Ljava/lang/String;

    .line 564
    .line 565
    const/4 v4, 0x1

    .line 566
    if-nez v3, :cond_15

    .line 567
    .line 568
    invoke-interface {v0, v4}, Lo3/e;->N(I)V

    .line 569
    .line 570
    .line 571
    goto :goto_12

    .line 572
    :cond_15
    invoke-interface {v0, v4, v3}, Lo3/e;->x(ILjava/lang/String;)V

    .line 573
    .line 574
    .line 575
    :goto_12
    iget v3, v2, LS3/g;->b:I

    .line 576
    .line 577
    int-to-long v3, v3

    .line 578
    const/4 v5, 0x2

    .line 579
    invoke-interface {v0, v5, v3, v4}, Lo3/e;->G(IJ)V

    .line 580
    .line 581
    .line 582
    iget v2, v2, LS3/g;->c:I

    .line 583
    .line 584
    int-to-long v2, v2

    .line 585
    const/4 v4, 0x3

    .line 586
    invoke-interface {v0, v4, v2, v3}, Lo3/e;->G(IJ)V

    .line 587
    .line 588
    .line 589
    return-void

    .line 590
    :pswitch_4
    move-object/from16 v2, p2

    .line 591
    .line 592
    check-cast v2, LS3/d;

    .line 593
    .line 594
    iget-object v3, v2, LS3/d;->a:Ljava/lang/String;

    .line 595
    .line 596
    const/4 v4, 0x1

    .line 597
    invoke-interface {v0, v4, v3}, Lo3/e;->x(ILjava/lang/String;)V

    .line 598
    .line 599
    .line 600
    iget-object v2, v2, LS3/d;->b:Ljava/lang/Long;

    .line 601
    .line 602
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 603
    .line 604
    .line 605
    move-result-wide v2

    .line 606
    const/4 v4, 0x2

    .line 607
    invoke-interface {v0, v4, v2, v3}, Lo3/e;->G(IJ)V

    .line 608
    .line 609
    .line 610
    return-void

    .line 611
    :pswitch_5
    move-object/from16 v2, p2

    .line 612
    .line 613
    check-cast v2, LS3/a;

    .line 614
    .line 615
    iget-object v3, v2, LS3/a;->a:Ljava/lang/String;

    .line 616
    .line 617
    const/4 v4, 0x1

    .line 618
    invoke-interface {v0, v4, v3}, Lo3/e;->x(ILjava/lang/String;)V

    .line 619
    .line 620
    .line 621
    const/4 v3, 0x2

    .line 622
    iget-object v2, v2, LS3/a;->b:Ljava/lang/String;

    .line 623
    .line 624
    if-nez v2, :cond_16

    .line 625
    .line 626
    invoke-interface {v0, v3}, Lo3/e;->N(I)V

    .line 627
    .line 628
    .line 629
    goto :goto_13

    .line 630
    :cond_16
    invoke-interface {v0, v3, v2}, Lo3/e;->x(ILjava/lang/String;)V

    .line 631
    .line 632
    .line 633
    :goto_13
    return-void

    .line 634
    nop

    .line 635
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
