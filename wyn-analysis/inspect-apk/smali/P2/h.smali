.class public final LP2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls2/m;


# instance fields
.field public final a:LP2/l;

.field public final b:LN1/n;

.field public final c:Ljava/util/ArrayList;

.field public final d:LQ1/o;

.field public e:[B

.field public f:Ls2/C;

.field public g:I

.field public h:I

.field public i:[J

.field public j:J


# direct methods
.method public constructor <init>(LP2/l;LN1/n;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP2/h;->a:LP2/l;

    .line 5
    .line 6
    sget-object v0, LQ1/x;->f:[B

    .line 7
    .line 8
    iput-object v0, p0, LP2/h;->e:[B

    .line 9
    .line 10
    new-instance v0, LQ1/o;

    .line 11
    .line 12
    invoke-direct {v0}, LQ1/o;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, LP2/h;->d:LQ1/o;

    .line 16
    .line 17
    invoke-virtual {p2}, LN1/n;->a()LN1/m;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "application/x-media3-cues"

    .line 22
    .line 23
    invoke-static {v1}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iput-object v1, v0, LN1/m;->m:Ljava/lang/String;

    .line 28
    .line 29
    iget-object p2, p2, LN1/n;->n:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p2, v0, LN1/m;->j:Ljava/lang/String;

    .line 32
    .line 33
    invoke-interface {p1}, LP2/l;->P()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iput p1, v0, LN1/m;->H:I

    .line 38
    .line 39
    new-instance p1, LN1/n;

    .line 40
    .line 41
    invoke-direct {p1, v0}, LN1/n;-><init>(LN1/m;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, LP2/h;->b:LN1/n;

    .line 45
    .line 46
    new-instance p1, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, LP2/h;->c:Ljava/util/ArrayList;

    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    iput p1, p0, LP2/h;->h:I

    .line 55
    .line 56
    sget-object p1, LQ1/x;->g:[J

    .line 57
    .line 58
    iput-object p1, p0, LP2/h;->i:[J

    .line 59
    .line 60
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    iput-wide p1, p0, LP2/h;->j:J

    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 1

    .line 1
    iget p1, p0, LP2/h;->h:I

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    move p1, p2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    invoke-static {p1}, LQ1/k;->g(Z)V

    .line 13
    .line 14
    .line 15
    iput-wide p3, p0, LP2/h;->j:J

    .line 16
    .line 17
    iget p1, p0, LP2/h;->h:I

    .line 18
    .line 19
    const/4 p3, 0x2

    .line 20
    if-ne p1, p3, :cond_1

    .line 21
    .line 22
    iput p2, p0, LP2/h;->h:I

    .line 23
    .line 24
    :cond_1
    iget p1, p0, LP2/h;->h:I

    .line 25
    .line 26
    const/4 p2, 0x4

    .line 27
    if-ne p1, p2, :cond_2

    .line 28
    .line 29
    const/4 p1, 0x3

    .line 30
    iput p1, p0, LP2/h;->h:I

    .line 31
    .line 32
    :cond_2
    return-void
.end method

.method public final b(LP2/g;)V
    .locals 8

    .line 1
    iget-object v0, p0, LP2/h;->f:Ls2/C;

    .line 2
    .line 3
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, LP2/g;->b:[B

    .line 7
    .line 8
    array-length v5, v0

    .line 9
    iget-object v1, p0, LP2/h;->d:LQ1/o;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    array-length v2, v0

    .line 15
    invoke-virtual {v1, v2, v0}, LQ1/o;->E(I[B)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LP2/h;->f:Ls2/C;

    .line 19
    .line 20
    invoke-interface {v0, v5, v1}, Ls2/C;->e(ILQ1/o;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, LP2/h;->f:Ls2/C;

    .line 24
    .line 25
    iget-wide v2, p1, LP2/g;->a:J

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v7, 0x0

    .line 30
    invoke-interface/range {v1 .. v7}, Ls2/C;->a(JIIILs2/B;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final g(Ls2/o;)V
    .locals 7

    .line 1
    iget v0, p0, LP2/h;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    invoke-interface {p1, v1, v0}, Ls2/o;->m(II)Ls2/C;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, LP2/h;->f:Ls2/C;

    .line 19
    .line 20
    iget-object v3, p0, LP2/h;->b:LN1/n;

    .line 21
    .line 22
    invoke-interface {v0, v3}, Ls2/C;->c(LN1/n;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Ls2/o;->l()V

    .line 26
    .line 27
    .line 28
    new-instance v0, Ls2/u;

    .line 29
    .line 30
    const-wide/16 v3, 0x0

    .line 31
    .line 32
    new-array v5, v2, [J

    .line 33
    .line 34
    aput-wide v3, v5, v1

    .line 35
    .line 36
    new-array v6, v2, [J

    .line 37
    .line 38
    aput-wide v3, v6, v1

    .line 39
    .line 40
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    invoke-direct {v0, v5, v6, v3, v4}, Ls2/u;-><init>([J[JJ)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1, v0}, Ls2/o;->s(Ls2/w;)V

    .line 49
    .line 50
    .line 51
    iput v2, p0, LP2/h;->h:I

    .line 52
    .line 53
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
    const/4 p1, 0x1

    .line 2
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
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, LP2/h;->h:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v4, 0x5

    .line 10
    if-eq v0, v4, :cond_0

    .line 11
    .line 12
    move v0, v3

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, v2

    .line 15
    :goto_0
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 16
    .line 17
    .line 18
    iget v0, v1, LP2/h;->h:I

    .line 19
    .line 20
    const/4 v4, 0x2

    .line 21
    const/16 v5, 0x400

    .line 22
    .line 23
    const-wide/16 v6, -0x1

    .line 24
    .line 25
    if-ne v0, v3, :cond_3

    .line 26
    .line 27
    move-object/from16 v0, p1

    .line 28
    .line 29
    check-cast v0, Ls2/j;

    .line 30
    .line 31
    iget-wide v8, v0, Ls2/j;->c:J

    .line 32
    .line 33
    cmp-long v0, v8, v6

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    move-object/from16 v0, p1

    .line 38
    .line 39
    check-cast v0, Ls2/j;

    .line 40
    .line 41
    iget-wide v8, v0, Ls2/j;->c:J

    .line 42
    .line 43
    invoke-static {v8, v9}, LS3/f;->l(J)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move v0, v5

    .line 49
    :goto_1
    iget-object v8, v1, LP2/h;->e:[B

    .line 50
    .line 51
    array-length v8, v8

    .line 52
    if-le v0, v8, :cond_2

    .line 53
    .line 54
    new-array v0, v0, [B

    .line 55
    .line 56
    iput-object v0, v1, LP2/h;->e:[B

    .line 57
    .line 58
    :cond_2
    iput v2, v1, LP2/h;->g:I

    .line 59
    .line 60
    iput v4, v1, LP2/h;->h:I

    .line 61
    .line 62
    :cond_3
    iget v0, v1, LP2/h;->h:I

    .line 63
    .line 64
    iget-object v8, v1, LP2/h;->c:Ljava/util/ArrayList;

    .line 65
    .line 66
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    const/4 v11, 0x4

    .line 72
    const/4 v12, -0x1

    .line 73
    if-ne v0, v4, :cond_a

    .line 74
    .line 75
    iget-object v0, v1, LP2/h;->e:[B

    .line 76
    .line 77
    array-length v4, v0

    .line 78
    iget v13, v1, LP2/h;->g:I

    .line 79
    .line 80
    if-ne v4, v13, :cond_4

    .line 81
    .line 82
    array-length v4, v0

    .line 83
    add-int/2addr v4, v5

    .line 84
    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iput-object v0, v1, LP2/h;->e:[B

    .line 89
    .line 90
    :cond_4
    iget-object v0, v1, LP2/h;->e:[B

    .line 91
    .line 92
    iget v4, v1, LP2/h;->g:I

    .line 93
    .line 94
    array-length v13, v0

    .line 95
    sub-int/2addr v13, v4

    .line 96
    move-object/from16 v14, p1

    .line 97
    .line 98
    check-cast v14, Ls2/j;

    .line 99
    .line 100
    invoke-virtual {v14, v0, v4, v13}, Ls2/j;->read([BII)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eq v0, v12, :cond_5

    .line 105
    .line 106
    iget v4, v1, LP2/h;->g:I

    .line 107
    .line 108
    add-int/2addr v4, v0

    .line 109
    iput v4, v1, LP2/h;->g:I

    .line 110
    .line 111
    :cond_5
    iget-wide v13, v14, Ls2/j;->c:J

    .line 112
    .line 113
    cmp-long v4, v13, v6

    .line 114
    .line 115
    if-eqz v4, :cond_6

    .line 116
    .line 117
    iget v4, v1, LP2/h;->g:I

    .line 118
    .line 119
    move-wide v15, v6

    .line 120
    int-to-long v5, v4

    .line 121
    cmp-long v4, v5, v13

    .line 122
    .line 123
    if-eqz v4, :cond_7

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_6
    move-wide v15, v6

    .line 127
    :goto_2
    if-ne v0, v12, :cond_b

    .line 128
    .line 129
    :cond_7
    :try_start_0
    iget-wide v4, v1, LP2/h;->j:J

    .line 130
    .line 131
    cmp-long v0, v4, v9

    .line 132
    .line 133
    if-eqz v0, :cond_8

    .line 134
    .line 135
    new-instance v0, LP2/k;

    .line 136
    .line 137
    invoke-direct {v0, v4, v5, v3}, LP2/k;-><init>(JZ)V

    .line 138
    .line 139
    .line 140
    :goto_3
    move-object/from16 v21, v0

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_8
    sget-object v0, LP2/k;->c:LP2/k;

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :goto_4
    iget-object v0, v1, LP2/h;->a:LP2/l;

    .line 147
    .line 148
    iget-object v4, v1, LP2/h;->e:[B

    .line 149
    .line 150
    iget v5, v1, LP2/h;->g:I

    .line 151
    .line 152
    new-instance v6, LB8/b;

    .line 153
    .line 154
    const/16 v7, 0x1a

    .line 155
    .line 156
    invoke-direct {v6, v1, v7}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 157
    .line 158
    .line 159
    const/16 v19, 0x0

    .line 160
    .line 161
    move-object/from16 v17, v0

    .line 162
    .line 163
    move-object/from16 v18, v4

    .line 164
    .line 165
    move/from16 v20, v5

    .line 166
    .line 167
    move-object/from16 v22, v6

    .line 168
    .line 169
    invoke-interface/range {v17 .. v22}, LP2/l;->E([BIILP2/k;LQ1/c;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v8}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    new-array v0, v0, [J

    .line 180
    .line 181
    iput-object v0, v1, LP2/h;->i:[J

    .line 182
    .line 183
    move v0, v2

    .line 184
    :goto_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-ge v0, v4, :cond_9

    .line 189
    .line 190
    iget-object v4, v1, LP2/h;->i:[J

    .line 191
    .line 192
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    check-cast v5, LP2/g;

    .line 197
    .line 198
    iget-wide v5, v5, LP2/g;->a:J

    .line 199
    .line 200
    aput-wide v5, v4, v0

    .line 201
    .line 202
    add-int/lit8 v0, v0, 0x1

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :catch_0
    move-exception v0

    .line 206
    goto :goto_6

    .line 207
    :cond_9
    sget-object v0, LQ1/x;->f:[B

    .line 208
    .line 209
    iput-object v0, v1, LP2/h;->e:[B
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 210
    .line 211
    iput v11, v1, LP2/h;->h:I

    .line 212
    .line 213
    goto :goto_7

    .line 214
    :goto_6
    const-string v2, "SubtitleParser failed."

    .line 215
    .line 216
    invoke-static {v0, v2}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    throw v0

    .line 221
    :cond_a
    move-wide v15, v6

    .line 222
    :cond_b
    :goto_7
    iget v0, v1, LP2/h;->h:I

    .line 223
    .line 224
    const/4 v4, 0x3

    .line 225
    if-ne v0, v4, :cond_f

    .line 226
    .line 227
    move-object/from16 v0, p1

    .line 228
    .line 229
    check-cast v0, Ls2/j;

    .line 230
    .line 231
    iget-wide v4, v0, Ls2/j;->c:J

    .line 232
    .line 233
    cmp-long v0, v4, v15

    .line 234
    .line 235
    if-eqz v0, :cond_c

    .line 236
    .line 237
    move-object/from16 v0, p1

    .line 238
    .line 239
    check-cast v0, Ls2/j;

    .line 240
    .line 241
    iget-wide v4, v0, Ls2/j;->c:J

    .line 242
    .line 243
    invoke-static {v4, v5}, LS3/f;->l(J)I

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    goto :goto_8

    .line 248
    :cond_c
    const/16 v5, 0x400

    .line 249
    .line 250
    :goto_8
    move-object/from16 v0, p1

    .line 251
    .line 252
    check-cast v0, Ls2/j;

    .line 253
    .line 254
    invoke-virtual {v0, v5}, Ls2/j;->q(I)I

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-ne v0, v12, :cond_f

    .line 259
    .line 260
    iget-wide v4, v1, LP2/h;->j:J

    .line 261
    .line 262
    cmp-long v0, v4, v9

    .line 263
    .line 264
    if-nez v0, :cond_d

    .line 265
    .line 266
    move v0, v2

    .line 267
    goto :goto_9

    .line 268
    :cond_d
    iget-object v0, v1, LP2/h;->i:[J

    .line 269
    .line 270
    invoke-static {v0, v4, v5, v3}, LQ1/x;->e([JJZ)I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    :goto_9
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    if-ge v0, v3, :cond_e

    .line 279
    .line 280
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    check-cast v3, LP2/g;

    .line 285
    .line 286
    invoke-virtual {v1, v3}, LP2/h;->b(LP2/g;)V

    .line 287
    .line 288
    .line 289
    add-int/lit8 v0, v0, 0x1

    .line 290
    .line 291
    goto :goto_9

    .line 292
    :cond_e
    iput v11, v1, LP2/h;->h:I

    .line 293
    .line 294
    :cond_f
    iget v0, v1, LP2/h;->h:I

    .line 295
    .line 296
    if-ne v0, v11, :cond_10

    .line 297
    .line 298
    return v12

    .line 299
    :cond_10
    return v2
.end method

.method public final release()V
    .locals 2

    .line 1
    iget v0, p0, LP2/h;->h:I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, LP2/h;->a:LP2/l;

    .line 8
    .line 9
    invoke-interface {v0}, LP2/l;->reset()V

    .line 10
    .line 11
    .line 12
    iput v1, p0, LP2/h;->h:I

    .line 13
    .line 14
    return-void
.end method
