.class public final LV1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN1/H;
.implements Lk2/M;
.implements LZ1/e;


# instance fields
.field public final a:LQ1/q;

.field public final b:LN1/L;

.field public final c:LN1/M;

.field public final d:LC6/l;

.field public final e:Landroid/util/SparseArray;

.field public f:LQ1/j;

.field public g:LU1/u;

.field public h:LQ1/s;

.field public i:Z


# direct methods
.method public constructor <init>(LQ1/q;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, LV1/d;->a:LQ1/q;

    .line 8
    .line 9
    new-instance v0, LQ1/j;

    .line 10
    .line 11
    sget v1, LQ1/x;->a:I

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    new-instance v2, LV1/b;

    .line 25
    .line 26
    const/4 v3, 0x3

    .line 27
    invoke-direct {v2, v3}, LV1/b;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1, p1, v2}, LQ1/j;-><init>(Landroid/os/Looper;LQ1/q;LQ1/h;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, LV1/d;->f:LQ1/j;

    .line 34
    .line 35
    new-instance p1, LN1/L;

    .line 36
    .line 37
    invoke-direct {p1}, LN1/L;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, LV1/d;->b:LN1/L;

    .line 41
    .line 42
    new-instance v0, LN1/M;

    .line 43
    .line 44
    invoke-direct {v0}, LN1/M;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, LV1/d;->c:LN1/M;

    .line 48
    .line 49
    new-instance v0, LC6/l;

    .line 50
    .line 51
    invoke-direct {v0, p1}, LC6/l;-><init>(LN1/L;)V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, LV1/d;->d:LC6/l;

    .line 55
    .line 56
    new-instance p1, Landroid/util/SparseArray;

    .line 57
    .line 58
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, LV1/d;->e:Landroid/util/SparseArray;

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final A(LN1/F;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LV1/d;->G()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LUc/l;

    .line 6
    .line 7
    const/16 v1, 0xd

    .line 8
    .line 9
    invoke-direct {v0, v1}, LUc/l;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0xc

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final B(ILk2/H;Lh2/g;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LV1/d;->J(ILk2/H;)LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, LV1/b;

    .line 6
    .line 7
    const/16 p3, 0x15

    .line 8
    .line 9
    invoke-direct {p2, p3}, LV1/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 p3, 0x3ed

    .line 13
    .line 14
    invoke-virtual {p0, p1, p3, p2}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final C(LN1/E;)V
    .locals 3

    .line 1
    instance-of v0, p1, LU1/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LU1/j;

    .line 7
    .line 8
    iget-object v0, v0, LU1/j;->h:Lk2/H;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v0}, LV1/d;->I(Lk2/H;)LV1/a;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0}, LV1/d;->G()LV1/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    new-instance v1, LS8/b;

    .line 22
    .line 23
    const/16 v2, 0x8

    .line 24
    .line 25
    invoke-direct {v1, v0, p1, v2}, LS8/b;-><init>(LV1/a;Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    const/16 p1, 0xa

    .line 29
    .line 30
    invoke-virtual {p0, v0, p1, v1}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final D(ILk2/H;Lk2/z;Lh2/g;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LV1/d;->J(ILk2/H;)LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, LV1/b;

    .line 6
    .line 7
    const/16 p3, 0x16

    .line 8
    .line 9
    invoke-direct {p2, p3}, LV1/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 p3, 0x3ea

    .line 13
    .line 14
    invoke-virtual {p0, p1, p3, p2}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final E(LN1/G;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LV1/d;->G()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LUc/l;

    .line 6
    .line 7
    const/16 v1, 0xe

    .line 8
    .line 9
    invoke-direct {v0, v1}, LUc/l;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0xd

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final F(LN1/V;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LV1/d;->G()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LUc/l;

    .line 6
    .line 7
    const/16 v1, 0x17

    .line 8
    .line 9
    invoke-direct {v0, v1}, LUc/l;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-virtual {p0, p1, v1, v0}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final G()LV1/a;
    .locals 1

    .line 1
    iget-object v0, p0, LV1/d;->d:LC6/l;

    .line 2
    .line 3
    iget-object v0, v0, LC6/l;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lk2/H;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, LV1/d;->I(Lk2/H;)LV1/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final H(LN1/N;ILk2/H;)LV1/a;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    move/from16 v5, p2

    .line 6
    .line 7
    invoke-virtual {v4}, LN1/N;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    move-object v6, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object/from16 v6, p3

    .line 17
    .line 18
    :goto_0
    iget-object v1, v0, LV1/d;->a:LQ1/q;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    iget-object v1, v0, LV1/d;->g:LU1/u;

    .line 28
    .line 29
    invoke-virtual {v1}, LU1/u;->o0()LN1/N;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v4, v1}, LN1/N;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget-object v1, v0, LV1/d;->g:LU1/u;

    .line 40
    .line 41
    invoke-virtual {v1}, LU1/u;->l0()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-ne v5, v1, :cond_1

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const/4 v1, 0x0

    .line 50
    :goto_1
    const-wide/16 v7, 0x0

    .line 51
    .line 52
    if-eqz v6, :cond_2

    .line 53
    .line 54
    invoke-virtual {v6}, Lk2/H;->b()Z

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    if-eqz v9, :cond_2

    .line 59
    .line 60
    if-eqz v1, :cond_5

    .line 61
    .line 62
    iget-object v1, v0, LV1/d;->g:LU1/u;

    .line 63
    .line 64
    invoke-virtual {v1}, LU1/u;->j0()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    iget v9, v6, Lk2/H;->b:I

    .line 69
    .line 70
    if-ne v1, v9, :cond_5

    .line 71
    .line 72
    iget-object v1, v0, LV1/d;->g:LU1/u;

    .line 73
    .line 74
    invoke-virtual {v1}, LU1/u;->k0()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    iget v9, v6, Lk2/H;->c:I

    .line 79
    .line 80
    if-ne v1, v9, :cond_5

    .line 81
    .line 82
    iget-object v1, v0, LV1/d;->g:LU1/u;

    .line 83
    .line 84
    invoke-virtual {v1}, LU1/u;->m0()J

    .line 85
    .line 86
    .line 87
    move-result-wide v7

    .line 88
    goto :goto_2

    .line 89
    :cond_2
    if-eqz v1, :cond_3

    .line 90
    .line 91
    iget-object v1, v0, LV1/d;->g:LU1/u;

    .line 92
    .line 93
    invoke-virtual {v1}, LU1/u;->S0()V

    .line 94
    .line 95
    .line 96
    iget-object v7, v1, LU1/u;->d0:LU1/P;

    .line 97
    .line 98
    invoke-virtual {v1, v7}, LU1/u;->i0(LU1/P;)J

    .line 99
    .line 100
    .line 101
    move-result-wide v7

    .line 102
    goto :goto_2

    .line 103
    :cond_3
    invoke-virtual {v4}, LN1/N;->p()Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_4

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_4
    iget-object v1, v0, LV1/d;->c:LN1/M;

    .line 111
    .line 112
    invoke-virtual {v4, v5, v1, v7, v8}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    iget-wide v7, v1, LN1/M;->l:J

    .line 117
    .line 118
    invoke-static {v7, v8}, LQ1/x;->W(J)J

    .line 119
    .line 120
    .line 121
    move-result-wide v7

    .line 122
    :cond_5
    :goto_2
    iget-object v1, v0, LV1/d;->d:LC6/l;

    .line 123
    .line 124
    iget-object v1, v1, LC6/l;->d:Ljava/lang/Object;

    .line 125
    .line 126
    move-object v11, v1

    .line 127
    check-cast v11, Lk2/H;

    .line 128
    .line 129
    new-instance v1, LV1/a;

    .line 130
    .line 131
    iget-object v9, v0, LV1/d;->g:LU1/u;

    .line 132
    .line 133
    invoke-virtual {v9}, LU1/u;->o0()LN1/N;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    iget-object v10, v0, LV1/d;->g:LU1/u;

    .line 138
    .line 139
    invoke-virtual {v10}, LU1/u;->l0()I

    .line 140
    .line 141
    .line 142
    move-result v10

    .line 143
    iget-object v12, v0, LV1/d;->g:LU1/u;

    .line 144
    .line 145
    invoke-virtual {v12}, LU1/u;->m0()J

    .line 146
    .line 147
    .line 148
    move-result-wide v12

    .line 149
    iget-object v14, v0, LV1/d;->g:LU1/u;

    .line 150
    .line 151
    invoke-virtual {v14}, LU1/u;->S0()V

    .line 152
    .line 153
    .line 154
    iget-object v14, v14, LU1/u;->d0:LU1/P;

    .line 155
    .line 156
    iget-wide v14, v14, LU1/P;->r:J

    .line 157
    .line 158
    invoke-static {v14, v15}, LQ1/x;->W(J)J

    .line 159
    .line 160
    .line 161
    move-result-wide v14

    .line 162
    invoke-direct/range {v1 .. v15}, LV1/a;-><init>(JLN1/N;ILk2/H;JLN1/N;ILk2/H;JJ)V

    .line 163
    .line 164
    .line 165
    return-object v1
.end method

.method public final I(Lk2/H;)LV1/a;
    .locals 3

    .line 1
    iget-object v0, p0, LV1/d;->g:LU1/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v1, p0, LV1/d;->d:LC6/l;

    .line 12
    .line 13
    iget-object v1, v1, LC6/l;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ll8/j0;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, LN1/N;

    .line 22
    .line 23
    :goto_0
    if-eqz p1, :cond_2

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    iget-object v0, p1, Lk2/H;->a:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v2, p0, LV1/d;->b:LN1/L;

    .line 31
    .line 32
    invoke-virtual {v1, v0, v2}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget v0, v0, LN1/L;->c:I

    .line 37
    .line 38
    invoke-virtual {p0, v1, v0, p1}, LV1/d;->H(LN1/N;ILk2/H;)LV1/a;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_2
    :goto_1
    iget-object p1, p0, LV1/d;->g:LU1/u;

    .line 44
    .line 45
    invoke-virtual {p1}, LU1/u;->l0()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iget-object v1, p0, LV1/d;->g:LU1/u;

    .line 50
    .line 51
    invoke-virtual {v1}, LU1/u;->o0()LN1/N;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, LN1/N;->o()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-ge p1, v2, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    sget-object v1, LN1/N;->a:LN1/K;

    .line 63
    .line 64
    :goto_2
    invoke-virtual {p0, v1, p1, v0}, LV1/d;->H(LN1/N;ILk2/H;)LV1/a;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1
.end method

.method public final J(ILk2/H;)LV1/a;
    .locals 1

    .line 1
    iget-object v0, p0, LV1/d;->g:LU1/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, LV1/d;->d:LC6/l;

    .line 9
    .line 10
    iget-object v0, v0, LC6/l;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ll8/j0;

    .line 13
    .line 14
    invoke-virtual {v0, p2}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, LN1/N;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, p2}, LV1/d;->I(Lk2/H;)LV1/a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    sget-object v0, LN1/N;->a:LN1/K;

    .line 28
    .line 29
    invoke-virtual {p0, v0, p1, p2}, LV1/d;->H(LN1/N;ILk2/H;)LV1/a;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_1
    iget-object p2, p0, LV1/d;->g:LU1/u;

    .line 35
    .line 36
    invoke-virtual {p2}, LU1/u;->o0()LN1/N;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p2}, LN1/N;->o()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-ge p1, v0, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    sget-object p2, LN1/N;->a:LN1/K;

    .line 48
    .line 49
    :goto_0
    const/4 v0, 0x0

    .line 50
    invoke-virtual {p0, p2, p1, v0}, LV1/d;->H(LN1/N;ILk2/H;)LV1/a;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1
.end method

.method public final K()LV1/a;
    .locals 1

    .line 1
    iget-object v0, p0, LV1/d;->d:LC6/l;

    .line 2
    .line 3
    iget-object v0, v0, LC6/l;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lk2/H;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, LV1/d;->I(Lk2/H;)LV1/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final L(LV1/a;ILQ1/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, LV1/d;->e:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LV1/d;->f:LQ1/j;

    .line 7
    .line 8
    invoke-virtual {p1, p2, p3}, LQ1/j;->e(ILQ1/g;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final M(LU1/u;Landroid/os/Looper;)V
    .locals 7

    .line 1
    iget-object v0, p0, LV1/d;->g:LU1/u;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LV1/d;->d:LC6/l;

    .line 6
    .line 7
    iget-object v0, v0, LC6/l;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ll8/K;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    :goto_1
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, LV1/d;->g:LU1/u;

    .line 28
    .line 29
    iget-object v0, p0, LV1/d;->a:LQ1/q;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-virtual {v0, p2, v1}, LQ1/q;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)LQ1/s;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, LV1/d;->h:LQ1/s;

    .line 37
    .line 38
    iget-object v0, p0, LV1/d;->f:LQ1/j;

    .line 39
    .line 40
    new-instance v5, LA5/h;

    .line 41
    .line 42
    const/16 v1, 0x14

    .line 43
    .line 44
    invoke-direct {v5, v1, p0, p1}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    new-instance v1, LQ1/j;

    .line 48
    .line 49
    iget-object v2, v0, LQ1/j;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 50
    .line 51
    iget-boolean v6, v0, LQ1/j;->i:Z

    .line 52
    .line 53
    iget-object v4, v0, LQ1/j;->a:LQ1/q;

    .line 54
    .line 55
    move-object v3, p2

    .line 56
    invoke-direct/range {v1 .. v6}, LQ1/j;-><init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;LQ1/q;LQ1/h;Z)V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, LV1/d;->f:LQ1/j;

    .line 60
    .line 61
    return-void
.end method

.method public final a(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LV1/d;->G()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LUc/l;

    .line 6
    .line 7
    const/16 v1, 0x1b

    .line 8
    .line 9
    invoke-direct {v0, v1}, LUc/l;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x6

    .line 13
    invoke-virtual {p0, p1, v1, v0}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final b(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LV1/d;->G()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LV1/b;

    .line 6
    .line 7
    const/4 v1, 0x6

    .line 8
    invoke-direct {v0, v1}, LV1/b;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    invoke-virtual {p0, p1, v1, v0}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final c(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LV1/d;->G()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LV1/b;

    .line 6
    .line 7
    const/16 v1, 0x10

    .line 8
    .line 9
    invoke-direct {v0, v1}, LV1/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x9

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final d(I)V
    .locals 4

    .line 1
    iget-object p1, p0, LV1/d;->g:LU1/u;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LV1/d;->d:LC6/l;

    .line 7
    .line 8
    iget-object v1, v0, LC6/l;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ll8/K;

    .line 11
    .line 12
    iget-object v2, v0, LC6/l;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lk2/H;

    .line 15
    .line 16
    iget-object v3, v0, LC6/l;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, LN1/L;

    .line 19
    .line 20
    invoke-static {p1, v1, v2, v3}, LC6/l;->r(LU1/u;Ll8/K;Lk2/H;LN1/L;)Lk2/H;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iput-object v1, v0, LC6/l;->d:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {p1}, LU1/u;->o0()LN1/N;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {v0, p1}, LC6/l;->F(LN1/N;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, LV1/d;->G()LV1/a;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v0, LUc/l;

    .line 38
    .line 39
    const/16 v1, 0xf

    .line 40
    .line 41
    invoke-direct {v0, v1}, LUc/l;-><init>(I)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-virtual {p0, p1, v1, v0}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final e(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LV1/d;->K()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LUc/l;

    .line 6
    .line 7
    const/16 v1, 0x11

    .line 8
    .line 9
    invoke-direct {v0, v1}, LUc/l;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x17

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final f(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LV1/d;->G()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LE5/C;

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    invoke-direct {v1, v0, p1, v2}, LE5/C;-><init>(Ljava/lang/Object;Ljava/util/List;I)V

    .line 9
    .line 10
    .line 11
    const/16 p1, 0x1b

    .line 12
    .line 13
    invoke-virtual {p0, v0, p1, v1}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final g(II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LV1/d;->K()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, LV1/b;

    .line 6
    .line 7
    const/16 v0, 0x11

    .line 8
    .line 9
    invoke-direct {p2, v0}, LV1/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v0, 0x18

    .line 13
    .line 14
    invoke-virtual {p0, p1, v0, p2}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final h(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LV1/d;->G()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LV1/b;

    .line 6
    .line 7
    const/16 v1, 0x1c

    .line 8
    .line 9
    invoke-direct {v0, v1}, LV1/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    invoke-virtual {p0, p1, v1, v0}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final i(IZ)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LV1/d;->G()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, LV1/b;

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {p2, v0}, LV1/b;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x5

    .line 12
    invoke-virtual {p0, p1, v0, p2}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final j(F)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LV1/d;->K()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LUc/l;

    .line 6
    .line 7
    const/16 v1, 0x12

    .line 8
    .line 9
    invoke-direct {v0, v1}, LUc/l;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x16

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final k(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LV1/d;->G()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LV1/b;

    .line 6
    .line 7
    const/16 v1, 0xc

    .line 8
    .line 9
    invoke-direct {v0, v1}, LV1/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final l(IZ)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LV1/d;->G()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, LUc/l;

    .line 6
    .line 7
    const/16 v0, 0x14

    .line 8
    .line 9
    invoke-direct {p2, v0}, LUc/l;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v0, -0x1

    .line 13
    invoke-virtual {p0, p1, v0, p2}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final m(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LV1/d;->G()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LUc/l;

    .line 6
    .line 7
    const/16 v1, 0x19

    .line 8
    .line 9
    invoke-direct {v0, v1}, LUc/l;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x7

    .line 13
    invoke-virtual {p0, p1, v1, v0}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final n(Ln2/i;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LV1/d;->G()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LV1/b;

    .line 6
    .line 7
    invoke-direct {v1, v0, p1}, LV1/b;-><init>(LV1/a;Ln2/i;)V

    .line 8
    .line 9
    .line 10
    const/16 p1, 0x13

    .line 11
    .line 12
    invoke-virtual {p0, v0, p1, v1}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final o(LN1/B;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LV1/d;->G()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LUc/l;

    .line 6
    .line 7
    const/16 v1, 0x16

    .line 8
    .line 9
    invoke-direct {v0, v1}, LUc/l;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x1c

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final p(LN1/Y;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LV1/d;->K()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LU1/q;

    .line 6
    .line 7
    invoke-direct {v1, v0, p1}, LU1/q;-><init>(LV1/a;LN1/Y;)V

    .line 8
    .line 9
    .line 10
    const/16 p1, 0x19

    .line 11
    .line 12
    invoke-virtual {p0, v0, p1, v1}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final q(ILk2/H;Lh2/g;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, LV1/d;->J(ILk2/H;)LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, LA5/h;

    .line 6
    .line 7
    const/16 v0, 0x15

    .line 8
    .line 9
    invoke-direct {p2, v0, p1, p3}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/16 p3, 0x3ec

    .line 13
    .line 14
    invoke-virtual {p0, p1, p3, p2}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final r(ILk2/H;Lk2/z;Lh2/g;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LV1/d;->J(ILk2/H;)LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, LV1/b;

    .line 6
    .line 7
    const/16 p3, 0x17

    .line 8
    .line 9
    invoke-direct {p2, p3}, LV1/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 p3, 0x3e9

    .line 13
    .line 14
    invoke-virtual {p0, p1, p3, p2}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final s(ILk2/H;Lk2/z;Lh2/g;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LV1/d;->J(ILk2/H;)LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    new-instance p1, LS8/b;

    .line 6
    .line 7
    invoke-direct/range {p1 .. p6}, LS8/b;-><init>(LV1/a;Lk2/z;Lh2/g;Ljava/io/IOException;Z)V

    .line 8
    .line 9
    .line 10
    const/16 p3, 0x3eb

    .line 11
    .line 12
    invoke-virtual {p0, p2, p3, p1}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final t(LN1/I;LN1/I;I)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p3, v0, :cond_0

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LV1/d;->i:Z

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, LV1/d;->g:LU1/u;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, LV1/d;->d:LC6/l;

    .line 13
    .line 14
    iget-object v2, v1, LC6/l;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Ll8/K;

    .line 17
    .line 18
    iget-object v3, v1, LC6/l;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Lk2/H;

    .line 21
    .line 22
    iget-object v4, v1, LC6/l;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v4, LN1/L;

    .line 25
    .line 26
    invoke-static {v0, v2, v3, v4}, LC6/l;->r(LU1/u;Ll8/K;Lk2/H;LN1/L;)Lk2/H;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, v1, LC6/l;->d:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-virtual {p0}, LV1/d;->G()LV1/a;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    new-instance v2, LE5/v;

    .line 37
    .line 38
    const/4 v4, 0x3

    .line 39
    move-object v6, p1

    .line 40
    move-object v7, p2

    .line 41
    move v3, p3

    .line 42
    invoke-direct/range {v2 .. v7}, LE5/v;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const/16 p1, 0xb

    .line 46
    .line 47
    invoke-virtual {p0, v5, p1, v2}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final u(LP1/c;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LV1/d;->G()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LV1/b;

    .line 6
    .line 7
    const/16 v1, 0xb

    .line 8
    .line 9
    invoke-direct {v0, v1}, LV1/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x1b

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final v(LN1/c;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LV1/d;->K()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LUc/l;

    .line 6
    .line 7
    const/16 v1, 0x15

    .line 8
    .line 9
    invoke-direct {v0, v1}, LUc/l;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x14

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final w(LN1/z;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LV1/d;->G()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LV1/b;

    .line 6
    .line 7
    const/16 v1, 0x14

    .line 8
    .line 9
    invoke-direct {v0, v1}, LV1/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0xe

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final x(LN1/E;)V
    .locals 2

    .line 1
    instance-of v0, p1, LU1/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LU1/j;

    .line 6
    .line 7
    iget-object p1, p1, LU1/j;->h:Lk2/H;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, LV1/d;->I(Lk2/H;)LV1/a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, LV1/d;->G()LV1/a;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    new-instance v0, LV1/b;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, v1}, LV1/b;-><init>(I)V

    .line 24
    .line 25
    .line 26
    const/16 v1, 0xa

    .line 27
    .line 28
    invoke-virtual {p0, p1, v1, v0}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final y(ILk2/H;Lk2/z;Lh2/g;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LV1/d;->J(ILk2/H;)LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, LV1/c;

    .line 6
    .line 7
    const/4 p3, 0x0

    .line 8
    invoke-direct {p2, p3}, LV1/c;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/16 p3, 0x3e8

    .line 12
    .line 13
    invoke-virtual {p0, p1, p3, p2}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final z(LN1/w;I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LV1/d;->G()LV1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, LUc/l;

    .line 6
    .line 7
    const/16 v0, 0x10

    .line 8
    .line 9
    invoke-direct {p2, v0}, LUc/l;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p0, p1, v0, p2}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
