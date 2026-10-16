.class public final Lu2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls2/m;


# instance fields
.field public final a:LQ1/o;

.field public final b:LG5/c;

.field public final c:Z

.field public final d:Lwa/a;

.field public e:I

.field public f:Ls2/o;

.field public g:Lu2/c;

.field public h:J

.field public i:[Lu2/e;

.field public j:J

.field public k:Lu2/e;

.field public l:I

.field public m:J

.field public n:J

.field public o:I

.field public p:Z


# direct methods
.method public constructor <init>(ILwa/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lu2/b;->d:Lwa/a;

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    and-int/2addr p1, p2

    .line 8
    const/4 v0, 0x0

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move p2, v0

    .line 13
    :goto_0
    iput-boolean p2, p0, Lu2/b;->c:Z

    .line 14
    .line 15
    new-instance p1, LQ1/o;

    .line 16
    .line 17
    const/16 p2, 0xc

    .line 18
    .line 19
    invoke-direct {p1, p2}, LQ1/o;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lu2/b;->a:LQ1/o;

    .line 23
    .line 24
    new-instance p1, LG5/c;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lu2/b;->b:LG5/c;

    .line 30
    .line 31
    new-instance p1, Lab/b;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lu2/b;->f:Ls2/o;

    .line 37
    .line 38
    new-array p1, v0, [Lu2/e;

    .line 39
    .line 40
    iput-object p1, p0, Lu2/b;->i:[Lu2/e;

    .line 41
    .line 42
    const-wide/16 p1, -0x1

    .line 43
    .line 44
    iput-wide p1, p0, Lu2/b;->m:J

    .line 45
    .line 46
    iput-wide p1, p0, Lu2/b;->n:J

    .line 47
    .line 48
    const/4 p1, -0x1

    .line 49
    iput p1, p0, Lu2/b;->l:I

    .line 50
    .line 51
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    iput-wide p1, p0, Lu2/b;->h:J

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 5

    .line 1
    const-wide/16 p3, -0x1

    .line 2
    .line 3
    iput-wide p3, p0, Lu2/b;->j:J

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    iput-object p3, p0, Lu2/b;->k:Lu2/e;

    .line 7
    .line 8
    iget-object p3, p0, Lu2/b;->i:[Lu2/e;

    .line 9
    .line 10
    array-length p4, p3

    .line 11
    const/4 v0, 0x0

    .line 12
    move v1, v0

    .line 13
    :goto_0
    if-ge v1, p4, :cond_1

    .line 14
    .line 15
    aget-object v2, p3, v1

    .line 16
    .line 17
    iget v3, v2, Lu2/e;->j:I

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    iput v0, v2, Lu2/e;->h:I

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v3, v2, Lu2/e;->l:[J

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    invoke-static {v3, p1, p2, v4}, LQ1/x;->e([JJZ)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    iget-object v4, v2, Lu2/e;->m:[I

    .line 32
    .line 33
    aget v3, v4, v3

    .line 34
    .line 35
    iput v3, v2, Lu2/e;->h:I

    .line 36
    .line 37
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const-wide/16 p3, 0x0

    .line 41
    .line 42
    cmp-long p1, p1, p3

    .line 43
    .line 44
    if-nez p1, :cond_3

    .line 45
    .line 46
    iget-object p1, p0, Lu2/b;->i:[Lu2/e;

    .line 47
    .line 48
    array-length p1, p1

    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    iput v0, p0, Lu2/b;->e:I

    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    const/4 p1, 0x3

    .line 55
    iput p1, p0, Lu2/b;->e:I

    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    const/4 p1, 0x6

    .line 59
    iput p1, p0, Lu2/b;->e:I

    .line 60
    .line 61
    return-void
.end method

.method public final g(Ls2/o;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lu2/b;->e:I

    .line 3
    .line 4
    iget-boolean v0, p0, Lu2/b;->c:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, LDd/c;

    .line 9
    .line 10
    iget-object v1, p0, Lu2/b;->d:Lwa/a;

    .line 11
    .line 12
    invoke-direct {v0, p1, v1}, LDd/c;-><init>(Ls2/o;LP2/j;)V

    .line 13
    .line 14
    .line 15
    move-object p1, v0

    .line 16
    :cond_0
    iput-object p1, p0, Lu2/b;->f:Ls2/o;

    .line 17
    .line 18
    const-wide/16 v0, -0x1

    .line 19
    .line 20
    iput-wide v0, p0, Lu2/b;->j:J

    .line 21
    .line 22
    return-void
.end method

.method public final h()Ls2/m;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final i(Ls2/n;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lu2/b;->a:LQ1/o;

    .line 2
    .line 3
    iget-object v1, v0, LQ1/o;->a:[B

    .line 4
    .line 5
    check-cast p1, Ls2/j;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/16 v3, 0xc

    .line 9
    .line 10
    invoke-virtual {p1, v1, v2, v3, v2}, Ls2/j;->c([BIIZ)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v2}, LQ1/o;->G(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, LQ1/o;->j()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const v1, 0x46464952

    .line 21
    .line 22
    .line 23
    if-eq p1, v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x4

    .line 27
    invoke-virtual {v0, p1}, LQ1/o;->H(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, LQ1/o;->j()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    const v0, 0x20495641

    .line 35
    .line 36
    .line 37
    if-ne p1, v0, :cond_1

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_1
    :goto_0
    return v2
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
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-wide v4, v0, Lu2/b;->j:J

    .line 8
    .line 9
    const-wide/16 v6, -0x1

    .line 10
    .line 11
    cmp-long v8, v4, v6

    .line 12
    .line 13
    const/4 v9, 0x0

    .line 14
    if-eqz v8, :cond_2

    .line 15
    .line 16
    move-object v8, v1

    .line 17
    check-cast v8, Ls2/j;

    .line 18
    .line 19
    iget-wide v10, v8, Ls2/j;->d:J

    .line 20
    .line 21
    cmp-long v8, v4, v10

    .line 22
    .line 23
    if-ltz v8, :cond_0

    .line 24
    .line 25
    const-wide/32 v12, 0x40000

    .line 26
    .line 27
    .line 28
    add-long/2addr v12, v10

    .line 29
    cmp-long v8, v4, v12

    .line 30
    .line 31
    if-lez v8, :cond_1

    .line 32
    .line 33
    :cond_0
    move-object/from16 v8, p2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    sub-long/2addr v4, v10

    .line 37
    long-to-int v4, v4

    .line 38
    move-object v5, v1

    .line 39
    check-cast v5, Ls2/j;

    .line 40
    .line 41
    invoke-virtual {v5, v4}, Ls2/j;->j(I)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :goto_0
    iput-wide v4, v8, LJ5/n;->a:J

    .line 46
    .line 47
    move v4, v3

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    :goto_1
    move v4, v9

    .line 50
    :goto_2
    iput-wide v6, v0, Lu2/b;->j:J

    .line 51
    .line 52
    if-eqz v4, :cond_3

    .line 53
    .line 54
    return v3

    .line 55
    :cond_3
    iget v4, v0, Lu2/b;->e:I

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    const/16 v13, 0x10

    .line 59
    .line 60
    const v14, 0x69766f6d

    .line 61
    .line 62
    .line 63
    const/16 v15, 0x8

    .line 64
    .line 65
    move-wide/from16 v16, v6

    .line 66
    .line 67
    const v6, 0x5453494c

    .line 68
    .line 69
    .line 70
    const-wide/16 v18, 0x8

    .line 71
    .line 72
    const/16 v7, 0xc

    .line 73
    .line 74
    const/16 p2, 0x3

    .line 75
    .line 76
    iget-object v12, v0, Lu2/b;->b:LG5/c;

    .line 77
    .line 78
    iget-object v8, v0, Lu2/b;->a:LQ1/o;

    .line 79
    .line 80
    packed-switch v4, :pswitch_data_0

    .line 81
    .line 82
    .line 83
    new-instance v1, Ljava/lang/AssertionError;

    .line 84
    .line 85
    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    .line 86
    .line 87
    .line 88
    throw v1

    .line 89
    :pswitch_0
    move-object v2, v1

    .line 90
    check-cast v2, Ls2/j;

    .line 91
    .line 92
    iget-wide v10, v2, Ls2/j;->d:J

    .line 93
    .line 94
    iget-wide v12, v0, Lu2/b;->n:J

    .line 95
    .line 96
    cmp-long v2, v10, v12

    .line 97
    .line 98
    if-ltz v2, :cond_4

    .line 99
    .line 100
    const/4 v1, -0x1

    .line 101
    return v1

    .line 102
    :cond_4
    iget-object v2, v0, Lu2/b;->k:Lu2/e;

    .line 103
    .line 104
    if-eqz v2, :cond_a

    .line 105
    .line 106
    iget v4, v2, Lu2/e;->g:I

    .line 107
    .line 108
    iget-object v6, v2, Lu2/e;->a:Ls2/C;

    .line 109
    .line 110
    invoke-interface {v6, v1, v4, v9}, Ls2/C;->d(LN1/g;IZ)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    sub-int/2addr v4, v1

    .line 115
    iput v4, v2, Lu2/e;->g:I

    .line 116
    .line 117
    if-nez v4, :cond_5

    .line 118
    .line 119
    move v1, v3

    .line 120
    goto :goto_3

    .line 121
    :cond_5
    move v1, v9

    .line 122
    :goto_3
    if-eqz v1, :cond_8

    .line 123
    .line 124
    iget v4, v2, Lu2/e;->f:I

    .line 125
    .line 126
    if-lez v4, :cond_7

    .line 127
    .line 128
    iget v4, v2, Lu2/e;->h:I

    .line 129
    .line 130
    iget-wide v6, v2, Lu2/e;->d:J

    .line 131
    .line 132
    int-to-long v10, v4

    .line 133
    mul-long/2addr v6, v10

    .line 134
    iget v8, v2, Lu2/e;->e:I

    .line 135
    .line 136
    int-to-long v10, v8

    .line 137
    div-long v13, v6, v10

    .line 138
    .line 139
    iget-object v6, v2, Lu2/e;->m:[I

    .line 140
    .line 141
    invoke-static {v6, v4}, Ljava/util/Arrays;->binarySearch([II)I

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    if-ltz v4, :cond_6

    .line 146
    .line 147
    move v15, v3

    .line 148
    goto :goto_4

    .line 149
    :cond_6
    move v15, v9

    .line 150
    :goto_4
    iget v4, v2, Lu2/e;->f:I

    .line 151
    .line 152
    const/16 v17, 0x0

    .line 153
    .line 154
    const/16 v18, 0x0

    .line 155
    .line 156
    iget-object v12, v2, Lu2/e;->a:Ls2/C;

    .line 157
    .line 158
    move/from16 v16, v4

    .line 159
    .line 160
    invoke-interface/range {v12 .. v18}, Ls2/C;->a(JIIILs2/B;)V

    .line 161
    .line 162
    .line 163
    :cond_7
    iget v4, v2, Lu2/e;->h:I

    .line 164
    .line 165
    add-int/2addr v4, v3

    .line 166
    iput v4, v2, Lu2/e;->h:I

    .line 167
    .line 168
    :cond_8
    if-eqz v1, :cond_9

    .line 169
    .line 170
    iput-object v5, v0, Lu2/b;->k:Lu2/e;

    .line 171
    .line 172
    :cond_9
    return v9

    .line 173
    :cond_a
    check-cast v1, Ls2/j;

    .line 174
    .line 175
    iget-wide v10, v1, Ls2/j;->d:J

    .line 176
    .line 177
    const-wide/16 v12, 0x1

    .line 178
    .line 179
    and-long/2addr v10, v12

    .line 180
    cmp-long v2, v10, v12

    .line 181
    .line 182
    if-nez v2, :cond_b

    .line 183
    .line 184
    invoke-virtual {v1, v3}, Ls2/j;->j(I)V

    .line 185
    .line 186
    .line 187
    :cond_b
    iget-object v2, v8, LQ1/o;->a:[B

    .line 188
    .line 189
    invoke-virtual {v1, v2, v9, v7, v9}, Ls2/j;->c([BIIZ)Z

    .line 190
    .line 191
    .line 192
    invoke-virtual {v8, v9}, LQ1/o;->G(I)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v8}, LQ1/o;->j()I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    if-ne v2, v6, :cond_d

    .line 200
    .line 201
    invoke-virtual {v8, v15}, LQ1/o;->G(I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v8}, LQ1/o;->j()I

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-ne v2, v14, :cond_c

    .line 209
    .line 210
    move v15, v7

    .line 211
    :cond_c
    invoke-virtual {v1, v15}, Ls2/j;->j(I)V

    .line 212
    .line 213
    .line 214
    iput v9, v1, Ls2/j;->f:I

    .line 215
    .line 216
    return v9

    .line 217
    :cond_d
    invoke-virtual {v8}, LQ1/o;->j()I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    const v6, 0x4b4e554a    # 1.352225E7f

    .line 222
    .line 223
    .line 224
    if-ne v2, v6, :cond_e

    .line 225
    .line 226
    iget-wide v1, v1, Ls2/j;->d:J

    .line 227
    .line 228
    int-to-long v3, v4

    .line 229
    add-long/2addr v1, v3

    .line 230
    add-long v1, v1, v18

    .line 231
    .line 232
    iput-wide v1, v0, Lu2/b;->j:J

    .line 233
    .line 234
    return v9

    .line 235
    :cond_e
    invoke-virtual {v1, v15}, Ls2/j;->j(I)V

    .line 236
    .line 237
    .line 238
    iput v9, v1, Ls2/j;->f:I

    .line 239
    .line 240
    iget-object v6, v0, Lu2/b;->i:[Lu2/e;

    .line 241
    .line 242
    array-length v7, v6

    .line 243
    move v8, v9

    .line 244
    :goto_5
    if-ge v8, v7, :cond_11

    .line 245
    .line 246
    aget-object v10, v6, v8

    .line 247
    .line 248
    iget v11, v10, Lu2/e;->b:I

    .line 249
    .line 250
    if-eq v11, v2, :cond_10

    .line 251
    .line 252
    iget v11, v10, Lu2/e;->c:I

    .line 253
    .line 254
    if-ne v11, v2, :cond_f

    .line 255
    .line 256
    goto :goto_6

    .line 257
    :cond_f
    add-int/2addr v8, v3

    .line 258
    goto :goto_5

    .line 259
    :cond_10
    :goto_6
    move-object v5, v10

    .line 260
    :cond_11
    if-nez v5, :cond_12

    .line 261
    .line 262
    iget-wide v1, v1, Ls2/j;->d:J

    .line 263
    .line 264
    int-to-long v3, v4

    .line 265
    add-long/2addr v1, v3

    .line 266
    iput-wide v1, v0, Lu2/b;->j:J

    .line 267
    .line 268
    return v9

    .line 269
    :cond_12
    iput v4, v5, Lu2/e;->f:I

    .line 270
    .line 271
    iput v4, v5, Lu2/e;->g:I

    .line 272
    .line 273
    iput-object v5, v0, Lu2/b;->k:Lu2/e;

    .line 274
    .line 275
    return v9

    .line 276
    :pswitch_1
    new-instance v4, LQ1/o;

    .line 277
    .line 278
    iget v6, v0, Lu2/b;->o:I

    .line 279
    .line 280
    invoke-direct {v4, v6}, LQ1/o;-><init>(I)V

    .line 281
    .line 282
    .line 283
    iget-object v6, v4, LQ1/o;->a:[B

    .line 284
    .line 285
    iget v7, v0, Lu2/b;->o:I

    .line 286
    .line 287
    check-cast v1, Ls2/j;

    .line 288
    .line 289
    invoke-virtual {v1, v6, v9, v7, v9}, Ls2/j;->f([BIIZ)Z

    .line 290
    .line 291
    .line 292
    invoke-virtual {v4}, LQ1/o;->a()I

    .line 293
    .line 294
    .line 295
    move-result v1

    .line 296
    if-ge v1, v13, :cond_13

    .line 297
    .line 298
    const-wide/16 v6, 0x0

    .line 299
    .line 300
    goto :goto_8

    .line 301
    :cond_13
    iget v1, v4, LQ1/o;->b:I

    .line 302
    .line 303
    invoke-virtual {v4, v15}, LQ1/o;->H(I)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v4}, LQ1/o;->j()I

    .line 307
    .line 308
    .line 309
    move-result v8

    .line 310
    int-to-long v14, v8

    .line 311
    iget-wide v6, v0, Lu2/b;->m:J

    .line 312
    .line 313
    cmp-long v8, v14, v6

    .line 314
    .line 315
    if-lez v8, :cond_14

    .line 316
    .line 317
    const-wide/16 v6, 0x0

    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_14
    add-long v6, v6, v18

    .line 321
    .line 322
    :goto_7
    invoke-virtual {v4, v1}, LQ1/o;->G(I)V

    .line 323
    .line 324
    .line 325
    :goto_8
    invoke-virtual {v4}, LQ1/o;->a()I

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    if-lt v1, v13, :cond_1d

    .line 330
    .line 331
    invoke-virtual {v4}, LQ1/o;->j()I

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    invoke-virtual {v4}, LQ1/o;->j()I

    .line 336
    .line 337
    .line 338
    move-result v8

    .line 339
    invoke-virtual {v4}, LQ1/o;->j()I

    .line 340
    .line 341
    .line 342
    move-result v10

    .line 343
    int-to-long v14, v10

    .line 344
    add-long/2addr v14, v6

    .line 345
    invoke-virtual {v4}, LQ1/o;->j()I

    .line 346
    .line 347
    .line 348
    iget-object v10, v0, Lu2/b;->i:[Lu2/e;

    .line 349
    .line 350
    array-length v12, v10

    .line 351
    move v5, v9

    .line 352
    :goto_9
    if-ge v5, v12, :cond_16

    .line 353
    .line 354
    move/from16 v21, v9

    .line 355
    .line 356
    aget-object v9, v10, v5

    .line 357
    .line 358
    iget v11, v9, Lu2/e;->b:I

    .line 359
    .line 360
    if-eq v11, v1, :cond_17

    .line 361
    .line 362
    iget v11, v9, Lu2/e;->c:I

    .line 363
    .line 364
    if-ne v11, v1, :cond_15

    .line 365
    .line 366
    goto :goto_a

    .line 367
    :cond_15
    add-int/2addr v5, v3

    .line 368
    move/from16 v9, v21

    .line 369
    .line 370
    goto :goto_9

    .line 371
    :cond_16
    move/from16 v21, v9

    .line 372
    .line 373
    const/4 v9, 0x0

    .line 374
    :cond_17
    :goto_a
    if-nez v9, :cond_18

    .line 375
    .line 376
    :goto_b
    move/from16 v9, v21

    .line 377
    .line 378
    const/4 v5, 0x0

    .line 379
    goto :goto_8

    .line 380
    :cond_18
    and-int/lit8 v1, v8, 0x10

    .line 381
    .line 382
    if-ne v1, v13, :cond_19

    .line 383
    .line 384
    move v1, v3

    .line 385
    goto :goto_c

    .line 386
    :cond_19
    move/from16 v1, v21

    .line 387
    .line 388
    :goto_c
    iget-wide v10, v9, Lu2/e;->k:J

    .line 389
    .line 390
    cmp-long v5, v10, v16

    .line 391
    .line 392
    if-nez v5, :cond_1a

    .line 393
    .line 394
    iput-wide v14, v9, Lu2/e;->k:J

    .line 395
    .line 396
    :cond_1a
    if-eqz v1, :cond_1c

    .line 397
    .line 398
    iget v1, v9, Lu2/e;->j:I

    .line 399
    .line 400
    iget-object v5, v9, Lu2/e;->m:[I

    .line 401
    .line 402
    array-length v5, v5

    .line 403
    if-ne v1, v5, :cond_1b

    .line 404
    .line 405
    iget-object v1, v9, Lu2/e;->l:[J

    .line 406
    .line 407
    array-length v5, v1

    .line 408
    mul-int/lit8 v5, v5, 0x3

    .line 409
    .line 410
    div-int/2addr v5, v2

    .line 411
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    iput-object v1, v9, Lu2/e;->l:[J

    .line 416
    .line 417
    iget-object v1, v9, Lu2/e;->m:[I

    .line 418
    .line 419
    array-length v5, v1

    .line 420
    mul-int/lit8 v5, v5, 0x3

    .line 421
    .line 422
    div-int/2addr v5, v2

    .line 423
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    iput-object v1, v9, Lu2/e;->m:[I

    .line 428
    .line 429
    :cond_1b
    iget-object v1, v9, Lu2/e;->l:[J

    .line 430
    .line 431
    iget v5, v9, Lu2/e;->j:I

    .line 432
    .line 433
    aput-wide v14, v1, v5

    .line 434
    .line 435
    iget-object v1, v9, Lu2/e;->m:[I

    .line 436
    .line 437
    iget v8, v9, Lu2/e;->i:I

    .line 438
    .line 439
    aput v8, v1, v5

    .line 440
    .line 441
    add-int/2addr v5, v3

    .line 442
    iput v5, v9, Lu2/e;->j:I

    .line 443
    .line 444
    :cond_1c
    iget v1, v9, Lu2/e;->i:I

    .line 445
    .line 446
    add-int/2addr v1, v3

    .line 447
    iput v1, v9, Lu2/e;->i:I

    .line 448
    .line 449
    goto :goto_b

    .line 450
    :cond_1d
    move/from16 v21, v9

    .line 451
    .line 452
    iget-object v1, v0, Lu2/b;->i:[Lu2/e;

    .line 453
    .line 454
    array-length v4, v1

    .line 455
    move/from16 v5, v21

    .line 456
    .line 457
    :goto_d
    if-ge v5, v4, :cond_1e

    .line 458
    .line 459
    aget-object v6, v1, v5

    .line 460
    .line 461
    iget-object v7, v6, Lu2/e;->l:[J

    .line 462
    .line 463
    iget v8, v6, Lu2/e;->j:I

    .line 464
    .line 465
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 466
    .line 467
    .line 468
    move-result-object v7

    .line 469
    iput-object v7, v6, Lu2/e;->l:[J

    .line 470
    .line 471
    iget-object v7, v6, Lu2/e;->m:[I

    .line 472
    .line 473
    iget v8, v6, Lu2/e;->j:I

    .line 474
    .line 475
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([II)[I

    .line 476
    .line 477
    .line 478
    move-result-object v7

    .line 479
    iput-object v7, v6, Lu2/e;->m:[I

    .line 480
    .line 481
    add-int/2addr v5, v3

    .line 482
    goto :goto_d

    .line 483
    :cond_1e
    iput-boolean v3, v0, Lu2/b;->p:Z

    .line 484
    .line 485
    iget-object v1, v0, Lu2/b;->f:Ls2/o;

    .line 486
    .line 487
    new-instance v3, Ls2/q;

    .line 488
    .line 489
    iget-wide v4, v0, Lu2/b;->h:J

    .line 490
    .line 491
    invoke-direct {v3, v0, v4, v5, v2}, Ls2/q;-><init>(Ljava/lang/Object;JI)V

    .line 492
    .line 493
    .line 494
    invoke-interface {v1, v3}, Ls2/o;->s(Ls2/w;)V

    .line 495
    .line 496
    .line 497
    const/4 v1, 0x6

    .line 498
    iput v1, v0, Lu2/b;->e:I

    .line 499
    .line 500
    iget-wide v1, v0, Lu2/b;->m:J

    .line 501
    .line 502
    iput-wide v1, v0, Lu2/b;->j:J

    .line 503
    .line 504
    return v21

    .line 505
    :pswitch_2
    move/from16 v21, v9

    .line 506
    .line 507
    iget-object v2, v8, LQ1/o;->a:[B

    .line 508
    .line 509
    move-object v3, v1

    .line 510
    check-cast v3, Ls2/j;

    .line 511
    .line 512
    move/from16 v4, v21

    .line 513
    .line 514
    invoke-virtual {v3, v2, v4, v15, v4}, Ls2/j;->f([BIIZ)Z

    .line 515
    .line 516
    .line 517
    invoke-virtual {v8, v4}, LQ1/o;->G(I)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v8}, LQ1/o;->j()I

    .line 521
    .line 522
    .line 523
    move-result v2

    .line 524
    invoke-virtual {v8}, LQ1/o;->j()I

    .line 525
    .line 526
    .line 527
    move-result v3

    .line 528
    const v5, 0x31786469

    .line 529
    .line 530
    .line 531
    if-ne v2, v5, :cond_1f

    .line 532
    .line 533
    const/4 v1, 0x5

    .line 534
    iput v1, v0, Lu2/b;->e:I

    .line 535
    .line 536
    iput v3, v0, Lu2/b;->o:I

    .line 537
    .line 538
    return v4

    .line 539
    :cond_1f
    check-cast v1, Ls2/j;

    .line 540
    .line 541
    iget-wide v1, v1, Ls2/j;->d:J

    .line 542
    .line 543
    int-to-long v5, v3

    .line 544
    add-long/2addr v1, v5

    .line 545
    iput-wide v1, v0, Lu2/b;->j:J

    .line 546
    .line 547
    return v4

    .line 548
    :pswitch_3
    move v4, v9

    .line 549
    iget-wide v10, v0, Lu2/b;->m:J

    .line 550
    .line 551
    cmp-long v2, v10, v16

    .line 552
    .line 553
    if-eqz v2, :cond_20

    .line 554
    .line 555
    move-object v2, v1

    .line 556
    check-cast v2, Ls2/j;

    .line 557
    .line 558
    move v15, v13

    .line 559
    iget-wide v13, v2, Ls2/j;->d:J

    .line 560
    .line 561
    cmp-long v2, v13, v10

    .line 562
    .line 563
    if-eqz v2, :cond_21

    .line 564
    .line 565
    iput-wide v10, v0, Lu2/b;->j:J

    .line 566
    .line 567
    return v4

    .line 568
    :cond_20
    move v15, v13

    .line 569
    :cond_21
    iget-object v2, v8, LQ1/o;->a:[B

    .line 570
    .line 571
    move-object v10, v1

    .line 572
    check-cast v10, Ls2/j;

    .line 573
    .line 574
    invoke-virtual {v10, v2, v4, v7, v4}, Ls2/j;->c([BIIZ)Z

    .line 575
    .line 576
    .line 577
    check-cast v1, Ls2/j;

    .line 578
    .line 579
    iput v4, v1, Ls2/j;->f:I

    .line 580
    .line 581
    invoke-virtual {v8, v4}, LQ1/o;->G(I)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v8}, LQ1/o;->j()I

    .line 588
    .line 589
    .line 590
    move-result v2

    .line 591
    iput v2, v12, LG5/c;->a:I

    .line 592
    .line 593
    invoke-virtual {v8}, LQ1/o;->j()I

    .line 594
    .line 595
    .line 596
    move-result v2

    .line 597
    iput v2, v12, LG5/c;->b:I

    .line 598
    .line 599
    iput v4, v12, LG5/c;->c:I

    .line 600
    .line 601
    invoke-virtual {v8}, LQ1/o;->j()I

    .line 602
    .line 603
    .line 604
    move-result v2

    .line 605
    iget v8, v12, LG5/c;->a:I

    .line 606
    .line 607
    const v10, 0x46464952

    .line 608
    .line 609
    .line 610
    if-ne v8, v10, :cond_22

    .line 611
    .line 612
    invoke-virtual {v1, v7}, Ls2/j;->j(I)V

    .line 613
    .line 614
    .line 615
    return v4

    .line 616
    :cond_22
    if-ne v8, v6, :cond_23

    .line 617
    .line 618
    const v9, 0x69766f6d

    .line 619
    .line 620
    .line 621
    if-eq v2, v9, :cond_24

    .line 622
    .line 623
    :cond_23
    const/4 v4, 0x0

    .line 624
    goto :goto_e

    .line 625
    :cond_24
    iget-wide v6, v1, Ls2/j;->d:J

    .line 626
    .line 627
    iput-wide v6, v0, Lu2/b;->m:J

    .line 628
    .line 629
    iget v2, v12, LG5/c;->b:I

    .line 630
    .line 631
    int-to-long v8, v2

    .line 632
    add-long/2addr v6, v8

    .line 633
    add-long v6, v6, v18

    .line 634
    .line 635
    iput-wide v6, v0, Lu2/b;->n:J

    .line 636
    .line 637
    iget-boolean v2, v0, Lu2/b;->p:Z

    .line 638
    .line 639
    if-nez v2, :cond_26

    .line 640
    .line 641
    iget-object v2, v0, Lu2/b;->g:Lu2/c;

    .line 642
    .line 643
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 644
    .line 645
    .line 646
    iget v2, v2, Lu2/c;->b:I

    .line 647
    .line 648
    and-int/2addr v2, v15

    .line 649
    if-ne v2, v15, :cond_25

    .line 650
    .line 651
    const/4 v5, 0x4

    .line 652
    iput v5, v0, Lu2/b;->e:I

    .line 653
    .line 654
    iget-wide v1, v0, Lu2/b;->n:J

    .line 655
    .line 656
    iput-wide v1, v0, Lu2/b;->j:J

    .line 657
    .line 658
    const/16 v21, 0x0

    .line 659
    .line 660
    return v21

    .line 661
    :cond_25
    iget-object v2, v0, Lu2/b;->f:Ls2/o;

    .line 662
    .line 663
    new-instance v4, Ls2/q;

    .line 664
    .line 665
    iget-wide v5, v0, Lu2/b;->h:J

    .line 666
    .line 667
    invoke-direct {v4, v5, v6}, Ls2/q;-><init>(J)V

    .line 668
    .line 669
    .line 670
    invoke-interface {v2, v4}, Ls2/o;->s(Ls2/w;)V

    .line 671
    .line 672
    .line 673
    iput-boolean v3, v0, Lu2/b;->p:Z

    .line 674
    .line 675
    :cond_26
    iget-wide v1, v1, Ls2/j;->d:J

    .line 676
    .line 677
    const-wide/16 v3, 0xc

    .line 678
    .line 679
    add-long/2addr v1, v3

    .line 680
    iput-wide v1, v0, Lu2/b;->j:J

    .line 681
    .line 682
    const/4 v1, 0x6

    .line 683
    iput v1, v0, Lu2/b;->e:I

    .line 684
    .line 685
    const/4 v4, 0x0

    .line 686
    return v4

    .line 687
    :goto_e
    iget-wide v1, v1, Ls2/j;->d:J

    .line 688
    .line 689
    iget v3, v12, LG5/c;->b:I

    .line 690
    .line 691
    int-to-long v5, v3

    .line 692
    add-long/2addr v1, v5

    .line 693
    add-long v1, v1, v18

    .line 694
    .line 695
    iput-wide v1, v0, Lu2/b;->j:J

    .line 696
    .line 697
    return v4

    .line 698
    :pswitch_4
    move v4, v9

    .line 699
    iget v6, v0, Lu2/b;->l:I

    .line 700
    .line 701
    const/4 v5, 0x4

    .line 702
    sub-int/2addr v6, v5

    .line 703
    new-instance v5, LQ1/o;

    .line 704
    .line 705
    invoke-direct {v5, v6}, LQ1/o;-><init>(I)V

    .line 706
    .line 707
    .line 708
    iget-object v7, v5, LQ1/o;->a:[B

    .line 709
    .line 710
    check-cast v1, Ls2/j;

    .line 711
    .line 712
    invoke-virtual {v1, v7, v4, v6, v4}, Ls2/j;->f([BIIZ)Z

    .line 713
    .line 714
    .line 715
    const v1, 0x6c726468

    .line 716
    .line 717
    .line 718
    invoke-static {v1, v5}, Lu2/f;->b(ILQ1/o;)Lu2/f;

    .line 719
    .line 720
    .line 721
    move-result-object v4

    .line 722
    iget v5, v4, Lu2/f;->b:I

    .line 723
    .line 724
    if-ne v5, v1, :cond_31

    .line 725
    .line 726
    const-class v1, Lu2/c;

    .line 727
    .line 728
    invoke-virtual {v4, v1}, Lu2/f;->a(Ljava/lang/Class;)Lu2/a;

    .line 729
    .line 730
    .line 731
    move-result-object v1

    .line 732
    check-cast v1, Lu2/c;

    .line 733
    .line 734
    if-eqz v1, :cond_30

    .line 735
    .line 736
    iput-object v1, v0, Lu2/b;->g:Lu2/c;

    .line 737
    .line 738
    iget v5, v1, Lu2/c;->c:I

    .line 739
    .line 740
    int-to-long v5, v5

    .line 741
    iget v1, v1, Lu2/c;->a:I

    .line 742
    .line 743
    int-to-long v7, v1

    .line 744
    mul-long/2addr v5, v7

    .line 745
    iput-wide v5, v0, Lu2/b;->h:J

    .line 746
    .line 747
    new-instance v1, Ljava/util/ArrayList;

    .line 748
    .line 749
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 750
    .line 751
    .line 752
    iget-object v4, v4, Lu2/f;->a:Ll8/e0;

    .line 753
    .line 754
    const/4 v5, 0x0

    .line 755
    invoke-virtual {v4, v5}, Ll8/K;->l(I)Ll8/I;

    .line 756
    .line 757
    .line 758
    move-result-object v4

    .line 759
    const/4 v7, 0x0

    .line 760
    :cond_27
    :goto_f
    invoke-virtual {v4}, Ll8/I;->hasNext()Z

    .line 761
    .line 762
    .line 763
    move-result v5

    .line 764
    if-eqz v5, :cond_2f

    .line 765
    .line 766
    invoke-virtual {v4}, Ll8/I;->next()Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v5

    .line 770
    check-cast v5, Lu2/a;

    .line 771
    .line 772
    invoke-interface {v5}, Lu2/a;->getType()I

    .line 773
    .line 774
    .line 775
    move-result v6

    .line 776
    const v8, 0x6c727473

    .line 777
    .line 778
    .line 779
    if-ne v6, v8, :cond_27

    .line 780
    .line 781
    check-cast v5, Lu2/f;

    .line 782
    .line 783
    add-int/lit8 v13, v7, 0x1

    .line 784
    .line 785
    const-class v6, Lu2/d;

    .line 786
    .line 787
    invoke-virtual {v5, v6}, Lu2/f;->a(Ljava/lang/Class;)Lu2/a;

    .line 788
    .line 789
    .line 790
    move-result-object v6

    .line 791
    check-cast v6, Lu2/d;

    .line 792
    .line 793
    const-class v8, Lu2/g;

    .line 794
    .line 795
    invoke-virtual {v5, v8}, Lu2/f;->a(Ljava/lang/Class;)Lu2/a;

    .line 796
    .line 797
    .line 798
    move-result-object v8

    .line 799
    check-cast v8, Lu2/g;

    .line 800
    .line 801
    const-string v9, "AviExtractor"

    .line 802
    .line 803
    if-nez v6, :cond_29

    .line 804
    .line 805
    const-string v5, "Missing Stream Header"

    .line 806
    .line 807
    invoke-static {v9, v5}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 808
    .line 809
    .line 810
    :cond_28
    :goto_10
    const/4 v6, 0x0

    .line 811
    goto :goto_11

    .line 812
    :cond_29
    if-nez v8, :cond_2a

    .line 813
    .line 814
    const-string v5, "Missing Stream Format"

    .line 815
    .line 816
    invoke-static {v9, v5}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 817
    .line 818
    .line 819
    goto :goto_10

    .line 820
    :cond_2a
    iget v9, v6, Lu2/d;->d:I

    .line 821
    .line 822
    int-to-long v14, v9

    .line 823
    iget v9, v6, Lu2/d;->b:I

    .line 824
    .line 825
    int-to-long v9, v9

    .line 826
    const-wide/32 v11, 0xf4240

    .line 827
    .line 828
    .line 829
    mul-long v16, v9, v11

    .line 830
    .line 831
    iget v9, v6, Lu2/d;->c:I

    .line 832
    .line 833
    int-to-long v9, v9

    .line 834
    sget v11, LQ1/x;->a:I

    .line 835
    .line 836
    sget-object v20, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 837
    .line 838
    move-wide/from16 v18, v9

    .line 839
    .line 840
    invoke-static/range {v14 .. v20}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 841
    .line 842
    .line 843
    move-result-wide v9

    .line 844
    iget-object v8, v8, Lu2/g;->a:LN1/n;

    .line 845
    .line 846
    invoke-virtual {v8}, LN1/n;->a()LN1/m;

    .line 847
    .line 848
    .line 849
    move-result-object v11

    .line 850
    invoke-static {v7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 851
    .line 852
    .line 853
    move-result-object v12

    .line 854
    iput-object v12, v11, LN1/m;->a:Ljava/lang/String;

    .line 855
    .line 856
    iget v12, v6, Lu2/d;->e:I

    .line 857
    .line 858
    if-eqz v12, :cond_2b

    .line 859
    .line 860
    iput v12, v11, LN1/m;->n:I

    .line 861
    .line 862
    :cond_2b
    const-class v12, Lu2/h;

    .line 863
    .line 864
    invoke-virtual {v5, v12}, Lu2/f;->a(Ljava/lang/Class;)Lu2/a;

    .line 865
    .line 866
    .line 867
    move-result-object v5

    .line 868
    check-cast v5, Lu2/h;

    .line 869
    .line 870
    if-eqz v5, :cond_2c

    .line 871
    .line 872
    iget-object v5, v5, Lu2/h;->a:Ljava/lang/String;

    .line 873
    .line 874
    iput-object v5, v11, LN1/m;->b:Ljava/lang/String;

    .line 875
    .line 876
    :cond_2c
    iget-object v5, v8, LN1/n;->n:Ljava/lang/String;

    .line 877
    .line 878
    invoke-static {v5}, LN1/C;->h(Ljava/lang/String;)I

    .line 879
    .line 880
    .line 881
    move-result v8

    .line 882
    if-eq v8, v3, :cond_2d

    .line 883
    .line 884
    if-ne v8, v2, :cond_28

    .line 885
    .line 886
    :cond_2d
    iget-object v5, v0, Lu2/b;->f:Ls2/o;

    .line 887
    .line 888
    invoke-interface {v5, v7, v8}, Ls2/o;->m(II)Ls2/C;

    .line 889
    .line 890
    .line 891
    move-result-object v12

    .line 892
    new-instance v5, LN1/n;

    .line 893
    .line 894
    invoke-direct {v5, v11}, LN1/n;-><init>(LN1/m;)V

    .line 895
    .line 896
    .line 897
    invoke-interface {v12, v5}, Ls2/C;->c(LN1/n;)V

    .line 898
    .line 899
    .line 900
    new-instance v5, Lu2/e;

    .line 901
    .line 902
    iget v11, v6, Lu2/d;->d:I

    .line 903
    .line 904
    move-object v6, v5

    .line 905
    invoke-direct/range {v6 .. v12}, Lu2/e;-><init>(IIJILs2/C;)V

    .line 906
    .line 907
    .line 908
    iget-wide v7, v0, Lu2/b;->h:J

    .line 909
    .line 910
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 911
    .line 912
    .line 913
    move-result-wide v7

    .line 914
    iput-wide v7, v0, Lu2/b;->h:J

    .line 915
    .line 916
    :goto_11
    if-eqz v6, :cond_2e

    .line 917
    .line 918
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 919
    .line 920
    .line 921
    :cond_2e
    move v7, v13

    .line 922
    goto/16 :goto_f

    .line 923
    .line 924
    :cond_2f
    const/4 v5, 0x0

    .line 925
    new-array v2, v5, [Lu2/e;

    .line 926
    .line 927
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v1

    .line 931
    check-cast v1, [Lu2/e;

    .line 932
    .line 933
    iput-object v1, v0, Lu2/b;->i:[Lu2/e;

    .line 934
    .line 935
    iget-object v1, v0, Lu2/b;->f:Ls2/o;

    .line 936
    .line 937
    invoke-interface {v1}, Ls2/o;->l()V

    .line 938
    .line 939
    .line 940
    move/from16 v1, p2

    .line 941
    .line 942
    iput v1, v0, Lu2/b;->e:I

    .line 943
    .line 944
    return v5

    .line 945
    :cond_30
    const-string v1, "AviHeader not found"

    .line 946
    .line 947
    const/4 v2, 0x0

    .line 948
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 949
    .line 950
    .line 951
    move-result-object v1

    .line 952
    throw v1

    .line 953
    :cond_31
    const/4 v2, 0x0

    .line 954
    new-instance v1, Ljava/lang/StringBuilder;

    .line 955
    .line 956
    const-string v3, "Unexpected header list type "

    .line 957
    .line 958
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 959
    .line 960
    .line 961
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 962
    .line 963
    .line 964
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 965
    .line 966
    .line 967
    move-result-object v1

    .line 968
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 969
    .line 970
    .line 971
    move-result-object v1

    .line 972
    throw v1

    .line 973
    :pswitch_5
    iget-object v3, v8, LQ1/o;->a:[B

    .line 974
    .line 975
    check-cast v1, Ls2/j;

    .line 976
    .line 977
    const/4 v4, 0x0

    .line 978
    invoke-virtual {v1, v3, v4, v7, v4}, Ls2/j;->f([BIIZ)Z

    .line 979
    .line 980
    .line 981
    invoke-virtual {v8, v4}, LQ1/o;->G(I)V

    .line 982
    .line 983
    .line 984
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 985
    .line 986
    .line 987
    invoke-virtual {v8}, LQ1/o;->j()I

    .line 988
    .line 989
    .line 990
    move-result v1

    .line 991
    iput v1, v12, LG5/c;->a:I

    .line 992
    .line 993
    invoke-virtual {v8}, LQ1/o;->j()I

    .line 994
    .line 995
    .line 996
    move-result v1

    .line 997
    iput v1, v12, LG5/c;->b:I

    .line 998
    .line 999
    iput v4, v12, LG5/c;->c:I

    .line 1000
    .line 1001
    iget v1, v12, LG5/c;->a:I

    .line 1002
    .line 1003
    if-ne v1, v6, :cond_33

    .line 1004
    .line 1005
    invoke-virtual {v8}, LQ1/o;->j()I

    .line 1006
    .line 1007
    .line 1008
    move-result v1

    .line 1009
    iput v1, v12, LG5/c;->c:I

    .line 1010
    .line 1011
    const v3, 0x6c726468

    .line 1012
    .line 1013
    .line 1014
    if-ne v1, v3, :cond_32

    .line 1015
    .line 1016
    iget v1, v12, LG5/c;->b:I

    .line 1017
    .line 1018
    iput v1, v0, Lu2/b;->l:I

    .line 1019
    .line 1020
    iput v2, v0, Lu2/b;->e:I

    .line 1021
    .line 1022
    return v4

    .line 1023
    :cond_32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1024
    .line 1025
    const-string v2, "hdrl expected, found: "

    .line 1026
    .line 1027
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1028
    .line 1029
    .line 1030
    iget v2, v12, LG5/c;->c:I

    .line 1031
    .line 1032
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v1

    .line 1039
    const/4 v2, 0x0

    .line 1040
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v1

    .line 1044
    throw v1

    .line 1045
    :cond_33
    const/4 v2, 0x0

    .line 1046
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1047
    .line 1048
    const-string v3, "LIST expected, found: "

    .line 1049
    .line 1050
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1051
    .line 1052
    .line 1053
    iget v3, v12, LG5/c;->a:I

    .line 1054
    .line 1055
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v1

    .line 1062
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v1

    .line 1066
    throw v1

    .line 1067
    :pswitch_6
    move-object v2, v5

    .line 1068
    invoke-virtual/range {p0 .. p1}, Lu2/b;->i(Ls2/n;)Z

    .line 1069
    .line 1070
    .line 1071
    move-result v4

    .line 1072
    if-eqz v4, :cond_34

    .line 1073
    .line 1074
    check-cast v1, Ls2/j;

    .line 1075
    .line 1076
    invoke-virtual {v1, v7}, Ls2/j;->j(I)V

    .line 1077
    .line 1078
    .line 1079
    iput v3, v0, Lu2/b;->e:I

    .line 1080
    .line 1081
    const/16 v21, 0x0

    .line 1082
    .line 1083
    return v21

    .line 1084
    :cond_34
    const-string v1, "AVI Header List not found"

    .line 1085
    .line 1086
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v1

    .line 1090
    throw v1

    .line 1091
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
