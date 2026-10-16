.class public final La2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La2/d;

.field public final b:LS1/h;

.field public final c:LS1/h;

.field public final d:La2/v;

.field public final e:[Landroid/net/Uri;

.field public final f:[LN1/n;

.field public final g:Lb2/c;

.field public final h:LN1/O;

.field public final i:Ljava/util/List;

.field public final j:LY9/c;

.field public final k:LV1/k;

.field public l:Z

.field public m:[B

.field public n:Lk2/b;

.field public o:Landroid/net/Uri;

.field public p:Z

.field public q:Ln2/q;

.field public r:J

.field public s:Z


# direct methods
.method public constructor <init>(La2/d;Lb2/c;[Landroid/net/Uri;[LN1/n;La2/c;LS1/A;La2/v;Ljava/util/List;LV1/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La2/j;->a:La2/d;

    .line 5
    .line 6
    iput-object p2, p0, La2/j;->g:Lb2/c;

    .line 7
    .line 8
    iput-object p3, p0, La2/j;->e:[Landroid/net/Uri;

    .line 9
    .line 10
    iput-object p4, p0, La2/j;->f:[LN1/n;

    .line 11
    .line 12
    iput-object p7, p0, La2/j;->d:La2/v;

    .line 13
    .line 14
    iput-object p8, p0, La2/j;->i:Ljava/util/List;

    .line 15
    .line 16
    iput-object p9, p0, La2/j;->k:LV1/k;

    .line 17
    .line 18
    new-instance p1, LY9/c;

    .line 19
    .line 20
    const/16 p2, 0x1d

    .line 21
    .line 22
    invoke-direct {p1, p2}, LY9/c;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La2/j;->j:LY9/c;

    .line 26
    .line 27
    sget-object p1, LQ1/x;->f:[B

    .line 28
    .line 29
    iput-object p1, p0, La2/j;->m:[B

    .line 30
    .line 31
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    iput-wide p1, p0, La2/j;->r:J

    .line 37
    .line 38
    iget-object p1, p5, La2/c;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, LS1/g;

    .line 41
    .line 42
    invoke-interface {p1}, LS1/g;->b()LS1/h;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, La2/j;->b:LS1/h;

    .line 47
    .line 48
    if-eqz p6, :cond_0

    .line 49
    .line 50
    invoke-interface {p1, p6}, LS1/h;->C(LS1/A;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    iget-object p1, p5, La2/c;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, LS1/g;

    .line 56
    .line 57
    invoke-interface {p1}, LS1/g;->b()LS1/h;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, p0, La2/j;->c:LS1/h;

    .line 62
    .line 63
    new-instance p1, LN1/O;

    .line 64
    .line 65
    const-string p2, ""

    .line 66
    .line 67
    invoke-direct {p1, p2, p4}, LN1/O;-><init>(Ljava/lang/String;[LN1/n;)V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, La2/j;->h:LN1/O;

    .line 71
    .line 72
    new-instance p1, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    const/4 p2, 0x0

    .line 78
    move p5, p2

    .line 79
    :goto_0
    array-length p6, p3

    .line 80
    if-ge p5, p6, :cond_2

    .line 81
    .line 82
    aget-object p6, p4, p5

    .line 83
    .line 84
    iget p6, p6, LN1/n;->f:I

    .line 85
    .line 86
    and-int/lit16 p6, p6, 0x4000

    .line 87
    .line 88
    if-nez p6, :cond_1

    .line 89
    .line 90
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object p6

    .line 94
    invoke-virtual {p1, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    :cond_1
    add-int/lit8 p5, p5, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    new-instance p3, La2/h;

    .line 101
    .line 102
    iget-object p4, p0, La2/j;->h:LN1/O;

    .line 103
    .line 104
    invoke-static {p1}, LS3/f;->K(Ljava/util/Collection;)[I

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-direct {p3, p4, p1}, Ln2/c;-><init>(LN1/O;[I)V

    .line 109
    .line 110
    .line 111
    aget p1, p1, p2

    .line 112
    .line 113
    iget-object p2, p4, LN1/O;->d:[LN1/n;

    .line 114
    .line 115
    aget-object p1, p2, p1

    .line 116
    .line 117
    invoke-virtual {p3, p1}, Ln2/c;->q(LN1/n;)I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    iput p1, p3, La2/h;->g:I

    .line 122
    .line 123
    iput-object p3, p0, La2/j;->q:Ln2/q;

    .line 124
    .line 125
    return-void
.end method


# virtual methods
.method public final a(La2/l;J)[Ll2/m;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v8, 0x1

    .line 6
    const/4 v9, -0x1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    move v10, v9

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v2, v0, La2/j;->h:LN1/O;

    .line 12
    .line 13
    iget-object v3, v1, Ll2/e;->d:LN1/n;

    .line 14
    .line 15
    invoke-virtual {v2, v3}, LN1/O;->a(LN1/n;)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    move v10, v2

    .line 20
    :goto_0
    iget-object v2, v0, La2/j;->q:Ln2/q;

    .line 21
    .line 22
    invoke-interface {v2}, Ln2/q;->length()I

    .line 23
    .line 24
    .line 25
    move-result v11

    .line 26
    new-array v12, v11, [Ll2/m;

    .line 27
    .line 28
    const/4 v13, 0x0

    .line 29
    move v14, v13

    .line 30
    :goto_1
    if-ge v14, v11, :cond_b

    .line 31
    .line 32
    iget-object v2, v0, La2/j;->q:Ln2/q;

    .line 33
    .line 34
    invoke-interface {v2, v14}, Ln2/q;->c(I)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    iget-object v3, v0, La2/j;->e:[Landroid/net/Uri;

    .line 39
    .line 40
    aget-object v3, v3, v2

    .line 41
    .line 42
    iget-object v4, v0, La2/j;->g:Lb2/c;

    .line 43
    .line 44
    invoke-virtual {v4, v3}, Lb2/c;->c(Landroid/net/Uri;)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-nez v5, :cond_1

    .line 49
    .line 50
    sget-object v2, Ll2/m;->b9:Landroidx/fragment/app/X;

    .line 51
    .line 52
    aput-object v2, v12, v14

    .line 53
    .line 54
    move v15, v14

    .line 55
    goto/16 :goto_7

    .line 56
    .line 57
    :cond_1
    invoke-virtual {v4, v13, v3}, Lb2/c;->a(ZLandroid/net/Uri;)Lb2/i;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-wide v4, v4, Lb2/c;->n:J

    .line 65
    .line 66
    iget-wide v6, v3, Lb2/i;->h:J

    .line 67
    .line 68
    sub-long v4, v6, v4

    .line 69
    .line 70
    if-eq v2, v10, :cond_2

    .line 71
    .line 72
    move v2, v8

    .line 73
    :goto_2
    move-wide/from16 v6, p2

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_2
    move v2, v13

    .line 77
    goto :goto_2

    .line 78
    :goto_3
    invoke-virtual/range {v0 .. v7}, La2/j;->c(La2/l;ZLb2/i;JJ)Landroid/util/Pair;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    iget-object v0, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Ljava/lang/Long;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 87
    .line 88
    .line 89
    move-result-wide v0

    .line 90
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v2, Ljava/lang/Integer;

    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    new-instance v6, La2/g;

    .line 99
    .line 100
    move v15, v14

    .line 101
    iget-wide v13, v3, Lb2/i;->k:J

    .line 102
    .line 103
    sub-long/2addr v0, v13

    .line 104
    long-to-int v0, v0

    .line 105
    if-ltz v0, :cond_a

    .line 106
    .line 107
    iget-object v1, v3, Lb2/i;->r:Ll8/K;

    .line 108
    .line 109
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 110
    .line 111
    .line 112
    move-result v13

    .line 113
    if-ge v13, v0, :cond_3

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_3
    new-instance v13, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 122
    .line 123
    .line 124
    move-result v14

    .line 125
    if-ge v0, v14, :cond_7

    .line 126
    .line 127
    if-eq v2, v9, :cond_6

    .line 128
    .line 129
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v14

    .line 133
    check-cast v14, Lb2/f;

    .line 134
    .line 135
    if-nez v2, :cond_4

    .line 136
    .line 137
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_4
    iget-object v7, v14, Lb2/f;->m:Ll8/K;

    .line 142
    .line 143
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    if-ge v2, v7, :cond_5

    .line 148
    .line 149
    iget-object v7, v14, Lb2/f;->m:Ll8/K;

    .line 150
    .line 151
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 152
    .line 153
    .line 154
    move-result v14

    .line 155
    invoke-interface {v7, v2, v14}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 160
    .line 161
    .line 162
    :cond_5
    :goto_4
    add-int/2addr v0, v8

    .line 163
    :cond_6
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    invoke-interface {v1, v0, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 172
    .line 173
    .line 174
    const/4 v2, 0x0

    .line 175
    :cond_7
    iget-wide v0, v3, Lb2/i;->n:J

    .line 176
    .line 177
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    cmp-long v0, v0, v16

    .line 183
    .line 184
    if-eqz v0, :cond_9

    .line 185
    .line 186
    if-ne v2, v9, :cond_8

    .line 187
    .line 188
    const/4 v2, 0x0

    .line 189
    :cond_8
    iget-object v0, v3, Lb2/i;->s:Ll8/K;

    .line 190
    .line 191
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-ge v2, v1, :cond_9

    .line 196
    .line 197
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    invoke-interface {v0, v2, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 206
    .line 207
    .line 208
    :cond_9
    invoke-static {v13}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    goto :goto_6

    .line 213
    :cond_a
    :goto_5
    sget-object v0, Ll8/K;->b:Ll8/I;

    .line 214
    .line 215
    sget-object v0, Ll8/e0;->e:Ll8/e0;

    .line 216
    .line 217
    :goto_6
    invoke-direct {v6, v4, v5, v0}, La2/g;-><init>(JLjava/util/List;)V

    .line 218
    .line 219
    .line 220
    aput-object v6, v12, v15

    .line 221
    .line 222
    :goto_7
    add-int/lit8 v14, v15, 0x1

    .line 223
    .line 224
    move-object/from16 v0, p0

    .line 225
    .line 226
    move-object/from16 v1, p1

    .line 227
    .line 228
    const/4 v13, 0x0

    .line 229
    goto/16 :goto_1

    .line 230
    .line 231
    :cond_b
    return-object v12
.end method

.method public final b(La2/l;)I
    .locals 7

    .line 1
    iget v0, p1, La2/l;->o:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object v0, p0, La2/j;->h:LN1/O;

    .line 8
    .line 9
    iget-object v1, p1, Ll2/e;->d:LN1/n;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, LN1/O;->a(LN1/n;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, La2/j;->e:[Landroid/net/Uri;

    .line 16
    .line 17
    aget-object v0, v1, v0

    .line 18
    .line 19
    iget-object v1, p0, La2/j;->g:Lb2/c;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-virtual {v1, v2, v0}, Lb2/c;->a(ZLandroid/net/Uri;)Lb2/i;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-wide v3, p1, Ll2/l;->j:J

    .line 30
    .line 31
    iget-wide v5, v0, Lb2/i;->k:J

    .line 32
    .line 33
    sub-long/2addr v3, v5

    .line 34
    long-to-int v1, v3

    .line 35
    if-gez v1, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    iget-object v3, v0, Lb2/i;->r:Ll8/K;

    .line 39
    .line 40
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-ge v1, v4, :cond_2

    .line 45
    .line 46
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lb2/f;

    .line 51
    .line 52
    iget-object v1, v1, Lb2/f;->m:Ll8/K;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    iget-object v1, v0, Lb2/i;->s:Ll8/K;

    .line 56
    .line 57
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    iget v4, p1, La2/l;->o:I

    .line 62
    .line 63
    if-lt v4, v3, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Lb2/d;

    .line 71
    .line 72
    iget-boolean v3, v1, Lb2/d;->m:Z

    .line 73
    .line 74
    if-eqz v3, :cond_4

    .line 75
    .line 76
    return v2

    .line 77
    :cond_4
    iget-object v0, v0, Lb2/m;->a:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v1, v1, Lb2/g;->a:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v0, v1}, LQ1/k;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget-object p1, p1, Ll2/e;->b:LS1/k;

    .line 90
    .line 91
    iget-object p1, p1, LS1/k;->a:Landroid/net/Uri;

    .line 92
    .line 93
    invoke-static {v0, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_5

    .line 98
    .line 99
    :goto_1
    const/4 p1, 0x1

    .line 100
    return p1

    .line 101
    :cond_5
    :goto_2
    const/4 p1, 0x2

    .line 102
    return p1
.end method

.method public final c(La2/l;ZLb2/i;JJ)Landroid/util/Pair;
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, -0x1

    .line 3
    if-eqz p1, :cond_4

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-boolean p2, p1, La2/l;->H:Z

    .line 9
    .line 10
    iget-wide p3, p1, Ll2/l;->j:J

    .line 11
    .line 12
    iget p5, p1, La2/l;->o:I

    .line 13
    .line 14
    if-eqz p2, :cond_3

    .line 15
    .line 16
    new-instance p2, Landroid/util/Pair;

    .line 17
    .line 18
    if-ne p5, v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Ll2/l;->a()J

    .line 21
    .line 22
    .line 23
    move-result-wide p3

    .line 24
    :cond_1
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-ne p5, v1, :cond_2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    add-int/lit8 v1, p5, 0x1

    .line 32
    .line 33
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    invoke-direct {p2, p1, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-object p2

    .line 41
    :cond_3
    new-instance p1, Landroid/util/Pair;

    .line 42
    .line 43
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_4
    :goto_1
    iget-wide v2, p3, Lb2/i;->u:J

    .line 56
    .line 57
    add-long/2addr v2, p4

    .line 58
    if-eqz p1, :cond_6

    .line 59
    .line 60
    iget-boolean p2, p0, La2/j;->p:Z

    .line 61
    .line 62
    if-eqz p2, :cond_5

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_5
    iget-wide p6, p1, Ll2/e;->g:J

    .line 66
    .line 67
    :cond_6
    :goto_2
    iget-boolean p2, p3, Lb2/i;->o:Z

    .line 68
    .line 69
    iget-wide v4, p3, Lb2/i;->k:J

    .line 70
    .line 71
    iget-object v6, p3, Lb2/i;->r:Ll8/K;

    .line 72
    .line 73
    if-nez p2, :cond_7

    .line 74
    .line 75
    cmp-long p2, p6, v2

    .line 76
    .line 77
    if-ltz p2, :cond_7

    .line 78
    .line 79
    new-instance p1, Landroid/util/Pair;

    .line 80
    .line 81
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    int-to-long p2, p2

    .line 86
    add-long/2addr v4, p2

    .line 87
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object p3

    .line 95
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-object p1

    .line 99
    :cond_7
    sub-long/2addr p6, p4

    .line 100
    invoke-static {p6, p7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    iget-object p4, p0, La2/j;->g:Lb2/c;

    .line 105
    .line 106
    iget-boolean p4, p4, Lb2/c;->m:Z

    .line 107
    .line 108
    const/4 p5, 0x0

    .line 109
    if-eqz p4, :cond_9

    .line 110
    .line 111
    if-nez p1, :cond_8

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_8
    move v0, p5

    .line 115
    :cond_9
    :goto_3
    invoke-static {v6, p2, v0}, LQ1/x;->c(Ll8/K;Ljava/lang/Long;Z)I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    int-to-long v2, p1

    .line 120
    add-long/2addr v2, v4

    .line 121
    if-ltz p1, :cond_d

    .line 122
    .line 123
    invoke-interface {v6, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    check-cast p1, Lb2/f;

    .line 128
    .line 129
    iget-wide v4, p1, Lb2/g;->e:J

    .line 130
    .line 131
    iget-wide v6, p1, Lb2/g;->c:J

    .line 132
    .line 133
    add-long/2addr v4, v6

    .line 134
    cmp-long p2, p6, v4

    .line 135
    .line 136
    iget-object p3, p3, Lb2/i;->s:Ll8/K;

    .line 137
    .line 138
    if-gez p2, :cond_a

    .line 139
    .line 140
    iget-object p1, p1, Lb2/f;->m:Ll8/K;

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_a
    move-object p1, p3

    .line 144
    :goto_4
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 145
    .line 146
    .line 147
    move-result p2

    .line 148
    if-ge p5, p2, :cond_d

    .line 149
    .line 150
    invoke-interface {p1, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    check-cast p2, Lb2/d;

    .line 155
    .line 156
    iget-wide v4, p2, Lb2/g;->e:J

    .line 157
    .line 158
    iget-wide v6, p2, Lb2/g;->c:J

    .line 159
    .line 160
    add-long/2addr v4, v6

    .line 161
    cmp-long p4, p6, v4

    .line 162
    .line 163
    if-gez p4, :cond_c

    .line 164
    .line 165
    iget-boolean p2, p2, Lb2/d;->l:Z

    .line 166
    .line 167
    if-eqz p2, :cond_d

    .line 168
    .line 169
    if-ne p1, p3, :cond_b

    .line 170
    .line 171
    const-wide/16 p1, 0x1

    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_b
    const-wide/16 p1, 0x0

    .line 175
    .line 176
    :goto_5
    add-long/2addr v2, p1

    .line 177
    move v1, p5

    .line 178
    goto :goto_6

    .line 179
    :cond_c
    add-int/lit8 p5, p5, 0x1

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_d
    :goto_6
    new-instance p1, Landroid/util/Pair;

    .line 183
    .line 184
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object p3

    .line 192
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    return-object p1
.end method

.method public final d(Landroid/net/Uri;IZ)La2/f;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    iget-object v3, v0, La2/j;->j:LY9/c;

    .line 10
    .line 11
    iget-object v4, v3, LY9/c;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, La2/e;

    .line 14
    .line 15
    invoke-virtual {v4, v2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    check-cast v4, [B

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    iget-object v3, v3, LY9/c;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, La2/e;

    .line 26
    .line 27
    invoke-virtual {v3, v2, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, [B

    .line 32
    .line 33
    return-object v1

    .line 34
    :cond_1
    sget-object v5, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 35
    .line 36
    new-instance v1, LS1/k;

    .line 37
    .line 38
    const/4 v10, 0x0

    .line 39
    const/4 v11, 0x1

    .line 40
    const/4 v3, 0x1

    .line 41
    const/4 v4, 0x0

    .line 42
    const-wide/16 v6, 0x0

    .line 43
    .line 44
    const-wide/16 v8, -0x1

    .line 45
    .line 46
    invoke-direct/range {v1 .. v11}, LS1/k;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    new-instance v6, La2/f;

    .line 50
    .line 51
    iget-object v2, v0, La2/j;->f:[LN1/n;

    .line 52
    .line 53
    aget-object v10, v2, p2

    .line 54
    .line 55
    iget-object v2, v0, La2/j;->q:Ln2/q;

    .line 56
    .line 57
    invoke-interface {v2}, Ln2/q;->u()I

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    iget-object v2, v0, La2/j;->q:Ln2/q;

    .line 62
    .line 63
    invoke-interface {v2}, Ln2/q;->p()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v12

    .line 67
    iget-object v2, v0, La2/j;->m:[B

    .line 68
    .line 69
    iget-object v7, v0, La2/j;->c:LS1/h;

    .line 70
    .line 71
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    const/4 v9, 0x3

    .line 77
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    move-object v8, v1

    .line 83
    invoke-direct/range {v6 .. v16}, Ll2/e;-><init>(LS1/h;LS1/k;ILN1/n;ILjava/lang/Object;JJ)V

    .line 84
    .line 85
    .line 86
    if-nez v2, :cond_2

    .line 87
    .line 88
    sget-object v2, LQ1/x;->f:[B

    .line 89
    .line 90
    :cond_2
    iput-object v2, v6, La2/f;->j:[B

    .line 91
    .line 92
    return-object v6
.end method
