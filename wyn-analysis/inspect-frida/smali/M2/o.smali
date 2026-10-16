.class public final LM2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls2/m;
.implements Ls2/w;


# instance fields
.field public A:[LM2/n;

.field public B:[[J

.field public C:I

.field public D:J

.field public E:I

.field public F:LH2/a;

.field public final a:LP2/j;

.field public final b:I

.field public final c:LQ1/o;

.field public final d:LQ1/o;

.field public final e:LQ1/o;

.field public final f:LQ1/o;

.field public final g:Ljava/util/ArrayDeque;

.field public final h:LM2/q;

.field public final i:Ljava/util/ArrayList;

.field public j:Ll8/e0;

.field public k:I

.field public l:I

.field public m:J

.field public n:I

.field public o:LQ1/o;

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:J

.field public x:Z

.field public y:J

.field public z:Ls2/o;


# direct methods
.method public constructor <init>(LP2/j;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM2/o;->a:LP2/j;

    .line 5
    .line 6
    iput p2, p0, LM2/o;->b:I

    .line 7
    .line 8
    sget-object p1, Ll8/K;->b:Ll8/I;

    .line 9
    .line 10
    sget-object p1, Ll8/e0;->e:Ll8/e0;

    .line 11
    .line 12
    iput-object p1, p0, LM2/o;->j:Ll8/e0;

    .line 13
    .line 14
    and-int/lit8 p1, p2, 0x4

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move p1, v0

    .line 22
    :goto_0
    iput p1, p0, LM2/o;->k:I

    .line 23
    .line 24
    new-instance p1, LM2/q;

    .line 25
    .line 26
    invoke-direct {p1}, LM2/q;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, LM2/o;->h:LM2/q;

    .line 30
    .line 31
    new-instance p1, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, LM2/o;->i:Ljava/util/ArrayList;

    .line 37
    .line 38
    new-instance p1, LQ1/o;

    .line 39
    .line 40
    const/16 v1, 0x10

    .line 41
    .line 42
    invoke-direct {p1, v1}, LQ1/o;-><init>(I)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, LM2/o;->f:LQ1/o;

    .line 46
    .line 47
    new-instance p1, Ljava/util/ArrayDeque;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, LM2/o;->g:Ljava/util/ArrayDeque;

    .line 53
    .line 54
    new-instance p1, LQ1/o;

    .line 55
    .line 56
    sget-object v1, LR1/n;->a:[B

    .line 57
    .line 58
    invoke-direct {p1, v1}, LQ1/o;-><init>([B)V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, LM2/o;->c:LQ1/o;

    .line 62
    .line 63
    new-instance p1, LQ1/o;

    .line 64
    .line 65
    const/4 v1, 0x5

    .line 66
    invoke-direct {p1, v1}, LQ1/o;-><init>(I)V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, LM2/o;->d:LQ1/o;

    .line 70
    .line 71
    new-instance p1, LQ1/o;

    .line 72
    .line 73
    invoke-direct {p1}, LQ1/o;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, LM2/o;->e:LQ1/o;

    .line 77
    .line 78
    const/4 p1, -0x1

    .line 79
    iput p1, p0, LM2/o;->p:I

    .line 80
    .line 81
    sget-object p1, Ls2/o;->f9:La9/b;

    .line 82
    .line 83
    iput-object p1, p0, LM2/o;->z:Ls2/o;

    .line 84
    .line 85
    new-array p1, v0, [LM2/n;

    .line 86
    .line 87
    iput-object p1, p0, LM2/o;->A:[LM2/n;

    .line 88
    .line 89
    and-int/lit8 p1, p2, 0x20

    .line 90
    .line 91
    if-nez p1, :cond_1

    .line 92
    .line 93
    const/4 v0, 0x1

    .line 94
    :cond_1
    iput-boolean v0, p0, LM2/o;->t:Z

    .line 95
    .line 96
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 8

    .line 1
    iget-object v0, p0, LM2/o;->g:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, LM2/o;->n:I

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    iput v1, p0, LM2/o;->p:I

    .line 11
    .line 12
    iput v0, p0, LM2/o;->q:I

    .line 13
    .line 14
    iput v0, p0, LM2/o;->r:I

    .line 15
    .line 16
    iput v0, p0, LM2/o;->s:I

    .line 17
    .line 18
    iget v2, p0, LM2/o;->b:I

    .line 19
    .line 20
    and-int/lit8 v2, v2, 0x20

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    move v2, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v2, v0

    .line 28
    :goto_0
    iput-boolean v2, p0, LM2/o;->t:Z

    .line 29
    .line 30
    const-wide/16 v4, 0x0

    .line 31
    .line 32
    cmp-long p1, p1, v4

    .line 33
    .line 34
    if-nez p1, :cond_2

    .line 35
    .line 36
    iget p1, p0, LM2/o;->k:I

    .line 37
    .line 38
    const/4 p2, 0x3

    .line 39
    if-eq p1, p2, :cond_1

    .line 40
    .line 41
    iput v0, p0, LM2/o;->k:I

    .line 42
    .line 43
    iput v0, p0, LM2/o;->n:I

    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    iget-object p1, p0, LM2/o;->h:LM2/q;

    .line 47
    .line 48
    iget-object p2, p1, LM2/q;->a:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    .line 51
    .line 52
    .line 53
    iput v0, p1, LM2/q;->b:I

    .line 54
    .line 55
    iget-object p1, p0, LM2/o;->i:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    iget-object p1, p0, LM2/o;->A:[LM2/n;

    .line 62
    .line 63
    array-length p2, p1

    .line 64
    move v2, v0

    .line 65
    :goto_1
    if-ge v2, p2, :cond_7

    .line 66
    .line 67
    aget-object v4, p1, v2

    .line 68
    .line 69
    iget-object v5, v4, LM2/n;->b:LM2/v;

    .line 70
    .line 71
    iget-object v6, v5, LM2/v;->f:[J

    .line 72
    .line 73
    invoke-static {v6, p3, p4, v0}, LQ1/x;->e([JJZ)I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    :goto_2
    if-ltz v6, :cond_4

    .line 78
    .line 79
    iget-object v7, v5, LM2/v;->g:[I

    .line 80
    .line 81
    aget v7, v7, v6

    .line 82
    .line 83
    and-int/2addr v7, v3

    .line 84
    if-eqz v7, :cond_3

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    add-int/lit8 v6, v6, -0x1

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    move v6, v1

    .line 91
    :goto_3
    if-ne v6, v1, :cond_5

    .line 92
    .line 93
    invoke-virtual {v5, p3, p4}, LM2/v;->a(J)I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    :cond_5
    iput v6, v4, LM2/n;->e:I

    .line 98
    .line 99
    iget-object v4, v4, LM2/n;->d:LJ5/x;

    .line 100
    .line 101
    if-eqz v4, :cond_6

    .line 102
    .line 103
    iput-boolean v0, v4, LJ5/x;->b:Z

    .line 104
    .line 105
    iput v0, v4, LJ5/x;->c:I

    .line 106
    .line 107
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_7
    return-void
.end method

.method public final c(J)Ls2/v;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    iget-object v3, v0, LM2/o;->A:[LM2/n;

    .line 6
    .line 7
    array-length v4, v3

    .line 8
    sget-object v5, Ls2/x;->c:Ls2/x;

    .line 9
    .line 10
    if-nez v4, :cond_0

    .line 11
    .line 12
    new-instance v1, Ls2/v;

    .line 13
    .line 14
    invoke-direct {v1, v5, v5}, Ls2/v;-><init>(Ls2/x;Ls2/x;)V

    .line 15
    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_0
    iget v4, v0, LM2/o;->C:I

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, -0x1

    .line 22
    const-wide/16 v10, -0x1

    .line 23
    .line 24
    if-eq v4, v7, :cond_6

    .line 25
    .line 26
    aget-object v3, v3, v4

    .line 27
    .line 28
    iget-object v3, v3, LM2/n;->b:LM2/v;

    .line 29
    .line 30
    iget-object v4, v3, LM2/v;->f:[J

    .line 31
    .line 32
    invoke-static {v4, v1, v2, v6}, LQ1/x;->e([JJZ)I

    .line 33
    .line 34
    .line 35
    move-result v12

    .line 36
    :goto_0
    if-ltz v12, :cond_2

    .line 37
    .line 38
    iget-object v13, v3, LM2/v;->g:[I

    .line 39
    .line 40
    aget v13, v13, v12

    .line 41
    .line 42
    and-int/lit8 v13, v13, 0x1

    .line 43
    .line 44
    if-eqz v13, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    add-int/lit8 v12, v12, -0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move v12, v7

    .line 51
    :goto_1
    if-ne v12, v7, :cond_3

    .line 52
    .line 53
    invoke-virtual {v3, v1, v2}, LM2/v;->a(J)I

    .line 54
    .line 55
    .line 56
    move-result v12

    .line 57
    :cond_3
    if-ne v12, v7, :cond_4

    .line 58
    .line 59
    new-instance v1, Ls2/v;

    .line 60
    .line 61
    invoke-direct {v1, v5, v5}, Ls2/v;-><init>(Ls2/x;Ls2/x;)V

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_4
    aget-wide v13, v4, v12

    .line 66
    .line 67
    iget-object v5, v3, LM2/v;->c:[J

    .line 68
    .line 69
    aget-wide v15, v5, v12

    .line 70
    .line 71
    cmp-long v17, v13, v1

    .line 72
    .line 73
    if-gez v17, :cond_5

    .line 74
    .line 75
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    iget v8, v3, LM2/v;->b:I

    .line 81
    .line 82
    add-int/lit8 v8, v8, -0x1

    .line 83
    .line 84
    if-ge v12, v8, :cond_7

    .line 85
    .line 86
    invoke-virtual {v3, v1, v2}, LM2/v;->a(J)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eq v1, v7, :cond_7

    .line 91
    .line 92
    if-eq v1, v12, :cond_7

    .line 93
    .line 94
    aget-wide v2, v4, v1

    .line 95
    .line 96
    aget-wide v10, v5, v1

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_5
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_6
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    const-wide v15, 0x7fffffffffffffffL

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    move-wide v13, v1

    .line 116
    :cond_7
    :goto_2
    move-wide/from16 v2, v17

    .line 117
    .line 118
    :goto_3
    move v1, v6

    .line 119
    move-wide v4, v15

    .line 120
    :goto_4
    iget-object v8, v0, LM2/o;->A:[LM2/n;

    .line 121
    .line 122
    array-length v9, v8

    .line 123
    if-ge v1, v9, :cond_12

    .line 124
    .line 125
    iget v9, v0, LM2/o;->C:I

    .line 126
    .line 127
    if-eq v1, v9, :cond_11

    .line 128
    .line 129
    aget-object v8, v8, v1

    .line 130
    .line 131
    iget-object v8, v8, LM2/n;->b:LM2/v;

    .line 132
    .line 133
    iget-object v9, v8, LM2/v;->f:[J

    .line 134
    .line 135
    invoke-static {v9, v13, v14, v6}, LQ1/x;->e([JJZ)I

    .line 136
    .line 137
    .line 138
    move-result v12

    .line 139
    :goto_5
    iget-object v15, v8, LM2/v;->g:[I

    .line 140
    .line 141
    if-ltz v12, :cond_9

    .line 142
    .line 143
    aget v16, v15, v12

    .line 144
    .line 145
    and-int/lit8 v16, v16, 0x1

    .line 146
    .line 147
    if-eqz v16, :cond_8

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_8
    add-int/lit8 v12, v12, -0x1

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_9
    move v12, v7

    .line 154
    :goto_6
    if-ne v12, v7, :cond_a

    .line 155
    .line 156
    invoke-virtual {v8, v13, v14}, LM2/v;->a(J)I

    .line 157
    .line 158
    .line 159
    move-result v12

    .line 160
    :cond_a
    iget-object v6, v8, LM2/v;->c:[J

    .line 161
    .line 162
    if-ne v12, v7, :cond_b

    .line 163
    .line 164
    move-object/from16 p1, v8

    .line 165
    .line 166
    goto :goto_7

    .line 167
    :cond_b
    move-object/from16 p1, v8

    .line 168
    .line 169
    aget-wide v7, v6, v12

    .line 170
    .line 171
    invoke-static {v7, v8, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 172
    .line 173
    .line 174
    move-result-wide v4

    .line 175
    :goto_7
    cmp-long v7, v2, v17

    .line 176
    .line 177
    if-eqz v7, :cond_10

    .line 178
    .line 179
    const/4 v7, 0x0

    .line 180
    invoke-static {v9, v2, v3, v7}, LQ1/x;->e([JJZ)I

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    :goto_8
    if-ltz v8, :cond_d

    .line 185
    .line 186
    aget v9, v15, v8

    .line 187
    .line 188
    and-int/lit8 v9, v9, 0x1

    .line 189
    .line 190
    if-eqz v9, :cond_c

    .line 191
    .line 192
    :goto_9
    const/4 v9, -0x1

    .line 193
    goto :goto_a

    .line 194
    :cond_c
    add-int/lit8 v8, v8, -0x1

    .line 195
    .line 196
    goto :goto_8

    .line 197
    :cond_d
    const/4 v8, -0x1

    .line 198
    goto :goto_9

    .line 199
    :goto_a
    if-ne v8, v9, :cond_e

    .line 200
    .line 201
    move-object/from16 v12, p1

    .line 202
    .line 203
    invoke-virtual {v12, v2, v3}, LM2/v;->a(J)I

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    :cond_e
    if-ne v8, v9, :cond_f

    .line 208
    .line 209
    goto :goto_b

    .line 210
    :cond_f
    aget-wide v7, v6, v8

    .line 211
    .line 212
    invoke-static {v7, v8, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 213
    .line 214
    .line 215
    move-result-wide v10

    .line 216
    goto :goto_b

    .line 217
    :cond_10
    const/4 v9, -0x1

    .line 218
    goto :goto_b

    .line 219
    :cond_11
    move v9, v7

    .line 220
    :goto_b
    add-int/lit8 v1, v1, 0x1

    .line 221
    .line 222
    move v7, v9

    .line 223
    const/4 v6, 0x0

    .line 224
    goto :goto_4

    .line 225
    :cond_12
    new-instance v1, Ls2/x;

    .line 226
    .line 227
    invoke-direct {v1, v13, v14, v4, v5}, Ls2/x;-><init>(JJ)V

    .line 228
    .line 229
    .line 230
    cmp-long v4, v2, v17

    .line 231
    .line 232
    if-nez v4, :cond_13

    .line 233
    .line 234
    new-instance v2, Ls2/v;

    .line 235
    .line 236
    invoke-direct {v2, v1, v1}, Ls2/v;-><init>(Ls2/x;Ls2/x;)V

    .line 237
    .line 238
    .line 239
    return-object v2

    .line 240
    :cond_13
    new-instance v4, Ls2/x;

    .line 241
    .line 242
    invoke-direct {v4, v2, v3, v10, v11}, Ls2/x;-><init>(JJ)V

    .line 243
    .line 244
    .line 245
    new-instance v2, Ls2/v;

    .line 246
    .line 247
    invoke-direct {v2, v1, v4}, Ls2/v;-><init>(Ls2/x;Ls2/x;)V

    .line 248
    .line 249
    .line 250
    return-object v2
.end method

.method public final e()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final f()J
    .locals 2

    .line 1
    iget-wide v0, p0, LM2/o;->D:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final g(Ls2/o;)V
    .locals 2

    .line 1
    iget v0, p0, LM2/o;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x10

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LDd/c;

    .line 8
    .line 9
    iget-object v1, p0, LM2/o;->a:LP2/j;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, LDd/c;-><init>(Ls2/o;LP2/j;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v0

    .line 15
    :cond_0
    iput-object p1, p0, LM2/o;->z:Ls2/o;

    .line 16
    .line 17
    return-void
.end method

.method public final h()Ls2/m;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final i(Ls2/n;)Z
    .locals 3

    .line 1
    iget v0, p0, LM2/o;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move v0, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v2

    .line 12
    :goto_0
    invoke-static {p1, v2, v0}, LM2/r;->k(Ls2/n;ZZ)Ls2/A;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-static {p1}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    sget-object v0, Ll8/K;->b:Ll8/I;

    .line 24
    .line 25
    sget-object v0, Ll8/e0;->e:Ll8/e0;

    .line 26
    .line 27
    :goto_1
    iput-object v0, p0, LM2/o;->j:Ll8/e0;

    .line 28
    .line 29
    if-nez p1, :cond_2

    .line 30
    .line 31
    return v1

    .line 32
    :cond_2
    return v2
.end method

.method public final j()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LM2/o;->j:Ll8/e0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k(Ls2/n;LJ5/n;)I
    .locals 43

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v4, 0x3

    .line 8
    :goto_0
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x4

    .line 10
    const/4 v9, 0x2

    .line 11
    const/4 v10, 0x1

    .line 12
    :goto_1
    iget v11, v1, LM2/o;->k:I

    .line 13
    .line 14
    iget-object v12, v1, LM2/o;->g:Ljava/util/ArrayDeque;

    .line 15
    .line 16
    iget v14, v1, LM2/o;->b:I

    .line 17
    .line 18
    iget-object v15, v1, LM2/o;->e:LQ1/o;

    .line 19
    .line 20
    const-wide/16 v16, -0x1

    .line 21
    .line 22
    move/from16 v19, v14

    .line 23
    .line 24
    if-eqz v11, :cond_44

    .line 25
    .line 26
    const-wide/32 v20, 0x40000

    .line 27
    .line 28
    .line 29
    if-eq v11, v10, :cond_34

    .line 30
    .line 31
    const-wide/16 v22, 0x8

    .line 32
    .line 33
    if-eq v11, v9, :cond_18

    .line 34
    .line 35
    if-ne v11, v4, :cond_17

    .line 36
    .line 37
    iget-object v3, v1, LM2/o;->i:Ljava/util/ArrayList;

    .line 38
    .line 39
    iget-object v11, v1, LM2/o;->h:LM2/q;

    .line 40
    .line 41
    iget v12, v11, LM2/q;->b:I

    .line 42
    .line 43
    if-eqz v12, :cond_13

    .line 44
    .line 45
    if-eq v12, v10, :cond_11

    .line 46
    .line 47
    iget-object v15, v11, LM2/q;->a:Ljava/util/ArrayList;

    .line 48
    .line 49
    const/16 v5, 0xb01

    .line 50
    .line 51
    const/16 v25, 0x8

    .line 52
    .line 53
    const/16 v8, 0xb04

    .line 54
    .line 55
    const/16 v13, 0xb00

    .line 56
    .line 57
    const/16 v10, 0x890

    .line 58
    .line 59
    if-eq v12, v9, :cond_c

    .line 60
    .line 61
    if-ne v12, v4, :cond_b

    .line 62
    .line 63
    invoke-interface {v0}, Ls2/n;->getPosition()J

    .line 64
    .line 65
    .line 66
    move-result-wide v16

    .line 67
    invoke-interface {v0}, Ls2/n;->i()J

    .line 68
    .line 69
    .line 70
    move-result-wide v18

    .line 71
    invoke-interface {v0}, Ls2/n;->getPosition()J

    .line 72
    .line 73
    .line 74
    move-result-wide v20

    .line 75
    sub-long v18, v18, v20

    .line 76
    .line 77
    iget v11, v11, LM2/q;->c:I

    .line 78
    .line 79
    int-to-long v11, v11

    .line 80
    sub-long v11, v18, v11

    .line 81
    .line 82
    long-to-int v11, v11

    .line 83
    new-instance v12, LQ1/o;

    .line 84
    .line 85
    invoke-direct {v12, v11}, LQ1/o;-><init>(I)V

    .line 86
    .line 87
    .line 88
    iget-object v9, v12, LQ1/o;->a:[B

    .line 89
    .line 90
    invoke-interface {v0, v9, v6, v11}, Ls2/n;->readFully([BII)V

    .line 91
    .line 92
    .line 93
    move v0, v6

    .line 94
    :goto_2
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    if-ge v0, v9, :cond_a

    .line 99
    .line 100
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    check-cast v9, LM2/p;

    .line 105
    .line 106
    move-object/from16 v18, v15

    .line 107
    .line 108
    iget-wide v14, v9, LM2/p;->a:J

    .line 109
    .line 110
    sub-long v14, v14, v16

    .line 111
    .line 112
    long-to-int v11, v14

    .line 113
    invoke-virtual {v12, v11}, LQ1/o;->G(I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v12, v7}, LQ1/o;->H(I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v12}, LQ1/o;->j()I

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    sget-object v14, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 124
    .line 125
    invoke-virtual {v12, v11, v14}, LQ1/o;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v15

    .line 129
    invoke-virtual {v15}, Ljava/lang/String;->hashCode()I

    .line 130
    .line 131
    .line 132
    move-result v20

    .line 133
    move/from16 v30, v7

    .line 134
    .line 135
    sparse-switch v20, :sswitch_data_0

    .line 136
    .line 137
    .line 138
    :goto_3
    const/4 v7, -0x1

    .line 139
    goto :goto_5

    .line 140
    :sswitch_0
    const-string v7, "Super_SlowMotion_BGM"

    .line 141
    .line 142
    invoke-virtual {v15, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    if-nez v7, :cond_0

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_0
    move/from16 v7, v30

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :sswitch_1
    const-string v7, "Super_SlowMotion_Deflickering_On"

    .line 153
    .line 154
    invoke-virtual {v15, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    if-nez v7, :cond_1

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_1
    move v7, v4

    .line 162
    goto :goto_5

    .line 163
    :sswitch_2
    const-string v7, "Super_SlowMotion_Data"

    .line 164
    .line 165
    invoke-virtual {v15, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    if-nez v7, :cond_2

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_2
    const/4 v7, 0x2

    .line 173
    goto :goto_5

    .line 174
    :sswitch_3
    const-string v7, "Super_SlowMotion_Edit_Data"

    .line 175
    .line 176
    invoke-virtual {v15, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    if-nez v7, :cond_3

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_3
    const/4 v7, 0x1

    .line 184
    goto :goto_5

    .line 185
    :sswitch_4
    const-string v7, "SlowMotion_Data"

    .line 186
    .line 187
    invoke-virtual {v15, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v7

    .line 191
    if-nez v7, :cond_4

    .line 192
    .line 193
    :goto_4
    goto :goto_3

    .line 194
    :cond_4
    move v7, v6

    .line 195
    :goto_5
    packed-switch v7, :pswitch_data_0

    .line 196
    .line 197
    .line 198
    const-string v0, "Invalid SEF name"

    .line 199
    .line 200
    const/4 v2, 0x0

    .line 201
    invoke-static {v2, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    throw v0

    .line 206
    :pswitch_0
    move v7, v5

    .line 207
    goto :goto_6

    .line 208
    :pswitch_1
    move v7, v8

    .line 209
    goto :goto_6

    .line 210
    :pswitch_2
    move v7, v13

    .line 211
    goto :goto_6

    .line 212
    :pswitch_3
    const/16 v7, 0xb03

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :pswitch_4
    move v7, v10

    .line 216
    :goto_6
    add-int/lit8 v11, v11, 0x8

    .line 217
    .line 218
    iget v9, v9, LM2/p;->b:I

    .line 219
    .line 220
    sub-int/2addr v9, v11

    .line 221
    if-eq v7, v10, :cond_7

    .line 222
    .line 223
    if-eq v7, v13, :cond_6

    .line 224
    .line 225
    if-eq v7, v5, :cond_6

    .line 226
    .line 227
    const/16 v9, 0xb03

    .line 228
    .line 229
    if-eq v7, v9, :cond_6

    .line 230
    .line 231
    if-ne v7, v8, :cond_5

    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 235
    .line 236
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 237
    .line 238
    .line 239
    throw v0

    .line 240
    :cond_6
    :goto_7
    const/16 v28, 0x1

    .line 241
    .line 242
    goto :goto_9

    .line 243
    :cond_7
    new-instance v7, Ljava/util/ArrayList;

    .line 244
    .line 245
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12, v9, v14}, LQ1/o;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v9

    .line 252
    sget-object v11, LM2/q;->e:LY2/B;

    .line 253
    .line 254
    invoke-virtual {v11, v9}, LY2/B;->E(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    move v11, v6

    .line 259
    :goto_8
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 260
    .line 261
    .line 262
    move-result v14

    .line 263
    if-ge v11, v14, :cond_9

    .line 264
    .line 265
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v14

    .line 269
    check-cast v14, Ljava/lang/CharSequence;

    .line 270
    .line 271
    sget-object v15, LM2/q;->d:LY2/B;

    .line 272
    .line 273
    invoke-virtual {v15, v14}, LY2/B;->E(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 274
    .line 275
    .line 276
    move-result-object v14

    .line 277
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 278
    .line 279
    .line 280
    move-result v15

    .line 281
    if-ne v15, v4, :cond_8

    .line 282
    .line 283
    :try_start_0
    invoke-interface {v14, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v15

    .line 287
    check-cast v15, Ljava/lang/String;

    .line 288
    .line 289
    invoke-static {v15}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 290
    .line 291
    .line 292
    move-result-wide v32

    .line 293
    const/4 v15, 0x1

    .line 294
    invoke-interface {v14, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v20

    .line 298
    check-cast v20, Ljava/lang/String;

    .line 299
    .line 300
    invoke-static/range {v20 .. v20}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 301
    .line 302
    .line 303
    move-result-wide v34

    .line 304
    const/4 v15, 0x2

    .line 305
    invoke-interface {v14, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v14

    .line 309
    check-cast v14, Ljava/lang/String;

    .line 310
    .line 311
    invoke-static {v14}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 312
    .line 313
    .line 314
    move-result v14

    .line 315
    const/16 v28, 0x1

    .line 316
    .line 317
    add-int/lit8 v14, v14, -0x1

    .line 318
    .line 319
    shl-int v36, v28, v14

    .line 320
    .line 321
    new-instance v31, LH2/b;

    .line 322
    .line 323
    invoke-direct/range {v31 .. v36}, LH2/b;-><init>(JJI)V

    .line 324
    .line 325
    .line 326
    move-object/from16 v14, v31

    .line 327
    .line 328
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 329
    .line 330
    .line 331
    add-int/lit8 v11, v11, 0x1

    .line 332
    .line 333
    goto :goto_8

    .line 334
    :catch_0
    move-exception v0

    .line 335
    const/4 v2, 0x0

    .line 336
    invoke-static {v0, v2}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    throw v0

    .line 341
    :cond_8
    const/4 v2, 0x0

    .line 342
    invoke-static {v2, v2}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    throw v0

    .line 347
    :cond_9
    new-instance v9, LH2/c;

    .line 348
    .line 349
    invoke-direct {v9, v7}, LH2/c;-><init>(Ljava/util/ArrayList;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    goto :goto_7

    .line 356
    :goto_9
    add-int/lit8 v0, v0, 0x1

    .line 357
    .line 358
    move-object/from16 v15, v18

    .line 359
    .line 360
    move/from16 v7, v30

    .line 361
    .line 362
    goto/16 :goto_2

    .line 363
    .line 364
    :cond_a
    const-wide/16 v14, 0x0

    .line 365
    .line 366
    iput-wide v14, v2, LJ5/n;->a:J

    .line 367
    .line 368
    :goto_a
    const/4 v15, 0x1

    .line 369
    goto/16 :goto_10

    .line 370
    .line 371
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 372
    .line 373
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 374
    .line 375
    .line 376
    throw v0

    .line 377
    :cond_c
    move-object/from16 v18, v15

    .line 378
    .line 379
    invoke-interface {v0}, Ls2/n;->i()J

    .line 380
    .line 381
    .line 382
    move-result-wide v14

    .line 383
    iget v3, v11, LM2/q;->c:I

    .line 384
    .line 385
    add-int/lit8 v3, v3, -0x14

    .line 386
    .line 387
    new-instance v7, LQ1/o;

    .line 388
    .line 389
    invoke-direct {v7, v3}, LQ1/o;-><init>(I)V

    .line 390
    .line 391
    .line 392
    iget-object v9, v7, LQ1/o;->a:[B

    .line 393
    .line 394
    invoke-interface {v0, v9, v6, v3}, Ls2/n;->readFully([BII)V

    .line 395
    .line 396
    .line 397
    move v0, v6

    .line 398
    :goto_b
    div-int/lit8 v9, v3, 0xc

    .line 399
    .line 400
    if-ge v0, v9, :cond_f

    .line 401
    .line 402
    const/4 v9, 0x2

    .line 403
    invoke-virtual {v7, v9}, LQ1/o;->H(I)V

    .line 404
    .line 405
    .line 406
    iget-object v12, v7, LQ1/o;->a:[B

    .line 407
    .line 408
    move/from16 v29, v9

    .line 409
    .line 410
    iget v9, v7, LQ1/o;->b:I

    .line 411
    .line 412
    const/16 v28, 0x1

    .line 413
    .line 414
    add-int/lit8 v6, v9, 0x1

    .line 415
    .line 416
    iput v6, v7, LQ1/o;->b:I

    .line 417
    .line 418
    aget-byte v4, v12, v9

    .line 419
    .line 420
    and-int/lit16 v4, v4, 0xff

    .line 421
    .line 422
    add-int/lit8 v9, v9, 0x2

    .line 423
    .line 424
    iput v9, v7, LQ1/o;->b:I

    .line 425
    .line 426
    aget-byte v6, v12, v6

    .line 427
    .line 428
    and-int/lit16 v6, v6, 0xff

    .line 429
    .line 430
    shl-int/lit8 v6, v6, 0x8

    .line 431
    .line 432
    or-int/2addr v4, v6

    .line 433
    int-to-short v4, v4

    .line 434
    if-eq v4, v10, :cond_d

    .line 435
    .line 436
    if-eq v4, v13, :cond_d

    .line 437
    .line 438
    if-eq v4, v5, :cond_d

    .line 439
    .line 440
    const/16 v9, 0xb03

    .line 441
    .line 442
    if-eq v4, v9, :cond_e

    .line 443
    .line 444
    if-eq v4, v8, :cond_e

    .line 445
    .line 446
    move/from16 v4, v25

    .line 447
    .line 448
    invoke-virtual {v7, v4}, LQ1/o;->H(I)V

    .line 449
    .line 450
    .line 451
    move-object/from16 v4, v18

    .line 452
    .line 453
    :goto_c
    const/16 v28, 0x1

    .line 454
    .line 455
    goto :goto_d

    .line 456
    :cond_d
    const/16 v9, 0xb03

    .line 457
    .line 458
    :cond_e
    iget v4, v11, LM2/q;->c:I

    .line 459
    .line 460
    int-to-long v5, v4

    .line 461
    sub-long v5, v14, v5

    .line 462
    .line 463
    invoke-virtual {v7}, LQ1/o;->j()I

    .line 464
    .line 465
    .line 466
    move-result v4

    .line 467
    int-to-long v8, v4

    .line 468
    sub-long/2addr v5, v8

    .line 469
    invoke-virtual {v7}, LQ1/o;->j()I

    .line 470
    .line 471
    .line 472
    move-result v4

    .line 473
    new-instance v8, LM2/p;

    .line 474
    .line 475
    invoke-direct {v8, v5, v6, v4}, LM2/p;-><init>(JI)V

    .line 476
    .line 477
    .line 478
    move-object/from16 v4, v18

    .line 479
    .line 480
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    goto :goto_c

    .line 484
    :goto_d
    add-int/lit8 v0, v0, 0x1

    .line 485
    .line 486
    move-object/from16 v18, v4

    .line 487
    .line 488
    const/4 v4, 0x3

    .line 489
    const/16 v5, 0xb01

    .line 490
    .line 491
    const/4 v6, 0x0

    .line 492
    const/16 v8, 0xb04

    .line 493
    .line 494
    const/16 v25, 0x8

    .line 495
    .line 496
    goto :goto_b

    .line 497
    :cond_f
    move-object/from16 v4, v18

    .line 498
    .line 499
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    if-eqz v0, :cond_10

    .line 504
    .line 505
    const-wide/16 v14, 0x0

    .line 506
    .line 507
    iput-wide v14, v2, LJ5/n;->a:J

    .line 508
    .line 509
    const/4 v3, 0x0

    .line 510
    goto/16 :goto_a

    .line 511
    .line 512
    :cond_10
    const/4 v5, 0x3

    .line 513
    iput v5, v11, LM2/q;->b:I

    .line 514
    .line 515
    const/4 v3, 0x0

    .line 516
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    check-cast v0, LM2/p;

    .line 521
    .line 522
    iget-wide v4, v0, LM2/p;->a:J

    .line 523
    .line 524
    iput-wide v4, v2, LJ5/n;->a:J

    .line 525
    .line 526
    goto/16 :goto_a

    .line 527
    .line 528
    :cond_11
    move v3, v6

    .line 529
    new-instance v4, LQ1/o;

    .line 530
    .line 531
    const/16 v5, 0x8

    .line 532
    .line 533
    invoke-direct {v4, v5}, LQ1/o;-><init>(I)V

    .line 534
    .line 535
    .line 536
    iget-object v6, v4, LQ1/o;->a:[B

    .line 537
    .line 538
    invoke-interface {v0, v6, v3, v5}, Ls2/n;->readFully([BII)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v4}, LQ1/o;->j()I

    .line 542
    .line 543
    .line 544
    move-result v3

    .line 545
    add-int/2addr v3, v5

    .line 546
    iput v3, v11, LM2/q;->c:I

    .line 547
    .line 548
    invoke-virtual {v4}, LQ1/o;->h()I

    .line 549
    .line 550
    .line 551
    move-result v3

    .line 552
    const v4, 0x53454654

    .line 553
    .line 554
    .line 555
    if-eq v3, v4, :cond_12

    .line 556
    .line 557
    const-wide/16 v14, 0x0

    .line 558
    .line 559
    iput-wide v14, v2, LJ5/n;->a:J

    .line 560
    .line 561
    goto/16 :goto_a

    .line 562
    .line 563
    :cond_12
    invoke-interface {v0}, Ls2/n;->getPosition()J

    .line 564
    .line 565
    .line 566
    move-result-wide v3

    .line 567
    iget v0, v11, LM2/q;->c:I

    .line 568
    .line 569
    add-int/lit8 v0, v0, -0xc

    .line 570
    .line 571
    int-to-long v5, v0

    .line 572
    sub-long/2addr v3, v5

    .line 573
    iput-wide v3, v2, LJ5/n;->a:J

    .line 574
    .line 575
    const/4 v15, 0x2

    .line 576
    iput v15, v11, LM2/q;->b:I

    .line 577
    .line 578
    goto/16 :goto_a

    .line 579
    .line 580
    :cond_13
    invoke-interface {v0}, Ls2/n;->i()J

    .line 581
    .line 582
    .line 583
    move-result-wide v3

    .line 584
    cmp-long v0, v3, v16

    .line 585
    .line 586
    if-eqz v0, :cond_15

    .line 587
    .line 588
    cmp-long v0, v3, v22

    .line 589
    .line 590
    if-gez v0, :cond_14

    .line 591
    .line 592
    goto :goto_e

    .line 593
    :cond_14
    sub-long v3, v3, v22

    .line 594
    .line 595
    goto :goto_f

    .line 596
    :cond_15
    :goto_e
    const-wide/16 v3, 0x0

    .line 597
    .line 598
    :goto_f
    iput-wide v3, v2, LJ5/n;->a:J

    .line 599
    .line 600
    const/4 v15, 0x1

    .line 601
    iput v15, v11, LM2/q;->b:I

    .line 602
    .line 603
    :goto_10
    iget-wide v2, v2, LJ5/n;->a:J

    .line 604
    .line 605
    const-wide/16 v26, 0x0

    .line 606
    .line 607
    cmp-long v0, v2, v26

    .line 608
    .line 609
    if-nez v0, :cond_16

    .line 610
    .line 611
    const/4 v3, 0x0

    .line 612
    iput v3, v1, LM2/o;->k:I

    .line 613
    .line 614
    iput v3, v1, LM2/o;->n:I

    .line 615
    .line 616
    return v15

    .line 617
    :cond_16
    move v10, v15

    .line 618
    goto/16 :goto_24

    .line 619
    .line 620
    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 621
    .line 622
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 623
    .line 624
    .line 625
    throw v0

    .line 626
    :cond_18
    move/from16 v30, v7

    .line 627
    .line 628
    invoke-interface {v0}, Ls2/n;->getPosition()J

    .line 629
    .line 630
    .line 631
    move-result-wide v4

    .line 632
    iget v6, v1, LM2/o;->p:I

    .line 633
    .line 634
    const/4 v7, -0x1

    .line 635
    if-ne v6, v7, :cond_23

    .line 636
    .line 637
    const/4 v8, -0x1

    .line 638
    const/4 v9, -0x1

    .line 639
    const/4 v10, 0x1

    .line 640
    const/4 v11, 0x1

    .line 641
    const/4 v12, 0x0

    .line 642
    const-wide v13, 0x7fffffffffffffffL

    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    const-wide v16, 0x7fffffffffffffffL

    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    const-wide v32, 0x7fffffffffffffffL

    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    const-wide v34, 0x7fffffffffffffffL

    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    :goto_11
    iget-object v6, v1, LM2/o;->A:[LM2/n;

    .line 663
    .line 664
    array-length v7, v6

    .line 665
    if-ge v12, v7, :cond_20

    .line 666
    .line 667
    aget-object v6, v6, v12

    .line 668
    .line 669
    iget v7, v6, LM2/n;->e:I

    .line 670
    .line 671
    iget-object v6, v6, LM2/n;->b:LM2/v;

    .line 672
    .line 673
    iget v3, v6, LM2/v;->b:I

    .line 674
    .line 675
    if-ne v7, v3, :cond_1a

    .line 676
    .line 677
    :cond_19
    :goto_12
    const/16 v28, 0x1

    .line 678
    .line 679
    goto :goto_15

    .line 680
    :cond_1a
    iget-object v3, v6, LM2/v;->c:[J

    .line 681
    .line 682
    aget-wide v37, v3, v7

    .line 683
    .line 684
    iget-object v3, v1, LM2/o;->B:[[J

    .line 685
    .line 686
    sget v6, LQ1/x;->a:I

    .line 687
    .line 688
    aget-object v3, v3, v12

    .line 689
    .line 690
    aget-wide v6, v3, v7

    .line 691
    .line 692
    sub-long v37, v37, v4

    .line 693
    .line 694
    const-wide/16 v26, 0x0

    .line 695
    .line 696
    cmp-long v3, v37, v26

    .line 697
    .line 698
    if-ltz v3, :cond_1c

    .line 699
    .line 700
    cmp-long v3, v37, v20

    .line 701
    .line 702
    if-ltz v3, :cond_1b

    .line 703
    .line 704
    goto :goto_13

    .line 705
    :cond_1b
    const/4 v3, 0x0

    .line 706
    goto :goto_14

    .line 707
    :cond_1c
    :goto_13
    const/4 v3, 0x1

    .line 708
    :goto_14
    if-nez v3, :cond_1d

    .line 709
    .line 710
    if-nez v11, :cond_1e

    .line 711
    .line 712
    :cond_1d
    if-ne v3, v11, :cond_1f

    .line 713
    .line 714
    cmp-long v18, v37, v32

    .line 715
    .line 716
    if-gez v18, :cond_1f

    .line 717
    .line 718
    :cond_1e
    move v11, v3

    .line 719
    move-wide/from16 v16, v6

    .line 720
    .line 721
    move v9, v12

    .line 722
    move-wide/from16 v32, v37

    .line 723
    .line 724
    :cond_1f
    cmp-long v18, v6, v13

    .line 725
    .line 726
    if-gez v18, :cond_19

    .line 727
    .line 728
    move v10, v3

    .line 729
    move-wide v13, v6

    .line 730
    move v8, v12

    .line 731
    goto :goto_12

    .line 732
    :goto_15
    add-int/lit8 v12, v12, 0x1

    .line 733
    .line 734
    goto :goto_11

    .line 735
    :cond_20
    cmp-long v3, v13, v34

    .line 736
    .line 737
    if-eqz v3, :cond_21

    .line 738
    .line 739
    if-eqz v10, :cond_21

    .line 740
    .line 741
    const-wide/32 v6, 0xa00000

    .line 742
    .line 743
    .line 744
    add-long/2addr v13, v6

    .line 745
    cmp-long v3, v16, v13

    .line 746
    .line 747
    if-gez v3, :cond_22

    .line 748
    .line 749
    :cond_21
    move v8, v9

    .line 750
    :cond_22
    iput v8, v1, LM2/o;->p:I

    .line 751
    .line 752
    const/4 v7, -0x1

    .line 753
    if-ne v8, v7, :cond_23

    .line 754
    .line 755
    move/from16 v24, v7

    .line 756
    .line 757
    goto/16 :goto_30

    .line 758
    .line 759
    :cond_23
    iget-object v3, v1, LM2/o;->A:[LM2/n;

    .line 760
    .line 761
    iget v6, v1, LM2/o;->p:I

    .line 762
    .line 763
    aget-object v3, v3, v6

    .line 764
    .line 765
    iget-object v6, v3, LM2/n;->c:Ls2/C;

    .line 766
    .line 767
    iget v14, v3, LM2/n;->e:I

    .line 768
    .line 769
    iget-object v7, v3, LM2/n;->b:LM2/v;

    .line 770
    .line 771
    iget-object v8, v7, LM2/v;->c:[J

    .line 772
    .line 773
    aget-wide v9, v8, v14

    .line 774
    .line 775
    iget-wide v11, v1, LM2/o;->y:J

    .line 776
    .line 777
    add-long/2addr v9, v11

    .line 778
    iget-object v8, v7, LM2/v;->d:[I

    .line 779
    .line 780
    aget v8, v8, v14

    .line 781
    .line 782
    sub-long v4, v9, v4

    .line 783
    .line 784
    iget v11, v1, LM2/o;->q:I

    .line 785
    .line 786
    int-to-long v11, v11

    .line 787
    add-long/2addr v4, v11

    .line 788
    const-wide/16 v26, 0x0

    .line 789
    .line 790
    cmp-long v11, v4, v26

    .line 791
    .line 792
    if-ltz v11, :cond_33

    .line 793
    .line 794
    cmp-long v11, v4, v20

    .line 795
    .line 796
    if-ltz v11, :cond_24

    .line 797
    .line 798
    goto/16 :goto_1d

    .line 799
    .line 800
    :cond_24
    iget-object v2, v3, LM2/n;->a:LM2/s;

    .line 801
    .line 802
    iget v9, v2, LM2/s;->h:I

    .line 803
    .line 804
    const/4 v10, 0x1

    .line 805
    if-ne v9, v10, :cond_25

    .line 806
    .line 807
    add-long v4, v4, v22

    .line 808
    .line 809
    add-int/lit8 v8, v8, -0x8

    .line 810
    .line 811
    :cond_25
    long-to-int v4, v4

    .line 812
    invoke-interface {v0, v4}, Ls2/n;->j(I)V

    .line 813
    .line 814
    .line 815
    iget-object v4, v2, LM2/s;->g:LN1/n;

    .line 816
    .line 817
    iget-object v5, v4, LN1/n;->n:Ljava/lang/String;

    .line 818
    .line 819
    const-string v9, "video/avc"

    .line 820
    .line 821
    invoke-static {v5, v9}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 822
    .line 823
    .line 824
    move-result v5

    .line 825
    const/4 v10, 0x1

    .line 826
    if-nez v5, :cond_26

    .line 827
    .line 828
    iput-boolean v10, v1, LM2/o;->t:Z

    .line 829
    .line 830
    :cond_26
    iget v2, v2, LM2/s;->k:I

    .line 831
    .line 832
    iget-object v5, v3, LM2/n;->d:LJ5/x;

    .line 833
    .line 834
    if-eqz v2, :cond_2b

    .line 835
    .line 836
    iget-object v4, v1, LM2/o;->d:LQ1/o;

    .line 837
    .line 838
    iget-object v9, v4, LQ1/o;->a:[B

    .line 839
    .line 840
    const/16 v31, 0x0

    .line 841
    .line 842
    aput-byte v31, v9, v31

    .line 843
    .line 844
    aput-byte v31, v9, v10

    .line 845
    .line 846
    const/16 v29, 0x2

    .line 847
    .line 848
    aput-byte v31, v9, v29

    .line 849
    .line 850
    add-int/lit8 v11, v2, 0x1

    .line 851
    .line 852
    rsub-int/lit8 v2, v2, 0x4

    .line 853
    .line 854
    :goto_16
    iget v10, v1, LM2/o;->r:I

    .line 855
    .line 856
    if-ge v10, v8, :cond_2a

    .line 857
    .line 858
    iget v10, v1, LM2/o;->s:I

    .line 859
    .line 860
    if-nez v10, :cond_29

    .line 861
    .line 862
    invoke-interface {v0, v9, v2, v11}, Ls2/n;->readFully([BII)V

    .line 863
    .line 864
    .line 865
    iget v10, v1, LM2/o;->q:I

    .line 866
    .line 867
    add-int/2addr v10, v11

    .line 868
    iput v10, v1, LM2/o;->q:I

    .line 869
    .line 870
    const/4 v10, 0x0

    .line 871
    invoke-virtual {v4, v10}, LQ1/o;->G(I)V

    .line 872
    .line 873
    .line 874
    invoke-virtual {v4}, LQ1/o;->h()I

    .line 875
    .line 876
    .line 877
    move-result v12

    .line 878
    const/4 v15, 0x1

    .line 879
    if-lt v12, v15, :cond_28

    .line 880
    .line 881
    sub-int/2addr v12, v15

    .line 882
    iput v12, v1, LM2/o;->s:I

    .line 883
    .line 884
    iget-object v12, v1, LM2/o;->c:LQ1/o;

    .line 885
    .line 886
    invoke-virtual {v12, v10}, LQ1/o;->G(I)V

    .line 887
    .line 888
    .line 889
    move/from16 v10, v30

    .line 890
    .line 891
    invoke-interface {v6, v10, v12}, Ls2/C;->e(ILQ1/o;)V

    .line 892
    .line 893
    .line 894
    invoke-interface {v6, v15, v4}, Ls2/C;->e(ILQ1/o;)V

    .line 895
    .line 896
    .line 897
    iget v12, v1, LM2/o;->r:I

    .line 898
    .line 899
    add-int/lit8 v12, v12, 0x5

    .line 900
    .line 901
    iput v12, v1, LM2/o;->r:I

    .line 902
    .line 903
    add-int/2addr v8, v2

    .line 904
    iget-boolean v12, v1, LM2/o;->t:Z

    .line 905
    .line 906
    if-nez v12, :cond_27

    .line 907
    .line 908
    aget-byte v12, v9, v10

    .line 909
    .line 910
    invoke-static {v12}, LR1/n;->c(B)Z

    .line 911
    .line 912
    .line 913
    move-result v10

    .line 914
    if-eqz v10, :cond_27

    .line 915
    .line 916
    iput-boolean v15, v1, LM2/o;->t:Z

    .line 917
    .line 918
    :cond_27
    :goto_17
    const/16 v30, 0x4

    .line 919
    .line 920
    goto :goto_16

    .line 921
    :cond_28
    const-string v0, "Invalid NAL length"

    .line 922
    .line 923
    const/4 v2, 0x0

    .line 924
    invoke-static {v2, v0}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 925
    .line 926
    .line 927
    move-result-object v0

    .line 928
    throw v0

    .line 929
    :cond_29
    const/4 v12, 0x0

    .line 930
    invoke-interface {v6, v0, v10, v12}, Ls2/C;->d(LN1/g;IZ)I

    .line 931
    .line 932
    .line 933
    move-result v10

    .line 934
    iget v12, v1, LM2/o;->q:I

    .line 935
    .line 936
    add-int/2addr v12, v10

    .line 937
    iput v12, v1, LM2/o;->q:I

    .line 938
    .line 939
    iget v12, v1, LM2/o;->r:I

    .line 940
    .line 941
    add-int/2addr v12, v10

    .line 942
    iput v12, v1, LM2/o;->r:I

    .line 943
    .line 944
    iget v12, v1, LM2/o;->s:I

    .line 945
    .line 946
    sub-int/2addr v12, v10

    .line 947
    iput v12, v1, LM2/o;->s:I

    .line 948
    .line 949
    goto :goto_17

    .line 950
    :cond_2a
    move v10, v8

    .line 951
    goto :goto_1a

    .line 952
    :cond_2b
    iget-object v2, v4, LN1/n;->n:Ljava/lang/String;

    .line 953
    .line 954
    const-string v4, "audio/ac4"

    .line 955
    .line 956
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 957
    .line 958
    .line 959
    move-result v2

    .line 960
    if-eqz v2, :cond_2d

    .line 961
    .line 962
    iget v2, v1, LM2/o;->r:I

    .line 963
    .line 964
    if-nez v2, :cond_2c

    .line 965
    .line 966
    invoke-static {v8, v15}, Ls2/a;->i(ILQ1/o;)V

    .line 967
    .line 968
    .line 969
    const/4 v4, 0x7

    .line 970
    invoke-interface {v6, v4, v15}, Ls2/C;->e(ILQ1/o;)V

    .line 971
    .line 972
    .line 973
    iget v2, v1, LM2/o;->r:I

    .line 974
    .line 975
    add-int/2addr v2, v4

    .line 976
    iput v2, v1, LM2/o;->r:I

    .line 977
    .line 978
    goto :goto_18

    .line 979
    :cond_2c
    const/4 v4, 0x7

    .line 980
    :goto_18
    add-int/2addr v8, v4

    .line 981
    goto :goto_19

    .line 982
    :cond_2d
    if-eqz v5, :cond_2e

    .line 983
    .line 984
    invoke-virtual {v5, v0}, LJ5/x;->f(Ls2/n;)V

    .line 985
    .line 986
    .line 987
    :cond_2e
    :goto_19
    iget v2, v1, LM2/o;->r:I

    .line 988
    .line 989
    if-ge v2, v8, :cond_2a

    .line 990
    .line 991
    sub-int v2, v8, v2

    .line 992
    .line 993
    const/4 v10, 0x0

    .line 994
    invoke-interface {v6, v0, v2, v10}, Ls2/C;->d(LN1/g;IZ)I

    .line 995
    .line 996
    .line 997
    move-result v2

    .line 998
    iget v4, v1, LM2/o;->q:I

    .line 999
    .line 1000
    add-int/2addr v4, v2

    .line 1001
    iput v4, v1, LM2/o;->q:I

    .line 1002
    .line 1003
    iget v4, v1, LM2/o;->r:I

    .line 1004
    .line 1005
    add-int/2addr v4, v2

    .line 1006
    iput v4, v1, LM2/o;->r:I

    .line 1007
    .line 1008
    iget v4, v1, LM2/o;->s:I

    .line 1009
    .line 1010
    sub-int/2addr v4, v2

    .line 1011
    iput v4, v1, LM2/o;->s:I

    .line 1012
    .line 1013
    goto :goto_19

    .line 1014
    :goto_1a
    iget-object v0, v7, LM2/v;->f:[J

    .line 1015
    .line 1016
    aget-wide v8, v0, v14

    .line 1017
    .line 1018
    iget-object v0, v7, LM2/v;->g:[I

    .line 1019
    .line 1020
    aget v0, v0, v14

    .line 1021
    .line 1022
    iget-boolean v2, v1, LM2/o;->t:Z

    .line 1023
    .line 1024
    if-nez v2, :cond_2f

    .line 1025
    .line 1026
    const/high16 v2, 0x4000000

    .line 1027
    .line 1028
    or-int/2addr v0, v2

    .line 1029
    :cond_2f
    if-eqz v5, :cond_30

    .line 1030
    .line 1031
    const/4 v12, 0x0

    .line 1032
    const/4 v13, 0x0

    .line 1033
    move v11, v10

    .line 1034
    move v10, v0

    .line 1035
    move-object v0, v7

    .line 1036
    move-object v7, v6

    .line 1037
    move-object v6, v5

    .line 1038
    invoke-virtual/range {v6 .. v13}, LJ5/x;->d(Ls2/C;JIIILs2/B;)V

    .line 1039
    .line 1040
    .line 1041
    move-object v2, v6

    .line 1042
    move-object v6, v7

    .line 1043
    const/16 v28, 0x1

    .line 1044
    .line 1045
    add-int/lit8 v14, v14, 0x1

    .line 1046
    .line 1047
    iget v0, v0, LM2/v;->b:I

    .line 1048
    .line 1049
    if-ne v14, v0, :cond_31

    .line 1050
    .line 1051
    const/4 v4, 0x0

    .line 1052
    invoke-virtual {v2, v6, v4}, LJ5/x;->b(Ls2/C;Ls2/B;)V

    .line 1053
    .line 1054
    .line 1055
    goto :goto_1b

    .line 1056
    :cond_30
    move-wide v7, v8

    .line 1057
    const/16 v28, 0x1

    .line 1058
    .line 1059
    move v9, v0

    .line 1060
    const/4 v11, 0x0

    .line 1061
    const/4 v12, 0x0

    .line 1062
    invoke-interface/range {v6 .. v12}, Ls2/C;->a(JIIILs2/B;)V

    .line 1063
    .line 1064
    .line 1065
    :cond_31
    :goto_1b
    iget v0, v3, LM2/n;->e:I

    .line 1066
    .line 1067
    add-int/lit8 v0, v0, 0x1

    .line 1068
    .line 1069
    iput v0, v3, LM2/n;->e:I

    .line 1070
    .line 1071
    const/4 v7, -0x1

    .line 1072
    iput v7, v1, LM2/o;->p:I

    .line 1073
    .line 1074
    const/4 v3, 0x0

    .line 1075
    iput v3, v1, LM2/o;->q:I

    .line 1076
    .line 1077
    iput v3, v1, LM2/o;->r:I

    .line 1078
    .line 1079
    iput v3, v1, LM2/o;->s:I

    .line 1080
    .line 1081
    and-int/lit8 v0, v19, 0x20

    .line 1082
    .line 1083
    if-nez v0, :cond_32

    .line 1084
    .line 1085
    const/4 v10, 0x1

    .line 1086
    goto :goto_1c

    .line 1087
    :cond_32
    move v10, v3

    .line 1088
    :goto_1c
    iput-boolean v10, v1, LM2/o;->t:Z

    .line 1089
    .line 1090
    return v3

    .line 1091
    :cond_33
    :goto_1d
    iput-wide v9, v2, LJ5/n;->a:J

    .line 1092
    .line 1093
    const/16 v28, 0x1

    .line 1094
    .line 1095
    return v28

    .line 1096
    :cond_34
    move v5, v4

    .line 1097
    const/4 v4, 0x7

    .line 1098
    iget-wide v6, v1, LM2/o;->m:J

    .line 1099
    .line 1100
    iget v3, v1, LM2/o;->n:I

    .line 1101
    .line 1102
    int-to-long v8, v3

    .line 1103
    sub-long/2addr v6, v8

    .line 1104
    invoke-interface {v0}, Ls2/n;->getPosition()J

    .line 1105
    .line 1106
    .line 1107
    move-result-wide v8

    .line 1108
    add-long/2addr v8, v6

    .line 1109
    iget-object v3, v1, LM2/o;->o:LQ1/o;

    .line 1110
    .line 1111
    if-eqz v3, :cond_3d

    .line 1112
    .line 1113
    iget-object v10, v3, LQ1/o;->a:[B

    .line 1114
    .line 1115
    iget v11, v1, LM2/o;->n:I

    .line 1116
    .line 1117
    long-to-int v6, v6

    .line 1118
    invoke-interface {v0, v10, v11, v6}, Ls2/n;->readFully([BII)V

    .line 1119
    .line 1120
    .line 1121
    iget v6, v1, LM2/o;->l:I

    .line 1122
    .line 1123
    const v7, 0x66747970

    .line 1124
    .line 1125
    .line 1126
    if-ne v6, v7, :cond_3c

    .line 1127
    .line 1128
    const/4 v15, 0x1

    .line 1129
    iput-boolean v15, v1, LM2/o;->u:Z

    .line 1130
    .line 1131
    const/16 v6, 0x8

    .line 1132
    .line 1133
    invoke-virtual {v3, v6}, LQ1/o;->G(I)V

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual {v3}, LQ1/o;->h()I

    .line 1137
    .line 1138
    .line 1139
    move-result v6

    .line 1140
    const v7, 0x71742020

    .line 1141
    .line 1142
    .line 1143
    const v10, 0x68656963

    .line 1144
    .line 1145
    .line 1146
    if-eq v6, v10, :cond_36

    .line 1147
    .line 1148
    if-eq v6, v7, :cond_35

    .line 1149
    .line 1150
    const/4 v6, 0x0

    .line 1151
    goto :goto_1e

    .line 1152
    :cond_35
    const/4 v6, 0x1

    .line 1153
    goto :goto_1e

    .line 1154
    :cond_36
    const/4 v6, 0x2

    .line 1155
    :goto_1e
    if-eqz v6, :cond_37

    .line 1156
    .line 1157
    goto :goto_20

    .line 1158
    :cond_37
    const/4 v6, 0x4

    .line 1159
    invoke-virtual {v3, v6}, LQ1/o;->H(I)V

    .line 1160
    .line 1161
    .line 1162
    :cond_38
    invoke-virtual {v3}, LQ1/o;->a()I

    .line 1163
    .line 1164
    .line 1165
    move-result v6

    .line 1166
    if-lez v6, :cond_3b

    .line 1167
    .line 1168
    invoke-virtual {v3}, LQ1/o;->h()I

    .line 1169
    .line 1170
    .line 1171
    move-result v6

    .line 1172
    if-eq v6, v10, :cond_3a

    .line 1173
    .line 1174
    if-eq v6, v7, :cond_39

    .line 1175
    .line 1176
    const/4 v6, 0x0

    .line 1177
    goto :goto_1f

    .line 1178
    :cond_39
    const/4 v6, 0x1

    .line 1179
    goto :goto_1f

    .line 1180
    :cond_3a
    const/4 v6, 0x2

    .line 1181
    :goto_1f
    if-eqz v6, :cond_38

    .line 1182
    .line 1183
    goto :goto_20

    .line 1184
    :cond_3b
    const/4 v6, 0x0

    .line 1185
    :goto_20
    iput v6, v1, LM2/o;->E:I

    .line 1186
    .line 1187
    goto :goto_21

    .line 1188
    :cond_3c
    invoke-virtual {v12}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1189
    .line 1190
    .line 1191
    move-result v6

    .line 1192
    if-nez v6, :cond_3f

    .line 1193
    .line 1194
    invoke-virtual {v12}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v6

    .line 1198
    check-cast v6, LR1/b;

    .line 1199
    .line 1200
    new-instance v7, LR1/c;

    .line 1201
    .line 1202
    iget v10, v1, LM2/o;->l:I

    .line 1203
    .line 1204
    invoke-direct {v7, v10, v3}, LR1/c;-><init>(ILQ1/o;)V

    .line 1205
    .line 1206
    .line 1207
    iget-object v3, v6, LR1/b;->d:Ljava/util/ArrayList;

    .line 1208
    .line 1209
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1210
    .line 1211
    .line 1212
    goto :goto_21

    .line 1213
    :cond_3d
    iget-boolean v3, v1, LM2/o;->u:Z

    .line 1214
    .line 1215
    if-nez v3, :cond_3e

    .line 1216
    .line 1217
    iget v3, v1, LM2/o;->l:I

    .line 1218
    .line 1219
    const v10, 0x6d646174

    .line 1220
    .line 1221
    .line 1222
    if-ne v3, v10, :cond_3e

    .line 1223
    .line 1224
    const/4 v15, 0x1

    .line 1225
    iput v15, v1, LM2/o;->E:I

    .line 1226
    .line 1227
    :cond_3e
    cmp-long v3, v6, v20

    .line 1228
    .line 1229
    if-gez v3, :cond_40

    .line 1230
    .line 1231
    long-to-int v3, v6

    .line 1232
    invoke-interface {v0, v3}, Ls2/n;->j(I)V

    .line 1233
    .line 1234
    .line 1235
    :cond_3f
    :goto_21
    const/4 v3, 0x0

    .line 1236
    goto :goto_22

    .line 1237
    :cond_40
    invoke-interface {v0}, Ls2/n;->getPosition()J

    .line 1238
    .line 1239
    .line 1240
    move-result-wide v10

    .line 1241
    add-long/2addr v10, v6

    .line 1242
    iput-wide v10, v2, LJ5/n;->a:J

    .line 1243
    .line 1244
    const/4 v3, 0x1

    .line 1245
    :goto_22
    invoke-virtual {v1, v8, v9}, LM2/o;->m(J)V

    .line 1246
    .line 1247
    .line 1248
    iget-boolean v6, v1, LM2/o;->v:Z

    .line 1249
    .line 1250
    if-eqz v6, :cond_41

    .line 1251
    .line 1252
    const/4 v15, 0x1

    .line 1253
    iput-boolean v15, v1, LM2/o;->x:Z

    .line 1254
    .line 1255
    iget-wide v6, v1, LM2/o;->w:J

    .line 1256
    .line 1257
    iput-wide v6, v2, LJ5/n;->a:J

    .line 1258
    .line 1259
    const/4 v3, 0x0

    .line 1260
    iput-boolean v3, v1, LM2/o;->v:Z

    .line 1261
    .line 1262
    const/4 v3, 0x1

    .line 1263
    :cond_41
    if-eqz v3, :cond_42

    .line 1264
    .line 1265
    iget v3, v1, LM2/o;->k:I

    .line 1266
    .line 1267
    const/4 v15, 0x2

    .line 1268
    if-eq v3, v15, :cond_42

    .line 1269
    .line 1270
    const/4 v3, 0x1

    .line 1271
    goto :goto_23

    .line 1272
    :cond_42
    const/4 v3, 0x0

    .line 1273
    :goto_23
    if-eqz v3, :cond_43

    .line 1274
    .line 1275
    const/4 v10, 0x1

    .line 1276
    :goto_24
    return v10

    .line 1277
    :cond_43
    move v4, v5

    .line 1278
    goto/16 :goto_0

    .line 1279
    .line 1280
    :cond_44
    move v5, v4

    .line 1281
    const/4 v4, 0x7

    .line 1282
    iget v3, v1, LM2/o;->n:I

    .line 1283
    .line 1284
    iget-object v6, v1, LM2/o;->f:LQ1/o;

    .line 1285
    .line 1286
    if-nez v3, :cond_48

    .line 1287
    .line 1288
    iget-object v3, v6, LQ1/o;->a:[B

    .line 1289
    .line 1290
    const/16 v7, 0x8

    .line 1291
    .line 1292
    const/4 v8, 0x0

    .line 1293
    invoke-interface {v0, v3, v8, v7, v10}, Ls2/n;->f([BIIZ)Z

    .line 1294
    .line 1295
    .line 1296
    move-result v3

    .line 1297
    if-nez v3, :cond_47

    .line 1298
    .line 1299
    iget v3, v1, LM2/o;->E:I

    .line 1300
    .line 1301
    const/4 v9, 0x2

    .line 1302
    if-ne v3, v9, :cond_46

    .line 1303
    .line 1304
    and-int/lit8 v3, v19, 0x2

    .line 1305
    .line 1306
    if-eqz v3, :cond_46

    .line 1307
    .line 1308
    iget-object v3, v1, LM2/o;->z:Ls2/o;

    .line 1309
    .line 1310
    const/4 v6, 0x4

    .line 1311
    invoke-interface {v3, v8, v6}, Ls2/o;->m(II)Ls2/C;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v3

    .line 1315
    iget-object v6, v1, LM2/o;->F:LH2/a;

    .line 1316
    .line 1317
    if-nez v6, :cond_45

    .line 1318
    .line 1319
    const/4 v13, 0x0

    .line 1320
    goto :goto_25

    .line 1321
    :cond_45
    new-instance v13, LN1/B;

    .line 1322
    .line 1323
    const/4 v15, 0x1

    .line 1324
    new-array v7, v15, [LN1/A;

    .line 1325
    .line 1326
    aput-object v6, v7, v8

    .line 1327
    .line 1328
    invoke-direct {v13, v7}, LN1/B;-><init>([LN1/A;)V

    .line 1329
    .line 1330
    .line 1331
    :goto_25
    new-instance v6, LN1/m;

    .line 1332
    .line 1333
    invoke-direct {v6}, LN1/m;-><init>()V

    .line 1334
    .line 1335
    .line 1336
    iput-object v13, v6, LN1/m;->k:LN1/B;

    .line 1337
    .line 1338
    invoke-static {v6, v3}, LVa/M6;->y(LN1/m;Ls2/C;)V

    .line 1339
    .line 1340
    .line 1341
    iget-object v3, v1, LM2/o;->z:Ls2/o;

    .line 1342
    .line 1343
    invoke-interface {v3}, Ls2/o;->l()V

    .line 1344
    .line 1345
    .line 1346
    iget-object v3, v1, LM2/o;->z:Ls2/o;

    .line 1347
    .line 1348
    new-instance v6, Ls2/q;

    .line 1349
    .line 1350
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    invoke-direct {v6, v7, v8}, Ls2/q;-><init>(J)V

    .line 1356
    .line 1357
    .line 1358
    invoke-interface {v3, v6}, Ls2/o;->s(Ls2/w;)V

    .line 1359
    .line 1360
    .line 1361
    :cond_46
    const/4 v3, 0x0

    .line 1362
    const/16 v4, 0x8

    .line 1363
    .line 1364
    const/4 v5, 0x4

    .line 1365
    const/4 v10, 0x1

    .line 1366
    const/4 v15, 0x0

    .line 1367
    goto/16 :goto_2f

    .line 1368
    .line 1369
    :cond_47
    const/16 v7, 0x8

    .line 1370
    .line 1371
    const/4 v9, 0x2

    .line 1372
    iput v7, v1, LM2/o;->n:I

    .line 1373
    .line 1374
    const/4 v3, 0x0

    .line 1375
    invoke-virtual {v6, v3}, LQ1/o;->G(I)V

    .line 1376
    .line 1377
    .line 1378
    invoke-virtual {v6}, LQ1/o;->w()J

    .line 1379
    .line 1380
    .line 1381
    move-result-wide v7

    .line 1382
    iput-wide v7, v1, LM2/o;->m:J

    .line 1383
    .line 1384
    invoke-virtual {v6}, LQ1/o;->h()I

    .line 1385
    .line 1386
    .line 1387
    move-result v3

    .line 1388
    iput v3, v1, LM2/o;->l:I

    .line 1389
    .line 1390
    goto :goto_26

    .line 1391
    :cond_48
    const/4 v9, 0x2

    .line 1392
    :goto_26
    iget-wide v7, v1, LM2/o;->m:J

    .line 1393
    .line 1394
    const-wide/16 v10, 0x1

    .line 1395
    .line 1396
    cmp-long v3, v7, v10

    .line 1397
    .line 1398
    if-nez v3, :cond_49

    .line 1399
    .line 1400
    iget-object v3, v6, LQ1/o;->a:[B

    .line 1401
    .line 1402
    const/16 v7, 0x8

    .line 1403
    .line 1404
    invoke-interface {v0, v3, v7, v7}, Ls2/n;->readFully([BII)V

    .line 1405
    .line 1406
    .line 1407
    iget v3, v1, LM2/o;->n:I

    .line 1408
    .line 1409
    add-int/2addr v3, v7

    .line 1410
    iput v3, v1, LM2/o;->n:I

    .line 1411
    .line 1412
    invoke-virtual {v6}, LQ1/o;->z()J

    .line 1413
    .line 1414
    .line 1415
    move-result-wide v7

    .line 1416
    iput-wide v7, v1, LM2/o;->m:J

    .line 1417
    .line 1418
    goto :goto_27

    .line 1419
    :cond_49
    const-wide/16 v26, 0x0

    .line 1420
    .line 1421
    cmp-long v3, v7, v26

    .line 1422
    .line 1423
    if-nez v3, :cond_4b

    .line 1424
    .line 1425
    invoke-interface {v0}, Ls2/n;->i()J

    .line 1426
    .line 1427
    .line 1428
    move-result-wide v7

    .line 1429
    cmp-long v3, v7, v16

    .line 1430
    .line 1431
    if-nez v3, :cond_4a

    .line 1432
    .line 1433
    invoke-virtual {v12}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v3

    .line 1437
    check-cast v3, LR1/b;

    .line 1438
    .line 1439
    if-eqz v3, :cond_4a

    .line 1440
    .line 1441
    iget-wide v7, v3, LR1/b;->c:J

    .line 1442
    .line 1443
    :cond_4a
    cmp-long v3, v7, v16

    .line 1444
    .line 1445
    if-eqz v3, :cond_4b

    .line 1446
    .line 1447
    invoke-interface {v0}, Ls2/n;->getPosition()J

    .line 1448
    .line 1449
    .line 1450
    move-result-wide v10

    .line 1451
    sub-long/2addr v7, v10

    .line 1452
    iget v3, v1, LM2/o;->n:I

    .line 1453
    .line 1454
    int-to-long v10, v3

    .line 1455
    add-long/2addr v7, v10

    .line 1456
    iput-wide v7, v1, LM2/o;->m:J

    .line 1457
    .line 1458
    :cond_4b
    :goto_27
    iget-wide v7, v1, LM2/o;->m:J

    .line 1459
    .line 1460
    iget v3, v1, LM2/o;->n:I

    .line 1461
    .line 1462
    int-to-long v10, v3

    .line 1463
    cmp-long v7, v7, v10

    .line 1464
    .line 1465
    if-ltz v7, :cond_57

    .line 1466
    .line 1467
    iget v7, v1, LM2/o;->l:I

    .line 1468
    .line 1469
    const v8, 0x68646c72    # 4.3148E24f

    .line 1470
    .line 1471
    .line 1472
    const v10, 0x6d6f6f76

    .line 1473
    .line 1474
    .line 1475
    const v11, 0x6d657461

    .line 1476
    .line 1477
    .line 1478
    if-eq v7, v10, :cond_4c

    .line 1479
    .line 1480
    const v10, 0x7472616b

    .line 1481
    .line 1482
    .line 1483
    if-eq v7, v10, :cond_4c

    .line 1484
    .line 1485
    const v10, 0x6d646961

    .line 1486
    .line 1487
    .line 1488
    if-eq v7, v10, :cond_4c

    .line 1489
    .line 1490
    const v10, 0x6d696e66

    .line 1491
    .line 1492
    .line 1493
    if-eq v7, v10, :cond_4c

    .line 1494
    .line 1495
    const v10, 0x7374626c

    .line 1496
    .line 1497
    .line 1498
    if-eq v7, v10, :cond_4c

    .line 1499
    .line 1500
    const v10, 0x65647473

    .line 1501
    .line 1502
    .line 1503
    if-eq v7, v10, :cond_4c

    .line 1504
    .line 1505
    if-eq v7, v11, :cond_4c

    .line 1506
    .line 1507
    const v10, 0x65647664

    .line 1508
    .line 1509
    .line 1510
    if-ne v7, v10, :cond_4d

    .line 1511
    .line 1512
    :cond_4c
    const/4 v10, 0x1

    .line 1513
    goto/16 :goto_2c

    .line 1514
    .line 1515
    :cond_4d
    const v10, 0x6d646864

    .line 1516
    .line 1517
    .line 1518
    if-eq v7, v10, :cond_4e

    .line 1519
    .line 1520
    const v10, 0x6d766864

    .line 1521
    .line 1522
    .line 1523
    if-eq v7, v10, :cond_4e

    .line 1524
    .line 1525
    if-eq v7, v8, :cond_4e

    .line 1526
    .line 1527
    const v8, 0x73747364

    .line 1528
    .line 1529
    .line 1530
    if-eq v7, v8, :cond_4e

    .line 1531
    .line 1532
    const v8, 0x73747473

    .line 1533
    .line 1534
    .line 1535
    if-eq v7, v8, :cond_4e

    .line 1536
    .line 1537
    const v8, 0x73747373

    .line 1538
    .line 1539
    .line 1540
    if-eq v7, v8, :cond_4e

    .line 1541
    .line 1542
    const v8, 0x63747473

    .line 1543
    .line 1544
    .line 1545
    if-eq v7, v8, :cond_4e

    .line 1546
    .line 1547
    const v8, 0x656c7374

    .line 1548
    .line 1549
    .line 1550
    if-eq v7, v8, :cond_4e

    .line 1551
    .line 1552
    const v8, 0x73747363

    .line 1553
    .line 1554
    .line 1555
    if-eq v7, v8, :cond_4e

    .line 1556
    .line 1557
    const v8, 0x7374737a

    .line 1558
    .line 1559
    .line 1560
    if-eq v7, v8, :cond_4e

    .line 1561
    .line 1562
    const v8, 0x73747a32

    .line 1563
    .line 1564
    .line 1565
    if-eq v7, v8, :cond_4e

    .line 1566
    .line 1567
    const v8, 0x7374636f

    .line 1568
    .line 1569
    .line 1570
    if-eq v7, v8, :cond_4e

    .line 1571
    .line 1572
    const v8, 0x636f3634

    .line 1573
    .line 1574
    .line 1575
    if-eq v7, v8, :cond_4e

    .line 1576
    .line 1577
    const v8, 0x746b6864

    .line 1578
    .line 1579
    .line 1580
    if-eq v7, v8, :cond_4e

    .line 1581
    .line 1582
    const v8, 0x66747970

    .line 1583
    .line 1584
    .line 1585
    if-eq v7, v8, :cond_4e

    .line 1586
    .line 1587
    const v8, 0x75647461

    .line 1588
    .line 1589
    .line 1590
    if-eq v7, v8, :cond_4e

    .line 1591
    .line 1592
    const v8, 0x6b657973

    .line 1593
    .line 1594
    .line 1595
    if-eq v7, v8, :cond_4e

    .line 1596
    .line 1597
    const v8, 0x696c7374

    .line 1598
    .line 1599
    .line 1600
    if-ne v7, v8, :cond_4f

    .line 1601
    .line 1602
    :cond_4e
    const/16 v7, 0x8

    .line 1603
    .line 1604
    goto :goto_29

    .line 1605
    :cond_4f
    invoke-interface {v0}, Ls2/n;->getPosition()J

    .line 1606
    .line 1607
    .line 1608
    move-result-wide v6

    .line 1609
    iget v3, v1, LM2/o;->n:I

    .line 1610
    .line 1611
    int-to-long v10, v3

    .line 1612
    sub-long v35, v6, v10

    .line 1613
    .line 1614
    iget v3, v1, LM2/o;->l:I

    .line 1615
    .line 1616
    const v6, 0x6d707664

    .line 1617
    .line 1618
    .line 1619
    if-ne v3, v6, :cond_50

    .line 1620
    .line 1621
    new-instance v32, LH2/a;

    .line 1622
    .line 1623
    add-long v39, v35, v10

    .line 1624
    .line 1625
    iget-wide v6, v1, LM2/o;->m:J

    .line 1626
    .line 1627
    sub-long v41, v6, v10

    .line 1628
    .line 1629
    const-wide/16 v33, 0x0

    .line 1630
    .line 1631
    const-wide v37, -0x7fffffffffffffffL    # -4.9E-324

    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    invoke-direct/range {v32 .. v42}, LH2/a;-><init>(JJJJJ)V

    .line 1637
    .line 1638
    .line 1639
    move-object/from16 v3, v32

    .line 1640
    .line 1641
    iput-object v3, v1, LM2/o;->F:LH2/a;

    .line 1642
    .line 1643
    :cond_50
    const/4 v3, 0x0

    .line 1644
    iput-object v3, v1, LM2/o;->o:LQ1/o;

    .line 1645
    .line 1646
    const/4 v15, 0x1

    .line 1647
    iput v15, v1, LM2/o;->k:I

    .line 1648
    .line 1649
    move v10, v15

    .line 1650
    :goto_28
    const/4 v3, 0x0

    .line 1651
    const/16 v4, 0x8

    .line 1652
    .line 1653
    const/4 v5, 0x4

    .line 1654
    goto/16 :goto_2e

    .line 1655
    .line 1656
    :goto_29
    if-ne v3, v7, :cond_51

    .line 1657
    .line 1658
    const/4 v15, 0x1

    .line 1659
    goto :goto_2a

    .line 1660
    :cond_51
    const/4 v15, 0x0

    .line 1661
    :goto_2a
    invoke-static {v15}, LQ1/k;->g(Z)V

    .line 1662
    .line 1663
    .line 1664
    iget-wide v7, v1, LM2/o;->m:J

    .line 1665
    .line 1666
    const-wide/32 v10, 0x7fffffff

    .line 1667
    .line 1668
    .line 1669
    cmp-long v3, v7, v10

    .line 1670
    .line 1671
    if-gtz v3, :cond_52

    .line 1672
    .line 1673
    const/4 v15, 0x1

    .line 1674
    goto :goto_2b

    .line 1675
    :cond_52
    const/4 v15, 0x0

    .line 1676
    :goto_2b
    invoke-static {v15}, LQ1/k;->g(Z)V

    .line 1677
    .line 1678
    .line 1679
    new-instance v3, LQ1/o;

    .line 1680
    .line 1681
    iget-wide v7, v1, LM2/o;->m:J

    .line 1682
    .line 1683
    long-to-int v7, v7

    .line 1684
    invoke-direct {v3, v7}, LQ1/o;-><init>(I)V

    .line 1685
    .line 1686
    .line 1687
    iget-object v6, v6, LQ1/o;->a:[B

    .line 1688
    .line 1689
    iget-object v7, v3, LQ1/o;->a:[B

    .line 1690
    .line 1691
    const/16 v8, 0x8

    .line 1692
    .line 1693
    const/4 v10, 0x0

    .line 1694
    invoke-static {v6, v10, v7, v10, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1695
    .line 1696
    .line 1697
    iput-object v3, v1, LM2/o;->o:LQ1/o;

    .line 1698
    .line 1699
    const/4 v10, 0x1

    .line 1700
    iput v10, v1, LM2/o;->k:I

    .line 1701
    .line 1702
    goto :goto_28

    .line 1703
    :goto_2c
    invoke-interface {v0}, Ls2/n;->getPosition()J

    .line 1704
    .line 1705
    .line 1706
    move-result-wide v6

    .line 1707
    iget-wide v13, v1, LM2/o;->m:J

    .line 1708
    .line 1709
    add-long/2addr v6, v13

    .line 1710
    iget v3, v1, LM2/o;->n:I

    .line 1711
    .line 1712
    int-to-long v4, v3

    .line 1713
    sub-long/2addr v6, v4

    .line 1714
    cmp-long v3, v13, v4

    .line 1715
    .line 1716
    if-eqz v3, :cond_54

    .line 1717
    .line 1718
    iget v3, v1, LM2/o;->l:I

    .line 1719
    .line 1720
    if-ne v3, v11, :cond_54

    .line 1721
    .line 1722
    const/16 v4, 0x8

    .line 1723
    .line 1724
    invoke-virtual {v15, v4}, LQ1/o;->D(I)V

    .line 1725
    .line 1726
    .line 1727
    iget-object v3, v15, LQ1/o;->a:[B

    .line 1728
    .line 1729
    const/4 v5, 0x0

    .line 1730
    invoke-interface {v0, v5, v4, v3}, Ls2/n;->a(II[B)V

    .line 1731
    .line 1732
    .line 1733
    sget-object v3, LM2/g;->a:[B

    .line 1734
    .line 1735
    iget v3, v15, LQ1/o;->b:I

    .line 1736
    .line 1737
    const/4 v5, 0x4

    .line 1738
    invoke-virtual {v15, v5}, LQ1/o;->H(I)V

    .line 1739
    .line 1740
    .line 1741
    invoke-virtual {v15}, LQ1/o;->h()I

    .line 1742
    .line 1743
    .line 1744
    move-result v11

    .line 1745
    if-eq v11, v8, :cond_53

    .line 1746
    .line 1747
    add-int/2addr v3, v5

    .line 1748
    :cond_53
    invoke-virtual {v15, v3}, LQ1/o;->G(I)V

    .line 1749
    .line 1750
    .line 1751
    iget v3, v15, LQ1/o;->b:I

    .line 1752
    .line 1753
    invoke-interface {v0, v3}, Ls2/n;->j(I)V

    .line 1754
    .line 1755
    .line 1756
    invoke-interface {v0}, Ls2/n;->e()V

    .line 1757
    .line 1758
    .line 1759
    goto :goto_2d

    .line 1760
    :cond_54
    const/16 v4, 0x8

    .line 1761
    .line 1762
    const/4 v5, 0x4

    .line 1763
    :goto_2d
    new-instance v3, LR1/b;

    .line 1764
    .line 1765
    iget v8, v1, LM2/o;->l:I

    .line 1766
    .line 1767
    invoke-direct {v3, v8, v6, v7}, LR1/b;-><init>(IJ)V

    .line 1768
    .line 1769
    .line 1770
    invoke-virtual {v12, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 1771
    .line 1772
    .line 1773
    iget-wide v11, v1, LM2/o;->m:J

    .line 1774
    .line 1775
    iget v3, v1, LM2/o;->n:I

    .line 1776
    .line 1777
    int-to-long v13, v3

    .line 1778
    cmp-long v3, v11, v13

    .line 1779
    .line 1780
    if-nez v3, :cond_55

    .line 1781
    .line 1782
    invoke-virtual {v1, v6, v7}, LM2/o;->m(J)V

    .line 1783
    .line 1784
    .line 1785
    const/4 v3, 0x0

    .line 1786
    goto :goto_2e

    .line 1787
    :cond_55
    const/4 v3, 0x0

    .line 1788
    iput v3, v1, LM2/o;->k:I

    .line 1789
    .line 1790
    iput v3, v1, LM2/o;->n:I

    .line 1791
    .line 1792
    :goto_2e
    move v15, v10

    .line 1793
    :goto_2f
    const/16 v24, -0x1

    .line 1794
    .line 1795
    if-nez v15, :cond_56

    .line 1796
    .line 1797
    :goto_30
    return v24

    .line 1798
    :cond_56
    move v6, v3

    .line 1799
    move v7, v5

    .line 1800
    const/4 v4, 0x3

    .line 1801
    goto/16 :goto_1

    .line 1802
    .line 1803
    :cond_57
    const-string v0, "Atom size less than header length (unsupported)."

    .line 1804
    .line 1805
    invoke-static {v0}, LN1/D;->c(Ljava/lang/String;)LN1/D;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v0

    .line 1809
    throw v0

    .line 1810
    nop

    .line 1811
    :sswitch_data_0
    .sparse-switch
        -0x6604662e -> :sswitch_4
        -0x4f6659e5 -> :sswitch_3
        -0x4a96a712 -> :sswitch_2
        -0x3182f331 -> :sswitch_1
        0x68f2d704 -> :sswitch_0
    .end sparse-switch

    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final m(J)V
    .locals 40

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x4

    .line 4
    const/16 v3, 0x8

    .line 5
    .line 6
    const/16 v5, 0x10

    .line 7
    .line 8
    const/16 v6, 0xc

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v8, 0x1

    .line 12
    :goto_0
    iget-object v9, v1, LM2/o;->g:Ljava/util/ArrayDeque;

    .line 13
    .line 14
    invoke-virtual {v9}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v10

    .line 18
    if-nez v10, :cond_6e

    .line 19
    .line 20
    invoke-virtual {v9}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v10

    .line 24
    check-cast v10, LR1/b;

    .line 25
    .line 26
    iget-wide v10, v10, LR1/b;->c:J

    .line 27
    .line 28
    cmp-long v10, v10, p1

    .line 29
    .line 30
    if-nez v10, :cond_6e

    .line 31
    .line 32
    invoke-virtual {v9}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v10

    .line 36
    move-object v11, v10

    .line 37
    check-cast v11, LR1/b;

    .line 38
    .line 39
    iget v10, v11, LH5/a;->b:I

    .line 40
    .line 41
    const v12, 0x6d6f6f76

    .line 42
    .line 43
    .line 44
    if-ne v10, v12, :cond_6c

    .line 45
    .line 46
    const v10, 0x6d657461

    .line 47
    .line 48
    .line 49
    invoke-virtual {v11, v10}, LR1/b;->o(I)LR1/b;

    .line 50
    .line 51
    .line 52
    move-result-object v12

    .line 53
    new-instance v13, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    const v14, 0x68646c72    # 4.3148E24f

    .line 59
    .line 60
    .line 61
    const v15, 0x64617461

    .line 62
    .line 63
    .line 64
    const v10, 0x696c7374

    .line 65
    .line 66
    .line 67
    const-wide/16 v19, 0x0

    .line 68
    .line 69
    move-object/from16 v17, v13

    .line 70
    .line 71
    iget v13, v1, LM2/o;->b:I

    .line 72
    .line 73
    move/from16 v18, v13

    .line 74
    .line 75
    if-eqz v12, :cond_12

    .line 76
    .line 77
    sget-object v21, LM2/g;->a:[B

    .line 78
    .line 79
    invoke-virtual {v12, v14}, LR1/b;->q(I)LR1/c;

    .line 80
    .line 81
    .line 82
    move-result-object v13

    .line 83
    const v14, 0x6b657973

    .line 84
    .line 85
    .line 86
    invoke-virtual {v12, v14}, LR1/b;->q(I)LR1/c;

    .line 87
    .line 88
    .line 89
    move-result-object v14

    .line 90
    invoke-virtual {v12, v10}, LR1/b;->q(I)LR1/c;

    .line 91
    .line 92
    .line 93
    move-result-object v12

    .line 94
    if-eqz v13, :cond_8

    .line 95
    .line 96
    if-eqz v14, :cond_8

    .line 97
    .line 98
    if-eqz v12, :cond_8

    .line 99
    .line 100
    iget-object v13, v13, LR1/c;->c:LQ1/o;

    .line 101
    .line 102
    invoke-virtual {v13, v5}, LQ1/o;->G(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v13}, LQ1/o;->h()I

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    move/from16 v23, v5

    .line 110
    .line 111
    const v5, 0x6d647461

    .line 112
    .line 113
    .line 114
    if-eq v13, v5, :cond_0

    .line 115
    .line 116
    :goto_1
    move/from16 v24, v6

    .line 117
    .line 118
    goto/16 :goto_7

    .line 119
    .line 120
    :cond_0
    iget-object v5, v14, LR1/c;->c:LQ1/o;

    .line 121
    .line 122
    invoke-virtual {v5, v6}, LQ1/o;->G(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5}, LQ1/o;->h()I

    .line 126
    .line 127
    .line 128
    move-result v13

    .line 129
    new-array v14, v13, [Ljava/lang/String;

    .line 130
    .line 131
    move/from16 v24, v6

    .line 132
    .line 133
    move v6, v7

    .line 134
    :goto_2
    if-ge v6, v13, :cond_1

    .line 135
    .line 136
    invoke-virtual {v5}, LQ1/o;->h()I

    .line 137
    .line 138
    .line 139
    move-result v25

    .line 140
    invoke-virtual {v5, v2}, LQ1/o;->H(I)V

    .line 141
    .line 142
    .line 143
    add-int/lit8 v10, v25, -0x8

    .line 144
    .line 145
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 146
    .line 147
    invoke-virtual {v5, v10, v2}, LQ1/o;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    aput-object v2, v14, v6

    .line 152
    .line 153
    add-int/2addr v6, v8

    .line 154
    const/4 v2, 0x4

    .line 155
    const v10, 0x696c7374

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_1
    iget-object v2, v12, LR1/c;->c:LQ1/o;

    .line 160
    .line 161
    invoke-virtual {v2, v3}, LQ1/o;->G(I)V

    .line 162
    .line 163
    .line 164
    new-instance v5, Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 167
    .line 168
    .line 169
    :goto_3
    invoke-virtual {v2}, LQ1/o;->a()I

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-le v6, v3, :cond_6

    .line 174
    .line 175
    iget v6, v2, LQ1/o;->b:I

    .line 176
    .line 177
    invoke-virtual {v2}, LQ1/o;->h()I

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    invoke-virtual {v2}, LQ1/o;->h()I

    .line 182
    .line 183
    .line 184
    move-result v12

    .line 185
    sub-int/2addr v12, v8

    .line 186
    if-ltz v12, :cond_4

    .line 187
    .line 188
    if-ge v12, v13, :cond_4

    .line 189
    .line 190
    aget-object v12, v14, v12

    .line 191
    .line 192
    add-int v3, v6, v10

    .line 193
    .line 194
    :goto_4
    iget v0, v2, LQ1/o;->b:I

    .line 195
    .line 196
    if-ge v0, v3, :cond_3

    .line 197
    .line 198
    invoke-virtual {v2}, LQ1/o;->h()I

    .line 199
    .line 200
    .line 201
    move-result v28

    .line 202
    invoke-virtual {v2}, LQ1/o;->h()I

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    if-ne v4, v15, :cond_2

    .line 207
    .line 208
    invoke-virtual {v2}, LQ1/o;->h()I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    invoke-virtual {v2}, LQ1/o;->h()I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    add-int/lit8 v4, v28, -0x10

    .line 217
    .line 218
    new-array v15, v4, [B

    .line 219
    .line 220
    invoke-virtual {v2, v7, v4, v15}, LQ1/o;->f(II[B)V

    .line 221
    .line 222
    .line 223
    new-instance v4, LR1/a;

    .line 224
    .line 225
    invoke-direct {v4, v12, v15, v3, v0}, LR1/a;-><init>(Ljava/lang/String;[BII)V

    .line 226
    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_2
    add-int v0, v0, v28

    .line 230
    .line 231
    invoke-virtual {v2, v0}, LQ1/o;->G(I)V

    .line 232
    .line 233
    .line 234
    const v15, 0x64617461

    .line 235
    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_3
    const/4 v4, 0x0

    .line 239
    :goto_5
    if-eqz v4, :cond_5

    .line 240
    .line 241
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_4
    const-string v0, "Skipped metadata with unknown key index: "

    .line 246
    .line 247
    const-string v3, "BoxParsers"

    .line 248
    .line 249
    invoke-static {v12, v0, v3}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    :cond_5
    :goto_6
    add-int/2addr v6, v10

    .line 253
    invoke-virtual {v2, v6}, LQ1/o;->G(I)V

    .line 254
    .line 255
    .line 256
    const/16 v3, 0x8

    .line 257
    .line 258
    const v15, 0x64617461

    .line 259
    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_6
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-eqz v0, :cond_7

    .line 267
    .line 268
    :goto_7
    const/4 v0, 0x0

    .line 269
    goto :goto_8

    .line 270
    :cond_7
    new-instance v0, LN1/B;

    .line 271
    .line 272
    invoke-direct {v0, v5}, LN1/B;-><init>(Ljava/util/List;)V

    .line 273
    .line 274
    .line 275
    goto :goto_8

    .line 276
    :cond_8
    move/from16 v23, v5

    .line 277
    .line 278
    goto/16 :goto_1

    .line 279
    .line 280
    :goto_8
    iget-boolean v2, v1, LM2/o;->x:Z

    .line 281
    .line 282
    if-eqz v2, :cond_f

    .line 283
    .line 284
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    const-string v2, "editable.tracks.samples.location"

    .line 288
    .line 289
    invoke-static {v0, v2}, LM2/r;->b(LN1/B;Ljava/lang/String;)LR1/a;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    if-eqz v2, :cond_9

    .line 294
    .line 295
    iget-object v2, v2, LR1/a;->b:[B

    .line 296
    .line 297
    aget-byte v2, v2, v7

    .line 298
    .line 299
    if-nez v2, :cond_9

    .line 300
    .line 301
    iget-wide v2, v1, LM2/o;->w:J

    .line 302
    .line 303
    const-wide/16 v4, 0x10

    .line 304
    .line 305
    add-long/2addr v2, v4

    .line 306
    iput-wide v2, v1, LM2/o;->y:J

    .line 307
    .line 308
    :cond_9
    const-string v2, "editable.tracks.map"

    .line 309
    .line 310
    invoke-static {v0, v2}, LM2/r;->b(LN1/B;Ljava/lang/String;)LR1/a;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    invoke-static {v2}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2}, LR1/a;->c()Ljava/util/ArrayList;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    new-instance v13, Ljava/util/ArrayList;

    .line 322
    .line 323
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    invoke-direct {v13, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 328
    .line 329
    .line 330
    move v3, v7

    .line 331
    :goto_9
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 332
    .line 333
    .line 334
    move-result v4

    .line 335
    if-ge v3, v4, :cond_e

    .line 336
    .line 337
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    check-cast v4, Ljava/lang/Integer;

    .line 342
    .line 343
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    if-eqz v4, :cond_d

    .line 348
    .line 349
    if-eq v4, v8, :cond_c

    .line 350
    .line 351
    const/4 v5, 0x2

    .line 352
    if-eq v4, v5, :cond_b

    .line 353
    .line 354
    const/4 v5, 0x3

    .line 355
    if-eq v4, v5, :cond_a

    .line 356
    .line 357
    move v4, v7

    .line 358
    goto :goto_a

    .line 359
    :cond_a
    const/4 v4, 0x4

    .line 360
    goto :goto_a

    .line 361
    :cond_b
    const/4 v4, 0x3

    .line 362
    goto :goto_a

    .line 363
    :cond_c
    const/4 v4, 0x2

    .line 364
    goto :goto_a

    .line 365
    :cond_d
    move v4, v8

    .line 366
    :goto_a
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 367
    .line 368
    .line 369
    move-result-object v4

    .line 370
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    add-int/2addr v3, v8

    .line 374
    goto :goto_9

    .line 375
    :cond_e
    move-object v2, v13

    .line 376
    goto :goto_c

    .line 377
    :cond_f
    if-nez v0, :cond_10

    .line 378
    .line 379
    goto :goto_b

    .line 380
    :cond_10
    and-int/lit8 v2, v18, 0x40

    .line 381
    .line 382
    if-eqz v2, :cond_11

    .line 383
    .line 384
    const-string v2, "editable.tracks.offset"

    .line 385
    .line 386
    invoke-static {v0, v2}, LM2/r;->b(LN1/B;Ljava/lang/String;)LR1/a;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    if-eqz v2, :cond_11

    .line 391
    .line 392
    new-instance v3, LQ1/o;

    .line 393
    .line 394
    iget-object v2, v2, LR1/a;->b:[B

    .line 395
    .line 396
    invoke-direct {v3, v2}, LQ1/o;-><init>([B)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v3}, LQ1/o;->z()J

    .line 400
    .line 401
    .line 402
    move-result-wide v2

    .line 403
    cmp-long v4, v2, v19

    .line 404
    .line 405
    if-lez v4, :cond_11

    .line 406
    .line 407
    iput-wide v2, v1, LM2/o;->w:J

    .line 408
    .line 409
    iput-boolean v8, v1, LM2/o;->v:Z

    .line 410
    .line 411
    move/from16 v32, v8

    .line 412
    .line 413
    move-object/from16 v34, v9

    .line 414
    .line 415
    const/4 v8, 0x3

    .line 416
    const/16 v27, 0x8

    .line 417
    .line 418
    goto/16 :goto_3a

    .line 419
    .line 420
    :cond_11
    :goto_b
    move-object/from16 v2, v17

    .line 421
    .line 422
    goto :goto_c

    .line 423
    :cond_12
    move/from16 v23, v5

    .line 424
    .line 425
    move/from16 v24, v6

    .line 426
    .line 427
    move-object/from16 v2, v17

    .line 428
    .line 429
    const/4 v0, 0x0

    .line 430
    :goto_c
    new-instance v3, Ljava/util/ArrayList;

    .line 431
    .line 432
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 433
    .line 434
    .line 435
    iget v4, v1, LM2/o;->E:I

    .line 436
    .line 437
    if-ne v4, v8, :cond_13

    .line 438
    .line 439
    move/from16 v17, v8

    .line 440
    .line 441
    goto :goto_d

    .line 442
    :cond_13
    move/from16 v17, v7

    .line 443
    .line 444
    :goto_d
    new-instance v12, Ls2/s;

    .line 445
    .line 446
    invoke-direct {v12}, Ls2/s;-><init>()V

    .line 447
    .line 448
    .line 449
    const v4, 0x75647461

    .line 450
    .line 451
    .line 452
    invoke-virtual {v11, v4}, LR1/b;->q(I)LR1/c;

    .line 453
    .line 454
    .line 455
    move-result-object v4

    .line 456
    if-eqz v4, :cond_51

    .line 457
    .line 458
    sget-object v6, LM2/g;->a:[B

    .line 459
    .line 460
    iget-object v4, v4, LR1/c;->c:LQ1/o;

    .line 461
    .line 462
    const/16 v6, 0x8

    .line 463
    .line 464
    invoke-virtual {v4, v6}, LQ1/o;->G(I)V

    .line 465
    .line 466
    .line 467
    new-instance v10, LN1/B;

    .line 468
    .line 469
    new-array v13, v7, [LN1/A;

    .line 470
    .line 471
    invoke-direct {v10, v13}, LN1/B;-><init>([LN1/A;)V

    .line 472
    .line 473
    .line 474
    :goto_e
    invoke-virtual {v4}, LQ1/o;->a()I

    .line 475
    .line 476
    .line 477
    move-result v13

    .line 478
    if-lt v13, v6, :cond_50

    .line 479
    .line 480
    iget v13, v4, LQ1/o;->b:I

    .line 481
    .line 482
    invoke-virtual {v4}, LQ1/o;->h()I

    .line 483
    .line 484
    .line 485
    move-result v14

    .line 486
    invoke-virtual {v4}, LQ1/o;->h()I

    .line 487
    .line 488
    .line 489
    move-result v15

    .line 490
    const v5, 0x6d657461

    .line 491
    .line 492
    .line 493
    if-ne v15, v5, :cond_3f

    .line 494
    .line 495
    invoke-virtual {v4, v13}, LQ1/o;->G(I)V

    .line 496
    .line 497
    .line 498
    add-int v15, v13, v14

    .line 499
    .line 500
    invoke-virtual {v4, v6}, LQ1/o;->H(I)V

    .line 501
    .line 502
    .line 503
    iget v6, v4, LQ1/o;->b:I

    .line 504
    .line 505
    const/4 v5, 0x4

    .line 506
    invoke-virtual {v4, v5}, LQ1/o;->H(I)V

    .line 507
    .line 508
    .line 509
    move/from16 v25, v5

    .line 510
    .line 511
    invoke-virtual {v4}, LQ1/o;->h()I

    .line 512
    .line 513
    .line 514
    move-result v5

    .line 515
    const v7, 0x68646c72    # 4.3148E24f

    .line 516
    .line 517
    .line 518
    if-eq v5, v7, :cond_14

    .line 519
    .line 520
    add-int/lit8 v6, v6, 0x4

    .line 521
    .line 522
    :cond_14
    invoke-virtual {v4, v6}, LQ1/o;->G(I)V

    .line 523
    .line 524
    .line 525
    :goto_f
    iget v5, v4, LQ1/o;->b:I

    .line 526
    .line 527
    if-ge v5, v15, :cond_3e

    .line 528
    .line 529
    invoke-virtual {v4}, LQ1/o;->h()I

    .line 530
    .line 531
    .line 532
    move-result v6

    .line 533
    invoke-virtual {v4}, LQ1/o;->h()I

    .line 534
    .line 535
    .line 536
    move-result v7

    .line 537
    move/from16 v32, v8

    .line 538
    .line 539
    const v8, 0x696c7374

    .line 540
    .line 541
    .line 542
    if-ne v7, v8, :cond_3d

    .line 543
    .line 544
    invoke-virtual {v4, v5}, LQ1/o;->G(I)V

    .line 545
    .line 546
    .line 547
    add-int/2addr v5, v6

    .line 548
    const/16 v6, 0x8

    .line 549
    .line 550
    invoke-virtual {v4, v6}, LQ1/o;->H(I)V

    .line 551
    .line 552
    .line 553
    new-instance v6, Ljava/util/ArrayList;

    .line 554
    .line 555
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 556
    .line 557
    .line 558
    :goto_10
    iget v7, v4, LQ1/o;->b:I

    .line 559
    .line 560
    if-ge v7, v5, :cond_3b

    .line 561
    .line 562
    const-string v15, "Skipped unknown metadata entry: "

    .line 563
    .line 564
    invoke-virtual {v4}, LQ1/o;->h()I

    .line 565
    .line 566
    .line 567
    move-result v26

    .line 568
    add-int v7, v26, v7

    .line 569
    .line 570
    invoke-virtual {v4}, LQ1/o;->h()I

    .line 571
    .line 572
    .line 573
    move-result v8

    .line 574
    move/from16 v33, v5

    .line 575
    .line 576
    shr-int/lit8 v5, v8, 0x18

    .line 577
    .line 578
    and-int/lit16 v5, v5, 0xff

    .line 579
    .line 580
    move-object/from16 v34, v9

    .line 581
    .line 582
    const/16 v9, 0xa9

    .line 583
    .line 584
    move/from16 v35, v14

    .line 585
    .line 586
    const-string v14, "MetadataUtil"

    .line 587
    .line 588
    move-object/from16 v36, v3

    .line 589
    .line 590
    const-string v3, "TCON"

    .line 591
    .line 592
    if-eq v5, v9, :cond_15

    .line 593
    .line 594
    const/16 v9, 0xfd

    .line 595
    .line 596
    if-ne v5, v9, :cond_16

    .line 597
    .line 598
    :cond_15
    const v5, 0x64617461

    .line 599
    .line 600
    .line 601
    goto/16 :goto_17

    .line 602
    .line 603
    :cond_16
    const v5, 0x676e7265

    .line 604
    .line 605
    .line 606
    if-ne v8, v5, :cond_18

    .line 607
    .line 608
    :try_start_0
    invoke-static {v4}, LM2/r;->g(LQ1/o;)I

    .line 609
    .line 610
    .line 611
    move-result v5

    .line 612
    add-int/lit8 v5, v5, -0x1

    .line 613
    .line 614
    invoke-static {v5}, LG2/k;->a(I)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v5

    .line 618
    if-eqz v5, :cond_17

    .line 619
    .line 620
    new-instance v8, LG2/o;

    .line 621
    .line 622
    invoke-static {v5}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 623
    .line 624
    .line 625
    move-result-object v5

    .line 626
    const/4 v9, 0x0

    .line 627
    invoke-direct {v8, v3, v9, v5}, LG2/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ll8/e0;)V

    .line 628
    .line 629
    .line 630
    goto :goto_12

    .line 631
    :cond_17
    const/4 v9, 0x0

    .line 632
    const-string v3, "Failed to parse standard genre code"

    .line 633
    .line 634
    invoke-static {v14, v3}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 635
    .line 636
    .line 637
    :goto_11
    move-object v8, v9

    .line 638
    :goto_12
    invoke-virtual {v4, v7}, LQ1/o;->G(I)V

    .line 639
    .line 640
    .line 641
    goto/16 :goto_1a

    .line 642
    .line 643
    :cond_18
    const/4 v9, 0x0

    .line 644
    const v3, 0x6469736b

    .line 645
    .line 646
    .line 647
    if-ne v8, v3, :cond_19

    .line 648
    .line 649
    :try_start_1
    const-string v3, "TPOS"

    .line 650
    .line 651
    invoke-static {v8, v4, v3}, LM2/r;->f(ILQ1/o;Ljava/lang/String;)LG2/o;

    .line 652
    .line 653
    .line 654
    move-result-object v8

    .line 655
    goto :goto_12

    .line 656
    :catchall_0
    move-exception v0

    .line 657
    goto/16 :goto_1b

    .line 658
    .line 659
    :cond_19
    const v3, 0x74726b6e

    .line 660
    .line 661
    .line 662
    if-ne v8, v3, :cond_1a

    .line 663
    .line 664
    const-string v3, "TRCK"

    .line 665
    .line 666
    invoke-static {v8, v4, v3}, LM2/r;->f(ILQ1/o;Ljava/lang/String;)LG2/o;

    .line 667
    .line 668
    .line 669
    move-result-object v8

    .line 670
    goto :goto_12

    .line 671
    :cond_1a
    const v3, 0x746d706f

    .line 672
    .line 673
    .line 674
    if-ne v8, v3, :cond_1b

    .line 675
    .line 676
    const-string v3, "TBPM"

    .line 677
    .line 678
    move/from16 v5, v32

    .line 679
    .line 680
    const/4 v14, 0x0

    .line 681
    invoke-static {v8, v3, v4, v5, v14}, LM2/r;->h(ILjava/lang/String;LQ1/o;ZZ)LG2/j;

    .line 682
    .line 683
    .line 684
    move-result-object v8

    .line 685
    goto :goto_12

    .line 686
    :cond_1b
    const v3, 0x6370696c

    .line 687
    .line 688
    .line 689
    if-ne v8, v3, :cond_1c

    .line 690
    .line 691
    const-string v3, "TCMP"

    .line 692
    .line 693
    const/4 v5, 0x1

    .line 694
    invoke-static {v8, v3, v4, v5, v5}, LM2/r;->h(ILjava/lang/String;LQ1/o;ZZ)LG2/j;

    .line 695
    .line 696
    .line 697
    move-result-object v8

    .line 698
    goto :goto_12

    .line 699
    :cond_1c
    const v3, 0x636f7672

    .line 700
    .line 701
    .line 702
    if-ne v8, v3, :cond_1d

    .line 703
    .line 704
    invoke-static {v4}, LM2/r;->e(LQ1/o;)LG2/a;

    .line 705
    .line 706
    .line 707
    move-result-object v8

    .line 708
    goto :goto_12

    .line 709
    :cond_1d
    const v3, 0x61415254

    .line 710
    .line 711
    .line 712
    if-ne v8, v3, :cond_1e

    .line 713
    .line 714
    const-string v3, "TPE2"

    .line 715
    .line 716
    invoke-static {v8, v4, v3}, LM2/r;->j(ILQ1/o;Ljava/lang/String;)LG2/o;

    .line 717
    .line 718
    .line 719
    move-result-object v8

    .line 720
    goto :goto_12

    .line 721
    :cond_1e
    const v3, 0x736f6e6d

    .line 722
    .line 723
    .line 724
    if-ne v8, v3, :cond_1f

    .line 725
    .line 726
    const-string v3, "TSOT"

    .line 727
    .line 728
    invoke-static {v8, v4, v3}, LM2/r;->j(ILQ1/o;Ljava/lang/String;)LG2/o;

    .line 729
    .line 730
    .line 731
    move-result-object v8

    .line 732
    goto :goto_12

    .line 733
    :cond_1f
    const v3, 0x736f616c

    .line 734
    .line 735
    .line 736
    if-ne v8, v3, :cond_20

    .line 737
    .line 738
    const-string v3, "TSOA"

    .line 739
    .line 740
    invoke-static {v8, v4, v3}, LM2/r;->j(ILQ1/o;Ljava/lang/String;)LG2/o;

    .line 741
    .line 742
    .line 743
    move-result-object v8

    .line 744
    goto :goto_12

    .line 745
    :cond_20
    const v3, 0x736f6172

    .line 746
    .line 747
    .line 748
    if-ne v8, v3, :cond_21

    .line 749
    .line 750
    const-string v3, "TSOP"

    .line 751
    .line 752
    invoke-static {v8, v4, v3}, LM2/r;->j(ILQ1/o;Ljava/lang/String;)LG2/o;

    .line 753
    .line 754
    .line 755
    move-result-object v8

    .line 756
    goto :goto_12

    .line 757
    :cond_21
    const v3, 0x736f6161

    .line 758
    .line 759
    .line 760
    if-ne v8, v3, :cond_22

    .line 761
    .line 762
    const-string v3, "TSO2"

    .line 763
    .line 764
    invoke-static {v8, v4, v3}, LM2/r;->j(ILQ1/o;Ljava/lang/String;)LG2/o;

    .line 765
    .line 766
    .line 767
    move-result-object v8

    .line 768
    goto/16 :goto_12

    .line 769
    .line 770
    :cond_22
    const v3, 0x736f636f

    .line 771
    .line 772
    .line 773
    if-ne v8, v3, :cond_23

    .line 774
    .line 775
    const-string v3, "TSOC"

    .line 776
    .line 777
    invoke-static {v8, v4, v3}, LM2/r;->j(ILQ1/o;Ljava/lang/String;)LG2/o;

    .line 778
    .line 779
    .line 780
    move-result-object v8

    .line 781
    goto/16 :goto_12

    .line 782
    .line 783
    :cond_23
    const v3, 0x72746e67

    .line 784
    .line 785
    .line 786
    if-ne v8, v3, :cond_24

    .line 787
    .line 788
    const-string v3, "ITUNESADVISORY"

    .line 789
    .line 790
    const/4 v14, 0x0

    .line 791
    invoke-static {v8, v3, v4, v14, v14}, LM2/r;->h(ILjava/lang/String;LQ1/o;ZZ)LG2/j;

    .line 792
    .line 793
    .line 794
    move-result-object v8

    .line 795
    goto/16 :goto_12

    .line 796
    .line 797
    :cond_24
    const v3, 0x70676170

    .line 798
    .line 799
    .line 800
    if-ne v8, v3, :cond_25

    .line 801
    .line 802
    const-string v3, "ITUNESGAPLESS"

    .line 803
    .line 804
    const/4 v5, 0x1

    .line 805
    const/4 v14, 0x0

    .line 806
    invoke-static {v8, v3, v4, v14, v5}, LM2/r;->h(ILjava/lang/String;LQ1/o;ZZ)LG2/j;

    .line 807
    .line 808
    .line 809
    move-result-object v8

    .line 810
    goto/16 :goto_12

    .line 811
    .line 812
    :cond_25
    const v3, 0x736f736e

    .line 813
    .line 814
    .line 815
    if-ne v8, v3, :cond_26

    .line 816
    .line 817
    const-string v3, "TVSHOWSORT"

    .line 818
    .line 819
    invoke-static {v8, v4, v3}, LM2/r;->j(ILQ1/o;Ljava/lang/String;)LG2/o;

    .line 820
    .line 821
    .line 822
    move-result-object v8

    .line 823
    goto/16 :goto_12

    .line 824
    .line 825
    :cond_26
    const v3, 0x74767368

    .line 826
    .line 827
    .line 828
    if-ne v8, v3, :cond_27

    .line 829
    .line 830
    const-string v3, "TVSHOW"

    .line 831
    .line 832
    invoke-static {v8, v4, v3}, LM2/r;->j(ILQ1/o;Ljava/lang/String;)LG2/o;

    .line 833
    .line 834
    .line 835
    move-result-object v8

    .line 836
    goto/16 :goto_12

    .line 837
    .line 838
    :cond_27
    const v3, 0x2d2d2d2d

    .line 839
    .line 840
    .line 841
    if-ne v8, v3, :cond_37

    .line 842
    .line 843
    move-object v8, v9

    .line 844
    move-object v14, v8

    .line 845
    const/4 v3, -0x1

    .line 846
    const/4 v5, -0x1

    .line 847
    :goto_13
    iget v15, v4, LQ1/o;->b:I

    .line 848
    .line 849
    if-ge v15, v7, :cond_2b

    .line 850
    .line 851
    invoke-virtual {v4}, LQ1/o;->h()I

    .line 852
    .line 853
    .line 854
    move-result v21

    .line 855
    invoke-virtual {v4}, LQ1/o;->h()I

    .line 856
    .line 857
    .line 858
    move-result v9

    .line 859
    move/from16 v37, v5

    .line 860
    .line 861
    const/4 v5, 0x4

    .line 862
    invoke-virtual {v4, v5}, LQ1/o;->H(I)V

    .line 863
    .line 864
    .line 865
    const v5, 0x6d65616e

    .line 866
    .line 867
    .line 868
    if-ne v9, v5, :cond_28

    .line 869
    .line 870
    add-int/lit8 v5, v21, -0xc

    .line 871
    .line 872
    invoke-virtual {v4, v5}, LQ1/o;->q(I)Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    move-result-object v8

    .line 876
    :goto_14
    const v5, 0x64617461

    .line 877
    .line 878
    .line 879
    goto :goto_15

    .line 880
    :cond_28
    const v5, 0x6e616d65

    .line 881
    .line 882
    .line 883
    if-ne v9, v5, :cond_29

    .line 884
    .line 885
    add-int/lit8 v5, v21, -0xc

    .line 886
    .line 887
    invoke-virtual {v4, v5}, LQ1/o;->q(I)Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v14

    .line 891
    goto :goto_14

    .line 892
    :cond_29
    const v5, 0x64617461

    .line 893
    .line 894
    .line 895
    if-ne v9, v5, :cond_2a

    .line 896
    .line 897
    move v3, v15

    .line 898
    move/from16 v37, v21

    .line 899
    .line 900
    :cond_2a
    add-int/lit8 v9, v21, -0xc

    .line 901
    .line 902
    invoke-virtual {v4, v9}, LQ1/o;->H(I)V

    .line 903
    .line 904
    .line 905
    :goto_15
    move/from16 v5, v37

    .line 906
    .line 907
    const/4 v9, 0x0

    .line 908
    goto :goto_13

    .line 909
    :cond_2b
    move/from16 v37, v5

    .line 910
    .line 911
    const v5, 0x64617461

    .line 912
    .line 913
    .line 914
    if-eqz v8, :cond_2d

    .line 915
    .line 916
    if-eqz v14, :cond_2d

    .line 917
    .line 918
    const/4 v9, -0x1

    .line 919
    if-ne v3, v9, :cond_2c

    .line 920
    .line 921
    goto :goto_16

    .line 922
    :cond_2c
    invoke-virtual {v4, v3}, LQ1/o;->G(I)V

    .line 923
    .line 924
    .line 925
    move/from16 v3, v23

    .line 926
    .line 927
    invoke-virtual {v4, v3}, LQ1/o;->H(I)V

    .line 928
    .line 929
    .line 930
    add-int/lit8 v9, v37, -0x10

    .line 931
    .line 932
    invoke-virtual {v4, v9}, LQ1/o;->q(I)Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object v3

    .line 936
    new-instance v9, LG2/l;

    .line 937
    .line 938
    invoke-direct {v9, v8, v14, v3}, LG2/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 939
    .line 940
    .line 941
    goto/16 :goto_11

    .line 942
    .line 943
    :cond_2d
    :goto_16
    const/4 v8, 0x0

    .line 944
    goto/16 :goto_12

    .line 945
    .line 946
    :goto_17
    const v9, 0xffffff

    .line 947
    .line 948
    .line 949
    and-int/2addr v9, v8

    .line 950
    const v5, 0x636d74

    .line 951
    .line 952
    .line 953
    if-ne v9, v5, :cond_2e

    .line 954
    .line 955
    invoke-static {v8, v4}, LM2/r;->d(ILQ1/o;)LG2/e;

    .line 956
    .line 957
    .line 958
    move-result-object v8

    .line 959
    goto/16 :goto_12

    .line 960
    .line 961
    :cond_2e
    const v5, 0x6e616d

    .line 962
    .line 963
    .line 964
    if-eq v9, v5, :cond_39

    .line 965
    .line 966
    const v5, 0x74726b

    .line 967
    .line 968
    .line 969
    if-ne v9, v5, :cond_2f

    .line 970
    .line 971
    goto/16 :goto_19

    .line 972
    .line 973
    :cond_2f
    const v5, 0x636f6d

    .line 974
    .line 975
    .line 976
    if-eq v9, v5, :cond_38

    .line 977
    .line 978
    const v5, 0x777274

    .line 979
    .line 980
    .line 981
    if-ne v9, v5, :cond_30

    .line 982
    .line 983
    goto/16 :goto_18

    .line 984
    .line 985
    :cond_30
    const v5, 0x646179

    .line 986
    .line 987
    .line 988
    if-ne v9, v5, :cond_31

    .line 989
    .line 990
    const-string v3, "TDRC"

    .line 991
    .line 992
    invoke-static {v8, v4, v3}, LM2/r;->j(ILQ1/o;Ljava/lang/String;)LG2/o;

    .line 993
    .line 994
    .line 995
    move-result-object v8

    .line 996
    goto/16 :goto_12

    .line 997
    .line 998
    :cond_31
    const v5, 0x415254

    .line 999
    .line 1000
    .line 1001
    if-ne v9, v5, :cond_32

    .line 1002
    .line 1003
    const-string v3, "TPE1"

    .line 1004
    .line 1005
    invoke-static {v8, v4, v3}, LM2/r;->j(ILQ1/o;Ljava/lang/String;)LG2/o;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v8

    .line 1009
    goto/16 :goto_12

    .line 1010
    .line 1011
    :cond_32
    const v5, 0x746f6f

    .line 1012
    .line 1013
    .line 1014
    if-ne v9, v5, :cond_33

    .line 1015
    .line 1016
    const-string v3, "TSSE"

    .line 1017
    .line 1018
    invoke-static {v8, v4, v3}, LM2/r;->j(ILQ1/o;Ljava/lang/String;)LG2/o;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v8

    .line 1022
    goto/16 :goto_12

    .line 1023
    .line 1024
    :cond_33
    const v5, 0x616c62

    .line 1025
    .line 1026
    .line 1027
    if-ne v9, v5, :cond_34

    .line 1028
    .line 1029
    const-string v3, "TALB"

    .line 1030
    .line 1031
    invoke-static {v8, v4, v3}, LM2/r;->j(ILQ1/o;Ljava/lang/String;)LG2/o;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v8

    .line 1035
    goto/16 :goto_12

    .line 1036
    .line 1037
    :cond_34
    const v5, 0x6c7972

    .line 1038
    .line 1039
    .line 1040
    if-ne v9, v5, :cond_35

    .line 1041
    .line 1042
    const-string v3, "USLT"

    .line 1043
    .line 1044
    invoke-static {v8, v4, v3}, LM2/r;->j(ILQ1/o;Ljava/lang/String;)LG2/o;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v8

    .line 1048
    goto/16 :goto_12

    .line 1049
    .line 1050
    :cond_35
    const v5, 0x67656e

    .line 1051
    .line 1052
    .line 1053
    if-ne v9, v5, :cond_36

    .line 1054
    .line 1055
    invoke-static {v8, v4, v3}, LM2/r;->j(ILQ1/o;Ljava/lang/String;)LG2/o;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v8

    .line 1059
    goto/16 :goto_12

    .line 1060
    .line 1061
    :cond_36
    const v3, 0x677270

    .line 1062
    .line 1063
    .line 1064
    if-ne v9, v3, :cond_37

    .line 1065
    .line 1066
    const-string v3, "TIT1"

    .line 1067
    .line 1068
    invoke-static {v8, v4, v3}, LM2/r;->j(ILQ1/o;Ljava/lang/String;)LG2/o;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v8

    .line 1072
    goto/16 :goto_12

    .line 1073
    .line 1074
    :cond_37
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1075
    .line 1076
    invoke-direct {v3, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1077
    .line 1078
    .line 1079
    invoke-static {v8}, LH5/a;->f(I)Ljava/lang/String;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v5

    .line 1083
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1084
    .line 1085
    .line 1086
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v3

    .line 1090
    invoke-static {v14, v3}, LQ1/k;->j(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v4, v7}, LQ1/o;->G(I)V

    .line 1094
    .line 1095
    .line 1096
    const/4 v8, 0x0

    .line 1097
    goto :goto_1a

    .line 1098
    :cond_38
    :goto_18
    :try_start_2
    const-string v3, "TCOM"

    .line 1099
    .line 1100
    invoke-static {v8, v4, v3}, LM2/r;->j(ILQ1/o;Ljava/lang/String;)LG2/o;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v8

    .line 1104
    goto/16 :goto_12

    .line 1105
    .line 1106
    :cond_39
    :goto_19
    const-string v3, "TIT2"

    .line 1107
    .line 1108
    invoke-static {v8, v4, v3}, LM2/r;->j(ILQ1/o;Ljava/lang/String;)LG2/o;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1112
    goto/16 :goto_12

    .line 1113
    .line 1114
    :goto_1a
    if-eqz v8, :cond_3a

    .line 1115
    .line 1116
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1117
    .line 1118
    .line 1119
    :cond_3a
    move/from16 v5, v33

    .line 1120
    .line 1121
    move-object/from16 v9, v34

    .line 1122
    .line 1123
    move/from16 v14, v35

    .line 1124
    .line 1125
    move-object/from16 v3, v36

    .line 1126
    .line 1127
    const v8, 0x696c7374

    .line 1128
    .line 1129
    .line 1130
    const/16 v23, 0x10

    .line 1131
    .line 1132
    const/16 v32, 0x1

    .line 1133
    .line 1134
    goto/16 :goto_10

    .line 1135
    .line 1136
    :goto_1b
    invoke-virtual {v4, v7}, LQ1/o;->G(I)V

    .line 1137
    .line 1138
    .line 1139
    throw v0

    .line 1140
    :cond_3b
    move-object/from16 v36, v3

    .line 1141
    .line 1142
    move-object/from16 v34, v9

    .line 1143
    .line 1144
    move/from16 v35, v14

    .line 1145
    .line 1146
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1147
    .line 1148
    .line 1149
    move-result v3

    .line 1150
    if-eqz v3, :cond_3c

    .line 1151
    .line 1152
    const/4 v3, 0x0

    .line 1153
    :goto_1c
    const v30, 0x64617461

    .line 1154
    .line 1155
    .line 1156
    goto :goto_1d

    .line 1157
    :cond_3c
    new-instance v3, LN1/B;

    .line 1158
    .line 1159
    invoke-direct {v3, v6}, LN1/B;-><init>(Ljava/util/List;)V

    .line 1160
    .line 1161
    .line 1162
    goto :goto_1c

    .line 1163
    :cond_3d
    move-object/from16 v36, v3

    .line 1164
    .line 1165
    move-object/from16 v34, v9

    .line 1166
    .line 1167
    move/from16 v35, v14

    .line 1168
    .line 1169
    const v30, 0x64617461

    .line 1170
    .line 1171
    .line 1172
    add-int/2addr v5, v6

    .line 1173
    invoke-virtual {v4, v5}, LQ1/o;->G(I)V

    .line 1174
    .line 1175
    .line 1176
    const v7, 0x68646c72    # 4.3148E24f

    .line 1177
    .line 1178
    .line 1179
    const/4 v8, 0x1

    .line 1180
    const/16 v23, 0x10

    .line 1181
    .line 1182
    goto/16 :goto_f

    .line 1183
    .line 1184
    :cond_3e
    move-object/from16 v36, v3

    .line 1185
    .line 1186
    move-object/from16 v34, v9

    .line 1187
    .line 1188
    move/from16 v35, v14

    .line 1189
    .line 1190
    const v30, 0x64617461

    .line 1191
    .line 1192
    .line 1193
    const/4 v3, 0x0

    .line 1194
    :goto_1d
    invoke-virtual {v10, v3}, LN1/B;->e(LN1/B;)LN1/B;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v3

    .line 1198
    move-object v10, v3

    .line 1199
    move/from16 v9, v24

    .line 1200
    .line 1201
    const/4 v6, 0x4

    .line 1202
    goto/16 :goto_28

    .line 1203
    .line 1204
    :cond_3f
    move-object/from16 v36, v3

    .line 1205
    .line 1206
    move-object/from16 v34, v9

    .line 1207
    .line 1208
    move/from16 v35, v14

    .line 1209
    .line 1210
    const v30, 0x64617461

    .line 1211
    .line 1212
    .line 1213
    const v3, 0x736d7461

    .line 1214
    .line 1215
    .line 1216
    if-ne v15, v3, :cond_4e

    .line 1217
    .line 1218
    invoke-virtual {v4, v13}, LQ1/o;->G(I)V

    .line 1219
    .line 1220
    .line 1221
    add-int v14, v13, v35

    .line 1222
    .line 1223
    move/from16 v3, v24

    .line 1224
    .line 1225
    invoke-virtual {v4, v3}, LQ1/o;->H(I)V

    .line 1226
    .line 1227
    .line 1228
    :goto_1e
    iget v3, v4, LQ1/o;->b:I

    .line 1229
    .line 1230
    if-ge v3, v14, :cond_4d

    .line 1231
    .line 1232
    invoke-virtual {v4}, LQ1/o;->h()I

    .line 1233
    .line 1234
    .line 1235
    move-result v5

    .line 1236
    invoke-virtual {v4}, LQ1/o;->h()I

    .line 1237
    .line 1238
    .line 1239
    move-result v6

    .line 1240
    const v7, 0x73617574

    .line 1241
    .line 1242
    .line 1243
    if-ne v6, v7, :cond_4c

    .line 1244
    .line 1245
    const/16 v6, 0x10

    .line 1246
    .line 1247
    if-ge v5, v6, :cond_40

    .line 1248
    .line 1249
    const/4 v5, 0x0

    .line 1250
    const/4 v6, 0x4

    .line 1251
    const/16 v9, 0xc

    .line 1252
    .line 1253
    goto/16 :goto_25

    .line 1254
    .line 1255
    :cond_40
    const/4 v6, 0x4

    .line 1256
    invoke-virtual {v4, v6}, LQ1/o;->H(I)V

    .line 1257
    .line 1258
    .line 1259
    const/4 v3, -0x1

    .line 1260
    const/4 v5, 0x0

    .line 1261
    const/4 v7, 0x0

    .line 1262
    :goto_1f
    const/4 v8, 0x2

    .line 1263
    if-ge v5, v8, :cond_43

    .line 1264
    .line 1265
    invoke-virtual {v4}, LQ1/o;->u()I

    .line 1266
    .line 1267
    .line 1268
    move-result v8

    .line 1269
    invoke-virtual {v4}, LQ1/o;->u()I

    .line 1270
    .line 1271
    .line 1272
    move-result v9

    .line 1273
    if-nez v8, :cond_41

    .line 1274
    .line 1275
    move v3, v9

    .line 1276
    const/4 v15, 0x1

    .line 1277
    goto :goto_20

    .line 1278
    :cond_41
    const/4 v15, 0x1

    .line 1279
    if-ne v8, v15, :cond_42

    .line 1280
    .line 1281
    move v7, v9

    .line 1282
    :cond_42
    :goto_20
    add-int/2addr v5, v15

    .line 1283
    goto :goto_1f

    .line 1284
    :cond_43
    const v5, -0x7fffffff

    .line 1285
    .line 1286
    .line 1287
    const/16 v8, 0xc

    .line 1288
    .line 1289
    if-ne v3, v8, :cond_44

    .line 1290
    .line 1291
    const/16 v3, 0xf0

    .line 1292
    .line 1293
    :goto_21
    const/16 v9, 0xc

    .line 1294
    .line 1295
    goto :goto_23

    .line 1296
    :cond_44
    const/16 v8, 0xd

    .line 1297
    .line 1298
    if-ne v3, v8, :cond_45

    .line 1299
    .line 1300
    const/16 v3, 0x78

    .line 1301
    .line 1302
    goto :goto_21

    .line 1303
    :cond_45
    const/16 v8, 0x15

    .line 1304
    .line 1305
    if-eq v3, v8, :cond_46

    .line 1306
    .line 1307
    move v3, v5

    .line 1308
    goto :goto_21

    .line 1309
    :cond_46
    invoke-virtual {v4}, LQ1/o;->a()I

    .line 1310
    .line 1311
    .line 1312
    move-result v3

    .line 1313
    const/16 v8, 0x8

    .line 1314
    .line 1315
    if-lt v3, v8, :cond_47

    .line 1316
    .line 1317
    iget v3, v4, LQ1/o;->b:I

    .line 1318
    .line 1319
    add-int/2addr v3, v8

    .line 1320
    if-le v3, v14, :cond_48

    .line 1321
    .line 1322
    :cond_47
    const/16 v9, 0xc

    .line 1323
    .line 1324
    goto :goto_22

    .line 1325
    :cond_48
    invoke-virtual {v4}, LQ1/o;->h()I

    .line 1326
    .line 1327
    .line 1328
    move-result v3

    .line 1329
    invoke-virtual {v4}, LQ1/o;->h()I

    .line 1330
    .line 1331
    .line 1332
    move-result v8

    .line 1333
    const/16 v9, 0xc

    .line 1334
    .line 1335
    if-lt v3, v9, :cond_4a

    .line 1336
    .line 1337
    const v3, 0x73726672

    .line 1338
    .line 1339
    .line 1340
    if-eq v8, v3, :cond_49

    .line 1341
    .line 1342
    goto :goto_22

    .line 1343
    :cond_49
    invoke-virtual {v4}, LQ1/o;->v()I

    .line 1344
    .line 1345
    .line 1346
    move-result v3

    .line 1347
    goto :goto_23

    .line 1348
    :cond_4a
    :goto_22
    move v3, v5

    .line 1349
    :goto_23
    if-ne v3, v5, :cond_4b

    .line 1350
    .line 1351
    :goto_24
    const/4 v5, 0x0

    .line 1352
    goto :goto_25

    .line 1353
    :cond_4b
    new-instance v5, LN1/B;

    .line 1354
    .line 1355
    new-instance v8, LH2/d;

    .line 1356
    .line 1357
    int-to-float v3, v3

    .line 1358
    invoke-direct {v8, v3, v7}, LH2/d;-><init>(FI)V

    .line 1359
    .line 1360
    .line 1361
    const/4 v15, 0x1

    .line 1362
    new-array v3, v15, [LN1/A;

    .line 1363
    .line 1364
    const/16 v31, 0x0

    .line 1365
    .line 1366
    aput-object v8, v3, v31

    .line 1367
    .line 1368
    invoke-direct {v5, v3}, LN1/B;-><init>([LN1/A;)V

    .line 1369
    .line 1370
    .line 1371
    goto :goto_25

    .line 1372
    :cond_4c
    const/4 v6, 0x4

    .line 1373
    const/16 v9, 0xc

    .line 1374
    .line 1375
    add-int/2addr v3, v5

    .line 1376
    invoke-virtual {v4, v3}, LQ1/o;->G(I)V

    .line 1377
    .line 1378
    .line 1379
    goto/16 :goto_1e

    .line 1380
    .line 1381
    :cond_4d
    const/4 v6, 0x4

    .line 1382
    const/16 v9, 0xc

    .line 1383
    .line 1384
    goto :goto_24

    .line 1385
    :goto_25
    invoke-virtual {v10, v5}, LN1/B;->e(LN1/B;)LN1/B;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v3

    .line 1389
    :goto_26
    move-object v10, v3

    .line 1390
    goto :goto_28

    .line 1391
    :cond_4e
    move/from16 v9, v24

    .line 1392
    .line 1393
    const/4 v6, 0x4

    .line 1394
    const v3, -0x56878686

    .line 1395
    .line 1396
    .line 1397
    if-ne v15, v3, :cond_4f

    .line 1398
    .line 1399
    invoke-virtual {v4}, LQ1/o;->r()S

    .line 1400
    .line 1401
    .line 1402
    move-result v3

    .line 1403
    const/4 v5, 0x2

    .line 1404
    invoke-virtual {v4, v5}, LQ1/o;->H(I)V

    .line 1405
    .line 1406
    .line 1407
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 1408
    .line 1409
    invoke-virtual {v4, v3, v5}, LQ1/o;->s(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v3

    .line 1413
    const/16 v5, 0x2b

    .line 1414
    .line 1415
    invoke-virtual {v3, v5}, Ljava/lang/String;->lastIndexOf(I)I

    .line 1416
    .line 1417
    .line 1418
    move-result v5

    .line 1419
    const/16 v7, 0x2d

    .line 1420
    .line 1421
    invoke-virtual {v3, v7}, Ljava/lang/String;->lastIndexOf(I)I

    .line 1422
    .line 1423
    .line 1424
    move-result v7

    .line 1425
    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    .line 1426
    .line 1427
    .line 1428
    move-result v5

    .line 1429
    const/4 v14, 0x0

    .line 1430
    :try_start_3
    invoke-virtual {v3, v14, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v7

    .line 1434
    invoke-static {v7}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 1435
    .line 1436
    .line 1437
    move-result v7

    .line 1438
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1439
    .line 1440
    .line 1441
    move-result v8

    .line 1442
    const/4 v15, 0x1

    .line 1443
    sub-int/2addr v8, v15

    .line 1444
    invoke-virtual {v3, v5, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v3

    .line 1448
    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 1449
    .line 1450
    .line 1451
    move-result v3

    .line 1452
    new-instance v5, LN1/B;

    .line 1453
    .line 1454
    new-instance v8, LR1/d;

    .line 1455
    .line 1456
    invoke-direct {v8, v7, v3}, LR1/d;-><init>(FF)V

    .line 1457
    .line 1458
    .line 1459
    new-array v3, v15, [LN1/A;

    .line 1460
    .line 1461
    const/16 v31, 0x0

    .line 1462
    .line 1463
    aput-object v8, v3, v31

    .line 1464
    .line 1465
    invoke-direct {v5, v3}, LN1/B;-><init>([LN1/A;)V
    :try_end_3
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_0

    .line 1466
    .line 1467
    .line 1468
    goto :goto_27

    .line 1469
    :catch_0
    const/4 v5, 0x0

    .line 1470
    :goto_27
    invoke-virtual {v10, v5}, LN1/B;->e(LN1/B;)LN1/B;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v3

    .line 1474
    goto :goto_26

    .line 1475
    :cond_4f
    :goto_28
    add-int v13, v13, v35

    .line 1476
    .line 1477
    invoke-virtual {v4, v13}, LQ1/o;->G(I)V

    .line 1478
    .line 1479
    .line 1480
    move/from16 v24, v9

    .line 1481
    .line 1482
    move-object/from16 v9, v34

    .line 1483
    .line 1484
    move-object/from16 v3, v36

    .line 1485
    .line 1486
    const/16 v6, 0x8

    .line 1487
    .line 1488
    const/4 v7, 0x0

    .line 1489
    const/4 v8, 0x1

    .line 1490
    const/16 v23, 0x10

    .line 1491
    .line 1492
    goto/16 :goto_e

    .line 1493
    .line 1494
    :cond_50
    move-object/from16 v36, v3

    .line 1495
    .line 1496
    move-object/from16 v34, v9

    .line 1497
    .line 1498
    move/from16 v9, v24

    .line 1499
    .line 1500
    const/4 v6, 0x4

    .line 1501
    invoke-virtual {v12, v10}, Ls2/s;->b(LN1/B;)V

    .line 1502
    .line 1503
    .line 1504
    goto :goto_29

    .line 1505
    :cond_51
    move-object/from16 v36, v3

    .line 1506
    .line 1507
    move-object/from16 v34, v9

    .line 1508
    .line 1509
    move/from16 v9, v24

    .line 1510
    .line 1511
    const/4 v6, 0x4

    .line 1512
    const/4 v10, 0x0

    .line 1513
    :goto_29
    new-instance v3, LN1/B;

    .line 1514
    .line 1515
    const v4, 0x6d766864

    .line 1516
    .line 1517
    .line 1518
    invoke-virtual {v11, v4}, LR1/b;->q(I)LR1/c;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v4

    .line 1522
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1523
    .line 1524
    .line 1525
    iget-object v4, v4, LR1/c;->c:LQ1/o;

    .line 1526
    .line 1527
    invoke-static {v4}, LM2/g;->d(LQ1/o;)LR1/e;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v4

    .line 1531
    const/4 v15, 0x1

    .line 1532
    new-array v5, v15, [LN1/A;

    .line 1533
    .line 1534
    const/16 v31, 0x0

    .line 1535
    .line 1536
    aput-object v4, v5, v31

    .line 1537
    .line 1538
    invoke-direct {v3, v5}, LN1/B;-><init>([LN1/A;)V

    .line 1539
    .line 1540
    .line 1541
    and-int/lit8 v4, v18, 0x1

    .line 1542
    .line 1543
    if-eqz v4, :cond_52

    .line 1544
    .line 1545
    const/16 v16, 0x1

    .line 1546
    .line 1547
    goto :goto_2a

    .line 1548
    :cond_52
    const/16 v16, 0x0

    .line 1549
    .line 1550
    :goto_2a
    new-instance v4, LJ9/x;

    .line 1551
    .line 1552
    const/16 v5, 0x9

    .line 1553
    .line 1554
    invoke-direct {v4, v5}, LJ9/x;-><init>(I)V

    .line 1555
    .line 1556
    .line 1557
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    const/4 v15, 0x0

    .line 1563
    move/from16 v21, v18

    .line 1564
    .line 1565
    move-object/from16 v18, v4

    .line 1566
    .line 1567
    move/from16 v4, v21

    .line 1568
    .line 1569
    const/16 v21, 0x0

    .line 1570
    .line 1571
    invoke-static/range {v11 .. v18}, LM2/g;->g(LR1/b;Ls2/s;JLN1/j;ZZLk8/h;)Ljava/util/ArrayList;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v5

    .line 1575
    iget-boolean v7, v1, LM2/o;->x:Z

    .line 1576
    .line 1577
    if-eqz v7, :cond_54

    .line 1578
    .line 1579
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1580
    .line 1581
    .line 1582
    move-result v7

    .line 1583
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1584
    .line 1585
    .line 1586
    move-result v8

    .line 1587
    if-ne v7, v8, :cond_53

    .line 1588
    .line 1589
    const/4 v7, 0x1

    .line 1590
    goto :goto_2b

    .line 1591
    :cond_53
    const/4 v7, 0x0

    .line 1592
    :goto_2b
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1593
    .line 1594
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1595
    .line 1596
    .line 1597
    move-result v8

    .line 1598
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1599
    .line 1600
    .line 1601
    move-result v11

    .line 1602
    const-string v13, "The number of auxiliary track types from metadata ("

    .line 1603
    .line 1604
    const-string v14, ") is not same as the number of editable video tracks ("

    .line 1605
    .line 1606
    const-string v15, ")"

    .line 1607
    .line 1608
    invoke-static {v13, v8, v14, v11, v15}, LN0/a;->e(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v8

    .line 1612
    invoke-static {v8, v7}, LQ1/k;->f(Ljava/lang/String;Z)V

    .line 1613
    .line 1614
    .line 1615
    :cond_54
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    const/4 v11, -0x1

    .line 1621
    const/4 v13, 0x0

    .line 1622
    const/4 v14, 0x0

    .line 1623
    :goto_2c
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1629
    .line 1630
    .line 1631
    move-result v8

    .line 1632
    if-ge v13, v8, :cond_66

    .line 1633
    .line 1634
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v8

    .line 1638
    check-cast v8, LM2/v;

    .line 1639
    .line 1640
    iget v9, v8, LM2/v;->b:I

    .line 1641
    .line 1642
    if-nez v9, :cond_55

    .line 1643
    .line 1644
    move-object/from16 v17, v3

    .line 1645
    .line 1646
    move/from16 v18, v4

    .line 1647
    .line 1648
    move-object/from16 v16, v5

    .line 1649
    .line 1650
    move-object/from16 v3, v36

    .line 1651
    .line 1652
    const/4 v8, 0x3

    .line 1653
    const/4 v9, -0x1

    .line 1654
    const/16 v23, 0x10

    .line 1655
    .line 1656
    const/16 v27, 0x8

    .line 1657
    .line 1658
    :goto_2d
    const/16 v32, 0x1

    .line 1659
    .line 1660
    goto/16 :goto_36

    .line 1661
    .line 1662
    :cond_55
    iget-object v9, v8, LM2/v;->a:LM2/s;

    .line 1663
    .line 1664
    move-object/from16 v17, v3

    .line 1665
    .line 1666
    move/from16 v18, v4

    .line 1667
    .line 1668
    iget-wide v3, v9, LM2/s;->e:J

    .line 1669
    .line 1670
    cmp-long v22, v3, v15

    .line 1671
    .line 1672
    if-eqz v22, :cond_56

    .line 1673
    .line 1674
    goto :goto_2e

    .line 1675
    :cond_56
    iget-wide v3, v8, LM2/v;->h:J

    .line 1676
    .line 1677
    :goto_2e
    invoke-static {v6, v7, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 1678
    .line 1679
    .line 1680
    move-result-wide v6

    .line 1681
    new-instance v15, LM2/n;

    .line 1682
    .line 1683
    move-object/from16 v16, v5

    .line 1684
    .line 1685
    iget-object v5, v1, LM2/o;->z:Ls2/o;

    .line 1686
    .line 1687
    const/16 v32, 0x1

    .line 1688
    .line 1689
    add-int/lit8 v22, v14, 0x1

    .line 1690
    .line 1691
    move-wide/from16 v38, v6

    .line 1692
    .line 1693
    iget v6, v9, LM2/s;->b:I

    .line 1694
    .line 1695
    invoke-interface {v5, v14, v6}, Ls2/o;->m(II)Ls2/C;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v5

    .line 1699
    invoke-direct {v15, v9, v8, v5}, LM2/n;-><init>(LM2/s;LM2/v;Ls2/C;)V

    .line 1700
    .line 1701
    .line 1702
    iget-object v5, v9, LM2/s;->g:LN1/n;

    .line 1703
    .line 1704
    iget-object v7, v5, LN1/n;->n:Ljava/lang/String;

    .line 1705
    .line 1706
    const-string v9, "audio/true-hd"

    .line 1707
    .line 1708
    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1709
    .line 1710
    .line 1711
    move-result v7

    .line 1712
    iget v9, v8, LM2/v;->e:I

    .line 1713
    .line 1714
    if-eqz v7, :cond_57

    .line 1715
    .line 1716
    const/16 v23, 0x10

    .line 1717
    .line 1718
    mul-int/lit8 v9, v9, 0x10

    .line 1719
    .line 1720
    goto :goto_2f

    .line 1721
    :cond_57
    const/16 v23, 0x10

    .line 1722
    .line 1723
    add-int/lit8 v9, v9, 0x1e

    .line 1724
    .line 1725
    :goto_2f
    invoke-virtual {v5}, LN1/n;->a()LN1/m;

    .line 1726
    .line 1727
    .line 1728
    move-result-object v7

    .line 1729
    iput v9, v7, LN1/m;->n:I

    .line 1730
    .line 1731
    const/4 v9, 0x2

    .line 1732
    const/16 v27, 0x8

    .line 1733
    .line 1734
    if-ne v6, v9, :cond_5c

    .line 1735
    .line 1736
    and-int/lit8 v9, v18, 0x8

    .line 1737
    .line 1738
    iget v14, v5, LN1/n;->f:I

    .line 1739
    .line 1740
    if-eqz v9, :cond_59

    .line 1741
    .line 1742
    const/4 v9, -0x1

    .line 1743
    if-ne v11, v9, :cond_58

    .line 1744
    .line 1745
    const/4 v9, 0x1

    .line 1746
    goto :goto_30

    .line 1747
    :cond_58
    const/4 v9, 0x2

    .line 1748
    :goto_30
    or-int/2addr v14, v9

    .line 1749
    :cond_59
    iget v5, v5, LN1/n;->w:F

    .line 1750
    .line 1751
    const/high16 v9, -0x40800000    # -1.0f

    .line 1752
    .line 1753
    cmpl-float v5, v5, v9

    .line 1754
    .line 1755
    if-nez v5, :cond_5a

    .line 1756
    .line 1757
    cmp-long v5, v3, v19

    .line 1758
    .line 1759
    if-lez v5, :cond_5a

    .line 1760
    .line 1761
    iget v5, v8, LM2/v;->b:I

    .line 1762
    .line 1763
    if-lez v5, :cond_5a

    .line 1764
    .line 1765
    int-to-float v5, v5

    .line 1766
    long-to-float v3, v3

    .line 1767
    const v4, 0x49742400    # 1000000.0f

    .line 1768
    .line 1769
    .line 1770
    div-float/2addr v3, v4

    .line 1771
    div-float/2addr v5, v3

    .line 1772
    iput v5, v7, LN1/m;->v:F

    .line 1773
    .line 1774
    :cond_5a
    iget-boolean v3, v1, LM2/o;->x:Z

    .line 1775
    .line 1776
    if-eqz v3, :cond_5b

    .line 1777
    .line 1778
    const v3, 0x8000

    .line 1779
    .line 1780
    .line 1781
    or-int/2addr v14, v3

    .line 1782
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v3

    .line 1786
    check-cast v3, Ljava/lang/Integer;

    .line 1787
    .line 1788
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1789
    .line 1790
    .line 1791
    move-result v3

    .line 1792
    iput v3, v7, LN1/m;->g:I

    .line 1793
    .line 1794
    :cond_5b
    iput v14, v7, LN1/m;->f:I

    .line 1795
    .line 1796
    :cond_5c
    const/4 v5, 0x1

    .line 1797
    if-ne v6, v5, :cond_5d

    .line 1798
    .line 1799
    iget v3, v12, Ls2/s;->a:I

    .line 1800
    .line 1801
    const/4 v9, -0x1

    .line 1802
    if-eq v3, v9, :cond_5d

    .line 1803
    .line 1804
    iget v4, v12, Ls2/s;->b:I

    .line 1805
    .line 1806
    if-eq v4, v9, :cond_5d

    .line 1807
    .line 1808
    iput v3, v7, LN1/m;->E:I

    .line 1809
    .line 1810
    iput v4, v7, LN1/m;->F:I

    .line 1811
    .line 1812
    :cond_5d
    iget-object v3, v1, LM2/o;->i:Ljava/util/ArrayList;

    .line 1813
    .line 1814
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1815
    .line 1816
    .line 1817
    move-result v4

    .line 1818
    if-eqz v4, :cond_5e

    .line 1819
    .line 1820
    move-object/from16 v4, v21

    .line 1821
    .line 1822
    :goto_31
    const/4 v5, 0x3

    .line 1823
    goto :goto_32

    .line 1824
    :cond_5e
    new-instance v4, LN1/B;

    .line 1825
    .line 1826
    invoke-direct {v4, v3}, LN1/B;-><init>(Ljava/util/List;)V

    .line 1827
    .line 1828
    .line 1829
    goto :goto_31

    .line 1830
    :goto_32
    new-array v3, v5, [LN1/B;

    .line 1831
    .line 1832
    const/4 v14, 0x0

    .line 1833
    aput-object v4, v3, v14

    .line 1834
    .line 1835
    const/16 v32, 0x1

    .line 1836
    .line 1837
    aput-object v10, v3, v32

    .line 1838
    .line 1839
    const/16 v29, 0x2

    .line 1840
    .line 1841
    aput-object v17, v3, v29

    .line 1842
    .line 1843
    new-instance v4, LN1/B;

    .line 1844
    .line 1845
    new-array v5, v14, [LN1/A;

    .line 1846
    .line 1847
    invoke-direct {v4, v5}, LN1/B;-><init>([LN1/A;)V

    .line 1848
    .line 1849
    .line 1850
    if-eqz v0, :cond_62

    .line 1851
    .line 1852
    const/4 v5, 0x0

    .line 1853
    :goto_33
    iget-object v8, v0, LN1/B;->a:[LN1/A;

    .line 1854
    .line 1855
    array-length v9, v8

    .line 1856
    if-ge v5, v9, :cond_62

    .line 1857
    .line 1858
    aget-object v8, v8, v5

    .line 1859
    .line 1860
    instance-of v9, v8, LR1/a;

    .line 1861
    .line 1862
    if-eqz v9, :cond_60

    .line 1863
    .line 1864
    check-cast v8, LR1/a;

    .line 1865
    .line 1866
    iget-object v9, v8, LR1/a;->a:Ljava/lang/String;

    .line 1867
    .line 1868
    const-string v14, "com.android.capture.fps"

    .line 1869
    .line 1870
    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1871
    .line 1872
    .line 1873
    move-result v9

    .line 1874
    if-eqz v9, :cond_61

    .line 1875
    .line 1876
    const/4 v9, 0x2

    .line 1877
    if-ne v6, v9, :cond_5f

    .line 1878
    .line 1879
    const/4 v9, 0x1

    .line 1880
    new-array v14, v9, [LN1/A;

    .line 1881
    .line 1882
    const/16 v31, 0x0

    .line 1883
    .line 1884
    aput-object v8, v14, v31

    .line 1885
    .line 1886
    invoke-virtual {v4, v14}, LN1/B;->c([LN1/A;)LN1/B;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v4

    .line 1890
    goto :goto_34

    .line 1891
    :cond_5f
    const/16 v31, 0x0

    .line 1892
    .line 1893
    :cond_60
    const/4 v9, 0x1

    .line 1894
    goto :goto_34

    .line 1895
    :cond_61
    const/4 v9, 0x1

    .line 1896
    const/16 v31, 0x0

    .line 1897
    .line 1898
    new-array v14, v9, [LN1/A;

    .line 1899
    .line 1900
    aput-object v8, v14, v31

    .line 1901
    .line 1902
    invoke-virtual {v4, v14}, LN1/B;->c([LN1/A;)LN1/B;

    .line 1903
    .line 1904
    .line 1905
    move-result-object v4

    .line 1906
    :goto_34
    add-int/2addr v5, v9

    .line 1907
    goto :goto_33

    .line 1908
    :cond_62
    const/4 v9, 0x1

    .line 1909
    const/4 v5, 0x0

    .line 1910
    const/4 v8, 0x3

    .line 1911
    :goto_35
    if-ge v5, v8, :cond_63

    .line 1912
    .line 1913
    aget-object v14, v3, v5

    .line 1914
    .line 1915
    invoke-virtual {v4, v14}, LN1/B;->e(LN1/B;)LN1/B;

    .line 1916
    .line 1917
    .line 1918
    move-result-object v4

    .line 1919
    add-int/2addr v5, v9

    .line 1920
    goto :goto_35

    .line 1921
    :cond_63
    iget-object v3, v4, LN1/B;->a:[LN1/A;

    .line 1922
    .line 1923
    array-length v3, v3

    .line 1924
    if-lez v3, :cond_64

    .line 1925
    .line 1926
    iput-object v4, v7, LN1/m;->k:LN1/B;

    .line 1927
    .line 1928
    :cond_64
    new-instance v3, LN1/n;

    .line 1929
    .line 1930
    invoke-direct {v3, v7}, LN1/n;-><init>(LN1/m;)V

    .line 1931
    .line 1932
    .line 1933
    iget-object v4, v15, LM2/n;->c:Ls2/C;

    .line 1934
    .line 1935
    invoke-interface {v4, v3}, Ls2/C;->c(LN1/n;)V

    .line 1936
    .line 1937
    .line 1938
    const/4 v5, 0x2

    .line 1939
    const/4 v9, -0x1

    .line 1940
    if-ne v6, v5, :cond_65

    .line 1941
    .line 1942
    if-ne v11, v9, :cond_65

    .line 1943
    .line 1944
    invoke-virtual/range {v36 .. v36}, Ljava/util/ArrayList;->size()I

    .line 1945
    .line 1946
    .line 1947
    move-result v11

    .line 1948
    :cond_65
    move-object/from16 v3, v36

    .line 1949
    .line 1950
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1951
    .line 1952
    .line 1953
    move/from16 v14, v22

    .line 1954
    .line 1955
    move-wide/from16 v6, v38

    .line 1956
    .line 1957
    goto/16 :goto_2d

    .line 1958
    .line 1959
    :goto_36
    add-int/lit8 v13, v13, 0x1

    .line 1960
    .line 1961
    move-object/from16 v36, v3

    .line 1962
    .line 1963
    move-object/from16 v5, v16

    .line 1964
    .line 1965
    move-object/from16 v3, v17

    .line 1966
    .line 1967
    move/from16 v4, v18

    .line 1968
    .line 1969
    const/16 v9, 0xc

    .line 1970
    .line 1971
    goto/16 :goto_2c

    .line 1972
    .line 1973
    :cond_66
    move-object/from16 v3, v36

    .line 1974
    .line 1975
    const/4 v8, 0x3

    .line 1976
    const/4 v9, -0x1

    .line 1977
    const/16 v23, 0x10

    .line 1978
    .line 1979
    const/16 v27, 0x8

    .line 1980
    .line 1981
    iput v11, v1, LM2/o;->C:I

    .line 1982
    .line 1983
    iput-wide v6, v1, LM2/o;->D:J

    .line 1984
    .line 1985
    const/4 v14, 0x0

    .line 1986
    new-array v0, v14, [LM2/n;

    .line 1987
    .line 1988
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1989
    .line 1990
    .line 1991
    move-result-object v0

    .line 1992
    check-cast v0, [LM2/n;

    .line 1993
    .line 1994
    iput-object v0, v1, LM2/o;->A:[LM2/n;

    .line 1995
    .line 1996
    array-length v2, v0

    .line 1997
    new-array v2, v2, [[J

    .line 1998
    .line 1999
    array-length v3, v0

    .line 2000
    new-array v3, v3, [I

    .line 2001
    .line 2002
    array-length v4, v0

    .line 2003
    new-array v4, v4, [J

    .line 2004
    .line 2005
    array-length v5, v0

    .line 2006
    new-array v5, v5, [Z

    .line 2007
    .line 2008
    const/4 v14, 0x0

    .line 2009
    :goto_37
    array-length v6, v0

    .line 2010
    if-ge v14, v6, :cond_67

    .line 2011
    .line 2012
    aget-object v6, v0, v14

    .line 2013
    .line 2014
    iget-object v6, v6, LM2/n;->b:LM2/v;

    .line 2015
    .line 2016
    iget v6, v6, LM2/v;->b:I

    .line 2017
    .line 2018
    new-array v6, v6, [J

    .line 2019
    .line 2020
    aput-object v6, v2, v14

    .line 2021
    .line 2022
    aget-object v6, v0, v14

    .line 2023
    .line 2024
    iget-object v6, v6, LM2/n;->b:LM2/v;

    .line 2025
    .line 2026
    iget-object v6, v6, LM2/v;->f:[J

    .line 2027
    .line 2028
    const/16 v31, 0x0

    .line 2029
    .line 2030
    aget-wide v10, v6, v31

    .line 2031
    .line 2032
    aput-wide v10, v4, v14

    .line 2033
    .line 2034
    const/16 v32, 0x1

    .line 2035
    .line 2036
    add-int/lit8 v14, v14, 0x1

    .line 2037
    .line 2038
    goto :goto_37

    .line 2039
    :cond_67
    const/4 v14, 0x0

    .line 2040
    :goto_38
    array-length v6, v0

    .line 2041
    if-ge v14, v6, :cond_6b

    .line 2042
    .line 2043
    const-wide v6, 0x7fffffffffffffffL

    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    move v10, v9

    .line 2049
    const/4 v11, 0x0

    .line 2050
    :goto_39
    array-length v12, v0

    .line 2051
    if-ge v11, v12, :cond_69

    .line 2052
    .line 2053
    aget-boolean v12, v5, v11

    .line 2054
    .line 2055
    if-nez v12, :cond_68

    .line 2056
    .line 2057
    aget-wide v12, v4, v11

    .line 2058
    .line 2059
    cmp-long v15, v12, v6

    .line 2060
    .line 2061
    if-gtz v15, :cond_68

    .line 2062
    .line 2063
    move v10, v11

    .line 2064
    move-wide v6, v12

    .line 2065
    :cond_68
    const/16 v32, 0x1

    .line 2066
    .line 2067
    add-int/lit8 v11, v11, 0x1

    .line 2068
    .line 2069
    goto :goto_39

    .line 2070
    :cond_69
    const/16 v32, 0x1

    .line 2071
    .line 2072
    aget v6, v3, v10

    .line 2073
    .line 2074
    aget-object v7, v2, v10

    .line 2075
    .line 2076
    aput-wide v19, v7, v6

    .line 2077
    .line 2078
    aget-object v11, v0, v10

    .line 2079
    .line 2080
    iget-object v11, v11, LM2/n;->b:LM2/v;

    .line 2081
    .line 2082
    iget-object v12, v11, LM2/v;->d:[I

    .line 2083
    .line 2084
    aget v12, v12, v6

    .line 2085
    .line 2086
    int-to-long v12, v12

    .line 2087
    add-long v19, v19, v12

    .line 2088
    .line 2089
    add-int/lit8 v6, v6, 0x1

    .line 2090
    .line 2091
    aput v6, v3, v10

    .line 2092
    .line 2093
    array-length v7, v7

    .line 2094
    if-ge v6, v7, :cond_6a

    .line 2095
    .line 2096
    iget-object v7, v11, LM2/v;->f:[J

    .line 2097
    .line 2098
    aget-wide v6, v7, v6

    .line 2099
    .line 2100
    aput-wide v6, v4, v10

    .line 2101
    .line 2102
    goto :goto_38

    .line 2103
    :cond_6a
    aput-boolean v32, v5, v10

    .line 2104
    .line 2105
    add-int/lit8 v14, v14, 0x1

    .line 2106
    .line 2107
    goto :goto_38

    .line 2108
    :cond_6b
    const/16 v32, 0x1

    .line 2109
    .line 2110
    iput-object v2, v1, LM2/o;->B:[[J

    .line 2111
    .line 2112
    iget-object v0, v1, LM2/o;->z:Ls2/o;

    .line 2113
    .line 2114
    invoke-interface {v0}, Ls2/o;->l()V

    .line 2115
    .line 2116
    .line 2117
    iget-object v0, v1, LM2/o;->z:Ls2/o;

    .line 2118
    .line 2119
    invoke-interface {v0, v1}, Ls2/o;->s(Ls2/w;)V

    .line 2120
    .line 2121
    .line 2122
    :goto_3a
    invoke-virtual/range {v34 .. v34}, Ljava/util/ArrayDeque;->clear()V

    .line 2123
    .line 2124
    .line 2125
    iget-boolean v0, v1, LM2/o;->v:Z

    .line 2126
    .line 2127
    if-nez v0, :cond_6d

    .line 2128
    .line 2129
    const/4 v5, 0x2

    .line 2130
    iput v5, v1, LM2/o;->k:I

    .line 2131
    .line 2132
    goto :goto_3b

    .line 2133
    :cond_6c
    move/from16 v27, v3

    .line 2134
    .line 2135
    move/from16 v23, v5

    .line 2136
    .line 2137
    move/from16 v32, v8

    .line 2138
    .line 2139
    move-object/from16 v34, v9

    .line 2140
    .line 2141
    const/4 v8, 0x3

    .line 2142
    invoke-virtual/range {v34 .. v34}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 2143
    .line 2144
    .line 2145
    move-result v0

    .line 2146
    if-nez v0, :cond_6d

    .line 2147
    .line 2148
    invoke-virtual/range {v34 .. v34}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 2149
    .line 2150
    .line 2151
    move-result-object v0

    .line 2152
    check-cast v0, LR1/b;

    .line 2153
    .line 2154
    iget-object v0, v0, LR1/b;->e:Ljava/util/ArrayList;

    .line 2155
    .line 2156
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2157
    .line 2158
    .line 2159
    :cond_6d
    :goto_3b
    move/from16 v5, v23

    .line 2160
    .line 2161
    move/from16 v3, v27

    .line 2162
    .line 2163
    move/from16 v8, v32

    .line 2164
    .line 2165
    const/4 v2, 0x4

    .line 2166
    const/16 v6, 0xc

    .line 2167
    .line 2168
    const/4 v7, 0x0

    .line 2169
    goto/16 :goto_0

    .line 2170
    .line 2171
    :cond_6e
    iget v0, v1, LM2/o;->k:I

    .line 2172
    .line 2173
    const/4 v5, 0x2

    .line 2174
    if-eq v0, v5, :cond_6f

    .line 2175
    .line 2176
    const/4 v14, 0x0

    .line 2177
    iput v14, v1, LM2/o;->k:I

    .line 2178
    .line 2179
    iput v14, v1, LM2/o;->n:I

    .line 2180
    .line 2181
    :cond_6f
    return-void
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
