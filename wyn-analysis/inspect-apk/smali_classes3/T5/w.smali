.class public final LT5/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ5/k;


# instance fields
.field public final a:Lu6/t;

.field public final b:Landroid/util/SparseArray;

.field public final c:LY4/b;

.field public final d:LT5/u;

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:J

.field public i:LM5/a;

.field public j:Lf6/N;

.field public k:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Lu6/t;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-direct {v0, v1, v2}, Lu6/t;-><init>(J)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LT5/w;->a:Lu6/t;

    .line 12
    .line 13
    new-instance v0, LY4/b;

    .line 14
    .line 15
    const/16 v1, 0x1000

    .line 16
    .line 17
    invoke-direct {v0, v1}, LY4/b;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, LT5/w;->c:LY4/b;

    .line 21
    .line 22
    new-instance v0, Landroid/util/SparseArray;

    .line 23
    .line 24
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, LT5/w;->b:Landroid/util/SparseArray;

    .line 28
    .line 29
    new-instance v0, LT5/u;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, v1}, LT5/u;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, LT5/w;->d:LT5/u;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 6

    .line 1
    iget-object p1, p0, LT5/w;->a:Lu6/t;

    .line 2
    .line 3
    invoke-virtual {p1}, Lu6/t;->d()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long p2, v0, v2

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez p2, :cond_0

    .line 17
    .line 18
    move p2, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move p2, v1

    .line 21
    :goto_0
    if-nez p2, :cond_2

    .line 22
    .line 23
    invoke-virtual {p1}, Lu6/t;->c()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    cmp-long p2, v4, v2

    .line 28
    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    const-wide/16 v2, 0x0

    .line 32
    .line 33
    cmp-long p2, v4, v2

    .line 34
    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    cmp-long p2, v4, p3

    .line 38
    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v0, v1

    .line 43
    :goto_1
    move p2, v0

    .line 44
    :cond_2
    if-eqz p2, :cond_3

    .line 45
    .line 46
    invoke-virtual {p1, p3, p4}, Lu6/t;->e(J)V

    .line 47
    .line 48
    .line 49
    :cond_3
    iget-object p1, p0, LT5/w;->i:LM5/a;

    .line 50
    .line 51
    if-eqz p1, :cond_4

    .line 52
    .line 53
    invoke-virtual {p1, p3, p4}, LJ5/f;->D(J)V

    .line 54
    .line 55
    .line 56
    :cond_4
    move p1, v1

    .line 57
    :goto_2
    iget-object p2, p0, LT5/w;->b:Landroid/util/SparseArray;

    .line 58
    .line 59
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    if-ge p1, p3, :cond_5

    .line 64
    .line 65
    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    check-cast p2, LT5/v;

    .line 70
    .line 71
    iput-boolean v1, p2, LT5/v;->f:Z

    .line 72
    .line 73
    iget-object p2, p2, LT5/v;->a:LT5/f;

    .line 74
    .line 75
    invoke-interface {p2}, LT5/f;->a()V

    .line 76
    .line 77
    .line 78
    add-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    return-void
.end method

