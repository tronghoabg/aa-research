.class public final LS5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ5/k;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    iput p1, p0, LS5/c;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance p1, LT5/a;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {p1, v0, v1}, LT5/a;-><init>(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, LS5/c;->c:Ljava/lang/Object;

    .line 21
    .line 22
    new-instance p1, LY4/b;

    .line 23
    .line 24
    const/16 v0, 0x4000

    .line 25
    .line 26
    invoke-direct {p1, v0}, LY4/b;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, LS5/c;->d:Ljava/lang/Object;

    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance p1, LT5/a;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-direct {p1, v0, v1}, LT5/a;-><init>(Ljava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, LS5/c;->c:Ljava/lang/Object;

    .line 43
    .line 44
    new-instance p1, LY4/b;

    .line 45
    .line 46
    const/16 v0, 0xae2

    .line 47
    .line 48
    invoke-direct {p1, v0}, LY4/b;-><init>(I)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, LS5/c;->d:Ljava/lang/Object;

    .line 52
    .line 53
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final b()V
    .locals 0

    .line 1
    return-void
.end method

.method private final c()V
    .locals 0

    .line 1
    return-void
.end method

.method private final d()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iget v1, p0, LS5/c;->a:I

    .line 3
    .line 4
    packed-switch v1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iput-boolean v0, p0, LS5/c;->b:Z

    .line 8
    .line 9
    iget-object p1, p0, LS5/c;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, LT5/a;

    .line 12
    .line 13
    invoke-virtual {p1}, LT5/a;->a()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    iput-boolean v0, p0, LS5/c;->b:Z

    .line 18
    .line 19
    iget-object p1, p0, LS5/c;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, LT5/a;

    .line 22
    .line 23
    invoke-virtual {p1}, LT5/a;->a()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_1
    iget-object v1, p0, LS5/c;->d:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, LN2/i;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    iget-object v2, v1, LN2/i;->j:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, LN2/e;

    .line 36
    .line 37
    iget-object v3, v2, LN2/e;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, LN2/f;

    .line 40
    .line 41
    iput v0, v3, LN2/f;->a:I

    .line 42
    .line 43
    const-wide/16 v4, 0x0

    .line 44
    .line 45
    iput-wide v4, v3, LN2/f;->b:J

    .line 46
    .line 47
    iput v0, v3, LN2/f;->c:I

    .line 48
    .line 49
    iput v0, v3, LN2/f;->d:I

    .line 50
    .line 51
    iput v0, v3, LN2/f;->e:I

    .line 52
    .line 53
    iget-object v3, v2, LN2/e;->f:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v3, LY4/b;

    .line 56
    .line 57
    invoke-virtual {v3, v0}, LY4/b;->x(I)V

    .line 58
    .line 59
    .line 60
    const/4 v3, -0x1

    .line 61
    iput v3, v2, LN2/e;->b:I

    .line 62
    .line 63
    iput-boolean v0, v2, LN2/e;->d:Z

    .line 64
    .line 65
    cmp-long p1, p1, v4

    .line 66
    .line 67
    if-nez p1, :cond_0

    .line 68
    .line 69
    iget-boolean p1, v1, LN2/i;->h:Z

    .line 70
    .line 71
    xor-int/lit8 p1, p1, 0x1

    .line 72
    .line 73
    invoke-virtual {v1, p1}, LN2/i;->f(Z)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    iget p1, v1, LN2/i;->e:I

    .line 78
    .line 79
    if-eqz p1, :cond_1

    .line 80
    .line 81
    iget p1, v1, LN2/i;->f:I

    .line 82
    .line 83
    int-to-long p1, p1

    .line 84
    mul-long/2addr p1, p3

    .line 85
    const-wide/32 p3, 0xf4240

    .line 86
    .line 87
    .line 88
    div-long/2addr p1, p3

    .line 89
    iput-wide p1, v1, LN2/i;->b:J

    .line 90
    .line 91
    iget-object p3, v1, LN2/i;->m:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p3, LS5/d;

    .line 94
    .line 95
    sget p4, Lu6/v;->a:I

    .line 96
    .line 97
    invoke-interface {p3, p1, p2}, LS5/d;->b(J)V

    .line 98
    .line 99
    .line 100
    const/4 p1, 0x2

    .line 101
    iput p1, v1, LN2/i;->e:I

    .line 102
    .line 103
    :cond_1
    :goto_0
    return-void

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public e(LJ5/h;)Z
    .locals 8

    .line 1
    new-instance v0, LN2/f;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LN2/f;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, LN2/f;->a(LJ5/h;Z)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_3

    .line 13
    .line 14
    iget v2, v0, LN2/f;->a:I

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    and-int/2addr v2, v4

    .line 18
    if-eq v2, v4, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    iget v0, v0, LN2/f;->e:I

    .line 22
    .line 23
    const/16 v2, 0x8

    .line 24
    .line 25
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    new-instance v2, LY4/b;

    .line 30
    .line 31
    invoke-direct {v2, v0}, LY4/b;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iget-object v4, v2, LY4/b;->a:[B

    .line 35
    .line 36
    invoke-virtual {p1, v4, v3, v0, v3}, LJ5/h;->c([BIIZ)Z

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v3}, LY4/b;->A(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, LY4/b;->a()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    const/4 v0, 0x5

    .line 47
    if-lt p1, v0, :cond_1

    .line 48
    .line 49
    invoke-virtual {v2}, LY4/b;->q()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    const/16 v0, 0x7f

    .line 54
    .line 55
    if-ne p1, v0, :cond_1

    .line 56
    .line 57
    invoke-virtual {v2}, LY4/b;->r()J

    .line 58
    .line 59
    .line 60
    move-result-wide v4

    .line 61
    const-wide/32 v6, 0x464c4143

    .line 62
    .line 63
    .line 64
    cmp-long p1, v4, v6

    .line 65
    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    new-instance p1, LS5/b;

    .line 69
    .line 70
    const/4 v0, 0x1

    .line 71
    invoke-direct {p1, v0}, LN2/i;-><init>(I)V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, LS5/c;->d:Ljava/lang/Object;

    .line 75
    .line 76
    return v1

    .line 77
    :cond_1
    invoke-virtual {v2, v3}, LY4/b;->A(I)V

    .line 78
    .line 79
    .line 80
    :try_start_0
    invoke-static {v1, v2, v1}, Landroid/support/v4/media/session/b;->v0(ILY4/b;Z)Z

    .line 81
    .line 82
    .line 83
    move-result p1
    :try_end_0
    .catch LE5/o0; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    goto :goto_0

    .line 85
    :catch_0
    move p1, v3

    .line 86
    :goto_0
    if-eqz p1, :cond_2

    .line 87
    .line 88
    new-instance p1, LS5/f;

    .line 89
    .line 90
    const/4 v0, 0x1

    .line 91
    invoke-direct {p1, v0}, LN2/i;-><init>(I)V

    .line 92
    .line 93
    .line 94
    iput-object p1, p0, LS5/c;->d:Ljava/lang/Object;

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    invoke-virtual {v2, v3}, LY4/b;->A(I)V

    .line 98
    .line 99
    .line 100
    sget-object p1, LS5/e;->p:[B

    .line 101
    .line 102
    invoke-static {v2, p1}, LS5/e;->g(LY4/b;[B)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_3

    .line 107
    .line 108
    new-instance p1, LS5/e;

    .line 109
    .line 110
    const/4 v0, 0x1

    .line 111
    invoke-direct {p1, v0}, LN2/i;-><init>(I)V

    .line 112
    .line 113
    .line 114
    iput-object p1, p0, LS5/c;->d:Ljava/lang/Object;

    .line 115
    .line 116
    :goto_1
    return v1

    .line 117
    :cond_3
    :goto_2
    return v3
.end method

.method public final g(LJ5/l;LJ5/n;)I
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x4

    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    const/4 v5, -0x1

    .line 8
    const/4 v6, 0x0

    .line 9
    iget v7, v0, LS5/c;->a:I

    .line 10
    .line 11
    packed-switch v7, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v7, v0, LS5/c;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v7, LY4/b;

    .line 17
    .line 18
    iget-object v8, v7, LY4/b;->a:[B

    .line 19
    .line 20
    move-object/from16 v9, p1

    .line 21
    .line 22
    check-cast v9, LJ5/h;

    .line 23
    .line 24
    const/16 v10, 0x4000

    .line 25
    .line 26
    invoke-virtual {v9, v8, v6, v10}, LJ5/h;->read([BII)I

    .line 27
    .line 28
    .line 29
    move-result v8

    .line 30
    if-ne v8, v5, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v7, v6}, LY4/b;->A(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v7, v8}, LY4/b;->z(I)V

    .line 37
    .line 38
    .line 39
    iget-boolean v5, v0, LS5/c;->b:Z

    .line 40
    .line 41
    iget-object v8, v0, LS5/c;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v8, LT5/a;

    .line 44
    .line 45
    if-nez v5, :cond_1

    .line 46
    .line 47
    invoke-virtual {v8, v2, v3, v4}, LT5/a;->d(IJ)V

    .line 48
    .line 49
    .line 50
    iput-boolean v1, v0, LS5/c;->b:Z

    .line 51
    .line 52
    :cond_1
    invoke-virtual {v8, v7}, LT5/a;->c(LY4/b;)V

    .line 53
    .line 54
    .line 55
    move v5, v6

    .line 56
    :goto_0
    return v5

    .line 57
    :pswitch_0
    iget-object v7, v0, LS5/c;->d:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v7, LY4/b;

    .line 60
    .line 61
    iget-object v8, v7, LY4/b;->a:[B

    .line 62
    .line 63
    move-object/from16 v9, p1

    .line 64
    .line 65
    check-cast v9, LJ5/h;

    .line 66
    .line 67
    const/16 v10, 0xae2

    .line 68
    .line 69
    invoke-virtual {v9, v8, v6, v10}, LJ5/h;->read([BII)I

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-ne v8, v5, :cond_2

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    invoke-virtual {v7, v6}, LY4/b;->A(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v7, v8}, LY4/b;->z(I)V

    .line 80
    .line 81
    .line 82
    iget-boolean v5, v0, LS5/c;->b:Z

    .line 83
    .line 84
    iget-object v8, v0, LS5/c;->c:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v8, LT5/a;

    .line 87
    .line 88
    if-nez v5, :cond_3

    .line 89
    .line 90
    invoke-virtual {v8, v2, v3, v4}, LT5/a;->d(IJ)V

    .line 91
    .line 92
    .line 93
    iput-boolean v1, v0, LS5/c;->b:Z

    .line 94
    .line 95
    :cond_3
    invoke-virtual {v8, v7}, LT5/a;->c(LY4/b;)V

    .line 96
    .line 97
    .line 98
    move v5, v6

    .line 99
    :goto_1
    return v5

    .line 100
    :pswitch_1
    iget-object v7, v0, LS5/c;->c:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v7, Lf6/N;

    .line 103
    .line 104
    invoke-static {v7}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-object v7, v0, LS5/c;->d:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v7, LN2/i;

    .line 110
    .line 111
    if-nez v7, :cond_5

    .line 112
    .line 113
    move-object/from16 v7, p1

    .line 114
    .line 115
    check-cast v7, LJ5/h;

    .line 116
    .line 117
    invoke-virtual {v0, v7}, LS5/c;->e(LJ5/h;)Z

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    if-eqz v8, :cond_4

    .line 122
    .line 123
    iput v6, v7, LJ5/h;->f:I

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    const-string v1, "Failed to determine bitstream type"

    .line 127
    .line 128
    const/4 v2, 0x0

    .line 129
    invoke-static {v1, v2}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    throw v1

    .line 134
    :cond_5
    :goto_2
    iget-boolean v7, v0, LS5/c;->b:Z

    .line 135
    .line 136
    if-nez v7, :cond_6

    .line 137
    .line 138
    iget-object v7, v0, LS5/c;->c:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v7, Lf6/N;

    .line 141
    .line 142
    invoke-virtual {v7, v6, v1}, Lf6/N;->m(II)LJ5/w;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    iget-object v8, v0, LS5/c;->c:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v8, Lf6/N;

    .line 149
    .line 150
    invoke-virtual {v8}, Lf6/N;->l()V

    .line 151
    .line 152
    .line 153
    iget-object v8, v0, LS5/c;->d:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v8, LN2/i;

    .line 156
    .line 157
    iget-object v9, v0, LS5/c;->c:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v9, Lf6/N;

    .line 160
    .line 161
    iput-object v9, v8, LN2/i;->l:Ljava/lang/Object;

    .line 162
    .line 163
    iput-object v7, v8, LN2/i;->k:Ljava/lang/Object;

    .line 164
    .line 165
    invoke-virtual {v8, v1}, LN2/i;->f(Z)V

    .line 166
    .line 167
    .line 168
    iput-boolean v1, v0, LS5/c;->b:Z

    .line 169
    .line 170
    :cond_6
    iget-object v7, v0, LS5/c;->d:Ljava/lang/Object;

    .line 171
    .line 172
    move-object v9, v7

    .line 173
    check-cast v9, LN2/i;

    .line 174
    .line 175
    iget-object v7, v9, LN2/i;->k:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v7, LJ5/w;

    .line 178
    .line 179
    invoke-static {v7}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    sget v7, Lu6/v;->a:I

    .line 183
    .line 184
    iget v7, v9, LN2/i;->e:I

    .line 185
    .line 186
    iget-object v8, v9, LN2/i;->j:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v8, LN2/e;

    .line 189
    .line 190
    const-wide/16 v10, -0x1

    .line 191
    .line 192
    const/4 v12, 0x3

    .line 193
    const/4 v13, 0x2

    .line 194
    if-eqz v7, :cond_10

    .line 195
    .line 196
    if-eq v7, v1, :cond_f

    .line 197
    .line 198
    if-eq v7, v13, :cond_8

    .line 199
    .line 200
    if-ne v7, v12, :cond_7

    .line 201
    .line 202
    :goto_3
    move v1, v5

    .line 203
    goto/16 :goto_b

    .line 204
    .line 205
    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 206
    .line 207
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 208
    .line 209
    .line 210
    throw v1

    .line 211
    :cond_8
    iget-object v2, v9, LN2/i;->m:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v2, LS5/d;

    .line 214
    .line 215
    move-object/from16 v7, p1

    .line 216
    .line 217
    check-cast v7, LJ5/h;

    .line 218
    .line 219
    invoke-interface {v2, v7}, LS5/d;->d(LJ5/h;)J

    .line 220
    .line 221
    .line 222
    move-result-wide v13

    .line 223
    cmp-long v2, v13, v3

    .line 224
    .line 225
    if-ltz v2, :cond_9

    .line 226
    .line 227
    move-object/from16 v2, p2

    .line 228
    .line 229
    iput-wide v13, v2, LJ5/n;->a:J

    .line 230
    .line 231
    goto/16 :goto_b

    .line 232
    .line 233
    :cond_9
    cmp-long v2, v13, v10

    .line 234
    .line 235
    if-gez v2, :cond_a

    .line 236
    .line 237
    const-wide/16 v15, 0x2

    .line 238
    .line 239
    add-long/2addr v13, v15

    .line 240
    neg-long v13, v13

    .line 241
    invoke-virtual {v9, v13, v14}, LN2/i;->a(J)V

    .line 242
    .line 243
    .line 244
    :cond_a
    iget-boolean v2, v9, LN2/i;->h:Z

    .line 245
    .line 246
    if-nez v2, :cond_b

    .line 247
    .line 248
    iget-object v2, v9, LN2/i;->m:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v2, LS5/d;

    .line 251
    .line 252
    invoke-interface {v2}, LS5/d;->a()LJ5/t;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    invoke-static {v2}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    iget-object v13, v9, LN2/i;->l:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v13, Lf6/N;

    .line 262
    .line 263
    invoke-virtual {v13, v2}, Lf6/N;->x(LJ5/t;)V

    .line 264
    .line 265
    .line 266
    iput-boolean v1, v9, LN2/i;->h:Z

    .line 267
    .line 268
    :cond_b
    iget-wide v1, v9, LN2/i;->g:J

    .line 269
    .line 270
    cmp-long v1, v1, v3

    .line 271
    .line 272
    if-gtz v1, :cond_d

    .line 273
    .line 274
    invoke-virtual {v8, v7}, LN2/e;->c(LJ5/h;)Z

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    if-eqz v1, :cond_c

    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_c
    iput v12, v9, LN2/i;->e:I

    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_d
    :goto_4
    iput-wide v3, v9, LN2/i;->g:J

    .line 285
    .line 286
    iget-object v1, v8, LN2/e;->f:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v1, LY4/b;

    .line 289
    .line 290
    invoke-virtual {v9, v1}, LN2/i;->c(LY4/b;)J

    .line 291
    .line 292
    .line 293
    move-result-wide v7

    .line 294
    cmp-long v2, v7, v3

    .line 295
    .line 296
    if-ltz v2, :cond_e

    .line 297
    .line 298
    iget-wide v2, v9, LN2/i;->d:J

    .line 299
    .line 300
    add-long v4, v2, v7

    .line 301
    .line 302
    iget-wide v12, v9, LN2/i;->b:J

    .line 303
    .line 304
    cmp-long v4, v4, v12

    .line 305
    .line 306
    if-ltz v4, :cond_e

    .line 307
    .line 308
    const-wide/32 v4, 0xf4240

    .line 309
    .line 310
    .line 311
    mul-long/2addr v2, v4

    .line 312
    iget v4, v9, LN2/i;->f:I

    .line 313
    .line 314
    int-to-long v4, v4

    .line 315
    div-long v13, v2, v4

    .line 316
    .line 317
    iget-object v2, v9, LN2/i;->k:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v2, LJ5/w;

    .line 320
    .line 321
    iget v3, v1, LY4/b;->c:I

    .line 322
    .line 323
    invoke-interface {v2, v3, v1}, LJ5/w;->c(ILY4/b;)V

    .line 324
    .line 325
    .line 326
    iget-object v2, v9, LN2/i;->k:Ljava/lang/Object;

    .line 327
    .line 328
    move-object v12, v2

    .line 329
    check-cast v12, LJ5/w;

    .line 330
    .line 331
    iget v1, v1, LY4/b;->c:I

    .line 332
    .line 333
    const/16 v17, 0x0

    .line 334
    .line 335
    const/16 v18, 0x0

    .line 336
    .line 337
    const/4 v15, 0x1

    .line 338
    move/from16 v16, v1

    .line 339
    .line 340
    invoke-interface/range {v12 .. v18}, LJ5/w;->b(JIIILJ5/v;)V

    .line 341
    .line 342
    .line 343
    iput-wide v10, v9, LN2/i;->b:J

    .line 344
    .line 345
    :cond_e
    iget-wide v1, v9, LN2/i;->d:J

    .line 346
    .line 347
    add-long/2addr v1, v7

    .line 348
    iput-wide v1, v9, LN2/i;->d:J

    .line 349
    .line 350
    :goto_5
    move v1, v6

    .line 351
    goto/16 :goto_b

    .line 352
    .line 353
    :cond_f
    iget-wide v1, v9, LN2/i;->c:J

    .line 354
    .line 355
    long-to-int v1, v1

    .line 356
    move-object/from16 v2, p1

    .line 357
    .line 358
    check-cast v2, LJ5/h;

    .line 359
    .line 360
    invoke-virtual {v2, v1}, LJ5/h;->j(I)V

    .line 361
    .line 362
    .line 363
    iput v13, v9, LN2/i;->e:I

    .line 364
    .line 365
    goto :goto_5

    .line 366
    :cond_10
    :goto_6
    move-object/from16 v3, p1

    .line 367
    .line 368
    check-cast v3, LJ5/h;

    .line 369
    .line 370
    invoke-virtual {v8, v3}, LN2/e;->c(LJ5/h;)Z

    .line 371
    .line 372
    .line 373
    move-result v4

    .line 374
    if-nez v4, :cond_11

    .line 375
    .line 376
    iput v12, v9, LN2/i;->e:I

    .line 377
    .line 378
    goto/16 :goto_3

    .line 379
    .line 380
    :cond_11
    iget-wide v3, v3, LJ5/h;->d:J

    .line 381
    .line 382
    iget-wide v14, v9, LN2/i;->c:J

    .line 383
    .line 384
    sub-long/2addr v3, v14

    .line 385
    iput-wide v3, v9, LN2/i;->g:J

    .line 386
    .line 387
    iget-object v3, v9, LN2/i;->n:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v3, LS3/s;

    .line 390
    .line 391
    iget-object v4, v8, LN2/e;->f:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v4, LY4/b;

    .line 394
    .line 395
    invoke-virtual {v9, v4, v14, v15, v3}, LN2/i;->e(LY4/b;JLS3/s;)Z

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    if-eqz v3, :cond_12

    .line 400
    .line 401
    move-object/from16 v3, p1

    .line 402
    .line 403
    check-cast v3, LJ5/h;

    .line 404
    .line 405
    iget-wide v3, v3, LJ5/h;->d:J

    .line 406
    .line 407
    iput-wide v3, v9, LN2/i;->c:J

    .line 408
    .line 409
    goto :goto_6

    .line 410
    :cond_12
    iget-object v3, v9, LN2/i;->n:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast v3, LS3/s;

    .line 413
    .line 414
    iget-object v3, v3, LS3/s;->b:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v3, LE5/T;

    .line 417
    .line 418
    iget v5, v3, LE5/T;->z:I

    .line 419
    .line 420
    iput v5, v9, LN2/i;->f:I

    .line 421
    .line 422
    iget-boolean v5, v9, LN2/i;->i:Z

    .line 423
    .line 424
    if-nez v5, :cond_13

    .line 425
    .line 426
    iget-object v5, v9, LN2/i;->k:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v5, LJ5/w;

    .line 429
    .line 430
    invoke-interface {v5, v3}, LJ5/w;->a(LE5/T;)V

    .line 431
    .line 432
    .line 433
    iput-boolean v1, v9, LN2/i;->i:Z

    .line 434
    .line 435
    :cond_13
    iget-object v3, v9, LN2/i;->n:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v3, LS3/s;

    .line 438
    .line 439
    iget-object v3, v3, LS3/s;->c:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast v3, LA7/B1;

    .line 442
    .line 443
    if-eqz v3, :cond_14

    .line 444
    .line 445
    iput-object v3, v9, LN2/i;->m:Ljava/lang/Object;

    .line 446
    .line 447
    :goto_7
    move v1, v13

    .line 448
    goto :goto_9

    .line 449
    :cond_14
    move-object/from16 v3, p1

    .line 450
    .line 451
    check-cast v3, LJ5/h;

    .line 452
    .line 453
    iget-wide v14, v3, LJ5/h;->c:J

    .line 454
    .line 455
    cmp-long v3, v14, v10

    .line 456
    .line 457
    if-nez v3, :cond_15

    .line 458
    .line 459
    new-instance v1, Lx9/d;

    .line 460
    .line 461
    const/16 v2, 0x1a

    .line 462
    .line 463
    invoke-direct {v1, v2}, Lx9/d;-><init>(I)V

    .line 464
    .line 465
    .line 466
    iput-object v1, v9, LN2/i;->m:Ljava/lang/Object;

    .line 467
    .line 468
    goto :goto_7

    .line 469
    :cond_15
    iget-object v3, v8, LN2/e;->e:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast v3, LN2/f;

    .line 472
    .line 473
    iget v5, v3, LN2/f;->a:I

    .line 474
    .line 475
    and-int/2addr v2, v5

    .line 476
    if-eqz v2, :cond_16

    .line 477
    .line 478
    move/from16 v18, v1

    .line 479
    .line 480
    goto :goto_8

    .line 481
    :cond_16
    move/from16 v18, v6

    .line 482
    .line 483
    :goto_8
    new-instance v8, LN2/b;

    .line 484
    .line 485
    iget-wide v10, v9, LN2/i;->c:J

    .line 486
    .line 487
    iget v1, v3, LN2/f;->d:I

    .line 488
    .line 489
    iget v2, v3, LN2/f;->e:I

    .line 490
    .line 491
    add-int/2addr v1, v2

    .line 492
    int-to-long v1, v1

    .line 493
    iget-wide v6, v3, LN2/f;->b:J

    .line 494
    .line 495
    const/16 v19, 0x0

    .line 496
    .line 497
    move-wide/from16 v16, v1

    .line 498
    .line 499
    move v1, v13

    .line 500
    move-wide v12, v14

    .line 501
    move-wide/from16 v14, v16

    .line 502
    .line 503
    move-wide/from16 v16, v6

    .line 504
    .line 505
    invoke-direct/range {v8 .. v19}, LN2/b;-><init>(LN2/i;JJJJZB)V

    .line 506
    .line 507
    .line 508
    iput-object v8, v9, LN2/i;->m:Ljava/lang/Object;

    .line 509
    .line 510
    :goto_9
    iput v1, v9, LN2/i;->e:I

    .line 511
    .line 512
    iget-object v1, v4, LY4/b;->a:[B

    .line 513
    .line 514
    array-length v2, v1

    .line 515
    const v3, 0xfe01

    .line 516
    .line 517
    .line 518
    if-ne v2, v3, :cond_17

    .line 519
    .line 520
    :goto_a
    const/4 v1, 0x0

    .line 521
    goto :goto_b

    .line 522
    :cond_17
    iget v2, v4, LY4/b;->c:I

    .line 523
    .line 524
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 525
    .line 526
    .line 527
    move-result v2

    .line 528
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    iget v2, v4, LY4/b;->c:I

    .line 533
    .line 534
    invoke-virtual {v4, v2, v1}, LY4/b;->y(I[B)V

    .line 535
    .line 536
    .line 537
    goto :goto_a

    .line 538
    :goto_b
    return v1

    .line 539
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Lf6/N;)V
    .locals 5

    .line 1
    iget v0, p0, LS5/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LT5/B;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v0, v1, v2, v3, v4}, LT5/B;-><init>(IIIB)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, LS5/c;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, LT5/a;

    .line 18
    .line 19
    invoke-virtual {v1, p1, v0}, LT5/a;->g(LJ5/m;LT5/B;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lf6/N;->l()V

    .line 23
    .line 24
    .line 25
    new-instance v0, LJ5/o;

    .line 26
    .line 27
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1, v2}, LJ5/o;-><init>(J)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Lf6/N;->x(LJ5/t;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_0
    new-instance v0, LT5/B;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    const/4 v2, 0x1

    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x0

    .line 45
    invoke-direct {v0, v1, v2, v3, v4}, LT5/B;-><init>(IIIB)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, LS5/c;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, LT5/a;

    .line 51
    .line 52
    invoke-virtual {v1, p1, v0}, LT5/a;->g(LJ5/m;LT5/B;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lf6/N;->l()V

    .line 56
    .line 57
    .line 58
    new-instance v0, LJ5/o;

    .line 59
    .line 60
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    invoke-direct {v0, v1, v2}, LJ5/o;-><init>(J)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v0}, Lf6/N;->x(LJ5/t;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_1
    iput-object p1, p0, LS5/c;->c:Ljava/lang/Object;

    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(LJ5/l;)Z
    .locals 14

    .line 1
    iget v0, p0, LS5/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LY4/b;

    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    invoke-direct {v0, v1}, LY4/b;-><init>(I)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    iget-object v4, v0, LY4/b;->a:[B

    .line 16
    .line 17
    move-object v5, p1

    .line 18
    check-cast v5, LJ5/h;

    .line 19
    .line 20
    invoke-virtual {v5, v4, v2, v1, v2}, LJ5/h;->c([BIIZ)Z

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v2}, LY4/b;->A(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, LY4/b;->s()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const v6, 0x494433

    .line 31
    .line 32
    .line 33
    const/4 v7, 0x3

    .line 34
    if-eq v4, v6, :cond_7

    .line 35
    .line 36
    iput v2, v5, LJ5/h;->f:I

    .line 37
    .line 38
    invoke-virtual {v5, v3, v2}, LJ5/h;->b(IZ)Z

    .line 39
    .line 40
    .line 41
    move p1, v2

    .line 42
    move v1, v3

    .line 43
    :goto_1
    iget-object v4, v0, LY4/b;->a:[B

    .line 44
    .line 45
    const/4 v6, 0x7

    .line 46
    invoke-virtual {v5, v4, v2, v6, v2}, LJ5/h;->c([BIIZ)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2}, LY4/b;->A(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, LY4/b;->v()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    const v8, 0xac40

    .line 57
    .line 58
    .line 59
    const v9, 0xac41

    .line 60
    .line 61
    .line 62
    if-eq v4, v8, :cond_1

    .line 63
    .line 64
    if-eq v4, v9, :cond_1

    .line 65
    .line 66
    iput v2, v5, LJ5/h;->f:I

    .line 67
    .line 68
    add-int/lit8 v1, v1, 0x1

    .line 69
    .line 70
    sub-int p1, v1, v3

    .line 71
    .line 72
    const/16 v4, 0x2000

    .line 73
    .line 74
    if-lt p1, v4, :cond_0

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_0
    invoke-virtual {v5, v1, v2}, LJ5/h;->b(IZ)Z

    .line 78
    .line 79
    .line 80
    move p1, v2

    .line 81
    goto :goto_1

    .line 82
    :cond_1
    const/4 v8, 0x1

    .line 83
    add-int/2addr p1, v8

    .line 84
    const/4 v10, 0x4

    .line 85
    if-lt p1, v10, :cond_2

    .line 86
    .line 87
    move v2, v8

    .line 88
    goto :goto_4

    .line 89
    :cond_2
    iget-object v8, v0, LY4/b;->a:[B

    .line 90
    .line 91
    array-length v11, v8

    .line 92
    const/4 v12, -0x1

    .line 93
    if-ge v11, v6, :cond_3

    .line 94
    .line 95
    move v11, v12

    .line 96
    goto :goto_3

    .line 97
    :cond_3
    const/4 v11, 0x2

    .line 98
    aget-byte v11, v8, v11

    .line 99
    .line 100
    and-int/lit16 v11, v11, 0xff

    .line 101
    .line 102
    shl-int/lit8 v11, v11, 0x8

    .line 103
    .line 104
    aget-byte v13, v8, v7

    .line 105
    .line 106
    and-int/lit16 v13, v13, 0xff

    .line 107
    .line 108
    or-int/2addr v11, v13

    .line 109
    const v13, 0xffff

    .line 110
    .line 111
    .line 112
    if-ne v11, v13, :cond_4

    .line 113
    .line 114
    aget-byte v10, v8, v10

    .line 115
    .line 116
    and-int/lit16 v10, v10, 0xff

    .line 117
    .line 118
    shl-int/lit8 v10, v10, 0x10

    .line 119
    .line 120
    const/4 v11, 0x5

    .line 121
    aget-byte v11, v8, v11

    .line 122
    .line 123
    and-int/lit16 v11, v11, 0xff

    .line 124
    .line 125
    shl-int/lit8 v11, v11, 0x8

    .line 126
    .line 127
    or-int/2addr v10, v11

    .line 128
    const/4 v11, 0x6

    .line 129
    aget-byte v8, v8, v11

    .line 130
    .line 131
    and-int/lit16 v8, v8, 0xff

    .line 132
    .line 133
    or-int v11, v10, v8

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_4
    move v6, v10

    .line 137
    :goto_2
    if-ne v4, v9, :cond_5

    .line 138
    .line 139
    add-int/lit8 v6, v6, 0x2

    .line 140
    .line 141
    :cond_5
    add-int/2addr v11, v6

    .line 142
    :goto_3
    if-ne v11, v12, :cond_6

    .line 143
    .line 144
    :goto_4
    return v2

    .line 145
    :cond_6
    add-int/lit8 v11, v11, -0x7

    .line 146
    .line 147
    invoke-virtual {v5, v11, v2}, LJ5/h;->b(IZ)Z

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_7
    invoke-virtual {v0, v7}, LY4/b;->B(I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, LY4/b;->p()I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    add-int/lit8 v6, v4, 0xa

    .line 159
    .line 160
    add-int/2addr v3, v6

    .line 161
    invoke-virtual {v5, v4, v2}, LJ5/h;->b(IZ)Z

    .line 162
    .line 163
    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :pswitch_0
    new-instance v0, LY4/b;

    .line 167
    .line 168
    const/16 v1, 0xa

    .line 169
    .line 170
    invoke-direct {v0, v1}, LY4/b;-><init>(I)V

    .line 171
    .line 172
    .line 173
    const/4 v2, 0x0

    .line 174
    move v3, v2

    .line 175
    :goto_5
    iget-object v4, v0, LY4/b;->a:[B

    .line 176
    .line 177
    move-object v5, p1

    .line 178
    check-cast v5, LJ5/h;

    .line 179
    .line 180
    invoke-virtual {v5, v4, v2, v1, v2}, LJ5/h;->c([BIIZ)Z

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, v2}, LY4/b;->A(I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, LY4/b;->s()I

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    const v6, 0x494433

    .line 191
    .line 192
    .line 193
    const/4 v7, 0x3

    .line 194
    if-eq v4, v6, :cond_e

    .line 195
    .line 196
    iput v2, v5, LJ5/h;->f:I

    .line 197
    .line 198
    invoke-virtual {v5, v3, v2}, LJ5/h;->b(IZ)Z

    .line 199
    .line 200
    .line 201
    move p1, v2

    .line 202
    move v4, v3

    .line 203
    :goto_6
    iget-object v6, v0, LY4/b;->a:[B

    .line 204
    .line 205
    const/4 v8, 0x6

    .line 206
    invoke-virtual {v5, v6, v2, v8, v2}, LJ5/h;->c([BIIZ)Z

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, v2}, LY4/b;->A(I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0}, LY4/b;->v()I

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    const/16 v9, 0xb77

    .line 217
    .line 218
    if-eq v6, v9, :cond_9

    .line 219
    .line 220
    iput v2, v5, LJ5/h;->f:I

    .line 221
    .line 222
    add-int/lit8 v4, v4, 0x1

    .line 223
    .line 224
    sub-int p1, v4, v3

    .line 225
    .line 226
    const/16 v6, 0x2000

    .line 227
    .line 228
    if-lt p1, v6, :cond_8

    .line 229
    .line 230
    goto :goto_8

    .line 231
    :cond_8
    invoke-virtual {v5, v4, v2}, LJ5/h;->b(IZ)Z

    .line 232
    .line 233
    .line 234
    move p1, v2

    .line 235
    goto :goto_6

    .line 236
    :cond_9
    const/4 v6, 0x1

    .line 237
    add-int/2addr p1, v6

    .line 238
    const/4 v9, 0x4

    .line 239
    if-lt p1, v9, :cond_a

    .line 240
    .line 241
    move v2, v6

    .line 242
    goto :goto_8

    .line 243
    :cond_a
    iget-object v10, v0, LY4/b;->a:[B

    .line 244
    .line 245
    array-length v11, v10

    .line 246
    const/4 v12, -0x1

    .line 247
    if-ge v11, v8, :cond_b

    .line 248
    .line 249
    move v9, v12

    .line 250
    goto :goto_7

    .line 251
    :cond_b
    const/4 v11, 0x5

    .line 252
    aget-byte v11, v10, v11

    .line 253
    .line 254
    and-int/lit16 v11, v11, 0xf8

    .line 255
    .line 256
    shr-int/2addr v11, v7

    .line 257
    if-le v11, v1, :cond_c

    .line 258
    .line 259
    const/4 v8, 0x2

    .line 260
    aget-byte v9, v10, v8

    .line 261
    .line 262
    and-int/lit8 v9, v9, 0x7

    .line 263
    .line 264
    shl-int/lit8 v9, v9, 0x8

    .line 265
    .line 266
    aget-byte v10, v10, v7

    .line 267
    .line 268
    and-int/lit16 v10, v10, 0xff

    .line 269
    .line 270
    or-int/2addr v9, v10

    .line 271
    add-int/2addr v9, v6

    .line 272
    mul-int/2addr v9, v8

    .line 273
    goto :goto_7

    .line 274
    :cond_c
    aget-byte v6, v10, v9

    .line 275
    .line 276
    and-int/lit16 v9, v6, 0xc0

    .line 277
    .line 278
    shr-int/lit8 v8, v9, 0x6

    .line 279
    .line 280
    and-int/lit8 v6, v6, 0x3f

    .line 281
    .line 282
    invoke-static {v8, v6}, LG5/b;->b(II)I

    .line 283
    .line 284
    .line 285
    move-result v9

    .line 286
    :goto_7
    if-ne v9, v12, :cond_d

    .line 287
    .line 288
    :goto_8
    return v2

    .line 289
    :cond_d
    add-int/lit8 v9, v9, -0x6

    .line 290
    .line 291
    invoke-virtual {v5, v9, v2}, LJ5/h;->b(IZ)Z

    .line 292
    .line 293
    .line 294
    goto :goto_6

    .line 295
    :cond_e
    invoke-virtual {v0, v7}, LY4/b;->B(I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0}, LY4/b;->p()I

    .line 299
    .line 300
    .line 301
    move-result v4

    .line 302
    add-int/lit8 v6, v4, 0xa

    .line 303
    .line 304
    add-int/2addr v3, v6

    .line 305
    invoke-virtual {v5, v4, v2}, LJ5/h;->b(IZ)Z

    .line 306
    .line 307
    .line 308
    goto/16 :goto_5

    .line 309
    .line 310
    :pswitch_1
    :try_start_0
    check-cast p1, LJ5/h;

    .line 311
    .line 312
    invoke-virtual {p0, p1}, LS5/c;->e(LJ5/h;)Z

    .line 313
    .line 314
    .line 315
    move-result p1
    :try_end_0
    .catch LE5/o0; {:try_start_0 .. :try_end_0} :catch_0

    .line 316
    goto :goto_9

    .line 317
    :catch_0
    const/4 p1, 0x0

    .line 318
    :goto_9
    return p1

    .line 319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final release()V
    .locals 1

    .line 1
    iget v0, p0, LS5/c;->a:I

    return-void
.end method
