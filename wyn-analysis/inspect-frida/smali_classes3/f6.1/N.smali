.class public final Lf6/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf6/w;
.implements LJ5/m;
.implements Lt6/B;


# static fields
.field public static final L:Ljava/util/Map;

.field public static final M:LE5/T;


# instance fields
.field public A:I

.field public B:Z

.field public C:Z

.field public D:I

.field public E:Z

.field public F:J

.field public G:J

.field public H:Z

.field public I:I

.field public J:Z

.field public K:Z

.field public final a:Landroid/net/Uri;

.field public final b:Lt6/l;

.field public final c:LI5/i;

.field public final d:Lae/d;

.field public final e:LI5/f;

.field public final f:LI5/f;

.field public final g:Lf6/Q;

.field public final h:Lo2/e;

.field public final i:J

.field public final j:Lt6/E;

.field public final k:Lb7/k;

.field public final l:Ls8/b;

.field public final m:Lf6/J;

.field public final n:Lf6/J;

.field public final o:Landroid/os/Handler;

.field public p:Lf6/v;

.field public q:La6/b;

.field public r:[Lf6/U;

.field public s:[Lf6/M;

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:LS3/n;

.field public x:LJ5/t;

.field public y:J

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Icy-MetaData"

    .line 7
    .line 8
    const-string v2, "1"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lf6/N;->L:Ljava/util/Map;

    .line 18
    .line 19
    new-instance v0, LE5/S;

    .line 20
    .line 21
    invoke-direct {v0}, LE5/S;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v1, "icy"

    .line 25
    .line 26
    iput-object v1, v0, LE5/S;->a:Ljava/lang/String;

    .line 27
    .line 28
    const-string v1, "application/x-icy"

    .line 29
    .line 30
    iput-object v1, v0, LE5/S;->k:Ljava/lang/String;

    .line 31
    .line 32
    new-instance v1, LE5/T;

    .line 33
    .line 34
    invoke-direct {v1, v0}, LE5/T;-><init>(LE5/S;)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Lf6/N;->M:LE5/T;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Lt6/l;Lb7/k;LI5/i;LI5/f;Lae/d;LI5/f;Lf6/Q;Lo2/e;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf6/N;->a:Landroid/net/Uri;

    .line 5
    .line 6
    iput-object p2, p0, Lf6/N;->b:Lt6/l;

    .line 7
    .line 8
    iput-object p4, p0, Lf6/N;->c:LI5/i;

    .line 9
    .line 10
    iput-object p5, p0, Lf6/N;->f:LI5/f;

    .line 11
    .line 12
    iput-object p6, p0, Lf6/N;->d:Lae/d;

    .line 13
    .line 14
    iput-object p7, p0, Lf6/N;->e:LI5/f;

    .line 15
    .line 16
    iput-object p8, p0, Lf6/N;->g:Lf6/Q;

    .line 17
    .line 18
    iput-object p9, p0, Lf6/N;->h:Lo2/e;

    .line 19
    .line 20
    int-to-long p1, p10

    .line 21
    iput-wide p1, p0, Lf6/N;->i:J

    .line 22
    .line 23
    new-instance p1, Lt6/E;

    .line 24
    .line 25
    const-string p2, "ProgressiveMediaPeriod"

    .line 26
    .line 27
    invoke-direct {p1, p2}, Lt6/E;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lf6/N;->j:Lt6/E;

    .line 31
    .line 32
    iput-object p3, p0, Lf6/N;->k:Lb7/k;

    .line 33
    .line 34
    new-instance p1, Ls8/b;

    .line 35
    .line 36
    const/4 p2, 0x7

    .line 37
    invoke-direct {p1, p2}, Ls8/b;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lf6/N;->l:Ls8/b;

    .line 41
    .line 42
    new-instance p1, Lf6/J;

    .line 43
    .line 44
    const/4 p2, 0x0

    .line 45
    invoke-direct {p1, p0, p2}, Lf6/J;-><init>(Lf6/N;I)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lf6/N;->m:Lf6/J;

    .line 49
    .line 50
    new-instance p1, Lf6/J;

    .line 51
    .line 52
    const/4 p2, 0x1

    .line 53
    invoke-direct {p1, p0, p2}, Lf6/J;-><init>(Lf6/N;I)V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lf6/N;->n:Lf6/J;

    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    invoke-static {p1}, Lu6/v;->j(Lq2/d;)Landroid/os/Handler;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Lf6/N;->o:Landroid/os/Handler;

    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    new-array p2, p1, [Lf6/M;

    .line 67
    .line 68
    iput-object p2, p0, Lf6/N;->s:[Lf6/M;

    .line 69
    .line 70
    new-array p1, p1, [Lf6/U;

    .line 71
    .line 72
    iput-object p1, p0, Lf6/N;->r:[Lf6/U;

    .line 73
    .line 74
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    iput-wide p1, p0, Lf6/N;->G:J

    .line 80
    .line 81
    iput-wide p1, p0, Lf6/N;->y:J

    .line 82
    .line 83
    const/4 p1, 0x1

    .line 84
    iput p1, p0, Lf6/N;->A:I

    .line 85
    .line 86
    return-void
.end method


# virtual methods
.method public final A(Lf6/M;)Lf6/U;
    .locals 5

    .line 1
    iget-object v0, p0, Lf6/N;->r:[Lf6/U;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    iget-object v2, p0, Lf6/N;->s:[Lf6/M;

    .line 8
    .line 9
    aget-object v2, v2, v1

    .line 10
    .line 11
    invoke-virtual {p1, v2}, Lf6/M;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lf6/N;->r:[Lf6/U;

    .line 18
    .line 19
    aget-object p1, p1, v1

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    new-instance v1, Lf6/U;

    .line 26
    .line 27
    iget-object v2, p0, Lf6/N;->c:LI5/i;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v3, p0, Lf6/N;->f:LI5/f;

    .line 33
    .line 34
    iget-object v4, p0, Lf6/N;->h:Lo2/e;

    .line 35
    .line 36
    invoke-direct {v1, v4, v2, v3}, Lf6/U;-><init>(Lo2/e;LI5/i;LI5/f;)V

    .line 37
    .line 38
    .line 39
    iput-object p0, v1, Lf6/U;->f:Lf6/N;

    .line 40
    .line 41
    iget-object v2, p0, Lf6/N;->s:[Lf6/M;

    .line 42
    .line 43
    add-int/lit8 v3, v0, 0x1

    .line 44
    .line 45
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, [Lf6/M;

    .line 50
    .line 51
    aput-object p1, v2, v0

    .line 52
    .line 53
    sget p1, Lu6/v;->a:I

    .line 54
    .line 55
    iput-object v2, p0, Lf6/N;->s:[Lf6/M;

    .line 56
    .line 57
    iget-object p1, p0, Lf6/N;->r:[Lf6/U;

    .line 58
    .line 59
    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, [Lf6/U;

    .line 64
    .line 65
    aput-object v1, p1, v0

    .line 66
    .line 67
    iput-object p1, p0, Lf6/N;->r:[Lf6/U;

    .line 68
    .line 69
    return-object v1
.end method

.method public final B()V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    new-instance v0, Lf6/K;

    .line 4
    .line 5
    iget-object v2, v1, Lf6/N;->a:Landroid/net/Uri;

    .line 6
    .line 7
    iget-object v3, v1, Lf6/N;->b:Lt6/l;

    .line 8
    .line 9
    iget-object v4, v1, Lf6/N;->k:Lb7/k;

    .line 10
    .line 11
    iget-object v6, v1, Lf6/N;->l:Ls8/b;

    .line 12
    .line 13
    move-object/from16 v5, p0

    .line 14
    .line 15
    invoke-direct/range {v0 .. v6}, Lf6/K;-><init>(Lf6/N;Landroid/net/Uri;Lt6/l;Lb7/k;Lf6/N;Ls8/b;)V

    .line 16
    .line 17
    .line 18
    iget-boolean v2, v1, Lf6/N;->u:Z

    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v9, 0x1

    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    invoke-virtual {v1}, Lf6/N;->t()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-static {v2}, Lu6/a;->i(Z)V

    .line 29
    .line 30
    .line 31
    iget-wide v2, v1, Lf6/N;->y:J

    .line 32
    .line 33
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    cmp-long v6, v2, v4

    .line 39
    .line 40
    if-eqz v6, :cond_0

    .line 41
    .line 42
    iget-wide v6, v1, Lf6/N;->G:J

    .line 43
    .line 44
    cmp-long v2, v6, v2

    .line 45
    .line 46
    if-lez v2, :cond_0

    .line 47
    .line 48
    iput-boolean v9, v1, Lf6/N;->J:Z

    .line 49
    .line 50
    iput-wide v4, v1, Lf6/N;->G:J

    .line 51
    .line 52
    return-void

    .line 53
    :cond_0
    iget-object v2, v1, Lf6/N;->x:LJ5/t;

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-wide v6, v1, Lf6/N;->G:J

    .line 59
    .line 60
    invoke-interface {v2, v6, v7}, LJ5/t;->c(J)LJ5/s;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iget-object v2, v2, LJ5/s;->a:LJ5/u;

    .line 65
    .line 66
    iget-wide v2, v2, LJ5/u;->b:J

    .line 67
    .line 68
    iget-wide v6, v1, Lf6/N;->G:J

    .line 69
    .line 70
    iget-object v10, v0, Lf6/K;->f:LJ5/n;

    .line 71
    .line 72
    iput-wide v2, v10, LJ5/n;->a:J

    .line 73
    .line 74
    iput-wide v6, v0, Lf6/K;->i:J

    .line 75
    .line 76
    iput-boolean v9, v0, Lf6/K;->h:Z

    .line 77
    .line 78
    iput-boolean v8, v0, Lf6/K;->l:Z

    .line 79
    .line 80
    iget-object v2, v1, Lf6/N;->r:[Lf6/U;

    .line 81
    .line 82
    array-length v3, v2

    .line 83
    move v6, v8

    .line 84
    :goto_0
    if-ge v6, v3, :cond_1

    .line 85
    .line 86
    aget-object v7, v2, v6

    .line 87
    .line 88
    iget-wide v10, v1, Lf6/N;->G:J

    .line 89
    .line 90
    iput-wide v10, v7, Lf6/U;->t:J

    .line 91
    .line 92
    add-int/lit8 v6, v6, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    iput-wide v4, v1, Lf6/N;->G:J

    .line 96
    .line 97
    :cond_2
    invoke-virtual {v1}, Lf6/N;->p()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    iput v2, v1, Lf6/N;->I:I

    .line 102
    .line 103
    iget-object v2, v1, Lf6/N;->d:Lae/d;

    .line 104
    .line 105
    iget v3, v1, Lf6/N;->A:I

    .line 106
    .line 107
    invoke-virtual {v2, v3}, Lae/d;->g(I)I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    move-object v4, v1

    .line 112
    iget-object v1, v4, Lf6/N;->j:Lt6/E;

    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-static {v2}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    const/4 v10, 0x0

    .line 125
    iput-object v10, v1, Lt6/E;->c:Ljava/io/IOException;

    .line 126
    .line 127
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 128
    .line 129
    .line 130
    move-result-wide v6

    .line 131
    move-object v3, v0

    .line 132
    new-instance v0, Lt6/C;

    .line 133
    .line 134
    invoke-direct/range {v0 .. v7}, Lt6/C;-><init>(Lt6/E;Landroid/os/Looper;Lf6/K;Lt6/B;IJ)V

    .line 135
    .line 136
    .line 137
    move-object v2, v3

    .line 138
    move-object v3, v0

    .line 139
    move-object v0, v2

    .line 140
    move-object v2, v1

    .line 141
    move-object v1, v4

    .line 142
    iget-object v4, v2, Lt6/E;->b:Lt6/C;

    .line 143
    .line 144
    if-nez v4, :cond_3

    .line 145
    .line 146
    move v8, v9

    .line 147
    :cond_3
    invoke-static {v8}, Lu6/a;->i(Z)V

    .line 148
    .line 149
    .line 150
    iput-object v3, v2, Lt6/E;->b:Lt6/C;

    .line 151
    .line 152
    iput-object v10, v3, Lt6/C;->d:Ljava/io/IOException;

    .line 153
    .line 154
    iget-object v2, v2, Lt6/E;->a:Ljava/util/concurrent/ExecutorService;

    .line 155
    .line 156
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 157
    .line 158
    .line 159
    iget-object v2, v0, Lf6/K;->j:Lt6/n;

    .line 160
    .line 161
    new-instance v3, Lf6/p;

    .line 162
    .line 163
    iget-object v2, v2, Lt6/n;->a:Landroid/net/Uri;

    .line 164
    .line 165
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 166
    .line 167
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 168
    .line 169
    .line 170
    iget-wide v4, v0, Lf6/K;->i:J

    .line 171
    .line 172
    iget-wide v6, v1, Lf6/N;->y:J

    .line 173
    .line 174
    iget-object v0, v1, Lf6/N;->e:LI5/f;

    .line 175
    .line 176
    new-instance v8, Lf6/u;

    .line 177
    .line 178
    invoke-virtual {v0, v4, v5}, LI5/f;->a(J)J

    .line 179
    .line 180
    .line 181
    move-result-wide v12

    .line 182
    invoke-virtual {v0, v6, v7}, LI5/f;->a(J)J

    .line 183
    .line 184
    .line 185
    move-result-wide v14

    .line 186
    const/4 v9, 0x1

    .line 187
    const/4 v10, -0x1

    .line 188
    const/4 v11, 0x0

    .line 189
    invoke-direct/range {v8 .. v15}, Lf6/u;-><init>(IILE5/T;JJ)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v3, v8}, LI5/f;->f(Lf6/p;Lf6/u;)V

    .line 193
    .line 194
    .line 195
    return-void
.end method

.method public final C()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf6/N;->C:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lf6/N;->t()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    return v0
.end method

.method public final a(Lf6/K;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-wide v2, v0, Lf6/N;->y:J

    .line 6
    .line 7
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long v2, v2, v4

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    iget-object v2, v0, Lf6/N;->x:LJ5/t;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-interface {v2}, LJ5/t;->e()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {v0, v3}, Lf6/N;->q(Z)J

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    const-wide/high16 v6, -0x8000000000000000L

    .line 30
    .line 31
    cmp-long v6, v4, v6

    .line 32
    .line 33
    if-nez v6, :cond_0

    .line 34
    .line 35
    const-wide/16 v4, 0x0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-wide/16 v6, 0x2710

    .line 39
    .line 40
    add-long/2addr v4, v6

    .line 41
    :goto_0
    iput-wide v4, v0, Lf6/N;->y:J

    .line 42
    .line 43
    iget-object v6, v0, Lf6/N;->g:Lf6/Q;

    .line 44
    .line 45
    iget-boolean v7, v0, Lf6/N;->z:Z

    .line 46
    .line 47
    invoke-virtual {v6, v4, v5, v2, v7}, Lf6/Q;->s(JZZ)V

    .line 48
    .line 49
    .line 50
    :cond_1
    iget-object v2, v1, Lf6/K;->b:Lt6/J;

    .line 51
    .line 52
    new-instance v4, Lf6/p;

    .line 53
    .line 54
    iget-object v2, v2, Lt6/J;->c:Landroid/net/Uri;

    .line 55
    .line 56
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    iget-object v2, v0, Lf6/N;->d:Lae/d;

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-wide v1, v1, Lf6/K;->i:J

    .line 65
    .line 66
    iget-wide v5, v0, Lf6/N;->y:J

    .line 67
    .line 68
    iget-object v7, v0, Lf6/N;->e:LI5/f;

    .line 69
    .line 70
    new-instance v8, Lf6/u;

    .line 71
    .line 72
    invoke-virtual {v7, v1, v2}, LI5/f;->a(J)J

    .line 73
    .line 74
    .line 75
    move-result-wide v12

    .line 76
    invoke-virtual {v7, v5, v6}, LI5/f;->a(J)J

    .line 77
    .line 78
    .line 79
    move-result-wide v14

    .line 80
    const/4 v9, 0x1

    .line 81
    const/4 v10, -0x1

    .line 82
    const/4 v11, 0x0

    .line 83
    invoke-direct/range {v8 .. v15}, Lf6/u;-><init>(IILE5/T;JJ)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v7, v4, v8}, LI5/f;->d(Lf6/p;Lf6/u;)V

    .line 87
    .line 88
    .line 89
    iput-boolean v3, v0, Lf6/N;->J:Z

    .line 90
    .line 91
    iget-object v1, v0, Lf6/N;->p:Lf6/v;

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-interface {v1, v0}, Lf6/v;->b(Lf6/W;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public final b(Lf6/K;Ljava/io/IOException;I)LU5/f;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v1, Lf6/K;->b:Lt6/J;

    .line 10
    .line 11
    new-instance v6, Lf6/p;

    .line 12
    .line 13
    iget-object v5, v5, Lt6/J;->c:Landroid/net/Uri;

    .line 14
    .line 15
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    sget v5, Lu6/v;->a:I

    .line 19
    .line 20
    iget-object v5, v0, Lf6/N;->d:Lae/d;

    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    instance-of v5, v2, LE5/o0;

    .line 26
    .line 27
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    if-nez v5, :cond_2

    .line 33
    .line 34
    instance-of v5, v2, Ljava/io/FileNotFoundException;

    .line 35
    .line 36
    if-nez v5, :cond_2

    .line 37
    .line 38
    instance-of v5, v2, Lt6/w;

    .line 39
    .line 40
    if-nez v5, :cond_2

    .line 41
    .line 42
    instance-of v5, v2, Lt6/D;

    .line 43
    .line 44
    if-nez v5, :cond_2

    .line 45
    .line 46
    sget v5, Lt6/m;->b:I

    .line 47
    .line 48
    move-object v5, v2

    .line 49
    :goto_0
    if-eqz v5, :cond_1

    .line 50
    .line 51
    instance-of v9, v5, Lt6/m;

    .line 52
    .line 53
    if-eqz v9, :cond_0

    .line 54
    .line 55
    move-object v9, v5

    .line 56
    check-cast v9, Lt6/m;

    .line 57
    .line 58
    iget v9, v9, Lt6/m;->a:I

    .line 59
    .line 60
    const/16 v10, 0x7d8

    .line 61
    .line 62
    if-ne v9, v10, :cond_0

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_0
    invoke-virtual {v5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    goto :goto_0

    .line 70
    :cond_1
    add-int/lit8 v5, p3, -0x1

    .line 71
    .line 72
    mul-int/lit16 v5, v5, 0x3e8

    .line 73
    .line 74
    const/16 v9, 0x1388

    .line 75
    .line 76
    invoke-static {v5, v9}, Ljava/lang/Math;->min(II)I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    int-to-long v9, v5

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    :goto_1
    move-wide v9, v7

    .line 83
    :goto_2
    cmp-long v5, v9, v7

    .line 84
    .line 85
    if-nez v5, :cond_3

    .line 86
    .line 87
    sget-object v5, Lt6/E;->e:LU5/f;

    .line 88
    .line 89
    goto :goto_7

    .line 90
    :cond_3
    invoke-virtual {v0}, Lf6/N;->p()I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    iget v11, v0, Lf6/N;->I:I

    .line 95
    .line 96
    if-le v5, v11, :cond_4

    .line 97
    .line 98
    move v11, v4

    .line 99
    goto :goto_3

    .line 100
    :cond_4
    move v11, v3

    .line 101
    :goto_3
    iget-boolean v12, v0, Lf6/N;->E:Z

    .line 102
    .line 103
    if-nez v12, :cond_8

    .line 104
    .line 105
    iget-object v12, v0, Lf6/N;->x:LJ5/t;

    .line 106
    .line 107
    if-eqz v12, :cond_5

    .line 108
    .line 109
    invoke-interface {v12}, LJ5/t;->f()J

    .line 110
    .line 111
    .line 112
    move-result-wide v12

    .line 113
    cmp-long v7, v12, v7

    .line 114
    .line 115
    if-eqz v7, :cond_5

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_5
    iget-boolean v5, v0, Lf6/N;->u:Z

    .line 119
    .line 120
    if-eqz v5, :cond_6

    .line 121
    .line 122
    invoke-virtual {v0}, Lf6/N;->C()Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-nez v5, :cond_6

    .line 127
    .line 128
    iput-boolean v4, v0, Lf6/N;->H:Z

    .line 129
    .line 130
    sget-object v5, Lt6/E;->d:LU5/f;

    .line 131
    .line 132
    goto :goto_7

    .line 133
    :cond_6
    iget-boolean v5, v0, Lf6/N;->u:Z

    .line 134
    .line 135
    iput-boolean v5, v0, Lf6/N;->C:Z

    .line 136
    .line 137
    const-wide/16 v7, 0x0

    .line 138
    .line 139
    iput-wide v7, v0, Lf6/N;->F:J

    .line 140
    .line 141
    iput v3, v0, Lf6/N;->I:I

    .line 142
    .line 143
    iget-object v5, v0, Lf6/N;->r:[Lf6/U;

    .line 144
    .line 145
    array-length v12, v5

    .line 146
    move v13, v3

    .line 147
    :goto_4
    if-ge v13, v12, :cond_7

    .line 148
    .line 149
    aget-object v14, v5, v13

    .line 150
    .line 151
    invoke-virtual {v14, v3}, Lf6/U;->o(Z)V

    .line 152
    .line 153
    .line 154
    add-int/2addr v13, v4

    .line 155
    goto :goto_4

    .line 156
    :cond_7
    iget-object v5, v1, Lf6/K;->f:LJ5/n;

    .line 157
    .line 158
    iput-wide v7, v5, LJ5/n;->a:J

    .line 159
    .line 160
    iput-wide v7, v1, Lf6/K;->i:J

    .line 161
    .line 162
    iput-boolean v4, v1, Lf6/K;->h:Z

    .line 163
    .line 164
    iput-boolean v3, v1, Lf6/K;->l:Z

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_8
    :goto_5
    iput v5, v0, Lf6/N;->I:I

    .line 168
    .line 169
    :goto_6
    new-instance v5, LU5/f;

    .line 170
    .line 171
    invoke-direct {v5, v9, v10, v11, v3}, LU5/f;-><init>(JIZ)V

    .line 172
    .line 173
    .line 174
    :goto_7
    iget v7, v5, LU5/f;->a:I

    .line 175
    .line 176
    if-eqz v7, :cond_9

    .line 177
    .line 178
    if-ne v7, v4, :cond_a

    .line 179
    .line 180
    :cond_9
    move v3, v4

    .line 181
    :cond_a
    xor-int/2addr v3, v4

    .line 182
    iget-wide v7, v1, Lf6/K;->i:J

    .line 183
    .line 184
    iget-wide v9, v0, Lf6/N;->y:J

    .line 185
    .line 186
    iget-object v1, v0, Lf6/N;->e:LI5/f;

    .line 187
    .line 188
    new-instance v11, Lf6/u;

    .line 189
    .line 190
    invoke-virtual {v1, v7, v8}, LI5/f;->a(J)J

    .line 191
    .line 192
    .line 193
    move-result-wide v15

    .line 194
    invoke-virtual {v1, v9, v10}, LI5/f;->a(J)J

    .line 195
    .line 196
    .line 197
    move-result-wide v17

    .line 198
    const/4 v13, -0x1

    .line 199
    const/4 v12, 0x1

    .line 200
    const/4 v14, 0x0

    .line 201
    invoke-direct/range {v11 .. v18}, Lf6/u;-><init>(IILE5/T;JJ)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v6, v11, v2, v3}, LI5/f;->e(Lf6/p;Lf6/u;Ljava/io/IOException;Z)V

    .line 205
    .line 206
    .line 207
    return-object v5
.end method

.method public final c()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lf6/N;->n()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public final d(J)J
    .locals 6

    .line 1
    invoke-virtual {p0}, Lf6/N;->k()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lf6/N;->w:LS3/n;

    .line 5
    .line 6
    iget-object v0, v0, LS3/n;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, [Z

    .line 9
    .line 10
    iget-object v1, p0, Lf6/N;->x:LJ5/t;

    .line 11
    .line 12
    invoke-interface {v1}, LJ5/t;->e()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-wide/16 p1, 0x0

    .line 20
    .line 21
    :goto_0
    const/4 v1, 0x0

    .line 22
    iput-boolean v1, p0, Lf6/N;->C:Z

    .line 23
    .line 24
    iput-wide p1, p0, Lf6/N;->F:J

    .line 25
    .line 26
    invoke-virtual {p0}, Lf6/N;->t()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    iput-wide p1, p0, Lf6/N;->G:J

    .line 33
    .line 34
    return-wide p1

    .line 35
    :cond_1
    iget v2, p0, Lf6/N;->A:I

    .line 36
    .line 37
    const/4 v3, 0x7

    .line 38
    if-eq v2, v3, :cond_3

    .line 39
    .line 40
    iget-object v2, p0, Lf6/N;->r:[Lf6/U;

    .line 41
    .line 42
    array-length v2, v2

    .line 43
    move v3, v1

    .line 44
    :goto_1
    if-ge v3, v2, :cond_6

    .line 45
    .line 46
    iget-object v4, p0, Lf6/N;->r:[Lf6/U;

    .line 47
    .line 48
    aget-object v4, v4, v3

    .line 49
    .line 50
    invoke-virtual {v4, p1, p2, v1}, Lf6/U;->q(JZ)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-nez v4, :cond_2

    .line 55
    .line 56
    aget-boolean v4, v0, v3

    .line 57
    .line 58
    if-nez v4, :cond_3

    .line 59
    .line 60
    iget-boolean v4, p0, Lf6/N;->v:Z

    .line 61
    .line 62
    if-nez v4, :cond_2

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    :goto_2
    iput-boolean v1, p0, Lf6/N;->H:Z

    .line 69
    .line 70
    iput-wide p1, p0, Lf6/N;->G:J

    .line 71
    .line 72
    iput-boolean v1, p0, Lf6/N;->J:Z

    .line 73
    .line 74
    iget-object v0, p0, Lf6/N;->j:Lt6/E;

    .line 75
    .line 76
    invoke-virtual {v0}, Lt6/E;->a()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_5

    .line 81
    .line 82
    iget-object v2, p0, Lf6/N;->r:[Lf6/U;

    .line 83
    .line 84
    array-length v3, v2

    .line 85
    move v4, v1

    .line 86
    :goto_3
    if-ge v4, v3, :cond_4

    .line 87
    .line 88
    aget-object v5, v2, v4

    .line 89
    .line 90
    invoke-virtual {v5}, Lf6/U;->g()V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v4, v4, 0x1

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    iget-object v0, v0, Lt6/E;->b:Lt6/C;

    .line 97
    .line 98
    invoke-static {v0}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1}, Lt6/C;->a(Z)V

    .line 102
    .line 103
    .line 104
    return-wide p1

    .line 105
    :cond_5
    const/4 v2, 0x0

    .line 106
    iput-object v2, v0, Lt6/E;->c:Ljava/io/IOException;

    .line 107
    .line 108
    iget-object v0, p0, Lf6/N;->r:[Lf6/U;

    .line 109
    .line 110
    array-length v2, v0

    .line 111
    move v3, v1

    .line 112
    :goto_4
    if-ge v3, v2, :cond_6

    .line 113
    .line 114
    aget-object v4, v0, v3

    .line 115
    .line 116
    invoke-virtual {v4, v1}, Lf6/U;->o(Z)V

    .line 117
    .line 118
    .line 119
    add-int/lit8 v3, v3, 0x1

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_6
    return-wide p1
.end method

.method public final e()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lf6/N;->j:Lt6/E;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt6/E;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lf6/N;->l:Ls8/b;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    iget-boolean v1, v0, Ls8/b;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v1

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0
.end method

.method public final f()J
    .locals 2

    .line 1
    iget-boolean v0, p0, Lf6/N;->C:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lf6/N;->J:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lf6/N;->p()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Lf6/N;->I:I

    .line 14
    .line 15
    if-le v0, v1, :cond_1

    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lf6/N;->C:Z

    .line 19
    .line 20
    iget-wide v0, p0, Lf6/N;->F:J

    .line 21
    .line 22
    return-wide v0

    .line 23
    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    return-wide v0
.end method

.method public final g(Lf6/K;Z)V
    .locals 14

    .line 1
    iget-object v0, p1, Lf6/K;->b:Lt6/J;

    .line 2
    .line 3
    new-instance v1, Lf6/p;

    .line 4
    .line 5
    iget-object v0, v0, Lt6/J;->c:Landroid/net/Uri;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lf6/N;->d:Lae/d;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-wide v2, p1, Lf6/K;->i:J

    .line 16
    .line 17
    iget-wide v4, p0, Lf6/N;->y:J

    .line 18
    .line 19
    iget-object p1, p0, Lf6/N;->e:LI5/f;

    .line 20
    .line 21
    new-instance v6, Lf6/u;

    .line 22
    .line 23
    invoke-virtual {p1, v2, v3}, LI5/f;->a(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v10

    .line 27
    invoke-virtual {p1, v4, v5}, LI5/f;->a(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v12

    .line 31
    const/4 v8, -0x1

    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v7, 0x1

    .line 34
    invoke-direct/range {v6 .. v13}, Lf6/u;-><init>(IILE5/T;JJ)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v1, v6}, LI5/f;->c(Lf6/p;Lf6/u;)V

    .line 38
    .line 39
    .line 40
    if-nez p2, :cond_1

    .line 41
    .line 42
    iget-object p1, p0, Lf6/N;->r:[Lf6/U;

    .line 43
    .line 44
    array-length v0, p1

    .line 45
    const/4 v1, 0x0

    .line 46
    move v2, v1

    .line 47
    :goto_0
    if-ge v2, v0, :cond_0

    .line 48
    .line 49
    aget-object v3, p1, v2

    .line 50
    .line 51
    invoke-virtual {v3, v1}, Lf6/U;->o(Z)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget p1, p0, Lf6/N;->D:I

    .line 58
    .line 59
    if-lez p1, :cond_1

    .line 60
    .line 61
    iget-object p1, p0, Lf6/N;->p:Lf6/v;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-interface {p1, p0}, Lf6/v;->b(Lf6/W;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    return-void
.end method

.method public final h()V
    .locals 3

    .line 1
    iget-object v0, p0, Lf6/N;->d:Lae/d;

    .line 2
    .line 3
    iget v1, p0, Lf6/N;->A:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lae/d;->g(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lf6/N;->j:Lt6/E;

    .line 10
    .line 11
    iget-object v2, v1, Lt6/E;->c:Ljava/io/IOException;

    .line 12
    .line 13
    if-nez v2, :cond_5

    .line 14
    .line 15
    iget-object v1, v1, Lt6/E;->b:Lt6/C;

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    const/high16 v2, -0x80000000

    .line 20
    .line 21
    if-ne v0, v2, :cond_0

    .line 22
    .line 23
    iget v0, v1, Lt6/C;->a:I

    .line 24
    .line 25
    :cond_0
    iget-object v2, v1, Lt6/C;->d:Ljava/io/IOException;

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget v1, v1, Lt6/C;->e:I

    .line 30
    .line 31
    if-gt v1, v0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    throw v2

    .line 35
    :cond_2
    :goto_0
    iget-boolean v0, p0, Lf6/N;->J:Z

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    iget-boolean v0, p0, Lf6/N;->u:Z

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    const-string v0, "Loading finished before preparation is complete."

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-static {v0, v1}, LE5/o0;->a(Ljava/lang/String;Ljava/lang/Exception;)LE5/o0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    throw v0

    .line 52
    :cond_4
    :goto_1
    return-void

    .line 53
    :cond_5
    throw v2
.end method

.method public final i(J)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Lf6/N;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lf6/N;->t()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_5

    .line 11
    :cond_0
    iget-object v0, p0, Lf6/N;->w:LS3/n;

    .line 12
    .line 13
    iget-object v0, v0, LS3/n;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, [Z

    .line 16
    .line 17
    iget-object v1, p0, Lf6/N;->r:[Lf6/U;

    .line 18
    .line 19
    array-length v1, v1

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    if-ge v2, v1, :cond_5

    .line 22
    .line 23
    iget-object v3, p0, Lf6/N;->r:[Lf6/U;

    .line 24
    .line 25
    aget-object v4, v3, v2

    .line 26
    .line 27
    aget-boolean v3, v0, v2

    .line 28
    .line 29
    iget-object v10, v4, Lf6/U;->a:Lf6/S;

    .line 30
    .line 31
    monitor-enter v4

    .line 32
    :try_start_0
    iget v5, v4, Lf6/U;->p:I

    .line 33
    .line 34
    const-wide/16 v11, -0x1

    .line 35
    .line 36
    if-eqz v5, :cond_1

    .line 37
    .line 38
    iget-object v6, v4, Lf6/U;->n:[J

    .line 39
    .line 40
    move v7, v5

    .line 41
    iget v5, v4, Lf6/U;->r:I

    .line 42
    .line 43
    aget-wide v8, v6, v5

    .line 44
    .line 45
    cmp-long v6, p1, v8

    .line 46
    .line 47
    if-gez v6, :cond_2

    .line 48
    .line 49
    :cond_1
    move-wide v7, p1

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    if-eqz v3, :cond_3

    .line 52
    .line 53
    iget v3, v4, Lf6/U;->s:I

    .line 54
    .line 55
    if-eq v3, v7, :cond_3

    .line 56
    .line 57
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    move v6, v3

    .line 60
    goto :goto_1

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    move-object p1, v0

    .line 63
    goto :goto_4

    .line 64
    :cond_3
    move v6, v7

    .line 65
    :goto_1
    const/4 v9, 0x0

    .line 66
    move-wide v7, p1

    .line 67
    invoke-virtual/range {v4 .. v9}, Lf6/U;->h(IIJZ)I

    .line 68
    .line 69
    .line 70
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    const/4 p2, -0x1

    .line 72
    if-ne p1, p2, :cond_4

    .line 73
    .line 74
    monitor-exit v4

    .line 75
    goto :goto_3

    .line 76
    :cond_4
    :try_start_1
    invoke-virtual {v4, p1}, Lf6/U;->f(I)J

    .line 77
    .line 78
    .line 79
    move-result-wide v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    monitor-exit v4

    .line 81
    goto :goto_3

    .line 82
    :goto_2
    monitor-exit v4

    .line 83
    :goto_3
    invoke-virtual {v10, v11, v12}, Lf6/S;->b(J)V

    .line 84
    .line 85
    .line 86
    add-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    move-wide p1, v7

    .line 89
    goto :goto_0

    .line 90
    :goto_4
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 91
    throw p1

    .line 92
    :cond_5
    :goto_5
    return-void
.end method

.method public final j()Lf6/a0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf6/N;->k()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lf6/N;->w:LS3/n;

    .line 5
    .line 6
    iget-object v0, v0, LS3/n;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lf6/a0;

    .line 9
    .line 10
    return-object v0
.end method

.method public final k()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf6/N;->u:Z

    .line 2
    .line 3
    invoke-static {v0}, Lu6/a;->i(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf6/N;->w:LS3/n;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lf6/N;->x:LJ5/t;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final l()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lf6/N;->t:Z

    .line 3
    .line 4
    iget-object v0, p0, Lf6/N;->o:Landroid/os/Handler;

    .line 5
    .line 6
    iget-object v1, p0, Lf6/N;->m:Lf6/J;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final m(II)LJ5/w;
    .locals 1

    .line 1
    new-instance p2, Lf6/M;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p2, p1, v0}, Lf6/M;-><init>(IZ)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lf6/N;->A(Lf6/M;)Lf6/U;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final n()J
    .locals 11

    .line 1
    invoke-virtual {p0}, Lf6/N;->k()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lf6/N;->J:Z

    .line 5
    .line 6
    const-wide/high16 v1, -0x8000000000000000L

    .line 7
    .line 8
    if-nez v0, :cond_7

    .line 9
    .line 10
    iget v0, p0, Lf6/N;->D:I

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    invoke-virtual {p0}, Lf6/N;->t()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-wide v0, p0, Lf6/N;->G:J

    .line 22
    .line 23
    return-wide v0

    .line 24
    :cond_1
    iget-boolean v0, p0, Lf6/N;->v:Z

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const-wide v4, 0x7fffffffffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, Lf6/N;->r:[Lf6/U;

    .line 35
    .line 36
    array-length v0, v0

    .line 37
    move v6, v3

    .line 38
    move-wide v7, v4

    .line 39
    :goto_0
    if-ge v6, v0, :cond_4

    .line 40
    .line 41
    iget-object v9, p0, Lf6/N;->w:LS3/n;

    .line 42
    .line 43
    iget-object v10, v9, LS3/n;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v10, [Z

    .line 46
    .line 47
    aget-boolean v10, v10, v6

    .line 48
    .line 49
    if-eqz v10, :cond_2

    .line 50
    .line 51
    iget-object v9, v9, LS3/n;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v9, [Z

    .line 54
    .line 55
    aget-boolean v9, v9, v6

    .line 56
    .line 57
    if-eqz v9, :cond_2

    .line 58
    .line 59
    iget-object v9, p0, Lf6/N;->r:[Lf6/U;

    .line 60
    .line 61
    aget-object v9, v9, v6

    .line 62
    .line 63
    monitor-enter v9

    .line 64
    :try_start_0
    iget-boolean v10, v9, Lf6/U;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    monitor-exit v9

    .line 67
    if-nez v10, :cond_2

    .line 68
    .line 69
    iget-object v9, p0, Lf6/N;->r:[Lf6/U;

    .line 70
    .line 71
    aget-object v9, v9, v6

    .line 72
    .line 73
    invoke-virtual {v9}, Lf6/U;->i()J

    .line 74
    .line 75
    .line 76
    move-result-wide v9

    .line 77
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 78
    .line 79
    .line 80
    move-result-wide v7

    .line 81
    goto :goto_1

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    :try_start_1
    monitor-exit v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    throw v0

    .line 85
    :cond_2
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    move-wide v7, v4

    .line 89
    :cond_4
    cmp-long v0, v7, v4

    .line 90
    .line 91
    if-nez v0, :cond_5

    .line 92
    .line 93
    invoke-virtual {p0, v3}, Lf6/N;->q(Z)J

    .line 94
    .line 95
    .line 96
    move-result-wide v7

    .line 97
    :cond_5
    cmp-long v0, v7, v1

    .line 98
    .line 99
    if-nez v0, :cond_6

    .line 100
    .line 101
    iget-wide v0, p0, Lf6/N;->F:J

    .line 102
    .line 103
    return-wide v0

    .line 104
    :cond_6
    return-wide v7

    .line 105
    :cond_7
    :goto_2
    return-wide v1
.end method

.method public final o(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final p()I
    .locals 6

    .line 1
    iget-object v0, p0, Lf6/N;->r:[Lf6/U;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v2, v1, :cond_0

    .line 7
    .line 8
    aget-object v4, v0, v2

    .line 9
    .line 10
    iget v5, v4, Lf6/U;->q:I

    .line 11
    .line 12
    iget v4, v4, Lf6/U;->p:I

    .line 13
    .line 14
    add-int/2addr v5, v4

    .line 15
    add-int/2addr v3, v5

    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return v3
.end method

.method public final q(Z)J
    .locals 5

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    iget-object v3, p0, Lf6/N;->r:[Lf6/U;

    .line 5
    .line 6
    array-length v3, v3

    .line 7
    if-ge v2, v3, :cond_2

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-object v3, p0, Lf6/N;->w:LS3/n;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v3, v3, LS3/n;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, [Z

    .line 19
    .line 20
    aget-boolean v3, v3, v2

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    :cond_0
    iget-object v3, p0, Lf6/N;->r:[Lf6/U;

    .line 25
    .line 26
    aget-object v3, v3, v2

    .line 27
    .line 28
    invoke-virtual {v3}, Lf6/U;->i()J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    return-wide v0
.end method

.method public final r(Lf6/v;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf6/N;->p:Lf6/v;

    .line 2
    .line 3
    iget-object p1, p0, Lf6/N;->l:Ls8/b;

    .line 4
    .line 5
    invoke-virtual {p1}, Ls8/b;->e()Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lf6/N;->B()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final s(JLE5/C0;)J
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    invoke-virtual {v0}, Lf6/N;->k()V

    .line 8
    .line 9
    .line 10
    iget-object v4, v0, Lf6/N;->x:LJ5/t;

    .line 11
    .line 12
    invoke-interface {v4}, LJ5/t;->e()Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    const-wide/16 v5, 0x0

    .line 17
    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    return-wide v5

    .line 21
    :cond_0
    iget-object v4, v0, Lf6/N;->x:LJ5/t;

    .line 22
    .line 23
    invoke-interface {v4, v1, v2}, LJ5/t;->c(J)LJ5/s;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget-object v7, v4, LJ5/s;->a:LJ5/u;

    .line 28
    .line 29
    iget-wide v7, v7, LJ5/u;->a:J

    .line 30
    .line 31
    iget-object v4, v4, LJ5/s;->b:LJ5/u;

    .line 32
    .line 33
    iget-wide v9, v4, LJ5/u;->a:J

    .line 34
    .line 35
    iget-wide v11, v3, LE5/C0;->a:J

    .line 36
    .line 37
    cmp-long v4, v11, v5

    .line 38
    .line 39
    iget-wide v13, v3, LE5/C0;->b:J

    .line 40
    .line 41
    if-nez v4, :cond_1

    .line 42
    .line 43
    cmp-long v3, v13, v5

    .line 44
    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    return-wide v1

    .line 48
    :cond_1
    sget v3, Lu6/v;->a:I

    .line 49
    .line 50
    sub-long v3, v1, v11

    .line 51
    .line 52
    xor-long/2addr v11, v1

    .line 53
    xor-long v15, v1, v3

    .line 54
    .line 55
    and-long/2addr v11, v15

    .line 56
    cmp-long v11, v11, v5

    .line 57
    .line 58
    if-gez v11, :cond_2

    .line 59
    .line 60
    const-wide/high16 v3, -0x8000000000000000L

    .line 61
    .line 62
    :cond_2
    add-long v11, v1, v13

    .line 63
    .line 64
    xor-long v15, v1, v11

    .line 65
    .line 66
    xor-long/2addr v13, v11

    .line 67
    and-long/2addr v13, v15

    .line 68
    cmp-long v5, v13, v5

    .line 69
    .line 70
    if-gez v5, :cond_3

    .line 71
    .line 72
    const-wide v11, 0x7fffffffffffffffL

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    :cond_3
    cmp-long v5, v3, v7

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    const/4 v13, 0x1

    .line 81
    if-gtz v5, :cond_4

    .line 82
    .line 83
    cmp-long v5, v7, v11

    .line 84
    .line 85
    if-gtz v5, :cond_4

    .line 86
    .line 87
    move v5, v13

    .line 88
    goto :goto_0

    .line 89
    :cond_4
    move v5, v6

    .line 90
    :goto_0
    cmp-long v14, v3, v9

    .line 91
    .line 92
    if-gtz v14, :cond_5

    .line 93
    .line 94
    cmp-long v11, v9, v11

    .line 95
    .line 96
    if-gtz v11, :cond_5

    .line 97
    .line 98
    move v6, v13

    .line 99
    :cond_5
    if-eqz v5, :cond_6

    .line 100
    .line 101
    if-eqz v6, :cond_6

    .line 102
    .line 103
    sub-long v3, v7, v1

    .line 104
    .line 105
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    .line 106
    .line 107
    .line 108
    move-result-wide v3

    .line 109
    sub-long v1, v9, v1

    .line 110
    .line 111
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    .line 112
    .line 113
    .line 114
    move-result-wide v1

    .line 115
    cmp-long v1, v3, v1

    .line 116
    .line 117
    if-gtz v1, :cond_8

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_6
    if-eqz v5, :cond_7

    .line 121
    .line 122
    :goto_1
    return-wide v7

    .line 123
    :cond_7
    if-eqz v6, :cond_9

    .line 124
    .line 125
    :cond_8
    return-wide v9

    .line 126
    :cond_9
    return-wide v3
.end method

.method public final t()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lf6/N;->G:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public final u()V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-boolean v2, p0, Lf6/N;->K:Z

    .line 4
    .line 5
    if-nez v2, :cond_b

    .line 6
    .line 7
    iget-boolean v2, p0, Lf6/N;->u:Z

    .line 8
    .line 9
    if-nez v2, :cond_b

    .line 10
    .line 11
    iget-boolean v2, p0, Lf6/N;->t:Z

    .line 12
    .line 13
    if-eqz v2, :cond_b

    .line 14
    .line 15
    iget-object v2, p0, Lf6/N;->x:LJ5/t;

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto/16 :goto_6

    .line 20
    .line 21
    :cond_0
    iget-object v2, p0, Lf6/N;->r:[Lf6/U;

    .line 22
    .line 23
    array-length v3, v2

    .line 24
    move v4, v0

    .line 25
    :goto_0
    if-ge v4, v3, :cond_3

    .line 26
    .line 27
    aget-object v5, v2, v4

    .line 28
    .line 29
    monitor-enter v5

    .line 30
    :try_start_0
    iget-boolean v6, v5, Lf6/U;->y:Z

    .line 31
    .line 32
    if-eqz v6, :cond_1

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    iget-object v6, v5, Lf6/U;->z:LE5/T;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    :goto_1
    monitor-exit v5

    .line 39
    if-nez v6, :cond_2

    .line 40
    .line 41
    goto/16 :goto_6

    .line 42
    .line 43
    :cond_2
    add-int/2addr v4, v1

    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    throw v0

    .line 48
    :cond_3
    iget-object v2, p0, Lf6/N;->l:Ls8/b;

    .line 49
    .line 50
    invoke-virtual {v2}, Ls8/b;->b()V

    .line 51
    .line 52
    .line 53
    iget-object v2, p0, Lf6/N;->r:[Lf6/U;

    .line 54
    .line 55
    array-length v2, v2

    .line 56
    new-array v3, v2, [Lf6/Z;

    .line 57
    .line 58
    new-array v4, v2, [Z

    .line 59
    .line 60
    move v5, v0

    .line 61
    :goto_2
    if-ge v5, v2, :cond_a

    .line 62
    .line 63
    iget-object v6, p0, Lf6/N;->r:[Lf6/U;

    .line 64
    .line 65
    aget-object v6, v6, v5

    .line 66
    .line 67
    invoke-virtual {v6}, Lf6/U;->k()LE5/T;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v7, v6, LE5/T;->l:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v7}, Lu6/k;->g(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    if-nez v8, :cond_5

    .line 81
    .line 82
    invoke-static {v7}, Lu6/k;->i(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-eqz v7, :cond_4

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_4
    move v7, v0

    .line 90
    goto :goto_4

    .line 91
    :cond_5
    :goto_3
    move v7, v1

    .line 92
    :goto_4
    aput-boolean v7, v4, v5

    .line 93
    .line 94
    iget-boolean v9, p0, Lf6/N;->v:Z

    .line 95
    .line 96
    or-int/2addr v7, v9

    .line 97
    iput-boolean v7, p0, Lf6/N;->v:Z

    .line 98
    .line 99
    iget-object v7, p0, Lf6/N;->q:La6/b;

    .line 100
    .line 101
    if-eqz v7, :cond_9

    .line 102
    .line 103
    if-nez v8, :cond_6

    .line 104
    .line 105
    iget-object v9, p0, Lf6/N;->s:[Lf6/M;

    .line 106
    .line 107
    aget-object v9, v9, v5

    .line 108
    .line 109
    iget-boolean v9, v9, Lf6/M;->b:Z

    .line 110
    .line 111
    if-eqz v9, :cond_8

    .line 112
    .line 113
    :cond_6
    iget-object v9, v6, LE5/T;->j:LW5/c;

    .line 114
    .line 115
    if-nez v9, :cond_7

    .line 116
    .line 117
    new-instance v9, LW5/c;

    .line 118
    .line 119
    new-array v10, v1, [LW5/b;

    .line 120
    .line 121
    aput-object v7, v10, v0

    .line 122
    .line 123
    invoke-direct {v9, v10}, LW5/c;-><init>([LW5/b;)V

    .line 124
    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_7
    new-array v10, v1, [LW5/b;

    .line 128
    .line 129
    aput-object v7, v10, v0

    .line 130
    .line 131
    invoke-virtual {v9, v10}, LW5/c;->c([LW5/b;)LW5/c;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    :goto_5
    invoke-virtual {v6}, LE5/T;->a()LE5/S;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    iput-object v9, v6, LE5/S;->i:LW5/c;

    .line 140
    .line 141
    new-instance v9, LE5/T;

    .line 142
    .line 143
    invoke-direct {v9, v6}, LE5/T;-><init>(LE5/S;)V

    .line 144
    .line 145
    .line 146
    move-object v6, v9

    .line 147
    :cond_8
    if-eqz v8, :cond_9

    .line 148
    .line 149
    iget v8, v6, LE5/T;->f:I

    .line 150
    .line 151
    const/4 v9, -0x1

    .line 152
    if-ne v8, v9, :cond_9

    .line 153
    .line 154
    iget v8, v6, LE5/T;->g:I

    .line 155
    .line 156
    if-ne v8, v9, :cond_9

    .line 157
    .line 158
    iget v7, v7, La6/b;->a:I

    .line 159
    .line 160
    if-eq v7, v9, :cond_9

    .line 161
    .line 162
    invoke-virtual {v6}, LE5/T;->a()LE5/S;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    iput v7, v6, LE5/S;->f:I

    .line 167
    .line 168
    new-instance v7, LE5/T;

    .line 169
    .line 170
    invoke-direct {v7, v6}, LE5/T;-><init>(LE5/S;)V

    .line 171
    .line 172
    .line 173
    move-object v6, v7

    .line 174
    :cond_9
    iget-object v7, p0, Lf6/N;->c:LI5/i;

    .line 175
    .line 176
    invoke-interface {v7, v6}, LI5/i;->k(LE5/T;)I

    .line 177
    .line 178
    .line 179
    move-result v7

    .line 180
    invoke-virtual {v6}, LE5/T;->a()LE5/S;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    iput v7, v6, LE5/S;->D:I

    .line 185
    .line 186
    new-instance v7, LE5/T;

    .line 187
    .line 188
    invoke-direct {v7, v6}, LE5/T;-><init>(LE5/S;)V

    .line 189
    .line 190
    .line 191
    new-instance v6, Lf6/Z;

    .line 192
    .line 193
    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    new-array v9, v1, [LE5/T;

    .line 198
    .line 199
    aput-object v7, v9, v0

    .line 200
    .line 201
    invoke-direct {v6, v8, v9}, Lf6/Z;-><init>(Ljava/lang/String;[LE5/T;)V

    .line 202
    .line 203
    .line 204
    aput-object v6, v3, v5

    .line 205
    .line 206
    add-int/2addr v5, v1

    .line 207
    goto/16 :goto_2

    .line 208
    .line 209
    :cond_a
    new-instance v0, LS3/n;

    .line 210
    .line 211
    new-instance v2, Lf6/a0;

    .line 212
    .line 213
    invoke-direct {v2, v3}, Lf6/a0;-><init>([Lf6/Z;)V

    .line 214
    .line 215
    .line 216
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 217
    .line 218
    .line 219
    iput-object v2, v0, LS3/n;->a:Ljava/lang/Object;

    .line 220
    .line 221
    iput-object v4, v0, LS3/n;->b:Ljava/lang/Object;

    .line 222
    .line 223
    iget v2, v2, Lf6/a0;->a:I

    .line 224
    .line 225
    new-array v3, v2, [Z

    .line 226
    .line 227
    iput-object v3, v0, LS3/n;->c:Ljava/lang/Object;

    .line 228
    .line 229
    new-array v2, v2, [Z

    .line 230
    .line 231
    iput-object v2, v0, LS3/n;->d:Ljava/lang/Object;

    .line 232
    .line 233
    iput-object v0, p0, Lf6/N;->w:LS3/n;

    .line 234
    .line 235
    iput-boolean v1, p0, Lf6/N;->u:Z

    .line 236
    .line 237
    iget-object v0, p0, Lf6/N;->p:Lf6/v;

    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-interface {v0, p0}, Lf6/v;->a(Lf6/w;)V

    .line 243
    .line 244
    .line 245
    :cond_b
    :goto_6
    return-void
.end method

.method public final v(I)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Lf6/N;->k()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lf6/N;->w:LS3/n;

    .line 5
    .line 6
    iget-object v1, v0, LS3/n;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, [Z

    .line 9
    .line 10
    aget-boolean v2, v1, p1

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, LS3/n;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lf6/a0;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lf6/a0;->a(I)Lf6/Z;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, Lf6/Z;->d:[LE5/T;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    aget-object v6, v0, v2

    .line 26
    .line 27
    iget-object v0, v6, LE5/T;->l:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0}, Lu6/k;->f(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    iget-wide v2, p0, Lf6/N;->F:J

    .line 34
    .line 35
    iget-object v0, p0, Lf6/N;->e:LI5/f;

    .line 36
    .line 37
    move-wide v7, v2

    .line 38
    new-instance v3, Lf6/u;

    .line 39
    .line 40
    invoke-virtual {v0, v7, v8}, LI5/f;->a(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v7

    .line 44
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    invoke-direct/range {v3 .. v10}, Lf6/u;-><init>(IILE5/T;JJ)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v3}, LI5/f;->b(Lf6/u;)V

    .line 54
    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    aput-boolean v0, v1, p1

    .line 58
    .line 59
    :cond_0
    return-void
.end method

.method public final w(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lf6/N;->k()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lf6/N;->w:LS3/n;

    .line 5
    .line 6
    iget-object v0, v0, LS3/n;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, [Z

    .line 9
    .line 10
    iget-boolean v1, p0, Lf6/N;->H:Z

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    aget-boolean v0, v0, p1

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, Lf6/N;->r:[Lf6/U;

    .line 19
    .line 20
    aget-object p1, v0, p1

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p1, v0}, Lf6/U;->l(Z)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    const-wide/16 v1, 0x0

    .line 31
    .line 32
    iput-wide v1, p0, Lf6/N;->G:J

    .line 33
    .line 34
    iput-boolean v0, p0, Lf6/N;->H:Z

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    iput-boolean p1, p0, Lf6/N;->C:Z

    .line 38
    .line 39
    iput-wide v1, p0, Lf6/N;->F:J

    .line 40
    .line 41
    iput v0, p0, Lf6/N;->I:I

    .line 42
    .line 43
    iget-object p1, p0, Lf6/N;->r:[Lf6/U;

    .line 44
    .line 45
    array-length v1, p1

    .line 46
    move v2, v0

    .line 47
    :goto_0
    if-ge v2, v1, :cond_1

    .line 48
    .line 49
    aget-object v3, p1, v2

    .line 50
    .line 51
    invoke-virtual {v3, v0}, Lf6/U;->o(Z)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    iget-object p1, p0, Lf6/N;->p:Lf6/v;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-interface {p1, p0}, Lf6/v;->b(Lf6/W;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    :goto_1
    return-void
.end method

.method public final x(LJ5/t;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lf6/N;->o:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, Lcom/applovin/impl/sdk/nativeAd/e;

    .line 4
    .line 5
    const/16 v2, 0x11

    .line 6
    .line 7
    invoke-direct {v1, v2, p0, p1}, Lcom/applovin/impl/sdk/nativeAd/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final y([Lr6/n;[Z[Lf6/V;[ZJ)J
    .locals 8

    .line 1
    invoke-virtual {p0}, Lf6/N;->k()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lf6/N;->w:LS3/n;

    .line 5
    .line 6
    iget-object v1, v0, LS3/n;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lf6/a0;

    .line 9
    .line 10
    iget-object v0, v0, LS3/n;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, [Z

    .line 13
    .line 14
    iget v2, p0, Lf6/N;->D:I

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    move v4, v3

    .line 18
    :goto_0
    array-length v5, p1

    .line 19
    const/4 v6, 0x1

    .line 20
    if-ge v4, v5, :cond_2

    .line 21
    .line 22
    aget-object v5, p3, v4

    .line 23
    .line 24
    if-eqz v5, :cond_1

    .line 25
    .line 26
    aget-object v7, p1, v4

    .line 27
    .line 28
    if-eqz v7, :cond_0

    .line 29
    .line 30
    aget-boolean v7, p2, v4

    .line 31
    .line 32
    if-nez v7, :cond_1

    .line 33
    .line 34
    :cond_0
    check-cast v5, Lf6/L;

    .line 35
    .line 36
    iget v5, v5, Lf6/L;->a:I

    .line 37
    .line 38
    aget-boolean v7, v0, v5

    .line 39
    .line 40
    invoke-static {v7}, Lu6/a;->i(Z)V

    .line 41
    .line 42
    .line 43
    iget v7, p0, Lf6/N;->D:I

    .line 44
    .line 45
    sub-int/2addr v7, v6

    .line 46
    iput v7, p0, Lf6/N;->D:I

    .line 47
    .line 48
    aput-boolean v3, v0, v5

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    aput-object v5, p3, v4

    .line 52
    .line 53
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    iget-boolean p2, p0, Lf6/N;->B:Z

    .line 57
    .line 58
    if-eqz p2, :cond_4

    .line 59
    .line 60
    if-nez v2, :cond_3

    .line 61
    .line 62
    :goto_1
    move p2, v6

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    move p2, v3

    .line 65
    goto :goto_2

    .line 66
    :cond_4
    const-wide/16 v4, 0x0

    .line 67
    .line 68
    cmp-long p2, p5, v4

    .line 69
    .line 70
    if-eqz p2, :cond_3

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :goto_2
    move v2, v3

    .line 74
    :goto_3
    array-length v4, p1

    .line 75
    if-ge v2, v4, :cond_a

    .line 76
    .line 77
    aget-object v4, p3, v2

    .line 78
    .line 79
    if-nez v4, :cond_9

    .line 80
    .line 81
    aget-object v4, p1, v2

    .line 82
    .line 83
    if-eqz v4, :cond_9

    .line 84
    .line 85
    invoke-interface {v4}, Lr6/n;->length()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-ne v5, v6, :cond_5

    .line 90
    .line 91
    move v5, v6

    .line 92
    goto :goto_4

    .line 93
    :cond_5
    move v5, v3

    .line 94
    :goto_4
    invoke-static {v5}, Lu6/a;->i(Z)V

    .line 95
    .line 96
    .line 97
    invoke-interface {v4, v3}, Lr6/n;->c(I)I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-nez v5, :cond_6

    .line 102
    .line 103
    move v5, v6

    .line 104
    goto :goto_5

    .line 105
    :cond_6
    move v5, v3

    .line 106
    :goto_5
    invoke-static {v5}, Lu6/a;->i(Z)V

    .line 107
    .line 108
    .line 109
    invoke-interface {v4}, Lr6/n;->g()Lf6/Z;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    iget-object v5, v1, Lf6/a0;->b:Ll8/e0;

    .line 114
    .line 115
    invoke-virtual {v5, v4}, Ll8/K;->indexOf(Ljava/lang/Object;)I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-ltz v4, :cond_7

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_7
    const/4 v4, -0x1

    .line 123
    :goto_6
    aget-boolean v5, v0, v4

    .line 124
    .line 125
    xor-int/2addr v5, v6

    .line 126
    invoke-static {v5}, Lu6/a;->i(Z)V

    .line 127
    .line 128
    .line 129
    iget v5, p0, Lf6/N;->D:I

    .line 130
    .line 131
    add-int/2addr v5, v6

    .line 132
    iput v5, p0, Lf6/N;->D:I

    .line 133
    .line 134
    aput-boolean v6, v0, v4

    .line 135
    .line 136
    new-instance v5, Lf6/L;

    .line 137
    .line 138
    invoke-direct {v5, p0, v4}, Lf6/L;-><init>(Lf6/N;I)V

    .line 139
    .line 140
    .line 141
    aput-object v5, p3, v2

    .line 142
    .line 143
    aput-boolean v6, p4, v2

    .line 144
    .line 145
    if-nez p2, :cond_9

    .line 146
    .line 147
    iget-object p2, p0, Lf6/N;->r:[Lf6/U;

    .line 148
    .line 149
    aget-object p2, p2, v4

    .line 150
    .line 151
    invoke-virtual {p2, p5, p6, v6}, Lf6/U;->q(JZ)Z

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    if-nez v4, :cond_8

    .line 156
    .line 157
    iget v4, p2, Lf6/U;->q:I

    .line 158
    .line 159
    iget p2, p2, Lf6/U;->s:I

    .line 160
    .line 161
    add-int/2addr v4, p2

    .line 162
    if-eqz v4, :cond_8

    .line 163
    .line 164
    move p2, v6

    .line 165
    goto :goto_7

    .line 166
    :cond_8
    move p2, v3

    .line 167
    :cond_9
    :goto_7
    add-int/lit8 v2, v2, 0x1

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_a
    iget p1, p0, Lf6/N;->D:I

    .line 171
    .line 172
    if-nez p1, :cond_d

    .line 173
    .line 174
    iput-boolean v3, p0, Lf6/N;->H:Z

    .line 175
    .line 176
    iput-boolean v3, p0, Lf6/N;->C:Z

    .line 177
    .line 178
    iget-object p1, p0, Lf6/N;->j:Lt6/E;

    .line 179
    .line 180
    invoke-virtual {p1}, Lt6/E;->a()Z

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    if-eqz p2, :cond_c

    .line 185
    .line 186
    iget-object p2, p0, Lf6/N;->r:[Lf6/U;

    .line 187
    .line 188
    array-length p3, p2

    .line 189
    move p4, v3

    .line 190
    :goto_8
    if-ge p4, p3, :cond_b

    .line 191
    .line 192
    aget-object v0, p2, p4

    .line 193
    .line 194
    invoke-virtual {v0}, Lf6/U;->g()V

    .line 195
    .line 196
    .line 197
    add-int/lit8 p4, p4, 0x1

    .line 198
    .line 199
    goto :goto_8

    .line 200
    :cond_b
    iget-object p1, p1, Lt6/E;->b:Lt6/C;

    .line 201
    .line 202
    invoke-static {p1}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1, v3}, Lt6/C;->a(Z)V

    .line 206
    .line 207
    .line 208
    goto :goto_b

    .line 209
    :cond_c
    iget-object p1, p0, Lf6/N;->r:[Lf6/U;

    .line 210
    .line 211
    array-length p2, p1

    .line 212
    move p3, v3

    .line 213
    :goto_9
    if-ge p3, p2, :cond_f

    .line 214
    .line 215
    aget-object p4, p1, p3

    .line 216
    .line 217
    invoke-virtual {p4, v3}, Lf6/U;->o(Z)V

    .line 218
    .line 219
    .line 220
    add-int/lit8 p3, p3, 0x1

    .line 221
    .line 222
    goto :goto_9

    .line 223
    :cond_d
    if-eqz p2, :cond_f

    .line 224
    .line 225
    invoke-virtual {p0, p5, p6}, Lf6/N;->d(J)J

    .line 226
    .line 227
    .line 228
    move-result-wide p5

    .line 229
    :goto_a
    array-length p1, p3

    .line 230
    if-ge v3, p1, :cond_f

    .line 231
    .line 232
    aget-object p1, p3, v3

    .line 233
    .line 234
    if-eqz p1, :cond_e

    .line 235
    .line 236
    aput-boolean v6, p4, v3

    .line 237
    .line 238
    :cond_e
    add-int/lit8 v3, v3, 0x1

    .line 239
    .line 240
    goto :goto_a

    .line 241
    :cond_f
    :goto_b
    iput-boolean v6, p0, Lf6/N;->B:Z

    .line 242
    .line 243
    return-wide p5
.end method

.method public final z(J)Z
    .locals 0

    .line 1
    iget-boolean p1, p0, Lf6/N;->J:Z

    .line 2
    .line 3
    if-nez p1, :cond_3

    .line 4
    .line 5
    iget-object p1, p0, Lf6/N;->j:Lt6/E;

    .line 6
    .line 7
    iget-object p2, p1, Lt6/E;->c:Ljava/io/IOException;

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-boolean p2, p0, Lf6/N;->H:Z

    .line 13
    .line 14
    if-nez p2, :cond_3

    .line 15
    .line 16
    iget-boolean p2, p0, Lf6/N;->u:Z

    .line 17
    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    iget p2, p0, Lf6/N;->D:I

    .line 21
    .line 22
    if-nez p2, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object p2, p0, Lf6/N;->l:Ls8/b;

    .line 26
    .line 27
    invoke-virtual {p2}, Ls8/b;->e()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-virtual {p1}, Lt6/E;->a()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Lf6/N;->B()V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    return p1

    .line 42
    :cond_2
    return p2

    .line 43
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 44
    return p1
.end method
