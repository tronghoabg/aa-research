.class public final Lk2/D;
.super Lk2/o0;
.source "SourceFile"


# instance fields
.field public final l:Z

.field public final m:LN1/M;

.field public final n:LN1/L;

.field public o:Lk2/B;

.field public p:Lk2/A;

.field public q:Z

.field public r:Z

.field public s:Z


# direct methods
.method public constructor <init>(Lk2/a;Z)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lk2/o0;-><init>(Lk2/a;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lk2/a;->i()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    move p2, v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p2, 0x0

    .line 16
    :goto_0
    iput-boolean p2, p0, Lk2/D;->l:Z

    .line 17
    .line 18
    new-instance p2, LN1/M;

    .line 19
    .line 20
    invoke-direct {p2}, LN1/M;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p2, p0, Lk2/D;->m:LN1/M;

    .line 24
    .line 25
    new-instance p2, LN1/L;

    .line 26
    .line 27
    invoke-direct {p2}, LN1/L;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, Lk2/D;->n:LN1/L;

    .line 31
    .line 32
    invoke-virtual {p1}, Lk2/a;->g()LN1/N;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    if-eqz p2, :cond_1

    .line 37
    .line 38
    new-instance p1, Lk2/B;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-direct {p1, p2, v1, v1}, Lk2/B;-><init>(LN1/N;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lk2/D;->o:Lk2/B;

    .line 45
    .line 46
    iput-boolean v0, p0, Lk2/D;->s:Z

    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    invoke-virtual {p1}, Lk2/a;->h()LN1/w;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance p2, Lk2/B;

    .line 54
    .line 55
    new-instance v0, Lk2/C;

    .line 56
    .line 57
    invoke-direct {v0, p1}, Lk2/C;-><init>(LN1/w;)V

    .line 58
    .line 59
    .line 60
    sget-object p1, LN1/M;->q:Ljava/lang/Object;

    .line 61
    .line 62
    sget-object v1, Lk2/B;->e:Ljava/lang/Object;

    .line 63
    .line 64
    invoke-direct {p2, v0, p1, v1}, Lk2/B;-><init>(LN1/N;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput-object p2, p0, Lk2/D;->o:Lk2/B;

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public final B(LN1/N;)V
    .locals 14

    .line 1
    iget-boolean v0, p0, Lk2/D;->r:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lk2/D;->o:Lk2/B;

    .line 6
    .line 7
    new-instance v1, Lk2/B;

    .line 8
    .line 9
    iget-object v2, v0, Lk2/B;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v0, v0, Lk2/B;->d:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v1, p1, v2, v0}, Lk2/B;-><init>(LN1/N;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lk2/D;->o:Lk2/B;

    .line 17
    .line 18
    iget-object p1, p0, Lk2/D;->p:Lk2/A;

    .line 19
    .line 20
    if-eqz p1, :cond_6

    .line 21
    .line 22
    iget-wide v0, p1, Lk2/A;->g:J

    .line 23
    .line 24
    invoke-virtual {p0, v0, v1}, Lk2/D;->F(J)Z

    .line 25
    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_0
    invoke-virtual {p1}, LN1/N;->p()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-boolean v0, p0, Lk2/D;->s:Z

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v0, p0, Lk2/D;->o:Lk2/B;

    .line 40
    .line 41
    new-instance v1, Lk2/B;

    .line 42
    .line 43
    iget-object v2, v0, Lk2/B;->c:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v0, v0, Lk2/B;->d:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-direct {v1, p1, v2, v0}, Lk2/B;-><init>(LN1/N;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    sget-object v0, LN1/M;->q:Ljava/lang/Object;

    .line 52
    .line 53
    sget-object v1, Lk2/B;->e:Ljava/lang/Object;

    .line 54
    .line 55
    new-instance v2, Lk2/B;

    .line 56
    .line 57
    invoke-direct {v2, p1, v0, v1}, Lk2/B;-><init>(LN1/N;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-object v1, v2

    .line 61
    :goto_0
    iput-object v1, p0, Lk2/D;->o:Lk2/B;

    .line 62
    .line 63
    goto/16 :goto_3

    .line 64
    .line 65
    :cond_2
    const/4 v0, 0x0

    .line 66
    iget-object v1, p0, Lk2/D;->m:LN1/M;

    .line 67
    .line 68
    invoke-virtual {p1, v0, v1}, LN1/N;->n(ILN1/M;)V

    .line 69
    .line 70
    .line 71
    iget-wide v2, v1, LN1/M;->l:J

    .line 72
    .line 73
    iget-object v4, v1, LN1/M;->a:Ljava/lang/Object;

    .line 74
    .line 75
    iget-object v5, p0, Lk2/D;->p:Lk2/A;

    .line 76
    .line 77
    if-eqz v5, :cond_3

    .line 78
    .line 79
    iget-object v6, p0, Lk2/D;->o:Lk2/B;

    .line 80
    .line 81
    iget-object v7, v5, Lk2/A;->a:Lk2/H;

    .line 82
    .line 83
    iget-object v7, v7, Lk2/H;->a:Ljava/lang/Object;

    .line 84
    .line 85
    iget-object v8, p0, Lk2/D;->n:LN1/L;

    .line 86
    .line 87
    invoke-virtual {v6, v7, v8}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 88
    .line 89
    .line 90
    iget-wide v6, v8, LN1/L;->e:J

    .line 91
    .line 92
    iget-wide v8, v5, Lk2/A;->b:J

    .line 93
    .line 94
    add-long/2addr v6, v8

    .line 95
    iget-object v5, p0, Lk2/D;->o:Lk2/B;

    .line 96
    .line 97
    const-wide/16 v8, 0x0

    .line 98
    .line 99
    invoke-virtual {v5, v0, v1, v8, v9}, Lk2/B;->m(ILN1/M;J)LN1/M;

    .line 100
    .line 101
    .line 102
    iget-wide v0, v1, LN1/M;->l:J

    .line 103
    .line 104
    cmp-long v0, v6, v0

    .line 105
    .line 106
    if-eqz v0, :cond_3

    .line 107
    .line 108
    move-wide v12, v6

    .line 109
    goto :goto_1

    .line 110
    :cond_3
    move-wide v12, v2

    .line 111
    :goto_1
    const/4 v11, 0x0

    .line 112
    iget-object v9, p0, Lk2/D;->m:LN1/M;

    .line 113
    .line 114
    iget-object v10, p0, Lk2/D;->n:LN1/L;

    .line 115
    .line 116
    move-object v8, p1

    .line 117
    invoke-virtual/range {v8 .. v13}, LN1/N;->i(LN1/M;LN1/L;IJ)Landroid/util/Pair;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 122
    .line 123
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p1, Ljava/lang/Long;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 128
    .line 129
    .line 130
    move-result-wide v1

    .line 131
    iget-boolean p1, p0, Lk2/D;->s:Z

    .line 132
    .line 133
    if-eqz p1, :cond_4

    .line 134
    .line 135
    iget-object p1, p0, Lk2/D;->o:Lk2/B;

    .line 136
    .line 137
    new-instance v0, Lk2/B;

    .line 138
    .line 139
    iget-object v3, p1, Lk2/B;->c:Ljava/lang/Object;

    .line 140
    .line 141
    iget-object p1, p1, Lk2/B;->d:Ljava/lang/Object;

    .line 142
    .line 143
    invoke-direct {v0, v8, v3, p1}, Lk2/B;-><init>(LN1/N;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_4
    new-instance p1, Lk2/B;

    .line 148
    .line 149
    invoke-direct {p1, v8, v4, v0}, Lk2/B;-><init>(LN1/N;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    move-object v0, p1

    .line 153
    :goto_2
    iput-object v0, p0, Lk2/D;->o:Lk2/B;

    .line 154
    .line 155
    iget-object p1, p0, Lk2/D;->p:Lk2/A;

    .line 156
    .line 157
    if-eqz p1, :cond_6

    .line 158
    .line 159
    invoke-virtual {p0, v1, v2}, Lk2/D;->F(J)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_6

    .line 164
    .line 165
    iget-object p1, p1, Lk2/A;->a:Lk2/H;

    .line 166
    .line 167
    iget-object v0, p0, Lk2/D;->o:Lk2/B;

    .line 168
    .line 169
    iget-object v0, v0, Lk2/B;->d:Ljava/lang/Object;

    .line 170
    .line 171
    iget-object v1, p1, Lk2/H;->a:Ljava/lang/Object;

    .line 172
    .line 173
    if-eqz v0, :cond_5

    .line 174
    .line 175
    sget-object v0, Lk2/B;->e:Ljava/lang/Object;

    .line 176
    .line 177
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_5

    .line 182
    .line 183
    iget-object v0, p0, Lk2/D;->o:Lk2/B;

    .line 184
    .line 185
    iget-object v1, v0, Lk2/B;->d:Ljava/lang/Object;

    .line 186
    .line 187
    :cond_5
    invoke-virtual {p1, v1}, Lk2/H;->a(Ljava/lang/Object;)Lk2/H;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    goto :goto_4

    .line 192
    :cond_6
    :goto_3
    const/4 p1, 0x0

    .line 193
    :goto_4
    const/4 v0, 0x1

    .line 194
    iput-boolean v0, p0, Lk2/D;->s:Z

    .line 195
    .line 196
    iput-boolean v0, p0, Lk2/D;->r:Z

    .line 197
    .line 198
    iget-object v0, p0, Lk2/D;->o:Lk2/B;

    .line 199
    .line 200
    invoke-virtual {p0, v0}, Lk2/a;->m(LN1/N;)V

    .line 201
    .line 202
    .line 203
    if-eqz p1, :cond_7

    .line 204
    .line 205
    iget-object v0, p0, Lk2/D;->p:Lk2/A;

    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, p1}, Lk2/A;->g(Lk2/H;)V

    .line 211
    .line 212
    .line 213
    :cond_7
    return-void
.end method

.method public final C()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lk2/D;->l:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lk2/D;->q:Z

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iget-object v1, p0, Lk2/o0;->k:Lk2/a;

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Lk2/l;->y(Ljava/lang/Object;Lk2/a;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final D(Lk2/H;Lo2/e;J)Lk2/A;
    .locals 1

    .line 1
    new-instance v0, Lk2/A;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Lk2/A;-><init>(Lk2/H;Lo2/e;J)V

    .line 4
    .line 5
    .line 6
    iget-object p2, v0, Lk2/A;->d:Lk2/a;

    .line 7
    .line 8
    const/4 p3, 0x1

    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    move p2, p3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p2, 0x0

    .line 14
    :goto_0
    invoke-static {p2}, LQ1/k;->g(Z)V

    .line 15
    .line 16
    .line 17
    iget-object p2, p0, Lk2/o0;->k:Lk2/a;

    .line 18
    .line 19
    iput-object p2, v0, Lk2/A;->d:Lk2/a;

    .line 20
    .line 21
    iget-boolean p4, p0, Lk2/D;->r:Z

    .line 22
    .line 23
    if-eqz p4, :cond_2

    .line 24
    .line 25
    iget-object p2, p0, Lk2/D;->o:Lk2/B;

    .line 26
    .line 27
    iget-object p2, p2, Lk2/B;->d:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object p3, p1, Lk2/H;->a:Ljava/lang/Object;

    .line 30
    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    sget-object p2, Lk2/B;->e:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-virtual {p3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    iget-object p2, p0, Lk2/D;->o:Lk2/B;

    .line 42
    .line 43
    iget-object p3, p2, Lk2/B;->d:Ljava/lang/Object;

    .line 44
    .line 45
    :cond_1
    invoke-virtual {p1, p3}, Lk2/H;->a(Ljava/lang/Object;)Lk2/H;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v0, p1}, Lk2/A;->g(Lk2/H;)V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_2
    iput-object v0, p0, Lk2/D;->p:Lk2/A;

    .line 54
    .line 55
    iget-boolean p1, p0, Lk2/D;->q:Z

    .line 56
    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    iput-boolean p3, p0, Lk2/D;->q:Z

    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    invoke-virtual {p0, p1, p2}, Lk2/l;->y(Ljava/lang/Object;Lk2/a;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    return-object v0
.end method

.method public final F(J)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lk2/D;->p:Lk2/A;

    .line 2
    .line 3
    iget-object v1, p0, Lk2/D;->o:Lk2/B;

    .line 4
    .line 5
    iget-object v2, v0, Lk2/A;->a:Lk2/H;

    .line 6
    .line 7
    iget-object v2, v2, Lk2/H;->a:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Lk2/B;->b(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, -0x1

    .line 14
    const/4 v3, 0x0

    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    return v3

    .line 18
    :cond_0
    iget-object v2, p0, Lk2/D;->o:Lk2/B;

    .line 19
    .line 20
    iget-object v4, p0, Lk2/D;->n:LN1/L;

    .line 21
    .line 22
    invoke-virtual {v2, v1, v4, v3}, Lk2/B;->f(ILN1/L;Z)LN1/L;

    .line 23
    .line 24
    .line 25
    iget-wide v1, v4, LN1/L;->d:J

    .line 26
    .line 27
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    cmp-long v3, v1, v3

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    cmp-long v3, p1, v1

    .line 37
    .line 38
    if-ltz v3, :cond_1

    .line 39
    .line 40
    const-wide/16 p1, 0x1

    .line 41
    .line 42
    sub-long/2addr v1, p1

    .line 43
    const-wide/16 p1, 0x0

    .line 44
    .line 45
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    :cond_1
    iput-wide p1, v0, Lk2/A;->g:J

    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    return p1
.end method

.method public final bridge synthetic b(Lk2/H;Lo2/e;J)Lk2/F;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lk2/D;->D(Lk2/H;Lo2/e;J)Lk2/A;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final j()V
    .locals 0

    .line 1
    return-void
.end method

.method public final n(Lk2/F;)V
    .locals 2

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lk2/A;

    .line 3
    .line 4
    iget-object v1, v0, Lk2/A;->e:Lk2/F;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v1, v0, Lk2/A;->d:Lk2/a;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lk2/A;->e:Lk2/F;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lk2/a;->n(Lk2/F;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lk2/D;->p:Lk2/A;

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput-object p1, p0, Lk2/D;->p:Lk2/A;

    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public final p()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lk2/D;->r:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lk2/D;->q:Z

    .line 5
    .line 6
    invoke-super {p0}, Lk2/l;->p()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final s(LN1/w;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lk2/D;->s:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lk2/D;->o:Lk2/B;

    .line 6
    .line 7
    new-instance v1, LU1/U;

    .line 8
    .line 9
    iget-object v2, p0, Lk2/D;->o:Lk2/B;

    .line 10
    .line 11
    iget-object v2, v2, Lk2/x;->b:LN1/N;

    .line 12
    .line 13
    invoke-direct {v1, v2, p1}, LU1/U;-><init>(LN1/N;LN1/w;)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Lk2/B;

    .line 17
    .line 18
    iget-object v3, v0, Lk2/B;->c:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v0, v0, Lk2/B;->d:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-direct {v2, v1, v3, v0}, Lk2/B;-><init>(LN1/N;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object v2, p0, Lk2/D;->o:Lk2/B;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v0, Lk2/B;

    .line 29
    .line 30
    new-instance v1, Lk2/C;

    .line 31
    .line 32
    invoke-direct {v1, p1}, Lk2/C;-><init>(LN1/w;)V

    .line 33
    .line 34
    .line 35
    sget-object v2, LN1/M;->q:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v3, Lk2/B;->e:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-direct {v0, v1, v2, v3}, Lk2/B;-><init>(LN1/N;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lk2/D;->o:Lk2/B;

    .line 43
    .line 44
    :goto_0
    iget-object v0, p0, Lk2/o0;->k:Lk2/a;

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Lk2/a;->s(LN1/w;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final z(Lk2/H;)Lk2/H;
    .locals 2

    .line 1
    iget-object v0, p1, Lk2/H;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Lk2/D;->o:Lk2/B;

    .line 4
    .line 5
    iget-object v1, v1, Lk2/B;->d:Ljava/lang/Object;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    sget-object v0, Lk2/B;->e:Ljava/lang/Object;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p1, v0}, Lk2/H;->a(Ljava/lang/Object;)Lk2/H;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method
