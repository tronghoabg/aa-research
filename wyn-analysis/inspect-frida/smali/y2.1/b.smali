.class public final Ly2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls2/m;


# instance fields
.field public final a:LQ1/o;

.field public final b:LQ1/o;

.field public final c:LQ1/o;

.field public final d:LQ1/o;

.field public final e:Ly2/c;

.field public f:Ls2/o;

.field public g:I

.field public h:Z

.field public i:J

.field public j:I

.field public k:I

.field public l:I

.field public m:J

.field public n:Z

.field public o:Ly2/a;

.field public p:Ly2/d;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LQ1/o;

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, v1}, LQ1/o;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ly2/b;->a:LQ1/o;

    .line 11
    .line 12
    new-instance v0, LQ1/o;

    .line 13
    .line 14
    const/16 v1, 0x9

    .line 15
    .line 16
    invoke-direct {v0, v1}, LQ1/o;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Ly2/b;->b:LQ1/o;

    .line 20
    .line 21
    new-instance v0, LQ1/o;

    .line 22
    .line 23
    const/16 v1, 0xb

    .line 24
    .line 25
    invoke-direct {v0, v1}, LQ1/o;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Ly2/b;->c:LQ1/o;

    .line 29
    .line 30
    new-instance v0, LQ1/o;

    .line 31
    .line 32
    invoke-direct {v0}, LQ1/o;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Ly2/b;->d:LQ1/o;

    .line 36
    .line 37
    new-instance v0, Ly2/c;

    .line 38
    .line 39
    new-instance v1, Ls2/l;

    .line 40
    .line 41
    invoke-direct {v1}, Ls2/l;-><init>()V

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
    iput-wide v1, v0, Ly2/c;->b:J

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    new-array v2, v1, [J

    .line 56
    .line 57
    iput-object v2, v0, Ly2/c;->c:[J

    .line 58
    .line 59
    new-array v1, v1, [J

    .line 60
    .line 61
    iput-object v1, v0, Ly2/c;->d:[J

    .line 62
    .line 63
    iput-object v0, p0, Ly2/b;->e:Ly2/c;

    .line 64
    .line 65
    const/4 v0, 0x1

    .line 66
    iput v0, p0, Ly2/b;->g:I

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
    iput p1, p0, Ly2/b;->g:I

    .line 10
    .line 11
    iput-boolean p2, p0, Ly2/b;->h:Z

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x3

    .line 15
    iput p1, p0, Ly2/b;->g:I

    .line 16
    .line 17
    :goto_0
    iput p2, p0, Ly2/b;->j:I

    .line 18
    .line 19
    return-void
.end method

.method public final b(Ls2/j;)LQ1/o;
    .locals 5

    .line 1
    iget v0, p0, Ly2/b;->l:I

    .line 2
    .line 3
    iget-object v1, p0, Ly2/b;->d:LQ1/o;

    .line 4
    .line 5
    iget-object v2, v1, LQ1/o;->a:[B

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
    invoke-virtual {v1, v4, v0}, LQ1/o;->E(I[B)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v1, v4}, LQ1/o;->G(I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget v0, p0, Ly2/b;->l:I

    .line 28
    .line 29
    invoke-virtual {v1, v0}, LQ1/o;->F(I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, v1, LQ1/o;->a:[B

    .line 33
    .line 34
    iget v2, p0, Ly2/b;->l:I

    .line 35
    .line 36
    invoke-virtual {p1, v0, v4, v2, v4}, Ls2/j;->f([BIIZ)Z

    .line 37
    .line 38
    .line 39
    return-object v1
.end method

.method public final g(Ls2/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly2/b;->f:Ls2/o;

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
    .locals 4

    .line 1
    iget-object v0, p0, Ly2/b;->a:LQ1/o;

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
    const/4 v3, 0x3

    .line 9
    invoke-virtual {p1, v1, v2, v3, v2}, Ls2/j;->c([BIIZ)Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v2}, LQ1/o;->G(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, LQ1/o;->x()I

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
    iget-object v1, v0, LQ1/o;->a:[B

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    invoke-virtual {p1, v1, v2, v3, v2}, Ls2/j;->c([BIIZ)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, LQ1/o;->G(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, LQ1/o;->A()I

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
    iget-object v1, v0, LQ1/o;->a:[B

    .line 44
    .line 45
    const/4 v3, 0x4

    .line 46
    invoke-virtual {p1, v1, v2, v3, v2}, Ls2/j;->c([BIIZ)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2}, LQ1/o;->G(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, LQ1/o;->h()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    iput v2, p1, Ls2/j;->f:I

    .line 57
    .line 58
    invoke-virtual {p1, v1, v2}, Ls2/j;->b(IZ)Z

    .line 59
    .line 60
    .line 61
    iget-object v1, v0, LQ1/o;->a:[B

    .line 62
    .line 63
    invoke-virtual {p1, v1, v2, v3, v2}, Ls2/j;->c([BIIZ)Z

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v2}, LQ1/o;->G(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, LQ1/o;->h()I

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
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ly2/b;->f:Ls2/o;

    .line 4
    .line 5
    invoke-static {v1}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    :goto_0
    iget v1, v0, Ly2/b;->g:I

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
    iget-boolean v1, v0, Ly2/b;->h:Z

    .line 27
    .line 28
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iget-object v12, v0, Ly2/b;->e:Ly2/c;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-wide v13, v0, Ly2/b;->i:J

    .line 38
    .line 39
    iget-wide v10, v0, Ly2/b;->m:J

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
    iget-wide v10, v12, Ly2/c;->b:J

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
    iget-wide v13, v0, Ly2/b;->m:J

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :goto_2
    iget v1, v0, Ly2/b;->k:I

    .line 58
    .line 59
    if-ne v1, v6, :cond_e

    .line 60
    .line 61
    iget-object v6, v0, Ly2/b;->o:Ly2/a;

    .line 62
    .line 63
    if-eqz v6, :cond_e

    .line 64
    .line 65
    iget-boolean v1, v0, Ly2/b;->n:Z

    .line 66
    .line 67
    if-nez v1, :cond_3

    .line 68
    .line 69
    iget-object v1, v0, Ly2/b;->f:Ls2/o;

    .line 70
    .line 71
    new-instance v5, Ls2/q;

    .line 72
    .line 73
    invoke-direct {v5, v8, v9}, Ls2/q;-><init>(J)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v1, v5}, Ls2/o;->s(Ls2/w;)V

    .line 77
    .line 78
    .line 79
    iput-boolean v4, v0, Ly2/b;->n:Z

    .line 80
    .line 81
    :cond_3
    iget-object v1, v0, Ly2/b;->o:Ly2/a;

    .line 82
    .line 83
    move-object/from16 v5, p1

    .line 84
    .line 85
    check-cast v5, Ls2/j;

    .line 86
    .line 87
    invoke-virtual {v0, v5}, Ly2/b;->b(Ls2/j;)LQ1/o;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    iget-boolean v6, v1, Ly2/a;->b:Z

    .line 92
    .line 93
    const/4 v10, 0x1

    .line 94
    if-nez v6, :cond_9

    .line 95
    .line 96
    invoke-virtual {v5}, LQ1/o;->u()I

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
    iput v11, v1, Ly2/a;->d:I

    .line 105
    .line 106
    iget-object v13, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v13, Ls2/C;

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
    sget-object v11, Ly2/a;->e:[I

    .line 117
    .line 118
    aget v6, v11, v6

    .line 119
    .line 120
    new-instance v11, LN1/m;

    .line 121
    .line 122
    invoke-direct {v11}, LN1/m;-><init>()V

    .line 123
    .line 124
    .line 125
    const-string v14, "audio/mpeg"

    .line 126
    .line 127
    invoke-static {v14}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v14

    .line 131
    iput-object v14, v11, LN1/m;->m:Ljava/lang/String;

    .line 132
    .line 133
    iput v10, v11, LN1/m;->B:I

    .line 134
    .line 135
    iput v6, v11, LN1/m;->C:I

    .line 136
    .line 137
    invoke-static {v11, v13}, LVa/M6;->y(LN1/m;Ls2/C;)V

    .line 138
    .line 139
    .line 140
    iput-boolean v10, v1, Ly2/a;->c:Z

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_4
    const/4 v6, 0x7

    .line 144
    if-eq v11, v6, :cond_7

    .line 145
    .line 146
    const/16 v14, 0x8

    .line 147
    .line 148
    if-ne v11, v14, :cond_5

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_5
    const/16 v6, 0xa

    .line 152
    .line 153
    if-ne v11, v6, :cond_6

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_6
    new-instance v2, Lj2/d;

    .line 157
    .line 158
    new-instance v3, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    const-string v4, "Audio format not supported: "

    .line 161
    .line 162
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    iget v1, v1, Ly2/a;->d:I

    .line 166
    .line 167
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    const/4 v3, 0x2

    .line 175
    invoke-direct {v2, v1, v3}, Lj2/d;-><init>(Ljava/lang/String;I)V

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
    new-instance v11, LN1/m;

    .line 187
    .line 188
    invoke-direct {v11}, LN1/m;-><init>()V

    .line 189
    .line 190
    .line 191
    invoke-static {v6}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    iput-object v6, v11, LN1/m;->m:Ljava/lang/String;

    .line 196
    .line 197
    iput v10, v11, LN1/m;->B:I

    .line 198
    .line 199
    const/16 v6, 0x1f40

    .line 200
    .line 201
    iput v6, v11, LN1/m;->C:I

    .line 202
    .line 203
    invoke-static {v11, v13}, LVa/M6;->y(LN1/m;Ls2/C;)V

    .line 204
    .line 205
    .line 206
    iput-boolean v10, v1, Ly2/a;->c:Z

    .line 207
    .line 208
    :goto_5
    iput-boolean v10, v1, Ly2/a;->b:Z

    .line 209
    .line 210
    goto :goto_6

    .line 211
    :cond_9
    invoke-virtual {v5, v10}, LQ1/o;->H(I)V

    .line 212
    .line 213
    .line 214
    :goto_6
    iget v6, v1, Ly2/a;->d:I

    .line 215
    .line 216
    const/4 v10, 0x2

    .line 217
    iget-object v11, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v11, Ls2/C;

    .line 220
    .line 221
    const/4 v13, 0x1

    .line 222
    if-ne v6, v10, :cond_a

    .line 223
    .line 224
    invoke-virtual {v5}, LQ1/o;->a()I

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    invoke-interface {v11, v6, v5}, Ls2/C;->e(ILQ1/o;)V

    .line 229
    .line 230
    .line 231
    iget-object v1, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 232
    .line 233
    move-object/from16 v17, v1

    .line 234
    .line 235
    check-cast v17, Ls2/C;

    .line 236
    .line 237
    const/16 v20, 0x1

    .line 238
    .line 239
    const/16 v22, 0x0

    .line 240
    .line 241
    const/16 v23, 0x0

    .line 242
    .line 243
    move/from16 v21, v6

    .line 244
    .line 245
    invoke-interface/range {v17 .. v23}, Ls2/C;->a(JIIILs2/B;)V

    .line 246
    .line 247
    .line 248
    const/16 p2, 0x0

    .line 249
    .line 250
    goto :goto_7

    .line 251
    :cond_a
    invoke-virtual {v5}, LQ1/o;->u()I

    .line 252
    .line 253
    .line 254
    move-result v6

    .line 255
    const/4 v10, 0x0

    .line 256
    if-nez v6, :cond_c

    .line 257
    .line 258
    iget-boolean v14, v1, Ly2/a;->c:Z

    .line 259
    .line 260
    if-nez v14, :cond_c

    .line 261
    .line 262
    invoke-virtual {v5}, LQ1/o;->a()I

    .line 263
    .line 264
    .line 265
    move-result v6

    .line 266
    new-array v14, v6, [B

    .line 267
    .line 268
    invoke-virtual {v5, v10, v6, v14}, LQ1/o;->f(II[B)V

    .line 269
    .line 270
    .line 271
    new-instance v5, LJ5/y;

    .line 272
    .line 273
    const/4 v15, 0x1

    .line 274
    const/16 p2, 0x0

    .line 275
    .line 276
    const/4 v3, 0x0

    .line 277
    invoke-direct {v5, v14, v6, v15, v3}, LJ5/y;-><init>([BIIB)V

    .line 278
    .line 279
    .line 280
    invoke-static {v5, v10}, Ls2/a;->q(LJ5/y;Z)LG5/a;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    new-instance v5, LN1/m;

    .line 285
    .line 286
    invoke-direct {v5}, LN1/m;-><init>()V

    .line 287
    .line 288
    .line 289
    const-string v6, "audio/mp4a-latm"

    .line 290
    .line 291
    invoke-static {v6}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    iput-object v6, v5, LN1/m;->m:Ljava/lang/String;

    .line 296
    .line 297
    iget-object v6, v3, LG5/a;->c:Ljava/lang/String;

    .line 298
    .line 299
    iput-object v6, v5, LN1/m;->j:Ljava/lang/String;

    .line 300
    .line 301
    iget v6, v3, LG5/a;->b:I

    .line 302
    .line 303
    iput v6, v5, LN1/m;->B:I

    .line 304
    .line 305
    iget v3, v3, LG5/a;->a:I

    .line 306
    .line 307
    iput v3, v5, LN1/m;->C:I

    .line 308
    .line 309
    invoke-static {v14}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    iput-object v3, v5, LN1/m;->p:Ljava/util/List;

    .line 314
    .line 315
    invoke-static {v5, v11}, LVa/M6;->y(LN1/m;Ls2/C;)V

    .line 316
    .line 317
    .line 318
    iput-boolean v13, v1, Ly2/a;->c:Z

    .line 319
    .line 320
    :cond_b
    move v13, v10

    .line 321
    goto :goto_7

    .line 322
    :cond_c
    const/16 p2, 0x0

    .line 323
    .line 324
    iget v3, v1, Ly2/a;->d:I

    .line 325
    .line 326
    const/16 v14, 0xa

    .line 327
    .line 328
    if-ne v3, v14, :cond_d

    .line 329
    .line 330
    if-ne v6, v13, :cond_b

    .line 331
    .line 332
    :cond_d
    invoke-virtual {v5}, LQ1/o;->a()I

    .line 333
    .line 334
    .line 335
    move-result v3

    .line 336
    invoke-interface {v11, v3, v5}, Ls2/C;->e(ILQ1/o;)V

    .line 337
    .line 338
    .line 339
    iget-object v1, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 340
    .line 341
    move-object/from16 v17, v1

    .line 342
    .line 343
    check-cast v17, Ls2/C;

    .line 344
    .line 345
    const/16 v20, 0x1

    .line 346
    .line 347
    const/16 v22, 0x0

    .line 348
    .line 349
    const/16 v23, 0x0

    .line 350
    .line 351
    move/from16 v21, v3

    .line 352
    .line 353
    invoke-interface/range {v17 .. v23}, Ls2/C;->a(JIIILs2/B;)V

    .line 354
    .line 355
    .line 356
    :goto_7
    move v1, v4

    .line 357
    move-wide/from16 v16, v8

    .line 358
    .line 359
    goto/16 :goto_11

    .line 360
    .line 361
    :cond_e
    const/16 p2, 0x0

    .line 362
    .line 363
    if-ne v1, v5, :cond_19

    .line 364
    .line 365
    iget-object v3, v0, Ly2/b;->p:Ly2/d;

    .line 366
    .line 367
    if-eqz v3, :cond_19

    .line 368
    .line 369
    iget-boolean v1, v0, Ly2/b;->n:Z

    .line 370
    .line 371
    if-nez v1, :cond_f

    .line 372
    .line 373
    iget-object v1, v0, Ly2/b;->f:Ls2/o;

    .line 374
    .line 375
    new-instance v3, Ls2/q;

    .line 376
    .line 377
    invoke-direct {v3, v8, v9}, Ls2/q;-><init>(J)V

    .line 378
    .line 379
    .line 380
    invoke-interface {v1, v3}, Ls2/o;->s(Ls2/w;)V

    .line 381
    .line 382
    .line 383
    iput-boolean v4, v0, Ly2/b;->n:Z

    .line 384
    .line 385
    :cond_f
    iget-object v1, v0, Ly2/b;->p:Ly2/d;

    .line 386
    .line 387
    move-object/from16 v3, p1

    .line 388
    .line 389
    check-cast v3, Ls2/j;

    .line 390
    .line 391
    invoke-virtual {v0, v3}, Ly2/b;->b(Ls2/j;)LQ1/o;

    .line 392
    .line 393
    .line 394
    move-result-object v3

    .line 395
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v3}, LQ1/o;->u()I

    .line 399
    .line 400
    .line 401
    move-result v5

    .line 402
    shr-int/lit8 v6, v5, 0x4

    .line 403
    .line 404
    and-int/lit8 v6, v6, 0xf

    .line 405
    .line 406
    and-int/lit8 v5, v5, 0xf

    .line 407
    .line 408
    const/4 v10, 0x7

    .line 409
    if-ne v5, v10, :cond_18

    .line 410
    .line 411
    iput v6, v1, Ly2/d;->g:I

    .line 412
    .line 413
    const/4 v5, 0x5

    .line 414
    if-eq v6, v5, :cond_10

    .line 415
    .line 416
    const/4 v5, 0x1

    .line 417
    goto :goto_8

    .line 418
    :cond_10
    const/4 v5, 0x0

    .line 419
    :goto_8
    if-eqz v5, :cond_16

    .line 420
    .line 421
    invoke-virtual {v3}, LQ1/o;->u()I

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    iget-object v6, v3, LQ1/o;->a:[B

    .line 426
    .line 427
    iget v10, v3, LQ1/o;->b:I

    .line 428
    .line 429
    add-int/lit8 v11, v10, 0x1

    .line 430
    .line 431
    iput v11, v3, LQ1/o;->b:I

    .line 432
    .line 433
    aget-byte v13, v6, v10

    .line 434
    .line 435
    and-int/lit16 v13, v13, 0xff

    .line 436
    .line 437
    shl-int/lit8 v13, v13, 0x18

    .line 438
    .line 439
    shr-int/lit8 v13, v13, 0x8

    .line 440
    .line 441
    add-int/lit8 v14, v10, 0x2

    .line 442
    .line 443
    iput v14, v3, LQ1/o;->b:I

    .line 444
    .line 445
    aget-byte v11, v6, v11

    .line 446
    .line 447
    and-int/lit16 v11, v11, 0xff

    .line 448
    .line 449
    shl-int/lit8 v11, v11, 0x8

    .line 450
    .line 451
    or-int/2addr v11, v13

    .line 452
    add-int/lit8 v10, v10, 0x3

    .line 453
    .line 454
    iput v10, v3, LQ1/o;->b:I

    .line 455
    .line 456
    aget-byte v6, v6, v14

    .line 457
    .line 458
    and-int/lit16 v6, v6, 0xff

    .line 459
    .line 460
    or-int/2addr v6, v11

    .line 461
    int-to-long v10, v6

    .line 462
    const-wide/16 v13, 0x3e8

    .line 463
    .line 464
    mul-long/2addr v10, v13

    .line 465
    add-long v25, v10, v18

    .line 466
    .line 467
    const/4 v6, 0x1

    .line 468
    iget-object v10, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 469
    .line 470
    check-cast v10, Ls2/C;

    .line 471
    .line 472
    const/4 v11, 0x0

    .line 473
    if-nez v5, :cond_12

    .line 474
    .line 475
    iget-boolean v13, v1, Ly2/d;->e:Z

    .line 476
    .line 477
    if-nez v13, :cond_12

    .line 478
    .line 479
    new-instance v5, LQ1/o;

    .line 480
    .line 481
    invoke-virtual {v3}, LQ1/o;->a()I

    .line 482
    .line 483
    .line 484
    move-result v13

    .line 485
    new-array v13, v13, [B

    .line 486
    .line 487
    invoke-direct {v5, v13}, LQ1/o;-><init>([B)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v3}, LQ1/o;->a()I

    .line 491
    .line 492
    .line 493
    move-result v14

    .line 494
    invoke-virtual {v3, v11, v14, v13}, LQ1/o;->f(II[B)V

    .line 495
    .line 496
    .line 497
    invoke-static {v5}, Ls2/c;->a(LQ1/o;)Ls2/c;

    .line 498
    .line 499
    .line 500
    move-result-object v3

    .line 501
    iget v5, v3, Ls2/c;->b:I

    .line 502
    .line 503
    iput v5, v1, Ly2/d;->d:I

    .line 504
    .line 505
    new-instance v5, LN1/m;

    .line 506
    .line 507
    invoke-direct {v5}, LN1/m;-><init>()V

    .line 508
    .line 509
    .line 510
    const-string v13, "video/avc"

    .line 511
    .line 512
    invoke-static {v13}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v13

    .line 516
    iput-object v13, v5, LN1/m;->m:Ljava/lang/String;

    .line 517
    .line 518
    iget-object v13, v3, Ls2/c;->l:Ljava/lang/String;

    .line 519
    .line 520
    iput-object v13, v5, LN1/m;->j:Ljava/lang/String;

    .line 521
    .line 522
    iget v13, v3, Ls2/c;->c:I

    .line 523
    .line 524
    iput v13, v5, LN1/m;->t:I

    .line 525
    .line 526
    iget v13, v3, Ls2/c;->d:I

    .line 527
    .line 528
    iput v13, v5, LN1/m;->u:I

    .line 529
    .line 530
    iget v13, v3, Ls2/c;->k:F

    .line 531
    .line 532
    iput v13, v5, LN1/m;->x:F

    .line 533
    .line 534
    iget-object v3, v3, Ls2/c;->a:Ljava/util/ArrayList;

    .line 535
    .line 536
    iput-object v3, v5, LN1/m;->p:Ljava/util/List;

    .line 537
    .line 538
    invoke-static {v5, v10}, LVa/M6;->y(LN1/m;Ls2/C;)V

    .line 539
    .line 540
    .line 541
    iput-boolean v6, v1, Ly2/d;->e:Z

    .line 542
    .line 543
    :cond_11
    :goto_9
    move-wide/from16 v16, v8

    .line 544
    .line 545
    move v6, v11

    .line 546
    goto :goto_c

    .line 547
    :cond_12
    if-ne v5, v6, :cond_11

    .line 548
    .line 549
    iget-boolean v5, v1, Ly2/d;->e:Z

    .line 550
    .line 551
    if-eqz v5, :cond_11

    .line 552
    .line 553
    iget v5, v1, Ly2/d;->g:I

    .line 554
    .line 555
    if-ne v5, v6, :cond_13

    .line 556
    .line 557
    move/from16 v27, v6

    .line 558
    .line 559
    goto :goto_a

    .line 560
    :cond_13
    move/from16 v27, v11

    .line 561
    .line 562
    :goto_a
    iget-boolean v5, v1, Ly2/d;->f:Z

    .line 563
    .line 564
    if-nez v5, :cond_14

    .line 565
    .line 566
    if-nez v27, :cond_14

    .line 567
    .line 568
    goto :goto_9

    .line 569
    :cond_14
    iget-object v5, v1, Ly2/d;->c:LQ1/o;

    .line 570
    .line 571
    iget-object v13, v5, LQ1/o;->a:[B

    .line 572
    .line 573
    aput-byte v11, v13, v11

    .line 574
    .line 575
    aput-byte v11, v13, v6

    .line 576
    .line 577
    const/4 v14, 0x2

    .line 578
    aput-byte v11, v13, v14

    .line 579
    .line 580
    iget v13, v1, Ly2/d;->d:I

    .line 581
    .line 582
    const/4 v14, 0x4

    .line 583
    rsub-int/lit8 v13, v13, 0x4

    .line 584
    .line 585
    move/from16 v28, v11

    .line 586
    .line 587
    :goto_b
    invoke-virtual {v3}, LQ1/o;->a()I

    .line 588
    .line 589
    .line 590
    move-result v15

    .line 591
    if-lez v15, :cond_15

    .line 592
    .line 593
    iget-object v15, v5, LQ1/o;->a:[B

    .line 594
    .line 595
    move-wide/from16 v16, v8

    .line 596
    .line 597
    iget v8, v1, Ly2/d;->d:I

    .line 598
    .line 599
    invoke-virtual {v3, v13, v8, v15}, LQ1/o;->f(II[B)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v5, v11}, LQ1/o;->G(I)V

    .line 603
    .line 604
    .line 605
    invoke-virtual {v5}, LQ1/o;->y()I

    .line 606
    .line 607
    .line 608
    move-result v8

    .line 609
    iget-object v9, v1, Ly2/d;->b:LQ1/o;

    .line 610
    .line 611
    invoke-virtual {v9, v11}, LQ1/o;->G(I)V

    .line 612
    .line 613
    .line 614
    invoke-interface {v10, v14, v9}, Ls2/C;->e(ILQ1/o;)V

    .line 615
    .line 616
    .line 617
    add-int/lit8 v28, v28, 0x4

    .line 618
    .line 619
    invoke-interface {v10, v8, v3}, Ls2/C;->e(ILQ1/o;)V

    .line 620
    .line 621
    .line 622
    add-int v28, v28, v8

    .line 623
    .line 624
    move-wide/from16 v8, v16

    .line 625
    .line 626
    goto :goto_b

    .line 627
    :cond_15
    move-wide/from16 v16, v8

    .line 628
    .line 629
    const/16 v30, 0x0

    .line 630
    .line 631
    iget-object v3, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 632
    .line 633
    move-object/from16 v24, v3

    .line 634
    .line 635
    check-cast v24, Ls2/C;

    .line 636
    .line 637
    const/16 v29, 0x0

    .line 638
    .line 639
    invoke-interface/range {v24 .. v30}, Ls2/C;->a(JIIILs2/B;)V

    .line 640
    .line 641
    .line 642
    iput-boolean v6, v1, Ly2/d;->f:Z

    .line 643
    .line 644
    :goto_c
    if-eqz v6, :cond_17

    .line 645
    .line 646
    move v1, v4

    .line 647
    goto :goto_d

    .line 648
    :cond_16
    move-wide/from16 v16, v8

    .line 649
    .line 650
    :cond_17
    move/from16 v1, p2

    .line 651
    .line 652
    :goto_d
    move v13, v1

    .line 653
    :goto_e
    move v1, v4

    .line 654
    goto/16 :goto_11

    .line 655
    .line 656
    :cond_18
    new-instance v1, Lj2/d;

    .line 657
    .line 658
    const-string v2, "Video format not supported: "

    .line 659
    .line 660
    invoke-static {v5, v2}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    const/4 v3, 0x2

    .line 665
    invoke-direct {v1, v2, v3}, Lj2/d;-><init>(Ljava/lang/String;I)V

    .line 666
    .line 667
    .line 668
    throw v1

    .line 669
    :cond_19
    move-wide/from16 v16, v8

    .line 670
    .line 671
    const/16 v3, 0x12

    .line 672
    .line 673
    if-ne v1, v3, :cond_22

    .line 674
    .line 675
    iget-boolean v1, v0, Ly2/b;->n:Z

    .line 676
    .line 677
    if-nez v1, :cond_22

    .line 678
    .line 679
    move-object/from16 v1, p1

    .line 680
    .line 681
    check-cast v1, Ls2/j;

    .line 682
    .line 683
    invoke-virtual {v0, v1}, Ly2/b;->b(Ls2/j;)LQ1/o;

    .line 684
    .line 685
    .line 686
    move-result-object v1

    .line 687
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 688
    .line 689
    .line 690
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 694
    .line 695
    .line 696
    move-result v3

    .line 697
    const/4 v5, 0x2

    .line 698
    const/4 v6, 0x0

    .line 699
    if-eq v3, v5, :cond_1a

    .line 700
    .line 701
    goto/16 :goto_10

    .line 702
    .line 703
    :cond_1a
    invoke-static {v1}, Ly2/c;->g0(LQ1/o;)Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v3

    .line 707
    const-string v5, "onMetaData"

    .line 708
    .line 709
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 710
    .line 711
    .line 712
    move-result v3

    .line 713
    if-nez v3, :cond_1b

    .line 714
    .line 715
    goto/16 :goto_10

    .line 716
    .line 717
    :cond_1b
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 718
    .line 719
    .line 720
    move-result v3

    .line 721
    if-nez v3, :cond_1c

    .line 722
    .line 723
    goto/16 :goto_10

    .line 724
    .line 725
    :cond_1c
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 726
    .line 727
    .line 728
    move-result v3

    .line 729
    const/16 v5, 0x8

    .line 730
    .line 731
    if-eq v3, v5, :cond_1d

    .line 732
    .line 733
    goto/16 :goto_10

    .line 734
    .line 735
    :cond_1d
    invoke-static {v1}, Ly2/c;->f0(LQ1/o;)Ljava/util/HashMap;

    .line 736
    .line 737
    .line 738
    move-result-object v1

    .line 739
    const-string v3, "duration"

    .line 740
    .line 741
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v3

    .line 745
    instance-of v5, v3, Ljava/lang/Double;

    .line 746
    .line 747
    const-wide v8, 0x412e848000000000L    # 1000000.0

    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    if-eqz v5, :cond_1e

    .line 753
    .line 754
    check-cast v3, Ljava/lang/Double;

    .line 755
    .line 756
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 757
    .line 758
    .line 759
    move-result-wide v10

    .line 760
    const-wide/16 v13, 0x0

    .line 761
    .line 762
    cmpl-double v3, v10, v13

    .line 763
    .line 764
    if-lez v3, :cond_1e

    .line 765
    .line 766
    mul-double/2addr v10, v8

    .line 767
    double-to-long v10, v10

    .line 768
    iput-wide v10, v12, Ly2/c;->b:J

    .line 769
    .line 770
    :cond_1e
    const-string v3, "keyframes"

    .line 771
    .line 772
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 773
    .line 774
    .line 775
    move-result-object v1

    .line 776
    instance-of v3, v1, Ljava/util/Map;

    .line 777
    .line 778
    if-eqz v3, :cond_20

    .line 779
    .line 780
    check-cast v1, Ljava/util/Map;

    .line 781
    .line 782
    const-string v3, "filepositions"

    .line 783
    .line 784
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v3

    .line 788
    const-string v5, "times"

    .line 789
    .line 790
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v1

    .line 794
    instance-of v5, v3, Ljava/util/List;

    .line 795
    .line 796
    if-eqz v5, :cond_20

    .line 797
    .line 798
    instance-of v5, v1, Ljava/util/List;

    .line 799
    .line 800
    if-eqz v5, :cond_20

    .line 801
    .line 802
    check-cast v3, Ljava/util/List;

    .line 803
    .line 804
    check-cast v1, Ljava/util/List;

    .line 805
    .line 806
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 807
    .line 808
    .line 809
    move-result v5

    .line 810
    new-array v10, v5, [J

    .line 811
    .line 812
    iput-object v10, v12, Ly2/c;->c:[J

    .line 813
    .line 814
    new-array v10, v5, [J

    .line 815
    .line 816
    iput-object v10, v12, Ly2/c;->d:[J

    .line 817
    .line 818
    move v10, v6

    .line 819
    :goto_f
    if-ge v10, v5, :cond_20

    .line 820
    .line 821
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v11

    .line 825
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object v13

    .line 829
    instance-of v14, v13, Ljava/lang/Double;

    .line 830
    .line 831
    if-eqz v14, :cond_1f

    .line 832
    .line 833
    instance-of v14, v11, Ljava/lang/Double;

    .line 834
    .line 835
    if-eqz v14, :cond_1f

    .line 836
    .line 837
    iget-object v14, v12, Ly2/c;->c:[J

    .line 838
    .line 839
    check-cast v13, Ljava/lang/Double;

    .line 840
    .line 841
    invoke-virtual {v13}, Ljava/lang/Double;->doubleValue()D

    .line 842
    .line 843
    .line 844
    move-result-wide v18

    .line 845
    move-wide/from16 v20, v8

    .line 846
    .line 847
    mul-double v8, v18, v20

    .line 848
    .line 849
    double-to-long v8, v8

    .line 850
    aput-wide v8, v14, v10

    .line 851
    .line 852
    iget-object v8, v12, Ly2/c;->d:[J

    .line 853
    .line 854
    check-cast v11, Ljava/lang/Double;

    .line 855
    .line 856
    invoke-virtual {v11}, Ljava/lang/Double;->longValue()J

    .line 857
    .line 858
    .line 859
    move-result-wide v13

    .line 860
    aput-wide v13, v8, v10

    .line 861
    .line 862
    add-int/lit8 v10, v10, 0x1

    .line 863
    .line 864
    move-wide/from16 v8, v20

    .line 865
    .line 866
    goto :goto_f

    .line 867
    :cond_1f
    new-array v1, v6, [J

    .line 868
    .line 869
    iput-object v1, v12, Ly2/c;->c:[J

    .line 870
    .line 871
    new-array v1, v6, [J

    .line 872
    .line 873
    iput-object v1, v12, Ly2/c;->d:[J

    .line 874
    .line 875
    :cond_20
    :goto_10
    iget-wide v5, v12, Ly2/c;->b:J

    .line 876
    .line 877
    cmp-long v1, v5, v16

    .line 878
    .line 879
    if-eqz v1, :cond_21

    .line 880
    .line 881
    iget-object v1, v0, Ly2/b;->f:Ls2/o;

    .line 882
    .line 883
    new-instance v3, Ls2/u;

    .line 884
    .line 885
    iget-object v8, v12, Ly2/c;->d:[J

    .line 886
    .line 887
    iget-object v9, v12, Ly2/c;->c:[J

    .line 888
    .line 889
    invoke-direct {v3, v8, v9, v5, v6}, Ls2/u;-><init>([J[JJ)V

    .line 890
    .line 891
    .line 892
    invoke-interface {v1, v3}, Ls2/o;->s(Ls2/w;)V

    .line 893
    .line 894
    .line 895
    iput-boolean v4, v0, Ly2/b;->n:Z

    .line 896
    .line 897
    :cond_21
    move/from16 v13, p2

    .line 898
    .line 899
    goto/16 :goto_e

    .line 900
    .line 901
    :cond_22
    iget v1, v0, Ly2/b;->l:I

    .line 902
    .line 903
    move-object/from16 v3, p1

    .line 904
    .line 905
    check-cast v3, Ls2/j;

    .line 906
    .line 907
    invoke-virtual {v3, v1}, Ls2/j;->j(I)V

    .line 908
    .line 909
    .line 910
    move/from16 v1, p2

    .line 911
    .line 912
    move v13, v1

    .line 913
    :goto_11
    iget-boolean v3, v0, Ly2/b;->h:Z

    .line 914
    .line 915
    if-nez v3, :cond_24

    .line 916
    .line 917
    if-eqz v13, :cond_24

    .line 918
    .line 919
    iput-boolean v4, v0, Ly2/b;->h:Z

    .line 920
    .line 921
    iget-wide v3, v12, Ly2/c;->b:J

    .line 922
    .line 923
    cmp-long v3, v3, v16

    .line 924
    .line 925
    if-nez v3, :cond_23

    .line 926
    .line 927
    iget-wide v3, v0, Ly2/b;->m:J

    .line 928
    .line 929
    neg-long v10, v3

    .line 930
    goto :goto_12

    .line 931
    :cond_23
    const-wide/16 v10, 0x0

    .line 932
    .line 933
    :goto_12
    iput-wide v10, v0, Ly2/b;->i:J

    .line 934
    .line 935
    :cond_24
    iput v2, v0, Ly2/b;->j:I

    .line 936
    .line 937
    iput v7, v0, Ly2/b;->g:I

    .line 938
    .line 939
    if-eqz v1, :cond_0

    .line 940
    .line 941
    return p2

    .line 942
    :cond_25
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 943
    .line 944
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 945
    .line 946
    .line 947
    throw v1

    .line 948
    :cond_26
    const/16 p2, 0x0

    .line 949
    .line 950
    iget-object v1, v0, Ly2/b;->c:LQ1/o;

    .line 951
    .line 952
    iget-object v3, v1, LQ1/o;->a:[B

    .line 953
    .line 954
    const/16 v5, 0xb

    .line 955
    .line 956
    move-object/from16 v6, p1

    .line 957
    .line 958
    check-cast v6, Ls2/j;

    .line 959
    .line 960
    move/from16 v7, p2

    .line 961
    .line 962
    invoke-virtual {v6, v3, v7, v5, v4}, Ls2/j;->f([BIIZ)Z

    .line 963
    .line 964
    .line 965
    move-result v3

    .line 966
    if-nez v3, :cond_27

    .line 967
    .line 968
    goto :goto_13

    .line 969
    :cond_27
    invoke-virtual {v1, v7}, LQ1/o;->G(I)V

    .line 970
    .line 971
    .line 972
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 973
    .line 974
    .line 975
    move-result v3

    .line 976
    iput v3, v0, Ly2/b;->k:I

    .line 977
    .line 978
    invoke-virtual {v1}, LQ1/o;->x()I

    .line 979
    .line 980
    .line 981
    move-result v3

    .line 982
    iput v3, v0, Ly2/b;->l:I

    .line 983
    .line 984
    invoke-virtual {v1}, LQ1/o;->x()I

    .line 985
    .line 986
    .line 987
    move-result v3

    .line 988
    int-to-long v3, v3

    .line 989
    iput-wide v3, v0, Ly2/b;->m:J

    .line 990
    .line 991
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 992
    .line 993
    .line 994
    move-result v3

    .line 995
    shl-int/lit8 v3, v3, 0x18

    .line 996
    .line 997
    int-to-long v3, v3

    .line 998
    iget-wide v5, v0, Ly2/b;->m:J

    .line 999
    .line 1000
    or-long/2addr v3, v5

    .line 1001
    const-wide/16 v5, 0x3e8

    .line 1002
    .line 1003
    mul-long/2addr v3, v5

    .line 1004
    iput-wide v3, v0, Ly2/b;->m:J

    .line 1005
    .line 1006
    invoke-virtual {v1, v8}, LQ1/o;->H(I)V

    .line 1007
    .line 1008
    .line 1009
    iput v2, v0, Ly2/b;->g:I

    .line 1010
    .line 1011
    goto/16 :goto_0

    .line 1012
    .line 1013
    :cond_28
    iget v1, v0, Ly2/b;->j:I

    .line 1014
    .line 1015
    move-object/from16 v2, p1

    .line 1016
    .line 1017
    check-cast v2, Ls2/j;

    .line 1018
    .line 1019
    invoke-virtual {v2, v1}, Ls2/j;->j(I)V

    .line 1020
    .line 1021
    .line 1022
    const/4 v1, 0x0

    .line 1023
    iput v1, v0, Ly2/b;->j:I

    .line 1024
    .line 1025
    iput v8, v0, Ly2/b;->g:I

    .line 1026
    .line 1027
    goto/16 :goto_0

    .line 1028
    .line 1029
    :cond_29
    const/4 v1, 0x0

    .line 1030
    iget-object v3, v0, Ly2/b;->b:LQ1/o;

    .line 1031
    .line 1032
    iget-object v8, v3, LQ1/o;->a:[B

    .line 1033
    .line 1034
    move-object/from16 v9, p1

    .line 1035
    .line 1036
    check-cast v9, Ls2/j;

    .line 1037
    .line 1038
    invoke-virtual {v9, v8, v1, v5, v4}, Ls2/j;->f([BIIZ)Z

    .line 1039
    .line 1040
    .line 1041
    move-result v8

    .line 1042
    if-nez v8, :cond_2a

    .line 1043
    .line 1044
    :goto_13
    const/4 v1, -0x1

    .line 1045
    return v1

    .line 1046
    :cond_2a
    invoke-virtual {v3, v1}, LQ1/o;->G(I)V

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual {v3, v2}, LQ1/o;->H(I)V

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v3}, LQ1/o;->u()I

    .line 1053
    .line 1054
    .line 1055
    move-result v2

    .line 1056
    and-int/lit8 v8, v2, 0x4

    .line 1057
    .line 1058
    if-eqz v8, :cond_2b

    .line 1059
    .line 1060
    move v8, v4

    .line 1061
    goto :goto_14

    .line 1062
    :cond_2b
    move v8, v1

    .line 1063
    :goto_14
    and-int/lit8 v2, v2, 0x1

    .line 1064
    .line 1065
    if-eqz v2, :cond_2c

    .line 1066
    .line 1067
    move v1, v4

    .line 1068
    :cond_2c
    if-eqz v8, :cond_2d

    .line 1069
    .line 1070
    iget-object v2, v0, Ly2/b;->o:Ly2/a;

    .line 1071
    .line 1072
    if-nez v2, :cond_2d

    .line 1073
    .line 1074
    new-instance v2, Ly2/a;

    .line 1075
    .line 1076
    iget-object v8, v0, Ly2/b;->f:Ls2/o;

    .line 1077
    .line 1078
    invoke-interface {v8, v6, v4}, Ls2/o;->m(II)Ls2/C;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v4

    .line 1082
    invoke-direct {v2, v4}, LA7/B0;-><init>(Ljava/lang/Object;)V

    .line 1083
    .line 1084
    .line 1085
    iput-object v2, v0, Ly2/b;->o:Ly2/a;

    .line 1086
    .line 1087
    :cond_2d
    if-eqz v1, :cond_2e

    .line 1088
    .line 1089
    iget-object v1, v0, Ly2/b;->p:Ly2/d;

    .line 1090
    .line 1091
    if-nez v1, :cond_2e

    .line 1092
    .line 1093
    new-instance v1, Ly2/d;

    .line 1094
    .line 1095
    iget-object v2, v0, Ly2/b;->f:Ls2/o;

    .line 1096
    .line 1097
    invoke-interface {v2, v5, v7}, Ls2/o;->m(II)Ls2/C;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v2

    .line 1101
    invoke-direct {v1, v2}, Ly2/d;-><init>(Ls2/C;)V

    .line 1102
    .line 1103
    .line 1104
    iput-object v1, v0, Ly2/b;->p:Ly2/d;

    .line 1105
    .line 1106
    :cond_2e
    iget-object v1, v0, Ly2/b;->f:Ls2/o;

    .line 1107
    .line 1108
    invoke-interface {v1}, Ls2/o;->l()V

    .line 1109
    .line 1110
    .line 1111
    invoke-virtual {v3}, LQ1/o;->h()I

    .line 1112
    .line 1113
    .line 1114
    move-result v1

    .line 1115
    add-int/lit8 v1, v1, -0x5

    .line 1116
    .line 1117
    iput v1, v0, Ly2/b;->j:I

    .line 1118
    .line 1119
    iput v7, v0, Ly2/b;->g:I

    .line 1120
    .line 1121
    goto/16 :goto_0
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