.method public final g(LJ5/l;LJ5/n;)I
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, LT5/w;->j:Lf6/N;

    .line 6
    .line 7
    invoke-static {v2}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p1

    .line 11
    .line 12
    check-cast v2, LJ5/h;

    .line 13
    .line 14
    iget-wide v12, v2, LJ5/h;->c:J

    .line 15
    .line 16
    const-wide/16 v17, -0x1

    .line 17
    .line 18
    cmp-long v2, v12, v17

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, 0x4

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v8, 0x3

    .line 24
    const/16 v11, 0x1ba

    .line 25
    .line 26
    iget-object v14, v0, LT5/w;->d:LT5/u;

    .line 27
    .line 28
    if-eqz v2, :cond_b

    .line 29
    .line 30
    iget-boolean v15, v14, LT5/u;->d:Z

    .line 31
    .line 32
    if-nez v15, :cond_b

    .line 33
    .line 34
    iget-boolean v2, v14, LT5/u;->f:Z

    .line 35
    .line 36
    iget-object v12, v14, LT5/u;->c:LY4/b;

    .line 37
    .line 38
    const-wide/16 v15, 0x0

    .line 39
    .line 40
    const-wide/16 v6, 0x4e20

    .line 41
    .line 42
    if-nez v2, :cond_3

    .line 43
    .line 44
    move-object/from16 v2, p1

    .line 45
    .line 46
    check-cast v2, LJ5/h;

    .line 47
    .line 48
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    iget-wide v9, v2, LJ5/h;->c:J

    .line 54
    .line 55
    invoke-static {v6, v7, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v6

    .line 59
    long-to-int v6, v6

    .line 60
    int-to-long v7, v6

    .line 61
    sub-long/2addr v9, v7

    .line 62
    iget-wide v7, v2, LJ5/h;->d:J

    .line 63
    .line 64
    cmp-long v7, v7, v9

    .line 65
    .line 66
    if-eqz v7, :cond_0

    .line 67
    .line 68
    iput-wide v9, v1, LJ5/n;->a:J

    .line 69
    .line 70
    return v3

    .line 71
    :cond_0
    invoke-virtual {v12, v6}, LY4/b;->x(I)V

    .line 72
    .line 73
    .line 74
    iput v5, v2, LJ5/h;->f:I

    .line 75
    .line 76
    iget-object v1, v12, LY4/b;->a:[B

    .line 77
    .line 78
    invoke-virtual {v2, v1, v5, v6, v5}, LJ5/h;->c([BIIZ)Z

    .line 79
    .line 80
    .line 81
    iget v1, v12, LY4/b;->b:I

    .line 82
    .line 83
    iget v2, v12, LY4/b;->c:I

    .line 84
    .line 85
    sub-int/2addr v2, v4

    .line 86
    :goto_0
    if-lt v2, v1, :cond_2

    .line 87
    .line 88
    iget-object v4, v12, LY4/b;->a:[B

    .line 89
    .line 90
    invoke-static {v2, v4}, LT5/u;->b(I[B)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-ne v4, v11, :cond_1

    .line 95
    .line 96
    add-int/lit8 v4, v2, 0x4

    .line 97
    .line 98
    invoke-virtual {v12, v4}, LY4/b;->A(I)V

    .line 99
    .line 100
    .line 101
    invoke-static {v12}, LT5/u;->c(LY4/b;)J

    .line 102
    .line 103
    .line 104
    move-result-wide v6

    .line 105
    cmp-long v4, v6, v19

    .line 106
    .line 107
    if-eqz v4, :cond_1

    .line 108
    .line 109
    move-wide v9, v6

    .line 110
    goto :goto_1

    .line 111
    :cond_1
    add-int/lit8 v2, v2, -0x1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    move-wide/from16 v9, v19

    .line 115
    .line 116
    :goto_1
    iput-wide v9, v14, LT5/u;->h:J

    .line 117
    .line 118
    iput-boolean v3, v14, LT5/u;->f:Z

    .line 119
    .line 120
    return v5

    .line 121
    :cond_3
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    iget-wide v9, v14, LT5/u;->h:J

    .line 127
    .line 128
    cmp-long v2, v9, v19

    .line 129
    .line 130
    if-nez v2, :cond_4

    .line 131
    .line 132
    move-object/from16 v1, p1

    .line 133
    .line 134
    check-cast v1, LJ5/h;

    .line 135
    .line 136
    invoke-virtual {v14, v1}, LT5/u;->a(LJ5/h;)V

    .line 137
    .line 138
    .line 139
    return v5

    .line 140
    :cond_4
    iget-boolean v2, v14, LT5/u;->e:Z

    .line 141
    .line 142
    if-nez v2, :cond_8

    .line 143
    .line 144
    move-object/from16 v2, p1

    .line 145
    .line 146
    check-cast v2, LJ5/h;

    .line 147
    .line 148
    iget-wide v9, v2, LJ5/h;->c:J

    .line 149
    .line 150
    invoke-static {v6, v7, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 151
    .line 152
    .line 153
    move-result-wide v6

    .line 154
    long-to-int v4, v6

    .line 155
    iget-wide v6, v2, LJ5/h;->d:J

    .line 156
    .line 157
    int-to-long v9, v5

    .line 158
    cmp-long v6, v6, v9

    .line 159
    .line 160
    if-eqz v6, :cond_5

    .line 161
    .line 162
    iput-wide v9, v1, LJ5/n;->a:J

    .line 163
    .line 164
    return v3

    .line 165
    :cond_5
    invoke-virtual {v12, v4}, LY4/b;->x(I)V

    .line 166
    .line 167
    .line 168
    iput v5, v2, LJ5/h;->f:I

    .line 169
    .line 170
    iget-object v1, v12, LY4/b;->a:[B

    .line 171
    .line 172
    invoke-virtual {v2, v1, v5, v4, v5}, LJ5/h;->c([BIIZ)Z

    .line 173
    .line 174
    .line 175
    iget v1, v12, LY4/b;->b:I

    .line 176
    .line 177
    iget v2, v12, LY4/b;->c:I

    .line 178
    .line 179
    :goto_2
    add-int/lit8 v4, v2, -0x3

    .line 180
    .line 181
    if-ge v1, v4, :cond_7

    .line 182
    .line 183
    iget-object v4, v12, LY4/b;->a:[B

    .line 184
    .line 185
    invoke-static {v1, v4}, LT5/u;->b(I[B)I

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    if-ne v4, v11, :cond_6

    .line 190
    .line 191
    add-int/lit8 v4, v1, 0x4

    .line 192
    .line 193
    invoke-virtual {v12, v4}, LY4/b;->A(I)V

    .line 194
    .line 195
    .line 196
    invoke-static {v12}, LT5/u;->c(LY4/b;)J

    .line 197
    .line 198
    .line 199
    move-result-wide v6

    .line 200
    cmp-long v4, v6, v19

    .line 201
    .line 202
    if-eqz v4, :cond_6

    .line 203
    .line 204
    move-wide v9, v6

    .line 205
    goto :goto_3

    .line 206
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_7
    move-wide/from16 v9, v19

    .line 210
    .line 211
    :goto_3
    iput-wide v9, v14, LT5/u;->g:J

    .line 212
    .line 213
    iput-boolean v3, v14, LT5/u;->e:Z

    .line 214
    .line 215
    return v5

    .line 216
    :cond_8
    iget-wide v1, v14, LT5/u;->g:J

    .line 217
    .line 218
    cmp-long v3, v1, v19

    .line 219
    .line 220
    if-nez v3, :cond_9

    .line 221
    .line 222
    move-object/from16 v1, p1

    .line 223
    .line 224
    check-cast v1, LJ5/h;

    .line 225
    .line 226
    invoke-virtual {v14, v1}, LT5/u;->a(LJ5/h;)V

    .line 227
    .line 228
    .line 229
    return v5

    .line 230
    :cond_9
    iget-object v3, v14, LT5/u;->b:Lu6/t;

    .line 231
    .line 232
    invoke-virtual {v3, v1, v2}, Lu6/t;->b(J)J

    .line 233
    .line 234
    .line 235
    move-result-wide v1

    .line 236
    iget-wide v6, v14, LT5/u;->h:J

    .line 237
    .line 238
    invoke-virtual {v3, v6, v7}, Lu6/t;->b(J)J

    .line 239
    .line 240
    .line 241
    move-result-wide v3

    .line 242
    sub-long/2addr v3, v1

    .line 243
    iput-wide v3, v14, LT5/u;->i:J

    .line 244
    .line 245
    cmp-long v1, v3, v15

    .line 246
    .line 247
    if-gez v1, :cond_a

    .line 248
    .line 249
    new-instance v1, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    const-string v2, "Invalid duration: "

    .line 252
    .line 253
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    iget-wide v2, v14, LT5/u;->i:J

    .line 257
    .line 258
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    const-string v2, ". Using TIME_UNSET instead."

    .line 262
    .line 263
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    const-string v2, "PsDurationReader"

    .line 271
    .line 272
    invoke-static {v2, v1}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    move-wide/from16 v1, v19

    .line 276
    .line 277
    iput-wide v1, v14, LT5/u;->i:J

    .line 278
    .line 279
    :cond_a
    move-object/from16 v1, p1

    .line 280
    .line 281
    check-cast v1, LJ5/h;

    .line 282
    .line 283
    invoke-virtual {v14, v1}, LT5/u;->a(LJ5/h;)V

    .line 284
    .line 285
    .line 286
    return v5

    .line 287
    :cond_b
    const-wide/16 v15, 0x0

    .line 288
    .line 289
    iget-boolean v6, v0, LT5/w;->k:Z

    .line 290
    .line 291
    if-nez v6, :cond_d

    .line 292
    .line 293
    iput-boolean v3, v0, LT5/w;->k:Z

    .line 294
    .line 295
    iget-wide v6, v14, LT5/u;->i:J

    .line 296
    .line 297
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    cmp-long v9, v6, v19

    .line 303
    .line 304
    if-eqz v9, :cond_c

    .line 305
    .line 306
    move v9, v3

    .line 307
    new-instance v3, LM5/a;

    .line 308
    .line 309
    move v10, v4

    .line 310
    new-instance v4, LXd/c;

    .line 311
    .line 312
    const/16 v5, 0x14

    .line 313
    .line 314
    invoke-direct {v4, v5}, LXd/c;-><init>(I)V

    .line 315
    .line 316
    .line 317
    new-instance v5, LS3/e;

    .line 318
    .line 319
    iget-object v14, v14, LT5/u;->b:Lu6/t;

    .line 320
    .line 321
    invoke-direct {v5, v14}, LS3/e;-><init>(Lu6/t;)V

    .line 322
    .line 323
    .line 324
    const-wide/16 v20, 0x1

    .line 325
    .line 326
    add-long v20, v6, v20

    .line 327
    .line 328
    move-wide v14, v15

    .line 329
    const/16 v16, 0x3e8

    .line 330
    .line 331
    move/from16 v22, v10

    .line 332
    .line 333
    move/from16 v23, v11

    .line 334
    .line 335
    const-wide/16 v10, 0x0

    .line 336
    .line 337
    move-wide/from16 v24, v14

    .line 338
    .line 339
    const-wide/16 v14, 0xbc

    .line 340
    .line 341
    move/from16 v26, v2

    .line 342
    .line 343
    move-wide/from16 v8, v20

    .line 344
    .line 345
    const/4 v2, 0x0

    .line 346
    invoke-direct/range {v3 .. v16}, LJ5/f;-><init>(LJ5/c;LJ5/e;JJJJJI)V

    .line 347
    .line 348
    .line 349
    iput-object v3, v0, LT5/w;->i:LM5/a;

    .line 350
    .line 351
    iget-object v4, v0, LT5/w;->j:Lf6/N;

    .line 352
    .line 353
    iget-object v3, v3, LJ5/f;->c:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v3, LJ5/a;

    .line 356
    .line 357
    invoke-virtual {v4, v3}, Lf6/N;->x(LJ5/t;)V

    .line 358
    .line 359
    .line 360
    goto :goto_4

    .line 361
    :cond_c
    move/from16 v26, v2

    .line 362
    .line 363
    move v2, v5

    .line 364
    iget-object v3, v0, LT5/w;->j:Lf6/N;

    .line 365
    .line 366
    new-instance v4, LJ5/o;

    .line 367
    .line 368
    invoke-direct {v4, v6, v7}, LJ5/o;-><init>(J)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v3, v4}, Lf6/N;->x(LJ5/t;)V

    .line 372
    .line 373
    .line 374
    goto :goto_4

    .line 375
    :cond_d
    move/from16 v26, v2

    .line 376
    .line 377
    move v2, v5

    .line 378
    :goto_4
    iget-object v3, v0, LT5/w;->i:LM5/a;

    .line 379
    .line 380
    if-eqz v3, :cond_e

    .line 381
    .line 382
    iget-object v4, v3, LJ5/f;->e:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v4, LJ5/b;

    .line 385
    .line 386
    if-eqz v4, :cond_e

    .line 387
    .line 388
    move-object/from16 v2, p1

    .line 389
    .line 390
    check-cast v2, LJ5/h;

    .line 391
    .line 392
    invoke-virtual {v3, v2, v1}, LJ5/f;->u(LJ5/h;LJ5/n;)I

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    return v1

    .line 397
    :cond_e
    move-object/from16 v1, p1

    .line 398
    .line 399
    check-cast v1, LJ5/h;

    .line 400
    .line 401
    iput v2, v1, LJ5/h;->f:I

    .line 402
    .line 403
    if-eqz v26, :cond_f

    .line 404
    .line 405
    invoke-virtual {v1}, LJ5/h;->g()J

    .line 406
    .line 407
    .line 408
    move-result-wide v3

    .line 409
    sub-long/2addr v12, v3

    .line 410
    goto :goto_5

    .line 411
    :cond_f
    move-wide/from16 v12, v17

    .line 412
    .line 413
    :goto_5
    cmp-long v3, v12, v17

    .line 414
    .line 415
    if-eqz v3, :cond_10

    .line 416
    .line 417
    const-wide/16 v3, 0x4

    .line 418
    .line 419
    cmp-long v3, v12, v3

    .line 420
    .line 421
    if-gez v3, :cond_10

    .line 422
    .line 423
    goto :goto_6

    .line 424
    :cond_10
    iget-object v3, v0, LT5/w;->c:LY4/b;

    .line 425
    .line 426
    iget-object v4, v3, LY4/b;->a:[B

    .line 427
    .line 428
    const/4 v9, 0x1

    .line 429
    const/4 v10, 0x4

    .line 430
    invoke-virtual {v1, v4, v2, v10, v9}, LJ5/h;->c([BIIZ)Z

    .line 431
    .line 432
    .line 433
    move-result v4

    .line 434
    if-nez v4, :cond_11

    .line 435
    .line 436
    goto :goto_6

    .line 437
    :cond_11
    invoke-virtual {v3, v2}, LY4/b;->A(I)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v3}, LY4/b;->d()I

    .line 441
    .line 442
    .line 443
    move-result v4

    .line 444
    const/16 v5, 0x1b9

    .line 445
    .line 446
    if-ne v4, v5, :cond_12

    .line 447
    .line 448
    :goto_6
    const/4 v1, -0x1

    .line 449
    return v1

    .line 450
    :cond_12
    const/16 v5, 0x1ba

    .line 451
    .line 452
    if-ne v4, v5, :cond_13

    .line 453
    .line 454
    iget-object v4, v3, LY4/b;->a:[B

    .line 455
    .line 456
    const/16 v5, 0xa

    .line 457
    .line 458
    invoke-virtual {v1, v4, v2, v5, v2}, LJ5/h;->c([BIIZ)Z

    .line 459
    .line 460
    .line 461
    const/16 v4, 0x9

    .line 462
    .line 463
    invoke-virtual {v3, v4}, LY4/b;->A(I)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v3}, LY4/b;->q()I

    .line 467
    .line 468
    .line 469
    move-result v3

    .line 470
    and-int/lit8 v3, v3, 0x7

    .line 471
    .line 472
    add-int/lit8 v3, v3, 0xe

    .line 473
    .line 474
    invoke-virtual {v1, v3}, LJ5/h;->j(I)V

    .line 475
    .line 476
    .line 477
    return v2

    .line 478
    :cond_13
    const/16 v5, 0x1bb

    .line 479
    .line 480
    const/4 v6, 0x2

    .line 481
    const/4 v7, 0x6

    .line 482
    if-ne v4, v5, :cond_14

    .line 483
    .line 484
    iget-object v4, v3, LY4/b;->a:[B

    .line 485
    .line 486
    invoke-virtual {v1, v4, v2, v6, v2}, LJ5/h;->c([BIIZ)Z

    .line 487
    .line 488
    .line 489
    invoke-virtual {v3, v2}, LY4/b;->A(I)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v3}, LY4/b;->v()I

    .line 493
    .line 494
    .line 495
    move-result v3

    .line 496
    add-int/2addr v3, v7

    .line 497
    invoke-virtual {v1, v3}, LJ5/h;->j(I)V

    .line 498
    .line 499
    .line 500
    return v2

    .line 501
    :cond_14
    and-int/lit16 v5, v4, -0x100

    .line 502
    .line 503
    const/16 v8, 0x8

    .line 504
    .line 505
    shr-int/2addr v5, v8

    .line 506
    const/4 v9, 0x1

    .line 507
    if-eq v5, v9, :cond_15

    .line 508
    .line 509
    invoke-virtual {v1, v9}, LJ5/h;->j(I)V

    .line 510
    .line 511
    .line 512
    return v2

    .line 513
    :cond_15
    and-int/lit16 v5, v4, 0xff

    .line 514
    .line 515
    iget-object v9, v0, LT5/w;->b:Landroid/util/SparseArray;

    .line 516
    .line 517
    invoke-virtual {v9, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v11

    .line 521
    check-cast v11, LT5/v;

    .line 522
    .line 523
    iget-boolean v12, v0, LT5/w;->e:Z

    .line 524
    .line 525
    if-nez v12, :cond_1b

    .line 526
    .line 527
    if-nez v11, :cond_19

    .line 528
    .line 529
    const/16 v12, 0xbd

    .line 530
    .line 531
    const/4 v13, 0x0

    .line 532
    if-ne v5, v12, :cond_16

    .line 533
    .line 534
    new-instance v4, LT5/a;

    .line 535
    .line 536
    const/4 v12, 0x0

    .line 537
    invoke-direct {v4, v13, v12}, LT5/a;-><init>(Ljava/lang/String;I)V

    .line 538
    .line 539
    .line 540
    const/4 v12, 0x1

    .line 541
    iput-boolean v12, v0, LT5/w;->f:Z

    .line 542
    .line 543
    iget-wide v12, v1, LJ5/h;->d:J

    .line 544
    .line 545
    iput-wide v12, v0, LT5/w;->h:J

    .line 546
    .line 547
    :goto_7
    move-object v13, v4

    .line 548
    goto :goto_8

    .line 549
    :cond_16
    and-int/lit16 v12, v4, 0xe0

    .line 550
    .line 551
    const/16 v14, 0xc0

    .line 552
    .line 553
    if-ne v12, v14, :cond_17

    .line 554
    .line 555
    new-instance v4, LT5/r;

    .line 556
    .line 557
    invoke-direct {v4, v13}, LT5/r;-><init>(Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    const/4 v12, 0x1

    .line 561
    iput-boolean v12, v0, LT5/w;->f:Z

    .line 562
    .line 563
    iget-wide v12, v1, LJ5/h;->d:J

    .line 564
    .line 565
    iput-wide v12, v0, LT5/w;->h:J

    .line 566
    .line 567
    goto :goto_7

    .line 568
    :cond_17
    and-int/lit16 v4, v4, 0xf0

    .line 569
    .line 570
    const/16 v12, 0xe0

    .line 571
    .line 572
    if-ne v4, v12, :cond_18

    .line 573
    .line 574
    new-instance v4, LT5/h;

    .line 575
    .line 576
    invoke-direct {v4, v13}, LT5/h;-><init>(LS3/e;)V

    .line 577
    .line 578
    .line 579
    const/4 v12, 0x1

    .line 580
    iput-boolean v12, v0, LT5/w;->g:Z

    .line 581
    .line 582
    iget-wide v12, v1, LJ5/h;->d:J

    .line 583
    .line 584
    iput-wide v12, v0, LT5/w;->h:J

    .line 585
    .line 586
    goto :goto_7

    .line 587
    :cond_18
    :goto_8
    if-eqz v13, :cond_19

    .line 588
    .line 589
    new-instance v4, LT5/B;

    .line 590
    .line 591
    const/16 v11, 0x100

    .line 592
    .line 593
    const/4 v12, 0x0

    .line 594
    const/4 v14, 0x0

    .line 595
    invoke-direct {v4, v5, v11, v12, v14}, LT5/B;-><init>(IIIB)V

    .line 596
    .line 597
    .line 598
    iget-object v11, v0, LT5/w;->j:Lf6/N;

    .line 599
    .line 600
    invoke-interface {v13, v11, v4}, LT5/f;->g(LJ5/m;LT5/B;)V

    .line 601
    .line 602
    .line 603
    new-instance v11, LT5/v;

    .line 604
    .line 605
    iget-object v4, v0, LT5/w;->a:Lu6/t;

    .line 606
    .line 607
    invoke-direct {v11, v13, v4}, LT5/v;-><init>(LT5/f;Lu6/t;)V

    .line 608
    .line 609
    .line 610
    invoke-virtual {v9, v5, v11}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 611
    .line 612
    .line 613
    :cond_19
    iget-boolean v4, v0, LT5/w;->f:Z

    .line 614
    .line 615
    if-eqz v4, :cond_1a

    .line 616
    .line 617
    iget-boolean v4, v0, LT5/w;->g:Z

    .line 618
    .line 619
    if-eqz v4, :cond_1a

    .line 620
    .line 621
    iget-wide v4, v0, LT5/w;->h:J

    .line 622
    .line 623
    const-wide/16 v12, 0x2000

    .line 624
    .line 625
    add-long/2addr v4, v12

    .line 626
    goto :goto_9

    .line 627
    :cond_1a
    const-wide/32 v4, 0x100000

    .line 628
    .line 629
    .line 630
    :goto_9
    iget-wide v12, v1, LJ5/h;->d:J

    .line 631
    .line 632
    cmp-long v4, v12, v4

    .line 633
    .line 634
    if-lez v4, :cond_1b

    .line 635
    .line 636
    const/4 v9, 0x1

    .line 637
    iput-boolean v9, v0, LT5/w;->e:Z

    .line 638
    .line 639
    iget-object v4, v0, LT5/w;->j:Lf6/N;

    .line 640
    .line 641
    invoke-virtual {v4}, Lf6/N;->l()V

    .line 642
    .line 643
    .line 644
    :cond_1b
    iget-object v4, v3, LY4/b;->a:[B

    .line 645
    .line 646
    invoke-virtual {v1, v4, v2, v6, v2}, LJ5/h;->c([BIIZ)Z

    .line 647
    .line 648
    .line 649
    invoke-virtual {v3, v2}, LY4/b;->A(I)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v3}, LY4/b;->v()I

    .line 653
    .line 654
    .line 655
    move-result v4

    .line 656
    add-int/2addr v4, v7

    .line 657
    if-nez v11, :cond_1c

    .line 658
    .line 659
    invoke-virtual {v1, v4}, LJ5/h;->j(I)V

    .line 660
    .line 661
    .line 662
    return v2

    .line 663
    :cond_1c
    invoke-virtual {v3, v4}, LY4/b;->x(I)V

    .line 664
    .line 665
    .line 666
    iget-object v5, v3, LY4/b;->a:[B

    .line 667
    .line 668
    invoke-virtual {v1, v5, v2, v4, v2}, LJ5/h;->f([BIIZ)Z

    .line 669
    .line 670
    .line 671
    invoke-virtual {v3, v7}, LY4/b;->A(I)V

    .line 672
    .line 673
    .line 674
    iget-object v1, v11, LT5/v;->c:LJ5/y;

    .line 675
    .line 676
    iget-object v4, v1, LJ5/y;->b:[B

    .line 677
    .line 678
    const/4 v5, 0x3

    .line 679
    invoke-virtual {v3, v2, v5, v4}, LY4/b;->c(II[B)V

    .line 680
    .line 681
    .line 682
    invoke-virtual {v1, v2}, LJ5/y;->q(I)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v1, v8}, LJ5/y;->t(I)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v1}, LJ5/y;->h()Z

    .line 689
    .line 690
    .line 691
    move-result v4

    .line 692
    iput-boolean v4, v11, LT5/v;->d:Z

    .line 693
    .line 694
    invoke-virtual {v1}, LJ5/y;->h()Z

    .line 695
    .line 696
    .line 697
    move-result v4

    .line 698
    iput-boolean v4, v11, LT5/v;->e:Z

    .line 699
    .line 700
    invoke-virtual {v1, v7}, LJ5/y;->t(I)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v1, v8}, LJ5/y;->i(I)I

    .line 704
    .line 705
    .line 706
    move-result v4

    .line 707
    iget-object v6, v1, LJ5/y;->b:[B

    .line 708
    .line 709
    invoke-virtual {v3, v2, v4, v6}, LY4/b;->c(II[B)V

    .line 710
    .line 711
    .line 712
    invoke-virtual {v1, v2}, LJ5/y;->q(I)V

    .line 713
    .line 714
    .line 715
    const-wide/16 v14, 0x0

    .line 716
    .line 717
    iput-wide v14, v11, LT5/v;->g:J

    .line 718
    .line 719
    iget-boolean v4, v11, LT5/v;->d:Z

    .line 720
    .line 721
    if-eqz v4, :cond_1e

    .line 722
    .line 723
    invoke-virtual {v1, v10}, LJ5/y;->t(I)V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v1, v5}, LJ5/y;->i(I)I

    .line 727
    .line 728
    .line 729
    move-result v4

    .line 730
    int-to-long v6, v4

    .line 731
    const/16 v4, 0x1e

    .line 732
    .line 733
    shl-long/2addr v6, v4

    .line 734
    const/4 v9, 0x1

    .line 735
    invoke-virtual {v1, v9}, LJ5/y;->t(I)V

    .line 736
    .line 737
    .line 738
    const/16 v8, 0xf

    .line 739
    .line 740
    invoke-virtual {v1, v8}, LJ5/y;->i(I)I

    .line 741
    .line 742
    .line 743
    move-result v12

    .line 744
    shl-int/2addr v12, v8

    .line 745
    int-to-long v12, v12

    .line 746
    or-long/2addr v6, v12

    .line 747
    invoke-virtual {v1, v9}, LJ5/y;->t(I)V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v1, v8}, LJ5/y;->i(I)I

    .line 751
    .line 752
    .line 753
    move-result v12

    .line 754
    int-to-long v12, v12

    .line 755
    or-long/2addr v6, v12

    .line 756
    invoke-virtual {v1, v9}, LJ5/y;->t(I)V

    .line 757
    .line 758
    .line 759
    iget-boolean v12, v11, LT5/v;->f:Z

    .line 760
    .line 761
    iget-object v13, v11, LT5/v;->b:Lu6/t;

    .line 762
    .line 763
    if-nez v12, :cond_1d

    .line 764
    .line 765
    iget-boolean v12, v11, LT5/v;->e:Z

    .line 766
    .line 767
    if-eqz v12, :cond_1d

    .line 768
    .line 769
    invoke-virtual {v1, v10}, LJ5/y;->t(I)V

    .line 770
    .line 771
    .line 772
    invoke-virtual {v1, v5}, LJ5/y;->i(I)I

    .line 773
    .line 774
    .line 775
    move-result v5

    .line 776
    int-to-long v14, v5

    .line 777
    shl-long v4, v14, v4

    .line 778
    .line 779
    invoke-virtual {v1, v9}, LJ5/y;->t(I)V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v1, v8}, LJ5/y;->i(I)I

    .line 783
    .line 784
    .line 785
    move-result v12

    .line 786
    shl-int/2addr v12, v8

    .line 787
    int-to-long v14, v12

    .line 788
    or-long/2addr v4, v14

    .line 789
    invoke-virtual {v1, v9}, LJ5/y;->t(I)V

    .line 790
    .line 791
    .line 792
    invoke-virtual {v1, v8}, LJ5/y;->i(I)I

    .line 793
    .line 794
    .line 795
    move-result v8

    .line 796
    int-to-long v14, v8

    .line 797
    or-long/2addr v4, v14

    .line 798
    invoke-virtual {v1, v9}, LJ5/y;->t(I)V

    .line 799
    .line 800
    .line 801
    invoke-virtual {v13, v4, v5}, Lu6/t;->b(J)J

    .line 802
    .line 803
    .line 804
    iput-boolean v9, v11, LT5/v;->f:Z

    .line 805
    .line 806
    :cond_1d
    invoke-virtual {v13, v6, v7}, Lu6/t;->b(J)J

    .line 807
    .line 808
    .line 809
    move-result-wide v4

    .line 810
    iput-wide v4, v11, LT5/v;->g:J

    .line 811
    .line 812
    :cond_1e
    iget-wide v4, v11, LT5/v;->g:J

    .line 813
    .line 814
    iget-object v1, v11, LT5/v;->a:LT5/f;

    .line 815
    .line 816
    invoke-interface {v1, v10, v4, v5}, LT5/f;->d(IJ)V

    .line 817
    .line 818
    .line 819
    invoke-interface {v1, v3}, LT5/f;->c(LY4/b;)V

    .line 820
    .line 821
    .line 822
    invoke-interface {v1}, LT5/f;->i()V

    .line 823
    .line 824
    .line 825
    iget-object v1, v3, LY4/b;->a:[B

    .line 826
    .line 827
    array-length v1, v1

    .line 828
    invoke-virtual {v3, v1}, LY4/b;->z(I)V

    .line 829
    .line 830
    .line 831
    return v2
.end method

.method public final h(Lf6/N;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT5/w;->j:Lf6/N;

    .line 2
    .line 3
    return-void
.end method

.method public final i(LJ5/l;)Z
    .locals 9

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    check-cast p1, LJ5/h;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {p1, v1, v2, v0, v2}, LJ5/h;->c([BIIZ)Z

    .line 9
    .line 10
    .line 11
    aget-byte v0, v1, v2

    .line 12
    .line 13
    and-int/lit16 v0, v0, 0xff

    .line 14
    .line 15
    shl-int/lit8 v0, v0, 0x18

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    aget-byte v4, v1, v3

    .line 19
    .line 20
    and-int/lit16 v4, v4, 0xff

    .line 21
    .line 22
    shl-int/lit8 v4, v4, 0x10

    .line 23
    .line 24
    or-int/2addr v0, v4

    .line 25
    const/4 v4, 0x2

    .line 26
    aget-byte v5, v1, v4

    .line 27
    .line 28
    and-int/lit16 v5, v5, 0xff

    .line 29
    .line 30
    const/16 v6, 0x8

    .line 31
    .line 32
    shl-int/2addr v5, v6

    .line 33
    or-int/2addr v0, v5

    .line 34
    const/4 v5, 0x3

    .line 35
    aget-byte v7, v1, v5

    .line 36
    .line 37
    and-int/lit16 v7, v7, 0xff

    .line 38
    .line 39
    or-int/2addr v0, v7

    .line 40
    const/16 v7, 0x1ba

    .line 41
    .line 42
    if-eq v7, v0, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v0, 0x4

    .line 46
    aget-byte v7, v1, v0

    .line 47
    .line 48
    and-int/lit16 v7, v7, 0xc4

    .line 49
    .line 50
    const/16 v8, 0x44

    .line 51
    .line 52
    if-eq v7, v8, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const/4 v7, 0x6

    .line 56
    aget-byte v7, v1, v7

    .line 57
    .line 58
    and-int/2addr v7, v0

    .line 59
    if-eq v7, v0, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    aget-byte v7, v1, v6

    .line 63
    .line 64
    and-int/2addr v7, v0

    .line 65
    if-eq v7, v0, :cond_3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    const/16 v0, 0x9

    .line 69
    .line 70
    aget-byte v0, v1, v0

    .line 71
    .line 72
    and-int/2addr v0, v3

    .line 73
    if-eq v0, v3, :cond_4

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    const/16 v0, 0xc

    .line 77
    .line 78
    aget-byte v0, v1, v0

    .line 79
    .line 80
    and-int/2addr v0, v5

    .line 81
    if-eq v0, v5, :cond_5

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    const/16 v0, 0xd

    .line 85
    .line 86
    aget-byte v0, v1, v0

    .line 87
    .line 88
    and-int/lit8 v0, v0, 0x7

    .line 89
    .line 90
    invoke-virtual {p1, v0, v2}, LJ5/h;->b(IZ)Z

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v1, v2, v5, v2}, LJ5/h;->c([BIIZ)Z

    .line 94
    .line 95
    .line 96
    aget-byte p1, v1, v2

    .line 97
    .line 98
    and-int/lit16 p1, p1, 0xff

    .line 99
    .line 100
    shl-int/lit8 p1, p1, 0x10

    .line 101
    .line 102
    aget-byte v0, v1, v3

    .line 103
    .line 104
    and-int/lit16 v0, v0, 0xff

    .line 105
    .line 106
    shl-int/2addr v0, v6

    .line 107
    or-int/2addr p1, v0

    .line 108
    aget-byte v0, v1, v4

    .line 109
    .line 110
    and-int/lit16 v0, v0, 0xff

    .line 111
    .line 112
    or-int/2addr p1, v0

    .line 113
    if-ne v3, p1, :cond_6

    .line 114
    .line 115
    return v3

    .line 116
    :cond_6
    :goto_0
    return v2
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
