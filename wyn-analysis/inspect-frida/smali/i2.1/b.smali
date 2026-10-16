.class public final Li2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/F;
.implements Lk2/e0;


# instance fields
.field public final a:LE5/b;

.field public final b:LS1/A;

.field public final c:Lo2/n;

.field public final d:LZ1/g;

.field public final e:LZ1/d;

.field public final f:Lae/d;

.field public final g:LZ1/d;

.field public final h:Lo2/e;

.field public final i:Lk2/n0;

.field public final j:La9/b;

.field public k:Lk2/E;

.field public l:Lj2/c;

.field public m:[Ll2/h;

.field public n:Lk2/n;


# direct methods
.method public constructor <init>(Lj2/c;LE5/b;LS1/A;La9/b;LZ1/g;LZ1/d;Lae/d;LZ1/d;Lo2/n;Lo2/e;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li2/b;->l:Lj2/c;

    .line 5
    .line 6
    iput-object p2, p0, Li2/b;->a:LE5/b;

    .line 7
    .line 8
    iput-object p3, p0, Li2/b;->b:LS1/A;

    .line 9
    .line 10
    iput-object p9, p0, Li2/b;->c:Lo2/n;

    .line 11
    .line 12
    iput-object p5, p0, Li2/b;->d:LZ1/g;

    .line 13
    .line 14
    iput-object p6, p0, Li2/b;->e:LZ1/d;

    .line 15
    .line 16
    iput-object p7, p0, Li2/b;->f:Lae/d;

    .line 17
    .line 18
    iput-object p8, p0, Li2/b;->g:LZ1/d;

    .line 19
    .line 20
    iput-object p10, p0, Li2/b;->h:Lo2/e;

    .line 21
    .line 22
    iput-object p4, p0, Li2/b;->j:La9/b;

    .line 23
    .line 24
    iget-object p3, p1, Lj2/c;->f:[Lj2/b;

    .line 25
    .line 26
    array-length p3, p3

    .line 27
    new-array p3, p3, [LN1/O;

    .line 28
    .line 29
    const/4 p6, 0x0

    .line 30
    move p7, p6

    .line 31
    :goto_0
    iget-object p8, p1, Lj2/c;->f:[Lj2/b;

    .line 32
    .line 33
    array-length p9, p8

    .line 34
    if-ge p7, p9, :cond_3

    .line 35
    .line 36
    aget-object p8, p8, p7

    .line 37
    .line 38
    iget-object p8, p8, Lj2/b;->j:[LN1/n;

    .line 39
    .line 40
    array-length p9, p8

    .line 41
    new-array p9, p9, [LN1/n;

    .line 42
    .line 43
    move p10, p6

    .line 44
    :goto_1
    array-length v0, p8

    .line 45
    if-ge p10, v0, :cond_2

    .line 46
    .line 47
    aget-object v0, p8, p10

    .line 48
    .line 49
    invoke-virtual {v0}, LN1/n;->a()LN1/m;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {p5, v0}, LZ1/g;->l(LN1/n;)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iput v0, v1, LN1/m;->K:I

    .line 58
    .line 59
    new-instance v0, LN1/n;

    .line 60
    .line 61
    invoke-direct {v0, v1}, LN1/n;-><init>(LN1/m;)V

    .line 62
    .line 63
    .line 64
    iget-boolean v1, p2, LE5/b;->b:Z

    .line 65
    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    iget-object v1, p2, LE5/b;->d:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, Lwa/a;

    .line 71
    .line 72
    invoke-virtual {v1, v0}, Lwa/a;->d(LN1/n;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_1

    .line 77
    .line 78
    invoke-virtual {v0}, LN1/n;->a()LN1/m;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    const-string v2, "application/x-media3-cues"

    .line 83
    .line 84
    invoke-static {v2}, LN1/C;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    iput-object v2, v1, LN1/m;->m:Ljava/lang/String;

    .line 89
    .line 90
    iget-object v2, p2, LE5/b;->d:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v2, Lwa/a;

    .line 93
    .line 94
    invoke-virtual {v2, v0}, Lwa/a;->g(LN1/n;)I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    iput v2, v1, LN1/m;->H:I

    .line 99
    .line 100
    new-instance v2, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    iget-object v3, v0, LN1/n;->n:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    iget-object v0, v0, LN1/n;->k:Ljava/lang/String;

    .line 111
    .line 112
    if-eqz v0, :cond_0

    .line 113
    .line 114
    const-string v3, " "

    .line 115
    .line 116
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    goto :goto_2

    .line 121
    :cond_0
    const-string v0, ""

    .line 122
    .line 123
    :goto_2
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iput-object v0, v1, LN1/m;->j:Ljava/lang/String;

    .line 131
    .line 132
    const-wide v2, 0x7fffffffffffffffL

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    iput-wide v2, v1, LN1/m;->r:J

    .line 138
    .line 139
    new-instance v0, LN1/n;

    .line 140
    .line 141
    invoke-direct {v0, v1}, LN1/n;-><init>(LN1/m;)V

    .line 142
    .line 143
    .line 144
    :cond_1
    aput-object v0, p9, p10

    .line 145
    .line 146
    add-int/lit8 p10, p10, 0x1

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_2
    new-instance p8, LN1/O;

    .line 150
    .line 151
    invoke-static {p7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p10

    .line 155
    invoke-direct {p8, p10, p9}, LN1/O;-><init>(Ljava/lang/String;[LN1/n;)V

    .line 156
    .line 157
    .line 158
    aput-object p8, p3, p7

    .line 159
    .line 160
    add-int/lit8 p7, p7, 0x1

    .line 161
    .line 162
    goto/16 :goto_0

    .line 163
    .line 164
    :cond_3
    new-instance p1, Lk2/n0;

    .line 165
    .line 166
    invoke-direct {p1, p3}, Lk2/n0;-><init>([LN1/O;)V

    .line 167
    .line 168
    .line 169
    iput-object p1, p0, Li2/b;->i:Lk2/n0;

    .line 170
    .line 171
    new-array p1, p6, [Ll2/h;

    .line 172
    .line 173
    iput-object p1, p0, Li2/b;->m:[Ll2/h;

    .line 174
    .line 175
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    new-instance p1, Lk2/n;

    .line 179
    .line 180
    sget-object p2, Ll8/K;->b:Ll8/I;

    .line 181
    .line 182
    sget-object p2, Ll8/e0;->e:Ll8/e0;

    .line 183
    .line 184
    invoke-direct {p1, p2, p2}, Lk2/n;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 185
    .line 186
    .line 187
    iput-object p1, p0, Li2/b;->n:Lk2/n;

    .line 188
    .line 189
    return-void
.end method


# virtual methods
.method public final a(Lk2/f0;)V
    .locals 0

    .line 1
    iget-object p1, p0, Li2/b;->k:Lk2/E;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p0}, Lk2/e0;->a(Lk2/f0;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final b(JLU1/a0;)J
    .locals 6

    .line 1
    iget-object v0, p0, Li2/b;->m:[Ll2/h;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    iget v4, v3, Ll2/h;->a:I

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    if-ne v4, v5, :cond_0

    .line 13
    .line 14
    iget-object v0, v3, Ll2/h;->e:Ll2/i;

    .line 15
    .line 16
    invoke-interface {v0, p1, p2, p3}, Ll2/i;->b(JLU1/a0;)J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    return-wide p1

    .line 21
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    return-wide p1
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-object v0, p0, Li2/b;->n:Lk2/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk2/n;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final d(J)J
    .locals 4

    .line 1
    iget-object v0, p0, Li2/b;->m:[Ll2/h;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3, p1, p2}, Ll2/h;->z(J)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-wide p1
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Li2/b;->n:Lk2/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk2/n;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final f()J
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide v0
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, Li2/b;->c:Lo2/n;

    .line 2
    .line 3
    invoke-interface {v0}, Lo2/n;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Li2/b;->m:[Ll2/h;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_0

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3, p1, p2}, Ll2/h;->i(J)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public final j()Lk2/n0;
    .locals 1

    .line 1
    iget-object v0, p0, Li2/b;->i:Lk2/n0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k(LU1/C;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Li2/b;->n:Lk2/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lk2/n;->k(LU1/C;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final n()J
    .locals 2

    .line 1
    iget-object v0, p0, Li2/b;->n:Lk2/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk2/n;->n()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final o(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Li2/b;->n:Lk2/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lk2/n;->o(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final q(Lk2/E;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Li2/b;->k:Lk2/E;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lk2/E;->l(Lk2/F;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final r([Ln2/q;[Z[Lk2/d0;[ZJ)J
    .locals 17

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    move-object/from16 v14, p1

    .line 4
    .line 5
    new-instance v15, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :goto_0
    array-length v1, v14

    .line 12
    if-ge v0, v1, :cond_5

    .line 13
    .line 14
    aget-object v1, p3, v0

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    check-cast v1, Ll2/h;

    .line 19
    .line 20
    aget-object v2, v14, v0

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    aget-boolean v3, p2, v0

    .line 25
    .line 26
    if-nez v3, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    iget-object v3, v1, Ll2/h;->e:Ll2/i;

    .line 30
    .line 31
    check-cast v3, Li2/a;

    .line 32
    .line 33
    iput-object v2, v3, Li2/a;->e:Ln2/q;

    .line 34
    .line 35
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    :goto_1
    const/4 v2, 0x0

    .line 40
    invoke-virtual {v1, v2}, Ll2/h;->y(LX1/b;)V

    .line 41
    .line 42
    .line 43
    aput-object v2, p3, v0

    .line 44
    .line 45
    :cond_2
    :goto_2
    aget-object v1, p3, v0

    .line 46
    .line 47
    if-nez v1, :cond_4

    .line 48
    .line 49
    aget-object v10, v14, v0

    .line 50
    .line 51
    if-eqz v10, :cond_4

    .line 52
    .line 53
    invoke-interface {v10}, Ln2/q;->g()LN1/O;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object v2, v5, Li2/b;->i:Lk2/n0;

    .line 58
    .line 59
    invoke-virtual {v2, v1}, Lk2/n0;->b(LN1/O;)I

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    iget-object v8, v5, Li2/b;->l:Lj2/c;

    .line 64
    .line 65
    iget-object v1, v5, Li2/b;->a:LE5/b;

    .line 66
    .line 67
    iget-object v2, v1, LE5/b;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, LS1/g;

    .line 70
    .line 71
    invoke-interface {v2}, LS1/g;->b()LS1/h;

    .line 72
    .line 73
    .line 74
    move-result-object v11

    .line 75
    iget-object v2, v5, Li2/b;->b:LS1/A;

    .line 76
    .line 77
    if-eqz v2, :cond_3

    .line 78
    .line 79
    invoke-interface {v11, v2}, LS1/h;->C(LS1/A;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    new-instance v4, Li2/a;

    .line 83
    .line 84
    iget-object v2, v1, LE5/b;->d:Ljava/lang/Object;

    .line 85
    .line 86
    move-object v12, v2

    .line 87
    check-cast v12, Lwa/a;

    .line 88
    .line 89
    iget-boolean v13, v1, LE5/b;->b:Z

    .line 90
    .line 91
    iget-object v7, v5, Li2/b;->c:Lo2/n;

    .line 92
    .line 93
    move-object v6, v4

    .line 94
    invoke-direct/range {v6 .. v13}, Li2/a;-><init>(Lo2/n;Lj2/c;ILn2/q;LS1/h;Lwa/a;Z)V

    .line 95
    .line 96
    .line 97
    move v1, v0

    .line 98
    new-instance v0, Ll2/h;

    .line 99
    .line 100
    iget-object v2, v5, Li2/b;->l:Lj2/c;

    .line 101
    .line 102
    iget-object v2, v2, Lj2/c;->f:[Lj2/b;

    .line 103
    .line 104
    aget-object v2, v2, v9

    .line 105
    .line 106
    iget v2, v2, Lj2/b;->a:I

    .line 107
    .line 108
    iget-object v12, v5, Li2/b;->g:LZ1/d;

    .line 109
    .line 110
    iget-object v10, v5, Li2/b;->e:LZ1/d;

    .line 111
    .line 112
    const/4 v13, 0x0

    .line 113
    move v3, v1

    .line 114
    move v1, v2

    .line 115
    const/4 v2, 0x0

    .line 116
    move v6, v3

    .line 117
    const/4 v3, 0x0

    .line 118
    move v7, v6

    .line 119
    iget-object v6, v5, Li2/b;->h:Lo2/e;

    .line 120
    .line 121
    iget-object v9, v5, Li2/b;->d:LZ1/g;

    .line 122
    .line 123
    iget-object v11, v5, Li2/b;->f:Lae/d;

    .line 124
    .line 125
    move/from16 v16, v7

    .line 126
    .line 127
    move-wide/from16 v7, p5

    .line 128
    .line 129
    invoke-direct/range {v0 .. v13}, Ll2/h;-><init>(I[I[LN1/n;Ll2/i;Lk2/e0;Lo2/e;JLZ1/g;LZ1/d;Lae/d;LZ1/d;Z)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    aput-object v0, p3, v16

    .line 136
    .line 137
    const/4 v0, 0x1

    .line 138
    aput-boolean v0, p4, v16

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_4
    move/from16 v16, v0

    .line 142
    .line 143
    :goto_3
    add-int/lit8 v0, v16, 0x1

    .line 144
    .line 145
    goto/16 :goto_0

    .line 146
    .line 147
    :cond_5
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    new-array v0, v0, [Ll2/h;

    .line 152
    .line 153
    iput-object v0, v5, Li2/b;->m:[Ll2/h;

    .line 154
    .line 155
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    new-instance v0, Lcom/applovin/impl/Z0;

    .line 159
    .line 160
    const/16 v1, 0x1a

    .line 161
    .line 162
    invoke-direct {v0, v1}, Lcom/applovin/impl/Z0;-><init>(I)V

    .line 163
    .line 164
    .line 165
    invoke-static {v15, v0}, Ll8/s;->v(Ljava/util/List;Lk8/h;)Ljava/util/AbstractList;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iget-object v1, v5, Li2/b;->j:La9/b;

    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    new-instance v1, Lk2/n;

    .line 175
    .line 176
    invoke-direct {v1, v15, v0}, Lk2/n;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 177
    .line 178
    .line 179
    iput-object v1, v5, Li2/b;->n:Lk2/n;

    .line 180
    .line 181
    return-wide p5
.end method
