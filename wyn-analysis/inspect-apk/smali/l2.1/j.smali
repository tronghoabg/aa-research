.class public final Ll2/j;
.super Ll2/a;
.source "SourceFile"


# instance fields
.field public final o:I

.field public final p:J

.field public final q:Ll2/f;

.field public r:J

.field public volatile s:Z

.field public t:Z


# direct methods
.method public constructor <init>(LS1/h;LS1/k;LN1/n;ILjava/lang/Object;JJJJJIJLl2/f;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p15}, Ll2/a;-><init>(LS1/h;LS1/k;LN1/n;ILjava/lang/Object;JJJJJ)V

    .line 2
    .line 3
    .line 4
    move/from16 p1, p16

    .line 5
    .line 6
    iput p1, p0, Ll2/j;->o:I

    .line 7
    .line 8
    move-wide/from16 p1, p17

    .line 9
    .line 10
    iput-wide p1, p0, Ll2/j;->p:J

    .line 11
    .line 12
    move-object/from16 p1, p19

    .line 13
    .line 14
    iput-object p1, p0, Ll2/j;->q:Ll2/f;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 4

    .line 1
    iget v0, p0, Ll2/j;->o:I

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    iget-wide v2, p0, Ll2/l;->j:J

    .line 5
    .line 6
    add-long/2addr v2, v0

    .line 7
    return-wide v2
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll2/j;->t:Z

    .line 2
    .line 3
    return v0
.end method

.method public final g()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ll2/j;->s:Z

    .line 3
    .line 4
    return-void
.end method

