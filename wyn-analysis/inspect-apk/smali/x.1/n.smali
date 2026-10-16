.class public final Lx/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[J

.field public b:[Ljava/lang/Object;

.field public c:[I

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    const/4 v0, 0x6

    .line 8
    invoke-direct {p0, v0}, Lx/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lx/t;->a:[J

    iput-object v0, p0, Lx/n;->a:[J

    .line 3
    sget-object v0, Ly/a;->b:[Ljava/lang/Object;

    iput-object v0, p0, Lx/n;->b:[Ljava/lang/Object;

    .line 4
    sget-object v0, Lx/g;->a:[I

    .line 5
    iput-object v0, p0, Lx/n;->c:[I

    if-ltz p1, :cond_0

    .line 6
    invoke-static {p1}, Lx/t;->d(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lx/n;->d(I)V

    return-void

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Capacity must be a positive value."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(I)I
    .locals 9

    .line 1
    iget v0, p0, Lx/n;->d:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    iget-object v2, p0, Lx/n;->a:[J

    .line 6
    .line 7
    shr-int/lit8 v3, p1, 0x3

    .line 8
    .line 9
    and-int/lit8 v4, p1, 0x7

    .line 10
    .line 11
    shl-int/lit8 v4, v4, 0x3

    .line 12
    .line 13
    aget-wide v5, v2, v3

    .line 14
    .line 15
    ushr-long/2addr v5, v4

    .line 16
    add-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    aget-wide v7, v2, v3

    .line 19
    .line 20
    rsub-int/lit8 v2, v4, 0x40

    .line 21
    .line 22
    shl-long v2, v7, v2

    .line 23
    .line 24
    int-to-long v7, v4

    .line 25
    neg-long v7, v7

    .line 26
    const/16 v4, 0x3f

    .line 27
    .line 28
    shr-long/2addr v7, v4

    .line 29
    and-long/2addr v2, v7

    .line 30
    or-long/2addr v2, v5

    .line 31
    not-long v4, v2

    .line 32
    const/4 v6, 0x7

    .line 33
    shl-long/2addr v4, v6

    .line 34
    and-long/2addr v2, v4

    .line 35
    const-wide v4, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v2, v4

    .line 41
    const-wide/16 v4, 0x0

    .line 42
    .line 43
    cmp-long v4, v2, v4

    .line 44
    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    shr-int/lit8 v1, v1, 0x3

    .line 52
    .line 53
    add-int/2addr p1, v1

    .line 54
    and-int/2addr p1, v0

    .line 55
    return p1

    .line 56
    :cond_0
    add-int/lit8 v1, v1, 0x8

    .line 57
    .line 58
    add-int/2addr p1, v1

    .line 59
    and-int/2addr p1, v0

    .line 60
    goto :goto_0
.end method

.method public final b(Ljava/lang/Object;)I
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v3, 0x0

    .line 13
    :goto_0
    const v4, -0x3361d2af    # -8.293031E7f

    .line 14
    .line 15
    .line 16
    mul-int/2addr v3, v4

    .line 17
    shl-int/lit8 v5, v3, 0x10

    .line 18
    .line 19
    xor-int/2addr v3, v5

    .line 20
    ushr-int/lit8 v5, v3, 0x7

    .line 21
    .line 22
    and-int/lit8 v3, v3, 0x7f

    .line 23
    .line 24
    iget v6, v0, Lx/n;->d:I

    .line 25
    .line 26
    and-int v7, v5, v6

    .line 27
    .line 28
    const/4 v8, 0x0

    .line 29
    :goto_1
    iget-object v9, v0, Lx/n;->a:[J

    .line 30
    .line 31
    shr-int/lit8 v10, v7, 0x3

    .line 32
    .line 33
    and-int/lit8 v11, v7, 0x7

    .line 34
    .line 35
    shl-int/lit8 v11, v11, 0x3

    .line 36
    .line 37
    aget-wide v12, v9, v10

    .line 38
    .line 39
    ushr-long/2addr v12, v11

    .line 40
    const/4 v14, 0x1

    .line 41
    add-int/2addr v10, v14

    .line 42
    aget-wide v15, v9, v10

    .line 43
    .line 44
    rsub-int/lit8 v9, v11, 0x40

    .line 45
    .line 46
    shl-long v9, v15, v9

    .line 47
    .line 48
    move/from16 v16, v14

    .line 49
    .line 50
    int-to-long v14, v11

    .line 51
    neg-long v14, v14

    .line 52
    const/16 v11, 0x3f

    .line 53
    .line 54
    shr-long/2addr v14, v11

    .line 55
    and-long/2addr v9, v14

    .line 56
    or-long/2addr v9, v12

    .line 57
    int-to-long v11, v3

    .line 58
    const-wide v13, 0x101010101010101L

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    mul-long v17, v11, v13

    .line 64
    .line 65
    move/from16 v19, v3

    .line 66
    .line 67
    xor-long v2, v9, v17

    .line 68
    .line 69
    sub-long v13, v2, v13

    .line 70
    .line 71
    not-long v2, v2

    .line 72
    and-long/2addr v2, v13

    .line 73
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    and-long/2addr v2, v13

    .line 79
    :goto_2
    const-wide/16 v17, 0x0

    .line 80
    .line 81
    cmp-long v20, v2, v17

    .line 82
    .line 83
    if-eqz v20, :cond_2

    .line 84
    .line 85
    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 86
    .line 87
    .line 88
    move-result v17

    .line 89
    shr-int/lit8 v17, v17, 0x3

    .line 90
    .line 91
    add-int v17, v7, v17

    .line 92
    .line 93
    and-int v17, v17, v6

    .line 94
    .line 95
    move/from16 v20, v4

    .line 96
    .line 97
    iget-object v4, v0, Lx/n;->b:[Ljava/lang/Object;

    .line 98
    .line 99
    aget-object v4, v4, v17

    .line 100
    .line 101
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-eqz v4, :cond_1

    .line 106
    .line 107
    return v17

    .line 108
    :cond_1
    const-wide/16 v17, 0x1

    .line 109
    .line 110
    sub-long v17, v2, v17

    .line 111
    .line 112
    and-long v2, v2, v17

    .line 113
    .line 114
    move/from16 v4, v20

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_2
    move/from16 v20, v4

    .line 118
    .line 119
    not-long v2, v9

    .line 120
    const/4 v4, 0x6

    .line 121
    shl-long/2addr v2, v4

    .line 122
    and-long/2addr v2, v9

    .line 123
    and-long/2addr v2, v13

    .line 124
    cmp-long v2, v2, v17

    .line 125
    .line 126
    const/16 v3, 0x8

    .line 127
    .line 128
    if-eqz v2, :cond_c

    .line 129
    .line 130
    invoke-virtual {v0, v5}, Lx/n;->a(I)I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    iget v2, v0, Lx/n;->f:I

    .line 135
    .line 136
    const-wide/16 v8, 0xff

    .line 137
    .line 138
    if-nez v2, :cond_3

    .line 139
    .line 140
    iget-object v2, v0, Lx/n;->a:[J

    .line 141
    .line 142
    shr-int/lit8 v4, v1, 0x3

    .line 143
    .line 144
    aget-wide v13, v2, v4

    .line 145
    .line 146
    and-int/lit8 v2, v1, 0x7

    .line 147
    .line 148
    shl-int/lit8 v2, v2, 0x3

    .line 149
    .line 150
    shr-long/2addr v13, v2

    .line 151
    and-long/2addr v13, v8

    .line 152
    const-wide/16 v17, 0xfe

    .line 153
    .line 154
    cmp-long v2, v13, v17

    .line 155
    .line 156
    if-nez v2, :cond_4

    .line 157
    .line 158
    :cond_3
    move-wide/from16 v24, v8

    .line 159
    .line 160
    const-wide/16 v22, 0x80

    .line 161
    .line 162
    goto/16 :goto_9

    .line 163
    .line 164
    :cond_4
    iget v1, v0, Lx/n;->d:I

    .line 165
    .line 166
    if-le v1, v3, :cond_7

    .line 167
    .line 168
    iget v2, v0, Lx/n;->e:I

    .line 169
    .line 170
    int-to-long v2, v2

    .line 171
    const-wide/16 v13, 0x20

    .line 172
    .line 173
    mul-long/2addr v2, v13

    .line 174
    int-to-long v13, v1

    .line 175
    const-wide/16 v21, 0x19

    .line 176
    .line 177
    mul-long v13, v13, v21

    .line 178
    .line 179
    const-wide/high16 v21, -0x8000000000000000L

    .line 180
    .line 181
    xor-long v2, v2, v21

    .line 182
    .line 183
    xor-long v13, v13, v21

    .line 184
    .line 185
    invoke-static {v2, v3, v13, v14}, Ljava/lang/Long;->compare(JJ)I

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-gtz v1, :cond_7

    .line 190
    .line 191
    iget-object v1, v0, Lx/n;->a:[J

    .line 192
    .line 193
    iget v2, v0, Lx/n;->d:I

    .line 194
    .line 195
    const/4 v3, 0x0

    .line 196
    const/4 v4, 0x0

    .line 197
    :goto_3
    if-ge v3, v2, :cond_6

    .line 198
    .line 199
    shr-int/lit8 v10, v3, 0x3

    .line 200
    .line 201
    aget-wide v13, v1, v10

    .line 202
    .line 203
    and-int/lit8 v19, v3, 0x7

    .line 204
    .line 205
    shl-int/lit8 v19, v19, 0x3

    .line 206
    .line 207
    shr-long v13, v13, v19

    .line 208
    .line 209
    and-long/2addr v13, v8

    .line 210
    cmp-long v13, v13, v17

    .line 211
    .line 212
    if-nez v13, :cond_5

    .line 213
    .line 214
    iget-object v13, v0, Lx/n;->a:[J

    .line 215
    .line 216
    aget-wide v20, v13, v10

    .line 217
    .line 218
    const-wide/16 v22, 0x80

    .line 219
    .line 220
    shl-long v6, v8, v19

    .line 221
    .line 222
    not-long v6, v6

    .line 223
    and-long v6, v20, v6

    .line 224
    .line 225
    shl-long v19, v22, v19

    .line 226
    .line 227
    or-long v6, v6, v19

    .line 228
    .line 229
    aput-wide v6, v13, v10

    .line 230
    .line 231
    iget v6, v0, Lx/n;->d:I

    .line 232
    .line 233
    add-int/lit8 v7, v3, -0x7

    .line 234
    .line 235
    and-int/2addr v7, v6

    .line 236
    and-int/lit8 v6, v6, 0x7

    .line 237
    .line 238
    add-int/2addr v7, v6

    .line 239
    shr-int/lit8 v6, v7, 0x3

    .line 240
    .line 241
    and-int/lit8 v7, v7, 0x7

    .line 242
    .line 243
    shl-int/lit8 v7, v7, 0x3

    .line 244
    .line 245
    aget-wide v19, v13, v6

    .line 246
    .line 247
    move-wide/from16 v24, v8

    .line 248
    .line 249
    shl-long v8, v24, v7

    .line 250
    .line 251
    not-long v8, v8

    .line 252
    and-long v8, v19, v8

    .line 253
    .line 254
    shl-long v19, v22, v7

    .line 255
    .line 256
    or-long v8, v8, v19

    .line 257
    .line 258
    aput-wide v8, v13, v6

    .line 259
    .line 260
    add-int/lit8 v4, v4, 0x1

    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_5
    move-wide/from16 v24, v8

    .line 264
    .line 265
    const-wide/16 v22, 0x80

    .line 266
    .line 267
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 268
    .line 269
    move-wide/from16 v8, v24

    .line 270
    .line 271
    goto :goto_3

    .line 272
    :cond_6
    move-wide/from16 v24, v8

    .line 273
    .line 274
    const-wide/16 v22, 0x80

    .line 275
    .line 276
    iget v1, v0, Lx/n;->f:I

    .line 277
    .line 278
    add-int/2addr v1, v4

    .line 279
    iput v1, v0, Lx/n;->f:I

    .line 280
    .line 281
    goto/16 :goto_8

    .line 282
    .line 283
    :cond_7
    move-wide/from16 v24, v8

    .line 284
    .line 285
    const-wide/16 v22, 0x80

    .line 286
    .line 287
    iget v1, v0, Lx/n;->d:I

    .line 288
    .line 289
    invoke-static {v1}, Lx/t;->b(I)I

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    iget-object v2, v0, Lx/n;->a:[J

    .line 294
    .line 295
    iget-object v3, v0, Lx/n;->b:[Ljava/lang/Object;

    .line 296
    .line 297
    iget-object v4, v0, Lx/n;->c:[I

    .line 298
    .line 299
    iget v6, v0, Lx/n;->d:I

    .line 300
    .line 301
    invoke-virtual {v0, v1}, Lx/n;->d(I)V

    .line 302
    .line 303
    .line 304
    iget-object v1, v0, Lx/n;->b:[Ljava/lang/Object;

    .line 305
    .line 306
    iget-object v7, v0, Lx/n;->c:[I

    .line 307
    .line 308
    const/4 v8, 0x0

    .line 309
    :goto_5
    if-ge v8, v6, :cond_a

    .line 310
    .line 311
    shr-int/lit8 v9, v8, 0x3

    .line 312
    .line 313
    aget-wide v9, v2, v9

    .line 314
    .line 315
    and-int/lit8 v13, v8, 0x7

    .line 316
    .line 317
    shl-int/lit8 v13, v13, 0x3

    .line 318
    .line 319
    shr-long/2addr v9, v13

    .line 320
    and-long v9, v9, v24

    .line 321
    .line 322
    cmp-long v9, v9, v22

    .line 323
    .line 324
    if-gez v9, :cond_9

    .line 325
    .line 326
    aget-object v9, v3, v8

    .line 327
    .line 328
    if-eqz v9, :cond_8

    .line 329
    .line 330
    invoke-virtual {v9}, Ljava/lang/Object;->hashCode()I

    .line 331
    .line 332
    .line 333
    move-result v10

    .line 334
    goto :goto_6

    .line 335
    :cond_8
    const/4 v10, 0x0

    .line 336
    :goto_6
    mul-int v10, v10, v20

    .line 337
    .line 338
    shl-int/lit8 v13, v10, 0x10

    .line 339
    .line 340
    xor-int/2addr v10, v13

    .line 341
    ushr-int/lit8 v13, v10, 0x7

    .line 342
    .line 343
    invoke-virtual {v0, v13}, Lx/n;->a(I)I

    .line 344
    .line 345
    .line 346
    move-result v13

    .line 347
    and-int/lit8 v10, v10, 0x7f

    .line 348
    .line 349
    move-object/from16 v17, v1

    .line 350
    .line 351
    move-object v14, v2

    .line 352
    int-to-long v1, v10

    .line 353
    iget-object v10, v0, Lx/n;->a:[J

    .line 354
    .line 355
    shr-int/lit8 v18, v13, 0x3

    .line 356
    .line 357
    and-int/lit8 v19, v13, 0x7

    .line 358
    .line 359
    shl-int/lit8 v19, v19, 0x3

    .line 360
    .line 361
    aget-wide v26, v10, v18

    .line 362
    .line 363
    move-wide/from16 v28, v1

    .line 364
    .line 365
    shl-long v1, v24, v19

    .line 366
    .line 367
    not-long v1, v1

    .line 368
    and-long v1, v26, v1

    .line 369
    .line 370
    shl-long v26, v28, v19

    .line 371
    .line 372
    or-long v1, v1, v26

    .line 373
    .line 374
    aput-wide v1, v10, v18

    .line 375
    .line 376
    iget v1, v0, Lx/n;->d:I

    .line 377
    .line 378
    add-int/lit8 v2, v13, -0x7

    .line 379
    .line 380
    and-int/2addr v2, v1

    .line 381
    and-int/lit8 v1, v1, 0x7

    .line 382
    .line 383
    add-int/2addr v2, v1

    .line 384
    shr-int/lit8 v1, v2, 0x3

    .line 385
    .line 386
    and-int/lit8 v2, v2, 0x7

    .line 387
    .line 388
    shl-int/lit8 v2, v2, 0x3

    .line 389
    .line 390
    aget-wide v18, v10, v1

    .line 391
    .line 392
    move/from16 p1, v1

    .line 393
    .line 394
    move/from16 v21, v2

    .line 395
    .line 396
    shl-long v1, v24, v21

    .line 397
    .line 398
    not-long v1, v1

    .line 399
    and-long v1, v18, v1

    .line 400
    .line 401
    shl-long v18, v28, v21

    .line 402
    .line 403
    or-long v1, v1, v18

    .line 404
    .line 405
    aput-wide v1, v10, p1

    .line 406
    .line 407
    aput-object v9, v17, v13

    .line 408
    .line 409
    aget v1, v4, v8

    .line 410
    .line 411
    aput v1, v7, v13

    .line 412
    .line 413
    goto :goto_7

    .line 414
    :cond_9
    move-object/from16 v17, v1

    .line 415
    .line 416
    move-object v14, v2

    .line 417
    :goto_7
    add-int/lit8 v8, v8, 0x1

    .line 418
    .line 419
    move-object v2, v14

    .line 420
    move-object/from16 v1, v17

    .line 421
    .line 422
    goto :goto_5

    .line 423
    :cond_a
    :goto_8
    invoke-virtual {v0, v5}, Lx/n;->a(I)I

    .line 424
    .line 425
    .line 426
    move-result v1

    .line 427
    :goto_9
    iget v2, v0, Lx/n;->e:I

    .line 428
    .line 429
    add-int/lit8 v2, v2, 0x1

    .line 430
    .line 431
    iput v2, v0, Lx/n;->e:I

    .line 432
    .line 433
    iget v2, v0, Lx/n;->f:I

    .line 434
    .line 435
    iget-object v3, v0, Lx/n;->a:[J

    .line 436
    .line 437
    shr-int/lit8 v4, v1, 0x3

    .line 438
    .line 439
    aget-wide v5, v3, v4

    .line 440
    .line 441
    and-int/lit8 v7, v1, 0x7

    .line 442
    .line 443
    shl-int/lit8 v7, v7, 0x3

    .line 444
    .line 445
    shr-long v8, v5, v7

    .line 446
    .line 447
    and-long v8, v8, v24

    .line 448
    .line 449
    cmp-long v8, v8, v22

    .line 450
    .line 451
    if-nez v8, :cond_b

    .line 452
    .line 453
    move/from16 v15, v16

    .line 454
    .line 455
    goto :goto_a

    .line 456
    :cond_b
    const/4 v15, 0x0

    .line 457
    :goto_a
    sub-int/2addr v2, v15

    .line 458
    iput v2, v0, Lx/n;->f:I

    .line 459
    .line 460
    shl-long v8, v24, v7

    .line 461
    .line 462
    not-long v8, v8

    .line 463
    and-long/2addr v5, v8

    .line 464
    shl-long v7, v11, v7

    .line 465
    .line 466
    or-long/2addr v5, v7

    .line 467
    aput-wide v5, v3, v4

    .line 468
    .line 469
    iget v2, v0, Lx/n;->d:I

    .line 470
    .line 471
    add-int/lit8 v4, v1, -0x7

    .line 472
    .line 473
    and-int/2addr v4, v2

    .line 474
    and-int/lit8 v2, v2, 0x7

    .line 475
    .line 476
    add-int/2addr v4, v2

    .line 477
    shr-int/lit8 v2, v4, 0x3

    .line 478
    .line 479
    and-int/lit8 v4, v4, 0x7

    .line 480
    .line 481
    shl-int/lit8 v4, v4, 0x3

    .line 482
    .line 483
    aget-wide v5, v3, v2

    .line 484
    .line 485
    shl-long v7, v24, v4

    .line 486
    .line 487
    not-long v7, v7

    .line 488
    and-long/2addr v5, v7

    .line 489
    shl-long v7, v11, v4

    .line 490
    .line 491
    or-long/2addr v5, v7

    .line 492
    aput-wide v5, v3, v2

    .line 493
    .line 494
    not-int v1, v1

    .line 495
    return v1

    .line 496
    :cond_c
    add-int/2addr v8, v3

    .line 497
    add-int/2addr v7, v8

    .line 498
    and-int/2addr v7, v6

    .line 499
    move/from16 v3, v19

    .line 500
    .line 501
    move/from16 v4, v20

    .line 502
    .line 503
    goto/16 :goto_1
.end method

.method public final c(Ljava/lang/Object;)I
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    const v2, -0x3361d2af    # -8.293031E7f

    .line 11
    .line 12
    .line 13
    mul-int/2addr v1, v2

    .line 14
    shl-int/lit8 v2, v1, 0x10

    .line 15
    .line 16
    xor-int/2addr v1, v2

    .line 17
    and-int/lit8 v2, v1, 0x7f

    .line 18
    .line 19
    iget v3, p0, Lx/n;->d:I

    .line 20
    .line 21
    ushr-int/lit8 v1, v1, 0x7

    .line 22
    .line 23
    :goto_1
    and-int/2addr v1, v3

    .line 24
    iget-object v4, p0, Lx/n;->a:[J

    .line 25
    .line 26
    shr-int/lit8 v5, v1, 0x3

    .line 27
    .line 28
    and-int/lit8 v6, v1, 0x7

    .line 29
    .line 30
    shl-int/lit8 v6, v6, 0x3

    .line 31
    .line 32
    aget-wide v7, v4, v5

    .line 33
    .line 34
    ushr-long/2addr v7, v6

    .line 35
    add-int/lit8 v5, v5, 0x1

    .line 36
    .line 37
    aget-wide v9, v4, v5

    .line 38
    .line 39
    rsub-int/lit8 v4, v6, 0x40

    .line 40
    .line 41
    shl-long v4, v9, v4

    .line 42
    .line 43
    int-to-long v9, v6

    .line 44
    neg-long v9, v9

    .line 45
    const/16 v6, 0x3f

    .line 46
    .line 47
    shr-long/2addr v9, v6

    .line 48
    and-long/2addr v4, v9

    .line 49
    or-long/2addr v4, v7

    .line 50
    int-to-long v6, v2

    .line 51
    const-wide v8, 0x101010101010101L

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    mul-long/2addr v6, v8

    .line 57
    xor-long/2addr v6, v4

    .line 58
    sub-long v8, v6, v8

    .line 59
    .line 60
    not-long v6, v6

    .line 61
    and-long/2addr v6, v8

    .line 62
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    and-long/2addr v6, v8

    .line 68
    :goto_2
    const-wide/16 v10, 0x0

    .line 69
    .line 70
    cmp-long v12, v6, v10

    .line 71
    .line 72
    if-eqz v12, :cond_2

    .line 73
    .line 74
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    shr-int/lit8 v10, v10, 0x3

    .line 79
    .line 80
    add-int/2addr v10, v1

    .line 81
    and-int/2addr v10, v3

    .line 82
    iget-object v11, p0, Lx/n;->b:[Ljava/lang/Object;

    .line 83
    .line 84
    aget-object v11, v11, v10

    .line 85
    .line 86
    invoke-static {v11, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v11

    .line 90
    if-eqz v11, :cond_1

    .line 91
    .line 92
    return v10

    .line 93
    :cond_1
    const-wide/16 v10, 0x1

    .line 94
    .line 95
    sub-long v10, v6, v10

    .line 96
    .line 97
    and-long/2addr v6, v10

    .line 98
    goto :goto_2

    .line 99
    :cond_2
    not-long v6, v4

    .line 100
    const/4 v12, 0x6

    .line 101
    shl-long/2addr v6, v12

    .line 102
    and-long/2addr v4, v6

    .line 103
    and-long/2addr v4, v8

    .line 104
    cmp-long v4, v4, v10

    .line 105
    .line 106
    if-eqz v4, :cond_3

    .line 107
    .line 108
    const/4 p1, -0x1

    .line 109
    return p1

    .line 110
    :cond_3
    add-int/lit8 v0, v0, 0x8

    .line 111
    .line 112
    add-int/2addr v1, v0

    .line 113
    goto :goto_1
.end method

.method public final d(I)V
    .locals 9

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Lx/t;->c(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x7

    .line 8
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    iput p1, p0, Lx/n;->d:I

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    sget-object v0, Lx/t;->a:[J

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    add-int/lit8 v0, p1, 0xf

    .line 22
    .line 23
    and-int/lit8 v0, v0, -0x8

    .line 24
    .line 25
    shr-int/lit8 v0, v0, 0x3

    .line 26
    .line 27
    new-array v0, v0, [J

    .line 28
    .line 29
    invoke-static {v0}, Lff/m;->q0([J)V

    .line 30
    .line 31
    .line 32
    :goto_1
    iput-object v0, p0, Lx/n;->a:[J

    .line 33
    .line 34
    shr-int/lit8 v1, p1, 0x3

    .line 35
    .line 36
    and-int/lit8 v2, p1, 0x7

    .line 37
    .line 38
    shl-int/lit8 v2, v2, 0x3

    .line 39
    .line 40
    aget-wide v3, v0, v1

    .line 41
    .line 42
    const-wide/16 v5, 0xff

    .line 43
    .line 44
    shl-long/2addr v5, v2

    .line 45
    not-long v7, v5

    .line 46
    and-long/2addr v3, v7

    .line 47
    or-long/2addr v3, v5

    .line 48
    aput-wide v3, v0, v1

    .line 49
    .line 50
    iget v0, p0, Lx/n;->d:I

    .line 51
    .line 52
    invoke-static {v0}, Lx/t;->a(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget v1, p0, Lx/n;->e:I

    .line 57
    .line 58
    sub-int/2addr v0, v1

    .line 59
    iput v0, p0, Lx/n;->f:I

    .line 60
    .line 61
    new-array v0, p1, [Ljava/lang/Object;

    .line 62
    .line 63
    iput-object v0, p0, Lx/n;->b:[Ljava/lang/Object;

    .line 64
    .line 65
    new-array p1, p1, [I

    .line 66
    .line 67
    iput-object p1, p0, Lx/n;->c:[I

    .line 68
    .line 69
    return-void
.end method

.method public final e(I)V
    .locals 11

    .line 1
    iget v0, p0, Lx/n;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lx/n;->e:I

    .line 6
    .line 7
    iget-object v0, p0, Lx/n;->a:[J

    .line 8
    .line 9
    shr-int/lit8 v1, p1, 0x3

    .line 10
    .line 11
    and-int/lit8 v2, p1, 0x7

    .line 12
    .line 13
    shl-int/lit8 v2, v2, 0x3

    .line 14
    .line 15
    aget-wide v3, v0, v1

    .line 16
    .line 17
    const-wide/16 v5, 0xff

    .line 18
    .line 19
    shl-long v7, v5, v2

    .line 20
    .line 21
    not-long v7, v7

    .line 22
    and-long/2addr v3, v7

    .line 23
    const-wide/16 v7, 0xfe

    .line 24
    .line 25
    shl-long v9, v7, v2

    .line 26
    .line 27
    or-long/2addr v3, v9

    .line 28
    aput-wide v3, v0, v1

    .line 29
    .line 30
    iget v1, p0, Lx/n;->d:I

    .line 31
    .line 32
    add-int/lit8 v2, p1, -0x7

    .line 33
    .line 34
    and-int/2addr v2, v1

    .line 35
    and-int/lit8 v1, v1, 0x7

    .line 36
    .line 37
    add-int/2addr v2, v1

    .line 38
    shr-int/lit8 v1, v2, 0x3

    .line 39
    .line 40
    and-int/lit8 v2, v2, 0x7

    .line 41
    .line 42
    shl-int/lit8 v2, v2, 0x3

    .line 43
    .line 44
    aget-wide v3, v0, v1

    .line 45
    .line 46
    shl-long/2addr v5, v2

    .line 47
    not-long v5, v5

    .line 48
    and-long/2addr v3, v5

    .line 49
    shl-long v5, v7, v2

    .line 50
    .line 51
    or-long/2addr v3, v5

    .line 52
    aput-wide v3, v0, v1

    .line 53
    .line 54
    iget-object v0, p0, Lx/n;->b:[Ljava/lang/Object;

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    aput-object v1, v0, p1

    .line 58
    .line 59
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v1, v0, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    instance-of v3, v1, Lx/n;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    return v4

    .line 15
    :cond_1
    check-cast v1, Lx/n;

    .line 16
    .line 17
    iget v3, v1, Lx/n;->e:I

    .line 18
    .line 19
    iget v5, v0, Lx/n;->e:I

    .line 20
    .line 21
    if-eq v3, v5, :cond_2

    .line 22
    .line 23
    return v4

    .line 24
    :cond_2
    iget-object v3, v0, Lx/n;->b:[Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v5, v0, Lx/n;->c:[I

    .line 27
    .line 28
    iget-object v6, v0, Lx/n;->a:[J

    .line 29
    .line 30
    array-length v7, v6

    .line 31
    add-int/lit8 v7, v7, -0x2

    .line 32
    .line 33
    if-ltz v7, :cond_7

    .line 34
    .line 35
    move v8, v4

    .line 36
    :goto_0
    aget-wide v9, v6, v8

    .line 37
    .line 38
    not-long v11, v9

    .line 39
    const/4 v13, 0x7

    .line 40
    shl-long/2addr v11, v13

    .line 41
    and-long/2addr v11, v9

    .line 42
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    and-long/2addr v11, v13

    .line 48
    cmp-long v11, v11, v13

    .line 49
    .line 50
    if-eqz v11, :cond_6

    .line 51
    .line 52
    sub-int v11, v8, v7

    .line 53
    .line 54
    not-int v11, v11

    .line 55
    ushr-int/lit8 v11, v11, 0x1f

    .line 56
    .line 57
    const/16 v12, 0x8

    .line 58
    .line 59
    rsub-int/lit8 v11, v11, 0x8

    .line 60
    .line 61
    move v13, v4

    .line 62
    :goto_1
    if-ge v13, v11, :cond_5

    .line 63
    .line 64
    const-wide/16 v14, 0xff

    .line 65
    .line 66
    and-long/2addr v14, v9

    .line 67
    const-wide/16 v16, 0x80

    .line 68
    .line 69
    cmp-long v14, v14, v16

    .line 70
    .line 71
    if-gez v14, :cond_4

    .line 72
    .line 73
    shl-int/lit8 v14, v8, 0x3

    .line 74
    .line 75
    add-int/2addr v14, v13

    .line 76
    aget-object v15, v3, v14

    .line 77
    .line 78
    aget v14, v5, v14

    .line 79
    .line 80
    invoke-virtual {v1, v15}, Lx/n;->c(Ljava/lang/Object;)I

    .line 81
    .line 82
    .line 83
    move-result v16

    .line 84
    if-ltz v16, :cond_3

    .line 85
    .line 86
    iget-object v15, v1, Lx/n;->c:[I

    .line 87
    .line 88
    aget v15, v15, v16

    .line 89
    .line 90
    if-eq v14, v15, :cond_4

    .line 91
    .line 92
    return v4

    .line 93
    :cond_3
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 94
    .line 95
    new-instance v2, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v3, "There is no key "

    .line 98
    .line 99
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v3, " in the map"

    .line 106
    .line 107
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v1

    .line 118
    :cond_4
    shr-long/2addr v9, v12

    .line 119
    add-int/lit8 v13, v13, 0x1

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    if-ne v11, v12, :cond_7

    .line 123
    .line 124
    :cond_6
    if-eq v8, v7, :cond_7

    .line 125
    .line 126
    add-int/lit8 v8, v8, 0x1

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_7
    return v2
.end method

.method public final hashCode()I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lx/n;->b:[Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, v0, Lx/n;->c:[I

    .line 6
    .line 7
    iget-object v3, v0, Lx/n;->a:[J

    .line 8
    .line 9
    array-length v4, v3

    .line 10
    add-int/lit8 v4, v4, -0x2

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    if-ltz v4, :cond_6

    .line 14
    .line 15
    move v6, v5

    .line 16
    move v7, v6

    .line 17
    :goto_0
    aget-wide v8, v3, v6

    .line 18
    .line 19
    not-long v10, v8

    .line 20
    const/4 v12, 0x7

    .line 21
    shl-long/2addr v10, v12

    .line 22
    and-long/2addr v10, v8

    .line 23
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    and-long/2addr v10, v12

    .line 29
    cmp-long v10, v10, v12

    .line 30
    .line 31
    if-eqz v10, :cond_4

    .line 32
    .line 33
    sub-int v10, v6, v4

    .line 34
    .line 35
    not-int v10, v10

    .line 36
    ushr-int/lit8 v10, v10, 0x1f

    .line 37
    .line 38
    const/16 v11, 0x8

    .line 39
    .line 40
    rsub-int/lit8 v10, v10, 0x8

    .line 41
    .line 42
    move v12, v5

    .line 43
    :goto_1
    if-ge v12, v10, :cond_2

    .line 44
    .line 45
    const-wide/16 v13, 0xff

    .line 46
    .line 47
    and-long/2addr v13, v8

    .line 48
    const-wide/16 v15, 0x80

    .line 49
    .line 50
    cmp-long v13, v13, v15

    .line 51
    .line 52
    if-gez v13, :cond_1

    .line 53
    .line 54
    shl-int/lit8 v13, v6, 0x3

    .line 55
    .line 56
    add-int/2addr v13, v12

    .line 57
    aget-object v14, v1, v13

    .line 58
    .line 59
    aget v13, v2, v13

    .line 60
    .line 61
    if-eqz v14, :cond_0

    .line 62
    .line 63
    invoke-virtual {v14}, Ljava/lang/Object;->hashCode()I

    .line 64
    .line 65
    .line 66
    move-result v14

    .line 67
    goto :goto_2

    .line 68
    :cond_0
    move v14, v5

    .line 69
    :goto_2
    xor-int/2addr v13, v14

    .line 70
    add-int/2addr v7, v13

    .line 71
    :cond_1
    shr-long/2addr v8, v11

    .line 72
    add-int/lit8 v12, v12, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    if-ne v10, v11, :cond_3

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    return v7

    .line 79
    :cond_4
    :goto_3
    if-eq v6, v4, :cond_5

    .line 80
    .line 81
    add-int/lit8 v6, v6, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    return v7

    .line 85
    :cond_6
    return v5
.end method

.method public final toString()Ljava/lang/String;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lx/n;->e:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const-string v1, "{}"

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "{"

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, Lx/n;->b:[Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v3, v0, Lx/n;->c:[I

    .line 20
    .line 21
    iget-object v4, v0, Lx/n;->a:[J

    .line 22
    .line 23
    array-length v5, v4

    .line 24
    add-int/lit8 v5, v5, -0x2

    .line 25
    .line 26
    if-ltz v5, :cond_5

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    move v7, v6

    .line 30
    move v8, v7

    .line 31
    :goto_0
    aget-wide v9, v4, v7

    .line 32
    .line 33
    not-long v11, v9

    .line 34
    const/4 v13, 0x7

    .line 35
    shl-long/2addr v11, v13

    .line 36
    and-long/2addr v11, v9

    .line 37
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    and-long/2addr v11, v13

    .line 43
    cmp-long v11, v11, v13

    .line 44
    .line 45
    if-eqz v11, :cond_4

    .line 46
    .line 47
    sub-int v11, v7, v5

    .line 48
    .line 49
    not-int v11, v11

    .line 50
    ushr-int/lit8 v11, v11, 0x1f

    .line 51
    .line 52
    const/16 v12, 0x8

    .line 53
    .line 54
    rsub-int/lit8 v11, v11, 0x8

    .line 55
    .line 56
    move v13, v6

    .line 57
    :goto_1
    if-ge v13, v11, :cond_3

    .line 58
    .line 59
    const-wide/16 v14, 0xff

    .line 60
    .line 61
    and-long/2addr v14, v9

    .line 62
    const-wide/16 v16, 0x80

    .line 63
    .line 64
    cmp-long v14, v14, v16

    .line 65
    .line 66
    if-gez v14, :cond_2

    .line 67
    .line 68
    shl-int/lit8 v14, v7, 0x3

    .line 69
    .line 70
    add-int/2addr v14, v13

    .line 71
    aget-object v15, v2, v14

    .line 72
    .line 73
    aget v14, v3, v14

    .line 74
    .line 75
    if-ne v15, v0, :cond_1

    .line 76
    .line 77
    const-string v15, "(this)"

    .line 78
    .line 79
    :cond_1
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v15, "="

    .line 83
    .line 84
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    add-int/lit8 v8, v8, 0x1

    .line 91
    .line 92
    iget v14, v0, Lx/n;->e:I

    .line 93
    .line 94
    if-ge v8, v14, :cond_2

    .line 95
    .line 96
    const-string v14, ", "

    .line 97
    .line 98
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    :cond_2
    shr-long/2addr v9, v12

    .line 102
    add-int/lit8 v13, v13, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    if-ne v11, v12, :cond_5

    .line 106
    .line 107
    :cond_4
    if-eq v7, v5, :cond_5

    .line 108
    .line 109
    add-int/lit8 v7, v7, 0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_5
    const/16 v2, 0x7d

    .line 113
    .line 114
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    const-string v2, "s.append(\'}\').toString()"

    .line 122
    .line 123
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-object v1
.end method
