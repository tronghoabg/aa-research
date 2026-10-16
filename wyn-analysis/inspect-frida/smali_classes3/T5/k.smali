.class public final LT5/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/f;


# static fields
.field public static final l:[F


# instance fields
.field public final a:LS3/e;

.field public final b:LY4/b;

.field public final c:[Z

.field public final d:LT5/i;

.field public final e:LT5/s;

.field public f:LT5/j;

.field public g:J

.field public h:Ljava/lang/String;

.field public i:LJ5/w;

.field public j:Z

.field public k:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, LT5/k;->l:[F

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(LS3/e;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT5/k;->a:LS3/e;

    .line 5
    .line 6
    const/4 p1, 0x4

    .line 7
    new-array p1, p1, [Z

    .line 8
    .line 9
    iput-object p1, p0, LT5/k;->c:[Z

    .line 10
    .line 11
    new-instance p1, LT5/i;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/16 v0, 0x80

    .line 17
    .line 18
    new-array v0, v0, [B

    .line 19
    .line 20
    iput-object v0, p1, LT5/i;->e:[B

    .line 21
    .line 22
    iput-object p1, p0, LT5/k;->d:LT5/i;

    .line 23
    .line 24
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    iput-wide v0, p0, LT5/k;->k:J

    .line 30
    .line 31
    new-instance p1, LT5/s;

    .line 32
    .line 33
    const/16 v0, 0xb2

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-direct {p1, v0, v1}, LT5/s;-><init>(II)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, LT5/k;->e:LT5/s;

    .line 40
    .line 41
    new-instance p1, LY4/b;

    .line 42
    .line 43
    invoke-direct {p1}, LY4/b;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, LT5/k;->b:LY4/b;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, LT5/k;->c:[Z

    .line 2
    .line 3
    invoke-static {v0}, Lu6/a;->l([Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LT5/k;->d:LT5/i;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-boolean v1, v0, LT5/i;->a:Z

    .line 10
    .line 11
    iput v1, v0, LT5/i;->c:I

    .line 12
    .line 13
    iput v1, v0, LT5/i;->b:I

    .line 14
    .line 15
    iget-object v0, p0, LT5/k;->f:LT5/j;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iput-boolean v1, v0, LT5/j;->b:Z

    .line 20
    .line 21
    iput-boolean v1, v0, LT5/j;->c:Z

    .line 22
    .line 23
    iput-boolean v1, v0, LT5/j;->d:Z

    .line 24
    .line 25
    const/4 v1, -0x1

    .line 26
    iput v1, v0, LT5/j;->e:I

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, LT5/k;->e:LT5/s;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, LT5/s;->d()V

    .line 33
    .line 34
    .line 35
    :cond_1
    const-wide/16 v0, 0x0

    .line 36
    .line 37
    iput-wide v0, p0, LT5/k;->g:J

    .line 38
    .line 39
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    iput-wide v0, p0, LT5/k;->k:J

    .line 45
    .line 46
    return-void
.end method

.method public final c(LY4/b;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v4, 0x3

    .line 6
    const/4 v5, 0x1

    .line 7
    iget-object v6, v0, LT5/k;->f:LT5/j;

    .line 8
    .line 9
    invoke-static {v6}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v6, v0, LT5/k;->i:LJ5/w;

    .line 13
    .line 14
    invoke-static {v6}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget v6, v1, LY4/b;->b:I

    .line 18
    .line 19
    iget v7, v1, LY4/b;->c:I

    .line 20
    .line 21
    iget-object v8, v1, LY4/b;->a:[B

    .line 22
    .line 23
    iget-wide v9, v0, LT5/k;->g:J

    .line 24
    .line 25
    invoke-virtual {v1}, LY4/b;->a()I

    .line 26
    .line 27
    .line 28
    move-result v11

    .line 29
    int-to-long v11, v11

    .line 30
    add-long/2addr v9, v11

    .line 31
    iput-wide v9, v0, LT5/k;->g:J

    .line 32
    .line 33
    iget-object v9, v0, LT5/k;->i:LJ5/w;

    .line 34
    .line 35
    invoke-virtual {v1}, LY4/b;->a()I

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    invoke-interface {v9, v10, v1}, LJ5/w;->c(ILY4/b;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object v9, v0, LT5/k;->c:[Z

    .line 43
    .line 44
    invoke-static {v8, v6, v7, v9}, Lu6/a;->r([BII[Z)I

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    iget-object v10, v0, LT5/k;->d:LT5/i;

    .line 49
    .line 50
    iget-object v11, v0, LT5/k;->e:LT5/s;

    .line 51
    .line 52
    if-ne v9, v7, :cond_2

    .line 53
    .line 54
    iget-boolean v1, v0, LT5/k;->j:Z

    .line 55
    .line 56
    if-nez v1, :cond_0

    .line 57
    .line 58
    invoke-virtual {v10, v6, v7, v8}, LT5/i;->a(II[B)V

    .line 59
    .line 60
    .line 61
    :cond_0
    iget-object v1, v0, LT5/k;->f:LT5/j;

    .line 62
    .line 63
    invoke-virtual {v1, v6, v7, v8}, LT5/j;->a(II[B)V

    .line 64
    .line 65
    .line 66
    if-eqz v11, :cond_1

    .line 67
    .line 68
    invoke-virtual {v11, v6, v7, v8}, LT5/s;->a(II[B)V

    .line 69
    .line 70
    .line 71
    :cond_1
    return-void

    .line 72
    :cond_2
    iget-object v12, v1, LY4/b;->a:[B

    .line 73
    .line 74
    add-int/lit8 v13, v9, 0x3

    .line 75
    .line 76
    aget-byte v12, v12, v13

    .line 77
    .line 78
    and-int/lit16 v14, v12, 0xff

    .line 79
    .line 80
    sub-int v15, v9, v6

    .line 81
    .line 82
    iget-boolean v3, v0, LT5/k;->j:Z

    .line 83
    .line 84
    if-nez v3, :cond_19

    .line 85
    .line 86
    if-lez v15, :cond_3

    .line 87
    .line 88
    invoke-virtual {v10, v6, v9, v8}, LT5/i;->a(II[B)V

    .line 89
    .line 90
    .line 91
    :cond_3
    if-gez v15, :cond_4

    .line 92
    .line 93
    neg-int v3, v15

    .line 94
    goto :goto_1

    .line 95
    :cond_4
    const/4 v3, 0x0

    .line 96
    :goto_1
    iget v4, v10, LT5/i;->b:I

    .line 97
    .line 98
    if-eqz v4, :cond_17

    .line 99
    .line 100
    const-string v2, "H263Reader"

    .line 101
    .line 102
    move/from16 v17, v3

    .line 103
    .line 104
    const-string v3, "Unexpected start code value"

    .line 105
    .line 106
    if-eq v4, v5, :cond_15

    .line 107
    .line 108
    const/4 v5, 0x2

    .line 109
    if-eq v4, v5, :cond_13

    .line 110
    .line 111
    const/4 v5, 0x4

    .line 112
    move/from16 v20, v7

    .line 113
    .line 114
    const/4 v7, 0x3

    .line 115
    if-eq v4, v7, :cond_11

    .line 116
    .line 117
    if-ne v4, v5, :cond_10

    .line 118
    .line 119
    const/16 v3, 0xb3

    .line 120
    .line 121
    if-eq v14, v3, :cond_6

    .line 122
    .line 123
    const/16 v3, 0xb5

    .line 124
    .line 125
    if-ne v14, v3, :cond_5

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_5
    move/from16 v18, v13

    .line 129
    .line 130
    goto/16 :goto_8

    .line 131
    .line 132
    :cond_6
    :goto_2
    iget v3, v10, LT5/i;->c:I

    .line 133
    .line 134
    sub-int v3, v3, v17

    .line 135
    .line 136
    iput v3, v10, LT5/i;->c:I

    .line 137
    .line 138
    const/4 v3, 0x0

    .line 139
    iput-boolean v3, v10, LT5/i;->a:Z

    .line 140
    .line 141
    iget-object v3, v0, LT5/k;->i:LJ5/w;

    .line 142
    .line 143
    iget v4, v10, LT5/i;->d:I

    .line 144
    .line 145
    iget-object v7, v0, LT5/k;->h:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget-object v12, v10, LT5/i;->e:[B

    .line 151
    .line 152
    iget v10, v10, LT5/i;->c:I

    .line 153
    .line 154
    invoke-static {v12, v10}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 155
    .line 156
    .line 157
    move-result-object v10

    .line 158
    new-instance v12, LJ5/y;

    .line 159
    .line 160
    array-length v5, v10

    .line 161
    move/from16 v18, v13

    .line 162
    .line 163
    const/4 v13, 0x6

    .line 164
    const/4 v1, 0x0

    .line 165
    invoke-direct {v12, v10, v5, v13, v1}, LJ5/y;-><init>([BIIB)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12, v4}, LJ5/y;->u(I)V

    .line 169
    .line 170
    .line 171
    const/4 v1, 0x4

    .line 172
    invoke-virtual {v12, v1}, LJ5/y;->u(I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v12}, LJ5/y;->s()V

    .line 176
    .line 177
    .line 178
    const/16 v4, 0x8

    .line 179
    .line 180
    invoke-virtual {v12, v4}, LJ5/y;->t(I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12}, LJ5/y;->h()Z

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    if-eqz v5, :cond_7

    .line 188
    .line 189
    invoke-virtual {v12, v1}, LJ5/y;->t(I)V

    .line 190
    .line 191
    .line 192
    const/4 v5, 0x3

    .line 193
    invoke-virtual {v12, v5}, LJ5/y;->t(I)V

    .line 194
    .line 195
    .line 196
    :cond_7
    invoke-virtual {v12, v1}, LJ5/y;->i(I)I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    const-string v13, "Invalid aspect ratio"

    .line 201
    .line 202
    const/16 v5, 0xf

    .line 203
    .line 204
    if-ne v1, v5, :cond_9

    .line 205
    .line 206
    invoke-virtual {v12, v4}, LJ5/y;->i(I)I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    invoke-virtual {v12, v4}, LJ5/y;->i(I)I

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    if-nez v4, :cond_8

    .line 215
    .line 216
    invoke-static {v2, v13}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_8
    int-to-float v1, v1

    .line 221
    int-to-float v4, v4

    .line 222
    div-float/2addr v1, v4

    .line 223
    goto :goto_4

    .line 224
    :cond_9
    const/4 v4, 0x7

    .line 225
    if-ge v1, v4, :cond_a

    .line 226
    .line 227
    sget-object v4, LT5/k;->l:[F

    .line 228
    .line 229
    aget v1, v4, v1

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_a
    invoke-static {v2, v13}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    :goto_3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 236
    .line 237
    :goto_4
    invoke-virtual {v12}, LJ5/y;->h()Z

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    if-eqz v4, :cond_b

    .line 242
    .line 243
    const/4 v4, 0x2

    .line 244
    invoke-virtual {v12, v4}, LJ5/y;->t(I)V

    .line 245
    .line 246
    .line 247
    const/4 v4, 0x1

    .line 248
    invoke-virtual {v12, v4}, LJ5/y;->t(I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12}, LJ5/y;->h()Z

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    if-eqz v4, :cond_b

    .line 256
    .line 257
    invoke-virtual {v12, v5}, LJ5/y;->t(I)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12}, LJ5/y;->s()V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v12, v5}, LJ5/y;->t(I)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12}, LJ5/y;->s()V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v5}, LJ5/y;->t(I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12}, LJ5/y;->s()V

    .line 273
    .line 274
    .line 275
    const/4 v4, 0x3

    .line 276
    invoke-virtual {v12, v4}, LJ5/y;->t(I)V

    .line 277
    .line 278
    .line 279
    const/16 v4, 0xb

    .line 280
    .line 281
    invoke-virtual {v12, v4}, LJ5/y;->t(I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12}, LJ5/y;->s()V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v5}, LJ5/y;->t(I)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12}, LJ5/y;->s()V

    .line 291
    .line 292
    .line 293
    :cond_b
    const/4 v4, 0x2

    .line 294
    invoke-virtual {v12, v4}, LJ5/y;->i(I)I

    .line 295
    .line 296
    .line 297
    move-result v5

    .line 298
    if-eqz v5, :cond_c

    .line 299
    .line 300
    const-string v4, "Unhandled video object layer shape"

    .line 301
    .line 302
    invoke-static {v2, v4}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    :cond_c
    invoke-virtual {v12}, LJ5/y;->s()V

    .line 306
    .line 307
    .line 308
    const/16 v4, 0x10

    .line 309
    .line 310
    invoke-virtual {v12, v4}, LJ5/y;->i(I)I

    .line 311
    .line 312
    .line 313
    move-result v4

    .line 314
    invoke-virtual {v12}, LJ5/y;->s()V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12}, LJ5/y;->h()Z

    .line 318
    .line 319
    .line 320
    move-result v5

    .line 321
    if-eqz v5, :cond_f

    .line 322
    .line 323
    if-nez v4, :cond_d

    .line 324
    .line 325
    const-string v4, "Invalid vop_increment_time_resolution"

    .line 326
    .line 327
    invoke-static {v2, v4}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    goto :goto_6

    .line 331
    :cond_d
    add-int/lit8 v4, v4, -0x1

    .line 332
    .line 333
    const/4 v2, 0x0

    .line 334
    :goto_5
    if-lez v4, :cond_e

    .line 335
    .line 336
    const/16 v19, 0x1

    .line 337
    .line 338
    add-int/lit8 v2, v2, 0x1

    .line 339
    .line 340
    shr-int/lit8 v4, v4, 0x1

    .line 341
    .line 342
    goto :goto_5

    .line 343
    :cond_e
    invoke-virtual {v12, v2}, LJ5/y;->t(I)V

    .line 344
    .line 345
    .line 346
    :cond_f
    :goto_6
    invoke-virtual {v12}, LJ5/y;->s()V

    .line 347
    .line 348
    .line 349
    const/16 v2, 0xd

    .line 350
    .line 351
    invoke-virtual {v12, v2}, LJ5/y;->i(I)I

    .line 352
    .line 353
    .line 354
    move-result v4

    .line 355
    invoke-virtual {v12}, LJ5/y;->s()V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v2}, LJ5/y;->i(I)I

    .line 359
    .line 360
    .line 361
    move-result v2

    .line 362
    invoke-virtual {v12}, LJ5/y;->s()V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12}, LJ5/y;->s()V

    .line 366
    .line 367
    .line 368
    new-instance v5, LE5/S;

    .line 369
    .line 370
    invoke-direct {v5}, LE5/S;-><init>()V

    .line 371
    .line 372
    .line 373
    iput-object v7, v5, LE5/S;->a:Ljava/lang/String;

    .line 374
    .line 375
    const-string v7, "video/mp4v-es"

    .line 376
    .line 377
    iput-object v7, v5, LE5/S;->k:Ljava/lang/String;

    .line 378
    .line 379
    iput v4, v5, LE5/S;->p:I

    .line 380
    .line 381
    iput v2, v5, LE5/S;->q:I

    .line 382
    .line 383
    iput v1, v5, LE5/S;->t:F

    .line 384
    .line 385
    invoke-static {v10}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    iput-object v1, v5, LE5/S;->m:Ljava/util/List;

    .line 390
    .line 391
    new-instance v1, LE5/T;

    .line 392
    .line 393
    invoke-direct {v1, v5}, LE5/T;-><init>(LE5/S;)V

    .line 394
    .line 395
    .line 396
    invoke-interface {v3, v1}, LJ5/w;->a(LE5/T;)V

    .line 397
    .line 398
    .line 399
    const/4 v4, 0x1

    .line 400
    iput-boolean v4, v0, LT5/k;->j:Z

    .line 401
    .line 402
    :goto_7
    const/4 v4, 0x3

    .line 403
    goto/16 :goto_9

    .line 404
    .line 405
    :cond_10
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 406
    .line 407
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 408
    .line 409
    .line 410
    throw v1

    .line 411
    :cond_11
    move/from16 v18, v13

    .line 412
    .line 413
    and-int/lit16 v1, v12, 0xf0

    .line 414
    .line 415
    const/16 v4, 0x20

    .line 416
    .line 417
    if-eq v1, v4, :cond_12

    .line 418
    .line 419
    invoke-static {v2, v3}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    const/4 v1, 0x0

    .line 423
    iput-boolean v1, v10, LT5/i;->a:Z

    .line 424
    .line 425
    iput v1, v10, LT5/i;->c:I

    .line 426
    .line 427
    iput v1, v10, LT5/i;->b:I

    .line 428
    .line 429
    goto :goto_8

    .line 430
    :cond_12
    const/4 v1, 0x0

    .line 431
    iget v2, v10, LT5/i;->c:I

    .line 432
    .line 433
    iput v2, v10, LT5/i;->d:I

    .line 434
    .line 435
    const/4 v2, 0x4

    .line 436
    iput v2, v10, LT5/i;->b:I

    .line 437
    .line 438
    goto :goto_8

    .line 439
    :cond_13
    move/from16 v20, v7

    .line 440
    .line 441
    move/from16 v18, v13

    .line 442
    .line 443
    const/4 v1, 0x0

    .line 444
    const/16 v4, 0x1f

    .line 445
    .line 446
    if-le v14, v4, :cond_14

    .line 447
    .line 448
    invoke-static {v2, v3}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    iput-boolean v1, v10, LT5/i;->a:Z

    .line 452
    .line 453
    iput v1, v10, LT5/i;->c:I

    .line 454
    .line 455
    iput v1, v10, LT5/i;->b:I

    .line 456
    .line 457
    goto :goto_8

    .line 458
    :cond_14
    const/4 v4, 0x3

    .line 459
    iput v4, v10, LT5/i;->b:I

    .line 460
    .line 461
    goto :goto_8

    .line 462
    :cond_15
    move/from16 v20, v7

    .line 463
    .line 464
    move/from16 v18, v13

    .line 465
    .line 466
    const/4 v1, 0x0

    .line 467
    const/16 v4, 0xb5

    .line 468
    .line 469
    if-eq v14, v4, :cond_16

    .line 470
    .line 471
    invoke-static {v2, v3}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    iput-boolean v1, v10, LT5/i;->a:Z

    .line 475
    .line 476
    iput v1, v10, LT5/i;->c:I

    .line 477
    .line 478
    iput v1, v10, LT5/i;->b:I

    .line 479
    .line 480
    goto :goto_8

    .line 481
    :cond_16
    const/4 v4, 0x2

    .line 482
    iput v4, v10, LT5/i;->b:I

    .line 483
    .line 484
    goto :goto_8

    .line 485
    :cond_17
    move/from16 v20, v7

    .line 486
    .line 487
    move/from16 v18, v13

    .line 488
    .line 489
    const/16 v1, 0xb0

    .line 490
    .line 491
    if-ne v14, v1, :cond_18

    .line 492
    .line 493
    const/4 v4, 0x1

    .line 494
    iput v4, v10, LT5/i;->b:I

    .line 495
    .line 496
    iput-boolean v4, v10, LT5/i;->a:Z

    .line 497
    .line 498
    :cond_18
    :goto_8
    sget-object v1, LT5/i;->f:[B

    .line 499
    .line 500
    const/4 v3, 0x0

    .line 501
    const/4 v4, 0x3

    .line 502
    invoke-virtual {v10, v3, v4, v1}, LT5/i;->a(II[B)V

    .line 503
    .line 504
    .line 505
    goto :goto_9

    .line 506
    :cond_19
    move/from16 v20, v7

    .line 507
    .line 508
    move/from16 v18, v13

    .line 509
    .line 510
    goto :goto_7

    .line 511
    :goto_9
    iget-object v1, v0, LT5/k;->f:LT5/j;

    .line 512
    .line 513
    invoke-virtual {v1, v6, v9, v8}, LT5/j;->a(II[B)V

    .line 514
    .line 515
    .line 516
    if-eqz v11, :cond_1c

    .line 517
    .line 518
    if-lez v15, :cond_1a

    .line 519
    .line 520
    invoke-virtual {v11, v6, v9, v8}, LT5/s;->a(II[B)V

    .line 521
    .line 522
    .line 523
    const/4 v1, 0x0

    .line 524
    goto :goto_a

    .line 525
    :cond_1a
    neg-int v1, v15

    .line 526
    :goto_a
    invoke-virtual {v11, v1}, LT5/s;->b(I)Z

    .line 527
    .line 528
    .line 529
    move-result v1

    .line 530
    if-eqz v1, :cond_1b

    .line 531
    .line 532
    iget-object v1, v11, LT5/s;->e:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v1, [B

    .line 535
    .line 536
    iget v2, v11, LT5/s;->f:I

    .line 537
    .line 538
    invoke-static {v2, v1}, Lu6/a;->C(I[B)I

    .line 539
    .line 540
    .line 541
    move-result v1

    .line 542
    sget v2, Lu6/v;->a:I

    .line 543
    .line 544
    iget-object v2, v11, LT5/s;->e:Ljava/lang/Object;

    .line 545
    .line 546
    check-cast v2, [B

    .line 547
    .line 548
    iget-object v3, v0, LT5/k;->b:LY4/b;

    .line 549
    .line 550
    invoke-virtual {v3, v1, v2}, LY4/b;->y(I[B)V

    .line 551
    .line 552
    .line 553
    iget-wide v1, v0, LT5/k;->k:J

    .line 554
    .line 555
    iget-object v5, v0, LT5/k;->a:LS3/e;

    .line 556
    .line 557
    invoke-virtual {v5, v1, v2, v3}, LS3/e;->k(JLY4/b;)V

    .line 558
    .line 559
    .line 560
    :cond_1b
    const/16 v1, 0xb2

    .line 561
    .line 562
    if-ne v14, v1, :cond_1c

    .line 563
    .line 564
    move-object/from16 v1, p1

    .line 565
    .line 566
    iget-object v2, v1, LY4/b;->a:[B

    .line 567
    .line 568
    const/16 v16, 0x2

    .line 569
    .line 570
    add-int/lit8 v3, v9, 0x2

    .line 571
    .line 572
    aget-byte v2, v2, v3

    .line 573
    .line 574
    const/4 v3, 0x1

    .line 575
    if-ne v2, v3, :cond_1d

    .line 576
    .line 577
    invoke-virtual {v11, v14}, LT5/s;->e(I)V

    .line 578
    .line 579
    .line 580
    goto :goto_b

    .line 581
    :cond_1c
    move-object/from16 v1, p1

    .line 582
    .line 583
    const/4 v3, 0x1

    .line 584
    const/16 v16, 0x2

    .line 585
    .line 586
    :cond_1d
    :goto_b
    sub-int v7, v20, v9

    .line 587
    .line 588
    iget-wide v5, v0, LT5/k;->g:J

    .line 589
    .line 590
    int-to-long v9, v7

    .line 591
    sub-long/2addr v5, v9

    .line 592
    iget-object v2, v0, LT5/k;->f:LT5/j;

    .line 593
    .line 594
    iget-boolean v9, v0, LT5/k;->j:Z

    .line 595
    .line 596
    iget v10, v2, LT5/j;->e:I

    .line 597
    .line 598
    const/16 v11, 0xb6

    .line 599
    .line 600
    if-ne v10, v11, :cond_1e

    .line 601
    .line 602
    if-eqz v9, :cond_1e

    .line 603
    .line 604
    iget-boolean v9, v2, LT5/j;->b:Z

    .line 605
    .line 606
    if-eqz v9, :cond_1e

    .line 607
    .line 608
    iget-wide v9, v2, LT5/j;->h:J

    .line 609
    .line 610
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    cmp-long v12, v9, v12

    .line 616
    .line 617
    if-eqz v12, :cond_1e

    .line 618
    .line 619
    iget-wide v12, v2, LT5/j;->g:J

    .line 620
    .line 621
    sub-long v12, v5, v12

    .line 622
    .line 623
    long-to-int v12, v12

    .line 624
    iget-boolean v13, v2, LT5/j;->d:Z

    .line 625
    .line 626
    iget-object v15, v2, LT5/j;->i:Ljava/lang/Object;

    .line 627
    .line 628
    move-object/from16 v21, v15

    .line 629
    .line 630
    check-cast v21, LJ5/w;

    .line 631
    .line 632
    const/16 v27, 0x0

    .line 633
    .line 634
    move/from16 v26, v7

    .line 635
    .line 636
    move-wide/from16 v22, v9

    .line 637
    .line 638
    move/from16 v25, v12

    .line 639
    .line 640
    move/from16 v24, v13

    .line 641
    .line 642
    invoke-interface/range {v21 .. v27}, LJ5/w;->b(JIIILJ5/v;)V

    .line 643
    .line 644
    .line 645
    :cond_1e
    iget v7, v2, LT5/j;->e:I

    .line 646
    .line 647
    const/16 v9, 0xb3

    .line 648
    .line 649
    if-eq v7, v9, :cond_1f

    .line 650
    .line 651
    iput-wide v5, v2, LT5/j;->g:J

    .line 652
    .line 653
    :cond_1f
    iget-object v2, v0, LT5/k;->f:LT5/j;

    .line 654
    .line 655
    iget-wide v5, v0, LT5/k;->k:J

    .line 656
    .line 657
    iput v14, v2, LT5/j;->e:I

    .line 658
    .line 659
    const/4 v7, 0x0

    .line 660
    iput-boolean v7, v2, LT5/j;->d:Z

    .line 661
    .line 662
    if-eq v14, v11, :cond_21

    .line 663
    .line 664
    if-ne v14, v9, :cond_20

    .line 665
    .line 666
    goto :goto_c

    .line 667
    :cond_20
    const/4 v7, 0x0

    .line 668
    goto :goto_d

    .line 669
    :cond_21
    :goto_c
    move v7, v3

    .line 670
    :goto_d
    iput-boolean v7, v2, LT5/j;->b:Z

    .line 671
    .line 672
    if-ne v14, v11, :cond_22

    .line 673
    .line 674
    move v7, v3

    .line 675
    goto :goto_e

    .line 676
    :cond_22
    const/4 v7, 0x0

    .line 677
    :goto_e
    iput-boolean v7, v2, LT5/j;->c:Z

    .line 678
    .line 679
    const/4 v7, 0x0

    .line 680
    iput v7, v2, LT5/j;->f:I

    .line 681
    .line 682
    iput-wide v5, v2, LT5/j;->h:J

    .line 683
    .line 684
    move v5, v3

    .line 685
    move/from16 v6, v18

    .line 686
    .line 687
    move/from16 v7, v20

    .line 688
    .line 689
    goto/16 :goto_0
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
    iput-wide p2, p0, LT5/k;->k:J

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final g(LJ5/m;LT5/B;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, LT5/B;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, LT5/B;->b()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, LT5/B;->f:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, LT5/k;->h:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, LT5/B;->b()V

    .line 12
    .line 13
    .line 14
    iget v0, p2, LT5/B;->e:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-interface {p1, v0, v1}, LJ5/m;->m(II)LJ5/w;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, LT5/k;->i:LJ5/w;

    .line 22
    .line 23
    new-instance v1, LT5/j;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v1, v0, v2}, LT5/j;-><init>(Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, LT5/k;->f:LT5/j;

    .line 30
    .line 31
    iget-object v0, p0, LT5/k;->a:LS3/e;

    .line 32
    .line 33
    invoke-virtual {v0, p1, p2}, LS3/e;->m(LJ5/m;LT5/B;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final i()V
    .locals 0

    .line 1
    return-void
.end method
