.class public final LT5/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ5/k;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/util/List;

.field public final d:LY4/b;

.field public final e:Landroid/util/SparseIntArray;

.field public final f:LA/e0;

.field public final g:Landroid/util/SparseArray;

.field public final h:Landroid/util/SparseBooleanArray;

.field public final i:Landroid/util/SparseBooleanArray;

.field public final j:LT5/u;

.field public k:LM5/a;

.field public l:LJ5/m;

.field public m:I

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:LT5/C;

.field public r:I

.field public s:I


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    new-instance v0, Lu6/t;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-direct {v0, v1, v2}, Lu6/t;-><init>(J)V

    .line 6
    .line 7
    .line 8
    new-instance v1, LA/e0;

    .line 9
    .line 10
    const/16 v2, 0x15

    .line 11
    .line 12
    invoke-direct {v1, v2}, LA/e0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, LT5/z;->f:LA/e0;

    .line 19
    .line 20
    const v1, 0x1b8a0

    .line 21
    .line 22
    .line 23
    iput v1, p0, LT5/z;->b:I

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    iput v1, p0, LT5/z;->a:I

    .line 27
    .line 28
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, LT5/z;->c:Ljava/util/List;

    .line 33
    .line 34
    new-instance v0, LY4/b;

    .line 35
    .line 36
    const/16 v1, 0x24b8

    .line 37
    .line 38
    new-array v1, v1, [B

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-direct {v0, v1, v2}, LY4/b;-><init>([BI)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, LT5/z;->d:LY4/b;

    .line 45
    .line 46
    new-instance v0, Landroid/util/SparseBooleanArray;

    .line 47
    .line 48
    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, LT5/z;->h:Landroid/util/SparseBooleanArray;

    .line 52
    .line 53
    new-instance v1, Landroid/util/SparseBooleanArray;

    .line 54
    .line 55
    invoke-direct {v1}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v1, p0, LT5/z;->i:Landroid/util/SparseBooleanArray;

    .line 59
    .line 60
    new-instance v1, Landroid/util/SparseArray;

    .line 61
    .line 62
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v1, p0, LT5/z;->g:Landroid/util/SparseArray;

    .line 66
    .line 67
    new-instance v3, Landroid/util/SparseIntArray;

    .line 68
    .line 69
    invoke-direct {v3}, Landroid/util/SparseIntArray;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v3, p0, LT5/z;->e:Landroid/util/SparseIntArray;

    .line 73
    .line 74
    new-instance v3, LT5/u;

    .line 75
    .line 76
    const/4 v4, 0x1

    .line 77
    invoke-direct {v3, v4}, LT5/u;-><init>(I)V

    .line 78
    .line 79
    .line 80
    iput-object v3, p0, LT5/z;->j:LT5/u;

    .line 81
    .line 82
    sget-object v3, LJ5/m;->N8:Lm9/S;

    .line 83
    .line 84
    iput-object v3, p0, LT5/z;->l:LJ5/m;

    .line 85
    .line 86
    const/4 v3, -0x1

    .line 87
    iput v3, p0, LT5/z;->s:I

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/util/SparseBooleanArray;->clear()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    .line 93
    .line 94
    .line 95
    new-instance v0, Landroid/util/SparseArray;

    .line 96
    .line 97
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    move v4, v2

    .line 105
    :goto_0
    if-ge v4, v3, :cond_0

    .line 106
    .line 107
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->keyAt(I)I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    check-cast v6, LT5/C;

    .line 116
    .line 117
    invoke-virtual {v1, v5, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    add-int/lit8 v4, v4, 0x1

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_0
    new-instance v0, LT5/y;

    .line 124
    .line 125
    new-instance v3, LS3/c;

    .line 126
    .line 127
    invoke-direct {v3, p0}, LS3/c;-><init>(LT5/z;)V

    .line 128
    .line 129
    .line 130
    invoke-direct {v0, v3}, LT5/y;-><init>(LT5/x;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    const/4 v0, 0x0

    .line 137
    iput-object v0, p0, LT5/z;->q:LT5/C;

    .line 138
    .line 139
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 10

    .line 1
    iget p1, p0, LT5/z;->a:I

    .line 2
    .line 3
    const/4 p2, 0x2

    .line 4
    const/4 v0, 0x1

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eq p1, p2, :cond_0

    .line 7
    .line 8
    move p1, v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p1, v1

    .line 11
    :goto_0
    invoke-static {p1}, Lu6/a;->i(Z)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, LT5/z;->c:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    move v2, v1

    .line 21
    :goto_1
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    if-ge v2, p2, :cond_5

    .line 24
    .line 25
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    check-cast v5, Lu6/t;

    .line 30
    .line 31
    invoke-virtual {v5}, Lu6/t;->d()J

    .line 32
    .line 33
    .line 34
    move-result-wide v6

    .line 35
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    cmp-long v6, v6, v8

    .line 41
    .line 42
    if-nez v6, :cond_1

    .line 43
    .line 44
    move v6, v0

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    move v6, v1

    .line 47
    :goto_2
    if-nez v6, :cond_3

    .line 48
    .line 49
    invoke-virtual {v5}, Lu6/t;->c()J

    .line 50
    .line 51
    .line 52
    move-result-wide v6

    .line 53
    cmp-long v8, v6, v8

    .line 54
    .line 55
    if-eqz v8, :cond_2

    .line 56
    .line 57
    cmp-long v3, v6, v3

    .line 58
    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    cmp-long v3, v6, p3

    .line 62
    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    move v6, v0

    .line 66
    goto :goto_3

    .line 67
    :cond_2
    move v6, v1

    .line 68
    :cond_3
    :goto_3
    if-eqz v6, :cond_4

    .line 69
    .line 70
    invoke-virtual {v5, p3, p4}, Lu6/t;->e(J)V

    .line 71
    .line 72
    .line 73
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_5
    cmp-long p1, p3, v3

    .line 77
    .line 78
    if-eqz p1, :cond_6

    .line 79
    .line 80
    iget-object p1, p0, LT5/z;->k:LM5/a;

    .line 81
    .line 82
    if-eqz p1, :cond_6

    .line 83
    .line 84
    invoke-virtual {p1, p3, p4}, LJ5/f;->D(J)V

    .line 85
    .line 86
    .line 87
    :cond_6
    iget-object p1, p0, LT5/z;->d:LY4/b;

    .line 88
    .line 89
    invoke-virtual {p1, v1}, LY4/b;->x(I)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, LT5/z;->e:Landroid/util/SparseIntArray;

    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 95
    .line 96
    .line 97
    move p1, v1

    .line 98
    :goto_4
    iget-object p2, p0, LT5/z;->g:Landroid/util/SparseArray;

    .line 99
    .line 100
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    if-ge p1, p3, :cond_7

    .line 105
    .line 106
    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    check-cast p2, LT5/C;

    .line 111
    .line 112
    invoke-interface {p2}, LT5/C;->a()V

    .line 113
    .line 114
    .line 115
    add-int/lit8 p1, p1, 0x1

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_7
    iput v1, p0, LT5/z;->r:I

    .line 119
    .line 120
    return-void
.end method

.method public final g(LJ5/l;LJ5/n;)I
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    check-cast v2, LJ5/h;

    .line 8
    .line 9
    iget-wide v12, v2, LJ5/h;->c:J

    .line 10
    .line 11
    iget-boolean v2, v0, LT5/z;->n:Z

    .line 12
    .line 13
    const/16 v3, 0x47

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x1

    .line 17
    const-wide/16 v17, -0x1

    .line 18
    .line 19
    iget v6, v0, LT5/z;->a:I

    .line 20
    .line 21
    const/4 v7, 0x2

    .line 22
    if-eqz v2, :cond_14

    .line 23
    .line 24
    cmp-long v2, v12, v17

    .line 25
    .line 26
    iget-object v10, v0, LT5/z;->j:LT5/u;

    .line 27
    .line 28
    const-wide/16 v14, 0x0

    .line 29
    .line 30
    if-eqz v2, :cond_10

    .line 31
    .line 32
    if-eq v6, v7, :cond_10

    .line 33
    .line 34
    iget-boolean v2, v10, LT5/u;->d:Z

    .line 35
    .line 36
    if-nez v2, :cond_10

    .line 37
    .line 38
    iget v2, v0, LT5/z;->s:I

    .line 39
    .line 40
    if-gtz v2, :cond_0

    .line 41
    .line 42
    move-object/from16 v1, p1

    .line 43
    .line 44
    check-cast v1, LJ5/h;

    .line 45
    .line 46
    invoke-virtual {v10, v1}, LT5/u;->a(LJ5/h;)V

    .line 47
    .line 48
    .line 49
    return v4

    .line 50
    :cond_0
    iget-boolean v6, v10, LT5/u;->f:Z

    .line 51
    .line 52
    iget-object v7, v10, LT5/u;->c:LY4/b;

    .line 53
    .line 54
    const v11, 0x1b8a0

    .line 55
    .line 56
    .line 57
    if-nez v6, :cond_7

    .line 58
    .line 59
    move-object/from16 v6, p1

    .line 60
    .line 61
    check-cast v6, LJ5/h;

    .line 62
    .line 63
    int-to-long v11, v11

    .line 64
    iget-wide v13, v6, LJ5/h;->c:J

    .line 65
    .line 66
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 67
    .line 68
    .line 69
    move-result-wide v11

    .line 70
    long-to-int v11, v11

    .line 71
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    int-to-long v8, v11

    .line 77
    sub-long/2addr v13, v8

    .line 78
    iget-wide v8, v6, LJ5/h;->d:J

    .line 79
    .line 80
    cmp-long v8, v8, v13

    .line 81
    .line 82
    if-eqz v8, :cond_1

    .line 83
    .line 84
    iput-wide v13, v1, LJ5/n;->a:J

    .line 85
    .line 86
    return v5

    .line 87
    :cond_1
    invoke-virtual {v7, v11}, LY4/b;->x(I)V

    .line 88
    .line 89
    .line 90
    iput v4, v6, LJ5/h;->f:I

    .line 91
    .line 92
    iget-object v1, v7, LY4/b;->a:[B

    .line 93
    .line 94
    invoke-virtual {v6, v1, v4, v11, v4}, LJ5/h;->c([BIIZ)Z

    .line 95
    .line 96
    .line 97
    iget v1, v7, LY4/b;->b:I

    .line 98
    .line 99
    iget v6, v7, LY4/b;->c:I

    .line 100
    .line 101
    add-int/lit16 v8, v6, -0xbc

    .line 102
    .line 103
    :goto_0
    if-lt v8, v1, :cond_6

    .line 104
    .line 105
    iget-object v9, v7, LY4/b;->a:[B

    .line 106
    .line 107
    const/4 v11, -0x4

    .line 108
    move v12, v4

    .line 109
    :goto_1
    const/4 v13, 0x4

    .line 110
    if-gt v11, v13, :cond_5

    .line 111
    .line 112
    mul-int/lit16 v13, v11, 0xbc

    .line 113
    .line 114
    add-int/2addr v13, v8

    .line 115
    if-lt v13, v1, :cond_3

    .line 116
    .line 117
    if-ge v13, v6, :cond_3

    .line 118
    .line 119
    aget-byte v13, v9, v13

    .line 120
    .line 121
    if-eq v13, v3, :cond_2

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_2
    add-int/2addr v12, v5

    .line 125
    const/4 v13, 0x5

    .line 126
    if-ne v12, v13, :cond_4

    .line 127
    .line 128
    invoke-static {v7, v8, v2}, Lic/d;->K(LY4/b;II)J

    .line 129
    .line 130
    .line 131
    move-result-wide v11

    .line 132
    cmp-long v9, v11, v19

    .line 133
    .line 134
    if-eqz v9, :cond_5

    .line 135
    .line 136
    move-wide v8, v11

    .line 137
    goto :goto_3

    .line 138
    :cond_3
    :goto_2
    move v12, v4

    .line 139
    :cond_4
    add-int/lit8 v11, v11, 0x1

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_5
    add-int/lit8 v8, v8, -0x1

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_6
    move-wide/from16 v8, v19

    .line 146
    .line 147
    :goto_3
    iput-wide v8, v10, LT5/u;->h:J

    .line 148
    .line 149
    iput-boolean v5, v10, LT5/u;->f:Z

    .line 150
    .line 151
    return v4

    .line 152
    :cond_7
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    iget-wide v8, v10, LT5/u;->h:J

    .line 158
    .line 159
    cmp-long v6, v8, v19

    .line 160
    .line 161
    if-nez v6, :cond_8

    .line 162
    .line 163
    move-object/from16 v1, p1

    .line 164
    .line 165
    check-cast v1, LJ5/h;

    .line 166
    .line 167
    invoke-virtual {v10, v1}, LT5/u;->a(LJ5/h;)V

    .line 168
    .line 169
    .line 170
    return v4

    .line 171
    :cond_8
    iget-boolean v6, v10, LT5/u;->e:Z

    .line 172
    .line 173
    if-nez v6, :cond_d

    .line 174
    .line 175
    int-to-long v8, v11

    .line 176
    move-object/from16 v6, p1

    .line 177
    .line 178
    check-cast v6, LJ5/h;

    .line 179
    .line 180
    iget-wide v11, v6, LJ5/h;->c:J

    .line 181
    .line 182
    invoke-static {v8, v9, v11, v12}, Ljava/lang/Math;->min(JJ)J

    .line 183
    .line 184
    .line 185
    move-result-wide v8

    .line 186
    long-to-int v8, v8

    .line 187
    iget-wide v11, v6, LJ5/h;->d:J

    .line 188
    .line 189
    int-to-long v13, v4

    .line 190
    cmp-long v9, v11, v13

    .line 191
    .line 192
    if-eqz v9, :cond_9

    .line 193
    .line 194
    iput-wide v13, v1, LJ5/n;->a:J

    .line 195
    .line 196
    return v5

    .line 197
    :cond_9
    invoke-virtual {v7, v8}, LY4/b;->x(I)V

    .line 198
    .line 199
    .line 200
    iput v4, v6, LJ5/h;->f:I

    .line 201
    .line 202
    iget-object v1, v7, LY4/b;->a:[B

    .line 203
    .line 204
    invoke-virtual {v6, v1, v4, v8, v4}, LJ5/h;->c([BIIZ)Z

    .line 205
    .line 206
    .line 207
    iget v1, v7, LY4/b;->b:I

    .line 208
    .line 209
    iget v6, v7, LY4/b;->c:I

    .line 210
    .line 211
    :goto_4
    if-ge v1, v6, :cond_c

    .line 212
    .line 213
    iget-object v8, v7, LY4/b;->a:[B

    .line 214
    .line 215
    aget-byte v8, v8, v1

    .line 216
    .line 217
    if-eq v8, v3, :cond_a

    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_a
    invoke-static {v7, v1, v2}, Lic/d;->K(LY4/b;II)J

    .line 221
    .line 222
    .line 223
    move-result-wide v8

    .line 224
    cmp-long v11, v8, v19

    .line 225
    .line 226
    if-eqz v11, :cond_b

    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_b
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_c
    move-wide/from16 v8, v19

    .line 233
    .line 234
    :goto_6
    iput-wide v8, v10, LT5/u;->g:J

    .line 235
    .line 236
    iput-boolean v5, v10, LT5/u;->e:Z

    .line 237
    .line 238
    return v4

    .line 239
    :cond_d
    iget-wide v1, v10, LT5/u;->g:J

    .line 240
    .line 241
    cmp-long v3, v1, v19

    .line 242
    .line 243
    if-nez v3, :cond_e

    .line 244
    .line 245
    move-object/from16 v1, p1

    .line 246
    .line 247
    check-cast v1, LJ5/h;

    .line 248
    .line 249
    invoke-virtual {v10, v1}, LT5/u;->a(LJ5/h;)V

    .line 250
    .line 251
    .line 252
    return v4

    .line 253
    :cond_e
    iget-object v3, v10, LT5/u;->b:Lu6/t;

    .line 254
    .line 255
    invoke-virtual {v3, v1, v2}, Lu6/t;->b(J)J

    .line 256
    .line 257
    .line 258
    move-result-wide v1

    .line 259
    iget-wide v5, v10, LT5/u;->h:J

    .line 260
    .line 261
    invoke-virtual {v3, v5, v6}, Lu6/t;->b(J)J

    .line 262
    .line 263
    .line 264
    move-result-wide v5

    .line 265
    sub-long/2addr v5, v1

    .line 266
    iput-wide v5, v10, LT5/u;->i:J

    .line 267
    .line 268
    cmp-long v1, v5, v14

    .line 269
    .line 270
    if-gez v1, :cond_f

    .line 271
    .line 272
    new-instance v1, Ljava/lang/StringBuilder;

    .line 273
    .line 274
    const-string v2, "Invalid duration: "

    .line 275
    .line 276
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    iget-wide v2, v10, LT5/u;->i:J

    .line 280
    .line 281
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    const-string v2, ". Using TIME_UNSET instead."

    .line 285
    .line 286
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    const-string v2, "TsDurationReader"

    .line 294
    .line 295
    invoke-static {v2, v1}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    move-wide/from16 v1, v19

    .line 299
    .line 300
    iput-wide v1, v10, LT5/u;->i:J

    .line 301
    .line 302
    :cond_f
    move-object/from16 v1, p1

    .line 303
    .line 304
    check-cast v1, LJ5/h;

    .line 305
    .line 306
    invoke-virtual {v10, v1}, LT5/u;->a(LJ5/h;)V

    .line 307
    .line 308
    .line 309
    return v4

    .line 310
    :cond_10
    iget-boolean v2, v0, LT5/z;->o:Z

    .line 311
    .line 312
    if-nez v2, :cond_12

    .line 313
    .line 314
    iput-boolean v5, v0, LT5/z;->o:Z

    .line 315
    .line 316
    move v2, v6

    .line 317
    move v8, v7

    .line 318
    iget-wide v6, v10, LT5/u;->i:J

    .line 319
    .line 320
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    cmp-long v9, v6, v19

    .line 326
    .line 327
    if-eqz v9, :cond_11

    .line 328
    .line 329
    move v9, v3

    .line 330
    new-instance v3, LM5/a;

    .line 331
    .line 332
    iget v11, v0, LT5/z;->s:I

    .line 333
    .line 334
    move/from16 v16, v4

    .line 335
    .line 336
    new-instance v4, LXd/c;

    .line 337
    .line 338
    const/16 v5, 0x14

    .line 339
    .line 340
    invoke-direct {v4, v5}, LXd/c;-><init>(I)V

    .line 341
    .line 342
    .line 343
    new-instance v5, LM2/d;

    .line 344
    .line 345
    iget v8, v0, LT5/z;->b:I

    .line 346
    .line 347
    iget-object v10, v10, LT5/u;->b:Lu6/t;

    .line 348
    .line 349
    invoke-direct {v5, v11, v10, v8}, LM2/d;-><init>(ILu6/t;I)V

    .line 350
    .line 351
    .line 352
    const-wide/16 v10, 0x1

    .line 353
    .line 354
    add-long/2addr v10, v6

    .line 355
    move/from16 v8, v16

    .line 356
    .line 357
    const/16 v16, 0x3ac

    .line 358
    .line 359
    move/from16 v22, v8

    .line 360
    .line 361
    move/from16 v21, v9

    .line 362
    .line 363
    move-wide v8, v10

    .line 364
    const-wide/16 v10, 0x0

    .line 365
    .line 366
    move-wide/from16 v23, v14

    .line 367
    .line 368
    const-wide/16 v14, 0xbc

    .line 369
    .line 370
    move/from16 v25, v2

    .line 371
    .line 372
    move/from16 v2, v22

    .line 373
    .line 374
    invoke-direct/range {v3 .. v16}, LJ5/f;-><init>(LJ5/c;LJ5/e;JJJJJI)V

    .line 375
    .line 376
    .line 377
    iput-object v3, v0, LT5/z;->k:LM5/a;

    .line 378
    .line 379
    iget-object v4, v0, LT5/z;->l:LJ5/m;

    .line 380
    .line 381
    iget-object v3, v3, LJ5/f;->c:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v3, LJ5/a;

    .line 384
    .line 385
    invoke-interface {v4, v3}, LJ5/m;->x(LJ5/t;)V

    .line 386
    .line 387
    .line 388
    goto :goto_7

    .line 389
    :cond_11
    move/from16 v25, v2

    .line 390
    .line 391
    move v2, v4

    .line 392
    iget-object v3, v0, LT5/z;->l:LJ5/m;

    .line 393
    .line 394
    new-instance v4, LJ5/o;

    .line 395
    .line 396
    invoke-direct {v4, v6, v7}, LJ5/o;-><init>(J)V

    .line 397
    .line 398
    .line 399
    invoke-interface {v3, v4}, LJ5/m;->x(LJ5/t;)V

    .line 400
    .line 401
    .line 402
    goto :goto_7

    .line 403
    :cond_12
    move v2, v4

    .line 404
    move/from16 v25, v6

    .line 405
    .line 406
    :goto_7
    iget-boolean v3, v0, LT5/z;->p:Z

    .line 407
    .line 408
    if-eqz v3, :cond_13

    .line 409
    .line 410
    iput-boolean v2, v0, LT5/z;->p:Z

    .line 411
    .line 412
    const-wide/16 v3, 0x0

    .line 413
    .line 414
    invoke-virtual {v0, v3, v4, v3, v4}, LT5/z;->a(JJ)V

    .line 415
    .line 416
    .line 417
    move-object/from16 v5, p1

    .line 418
    .line 419
    check-cast v5, LJ5/h;

    .line 420
    .line 421
    iget-wide v5, v5, LJ5/h;->d:J

    .line 422
    .line 423
    cmp-long v5, v5, v3

    .line 424
    .line 425
    if-eqz v5, :cond_13

    .line 426
    .line 427
    iput-wide v3, v1, LJ5/n;->a:J

    .line 428
    .line 429
    const/4 v3, 0x1

    .line 430
    return v3

    .line 431
    :cond_13
    const/4 v3, 0x1

    .line 432
    iget-object v4, v0, LT5/z;->k:LM5/a;

    .line 433
    .line 434
    if-eqz v4, :cond_15

    .line 435
    .line 436
    iget-object v5, v4, LJ5/f;->e:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast v5, LJ5/b;

    .line 439
    .line 440
    if-eqz v5, :cond_15

    .line 441
    .line 442
    move-object/from16 v2, p1

    .line 443
    .line 444
    check-cast v2, LJ5/h;

    .line 445
    .line 446
    invoke-virtual {v4, v2, v1}, LJ5/f;->u(LJ5/h;LJ5/n;)I

    .line 447
    .line 448
    .line 449
    move-result v1

    .line 450
    return v1

    .line 451
    :cond_14
    move v2, v4

    .line 452
    move v3, v5

    .line 453
    move/from16 v25, v6

    .line 454
    .line 455
    :cond_15
    iget-object v1, v0, LT5/z;->d:LY4/b;

    .line 456
    .line 457
    iget-object v4, v1, LY4/b;->a:[B

    .line 458
    .line 459
    iget v5, v1, LY4/b;->b:I

    .line 460
    .line 461
    rsub-int v5, v5, 0x24b8

    .line 462
    .line 463
    const/16 v6, 0xbc

    .line 464
    .line 465
    if-ge v5, v6, :cond_17

    .line 466
    .line 467
    invoke-virtual {v1}, LY4/b;->a()I

    .line 468
    .line 469
    .line 470
    move-result v5

    .line 471
    if-lez v5, :cond_16

    .line 472
    .line 473
    iget v7, v1, LY4/b;->b:I

    .line 474
    .line 475
    invoke-static {v4, v7, v4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 476
    .line 477
    .line 478
    :cond_16
    invoke-virtual {v1, v5, v4}, LY4/b;->y(I[B)V

    .line 479
    .line 480
    .line 481
    :cond_17
    :goto_8
    invoke-virtual {v1}, LY4/b;->a()I

    .line 482
    .line 483
    .line 484
    move-result v5

    .line 485
    if-ge v5, v6, :cond_19

    .line 486
    .line 487
    iget v5, v1, LY4/b;->c:I

    .line 488
    .line 489
    rsub-int v7, v5, 0x24b8

    .line 490
    .line 491
    move-object/from16 v8, p1

    .line 492
    .line 493
    check-cast v8, LJ5/h;

    .line 494
    .line 495
    invoke-virtual {v8, v4, v5, v7}, LJ5/h;->read([BII)I

    .line 496
    .line 497
    .line 498
    move-result v7

    .line 499
    const/4 v8, -0x1

    .line 500
    if-ne v7, v8, :cond_18

    .line 501
    .line 502
    return v8

    .line 503
    :cond_18
    add-int/2addr v5, v7

    .line 504
    invoke-virtual {v1, v5}, LY4/b;->z(I)V

    .line 505
    .line 506
    .line 507
    goto :goto_8

    .line 508
    :cond_19
    iget v4, v1, LY4/b;->b:I

    .line 509
    .line 510
    iget v5, v1, LY4/b;->c:I

    .line 511
    .line 512
    iget-object v6, v1, LY4/b;->a:[B

    .line 513
    .line 514
    move v7, v4

    .line 515
    :goto_9
    if-ge v7, v5, :cond_1a

    .line 516
    .line 517
    aget-byte v8, v6, v7

    .line 518
    .line 519
    const/16 v9, 0x47

    .line 520
    .line 521
    if-eq v8, v9, :cond_1a

    .line 522
    .line 523
    add-int/lit8 v7, v7, 0x1

    .line 524
    .line 525
    goto :goto_9

    .line 526
    :cond_1a
    invoke-virtual {v1, v7}, LY4/b;->A(I)V

    .line 527
    .line 528
    .line 529
    add-int/lit16 v6, v7, 0xbc

    .line 530
    .line 531
    const/4 v8, 0x0

    .line 532
    if-le v6, v5, :cond_1c

    .line 533
    .line 534
    iget v5, v0, LT5/z;->r:I

    .line 535
    .line 536
    sub-int/2addr v7, v4

    .line 537
    add-int/2addr v7, v5

    .line 538
    iput v7, v0, LT5/z;->r:I

    .line 539
    .line 540
    move/from16 v4, v25

    .line 541
    .line 542
    const/4 v5, 0x2

    .line 543
    if-ne v4, v5, :cond_1d

    .line 544
    .line 545
    const/16 v9, 0x178

    .line 546
    .line 547
    if-gt v7, v9, :cond_1b

    .line 548
    .line 549
    goto :goto_a

    .line 550
    :cond_1b
    const-string v1, "Cannot find sync byte. Most likely not a Transport Stream."

    .line 551
    .line 552
    invoke-static {v1, v8}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    throw v1

    .line 557
    :cond_1c
    move/from16 v4, v25

    .line 558
    .line 559
    const/4 v5, 0x2

    .line 560
    iput v2, v0, LT5/z;->r:I

    .line 561
    .line 562
    :cond_1d
    :goto_a
    iget v7, v1, LY4/b;->c:I

    .line 563
    .line 564
    if-le v6, v7, :cond_1e

    .line 565
    .line 566
    return v2

    .line 567
    :cond_1e
    invoke-virtual {v1}, LY4/b;->d()I

    .line 568
    .line 569
    .line 570
    move-result v9

    .line 571
    const/high16 v10, 0x800000

    .line 572
    .line 573
    and-int/2addr v10, v9

    .line 574
    if-eqz v10, :cond_1f

    .line 575
    .line 576
    invoke-virtual {v1, v6}, LY4/b;->A(I)V

    .line 577
    .line 578
    .line 579
    return v2

    .line 580
    :cond_1f
    const/high16 v10, 0x400000

    .line 581
    .line 582
    and-int/2addr v10, v9

    .line 583
    if-eqz v10, :cond_20

    .line 584
    .line 585
    move v10, v3

    .line 586
    goto :goto_b

    .line 587
    :cond_20
    move v10, v2

    .line 588
    :goto_b
    const v11, 0x1fff00

    .line 589
    .line 590
    .line 591
    and-int/2addr v11, v9

    .line 592
    shr-int/lit8 v11, v11, 0x8

    .line 593
    .line 594
    and-int/lit8 v14, v9, 0x20

    .line 595
    .line 596
    if-eqz v14, :cond_21

    .line 597
    .line 598
    move v14, v3

    .line 599
    goto :goto_c

    .line 600
    :cond_21
    move v14, v2

    .line 601
    :goto_c
    and-int/lit8 v15, v9, 0x10

    .line 602
    .line 603
    if-eqz v15, :cond_22

    .line 604
    .line 605
    iget-object v8, v0, LT5/z;->g:Landroid/util/SparseArray;

    .line 606
    .line 607
    invoke-virtual {v8, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v8

    .line 611
    check-cast v8, LT5/C;

    .line 612
    .line 613
    :cond_22
    if-nez v8, :cond_23

    .line 614
    .line 615
    invoke-virtual {v1, v6}, LY4/b;->A(I)V

    .line 616
    .line 617
    .line 618
    return v2

    .line 619
    :cond_23
    if-eq v4, v5, :cond_25

    .line 620
    .line 621
    and-int/lit8 v9, v9, 0xf

    .line 622
    .line 623
    iget-object v15, v0, LT5/z;->e:Landroid/util/SparseIntArray;

    .line 624
    .line 625
    move/from16 v19, v3

    .line 626
    .line 627
    add-int/lit8 v3, v9, -0x1

    .line 628
    .line 629
    invoke-virtual {v15, v11, v3}, Landroid/util/SparseIntArray;->get(II)I

    .line 630
    .line 631
    .line 632
    move-result v3

    .line 633
    invoke-virtual {v15, v11, v9}, Landroid/util/SparseIntArray;->put(II)V

    .line 634
    .line 635
    .line 636
    if-ne v3, v9, :cond_24

    .line 637
    .line 638
    invoke-virtual {v1, v6}, LY4/b;->A(I)V

    .line 639
    .line 640
    .line 641
    return v2

    .line 642
    :cond_24
    add-int/lit8 v3, v3, 0x1

    .line 643
    .line 644
    and-int/lit8 v3, v3, 0xf

    .line 645
    .line 646
    if-eq v9, v3, :cond_26

    .line 647
    .line 648
    invoke-interface {v8}, LT5/C;->a()V

    .line 649
    .line 650
    .line 651
    goto :goto_d

    .line 652
    :cond_25
    move/from16 v19, v3

    .line 653
    .line 654
    :cond_26
    :goto_d
    if-eqz v14, :cond_28

    .line 655
    .line 656
    invoke-virtual {v1}, LY4/b;->q()I

    .line 657
    .line 658
    .line 659
    move-result v3

    .line 660
    invoke-virtual {v1}, LY4/b;->q()I

    .line 661
    .line 662
    .line 663
    move-result v9

    .line 664
    and-int/lit8 v9, v9, 0x40

    .line 665
    .line 666
    if-eqz v9, :cond_27

    .line 667
    .line 668
    move v9, v5

    .line 669
    goto :goto_e

    .line 670
    :cond_27
    move v9, v2

    .line 671
    :goto_e
    or-int/2addr v10, v9

    .line 672
    add-int/lit8 v3, v3, -0x1

    .line 673
    .line 674
    invoke-virtual {v1, v3}, LY4/b;->B(I)V

    .line 675
    .line 676
    .line 677
    :cond_28
    iget-boolean v3, v0, LT5/z;->n:Z

    .line 678
    .line 679
    if-eq v4, v5, :cond_29

    .line 680
    .line 681
    if-nez v3, :cond_29

    .line 682
    .line 683
    iget-object v9, v0, LT5/z;->i:Landroid/util/SparseBooleanArray;

    .line 684
    .line 685
    invoke-virtual {v9, v11, v2}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    .line 686
    .line 687
    .line 688
    move-result v9

    .line 689
    if-nez v9, :cond_2a

    .line 690
    .line 691
    :cond_29
    invoke-virtual {v1, v6}, LY4/b;->z(I)V

    .line 692
    .line 693
    .line 694
    invoke-interface {v8, v10, v1}, LT5/C;->b(ILY4/b;)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v1, v7}, LY4/b;->z(I)V

    .line 698
    .line 699
    .line 700
    :cond_2a
    if-eq v4, v5, :cond_2b

    .line 701
    .line 702
    if-nez v3, :cond_2b

    .line 703
    .line 704
    iget-boolean v3, v0, LT5/z;->n:Z

    .line 705
    .line 706
    if-eqz v3, :cond_2b

    .line 707
    .line 708
    cmp-long v3, v12, v17

    .line 709
    .line 710
    if-eqz v3, :cond_2b

    .line 711
    .line 712
    move/from16 v3, v19

    .line 713
    .line 714
    iput-boolean v3, v0, LT5/z;->p:Z

    .line 715
    .line 716
    :cond_2b
    invoke-virtual {v1, v6}, LY4/b;->A(I)V

    .line 717
    .line 718
    .line 719
    return v2
.end method

.method public final h(Lf6/N;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT5/z;->l:LJ5/m;

    .line 2
    .line 3
    return-void
.end method

.method public final i(LJ5/l;)Z
    .locals 6

    .line 1
    iget-object v0, p0, LT5/z;->d:LY4/b;

    .line 2
    .line 3
    iget-object v0, v0, LY4/b;->a:[B

    .line 4
    .line 5
    check-cast p1, LJ5/h;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/16 v2, 0x3ac

    .line 9
    .line 10
    invoke-virtual {p1, v0, v1, v2, v1}, LJ5/h;->c([BIIZ)Z

    .line 11
    .line 12
    .line 13
    move v2, v1

    .line 14
    :goto_0
    const/16 v3, 0xbc

    .line 15
    .line 16
    if-ge v2, v3, :cond_2

    .line 17
    .line 18
    move v3, v1

    .line 19
    :goto_1
    const/4 v4, 0x5

    .line 20
    if-ge v3, v4, :cond_1

    .line 21
    .line 22
    mul-int/lit16 v4, v3, 0xbc

    .line 23
    .line 24
    add-int/2addr v4, v2

    .line 25
    aget-byte v4, v0, v4

    .line 26
    .line 27
    const/16 v5, 0x47

    .line 28
    .line 29
    if-eq v4, v5, :cond_0

    .line 30
    .line 31
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {p1, v2}, LJ5/h;->j(I)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    return p1

    .line 42
    :cond_2
    return v1
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
