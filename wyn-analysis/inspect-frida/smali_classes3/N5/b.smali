.class public final LN5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ5/k;


# instance fields
.field public final a:LY4/b;

.field public final b:LY4/b;

.field public final c:LY4/b;

.field public final d:LY4/b;

.field public final e:LN5/c;

.field public f:Lf6/N;

.field public g:I

.field public h:Z

.field public i:J

.field public j:I

.field public k:I

.field public l:I

.field public m:J

.field public n:Z

.field public o:LN5/a;

.field public p:LN5/e;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LY4/b;

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, v1}, LY4/b;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LN5/b;->a:LY4/b;

    .line 11
    .line 12
    new-instance v0, LY4/b;

    .line 13
    .line 14
    const/16 v1, 0x9

    .line 15
    .line 16
    invoke-direct {v0, v1}, LY4/b;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, LN5/b;->b:LY4/b;

    .line 20
    .line 21
    new-instance v0, LY4/b;

    .line 22
    .line 23
    const/16 v1, 0xb

    .line 24
    .line 25
    invoke-direct {v0, v1}, LY4/b;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, LN5/b;->c:LY4/b;

    .line 29
    .line 30
    new-instance v0, LY4/b;

    .line 31
    .line 32
    invoke-direct {v0}, LY4/b;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, LN5/b;->d:LY4/b;

    .line 36
    .line 37
    new-instance v0, LN5/c;

    .line 38
    .line 39
    new-instance v1, LJ5/j;

    .line 40
    .line 41
    invoke-direct {v1}, LJ5/j;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, v1}, LA7/B0;-><init>(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    iput-wide v1, v0, LN5/c;->b:J

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    new-array v2, v1, [J

    .line 56
    .line 57
    iput-object v2, v0, LN5/c;->c:[J

    .line 58
    .line 59
    new-array v1, v1, [J

    .line 60
    .line 61
    iput-object v1, v0, LN5/c;->d:[J

    .line 62
    .line 63
    iput-object v0, p0, LN5/b;->e:LN5/c;

    .line 64
    .line 65
    const/4 v0, 0x1

    .line 66
    iput v0, p0, LN5/b;->g:I

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 0

    .line 1
    const-wide/16 p3, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, p3

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput p1, p0, LN5/b;->g:I

    .line 10
    .line 11
    iput-boolean p2, p0, LN5/b;->h:Z

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x3

    .line 15
    iput p1, p0, LN5/b;->g:I

    .line 16
    .line 17
    :goto_0
    iput p2, p0, LN5/b;->j:I

    .line 18
    .line 19
    return-void
.end method

.method public final b(LJ5/h;)LY4/b;
    .locals 5

    .line 1
    iget v0, p0, LN5/b;->l:I

    .line 2
    .line 3
    iget-object v1, p0, LN5/b;->d:LY4/b;

    .line 4
    .line 5
    iget-object v2, v1, LY4/b;->a:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    const/4 v4, 0x0

    .line 9
    if-le v0, v3, :cond_0

    .line 10
    .line 11
    array-length v2, v2

    .line 12
    mul-int/lit8 v2, v2, 0x2

    .line 13
    .line 14
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    new-array v0, v0, [B

    .line 19
    .line 20
    invoke-virtual {v1, v4, v0}, LY4/b;->y(I[B)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v1, v4}, LY4/b;->A(I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget v0, p0, LN5/b;->l:I

    .line 28
    .line 29
    invoke-virtual {v1, v0}, LY4/b;->z(I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, v1, LY4/b;->a:[B

    .line 33
    .line 34
    iget v2, p0, LN5/b;->l:I

    .line 35
    .line 36
    invoke-virtual {p1, v0, v4, v2, v4}, LJ5/h;->f([BIIZ)Z

    .line 37
    .line 38
    .line 39
    return-object v1
.end method

.method public final g(LJ5/l;LJ5/n;)I
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LN5/b;->f:Lf6/N;

    .line 4
    .line 5
    invoke-static {v1}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    :goto_0
    iget v1, v0, LN5/b;->g:I

    .line 9
    .line 10
    const/4 v2, 0x4

    .line 11
    const/4 v4, 0x1

    .line 12
    const/16 v5, 0x9

    .line 13
    .line 14
    const/16 v6, 0x8

    .line 15
    .line 16
    const/4 v7, 0x2

    .line 17
    if-eq v1, v4, :cond_29

    .line 18
    .line 19
    const/4 v8, 0x3

    .line 20
    if-eq v1, v7, :cond_28

    .line 21
    .line 22
    if-eq v1, v8, :cond_26

    .line 23
    .line 24
    if-ne v1, v2, :cond_25

    .line 25
    .line 26
    iget-boolean v1, v0, LN5/b;->h:Z

    .line 27
    .line 28
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iget-object v12, v0, LN5/b;->e:LN5/c;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-wide v13, v0, LN5/b;->i:J

    .line 38
    .line 39
    iget-wide v10, v0, LN5/b;->m:J

    .line 40
    .line 41
    add-long/2addr v13, v10

    .line 42
    :goto_1
    move-wide/from16 v18, v13

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    iget-wide v10, v12, LN5/c;->b:J

    .line 46
    .line 47
    cmp-long v1, v10, v8

    .line 48
    .line 49
    if-nez v1, :cond_2

    .line 50
    .line 51
    const-wide/16 v18, 0x0

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    iget-wide v13, v0, LN5/b;->m:J

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :goto_2
    iget v1, v0, LN5/b;->k:I

    .line 58
    .line 59
    if-ne v1, v6, :cond_e

    .line 60
    .line 61
    iget-object v6, v0, LN5/b;->o:LN5/a;

    .line 62
    .line 63
    if-eqz v6, :cond_e

    .line 64
    .line 65
    iget-boolean v1, v0, LN5/b;->n:Z

    .line 66
    .line 67
    if-nez v1, :cond_3

    .line 68
    .line 69
    iget-object v1, v0, LN5/b;->f:Lf6/N;

    .line 70
    .line 71
    new-instance v5, LJ5/o;

    .line 72
    .line 73
    invoke-direct {v5, v8, v9}, LJ5/o;-><init>(J)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v5}, Lf6/N;->x(LJ5/t;)V

    .line 77
    .line 78
    .line 79
    iput-boolean v4, v0, LN5/b;->n:Z

    .line 80
    .line 81
    :cond_3
    iget-object v1, v0, LN5/b;->o:LN5/a;

    .line 82
    .line 83
    move-object/from16 v5, p1

    .line 84
    .line 85
    check-cast v5, LJ5/h;

    .line 86
    .line 87
    invoke-virtual {v0, v5}, LN5/b;->b(LJ5/h;)LY4/b;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    iget-boolean v6, v1, LN5/a;->b:Z

    .line 92
    .line 93
    const/4 v10, 0x1

    .line 94
    if-nez v6, :cond_9

    .line 95
    .line 96
    invoke-virtual {v5}, LY4/b;->q()I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    shr-int/lit8 v11, v6, 0x4

    .line 101
    .line 102
    and-int/lit8 v11, v11, 0xf

    .line 103
    .line 104
    iput v11, v1, LN5/a;->d:I

    .line 105
    .line 106
    iget-object v13, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v13, LJ5/w;

    .line 109
    .line 110
    const/4 v14, 0x2

    .line 111
    if-ne v11, v14, :cond_4

    .line 112
    .line 113
    shr-int/2addr v6, v14

    .line 114
    and-int/lit8 v6, v6, 0x3

    .line 115
    .line 116
    sget-object v11, LN5/a;->e:[I

    .line 117
    .line 118
    aget v6, v11, v6

    .line 119
    .line 120
    new-instance v11, LE5/S;

    .line 121
    .line 122
    invoke-direct {v11}, LE5/S;-><init>()V

    .line 123
    .line 124
    .line 125
    const-string v14, "audio/mpeg"

    .line 126
    .line 127
    iput-object v14, v11, LE5/S;->k:Ljava/lang/String;

    .line 128
    .line 129
    iput v10, v11, LE5/S;->x:I

    .line 130
    .line 131
    iput v6, v11, LE5/S;->y:I

    .line 132
    .line 133
    new-instance v6, LE5/T;

    .line 134
    .line 135
    invoke-direct {v6, v11}, LE5/T;-><init>(LE5/S;)V

    .line 136
    .line 137
    .line 138
    invoke-interface {v13, v6}, LJ5/w;->a(LE5/T;)V

    .line 139
    .line 140
    .line 141
    iput-boolean v10, v1, LN5/a;->c:Z

    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_4
    const/4 v6, 0x7

    .line 145
    if-eq v11, v6, :cond_7

    .line 146
    .line 147
    const/16 v14, 0x8

    .line 148
    .line 149
    if-ne v11, v14, :cond_5

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_5
    const/16 v6, 0xa

    .line 153
    .line 154
    if-ne v11, v6, :cond_6

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_6
    new-instance v2, LN5/d;

    .line 158
    .line 159
    new-instance v3, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const-string v4, "Audio format not supported: "

    .line 162
    .line 163
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    iget v1, v1, LN5/a;->d:I

    .line 167
    .line 168
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-direct {v2, v1}, LN5/d;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v2

    .line 179
    :cond_7
    :goto_3
    if-ne v11, v6, :cond_8

    .line 180
    .line 181
    const-string v6, "audio/g711-alaw"

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_8
    const-string v6, "audio/g711-mlaw"

    .line 185
    .line 186
    :goto_4
    new-instance v11, LE5/S;

    .line 187
    .line 188
    invoke-direct {v11}, LE5/S;-><init>()V

    .line 189
    .line 190
    .line 191
    iput-object v6, v11, LE5/S;->k:Ljava/lang/String;

    .line 192
    .line 193
    iput v10, v11, LE5/S;->x:I

    .line 194
    .line 195
    const/16 v6, 0x1f40

    .line 196
    .line 197
    iput v6, v11, LE5/S;->y:I

    .line 198
    .line 199
    new-instance v6, LE5/T;

    .line 200
    .line 201
    invoke-direct {v6, v11}, LE5/T;-><init>(LE5/S;)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v13, v6}, LJ5/w;->a(LE5/T;)V

    .line 205
    .line 206
    .line 207
    iput-boolean v10, v1, LN5/a;->c:Z

    .line 208
    .line 209
    :goto_5
    iput-boolean v10, v1, LN5/a;->b:Z

    .line 210
    .line 211
    goto :goto_6

    .line 212
    :cond_9
    invoke-virtual {v5, v10}, LY4/b;->B(I)V

    .line 213
    .line 214
    .line 215
    :goto_6
    iget v6, v1, LN5/a;->d:I

    .line 216
    .line 217
    const/4 v10, 0x2

    .line 218
    iget-object v11, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v11, LJ5/w;

    .line 221
    .line 222
    const/4 v13, 0x1

    .line 223
    if-ne v6, v10, :cond_a

    .line 224
    .line 225
    invoke-virtual {v5}, LY4/b;->a()I

    .line 226
    .line 227
    .line 228
    move-result v6

    .line 229
    invoke-interface {v11, v6, v5}, LJ5/w;->c(ILY4/b;)V

    .line 230
    .line 231
    .line 232
    iget-object v1, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 233
    .line 234
    move-object/from16 v17, v1

    .line 235
    .line 236
    check-cast v17, LJ5/w;

    .line 237
    .line 238
    const/16 v20, 0x1

    .line 239
    .line 240
    const/16 v22, 0x0

    .line 241
    .line 242
    const/16 v23, 0x0

    .line 243
    .line 244
    move/from16 v21, v6

    .line 245
    .line 246
    invoke-interface/range {v17 .. v23}, LJ5/w;->b(JIIILJ5/v;)V

    .line 247
    .line 248
    .line 249
    const/16 p2, 0x0

    .line 250
    .line 251
    goto :goto_7

    .line 252
    :cond_a
    invoke-virtual {v5}, LY4/b;->q()I

    .line 253
    .line 254
    .line 255
    move-result v6

    .line 256
    const/4 v10, 0x0

    .line 257
    if-nez v6, :cond_c

    .line 258
    .line 259
    iget-boolean v14, v1, LN5/a;->c:Z

    .line 260
    .line 261
    if-nez v14, :cond_c

    .line 262
    .line 263
    invoke-virtual {v5}, LY4/b;->a()I

    .line 264
    .line 265
    .line 266
    move-result v6

    .line 267
    new-array v14, v6, [B

    .line 268
    .line 269
    invoke-virtual {v5, v10, v6, v14}, LY4/b;->c(II[B)V

    .line 270
    .line 271
    .line 272
    new-instance v5, LJ5/y;

    .line 273
    .line 274
    const/4 v15, 0x6

    .line 275
    const/16 p2, 0x0

    .line 276
    .line 277
    const/4 v3, 0x0

    .line 278
    invoke-direct {v5, v14, v6, v15, v3}, LJ5/y;-><init>([BIIB)V

    .line 279
    .line 280
    .line 281
    invoke-static {v5, v10}, LG5/b;->f(LJ5/y;Z)LG5/a;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    new-instance v5, LE5/S;

    .line 286
    .line 287
    invoke-direct {v5}, LE5/S;-><init>()V

    .line 288
    .line 289
    .line 290
    const-string v6, "audio/mp4a-latm"

    .line 291
    .line 292
    iput-object v6, v5, LE5/S;->k:Ljava/lang/String;

    .line 293
    .line 294
    iget-object v6, v3, LG5/a;->c:Ljava/lang/String;

    .line 295
    .line 296
    iput-object v6, v5, LE5/S;->h:Ljava/lang/String;

    .line 297
    .line 298
    iget v6, v3, LG5/a;->b:I

    .line 299
    .line 300
    iput v6, v5, LE5/S;->x:I

    .line 301
    .line 302
    iget v3, v3, LG5/a;->a:I

    .line 303
    .line 304
    iput v3, v5, LE5/S;->y:I

    .line 305
    .line 306
    invoke-static {v14}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    iput-object v3, v5, LE5/S;->m:Ljava/util/List;

    .line 311
    .line 312
    new-instance v3, LE5/T;

    .line 313
    .line 314
    invoke-direct {v3, v5}, LE5/T;-><init>(LE5/S;)V

    .line 315
    .line 316
    .line 317
    invoke-interface {v11, v3}, LJ5/w;->a(LE5/T;)V

    .line 318
    .line 319
    .line 320
    iput-boolean v13, v1, LN5/a;->c:Z

    .line 321
    .line 322
    :cond_b
    move v13, v10

    .line 323
    goto :goto_7

    .line 324
    :cond_c
    const/16 p2, 0x0

    .line 325
    .line 326
    iget v3, v1, LN5/a;->d:I

    .line 327
    .line 328
    const/16 v14, 0xa

    .line 329
    .line 330
    if-ne v3, v14, :cond_d

    .line 331
    .line 332
    if-ne v6, v13, :cond_b

    .line 333
    .line 334
    :cond_d
    invoke-virtual {v5}, LY4/b;->a()I

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    invoke-interface {v11, v3, v5}, LJ5/w;->c(ILY4/b;)V

    .line 339
    .line 340
    .line 341
    iget-object v1, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 342
    .line 343
    move-object/from16 v17, v1

    .line 344
    .line 345
    check-cast v17, LJ5/w;

    .line 346
    .line 347
    const/16 v20, 0x1

    .line 348
    .line 349
    const/16 v22, 0x0

    .line 350
    .line 351
    const/16 v23, 0x0

    .line 352
    .line 353
    move/from16 v21, v3

    .line 354
    .line 355
    invoke-interface/range {v17 .. v23}, LJ5/w;->b(JIIILJ5/v;)V

    .line 356
    .line 357
    .line 358
    :goto_7
    move v1, v4

    .line 359
    move-wide/from16 v16, v8

    .line 360
    .line 361
    goto/16 :goto_11

    .line 362
    .line 363
    :cond_e
    const/16 p2, 0x0

    .line 364
    .line 365
    if-ne v1, v5, :cond_19

    .line 366
    .line 367
    iget-object v3, v0, LN5/b;->p:LN5/e;

    .line 368
    .line 369
    if-eqz v3, :cond_19

    .line 370
    .line 371
    iget-boolean v1, v0, LN5/b;->n:Z

    .line 372
    .line 373
    if-nez v1, :cond_f

    .line 374
    .line 375
    iget-object v1, v0, LN5/b;->f:Lf6/N;

    .line 376
    .line 377
    new-instance v3, LJ5/o;

    .line 378
    .line 379
    invoke-direct {v3, v8, v9}, LJ5/o;-><init>(J)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v1, v3}, Lf6/N;->x(LJ5/t;)V

    .line 383
    .line 384
    .line 385
    iput-boolean v4, v0, LN5/b;->n:Z

    .line 386
    .line 387
    :cond_f
    iget-object v1, v0, LN5/b;->p:LN5/e;

    .line 388
    .line 389
    move-object/from16 v3, p1

    .line 390
    .line 391
    check-cast v3, LJ5/h;

    .line 392
    .line 393
    invoke-virtual {v0, v3}, LN5/b;->b(LJ5/h;)LY4/b;

    .line 394
    .line 395
    .line 396
    move-result-object v3

    .line 397
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v3}, LY4/b;->q()I

    .line 401
    .line 402
    .line 403
    move-result v5

    .line 404
    shr-int/lit8 v6, v5, 0x4

    .line 405
    .line 406
    and-int/lit8 v6, v6, 0xf

    .line 407
    .line 408
    and-int/lit8 v5, v5, 0xf

    .line 409
    .line 410
    const/4 v10, 0x7

    .line 411
    if-ne v5, v10, :cond_18

    .line 412
    .line 413
    iput v6, v1, LN5/e;->g:I

    .line 414
    .line 415
    const/4 v5, 0x5

    .line 416
    if-eq v6, v5, :cond_10

    .line 417
    .line 418
    const/4 v5, 0x1

    .line 419
    goto :goto_8

    .line 420
    :cond_10
    const/4 v5, 0x0

    .line 421
    :goto_8
    if-eqz v5, :cond_16

    .line 422
    .line 423
    invoke-virtual {v3}, LY4/b;->q()I

    .line 424
    .line 425
    .line 426
    move-result v5

    .line 427
    iget-object v6, v3, LY4/b;->a:[B

    .line 428
    .line 429
    iget v10, v3, LY4/b;->b:I

    .line 430
    .line 431
    add-int/lit8 v11, v10, 0x1

    .line 432
    .line 433
    iput v11, v3, LY4/b;->b:I

    .line 434
    .line 435
    aget-byte v13, v6, v10

    .line 436
    .line 437
    and-int/lit16 v13, v13, 0xff

    .line 438
    .line 439
    shl-int/lit8 v13, v13, 0x18

    .line 440
    .line 441
    shr-int/lit8 v13, v13, 0x8

    .line 442
    .line 443
    add-int/lit8 v14, v10, 0x2

    .line 444
    .line 445
    iput v14, v3, LY4/b;->b:I

    .line 446
    .line 447
    aget-byte v11, v6, v11

    .line 448
    .line 449
    and-int/lit16 v11, v11, 0xff

    .line 450
    .line 451
    shl-int/lit8 v11, v11, 0x8

    .line 452
    .line 453
    or-int/2addr v11, v13

    .line 454
    add-int/lit8 v10, v10, 0x3

    .line 455
    .line 456
    iput v10, v3, LY4/b;->b:I

    .line 457
    .line 458
    aget-byte v6, v6, v14

    .line 459
    .line 460
    and-int/lit16 v6, v6, 0xff

    .line 461
    .line 462
    or-int/2addr v6, v11

    .line 463
    int-to-long v10, v6

    .line 464
    const-wide/16 v13, 0x3e8

    .line 465
    .line 466
    mul-long/2addr v10, v13

    .line 467
    add-long v25, v10, v18

    .line 468
    .line 469
    const/4 v6, 0x1

    .line 470
    iget-object v10, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast v10, LJ5/w;

    .line 473
    .line 474
    const/4 v11, 0x0

    .line 475
    if-nez v5, :cond_12

    .line 476
    .line 477
    iget-boolean v13, v1, LN5/e;->e:Z

    .line 478
    .line 479
    if-nez v13, :cond_12

    .line 480
    .line 481
    new-instance v5, LY4/b;

    .line 482
    .line 483
    invoke-virtual {v3}, LY4/b;->a()I

    .line 484
    .line 485
    .line 486
    move-result v13

    .line 487
    new-array v13, v13, [B

    .line 488
    .line 489
    invoke-direct {v5, v13}, LY4/b;-><init>([B)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v3}, LY4/b;->a()I

    .line 493
    .line 494
    .line 495
    move-result v14

    .line 496
    invoke-virtual {v3, v11, v14, v13}, LY4/b;->c(II[B)V

    .line 497
    .line 498
    .line 499
    invoke-static {v5}, Lv6/a;->a(LY4/b;)Lv6/a;

    .line 500
    .line 501
    .line 502
    move-result-object v3

    .line 503
    iget v5, v3, Lv6/a;->b:I

    .line 504
    .line 505
    iput v5, v1, LN5/e;->d:I

    .line 506
    .line 507
    new-instance v5, LE5/S;

    .line 508
    .line 509
    invoke-direct {v5}, LE5/S;-><init>()V

    .line 510
    .line 511
    .line 512
    const-string v13, "video/avc"

    .line 513
    .line 514
    iput-object v13, v5, LE5/S;->k:Ljava/lang/String;

    .line 515
    .line 516
    iget-object v13, v3, Lv6/a;->f:Ljava/lang/String;

    .line 517
    .line 518
    iput-object v13, v5, LE5/S;->h:Ljava/lang/String;

    .line 519
    .line 520
    iget v13, v3, Lv6/a;->c:I

    .line 521
    .line 522
    iput v13, v5, LE5/S;->p:I

    .line 523
    .line 524
    iget v13, v3, Lv6/a;->d:I

    .line 525
    .line 526
    iput v13, v5, LE5/S;->q:I

    .line 527
    .line 528
    iget v13, v3, Lv6/a;->e:F

    .line 529
    .line 530
    iput v13, v5, LE5/S;->t:F

    .line 531
    .line 532
    iget-object v3, v3, Lv6/a;->a:Ljava/util/ArrayList;

    .line 533
    .line 534
    iput-object v3, v5, LE5/S;->m:Ljava/util/List;

    .line 535
    .line 536
    new-instance v3, LE5/T;

    .line 537
    .line 538
    invoke-direct {v3, v5}, LE5/T;-><init>(LE5/S;)V

    .line 539
    .line 540
    .line 541
    invoke-interface {v10, v3}, LJ5/w;->a(LE5/T;)V

    .line 542
    .line 543
    .line 544
    iput-boolean v6, v1, LN5/e;->e:Z

    .line 545
    .line 546
    :cond_11
    :goto_9
    move-wide/from16 v16, v8

    .line 547
    .line 548
    move v6, v11

    .line 549
    goto :goto_c

    .line 550
    :cond_12
    if-ne v5, v6, :cond_11

    .line 551
    .line 552
    iget-boolean v5, v1, LN5/e;->e:Z

    .line 553
    .line 554
    if-eqz v5, :cond_11

    .line 555
    .line 556
    iget v5, v1, LN5/e;->g:I

    .line 557
    .line 558
    if-ne v5, v6, :cond_13

    .line 559
    .line 560
    move/from16 v27, v6

    .line 561
    .line 562
    goto :goto_a

    .line 563
    :cond_13
    move/from16 v27, v11

    .line 564
    .line 565
    :goto_a
    iget-boolean v5, v1, LN5/e;->f:Z

    .line 566
    .line 567
    if-nez v5, :cond_14

    .line 568
    .line 569
    if-nez v27, :cond_14

    .line 570
    .line 571
    goto :goto_9

    .line 572
    :cond_14
    iget-object v5, v1, LN5/e;->c:LY4/b;

    .line 573
    .line 574
    iget-object v13, v5, LY4/b;->a:[B

    .line 575
    .line 576
    aput-byte v11, v13, v11

    .line 577
    .line 578
    aput-byte v11, v13, v6

    .line 579
    .line 580
    const/4 v14, 0x2

    .line 581
    aput-byte v11, v13, v14

    .line 582
    .line 583
    iget v13, v1, LN5/e;->d:I

    .line 584
    .line 585
    const/4 v14, 0x4

    .line 586
    rsub-int/lit8 v13, v13, 0x4

    .line 587
    .line 588
    move/from16 v28, v11

    .line 589
    .line 590
    :goto_b
    invoke-virtual {v3}, LY4/b;->a()I

    .line 591
    .line 592
    .line 593
    move-result v15

    .line 594
    if-lez v15, :cond_15

    .line 595
    .line 596
    iget-object v15, v5, LY4/b;->a:[B

    .line 597
    .line 598
    move-wide/from16 v16, v8

    .line 599
    .line 600
    iget v8, v1, LN5/e;->d:I

    .line 601
    .line 602
    invoke-virtual {v3, v13, v8, v15}, LY4/b;->c(II[B)V

    .line 603
    .line 604
    .line 605
    invoke-virtual {v5, v11}, LY4/b;->A(I)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v5}, LY4/b;->t()I

    .line 609
    .line 610
    .line 611
    move-result v8

    .line 612
    iget-object v9, v1, LN5/e;->b:LY4/b;

    .line 613
    .line 614
    invoke-virtual {v9, v11}, LY4/b;->A(I)V

    .line 615
    .line 616
    .line 617
    invoke-interface {v10, v14, v9}, LJ5/w;->c(ILY4/b;)V

    .line 618
    .line 619
    .line 620
    add-int/lit8 v28, v28, 0x4

    .line 621
    .line 622
    invoke-interface {v10, v8, v3}, LJ5/w;->c(ILY4/b;)V

    .line 623
    .line 624
    .line 625
    add-int v28, v28, v8

    .line 626
    .line 627
    move-wide/from16 v8, v16

    .line 628
    .line 629
    goto :goto_b

    .line 630
    :cond_15
    move-wide/from16 v16, v8

    .line 631
    .line 632
    const/16 v30, 0x0

    .line 633
    .line 634
    iget-object v3, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 635
    .line 636
    move-object/from16 v24, v3

    .line 637
    .line 638
    check-cast v24, LJ5/w;

    .line 639
    .line 640
    const/16 v29, 0x0

    .line 641
    .line 642
    invoke-interface/range {v24 .. v30}, LJ5/w;->b(JIIILJ5/v;)V

    .line 643
    .line 644
    .line 645
    iput-boolean v6, v1, LN5/e;->f:Z

    .line 646
    .line 647
    :goto_c
    if-eqz v6, :cond_17

    .line 648
    .line 649
    move v1, v4

    .line 650
    goto :goto_d

    .line 651
    :cond_16
    move-wide/from16 v16, v8

    .line 652
    .line 653
    :cond_17
    move/from16 v1, p2

    .line 654
    .line 655
    :goto_d
    move v13, v1

    .line 656
    :goto_e
    move v1, v4

    .line 657
    goto/16 :goto_11

    .line 658
    .line 659
    :cond_18
    new-instance v1, LN5/d;

    .line 660
    .line 661
    const-string v2, "Video format not supported: "

    .line 662
    .line 663
    invoke-static {v5, v2}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v2

    .line 667
    invoke-direct {v1, v2}, LN5/d;-><init>(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    throw v1

    .line 671
    :cond_19
    move-wide/from16 v16, v8

    .line 672
    .line 673
    const/16 v3, 0x12

    .line 674
    .line 675
    if-ne v1, v3, :cond_22

    .line 676
    .line 677
    iget-boolean v1, v0, LN5/b;->n:Z

    .line 678
    .line 679
    if-nez v1, :cond_22

    .line 680
    .line 681
    move-object/from16 v1, p1

    .line 682
    .line 683
    check-cast v1, LJ5/h;

    .line 684
    .line 685
    invoke-virtual {v0, v1}, LN5/b;->b(LJ5/h;)LY4/b;

    .line 686
    .line 687
    .line 688
    move-result-object v1

    .line 689
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v1}, LY4/b;->q()I

    .line 696
    .line 697
    .line 698
    move-result v3

    .line 699
    const/4 v5, 0x2

    .line 700
    const/4 v6, 0x0

    .line 701
    if-eq v3, v5, :cond_1a

    .line 702
    .line 703
    goto/16 :goto_10

    .line 704
    .line 705
    :cond_1a
    invoke-static {v1}, LN5/c;->g0(LY4/b;)Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v3

    .line 709
    const-string v5, "onMetaData"

    .line 710
    .line 711
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 712
    .line 713
    .line 714
    move-result v3

    .line 715
    if-nez v3, :cond_1b

    .line 716
    .line 717
    goto/16 :goto_10

    .line 718
    .line 719
    :cond_1b
    invoke-virtual {v1}, LY4/b;->a()I

    .line 720
    .line 721
    .line 722
    move-result v3

    .line 723
    if-nez v3, :cond_1c

    .line 724
    .line 725
    goto/16 :goto_10

    .line 726
    .line 727
    :cond_1c
    invoke-virtual {v1}, LY4/b;->q()I

    .line 728
    .line 729
    .line 730
    move-result v3

    .line 731
    const/16 v5, 0x8

    .line 732
    .line 733
    if-eq v3, v5, :cond_1d

    .line 734
    .line 735
    goto/16 :goto_10

    .line 736
    .line 737
    :cond_1d
    invoke-static {v1}, LN5/c;->f0(LY4/b;)Ljava/util/HashMap;

    .line 738
    .line 739
    .line 740
    move-result-object v1

    .line 741
    const-string v3, "duration"

    .line 742
    .line 743
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    move-result-object v3

    .line 747
    instance-of v5, v3, Ljava/lang/Double;

    .line 748
    .line 749
    const-wide v8, 0x412e848000000000L    # 1000000.0

    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    if-eqz v5, :cond_1e

    .line 755
    .line 756
    check-cast v3, Ljava/lang/Double;

    .line 757
    .line 758
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 759
    .line 760
    .line 761
    move-result-wide v10

    .line 762
    const-wide/16 v13, 0x0

    .line 763
    .line 764
    cmpl-double v3, v10, v13

    .line 765
    .line 766
    if-lez v3, :cond_1e

    .line 767
    .line 768
    mul-double/2addr v10, v8

    .line 769
    double-to-long v10, v10

    .line 770
    iput-wide v10, v12, LN5/c;->b:J

    .line 771
    .line 772
    :cond_1e
    const-string v3, "keyframes"

    .line 773
    .line 774
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v1

    .line 778
    instance-of v3, v1, Ljava/util/Map;

    .line 779
    .line 780
    if-eqz v3, :cond_20

    .line 781
    .line 782
    check-cast v1, Ljava/util/Map;

    .line 783
    .line 784
    const-string v3, "filepositions"

    .line 785
    .line 786
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v3

    .line 790
    const-string v5, "times"

    .line 791
    .line 792
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v1

    .line 796
    instance-of v5, v3, Ljava/util/List;

    .line 797
    .line 798
    if-eqz v5, :cond_20

    .line 799
    .line 800
    instance-of v5, v1, Ljava/util/List;

    .line 801
    .line 802
    if-eqz v5, :cond_20

    .line 803
    .line 804
    check-cast v3, Ljava/util/List;

    .line 805
    .line 806
    check-cast v1, Ljava/util/List;

    .line 807
    .line 808
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 809
    .line 810
    .line 811
    move-result v5

    .line 812
    new-array v10, v5, [J

    .line 813
    .line 814
    iput-object v10, v12, LN5/c;->c:[J

    .line 815
    .line 816
    new-array v10, v5, [J

    .line 817
    .line 818
    iput-object v10, v12, LN5/c;->d:[J

    .line 819
    .line 820
    move v10, v6

    .line 821
    :goto_f
    if-ge v10, v5, :cond_20

    .line 822
    .line 823
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object v11

    .line 827
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v13

    .line 831
    instance-of v14, v13, Ljava/lang/Double;

    .line 832
    .line 833
    if-eqz v14, :cond_1f

    .line 834
    .line 835
    instance-of v14, v11, Ljava/lang/Double;

    .line 836
    .line 837
    if-eqz v14, :cond_1f

    .line 838
    .line 839
    iget-object v14, v12, LN5/c;->c:[J

    .line 840
    .line 841
    check-cast v13, Ljava/lang/Double;

    .line 842
    .line 843
    invoke-virtual {v13}, Ljava/lang/Double;->doubleValue()D

    .line 844
    .line 845
    .line 846
    move-result-wide v18

    .line 847
    move-wide/from16 v20, v8

    .line 848
    .line 849
    mul-double v8, v18, v20

    .line 850
    .line 851
    double-to-long v8, v8

    .line 852
    aput-wide v8, v14, v10

    .line 853
    .line 854
    iget-object v8, v12, LN5/c;->d:[J

    .line 855
    .line 856
    check-cast v11, Ljava/lang/Double;

    .line 857
    .line 858
    invoke-virtual {v11}, Ljava/lang/Double;->longValue()J

    .line 859
    .line 860
    .line 861
    move-result-wide v13

    .line 862
    aput-wide v13, v8, v10

    .line 863
    .line 864
    add-int/lit8 v10, v10, 0x1

    .line 865
    .line 866
    move-wide/from16 v8, v20

    .line 867
    .line 868
    goto :goto_f

    .line 869
    :cond_1f
    new-array v1, v6, [J

    .line 870
    .line 871
    iput-object v1, v12, LN5/c;->c:[J

    .line 872
    .line 873
    new-array v1, v6, [J

    .line 874
    .line 875
    iput-object v1, v12, LN5/c;->d:[J

    .line 876
    .line 877
    :cond_20
    :goto_10
    iget-wide v5, v12, LN5/c;->b:J

    .line 878
    .line 879
    cmp-long v1, v5, v16

    .line 880
    .line 881
    if-eqz v1, :cond_21

    .line 882
    .line 883
    iget-object v1, v0, LN5/b;->f:Lf6/N;

    .line 884
    .line 885
    new-instance v3, LJ5/r;

    .line 886
    .line 887
    iget-object v8, v12, LN5/c;->d:[J

    .line 888
    .line 889
    iget-object v9, v12, LN5/c;->c:[J

    .line 890
    .line 891
    invoke-direct {v3, v8, v9, v5, v6}, LJ5/r;-><init>([J[JJ)V

    .line 892
    .line 893
    .line 894
    invoke-virtual {v1, v3}, Lf6/N;->x(LJ5/t;)V

    .line 895
    .line 896
    .line 897
    iput-boolean v4, v0, LN5/b;->n:Z

    .line 898
    .line 899
    :cond_21
    move/from16 v13, p2

    .line 900
    .line 901
    goto/16 :goto_e

    .line 902
    .line 903
    :cond_22
    iget v1, v0, LN5/b;->l:I

    .line 904
    .line 905
    move-object/from16 v3, p1

    .line 906
    .line 907
    check-cast v3, LJ5/h;

    .line 908
    .line 909
    invoke-virtual {v3, v1}, LJ5/h;->j(I)V

    .line 910
    .line 911
    .line 912
    move/from16 v1, p2

    .line 913
    .line 914
    move v13, v1

    .line 915
    :goto_11
    iget-boolean v3, v0, LN5/b;->h:Z

    .line 916
    .line 917
    if-nez v3, :cond_24

    .line 918
    .line 919
    if-eqz v13, :cond_24

    .line 920
    .line 921
    iput-boolean v4, v0, LN5/b;->h:Z

    .line 922
    .line 923
    iget-wide v3, v12, LN5/c;->b:J

    .line 924
    .line 925
    cmp-long v3, v3, v16

    .line 926
    .line 927
    if-nez v3, :cond_23

    .line 928
    .line 929
    iget-wide v3, v0, LN5/b;->m:J

    .line 930
    .line 931
    neg-long v10, v3

    .line 932
    goto :goto_12

    .line 933
    :cond_23
    const-wide/16 v10, 0x0

    .line 934
    .line 935
    :goto_12
    iput-wide v10, v0, LN5/b;->i:J

    .line 936
    .line 937
    :cond_24
    iput v2, v0, LN5/b;->j:I

    .line 938
    .line 939
    iput v7, v0, LN5/b;->g:I

    .line 940
    .line 941
    if-eqz v1, :cond_0

    .line 942
    .line 943
    return p2

    .line 944
    :cond_25
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 945
    .line 946
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 947
    .line 948
    .line 949
    throw v1

    .line 950
    :cond_26
    const/16 p2, 0x0

    .line 951
    .line 952
    iget-object v1, v0, LN5/b;->c:LY4/b;

    .line 953
    .line 954
    iget-object v3, v1, LY4/b;->a:[B

    .line 955
    .line 956
    const/16 v5, 0xb

    .line 957
    .line 958
    move-object/from16 v6, p1

    .line 959
    .line 960
    check-cast v6, LJ5/h;

    .line 961
    .line 962
    move/from16 v7, p2

    .line 963
    .line 964
    invoke-virtual {v6, v3, v7, v5, v4}, LJ5/h;->f([BIIZ)Z

    .line 965
    .line 966
    .line 967
    move-result v3

    .line 968
    if-nez v3, :cond_27

    .line 969
    .line 970
    goto :goto_13

    .line 971
    :cond_27
    invoke-virtual {v1, v7}, LY4/b;->A(I)V

    .line 972
    .line 973
    .line 974
    invoke-virtual {v1}, LY4/b;->q()I

    .line 975
    .line 976
    .line 977
    move-result v3

    .line 978
    iput v3, v0, LN5/b;->k:I

    .line 979
    .line 980
    invoke-virtual {v1}, LY4/b;->s()I

    .line 981
    .line 982
    .line 983
    move-result v3

    .line 984
    iput v3, v0, LN5/b;->l:I

    .line 985
    .line 986
    invoke-virtual {v1}, LY4/b;->s()I

    .line 987
    .line 988
    .line 989
    move-result v3

    .line 990
    int-to-long v3, v3

    .line 991
    iput-wide v3, v0, LN5/b;->m:J

    .line 992
    .line 993
    invoke-virtual {v1}, LY4/b;->q()I

    .line 994
    .line 995
    .line 996
    move-result v3

    .line 997
    shl-int/lit8 v3, v3, 0x18

    .line 998
    .line 999
    int-to-long v3, v3

    .line 1000
    iget-wide v5, v0, LN5/b;->m:J

    .line 1001
    .line 1002
    or-long/2addr v3, v5

    .line 1003
    const-wide/16 v5, 0x3e8

    .line 1004
    .line 1005
    mul-long/2addr v3, v5

    .line 1006
    iput-wide v3, v0, LN5/b;->m:J

    .line 1007
    .line 1008
    invoke-virtual {v1, v8}, LY4/b;->B(I)V

    .line 1009
    .line 1010
    .line 1011
    iput v2, v0, LN5/b;->g:I

    .line 1012
    .line 1013
    goto/16 :goto_0

    .line 1014
    .line 1015
    :cond_28
    iget v1, v0, LN5/b;->j:I

    .line 1016
    .line 1017
    move-object/from16 v2, p1

    .line 1018
    .line 1019
    check-cast v2, LJ5/h;

    .line 1020
    .line 1021
    invoke-virtual {v2, v1}, LJ5/h;->j(I)V

    .line 1022
    .line 1023
    .line 1024
    const/4 v1, 0x0

    .line 1025
    iput v1, v0, LN5/b;->j:I

    .line 1026
    .line 1027
    iput v8, v0, LN5/b;->g:I

    .line 1028
    .line 1029
    goto/16 :goto_0

    .line 1030
    .line 1031
    :cond_29
    const/4 v1, 0x0

    .line 1032
    iget-object v3, v0, LN5/b;->b:LY4/b;

    .line 1033
    .line 1034
    iget-object v8, v3, LY4/b;->a:[B

    .line 1035
    .line 1036
    move-object/from16 v9, p1

    .line 1037
    .line 1038
    check-cast v9, LJ5/h;

    .line 1039
    .line 1040
    invoke-virtual {v9, v8, v1, v5, v4}, LJ5/h;->f([BIIZ)Z

    .line 1041
    .line 1042
    .line 1043
    move-result v8

    .line 1044
    if-nez v8, :cond_2a

    .line 1045
    .line 1046
    :goto_13
    const/4 v1, -0x1

    .line 1047
    return v1

    .line 1048
    :cond_2a
    invoke-virtual {v3, v1}, LY4/b;->A(I)V

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {v3, v2}, LY4/b;->B(I)V

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v3}, LY4/b;->q()I

    .line 1055
    .line 1056
    .line 1057
    move-result v2

    .line 1058
    and-int/lit8 v8, v2, 0x4

    .line 1059
    .line 1060
    if-eqz v8, :cond_2b

    .line 1061
    .line 1062
    move v8, v4

    .line 1063
    goto :goto_14

    .line 1064
    :cond_2b
    move v8, v1

    .line 1065
    :goto_14
    and-int/lit8 v2, v2, 0x1

    .line 1066
    .line 1067
    if-eqz v2, :cond_2c

    .line 1068
    .line 1069
    move v1, v4

    .line 1070
    :cond_2c
    if-eqz v8, :cond_2d

    .line 1071
    .line 1072
    iget-object v2, v0, LN5/b;->o:LN5/a;

    .line 1073
    .line 1074
    if-nez v2, :cond_2d

    .line 1075
    .line 1076
    new-instance v2, LN5/a;

    .line 1077
    .line 1078
    iget-object v8, v0, LN5/b;->f:Lf6/N;

    .line 1079
    .line 1080
    invoke-virtual {v8, v6, v4}, Lf6/N;->m(II)LJ5/w;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v4

    .line 1084
    invoke-direct {v2, v4}, LA7/B0;-><init>(Ljava/lang/Object;)V

    .line 1085
    .line 1086
    .line 1087
    iput-object v2, v0, LN5/b;->o:LN5/a;

    .line 1088
    .line 1089
    :cond_2d
    if-eqz v1, :cond_2e

    .line 1090
    .line 1091
    iget-object v1, v0, LN5/b;->p:LN5/e;

    .line 1092
    .line 1093
    if-nez v1, :cond_2e

    .line 1094
    .line 1095
    new-instance v1, LN5/e;

    .line 1096
    .line 1097
    iget-object v2, v0, LN5/b;->f:Lf6/N;

    .line 1098
    .line 1099
    invoke-virtual {v2, v5, v7}, Lf6/N;->m(II)LJ5/w;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v2

    .line 1103
    invoke-direct {v1, v2}, LN5/e;-><init>(LJ5/w;)V

    .line 1104
    .line 1105
    .line 1106
    iput-object v1, v0, LN5/b;->p:LN5/e;

    .line 1107
    .line 1108
    :cond_2e
    iget-object v1, v0, LN5/b;->f:Lf6/N;

    .line 1109
    .line 1110
    invoke-virtual {v1}, Lf6/N;->l()V

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v3}, LY4/b;->d()I

    .line 1114
    .line 1115
    .line 1116
    move-result v1

    .line 1117
    add-int/lit8 v1, v1, -0x5

    .line 1118
    .line 1119
    iput v1, v0, LN5/b;->j:I

    .line 1120
    .line 1121
    iput v7, v0, LN5/b;->g:I

    .line 1122
    .line 1123
    goto/16 :goto_0
.end method

.method public final h(Lf6/N;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN5/b;->f:Lf6/N;

    .line 2
    .line 3
    return-void
.end method

.method public final i(LJ5/l;)Z
    .locals 4

    .line 1
    iget-object v0, p0, LN5/b;->a:LY4/b;

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
    const/4 v3, 0x3

    .line 9
    invoke-virtual {p1, v1, v2, v3, v2}, LJ5/h;->c([BIIZ)Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v2}, LY4/b;->A(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, LY4/b;->s()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const v3, 0x464c56

    .line 20
    .line 21
    .line 22
    if-eq v1, v3, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v1, v0, LY4/b;->a:[B

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    invoke-virtual {p1, v1, v2, v3, v2}, LJ5/h;->c([BIIZ)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, LY4/b;->A(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, LY4/b;->v()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    and-int/lit16 v1, v1, 0xfa

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-object v1, v0, LY4/b;->a:[B

    .line 44
    .line 45
    const/4 v3, 0x4

    .line 46
    invoke-virtual {p1, v1, v2, v3, v2}, LJ5/h;->c([BIIZ)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2}, LY4/b;->A(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, LY4/b;->d()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    iput v2, p1, LJ5/h;->f:I

    .line 57
    .line 58
    invoke-virtual {p1, v1, v2}, LJ5/h;->b(IZ)Z

    .line 59
    .line 60
    .line 61
    iget-object v1, v0, LY4/b;->a:[B

    .line 62
    .line 63
    invoke-virtual {p1, v1, v2, v3, v2}, LJ5/h;->c([BIIZ)Z

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v2}, LY4/b;->A(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, LY4/b;->d()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-nez p1, :cond_2

    .line 74
    .line 75
    const/4 p1, 0x1

    .line 76
    return p1

    .line 77
    :cond_2
    :goto_0
    return v2
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
