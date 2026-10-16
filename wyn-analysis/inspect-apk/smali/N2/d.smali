.class public final LN2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls2/m;


# instance fields
.field public a:Ls2/o;

.field public b:LN2/i;

.field public c:Z


# virtual methods
.method public final a(JJ)V
    .locals 6

    .line 1
    iget-object v0, p0, LN2/d;->b:LN2/i;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, LN2/i;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LN2/e;

    .line 8
    .line 9
    iget-object v2, v1, LN2/e;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, LN2/f;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    iput v3, v2, LN2/f;->a:I

    .line 15
    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    iput-wide v4, v2, LN2/f;->b:J

    .line 19
    .line 20
    iput v3, v2, LN2/f;->c:I

    .line 21
    .line 22
    iput v3, v2, LN2/f;->d:I

    .line 23
    .line 24
    iput v3, v2, LN2/f;->e:I

    .line 25
    .line 26
    iget-object v2, v1, LN2/e;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, LQ1/o;

    .line 29
    .line 30
    invoke-virtual {v2, v3}, LQ1/o;->D(I)V

    .line 31
    .line 32
    .line 33
    const/4 v2, -0x1

    .line 34
    iput v2, v1, LN2/e;->b:I

    .line 35
    .line 36
    iput-boolean v3, v1, LN2/e;->d:Z

    .line 37
    .line 38
    cmp-long p1, p1, v4

    .line 39
    .line 40
    if-nez p1, :cond_0

    .line 41
    .line 42
    iget-boolean p1, v0, LN2/i;->h:Z

    .line 43
    .line 44
    xor-int/lit8 p1, p1, 0x1

    .line 45
    .line 46
    invoke-virtual {v0, p1}, LN2/i;->f(Z)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    iget p1, v0, LN2/i;->e:I

    .line 51
    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    iget p1, v0, LN2/i;->f:I

    .line 55
    .line 56
    int-to-long p1, p1

    .line 57
    mul-long/2addr p1, p3

    .line 58
    const-wide/32 p3, 0xf4240

    .line 59
    .line 60
    .line 61
    div-long/2addr p1, p3

    .line 62
    iput-wide p1, v0, LN2/i;->b:J

    .line 63
    .line 64
    iget-object p3, v0, LN2/i;->m:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p3, LN2/g;

    .line 67
    .line 68
    sget p4, LQ1/x;->a:I

    .line 69
    .line 70
    invoke-interface {p3, p1, p2}, LN2/g;->b(J)V

    .line 71
    .line 72
    .line 73
    const/4 p1, 0x2

    .line 74
    iput p1, v0, LN2/i;->e:I

    .line 75
    .line 76
    :cond_1
    return-void
.end method

