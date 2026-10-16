.class public final Lg2/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lg2/l;

.field public final b:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Lg2/o;Lg2/c;Landroid/net/Uri;)V
    .locals 43

    .line 1
    move-object/from16 v2, p2

    .line 2
    .line 3
    const-string v7, "MP4A-LATM"

    .line 4
    .line 5
    const-string v6, "L16"

    .line 6
    .line 7
    const-string v8, "L8"

    .line 8
    .line 9
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-object v5, v2, Lg2/c;->i:Ll8/j0;

    .line 13
    .line 14
    const-string v3, "control"

    .line 15
    .line 16
    invoke-virtual {v5, v3}, Ll8/j0;->containsKey(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    const/16 v21, 0x8

    .line 21
    .line 22
    const-string v11, "missing attribute control"

    .line 23
    .line 24
    invoke-static {v11, v4}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    new-instance v4, LN1/m;

    .line 28
    .line 29
    invoke-direct {v4}, LN1/m;-><init>()V

    .line 30
    .line 31
    .line 32
    iget v11, v2, Lg2/c;->e:I

    .line 33
    .line 34
    if-lez v11, :cond_0

    .line 35
    .line 36
    iput v11, v4, LN1/m;->h:I

    .line 37
    .line 38
    :cond_0
    iget-object v11, v2, Lg2/c;->j:Lg2/b;

    .line 39
    .line 40
    const/16 v22, 0x1

    .line 41
    .line 42
    iget-object v13, v11, Lg2/b;->b:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v13}, LA6/h;->P(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v12

    .line 48
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const-string v15, "audio/mp4a-latm"

    .line 52
    .line 53
    const-string v14, "audio/raw"

    .line 54
    .line 55
    const-string v10, "audio/3gpp"

    .line 56
    .line 57
    const-string v9, "video/x-vnd.on2.vp8"

    .line 58
    .line 59
    const-string v0, "video/x-vnd.on2.vp9"

    .line 60
    .line 61
    move-object/from16 v28, v3

    .line 62
    .line 63
    const-string v3, "video/avc"

    .line 64
    .line 65
    const-string v1, "video/hevc"

    .line 66
    .line 67
    move-object/from16 v29, v1

    .line 68
    .line 69
    const-string v1, "audio/opus"

    .line 70
    .line 71
    move-object/from16 v30, v15

    .line 72
    .line 73
    const-string v15, "audio/g711-alaw"

    .line 74
    .line 75
    move-object/from16 v31, v14

    .line 76
    .line 77
    const-string v14, "audio/g711-mlaw"

    .line 78
    .line 79
    move-object/from16 v32, v3

    .line 80
    .line 81
    const-string v3, "audio/amr-wb"

    .line 82
    .line 83
    move-object/from16 v33, v3

    .line 84
    .line 85
    const-string v3, "video/mp4v-es"

    .line 86
    .line 87
    move-object/from16 v34, v3

    .line 88
    .line 89
    const-string v3, "video/3gpp"

    .line 90
    .line 91
    move-object/from16 v35, v3

    .line 92
    .line 93
    const-string v3, "audio/ac3"

    .line 94
    .line 95
    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    .line 96
    .line 97
    .line 98
    move-result v36

    .line 99
    sparse-switch v36, :sswitch_data_0

    .line 100
    .line 101
    .line 102
    move-object/from16 v36, v10

    .line 103
    .line 104
    :goto_0
    const/4 v10, -0x1

    .line 105
    goto/16 :goto_2

    .line 106
    .line 107
    :sswitch_0
    move-object/from16 v36, v10

    .line 108
    .line 109
    const-string v10, "H263-2000"

    .line 110
    .line 111
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    if-nez v10, :cond_1

    .line 116
    .line 117
    goto/16 :goto_1

    .line 118
    .line 119
    :cond_1
    const/16 v10, 0x10

    .line 120
    .line 121
    goto/16 :goto_2

    .line 122
    .line 123
    :sswitch_1
    move-object/from16 v36, v10

    .line 124
    .line 125
    const-string v10, "H263-1998"

    .line 126
    .line 127
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    if-nez v10, :cond_2

    .line 132
    .line 133
    goto/16 :goto_1

    .line 134
    .line 135
    :cond_2
    const/16 v10, 0xf

    .line 136
    .line 137
    goto/16 :goto_2

    .line 138
    .line 139
    :sswitch_2
    move-object/from16 v36, v10

    .line 140
    .line 141
    const-string v10, "MP4V-ES"

    .line 142
    .line 143
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    if-nez v10, :cond_3

    .line 148
    .line 149
    goto/16 :goto_1

    .line 150
    .line 151
    :cond_3
    const/16 v10, 0xe

    .line 152
    .line 153
    goto/16 :goto_2

    .line 154
    .line 155
    :sswitch_3
    move-object/from16 v36, v10

    .line 156
    .line 157
    const-string v10, "AMR-WB"

    .line 158
    .line 159
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v10

    .line 163
    if-nez v10, :cond_4

    .line 164
    .line 165
    goto/16 :goto_1

    .line 166
    .line 167
    :cond_4
    const/16 v10, 0xd

    .line 168
    .line 169
    goto/16 :goto_2

    .line 170
    .line 171
    :sswitch_4
    move-object/from16 v36, v10

    .line 172
    .line 173
    invoke-virtual {v12, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v10

    .line 177
    if-nez v10, :cond_5

    .line 178
    .line 179
    goto/16 :goto_1

    .line 180
    .line 181
    :cond_5
    const/16 v10, 0xc

    .line 182
    .line 183
    goto/16 :goto_2

    .line 184
    .line 185
    :sswitch_5
    move-object/from16 v36, v10

    .line 186
    .line 187
    const-string v10, "PCMU"

    .line 188
    .line 189
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    if-nez v10, :cond_6

    .line 194
    .line 195
    goto/16 :goto_1

    .line 196
    .line 197
    :cond_6
    const/16 v10, 0xb

    .line 198
    .line 199
    goto/16 :goto_2

    .line 200
    .line 201
    :sswitch_6
    move-object/from16 v36, v10

    .line 202
    .line 203
    const-string v10, "PCMA"

    .line 204
    .line 205
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    if-nez v10, :cond_7

    .line 210
    .line 211
    goto/16 :goto_1

    .line 212
    .line 213
    :cond_7
    const/16 v10, 0xa

    .line 214
    .line 215
    goto/16 :goto_2

    .line 216
    .line 217
    :sswitch_7
    move-object/from16 v36, v10

    .line 218
    .line 219
    const-string v10, "OPUS"

    .line 220
    .line 221
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    if-nez v10, :cond_8

    .line 226
    .line 227
    goto/16 :goto_1

    .line 228
    .line 229
    :cond_8
    const/16 v10, 0x9

    .line 230
    .line 231
    goto/16 :goto_2

    .line 232
    .line 233
    :sswitch_8
    move-object/from16 v36, v10

    .line 234
    .line 235
    const-string v10, "H265"

    .line 236
    .line 237
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    if-nez v10, :cond_9

    .line 242
    .line 243
    goto/16 :goto_1

    .line 244
    .line 245
    :cond_9
    move/from16 v10, v21

    .line 246
    .line 247
    goto/16 :goto_2

    .line 248
    .line 249
    :sswitch_9
    move-object/from16 v36, v10

    .line 250
    .line 251
    const-string v10, "H264"

    .line 252
    .line 253
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v10

    .line 257
    if-nez v10, :cond_a

    .line 258
    .line 259
    goto/16 :goto_1

    .line 260
    .line 261
    :cond_a
    const/4 v10, 0x7

    .line 262
    goto/16 :goto_2

    .line 263
    .line 264
    :sswitch_a
    move-object/from16 v36, v10

    .line 265
    .line 266
    const-string v10, "VP9"

    .line 267
    .line 268
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v10

    .line 272
    if-nez v10, :cond_b

    .line 273
    .line 274
    goto :goto_1

    .line 275
    :cond_b
    const/4 v10, 0x6

    .line 276
    goto :goto_2

    .line 277
    :sswitch_b
    move-object/from16 v36, v10

    .line 278
    .line 279
    const-string v10, "VP8"

    .line 280
    .line 281
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v10

    .line 285
    if-nez v10, :cond_c

    .line 286
    .line 287
    goto :goto_1

    .line 288
    :cond_c
    const/4 v10, 0x5

    .line 289
    goto :goto_2

    .line 290
    :sswitch_c
    move-object/from16 v36, v10

    .line 291
    .line 292
    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v10

    .line 296
    if-nez v10, :cond_d

    .line 297
    .line 298
    goto :goto_1

    .line 299
    :cond_d
    const/4 v10, 0x4

    .line 300
    goto :goto_2

    .line 301
    :sswitch_d
    move-object/from16 v36, v10

    .line 302
    .line 303
    const-string v10, "AMR"

    .line 304
    .line 305
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v10

    .line 309
    if-nez v10, :cond_e

    .line 310
    .line 311
    goto :goto_1

    .line 312
    :cond_e
    const/4 v10, 0x3

    .line 313
    goto :goto_2

    .line 314
    :sswitch_e
    move-object/from16 v36, v10

    .line 315
    .line 316
    const-string v10, "AC3"

    .line 317
    .line 318
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v10

    .line 322
    if-nez v10, :cond_f

    .line 323
    .line 324
    goto :goto_1

    .line 325
    :cond_f
    const/4 v10, 0x2

    .line 326
    goto :goto_2

    .line 327
    :sswitch_f
    move-object/from16 v36, v10

    .line 328
    .line 329
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v10

    .line 333
    if-nez v10, :cond_10

    .line 334
    .line 335
    goto :goto_1

    .line 336
    :cond_10
    move/from16 v10, v22

    .line 337
    .line 338
    goto :goto_2

    .line 339
    :sswitch_10
    move-object/from16 v36, v10

    .line 340
    .line 341
    const-string v10, "MPEG4-GENERIC"

    .line 342
    .line 343
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v10

    .line 347
    if-nez v10, :cond_11

    .line 348
    .line 349
    :goto_1
    goto/16 :goto_0

    .line 350
    .line 351
    :cond_11
    const/4 v10, 0x0

    .line 352
    :goto_2
    packed-switch v10, :pswitch_data_0

    .line 353
    .line 354
    .line 355
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 356
    .line 357
    invoke-direct {v0, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    throw v0

    .line 361
    :pswitch_0
    move-object/from16 v10, v35

    .line 362
    .line 363
    goto :goto_3

    .line 364
    :pswitch_1
    move-object/from16 v10, v34

    .line 365
    .line 366
    goto :goto_3

    .line 367
    :pswitch_2
    move-object/from16 v10, v33

    .line 368
    .line 369
    goto :goto_3

    .line 370
    :pswitch_3
    move-object v10, v14

    .line 371
    goto :goto_3

    .line 372
    :pswitch_4
    move-object v10, v15

    .line 373
    goto :goto_3

    .line 374
    :pswitch_5
    move-object v10, v1

    .line 375
    goto :goto_3

    .line 376
    :pswitch_6
    move-object/from16 v10, v29

    .line 377
    .line 378
    goto :goto_3

    .line 379
    :pswitch_7
    move-object/from16 v10, v32

    .line 380
    .line 381
    goto :goto_3

    .line 382
    :pswitch_8
    move-object v10, v0

    .line 383
    goto :goto_3

    .line 384
    :pswitch_9
    move-object v10, v9

    .line 385
    goto :goto_3

    .line 386
    :pswitch_a
    move-object/from16 v10, v36

    .line 387
    .line 388
    goto :goto_3

    .line 389
    :pswitch_b
    move-object v10, v3

    .line 390
    goto :goto_3

    .line 391
    :pswitch_c
    move-object/from16 v10, v31

    .line 392
    .line 393
    goto :goto_3

    .line 394
    :pswitch_d
    move-object/from16 v10, v30

    .line 395
    .line 396
    :goto_3
    invoke-static {v10}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v12

    .line 400
    iput-object v12, v4, LN1/m;->m:Ljava/lang/String;

    .line 401
    .line 402
    iget-object v2, v2, Lg2/c;->a:Ljava/lang/String;

    .line 403
    .line 404
    const-string v12, "audio"

    .line 405
    .line 406
    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result v2

    .line 410
    iget v12, v11, Lg2/b;->c:I

    .line 411
    .line 412
    if-eqz v2, :cond_14

    .line 413
    .line 414
    iget v2, v11, Lg2/b;->d:I

    .line 415
    .line 416
    move-object/from16 v37, v11

    .line 417
    .line 418
    const/4 v11, -0x1

    .line 419
    if-eq v2, v11, :cond_12

    .line 420
    .line 421
    goto :goto_4

    .line 422
    :cond_12
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v2

    .line 426
    if-eqz v2, :cond_13

    .line 427
    .line 428
    const/4 v2, 0x6

    .line 429
    goto :goto_4

    .line 430
    :cond_13
    move/from16 v2, v22

    .line 431
    .line 432
    :goto_4
    iput v12, v4, LN1/m;->C:I

    .line 433
    .line 434
    iput v2, v4, LN1/m;->B:I

    .line 435
    .line 436
    move v11, v2

    .line 437
    goto :goto_5

    .line 438
    :cond_14
    move-object/from16 v37, v11

    .line 439
    .line 440
    const/4 v11, -0x1

    .line 441
    :goto_5
    const-string v2, "fmtp"

    .line 442
    .line 443
    invoke-virtual {v5, v2}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    check-cast v2, Ljava/lang/String;

    .line 448
    .line 449
    if-nez v2, :cond_15

    .line 450
    .line 451
    sget-object v2, Ll8/j0;->g:Ll8/j0;

    .line 452
    .line 453
    move-object/from16 v38, v5

    .line 454
    .line 455
    move-object/from16 v39, v7

    .line 456
    .line 457
    move/from16 p2, v12

    .line 458
    .line 459
    goto :goto_8

    .line 460
    :cond_15
    sget v38, LQ1/x;->a:I

    .line 461
    .line 462
    move-object/from16 v38, v5

    .line 463
    .line 464
    const-string v5, " "

    .line 465
    .line 466
    move-object/from16 v39, v7

    .line 467
    .line 468
    const/4 v7, 0x2

    .line 469
    invoke-virtual {v2, v5, v7}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v5

    .line 473
    move/from16 p2, v12

    .line 474
    .line 475
    array-length v12, v5

    .line 476
    if-ne v12, v7, :cond_16

    .line 477
    .line 478
    move/from16 v7, v22

    .line 479
    .line 480
    goto :goto_6

    .line 481
    :cond_16
    const/4 v7, 0x0

    .line 482
    :goto_6
    invoke-static {v2, v7}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 483
    .line 484
    .line 485
    aget-object v2, v5, v22

    .line 486
    .line 487
    const-string v5, ";\\s?"

    .line 488
    .line 489
    const/4 v7, 0x0

    .line 490
    invoke-virtual {v2, v5, v7}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v2

    .line 494
    new-instance v5, LE4/n;

    .line 495
    .line 496
    const/16 v7, 0x12

    .line 497
    .line 498
    const/4 v12, 0x4

    .line 499
    invoke-direct {v5, v12, v7}, LE4/n;-><init>(II)V

    .line 500
    .line 501
    .line 502
    array-length v7, v2

    .line 503
    const/4 v12, 0x0

    .line 504
    :goto_7
    if-ge v12, v7, :cond_17

    .line 505
    .line 506
    move-object/from16 v40, v2

    .line 507
    .line 508
    aget-object v2, v40, v12

    .line 509
    .line 510
    move/from16 v41, v7

    .line 511
    .line 512
    const-string v7, "="

    .line 513
    .line 514
    move/from16 v42, v12

    .line 515
    .line 516
    const/4 v12, 0x2

    .line 517
    invoke-virtual {v2, v7, v12}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    const/16 v25, 0x0

    .line 522
    .line 523
    aget-object v7, v2, v25

    .line 524
    .line 525
    aget-object v2, v2, v22

    .line 526
    .line 527
    invoke-virtual {v5, v7, v2}, LE4/n;->v(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 528
    .line 529
    .line 530
    add-int/lit8 v12, v42, 0x1

    .line 531
    .line 532
    move-object/from16 v2, v40

    .line 533
    .line 534
    move/from16 v7, v41

    .line 535
    .line 536
    goto :goto_7

    .line 537
    :cond_17
    invoke-virtual {v5}, LE4/n;->e()Ll8/j0;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    :goto_8
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    .line 542
    .line 543
    .line 544
    move-result v5

    .line 545
    sparse-switch v5, :sswitch_data_1

    .line 546
    .line 547
    .line 548
    goto/16 :goto_9

    .line 549
    .line 550
    :sswitch_11
    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    move-result v0

    .line 554
    if-eqz v0, :cond_18

    .line 555
    .line 556
    const/16 v16, 0xd

    .line 557
    .line 558
    goto/16 :goto_a

    .line 559
    .line 560
    :sswitch_12
    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    if-eqz v0, :cond_18

    .line 565
    .line 566
    const/16 v16, 0xc

    .line 567
    .line 568
    goto/16 :goto_a

    .line 569
    .line 570
    :sswitch_13
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move-result v0

    .line 574
    if-eqz v0, :cond_18

    .line 575
    .line 576
    const/16 v16, 0x9

    .line 577
    .line 578
    goto/16 :goto_a

    .line 579
    .line 580
    :sswitch_14
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result v0

    .line 584
    if-eqz v0, :cond_18

    .line 585
    .line 586
    move/from16 v16, v21

    .line 587
    .line 588
    goto/16 :goto_a

    .line 589
    .line 590
    :sswitch_15
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    move-result v0

    .line 594
    if-eqz v0, :cond_18

    .line 595
    .line 596
    const/16 v16, 0x3

    .line 597
    .line 598
    goto/16 :goto_a

    .line 599
    .line 600
    :sswitch_16
    move-object/from16 v0, v36

    .line 601
    .line 602
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    move-result v0

    .line 606
    if-eqz v0, :cond_18

    .line 607
    .line 608
    move/from16 v16, v22

    .line 609
    .line 610
    goto :goto_a

    .line 611
    :sswitch_17
    move-object/from16 v0, v32

    .line 612
    .line 613
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result v0

    .line 617
    if-eqz v0, :cond_18

    .line 618
    .line 619
    const/16 v16, 0x6

    .line 620
    .line 621
    goto :goto_a

    .line 622
    :sswitch_18
    move-object/from16 v0, v34

    .line 623
    .line 624
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 625
    .line 626
    .line 627
    move-result v0

    .line 628
    if-eqz v0, :cond_18

    .line 629
    .line 630
    const/16 v16, 0x4

    .line 631
    .line 632
    goto :goto_a

    .line 633
    :sswitch_19
    move-object/from16 v0, v31

    .line 634
    .line 635
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 636
    .line 637
    .line 638
    move-result v0

    .line 639
    if-eqz v0, :cond_18

    .line 640
    .line 641
    const/16 v16, 0xa

    .line 642
    .line 643
    goto :goto_a

    .line 644
    :sswitch_1a
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 645
    .line 646
    .line 647
    move-result v0

    .line 648
    if-eqz v0, :cond_18

    .line 649
    .line 650
    const/16 v16, 0xb

    .line 651
    .line 652
    goto :goto_a

    .line 653
    :sswitch_1b
    move-object/from16 v0, v30

    .line 654
    .line 655
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    move-result v0

    .line 659
    if-eqz v0, :cond_18

    .line 660
    .line 661
    const/16 v16, 0x0

    .line 662
    .line 663
    goto :goto_a

    .line 664
    :sswitch_1c
    move-object/from16 v0, v33

    .line 665
    .line 666
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 667
    .line 668
    .line 669
    move-result v0

    .line 670
    if-eqz v0, :cond_18

    .line 671
    .line 672
    const/16 v16, 0x2

    .line 673
    .line 674
    goto :goto_a

    .line 675
    :sswitch_1d
    move-object/from16 v0, v29

    .line 676
    .line 677
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    move-result v0

    .line 681
    if-eqz v0, :cond_18

    .line 682
    .line 683
    const/16 v16, 0x7

    .line 684
    .line 685
    goto :goto_a

    .line 686
    :sswitch_1e
    move-object/from16 v0, v35

    .line 687
    .line 688
    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    move-result v0

    .line 692
    if-eqz v0, :cond_18

    .line 693
    .line 694
    const/16 v16, 0x5

    .line 695
    .line 696
    goto :goto_a

    .line 697
    :cond_18
    :goto_9
    const/16 v16, -0x1

    .line 698
    .line 699
    :goto_a
    const-string v0, "config"

    .line 700
    .line 701
    const/16 v1, 0x120

    .line 702
    .line 703
    const/16 v3, 0x160

    .line 704
    .line 705
    const/16 v5, 0x140

    .line 706
    .line 707
    const-string v7, "profile-level-id"

    .line 708
    .line 709
    const-string v9, "missing attribute fmtp"

    .line 710
    .line 711
    const/16 v10, 0xf0

    .line 712
    .line 713
    packed-switch v16, :pswitch_data_1

    .line 714
    .line 715
    .line 716
    :goto_b
    move/from16 v1, p2

    .line 717
    .line 718
    move/from16 v8, v22

    .line 719
    .line 720
    :goto_c
    const/4 v9, 0x0

    .line 721
    goto/16 :goto_28

    .line 722
    .line 723
    :pswitch_e
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 724
    .line 725
    .line 726
    move-result v0

    .line 727
    if-nez v0, :cond_1a

    .line 728
    .line 729
    invoke-virtual {v13, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 730
    .line 731
    .line 732
    move-result v0

    .line 733
    if-eqz v0, :cond_19

    .line 734
    .line 735
    goto :goto_d

    .line 736
    :cond_19
    const/4 v0, 0x0

    .line 737
    goto :goto_e

    .line 738
    :cond_1a
    :goto_d
    move/from16 v0, v22

    .line 739
    .line 740
    :goto_e
    invoke-static {v0}, LQ1/k;->c(Z)V

    .line 741
    .line 742
    .line 743
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 744
    .line 745
    .line 746
    move-result v0

    .line 747
    if-eqz v0, :cond_1b

    .line 748
    .line 749
    const/4 v12, 0x3

    .line 750
    goto :goto_f

    .line 751
    :cond_1b
    const/high16 v12, 0x10000000

    .line 752
    .line 753
    :goto_f
    iput v12, v4, LN1/m;->D:I

    .line 754
    .line 755
    goto :goto_b

    .line 756
    :pswitch_f
    iput v5, v4, LN1/m;->t:I

    .line 757
    .line 758
    iput v10, v4, LN1/m;->u:I

    .line 759
    .line 760
    goto :goto_b

    .line 761
    :pswitch_10
    iput v5, v4, LN1/m;->t:I

    .line 762
    .line 763
    iput v10, v4, LN1/m;->u:I

    .line 764
    .line 765
    goto :goto_b

    .line 766
    :pswitch_11
    invoke-virtual {v2}, Ll8/j0;->isEmpty()Z

    .line 767
    .line 768
    .line 769
    move-result v0

    .line 770
    xor-int/lit8 v0, v0, 0x1

    .line 771
    .line 772
    invoke-static {v9, v0}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 773
    .line 774
    .line 775
    const-string v0, "sprop-max-don-diff"

    .line 776
    .line 777
    invoke-virtual {v2, v0}, Ll8/j0;->containsKey(Ljava/lang/Object;)Z

    .line 778
    .line 779
    .line 780
    move-result v1

    .line 781
    if-eqz v1, :cond_1d

    .line 782
    .line 783
    invoke-virtual {v2, v0}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    check-cast v0, Ljava/lang/String;

    .line 788
    .line 789
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 790
    .line 791
    .line 792
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 793
    .line 794
    .line 795
    move-result v0

    .line 796
    if-nez v0, :cond_1c

    .line 797
    .line 798
    move/from16 v1, v22

    .line 799
    .line 800
    goto :goto_10

    .line 801
    :cond_1c
    const/4 v1, 0x0

    .line 802
    :goto_10
    new-instance v3, Ljava/lang/StringBuilder;

    .line 803
    .line 804
    const-string v5, "non-zero sprop-max-don-diff "

    .line 805
    .line 806
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 807
    .line 808
    .line 809
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 810
    .line 811
    .line 812
    const-string v0, " is not supported"

    .line 813
    .line 814
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 815
    .line 816
    .line 817
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    invoke-static {v0, v1}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 822
    .line 823
    .line 824
    :cond_1d
    const-string v0, "sprop-vps"

    .line 825
    .line 826
    invoke-virtual {v2, v0}, Ll8/j0;->containsKey(Ljava/lang/Object;)Z

    .line 827
    .line 828
    .line 829
    move-result v1

    .line 830
    const-string v3, "missing sprop-vps parameter"

    .line 831
    .line 832
    invoke-static {v3, v1}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 833
    .line 834
    .line 835
    invoke-virtual {v2, v0}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    check-cast v0, Ljava/lang/String;

    .line 840
    .line 841
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 842
    .line 843
    .line 844
    const-string v1, "sprop-sps"

    .line 845
    .line 846
    invoke-virtual {v2, v1}, Ll8/j0;->containsKey(Ljava/lang/Object;)Z

    .line 847
    .line 848
    .line 849
    move-result v3

    .line 850
    const-string v5, "missing sprop-sps parameter"

    .line 851
    .line 852
    invoke-static {v5, v3}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 853
    .line 854
    .line 855
    invoke-virtual {v2, v1}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 856
    .line 857
    .line 858
    move-result-object v1

    .line 859
    check-cast v1, Ljava/lang/String;

    .line 860
    .line 861
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 862
    .line 863
    .line 864
    const-string v3, "sprop-pps"

    .line 865
    .line 866
    invoke-virtual {v2, v3}, Ll8/j0;->containsKey(Ljava/lang/Object;)Z

    .line 867
    .line 868
    .line 869
    move-result v5

    .line 870
    const-string v6, "missing sprop-pps parameter"

    .line 871
    .line 872
    invoke-static {v6, v5}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 873
    .line 874
    .line 875
    invoke-virtual {v2, v3}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v3

    .line 879
    check-cast v3, Ljava/lang/String;

    .line 880
    .line 881
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 882
    .line 883
    .line 884
    invoke-static {v0}, Lg2/w;->a(Ljava/lang/String;)[B

    .line 885
    .line 886
    .line 887
    move-result-object v0

    .line 888
    invoke-static {v1}, Lg2/w;->a(Ljava/lang/String;)[B

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    invoke-static {v3}, Lg2/w;->a(Ljava/lang/String;)[B

    .line 893
    .line 894
    .line 895
    move-result-object v3

    .line 896
    const/4 v5, 0x3

    .line 897
    new-array v6, v5, [Ljava/lang/Object;

    .line 898
    .line 899
    const/16 v25, 0x0

    .line 900
    .line 901
    aput-object v0, v6, v25

    .line 902
    .line 903
    aput-object v1, v6, v22

    .line 904
    .line 905
    const/16 v26, 0x2

    .line 906
    .line 907
    aput-object v3, v6, v26

    .line 908
    .line 909
    invoke-static {v5, v6}, Ll8/s;->b(I[Ljava/lang/Object;)V

    .line 910
    .line 911
    .line 912
    invoke-static {v5, v6}, Ll8/K;->h(I[Ljava/lang/Object;)Ll8/e0;

    .line 913
    .line 914
    .line 915
    move-result-object v0

    .line 916
    iput-object v0, v4, LN1/m;->p:Ljava/util/List;

    .line 917
    .line 918
    move/from16 v1, v22

    .line 919
    .line 920
    invoke-virtual {v0, v1}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    check-cast v0, [B

    .line 925
    .line 926
    array-length v1, v0

    .line 927
    const/4 v3, 0x0

    .line 928
    const/4 v12, 0x4

    .line 929
    invoke-static {v0, v12, v1, v3}, LR1/n;->g([BIILVa/X7;)LR1/j;

    .line 930
    .line 931
    .line 932
    move-result-object v0

    .line 933
    iget v1, v0, LR1/j;->f:F

    .line 934
    .line 935
    iput v1, v4, LN1/m;->x:F

    .line 936
    .line 937
    iget v1, v0, LR1/j;->e:I

    .line 938
    .line 939
    iput v1, v4, LN1/m;->u:I

    .line 940
    .line 941
    iget v1, v0, LR1/j;->d:I

    .line 942
    .line 943
    iput v1, v4, LN1/m;->t:I

    .line 944
    .line 945
    iget v1, v0, LR1/j;->b:I

    .line 946
    .line 947
    add-int/lit8 v9, v1, 0x8

    .line 948
    .line 949
    iget v1, v0, LR1/j;->c:I

    .line 950
    .line 951
    add-int/lit8 v10, v1, 0x8

    .line 952
    .line 953
    new-instance v5, LN1/f;

    .line 954
    .line 955
    iget v8, v0, LR1/j;->j:I

    .line 956
    .line 957
    const/4 v11, 0x0

    .line 958
    iget v6, v0, LR1/j;->h:I

    .line 959
    .line 960
    iget v7, v0, LR1/j;->i:I

    .line 961
    .line 962
    invoke-direct/range {v5 .. v11}, LN1/f;-><init>(IIIII[B)V

    .line 963
    .line 964
    .line 965
    iput-object v5, v4, LN1/m;->A:LN1/f;

    .line 966
    .line 967
    iget-object v0, v0, LR1/j;->a:LR1/g;

    .line 968
    .line 969
    if-eqz v0, :cond_1e

    .line 970
    .line 971
    iget-object v9, v0, LR1/g;->e:[I

    .line 972
    .line 973
    iget v10, v0, LR1/g;->f:I

    .line 974
    .line 975
    iget v5, v0, LR1/g;->a:I

    .line 976
    .line 977
    iget-boolean v6, v0, LR1/g;->b:Z

    .line 978
    .line 979
    iget v7, v0, LR1/g;->c:I

    .line 980
    .line 981
    iget v8, v0, LR1/g;->d:I

    .line 982
    .line 983
    invoke-static/range {v5 .. v10}, LQ1/a;->b(IZII[II)Ljava/lang/String;

    .line 984
    .line 985
    .line 986
    move-result-object v0

    .line 987
    iput-object v0, v4, LN1/m;->j:Ljava/lang/String;

    .line 988
    .line 989
    :cond_1e
    :goto_11
    move/from16 v1, p2

    .line 990
    .line 991
    :goto_12
    const/4 v8, 0x1

    .line 992
    goto/16 :goto_c

    .line 993
    .line 994
    :pswitch_12
    invoke-virtual {v2}, Ll8/j0;->isEmpty()Z

    .line 995
    .line 996
    .line 997
    move-result v0

    .line 998
    const/16 v22, 0x1

    .line 999
    .line 1000
    xor-int/lit8 v0, v0, 0x1

    .line 1001
    .line 1002
    invoke-static {v9, v0}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 1003
    .line 1004
    .line 1005
    const-string v0, "sprop-parameter-sets"

    .line 1006
    .line 1007
    invoke-virtual {v2, v0}, Ll8/j0;->containsKey(Ljava/lang/Object;)Z

    .line 1008
    .line 1009
    .line 1010
    move-result v1

    .line 1011
    const-string v3, "missing sprop parameter"

    .line 1012
    .line 1013
    invoke-static {v3, v1}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v2, v0}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v0

    .line 1020
    check-cast v0, Ljava/lang/String;

    .line 1021
    .line 1022
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1023
    .line 1024
    .line 1025
    sget v1, LQ1/x;->a:I

    .line 1026
    .line 1027
    const-string v1, ","

    .line 1028
    .line 1029
    const/4 v11, -0x1

    .line 1030
    invoke-virtual {v0, v1, v11}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    array-length v1, v0

    .line 1035
    const/4 v12, 0x2

    .line 1036
    if-ne v1, v12, :cond_1f

    .line 1037
    .line 1038
    const/4 v1, 0x1

    .line 1039
    goto :goto_13

    .line 1040
    :cond_1f
    const/4 v1, 0x0

    .line 1041
    :goto_13
    const-string v3, "empty sprop value"

    .line 1042
    .line 1043
    invoke-static {v3, v1}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 1044
    .line 1045
    .line 1046
    const/4 v1, 0x0

    .line 1047
    aget-object v3, v0, v1

    .line 1048
    .line 1049
    invoke-static {v3}, Lg2/w;->a(Ljava/lang/String;)[B

    .line 1050
    .line 1051
    .line 1052
    move-result-object v3

    .line 1053
    const/16 v22, 0x1

    .line 1054
    .line 1055
    aget-object v0, v0, v22

    .line 1056
    .line 1057
    invoke-static {v0}, Lg2/w;->a(Ljava/lang/String;)[B

    .line 1058
    .line 1059
    .line 1060
    move-result-object v0

    .line 1061
    invoke-static {v3, v0}, Ll8/K;->o(Ljava/lang/Object;Ljava/lang/Object;)Ll8/e0;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    iput-object v0, v4, LN1/m;->p:Ljava/util/List;

    .line 1066
    .line 1067
    invoke-virtual {v0, v1}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v0

    .line 1071
    check-cast v0, [B

    .line 1072
    .line 1073
    array-length v1, v0

    .line 1074
    const/4 v12, 0x4

    .line 1075
    invoke-static {v12, v1, v0}, LR1/n;->i(II[B)LR1/m;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    iget v1, v0, LR1/m;->g:F

    .line 1080
    .line 1081
    iput v1, v4, LN1/m;->x:F

    .line 1082
    .line 1083
    iget v1, v0, LR1/m;->f:I

    .line 1084
    .line 1085
    iput v1, v4, LN1/m;->u:I

    .line 1086
    .line 1087
    iget v1, v0, LR1/m;->e:I

    .line 1088
    .line 1089
    iput v1, v4, LN1/m;->t:I

    .line 1090
    .line 1091
    iget v1, v0, LR1/m;->h:I

    .line 1092
    .line 1093
    add-int/lit8 v18, v1, 0x8

    .line 1094
    .line 1095
    iget v1, v0, LR1/m;->i:I

    .line 1096
    .line 1097
    add-int/lit8 v19, v1, 0x8

    .line 1098
    .line 1099
    new-instance v14, LN1/f;

    .line 1100
    .line 1101
    iget v1, v0, LR1/m;->r:I

    .line 1102
    .line 1103
    const/16 v20, 0x0

    .line 1104
    .line 1105
    iget v15, v0, LR1/m;->p:I

    .line 1106
    .line 1107
    iget v3, v0, LR1/m;->q:I

    .line 1108
    .line 1109
    move/from16 v17, v1

    .line 1110
    .line 1111
    move/from16 v16, v3

    .line 1112
    .line 1113
    invoke-direct/range {v14 .. v20}, LN1/f;-><init>(IIIII[B)V

    .line 1114
    .line 1115
    .line 1116
    iput-object v14, v4, LN1/m;->A:LN1/f;

    .line 1117
    .line 1118
    invoke-virtual {v2, v7}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v1

    .line 1122
    check-cast v1, Ljava/lang/String;

    .line 1123
    .line 1124
    if-eqz v1, :cond_20

    .line 1125
    .line 1126
    const-string v0, "avc1."

    .line 1127
    .line 1128
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v0

    .line 1132
    iput-object v0, v4, LN1/m;->j:Ljava/lang/String;

    .line 1133
    .line 1134
    goto/16 :goto_11

    .line 1135
    .line 1136
    :cond_20
    iget v1, v0, LR1/m;->b:I

    .line 1137
    .line 1138
    iget v3, v0, LR1/m;->c:I

    .line 1139
    .line 1140
    iget v0, v0, LR1/m;->a:I

    .line 1141
    .line 1142
    invoke-static {v0, v1, v3}, LQ1/a;->a(III)Ljava/lang/String;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v0

    .line 1146
    iput-object v0, v4, LN1/m;->j:Ljava/lang/String;

    .line 1147
    .line 1148
    goto/16 :goto_11

    .line 1149
    .line 1150
    :pswitch_13
    iput v3, v4, LN1/m;->t:I

    .line 1151
    .line 1152
    iput v1, v4, LN1/m;->u:I

    .line 1153
    .line 1154
    goto/16 :goto_11

    .line 1155
    .line 1156
    :pswitch_14
    invoke-virtual {v2}, Ll8/j0;->isEmpty()Z

    .line 1157
    .line 1158
    .line 1159
    move-result v5

    .line 1160
    const/16 v22, 0x1

    .line 1161
    .line 1162
    xor-int/lit8 v5, v5, 0x1

    .line 1163
    .line 1164
    invoke-static {v5}, LQ1/k;->c(Z)V

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v2, v0}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v0

    .line 1171
    check-cast v0, Ljava/lang/String;

    .line 1172
    .line 1173
    if-eqz v0, :cond_2b

    .line 1174
    .line 1175
    invoke-static {v0}, LQ1/x;->r(Ljava/lang/String;)[B

    .line 1176
    .line 1177
    .line 1178
    move-result-object v0

    .line 1179
    invoke-static {v0}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v1

    .line 1183
    iput-object v1, v4, LN1/m;->p:Ljava/util/List;

    .line 1184
    .line 1185
    sget-object v1, LQ1/a;->a:[B

    .line 1186
    .line 1187
    new-instance v1, LQ1/o;

    .line 1188
    .line 1189
    invoke-direct {v1, v0}, LQ1/o;-><init>([B)V

    .line 1190
    .line 1191
    .line 1192
    const/4 v3, 0x0

    .line 1193
    :goto_14
    const/16 v23, 0x3

    .line 1194
    .line 1195
    add-int/lit8 v12, v3, 0x3

    .line 1196
    .line 1197
    array-length v5, v0

    .line 1198
    if-ge v12, v5, :cond_23

    .line 1199
    .line 1200
    invoke-virtual {v1}, LQ1/o;->x()I

    .line 1201
    .line 1202
    .line 1203
    move-result v5

    .line 1204
    const/4 v6, 0x1

    .line 1205
    if-ne v5, v6, :cond_22

    .line 1206
    .line 1207
    aget-byte v5, v0, v12

    .line 1208
    .line 1209
    and-int/2addr v5, v10

    .line 1210
    const/16 v6, 0x20

    .line 1211
    .line 1212
    if-eq v5, v6, :cond_21

    .line 1213
    .line 1214
    goto :goto_16

    .line 1215
    :cond_21
    const/4 v1, 0x1

    .line 1216
    :goto_15
    const/4 v6, 0x1

    .line 1217
    goto :goto_17

    .line 1218
    :cond_22
    :goto_16
    iget v5, v1, LQ1/o;->b:I

    .line 1219
    .line 1220
    const/16 v26, 0x2

    .line 1221
    .line 1222
    add-int/lit8 v5, v5, -0x2

    .line 1223
    .line 1224
    invoke-virtual {v1, v5}, LQ1/o;->G(I)V

    .line 1225
    .line 1226
    .line 1227
    const/4 v6, 0x1

    .line 1228
    add-int/2addr v3, v6

    .line 1229
    goto :goto_14

    .line 1230
    :cond_23
    const/4 v1, 0x0

    .line 1231
    goto :goto_15

    .line 1232
    :goto_17
    const-string v5, "Invalid input: VOL not found."

    .line 1233
    .line 1234
    invoke-static {v5, v1}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 1235
    .line 1236
    .line 1237
    new-instance v1, LJ5/y;

    .line 1238
    .line 1239
    array-length v5, v0

    .line 1240
    const/4 v8, 0x0

    .line 1241
    invoke-direct {v1, v0, v5, v6, v8}, LJ5/y;-><init>([BIIB)V

    .line 1242
    .line 1243
    .line 1244
    const/4 v12, 0x4

    .line 1245
    add-int/2addr v3, v12

    .line 1246
    mul-int/lit8 v3, v3, 0x8

    .line 1247
    .line 1248
    invoke-virtual {v1, v3}, LJ5/y;->t(I)V

    .line 1249
    .line 1250
    .line 1251
    invoke-virtual {v1, v6}, LJ5/y;->t(I)V

    .line 1252
    .line 1253
    .line 1254
    move/from16 v0, v21

    .line 1255
    .line 1256
    invoke-virtual {v1, v0}, LJ5/y;->t(I)V

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v1}, LJ5/y;->h()Z

    .line 1260
    .line 1261
    .line 1262
    move-result v3

    .line 1263
    if-eqz v3, :cond_24

    .line 1264
    .line 1265
    invoke-virtual {v1, v12}, LJ5/y;->t(I)V

    .line 1266
    .line 1267
    .line 1268
    const/4 v5, 0x3

    .line 1269
    invoke-virtual {v1, v5}, LJ5/y;->t(I)V

    .line 1270
    .line 1271
    .line 1272
    :cond_24
    invoke-virtual {v1, v12}, LJ5/y;->i(I)I

    .line 1273
    .line 1274
    .line 1275
    move-result v3

    .line 1276
    const/16 v5, 0xf

    .line 1277
    .line 1278
    if-ne v3, v5, :cond_25

    .line 1279
    .line 1280
    invoke-virtual {v1, v0}, LJ5/y;->t(I)V

    .line 1281
    .line 1282
    .line 1283
    invoke-virtual {v1, v0}, LJ5/y;->t(I)V

    .line 1284
    .line 1285
    .line 1286
    :cond_25
    invoke-virtual {v1}, LJ5/y;->h()Z

    .line 1287
    .line 1288
    .line 1289
    move-result v0

    .line 1290
    const/4 v12, 0x2

    .line 1291
    if-eqz v0, :cond_26

    .line 1292
    .line 1293
    invoke-virtual {v1, v12}, LJ5/y;->t(I)V

    .line 1294
    .line 1295
    .line 1296
    const/4 v6, 0x1

    .line 1297
    invoke-virtual {v1, v6}, LJ5/y;->t(I)V

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual {v1}, LJ5/y;->h()Z

    .line 1301
    .line 1302
    .line 1303
    move-result v0

    .line 1304
    if-eqz v0, :cond_26

    .line 1305
    .line 1306
    const/16 v0, 0x4f

    .line 1307
    .line 1308
    invoke-virtual {v1, v0}, LJ5/y;->t(I)V

    .line 1309
    .line 1310
    .line 1311
    :cond_26
    invoke-virtual {v1, v12}, LJ5/y;->i(I)I

    .line 1312
    .line 1313
    .line 1314
    move-result v0

    .line 1315
    if-nez v0, :cond_27

    .line 1316
    .line 1317
    const/4 v0, 0x1

    .line 1318
    goto :goto_18

    .line 1319
    :cond_27
    const/4 v0, 0x0

    .line 1320
    :goto_18
    const-string v3, "Only supports rectangular video object layer shape."

    .line 1321
    .line 1322
    invoke-static {v3, v0}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 1323
    .line 1324
    .line 1325
    invoke-virtual {v1}, LJ5/y;->h()Z

    .line 1326
    .line 1327
    .line 1328
    move-result v0

    .line 1329
    invoke-static {v0}, LQ1/k;->c(Z)V

    .line 1330
    .line 1331
    .line 1332
    const/16 v0, 0x10

    .line 1333
    .line 1334
    invoke-virtual {v1, v0}, LJ5/y;->i(I)I

    .line 1335
    .line 1336
    .line 1337
    move-result v0

    .line 1338
    invoke-virtual {v1}, LJ5/y;->h()Z

    .line 1339
    .line 1340
    .line 1341
    move-result v3

    .line 1342
    invoke-static {v3}, LQ1/k;->c(Z)V

    .line 1343
    .line 1344
    .line 1345
    invoke-virtual {v1}, LJ5/y;->h()Z

    .line 1346
    .line 1347
    .line 1348
    move-result v3

    .line 1349
    if-eqz v3, :cond_2a

    .line 1350
    .line 1351
    if-lez v0, :cond_28

    .line 1352
    .line 1353
    const/4 v3, 0x1

    .line 1354
    goto :goto_19

    .line 1355
    :cond_28
    const/4 v3, 0x0

    .line 1356
    :goto_19
    invoke-static {v3}, LQ1/k;->c(Z)V

    .line 1357
    .line 1358
    .line 1359
    const/16 v27, -0x1

    .line 1360
    .line 1361
    add-int/lit8 v0, v0, -0x1

    .line 1362
    .line 1363
    const/4 v3, 0x0

    .line 1364
    :goto_1a
    if-lez v0, :cond_29

    .line 1365
    .line 1366
    const/16 v22, 0x1

    .line 1367
    .line 1368
    add-int/lit8 v3, v3, 0x1

    .line 1369
    .line 1370
    shr-int/lit8 v0, v0, 0x1

    .line 1371
    .line 1372
    goto :goto_1a

    .line 1373
    :cond_29
    invoke-virtual {v1, v3}, LJ5/y;->t(I)V

    .line 1374
    .line 1375
    .line 1376
    :cond_2a
    invoke-virtual {v1}, LJ5/y;->h()Z

    .line 1377
    .line 1378
    .line 1379
    move-result v0

    .line 1380
    invoke-static {v0}, LQ1/k;->c(Z)V

    .line 1381
    .line 1382
    .line 1383
    const/16 v0, 0xd

    .line 1384
    .line 1385
    invoke-virtual {v1, v0}, LJ5/y;->i(I)I

    .line 1386
    .line 1387
    .line 1388
    move-result v3

    .line 1389
    invoke-virtual {v1}, LJ5/y;->h()Z

    .line 1390
    .line 1391
    .line 1392
    move-result v5

    .line 1393
    invoke-static {v5}, LQ1/k;->c(Z)V

    .line 1394
    .line 1395
    .line 1396
    invoke-virtual {v1, v0}, LJ5/y;->i(I)I

    .line 1397
    .line 1398
    .line 1399
    move-result v0

    .line 1400
    invoke-virtual {v1}, LJ5/y;->h()Z

    .line 1401
    .line 1402
    .line 1403
    move-result v5

    .line 1404
    invoke-static {v5}, LQ1/k;->c(Z)V

    .line 1405
    .line 1406
    .line 1407
    const/4 v6, 0x1

    .line 1408
    invoke-virtual {v1, v6}, LJ5/y;->t(I)V

    .line 1409
    .line 1410
    .line 1411
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v1

    .line 1415
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v0

    .line 1419
    invoke-static {v1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v0

    .line 1423
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1424
    .line 1425
    check-cast v1, Ljava/lang/Integer;

    .line 1426
    .line 1427
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1428
    .line 1429
    .line 1430
    move-result v1

    .line 1431
    iput v1, v4, LN1/m;->t:I

    .line 1432
    .line 1433
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1434
    .line 1435
    check-cast v0, Ljava/lang/Integer;

    .line 1436
    .line 1437
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1438
    .line 1439
    .line 1440
    move-result v0

    .line 1441
    iput v0, v4, LN1/m;->u:I

    .line 1442
    .line 1443
    goto :goto_1b

    .line 1444
    :cond_2b
    iput v3, v4, LN1/m;->t:I

    .line 1445
    .line 1446
    iput v1, v4, LN1/m;->u:I

    .line 1447
    .line 1448
    :goto_1b
    invoke-virtual {v2, v7}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v0

    .line 1452
    check-cast v0, Ljava/lang/String;

    .line 1453
    .line 1454
    if-nez v0, :cond_2c

    .line 1455
    .line 1456
    const-string v0, "1"

    .line 1457
    .line 1458
    :cond_2c
    const-string v1, "mp4v."

    .line 1459
    .line 1460
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v0

    .line 1464
    iput-object v0, v4, LN1/m;->j:Ljava/lang/String;

    .line 1465
    .line 1466
    goto/16 :goto_11

    .line 1467
    .line 1468
    :pswitch_15
    const/4 v0, -0x1

    .line 1469
    if-eq v11, v0, :cond_2d

    .line 1470
    .line 1471
    const/4 v0, 0x1

    .line 1472
    goto :goto_1c

    .line 1473
    :cond_2d
    const/4 v0, 0x0

    .line 1474
    :goto_1c
    invoke-static {v0}, LQ1/k;->c(Z)V

    .line 1475
    .line 1476
    .line 1477
    const v0, 0xbb80

    .line 1478
    .line 1479
    .line 1480
    move/from16 v1, p2

    .line 1481
    .line 1482
    if-ne v1, v0, :cond_2e

    .line 1483
    .line 1484
    const/4 v0, 0x1

    .line 1485
    goto :goto_1d

    .line 1486
    :cond_2e
    const/4 v0, 0x0

    .line 1487
    :goto_1d
    const-string v3, "Invalid OPUS clock rate."

    .line 1488
    .line 1489
    invoke-static {v3, v0}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 1490
    .line 1491
    .line 1492
    goto/16 :goto_12

    .line 1493
    .line 1494
    :pswitch_16
    move/from16 v1, p2

    .line 1495
    .line 1496
    move/from16 v6, v22

    .line 1497
    .line 1498
    if-ne v11, v6, :cond_2f

    .line 1499
    .line 1500
    move v0, v6

    .line 1501
    goto :goto_1e

    .line 1502
    :cond_2f
    const/4 v0, 0x0

    .line 1503
    :goto_1e
    const-string v3, "Multi channel AMR is not currently supported."

    .line 1504
    .line 1505
    invoke-static {v3, v0}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 1506
    .line 1507
    .line 1508
    invoke-virtual {v2}, Ll8/j0;->isEmpty()Z

    .line 1509
    .line 1510
    .line 1511
    move-result v0

    .line 1512
    xor-int/2addr v0, v6

    .line 1513
    const-string v3, "fmtp parameters must include octet-align."

    .line 1514
    .line 1515
    invoke-static {v3, v0}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 1516
    .line 1517
    .line 1518
    const-string v0, "octet-align"

    .line 1519
    .line 1520
    invoke-virtual {v2, v0}, Ll8/j0;->containsKey(Ljava/lang/Object;)Z

    .line 1521
    .line 1522
    .line 1523
    move-result v0

    .line 1524
    const-string v3, "Only octet aligned mode is currently supported."

    .line 1525
    .line 1526
    invoke-static {v3, v0}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 1527
    .line 1528
    .line 1529
    const-string v0, "interleaving"

    .line 1530
    .line 1531
    invoke-virtual {v2, v0}, Ll8/j0;->containsKey(Ljava/lang/Object;)Z

    .line 1532
    .line 1533
    .line 1534
    move-result v0

    .line 1535
    xor-int/2addr v0, v6

    .line 1536
    const-string v3, "Interleaving mode is not currently supported."

    .line 1537
    .line 1538
    invoke-static {v3, v0}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 1539
    .line 1540
    .line 1541
    move v8, v6

    .line 1542
    goto/16 :goto_c

    .line 1543
    .line 1544
    :pswitch_17
    move/from16 v1, p2

    .line 1545
    .line 1546
    move/from16 v6, v22

    .line 1547
    .line 1548
    const/4 v3, -0x1

    .line 1549
    if-eq v11, v3, :cond_30

    .line 1550
    .line 1551
    move/from16 v22, v6

    .line 1552
    .line 1553
    goto :goto_1f

    .line 1554
    :cond_30
    const/16 v22, 0x0

    .line 1555
    .line 1556
    :goto_1f
    invoke-static/range {v22 .. v22}, LQ1/k;->c(Z)V

    .line 1557
    .line 1558
    .line 1559
    invoke-virtual {v2}, Ll8/j0;->isEmpty()Z

    .line 1560
    .line 1561
    .line 1562
    move-result v3

    .line 1563
    xor-int/2addr v3, v6

    .line 1564
    invoke-static {v9, v3}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 1565
    .line 1566
    .line 1567
    move-object/from16 v3, v39

    .line 1568
    .line 1569
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1570
    .line 1571
    .line 1572
    move-result v5

    .line 1573
    if-eqz v5, :cond_38

    .line 1574
    .line 1575
    const-string v5, "cpresent"

    .line 1576
    .line 1577
    invoke-virtual {v2, v5}, Ll8/j0;->containsKey(Ljava/lang/Object;)Z

    .line 1578
    .line 1579
    .line 1580
    move-result v6

    .line 1581
    if-eqz v6, :cond_31

    .line 1582
    .line 1583
    invoke-virtual {v2, v5}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1584
    .line 1585
    .line 1586
    move-result-object v5

    .line 1587
    check-cast v5, Ljava/lang/String;

    .line 1588
    .line 1589
    const-string v6, "0"

    .line 1590
    .line 1591
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1592
    .line 1593
    .line 1594
    move-result v5

    .line 1595
    if-eqz v5, :cond_31

    .line 1596
    .line 1597
    const/4 v5, 0x1

    .line 1598
    goto :goto_20

    .line 1599
    :cond_31
    const/4 v5, 0x0

    .line 1600
    :goto_20
    const-string v6, "Only supports cpresent=0 in AAC audio."

    .line 1601
    .line 1602
    invoke-static {v6, v5}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 1603
    .line 1604
    .line 1605
    invoke-virtual {v2, v0}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v0

    .line 1609
    check-cast v0, Ljava/lang/String;

    .line 1610
    .line 1611
    const-string v5, "AAC audio stream must include config fmtp parameter"

    .line 1612
    .line 1613
    if-eqz v0, :cond_37

    .line 1614
    .line 1615
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1616
    .line 1617
    .line 1618
    move-result v5

    .line 1619
    const/16 v26, 0x2

    .line 1620
    .line 1621
    rem-int/lit8 v5, v5, 0x2

    .line 1622
    .line 1623
    if-nez v5, :cond_32

    .line 1624
    .line 1625
    const/4 v5, 0x1

    .line 1626
    goto :goto_21

    .line 1627
    :cond_32
    const/4 v5, 0x0

    .line 1628
    :goto_21
    const-string v6, "Malformat MPEG4 config: "

    .line 1629
    .line 1630
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v6

    .line 1634
    invoke-static {v6, v5}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 1635
    .line 1636
    .line 1637
    new-instance v5, LJ5/y;

    .line 1638
    .line 1639
    invoke-static {v0}, LQ1/x;->r(Ljava/lang/String;)[B

    .line 1640
    .line 1641
    .line 1642
    move-result-object v0

    .line 1643
    array-length v6, v0

    .line 1644
    const/4 v8, 0x1

    .line 1645
    const/4 v9, 0x0

    .line 1646
    invoke-direct {v5, v0, v6, v8, v9}, LJ5/y;-><init>([BIIB)V

    .line 1647
    .line 1648
    .line 1649
    invoke-virtual {v5, v8}, LJ5/y;->i(I)I

    .line 1650
    .line 1651
    .line 1652
    move-result v0

    .line 1653
    if-nez v0, :cond_33

    .line 1654
    .line 1655
    move v0, v8

    .line 1656
    goto :goto_22

    .line 1657
    :cond_33
    const/4 v0, 0x0

    .line 1658
    :goto_22
    const-string v6, "Only supports audio mux version 0."

    .line 1659
    .line 1660
    invoke-static {v6, v0}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 1661
    .line 1662
    .line 1663
    invoke-virtual {v5, v8}, LJ5/y;->i(I)I

    .line 1664
    .line 1665
    .line 1666
    move-result v0

    .line 1667
    if-ne v0, v8, :cond_34

    .line 1668
    .line 1669
    move v0, v8

    .line 1670
    goto :goto_23

    .line 1671
    :cond_34
    const/4 v0, 0x0

    .line 1672
    :goto_23
    const-string v6, "Only supports allStreamsSameTimeFraming."

    .line 1673
    .line 1674
    invoke-static {v6, v0}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 1675
    .line 1676
    .line 1677
    const/4 v0, 0x6

    .line 1678
    invoke-virtual {v5, v0}, LJ5/y;->t(I)V

    .line 1679
    .line 1680
    .line 1681
    const/4 v12, 0x4

    .line 1682
    invoke-virtual {v5, v12}, LJ5/y;->i(I)I

    .line 1683
    .line 1684
    .line 1685
    move-result v0

    .line 1686
    if-nez v0, :cond_35

    .line 1687
    .line 1688
    move v0, v8

    .line 1689
    goto :goto_24

    .line 1690
    :cond_35
    const/4 v0, 0x0

    .line 1691
    :goto_24
    const-string v6, "Only supports one program."

    .line 1692
    .line 1693
    invoke-static {v6, v0}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 1694
    .line 1695
    .line 1696
    const/4 v0, 0x3

    .line 1697
    invoke-virtual {v5, v0}, LJ5/y;->i(I)I

    .line 1698
    .line 1699
    .line 1700
    move-result v0

    .line 1701
    if-nez v0, :cond_36

    .line 1702
    .line 1703
    move v0, v8

    .line 1704
    goto :goto_25

    .line 1705
    :cond_36
    const/4 v0, 0x0

    .line 1706
    :goto_25
    const-string v6, "Only supports one numLayer."

    .line 1707
    .line 1708
    invoke-static {v6, v0}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 1709
    .line 1710
    .line 1711
    const/4 v9, 0x0

    .line 1712
    :try_start_0
    invoke-static {v5, v9}, Ls2/a;->q(LJ5/y;Z)LG5/a;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v0
    :try_end_0
    .catch LN1/D; {:try_start_0 .. :try_end_0} :catch_0

    .line 1716
    iget v5, v0, LG5/a;->a:I

    .line 1717
    .line 1718
    iput v5, v4, LN1/m;->C:I

    .line 1719
    .line 1720
    iget v5, v0, LG5/a;->b:I

    .line 1721
    .line 1722
    iput v5, v4, LN1/m;->B:I

    .line 1723
    .line 1724
    iget-object v0, v0, LG5/a;->c:Ljava/lang/String;

    .line 1725
    .line 1726
    iput-object v0, v4, LN1/m;->j:Ljava/lang/String;

    .line 1727
    .line 1728
    goto :goto_26

    .line 1729
    :catch_0
    move-exception v0

    .line 1730
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 1731
    .line 1732
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 1733
    .line 1734
    .line 1735
    throw v1

    .line 1736
    :cond_37
    new-instance v0, Ljava/lang/NullPointerException;

    .line 1737
    .line 1738
    invoke-direct {v0, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1739
    .line 1740
    .line 1741
    throw v0

    .line 1742
    :cond_38
    const/4 v8, 0x1

    .line 1743
    const/4 v9, 0x0

    .line 1744
    :goto_26
    invoke-virtual {v2, v7}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v0

    .line 1748
    check-cast v0, Ljava/lang/String;

    .line 1749
    .line 1750
    if-nez v0, :cond_39

    .line 1751
    .line 1752
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1753
    .line 1754
    .line 1755
    move-result v3

    .line 1756
    if-eqz v3, :cond_39

    .line 1757
    .line 1758
    const-string v0, "30"

    .line 1759
    .line 1760
    :cond_39
    if-eqz v0, :cond_3a

    .line 1761
    .line 1762
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 1763
    .line 1764
    .line 1765
    move-result v3

    .line 1766
    if-nez v3, :cond_3a

    .line 1767
    .line 1768
    move v7, v8

    .line 1769
    goto :goto_27

    .line 1770
    :cond_3a
    move v7, v9

    .line 1771
    :goto_27
    const-string v3, "missing profile-level-id param"

    .line 1772
    .line 1773
    invoke-static {v3, v7}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 1774
    .line 1775
    .line 1776
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1777
    .line 1778
    const-string v5, "mp4a.40."

    .line 1779
    .line 1780
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1781
    .line 1782
    .line 1783
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1784
    .line 1785
    .line 1786
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1787
    .line 1788
    .line 1789
    move-result-object v0

    .line 1790
    iput-object v0, v4, LN1/m;->j:Ljava/lang/String;

    .line 1791
    .line 1792
    invoke-static {v1, v11}, Ls2/a;->a(II)[B

    .line 1793
    .line 1794
    .line 1795
    move-result-object v0

    .line 1796
    invoke-static {v0}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v0

    .line 1800
    iput-object v0, v4, LN1/m;->p:Ljava/util/List;

    .line 1801
    .line 1802
    :goto_28
    if-lez v1, :cond_3b

    .line 1803
    .line 1804
    move v14, v8

    .line 1805
    goto :goto_29

    .line 1806
    :cond_3b
    move v14, v9

    .line 1807
    :goto_29
    invoke-static {v14}, LQ1/k;->c(Z)V

    .line 1808
    .line 1809
    .line 1810
    new-instance v22, Lg2/l;

    .line 1811
    .line 1812
    new-instance v0, LN1/n;

    .line 1813
    .line 1814
    invoke-direct {v0, v4}, LN1/n;-><init>(LN1/m;)V

    .line 1815
    .line 1816
    .line 1817
    move-object/from16 v3, v37

    .line 1818
    .line 1819
    iget v3, v3, Lg2/b;->a:I

    .line 1820
    .line 1821
    move-object/from16 v23, v0

    .line 1822
    .line 1823
    move/from16 v25, v1

    .line 1824
    .line 1825
    move-object/from16 v26, v2

    .line 1826
    .line 1827
    move/from16 v24, v3

    .line 1828
    .line 1829
    move-object/from16 v27, v13

    .line 1830
    .line 1831
    invoke-direct/range {v22 .. v27}, Lg2/l;-><init>(LN1/n;IILl8/j0;Ljava/lang/String;)V

    .line 1832
    .line 1833
    .line 1834
    move-object/from16 v0, v22

    .line 1835
    .line 1836
    move-object/from16 v1, p0

    .line 1837
    .line 1838
    iput-object v0, v1, Lg2/w;->a:Lg2/l;

    .line 1839
    .line 1840
    move-object/from16 v2, v28

    .line 1841
    .line 1842
    move-object/from16 v0, v38

    .line 1843
    .line 1844
    invoke-virtual {v0, v2}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1845
    .line 1846
    .line 1847
    move-result-object v0

    .line 1848
    check-cast v0, Ljava/lang/String;

    .line 1849
    .line 1850
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1851
    .line 1852
    .line 1853
    move-result-object v2

    .line 1854
    invoke-virtual {v2}, Landroid/net/Uri;->isAbsolute()Z

    .line 1855
    .line 1856
    .line 1857
    move-result v3

    .line 1858
    if-eqz v3, :cond_3c

    .line 1859
    .line 1860
    goto :goto_2b

    .line 1861
    :cond_3c
    const-string v2, "Content-Base"

    .line 1862
    .line 1863
    move-object/from16 v3, p1

    .line 1864
    .line 1865
    invoke-virtual {v3, v2}, Lg2/o;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v4

    .line 1869
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1870
    .line 1871
    .line 1872
    move-result v4

    .line 1873
    if-nez v4, :cond_3d

    .line 1874
    .line 1875
    invoke-virtual {v3, v2}, Lg2/o;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 1876
    .line 1877
    .line 1878
    move-result-object v2

    .line 1879
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1880
    .line 1881
    .line 1882
    move-result-object v2

    .line 1883
    goto :goto_2a

    .line 1884
    :cond_3d
    const-string v2, "Content-Location"

    .line 1885
    .line 1886
    invoke-virtual {v3, v2}, Lg2/o;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v4

    .line 1890
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1891
    .line 1892
    .line 1893
    move-result v4

    .line 1894
    if-nez v4, :cond_3e

    .line 1895
    .line 1896
    invoke-virtual {v3, v2}, Lg2/o;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v2

    .line 1900
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1901
    .line 1902
    .line 1903
    move-result-object v2

    .line 1904
    goto :goto_2a

    .line 1905
    :cond_3e
    move-object/from16 v2, p3

    .line 1906
    .line 1907
    :goto_2a
    const-string v3, "*"

    .line 1908
    .line 1909
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1910
    .line 1911
    .line 1912
    move-result v3

    .line 1913
    if-eqz v3, :cond_3f

    .line 1914
    .line 1915
    goto :goto_2b

    .line 1916
    :cond_3f
    invoke-virtual {v2}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 1917
    .line 1918
    .line 1919
    move-result-object v2

    .line 1920
    invoke-virtual {v2, v0}, Landroid/net/Uri$Builder;->appendEncodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 1921
    .line 1922
    .line 1923
    move-result-object v0

    .line 1924
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 1925
    .line 1926
    .line 1927
    move-result-object v2

    .line 1928
    :goto_2b
    iput-object v2, v1, Lg2/w;->b:Landroid/net/Uri;

    .line 1929
    .line 1930
    return-void

    .line 1931
    :sswitch_data_0
    .sparse-switch
        -0x7290cac7 -> :sswitch_10
        0x96c -> :sswitch_f
        0xfc51 -> :sswitch_e
        0xfda6 -> :sswitch_d
        0x12371 -> :sswitch_c
        0x14cbe -> :sswitch_b
        0x14cbf -> :sswitch_a
        0x217d28 -> :sswitch_9
        0x217d29 -> :sswitch_8
        0x25203f -> :sswitch_7
        0x2562c7 -> :sswitch_6
        0x2562db -> :sswitch_5
        0x3f401eeb -> :sswitch_4
        0x734e0c52 -> :sswitch_3
        0x74c813f6 -> :sswitch_2
        0x7f62e82d -> :sswitch_1
        0x7f6339a4 -> :sswitch_0
    .end sparse-switch

    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_c
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_d
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    :sswitch_data_1
    .sparse-switch
        -0x63306f58 -> :sswitch_1e
        -0x63185e82 -> :sswitch_1d
        -0x5fc6f775 -> :sswitch_1c
        -0x3313c2e -> :sswitch_1b
        0xb269698 -> :sswitch_1a
        0xb26d66f -> :sswitch_19
        0x46cdc642 -> :sswitch_18
        0x4f62373a -> :sswitch_17
        0x59976a2d -> :sswitch_16
        0x59b2d2d8 -> :sswitch_15
        0x5f50bed8 -> :sswitch_14
        0x5f50bed9 -> :sswitch_13
        0x71710385 -> :sswitch_12
        0x717677f9 -> :sswitch_11
    .end sparse-switch

    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch
.end method

.method public static a(Ljava/lang/String;)[B
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    array-length v1, p0

    .line 7
    const/4 v2, 0x4

    .line 8
    add-int/2addr v1, v2

    .line 9
    new-array v1, v1, [B

    .line 10
    .line 11
    sget-object v3, LR1/n;->a:[B

    .line 12
    .line 13
    invoke-static {v3, v0, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 14
    .line 15
    .line 16
    array-length v3, p0

    .line 17
    invoke-static {p0, v0, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 18
    .line 19
    .line 20
    return-object v1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, Lg2/w;

    .line 13
    .line 14
    if-eq v3, v2, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lg2/w;

    .line 18
    .line 19
    iget-object v2, p0, Lg2/w;->a:Lg2/l;

    .line 20
    .line 21
    iget-object v3, p1, Lg2/w;->a:Lg2/l;

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Lg2/l;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget-object v2, p0, Lg2/w;->b:Landroid/net/Uri;

    .line 30
    .line 31
    iget-object p1, p1, Lg2/w;->b:Landroid/net/Uri;

    .line 32
    .line 33
    invoke-virtual {v2, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    return v0

    .line 40
    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lg2/w;->a:Lg2/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg2/l;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit16 v0, v0, 0xd9

    .line 8
    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lg2/w;->b:Landroid/net/Uri;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/net/Uri;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    return v1
.end method
