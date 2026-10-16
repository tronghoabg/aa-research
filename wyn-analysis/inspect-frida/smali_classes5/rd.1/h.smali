.class public final Lrd/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final a:Lcg/B;

.field public final b:Lrd/f;

.field public final c:Lrd/c;


# direct methods
.method public constructor <init>(Lcg/B;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrd/h;->a:Lcg/B;

    .line 5
    .line 6
    new-instance v0, Lrd/f;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lrd/f;-><init>(Lcg/B;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lrd/h;->b:Lrd/f;

    .line 12
    .line 13
    new-instance p1, Lrd/c;

    .line 14
    .line 15
    invoke-direct {p1, v0}, Lrd/c;-><init>(Lrd/f;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lrd/h;->c:Lrd/c;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(LA7/p1;)Z
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    :try_start_0
    iget-object v4, v1, Lrd/h;->a:Lcg/B;

    .line 8
    .line 9
    const-wide/16 v5, 0x9

    .line 10
    .line 11
    invoke-virtual {v4, v5, v6}, Lcg/B;->require(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    iget-object v4, v1, Lrd/h;->a:Lcg/B;

    .line 15
    .line 16
    invoke-static {v4}, Lrd/j;->a(Lcg/B;)I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    const/4 v5, 0x0

    .line 21
    if-ltz v4, :cond_16

    .line 22
    .line 23
    const/16 v6, 0x4000

    .line 24
    .line 25
    if-gt v4, v6, :cond_16

    .line 26
    .line 27
    iget-object v6, v1, Lrd/h;->a:Lcg/B;

    .line 28
    .line 29
    invoke-virtual {v6}, Lcg/B;->readByte()B

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    and-int/lit16 v6, v6, 0xff

    .line 34
    .line 35
    int-to-byte v6, v6

    .line 36
    iget-object v7, v1, Lrd/h;->a:Lcg/B;

    .line 37
    .line 38
    invoke-virtual {v7}, Lcg/B;->readByte()B

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    and-int/lit16 v7, v7, 0xff

    .line 43
    .line 44
    int-to-byte v7, v7

    .line 45
    iget-object v8, v1, Lrd/h;->a:Lcg/B;

    .line 46
    .line 47
    invoke-virtual {v8}, Lcg/B;->readInt()I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    const v9, 0x7fffffff

    .line 52
    .line 53
    .line 54
    and-int v11, v8, v9

    .line 55
    .line 56
    sget-object v8, Lrd/j;->a:Ljava/util/logging/Logger;

    .line 57
    .line 58
    sget-object v9, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 59
    .line 60
    invoke-virtual {v8, v9}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    if-eqz v9, :cond_0

    .line 65
    .line 66
    invoke-static {v3, v11, v4, v6, v7}, Lrd/g;->a(ZIIBB)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    invoke-virtual {v8, v9}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :cond_0
    const-wide/16 v8, 0x0

    .line 74
    .line 75
    packed-switch v6, :pswitch_data_0

    .line 76
    .line 77
    .line 78
    iget-object v0, v1, Lrd/h;->a:Lcg/B;

    .line 79
    .line 80
    int-to-long v4, v4

    .line 81
    invoke-virtual {v0, v4, v5}, Lcg/B;->skip(J)V

    .line 82
    .line 83
    .line 84
    return v3

    .line 85
    :pswitch_0
    const/4 v6, 0x4

    .line 86
    if-ne v4, v6, :cond_8

    .line 87
    .line 88
    iget-object v4, v1, Lrd/h;->a:Lcg/B;

    .line 89
    .line 90
    invoke-virtual {v4}, Lcg/B;->readInt()I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    int-to-long v6, v4

    .line 95
    const-wide/32 v12, 0x7fffffff

    .line 96
    .line 97
    .line 98
    and-long/2addr v6, v12

    .line 99
    cmp-long v4, v6, v8

    .line 100
    .line 101
    if-eqz v4, :cond_7

    .line 102
    .line 103
    iget-object v8, v0, LA7/p1;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v8, Lba/a;

    .line 106
    .line 107
    invoke-virtual {v8, v3, v11, v6, v7}, Lba/a;->G(IIJ)V

    .line 108
    .line 109
    .line 110
    if-nez v4, :cond_2

    .line 111
    .line 112
    const-string v2, "Received 0 flow control window increment."

    .line 113
    .line 114
    if-nez v11, :cond_1

    .line 115
    .line 116
    iget-object v0, v0, LA7/p1;->d:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Lpd/m;

    .line 119
    .line 120
    invoke-static {v0, v2}, Lpd/m;->g(Lpd/m;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return v3

    .line 124
    :cond_1
    iget-object v0, v0, LA7/p1;->d:Ljava/lang/Object;

    .line 125
    .line 126
    move-object v10, v0

    .line 127
    check-cast v10, Lpd/m;

    .line 128
    .line 129
    sget-object v0, Lmd/k0;->m:Lmd/k0;

    .line 130
    .line 131
    invoke-virtual {v0, v2}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    sget-object v13, Lod/s;->a:Lod/s;

    .line 136
    .line 137
    sget-object v15, Lrd/a;->c:Lrd/a;

    .line 138
    .line 139
    const/16 v16, 0x0

    .line 140
    .line 141
    const/4 v14, 0x0

    .line 142
    invoke-virtual/range {v10 .. v16}, Lpd/m;->j(ILmd/k0;Lod/s;ZLrd/a;Lmd/b0;)V

    .line 143
    .line 144
    .line 145
    return v3

    .line 146
    :cond_2
    iget-object v4, v0, LA7/p1;->d:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v4, Lpd/m;

    .line 149
    .line 150
    iget-object v4, v4, Lpd/m;->k:Ljava/lang/Object;

    .line 151
    .line 152
    monitor-enter v4

    .line 153
    if-nez v11, :cond_3

    .line 154
    .line 155
    :try_start_1
    iget-object v0, v0, LA7/p1;->d:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, Lpd/m;

    .line 158
    .line 159
    iget-object v0, v0, Lpd/m;->j:Lc7/l;

    .line 160
    .line 161
    long-to-int v2, v6

    .line 162
    invoke-virtual {v0, v5, v2}, Lc7/l;->h(Lpd/v;I)V

    .line 163
    .line 164
    .line 165
    monitor-exit v4

    .line 166
    return v3

    .line 167
    :catchall_0
    move-exception v0

    .line 168
    goto :goto_1

    .line 169
    :cond_3
    iget-object v5, v0, LA7/p1;->d:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v5, Lpd/m;

    .line 172
    .line 173
    iget-object v5, v5, Lpd/m;->n:Ljava/util/HashMap;

    .line 174
    .line 175
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    invoke-virtual {v5, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    check-cast v5, Lpd/k;

    .line 184
    .line 185
    if-eqz v5, :cond_4

    .line 186
    .line 187
    iget-object v8, v0, LA7/p1;->d:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v8, Lpd/m;

    .line 190
    .line 191
    iget-object v8, v8, Lpd/m;->j:Lc7/l;

    .line 192
    .line 193
    iget-object v5, v5, Lpd/k;->n:Lpd/j;

    .line 194
    .line 195
    invoke-virtual {v5}, Lpd/j;->o()Lpd/v;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    long-to-int v6, v6

    .line 200
    invoke-virtual {v8, v5, v6}, Lc7/l;->h(Lpd/v;I)V

    .line 201
    .line 202
    .line 203
    goto :goto_0

    .line 204
    :cond_4
    iget-object v5, v0, LA7/p1;->d:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v5, Lpd/m;

    .line 207
    .line 208
    invoke-virtual {v5, v11}, Lpd/m;->o(I)Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-nez v5, :cond_5

    .line 213
    .line 214
    move v2, v3

    .line 215
    :cond_5
    :goto_0
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 216
    if-eqz v2, :cond_6

    .line 217
    .line 218
    iget-object v0, v0, LA7/p1;->d:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v0, Lpd/m;

    .line 221
    .line 222
    new-instance v2, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    const-string v4, "Received window_update for unknown stream: "

    .line 225
    .line 226
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-static {v0, v2}, Lpd/m;->g(Lpd/m;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    :cond_6
    return v3

    .line 240
    :goto_1
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 241
    throw v0

    .line 242
    :cond_7
    const-string v0, "windowSizeIncrement was 0"

    .line 243
    .line 244
    new-array v2, v2, [Ljava/lang/Object;

    .line 245
    .line 246
    invoke-static {v0, v2}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    throw v5

    .line 250
    :cond_8
    const-string v0, "TYPE_WINDOW_UPDATE length !=4: %s"

    .line 251
    .line 252
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    new-array v3, v3, [Ljava/lang/Object;

    .line 257
    .line 258
    aput-object v4, v3, v2

    .line 259
    .line 260
    invoke-static {v0, v3}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    throw v5

    .line 264
    :pswitch_1
    const/16 v6, 0x8

    .line 265
    .line 266
    if-lt v4, v6, :cond_13

    .line 267
    .line 268
    if-nez v11, :cond_12

    .line 269
    .line 270
    iget-object v7, v1, Lrd/h;->a:Lcg/B;

    .line 271
    .line 272
    invoke-virtual {v7}, Lcg/B;->readInt()I

    .line 273
    .line 274
    .line 275
    move-result v10

    .line 276
    invoke-virtual {v7}, Lcg/B;->readInt()I

    .line 277
    .line 278
    .line 279
    move-result v11

    .line 280
    sub-int/2addr v4, v6

    .line 281
    invoke-static {}, Lrd/a;->values()[Lrd/a;

    .line 282
    .line 283
    .line 284
    move-result-object v6

    .line 285
    array-length v12, v6

    .line 286
    move v13, v2

    .line 287
    :goto_2
    if-ge v13, v12, :cond_a

    .line 288
    .line 289
    aget-object v14, v6, v13

    .line 290
    .line 291
    iget v15, v14, Lrd/a;->a:I

    .line 292
    .line 293
    if-ne v15, v11, :cond_9

    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_9
    add-int/2addr v13, v3

    .line 297
    goto :goto_2

    .line 298
    :cond_a
    move-object v14, v5

    .line 299
    :goto_3
    if-eqz v14, :cond_11

    .line 300
    .line 301
    sget-object v2, Lcg/j;->d:Lcg/j;

    .line 302
    .line 303
    if-lez v4, :cond_b

    .line 304
    .line 305
    int-to-long v11, v4

    .line 306
    invoke-virtual {v7, v11, v12}, Lcg/B;->a(J)Lcg/j;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    :cond_b
    iget-object v4, v0, LA7/p1;->b:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v4, Lba/a;

    .line 313
    .line 314
    invoke-virtual {v4, v3, v10, v14, v2}, Lba/a;->C(IILrd/a;Lcg/j;)V

    .line 315
    .line 316
    .line 317
    sget-object v4, Lrd/a;->l:Lrd/a;

    .line 318
    .line 319
    iget-object v6, v0, LA7/p1;->d:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v6, Lpd/m;

    .line 322
    .line 323
    if-ne v14, v4, :cond_c

    .line 324
    .line 325
    invoke-virtual {v2}, Lcg/j;->t()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    sget-object v7, Lpd/m;->Q:Ljava/util/logging/Logger;

    .line 330
    .line 331
    sget-object v11, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 332
    .line 333
    new-instance v12, Ljava/lang/StringBuilder;

    .line 334
    .line 335
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    const-string v0, ": Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: "

    .line 342
    .line 343
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-virtual {v7, v11, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    const-string v0, "too_many_pings"

    .line 357
    .line 358
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    if-eqz v0, :cond_c

    .line 363
    .line 364
    iget-object v0, v6, Lpd/m;->J:Lg5/d;

    .line 365
    .line 366
    invoke-virtual {v0}, Lg5/d;->run()V

    .line 367
    .line 368
    .line 369
    :cond_c
    iget v0, v14, Lrd/a;->a:I

    .line 370
    .line 371
    int-to-long v11, v0

    .line 372
    sget-object v0, Lod/Z;->d:[Lod/Z;

    .line 373
    .line 374
    array-length v4, v0

    .line 375
    int-to-long v13, v4

    .line 376
    cmp-long v4, v11, v13

    .line 377
    .line 378
    if-gez v4, :cond_e

    .line 379
    .line 380
    cmp-long v4, v11, v8

    .line 381
    .line 382
    if-gez v4, :cond_d

    .line 383
    .line 384
    goto :goto_4

    .line 385
    :cond_d
    long-to-int v4, v11

    .line 386
    aget-object v0, v0, v4

    .line 387
    .line 388
    goto :goto_5

    .line 389
    :cond_e
    :goto_4
    move-object v0, v5

    .line 390
    :goto_5
    if-nez v0, :cond_f

    .line 391
    .line 392
    sget-object v0, Lod/Z;->c:Lod/Z;

    .line 393
    .line 394
    iget-object v0, v0, Lod/Z;->b:Lmd/k0;

    .line 395
    .line 396
    iget-object v0, v0, Lmd/k0;->a:Lmd/j0;

    .line 397
    .line 398
    iget v0, v0, Lmd/j0;->a:I

    .line 399
    .line 400
    invoke-static {v0}, Lmd/k0;->d(I)Lmd/k0;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    new-instance v4, Ljava/lang/StringBuilder;

    .line 405
    .line 406
    const-string v7, "Unrecognized HTTP/2 error code: "

    .line 407
    .line 408
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v4, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    invoke-virtual {v0, v4}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    goto :goto_6

    .line 423
    :cond_f
    iget-object v0, v0, Lod/Z;->b:Lmd/k0;

    .line 424
    .line 425
    :goto_6
    const-string v4, "Received Goaway"

    .line 426
    .line 427
    invoke-virtual {v0, v4}, Lmd/k0;->b(Ljava/lang/String;)Lmd/k0;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    invoke-virtual {v2}, Lcg/j;->d()I

    .line 432
    .line 433
    .line 434
    move-result v4

    .line 435
    if-lez v4, :cond_10

    .line 436
    .line 437
    invoke-virtual {v2}, Lcg/j;->t()Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v2

    .line 441
    invoke-virtual {v0, v2}, Lmd/k0;->b(Ljava/lang/String;)Lmd/k0;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    :cond_10
    sget-object v2, Lpd/m;->P:Ljava/util/Map;

    .line 446
    .line 447
    invoke-virtual {v6, v10, v5, v0}, Lpd/m;->u(ILrd/a;Lmd/k0;)V

    .line 448
    .line 449
    .line 450
    return v3

    .line 451
    :cond_11
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    new-array v3, v3, [Ljava/lang/Object;

    .line 456
    .line 457
    aput-object v0, v3, v2

    .line 458
    .line 459
    const-string v0, "TYPE_GOAWAY unexpected error code: %d"

    .line 460
    .line 461
    invoke-static {v0, v3}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    throw v5

    .line 465
    :cond_12
    new-array v0, v2, [Ljava/lang/Object;

    .line 466
    .line 467
    const-string v2, "TYPE_GOAWAY streamId != 0"

    .line 468
    .line 469
    invoke-static {v2, v0}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    throw v5

    .line 473
    :cond_13
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    new-array v3, v3, [Ljava/lang/Object;

    .line 478
    .line 479
    aput-object v0, v3, v2

    .line 480
    .line 481
    const-string v0, "TYPE_GOAWAY length < 8: %s"

    .line 482
    .line 483
    invoke-static {v0, v3}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    throw v5

    .line 487
    :pswitch_2
    invoke-virtual {v1, v0, v4, v7, v11}, Lrd/h;->i(LA7/p1;IBI)V

    .line 488
    .line 489
    .line 490
    return v3

    .line 491
    :pswitch_3
    invoke-virtual {v1, v0, v4, v7, v11}, Lrd/h;->o(LA7/p1;IBI)V

    .line 492
    .line 493
    .line 494
    return v3

    .line 495
    :pswitch_4
    invoke-virtual {v1, v0, v4, v7, v11}, Lrd/h;->y(LA7/p1;IBI)V

    .line 496
    .line 497
    .line 498
    return v3

    .line 499
    :pswitch_5
    invoke-virtual {v1, v0, v4, v11}, Lrd/h;->w(LA7/p1;II)V

    .line 500
    .line 501
    .line 502
    return v3

    .line 503
    :pswitch_6
    const/4 v0, 0x5

    .line 504
    if-ne v4, v0, :cond_15

    .line 505
    .line 506
    if-eqz v11, :cond_14

    .line 507
    .line 508
    iget-object v0, v1, Lrd/h;->a:Lcg/B;

    .line 509
    .line 510
    invoke-virtual {v0}, Lcg/B;->readInt()I

    .line 511
    .line 512
    .line 513
    invoke-virtual {v0}, Lcg/B;->readByte()B

    .line 514
    .line 515
    .line 516
    return v3

    .line 517
    :cond_14
    new-array v0, v2, [Ljava/lang/Object;

    .line 518
    .line 519
    const-string v2, "TYPE_PRIORITY streamId == 0"

    .line 520
    .line 521
    invoke-static {v2, v0}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    throw v5

    .line 525
    :cond_15
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    new-array v3, v3, [Ljava/lang/Object;

    .line 530
    .line 531
    aput-object v0, v3, v2

    .line 532
    .line 533
    const-string v0, "TYPE_PRIORITY length: %d != 5"

    .line 534
    .line 535
    invoke-static {v0, v3}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    throw v5

    .line 539
    :pswitch_7
    invoke-virtual {v1, v0, v4, v7, v11}, Lrd/h;->h(LA7/p1;IBI)V

    .line 540
    .line 541
    .line 542
    return v3

    .line 543
    :pswitch_8
    invoke-virtual {v1, v0, v4, v7, v11}, Lrd/h;->b(LA7/p1;IBI)V

    .line 544
    .line 545
    .line 546
    return v3

    .line 547
    :cond_16
    const-string v0, "FRAME_SIZE_ERROR: %s"

    .line 548
    .line 549
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 550
    .line 551
    .line 552
    move-result-object v4

    .line 553
    new-array v3, v3, [Ljava/lang/Object;

    .line 554
    .line 555
    aput-object v4, v3, v2

    .line 556
    .line 557
    invoke-static {v0, v3}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 558
    .line 559
    .line 560
    throw v5

    .line 561
    :catch_0
    return v2

    .line 562
    nop

    .line 563
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(LA7/p1;IBI)V
    .locals 8

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    move v7, v0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v7, v1

    .line 10
    :goto_0
    and-int/lit8 v0, p3, 0x20

    .line 11
    .line 12
    if-nez v0, :cond_5

    .line 13
    .line 14
    and-int/lit8 v0, p3, 0x8

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lrd/h;->a:Lcg/B;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcg/B;->readByte()B

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    and-int/lit16 v0, v0, 0xff

    .line 25
    .line 26
    int-to-short v0, v0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v0, v1

    .line 29
    :goto_1
    invoke-static {p2, p3, v0}, Lrd/j;->b(IBS)I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    iget-object p3, p0, Lrd/h;->a:Lcg/B;

    .line 34
    .line 35
    iget-object v2, p1, LA7/p1;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Lba/a;

    .line 38
    .line 39
    iget-object v5, p3, Lcg/B;->b:Lcg/g;

    .line 40
    .line 41
    const/4 v3, 0x1

    .line 42
    move v4, p4

    .line 43
    invoke-virtual/range {v2 .. v7}, Lba/a;->B(IILcg/g;IZ)V

    .line 44
    .line 45
    .line 46
    iget-object p4, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p4, Lpd/m;

    .line 49
    .line 50
    invoke-virtual {p4, v4}, Lpd/m;->n(I)Lpd/k;

    .line 51
    .line 52
    .line 53
    move-result-object p4

    .line 54
    if-nez p4, :cond_3

    .line 55
    .line 56
    iget-object p4, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p4, Lpd/m;

    .line 59
    .line 60
    invoke-virtual {p4, v4}, Lpd/m;->o(I)Z

    .line 61
    .line 62
    .line 63
    move-result p4

    .line 64
    if-eqz p4, :cond_2

    .line 65
    .line 66
    iget-object p4, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p4, Lpd/m;

    .line 69
    .line 70
    iget-object p4, p4, Lpd/m;->k:Ljava/lang/Object;

    .line 71
    .line 72
    monitor-enter p4

    .line 73
    :try_start_0
    iget-object v2, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, Lpd/m;

    .line 76
    .line 77
    iget-object v2, v2, Lpd/m;->i:Lpd/d;

    .line 78
    .line 79
    sget-object v3, Lrd/a;->f:Lrd/a;

    .line 80
    .line 81
    invoke-virtual {v2, v4, v3}, Lpd/d;->h(ILrd/a;)V

    .line 82
    .line 83
    .line 84
    monitor-exit p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    int-to-long v2, v6

    .line 86
    invoke-virtual {p3, v2, v3}, Lcg/B;->skip(J)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :catchall_0
    move-exception v0

    .line 91
    move-object p1, v0

    .line 92
    :try_start_1
    monitor-exit p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    throw p1

    .line 94
    :cond_2
    iget-object p1, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p1, Lpd/m;

    .line 97
    .line 98
    new-instance p2, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string p3, "Received data for unknown stream: "

    .line 101
    .line 102
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-static {p1, p2}, Lpd/m;->g(Lpd/m;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_3
    int-to-long v2, v6

    .line 117
    invoke-virtual {p3, v2, v3}, Lcg/B;->require(J)V

    .line 118
    .line 119
    .line 120
    new-instance v4, Lcg/g;

    .line 121
    .line 122
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 123
    .line 124
    .line 125
    iget-object p3, p3, Lcg/B;->b:Lcg/g;

    .line 126
    .line 127
    invoke-virtual {v4, p3, v2, v3}, Lcg/g;->E(Lcg/g;J)V

    .line 128
    .line 129
    .line 130
    iget-object p3, p4, Lpd/k;->n:Lpd/j;

    .line 131
    .line 132
    iget-object p3, p3, Lpd/j;->I:LXd/c;

    .line 133
    .line 134
    sget-object p3, LXd/b;->a:LXd/a;

    .line 135
    .line 136
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object p3, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast p3, Lpd/m;

    .line 142
    .line 143
    iget-object p3, p3, Lpd/m;->k:Ljava/lang/Object;

    .line 144
    .line 145
    monitor-enter p3

    .line 146
    :try_start_2
    iget-object p4, p4, Lpd/k;->n:Lpd/j;

    .line 147
    .line 148
    sub-int v2, p2, v6

    .line 149
    .line 150
    invoke-virtual {p4, v2, v4, v7}, Lpd/j;->p(ILcg/g;Z)V

    .line 151
    .line 152
    .line 153
    monitor-exit p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 154
    :goto_2
    iget-object p3, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast p3, Lpd/m;

    .line 157
    .line 158
    iget p4, p3, Lpd/m;->s:I

    .line 159
    .line 160
    add-int/2addr p4, p2

    .line 161
    iput p4, p3, Lpd/m;->s:I

    .line 162
    .line 163
    int-to-float p2, p4

    .line 164
    iget p4, p3, Lpd/m;->f:I

    .line 165
    .line 166
    int-to-float p4, p4

    .line 167
    const/high16 v2, 0x3f000000    # 0.5f

    .line 168
    .line 169
    mul-float/2addr p4, v2

    .line 170
    cmpl-float p2, p2, p4

    .line 171
    .line 172
    if-ltz p2, :cond_4

    .line 173
    .line 174
    iget-object p2, p3, Lpd/m;->k:Ljava/lang/Object;

    .line 175
    .line 176
    monitor-enter p2

    .line 177
    :try_start_3
    iget-object p3, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast p3, Lpd/m;

    .line 180
    .line 181
    iget-object p4, p3, Lpd/m;->i:Lpd/d;

    .line 182
    .line 183
    iget p3, p3, Lpd/m;->s:I

    .line 184
    .line 185
    int-to-long v2, p3

    .line 186
    invoke-virtual {p4, v1, v2, v3}, Lpd/d;->o(IJ)V

    .line 187
    .line 188
    .line 189
    monitor-exit p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 190
    iget-object p1, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast p1, Lpd/m;

    .line 193
    .line 194
    iput v1, p1, Lpd/m;->s:I

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :catchall_1
    move-exception v0

    .line 198
    move-object p1, v0

    .line 199
    :try_start_4
    monitor-exit p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 200
    throw p1

    .line 201
    :cond_4
    :goto_3
    iget-object p1, p0, Lrd/h;->a:Lcg/B;

    .line 202
    .line 203
    int-to-long p2, v0

    .line 204
    invoke-virtual {p1, p2, p3}, Lcg/B;->skip(J)V

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :catchall_2
    move-exception v0

    .line 209
    move-object p1, v0

    .line 210
    :try_start_5
    monitor-exit p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 211
    throw p1

    .line 212
    :cond_5
    const-string p1, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    .line 213
    .line 214
    new-array p2, v1, [Ljava/lang/Object;

    .line 215
    .line 216
    invoke-static {p1, p2}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    const/4 p1, 0x0

    .line 220
    throw p1
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lrd/h;->a:Lcg/B;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcg/B;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(ISBI)Ljava/util/ArrayList;
    .locals 2

    .line 1
    iget-object v0, p0, Lrd/h;->b:Lrd/f;

    .line 2
    .line 3
    iput p1, v0, Lrd/f;->e:I

    .line 4
    .line 5
    iput p1, v0, Lrd/f;->b:I

    .line 6
    .line 7
    iput-short p2, v0, Lrd/f;->f:S

    .line 8
    .line 9
    iput-byte p3, v0, Lrd/f;->c:B

    .line 10
    .line 11
    iput p4, v0, Lrd/f;->d:I

    .line 12
    .line 13
    :cond_0
    :goto_0
    iget-object p1, p0, Lrd/h;->c:Lrd/c;

    .line 14
    .line 15
    iget-object p2, p1, Lrd/c;->b:Lcg/B;

    .line 16
    .line 17
    invoke-virtual {p2}, Lcg/B;->exhausted()Z

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    iget-object p4, p1, Lrd/c;->a:Ljava/util/ArrayList;

    .line 22
    .line 23
    if-nez p3, :cond_c

    .line 24
    .line 25
    invoke-virtual {p2}, Lcg/B;->readByte()B

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    and-int/lit16 p3, p2, 0xff

    .line 30
    .line 31
    const/16 v0, 0x80

    .line 32
    .line 33
    if-eq p3, v0, :cond_b

    .line 34
    .line 35
    and-int/lit16 v1, p2, 0x80

    .line 36
    .line 37
    if-ne v1, v0, :cond_3

    .line 38
    .line 39
    const/16 p2, 0x7f

    .line 40
    .line 41
    invoke-virtual {p1, p3, p2}, Lrd/c;->e(II)I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    add-int/lit8 p3, p2, -0x1

    .line 46
    .line 47
    if-ltz p3, :cond_1

    .line 48
    .line 49
    sget-object v0, Lrd/e;->b:[Lrd/b;

    .line 50
    .line 51
    array-length v1, v0

    .line 52
    add-int/lit8 v1, v1, -0x1

    .line 53
    .line 54
    if-gt p3, v1, :cond_1

    .line 55
    .line 56
    aget-object p1, v0, p3

    .line 57
    .line 58
    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    sget-object v0, Lrd/e;->b:[Lrd/b;

    .line 63
    .line 64
    array-length v0, v0

    .line 65
    sub-int/2addr p3, v0

    .line 66
    iget v0, p1, Lrd/c;->f:I

    .line 67
    .line 68
    add-int/lit8 v0, v0, 0x1

    .line 69
    .line 70
    add-int/2addr v0, p3

    .line 71
    if-ltz v0, :cond_2

    .line 72
    .line 73
    iget-object p1, p1, Lrd/c;->e:[Lrd/b;

    .line 74
    .line 75
    array-length p3, p1

    .line 76
    add-int/lit8 p3, p3, -0x1

    .line 77
    .line 78
    if-gt v0, p3, :cond_2

    .line 79
    .line 80
    aget-object p1, p1, v0

    .line 81
    .line 82
    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 87
    .line 88
    const-string p3, "Header index too large "

    .line 89
    .line 90
    invoke-static {p2, p3}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_3
    const/16 v0, 0x40

    .line 99
    .line 100
    if-ne p3, v0, :cond_4

    .line 101
    .line 102
    invoke-virtual {p1}, Lrd/c;->d()Lcg/j;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-static {p2}, Lrd/e;->a(Lcg/j;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Lrd/c;->d()Lcg/j;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    new-instance p4, Lrd/b;

    .line 114
    .line 115
    invoke-direct {p4, p2, p3}, Lrd/b;-><init>(Lcg/j;Lcg/j;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, p4}, Lrd/c;->c(Lrd/b;)V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_4
    and-int/lit8 v1, p2, 0x40

    .line 123
    .line 124
    if-ne v1, v0, :cond_5

    .line 125
    .line 126
    const/16 p2, 0x3f

    .line 127
    .line 128
    invoke-virtual {p1, p3, p2}, Lrd/c;->e(II)I

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    add-int/lit8 p2, p2, -0x1

    .line 133
    .line 134
    invoke-virtual {p1, p2}, Lrd/c;->b(I)Lcg/j;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    invoke-virtual {p1}, Lrd/c;->d()Lcg/j;

    .line 139
    .line 140
    .line 141
    move-result-object p3

    .line 142
    new-instance p4, Lrd/b;

    .line 143
    .line 144
    invoke-direct {p4, p2, p3}, Lrd/b;-><init>(Lcg/j;Lcg/j;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, p4}, Lrd/c;->c(Lrd/b;)V

    .line 148
    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :cond_5
    and-int/lit8 p2, p2, 0x20

    .line 153
    .line 154
    const/16 v0, 0x20

    .line 155
    .line 156
    if-ne p2, v0, :cond_8

    .line 157
    .line 158
    const/16 p2, 0x1f

    .line 159
    .line 160
    invoke-virtual {p1, p3, p2}, Lrd/c;->e(II)I

    .line 161
    .line 162
    .line 163
    move-result p2

    .line 164
    iput p2, p1, Lrd/c;->d:I

    .line 165
    .line 166
    if-ltz p2, :cond_7

    .line 167
    .line 168
    iget p3, p1, Lrd/c;->c:I

    .line 169
    .line 170
    if-gt p2, p3, :cond_7

    .line 171
    .line 172
    iget p3, p1, Lrd/c;->h:I

    .line 173
    .line 174
    if-ge p2, p3, :cond_0

    .line 175
    .line 176
    if-nez p2, :cond_6

    .line 177
    .line 178
    iget-object p2, p1, Lrd/c;->e:[Lrd/b;

    .line 179
    .line 180
    const/4 p3, 0x0

    .line 181
    invoke-static {p2, p3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    iget-object p2, p1, Lrd/c;->e:[Lrd/b;

    .line 185
    .line 186
    array-length p2, p2

    .line 187
    add-int/lit8 p2, p2, -0x1

    .line 188
    .line 189
    iput p2, p1, Lrd/c;->f:I

    .line 190
    .line 191
    const/4 p2, 0x0

    .line 192
    iput p2, p1, Lrd/c;->g:I

    .line 193
    .line 194
    iput p2, p1, Lrd/c;->h:I

    .line 195
    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :cond_6
    sub-int/2addr p3, p2

    .line 199
    invoke-virtual {p1, p3}, Lrd/c;->a(I)I

    .line 200
    .line 201
    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :cond_7
    new-instance p2, Ljava/io/IOException;

    .line 205
    .line 206
    new-instance p3, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    const-string p4, "Invalid dynamic table size update "

    .line 209
    .line 210
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    iget p1, p1, Lrd/c;->d:I

    .line 214
    .line 215
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw p2

    .line 226
    :cond_8
    const/16 p2, 0x10

    .line 227
    .line 228
    if-eq p3, p2, :cond_a

    .line 229
    .line 230
    if-nez p3, :cond_9

    .line 231
    .line 232
    goto :goto_1

    .line 233
    :cond_9
    const/16 p2, 0xf

    .line 234
    .line 235
    invoke-virtual {p1, p3, p2}, Lrd/c;->e(II)I

    .line 236
    .line 237
    .line 238
    move-result p2

    .line 239
    add-int/lit8 p2, p2, -0x1

    .line 240
    .line 241
    invoke-virtual {p1, p2}, Lrd/c;->b(I)Lcg/j;

    .line 242
    .line 243
    .line 244
    move-result-object p2

    .line 245
    invoke-virtual {p1}, Lrd/c;->d()Lcg/j;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    new-instance p3, Lrd/b;

    .line 250
    .line 251
    invoke-direct {p3, p2, p1}, Lrd/b;-><init>(Lcg/j;Lcg/j;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    goto/16 :goto_0

    .line 258
    .line 259
    :cond_a
    :goto_1
    invoke-virtual {p1}, Lrd/c;->d()Lcg/j;

    .line 260
    .line 261
    .line 262
    move-result-object p2

    .line 263
    invoke-static {p2}, Lrd/e;->a(Lcg/j;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1}, Lrd/c;->d()Lcg/j;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    new-instance p3, Lrd/b;

    .line 271
    .line 272
    invoke-direct {p3, p2, p1}, Lrd/b;-><init>(Lcg/j;Lcg/j;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    goto/16 :goto_0

    .line 279
    .line 280
    :cond_b
    new-instance p1, Ljava/io/IOException;

    .line 281
    .line 282
    const-string p2, "index == 0"

    .line 283
    .line 284
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw p1

    .line 288
    :cond_c
    new-instance p1, Ljava/util/ArrayList;

    .line 289
    .line 290
    invoke-direct {p1, p4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p4}, Ljava/util/ArrayList;->clear()V

    .line 294
    .line 295
    .line 296
    return-object p1
.end method

.method public final h(LA7/p1;IBI)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p4, :cond_c

    .line 4
    .line 5
    and-int/lit8 v2, p3, 0x1

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    move v2, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v2, v1

    .line 13
    :goto_0
    and-int/lit8 v4, p3, 0x8

    .line 14
    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    iget-object v4, p0, Lrd/h;->a:Lcg/B;

    .line 18
    .line 19
    invoke-virtual {v4}, Lcg/B;->readByte()B

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    and-int/lit16 v4, v4, 0xff

    .line 24
    .line 25
    int-to-short v4, v4

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v4, v1

    .line 28
    :goto_1
    and-int/lit8 v5, p3, 0x20

    .line 29
    .line 30
    if-eqz v5, :cond_2

    .line 31
    .line 32
    iget-object v5, p0, Lrd/h;->a:Lcg/B;

    .line 33
    .line 34
    invoke-virtual {v5}, Lcg/B;->readInt()I

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5}, Lcg/B;->readByte()B

    .line 38
    .line 39
    .line 40
    add-int/lit8 p2, p2, -0x5

    .line 41
    .line 42
    :cond_2
    invoke-static {p2, p3, v4}, Lrd/j;->b(IBS)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    invoke-virtual {p0, p2, v4, p3, p4}, Lrd/h;->d(ISBI)Ljava/util/ArrayList;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    iget-object p3, p1, LA7/p1;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p3, Lba/a;

    .line 53
    .line 54
    invoke-virtual {p3}, Lba/a;->A()Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_3

    .line 59
    .line 60
    new-instance v4, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v5, "INBOUND"

    .line 66
    .line 67
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v5, " HEADERS: streamId="

    .line 71
    .line 72
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v5, " headers="

    .line 79
    .line 80
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v5, " endStream="

    .line 87
    .line 88
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    iget-object v5, p3, Lba/a;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v5, Ljava/util/logging/Logger;

    .line 101
    .line 102
    iget-object p3, p3, Lba/a;->c:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p3, Ljava/util/logging/Level;

    .line 105
    .line 106
    invoke-virtual {v5, p3, v4}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    :cond_3
    iget-object p3, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p3, Lpd/m;

    .line 112
    .line 113
    iget p3, p3, Lpd/m;->K:I

    .line 114
    .line 115
    const v4, 0x7fffffff

    .line 116
    .line 117
    .line 118
    if-eq p3, v4, :cond_6

    .line 119
    .line 120
    const-wide/16 v4, 0x0

    .line 121
    .line 122
    move p3, v1

    .line 123
    :goto_2
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-ge p3, v6, :cond_4

    .line 128
    .line 129
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    check-cast v6, Lrd/b;

    .line 134
    .line 135
    iget-object v7, v6, Lrd/b;->a:Lcg/j;

    .line 136
    .line 137
    invoke-virtual {v7}, Lcg/j;->d()I

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    add-int/lit8 v7, v7, 0x20

    .line 142
    .line 143
    iget-object v6, v6, Lrd/b;->b:Lcg/j;

    .line 144
    .line 145
    invoke-virtual {v6}, Lcg/j;->d()I

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    add-int/2addr v6, v7

    .line 150
    int-to-long v6, v6

    .line 151
    add-long/2addr v4, v6

    .line 152
    add-int/lit8 p3, p3, 0x1

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_4
    const-wide/32 v6, 0x7fffffff

    .line 156
    .line 157
    .line 158
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 159
    .line 160
    .line 161
    move-result-wide v4

    .line 162
    long-to-int p3, v4

    .line 163
    iget-object v4, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v4, Lpd/m;

    .line 166
    .line 167
    iget v4, v4, Lpd/m;->K:I

    .line 168
    .line 169
    if-le p3, v4, :cond_6

    .line 170
    .line 171
    sget-object v0, Lmd/k0;->k:Lmd/k0;

    .line 172
    .line 173
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 174
    .line 175
    if-eqz v2, :cond_5

    .line 176
    .line 177
    const-string v5, "trailer"

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_5
    const-string v5, "header"

    .line 181
    .line 182
    :goto_3
    const-string v6, "Response "

    .line 183
    .line 184
    const-string v7, " metadata larger than "

    .line 185
    .line 186
    const-string v8, ": "

    .line 187
    .line 188
    invoke-static {v4, v6, v5, v7, v8}, Lcb/a;->k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p3

    .line 199
    invoke-virtual {v0, p3}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    :cond_6
    iget-object p3, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast p3, Lpd/m;

    .line 206
    .line 207
    iget-object p3, p3, Lpd/m;->k:Ljava/lang/Object;

    .line 208
    .line 209
    monitor-enter p3

    .line 210
    :try_start_0
    iget-object v4, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v4, Lpd/m;

    .line 213
    .line 214
    iget-object v4, v4, Lpd/m;->n:Ljava/util/HashMap;

    .line 215
    .line 216
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    check-cast v4, Lpd/k;

    .line 225
    .line 226
    if-nez v4, :cond_8

    .line 227
    .line 228
    iget-object p2, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast p2, Lpd/m;

    .line 231
    .line 232
    invoke-virtual {p2, p4}, Lpd/m;->o(I)Z

    .line 233
    .line 234
    .line 235
    move-result p2

    .line 236
    if-eqz p2, :cond_7

    .line 237
    .line 238
    iget-object p2, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast p2, Lpd/m;

    .line 241
    .line 242
    iget-object p2, p2, Lpd/m;->i:Lpd/d;

    .line 243
    .line 244
    sget-object v0, Lrd/a;->f:Lrd/a;

    .line 245
    .line 246
    invoke-virtual {p2, p4, v0}, Lpd/d;->h(ILrd/a;)V

    .line 247
    .line 248
    .line 249
    goto :goto_4

    .line 250
    :catchall_0
    move-exception p1

    .line 251
    goto :goto_5

    .line 252
    :cond_7
    move v1, v3

    .line 253
    goto :goto_4

    .line 254
    :cond_8
    if-nez v0, :cond_9

    .line 255
    .line 256
    iget-object v0, v4, Lpd/k;->n:Lpd/j;

    .line 257
    .line 258
    iget-object v0, v0, Lpd/j;->I:LXd/c;

    .line 259
    .line 260
    sget-object v0, LXd/b;->a:LXd/a;

    .line 261
    .line 262
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    iget-object v0, v4, Lpd/k;->n:Lpd/j;

    .line 266
    .line 267
    invoke-virtual {v0, p2, v2}, Lpd/j;->q(Ljava/util/ArrayList;Z)V

    .line 268
    .line 269
    .line 270
    goto :goto_4

    .line 271
    :cond_9
    if-nez v2, :cond_a

    .line 272
    .line 273
    iget-object p2, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast p2, Lpd/m;

    .line 276
    .line 277
    iget-object p2, p2, Lpd/m;->i:Lpd/d;

    .line 278
    .line 279
    sget-object v2, Lrd/a;->i:Lrd/a;

    .line 280
    .line 281
    invoke-virtual {p2, p4, v2}, Lpd/d;->h(ILrd/a;)V

    .line 282
    .line 283
    .line 284
    :cond_a
    iget-object p2, v4, Lpd/k;->n:Lpd/j;

    .line 285
    .line 286
    new-instance v2, Lmd/b0;

    .line 287
    .line 288
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 289
    .line 290
    .line 291
    sget-object v3, Lod/s;->a:Lod/s;

    .line 292
    .line 293
    invoke-virtual {p2, v0, v3, v1, v2}, Lod/a;->g(Lmd/k0;Lod/s;ZLmd/b0;)V

    .line 294
    .line 295
    .line 296
    :goto_4
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 297
    if-eqz v1, :cond_b

    .line 298
    .line 299
    iget-object p1, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast p1, Lpd/m;

    .line 302
    .line 303
    new-instance p2, Ljava/lang/StringBuilder;

    .line 304
    .line 305
    const-string p3, "Received header for unknown stream: "

    .line 306
    .line 307
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p2

    .line 317
    invoke-static {p1, p2}, Lpd/m;->g(Lpd/m;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    :cond_b
    return-void

    .line 321
    :goto_5
    :try_start_1
    monitor-exit p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 322
    throw p1

    .line 323
    :cond_c
    const-string p1, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    .line 324
    .line 325
    new-array p2, v1, [Ljava/lang/Object;

    .line 326
    .line 327
    invoke-static {p1, p2}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    throw v0
.end method

.method public final i(LA7/p1;IBI)V
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/16 v2, 0x8

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-ne p2, v2, :cond_6

    .line 7
    .line 8
    if-nez p4, :cond_5

    .line 9
    .line 10
    iget-object p2, p0, Lrd/h;->a:Lcg/B;

    .line 11
    .line 12
    invoke-virtual {p2}, Lcg/B;->readInt()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    iget-object p4, p0, Lrd/h;->a:Lcg/B;

    .line 17
    .line 18
    invoke-virtual {p4}, Lcg/B;->readInt()I

    .line 19
    .line 20
    .line 21
    move-result p4

    .line 22
    and-int/2addr p3, v0

    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    move v1, v0

    .line 26
    :cond_0
    const-string p3, "Received unexpected ping ack. Expecting "

    .line 27
    .line 28
    int-to-long v4, p2

    .line 29
    const/16 v2, 0x20

    .line 30
    .line 31
    shl-long/2addr v4, v2

    .line 32
    int-to-long v6, p4

    .line 33
    const-wide v8, 0xffffffffL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    and-long/2addr v6, v8

    .line 39
    or-long/2addr v4, v6

    .line 40
    iget-object v2, p1, LA7/p1;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Lba/a;

    .line 43
    .line 44
    invoke-virtual {v2, v0, v4, v5}, Lba/a;->D(IJ)V

    .line 45
    .line 46
    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    iget-object p3, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p3, Lpd/m;

    .line 52
    .line 53
    iget-object v1, p3, Lpd/m;->k:Ljava/lang/Object;

    .line 54
    .line 55
    monitor-enter v1

    .line 56
    :try_start_0
    iget-object p1, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, Lpd/m;

    .line 59
    .line 60
    iget-object p1, p1, Lpd/m;->i:Lpd/d;

    .line 61
    .line 62
    invoke-virtual {p1, v0, p2, p4}, Lpd/d;->d(ZII)V

    .line 63
    .line 64
    .line 65
    monitor-exit v1

    .line 66
    return-void

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    throw p1

    .line 70
    :cond_1
    iget-object p2, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p2, Lpd/m;

    .line 73
    .line 74
    iget-object p2, p2, Lpd/m;->k:Ljava/lang/Object;

    .line 75
    .line 76
    monitor-enter p2

    .line 77
    :try_start_1
    iget-object p1, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p1, Lpd/m;

    .line 80
    .line 81
    iget-object p4, p1, Lpd/m;->x:Lod/f0;

    .line 82
    .line 83
    if-eqz p4, :cond_3

    .line 84
    .line 85
    iget-wide v0, p4, Lod/f0;->a:J

    .line 86
    .line 87
    cmp-long v2, v0, v4

    .line 88
    .line 89
    if-nez v2, :cond_2

    .line 90
    .line 91
    iput-object v3, p1, Lpd/m;->x:Lod/f0;

    .line 92
    .line 93
    move-object v3, p4

    .line 94
    goto :goto_0

    .line 95
    :cond_2
    sget-object p1, Lpd/m;->Q:Ljava/util/logging/Logger;

    .line 96
    .line 97
    sget-object p4, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 98
    .line 99
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 100
    .line 101
    new-instance v2, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string p3, ", got "

    .line 110
    .line 111
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    invoke-virtual {p1, p4, p3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :catchall_1
    move-exception p1

    .line 126
    goto :goto_1

    .line 127
    :cond_3
    sget-object p1, Lpd/m;->Q:Ljava/util/logging/Logger;

    .line 128
    .line 129
    const-string p3, "Received unexpected ping ack. No ping outstanding"

    .line 130
    .line 131
    invoke-virtual {p1, p3}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    :goto_0
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 135
    if-eqz v3, :cond_4

    .line 136
    .line 137
    invoke-virtual {v3}, Lod/f0;->b()V

    .line 138
    .line 139
    .line 140
    :cond_4
    return-void

    .line 141
    :goto_1
    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 142
    throw p1

    .line 143
    :cond_5
    const-string p1, "TYPE_PING streamId != 0"

    .line 144
    .line 145
    new-array p2, v1, [Ljava/lang/Object;

    .line 146
    .line 147
    invoke-static {p1, p2}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    throw v3

    .line 151
    :cond_6
    const-string p1, "TYPE_PING length != 8: %s"

    .line 152
    .line 153
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    new-array p3, v0, [Ljava/lang/Object;

    .line 158
    .line 159
    aput-object p2, p3, v1

    .line 160
    .line 161
    invoke-static {p1, p3}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    throw v3
.end method

.method public final o(LA7/p1;IBI)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p4, :cond_2

    .line 3
    .line 4
    and-int/lit8 v1, p3, 0x8

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lrd/h;->a:Lcg/B;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcg/B;->readByte()B

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    and-int/lit16 v0, v0, 0xff

    .line 15
    .line 16
    int-to-short v0, v0

    .line 17
    :cond_0
    iget-object v1, p0, Lrd/h;->a:Lcg/B;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcg/B;->readInt()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const v2, 0x7fffffff

    .line 24
    .line 25
    .line 26
    and-int/2addr v1, v2

    .line 27
    add-int/lit8 p2, p2, -0x4

    .line 28
    .line 29
    invoke-static {p2, p3, v0}, Lrd/j;->b(IBS)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    invoke-virtual {p0, p2, v0, p3, p4}, Lrd/h;->d(ISBI)Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iget-object p3, p1, LA7/p1;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p3, Lba/a;

    .line 40
    .line 41
    invoke-virtual {p3}, Lba/a;->A()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string v2, "INBOUND"

    .line 53
    .line 54
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v2, " PUSH_PROMISE: streamId="

    .line 58
    .line 59
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v2, " promisedStreamId="

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, " headers="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    iget-object v0, p3, Lba/a;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, Ljava/util/logging/Logger;

    .line 88
    .line 89
    iget-object p3, p3, Lba/a;->c:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p3, Ljava/util/logging/Level;

    .line 92
    .line 93
    invoke-virtual {v0, p3, p2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_1
    iget-object p2, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p2, Lpd/m;

    .line 99
    .line 100
    iget-object p2, p2, Lpd/m;->k:Ljava/lang/Object;

    .line 101
    .line 102
    monitor-enter p2

    .line 103
    :try_start_0
    iget-object p1, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p1, Lpd/m;

    .line 106
    .line 107
    iget-object p1, p1, Lpd/m;->i:Lpd/d;

    .line 108
    .line 109
    sget-object p3, Lrd/a;->c:Lrd/a;

    .line 110
    .line 111
    invoke-virtual {p1, p4, p3}, Lpd/d;->h(ILrd/a;)V

    .line 112
    .line 113
    .line 114
    monitor-exit p2

    .line 115
    return-void

    .line 116
    :catchall_0
    move-exception p1

    .line 117
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    throw p1

    .line 119
    :cond_2
    const-string p1, "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"

    .line 120
    .line 121
    new-array p2, v0, [Ljava/lang/Object;

    .line 122
    .line 123
    invoke-static {p1, p2}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    const/4 p1, 0x0

    .line 127
    throw p1
.end method

.method public final w(LA7/p1;II)V
    .locals 12

    .line 1
    move v1, p3

    .line 2
    const/4 v2, 0x0

    .line 3
    const/4 v3, 0x1

    .line 4
    const/4 v4, 0x4

    .line 5
    const/4 v5, 0x0

    .line 6
    if-ne p2, v4, :cond_8

    .line 7
    .line 8
    if-eqz v1, :cond_7

    .line 9
    .line 10
    iget-object v4, p0, Lrd/h;->a:Lcg/B;

    .line 11
    .line 12
    invoke-virtual {v4}, Lcg/B;->readInt()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    invoke-static {}, Lrd/a;->values()[Lrd/a;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    array-length v7, v6

    .line 21
    move v8, v2

    .line 22
    :goto_0
    if-ge v8, v7, :cond_1

    .line 23
    .line 24
    aget-object v9, v6, v8

    .line 25
    .line 26
    iget v10, v9, Lrd/a;->a:I

    .line 27
    .line 28
    if-ne v10, v4, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    add-int/2addr v8, v3

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object v9, v5

    .line 34
    :goto_1
    if-eqz v9, :cond_6

    .line 35
    .line 36
    iget-object v4, p1, LA7/p1;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v4, Lba/a;

    .line 39
    .line 40
    invoke-virtual {v4, v3, p3, v9}, Lba/a;->E(IILrd/a;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v9}, Lpd/m;->y(Lrd/a;)Lmd/k0;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const-string v5, "Rst Stream"

    .line 48
    .line 49
    invoke-virtual {v4, v5}, Lmd/k0;->b(Ljava/lang/String;)Lmd/k0;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    iget-object v5, v4, Lmd/k0;->a:Lmd/j0;

    .line 54
    .line 55
    sget-object v6, Lmd/j0;->d:Lmd/j0;

    .line 56
    .line 57
    if-eq v5, v6, :cond_2

    .line 58
    .line 59
    sget-object v6, Lmd/j0;->g:Lmd/j0;

    .line 60
    .line 61
    if-ne v5, v6, :cond_3

    .line 62
    .line 63
    :cond_2
    move v2, v3

    .line 64
    :cond_3
    iget-object v3, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v3, Lpd/m;

    .line 67
    .line 68
    iget-object v7, v3, Lpd/m;->k:Ljava/lang/Object;

    .line 69
    .line 70
    monitor-enter v7

    .line 71
    :try_start_0
    iget-object v3, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v3, Lpd/m;

    .line 74
    .line 75
    iget-object v3, v3, Lpd/m;->n:Ljava/util/HashMap;

    .line 76
    .line 77
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    check-cast v3, Lpd/k;

    .line 86
    .line 87
    if-eqz v3, :cond_5

    .line 88
    .line 89
    iget-object v3, v3, Lpd/k;->n:Lpd/j;

    .line 90
    .line 91
    iget-object v3, v3, Lpd/j;->I:LXd/c;

    .line 92
    .line 93
    sget-object v3, LXd/b;->a:LXd/a;

    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object v0, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Lpd/m;

    .line 101
    .line 102
    sget-object v3, Lrd/a;->h:Lrd/a;

    .line 103
    .line 104
    if-ne v9, v3, :cond_4

    .line 105
    .line 106
    sget-object v3, Lod/s;->b:Lod/s;

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :catchall_0
    move-exception v0

    .line 110
    goto :goto_3

    .line 111
    :cond_4
    sget-object v3, Lod/s;->a:Lod/s;

    .line 112
    .line 113
    :goto_2
    const/4 v5, 0x0

    .line 114
    const/4 v6, 0x0

    .line 115
    move-object v11, v4

    .line 116
    move v4, v2

    .line 117
    move-object v2, v11

    .line 118
    invoke-virtual/range {v0 .. v6}, Lpd/m;->j(ILmd/k0;Lod/s;ZLrd/a;Lmd/b0;)V

    .line 119
    .line 120
    .line 121
    :cond_5
    monitor-exit v7

    .line 122
    return-void

    .line 123
    :goto_3
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    throw v0

    .line 125
    :cond_6
    const-string v0, "TYPE_RST_STREAM unexpected error code: %d"

    .line 126
    .line 127
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    new-array v3, v3, [Ljava/lang/Object;

    .line 132
    .line 133
    aput-object v1, v3, v2

    .line 134
    .line 135
    invoke-static {v0, v3}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    throw v5

    .line 139
    :cond_7
    const-string v0, "TYPE_RST_STREAM streamId == 0"

    .line 140
    .line 141
    new-array v1, v2, [Ljava/lang/Object;

    .line 142
    .line 143
    invoke-static {v0, v1}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    throw v5

    .line 147
    :cond_8
    const-string v0, "TYPE_RST_STREAM length: %d != 4"

    .line 148
    .line 149
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    new-array v3, v3, [Ljava/lang/Object;

    .line 154
    .line 155
    aput-object v1, v3, v2

    .line 156
    .line 157
    invoke-static {v0, v3}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    throw v5
.end method

.method public final y(LA7/p1;IBI)V
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    if-nez p4, :cond_14

    .line 6
    .line 7
    and-int/2addr p3, v1

    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    goto/16 :goto_9

    .line 13
    .line 14
    :cond_0
    const-string p1, "FRAME_SIZE_ERROR ack frame should be empty!"

    .line 15
    .line 16
    new-array p2, v3, [Ljava/lang/Object;

    .line 17
    .line 18
    invoke-static {p1, p2}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    throw v2

    .line 22
    :cond_1
    rem-int/lit8 p3, p2, 0x6

    .line 23
    .line 24
    if-nez p3, :cond_13

    .line 25
    .line 26
    new-instance p3, LN/I;

    .line 27
    .line 28
    invoke-direct {p3, v1}, LN/I;-><init>(I)V

    .line 29
    .line 30
    .line 31
    move p4, v3

    .line 32
    :goto_0
    const/4 v4, 0x4

    .line 33
    const/4 v5, 0x7

    .line 34
    if-ge p4, p2, :cond_6

    .line 35
    .line 36
    iget-object v6, p0, Lrd/h;->a:Lcg/B;

    .line 37
    .line 38
    invoke-virtual {v6}, Lcg/B;->readShort()S

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    iget-object v7, p0, Lrd/h;->a:Lcg/B;

    .line 43
    .line 44
    invoke-virtual {v7}, Lcg/B;->readInt()I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    packed-switch v6, :pswitch_data_0

    .line 49
    .line 50
    .line 51
    goto :goto_3

    .line 52
    :pswitch_0
    const/16 v4, 0x4000

    .line 53
    .line 54
    if-lt v7, v4, :cond_2

    .line 55
    .line 56
    const v4, 0xffffff

    .line 57
    .line 58
    .line 59
    if-gt v7, v4, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    const-string p1, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"

    .line 63
    .line 64
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    new-array p3, v1, [Ljava/lang/Object;

    .line 69
    .line 70
    aput-object p2, p3, v3

    .line 71
    .line 72
    invoke-static {p1, p3}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    throw v2

    .line 76
    :pswitch_1
    if-ltz v7, :cond_3

    .line 77
    .line 78
    move v4, v5

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    const-string p1, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    .line 81
    .line 82
    new-array p2, v3, [Ljava/lang/Object;

    .line 83
    .line 84
    invoke-static {p1, p2}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    throw v2

    .line 88
    :pswitch_2
    if-eqz v7, :cond_5

    .line 89
    .line 90
    if-ne v7, v1, :cond_4

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    const-string p1, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    .line 94
    .line 95
    new-array p2, v3, [Ljava/lang/Object;

    .line 96
    .line 97
    invoke-static {p1, p2}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    throw v2

    .line 101
    :cond_5
    :goto_1
    :pswitch_3
    move v4, v6

    .line 102
    :goto_2
    :pswitch_4
    invoke-virtual {p3, v4, v7}, LN/I;->d(II)V

    .line 103
    .line 104
    .line 105
    :goto_3
    add-int/lit8 p4, p4, 0x6

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_6
    iget-object p2, p1, LA7/p1;->b:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p2, Lba/a;

    .line 111
    .line 112
    invoke-virtual {p2, v1, p3}, Lba/a;->F(ILN/I;)V

    .line 113
    .line 114
    .line 115
    iget-object p2, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p2, Lpd/m;

    .line 118
    .line 119
    iget-object p4, p2, Lpd/m;->k:Ljava/lang/Object;

    .line 120
    .line 121
    monitor-enter p4

    .line 122
    :try_start_0
    invoke-virtual {p3, v4}, LN/I;->a(I)Z

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    if-eqz p2, :cond_7

    .line 127
    .line 128
    iget-object p2, p3, LN/I;->b:[I

    .line 129
    .line 130
    aget p2, p2, v4

    .line 131
    .line 132
    iget-object v4, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v4, Lpd/m;

    .line 135
    .line 136
    iput p2, v4, Lpd/m;->C:I

    .line 137
    .line 138
    :cond_7
    invoke-virtual {p3, v5}, LN/I;->a(I)Z

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    if-eqz p2, :cond_a

    .line 143
    .line 144
    iget-object p2, p3, LN/I;->b:[I

    .line 145
    .line 146
    aget p2, p2, v5

    .line 147
    .line 148
    iget-object v4, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v4, Lpd/m;

    .line 151
    .line 152
    iget-object v4, v4, Lpd/m;->j:Lc7/l;

    .line 153
    .line 154
    if-ltz p2, :cond_9

    .line 155
    .line 156
    iget v5, v4, Lc7/l;->a:I

    .line 157
    .line 158
    sub-int v5, p2, v5

    .line 159
    .line 160
    iput p2, v4, Lc7/l;->a:I

    .line 161
    .line 162
    iget-object p2, v4, Lc7/l;->b:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast p2, Lpd/m;

    .line 165
    .line 166
    invoke-virtual {p2}, Lpd/m;->k()[Lpd/v;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    array-length v4, p2

    .line 171
    move v6, v3

    .line 172
    :goto_4
    if-ge v6, v4, :cond_8

    .line 173
    .line 174
    aget-object v7, p2, v6

    .line 175
    .line 176
    invoke-virtual {v7, v5}, Lpd/v;->a(I)I

    .line 177
    .line 178
    .line 179
    add-int/2addr v6, v1

    .line 180
    goto :goto_4

    .line 181
    :cond_8
    if-lez v5, :cond_a

    .line 182
    .line 183
    move p2, v1

    .line 184
    goto :goto_5

    .line 185
    :cond_9
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 189
    .line 190
    const-string p3, "Invalid initial window size: "

    .line 191
    .line 192
    invoke-static {p2, p3}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw p1

    .line 200
    :cond_a
    move p2, v3

    .line 201
    :goto_5
    iget-boolean v4, p1, LA7/p1;->c:Z

    .line 202
    .line 203
    if-eqz v4, :cond_c

    .line 204
    .line 205
    iget-object v4, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v4, Lpd/m;

    .line 208
    .line 209
    iget-object v5, v4, Lpd/m;->h:LE5/b;

    .line 210
    .line 211
    iget-object v6, v4, Lpd/m;->u:Lmd/b;

    .line 212
    .line 213
    iget-object v5, v5, LE5/b;->d:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v5, Lod/o0;

    .line 216
    .line 217
    iget-object v5, v5, Lod/o0;->j:Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    if-nez v7, :cond_b

    .line 228
    .line 229
    iput-object v6, v4, Lpd/m;->u:Lmd/b;

    .line 230
    .line 231
    iget-object v4, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v4, Lpd/m;

    .line 234
    .line 235
    iget-object v4, v4, Lpd/m;->h:LE5/b;

    .line 236
    .line 237
    iget-object v5, v4, LE5/b;->d:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v5, Lod/o0;

    .line 240
    .line 241
    iget-object v6, v5, Lod/o0;->i:Lmd/e;

    .line 242
    .line 243
    const-string v7, "READY"

    .line 244
    .line 245
    invoke-virtual {v6, v0, v7}, Lmd/e;->g(ILjava/lang/String;)V

    .line 246
    .line 247
    .line 248
    new-instance v6, Lod/m0;

    .line 249
    .line 250
    invoke-direct {v6, v4, v3}, Lod/m0;-><init>(LE5/b;I)V

    .line 251
    .line 252
    .line 253
    iget-object v4, v5, Lod/o0;->k:Lmd/n0;

    .line 254
    .line 255
    invoke-virtual {v4, v6}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 256
    .line 257
    .line 258
    iput-boolean v3, p1, LA7/p1;->c:Z

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :catchall_0
    move-exception p1

    .line 262
    goto/16 :goto_a

    .line 263
    .line 264
    :cond_b
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    new-instance p1, Ljava/lang/ClassCastException;

    .line 272
    .line 273
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 274
    .line 275
    .line 276
    throw p1

    .line 277
    :cond_c
    :goto_6
    iget-object v4, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v4, Lpd/m;

    .line 280
    .line 281
    iget-object v4, v4, Lpd/m;->i:Lpd/d;

    .line 282
    .line 283
    iget-object v5, v4, Lpd/d;->c:Lba/a;

    .line 284
    .line 285
    invoke-virtual {v5}, Lba/a;->A()Z

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    if-eqz v6, :cond_d

    .line 290
    .line 291
    const-string v6, " SETTINGS: ack=true"

    .line 292
    .line 293
    const-string v7, "OUTBOUND"

    .line 294
    .line 295
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v6

    .line 299
    iget-object v7, v5, Lba/a;->b:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast v7, Ljava/util/logging/Logger;

    .line 302
    .line 303
    iget-object v5, v5, Lba/a;->c:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v5, Ljava/util/logging/Level;

    .line 306
    .line 307
    invoke-virtual {v7, v5, v6}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 308
    .line 309
    .line 310
    :cond_d
    :try_start_1
    iget-object v5, v4, Lpd/d;->b:Lpd/b;

    .line 311
    .line 312
    invoke-virtual {v5, p3}, Lpd/b;->a(LN/I;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 313
    .line 314
    .line 315
    goto :goto_7

    .line 316
    :catch_0
    move-exception v5

    .line 317
    :try_start_2
    iget-object v4, v4, Lpd/d;->a:Lpd/m;

    .line 318
    .line 319
    invoke-virtual {v4, v5}, Lpd/m;->q(Ljava/lang/Exception;)V

    .line 320
    .line 321
    .line 322
    :goto_7
    if-eqz p2, :cond_e

    .line 323
    .line 324
    iget-object p2, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast p2, Lpd/m;

    .line 327
    .line 328
    iget-object p2, p2, Lpd/m;->j:Lc7/l;

    .line 329
    .line 330
    invoke-virtual {p2}, Lc7/l;->i()V

    .line 331
    .line 332
    .line 333
    :cond_e
    iget-object p1, p1, LA7/p1;->d:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast p1, Lpd/m;

    .line 336
    .line 337
    invoke-virtual {p1}, Lpd/m;->v()Z

    .line 338
    .line 339
    .line 340
    monitor-exit p4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 341
    iget p1, p3, LN/I;->a:I

    .line 342
    .line 343
    and-int/lit8 p2, p1, 0x2

    .line 344
    .line 345
    const/4 p4, -0x1

    .line 346
    if-eqz p2, :cond_f

    .line 347
    .line 348
    iget-object p2, p3, LN/I;->b:[I

    .line 349
    .line 350
    aget p2, p2, v1

    .line 351
    .line 352
    goto :goto_8

    .line 353
    :cond_f
    move p2, p4

    .line 354
    :goto_8
    if-ltz p2, :cond_12

    .line 355
    .line 356
    iget-object p2, p0, Lrd/h;->c:Lrd/c;

    .line 357
    .line 358
    and-int/2addr p1, v0

    .line 359
    if-eqz p1, :cond_10

    .line 360
    .line 361
    iget-object p1, p3, LN/I;->b:[I

    .line 362
    .line 363
    aget p4, p1, v1

    .line 364
    .line 365
    :cond_10
    iput p4, p2, Lrd/c;->c:I

    .line 366
    .line 367
    iput p4, p2, Lrd/c;->d:I

    .line 368
    .line 369
    iget p1, p2, Lrd/c;->h:I

    .line 370
    .line 371
    if-ge p4, p1, :cond_12

    .line 372
    .line 373
    if-nez p4, :cond_11

    .line 374
    .line 375
    iget-object p1, p2, Lrd/c;->e:[Lrd/b;

    .line 376
    .line 377
    invoke-static {p1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    iget-object p1, p2, Lrd/c;->e:[Lrd/b;

    .line 381
    .line 382
    array-length p1, p1

    .line 383
    sub-int/2addr p1, v1

    .line 384
    iput p1, p2, Lrd/c;->f:I

    .line 385
    .line 386
    iput v3, p2, Lrd/c;->g:I

    .line 387
    .line 388
    iput v3, p2, Lrd/c;->h:I

    .line 389
    .line 390
    return-void

    .line 391
    :cond_11
    sub-int/2addr p1, p4

    .line 392
    invoke-virtual {p2, p1}, Lrd/c;->a(I)I

    .line 393
    .line 394
    .line 395
    :cond_12
    :goto_9
    return-void

    .line 396
    :goto_a
    :try_start_3
    monitor-exit p4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 397
    throw p1

    .line 398
    :cond_13
    const-string p1, "TYPE_SETTINGS length %% 6 != 0: %s"

    .line 399
    .line 400
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 401
    .line 402
    .line 403
    move-result-object p2

    .line 404
    new-array p3, v1, [Ljava/lang/Object;

    .line 405
    .line 406
    aput-object p2, p3, v3

    .line 407
    .line 408
    invoke-static {p1, p3}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    throw v2

    .line 412
    :cond_14
    const-string p1, "TYPE_SETTINGS streamId != 0"

    .line 413
    .line 414
    new-array p2, v3, [Ljava/lang/Object;

    .line 415
    .line 416
    invoke-static {p1, p2}, Lrd/j;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    throw v2

    .line 420
    nop

    .line 421
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method
