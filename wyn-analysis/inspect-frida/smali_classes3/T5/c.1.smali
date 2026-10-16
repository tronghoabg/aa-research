.class public final LT5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/f;


# static fields
.field public static final v:[B


# instance fields
.field public final a:Z

.field public final b:LJ5/y;

.field public final c:LY4/b;

.field public final d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:LJ5/w;

.field public g:LJ5/w;

.field public h:I

.field public i:I

.field public j:I

.field public k:Z

.field public l:Z

.field public m:I

.field public n:I

.field public o:I

.field public p:Z

.field public q:J

.field public r:I

.field public s:J

.field public t:LJ5/w;

.field public u:J


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
    sput-object v0, LT5/c;->v:[B

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

.method public constructor <init>(ZLjava/lang/String;)V
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
    const/4 v3, 0x6

    .line 10
    const/4 v4, 0x0

    .line 11
    invoke-direct {v0, v2, v1, v3, v4}, LJ5/y;-><init>([BIIB)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LT5/c;->b:LJ5/y;

    .line 15
    .line 16
    new-instance v0, LY4/b;

    .line 17
    .line 18
    sget-object v1, LT5/c;->v:[B

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
    invoke-direct {v0, v1}, LY4/b;-><init>([B)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, LT5/c;->c:LY4/b;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput v0, p0, LT5/c;->h:I

    .line 33
    .line 34
    iput v0, p0, LT5/c;->i:I

    .line 35
    .line 36
    const/16 v0, 0x100

    .line 37
    .line 38
    iput v0, p0, LT5/c;->j:I

    .line 39
    .line 40
    const/4 v0, -0x1

    .line 41
    iput v0, p0, LT5/c;->m:I

    .line 42
    .line 43
    iput v0, p0, LT5/c;->n:I

    .line 44
    .line 45
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    iput-wide v0, p0, LT5/c;->q:J

    .line 51
    .line 52
    iput-wide v0, p0, LT5/c;->s:J

    .line 53
    .line 54
    iput-boolean p1, p0, LT5/c;->a:Z

    .line 55
    .line 56
    iput-object p2, p0, LT5/c;->d:Ljava/lang/String;

    .line 57
    .line 58
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
    iput-wide v0, p0, LT5/c;->s:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, LT5/c;->l:Z

    .line 10
    .line 11
    iput v0, p0, LT5/c;->h:I

    .line 12
    .line 13
    iput v0, p0, LT5/c;->i:I

    .line 14
    .line 15
    const/16 v0, 0x100

    .line 16
    .line 17
    iput v0, p0, LT5/c;->j:I

    .line 18
    .line 19
    return-void
.end method

.method public final c(LY4/b;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    const/4 v5, 0x0

    .line 7
    const/4 v6, 0x2

    .line 8
    const/4 v7, 0x1

    .line 9
    iget-object v8, v0, LT5/c;->f:LJ5/w;

    .line 10
    .line 11
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget v8, Lu6/v;->a:I

    .line 15
    .line 16
    :cond_0
    :goto_0
    invoke-virtual {v1}, LY4/b;->a()I

    .line 17
    .line 18
    .line 19
    move-result v8

    .line 20
    if-lez v8, :cond_27

    .line 21
    .line 22
    iget v8, v0, LT5/c;->h:I

    .line 23
    .line 24
    iget-object v9, v0, LT5/c;->b:LJ5/y;

    .line 25
    .line 26
    const/16 v10, 0x100

    .line 27
    .line 28
    const/4 v11, 0x4

    .line 29
    const/4 v12, 0x3

    .line 30
    const/16 v13, 0xd

    .line 31
    .line 32
    iget-object v14, v0, LT5/c;->c:LY4/b;

    .line 33
    .line 34
    if-eqz v8, :cond_d

    .line 35
    .line 36
    if-eq v8, v7, :cond_9

    .line 37
    .line 38
    const/16 v15, 0xa

    .line 39
    .line 40
    if-eq v8, v6, :cond_8

    .line 41
    .line 42
    if-eq v8, v12, :cond_3

    .line 43
    .line 44
    if-ne v8, v11, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1}, LY4/b;->a()I

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    iget v9, v0, LT5/c;->r:I

    .line 51
    .line 52
    iget v11, v0, LT5/c;->i:I

    .line 53
    .line 54
    sub-int/2addr v9, v11

    .line 55
    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    iget-object v9, v0, LT5/c;->t:LJ5/w;

    .line 60
    .line 61
    invoke-interface {v9, v8, v1}, LJ5/w;->c(ILY4/b;)V

    .line 62
    .line 63
    .line 64
    iget v9, v0, LT5/c;->i:I

    .line 65
    .line 66
    add-int/2addr v9, v8

    .line 67
    iput v9, v0, LT5/c;->i:I

    .line 68
    .line 69
    iget v15, v0, LT5/c;->r:I

    .line 70
    .line 71
    if-ne v9, v15, :cond_0

    .line 72
    .line 73
    iget-wide v12, v0, LT5/c;->s:J

    .line 74
    .line 75
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    cmp-long v8, v12, v8

    .line 81
    .line 82
    if-eqz v8, :cond_1

    .line 83
    .line 84
    iget-object v11, v0, LT5/c;->t:LJ5/w;

    .line 85
    .line 86
    const/4 v14, 0x1

    .line 87
    const/16 v16, 0x0

    .line 88
    .line 89
    const/16 v17, 0x0

    .line 90
    .line 91
    invoke-interface/range {v11 .. v17}, LJ5/w;->b(JIIILJ5/v;)V

    .line 92
    .line 93
    .line 94
    iget-wide v8, v0, LT5/c;->s:J

    .line 95
    .line 96
    iget-wide v11, v0, LT5/c;->u:J

    .line 97
    .line 98
    add-long/2addr v8, v11

    .line 99
    iput-wide v8, v0, LT5/c;->s:J

    .line 100
    .line 101
    :cond_1
    iput v5, v0, LT5/c;->h:I

    .line 102
    .line 103
    iput v5, v0, LT5/c;->i:I

    .line 104
    .line 105
    iput v10, v0, LT5/c;->j:I

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 109
    .line 110
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 111
    .line 112
    .line 113
    throw v1

    .line 114
    :cond_3
    iget-boolean v8, v0, LT5/c;->k:Z

    .line 115
    .line 116
    const/4 v10, 0x5

    .line 117
    if-eqz v8, :cond_4

    .line 118
    .line 119
    const/4 v8, 0x7

    .line 120
    goto :goto_1

    .line 121
    :cond_4
    move v8, v10

    .line 122
    :goto_1
    iget-object v14, v9, LJ5/y;->b:[B

    .line 123
    .line 124
    const/16 v16, 0x7

    .line 125
    .line 126
    invoke-virtual {v1}, LY4/b;->a()I

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    iget v3, v0, LT5/c;->i:I

    .line 131
    .line 132
    sub-int v3, v8, v3

    .line 133
    .line 134
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    iget v4, v0, LT5/c;->i:I

    .line 139
    .line 140
    invoke-virtual {v1, v4, v3, v14}, LY4/b;->c(II[B)V

    .line 141
    .line 142
    .line 143
    iget v4, v0, LT5/c;->i:I

    .line 144
    .line 145
    add-int/2addr v4, v3

    .line 146
    iput v4, v0, LT5/c;->i:I

    .line 147
    .line 148
    if-ne v4, v8, :cond_0

    .line 149
    .line 150
    invoke-virtual {v9, v5}, LJ5/y;->q(I)V

    .line 151
    .line 152
    .line 153
    iget-boolean v3, v0, LT5/c;->p:Z

    .line 154
    .line 155
    if-nez v3, :cond_6

    .line 156
    .line 157
    invoke-virtual {v9, v6}, LJ5/y;->i(I)I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    add-int/2addr v3, v7

    .line 162
    if-eq v3, v6, :cond_5

    .line 163
    .line 164
    new-instance v4, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    const-string v8, "Detected audio object type: "

    .line 167
    .line 168
    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v3, ", but assuming AAC LC."

    .line 175
    .line 176
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    const-string v4, "AdtsReader"

    .line 184
    .line 185
    invoke-static {v4, v3}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    move v3, v6

    .line 189
    :cond_5
    invoke-virtual {v9, v10}, LJ5/y;->t(I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v9, v12}, LJ5/y;->i(I)I

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    iget v8, v0, LT5/c;->n:I

    .line 197
    .line 198
    shl-int/2addr v3, v12

    .line 199
    and-int/lit16 v3, v3, 0xf8

    .line 200
    .line 201
    shr-int/lit8 v10, v8, 0x1

    .line 202
    .line 203
    and-int/lit8 v10, v10, 0x7

    .line 204
    .line 205
    or-int/2addr v3, v10

    .line 206
    int-to-byte v3, v3

    .line 207
    shl-int/lit8 v8, v8, 0x7

    .line 208
    .line 209
    and-int/lit16 v8, v8, 0x80

    .line 210
    .line 211
    shl-int/2addr v4, v12

    .line 212
    and-int/lit8 v4, v4, 0x78

    .line 213
    .line 214
    or-int/2addr v4, v8

    .line 215
    int-to-byte v4, v4

    .line 216
    new-array v8, v6, [B

    .line 217
    .line 218
    aput-byte v3, v8, v5

    .line 219
    .line 220
    aput-byte v4, v8, v7

    .line 221
    .line 222
    new-instance v3, LJ5/y;

    .line 223
    .line 224
    invoke-direct {v3, v8, v6, v2, v5}, LJ5/y;-><init>([BIIB)V

    .line 225
    .line 226
    .line 227
    invoke-static {v3, v5}, LG5/b;->f(LJ5/y;Z)LG5/a;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    new-instance v4, LE5/S;

    .line 232
    .line 233
    invoke-direct {v4}, LE5/S;-><init>()V

    .line 234
    .line 235
    .line 236
    iget-object v10, v0, LT5/c;->e:Ljava/lang/String;

    .line 237
    .line 238
    iput-object v10, v4, LE5/S;->a:Ljava/lang/String;

    .line 239
    .line 240
    const-string v10, "audio/mp4a-latm"

    .line 241
    .line 242
    iput-object v10, v4, LE5/S;->k:Ljava/lang/String;

    .line 243
    .line 244
    iget-object v10, v3, LG5/a;->c:Ljava/lang/String;

    .line 245
    .line 246
    iput-object v10, v4, LE5/S;->h:Ljava/lang/String;

    .line 247
    .line 248
    iget v10, v3, LG5/a;->b:I

    .line 249
    .line 250
    iput v10, v4, LE5/S;->x:I

    .line 251
    .line 252
    iget v3, v3, LG5/a;->a:I

    .line 253
    .line 254
    iput v3, v4, LE5/S;->y:I

    .line 255
    .line 256
    invoke-static {v8}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    iput-object v3, v4, LE5/S;->m:Ljava/util/List;

    .line 261
    .line 262
    iget-object v3, v0, LT5/c;->d:Ljava/lang/String;

    .line 263
    .line 264
    iput-object v3, v4, LE5/S;->c:Ljava/lang/String;

    .line 265
    .line 266
    new-instance v3, LE5/T;

    .line 267
    .line 268
    invoke-direct {v3, v4}, LE5/T;-><init>(LE5/S;)V

    .line 269
    .line 270
    .line 271
    iget v4, v3, LE5/T;->z:I

    .line 272
    .line 273
    int-to-long v14, v4

    .line 274
    const-wide/32 v18, 0x3d090000

    .line 275
    .line 276
    .line 277
    div-long v14, v18, v14

    .line 278
    .line 279
    iput-wide v14, v0, LT5/c;->q:J

    .line 280
    .line 281
    iget-object v4, v0, LT5/c;->f:LJ5/w;

    .line 282
    .line 283
    invoke-interface {v4, v3}, LJ5/w;->a(LE5/T;)V

    .line 284
    .line 285
    .line 286
    iput-boolean v7, v0, LT5/c;->p:Z

    .line 287
    .line 288
    goto :goto_2

    .line 289
    :cond_6
    invoke-virtual {v9, v15}, LJ5/y;->t(I)V

    .line 290
    .line 291
    .line 292
    :goto_2
    invoke-virtual {v9, v11}, LJ5/y;->t(I)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v9, v13}, LJ5/y;->i(I)I

    .line 296
    .line 297
    .line 298
    move-result v3

    .line 299
    add-int/lit8 v4, v3, -0x7

    .line 300
    .line 301
    iget-boolean v8, v0, LT5/c;->k:Z

    .line 302
    .line 303
    if-eqz v8, :cond_7

    .line 304
    .line 305
    add-int/lit8 v4, v3, -0x9

    .line 306
    .line 307
    :cond_7
    iget-object v3, v0, LT5/c;->f:LJ5/w;

    .line 308
    .line 309
    iget-wide v8, v0, LT5/c;->q:J

    .line 310
    .line 311
    iput v11, v0, LT5/c;->h:I

    .line 312
    .line 313
    iput v5, v0, LT5/c;->i:I

    .line 314
    .line 315
    iput-object v3, v0, LT5/c;->t:LJ5/w;

    .line 316
    .line 317
    iput-wide v8, v0, LT5/c;->u:J

    .line 318
    .line 319
    iput v4, v0, LT5/c;->r:I

    .line 320
    .line 321
    goto/16 :goto_0

    .line 322
    .line 323
    :cond_8
    const/16 v16, 0x7

    .line 324
    .line 325
    iget-object v3, v14, LY4/b;->a:[B

    .line 326
    .line 327
    invoke-virtual {v1}, LY4/b;->a()I

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    iget v8, v0, LT5/c;->i:I

    .line 332
    .line 333
    rsub-int/lit8 v8, v8, 0xa

    .line 334
    .line 335
    invoke-static {v4, v8}, Ljava/lang/Math;->min(II)I

    .line 336
    .line 337
    .line 338
    move-result v4

    .line 339
    iget v8, v0, LT5/c;->i:I

    .line 340
    .line 341
    invoke-virtual {v1, v8, v4, v3}, LY4/b;->c(II[B)V

    .line 342
    .line 343
    .line 344
    iget v3, v0, LT5/c;->i:I

    .line 345
    .line 346
    add-int/2addr v3, v4

    .line 347
    iput v3, v0, LT5/c;->i:I

    .line 348
    .line 349
    if-ne v3, v15, :cond_0

    .line 350
    .line 351
    iget-object v3, v0, LT5/c;->g:LJ5/w;

    .line 352
    .line 353
    invoke-interface {v3, v15, v14}, LJ5/w;->c(ILY4/b;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v14, v2}, LY4/b;->A(I)V

    .line 357
    .line 358
    .line 359
    iget-object v3, v0, LT5/c;->g:LJ5/w;

    .line 360
    .line 361
    invoke-virtual {v14}, LY4/b;->p()I

    .line 362
    .line 363
    .line 364
    move-result v4

    .line 365
    add-int/2addr v4, v15

    .line 366
    iput v11, v0, LT5/c;->h:I

    .line 367
    .line 368
    iput v15, v0, LT5/c;->i:I

    .line 369
    .line 370
    iput-object v3, v0, LT5/c;->t:LJ5/w;

    .line 371
    .line 372
    const-wide/16 v8, 0x0

    .line 373
    .line 374
    iput-wide v8, v0, LT5/c;->u:J

    .line 375
    .line 376
    iput v4, v0, LT5/c;->r:I

    .line 377
    .line 378
    goto/16 :goto_0

    .line 379
    .line 380
    :cond_9
    const/16 v16, 0x7

    .line 381
    .line 382
    invoke-virtual {v1}, LY4/b;->a()I

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    if-nez v3, :cond_a

    .line 387
    .line 388
    goto/16 :goto_0

    .line 389
    .line 390
    :cond_a
    iget-object v3, v9, LJ5/y;->b:[B

    .line 391
    .line 392
    iget-object v4, v1, LY4/b;->a:[B

    .line 393
    .line 394
    iget v8, v1, LY4/b;->b:I

    .line 395
    .line 396
    aget-byte v4, v4, v8

    .line 397
    .line 398
    aput-byte v4, v3, v5

    .line 399
    .line 400
    invoke-virtual {v9, v6}, LJ5/y;->q(I)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v9, v11}, LJ5/y;->i(I)I

    .line 404
    .line 405
    .line 406
    move-result v3

    .line 407
    iget v4, v0, LT5/c;->n:I

    .line 408
    .line 409
    const/4 v8, -0x1

    .line 410
    if-eq v4, v8, :cond_b

    .line 411
    .line 412
    if-eq v3, v4, :cond_b

    .line 413
    .line 414
    iput-boolean v5, v0, LT5/c;->l:Z

    .line 415
    .line 416
    iput v5, v0, LT5/c;->h:I

    .line 417
    .line 418
    iput v5, v0, LT5/c;->i:I

    .line 419
    .line 420
    iput v10, v0, LT5/c;->j:I

    .line 421
    .line 422
    goto/16 :goto_0

    .line 423
    .line 424
    :cond_b
    iget-boolean v4, v0, LT5/c;->l:Z

    .line 425
    .line 426
    if-nez v4, :cond_c

    .line 427
    .line 428
    iput-boolean v7, v0, LT5/c;->l:Z

    .line 429
    .line 430
    iget v4, v0, LT5/c;->o:I

    .line 431
    .line 432
    iput v4, v0, LT5/c;->m:I

    .line 433
    .line 434
    iput v3, v0, LT5/c;->n:I

    .line 435
    .line 436
    :cond_c
    iput v12, v0, LT5/c;->h:I

    .line 437
    .line 438
    iput v5, v0, LT5/c;->i:I

    .line 439
    .line 440
    goto/16 :goto_0

    .line 441
    .line 442
    :cond_d
    const/16 v16, 0x7

    .line 443
    .line 444
    iget-object v3, v1, LY4/b;->a:[B

    .line 445
    .line 446
    iget v4, v1, LY4/b;->b:I

    .line 447
    .line 448
    iget v8, v1, LY4/b;->c:I

    .line 449
    .line 450
    :goto_3
    if-ge v4, v8, :cond_26

    .line 451
    .line 452
    add-int/lit8 v15, v4, 0x1

    .line 453
    .line 454
    aget-byte v2, v3, v4

    .line 455
    .line 456
    and-int/lit16 v10, v2, 0xff

    .line 457
    .line 458
    move/from16 v20, v12

    .line 459
    .line 460
    iget v12, v0, LT5/c;->j:I

    .line 461
    .line 462
    const/16 v13, 0x200

    .line 463
    .line 464
    if-ne v12, v13, :cond_20

    .line 465
    .line 466
    int-to-byte v12, v10

    .line 467
    and-int/lit16 v12, v12, 0xff

    .line 468
    .line 469
    const v21, 0xff00

    .line 470
    .line 471
    .line 472
    or-int v12, v21, v12

    .line 473
    .line 474
    const v22, 0xfff6

    .line 475
    .line 476
    .line 477
    and-int v12, v12, v22

    .line 478
    .line 479
    const v13, 0xfff0

    .line 480
    .line 481
    .line 482
    if-ne v12, v13, :cond_20

    .line 483
    .line 484
    iget-boolean v12, v0, LT5/c;->l:Z

    .line 485
    .line 486
    if-nez v12, :cond_1d

    .line 487
    .line 488
    const/16 v17, -0x1

    .line 489
    .line 490
    add-int/lit8 v12, v4, -0x1

    .line 491
    .line 492
    invoke-virtual {v1, v4}, LY4/b;->A(I)V

    .line 493
    .line 494
    .line 495
    iget-object v13, v9, LJ5/y;->b:[B

    .line 496
    .line 497
    invoke-virtual {v1}, LY4/b;->a()I

    .line 498
    .line 499
    .line 500
    move-result v6

    .line 501
    if-ge v6, v7, :cond_e

    .line 502
    .line 503
    move/from16 v24, v7

    .line 504
    .line 505
    :goto_4
    const/4 v5, -0x1

    .line 506
    goto/16 :goto_8

    .line 507
    .line 508
    :cond_e
    invoke-virtual {v1, v5, v7, v13}, LY4/b;->c(II[B)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v9, v11}, LJ5/y;->q(I)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v9, v7}, LJ5/y;->i(I)I

    .line 515
    .line 516
    .line 517
    move-result v6

    .line 518
    iget v13, v0, LT5/c;->m:I

    .line 519
    .line 520
    const/4 v11, -0x1

    .line 521
    if-eq v13, v11, :cond_f

    .line 522
    .line 523
    if-eq v6, v13, :cond_f

    .line 524
    .line 525
    move/from16 v24, v7

    .line 526
    .line 527
    move v5, v11

    .line 528
    goto/16 :goto_8

    .line 529
    .line 530
    :cond_f
    iget v13, v0, LT5/c;->n:I

    .line 531
    .line 532
    if-eq v13, v11, :cond_12

    .line 533
    .line 534
    iget-object v11, v9, LJ5/y;->b:[B

    .line 535
    .line 536
    invoke-virtual {v1}, LY4/b;->a()I

    .line 537
    .line 538
    .line 539
    move-result v13

    .line 540
    if-ge v13, v7, :cond_10

    .line 541
    .line 542
    goto/16 :goto_9

    .line 543
    .line 544
    :cond_10
    invoke-virtual {v1, v5, v7, v11}, LY4/b;->c(II[B)V

    .line 545
    .line 546
    .line 547
    const/4 v11, 0x2

    .line 548
    invoke-virtual {v9, v11}, LJ5/y;->q(I)V

    .line 549
    .line 550
    .line 551
    const/4 v11, 0x4

    .line 552
    invoke-virtual {v9, v11}, LJ5/y;->i(I)I

    .line 553
    .line 554
    .line 555
    move-result v13

    .line 556
    move/from16 v24, v7

    .line 557
    .line 558
    iget v7, v0, LT5/c;->n:I

    .line 559
    .line 560
    if-eq v13, v7, :cond_11

    .line 561
    .line 562
    :goto_5
    goto :goto_4

    .line 563
    :cond_11
    invoke-virtual {v1, v15}, LY4/b;->A(I)V

    .line 564
    .line 565
    .line 566
    goto :goto_6

    .line 567
    :cond_12
    move/from16 v24, v7

    .line 568
    .line 569
    const/4 v11, 0x4

    .line 570
    :goto_6
    iget-object v7, v9, LJ5/y;->b:[B

    .line 571
    .line 572
    invoke-virtual {v1}, LY4/b;->a()I

    .line 573
    .line 574
    .line 575
    move-result v13

    .line 576
    if-ge v13, v11, :cond_13

    .line 577
    .line 578
    :goto_7
    goto/16 :goto_a

    .line 579
    .line 580
    :cond_13
    invoke-virtual {v1, v5, v11, v7}, LY4/b;->c(II[B)V

    .line 581
    .line 582
    .line 583
    const/16 v7, 0xe

    .line 584
    .line 585
    invoke-virtual {v9, v7}, LJ5/y;->q(I)V

    .line 586
    .line 587
    .line 588
    const/16 v7, 0xd

    .line 589
    .line 590
    invoke-virtual {v9, v7}, LJ5/y;->i(I)I

    .line 591
    .line 592
    .line 593
    move-result v13

    .line 594
    move/from16 v7, v16

    .line 595
    .line 596
    if-ge v13, v7, :cond_14

    .line 597
    .line 598
    goto :goto_5

    .line 599
    :cond_14
    iget-object v7, v1, LY4/b;->a:[B

    .line 600
    .line 601
    iget v11, v1, LY4/b;->c:I

    .line 602
    .line 603
    add-int/2addr v12, v13

    .line 604
    if-lt v12, v11, :cond_15

    .line 605
    .line 606
    goto :goto_7

    .line 607
    :cond_15
    aget-byte v13, v7, v12

    .line 608
    .line 609
    const/4 v5, -0x1

    .line 610
    if-ne v13, v5, :cond_17

    .line 611
    .line 612
    add-int/lit8 v12, v12, 0x1

    .line 613
    .line 614
    if-ne v12, v11, :cond_16

    .line 615
    .line 616
    goto :goto_b

    .line 617
    :cond_16
    aget-byte v7, v7, v12

    .line 618
    .line 619
    and-int/lit16 v11, v7, 0xff

    .line 620
    .line 621
    or-int v11, v21, v11

    .line 622
    .line 623
    and-int v11, v11, v22

    .line 624
    .line 625
    const v12, 0xfff0

    .line 626
    .line 627
    .line 628
    if-ne v11, v12, :cond_1c

    .line 629
    .line 630
    and-int/lit8 v7, v7, 0x8

    .line 631
    .line 632
    shr-int/lit8 v7, v7, 0x3

    .line 633
    .line 634
    if-ne v7, v6, :cond_1c

    .line 635
    .line 636
    goto :goto_b

    .line 637
    :cond_17
    const/16 v6, 0x49

    .line 638
    .line 639
    if-eq v13, v6, :cond_18

    .line 640
    .line 641
    goto :goto_8

    .line 642
    :cond_18
    add-int/lit8 v6, v12, 0x1

    .line 643
    .line 644
    if-ne v6, v11, :cond_19

    .line 645
    .line 646
    goto :goto_b

    .line 647
    :cond_19
    aget-byte v6, v7, v6

    .line 648
    .line 649
    const/16 v13, 0x44

    .line 650
    .line 651
    if-eq v6, v13, :cond_1a

    .line 652
    .line 653
    goto :goto_8

    .line 654
    :cond_1a
    const/16 v23, 0x2

    .line 655
    .line 656
    add-int/lit8 v12, v12, 0x2

    .line 657
    .line 658
    if-ne v12, v11, :cond_1b

    .line 659
    .line 660
    goto :goto_b

    .line 661
    :cond_1b
    aget-byte v6, v7, v12

    .line 662
    .line 663
    const/16 v7, 0x33

    .line 664
    .line 665
    if-ne v6, v7, :cond_1c

    .line 666
    .line 667
    goto :goto_b

    .line 668
    :cond_1c
    :goto_8
    move/from16 v2, v24

    .line 669
    .line 670
    goto :goto_e

    .line 671
    :cond_1d
    :goto_9
    move/from16 v24, v7

    .line 672
    .line 673
    :goto_a
    const/4 v5, -0x1

    .line 674
    :goto_b
    and-int/lit8 v3, v2, 0x8

    .line 675
    .line 676
    shr-int/lit8 v3, v3, 0x3

    .line 677
    .line 678
    iput v3, v0, LT5/c;->o:I

    .line 679
    .line 680
    and-int/lit8 v2, v2, 0x1

    .line 681
    .line 682
    if-nez v2, :cond_1e

    .line 683
    .line 684
    move/from16 v2, v24

    .line 685
    .line 686
    goto :goto_c

    .line 687
    :cond_1e
    const/4 v2, 0x0

    .line 688
    :goto_c
    iput-boolean v2, v0, LT5/c;->k:Z

    .line 689
    .line 690
    iget-boolean v2, v0, LT5/c;->l:Z

    .line 691
    .line 692
    if-nez v2, :cond_1f

    .line 693
    .line 694
    move/from16 v2, v24

    .line 695
    .line 696
    iput v2, v0, LT5/c;->h:I

    .line 697
    .line 698
    const/4 v3, 0x0

    .line 699
    iput v3, v0, LT5/c;->i:I

    .line 700
    .line 701
    goto :goto_d

    .line 702
    :cond_1f
    move/from16 v4, v20

    .line 703
    .line 704
    move/from16 v2, v24

    .line 705
    .line 706
    const/4 v3, 0x0

    .line 707
    iput v4, v0, LT5/c;->h:I

    .line 708
    .line 709
    iput v3, v0, LT5/c;->i:I

    .line 710
    .line 711
    :goto_d
    invoke-virtual {v1, v15}, LY4/b;->A(I)V

    .line 712
    .line 713
    .line 714
    const/4 v10, 0x0

    .line 715
    const/4 v11, 0x2

    .line 716
    goto/16 :goto_11

    .line 717
    .line 718
    :cond_20
    move v2, v7

    .line 719
    const/4 v5, -0x1

    .line 720
    :goto_e
    iget v6, v0, LT5/c;->j:I

    .line 721
    .line 722
    or-int v7, v6, v10

    .line 723
    .line 724
    const/16 v10, 0x149

    .line 725
    .line 726
    if-eq v7, v10, :cond_25

    .line 727
    .line 728
    const/16 v10, 0x1ff

    .line 729
    .line 730
    if-eq v7, v10, :cond_24

    .line 731
    .line 732
    const/16 v10, 0x344

    .line 733
    .line 734
    if-eq v7, v10, :cond_23

    .line 735
    .line 736
    const/16 v10, 0x433

    .line 737
    .line 738
    if-eq v7, v10, :cond_22

    .line 739
    .line 740
    const/16 v7, 0x100

    .line 741
    .line 742
    if-eq v6, v7, :cond_21

    .line 743
    .line 744
    iput v7, v0, LT5/c;->j:I

    .line 745
    .line 746
    const/4 v6, 0x3

    .line 747
    const/4 v10, 0x0

    .line 748
    const/4 v11, 0x2

    .line 749
    goto :goto_10

    .line 750
    :cond_21
    const/4 v6, 0x3

    .line 751
    const/4 v10, 0x0

    .line 752
    const/4 v11, 0x2

    .line 753
    goto :goto_f

    .line 754
    :cond_22
    const/4 v11, 0x2

    .line 755
    iput v11, v0, LT5/c;->h:I

    .line 756
    .line 757
    const/4 v6, 0x3

    .line 758
    iput v6, v0, LT5/c;->i:I

    .line 759
    .line 760
    const/4 v10, 0x0

    .line 761
    iput v10, v0, LT5/c;->r:I

    .line 762
    .line 763
    invoke-virtual {v14, v10}, LY4/b;->A(I)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v1, v15}, LY4/b;->A(I)V

    .line 767
    .line 768
    .line 769
    goto :goto_11

    .line 770
    :cond_23
    const/4 v6, 0x3

    .line 771
    const/16 v7, 0x100

    .line 772
    .line 773
    const/4 v10, 0x0

    .line 774
    const/4 v11, 0x2

    .line 775
    const/16 v4, 0x400

    .line 776
    .line 777
    iput v4, v0, LT5/c;->j:I

    .line 778
    .line 779
    goto :goto_f

    .line 780
    :cond_24
    const/16 v4, 0x200

    .line 781
    .line 782
    const/4 v6, 0x3

    .line 783
    const/16 v7, 0x100

    .line 784
    .line 785
    const/4 v10, 0x0

    .line 786
    const/4 v11, 0x2

    .line 787
    iput v4, v0, LT5/c;->j:I

    .line 788
    .line 789
    goto :goto_f

    .line 790
    :cond_25
    const/4 v6, 0x3

    .line 791
    const/16 v7, 0x100

    .line 792
    .line 793
    const/4 v10, 0x0

    .line 794
    const/4 v11, 0x2

    .line 795
    const/16 v4, 0x300

    .line 796
    .line 797
    iput v4, v0, LT5/c;->j:I

    .line 798
    .line 799
    :goto_f
    move v4, v15

    .line 800
    :goto_10
    move v12, v6

    .line 801
    move v5, v10

    .line 802
    move v6, v11

    .line 803
    const/4 v11, 0x4

    .line 804
    const/16 v13, 0xd

    .line 805
    .line 806
    const/16 v16, 0x7

    .line 807
    .line 808
    move v10, v7

    .line 809
    move v7, v2

    .line 810
    const/4 v2, 0x6

    .line 811
    goto/16 :goto_3

    .line 812
    .line 813
    :cond_26
    move v10, v5

    .line 814
    move v11, v6

    .line 815
    move v2, v7

    .line 816
    const/4 v5, -0x1

    .line 817
    invoke-virtual {v1, v4}, LY4/b;->A(I)V

    .line 818
    .line 819
    .line 820
    :goto_11
    move v7, v2

    .line 821
    move v5, v10

    .line 822
    move v6, v11

    .line 823
    const/4 v2, 0x6

    .line 824
    goto/16 :goto_0

    .line 825
    .line 826
    :cond_27
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
    iput-wide p2, p0, LT5/c;->s:J

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
    iget-object v0, p2, LT5/B;->f:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, LT5/c;->e:Ljava/lang/String;

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
    invoke-interface {p1, v0, v1}, LJ5/m;->m(II)LJ5/w;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, LT5/c;->f:LJ5/w;

    .line 22
    .line 23
    iput-object v0, p0, LT5/c;->t:LJ5/w;

    .line 24
    .line 25
    iget-boolean v0, p0, LT5/c;->a:Z

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
    invoke-interface {p1, v0, v1}, LJ5/m;->m(II)LJ5/w;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, LT5/c;->g:LJ5/w;

    .line 43
    .line 44
    new-instance v0, LE5/S;

    .line 45
    .line 46
    invoke-direct {v0}, LE5/S;-><init>()V

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
    iput-object p2, v0, LE5/S;->a:Ljava/lang/String;

    .line 55
    .line 56
    const-string p2, "application/id3"

    .line 57
    .line 58
    iput-object p2, v0, LE5/S;->k:Ljava/lang/String;

    .line 59
    .line 60
    new-instance p2, LE5/T;

    .line 61
    .line 62
    invoke-direct {p2, v0}, LE5/T;-><init>(LE5/S;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p1, p2}, LJ5/w;->a(LE5/T;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_0
    new-instance p1, LJ5/j;

    .line 70
    .line 71
    invoke-direct {p1}, LJ5/j;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, LT5/c;->g:LJ5/w;

    .line 75
    .line 76
    return-void
.end method

.method public final i()V
    .locals 0

    .line 1
    return-void
.end method
