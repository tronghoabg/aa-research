.class public final LY2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY2/A;


# instance fields
.field public final a:LY2/h;

.field public final b:LJ5/y;

.field public c:I

.field public d:I

.field public e:LQ1/u;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:Z

.field public l:J


# direct methods
.method public constructor <init>(LY2/h;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY2/r;->a:LY2/h;

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
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {p1, v1, v0, v2, v3}, LJ5/y;-><init>([BIIB)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, LY2/r;->b:LJ5/y;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput p1, p0, LY2/r;->c:I

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
    iput v0, p0, LY2/r;->c:I

    .line 3
    .line 4
    iput v0, p0, LY2/r;->d:I

    .line 5
    .line 6
    iput-boolean v0, p0, LY2/r;->h:Z

    .line 7
    .line 8
    iget-object v0, p0, LY2/r;->a:LY2/h;

    .line 9
    .line 10
    invoke-interface {v0}, LY2/h;->a()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final b(LQ1/u;Ls2/o;LT5/B;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY2/r;->e:LQ1/u;

    .line 2
    .line 3
    iget-object p1, p0, LY2/r;->a:LY2/h;

    .line 4
    .line 5
    invoke-interface {p1, p2, p3}, LY2/h;->f(Ls2/o;LT5/B;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final c(ILQ1/o;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, LY2/r;->e:LQ1/u;

    .line 6
    .line 7
    invoke-static {v2}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    and-int/lit8 v2, p1, 0x1

    .line 11
    .line 12
    iget-object v3, v0, LY2/r;->a:LY2/h;

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    const-string v5, "PesReader"

    .line 16
    .line 17
    const/4 v6, -0x1

    .line 18
    const/4 v7, 0x3

    .line 19
    const/4 v8, 0x2

    .line 20
    const/4 v9, 0x0

    .line 21
    if-eqz v2, :cond_5

    .line 22
    .line 23
    iget v2, v0, LY2/r;->c:I

    .line 24
    .line 25
    if-eqz v2, :cond_4

    .line 26
    .line 27
    if-eq v2, v4, :cond_4

    .line 28
    .line 29
    if-eq v2, v8, :cond_3

    .line 30
    .line 31
    if-ne v2, v7, :cond_2

    .line 32
    .line 33
    iget v2, v0, LY2/r;->j:I

    .line 34
    .line 35
    if-eq v2, v6, :cond_0

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
    iget v10, v0, LY2/r;->j:I

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
    invoke-static {v5, v2}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    iget v2, v1, LQ1/o;->c:I

    .line 62
    .line 63
    if-nez v2, :cond_1

    .line 64
    .line 65
    move v2, v4

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    move v2, v9

    .line 68
    :goto_0
    invoke-interface {v3, v2}, LY2/h;->h(Z)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 75
    .line 76
    .line 77
    throw v1

    .line 78
    :cond_3
    const-string v2, "Unexpected start indicator reading extended header"

    .line 79
    .line 80
    invoke-static {v5, v2}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_4
    :goto_1
    iput v4, v0, LY2/r;->c:I

    .line 84
    .line 85
    iput v9, v0, LY2/r;->d:I

    .line 86
    .line 87
    :cond_5
    move/from16 v2, p1

    .line 88
    .line 89
    :goto_2
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    if-lez v10, :cond_14

    .line 94
    .line 95
    iget v10, v0, LY2/r;->c:I

    .line 96
    .line 97
    if-eqz v10, :cond_13

    .line 98
    .line 99
    iget-object v11, v0, LY2/r;->b:LJ5/y;

    .line 100
    .line 101
    if-eq v10, v4, :cond_e

    .line 102
    .line 103
    if-eq v10, v8, :cond_a

    .line 104
    .line 105
    if-ne v10, v7, :cond_9

    .line 106
    .line 107
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    iget v11, v0, LY2/r;->j:I

    .line 112
    .line 113
    if-ne v11, v6, :cond_6

    .line 114
    .line 115
    move v11, v9

    .line 116
    goto :goto_3

    .line 117
    :cond_6
    sub-int v11, v10, v11

    .line 118
    .line 119
    :goto_3
    if-lez v11, :cond_7

    .line 120
    .line 121
    sub-int/2addr v10, v11

    .line 122
    iget v11, v1, LQ1/o;->b:I

    .line 123
    .line 124
    add-int/2addr v11, v10

    .line 125
    invoke-virtual {v1, v11}, LQ1/o;->F(I)V

    .line 126
    .line 127
    .line 128
    :cond_7
    invoke-interface {v3, v1}, LY2/h;->e(LQ1/o;)V

    .line 129
    .line 130
    .line 131
    iget v11, v0, LY2/r;->j:I

    .line 132
    .line 133
    if-eq v11, v6, :cond_8

    .line 134
    .line 135
    sub-int/2addr v11, v10

    .line 136
    iput v11, v0, LY2/r;->j:I

    .line 137
    .line 138
    if-nez v11, :cond_8

    .line 139
    .line 140
    invoke-interface {v3, v9}, LY2/h;->h(Z)V

    .line 141
    .line 142
    .line 143
    iput v4, v0, LY2/r;->c:I

    .line 144
    .line 145
    iput v9, v0, LY2/r;->d:I

    .line 146
    .line 147
    :cond_8
    move v10, v8

    .line 148
    move v8, v9

    .line 149
    goto/16 :goto_7

    .line 150
    .line 151
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 152
    .line 153
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 154
    .line 155
    .line 156
    throw v1

    .line 157
    :cond_a
    const/16 v10, 0xa

    .line 158
    .line 159
    iget v12, v0, LY2/r;->i:I

    .line 160
    .line 161
    invoke-static {v10, v12}, Ljava/lang/Math;->min(II)I

    .line 162
    .line 163
    .line 164
    move-result v10

    .line 165
    iget-object v12, v11, LJ5/y;->b:[B

    .line 166
    .line 167
    invoke-virtual {v0, v1, v12, v10}, LY2/r;->d(LQ1/o;[BI)Z

    .line 168
    .line 169
    .line 170
    move-result v10

    .line 171
    if-eqz v10, :cond_8

    .line 172
    .line 173
    const/4 v10, 0x0

    .line 174
    iget v12, v0, LY2/r;->i:I

    .line 175
    .line 176
    invoke-virtual {v0, v1, v10, v12}, LY2/r;->d(LQ1/o;[BI)Z

    .line 177
    .line 178
    .line 179
    move-result v10

    .line 180
    if-eqz v10, :cond_8

    .line 181
    .line 182
    invoke-virtual {v11, v9}, LJ5/y;->q(I)V

    .line 183
    .line 184
    .line 185
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    iput-wide v12, v0, LY2/r;->l:J

    .line 191
    .line 192
    iget-boolean v10, v0, LY2/r;->f:Z

    .line 193
    .line 194
    const/4 v12, 0x4

    .line 195
    if-eqz v10, :cond_c

    .line 196
    .line 197
    invoke-virtual {v11, v12}, LJ5/y;->t(I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v11, v7}, LJ5/y;->i(I)I

    .line 201
    .line 202
    .line 203
    move-result v10

    .line 204
    int-to-long v13, v10

    .line 205
    const/16 v10, 0x1e

    .line 206
    .line 207
    shl-long/2addr v13, v10

    .line 208
    invoke-virtual {v11, v4}, LJ5/y;->t(I)V

    .line 209
    .line 210
    .line 211
    const/16 v15, 0xf

    .line 212
    .line 213
    invoke-virtual {v11, v15}, LJ5/y;->i(I)I

    .line 214
    .line 215
    .line 216
    move-result v16

    .line 217
    move/from16 p1, v10

    .line 218
    .line 219
    shl-int/lit8 v10, v16, 0xf

    .line 220
    .line 221
    int-to-long v8, v10

    .line 222
    or-long/2addr v8, v13

    .line 223
    invoke-virtual {v11, v4}, LJ5/y;->t(I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v11, v15}, LJ5/y;->i(I)I

    .line 227
    .line 228
    .line 229
    move-result v10

    .line 230
    int-to-long v13, v10

    .line 231
    or-long/2addr v8, v13

    .line 232
    invoke-virtual {v11, v4}, LJ5/y;->t(I)V

    .line 233
    .line 234
    .line 235
    iget-boolean v10, v0, LY2/r;->h:Z

    .line 236
    .line 237
    if-nez v10, :cond_b

    .line 238
    .line 239
    iget-boolean v10, v0, LY2/r;->g:Z

    .line 240
    .line 241
    if-eqz v10, :cond_b

    .line 242
    .line 243
    invoke-virtual {v11, v12}, LJ5/y;->t(I)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v11, v7}, LJ5/y;->i(I)I

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    int-to-long v13, v10

    .line 251
    shl-long v13, v13, p1

    .line 252
    .line 253
    invoke-virtual {v11, v4}, LJ5/y;->t(I)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v11, v15}, LJ5/y;->i(I)I

    .line 257
    .line 258
    .line 259
    move-result v10

    .line 260
    shl-int/2addr v10, v15

    .line 261
    move-wide/from16 v17, v13

    .line 262
    .line 263
    int-to-long v12, v10

    .line 264
    or-long v12, v17, v12

    .line 265
    .line 266
    invoke-virtual {v11, v4}, LJ5/y;->t(I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v11, v15}, LJ5/y;->i(I)I

    .line 270
    .line 271
    .line 272
    move-result v10

    .line 273
    int-to-long v14, v10

    .line 274
    or-long/2addr v12, v14

    .line 275
    invoke-virtual {v11, v4}, LJ5/y;->t(I)V

    .line 276
    .line 277
    .line 278
    iget-object v10, v0, LY2/r;->e:LQ1/u;

    .line 279
    .line 280
    invoke-virtual {v10, v12, v13}, LQ1/u;->b(J)J

    .line 281
    .line 282
    .line 283
    iput-boolean v4, v0, LY2/r;->h:Z

    .line 284
    .line 285
    :cond_b
    iget-object v10, v0, LY2/r;->e:LQ1/u;

    .line 286
    .line 287
    invoke-virtual {v10, v8, v9}, LQ1/u;->b(J)J

    .line 288
    .line 289
    .line 290
    move-result-wide v8

    .line 291
    iput-wide v8, v0, LY2/r;->l:J

    .line 292
    .line 293
    :cond_c
    iget-boolean v8, v0, LY2/r;->k:Z

    .line 294
    .line 295
    if-eqz v8, :cond_d

    .line 296
    .line 297
    const/4 v12, 0x4

    .line 298
    goto :goto_4

    .line 299
    :cond_d
    const/4 v12, 0x0

    .line 300
    :goto_4
    or-int/2addr v2, v12

    .line 301
    iget-wide v8, v0, LY2/r;->l:J

    .line 302
    .line 303
    invoke-interface {v3, v2, v8, v9}, LY2/h;->d(IJ)V

    .line 304
    .line 305
    .line 306
    iput v7, v0, LY2/r;->c:I

    .line 307
    .line 308
    const/4 v8, 0x0

    .line 309
    iput v8, v0, LY2/r;->d:I

    .line 310
    .line 311
    move v9, v8

    .line 312
    const/4 v8, 0x2

    .line 313
    goto/16 :goto_2

    .line 314
    .line 315
    :cond_e
    move v8, v9

    .line 316
    iget-object v9, v11, LJ5/y;->b:[B

    .line 317
    .line 318
    const/16 v10, 0x9

    .line 319
    .line 320
    invoke-virtual {v0, v1, v9, v10}, LY2/r;->d(LQ1/o;[BI)Z

    .line 321
    .line 322
    .line 323
    move-result v9

    .line 324
    if-eqz v9, :cond_12

    .line 325
    .line 326
    invoke-virtual {v11, v8}, LJ5/y;->q(I)V

    .line 327
    .line 328
    .line 329
    const/16 v8, 0x18

    .line 330
    .line 331
    invoke-virtual {v11, v8}, LJ5/y;->i(I)I

    .line 332
    .line 333
    .line 334
    move-result v8

    .line 335
    if-eq v8, v4, :cond_f

    .line 336
    .line 337
    const-string v9, "Unexpected start code prefix: "

    .line 338
    .line 339
    invoke-static {v8, v9, v5}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    iput v6, v0, LY2/r;->j:I

    .line 343
    .line 344
    const/4 v8, 0x0

    .line 345
    const/4 v10, 0x2

    .line 346
    goto :goto_6

    .line 347
    :cond_f
    const/16 v8, 0x8

    .line 348
    .line 349
    invoke-virtual {v11, v8}, LJ5/y;->t(I)V

    .line 350
    .line 351
    .line 352
    const/16 v9, 0x10

    .line 353
    .line 354
    invoke-virtual {v11, v9}, LJ5/y;->i(I)I

    .line 355
    .line 356
    .line 357
    move-result v9

    .line 358
    const/4 v10, 0x5

    .line 359
    invoke-virtual {v11, v10}, LJ5/y;->t(I)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v11}, LJ5/y;->h()Z

    .line 363
    .line 364
    .line 365
    move-result v10

    .line 366
    iput-boolean v10, v0, LY2/r;->k:Z

    .line 367
    .line 368
    const/4 v10, 0x2

    .line 369
    invoke-virtual {v11, v10}, LJ5/y;->t(I)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v11}, LJ5/y;->h()Z

    .line 373
    .line 374
    .line 375
    move-result v12

    .line 376
    iput-boolean v12, v0, LY2/r;->f:Z

    .line 377
    .line 378
    invoke-virtual {v11}, LJ5/y;->h()Z

    .line 379
    .line 380
    .line 381
    move-result v12

    .line 382
    iput-boolean v12, v0, LY2/r;->g:Z

    .line 383
    .line 384
    const/4 v12, 0x6

    .line 385
    invoke-virtual {v11, v12}, LJ5/y;->t(I)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v11, v8}, LJ5/y;->i(I)I

    .line 389
    .line 390
    .line 391
    move-result v8

    .line 392
    iput v8, v0, LY2/r;->i:I

    .line 393
    .line 394
    if-nez v9, :cond_10

    .line 395
    .line 396
    iput v6, v0, LY2/r;->j:I

    .line 397
    .line 398
    goto :goto_5

    .line 399
    :cond_10
    add-int/lit8 v9, v9, -0x3

    .line 400
    .line 401
    sub-int/2addr v9, v8

    .line 402
    iput v9, v0, LY2/r;->j:I

    .line 403
    .line 404
    if-gez v9, :cond_11

    .line 405
    .line 406
    new-instance v8, Ljava/lang/StringBuilder;

    .line 407
    .line 408
    const-string v9, "Found negative packet payload size: "

    .line 409
    .line 410
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    iget v9, v0, LY2/r;->j:I

    .line 414
    .line 415
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v8

    .line 422
    invoke-static {v5, v8}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    iput v6, v0, LY2/r;->j:I

    .line 426
    .line 427
    :cond_11
    :goto_5
    move v8, v10

    .line 428
    :goto_6
    iput v8, v0, LY2/r;->c:I

    .line 429
    .line 430
    const/4 v8, 0x0

    .line 431
    iput v8, v0, LY2/r;->d:I

    .line 432
    .line 433
    goto :goto_7

    .line 434
    :cond_12
    const/4 v10, 0x2

    .line 435
    goto :goto_7

    .line 436
    :cond_13
    move v10, v8

    .line 437
    move v8, v9

    .line 438
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 439
    .line 440
    .line 441
    move-result v9

    .line 442
    invoke-virtual {v1, v9}, LQ1/o;->H(I)V

    .line 443
    .line 444
    .line 445
    :goto_7
    move v9, v8

    .line 446
    move v8, v10

    .line 447
    goto/16 :goto_2

    .line 448
    .line 449
    :cond_14
    return-void
.end method

.method public final d(LQ1/o;[BI)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, LQ1/o;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, LY2/r;->d:I

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
    invoke-virtual {p1, v0}, LQ1/o;->H(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget v2, p0, LY2/r;->d:I

    .line 24
    .line 25
    invoke-virtual {p1, v2, v0, p2}, LQ1/o;->f(II[B)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget p1, p0, LY2/r;->d:I

    .line 29
    .line 30
    add-int/2addr p1, v0

    .line 31
    iput p1, p0, LY2/r;->d:I

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
