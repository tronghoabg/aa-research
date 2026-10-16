.class public final LM5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ5/k;


# instance fields
.field public final a:[B

.field public final b:LY4/b;

.field public final c:Z

.field public final d:LJ5/n;

.field public e:Lf6/N;

.field public f:LJ5/w;

.field public g:I

.field public h:LW5/c;

.field public i:LJ5/p;

.field public j:I

.field public k:I

.field public l:LM5/a;

.field public m:I

.field public n:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x2a

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    iput-object v0, p0, LM5/b;->a:[B

    .line 9
    .line 10
    new-instance v0, LY4/b;

    .line 11
    .line 12
    const v1, 0x8000

    .line 13
    .line 14
    .line 15
    new-array v1, v1, [B

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v0, v1, v2}, LY4/b;-><init>([BI)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, LM5/b;->b:LY4/b;

    .line 22
    .line 23
    iput-boolean v2, p0, LM5/b;->c:Z

    .line 24
    .line 25
    new-instance v0, LJ5/n;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, LM5/b;->d:LJ5/n;

    .line 31
    .line 32
    iput v2, p0, LM5/b;->g:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    iput p2, p0, LM5/b;->g:I

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, LM5/b;->l:LM5/a;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1, p3, p4}, LJ5/f;->D(J)V

    .line 16
    .line 17
    .line 18
    :cond_1
    :goto_0
    cmp-long p1, p3, v0

    .line 19
    .line 20
    if-nez p1, :cond_2

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    const-wide/16 v0, -0x1

    .line 24
    .line 25
    :goto_1
    iput-wide v0, p0, LM5/b;->n:J

    .line 26
    .line 27
    iput p2, p0, LM5/b;->m:I

    .line 28
    .line 29
    iget-object p1, p0, LM5/b;->b:LY4/b;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, LY4/b;->x(I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final g(LJ5/l;LJ5/n;)I
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    iget v5, v0, LM5/b;->g:I

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    if-eqz v5, :cond_29

    .line 11
    .line 12
    iget-object v7, v0, LM5/b;->a:[B

    .line 13
    .line 14
    if-eq v5, v3, :cond_28

    .line 15
    .line 16
    const/16 v8, 0x18

    .line 17
    .line 18
    const/16 v9, 0x8

    .line 19
    .line 20
    const/16 v10, 0x10

    .line 21
    .line 22
    const/4 v11, 0x4

    .line 23
    const/4 v12, 0x3

    .line 24
    if-eq v5, v2, :cond_26

    .line 25
    .line 26
    const/4 v13, 0x7

    .line 27
    if-eq v5, v12, :cond_1c

    .line 28
    .line 29
    const-wide/16 v7, 0x0

    .line 30
    .line 31
    const-wide/16 v14, -0x1

    .line 32
    .line 33
    const/4 v12, 0x5

    .line 34
    if-eq v5, v11, :cond_16

    .line 35
    .line 36
    if-ne v5, v12, :cond_15

    .line 37
    .line 38
    iget-object v5, v0, LM5/b;->f:LJ5/w;

    .line 39
    .line 40
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v5, v0, LM5/b;->i:LJ5/p;

    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object v5, v0, LM5/b;->l:LM5/a;

    .line 49
    .line 50
    if-eqz v5, :cond_0

    .line 51
    .line 52
    iget-object v9, v5, LJ5/f;->e:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v9, LJ5/b;

    .line 55
    .line 56
    if-eqz v9, :cond_0

    .line 57
    .line 58
    move-object/from16 v1, p1

    .line 59
    .line 60
    check-cast v1, LJ5/h;

    .line 61
    .line 62
    move-object/from16 v2, p2

    .line 63
    .line 64
    invoke-virtual {v5, v1, v2}, LJ5/f;->u(LJ5/h;LJ5/n;)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    return v1

    .line 69
    :cond_0
    iget-wide v11, v0, LM5/b;->n:J

    .line 70
    .line 71
    cmp-long v5, v11, v14

    .line 72
    .line 73
    const/4 v9, -0x1

    .line 74
    if-nez v5, :cond_7

    .line 75
    .line 76
    iget-object v5, v0, LM5/b;->i:LJ5/p;

    .line 77
    .line 78
    move-object/from16 v10, p1

    .line 79
    .line 80
    check-cast v10, LJ5/h;

    .line 81
    .line 82
    iput v4, v10, LJ5/h;->f:I

    .line 83
    .line 84
    move-object/from16 v10, p1

    .line 85
    .line 86
    check-cast v10, LJ5/h;

    .line 87
    .line 88
    invoke-virtual {v10, v3, v4}, LJ5/h;->b(IZ)Z

    .line 89
    .line 90
    .line 91
    new-array v11, v3, [B

    .line 92
    .line 93
    invoke-virtual {v10, v11, v4, v3, v4}, LJ5/h;->c([BIIZ)Z

    .line 94
    .line 95
    .line 96
    aget-byte v11, v11, v4

    .line 97
    .line 98
    and-int/2addr v11, v3

    .line 99
    if-ne v11, v3, :cond_1

    .line 100
    .line 101
    move v11, v3

    .line 102
    goto :goto_0

    .line 103
    :cond_1
    move v11, v4

    .line 104
    :goto_0
    invoke-virtual {v10, v2, v4}, LJ5/h;->b(IZ)Z

    .line 105
    .line 106
    .line 107
    if-eqz v11, :cond_2

    .line 108
    .line 109
    move v1, v13

    .line 110
    :cond_2
    new-instance v2, LY4/b;

    .line 111
    .line 112
    invoke-direct {v2, v1}, LY4/b;-><init>(I)V

    .line 113
    .line 114
    .line 115
    iget-object v12, v2, LY4/b;->a:[B

    .line 116
    .line 117
    move v13, v4

    .line 118
    :goto_1
    if-ge v13, v1, :cond_4

    .line 119
    .line 120
    sub-int v14, v1, v13

    .line 121
    .line 122
    invoke-virtual {v10, v13, v14, v12}, LJ5/h;->m(II[B)I

    .line 123
    .line 124
    .line 125
    move-result v14

    .line 126
    if-ne v14, v9, :cond_3

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_3
    add-int/2addr v13, v14

    .line 130
    goto :goto_1

    .line 131
    :cond_4
    :goto_2
    invoke-virtual {v2, v13}, LY4/b;->z(I)V

    .line 132
    .line 133
    .line 134
    iput v4, v10, LJ5/h;->f:I

    .line 135
    .line 136
    :try_start_0
    invoke-virtual {v2}, LY4/b;->w()J

    .line 137
    .line 138
    .line 139
    move-result-wide v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    if-eqz v11, :cond_5

    .line 141
    .line 142
    :goto_3
    move-wide v7, v1

    .line 143
    goto :goto_4

    .line 144
    :cond_5
    iget v5, v5, LJ5/p;->c:I

    .line 145
    .line 146
    int-to-long v7, v5

    .line 147
    mul-long/2addr v1, v7

    .line 148
    goto :goto_3

    .line 149
    :catch_0
    move v3, v4

    .line 150
    :goto_4
    if-eqz v3, :cond_6

    .line 151
    .line 152
    iput-wide v7, v0, LM5/b;->n:J

    .line 153
    .line 154
    goto/16 :goto_c

    .line 155
    .line 156
    :cond_6
    invoke-static {v6, v6}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    throw v1

    .line 161
    :cond_7
    iget-object v1, v0, LM5/b;->b:LY4/b;

    .line 162
    .line 163
    iget v2, v1, LY4/b;->c:I

    .line 164
    .line 165
    const-wide/32 v5, 0xf4240

    .line 166
    .line 167
    .line 168
    const v7, 0x8000

    .line 169
    .line 170
    .line 171
    if-ge v2, v7, :cond_a

    .line 172
    .line 173
    iget-object v8, v1, LY4/b;->a:[B

    .line 174
    .line 175
    sub-int/2addr v7, v2

    .line 176
    move-object/from16 v11, p1

    .line 177
    .line 178
    check-cast v11, LJ5/h;

    .line 179
    .line 180
    invoke-virtual {v11, v8, v2, v7}, LJ5/h;->read([BII)I

    .line 181
    .line 182
    .line 183
    move-result v7

    .line 184
    if-ne v7, v9, :cond_8

    .line 185
    .line 186
    move v8, v3

    .line 187
    goto :goto_5

    .line 188
    :cond_8
    move v8, v4

    .line 189
    :goto_5
    if-nez v8, :cond_9

    .line 190
    .line 191
    add-int/2addr v2, v7

    .line 192
    invoke-virtual {v1, v2}, LY4/b;->z(I)V

    .line 193
    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_9
    invoke-virtual {v1}, LY4/b;->a()I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-nez v2, :cond_b

    .line 201
    .line 202
    iget-wide v1, v0, LM5/b;->n:J

    .line 203
    .line 204
    mul-long/2addr v1, v5

    .line 205
    iget-object v3, v0, LM5/b;->i:LJ5/p;

    .line 206
    .line 207
    sget v4, Lu6/v;->a:I

    .line 208
    .line 209
    iget v3, v3, LJ5/p;->f:I

    .line 210
    .line 211
    int-to-long v3, v3

    .line 212
    div-long v11, v1, v3

    .line 213
    .line 214
    iget-object v10, v0, LM5/b;->f:LJ5/w;

    .line 215
    .line 216
    iget v14, v0, LM5/b;->m:I

    .line 217
    .line 218
    const/16 v16, 0x0

    .line 219
    .line 220
    const/4 v13, 0x1

    .line 221
    const/4 v15, 0x0

    .line 222
    invoke-interface/range {v10 .. v16}, LJ5/w;->b(JIIILJ5/v;)V

    .line 223
    .line 224
    .line 225
    return v9

    .line 226
    :cond_a
    move v8, v4

    .line 227
    :cond_b
    :goto_6
    iget v2, v1, LY4/b;->b:I

    .line 228
    .line 229
    iget v7, v0, LM5/b;->m:I

    .line 230
    .line 231
    iget v9, v0, LM5/b;->j:I

    .line 232
    .line 233
    if-ge v7, v9, :cond_c

    .line 234
    .line 235
    sub-int/2addr v9, v7

    .line 236
    invoke-virtual {v1}, LY4/b;->a()I

    .line 237
    .line 238
    .line 239
    move-result v7

    .line 240
    invoke-static {v9, v7}, Ljava/lang/Math;->min(II)I

    .line 241
    .line 242
    .line 243
    move-result v7

    .line 244
    invoke-virtual {v1, v7}, LY4/b;->B(I)V

    .line 245
    .line 246
    .line 247
    :cond_c
    iget-object v7, v0, LM5/b;->i:LJ5/p;

    .line 248
    .line 249
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    iget v7, v1, LY4/b;->b:I

    .line 253
    .line 254
    :goto_7
    iget v9, v1, LY4/b;->c:I

    .line 255
    .line 256
    sub-int/2addr v9, v10

    .line 257
    iget-object v11, v0, LM5/b;->d:LJ5/n;

    .line 258
    .line 259
    if-gt v7, v9, :cond_e

    .line 260
    .line 261
    invoke-virtual {v1, v7}, LY4/b;->A(I)V

    .line 262
    .line 263
    .line 264
    iget-object v9, v0, LM5/b;->i:LJ5/p;

    .line 265
    .line 266
    iget v12, v0, LM5/b;->k:I

    .line 267
    .line 268
    invoke-static {v1, v9, v12, v11}, LU8/v0;->o(LY4/b;LJ5/p;ILJ5/n;)Z

    .line 269
    .line 270
    .line 271
    move-result v9

    .line 272
    if-eqz v9, :cond_d

    .line 273
    .line 274
    invoke-virtual {v1, v7}, LY4/b;->A(I)V

    .line 275
    .line 276
    .line 277
    iget-wide v7, v11, LJ5/n;->a:J

    .line 278
    .line 279
    goto :goto_b

    .line 280
    :cond_d
    add-int/2addr v7, v3

    .line 281
    goto :goto_7

    .line 282
    :cond_e
    if-eqz v8, :cond_12

    .line 283
    .line 284
    :goto_8
    iget v8, v1, LY4/b;->c:I

    .line 285
    .line 286
    iget v9, v0, LM5/b;->j:I

    .line 287
    .line 288
    sub-int v9, v8, v9

    .line 289
    .line 290
    if-gt v7, v9, :cond_11

    .line 291
    .line 292
    invoke-virtual {v1, v7}, LY4/b;->A(I)V

    .line 293
    .line 294
    .line 295
    :try_start_1
    iget-object v8, v0, LM5/b;->i:LJ5/p;

    .line 296
    .line 297
    iget v9, v0, LM5/b;->k:I

    .line 298
    .line 299
    invoke-static {v1, v8, v9, v11}, LU8/v0;->o(LY4/b;LJ5/p;ILJ5/n;)Z

    .line 300
    .line 301
    .line 302
    move-result v8
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    .line 303
    goto :goto_9

    .line 304
    :catch_1
    move v8, v4

    .line 305
    :goto_9
    iget v9, v1, LY4/b;->b:I

    .line 306
    .line 307
    iget v12, v1, LY4/b;->c:I

    .line 308
    .line 309
    if-le v9, v12, :cond_f

    .line 310
    .line 311
    move v8, v4

    .line 312
    :cond_f
    if-eqz v8, :cond_10

    .line 313
    .line 314
    invoke-virtual {v1, v7}, LY4/b;->A(I)V

    .line 315
    .line 316
    .line 317
    iget-wide v7, v11, LJ5/n;->a:J

    .line 318
    .line 319
    goto :goto_b

    .line 320
    :cond_10
    add-int/2addr v7, v3

    .line 321
    goto :goto_8

    .line 322
    :cond_11
    invoke-virtual {v1, v8}, LY4/b;->A(I)V

    .line 323
    .line 324
    .line 325
    goto :goto_a

    .line 326
    :cond_12
    invoke-virtual {v1, v7}, LY4/b;->A(I)V

    .line 327
    .line 328
    .line 329
    :goto_a
    move-wide v7, v14

    .line 330
    :goto_b
    iget v3, v1, LY4/b;->b:I

    .line 331
    .line 332
    sub-int/2addr v3, v2

    .line 333
    invoke-virtual {v1, v2}, LY4/b;->A(I)V

    .line 334
    .line 335
    .line 336
    iget-object v2, v0, LM5/b;->f:LJ5/w;

    .line 337
    .line 338
    invoke-interface {v2, v3, v1}, LJ5/w;->c(ILY4/b;)V

    .line 339
    .line 340
    .line 341
    iget v2, v0, LM5/b;->m:I

    .line 342
    .line 343
    add-int/2addr v2, v3

    .line 344
    iput v2, v0, LM5/b;->m:I

    .line 345
    .line 346
    cmp-long v3, v7, v14

    .line 347
    .line 348
    if-eqz v3, :cond_13

    .line 349
    .line 350
    iget-wide v11, v0, LM5/b;->n:J

    .line 351
    .line 352
    mul-long/2addr v11, v5

    .line 353
    iget-object v3, v0, LM5/b;->i:LJ5/p;

    .line 354
    .line 355
    sget v5, Lu6/v;->a:I

    .line 356
    .line 357
    iget v3, v3, LJ5/p;->f:I

    .line 358
    .line 359
    int-to-long v5, v3

    .line 360
    div-long v17, v11, v5

    .line 361
    .line 362
    iget-object v3, v0, LM5/b;->f:LJ5/w;

    .line 363
    .line 364
    const/16 v22, 0x0

    .line 365
    .line 366
    const/16 v19, 0x1

    .line 367
    .line 368
    const/16 v21, 0x0

    .line 369
    .line 370
    move/from16 v20, v2

    .line 371
    .line 372
    move-object/from16 v16, v3

    .line 373
    .line 374
    invoke-interface/range {v16 .. v22}, LJ5/w;->b(JIIILJ5/v;)V

    .line 375
    .line 376
    .line 377
    iput v4, v0, LM5/b;->m:I

    .line 378
    .line 379
    iput-wide v7, v0, LM5/b;->n:J

    .line 380
    .line 381
    :cond_13
    invoke-virtual {v1}, LY4/b;->a()I

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    if-ge v2, v10, :cond_14

    .line 386
    .line 387
    invoke-virtual {v1}, LY4/b;->a()I

    .line 388
    .line 389
    .line 390
    move-result v2

    .line 391
    iget-object v3, v1, LY4/b;->a:[B

    .line 392
    .line 393
    iget v5, v1, LY4/b;->b:I

    .line 394
    .line 395
    invoke-static {v3, v5, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v1, v4}, LY4/b;->A(I)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v1, v2}, LY4/b;->z(I)V

    .line 402
    .line 403
    .line 404
    :cond_14
    :goto_c
    return v4

    .line 405
    :cond_15
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 406
    .line 407
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 408
    .line 409
    .line 410
    throw v1

    .line 411
    :cond_16
    move-object/from16 v5, p1

    .line 412
    .line 413
    check-cast v5, LJ5/h;

    .line 414
    .line 415
    iput v4, v5, LJ5/h;->f:I

    .line 416
    .line 417
    new-array v5, v2, [B

    .line 418
    .line 419
    move-object/from16 v10, p1

    .line 420
    .line 421
    check-cast v10, LJ5/h;

    .line 422
    .line 423
    invoke-virtual {v10, v5, v4, v2, v4}, LJ5/h;->c([BIIZ)Z

    .line 424
    .line 425
    .line 426
    aget-byte v11, v5, v4

    .line 427
    .line 428
    and-int/lit16 v11, v11, 0xff

    .line 429
    .line 430
    shl-int/lit8 v9, v11, 0x8

    .line 431
    .line 432
    aget-byte v3, v5, v3

    .line 433
    .line 434
    and-int/lit16 v3, v3, 0xff

    .line 435
    .line 436
    or-int/2addr v3, v9

    .line 437
    shr-int/lit8 v2, v3, 0x2

    .line 438
    .line 439
    const/16 v5, 0x3ffe

    .line 440
    .line 441
    if-ne v2, v5, :cond_1b

    .line 442
    .line 443
    iput v4, v10, LJ5/h;->f:I

    .line 444
    .line 445
    iput v3, v0, LM5/b;->k:I

    .line 446
    .line 447
    iget-object v2, v0, LM5/b;->e:Lf6/N;

    .line 448
    .line 449
    sget v3, Lu6/v;->a:I

    .line 450
    .line 451
    iget-wide v5, v10, LJ5/h;->d:J

    .line 452
    .line 453
    iget-object v3, v0, LM5/b;->i:LJ5/p;

    .line 454
    .line 455
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    iget-object v3, v0, LM5/b;->i:LJ5/p;

    .line 459
    .line 460
    iget-object v9, v3, LJ5/p;->l:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v9, LS3/e;

    .line 463
    .line 464
    if-eqz v9, :cond_17

    .line 465
    .line 466
    new-instance v1, LJ5/o;

    .line 467
    .line 468
    invoke-direct {v1, v3, v5, v6, v4}, LJ5/o;-><init>(Ljava/lang/Object;JI)V

    .line 469
    .line 470
    .line 471
    move v15, v4

    .line 472
    goto/16 :goto_10

    .line 473
    .line 474
    :cond_17
    iget-wide v9, v10, LJ5/h;->c:J

    .line 475
    .line 476
    cmp-long v11, v9, v14

    .line 477
    .line 478
    if-eqz v11, :cond_1a

    .line 479
    .line 480
    iget-wide v13, v3, LJ5/p;->k:J

    .line 481
    .line 482
    cmp-long v7, v13, v7

    .line 483
    .line 484
    if-lez v7, :cond_1a

    .line 485
    .line 486
    new-instance v16, LM5/a;

    .line 487
    .line 488
    iget v7, v0, LM5/b;->k:I

    .line 489
    .line 490
    new-instance v8, LB8/b;

    .line 491
    .line 492
    const/16 v11, 0x16

    .line 493
    .line 494
    invoke-direct {v8, v3, v11}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 495
    .line 496
    .line 497
    new-instance v11, LE4/n;

    .line 498
    .line 499
    invoke-direct {v11, v3, v7}, LE4/n;-><init>(LJ5/p;I)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v3}, LJ5/p;->c()J

    .line 503
    .line 504
    .line 505
    move-result-wide v19

    .line 506
    iget v7, v3, LJ5/p;->d:I

    .line 507
    .line 508
    iget v13, v3, LJ5/p;->e:I

    .line 509
    .line 510
    if-lez v13, :cond_18

    .line 511
    .line 512
    int-to-long v13, v13

    .line 513
    move v15, v4

    .line 514
    move-wide/from16 v23, v5

    .line 515
    .line 516
    int-to-long v4, v7

    .line 517
    add-long/2addr v13, v4

    .line 518
    const-wide/16 v4, 0x2

    .line 519
    .line 520
    div-long/2addr v13, v4

    .line 521
    const-wide/16 v4, 0x1

    .line 522
    .line 523
    add-long/2addr v13, v4

    .line 524
    :goto_d
    move-wide/from16 v27, v13

    .line 525
    .line 526
    goto :goto_f

    .line 527
    :cond_18
    move v15, v4

    .line 528
    move-wide/from16 v23, v5

    .line 529
    .line 530
    iget v4, v3, LJ5/p;->c:I

    .line 531
    .line 532
    iget v5, v3, LJ5/p;->b:I

    .line 533
    .line 534
    if-ne v5, v4, :cond_19

    .line 535
    .line 536
    if-lez v5, :cond_19

    .line 537
    .line 538
    int-to-long v4, v5

    .line 539
    goto :goto_e

    .line 540
    :cond_19
    const-wide/16 v4, 0x1000

    .line 541
    .line 542
    :goto_e
    iget v6, v3, LJ5/p;->h:I

    .line 543
    .line 544
    int-to-long v13, v6

    .line 545
    mul-long/2addr v4, v13

    .line 546
    iget v6, v3, LJ5/p;->i:I

    .line 547
    .line 548
    int-to-long v13, v6

    .line 549
    mul-long/2addr v4, v13

    .line 550
    const-wide/16 v13, 0x8

    .line 551
    .line 552
    div-long/2addr v4, v13

    .line 553
    const-wide/16 v13, 0x40

    .line 554
    .line 555
    add-long/2addr v13, v4

    .line 556
    goto :goto_d

    .line 557
    :goto_f
    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    .line 558
    .line 559
    .line 560
    move-result v29

    .line 561
    iget-wide v3, v3, LJ5/p;->k:J

    .line 562
    .line 563
    move-wide/from16 v21, v3

    .line 564
    .line 565
    move-object/from16 v17, v8

    .line 566
    .line 567
    move-wide/from16 v25, v9

    .line 568
    .line 569
    move-object/from16 v18, v11

    .line 570
    .line 571
    invoke-direct/range {v16 .. v29}, LJ5/f;-><init>(LJ5/c;LJ5/e;JJJJJI)V

    .line 572
    .line 573
    .line 574
    move-object/from16 v1, v16

    .line 575
    .line 576
    iput-object v1, v0, LM5/b;->l:LM5/a;

    .line 577
    .line 578
    iget-object v1, v1, LJ5/f;->c:Ljava/lang/Object;

    .line 579
    .line 580
    check-cast v1, LJ5/a;

    .line 581
    .line 582
    goto :goto_10

    .line 583
    :cond_1a
    move v15, v4

    .line 584
    new-instance v1, LJ5/o;

    .line 585
    .line 586
    invoke-virtual {v3}, LJ5/p;->c()J

    .line 587
    .line 588
    .line 589
    move-result-wide v3

    .line 590
    invoke-direct {v1, v3, v4}, LJ5/o;-><init>(J)V

    .line 591
    .line 592
    .line 593
    :goto_10
    invoke-virtual {v2, v1}, Lf6/N;->x(LJ5/t;)V

    .line 594
    .line 595
    .line 596
    iput v12, v0, LM5/b;->g:I

    .line 597
    .line 598
    return v15

    .line 599
    :cond_1b
    move v15, v4

    .line 600
    iput v15, v10, LJ5/h;->f:I

    .line 601
    .line 602
    const-string v1, "First frame does not start with sync code."

    .line 603
    .line 604
    invoke-static {v1, v6}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    throw v1

    .line 609
    :cond_1c
    move v15, v4

    .line 610
    iget-object v2, v0, LM5/b;->i:LJ5/p;

    .line 611
    .line 612
    move v3, v15

    .line 613
    :goto_11
    if-nez v3, :cond_25

    .line 614
    .line 615
    move-object/from16 v3, p1

    .line 616
    .line 617
    check-cast v3, LJ5/h;

    .line 618
    .line 619
    iput v15, v3, LJ5/h;->f:I

    .line 620
    .line 621
    new-instance v3, LJ5/y;

    .line 622
    .line 623
    new-array v4, v11, [B

    .line 624
    .line 625
    invoke-direct {v3, v4, v11, v1, v15}, LJ5/y;-><init>([BIIB)V

    .line 626
    .line 627
    .line 628
    move-object/from16 v5, p1

    .line 629
    .line 630
    check-cast v5, LJ5/h;

    .line 631
    .line 632
    invoke-virtual {v5, v4, v15, v11, v15}, LJ5/h;->c([BIIZ)Z

    .line 633
    .line 634
    .line 635
    invoke-virtual {v3}, LJ5/y;->h()Z

    .line 636
    .line 637
    .line 638
    move-result v4

    .line 639
    invoke-virtual {v3, v13}, LJ5/y;->i(I)I

    .line 640
    .line 641
    .line 642
    move-result v6

    .line 643
    invoke-virtual {v3, v8}, LJ5/y;->i(I)I

    .line 644
    .line 645
    .line 646
    move-result v3

    .line 647
    add-int/2addr v3, v11

    .line 648
    if-nez v6, :cond_1d

    .line 649
    .line 650
    const/16 v2, 0x26

    .line 651
    .line 652
    new-array v3, v2, [B

    .line 653
    .line 654
    invoke-virtual {v5, v3, v15, v2, v15}, LJ5/h;->f([BIIZ)Z

    .line 655
    .line 656
    .line 657
    new-instance v2, LJ5/p;

    .line 658
    .line 659
    invoke-direct {v2, v3, v11, v15}, LJ5/p;-><init>([BII)V

    .line 660
    .line 661
    .line 662
    move/from16 v28, v8

    .line 663
    .line 664
    goto/16 :goto_17

    .line 665
    .line 666
    :cond_1d
    if-eqz v2, :cond_24

    .line 667
    .line 668
    if-ne v6, v12, :cond_1e

    .line 669
    .line 670
    new-instance v6, LY4/b;

    .line 671
    .line 672
    invoke-direct {v6, v3}, LY4/b;-><init>(I)V

    .line 673
    .line 674
    .line 675
    iget-object v9, v6, LY4/b;->a:[B

    .line 676
    .line 677
    invoke-virtual {v5, v9, v15, v3, v15}, LJ5/h;->f([BIIZ)Z

    .line 678
    .line 679
    .line 680
    invoke-static {v6}, La/a;->H(LY4/b;)LS3/e;

    .line 681
    .line 682
    .line 683
    move-result-object v26

    .line 684
    new-instance v16, LJ5/p;

    .line 685
    .line 686
    iget-wide v5, v2, LJ5/p;->k:J

    .line 687
    .line 688
    iget-object v3, v2, LJ5/p;->m:Landroid/os/Parcelable;

    .line 689
    .line 690
    move-object/from16 v27, v3

    .line 691
    .line 692
    check-cast v27, LW5/c;

    .line 693
    .line 694
    iget v3, v2, LJ5/p;->b:I

    .line 695
    .line 696
    iget v9, v2, LJ5/p;->c:I

    .line 697
    .line 698
    iget v10, v2, LJ5/p;->d:I

    .line 699
    .line 700
    iget v14, v2, LJ5/p;->e:I

    .line 701
    .line 702
    move/from16 v28, v8

    .line 703
    .line 704
    iget v8, v2, LJ5/p;->f:I

    .line 705
    .line 706
    iget v13, v2, LJ5/p;->h:I

    .line 707
    .line 708
    iget v2, v2, LJ5/p;->i:I

    .line 709
    .line 710
    move/from16 v23, v2

    .line 711
    .line 712
    move/from16 v17, v3

    .line 713
    .line 714
    move-wide/from16 v24, v5

    .line 715
    .line 716
    move/from16 v21, v8

    .line 717
    .line 718
    move/from16 v18, v9

    .line 719
    .line 720
    move/from16 v19, v10

    .line 721
    .line 722
    move/from16 v22, v13

    .line 723
    .line 724
    move/from16 v20, v14

    .line 725
    .line 726
    invoke-direct/range {v16 .. v27}, LJ5/p;-><init>(IIIIIIIJLS3/e;LW5/c;)V

    .line 727
    .line 728
    .line 729
    :goto_12
    move-object/from16 v2, v16

    .line 730
    .line 731
    goto/16 :goto_17

    .line 732
    .line 733
    :cond_1e
    move/from16 v28, v8

    .line 734
    .line 735
    iget-object v8, v2, LJ5/p;->m:Landroid/os/Parcelable;

    .line 736
    .line 737
    check-cast v8, LW5/c;

    .line 738
    .line 739
    if-ne v6, v11, :cond_21

    .line 740
    .line 741
    new-instance v6, LY4/b;

    .line 742
    .line 743
    invoke-direct {v6, v3}, LY4/b;-><init>(I)V

    .line 744
    .line 745
    .line 746
    iget-object v9, v6, LY4/b;->a:[B

    .line 747
    .line 748
    const/4 v15, 0x0

    .line 749
    invoke-virtual {v5, v9, v15, v3, v15}, LJ5/h;->f([BIIZ)Z

    .line 750
    .line 751
    .line 752
    invoke-virtual {v6, v11}, LY4/b;->B(I)V

    .line 753
    .line 754
    .line 755
    invoke-static {v6, v15, v15}, Landroid/support/v4/media/session/b;->p0(LY4/b;ZZ)LS3/l;

    .line 756
    .line 757
    .line 758
    move-result-object v3

    .line 759
    iget-object v3, v3, LS3/l;->a:Ljava/lang/Object;

    .line 760
    .line 761
    check-cast v3, [Ljava/lang/String;

    .line 762
    .line 763
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 764
    .line 765
    .line 766
    move-result-object v3

    .line 767
    invoke-static {v3}, Landroid/support/v4/media/session/b;->m0(Ljava/util/List;)LW5/c;

    .line 768
    .line 769
    .line 770
    move-result-object v3

    .line 771
    if-nez v8, :cond_1f

    .line 772
    .line 773
    move-object/from16 v27, v3

    .line 774
    .line 775
    goto :goto_14

    .line 776
    :cond_1f
    if-nez v3, :cond_20

    .line 777
    .line 778
    :goto_13
    move-object/from16 v27, v8

    .line 779
    .line 780
    goto :goto_14

    .line 781
    :cond_20
    iget-object v3, v3, LW5/c;->a:[LW5/b;

    .line 782
    .line 783
    invoke-virtual {v8, v3}, LW5/c;->c([LW5/b;)LW5/c;

    .line 784
    .line 785
    .line 786
    move-result-object v8

    .line 787
    goto :goto_13

    .line 788
    :goto_14
    new-instance v16, LJ5/p;

    .line 789
    .line 790
    iget-wide v5, v2, LJ5/p;->k:J

    .line 791
    .line 792
    iget-object v3, v2, LJ5/p;->l:Ljava/lang/Object;

    .line 793
    .line 794
    move-object/from16 v26, v3

    .line 795
    .line 796
    check-cast v26, LS3/e;

    .line 797
    .line 798
    iget v3, v2, LJ5/p;->b:I

    .line 799
    .line 800
    iget v8, v2, LJ5/p;->c:I

    .line 801
    .line 802
    iget v9, v2, LJ5/p;->d:I

    .line 803
    .line 804
    iget v10, v2, LJ5/p;->e:I

    .line 805
    .line 806
    iget v13, v2, LJ5/p;->f:I

    .line 807
    .line 808
    iget v14, v2, LJ5/p;->h:I

    .line 809
    .line 810
    iget v2, v2, LJ5/p;->i:I

    .line 811
    .line 812
    move/from16 v23, v2

    .line 813
    .line 814
    move/from16 v17, v3

    .line 815
    .line 816
    move-wide/from16 v24, v5

    .line 817
    .line 818
    move/from16 v18, v8

    .line 819
    .line 820
    move/from16 v19, v9

    .line 821
    .line 822
    move/from16 v20, v10

    .line 823
    .line 824
    move/from16 v21, v13

    .line 825
    .line 826
    move/from16 v22, v14

    .line 827
    .line 828
    invoke-direct/range {v16 .. v27}, LJ5/p;-><init>(IIIIIIIJLS3/e;LW5/c;)V

    .line 829
    .line 830
    .line 831
    goto :goto_12

    .line 832
    :cond_21
    if-ne v6, v1, :cond_23

    .line 833
    .line 834
    new-instance v6, LY4/b;

    .line 835
    .line 836
    invoke-direct {v6, v3}, LY4/b;-><init>(I)V

    .line 837
    .line 838
    .line 839
    iget-object v9, v6, LY4/b;->a:[B

    .line 840
    .line 841
    const/4 v15, 0x0

    .line 842
    invoke-virtual {v5, v9, v15, v3, v15}, LJ5/h;->f([BIIZ)Z

    .line 843
    .line 844
    .line 845
    invoke-virtual {v6, v11}, LY4/b;->B(I)V

    .line 846
    .line 847
    .line 848
    invoke-static {v6}, LZ5/a;->c(LY4/b;)LZ5/a;

    .line 849
    .line 850
    .line 851
    move-result-object v3

    .line 852
    invoke-static {v3}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 853
    .line 854
    .line 855
    move-result-object v3

    .line 856
    new-instance v5, LW5/c;

    .line 857
    .line 858
    invoke-direct {v5, v3}, LW5/c;-><init>(Ljava/util/List;)V

    .line 859
    .line 860
    .line 861
    if-nez v8, :cond_22

    .line 862
    .line 863
    :goto_15
    move-object/from16 v27, v5

    .line 864
    .line 865
    goto :goto_16

    .line 866
    :cond_22
    iget-object v3, v5, LW5/c;->a:[LW5/b;

    .line 867
    .line 868
    invoke-virtual {v8, v3}, LW5/c;->c([LW5/b;)LW5/c;

    .line 869
    .line 870
    .line 871
    move-result-object v5

    .line 872
    goto :goto_15

    .line 873
    :goto_16
    new-instance v16, LJ5/p;

    .line 874
    .line 875
    iget-wide v5, v2, LJ5/p;->k:J

    .line 876
    .line 877
    iget-object v3, v2, LJ5/p;->l:Ljava/lang/Object;

    .line 878
    .line 879
    move-object/from16 v26, v3

    .line 880
    .line 881
    check-cast v26, LS3/e;

    .line 882
    .line 883
    iget v3, v2, LJ5/p;->b:I

    .line 884
    .line 885
    iget v8, v2, LJ5/p;->c:I

    .line 886
    .line 887
    iget v9, v2, LJ5/p;->d:I

    .line 888
    .line 889
    iget v10, v2, LJ5/p;->e:I

    .line 890
    .line 891
    iget v13, v2, LJ5/p;->f:I

    .line 892
    .line 893
    iget v14, v2, LJ5/p;->h:I

    .line 894
    .line 895
    iget v2, v2, LJ5/p;->i:I

    .line 896
    .line 897
    move/from16 v23, v2

    .line 898
    .line 899
    move/from16 v17, v3

    .line 900
    .line 901
    move-wide/from16 v24, v5

    .line 902
    .line 903
    move/from16 v18, v8

    .line 904
    .line 905
    move/from16 v19, v9

    .line 906
    .line 907
    move/from16 v20, v10

    .line 908
    .line 909
    move/from16 v21, v13

    .line 910
    .line 911
    move/from16 v22, v14

    .line 912
    .line 913
    invoke-direct/range {v16 .. v27}, LJ5/p;-><init>(IIIIIIIJLS3/e;LW5/c;)V

    .line 914
    .line 915
    .line 916
    goto/16 :goto_12

    .line 917
    .line 918
    :cond_23
    invoke-virtual {v5, v3}, LJ5/h;->j(I)V

    .line 919
    .line 920
    .line 921
    :goto_17
    sget v3, Lu6/v;->a:I

    .line 922
    .line 923
    iput-object v2, v0, LM5/b;->i:LJ5/p;

    .line 924
    .line 925
    move v3, v4

    .line 926
    move/from16 v8, v28

    .line 927
    .line 928
    const/4 v13, 0x7

    .line 929
    const/4 v15, 0x0

    .line 930
    goto/16 :goto_11

    .line 931
    .line 932
    :cond_24
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 933
    .line 934
    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 935
    .line 936
    .line 937
    throw v1

    .line 938
    :cond_25
    iget-object v2, v0, LM5/b;->i:LJ5/p;

    .line 939
    .line 940
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 941
    .line 942
    .line 943
    iget-object v2, v0, LM5/b;->i:LJ5/p;

    .line 944
    .line 945
    iget v2, v2, LJ5/p;->d:I

    .line 946
    .line 947
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 948
    .line 949
    .line 950
    move-result v1

    .line 951
    iput v1, v0, LM5/b;->j:I

    .line 952
    .line 953
    iget-object v1, v0, LM5/b;->f:LJ5/w;

    .line 954
    .line 955
    sget v2, Lu6/v;->a:I

    .line 956
    .line 957
    iget-object v2, v0, LM5/b;->i:LJ5/p;

    .line 958
    .line 959
    iget-object v3, v0, LM5/b;->h:LW5/c;

    .line 960
    .line 961
    invoke-virtual {v2, v7, v3}, LJ5/p;->d([BLW5/c;)LE5/T;

    .line 962
    .line 963
    .line 964
    move-result-object v2

    .line 965
    invoke-interface {v1, v2}, LJ5/w;->a(LE5/T;)V

    .line 966
    .line 967
    .line 968
    iput v11, v0, LM5/b;->g:I

    .line 969
    .line 970
    const/4 v15, 0x0

    .line 971
    return v15

    .line 972
    :cond_26
    move v15, v4

    .line 973
    move/from16 v28, v8

    .line 974
    .line 975
    new-array v1, v11, [B

    .line 976
    .line 977
    move-object/from16 v4, p1

    .line 978
    .line 979
    check-cast v4, LJ5/h;

    .line 980
    .line 981
    invoke-virtual {v4, v1, v15, v11, v15}, LJ5/h;->f([BIIZ)Z

    .line 982
    .line 983
    .line 984
    aget-byte v4, v1, v15

    .line 985
    .line 986
    int-to-long v4, v4

    .line 987
    const-wide/16 v7, 0xff

    .line 988
    .line 989
    and-long/2addr v4, v7

    .line 990
    shl-long v4, v4, v28

    .line 991
    .line 992
    aget-byte v3, v1, v3

    .line 993
    .line 994
    int-to-long v13, v3

    .line 995
    and-long/2addr v13, v7

    .line 996
    shl-long v10, v13, v10

    .line 997
    .line 998
    or-long/2addr v4, v10

    .line 999
    aget-byte v2, v1, v2

    .line 1000
    .line 1001
    int-to-long v2, v2

    .line 1002
    and-long/2addr v2, v7

    .line 1003
    shl-long/2addr v2, v9

    .line 1004
    or-long/2addr v2, v4

    .line 1005
    aget-byte v1, v1, v12

    .line 1006
    .line 1007
    int-to-long v4, v1

    .line 1008
    and-long/2addr v4, v7

    .line 1009
    or-long/2addr v2, v4

    .line 1010
    const-wide/32 v4, 0x664c6143

    .line 1011
    .line 1012
    .line 1013
    cmp-long v1, v2, v4

    .line 1014
    .line 1015
    if-nez v1, :cond_27

    .line 1016
    .line 1017
    iput v12, v0, LM5/b;->g:I

    .line 1018
    .line 1019
    const/4 v15, 0x0

    .line 1020
    return v15

    .line 1021
    :cond_27
    const-string v1, "Failed to read FLAC stream marker."

    .line 1022
    .line 1023
    invoke-static {v1, v6}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v1

    .line 1027
    throw v1

    .line 1028
    :cond_28
    move v15, v4

    .line 1029
    array-length v1, v7

    .line 1030
    move-object/from16 v3, p1

    .line 1031
    .line 1032
    check-cast v3, LJ5/h;

    .line 1033
    .line 1034
    invoke-virtual {v3, v7, v15, v1, v15}, LJ5/h;->c([BIIZ)Z

    .line 1035
    .line 1036
    .line 1037
    move-object/from16 v1, p1

    .line 1038
    .line 1039
    check-cast v1, LJ5/h;

    .line 1040
    .line 1041
    iput v15, v1, LJ5/h;->f:I

    .line 1042
    .line 1043
    iput v2, v0, LM5/b;->g:I

    .line 1044
    .line 1045
    return v15

    .line 1046
    :cond_29
    move v15, v4

    .line 1047
    move-object/from16 v1, p1

    .line 1048
    .line 1049
    check-cast v1, LJ5/h;

    .line 1050
    .line 1051
    iput v15, v1, LJ5/h;->f:I

    .line 1052
    .line 1053
    move-object/from16 v1, p1

    .line 1054
    .line 1055
    check-cast v1, LJ5/h;

    .line 1056
    .line 1057
    invoke-virtual {v1}, LJ5/h;->g()J

    .line 1058
    .line 1059
    .line 1060
    move-result-wide v4

    .line 1061
    iget-boolean v2, v0, LM5/b;->c:Z

    .line 1062
    .line 1063
    if-nez v2, :cond_2a

    .line 1064
    .line 1065
    move-object v2, v6

    .line 1066
    goto :goto_18

    .line 1067
    :cond_2a
    sget-object v2, Lb6/h;->c:LV1/c;

    .line 1068
    .line 1069
    :goto_18
    new-instance v7, Ly3/j;

    .line 1070
    .line 1071
    const/16 v8, 0xd

    .line 1072
    .line 1073
    invoke-direct {v7, v8}, Ly3/j;-><init>(I)V

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual {v7, v1, v2}, Ly3/j;->o(LJ5/h;Lb6/g;)LW5/c;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v2

    .line 1080
    if-eqz v2, :cond_2c

    .line 1081
    .line 1082
    iget-object v7, v2, LW5/c;->a:[LW5/b;

    .line 1083
    .line 1084
    array-length v7, v7

    .line 1085
    if-nez v7, :cond_2b

    .line 1086
    .line 1087
    goto :goto_19

    .line 1088
    :cond_2b
    move-object v6, v2

    .line 1089
    :cond_2c
    :goto_19
    invoke-virtual {v1}, LJ5/h;->g()J

    .line 1090
    .line 1091
    .line 1092
    move-result-wide v7

    .line 1093
    sub-long/2addr v7, v4

    .line 1094
    long-to-int v2, v7

    .line 1095
    invoke-virtual {v1, v2}, LJ5/h;->j(I)V

    .line 1096
    .line 1097
    .line 1098
    iput-object v6, v0, LM5/b;->h:LW5/c;

    .line 1099
    .line 1100
    iput v3, v0, LM5/b;->g:I

    .line 1101
    .line 1102
    const/4 v15, 0x0

    .line 1103
    return v15
.end method

.method public final h(Lf6/N;)V
    .locals 2

    .line 1
    iput-object p1, p0, LM5/b;->e:Lf6/N;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-virtual {p1, v0, v1}, Lf6/N;->m(II)LJ5/w;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LM5/b;->f:LJ5/w;

    .line 10
    .line 11
    invoke-virtual {p1}, Lf6/N;->l()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final i(LJ5/l;)Z
    .locals 9

    .line 1
    check-cast p1, LJ5/h;

    .line 2
    .line 3
    sget-object v0, Lb6/h;->c:LV1/c;

    .line 4
    .line 5
    new-instance v1, Ly3/j;

    .line 6
    .line 7
    const/16 v2, 0xd

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ly3/j;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1, v0}, Ly3/j;->o(LJ5/h;Lb6/g;)LW5/c;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, v0, LW5/c;->a:[LW5/b;

    .line 19
    .line 20
    array-length v0, v0

    .line 21
    :cond_0
    const/4 v0, 0x4

    .line 22
    new-array v1, v0, [B

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-virtual {p1, v1, v2, v0, v2}, LJ5/h;->c([BIIZ)Z

    .line 26
    .line 27
    .line 28
    aget-byte p1, v1, v2

    .line 29
    .line 30
    int-to-long v3, p1

    .line 31
    const-wide/16 v5, 0xff

    .line 32
    .line 33
    and-long/2addr v3, v5

    .line 34
    const/16 p1, 0x18

    .line 35
    .line 36
    shl-long/2addr v3, p1

    .line 37
    const/4 p1, 0x1

    .line 38
    aget-byte v0, v1, p1

    .line 39
    .line 40
    int-to-long v7, v0

    .line 41
    and-long/2addr v7, v5

    .line 42
    const/16 v0, 0x10

    .line 43
    .line 44
    shl-long/2addr v7, v0

    .line 45
    or-long/2addr v3, v7

    .line 46
    const/4 v0, 0x2

    .line 47
    aget-byte v0, v1, v0

    .line 48
    .line 49
    int-to-long v7, v0

    .line 50
    and-long/2addr v7, v5

    .line 51
    const/16 v0, 0x8

    .line 52
    .line 53
    shl-long/2addr v7, v0

    .line 54
    or-long/2addr v3, v7

    .line 55
    const/4 v0, 0x3

    .line 56
    aget-byte v0, v1, v0

    .line 57
    .line 58
    int-to-long v0, v0

    .line 59
    and-long/2addr v0, v5

    .line 60
    or-long/2addr v0, v3

    .line 61
    const-wide/32 v3, 0x664c6143

    .line 62
    .line 63
    .line 64
    cmp-long v0, v0, v3

    .line 65
    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    return p1

    .line 69
    :cond_1
    return v2
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
