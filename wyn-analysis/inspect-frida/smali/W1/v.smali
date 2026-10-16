.class public final LW1/v;
.super Ld2/q;
.source "SourceFile"

# interfaces
.implements LU1/D;


# instance fields
.field public final C0:Landroid/content/Context;

.field public final D0:LS3/s;

.field public final E0:LW1/t;

.field public final F0:LDd/c;

.field public G0:I

.field public H0:Z

.field public I0:Z

.field public J0:LN1/n;

.field public K0:LN1/n;

.field public L0:J

.field public M0:Z

.field public N0:Z

.field public O0:Z

.field public P0:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ld2/i;Landroid/os/Handler;LU1/r;LW1/t;)V
    .locals 3

    .line 1
    sget v0, LQ1/x;->a:I

    .line 2
    .line 3
    const/16 v1, 0x23

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, LDd/c;

    .line 8
    .line 9
    const/16 v1, 0x16

    .line 10
    .line 11
    invoke-direct {v0, v1}, LDd/c;-><init>(I)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    const/4 v1, 0x1

    .line 17
    const v2, 0x472c4400    # 44100.0f

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, v1, p2, v2}, Ld2/q;-><init>(ILd2/i;F)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, LW1/v;->C0:Landroid/content/Context;

    .line 28
    .line 29
    iput-object p5, p0, LW1/v;->E0:LW1/t;

    .line 30
    .line 31
    iput-object v0, p0, LW1/v;->F0:LDd/c;

    .line 32
    .line 33
    const/16 p1, -0x3e8

    .line 34
    .line 35
    iput p1, p0, LW1/v;->P0:I

    .line 36
    .line 37
    new-instance p1, LS3/s;

    .line 38
    .line 39
    const/16 p2, 0x1b

    .line 40
    .line 41
    invoke-direct {p1, p2, p3, p4}, LS3/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, LW1/v;->D0:LS3/s;

    .line 45
    .line 46
    new-instance p1, Lxa/d;

    .line 47
    .line 48
    const/16 p2, 0x18

    .line 49
    .line 50
    invoke-direct {p1, p0, p2}, Lxa/d;-><init>(Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p5, LW1/t;->r:Lxa/d;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final B()LU1/D;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final B0(LN1/n;)Z
    .locals 4

    .line 1
    iget-object v0, p0, LU1/d;->d:LU1/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v0, v0, LU1/Y;->a:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, p1}, LW1/v;->G0(LN1/n;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    and-int/lit16 v2, v0, 0x200

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v2, p0, LU1/d;->d:LU1/Y;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget v2, v2, LU1/Y;->a:I

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    if-eq v2, v3, :cond_0

    .line 28
    .line 29
    and-int/lit16 v0, v0, 0x400

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    iget v0, p1, LN1/n;->F:I

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    iget v0, p1, LN1/n;->G:I

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    :cond_0
    return v1

    .line 42
    :cond_1
    iget-object v0, p0, LW1/v;->E0:LW1/t;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, LW1/t;->i(LN1/n;)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    return v1

    .line 51
    :cond_2
    const/4 p1, 0x0

    .line 52
    return p1
.end method

.method public final C0(Ld2/h;LN1/n;)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v1, LN1/n;->n:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v2}, LN1/C;->i(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    invoke-static {v3, v3, v3, v3}, LR8/v;->a(IIII)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    return v1

    .line 19
    :cond_0
    const/4 v2, 0x1

    .line 20
    iget v4, v1, LN1/n;->L:I

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    move v5, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v5, v3

    .line 27
    :goto_0
    const/4 v6, 0x2

    .line 28
    if-eqz v4, :cond_3

    .line 29
    .line 30
    if-ne v4, v6, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    move v4, v3

    .line 34
    goto :goto_2

    .line 35
    :cond_3
    :goto_1
    move v4, v2

    .line 36
    :goto_2
    const/16 v7, 0x20

    .line 37
    .line 38
    const/4 v8, 0x0

    .line 39
    const-string v9, "audio/raw"

    .line 40
    .line 41
    const/16 v10, 0x8

    .line 42
    .line 43
    const/4 v11, 0x4

    .line 44
    iget-object v12, v0, LW1/v;->E0:LW1/t;

    .line 45
    .line 46
    if-eqz v4, :cond_6

    .line 47
    .line 48
    if-eqz v5, :cond_5

    .line 49
    .line 50
    invoke-static {v9, v3, v3}, Ld2/v;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    if-eqz v13, :cond_4

    .line 59
    .line 60
    move-object v5, v8

    .line 61
    goto :goto_3

    .line 62
    :cond_4
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    check-cast v5, Ld2/m;

    .line 67
    .line 68
    :goto_3
    if-eqz v5, :cond_6

    .line 69
    .line 70
    :cond_5
    invoke-virtual {v0, v1}, LW1/v;->G0(LN1/n;)I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    invoke-virtual {v12, v1}, LW1/t;->i(LN1/n;)I

    .line 75
    .line 76
    .line 77
    move-result v13

    .line 78
    if-eqz v13, :cond_7

    .line 79
    .line 80
    invoke-static {v11, v10, v7, v5}, LR8/v;->a(IIII)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    return v1

    .line 85
    :cond_6
    move v5, v3

    .line 86
    :cond_7
    iget-object v13, v1, LN1/n;->n:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v14

    .line 92
    if-eqz v14, :cond_9

    .line 93
    .line 94
    invoke-virtual {v12, v1}, LW1/t;->i(LN1/n;)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    if-eqz v14, :cond_8

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_8
    invoke-static {v2, v3, v3, v3}, LR8/v;->a(IIII)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    return v1

    .line 106
    :cond_9
    :goto_4
    new-instance v14, LN1/m;

    .line 107
    .line 108
    invoke-direct {v14}, LN1/m;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-static {v9}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v15

    .line 115
    iput-object v15, v14, LN1/m;->m:Ljava/lang/String;

    .line 116
    .line 117
    iget v15, v1, LN1/n;->C:I

    .line 118
    .line 119
    iput v15, v14, LN1/m;->B:I

    .line 120
    .line 121
    iget v15, v1, LN1/n;->D:I

    .line 122
    .line 123
    iput v15, v14, LN1/m;->C:I

    .line 124
    .line 125
    iput v6, v14, LN1/m;->D:I

    .line 126
    .line 127
    new-instance v15, LN1/n;

    .line 128
    .line 129
    invoke-direct {v15, v14}, LN1/n;-><init>(LN1/m;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12, v15}, LW1/t;->i(LN1/n;)I

    .line 133
    .line 134
    .line 135
    move-result v14

    .line 136
    if-eqz v14, :cond_15

    .line 137
    .line 138
    if-nez v13, :cond_a

    .line 139
    .line 140
    sget-object v8, Ll8/e0;->e:Ll8/e0;

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_a
    invoke-virtual {v12, v1}, LW1/t;->i(LN1/n;)I

    .line 144
    .line 145
    .line 146
    move-result v12

    .line 147
    if-eqz v12, :cond_c

    .line 148
    .line 149
    invoke-static {v9, v3, v3}, Ld2/v;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result v12

    .line 157
    if-eqz v12, :cond_b

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_b
    invoke-interface {v9, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    check-cast v8, Ld2/m;

    .line 165
    .line 166
    :goto_5
    if-eqz v8, :cond_c

    .line 167
    .line 168
    invoke-static {v8}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    goto :goto_6

    .line 173
    :cond_c
    move-object/from16 v8, p1

    .line 174
    .line 175
    invoke-static {v8, v1, v3, v3}, Ld2/v;->g(Ld2/h;LN1/n;ZZ)Ll8/e0;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    :goto_6
    invoke-virtual {v8}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 180
    .line 181
    .line 182
    move-result v9

    .line 183
    if-eqz v9, :cond_d

    .line 184
    .line 185
    invoke-static {v2, v3, v3, v3}, LR8/v;->a(IIII)I

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    return v1

    .line 190
    :cond_d
    if-nez v4, :cond_e

    .line 191
    .line 192
    invoke-static {v6, v3, v3, v3}, LR8/v;->a(IIII)I

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    return v1

    .line 197
    :cond_e
    invoke-virtual {v8, v3}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    check-cast v4, Ld2/m;

    .line 202
    .line 203
    invoke-virtual {v4, v1}, Ld2/m;->d(LN1/n;)Z

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    if-nez v6, :cond_10

    .line 208
    .line 209
    move v9, v2

    .line 210
    :goto_7
    iget v12, v8, Ll8/e0;->d:I

    .line 211
    .line 212
    if-ge v9, v12, :cond_10

    .line 213
    .line 214
    invoke-virtual {v8, v9}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    check-cast v12, Ld2/m;

    .line 219
    .line 220
    invoke-virtual {v12, v1}, Ld2/m;->d(LN1/n;)Z

    .line 221
    .line 222
    .line 223
    move-result v13

    .line 224
    if-eqz v13, :cond_f

    .line 225
    .line 226
    move v4, v3

    .line 227
    goto :goto_8

    .line 228
    :cond_f
    add-int/lit8 v9, v9, 0x1

    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_10
    move-object v12, v4

    .line 232
    move v4, v2

    .line 233
    move v2, v6

    .line 234
    :goto_8
    if-eqz v2, :cond_11

    .line 235
    .line 236
    goto :goto_9

    .line 237
    :cond_11
    const/4 v11, 0x3

    .line 238
    :goto_9
    if-eqz v2, :cond_12

    .line 239
    .line 240
    invoke-virtual {v12, v1}, Ld2/m;->e(LN1/n;)Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-eqz v1, :cond_12

    .line 245
    .line 246
    const/16 v10, 0x10

    .line 247
    .line 248
    :cond_12
    iget-boolean v1, v12, Ld2/m;->g:Z

    .line 249
    .line 250
    if-eqz v1, :cond_13

    .line 251
    .line 252
    const/16 v1, 0x40

    .line 253
    .line 254
    goto :goto_a

    .line 255
    :cond_13
    move v1, v3

    .line 256
    :goto_a
    if-eqz v4, :cond_14

    .line 257
    .line 258
    const/16 v3, 0x80

    .line 259
    .line 260
    :cond_14
    or-int v2, v11, v10

    .line 261
    .line 262
    or-int/2addr v2, v7

    .line 263
    or-int/2addr v1, v2

    .line 264
    or-int/2addr v1, v3

    .line 265
    or-int/2addr v1, v5

    .line 266
    return v1

    .line 267
    :cond_15
    invoke-static {v2, v3, v3, v3}, LR8/v;->a(IIII)I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    return v1
.end method

.method public final D()V
    .locals 3

    .line 1
    iget-object v0, p0, LW1/v;->D0:LS3/s;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, LW1/v;->N0:Z

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, LW1/v;->J0:LN1/n;

    .line 8
    .line 9
    :try_start_0
    iget-object v1, p0, LW1/v;->E0:LW1/t;

    .line 10
    .line 11
    invoke-virtual {v1}, LW1/t;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    .line 13
    .line 14
    :try_start_1
    invoke-super {p0}, Ld2/q;->D()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Ld2/q;->x0:LH5/e;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, LS3/s;->l(LH5/e;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    iget-object v2, p0, Ld2/q;->x0:LH5/e;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, LS3/s;->l(LH5/e;)V

    .line 27
    .line 28
    .line 29
    throw v1

    .line 30
    :catchall_1
    move-exception v1

    .line 31
    :try_start_2
    invoke-super {p0}, Ld2/q;->D()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, Ld2/q;->x0:LH5/e;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, LS3/s;->l(LH5/e;)V

    .line 37
    .line 38
    .line 39
    throw v1

    .line 40
    :catchall_2
    move-exception v1

    .line 41
    iget-object v2, p0, Ld2/q;->x0:LH5/e;

    .line 42
    .line 43
    invoke-virtual {v0, v2}, LS3/s;->l(LH5/e;)V

    .line 44
    .line 45
    .line 46
    throw v1
.end method

.method public final E(ZZ)V
    .locals 3

    .line 1
    new-instance p1, LH5/e;

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    invoke-direct {p1, p2}, LH5/e;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ld2/q;->x0:LH5/e;

    .line 8
    .line 9
    iget-object p2, p0, LW1/v;->D0:LS3/s;

    .line 10
    .line 11
    iget-object v0, p2, LS3/s;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/os/Handler;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance v1, LW1/f;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v1, p2, p1, v2}, LW1/f;-><init>(LS3/s;Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object p1, p0, LU1/d;->d:LU1/Y;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-boolean p1, p1, LU1/Y;->b:Z

    .line 32
    .line 33
    iget-object p2, p0, LW1/v;->E0:LW1/t;

    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    iget-boolean p1, p2, LW1/t;->W:Z

    .line 38
    .line 39
    invoke-static {p1}, LQ1/k;->g(Z)V

    .line 40
    .line 41
    .line 42
    iget-boolean p1, p2, LW1/t;->a0:Z

    .line 43
    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    const/4 p1, 0x1

    .line 47
    iput-boolean p1, p2, LW1/t;->a0:Z

    .line 48
    .line 49
    invoke-virtual {p2}, LW1/t;->g()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget-boolean p1, p2, LW1/t;->a0:Z

    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    iput-boolean p1, p2, LW1/t;->a0:Z

    .line 59
    .line 60
    invoke-virtual {p2}, LW1/t;->g()V

    .line 61
    .line 62
    .line 63
    :cond_2
    :goto_0
    iget-object p1, p0, LU1/d;->f:LV1/k;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iput-object p1, p2, LW1/t;->q:LV1/k;

    .line 69
    .line 70
    iget-object p1, p0, LU1/d;->g:LQ1/q;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-object p2, p2, LW1/t;->g:LW1/l;

    .line 76
    .line 77
    iput-object p1, p2, LW1/l;->I:LQ1/q;

    .line 78
    .line 79
    return-void
.end method

.method public final F(JZ)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Ld2/q;->F(JZ)V

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, LW1/v;->E0:LW1/t;

    .line 5
    .line 6
    invoke-virtual {p3}, LW1/t;->g()V

    .line 7
    .line 8
    .line 9
    iput-wide p1, p0, LW1/v;->L0:J

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-boolean p1, p0, LW1/v;->O0:Z

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, LW1/v;->M0:Z

    .line 16
    .line 17
    return-void
.end method

.method public final G()V
    .locals 4

    .line 1
    iget-object v0, p0, LW1/v;->E0:LW1/t;

    .line 2
    .line 3
    iget-object v0, v0, LW1/t;->x:LJ9/o;

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-boolean v1, v0, LJ9/o;->a:Z

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    iput-object v1, v0, LJ9/o;->h:Ljava/lang/Object;

    .line 14
    .line 15
    sget v1, LQ1/x;->a:I

    .line 16
    .line 17
    const/16 v2, 0x17

    .line 18
    .line 19
    iget-object v3, v0, LJ9/o;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Landroid/content/Context;

    .line 22
    .line 23
    if-lt v1, v2, :cond_1

    .line 24
    .line 25
    iget-object v1, v0, LJ9/o;->e:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, LW1/c;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    const-string v2, "audio"

    .line 32
    .line 33
    invoke-virtual {v3, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Landroid/media/AudioManager;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v1}, Landroid/media/AudioManager;->unregisterAudioDeviceCallback(Landroid/media/AudioDeviceCallback;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    iget-object v1, v0, LJ9/o;->f:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, LA7/V1;

    .line 48
    .line 49
    invoke-virtual {v3, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, v0, LJ9/o;->g:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, LW1/d;

    .line 55
    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    iget-object v2, v1, LW1/d;->a:Landroid/content/ContentResolver;

    .line 59
    .line 60
    invoke-virtual {v2, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    const/4 v1, 0x0

    .line 64
    iput-boolean v1, v0, LJ9/o;->a:Z

    .line 65
    .line 66
    :cond_3
    :goto_0
    sget v0, LQ1/x;->a:I

    .line 67
    .line 68
    const/16 v1, 0x23

    .line 69
    .line 70
    if-lt v0, v1, :cond_4

    .line 71
    .line 72
    iget-object v0, p0, LW1/v;->F0:LDd/c;

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    iget-object v1, v0, LDd/c;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, Ljava/util/HashSet;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    .line 81
    .line 82
    .line 83
    iget-object v0, v0, LDd/c;->d:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Landroid/media/LoudnessCodecController;

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    invoke-static {v0}, Lcom/applovin/impl/sdk/y;->k(Landroid/media/LoudnessCodecController;)V

    .line 90
    .line 91
    .line 92
    :cond_4
    return-void
.end method

.method public final G0(LN1/n;)I
    .locals 1

    .line 1
    iget-object v0, p0, LW1/v;->E0:LW1/t;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LW1/t;->h(LN1/n;)LW1/e;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-boolean v0, p1, LW1/e;->a:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_0
    iget-boolean v0, p1, LW1/e;->b:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x600

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/16 v0, 0x200

    .line 21
    .line 22
    :goto_0
    iget-boolean p1, p1, LW1/e;->c:Z

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    or-int/lit16 p1, v0, 0x800

    .line 27
    .line 28
    return p1

    .line 29
    :cond_2
    return v0
.end method

.method public final H()V
    .locals 5

    .line 1
    iget-object v0, p0, LW1/v;->E0:LW1/t;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, LW1/v;->O0:Z

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    :try_start_0
    invoke-virtual {p0}, Ld2/q;->P()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ld2/q;->t0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    .line 12
    .line 13
    :try_start_1
    iget-object v3, p0, Ld2/q;->E:LS3/l;

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v3, v2}, LS3/l;->s(LZ1/d;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    iput-object v2, p0, Ld2/q;->E:LS3/l;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    iget-boolean v2, p0, LW1/v;->N0:Z

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    iput-boolean v1, p0, LW1/v;->N0:Z

    .line 28
    .line 29
    invoke-virtual {v0}, LW1/t;->u()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void

    .line 33
    :catchall_0
    move-exception v2

    .line 34
    goto :goto_1

    .line 35
    :catchall_1
    move-exception v3

    .line 36
    :try_start_2
    iget-object v4, p0, Ld2/q;->E:LS3/l;

    .line 37
    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    invoke-virtual {v4, v2}, LS3/l;->s(LZ1/d;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    iput-object v2, p0, Ld2/q;->E:LS3/l;

    .line 44
    .line 45
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 46
    :goto_1
    iget-boolean v3, p0, LW1/v;->N0:Z

    .line 47
    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    iput-boolean v1, p0, LW1/v;->N0:Z

    .line 51
    .line 52
    invoke-virtual {v0}, LW1/t;->u()V

    .line 53
    .line 54
    .line 55
    :cond_3
    throw v2
.end method

.method public final H0(Ld2/m;LN1/n;)I
    .locals 1

    .line 1
    const-string v0, "OMX.google.raw.decoder"

    .line 2
    .line 3
    iget-object p1, p1, Ld2/m;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    sget p1, LQ1/x;->a:I

    .line 12
    .line 13
    const/16 v0, 0x18

    .line 14
    .line 15
    if-ge p1, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x17

    .line 18
    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, LW1/v;->C0:Landroid/content/Context;

    .line 22
    .line 23
    invoke-static {p1}, LQ1/x;->I(Landroid/content/Context;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    :cond_0
    const/4 p1, -0x1

    .line 30
    return p1

    .line 31
    :cond_1
    iget p1, p2, LN1/n;->o:I

    .line 32
    .line 33
    return p1
.end method

.method public final I()V
    .locals 1

    .line 1
    iget-object v0, p0, LW1/v;->E0:LW1/t;

    .line 2
    .line 3
    invoke-virtual {v0}, LW1/t;->r()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final I0()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, LW1/v;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, v0, LW1/v;->E0:LW1/t;

    .line 8
    .line 9
    invoke-virtual {v2}, LW1/t;->o()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const-wide/high16 v4, -0x8000000000000000L

    .line 14
    .line 15
    if-eqz v3, :cond_7

    .line 16
    .line 17
    iget-boolean v3, v2, LW1/t;->M:Z

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    goto/16 :goto_3

    .line 22
    .line 23
    :cond_0
    iget-object v3, v2, LW1/t;->g:LW1/l;

    .line 24
    .line 25
    invoke-virtual {v3, v1}, LW1/l;->a(Z)J

    .line 26
    .line 27
    .line 28
    move-result-wide v6

    .line 29
    iget-object v1, v2, LW1/t;->t:LW1/n;

    .line 30
    .line 31
    invoke-virtual {v2}, LW1/t;->k()J

    .line 32
    .line 33
    .line 34
    move-result-wide v8

    .line 35
    iget v1, v1, LW1/n;->e:I

    .line 36
    .line 37
    invoke-static {v1, v8, v9}, LQ1/x;->Q(IJ)J

    .line 38
    .line 39
    .line 40
    move-result-wide v8

    .line 41
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    :goto_0
    iget-object v1, v2, LW1/t;->h:Ljava/util/ArrayDeque;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-nez v3, :cond_1

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, LW1/o;

    .line 58
    .line 59
    iget-wide v8, v3, LW1/o;->c:J

    .line 60
    .line 61
    cmp-long v3, v6, v8

    .line 62
    .line 63
    if-ltz v3, :cond_1

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, LW1/o;

    .line 70
    .line 71
    iput-object v1, v2, LW1/t;->B:LW1/o;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    iget-object v3, v2, LW1/t;->B:LW1/o;

    .line 75
    .line 76
    iget-wide v8, v3, LW1/o;->c:J

    .line 77
    .line 78
    sub-long v10, v6, v8

    .line 79
    .line 80
    iget-object v3, v3, LW1/o;->a:LN1/F;

    .line 81
    .line 82
    iget v3, v3, LN1/F;->a:F

    .line 83
    .line 84
    invoke-static {v10, v11, v3}, LQ1/x;->w(JF)J

    .line 85
    .line 86
    .line 87
    move-result-wide v6

    .line 88
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    iget-object v3, v2, LW1/t;->b:Lb7/k;

    .line 93
    .line 94
    if-eqz v1, :cond_5

    .line 95
    .line 96
    iget-object v1, v3, Lb7/k;->d:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v1, LO1/g;

    .line 99
    .line 100
    invoke-virtual {v1}, LO1/g;->isActive()Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-eqz v8, :cond_4

    .line 105
    .line 106
    iget-wide v8, v1, LO1/g;->o:J

    .line 107
    .line 108
    const-wide/16 v12, 0x400

    .line 109
    .line 110
    cmp-long v8, v8, v12

    .line 111
    .line 112
    if-ltz v8, :cond_3

    .line 113
    .line 114
    iget-wide v8, v1, LO1/g;->n:J

    .line 115
    .line 116
    iget-object v12, v1, LO1/g;->j:LO1/f;

    .line 117
    .line 118
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    iget v13, v12, LO1/f;->k:I

    .line 122
    .line 123
    iget v12, v12, LO1/f;->b:I

    .line 124
    .line 125
    mul-int/2addr v13, v12

    .line 126
    mul-int/lit8 v13, v13, 0x2

    .line 127
    .line 128
    int-to-long v12, v13

    .line 129
    sub-long v12, v8, v12

    .line 130
    .line 131
    iget-object v8, v1, LO1/g;->h:LO1/b;

    .line 132
    .line 133
    iget v8, v8, LO1/b;->a:I

    .line 134
    .line 135
    iget-object v9, v1, LO1/g;->g:LO1/b;

    .line 136
    .line 137
    iget v9, v9, LO1/b;->a:I

    .line 138
    .line 139
    if-ne v8, v9, :cond_2

    .line 140
    .line 141
    iget-wide v14, v1, LO1/g;->o:J

    .line 142
    .line 143
    sget-object v16, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 144
    .line 145
    invoke-static/range {v10 .. v16}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 146
    .line 147
    .line 148
    move-result-wide v10

    .line 149
    goto :goto_1

    .line 150
    :cond_2
    int-to-long v14, v8

    .line 151
    mul-long/2addr v12, v14

    .line 152
    iget-wide v14, v1, LO1/g;->o:J

    .line 153
    .line 154
    int-to-long v8, v9

    .line 155
    mul-long/2addr v14, v8

    .line 156
    sget-object v16, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 157
    .line 158
    invoke-static/range {v10 .. v16}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 159
    .line 160
    .line 161
    move-result-wide v10

    .line 162
    goto :goto_1

    .line 163
    :cond_3
    iget v1, v1, LO1/g;->c:F

    .line 164
    .line 165
    float-to-double v8, v1

    .line 166
    long-to-double v10, v10

    .line 167
    mul-double/2addr v8, v10

    .line 168
    double-to-long v10, v8

    .line 169
    :cond_4
    :goto_1
    iget-object v1, v2, LW1/t;->B:LW1/o;

    .line 170
    .line 171
    iget-wide v8, v1, LW1/o;->b:J

    .line 172
    .line 173
    add-long/2addr v8, v10

    .line 174
    sub-long/2addr v10, v6

    .line 175
    iput-wide v10, v1, LW1/o;->d:J

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_5
    iget-object v1, v2, LW1/t;->B:LW1/o;

    .line 179
    .line 180
    iget-wide v8, v1, LW1/o;->b:J

    .line 181
    .line 182
    add-long/2addr v8, v6

    .line 183
    iget-wide v6, v1, LW1/o;->d:J

    .line 184
    .line 185
    add-long/2addr v8, v6

    .line 186
    :goto_2
    iget-object v1, v3, Lb7/k;->c:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v1, LW1/x;

    .line 189
    .line 190
    iget-wide v6, v1, LW1/x;->q:J

    .line 191
    .line 192
    iget-object v1, v2, LW1/t;->t:LW1/n;

    .line 193
    .line 194
    iget v1, v1, LW1/n;->e:I

    .line 195
    .line 196
    invoke-static {v1, v6, v7}, LQ1/x;->Q(IJ)J

    .line 197
    .line 198
    .line 199
    move-result-wide v10

    .line 200
    add-long/2addr v10, v8

    .line 201
    iget-wide v8, v2, LW1/t;->g0:J

    .line 202
    .line 203
    cmp-long v1, v6, v8

    .line 204
    .line 205
    if-lez v1, :cond_8

    .line 206
    .line 207
    iget-object v1, v2, LW1/t;->t:LW1/n;

    .line 208
    .line 209
    sub-long v8, v6, v8

    .line 210
    .line 211
    iget v1, v1, LW1/n;->e:I

    .line 212
    .line 213
    invoke-static {v1, v8, v9}, LQ1/x;->Q(IJ)J

    .line 214
    .line 215
    .line 216
    move-result-wide v8

    .line 217
    iput-wide v6, v2, LW1/t;->g0:J

    .line 218
    .line 219
    iget-wide v6, v2, LW1/t;->h0:J

    .line 220
    .line 221
    add-long/2addr v6, v8

    .line 222
    iput-wide v6, v2, LW1/t;->h0:J

    .line 223
    .line 224
    iget-object v1, v2, LW1/t;->i0:Landroid/os/Handler;

    .line 225
    .line 226
    if-nez v1, :cond_6

    .line 227
    .line 228
    new-instance v1, Landroid/os/Handler;

    .line 229
    .line 230
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 235
    .line 236
    .line 237
    iput-object v1, v2, LW1/t;->i0:Landroid/os/Handler;

    .line 238
    .line 239
    :cond_6
    iget-object v1, v2, LW1/t;->i0:Landroid/os/Handler;

    .line 240
    .line 241
    const/4 v3, 0x0

    .line 242
    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    iget-object v1, v2, LW1/t;->i0:Landroid/os/Handler;

    .line 246
    .line 247
    new-instance v3, LC8/g;

    .line 248
    .line 249
    const/16 v6, 0x11

    .line 250
    .line 251
    invoke-direct {v3, v2, v6}, LC8/g;-><init>(Ljava/lang/Object;I)V

    .line 252
    .line 253
    .line 254
    const-wide/16 v6, 0x64

    .line 255
    .line 256
    invoke-virtual {v1, v3, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 257
    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_7
    :goto_3
    move-wide v10, v4

    .line 261
    :cond_8
    :goto_4
    cmp-long v1, v10, v4

    .line 262
    .line 263
    if-eqz v1, :cond_a

    .line 264
    .line 265
    iget-boolean v1, v0, LW1/v;->M0:Z

    .line 266
    .line 267
    if-eqz v1, :cond_9

    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_9
    iget-wide v1, v0, LW1/v;->L0:J

    .line 271
    .line 272
    invoke-static {v1, v2, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 273
    .line 274
    .line 275
    move-result-wide v10

    .line 276
    :goto_5
    iput-wide v10, v0, LW1/v;->L0:J

    .line 277
    .line 278
    const/4 v1, 0x0

    .line 279
    iput-boolean v1, v0, LW1/v;->M0:Z

    .line 280
    .line 281
    :cond_a
    return-void
.end method

.method public final J()V
    .locals 6

    .line 1
    invoke-virtual {p0}, LW1/v;->I0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iget-object v1, p0, LW1/v;->E0:LW1/t;

    .line 6
    .line 7
    iput-boolean v0, v1, LW1/t;->V:Z

    .line 8
    .line 9
    invoke-virtual {v1}, LW1/t;->o()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, v1, LW1/t;->g:LW1/l;

    .line 16
    .line 17
    invoke-virtual {v0}, LW1/l;->d()V

    .line 18
    .line 19
    .line 20
    iget-wide v2, v0, LW1/l;->x:J

    .line 21
    .line 22
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v2, v2, v4

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    iget-object v0, v0, LW1/l;->e:LG5/v;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, LG5/v;->a()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {v0}, LW1/l;->b()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    iput-wide v2, v0, LW1/l;->z:J

    .line 45
    .line 46
    iget-object v0, v1, LW1/t;->v:Landroid/media/AudioTrack;

    .line 47
    .line 48
    invoke-static {v0}, LW1/t;->p(Landroid/media/AudioTrack;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    :goto_0
    iget-object v0, v1, LW1/t;->v:Landroid/media/AudioTrack;

    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void
.end method

.method public final N(Ld2/m;LN1/n;LN1/n;)LU1/e;
    .locals 10

    .line 1
    invoke-virtual {p1, p2, p3}, Ld2/m;->b(LN1/n;LN1/n;)LU1/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ld2/q;->E:LS3/l;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p3}, LW1/v;->B0(LN1/n;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v1, v2

    .line 19
    :goto_0
    iget v3, v0, LU1/e;->e:I

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    const v1, 0x8000

    .line 24
    .line 25
    .line 26
    or-int/2addr v3, v1

    .line 27
    :cond_1
    invoke-virtual {p0, p1, p3}, LW1/v;->H0(Ld2/m;LN1/n;)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iget v4, p0, LW1/v;->G0:I

    .line 32
    .line 33
    if-le v1, v4, :cond_2

    .line 34
    .line 35
    or-int/lit8 v3, v3, 0x40

    .line 36
    .line 37
    :cond_2
    move v9, v3

    .line 38
    new-instance v4, LU1/e;

    .line 39
    .line 40
    if-eqz v9, :cond_3

    .line 41
    .line 42
    :goto_1
    move v8, v2

    .line 43
    goto :goto_2

    .line 44
    :cond_3
    iget v2, v0, LU1/e;->d:I

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :goto_2
    iget-object v5, p1, Ld2/m;->a:Ljava/lang/String;

    .line 48
    .line 49
    move-object v6, p2

    .line 50
    move-object v7, p3

    .line 51
    invoke-direct/range {v4 .. v9}, LU1/e;-><init>(Ljava/lang/String;LN1/n;LN1/n;II)V

    .line 52
    .line 53
    .line 54
    return-object v4
.end method

.method public final Y(F[LN1/n;)F
    .locals 5

    .line 1
    array-length v0, p2

    .line 2
    const/4 v1, -0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    move v3, v1

    .line 5
    :goto_0
    if-ge v2, v0, :cond_1

    .line 6
    .line 7
    aget-object v4, p2, v2

    .line 8
    .line 9
    iget v4, v4, LN1/n;->D:I

    .line 10
    .line 11
    if-eq v4, v1, :cond_0

    .line 12
    .line 13
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    if-ne v3, v1, :cond_2

    .line 21
    .line 22
    const/high16 p1, -0x40800000    # -1.0f

    .line 23
    .line 24
    return p1

    .line 25
    :cond_2
    int-to-float p2, v3

    .line 26
    mul-float/2addr p2, p1

    .line 27
    return p2
.end method

.method public final Z(Ld2/h;LN1/n;Z)Ljava/util/ArrayList;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p2, LN1/n;->n:Ljava/lang/String;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    sget-object p1, Ll8/e0;->e:Ll8/e0;

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    iget-object v1, p0, LW1/v;->E0:LW1/t;

    .line 10
    .line 11
    invoke-virtual {v1, p2}, LW1/t;->i(LN1/n;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    const-string v1, "audio/raw"

    .line 19
    .line 20
    invoke-static {v1, v2, v2}, Ld2/v;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ld2/m;

    .line 37
    .line 38
    :goto_0
    if-eqz v1, :cond_2

    .line 39
    .line 40
    invoke-static {v1}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-static {p1, p2, p3, v2}, Ld2/v;->g(Ld2/h;LN1/n;ZZ)Ll8/e0;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    :goto_1
    sget-object p3, Ld2/v;->a:Ljava/util/HashMap;

    .line 50
    .line 51
    new-instance p3, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 54
    .line 55
    .line 56
    new-instance p1, Lcom/unity3d/services/core/webview/b;

    .line 57
    .line 58
    invoke-direct {p1, p2, v0}, Lcom/unity3d/services/core/webview/b;-><init>(Ljava/lang/Object;I)V

    .line 59
    .line 60
    .line 61
    new-instance p2, LV5/s;

    .line 62
    .line 63
    invoke-direct {p2, p1, v0}, LV5/s;-><init>(Ljava/lang/Object;I)V

    .line 64
    .line 65
    .line 66
    invoke-static {p3, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 67
    .line 68
    .line 69
    return-object p3
.end method

.method public final a0(Ld2/m;LN1/n;Landroid/media/MediaCrypto;F)LC6/l;
    .locals 11

    .line 1
    move v0, p4

    .line 2
    iget-object v2, p0, LU1/d;->j:[LN1/n;

    .line 3
    .line 4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p0 .. p2}, LW1/v;->H0(Ld2/m;LN1/n;)I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    array-length v5, v2

    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    if-ne v5, v6, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    array-length v5, v2

    .line 18
    move v8, v7

    .line 19
    :goto_0
    if-ge v8, v5, :cond_2

    .line 20
    .line 21
    aget-object v9, v2, v8

    .line 22
    .line 23
    invoke-virtual {p1, p2, v9}, Ld2/m;->b(LN1/n;LN1/n;)LU1/e;

    .line 24
    .line 25
    .line 26
    move-result-object v10

    .line 27
    iget v10, v10, LU1/e;->d:I

    .line 28
    .line 29
    if-eqz v10, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, p1, v9}, LW1/v;->H0(Ld2/m;LN1/n;)I

    .line 32
    .line 33
    .line 34
    move-result v9

    .line 35
    invoke-static {v4, v9}, Ljava/lang/Math;->max(II)I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    :goto_1
    iput v4, p0, LW1/v;->G0:I

    .line 43
    .line 44
    sget v2, LQ1/x;->a:I

    .line 45
    .line 46
    const/16 v4, 0x18

    .line 47
    .line 48
    iget-object v5, p1, Ld2/m;->a:Ljava/lang/String;

    .line 49
    .line 50
    if-ge v2, v4, :cond_4

    .line 51
    .line 52
    const-string v8, "OMX.SEC.aac.dec"

    .line 53
    .line 54
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    if-eqz v8, :cond_4

    .line 59
    .line 60
    const-string v8, "samsung"

    .line 61
    .line 62
    sget-object v9, LQ1/x;->c:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    if-eqz v8, :cond_4

    .line 69
    .line 70
    sget-object v8, LQ1/x;->b:Ljava/lang/String;

    .line 71
    .line 72
    const-string v9, "zeroflte"

    .line 73
    .line 74
    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    if-nez v9, :cond_3

    .line 79
    .line 80
    const-string v9, "herolte"

    .line 81
    .line 82
    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    if-nez v9, :cond_3

    .line 87
    .line 88
    const-string v9, "heroqlte"

    .line 89
    .line 90
    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-eqz v8, :cond_4

    .line 95
    .line 96
    :cond_3
    move v8, v6

    .line 97
    goto :goto_2

    .line 98
    :cond_4
    move v8, v7

    .line 99
    :goto_2
    iput-boolean v8, p0, LW1/v;->H0:Z

    .line 100
    .line 101
    const-string v8, "OMX.google.opus.decoder"

    .line 102
    .line 103
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    if-nez v8, :cond_6

    .line 108
    .line 109
    const-string v8, "c2.android.opus.decoder"

    .line 110
    .line 111
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    if-nez v8, :cond_6

    .line 116
    .line 117
    const-string v8, "OMX.google.vorbis.decoder"

    .line 118
    .line 119
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    if-nez v8, :cond_6

    .line 124
    .line 125
    const-string v8, "c2.android.vorbis.decoder"

    .line 126
    .line 127
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    if-eqz v5, :cond_5

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_5
    move v5, v7

    .line 135
    goto :goto_4

    .line 136
    :cond_6
    :goto_3
    move v5, v6

    .line 137
    :goto_4
    iput-boolean v5, p0, LW1/v;->I0:Z

    .line 138
    .line 139
    iget v5, p0, LW1/v;->G0:I

    .line 140
    .line 141
    new-instance v8, Landroid/media/MediaFormat;

    .line 142
    .line 143
    invoke-direct {v8}, Landroid/media/MediaFormat;-><init>()V

    .line 144
    .line 145
    .line 146
    iget-object v9, p1, Ld2/m;->c:Ljava/lang/String;

    .line 147
    .line 148
    const-string v10, "mime"

    .line 149
    .line 150
    invoke-virtual {v8, v10, v9}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    iget v9, p2, LN1/n;->C:I

    .line 154
    .line 155
    const-string v10, "channel-count"

    .line 156
    .line 157
    invoke-virtual {v8, v10, v9}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 158
    .line 159
    .line 160
    const-string v9, "sample-rate"

    .line 161
    .line 162
    iget v10, p2, LN1/n;->D:I

    .line 163
    .line 164
    invoke-virtual {v8, v9, v10}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 165
    .line 166
    .line 167
    iget-object v9, p2, LN1/n;->q:Ljava/util/List;

    .line 168
    .line 169
    invoke-static {v8, v9}, LQ1/k;->v(Landroid/media/MediaFormat;Ljava/util/List;)V

    .line 170
    .line 171
    .line 172
    const-string v9, "max-input-size"

    .line 173
    .line 174
    invoke-static {v8, v9, v5}, LQ1/k;->r(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    .line 175
    .line 176
    .line 177
    const/16 v5, 0x17

    .line 178
    .line 179
    if-lt v2, v5, :cond_8

    .line 180
    .line 181
    const-string v9, "priority"

    .line 182
    .line 183
    invoke-virtual {v8, v9, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 184
    .line 185
    .line 186
    const/high16 v9, -0x40800000    # -1.0f

    .line 187
    .line 188
    cmpl-float v9, v0, v9

    .line 189
    .line 190
    if-eqz v9, :cond_8

    .line 191
    .line 192
    if-ne v2, v5, :cond_7

    .line 193
    .line 194
    sget-object v5, LQ1/x;->d:Ljava/lang/String;

    .line 195
    .line 196
    const-string v9, "ZTE B2017G"

    .line 197
    .line 198
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v9

    .line 202
    if-nez v9, :cond_8

    .line 203
    .line 204
    const-string v9, "AXON 7 mini"

    .line 205
    .line 206
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    if-eqz v5, :cond_7

    .line 211
    .line 212
    goto :goto_5

    .line 213
    :cond_7
    const-string v5, "operating-rate"

    .line 214
    .line 215
    invoke-virtual {v8, v5, p4}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 216
    .line 217
    .line 218
    :cond_8
    :goto_5
    const/16 v0, 0x1c

    .line 219
    .line 220
    iget-object v5, p2, LN1/n;->n:Ljava/lang/String;

    .line 221
    .line 222
    if-gt v2, v0, :cond_9

    .line 223
    .line 224
    const-string v0, "audio/ac4"

    .line 225
    .line 226
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-eqz v0, :cond_9

    .line 231
    .line 232
    const-string v0, "ac4-is-sync"

    .line 233
    .line 234
    invoke-virtual {v8, v0, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 235
    .line 236
    .line 237
    :cond_9
    const-string v0, "audio/raw"

    .line 238
    .line 239
    if-lt v2, v4, :cond_a

    .line 240
    .line 241
    new-instance v4, LN1/m;

    .line 242
    .line 243
    invoke-direct {v4}, LN1/m;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-static {v0}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    iput-object v6, v4, LN1/m;->m:Ljava/lang/String;

    .line 251
    .line 252
    iget v6, p2, LN1/n;->C:I

    .line 253
    .line 254
    iput v6, v4, LN1/m;->B:I

    .line 255
    .line 256
    iput v10, v4, LN1/m;->C:I

    .line 257
    .line 258
    const/4 v6, 0x4

    .line 259
    iput v6, v4, LN1/m;->D:I

    .line 260
    .line 261
    new-instance v9, LN1/n;

    .line 262
    .line 263
    invoke-direct {v9, v4}, LN1/n;-><init>(LN1/m;)V

    .line 264
    .line 265
    .line 266
    iget-object v4, p0, LW1/v;->E0:LW1/t;

    .line 267
    .line 268
    invoke-virtual {v4, v9}, LW1/t;->i(LN1/n;)I

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    const/4 v9, 0x2

    .line 273
    if-ne v4, v9, :cond_a

    .line 274
    .line 275
    const-string v4, "pcm-encoding"

    .line 276
    .line 277
    invoke-virtual {v8, v4, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 278
    .line 279
    .line 280
    :cond_a
    const/16 v4, 0x20

    .line 281
    .line 282
    if-lt v2, v4, :cond_b

    .line 283
    .line 284
    const-string v4, "max-output-channel-count"

    .line 285
    .line 286
    const/16 v6, 0x63

    .line 287
    .line 288
    invoke-virtual {v8, v4, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 289
    .line 290
    .line 291
    :cond_b
    const/16 v4, 0x23

    .line 292
    .line 293
    if-lt v2, v4, :cond_c

    .line 294
    .line 295
    iget v2, p0, LW1/v;->P0:I

    .line 296
    .line 297
    neg-int v2, v2

    .line 298
    invoke-static {v7, v2}, Ljava/lang/Math;->max(II)I

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    const-string v4, "importance"

    .line 303
    .line 304
    invoke-virtual {v8, v4, v2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 305
    .line 306
    .line 307
    :cond_c
    iget-object v2, p1, Ld2/m;->b:Ljava/lang/String;

    .line 308
    .line 309
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    if-eqz v2, :cond_d

    .line 314
    .line 315
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-nez v0, :cond_d

    .line 320
    .line 321
    move-object v0, p2

    .line 322
    goto :goto_6

    .line 323
    :cond_d
    const/4 v0, 0x0

    .line 324
    :goto_6
    iput-object v0, p0, LW1/v;->K0:LN1/n;

    .line 325
    .line 326
    new-instance v0, LC6/l;

    .line 327
    .line 328
    const/4 v4, 0x0

    .line 329
    iget-object v6, p0, LW1/v;->F0:LDd/c;

    .line 330
    .line 331
    move-object v1, p1

    .line 332
    move-object v3, p2

    .line 333
    move-object v5, p3

    .line 334
    move-object v2, v8

    .line 335
    invoke-direct/range {v0 .. v6}, LC6/l;-><init>(Ld2/m;Landroid/media/MediaFormat;LN1/n;Landroid/view/Surface;Landroid/media/MediaCrypto;LDd/c;)V

    .line 336
    .line 337
    .line 338
    return-object v0
.end method

.method public final b()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Ld2/q;->t0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LW1/v;->E0:LW1/t;

    .line 6
    .line 7
    invoke-virtual {v0}, LW1/t;->o()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-boolean v1, v0, LW1/t;->S:Z

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, LW1/t;->m()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    :cond_0
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    return v0
.end method

.method public final b0(LT1/d;)V
    .locals 4

    .line 1
    sget v0, LQ1/x;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p1, LT1/d;->c:LN1/n;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, LN1/n;->n:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "audio/opus"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, Ld2/q;->g0:Z

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p1, LT1/d;->h:Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object p1, p1, LT1/d;->c:LN1/n;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/16 v2, 0x8

    .line 40
    .line 41
    if-ne v1, v2, :cond_0

    .line 42
    .line 43
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    const-wide/32 v2, 0xbb80

    .line 54
    .line 55
    .line 56
    mul-long/2addr v0, v2

    .line 57
    const-wide/32 v2, 0x3b9aca00

    .line 58
    .line 59
    .line 60
    div-long/2addr v0, v2

    .line 61
    long-to-int v0, v0

    .line 62
    iget-object v1, p0, LW1/v;->E0:LW1/t;

    .line 63
    .line 64
    iget-object v2, v1, LW1/t;->v:Landroid/media/AudioTrack;

    .line 65
    .line 66
    if-eqz v2, :cond_0

    .line 67
    .line 68
    invoke-static {v2}, LW1/t;->p(Landroid/media/AudioTrack;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_0

    .line 73
    .line 74
    iget-object v2, v1, LW1/t;->t:LW1/n;

    .line 75
    .line 76
    if-eqz v2, :cond_0

    .line 77
    .line 78
    iget-boolean v2, v2, LW1/n;->k:Z

    .line 79
    .line 80
    if-eqz v2, :cond_0

    .line 81
    .line 82
    iget-object v1, v1, LW1/t;->v:Landroid/media/AudioTrack;

    .line 83
    .line 84
    iget p1, p1, LN1/n;->F:I

    .line 85
    .line 86
    invoke-static {v1, p1, v0}, LG5/d;->r(Landroid/media/AudioTrack;II)V

    .line 87
    .line 88
    .line 89
    :cond_0
    return-void
.end method

.method public final c(ILjava/lang/Object;)V
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-object v1, p0, LW1/v;->E0:LW1/t;

    .line 3
    .line 4
    if-eq p1, v0, :cond_15

    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    if-eq p1, v0, :cond_11

    .line 8
    .line 9
    const/4 v0, 0x6

    .line 10
    if-eq p1, v0, :cond_e

    .line 11
    .line 12
    const/16 v0, 0xc

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eq p1, v0, :cond_a

    .line 16
    .line 17
    const/16 v0, 0x10

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/16 v4, 0x23

    .line 21
    .line 22
    if-eq p1, v0, :cond_8

    .line 23
    .line 24
    const/16 v0, 0x9

    .line 25
    .line 26
    if-eq p1, v0, :cond_5

    .line 27
    .line 28
    const/16 v0, 0xa

    .line 29
    .line 30
    if-eq p1, v0, :cond_0

    .line 31
    .line 32
    const/16 v0, 0xb

    .line 33
    .line 34
    if-ne p1, v0, :cond_16

    .line 35
    .line 36
    check-cast p2, LU1/v;

    .line 37
    .line 38
    iput-object p2, p0, Ld2/q;->F:LU1/v;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    check-cast p2, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iget p2, v1, LW1/t;->X:I

    .line 51
    .line 52
    if-eq p2, p1, :cond_2

    .line 53
    .line 54
    iput p1, v1, LW1/t;->X:I

    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    const/4 v3, 0x1

    .line 59
    :cond_1
    iput-boolean v3, v1, LW1/t;->W:Z

    .line 60
    .line 61
    invoke-virtual {v1}, LW1/t;->g()V

    .line 62
    .line 63
    .line 64
    :cond_2
    sget p2, LQ1/x;->a:I

    .line 65
    .line 66
    if-lt p2, v4, :cond_16

    .line 67
    .line 68
    iget-object p2, p0, LW1/v;->F0:LDd/c;

    .line 69
    .line 70
    if-eqz p2, :cond_16

    .line 71
    .line 72
    iget-object v0, p2, LDd/c;->d:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Landroid/media/LoudnessCodecController;

    .line 75
    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    invoke-static {v0}, Lcom/applovin/impl/sdk/y;->k(Landroid/media/LoudnessCodecController;)V

    .line 79
    .line 80
    .line 81
    iput-object v2, p2, LDd/c;->d:Ljava/lang/Object;

    .line 82
    .line 83
    :cond_3
    new-instance v0, Ld2/g;

    .line 84
    .line 85
    invoke-direct {v0, p2}, Ld2/g;-><init>(LDd/c;)V

    .line 86
    .line 87
    .line 88
    invoke-static {p1, v0}, Lcom/applovin/impl/sdk/y;->d(ILd2/g;)Landroid/media/LoudnessCodecController;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iput-object p1, p2, LDd/c;->d:Ljava/lang/Object;

    .line 93
    .line 94
    iget-object p2, p2, LDd/c;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p2, Ljava/util/HashSet;

    .line 97
    .line 98
    invoke-virtual {p2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    :cond_4
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_16

    .line 107
    .line 108
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Landroid/media/MediaCodec;

    .line 113
    .line 114
    invoke-static {p1, v0}, Lcom/applovin/impl/sdk/y;->o(Landroid/media/LoudnessCodecController;Landroid/media/MediaCodec;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_4

    .line 119
    .line 120
    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    check-cast p2, Ljava/lang/Boolean;

    .line 128
    .line 129
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    iput-boolean p1, v1, LW1/t;->D:Z

    .line 134
    .line 135
    invoke-virtual {v1}, LW1/t;->x()Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_6

    .line 140
    .line 141
    sget-object p1, LN1/F;->d:LN1/F;

    .line 142
    .line 143
    :goto_1
    move-object v3, p1

    .line 144
    goto :goto_2

    .line 145
    :cond_6
    iget-object p1, v1, LW1/t;->C:LN1/F;

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :goto_2
    new-instance v2, LW1/o;

    .line 149
    .line 150
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    invoke-direct/range {v2 .. v7}, LW1/o;-><init>(LN1/F;JJ)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1}, LW1/t;->o()Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-eqz p1, :cond_7

    .line 168
    .line 169
    iput-object v2, v1, LW1/t;->A:LW1/o;

    .line 170
    .line 171
    return-void

    .line 172
    :cond_7
    iput-object v2, v1, LW1/t;->B:LW1/o;

    .line 173
    .line 174
    return-void

    .line 175
    :cond_8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    check-cast p2, Ljava/lang/Integer;

    .line 179
    .line 180
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    iput p1, p0, LW1/v;->P0:I

    .line 185
    .line 186
    iget-object p1, p0, Ld2/q;->K:Ld2/j;

    .line 187
    .line 188
    if-nez p1, :cond_9

    .line 189
    .line 190
    goto/16 :goto_5

    .line 191
    .line 192
    :cond_9
    sget p2, LQ1/x;->a:I

    .line 193
    .line 194
    if-lt p2, v4, :cond_16

    .line 195
    .line 196
    new-instance p2, Landroid/os/Bundle;

    .line 197
    .line 198
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 199
    .line 200
    .line 201
    iget v0, p0, LW1/v;->P0:I

    .line 202
    .line 203
    neg-int v0, v0

    .line 204
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    const-string v1, "importance"

    .line 209
    .line 210
    invoke-virtual {p2, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 211
    .line 212
    .line 213
    invoke-interface {p1, p2}, Ld2/j;->c(Landroid/os/Bundle;)V

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :cond_a
    sget p1, LQ1/x;->a:I

    .line 218
    .line 219
    const/16 v0, 0x17

    .line 220
    .line 221
    if-lt p1, v0, :cond_16

    .line 222
    .line 223
    check-cast p2, Landroid/media/AudioDeviceInfo;

    .line 224
    .line 225
    if-nez p2, :cond_b

    .line 226
    .line 227
    move-object p1, v2

    .line 228
    goto :goto_3

    .line 229
    :cond_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    new-instance p1, LY9/c;

    .line 233
    .line 234
    const/16 v0, 0x18

    .line 235
    .line 236
    invoke-direct {p1, p2, v0}, LY9/c;-><init>(Ljava/lang/Object;I)V

    .line 237
    .line 238
    .line 239
    :goto_3
    iput-object p1, v1, LW1/t;->Z:LY9/c;

    .line 240
    .line 241
    iget-object p1, v1, LW1/t;->x:LJ9/o;

    .line 242
    .line 243
    if-eqz p1, :cond_c

    .line 244
    .line 245
    invoke-virtual {p1, p2}, LJ9/o;->h(Landroid/media/AudioDeviceInfo;)V

    .line 246
    .line 247
    .line 248
    :cond_c
    iget-object p1, v1, LW1/t;->v:Landroid/media/AudioTrack;

    .line 249
    .line 250
    if-eqz p1, :cond_16

    .line 251
    .line 252
    iget-object p2, v1, LW1/t;->Z:LY9/c;

    .line 253
    .line 254
    if-nez p2, :cond_d

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_d
    iget-object p2, p2, LY9/c;->b:Ljava/lang/Object;

    .line 258
    .line 259
    move-object v2, p2

    .line 260
    check-cast v2, Landroid/media/AudioDeviceInfo;

    .line 261
    .line 262
    :goto_4
    invoke-virtual {p1, v2}, Landroid/media/AudioTrack;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)Z

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    :cond_e
    check-cast p2, LN1/d;

    .line 267
    .line 268
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    iget-object p1, v1, LW1/t;->Y:LN1/d;

    .line 272
    .line 273
    invoke-virtual {p1, p2}, LN1/d;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result p1

    .line 277
    if-eqz p1, :cond_f

    .line 278
    .line 279
    goto :goto_5

    .line 280
    :cond_f
    iget-object p1, v1, LW1/t;->v:Landroid/media/AudioTrack;

    .line 281
    .line 282
    if-eqz p1, :cond_10

    .line 283
    .line 284
    iget-object p1, v1, LW1/t;->Y:LN1/d;

    .line 285
    .line 286
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    :cond_10
    iput-object p2, v1, LW1/t;->Y:LN1/d;

    .line 290
    .line 291
    return-void

    .line 292
    :cond_11
    check-cast p2, LN1/c;

    .line 293
    .line 294
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    iget-object p1, v1, LW1/t;->z:LN1/c;

    .line 298
    .line 299
    invoke-virtual {p1, p2}, LN1/c;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result p1

    .line 303
    if-eqz p1, :cond_12

    .line 304
    .line 305
    goto :goto_5

    .line 306
    :cond_12
    iput-object p2, v1, LW1/t;->z:LN1/c;

    .line 307
    .line 308
    iget-boolean p1, v1, LW1/t;->a0:Z

    .line 309
    .line 310
    if-eqz p1, :cond_13

    .line 311
    .line 312
    goto :goto_5

    .line 313
    :cond_13
    iget-object p1, v1, LW1/t;->x:LJ9/o;

    .line 314
    .line 315
    if-eqz p1, :cond_14

    .line 316
    .line 317
    iput-object p2, p1, LJ9/o;->j:Ljava/lang/Object;

    .line 318
    .line 319
    iget-object v0, p1, LJ9/o;->b:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v0, Landroid/content/Context;

    .line 322
    .line 323
    iget-object v2, p1, LJ9/o;->i:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v2, LY9/c;

    .line 326
    .line 327
    invoke-static {v0, p2, v2}, LW1/b;->b(Landroid/content/Context;LN1/c;LY9/c;)LW1/b;

    .line 328
    .line 329
    .line 330
    move-result-object p2

    .line 331
    invoke-virtual {p1, p2}, LJ9/o;->g(LW1/b;)V

    .line 332
    .line 333
    .line 334
    :cond_14
    invoke-virtual {v1}, LW1/t;->g()V

    .line 335
    .line 336
    .line 337
    return-void

    .line 338
    :cond_15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    check-cast p2, Ljava/lang/Float;

    .line 342
    .line 343
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 344
    .line 345
    .line 346
    move-result p1

    .line 347
    iget p2, v1, LW1/t;->O:F

    .line 348
    .line 349
    cmpl-float p2, p2, p1

    .line 350
    .line 351
    if-eqz p2, :cond_16

    .line 352
    .line 353
    iput p1, v1, LW1/t;->O:F

    .line 354
    .line 355
    invoke-virtual {v1}, LW1/t;->o()Z

    .line 356
    .line 357
    .line 358
    move-result p1

    .line 359
    if-eqz p1, :cond_16

    .line 360
    .line 361
    iget-object p1, v1, LW1/t;->v:Landroid/media/AudioTrack;

    .line 362
    .line 363
    iget p2, v1, LW1/t;->O:F

    .line 364
    .line 365
    invoke-virtual {p1, p2}, Landroid/media/AudioTrack;->setVolume(F)I

    .line 366
    .line 367
    .line 368
    :cond_16
    :goto_5
    return-void
.end method

.method public final e()LN1/F;
    .locals 1

    .line 1
    iget-object v0, p0, LW1/v;->E0:LW1/t;

    .line 2
    .line 3
    iget-object v0, v0, LW1/t;->C:LN1/F;

    .line 4
    .line 5
    return-object v0
.end method

.method public final g()J
    .locals 2

    .line 1
    iget v0, p0, LU1/d;->h:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, LW1/v;->I0()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, LW1/v;->L0:J

    .line 10
    .line 11
    return-wide v0
.end method

.method public final g0(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    const-string v1, "Audio codec error"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, LQ1/k;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LW1/v;->D0:LS3/s;

    .line 9
    .line 10
    iget-object v1, v0, LS3/s;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/os/Handler;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    new-instance v2, LW1/f;

    .line 17
    .line 18
    const/4 v3, 0x3

    .line 19
    invoke-direct {v2, v0, p1, v3}, LW1/f;-><init>(LS3/s;Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "MediaCodecAudioRenderer"

    .line 2
    .line 3
    return-object v0
.end method

.method public final h0(JJLjava/lang/String;)V
    .locals 8

    .line 1
    iget-object v1, p0, LW1/v;->D0:LS3/s;

    .line 2
    .line 3
    iget-object v0, v1, LS3/s;->b:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v7, v0

    .line 6
    check-cast v7, Landroid/os/Handler;

    .line 7
    .line 8
    if-eqz v7, :cond_0

    .line 9
    .line 10
    new-instance v0, LW1/f;

    .line 11
    .line 12
    move-wide v3, p1

    .line 13
    move-wide v5, p3

    .line 14
    move-object v2, p5

    .line 15
    invoke-direct/range {v0 .. v6}, LW1/f;-><init>(LS3/s;Ljava/lang/String;JJ)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final i0(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, LW1/v;->D0:LS3/s;

    .line 2
    .line 3
    iget-object v1, v0, LS3/s;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/os/Handler;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v2, LW1/f;

    .line 10
    .line 11
    const/4 v3, 0x7

    .line 12
    invoke-direct {v2, v0, p1, v3}, LW1/f;-><init>(LS3/s;Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final isReady()Z
    .locals 1

    .line 1
    iget-object v0, p0, LW1/v;->E0:LW1/t;

    .line 2
    .line 3
    invoke-virtual {v0}, LW1/t;->m()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-super {p0}, Ld2/q;->isReady()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    return v0
.end method

.method public final j0(LS3/c;)LU1/e;
    .locals 4

    .line 1
    iget-object v0, p1, LS3/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LN1/n;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, LW1/v;->J0:LN1/n;

    .line 9
    .line 10
    invoke-super {p0, p1}, Ld2/q;->j0(LS3/c;)LU1/e;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v1, p0, LW1/v;->D0:LS3/s;

    .line 15
    .line 16
    iget-object v2, v1, LS3/s;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Landroid/os/Handler;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    new-instance v3, LW1/f;

    .line 23
    .line 24
    invoke-direct {v3, v1, v0, p1}, LW1/f;-><init>(LS3/s;LN1/n;LU1/e;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    return-object p1
.end method

.method public final k0(LN1/n;Landroid/media/MediaFormat;)V
    .locals 13

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x5

    .line 6
    const/4 v4, 0x3

    .line 7
    const/4 v5, 0x6

    .line 8
    const/4 v6, 0x2

    .line 9
    iget-object v7, p0, LW1/v;->K0:LN1/n;

    .line 10
    .line 11
    const/4 v8, 0x1

    .line 12
    const/4 v9, 0x0

    .line 13
    const/4 v10, 0x0

    .line 14
    if-eqz v7, :cond_0

    .line 15
    .line 16
    move-object p1, v7

    .line 17
    goto/16 :goto_3

    .line 18
    .line 19
    :cond_0
    iget-object v7, p0, Ld2/q;->K:Ld2/j;

    .line 20
    .line 21
    if-nez v7, :cond_1

    .line 22
    .line 23
    goto/16 :goto_3

    .line 24
    .line 25
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v7, p1, LN1/n;->n:Ljava/lang/String;

    .line 29
    .line 30
    const-string v11, "audio/raw"

    .line 31
    .line 32
    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    if-eqz v7, :cond_2

    .line 37
    .line 38
    iget v7, p1, LN1/n;->E:I

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    sget v7, LQ1/x;->a:I

    .line 42
    .line 43
    const/16 v12, 0x18

    .line 44
    .line 45
    if-lt v7, v12, :cond_3

    .line 46
    .line 47
    const-string v7, "pcm-encoding"

    .line 48
    .line 49
    invoke-virtual {p2, v7}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v12

    .line 53
    if-eqz v12, :cond_3

    .line 54
    .line 55
    invoke-virtual {p2, v7}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    const-string v7, "v-bits-per-sample"

    .line 61
    .line 62
    invoke-virtual {p2, v7}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v12

    .line 66
    if-eqz v12, :cond_4

    .line 67
    .line 68
    invoke-virtual {p2, v7}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    invoke-static {v7}, LQ1/x;->y(I)I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    goto :goto_0

    .line 77
    :cond_4
    move v7, v6

    .line 78
    :goto_0
    new-instance v12, LN1/m;

    .line 79
    .line 80
    invoke-direct {v12}, LN1/m;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-static {v11}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    iput-object v11, v12, LN1/m;->m:Ljava/lang/String;

    .line 88
    .line 89
    iput v7, v12, LN1/m;->D:I

    .line 90
    .line 91
    iget v7, p1, LN1/n;->F:I

    .line 92
    .line 93
    iput v7, v12, LN1/m;->E:I

    .line 94
    .line 95
    iget v7, p1, LN1/n;->G:I

    .line 96
    .line 97
    iput v7, v12, LN1/m;->F:I

    .line 98
    .line 99
    iget-object v7, p1, LN1/n;->l:LN1/B;

    .line 100
    .line 101
    iput-object v7, v12, LN1/m;->k:LN1/B;

    .line 102
    .line 103
    iget-object v7, p1, LN1/n;->a:Ljava/lang/String;

    .line 104
    .line 105
    iput-object v7, v12, LN1/m;->a:Ljava/lang/String;

    .line 106
    .line 107
    iget-object v7, p1, LN1/n;->b:Ljava/lang/String;

    .line 108
    .line 109
    iput-object v7, v12, LN1/m;->b:Ljava/lang/String;

    .line 110
    .line 111
    iget-object v7, p1, LN1/n;->c:Ll8/K;

    .line 112
    .line 113
    invoke-static {v7}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    iput-object v7, v12, LN1/m;->c:Ll8/K;

    .line 118
    .line 119
    iget-object v7, p1, LN1/n;->d:Ljava/lang/String;

    .line 120
    .line 121
    iput-object v7, v12, LN1/m;->d:Ljava/lang/String;

    .line 122
    .line 123
    iget v7, p1, LN1/n;->e:I

    .line 124
    .line 125
    iput v7, v12, LN1/m;->e:I

    .line 126
    .line 127
    iget v7, p1, LN1/n;->f:I

    .line 128
    .line 129
    iput v7, v12, LN1/m;->f:I

    .line 130
    .line 131
    const-string v7, "channel-count"

    .line 132
    .line 133
    invoke-virtual {p2, v7}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    iput v7, v12, LN1/m;->B:I

    .line 138
    .line 139
    const-string v7, "sample-rate"

    .line 140
    .line 141
    invoke-virtual {p2, v7}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    move-result p2

    .line 145
    iput p2, v12, LN1/m;->C:I

    .line 146
    .line 147
    new-instance p2, LN1/n;

    .line 148
    .line 149
    invoke-direct {p2, v12}, LN1/n;-><init>(LN1/m;)V

    .line 150
    .line 151
    .line 152
    iget-boolean v7, p0, LW1/v;->H0:Z

    .line 153
    .line 154
    iget v11, p2, LN1/n;->C:I

    .line 155
    .line 156
    if-eqz v7, :cond_6

    .line 157
    .line 158
    if-ne v11, v5, :cond_6

    .line 159
    .line 160
    iget p1, p1, LN1/n;->C:I

    .line 161
    .line 162
    if-ge p1, v5, :cond_6

    .line 163
    .line 164
    new-array v10, p1, [I

    .line 165
    .line 166
    move v0, v9

    .line 167
    :goto_1
    if-ge v0, p1, :cond_5

    .line 168
    .line 169
    aput v0, v10, v0

    .line 170
    .line 171
    add-int/2addr v0, v8

    .line 172
    goto :goto_1

    .line 173
    :cond_5
    :goto_2
    move-object p1, p2

    .line 174
    goto :goto_3

    .line 175
    :cond_6
    iget-boolean p1, p0, LW1/v;->I0:Z

    .line 176
    .line 177
    if-eqz p1, :cond_5

    .line 178
    .line 179
    if-eq v11, v4, :cond_b

    .line 180
    .line 181
    if-eq v11, v3, :cond_a

    .line 182
    .line 183
    if-eq v11, v5, :cond_9

    .line 184
    .line 185
    if-eq v11, v1, :cond_8

    .line 186
    .line 187
    if-eq v11, v0, :cond_7

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_7
    new-array v10, v0, [I

    .line 191
    .line 192
    fill-array-data v10, :array_0

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_8
    new-array v10, v1, [I

    .line 197
    .line 198
    fill-array-data v10, :array_1

    .line 199
    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_9
    new-array v10, v5, [I

    .line 203
    .line 204
    fill-array-data v10, :array_2

    .line 205
    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_a
    filled-new-array {v9, v6, v8, v4, v2}, [I

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    goto :goto_2

    .line 213
    :cond_b
    filled-new-array {v9, v6, v8}, [I

    .line 214
    .line 215
    .line 216
    move-result-object v10

    .line 217
    goto :goto_2

    .line 218
    :goto_3
    :try_start_0
    sget p2, LQ1/x;->a:I
    :try_end_0
    .catch LW1/h; {:try_start_0 .. :try_end_0} :catch_0

    .line 219
    .line 220
    const/16 v0, 0x1d

    .line 221
    .line 222
    iget-object v1, p0, LW1/v;->E0:LW1/t;

    .line 223
    .line 224
    if-lt p2, v0, :cond_f

    .line 225
    .line 226
    :try_start_1
    iget-boolean v2, p0, Ld2/q;->g0:Z

    .line 227
    .line 228
    if-eqz v2, :cond_d

    .line 229
    .line 230
    iget-object v2, p0, LU1/d;->d:LU1/Y;

    .line 231
    .line 232
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    iget v2, v2, LU1/Y;->a:I

    .line 236
    .line 237
    if-eqz v2, :cond_d

    .line 238
    .line 239
    iget-object v2, p0, LU1/d;->d:LU1/Y;

    .line 240
    .line 241
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    iget v2, v2, LU1/Y;->a:I

    .line 245
    .line 246
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    if-lt p2, v0, :cond_c

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_c
    move v8, v9

    .line 253
    :goto_4
    invoke-static {v8}, LQ1/k;->g(Z)V

    .line 254
    .line 255
    .line 256
    iput v2, v1, LW1/t;->j:I

    .line 257
    .line 258
    goto :goto_6

    .line 259
    :catch_0
    move-exception p1

    .line 260
    goto :goto_7

    .line 261
    :cond_d
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    if-lt p2, v0, :cond_e

    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_e
    move v8, v9

    .line 268
    :goto_5
    invoke-static {v8}, LQ1/k;->g(Z)V

    .line 269
    .line 270
    .line 271
    iput v9, v1, LW1/t;->j:I

    .line 272
    .line 273
    :cond_f
    :goto_6
    invoke-virtual {v1, p1, v10}, LW1/t;->d(LN1/n;[I)V
    :try_end_1
    .catch LW1/h; {:try_start_1 .. :try_end_1} :catch_0

    .line 274
    .line 275
    .line 276
    return-void

    .line 277
    :goto_7
    iget-object p2, p1, LW1/h;->a:LN1/n;

    .line 278
    .line 279
    const/16 v0, 0x1389

    .line 280
    .line 281
    invoke-virtual {p0, p1, p2, v9, v0}, LU1/d;->C(Ljava/lang/Exception;LN1/n;ZI)LU1/j;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    throw p1

    .line 286
    nop

    .line 287
    :array_0
    .array-data 4
        0x0
        0x2
        0x1
        0x7
        0x5
        0x6
        0x3
        0x4
    .end array-data

    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    :array_1
    .array-data 4
        0x0
        0x2
        0x1
        0x6
        0x5
        0x3
        0x4
    .end array-data

    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    :array_2
    .array-data 4
        0x0
        0x2
        0x1
        0x5
        0x3
        0x4
    .end array-data
.end method

.method public final l0()V
    .locals 1

    .line 1
    iget-object v0, p0, LW1/v;->E0:LW1/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final n()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, LW1/v;->O0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, LW1/v;->O0:Z

    .line 5
    .line 6
    return v0
.end method

.method public final n0()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, LW1/v;->E0:LW1/t;

    .line 3
    .line 4
    iput-boolean v0, v1, LW1/t;->L:Z

    .line 5
    .line 6
    return-void
.end method

.method public final q(LN1/F;)V
    .locals 8

    .line 1
    iget-object v0, p0, LW1/v;->E0:LW1/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, LN1/F;

    .line 7
    .line 8
    iget v2, p1, LN1/F;->a:F

    .line 9
    .line 10
    const v3, 0x3dcccccd    # 0.1f

    .line 11
    .line 12
    .line 13
    const/high16 v4, 0x41000000    # 8.0f

    .line 14
    .line 15
    invoke-static {v2, v3, v4}, LQ1/x;->h(FFF)F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget v5, p1, LN1/F;->b:F

    .line 20
    .line 21
    invoke-static {v5, v3, v4}, LQ1/x;->h(FFF)F

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-direct {v1, v2, v3}, LN1/F;-><init>(FF)V

    .line 26
    .line 27
    .line 28
    iput-object v1, v0, LW1/t;->C:LN1/F;

    .line 29
    .line 30
    invoke-virtual {v0}, LW1/t;->x()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, LW1/t;->v()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    new-instance v2, LW1/o;

    .line 41
    .line 42
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    move-object v3, p1

    .line 53
    invoke-direct/range {v2 .. v7}, LW1/o;-><init>(LN1/F;JJ)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, LW1/t;->o()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    iput-object v2, v0, LW1/t;->A:LW1/o;

    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    iput-object v2, v0, LW1/t;->B:LW1/o;

    .line 66
    .line 67
    return-void
.end method

.method public final r0(JJLd2/j;Ljava/nio/ByteBuffer;IIIJZZLN1/n;)Z
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LW1/v;->K0:LN1/n;

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    and-int/lit8 p1, p8, 0x2

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-interface {p5, p7}, Ld2/j;->G(I)V

    .line 17
    .line 18
    .line 19
    return p2

    .line 20
    :cond_0
    iget-object p1, p0, LW1/v;->E0:LW1/t;

    .line 21
    .line 22
    if-eqz p12, :cond_2

    .line 23
    .line 24
    if-eqz p5, :cond_1

    .line 25
    .line 26
    invoke-interface {p5, p7}, Ld2/j;->G(I)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object p3, p0, Ld2/q;->x0:LH5/e;

    .line 30
    .line 31
    iget p4, p3, LH5/e;->g:I

    .line 32
    .line 33
    add-int/2addr p4, p9

    .line 34
    iput p4, p3, LH5/e;->g:I

    .line 35
    .line 36
    iput-boolean p2, p1, LW1/t;->L:Z

    .line 37
    .line 38
    return p2

    .line 39
    :cond_2
    :try_start_0
    invoke-virtual {p1, p10, p11, p9, p6}, LW1/t;->l(JILjava/nio/ByteBuffer;)Z

    .line 40
    .line 41
    .line 42
    move-result p1
    :try_end_0
    .catch LW1/i; {:try_start_0 .. :try_end_0} :catch_1
    .catch LW1/j; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    if-eqz p1, :cond_4

    .line 44
    .line 45
    if-eqz p5, :cond_3

    .line 46
    .line 47
    invoke-interface {p5, p7}, Ld2/j;->G(I)V

    .line 48
    .line 49
    .line 50
    :cond_3
    iget-object p1, p0, Ld2/q;->x0:LH5/e;

    .line 51
    .line 52
    iget p3, p1, LH5/e;->f:I

    .line 53
    .line 54
    add-int/2addr p3, p9

    .line 55
    iput p3, p1, LH5/e;->f:I

    .line 56
    .line 57
    return p2

    .line 58
    :cond_4
    const/4 p1, 0x0

    .line 59
    return p1

    .line 60
    :catch_0
    move-exception p1

    .line 61
    iget-boolean p2, p0, Ld2/q;->g0:Z

    .line 62
    .line 63
    if-eqz p2, :cond_5

    .line 64
    .line 65
    iget-object p2, p0, LU1/d;->d:LU1/Y;

    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget p2, p2, LU1/Y;->a:I

    .line 71
    .line 72
    if-eqz p2, :cond_5

    .line 73
    .line 74
    const/16 p2, 0x138b

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_5
    const/16 p2, 0x138a

    .line 78
    .line 79
    :goto_0
    iget-boolean p3, p1, LW1/j;->b:Z

    .line 80
    .line 81
    invoke-virtual {p0, p1, p14, p3, p2}, LU1/d;->C(Ljava/lang/Exception;LN1/n;ZI)LU1/j;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    throw p1

    .line 86
    :catch_1
    move-exception p1

    .line 87
    iget-object p2, p0, LW1/v;->J0:LN1/n;

    .line 88
    .line 89
    iget-boolean p3, p0, Ld2/q;->g0:Z

    .line 90
    .line 91
    if-eqz p3, :cond_6

    .line 92
    .line 93
    iget-object p3, p0, LU1/d;->d:LU1/Y;

    .line 94
    .line 95
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget p3, p3, LU1/Y;->a:I

    .line 99
    .line 100
    if-eqz p3, :cond_6

    .line 101
    .line 102
    const/16 p3, 0x138c

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_6
    const/16 p3, 0x1389

    .line 106
    .line 107
    :goto_1
    iget-boolean p4, p1, LW1/i;->b:Z

    .line 108
    .line 109
    invoke-virtual {p0, p1, p2, p4, p3}, LU1/d;->C(Ljava/lang/Exception;LN1/n;ZI)LU1/j;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    throw p1
.end method

.method public final u0()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, LW1/v;->E0:LW1/t;

    .line 2
    .line 3
    iget-boolean v1, v0, LW1/t;->S:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, LW1/t;->o()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, LW1/t;->f()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, LW1/t;->s()V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    iput-boolean v1, v0, LW1/t;->S:Z
    :try_end_0
    .catch LW1/j; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :catch_0
    move-exception v0

    .line 27
    iget-boolean v1, p0, Ld2/q;->g0:Z

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    const/16 v1, 0x138b

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/16 v1, 0x138a

    .line 35
    .line 36
    :goto_0
    iget-object v2, v0, LW1/j;->c:LN1/n;

    .line 37
    .line 38
    iget-boolean v3, v0, LW1/j;->b:Z

    .line 39
    .line 40
    invoke-virtual {p0, v0, v2, v3, v1}, LU1/d;->C(Ljava/lang/Exception;LN1/n;ZI)LU1/j;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    throw v0
.end method
