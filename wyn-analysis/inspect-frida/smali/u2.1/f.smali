.class public final Lu2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu2/a;


# instance fields
.field public final a:Ll8/e0;

.field public final b:I


# direct methods
.method public constructor <init>(ILl8/e0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lu2/f;->b:I

    .line 5
    .line 6
    iput-object p2, p0, Lu2/f;->a:Ll8/e0;

    .line 7
    .line 8
    return-void
.end method

.method public static b(ILQ1/o;)Lu2/f;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const-string v2, "initialCapacity"

    .line 5
    .line 6
    invoke-static {v1, v2}, Ll8/s;->d(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-array v2, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    iget v3, v0, LQ1/o;->c:I

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, -0x2

    .line 15
    move v6, v4

    .line 16
    :goto_0
    invoke-virtual {v0}, LQ1/o;->a()I

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    const/16 v8, 0x8

    .line 21
    .line 22
    if-le v7, v8, :cond_13

    .line 23
    .line 24
    invoke-virtual {v0}, LQ1/o;->j()I

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    invoke-virtual {v0}, LQ1/o;->j()I

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    iget v10, v0, LQ1/o;->b:I

    .line 33
    .line 34
    add-int/2addr v10, v9

    .line 35
    invoke-virtual {v0, v10}, LQ1/o;->F(I)V

    .line 36
    .line 37
    .line 38
    const/4 v9, 0x1

    .line 39
    const v11, 0x5453494c

    .line 40
    .line 41
    .line 42
    const/4 v12, 0x2

    .line 43
    if-ne v7, v11, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, LQ1/o;->j()I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    invoke-static {v7, v0}, Lu2/f;->b(ILQ1/o;)Lu2/f;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    goto/16 :goto_5

    .line 54
    .line 55
    :cond_0
    const/16 v11, 0xc

    .line 56
    .line 57
    const/4 v13, 0x0

    .line 58
    sparse-switch v7, :sswitch_data_0

    .line 59
    .line 60
    .line 61
    :goto_1
    move-object v7, v13

    .line 62
    goto/16 :goto_5

    .line 63
    .line 64
    :sswitch_0
    new-instance v7, Lu2/h;

    .line 65
    .line 66
    invoke-virtual {v0}, LQ1/o;->a()I

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    sget-object v11, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 71
    .line 72
    invoke-virtual {v0, v8, v11}, LQ1/o;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    invoke-direct {v7, v8}, Lu2/h;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto/16 :goto_5

    .line 80
    .line 81
    :sswitch_1
    invoke-virtual {v0}, LQ1/o;->j()I

    .line 82
    .line 83
    .line 84
    move-result v14

    .line 85
    invoke-virtual {v0, v11}, LQ1/o;->H(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, LQ1/o;->j()I

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, LQ1/o;->j()I

    .line 92
    .line 93
    .line 94
    move-result v15

    .line 95
    invoke-virtual {v0}, LQ1/o;->j()I

    .line 96
    .line 97
    .line 98
    move-result v16

    .line 99
    invoke-virtual {v0, v1}, LQ1/o;->H(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, LQ1/o;->j()I

    .line 103
    .line 104
    .line 105
    move-result v17

    .line 106
    invoke-virtual {v0}, LQ1/o;->j()I

    .line 107
    .line 108
    .line 109
    move-result v18

    .line 110
    invoke-virtual {v0, v8}, LQ1/o;->H(I)V

    .line 111
    .line 112
    .line 113
    new-instance v13, Lu2/d;

    .line 114
    .line 115
    invoke-direct/range {v13 .. v18}, Lu2/d;-><init>(IIIII)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :sswitch_2
    invoke-virtual {v0}, LQ1/o;->j()I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    invoke-virtual {v0, v8}, LQ1/o;->H(I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, LQ1/o;->j()I

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    invoke-virtual {v0}, LQ1/o;->j()I

    .line 131
    .line 132
    .line 133
    move-result v13

    .line 134
    invoke-virtual {v0, v1}, LQ1/o;->H(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, LQ1/o;->j()I

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v11}, LQ1/o;->H(I)V

    .line 141
    .line 142
    .line 143
    new-instance v11, Lu2/c;

    .line 144
    .line 145
    invoke-direct {v11, v7, v8, v13}, Lu2/c;-><init>(III)V

    .line 146
    .line 147
    .line 148
    move-object v7, v11

    .line 149
    goto/16 :goto_5

    .line 150
    .line 151
    :sswitch_3
    const-string v7, "StreamFormatChunk"

    .line 152
    .line 153
    if-ne v5, v12, :cond_2

    .line 154
    .line 155
    invoke-virtual {v0, v1}, LQ1/o;->H(I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, LQ1/o;->j()I

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    invoke-virtual {v0}, LQ1/o;->j()I

    .line 163
    .line 164
    .line 165
    move-result v11

    .line 166
    invoke-virtual {v0, v1}, LQ1/o;->H(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, LQ1/o;->j()I

    .line 170
    .line 171
    .line 172
    move-result v14

    .line 173
    sparse-switch v14, :sswitch_data_1

    .line 174
    .line 175
    .line 176
    move-object v15, v13

    .line 177
    goto :goto_2

    .line 178
    :sswitch_4
    const-string v15, "video/mjpeg"

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :sswitch_5
    const-string v15, "video/mp43"

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :sswitch_6
    const-string v15, "video/mp42"

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :sswitch_7
    const-string v15, "video/avc"

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :sswitch_8
    const-string v15, "video/mp4v-es"

    .line 191
    .line 192
    :goto_2
    if-nez v15, :cond_1

    .line 193
    .line 194
    const-string v8, "Ignoring track with unsupported compression "

    .line 195
    .line 196
    invoke-static {v14, v8, v7}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    goto/16 :goto_1

    .line 200
    .line 201
    :cond_1
    new-instance v7, LN1/m;

    .line 202
    .line 203
    invoke-direct {v7}, LN1/m;-><init>()V

    .line 204
    .line 205
    .line 206
    iput v8, v7, LN1/m;->t:I

    .line 207
    .line 208
    iput v11, v7, LN1/m;->u:I

    .line 209
    .line 210
    invoke-static {v15}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    iput-object v8, v7, LN1/m;->m:Ljava/lang/String;

    .line 215
    .line 216
    new-instance v8, Lu2/g;

    .line 217
    .line 218
    new-instance v11, LN1/n;

    .line 219
    .line 220
    invoke-direct {v11, v7}, LN1/n;-><init>(LN1/m;)V

    .line 221
    .line 222
    .line 223
    invoke-direct {v8, v11}, Lu2/g;-><init>(LN1/n;)V

    .line 224
    .line 225
    .line 226
    move-object v7, v8

    .line 227
    goto/16 :goto_5

    .line 228
    .line 229
    :cond_2
    if-ne v5, v9, :cond_c

    .line 230
    .line 231
    invoke-virtual {v0}, LQ1/o;->n()I

    .line 232
    .line 233
    .line 234
    move-result v8

    .line 235
    const-string v11, "audio/raw"

    .line 236
    .line 237
    const-string v14, "audio/mp4a-latm"

    .line 238
    .line 239
    if-eq v8, v9, :cond_7

    .line 240
    .line 241
    const/16 v15, 0x55

    .line 242
    .line 243
    if-eq v8, v15, :cond_6

    .line 244
    .line 245
    const/16 v15, 0xff

    .line 246
    .line 247
    if-eq v8, v15, :cond_5

    .line 248
    .line 249
    const/16 v15, 0x2000

    .line 250
    .line 251
    if-eq v8, v15, :cond_4

    .line 252
    .line 253
    const/16 v15, 0x2001

    .line 254
    .line 255
    if-eq v8, v15, :cond_3

    .line 256
    .line 257
    move-object v15, v13

    .line 258
    goto :goto_3

    .line 259
    :cond_3
    const-string v15, "audio/vnd.dts"

    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_4
    const-string v15, "audio/ac3"

    .line 263
    .line 264
    goto :goto_3

    .line 265
    :cond_5
    move-object v15, v14

    .line 266
    goto :goto_3

    .line 267
    :cond_6
    const-string v15, "audio/mpeg"

    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_7
    move-object v15, v11

    .line 271
    :goto_3
    if-nez v15, :cond_8

    .line 272
    .line 273
    const-string v11, "Ignoring track with unsupported format tag "

    .line 274
    .line 275
    invoke-static {v8, v11, v7}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    goto/16 :goto_1

    .line 279
    .line 280
    :cond_8
    invoke-virtual {v0}, LQ1/o;->n()I

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    invoke-virtual {v0}, LQ1/o;->j()I

    .line 285
    .line 286
    .line 287
    move-result v8

    .line 288
    const/4 v13, 0x6

    .line 289
    invoke-virtual {v0, v13}, LQ1/o;->H(I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0}, LQ1/o;->n()I

    .line 293
    .line 294
    .line 295
    move-result v13

    .line 296
    invoke-static {v13}, LQ1/x;->y(I)I

    .line 297
    .line 298
    .line 299
    move-result v13

    .line 300
    invoke-virtual {v0}, LQ1/o;->a()I

    .line 301
    .line 302
    .line 303
    move-result v16

    .line 304
    if-lez v16, :cond_9

    .line 305
    .line 306
    invoke-virtual {v0}, LQ1/o;->n()I

    .line 307
    .line 308
    .line 309
    move-result v16

    .line 310
    move/from16 v1, v16

    .line 311
    .line 312
    goto :goto_4

    .line 313
    :cond_9
    move v1, v4

    .line 314
    :goto_4
    new-array v9, v1, [B

    .line 315
    .line 316
    invoke-virtual {v0, v4, v1, v9}, LQ1/o;->f(II[B)V

    .line 317
    .line 318
    .line 319
    new-instance v4, LN1/m;

    .line 320
    .line 321
    invoke-direct {v4}, LN1/m;-><init>()V

    .line 322
    .line 323
    .line 324
    invoke-static {v15}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v12

    .line 328
    iput-object v12, v4, LN1/m;->m:Ljava/lang/String;

    .line 329
    .line 330
    iput v7, v4, LN1/m;->B:I

    .line 331
    .line 332
    iput v8, v4, LN1/m;->C:I

    .line 333
    .line 334
    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v7

    .line 338
    if-eqz v7, :cond_a

    .line 339
    .line 340
    if-eqz v13, :cond_a

    .line 341
    .line 342
    iput v13, v4, LN1/m;->D:I

    .line 343
    .line 344
    :cond_a
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v7

    .line 348
    if-eqz v7, :cond_b

    .line 349
    .line 350
    if-lez v1, :cond_b

    .line 351
    .line 352
    invoke-static {v9}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    iput-object v1, v4, LN1/m;->p:Ljava/util/List;

    .line 357
    .line 358
    :cond_b
    new-instance v1, Lu2/g;

    .line 359
    .line 360
    new-instance v7, LN1/n;

    .line 361
    .line 362
    invoke-direct {v7, v4}, LN1/n;-><init>(LN1/m;)V

    .line 363
    .line 364
    .line 365
    invoke-direct {v1, v7}, Lu2/g;-><init>(LN1/n;)V

    .line 366
    .line 367
    .line 368
    move-object v7, v1

    .line 369
    goto :goto_5

    .line 370
    :cond_c
    new-instance v1, Ljava/lang/StringBuilder;

    .line 371
    .line 372
    const-string v4, "Ignoring strf box for unsupported track type: "

    .line 373
    .line 374
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    invoke-static {v5}, LQ1/x;->C(I)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    invoke-static {v7, v1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    goto/16 :goto_1

    .line 392
    .line 393
    :goto_5
    if-eqz v7, :cond_12

    .line 394
    .line 395
    invoke-interface {v7}, Lu2/a;->getType()I

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    const v4, 0x68727473

    .line 400
    .line 401
    .line 402
    if-ne v1, v4, :cond_10

    .line 403
    .line 404
    move-object v1, v7

    .line 405
    check-cast v1, Lu2/d;

    .line 406
    .line 407
    const v4, 0x73646976

    .line 408
    .line 409
    .line 410
    iget v1, v1, Lu2/d;->a:I

    .line 411
    .line 412
    if-eq v1, v4, :cond_f

    .line 413
    .line 414
    const v4, 0x73647561

    .line 415
    .line 416
    .line 417
    if-eq v1, v4, :cond_e

    .line 418
    .line 419
    const v4, 0x73747874

    .line 420
    .line 421
    .line 422
    if-eq v1, v4, :cond_d

    .line 423
    .line 424
    new-instance v4, Ljava/lang/StringBuilder;

    .line 425
    .line 426
    const-string v5, "Found unsupported streamType fourCC: "

    .line 427
    .line 428
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    const-string v4, "AviStreamHeaderChunk"

    .line 443
    .line 444
    invoke-static {v4, v1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    const/4 v1, -0x1

    .line 448
    :goto_6
    move v5, v1

    .line 449
    goto :goto_7

    .line 450
    :cond_d
    const/4 v1, 0x3

    .line 451
    goto :goto_6

    .line 452
    :cond_e
    const/4 v5, 0x1

    .line 453
    goto :goto_7

    .line 454
    :cond_f
    const/4 v5, 0x2

    .line 455
    :cond_10
    :goto_7
    array-length v1, v2

    .line 456
    add-int/lit8 v4, v6, 0x1

    .line 457
    .line 458
    invoke-static {v1, v4}, Ll8/E;->f(II)I

    .line 459
    .line 460
    .line 461
    move-result v1

    .line 462
    array-length v8, v2

    .line 463
    if-gt v1, v8, :cond_11

    .line 464
    .line 465
    goto :goto_8

    .line 466
    :cond_11
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    :goto_8
    aput-object v7, v2, v6

    .line 471
    .line 472
    move v6, v4

    .line 473
    :cond_12
    invoke-virtual {v0, v10}, LQ1/o;->G(I)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v0, v3}, LQ1/o;->F(I)V

    .line 477
    .line 478
    .line 479
    const/4 v1, 0x4

    .line 480
    const/4 v4, 0x0

    .line 481
    goto/16 :goto_0

    .line 482
    .line 483
    :cond_13
    new-instance v0, Lu2/f;

    .line 484
    .line 485
    invoke-static {v6, v2}, Ll8/K;->h(I[Ljava/lang/Object;)Ll8/e0;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    move/from16 v2, p0

    .line 490
    .line 491
    invoke-direct {v0, v2, v1}, Lu2/f;-><init>(ILl8/e0;)V

    .line 492
    .line 493
    .line 494
    return-object v0

    .line 495
    :sswitch_data_0
    .sparse-switch
        0x66727473 -> :sswitch_3
        0x68697661 -> :sswitch_2
        0x68727473 -> :sswitch_1
        0x6e727473 -> :sswitch_0
    .end sparse-switch

    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    :sswitch_data_1
    .sparse-switch
        0x30355844 -> :sswitch_8
        0x31435641 -> :sswitch_7
        0x31637661 -> :sswitch_7
        0x3234504d -> :sswitch_6
        0x3334504d -> :sswitch_5
        0x34363248 -> :sswitch_7
        0x34504d46 -> :sswitch_8
        0x44495633 -> :sswitch_8
        0x44495658 -> :sswitch_8
        0x47504a4d -> :sswitch_4
        0x58564944 -> :sswitch_8
        0x64697678 -> :sswitch_8
        0x67706a6d -> :sswitch_4
        0x78766964 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lu2/a;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lu2/f;->a:Ll8/e0;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, Ll8/K;->l(I)Ll8/I;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ll8/I;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Ll8/I;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lu2/a;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-ne v2, p1, :cond_0

    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    return-object p1
.end method

.method public final getType()I
    .locals 1

    .line 1
    iget v0, p0, Lu2/f;->b:I

    .line 2
    .line 3
    return v0
.end method
