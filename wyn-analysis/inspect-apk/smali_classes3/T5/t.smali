.class public final LT5/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/C;


# instance fields
.field public final a:LT5/f;

.field public final b:LJ5/y;

.field public c:I

.field public d:I

.field public e:Lu6/t;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:Z

.field public l:J


# direct methods
.method public constructor <init>(LT5/f;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT5/t;->a:LT5/f;

    .line 5
    .line 6
    new-instance p1, LJ5/y;

    .line 7
    .line 8
    const/16 v0, 0xa

    .line 9
    .line 10
    new-array v1, v0, [B

    .line 11
    .line 12
    const/4 v2, 0x6

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {p1, v1, v0, v2, v3}, LJ5/y;-><init>([BIIB)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, LT5/t;->b:LJ5/y;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput p1, p0, LT5/t;->c:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LT5/t;->c:I

    .line 3
    .line 4
    iput v0, p0, LT5/t;->d:I

    .line 5
    .line 6
    iput-boolean v0, p0, LT5/t;->h:Z

    .line 7
    .line 8
    iget-object v0, p0, LT5/t;->a:LT5/f;

    .line 9
    .line 10
    invoke-interface {v0}, LT5/f;->a()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final b(ILY4/b;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, LT5/t;->e:Lu6/t;

    .line 6
    .line 7
    invoke-static {v2}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    and-int/lit8 v2, p1, 0x1

    .line 11
    .line 12
    iget-object v3, v0, LT5/t;->a:LT5/f;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x1

    .line 16
    const-string v6, "PesReader"

    .line 17
    .line 18
    const/4 v7, -0x1

    .line 19
    const/4 v8, 0x3

    .line 20
    const/4 v9, 0x2

    .line 21
    if-eqz v2, :cond_4

    .line 22
    .line 23
    iget v2, v0, LT5/t;->c:I

    .line 24
    .line 25
    if-eqz v2, :cond_3

    .line 26
    .line 27
    if-eq v2, v5, :cond_3

    .line 28
    .line 29
    if-eq v2, v9, :cond_2

    .line 30
    .line 31
    if-ne v2, v8, :cond_1

    .line 32
    .line 33
    iget v2, v0, LT5/t;->j:I

    .line 34
    .line 35
    if-eq v2, v7, :cond_0

    .line 36
    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v10, "Unexpected start indicator: expected "

    .line 40
    .line 41
    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget v10, v0, LT5/t;->j:I

    .line 45
    .line 46
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v10, " more bytes"

    .line 50
    .line 51
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v6, v2}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    invoke-interface {v3}, LT5/f;->i()V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 68
    .line 69
    .line 70
    throw v1

    .line 71
    :cond_2
    const-string v2, "Unexpected start indicator reading extended header"

    .line 72
    .line 73
    invoke-static {v6, v2}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    :goto_0
    iput v5, v0, LT5/t;->c:I

    .line 77
    .line 78
    iput v4, v0, LT5/t;->d:I

    .line 79
    .line 80
    :cond_4
    move/from16 v2, p1

    .line 81
    .line 82
    :goto_1
    invoke-virtual {v1}, LY4/b;->a()I

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-lez v10, :cond_14

    .line 87
    .line 88
    iget v10, v0, LT5/t;->c:I

    .line 89
    .line 90
    if-eqz v10, :cond_13

    .line 91
    .line 92
    iget-object v11, v0, LT5/t;->b:LJ5/y;

    .line 93
    .line 94
    if-eq v10, v5, :cond_e

    .line 95
    .line 96
    if-eq v10, v9, :cond_9

    .line 97
    .line 98
    if-ne v10, v8, :cond_8

    .line 99
    .line 100
    invoke-virtual {v1}, LY4/b;->a()I

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    iget v11, v0, LT5/t;->j:I

    .line 105
    .line 106
    if-ne v11, v7, :cond_5

    .line 107
    .line 108
    move v11, v4

    .line 109
    goto :goto_2

    .line 110
    :cond_5
    sub-int v11, v10, v11

    .line 111
    .line 112
    :goto_2
    if-lez v11, :cond_6

    .line 113
    .line 114
    sub-int/2addr v10, v11

    .line 115
    iget v11, v1, LY4/b;->b:I

    .line 116
    .line 117
    add-int/2addr v11, v10

    .line 118
    invoke-virtual {v1, v11}, LY4/b;->z(I)V

    .line 119
    .line 120
    .line 121
    :cond_6
    invoke-interface {v3, v1}, LT5/f;->c(LY4/b;)V

    .line 122
    .line 123
    .line 124
    iget v11, v0, LT5/t;->j:I

    .line 125
    .line 126
    if-eq v11, v7, :cond_7

    .line 127
    .line 128
    sub-int/2addr v11, v10

    .line 129
    iput v11, v0, LT5/t;->j:I

    .line 130
    .line 131
    if-nez v11, :cond_7

    .line 132
    .line 133
    invoke-interface {v3}, LT5/f;->i()V

    .line 134
    .line 135
    .line 136
    iput v5, v0, LT5/t;->c:I

    .line 137
    .line 138
    iput v4, v0, LT5/t;->d:I

    .line 139
    .line 140
    :cond_7
    move v10, v8

    .line 141
    move v8, v7

    .line 142
    move v7, v10

    .line 143
    move v10, v9

    .line 144
    goto/16 :goto_6

    .line 145
    .line 146
    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 147
    .line 148
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 149
    .line 150
    .line 151
    throw v1

    .line 152
    :cond_9
    const/16 v10, 0xa

    .line 153
    .line 154
    iget v12, v0, LT5/t;->i:I

    .line 155
    .line 156
    invoke-static {v10, v12}, Ljava/lang/Math;->min(II)I

    .line 157
    .line 158
    .line 159
    move-result v10

    .line 160
    iget-object v12, v11, LJ5/y;->b:[B

    .line 161
    .line 162
    invoke-virtual {v0, v1, v12, v10}, LT5/t;->c(LY4/b;[BI)Z

    .line 163
    .line 164
    .line 165
    move-result v10

    .line 166
    if-eqz v10, :cond_d

    .line 167
    .line 168
    const/4 v10, 0x0

    .line 169
    iget v12, v0, LT5/t;->i:I

    .line 170
    .line 171
    invoke-virtual {v0, v1, v10, v12}, LT5/t;->c(LY4/b;[BI)Z

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    if-eqz v10, :cond_d

    .line 176
    .line 177
    invoke-virtual {v11, v4}, LJ5/y;->q(I)V

    .line 178
    .line 179
    .line 180
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    iput-wide v12, v0, LT5/t;->l:J

    .line 186
    .line 187
    iget-boolean v10, v0, LT5/t;->f:Z

    .line 188
    .line 189
    const/4 v12, 0x4

    .line 190
    if-eqz v10, :cond_b

    .line 191
    .line 192
    invoke-virtual {v11, v12}, LJ5/y;->t(I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v11, v8}, LJ5/y;->i(I)I

    .line 196
    .line 197
    .line 198
    move-result v10

    .line 199
    int-to-long v13, v10

    .line 200
    const/16 v10, 0x1e

    .line 201
    .line 202
    shl-long/2addr v13, v10

    .line 203
    invoke-virtual {v11, v5}, LJ5/y;->t(I)V

    .line 204
    .line 205
    .line 206
    const/16 v15, 0xf

    .line 207
    .line 208
    invoke-virtual {v11, v15}, LJ5/y;->i(I)I

    .line 209
    .line 210
    .line 211
    move-result v16

    .line 212
    move/from16 p1, v10

    .line 213
    .line 214
    shl-int/lit8 v10, v16, 0xf

    .line 215
    .line 216
    int-to-long v9, v10

    .line 217
    or-long/2addr v9, v13

    .line 218
    invoke-virtual {v11, v5}, LJ5/y;->t(I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v11, v15}, LJ5/y;->i(I)I

    .line 222
    .line 223
    .line 224
    move-result v13

    .line 225
    int-to-long v13, v13

    .line 226
    or-long/2addr v9, v13

    .line 227
    invoke-virtual {v11, v5}, LJ5/y;->t(I)V

    .line 228
    .line 229
    .line 230
    iget-boolean v13, v0, LT5/t;->h:Z

    .line 231
    .line 232
    if-nez v13, :cond_a

    .line 233
    .line 234
    iget-boolean v13, v0, LT5/t;->g:Z

    .line 235
    .line 236
    if-eqz v13, :cond_a

    .line 237
    .line 238
    invoke-virtual {v11, v12}, LJ5/y;->t(I)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v11, v8}, LJ5/y;->i(I)I

    .line 242
    .line 243
    .line 244
    move-result v13

    .line 245
    int-to-long v13, v13

    .line 246
    shl-long v13, v13, p1

    .line 247
    .line 248
    invoke-virtual {v11, v5}, LJ5/y;->t(I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v11, v15}, LJ5/y;->i(I)I

    .line 252
    .line 253
    .line 254
    move-result v17

    .line 255
    shl-int/lit8 v12, v17, 0xf

    .line 256
    .line 257
    int-to-long v7, v12

    .line 258
    or-long/2addr v7, v13

    .line 259
    invoke-virtual {v11, v5}, LJ5/y;->t(I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v11, v15}, LJ5/y;->i(I)I

    .line 263
    .line 264
    .line 265
    move-result v12

    .line 266
    int-to-long v12, v12

    .line 267
    or-long/2addr v7, v12

    .line 268
    invoke-virtual {v11, v5}, LJ5/y;->t(I)V

    .line 269
    .line 270
    .line 271
    iget-object v11, v0, LT5/t;->e:Lu6/t;

    .line 272
    .line 273
    invoke-virtual {v11, v7, v8}, Lu6/t;->b(J)J

    .line 274
    .line 275
    .line 276
    iput-boolean v5, v0, LT5/t;->h:Z

    .line 277
    .line 278
    :cond_a
    iget-object v7, v0, LT5/t;->e:Lu6/t;

    .line 279
    .line 280
    invoke-virtual {v7, v9, v10}, Lu6/t;->b(J)J

    .line 281
    .line 282
    .line 283
    move-result-wide v7

    .line 284
    iput-wide v7, v0, LT5/t;->l:J

    .line 285
    .line 286
    :cond_b
    iget-boolean v7, v0, LT5/t;->k:Z

    .line 287
    .line 288
    if-eqz v7, :cond_c

    .line 289
    .line 290
    const/4 v12, 0x4

    .line 291
    goto :goto_3

    .line 292
    :cond_c
    move v12, v4

    .line 293
    :goto_3
    or-int/2addr v2, v12

    .line 294
    iget-wide v7, v0, LT5/t;->l:J

    .line 295
    .line 296
    invoke-interface {v3, v2, v7, v8}, LT5/f;->d(IJ)V

    .line 297
    .line 298
    .line 299
    const/4 v7, 0x3

    .line 300
    iput v7, v0, LT5/t;->c:I

    .line 301
    .line 302
    iput v4, v0, LT5/t;->d:I

    .line 303
    .line 304
    move v8, v7

    .line 305
    const/4 v7, -0x1

    .line 306
    const/4 v9, 0x2

    .line 307
    goto/16 :goto_1

    .line 308
    .line 309
    :cond_d
    move v7, v8

    .line 310
    move v10, v9

    .line 311
    const/4 v8, -0x1

    .line 312
    goto/16 :goto_6

    .line 313
    .line 314
    :cond_e
    move v7, v8

    .line 315
    iget-object v8, v11, LJ5/y;->b:[B

    .line 316
    .line 317
    const/16 v9, 0x9

    .line 318
    .line 319
    invoke-virtual {v0, v1, v8, v9}, LT5/t;->c(LY4/b;[BI)Z

    .line 320
    .line 321
    .line 322
    move-result v8

    .line 323
    if-eqz v8, :cond_12

    .line 324
    .line 325
    invoke-virtual {v11, v4}, LJ5/y;->q(I)V

    .line 326
    .line 327
    .line 328
    const/16 v8, 0x18

    .line 329
    .line 330
    invoke-virtual {v11, v8}, LJ5/y;->i(I)I

    .line 331
    .line 332
    .line 333
    move-result v8

    .line 334
    if-eq v8, v5, :cond_f

    .line 335
    .line 336
    const-string v9, "Unexpected start code prefix: "

    .line 337
    .line 338
    invoke-static {v8, v9, v6}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    const/4 v8, -0x1

    .line 342
    iput v8, v0, LT5/t;->j:I

    .line 343
    .line 344
    move v9, v4

    .line 345
    const/4 v8, -0x1

    .line 346
    const/4 v10, 0x2

    .line 347
    goto :goto_5

    .line 348
    :cond_f
    const/16 v8, 0x8

    .line 349
    .line 350
    invoke-virtual {v11, v8}, LJ5/y;->t(I)V

    .line 351
    .line 352
    .line 353
    const/16 v9, 0x10

    .line 354
    .line 355
    invoke-virtual {v11, v9}, LJ5/y;->i(I)I

    .line 356
    .line 357
    .line 358
    move-result v9

    .line 359
    const/4 v10, 0x5

    .line 360
    invoke-virtual {v11, v10}, LJ5/y;->t(I)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v11}, LJ5/y;->h()Z

    .line 364
    .line 365
    .line 366
    move-result v10

    .line 367
    iput-boolean v10, v0, LT5/t;->k:Z

    .line 368
    .line 369
    const/4 v10, 0x2

    .line 370
    invoke-virtual {v11, v10}, LJ5/y;->t(I)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v11}, LJ5/y;->h()Z

    .line 374
    .line 375
    .line 376
    move-result v12

    .line 377
    iput-boolean v12, v0, LT5/t;->f:Z

    .line 378
    .line 379
    invoke-virtual {v11}, LJ5/y;->h()Z

    .line 380
    .line 381
    .line 382
    move-result v12

    .line 383
    iput-boolean v12, v0, LT5/t;->g:Z

    .line 384
    .line 385
    const/4 v12, 0x6

    .line 386
    invoke-virtual {v11, v12}, LJ5/y;->t(I)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v11, v8}, LJ5/y;->i(I)I

    .line 390
    .line 391
    .line 392
    move-result v8

    .line 393
    iput v8, v0, LT5/t;->i:I

    .line 394
    .line 395
    if-nez v9, :cond_10

    .line 396
    .line 397
    const/4 v11, -0x1

    .line 398
    iput v11, v0, LT5/t;->j:I

    .line 399
    .line 400
    move v8, v11

    .line 401
    goto :goto_4

    .line 402
    :cond_10
    add-int/lit8 v9, v9, -0x3

    .line 403
    .line 404
    sub-int/2addr v9, v8

    .line 405
    iput v9, v0, LT5/t;->j:I

    .line 406
    .line 407
    if-gez v9, :cond_11

    .line 408
    .line 409
    new-instance v8, Ljava/lang/StringBuilder;

    .line 410
    .line 411
    const-string v9, "Found negative packet payload size: "

    .line 412
    .line 413
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    iget v9, v0, LT5/t;->j:I

    .line 417
    .line 418
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v8

    .line 425
    invoke-static {v6, v8}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    const/4 v8, -0x1

    .line 429
    iput v8, v0, LT5/t;->j:I

    .line 430
    .line 431
    goto :goto_4

    .line 432
    :cond_11
    const/4 v8, -0x1

    .line 433
    :goto_4
    move v9, v10

    .line 434
    :goto_5
    iput v9, v0, LT5/t;->c:I

    .line 435
    .line 436
    iput v4, v0, LT5/t;->d:I

    .line 437
    .line 438
    goto :goto_6

    .line 439
    :cond_12
    const/4 v8, -0x1

    .line 440
    const/4 v10, 0x2

    .line 441
    goto :goto_6

    .line 442
    :cond_13
    move v10, v8

    .line 443
    move v8, v7

    .line 444
    move v7, v10

    .line 445
    move v10, v9

    .line 446
    invoke-virtual {v1}, LY4/b;->a()I

    .line 447
    .line 448
    .line 449
    move-result v9

    .line 450
    invoke-virtual {v1, v9}, LY4/b;->B(I)V

    .line 451
    .line 452
    .line 453
    :goto_6
    move v9, v8

    .line 454
    move v8, v7

    .line 455
    move v7, v9

    .line 456
    move v9, v10

    .line 457
    goto/16 :goto_1

    .line 458
    .line 459
    :cond_14
    return-void
.end method

.method public final c(LY4/b;[BI)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, LY4/b;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, LT5/t;->d:I

    .line 6
    .line 7
    sub-int v1, p3, v1

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-gtz v0, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    if-nez p2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1, v0}, LY4/b;->B(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget v2, p0, LT5/t;->d:I

    .line 24
    .line 25
    invoke-virtual {p1, v2, v0, p2}, LY4/b;->c(II[B)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget p1, p0, LT5/t;->d:I

    .line 29
    .line 30
    add-int/2addr p1, v0

    .line 31
    iput p1, p0, LT5/t;->d:I

    .line 32
    .line 33
    if-ne p1, p3, :cond_2

    .line 34
    .line 35
    return v1

    .line 36
    :cond_2
    const/4 p1, 0x0

    .line 37
    return p1
.end method

.method public final d(Lu6/t;LJ5/m;LT5/B;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT5/t;->e:Lu6/t;

    .line 2
    .line 3
    iget-object p1, p0, LT5/t;->a:LT5/f;

    .line 4
    .line 5
    invoke-interface {p1, p2, p3}, LT5/f;->g(LJ5/m;LT5/B;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
