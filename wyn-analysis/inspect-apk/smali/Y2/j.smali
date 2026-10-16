.class public final LY2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY2/h;


# static fields
.field public static final q:[D


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ls2/C;

.field public final c:LY2/B;

.field public final d:LQ1/o;

.field public final e:LT5/s;

.field public final f:[Z

.field public final g:LY2/i;

.field public h:J

.field public i:Z

.field public j:Z

.field public k:J

.field public l:J

.field public m:J

.field public n:J

.field public o:Z

.field public p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [D

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LY2/j;->q:[D

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 8
        0x4037f9dcb5112287L    # 23.976023976023978
        0x4038000000000000L    # 24.0
        0x4039000000000000L    # 25.0
        0x403df853e2556b28L    # 29.97002997002997
        0x403e000000000000L    # 30.0
        0x4049000000000000L    # 50.0
        0x404df853e2556b28L    # 59.94005994005994
        0x404e000000000000L    # 60.0
    .end array-data
.end method

.method public constructor <init>(LY2/B;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY2/j;->c:LY2/B;

    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    new-array v0, v0, [Z

    .line 8
    .line 9
    iput-object v0, p0, LY2/j;->f:[Z

    .line 10
    .line 11
    new-instance v0, LY2/i;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x80

    .line 17
    .line 18
    new-array v1, v1, [B

    .line 19
    .line 20
    iput-object v1, v0, LY2/i;->d:[B

    .line 21
    .line 22
    iput-object v0, p0, LY2/j;->g:LY2/i;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    new-instance p1, LT5/s;

    .line 27
    .line 28
    const/16 v0, 0xb2

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-direct {p1, v0, v1}, LT5/s;-><init>(II)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, LY2/j;->e:LT5/s;

    .line 35
    .line 36
    new-instance p1, LQ1/o;

    .line 37
    .line 38
    invoke-direct {p1}, LQ1/o;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, LY2/j;->d:LQ1/o;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 p1, 0x0

    .line 45
    iput-object p1, p0, LY2/j;->e:LT5/s;

    .line 46
    .line 47
    iput-object p1, p0, LY2/j;->d:LQ1/o;

    .line 48
    .line 49
    :goto_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    iput-wide v0, p0, LY2/j;->l:J

    .line 55
    .line 56
    iput-wide v0, p0, LY2/j;->n:J

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, LY2/j;->f:[Z

    .line 2
    .line 3
    invoke-static {v0}, LR1/n;->a([Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY2/j;->g:LY2/i;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-boolean v1, v0, LY2/i;->a:Z

    .line 10
    .line 11
    iput v1, v0, LY2/i;->b:I

    .line 12
    .line 13
    iput v1, v0, LY2/i;->c:I

    .line 14
    .line 15
    iget-object v0, p0, LY2/j;->e:LT5/s;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, LT5/s;->d()V

    .line 20
    .line 21
    .line 22
    :cond_0
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    iput-wide v2, p0, LY2/j;->h:J

    .line 25
    .line 26
    iput-boolean v1, p0, LY2/j;->i:Z

    .line 27
    .line 28
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iput-wide v0, p0, LY2/j;->l:J

    .line 34
    .line 35
    iput-wide v0, p0, LY2/j;->n:J

    .line 36
    .line 37
    return-void
.end method

.method public final d(IJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, LY2/j;->l:J

    .line 2
    .line 3
    return-void
.end method

.method public final e(LQ1/o;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v5, 0x3

    .line 6
    iget-object v6, v0, LY2/j;->b:Ls2/C;

    .line 7
    .line 8
    invoke-static {v6}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget v6, v1, LQ1/o;->b:I

    .line 12
    .line 13
    iget v7, v1, LQ1/o;->c:I

    .line 14
    .line 15
    iget-object v8, v1, LQ1/o;->a:[B

    .line 16
    .line 17
    iget-wide v9, v0, LY2/j;->h:J

    .line 18
    .line 19
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 20
    .line 21
    .line 22
    move-result v11

    .line 23
    int-to-long v11, v11

    .line 24
    add-long/2addr v9, v11

    .line 25
    iput-wide v9, v0, LY2/j;->h:J

    .line 26
    .line 27
    iget-object v9, v0, LY2/j;->b:Ls2/C;

    .line 28
    .line 29
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 30
    .line 31
    .line 32
    move-result v10

    .line 33
    invoke-interface {v9, v10, v1}, Ls2/C;->e(ILQ1/o;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v9, v0, LY2/j;->f:[Z

    .line 37
    .line 38
    invoke-static {v8, v6, v7, v9}, LR1/n;->b([BII[Z)I

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    iget-object v10, v0, LY2/j;->g:LY2/i;

    .line 43
    .line 44
    iget-object v11, v0, LY2/j;->e:LT5/s;

    .line 45
    .line 46
    if-ne v9, v7, :cond_2

    .line 47
    .line 48
    iget-boolean v1, v0, LY2/j;->j:Z

    .line 49
    .line 50
    if-nez v1, :cond_0

    .line 51
    .line 52
    invoke-virtual {v10, v6, v7, v8}, LY2/i;->a(II[B)V

    .line 53
    .line 54
    .line 55
    :cond_0
    if-eqz v11, :cond_1

    .line 56
    .line 57
    invoke-virtual {v11, v6, v7, v8}, LT5/s;->a(II[B)V

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void

    .line 61
    :cond_2
    iget-object v12, v1, LQ1/o;->a:[B

    .line 62
    .line 63
    add-int/lit8 v13, v9, 0x3

    .line 64
    .line 65
    aget-byte v12, v12, v13

    .line 66
    .line 67
    and-int/lit16 v12, v12, 0xff

    .line 68
    .line 69
    sub-int v14, v9, v6

    .line 70
    .line 71
    iget-boolean v15, v0, LY2/j;->j:Z

    .line 72
    .line 73
    const/16 v16, 0x1

    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    if-nez v15, :cond_d

    .line 77
    .line 78
    if-lez v14, :cond_3

    .line 79
    .line 80
    invoke-virtual {v10, v6, v9, v8}, LY2/i;->a(II[B)V

    .line 81
    .line 82
    .line 83
    :cond_3
    if-gez v14, :cond_4

    .line 84
    .line 85
    neg-int v15, v14

    .line 86
    :goto_1
    const/16 v17, 0x4

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    move v15, v4

    .line 90
    goto :goto_1

    .line 91
    :goto_2
    iget-boolean v3, v10, LY2/i;->a:Z

    .line 92
    .line 93
    if-eqz v3, :cond_b

    .line 94
    .line 95
    iget v3, v10, LY2/i;->b:I

    .line 96
    .line 97
    sub-int/2addr v3, v15

    .line 98
    iput v3, v10, LY2/i;->b:I

    .line 99
    .line 100
    iget v15, v10, LY2/i;->c:I

    .line 101
    .line 102
    if-nez v15, :cond_5

    .line 103
    .line 104
    const/16 v15, 0xb5

    .line 105
    .line 106
    if-ne v12, v15, :cond_5

    .line 107
    .line 108
    iput v3, v10, LY2/i;->c:I

    .line 109
    .line 110
    goto/16 :goto_7

    .line 111
    .line 112
    :cond_5
    iput-boolean v4, v10, LY2/i;->a:Z

    .line 113
    .line 114
    iget-object v3, v0, LY2/j;->a:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-object v15, v10, LY2/i;->d:[B

    .line 120
    .line 121
    iget v4, v10, LY2/i;->b:I

    .line 122
    .line 123
    invoke-static {v15, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    aget-byte v15, v4, v17

    .line 128
    .line 129
    and-int/lit16 v15, v15, 0xff

    .line 130
    .line 131
    const/16 v18, 0x5

    .line 132
    .line 133
    aget-byte v5, v4, v18

    .line 134
    .line 135
    and-int/lit16 v2, v5, 0xff

    .line 136
    .line 137
    const/16 v21, 0x6

    .line 138
    .line 139
    move/from16 v22, v2

    .line 140
    .line 141
    aget-byte v2, v4, v21

    .line 142
    .line 143
    and-int/lit16 v2, v2, 0xff

    .line 144
    .line 145
    shl-int/lit8 v15, v15, 0x4

    .line 146
    .line 147
    shr-int/lit8 v21, v22, 0x4

    .line 148
    .line 149
    or-int v15, v15, v21

    .line 150
    .line 151
    and-int/lit8 v5, v5, 0xf

    .line 152
    .line 153
    move/from16 v21, v2

    .line 154
    .line 155
    const/16 v2, 0x8

    .line 156
    .line 157
    shl-int/2addr v5, v2

    .line 158
    or-int v5, v5, v21

    .line 159
    .line 160
    const/16 v21, 0x7

    .line 161
    .line 162
    aget-byte v2, v4, v21

    .line 163
    .line 164
    and-int/lit16 v2, v2, 0xf0

    .line 165
    .line 166
    shr-int/lit8 v2, v2, 0x4

    .line 167
    .line 168
    move-object/from16 v23, v4

    .line 169
    .line 170
    const/4 v4, 0x2

    .line 171
    if-eq v2, v4, :cond_8

    .line 172
    .line 173
    const/4 v4, 0x3

    .line 174
    if-eq v2, v4, :cond_7

    .line 175
    .line 176
    move/from16 v4, v17

    .line 177
    .line 178
    if-eq v2, v4, :cond_6

    .line 179
    .line 180
    const/high16 v2, 0x3f800000    # 1.0f

    .line 181
    .line 182
    :goto_3
    const/16 v17, 0x4

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_6
    mul-int/lit8 v2, v5, 0x79

    .line 186
    .line 187
    int-to-float v2, v2

    .line 188
    mul-int/lit8 v4, v15, 0x64

    .line 189
    .line 190
    :goto_4
    int-to-float v4, v4

    .line 191
    div-float/2addr v2, v4

    .line 192
    goto :goto_3

    .line 193
    :cond_7
    mul-int/lit8 v2, v5, 0x10

    .line 194
    .line 195
    int-to-float v2, v2

    .line 196
    mul-int/lit8 v4, v15, 0x9

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_8
    mul-int/lit8 v2, v5, 0x4

    .line 200
    .line 201
    int-to-float v2, v2

    .line 202
    const/16 v19, 0x3

    .line 203
    .line 204
    mul-int/lit8 v4, v15, 0x3

    .line 205
    .line 206
    int-to-float v4, v4

    .line 207
    div-float/2addr v2, v4

    .line 208
    :goto_5
    new-instance v4, LN1/m;

    .line 209
    .line 210
    invoke-direct {v4}, LN1/m;-><init>()V

    .line 211
    .line 212
    .line 213
    iput-object v3, v4, LN1/m;->a:Ljava/lang/String;

    .line 214
    .line 215
    const-string v3, "video/mpeg2"

    .line 216
    .line 217
    invoke-static {v3}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    iput-object v3, v4, LN1/m;->m:Ljava/lang/String;

    .line 222
    .line 223
    iput v15, v4, LN1/m;->t:I

    .line 224
    .line 225
    iput v5, v4, LN1/m;->u:I

    .line 226
    .line 227
    iput v2, v4, LN1/m;->x:F

    .line 228
    .line 229
    invoke-static/range {v23 .. v23}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    iput-object v2, v4, LN1/m;->p:Ljava/util/List;

    .line 234
    .line 235
    new-instance v2, LN1/n;

    .line 236
    .line 237
    invoke-direct {v2, v4}, LN1/n;-><init>(LN1/m;)V

    .line 238
    .line 239
    .line 240
    aget-byte v3, v23, v21

    .line 241
    .line 242
    and-int/lit8 v3, v3, 0xf

    .line 243
    .line 244
    add-int/lit8 v3, v3, -0x1

    .line 245
    .line 246
    if-ltz v3, :cond_a

    .line 247
    .line 248
    const/16 v4, 0x8

    .line 249
    .line 250
    if-ge v3, v4, :cond_a

    .line 251
    .line 252
    sget-object v4, LY2/j;->q:[D

    .line 253
    .line 254
    aget-wide v3, v4, v3

    .line 255
    .line 256
    iget v5, v10, LY2/i;->c:I

    .line 257
    .line 258
    add-int/lit8 v5, v5, 0x9

    .line 259
    .line 260
    aget-byte v5, v23, v5

    .line 261
    .line 262
    and-int/lit8 v10, v5, 0x60

    .line 263
    .line 264
    shr-int/lit8 v10, v10, 0x5

    .line 265
    .line 266
    and-int/lit8 v5, v5, 0x1f

    .line 267
    .line 268
    move-wide/from16 v21, v3

    .line 269
    .line 270
    if-eq v10, v5, :cond_9

    .line 271
    .line 272
    int-to-double v3, v10

    .line 273
    const-wide/high16 v23, 0x3ff0000000000000L    # 1.0

    .line 274
    .line 275
    add-double v3, v3, v23

    .line 276
    .line 277
    add-int/lit8 v5, v5, 0x1

    .line 278
    .line 279
    move-wide/from16 v23, v3

    .line 280
    .line 281
    int-to-double v3, v5

    .line 282
    div-double v3, v23, v3

    .line 283
    .line 284
    mul-double v3, v3, v21

    .line 285
    .line 286
    :cond_9
    const-wide v21, 0x412e848000000000L    # 1000000.0

    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    div-double v3, v21, v3

    .line 292
    .line 293
    double-to-long v3, v3

    .line 294
    goto :goto_6

    .line 295
    :cond_a
    const-wide/16 v3, 0x0

    .line 296
    .line 297
    :goto_6
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    invoke-static {v2, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    iget-object v3, v0, LY2/j;->b:Ls2/C;

    .line 306
    .line 307
    iget-object v4, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v4, LN1/n;

    .line 310
    .line 311
    invoke-interface {v3, v4}, Ls2/C;->c(LN1/n;)V

    .line 312
    .line 313
    .line 314
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v2, Ljava/lang/Long;

    .line 317
    .line 318
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 319
    .line 320
    .line 321
    move-result-wide v2

    .line 322
    iput-wide v2, v0, LY2/j;->k:J

    .line 323
    .line 324
    move/from16 v2, v16

    .line 325
    .line 326
    iput-boolean v2, v0, LY2/j;->j:Z

    .line 327
    .line 328
    const/4 v4, 0x3

    .line 329
    goto :goto_8

    .line 330
    :cond_b
    move/from16 v2, v16

    .line 331
    .line 332
    const/16 v3, 0xb3

    .line 333
    .line 334
    if-ne v12, v3, :cond_c

    .line 335
    .line 336
    iput-boolean v2, v10, LY2/i;->a:Z

    .line 337
    .line 338
    :cond_c
    :goto_7
    sget-object v2, LY2/i;->e:[B

    .line 339
    .line 340
    const/4 v3, 0x0

    .line 341
    const/4 v4, 0x3

    .line 342
    invoke-virtual {v10, v3, v4, v2}, LY2/i;->a(II[B)V

    .line 343
    .line 344
    .line 345
    goto :goto_8

    .line 346
    :cond_d
    move v4, v5

    .line 347
    const/16 v17, 0x4

    .line 348
    .line 349
    :goto_8
    if-eqz v11, :cond_10

    .line 350
    .line 351
    if-lez v14, :cond_e

    .line 352
    .line 353
    invoke-virtual {v11, v6, v9, v8}, LT5/s;->a(II[B)V

    .line 354
    .line 355
    .line 356
    const/4 v3, 0x0

    .line 357
    goto :goto_9

    .line 358
    :cond_e
    neg-int v3, v14

    .line 359
    :goto_9
    invoke-virtual {v11, v3}, LT5/s;->b(I)Z

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    if-eqz v2, :cond_f

    .line 364
    .line 365
    iget-object v2, v11, LT5/s;->e:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v2, [B

    .line 368
    .line 369
    iget v3, v11, LT5/s;->f:I

    .line 370
    .line 371
    invoke-static {v3, v2}, LR1/n;->k(I[B)I

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    sget v3, LQ1/x;->a:I

    .line 376
    .line 377
    iget-object v3, v11, LT5/s;->e:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v3, [B

    .line 380
    .line 381
    iget-object v5, v0, LY2/j;->d:LQ1/o;

    .line 382
    .line 383
    invoke-virtual {v5, v2, v3}, LQ1/o;->E(I[B)V

    .line 384
    .line 385
    .line 386
    iget-wide v2, v0, LY2/j;->n:J

    .line 387
    .line 388
    iget-object v6, v0, LY2/j;->c:LY2/B;

    .line 389
    .line 390
    invoke-virtual {v6, v2, v3, v5}, LY2/B;->k(JLQ1/o;)V

    .line 391
    .line 392
    .line 393
    :cond_f
    const/16 v2, 0xb2

    .line 394
    .line 395
    if-ne v12, v2, :cond_10

    .line 396
    .line 397
    iget-object v2, v1, LQ1/o;->a:[B

    .line 398
    .line 399
    const/16 v20, 0x2

    .line 400
    .line 401
    add-int/lit8 v3, v9, 0x2

    .line 402
    .line 403
    aget-byte v2, v2, v3

    .line 404
    .line 405
    const/4 v3, 0x1

    .line 406
    if-ne v2, v3, :cond_11

    .line 407
    .line 408
    invoke-virtual {v11, v12}, LT5/s;->e(I)V

    .line 409
    .line 410
    .line 411
    goto :goto_a

    .line 412
    :cond_10
    const/4 v3, 0x1

    .line 413
    const/16 v20, 0x2

    .line 414
    .line 415
    :cond_11
    :goto_a
    if-eqz v12, :cond_14

    .line 416
    .line 417
    const/16 v2, 0xb3

    .line 418
    .line 419
    if-ne v12, v2, :cond_12

    .line 420
    .line 421
    goto :goto_b

    .line 422
    :cond_12
    const/16 v2, 0xb8

    .line 423
    .line 424
    if-ne v12, v2, :cond_13

    .line 425
    .line 426
    iput-boolean v3, v0, LY2/j;->o:Z

    .line 427
    .line 428
    :cond_13
    move v2, v3

    .line 429
    goto :goto_f

    .line 430
    :cond_14
    :goto_b
    sub-int v26, v7, v9

    .line 431
    .line 432
    iget-boolean v2, v0, LY2/j;->p:Z

    .line 433
    .line 434
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    if-eqz v2, :cond_15

    .line 440
    .line 441
    iget-boolean v2, v0, LY2/j;->j:Z

    .line 442
    .line 443
    if-eqz v2, :cond_15

    .line 444
    .line 445
    iget-wide v2, v0, LY2/j;->n:J

    .line 446
    .line 447
    cmp-long v9, v2, v5

    .line 448
    .line 449
    if-eqz v9, :cond_15

    .line 450
    .line 451
    iget-boolean v9, v0, LY2/j;->o:Z

    .line 452
    .line 453
    iget-wide v10, v0, LY2/j;->h:J

    .line 454
    .line 455
    iget-wide v14, v0, LY2/j;->m:J

    .line 456
    .line 457
    sub-long/2addr v10, v14

    .line 458
    long-to-int v10, v10

    .line 459
    sub-int v25, v10, v26

    .line 460
    .line 461
    iget-object v10, v0, LY2/j;->b:Ls2/C;

    .line 462
    .line 463
    const/16 v27, 0x0

    .line 464
    .line 465
    move-wide/from16 v22, v2

    .line 466
    .line 467
    move/from16 v24, v9

    .line 468
    .line 469
    move-object/from16 v21, v10

    .line 470
    .line 471
    invoke-interface/range {v21 .. v27}, Ls2/C;->a(JIIILs2/B;)V

    .line 472
    .line 473
    .line 474
    :cond_15
    move/from16 v2, v26

    .line 475
    .line 476
    iget-boolean v3, v0, LY2/j;->i:Z

    .line 477
    .line 478
    if-eqz v3, :cond_17

    .line 479
    .line 480
    iget-boolean v3, v0, LY2/j;->p:Z

    .line 481
    .line 482
    if-eqz v3, :cond_16

    .line 483
    .line 484
    goto :goto_c

    .line 485
    :cond_16
    const/4 v2, 0x1

    .line 486
    const/4 v3, 0x0

    .line 487
    goto :goto_e

    .line 488
    :cond_17
    :goto_c
    iget-wide v9, v0, LY2/j;->h:J

    .line 489
    .line 490
    int-to-long v2, v2

    .line 491
    sub-long/2addr v9, v2

    .line 492
    iput-wide v9, v0, LY2/j;->m:J

    .line 493
    .line 494
    iget-wide v2, v0, LY2/j;->l:J

    .line 495
    .line 496
    cmp-long v9, v2, v5

    .line 497
    .line 498
    if-eqz v9, :cond_18

    .line 499
    .line 500
    goto :goto_d

    .line 501
    :cond_18
    iget-wide v2, v0, LY2/j;->n:J

    .line 502
    .line 503
    cmp-long v9, v2, v5

    .line 504
    .line 505
    if-eqz v9, :cond_19

    .line 506
    .line 507
    iget-wide v9, v0, LY2/j;->k:J

    .line 508
    .line 509
    add-long/2addr v2, v9

    .line 510
    goto :goto_d

    .line 511
    :cond_19
    move-wide v2, v5

    .line 512
    :goto_d
    iput-wide v2, v0, LY2/j;->n:J

    .line 513
    .line 514
    const/4 v3, 0x0

    .line 515
    iput-boolean v3, v0, LY2/j;->o:Z

    .line 516
    .line 517
    iput-wide v5, v0, LY2/j;->l:J

    .line 518
    .line 519
    const/4 v2, 0x1

    .line 520
    iput-boolean v2, v0, LY2/j;->i:Z

    .line 521
    .line 522
    :goto_e
    if-nez v12, :cond_1a

    .line 523
    .line 524
    move v3, v2

    .line 525
    :cond_1a
    iput-boolean v3, v0, LY2/j;->p:Z

    .line 526
    .line 527
    :goto_f
    move v5, v4

    .line 528
    move v6, v13

    .line 529
    goto/16 :goto_0
.end method

.method public final f(Ls2/o;LT5/B;)V
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
    iget-object v0, p2, LT5/B;->f:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, LY2/j;->a:Ljava/lang/String;

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
    iput-object v0, p0, LY2/j;->b:Ls2/C;

    .line 22
    .line 23
    iget-object v0, p0, LY2/j;->c:LY2/B;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0, p1, p2}, LY2/B;->n(Ls2/o;LT5/B;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final h(Z)V
    .locals 8

    .line 1
    iget-object v0, p0, LY2/j;->b:Ls2/C;

    .line 2
    .line 3
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-boolean v4, p0, LY2/j;->o:Z

    .line 9
    .line 10
    iget-wide v0, p0, LY2/j;->h:J

    .line 11
    .line 12
    iget-wide v2, p0, LY2/j;->m:J

    .line 13
    .line 14
    sub-long/2addr v0, v2

    .line 15
    long-to-int v5, v0

    .line 16
    iget-object v1, p0, LY2/j;->b:Ls2/C;

    .line 17
    .line 18
    iget-wide v2, p0, LY2/j;->n:J

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    invoke-interface/range {v1 .. v7}, Ls2/C;->a(JIIILs2/B;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method