.method public final b(Ls2/j;)Z
    .locals 8

    .line 1
    new-instance v0, LN2/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LN2/f;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, p1, v1}, LN2/f;->b(Ls2/j;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    iget v2, v0, LN2/f;->a:I

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    and-int/2addr v2, v4

    .line 19
    if-eq v2, v4, :cond_0

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_0
    iget v0, v0, LN2/f;->e:I

    .line 23
    .line 24
    const/16 v2, 0x8

    .line 25
    .line 26
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    new-instance v2, LQ1/o;

    .line 31
    .line 32
    invoke-direct {v2, v0}, LQ1/o;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iget-object v4, v2, LQ1/o;->a:[B

    .line 36
    .line 37
    invoke-virtual {p1, v4, v3, v0, v3}, Ls2/j;->c([BIIZ)Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v3}, LQ1/o;->G(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, LQ1/o;->a()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    const/4 v0, 0x5

    .line 48
    if-lt p1, v0, :cond_1

    .line 49
    .line 50
    invoke-virtual {v2}, LQ1/o;->u()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    const/16 v0, 0x7f

    .line 55
    .line 56
    if-ne p1, v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {v2}, LQ1/o;->w()J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    const-wide/32 v6, 0x464c4143

    .line 63
    .line 64
    .line 65
    cmp-long p1, v4, v6

    .line 66
    .line 67
    if-nez p1, :cond_1

    .line 68
    .line 69
    new-instance p1, LN2/c;

    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    invoke-direct {p1, v0}, LN2/i;-><init>(I)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, LN2/d;->b:LN2/i;

    .line 76
    .line 77
    return v1

    .line 78
    :cond_1
    invoke-virtual {v2, v3}, LQ1/o;->G(I)V

    .line 79
    .line 80
    .line 81
    :try_start_0
    invoke-static {v1, v2, v1}, Ls2/a;->z(ILQ1/o;Z)Z

    .line 82
    .line 83
    .line 84
    move-result p1
    :try_end_0
    .catch LN1/D; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    goto :goto_0

    .line 86
    :catch_0
    move p1, v3

    .line 87
    :goto_0
    if-eqz p1, :cond_2

    .line 88
    .line 89
    new-instance p1, LN2/k;

    .line 90
    .line 91
    const/4 v0, 0x0

    .line 92
    invoke-direct {p1, v0}, LN2/i;-><init>(I)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, LN2/d;->b:LN2/i;

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    invoke-virtual {v2, v3}, LQ1/o;->G(I)V

    .line 99
    .line 100
    .line 101
    sget-object p1, LN2/h;->p:[B

    .line 102
    .line 103
    invoke-static {v2, p1}, LN2/h;->g(LQ1/o;[B)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-eqz p1, :cond_3

    .line 108
    .line 109
    new-instance p1, LN2/h;

    .line 110
    .line 111
    const/4 v0, 0x0

    .line 112
    invoke-direct {p1, v0}, LN2/i;-><init>(I)V

    .line 113
    .line 114
    .line 115
    iput-object p1, p0, LN2/d;->b:LN2/i;

    .line 116
    .line 117
    :goto_1
    return v1

    .line 118
    :cond_3
    :goto_2
    return v3
.end method

.method public final g(Ls2/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN2/d;->a:Ls2/o;

    .line 2
    .line 3
    return-void
.end method

.method public final h()Ls2/m;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final i(Ls2/n;)Z
    .locals 0

    .line 1
    :try_start_0
    check-cast p1, Ls2/j;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LN2/d;->b(Ls2/j;)Z

    .line 4
    .line 5
    .line 6
    move-result p1
    :try_end_0
    .catch LN1/D; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return p1

    .line 8
    :catch_0
    const/4 p1, 0x0

    .line 9
    return p1
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
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LN2/d;->a:Ls2/o;

    .line 4
    .line 5
    invoke-static {v1}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, LN2/d;->b:LN2/i;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, Ls2/j;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, LN2/d;->b(Ls2/j;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iput v2, v1, Ls2/j;->f:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v1, "Failed to determine bitstream type"

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-static {v2, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    throw v1

    .line 34
    :cond_1
    :goto_0
    iget-boolean v1, v0, LN2/d;->c:Z

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    iget-object v1, v0, LN2/d;->a:Ls2/o;

    .line 40
    .line 41
    invoke-interface {v1, v2, v3}, Ls2/o;->m(II)Ls2/C;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v4, v0, LN2/d;->a:Ls2/o;

    .line 46
    .line 47
    invoke-interface {v4}, Ls2/o;->l()V

    .line 48
    .line 49
    .line 50
    iget-object v4, v0, LN2/d;->b:LN2/i;

    .line 51
    .line 52
    iget-object v5, v0, LN2/d;->a:Ls2/o;

    .line 53
    .line 54
    iput-object v5, v4, LN2/i;->l:Ljava/lang/Object;

    .line 55
    .line 56
    iput-object v1, v4, LN2/i;->k:Ljava/lang/Object;

    .line 57
    .line 58
    invoke-virtual {v4, v3}, LN2/i;->f(Z)V

    .line 59
    .line 60
    .line 61
    iput-boolean v3, v0, LN2/d;->c:Z

    .line 62
    .line 63
    :cond_2
    iget-object v7, v0, LN2/d;->b:LN2/i;

    .line 64
    .line 65
    iget-object v1, v7, LN2/i;->k:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, Ls2/C;

    .line 68
    .line 69
    invoke-static {v1}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    sget v1, LQ1/x;->a:I

    .line 73
    .line 74
    iget v1, v7, LN2/i;->e:I

    .line 75
    .line 76
    iget-object v4, v7, LN2/i;->j:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v4, LN2/e;

    .line 79
    .line 80
    const-wide/16 v5, -0x1

    .line 81
    .line 82
    const/4 v8, -0x1

    .line 83
    const/4 v9, 0x3

    .line 84
    const/4 v10, 0x2

    .line 85
    if-eqz v1, :cond_c

    .line 86
    .line 87
    if-eq v1, v3, :cond_b

    .line 88
    .line 89
    if-eq v1, v10, :cond_4

    .line 90
    .line 91
    if-ne v1, v9, :cond_3

    .line 92
    .line 93
    return v8

    .line 94
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 95
    .line 96
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 97
    .line 98
    .line 99
    throw v1

    .line 100
    :cond_4
    iget-object v1, v7, LN2/i;->m:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, LN2/g;

    .line 103
    .line 104
    move-object/from16 v10, p1

    .line 105
    .line 106
    check-cast v10, Ls2/j;

    .line 107
    .line 108
    invoke-interface {v1, v10}, LN2/g;->f(Ls2/j;)J

    .line 109
    .line 110
    .line 111
    move-result-wide v11

    .line 112
    const-wide/16 v13, 0x0

    .line 113
    .line 114
    cmp-long v1, v11, v13

    .line 115
    .line 116
    if-ltz v1, :cond_5

    .line 117
    .line 118
    move-object/from16 v1, p2

    .line 119
    .line 120
    iput-wide v11, v1, LJ5/n;->a:J

    .line 121
    .line 122
    return v3

    .line 123
    :cond_5
    cmp-long v1, v11, v5

    .line 124
    .line 125
    if-gez v1, :cond_6

    .line 126
    .line 127
    const-wide/16 v15, 0x2

    .line 128
    .line 129
    add-long/2addr v11, v15

    .line 130
    neg-long v11, v11

    .line 131
    invoke-virtual {v7, v11, v12}, LN2/i;->a(J)V

    .line 132
    .line 133
    .line 134
    :cond_6
    iget-boolean v1, v7, LN2/i;->h:Z

    .line 135
    .line 136
    if-nez v1, :cond_7

    .line 137
    .line 138
    iget-object v1, v7, LN2/i;->m:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v1, LN2/g;

    .line 141
    .line 142
    invoke-interface {v1}, LN2/g;->a()Ls2/w;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-static {v1}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    iget-object v11, v7, LN2/i;->l:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v11, Ls2/o;

    .line 152
    .line 153
    invoke-interface {v11, v1}, Ls2/o;->s(Ls2/w;)V

    .line 154
    .line 155
    .line 156
    iput-boolean v3, v7, LN2/i;->h:Z

    .line 157
    .line 158
    :cond_7
    iget-wide v11, v7, LN2/i;->g:J

    .line 159
    .line 160
    cmp-long v1, v11, v13

    .line 161
    .line 162
    if-gtz v1, :cond_9

    .line 163
    .line 164
    invoke-virtual {v4, v10}, LN2/e;->d(Ls2/j;)Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-eqz v1, :cond_8

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_8
    iput v9, v7, LN2/i;->e:I

    .line 172
    .line 173
    return v8

    .line 174
    :cond_9
    :goto_1
    iput-wide v13, v7, LN2/i;->g:J

    .line 175
    .line 176
    iget-object v1, v4, LN2/e;->f:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v1, LQ1/o;

    .line 179
    .line 180
    invoke-virtual {v7, v1}, LN2/i;->b(LQ1/o;)J

    .line 181
    .line 182
    .line 183
    move-result-wide v3

    .line 184
    cmp-long v8, v3, v13

    .line 185
    .line 186
    if-ltz v8, :cond_a

    .line 187
    .line 188
    iget-wide v8, v7, LN2/i;->d:J

    .line 189
    .line 190
    add-long v10, v8, v3

    .line 191
    .line 192
    iget-wide v12, v7, LN2/i;->b:J

    .line 193
    .line 194
    cmp-long v10, v10, v12

    .line 195
    .line 196
    if-ltz v10, :cond_a

    .line 197
    .line 198
    const-wide/32 v10, 0xf4240

    .line 199
    .line 200
    .line 201
    mul-long/2addr v8, v10

    .line 202
    iget v10, v7, LN2/i;->f:I

    .line 203
    .line 204
    int-to-long v10, v10

    .line 205
    div-long v13, v8, v10

    .line 206
    .line 207
    iget-object v8, v7, LN2/i;->k:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v8, Ls2/C;

    .line 210
    .line 211
    iget v9, v1, LQ1/o;->c:I

    .line 212
    .line 213
    invoke-interface {v8, v9, v1}, Ls2/C;->e(ILQ1/o;)V

    .line 214
    .line 215
    .line 216
    iget-object v8, v7, LN2/i;->k:Ljava/lang/Object;

    .line 217
    .line 218
    move-object v12, v8

    .line 219
    check-cast v12, Ls2/C;

    .line 220
    .line 221
    iget v1, v1, LQ1/o;->c:I

    .line 222
    .line 223
    const/16 v17, 0x0

    .line 224
    .line 225
    const/16 v18, 0x0

    .line 226
    .line 227
    const/4 v15, 0x1

    .line 228
    move/from16 v16, v1

    .line 229
    .line 230
    invoke-interface/range {v12 .. v18}, Ls2/C;->a(JIIILs2/B;)V

    .line 231
    .line 232
    .line 233
    iput-wide v5, v7, LN2/i;->b:J

    .line 234
    .line 235
    :cond_a
    iget-wide v5, v7, LN2/i;->d:J

    .line 236
    .line 237
    add-long/2addr v5, v3

    .line 238
    iput-wide v5, v7, LN2/i;->d:J

    .line 239
    .line 240
    return v2

    .line 241
    :cond_b
    iget-wide v3, v7, LN2/i;->c:J

    .line 242
    .line 243
    long-to-int v1, v3

    .line 244
    move-object/from16 v3, p1

    .line 245
    .line 246
    check-cast v3, Ls2/j;

    .line 247
    .line 248
    invoke-virtual {v3, v1}, Ls2/j;->j(I)V

    .line 249
    .line 250
    .line 251
    iput v10, v7, LN2/i;->e:I

    .line 252
    .line 253
    return v2

    .line 254
    :cond_c
    :goto_2
    move-object/from16 v1, p1

    .line 255
    .line 256
    check-cast v1, Ls2/j;

    .line 257
    .line 258
    invoke-virtual {v4, v1}, LN2/e;->d(Ls2/j;)Z

    .line 259
    .line 260
    .line 261
    move-result v11

    .line 262
    if-nez v11, :cond_d

    .line 263
    .line 264
    iput v9, v7, LN2/i;->e:I

    .line 265
    .line 266
    return v8

    .line 267
    :cond_d
    iget-wide v11, v1, Ls2/j;->d:J

    .line 268
    .line 269
    iget-wide v13, v7, LN2/i;->c:J

    .line 270
    .line 271
    sub-long/2addr v11, v13

    .line 272
    iput-wide v11, v7, LN2/i;->g:J

    .line 273
    .line 274
    iget-object v1, v7, LN2/i;->n:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v1, LS3/c;

    .line 277
    .line 278
    iget-object v11, v4, LN2/e;->f:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v11, LQ1/o;

    .line 281
    .line 282
    invoke-virtual {v7, v11, v13, v14, v1}, LN2/i;->d(LQ1/o;JLS3/c;)Z

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    if-eqz v1, :cond_e

    .line 287
    .line 288
    move-object/from16 v1, p1

    .line 289
    .line 290
    check-cast v1, Ls2/j;

    .line 291
    .line 292
    iget-wide v11, v1, Ls2/j;->d:J

    .line 293
    .line 294
    iput-wide v11, v7, LN2/i;->c:J

    .line 295
    .line 296
    goto :goto_2

    .line 297
    :cond_e
    iget-object v1, v7, LN2/i;->n:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v1, LS3/c;

    .line 300
    .line 301
    iget-object v1, v1, LS3/c;->b:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v1, LN1/n;

    .line 304
    .line 305
    iget v8, v1, LN1/n;->D:I

    .line 306
    .line 307
    iput v8, v7, LN2/i;->f:I

    .line 308
    .line 309
    iget-boolean v8, v7, LN2/i;->i:Z

    .line 310
    .line 311
    if-nez v8, :cond_f

    .line 312
    .line 313
    iget-object v8, v7, LN2/i;->k:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v8, Ls2/C;

    .line 316
    .line 317
    invoke-interface {v8, v1}, Ls2/C;->c(LN1/n;)V

    .line 318
    .line 319
    .line 320
    iput-boolean v3, v7, LN2/i;->i:Z

    .line 321
    .line 322
    :cond_f
    iget-object v1, v7, LN2/i;->n:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v1, LS3/c;

    .line 325
    .line 326
    iget-object v1, v1, LS3/c;->c:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v1, LA7/B1;

    .line 329
    .line 330
    if-eqz v1, :cond_10

    .line 331
    .line 332
    iput-object v1, v7, LN2/i;->m:Ljava/lang/Object;

    .line 333
    .line 334
    :goto_3
    move v3, v10

    .line 335
    move-object v4, v11

    .line 336
    goto :goto_5

    .line 337
    :cond_10
    move-object/from16 v1, p1

    .line 338
    .line 339
    check-cast v1, Ls2/j;

    .line 340
    .line 341
    iget-wide v8, v1, Ls2/j;->c:J

    .line 342
    .line 343
    cmp-long v1, v8, v5

    .line 344
    .line 345
    if-nez v1, :cond_11

    .line 346
    .line 347
    new-instance v1, LVa/ka;

    .line 348
    .line 349
    const/16 v3, 0x17

    .line 350
    .line 351
    invoke-direct {v1, v3}, LVa/ka;-><init>(I)V

    .line 352
    .line 353
    .line 354
    iput-object v1, v7, LN2/i;->m:Ljava/lang/Object;

    .line 355
    .line 356
    goto :goto_3

    .line 357
    :cond_11
    iget-object v1, v4, LN2/e;->e:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v1, LN2/f;

    .line 360
    .line 361
    iget v4, v1, LN2/f;->a:I

    .line 362
    .line 363
    and-int/lit8 v4, v4, 0x4

    .line 364
    .line 365
    if-eqz v4, :cond_12

    .line 366
    .line 367
    move/from16 v16, v3

    .line 368
    .line 369
    goto :goto_4

    .line 370
    :cond_12
    move/from16 v16, v2

    .line 371
    .line 372
    :goto_4
    new-instance v6, LN2/b;

    .line 373
    .line 374
    move v3, v10

    .line 375
    move-object v4, v11

    .line 376
    move-wide v10, v8

    .line 377
    iget-wide v8, v7, LN2/i;->c:J

    .line 378
    .line 379
    iget v5, v1, LN2/f;->d:I

    .line 380
    .line 381
    iget v12, v1, LN2/f;->e:I

    .line 382
    .line 383
    add-int/2addr v5, v12

    .line 384
    int-to-long v12, v5

    .line 385
    iget-wide v14, v1, LN2/f;->b:J

    .line 386
    .line 387
    invoke-direct/range {v6 .. v16}, LN2/b;-><init>(LN2/i;JJJJZ)V

    .line 388
    .line 389
    .line 390
    iput-object v6, v7, LN2/i;->m:Ljava/lang/Object;

    .line 391
    .line 392
    :goto_5
    iput v3, v7, LN2/i;->e:I

    .line 393
    .line 394
    iget-object v1, v4, LQ1/o;->a:[B

    .line 395
    .line 396
    array-length v3, v1

    .line 397
    const v5, 0xfe01

    .line 398
    .line 399
    .line 400
    if-ne v3, v5, :cond_13

    .line 401
    .line 402
    return v2

    .line 403
    :cond_13
    iget v3, v4, LQ1/o;->c:I

    .line 404
    .line 405
    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    .line 406
    .line 407
    .line 408
    move-result v3

    .line 409
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    iget v3, v4, LQ1/o;->c:I

    .line 414
    .line 415
    invoke-virtual {v4, v3, v1}, LQ1/o;->E(I[B)V

    .line 416
    .line 417
    .line 418
    return v2
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
