.class public final LF5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/u0;
.implements Lf6/D;
.implements LI5/g;


# instance fields
.field public final a:Lu6/q;

.field public final b:LE5/H0;

.field public final c:LE5/I0;

.field public final d:LC6/l;

.field public final e:Landroid/util/SparseArray;

.field public f:LK8/H;

.field public g:LE5/I;

.field public h:Lu6/s;

.field public i:Z


# direct methods
.method public constructor <init>(Lu6/q;)V
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
    iput-object p1, p0, LF5/f;->a:Lu6/q;

    .line 8
    .line 9
    new-instance v0, LK8/H;

    .line 10
    .line 11
    sget v1, Lu6/v;->a:I

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
    new-instance v2, LF5/b;

    .line 25
    .line 26
    const/4 v3, 0x5

    .line 27
    invoke-direct {v2, v3}, LF5/b;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, v1, p1, v2}, LK8/H;-><init>(Landroid/os/Looper;Lu6/q;Lu6/h;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, LF5/f;->f:LK8/H;

    .line 34
    .line 35
    new-instance p1, LE5/H0;

    .line 36
    .line 37
    invoke-direct {p1}, LE5/H0;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, LF5/f;->b:LE5/H0;

    .line 41
    .line 42
    new-instance v0, LE5/I0;

    .line 43
    .line 44
    invoke-direct {v0}, LE5/I0;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, LF5/f;->c:LE5/I0;

    .line 48
    .line 49
    new-instance v0, LC6/l;

    .line 50
    .line 51
    invoke-direct {v0, p1}, LC6/l;-><init>(LE5/H0;)V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, LF5/f;->d:LC6/l;

    .line 55
    .line 56
    new-instance p1, Landroid/util/SparseArray;

    .line 57
    .line 58
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, LF5/f;->e:Landroid/util/SparseArray;

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final A(ILf6/z;Lf6/p;Lf6/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LF5/f;->M(ILf6/z;)LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, LF5/b;

    .line 6
    .line 7
    const/16 p3, 0x19

    .line 8
    .line 9
    invoke-direct {p2, p3}, LF5/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 p3, 0x3ea

    .line 13
    .line 14
    invoke-virtual {p0, p1, p3, p2}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final B()V
    .locals 3

    .line 1
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LA5/f;

    .line 6
    .line 7
    const/16 v2, 0x19

    .line 8
    .line 9
    invoke-direct {v1, v2}, LA5/f;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v2, -0x1

    .line 13
    invoke-virtual {p0, v0, v2, v1}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final C(ILf6/z;Lf6/p;Lf6/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LF5/f;->M(ILf6/z;)LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, LF5/b;

    .line 6
    .line 7
    const/16 p3, 0x1c

    .line 8
    .line 9
    invoke-direct {p2, p3}, LF5/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 p3, 0x3e9

    .line 13
    .line 14
    invoke-virtual {p0, p1, p3, p2}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final D(ILf6/z;Lf6/p;Lf6/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LF5/f;->M(ILf6/z;)LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, LF5/b;

    .line 6
    .line 7
    const/16 p3, 0x18

    .line 8
    .line 9
    invoke-direct {p2, p3}, LF5/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 p3, 0x3e8

    .line 13
    .line 14
    invoke-virtual {p0, p1, p3, p2}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final E(LE5/d0;I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, LA5/f;

    .line 6
    .line 7
    const/16 v0, 0x1b

    .line 8
    .line 9
    invoke-direct {p2, v0}, LA5/f;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p0, p1, v0, p2}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final F(Lh6/c;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LA5/f;

    .line 6
    .line 7
    const/16 v1, 0x1c

    .line 8
    .line 9
    invoke-direct {v0, v1}, LA5/f;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x1b

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final G(LE5/o;)V
    .locals 2

    .line 1
    instance-of v0, p1, LE5/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p1, LE5/o;->h:Lf6/x;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    new-instance v0, Lf6/z;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lf6/x;-><init>(Lf6/x;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, LF5/f;->L(Lf6/z;)LF5/a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_0
    new-instance v0, LF5/b;

    .line 24
    .line 25
    const/16 v1, 0xc

    .line 26
    .line 27
    invoke-direct {v0, v1}, LF5/b;-><init>(I)V

    .line 28
    .line 29
    .line 30
    const/16 v1, 0xa

    .line 31
    .line 32
    invoke-virtual {p0, p1, v1, v0}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final H(ILf6/z;Lf6/u;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, LF5/f;->M(ILf6/z;)LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, LA5/h;

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    invoke-direct {p2, v0, p1, p3}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/16 p3, 0x3ec

    .line 12
    .line 13
    invoke-virtual {p0, p1, p3, p2}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final I(LE5/f0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LF5/d;

    .line 6
    .line 7
    const/4 v1, 0x6

    .line 8
    invoke-direct {v0, v1}, LF5/d;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/16 v1, 0xe

    .line 12
    .line 13
    invoke-virtual {p0, p1, v1, v0}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final J()LF5/a;
    .locals 1

    .line 1
    iget-object v0, p0, LF5/f;->d:LC6/l;

    .line 2
    .line 3
    iget-object v0, v0, LC6/l;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lf6/z;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, LF5/f;->L(Lf6/z;)LF5/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final K(LE5/J0;ILf6/z;)LF5/a;
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
    invoke-virtual {v4}, LE5/J0;->p()Z

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
    iget-object v1, v0, LF5/f;->a:Lu6/q;

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
    iget-object v1, v0, LF5/f;->g:LE5/I;

    .line 28
    .line 29
    invoke-virtual {v1}, LE5/I;->o0()LE5/J0;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v4, v1}, LE5/J0;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget-object v1, v0, LF5/f;->g:LE5/I;

    .line 40
    .line 41
    invoke-virtual {v1}, LE5/I;->l0()I

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
    invoke-virtual {v6}, Lf6/x;->a()Z

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
    iget-object v1, v0, LF5/f;->g:LE5/I;

    .line 63
    .line 64
    invoke-virtual {v1}, LE5/I;->j0()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    iget v9, v6, Lf6/x;->b:I

    .line 69
    .line 70
    if-ne v1, v9, :cond_5

    .line 71
    .line 72
    iget-object v1, v0, LF5/f;->g:LE5/I;

    .line 73
    .line 74
    invoke-virtual {v1}, LE5/I;->k0()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    iget v9, v6, Lf6/x;->c:I

    .line 79
    .line 80
    if-ne v1, v9, :cond_5

    .line 81
    .line 82
    iget-object v1, v0, LF5/f;->g:LE5/I;

    .line 83
    .line 84
    invoke-virtual {v1}, LE5/I;->m0()J

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
    iget-object v1, v0, LF5/f;->g:LE5/I;

    .line 92
    .line 93
    invoke-virtual {v1}, LE5/I;->i0()J

    .line 94
    .line 95
    .line 96
    move-result-wide v7

    .line 97
    goto :goto_2

    .line 98
    :cond_3
    invoke-virtual {v4}, LE5/J0;->p()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_4

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    iget-object v1, v0, LF5/f;->c:LE5/I0;

    .line 106
    .line 107
    invoke-virtual {v4, v5, v1, v7, v8}, LE5/J0;->m(ILE5/I0;J)LE5/I0;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget-wide v7, v1, LE5/I0;->l:J

    .line 112
    .line 113
    invoke-static {v7, v8}, Lu6/v;->F(J)J

    .line 114
    .line 115
    .line 116
    move-result-wide v7

    .line 117
    :cond_5
    :goto_2
    iget-object v1, v0, LF5/f;->d:LC6/l;

    .line 118
    .line 119
    iget-object v1, v1, LC6/l;->d:Ljava/lang/Object;

    .line 120
    .line 121
    move-object v11, v1

    .line 122
    check-cast v11, Lf6/z;

    .line 123
    .line 124
    new-instance v1, LF5/a;

    .line 125
    .line 126
    iget-object v9, v0, LF5/f;->g:LE5/I;

    .line 127
    .line 128
    invoke-virtual {v9}, LE5/I;->o0()LE5/J0;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    iget-object v10, v0, LF5/f;->g:LE5/I;

    .line 133
    .line 134
    invoke-virtual {v10}, LE5/I;->l0()I

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    iget-object v12, v0, LF5/f;->g:LE5/I;

    .line 139
    .line 140
    invoke-virtual {v12}, LE5/I;->m0()J

    .line 141
    .line 142
    .line 143
    move-result-wide v12

    .line 144
    iget-object v14, v0, LF5/f;->g:LE5/I;

    .line 145
    .line 146
    invoke-virtual {v14}, LE5/I;->Q0()V

    .line 147
    .line 148
    .line 149
    iget-object v14, v14, LE5/I;->j0:LE5/q0;

    .line 150
    .line 151
    iget-wide v14, v14, LE5/q0;->q:J

    .line 152
    .line 153
    invoke-static {v14, v15}, Lu6/v;->F(J)J

    .line 154
    .line 155
    .line 156
    move-result-wide v14

    .line 157
    invoke-direct/range {v1 .. v15}, LF5/a;-><init>(JLE5/J0;ILf6/z;JLE5/J0;ILf6/z;JJ)V

    .line 158
    .line 159
    .line 160
    return-object v1
.end method

.method public final L(Lf6/z;)LF5/a;
    .locals 3

    .line 1
    iget-object v0, p0, LF5/f;->g:LE5/I;

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
    iget-object v1, p0, LF5/f;->d:LC6/l;

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
    check-cast v1, LE5/J0;

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
    iget-object v0, p1, Lf6/x;->a:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v2, p0, LF5/f;->b:LE5/H0;

    .line 31
    .line 32
    invoke-virtual {v1, v0, v2}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget v0, v0, LE5/H0;->c:I

    .line 37
    .line 38
    invoke-virtual {p0, v1, v0, p1}, LF5/f;->K(LE5/J0;ILf6/z;)LF5/a;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_2
    :goto_1
    iget-object p1, p0, LF5/f;->g:LE5/I;

    .line 44
    .line 45
    invoke-virtual {p1}, LE5/I;->l0()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iget-object v1, p0, LF5/f;->g:LE5/I;

    .line 50
    .line 51
    invoke-virtual {v1}, LE5/I;->o0()LE5/J0;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, LE5/J0;->o()I

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
    sget-object v1, LE5/J0;->a:LE5/G0;

    .line 63
    .line 64
    :goto_2
    invoke-virtual {p0, v1, p1, v0}, LF5/f;->K(LE5/J0;ILf6/z;)LF5/a;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1
.end method

.method public final M(ILf6/z;)LF5/a;
    .locals 2

    .line 1
    iget-object v0, p0, LF5/f;->g:LE5/I;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, LE5/J0;->a:LE5/G0;

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, LF5/f;->d:LC6/l;

    .line 11
    .line 12
    iget-object v1, v1, LC6/l;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ll8/j0;

    .line 15
    .line 16
    invoke-virtual {v1, p2}, Ll8/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, LE5/J0;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, p2}, LF5/f;->L(Lf6/z;)LF5/a;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_0
    invoke-virtual {p0, v0, p1, p2}, LF5/f;->K(LE5/J0;ILf6/z;)LF5/a;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_1
    iget-object p2, p0, LF5/f;->g:LE5/I;

    .line 35
    .line 36
    invoke-virtual {p2}, LE5/I;->o0()LE5/J0;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p2}, LE5/J0;->o()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-ge p1, v1, :cond_2

    .line 45
    .line 46
    move-object v0, p2

    .line 47
    :cond_2
    const/4 p2, 0x0

    .line 48
    invoke-virtual {p0, v0, p1, p2}, LF5/f;->K(LE5/J0;ILf6/z;)LF5/a;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1
.end method

.method public final N()LF5/a;
    .locals 1

    .line 1
    iget-object v0, p0, LF5/f;->d:LC6/l;

    .line 2
    .line 3
    iget-object v0, v0, LC6/l;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lf6/z;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, LF5/f;->L(Lf6/z;)LF5/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final O(LF5/a;ILu6/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, LF5/f;->e:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LF5/f;->f:LK8/H;

    .line 7
    .line 8
    invoke-virtual {p1, p2, p3}, LK8/H;->p(ILu6/g;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final P(LE5/I;Landroid/os/Looper;)V
    .locals 3

    .line 1
    iget-object v0, p0, LF5/f;->g:LE5/I;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LF5/f;->d:LC6/l;

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
    invoke-static {v0}, Lu6/a;->i(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, LF5/f;->g:LE5/I;

    .line 28
    .line 29
    iget-object v0, p0, LF5/f;->a:Lu6/q;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-virtual {v0, p2, v1}, Lu6/q;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lu6/s;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, LF5/f;->h:Lu6/s;

    .line 37
    .line 38
    iget-object v0, p0, LF5/f;->f:LK8/H;

    .line 39
    .line 40
    new-instance v1, LA5/h;

    .line 41
    .line 42
    const/4 v2, 0x2

    .line 43
    invoke-direct {v1, v2, p0, p1}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance p1, LK8/H;

    .line 47
    .line 48
    iget-object v2, v0, LK8/H;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 51
    .line 52
    iget-object v0, v0, LK8/H;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Lu6/q;

    .line 55
    .line 56
    invoke-direct {p1, v2, p2, v0, v1}, LK8/H;-><init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;Lu6/q;Lu6/h;)V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, LF5/f;->f:LK8/H;

    .line 60
    .line 61
    return-void
.end method

.method public final a(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LF5/b;

    .line 6
    .line 7
    const/16 v1, 0xd

    .line 8
    .line 9
    invoke-direct {v0, v1}, LF5/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x6

    .line 13
    invoke-virtual {p0, p1, v1, v0}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final b(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LF5/b;

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    invoke-direct {v0, v1}, LF5/b;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    invoke-virtual {p0, p1, v1, v0}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final c(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LF5/d;

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    invoke-direct {v0, v1}, LF5/d;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x9

    .line 12
    .line 13
    invoke-virtual {p0, p1, v1, v0}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final d(I)V
    .locals 4

    .line 1
    iget-object p1, p0, LF5/f;->g:LE5/I;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LF5/f;->d:LC6/l;

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
    check-cast v2, Lf6/z;

    .line 15
    .line 16
    iget-object v3, v0, LC6/l;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, LE5/H0;

    .line 19
    .line 20
    invoke-static {p1, v1, v2, v3}, LC6/l;->q(LE5/I;Ll8/K;Lf6/z;LE5/H0;)Lf6/z;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iput-object v1, v0, LC6/l;->d:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {p1}, LE5/I;->o0()LE5/J0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {v0, p1}, LC6/l;->E(LE5/J0;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v0, LF5/b;

    .line 38
    .line 39
    const/16 v1, 0x11

    .line 40
    .line 41
    invoke-direct {v0, v1}, LF5/b;-><init>(I)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-virtual {p0, p1, v1, v0}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final e(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LF5/f;->N()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LF5/d;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1}, LF5/d;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x17

    .line 12
    .line 13
    invoke-virtual {p0, p1, v1, v0}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final f(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LE5/C;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v0, p1, v2}, LE5/C;-><init>(Ljava/lang/Object;Ljava/util/List;I)V

    .line 9
    .line 10
    .line 11
    const/16 p1, 0x1b

    .line 12
    .line 13
    invoke-virtual {p0, v0, p1, v1}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final g(II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LF5/f;->N()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, LA5/f;

    .line 6
    .line 7
    const/16 v0, 0x1a

    .line 8
    .line 9
    invoke-direct {p2, v0}, LA5/f;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v0, 0x18

    .line 13
    .line 14
    invoke-virtual {p0, p1, v0, p2}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final h(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LF5/b;

    .line 6
    .line 7
    const/16 v1, 0x12

    .line 8
    .line 9
    invoke-direct {v0, v1}, LF5/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    invoke-virtual {p0, p1, v1, v0}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final i(IZ)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, LA5/f;

    .line 6
    .line 7
    const/16 v0, 0x1d

    .line 8
    .line 9
    invoke-direct {p2, v0}, LA5/f;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x5

    .line 13
    invoke-virtual {p0, p1, v0, p2}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final j(F)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LF5/f;->N()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LF5/b;

    .line 6
    .line 7
    const/16 v1, 0x13

    .line 8
    .line 9
    invoke-direct {v0, v1}, LF5/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x16

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final k(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LF5/b;

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-direct {v0, v1}, LF5/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final l(IZ)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, LA5/f;

    .line 6
    .line 7
    const/16 v0, 0x17

    .line 8
    .line 9
    invoke-direct {p2, v0}, LA5/f;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v0, -0x1

    .line 13
    invoke-virtual {p0, p1, v0, p2}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final m(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LF5/b;

    .line 6
    .line 7
    const/16 v1, 0x1b

    .line 8
    .line 9
    invoke-direct {v0, v1}, LF5/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x7

    .line 13
    invoke-virtual {p0, p1, v1, v0}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final n(LE5/t0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final o(ILf6/z;Lf6/p;Lf6/u;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LF5/f;->M(ILf6/z;)LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    new-instance p1, LB8/b;

    .line 6
    .line 7
    invoke-direct/range {p1 .. p6}, LB8/b;-><init>(LF5/a;Lf6/p;Lf6/u;Ljava/io/IOException;Z)V

    .line 8
    .line 9
    .line 10
    const/16 p3, 0x3eb

    .line 11
    .line 12
    invoke-virtual {p0, p2, p3, p1}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final p(LE5/v0;LE5/v0;I)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p3, v0, :cond_0

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LF5/f;->i:Z

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, LF5/f;->g:LE5/I;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, LF5/f;->d:LC6/l;

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
    check-cast v3, Lf6/z;

    .line 21
    .line 22
    iget-object v4, v1, LC6/l;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v4, LE5/H0;

    .line 25
    .line 26
    invoke-static {v0, v2, v3, v4}, LC6/l;->q(LE5/I;Ll8/K;Lf6/z;LE5/H0;)Lf6/z;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, v1, LC6/l;->d:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    new-instance v2, LE5/v;

    .line 37
    .line 38
    const/4 v4, 0x1

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
    invoke-virtual {p0, v5, p1, v2}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final q(LE5/s0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LF5/b;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, v1}, LF5/b;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/16 v1, 0xd

    .line 12
    .line 13
    invoke-virtual {p0, p1, v1, v0}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final r(LE5/r0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LA5/f;

    .line 6
    .line 7
    const/16 v1, 0x16

    .line 8
    .line 9
    invoke-direct {v0, v1}, LA5/f;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0xc

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final s(LE5/n;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LF5/b;

    .line 6
    .line 7
    const/16 v1, 0x14

    .line 8
    .line 9
    invoke-direct {v0, v1}, LF5/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x1d

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final t(IZ)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, LF5/b;

    .line 6
    .line 7
    const/16 v0, 0x15

    .line 8
    .line 9
    invoke-direct {p2, v0}, LF5/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v0, 0x1e

    .line 13
    .line 14
    invoke-virtual {p0, p1, v0, p2}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final u(LE5/L0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LF5/b;

    .line 6
    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    invoke-direct {v0, v1}, LF5/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-virtual {p0, p1, v1, v0}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final v(Lr6/r;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LF5/d;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, v1}, LF5/d;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x13

    .line 12
    .line 13
    invoke-virtual {p0, p1, v1, v0}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final w()V
    .locals 0

    .line 1
    return-void
.end method

.method public final x(Lv6/o;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LF5/f;->N()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LE5/E;

    .line 6
    .line 7
    invoke-direct {v1, v0, p1}, LE5/E;-><init>(LF5/a;Lv6/o;)V

    .line 8
    .line 9
    .line 10
    const/16 p1, 0x19

    .line 11
    .line 12
    invoke-virtual {p0, v0, p1, v1}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final y(LE5/o;)V
    .locals 3

    .line 1
    instance-of v0, p1, LE5/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, LE5/o;->h:Lf6/x;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lf6/z;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Lf6/x;-><init>(Lf6/x;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, LF5/f;->L(Lf6/z;)LF5/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :goto_0
    new-instance v1, LB8/b;

    .line 24
    .line 25
    const/16 v2, 0xa

    .line 26
    .line 27
    invoke-direct {v1, v0, p1, v2}, LB8/b;-><init>(LF5/a;Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    const/16 p1, 0xa

    .line 31
    .line 32
    invoke-virtual {p0, v0, p1, v1}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final z(LW5/c;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LF5/f;->J()LF5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LF5/b;

    .line 6
    .line 7
    const/16 v1, 0x16

    .line 8
    .line 9
    invoke-direct {v0, v1}, LF5/b;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x1c

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
