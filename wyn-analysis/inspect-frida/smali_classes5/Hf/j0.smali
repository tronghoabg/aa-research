.class public LHf/j0;
.super LIf/b;
.source "SourceFile"

# interfaces
.implements LHf/b0;
.implements LHf/d;
.implements LIf/w;


# instance fields
.field public final e:I

.field public final f:I

.field public final g:LGf/a;

.field public h:[Ljava/lang/Object;

.field public i:J

.field public j:J

.field public k:I

.field public l:I


# direct methods
.method public constructor <init>(IILGf/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LHf/j0;->e:I

    .line 5
    .line 6
    iput p2, p0, LHf/j0;->f:I

    .line 7
    .line 8
    iput-object p3, p0, LHf/j0;->g:LGf/a;

    .line 9
    .line 10
    return-void
.end method

.method public static k(LHf/j0;LHf/m;Ljf/c;)V
    .locals 8

    .line 1
    instance-of v0, p2, LHf/i0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LHf/i0;

    .line 7
    .line 8
    iget v1, v0, LHf/i0;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LHf/i0;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LHf/i0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LHf/i0;-><init>(LHf/j0;Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LHf/i0;->e:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LHf/i0;->g:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_4

    .line 35
    .line 36
    if-eq v2, v5, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget-object p0, v0, LHf/i0;->d:LEf/m0;

    .line 43
    .line 44
    iget-object p1, v0, LHf/i0;->c:LHf/l0;

    .line 45
    .line 46
    iget-object v2, v0, LHf/i0;->b:LHf/m;

    .line 47
    .line 48
    iget-object v5, v0, LHf/i0;->a:LHf/j0;

    .line 49
    .line 50
    :goto_1
    :try_start_0
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    goto/16 :goto_9

    .line 56
    .line 57
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p0

    .line 65
    :cond_2
    iget-object p0, v0, LHf/i0;->d:LEf/m0;

    .line 66
    .line 67
    iget-object p1, v0, LHf/i0;->c:LHf/l0;

    .line 68
    .line 69
    iget-object v2, v0, LHf/i0;->b:LHf/m;

    .line 70
    .line 71
    iget-object v5, v0, LHf/i0;->a:LHf/j0;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :goto_2
    move-object p2, v2

    .line 75
    move-object v2, p0

    .line 76
    move-object p0, v5

    .line 77
    goto :goto_5

    .line 78
    :cond_3
    iget-object p1, v0, LHf/i0;->c:LHf/l0;

    .line 79
    .line 80
    iget-object p0, v0, LHf/i0;->b:LHf/m;

    .line 81
    .line 82
    iget-object v2, v0, LHf/i0;->a:LHf/j0;

    .line 83
    .line 84
    :try_start_1
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 85
    .line 86
    .line 87
    move-object p2, p0

    .line 88
    move-object p0, v2

    .line 89
    goto :goto_4

    .line 90
    :catchall_1
    move-exception p0

    .line 91
    move-object v5, v2

    .line 92
    goto/16 :goto_9

    .line 93
    .line 94
    :cond_4
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, LIf/b;->d()LIf/d;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    check-cast p2, LHf/l0;

    .line 102
    .line 103
    :try_start_2
    instance-of v2, p1, LHf/A0;

    .line 104
    .line 105
    if-eqz v2, :cond_5

    .line 106
    .line 107
    move-object v2, p1

    .line 108
    check-cast v2, LHf/A0;

    .line 109
    .line 110
    iput-object p0, v0, LHf/i0;->a:LHf/j0;

    .line 111
    .line 112
    iput-object p1, v0, LHf/i0;->b:LHf/m;

    .line 113
    .line 114
    iput-object p2, v0, LHf/i0;->c:LHf/l0;

    .line 115
    .line 116
    iput v5, v0, LHf/i0;->g:I

    .line 117
    .line 118
    invoke-virtual {v2, v0}, LHf/A0;->a(Llf/c;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 122
    if-ne v2, v1, :cond_5

    .line 123
    .line 124
    goto :goto_8

    .line 125
    :goto_3
    move-object v5, p0

    .line 126
    move-object p0, p1

    .line 127
    move-object p1, p2

    .line 128
    goto :goto_9

    .line 129
    :catchall_2
    move-exception p1

    .line 130
    goto :goto_3

    .line 131
    :cond_5
    move-object v7, p2

    .line 132
    move-object p2, p1

    .line 133
    move-object p1, v7

    .line 134
    :goto_4
    :try_start_3
    invoke-interface {v0}, Ljf/c;->getContext()Ljf/h;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    sget-object v5, LEf/l0;->a:LEf/l0;

    .line 139
    .line 140
    invoke-interface {v2, v5}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    check-cast v2, LEf/m0;

    .line 145
    .line 146
    :cond_6
    :goto_5
    invoke-virtual {p0, p1}, LHf/j0;->s(LHf/l0;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    sget-object v6, LHf/k0;->a:LH6/g;

    .line 151
    .line 152
    if-ne v5, v6, :cond_7

    .line 153
    .line 154
    iput-object p0, v0, LHf/i0;->a:LHf/j0;

    .line 155
    .line 156
    iput-object p2, v0, LHf/i0;->b:LHf/m;

    .line 157
    .line 158
    iput-object p1, v0, LHf/i0;->c:LHf/l0;

    .line 159
    .line 160
    iput-object v2, v0, LHf/i0;->d:LEf/m0;

    .line 161
    .line 162
    iput v4, v0, LHf/i0;->g:I

    .line 163
    .line 164
    invoke-virtual {p0, p1, v0}, LHf/j0;->i(LHf/l0;LHf/i0;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    if-ne v5, v1, :cond_6

    .line 169
    .line 170
    goto :goto_8

    .line 171
    :goto_6
    move-object v5, p0

    .line 172
    move-object p0, p2

    .line 173
    goto :goto_9

    .line 174
    :catchall_3
    move-exception p2

    .line 175
    goto :goto_6

    .line 176
    :cond_7
    if-eqz v2, :cond_9

    .line 177
    .line 178
    invoke-interface {v2}, LEf/m0;->isActive()Z

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    if-eqz v6, :cond_8

    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_8
    invoke-interface {v2}, LEf/m0;->getCancellationException()Ljava/util/concurrent/CancellationException;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    throw p2

    .line 190
    :cond_9
    :goto_7
    iput-object p0, v0, LHf/i0;->a:LHf/j0;

    .line 191
    .line 192
    iput-object p2, v0, LHf/i0;->b:LHf/m;

    .line 193
    .line 194
    iput-object p1, v0, LHf/i0;->c:LHf/l0;

    .line 195
    .line 196
    iput-object v2, v0, LHf/i0;->d:LEf/m0;

    .line 197
    .line 198
    iput v3, v0, LHf/i0;->g:I

    .line 199
    .line 200
    invoke-interface {p2, v5, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 204
    if-ne v5, v1, :cond_6

    .line 205
    .line 206
    :goto_8
    return-void

    .line 207
    :goto_9
    invoke-virtual {v5, p1}, LIf/b;->g(LIf/d;)V

    .line 208
    .line 209
    .line 210
    throw p0
.end method


# virtual methods
.method public final a(Ljf/h;ILGf/a;)LHf/l;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHf/k0;->t(LHf/g0;Ljf/h;ILGf/a;)LHf/l;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final b(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    sget-object v0, LIf/c;->a:[Ljf/c;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, LHf/j0;->q(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, LHf/j0;->n([Ljf/c;)[Ljf/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    const/4 p1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_2

    .line 19
    :cond_0
    move p1, v1

    .line 20
    :goto_0
    monitor-exit p0

    .line 21
    array-length v2, v0

    .line 22
    :goto_1
    if-ge v1, v2, :cond_2

    .line 23
    .line 24
    aget-object v3, v0, v1

    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    sget-object v4, Lef/C;->a:Lef/C;

    .line 29
    .line 30
    invoke-interface {v3, v4}, Ljf/c;->resumeWith(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    return p1

    .line 37
    :goto_2
    monitor-exit p0

    .line 38
    throw p1
.end method

.method public final c()V
    .locals 13

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, LHf/j0;->o()J

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    iget v2, p0, LHf/j0;->k:I

    .line 7
    .line 8
    int-to-long v2, v2

    .line 9
    add-long v5, v0, v2

    .line 10
    .line 11
    iget-wide v7, p0, LHf/j0;->j:J

    .line 12
    .line 13
    invoke-virtual {p0}, LHf/j0;->o()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iget v2, p0, LHf/j0;->k:I

    .line 18
    .line 19
    int-to-long v2, v2

    .line 20
    add-long v9, v0, v2

    .line 21
    .line 22
    invoke-virtual {p0}, LHf/j0;->o()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    iget v2, p0, LHf/j0;->k:I

    .line 27
    .line 28
    int-to-long v2, v2

    .line 29
    add-long/2addr v0, v2

    .line 30
    iget v2, p0, LHf/j0;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    .line 32
    int-to-long v2, v2

    .line 33
    add-long v11, v0, v2

    .line 34
    .line 35
    move-object v4, p0

    .line 36
    :try_start_1
    invoke-virtual/range {v4 .. v12}, LHf/j0;->t(JJJJ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    .line 39
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    goto :goto_0

    .line 43
    :catchall_1
    move-exception v0

    .line 44
    move-object v4, p0

    .line 45
    :goto_0
    monitor-exit p0

    .line 46
    throw v0
.end method

.method public final collect(LHf/m;Ljf/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LHf/j0;->k(LHf/j0;LHf/m;Ljf/c;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 5
    .line 6
    return-object p1
.end method

.method public final e()LIf/d;
    .locals 3

    .line 1
    new-instance v0, LHf/l0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, -0x1

    .line 7
    .line 8
    iput-wide v1, v0, LHf/l0;->a:J

    .line 9
    .line 10
    return-object v0
.end method

.method public final emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, LHf/j0;->b(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p1, Lef/C;->a:Lef/C;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    new-instance v5, LEf/n;

    .line 11
    .line 12
    invoke-static {p2}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    const/4 v6, 0x1

    .line 17
    invoke-direct {v5, v6, p2}, LEf/n;-><init>(ILjf/c;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v5}, LEf/n;->t()V

    .line 21
    .line 22
    .line 23
    sget-object p2, LIf/c;->a:[Ljf/c;

    .line 24
    .line 25
    monitor-enter p0

    .line 26
    :try_start_0
    invoke-virtual {p0, p1}, LHf/j0;->q(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    :try_start_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 33
    .line 34
    invoke-virtual {v5, p1}, LEf/n;->resumeWith(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p2}, LHf/j0;->n([Ljf/c;)[Ljf/c;

    .line 38
    .line 39
    .line 40
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    const/4 p2, 0x0

    .line 42
    move-object v1, p0

    .line 43
    goto :goto_2

    .line 44
    :goto_0
    move-object v1, p0

    .line 45
    goto :goto_6

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    move-object p1, v0

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    :try_start_2
    new-instance v0, LHf/h0;

    .line 50
    .line 51
    invoke-virtual {p0}, LHf/j0;->o()J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    iget v3, p0, LHf/j0;->k:I

    .line 56
    .line 57
    iget v4, p0, LHf/j0;->l:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 58
    .line 59
    add-int/2addr v3, v4

    .line 60
    int-to-long v3, v3

    .line 61
    add-long/2addr v1, v3

    .line 62
    move-object v4, p1

    .line 63
    move-wide v2, v1

    .line 64
    move-object v1, p0

    .line 65
    :try_start_3
    invoke-direct/range {v0 .. v5}, LHf/h0;-><init>(LHf/j0;JLjava/lang/Object;LEf/n;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v0}, LHf/j0;->m(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget p1, v1, LHf/j0;->l:I

    .line 72
    .line 73
    add-int/2addr p1, v6

    .line 74
    iput p1, v1, LHf/j0;->l:I

    .line 75
    .line 76
    iget p1, v1, LHf/j0;->f:I

    .line 77
    .line 78
    if-nez p1, :cond_2

    .line 79
    .line 80
    invoke-virtual {p0, p2}, LHf/j0;->n([Ljf/c;)[Ljf/c;

    .line 81
    .line 82
    .line 83
    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 84
    goto :goto_1

    .line 85
    :catchall_1
    move-exception v0

    .line 86
    goto :goto_5

    .line 87
    :cond_2
    :goto_1
    move-object p1, p2

    .line 88
    move-object p2, v0

    .line 89
    :goto_2
    monitor-exit p0

    .line 90
    if-eqz p2, :cond_3

    .line 91
    .line 92
    new-instance v0, LEf/j;

    .line 93
    .line 94
    const/4 v2, 0x2

    .line 95
    invoke-direct {v0, p2, v2}, LEf/j;-><init>(Ljava/lang/Object;I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5, v0}, LEf/n;->w(LEf/F0;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    array-length p2, p1

    .line 102
    const/4 v0, 0x0

    .line 103
    :goto_3
    if-ge v0, p2, :cond_5

    .line 104
    .line 105
    aget-object v2, p1, v0

    .line 106
    .line 107
    if-eqz v2, :cond_4

    .line 108
    .line 109
    sget-object v3, Lef/C;->a:Lef/C;

    .line 110
    .line 111
    invoke-interface {v2, v3}, Ljf/c;->resumeWith(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    invoke-virtual {v5}, LEf/n;->s()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 122
    .line 123
    if-ne p1, p2, :cond_6

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_6
    sget-object p1, Lef/C;->a:Lef/C;

    .line 127
    .line 128
    :goto_4
    if-ne p1, p2, :cond_7

    .line 129
    .line 130
    return-object p1

    .line 131
    :cond_7
    sget-object p1, Lef/C;->a:Lef/C;

    .line 132
    .line 133
    return-object p1

    .line 134
    :catchall_2
    move-exception v0

    .line 135
    move-object v1, p0

    .line 136
    :goto_5
    move-object p1, v0

    .line 137
    :goto_6
    monitor-exit p0

    .line 138
    throw p1
.end method

.method public final f()[LIf/d;
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [LHf/l0;

    .line 3
    .line 4
    return-object v0
.end method

.method public final i(LHf/l0;LHf/i0;)Ljava/lang/Object;
    .locals 5

    .line 1
    new-instance v0, LEf/n;

    .line 2
    .line 3
    invoke-static {p2}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p2}, LEf/n;-><init>(ILjf/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LEf/n;->t()V

    .line 12
    .line 13
    .line 14
    monitor-enter p0

    .line 15
    :try_start_0
    invoke-virtual {p0, p1}, LHf/j0;->r(LHf/l0;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    const-wide/16 v3, 0x0

    .line 20
    .line 21
    cmp-long p2, v1, v3

    .line 22
    .line 23
    if-gez p2, :cond_0

    .line 24
    .line 25
    iput-object v0, p1, LHf/l0;->b:LEf/n;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, LEf/n;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    :goto_0
    monitor-exit p0

    .line 34
    invoke-virtual {v0}, LEf/n;->s()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 39
    .line 40
    if-ne p1, p2, :cond_1

    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 44
    .line 45
    return-object p1

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    monitor-exit p0

    .line 48
    throw p1
.end method

.method public final j()V
    .locals 8

    .line 1
    iget v0, p0, LHf/j0;->f:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, LHf/j0;->l:I

    .line 7
    .line 8
    if-gt v0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    iget-object v0, p0, LHf/j0;->h:[Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    iget v2, p0, LHf/j0;->l:I

    .line 17
    .line 18
    if-lez v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, LHf/j0;->o()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    iget v4, p0, LHf/j0;->k:I

    .line 25
    .line 26
    iget v5, p0, LHf/j0;->l:I

    .line 27
    .line 28
    add-int/2addr v4, v5

    .line 29
    int-to-long v6, v4

    .line 30
    add-long/2addr v2, v6

    .line 31
    const-wide/16 v6, 0x1

    .line 32
    .line 33
    sub-long/2addr v2, v6

    .line 34
    long-to-int v2, v2

    .line 35
    array-length v3, v0

    .line 36
    sub-int/2addr v3, v1

    .line 37
    and-int/2addr v2, v3

    .line 38
    aget-object v2, v0, v2

    .line 39
    .line 40
    sget-object v3, LHf/k0;->a:LH6/g;

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    add-int/lit8 v5, v5, -0x1

    .line 45
    .line 46
    iput v5, p0, LHf/j0;->l:I

    .line 47
    .line 48
    invoke-virtual {p0}, LHf/j0;->o()J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    iget v4, p0, LHf/j0;->k:I

    .line 53
    .line 54
    iget v5, p0, LHf/j0;->l:I

    .line 55
    .line 56
    add-int/2addr v4, v5

    .line 57
    int-to-long v4, v4

    .line 58
    add-long/2addr v2, v4

    .line 59
    const/4 v4, 0x0

    .line 60
    invoke-static {v0, v2, v3, v4}, LHf/k0;->f([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    :goto_1
    return-void
.end method

.method public final l()V
    .locals 10

    .line 1
    iget-object v0, p0, LHf/j0;->h:[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LHf/j0;->o()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {v0, v1, v2, v3}, LHf/k0;->f([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget v0, p0, LHf/j0;->k:I

    .line 15
    .line 16
    add-int/lit8 v0, v0, -0x1

    .line 17
    .line 18
    iput v0, p0, LHf/j0;->k:I

    .line 19
    .line 20
    invoke-virtual {p0}, LHf/j0;->o()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    const-wide/16 v2, 0x1

    .line 25
    .line 26
    add-long/2addr v0, v2

    .line 27
    iget-wide v2, p0, LHf/j0;->i:J

    .line 28
    .line 29
    cmp-long v2, v2, v0

    .line 30
    .line 31
    if-gez v2, :cond_0

    .line 32
    .line 33
    iput-wide v0, p0, LHf/j0;->i:J

    .line 34
    .line 35
    :cond_0
    iget-wide v2, p0, LHf/j0;->j:J

    .line 36
    .line 37
    cmp-long v2, v2, v0

    .line 38
    .line 39
    if-gez v2, :cond_3

    .line 40
    .line 41
    iget v2, p0, LIf/b;->b:I

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    iget-object v2, p0, LIf/b;->a:[LIf/d;

    .line 46
    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    array-length v3, v2

    .line 50
    const/4 v4, 0x0

    .line 51
    :goto_0
    if-ge v4, v3, :cond_2

    .line 52
    .line 53
    aget-object v5, v2, v4

    .line 54
    .line 55
    if-eqz v5, :cond_1

    .line 56
    .line 57
    check-cast v5, LHf/l0;

    .line 58
    .line 59
    iget-wide v6, v5, LHf/l0;->a:J

    .line 60
    .line 61
    const-wide/16 v8, 0x0

    .line 62
    .line 63
    cmp-long v8, v6, v8

    .line 64
    .line 65
    if-ltz v8, :cond_1

    .line 66
    .line 67
    cmp-long v6, v6, v0

    .line 68
    .line 69
    if-gez v6, :cond_1

    .line 70
    .line 71
    iput-wide v0, v5, LHf/l0;->a:J

    .line 72
    .line 73
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    iput-wide v0, p0, LHf/j0;->j:J

    .line 77
    .line 78
    :cond_3
    return-void
.end method

.method public final m(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget v0, p0, LHf/j0;->k:I

    .line 2
    .line 3
    iget v1, p0, LHf/j0;->l:I

    .line 4
    .line 5
    add-int/2addr v0, v1

    .line 6
    iget-object v1, p0, LHf/j0;->h:[Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {p0, v1, v3, v2}, LHf/j0;->p([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    array-length v3, v1

    .line 19
    if-lt v0, v3, :cond_1

    .line 20
    .line 21
    array-length v3, v1

    .line 22
    mul-int/2addr v3, v2

    .line 23
    invoke-virtual {p0, v1, v0, v3}, LHf/j0;->p([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :cond_1
    :goto_0
    invoke-virtual {p0}, LHf/j0;->o()J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    int-to-long v4, v0

    .line 32
    add-long/2addr v2, v4

    .line 33
    invoke-static {v1, v2, v3, p1}, LHf/k0;->f([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final n([Ljf/c;)[Ljf/c;
    .locals 10

    .line 1
    array-length v0, p1

    .line 2
    iget v1, p0, LIf/b;->b:I

    .line 3
    .line 4
    if-eqz v1, :cond_3

    .line 5
    .line 6
    iget-object v1, p0, LIf/b;->a:[LIf/d;

    .line 7
    .line 8
    if-eqz v1, :cond_3

    .line 9
    .line 10
    array-length v2, v1

    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    if-ge v3, v2, :cond_3

    .line 13
    .line 14
    aget-object v4, v1, v3

    .line 15
    .line 16
    if-eqz v4, :cond_2

    .line 17
    .line 18
    check-cast v4, LHf/l0;

    .line 19
    .line 20
    iget-object v5, v4, LHf/l0;->b:LEf/n;

    .line 21
    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-virtual {p0, v4}, LHf/j0;->r(LHf/l0;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v6

    .line 29
    const-wide/16 v8, 0x0

    .line 30
    .line 31
    cmp-long v6, v6, v8

    .line 32
    .line 33
    if-ltz v6, :cond_2

    .line 34
    .line 35
    array-length v6, p1

    .line 36
    if-lt v0, v6, :cond_1

    .line 37
    .line 38
    array-length v6, p1

    .line 39
    const/4 v7, 0x2

    .line 40
    mul-int/2addr v6, v7

    .line 41
    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    invoke-static {p1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string v6, "copyOf(...)"

    .line 50
    .line 51
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    move-object v6, p1

    .line 55
    check-cast v6, [Ljf/c;

    .line 56
    .line 57
    add-int/lit8 v7, v0, 0x1

    .line 58
    .line 59
    aput-object v5, v6, v0

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    iput-object v0, v4, LHf/l0;->b:LEf/n;

    .line 63
    .line 64
    move v0, v7

    .line 65
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    check-cast p1, [Ljf/c;

    .line 69
    .line 70
    return-object p1
.end method

.method public final o()J
    .locals 4

    .line 1
    iget-wide v0, p0, LHf/j0;->j:J

    .line 2
    .line 3
    iget-wide v2, p0, LHf/j0;->i:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final p([Ljava/lang/Object;II)[Ljava/lang/Object;
    .locals 7

    .line 1
    if-lez p3, :cond_2

    .line 2
    .line 3
    new-array p3, p3, [Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, LHf/j0;->h:[Ljava/lang/Object;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {p0}, LHf/j0;->o()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, p2, :cond_1

    .line 16
    .line 17
    int-to-long v3, v2

    .line 18
    add-long/2addr v3, v0

    .line 19
    long-to-int v5, v3

    .line 20
    array-length v6, p1

    .line 21
    add-int/lit8 v6, v6, -0x1

    .line 22
    .line 23
    and-int/2addr v5, v6

    .line 24
    aget-object v5, p1, v5

    .line 25
    .line 26
    invoke-static {p3, v3, v4, v5}, LHf/k0;->f([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    :goto_1
    return-object p3

    .line 33
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string p2, "Buffer size overflow"

    .line 36
    .line 37
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method

.method public final q(Ljava/lang/Object;)Z
    .locals 12

    .line 1
    iget v1, p0, LIf/b;->b:I

    .line 2
    .line 3
    iget v2, p0, LHf/j0;->e:I

    .line 4
    .line 5
    const/4 v9, 0x1

    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    :cond_0
    invoke-virtual/range {p0 .. p1}, LHf/j0;->m(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget v1, p0, LHf/j0;->k:I

    .line 16
    .line 17
    add-int/2addr v1, v9

    .line 18
    iput v1, p0, LHf/j0;->k:I

    .line 19
    .line 20
    if-le v1, v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, LHf/j0;->l()V

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0}, LHf/j0;->o()J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    iget v3, p0, LHf/j0;->k:I

    .line 30
    .line 31
    int-to-long v3, v3

    .line 32
    add-long/2addr v1, v3

    .line 33
    iput-wide v1, p0, LHf/j0;->j:J

    .line 34
    .line 35
    return v9

    .line 36
    :cond_2
    iget v1, p0, LHf/j0;->k:I

    .line 37
    .line 38
    iget v3, p0, LHf/j0;->f:I

    .line 39
    .line 40
    if-lt v1, v3, :cond_5

    .line 41
    .line 42
    iget-wide v4, p0, LHf/j0;->j:J

    .line 43
    .line 44
    iget-wide v6, p0, LHf/j0;->i:J

    .line 45
    .line 46
    cmp-long v1, v4, v6

    .line 47
    .line 48
    if-gtz v1, :cond_5

    .line 49
    .line 50
    iget-object v1, p0, LHf/j0;->g:LGf/a;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    if-eq v1, v9, :cond_5

    .line 59
    .line 60
    const/4 v2, 0x2

    .line 61
    if-ne v1, v2, :cond_3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    new-instance v1, LE5/Q;

    .line 65
    .line 66
    const/16 v2, 0x9

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 70
    .line 71
    .line 72
    throw v1

    .line 73
    :cond_4
    const/4 v1, 0x0

    .line 74
    return v1

    .line 75
    :cond_5
    invoke-virtual/range {p0 .. p1}, LHf/j0;->m(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget v1, p0, LHf/j0;->k:I

    .line 79
    .line 80
    add-int/2addr v1, v9

    .line 81
    iput v1, p0, LHf/j0;->k:I

    .line 82
    .line 83
    if-le v1, v3, :cond_6

    .line 84
    .line 85
    invoke-virtual {p0}, LHf/j0;->l()V

    .line 86
    .line 87
    .line 88
    :cond_6
    invoke-virtual {p0}, LHf/j0;->o()J

    .line 89
    .line 90
    .line 91
    move-result-wide v3

    .line 92
    iget v1, p0, LHf/j0;->k:I

    .line 93
    .line 94
    int-to-long v5, v1

    .line 95
    add-long/2addr v3, v5

    .line 96
    iget-wide v5, p0, LHf/j0;->i:J

    .line 97
    .line 98
    sub-long/2addr v3, v5

    .line 99
    long-to-int v1, v3

    .line 100
    if-le v1, v2, :cond_7

    .line 101
    .line 102
    const-wide/16 v1, 0x1

    .line 103
    .line 104
    add-long/2addr v1, v5

    .line 105
    iget-wide v3, p0, LHf/j0;->j:J

    .line 106
    .line 107
    invoke-virtual {p0}, LHf/j0;->o()J

    .line 108
    .line 109
    .line 110
    move-result-wide v5

    .line 111
    iget v7, p0, LHf/j0;->k:I

    .line 112
    .line 113
    int-to-long v7, v7

    .line 114
    add-long/2addr v5, v7

    .line 115
    invoke-virtual {p0}, LHf/j0;->o()J

    .line 116
    .line 117
    .line 118
    move-result-wide v7

    .line 119
    iget v10, p0, LHf/j0;->k:I

    .line 120
    .line 121
    int-to-long v10, v10

    .line 122
    add-long/2addr v7, v10

    .line 123
    iget v10, p0, LHf/j0;->l:I

    .line 124
    .line 125
    int-to-long v10, v10

    .line 126
    add-long/2addr v7, v10

    .line 127
    move-object v0, p0

    .line 128
    invoke-virtual/range {v0 .. v8}, LHf/j0;->t(JJJJ)V

    .line 129
    .line 130
    .line 131
    :cond_7
    :goto_0
    return v9
.end method

.method public final r(LHf/l0;)J
    .locals 6

    .line 1
    iget-wide v0, p1, LHf/l0;->a:J

    .line 2
    .line 3
    invoke-virtual {p0}, LHf/j0;->o()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    iget p1, p0, LHf/j0;->k:I

    .line 8
    .line 9
    int-to-long v4, p1

    .line 10
    add-long/2addr v2, v4

    .line 11
    cmp-long p1, v0, v2

    .line 12
    .line 13
    if-gez p1, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget p1, p0, LHf/j0;->f:I

    .line 17
    .line 18
    if-lez p1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p0}, LHf/j0;->o()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    cmp-long p1, v0, v2

    .line 26
    .line 27
    if-lez p1, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    iget p1, p0, LHf/j0;->l:I

    .line 31
    .line 32
    if-nez p1, :cond_3

    .line 33
    .line 34
    :goto_0
    const-wide/16 v0, -0x1

    .line 35
    .line 36
    :cond_3
    :goto_1
    return-wide v0
.end method

.method public final s(LHf/l0;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, LIf/c;->a:[Ljf/c;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, LHf/j0;->r(LHf/l0;)J

    .line 5
    .line 6
    .line 7
    move-result-wide v1

    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    cmp-long v3, v1, v3

    .line 11
    .line 12
    if-gez v3, :cond_0

    .line 13
    .line 14
    sget-object p1, LHf/k0;->a:LH6/g;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_2

    .line 19
    :cond_0
    iget-wide v3, p1, LHf/l0;->a:J

    .line 20
    .line 21
    iget-object v0, p0, LHf/j0;->h:[Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    long-to-int v5, v1

    .line 27
    array-length v6, v0

    .line 28
    add-int/lit8 v6, v6, -0x1

    .line 29
    .line 30
    and-int/2addr v5, v6

    .line 31
    aget-object v0, v0, v5

    .line 32
    .line 33
    instance-of v5, v0, LHf/h0;

    .line 34
    .line 35
    if-eqz v5, :cond_1

    .line 36
    .line 37
    check-cast v0, LHf/h0;

    .line 38
    .line 39
    iget-object v0, v0, LHf/h0;->c:Ljava/lang/Object;

    .line 40
    .line 41
    :cond_1
    const-wide/16 v5, 0x1

    .line 42
    .line 43
    add-long/2addr v1, v5

    .line 44
    iput-wide v1, p1, LHf/l0;->a:J

    .line 45
    .line 46
    invoke-virtual {p0, v3, v4}, LHf/j0;->u(J)[Ljf/c;

    .line 47
    .line 48
    .line 49
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    move-object v7, v0

    .line 51
    move-object v0, p1

    .line 52
    move-object p1, v7

    .line 53
    :goto_0
    monitor-exit p0

    .line 54
    array-length v1, v0

    .line 55
    const/4 v2, 0x0

    .line 56
    :goto_1
    if-ge v2, v1, :cond_3

    .line 57
    .line 58
    aget-object v3, v0, v2

    .line 59
    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    sget-object v4, Lef/C;->a:Lef/C;

    .line 63
    .line 64
    invoke-interface {v3, v4}, Ljf/c;->resumeWith(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    return-object p1

    .line 71
    :goto_2
    monitor-exit p0

    .line 72
    throw p1
.end method

.method public final t(JJJJ)V
    .locals 6

    .line 1
    invoke-static {p3, p4, p1, p2}, Ljava/lang/Math;->min(JJ)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0}, LHf/j0;->o()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    :goto_0
    cmp-long v4, v2, v0

    .line 10
    .line 11
    if-gez v4, :cond_0

    .line 12
    .line 13
    iget-object v4, p0, LHf/j0;->h:[Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    invoke-static {v4, v2, v3, v5}, LHf/k0;->f([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const-wide/16 v4, 0x1

    .line 23
    .line 24
    add-long/2addr v2, v4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iput-wide p1, p0, LHf/j0;->i:J

    .line 27
    .line 28
    iput-wide p3, p0, LHf/j0;->j:J

    .line 29
    .line 30
    sub-long p1, p5, v0

    .line 31
    .line 32
    long-to-int p1, p1

    .line 33
    iput p1, p0, LHf/j0;->k:I

    .line 34
    .line 35
    sub-long/2addr p7, p5

    .line 36
    long-to-int p1, p7

    .line 37
    iput p1, p0, LHf/j0;->l:I

    .line 38
    .line 39
    return-void
.end method

.method public final u(J)[Ljf/c;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, LHf/j0;->j:J

    .line 4
    .line 5
    cmp-long v1, p1, v1

    .line 6
    .line 7
    sget-object v2, LIf/c;->a:[Ljf/c;

    .line 8
    .line 9
    if-lez v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {v0}, LHf/j0;->o()J

    .line 13
    .line 14
    .line 15
    move-result-wide v3

    .line 16
    iget v1, v0, LHf/j0;->k:I

    .line 17
    .line 18
    int-to-long v5, v1

    .line 19
    add-long/2addr v5, v3

    .line 20
    iget v1, v0, LHf/j0;->f:I

    .line 21
    .line 22
    const-wide/16 v7, 0x1

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    iget v9, v0, LHf/j0;->l:I

    .line 27
    .line 28
    if-lez v9, :cond_1

    .line 29
    .line 30
    add-long/2addr v5, v7

    .line 31
    :cond_1
    iget v9, v0, LIf/b;->b:I

    .line 32
    .line 33
    const/4 v10, 0x0

    .line 34
    if-eqz v9, :cond_3

    .line 35
    .line 36
    iget-object v9, v0, LIf/b;->a:[LIf/d;

    .line 37
    .line 38
    if-eqz v9, :cond_3

    .line 39
    .line 40
    array-length v11, v9

    .line 41
    move v12, v10

    .line 42
    :goto_0
    if-ge v12, v11, :cond_3

    .line 43
    .line 44
    aget-object v13, v9, v12

    .line 45
    .line 46
    if-eqz v13, :cond_2

    .line 47
    .line 48
    check-cast v13, LHf/l0;

    .line 49
    .line 50
    iget-wide v13, v13, LHf/l0;->a:J

    .line 51
    .line 52
    const-wide/16 v15, 0x0

    .line 53
    .line 54
    cmp-long v15, v13, v15

    .line 55
    .line 56
    if-ltz v15, :cond_2

    .line 57
    .line 58
    cmp-long v15, v13, v5

    .line 59
    .line 60
    if-gez v15, :cond_2

    .line 61
    .line 62
    move-wide v5, v13

    .line 63
    :cond_2
    add-int/lit8 v12, v12, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    iget-wide v11, v0, LHf/j0;->j:J

    .line 67
    .line 68
    cmp-long v9, v5, v11

    .line 69
    .line 70
    if-gtz v9, :cond_4

    .line 71
    .line 72
    :goto_1
    return-object v2

    .line 73
    :cond_4
    invoke-virtual {v0}, LHf/j0;->o()J

    .line 74
    .line 75
    .line 76
    move-result-wide v11

    .line 77
    iget v9, v0, LHf/j0;->k:I

    .line 78
    .line 79
    int-to-long v13, v9

    .line 80
    add-long/2addr v11, v13

    .line 81
    iget v9, v0, LIf/b;->b:I

    .line 82
    .line 83
    if-lez v9, :cond_5

    .line 84
    .line 85
    sub-long v13, v11, v5

    .line 86
    .line 87
    long-to-int v9, v13

    .line 88
    iget v13, v0, LHf/j0;->l:I

    .line 89
    .line 90
    sub-int v9, v1, v9

    .line 91
    .line 92
    invoke-static {v13, v9}, Ljava/lang/Math;->min(II)I

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    goto :goto_2

    .line 97
    :cond_5
    iget v9, v0, LHf/j0;->l:I

    .line 98
    .line 99
    :goto_2
    iget v13, v0, LHf/j0;->l:I

    .line 100
    .line 101
    int-to-long v13, v13

    .line 102
    add-long/2addr v13, v11

    .line 103
    sget-object v15, LHf/k0;->a:LH6/g;

    .line 104
    .line 105
    if-lez v9, :cond_9

    .line 106
    .line 107
    new-array v2, v9, [Ljf/c;

    .line 108
    .line 109
    move-wide/from16 p1, v7

    .line 110
    .line 111
    iget-object v7, v0, LHf/j0;->h:[Ljava/lang/Object;

    .line 112
    .line 113
    invoke-static {v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    move v8, v1

    .line 117
    move-object/from16 v16, v2

    .line 118
    .line 119
    move-wide v1, v11

    .line 120
    :goto_3
    cmp-long v17, v11, v13

    .line 121
    .line 122
    if-gez v17, :cond_8

    .line 123
    .line 124
    move-wide/from16 v17, v3

    .line 125
    .line 126
    long-to-int v3, v11

    .line 127
    array-length v4, v7

    .line 128
    add-int/lit8 v4, v4, -0x1

    .line 129
    .line 130
    and-int/2addr v3, v4

    .line 131
    aget-object v3, v7, v3

    .line 132
    .line 133
    if-eq v3, v15, :cond_7

    .line 134
    .line 135
    const-string v4, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter"

    .line 136
    .line 137
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    check-cast v3, LHf/h0;

    .line 141
    .line 142
    add-int/lit8 v4, v10, 0x1

    .line 143
    .line 144
    move-wide/from16 v19, v5

    .line 145
    .line 146
    iget-object v5, v3, LHf/h0;->d:LEf/n;

    .line 147
    .line 148
    aput-object v5, v16, v10

    .line 149
    .line 150
    invoke-static {v7, v11, v12, v15}, LHf/k0;->f([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    iget-object v3, v3, LHf/h0;->c:Ljava/lang/Object;

    .line 154
    .line 155
    invoke-static {v7, v1, v2, v3}, LHf/k0;->f([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    add-long v1, v1, p1

    .line 159
    .line 160
    if-ge v4, v9, :cond_6

    .line 161
    .line 162
    move v10, v4

    .line 163
    goto :goto_5

    .line 164
    :cond_6
    :goto_4
    move-wide v11, v1

    .line 165
    move-object/from16 v9, v16

    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_7
    move-wide/from16 v19, v5

    .line 169
    .line 170
    :goto_5
    add-long v11, v11, p1

    .line 171
    .line 172
    move-wide/from16 v3, v17

    .line 173
    .line 174
    move-wide/from16 v5, v19

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_8
    move-wide/from16 v17, v3

    .line 178
    .line 179
    move-wide/from16 v19, v5

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_9
    move-wide/from16 v17, v3

    .line 183
    .line 184
    move-wide/from16 v19, v5

    .line 185
    .line 186
    move-wide/from16 p1, v7

    .line 187
    .line 188
    move v8, v1

    .line 189
    move-object v9, v2

    .line 190
    :goto_6
    sub-long v1, v11, v17

    .line 191
    .line 192
    long-to-int v1, v1

    .line 193
    iget v2, v0, LIf/b;->b:I

    .line 194
    .line 195
    if-nez v2, :cond_a

    .line 196
    .line 197
    move-wide v3, v11

    .line 198
    goto :goto_7

    .line 199
    :cond_a
    move-wide/from16 v3, v19

    .line 200
    .line 201
    :goto_7
    iget-wide v5, v0, LHf/j0;->i:J

    .line 202
    .line 203
    iget v2, v0, LHf/j0;->e:I

    .line 204
    .line 205
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    int-to-long v1, v1

    .line 210
    sub-long v1, v11, v1

    .line 211
    .line 212
    invoke-static {v5, v6, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 213
    .line 214
    .line 215
    move-result-wide v1

    .line 216
    if-nez v8, :cond_b

    .line 217
    .line 218
    cmp-long v5, v1, v13

    .line 219
    .line 220
    if-gez v5, :cond_b

    .line 221
    .line 222
    iget-object v5, v0, LHf/j0;->h:[Ljava/lang/Object;

    .line 223
    .line 224
    invoke-static {v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    long-to-int v6, v1

    .line 228
    array-length v7, v5

    .line 229
    add-int/lit8 v7, v7, -0x1

    .line 230
    .line 231
    and-int/2addr v6, v7

    .line 232
    aget-object v5, v5, v6

    .line 233
    .line 234
    invoke-static {v5, v15}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    if-eqz v5, :cond_b

    .line 239
    .line 240
    add-long v11, v11, p1

    .line 241
    .line 242
    add-long v1, v1, p1

    .line 243
    .line 244
    :cond_b
    move-wide v5, v11

    .line 245
    move-wide v7, v13

    .line 246
    invoke-virtual/range {v0 .. v8}, LHf/j0;->t(JJJJ)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0}, LHf/j0;->j()V

    .line 250
    .line 251
    .line 252
    array-length v1, v9

    .line 253
    if-nez v1, :cond_c

    .line 254
    .line 255
    return-object v9

    .line 256
    :cond_c
    invoke-virtual {v0, v9}, LHf/j0;->n([Ljf/c;)[Ljf/c;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    return-object v1
.end method
