.class public final Lq6/i;
.super Lh6/e;
.source "SourceFile"


# instance fields
.field public final m:LY4/b;

.field public final n:Lq6/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lh6/e;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LY4/b;

    .line 5
    .line 6
    invoke-direct {v0}, LY4/b;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lq6/i;->m:LY4/b;

    .line 10
    .line 11
    new-instance v0, Lq6/a;

    .line 12
    .line 13
    invoke-direct {v0}, Lq6/a;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lq6/i;->n:Lq6/a;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final e([BIZ)Lh6/f;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v2, -0x1

    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x1

    .line 7
    iget-object v5, v1, Lq6/i;->m:LY4/b;

    .line 8
    .line 9
    move-object/from16 v6, p1

    .line 10
    .line 11
    move/from16 v7, p2

    .line 12
    .line 13
    invoke-virtual {v5, v7, v6}, LY4/b;->y(I[B)V

    .line 14
    .line 15
    .line 16
    new-instance v6, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    :try_start_0
    sget v7, Lq6/j;->a:I

    .line 22
    .line 23
    iget v7, v5, LY4/b;->b:I

    .line 24
    .line 25
    invoke-virtual {v5}, LY4/b;->e()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    const/4 v9, 0x0

    .line 30
    if-eqz v8, :cond_3d

    .line 31
    .line 32
    const-string v10, "WEBVTT"

    .line 33
    .line 34
    invoke-virtual {v8, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v8
    :try_end_0
    .catch LE5/o0; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    if-eqz v8, :cond_3d

    .line 39
    .line 40
    :goto_0
    invoke-virtual {v5}, LY4/b;->e()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-nez v7, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    new-instance v7, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    :cond_1
    :goto_1
    move v10, v0

    .line 57
    move v8, v2

    .line 58
    :goto_2
    if-ne v8, v2, :cond_5

    .line 59
    .line 60
    iget v10, v5, LY4/b;->b:I

    .line 61
    .line 62
    invoke-virtual {v5}, LY4/b;->e()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    if-nez v8, :cond_2

    .line 67
    .line 68
    move v8, v0

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    const-string v12, "STYLE"

    .line 71
    .line 72
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v12

    .line 76
    if-eqz v12, :cond_3

    .line 77
    .line 78
    move v8, v3

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    const-string v12, "NOTE"

    .line 81
    .line 82
    invoke-virtual {v8, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    if-eqz v8, :cond_4

    .line 87
    .line 88
    move v8, v4

    .line 89
    goto :goto_2

    .line 90
    :cond_4
    const/4 v8, 0x3

    .line 91
    goto :goto_2

    .line 92
    :cond_5
    invoke-virtual {v5, v10}, LY4/b;->A(I)V

    .line 93
    .line 94
    .line 95
    if-eqz v8, :cond_3b

    .line 96
    .line 97
    if-ne v8, v4, :cond_6

    .line 98
    .line 99
    :goto_3
    invoke-virtual {v5}, LY4/b;->e()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    if-nez v8, :cond_1

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_6
    if-ne v8, v3, :cond_36

    .line 111
    .line 112
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    if-eqz v8, :cond_35

    .line 117
    .line 118
    invoke-virtual {v5}, LY4/b;->e()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    iget-object v8, v1, Lq6/i;->n:Lq6/a;

    .line 122
    .line 123
    iget-object v10, v8, Lq6/a;->b:Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 126
    .line 127
    .line 128
    iget v12, v5, LY4/b;->b:I

    .line 129
    .line 130
    :goto_4
    invoke-virtual {v5}, LY4/b;->e()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v13

    .line 134
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 135
    .line 136
    .line 137
    move-result v13

    .line 138
    if-eqz v13, :cond_34

    .line 139
    .line 140
    iget-object v13, v5, LY4/b;->a:[B

    .line 141
    .line 142
    iget v14, v5, LY4/b;->b:I

    .line 143
    .line 144
    iget-object v8, v8, Lq6/a;->a:LY4/b;

    .line 145
    .line 146
    invoke-virtual {v8, v14, v13}, LY4/b;->y(I[B)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v8, v12}, LY4/b;->A(I)V

    .line 150
    .line 151
    .line 152
    new-instance v12, Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 155
    .line 156
    .line 157
    :goto_5
    invoke-static {v8}, Lq6/a;->c(LY4/b;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v8}, LY4/b;->a()I

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    const-string v14, "{"

    .line 165
    .line 166
    const-string v15, ""

    .line 167
    .line 168
    const/4 v11, 0x5

    .line 169
    if-ge v13, v11, :cond_7

    .line 170
    .line 171
    :goto_6
    move-object v3, v9

    .line 172
    goto/16 :goto_a

    .line 173
    .line 174
    :cond_7
    sget-object v13, Lk8/g;->c:Ljava/nio/charset/Charset;

    .line 175
    .line 176
    invoke-virtual {v8, v11, v13}, LY4/b;->o(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v11

    .line 180
    const-string v13, "::cue"

    .line 181
    .line 182
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v11

    .line 186
    if-nez v11, :cond_8

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_8
    iget v11, v8, LY4/b;->b:I

    .line 190
    .line 191
    invoke-static {v8, v10}, Lq6/a;->b(LY4/b;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v13

    .line 195
    if-nez v13, :cond_9

    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_9
    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v16

    .line 202
    if-eqz v16, :cond_a

    .line 203
    .line 204
    invoke-virtual {v8, v11}, LY4/b;->A(I)V

    .line 205
    .line 206
    .line 207
    move-object v3, v15

    .line 208
    goto :goto_a

    .line 209
    :cond_a
    const-string v11, "("

    .line 210
    .line 211
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    if-eqz v11, :cond_d

    .line 216
    .line 217
    iget v11, v8, LY4/b;->b:I

    .line 218
    .line 219
    iget v13, v8, LY4/b;->c:I

    .line 220
    .line 221
    move/from16 v16, v0

    .line 222
    .line 223
    :goto_7
    if-ge v11, v13, :cond_c

    .line 224
    .line 225
    if-nez v16, :cond_c

    .line 226
    .line 227
    iget-object v3, v8, LY4/b;->a:[B

    .line 228
    .line 229
    add-int/lit8 v16, v11, 0x1

    .line 230
    .line 231
    aget-byte v3, v3, v11

    .line 232
    .line 233
    int-to-char v3, v3

    .line 234
    const/16 v11, 0x29

    .line 235
    .line 236
    if-ne v3, v11, :cond_b

    .line 237
    .line 238
    move v3, v4

    .line 239
    goto :goto_8

    .line 240
    :cond_b
    move v3, v0

    .line 241
    :goto_8
    move/from16 v11, v16

    .line 242
    .line 243
    move/from16 v16, v3

    .line 244
    .line 245
    const/4 v3, 0x2

    .line 246
    goto :goto_7

    .line 247
    :cond_c
    add-int/2addr v11, v2

    .line 248
    iget v3, v8, LY4/b;->b:I

    .line 249
    .line 250
    sub-int/2addr v11, v3

    .line 251
    sget-object v3, Lk8/g;->c:Ljava/nio/charset/Charset;

    .line 252
    .line 253
    invoke-virtual {v8, v11, v3}, LY4/b;->o(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    goto :goto_9

    .line 262
    :cond_d
    move-object v3, v9

    .line 263
    :goto_9
    invoke-static {v8, v10}, Lq6/a;->b(LY4/b;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v11

    .line 267
    const-string v13, ")"

    .line 268
    .line 269
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v11

    .line 273
    if-nez v11, :cond_e

    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_e
    :goto_a
    if-eqz v3, :cond_32

    .line 277
    .line 278
    invoke-static {v8, v10}, Lq6/a;->b(LY4/b;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v11

    .line 282
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v11

    .line 286
    if-nez v11, :cond_f

    .line 287
    .line 288
    goto/16 :goto_1b

    .line 289
    .line 290
    :cond_f
    new-instance v11, Lq6/b;

    .line 291
    .line 292
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 293
    .line 294
    .line 295
    iput-object v15, v11, Lq6/b;->a:Ljava/lang/String;

    .line 296
    .line 297
    iput-object v15, v11, Lq6/b;->b:Ljava/lang/String;

    .line 298
    .line 299
    sget-object v13, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 300
    .line 301
    iput-object v13, v11, Lq6/b;->c:Ljava/util/Set;

    .line 302
    .line 303
    iput-object v15, v11, Lq6/b;->d:Ljava/lang/String;

    .line 304
    .line 305
    iput-object v9, v11, Lq6/b;->e:Ljava/lang/String;

    .line 306
    .line 307
    iput-boolean v0, v11, Lq6/b;->g:Z

    .line 308
    .line 309
    iput-boolean v0, v11, Lq6/b;->i:Z

    .line 310
    .line 311
    iput v2, v11, Lq6/b;->j:I

    .line 312
    .line 313
    iput v2, v11, Lq6/b;->k:I

    .line 314
    .line 315
    iput v2, v11, Lq6/b;->l:I

    .line 316
    .line 317
    iput v2, v11, Lq6/b;->m:I

    .line 318
    .line 319
    iput v2, v11, Lq6/b;->n:I

    .line 320
    .line 321
    iput v2, v11, Lq6/b;->p:I

    .line 322
    .line 323
    iput-boolean v0, v11, Lq6/b;->q:Z

    .line 324
    .line 325
    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v13

    .line 329
    if-eqz v13, :cond_10

    .line 330
    .line 331
    goto :goto_d

    .line 332
    :cond_10
    const/16 v13, 0x5b

    .line 333
    .line 334
    invoke-virtual {v3, v13}, Ljava/lang/String;->indexOf(I)I

    .line 335
    .line 336
    .line 337
    move-result v13

    .line 338
    if-eq v13, v2, :cond_12

    .line 339
    .line 340
    sget-object v14, Lq6/a;->c:Ljava/util/regex/Pattern;

    .line 341
    .line 342
    invoke-virtual {v3, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v9

    .line 346
    invoke-virtual {v14, v9}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 347
    .line 348
    .line 349
    move-result-object v9

    .line 350
    invoke-virtual {v9}, Ljava/util/regex/Matcher;->matches()Z

    .line 351
    .line 352
    .line 353
    move-result v14

    .line 354
    if-eqz v14, :cond_11

    .line 355
    .line 356
    invoke-virtual {v9, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v9

    .line 360
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    iput-object v9, v11, Lq6/b;->d:Ljava/lang/String;

    .line 364
    .line 365
    :cond_11
    invoke-virtual {v3, v0, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    :cond_12
    sget v9, Lu6/v;->a:I

    .line 370
    .line 371
    const-string v9, "\\."

    .line 372
    .line 373
    invoke-virtual {v3, v9, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    aget-object v9, v3, v0

    .line 378
    .line 379
    const/16 v13, 0x23

    .line 380
    .line 381
    invoke-virtual {v9, v13}, Ljava/lang/String;->indexOf(I)I

    .line 382
    .line 383
    .line 384
    move-result v13

    .line 385
    if-eq v13, v2, :cond_13

    .line 386
    .line 387
    invoke-virtual {v9, v0, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v14

    .line 391
    iput-object v14, v11, Lq6/b;->b:Ljava/lang/String;

    .line 392
    .line 393
    add-int/2addr v13, v4

    .line 394
    invoke-virtual {v9, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v9

    .line 398
    iput-object v9, v11, Lq6/b;->a:Ljava/lang/String;

    .line 399
    .line 400
    goto :goto_b

    .line 401
    :cond_13
    iput-object v9, v11, Lq6/b;->b:Ljava/lang/String;

    .line 402
    .line 403
    :goto_b
    array-length v9, v3

    .line 404
    if-le v9, v4, :cond_15

    .line 405
    .line 406
    array-length v9, v3

    .line 407
    array-length v13, v3

    .line 408
    if-gt v9, v13, :cond_14

    .line 409
    .line 410
    move v13, v4

    .line 411
    goto :goto_c

    .line 412
    :cond_14
    move v13, v0

    .line 413
    :goto_c
    invoke-static {v13}, Lu6/a;->e(Z)V

    .line 414
    .line 415
    .line 416
    invoke-static {v3, v4, v9}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    check-cast v3, [Ljava/lang/String;

    .line 421
    .line 422
    new-instance v9, Ljava/util/HashSet;

    .line 423
    .line 424
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    invoke-direct {v9, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 429
    .line 430
    .line 431
    iput-object v9, v11, Lq6/b;->c:Ljava/util/Set;

    .line 432
    .line 433
    :cond_15
    :goto_d
    move v9, v0

    .line 434
    const/4 v3, 0x0

    .line 435
    :goto_e
    const-string v13, "}"

    .line 436
    .line 437
    if-nez v9, :cond_30

    .line 438
    .line 439
    iget v3, v8, LY4/b;->b:I

    .line 440
    .line 441
    invoke-static {v8, v10}, Lq6/a;->b(LY4/b;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v9

    .line 445
    if-eqz v9, :cond_17

    .line 446
    .line 447
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    move-result v14

    .line 451
    if-eqz v14, :cond_16

    .line 452
    .line 453
    goto :goto_f

    .line 454
    :cond_16
    move v14, v0

    .line 455
    goto :goto_10

    .line 456
    :cond_17
    :goto_f
    move v14, v4

    .line 457
    :goto_10
    if-nez v14, :cond_2f

    .line 458
    .line 459
    invoke-virtual {v8, v3}, LY4/b;->A(I)V

    .line 460
    .line 461
    .line 462
    invoke-static {v8}, Lq6/a;->c(LY4/b;)V

    .line 463
    .line 464
    .line 465
    invoke-static {v8, v10}, Lq6/a;->a(LY4/b;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v16

    .line 473
    if-eqz v16, :cond_18

    .line 474
    .line 475
    goto/16 :goto_1a

    .line 476
    .line 477
    :cond_18
    const-string v0, ":"

    .line 478
    .line 479
    invoke-static {v8, v10}, Lq6/a;->b(LY4/b;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result v0

    .line 487
    if-nez v0, :cond_19

    .line 488
    .line 489
    goto/16 :goto_1a

    .line 490
    .line 491
    :cond_19
    invoke-static {v8}, Lq6/a;->c(LY4/b;)V

    .line 492
    .line 493
    .line 494
    new-instance v0, Ljava/lang/StringBuilder;

    .line 495
    .line 496
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 497
    .line 498
    .line 499
    const/4 v2, 0x0

    .line 500
    :goto_11
    const-string v4, ";"

    .line 501
    .line 502
    if-nez v2, :cond_1d

    .line 503
    .line 504
    iget v1, v8, LY4/b;->b:I

    .line 505
    .line 506
    move/from16 v18, v2

    .line 507
    .line 508
    invoke-static {v8, v10}, Lq6/a;->b(LY4/b;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    if-nez v2, :cond_1a

    .line 513
    .line 514
    const/4 v0, 0x0

    .line 515
    goto :goto_13

    .line 516
    :cond_1a
    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result v19

    .line 520
    if-nez v19, :cond_1c

    .line 521
    .line 522
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    move-result v4

    .line 526
    if-eqz v4, :cond_1b

    .line 527
    .line 528
    goto :goto_12

    .line 529
    :cond_1b
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 530
    .line 531
    .line 532
    move-object/from16 v1, p0

    .line 533
    .line 534
    move/from16 v2, v18

    .line 535
    .line 536
    goto :goto_11

    .line 537
    :cond_1c
    :goto_12
    invoke-virtual {v8, v1}, LY4/b;->A(I)V

    .line 538
    .line 539
    .line 540
    const/4 v2, 0x1

    .line 541
    move-object/from16 v1, p0

    .line 542
    .line 543
    goto :goto_11

    .line 544
    :cond_1d
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    :goto_13
    if-eqz v0, :cond_2f

    .line 549
    .line 550
    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    move-result v1

    .line 554
    if-eqz v1, :cond_1e

    .line 555
    .line 556
    goto/16 :goto_1a

    .line 557
    .line 558
    :cond_1e
    iget v1, v8, LY4/b;->b:I

    .line 559
    .line 560
    invoke-static {v8, v10}, Lq6/a;->b(LY4/b;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    move-result v4

    .line 568
    if-eqz v4, :cond_1f

    .line 569
    .line 570
    goto :goto_14

    .line 571
    :cond_1f
    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    move-result v2

    .line 575
    if-eqz v2, :cond_2f

    .line 576
    .line 577
    invoke-virtual {v8, v1}, LY4/b;->A(I)V

    .line 578
    .line 579
    .line 580
    :goto_14
    const-string v1, "color"

    .line 581
    .line 582
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    move-result v1

    .line 586
    if-eqz v1, :cond_20

    .line 587
    .line 588
    const/4 v1, 0x1

    .line 589
    invoke-static {v0, v1}, Lu6/b;->a(Ljava/lang/String;Z)I

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    iput v0, v11, Lq6/b;->f:I

    .line 594
    .line 595
    iput-boolean v1, v11, Lq6/b;->g:Z

    .line 596
    .line 597
    goto/16 :goto_1a

    .line 598
    .line 599
    :cond_20
    const/4 v1, 0x1

    .line 600
    const-string v2, "background-color"

    .line 601
    .line 602
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    move-result v2

    .line 606
    if-eqz v2, :cond_21

    .line 607
    .line 608
    invoke-static {v0, v1}, Lu6/b;->a(Ljava/lang/String;Z)I

    .line 609
    .line 610
    .line 611
    move-result v0

    .line 612
    iput v0, v11, Lq6/b;->h:I

    .line 613
    .line 614
    iput-boolean v1, v11, Lq6/b;->i:Z

    .line 615
    .line 616
    goto/16 :goto_1a

    .line 617
    .line 618
    :cond_21
    const-string v2, "ruby-position"

    .line 619
    .line 620
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    move-result v2

    .line 624
    if-eqz v2, :cond_23

    .line 625
    .line 626
    const-string v2, "over"

    .line 627
    .line 628
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    move-result v2

    .line 632
    if-eqz v2, :cond_22

    .line 633
    .line 634
    iput v1, v11, Lq6/b;->p:I

    .line 635
    .line 636
    goto/16 :goto_1a

    .line 637
    .line 638
    :cond_22
    const-string v1, "under"

    .line 639
    .line 640
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 641
    .line 642
    .line 643
    move-result v0

    .line 644
    if-eqz v0, :cond_2f

    .line 645
    .line 646
    const/4 v0, 0x2

    .line 647
    iput v0, v11, Lq6/b;->p:I

    .line 648
    .line 649
    goto/16 :goto_1a

    .line 650
    .line 651
    :cond_23
    const-string v1, "text-combine-upright"

    .line 652
    .line 653
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    move-result v1

    .line 657
    if-eqz v1, :cond_26

    .line 658
    .line 659
    const-string v1, "all"

    .line 660
    .line 661
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 662
    .line 663
    .line 664
    move-result v1

    .line 665
    if-nez v1, :cond_25

    .line 666
    .line 667
    const-string v1, "digits"

    .line 668
    .line 669
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 670
    .line 671
    .line 672
    move-result v0

    .line 673
    if-eqz v0, :cond_24

    .line 674
    .line 675
    goto :goto_15

    .line 676
    :cond_24
    const/4 v0, 0x0

    .line 677
    goto :goto_16

    .line 678
    :cond_25
    :goto_15
    const/4 v0, 0x1

    .line 679
    :goto_16
    iput-boolean v0, v11, Lq6/b;->q:Z

    .line 680
    .line 681
    goto/16 :goto_1a

    .line 682
    .line 683
    :cond_26
    const-string v1, "text-decoration"

    .line 684
    .line 685
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 686
    .line 687
    .line 688
    move-result v1

    .line 689
    if-eqz v1, :cond_27

    .line 690
    .line 691
    const-string v1, "underline"

    .line 692
    .line 693
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 694
    .line 695
    .line 696
    move-result v0

    .line 697
    if-eqz v0, :cond_2f

    .line 698
    .line 699
    const/4 v1, 0x1

    .line 700
    iput v1, v11, Lq6/b;->k:I

    .line 701
    .line 702
    goto/16 :goto_1a

    .line 703
    .line 704
    :cond_27
    const-string v1, "font-family"

    .line 705
    .line 706
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 707
    .line 708
    .line 709
    move-result v1

    .line 710
    if-eqz v1, :cond_28

    .line 711
    .line 712
    invoke-static {v0}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    iput-object v0, v11, Lq6/b;->e:Ljava/lang/String;

    .line 717
    .line 718
    goto/16 :goto_1a

    .line 719
    .line 720
    :cond_28
    const-string v1, "font-weight"

    .line 721
    .line 722
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 723
    .line 724
    .line 725
    move-result v1

    .line 726
    if-eqz v1, :cond_29

    .line 727
    .line 728
    const-string v1, "bold"

    .line 729
    .line 730
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 731
    .line 732
    .line 733
    move-result v0

    .line 734
    if-eqz v0, :cond_2f

    .line 735
    .line 736
    const/4 v1, 0x1

    .line 737
    iput v1, v11, Lq6/b;->l:I

    .line 738
    .line 739
    goto/16 :goto_1a

    .line 740
    .line 741
    :cond_29
    const/4 v1, 0x1

    .line 742
    const-string v2, "font-style"

    .line 743
    .line 744
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 745
    .line 746
    .line 747
    move-result v2

    .line 748
    if-eqz v2, :cond_2a

    .line 749
    .line 750
    const-string v2, "italic"

    .line 751
    .line 752
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    move-result v0

    .line 756
    if-eqz v0, :cond_2f

    .line 757
    .line 758
    iput v1, v11, Lq6/b;->m:I

    .line 759
    .line 760
    goto/16 :goto_1a

    .line 761
    .line 762
    :cond_2a
    const-string v1, "font-size"

    .line 763
    .line 764
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 765
    .line 766
    .line 767
    move-result v1

    .line 768
    if-eqz v1, :cond_2f

    .line 769
    .line 770
    invoke-static {v0}, LA6/h;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 771
    .line 772
    .line 773
    move-result-object v1

    .line 774
    sget-object v2, Lq6/a;->d:Ljava/util/regex/Pattern;

    .line 775
    .line 776
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 777
    .line 778
    .line 779
    move-result-object v1

    .line 780
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 781
    .line 782
    .line 783
    move-result v2

    .line 784
    if-nez v2, :cond_2b

    .line 785
    .line 786
    new-instance v1, Ljava/lang/StringBuilder;

    .line 787
    .line 788
    const-string v2, "Invalid font-size: \'"

    .line 789
    .line 790
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 791
    .line 792
    .line 793
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 794
    .line 795
    .line 796
    const-string v0, "\'."

    .line 797
    .line 798
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    const-string v1, "WebvttCssParser"

    .line 806
    .line 807
    invoke-static {v1, v0}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 808
    .line 809
    .line 810
    goto :goto_1a

    .line 811
    :cond_2b
    const/4 v0, 0x2

    .line 812
    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v2

    .line 816
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 817
    .line 818
    .line 819
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 820
    .line 821
    .line 822
    move-result v0

    .line 823
    sparse-switch v0, :sswitch_data_0

    .line 824
    .line 825
    .line 826
    :goto_17
    const/4 v0, -0x1

    .line 827
    goto :goto_18

    .line 828
    :sswitch_0
    const-string v0, "px"

    .line 829
    .line 830
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 831
    .line 832
    .line 833
    move-result v0

    .line 834
    if-nez v0, :cond_2c

    .line 835
    .line 836
    goto :goto_17

    .line 837
    :cond_2c
    const/4 v0, 0x2

    .line 838
    goto :goto_18

    .line 839
    :sswitch_1
    const-string v0, "em"

    .line 840
    .line 841
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 842
    .line 843
    .line 844
    move-result v0

    .line 845
    if-nez v0, :cond_2d

    .line 846
    .line 847
    goto :goto_17

    .line 848
    :cond_2d
    const/4 v0, 0x1

    .line 849
    goto :goto_18

    .line 850
    :sswitch_2
    const-string v0, "%"

    .line 851
    .line 852
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 853
    .line 854
    .line 855
    move-result v0

    .line 856
    if-nez v0, :cond_2e

    .line 857
    .line 858
    goto :goto_17

    .line 859
    :cond_2e
    const/4 v0, 0x0

    .line 860
    :goto_18
    packed-switch v0, :pswitch_data_0

    .line 861
    .line 862
    .line 863
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 864
    .line 865
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 866
    .line 867
    .line 868
    throw v0

    .line 869
    :pswitch_0
    const/4 v0, 0x1

    .line 870
    iput v0, v11, Lq6/b;->n:I

    .line 871
    .line 872
    goto :goto_19

    .line 873
    :pswitch_1
    const/4 v0, 0x1

    .line 874
    const/4 v2, 0x2

    .line 875
    iput v2, v11, Lq6/b;->n:I

    .line 876
    .line 877
    goto :goto_19

    .line 878
    :pswitch_2
    const/4 v0, 0x1

    .line 879
    const/4 v2, 0x3

    .line 880
    iput v2, v11, Lq6/b;->n:I

    .line 881
    .line 882
    :goto_19
    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 883
    .line 884
    .line 885
    move-result-object v1

    .line 886
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 887
    .line 888
    .line 889
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 890
    .line 891
    .line 892
    move-result v0

    .line 893
    iput v0, v11, Lq6/b;->o:F

    .line 894
    .line 895
    :cond_2f
    :goto_1a
    move-object/from16 v1, p0

    .line 896
    .line 897
    move-object v3, v9

    .line 898
    move v9, v14

    .line 899
    const/4 v0, 0x0

    .line 900
    const/4 v2, -0x1

    .line 901
    const/4 v4, 0x1

    .line 902
    goto/16 :goto_e

    .line 903
    .line 904
    :cond_30
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 905
    .line 906
    .line 907
    move-result v0

    .line 908
    if-eqz v0, :cond_31

    .line 909
    .line 910
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 911
    .line 912
    .line 913
    :cond_31
    move-object/from16 v1, p0

    .line 914
    .line 915
    const/4 v0, 0x0

    .line 916
    const/4 v2, -0x1

    .line 917
    const/4 v3, 0x2

    .line 918
    const/4 v4, 0x1

    .line 919
    const/4 v9, 0x0

    .line 920
    goto/16 :goto_5

    .line 921
    .line 922
    :cond_32
    :goto_1b
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 923
    .line 924
    .line 925
    :cond_33
    :goto_1c
    move-object/from16 v1, p0

    .line 926
    .line 927
    const/4 v0, 0x0

    .line 928
    const/4 v2, -0x1

    .line 929
    const/4 v3, 0x2

    .line 930
    const/4 v4, 0x1

    .line 931
    const/4 v9, 0x0

    .line 932
    goto/16 :goto_1

    .line 933
    .line 934
    :cond_34
    move-object/from16 v1, p0

    .line 935
    .line 936
    goto/16 :goto_4

    .line 937
    .line 938
    :cond_35
    new-instance v0, Lh6/h;

    .line 939
    .line 940
    const-string v1, "A style block was found after the first cue."

    .line 941
    .line 942
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 943
    .line 944
    .line 945
    throw v0

    .line 946
    :cond_36
    const/4 v2, 0x3

    .line 947
    if-ne v8, v2, :cond_33

    .line 948
    .line 949
    sget-object v0, Lq6/h;->a:Ljava/util/regex/Pattern;

    .line 950
    .line 951
    invoke-virtual {v5}, LY4/b;->e()Ljava/lang/String;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    if-nez v0, :cond_38

    .line 956
    .line 957
    :cond_37
    :goto_1d
    const/4 v3, 0x0

    .line 958
    goto :goto_1e

    .line 959
    :cond_38
    sget-object v1, Lq6/h;->a:Ljava/util/regex/Pattern;

    .line 960
    .line 961
    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 962
    .line 963
    .line 964
    move-result-object v2

    .line 965
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 966
    .line 967
    .line 968
    move-result v3

    .line 969
    if-eqz v3, :cond_39

    .line 970
    .line 971
    const/4 v3, 0x0

    .line 972
    invoke-static {v3, v2, v5, v6}, Lq6/h;->d(Ljava/lang/String;Ljava/util/regex/Matcher;LY4/b;Ljava/util/ArrayList;)Lq6/c;

    .line 973
    .line 974
    .line 975
    move-result-object v0

    .line 976
    move-object v3, v0

    .line 977
    goto :goto_1e

    .line 978
    :cond_39
    invoke-virtual {v5}, LY4/b;->e()Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    move-result-object v2

    .line 982
    if-nez v2, :cond_3a

    .line 983
    .line 984
    goto :goto_1d

    .line 985
    :cond_3a
    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 986
    .line 987
    .line 988
    move-result-object v1

    .line 989
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 990
    .line 991
    .line 992
    move-result v2

    .line 993
    if-eqz v2, :cond_37

    .line 994
    .line 995
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    move-result-object v0

    .line 999
    invoke-static {v0, v1, v5, v6}, Lq6/h;->d(Ljava/lang/String;Ljava/util/regex/Matcher;LY4/b;Ljava/util/ArrayList;)Lq6/c;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v3

    .line 1003
    :goto_1e
    if-eqz v3, :cond_33

    .line 1004
    .line 1005
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1006
    .line 1007
    .line 1008
    goto :goto_1c

    .line 1009
    :cond_3b
    new-instance v0, Lne/a;

    .line 1010
    .line 1011
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1012
    .line 1013
    .line 1014
    new-instance v1, Ljava/util/ArrayList;

    .line 1015
    .line 1016
    invoke-direct {v1, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1017
    .line 1018
    .line 1019
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v1

    .line 1023
    iput-object v1, v0, Lne/a;->a:Ljava/lang/Object;

    .line 1024
    .line 1025
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1026
    .line 1027
    .line 1028
    move-result v1

    .line 1029
    const/4 v2, 0x2

    .line 1030
    mul-int/2addr v1, v2

    .line 1031
    new-array v1, v1, [J

    .line 1032
    .line 1033
    iput-object v1, v0, Lne/a;->b:Ljava/lang/Object;

    .line 1034
    .line 1035
    const/4 v1, 0x0

    .line 1036
    :goto_1f
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1037
    .line 1038
    .line 1039
    move-result v3

    .line 1040
    if-ge v1, v3, :cond_3c

    .line 1041
    .line 1042
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v3

    .line 1046
    check-cast v3, Lq6/c;

    .line 1047
    .line 1048
    mul-int/lit8 v4, v1, 0x2

    .line 1049
    .line 1050
    iget-object v5, v0, Lne/a;->b:Ljava/lang/Object;

    .line 1051
    .line 1052
    check-cast v5, [J

    .line 1053
    .line 1054
    iget-wide v8, v3, Lq6/c;->b:J

    .line 1055
    .line 1056
    aput-wide v8, v5, v4

    .line 1057
    .line 1058
    const/16 v17, 0x1

    .line 1059
    .line 1060
    add-int/lit8 v4, v4, 0x1

    .line 1061
    .line 1062
    iget-wide v8, v3, Lq6/c;->c:J

    .line 1063
    .line 1064
    aput-wide v8, v5, v4

    .line 1065
    .line 1066
    add-int/lit8 v1, v1, 0x1

    .line 1067
    .line 1068
    goto :goto_1f

    .line 1069
    :cond_3c
    iget-object v1, v0, Lne/a;->b:Ljava/lang/Object;

    .line 1070
    .line 1071
    check-cast v1, [J

    .line 1072
    .line 1073
    array-length v2, v1

    .line 1074
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 1075
    .line 1076
    .line 1077
    move-result-object v1

    .line 1078
    iput-object v1, v0, Lne/a;->c:Ljava/lang/Object;

    .line 1079
    .line 1080
    invoke-static {v1}, Ljava/util/Arrays;->sort([J)V

    .line 1081
    .line 1082
    .line 1083
    return-object v0

    .line 1084
    :cond_3d
    :try_start_1
    invoke-virtual {v5, v7}, LY4/b;->A(I)V

    .line 1085
    .line 1086
    .line 1087
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1088
    .line 1089
    const-string v1, "Expected WEBVTT. Got "

    .line 1090
    .line 1091
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v5}, LY4/b;->e()Ljava/lang/String;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v1

    .line 1098
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1099
    .line 1100
    .line 1101
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v0

    .line 1105
    const/4 v3, 0x0

    .line 1106
    invoke-static {v0, v3}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v0

    .line 1110
    throw v0
    :try_end_1
    .catch LE5/o0; {:try_start_1 .. :try_end_1} :catch_0

    .line 1111
    :catch_0
    move-exception v0

    .line 1112
    new-instance v1, Lh6/h;

    .line 1113
    .line 1114
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 1115
    .line 1116
    .line 1117
    throw v1

    .line 1118
    nop

    .line 1119
    :sswitch_data_0
    .sparse-switch
        0x25 -> :sswitch_2
        0xca8 -> :sswitch_1
        0xe08 -> :sswitch_0
    .end sparse-switch

    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
