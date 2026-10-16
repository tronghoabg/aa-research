.class public final Landroidx/datastore/preferences/protobuf/N;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(ILjava/lang/Object;Ljava/lang/Object;)I
    .locals 20

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    check-cast v2, Landroidx/datastore/preferences/protobuf/M;

    .line 6
    .line 7
    move-object/from16 v3, p2

    .line 8
    .line 9
    check-cast v3, Landroidx/datastore/preferences/protobuf/L;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const/4 v5, 0x0

    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    return v5

    .line 19
    :cond_0
    invoke-virtual {v2}, Landroidx/datastore/preferences/protobuf/M;->entrySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_7

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Ljava/util/Map$Entry;

    .line 38
    .line 39
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static/range {p0 .. p0}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    iget-object v8, v3, Landroidx/datastore/preferences/protobuf/L;->a:Landroidx/datastore/preferences/protobuf/K;

    .line 55
    .line 56
    sget v9, Landroidx/datastore/preferences/protobuf/p;->c:I

    .line 57
    .line 58
    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    sget-object v10, Landroidx/datastore/preferences/protobuf/A0;->d:Landroidx/datastore/preferences/protobuf/x0;

    .line 63
    .line 64
    iget-object v11, v8, Landroidx/datastore/preferences/protobuf/K;->a:Landroidx/datastore/preferences/protobuf/w0;

    .line 65
    .line 66
    if-ne v11, v10, :cond_1

    .line 67
    .line 68
    mul-int/2addr v9, v0

    .line 69
    :cond_1
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 70
    .line 71
    .line 72
    move-result v11

    .line 73
    const/16 v12, 0x3f

    .line 74
    .line 75
    const-string v13, "There is no way to get here, but the compiler thinks otherwise."

    .line 76
    .line 77
    const/16 v14, 0x8

    .line 78
    .line 79
    const/4 v15, 0x4

    .line 80
    packed-switch v11, :pswitch_data_0

    .line 81
    .line 82
    .line 83
    new-instance v0, Ljava/lang/RuntimeException;

    .line 84
    .line 85
    invoke-direct {v0, v13}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v0

    .line 89
    :pswitch_0
    check-cast v6, Ljava/lang/Long;

    .line 90
    .line 91
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 92
    .line 93
    .line 94
    move-result-wide v16

    .line 95
    shl-long v18, v16, v1

    .line 96
    .line 97
    shr-long v16, v16, v12

    .line 98
    .line 99
    xor-long v16, v18, v16

    .line 100
    .line 101
    invoke-static/range {v16 .. v17}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    goto/16 :goto_4

    .line 106
    .line 107
    :pswitch_1
    check-cast v6, Ljava/lang/Integer;

    .line 108
    .line 109
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    shl-int/lit8 v11, v6, 0x1

    .line 114
    .line 115
    shr-int/lit8 v6, v6, 0x1f

    .line 116
    .line 117
    xor-int/2addr v6, v11

    .line 118
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    goto/16 :goto_4

    .line 123
    .line 124
    :pswitch_2
    check-cast v6, Ljava/lang/Long;

    .line 125
    .line 126
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    :goto_1
    move v6, v14

    .line 130
    goto/16 :goto_4

    .line 131
    .line 132
    :pswitch_3
    check-cast v6, Ljava/lang/Integer;

    .line 133
    .line 134
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    :goto_2
    move v6, v15

    .line 138
    goto/16 :goto_4

    .line 139
    .line 140
    :pswitch_4
    check-cast v6, Ljava/lang/Integer;

    .line 141
    .line 142
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/j;->w(I)I

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    goto/16 :goto_4

    .line 151
    .line 152
    :pswitch_5
    check-cast v6, Ljava/lang/Integer;

    .line 153
    .line 154
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    goto/16 :goto_4

    .line 163
    .line 164
    :pswitch_6
    instance-of v11, v6, Landroidx/datastore/preferences/protobuf/g;

    .line 165
    .line 166
    if-eqz v11, :cond_2

    .line 167
    .line 168
    check-cast v6, Landroidx/datastore/preferences/protobuf/g;

    .line 169
    .line 170
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/j;->s(Landroidx/datastore/preferences/protobuf/g;)I

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    goto/16 :goto_4

    .line 175
    .line 176
    :cond_2
    check-cast v6, [B

    .line 177
    .line 178
    array-length v6, v6

    .line 179
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 180
    .line 181
    .line 182
    move-result v11

    .line 183
    :goto_3
    add-int/2addr v6, v11

    .line 184
    goto/16 :goto_4

    .line 185
    .line 186
    :pswitch_7
    check-cast v6, Landroidx/datastore/preferences/protobuf/a;

    .line 187
    .line 188
    invoke-virtual {v6}, Landroidx/datastore/preferences/protobuf/a;->a()I

    .line 189
    .line 190
    .line 191
    move-result v6

    .line 192
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 193
    .line 194
    .line 195
    move-result v11

    .line 196
    goto :goto_3

    .line 197
    :pswitch_8
    check-cast v6, Landroidx/datastore/preferences/protobuf/a;

    .line 198
    .line 199
    invoke-virtual {v6}, Landroidx/datastore/preferences/protobuf/a;->a()I

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    goto :goto_4

    .line 204
    :pswitch_9
    instance-of v11, v6, Landroidx/datastore/preferences/protobuf/g;

    .line 205
    .line 206
    if-eqz v11, :cond_3

    .line 207
    .line 208
    check-cast v6, Landroidx/datastore/preferences/protobuf/g;

    .line 209
    .line 210
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/j;->s(Landroidx/datastore/preferences/protobuf/g;)I

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    goto :goto_4

    .line 215
    :cond_3
    check-cast v6, Ljava/lang/String;

    .line 216
    .line 217
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/j;->x(Ljava/lang/String;)I

    .line 218
    .line 219
    .line 220
    move-result v6

    .line 221
    goto :goto_4

    .line 222
    :pswitch_a
    check-cast v6, Ljava/lang/Boolean;

    .line 223
    .line 224
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    move v6, v1

    .line 228
    goto :goto_4

    .line 229
    :pswitch_b
    check-cast v6, Ljava/lang/Integer;

    .line 230
    .line 231
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    goto :goto_2

    .line 235
    :pswitch_c
    check-cast v6, Ljava/lang/Long;

    .line 236
    .line 237
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    goto :goto_1

    .line 241
    :pswitch_d
    check-cast v6, Ljava/lang/Integer;

    .line 242
    .line 243
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    invoke-static {v6}, Landroidx/datastore/preferences/protobuf/j;->w(I)I

    .line 248
    .line 249
    .line 250
    move-result v6

    .line 251
    goto :goto_4

    .line 252
    :pswitch_e
    check-cast v6, Ljava/lang/Long;

    .line 253
    .line 254
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 255
    .line 256
    .line 257
    move-result-wide v16

    .line 258
    invoke-static/range {v16 .. v17}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    goto :goto_4

    .line 263
    :pswitch_f
    check-cast v6, Ljava/lang/Long;

    .line 264
    .line 265
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 266
    .line 267
    .line 268
    move-result-wide v16

    .line 269
    invoke-static/range {v16 .. v17}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 270
    .line 271
    .line 272
    move-result v6

    .line 273
    goto :goto_4

    .line 274
    :pswitch_10
    check-cast v6, Ljava/lang/Float;

    .line 275
    .line 276
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    goto/16 :goto_2

    .line 280
    .line 281
    :pswitch_11
    check-cast v6, Ljava/lang/Double;

    .line 282
    .line 283
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    goto/16 :goto_1

    .line 287
    .line 288
    :goto_4
    add-int/2addr v6, v9

    .line 289
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/j;->y(I)I

    .line 290
    .line 291
    .line 292
    move-result v9

    .line 293
    iget-object v8, v8, Landroidx/datastore/preferences/protobuf/K;->b:Landroidx/datastore/preferences/protobuf/y0;

    .line 294
    .line 295
    if-ne v8, v10, :cond_4

    .line 296
    .line 297
    mul-int/2addr v9, v0

    .line 298
    :cond_4
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 299
    .line 300
    .line 301
    move-result v8

    .line 302
    packed-switch v8, :pswitch_data_1

    .line 303
    .line 304
    .line 305
    new-instance v0, Ljava/lang/RuntimeException;

    .line 306
    .line 307
    invoke-direct {v0, v13}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    throw v0

    .line 311
    :pswitch_12
    check-cast v4, Ljava/lang/Long;

    .line 312
    .line 313
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 314
    .line 315
    .line 316
    move-result-wide v10

    .line 317
    shl-long v13, v10, v1

    .line 318
    .line 319
    shr-long/2addr v10, v12

    .line 320
    xor-long/2addr v10, v13

    .line 321
    invoke-static {v10, v11}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 322
    .line 323
    .line 324
    move-result v14

    .line 325
    goto/16 :goto_7

    .line 326
    .line 327
    :pswitch_13
    check-cast v4, Ljava/lang/Integer;

    .line 328
    .line 329
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 330
    .line 331
    .line 332
    move-result v4

    .line 333
    shl-int/lit8 v8, v4, 0x1

    .line 334
    .line 335
    shr-int/lit8 v4, v4, 0x1f

    .line 336
    .line 337
    xor-int/2addr v4, v8

    .line 338
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 339
    .line 340
    .line 341
    move-result v14

    .line 342
    goto/16 :goto_7

    .line 343
    .line 344
    :pswitch_14
    check-cast v4, Ljava/lang/Long;

    .line 345
    .line 346
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    goto/16 :goto_7

    .line 350
    .line 351
    :pswitch_15
    check-cast v4, Ljava/lang/Integer;

    .line 352
    .line 353
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    :goto_5
    move v14, v15

    .line 357
    goto/16 :goto_7

    .line 358
    .line 359
    :pswitch_16
    check-cast v4, Ljava/lang/Integer;

    .line 360
    .line 361
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 362
    .line 363
    .line 364
    move-result v4

    .line 365
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/j;->w(I)I

    .line 366
    .line 367
    .line 368
    move-result v14

    .line 369
    goto/16 :goto_7

    .line 370
    .line 371
    :pswitch_17
    check-cast v4, Ljava/lang/Integer;

    .line 372
    .line 373
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 374
    .line 375
    .line 376
    move-result v4

    .line 377
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 378
    .line 379
    .line 380
    move-result v14

    .line 381
    goto/16 :goto_7

    .line 382
    .line 383
    :pswitch_18
    instance-of v8, v4, Landroidx/datastore/preferences/protobuf/g;

    .line 384
    .line 385
    if-eqz v8, :cond_5

    .line 386
    .line 387
    check-cast v4, Landroidx/datastore/preferences/protobuf/g;

    .line 388
    .line 389
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/j;->s(Landroidx/datastore/preferences/protobuf/g;)I

    .line 390
    .line 391
    .line 392
    move-result v14

    .line 393
    goto/16 :goto_7

    .line 394
    .line 395
    :cond_5
    check-cast v4, [B

    .line 396
    .line 397
    array-length v4, v4

    .line 398
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 399
    .line 400
    .line 401
    move-result v8

    .line 402
    :goto_6
    add-int v14, v8, v4

    .line 403
    .line 404
    goto :goto_7

    .line 405
    :pswitch_19
    check-cast v4, Landroidx/datastore/preferences/protobuf/a;

    .line 406
    .line 407
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/a;->a()I

    .line 408
    .line 409
    .line 410
    move-result v4

    .line 411
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/j;->z(I)I

    .line 412
    .line 413
    .line 414
    move-result v8

    .line 415
    goto :goto_6

    .line 416
    :pswitch_1a
    check-cast v4, Landroidx/datastore/preferences/protobuf/a;

    .line 417
    .line 418
    invoke-virtual {v4}, Landroidx/datastore/preferences/protobuf/a;->a()I

    .line 419
    .line 420
    .line 421
    move-result v14

    .line 422
    goto :goto_7

    .line 423
    :pswitch_1b
    instance-of v8, v4, Landroidx/datastore/preferences/protobuf/g;

    .line 424
    .line 425
    if-eqz v8, :cond_6

    .line 426
    .line 427
    check-cast v4, Landroidx/datastore/preferences/protobuf/g;

    .line 428
    .line 429
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/j;->s(Landroidx/datastore/preferences/protobuf/g;)I

    .line 430
    .line 431
    .line 432
    move-result v14

    .line 433
    goto :goto_7

    .line 434
    :cond_6
    check-cast v4, Ljava/lang/String;

    .line 435
    .line 436
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/j;->x(Ljava/lang/String;)I

    .line 437
    .line 438
    .line 439
    move-result v14

    .line 440
    goto :goto_7

    .line 441
    :pswitch_1c
    check-cast v4, Ljava/lang/Boolean;

    .line 442
    .line 443
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    move v14, v1

    .line 447
    goto :goto_7

    .line 448
    :pswitch_1d
    check-cast v4, Ljava/lang/Integer;

    .line 449
    .line 450
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    goto :goto_5

    .line 454
    :pswitch_1e
    check-cast v4, Ljava/lang/Long;

    .line 455
    .line 456
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    goto :goto_7

    .line 460
    :pswitch_1f
    check-cast v4, Ljava/lang/Integer;

    .line 461
    .line 462
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 463
    .line 464
    .line 465
    move-result v4

    .line 466
    invoke-static {v4}, Landroidx/datastore/preferences/protobuf/j;->w(I)I

    .line 467
    .line 468
    .line 469
    move-result v14

    .line 470
    goto :goto_7

    .line 471
    :pswitch_20
    check-cast v4, Ljava/lang/Long;

    .line 472
    .line 473
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 474
    .line 475
    .line 476
    move-result-wide v10

    .line 477
    invoke-static {v10, v11}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 478
    .line 479
    .line 480
    move-result v14

    .line 481
    goto :goto_7

    .line 482
    :pswitch_21
    check-cast v4, Ljava/lang/Long;

    .line 483
    .line 484
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 485
    .line 486
    .line 487
    move-result-wide v10

    .line 488
    invoke-static {v10, v11}, Landroidx/datastore/preferences/protobuf/j;->A(J)I

    .line 489
    .line 490
    .line 491
    move-result v14

    .line 492
    goto :goto_7

    .line 493
    :pswitch_22
    check-cast v4, Ljava/lang/Float;

    .line 494
    .line 495
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    goto/16 :goto_5

    .line 499
    .line 500
    :pswitch_23
    check-cast v4, Ljava/lang/Double;

    .line 501
    .line 502
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    :goto_7
    add-int/2addr v14, v9

    .line 506
    add-int/2addr v14, v6

    .line 507
    invoke-static {v14, v14, v7, v5}, LVa/M6;->i(IIII)I

    .line 508
    .line 509
    .line 510
    move-result v5

    .line 511
    goto/16 :goto_0

    .line 512
    .line 513
    :cond_7
    return v5

    .line 514
    nop

    .line 515
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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

    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch
.end method

.method public static b(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/M;
    .locals 1

    .line 1
    check-cast p0, Landroidx/datastore/preferences/protobuf/M;

    .line 2
    .line 3
    check-cast p1, Landroidx/datastore/preferences/protobuf/M;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, Landroidx/datastore/preferences/protobuf/M;->a:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/M;->c()Landroidx/datastore/preferences/protobuf/M;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_0
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/M;->a()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/M;->putAll(Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-object p0
.end method
