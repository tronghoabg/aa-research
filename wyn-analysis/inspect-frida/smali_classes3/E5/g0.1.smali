.class public final LE5/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:[Lf6/V;

.field public d:Z

.field public e:Z

.field public f:LE5/h0;

.field public g:Z

.field public final h:[Z

.field public final i:[LE5/f;

.field public final j:Lr6/o;

.field public final k:LE5/n0;

.field public l:LE5/g0;

.field public m:Lf6/a0;

.field public n:Lr6/s;

.field public o:J


# direct methods
.method public constructor <init>([LE5/f;JLr6/o;Lo2/e;LE5/n0;LE5/h0;Lr6/s;)V
    .locals 7

    .line 1
    move-object v2, p7

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, LE5/g0;->i:[LE5/f;

    .line 6
    .line 7
    iput-wide p2, p0, LE5/g0;->o:J

    .line 8
    .line 9
    iput-object p4, p0, LE5/g0;->j:Lr6/o;

    .line 10
    .line 11
    iput-object p6, p0, LE5/g0;->k:LE5/n0;

    .line 12
    .line 13
    iget-object v3, v2, LE5/h0;->a:Lf6/z;

    .line 14
    .line 15
    iget-object v4, v3, Lf6/x;->a:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object v4, p0, LE5/g0;->b:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object v2, p0, LE5/g0;->f:LE5/h0;

    .line 20
    .line 21
    sget-object v4, Lf6/a0;->d:Lf6/a0;

    .line 22
    .line 23
    iput-object v4, p0, LE5/g0;->m:Lf6/a0;

    .line 24
    .line 25
    move-object v4, p8

    .line 26
    iput-object v4, p0, LE5/g0;->n:Lr6/s;

    .line 27
    .line 28
    array-length v4, p1

    .line 29
    new-array v4, v4, [Lf6/V;

    .line 30
    .line 31
    iput-object v4, p0, LE5/g0;->c:[Lf6/V;

    .line 32
    .line 33
    array-length v0, p1

    .line 34
    new-array v0, v0, [Z

    .line 35
    .line 36
    iput-object v0, p0, LE5/g0;->h:[Z

    .line 37
    .line 38
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v0, v3, Lf6/x;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Landroid/util/Pair;

    .line 44
    .line 45
    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 46
    .line 47
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {v3, v0}, Lf6/z;->b(Ljava/lang/Object;)Lf6/z;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v3, p6, LE5/n0;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v3, Ljava/util/HashMap;

    .line 56
    .line 57
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, LE5/m0;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget-object v4, p6, LE5/n0;->f:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v4, Ljava/util/HashSet;

    .line 69
    .line 70
    invoke-virtual {v4, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    iget-object v4, p6, LE5/n0;->e:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v4, Ljava/util/HashMap;

    .line 76
    .line 77
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    check-cast v4, LE5/l0;

    .line 82
    .line 83
    if-eqz v4, :cond_0

    .line 84
    .line 85
    iget-object v5, v4, LE5/l0;->b:LE5/k0;

    .line 86
    .line 87
    iget-object v4, v4, LE5/l0;->a:Lf6/a;

    .line 88
    .line 89
    invoke-virtual {v4, v5}, Lf6/a;->d(Lf6/A;)V

    .line 90
    .line 91
    .line 92
    :cond_0
    iget-object v4, v3, LE5/m0;->c:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    iget-object v4, v3, LE5/m0;->a:Lf6/t;

    .line 98
    .line 99
    iget-wide v5, v2, LE5/h0;->b:J

    .line 100
    .line 101
    invoke-virtual {v4, v0, p5, v5, v6}, Lf6/t;->z(Lf6/z;Lo2/e;J)Lf6/q;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v4, p6, LE5/n0;->c:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v4, Ljava/util/IdentityHashMap;

    .line 108
    .line 109
    invoke-virtual {v4, v0, v3}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p6}, LE5/n0;->g()V

    .line 113
    .line 114
    .line 115
    iget-wide v1, v2, LE5/h0;->d:J

    .line 116
    .line 117
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    cmp-long v3, v1, v3

    .line 123
    .line 124
    if-eqz v3, :cond_1

    .line 125
    .line 126
    new-instance v3, Lf6/c;

    .line 127
    .line 128
    const/4 v4, 0x1

    .line 129
    const-wide/16 v5, 0x0

    .line 130
    .line 131
    move-object p2, v0

    .line 132
    move-wide p6, v1

    .line 133
    move-object p1, v3

    .line 134
    move p3, v4

    .line 135
    move-wide p4, v5

    .line 136
    invoke-direct/range {p1 .. p7}, Lf6/c;-><init>(Lf6/w;ZJJ)V

    .line 137
    .line 138
    .line 139
    move-object v0, p1

    .line 140
    :cond_1
    iput-object v0, p0, LE5/g0;->a:Ljava/lang/Object;

    .line 141
    .line 142
    return-void
.end method


# virtual methods
.method public final a(Lr6/s;JZ[Z)J
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
    iget v4, v1, Lr6/s;->a:I

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
    iget-object v4, v0, LE5/g0;->n:Lr6/s;

    .line 15
    .line 16
    invoke-virtual {v1, v4, v3}, Lr6/s;->a(Lr6/s;I)Z

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
    iget-object v4, v0, LE5/g0;->h:[Z

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
    iget-object v4, v0, LE5/g0;->i:[LE5/f;

    .line 33
    .line 34
    array-length v6, v4

    .line 35
    const/4 v7, -0x2

    .line 36
    iget-object v8, v0, LE5/g0;->c:[Lf6/V;

    .line 37
    .line 38
    if-ge v3, v6, :cond_3

    .line 39
    .line 40
    aget-object v4, v4, v3

    .line 41
    .line 42
    iget v4, v4, LE5/f;->a:I

    .line 43
    .line 44
    if-ne v4, v7, :cond_2

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    aput-object v4, v8, v3

    .line 48
    .line 49
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    invoke-virtual {v0}, LE5/g0;->b()V

    .line 53
    .line 54
    .line 55
    iput-object v1, v0, LE5/g0;->n:Lr6/s;

    .line 56
    .line 57
    invoke-virtual {v0}, LE5/g0;->c()V

    .line 58
    .line 59
    .line 60
    iget-object v9, v0, LE5/g0;->a:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v12, v0, LE5/g0;->c:[Lf6/V;

    .line 63
    .line 64
    iget-object v10, v1, Lr6/s;->c:[Lr6/n;

    .line 65
    .line 66
    iget-object v11, v0, LE5/g0;->h:[Z

    .line 67
    .line 68
    move-wide/from16 v14, p2

    .line 69
    .line 70
    move-object/from16 v13, p5

    .line 71
    .line 72
    invoke-interface/range {v9 .. v15}, Lf6/w;->y([Lr6/n;[Z[Lf6/V;[ZJ)J

    .line 73
    .line 74
    .line 75
    move-result-wide v9

    .line 76
    move v3, v2

    .line 77
    :goto_3
    array-length v6, v4

    .line 78
    if-ge v3, v6, :cond_5

    .line 79
    .line 80
    aget-object v6, v4, v3

    .line 81
    .line 82
    iget v6, v6, LE5/f;->a:I

    .line 83
    .line 84
    if-ne v6, v7, :cond_4

    .line 85
    .line 86
    iget-object v6, v0, LE5/g0;->n:Lr6/s;

    .line 87
    .line 88
    invoke-virtual {v6, v3}, Lr6/s;->b(I)Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-eqz v6, :cond_4

    .line 93
    .line 94
    new-instance v6, La2/k;

    .line 95
    .line 96
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 97
    .line 98
    .line 99
    aput-object v6, v8, v3

    .line 100
    .line 101
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    iput-boolean v2, v0, LE5/g0;->e:Z

    .line 105
    .line 106
    move v3, v2

    .line 107
    :goto_4
    array-length v6, v8

    .line 108
    if-ge v3, v6, :cond_9

    .line 109
    .line 110
    aget-object v6, v8, v3

    .line 111
    .line 112
    if-eqz v6, :cond_6

    .line 113
    .line 114
    invoke-virtual {v1, v3}, Lr6/s;->b(I)Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    invoke-static {v6}, Lu6/a;->i(Z)V

    .line 119
    .line 120
    .line 121
    aget-object v6, v4, v3

    .line 122
    .line 123
    iget v6, v6, LE5/f;->a:I

    .line 124
    .line 125
    if-eq v6, v7, :cond_8

    .line 126
    .line 127
    iput-boolean v5, v0, LE5/g0;->e:Z

    .line 128
    .line 129
    goto :goto_6

    .line 130
    :cond_6
    iget-object v6, v1, Lr6/s;->c:[Lr6/n;

    .line 131
    .line 132
    aget-object v6, v6, v3

    .line 133
    .line 134
    if-nez v6, :cond_7

    .line 135
    .line 136
    move v6, v5

    .line 137
    goto :goto_5

    .line 138
    :cond_7
    move v6, v2

    .line 139
    :goto_5
    invoke-static {v6}, Lu6/a;->i(Z)V

    .line 140
    .line 141
    .line 142
    :cond_8
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_9
    return-wide v9
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, LE5/g0;->l:LE5/g0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    iget-object v1, p0, LE5/g0;->n:Lr6/s;

    .line 7
    .line 8
    iget v2, v1, Lr6/s;->a:I

    .line 9
    .line 10
    if-ge v0, v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lr6/s;->b(I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, p0, LE5/g0;->n:Lr6/s;

    .line 17
    .line 18
    iget-object v2, v2, Lr6/s;->c:[Lr6/n;

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
    invoke-interface {v2}, Lr6/n;->a()V

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
    iget-object v0, p0, LE5/g0;->l:LE5/g0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    iget-object v1, p0, LE5/g0;->n:Lr6/s;

    .line 7
    .line 8
    iget v2, v1, Lr6/s;->a:I

    .line 9
    .line 10
    if-ge v0, v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lr6/s;->b(I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, p0, LE5/g0;->n:Lr6/s;

    .line 17
    .line 18
    iget-object v2, v2, Lr6/s;->c:[Lr6/n;

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
    invoke-interface {v2}, Lr6/n;->i()V

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
    iget-boolean v0, p0, LE5/g0;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LE5/g0;->f:LE5/h0;

    .line 6
    .line 7
    iget-wide v0, v0, LE5/h0;->b:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-boolean v0, p0, LE5/g0;->e:Z

    .line 11
    .line 12
    const-wide/high16 v1, -0x8000000000000000L

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, LE5/g0;->a:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {v0}, Lf6/W;->n()J

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
    iget-object v0, p0, LE5/g0;->f:LE5/h0;

    .line 29
    .line 30
    iget-wide v0, v0, LE5/h0;->e:J

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
    iget-object v0, p0, LE5/g0;->f:LE5/h0;

    .line 2
    .line 3
    iget-wide v0, v0, LE5/h0;->b:J

    .line 4
    .line 5
    iget-wide v2, p0, LE5/g0;->o:J

    .line 6
    .line 7
    add-long/2addr v0, v2

    .line 8
    return-wide v0
.end method

.method public final f()V
    .locals 3

    .line 1
    invoke-virtual {p0}, LE5/g0;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE5/g0;->a:Ljava/lang/Object;

    .line 5
    .line 6
    :try_start_0
    instance-of v1, v0, Lf6/c;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    iget-object v2, p0, LE5/g0;->k:LE5/n0;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    :try_start_1
    check-cast v0, Lf6/c;

    .line 13
    .line 14
    iget-object v0, v0, Lf6/c;->a:Lf6/w;

    .line 15
    .line 16
    invoke-virtual {v2, v0}, LE5/n0;->p(Lf6/w;)V

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
    invoke-virtual {v2, v0}, LE5/n0;->p(Lf6/w;)V
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
    invoke-static {v1, v2, v0}, Lu6/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final g(FLE5/J0;)Lr6/s;
    .locals 31

    move-object/from16 v1, p0

    const/4 v2, 0x5

    const/4 v6, 0x1

    .line 1
    iget-object v7, v1, LE5/g0;->j:Lr6/o;

    iget-object v8, v1, LE5/g0;->i:[LE5/f;

    .line 2
    iget-object v9, v1, LE5/g0;->m:Lf6/a0;

    .line 3
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    array-length v10, v8

    add-int/2addr v10, v6

    new-array v10, v10, [I

    .line 5
    array-length v11, v8

    add-int/2addr v11, v6

    new-array v12, v11, [[Lf6/Z;

    .line 6
    array-length v13, v8

    add-int/2addr v13, v6

    new-array v13, v13, [[[I

    const/4 v14, 0x0

    :goto_0
    if-ge v14, v11, :cond_0

    .line 7
    iget v15, v9, Lf6/a0;->a:I

    const/16 p2, 0x0

    new-array v4, v15, [Lf6/Z;

    aput-object v4, v12, v14

    .line 8
    new-array v4, v15, [[I

    aput-object v4, v13, v14

    add-int/2addr v14, v6

    goto :goto_0

    :cond_0
    const/16 p2, 0x0

    .line 9
    array-length v4, v8

    new-array v11, v4, [I

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v4, :cond_1

    .line 10
    aget-object v15, v8, v14

    invoke-virtual {v15}, LE5/f;->x()I

    move-result v15

    aput v15, v11, v14

    add-int/2addr v14, v6

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    .line 11
    :goto_2
    iget v14, v9, Lf6/a0;->a:I

    if-ge v4, v14, :cond_a

    .line 12
    invoke-virtual {v9, v4}, Lf6/a0;->a(I)Lf6/Z;

    move-result-object v14

    .line 13
    iget v15, v14, Lf6/Z;->c:I

    if-ne v15, v2, :cond_2

    move v15, v6

    :goto_3
    const/16 v16, 0x7

    goto :goto_4

    :cond_2
    const/4 v15, 0x0

    goto :goto_3

    .line 14
    :goto_4
    array-length v3, v8

    move/from16 v18, v6

    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 15
    :goto_5
    array-length v5, v8

    if-ge v0, v5, :cond_7

    .line 16
    aget-object v5, v8, v0

    move/from16 v21, v0

    move/from16 v20, v6

    const/4 v0, 0x0

    const/4 v6, 0x0

    .line 17
    :goto_6
    iget v1, v14, Lf6/Z;->a:I

    if-ge v6, v1, :cond_3

    .line 18
    iget-object v1, v14, Lf6/Z;->d:[LE5/T;

    aget-object v1, v1, v6

    .line 19
    invoke-virtual {v5, v1}, LE5/f;->w(LE5/T;)I

    move-result v1

    and-int/lit8 v1, v1, 0x7

    .line 20
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    .line 21
    :cond_3
    aget v1, v10, v21

    if-nez v1, :cond_4

    move/from16 v1, v20

    goto :goto_7

    :cond_4
    const/4 v1, 0x0

    :goto_7
    if-gt v0, v2, :cond_5

    if-ne v0, v2, :cond_6

    if-eqz v15, :cond_6

    if-nez v18, :cond_6

    if-eqz v1, :cond_6

    :cond_5
    move v2, v0

    move/from16 v18, v1

    move/from16 v3, v21

    :cond_6
    add-int/lit8 v0, v21, 0x1

    move-object/from16 v1, p0

    move/from16 v6, v20

    goto :goto_5

    :cond_7
    move/from16 v20, v6

    .line 22
    array-length v0, v8

    if-ne v3, v0, :cond_8

    .line 23
    iget v0, v14, Lf6/Z;->a:I

    new-array v0, v0, [I

    goto :goto_9

    .line 24
    :cond_8
    aget-object v0, v8, v3

    .line 25
    iget v1, v14, Lf6/Z;->a:I

    new-array v1, v1, [I

    const/4 v2, 0x0

    .line 26
    :goto_8
    iget v5, v14, Lf6/Z;->a:I

    if-ge v2, v5, :cond_9

    .line 27
    iget-object v5, v14, Lf6/Z;->d:[LE5/T;

    aget-object v5, v5, v2

    .line 28
    invoke-virtual {v0, v5}, LE5/f;->w(LE5/T;)I

    move-result v5

    aput v5, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_9
    move-object v0, v1

    .line 29
    :goto_9
    aget v1, v10, v3

    .line 30
    aget-object v2, v12, v3

    aput-object v14, v2, v1

    .line 31
    aget-object v2, v13, v3

    aput-object v0, v2, v1

    add-int/lit8 v1, v1, 0x1

    .line 32
    aput v1, v10, v3

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v1, p0

    move/from16 v6, v20

    const/4 v2, 0x5

    goto/16 :goto_2

    :cond_a
    move/from16 v20, v6

    const/16 v16, 0x7

    .line 33
    array-length v0, v8

    new-array v0, v0, [Lf6/a0;

    .line 34
    array-length v1, v8

    new-array v1, v1, [Ljava/lang/String;

    .line 35
    array-length v2, v8

    new-array v2, v2, [I

    const/4 v3, 0x0

    .line 36
    :goto_a
    array-length v4, v8

    if-ge v3, v4, :cond_b

    .line 37
    aget v4, v10, v3

    .line 38
    new-instance v5, Lf6/a0;

    aget-object v6, v12, v3

    .line 39
    invoke-static {v4, v6}, Lu6/v;->A(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Lf6/Z;

    invoke-direct {v5, v6}, Lf6/a0;-><init>([Lf6/Z;)V

    aput-object v5, v0, v3

    .line 40
    aget-object v5, v13, v3

    .line 41
    invoke-static {v4, v5}, Lu6/v;->A(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [[I

    aput-object v4, v13, v3

    .line 42
    aget-object v4, v8, v3

    invoke-virtual {v4}, LE5/f;->f()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v3

    .line 43
    aget-object v4, v8, v3

    .line 44
    iget v4, v4, LE5/f;->a:I

    .line 45
    aput v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_a

    .line 46
    :cond_b
    array-length v1, v8

    aget v1, v10, v1

    .line 47
    new-instance v3, Lf6/a0;

    array-length v4, v8

    aget-object v4, v12, v4

    .line 48
    invoke-static {v1, v4}, Lu6/v;->A(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lf6/Z;

    invoke-direct {v3, v1}, Lf6/a0;-><init>([Lf6/Z;)V

    .line 49
    new-instance v1, LR1/q;

    .line 50
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object v2, v1, LR1/q;->b:Ljava/lang/Object;

    .line 52
    iput-object v0, v1, LR1/q;->c:Ljava/lang/Object;

    .line 53
    iput-object v13, v1, LR1/q;->e:Ljava/lang/Object;

    .line 54
    iput-object v11, v1, LR1/q;->d:Ljava/lang/Object;

    .line 55
    iput-object v3, v1, LR1/q;->f:Ljava/lang/Object;

    .line 56
    array-length v0, v2

    iput v0, v1, LR1/q;->a:I

    .line 57
    check-cast v7, Lr6/l;

    .line 58
    iget-object v2, v7, Lr6/l;->c:Ljava/lang/Object;

    monitor-enter v2

    .line 59
    :try_start_0
    iget-object v0, v7, Lr6/l;->g:Lr6/f;

    .line 60
    iget-boolean v3, v0, Lr6/f;->J:Z

    const/16 v4, 0x20

    if-eqz v3, :cond_d

    sget v3, Lu6/v;->a:I

    if-lt v3, v4, :cond_d

    iget-object v3, v7, Lr6/l;->h:LA7/b0;

    if-eqz v3, :cond_d

    .line 61
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v5

    invoke-static {v5}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 62
    iget-object v6, v3, LA7/b0;->e:Ljava/lang/Object;

    check-cast v6, Ln2/j;

    if-nez v6, :cond_d

    .line 63
    iget-object v6, v3, LA7/b0;->d:Ljava/lang/Object;

    check-cast v6, Landroid/os/Handler;

    if-eqz v6, :cond_c

    goto :goto_b

    .line 64
    :cond_c
    new-instance v6, Ln2/j;

    move/from16 v8, v20

    invoke-direct {v6, v7, v8}, Ln2/j;-><init>(Ljava/lang/Object;I)V

    iput-object v6, v3, LA7/b0;->e:Ljava/lang/Object;

    .line 65
    new-instance v6, Landroid/os/Handler;

    invoke-direct {v6, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v6, v3, LA7/b0;->d:Ljava/lang/Object;

    .line 66
    iget-object v5, v3, LA7/b0;->c:Ljava/lang/Object;

    check-cast v5, Landroid/media/Spatializer;

    new-instance v8, LW1/s;

    const/4 v9, 0x0

    invoke-direct {v8, v6, v9}, LW1/s;-><init>(Ljava/lang/Object;I)V

    iget-object v3, v3, LA7/b0;->e:Ljava/lang/Object;

    check-cast v3, Ln2/j;

    invoke-static {v5, v8, v3}, LG5/f;->o(Landroid/media/Spatializer;LW1/s;Ln2/j;)V

    goto :goto_b

    :catchall_0
    move-exception v0

    goto/16 :goto_57

    .line 67
    :cond_d
    :goto_b
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    iget v2, v1, LR1/q;->a:I

    .line 69
    new-array v3, v2, [Lr6/m;

    .line 70
    new-instance v5, Laa/f;

    const/16 v6, 0x11

    invoke-direct {v5, v6, v0, v11}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Lq6/d;

    const/4 v8, 0x5

    invoke-direct {v6, v8}, Lq6/d;-><init>(I)V

    const/4 v8, 0x2

    invoke-static {v8, v1, v13, v5, v6}, Lr6/l;->h(ILR1/q;[[[ILr6/i;Ljava/util/Comparator;)Landroid/util/Pair;

    move-result-object v5

    if-eqz v5, :cond_e

    .line 71
    iget-object v6, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v5, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Lr6/m;

    aput-object v5, v3, v6

    :cond_e
    const/4 v5, 0x0

    .line 72
    :goto_c
    iget-object v6, v1, LR1/q;->c:Ljava/lang/Object;

    check-cast v6, [Lf6/a0;

    iget-object v8, v1, LR1/q;->b:Ljava/lang/Object;

    check-cast v8, [I

    iget v9, v1, LR1/q;->a:I

    if-ge v5, v9, :cond_10

    .line 73
    aget v9, v8, v5

    const/4 v10, 0x2

    if-ne v10, v9, :cond_f

    .line 74
    aget-object v9, v6, v5

    .line 75
    iget v9, v9, Lf6/a0;->a:I

    if-lez v9, :cond_f

    const/4 v5, 0x1

    :goto_d
    const/4 v9, 0x1

    goto :goto_e

    :cond_f
    const/4 v9, 0x1

    add-int/2addr v5, v9

    goto :goto_c

    :cond_10
    const/4 v5, 0x0

    goto :goto_d

    .line 76
    :goto_e
    new-instance v10, LW9/h;

    invoke-direct {v10, v5, v7, v0}, LW9/h;-><init>(ZLjava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Lq6/d;

    const/4 v11, 0x6

    invoke-direct {v5, v11}, Lq6/d;-><init>(I)V

    invoke-static {v9, v1, v13, v10, v5}, Lr6/l;->h(ILR1/q;[[[ILr6/i;Ljava/util/Comparator;)Landroid/util/Pair;

    move-result-object v5

    if-eqz v5, :cond_11

    .line 77
    iget-object v9, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v10, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Lr6/m;

    aput-object v10, v3, v9

    :cond_11
    if-nez v5, :cond_12

    move-object/from16 v5, p2

    goto :goto_f

    .line 78
    :cond_12
    iget-object v5, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Lr6/m;

    iget-object v9, v5, Lr6/m;->a:Lf6/Z;

    iget-object v5, v5, Lr6/m;->b:[I

    const/16 v19, 0x0

    aget v5, v5, v19

    .line 79
    iget-object v9, v9, Lf6/Z;->d:[LE5/T;

    .line 80
    aget-object v5, v9, v5

    .line 81
    iget-object v5, v5, LE5/T;->c:Ljava/lang/String;

    .line 82
    :goto_f
    new-instance v9, Laa/f;

    const/16 v10, 0x12

    invoke-direct {v9, v10, v0, v5}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Lq6/d;

    move/from16 v10, v16

    invoke-direct {v5, v10}, Lq6/d;-><init>(I)V

    const/4 v10, 0x3

    invoke-static {v10, v1, v13, v9, v5}, Lr6/l;->h(ILR1/q;[[[ILr6/i;Ljava/util/Comparator;)Landroid/util/Pair;

    move-result-object v5

    if-eqz v5, :cond_13

    .line 83
    iget-object v9, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v5, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Lr6/m;

    aput-object v5, v3, v9

    :cond_13
    const/4 v5, 0x0

    :goto_10
    if-ge v5, v2, :cond_1c

    .line 84
    aget v9, v8, v5

    const/4 v11, 0x2

    if-eq v9, v11, :cond_1a

    const/4 v11, 0x1

    if-eq v9, v11, :cond_1b

    if-eq v9, v10, :cond_1a

    .line 85
    aget-object v9, v6, v5

    .line 86
    aget-object v11, v13, v5

    move-object/from16 v15, p2

    move-object/from16 v17, v15

    const/4 v12, 0x0

    const/4 v14, 0x0

    .line 87
    :goto_11
    iget v10, v9, Lf6/a0;->a:I

    if-ge v12, v10, :cond_18

    .line 88
    invoke-virtual {v9, v12}, Lf6/a0;->a(I)Lf6/Z;

    move-result-object v10

    .line 89
    aget-object v21, v11, v12

    move-object/from16 v22, v17

    move/from16 v17, v4

    move-object/from16 v4, v22

    move/from16 v22, v5

    move-object/from16 v23, v6

    const/4 v5, 0x0

    .line 90
    :goto_12
    iget v6, v10, Lf6/Z;->a:I

    if-ge v5, v6, :cond_17

    .line 91
    aget v6, v21, v5

    move/from16 v24, v5

    iget-boolean v5, v0, Lr6/f;->K:Z

    invoke-static {v6, v5}, Lr6/l;->e(IZ)Z

    move-result v5

    if-eqz v5, :cond_16

    .line 92
    iget-object v5, v10, Lf6/Z;->d:[LE5/T;

    aget-object v5, v5, v24

    .line 93
    new-instance v6, Lr6/d;

    move-object/from16 v25, v8

    aget v8, v21, v24

    invoke-direct {v6, v5, v8}, Lr6/d;-><init>(LE5/T;I)V

    if-eqz v4, :cond_14

    .line 94
    sget-object v5, Ll8/A;->a:Ll8/y;

    iget-boolean v8, v4, Lr6/d;->b:Z

    move-object/from16 v26, v9

    .line 95
    iget-boolean v9, v6, Lr6/d;->b:Z

    invoke-virtual {v5, v9, v8}, Ll8/y;->c(ZZ)Ll8/A;

    move-result-object v5

    iget-boolean v8, v6, Lr6/d;->a:Z

    iget-boolean v9, v4, Lr6/d;->a:Z

    .line 96
    invoke-virtual {v5, v8, v9}, Ll8/A;->c(ZZ)Ll8/A;

    move-result-object v5

    .line 97
    invoke-virtual {v5}, Ll8/A;->e()I

    move-result v5

    if-lez v5, :cond_15

    goto :goto_13

    :cond_14
    move-object/from16 v26, v9

    :goto_13
    move-object v4, v6

    move-object v15, v10

    move/from16 v14, v24

    :cond_15
    :goto_14
    const/16 v20, 0x1

    goto :goto_15

    :cond_16
    move-object/from16 v25, v8

    move-object/from16 v26, v9

    goto :goto_14

    :goto_15
    add-int/lit8 v5, v24, 0x1

    move-object/from16 v8, v25

    move-object/from16 v9, v26

    goto :goto_12

    :cond_17
    move-object/from16 v25, v8

    move-object/from16 v26, v9

    const/16 v20, 0x1

    add-int/lit8 v12, v12, 0x1

    move/from16 v5, v17

    move-object/from16 v17, v4

    move v4, v5

    move/from16 v5, v22

    move-object/from16 v6, v23

    goto :goto_11

    :cond_18
    move/from16 v17, v4

    move/from16 v22, v5

    move-object/from16 v23, v6

    move-object/from16 v25, v8

    if-nez v15, :cond_19

    move-object/from16 v4, p2

    goto :goto_16

    .line 98
    :cond_19
    new-instance v4, Lr6/m;

    filled-new-array {v14}, [I

    move-result-object v5

    const/4 v9, 0x0

    .line 99
    invoke-direct {v4, v9, v15, v5}, Lr6/m;-><init>(ILf6/Z;[I)V

    .line 100
    :goto_16
    aput-object v4, v3, v22

    :goto_17
    const/16 v20, 0x1

    goto :goto_18

    :cond_1a
    move/from16 v17, v4

    move/from16 v22, v5

    move-object/from16 v23, v6

    move-object/from16 v25, v8

    goto :goto_17

    :cond_1b
    move/from16 v17, v4

    move/from16 v22, v5

    move-object/from16 v23, v6

    move-object/from16 v25, v8

    move/from16 v20, v11

    :goto_18
    add-int/lit8 v5, v22, 0x1

    move/from16 v4, v17

    move-object/from16 v6, v23

    move-object/from16 v8, v25

    const/4 v10, 0x3

    goto/16 :goto_10

    :cond_1c
    move/from16 v17, v4

    .line 101
    iget v4, v1, LR1/q;->a:I

    .line 102
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const/4 v6, 0x0

    .line 103
    :goto_19
    iget-object v8, v1, LR1/q;->c:Ljava/lang/Object;

    check-cast v8, [Lf6/a0;

    if-ge v6, v4, :cond_1d

    .line 104
    aget-object v8, v8, v6

    .line 105
    invoke-static {v8, v0, v5}, Lr6/l;->b(Lf6/a0;Lr6/f;Ljava/util/HashMap;)V

    const/16 v20, 0x1

    add-int/lit8 v6, v6, 0x1

    goto :goto_19

    .line 106
    :cond_1d
    iget-object v6, v1, LR1/q;->f:Ljava/lang/Object;

    check-cast v6, Lf6/a0;

    invoke-static {v6, v0, v5}, Lr6/l;->b(Lf6/a0;Lr6/f;Ljava/util/HashMap;)V

    const/4 v6, 0x0

    :goto_1a
    const/4 v9, -0x1

    if-ge v6, v4, :cond_21

    .line 107
    iget-object v10, v1, LR1/q;->b:Ljava/lang/Object;

    check-cast v10, [I

    aget v10, v10, v6

    .line 108
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lr6/p;

    if-nez v10, :cond_1e

    :goto_1b
    const/16 v20, 0x1

    goto :goto_1e

    .line 109
    :cond_1e
    iget-object v11, v10, Lr6/p;->b:Ll8/K;

    invoke-virtual {v11}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_20

    .line 110
    aget-object v12, v8, v6

    .line 111
    iget-object v10, v10, Lr6/p;->a:Lf6/Z;

    .line 112
    iget-object v12, v12, Lf6/a0;->b:Ll8/e0;

    .line 113
    invoke-virtual {v12, v10}, Ll8/K;->indexOf(Ljava/lang/Object;)I

    move-result v12

    if-ltz v12, :cond_1f

    goto :goto_1c

    :cond_1f
    move v12, v9

    :goto_1c
    if-eq v12, v9, :cond_20

    .line 114
    new-instance v9, Lr6/m;

    .line 115
    invoke-static {v11}, LS3/f;->K(Ljava/util/Collection;)[I

    move-result-object v11

    const/4 v12, 0x0

    .line 116
    invoke-direct {v9, v12, v10, v11}, Lr6/m;-><init>(ILf6/Z;[I)V

    goto :goto_1d

    :cond_20
    move-object/from16 v9, p2

    .line 117
    :goto_1d
    aput-object v9, v3, v6

    goto :goto_1b

    :goto_1e
    add-int/lit8 v6, v6, 0x1

    goto :goto_1a

    .line 118
    :cond_21
    iget v4, v1, LR1/q;->a:I

    const/4 v5, 0x0

    :goto_1f
    if-ge v5, v4, :cond_24

    .line 119
    iget-object v6, v1, LR1/q;->c:Ljava/lang/Object;

    check-cast v6, [Lf6/a0;

    aget-object v6, v6, v5

    .line 120
    iget-object v8, v0, Lr6/f;->N:Landroid/util/SparseArray;

    .line 121
    invoke-virtual {v8, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map;

    if-eqz v8, :cond_23

    .line 122
    invoke-interface {v8, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_23

    .line 123
    iget-object v8, v0, Lr6/f;->N:Landroid/util/SparseArray;

    .line 124
    invoke-virtual {v8, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map;

    if-eqz v8, :cond_22

    .line 125
    invoke-interface {v8, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lr6/g;

    .line 126
    :cond_22
    aput-object p2, v3, v5

    :cond_23
    const/16 v20, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_1f

    :cond_24
    const/4 v4, 0x0

    :goto_20
    if-ge v4, v2, :cond_27

    .line 127
    iget-object v5, v1, LR1/q;->b:Ljava/lang/Object;

    check-cast v5, [I

    aget v5, v5, v4

    .line 128
    iget-object v6, v0, Lr6/f;->O:Landroid/util/SparseBooleanArray;

    invoke-virtual {v6, v4}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v6

    if-nez v6, :cond_26

    .line 129
    iget-object v6, v0, Lr6/r;->z:Ll8/P;

    .line 130
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v6, v5}, Ll8/F;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_25

    goto :goto_22

    :cond_25
    :goto_21
    const/16 v20, 0x1

    goto :goto_23

    .line 131
    :cond_26
    :goto_22
    aput-object p2, v3, v4

    goto :goto_21

    :goto_23
    add-int/lit8 v4, v4, 0x1

    goto :goto_20

    .line 132
    :cond_27
    iget-object v4, v7, Lr6/l;->e:La9/a;

    .line 133
    iget-object v5, v7, Lr6/o;->b:Lt6/e;

    invoke-static {v5}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 134
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const/4 v5, 0x0

    .line 136
    :goto_24
    array-length v6, v3

    const-wide/16 v7, 0x0

    if-ge v5, v6, :cond_29

    .line 137
    aget-object v6, v3, v5

    if-eqz v6, :cond_28

    iget-object v6, v6, Lr6/m;->b:[I

    array-length v6, v6

    const/4 v11, 0x1

    if-le v6, v11, :cond_28

    .line 138
    invoke-static {}, Ll8/K;->i()Ll8/H;

    move-result-object v6

    .line 139
    new-instance v10, Lr6/a;

    invoke-direct {v10, v7, v8, v7, v8}, Lr6/a;-><init>(JJ)V

    .line 140
    invoke-virtual {v6, v10}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 141
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v6, p2

    :goto_25
    const/16 v20, 0x1

    goto :goto_26

    :cond_28
    move-object/from16 v6, p2

    .line 142
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_25

    :goto_26
    add-int/lit8 v5, v5, 0x1

    move-object/from16 p2, v6

    goto :goto_24

    :cond_29
    move-object/from16 v6, p2

    .line 143
    array-length v5, v3

    new-array v10, v5, [[J

    const/4 v11, 0x0

    .line 144
    :goto_27
    array-length v12, v3

    if-ge v11, v12, :cond_2d

    .line 145
    aget-object v12, v3, v11

    if-nez v12, :cond_2a

    const/4 v6, 0x0

    .line 146
    new-array v12, v6, [J

    aput-object v12, v10, v11

    const/16 v20, 0x1

    goto :goto_29

    .line 147
    :cond_2a
    iget-object v6, v12, Lr6/m;->b:[I

    array-length v7, v6

    new-array v7, v7, [J

    aput-object v7, v10, v11

    const/4 v7, 0x0

    .line 148
    :goto_28
    array-length v8, v6

    if-ge v7, v8, :cond_2c

    .line 149
    aget v8, v6, v7

    const-wide/16 v23, -0x1

    .line 150
    iget-object v14, v12, Lr6/m;->a:Lf6/Z;

    iget-object v14, v14, Lf6/Z;->d:[LE5/T;

    .line 151
    aget-object v8, v14, v8

    .line 152
    iget v8, v8, LE5/T;->h:I

    int-to-long v14, v8

    .line 153
    aget-object v8, v10, v11

    cmp-long v18, v14, v23

    if-nez v18, :cond_2b

    const-wide/16 v14, 0x0

    :cond_2b
    aput-wide v14, v8, v7

    const/16 v20, 0x1

    add-int/lit8 v7, v7, 0x1

    goto :goto_28

    :cond_2c
    const/16 v20, 0x1

    .line 154
    aget-object v6, v10, v11

    invoke-static {v6}, Ljava/util/Arrays;->sort([J)V

    :goto_29
    add-int/lit8 v11, v11, 0x1

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    goto :goto_27

    :cond_2d
    const-wide/16 v23, -0x1

    .line 155
    new-array v6, v5, [I

    .line 156
    new-array v7, v5, [J

    const/4 v8, 0x0

    :goto_2a
    if-ge v8, v5, :cond_2f

    .line 157
    aget-object v11, v10, v8

    array-length v12, v11

    if-nez v12, :cond_2e

    const-wide/16 v14, 0x0

    goto :goto_2b

    :cond_2e
    const/16 v19, 0x0

    aget-wide v14, v11, v19

    :goto_2b
    aput-wide v14, v7, v8

    const/16 v20, 0x1

    add-int/lit8 v8, v8, 0x1

    goto :goto_2a

    .line 158
    :cond_2f
    invoke-static {v4, v7}, Lr6/b;->l(Ljava/util/ArrayList;[J)V

    .line 159
    const-string v8, "expectedValuesPerKey"

    const/4 v11, 0x2

    invoke-static {v11, v8}, Ll8/s;->d(ILjava/lang/String;)V

    .line 160
    new-instance v8, Ljava/util/TreeMap;

    sget-object v11, Ll8/c0;->b:Ll8/c0;

    invoke-direct {v8, v11}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 161
    new-instance v11, Ll8/Z;

    invoke-direct {v11}, Ll8/Z;-><init>()V

    .line 162
    new-instance v12, Ll8/a0;

    .line 163
    invoke-direct {v12, v8}, Ll8/a0;-><init>(Ljava/util/Map;)V

    .line 164
    iput-object v11, v12, Ll8/a0;->f:Ll8/Z;

    const/4 v8, 0x0

    :goto_2c
    if-ge v8, v5, :cond_35

    .line 165
    aget-object v11, v10, v8

    array-length v14, v11

    const/4 v15, 0x1

    if-gt v14, v15, :cond_30

    move/from16 v21, v5

    move-object/from16 v22, v6

    move/from16 v20, v15

    goto :goto_31

    .line 166
    :cond_30
    array-length v11, v11

    new-array v14, v11, [D

    const/4 v15, 0x0

    .line 167
    :goto_2d
    aget-object v9, v10, v8

    move/from16 v21, v5

    array-length v5, v9

    const-wide/16 v25, 0x0

    if-ge v15, v5, :cond_32

    move-object/from16 v22, v6

    .line 168
    aget-wide v5, v9, v15

    cmp-long v9, v5, v23

    if-nez v9, :cond_31

    goto :goto_2e

    :cond_31
    long-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->log(D)D

    move-result-wide v25

    :goto_2e
    aput-wide v25, v14, v15

    const/16 v20, 0x1

    add-int/lit8 v15, v15, 0x1

    move/from16 v5, v21

    move-object/from16 v6, v22

    goto :goto_2d

    :cond_32
    move-object/from16 v22, v6

    const/16 v20, 0x1

    add-int/lit8 v11, v11, -0x1

    .line 169
    aget-wide v5, v14, v11

    const/16 v19, 0x0

    aget-wide v27, v14, v19

    sub-double v5, v5, v27

    const/4 v9, 0x0

    :goto_2f
    if-ge v9, v11, :cond_34

    .line 170
    aget-wide v27, v14, v9

    add-int/lit8 v9, v9, 0x1

    aget-wide v29, v14, v9

    add-double v27, v27, v29

    const-wide/high16 v29, 0x3fe0000000000000L    # 0.5

    mul-double v27, v27, v29

    cmpl-double v15, v5, v25

    if-nez v15, :cond_33

    const-wide/high16 v27, 0x3ff0000000000000L    # 1.0

    goto :goto_30

    :cond_33
    const/16 v19, 0x0

    .line 171
    aget-wide v29, v14, v19

    sub-double v27, v27, v29

    div-double v27, v27, v5

    .line 172
    :goto_30
    invoke-static/range {v27 .. v28}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v15

    move-wide/from16 v27, v5

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v12, v15, v5}, Ll8/a0;->e(Ljava/lang/Double;Ljava/lang/Integer;)Z

    move-wide/from16 v5, v27

    const/16 v20, 0x1

    goto :goto_2f

    :cond_34
    const/16 v20, 0x1

    :goto_31
    add-int/lit8 v8, v8, 0x1

    move/from16 v5, v21

    move-object/from16 v6, v22

    const/4 v9, -0x1

    goto :goto_2c

    :cond_35
    move-object/from16 v22, v6

    .line 173
    invoke-virtual {v12}, Ll8/a0;->f()Ljava/util/Collection;

    move-result-object v5

    invoke-static {v5}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    move-result-object v5

    const/4 v6, 0x0

    .line 174
    :goto_32
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    move-result v8

    if-ge v6, v8, :cond_36

    .line 175
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 176
    aget v9, v22, v8

    const/16 v20, 0x1

    add-int/lit8 v9, v9, 0x1

    aput v9, v22, v8

    .line 177
    aget-object v11, v10, v8

    aget-wide v14, v11, v9

    aput-wide v14, v7, v8

    .line 178
    invoke-static {v4, v7}, Lr6/b;->l(Ljava/util/ArrayList;[J)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_32

    :cond_36
    const/4 v5, 0x0

    .line 179
    :goto_33
    array-length v6, v3

    if-ge v5, v6, :cond_38

    .line 180
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_37

    .line 181
    aget-wide v8, v7, v5

    const-wide/16 v10, 0x2

    mul-long/2addr v8, v10

    aput-wide v8, v7, v5

    :cond_37
    const/16 v20, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_33

    .line 182
    :cond_38
    invoke-static {v4, v7}, Lr6/b;->l(Ljava/util/ArrayList;[J)V

    .line 183
    invoke-static {}, Ll8/K;->i()Ll8/H;

    move-result-object v5

    const/4 v6, 0x0

    .line 184
    :goto_34
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v6, v7, :cond_3a

    .line 185
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll8/H;

    if-nez v7, :cond_39

    .line 186
    sget-object v7, Ll8/e0;->e:Ll8/e0;

    goto :goto_35

    .line 187
    :cond_39
    invoke-virtual {v7}, Ll8/H;->g()Ll8/e0;

    move-result-object v7

    .line 188
    :goto_35
    invoke-virtual {v5, v7}, Ll8/E;->a(Ljava/lang/Object;)V

    const/16 v20, 0x1

    add-int/lit8 v6, v6, 0x1

    goto :goto_34

    .line 189
    :cond_3a
    invoke-virtual {v5}, Ll8/H;->g()Ll8/e0;

    move-result-object v4

    .line 190
    array-length v5, v3

    new-array v5, v5, [Lr6/n;

    const/4 v9, 0x0

    .line 191
    :goto_36
    array-length v6, v3

    if-ge v9, v6, :cond_3f

    .line 192
    aget-object v6, v3, v9

    if-eqz v6, :cond_3b

    .line 193
    iget-object v7, v6, Lr6/m;->b:[I

    array-length v8, v7

    if-nez v8, :cond_3c

    :cond_3b
    move-object/from16 v21, v3

    :goto_37
    const/16 v20, 0x1

    goto :goto_39

    .line 194
    :cond_3c
    array-length v8, v7

    iget-object v6, v6, Lr6/m;->a:Lf6/Z;

    const/4 v11, 0x1

    if-ne v8, v11, :cond_3d

    .line 195
    new-instance v8, Lr6/b;

    const/16 v19, 0x0

    aget v7, v7, v19

    .line 196
    filled-new-array {v7}, [I

    move-result-object v7

    invoke-direct {v8, v11, v6, v7}, Lr6/b;-><init>(ILf6/Z;[I)V

    move-object/from16 v21, v3

    goto :goto_38

    .line 197
    :cond_3d
    invoke-virtual {v4, v9}, Ll8/e0;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll8/K;

    .line 198
    new-instance v10, Lr6/b;

    const/16 v11, 0x2710

    int-to-long v11, v11

    const/16 v14, 0x61a8

    int-to-long v14, v14

    move-object/from16 v21, v3

    const/4 v3, 0x0

    .line 199
    invoke-direct {v10, v3, v6, v7}, Lr6/b;-><init>(ILf6/Z;[I)V

    cmp-long v3, v14, v11

    if-gez v3, :cond_3e

    .line 200
    const-string v3, "AdaptiveTrackSelection"

    const-string v6, "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs"

    invoke-static {v3, v6}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    :cond_3e
    invoke-static {v8}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    move-object v8, v10

    .line 202
    :goto_38
    aput-object v8, v5, v9

    goto :goto_37

    :goto_39
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v3, v21

    goto :goto_36

    .line 203
    :cond_3f
    new-array v3, v2, [LE5/B0;

    const/4 v9, 0x0

    :goto_3a
    if-ge v9, v2, :cond_43

    .line 204
    iget-object v4, v1, LR1/q;->b:Ljava/lang/Object;

    check-cast v4, [I

    aget v4, v4, v9

    .line 205
    iget-object v6, v0, Lr6/f;->O:Landroid/util/SparseBooleanArray;

    invoke-virtual {v6, v9}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v6

    if-nez v6, :cond_42

    .line 206
    iget-object v6, v0, Lr6/r;->z:Ll8/P;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v6, v4}, Ll8/F;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_40

    goto :goto_3b

    .line 207
    :cond_40
    iget-object v4, v1, LR1/q;->b:Ljava/lang/Object;

    check-cast v4, [I

    aget v4, v4, v9

    const/4 v6, -0x2

    if-eq v4, v6, :cond_41

    .line 208
    aget-object v4, v5, v9

    if-eqz v4, :cond_42

    .line 209
    :cond_41
    sget-object v4, LE5/B0;->b:LE5/B0;

    goto :goto_3c

    :cond_42
    :goto_3b
    const/4 v4, 0x0

    :goto_3c
    aput-object v4, v3, v9

    const/16 v20, 0x1

    add-int/lit8 v9, v9, 0x1

    goto :goto_3a

    .line 210
    :cond_43
    iget-boolean v0, v0, Lr6/f;->L:Z

    if-eqz v0, :cond_4e

    const/4 v0, -0x1

    const/4 v2, -0x1

    const/4 v9, 0x0

    .line 211
    :goto_3d
    iget v4, v1, LR1/q;->a:I

    if-ge v9, v4, :cond_4c

    .line 212
    iget-object v4, v1, LR1/q;->b:Ljava/lang/Object;

    check-cast v4, [I

    aget v4, v4, v9

    .line 213
    aget-object v6, v5, v9

    const/4 v11, 0x1

    if-eq v4, v11, :cond_45

    const/4 v11, 0x2

    if-ne v4, v11, :cond_44

    goto :goto_3f

    :cond_44
    move/from16 v14, v17

    :goto_3e
    const/4 v4, -0x1

    const/4 v15, 0x1

    goto :goto_43

    :cond_45
    const/4 v11, 0x2

    :goto_3f
    if-eqz v6, :cond_44

    .line 214
    aget-object v7, v13, v9

    .line 215
    iget-object v8, v1, LR1/q;->c:Ljava/lang/Object;

    check-cast v8, [Lf6/a0;

    aget-object v8, v8, v9

    .line 216
    invoke-interface {v6}, Lr6/n;->g()Lf6/Z;

    move-result-object v10

    .line 217
    iget-object v8, v8, Lf6/a0;->b:Ll8/e0;

    .line 218
    invoke-virtual {v8, v10}, Ll8/K;->indexOf(Ljava/lang/Object;)I

    move-result v8

    if-ltz v8, :cond_46

    goto :goto_40

    :cond_46
    const/4 v8, -0x1

    :goto_40
    const/4 v10, 0x0

    .line 219
    :goto_41
    invoke-interface {v6}, Lr6/n;->length()I

    move-result v12

    if-ge v10, v12, :cond_48

    .line 220
    aget-object v12, v7, v8

    invoke-interface {v6, v10}, Lr6/n;->c(I)I

    move-result v14

    aget v12, v12, v14

    and-int/lit8 v12, v12, 0x20

    move/from16 v14, v17

    if-eq v12, v14, :cond_47

    goto :goto_3e

    :cond_47
    const/4 v15, 0x1

    add-int/2addr v10, v15

    move/from16 v17, v14

    goto :goto_41

    :cond_48
    move/from16 v14, v17

    const/4 v15, 0x1

    if-ne v4, v15, :cond_4a

    const/4 v4, -0x1

    if-eq v2, v4, :cond_49

    :goto_42
    const/4 v6, 0x0

    goto :goto_44

    :cond_49
    move v2, v9

    goto :goto_43

    :cond_4a
    const/4 v4, -0x1

    if-eq v0, v4, :cond_4b

    goto :goto_42

    :cond_4b
    move v0, v9

    :goto_43
    add-int/2addr v9, v15

    move/from16 v17, v14

    goto :goto_3d

    :cond_4c
    const/4 v4, -0x1

    const/4 v6, 0x1

    :goto_44
    if-eq v2, v4, :cond_4d

    if-eq v0, v4, :cond_4d

    const/4 v4, 0x1

    goto :goto_45

    :cond_4d
    const/4 v4, 0x0

    :goto_45
    and-int/2addr v4, v6

    if-eqz v4, :cond_4e

    .line 221
    new-instance v4, LE5/B0;

    const/4 v11, 0x1

    invoke-direct {v4, v11}, LE5/B0;-><init>(Z)V

    .line 222
    aput-object v4, v3, v2

    .line 223
    aput-object v4, v3, v0

    .line 224
    :cond_4e
    invoke-static {v3, v5}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    .line 225
    iget-object v2, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, [Lr6/n;

    .line 226
    array-length v3, v2

    new-array v3, v3, [Ljava/util/List;

    const/4 v9, 0x0

    .line 227
    :goto_46
    array-length v4, v2

    if-ge v9, v4, :cond_50

    .line 228
    aget-object v4, v2, v9

    if-eqz v4, :cond_4f

    .line 229
    invoke-static {v4}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    move-result-object v4

    goto :goto_47

    :cond_4f
    sget-object v4, Ll8/K;->b:Ll8/I;

    .line 230
    sget-object v4, Ll8/e0;->e:Ll8/e0;

    .line 231
    :goto_47
    aput-object v4, v3, v9

    const/16 v20, 0x1

    add-int/lit8 v9, v9, 0x1

    goto :goto_46

    .line 232
    :cond_50
    new-instance v2, Ll8/H;

    const/4 v4, 0x4

    .line 233
    invoke-direct {v2, v4}, Ll8/E;-><init>(I)V

    const/4 v9, 0x0

    .line 234
    :goto_48
    iget v5, v1, LR1/q;->a:I

    if-ge v9, v5, :cond_5c

    .line 235
    iget-object v5, v1, LR1/q;->c:Ljava/lang/Object;

    check-cast v5, [Lf6/a0;

    aget-object v6, v5, v9

    .line 236
    aget-object v7, v3, v9

    const/4 v8, 0x0

    .line 237
    :goto_49
    iget v10, v6, Lf6/a0;->a:I

    if-ge v8, v10, :cond_5b

    .line 238
    invoke-virtual {v6, v8}, Lf6/a0;->a(I)Lf6/Z;

    move-result-object v10

    .line 239
    aget-object v11, v5, v9

    invoke-virtual {v11, v8}, Lf6/a0;->a(I)Lf6/Z;

    move-result-object v11

    iget v11, v11, Lf6/Z;->a:I

    .line 240
    new-array v12, v11, [I

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_4a
    if-ge v13, v11, :cond_52

    .line 241
    iget-object v15, v1, LR1/q;->e:Ljava/lang/Object;

    check-cast v15, [[[I

    aget-object v15, v15, v9

    aget-object v15, v15, v8

    aget v15, v15, v13

    const/16 v16, 0x7

    and-int/lit8 v15, v15, 0x7

    if-eq v15, v4, :cond_51

    const/16 v20, 0x1

    goto :goto_4b

    :cond_51
    const/16 v20, 0x1

    add-int/lit8 v15, v14, 0x1

    .line 242
    aput v13, v12, v14

    move v14, v15

    :goto_4b
    add-int/lit8 v13, v13, 0x1

    goto :goto_4a

    .line 243
    :cond_52
    invoke-static {v12, v14}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v11

    const/16 v12, 0x10

    move-object/from16 v17, v3

    move v15, v12

    const/4 v4, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 244
    :goto_4c
    array-length v3, v11

    if-ge v12, v3, :cond_54

    .line 245
    aget v3, v11, v12

    move/from16 v21, v3

    .line 246
    aget-object v3, v5, v9

    .line 247
    invoke-virtual {v3, v8}, Lf6/a0;->a(I)Lf6/Z;

    move-result-object v3

    .line 248
    iget-object v3, v3, Lf6/Z;->d:[LE5/T;

    .line 249
    aget-object v3, v3, v21

    .line 250
    iget-object v3, v3, LE5/T;->l:Ljava/lang/String;

    const/16 v20, 0x1

    add-int/lit8 v21, v14, 0x1

    if-nez v14, :cond_53

    move-object v4, v3

    goto :goto_4d

    .line 251
    :cond_53
    invoke-static {v4, v3}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    or-int/2addr v3, v13

    move v13, v3

    .line 252
    :goto_4d
    iget-object v3, v1, LR1/q;->e:Ljava/lang/Object;

    check-cast v3, [[[I

    aget-object v3, v3, v9

    aget-object v3, v3, v8

    aget v3, v3, v12

    and-int/lit8 v3, v3, 0x18

    .line 253
    invoke-static {v15, v3}, Ljava/lang/Math;->min(II)I

    move-result v15

    const/16 v20, 0x1

    add-int/lit8 v12, v12, 0x1

    move/from16 v14, v21

    goto :goto_4c

    :cond_54
    if-eqz v13, :cond_55

    .line 254
    iget-object v3, v1, LR1/q;->d:Ljava/lang/Object;

    check-cast v3, [I

    aget v3, v3, v9

    invoke-static {v15, v3}, Ljava/lang/Math;->min(II)I

    move-result v15

    :cond_55
    if-eqz v15, :cond_56

    const/4 v3, 0x1

    goto :goto_4e

    :cond_56
    const/4 v3, 0x0

    .line 255
    :goto_4e
    iget v4, v10, Lf6/Z;->a:I

    new-array v11, v4, [I

    .line 256
    new-array v4, v4, [Z

    const/4 v12, 0x0

    .line 257
    :goto_4f
    iget v13, v10, Lf6/Z;->a:I

    if-ge v12, v13, :cond_5a

    .line 258
    iget-object v13, v1, LR1/q;->e:Ljava/lang/Object;

    check-cast v13, [[[I

    aget-object v13, v13, v9

    aget-object v13, v13, v8

    aget v13, v13, v12

    const/16 v16, 0x7

    and-int/lit8 v13, v13, 0x7

    .line 259
    aput v13, v11, v12

    const/4 v13, 0x0

    .line 260
    :goto_50
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v14

    if-ge v13, v14, :cond_59

    .line 261
    invoke-interface {v7, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lr6/n;

    .line 262
    invoke-interface {v14}, Lr6/n;->g()Lf6/Z;

    move-result-object v15

    invoke-virtual {v15, v10}, Lf6/Z;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_58

    .line 263
    invoke-interface {v14, v12}, Lr6/n;->f(I)I

    move-result v14

    const/4 v15, -0x1

    if-eq v14, v15, :cond_57

    const/4 v13, 0x1

    :goto_51
    const/16 v20, 0x1

    goto :goto_54

    :cond_57
    :goto_52
    const/16 v20, 0x1

    goto :goto_53

    :cond_58
    const/4 v15, -0x1

    goto :goto_52

    :goto_53
    add-int/lit8 v13, v13, 0x1

    goto :goto_50

    :cond_59
    const/4 v15, -0x1

    const/4 v13, 0x0

    goto :goto_51

    .line 264
    :goto_54
    aput-boolean v13, v4, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_4f

    :cond_5a
    const/4 v15, -0x1

    const/16 v16, 0x7

    const/16 v20, 0x1

    .line 265
    new-instance v12, LE5/K0;

    invoke-direct {v12, v10, v3, v11, v4}, LE5/K0;-><init>(Lf6/Z;Z[I[Z)V

    .line 266
    invoke-virtual {v2, v12}, Ll8/E;->a(Ljava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v3, v17

    const/4 v4, 0x4

    goto/16 :goto_49

    :cond_5b
    move-object/from16 v17, v3

    const/4 v15, -0x1

    const/16 v16, 0x7

    const/16 v20, 0x1

    add-int/lit8 v9, v9, 0x1

    const/4 v4, 0x4

    goto/16 :goto_48

    :cond_5c
    const/4 v9, 0x0

    .line 267
    :goto_55
    iget-object v3, v1, LR1/q;->f:Ljava/lang/Object;

    check-cast v3, Lf6/a0;

    iget v4, v3, Lf6/a0;->a:I

    if-ge v9, v4, :cond_5d

    .line 268
    invoke-virtual {v3, v9}, Lf6/a0;->a(I)Lf6/Z;

    move-result-object v3

    .line 269
    iget v4, v3, Lf6/Z;->a:I

    new-array v4, v4, [I

    const/4 v6, 0x0

    .line 270
    invoke-static {v4, v6}, Ljava/util/Arrays;->fill([II)V

    .line 271
    iget v5, v3, Lf6/Z;->a:I

    new-array v5, v5, [Z

    .line 272
    new-instance v7, LE5/K0;

    invoke-direct {v7, v3, v6, v4, v5}, LE5/K0;-><init>(Lf6/Z;Z[I[Z)V

    .line 273
    invoke-virtual {v2, v7}, Ll8/E;->a(Ljava/lang/Object;)V

    const/16 v20, 0x1

    add-int/lit8 v9, v9, 0x1

    goto :goto_55

    :cond_5d
    const/4 v6, 0x0

    .line 274
    new-instance v3, LE5/L0;

    invoke-virtual {v2}, Ll8/H;->g()Ll8/e0;

    move-result-object v2

    invoke-direct {v3, v2}, LE5/L0;-><init>(Ll8/K;)V

    .line 275
    new-instance v2, Lr6/s;

    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, [LE5/B0;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, [Lr6/n;

    invoke-direct {v2, v4, v0, v3, v1}, Lr6/s;-><init>([LE5/B0;[Lr6/n;LE5/L0;LR1/q;)V

    .line 276
    iget-object v0, v2, Lr6/s;->c:[Lr6/n;

    array-length v1, v0

    move v5, v6

    :goto_56
    if-ge v5, v1, :cond_5f

    aget-object v3, v0, v5

    move/from16 v4, p1

    if-eqz v3, :cond_5e

    .line 277
    invoke-interface {v3, v4}, Lr6/n;->d(F)V

    :cond_5e
    const/16 v20, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_56

    :cond_5f
    return-object v2

    .line 278
    :goto_57
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final h()V
    .locals 6

    .line 1
    iget-object v0, p0, LE5/g0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lf6/c;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, LE5/g0;->f:LE5/h0;

    .line 8
    .line 9
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    iget-wide v4, v1, LE5/h0;->d:J

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
    check-cast v0, Lf6/c;

    .line 23
    .line 24
    const-wide/16 v1, 0x0

    .line 25
    .line 26
    iput-wide v1, v0, Lf6/c;->e:J

    .line 27
    .line 28
    iput-wide v4, v0, Lf6/c;->f:J

    .line 29
    .line 30
    :cond_1
    return-void
.end method
