.class public final LY2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls2/m;


# instance fields
.field public final a:LQ1/u;

.field public final b:Landroid/util/SparseArray;

.field public final c:LQ1/o;

.field public final d:LY2/t;

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:J

.field public i:LY2/s;

.field public j:Ls2/o;

.field public k:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, LQ1/u;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-direct {v0, v1, v2}, LQ1/u;-><init>(J)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LY2/v;->a:LQ1/u;

    .line 12
    .line 13
    new-instance v0, LQ1/o;

    .line 14
    .line 15
    const/16 v1, 0x1000

    .line 16
    .line 17
    invoke-direct {v0, v1}, LQ1/o;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, LY2/v;->c:LQ1/o;

    .line 21
    .line 22
    new-instance v0, Landroid/util/SparseArray;

    .line 23
    .line 24
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, LY2/v;->b:Landroid/util/SparseArray;

    .line 28
    .line 29
    new-instance v0, LY2/t;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, v1}, LY2/t;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, LY2/v;->d:LY2/t;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 6

    .line 1
    iget-object p1, p0, LY2/v;->a:LQ1/u;

    .line 2
    .line 3
    invoke-virtual {p1}, LQ1/u;->e()J

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
    invoke-virtual {p1}, LQ1/u;->d()J

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
    invoke-virtual {p1, p3, p4}, LQ1/u;->g(J)V

    .line 47
    .line 48
    .line 49
    :cond_3
    iget-object p1, p0, LY2/v;->i:LY2/s;

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
    iget-object p2, p0, LY2/v;->b:Landroid/util/SparseArray;

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
    check-cast p2, LY2/u;

    .line 70
    .line 71
    iput-boolean v1, p2, LY2/u;->f:Z

    .line 72
    .line 73
    iget-object p2, p2, LY2/u;->a:LY2/h;

    .line 74
    .line 75
    invoke-interface {p2}, LY2/h;->a()V

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