.method public final load()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v3, v1, Ll2/a;->m:LY2/B;

    .line 4
    .line 5
    invoke-static {v3}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-wide v4, v1, Ll2/j;->r:J

    .line 9
    .line 10
    const-wide/16 v6, 0x0

    .line 11
    .line 12
    cmp-long v0, v4, v6

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v9, 0x1

    .line 16
    if-nez v0, :cond_4

    .line 17
    .line 18
    iget-wide v4, v1, Ll2/j;->p:J

    .line 19
    .line 20
    iget-object v0, v3, LY2/B;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, [Lk2/c0;

    .line 23
    .line 24
    array-length v2, v0

    .line 25
    move v6, v8

    .line 26
    :goto_0
    if-ge v6, v2, :cond_1

    .line 27
    .line 28
    aget-object v7, v0, v6

    .line 29
    .line 30
    iget-wide v10, v7, Lk2/c0;->F:J

    .line 31
    .line 32
    cmp-long v10, v10, v4

    .line 33
    .line 34
    if-eqz v10, :cond_0

    .line 35
    .line 36
    iput-wide v4, v7, Lk2/c0;->F:J

    .line 37
    .line 38
    iput-boolean v9, v7, Lk2/c0;->z:Z

    .line 39
    .line 40
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-object v0, v1, Ll2/j;->q:Ll2/f;

    .line 44
    .line 45
    iget-wide v4, v1, Ll2/a;->k:J

    .line 46
    .line 47
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    cmp-long v2, v4, v6

    .line 53
    .line 54
    if-nez v2, :cond_2

    .line 55
    .line 56
    move-wide v4, v6

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    iget-wide v10, v1, Ll2/j;->p:J

    .line 59
    .line 60
    sub-long/2addr v4, v10

    .line 61
    :goto_1
    iget-wide v10, v1, Ll2/a;->l:J

    .line 62
    .line 63
    cmp-long v2, v10, v6

    .line 64
    .line 65
    if-nez v2, :cond_3

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    iget-wide v6, v1, Ll2/j;->p:J

    .line 69
    .line 70
    sub-long v6, v10, v6

    .line 71
    .line 72
    :goto_2
    move-object v2, v0

    .line 73
    check-cast v2, Ll2/d;

    .line 74
    .line 75
    invoke-virtual/range {v2 .. v7}, Ll2/d;->a(LY2/B;JJ)V

    .line 76
    .line 77
    .line 78
    :cond_4
    :try_start_0
    iget-object v0, v1, Ll2/e;->b:LS1/k;

    .line 79
    .line 80
    iget-wide v4, v1, Ll2/j;->r:J

    .line 81
    .line 82
    invoke-virtual {v0, v4, v5}, LS1/k;->a(J)LS1/k;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    new-instance v10, Ls2/j;

    .line 87
    .line 88
    iget-object v11, v1, Ll2/e;->i:LS1/z;

    .line 89
    .line 90
    iget-wide v12, v0, LS1/k;->e:J

    .line 91
    .line 92
    invoke-virtual {v11, v0}, LS1/z;->y(LS1/k;)J

    .line 93
    .line 94
    .line 95
    move-result-wide v14

    .line 96
    invoke-direct/range {v10 .. v15}, Ls2/j;-><init>(LN1/g;JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 97
    .line 98
    .line 99
    :goto_3
    :try_start_1
    iget-boolean v0, v1, Ll2/j;->s:Z

    .line 100
    .line 101
    if-nez v0, :cond_7

    .line 102
    .line 103
    iget-object v0, v1, Ll2/j;->q:Ll2/f;

    .line 104
    .line 105
    check-cast v0, Ll2/d;

    .line 106
    .line 107
    sget-object v2, Ll2/d;->k:LJ5/n;

    .line 108
    .line 109
    iget-object v0, v0, Ll2/d;->a:Ls2/m;

    .line 110
    .line 111
    invoke-interface {v0, v10, v2}, Ls2/m;->k(Ls2/n;LJ5/n;)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eq v0, v9, :cond_5

    .line 116
    .line 117
    move v2, v9

    .line 118
    goto :goto_4

    .line 119
    :cond_5
    move v2, v8

    .line 120
    :goto_4
    invoke-static {v2}, LQ1/k;->g(Z)V

    .line 121
    .line 122
    .line 123
    if-nez v0, :cond_6

    .line 124
    .line 125
    move v0, v9

    .line 126
    goto :goto_5

    .line 127
    :cond_6
    move v0, v8

    .line 128
    :goto_5
    if-eqz v0, :cond_7

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :catchall_0
    move-exception v0

    .line 132
    goto :goto_8

    .line 133
    :cond_7
    iget-object v0, v1, Ll2/e;->d:LN1/n;

    .line 134
    .line 135
    iget-object v2, v0, LN1/n;->m:Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {v2}, LN1/C;->j(Ljava/lang/String;)Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-nez v2, :cond_8

    .line 142
    .line 143
    goto :goto_7

    .line 144
    :cond_8
    iget v2, v0, LN1/n;->J:I

    .line 145
    .line 146
    iget v0, v0, LN1/n;->K:I

    .line 147
    .line 148
    if-gt v2, v9, :cond_9

    .line 149
    .line 150
    if-le v0, v9, :cond_b

    .line 151
    .line 152
    :cond_9
    const/4 v4, -0x1

    .line 153
    if-eq v2, v4, :cond_b

    .line 154
    .line 155
    if-ne v0, v4, :cond_a

    .line 156
    .line 157
    goto :goto_7

    .line 158
    :cond_a
    const/4 v4, 0x4

    .line 159
    invoke-virtual {v3, v4}, LY2/B;->F(I)Ls2/C;

    .line 160
    .line 161
    .line 162
    move-result-object v11

    .line 163
    mul-int/2addr v2, v0

    .line 164
    iget-wide v3, v1, Ll2/e;->h:J

    .line 165
    .line 166
    iget-wide v5, v1, Ll2/e;->g:J

    .line 167
    .line 168
    sub-long/2addr v3, v5

    .line 169
    int-to-long v5, v2

    .line 170
    div-long/2addr v3, v5

    .line 171
    move v0, v9

    .line 172
    :goto_6
    if-ge v0, v2, :cond_b

    .line 173
    .line 174
    int-to-long v5, v0

    .line 175
    mul-long v12, v5, v3

    .line 176
    .line 177
    new-instance v5, LQ1/o;

    .line 178
    .line 179
    invoke-direct {v5}, LQ1/o;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-interface {v11, v8, v5}, Ls2/C;->e(ILQ1/o;)V

    .line 183
    .line 184
    .line 185
    const/16 v16, 0x0

    .line 186
    .line 187
    const/16 v17, 0x0

    .line 188
    .line 189
    const/4 v14, 0x0

    .line 190
    const/4 v15, 0x0

    .line 191
    invoke-interface/range {v11 .. v17}, Ls2/C;->a(JIIILs2/B;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 192
    .line 193
    .line 194
    add-int/lit8 v0, v0, 0x1

    .line 195
    .line 196
    goto :goto_6

    .line 197
    :cond_b
    :goto_7
    :try_start_2
    iget-wide v2, v10, Ls2/j;->d:J

    .line 198
    .line 199
    iget-object v0, v1, Ll2/e;->b:LS1/k;

    .line 200
    .line 201
    iget-wide v4, v0, LS1/k;->e:J

    .line 202
    .line 203
    sub-long/2addr v2, v4

    .line 204
    iput-wide v2, v1, Ll2/j;->r:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 205
    .line 206
    iget-object v0, v1, Ll2/e;->i:LS1/z;

    .line 207
    .line 208
    invoke-static {v0}, LFe/b;->m(LS1/h;)V

    .line 209
    .line 210
    .line 211
    iget-boolean v0, v1, Ll2/j;->s:Z

    .line 212
    .line 213
    xor-int/2addr v0, v9

    .line 214
    iput-boolean v0, v1, Ll2/j;->t:Z

    .line 215
    .line 216
    return-void

    .line 217
    :catchall_1
    move-exception v0

    .line 218
    goto :goto_9

    .line 219
    :goto_8
    :try_start_3
    iget-wide v2, v10, Ls2/j;->d:J

    .line 220
    .line 221
    iget-object v4, v1, Ll2/e;->b:LS1/k;

    .line 222
    .line 223
    iget-wide v4, v4, LS1/k;->e:J

    .line 224
    .line 225
    sub-long/2addr v2, v4

    .line 226
    iput-wide v2, v1, Ll2/j;->r:J

    .line 227
    .line 228
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 229
    :goto_9
    iget-object v2, v1, Ll2/e;->i:LS1/z;

    .line 230
    .line 231
    invoke-static {v2}, LFe/b;->m(LS1/h;)V

    .line 232
    .line 233
    .line 234
    throw v0
.end method
