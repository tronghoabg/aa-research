.class public final LS5/f;
.super LN2/i;
.source "SourceFile"


# instance fields
.field public o:LN2/j;

.field public p:I

.field public q:Z

.field public r:LJ5/z;

.field public s:LS3/l;


# virtual methods
.method public final a(J)V
    .locals 2

    .line 1
    iput-wide p1, p0, LN2/i;->d:J

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long p1, p1, v0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move p1, p2

    .line 13
    :goto_0
    iput-boolean p1, p0, LS5/f;->q:Z

    .line 14
    .line 15
    iget-object p1, p0, LS5/f;->r:LJ5/z;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget p2, p1, LJ5/z;->e:I

    .line 20
    .line 21
    :cond_1
    iput p2, p0, LS5/f;->p:I

    .line 22
    .line 23
    return-void
.end method

.method public final c(LY4/b;)J
    .locals 11

    .line 1
    iget-object v0, p1, LY4/b;->a:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-byte v0, v0, v1

    .line 5
    .line 6
    and-int/lit8 v2, v0, 0x1

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    const-wide/16 v0, -0x1

    .line 12
    .line 13
    return-wide v0

    .line 14
    :cond_0
    iget-object v2, p0, LS5/f;->o:LN2/j;

    .line 15
    .line 16
    invoke-static {v2}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    shr-int/2addr v0, v3

    .line 20
    iget v4, v2, LN2/j;->b:I

    .line 21
    .line 22
    const/16 v5, 0x8

    .line 23
    .line 24
    rsub-int/lit8 v4, v4, 0x8

    .line 25
    .line 26
    const/16 v6, 0xff

    .line 27
    .line 28
    ushr-int v4, v6, v4

    .line 29
    .line 30
    and-int/2addr v0, v4

    .line 31
    iget-object v4, v2, LN2/j;->e:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v4, [Ls8/b;

    .line 34
    .line 35
    aget-object v0, v4, v0

    .line 36
    .line 37
    iget-boolean v0, v0, Ls8/b;->b:Z

    .line 38
    .line 39
    iget-object v2, v2, LN2/j;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, LJ5/z;

    .line 42
    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    iget v0, v2, LJ5/z;->e:I

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget v0, v2, LJ5/z;->f:I

    .line 49
    .line 50
    :goto_0
    iget-boolean v2, p0, LS5/f;->q:Z

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    iget v1, p0, LS5/f;->p:I

    .line 55
    .line 56
    add-int/2addr v1, v0

    .line 57
    div-int/lit8 v1, v1, 0x4

    .line 58
    .line 59
    :cond_2
    int-to-long v1, v1

    .line 60
    iget-object v4, p1, LY4/b;->a:[B

    .line 61
    .line 62
    array-length v6, v4

    .line 63
    iget v7, p1, LY4/b;->c:I

    .line 64
    .line 65
    add-int/lit8 v7, v7, 0x4

    .line 66
    .line 67
    if-ge v6, v7, :cond_3

    .line 68
    .line 69
    invoke-static {v4, v7}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    array-length v6, v4

    .line 74
    invoke-virtual {p1, v6, v4}, LY4/b;->y(I[B)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    invoke-virtual {p1, v7}, LY4/b;->z(I)V

    .line 79
    .line 80
    .line 81
    :goto_1
    iget-object v4, p1, LY4/b;->a:[B

    .line 82
    .line 83
    iget p1, p1, LY4/b;->c:I

    .line 84
    .line 85
    add-int/lit8 v6, p1, -0x4

    .line 86
    .line 87
    const-wide/16 v7, 0xff

    .line 88
    .line 89
    and-long v9, v1, v7

    .line 90
    .line 91
    long-to-int v9, v9

    .line 92
    int-to-byte v9, v9

    .line 93
    aput-byte v9, v4, v6

    .line 94
    .line 95
    add-int/lit8 v6, p1, -0x3

    .line 96
    .line 97
    ushr-long v9, v1, v5

    .line 98
    .line 99
    and-long/2addr v9, v7

    .line 100
    long-to-int v5, v9

    .line 101
    int-to-byte v5, v5

    .line 102
    aput-byte v5, v4, v6

    .line 103
    .line 104
    add-int/lit8 v5, p1, -0x2

    .line 105
    .line 106
    const/16 v6, 0x10

    .line 107
    .line 108
    ushr-long v9, v1, v6

    .line 109
    .line 110
    and-long/2addr v9, v7

    .line 111
    long-to-int v6, v9

    .line 112
    int-to-byte v6, v6

    .line 113
    aput-byte v6, v4, v5

    .line 114
    .line 115
    sub-int/2addr p1, v3

    .line 116
    const/16 v5, 0x18

    .line 117
    .line 118
    ushr-long v5, v1, v5

    .line 119
    .line 120
    and-long/2addr v5, v7

    .line 121
    long-to-int v5, v5

    .line 122
    int-to-byte v5, v5

    .line 123
    aput-byte v5, v4, p1

    .line 124
    .line 125
    iput-boolean v3, p0, LS5/f;->q:Z

    .line 126
    .line 127
    iput v0, p0, LS5/f;->p:I

    .line 128
    .line 129
    return-wide v1
.end method

.method public final e(LY4/b;JLS3/s;)Z
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v0, LS5/f;->o:LN2/j;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    iget-object v1, v2, LS3/s;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LE5/T;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    return v4

    .line 20
    :cond_0
    iget-object v6, v0, LS5/f;->r:LJ5/z;

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    const/4 v5, 0x4

    .line 24
    const/4 v7, -0x1

    .line 25
    if-nez v6, :cond_3

    .line 26
    .line 27
    invoke-static {v3, v1, v4}, Landroid/support/v4/media/session/b;->v0(ILY4/b;Z)Z

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, LY4/b;->i()I

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, LY4/b;->q()I

    .line 34
    .line 35
    .line 36
    move-result v10

    .line 37
    invoke-virtual {v1}, LY4/b;->i()I

    .line 38
    .line 39
    .line 40
    move-result v11

    .line 41
    invoke-virtual {v1}, LY4/b;->f()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-gtz v4, :cond_1

    .line 46
    .line 47
    move v12, v7

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move v12, v4

    .line 50
    :goto_0
    invoke-virtual {v1}, LY4/b;->f()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-gtz v4, :cond_2

    .line 55
    .line 56
    move v13, v7

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move v13, v4

    .line 59
    :goto_1
    invoke-virtual {v1}, LY4/b;->f()I

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, LY4/b;->q()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    and-int/lit8 v6, v4, 0xf

    .line 67
    .line 68
    int-to-double v6, v6

    .line 69
    const-wide/high16 v14, 0x4000000000000000L    # 2.0

    .line 70
    .line 71
    invoke-static {v14, v15, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 72
    .line 73
    .line 74
    move-result-wide v6

    .line 75
    double-to-int v6, v6

    .line 76
    and-int/lit16 v4, v4, 0xf0

    .line 77
    .line 78
    shr-int/2addr v4, v5

    .line 79
    int-to-double v4, v4

    .line 80
    invoke-static {v14, v15, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 81
    .line 82
    .line 83
    move-result-wide v4

    .line 84
    double-to-int v15, v4

    .line 85
    invoke-virtual {v1}, LY4/b;->q()I

    .line 86
    .line 87
    .line 88
    iget-object v4, v1, LY4/b;->a:[B

    .line 89
    .line 90
    iget v1, v1, LY4/b;->c:I

    .line 91
    .line 92
    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 93
    .line 94
    .line 95
    move-result-object v16

    .line 96
    new-instance v9, LJ5/z;

    .line 97
    .line 98
    move v14, v6

    .line 99
    invoke-direct/range {v9 .. v16}, LJ5/z;-><init>(IIIIII[B)V

    .line 100
    .line 101
    .line 102
    iput-object v9, v0, LS5/f;->r:LJ5/z;

    .line 103
    .line 104
    :goto_2
    const/4 v8, 0x0

    .line 105
    goto/16 :goto_1f

    .line 106
    .line 107
    :cond_3
    move v9, v7

    .line 108
    iget-object v7, v0, LS5/f;->s:LS3/l;

    .line 109
    .line 110
    if-nez v7, :cond_4

    .line 111
    .line 112
    invoke-static {v1, v3, v3}, Landroid/support/v4/media/session/b;->p0(LY4/b;ZZ)LS3/l;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    iput-object v1, v0, LS5/f;->s:LS3/l;

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_4
    iget v10, v1, LY4/b;->c:I

    .line 120
    .line 121
    new-array v11, v10, [B

    .line 122
    .line 123
    iget-object v12, v1, LY4/b;->a:[B

    .line 124
    .line 125
    invoke-static {v12, v4, v11, v4, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 126
    .line 127
    .line 128
    const/4 v10, 0x5

    .line 129
    invoke-static {v10, v1, v4}, Landroid/support/v4/media/session/b;->v0(ILY4/b;Z)Z

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, LY4/b;->q()I

    .line 133
    .line 134
    .line 135
    move-result v12

    .line 136
    add-int/2addr v12, v3

    .line 137
    new-instance v13, LJ5/y;

    .line 138
    .line 139
    iget-object v14, v1, LY4/b;->a:[B

    .line 140
    .line 141
    const/4 v15, 0x0

    .line 142
    invoke-direct {v13, v14, v15}, LJ5/y;-><init>([BI)V

    .line 143
    .line 144
    .line 145
    iget v1, v1, LY4/b;->b:I

    .line 146
    .line 147
    const/16 v14, 0x8

    .line 148
    .line 149
    mul-int/2addr v1, v14

    .line 150
    invoke-virtual {v13, v1}, LJ5/y;->t(I)V

    .line 151
    .line 152
    .line 153
    move v1, v4

    .line 154
    :goto_3
    const/16 v15, 0x18

    .line 155
    .line 156
    const/16 v9, 0x10

    .line 157
    .line 158
    if-ge v1, v12, :cond_11

    .line 159
    .line 160
    move/from16 p1, v14

    .line 161
    .line 162
    invoke-virtual {v13, v15}, LJ5/y;->i(I)I

    .line 163
    .line 164
    .line 165
    move-result v14

    .line 166
    const v8, 0x564342

    .line 167
    .line 168
    .line 169
    if-ne v14, v8, :cond_10

    .line 170
    .line 171
    invoke-virtual {v13, v9}, LJ5/y;->i(I)I

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    invoke-virtual {v13, v15}, LJ5/y;->i(I)I

    .line 176
    .line 177
    .line 178
    move-result v9

    .line 179
    new-array v14, v9, [J

    .line 180
    .line 181
    invoke-virtual {v13}, LJ5/y;->h()Z

    .line 182
    .line 183
    .line 184
    move-result v15

    .line 185
    const-wide/16 v17, 0x0

    .line 186
    .line 187
    if-nez v15, :cond_8

    .line 188
    .line 189
    invoke-virtual {v13}, LJ5/y;->h()Z

    .line 190
    .line 191
    .line 192
    move-result v15

    .line 193
    move/from16 v19, v3

    .line 194
    .line 195
    const/4 v3, 0x0

    .line 196
    :goto_4
    if-ge v3, v9, :cond_7

    .line 197
    .line 198
    if-eqz v15, :cond_6

    .line 199
    .line 200
    invoke-virtual {v13}, LJ5/y;->h()Z

    .line 201
    .line 202
    .line 203
    move-result v20

    .line 204
    if-eqz v20, :cond_5

    .line 205
    .line 206
    invoke-virtual {v13, v10}, LJ5/y;->i(I)I

    .line 207
    .line 208
    .line 209
    move-result v20

    .line 210
    add-int/lit8 v4, v20, 0x1

    .line 211
    .line 212
    move-object/from16 v20, v6

    .line 213
    .line 214
    int-to-long v5, v4

    .line 215
    aput-wide v5, v14, v3

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_5
    move-object/from16 v20, v6

    .line 219
    .line 220
    aput-wide v17, v14, v3

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_6
    move-object/from16 v20, v6

    .line 224
    .line 225
    invoke-virtual {v13, v10}, LJ5/y;->i(I)I

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    add-int/lit8 v4, v4, 0x1

    .line 230
    .line 231
    int-to-long v4, v4

    .line 232
    aput-wide v4, v14, v3

    .line 233
    .line 234
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 235
    .line 236
    move-object/from16 v6, v20

    .line 237
    .line 238
    const/4 v5, 0x4

    .line 239
    goto :goto_4

    .line 240
    :cond_7
    move-object/from16 v20, v6

    .line 241
    .line 242
    move v3, v5

    .line 243
    :goto_6
    move-object/from16 v21, v11

    .line 244
    .line 245
    goto :goto_9

    .line 246
    :cond_8
    move/from16 v19, v3

    .line 247
    .line 248
    move-object/from16 v20, v6

    .line 249
    .line 250
    invoke-virtual {v13, v10}, LJ5/y;->i(I)I

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    add-int/lit8 v3, v3, 0x1

    .line 255
    .line 256
    const/4 v4, 0x0

    .line 257
    :goto_7
    if-ge v4, v9, :cond_a

    .line 258
    .line 259
    sub-int v5, v9, v4

    .line 260
    .line 261
    invoke-static {v5}, Landroid/support/v4/media/session/b;->h0(I)I

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    invoke-virtual {v13, v5}, LJ5/y;->i(I)I

    .line 266
    .line 267
    .line 268
    move-result v5

    .line 269
    const/4 v6, 0x0

    .line 270
    :goto_8
    if-ge v6, v5, :cond_9

    .line 271
    .line 272
    if-ge v4, v9, :cond_9

    .line 273
    .line 274
    move-object/from16 v21, v11

    .line 275
    .line 276
    int-to-long v10, v3

    .line 277
    aput-wide v10, v14, v4

    .line 278
    .line 279
    add-int/lit8 v4, v4, 0x1

    .line 280
    .line 281
    add-int/lit8 v6, v6, 0x1

    .line 282
    .line 283
    move-object/from16 v11, v21

    .line 284
    .line 285
    const/4 v10, 0x5

    .line 286
    goto :goto_8

    .line 287
    :cond_9
    move-object/from16 v21, v11

    .line 288
    .line 289
    add-int/lit8 v3, v3, 0x1

    .line 290
    .line 291
    move-object/from16 v11, v21

    .line 292
    .line 293
    const/4 v10, 0x5

    .line 294
    goto :goto_7

    .line 295
    :cond_a
    const/4 v3, 0x4

    .line 296
    goto :goto_6

    .line 297
    :goto_9
    invoke-virtual {v13, v3}, LJ5/y;->i(I)I

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    const/4 v5, 0x2

    .line 302
    if-gt v4, v5, :cond_f

    .line 303
    .line 304
    move/from16 v6, v19

    .line 305
    .line 306
    if-eq v4, v6, :cond_b

    .line 307
    .line 308
    if-ne v4, v5, :cond_e

    .line 309
    .line 310
    :cond_b
    const/16 v5, 0x20

    .line 311
    .line 312
    invoke-virtual {v13, v5}, LJ5/y;->t(I)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v13, v5}, LJ5/y;->t(I)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v13, v3}, LJ5/y;->i(I)I

    .line 319
    .line 320
    .line 321
    move-result v5

    .line 322
    add-int/2addr v5, v6

    .line 323
    invoke-virtual {v13, v6}, LJ5/y;->t(I)V

    .line 324
    .line 325
    .line 326
    if-ne v4, v6, :cond_c

    .line 327
    .line 328
    if-eqz v8, :cond_d

    .line 329
    .line 330
    int-to-long v3, v9

    .line 331
    int-to-long v8, v8

    .line 332
    long-to-double v3, v3

    .line 333
    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    .line 334
    .line 335
    long-to-double v8, v8

    .line 336
    div-double/2addr v10, v8

    .line 337
    invoke-static {v3, v4, v10, v11}, Ljava/lang/Math;->pow(DD)D

    .line 338
    .line 339
    .line 340
    move-result-wide v3

    .line 341
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 342
    .line 343
    .line 344
    move-result-wide v3

    .line 345
    double-to-long v3, v3

    .line 346
    move-wide/from16 v17, v3

    .line 347
    .line 348
    goto :goto_a

    .line 349
    :cond_c
    int-to-long v3, v9

    .line 350
    int-to-long v8, v8

    .line 351
    mul-long v17, v3, v8

    .line 352
    .line 353
    :cond_d
    :goto_a
    int-to-long v3, v5

    .line 354
    mul-long v3, v3, v17

    .line 355
    .line 356
    long-to-int v3, v3

    .line 357
    invoke-virtual {v13, v3}, LJ5/y;->t(I)V

    .line 358
    .line 359
    .line 360
    :cond_e
    add-int/lit8 v1, v1, 0x1

    .line 361
    .line 362
    move/from16 v14, p1

    .line 363
    .line 364
    move-object/from16 v6, v20

    .line 365
    .line 366
    move-object/from16 v11, v21

    .line 367
    .line 368
    const/4 v3, 0x1

    .line 369
    const/4 v4, 0x0

    .line 370
    const/4 v5, 0x4

    .line 371
    const/4 v9, -0x1

    .line 372
    const/4 v10, 0x5

    .line 373
    goto/16 :goto_3

    .line 374
    .line 375
    :cond_f
    new-instance v1, Ljava/lang/StringBuilder;

    .line 376
    .line 377
    const-string v2, "lookup type greater than 2 not decodable: "

    .line 378
    .line 379
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    const/4 v2, 0x0

    .line 390
    invoke-static {v1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    throw v1

    .line 395
    :cond_10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 396
    .line 397
    const-string v2, "expected code book to start with [0x56, 0x43, 0x42] at "

    .line 398
    .line 399
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    iget v2, v13, LJ5/y;->d:I

    .line 403
    .line 404
    mul-int/lit8 v2, v2, 0x8

    .line 405
    .line 406
    iget v3, v13, LJ5/y;->e:I

    .line 407
    .line 408
    add-int/2addr v2, v3

    .line 409
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    const/4 v2, 0x0

    .line 417
    invoke-static {v1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    throw v1

    .line 422
    :cond_11
    move-object/from16 v20, v6

    .line 423
    .line 424
    move-object/from16 v21, v11

    .line 425
    .line 426
    move/from16 p1, v14

    .line 427
    .line 428
    const/4 v1, 0x6

    .line 429
    invoke-virtual {v13, v1}, LJ5/y;->i(I)I

    .line 430
    .line 431
    .line 432
    move-result v3

    .line 433
    const/16 v19, 0x1

    .line 434
    .line 435
    add-int/lit8 v3, v3, 0x1

    .line 436
    .line 437
    const/4 v4, 0x0

    .line 438
    :goto_b
    if-ge v4, v3, :cond_13

    .line 439
    .line 440
    invoke-virtual {v13, v9}, LJ5/y;->i(I)I

    .line 441
    .line 442
    .line 443
    move-result v5

    .line 444
    if-nez v5, :cond_12

    .line 445
    .line 446
    add-int/lit8 v4, v4, 0x1

    .line 447
    .line 448
    goto :goto_b

    .line 449
    :cond_12
    const-string v1, "placeholder of time domain transforms not zeroed out"

    .line 450
    .line 451
    const/4 v2, 0x0

    .line 452
    invoke-static {v1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    throw v1

    .line 457
    :cond_13
    invoke-virtual {v13, v1}, LJ5/y;->i(I)I

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    const/4 v6, 0x1

    .line 462
    add-int/2addr v3, v6

    .line 463
    const/4 v4, 0x0

    .line 464
    :goto_c
    const/4 v5, 0x3

    .line 465
    if-ge v4, v3, :cond_1d

    .line 466
    .line 467
    invoke-virtual {v13, v9}, LJ5/y;->i(I)I

    .line 468
    .line 469
    .line 470
    move-result v8

    .line 471
    if-eqz v8, :cond_1b

    .line 472
    .line 473
    if-ne v8, v6, :cond_1a

    .line 474
    .line 475
    const/4 v6, 0x5

    .line 476
    invoke-virtual {v13, v6}, LJ5/y;->i(I)I

    .line 477
    .line 478
    .line 479
    move-result v8

    .line 480
    new-array v6, v8, [I

    .line 481
    .line 482
    const/4 v10, 0x0

    .line 483
    const/4 v11, -0x1

    .line 484
    :goto_d
    if-ge v10, v8, :cond_15

    .line 485
    .line 486
    const/4 v12, 0x4

    .line 487
    invoke-virtual {v13, v12}, LJ5/y;->i(I)I

    .line 488
    .line 489
    .line 490
    move-result v14

    .line 491
    aput v14, v6, v10

    .line 492
    .line 493
    if-le v14, v11, :cond_14

    .line 494
    .line 495
    move v11, v14

    .line 496
    :cond_14
    add-int/lit8 v10, v10, 0x1

    .line 497
    .line 498
    goto :goto_d

    .line 499
    :cond_15
    add-int/lit8 v11, v11, 0x1

    .line 500
    .line 501
    new-array v10, v11, [I

    .line 502
    .line 503
    const/4 v12, 0x0

    .line 504
    :goto_e
    if-ge v12, v11, :cond_18

    .line 505
    .line 506
    invoke-virtual {v13, v5}, LJ5/y;->i(I)I

    .line 507
    .line 508
    .line 509
    move-result v14

    .line 510
    const/16 v19, 0x1

    .line 511
    .line 512
    add-int/lit8 v14, v14, 0x1

    .line 513
    .line 514
    aput v14, v10, v12

    .line 515
    .line 516
    const/4 v14, 0x2

    .line 517
    invoke-virtual {v13, v14}, LJ5/y;->i(I)I

    .line 518
    .line 519
    .line 520
    move-result v17

    .line 521
    move/from16 v14, p1

    .line 522
    .line 523
    if-lez v17, :cond_16

    .line 524
    .line 525
    invoke-virtual {v13, v14}, LJ5/y;->t(I)V

    .line 526
    .line 527
    .line 528
    :cond_16
    const/4 v5, 0x0

    .line 529
    :goto_f
    shl-int v15, v19, v17

    .line 530
    .line 531
    if-ge v5, v15, :cond_17

    .line 532
    .line 533
    invoke-virtual {v13, v14}, LJ5/y;->t(I)V

    .line 534
    .line 535
    .line 536
    add-int/lit8 v5, v5, 0x1

    .line 537
    .line 538
    const/16 v14, 0x8

    .line 539
    .line 540
    const/16 v19, 0x1

    .line 541
    .line 542
    goto :goto_f

    .line 543
    :cond_17
    add-int/lit8 v12, v12, 0x1

    .line 544
    .line 545
    const/16 p1, 0x8

    .line 546
    .line 547
    const/4 v5, 0x3

    .line 548
    const/16 v15, 0x18

    .line 549
    .line 550
    goto :goto_e

    .line 551
    :cond_18
    const/4 v14, 0x2

    .line 552
    invoke-virtual {v13, v14}, LJ5/y;->t(I)V

    .line 553
    .line 554
    .line 555
    const/4 v12, 0x4

    .line 556
    invoke-virtual {v13, v12}, LJ5/y;->i(I)I

    .line 557
    .line 558
    .line 559
    move-result v5

    .line 560
    const/4 v11, 0x0

    .line 561
    const/4 v12, 0x0

    .line 562
    const/4 v14, 0x0

    .line 563
    :goto_10
    if-ge v11, v8, :cond_1c

    .line 564
    .line 565
    aget v15, v6, v11

    .line 566
    .line 567
    aget v15, v10, v15

    .line 568
    .line 569
    add-int/2addr v12, v15

    .line 570
    :goto_11
    if-ge v14, v12, :cond_19

    .line 571
    .line 572
    invoke-virtual {v13, v5}, LJ5/y;->t(I)V

    .line 573
    .line 574
    .line 575
    add-int/lit8 v14, v14, 0x1

    .line 576
    .line 577
    goto :goto_11

    .line 578
    :cond_19
    add-int/lit8 v11, v11, 0x1

    .line 579
    .line 580
    goto :goto_10

    .line 581
    :cond_1a
    new-instance v1, Ljava/lang/StringBuilder;

    .line 582
    .line 583
    const-string v2, "floor type greater than 1 not decodable: "

    .line 584
    .line 585
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    const/4 v2, 0x0

    .line 596
    invoke-static {v1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 597
    .line 598
    .line 599
    move-result-object v1

    .line 600
    throw v1

    .line 601
    :cond_1b
    move/from16 v14, p1

    .line 602
    .line 603
    invoke-virtual {v13, v14}, LJ5/y;->t(I)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v13, v9}, LJ5/y;->t(I)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v13, v9}, LJ5/y;->t(I)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v13, v1}, LJ5/y;->t(I)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v13, v14}, LJ5/y;->t(I)V

    .line 616
    .line 617
    .line 618
    const/4 v12, 0x4

    .line 619
    invoke-virtual {v13, v12}, LJ5/y;->i(I)I

    .line 620
    .line 621
    .line 622
    move-result v5

    .line 623
    const/16 v19, 0x1

    .line 624
    .line 625
    add-int/lit8 v5, v5, 0x1

    .line 626
    .line 627
    const/4 v6, 0x0

    .line 628
    :goto_12
    if-ge v6, v5, :cond_1c

    .line 629
    .line 630
    invoke-virtual {v13, v14}, LJ5/y;->t(I)V

    .line 631
    .line 632
    .line 633
    add-int/lit8 v6, v6, 0x1

    .line 634
    .line 635
    const/16 v14, 0x8

    .line 636
    .line 637
    goto :goto_12

    .line 638
    :cond_1c
    add-int/lit8 v4, v4, 0x1

    .line 639
    .line 640
    const/16 p1, 0x8

    .line 641
    .line 642
    const/4 v6, 0x1

    .line 643
    const/16 v15, 0x18

    .line 644
    .line 645
    goto/16 :goto_c

    .line 646
    .line 647
    :cond_1d
    invoke-virtual {v13, v1}, LJ5/y;->i(I)I

    .line 648
    .line 649
    .line 650
    move-result v3

    .line 651
    const/16 v19, 0x1

    .line 652
    .line 653
    add-int/lit8 v3, v3, 0x1

    .line 654
    .line 655
    const/4 v4, 0x0

    .line 656
    :goto_13
    if-ge v4, v3, :cond_24

    .line 657
    .line 658
    invoke-virtual {v13, v9}, LJ5/y;->i(I)I

    .line 659
    .line 660
    .line 661
    move-result v5

    .line 662
    const/4 v14, 0x2

    .line 663
    if-gt v5, v14, :cond_23

    .line 664
    .line 665
    const/16 v5, 0x18

    .line 666
    .line 667
    invoke-virtual {v13, v5}, LJ5/y;->t(I)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v13, v5}, LJ5/y;->t(I)V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v13, v5}, LJ5/y;->t(I)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v13, v1}, LJ5/y;->i(I)I

    .line 677
    .line 678
    .line 679
    move-result v6

    .line 680
    add-int/lit8 v6, v6, 0x1

    .line 681
    .line 682
    const/16 v14, 0x8

    .line 683
    .line 684
    invoke-virtual {v13, v14}, LJ5/y;->t(I)V

    .line 685
    .line 686
    .line 687
    new-array v8, v6, [I

    .line 688
    .line 689
    const/4 v10, 0x0

    .line 690
    :goto_14
    if-ge v10, v6, :cond_1f

    .line 691
    .line 692
    const/4 v11, 0x3

    .line 693
    invoke-virtual {v13, v11}, LJ5/y;->i(I)I

    .line 694
    .line 695
    .line 696
    move-result v12

    .line 697
    invoke-virtual {v13}, LJ5/y;->h()Z

    .line 698
    .line 699
    .line 700
    move-result v15

    .line 701
    if-eqz v15, :cond_1e

    .line 702
    .line 703
    const/4 v15, 0x5

    .line 704
    invoke-virtual {v13, v15}, LJ5/y;->i(I)I

    .line 705
    .line 706
    .line 707
    move-result v17

    .line 708
    goto :goto_15

    .line 709
    :cond_1e
    const/4 v15, 0x5

    .line 710
    const/16 v17, 0x0

    .line 711
    .line 712
    :goto_15
    mul-int/lit8 v17, v17, 0x8

    .line 713
    .line 714
    add-int v17, v17, v12

    .line 715
    .line 716
    aput v17, v8, v10

    .line 717
    .line 718
    add-int/lit8 v10, v10, 0x1

    .line 719
    .line 720
    goto :goto_14

    .line 721
    :cond_1f
    const/4 v11, 0x3

    .line 722
    const/4 v15, 0x5

    .line 723
    const/4 v10, 0x0

    .line 724
    :goto_16
    if-ge v10, v6, :cond_22

    .line 725
    .line 726
    const/4 v12, 0x0

    .line 727
    :goto_17
    if-ge v12, v14, :cond_21

    .line 728
    .line 729
    aget v17, v8, v10

    .line 730
    .line 731
    const/16 v19, 0x1

    .line 732
    .line 733
    shl-int v18, v19, v12

    .line 734
    .line 735
    and-int v17, v17, v18

    .line 736
    .line 737
    if-eqz v17, :cond_20

    .line 738
    .line 739
    invoke-virtual {v13, v14}, LJ5/y;->t(I)V

    .line 740
    .line 741
    .line 742
    :cond_20
    add-int/lit8 v12, v12, 0x1

    .line 743
    .line 744
    const/16 v14, 0x8

    .line 745
    .line 746
    goto :goto_17

    .line 747
    :cond_21
    add-int/lit8 v10, v10, 0x1

    .line 748
    .line 749
    const/16 v14, 0x8

    .line 750
    .line 751
    goto :goto_16

    .line 752
    :cond_22
    add-int/lit8 v4, v4, 0x1

    .line 753
    .line 754
    const/16 v19, 0x1

    .line 755
    .line 756
    goto :goto_13

    .line 757
    :cond_23
    const-string v1, "residueType greater than 2 is not decodable"

    .line 758
    .line 759
    const/4 v2, 0x0

    .line 760
    invoke-static {v1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 761
    .line 762
    .line 763
    move-result-object v1

    .line 764
    throw v1

    .line 765
    :cond_24
    invoke-virtual {v13, v1}, LJ5/y;->i(I)I

    .line 766
    .line 767
    .line 768
    move-result v3

    .line 769
    const/16 v19, 0x1

    .line 770
    .line 771
    add-int/lit8 v3, v3, 0x1

    .line 772
    .line 773
    const/4 v4, 0x0

    .line 774
    :goto_18
    if-ge v4, v3, :cond_2b

    .line 775
    .line 776
    invoke-virtual {v13, v9}, LJ5/y;->i(I)I

    .line 777
    .line 778
    .line 779
    move-result v5

    .line 780
    if-eqz v5, :cond_25

    .line 781
    .line 782
    new-instance v6, Ljava/lang/StringBuilder;

    .line 783
    .line 784
    const-string v8, "mapping type other than 0 not supported: "

    .line 785
    .line 786
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 790
    .line 791
    .line 792
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 793
    .line 794
    .line 795
    move-result-object v5

    .line 796
    const-string v6, "VorbisUtil"

    .line 797
    .line 798
    invoke-static {v6, v5}, Lu6/a;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 799
    .line 800
    .line 801
    move-object/from16 v8, v20

    .line 802
    .line 803
    const/4 v12, 0x4

    .line 804
    const/4 v14, 0x2

    .line 805
    goto :goto_1d

    .line 806
    :cond_25
    invoke-virtual {v13}, LJ5/y;->h()Z

    .line 807
    .line 808
    .line 809
    move-result v5

    .line 810
    if-eqz v5, :cond_26

    .line 811
    .line 812
    const/4 v12, 0x4

    .line 813
    invoke-virtual {v13, v12}, LJ5/y;->i(I)I

    .line 814
    .line 815
    .line 816
    move-result v5

    .line 817
    const/16 v19, 0x1

    .line 818
    .line 819
    add-int/lit8 v5, v5, 0x1

    .line 820
    .line 821
    goto :goto_19

    .line 822
    :cond_26
    const/16 v19, 0x1

    .line 823
    .line 824
    move/from16 v5, v19

    .line 825
    .line 826
    :goto_19
    invoke-virtual {v13}, LJ5/y;->h()Z

    .line 827
    .line 828
    .line 829
    move-result v6

    .line 830
    move-object/from16 v8, v20

    .line 831
    .line 832
    iget v10, v8, LJ5/z;->a:I

    .line 833
    .line 834
    if-eqz v6, :cond_27

    .line 835
    .line 836
    const/16 v14, 0x8

    .line 837
    .line 838
    invoke-virtual {v13, v14}, LJ5/y;->i(I)I

    .line 839
    .line 840
    .line 841
    move-result v6

    .line 842
    add-int/lit8 v6, v6, 0x1

    .line 843
    .line 844
    const/4 v11, 0x0

    .line 845
    :goto_1a
    if-ge v11, v6, :cond_27

    .line 846
    .line 847
    add-int/lit8 v12, v10, -0x1

    .line 848
    .line 849
    invoke-static {v12}, Landroid/support/v4/media/session/b;->h0(I)I

    .line 850
    .line 851
    .line 852
    move-result v14

    .line 853
    invoke-virtual {v13, v14}, LJ5/y;->t(I)V

    .line 854
    .line 855
    .line 856
    invoke-static {v12}, Landroid/support/v4/media/session/b;->h0(I)I

    .line 857
    .line 858
    .line 859
    move-result v12

    .line 860
    invoke-virtual {v13, v12}, LJ5/y;->t(I)V

    .line 861
    .line 862
    .line 863
    add-int/lit8 v11, v11, 0x1

    .line 864
    .line 865
    goto :goto_1a

    .line 866
    :cond_27
    const/4 v14, 0x2

    .line 867
    invoke-virtual {v13, v14}, LJ5/y;->i(I)I

    .line 868
    .line 869
    .line 870
    move-result v6

    .line 871
    if-nez v6, :cond_2a

    .line 872
    .line 873
    const/4 v6, 0x1

    .line 874
    if-le v5, v6, :cond_28

    .line 875
    .line 876
    const/4 v6, 0x0

    .line 877
    :goto_1b
    if-ge v6, v10, :cond_28

    .line 878
    .line 879
    const/4 v12, 0x4

    .line 880
    invoke-virtual {v13, v12}, LJ5/y;->t(I)V

    .line 881
    .line 882
    .line 883
    add-int/lit8 v6, v6, 0x1

    .line 884
    .line 885
    goto :goto_1b

    .line 886
    :cond_28
    const/4 v12, 0x4

    .line 887
    const/4 v6, 0x0

    .line 888
    :goto_1c
    if-ge v6, v5, :cond_29

    .line 889
    .line 890
    const/16 v10, 0x8

    .line 891
    .line 892
    invoke-virtual {v13, v10}, LJ5/y;->t(I)V

    .line 893
    .line 894
    .line 895
    invoke-virtual {v13, v10}, LJ5/y;->t(I)V

    .line 896
    .line 897
    .line 898
    invoke-virtual {v13, v10}, LJ5/y;->t(I)V

    .line 899
    .line 900
    .line 901
    add-int/lit8 v6, v6, 0x1

    .line 902
    .line 903
    goto :goto_1c

    .line 904
    :cond_29
    :goto_1d
    add-int/lit8 v4, v4, 0x1

    .line 905
    .line 906
    move-object/from16 v20, v8

    .line 907
    .line 908
    goto/16 :goto_18

    .line 909
    .line 910
    :cond_2a
    const-string v1, "to reserved bits must be zero after mapping coupling steps"

    .line 911
    .line 912
    const/4 v2, 0x0

    .line 913
    invoke-static {v1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 914
    .line 915
    .line 916
    move-result-object v1

    .line 917
    throw v1

    .line 918
    :cond_2b
    move-object/from16 v8, v20

    .line 919
    .line 920
    invoke-virtual {v13, v1}, LJ5/y;->i(I)I

    .line 921
    .line 922
    .line 923
    move-result v1

    .line 924
    add-int/lit8 v3, v1, 0x1

    .line 925
    .line 926
    new-array v4, v3, [Ls8/b;

    .line 927
    .line 928
    const/4 v5, 0x0

    .line 929
    :goto_1e
    if-ge v5, v3, :cond_2c

    .line 930
    .line 931
    invoke-virtual {v13}, LJ5/y;->h()Z

    .line 932
    .line 933
    .line 934
    move-result v6

    .line 935
    invoke-virtual {v13, v9}, LJ5/y;->i(I)I

    .line 936
    .line 937
    .line 938
    invoke-virtual {v13, v9}, LJ5/y;->i(I)I

    .line 939
    .line 940
    .line 941
    const/16 v14, 0x8

    .line 942
    .line 943
    invoke-virtual {v13, v14}, LJ5/y;->i(I)I

    .line 944
    .line 945
    .line 946
    new-instance v10, Ls8/b;

    .line 947
    .line 948
    const/4 v11, 0x1

    .line 949
    invoke-direct {v10, v6, v11}, Ls8/b;-><init>(ZI)V

    .line 950
    .line 951
    .line 952
    aput-object v10, v4, v5

    .line 953
    .line 954
    add-int/lit8 v5, v5, 0x1

    .line 955
    .line 956
    goto :goto_1e

    .line 957
    :cond_2c
    invoke-virtual {v13}, LJ5/y;->h()Z

    .line 958
    .line 959
    .line 960
    move-result v3

    .line 961
    if-eqz v3, :cond_2e

    .line 962
    .line 963
    invoke-static {v1}, Landroid/support/v4/media/session/b;->h0(I)I

    .line 964
    .line 965
    .line 966
    move-result v10

    .line 967
    new-instance v5, LN2/j;

    .line 968
    .line 969
    move-object v9, v4

    .line 970
    move-object v6, v8

    .line 971
    move-object/from16 v8, v21

    .line 972
    .line 973
    invoke-direct/range {v5 .. v10}, LN2/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;[B[Ljava/lang/Object;I)V

    .line 974
    .line 975
    .line 976
    move-object v8, v5

    .line 977
    :goto_1f
    iput-object v8, v0, LS5/f;->o:LN2/j;

    .line 978
    .line 979
    if-nez v8, :cond_2d

    .line 980
    .line 981
    const/16 v19, 0x1

    .line 982
    .line 983
    return v19

    .line 984
    :cond_2d
    new-instance v1, Ljava/util/ArrayList;

    .line 985
    .line 986
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 987
    .line 988
    .line 989
    iget-object v3, v8, LN2/j;->c:Ljava/lang/Object;

    .line 990
    .line 991
    check-cast v3, LJ5/z;

    .line 992
    .line 993
    iget-object v4, v3, LJ5/z;->g:[B

    .line 994
    .line 995
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 996
    .line 997
    .line 998
    iget-object v4, v8, LN2/j;->a:Ljava/lang/Object;

    .line 999
    .line 1000
    check-cast v4, [B

    .line 1001
    .line 1002
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1003
    .line 1004
    .line 1005
    iget-object v4, v8, LN2/j;->d:Ljava/lang/Object;

    .line 1006
    .line 1007
    check-cast v4, LS3/l;

    .line 1008
    .line 1009
    iget-object v4, v4, LS3/l;->a:Ljava/lang/Object;

    .line 1010
    .line 1011
    check-cast v4, [Ljava/lang/String;

    .line 1012
    .line 1013
    invoke-static {v4}, Ll8/K;->k([Ljava/lang/Object;)Ll8/e0;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v4

    .line 1017
    invoke-static {v4}, Landroid/support/v4/media/session/b;->m0(Ljava/util/List;)LW5/c;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v4

    .line 1021
    new-instance v5, LE5/S;

    .line 1022
    .line 1023
    invoke-direct {v5}, LE5/S;-><init>()V

    .line 1024
    .line 1025
    .line 1026
    const-string v6, "audio/vorbis"

    .line 1027
    .line 1028
    iput-object v6, v5, LE5/S;->k:Ljava/lang/String;

    .line 1029
    .line 1030
    iget v6, v3, LJ5/z;->d:I

    .line 1031
    .line 1032
    iput v6, v5, LE5/S;->f:I

    .line 1033
    .line 1034
    iget v6, v3, LJ5/z;->c:I

    .line 1035
    .line 1036
    iput v6, v5, LE5/S;->g:I

    .line 1037
    .line 1038
    iget v6, v3, LJ5/z;->a:I

    .line 1039
    .line 1040
    iput v6, v5, LE5/S;->x:I

    .line 1041
    .line 1042
    iget v3, v3, LJ5/z;->b:I

    .line 1043
    .line 1044
    iput v3, v5, LE5/S;->y:I

    .line 1045
    .line 1046
    iput-object v1, v5, LE5/S;->m:Ljava/util/List;

    .line 1047
    .line 1048
    iput-object v4, v5, LE5/S;->i:LW5/c;

    .line 1049
    .line 1050
    new-instance v1, LE5/T;

    .line 1051
    .line 1052
    invoke-direct {v1, v5}, LE5/T;-><init>(LE5/S;)V

    .line 1053
    .line 1054
    .line 1055
    iput-object v1, v2, LS3/s;->b:Ljava/lang/Object;

    .line 1056
    .line 1057
    const/16 v19, 0x1

    .line 1058
    .line 1059
    return v19

    .line 1060
    :cond_2e
    const-string v1, "framing bit after modes not set as expected"

    .line 1061
    .line 1062
    const/4 v2, 0x0

    .line 1063
    invoke-static {v1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v1

    .line 1067
    throw v1
.end method

.method public final f(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, LN2/i;->f(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, LS5/f;->o:LN2/j;

    .line 8
    .line 9
    iput-object p1, p0, LS5/f;->r:LJ5/z;

    .line 10
    .line 11
    iput-object p1, p0, LS5/f;->s:LS3/l;

    .line 12
    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    iput p1, p0, LS5/f;->p:I

    .line 15
    .line 16
    iput-boolean p1, p0, LS5/f;->q:Z

    .line 17
    .line 18
    return-void
.end method
