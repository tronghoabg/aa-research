.class public final LY2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY2/h;


# static fields
.field public static final l:[F


# instance fields
.field public final a:LY2/B;

.field public final b:LQ1/o;

.field public final c:[Z

.field public final d:LY2/k;

.field public final e:LT5/s;

.field public f:LT5/j;

.field public g:J

.field public h:Ljava/lang/String;

.field public i:Ls2/C;

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
    sput-object v0, LY2/l;->l:[F

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

.method public constructor <init>(LY2/B;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY2/l;->a:LY2/B;

    .line 5
    .line 6
    const/4 p1, 0x4

    .line 7
    new-array p1, p1, [Z

    .line 8
    .line 9
    iput-object p1, p0, LY2/l;->c:[Z

    .line 10
    .line 11
    new-instance p1, LY2/k;

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
    iput-object v0, p1, LY2/k;->e:[B

    .line 21
    .line 22
    iput-object p1, p0, LY2/l;->d:LY2/k;

    .line 23
    .line 24
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    iput-wide v0, p0, LY2/l;->k:J

    .line 30
    .line 31
    new-instance p1, LT5/s;

    .line 32
    .line 33
    const/16 v0, 0xb2

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-direct {p1, v0, v1}, LT5/s;-><init>(II)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, LY2/l;->e:LT5/s;

    .line 40
    .line 41
    new-instance p1, LQ1/o;

    .line 42
    .line 43
    invoke-direct {p1}, LQ1/o;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, LY2/l;->b:LQ1/o;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, LY2/l;->c:[Z

    .line 2
    .line 3
    invoke-static {v0}, LR1/n;->a([Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY2/l;->d:LY2/k;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-boolean v1, v0, LY2/k;->a:Z

    .line 10
    .line 11
    iput v1, v0, LY2/k;->c:I

    .line 12
    .line 13
    iput v1, v0, LY2/k;->b:I

    .line 14
    .line 15
    iget-object v0, p0, LY2/l;->f:LT5/j;

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
    iget-object v0, p0, LY2/l;->e:LT5/s;

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
    iput-wide v0, p0, LY2/l;->g:J

    .line 38
    .line 39
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    iput-wide v0, p0, LY2/l;->k:J

    .line 45
    .line 46
    return-void
.end method

.method public final d(IJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, LY2/l;->k:J

    .line 2
    .line 3
    return-void
.end method

.method public final e(LQ1/o;)V
    .locals 21

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
    iget-object v6, v0, LY2/l;->f:LT5/j;

    .line 8
    .line 9
    invoke-static {v6}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v6, v0, LY2/l;->i:Ls2/C;

    .line 13
    .line 14
    invoke-static {v6}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget v6, v1, LQ1/o;->b:I

    .line 18
    .line 19
    iget v7, v1, LQ1/o;->c:I

    .line 20
    .line 21
    iget-object v8, v1, LQ1/o;->a:[B

    .line 22
    .line 23
    iget-wide v9, v0, LY2/l;->g:J

    .line 24
    .line 25
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 26
    .line 27
    .line 28
    move-result v11

    .line 29
    int-to-long v11, v11

    .line 30
    add-long/2addr v9, v11

    .line 31
    iput-wide v9, v0, LY2/l;->g:J

    .line 32
    .line 33
    iget-object v9, v0, LY2/l;->i:Ls2/C;

    .line 34
    .line 35
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    invoke-interface {v9, v10, v1}, Ls2/C;->e(ILQ1/o;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object v9, v0, LY2/l;->c:[Z

    .line 43
    .line 44
    invoke-static {v8, v6, v7, v9}, LR1/n;->b([BII[Z)I

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    iget-object v10, v0, LY2/l;->d:LY2/k;

    .line 49
    .line 50
    iget-object v11, v0, LY2/l;->e:LT5/s;

    .line 51
    .line 52
    if-ne v9, v7, :cond_2

    .line 53
    .line 54
    iget-boolean v1, v0, LY2/l;->j:Z

    .line 55
    .line 56
    if-nez v1, :cond_0

    .line 57
    .line 58
    invoke-virtual {v10, v6, v7, v8}, LY2/k;->a(II[B)V

    .line 59
    .line 60
    .line 61
    :cond_0
    iget-object v1, v0, LY2/l;->f:LT5/j;

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
    iget-object v12, v1, LQ1/o;->a:[B

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
    iget-boolean v3, v0, LY2/l;->j:Z

    .line 83
    .line 84
    if-nez v3, :cond_19

    .line 85
    .line 86
    if-lez v15, :cond_3

    .line 87
    .line 88
    invoke-virtual {v10, v6, v9, v8}, LY2/k;->a(II[B)V

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
    iget v4, v10, LY2/k;->b:I

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
    iget v3, v10, LY2/k;->c:I

    .line 133
    .line 134
    sub-int v3, v3, v17

    .line 135
    .line 136
    iput v3, v10, LY2/k;->c:I

    .line 137
    .line 138
    const/4 v3, 0x0

    .line 139
    iput-boolean v3, v10, LY2/k;->a:Z

    .line 140
    .line 141
    iget-object v3, v0, LY2/l;->i:Ls2/C;

    .line 142
    .line 143
    iget v4, v10, LY2/k;->d:I

    .line 144
    .line 145
    iget-object v7, v0, LY2/l;->h:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget-object v12, v10, LY2/k;->e:[B

    .line 151
    .line 152
    iget v10, v10, LY2/k;->c:I

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
    const/4 v1, 0x0

    .line 164
    const/4 v13, 0x1

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
    invoke-static {v2, v13}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

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
    sget-object v4, LY2/l;->l:[F

    .line 228
    .line 229
    aget v1, v4, v1

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_a
    invoke-static {v2, v13}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

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
    const/4 v13, 0x1

    .line 248
    invoke-virtual {v12, v13}, LJ5/y;->t(I)V

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
    invoke-static {v2, v4}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

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
    invoke-static {v2, v4}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

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
    new-instance v5, LN1/m;

    .line 369
    .line 370
    invoke-direct {v5}, LN1/m;-><init>()V

    .line 371
    .line 372
    .line 373
    iput-object v7, v5, LN1/m;->a:Ljava/lang/String;

    .line 374
    .line 375
    const-string v7, "video/mp4v-es"

    .line 376
    .line 377
    invoke-static {v7}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    iput-object v7, v5, LN1/m;->m:Ljava/lang/String;

    .line 382
    .line 383
    iput v4, v5, LN1/m;->t:I

    .line 384
    .line 385
    iput v2, v5, LN1/m;->u:I

    .line 386
    .line 387
    iput v1, v5, LN1/m;->x:F

    .line 388
    .line 389
    invoke-static {v10}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    iput-object v1, v5, LN1/m;->p:Ljava/util/List;

    .line 394
    .line 395
    invoke-static {v5, v3}, LVa/M6;->y(LN1/m;Ls2/C;)V

    .line 396
    .line 397
    .line 398
    const/4 v13, 0x1

    .line 399
    iput-boolean v13, v0, LY2/l;->j:Z

    .line 400
    .line 401
    :goto_7
    const/4 v4, 0x3

    .line 402
    goto/16 :goto_9

    .line 403
    .line 404
    :cond_10
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 405
    .line 406
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 407
    .line 408
    .line 409
    throw v1

    .line 410
    :cond_11
    move/from16 v18, v13

    .line 411
    .line 412
    and-int/lit16 v1, v12, 0xf0

    .line 413
    .line 414
    const/16 v4, 0x20

    .line 415
    .line 416
    if-eq v1, v4, :cond_12

    .line 417
    .line 418
    invoke-static {v2, v3}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    const/4 v1, 0x0

    .line 422
    iput-boolean v1, v10, LY2/k;->a:Z

    .line 423
    .line 424
    iput v1, v10, LY2/k;->c:I

    .line 425
    .line 426
    iput v1, v10, LY2/k;->b:I

    .line 427
    .line 428
    goto :goto_8

    .line 429
    :cond_12
    const/4 v1, 0x0

    .line 430
    iget v2, v10, LY2/k;->c:I

    .line 431
    .line 432
    iput v2, v10, LY2/k;->d:I

    .line 433
    .line 434
    const/4 v2, 0x4

    .line 435
    iput v2, v10, LY2/k;->b:I

    .line 436
    .line 437
    goto :goto_8

    .line 438
    :cond_13
    move/from16 v20, v7

    .line 439
    .line 440
    move/from16 v18, v13

    .line 441
    .line 442
    const/4 v1, 0x0

    .line 443
    const/16 v4, 0x1f

    .line 444
    .line 445
    if-le v14, v4, :cond_14

    .line 446
    .line 447
    invoke-static {v2, v3}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    iput-boolean v1, v10, LY2/k;->a:Z

    .line 451
    .line 452
    iput v1, v10, LY2/k;->c:I

    .line 453
    .line 454
    iput v1, v10, LY2/k;->b:I

    .line 455
    .line 456
    goto :goto_8

    .line 457
    :cond_14
    const/4 v4, 0x3

    .line 458
    iput v4, v10, LY2/k;->b:I

    .line 459
    .line 460
    goto :goto_8

    .line 461
    :cond_15
    move/from16 v20, v7

    .line 462
    .line 463
    move/from16 v18, v13

    .line 464
    .line 465
    const/4 v1, 0x0

    .line 466
    const/16 v4, 0xb5

    .line 467
    .line 468
    if-eq v14, v4, :cond_16

    .line 469
    .line 470
    invoke-static {v2, v3}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    iput-boolean v1, v10, LY2/k;->a:Z

    .line 474
    .line 475
    iput v1, v10, LY2/k;->c:I

    .line 476
    .line 477
    iput v1, v10, LY2/k;->b:I

    .line 478
    .line 479
    goto :goto_8

    .line 480
    :cond_16
    const/4 v4, 0x2

    .line 481
    iput v4, v10, LY2/k;->b:I

    .line 482
    .line 483
    goto :goto_8

    .line 484
    :cond_17
    move/from16 v20, v7

    .line 485
    .line 486
    move/from16 v18, v13

    .line 487
    .line 488
    const/16 v1, 0xb0

    .line 489
    .line 490
    if-ne v14, v1, :cond_18

    .line 491
    .line 492
    const/4 v13, 0x1

    .line 493
    iput v13, v10, LY2/k;->b:I

    .line 494
    .line 495
    iput-boolean v13, v10, LY2/k;->a:Z

    .line 496
    .line 497
    :cond_18
    :goto_8
    sget-object v1, LY2/k;->f:[B

    .line 498
    .line 499
    const/4 v3, 0x0

    .line 500
    const/4 v4, 0x3

    .line 501
    invoke-virtual {v10, v3, v4, v1}, LY2/k;->a(II[B)V

    .line 502
    .line 503
    .line 504
    goto :goto_9

    .line 505
    :cond_19
    move/from16 v20, v7

    .line 506
    .line 507
    move/from16 v18, v13

    .line 508
    .line 509
    goto :goto_7

    .line 510
    :goto_9
    iget-object v1, v0, LY2/l;->f:LT5/j;

    .line 511
    .line 512
    invoke-virtual {v1, v6, v9, v8}, LT5/j;->a(II[B)V

    .line 513
    .line 514
    .line 515
    if-eqz v11, :cond_1c

    .line 516
    .line 517
    if-lez v15, :cond_1a

    .line 518
    .line 519
    invoke-virtual {v11, v6, v9, v8}, LT5/s;->a(II[B)V

    .line 520
    .line 521
    .line 522
    const/4 v1, 0x0

    .line 523
    goto :goto_a

    .line 524
    :cond_1a
    neg-int v1, v15

    .line 525
    :goto_a
    invoke-virtual {v11, v1}, LT5/s;->b(I)Z

    .line 526
    .line 527
    .line 528
    move-result v1

    .line 529
    if-eqz v1, :cond_1b

    .line 530
    .line 531
    iget-object v1, v11, LT5/s;->e:Ljava/lang/Object;

    .line 532
    .line 533
    check-cast v1, [B

    .line 534
    .line 535
    iget v2, v11, LT5/s;->f:I

    .line 536
    .line 537
    invoke-static {v2, v1}, LR1/n;->k(I[B)I

    .line 538
    .line 539
    .line 540
    move-result v1

    .line 541
    sget v2, LQ1/x;->a:I

    .line 542
    .line 543
    iget-object v2, v11, LT5/s;->e:Ljava/lang/Object;

    .line 544
    .line 545
    check-cast v2, [B

    .line 546
    .line 547
    iget-object v3, v0, LY2/l;->b:LQ1/o;

    .line 548
    .line 549
    invoke-virtual {v3, v1, v2}, LQ1/o;->E(I[B)V

    .line 550
    .line 551
    .line 552
    iget-wide v1, v0, LY2/l;->k:J

    .line 553
    .line 554
    iget-object v5, v0, LY2/l;->a:LY2/B;

    .line 555
    .line 556
    invoke-virtual {v5, v1, v2, v3}, LY2/B;->k(JLQ1/o;)V

    .line 557
    .line 558
    .line 559
    :cond_1b
    const/16 v1, 0xb2

    .line 560
    .line 561
    if-ne v14, v1, :cond_1c

    .line 562
    .line 563
    move-object/from16 v1, p1

    .line 564
    .line 565
    iget-object v2, v1, LQ1/o;->a:[B

    .line 566
    .line 567
    const/16 v16, 0x2

    .line 568
    .line 569
    add-int/lit8 v3, v9, 0x2

    .line 570
    .line 571
    aget-byte v2, v2, v3

    .line 572
    .line 573
    const/4 v13, 0x1

    .line 574
    if-ne v2, v13, :cond_1d

    .line 575
    .line 576
    invoke-virtual {v11, v14}, LT5/s;->e(I)V

    .line 577
    .line 578
    .line 579
    goto :goto_b

    .line 580
    :cond_1c
    move-object/from16 v1, p1

    .line 581
    .line 582
    const/4 v13, 0x1

    .line 583
    const/16 v16, 0x2

    .line 584
    .line 585
    :cond_1d
    :goto_b
    sub-int v7, v20, v9

    .line 586
    .line 587
    iget-wide v2, v0, LY2/l;->g:J

    .line 588
    .line 589
    int-to-long v5, v7

    .line 590
    sub-long/2addr v2, v5

    .line 591
    iget-object v5, v0, LY2/l;->f:LT5/j;

    .line 592
    .line 593
    iget-boolean v6, v0, LY2/l;->j:Z

    .line 594
    .line 595
    invoke-virtual {v5, v2, v3, v7, v6}, LT5/j;->b(JIZ)V

    .line 596
    .line 597
    .line 598
    iget-object v2, v0, LY2/l;->f:LT5/j;

    .line 599
    .line 600
    iget-wide v5, v0, LY2/l;->k:J

    .line 601
    .line 602
    iput v14, v2, LT5/j;->e:I

    .line 603
    .line 604
    const/4 v3, 0x0

    .line 605
    iput-boolean v3, v2, LT5/j;->d:Z

    .line 606
    .line 607
    const/16 v3, 0xb6

    .line 608
    .line 609
    if-eq v14, v3, :cond_1f

    .line 610
    .line 611
    const/16 v7, 0xb3

    .line 612
    .line 613
    if-ne v14, v7, :cond_1e

    .line 614
    .line 615
    goto :goto_c

    .line 616
    :cond_1e
    const/4 v7, 0x0

    .line 617
    goto :goto_d

    .line 618
    :cond_1f
    :goto_c
    move v7, v13

    .line 619
    :goto_d
    iput-boolean v7, v2, LT5/j;->b:Z

    .line 620
    .line 621
    if-ne v14, v3, :cond_20

    .line 622
    .line 623
    move v3, v13

    .line 624
    goto :goto_e

    .line 625
    :cond_20
    const/4 v3, 0x0

    .line 626
    :goto_e
    iput-boolean v3, v2, LT5/j;->c:Z

    .line 627
    .line 628
    const/4 v3, 0x0

    .line 629
    iput v3, v2, LT5/j;->f:I

    .line 630
    .line 631
    iput-wide v5, v2, LT5/j;->h:J

    .line 632
    .line 633
    move v5, v13

    .line 634
    move/from16 v6, v18

    .line 635
    .line 636
    move/from16 v7, v20

    .line 637
    .line 638
    goto/16 :goto_0
.end method

.method public final f(Ls2/o;LT5/B;)V
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
    iput-object v0, p0, LY2/l;->h:Ljava/lang/String;

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
    invoke-interface {p1, v0, v1}, Ls2/o;->m(II)Ls2/C;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, LY2/l;->i:Ls2/C;

    .line 22
    .line 23
    new-instance v1, LT5/j;

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-direct {v1, v0, v2}, LT5/j;-><init>(Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, LY2/l;->f:LT5/j;

    .line 30
    .line 31
    iget-object v0, p0, LY2/l;->a:LY2/B;

    .line 32
    .line 33
    invoke-virtual {v0, p1, p2}, LY2/B;->n(Ls2/o;LT5/B;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final h(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, LY2/l;->f:LT5/j;

    .line 2
    .line 3
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, LY2/l;->f:LT5/j;

    .line 9
    .line 10
    iget-wide v0, p0, LY2/l;->g:J

    .line 11
    .line 12
    iget-boolean v2, p0, LY2/l;->j:Z

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {p1, v0, v1, v3, v2}, LT5/j;->b(JIZ)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, LY2/l;->f:LT5/j;

    .line 19
    .line 20
    iput-boolean v3, p1, LT5/j;->b:Z

    .line 21
    .line 22
    iput-boolean v3, p1, LT5/j;->c:Z

    .line 23
    .line 24
    iput-boolean v3, p1, LT5/j;->d:Z

    .line 25
    .line 26
    const/4 v0, -0x1

    .line 27
    iput v0, p1, LT5/j;->e:I

    .line 28
    .line 29
    :cond_0
    return-void
.end method
