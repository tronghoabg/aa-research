.class public final LX1/d;
.super LN1/N;
.source "SourceFile"


# instance fields
.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:I

.field public final f:J

.field public final g:J

.field public final h:J

.field public final i:LY1/c;

.field public final j:LN1/w;

.field public final k:LN1/s;


# direct methods
.method public constructor <init>(JJJIJJJLY1/c;LN1/w;LN1/s;)V
    .locals 6

    .line 1
    move-object/from16 v0, p14

    .line 2
    .line 3
    move-object/from16 v1, p16

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-boolean v2, v0, LY1/c;->d:Z

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    move v5, v4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v5, v3

    .line 17
    :goto_0
    if-ne v2, v5, :cond_1

    .line 18
    .line 19
    move v3, v4

    .line 20
    :cond_1
    invoke-static {v3}, LQ1/k;->g(Z)V

    .line 21
    .line 22
    .line 23
    iput-wide p1, p0, LX1/d;->b:J

    .line 24
    .line 25
    iput-wide p3, p0, LX1/d;->c:J

    .line 26
    .line 27
    iput-wide p5, p0, LX1/d;->d:J

    .line 28
    .line 29
    iput p7, p0, LX1/d;->e:I

    .line 30
    .line 31
    iput-wide p8, p0, LX1/d;->f:J

    .line 32
    .line 33
    move-wide/from16 p1, p10

    .line 34
    .line 35
    iput-wide p1, p0, LX1/d;->g:J

    .line 36
    .line 37
    move-wide/from16 p1, p12

    .line 38
    .line 39
    iput-wide p1, p0, LX1/d;->h:J

    .line 40
    .line 41
    iput-object v0, p0, LX1/d;->i:LY1/c;

    .line 42
    .line 43
    move-object/from16 p1, p15

    .line 44
    .line 45
    iput-object p1, p0, LX1/d;->j:LN1/w;

    .line 46
    .line 47
    iput-object v1, p0, LX1/d;->k:LN1/s;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)I
    .locals 2

    .line 1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iget v0, p0, LX1/d;->e:I

    .line 14
    .line 15
    sub-int/2addr p1, v0

    .line 16
    if-ltz p1, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, LX1/d;->h()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-lt p1, v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    return p1

    .line 26
    :cond_2
    :goto_0
    return v1
.end method

.method public final f(ILN1/L;Z)LN1/L;
    .locals 13

    .line 1
    invoke-virtual {p0}, LX1/d;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, v0}, LQ1/k;->e(II)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iget-object v1, p0, LX1/d;->i:LY1/c;

    .line 10
    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1, p1}, LY1/c;->b(I)LY1/h;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v2, v2, LY1/h;->a:Ljava/lang/String;

    .line 18
    .line 19
    move-object v4, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v4, v0

    .line 22
    :goto_0
    if-eqz p3, :cond_1

    .line 23
    .line 24
    iget v0, p0, LX1/d;->e:I

    .line 25
    .line 26
    add-int/2addr v0, p1

    .line 27
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :cond_1
    move-object v5, v0

    .line 32
    invoke-virtual {v1, p1}, LY1/c;->d(I)J

    .line 33
    .line 34
    .line 35
    move-result-wide v7

    .line 36
    invoke-virtual {v1, p1}, LY1/c;->b(I)LY1/h;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-wide v2, p1, LY1/h;->b:J

    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    invoke-virtual {v1, p1}, LY1/c;->b(I)LY1/h;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-wide v0, p1, LY1/h;->b:J

    .line 48
    .line 49
    sub-long/2addr v2, v0

    .line 50
    invoke-static {v2, v3}, LQ1/x;->K(J)J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    iget-wide v2, p0, LX1/d;->f:J

    .line 55
    .line 56
    sub-long v9, v0, v2

    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    sget-object v11, LN1/b;->c:LN1/b;

    .line 62
    .line 63
    const/4 v12, 0x0

    .line 64
    const/4 v6, 0x0

    .line 65
    move-object v3, p2

    .line 66
    invoke-virtual/range {v3 .. v12}, LN1/L;->h(Ljava/lang/Object;Ljava/lang/Object;IJJLN1/b;Z)V

    .line 67
    .line 68
    .line 69
    return-object p2