.method public final g(Ls2/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY2/v;->j:Ls2/o;

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
    .locals 9

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    check-cast p1, Ls2/j;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {p1, v1, v2, v0, v2}, Ls2/j;->c([BIIZ)Z

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
    invoke-virtual {p1, v0, v2}, Ls2/j;->b(IZ)Z

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v1, v2, v5, v2}, Ls2/j;->c([BIIZ)Z

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
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, LY2/v;->j:Ls2/o;

    .line 6
    .line 7
    invoke-static {v2}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p1

    .line 11
    .line 12
    check-cast v2, Ls2/j;

    .line 13
    .line 14
    iget-wide v12, v2, Ls2/j;->c:J

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
    const/4 v6, 0x3

    .line 24
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    const/16 v9, 0x1ba

    .line 30
    .line 31
    iget-object v10, v0, LY2/v;->d:LY2/t;

    .line 32
    .line 33
    if-eqz v2, :cond_a

    .line 34
    .line 35
    iget-boolean v11, v10, LY2/t;->d:Z

    .line 36
    .line 37
    if-nez v11, :cond_a

    .line 38
    .line 39
    iget-boolean v2, v10, LY2/t;->f:Z

    .line 40
    .line 41
    iget-object v11, v10, LY2/t;->c:LQ1/o;

    .line 42
    .line 43
    const-wide/16 v12, 0x4e20

    .line 44
    .line 45
    if-nez v2, :cond_3

    .line 46
    .line 47
    move-object/from16 v2, p1

    .line 48
    .line 49
    check-cast v2, Ls2/j;

    .line 50
    .line 51
    iget-wide v14, v2, Ls2/j;->c:J

    .line 52
    .line 53
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->min(JJ)J

    .line 54
    .line 55
    .line 56
    move-result-wide v12

    .line 57
    long-to-int v6, v12

    .line 58
    int-to-long v12, v6

    .line 59
    sub-long/2addr v14, v12

    .line 60
    iget-wide v12, v2, Ls2/j;->d:J

    .line 61
    .line 62
    cmp-long v12, v12, v14

    .line 63
    .line 64
    if-eqz v12, :cond_0

    .line 65
    .line 66
    iput-wide v14, v1, LJ5/n;->a:J

    .line 67
    .line 68
    return v3

    .line 69
    :cond_0
    invoke-virtual {v11, v6}, LQ1/o;->D(I)V

    .line 70
    .line 71
    .line 72
    iput v5, v2, Ls2/j;->f:I

    .line 73
    .line 74
    iget-object v1, v11, LQ1/o;->a:[B

    .line 75
    .line 76
    invoke-virtual {v2, v1, v5, v6, v5}, Ls2/j;->c([BIIZ)Z

    .line 77
    .line 78
    .line 79
    iget v1, v11, LQ1/o;->b:I

    .line 80
    .line 81
    iget v2, v11, LQ1/o;->c:I

    .line 82
    .line 83
    sub-int/2addr v2, v4

    .line 84
    :goto_0
    if-lt v2, v1, :cond_2

    .line 85
    .line 86
    iget-object v4, v11, LQ1/o;->a:[B

    .line 87
    .line 88
    invoke-static {v2, v4}, LY2/t;->b(I[B)I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-ne v4, v9, :cond_1

    .line 93
    .line 94
    add-int/lit8 v4, v2, 0x4

    .line 95
    .line 96
    invoke-virtual {v11, v4}, LQ1/o;->G(I)V

    .line 97
    .line 98
    .line 99
    invoke-static {v11}, LY2/t;->c(LQ1/o;)J

    .line 100
    .line 101
    .line 102
    move-result-wide v12

    .line 103
    cmp-long v4, v12, v7

    .line 104
    .line 105
    if-eqz v4, :cond_1

    .line 106
    .line 107
    move-wide v7, v12

    .line 108
    goto :goto_1

    .line 109
    :cond_1
    add-int/lit8 v2, v2, -0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_2
    :goto_1
    iput-wide v7, v10, LY2/t;->h:J

    .line 113
    .line 114
    iput-boolean v3, v10, LY2/t;->f:Z

    .line 115
    .line 116
    return v5

    .line 117
    :cond_3
    iget-wide v14, v10, LY2/t;->h:J

    .line 118
    .line 119
    cmp-long v2, v14, v7

    .line 120
    .line 121
    if-nez v2, :cond_4

    .line 122
    .line 123
    move-object/from16 v1, p1

    .line 124
    .line 125
    check-cast v1, Ls2/j;

    .line 126
    .line 127
    invoke-virtual {v10, v1}, LY2/t;->a(Ls2/j;)V

    .line 128
    .line 129
    .line 130
    return v5

    .line 131
    :cond_4
    iget-boolean v2, v10, LY2/t;->e:Z

    .line 132
    .line 133
    if-nez v2, :cond_8

    .line 134
    .line 135
    move-object/from16 v2, p1

    .line 136
    .line 137
    check-cast v2, Ls2/j;

    .line 138
    .line 139
    iget-wide v14, v2, Ls2/j;->c:J

    .line 140
    .line 141
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->min(JJ)J

    .line 142
    .line 143
    .line 144
    move-result-wide v12

    .line 145
    long-to-int v4, v12

    .line 146
    iget-wide v12, v2, Ls2/j;->d:J

    .line 147
    .line 148
    int-to-long v14, v5

    .line 149
    cmp-long v12, v12, v14

    .line 150
    .line 151
    if-eqz v12, :cond_5

    .line 152
    .line 153
    iput-wide v14, v1, LJ5/n;->a:J

    .line 154
    .line 155
    return v3

    .line 156
    :cond_5
    invoke-virtual {v11, v4}, LQ1/o;->D(I)V

    .line 157
    .line 158
    .line 159
    iput v5, v2, Ls2/j;->f:I

    .line 160
    .line 161
    iget-object v1, v11, LQ1/o;->a:[B

    .line 162
    .line 163
    invoke-virtual {v2, v1, v5, v4, v5}, Ls2/j;->c([BIIZ)Z

    .line 164
    .line 165
    .line 166
    iget v1, v11, LQ1/o;->b:I

    .line 167
    .line 168
    iget v2, v11, LQ1/o;->c:I

    .line 169
    .line 170
    :goto_2
    add-int/lit8 v4, v2, -0x3

    .line 171
    .line 172
    if-ge v1, v4, :cond_7

    .line 173
    .line 174
    iget-object v4, v11, LQ1/o;->a:[B

    .line 175
    .line 176
    invoke-static {v1, v4}, LY2/t;->b(I[B)I

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    if-ne v4, v9, :cond_6

    .line 181
    .line 182
    add-int/lit8 v4, v1, 0x4

    .line 183
    .line 184
    invoke-virtual {v11, v4}, LQ1/o;->G(I)V

    .line 185
    .line 186
    .line 187
    invoke-static {v11}, LY2/t;->c(LQ1/o;)J

    .line 188
    .line 189
    .line 190
    move-result-wide v12

    .line 191
    cmp-long v4, v12, v7

    .line 192
    .line 193
    if-eqz v4, :cond_6

    .line 194
    .line 195
    move-wide v7, v12

    .line 196
    goto :goto_3

    .line 197
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_7
    :goto_3
    iput-wide v7, v10, LY2/t;->g:J

    .line 201
    .line 202
    iput-boolean v3, v10, LY2/t;->e:Z

    .line 203
    .line 204
    return v5

    .line 205
    :cond_8
    iget-wide v1, v10, LY2/t;->g:J

    .line 206
    .line 207
    cmp-long v3, v1, v7

    .line 208
    .line 209
    if-nez v3, :cond_9

    .line 210
    .line 211
    move-object/from16 v1, p1

    .line 212
    .line 213
    check-cast v1, Ls2/j;

    .line 214
    .line 215
    invoke-virtual {v10, v1}, LY2/t;->a(Ls2/j;)V

    .line 216
    .line 217
    .line 218
    return v5

    .line 219
    :cond_9
    iget-object v3, v10, LY2/t;->b:LQ1/u;

    .line 220
    .line 221
    invoke-virtual {v3, v1, v2}, LQ1/u;->b(J)J

    .line 222
    .line 223
    .line 224
    move-result-wide v1

    .line 225
    iget-wide v6, v10, LY2/t;->h:J

    .line 226
    .line 227
    invoke-virtual {v3, v6, v7}, LQ1/u;->c(J)J

    .line 228
    .line 229
    .line 230
    move-result-wide v3

    .line 231
    sub-long/2addr v3, v1

    .line 232
    iput-wide v3, v10, LY2/t;->i:J

    .line 233
    .line 234
    move-object/from16 v1, p1

    .line 235
    .line 236
    check-cast v1, Ls2/j;

    .line 237
    .line 238
    invoke-virtual {v10, v1}, LY2/t;->a(Ls2/j;)V

    .line 239
    .line 240
    .line 241
    return v5

    .line 242
    :cond_a
    iget-boolean v11, v0, LY2/v;->k:Z

    .line 243
    .line 244
    if-nez v11, :cond_c

    .line 245
    .line 246
    iput-boolean v3, v0, LY2/v;->k:Z

    .line 247
    .line 248
    move-wide v14, v7

    .line 249
    move v8, v6

    .line 250
    iget-wide v6, v10, LY2/t;->i:J

    .line 251
    .line 252
    cmp-long v11, v6, v14

    .line 253
    .line 254
    if-eqz v11, :cond_b

    .line 255
    .line 256
    move v11, v3

    .line 257
    new-instance v3, LY2/s;

    .line 258
    .line 259
    move v14, v4

    .line 260
    new-instance v4, La9/a;

    .line 261
    .line 262
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 263
    .line 264
    .line 265
    move v15, v5

    .line 266
    new-instance v5, LX2/j;

    .line 267
    .line 268
    iget-object v10, v10, LY2/t;->b:LQ1/u;

    .line 269
    .line 270
    invoke-direct {v5, v10}, LX2/j;-><init>(LQ1/u;)V

    .line 271
    .line 272
    .line 273
    const-wide/16 v19, 0x1

    .line 274
    .line 275
    add-long v19, v6, v19

    .line 276
    .line 277
    const/16 v16, 0x3e8

    .line 278
    .line 279
    move/from16 v21, v11

    .line 280
    .line 281
    const-wide/16 v10, 0x0

    .line 282
    .line 283
    move/from16 v22, v14

    .line 284
    .line 285
    move/from16 v23, v15

    .line 286
    .line 287
    const-wide/16 v14, 0xbc

    .line 288
    .line 289
    move/from16 v24, v2

    .line 290
    .line 291
    move-wide/from16 v8, v19

    .line 292
    .line 293
    move/from16 v2, v23

    .line 294
    .line 295
    invoke-direct/range {v3 .. v16}, LJ5/f;-><init>(Ls2/e;Ls2/g;JJJJJI)V

    .line 296
    .line 297
    .line 298
    iput-object v3, v0, LY2/v;->i:LY2/s;

    .line 299
    .line 300
    iget-object v4, v0, LY2/v;->j:Ls2/o;

    .line 301
    .line 302
    iget-object v3, v3, LJ5/f;->c:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v3, Ls2/d;

    .line 305
    .line 306
    invoke-interface {v4, v3}, Ls2/o;->s(Ls2/w;)V

    .line 307
    .line 308
    .line 309
    goto :goto_4

    .line 310
    :cond_b
    move/from16 v24, v2

    .line 311
    .line 312
    move v2, v5

    .line 313
    iget-object v3, v0, LY2/v;->j:Ls2/o;

    .line 314
    .line 315
    new-instance v4, Ls2/q;

    .line 316
    .line 317
    invoke-direct {v4, v6, v7}, Ls2/q;-><init>(J)V

    .line 318
    .line 319
    .line 320
    invoke-interface {v3, v4}, Ls2/o;->s(Ls2/w;)V

    .line 321
    .line 322
    .line 323
    goto :goto_4

    .line 324
    :cond_c
    move/from16 v24, v2

    .line 325
    .line 326
    move v2, v5

    .line 327
    :goto_4
    iget-object v3, v0, LY2/v;->i:LY2/s;

    .line 328
    .line 329
    if-eqz v3, :cond_d

    .line 330
    .line 331
    iget-object v4, v3, LJ5/f;->e:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v4, LJ5/b;

    .line 334
    .line 335
    if-eqz v4, :cond_d

    .line 336
    .line 337
    move-object/from16 v2, p1

    .line 338
    .line 339
    check-cast v2, Ls2/j;

    .line 340
    .line 341
    invoke-virtual {v3, v2, v1}, LJ5/f;->v(Ls2/j;LJ5/n;)I

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    return v1

    .line 346
    :cond_d
    move-object/from16 v1, p1

    .line 347
    .line 348
    check-cast v1, Ls2/j;

    .line 349
    .line 350
    iput v2, v1, Ls2/j;->f:I

    .line 351
    .line 352
    if-eqz v24, :cond_e

    .line 353
    .line 354
    invoke-virtual {v1}, Ls2/j;->g()J

    .line 355
    .line 356
    .line 357
    move-result-wide v3

    .line 358
    sub-long/2addr v12, v3

    .line 359
    goto :goto_5

    .line 360
    :cond_e
    move-wide/from16 v12, v17

    .line 361
    .line 362
    :goto_5
    cmp-long v3, v12, v17

    .line 363
    .line 364
    if-eqz v3, :cond_f

    .line 365
    .line 366
    const-wide/16 v3, 0x4

    .line 367
    .line 368
    cmp-long v3, v12, v3

    .line 369
    .line 370
    if-gez v3, :cond_f

    .line 371
    .line 372
    goto :goto_6

    .line 373
    :cond_f
    iget-object v3, v0, LY2/v;->c:LQ1/o;

    .line 374
    .line 375
    iget-object v4, v3, LQ1/o;->a:[B

    .line 376
    .line 377
    const/4 v11, 0x1

    .line 378
    const/4 v14, 0x4

    .line 379
    invoke-virtual {v1, v4, v2, v14, v11}, Ls2/j;->c([BIIZ)Z

    .line 380
    .line 381
    .line 382
    move-result v4

    .line 383
    if-nez v4, :cond_10

    .line 384
    .line 385
    goto :goto_6

    .line 386
    :cond_10
    invoke-virtual {v3, v2}, LQ1/o;->G(I)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v3}, LQ1/o;->h()I

    .line 390
    .line 391
    .line 392
    move-result v4

    .line 393
    const/16 v5, 0x1b9

    .line 394
    .line 395
    if-ne v4, v5, :cond_11

    .line 396
    .line 397
    :goto_6
    const/4 v1, -0x1

    .line 398
    return v1

    .line 399
    :cond_11
    const/16 v5, 0x1ba

    .line 400
    .line 401
    if-ne v4, v5, :cond_12

    .line 402
    .line 403
    iget-object v4, v3, LQ1/o;->a:[B

    .line 404
    .line 405
    const/16 v5, 0xa

    .line 406
    .line 407
    invoke-virtual {v1, v4, v2, v5, v2}, Ls2/j;->c([BIIZ)Z

    .line 408
    .line 409
    .line 410
    const/16 v4, 0x9

    .line 411
    .line 412
    invoke-virtual {v3, v4}, LQ1/o;->G(I)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v3}, LQ1/o;->u()I

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    and-int/lit8 v3, v3, 0x7

    .line 420
    .line 421
    add-int/lit8 v3, v3, 0xe

    .line 422
    .line 423
    invoke-virtual {v1, v3}, Ls2/j;->j(I)V

    .line 424
    .line 425
    .line 426
    return v2

    .line 427
    :cond_12
    const/16 v5, 0x1bb

    .line 428
    .line 429
    const/4 v6, 0x2

    .line 430
    const/4 v7, 0x6

    .line 431
    if-ne v4, v5, :cond_13

    .line 432
    .line 433
    iget-object v4, v3, LQ1/o;->a:[B

    .line 434
    .line 435
    invoke-virtual {v1, v4, v2, v6, v2}, Ls2/j;->c([BIIZ)Z

    .line 436
    .line 437
    .line 438
    invoke-virtual {v3, v2}, LQ1/o;->G(I)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v3}, LQ1/o;->A()I

    .line 442
    .line 443
    .line 444
    move-result v3

    .line 445
    add-int/2addr v3, v7

    .line 446
    invoke-virtual {v1, v3}, Ls2/j;->j(I)V

    .line 447
    .line 448
    .line 449
    return v2

    .line 450
    :cond_13
    and-int/lit16 v5, v4, -0x100

    .line 451
    .line 452
    const/16 v8, 0x8

    .line 453
    .line 454
    shr-int/2addr v5, v8

    .line 455
    const/4 v11, 0x1

    .line 456
    if-eq v5, v11, :cond_14

    .line 457
    .line 458
    invoke-virtual {v1, v11}, Ls2/j;->j(I)V

    .line 459
    .line 460
    .line 461
    return v2

    .line 462
    :cond_14
    and-int/lit16 v5, v4, 0xff

    .line 463
    .line 464
    iget-object v9, v0, LY2/v;->b:Landroid/util/SparseArray;

    .line 465
    .line 466
    invoke-virtual {v9, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v10

    .line 470
    check-cast v10, LY2/u;

    .line 471
    .line 472
    iget-boolean v11, v0, LY2/v;->e:Z

    .line 473
    .line 474
    if-nez v11, :cond_1a

    .line 475
    .line 476
    if-nez v10, :cond_18

    .line 477
    .line 478
    const/16 v11, 0xbd

    .line 479
    .line 480
    if-ne v5, v11, :cond_15

    .line 481
    .line 482
    new-instance v4, LY2/b;

    .line 483
    .line 484
    invoke-direct {v4}, LY2/b;-><init>()V

    .line 485
    .line 486
    .line 487
    const/4 v11, 0x1

    .line 488
    iput-boolean v11, v0, LY2/v;->f:Z

    .line 489
    .line 490
    iget-wide v11, v1, Ls2/j;->d:J

    .line 491
    .line 492
    iput-wide v11, v0, LY2/v;->h:J

    .line 493
    .line 494
    goto :goto_7

    .line 495
    :cond_15
    and-int/lit16 v11, v4, 0xe0

    .line 496
    .line 497
    const/16 v12, 0xc0

    .line 498
    .line 499
    const/4 v13, 0x0

    .line 500
    if-ne v11, v12, :cond_16

    .line 501
    .line 502
    new-instance v4, LY2/o;

    .line 503
    .line 504
    invoke-direct {v4, v13, v2}, LY2/o;-><init>(Ljava/lang/String;I)V

    .line 505
    .line 506
    .line 507
    const/4 v11, 0x1

    .line 508
    iput-boolean v11, v0, LY2/v;->f:Z

    .line 509
    .line 510
    iget-wide v11, v1, Ls2/j;->d:J

    .line 511
    .line 512
    iput-wide v11, v0, LY2/v;->h:J

    .line 513
    .line 514
    goto :goto_7

    .line 515
    :cond_16
    and-int/lit16 v4, v4, 0xf0

    .line 516
    .line 517
    const/16 v11, 0xe0

    .line 518
    .line 519
    if-ne v4, v11, :cond_17

    .line 520
    .line 521
    new-instance v4, LY2/j;

    .line 522
    .line 523
    invoke-direct {v4, v13}, LY2/j;-><init>(LY2/B;)V

    .line 524
    .line 525
    .line 526
    const/4 v11, 0x1

    .line 527
    iput-boolean v11, v0, LY2/v;->g:Z

    .line 528
    .line 529
    iget-wide v11, v1, Ls2/j;->d:J

    .line 530
    .line 531
    iput-wide v11, v0, LY2/v;->h:J

    .line 532
    .line 533
    goto :goto_7

    .line 534
    :cond_17
    move-object v4, v13

    .line 535
    :goto_7
    if-eqz v4, :cond_18

    .line 536
    .line 537
    new-instance v10, LT5/B;

    .line 538
    .line 539
    const/16 v11, 0x100

    .line 540
    .line 541
    const/4 v12, 0x1

    .line 542
    const/4 v13, 0x0

    .line 543
    invoke-direct {v10, v5, v11, v12, v13}, LT5/B;-><init>(IIIB)V

    .line 544
    .line 545
    .line 546
    iget-object v11, v0, LY2/v;->j:Ls2/o;

    .line 547
    .line 548
    invoke-interface {v4, v11, v10}, LY2/h;->f(Ls2/o;LT5/B;)V

    .line 549
    .line 550
    .line 551
    new-instance v10, LY2/u;

    .line 552
    .line 553
    iget-object v11, v0, LY2/v;->a:LQ1/u;

    .line 554
    .line 555
    invoke-direct {v10, v4, v11}, LY2/u;-><init>(LY2/h;LQ1/u;)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v9, v5, v10}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    :cond_18
    iget-boolean v4, v0, LY2/v;->f:Z

    .line 562
    .line 563
    if-eqz v4, :cond_19

    .line 564
    .line 565
    iget-boolean v4, v0, LY2/v;->g:Z

    .line 566
    .line 567
    if-eqz v4, :cond_19

    .line 568
    .line 569
    iget-wide v4, v0, LY2/v;->h:J

    .line 570
    .line 571
    const-wide/16 v11, 0x2000

    .line 572
    .line 573
    add-long/2addr v4, v11

    .line 574
    goto :goto_8

    .line 575
    :cond_19
    const-wide/32 v4, 0x100000

    .line 576
    .line 577
    .line 578
    :goto_8
    iget-wide v11, v1, Ls2/j;->d:J

    .line 579
    .line 580
    cmp-long v4, v11, v4

    .line 581
    .line 582
    if-lez v4, :cond_1a

    .line 583
    .line 584
    const/4 v11, 0x1

    .line 585
    iput-boolean v11, v0, LY2/v;->e:Z

    .line 586
    .line 587
    iget-object v4, v0, LY2/v;->j:Ls2/o;

    .line 588
    .line 589
    invoke-interface {v4}, Ls2/o;->l()V

    .line 590
    .line 591
    .line 592
    :cond_1a
    iget-object v4, v3, LQ1/o;->a:[B

    .line 593
    .line 594
    invoke-virtual {v1, v4, v2, v6, v2}, Ls2/j;->c([BIIZ)Z

    .line 595
    .line 596
    .line 597
    invoke-virtual {v3, v2}, LQ1/o;->G(I)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v3}, LQ1/o;->A()I

    .line 601
    .line 602
    .line 603
    move-result v4

    .line 604
    add-int/2addr v4, v7

    .line 605
    if-nez v10, :cond_1b

    .line 606
    .line 607
    invoke-virtual {v1, v4}, Ls2/j;->j(I)V

    .line 608
    .line 609
    .line 610
    return v2

    .line 611
    :cond_1b
    invoke-virtual {v3, v4}, LQ1/o;->D(I)V

    .line 612
    .line 613
    .line 614
    iget-object v5, v3, LQ1/o;->a:[B

    .line 615
    .line 616
    invoke-virtual {v1, v5, v2, v4, v2}, Ls2/j;->f([BIIZ)Z

    .line 617
    .line 618
    .line 619
    invoke-virtual {v3, v7}, LQ1/o;->G(I)V

    .line 620
    .line 621
    .line 622
    iget-object v1, v10, LY2/u;->c:LJ5/y;

    .line 623
    .line 624
    iget-object v4, v1, LJ5/y;->b:[B

    .line 625
    .line 626
    const/4 v5, 0x3

    .line 627
    invoke-virtual {v3, v2, v5, v4}, LQ1/o;->f(II[B)V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v1, v2}, LJ5/y;->q(I)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v1, v8}, LJ5/y;->t(I)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v1}, LJ5/y;->h()Z

    .line 637
    .line 638
    .line 639
    move-result v4

    .line 640
    iput-boolean v4, v10, LY2/u;->d:Z

    .line 641
    .line 642
    invoke-virtual {v1}, LJ5/y;->h()Z

    .line 643
    .line 644
    .line 645
    move-result v4

    .line 646
    iput-boolean v4, v10, LY2/u;->e:Z

    .line 647
    .line 648
    invoke-virtual {v1, v7}, LJ5/y;->t(I)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v1, v8}, LJ5/y;->i(I)I

    .line 652
    .line 653
    .line 654
    move-result v4

    .line 655
    iget-object v6, v1, LJ5/y;->b:[B

    .line 656
    .line 657
    invoke-virtual {v3, v2, v4, v6}, LQ1/o;->f(II[B)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v1, v2}, LJ5/y;->q(I)V

    .line 661
    .line 662
    .line 663
    const-wide/16 v6, 0x0

    .line 664
    .line 665
    iput-wide v6, v10, LY2/u;->g:J

    .line 666
    .line 667
    iget-boolean v4, v10, LY2/u;->d:Z

    .line 668
    .line 669
    if-eqz v4, :cond_1d

    .line 670
    .line 671
    invoke-virtual {v1, v14}, LJ5/y;->t(I)V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v1, v5}, LJ5/y;->i(I)I

    .line 675
    .line 676
    .line 677
    move-result v4

    .line 678
    int-to-long v6, v4

    .line 679
    const/16 v4, 0x1e

    .line 680
    .line 681
    shl-long/2addr v6, v4

    .line 682
    const/4 v11, 0x1

    .line 683
    invoke-virtual {v1, v11}, LJ5/y;->t(I)V

    .line 684
    .line 685
    .line 686
    const/16 v8, 0xf

    .line 687
    .line 688
    invoke-virtual {v1, v8}, LJ5/y;->i(I)I

    .line 689
    .line 690
    .line 691
    move-result v9

    .line 692
    shl-int/2addr v9, v8

    .line 693
    int-to-long v12, v9

    .line 694
    or-long/2addr v6, v12

    .line 695
    invoke-virtual {v1, v11}, LJ5/y;->t(I)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v1, v8}, LJ5/y;->i(I)I

    .line 699
    .line 700
    .line 701
    move-result v9

    .line 702
    int-to-long v12, v9

    .line 703
    or-long/2addr v6, v12

    .line 704
    invoke-virtual {v1, v11}, LJ5/y;->t(I)V

    .line 705
    .line 706
    .line 707
    iget-boolean v9, v10, LY2/u;->f:Z

    .line 708
    .line 709
    iget-object v12, v10, LY2/u;->b:LQ1/u;

    .line 710
    .line 711
    if-nez v9, :cond_1c

    .line 712
    .line 713
    iget-boolean v9, v10, LY2/u;->e:Z

    .line 714
    .line 715
    if-eqz v9, :cond_1c

    .line 716
    .line 717
    invoke-virtual {v1, v14}, LJ5/y;->t(I)V

    .line 718
    .line 719
    .line 720
    invoke-virtual {v1, v5}, LJ5/y;->i(I)I

    .line 721
    .line 722
    .line 723
    move-result v5

    .line 724
    move/from16 p1, v4

    .line 725
    .line 726
    int-to-long v4, v5

    .line 727
    shl-long v4, v4, p1

    .line 728
    .line 729
    invoke-virtual {v1, v11}, LJ5/y;->t(I)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v1, v8}, LJ5/y;->i(I)I

    .line 733
    .line 734
    .line 735
    move-result v9

    .line 736
    shl-int/2addr v9, v8

    .line 737
    move-object v13, v3

    .line 738
    int-to-long v2, v9

    .line 739
    or-long/2addr v2, v4

    .line 740
    invoke-virtual {v1, v11}, LJ5/y;->t(I)V

    .line 741
    .line 742
    .line 743
    invoke-virtual {v1, v8}, LJ5/y;->i(I)I

    .line 744
    .line 745
    .line 746
    move-result v4

    .line 747
    int-to-long v4, v4

    .line 748
    or-long/2addr v2, v4

    .line 749
    invoke-virtual {v1, v11}, LJ5/y;->t(I)V

    .line 750
    .line 751
    .line 752
    invoke-virtual {v12, v2, v3}, LQ1/u;->b(J)J

    .line 753
    .line 754
    .line 755
    iput-boolean v11, v10, LY2/u;->f:Z

    .line 756
    .line 757
    goto :goto_9

    .line 758
    :cond_1c
    move-object v13, v3

    .line 759
    :goto_9
    invoke-virtual {v12, v6, v7}, LQ1/u;->b(J)J

    .line 760
    .line 761
    .line 762
    move-result-wide v1

    .line 763
    iput-wide v1, v10, LY2/u;->g:J

    .line 764
    .line 765
    goto :goto_a

    .line 766
    :cond_1d
    move-object v13, v3

    .line 767
    :goto_a
    iget-wide v1, v10, LY2/u;->g:J

    .line 768
    .line 769
    iget-object v3, v10, LY2/u;->a:LY2/h;

    .line 770
    .line 771
    invoke-interface {v3, v14, v1, v2}, LY2/h;->d(IJ)V

    .line 772
    .line 773
    .line 774
    invoke-interface {v3, v13}, LY2/h;->e(LQ1/o;)V

    .line 775
    .line 776
    .line 777
    const/4 v15, 0x0

    .line 778
    invoke-interface {v3, v15}, LY2/h;->h(Z)V

    .line 779
    .line 780
    .line 781
    iget-object v1, v13, LQ1/o;->a:[B

    .line 782
    .line 783
    array-length v1, v1

    .line 784
    invoke-virtual {v13, v1}, LQ1/o;->F(I)V

    .line 785
    .line 786
    .line 787
    return v15
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
