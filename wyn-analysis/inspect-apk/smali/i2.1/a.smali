.class public final Li2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll2/i;


# instance fields
.field public final a:Lo2/n;

.field public final b:I

.field public final c:[Ll2/f;

.field public final d:LS1/h;

.field public e:Ln2/q;

.field public f:Lj2/c;

.field public g:I

.field public h:Lk2/b;


# direct methods
.method public constructor <init>(Lo2/n;Lj2/c;ILn2/q;LS1/h;Lwa/a;Z)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    move-object/from16 v4, p1

    .line 13
    .line 14
    iput-object v4, v0, Li2/a;->a:Lo2/n;

    .line 15
    .line 16
    iput-object v1, v0, Li2/a;->f:Lj2/c;

    .line 17
    .line 18
    iput v2, v0, Li2/a;->b:I

    .line 19
    .line 20
    iput-object v3, v0, Li2/a;->e:Ln2/q;

    .line 21
    .line 22
    move-object/from16 v4, p5

    .line 23
    .line 24
    iput-object v4, v0, Li2/a;->d:LS1/h;

    .line 25
    .line 26
    iget-object v4, v1, Lj2/c;->f:[Lj2/b;

    .line 27
    .line 28
    aget-object v2, v4, v2

    .line 29
    .line 30
    invoke-interface {v3}, Ln2/q;->length()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    new-array v4, v4, [Ll2/f;

    .line 35
    .line 36
    iput-object v4, v0, Li2/a;->c:[Ll2/f;

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    move v5, v4

    .line 40
    :goto_0
    iget-object v6, v0, Li2/a;->c:[Ll2/f;

    .line 41
    .line 42
    array-length v6, v6

    .line 43
    if-ge v5, v6, :cond_3

    .line 44
    .line 45
    invoke-interface {v3, v5}, Ln2/q;->c(I)I

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    iget-object v6, v2, Lj2/b;->j:[LN1/n;

    .line 50
    .line 51
    aget-object v6, v6, v8

    .line 52
    .line 53
    iget-object v7, v6, LN1/n;->r:LN1/j;

    .line 54
    .line 55
    if-eqz v7, :cond_0

    .line 56
    .line 57
    iget-object v7, v1, Lj2/c;->e:Lj2/a;

    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v7, v7, Lj2/a;->c:[LM2/t;

    .line 63
    .line 64
    :goto_1
    move-object/from16 v20, v7

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_0
    const/4 v7, 0x0

    .line 68
    goto :goto_1

    .line 69
    :goto_2
    const/4 v7, 0x2

    .line 70
    iget v9, v2, Lj2/b;->a:I

    .line 71
    .line 72
    if-ne v9, v7, :cond_1

    .line 73
    .line 74
    const/4 v7, 0x4

    .line 75
    move/from16 v21, v7

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_1
    move/from16 v21, v4

    .line 79
    .line 80
    :goto_3
    new-instance v14, LM2/s;

    .line 81
    .line 82
    move-object v7, v14

    .line 83
    iget-wide v14, v1, Lj2/c;->g:J

    .line 84
    .line 85
    const/16 v19, 0x0

    .line 86
    .line 87
    iget-wide v10, v2, Lj2/b;->c:J

    .line 88
    .line 89
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    const/16 v22, 0x0

    .line 95
    .line 96
    const/16 v23, 0x0

    .line 97
    .line 98
    move-wide/from16 v16, v14

    .line 99
    .line 100
    move-object/from16 v18, v6

    .line 101
    .line 102
    invoke-direct/range {v7 .. v23}, LM2/s;-><init>(IIJJJJLN1/n;I[LM2/t;I[J[J)V

    .line 103
    .line 104
    .line 105
    if-nez p7, :cond_2

    .line 106
    .line 107
    const/16 v8, 0x23

    .line 108
    .line 109
    :goto_4
    move v12, v8

    .line 110
    goto :goto_5

    .line 111
    :cond_2
    const/4 v8, 0x3

    .line 112
    goto :goto_4

    .line 113
    :goto_5
    new-instance v10, LM2/l;

    .line 114
    .line 115
    sget-object v15, Ll8/e0;->e:Ll8/e0;

    .line 116
    .line 117
    const/16 v16, 0x0

    .line 118
    .line 119
    const/4 v13, 0x0

    .line 120
    move-object/from16 v11, p6

    .line 121
    .line 122
    move-object v14, v7

    .line 123
    invoke-direct/range {v10 .. v16}, LM2/l;-><init>(LP2/j;ILQ1/u;LM2/s;Ljava/util/List;LX1/l;)V

    .line 124
    .line 125
    .line 126
    iget-object v7, v0, Li2/a;->c:[Ll2/f;

    .line 127
    .line 128
    new-instance v8, Ll2/d;

    .line 129
    .line 130
    iget v9, v2, Lj2/b;->a:I

    .line 131
    .line 132
    invoke-direct {v8, v10, v9, v6}, Ll2/d;-><init>(Ls2/m;ILN1/n;)V

    .line 133
    .line 134
    .line 135
    aput-object v8, v7, v5

    .line 136
    .line 137
    add-int/lit8 v5, v5, 0x1

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_3
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Li2/a;->h:Lk2/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Li2/a;->a:Lo2/n;

    .line 6
    .line 7
    invoke-interface {v0}, Lo2/n;->a()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    throw v0
.end method

.method public final b(JLU1/a0;)J
    .locals 11

    .line 1
    iget-object v0, p0, Li2/a;->f:Lj2/c;

    .line 2
    .line 3
    iget-object v0, v0, Lj2/c;->f:[Lj2/b;

    .line 4
    .line 5
    iget v1, p0, Li2/a;->b:I

    .line 6
    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    iget-object v1, v0, Lj2/b;->o:[J

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-static {v1, p1, p2, v2}, LQ1/x;->e([JJZ)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v3, v0, Lj2/b;->o:[J

    .line 17
    .line 18
    aget-wide v7, v3, v1

    .line 19
    .line 20
    cmp-long v4, v7, p1

    .line 21
    .line 22
    if-gez v4, :cond_0

    .line 23
    .line 24
    iget v0, v0, Lj2/b;->k:I

    .line 25
    .line 26
    sub-int/2addr v0, v2

    .line 27
    if-ge v1, v0, :cond_0

    .line 28
    .line 29
    add-int/2addr v1, v2

    .line 30
    aget-wide v0, v3, v1

    .line 31
    .line 32
    move-wide v9, v0

    .line 33
    :goto_0
    move-wide v5, p1

    .line 34
    move-object v4, p3

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    move-wide v9, v7

    .line 37
    goto :goto_0

    .line 38
    :goto_1
    invoke-virtual/range {v4 .. v10}, LU1/a0;->a(JJJ)J

    .line 39
    .line 40
    .line 41
    move-result-wide p1

    .line 42
    return-wide p1
.end method

.method public final c(Ll2/e;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final d(JLl2/e;Ljava/util/List;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Li2/a;->h:Lk2/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    iget-object v0, p0, Li2/a;->e:Ln2/q;

    .line 8
    .line 9
    invoke-interface {v0, p1, p2, p3, p4}, Ln2/q;->r(JLl2/e;Ljava/util/List;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final e(Ll2/e;ZLA/x;Lae/d;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Li2/a;->e:Ln2/q;

    .line 2
    .line 3
    invoke-static {v0}, Lff/B;->o(Ln2/q;)LF6/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p3}, Lae/d;->f(LF6/p;LA/x;)LU5/f;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    iget p2, p3, LU5/f;->a:I

    .line 19
    .line 20
    const/4 p4, 0x2

    .line 21
    if-ne p2, p4, :cond_0

    .line 22
    .line 23
    iget-object p2, p0, Li2/a;->e:Ln2/q;

    .line 24
    .line 25
    iget-object p1, p1, Ll2/e;->d:LN1/n;

    .line 26
    .line 27
    invoke-interface {p2, p1}, Ln2/q;->q(LN1/n;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget-wide p3, p3, LU5/f;->b:J

    .line 32
    .line 33
    invoke-interface {p2, p1, p3, p4}, Ln2/q;->o(IJ)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_0
    const/4 p1, 0x0

    .line 42
    return p1
.end method

.method public final f(LU1/C;JLjava/util/List;LE4/F;)V
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v3, p5

    .line 6
    .line 7
    iget-object v4, v0, Li2/a;->h:Lk2/b;

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v4, v0, Li2/a;->f:Lj2/c;

    .line 13
    .line 14
    iget-object v5, v4, Lj2/c;->f:[Lj2/b;

    .line 15
    .line 16
    iget v6, v0, Li2/a;->b:I

    .line 17
    .line 18
    aget-object v5, v5, v6

    .line 19
    .line 20
    iget v7, v5, Lj2/b;->k:I

    .line 21
    .line 22
    const/4 v8, 0x1

    .line 23
    if-nez v7, :cond_1

    .line 24
    .line 25
    iget-boolean v1, v4, Lj2/c;->d:Z

    .line 26
    .line 27
    xor-int/2addr v1, v8

    .line 28
    iput-boolean v1, v3, LE4/F;->b:Z

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    iget-object v7, v5, Lj2/b;->o:[J

    .line 36
    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    invoke-static {v7, v1, v2, v8}, LQ1/x;->e([JJZ)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    move v9, v4

    .line 44
    move-object/from16 v4, p4

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move-object/from16 v4, p4

    .line 48
    .line 49
    invoke-static {v8, v4}, LVa/M6;->k(ILjava/util/List;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    check-cast v9, Ll2/l;

    .line 54
    .line 55
    invoke-virtual {v9}, Ll2/l;->a()J

    .line 56
    .line 57
    .line 58
    move-result-wide v9

    .line 59
    iget v11, v0, Li2/a;->g:I

    .line 60
    .line 61
    int-to-long v11, v11

    .line 62
    sub-long/2addr v9, v11

    .line 63
    long-to-int v9, v9

    .line 64
    if-gez v9, :cond_3

    .line 65
    .line 66
    new-instance v1, Lk2/b;

    .line 67
    .line 68
    invoke-direct {v1}, Ljava/io/IOException;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v1, v0, Li2/a;->h:Lk2/b;

    .line 72
    .line 73
    return-void

    .line 74
    :cond_3
    :goto_0
    iget v10, v5, Lj2/b;->k:I

    .line 75
    .line 76
    if-lt v9, v10, :cond_4

    .line 77
    .line 78
    iget-object v1, v0, Li2/a;->f:Lj2/c;

    .line 79
    .line 80
    iget-boolean v1, v1, Lj2/c;->d:Z

    .line 81
    .line 82
    xor-int/2addr v1, v8

    .line 83
    iput-boolean v1, v3, LE4/F;->b:Z

    .line 84
    .line 85
    return-void

    .line 86
    :cond_4
    move-object/from16 v10, p1

    .line 87
    .line 88
    iget-wide v10, v10, LU1/C;->a:J

    .line 89
    .line 90
    sub-long v12, v1, v10

    .line 91
    .line 92
    iget-object v14, v0, Li2/a;->f:Lj2/c;

    .line 93
    .line 94
    iget-boolean v15, v14, Lj2/c;->d:Z

    .line 95
    .line 96
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    if-nez v15, :cond_5

    .line 102
    .line 103
    move-wide/from16 v14, v18

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_5
    iget-object v14, v14, Lj2/c;->f:[Lj2/b;

    .line 107
    .line 108
    aget-object v6, v14, v6

    .line 109
    .line 110
    iget v14, v6, Lj2/b;->k:I

    .line 111
    .line 112
    sub-int/2addr v14, v8

    .line 113
    iget-object v15, v6, Lj2/b;->o:[J

    .line 114
    .line 115
    aget-wide v16, v15, v14

    .line 116
    .line 117
    invoke-virtual {v6, v14}, Lj2/b;->b(I)J

    .line 118
    .line 119
    .line 120
    move-result-wide v14

    .line 121
    add-long v14, v14, v16

    .line 122
    .line 123
    sub-long/2addr v14, v10

    .line 124
    :goto_1
    iget-object v6, v0, Li2/a;->e:Ln2/q;

    .line 125
    .line 126
    invoke-interface {v6}, Ln2/q;->length()I

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    new-array v8, v6, [Ll2/m;

    .line 131
    .line 132
    const/16 v21, 0x0

    .line 133
    .line 134
    move/from16 v1, v21

    .line 135
    .line 136
    :goto_2
    if-ge v1, v6, :cond_6

    .line 137
    .line 138
    iget-object v2, v0, Li2/a;->e:Ln2/q;

    .line 139
    .line 140
    invoke-interface {v2, v1}, Ln2/q;->c(I)I

    .line 141
    .line 142
    .line 143
    new-instance v2, LX1/h;

    .line 144
    .line 145
    invoke-direct {v2, v5, v9}, LX1/h;-><init>(Lj2/b;I)V

    .line 146
    .line 147
    .line 148
    aput-object v2, v8, v1

    .line 149
    .line 150
    add-int/lit8 v1, v1, 0x1

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_6
    iget-object v1, v0, Li2/a;->e:Ln2/q;

    .line 154
    .line 155
    move-object/from16 v16, v4

    .line 156
    .line 157
    move-object/from16 v17, v8

    .line 158
    .line 159
    move v4, v9

    .line 160
    move-object v9, v1

    .line 161
    invoke-interface/range {v9 .. v17}, Ln2/q;->l(JJJLjava/util/List;[Ll2/m;)V

    .line 162
    .line 163
    .line 164
    aget-wide v28, v7, v4

    .line 165
    .line 166
    invoke-virtual {v5, v4}, Lj2/b;->b(I)J

    .line 167
    .line 168
    .line 169
    move-result-wide v1

    .line 170
    add-long v30, v1, v28

    .line 171
    .line 172
    invoke-interface/range {p4 .. p4}, Ljava/util/List;->isEmpty()Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_7

    .line 177
    .line 178
    move-wide/from16 v32, p2

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_7
    move-wide/from16 v32, v18

    .line 182
    .line 183
    :goto_3
    iget v1, v0, Li2/a;->g:I

    .line 184
    .line 185
    add-int v9, v4, v1

    .line 186
    .line 187
    iget-object v1, v0, Li2/a;->e:Ln2/q;

    .line 188
    .line 189
    invoke-interface {v1}, Ln2/q;->n()I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    iget-object v2, v0, Li2/a;->c:[Ll2/f;

    .line 194
    .line 195
    aget-object v41, v2, v1

    .line 196
    .line 197
    iget-object v2, v0, Li2/a;->e:Ln2/q;

    .line 198
    .line 199
    invoke-interface {v2, v1}, Ln2/q;->c(I)I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    iget-object v2, v5, Lj2/b;->j:[LN1/n;

    .line 204
    .line 205
    if-eqz v2, :cond_8

    .line 206
    .line 207
    const/4 v6, 0x1

    .line 208
    goto :goto_4

    .line 209
    :cond_8
    move/from16 v6, v21

    .line 210
    .line 211
    :goto_4
    invoke-static {v6}, LQ1/k;->g(Z)V

    .line 212
    .line 213
    .line 214
    iget-object v6, v5, Lj2/b;->n:Ljava/util/ArrayList;

    .line 215
    .line 216
    if-eqz v6, :cond_9

    .line 217
    .line 218
    const/4 v7, 0x1

    .line 219
    goto :goto_5

    .line 220
    :cond_9
    move/from16 v7, v21

    .line 221
    .line 222
    :goto_5
    invoke-static {v7}, LQ1/k;->g(Z)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 226
    .line 227
    .line 228
    move-result v7

    .line 229
    if-ge v4, v7, :cond_a

    .line 230
    .line 231
    const/4 v8, 0x1

    .line 232
    goto :goto_6

    .line 233
    :cond_a
    move/from16 v8, v21

    .line 234
    .line 235
    :goto_6
    invoke-static {v8}, LQ1/k;->g(Z)V

    .line 236
    .line 237
    .line 238
    aget-object v1, v2, v1

    .line 239
    .line 240
    iget v1, v1, LN1/n;->j:I

    .line 241
    .line 242
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    check-cast v2, Ljava/lang/Long;

    .line 251
    .line 252
    invoke-virtual {v2}, Ljava/lang/Long;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    iget-object v4, v5, Lj2/b;->m:Ljava/lang/String;

    .line 257
    .line 258
    const-string v6, "{bitrate}"

    .line 259
    .line 260
    invoke-virtual {v4, v6, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    const-string v6, "{Bitrate}"

    .line 265
    .line 266
    invoke-virtual {v4, v6, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    const-string v4, "{start time}"

    .line 271
    .line 272
    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    const-string v4, "{start_time}"

    .line 277
    .line 278
    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    iget-object v2, v5, Lj2/b;->l:Ljava/lang/String;

    .line 283
    .line 284
    invoke-static {v2, v1}, LQ1/k;->u(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 285
    .line 286
    .line 287
    move-result-object v11

    .line 288
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 289
    .line 290
    .line 291
    iget-object v1, v0, Li2/a;->e:Ln2/q;

    .line 292
    .line 293
    invoke-interface {v1}, Ln2/q;->j()LN1/n;

    .line 294
    .line 295
    .line 296
    move-result-object v25

    .line 297
    iget-object v1, v0, Li2/a;->e:Ln2/q;

    .line 298
    .line 299
    invoke-interface {v1}, Ln2/q;->u()I

    .line 300
    .line 301
    .line 302
    move-result v26

    .line 303
    iget-object v1, v0, Li2/a;->e:Ln2/q;

    .line 304
    .line 305
    invoke-interface {v1}, Ln2/q;->p()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v27

    .line 309
    sget-object v14, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 310
    .line 311
    const-string v1, "The uri must be set."

    .line 312
    .line 313
    invoke-static {v11, v1}, LQ1/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    new-instance v10, LS1/k;

    .line 317
    .line 318
    const-wide/16 v17, -0x1

    .line 319
    .line 320
    const/16 v19, 0x0

    .line 321
    .line 322
    const/4 v12, 0x1

    .line 323
    const/4 v13, 0x0

    .line 324
    const-wide/16 v15, 0x0

    .line 325
    .line 326
    const/16 v20, 0x0

    .line 327
    .line 328
    invoke-direct/range {v10 .. v20}, LS1/k;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 329
    .line 330
    .line 331
    new-instance v22, Ll2/j;

    .line 332
    .line 333
    int-to-long v1, v9

    .line 334
    const-wide v34, -0x7fffffffffffffffL    # -4.9E-324

    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    iget-object v4, v0, Li2/a;->d:LS1/h;

    .line 340
    .line 341
    const/16 v38, 0x1

    .line 342
    .line 343
    move-wide/from16 v39, v28

    .line 344
    .line 345
    move-wide/from16 v36, v1

    .line 346
    .line 347
    move-object/from16 v23, v4

    .line 348
    .line 349
    move-object/from16 v24, v10

    .line 350
    .line 351
    invoke-direct/range {v22 .. v41}, Ll2/j;-><init>(LS1/h;LS1/k;LN1/n;ILjava/lang/Object;JJJJJIJLl2/f;)V

    .line 352
    .line 353
    .line 354
    move-object/from16 v1, v22

    .line 355
    .line 356
    iput-object v1, v3, LE4/F;->c:Ljava/lang/Object;

    .line 357
    .line 358
    return-void
.end method

.method public final g(JLjava/util/List;)I
    .locals 2

    .line 1
    iget-object v0, p0, Li2/a;->h:Lk2/b;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Li2/a;->e:Ln2/q;

    .line 6
    .line 7
    invoke-interface {v0}, Ln2/q;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Li2/a;->e:Ln2/q;

    .line 16
    .line 17
    invoke-interface {v0, p1, p2, p3}, Ln2/q;->s(JLjava/util/List;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
.end method

.method public final release()V
    .locals 4

    .line 1
    iget-object v0, p0, Li2/a;->c:[Ll2/f;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    check-cast v3, Ll2/d;

    .line 10
    .line 11
    iget-object v3, v3, Ll2/d;->a:Ls2/m;

    .line 12
    .line 13
    invoke-interface {v3}, Ls2/m;->release()V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method
