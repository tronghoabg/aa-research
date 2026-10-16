.class public final LN2/k;
.super LN2/i;
.source "SourceFile"


# instance fields
.field public o:LN2/j;

.field public p:I

.field public q:Z

.field public r:LJ5/z;

.field public s:Lqd/d;


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
    iput-boolean p1, p0, LN2/k;->q:Z

    .line 14
    .line 15
    iget-object p1, p0, LN2/k;->r:LJ5/z;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget p2, p1, LJ5/z;->e:I

    .line 20
    .line 21
    :cond_1
    iput p2, p0, LN2/k;->p:I

    .line 22
    .line 23
    return-void
.end method

.method public final b(LQ1/o;)J
    .locals 11

    .line 1
    iget-object v0, p1, LQ1/o;->a:[B

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
    iget-object v2, p0, LN2/k;->o:LN2/j;

    .line 15
    .line 16
    invoke-static {v2}, LQ1/k;->h(Ljava/lang/Object;)V

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
    iget-boolean v2, p0, LN2/k;->q:Z

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    iget v1, p0, LN2/k;->p:I

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
    iget-object v4, p1, LQ1/o;->a:[B

    .line 61
    .line 62
    array-length v6, v4

    .line 63
    iget v7, p1, LQ1/o;->c:I

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
    invoke-virtual {p1, v6, v4}, LQ1/o;->E(I[B)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    invoke-virtual {p1, v7}, LQ1/o;->F(I)V

    .line 79
    .line 80
    .line 81
    :goto_1
    iget-object v4, p1, LQ1/o;->a:[B

    .line 82
    .line 83
    iget p1, p1, LQ1/o;->c:I

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
    iput-boolean v3, p0, LN2/k;->q:Z

    .line 126
    .line 127
    iput v0, p0, LN2/k;->p:I

    .line 128
    .line 129
    return-wide v1
.end method

.method public final d(LQ1/o;JLS3/c;)Z
    .locals 21

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
    iget-object v3, v0, LN2/k;->o:LN2/j;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    iget-object v1, v2, LS3/c;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LN1/n;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    return v4

    .line 20
    :cond_0
    iget-object v6, v0, LN2/k;->r:LJ5/z;

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
    invoke-static {v3, v1, v4}, Ls2/a;->z(ILQ1/o;Z)Z

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, LQ1/o;->m()I

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 34
    .line 35
    .line 36
    move-result v10

    .line 37
    invoke-virtual {v1}, LQ1/o;->m()I

    .line 38
    .line 39
    .line 40
    move-result v11

    .line 41
    invoke-virtual {v1}, LQ1/o;->j()I

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
    invoke-virtual {v1}, LQ1/o;->j()I

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
    invoke-virtual {v1}, LQ1/o;->j()I

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, LQ1/o;->u()I

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
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 86
    .line 87
    .line 88
    iget-object v4, v1, LQ1/o;->a:[B

    .line 89
    .line 90
    iget v1, v1, LQ1/o;->c:I

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
    iput-object v9, v0, LN2/k;->r:LJ5/z;

    .line 103
    .line 104
    :goto_2
    const/4 v8, 0x0

    .line 105
    goto/16 :goto_1c

    .line 106
    .line 107
    :cond_3
    move v9, v7

    .line 108
    iget-object v7, v0, LN2/k;->s:Lqd/d;

    .line 109
    .line 110
    if-nez v7, :cond_4

    .line 111
    .line 112
    invoke-static {v1, v3, v3}, Ls2/a;->x(LQ1/o;ZZ)Lqd/d;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    iput-object v1, v0, LN2/k;->s:Lqd/d;

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_4
    iget v10, v1, LQ1/o;->c:I

    .line 120
    .line 121
    new-array v11, v10, [B

    .line 122
    .line 123
    iget-object v12, v1, LQ1/o;->a:[B

    .line 124
    .line 125
    invoke-static {v12, v4, v11, v4, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 126
    .line 127
    .line 128
    const/4 v10, 0x5

    .line 129
    invoke-static {v10, v1, v4}, Ls2/a;->z(ILQ1/o;Z)Z

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, LQ1/o;->u()I

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
    iget-object v14, v1, LQ1/o;->a:[B

    .line 140
    .line 141
    const/4 v15, 0x5

    .line 142
    invoke-direct {v13, v14, v15}, LJ5/y;-><init>([BI)V

    .line 143
    .line 144
    .line 145
    iget v1, v1, LQ1/o;->b:I

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
    const/4 v4, 0x2

    .line 157
    const/16 v9, 0x10

    .line 158
    .line 159
    if-ge v1, v12, :cond_f

    .line 160
    .line 161
    move/from16 p1, v14

    .line 162
    .line 163
    invoke-virtual {v13, v15}, LJ5/y;->i(I)I

    .line 164
    .line 165
    .line 166
    move-result v14

    .line 167
    const v8, 0x564342

    .line 168
    .line 169
    .line 170
    if-ne v14, v8, :cond_e

    .line 171
    .line 172
    invoke-virtual {v13, v9}, LJ5/y;->i(I)I

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    invoke-virtual {v13, v15}, LJ5/y;->i(I)I

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    invoke-virtual {v13}, LJ5/y;->h()Z

    .line 181
    .line 182
    .line 183
    move-result v14

    .line 184
    if-nez v14, :cond_7

    .line 185
    .line 186
    invoke-virtual {v13}, LJ5/y;->h()Z

    .line 187
    .line 188
    .line 189
    move-result v14

    .line 190
    const/4 v15, 0x0

    .line 191
    :goto_4
    if-ge v15, v9, :cond_8

    .line 192
    .line 193
    if-eqz v14, :cond_5

    .line 194
    .line 195
    invoke-virtual {v13}, LJ5/y;->h()Z

    .line 196
    .line 197
    .line 198
    move-result v17

    .line 199
    if-eqz v17, :cond_6

    .line 200
    .line 201
    invoke-virtual {v13, v10}, LJ5/y;->t(I)V

    .line 202
    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_5
    invoke-virtual {v13, v10}, LJ5/y;->t(I)V

    .line 206
    .line 207
    .line 208
    :cond_6
    :goto_5
    add-int/lit8 v15, v15, 0x1

    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_7
    invoke-virtual {v13, v10}, LJ5/y;->t(I)V

    .line 212
    .line 213
    .line 214
    const/4 v14, 0x0

    .line 215
    :goto_6
    if-ge v14, v9, :cond_8

    .line 216
    .line 217
    sub-int v15, v9, v14

    .line 218
    .line 219
    invoke-static {v15}, Ls2/a;->n(I)I

    .line 220
    .line 221
    .line 222
    move-result v15

    .line 223
    invoke-virtual {v13, v15}, LJ5/y;->i(I)I

    .line 224
    .line 225
    .line 226
    move-result v15

    .line 227
    add-int/2addr v14, v15

    .line 228
    goto :goto_6

    .line 229
    :cond_8
    invoke-virtual {v13, v5}, LJ5/y;->i(I)I

    .line 230
    .line 231
    .line 232
    move-result v14

    .line 233
    if-gt v14, v4, :cond_d

    .line 234
    .line 235
    if-eq v14, v3, :cond_9

    .line 236
    .line 237
    if-ne v14, v4, :cond_c

    .line 238
    .line 239
    :cond_9
    const/16 v4, 0x20

    .line 240
    .line 241
    invoke-virtual {v13, v4}, LJ5/y;->t(I)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v13, v4}, LJ5/y;->t(I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v13, v5}, LJ5/y;->i(I)I

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    add-int/2addr v4, v3

    .line 252
    invoke-virtual {v13, v3}, LJ5/y;->t(I)V

    .line 253
    .line 254
    .line 255
    if-ne v14, v3, :cond_b

    .line 256
    .line 257
    if-eqz v8, :cond_a

    .line 258
    .line 259
    int-to-long v14, v9

    .line 260
    int-to-long v8, v8

    .line 261
    long-to-double v14, v14

    .line 262
    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    .line 263
    .line 264
    long-to-double v8, v8

    .line 265
    div-double v8, v17, v8

    .line 266
    .line 267
    invoke-static {v14, v15, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 268
    .line 269
    .line 270
    move-result-wide v8

    .line 271
    invoke-static {v8, v9}, Ljava/lang/Math;->floor(D)D

    .line 272
    .line 273
    .line 274
    move-result-wide v8

    .line 275
    double-to-long v8, v8

    .line 276
    goto :goto_7

    .line 277
    :cond_a
    const-wide/16 v8, 0x0

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_b
    int-to-long v14, v9

    .line 281
    int-to-long v8, v8

    .line 282
    mul-long/2addr v8, v14

    .line 283
    :goto_7
    int-to-long v14, v4

    .line 284
    mul-long/2addr v8, v14

    .line 285
    long-to-int v4, v8

    .line 286
    invoke-virtual {v13, v4}, LJ5/y;->t(I)V

    .line 287
    .line 288
    .line 289
    :cond_c
    add-int/lit8 v1, v1, 0x1

    .line 290
    .line 291
    move/from16 v14, p1

    .line 292
    .line 293
    const/4 v4, 0x0

    .line 294
    const/4 v9, -0x1

    .line 295
    goto/16 :goto_3

    .line 296
    .line 297
    :cond_d
    new-instance v1, Ljava/lang/StringBuilder;

    .line 298
    .line 299
    const-string v2, "lookup type greater than 2 not decodable: "

    .line 300
    .line 301
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    const/4 v2, 0x0

    .line 312
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    throw v1

    .line 317
    :cond_e
    new-instance v1, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    const-string v2, "expected code book to start with [0x56, 0x43, 0x42] at "

    .line 320
    .line 321
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    iget v2, v13, LJ5/y;->d:I

    .line 325
    .line 326
    mul-int/lit8 v2, v2, 0x8

    .line 327
    .line 328
    iget v3, v13, LJ5/y;->e:I

    .line 329
    .line 330
    add-int/2addr v2, v3

    .line 331
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    const/4 v2, 0x0

    .line 339
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    throw v1

    .line 344
    :cond_f
    move/from16 p1, v14

    .line 345
    .line 346
    const/4 v1, 0x6

    .line 347
    invoke-virtual {v13, v1}, LJ5/y;->i(I)I

    .line 348
    .line 349
    .line 350
    move-result v8

    .line 351
    add-int/2addr v8, v3

    .line 352
    const/4 v12, 0x0

    .line 353
    :goto_8
    if-ge v12, v8, :cond_11

    .line 354
    .line 355
    invoke-virtual {v13, v9}, LJ5/y;->i(I)I

    .line 356
    .line 357
    .line 358
    move-result v14

    .line 359
    if-nez v14, :cond_10

    .line 360
    .line 361
    add-int/lit8 v12, v12, 0x1

    .line 362
    .line 363
    goto :goto_8

    .line 364
    :cond_10
    const-string v1, "placeholder of time domain transforms not zeroed out"

    .line 365
    .line 366
    const/4 v2, 0x0

    .line 367
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    throw v1

    .line 372
    :cond_11
    invoke-virtual {v13, v1}, LJ5/y;->i(I)I

    .line 373
    .line 374
    .line 375
    move-result v8

    .line 376
    add-int/2addr v8, v3

    .line 377
    const/4 v12, 0x0

    .line 378
    :goto_9
    const/4 v14, 0x3

    .line 379
    if-ge v12, v8, :cond_1b

    .line 380
    .line 381
    invoke-virtual {v13, v9}, LJ5/y;->i(I)I

    .line 382
    .line 383
    .line 384
    move-result v15

    .line 385
    if-eqz v15, :cond_19

    .line 386
    .line 387
    if-ne v15, v3, :cond_18

    .line 388
    .line 389
    invoke-virtual {v13, v10}, LJ5/y;->i(I)I

    .line 390
    .line 391
    .line 392
    move-result v15

    .line 393
    move/from16 v18, v3

    .line 394
    .line 395
    new-array v3, v15, [I

    .line 396
    .line 397
    const/4 v1, -0x1

    .line 398
    const/4 v10, 0x0

    .line 399
    :goto_a
    if-ge v10, v15, :cond_13

    .line 400
    .line 401
    invoke-virtual {v13, v5}, LJ5/y;->i(I)I

    .line 402
    .line 403
    .line 404
    move-result v9

    .line 405
    aput v9, v3, v10

    .line 406
    .line 407
    if-le v9, v1, :cond_12

    .line 408
    .line 409
    move v1, v9

    .line 410
    :cond_12
    add-int/lit8 v10, v10, 0x1

    .line 411
    .line 412
    const/16 v9, 0x10

    .line 413
    .line 414
    goto :goto_a

    .line 415
    :cond_13
    add-int/lit8 v1, v1, 0x1

    .line 416
    .line 417
    new-array v9, v1, [I

    .line 418
    .line 419
    const/4 v10, 0x0

    .line 420
    :goto_b
    if-ge v10, v1, :cond_16

    .line 421
    .line 422
    invoke-virtual {v13, v14}, LJ5/y;->i(I)I

    .line 423
    .line 424
    .line 425
    move-result v20

    .line 426
    add-int/lit8 v20, v20, 0x1

    .line 427
    .line 428
    aput v20, v9, v10

    .line 429
    .line 430
    invoke-virtual {v13, v4}, LJ5/y;->i(I)I

    .line 431
    .line 432
    .line 433
    move-result v20

    .line 434
    move/from16 v14, p1

    .line 435
    .line 436
    if-lez v20, :cond_14

    .line 437
    .line 438
    invoke-virtual {v13, v14}, LJ5/y;->t(I)V

    .line 439
    .line 440
    .line 441
    :cond_14
    const/4 v5, 0x0

    .line 442
    :goto_c
    shl-int v4, v18, v20

    .line 443
    .line 444
    if-ge v5, v4, :cond_15

    .line 445
    .line 446
    invoke-virtual {v13, v14}, LJ5/y;->t(I)V

    .line 447
    .line 448
    .line 449
    add-int/lit8 v5, v5, 0x1

    .line 450
    .line 451
    const/16 v14, 0x8

    .line 452
    .line 453
    goto :goto_c

    .line 454
    :cond_15
    add-int/lit8 v10, v10, 0x1

    .line 455
    .line 456
    const/16 p1, 0x8

    .line 457
    .line 458
    const/4 v4, 0x2

    .line 459
    const/4 v5, 0x4

    .line 460
    const/4 v14, 0x3

    .line 461
    goto :goto_b

    .line 462
    :cond_16
    invoke-virtual {v13, v4}, LJ5/y;->t(I)V

    .line 463
    .line 464
    .line 465
    const/4 v1, 0x4

    .line 466
    invoke-virtual {v13, v1}, LJ5/y;->i(I)I

    .line 467
    .line 468
    .line 469
    move-result v4

    .line 470
    const/4 v1, 0x0

    .line 471
    const/4 v5, 0x0

    .line 472
    const/4 v10, 0x0

    .line 473
    :goto_d
    if-ge v1, v15, :cond_1a

    .line 474
    .line 475
    aget v14, v3, v1

    .line 476
    .line 477
    aget v14, v9, v14

    .line 478
    .line 479
    add-int/2addr v5, v14

    .line 480
    :goto_e
    if-ge v10, v5, :cond_17

    .line 481
    .line 482
    invoke-virtual {v13, v4}, LJ5/y;->t(I)V

    .line 483
    .line 484
    .line 485
    add-int/lit8 v10, v10, 0x1

    .line 486
    .line 487
    goto :goto_e

    .line 488
    :cond_17
    add-int/lit8 v1, v1, 0x1

    .line 489
    .line 490
    goto :goto_d

    .line 491
    :cond_18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 492
    .line 493
    const-string v2, "floor type greater than 1 not decodable: "

    .line 494
    .line 495
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    const/4 v2, 0x0

    .line 506
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    throw v1

    .line 511
    :cond_19
    move/from16 v14, p1

    .line 512
    .line 513
    move/from16 v18, v3

    .line 514
    .line 515
    invoke-virtual {v13, v14}, LJ5/y;->t(I)V

    .line 516
    .line 517
    .line 518
    const/16 v1, 0x10

    .line 519
    .line 520
    invoke-virtual {v13, v1}, LJ5/y;->t(I)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v13, v1}, LJ5/y;->t(I)V

    .line 524
    .line 525
    .line 526
    const/4 v1, 0x6

    .line 527
    invoke-virtual {v13, v1}, LJ5/y;->t(I)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v13, v14}, LJ5/y;->t(I)V

    .line 531
    .line 532
    .line 533
    const/4 v1, 0x4

    .line 534
    invoke-virtual {v13, v1}, LJ5/y;->i(I)I

    .line 535
    .line 536
    .line 537
    move-result v3

    .line 538
    add-int/lit8 v3, v3, 0x1

    .line 539
    .line 540
    const/4 v1, 0x0

    .line 541
    :goto_f
    if-ge v1, v3, :cond_1a

    .line 542
    .line 543
    invoke-virtual {v13, v14}, LJ5/y;->t(I)V

    .line 544
    .line 545
    .line 546
    add-int/lit8 v1, v1, 0x1

    .line 547
    .line 548
    const/16 v14, 0x8

    .line 549
    .line 550
    goto :goto_f

    .line 551
    :cond_1a
    add-int/lit8 v12, v12, 0x1

    .line 552
    .line 553
    move/from16 v3, v18

    .line 554
    .line 555
    const/16 p1, 0x8

    .line 556
    .line 557
    const/4 v1, 0x6

    .line 558
    const/4 v4, 0x2

    .line 559
    const/4 v5, 0x4

    .line 560
    const/16 v9, 0x10

    .line 561
    .line 562
    const/4 v10, 0x5

    .line 563
    const/16 v15, 0x18

    .line 564
    .line 565
    goto/16 :goto_9

    .line 566
    .line 567
    :cond_1b
    move/from16 v18, v3

    .line 568
    .line 569
    invoke-virtual {v13, v1}, LJ5/y;->i(I)I

    .line 570
    .line 571
    .line 572
    move-result v3

    .line 573
    add-int/lit8 v3, v3, 0x1

    .line 574
    .line 575
    const/4 v4, 0x0

    .line 576
    :goto_10
    if-ge v4, v3, :cond_22

    .line 577
    .line 578
    const/16 v5, 0x10

    .line 579
    .line 580
    invoke-virtual {v13, v5}, LJ5/y;->i(I)I

    .line 581
    .line 582
    .line 583
    move-result v8

    .line 584
    const/4 v5, 0x2

    .line 585
    if-gt v8, v5, :cond_21

    .line 586
    .line 587
    const/16 v5, 0x18

    .line 588
    .line 589
    invoke-virtual {v13, v5}, LJ5/y;->t(I)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v13, v5}, LJ5/y;->t(I)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v13, v5}, LJ5/y;->t(I)V

    .line 596
    .line 597
    .line 598
    invoke-virtual {v13, v1}, LJ5/y;->i(I)I

    .line 599
    .line 600
    .line 601
    move-result v8

    .line 602
    add-int/lit8 v8, v8, 0x1

    .line 603
    .line 604
    const/16 v14, 0x8

    .line 605
    .line 606
    invoke-virtual {v13, v14}, LJ5/y;->t(I)V

    .line 607
    .line 608
    .line 609
    new-array v1, v8, [I

    .line 610
    .line 611
    const/4 v9, 0x0

    .line 612
    :goto_11
    if-ge v9, v8, :cond_1d

    .line 613
    .line 614
    const/4 v10, 0x3

    .line 615
    invoke-virtual {v13, v10}, LJ5/y;->i(I)I

    .line 616
    .line 617
    .line 618
    move-result v12

    .line 619
    invoke-virtual {v13}, LJ5/y;->h()Z

    .line 620
    .line 621
    .line 622
    move-result v15

    .line 623
    if-eqz v15, :cond_1c

    .line 624
    .line 625
    const/4 v15, 0x5

    .line 626
    invoke-virtual {v13, v15}, LJ5/y;->i(I)I

    .line 627
    .line 628
    .line 629
    move-result v17

    .line 630
    goto :goto_12

    .line 631
    :cond_1c
    const/4 v15, 0x5

    .line 632
    const/16 v17, 0x0

    .line 633
    .line 634
    :goto_12
    mul-int/lit8 v17, v17, 0x8

    .line 635
    .line 636
    add-int v17, v17, v12

    .line 637
    .line 638
    aput v17, v1, v9

    .line 639
    .line 640
    add-int/lit8 v9, v9, 0x1

    .line 641
    .line 642
    goto :goto_11

    .line 643
    :cond_1d
    const/4 v10, 0x3

    .line 644
    const/4 v15, 0x5

    .line 645
    const/4 v9, 0x0

    .line 646
    :goto_13
    if-ge v9, v8, :cond_20

    .line 647
    .line 648
    const/4 v12, 0x0

    .line 649
    :goto_14
    if-ge v12, v14, :cond_1f

    .line 650
    .line 651
    aget v17, v1, v9

    .line 652
    .line 653
    shl-int v19, v18, v12

    .line 654
    .line 655
    and-int v17, v17, v19

    .line 656
    .line 657
    if-eqz v17, :cond_1e

    .line 658
    .line 659
    invoke-virtual {v13, v14}, LJ5/y;->t(I)V

    .line 660
    .line 661
    .line 662
    :cond_1e
    add-int/lit8 v12, v12, 0x1

    .line 663
    .line 664
    const/16 v14, 0x8

    .line 665
    .line 666
    goto :goto_14

    .line 667
    :cond_1f
    add-int/lit8 v9, v9, 0x1

    .line 668
    .line 669
    const/16 v14, 0x8

    .line 670
    .line 671
    goto :goto_13

    .line 672
    :cond_20
    add-int/lit8 v4, v4, 0x1

    .line 673
    .line 674
    const/4 v1, 0x6

    .line 675
    goto :goto_10

    .line 676
    :cond_21
    const-string v1, "residueType greater than 2 is not decodable"

    .line 677
    .line 678
    const/4 v2, 0x0

    .line 679
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 680
    .line 681
    .line 682
    move-result-object v1

    .line 683
    throw v1

    .line 684
    :cond_22
    invoke-virtual {v13, v1}, LJ5/y;->i(I)I

    .line 685
    .line 686
    .line 687
    move-result v3

    .line 688
    add-int/lit8 v3, v3, 0x1

    .line 689
    .line 690
    const/4 v1, 0x0

    .line 691
    :goto_15
    if-ge v1, v3, :cond_29

    .line 692
    .line 693
    const/16 v5, 0x10

    .line 694
    .line 695
    invoke-virtual {v13, v5}, LJ5/y;->i(I)I

    .line 696
    .line 697
    .line 698
    move-result v4

    .line 699
    if-eqz v4, :cond_23

    .line 700
    .line 701
    new-instance v5, Ljava/lang/StringBuilder;

    .line 702
    .line 703
    const-string v8, "mapping type other than 0 not supported: "

    .line 704
    .line 705
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v4

    .line 715
    const-string v5, "VorbisUtil"

    .line 716
    .line 717
    invoke-static {v5, v4}, LQ1/k;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 718
    .line 719
    .line 720
    const/4 v5, 0x2

    .line 721
    const/4 v10, 0x4

    .line 722
    goto :goto_1a

    .line 723
    :cond_23
    invoke-virtual {v13}, LJ5/y;->h()Z

    .line 724
    .line 725
    .line 726
    move-result v4

    .line 727
    if-eqz v4, :cond_24

    .line 728
    .line 729
    const/4 v4, 0x4

    .line 730
    invoke-virtual {v13, v4}, LJ5/y;->i(I)I

    .line 731
    .line 732
    .line 733
    move-result v5

    .line 734
    add-int/lit8 v4, v5, 0x1

    .line 735
    .line 736
    goto :goto_16

    .line 737
    :cond_24
    move/from16 v4, v18

    .line 738
    .line 739
    :goto_16
    invoke-virtual {v13}, LJ5/y;->h()Z

    .line 740
    .line 741
    .line 742
    move-result v5

    .line 743
    iget v8, v6, LJ5/z;->a:I

    .line 744
    .line 745
    if-eqz v5, :cond_25

    .line 746
    .line 747
    const/16 v14, 0x8

    .line 748
    .line 749
    invoke-virtual {v13, v14}, LJ5/y;->i(I)I

    .line 750
    .line 751
    .line 752
    move-result v5

    .line 753
    add-int/lit8 v5, v5, 0x1

    .line 754
    .line 755
    const/4 v9, 0x0

    .line 756
    :goto_17
    if-ge v9, v5, :cond_25

    .line 757
    .line 758
    add-int/lit8 v10, v8, -0x1

    .line 759
    .line 760
    invoke-static {v10}, Ls2/a;->n(I)I

    .line 761
    .line 762
    .line 763
    move-result v12

    .line 764
    invoke-virtual {v13, v12}, LJ5/y;->t(I)V

    .line 765
    .line 766
    .line 767
    invoke-static {v10}, Ls2/a;->n(I)I

    .line 768
    .line 769
    .line 770
    move-result v10

    .line 771
    invoke-virtual {v13, v10}, LJ5/y;->t(I)V

    .line 772
    .line 773
    .line 774
    add-int/lit8 v9, v9, 0x1

    .line 775
    .line 776
    goto :goto_17

    .line 777
    :cond_25
    const/4 v5, 0x2

    .line 778
    invoke-virtual {v13, v5}, LJ5/y;->i(I)I

    .line 779
    .line 780
    .line 781
    move-result v9

    .line 782
    if-nez v9, :cond_28

    .line 783
    .line 784
    move/from16 v9, v18

    .line 785
    .line 786
    if-le v4, v9, :cond_26

    .line 787
    .line 788
    const/4 v9, 0x0

    .line 789
    :goto_18
    if-ge v9, v8, :cond_26

    .line 790
    .line 791
    const/4 v10, 0x4

    .line 792
    invoke-virtual {v13, v10}, LJ5/y;->t(I)V

    .line 793
    .line 794
    .line 795
    add-int/lit8 v9, v9, 0x1

    .line 796
    .line 797
    goto :goto_18

    .line 798
    :cond_26
    const/4 v10, 0x4

    .line 799
    const/4 v8, 0x0

    .line 800
    :goto_19
    if-ge v8, v4, :cond_27

    .line 801
    .line 802
    const/16 v14, 0x8

    .line 803
    .line 804
    invoke-virtual {v13, v14}, LJ5/y;->t(I)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v13, v14}, LJ5/y;->t(I)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v13, v14}, LJ5/y;->t(I)V

    .line 811
    .line 812
    .line 813
    add-int/lit8 v8, v8, 0x1

    .line 814
    .line 815
    goto :goto_19

    .line 816
    :cond_27
    :goto_1a
    add-int/lit8 v1, v1, 0x1

    .line 817
    .line 818
    const/16 v18, 0x1

    .line 819
    .line 820
    goto/16 :goto_15

    .line 821
    .line 822
    :cond_28
    const-string v1, "to reserved bits must be zero after mapping coupling steps"

    .line 823
    .line 824
    const/4 v2, 0x0

    .line 825
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 826
    .line 827
    .line 828
    move-result-object v1

    .line 829
    throw v1

    .line 830
    :cond_29
    const/4 v1, 0x6

    .line 831
    invoke-virtual {v13, v1}, LJ5/y;->i(I)I

    .line 832
    .line 833
    .line 834
    move-result v1

    .line 835
    add-int/lit8 v3, v1, 0x1

    .line 836
    .line 837
    new-array v9, v3, [Ls8/b;

    .line 838
    .line 839
    const/4 v4, 0x0

    .line 840
    :goto_1b
    if-ge v4, v3, :cond_2a

    .line 841
    .line 842
    invoke-virtual {v13}, LJ5/y;->h()Z

    .line 843
    .line 844
    .line 845
    move-result v5

    .line 846
    const/16 v8, 0x10

    .line 847
    .line 848
    invoke-virtual {v13, v8}, LJ5/y;->i(I)I

    .line 849
    .line 850
    .line 851
    invoke-virtual {v13, v8}, LJ5/y;->i(I)I

    .line 852
    .line 853
    .line 854
    const/16 v14, 0x8

    .line 855
    .line 856
    invoke-virtual {v13, v14}, LJ5/y;->i(I)I

    .line 857
    .line 858
    .line 859
    new-instance v10, Ls8/b;

    .line 860
    .line 861
    const/4 v12, 0x6

    .line 862
    invoke-direct {v10, v5, v12}, Ls8/b;-><init>(ZI)V

    .line 863
    .line 864
    .line 865
    aput-object v10, v9, v4

    .line 866
    .line 867
    add-int/lit8 v4, v4, 0x1

    .line 868
    .line 869
    goto :goto_1b

    .line 870
    :cond_2a
    invoke-virtual {v13}, LJ5/y;->h()Z

    .line 871
    .line 872
    .line 873
    move-result v3

    .line 874
    if-eqz v3, :cond_2c

    .line 875
    .line 876
    invoke-static {v1}, Ls2/a;->n(I)I

    .line 877
    .line 878
    .line 879
    move-result v10

    .line 880
    new-instance v5, LN2/j;

    .line 881
    .line 882
    move-object v8, v11

    .line 883
    invoke-direct/range {v5 .. v10}, LN2/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;[B[Ljava/lang/Object;I)V

    .line 884
    .line 885
    .line 886
    move-object v8, v5

    .line 887
    :goto_1c
    iput-object v8, v0, LN2/k;->o:LN2/j;

    .line 888
    .line 889
    if-nez v8, :cond_2b

    .line 890
    .line 891
    const/16 v18, 0x1

    .line 892
    .line 893
    return v18

    .line 894
    :cond_2b
    new-instance v1, Ljava/util/ArrayList;

    .line 895
    .line 896
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 897
    .line 898
    .line 899
    iget-object v3, v8, LN2/j;->c:Ljava/lang/Object;

    .line 900
    .line 901
    check-cast v3, LJ5/z;

    .line 902
    .line 903
    iget-object v4, v3, LJ5/z;->g:[B

    .line 904
    .line 905
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 906
    .line 907
    .line 908
    iget-object v4, v8, LN2/j;->a:Ljava/lang/Object;

    .line 909
    .line 910
    check-cast v4, [B

    .line 911
    .line 912
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 913
    .line 914
    .line 915
    iget-object v4, v8, LN2/j;->d:Ljava/lang/Object;

    .line 916
    .line 917
    check-cast v4, Lqd/d;

    .line 918
    .line 919
    iget-object v4, v4, Lqd/d;->b:[Ljava/lang/String;

    .line 920
    .line 921
    invoke-static {v4}, Ll8/K;->k([Ljava/lang/Object;)Ll8/e0;

    .line 922
    .line 923
    .line 924
    move-result-object v4

    .line 925
    invoke-static {v4}, Ls2/a;->u(Ljava/util/List;)LN1/B;

    .line 926
    .line 927
    .line 928
    move-result-object v4

    .line 929
    new-instance v5, LN1/m;

    .line 930
    .line 931
    invoke-direct {v5}, LN1/m;-><init>()V

    .line 932
    .line 933
    .line 934
    const-string v6, "audio/vorbis"

    .line 935
    .line 936
    invoke-static {v6}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v6

    .line 940
    iput-object v6, v5, LN1/m;->m:Ljava/lang/String;

    .line 941
    .line 942
    iget v6, v3, LJ5/z;->d:I

    .line 943
    .line 944
    iput v6, v5, LN1/m;->h:I

    .line 945
    .line 946
    iget v6, v3, LJ5/z;->c:I

    .line 947
    .line 948
    iput v6, v5, LN1/m;->i:I

    .line 949
    .line 950
    iget v6, v3, LJ5/z;->a:I

    .line 951
    .line 952
    iput v6, v5, LN1/m;->B:I

    .line 953
    .line 954
    iget v3, v3, LJ5/z;->b:I

    .line 955
    .line 956
    iput v3, v5, LN1/m;->C:I

    .line 957
    .line 958
    iput-object v1, v5, LN1/m;->p:Ljava/util/List;

    .line 959
    .line 960
    iput-object v4, v5, LN1/m;->k:LN1/B;

    .line 961
    .line 962
    new-instance v1, LN1/n;

    .line 963
    .line 964
    invoke-direct {v1, v5}, LN1/n;-><init>(LN1/m;)V

    .line 965
    .line 966
    .line 967
    iput-object v1, v2, LS3/c;->b:Ljava/lang/Object;

    .line 968
    .line 969
    const/16 v18, 0x1

    .line 970
    .line 971
    return v18

    .line 972
    :cond_2c
    const-string v1, "framing bit after modes not set as expected"

    .line 973
    .line 974
    const/4 v2, 0x0

    .line 975
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 976
    .line 977
    .line 978
    move-result-object v1

    .line 979
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
    iput-object p1, p0, LN2/k;->o:LN2/j;

    .line 8
    .line 9
    iput-object p1, p0, LN2/k;->r:LJ5/z;

    .line 10
    .line 11
    iput-object p1, p0, LN2/k;->s:Lqd/d;

    .line 12
    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    iput p1, p0, LN2/k;->p:I

    .line 15
    .line 16
    iput-boolean p1, p0, LN2/k;->q:Z

    .line 17
    .line 18
    return-void
.end method
