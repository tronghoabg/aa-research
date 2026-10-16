.class public final Lx2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls2/m;


# instance fields
.field public final a:[B

.field public final b:LQ1/o;

.field public final c:Z

.field public final d:LJ5/n;

.field public e:Ls2/o;

.field public f:Ls2/C;

.field public g:I

.field public h:LN1/B;

.field public i:LJ5/p;

.field public j:I

.field public k:I

.field public l:LY2/s;

.field public m:I

.field public n:J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x2a

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    iput-object v0, p0, Lx2/a;->a:[B

    .line 9
    .line 10
    new-instance v0, LQ1/o;

    .line 11
    .line 12
    const v1, 0x8000

    .line 13
    .line 14
    .line 15
    new-array v1, v1, [B

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v0, v1, v2}, LQ1/o;-><init>([BI)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lx2/a;->b:LQ1/o;

    .line 22
    .line 23
    iput-boolean v2, p0, Lx2/a;->c:Z

    .line 24
    .line 25
    new-instance v0, LJ5/n;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lx2/a;->d:LJ5/n;

    .line 31
    .line 32
    iput v2, p0, Lx2/a;->g:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    iput p2, p0, Lx2/a;->g:I

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, Lx2/a;->l:LY2/s;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1, p3, p4}, LJ5/f;->D(J)V

    .line 16
    .line 17
    .line 18
    :cond_1
    :goto_0
    cmp-long p1, p3, v0

    .line 19
    .line 20
    if-nez p1, :cond_2

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    const-wide/16 v0, -0x1

    .line 24
    .line 25
    :goto_1
    iput-wide v0, p0, Lx2/a;->n:J

    .line 26
    .line 27
    iput p2, p0, Lx2/a;->m:I

    .line 28
    .line 29
    iget-object p1, p0, Lx2/a;->b:LQ1/o;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, LQ1/o;->D(I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final g(Ls2/o;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lx2/a;->e:Ls2/o;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-interface {p1, v0, v1}, Ls2/o;->m(II)Ls2/C;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lx2/a;->f:Ls2/C;

    .line 10
    .line 11
    invoke-interface {p1}, Ls2/o;->l()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final h()Ls2/m;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final i(Ls2/n;)Z
    .locals 6

    .line 1
    check-cast p1, Ls2/j;

    .line 2
    .line 3
    sget-object v0, LG2/i;->c:LF5/d;

    .line 4
    .line 5
    new-instance v1, LX2/a;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v2}, LX2/a;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p1, v0}, LX2/a;->a(Ls2/j;LG2/g;)LN1/B;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, v0, LN1/B;->a:[LN1/A;

    .line 18
    .line 19
    array-length v0, v0

    .line 20
    :cond_0
    new-instance v0, LQ1/o;

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    invoke-direct {v0, v1}, LQ1/o;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iget-object v2, v0, LQ1/o;->a:[B

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual {p1, v2, v3, v1, v3}, Ls2/j;->c([BIIZ)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, LQ1/o;->w()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    const-wide/32 v4, 0x664c6143

    .line 37
    .line 38
    .line 39
    cmp-long p1, v0, v4

    .line 40
    .line 41
    if-nez p1, :cond_1

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    return p1

    .line 45
    :cond_1
    return v3
.end method

.method public final j()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Ll8/K;->b:Ll8/I;

    .line 2
    .line 3
    sget-object v0, Ll8/e0;->e:Ll8/e0;

    .line 4
    .line 5
    return-object v0
.end method

.method public final k(Ls2/n;LJ5/n;)I
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget v4, v0, Lx2/a;->g:I

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    if-eqz v4, :cond_28

    .line 10
    .line 11
    iget-object v6, v0, Lx2/a;->a:[B

    .line 12
    .line 13
    if-eq v4, v3, :cond_27

    .line 14
    .line 15
    const/4 v7, 0x4

    .line 16
    const/4 v8, 0x3

    .line 17
    if-eq v4, v1, :cond_25

    .line 18
    .line 19
    const/4 v9, 0x7

    .line 20
    const/4 v10, 0x6

    .line 21
    if-eq v4, v8, :cond_1c

    .line 22
    .line 23
    const-wide/16 v11, 0x0

    .line 24
    .line 25
    const-wide/16 v13, -0x1

    .line 26
    .line 27
    const/4 v6, 0x5

    .line 28
    if-eq v4, v7, :cond_16

    .line 29
    .line 30
    if-ne v4, v6, :cond_15

    .line 31
    .line 32
    iget-object v4, v0, Lx2/a;->f:Ls2/C;

    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v4, v0, Lx2/a;->i:LJ5/p;

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v4, v0, Lx2/a;->l:LY2/s;

    .line 43
    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    iget-object v6, v4, LJ5/f;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v6, LJ5/b;

    .line 49
    .line 50
    if-eqz v6, :cond_0

    .line 51
    .line 52
    move-object/from16 v1, p1

    .line 53
    .line 54
    check-cast v1, Ls2/j;

    .line 55
    .line 56
    move-object/from16 v2, p2

    .line 57
    .line 58
    invoke-virtual {v4, v1, v2}, LJ5/f;->v(Ls2/j;LJ5/n;)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    return v1

    .line 63
    :cond_0
    iget-wide v6, v0, Lx2/a;->n:J

    .line 64
    .line 65
    cmp-long v4, v6, v13

    .line 66
    .line 67
    const/4 v6, -0x1

    .line 68
    if-nez v4, :cond_7

    .line 69
    .line 70
    iget-object v4, v0, Lx2/a;->i:LJ5/p;

    .line 71
    .line 72
    move-object/from16 v7, p1

    .line 73
    .line 74
    check-cast v7, Ls2/j;

    .line 75
    .line 76
    iput v2, v7, Ls2/j;->f:I

    .line 77
    .line 78
    move-object/from16 v7, p1

    .line 79
    .line 80
    check-cast v7, Ls2/j;

    .line 81
    .line 82
    invoke-virtual {v7, v3, v2}, Ls2/j;->b(IZ)Z

    .line 83
    .line 84
    .line 85
    new-array v8, v3, [B

    .line 86
    .line 87
    invoke-virtual {v7, v8, v2, v3, v2}, Ls2/j;->c([BIIZ)Z

    .line 88
    .line 89
    .line 90
    aget-byte v8, v8, v2

    .line 91
    .line 92
    and-int/2addr v8, v3

    .line 93
    if-ne v8, v3, :cond_1

    .line 94
    .line 95
    move v8, v3

    .line 96
    goto :goto_0

    .line 97
    :cond_1
    move v8, v2

    .line 98
    :goto_0
    invoke-virtual {v7, v1, v2}, Ls2/j;->b(IZ)Z

    .line 99
    .line 100
    .line 101
    if-eqz v8, :cond_2

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    move v9, v10

    .line 105
    :goto_1
    new-instance v1, LQ1/o;

    .line 106
    .line 107
    invoke-direct {v1, v9}, LQ1/o;-><init>(I)V

    .line 108
    .line 109
    .line 110
    iget-object v10, v1, LQ1/o;->a:[B

    .line 111
    .line 112
    move v13, v2

    .line 113
    :goto_2
    if-ge v13, v9, :cond_4

    .line 114
    .line 115
    sub-int v14, v9, v13

    .line 116
    .line 117
    invoke-virtual {v7, v13, v14, v10}, Ls2/j;->m(II[B)I

    .line 118
    .line 119
    .line 120
    move-result v14

    .line 121
    if-ne v14, v6, :cond_3

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_3
    add-int/2addr v13, v14

    .line 125
    goto :goto_2

    .line 126
    :cond_4
    :goto_3
    invoke-virtual {v1, v13}, LQ1/o;->F(I)V

    .line 127
    .line 128
    .line 129
    iput v2, v7, Ls2/j;->f:I

    .line 130
    .line 131
    :try_start_0
    invoke-virtual {v1}, LQ1/o;->B()J

    .line 132
    .line 133
    .line 134
    move-result-wide v6
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    if-eqz v8, :cond_5

    .line 136
    .line 137
    :goto_4
    move-wide v11, v6

    .line 138
    goto :goto_5

    .line 139
    :cond_5
    iget v1, v4, LJ5/p;->c:I

    .line 140
    .line 141
    int-to-long v8, v1

    .line 142
    mul-long/2addr v6, v8

    .line 143
    goto :goto_4

    .line 144
    :catch_0
    move v3, v2

    .line 145
    :goto_5
    if-eqz v3, :cond_6

    .line 146
    .line 147
    iput-wide v11, v0, Lx2/a;->n:J

    .line 148
    .line 149
    goto/16 :goto_d

    .line 150
    .line 151
    :cond_6
    invoke-static {v5, v5}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    throw v1

    .line 156
    :cond_7
    iget-object v1, v0, Lx2/a;->b:LQ1/o;

    .line 157
    .line 158
    iget v4, v1, LQ1/o;->c:I

    .line 159
    .line 160
    const-wide/32 v7, 0xf4240

    .line 161
    .line 162
    .line 163
    const v5, 0x8000

    .line 164
    .line 165
    .line 166
    if-ge v4, v5, :cond_a

    .line 167
    .line 168
    iget-object v9, v1, LQ1/o;->a:[B

    .line 169
    .line 170
    sub-int/2addr v5, v4

    .line 171
    move-object/from16 v10, p1

    .line 172
    .line 173
    check-cast v10, Ls2/j;

    .line 174
    .line 175
    invoke-virtual {v10, v9, v4, v5}, Ls2/j;->read([BII)I

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-ne v5, v6, :cond_8

    .line 180
    .line 181
    move v9, v3

    .line 182
    goto :goto_6

    .line 183
    :cond_8
    move v9, v2

    .line 184
    :goto_6
    if-nez v9, :cond_9

    .line 185
    .line 186
    add-int/2addr v4, v5

    .line 187
    invoke-virtual {v1, v4}, LQ1/o;->F(I)V

    .line 188
    .line 189
    .line 190
    goto :goto_7

    .line 191
    :cond_9
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    if-nez v4, :cond_b

    .line 196
    .line 197
    iget-wide v1, v0, Lx2/a;->n:J

    .line 198
    .line 199
    mul-long/2addr v1, v7

    .line 200
    iget-object v3, v0, Lx2/a;->i:LJ5/p;

    .line 201
    .line 202
    sget v4, LQ1/x;->a:I

    .line 203
    .line 204
    iget v3, v3, LJ5/p;->f:I

    .line 205
    .line 206
    int-to-long v3, v3

    .line 207
    div-long v8, v1, v3

    .line 208
    .line 209
    iget-object v7, v0, Lx2/a;->f:Ls2/C;

    .line 210
    .line 211
    iget v11, v0, Lx2/a;->m:I

    .line 212
    .line 213
    const/4 v13, 0x0

    .line 214
    const/4 v10, 0x1

    .line 215
    const/4 v12, 0x0

    .line 216
    invoke-interface/range {v7 .. v13}, Ls2/C;->a(JIIILs2/B;)V

    .line 217
    .line 218
    .line 219
    return v6

    .line 220
    :cond_a
    move v9, v2

    .line 221
    :cond_b
    :goto_7
    iget v4, v1, LQ1/o;->b:I

    .line 222
    .line 223
    iget v5, v0, Lx2/a;->m:I

    .line 224
    .line 225
    iget v6, v0, Lx2/a;->j:I

    .line 226
    .line 227
    if-ge v5, v6, :cond_c

    .line 228
    .line 229
    sub-int/2addr v6, v5

    .line 230
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    invoke-virtual {v1, v5}, LQ1/o;->H(I)V

    .line 239
    .line 240
    .line 241
    :cond_c
    iget-object v5, v0, Lx2/a;->i:LJ5/p;

    .line 242
    .line 243
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    iget v5, v1, LQ1/o;->b:I

    .line 247
    .line 248
    :goto_8
    iget v6, v1, LQ1/o;->c:I

    .line 249
    .line 250
    const/16 v10, 0x10

    .line 251
    .line 252
    sub-int/2addr v6, v10

    .line 253
    iget-object v11, v0, Lx2/a;->d:LJ5/n;

    .line 254
    .line 255
    if-gt v5, v6, :cond_e

    .line 256
    .line 257
    invoke-virtual {v1, v5}, LQ1/o;->G(I)V

    .line 258
    .line 259
    .line 260
    iget-object v6, v0, Lx2/a;->i:LJ5/p;

    .line 261
    .line 262
    iget v12, v0, Lx2/a;->k:I

    .line 263
    .line 264
    invoke-static {v1, v6, v12, v11}, Ls2/a;->d(LQ1/o;LJ5/p;ILJ5/n;)Z

    .line 265
    .line 266
    .line 267
    move-result v6

    .line 268
    if-eqz v6, :cond_d

    .line 269
    .line 270
    invoke-virtual {v1, v5}, LQ1/o;->G(I)V

    .line 271
    .line 272
    .line 273
    iget-wide v5, v11, LJ5/n;->a:J

    .line 274
    .line 275
    goto :goto_c

    .line 276
    :cond_d
    add-int/2addr v5, v3

    .line 277
    goto :goto_8

    .line 278
    :cond_e
    if-eqz v9, :cond_12

    .line 279
    .line 280
    :goto_9
    iget v6, v1, LQ1/o;->c:I

    .line 281
    .line 282
    iget v9, v0, Lx2/a;->j:I

    .line 283
    .line 284
    sub-int v9, v6, v9

    .line 285
    .line 286
    if-gt v5, v9, :cond_11

    .line 287
    .line 288
    invoke-virtual {v1, v5}, LQ1/o;->G(I)V

    .line 289
    .line 290
    .line 291
    :try_start_1
    iget-object v6, v0, Lx2/a;->i:LJ5/p;

    .line 292
    .line 293
    iget v9, v0, Lx2/a;->k:I

    .line 294
    .line 295
    invoke-static {v1, v6, v9, v11}, Ls2/a;->d(LQ1/o;LJ5/p;ILJ5/n;)Z

    .line 296
    .line 297
    .line 298
    move-result v6
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    .line 299
    goto :goto_a

    .line 300
    :catch_1
    move v6, v2

    .line 301
    :goto_a
    iget v9, v1, LQ1/o;->b:I

    .line 302
    .line 303
    iget v12, v1, LQ1/o;->c:I

    .line 304
    .line 305
    if-le v9, v12, :cond_f

    .line 306
    .line 307
    move v6, v2

    .line 308
    :cond_f
    if-eqz v6, :cond_10

    .line 309
    .line 310
    invoke-virtual {v1, v5}, LQ1/o;->G(I)V

    .line 311
    .line 312
    .line 313
    iget-wide v5, v11, LJ5/n;->a:J

    .line 314
    .line 315
    goto :goto_c

    .line 316
    :cond_10
    add-int/2addr v5, v3

    .line 317
    goto :goto_9

    .line 318
    :cond_11
    invoke-virtual {v1, v6}, LQ1/o;->G(I)V

    .line 319
    .line 320
    .line 321
    goto :goto_b

    .line 322
    :cond_12
    invoke-virtual {v1, v5}, LQ1/o;->G(I)V

    .line 323
    .line 324
    .line 325
    :goto_b
    move-wide v5, v13

    .line 326
    :goto_c
    iget v3, v1, LQ1/o;->b:I

    .line 327
    .line 328
    sub-int/2addr v3, v4

    .line 329
    invoke-virtual {v1, v4}, LQ1/o;->G(I)V

    .line 330
    .line 331
    .line 332
    iget-object v4, v0, Lx2/a;->f:Ls2/C;

    .line 333
    .line 334
    invoke-interface {v4, v3, v1}, Ls2/C;->e(ILQ1/o;)V

    .line 335
    .line 336
    .line 337
    iget v4, v0, Lx2/a;->m:I

    .line 338
    .line 339
    add-int/2addr v4, v3

    .line 340
    iput v4, v0, Lx2/a;->m:I

    .line 341
    .line 342
    cmp-long v3, v5, v13

    .line 343
    .line 344
    if-eqz v3, :cond_13

    .line 345
    .line 346
    iget-wide v11, v0, Lx2/a;->n:J

    .line 347
    .line 348
    mul-long/2addr v11, v7

    .line 349
    iget-object v3, v0, Lx2/a;->i:LJ5/p;

    .line 350
    .line 351
    sget v7, LQ1/x;->a:I

    .line 352
    .line 353
    iget v3, v3, LJ5/p;->f:I

    .line 354
    .line 355
    int-to-long v7, v3

    .line 356
    div-long v16, v11, v7

    .line 357
    .line 358
    iget-object v15, v0, Lx2/a;->f:Ls2/C;

    .line 359
    .line 360
    const/16 v21, 0x0

    .line 361
    .line 362
    const/16 v18, 0x1

    .line 363
    .line 364
    const/16 v20, 0x0

    .line 365
    .line 366
    move/from16 v19, v4

    .line 367
    .line 368
    invoke-interface/range {v15 .. v21}, Ls2/C;->a(JIIILs2/B;)V

    .line 369
    .line 370
    .line 371
    iput v2, v0, Lx2/a;->m:I

    .line 372
    .line 373
    iput-wide v5, v0, Lx2/a;->n:J

    .line 374
    .line 375
    :cond_13
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 376
    .line 377
    .line 378
    move-result v3

    .line 379
    if-ge v3, v10, :cond_14

    .line 380
    .line 381
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    iget-object v4, v1, LQ1/o;->a:[B

    .line 386
    .line 387
    iget v5, v1, LQ1/o;->b:I

    .line 388
    .line 389
    invoke-static {v4, v5, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v1, v2}, LQ1/o;->G(I)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v1, v3}, LQ1/o;->F(I)V

    .line 396
    .line 397
    .line 398
    :cond_14
    :goto_d
    return v2

    .line 399
    :cond_15
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 400
    .line 401
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 402
    .line 403
    .line 404
    throw v1

    .line 405
    :cond_16
    move-object/from16 v3, p1

    .line 406
    .line 407
    check-cast v3, Ls2/j;

    .line 408
    .line 409
    iput v2, v3, Ls2/j;->f:I

    .line 410
    .line 411
    new-instance v3, LQ1/o;

    .line 412
    .line 413
    invoke-direct {v3, v1}, LQ1/o;-><init>(I)V

    .line 414
    .line 415
    .line 416
    iget-object v4, v3, LQ1/o;->a:[B

    .line 417
    .line 418
    move-object/from16 v7, p1

    .line 419
    .line 420
    check-cast v7, Ls2/j;

    .line 421
    .line 422
    invoke-virtual {v7, v4, v2, v1, v2}, Ls2/j;->c([BIIZ)Z

    .line 423
    .line 424
    .line 425
    invoke-virtual {v3}, LQ1/o;->A()I

    .line 426
    .line 427
    .line 428
    move-result v3

    .line 429
    shr-int/lit8 v1, v3, 0x2

    .line 430
    .line 431
    const/16 v4, 0x3ffe

    .line 432
    .line 433
    if-ne v1, v4, :cond_1b

    .line 434
    .line 435
    iput v2, v7, Ls2/j;->f:I

    .line 436
    .line 437
    iput v3, v0, Lx2/a;->k:I

    .line 438
    .line 439
    iget-object v1, v0, Lx2/a;->e:Ls2/o;

    .line 440
    .line 441
    sget v3, LQ1/x;->a:I

    .line 442
    .line 443
    iget-wide v3, v7, Ls2/j;->d:J

    .line 444
    .line 445
    iget-object v5, v0, Lx2/a;->i:LJ5/p;

    .line 446
    .line 447
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    iget-object v5, v0, Lx2/a;->i:LJ5/p;

    .line 451
    .line 452
    iget-object v8, v5, LJ5/p;->l:Ljava/lang/Object;

    .line 453
    .line 454
    check-cast v8, LY2/B;

    .line 455
    .line 456
    if-eqz v8, :cond_17

    .line 457
    .line 458
    new-instance v7, Ls2/q;

    .line 459
    .line 460
    invoke-direct {v7, v5, v3, v4, v2}, Ls2/q;-><init>(Ljava/lang/Object;JI)V

    .line 461
    .line 462
    .line 463
    move/from16 v29, v2

    .line 464
    .line 465
    goto/16 :goto_11

    .line 466
    .line 467
    :cond_17
    iget-wide v7, v7, Ls2/j;->c:J

    .line 468
    .line 469
    cmp-long v9, v7, v13

    .line 470
    .line 471
    if-eqz v9, :cond_1a

    .line 472
    .line 473
    iget-wide v13, v5, LJ5/p;->k:J

    .line 474
    .line 475
    cmp-long v9, v13, v11

    .line 476
    .line 477
    if-lez v9, :cond_1a

    .line 478
    .line 479
    new-instance v15, LY2/s;

    .line 480
    .line 481
    iget v9, v0, Lx2/a;->k:I

    .line 482
    .line 483
    new-instance v11, Lo1/c;

    .line 484
    .line 485
    const/16 v12, 0x9

    .line 486
    .line 487
    invoke-direct {v11, v5, v12}, Lo1/c;-><init>(Ljava/lang/Object;I)V

    .line 488
    .line 489
    .line 490
    new-instance v12, LE4/n;

    .line 491
    .line 492
    invoke-direct {v12, v5, v9, v2}, LE4/n;-><init>(LJ5/p;IB)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v5}, LJ5/p;->c()J

    .line 496
    .line 497
    .line 498
    move-result-wide v18

    .line 499
    iget v9, v5, LJ5/p;->d:I

    .line 500
    .line 501
    iget v13, v5, LJ5/p;->e:I

    .line 502
    .line 503
    if-lez v13, :cond_18

    .line 504
    .line 505
    int-to-long v13, v13

    .line 506
    move/from16 v29, v2

    .line 507
    .line 508
    move-wide/from16 v22, v3

    .line 509
    .line 510
    int-to-long v2, v9

    .line 511
    add-long/2addr v13, v2

    .line 512
    const-wide/16 v2, 0x2

    .line 513
    .line 514
    div-long/2addr v13, v2

    .line 515
    const-wide/16 v2, 0x1

    .line 516
    .line 517
    add-long/2addr v13, v2

    .line 518
    :goto_e
    move-wide/from16 v26, v13

    .line 519
    .line 520
    goto :goto_10

    .line 521
    :cond_18
    move/from16 v29, v2

    .line 522
    .line 523
    move-wide/from16 v22, v3

    .line 524
    .line 525
    iget v2, v5, LJ5/p;->c:I

    .line 526
    .line 527
    iget v3, v5, LJ5/p;->b:I

    .line 528
    .line 529
    if-ne v3, v2, :cond_19

    .line 530
    .line 531
    if-lez v3, :cond_19

    .line 532
    .line 533
    int-to-long v2, v3

    .line 534
    goto :goto_f

    .line 535
    :cond_19
    const-wide/16 v2, 0x1000

    .line 536
    .line 537
    :goto_f
    iget v4, v5, LJ5/p;->h:I

    .line 538
    .line 539
    int-to-long v13, v4

    .line 540
    mul-long/2addr v2, v13

    .line 541
    iget v4, v5, LJ5/p;->i:I

    .line 542
    .line 543
    int-to-long v13, v4

    .line 544
    mul-long/2addr v2, v13

    .line 545
    const-wide/16 v13, 0x8

    .line 546
    .line 547
    div-long/2addr v2, v13

    .line 548
    const-wide/16 v13, 0x40

    .line 549
    .line 550
    add-long/2addr v13, v2

    .line 551
    goto :goto_e

    .line 552
    :goto_10
    invoke-static {v10, v9}, Ljava/lang/Math;->max(II)I

    .line 553
    .line 554
    .line 555
    move-result v28

    .line 556
    iget-wide v2, v5, LJ5/p;->k:J

    .line 557
    .line 558
    move-wide/from16 v20, v2

    .line 559
    .line 560
    move-wide/from16 v24, v7

    .line 561
    .line 562
    move-object/from16 v16, v11

    .line 563
    .line 564
    move-object/from16 v17, v12

    .line 565
    .line 566
    invoke-direct/range {v15 .. v28}, LJ5/f;-><init>(Ls2/e;Ls2/g;JJJJJI)V

    .line 567
    .line 568
    .line 569
    iput-object v15, v0, Lx2/a;->l:LY2/s;

    .line 570
    .line 571
    iget-object v2, v15, LJ5/f;->c:Ljava/lang/Object;

    .line 572
    .line 573
    move-object v7, v2

    .line 574
    check-cast v7, Ls2/d;

    .line 575
    .line 576
    goto :goto_11

    .line 577
    :cond_1a
    move/from16 v29, v2

    .line 578
    .line 579
    new-instance v7, Ls2/q;

    .line 580
    .line 581
    invoke-virtual {v5}, LJ5/p;->c()J

    .line 582
    .line 583
    .line 584
    move-result-wide v2

    .line 585
    invoke-direct {v7, v2, v3}, Ls2/q;-><init>(J)V

    .line 586
    .line 587
    .line 588
    :goto_11
    invoke-interface {v1, v7}, Ls2/o;->s(Ls2/w;)V

    .line 589
    .line 590
    .line 591
    iput v6, v0, Lx2/a;->g:I

    .line 592
    .line 593
    return v29

    .line 594
    :cond_1b
    move v1, v2

    .line 595
    iput v1, v7, Ls2/j;->f:I

    .line 596
    .line 597
    const-string v1, "First frame does not start with sync code."

    .line 598
    .line 599
    invoke-static {v5, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    throw v1

    .line 604
    :cond_1c
    move v1, v2

    .line 605
    iget-object v2, v0, Lx2/a;->i:LJ5/p;

    .line 606
    .line 607
    move/from16 v29, v1

    .line 608
    .line 609
    :goto_12
    if-nez v29, :cond_24

    .line 610
    .line 611
    move-object/from16 v4, p1

    .line 612
    .line 613
    check-cast v4, Ls2/j;

    .line 614
    .line 615
    iput v1, v4, Ls2/j;->f:I

    .line 616
    .line 617
    new-instance v4, LJ5/y;

    .line 618
    .line 619
    new-array v5, v7, [B

    .line 620
    .line 621
    invoke-direct {v4, v5, v7, v3, v1}, LJ5/y;-><init>([BIIB)V

    .line 622
    .line 623
    .line 624
    move-object/from16 v11, p1

    .line 625
    .line 626
    check-cast v11, Ls2/j;

    .line 627
    .line 628
    invoke-virtual {v11, v5, v1, v7, v1}, Ls2/j;->c([BIIZ)Z

    .line 629
    .line 630
    .line 631
    invoke-virtual {v4}, LJ5/y;->h()Z

    .line 632
    .line 633
    .line 634
    move-result v5

    .line 635
    invoke-virtual {v4, v9}, LJ5/y;->i(I)I

    .line 636
    .line 637
    .line 638
    move-result v12

    .line 639
    const/16 v13, 0x18

    .line 640
    .line 641
    invoke-virtual {v4, v13}, LJ5/y;->i(I)I

    .line 642
    .line 643
    .line 644
    move-result v4

    .line 645
    add-int/2addr v4, v7

    .line 646
    if-nez v12, :cond_1d

    .line 647
    .line 648
    const/16 v2, 0x26

    .line 649
    .line 650
    new-array v4, v2, [B

    .line 651
    .line 652
    invoke-virtual {v11, v4, v1, v2, v1}, Ls2/j;->f([BIIZ)Z

    .line 653
    .line 654
    .line 655
    new-instance v1, LJ5/p;

    .line 656
    .line 657
    invoke-direct {v1, v4, v7, v3}, LJ5/p;-><init>([BII)V

    .line 658
    .line 659
    .line 660
    move-object v2, v1

    .line 661
    goto/16 :goto_18

    .line 662
    .line 663
    :cond_1d
    if-eqz v2, :cond_23

    .line 664
    .line 665
    if-ne v12, v8, :cond_1e

    .line 666
    .line 667
    new-instance v1, LQ1/o;

    .line 668
    .line 669
    invoke-direct {v1, v4}, LQ1/o;-><init>(I)V

    .line 670
    .line 671
    .line 672
    iget-object v12, v1, LQ1/o;->a:[B

    .line 673
    .line 674
    const/4 v13, 0x0

    .line 675
    invoke-virtual {v11, v12, v13, v4, v13}, Ls2/j;->f([BIIZ)Z

    .line 676
    .line 677
    .line 678
    invoke-static {v1}, Ls2/a;->w(LQ1/o;)LY2/B;

    .line 679
    .line 680
    .line 681
    move-result-object v24

    .line 682
    new-instance v14, LJ5/p;

    .line 683
    .line 684
    iget-wide v11, v2, LJ5/p;->k:J

    .line 685
    .line 686
    iget-object v1, v2, LJ5/p;->m:Landroid/os/Parcelable;

    .line 687
    .line 688
    move-object/from16 v25, v1

    .line 689
    .line 690
    check-cast v25, LN1/B;

    .line 691
    .line 692
    iget v15, v2, LJ5/p;->b:I

    .line 693
    .line 694
    iget v1, v2, LJ5/p;->c:I

    .line 695
    .line 696
    iget v4, v2, LJ5/p;->d:I

    .line 697
    .line 698
    iget v13, v2, LJ5/p;->e:I

    .line 699
    .line 700
    iget v9, v2, LJ5/p;->f:I

    .line 701
    .line 702
    iget v3, v2, LJ5/p;->h:I

    .line 703
    .line 704
    iget v2, v2, LJ5/p;->i:I

    .line 705
    .line 706
    move/from16 v16, v1

    .line 707
    .line 708
    move/from16 v21, v2

    .line 709
    .line 710
    move/from16 v20, v3

    .line 711
    .line 712
    move/from16 v17, v4

    .line 713
    .line 714
    move/from16 v19, v9

    .line 715
    .line 716
    move-wide/from16 v22, v11

    .line 717
    .line 718
    move/from16 v18, v13

    .line 719
    .line 720
    invoke-direct/range {v14 .. v25}, LJ5/p;-><init>(IIIIIIIJLY2/B;LN1/B;)V

    .line 721
    .line 722
    .line 723
    move-object v2, v14

    .line 724
    goto/16 :goto_18

    .line 725
    .line 726
    :cond_1e
    iget-object v1, v2, LJ5/p;->m:Landroid/os/Parcelable;

    .line 727
    .line 728
    check-cast v1, LN1/B;

    .line 729
    .line 730
    if-ne v12, v7, :cond_20

    .line 731
    .line 732
    new-instance v3, LQ1/o;

    .line 733
    .line 734
    invoke-direct {v3, v4}, LQ1/o;-><init>(I)V

    .line 735
    .line 736
    .line 737
    iget-object v9, v3, LQ1/o;->a:[B

    .line 738
    .line 739
    const/4 v13, 0x0

    .line 740
    invoke-virtual {v11, v9, v13, v4, v13}, Ls2/j;->f([BIIZ)Z

    .line 741
    .line 742
    .line 743
    invoke-virtual {v3, v7}, LQ1/o;->H(I)V

    .line 744
    .line 745
    .line 746
    invoke-static {v3, v13, v13}, Ls2/a;->x(LQ1/o;ZZ)Lqd/d;

    .line 747
    .line 748
    .line 749
    move-result-object v3

    .line 750
    iget-object v3, v3, Lqd/d;->b:[Ljava/lang/String;

    .line 751
    .line 752
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 753
    .line 754
    .line 755
    move-result-object v3

    .line 756
    invoke-static {v3}, Ls2/a;->u(Ljava/util/List;)LN1/B;

    .line 757
    .line 758
    .line 759
    move-result-object v3

    .line 760
    if-nez v1, :cond_1f

    .line 761
    .line 762
    :goto_13
    move-object/from16 v22, v3

    .line 763
    .line 764
    goto :goto_14

    .line 765
    :cond_1f
    invoke-virtual {v1, v3}, LN1/B;->e(LN1/B;)LN1/B;

    .line 766
    .line 767
    .line 768
    move-result-object v3

    .line 769
    goto :goto_13

    .line 770
    :goto_14
    new-instance v11, LJ5/p;

    .line 771
    .line 772
    iget-wide v3, v2, LJ5/p;->k:J

    .line 773
    .line 774
    iget-object v1, v2, LJ5/p;->l:Ljava/lang/Object;

    .line 775
    .line 776
    move-object/from16 v21, v1

    .line 777
    .line 778
    check-cast v21, LY2/B;

    .line 779
    .line 780
    iget v12, v2, LJ5/p;->b:I

    .line 781
    .line 782
    iget v13, v2, LJ5/p;->c:I

    .line 783
    .line 784
    iget v14, v2, LJ5/p;->d:I

    .line 785
    .line 786
    iget v15, v2, LJ5/p;->e:I

    .line 787
    .line 788
    iget v1, v2, LJ5/p;->f:I

    .line 789
    .line 790
    iget v9, v2, LJ5/p;->h:I

    .line 791
    .line 792
    iget v2, v2, LJ5/p;->i:I

    .line 793
    .line 794
    move/from16 v16, v1

    .line 795
    .line 796
    move/from16 v18, v2

    .line 797
    .line 798
    move-wide/from16 v19, v3

    .line 799
    .line 800
    move/from16 v17, v9

    .line 801
    .line 802
    invoke-direct/range {v11 .. v22}, LJ5/p;-><init>(IIIIIIIJLY2/B;LN1/B;)V

    .line 803
    .line 804
    .line 805
    :goto_15
    move-object v2, v11

    .line 806
    goto :goto_18

    .line 807
    :cond_20
    if-ne v12, v10, :cond_22

    .line 808
    .line 809
    new-instance v3, LQ1/o;

    .line 810
    .line 811
    invoke-direct {v3, v4}, LQ1/o;-><init>(I)V

    .line 812
    .line 813
    .line 814
    iget-object v9, v3, LQ1/o;->a:[B

    .line 815
    .line 816
    const/4 v13, 0x0

    .line 817
    invoke-virtual {v11, v9, v13, v4, v13}, Ls2/j;->f([BIIZ)Z

    .line 818
    .line 819
    .line 820
    invoke-virtual {v3, v7}, LQ1/o;->H(I)V

    .line 821
    .line 822
    .line 823
    invoke-static {v3}, LE2/a;->c(LQ1/o;)LE2/a;

    .line 824
    .line 825
    .line 826
    move-result-object v3

    .line 827
    invoke-static {v3}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 828
    .line 829
    .line 830
    move-result-object v3

    .line 831
    new-instance v4, LN1/B;

    .line 832
    .line 833
    invoke-direct {v4, v3}, LN1/B;-><init>(Ljava/util/List;)V

    .line 834
    .line 835
    .line 836
    if-nez v1, :cond_21

    .line 837
    .line 838
    :goto_16
    move-object/from16 v22, v4

    .line 839
    .line 840
    goto :goto_17

    .line 841
    :cond_21
    invoke-virtual {v1, v4}, LN1/B;->e(LN1/B;)LN1/B;

    .line 842
    .line 843
    .line 844
    move-result-object v4

    .line 845
    goto :goto_16

    .line 846
    :goto_17
    new-instance v11, LJ5/p;

    .line 847
    .line 848
    iget-wide v3, v2, LJ5/p;->k:J

    .line 849
    .line 850
    iget-object v1, v2, LJ5/p;->l:Ljava/lang/Object;

    .line 851
    .line 852
    move-object/from16 v21, v1

    .line 853
    .line 854
    check-cast v21, LY2/B;

    .line 855
    .line 856
    iget v12, v2, LJ5/p;->b:I

    .line 857
    .line 858
    iget v13, v2, LJ5/p;->c:I

    .line 859
    .line 860
    iget v14, v2, LJ5/p;->d:I

    .line 861
    .line 862
    iget v15, v2, LJ5/p;->e:I

    .line 863
    .line 864
    iget v1, v2, LJ5/p;->f:I

    .line 865
    .line 866
    iget v9, v2, LJ5/p;->h:I

    .line 867
    .line 868
    iget v2, v2, LJ5/p;->i:I

    .line 869
    .line 870
    move/from16 v16, v1

    .line 871
    .line 872
    move/from16 v18, v2

    .line 873
    .line 874
    move-wide/from16 v19, v3

    .line 875
    .line 876
    move/from16 v17, v9

    .line 877
    .line 878
    invoke-direct/range {v11 .. v22}, LJ5/p;-><init>(IIIIIIIJLY2/B;LN1/B;)V

    .line 879
    .line 880
    .line 881
    goto :goto_15

    .line 882
    :cond_22
    invoke-virtual {v11, v4}, Ls2/j;->j(I)V

    .line 883
    .line 884
    .line 885
    :goto_18
    sget v1, LQ1/x;->a:I

    .line 886
    .line 887
    iput-object v2, v0, Lx2/a;->i:LJ5/p;

    .line 888
    .line 889
    move/from16 v29, v5

    .line 890
    .line 891
    const/4 v1, 0x0

    .line 892
    const/4 v3, 0x1

    .line 893
    const/4 v9, 0x7

    .line 894
    goto/16 :goto_12

    .line 895
    .line 896
    :cond_23
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 897
    .line 898
    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 899
    .line 900
    .line 901
    throw v1

    .line 902
    :cond_24
    iget-object v1, v0, Lx2/a;->i:LJ5/p;

    .line 903
    .line 904
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 905
    .line 906
    .line 907
    iget-object v1, v0, Lx2/a;->i:LJ5/p;

    .line 908
    .line 909
    iget v1, v1, LJ5/p;->d:I

    .line 910
    .line 911
    invoke-static {v1, v10}, Ljava/lang/Math;->max(II)I

    .line 912
    .line 913
    .line 914
    move-result v1

    .line 915
    iput v1, v0, Lx2/a;->j:I

    .line 916
    .line 917
    iget-object v1, v0, Lx2/a;->f:Ls2/C;

    .line 918
    .line 919
    sget v2, LQ1/x;->a:I

    .line 920
    .line 921
    iget-object v2, v0, Lx2/a;->i:LJ5/p;

    .line 922
    .line 923
    iget-object v3, v0, Lx2/a;->h:LN1/B;

    .line 924
    .line 925
    invoke-virtual {v2, v6, v3}, LJ5/p;->e([BLN1/B;)LN1/n;

    .line 926
    .line 927
    .line 928
    move-result-object v2

    .line 929
    invoke-interface {v1, v2}, Ls2/C;->c(LN1/n;)V

    .line 930
    .line 931
    .line 932
    iput v7, v0, Lx2/a;->g:I

    .line 933
    .line 934
    const/4 v13, 0x0

    .line 935
    return v13

    .line 936
    :cond_25
    move v13, v2

    .line 937
    new-instance v1, LQ1/o;

    .line 938
    .line 939
    invoke-direct {v1, v7}, LQ1/o;-><init>(I)V

    .line 940
    .line 941
    .line 942
    iget-object v2, v1, LQ1/o;->a:[B

    .line 943
    .line 944
    move-object/from16 v3, p1

    .line 945
    .line 946
    check-cast v3, Ls2/j;

    .line 947
    .line 948
    invoke-virtual {v3, v2, v13, v7, v13}, Ls2/j;->f([BIIZ)Z

    .line 949
    .line 950
    .line 951
    invoke-virtual {v1}, LQ1/o;->w()J

    .line 952
    .line 953
    .line 954
    move-result-wide v1

    .line 955
    const-wide/32 v3, 0x664c6143

    .line 956
    .line 957
    .line 958
    cmp-long v1, v1, v3

    .line 959
    .line 960
    if-nez v1, :cond_26

    .line 961
    .line 962
    iput v8, v0, Lx2/a;->g:I

    .line 963
    .line 964
    return v13

    .line 965
    :cond_26
    const-string v1, "Failed to read FLAC stream marker."

    .line 966
    .line 967
    invoke-static {v5, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 968
    .line 969
    .line 970
    move-result-object v1

    .line 971
    throw v1

    .line 972
    :cond_27
    move v13, v2

    .line 973
    array-length v2, v6

    .line 974
    move-object/from16 v3, p1

    .line 975
    .line 976
    check-cast v3, Ls2/j;

    .line 977
    .line 978
    invoke-virtual {v3, v6, v13, v2, v13}, Ls2/j;->c([BIIZ)Z

    .line 979
    .line 980
    .line 981
    move-object/from16 v2, p1

    .line 982
    .line 983
    check-cast v2, Ls2/j;

    .line 984
    .line 985
    iput v13, v2, Ls2/j;->f:I

    .line 986
    .line 987
    iput v1, v0, Lx2/a;->g:I

    .line 988
    .line 989
    return v13

    .line 990
    :cond_28
    move v13, v2

    .line 991
    move-object/from16 v1, p1

    .line 992
    .line 993
    check-cast v1, Ls2/j;

    .line 994
    .line 995
    iput v13, v1, Ls2/j;->f:I

    .line 996
    .line 997
    move-object/from16 v1, p1

    .line 998
    .line 999
    check-cast v1, Ls2/j;

    .line 1000
    .line 1001
    invoke-virtual {v1}, Ls2/j;->g()J

    .line 1002
    .line 1003
    .line 1004
    move-result-wide v2

    .line 1005
    iget-boolean v4, v0, Lx2/a;->c:Z

    .line 1006
    .line 1007
    if-nez v4, :cond_29

    .line 1008
    .line 1009
    move-object v4, v5

    .line 1010
    goto :goto_19

    .line 1011
    :cond_29
    sget-object v4, LG2/i;->c:LF5/d;

    .line 1012
    .line 1013
    :goto_19
    new-instance v6, LX2/a;

    .line 1014
    .line 1015
    const/4 v7, 0x1

    .line 1016
    invoke-direct {v6, v7}, LX2/a;-><init>(I)V

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v6, v1, v4}, LX2/a;->a(Ls2/j;LG2/g;)LN1/B;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v4

    .line 1023
    if-eqz v4, :cond_2b

    .line 1024
    .line 1025
    iget-object v6, v4, LN1/B;->a:[LN1/A;

    .line 1026
    .line 1027
    array-length v6, v6

    .line 1028
    if-nez v6, :cond_2a

    .line 1029
    .line 1030
    goto :goto_1a

    .line 1031
    :cond_2a
    move-object v5, v4

    .line 1032
    :cond_2b
    :goto_1a
    invoke-virtual {v1}, Ls2/j;->g()J

    .line 1033
    .line 1034
    .line 1035
    move-result-wide v6

    .line 1036
    sub-long/2addr v6, v2

    .line 1037
    long-to-int v2, v6

    .line 1038
    invoke-virtual {v1, v2}, Ls2/j;->j(I)V

    .line 1039
    .line 1040
    .line 1041
    iput-object v5, v0, Lx2/a;->h:LN1/B;

    .line 1042
    .line 1043
    const/4 v7, 0x1

    .line 1044
    iput v7, v0, Lx2/a;->g:I

    .line 1045
    .line 1046
    const/16 v29, 0x0

    .line 1047
    .line 1048
    return v29
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
