.class public final LT5/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/f;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LY4/b;

.field public final c:LJ5/y;

.field public d:LJ5/w;

.field public e:Ljava/lang/String;

.field public f:LE5/T;

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:J

.field public l:Z

.field public m:I

.field public n:I

.field public o:I

.field public p:Z

.field public q:J

.field public r:I

.field public s:J

.field public t:I

.field public u:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT5/q;->a:Ljava/lang/String;

    .line 5
    .line 6
    new-instance p1, LY4/b;

    .line 7
    .line 8
    const/16 v0, 0x400

    .line 9
    .line 10
    invoke-direct {p1, v0}, LY4/b;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LT5/q;->b:LY4/b;

    .line 14
    .line 15
    new-instance v0, LJ5/y;

    .line 16
    .line 17
    iget-object p1, p1, LY4/b;->a:[B

    .line 18
    .line 19
    array-length v1, p1

    .line 20
    const/4 v2, 0x6

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {v0, p1, v1, v2, v3}, LJ5/y;-><init>([BIIB)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, LT5/q;->c:LJ5/y;

    .line 26
    .line 27
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    iput-wide v0, p0, LT5/q;->k:J

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LT5/q;->g:I

    .line 3
    .line 4
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v1, p0, LT5/q;->k:J

    .line 10
    .line 11
    iput-boolean v0, p0, LT5/q;->l:Z

    .line 12
    .line 13
    return-void
.end method

.method public final c(LY4/b;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LT5/q;->d:LJ5/w;

    .line 4
    .line 5
    invoke-static {v1}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    :goto_0
    invoke-virtual/range {p1 .. p1}, LY4/b;->a()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-lez v1, :cond_1e

    .line 13
    .line 14
    iget v1, v0, LT5/q;->g:I

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    const/16 v3, 0x56

    .line 18
    .line 19
    if-eqz v1, :cond_1d

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    const/4 v5, 0x0

    .line 23
    if-eq v1, v2, :cond_1b

    .line 24
    .line 25
    iget-object v3, v0, LT5/q;->b:LY4/b;

    .line 26
    .line 27
    iget-object v6, v0, LT5/q;->c:LJ5/y;

    .line 28
    .line 29
    const/4 v7, 0x3

    .line 30
    const/16 v8, 0x8

    .line 31
    .line 32
    if-eq v1, v4, :cond_19

    .line 33
    .line 34
    if-ne v1, v7, :cond_18

    .line 35
    .line 36
    invoke-virtual/range {p1 .. p1}, LY4/b;->a()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget v9, v0, LT5/q;->i:I

    .line 41
    .line 42
    iget v10, v0, LT5/q;->h:I

    .line 43
    .line 44
    sub-int/2addr v9, v10

    .line 45
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    iget-object v9, v6, LJ5/y;->b:[B

    .line 50
    .line 51
    iget v10, v0, LT5/q;->h:I

    .line 52
    .line 53
    move-object/from16 v11, p1

    .line 54
    .line 55
    invoke-virtual {v11, v10, v1, v9}, LY4/b;->c(II[B)V

    .line 56
    .line 57
    .line 58
    iget v9, v0, LT5/q;->h:I

    .line 59
    .line 60
    add-int/2addr v9, v1

    .line 61
    iput v9, v0, LT5/q;->h:I

    .line 62
    .line 63
    iget v1, v0, LT5/q;->i:I

    .line 64
    .line 65
    if-ne v9, v1, :cond_0

    .line 66
    .line 67
    invoke-virtual {v6, v5}, LJ5/y;->q(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    const/4 v9, 0x0

    .line 75
    if-nez v1, :cond_f

    .line 76
    .line 77
    iput-boolean v2, v0, LT5/q;->l:Z

    .line 78
    .line 79
    invoke-virtual {v6, v2}, LJ5/y;->i(I)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-ne v1, v2, :cond_1

    .line 84
    .line 85
    invoke-virtual {v6, v2}, LJ5/y;->i(I)I

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    goto :goto_1

    .line 90
    :cond_1
    move v10, v5

    .line 91
    :goto_1
    iput v10, v0, LT5/q;->m:I

    .line 92
    .line 93
    if-nez v10, :cond_e

    .line 94
    .line 95
    if-ne v1, v2, :cond_2

    .line 96
    .line 97
    invoke-virtual {v6, v4}, LJ5/y;->i(I)I

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    add-int/2addr v10, v2

    .line 102
    mul-int/2addr v10, v8

    .line 103
    invoke-virtual {v6, v10}, LJ5/y;->i(I)I

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    if-eqz v10, :cond_d

    .line 111
    .line 112
    const/4 v10, 0x6

    .line 113
    invoke-virtual {v6, v10}, LJ5/y;->i(I)I

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    iput v12, v0, LT5/q;->n:I

    .line 118
    .line 119
    const/4 v12, 0x4

    .line 120
    invoke-virtual {v6, v12}, LJ5/y;->i(I)I

    .line 121
    .line 122
    .line 123
    move-result v13

    .line 124
    invoke-virtual {v6, v7}, LJ5/y;->i(I)I

    .line 125
    .line 126
    .line 127
    move-result v14

    .line 128
    if-nez v13, :cond_c

    .line 129
    .line 130
    if-nez v14, :cond_c

    .line 131
    .line 132
    if-nez v1, :cond_3

    .line 133
    .line 134
    invoke-virtual {v6}, LJ5/y;->g()I

    .line 135
    .line 136
    .line 137
    move-result v13

    .line 138
    invoke-virtual {v6}, LJ5/y;->b()I

    .line 139
    .line 140
    .line 141
    move-result v14

    .line 142
    invoke-static {v6, v2}, LG5/b;->f(LJ5/y;Z)LG5/a;

    .line 143
    .line 144
    .line 145
    move-result-object v15

    .line 146
    iget-object v5, v15, LG5/a;->c:Ljava/lang/String;

    .line 147
    .line 148
    iput-object v5, v0, LT5/q;->u:Ljava/lang/String;

    .line 149
    .line 150
    iget v5, v15, LG5/a;->a:I

    .line 151
    .line 152
    iput v5, v0, LT5/q;->r:I

    .line 153
    .line 154
    iget v5, v15, LG5/a;->b:I

    .line 155
    .line 156
    iput v5, v0, LT5/q;->t:I

    .line 157
    .line 158
    invoke-virtual {v6}, LJ5/y;->b()I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    sub-int/2addr v14, v5

    .line 163
    invoke-virtual {v6, v13}, LJ5/y;->q(I)V

    .line 164
    .line 165
    .line 166
    add-int/lit8 v5, v14, 0x7

    .line 167
    .line 168
    div-int/2addr v5, v8

    .line 169
    new-array v5, v5, [B

    .line 170
    .line 171
    invoke-virtual {v6, v14, v5}, LJ5/y;->j(I[B)V

    .line 172
    .line 173
    .line 174
    new-instance v13, LE5/S;

    .line 175
    .line 176
    invoke-direct {v13}, LE5/S;-><init>()V

    .line 177
    .line 178
    .line 179
    iget-object v14, v0, LT5/q;->e:Ljava/lang/String;

    .line 180
    .line 181
    iput-object v14, v13, LE5/S;->a:Ljava/lang/String;

    .line 182
    .line 183
    const-string v14, "audio/mp4a-latm"

    .line 184
    .line 185
    iput-object v14, v13, LE5/S;->k:Ljava/lang/String;

    .line 186
    .line 187
    iget-object v14, v0, LT5/q;->u:Ljava/lang/String;

    .line 188
    .line 189
    iput-object v14, v13, LE5/S;->h:Ljava/lang/String;

    .line 190
    .line 191
    iget v14, v0, LT5/q;->t:I

    .line 192
    .line 193
    iput v14, v13, LE5/S;->x:I

    .line 194
    .line 195
    iget v14, v0, LT5/q;->r:I

    .line 196
    .line 197
    iput v14, v13, LE5/S;->y:I

    .line 198
    .line 199
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    iput-object v5, v13, LE5/S;->m:Ljava/util/List;

    .line 204
    .line 205
    iget-object v5, v0, LT5/q;->a:Ljava/lang/String;

    .line 206
    .line 207
    iput-object v5, v13, LE5/S;->c:Ljava/lang/String;

    .line 208
    .line 209
    new-instance v5, LE5/T;

    .line 210
    .line 211
    invoke-direct {v5, v13}, LE5/T;-><init>(LE5/S;)V

    .line 212
    .line 213
    .line 214
    iget-object v13, v0, LT5/q;->f:LE5/T;

    .line 215
    .line 216
    invoke-virtual {v5, v13}, LE5/T;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v13

    .line 220
    if-nez v13, :cond_4

    .line 221
    .line 222
    iput-object v5, v0, LT5/q;->f:LE5/T;

    .line 223
    .line 224
    iget v13, v5, LE5/T;->z:I

    .line 225
    .line 226
    int-to-long v13, v13

    .line 227
    const-wide/32 v16, 0x3d090000

    .line 228
    .line 229
    .line 230
    div-long v13, v16, v13

    .line 231
    .line 232
    iput-wide v13, v0, LT5/q;->s:J

    .line 233
    .line 234
    iget-object v13, v0, LT5/q;->d:LJ5/w;

    .line 235
    .line 236
    invoke-interface {v13, v5}, LJ5/w;->a(LE5/T;)V

    .line 237
    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_3
    invoke-virtual {v6, v4}, LJ5/y;->i(I)I

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    add-int/2addr v5, v2

    .line 245
    mul-int/2addr v5, v8

    .line 246
    invoke-virtual {v6, v5}, LJ5/y;->i(I)I

    .line 247
    .line 248
    .line 249
    move-result v5

    .line 250
    int-to-long v13, v5

    .line 251
    long-to-int v5, v13

    .line 252
    invoke-virtual {v6}, LJ5/y;->b()I

    .line 253
    .line 254
    .line 255
    move-result v13

    .line 256
    invoke-static {v6, v2}, LG5/b;->f(LJ5/y;Z)LG5/a;

    .line 257
    .line 258
    .line 259
    move-result-object v14

    .line 260
    iget-object v15, v14, LG5/a;->c:Ljava/lang/String;

    .line 261
    .line 262
    iput-object v15, v0, LT5/q;->u:Ljava/lang/String;

    .line 263
    .line 264
    iget v15, v14, LG5/a;->a:I

    .line 265
    .line 266
    iput v15, v0, LT5/q;->r:I

    .line 267
    .line 268
    iget v14, v14, LG5/a;->b:I

    .line 269
    .line 270
    iput v14, v0, LT5/q;->t:I

    .line 271
    .line 272
    invoke-virtual {v6}, LJ5/y;->b()I

    .line 273
    .line 274
    .line 275
    move-result v14

    .line 276
    sub-int/2addr v13, v14

    .line 277
    sub-int/2addr v5, v13

    .line 278
    invoke-virtual {v6, v5}, LJ5/y;->t(I)V

    .line 279
    .line 280
    .line 281
    :cond_4
    :goto_2
    invoke-virtual {v6, v7}, LJ5/y;->i(I)I

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    iput v5, v0, LT5/q;->o:I

    .line 286
    .line 287
    if-eqz v5, :cond_9

    .line 288
    .line 289
    if-eq v5, v2, :cond_8

    .line 290
    .line 291
    if-eq v5, v7, :cond_7

    .line 292
    .line 293
    if-eq v5, v12, :cond_7

    .line 294
    .line 295
    const/4 v7, 0x5

    .line 296
    if-eq v5, v7, :cond_7

    .line 297
    .line 298
    if-eq v5, v10, :cond_6

    .line 299
    .line 300
    const/4 v7, 0x7

    .line 301
    if-ne v5, v7, :cond_5

    .line 302
    .line 303
    goto :goto_3

    .line 304
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 305
    .line 306
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 307
    .line 308
    .line 309
    throw v1

    .line 310
    :cond_6
    :goto_3
    invoke-virtual {v6, v2}, LJ5/y;->t(I)V

    .line 311
    .line 312
    .line 313
    goto :goto_4

    .line 314
    :cond_7
    invoke-virtual {v6, v10}, LJ5/y;->t(I)V

    .line 315
    .line 316
    .line 317
    goto :goto_4

    .line 318
    :cond_8
    const/16 v5, 0x9

    .line 319
    .line 320
    invoke-virtual {v6, v5}, LJ5/y;->t(I)V

    .line 321
    .line 322
    .line 323
    goto :goto_4

    .line 324
    :cond_9
    invoke-virtual {v6, v8}, LJ5/y;->t(I)V

    .line 325
    .line 326
    .line 327
    :goto_4
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 328
    .line 329
    .line 330
    move-result v5

    .line 331
    iput-boolean v5, v0, LT5/q;->p:Z

    .line 332
    .line 333
    const-wide/16 v12, 0x0

    .line 334
    .line 335
    iput-wide v12, v0, LT5/q;->q:J

    .line 336
    .line 337
    if-eqz v5, :cond_b

    .line 338
    .line 339
    if-ne v1, v2, :cond_a

    .line 340
    .line 341
    invoke-virtual {v6, v4}, LJ5/y;->i(I)I

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    add-int/2addr v1, v2

    .line 346
    mul-int/2addr v1, v8

    .line 347
    invoke-virtual {v6, v1}, LJ5/y;->i(I)I

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    int-to-long v1, v1

    .line 352
    iput-wide v1, v0, LT5/q;->q:J

    .line 353
    .line 354
    goto :goto_5

    .line 355
    :cond_a
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    iget-wide v4, v0, LT5/q;->q:J

    .line 360
    .line 361
    shl-long/2addr v4, v8

    .line 362
    invoke-virtual {v6, v8}, LJ5/y;->i(I)I

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    int-to-long v12, v2

    .line 367
    add-long/2addr v4, v12

    .line 368
    iput-wide v4, v0, LT5/q;->q:J

    .line 369
    .line 370
    if-nez v1, :cond_a

    .line 371
    .line 372
    :cond_b
    :goto_5
    invoke-virtual {v6}, LJ5/y;->h()Z

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    if-eqz v1, :cond_10

    .line 377
    .line 378
    invoke-virtual {v6, v8}, LJ5/y;->t(I)V

    .line 379
    .line 380
    .line 381
    goto :goto_6

    .line 382
    :cond_c
    invoke-static {v9, v9}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    throw v1

    .line 387
    :cond_d
    invoke-static {v9, v9}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    throw v1

    .line 392
    :cond_e
    invoke-static {v9, v9}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    throw v1

    .line 397
    :cond_f
    iget-boolean v1, v0, LT5/q;->l:Z

    .line 398
    .line 399
    if-nez v1, :cond_10

    .line 400
    .line 401
    goto :goto_9

    .line 402
    :cond_10
    :goto_6
    iget v1, v0, LT5/q;->m:I

    .line 403
    .line 404
    if-nez v1, :cond_17

    .line 405
    .line 406
    iget v1, v0, LT5/q;->n:I

    .line 407
    .line 408
    if-nez v1, :cond_16

    .line 409
    .line 410
    iget v1, v0, LT5/q;->o:I

    .line 411
    .line 412
    if-nez v1, :cond_15

    .line 413
    .line 414
    const/4 v1, 0x0

    .line 415
    :goto_7
    invoke-virtual {v6, v8}, LJ5/y;->i(I)I

    .line 416
    .line 417
    .line 418
    move-result v2

    .line 419
    add-int/2addr v1, v2

    .line 420
    const/16 v4, 0xff

    .line 421
    .line 422
    if-eq v2, v4, :cond_14

    .line 423
    .line 424
    invoke-virtual {v6}, LJ5/y;->g()I

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    and-int/lit8 v4, v2, 0x7

    .line 429
    .line 430
    if-nez v4, :cond_11

    .line 431
    .line 432
    shr-int/lit8 v2, v2, 0x3

    .line 433
    .line 434
    invoke-virtual {v3, v2}, LY4/b;->A(I)V

    .line 435
    .line 436
    .line 437
    goto :goto_8

    .line 438
    :cond_11
    iget-object v2, v3, LY4/b;->a:[B

    .line 439
    .line 440
    mul-int/lit8 v4, v1, 0x8

    .line 441
    .line 442
    invoke-virtual {v6, v4, v2}, LJ5/y;->j(I[B)V

    .line 443
    .line 444
    .line 445
    const/4 v2, 0x0

    .line 446
    invoke-virtual {v3, v2}, LY4/b;->A(I)V

    .line 447
    .line 448
    .line 449
    :goto_8
    iget-object v2, v0, LT5/q;->d:LJ5/w;

    .line 450
    .line 451
    invoke-interface {v2, v1, v3}, LJ5/w;->c(ILY4/b;)V

    .line 452
    .line 453
    .line 454
    iget-wide v2, v0, LT5/q;->k:J

    .line 455
    .line 456
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    cmp-long v4, v2, v4

    .line 462
    .line 463
    if-eqz v4, :cond_12

    .line 464
    .line 465
    iget-object v4, v0, LT5/q;->d:LJ5/w;

    .line 466
    .line 467
    const/16 v21, 0x0

    .line 468
    .line 469
    const/16 v22, 0x0

    .line 470
    .line 471
    const/16 v19, 0x1

    .line 472
    .line 473
    move/from16 v20, v1

    .line 474
    .line 475
    move-wide/from16 v17, v2

    .line 476
    .line 477
    move-object/from16 v16, v4

    .line 478
    .line 479
    invoke-interface/range {v16 .. v22}, LJ5/w;->b(JIIILJ5/v;)V

    .line 480
    .line 481
    .line 482
    iget-wide v1, v0, LT5/q;->k:J

    .line 483
    .line 484
    iget-wide v3, v0, LT5/q;->s:J

    .line 485
    .line 486
    add-long/2addr v1, v3

    .line 487
    iput-wide v1, v0, LT5/q;->k:J

    .line 488
    .line 489
    :cond_12
    iget-boolean v1, v0, LT5/q;->p:Z

    .line 490
    .line 491
    if-eqz v1, :cond_13

    .line 492
    .line 493
    iget-wide v1, v0, LT5/q;->q:J

    .line 494
    .line 495
    long-to-int v1, v1

    .line 496
    invoke-virtual {v6, v1}, LJ5/y;->t(I)V

    .line 497
    .line 498
    .line 499
    :cond_13
    :goto_9
    const/4 v2, 0x0

    .line 500
    iput v2, v0, LT5/q;->g:I

    .line 501
    .line 502
    goto/16 :goto_0

    .line 503
    .line 504
    :cond_14
    move/from16 v20, v1

    .line 505
    .line 506
    goto :goto_7

    .line 507
    :cond_15
    invoke-static {v9, v9}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    throw v1

    .line 512
    :cond_16
    invoke-static {v9, v9}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    throw v1

    .line 517
    :cond_17
    invoke-static {v9, v9}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    throw v1

    .line 522
    :cond_18
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 523
    .line 524
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 525
    .line 526
    .line 527
    throw v1

    .line 528
    :cond_19
    move-object/from16 v11, p1

    .line 529
    .line 530
    iget v1, v0, LT5/q;->j:I

    .line 531
    .line 532
    and-int/lit16 v1, v1, -0xe1

    .line 533
    .line 534
    shl-int/2addr v1, v8

    .line 535
    invoke-virtual {v11}, LY4/b;->q()I

    .line 536
    .line 537
    .line 538
    move-result v2

    .line 539
    or-int/2addr v1, v2

    .line 540
    iput v1, v0, LT5/q;->i:I

    .line 541
    .line 542
    iget-object v2, v3, LY4/b;->a:[B

    .line 543
    .line 544
    array-length v2, v2

    .line 545
    if-le v1, v2, :cond_1a

    .line 546
    .line 547
    invoke-virtual {v3, v1}, LY4/b;->x(I)V

    .line 548
    .line 549
    .line 550
    iget-object v1, v3, LY4/b;->a:[B

    .line 551
    .line 552
    array-length v2, v1

    .line 553
    invoke-virtual {v6, v2, v1}, LJ5/y;->o(I[B)V

    .line 554
    .line 555
    .line 556
    :cond_1a
    const/4 v2, 0x0

    .line 557
    iput v2, v0, LT5/q;->h:I

    .line 558
    .line 559
    iput v7, v0, LT5/q;->g:I

    .line 560
    .line 561
    goto/16 :goto_0

    .line 562
    .line 563
    :cond_1b
    move-object/from16 v11, p1

    .line 564
    .line 565
    invoke-virtual {v11}, LY4/b;->q()I

    .line 566
    .line 567
    .line 568
    move-result v1

    .line 569
    and-int/lit16 v2, v1, 0xe0

    .line 570
    .line 571
    const/16 v5, 0xe0

    .line 572
    .line 573
    if-ne v2, v5, :cond_1c

    .line 574
    .line 575
    iput v1, v0, LT5/q;->j:I

    .line 576
    .line 577
    iput v4, v0, LT5/q;->g:I

    .line 578
    .line 579
    goto/16 :goto_0

    .line 580
    .line 581
    :cond_1c
    if-eq v1, v3, :cond_0

    .line 582
    .line 583
    const/4 v2, 0x0

    .line 584
    iput v2, v0, LT5/q;->g:I

    .line 585
    .line 586
    goto/16 :goto_0

    .line 587
    .line 588
    :cond_1d
    move-object/from16 v11, p1

    .line 589
    .line 590
    invoke-virtual {v11}, LY4/b;->q()I

    .line 591
    .line 592
    .line 593
    move-result v1

    .line 594
    if-ne v1, v3, :cond_0

    .line 595
    .line 596
    iput v2, v0, LT5/q;->g:I

    .line 597
    .line 598
    goto/16 :goto_0

    .line 599
    .line 600
    :cond_1e
    return-void
.end method

.method public final d(IJ)V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long p1, p2, v0

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iput-wide p2, p0, LT5/q;->k:J

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final g(LJ5/m;LT5/B;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, LT5/B;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, LT5/B;->b()V

    .line 5
    .line 6
    .line 7
    iget v0, p2, LT5/B;->e:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-interface {p1, v0, v1}, LJ5/m;->m(II)LJ5/w;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, LT5/q;->d:LJ5/w;

    .line 15
    .line 16
    invoke-virtual {p2}, LT5/B;->b()V

    .line 17
    .line 18
    .line 19
    iget-object p1, p2, LT5/B;->f:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p1, p0, LT5/q;->e:Ljava/lang/String;

    .line 22
    .line 23
    return-void
.end method

.method public final i()V
    .locals 0

    .line 1
    return-void
.end method
