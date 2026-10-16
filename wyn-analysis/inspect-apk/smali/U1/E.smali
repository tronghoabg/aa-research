.class public final LU1/E;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:[Lk2/d0;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:LU1/F;

.field public h:Z

.field public final i:[Z

.field public final j:[LU1/X;

.field public final k:Ln2/s;

.field public final l:LE5/n0;

.field public m:LU1/E;

.field public n:Lk2/n0;

.field public o:Ln2/t;

.field public p:J


# direct methods
.method public constructor <init>([LU1/X;JLn2/s;Lo2/e;LE5/n0;LU1/F;Ln2/t;)V
    .locals 7

    .line 1
    move-object v2, p7

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, LU1/E;->j:[LU1/X;

    .line 6
    .line 7
    iput-wide p2, p0, LU1/E;->p:J

    .line 8
    .line 9
    iput-object p4, p0, LU1/E;->k:Ln2/s;

    .line 10
    .line 11
    iput-object p6, p0, LU1/E;->l:LE5/n0;

    .line 12
    .line 13
    iget-object v3, v2, LU1/F;->a:Lk2/H;

    .line 14
    .line 15
    iget-object v4, v3, Lk2/H;->a:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object v4, p0, LU1/E;->b:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object v2, p0, LU1/E;->g:LU1/F;

    .line 20
    .line 21
    sget-object v4, Lk2/n0;->d:Lk2/n0;

    .line 22
    .line 23
    iput-object v4, p0, LU1/E;->n:Lk2/n0;

    .line 24
    .line 25
    move-object v4, p8

    .line 26
    iput-object v4, p0, LU1/E;->o:Ln2/t;

    .line 27
    .line 28
    array-length v4, p1

    .line 29
    new-array v4, v4, [Lk2/d0;

    .line 30
    .line 31
    iput-object v4, p0, LU1/E;->c:[Lk2/d0;

    .line 32
    .line 33
    array-length v0, p1

    .line 34
    new-array v0, v0, [Z

    .line 35
    .line 36
    iput-object v0, p0, LU1/E;->i:[Z

    .line 37
    .line 38
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    sget v0, LU1/a;->d:I

    .line 42
    .line 43
    iget-object v0, v3, Lk2/H;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Landroid/util/Pair;

    .line 46
    .line 47
    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 48
    .line 49
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 50
    .line 51
    invoke-virtual {v3, v0}, Lk2/H;->a(Ljava/lang/Object;)Lk2/H;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v3, p6, LE5/n0;->d:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, Ljava/util/HashMap;

    .line 58
    .line 59
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    check-cast v3, LU1/O;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object v4, p6, LE5/n0;->f:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v4, Ljava/util/HashSet;

    .line 71
    .line 72
    invoke-virtual {v4, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    iget-object v4, p6, LE5/n0;->e:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v4, Ljava/util/HashMap;

    .line 78
    .line 79
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    check-cast v4, LU1/N;

    .line 84
    .line 85
    if-eqz v4, :cond_0

    .line 86
    .line 87
    iget-object v5, v4, LU1/N;->b:LU1/I;

    .line 88
    .line 89
    iget-object v4, v4, LU1/N;->a:Lk2/a;

    .line 90
    .line 91
    invoke-virtual {v4, v5}, Lk2/a;->e(Lk2/I;)V

    .line 92
    .line 93
    .line 94
    :cond_0
    iget-object v4, v3, LU1/O;->c:Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    iget-object v4, v3, LU1/O;->a:Lk2/D;

    .line 100
    .line 101
    iget-wide v5, v2, LU1/F;->b:J

    .line 102
    .line 103
    invoke-virtual {v4, v0, p5, v5, v6}, Lk2/D;->D(Lk2/H;Lo2/e;J)Lk2/A;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget-object v4, p6, LE5/n0;->c:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v4, Ljava/util/IdentityHashMap;

    .line 110
    .line 111
    invoke-virtual {v4, v0, v3}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p6}, LE5/n0;->g()V

    .line 115
    .line 116
    .line 117
    iget-wide v1, v2, LU1/F;->d:J

    .line 118
    .line 119
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    cmp-long v3, v1, v3

    .line 125
    .line 126
    if-eqz v3, :cond_1

    .line 127
    .line 128
    new-instance v3, Lk2/e;

    .line 129
    .line 130
    const/4 v4, 0x1

    .line 131
    const-wide/16 v5, 0x0

    .line 132
    .line 133
    move-object p2, v0

    .line 134
    move-wide p6, v1

    .line 135
    move-object p1, v3

    .line 136
    move p3, v4

    .line 137
    move-wide p4, v5

    .line 138
    invoke-direct/range {p1 .. p7}, Lk2/e;-><init>(Lk2/F;ZJJ)V

    .line 139
    .line 140
    .line 141
    move-object v0, p1

    .line 142
    :cond_1
    iput-object v0, p0, LU1/E;->a:Ljava/lang/Object;

    .line 143
    .line 144
    return-void
.end method


# virtual methods
.method public final a(Ln2/t;JZ[Z)J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    iget v4, v1, Ln2/t;->a:I

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    if-ge v3, v4, :cond_1

    .line 11
    .line 12
    if-nez p4, :cond_0

    .line 13
    .line 14
    iget-object v4, v0, LU1/E;->o:Ln2/t;

    .line 15
    .line 16
    invoke-virtual {v1, v4, v3}, Ln2/t;->a(Ln2/t;I)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    move v5, v2

    .line 24
    :goto_1
    iget-object v4, v0, LU1/E;->i:[Z

    .line 25
    .line 26
    aput-boolean v5, v4, v3

    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v3, v2

    .line 32
    :goto_2
    iget-object v4, v0, LU1/E;->j:[LU1/X;

    .line 33
    .line 34
    array-length v6, v4

    .line 35
    const/4 v7, -0x2

    .line 36
    iget-object v8, v0, LU1/E;->c:[Lk2/d0;

    .line 37
    .line 38
    if-ge v3, v6, :cond_3

    .line 39
    .line 40
    aget-object v4, v4, v3

    .line 41
    .line 42
    invoke-interface {v4}, LU1/X;->f()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-ne v4, v7, :cond_2

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    aput-object v4, v8, v3

    .line 50
    .line 51
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    invoke-virtual {v0}, LU1/E;->b()V

    .line 55
    .line 56
    .line 57
    iput-object v1, v0, LU1/E;->o:Ln2/t;

    .line 58
    .line 59
    invoke-virtual {v0}, LU1/E;->c()V

    .line 60
    .line 61
    .line 62
    iget-object v9, v0, LU1/E;->a:Ljava/lang/Object;

    .line 63
    .line 64
    iget-object v12, v0, LU1/E;->c:[Lk2/d0;

    .line 65
    .line 66
    iget-object v10, v1, Ln2/t;->c:[Ln2/q;

    .line 67
    .line 68
    iget-object v11, v0, LU1/E;->i:[Z

    .line 69
    .line 70
    move-wide/from16 v14, p2

    .line 71
    .line 72
    move-object/from16 v13, p5

    .line 73
    .line 74
    invoke-interface/range {v9 .. v15}, Lk2/F;->r([Ln2/q;[Z[Lk2/d0;[ZJ)J

    .line 75
    .line 76
    .line 77
    move-result-wide v9

    .line 78
    move v3, v2

    .line 79
    :goto_3
    array-length v6, v4

    .line 80
    if-ge v3, v6, :cond_5

    .line 81
    .line 82
    aget-object v6, v4, v3

    .line 83
    .line 84
    invoke-interface {v6}, LU1/X;->f()I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-ne v6, v7, :cond_4

    .line 89
    .line 90
    iget-object v6, v0, LU1/E;->o:Ln2/t;

    .line 91
    .line 92
    invoke-virtual {v6, v3}, Ln2/t;->b(I)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_4

    .line 97
    .line 98
    new-instance v6, Lk2/w;

    .line 99
    .line 100
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 101
    .line 102
    .line 103
    aput-object v6, v8, v3

    .line 104
    .line 105
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_5
    iput-boolean v2, v0, LU1/E;->f:Z

    .line 109
    .line 110
    move v3, v2

    .line 111
    :goto_4
    array-length v6, v8

    .line 112
    if-ge v3, v6, :cond_9

    .line 113
    .line 114
    aget-object v6, v8, v3

    .line 115
    .line 116
    if-eqz v6, :cond_6

    .line 117
    .line 118
    invoke-virtual {v1, v3}, Ln2/t;->b(I)Z

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    invoke-static {v6}, LQ1/k;->g(Z)V

    .line 123
    .line 124
    .line 125
    aget-object v6, v4, v3

    .line 126
    .line 127
    invoke-interface {v6}, LU1/X;->f()I

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-eq v6, v7, :cond_8

    .line 132
    .line 133
    iput-boolean v5, v0, LU1/E;->f:Z

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_6
    iget-object v6, v1, Ln2/t;->c:[Ln2/q;

    .line 137
    .line 138
    aget-object v6, v6, v3

    .line 139
    .line 140
    if-nez v6, :cond_7

    .line 141
    .line 142
    move v6, v5

    .line 143
    goto :goto_5

    .line 144
    :cond_7
    move v6, v2

    .line 145
    :goto_5
    invoke-static {v6}, LQ1/k;->g(Z)V

    .line 146
    .line 147
    .line 148
    :cond_8
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_9
    return-wide v9
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, LU1/E;->m:LU1/E;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    iget-object v1, p0, LU1/E;->o:Ln2/t;

    .line 7
    .line 8
    iget v2, v1, Ln2/t;->a:I

    .line 9
    .line 10
    if-ge v0, v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ln2/t;->b(I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, p0, LU1/E;->o:Ln2/t;

    .line 17
    .line 18
    iget-object v2, v2, Ln2/t;->c:[Ln2/q;

    .line 19
    .line 20
    aget-object v2, v2, v0

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v2}, Ln2/q;->a()V

    .line 27
    .line 28
    .line 29
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, LU1/E;->m:LU1/E;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    iget-object v1, p0, LU1/E;->o:Ln2/t;

    .line 7
    .line 8
    iget v2, v1, Ln2/t;->a:I

    .line 9
    .line 10
    if-ge v0, v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ln2/t;->b(I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, p0, LU1/E;->o:Ln2/t;

    .line 17
    .line 18
    iget-object v2, v2, Ln2/t;->c:[Ln2/q;

    .line 19
    .line 20
    aget-object v2, v2, v0

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v2}, Ln2/q;->i()V

    .line 27
    .line 28
    .line 29
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    return-void
.end method

.method public final d()J
    .locals 5

    .line 1
    iget-boolean v0, p0, LU1/E;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LU1/E;->g:LU1/F;

    .line 6
    .line 7
    iget-wide v0, v0, LU1/F;->b:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-boolean v0, p0, LU1/E;->f:Z

    .line 11
    .line 12
    const-wide/high16 v1, -0x8000000000000000L

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, LU1/E;->a:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {v0}, Lk2/f0;->n()J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move-wide v3, v1

    .line 24
    :goto_0
    cmp-long v0, v3, v1

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, LU1/E;->g:LU1/F;

    .line 29
    .line 30
    iget-wide v0, v0, LU1/F;->e:J

    .line 31
    .line 32
    return-wide v0

    .line 33
    :cond_2
    return-wide v3
.end method

.method public final e()J
    .locals 4

    .line 1
    iget-object v0, p0, LU1/E;->g:LU1/F;

    .line 2
    .line 3
    iget-wide v0, v0, LU1/F;->b:J

    .line 4
    .line 5
    iget-wide v2, p0, LU1/E;->p:J

    .line 6
    .line 7
    add-long/2addr v0, v2

    .line 8
    return-wide v0
.end method

.method public final f(FLN1/N;Z)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LU1/E;->e:Z

    .line 3
    .line 4
    iget-object v0, p0, LU1/E;->a:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-interface {v0}, Lk2/F;->j()Lk2/n0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, LU1/E;->n:Lk2/n0;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2, p3}, LU1/E;->j(FLN1/N;Z)Ln2/t;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object p1, p0, LU1/E;->g:LU1/F;

    .line 17
    .line 18
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    iget-wide v0, p1, LU1/F;->e:J

    .line 24
    .line 25
    cmp-long p2, v0, p2

    .line 26
    .line 27
    iget-wide v3, p1, LU1/F;->b:J

    .line 28
    .line 29
    if-eqz p2, :cond_0

    .line 30
    .line 31
    cmp-long p1, v3, v0

    .line 32
    .line 33
    if-ltz p1, :cond_0

    .line 34
    .line 35
    const-wide/16 p1, 0x1

    .line 36
    .line 37
    sub-long/2addr v0, p1

    .line 38
    const-wide/16 p1, 0x0

    .line 39
    .line 40
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    :cond_0
    iget-object p1, p0, LU1/E;->j:[LU1/X;

    .line 45
    .line 46
    array-length p1, p1

    .line 47
    new-array v6, p1, [Z

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    move-object v1, p0

    .line 51
    invoke-virtual/range {v1 .. v6}, LU1/E;->a(Ln2/t;JZ[Z)J

    .line 52
    .line 53
    .line 54
    move-result-wide p1

    .line 55
    iget-wide v2, v1, LU1/E;->p:J

    .line 56
    .line 57
    iget-object p3, v1, LU1/E;->g:LU1/F;

    .line 58
    .line 59
    iget-wide v4, p3, LU1/F;->b:J

    .line 60
    .line 61
    sub-long/2addr v4, p1

    .line 62
    add-long/2addr v4, v2

    .line 63
    iput-wide v4, v1, LU1/E;->p:J

    .line 64
    .line 65
    invoke-virtual {p3, p1, p2}, LU1/F;->b(J)LU1/F;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, v1, LU1/E;->g:LU1/F;

    .line 70
    .line 71
    return-void
.end method

.method public final g()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, LU1/E;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, LU1/E;->f:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LU1/E;->a:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-interface {v0}, Lk2/f0;->n()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    const-wide/high16 v2, -0x8000000000000000L

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    :cond_0
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public final h()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, LU1/E;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, LU1/E;->g()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, LU1/E;->d()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-object v2, p0, LU1/E;->g:LU1/F;

    .line 16
    .line 17
    iget-wide v2, v2, LU1/F;->b:J

    .line 18
    .line 19
    sub-long/2addr v0, v2

    .line 20
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    if-ltz v0, :cond_1

    .line 28
    .line 29
    :cond_0
    const/4 v0, 0x1

    .line 30
    return v0

    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    return v0
.end method

.method public final i()V
    .locals 3

    .line 1
    invoke-virtual {p0}, LU1/E;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LU1/E;->a:Ljava/lang/Object;

    .line 5
    .line 6
    :try_start_0
    instance-of v1, v0, Lk2/e;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    iget-object v2, p0, LU1/E;->l:LE5/n0;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    :try_start_1
    check-cast v0, Lk2/e;

    .line 13
    .line 14
    iget-object v0, v0, Lk2/e;->a:Lk2/F;

    .line 15
    .line 16
    invoke-virtual {v2, v0}, LE5/n0;->q(Lk2/F;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catch_0
    move-exception v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v2, v0}, LE5/n0;->q(Lk2/F;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :goto_0
    const-string v1, "MediaPeriodHolder"

    .line 27
    .line 28
    const-string v2, "Period release failed."

    .line 29
    .line 30
    invoke-static {v1, v2, v0}, LQ1/k;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final j(FLN1/N;Z)Ln2/t;
    .locals 31

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v4, 0x1

    .line 4
    iget-object v5, v1, LU1/E;->k:Ln2/s;

    .line 5
    .line 6
    iget-object v6, v1, LU1/E;->j:[LU1/X;

    .line 7
    .line 8
    iget-object v7, v1, LU1/E;->n:Lk2/n0;

    .line 9
    .line 10
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    array-length v8, v6

    .line 14
    add-int/2addr v8, v4

    .line 15
    new-array v8, v8, [I

    .line 16
    .line 17
    array-length v9, v6

    .line 18
    add-int/2addr v9, v4

    .line 19
    new-array v10, v9, [[LN1/O;

    .line 20
    .line 21
    array-length v11, v6

    .line 22
    add-int/2addr v11, v4

    .line 23
    new-array v11, v11, [[[I

    .line 24
    .line 25
    const/4 v12, 0x0

    .line 26
    :goto_0
    if-ge v12, v9, :cond_0

    .line 27
    .line 28
    iget v13, v7, Lk2/n0;->a:I

    .line 29
    .line 30
    new-array v14, v13, [LN1/O;

    .line 31
    .line 32
    aput-object v14, v10, v12

    .line 33
    .line 34
    new-array v13, v13, [[I

    .line 35
    .line 36
    aput-object v13, v11, v12

    .line 37
    .line 38
    add-int/2addr v12, v4

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    array-length v9, v6

    .line 41
    new-array v12, v9, [I

    .line 42
    .line 43
    const/4 v13, 0x0

    .line 44
    :goto_1
    if-ge v13, v9, :cond_1

    .line 45
    .line 46
    aget-object v14, v6, v13

    .line 47
    .line 48
    invoke-interface {v14}, LU1/X;->u()I

    .line 49
    .line 50
    .line 51
    move-result v14

    .line 52
    aput v14, v12, v13

    .line 53
    .line 54
    add-int/2addr v13, v4

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const/4 v9, 0x0

    .line 57
    :goto_2
    iget v13, v7, Lk2/n0;->a:I

    .line 58
    .line 59
    if-ge v9, v13, :cond_a

    .line 60
    .line 61
    invoke-virtual {v7, v9}, Lk2/n0;->a(I)LN1/O;

    .line 62
    .line 63
    .line 64
    move-result-object v13

    .line 65
    iget v14, v13, LN1/O;->c:I

    .line 66
    .line 67
    const/4 v15, 0x5

    .line 68
    if-ne v14, v15, :cond_2

    .line 69
    .line 70
    move v14, v4

    .line 71
    goto :goto_3

    .line 72
    :cond_2
    const/4 v14, 0x0

    .line 73
    :goto_3
    array-length v15, v6

    .line 74
    move/from16 v16, v4

    .line 75
    .line 76
    move/from16 v17, v16

    .line 77
    .line 78
    const/16 p2, 0x0

    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    const/4 v4, 0x0

    .line 82
    :goto_4
    array-length v2, v6

    .line 83
    if-ge v0, v2, :cond_7

    .line 84
    .line 85
    aget-object v2, v6, v0

    .line 86
    .line 87
    move/from16 v19, v0

    .line 88
    .line 89
    move-object/from16 v20, v5

    .line 90
    .line 91
    const/4 v0, 0x0

    .line 92
    const/4 v3, 0x0

    .line 93
    :goto_5
    iget v5, v13, LN1/O;->a:I

    .line 94
    .line 95
    if-ge v3, v5, :cond_3

    .line 96
    .line 97
    iget-object v5, v13, LN1/O;->d:[LN1/n;

    .line 98
    .line 99
    aget-object v5, v5, v3

    .line 100
    .line 101
    invoke-interface {v2, v5}, LU1/X;->d(LN1/n;)I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    and-int/lit8 v5, v5, 0x7

    .line 106
    .line 107
    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    add-int/lit8 v3, v3, 0x1

    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_3
    aget v2, v8, v19

    .line 115
    .line 116
    if-nez v2, :cond_4

    .line 117
    .line 118
    move/from16 v2, v16

    .line 119
    .line 120
    goto :goto_6

    .line 121
    :cond_4
    const/4 v2, 0x0

    .line 122
    :goto_6
    if-gt v0, v4, :cond_5

    .line 123
    .line 124
    if-ne v0, v4, :cond_6

    .line 125
    .line 126
    if-eqz v14, :cond_6

    .line 127
    .line 128
    if-nez v17, :cond_6

    .line 129
    .line 130
    if-eqz v2, :cond_6

    .line 131
    .line 132
    :cond_5
    move v4, v0

    .line 133
    move/from16 v17, v2

    .line 134
    .line 135
    move/from16 v15, v19

    .line 136
    .line 137
    :cond_6
    add-int/lit8 v0, v19, 0x1

    .line 138
    .line 139
    move-object/from16 v5, v20

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_7
    move-object/from16 v20, v5

    .line 143
    .line 144
    array-length v0, v6

    .line 145
    if-ne v15, v0, :cond_8

    .line 146
    .line 147
    iget v0, v13, LN1/O;->a:I

    .line 148
    .line 149
    new-array v0, v0, [I

    .line 150
    .line 151
    goto :goto_8

    .line 152
    :cond_8
    aget-object v0, v6, v15

    .line 153
    .line 154
    iget v2, v13, LN1/O;->a:I

    .line 155
    .line 156
    new-array v2, v2, [I

    .line 157
    .line 158
    const/4 v3, 0x0

    .line 159
    :goto_7
    iget v4, v13, LN1/O;->a:I

    .line 160
    .line 161
    if-ge v3, v4, :cond_9

    .line 162
    .line 163
    iget-object v4, v13, LN1/O;->d:[LN1/n;

    .line 164
    .line 165
    aget-object v4, v4, v3

    .line 166
    .line 167
    invoke-interface {v0, v4}, LU1/X;->d(LN1/n;)I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    aput v4, v2, v3

    .line 172
    .line 173
    add-int/lit8 v3, v3, 0x1

    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_9
    move-object v0, v2

    .line 177
    :goto_8
    aget v2, v8, v15

    .line 178
    .line 179
    aget-object v3, v10, v15

    .line 180
    .line 181
    aput-object v13, v3, v2

    .line 182
    .line 183
    aget-object v3, v11, v15

    .line 184
    .line 185
    aput-object v0, v3, v2

    .line 186
    .line 187
    add-int/lit8 v2, v2, 0x1

    .line 188
    .line 189
    aput v2, v8, v15

    .line 190
    .line 191
    add-int/lit8 v9, v9, 0x1

    .line 192
    .line 193
    move/from16 v4, v16

    .line 194
    .line 195
    move-object/from16 v5, v20

    .line 196
    .line 197
    goto/16 :goto_2

    .line 198
    .line 199
    :cond_a
    move/from16 v16, v4

    .line 200
    .line 201
    move-object/from16 v20, v5

    .line 202
    .line 203
    const/16 p2, 0x0

    .line 204
    .line 205
    array-length v0, v6

    .line 206
    new-array v0, v0, [Lk2/n0;

    .line 207
    .line 208
    array-length v2, v6

    .line 209
    new-array v2, v2, [Ljava/lang/String;

    .line 210
    .line 211
    array-length v3, v6

    .line 212
    new-array v3, v3, [I

    .line 213
    .line 214
    const/4 v4, 0x0

    .line 215
    :goto_9
    array-length v5, v6

    .line 216
    if-ge v4, v5, :cond_b

    .line 217
    .line 218
    aget v5, v8, v4

    .line 219
    .line 220
    new-instance v7, Lk2/n0;

    .line 221
    .line 222
    aget-object v9, v10, v4

    .line 223
    .line 224
    invoke-static {v5, v9}, LQ1/x;->M(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v9

    .line 228
    check-cast v9, [LN1/O;

    .line 229
    .line 230
    invoke-direct {v7, v9}, Lk2/n0;-><init>([LN1/O;)V

    .line 231
    .line 232
    .line 233
    aput-object v7, v0, v4

    .line 234
    .line 235
    aget-object v7, v11, v4

    .line 236
    .line 237
    invoke-static {v5, v7}, LQ1/x;->M(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    check-cast v5, [[I

    .line 242
    .line 243
    aput-object v5, v11, v4

    .line 244
    .line 245
    aget-object v5, v6, v4

    .line 246
    .line 247
    invoke-interface {v5}, LU1/X;->getName()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    aput-object v5, v2, v4

    .line 252
    .line 253
    aget-object v5, v6, v4

    .line 254
    .line 255
    invoke-interface {v5}, LU1/X;->f()I

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    aput v5, v3, v4

    .line 260
    .line 261
    add-int/lit8 v4, v4, 0x1

    .line 262
    .line 263
    goto :goto_9

    .line 264
    :cond_b
    array-length v2, v6

    .line 265
    aget v2, v8, v2

    .line 266
    .line 267
    new-instance v4, Lk2/n0;

    .line 268
    .line 269
    array-length v5, v6

    .line 270
    aget-object v5, v10, v5

    .line 271
    .line 272
    invoke-static {v2, v5}, LQ1/x;->M(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    check-cast v2, [LN1/O;

    .line 277
    .line 278
    invoke-direct {v4, v2}, Lk2/n0;-><init>([LN1/O;)V

    .line 279
    .line 280
    .line 281
    new-instance v2, LR1/q;

    .line 282
    .line 283
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 284
    .line 285
    .line 286
    iput-object v3, v2, LR1/q;->b:Ljava/lang/Object;

    .line 287
    .line 288
    iput-object v0, v2, LR1/q;->c:Ljava/lang/Object;

    .line 289
    .line 290
    iput-object v11, v2, LR1/q;->e:Ljava/lang/Object;

    .line 291
    .line 292
    iput-object v12, v2, LR1/q;->d:Ljava/lang/Object;

    .line 293
    .line 294
    iput-object v4, v2, LR1/q;->f:Ljava/lang/Object;

    .line 295
    .line 296
    array-length v0, v3

    .line 297
    iput v0, v2, LR1/q;->a:I

    .line 298
    .line 299
    move-object/from16 v5, v20

    .line 300
    .line 301
    check-cast v5, Ln2/o;

    .line 302
    .line 303
    iget-object v3, v5, Ln2/o;->c:Ljava/lang/Object;

    .line 304
    .line 305
    monitor-enter v3

    .line 306
    :try_start_0
    iget-object v0, v5, Ln2/o;->g:Ln2/i;

    .line 307
    .line 308
    iget-boolean v4, v0, Ln2/i;->v:Z

    .line 309
    .line 310
    if-eqz v4, :cond_d

    .line 311
    .line 312
    sget v4, LQ1/x;->a:I

    .line 313
    .line 314
    const/16 v6, 0x20

    .line 315
    .line 316
    if-lt v4, v6, :cond_d

    .line 317
    .line 318
    iget-object v4, v5, Ln2/o;->h:LA7/b0;

    .line 319
    .line 320
    if-eqz v4, :cond_d

    .line 321
    .line 322
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    invoke-static {v6}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    iget-object v7, v4, LA7/b0;->e:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v7, Ln2/j;

    .line 332
    .line 333
    if-nez v7, :cond_d

    .line 334
    .line 335
    iget-object v7, v4, LA7/b0;->d:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v7, Landroid/os/Handler;

    .line 338
    .line 339
    if-eqz v7, :cond_c

    .line 340
    .line 341
    goto :goto_a

    .line 342
    :cond_c
    new-instance v7, Ln2/j;

    .line 343
    .line 344
    const/4 v8, 0x0

    .line 345
    invoke-direct {v7, v5, v8}, Ln2/j;-><init>(Ljava/lang/Object;I)V

    .line 346
    .line 347
    .line 348
    iput-object v7, v4, LA7/b0;->e:Ljava/lang/Object;

    .line 349
    .line 350
    new-instance v7, Landroid/os/Handler;

    .line 351
    .line 352
    invoke-direct {v7, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 353
    .line 354
    .line 355
    iput-object v7, v4, LA7/b0;->d:Ljava/lang/Object;

    .line 356
    .line 357
    iget-object v6, v4, LA7/b0;->c:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v6, Landroid/media/Spatializer;

    .line 360
    .line 361
    new-instance v8, LW1/s;

    .line 362
    .line 363
    const/4 v9, 0x0

    .line 364
    invoke-direct {v8, v7, v9}, LW1/s;-><init>(Ljava/lang/Object;I)V

    .line 365
    .line 366
    .line 367
    iget-object v4, v4, LA7/b0;->e:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v4, Ln2/j;

    .line 370
    .line 371
    invoke-static {v6, v8, v4}, LG5/f;->g(Landroid/media/Spatializer;LW1/s;Ln2/j;)V

    .line 372
    .line 373
    .line 374
    goto :goto_a

    .line 375
    :catchall_0
    move-exception v0

    .line 376
    goto/16 :goto_5f

    .line 377
    .line 378
    :cond_d
    :goto_a
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 379
    iget v3, v2, LR1/q;->a:I

    .line 380
    .line 381
    new-array v4, v3, [Ln2/p;

    .line 382
    .line 383
    iget-object v6, v0, LN1/T;->m:LN1/Q;

    .line 384
    .line 385
    iget v6, v6, LN1/Q;->a:I

    .line 386
    .line 387
    const/4 v7, 0x2

    .line 388
    if-ne v6, v7, :cond_e

    .line 389
    .line 390
    move-object/from16 v6, p2

    .line 391
    .line 392
    goto :goto_b

    .line 393
    :cond_e
    new-instance v6, Laa/f;

    .line 394
    .line 395
    const/16 v8, 0xd

    .line 396
    .line 397
    invoke-direct {v6, v8, v0, v12}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    new-instance v8, LA0/f;

    .line 401
    .line 402
    const/16 v9, 0x15

    .line 403
    .line 404
    invoke-direct {v8, v9}, LA0/f;-><init>(I)V

    .line 405
    .line 406
    .line 407
    invoke-static {v7, v2, v11, v6, v8}, Ln2/o;->i(ILR1/q;[[[ILn2/l;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 408
    .line 409
    .line 410
    move-result-object v6

    .line 411
    :goto_b
    iget-object v8, v0, LN1/T;->m:LN1/Q;

    .line 412
    .line 413
    const/4 v9, 0x4

    .line 414
    if-nez v6, :cond_10

    .line 415
    .line 416
    iget v10, v8, LN1/Q;->a:I

    .line 417
    .line 418
    if-ne v10, v7, :cond_f

    .line 419
    .line 420
    goto :goto_c

    .line 421
    :cond_f
    new-instance v7, LU1/p;

    .line 422
    .line 423
    invoke-direct {v7, v0}, LU1/p;-><init>(Ln2/i;)V

    .line 424
    .line 425
    .line 426
    new-instance v10, LA0/f;

    .line 427
    .line 428
    const/16 v13, 0x13

    .line 429
    .line 430
    invoke-direct {v10, v13}, LA0/f;-><init>(I)V

    .line 431
    .line 432
    .line 433
    invoke-static {v9, v2, v11, v7, v10}, Ln2/o;->i(ILR1/q;[[[ILn2/l;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 434
    .line 435
    .line 436
    move-result-object v7

    .line 437
    goto :goto_d

    .line 438
    :cond_10
    :goto_c
    move-object/from16 v7, p2

    .line 439
    .line 440
    :goto_d
    if-eqz v7, :cond_11

    .line 441
    .line 442
    iget-object v6, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 443
    .line 444
    check-cast v6, Ljava/lang/Integer;

    .line 445
    .line 446
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 447
    .line 448
    .line 449
    move-result v6

    .line 450
    iget-object v7, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v7, Ln2/p;

    .line 453
    .line 454
    aput-object v7, v4, v6

    .line 455
    .line 456
    goto :goto_e

    .line 457
    :cond_11
    if-eqz v6, :cond_12

    .line 458
    .line 459
    iget-object v7, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v7, Ljava/lang/Integer;

    .line 462
    .line 463
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 464
    .line 465
    .line 466
    move-result v7

    .line 467
    iget-object v6, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast v6, Ln2/p;

    .line 470
    .line 471
    aput-object v6, v4, v7

    .line 472
    .line 473
    :cond_12
    :goto_e
    const/4 v6, 0x0

    .line 474
    :goto_f
    iget-object v7, v2, LR1/q;->c:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v7, [Lk2/n0;

    .line 477
    .line 478
    iget-object v10, v2, LR1/q;->b:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast v10, [I

    .line 481
    .line 482
    iget v13, v2, LR1/q;->a:I

    .line 483
    .line 484
    if-ge v6, v13, :cond_14

    .line 485
    .line 486
    aget v13, v10, v6

    .line 487
    .line 488
    const/4 v14, 0x2

    .line 489
    if-ne v14, v13, :cond_13

    .line 490
    .line 491
    aget-object v13, v7, v6

    .line 492
    .line 493
    iget v13, v13, Lk2/n0;->a:I

    .line 494
    .line 495
    if-lez v13, :cond_13

    .line 496
    .line 497
    move/from16 v6, v16

    .line 498
    .line 499
    goto :goto_10

    .line 500
    :cond_13
    add-int/lit8 v6, v6, 0x1

    .line 501
    .line 502
    goto :goto_f

    .line 503
    :cond_14
    const/4 v6, 0x0

    .line 504
    :goto_10
    new-instance v13, LY8/b;

    .line 505
    .line 506
    invoke-direct {v13, v6, v5, v0, v12}, LY8/b;-><init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 507
    .line 508
    .line 509
    new-instance v6, LA0/f;

    .line 510
    .line 511
    const/16 v12, 0x14

    .line 512
    .line 513
    invoke-direct {v6, v12}, LA0/f;-><init>(I)V

    .line 514
    .line 515
    .line 516
    move/from16 v12, v16

    .line 517
    .line 518
    invoke-static {v12, v2, v11, v13, v6}, Ln2/o;->i(ILR1/q;[[[ILn2/l;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 519
    .line 520
    .line 521
    move-result-object v6

    .line 522
    if-eqz v6, :cond_15

    .line 523
    .line 524
    iget-object v12, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 525
    .line 526
    check-cast v12, Ljava/lang/Integer;

    .line 527
    .line 528
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 529
    .line 530
    .line 531
    move-result v12

    .line 532
    iget-object v13, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v13, Ln2/p;

    .line 535
    .line 536
    aput-object v13, v4, v12

    .line 537
    .line 538
    :cond_15
    if-nez v6, :cond_16

    .line 539
    .line 540
    move-object/from16 v6, p2

    .line 541
    .line 542
    goto :goto_11

    .line 543
    :cond_16
    iget-object v6, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 544
    .line 545
    check-cast v6, Ln2/p;

    .line 546
    .line 547
    iget-object v12, v6, Ln2/p;->a:LN1/O;

    .line 548
    .line 549
    iget-object v6, v6, Ln2/p;->b:[I

    .line 550
    .line 551
    const/16 v18, 0x0

    .line 552
    .line 553
    aget v6, v6, v18

    .line 554
    .line 555
    iget-object v12, v12, LN1/O;->d:[LN1/n;

    .line 556
    .line 557
    aget-object v6, v12, v6

    .line 558
    .line 559
    iget-object v6, v6, LN1/n;->d:Ljava/lang/String;

    .line 560
    .line 561
    :goto_11
    iget v12, v8, LN1/Q;->a:I

    .line 562
    .line 563
    const/4 v13, 0x3

    .line 564
    const/4 v14, 0x2

    .line 565
    if-ne v12, v14, :cond_17

    .line 566
    .line 567
    move-object/from16 v6, p2

    .line 568
    .line 569
    goto :goto_12

    .line 570
    :cond_17
    new-instance v12, Laa/f;

    .line 571
    .line 572
    const/16 v14, 0xe

    .line 573
    .line 574
    invoke-direct {v12, v14, v0, v6}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 575
    .line 576
    .line 577
    new-instance v6, LA0/f;

    .line 578
    .line 579
    const/16 v14, 0x16

    .line 580
    .line 581
    invoke-direct {v6, v14}, LA0/f;-><init>(I)V

    .line 582
    .line 583
    .line 584
    invoke-static {v13, v2, v11, v12, v6}, Ln2/o;->i(ILR1/q;[[[ILn2/l;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 585
    .line 586
    .line 587
    move-result-object v6

    .line 588
    :goto_12
    if-eqz v6, :cond_18

    .line 589
    .line 590
    iget-object v12, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 591
    .line 592
    check-cast v12, Ljava/lang/Integer;

    .line 593
    .line 594
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 595
    .line 596
    .line 597
    move-result v12

    .line 598
    iget-object v6, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 599
    .line 600
    check-cast v6, Ln2/p;

    .line 601
    .line 602
    aput-object v6, v4, v12

    .line 603
    .line 604
    :cond_18
    const/4 v6, 0x0

    .line 605
    :goto_13
    if-ge v6, v3, :cond_22

    .line 606
    .line 607
    aget v12, v10, v6

    .line 608
    .line 609
    const/4 v14, 0x2

    .line 610
    if-eq v12, v14, :cond_20

    .line 611
    .line 612
    const/4 v15, 0x1

    .line 613
    if-eq v12, v15, :cond_21

    .line 614
    .line 615
    if-eq v12, v13, :cond_20

    .line 616
    .line 617
    if-eq v12, v9, :cond_20

    .line 618
    .line 619
    aget-object v12, v7, v6

    .line 620
    .line 621
    aget-object v15, v11, v6

    .line 622
    .line 623
    iget v13, v8, LN1/Q;->a:I

    .line 624
    .line 625
    if-ne v13, v14, :cond_19

    .line 626
    .line 627
    move/from16 v21, v6

    .line 628
    .line 629
    move-object/from16 v20, v7

    .line 630
    .line 631
    move-object/from16 v23, v8

    .line 632
    .line 633
    move-object/from16 v27, v10

    .line 634
    .line 635
    :goto_14
    move-object/from16 v6, p2

    .line 636
    .line 637
    goto/16 :goto_1a

    .line 638
    .line 639
    :cond_19
    move-object/from16 v9, p2

    .line 640
    .line 641
    move-object/from16 v20, v9

    .line 642
    .line 643
    move/from16 v21, v6

    .line 644
    .line 645
    const/4 v13, 0x0

    .line 646
    const/4 v14, 0x0

    .line 647
    :goto_15
    iget v6, v12, Lk2/n0;->a:I

    .line 648
    .line 649
    if-ge v13, v6, :cond_1e

    .line 650
    .line 651
    invoke-virtual {v12, v13}, Lk2/n0;->a(I)LN1/O;

    .line 652
    .line 653
    .line 654
    move-result-object v6

    .line 655
    aget-object v22, v15, v13

    .line 656
    .line 657
    move-object/from16 v23, v8

    .line 658
    .line 659
    move-object/from16 v24, v9

    .line 660
    .line 661
    move-object/from16 v8, v20

    .line 662
    .line 663
    move-object/from16 v20, v7

    .line 664
    .line 665
    const/4 v7, 0x0

    .line 666
    :goto_16
    iget v9, v6, LN1/O;->a:I

    .line 667
    .line 668
    if-ge v7, v9, :cond_1d

    .line 669
    .line 670
    aget v9, v22, v7

    .line 671
    .line 672
    move/from16 v25, v7

    .line 673
    .line 674
    iget-boolean v7, v0, Ln2/i;->w:Z

    .line 675
    .line 676
    invoke-static {v9, v7}, LR8/v;->c(IZ)Z

    .line 677
    .line 678
    .line 679
    move-result v7

    .line 680
    if-eqz v7, :cond_1c

    .line 681
    .line 682
    iget-object v7, v6, LN1/O;->d:[LN1/n;

    .line 683
    .line 684
    aget-object v7, v7, v25

    .line 685
    .line 686
    new-instance v9, Ln2/g;

    .line 687
    .line 688
    move-object/from16 v26, v6

    .line 689
    .line 690
    aget v6, v22, v25

    .line 691
    .line 692
    invoke-direct {v9, v7, v6}, Ln2/g;-><init>(LN1/n;I)V

    .line 693
    .line 694
    .line 695
    if-eqz v8, :cond_1a

    .line 696
    .line 697
    sget-object v6, Ll8/A;->a:Ll8/y;

    .line 698
    .line 699
    iget-boolean v7, v8, Ln2/g;->b:Z

    .line 700
    .line 701
    move-object/from16 v27, v10

    .line 702
    .line 703
    iget-boolean v10, v9, Ln2/g;->b:Z

    .line 704
    .line 705
    invoke-virtual {v6, v10, v7}, Ll8/y;->c(ZZ)Ll8/A;

    .line 706
    .line 707
    .line 708
    move-result-object v6

    .line 709
    iget-boolean v7, v9, Ln2/g;->a:Z

    .line 710
    .line 711
    iget-boolean v10, v8, Ln2/g;->a:Z

    .line 712
    .line 713
    invoke-virtual {v6, v7, v10}, Ll8/A;->c(ZZ)Ll8/A;

    .line 714
    .line 715
    .line 716
    move-result-object v6

    .line 717
    invoke-virtual {v6}, Ll8/A;->e()I

    .line 718
    .line 719
    .line 720
    move-result v6

    .line 721
    if-lez v6, :cond_1b

    .line 722
    .line 723
    goto :goto_17

    .line 724
    :cond_1a
    move-object/from16 v27, v10

    .line 725
    .line 726
    :goto_17
    move-object v8, v9

    .line 727
    move/from16 v14, v25

    .line 728
    .line 729
    move-object/from16 v24, v26

    .line 730
    .line 731
    :cond_1b
    :goto_18
    const/16 v16, 0x1

    .line 732
    .line 733
    goto :goto_19

    .line 734
    :cond_1c
    move-object/from16 v26, v6

    .line 735
    .line 736
    move-object/from16 v27, v10

    .line 737
    .line 738
    goto :goto_18

    .line 739
    :goto_19
    add-int/lit8 v7, v25, 0x1

    .line 740
    .line 741
    move-object/from16 v6, v26

    .line 742
    .line 743
    move-object/from16 v10, v27

    .line 744
    .line 745
    goto :goto_16

    .line 746
    :cond_1d
    move-object/from16 v27, v10

    .line 747
    .line 748
    const/16 v16, 0x1

    .line 749
    .line 750
    add-int/lit8 v13, v13, 0x1

    .line 751
    .line 752
    move-object/from16 v7, v20

    .line 753
    .line 754
    move-object/from16 v9, v24

    .line 755
    .line 756
    move-object/from16 v20, v8

    .line 757
    .line 758
    move-object/from16 v8, v23

    .line 759
    .line 760
    goto :goto_15

    .line 761
    :cond_1e
    move-object/from16 v20, v7

    .line 762
    .line 763
    move-object/from16 v23, v8

    .line 764
    .line 765
    move-object/from16 v27, v10

    .line 766
    .line 767
    if-nez v9, :cond_1f

    .line 768
    .line 769
    goto/16 :goto_14

    .line 770
    .line 771
    :cond_1f
    new-instance v6, Ln2/p;

    .line 772
    .line 773
    filled-new-array {v14}, [I

    .line 774
    .line 775
    .line 776
    move-result-object v7

    .line 777
    invoke-direct {v6, v9, v7}, Ln2/p;-><init>(LN1/O;[I)V

    .line 778
    .line 779
    .line 780
    :goto_1a
    aput-object v6, v4, v21

    .line 781
    .line 782
    :goto_1b
    const/16 v16, 0x1

    .line 783
    .line 784
    goto :goto_1c

    .line 785
    :cond_20
    move/from16 v21, v6

    .line 786
    .line 787
    move-object/from16 v20, v7

    .line 788
    .line 789
    move-object/from16 v23, v8

    .line 790
    .line 791
    move-object/from16 v27, v10

    .line 792
    .line 793
    goto :goto_1b

    .line 794
    :cond_21
    move/from16 v21, v6

    .line 795
    .line 796
    move-object/from16 v20, v7

    .line 797
    .line 798
    move-object/from16 v23, v8

    .line 799
    .line 800
    move-object/from16 v27, v10

    .line 801
    .line 802
    move/from16 v16, v15

    .line 803
    .line 804
    :goto_1c
    add-int/lit8 v6, v21, 0x1

    .line 805
    .line 806
    move-object/from16 v7, v20

    .line 807
    .line 808
    move-object/from16 v8, v23

    .line 809
    .line 810
    move-object/from16 v10, v27

    .line 811
    .line 812
    const/4 v9, 0x4

    .line 813
    const/4 v13, 0x3

    .line 814
    goto/16 :goto_13

    .line 815
    .line 816
    :cond_22
    iget v6, v2, LR1/q;->a:I

    .line 817
    .line 818
    new-instance v7, Ljava/util/HashMap;

    .line 819
    .line 820
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 821
    .line 822
    .line 823
    const/4 v8, 0x0

    .line 824
    :goto_1d
    if-ge v8, v6, :cond_25

    .line 825
    .line 826
    iget-object v9, v2, LR1/q;->c:Ljava/lang/Object;

    .line 827
    .line 828
    check-cast v9, [Lk2/n0;

    .line 829
    .line 830
    aget-object v9, v9, v8

    .line 831
    .line 832
    const/4 v10, 0x0

    .line 833
    :goto_1e
    iget v12, v9, Lk2/n0;->a:I

    .line 834
    .line 835
    if-ge v10, v12, :cond_24

    .line 836
    .line 837
    invoke-virtual {v9, v10}, Lk2/n0;->a(I)LN1/O;

    .line 838
    .line 839
    .line 840
    move-result-object v12

    .line 841
    iget-object v13, v0, LN1/T;->p:Ll8/j0;

    .line 842
    .line 843
    invoke-virtual {v13, v12}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v12

    .line 847
    if-nez v12, :cond_23

    .line 848
    .line 849
    const/16 v16, 0x1

    .line 850
    .line 851
    add-int/lit8 v10, v10, 0x1

    .line 852
    .line 853
    goto :goto_1e

    .line 854
    :cond_23
    new-instance v0, Ljava/lang/ClassCastException;

    .line 855
    .line 856
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 857
    .line 858
    .line 859
    throw v0

    .line 860
    :cond_24
    const/16 v16, 0x1

    .line 861
    .line 862
    add-int/lit8 v8, v8, 0x1

    .line 863
    .line 864
    goto :goto_1d

    .line 865
    :cond_25
    iget-object v8, v2, LR1/q;->f:Ljava/lang/Object;

    .line 866
    .line 867
    check-cast v8, Lk2/n0;

    .line 868
    .line 869
    const/4 v9, 0x0

    .line 870
    :goto_1f
    iget v10, v8, Lk2/n0;->a:I

    .line 871
    .line 872
    if-ge v9, v10, :cond_27

    .line 873
    .line 874
    invoke-virtual {v8, v9}, Lk2/n0;->a(I)LN1/O;

    .line 875
    .line 876
    .line 877
    move-result-object v10

    .line 878
    iget-object v12, v0, LN1/T;->p:Ll8/j0;

    .line 879
    .line 880
    invoke-virtual {v12, v10}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 881
    .line 882
    .line 883
    move-result-object v10

    .line 884
    if-nez v10, :cond_26

    .line 885
    .line 886
    const/16 v16, 0x1

    .line 887
    .line 888
    add-int/lit8 v9, v9, 0x1

    .line 889
    .line 890
    goto :goto_1f

    .line 891
    :cond_26
    new-instance v0, Ljava/lang/ClassCastException;

    .line 892
    .line 893
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 894
    .line 895
    .line 896
    throw v0

    .line 897
    :cond_27
    const/4 v8, 0x0

    .line 898
    :goto_20
    if-ge v8, v6, :cond_29

    .line 899
    .line 900
    iget-object v9, v2, LR1/q;->b:Ljava/lang/Object;

    .line 901
    .line 902
    check-cast v9, [I

    .line 903
    .line 904
    aget v9, v9, v8

    .line 905
    .line 906
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 907
    .line 908
    .line 909
    move-result-object v9

    .line 910
    invoke-virtual {v7, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    move-result-object v9

    .line 914
    if-nez v9, :cond_28

    .line 915
    .line 916
    const/16 v16, 0x1

    .line 917
    .line 918
    add-int/lit8 v8, v8, 0x1

    .line 919
    .line 920
    goto :goto_20

    .line 921
    :cond_28
    new-instance v0, Ljava/lang/ClassCastException;

    .line 922
    .line 923
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 924
    .line 925
    .line 926
    throw v0

    .line 927
    :cond_29
    iget v6, v2, LR1/q;->a:I

    .line 928
    .line 929
    const/4 v7, 0x0

    .line 930
    :goto_21
    if-ge v7, v6, :cond_2d

    .line 931
    .line 932
    iget-object v8, v2, LR1/q;->c:Ljava/lang/Object;

    .line 933
    .line 934
    check-cast v8, [Lk2/n0;

    .line 935
    .line 936
    aget-object v8, v8, v7

    .line 937
    .line 938
    iget-object v9, v0, Ln2/i;->y:Landroid/util/SparseArray;

    .line 939
    .line 940
    invoke-virtual {v9, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v9

    .line 944
    check-cast v9, Ljava/util/Map;

    .line 945
    .line 946
    if-eqz v9, :cond_2c

    .line 947
    .line 948
    invoke-interface {v9, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 949
    .line 950
    .line 951
    move-result v9

    .line 952
    if-eqz v9, :cond_2c

    .line 953
    .line 954
    iget-object v9, v0, Ln2/i;->y:Landroid/util/SparseArray;

    .line 955
    .line 956
    invoke-virtual {v9, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v9

    .line 960
    check-cast v9, Ljava/util/Map;

    .line 961
    .line 962
    if-eqz v9, :cond_2b

    .line 963
    .line 964
    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 965
    .line 966
    .line 967
    move-result-object v8

    .line 968
    if-nez v8, :cond_2a

    .line 969
    .line 970
    goto :goto_22

    .line 971
    :cond_2a
    new-instance v0, Ljava/lang/ClassCastException;

    .line 972
    .line 973
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 974
    .line 975
    .line 976
    throw v0

    .line 977
    :cond_2b
    :goto_22
    aput-object p2, v4, v7

    .line 978
    .line 979
    :cond_2c
    const/16 v16, 0x1

    .line 980
    .line 981
    add-int/lit8 v7, v7, 0x1

    .line 982
    .line 983
    goto :goto_21

    .line 984
    :cond_2d
    const/4 v6, 0x0

    .line 985
    :goto_23
    if-ge v6, v3, :cond_30

    .line 986
    .line 987
    iget-object v7, v2, LR1/q;->b:Ljava/lang/Object;

    .line 988
    .line 989
    check-cast v7, [I

    .line 990
    .line 991
    aget v7, v7, v6

    .line 992
    .line 993
    iget-object v8, v0, Ln2/i;->z:Landroid/util/SparseBooleanArray;

    .line 994
    .line 995
    invoke-virtual {v8, v6}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 996
    .line 997
    .line 998
    move-result v8

    .line 999
    if-nez v8, :cond_2f

    .line 1000
    .line 1001
    iget-object v8, v0, LN1/T;->q:Ll8/P;

    .line 1002
    .line 1003
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v7

    .line 1007
    invoke-virtual {v8, v7}, Ll8/F;->contains(Ljava/lang/Object;)Z

    .line 1008
    .line 1009
    .line 1010
    move-result v7

    .line 1011
    if-eqz v7, :cond_2e

    .line 1012
    .line 1013
    goto :goto_25

    .line 1014
    :cond_2e
    :goto_24
    const/16 v16, 0x1

    .line 1015
    .line 1016
    goto :goto_26

    .line 1017
    :cond_2f
    :goto_25
    aput-object p2, v4, v6

    .line 1018
    .line 1019
    goto :goto_24

    .line 1020
    :goto_26
    add-int/lit8 v6, v6, 0x1

    .line 1021
    .line 1022
    goto :goto_23

    .line 1023
    :cond_30
    iget-object v6, v5, Ln2/o;->e:Lad/r;

    .line 1024
    .line 1025
    iget-object v5, v5, Ln2/s;->b:Lo2/d;

    .line 1026
    .line 1027
    invoke-static {v5}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1031
    .line 1032
    .line 1033
    new-instance v6, Ljava/util/ArrayList;

    .line 1034
    .line 1035
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1036
    .line 1037
    .line 1038
    const/4 v7, 0x0

    .line 1039
    :goto_27
    array-length v8, v4

    .line 1040
    const-wide/16 v9, 0x0

    .line 1041
    .line 1042
    if-ge v7, v8, :cond_32

    .line 1043
    .line 1044
    aget-object v8, v4, v7

    .line 1045
    .line 1046
    if-eqz v8, :cond_31

    .line 1047
    .line 1048
    iget-object v8, v8, Ln2/p;->b:[I

    .line 1049
    .line 1050
    array-length v8, v8

    .line 1051
    const/4 v12, 0x1

    .line 1052
    if-le v8, v12, :cond_31

    .line 1053
    .line 1054
    invoke-static {}, Ll8/K;->i()Ll8/H;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v8

    .line 1058
    new-instance v12, Ln2/a;

    .line 1059
    .line 1060
    invoke-direct {v12, v9, v10, v9, v10}, Ln2/a;-><init>(JJ)V

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v8, v12}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1067
    .line 1068
    .line 1069
    move-object/from16 v8, p2

    .line 1070
    .line 1071
    :goto_28
    const/16 v16, 0x1

    .line 1072
    .line 1073
    goto :goto_29

    .line 1074
    :cond_31
    move-object/from16 v8, p2

    .line 1075
    .line 1076
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1077
    .line 1078
    .line 1079
    goto :goto_28

    .line 1080
    :goto_29
    add-int/lit8 v7, v7, 0x1

    .line 1081
    .line 1082
    move-object/from16 p2, v8

    .line 1083
    .line 1084
    goto :goto_27

    .line 1085
    :cond_32
    move-object/from16 v8, p2

    .line 1086
    .line 1087
    array-length v7, v4

    .line 1088
    new-array v12, v7, [[J

    .line 1089
    .line 1090
    const/4 v13, 0x0

    .line 1091
    :goto_2a
    array-length v14, v4

    .line 1092
    const-wide/16 v20, -0x1

    .line 1093
    .line 1094
    if-ge v13, v14, :cond_36

    .line 1095
    .line 1096
    aget-object v14, v4, v13

    .line 1097
    .line 1098
    if-nez v14, :cond_33

    .line 1099
    .line 1100
    const/4 v15, 0x0

    .line 1101
    new-array v14, v15, [J

    .line 1102
    .line 1103
    aput-object v14, v12, v13

    .line 1104
    .line 1105
    const/16 v16, 0x1

    .line 1106
    .line 1107
    goto :goto_2c

    .line 1108
    :cond_33
    iget-object v15, v14, Ln2/p;->b:[I

    .line 1109
    .line 1110
    array-length v8, v15

    .line 1111
    new-array v8, v8, [J

    .line 1112
    .line 1113
    aput-object v8, v12, v13

    .line 1114
    .line 1115
    const/4 v8, 0x0

    .line 1116
    :goto_2b
    array-length v9, v15

    .line 1117
    if-ge v8, v9, :cond_35

    .line 1118
    .line 1119
    aget v9, v15, v8

    .line 1120
    .line 1121
    iget-object v10, v14, Ln2/p;->a:LN1/O;

    .line 1122
    .line 1123
    iget-object v10, v10, LN1/O;->d:[LN1/n;

    .line 1124
    .line 1125
    aget-object v9, v10, v9

    .line 1126
    .line 1127
    iget v9, v9, LN1/n;->j:I

    .line 1128
    .line 1129
    int-to-long v9, v9

    .line 1130
    aget-object v17, v12, v13

    .line 1131
    .line 1132
    cmp-long v24, v9, v20

    .line 1133
    .line 1134
    if-nez v24, :cond_34

    .line 1135
    .line 1136
    const-wide/16 v9, 0x0

    .line 1137
    .line 1138
    :cond_34
    aput-wide v9, v17, v8

    .line 1139
    .line 1140
    const/16 v16, 0x1

    .line 1141
    .line 1142
    add-int/lit8 v8, v8, 0x1

    .line 1143
    .line 1144
    goto :goto_2b

    .line 1145
    :cond_35
    const/16 v16, 0x1

    .line 1146
    .line 1147
    aget-object v8, v12, v13

    .line 1148
    .line 1149
    invoke-static {v8}, Ljava/util/Arrays;->sort([J)V

    .line 1150
    .line 1151
    .line 1152
    :goto_2c
    add-int/lit8 v13, v13, 0x1

    .line 1153
    .line 1154
    const/4 v8, 0x0

    .line 1155
    const-wide/16 v9, 0x0

    .line 1156
    .line 1157
    goto :goto_2a

    .line 1158
    :cond_36
    new-array v8, v7, [I

    .line 1159
    .line 1160
    new-array v9, v7, [J

    .line 1161
    .line 1162
    const/4 v10, 0x0

    .line 1163
    :goto_2d
    if-ge v10, v7, :cond_38

    .line 1164
    .line 1165
    aget-object v13, v12, v10

    .line 1166
    .line 1167
    array-length v14, v13

    .line 1168
    if-nez v14, :cond_37

    .line 1169
    .line 1170
    const-wide/16 v14, 0x0

    .line 1171
    .line 1172
    goto :goto_2e

    .line 1173
    :cond_37
    const/16 v18, 0x0

    .line 1174
    .line 1175
    aget-wide v14, v13, v18

    .line 1176
    .line 1177
    :goto_2e
    aput-wide v14, v9, v10

    .line 1178
    .line 1179
    const/16 v16, 0x1

    .line 1180
    .line 1181
    add-int/lit8 v10, v10, 0x1

    .line 1182
    .line 1183
    goto :goto_2d

    .line 1184
    :cond_38
    invoke-static {v6, v9}, Ln2/b;->v(Ljava/util/ArrayList;[J)V

    .line 1185
    .line 1186
    .line 1187
    const-string v10, "expectedValuesPerKey"

    .line 1188
    .line 1189
    const/4 v14, 0x2

    .line 1190
    invoke-static {v14, v10}, Ll8/s;->d(ILjava/lang/String;)V

    .line 1191
    .line 1192
    .line 1193
    new-instance v10, Ljava/util/TreeMap;

    .line 1194
    .line 1195
    sget-object v13, Ll8/c0;->b:Ll8/c0;

    .line 1196
    .line 1197
    invoke-direct {v10, v13}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 1198
    .line 1199
    .line 1200
    new-instance v13, Ll8/Z;

    .line 1201
    .line 1202
    invoke-direct {v13}, Ll8/Z;-><init>()V

    .line 1203
    .line 1204
    .line 1205
    new-instance v15, Ll8/a0;

    .line 1206
    .line 1207
    invoke-direct {v15, v10}, Ll8/a0;-><init>(Ljava/util/Map;)V

    .line 1208
    .line 1209
    .line 1210
    iput-object v13, v15, Ll8/a0;->f:Ll8/Z;

    .line 1211
    .line 1212
    const/4 v10, 0x0

    .line 1213
    :goto_2f
    if-ge v10, v7, :cond_3e

    .line 1214
    .line 1215
    aget-object v13, v12, v10

    .line 1216
    .line 1217
    array-length v14, v13

    .line 1218
    move-object/from16 v23, v5

    .line 1219
    .line 1220
    const/4 v5, 0x1

    .line 1221
    if-gt v14, v5, :cond_39

    .line 1222
    .line 1223
    move/from16 v16, v5

    .line 1224
    .line 1225
    move/from16 v22, v7

    .line 1226
    .line 1227
    move-object/from16 v26, v8

    .line 1228
    .line 1229
    goto/16 :goto_35

    .line 1230
    .line 1231
    :cond_39
    array-length v5, v13

    .line 1232
    new-array v13, v5, [D

    .line 1233
    .line 1234
    move/from16 v17, v5

    .line 1235
    .line 1236
    const/4 v14, 0x0

    .line 1237
    :goto_30
    aget-object v5, v12, v10

    .line 1238
    .line 1239
    move/from16 v22, v7

    .line 1240
    .line 1241
    array-length v7, v5

    .line 1242
    const-wide/16 v24, 0x0

    .line 1243
    .line 1244
    if-ge v14, v7, :cond_3b

    .line 1245
    .line 1246
    move-object/from16 v26, v8

    .line 1247
    .line 1248
    aget-wide v7, v5, v14

    .line 1249
    .line 1250
    cmp-long v5, v7, v20

    .line 1251
    .line 1252
    if-nez v5, :cond_3a

    .line 1253
    .line 1254
    goto :goto_31

    .line 1255
    :cond_3a
    long-to-double v7, v7

    .line 1256
    invoke-static {v7, v8}, Ljava/lang/Math;->log(D)D

    .line 1257
    .line 1258
    .line 1259
    move-result-wide v24

    .line 1260
    :goto_31
    aput-wide v24, v13, v14

    .line 1261
    .line 1262
    const/16 v16, 0x1

    .line 1263
    .line 1264
    add-int/lit8 v14, v14, 0x1

    .line 1265
    .line 1266
    move/from16 v7, v22

    .line 1267
    .line 1268
    move-object/from16 v8, v26

    .line 1269
    .line 1270
    goto :goto_30

    .line 1271
    :cond_3b
    move-object/from16 v26, v8

    .line 1272
    .line 1273
    const/16 v16, 0x1

    .line 1274
    .line 1275
    add-int/lit8 v5, v17, -0x1

    .line 1276
    .line 1277
    aget-wide v7, v13, v5

    .line 1278
    .line 1279
    const/16 v18, 0x0

    .line 1280
    .line 1281
    aget-wide v27, v13, v18

    .line 1282
    .line 1283
    sub-double v7, v7, v27

    .line 1284
    .line 1285
    const/4 v14, 0x0

    .line 1286
    :goto_32
    if-ge v14, v5, :cond_3d

    .line 1287
    .line 1288
    aget-wide v27, v13, v14

    .line 1289
    .line 1290
    add-int/lit8 v14, v14, 0x1

    .line 1291
    .line 1292
    aget-wide v29, v13, v14

    .line 1293
    .line 1294
    add-double v27, v27, v29

    .line 1295
    .line 1296
    const-wide/high16 v29, 0x3fe0000000000000L    # 0.5

    .line 1297
    .line 1298
    mul-double v27, v27, v29

    .line 1299
    .line 1300
    cmpl-double v17, v7, v24

    .line 1301
    .line 1302
    if-nez v17, :cond_3c

    .line 1303
    .line 1304
    const-wide/high16 v27, 0x3ff0000000000000L    # 1.0

    .line 1305
    .line 1306
    :goto_33
    move/from16 v17, v5

    .line 1307
    .line 1308
    goto :goto_34

    .line 1309
    :cond_3c
    const/16 v18, 0x0

    .line 1310
    .line 1311
    aget-wide v29, v13, v18

    .line 1312
    .line 1313
    sub-double v27, v27, v29

    .line 1314
    .line 1315
    div-double v27, v27, v7

    .line 1316
    .line 1317
    goto :goto_33

    .line 1318
    :goto_34
    invoke-static/range {v27 .. v28}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v5

    .line 1322
    move-wide/from16 v27, v7

    .line 1323
    .line 1324
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v7

    .line 1328
    invoke-virtual {v15, v5, v7}, Ll8/a0;->e(Ljava/lang/Double;Ljava/lang/Integer;)Z

    .line 1329
    .line 1330
    .line 1331
    move/from16 v5, v17

    .line 1332
    .line 1333
    move-wide/from16 v7, v27

    .line 1334
    .line 1335
    const/16 v16, 0x1

    .line 1336
    .line 1337
    goto :goto_32

    .line 1338
    :cond_3d
    const/16 v16, 0x1

    .line 1339
    .line 1340
    :goto_35
    add-int/lit8 v10, v10, 0x1

    .line 1341
    .line 1342
    move/from16 v7, v22

    .line 1343
    .line 1344
    move-object/from16 v5, v23

    .line 1345
    .line 1346
    move-object/from16 v8, v26

    .line 1347
    .line 1348
    const/4 v14, 0x2

    .line 1349
    goto/16 :goto_2f

    .line 1350
    .line 1351
    :cond_3e
    move-object/from16 v23, v5

    .line 1352
    .line 1353
    move-object/from16 v26, v8

    .line 1354
    .line 1355
    invoke-virtual {v15}, Ll8/a0;->f()Ljava/util/Collection;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v5

    .line 1359
    invoke-static {v5}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v5

    .line 1363
    const/4 v7, 0x0

    .line 1364
    :goto_36
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    .line 1365
    .line 1366
    .line 1367
    move-result v8

    .line 1368
    if-ge v7, v8, :cond_3f

    .line 1369
    .line 1370
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v8

    .line 1374
    check-cast v8, Ljava/lang/Integer;

    .line 1375
    .line 1376
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 1377
    .line 1378
    .line 1379
    move-result v8

    .line 1380
    aget v10, v26, v8

    .line 1381
    .line 1382
    const/16 v16, 0x1

    .line 1383
    .line 1384
    add-int/lit8 v10, v10, 0x1

    .line 1385
    .line 1386
    aput v10, v26, v8

    .line 1387
    .line 1388
    aget-object v13, v12, v8

    .line 1389
    .line 1390
    aget-wide v14, v13, v10

    .line 1391
    .line 1392
    aput-wide v14, v9, v8

    .line 1393
    .line 1394
    invoke-static {v6, v9}, Ln2/b;->v(Ljava/util/ArrayList;[J)V

    .line 1395
    .line 1396
    .line 1397
    add-int/lit8 v7, v7, 0x1

    .line 1398
    .line 1399
    goto :goto_36

    .line 1400
    :cond_3f
    const/4 v5, 0x0

    .line 1401
    :goto_37
    array-length v7, v4

    .line 1402
    if-ge v5, v7, :cond_41

    .line 1403
    .line 1404
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v7

    .line 1408
    if-eqz v7, :cond_40

    .line 1409
    .line 1410
    aget-wide v7, v9, v5

    .line 1411
    .line 1412
    const-wide/16 v12, 0x2

    .line 1413
    .line 1414
    mul-long/2addr v7, v12

    .line 1415
    aput-wide v7, v9, v5

    .line 1416
    .line 1417
    :cond_40
    const/16 v16, 0x1

    .line 1418
    .line 1419
    add-int/lit8 v5, v5, 0x1

    .line 1420
    .line 1421
    goto :goto_37

    .line 1422
    :cond_41
    invoke-static {v6, v9}, Ln2/b;->v(Ljava/util/ArrayList;[J)V

    .line 1423
    .line 1424
    .line 1425
    invoke-static {}, Ll8/K;->i()Ll8/H;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v5

    .line 1429
    const/4 v7, 0x0

    .line 1430
    :goto_38
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1431
    .line 1432
    .line 1433
    move-result v8

    .line 1434
    if-ge v7, v8, :cond_43

    .line 1435
    .line 1436
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v8

    .line 1440
    check-cast v8, Ll8/H;

    .line 1441
    .line 1442
    if-nez v8, :cond_42

    .line 1443
    .line 1444
    sget-object v8, Ll8/e0;->e:Ll8/e0;

    .line 1445
    .line 1446
    goto :goto_39

    .line 1447
    :cond_42
    invoke-virtual {v8}, Ll8/H;->g()Ll8/e0;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v8

    .line 1451
    :goto_39
    invoke-virtual {v5, v8}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 1452
    .line 1453
    .line 1454
    const/16 v16, 0x1

    .line 1455
    .line 1456
    add-int/lit8 v7, v7, 0x1

    .line 1457
    .line 1458
    goto :goto_38

    .line 1459
    :cond_43
    invoke-virtual {v5}, Ll8/H;->g()Ll8/e0;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v5

    .line 1463
    array-length v6, v4

    .line 1464
    new-array v6, v6, [Ln2/q;

    .line 1465
    .line 1466
    const/4 v7, 0x0

    .line 1467
    :goto_3a
    array-length v8, v4

    .line 1468
    if-ge v7, v8, :cond_47

    .line 1469
    .line 1470
    aget-object v8, v4, v7

    .line 1471
    .line 1472
    if-eqz v8, :cond_44

    .line 1473
    .line 1474
    iget-object v9, v8, Ln2/p;->b:[I

    .line 1475
    .line 1476
    array-length v10, v9

    .line 1477
    if-nez v10, :cond_45

    .line 1478
    .line 1479
    :cond_44
    :goto_3b
    const/16 v16, 0x1

    .line 1480
    .line 1481
    goto :goto_3d

    .line 1482
    :cond_45
    array-length v10, v9

    .line 1483
    const/4 v12, 0x1

    .line 1484
    if-ne v10, v12, :cond_46

    .line 1485
    .line 1486
    new-instance v10, Ln2/r;

    .line 1487
    .line 1488
    const/16 v18, 0x0

    .line 1489
    .line 1490
    aget v9, v9, v18

    .line 1491
    .line 1492
    filled-new-array {v9}, [I

    .line 1493
    .line 1494
    .line 1495
    move-result-object v9

    .line 1496
    iget-object v8, v8, Ln2/p;->a:LN1/O;

    .line 1497
    .line 1498
    invoke-direct {v10, v8, v9}, Ln2/c;-><init>(LN1/O;[I)V

    .line 1499
    .line 1500
    .line 1501
    goto :goto_3c

    .line 1502
    :cond_46
    invoke-virtual {v5, v7}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v10

    .line 1506
    move-object/from16 v30, v10

    .line 1507
    .line 1508
    check-cast v30, Ll8/K;

    .line 1509
    .line 1510
    new-instance v20, Ln2/b;

    .line 1511
    .line 1512
    const/16 v10, 0x2710

    .line 1513
    .line 1514
    int-to-long v12, v10

    .line 1515
    const/16 v10, 0x61a8

    .line 1516
    .line 1517
    int-to-long v14, v10

    .line 1518
    iget-object v8, v8, Ln2/p;->a:LN1/O;

    .line 1519
    .line 1520
    move-wide/from16 v28, v14

    .line 1521
    .line 1522
    move-object/from16 v21, v8

    .line 1523
    .line 1524
    move-object/from16 v22, v9

    .line 1525
    .line 1526
    move-wide/from16 v24, v12

    .line 1527
    .line 1528
    move-wide/from16 v26, v14

    .line 1529
    .line 1530
    invoke-direct/range {v20 .. v30}, Ln2/b;-><init>(LN1/O;[ILo2/d;JJJLl8/K;)V

    .line 1531
    .line 1532
    .line 1533
    move-object/from16 v10, v20

    .line 1534
    .line 1535
    :goto_3c
    aput-object v10, v6, v7

    .line 1536
    .line 1537
    goto :goto_3b

    .line 1538
    :goto_3d
    add-int/lit8 v7, v7, 0x1

    .line 1539
    .line 1540
    goto :goto_3a

    .line 1541
    :cond_47
    new-array v4, v3, [LU1/Y;

    .line 1542
    .line 1543
    const/4 v5, 0x0

    .line 1544
    :goto_3e
    const/4 v7, -0x2

    .line 1545
    if-ge v5, v3, :cond_4b

    .line 1546
    .line 1547
    iget-object v8, v2, LR1/q;->b:Ljava/lang/Object;

    .line 1548
    .line 1549
    check-cast v8, [I

    .line 1550
    .line 1551
    aget v8, v8, v5

    .line 1552
    .line 1553
    iget-object v9, v0, Ln2/i;->z:Landroid/util/SparseBooleanArray;

    .line 1554
    .line 1555
    invoke-virtual {v9, v5}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 1556
    .line 1557
    .line 1558
    move-result v9

    .line 1559
    if-nez v9, :cond_4a

    .line 1560
    .line 1561
    iget-object v9, v0, LN1/T;->q:Ll8/P;

    .line 1562
    .line 1563
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v8

    .line 1567
    invoke-virtual {v9, v8}, Ll8/F;->contains(Ljava/lang/Object;)Z

    .line 1568
    .line 1569
    .line 1570
    move-result v8

    .line 1571
    if-eqz v8, :cond_48

    .line 1572
    .line 1573
    goto :goto_3f

    .line 1574
    :cond_48
    iget-object v8, v2, LR1/q;->b:Ljava/lang/Object;

    .line 1575
    .line 1576
    check-cast v8, [I

    .line 1577
    .line 1578
    aget v8, v8, v5

    .line 1579
    .line 1580
    if-eq v8, v7, :cond_49

    .line 1581
    .line 1582
    aget-object v7, v6, v5

    .line 1583
    .line 1584
    if-eqz v7, :cond_4a

    .line 1585
    .line 1586
    :cond_49
    sget-object v7, LU1/Y;->c:LU1/Y;

    .line 1587
    .line 1588
    goto :goto_40

    .line 1589
    :cond_4a
    :goto_3f
    const/4 v7, 0x0

    .line 1590
    :goto_40
    aput-object v7, v4, v5

    .line 1591
    .line 1592
    const/16 v16, 0x1

    .line 1593
    .line 1594
    add-int/lit8 v5, v5, 0x1

    .line 1595
    .line 1596
    goto :goto_3e

    .line 1597
    :cond_4b
    iget-object v3, v0, LN1/T;->m:LN1/Q;

    .line 1598
    .line 1599
    iget v3, v3, LN1/Q;->a:I

    .line 1600
    .line 1601
    if-eqz v3, :cond_52

    .line 1602
    .line 1603
    const/4 v3, 0x0

    .line 1604
    const/4 v8, 0x0

    .line 1605
    const/4 v9, -0x1

    .line 1606
    :goto_41
    iget v10, v2, LR1/q;->a:I

    .line 1607
    .line 1608
    if-ge v8, v10, :cond_4f

    .line 1609
    .line 1610
    iget-object v10, v2, LR1/q;->b:Ljava/lang/Object;

    .line 1611
    .line 1612
    check-cast v10, [I

    .line 1613
    .line 1614
    aget v10, v10, v8

    .line 1615
    .line 1616
    aget-object v12, v6, v8

    .line 1617
    .line 1618
    const/4 v15, 0x1

    .line 1619
    if-eq v10, v15, :cond_4c

    .line 1620
    .line 1621
    if-eqz v12, :cond_4c

    .line 1622
    .line 1623
    goto :goto_45

    .line 1624
    :cond_4c
    if-ne v10, v15, :cond_4d

    .line 1625
    .line 1626
    if-eqz v12, :cond_4d

    .line 1627
    .line 1628
    invoke-interface {v12}, Ln2/q;->length()I

    .line 1629
    .line 1630
    .line 1631
    move-result v10

    .line 1632
    if-ne v10, v15, :cond_4d

    .line 1633
    .line 1634
    iget-object v10, v2, LR1/q;->c:Ljava/lang/Object;

    .line 1635
    .line 1636
    check-cast v10, [Lk2/n0;

    .line 1637
    .line 1638
    aget-object v10, v10, v8

    .line 1639
    .line 1640
    invoke-interface {v12}, Ln2/q;->g()LN1/O;

    .line 1641
    .line 1642
    .line 1643
    move-result-object v13

    .line 1644
    invoke-virtual {v10, v13}, Lk2/n0;->b(LN1/O;)I

    .line 1645
    .line 1646
    .line 1647
    move-result v10

    .line 1648
    aget-object v13, v11, v8

    .line 1649
    .line 1650
    aget-object v10, v13, v10

    .line 1651
    .line 1652
    const/4 v15, 0x0

    .line 1653
    invoke-interface {v12, v15}, Ln2/q;->c(I)I

    .line 1654
    .line 1655
    .line 1656
    move-result v13

    .line 1657
    aget v10, v10, v13

    .line 1658
    .line 1659
    invoke-interface {v12}, Ln2/q;->j()LN1/n;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v12

    .line 1663
    invoke-static {v0, v10, v12}, Ln2/o;->h(Ln2/i;ILN1/n;)Z

    .line 1664
    .line 1665
    .line 1666
    move-result v10

    .line 1667
    const/4 v12, 0x1

    .line 1668
    if-eqz v10, :cond_4e

    .line 1669
    .line 1670
    add-int/2addr v3, v12

    .line 1671
    move v9, v8

    .line 1672
    goto :goto_42

    .line 1673
    :cond_4d
    move v12, v15

    .line 1674
    :cond_4e
    :goto_42
    add-int/2addr v8, v12

    .line 1675
    goto :goto_41

    .line 1676
    :cond_4f
    const/4 v12, 0x1

    .line 1677
    if-ne v3, v12, :cond_52

    .line 1678
    .line 1679
    new-instance v3, LU1/Y;

    .line 1680
    .line 1681
    iget-object v0, v0, LN1/T;->m:LN1/Q;

    .line 1682
    .line 1683
    iget-boolean v0, v0, LN1/Q;->b:Z

    .line 1684
    .line 1685
    if-eqz v0, :cond_50

    .line 1686
    .line 1687
    const/4 v0, 0x1

    .line 1688
    goto :goto_43

    .line 1689
    :cond_50
    const/4 v0, 0x2

    .line 1690
    :goto_43
    aget-object v8, v4, v9

    .line 1691
    .line 1692
    if-eqz v8, :cond_51

    .line 1693
    .line 1694
    iget-boolean v8, v8, LU1/Y;->b:Z

    .line 1695
    .line 1696
    if-eqz v8, :cond_51

    .line 1697
    .line 1698
    const/4 v8, 0x1

    .line 1699
    goto :goto_44

    .line 1700
    :cond_51
    const/4 v8, 0x0

    .line 1701
    :goto_44
    invoke-direct {v3, v0, v8}, LU1/Y;-><init>(IZ)V

    .line 1702
    .line 1703
    .line 1704
    aput-object v3, v4, v9

    .line 1705
    .line 1706
    :cond_52
    :goto_45
    invoke-static {v4, v6}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v0

    .line 1710
    iget-object v3, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1711
    .line 1712
    check-cast v3, [Ln2/q;

    .line 1713
    .line 1714
    array-length v4, v3

    .line 1715
    new-array v4, v4, [Ljava/util/List;

    .line 1716
    .line 1717
    const/4 v8, 0x0

    .line 1718
    :goto_46
    array-length v6, v3

    .line 1719
    if-ge v8, v6, :cond_54

    .line 1720
    .line 1721
    aget-object v6, v3, v8

    .line 1722
    .line 1723
    if-eqz v6, :cond_53

    .line 1724
    .line 1725
    invoke-static {v6}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 1726
    .line 1727
    .line 1728
    move-result-object v6

    .line 1729
    goto :goto_47

    .line 1730
    :cond_53
    sget-object v6, Ll8/K;->b:Ll8/I;

    .line 1731
    .line 1732
    sget-object v6, Ll8/e0;->e:Ll8/e0;

    .line 1733
    .line 1734
    :goto_47
    aput-object v6, v4, v8

    .line 1735
    .line 1736
    const/16 v16, 0x1

    .line 1737
    .line 1738
    add-int/lit8 v8, v8, 0x1

    .line 1739
    .line 1740
    goto :goto_46

    .line 1741
    :cond_54
    new-instance v3, Ll8/H;

    .line 1742
    .line 1743
    const/4 v6, 0x4

    .line 1744
    invoke-direct {v3, v6}, Ll8/E;-><init>(I)V

    .line 1745
    .line 1746
    .line 1747
    const/4 v8, 0x0

    .line 1748
    :goto_48
    iget v6, v2, LR1/q;->a:I

    .line 1749
    .line 1750
    if-ge v8, v6, :cond_60

    .line 1751
    .line 1752
    iget-object v6, v2, LR1/q;->c:Ljava/lang/Object;

    .line 1753
    .line 1754
    check-cast v6, [Lk2/n0;

    .line 1755
    .line 1756
    aget-object v9, v6, v8

    .line 1757
    .line 1758
    aget-object v10, v4, v8

    .line 1759
    .line 1760
    const/4 v11, 0x0

    .line 1761
    :goto_49
    iget v12, v9, Lk2/n0;->a:I

    .line 1762
    .line 1763
    if-ge v11, v12, :cond_5f

    .line 1764
    .line 1765
    invoke-virtual {v9, v11}, Lk2/n0;->a(I)LN1/O;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v12

    .line 1769
    aget-object v13, v6, v8

    .line 1770
    .line 1771
    invoke-virtual {v13, v11}, Lk2/n0;->a(I)LN1/O;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v13

    .line 1775
    iget v13, v13, LN1/O;->a:I

    .line 1776
    .line 1777
    new-array v14, v13, [I

    .line 1778
    .line 1779
    const/4 v7, 0x0

    .line 1780
    const/4 v15, 0x0

    .line 1781
    :goto_4a
    if-ge v15, v13, :cond_56

    .line 1782
    .line 1783
    iget-object v5, v2, LR1/q;->e:Ljava/lang/Object;

    .line 1784
    .line 1785
    check-cast v5, [[[I

    .line 1786
    .line 1787
    aget-object v5, v5, v8

    .line 1788
    .line 1789
    aget-object v5, v5, v11

    .line 1790
    .line 1791
    aget v5, v5, v15

    .line 1792
    .line 1793
    and-int/lit8 v5, v5, 0x7

    .line 1794
    .line 1795
    move-object/from16 v20, v4

    .line 1796
    .line 1797
    const/4 v4, 0x4

    .line 1798
    if-eq v5, v4, :cond_55

    .line 1799
    .line 1800
    const/16 v16, 0x1

    .line 1801
    .line 1802
    goto :goto_4b

    .line 1803
    :cond_55
    const/16 v16, 0x1

    .line 1804
    .line 1805
    add-int/lit8 v5, v7, 0x1

    .line 1806
    .line 1807
    aput v15, v14, v7

    .line 1808
    .line 1809
    move v7, v5

    .line 1810
    :goto_4b
    add-int/lit8 v15, v15, 0x1

    .line 1811
    .line 1812
    move-object/from16 v4, v20

    .line 1813
    .line 1814
    goto :goto_4a

    .line 1815
    :cond_56
    move-object/from16 v20, v4

    .line 1816
    .line 1817
    const/4 v4, 0x4

    .line 1818
    invoke-static {v14, v7}, Ljava/util/Arrays;->copyOf([II)[I

    .line 1819
    .line 1820
    .line 1821
    move-result-object v5

    .line 1822
    const/16 v7, 0x10

    .line 1823
    .line 1824
    move-object/from16 v21, v6

    .line 1825
    .line 1826
    const/4 v4, 0x0

    .line 1827
    const/4 v13, 0x0

    .line 1828
    const/4 v14, 0x0

    .line 1829
    const/4 v15, 0x0

    .line 1830
    :goto_4c
    array-length v6, v5

    .line 1831
    if-ge v13, v6, :cond_58

    .line 1832
    .line 1833
    aget v6, v5, v13

    .line 1834
    .line 1835
    move-object/from16 v22, v5

    .line 1836
    .line 1837
    aget-object v5, v21, v8

    .line 1838
    .line 1839
    invoke-virtual {v5, v11}, Lk2/n0;->a(I)LN1/O;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v5

    .line 1843
    iget-object v5, v5, LN1/O;->d:[LN1/n;

    .line 1844
    .line 1845
    aget-object v5, v5, v6

    .line 1846
    .line 1847
    iget-object v5, v5, LN1/n;->n:Ljava/lang/String;

    .line 1848
    .line 1849
    const/16 v16, 0x1

    .line 1850
    .line 1851
    add-int/lit8 v6, v15, 0x1

    .line 1852
    .line 1853
    if-nez v15, :cond_57

    .line 1854
    .line 1855
    move-object v4, v5

    .line 1856
    goto :goto_4d

    .line 1857
    :cond_57
    invoke-static {v4, v5}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1858
    .line 1859
    .line 1860
    move-result v5

    .line 1861
    xor-int/lit8 v5, v5, 0x1

    .line 1862
    .line 1863
    or-int/2addr v5, v14

    .line 1864
    move v14, v5

    .line 1865
    :goto_4d
    iget-object v5, v2, LR1/q;->e:Ljava/lang/Object;

    .line 1866
    .line 1867
    check-cast v5, [[[I

    .line 1868
    .line 1869
    aget-object v5, v5, v8

    .line 1870
    .line 1871
    aget-object v5, v5, v11

    .line 1872
    .line 1873
    aget v5, v5, v13

    .line 1874
    .line 1875
    and-int/lit8 v5, v5, 0x18

    .line 1876
    .line 1877
    invoke-static {v7, v5}, Ljava/lang/Math;->min(II)I

    .line 1878
    .line 1879
    .line 1880
    move-result v7

    .line 1881
    const/16 v16, 0x1

    .line 1882
    .line 1883
    add-int/lit8 v13, v13, 0x1

    .line 1884
    .line 1885
    move v15, v6

    .line 1886
    move-object/from16 v5, v22

    .line 1887
    .line 1888
    goto :goto_4c

    .line 1889
    :cond_58
    if-eqz v14, :cond_59

    .line 1890
    .line 1891
    iget-object v4, v2, LR1/q;->d:Ljava/lang/Object;

    .line 1892
    .line 1893
    check-cast v4, [I

    .line 1894
    .line 1895
    aget v4, v4, v8

    .line 1896
    .line 1897
    invoke-static {v7, v4}, Ljava/lang/Math;->min(II)I

    .line 1898
    .line 1899
    .line 1900
    move-result v7

    .line 1901
    :cond_59
    if-eqz v7, :cond_5a

    .line 1902
    .line 1903
    const/4 v4, 0x1

    .line 1904
    goto :goto_4e

    .line 1905
    :cond_5a
    const/4 v4, 0x0

    .line 1906
    :goto_4e
    iget v5, v12, LN1/O;->a:I

    .line 1907
    .line 1908
    new-array v6, v5, [I

    .line 1909
    .line 1910
    new-array v5, v5, [Z

    .line 1911
    .line 1912
    const/4 v7, 0x0

    .line 1913
    :goto_4f
    iget v13, v12, LN1/O;->a:I

    .line 1914
    .line 1915
    if-ge v7, v13, :cond_5e

    .line 1916
    .line 1917
    iget-object v13, v2, LR1/q;->e:Ljava/lang/Object;

    .line 1918
    .line 1919
    check-cast v13, [[[I

    .line 1920
    .line 1921
    aget-object v13, v13, v8

    .line 1922
    .line 1923
    aget-object v13, v13, v11

    .line 1924
    .line 1925
    aget v13, v13, v7

    .line 1926
    .line 1927
    and-int/lit8 v13, v13, 0x7

    .line 1928
    .line 1929
    aput v13, v6, v7

    .line 1930
    .line 1931
    const/4 v13, 0x0

    .line 1932
    :goto_50
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 1933
    .line 1934
    .line 1935
    move-result v14

    .line 1936
    if-ge v13, v14, :cond_5d

    .line 1937
    .line 1938
    invoke-interface {v10, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v14

    .line 1942
    check-cast v14, Ln2/q;

    .line 1943
    .line 1944
    invoke-interface {v14}, Ln2/q;->g()LN1/O;

    .line 1945
    .line 1946
    .line 1947
    move-result-object v15

    .line 1948
    invoke-virtual {v15, v12}, LN1/O;->equals(Ljava/lang/Object;)Z

    .line 1949
    .line 1950
    .line 1951
    move-result v15

    .line 1952
    if-eqz v15, :cond_5c

    .line 1953
    .line 1954
    invoke-interface {v14, v7}, Ln2/q;->f(I)I

    .line 1955
    .line 1956
    .line 1957
    move-result v14

    .line 1958
    const/4 v15, -0x1

    .line 1959
    if-eq v14, v15, :cond_5b

    .line 1960
    .line 1961
    const/4 v13, 0x1

    .line 1962
    :goto_51
    const/16 v16, 0x1

    .line 1963
    .line 1964
    goto :goto_54

    .line 1965
    :cond_5b
    :goto_52
    const/16 v16, 0x1

    .line 1966
    .line 1967
    goto :goto_53

    .line 1968
    :cond_5c
    const/4 v15, -0x1

    .line 1969
    goto :goto_52

    .line 1970
    :goto_53
    add-int/lit8 v13, v13, 0x1

    .line 1971
    .line 1972
    goto :goto_50

    .line 1973
    :cond_5d
    const/4 v15, -0x1

    .line 1974
    const/4 v13, 0x0

    .line 1975
    goto :goto_51

    .line 1976
    :goto_54
    aput-boolean v13, v5, v7

    .line 1977
    .line 1978
    add-int/lit8 v7, v7, 0x1

    .line 1979
    .line 1980
    goto :goto_4f

    .line 1981
    :cond_5e
    const/4 v15, -0x1

    .line 1982
    const/16 v16, 0x1

    .line 1983
    .line 1984
    new-instance v7, LN1/U;

    .line 1985
    .line 1986
    invoke-direct {v7, v12, v4, v6, v5}, LN1/U;-><init>(LN1/O;Z[I[Z)V

    .line 1987
    .line 1988
    .line 1989
    invoke-virtual {v3, v7}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 1990
    .line 1991
    .line 1992
    add-int/lit8 v11, v11, 0x1

    .line 1993
    .line 1994
    move-object/from16 v4, v20

    .line 1995
    .line 1996
    move-object/from16 v6, v21

    .line 1997
    .line 1998
    const/4 v7, -0x2

    .line 1999
    goto/16 :goto_49

    .line 2000
    .line 2001
    :cond_5f
    move-object/from16 v20, v4

    .line 2002
    .line 2003
    const/4 v15, -0x1

    .line 2004
    const/16 v16, 0x1

    .line 2005
    .line 2006
    add-int/lit8 v8, v8, 0x1

    .line 2007
    .line 2008
    const/4 v7, -0x2

    .line 2009
    goto/16 :goto_48

    .line 2010
    .line 2011
    :cond_60
    const/4 v8, 0x0

    .line 2012
    :goto_55
    iget-object v4, v2, LR1/q;->f:Ljava/lang/Object;

    .line 2013
    .line 2014
    check-cast v4, Lk2/n0;

    .line 2015
    .line 2016
    iget v5, v4, Lk2/n0;->a:I

    .line 2017
    .line 2018
    if-ge v8, v5, :cond_61

    .line 2019
    .line 2020
    invoke-virtual {v4, v8}, Lk2/n0;->a(I)LN1/O;

    .line 2021
    .line 2022
    .line 2023
    move-result-object v4

    .line 2024
    iget v5, v4, LN1/O;->a:I

    .line 2025
    .line 2026
    new-array v5, v5, [I

    .line 2027
    .line 2028
    const/4 v15, 0x0

    .line 2029
    invoke-static {v5, v15}, Ljava/util/Arrays;->fill([II)V

    .line 2030
    .line 2031
    .line 2032
    iget v6, v4, LN1/O;->a:I

    .line 2033
    .line 2034
    new-array v6, v6, [Z

    .line 2035
    .line 2036
    new-instance v7, LN1/U;

    .line 2037
    .line 2038
    invoke-direct {v7, v4, v15, v5, v6}, LN1/U;-><init>(LN1/O;Z[I[Z)V

    .line 2039
    .line 2040
    .line 2041
    invoke-virtual {v3, v7}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 2042
    .line 2043
    .line 2044
    const/16 v16, 0x1

    .line 2045
    .line 2046
    add-int/lit8 v8, v8, 0x1

    .line 2047
    .line 2048
    goto :goto_55

    .line 2049
    :cond_61
    const/4 v15, 0x0

    .line 2050
    new-instance v4, LN1/V;

    .line 2051
    .line 2052
    invoke-virtual {v3}, Ll8/H;->g()Ll8/e0;

    .line 2053
    .line 2054
    .line 2055
    move-result-object v3

    .line 2056
    invoke-direct {v4, v3}, LN1/V;-><init>(Ll8/K;)V

    .line 2057
    .line 2058
    .line 2059
    new-instance v3, Ln2/t;

    .line 2060
    .line 2061
    iget-object v5, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 2062
    .line 2063
    check-cast v5, [LU1/Y;

    .line 2064
    .line 2065
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 2066
    .line 2067
    check-cast v0, [Ln2/q;

    .line 2068
    .line 2069
    invoke-direct {v3, v5, v0, v4, v2}, Ln2/t;-><init>([LU1/Y;[Ln2/q;LN1/V;LR1/q;)V

    .line 2070
    .line 2071
    .line 2072
    move v8, v15

    .line 2073
    :goto_56
    iget v0, v3, Ln2/t;->a:I

    .line 2074
    .line 2075
    if-ge v8, v0, :cond_66

    .line 2076
    .line 2077
    invoke-virtual {v3, v8}, Ln2/t;->b(I)Z

    .line 2078
    .line 2079
    .line 2080
    move-result v0

    .line 2081
    if-eqz v0, :cond_64

    .line 2082
    .line 2083
    iget-object v0, v3, Ln2/t;->c:[Ln2/q;

    .line 2084
    .line 2085
    aget-object v0, v0, v8

    .line 2086
    .line 2087
    if-nez v0, :cond_63

    .line 2088
    .line 2089
    iget-object v0, v1, LU1/E;->j:[LU1/X;

    .line 2090
    .line 2091
    aget-object v0, v0, v8

    .line 2092
    .line 2093
    invoke-interface {v0}, LU1/X;->f()I

    .line 2094
    .line 2095
    .line 2096
    move-result v0

    .line 2097
    const/4 v2, -0x2

    .line 2098
    if-ne v0, v2, :cond_62

    .line 2099
    .line 2100
    goto :goto_57

    .line 2101
    :cond_62
    move v0, v15

    .line 2102
    goto :goto_58

    .line 2103
    :cond_63
    const/4 v2, -0x2

    .line 2104
    :goto_57
    const/4 v0, 0x1

    .line 2105
    :goto_58
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 2106
    .line 2107
    .line 2108
    :goto_59
    const/16 v16, 0x1

    .line 2109
    .line 2110
    goto :goto_5b

    .line 2111
    :cond_64
    const/4 v2, -0x2

    .line 2112
    iget-object v0, v3, Ln2/t;->c:[Ln2/q;

    .line 2113
    .line 2114
    aget-object v0, v0, v8

    .line 2115
    .line 2116
    if-nez v0, :cond_65

    .line 2117
    .line 2118
    const/4 v0, 0x1

    .line 2119
    goto :goto_5a

    .line 2120
    :cond_65
    move v0, v15

    .line 2121
    :goto_5a
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 2122
    .line 2123
    .line 2124
    goto :goto_59

    .line 2125
    :goto_5b
    add-int/lit8 v8, v8, 0x1

    .line 2126
    .line 2127
    goto :goto_56

    .line 2128
    :cond_66
    iget-object v0, v3, Ln2/t;->c:[Ln2/q;

    .line 2129
    .line 2130
    array-length v2, v0

    .line 2131
    :goto_5c
    if-ge v15, v2, :cond_68

    .line 2132
    .line 2133
    aget-object v4, v0, v15

    .line 2134
    .line 2135
    move/from16 v5, p1

    .line 2136
    .line 2137
    if-eqz v4, :cond_67

    .line 2138
    .line 2139
    invoke-interface {v4, v5}, Ln2/q;->d(F)V

    .line 2140
    .line 2141
    .line 2142
    move/from16 v6, p3

    .line 2143
    .line 2144
    invoke-interface {v4, v6}, Ln2/q;->h(Z)V

    .line 2145
    .line 2146
    .line 2147
    :goto_5d
    const/16 v16, 0x1

    .line 2148
    .line 2149
    goto :goto_5e

    .line 2150
    :cond_67
    move/from16 v6, p3

    .line 2151
    .line 2152
    goto :goto_5d

    .line 2153
    :goto_5e
    add-int/lit8 v15, v15, 0x1

    .line 2154
    .line 2155
    goto :goto_5c

    .line 2156
    :cond_68
    return-object v3

    .line 2157
    :goto_5f
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2158
    throw v0
.end method

.method public final k()V
    .locals 6

    .line 1
    iget-object v0, p0, LU1/E;->a:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lk2/e;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, LU1/E;->g:LU1/F;

    .line 8
    .line 9
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    iget-wide v4, v1, LU1/F;->d:J

    .line 15
    .line 16
    cmp-long v1, v4, v2

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const-wide/high16 v4, -0x8000000000000000L

    .line 21
    .line 22
    :cond_0
    check-cast v0, Lk2/e;

    .line 23
    .line 24
    const-wide/16 v1, 0x0

    .line 25
    .line 26
    iput-wide v1, v0, Lk2/e;->e:J

    .line 27
    .line 28
    iput-wide v4, v0, Lk2/e;->f:J

    .line 29
    .line 30
    :cond_1
    return-void
.end method
