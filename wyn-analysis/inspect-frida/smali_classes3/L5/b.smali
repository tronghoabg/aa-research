.class public final LL5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ5/k;


# instance fields
.field public final a:LY4/b;

.field public final b:LG5/c;

.field public c:I

.field public d:LJ5/m;

.field public e:LL5/c;

.field public f:J

.field public g:[LL5/e;

.field public h:J

.field public i:LL5/e;

.field public j:I

.field public k:J

.field public l:J

.field public m:I

.field public n:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LY4/b;

    .line 5
    .line 6
    const/16 v1, 0xc

    .line 7
    .line 8
    invoke-direct {v0, v1}, LY4/b;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LL5/b;->a:LY4/b;

    .line 12
    .line 13
    new-instance v0, LG5/c;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LL5/b;->b:LG5/c;

    .line 19
    .line 20
    new-instance v0, Lc8/e;

    .line 21
    .line 22
    const/16 v1, 0x14

    .line 23
    .line 24
    invoke-direct {v0, v1}, Lc8/e;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, LL5/b;->d:LJ5/m;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    new-array v0, v0, [LL5/e;

    .line 31
    .line 32
    iput-object v0, p0, LL5/b;->g:[LL5/e;

    .line 33
    .line 34
    const-wide/16 v0, -0x1

    .line 35
    .line 36
    iput-wide v0, p0, LL5/b;->k:J

    .line 37
    .line 38
    iput-wide v0, p0, LL5/b;->l:J

    .line 39
    .line 40
    const/4 v0, -0x1

    .line 41
    iput v0, p0, LL5/b;->j:I

    .line 42
    .line 43
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    iput-wide v0, p0, LL5/b;->f:J

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 5

    .line 1
    const-wide/16 p3, -0x1

    .line 2
    .line 3
    iput-wide p3, p0, LL5/b;->h:J

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    iput-object p3, p0, LL5/b;->i:LL5/e;

    .line 7
    .line 8
    iget-object p3, p0, LL5/b;->g:[LL5/e;

    .line 9
    .line 10
    array-length p4, p3

    .line 11
    const/4 v0, 0x0

    .line 12
    move v1, v0

    .line 13
    :goto_0
    if-ge v1, p4, :cond_1

    .line 14
    .line 15
    aget-object v2, p3, v1

    .line 16
    .line 17
    iget v3, v2, LL5/e;->j:I

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    iput v0, v2, LL5/e;->h:I

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v3, v2, LL5/e;->k:[J

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    invoke-static {v3, p1, p2, v4}, Lu6/v;->e([JJZ)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    iget-object v4, v2, LL5/e;->l:[I

    .line 32
    .line 33
    aget v3, v4, v3

    .line 34
    .line 35
    iput v3, v2, LL5/e;->h:I

    .line 36
    .line 37
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const-wide/16 p3, 0x0

    .line 41
    .line 42
    cmp-long p1, p1, p3

    .line 43
    .line 44
    if-nez p1, :cond_3

    .line 45
    .line 46
    iget-object p1, p0, LL5/b;->g:[LL5/e;

    .line 47
    .line 48
    array-length p1, p1

    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    iput v0, p0, LL5/b;->c:I

    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    const/4 p1, 0x3

    .line 55
    iput p1, p0, LL5/b;->c:I

    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    const/4 p1, 0x6

    .line 59
    iput p1, p0, LL5/b;->c:I

    .line 60
    .line 61
    return-void
.end method

.method public final g(LJ5/l;LJ5/n;)I
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-wide v2, v0, LL5/b;->h:J

    .line 6
    .line 7
    const-wide/16 v4, -0x1

    .line 8
    .line 9
    cmp-long v6, v2, v4

    .line 10
    .line 11
    const/4 v7, 0x1

    .line 12
    const/4 v8, 0x0

    .line 13
    if-eqz v6, :cond_2

    .line 14
    .line 15
    move-object v6, v1

    .line 16
    check-cast v6, LJ5/h;

    .line 17
    .line 18
    iget-wide v9, v6, LJ5/h;->d:J

    .line 19
    .line 20
    cmp-long v6, v2, v9

    .line 21
    .line 22
    if-ltz v6, :cond_0

    .line 23
    .line 24
    const-wide/32 v11, 0x40000

    .line 25
    .line 26
    .line 27
    add-long/2addr v11, v9

    .line 28
    cmp-long v6, v2, v11

    .line 29
    .line 30
    if-lez v6, :cond_1

    .line 31
    .line 32
    :cond_0
    move-object/from16 v6, p2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    sub-long/2addr v2, v9

    .line 36
    long-to-int v2, v2

    .line 37
    move-object v3, v1

    .line 38
    check-cast v3, LJ5/h;

    .line 39
    .line 40
    invoke-virtual {v3, v2}, LJ5/h;->j(I)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :goto_0
    iput-wide v2, v6, LJ5/n;->a:J

    .line 45
    .line 46
    move v2, v7

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    :goto_1
    move v2, v8

    .line 49
    :goto_2
    iput-wide v4, v0, LL5/b;->h:J

    .line 50
    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    return v7

    .line 54
    :cond_3
    iget v2, v0, LL5/b;->c:I

    .line 55
    .line 56
    iget-object v3, v0, LL5/b;->b:LG5/c;

    .line 57
    .line 58
    iget-object v6, v0, LL5/b;->a:LY4/b;

    .line 59
    .line 60
    const/4 v9, 0x0

    .line 61
    const v10, 0x6c726468

    .line 62
    .line 63
    .line 64
    const/4 v12, 0x6

    .line 65
    const/16 v14, 0x10

    .line 66
    .line 67
    const v15, 0x69766f6d

    .line 68
    .line 69
    .line 70
    move-wide/from16 v16, v4

    .line 71
    .line 72
    const/16 v5, 0x8

    .line 73
    .line 74
    const/16 p2, 0x3

    .line 75
    .line 76
    const v13, 0x5453494c

    .line 77
    .line 78
    .line 79
    const-wide/16 v18, 0x8

    .line 80
    .line 81
    const/16 v20, 0x2

    .line 82
    .line 83
    const/16 v4, 0xc

    .line 84
    .line 85
    packed-switch v2, :pswitch_data_0

    .line 86
    .line 87
    .line 88
    new-instance v1, Ljava/lang/AssertionError;

    .line 89
    .line 90
    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    .line 91
    .line 92
    .line 93
    throw v1

    .line 94
    :pswitch_0
    move-object v2, v1

    .line 95
    check-cast v2, LJ5/h;

    .line 96
    .line 97
    iget-wide v2, v2, LJ5/h;->d:J

    .line 98
    .line 99
    iget-wide v10, v0, LL5/b;->l:J

    .line 100
    .line 101
    cmp-long v2, v2, v10

    .line 102
    .line 103
    if-ltz v2, :cond_4

    .line 104
    .line 105
    const/4 v1, -0x1

    .line 106
    return v1

    .line 107
    :cond_4
    iget-object v2, v0, LL5/b;->i:LL5/e;

    .line 108
    .line 109
    if-eqz v2, :cond_a

    .line 110
    .line 111
    iget v3, v2, LL5/e;->g:I

    .line 112
    .line 113
    iget-object v4, v2, LL5/e;->a:LJ5/w;

    .line 114
    .line 115
    invoke-interface {v4, v1, v3, v8}, LJ5/w;->d(Lt6/i;IZ)I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    sub-int/2addr v3, v1

    .line 120
    iput v3, v2, LL5/e;->g:I

    .line 121
    .line 122
    if-nez v3, :cond_5

    .line 123
    .line 124
    move v1, v7

    .line 125
    goto :goto_3

    .line 126
    :cond_5
    move v1, v8

    .line 127
    :goto_3
    if-eqz v1, :cond_8

    .line 128
    .line 129
    iget v3, v2, LL5/e;->f:I

    .line 130
    .line 131
    if-lez v3, :cond_7

    .line 132
    .line 133
    iget v3, v2, LL5/e;->h:I

    .line 134
    .line 135
    iget-wide v4, v2, LL5/e;->d:J

    .line 136
    .line 137
    int-to-long v10, v3

    .line 138
    mul-long/2addr v4, v10

    .line 139
    iget v6, v2, LL5/e;->e:I

    .line 140
    .line 141
    int-to-long v10, v6

    .line 142
    div-long v13, v4, v10

    .line 143
    .line 144
    iget-object v4, v2, LL5/e;->l:[I

    .line 145
    .line 146
    invoke-static {v4, v3}, Ljava/util/Arrays;->binarySearch([II)I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-ltz v3, :cond_6

    .line 151
    .line 152
    move v15, v7

    .line 153
    goto :goto_4

    .line 154
    :cond_6
    move v15, v8

    .line 155
    :goto_4
    iget v3, v2, LL5/e;->f:I

    .line 156
    .line 157
    const/16 v17, 0x0

    .line 158
    .line 159
    const/16 v18, 0x0

    .line 160
    .line 161
    iget-object v12, v2, LL5/e;->a:LJ5/w;

    .line 162
    .line 163
    move/from16 v16, v3

    .line 164
    .line 165
    invoke-interface/range {v12 .. v18}, LJ5/w;->b(JIIILJ5/v;)V

    .line 166
    .line 167
    .line 168
    :cond_7
    iget v3, v2, LL5/e;->h:I

    .line 169
    .line 170
    add-int/2addr v3, v7

    .line 171
    iput v3, v2, LL5/e;->h:I

    .line 172
    .line 173
    :cond_8
    if-eqz v1, :cond_9

    .line 174
    .line 175
    iput-object v9, v0, LL5/b;->i:LL5/e;

    .line 176
    .line 177
    :cond_9
    return v8

    .line 178
    :cond_a
    check-cast v1, LJ5/h;

    .line 179
    .line 180
    iget-wide v2, v1, LJ5/h;->d:J

    .line 181
    .line 182
    const-wide/16 v10, 0x1

    .line 183
    .line 184
    and-long/2addr v2, v10

    .line 185
    cmp-long v2, v2, v10

    .line 186
    .line 187
    if-nez v2, :cond_b

    .line 188
    .line 189
    invoke-virtual {v1, v7}, LJ5/h;->j(I)V

    .line 190
    .line 191
    .line 192
    :cond_b
    iget-object v2, v6, LY4/b;->a:[B

    .line 193
    .line 194
    invoke-virtual {v1, v2, v8, v4, v8}, LJ5/h;->c([BIIZ)Z

    .line 195
    .line 196
    .line 197
    invoke-virtual {v6, v8}, LY4/b;->A(I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v6}, LY4/b;->f()I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-ne v2, v13, :cond_d

    .line 205
    .line 206
    invoke-virtual {v6, v5}, LY4/b;->A(I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v6}, LY4/b;->f()I

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-ne v2, v15, :cond_c

    .line 214
    .line 215
    move v5, v4

    .line 216
    :cond_c
    invoke-virtual {v1, v5}, LJ5/h;->j(I)V

    .line 217
    .line 218
    .line 219
    iput v8, v1, LJ5/h;->f:I

    .line 220
    .line 221
    return v8

    .line 222
    :cond_d
    invoke-virtual {v6}, LY4/b;->f()I

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    const v4, 0x4b4e554a    # 1.352225E7f

    .line 227
    .line 228
    .line 229
    if-ne v2, v4, :cond_e

    .line 230
    .line 231
    iget-wide v1, v1, LJ5/h;->d:J

    .line 232
    .line 233
    int-to-long v3, v3

    .line 234
    add-long/2addr v1, v3

    .line 235
    add-long v1, v1, v18

    .line 236
    .line 237
    iput-wide v1, v0, LL5/b;->h:J

    .line 238
    .line 239
    return v8

    .line 240
    :cond_e
    invoke-virtual {v1, v5}, LJ5/h;->j(I)V

    .line 241
    .line 242
    .line 243
    iput v8, v1, LJ5/h;->f:I

    .line 244
    .line 245
    iget-object v4, v0, LL5/b;->g:[LL5/e;

    .line 246
    .line 247
    array-length v5, v4

    .line 248
    move v6, v8

    .line 249
    :goto_5
    if-ge v6, v5, :cond_11

    .line 250
    .line 251
    aget-object v7, v4, v6

    .line 252
    .line 253
    iget v10, v7, LL5/e;->b:I

    .line 254
    .line 255
    if-eq v10, v2, :cond_10

    .line 256
    .line 257
    iget v10, v7, LL5/e;->c:I

    .line 258
    .line 259
    if-ne v10, v2, :cond_f

    .line 260
    .line 261
    goto :goto_6

    .line 262
    :cond_f
    add-int/lit8 v6, v6, 0x1

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_10
    :goto_6
    move-object v9, v7

    .line 266
    :cond_11
    if-nez v9, :cond_12

    .line 267
    .line 268
    iget-wide v1, v1, LJ5/h;->d:J

    .line 269
    .line 270
    int-to-long v3, v3

    .line 271
    add-long/2addr v1, v3

    .line 272
    iput-wide v1, v0, LL5/b;->h:J

    .line 273
    .line 274
    return v8

    .line 275
    :cond_12
    iput v3, v9, LL5/e;->f:I

    .line 276
    .line 277
    iput v3, v9, LL5/e;->g:I

    .line 278
    .line 279
    iput-object v9, v0, LL5/b;->i:LL5/e;

    .line 280
    .line 281
    return v8

    .line 282
    :pswitch_1
    new-instance v2, LY4/b;

    .line 283
    .line 284
    iget v3, v0, LL5/b;->m:I

    .line 285
    .line 286
    invoke-direct {v2, v3}, LY4/b;-><init>(I)V

    .line 287
    .line 288
    .line 289
    iget-object v3, v2, LY4/b;->a:[B

    .line 290
    .line 291
    iget v4, v0, LL5/b;->m:I

    .line 292
    .line 293
    check-cast v1, LJ5/h;

    .line 294
    .line 295
    invoke-virtual {v1, v3, v8, v4, v8}, LJ5/h;->f([BIIZ)Z

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2}, LY4/b;->a()I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    const-wide/16 v3, 0x0

    .line 303
    .line 304
    if-ge v1, v14, :cond_13

    .line 305
    .line 306
    goto :goto_8

    .line 307
    :cond_13
    iget v1, v2, LY4/b;->b:I

    .line 308
    .line 309
    invoke-virtual {v2, v5}, LY4/b;->B(I)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2}, LY4/b;->f()I

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    int-to-long v5, v5

    .line 317
    iget-wide v10, v0, LL5/b;->k:J

    .line 318
    .line 319
    cmp-long v5, v5, v10

    .line 320
    .line 321
    if-lez v5, :cond_14

    .line 322
    .line 323
    goto :goto_7

    .line 324
    :cond_14
    add-long v3, v10, v18

    .line 325
    .line 326
    :goto_7
    invoke-virtual {v2, v1}, LY4/b;->A(I)V

    .line 327
    .line 328
    .line 329
    :goto_8
    invoke-virtual {v2}, LY4/b;->a()I

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    if-lt v1, v14, :cond_1b

    .line 334
    .line 335
    invoke-virtual {v2}, LY4/b;->f()I

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    invoke-virtual {v2}, LY4/b;->f()I

    .line 340
    .line 341
    .line 342
    move-result v5

    .line 343
    invoke-virtual {v2}, LY4/b;->f()I

    .line 344
    .line 345
    .line 346
    move-result v6

    .line 347
    int-to-long v10, v6

    .line 348
    add-long/2addr v10, v3

    .line 349
    invoke-virtual {v2}, LY4/b;->f()I

    .line 350
    .line 351
    .line 352
    iget-object v6, v0, LL5/b;->g:[LL5/e;

    .line 353
    .line 354
    array-length v13, v6

    .line 355
    move v15, v8

    .line 356
    :goto_9
    if-ge v15, v13, :cond_16

    .line 357
    .line 358
    aget-object v9, v6, v15

    .line 359
    .line 360
    move/from16 v21, v8

    .line 361
    .line 362
    iget v8, v9, LL5/e;->b:I

    .line 363
    .line 364
    if-eq v8, v1, :cond_17

    .line 365
    .line 366
    iget v8, v9, LL5/e;->c:I

    .line 367
    .line 368
    if-ne v8, v1, :cond_15

    .line 369
    .line 370
    goto :goto_a

    .line 371
    :cond_15
    add-int/lit8 v15, v15, 0x1

    .line 372
    .line 373
    move/from16 v8, v21

    .line 374
    .line 375
    const/4 v9, 0x0

    .line 376
    goto :goto_9

    .line 377
    :cond_16
    move/from16 v21, v8

    .line 378
    .line 379
    const/4 v9, 0x0

    .line 380
    :cond_17
    :goto_a
    if-nez v9, :cond_18

    .line 381
    .line 382
    :goto_b
    move/from16 v8, v21

    .line 383
    .line 384
    const/4 v9, 0x0

    .line 385
    goto :goto_8

    .line 386
    :cond_18
    and-int/lit8 v1, v5, 0x10

    .line 387
    .line 388
    if-ne v1, v14, :cond_1a

    .line 389
    .line 390
    iget v1, v9, LL5/e;->j:I

    .line 391
    .line 392
    iget-object v5, v9, LL5/e;->l:[I

    .line 393
    .line 394
    array-length v5, v5

    .line 395
    if-ne v1, v5, :cond_19

    .line 396
    .line 397
    iget-object v1, v9, LL5/e;->k:[J

    .line 398
    .line 399
    array-length v5, v1

    .line 400
    mul-int/lit8 v5, v5, 0x3

    .line 401
    .line 402
    div-int/lit8 v5, v5, 0x2

    .line 403
    .line 404
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    iput-object v1, v9, LL5/e;->k:[J

    .line 409
    .line 410
    iget-object v1, v9, LL5/e;->l:[I

    .line 411
    .line 412
    array-length v5, v1

    .line 413
    mul-int/lit8 v5, v5, 0x3

    .line 414
    .line 415
    div-int/lit8 v5, v5, 0x2

    .line 416
    .line 417
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    iput-object v1, v9, LL5/e;->l:[I

    .line 422
    .line 423
    :cond_19
    iget-object v1, v9, LL5/e;->k:[J

    .line 424
    .line 425
    iget v5, v9, LL5/e;->j:I

    .line 426
    .line 427
    aput-wide v10, v1, v5

    .line 428
    .line 429
    iget-object v1, v9, LL5/e;->l:[I

    .line 430
    .line 431
    iget v6, v9, LL5/e;->i:I

    .line 432
    .line 433
    aput v6, v1, v5

    .line 434
    .line 435
    add-int/2addr v5, v7

    .line 436
    iput v5, v9, LL5/e;->j:I

    .line 437
    .line 438
    :cond_1a
    iget v1, v9, LL5/e;->i:I

    .line 439
    .line 440
    add-int/2addr v1, v7

    .line 441
    iput v1, v9, LL5/e;->i:I

    .line 442
    .line 443
    goto :goto_b

    .line 444
    :cond_1b
    move/from16 v21, v8

    .line 445
    .line 446
    iget-object v1, v0, LL5/b;->g:[LL5/e;

    .line 447
    .line 448
    array-length v2, v1

    .line 449
    move/from16 v3, v21

    .line 450
    .line 451
    :goto_c
    if-ge v3, v2, :cond_1c

    .line 452
    .line 453
    aget-object v4, v1, v3

    .line 454
    .line 455
    iget-object v5, v4, LL5/e;->k:[J

    .line 456
    .line 457
    iget v6, v4, LL5/e;->j:I

    .line 458
    .line 459
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 460
    .line 461
    .line 462
    move-result-object v5

    .line 463
    iput-object v5, v4, LL5/e;->k:[J

    .line 464
    .line 465
    iget-object v5, v4, LL5/e;->l:[I

    .line 466
    .line 467
    iget v6, v4, LL5/e;->j:I

    .line 468
    .line 469
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([II)[I

    .line 470
    .line 471
    .line 472
    move-result-object v5

    .line 473
    iput-object v5, v4, LL5/e;->l:[I

    .line 474
    .line 475
    add-int/lit8 v3, v3, 0x1

    .line 476
    .line 477
    goto :goto_c

    .line 478
    :cond_1c
    iput-boolean v7, v0, LL5/b;->n:Z

    .line 479
    .line 480
    iget-object v1, v0, LL5/b;->d:LJ5/m;

    .line 481
    .line 482
    new-instance v2, LJ5/o;

    .line 483
    .line 484
    iget-wide v3, v0, LL5/b;->f:J

    .line 485
    .line 486
    const/4 v5, 0x2

    .line 487
    invoke-direct {v2, v0, v3, v4, v5}, LJ5/o;-><init>(Ljava/lang/Object;JI)V

    .line 488
    .line 489
    .line 490
    invoke-interface {v1, v2}, LJ5/m;->x(LJ5/t;)V

    .line 491
    .line 492
    .line 493
    iput v12, v0, LL5/b;->c:I

    .line 494
    .line 495
    iget-wide v1, v0, LL5/b;->k:J

    .line 496
    .line 497
    iput-wide v1, v0, LL5/b;->h:J

    .line 498
    .line 499
    return v21

    .line 500
    :pswitch_2
    move/from16 v21, v8

    .line 501
    .line 502
    iget-object v2, v6, LY4/b;->a:[B

    .line 503
    .line 504
    move-object v3, v1

    .line 505
    check-cast v3, LJ5/h;

    .line 506
    .line 507
    move/from16 v8, v21

    .line 508
    .line 509
    invoke-virtual {v3, v2, v8, v5, v8}, LJ5/h;->f([BIIZ)Z

    .line 510
    .line 511
    .line 512
    invoke-virtual {v6, v8}, LY4/b;->A(I)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v6}, LY4/b;->f()I

    .line 516
    .line 517
    .line 518
    move-result v2

    .line 519
    invoke-virtual {v6}, LY4/b;->f()I

    .line 520
    .line 521
    .line 522
    move-result v3

    .line 523
    const v4, 0x31786469

    .line 524
    .line 525
    .line 526
    if-ne v2, v4, :cond_1d

    .line 527
    .line 528
    const/4 v1, 0x5

    .line 529
    iput v1, v0, LL5/b;->c:I

    .line 530
    .line 531
    iput v3, v0, LL5/b;->m:I

    .line 532
    .line 533
    return v8

    .line 534
    :cond_1d
    check-cast v1, LJ5/h;

    .line 535
    .line 536
    iget-wide v1, v1, LJ5/h;->d:J

    .line 537
    .line 538
    int-to-long v3, v3

    .line 539
    add-long/2addr v1, v3

    .line 540
    iput-wide v1, v0, LL5/b;->h:J

    .line 541
    .line 542
    return v8

    .line 543
    :pswitch_3
    iget-wide v9, v0, LL5/b;->k:J

    .line 544
    .line 545
    cmp-long v2, v9, v16

    .line 546
    .line 547
    if-eqz v2, :cond_1e

    .line 548
    .line 549
    move-object v2, v1

    .line 550
    check-cast v2, LJ5/h;

    .line 551
    .line 552
    iget-wide v11, v2, LJ5/h;->d:J

    .line 553
    .line 554
    cmp-long v2, v11, v9

    .line 555
    .line 556
    if-eqz v2, :cond_1e

    .line 557
    .line 558
    iput-wide v9, v0, LL5/b;->h:J

    .line 559
    .line 560
    return v8

    .line 561
    :cond_1e
    iget-object v2, v6, LY4/b;->a:[B

    .line 562
    .line 563
    move-object v9, v1

    .line 564
    check-cast v9, LJ5/h;

    .line 565
    .line 566
    invoke-virtual {v9, v2, v8, v4, v8}, LJ5/h;->c([BIIZ)Z

    .line 567
    .line 568
    .line 569
    check-cast v1, LJ5/h;

    .line 570
    .line 571
    iput v8, v1, LJ5/h;->f:I

    .line 572
    .line 573
    invoke-virtual {v6, v8}, LY4/b;->A(I)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v6}, LY4/b;->f()I

    .line 577
    .line 578
    .line 579
    move-result v2

    .line 580
    iput v2, v3, LG5/c;->a:I

    .line 581
    .line 582
    invoke-virtual {v6}, LY4/b;->f()I

    .line 583
    .line 584
    .line 585
    move-result v2

    .line 586
    iput v2, v3, LG5/c;->b:I

    .line 587
    .line 588
    iput v8, v3, LG5/c;->c:I

    .line 589
    .line 590
    invoke-virtual {v6}, LY4/b;->f()I

    .line 591
    .line 592
    .line 593
    move-result v2

    .line 594
    iget v6, v3, LG5/c;->a:I

    .line 595
    .line 596
    const v9, 0x46464952

    .line 597
    .line 598
    .line 599
    if-ne v6, v9, :cond_1f

    .line 600
    .line 601
    invoke-virtual {v1, v4}, LJ5/h;->j(I)V

    .line 602
    .line 603
    .line 604
    return v8

    .line 605
    :cond_1f
    if-ne v6, v13, :cond_20

    .line 606
    .line 607
    if-eq v2, v15, :cond_21

    .line 608
    .line 609
    :cond_20
    const/4 v8, 0x0

    .line 610
    goto :goto_d

    .line 611
    :cond_21
    iget-wide v8, v1, LJ5/h;->d:J

    .line 612
    .line 613
    iput-wide v8, v0, LL5/b;->k:J

    .line 614
    .line 615
    iget v2, v3, LG5/c;->b:I

    .line 616
    .line 617
    int-to-long v2, v2

    .line 618
    add-long/2addr v8, v2

    .line 619
    add-long v8, v8, v18

    .line 620
    .line 621
    iput-wide v8, v0, LL5/b;->l:J

    .line 622
    .line 623
    iget-boolean v2, v0, LL5/b;->n:Z

    .line 624
    .line 625
    if-nez v2, :cond_23

    .line 626
    .line 627
    iget-object v2, v0, LL5/b;->e:LL5/c;

    .line 628
    .line 629
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 630
    .line 631
    .line 632
    iget v2, v2, LL5/c;->b:I

    .line 633
    .line 634
    and-int/2addr v2, v14

    .line 635
    if-ne v2, v14, :cond_22

    .line 636
    .line 637
    const/4 v5, 0x4

    .line 638
    iput v5, v0, LL5/b;->c:I

    .line 639
    .line 640
    iget-wide v1, v0, LL5/b;->l:J

    .line 641
    .line 642
    iput-wide v1, v0, LL5/b;->h:J

    .line 643
    .line 644
    const/16 v21, 0x0

    .line 645
    .line 646
    return v21

    .line 647
    :cond_22
    iget-object v2, v0, LL5/b;->d:LJ5/m;

    .line 648
    .line 649
    new-instance v3, LJ5/o;

    .line 650
    .line 651
    iget-wide v4, v0, LL5/b;->f:J

    .line 652
    .line 653
    invoke-direct {v3, v4, v5}, LJ5/o;-><init>(J)V

    .line 654
    .line 655
    .line 656
    invoke-interface {v2, v3}, LJ5/m;->x(LJ5/t;)V

    .line 657
    .line 658
    .line 659
    iput-boolean v7, v0, LL5/b;->n:Z

    .line 660
    .line 661
    :cond_23
    iget-wide v1, v1, LJ5/h;->d:J

    .line 662
    .line 663
    const-wide/16 v3, 0xc

    .line 664
    .line 665
    add-long/2addr v1, v3

    .line 666
    iput-wide v1, v0, LL5/b;->h:J

    .line 667
    .line 668
    const/4 v1, 0x6

    .line 669
    iput v1, v0, LL5/b;->c:I

    .line 670
    .line 671
    const/4 v8, 0x0

    .line 672
    return v8

    .line 673
    :goto_d
    iget-wide v1, v1, LJ5/h;->d:J

    .line 674
    .line 675
    iget v3, v3, LG5/c;->b:I

    .line 676
    .line 677
    int-to-long v3, v3

    .line 678
    add-long/2addr v1, v3

    .line 679
    add-long v1, v1, v18

    .line 680
    .line 681
    iput-wide v1, v0, LL5/b;->h:J

    .line 682
    .line 683
    return v8

    .line 684
    :pswitch_4
    iget v2, v0, LL5/b;->j:I

    .line 685
    .line 686
    const/4 v5, 0x4

    .line 687
    sub-int/2addr v2, v5

    .line 688
    new-instance v3, LY4/b;

    .line 689
    .line 690
    invoke-direct {v3, v2}, LY4/b;-><init>(I)V

    .line 691
    .line 692
    .line 693
    iget-object v4, v3, LY4/b;->a:[B

    .line 694
    .line 695
    check-cast v1, LJ5/h;

    .line 696
    .line 697
    invoke-virtual {v1, v4, v8, v2, v8}, LJ5/h;->f([BIIZ)Z

    .line 698
    .line 699
    .line 700
    invoke-static {v10, v3}, LL5/f;->b(ILY4/b;)LL5/f;

    .line 701
    .line 702
    .line 703
    move-result-object v1

    .line 704
    iget v2, v1, LL5/f;->b:I

    .line 705
    .line 706
    if-ne v2, v10, :cond_2e

    .line 707
    .line 708
    const-class v2, LL5/c;

    .line 709
    .line 710
    invoke-virtual {v1, v2}, LL5/f;->a(Ljava/lang/Class;)LL5/a;

    .line 711
    .line 712
    .line 713
    move-result-object v2

    .line 714
    check-cast v2, LL5/c;

    .line 715
    .line 716
    if-eqz v2, :cond_2d

    .line 717
    .line 718
    iput-object v2, v0, LL5/b;->e:LL5/c;

    .line 719
    .line 720
    iget v3, v2, LL5/c;->c:I

    .line 721
    .line 722
    int-to-long v3, v3

    .line 723
    iget v2, v2, LL5/c;->a:I

    .line 724
    .line 725
    int-to-long v5, v2

    .line 726
    mul-long/2addr v3, v5

    .line 727
    iput-wide v3, v0, LL5/b;->f:J

    .line 728
    .line 729
    new-instance v2, Ljava/util/ArrayList;

    .line 730
    .line 731
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 732
    .line 733
    .line 734
    iget-object v1, v1, LL5/f;->a:Ll8/e0;

    .line 735
    .line 736
    const/4 v8, 0x0

    .line 737
    invoke-virtual {v1, v8}, Ll8/K;->l(I)Ll8/I;

    .line 738
    .line 739
    .line 740
    move-result-object v1

    .line 741
    const/4 v10, 0x0

    .line 742
    :goto_e
    invoke-virtual {v1}, Ll8/I;->hasNext()Z

    .line 743
    .line 744
    .line 745
    move-result v3

    .line 746
    if-eqz v3, :cond_2c

    .line 747
    .line 748
    invoke-virtual {v1}, Ll8/I;->next()Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v3

    .line 752
    check-cast v3, LL5/a;

    .line 753
    .line 754
    invoke-interface {v3}, LL5/a;->getType()I

    .line 755
    .line 756
    .line 757
    move-result v4

    .line 758
    const v5, 0x6c727473

    .line 759
    .line 760
    .line 761
    if-ne v4, v5, :cond_2b

    .line 762
    .line 763
    check-cast v3, LL5/f;

    .line 764
    .line 765
    add-int/lit8 v4, v10, 0x1

    .line 766
    .line 767
    const-class v5, LL5/d;

    .line 768
    .line 769
    invoke-virtual {v3, v5}, LL5/f;->a(Ljava/lang/Class;)LL5/a;

    .line 770
    .line 771
    .line 772
    move-result-object v5

    .line 773
    check-cast v5, LL5/d;

    .line 774
    .line 775
    const-class v6, LL5/g;

    .line 776
    .line 777
    invoke-virtual {v3, v6}, LL5/f;->a(Ljava/lang/Class;)LL5/a;

    .line 778
    .line 779
    .line 780
    move-result-object v6

    .line 781
    check-cast v6, LL5/g;

    .line 782
    .line 783
    const-string v8, "AviExtractor"

    .line 784
    .line 785
    if-nez v5, :cond_25

    .line 786
    .line 787
    const-string v3, "Missing Stream Header"

    .line 788
    .line 789
    invoke-static {v8, v3}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 790
    .line 791
    .line 792
    :cond_24
    :goto_f
    const/4 v9, 0x0

    .line 793
    goto :goto_10

    .line 794
    :cond_25
    if-nez v6, :cond_26

    .line 795
    .line 796
    const-string v3, "Missing Stream Format"

    .line 797
    .line 798
    invoke-static {v8, v3}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 799
    .line 800
    .line 801
    goto :goto_f

    .line 802
    :cond_26
    iget v8, v5, LL5/d;->d:I

    .line 803
    .line 804
    int-to-long v11, v8

    .line 805
    iget v8, v5, LL5/d;->b:I

    .line 806
    .line 807
    int-to-long v8, v8

    .line 808
    const-wide/32 v13, 0xf4240

    .line 809
    .line 810
    .line 811
    mul-long/2addr v13, v8

    .line 812
    iget v8, v5, LL5/d;->c:I

    .line 813
    .line 814
    int-to-long v8, v8

    .line 815
    move-wide v15, v8

    .line 816
    invoke-static/range {v11 .. v16}, Lu6/v;->D(JJJ)J

    .line 817
    .line 818
    .line 819
    move-result-wide v12

    .line 820
    iget-object v6, v6, LL5/g;->a:LE5/T;

    .line 821
    .line 822
    invoke-virtual {v6}, LE5/T;->a()LE5/S;

    .line 823
    .line 824
    .line 825
    move-result-object v8

    .line 826
    invoke-static {v10}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v9

    .line 830
    iput-object v9, v8, LE5/S;->a:Ljava/lang/String;

    .line 831
    .line 832
    iget v9, v5, LL5/d;->e:I

    .line 833
    .line 834
    if-eqz v9, :cond_27

    .line 835
    .line 836
    iput v9, v8, LE5/S;->l:I

    .line 837
    .line 838
    :cond_27
    const-class v9, LL5/h;

    .line 839
    .line 840
    invoke-virtual {v3, v9}, LL5/f;->a(Ljava/lang/Class;)LL5/a;

    .line 841
    .line 842
    .line 843
    move-result-object v3

    .line 844
    check-cast v3, LL5/h;

    .line 845
    .line 846
    if-eqz v3, :cond_28

    .line 847
    .line 848
    iget-object v3, v3, LL5/h;->a:Ljava/lang/String;

    .line 849
    .line 850
    iput-object v3, v8, LE5/S;->b:Ljava/lang/String;

    .line 851
    .line 852
    :cond_28
    iget-object v3, v6, LE5/T;->l:Ljava/lang/String;

    .line 853
    .line 854
    invoke-static {v3}, Lu6/k;->f(Ljava/lang/String;)I

    .line 855
    .line 856
    .line 857
    move-result v11

    .line 858
    if-eq v11, v7, :cond_29

    .line 859
    .line 860
    move/from16 v3, v20

    .line 861
    .line 862
    if-ne v11, v3, :cond_24

    .line 863
    .line 864
    :cond_29
    iget-object v3, v0, LL5/b;->d:LJ5/m;

    .line 865
    .line 866
    invoke-interface {v3, v10, v11}, LJ5/m;->m(II)LJ5/w;

    .line 867
    .line 868
    .line 869
    move-result-object v15

    .line 870
    new-instance v3, LE5/T;

    .line 871
    .line 872
    invoke-direct {v3, v8}, LE5/T;-><init>(LE5/S;)V

    .line 873
    .line 874
    .line 875
    invoke-interface {v15, v3}, LJ5/w;->a(LE5/T;)V

    .line 876
    .line 877
    .line 878
    new-instance v9, LL5/e;

    .line 879
    .line 880
    iget v14, v5, LL5/d;->d:I

    .line 881
    .line 882
    invoke-direct/range {v9 .. v15}, LL5/e;-><init>(IIJILJ5/w;)V

    .line 883
    .line 884
    .line 885
    iput-wide v12, v0, LL5/b;->f:J

    .line 886
    .line 887
    :goto_10
    if-eqz v9, :cond_2a

    .line 888
    .line 889
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 890
    .line 891
    .line 892
    :cond_2a
    move v10, v4

    .line 893
    :cond_2b
    const/16 v20, 0x2

    .line 894
    .line 895
    goto/16 :goto_e

    .line 896
    .line 897
    :cond_2c
    const/4 v8, 0x0

    .line 898
    new-array v1, v8, [LL5/e;

    .line 899
    .line 900
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    move-result-object v1

    .line 904
    check-cast v1, [LL5/e;

    .line 905
    .line 906
    iput-object v1, v0, LL5/b;->g:[LL5/e;

    .line 907
    .line 908
    iget-object v1, v0, LL5/b;->d:LJ5/m;

    .line 909
    .line 910
    invoke-interface {v1}, LJ5/m;->l()V

    .line 911
    .line 912
    .line 913
    move/from16 v1, p2

    .line 914
    .line 915
    iput v1, v0, LL5/b;->c:I

    .line 916
    .line 917
    return v8

    .line 918
    :cond_2d
    const-string v1, "AviHeader not found"

    .line 919
    .line 920
    const/4 v3, 0x0

    .line 921
    invoke-static {v1, v3}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 922
    .line 923
    .line 924
    move-result-object v1

    .line 925
    throw v1

    .line 926
    :cond_2e
    const/4 v3, 0x0

    .line 927
    new-instance v1, Ljava/lang/StringBuilder;

    .line 928
    .line 929
    const-string v4, "Unexpected header list type "

    .line 930
    .line 931
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 932
    .line 933
    .line 934
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 935
    .line 936
    .line 937
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v1

    .line 941
    invoke-static {v1, v3}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 942
    .line 943
    .line 944
    move-result-object v1

    .line 945
    throw v1

    .line 946
    :pswitch_5
    iget-object v2, v6, LY4/b;->a:[B

    .line 947
    .line 948
    check-cast v1, LJ5/h;

    .line 949
    .line 950
    const/4 v8, 0x0

    .line 951
    invoke-virtual {v1, v2, v8, v4, v8}, LJ5/h;->f([BIIZ)Z

    .line 952
    .line 953
    .line 954
    invoke-virtual {v6, v8}, LY4/b;->A(I)V

    .line 955
    .line 956
    .line 957
    invoke-virtual {v6}, LY4/b;->f()I

    .line 958
    .line 959
    .line 960
    move-result v1

    .line 961
    iput v1, v3, LG5/c;->a:I

    .line 962
    .line 963
    invoke-virtual {v6}, LY4/b;->f()I

    .line 964
    .line 965
    .line 966
    move-result v1

    .line 967
    iput v1, v3, LG5/c;->b:I

    .line 968
    .line 969
    iput v8, v3, LG5/c;->c:I

    .line 970
    .line 971
    iget v1, v3, LG5/c;->a:I

    .line 972
    .line 973
    if-ne v1, v13, :cond_30

    .line 974
    .line 975
    invoke-virtual {v6}, LY4/b;->f()I

    .line 976
    .line 977
    .line 978
    move-result v1

    .line 979
    iput v1, v3, LG5/c;->c:I

    .line 980
    .line 981
    if-ne v1, v10, :cond_2f

    .line 982
    .line 983
    iget v1, v3, LG5/c;->b:I

    .line 984
    .line 985
    iput v1, v0, LL5/b;->j:I

    .line 986
    .line 987
    const/4 v3, 0x2

    .line 988
    iput v3, v0, LL5/b;->c:I

    .line 989
    .line 990
    return v8

    .line 991
    :cond_2f
    new-instance v1, Ljava/lang/StringBuilder;

    .line 992
    .line 993
    const-string v2, "hdrl expected, found: "

    .line 994
    .line 995
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 996
    .line 997
    .line 998
    iget v2, v3, LG5/c;->c:I

    .line 999
    .line 1000
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v1

    .line 1007
    const/4 v2, 0x0

    .line 1008
    invoke-static {v1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v1

    .line 1012
    throw v1

    .line 1013
    :cond_30
    const/4 v2, 0x0

    .line 1014
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1015
    .line 1016
    const-string v4, "LIST expected, found: "

    .line 1017
    .line 1018
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1019
    .line 1020
    .line 1021
    iget v3, v3, LG5/c;->a:I

    .line 1022
    .line 1023
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1024
    .line 1025
    .line 1026
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v1

    .line 1030
    invoke-static {v1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v1

    .line 1034
    throw v1

    .line 1035
    :pswitch_6
    move-object v2, v9

    .line 1036
    invoke-virtual/range {p0 .. p1}, LL5/b;->i(LJ5/l;)Z

    .line 1037
    .line 1038
    .line 1039
    move-result v3

    .line 1040
    if-eqz v3, :cond_31

    .line 1041
    .line 1042
    check-cast v1, LJ5/h;

    .line 1043
    .line 1044
    invoke-virtual {v1, v4}, LJ5/h;->j(I)V

    .line 1045
    .line 1046
    .line 1047
    iput v7, v0, LL5/b;->c:I

    .line 1048
    .line 1049
    const/16 v21, 0x0

    .line 1050
    .line 1051
    return v21

    .line 1052
    :cond_31
    const-string v1, "AVI Header List not found"

    .line 1053
    .line 1054
    invoke-static {v1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v1

    .line 1058
    throw v1

    .line 1059
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Lf6/N;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LL5/b;->c:I

    .line 3
    .line 4
    iput-object p1, p0, LL5/b;->d:LJ5/m;

    .line 5
    .line 6
    const-wide/16 v0, -0x1

    .line 7
    .line 8
    iput-wide v0, p0, LL5/b;->h:J

    .line 9
    .line 10
    return-void
.end method

.method public final i(LJ5/l;)Z
    .locals 4

    .line 1
    iget-object v0, p0, LL5/b;->a:LY4/b;

    .line 2
    .line 3
    iget-object v1, v0, LY4/b;->a:[B

    .line 4
    .line 5
    check-cast p1, LJ5/h;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/16 v3, 0xc

    .line 9
    .line 10
    invoke-virtual {p1, v1, v2, v3, v2}, LJ5/h;->c([BIIZ)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v2}, LY4/b;->A(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, LY4/b;->f()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const v1, 0x46464952

    .line 21
    .line 22
    .line 23
    if-eq p1, v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x4

    .line 27
    invoke-virtual {v0, p1}, LY4/b;->B(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, LY4/b;->f()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    const v0, 0x20495641

    .line 35
    .line 36
    .line 37
    if-ne p1, v0, :cond_1

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_1
    :goto_0
    return v2
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
