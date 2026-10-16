.class public final Lr9/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo9/a;


# static fields
.field public static final n:J


# instance fields
.field public final a:Lp7/b;

.field public b:Lr9/f;

.field public c:Lr9/v;

.field public d:Lr9/b;

.field public final e:Lr9/A;

.field public f:LVa/Za;

.field public final g:LK8/f;

.field public final h:LY2/B;

.field public final i:Lr9/Q;

.field public final j:Lr9/a;

.field public final k:Landroid/util/SparseArray;

.field public final l:Ljava/util/HashMap;

.field public final m:LR1/i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    const-wide/16 v1, 0x5

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    sput-wide v0, Lr9/l;->n:J

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lp7/b;LK8/f;Ln9/e;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lp7/b;->J()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    new-array v2, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    const-string v3, "LocalStore was passed an unstarted persistence implementation"

    .line 12
    .line 13
    invoke-static {v0, v3, v2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lr9/l;->a:Lp7/b;

    .line 17
    .line 18
    iput-object p2, p0, Lr9/l;->g:LK8/f;

    .line 19
    .line 20
    invoke-virtual {p1}, Lp7/b;->G()Lr9/Q;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iput-object p2, p0, Lr9/l;->i:Lr9/Q;

    .line 25
    .line 26
    invoke-virtual {p1}, Lp7/b;->u()Lr9/a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lr9/l;->j:Lr9/a;

    .line 31
    .line 32
    invoke-interface {p2}, Lr9/Q;->g()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    new-instance v0, LR1/i;

    .line 37
    .line 38
    invoke-direct {v0, v1, p2}, LR1/i;-><init>(II)V

    .line 39
    .line 40
    .line 41
    iget p2, v0, LR1/i;->b:I

    .line 42
    .line 43
    add-int/lit8 p2, p2, 0x2

    .line 44
    .line 45
    iput p2, v0, LR1/i;->b:I

    .line 46
    .line 47
    iput-object v0, p0, Lr9/l;->m:LR1/i;

    .line 48
    .line 49
    invoke-virtual {p1}, Lp7/b;->E()Lr9/A;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    iput-object p2, p0, Lr9/l;->e:Lr9/A;

    .line 54
    .line 55
    new-instance p2, LY2/B;

    .line 56
    .line 57
    const/16 v0, 0x18

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    invoke-direct {p2, v1, v0}, LY2/B;-><init>(BI)V

    .line 61
    .line 62
    .line 63
    iput-object p2, p0, Lr9/l;->h:LY2/B;

    .line 64
    .line 65
    new-instance v0, Landroid/util/SparseArray;

    .line 66
    .line 67
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, Lr9/l;->k:Landroid/util/SparseArray;

    .line 71
    .line 72
    new-instance v0, Ljava/util/HashMap;

    .line 73
    .line 74
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, Lr9/l;->l:Ljava/util/HashMap;

    .line 78
    .line 79
    invoke-virtual {p1}, Lp7/b;->D()Lr9/z;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-interface {p1, p2}, Lr9/z;->k(LY2/B;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p3}, Lr9/l;->c(Ln9/e;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public static e(Lr9/S;Lr9/S;Lv9/t;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lr9/S;->g:Lcom/google/protobuf/ByteString;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p1, Lr9/S;->e:Ls9/o;

    .line 11
    .line 12
    iget-object v0, v0, Ls9/o;->a:Ls8/q;

    .line 13
    .line 14
    iget-object v1, p0, Lr9/S;->e:Ls9/o;

    .line 15
    .line 16
    iget-object v1, v1, Ls9/o;->a:Ls8/q;

    .line 17
    .line 18
    iget-wide v2, v0, Ls8/q;->a:J

    .line 19
    .line 20
    iget-wide v0, v1, Ls8/q;->a:J

    .line 21
    .line 22
    sub-long/2addr v2, v0

    .line 23
    sget-wide v0, Lr9/l;->n:J

    .line 24
    .line 25
    cmp-long v2, v2, v0

    .line 26
    .line 27
    if-ltz v2, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object p1, p1, Lr9/S;->f:Ls9/o;

    .line 31
    .line 32
    iget-object p1, p1, Ls9/o;->a:Ls8/q;

    .line 33
    .line 34
    iget-object p0, p0, Lr9/S;->f:Ls9/o;

    .line 35
    .line 36
    iget-object p0, p0, Ls9/o;->a:Ls8/q;

    .line 37
    .line 38
    iget-wide v2, p1, Ls8/q;->a:J

    .line 39
    .line 40
    iget-wide p0, p0, Ls8/q;->a:J

    .line 41
    .line 42
    sub-long/2addr v2, p0

    .line 43
    cmp-long p0, v2, v0

    .line 44
    .line 45
    if-ltz p0, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    if-nez p2, :cond_3

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    iget-object p0, p2, Lv9/t;->c:Lc9/d;

    .line 52
    .line 53
    iget-object p0, p0, Lc9/d;->a:Lc9/c;

    .line 54
    .line 55
    invoke-virtual {p0}, Lc9/c;->size()I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    iget-object p1, p2, Lv9/t;->d:Lc9/d;

    .line 60
    .line 61
    iget-object p1, p1, Lc9/d;->a:Lc9/c;

    .line 62
    .line 63
    invoke-virtual {p1}, Lc9/c;->size()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    add-int/2addr p1, p0

    .line 68
    iget-object p0, p2, Lv9/t;->e:Lc9/d;

    .line 69
    .line 70
    iget-object p0, p0, Lc9/d;->a:Lc9/c;

    .line 71
    .line 72
    invoke-virtual {p0}, Lc9/c;->size()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    add-int/2addr p0, p1

    .line 77
    if-lez p0, :cond_4

    .line 78
    .line 79
    :goto_0
    const/4 p0, 0x1

    .line 80
    return p0

    .line 81
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 82
    return p0
.end method


# virtual methods
.method public final a(Lp9/A;)Lr9/S;
    .locals 4

    .line 1
    iget-object v0, p0, Lr9/l;->i:Lr9/Q;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lr9/Q;->d(Lp9/A;)Lr9/S;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget v1, v0, Lr9/S;->b:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Lr9/p;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lr9/k;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v1, p0, v0, p1, v2}, Lr9/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, Lr9/l;->a:Lp7/b;

    .line 24
    .line 25
    const-string v3, "Allocate target"

    .line 26
    .line 27
    invoke-virtual {v2, v3, v1}, Lp7/b;->P(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    iget v1, v0, Lr9/p;->a:I

    .line 31
    .line 32
    iget-object v0, v0, Lr9/p;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lr9/S;

    .line 35
    .line 36
    :goto_0
    iget-object v2, p0, Lr9/l;->k:Landroid/util/SparseArray;

    .line 37
    .line 38
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    if-nez v3, :cond_1

    .line 43
    .line 44
    invoke-virtual {v2, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v2, p0, Lr9/l;->l:Ljava/util/HashMap;

    .line 48
    .line 49
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    :cond_1
    return-object v0
.end method

.method public final b(Lp9/u;Z)Lba/a;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    invoke-virtual {v1}, Lp9/u;->i()Lp9/A;

    .line 9
    .line 10
    .line 11
    move-result-object v5

    .line 12
    iget-object v6, v0, Lr9/l;->l:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v6

    .line 18
    check-cast v6, Ljava/lang/Integer;

    .line 19
    .line 20
    iget-object v7, v0, Lr9/l;->i:Lr9/Q;

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    iget-object v5, v0, Lr9/l;->k:Landroid/util/SparseArray;

    .line 25
    .line 26
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    invoke-virtual {v5, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, Lr9/S;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-interface {v7, v5}, Lr9/Q;->d(Lp9/A;)Lr9/S;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    :goto_0
    sget-object v6, Ls9/o;->b:Ls9/o;

    .line 42
    .line 43
    sget-object v8, Ls9/h;->c:Lc9/d;

    .line 44
    .line 45
    if-eqz v5, :cond_1

    .line 46
    .line 47
    iget v8, v5, Lr9/S;->b:I

    .line 48
    .line 49
    invoke-interface {v7, v8}, Lr9/Q;->h(I)Lc9/d;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    iget-object v5, v5, Lr9/S;->f:Ls9/o;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move-object v5, v6

    .line 57
    :goto_1
    if-eqz p2, :cond_2

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    move-object v5, v6

    .line 61
    :goto_2
    iget-object v7, v0, Lr9/l;->g:LK8/f;

    .line 62
    .line 63
    iget-boolean v9, v7, LK8/f;->a:Z

    .line 64
    .line 65
    new-array v10, v4, [Ljava/lang/Object;

    .line 66
    .line 67
    const-string v11, "initialize() not called"

    .line 68
    .line 69
    invoke-static {v9, v11, v10}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7, v1}, LK8/f;->e(Lp9/u;)Lc9/c;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    if-eqz v9, :cond_3

    .line 77
    .line 78
    goto/16 :goto_6

    .line 79
    .line 80
    :cond_3
    invoke-virtual {v1}, Lp9/u;->h()Z

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    const-string v10, "QueryEngine"

    .line 85
    .line 86
    const/4 v11, 0x0

    .line 87
    if-eqz v9, :cond_4

    .line 88
    .line 89
    :goto_3
    move-object v9, v11

    .line 90
    goto :goto_5

    .line 91
    :cond_4
    invoke-virtual {v5, v6}, Ls9/o;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_5

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    iget-object v6, v7, LK8/f;->c:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v6, LVa/Za;

    .line 101
    .line 102
    invoke-virtual {v6, v8}, LVa/Za;->e(Ljava/lang/Iterable;)Lc9/c;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-static {v1, v6}, LK8/f;->b(Lp9/u;Lc9/c;)Lc9/d;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    iget-object v9, v8, Lc9/d;->a:Lc9/c;

    .line 111
    .line 112
    invoke-virtual {v9}, Lc9/c;->size()I

    .line 113
    .line 114
    .line 115
    move-result v9

    .line 116
    invoke-static {v1, v9, v6, v5}, LK8/f;->d(Lp9/u;ILc9/d;Ls9/o;)Z

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    if-eqz v9, :cond_6

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_6
    invoke-static {}, LBa/c;->E()Z

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    if-eqz v9, :cond_7

    .line 128
    .line 129
    invoke-virtual {v5}, Ls9/o;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    invoke-virtual {v1}, Lp9/u;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v11

    .line 137
    new-array v12, v2, [Ljava/lang/Object;

    .line 138
    .line 139
    aput-object v9, v12, v4

    .line 140
    .line 141
    aput-object v11, v12, v3

    .line 142
    .line 143
    const-string v9, "Re-using previous result from %s to execute query: %s"

    .line 144
    .line 145
    invoke-static {v10, v9, v3, v12}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_7
    sget-object v9, Ls9/b;->d:Ls9/b;

    .line 149
    .line 150
    iget-object v5, v5, Ls9/o;->a:Ls8/q;

    .line 151
    .line 152
    iget v9, v5, Ls8/q;->b:I

    .line 153
    .line 154
    add-int/2addr v9, v3

    .line 155
    new-instance v11, Ls9/o;

    .line 156
    .line 157
    int-to-double v12, v9

    .line 158
    const-wide v14, 0x41cdcd6500000000L    # 1.0E9

    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    cmpl-double v12, v12, v14

    .line 164
    .line 165
    iget-wide v13, v5, Ls8/q;->a:J

    .line 166
    .line 167
    if-nez v12, :cond_8

    .line 168
    .line 169
    new-instance v5, Ls8/q;

    .line 170
    .line 171
    const-wide/16 v15, 0x1

    .line 172
    .line 173
    add-long/2addr v13, v15

    .line 174
    invoke-direct {v5, v13, v14, v4}, Ls8/q;-><init>(JI)V

    .line 175
    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_8
    new-instance v5, Ls8/q;

    .line 179
    .line 180
    invoke-direct {v5, v13, v14, v9}, Ls8/q;-><init>(JI)V

    .line 181
    .line 182
    .line 183
    :goto_4
    invoke-direct {v11, v5}, Ls9/o;-><init>(Ls8/q;)V

    .line 184
    .line 185
    .line 186
    invoke-static {}, Ls9/h;->b()Ls9/h;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    new-instance v9, Ls9/b;

    .line 191
    .line 192
    const/4 v12, -0x1

    .line 193
    invoke-direct {v9, v11, v5, v12}, Ls9/b;-><init>(Ls9/o;Ls9/h;I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v7, v6, v1, v9}, LK8/f;->a(Lc9/d;Lp9/u;Ls9/b;)Lc9/c;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    move-object v9, v5

    .line 201
    :goto_5
    if-eqz v9, :cond_9

    .line 202
    .line 203
    goto/16 :goto_6

    .line 204
    .line 205
    :cond_9
    new-instance v5, LR1/i;

    .line 206
    .line 207
    const/16 v6, 0x8

    .line 208
    .line 209
    invoke-direct {v5, v6}, LR1/i;-><init>(I)V

    .line 210
    .line 211
    .line 212
    iput v4, v5, LR1/i;->b:I

    .line 213
    .line 214
    invoke-static {}, LBa/c;->E()Z

    .line 215
    .line 216
    .line 217
    move-result v6

    .line 218
    if-eqz v6, :cond_a

    .line 219
    .line 220
    invoke-virtual {v1}, Lp9/u;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    new-array v9, v3, [Ljava/lang/Object;

    .line 225
    .line 226
    aput-object v6, v9, v4

    .line 227
    .line 228
    const-string v6, "Using full collection scan to execute query: %s"

    .line 229
    .line 230
    invoke-static {v10, v6, v3, v9}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    :cond_a
    iget-object v6, v7, LK8/f;->c:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v6, LVa/Za;

    .line 236
    .line 237
    sget-object v9, Ls9/b;->d:Ls9/b;

    .line 238
    .line 239
    invoke-virtual {v6, v1, v9, v5}, LVa/Za;->g(Lp9/u;Ls9/b;LR1/i;)Lc9/c;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    if-eqz v9, :cond_c

    .line 244
    .line 245
    iget-boolean v6, v7, LK8/f;->b:Z

    .line 246
    .line 247
    if-eqz v6, :cond_c

    .line 248
    .line 249
    invoke-virtual {v9}, Lc9/c;->size()I

    .line 250
    .line 251
    .line 252
    move-result v6

    .line 253
    iget v11, v5, LR1/i;->b:I

    .line 254
    .line 255
    const/16 v12, 0x64

    .line 256
    .line 257
    if-ge v11, v12, :cond_b

    .line 258
    .line 259
    invoke-virtual {v1}, Lp9/u;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    new-array v2, v2, [Ljava/lang/Object;

    .line 268
    .line 269
    aput-object v1, v2, v4

    .line 270
    .line 271
    aput-object v5, v2, v3

    .line 272
    .line 273
    const-string v1, "SDK will not create cache indexes for query: %s, since it only creates cache indexes for collection contains more than or equal to %s documents."

    .line 274
    .line 275
    invoke-static {v10, v1, v3, v2}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    goto :goto_6

    .line 279
    :cond_b
    invoke-virtual {v1}, Lp9/u;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v11

    .line 283
    iget v12, v5, LR1/i;->b:I

    .line 284
    .line 285
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v12

    .line 289
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 290
    .line 291
    .line 292
    move-result-object v13

    .line 293
    const/4 v14, 0x3

    .line 294
    new-array v14, v14, [Ljava/lang/Object;

    .line 295
    .line 296
    aput-object v11, v14, v4

    .line 297
    .line 298
    aput-object v12, v14, v3

    .line 299
    .line 300
    aput-object v13, v14, v2

    .line 301
    .line 302
    const-string v2, "Query: %s, scans %s local documents and returns %s documents as results."

    .line 303
    .line 304
    invoke-static {v10, v2, v3, v14}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    iget v2, v5, LR1/i;->b:I

    .line 308
    .line 309
    int-to-double v11, v2

    .line 310
    const-wide/high16 v13, 0x4000000000000000L    # 2.0

    .line 311
    .line 312
    int-to-double v5, v6

    .line 313
    mul-double/2addr v13, v5

    .line 314
    cmpl-double v2, v11, v13

    .line 315
    .line 316
    if-lez v2, :cond_c

    .line 317
    .line 318
    iget-object v2, v7, LK8/f;->d:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v2, Lr9/f;

    .line 321
    .line 322
    invoke-virtual {v1}, Lp9/u;->i()Lp9/A;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    invoke-interface {v2, v5}, Lr9/f;->y(Lp9/A;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v1}, Lp9/u;->toString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    new-array v2, v3, [Ljava/lang/Object;

    .line 334
    .line 335
    aput-object v1, v2, v4

    .line 336
    .line 337
    const-string v1, "The SDK decides to create cache indexes for query: %s, as using cache indexes may help improve performance."

    .line 338
    .line 339
    invoke-static {v10, v1, v3, v2}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    :cond_c
    :goto_6
    new-instance v1, Lba/a;

    .line 343
    .line 344
    const/16 v2, 0x15

    .line 345
    .line 346
    invoke-direct {v1, v9, v4, v8, v2}, Lba/a;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 347
    .line 348
    .line 349
    return-object v1
.end method

.method public final c(Ln9/e;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lr9/l;->a:Lp7/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lp7/b;->y(Ln9/e;)Lr9/f;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iput-object v1, p0, Lr9/l;->b:Lr9/f;

    .line 8
    .line 9
    invoke-virtual {v0, p1, v1}, Lp7/b;->z(Ln9/e;Lr9/f;)Lr9/v;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, Lr9/l;->c:Lr9/v;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lp7/b;->x(Ln9/e;)Lr9/b;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lr9/l;->d:Lr9/b;

    .line 20
    .line 21
    new-instance v0, LVa/Za;

    .line 22
    .line 23
    iget-object v1, p0, Lr9/l;->c:Lr9/v;

    .line 24
    .line 25
    iget-object v2, p0, Lr9/l;->b:Lr9/f;

    .line 26
    .line 27
    iget-object v3, p0, Lr9/l;->e:Lr9/A;

    .line 28
    .line 29
    invoke-direct {v0, v3, v1, p1, v2}, LVa/Za;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lr9/l;->f:LVa/Za;

    .line 33
    .line 34
    invoke-interface {v3, v2}, Lr9/A;->K(Lr9/f;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lr9/l;->f:LVa/Za;

    .line 38
    .line 39
    iget-object v0, p0, Lr9/l;->b:Lr9/f;

    .line 40
    .line 41
    iget-object v1, p0, Lr9/l;->g:LK8/f;

    .line 42
    .line 43
    iput-object p1, v1, LK8/f;->c:Ljava/lang/Object;

    .line 44
    .line 45
    iput-object v0, v1, LK8/f;->d:Ljava/lang/Object;

    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    iput-boolean p1, v1, LK8/f;->a:Z

    .line 49
    .line 50
    return-void
.end method

.method public final d(Ljava/util/Map;)Lba/a;
    .locals 13

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    new-instance v3, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v4, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v5, Ljava/util/HashSet;

    .line 15
    .line 16
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    iget-object v7, p0, Lr9/l;->e:Lr9/A;

    .line 24
    .line 25
    invoke-interface {v7, v6}, Lr9/A;->y(Ljava/lang/Iterable;)Ljava/util/HashMap;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    if-eqz v8, :cond_4

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    check-cast v8, Ljava/util/Map$Entry;

    .line 48
    .line 49
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    check-cast v9, Ls9/h;

    .line 54
    .line 55
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    check-cast v8, Ls9/k;

    .line 60
    .line 61
    invoke-virtual {v6, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    check-cast v10, Ls9/k;

    .line 66
    .line 67
    invoke-virtual {v8}, Ls9/k;->d()Z

    .line 68
    .line 69
    .line 70
    move-result v11

    .line 71
    invoke-virtual {v10}, Ls9/k;->d()Z

    .line 72
    .line 73
    .line 74
    move-result v12

    .line 75
    if-eq v11, v12, :cond_0

    .line 76
    .line 77
    invoke-virtual {v5, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    :cond_0
    invoke-virtual {v8}, Ls9/k;->e()Z

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    if-eqz v11, :cond_1

    .line 85
    .line 86
    iget-object v11, v8, Ls9/k;->c:Ls9/o;

    .line 87
    .line 88
    sget-object v12, Ls9/o;->b:Ls9/o;

    .line 89
    .line 90
    invoke-virtual {v11, v12}, Ls9/o;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v11

    .line 94
    if-eqz v11, :cond_1

    .line 95
    .line 96
    iget-object v10, v8, Ls9/k;->a:Ls9/h;

    .line 97
    .line 98
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_1
    iget v11, v10, Ls9/k;->b:I

    .line 106
    .line 107
    invoke-static {v11, v1}, LA/f;->b(II)Z

    .line 108
    .line 109
    .line 110
    move-result v11

    .line 111
    if-nez v11, :cond_3

    .line 112
    .line 113
    iget-object v11, v8, Ls9/k;->c:Ls9/o;

    .line 114
    .line 115
    iget-object v12, v10, Ls9/k;->c:Ls9/o;

    .line 116
    .line 117
    invoke-virtual {v11, v12}, Ls9/o;->a(Ls9/o;)I

    .line 118
    .line 119
    .line 120
    move-result v11

    .line 121
    if-gtz v11, :cond_3

    .line 122
    .line 123
    iget-object v11, v8, Ls9/k;->c:Ls9/o;

    .line 124
    .line 125
    iget-object v12, v10, Ls9/k;->c:Ls9/o;

    .line 126
    .line 127
    invoke-virtual {v11, v12}, Ls9/o;->a(Ls9/o;)I

    .line 128
    .line 129
    .line 130
    move-result v11

    .line 131
    if-nez v11, :cond_2

    .line 132
    .line 133
    invoke-virtual {v10}, Ls9/k;->c()Z

    .line 134
    .line 135
    .line 136
    move-result v11

    .line 137
    if-nez v11, :cond_3

    .line 138
    .line 139
    iget v11, v10, Ls9/k;->f:I

    .line 140
    .line 141
    invoke-static {v11, v0}, LA/f;->b(II)Z

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    if-eqz v11, :cond_2

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_2
    iget-object v10, v10, Ls9/k;->c:Ls9/o;

    .line 149
    .line 150
    iget-object v8, v8, Ls9/k;->c:Ls9/o;

    .line 151
    .line 152
    const/4 v11, 0x3

    .line 153
    new-array v11, v11, [Ljava/lang/Object;

    .line 154
    .line 155
    aput-object v9, v11, v2

    .line 156
    .line 157
    aput-object v10, v11, v1

    .line 158
    .line 159
    aput-object v8, v11, v0

    .line 160
    .line 161
    const-string v8, "LocalStore"

    .line 162
    .line 163
    const-string v9, "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s"

    .line 164
    .line 165
    invoke-static {v8, v9, v1, v11}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :cond_3
    :goto_1
    sget-object v10, Ls9/o;->b:Ls9/o;

    .line 171
    .line 172
    iget-object v11, v8, Ls9/k;->d:Ls9/o;

    .line 173
    .line 174
    invoke-virtual {v10, v11}, Ls9/o;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v10

    .line 178
    xor-int/2addr v10, v1

    .line 179
    new-array v11, v2, [Ljava/lang/Object;

    .line 180
    .line 181
    const-string v12, "Cannot add a document when the remote version is zero"

    .line 182
    .line 183
    invoke-static {v10, v12, v11}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    iget-object v10, v8, Ls9/k;->d:Ls9/o;

    .line 187
    .line 188
    invoke-interface {v7, v8, v10}, Lr9/A;->F(Ls9/k;Ls9/o;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    goto/16 :goto_0

    .line 195
    .line 196
    :cond_4
    invoke-interface {v7, v4}, Lr9/A;->z(Ljava/util/ArrayList;)V

    .line 197
    .line 198
    .line 199
    new-instance p1, Lba/a;

    .line 200
    .line 201
    const/16 v0, 0x14

    .line 202
    .line 203
    invoke-direct {p1, v3, v2, v5, v0}, Lba/a;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 204
    .line 205
    .line 206
    return-object p1
.end method
