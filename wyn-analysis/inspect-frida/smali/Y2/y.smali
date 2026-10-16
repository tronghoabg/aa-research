.class public final LY2/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls2/m;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/util/List;

.field public final d:LQ1/o;

.field public final e:Landroid/util/SparseIntArray;

.field public final f:LY2/f;

.field public final g:LP2/j;

.field public final h:Landroid/util/SparseArray;

.field public final i:Landroid/util/SparseBooleanArray;

.field public final j:Landroid/util/SparseBooleanArray;

.field public final k:LY2/t;

.field public l:LY2/s;

.field public m:Ls2/o;

.field public n:I

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:LY2/A;

.field public s:I

.field public t:I


# direct methods
.method public constructor <init>(IILP2/j;LQ1/u;LY2/f;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p5, p0, LY2/y;->f:LY2/f;

    .line 5
    .line 6
    iput p1, p0, LY2/y;->a:I

    .line 7
    .line 8
    iput p2, p0, LY2/y;->b:I

    .line 9
    .line 10
    iput-object p3, p0, LY2/y;->g:LP2/j;

    .line 11
    .line 12
    const/4 p2, 0x1

    .line 13
    if-eq p1, p2, :cond_1

    .line 14
    .line 15
    const/4 p2, 0x2

    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LY2/y;->c:Ljava/util/List;

    .line 25
    .line 26
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    invoke-static {p4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, LY2/y;->c:Ljava/util/List;

    .line 35
    .line 36
    :goto_1
    new-instance p1, LQ1/o;

    .line 37
    .line 38
    const/16 p2, 0x24b8

    .line 39
    .line 40
    new-array p2, p2, [B

    .line 41
    .line 42
    const/4 p3, 0x0

    .line 43
    invoke-direct {p1, p2, p3}, LQ1/o;-><init>([BI)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, LY2/y;->d:LQ1/o;

    .line 47
    .line 48
    new-instance p1, Landroid/util/SparseBooleanArray;

    .line 49
    .line 50
    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, LY2/y;->i:Landroid/util/SparseBooleanArray;

    .line 54
    .line 55
    new-instance p2, Landroid/util/SparseBooleanArray;

    .line 56
    .line 57
    invoke-direct {p2}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p2, p0, LY2/y;->j:Landroid/util/SparseBooleanArray;

    .line 61
    .line 62
    new-instance p2, Landroid/util/SparseArray;

    .line 63
    .line 64
    invoke-direct {p2}, Landroid/util/SparseArray;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p2, p0, LY2/y;->h:Landroid/util/SparseArray;

    .line 68
    .line 69
    new-instance p4, Landroid/util/SparseIntArray;

    .line 70
    .line 71
    invoke-direct {p4}, Landroid/util/SparseIntArray;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object p4, p0, LY2/y;->e:Landroid/util/SparseIntArray;

    .line 75
    .line 76
    new-instance p4, LY2/t;

    .line 77
    .line 78
    const/4 p5, 0x1

    .line 79
    invoke-direct {p4, p5}, LY2/t;-><init>(I)V

    .line 80
    .line 81
    .line 82
    iput-object p4, p0, LY2/y;->k:LY2/t;

    .line 83
    .line 84
    sget-object p4, Ls2/o;->f9:La9/b;

    .line 85
    .line 86
    iput-object p4, p0, LY2/y;->m:Ls2/o;

    .line 87
    .line 88
    const/4 p4, -0x1

    .line 89
    iput p4, p0, LY2/y;->t:I

    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->clear()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Landroid/util/SparseArray;->clear()V

    .line 95
    .line 96
    .line 97
    new-instance p1, Landroid/util/SparseArray;

    .line 98
    .line 99
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 103
    .line 104
    .line 105
    move-result p4

    .line 106
    move p5, p3

    .line 107
    :goto_2
    if-ge p5, p4, :cond_2

    .line 108
    .line 109
    invoke-virtual {p1, p5}, Landroid/util/SparseArray;->keyAt(I)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-virtual {p1, p5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, LY2/A;

    .line 118
    .line 119
    invoke-virtual {p2, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    add-int/lit8 p5, p5, 0x1

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_2
    new-instance p1, LY2/x;

    .line 126
    .line 127
    new-instance p4, LS3/e;

    .line 128
    .line 129
    invoke-direct {p4, p0}, LS3/e;-><init>(LY2/y;)V

    .line 130
    .line 131
    .line 132
    invoke-direct {p1, p4}, LY2/x;-><init>(LY2/w;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, p3, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    const/4 p1, 0x0

    .line 139
    iput-object p1, p0, LY2/y;->r:LY2/A;

    .line 140
    .line 141
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 10

    .line 1
    iget p1, p0, LY2/y;->a:I

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
    invoke-static {p1}, LQ1/k;->g(Z)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, LY2/y;->c:Ljava/util/List;

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
    check-cast v5, LQ1/u;

    .line 30
    .line 31
    invoke-virtual {v5}, LQ1/u;->e()J

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
    invoke-virtual {v5}, LQ1/u;->d()J

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
    invoke-virtual {v5, p3, p4}, LQ1/u;->g(J)V

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
    iget-object p1, p0, LY2/y;->l:LY2/s;

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
    iget-object p1, p0, LY2/y;->d:LQ1/o;

    .line 88
    .line 89
    invoke-virtual {p1, v1}, LQ1/o;->D(I)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, LY2/y;->e:Landroid/util/SparseIntArray;

    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 95
    .line 96
    .line 97
    move p1, v1

    .line 98
    :goto_4
    iget-object p2, p0, LY2/y;->h:Landroid/util/SparseArray;

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
    check-cast p2, LY2/A;

    .line 111
    .line 112
    invoke-interface {p2}, LY2/A;->a()V

    .line 113
    .line 114
    .line 115
    add-int/lit8 p1, p1, 0x1

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_7
    iput v1, p0, LY2/y;->s:I

    .line 119
    .line 120
    return-void
.end method

.method public final g(Ls2/o;)V
    .locals 2

    .line 1
    iget v0, p0, LY2/y;->b:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LDd/c;

    .line 8
    .line 9
    iget-object v1, p0, LY2/y;->g:LP2/j;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, LDd/c;-><init>(Ls2/o;LP2/j;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v0

    .line 15
    :cond_0
    iput-object p1, p0, LY2/y;->m:Ls2/o;

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
    .locals 6

    .line 1
    iget-object v0, p0, LY2/y;->d:LQ1/o;

    .line 2
    .line 3
    iget-object v0, v0, LQ1/o;->a:[B

    .line 4
    .line 5
    check-cast p1, Ls2/j;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/16 v2, 0x3ac

    .line 9
    .line 10
    invoke-virtual {p1, v0, v1, v2, v1}, Ls2/j;->c([BIIZ)Z

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
    invoke-virtual {p1, v2}, Ls2/j;->j(I)V

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
    move-object/from16 v2, p1

    .line 6
    .line 7
    check-cast v2, Ls2/j;

    .line 8
    .line 9
    iget-wide v12, v2, Ls2/j;->c:J

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    iget v4, v0, LY2/y;->a:I

    .line 14
    .line 15
    const/4 v5, 0x2

    .line 16
    if-ne v4, v5, :cond_0

    .line 17
    .line 18
    move/from16 v17, v3

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move/from16 v17, v2

    .line 22
    .line 23
    :goto_0
    iget-boolean v6, v0, LY2/y;->o:Z

    .line 24
    .line 25
    const/16 v7, 0x47

    .line 26
    .line 27
    const-wide/16 v18, -0x1

    .line 28
    .line 29
    if-eqz v6, :cond_14

    .line 30
    .line 31
    cmp-long v6, v12, v18

    .line 32
    .line 33
    iget-object v10, v0, LY2/y;->k:LY2/t;

    .line 34
    .line 35
    if-eqz v6, :cond_10

    .line 36
    .line 37
    if-nez v17, :cond_10

    .line 38
    .line 39
    iget-boolean v6, v10, LY2/t;->d:Z

    .line 40
    .line 41
    if-nez v6, :cond_10

    .line 42
    .line 43
    iget v4, v0, LY2/y;->t:I

    .line 44
    .line 45
    if-gtz v4, :cond_1

    .line 46
    .line 47
    move-object/from16 v1, p1

    .line 48
    .line 49
    check-cast v1, Ls2/j;

    .line 50
    .line 51
    invoke-virtual {v10, v1}, LY2/t;->a(Ls2/j;)V

    .line 52
    .line 53
    .line 54
    return v2

    .line 55
    :cond_1
    iget-boolean v5, v10, LY2/t;->f:Z

    .line 56
    .line 57
    iget-object v6, v10, LY2/t;->c:LQ1/o;

    .line 58
    .line 59
    const v11, 0x1b8a0

    .line 60
    .line 61
    .line 62
    if-nez v5, :cond_8

    .line 63
    .line 64
    move-object/from16 v5, p1

    .line 65
    .line 66
    check-cast v5, Ls2/j;

    .line 67
    .line 68
    int-to-long v11, v11

    .line 69
    iget-wide v13, v5, Ls2/j;->c:J

    .line 70
    .line 71
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 72
    .line 73
    .line 74
    move-result-wide v11

    .line 75
    long-to-int v11, v11

    .line 76
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    int-to-long v8, v11

    .line 82
    sub-long/2addr v13, v8

    .line 83
    iget-wide v8, v5, Ls2/j;->d:J

    .line 84
    .line 85
    cmp-long v8, v8, v13

    .line 86
    .line 87
    if-eqz v8, :cond_2

    .line 88
    .line 89
    iput-wide v13, v1, LJ5/n;->a:J

    .line 90
    .line 91
    return v3

    .line 92
    :cond_2
    invoke-virtual {v6, v11}, LQ1/o;->D(I)V

    .line 93
    .line 94
    .line 95
    iput v2, v5, Ls2/j;->f:I

    .line 96
    .line 97
    iget-object v1, v6, LQ1/o;->a:[B

    .line 98
    .line 99
    invoke-virtual {v5, v1, v2, v11, v2}, Ls2/j;->c([BIIZ)Z

    .line 100
    .line 101
    .line 102
    iget v1, v6, LQ1/o;->b:I

    .line 103
    .line 104
    iget v5, v6, LQ1/o;->c:I

    .line 105
    .line 106
    add-int/lit16 v8, v5, -0xbc

    .line 107
    .line 108
    :goto_1
    if-lt v8, v1, :cond_7

    .line 109
    .line 110
    iget-object v9, v6, LQ1/o;->a:[B

    .line 111
    .line 112
    const/4 v11, -0x4

    .line 113
    move v12, v2

    .line 114
    :goto_2
    const/4 v13, 0x4

    .line 115
    if-gt v11, v13, :cond_6

    .line 116
    .line 117
    mul-int/lit16 v13, v11, 0xbc

    .line 118
    .line 119
    add-int/2addr v13, v8

    .line 120
    if-lt v13, v1, :cond_4

    .line 121
    .line 122
    if-ge v13, v5, :cond_4

    .line 123
    .line 124
    aget-byte v13, v9, v13

    .line 125
    .line 126
    if-eq v13, v7, :cond_3

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_3
    add-int/2addr v12, v3

    .line 130
    const/4 v13, 0x5

    .line 131
    if-ne v12, v13, :cond_5

    .line 132
    .line 133
    invoke-static {v6, v8, v4}, LU8/v0;->j0(LQ1/o;II)J

    .line 134
    .line 135
    .line 136
    move-result-wide v11

    .line 137
    cmp-long v9, v11, v15

    .line 138
    .line 139
    if-eqz v9, :cond_6

    .line 140
    .line 141
    move-wide v8, v11

    .line 142
    goto :goto_4

    .line 143
    :cond_4
    :goto_3
    move v12, v2

    .line 144
    :cond_5
    add-int/lit8 v11, v11, 0x1

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_6
    add-int/lit8 v8, v8, -0x1

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_7
    move-wide v8, v15

    .line 151
    :goto_4
    iput-wide v8, v10, LY2/t;->h:J

    .line 152
    .line 153
    iput-boolean v3, v10, LY2/t;->f:Z

    .line 154
    .line 155
    return v2

    .line 156
    :cond_8
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    iget-wide v8, v10, LY2/t;->h:J

    .line 162
    .line 163
    cmp-long v5, v8, v15

    .line 164
    .line 165
    if-nez v5, :cond_9

    .line 166
    .line 167
    move-object/from16 v1, p1

    .line 168
    .line 169
    check-cast v1, Ls2/j;

    .line 170
    .line 171
    invoke-virtual {v10, v1}, LY2/t;->a(Ls2/j;)V

    .line 172
    .line 173
    .line 174
    return v2

    .line 175
    :cond_9
    iget-boolean v5, v10, LY2/t;->e:Z

    .line 176
    .line 177
    if-nez v5, :cond_e

    .line 178
    .line 179
    int-to-long v8, v11

    .line 180
    move-object/from16 v5, p1

    .line 181
    .line 182
    check-cast v5, Ls2/j;

    .line 183
    .line 184
    iget-wide v11, v5, Ls2/j;->c:J

    .line 185
    .line 186
    invoke-static {v8, v9, v11, v12}, Ljava/lang/Math;->min(JJ)J

    .line 187
    .line 188
    .line 189
    move-result-wide v8

    .line 190
    long-to-int v8, v8

    .line 191
    iget-wide v11, v5, Ls2/j;->d:J

    .line 192
    .line 193
    int-to-long v13, v2

    .line 194
    cmp-long v9, v11, v13

    .line 195
    .line 196
    if-eqz v9, :cond_a

    .line 197
    .line 198
    iput-wide v13, v1, LJ5/n;->a:J

    .line 199
    .line 200
    return v3

    .line 201
    :cond_a
    invoke-virtual {v6, v8}, LQ1/o;->D(I)V

    .line 202
    .line 203
    .line 204
    iput v2, v5, Ls2/j;->f:I

    .line 205
    .line 206
    iget-object v1, v6, LQ1/o;->a:[B

    .line 207
    .line 208
    invoke-virtual {v5, v1, v2, v8, v2}, Ls2/j;->c([BIIZ)Z

    .line 209
    .line 210
    .line 211
    iget v1, v6, LQ1/o;->b:I

    .line 212
    .line 213
    iget v5, v6, LQ1/o;->c:I

    .line 214
    .line 215
    :goto_5
    if-ge v1, v5, :cond_d

    .line 216
    .line 217
    iget-object v8, v6, LQ1/o;->a:[B

    .line 218
    .line 219
    aget-byte v8, v8, v1

    .line 220
    .line 221
    if-eq v8, v7, :cond_b

    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_b
    invoke-static {v6, v1, v4}, LU8/v0;->j0(LQ1/o;II)J

    .line 225
    .line 226
    .line 227
    move-result-wide v8

    .line 228
    cmp-long v11, v8, v15

    .line 229
    .line 230
    if-eqz v11, :cond_c

    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_c
    :goto_6
    add-int/lit8 v1, v1, 0x1

    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_d
    move-wide v8, v15

    .line 237
    :goto_7
    iput-wide v8, v10, LY2/t;->g:J

    .line 238
    .line 239
    iput-boolean v3, v10, LY2/t;->e:Z

    .line 240
    .line 241
    return v2

    .line 242
    :cond_e
    iget-wide v3, v10, LY2/t;->g:J

    .line 243
    .line 244
    cmp-long v1, v3, v15

    .line 245
    .line 246
    if-nez v1, :cond_f

    .line 247
    .line 248
    move-object/from16 v1, p1

    .line 249
    .line 250
    check-cast v1, Ls2/j;

    .line 251
    .line 252
    invoke-virtual {v10, v1}, LY2/t;->a(Ls2/j;)V

    .line 253
    .line 254
    .line 255
    return v2

    .line 256
    :cond_f
    iget-object v1, v10, LY2/t;->b:LQ1/u;

    .line 257
    .line 258
    invoke-virtual {v1, v3, v4}, LQ1/u;->b(J)J

    .line 259
    .line 260
    .line 261
    move-result-wide v3

    .line 262
    iget-wide v5, v10, LY2/t;->h:J

    .line 263
    .line 264
    invoke-virtual {v1, v5, v6}, LQ1/u;->c(J)J

    .line 265
    .line 266
    .line 267
    move-result-wide v5

    .line 268
    sub-long/2addr v5, v3

    .line 269
    iput-wide v5, v10, LY2/t;->i:J

    .line 270
    .line 271
    move-object/from16 v1, p1

    .line 272
    .line 273
    check-cast v1, Ls2/j;

    .line 274
    .line 275
    invoke-virtual {v10, v1}, LY2/t;->a(Ls2/j;)V

    .line 276
    .line 277
    .line 278
    return v2

    .line 279
    :cond_10
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    iget-boolean v6, v0, LY2/y;->p:Z

    .line 285
    .line 286
    if-nez v6, :cond_12

    .line 287
    .line 288
    iput-boolean v3, v0, LY2/y;->p:Z

    .line 289
    .line 290
    move v8, v7

    .line 291
    iget-wide v6, v10, LY2/t;->i:J

    .line 292
    .line 293
    cmp-long v9, v6, v15

    .line 294
    .line 295
    if-eqz v9, :cond_11

    .line 296
    .line 297
    move v9, v3

    .line 298
    new-instance v3, LY2/s;

    .line 299
    .line 300
    iget v11, v0, LY2/y;->t:I

    .line 301
    .line 302
    move v14, v4

    .line 303
    new-instance v4, La9/a;

    .line 304
    .line 305
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 306
    .line 307
    .line 308
    move v15, v5

    .line 309
    new-instance v5, LE4/n;

    .line 310
    .line 311
    iget-object v10, v10, LY2/t;->b:LQ1/u;

    .line 312
    .line 313
    invoke-direct {v5, v11, v10}, LE4/n;-><init>(ILQ1/u;)V

    .line 314
    .line 315
    .line 316
    const-wide/16 v10, 0x1

    .line 317
    .line 318
    add-long/2addr v10, v6

    .line 319
    const/16 v16, 0x3ac

    .line 320
    .line 321
    move/from16 v21, v8

    .line 322
    .line 323
    move/from16 v20, v9

    .line 324
    .line 325
    move-wide v8, v10

    .line 326
    const-wide/16 v10, 0x0

    .line 327
    .line 328
    move/from16 v22, v14

    .line 329
    .line 330
    move/from16 v23, v15

    .line 331
    .line 332
    const-wide/16 v14, 0xbc

    .line 333
    .line 334
    move/from16 v24, v22

    .line 335
    .line 336
    invoke-direct/range {v3 .. v16}, LJ5/f;-><init>(Ls2/e;Ls2/g;JJJJJI)V

    .line 337
    .line 338
    .line 339
    iput-object v3, v0, LY2/y;->l:LY2/s;

    .line 340
    .line 341
    iget-object v4, v0, LY2/y;->m:Ls2/o;

    .line 342
    .line 343
    iget-object v3, v3, LJ5/f;->c:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v3, Ls2/d;

    .line 346
    .line 347
    invoke-interface {v4, v3}, Ls2/o;->s(Ls2/w;)V

    .line 348
    .line 349
    .line 350
    goto :goto_8

    .line 351
    :cond_11
    move/from16 v24, v4

    .line 352
    .line 353
    iget-object v3, v0, LY2/y;->m:Ls2/o;

    .line 354
    .line 355
    new-instance v4, Ls2/q;

    .line 356
    .line 357
    invoke-direct {v4, v6, v7}, Ls2/q;-><init>(J)V

    .line 358
    .line 359
    .line 360
    invoke-interface {v3, v4}, Ls2/o;->s(Ls2/w;)V

    .line 361
    .line 362
    .line 363
    goto :goto_8

    .line 364
    :cond_12
    move/from16 v24, v4

    .line 365
    .line 366
    :goto_8
    iget-boolean v3, v0, LY2/y;->q:Z

    .line 367
    .line 368
    if-eqz v3, :cond_13

    .line 369
    .line 370
    iput-boolean v2, v0, LY2/y;->q:Z

    .line 371
    .line 372
    const-wide/16 v3, 0x0

    .line 373
    .line 374
    invoke-virtual {v0, v3, v4, v3, v4}, LY2/y;->a(JJ)V

    .line 375
    .line 376
    .line 377
    move-object/from16 v5, p1

    .line 378
    .line 379
    check-cast v5, Ls2/j;

    .line 380
    .line 381
    iget-wide v5, v5, Ls2/j;->d:J

    .line 382
    .line 383
    cmp-long v5, v5, v3

    .line 384
    .line 385
    if-eqz v5, :cond_13

    .line 386
    .line 387
    iput-wide v3, v1, LJ5/n;->a:J

    .line 388
    .line 389
    const/4 v9, 0x1

    .line 390
    return v9

    .line 391
    :cond_13
    const/4 v9, 0x1

    .line 392
    iget-object v3, v0, LY2/y;->l:LY2/s;

    .line 393
    .line 394
    if-eqz v3, :cond_15

    .line 395
    .line 396
    iget-object v4, v3, LJ5/f;->e:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v4, LJ5/b;

    .line 399
    .line 400
    if-eqz v4, :cond_15

    .line 401
    .line 402
    move-object/from16 v2, p1

    .line 403
    .line 404
    check-cast v2, Ls2/j;

    .line 405
    .line 406
    invoke-virtual {v3, v2, v1}, LJ5/f;->v(Ls2/j;LJ5/n;)I

    .line 407
    .line 408
    .line 409
    move-result v1

    .line 410
    return v1

    .line 411
    :cond_14
    move v9, v3

    .line 412
    move/from16 v24, v4

    .line 413
    .line 414
    :cond_15
    iget-object v1, v0, LY2/y;->d:LQ1/o;

    .line 415
    .line 416
    iget-object v3, v1, LQ1/o;->a:[B

    .line 417
    .line 418
    iget v4, v1, LQ1/o;->b:I

    .line 419
    .line 420
    rsub-int v4, v4, 0x24b8

    .line 421
    .line 422
    const/16 v5, 0xbc

    .line 423
    .line 424
    if-ge v4, v5, :cond_17

    .line 425
    .line 426
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 427
    .line 428
    .line 429
    move-result v4

    .line 430
    if-lez v4, :cond_16

    .line 431
    .line 432
    iget v6, v1, LQ1/o;->b:I

    .line 433
    .line 434
    invoke-static {v3, v6, v3, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 435
    .line 436
    .line 437
    :cond_16
    invoke-virtual {v1, v4, v3}, LQ1/o;->E(I[B)V

    .line 438
    .line 439
    .line 440
    :cond_17
    :goto_9
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 441
    .line 442
    .line 443
    move-result v4

    .line 444
    iget-object v6, v0, LY2/y;->h:Landroid/util/SparseArray;

    .line 445
    .line 446
    if-ge v4, v5, :cond_1c

    .line 447
    .line 448
    iget v4, v1, LQ1/o;->c:I

    .line 449
    .line 450
    rsub-int v7, v4, 0x24b8

    .line 451
    .line 452
    move-object/from16 v8, p1

    .line 453
    .line 454
    check-cast v8, Ls2/j;

    .line 455
    .line 456
    invoke-virtual {v8, v3, v4, v7}, Ls2/j;->read([BII)I

    .line 457
    .line 458
    .line 459
    move-result v7

    .line 460
    const/4 v8, -0x1

    .line 461
    if-ne v7, v8, :cond_1b

    .line 462
    .line 463
    :goto_a
    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    .line 464
    .line 465
    .line 466
    move-result v1

    .line 467
    if-ge v2, v1, :cond_1a

    .line 468
    .line 469
    invoke-virtual {v6, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    check-cast v1, LY2/A;

    .line 474
    .line 475
    instance-of v3, v1, LY2/r;

    .line 476
    .line 477
    if-eqz v3, :cond_19

    .line 478
    .line 479
    check-cast v1, LY2/r;

    .line 480
    .line 481
    iget v3, v1, LY2/r;->c:I

    .line 482
    .line 483
    const/4 v4, 0x3

    .line 484
    if-ne v3, v4, :cond_19

    .line 485
    .line 486
    iget v3, v1, LY2/r;->j:I

    .line 487
    .line 488
    if-ne v3, v8, :cond_19

    .line 489
    .line 490
    if-eqz v17, :cond_18

    .line 491
    .line 492
    iget-object v3, v1, LY2/r;->a:LY2/h;

    .line 493
    .line 494
    instance-of v3, v3, LY2/j;

    .line 495
    .line 496
    if-nez v3, :cond_19

    .line 497
    .line 498
    :cond_18
    new-instance v3, LQ1/o;

    .line 499
    .line 500
    invoke-direct {v3}, LQ1/o;-><init>()V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v1, v9, v3}, LY2/r;->c(ILQ1/o;)V

    .line 504
    .line 505
    .line 506
    :cond_19
    add-int/lit8 v2, v2, 0x1

    .line 507
    .line 508
    goto :goto_a

    .line 509
    :cond_1a
    return v8

    .line 510
    :cond_1b
    add-int/2addr v4, v7

    .line 511
    invoke-virtual {v1, v4}, LQ1/o;->F(I)V

    .line 512
    .line 513
    .line 514
    goto :goto_9

    .line 515
    :cond_1c
    iget v3, v1, LQ1/o;->b:I

    .line 516
    .line 517
    iget v4, v1, LQ1/o;->c:I

    .line 518
    .line 519
    iget-object v5, v1, LQ1/o;->a:[B

    .line 520
    .line 521
    move v7, v3

    .line 522
    :goto_b
    if-ge v7, v4, :cond_1d

    .line 523
    .line 524
    aget-byte v8, v5, v7

    .line 525
    .line 526
    const/16 v10, 0x47

    .line 527
    .line 528
    if-eq v8, v10, :cond_1d

    .line 529
    .line 530
    add-int/lit8 v7, v7, 0x1

    .line 531
    .line 532
    goto :goto_b

    .line 533
    :cond_1d
    invoke-virtual {v1, v7}, LQ1/o;->G(I)V

    .line 534
    .line 535
    .line 536
    add-int/lit16 v5, v7, 0xbc

    .line 537
    .line 538
    const/4 v8, 0x0

    .line 539
    if-le v5, v4, :cond_1f

    .line 540
    .line 541
    iget v4, v0, LY2/y;->s:I

    .line 542
    .line 543
    sub-int/2addr v7, v3

    .line 544
    add-int/2addr v7, v4

    .line 545
    iput v7, v0, LY2/y;->s:I

    .line 546
    .line 547
    move/from16 v14, v24

    .line 548
    .line 549
    const/4 v15, 0x2

    .line 550
    if-ne v14, v15, :cond_20

    .line 551
    .line 552
    const/16 v3, 0x178

    .line 553
    .line 554
    if-gt v7, v3, :cond_1e

    .line 555
    .line 556
    goto :goto_c

    .line 557
    :cond_1e
    const-string v1, "Cannot find sync byte. Most likely not a Transport Stream."

    .line 558
    .line 559
    invoke-static {v8, v1}, LN1/D;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)LN1/D;

    .line 560
    .line 561
    .line 562
    move-result-object v1

    .line 563
    throw v1

    .line 564
    :cond_1f
    move/from16 v14, v24

    .line 565
    .line 566
    const/4 v15, 0x2

    .line 567
    iput v2, v0, LY2/y;->s:I

    .line 568
    .line 569
    :cond_20
    :goto_c
    iget v3, v1, LQ1/o;->c:I

    .line 570
    .line 571
    if-le v5, v3, :cond_21

    .line 572
    .line 573
    return v2

    .line 574
    :cond_21
    invoke-virtual {v1}, LQ1/o;->h()I

    .line 575
    .line 576
    .line 577
    move-result v4

    .line 578
    const/high16 v7, 0x800000

    .line 579
    .line 580
    and-int/2addr v7, v4

    .line 581
    if-eqz v7, :cond_22

    .line 582
    .line 583
    invoke-virtual {v1, v5}, LQ1/o;->G(I)V

    .line 584
    .line 585
    .line 586
    return v2

    .line 587
    :cond_22
    const/high16 v7, 0x400000

    .line 588
    .line 589
    and-int/2addr v7, v4

    .line 590
    if-eqz v7, :cond_23

    .line 591
    .line 592
    move v7, v9

    .line 593
    goto :goto_d

    .line 594
    :cond_23
    move v7, v2

    .line 595
    :goto_d
    const v10, 0x1fff00

    .line 596
    .line 597
    .line 598
    and-int/2addr v10, v4

    .line 599
    shr-int/lit8 v10, v10, 0x8

    .line 600
    .line 601
    and-int/lit8 v11, v4, 0x20

    .line 602
    .line 603
    if-eqz v11, :cond_24

    .line 604
    .line 605
    move v11, v9

    .line 606
    goto :goto_e

    .line 607
    :cond_24
    move v11, v2

    .line 608
    :goto_e
    and-int/lit8 v16, v4, 0x10

    .line 609
    .line 610
    if-eqz v16, :cond_25

    .line 611
    .line 612
    invoke-virtual {v6, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v6

    .line 616
    move-object v8, v6

    .line 617
    check-cast v8, LY2/A;

    .line 618
    .line 619
    :cond_25
    if-nez v8, :cond_26

    .line 620
    .line 621
    invoke-virtual {v1, v5}, LQ1/o;->G(I)V

    .line 622
    .line 623
    .line 624
    return v2

    .line 625
    :cond_26
    if-eq v14, v15, :cond_28

    .line 626
    .line 627
    and-int/lit8 v4, v4, 0xf

    .line 628
    .line 629
    iget-object v6, v0, LY2/y;->e:Landroid/util/SparseIntArray;

    .line 630
    .line 631
    move/from16 v20, v9

    .line 632
    .line 633
    add-int/lit8 v9, v4, -0x1

    .line 634
    .line 635
    invoke-virtual {v6, v10, v9}, Landroid/util/SparseIntArray;->get(II)I

    .line 636
    .line 637
    .line 638
    move-result v9

    .line 639
    invoke-virtual {v6, v10, v4}, Landroid/util/SparseIntArray;->put(II)V

    .line 640
    .line 641
    .line 642
    if-ne v9, v4, :cond_27

    .line 643
    .line 644
    invoke-virtual {v1, v5}, LQ1/o;->G(I)V

    .line 645
    .line 646
    .line 647
    return v2

    .line 648
    :cond_27
    add-int/lit8 v9, v9, 0x1

    .line 649
    .line 650
    and-int/lit8 v6, v9, 0xf

    .line 651
    .line 652
    if-eq v4, v6, :cond_29

    .line 653
    .line 654
    invoke-interface {v8}, LY2/A;->a()V

    .line 655
    .line 656
    .line 657
    goto :goto_f

    .line 658
    :cond_28
    move/from16 v20, v9

    .line 659
    .line 660
    :cond_29
    :goto_f
    if-eqz v11, :cond_2b

    .line 661
    .line 662
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 663
    .line 664
    .line 665
    move-result v4

    .line 666
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 667
    .line 668
    .line 669
    move-result v6

    .line 670
    and-int/lit8 v6, v6, 0x40

    .line 671
    .line 672
    if-eqz v6, :cond_2a

    .line 673
    .line 674
    move v6, v15

    .line 675
    goto :goto_10

    .line 676
    :cond_2a
    move v6, v2

    .line 677
    :goto_10
    or-int/2addr v7, v6

    .line 678
    add-int/lit8 v4, v4, -0x1

    .line 679
    .line 680
    invoke-virtual {v1, v4}, LQ1/o;->H(I)V

    .line 681
    .line 682
    .line 683
    :cond_2b
    iget-boolean v4, v0, LY2/y;->o:Z

    .line 684
    .line 685
    if-eq v14, v15, :cond_2c

    .line 686
    .line 687
    if-nez v4, :cond_2c

    .line 688
    .line 689
    iget-object v6, v0, LY2/y;->j:Landroid/util/SparseBooleanArray;

    .line 690
    .line 691
    invoke-virtual {v6, v10, v2}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    .line 692
    .line 693
    .line 694
    move-result v6

    .line 695
    if-nez v6, :cond_2d

    .line 696
    .line 697
    :cond_2c
    invoke-virtual {v1, v5}, LQ1/o;->F(I)V

    .line 698
    .line 699
    .line 700
    invoke-interface {v8, v7, v1}, LY2/A;->c(ILQ1/o;)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v1, v3}, LQ1/o;->F(I)V

    .line 704
    .line 705
    .line 706
    :cond_2d
    if-eq v14, v15, :cond_2e

    .line 707
    .line 708
    if-nez v4, :cond_2e

    .line 709
    .line 710
    iget-boolean v3, v0, LY2/y;->o:Z

    .line 711
    .line 712
    if-eqz v3, :cond_2e

    .line 713
    .line 714
    cmp-long v3, v12, v18

    .line 715
    .line 716
    if-eqz v3, :cond_2e

    .line 717
    .line 718
    move/from16 v9, v20

    .line 719
    .line 720
    iput-boolean v9, v0, LY2/y;->q:Z

    .line 721
    .line 722
    :cond_2e
    invoke-virtual {v1, v5}, LQ1/o;->G(I)V

    .line 723
    .line 724
    .line 725
    return v2
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
