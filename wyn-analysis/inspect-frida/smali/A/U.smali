.class public final LA/U;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LS3/c;

.field public final b:Ljava/lang/String;

.field public final c:LN/Y;

.field public final d:LN/Y;

.field public final e:LN/Y;

.field public final f:LN/Y;

.field public final g:LN/Y;

.field public final h:LX/p;

.field public final i:LX/p;

.field public final j:LN/Y;

.field public final k:LN/z;


# direct methods
.method public constructor <init>(LS3/c;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA/U;->a:LS3/c;

    .line 5
    .line 6
    iput-object p2, p0, LA/U;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p0}, LA/U;->b()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object p2, LN/P;->f:LN/P;

    .line 13
    .line 14
    invoke-static {p1, p2}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, LA/U;->c:LN/Y;

    .line 19
    .line 20
    new-instance p1, LA/N;

    .line 21
    .line 22
    invoke-virtual {p0}, LA/U;->b()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0}, LA/U;->b()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {p1, v0, v1}, LA/N;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, LA/U;->d:LN/Y;

    .line 38
    .line 39
    const-wide/16 v0, 0x0

    .line 40
    .line 41
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p1, p2}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, LA/U;->e:LN/Y;

    .line 50
    .line 51
    const-wide/high16 v0, -0x8000000000000000L

    .line 52
    .line 53
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1, p2}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, p0, LA/U;->f:LN/Y;

    .line 62
    .line 63
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-static {p1, p2}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, LA/U;->g:LN/Y;

    .line 70
    .line 71
    invoke-static {}, LN/d;->F()LX/p;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iput-object p1, p0, LA/U;->h:LX/p;

    .line 76
    .line 77
    invoke-static {}, LN/d;->F()LX/p;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iput-object p1, p0, LA/U;->i:LX/p;

    .line 82
    .line 83
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-static {p1, p2}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iput-object p1, p0, LA/U;->j:LN/Y;

    .line 90
    .line 91
    new-instance p1, LA/T;

    .line 92
    .line 93
    const/4 p2, 0x0

    .line 94
    invoke-direct {p1, p0, p2}, LA/T;-><init>(LA/U;I)V

    .line 95
    .line 96
    .line 97
    sget-object p2, LN/B0;->a:LDd/c;

    .line 98
    .line 99
    new-instance p2, LN/z;

    .line 100
    .line 101
    invoke-direct {p2, p1}, LN/z;-><init>(LA/T;)V

    .line 102
    .line 103
    .line 104
    iput-object p2, p0, LA/U;->k:LN/z;

    .line 105
    .line 106
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;LN/o;I)V
    .locals 4

    .line 1
    const v0, -0x59064cff

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, LN/o;->N(I)LN/o;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p3, 0xe

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p2, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p3

    .line 23
    :goto_1
    and-int/lit8 v1, p3, 0x70

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p2, p0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v0, v1

    .line 39
    :cond_3
    and-int/lit8 v1, v0, 0x5b

    .line 40
    .line 41
    const/16 v2, 0x12

    .line 42
    .line 43
    if-ne v1, v2, :cond_5

    .line 44
    .line 45
    invoke-virtual {p2}, LN/o;->x()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_4

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_4
    invoke-virtual {p2}, LN/o;->I()V

    .line 53
    .line 54
    .line 55
    goto :goto_5

    .line 56
    :cond_5
    :goto_3
    invoke-virtual {p0}, LA/U;->d()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_a

    .line 61
    .line 62
    and-int/lit8 v0, v0, 0x7e

    .line 63
    .line 64
    invoke-virtual {p0, p1, p2, v0}, LA/U;->g(Ljava/lang/Object;LN/o;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, LA/U;->b()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_7

    .line 76
    .line 77
    iget-object v0, p0, LA/U;->f:LN/Y;

    .line 78
    .line 79
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Ljava/lang/Number;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    const-wide/high16 v2, -0x8000000000000000L

    .line 90
    .line 91
    cmp-long v0, v0, v2

    .line 92
    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_6
    iget-object v0, p0, LA/U;->g:LN/Y;

    .line 97
    .line 98
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Ljava/lang/Boolean;

    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_a

    .line 109
    .line 110
    :cond_7
    :goto_4
    const v0, 0x44faf204

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2, v0}, LN/o;->M(I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p2, p0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    if-nez v0, :cond_8

    .line 125
    .line 126
    sget-object v0, LN/k;->a:LN/P;

    .line 127
    .line 128
    if-ne v1, v0, :cond_9

    .line 129
    .line 130
    :cond_8
    new-instance v1, LA/Q;

    .line 131
    .line 132
    const/4 v0, 0x0

    .line 133
    invoke-direct {v1, p0, v0}, LA/Q;-><init>(LA/U;Ljf/c;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2, v1}, LN/o;->U(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_9
    const/4 v0, 0x0

    .line 140
    invoke-virtual {p2, v0}, LN/o;->p(Z)V

    .line 141
    .line 142
    .line 143
    check-cast v1, Ltf/p;

    .line 144
    .line 145
    invoke-static {p2, p0, v1}, LN/d;->d(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 146
    .line 147
    .line 148
    :cond_a
    :goto_5
    invoke-virtual {p2}, LN/o;->r()LN/i0;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    if-nez p2, :cond_b

    .line 153
    .line 154
    return-void

    .line 155
    :cond_b
    new-instance v0, LA/S;

    .line 156
    .line 157
    const/4 v1, 0x0

    .line 158
    invoke-direct {v0, p0, p1, p3, v1}, LA/S;-><init>(LA/U;Ljava/lang/Object;II)V

    .line 159
    .line 160
    .line 161
    iput-object v0, p2, LN/i0;->d:Ltf/p;

    .line 162
    .line 163
    return-void
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LA/U;->a:LS3/c;

    .line 2
    .line 3
    iget-object v0, v0, LS3/c;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LN/Y;

    .line 6
    .line 7
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final c()LA/N;
    .locals 1

    .line 1
    iget-object v0, p0, LA/U;->d:LN/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LA/N;

    .line 8
    .line 9
    return-object v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, LA/U;->j:LN/Y;

    .line 2
    .line 3
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final e(JF)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    iget-object v2, v0, LA/U;->f:LN/Y;

    .line 6
    .line 7
    invoke-virtual {v2}, LN/Y;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    check-cast v3, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    const-wide/high16 v5, -0x8000000000000000L

    .line 18
    .line 19
    cmp-long v3, v3, v5

    .line 20
    .line 21
    iget-object v4, v0, LA/U;->a:LS3/c;

    .line 22
    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v2, v3}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    .line 34
    iget-object v7, v4, LS3/c;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v7, LN/Y;

    .line 37
    .line 38
    invoke-virtual {v7, v3}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 42
    .line 43
    iget-object v7, v0, LA/U;->g:LN/Y;

    .line 44
    .line 45
    invoke-virtual {v7, v3}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, LN/Y;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Ljava/lang/Number;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide v7

    .line 58
    sub-long v7, p1, v7

    .line 59
    .line 60
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    iget-object v7, v0, LA/U;->e:LN/Y;

    .line 65
    .line 66
    invoke-virtual {v7, v3}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object v3, v0, LA/U;->h:LX/p;

    .line 70
    .line 71
    invoke-virtual {v3}, LX/p;->listIterator()Ljava/util/ListIterator;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    const/4 v8, 0x1

    .line 76
    :goto_0
    move-object v9, v3

    .line 77
    check-cast v9, LX/v;

    .line 78
    .line 79
    invoke-virtual {v9}, LX/v;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    const/4 v13, 0x0

    .line 84
    if-eqz v10, :cond_5

    .line 85
    .line 86
    invoke-virtual {v9}, LX/v;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    check-cast v9, LA/O;

    .line 91
    .line 92
    iget-object v10, v9, LA/O;->e:LN/Y;

    .line 93
    .line 94
    invoke-virtual {v10}, LN/Y;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    check-cast v10, Ljava/lang/Boolean;

    .line 99
    .line 100
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    iget-object v14, v9, LA/O;->e:LN/Y;

    .line 105
    .line 106
    if-nez v10, :cond_2

    .line 107
    .line 108
    invoke-virtual {v7}, LN/Y;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    check-cast v10, Ljava/lang/Number;

    .line 113
    .line 114
    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    .line 115
    .line 116
    .line 117
    move-result-wide v15

    .line 118
    const/4 v10, 0x0

    .line 119
    cmpg-float v10, v1, v10

    .line 120
    .line 121
    move-wide/from16 v17, v5

    .line 122
    .line 123
    iget-object v5, v9, LA/O;->f:LN/Y;

    .line 124
    .line 125
    if-nez v10, :cond_1

    .line 126
    .line 127
    invoke-virtual {v9}, LA/O;->a()LA/L;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    const-wide/16 p1, 0x0

    .line 132
    .line 133
    iget-wide v11, v6, LA/L;->h:J

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_1
    const-wide/16 p1, 0x0

    .line 137
    .line 138
    invoke-virtual {v5}, LN/Y;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    check-cast v6, Ljava/lang/Number;

    .line 143
    .line 144
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 145
    .line 146
    .line 147
    move-result-wide v10

    .line 148
    sub-long v10, v15, v10

    .line 149
    .line 150
    long-to-float v6, v10

    .line 151
    div-float/2addr v6, v1

    .line 152
    float-to-long v11, v6

    .line 153
    :goto_1
    invoke-virtual {v9}, LA/O;->a()LA/L;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    invoke-virtual {v6, v11, v12}, LA/L;->a(J)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    iget-object v10, v9, LA/O;->h:LN/Y;

    .line 162
    .line 163
    invoke-virtual {v10, v6}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v9}, LA/O;->a()LA/L;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    invoke-virtual {v6, v11, v12}, LA/L;->b(J)LA/n;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    iput-object v6, v9, LA/O;->i:LA/n;

    .line 175
    .line 176
    invoke-virtual {v9}, LA/O;->a()LA/L;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    iget-wide v9, v6, LA/L;->h:J

    .line 181
    .line 182
    cmp-long v6, v11, v9

    .line 183
    .line 184
    if-ltz v6, :cond_3

    .line 185
    .line 186
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 187
    .line 188
    invoke-virtual {v14, v6}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    invoke-virtual {v5, v6}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_2
    move-wide/from16 v17, v5

    .line 200
    .line 201
    :cond_3
    :goto_2
    invoke-virtual {v14}, LN/Y;->getValue()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    check-cast v5, Ljava/lang/Boolean;

    .line 206
    .line 207
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    if-nez v5, :cond_4

    .line 212
    .line 213
    move v8, v13

    .line 214
    :cond_4
    move-wide/from16 v5, v17

    .line 215
    .line 216
    goto/16 :goto_0

    .line 217
    .line 218
    :cond_5
    move-wide/from16 v17, v5

    .line 219
    .line 220
    const-wide/16 p1, 0x0

    .line 221
    .line 222
    iget-object v3, v0, LA/U;->i:LX/p;

    .line 223
    .line 224
    invoke-virtual {v3}, LX/p;->listIterator()Ljava/util/ListIterator;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    :cond_6
    :goto_3
    move-object v5, v3

    .line 229
    check-cast v5, LX/v;

    .line 230
    .line 231
    invoke-virtual {v5}, LX/v;->hasNext()Z

    .line 232
    .line 233
    .line 234
    move-result v6

    .line 235
    if-eqz v6, :cond_8

    .line 236
    .line 237
    invoke-virtual {v5}, LX/v;->next()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    check-cast v5, LA/U;

    .line 242
    .line 243
    iget-object v6, v5, LA/U;->c:LN/Y;

    .line 244
    .line 245
    invoke-virtual {v6}, LN/Y;->getValue()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    invoke-virtual {v5}, LA/U;->b()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v9

    .line 253
    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    if-nez v6, :cond_7

    .line 258
    .line 259
    invoke-virtual {v7}, LN/Y;->getValue()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v6

    .line 263
    check-cast v6, Ljava/lang/Number;

    .line 264
    .line 265
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 266
    .line 267
    .line 268
    move-result-wide v9

    .line 269
    invoke-virtual {v5, v9, v10, v1}, LA/U;->e(JF)V

    .line 270
    .line 271
    .line 272
    :cond_7
    iget-object v6, v5, LA/U;->c:LN/Y;

    .line 273
    .line 274
    invoke-virtual {v6}, LN/Y;->getValue()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    invoke-virtual {v5}, LA/U;->b()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v5

    .line 286
    if-nez v5, :cond_6

    .line 287
    .line 288
    move v8, v13

    .line 289
    goto :goto_3

    .line 290
    :cond_8
    if-eqz v8, :cond_9

    .line 291
    .line 292
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-virtual {v2, v1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    iget-object v1, v0, LA/U;->c:LN/Y;

    .line 300
    .line 301
    invoke-virtual {v1}, LN/Y;->getValue()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    iget-object v2, v4, LS3/c;->b:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v2, LN/Y;

    .line 308
    .line 309
    invoke-virtual {v2, v1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-virtual {v7, v1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 320
    .line 321
    iget-object v2, v4, LS3/c;->c:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v2, LN/Y;

    .line 324
    .line 325
    invoke-virtual {v2, v1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    :cond_9
    return-void
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LA/U;->f:LN/Y;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LA/U;->a:LS3/c;

    .line 13
    .line 14
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    .line 16
    iget-object v2, v0, LS3/c;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, LN/Y;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, LA/U;->d()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iget-object v2, p0, LA/U;->c:LN/Y;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, LA/U;->b()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    invoke-virtual {v2}, LN/Y;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1, p2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    :cond_0
    iget-object v0, v0, LS3/c;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, LN/Y;

    .line 54
    .line 55
    invoke-virtual {v0, p1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, p2}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 62
    .line 63
    iget-object v1, p0, LA/U;->j:LN/Y;

    .line 64
    .line 65
    invoke-virtual {v1, v0}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    new-instance v0, LA/N;

    .line 69
    .line 70
    invoke-direct {v0, p1, p2}, LA/N;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, LA/U;->d:LN/Y;

    .line 74
    .line 75
    invoke-virtual {p1, v0}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    iget-object p1, p0, LA/U;->i:LX/p;

    .line 79
    .line 80
    invoke-virtual {p1}, LX/p;->listIterator()Ljava/util/ListIterator;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    :cond_2
    :goto_0
    move-object p2, p1

    .line 85
    check-cast p2, LX/v;

    .line 86
    .line 87
    invoke-virtual {p2}, LX/v;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    invoke-virtual {p2}, LX/v;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    check-cast p2, LA/U;

    .line 98
    .line 99
    invoke-virtual {p2}, LA/U;->d()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_2

    .line 104
    .line 105
    invoke-virtual {p2}, LA/U;->b()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iget-object v1, p2, LA/U;->c:LN/Y;

    .line 110
    .line 111
    invoke-virtual {v1}, LN/Y;->getValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {p2, v0, v1}, LA/U;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    iget-object p1, p0, LA/U;->h:LX/p;

    .line 120
    .line 121
    invoke-virtual {p1}, LX/p;->listIterator()Ljava/util/ListIterator;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    :goto_1
    move-object p2, p1

    .line 126
    check-cast p2, LX/v;

    .line 127
    .line 128
    invoke-virtual {p2}, LX/v;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_4

    .line 133
    .line 134
    invoke-virtual {p2}, LX/v;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    check-cast p2, LA/O;

    .line 139
    .line 140
    invoke-virtual {p2}, LA/O;->a()LA/L;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const-wide/16 v1, 0x0

    .line 145
    .line 146
    invoke-virtual {v0, v1, v2}, LA/L;->a(J)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    iget-object v3, p2, LA/O;->h:LN/Y;

    .line 151
    .line 152
    invoke-virtual {v3, v0}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p2}, LA/O;->a()LA/L;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v0, v1, v2}, LA/L;->b(J)LA/n;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    iput-object v0, p2, LA/O;->i:LA/n;

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_4
    return-void
.end method

.method public final g(Ljava/lang/Object;LN/o;I)V
    .locals 4

    .line 1
    const v0, -0x22cebf19

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, LN/o;->N(I)LN/o;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p3, 0xe

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p2, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p3

    .line 23
    :goto_1
    and-int/lit8 v1, p3, 0x70

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p2, p0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v0, v1

    .line 39
    :cond_3
    and-int/lit8 v0, v0, 0x5b

    .line 40
    .line 41
    const/16 v1, 0x12

    .line 42
    .line 43
    if-ne v0, v1, :cond_5

    .line 44
    .line 45
    invoke-virtual {p2}, LN/o;->x()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_4

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_4
    invoke-virtual {p2}, LN/o;->I()V

    .line 53
    .line 54
    .line 55
    goto :goto_6

    .line 56
    :cond_5
    :goto_3
    invoke-virtual {p0}, LA/U;->d()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_8

    .line 61
    .line 62
    iget-object v0, p0, LA/U;->c:LN/Y;

    .line 63
    .line 64
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_8

    .line 73
    .line 74
    new-instance v1, LA/N;

    .line 75
    .line 76
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-direct {v1, v2, p1}, LA/N;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object v2, p0, LA/U;->d:LN/Y;

    .line 84
    .line 85
    invoke-virtual {v2, v1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iget-object v2, p0, LA/U;->a:LS3/c;

    .line 93
    .line 94
    iget-object v2, v2, LS3/c;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v2, LN/Y;

    .line 97
    .line 98
    invoke-virtual {v2, v1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, p1}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, LA/U;->f:LN/Y;

    .line 105
    .line 106
    invoke-virtual {v0}, LN/Y;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Ljava/lang/Number;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 113
    .line 114
    .line 115
    move-result-wide v0

    .line 116
    const-wide/high16 v2, -0x8000000000000000L

    .line 117
    .line 118
    cmp-long v0, v0, v2

    .line 119
    .line 120
    if-eqz v0, :cond_6

    .line 121
    .line 122
    const/4 v0, 0x1

    .line 123
    goto :goto_4

    .line 124
    :cond_6
    const/4 v0, 0x0

    .line 125
    :goto_4
    if-nez v0, :cond_7

    .line 126
    .line 127
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 128
    .line 129
    iget-object v1, p0, LA/U;->g:LN/Y;

    .line 130
    .line 131
    invoke-virtual {v1, v0}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_7
    iget-object v0, p0, LA/U;->h:LX/p;

    .line 135
    .line 136
    invoke-virtual {v0}, LX/p;->listIterator()Ljava/util/ListIterator;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    :goto_5
    move-object v1, v0

    .line 141
    check-cast v1, LX/v;

    .line 142
    .line 143
    invoke-virtual {v1}, LX/v;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-eqz v2, :cond_8

    .line 148
    .line 149
    invoke-virtual {v1}, LX/v;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    check-cast v1, LA/O;

    .line 154
    .line 155
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 156
    .line 157
    iget-object v1, v1, LA/O;->g:LN/Y;

    .line 158
    .line 159
    invoke-virtual {v1, v2}, LN/Y;->setValue(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_8
    :goto_6
    invoke-virtual {p2}, LN/o;->r()LN/i0;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    if-nez p2, :cond_9

    .line 168
    .line 169
    return-void

    .line 170
    :cond_9
    new-instance v0, LA/S;

    .line 171
    .line 172
    const/4 v1, 0x1

    .line 173
    invoke-direct {v0, p0, p1, p3, v1}, LA/S;-><init>(LA/U;Ljava/lang/Object;II)V

    .line 174
    .line 175
    .line 176
    iput-object v0, p2, LN/i0;->d:Ltf/p;

    .line 177
    .line 178
    return-void
.end method
