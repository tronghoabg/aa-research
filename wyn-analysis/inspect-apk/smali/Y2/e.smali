.class public final LY2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY2/h;


# static fields
.field public static final w:[B


# instance fields
.field public final a:Z

.field public final b:LJ5/y;

.field public final c:LQ1/o;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public f:Ljava/lang/String;

.field public g:Ls2/C;

.field public h:Ls2/C;

.field public i:I

.field public j:I

.field public k:I

.field public l:Z

.field public m:Z

.field public n:I

.field public o:I

.field public p:I

.field public q:Z

.field public r:J

.field public s:I

.field public t:J

.field public u:Ls2/C;

.field public v:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, LY2/e;->w:[B

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 1
        0x49t
        0x44t
        0x33t
    .end array-data
.end method

.method public constructor <init>(ILjava/lang/String;Z)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LJ5/y;

    .line 5
    .line 6
    const/4 v1, 0x7

    .line 7
    new-array v2, v1, [B

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    invoke-direct {v0, v2, v1, v3, v4}, LJ5/y;-><init>([BIIB)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LY2/e;->b:LJ5/y;

    .line 15
    .line 16
    new-instance v0, LQ1/o;

    .line 17
    .line 18
    sget-object v1, LY2/e;->w:[B

    .line 19
    .line 20
    const/16 v2, 0xa

    .line 21
    .line 22
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {v0, v1}, LQ1/o;-><init>([B)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, LY2/e;->c:LQ1/o;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput v0, p0, LY2/e;->i:I

    .line 33
    .line 34
    iput v0, p0, LY2/e;->j:I

    .line 35
    .line 36
    const/16 v0, 0x100

    .line 37
    .line 38
    iput v0, p0, LY2/e;->k:I

    .line 39
    .line 40
    const/4 v0, -0x1

    .line 41
    iput v0, p0, LY2/e;->n:I

    .line 42
    .line 43
    iput v0, p0, LY2/e;->o:I

    .line 44
    .line 45
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    iput-wide v0, p0, LY2/e;->r:J

    .line 51
    .line 52
    iput-wide v0, p0, LY2/e;->t:J

    .line 53
    .line 54
    iput-boolean p3, p0, LY2/e;->a:Z

    .line 55
    .line 56
    iput-object p2, p0, LY2/e;->d:Ljava/lang/String;

    .line 57
    .line 58
    iput p1, p0, LY2/e;->e:I

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, LY2/e;->t:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, LY2/e;->m:Z

    .line 10
    .line 11
    iput v0, p0, LY2/e;->i:I

    .line 12
    .line 13
    iput v0, p0, LY2/e;->j:I

    .line 14
    .line 15
    const/16 v0, 0x100

    .line 16
    .line 17
    iput v0, p0, LY2/e;->k:I

    .line 18
    .line 19
    return-void
.end method

.method public final d(IJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, LY2/e;->t:J

    .line 2
    .line 3
    return-void
.end method

.method public final e(LQ1/o;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, -0x1

    .line 8
    const/4 v6, 0x1

    .line 9
    iget-object v7, v0, LY2/e;->g:Ls2/C;

    .line 10
    .line 11
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget v7, LQ1/x;->a:I

    .line 15
    .line 16
    :cond_0
    :goto_0
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    if-lez v7, :cond_27

    .line 21
    .line 22
    iget v7, v0, LY2/e;->i:I

    .line 23
    .line 24
    iget-object v8, v0, LY2/e;->b:LJ5/y;

    .line 25
    .line 26
    const/16 v9, 0x100

    .line 27
    .line 28
    const/4 v10, 0x4

    .line 29
    const/4 v11, 0x3

    .line 30
    const/16 v12, 0xd

    .line 31
    .line 32
    iget-object v13, v0, LY2/e;->c:LQ1/o;

    .line 33
    .line 34
    if-eqz v7, :cond_d

    .line 35
    .line 36
    if-eq v7, v6, :cond_9

    .line 37
    .line 38
    const/16 v14, 0xa

    .line 39
    .line 40
    if-eq v7, v3, :cond_8

    .line 41
    .line 42
    if-eq v7, v11, :cond_3

    .line 43
    .line 44
    if-ne v7, v10, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    iget v8, v0, LY2/e;->s:I

    .line 51
    .line 52
    iget v10, v0, LY2/e;->j:I

    .line 53
    .line 54
    sub-int/2addr v8, v10

    .line 55
    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    iget-object v8, v0, LY2/e;->u:Ls2/C;

    .line 60
    .line 61
    invoke-interface {v8, v7, v1}, Ls2/C;->e(ILQ1/o;)V

    .line 62
    .line 63
    .line 64
    iget v8, v0, LY2/e;->j:I

    .line 65
    .line 66
    add-int/2addr v8, v7

    .line 67
    iput v8, v0, LY2/e;->j:I

    .line 68
    .line 69
    iget v7, v0, LY2/e;->s:I

    .line 70
    .line 71
    if-ne v8, v7, :cond_0

    .line 72
    .line 73
    iget-wide v7, v0, LY2/e;->t:J

    .line 74
    .line 75
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    cmp-long v7, v7, v10

    .line 81
    .line 82
    if-eqz v7, :cond_1

    .line 83
    .line 84
    move v7, v6

    .line 85
    goto :goto_1

    .line 86
    :cond_1
    move v7, v2

    .line 87
    :goto_1
    invoke-static {v7}, LQ1/k;->g(Z)V

    .line 88
    .line 89
    .line 90
    iget-object v10, v0, LY2/e;->u:Ls2/C;

    .line 91
    .line 92
    iget-wide v11, v0, LY2/e;->t:J

    .line 93
    .line 94
    iget v14, v0, LY2/e;->s:I

    .line 95
    .line 96
    const/4 v13, 0x1

    .line 97
    const/4 v15, 0x0

    .line 98
    const/16 v16, 0x0

    .line 99
    .line 100
    invoke-interface/range {v10 .. v16}, Ls2/C;->a(JIIILs2/B;)V

    .line 101
    .line 102
    .line 103
    iget-wide v7, v0, LY2/e;->t:J

    .line 104
    .line 105
    iget-wide v10, v0, LY2/e;->v:J

    .line 106
    .line 107
    add-long/2addr v7, v10

    .line 108
    iput-wide v7, v0, LY2/e;->t:J

    .line 109
    .line 110
    iput v2, v0, LY2/e;->i:I

    .line 111
    .line 112
    iput v2, v0, LY2/e;->j:I

    .line 113
    .line 114
    iput v9, v0, LY2/e;->k:I

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 118
    .line 119
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 120
    .line 121
    .line 122
    throw v1

    .line 123
    :cond_3
    iget-boolean v7, v0, LY2/e;->l:Z

    .line 124
    .line 125
    const/4 v9, 0x5

    .line 126
    if-eqz v7, :cond_4

    .line 127
    .line 128
    const/4 v7, 0x7

    .line 129
    goto :goto_2

    .line 130
    :cond_4
    move v7, v9

    .line 131
    :goto_2
    iget-object v13, v8, LJ5/y;->b:[B

    .line 132
    .line 133
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 134
    .line 135
    .line 136
    move-result v15

    .line 137
    const/16 v16, 0x7

    .line 138
    .line 139
    iget v5, v0, LY2/e;->j:I

    .line 140
    .line 141
    sub-int v5, v7, v5

    .line 142
    .line 143
    invoke-static {v15, v5}, Ljava/lang/Math;->min(II)I

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    iget v15, v0, LY2/e;->j:I

    .line 148
    .line 149
    invoke-virtual {v1, v15, v5, v13}, LQ1/o;->f(II[B)V

    .line 150
    .line 151
    .line 152
    iget v13, v0, LY2/e;->j:I

    .line 153
    .line 154
    add-int/2addr v13, v5

    .line 155
    iput v13, v0, LY2/e;->j:I

    .line 156
    .line 157
    if-ne v13, v7, :cond_0

    .line 158
    .line 159
    invoke-virtual {v8, v2}, LJ5/y;->q(I)V

    .line 160
    .line 161
    .line 162
    iget-boolean v5, v0, LY2/e;->q:Z

    .line 163
    .line 164
    if-nez v5, :cond_6

    .line 165
    .line 166
    invoke-virtual {v8, v3}, LJ5/y;->i(I)I

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    add-int/2addr v5, v6

    .line 171
    if-eq v5, v3, :cond_5

    .line 172
    .line 173
    new-instance v7, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    const-string v13, "Detected audio object type: "

    .line 176
    .line 177
    invoke-direct {v7, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v5, ", but assuming AAC LC."

    .line 184
    .line 185
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    const-string v7, "AdtsReader"

    .line 193
    .line 194
    invoke-static {v7, v5}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    move v5, v3

    .line 198
    :cond_5
    invoke-virtual {v8, v9}, LJ5/y;->t(I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v8, v11}, LJ5/y;->i(I)I

    .line 202
    .line 203
    .line 204
    move-result v7

    .line 205
    iget v9, v0, LY2/e;->o:I

    .line 206
    .line 207
    invoke-static {v5, v9, v7}, Ls2/a;->b(III)[B

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    new-instance v7, LJ5/y;

    .line 212
    .line 213
    invoke-direct {v7, v5, v3, v6, v2}, LJ5/y;-><init>([BIIB)V

    .line 214
    .line 215
    .line 216
    invoke-static {v7, v2}, Ls2/a;->q(LJ5/y;Z)LG5/a;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    new-instance v9, LN1/m;

    .line 221
    .line 222
    invoke-direct {v9}, LN1/m;-><init>()V

    .line 223
    .line 224
    .line 225
    iget-object v11, v0, LY2/e;->f:Ljava/lang/String;

    .line 226
    .line 227
    iput-object v11, v9, LN1/m;->a:Ljava/lang/String;

    .line 228
    .line 229
    const-string v11, "audio/mp4a-latm"

    .line 230
    .line 231
    invoke-static {v11}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v11

    .line 235
    iput-object v11, v9, LN1/m;->m:Ljava/lang/String;

    .line 236
    .line 237
    iget-object v11, v7, LG5/a;->c:Ljava/lang/String;

    .line 238
    .line 239
    iput-object v11, v9, LN1/m;->j:Ljava/lang/String;

    .line 240
    .line 241
    iget v11, v7, LG5/a;->b:I

    .line 242
    .line 243
    iput v11, v9, LN1/m;->B:I

    .line 244
    .line 245
    iget v7, v7, LG5/a;->a:I

    .line 246
    .line 247
    iput v7, v9, LN1/m;->C:I

    .line 248
    .line 249
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    iput-object v5, v9, LN1/m;->p:Ljava/util/List;

    .line 254
    .line 255
    iget-object v5, v0, LY2/e;->d:Ljava/lang/String;

    .line 256
    .line 257
    iput-object v5, v9, LN1/m;->d:Ljava/lang/String;

    .line 258
    .line 259
    iget v5, v0, LY2/e;->e:I

    .line 260
    .line 261
    iput v5, v9, LN1/m;->f:I

    .line 262
    .line 263
    new-instance v5, LN1/n;

    .line 264
    .line 265
    invoke-direct {v5, v9}, LN1/n;-><init>(LN1/m;)V

    .line 266
    .line 267
    .line 268
    iget v7, v5, LN1/n;->D:I

    .line 269
    .line 270
    int-to-long v13, v7

    .line 271
    const-wide/32 v17, 0x3d090000

    .line 272
    .line 273
    .line 274
    div-long v13, v17, v13

    .line 275
    .line 276
    iput-wide v13, v0, LY2/e;->r:J

    .line 277
    .line 278
    iget-object v7, v0, LY2/e;->g:Ls2/C;

    .line 279
    .line 280
    invoke-interface {v7, v5}, Ls2/C;->c(LN1/n;)V

    .line 281
    .line 282
    .line 283
    iput-boolean v6, v0, LY2/e;->q:Z

    .line 284
    .line 285
    goto :goto_3

    .line 286
    :cond_6
    invoke-virtual {v8, v14}, LJ5/y;->t(I)V

    .line 287
    .line 288
    .line 289
    :goto_3
    invoke-virtual {v8, v10}, LJ5/y;->t(I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v8, v12}, LJ5/y;->i(I)I

    .line 293
    .line 294
    .line 295
    move-result v5

    .line 296
    add-int/lit8 v7, v5, -0x7

    .line 297
    .line 298
    iget-boolean v8, v0, LY2/e;->l:Z

    .line 299
    .line 300
    if-eqz v8, :cond_7

    .line 301
    .line 302
    add-int/lit8 v7, v5, -0x9

    .line 303
    .line 304
    :cond_7
    iget-object v5, v0, LY2/e;->g:Ls2/C;

    .line 305
    .line 306
    iget-wide v8, v0, LY2/e;->r:J

    .line 307
    .line 308
    iput v10, v0, LY2/e;->i:I

    .line 309
    .line 310
    iput v2, v0, LY2/e;->j:I

    .line 311
    .line 312
    iput-object v5, v0, LY2/e;->u:Ls2/C;

    .line 313
    .line 314
    iput-wide v8, v0, LY2/e;->v:J

    .line 315
    .line 316
    iput v7, v0, LY2/e;->s:I

    .line 317
    .line 318
    goto/16 :goto_0

    .line 319
    .line 320
    :cond_8
    const/16 v16, 0x7

    .line 321
    .line 322
    iget-object v5, v13, LQ1/o;->a:[B

    .line 323
    .line 324
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 325
    .line 326
    .line 327
    move-result v7

    .line 328
    iget v8, v0, LY2/e;->j:I

    .line 329
    .line 330
    rsub-int/lit8 v8, v8, 0xa

    .line 331
    .line 332
    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    .line 333
    .line 334
    .line 335
    move-result v7

    .line 336
    iget v8, v0, LY2/e;->j:I

    .line 337
    .line 338
    invoke-virtual {v1, v8, v7, v5}, LQ1/o;->f(II[B)V

    .line 339
    .line 340
    .line 341
    iget v5, v0, LY2/e;->j:I

    .line 342
    .line 343
    add-int/2addr v5, v7

    .line 344
    iput v5, v0, LY2/e;->j:I

    .line 345
    .line 346
    if-ne v5, v14, :cond_0

    .line 347
    .line 348
    iget-object v5, v0, LY2/e;->h:Ls2/C;

    .line 349
    .line 350
    invoke-interface {v5, v14, v13}, Ls2/C;->e(ILQ1/o;)V

    .line 351
    .line 352
    .line 353
    const/4 v5, 0x6

    .line 354
    invoke-virtual {v13, v5}, LQ1/o;->G(I)V

    .line 355
    .line 356
    .line 357
    iget-object v5, v0, LY2/e;->h:Ls2/C;

    .line 358
    .line 359
    invoke-virtual {v13}, LQ1/o;->t()I

    .line 360
    .line 361
    .line 362
    move-result v7

    .line 363
    add-int/2addr v7, v14

    .line 364
    iput v10, v0, LY2/e;->i:I

    .line 365
    .line 366
    iput v14, v0, LY2/e;->j:I

    .line 367
    .line 368
    iput-object v5, v0, LY2/e;->u:Ls2/C;

    .line 369
    .line 370
    const-wide/16 v8, 0x0

    .line 371
    .line 372
    iput-wide v8, v0, LY2/e;->v:J

    .line 373
    .line 374
    iput v7, v0, LY2/e;->s:I

    .line 375
    .line 376
    goto/16 :goto_0

    .line 377
    .line 378
    :cond_9
    const/16 v16, 0x7

    .line 379
    .line 380
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 381
    .line 382
    .line 383
    move-result v5

    .line 384
    if-nez v5, :cond_a

    .line 385
    .line 386
    goto/16 :goto_0

    .line 387
    .line 388
    :cond_a
    iget-object v5, v8, LJ5/y;->b:[B

    .line 389
    .line 390
    iget-object v7, v1, LQ1/o;->a:[B

    .line 391
    .line 392
    iget v12, v1, LQ1/o;->b:I

    .line 393
    .line 394
    aget-byte v7, v7, v12

    .line 395
    .line 396
    aput-byte v7, v5, v2

    .line 397
    .line 398
    invoke-virtual {v8, v3}, LJ5/y;->q(I)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v8, v10}, LJ5/y;->i(I)I

    .line 402
    .line 403
    .line 404
    move-result v5

    .line 405
    iget v7, v0, LY2/e;->o:I

    .line 406
    .line 407
    if-eq v7, v4, :cond_b

    .line 408
    .line 409
    if-eq v5, v7, :cond_b

    .line 410
    .line 411
    iput-boolean v2, v0, LY2/e;->m:Z

    .line 412
    .line 413
    iput v2, v0, LY2/e;->i:I

    .line 414
    .line 415
    iput v2, v0, LY2/e;->j:I

    .line 416
    .line 417
    iput v9, v0, LY2/e;->k:I

    .line 418
    .line 419
    goto/16 :goto_0

    .line 420
    .line 421
    :cond_b
    iget-boolean v7, v0, LY2/e;->m:Z

    .line 422
    .line 423
    if-nez v7, :cond_c

    .line 424
    .line 425
    iput-boolean v6, v0, LY2/e;->m:Z

    .line 426
    .line 427
    iget v7, v0, LY2/e;->p:I

    .line 428
    .line 429
    iput v7, v0, LY2/e;->n:I

    .line 430
    .line 431
    iput v5, v0, LY2/e;->o:I

    .line 432
    .line 433
    :cond_c
    iput v11, v0, LY2/e;->i:I

    .line 434
    .line 435
    iput v2, v0, LY2/e;->j:I

    .line 436
    .line 437
    goto/16 :goto_0

    .line 438
    .line 439
    :cond_d
    const/16 v16, 0x7

    .line 440
    .line 441
    iget-object v5, v1, LQ1/o;->a:[B

    .line 442
    .line 443
    iget v7, v1, LQ1/o;->b:I

    .line 444
    .line 445
    iget v14, v1, LQ1/o;->c:I

    .line 446
    .line 447
    :goto_4
    if-ge v7, v14, :cond_26

    .line 448
    .line 449
    add-int/lit8 v15, v7, 0x1

    .line 450
    .line 451
    aget-byte v9, v5, v7

    .line 452
    .line 453
    move/from16 v18, v11

    .line 454
    .line 455
    and-int/lit16 v11, v9, 0xff

    .line 456
    .line 457
    iget v12, v0, LY2/e;->k:I

    .line 458
    .line 459
    const/16 v3, 0x200

    .line 460
    .line 461
    if-ne v12, v3, :cond_20

    .line 462
    .line 463
    int-to-byte v12, v11

    .line 464
    and-int/lit16 v12, v12, 0xff

    .line 465
    .line 466
    const v20, 0xff00

    .line 467
    .line 468
    .line 469
    or-int v12, v20, v12

    .line 470
    .line 471
    const v21, 0xfff6

    .line 472
    .line 473
    .line 474
    and-int v12, v12, v21

    .line 475
    .line 476
    const v3, 0xfff0

    .line 477
    .line 478
    .line 479
    if-ne v12, v3, :cond_20

    .line 480
    .line 481
    iget-boolean v12, v0, LY2/e;->m:Z

    .line 482
    .line 483
    if-nez v12, :cond_1d

    .line 484
    .line 485
    add-int/lit8 v12, v7, -0x1

    .line 486
    .line 487
    invoke-virtual {v1, v7}, LQ1/o;->G(I)V

    .line 488
    .line 489
    .line 490
    iget-object v3, v8, LJ5/y;->b:[B

    .line 491
    .line 492
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 493
    .line 494
    .line 495
    move-result v4

    .line 496
    if-ge v4, v6, :cond_e

    .line 497
    .line 498
    move/from16 v22, v6

    .line 499
    .line 500
    :goto_5
    const/4 v2, -0x1

    .line 501
    goto/16 :goto_a

    .line 502
    .line 503
    :cond_e
    invoke-virtual {v1, v2, v6, v3}, LQ1/o;->f(II[B)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v8, v10}, LJ5/y;->q(I)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v8, v6}, LJ5/y;->i(I)I

    .line 510
    .line 511
    .line 512
    move-result v3

    .line 513
    iget v4, v0, LY2/e;->n:I

    .line 514
    .line 515
    const/4 v10, -0x1

    .line 516
    if-eq v4, v10, :cond_f

    .line 517
    .line 518
    if-eq v3, v4, :cond_f

    .line 519
    .line 520
    move/from16 v22, v6

    .line 521
    .line 522
    move v2, v10

    .line 523
    goto/16 :goto_a

    .line 524
    .line 525
    :cond_f
    iget v4, v0, LY2/e;->o:I

    .line 526
    .line 527
    if-eq v4, v10, :cond_12

    .line 528
    .line 529
    iget-object v4, v8, LJ5/y;->b:[B

    .line 530
    .line 531
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 532
    .line 533
    .line 534
    move-result v10

    .line 535
    if-ge v10, v6, :cond_10

    .line 536
    .line 537
    move/from16 v22, v6

    .line 538
    .line 539
    :goto_6
    const/4 v2, -0x1

    .line 540
    goto/16 :goto_b

    .line 541
    .line 542
    :cond_10
    invoke-virtual {v1, v2, v6, v4}, LQ1/o;->f(II[B)V

    .line 543
    .line 544
    .line 545
    const/4 v4, 0x2

    .line 546
    invoke-virtual {v8, v4}, LJ5/y;->q(I)V

    .line 547
    .line 548
    .line 549
    const/4 v4, 0x4

    .line 550
    invoke-virtual {v8, v4}, LJ5/y;->i(I)I

    .line 551
    .line 552
    .line 553
    move-result v10

    .line 554
    move/from16 v22, v6

    .line 555
    .line 556
    iget v6, v0, LY2/e;->o:I

    .line 557
    .line 558
    if-eq v10, v6, :cond_11

    .line 559
    .line 560
    :goto_7
    goto :goto_5

    .line 561
    :cond_11
    invoke-virtual {v1, v15}, LQ1/o;->G(I)V

    .line 562
    .line 563
    .line 564
    goto :goto_8

    .line 565
    :cond_12
    move/from16 v22, v6

    .line 566
    .line 567
    const/4 v4, 0x4

    .line 568
    :goto_8
    iget-object v6, v8, LJ5/y;->b:[B

    .line 569
    .line 570
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 571
    .line 572
    .line 573
    move-result v10

    .line 574
    if-ge v10, v4, :cond_13

    .line 575
    .line 576
    :goto_9
    goto :goto_6

    .line 577
    :cond_13
    invoke-virtual {v1, v2, v4, v6}, LQ1/o;->f(II[B)V

    .line 578
    .line 579
    .line 580
    const/16 v6, 0xe

    .line 581
    .line 582
    invoke-virtual {v8, v6}, LJ5/y;->q(I)V

    .line 583
    .line 584
    .line 585
    const/16 v6, 0xd

    .line 586
    .line 587
    invoke-virtual {v8, v6}, LJ5/y;->i(I)I

    .line 588
    .line 589
    .line 590
    move-result v10

    .line 591
    move/from16 v4, v16

    .line 592
    .line 593
    if-ge v10, v4, :cond_14

    .line 594
    .line 595
    goto :goto_7

    .line 596
    :cond_14
    iget-object v4, v1, LQ1/o;->a:[B

    .line 597
    .line 598
    iget v6, v1, LQ1/o;->c:I

    .line 599
    .line 600
    add-int/2addr v12, v10

    .line 601
    if-lt v12, v6, :cond_15

    .line 602
    .line 603
    goto :goto_9

    .line 604
    :cond_15
    aget-byte v10, v4, v12

    .line 605
    .line 606
    const/4 v2, -0x1

    .line 607
    if-ne v10, v2, :cond_17

    .line 608
    .line 609
    add-int/lit8 v12, v12, 0x1

    .line 610
    .line 611
    if-ne v12, v6, :cond_16

    .line 612
    .line 613
    goto :goto_b

    .line 614
    :cond_16
    aget-byte v4, v4, v12

    .line 615
    .line 616
    and-int/lit16 v6, v4, 0xff

    .line 617
    .line 618
    or-int v6, v20, v6

    .line 619
    .line 620
    and-int v6, v6, v21

    .line 621
    .line 622
    const v10, 0xfff0

    .line 623
    .line 624
    .line 625
    if-ne v6, v10, :cond_1c

    .line 626
    .line 627
    and-int/lit8 v4, v4, 0x8

    .line 628
    .line 629
    shr-int/lit8 v4, v4, 0x3

    .line 630
    .line 631
    if-ne v4, v3, :cond_1c

    .line 632
    .line 633
    goto :goto_b

    .line 634
    :cond_17
    const/16 v3, 0x49

    .line 635
    .line 636
    if-eq v10, v3, :cond_18

    .line 637
    .line 638
    goto :goto_a

    .line 639
    :cond_18
    add-int/lit8 v3, v12, 0x1

    .line 640
    .line 641
    if-ne v3, v6, :cond_19

    .line 642
    .line 643
    goto :goto_b

    .line 644
    :cond_19
    aget-byte v3, v4, v3

    .line 645
    .line 646
    const/16 v10, 0x44

    .line 647
    .line 648
    if-eq v3, v10, :cond_1a

    .line 649
    .line 650
    goto :goto_a

    .line 651
    :cond_1a
    const/16 v19, 0x2

    .line 652
    .line 653
    add-int/lit8 v12, v12, 0x2

    .line 654
    .line 655
    if-ne v12, v6, :cond_1b

    .line 656
    .line 657
    goto :goto_b

    .line 658
    :cond_1b
    aget-byte v3, v4, v12

    .line 659
    .line 660
    const/16 v4, 0x33

    .line 661
    .line 662
    if-ne v3, v4, :cond_1c

    .line 663
    .line 664
    goto :goto_b

    .line 665
    :cond_1c
    :goto_a
    move/from16 v3, v22

    .line 666
    .line 667
    goto :goto_e

    .line 668
    :cond_1d
    move v2, v4

    .line 669
    move/from16 v22, v6

    .line 670
    .line 671
    :goto_b
    and-int/lit8 v3, v9, 0x8

    .line 672
    .line 673
    shr-int/lit8 v3, v3, 0x3

    .line 674
    .line 675
    iput v3, v0, LY2/e;->p:I

    .line 676
    .line 677
    and-int/lit8 v3, v9, 0x1

    .line 678
    .line 679
    if-nez v3, :cond_1e

    .line 680
    .line 681
    move/from16 v3, v22

    .line 682
    .line 683
    goto :goto_c

    .line 684
    :cond_1e
    const/4 v3, 0x0

    .line 685
    :goto_c
    iput-boolean v3, v0, LY2/e;->l:Z

    .line 686
    .line 687
    iget-boolean v3, v0, LY2/e;->m:Z

    .line 688
    .line 689
    if-nez v3, :cond_1f

    .line 690
    .line 691
    move/from16 v3, v22

    .line 692
    .line 693
    iput v3, v0, LY2/e;->i:I

    .line 694
    .line 695
    const/4 v4, 0x0

    .line 696
    iput v4, v0, LY2/e;->j:I

    .line 697
    .line 698
    goto :goto_d

    .line 699
    :cond_1f
    move/from16 v5, v18

    .line 700
    .line 701
    move/from16 v3, v22

    .line 702
    .line 703
    const/4 v4, 0x0

    .line 704
    iput v5, v0, LY2/e;->i:I

    .line 705
    .line 706
    iput v4, v0, LY2/e;->j:I

    .line 707
    .line 708
    :goto_d
    invoke-virtual {v1, v15}, LQ1/o;->G(I)V

    .line 709
    .line 710
    .line 711
    const/4 v4, 0x2

    .line 712
    const/4 v10, 0x0

    .line 713
    goto/16 :goto_11

    .line 714
    .line 715
    :cond_20
    move v2, v4

    .line 716
    move v3, v6

    .line 717
    :goto_e
    iget v4, v0, LY2/e;->k:I

    .line 718
    .line 719
    or-int v6, v4, v11

    .line 720
    .line 721
    const/16 v9, 0x149

    .line 722
    .line 723
    if-eq v6, v9, :cond_25

    .line 724
    .line 725
    const/16 v9, 0x1ff

    .line 726
    .line 727
    if-eq v6, v9, :cond_24

    .line 728
    .line 729
    const/16 v9, 0x344

    .line 730
    .line 731
    if-eq v6, v9, :cond_23

    .line 732
    .line 733
    const/16 v9, 0x433

    .line 734
    .line 735
    if-eq v6, v9, :cond_22

    .line 736
    .line 737
    const/16 v6, 0x100

    .line 738
    .line 739
    if-eq v4, v6, :cond_21

    .line 740
    .line 741
    iput v6, v0, LY2/e;->k:I

    .line 742
    .line 743
    const/4 v4, 0x2

    .line 744
    const/4 v9, 0x3

    .line 745
    const/4 v10, 0x0

    .line 746
    goto :goto_10

    .line 747
    :cond_21
    const/4 v4, 0x2

    .line 748
    const/4 v9, 0x3

    .line 749
    const/4 v10, 0x0

    .line 750
    goto :goto_f

    .line 751
    :cond_22
    const/4 v4, 0x2

    .line 752
    iput v4, v0, LY2/e;->i:I

    .line 753
    .line 754
    const/4 v9, 0x3

    .line 755
    iput v9, v0, LY2/e;->j:I

    .line 756
    .line 757
    const/4 v10, 0x0

    .line 758
    iput v10, v0, LY2/e;->s:I

    .line 759
    .line 760
    invoke-virtual {v13, v10}, LQ1/o;->G(I)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v1, v15}, LQ1/o;->G(I)V

    .line 764
    .line 765
    .line 766
    goto :goto_11

    .line 767
    :cond_23
    const/4 v4, 0x2

    .line 768
    const/16 v6, 0x100

    .line 769
    .line 770
    const/4 v9, 0x3

    .line 771
    const/4 v10, 0x0

    .line 772
    const/16 v7, 0x400

    .line 773
    .line 774
    iput v7, v0, LY2/e;->k:I

    .line 775
    .line 776
    goto :goto_f

    .line 777
    :cond_24
    const/4 v4, 0x2

    .line 778
    const/16 v6, 0x100

    .line 779
    .line 780
    const/16 v7, 0x200

    .line 781
    .line 782
    const/4 v9, 0x3

    .line 783
    const/4 v10, 0x0

    .line 784
    iput v7, v0, LY2/e;->k:I

    .line 785
    .line 786
    goto :goto_f

    .line 787
    :cond_25
    const/4 v4, 0x2

    .line 788
    const/16 v6, 0x100

    .line 789
    .line 790
    const/4 v9, 0x3

    .line 791
    const/4 v10, 0x0

    .line 792
    const/16 v7, 0x300

    .line 793
    .line 794
    iput v7, v0, LY2/e;->k:I

    .line 795
    .line 796
    :goto_f
    move v7, v15

    .line 797
    :goto_10
    move v11, v9

    .line 798
    const/16 v12, 0xd

    .line 799
    .line 800
    const/16 v16, 0x7

    .line 801
    .line 802
    move v9, v6

    .line 803
    move v6, v3

    .line 804
    move v3, v4

    .line 805
    move v4, v2

    .line 806
    move v2, v10

    .line 807
    const/4 v10, 0x4

    .line 808
    goto/16 :goto_4

    .line 809
    .line 810
    :cond_26
    move v10, v2

    .line 811
    move v2, v4

    .line 812
    move v4, v3

    .line 813
    move v3, v6

    .line 814
    invoke-virtual {v1, v7}, LQ1/o;->G(I)V

    .line 815
    .line 816
    .line 817
    :goto_11
    move v6, v3

    .line 818
    move v3, v4

    .line 819
    move v4, v2

    .line 820
    move v2, v10

    .line 821
    goto/16 :goto_0

    .line 822
    .line 823
    :cond_27
    return-void
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
    iput-object v0, p0, LY2/e;->f:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, LT5/B;->b()V

    .line 12
    .line 13
    .line 14
    iget v0, p2, LT5/B;->e:I

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-interface {p1, v0, v1}, Ls2/o;->m(II)Ls2/C;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, LY2/e;->g:Ls2/C;

    .line 22
    .line 23
    iput-object v0, p0, LY2/e;->u:Ls2/C;

    .line 24
    .line 25
    iget-boolean v0, p0, LY2/e;->a:Z

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p2}, LT5/B;->a()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, LT5/B;->b()V

    .line 33
    .line 34
    .line 35
    iget v0, p2, LT5/B;->e:I

    .line 36
    .line 37
    const/4 v1, 0x5

    .line 38
    invoke-interface {p1, v0, v1}, Ls2/o;->m(II)Ls2/C;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, LY2/e;->h:Ls2/C;

    .line 43
    .line 44
    new-instance v0, LN1/m;

    .line 45
    .line 46
    invoke-direct {v0}, LN1/m;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, LT5/B;->b()V

    .line 50
    .line 51
    .line 52
    iget-object p2, p2, LT5/B;->f:Ljava/lang/String;

    .line 53
    .line 54
    iput-object p2, v0, LN1/m;->a:Ljava/lang/String;

    .line 55
    .line 56
    const-string p2, "application/id3"

    .line 57
    .line 58
    invoke-static {p2}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    iput-object p2, v0, LN1/m;->m:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v0, p1}, LVa/M6;->y(LN1/m;Ls2/C;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_0
    new-instance p1, Ls2/l;

    .line 69
    .line 70
    invoke-direct {p1}, Ls2/l;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, LY2/e;->h:Ls2/C;

    .line 74
    .line 75
    return-void
.end method

.method public final h(Z)V
    .locals 0

    .line 1
    return-void
.end method