.end method

.method public final h()I
    .locals 1

    .line 1
    iget-object v0, p0, LX1/d;->i:LY1/c;

    .line 2
    .line 3
    iget-object v0, v0, LY1/c;->m:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final l(I)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LX1/d;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, v0}, LQ1/k;->e(II)V

    .line 6
    .line 7
    .line 8
    iget v0, p0, LX1/d;->e:I

    .line 9
    .line 10
    add-int/2addr v0, p1

    .line 11
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final m(ILN1/M;J)LN1/M;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    move/from16 v2, p1

    .line 5
    .line 6
    invoke-static {v2, v1}, LQ1/k;->e(II)V

    .line 7
    .line 8
    .line 9
    iget-object v4, v0, LX1/d;->i:LY1/c;

    .line 10
    .line 11
    iget-boolean v2, v4, LY1/c;->d:Z

    .line 12
    .line 13
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iget-wide v7, v4, LY1/c;->e:J

    .line 22
    .line 23
    cmp-long v2, v7, v5

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iget-wide v7, v4, LY1/c;->b:J

    .line 28
    .line 29
    cmp-long v2, v7, v5

    .line 30
    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    move v2, v1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v2, v3

    .line 36
    :goto_0
    iget-wide v7, v0, LX1/d;->h:J

    .line 37
    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    move/from16 v16, v1

    .line 41
    .line 42
    move-wide/from16 v17, v5

    .line 43
    .line 44
    :cond_1
    :goto_1
    move-wide v14, v7

    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :cond_2
    const-wide/16 v9, 0x0

    .line 48
    .line 49
    cmp-long v2, p3, v9

    .line 50
    .line 51
    if-lez v2, :cond_3

    .line 52
    .line 53
    add-long v7, v7, p3

    .line 54
    .line 55
    iget-wide v11, v0, LX1/d;->g:J

    .line 56
    .line 57
    cmp-long v2, v7, v11

    .line 58
    .line 59
    if-lez v2, :cond_3

    .line 60
    .line 61
    move/from16 v16, v1

    .line 62
    .line 63
    move-wide v14, v5

    .line 64
    move-wide/from16 v17, v14

    .line 65
    .line 66
    goto/16 :goto_5

    .line 67
    .line 68
    :cond_3
    iget-wide v11, v0, LX1/d;->f:J

    .line 69
    .line 70
    add-long/2addr v11, v7

    .line 71
    invoke-virtual {v4, v3}, LY1/c;->d(I)J

    .line 72
    .line 73
    .line 74
    move-result-wide v13

    .line 75
    move v2, v3

    .line 76
    :goto_2
    iget-object v15, v4, LY1/c;->m:Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result v15

    .line 82
    sub-int/2addr v15, v1

    .line 83
    if-ge v2, v15, :cond_4

    .line 84
    .line 85
    cmp-long v15, v11, v13

    .line 86
    .line 87
    if-ltz v15, :cond_4

    .line 88
    .line 89
    sub-long/2addr v11, v13

    .line 90
    add-int/2addr v2, v1

    .line 91
    invoke-virtual {v4, v2}, LY1/c;->d(I)J

    .line 92
    .line 93
    .line 94
    move-result-wide v13

    .line 95
    goto :goto_2

    .line 96
    :cond_4
    invoke-virtual {v4, v2}, LY1/c;->b(I)LY1/h;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    iget-object v15, v2, LY1/h;->c:Ljava/util/List;

    .line 101
    .line 102
    move/from16 v16, v1

    .line 103
    .line 104
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    move-wide/from16 v17, v5

    .line 109
    .line 110
    move v5, v3

    .line 111
    :goto_3
    const/4 v6, -0x1

    .line 112
    if-ge v5, v1, :cond_6

    .line 113
    .line 114
    invoke-interface {v15, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v19

    .line 118
    move-wide/from16 v20, v9

    .line 119
    .line 120
    move-object/from16 v9, v19

    .line 121
    .line 122
    check-cast v9, LY1/a;

    .line 123
    .line 124
    iget v9, v9, LY1/a;->b:I

    .line 125
    .line 126
    const/4 v10, 0x2

    .line 127
    if-ne v9, v10, :cond_5

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 131
    .line 132
    move-wide/from16 v9, v20

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_6
    move-wide/from16 v20, v9

    .line 136
    .line 137
    move v5, v6

    .line 138
    :goto_4
    if-ne v5, v6, :cond_7

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_7
    iget-object v1, v2, LY1/h;->c:Ljava/util/List;

    .line 142
    .line 143
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    check-cast v1, LY1/a;

    .line 148
    .line 149
    iget-object v1, v1, LY1/a;->c:Ljava/util/List;

    .line 150
    .line 151
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    check-cast v1, LY1/m;

    .line 156
    .line 157
    invoke-virtual {v1}, LY1/m;->c()LX1/g;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    if-eqz v1, :cond_1

    .line 162
    .line 163
    invoke-interface {v1, v13, v14}, LX1/g;->w(J)J

    .line 164
    .line 165
    .line 166
    move-result-wide v5

    .line 167
    cmp-long v2, v5, v20

    .line 168
    .line 169
    if-nez v2, :cond_8

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_8
    invoke-interface {v1, v11, v12, v13, v14}, LX1/g;->v(JJ)J

    .line 173
    .line 174
    .line 175
    move-result-wide v5

    .line 176
    invoke-interface {v1, v5, v6}, LX1/g;->b(J)J

    .line 177
    .line 178
    .line 179
    move-result-wide v1

    .line 180
    add-long/2addr v1, v7

    .line 181
    sub-long v7, v1, v11

    .line 182
    .line 183
    goto/16 :goto_1

    .line 184
    .line 185
    :goto_5
    sget-object v1, LN1/M;->q:Ljava/lang/Object;

    .line 186
    .line 187
    iget-boolean v1, v4, LY1/c;->d:Z

    .line 188
    .line 189
    if-eqz v1, :cond_9

    .line 190
    .line 191
    iget-wide v1, v4, LY1/c;->e:J

    .line 192
    .line 193
    cmp-long v1, v1, v17

    .line 194
    .line 195
    if-eqz v1, :cond_9

    .line 196
    .line 197
    iget-wide v1, v4, LY1/c;->b:J

    .line 198
    .line 199
    cmp-long v1, v1, v17

    .line 200
    .line 201
    if-nez v1, :cond_9

    .line 202
    .line 203
    move/from16 v12, v16

    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_9
    move v12, v3

    .line 207
    :goto_6
    invoke-virtual {v0}, LX1/d;->h()I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    add-int/lit8 v18, v1, -0x1

    .line 212
    .line 213
    iget-object v13, v0, LX1/d;->k:LN1/s;

    .line 214
    .line 215
    iget-wide v1, v0, LX1/d;->g:J

    .line 216
    .line 217
    iget-object v3, v0, LX1/d;->j:LN1/w;

    .line 218
    .line 219
    iget-wide v5, v0, LX1/d;->b:J

    .line 220
    .line 221
    iget-wide v7, v0, LX1/d;->c:J

    .line 222
    .line 223
    iget-wide v9, v0, LX1/d;->d:J

    .line 224
    .line 225
    move/from16 p1, v12

    .line 226
    .line 227
    iget-wide v11, v0, LX1/d;->f:J

    .line 228
    .line 229
    move-wide/from16 v16, v1

    .line 230
    .line 231
    move-wide/from16 v19, v11

    .line 232
    .line 233
    const/4 v11, 0x1

    .line 234
    move/from16 v12, p1

    .line 235
    .line 236
    move-object/from16 v2, p2

    .line 237
    .line 238
    invoke-virtual/range {v2 .. v20}, LN1/M;->b(LN1/w;Ljava/lang/Object;JJJZZLN1/s;JJIJ)V

    .line 239
    .line 240
    .line 241
    return-object p2
.end method

.method public final o()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
