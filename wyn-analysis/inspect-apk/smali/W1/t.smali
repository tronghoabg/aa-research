.class public final LW1/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final j0:Ljava/lang/Object;

.field public static k0:Ljava/util/concurrent/ScheduledExecutorService;

.field public static l0:I


# instance fields
.field public A:LW1/o;

.field public B:LW1/o;

.field public C:LN1/F;

.field public D:Z

.field public E:Ljava/nio/ByteBuffer;

.field public F:I

.field public G:J

.field public H:J

.field public I:J

.field public J:J

.field public K:I

.field public L:Z

.field public M:Z

.field public N:J

.field public O:F

.field public P:Ljava/nio/ByteBuffer;

.field public Q:I

.field public R:Ljava/nio/ByteBuffer;

.field public S:Z

.field public T:Z

.field public U:Z

.field public V:Z

.field public W:Z

.field public X:I

.field public Y:LN1/d;

.field public Z:LY9/c;

.field public final a:Landroid/content/Context;

.field public a0:Z

.field public final b:Lb7/k;

.field public b0:J

.field public final c:LW1/m;

.field public c0:J

.field public final d:LW1/z;

.field public d0:Z

.field public final e:Ll8/e0;

.field public e0:Z

.field public final f:Ll8/e0;

.field public f0:Landroid/os/Looper;

.field public final g:LW1/l;

.field public g0:J

.field public final h:Ljava/util/ArrayDeque;

.field public h0:J

.field public final i:Z

.field public i0:Landroid/os/Handler;

.field public j:I

.field public k:LG9/e;

.field public final l:LW1/r;

.field public final m:LW1/r;

.field public final n:LW1/u;

.field public final o:LS3/c;

.field public final p:LW1/u;

.field public q:LV1/k;

.field public r:Lxa/d;

.field public s:LW1/n;

.field public t:LW1/n;

.field public u:LO1/a;

.field public v:Landroid/media/AudioTrack;

.field public w:LW1/b;

.field public x:LJ9/o;

.field public y:LDd/c;

.field public z:LN1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LW1/t;->j0:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(LK8/H;)V
    .locals 8

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v2, p1, LK8/H;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, Landroid/content/Context;

    .line 9
    .line 10
    iput-object v2, p0, LW1/t;->a:Landroid/content/Context;

    .line 11
    .line 12
    sget-object v3, LN1/c;->e:LN1/c;

    .line 13
    .line 14
    iput-object v3, p0, LW1/t;->z:LN1/c;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    sget-object v4, LW1/b;->c:LW1/b;

    .line 19
    .line 20
    sget v4, LQ1/x;->a:I

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-static {v2, v3, v4}, LW1/b;->b(Landroid/content/Context;LN1/c;LY9/c;)LW1/b;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v2, p1, LK8/H;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, LW1/b;

    .line 31
    .line 32
    :goto_0
    iput-object v2, p0, LW1/t;->w:LW1/b;

    .line 33
    .line 34
    iget-object v2, p1, LK8/H;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lb7/k;

    .line 37
    .line 38
    iput-object v2, p0, LW1/t;->b:Lb7/k;

    .line 39
    .line 40
    sget v2, LQ1/x;->a:I

    .line 41
    .line 42
    iput-boolean v1, p0, LW1/t;->i:Z

    .line 43
    .line 44
    iput v1, p0, LW1/t;->j:I

    .line 45
    .line 46
    iget-object v2, p1, LK8/H;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, LW1/u;

    .line 49
    .line 50
    iput-object v2, p0, LW1/t;->n:LW1/u;

    .line 51
    .line 52
    iget-object v2, p1, LK8/H;->g:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, LS3/c;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iput-object v2, p0, LW1/t;->o:LS3/c;

    .line 60
    .line 61
    new-instance v2, LW1/l;

    .line 62
    .line 63
    new-instance v3, LA/e0;

    .line 64
    .line 65
    const/16 v4, 0x16

    .line 66
    .line 67
    invoke-direct {v3, p0, v4}, LA/e0;-><init>(Ljava/lang/Object;I)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v2, v3}, LW1/l;-><init>(LA/e0;)V

    .line 71
    .line 72
    .line 73
    iput-object v2, p0, LW1/t;->g:LW1/l;

    .line 74
    .line 75
    new-instance v2, LW1/m;

    .line 76
    .line 77
    invoke-direct {v2}, LO1/e;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object v2, p0, LW1/t;->c:LW1/m;

    .line 81
    .line 82
    new-instance v3, LW1/z;

    .line 83
    .line 84
    invoke-direct {v3}, LO1/e;-><init>()V

    .line 85
    .line 86
    .line 87
    sget-object v4, LQ1/x;->f:[B

    .line 88
    .line 89
    iput-object v4, v3, LW1/z;->m:[B

    .line 90
    .line 91
    iput-object v3, p0, LW1/t;->d:LW1/z;

    .line 92
    .line 93
    new-instance v4, LO1/h;

    .line 94
    .line 95
    invoke-direct {v4}, LO1/e;-><init>()V

    .line 96
    .line 97
    .line 98
    sget-object v5, Ll8/K;->b:Ll8/I;

    .line 99
    .line 100
    new-array v5, v0, [Ljava/lang/Object;

    .line 101
    .line 102
    aput-object v4, v5, v1

    .line 103
    .line 104
    const/4 v4, 0x1

    .line 105
    aput-object v2, v5, v4

    .line 106
    .line 107
    const/4 v2, 0x2

    .line 108
    aput-object v3, v5, v2

    .line 109
    .line 110
    invoke-static {v0, v5}, Ll8/s;->b(I[Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v0, v5}, Ll8/K;->h(I[Ljava/lang/Object;)Ll8/e0;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iput-object v0, p0, LW1/t;->e:Ll8/e0;

    .line 118
    .line 119
    new-instance v0, LW1/y;

    .line 120
    .line 121
    invoke-direct {v0}, LO1/e;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-static {v0}, Ll8/K;->n(Ljava/lang/Object;)Ll8/e0;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iput-object v0, p0, LW1/t;->f:Ll8/e0;

    .line 129
    .line 130
    const/high16 v0, 0x3f800000    # 1.0f

    .line 131
    .line 132
    iput v0, p0, LW1/t;->O:F

    .line 133
    .line 134
    iput v1, p0, LW1/t;->X:I

    .line 135
    .line 136
    new-instance v0, LN1/d;

    .line 137
    .line 138
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 139
    .line 140
    .line 141
    iput-object v0, p0, LW1/t;->Y:LN1/d;

    .line 142
    .line 143
    new-instance v2, LW1/o;

    .line 144
    .line 145
    sget-object v3, LN1/F;->d:LN1/F;

    .line 146
    .line 147
    const-wide/16 v4, 0x0

    .line 148
    .line 149
    const-wide/16 v6, 0x0

    .line 150
    .line 151
    invoke-direct/range {v2 .. v7}, LW1/o;-><init>(LN1/F;JJ)V

    .line 152
    .line 153
    .line 154
    iput-object v2, p0, LW1/t;->B:LW1/o;

    .line 155
    .line 156
    iput-object v3, p0, LW1/t;->C:LN1/F;

    .line 157
    .line 158
    iput-boolean v1, p0, LW1/t;->D:Z

    .line 159
    .line 160
    new-instance v0, Ljava/util/ArrayDeque;

    .line 161
    .line 162
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 163
    .line 164
    .line 165
    iput-object v0, p0, LW1/t;->h:Ljava/util/ArrayDeque;

    .line 166
    .line 167
    new-instance v0, LW1/r;

    .line 168
    .line 169
    invoke-direct {v0}, LW1/r;-><init>()V

    .line 170
    .line 171
    .line 172
    iput-object v0, p0, LW1/t;->l:LW1/r;

    .line 173
    .line 174
    new-instance v0, LW1/r;

    .line 175
    .line 176
    invoke-direct {v0}, LW1/r;-><init>()V

    .line 177
    .line 178
    .line 179
    iput-object v0, p0, LW1/t;->m:LW1/r;

    .line 180
    .line 181
    iget-object p1, p1, LK8/H;->f:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p1, LW1/u;

    .line 184
    .line 185
    iput-object p1, p0, LW1/t;->p:LW1/u;

    .line 186
    .line 187
    return-void
.end method

.method public static p(Landroid/media/AudioTrack;)Z
    .locals 2

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
    invoke-static {p0}, LG5/d;->z(Landroid/media/AudioTrack;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method


# virtual methods
.method public final a(J)V
    .locals 8

    .line 1
    invoke-virtual {p0}, LW1/t;->x()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, LW1/t;->b:Lb7/k;

    .line 6
    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iget-boolean v0, p0, LW1/t;->a0:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, LW1/t;->t:LW1/n;

    .line 14
    .line 15
    iget v2, v0, LW1/n;->c:I

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    iget-object v0, v0, LW1/n;->a:LN1/n;

    .line 20
    .line 21
    iget v0, v0, LN1/n;->E:I

    .line 22
    .line 23
    iget-object v0, p0, LW1/t;->C:LN1/F;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget v2, v0, LN1/F;->a:F

    .line 29
    .line 30
    iget-object v3, v1, Lb7/k;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, LO1/g;

    .line 33
    .line 34
    iget v4, v3, LO1/g;->c:F

    .line 35
    .line 36
    cmpl-float v4, v4, v2

    .line 37
    .line 38
    const/4 v5, 0x1

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    iput v2, v3, LO1/g;->c:F

    .line 42
    .line 43
    iput-boolean v5, v3, LO1/g;->i:Z

    .line 44
    .line 45
    :cond_0
    iget v2, v3, LO1/g;->d:F

    .line 46
    .line 47
    iget v4, v0, LN1/F;->b:F

    .line 48
    .line 49
    cmpl-float v2, v2, v4

    .line 50
    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    iput v4, v3, LO1/g;->d:F

    .line 54
    .line 55
    iput-boolean v5, v3, LO1/g;->i:Z

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    sget-object v0, LN1/F;->d:LN1/F;

    .line 59
    .line 60
    :cond_2
    :goto_0
    iput-object v0, p0, LW1/t;->C:LN1/F;

    .line 61
    .line 62
    :goto_1
    move-object v3, v0

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    sget-object v0, LN1/F;->d:LN1/F;

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :goto_2
    iget-boolean v0, p0, LW1/t;->a0:Z

    .line 68
    .line 69
    if-nez v0, :cond_4

    .line 70
    .line 71
    iget-object v0, p0, LW1/t;->t:LW1/n;

    .line 72
    .line 73
    iget v2, v0, LW1/n;->c:I

    .line 74
    .line 75
    if-nez v2, :cond_4

    .line 76
    .line 77
    iget-object v0, v0, LW1/n;->a:LN1/n;

    .line 78
    .line 79
    iget v0, v0, LN1/n;->E:I

    .line 80
    .line 81
    iget-boolean v0, p0, LW1/t;->D:Z

    .line 82
    .line 83
    iget-object v1, v1, Lb7/k;->c:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, LW1/x;

    .line 86
    .line 87
    iput-boolean v0, v1, LW1/x;->o:Z

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    const/4 v0, 0x0

    .line 91
    :goto_3
    iput-boolean v0, p0, LW1/t;->D:Z

    .line 92
    .line 93
    iget-object v0, p0, LW1/t;->h:Ljava/util/ArrayDeque;

    .line 94
    .line 95
    new-instance v2, LW1/o;

    .line 96
    .line 97
    const-wide/16 v4, 0x0

    .line 98
    .line 99
    invoke-static {v4, v5, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 100
    .line 101
    .line 102
    move-result-wide v4

    .line 103
    iget-object p1, p0, LW1/t;->t:LW1/n;

    .line 104
    .line 105
    invoke-virtual {p0}, LW1/t;->k()J

    .line 106
    .line 107
    .line 108
    move-result-wide v6

    .line 109
    iget p1, p1, LW1/n;->e:I

    .line 110
    .line 111
    invoke-static {p1, v6, v7}, LQ1/x;->Q(IJ)J

    .line 112
    .line 113
    .line 114
    move-result-wide v6

    .line 115
    invoke-direct/range {v2 .. v7}, LW1/o;-><init>(LN1/F;JJ)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    iget-object p1, p0, LW1/t;->t:LW1/n;

    .line 122
    .line 123
    iget-object p1, p1, LW1/n;->i:LO1/a;

    .line 124
    .line 125
    iput-object p1, p0, LW1/t;->u:LO1/a;

    .line 126
    .line 127
    invoke-virtual {p1}, LO1/a;->b()V

    .line 128
    .line 129
    .line 130
    iget-object p1, p0, LW1/t;->r:Lxa/d;

    .line 131
    .line 132
    if-eqz p1, :cond_5

    .line 133
    .line 134
    iget-boolean p2, p0, LW1/t;->D:Z

    .line 135
    .line 136
    iget-object p1, p1, Lxa/d;->b:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p1, LW1/v;

    .line 139
    .line 140
    iget-object p1, p1, LW1/v;->D0:LS3/s;

    .line 141
    .line 142
    iget-object v0, p1, LS3/s;->b:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v0, Landroid/os/Handler;

    .line 145
    .line 146
    if-eqz v0, :cond_5

    .line 147
    .line 148
    new-instance v1, LG5/o;

    .line 149
    .line 150
    const/4 v2, 0x1

    .line 151
    invoke-direct {v1, v2, p1, p2}, LG5/o;-><init>(ILjava/lang/Object;Z)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 155
    .line 156
    .line 157
    :cond_5
    return-void
.end method

.method public final b(LW1/g;LN1/c;ILN1/n;)Landroid/media/AudioTrack;
    .locals 9

    .line 1
    :try_start_0
    iget-object v0, p0, LW1/t;->p:LW1/u;
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3

    .line 2
    .line 3
    :try_start_1
    invoke-virtual {v0, p1, p2, p3}, LW1/u;->a(LW1/g;LN1/c;I)Landroid/media/AudioTrack;

    .line 4
    .line 5
    .line 6
    move-result-object p2
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 7
    invoke-virtual {p2}, Landroid/media/AudioTrack;->getState()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 p3, 0x1

    .line 12
    if-ne v1, p3, :cond_0

    .line 13
    .line 14
    return-object p2

    .line 15
    :cond_0
    :try_start_2
    invoke-virtual {p2}, Landroid/media/AudioTrack;->release()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 16
    .line 17
    .line 18
    :catch_0
    new-instance v0, LW1/i;

    .line 19
    .line 20
    iget v3, p1, LW1/g;->e:I

    .line 21
    .line 22
    iget v4, p1, LW1/g;->b:I

    .line 23
    .line 24
    iget v2, p1, LW1/g;->c:I

    .line 25
    .line 26
    iget-boolean v6, p1, LW1/g;->d:Z

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    move-object v5, p4

    .line 30
    invoke-direct/range {v0 .. v7}, LW1/i;-><init>(IIIILN1/n;ZLjava/lang/RuntimeException;)V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :catch_1
    move-exception v0

    .line 35
    goto :goto_1

    .line 36
    :goto_0
    move-object v8, p2

    .line 37
    goto :goto_2

    .line 38
    :catch_2
    move-exception v0

    .line 39
    goto :goto_1

    .line 40
    :catch_3
    move-exception v0

    .line 41
    :goto_1
    move-object v5, p4

    .line 42
    move-object p2, v0

    .line 43
    goto :goto_0

    .line 44
    :catch_4
    move-exception v0

    .line 45
    goto :goto_1

    .line 46
    :goto_2
    new-instance v1, LW1/i;

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    iget v4, p1, LW1/g;->e:I

    .line 50
    .line 51
    iget v3, p1, LW1/g;->c:I

    .line 52
    .line 53
    move-object v6, v5

    .line 54
    iget v5, p1, LW1/g;->b:I

    .line 55
    .line 56
    iget-boolean v7, p1, LW1/g;->d:Z

    .line 57
    .line 58
    invoke-direct/range {v1 .. v8}, LW1/i;-><init>(IIIILN1/n;ZLjava/lang/RuntimeException;)V

    .line 59
    .line 60
    .line 61
    throw v1
.end method

.method public final c(LW1/n;)Landroid/media/AudioTrack;
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p1}, LW1/n;->a()LW1/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LW1/t;->z:LN1/c;

    .line 6
    .line 7
    iget v2, p0, LW1/t;->X:I

    .line 8
    .line 9
    iget-object p1, p1, LW1/n;->a:LN1/n;

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1, v2, p1}, LW1/t;->b(LW1/g;LN1/c;ILN1/n;)Landroid/media/AudioTrack;

    .line 12
    .line 13
    .line 14
    move-result-object p1
    :try_end_0
    .catch LW1/i; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return-object p1

    .line 16
    :catch_0
    move-exception p1

    .line 17
    iget-object v0, p0, LW1/t;->r:Lxa/d;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lxa/d;->A(Ljava/lang/Exception;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    throw p1
.end method

.method public final d(LN1/n;[I)V
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    invoke-virtual {v1}, LW1/t;->q()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v3, LN1/n;->n:Ljava/lang/String;

    .line 9
    .line 10
    const-string v2, "audio/raw"

    .line 11
    .line 12
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v4, v1, LW1/t;->i:Z

    .line 17
    .line 18
    const/4 v5, 0x1

    .line 19
    const/4 v6, -0x1

    .line 20
    iget-object v8, v3, LN1/n;->n:Ljava/lang/String;

    .line 21
    .line 22
    iget v9, v3, LN1/n;->D:I

    .line 23
    .line 24
    iget v10, v3, LN1/n;->C:I

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget v0, v3, LN1/n;->E:I

    .line 29
    .line 30
    invoke-static {v0}, LQ1/x;->F(I)Z

    .line 31
    .line 32
    .line 33
    move-result v11

    .line 34
    invoke-static {v11}, LQ1/k;->c(Z)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v10}, LQ1/x;->z(II)I

    .line 38
    .line 39
    .line 40
    move-result v11

    .line 41
    new-instance v12, Ll8/H;

    .line 42
    .line 43
    const/4 v13, 0x4

    .line 44
    invoke-direct {v12, v13}, Ll8/E;-><init>(I)V

    .line 45
    .line 46
    .line 47
    iget-object v13, v1, LW1/t;->e:Ll8/e0;

    .line 48
    .line 49
    invoke-virtual {v12, v13}, Ll8/E;->d(Ljava/lang/Iterable;)V

    .line 50
    .line 51
    .line 52
    iget-object v13, v1, LW1/t;->b:Lb7/k;

    .line 53
    .line 54
    iget-object v13, v13, Lb7/k;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v13, [LO1/d;

    .line 57
    .line 58
    invoke-virtual {v12, v13}, Ll8/E;->b([Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-instance v13, LO1/a;

    .line 62
    .line 63
    invoke-virtual {v12}, Ll8/H;->g()Ll8/e0;

    .line 64
    .line 65
    .line 66
    move-result-object v12

    .line 67
    invoke-direct {v13, v12}, LO1/a;-><init>(Ll8/e0;)V

    .line 68
    .line 69
    .line 70
    iget-object v12, v1, LW1/t;->u:LO1/a;

    .line 71
    .line 72
    invoke-virtual {v13, v12}, LO1/a;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v12

    .line 76
    if-eqz v12, :cond_0

    .line 77
    .line 78
    iget-object v13, v1, LW1/t;->u:LO1/a;

    .line 79
    .line 80
    :cond_0
    iget v12, v3, LN1/n;->F:I

    .line 81
    .line 82
    iget-object v14, v1, LW1/t;->d:LW1/z;

    .line 83
    .line 84
    iput v12, v14, LW1/z;->i:I

    .line 85
    .line 86
    iget v12, v3, LN1/n;->G:I

    .line 87
    .line 88
    iput v12, v14, LW1/z;->j:I

    .line 89
    .line 90
    iget-object v12, v1, LW1/t;->c:LW1/m;

    .line 91
    .line 92
    move-object/from16 v14, p2

    .line 93
    .line 94
    iput-object v14, v12, LW1/m;->i:[I

    .line 95
    .line 96
    new-instance v12, LO1/b;

    .line 97
    .line 98
    invoke-direct {v12, v9, v10, v0}, LO1/b;-><init>(III)V

    .line 99
    .line 100
    .line 101
    :try_start_0
    invoke-virtual {v13, v12}, LO1/a;->a(LO1/b;)LO1/b;

    .line 102
    .line 103
    .line 104
    move-result-object v0
    :try_end_0
    .catch LO1/c; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    iget v9, v0, LO1/b;->b:I

    .line 106
    .line 107
    invoke-static {v9}, LQ1/x;->q(I)I

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    iget v12, v0, LO1/b;->c:I

    .line 112
    .line 113
    invoke-static {v12, v9}, LQ1/x;->z(II)I

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    iget v0, v0, LO1/b;->a:I

    .line 118
    .line 119
    move v14, v9

    .line 120
    move v9, v0

    .line 121
    move v0, v14

    .line 122
    move v14, v12

    .line 123
    move v12, v4

    .line 124
    move v4, v11

    .line 125
    move v11, v14

    .line 126
    move-object v14, v13

    .line 127
    const/4 v13, 0x0

    .line 128
    const/4 v15, 0x0

    .line 129
    goto :goto_1

    .line 130
    :catch_0
    move-exception v0

    .line 131
    new-instance v2, LW1/h;

    .line 132
    .line 133
    invoke-direct {v2, v0, v3}, LW1/h;-><init>(LO1/c;LN1/n;)V

    .line 134
    .line 135
    .line 136
    throw v2

    .line 137
    :cond_1
    new-instance v13, LO1/a;

    .line 138
    .line 139
    sget-object v0, Ll8/e0;->e:Ll8/e0;

    .line 140
    .line 141
    invoke-direct {v13, v0}, LO1/a;-><init>(Ll8/e0;)V

    .line 142
    .line 143
    .line 144
    iget v0, v1, LW1/t;->j:I

    .line 145
    .line 146
    if-eqz v0, :cond_2

    .line 147
    .line 148
    invoke-virtual/range {p0 .. p1}, LW1/t;->h(LN1/n;)LW1/e;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    goto :goto_0

    .line 153
    :cond_2
    sget-object v0, LW1/e;->d:LW1/e;

    .line 154
    .line 155
    :goto_0
    iget v11, v1, LW1/t;->j:I

    .line 156
    .line 157
    if-eqz v11, :cond_3

    .line 158
    .line 159
    iget-boolean v11, v0, LW1/e;->a:Z

    .line 160
    .line 161
    if-eqz v11, :cond_3

    .line 162
    .line 163
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    iget-object v4, v3, LN1/n;->k:Ljava/lang/String;

    .line 167
    .line 168
    invoke-static {v8, v4}, LN1/C;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    move-result v12

    .line 172
    invoke-static {v10}, LQ1/x;->q(I)I

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    iget-boolean v0, v0, LW1/e;->b:Z

    .line 177
    .line 178
    move v15, v5

    .line 179
    move v4, v6

    .line 180
    move v11, v12

    .line 181
    move-object v14, v13

    .line 182
    move v13, v0

    .line 183
    move v12, v15

    .line 184
    move v0, v4

    .line 185
    goto :goto_1

    .line 186
    :cond_3
    iget-object v0, v1, LW1/t;->w:LW1/b;

    .line 187
    .line 188
    iget-object v10, v1, LW1/t;->z:LN1/c;

    .line 189
    .line 190
    invoke-virtual {v0, v10, v3}, LW1/b;->d(LN1/c;LN1/n;)Landroid/util/Pair;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    if-eqz v0, :cond_11

    .line 195
    .line 196
    iget-object v10, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v10, Ljava/lang/Integer;

    .line 199
    .line 200
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 201
    .line 202
    .line 203
    move-result v12

    .line 204
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v0, Ljava/lang/Integer;

    .line 207
    .line 208
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    move v0, v6

    .line 213
    move v11, v12

    .line 214
    move-object v14, v13

    .line 215
    const/4 v13, 0x0

    .line 216
    const/4 v15, 0x2

    .line 217
    move v12, v4

    .line 218
    move v4, v0

    .line 219
    :goto_1
    const-string v7, ") for: "

    .line 220
    .line 221
    if-eqz v11, :cond_10

    .line 222
    .line 223
    if-eqz v10, :cond_f

    .line 224
    .line 225
    const-string v7, "audio/vnd.dts.hd;profile=lbr"

    .line 226
    .line 227
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v7

    .line 231
    iget v8, v3, LN1/n;->j:I

    .line 232
    .line 233
    if-eqz v7, :cond_4

    .line 234
    .line 235
    if-ne v8, v6, :cond_4

    .line 236
    .line 237
    const v8, 0xbb800

    .line 238
    .line 239
    .line 240
    :cond_4
    invoke-static {v9, v10, v11}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    .line 241
    .line 242
    .line 243
    move-result v7

    .line 244
    const/4 v2, -0x2

    .line 245
    if-eq v7, v2, :cond_5

    .line 246
    .line 247
    move v2, v5

    .line 248
    goto :goto_2

    .line 249
    :cond_5
    const/4 v2, 0x0

    .line 250
    :goto_2
    invoke-static {v2}, LQ1/k;->g(Z)V

    .line 251
    .line 252
    .line 253
    if-eq v0, v6, :cond_6

    .line 254
    .line 255
    move v2, v0

    .line 256
    goto :goto_3

    .line 257
    :cond_6
    move v2, v5

    .line 258
    :goto_3
    if-eqz v12, :cond_7

    .line 259
    .line 260
    const-wide/high16 v17, 0x4020000000000000L    # 8.0

    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_7
    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    .line 264
    .line 265
    :goto_4
    iget-object v6, v1, LW1/t;->n:LW1/u;

    .line 266
    .line 267
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    const-wide/32 v19, 0xf4240

    .line 271
    .line 272
    .line 273
    if-eqz v15, :cond_d

    .line 274
    .line 275
    if-eq v15, v5, :cond_c

    .line 276
    .line 277
    move/from16 v21, v5

    .line 278
    .line 279
    const/4 v5, 0x2

    .line 280
    if-ne v15, v5, :cond_b

    .line 281
    .line 282
    const/4 v5, 0x5

    .line 283
    const/16 v6, 0x8

    .line 284
    .line 285
    if-ne v11, v5, :cond_8

    .line 286
    .line 287
    const v5, 0x7a120

    .line 288
    .line 289
    .line 290
    :goto_5
    const/4 v6, -0x1

    .line 291
    goto :goto_6

    .line 292
    :cond_8
    if-ne v11, v6, :cond_9

    .line 293
    .line 294
    const v5, 0xf4240

    .line 295
    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_9
    const v5, 0x3d090

    .line 299
    .line 300
    .line 301
    goto :goto_5

    .line 302
    :goto_6
    if-eq v8, v6, :cond_a

    .line 303
    .line 304
    sget-object v6, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 305
    .line 306
    const/16 v6, 0x8

    .line 307
    .line 308
    invoke-static {v8, v6}, LA6/c;->q(II)I

    .line 309
    .line 310
    .line 311
    move-result v6

    .line 312
    :goto_7
    move v8, v4

    .line 313
    goto :goto_8

    .line 314
    :cond_a
    invoke-static {v11}, LW1/u;->c(I)I

    .line 315
    .line 316
    .line 317
    move-result v6

    .line 318
    goto :goto_7

    .line 319
    :goto_8
    int-to-long v3, v5

    .line 320
    int-to-long v5, v6

    .line 321
    mul-long/2addr v3, v5

    .line 322
    div-long v3, v3, v19

    .line 323
    .line 324
    invoke-static {v3, v4}, LS3/f;->l(J)I

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    :goto_9
    move/from16 v16, v0

    .line 329
    .line 330
    goto :goto_a

    .line 331
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 332
    .line 333
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 334
    .line 335
    .line 336
    throw v0

    .line 337
    :cond_c
    move v8, v4

    .line 338
    move/from16 v21, v5

    .line 339
    .line 340
    invoke-static {v11}, LW1/u;->c(I)I

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    const v4, 0x2faf080

    .line 345
    .line 346
    .line 347
    int-to-long v4, v4

    .line 348
    move-wide/from16 v22, v4

    .line 349
    .line 350
    int-to-long v3, v3

    .line 351
    mul-long v4, v22, v3

    .line 352
    .line 353
    div-long v4, v4, v19

    .line 354
    .line 355
    invoke-static {v4, v5}, LS3/f;->l(J)I

    .line 356
    .line 357
    .line 358
    move-result v3

    .line 359
    goto :goto_9

    .line 360
    :cond_d
    move v8, v4

    .line 361
    move/from16 v21, v5

    .line 362
    .line 363
    mul-int/lit8 v3, v7, 0x4

    .line 364
    .line 365
    const v4, 0x3d090

    .line 366
    .line 367
    .line 368
    int-to-long v4, v4

    .line 369
    move-wide/from16 v22, v4

    .line 370
    .line 371
    int-to-long v4, v9

    .line 372
    mul-long v22, v22, v4

    .line 373
    .line 374
    move-wide/from16 v24, v4

    .line 375
    .line 376
    int-to-long v4, v2

    .line 377
    mul-long v22, v22, v4

    .line 378
    .line 379
    div-long v22, v22, v19

    .line 380
    .line 381
    invoke-static/range {v22 .. v23}, LS3/f;->l(J)I

    .line 382
    .line 383
    .line 384
    move-result v6

    .line 385
    move/from16 v16, v0

    .line 386
    .line 387
    const v0, 0xb71b0

    .line 388
    .line 389
    .line 390
    move-wide/from16 v22, v4

    .line 391
    .line 392
    int-to-long v4, v0

    .line 393
    mul-long v4, v4, v24

    .line 394
    .line 395
    mul-long v4, v4, v22

    .line 396
    .line 397
    div-long v4, v4, v19

    .line 398
    .line 399
    invoke-static {v4, v5}, LS3/f;->l(J)I

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    invoke-static {v3, v6, v0}, LQ1/x;->i(III)I

    .line 404
    .line 405
    .line 406
    move-result v3

    .line 407
    :goto_a
    int-to-double v3, v3

    .line 408
    mul-double v3, v3, v17

    .line 409
    .line 410
    double-to-int v0, v3

    .line 411
    invoke-static {v7, v0}, Ljava/lang/Math;->max(II)I

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    add-int/2addr v0, v2

    .line 416
    add-int/lit8 v0, v0, -0x1

    .line 417
    .line 418
    div-int/2addr v0, v2

    .line 419
    mul-int/2addr v0, v2

    .line 420
    const/4 v2, 0x0

    .line 421
    iput-boolean v2, v1, LW1/t;->d0:Z

    .line 422
    .line 423
    new-instance v2, LW1/n;

    .line 424
    .line 425
    move v7, v9

    .line 426
    move v9, v11

    .line 427
    move-object v11, v14

    .line 428
    iget-boolean v14, v1, LW1/t;->a0:Z

    .line 429
    .line 430
    move-object/from16 v3, p1

    .line 431
    .line 432
    move v4, v8

    .line 433
    move v8, v10

    .line 434
    move v5, v15

    .line 435
    move/from16 v6, v16

    .line 436
    .line 437
    move v10, v0

    .line 438
    invoke-direct/range {v2 .. v14}, LW1/n;-><init>(LN1/n;IIIIIIILO1/a;ZZZ)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v1}, LW1/t;->o()Z

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    if-eqz v0, :cond_e

    .line 446
    .line 447
    iput-object v2, v1, LW1/t;->s:LW1/n;

    .line 448
    .line 449
    return-void

    .line 450
    :cond_e
    iput-object v2, v1, LW1/t;->t:LW1/n;

    .line 451
    .line 452
    return-void

    .line 453
    :cond_f
    move v5, v15

    .line 454
    new-instance v0, LW1/h;

    .line 455
    .line 456
    new-instance v2, Ljava/lang/StringBuilder;

    .line 457
    .line 458
    const-string v4, "Invalid output channel config (mode="

    .line 459
    .line 460
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    invoke-direct {v0, v2, v3}, LW1/h;-><init>(Ljava/lang/String;LN1/n;)V

    .line 477
    .line 478
    .line 479
    throw v0

    .line 480
    :cond_10
    move v5, v15

    .line 481
    new-instance v0, LW1/h;

    .line 482
    .line 483
    new-instance v2, Ljava/lang/StringBuilder;

    .line 484
    .line 485
    const-string v4, "Invalid output encoding (mode="

    .line 486
    .line 487
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    invoke-direct {v0, v2, v3}, LW1/h;-><init>(Ljava/lang/String;LN1/n;)V

    .line 504
    .line 505
    .line 506
    throw v0

    .line 507
    :cond_11
    new-instance v0, LW1/h;

    .line 508
    .line 509
    new-instance v2, Ljava/lang/StringBuilder;

    .line 510
    .line 511
    const-string v4, "Unable to configure passthrough for: "

    .line 512
    .line 513
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    invoke-direct {v0, v2, v3}, LW1/h;-><init>(Ljava/lang/String;LN1/n;)V

    .line 524
    .line 525
    .line 526
    throw v0
.end method

.method public final e(J)V
    .locals 12

    .line 1
    iget-object v0, p0, LW1/t;->R:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_7

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, LW1/t;->m:LW1/r;

    .line 8
    .line 9
    iget-object v1, v0, LW1/r;->c:Ljava/io/Serializable;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/Exception;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    sget-object v1, LW1/t;->j0:Ljava/lang/Object;

    .line 19
    .line 20
    monitor-enter v1

    .line 21
    :try_start_0
    sget v4, LW1/t;->l0:I

    .line 22
    .line 23
    if-lez v4, :cond_2

    .line 24
    .line 25
    move v4, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_2
    move v4, v2

    .line 28
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    if-eqz v4, :cond_3

    .line 30
    .line 31
    goto/16 :goto_7

    .line 32
    .line 33
    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    iget-wide v6, v0, LW1/r;->b:J

    .line 38
    .line 39
    cmp-long v1, v4, v6

    .line 40
    .line 41
    if-gez v1, :cond_4

    .line 42
    .line 43
    goto/16 :goto_7

    .line 44
    .line 45
    :cond_4
    :goto_1
    iget-object v1, p0, LW1/t;->R:Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    iget-boolean v1, p0, LW1/t;->a0:Z

    .line 52
    .line 53
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    if-eqz v1, :cond_d

    .line 59
    .line 60
    cmp-long v1, p1, v10

    .line 61
    .line 62
    if-eqz v1, :cond_5

    .line 63
    .line 64
    move v1, v3

    .line 65
    goto :goto_2

    .line 66
    :cond_5
    move v1, v2

    .line 67
    :goto_2
    invoke-static {v1}, LQ1/k;->g(Z)V

    .line 68
    .line 69
    .line 70
    const-wide/high16 v4, -0x8000000000000000L

    .line 71
    .line 72
    cmp-long v1, p1, v4

    .line 73
    .line 74
    if-nez v1, :cond_6

    .line 75
    .line 76
    iget-wide p1, p0, LW1/t;->b0:J

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_6
    iput-wide p1, p0, LW1/t;->b0:J

    .line 80
    .line 81
    :goto_3
    iget-object v4, p0, LW1/t;->v:Landroid/media/AudioTrack;

    .line 82
    .line 83
    iget-object v5, p0, LW1/t;->R:Ljava/nio/ByteBuffer;

    .line 84
    .line 85
    sget v1, LQ1/x;->a:I

    .line 86
    .line 87
    const/16 v7, 0x1a

    .line 88
    .line 89
    const-wide/16 v8, 0x3e8

    .line 90
    .line 91
    if-lt v1, v7, :cond_7

    .line 92
    .line 93
    const/4 v7, 0x1

    .line 94
    mul-long/2addr v8, p1

    .line 95
    invoke-virtual/range {v4 .. v9}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;IIJ)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    goto :goto_4

    .line 100
    :cond_7
    iget-object v1, p0, LW1/t;->E:Ljava/nio/ByteBuffer;

    .line 101
    .line 102
    if-nez v1, :cond_8

    .line 103
    .line 104
    const/16 v1, 0x10

    .line 105
    .line 106
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    iput-object v1, p0, LW1/t;->E:Ljava/nio/ByteBuffer;

    .line 111
    .line 112
    sget-object v7, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 113
    .line 114
    invoke-virtual {v1, v7}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 115
    .line 116
    .line 117
    iget-object v1, p0, LW1/t;->E:Ljava/nio/ByteBuffer;

    .line 118
    .line 119
    const v7, 0x55550001

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v7}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 123
    .line 124
    .line 125
    :cond_8
    iget v1, p0, LW1/t;->F:I

    .line 126
    .line 127
    if-nez v1, :cond_9

    .line 128
    .line 129
    iget-object v1, p0, LW1/t;->E:Ljava/nio/ByteBuffer;

    .line 130
    .line 131
    const/4 v7, 0x4

    .line 132
    invoke-virtual {v1, v7, v6}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 133
    .line 134
    .line 135
    iget-object v1, p0, LW1/t;->E:Ljava/nio/ByteBuffer;

    .line 136
    .line 137
    const/16 v7, 0x8

    .line 138
    .line 139
    mul-long/2addr p1, v8

    .line 140
    invoke-virtual {v1, v7, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 141
    .line 142
    .line 143
    iget-object p1, p0, LW1/t;->E:Ljava/nio/ByteBuffer;

    .line 144
    .line 145
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 146
    .line 147
    .line 148
    iput v6, p0, LW1/t;->F:I

    .line 149
    .line 150
    :cond_9
    iget-object p1, p0, LW1/t;->E:Ljava/nio/ByteBuffer;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    if-lez p1, :cond_b

    .line 157
    .line 158
    iget-object p2, p0, LW1/t;->E:Ljava/nio/ByteBuffer;

    .line 159
    .line 160
    invoke-virtual {v4, p2, p1, v3}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 161
    .line 162
    .line 163
    move-result p2

    .line 164
    if-gez p2, :cond_a

    .line 165
    .line 166
    iput v2, p0, LW1/t;->F:I

    .line 167
    .line 168
    move p1, p2

    .line 169
    goto :goto_4

    .line 170
    :cond_a
    if-ge p2, p1, :cond_b

    .line 171
    .line 172
    move p1, v2

    .line 173
    goto :goto_4

    .line 174
    :cond_b
    invoke-virtual {v4, v5, v6, v3}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-gez p1, :cond_c

    .line 179
    .line 180
    iput v2, p0, LW1/t;->F:I

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_c
    iget p2, p0, LW1/t;->F:I

    .line 184
    .line 185
    sub-int/2addr p2, p1

    .line 186
    iput p2, p0, LW1/t;->F:I

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_d
    iget-object p1, p0, LW1/t;->v:Landroid/media/AudioTrack;

    .line 190
    .line 191
    iget-object p2, p0, LW1/t;->R:Ljava/nio/ByteBuffer;

    .line 192
    .line 193
    invoke-virtual {p1, p2, v6, v3}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    :goto_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 198
    .line 199
    .line 200
    move-result-wide v4

    .line 201
    iput-wide v4, p0, LW1/t;->c0:J

    .line 202
    .line 203
    const-wide/16 v4, 0x0

    .line 204
    .line 205
    if-gez p1, :cond_15

    .line 206
    .line 207
    sget p2, LQ1/x;->a:I

    .line 208
    .line 209
    const/16 v1, 0x18

    .line 210
    .line 211
    if-lt p2, v1, :cond_e

    .line 212
    .line 213
    const/4 p2, -0x6

    .line 214
    if-eq p1, p2, :cond_f

    .line 215
    .line 216
    :cond_e
    const/16 p2, -0x20

    .line 217
    .line 218
    if-ne p1, p2, :cond_12

    .line 219
    .line 220
    :cond_f
    invoke-virtual {p0}, LW1/t;->k()J

    .line 221
    .line 222
    .line 223
    move-result-wide v6

    .line 224
    cmp-long p2, v6, v4

    .line 225
    .line 226
    if-lez p2, :cond_11

    .line 227
    .line 228
    :cond_10
    :goto_5
    move v2, v3

    .line 229
    goto :goto_6

    .line 230
    :cond_11
    iget-object p2, p0, LW1/t;->v:Landroid/media/AudioTrack;

    .line 231
    .line 232
    invoke-static {p2}, LW1/t;->p(Landroid/media/AudioTrack;)Z

    .line 233
    .line 234
    .line 235
    move-result p2

    .line 236
    if-eqz p2, :cond_12

    .line 237
    .line 238
    iget-object p2, p0, LW1/t;->t:LW1/n;

    .line 239
    .line 240
    iget p2, p2, LW1/n;->c:I

    .line 241
    .line 242
    if-ne p2, v3, :cond_10

    .line 243
    .line 244
    iput-boolean v3, p0, LW1/t;->d0:Z

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_12
    :goto_6
    new-instance p2, LW1/j;

    .line 248
    .line 249
    iget-object v1, p0, LW1/t;->t:LW1/n;

    .line 250
    .line 251
    iget-object v1, v1, LW1/n;->a:LN1/n;

    .line 252
    .line 253
    invoke-direct {p2, p1, v1, v2}, LW1/j;-><init>(ILN1/n;Z)V

    .line 254
    .line 255
    .line 256
    iget-object p1, p0, LW1/t;->r:Lxa/d;

    .line 257
    .line 258
    if-eqz p1, :cond_13

    .line 259
    .line 260
    invoke-virtual {p1, p2}, Lxa/d;->A(Ljava/lang/Exception;)V

    .line 261
    .line 262
    .line 263
    :cond_13
    iget-boolean p1, p2, LW1/j;->b:Z

    .line 264
    .line 265
    if-nez p1, :cond_14

    .line 266
    .line 267
    invoke-virtual {v0, p2}, LW1/r;->f(Ljava/lang/Exception;)V

    .line 268
    .line 269
    .line 270
    return-void

    .line 271
    :cond_14
    sget-object p1, LW1/b;->c:LW1/b;

    .line 272
    .line 273
    iput-object p1, p0, LW1/t;->w:LW1/b;

    .line 274
    .line 275
    throw p2

    .line 276
    :cond_15
    const/4 p2, 0x0

    .line 277
    iput-object p2, v0, LW1/r;->c:Ljava/io/Serializable;

    .line 278
    .line 279
    iput-wide v10, v0, LW1/r;->a:J

    .line 280
    .line 281
    iput-wide v10, v0, LW1/r;->b:J

    .line 282
    .line 283
    iget-object v0, p0, LW1/t;->v:Landroid/media/AudioTrack;

    .line 284
    .line 285
    invoke-static {v0}, LW1/t;->p(Landroid/media/AudioTrack;)Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-eqz v0, :cond_17

    .line 290
    .line 291
    iget-wide v0, p0, LW1/t;->J:J

    .line 292
    .line 293
    cmp-long v0, v0, v4

    .line 294
    .line 295
    if-lez v0, :cond_16

    .line 296
    .line 297
    iput-boolean v2, p0, LW1/t;->e0:Z

    .line 298
    .line 299
    :cond_16
    iget-boolean v0, p0, LW1/t;->V:Z

    .line 300
    .line 301
    if-eqz v0, :cond_17

    .line 302
    .line 303
    iget-object v0, p0, LW1/t;->r:Lxa/d;

    .line 304
    .line 305
    if-eqz v0, :cond_17

    .line 306
    .line 307
    if-ge p1, v6, :cond_17

    .line 308
    .line 309
    iget-boolean v1, p0, LW1/t;->e0:Z

    .line 310
    .line 311
    if-nez v1, :cond_17

    .line 312
    .line 313
    iget-object v0, v0, Lxa/d;->b:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v0, LW1/v;

    .line 316
    .line 317
    iget-object v0, v0, Ld2/q;->F:LU1/v;

    .line 318
    .line 319
    if-eqz v0, :cond_17

    .line 320
    .line 321
    iget-object v0, v0, LU1/v;->a:LU1/z;

    .line 322
    .line 323
    iput-boolean v3, v0, LU1/z;->L:Z

    .line 324
    .line 325
    :cond_17
    iget-object v0, p0, LW1/t;->t:LW1/n;

    .line 326
    .line 327
    iget v0, v0, LW1/n;->c:I

    .line 328
    .line 329
    if-nez v0, :cond_18

    .line 330
    .line 331
    iget-wide v4, p0, LW1/t;->I:J

    .line 332
    .line 333
    int-to-long v7, p1

    .line 334
    add-long/2addr v4, v7

    .line 335
    iput-wide v4, p0, LW1/t;->I:J

    .line 336
    .line 337
    :cond_18
    if-ne p1, v6, :cond_1b

    .line 338
    .line 339
    if-eqz v0, :cond_1a

    .line 340
    .line 341
    iget-object p1, p0, LW1/t;->R:Ljava/nio/ByteBuffer;

    .line 342
    .line 343
    iget-object v0, p0, LW1/t;->P:Ljava/nio/ByteBuffer;

    .line 344
    .line 345
    if-ne p1, v0, :cond_19

    .line 346
    .line 347
    move v2, v3

    .line 348
    :cond_19
    invoke-static {v2}, LQ1/k;->g(Z)V

    .line 349
    .line 350
    .line 351
    iget-wide v0, p0, LW1/t;->J:J

    .line 352
    .line 353
    iget p1, p0, LW1/t;->K:I

    .line 354
    .line 355
    int-to-long v2, p1

    .line 356
    iget p1, p0, LW1/t;->Q:I

    .line 357
    .line 358
    int-to-long v4, p1

    .line 359
    mul-long/2addr v2, v4

    .line 360
    add-long/2addr v2, v0

    .line 361
    iput-wide v2, p0, LW1/t;->J:J

    .line 362
    .line 363
    :cond_1a
    iput-object p2, p0, LW1/t;->R:Ljava/nio/ByteBuffer;

    .line 364
    .line 365
    :cond_1b
    :goto_7
    return-void

    .line 366
    :catchall_0
    move-exception v0

    .line 367
    move-object p1, v0

    .line 368
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 369
    throw p1
.end method

.method public final f()Z
    .locals 6

    .line 1
    iget-object v0, p0, LW1/t;->u:LO1/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LO1/a;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide/high16 v1, -0x8000000000000000L

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v1, v2}, LW1/t;->e(J)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LW1/t;->R:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    if-nez v0, :cond_4

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    iget-object v0, p0, LW1/t;->u:LO1/a;

    .line 22
    .line 23
    invoke-virtual {v0}, LO1/a;->e()Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_2

    .line 28
    .line 29
    iget-boolean v5, v0, LO1/a;->d:Z

    .line 30
    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iput-boolean v4, v0, LO1/a;->d:Z

    .line 35
    .line 36
    iget-object v0, v0, LO1/a;->b:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, LO1/d;

    .line 43
    .line 44
    invoke-interface {v0}, LO1/d;->e()V

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_0
    invoke-virtual {p0, v1, v2}, LW1/t;->t(J)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, LW1/t;->u:LO1/a;

    .line 51
    .line 52
    invoke-virtual {v0}, LO1/a;->d()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    iget-object v0, p0, LW1/t;->R:Ljava/nio/ByteBuffer;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_4

    .line 67
    .line 68
    :cond_3
    :goto_1
    return v4

    .line 69
    :cond_4
    return v3
.end method

.method public final g()V
    .locals 11

    .line 1
    invoke-virtual {p0}, LW1/t;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v0, :cond_5

    .line 9
    .line 10
    iput-wide v1, p0, LW1/t;->G:J

    .line 11
    .line 12
    iput-wide v1, p0, LW1/t;->H:J

    .line 13
    .line 14
    iput-wide v1, p0, LW1/t;->I:J

    .line 15
    .line 16
    iput-wide v1, p0, LW1/t;->J:J

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, LW1/t;->e0:Z

    .line 20
    .line 21
    iput v0, p0, LW1/t;->K:I

    .line 22
    .line 23
    new-instance v4, LW1/o;

    .line 24
    .line 25
    iget-object v5, p0, LW1/t;->C:LN1/F;

    .line 26
    .line 27
    const-wide/16 v6, 0x0

    .line 28
    .line 29
    const-wide/16 v8, 0x0

    .line 30
    .line 31
    invoke-direct/range {v4 .. v9}, LW1/o;-><init>(LN1/F;JJ)V

    .line 32
    .line 33
    .line 34
    iput-object v4, p0, LW1/t;->B:LW1/o;

    .line 35
    .line 36
    iput-wide v1, p0, LW1/t;->N:J

    .line 37
    .line 38
    iput-object v3, p0, LW1/t;->A:LW1/o;

    .line 39
    .line 40
    iget-object v4, p0, LW1/t;->h:Ljava/util/ArrayDeque;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->clear()V

    .line 43
    .line 44
    .line 45
    iput-object v3, p0, LW1/t;->P:Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    iput v0, p0, LW1/t;->Q:I

    .line 48
    .line 49
    iput-object v3, p0, LW1/t;->R:Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    iput-boolean v0, p0, LW1/t;->T:Z

    .line 52
    .line 53
    iput-boolean v0, p0, LW1/t;->S:Z

    .line 54
    .line 55
    iput-boolean v0, p0, LW1/t;->U:Z

    .line 56
    .line 57
    iput-object v3, p0, LW1/t;->E:Ljava/nio/ByteBuffer;

    .line 58
    .line 59
    iput v0, p0, LW1/t;->F:I

    .line 60
    .line 61
    iget-object v0, p0, LW1/t;->d:LW1/z;

    .line 62
    .line 63
    iput-wide v1, v0, LW1/z;->o:J

    .line 64
    .line 65
    iget-object v0, p0, LW1/t;->t:LW1/n;

    .line 66
    .line 67
    iget-object v0, v0, LW1/n;->i:LO1/a;

    .line 68
    .line 69
    iput-object v0, p0, LW1/t;->u:LO1/a;

    .line 70
    .line 71
    invoke-virtual {v0}, LO1/a;->b()V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, LW1/t;->g:LW1/l;

    .line 75
    .line 76
    iget-object v0, v0, LW1/l;->c:Landroid/media/AudioTrack;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    const/4 v4, 0x3

    .line 86
    if-ne v0, v4, :cond_0

    .line 87
    .line 88
    iget-object v0, p0, LW1/t;->v:Landroid/media/AudioTrack;

    .line 89
    .line 90
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 91
    .line 92
    .line 93
    :cond_0
    iget-object v0, p0, LW1/t;->v:Landroid/media/AudioTrack;

    .line 94
    .line 95
    invoke-static {v0}, LW1/t;->p(Landroid/media/AudioTrack;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_1

    .line 100
    .line 101
    iget-object v0, p0, LW1/t;->k:LG9/e;

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v4, p0, LW1/t;->v:Landroid/media/AudioTrack;

    .line 107
    .line 108
    iget-object v5, v0, LG9/e;->c:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v5, LG5/F;

    .line 111
    .line 112
    invoke-static {v4, v5}, LG5/d;->B(Landroid/media/AudioTrack;LG5/F;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, v0, LG9/e;->b:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v0, Landroid/os/Handler;

    .line 118
    .line 119
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_1
    iget-object v0, p0, LW1/t;->t:LW1/n;

    .line 123
    .line 124
    invoke-virtual {v0}, LW1/n;->a()LW1/g;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    iget-object v0, p0, LW1/t;->s:LW1/n;

    .line 129
    .line 130
    if-eqz v0, :cond_2

    .line 131
    .line 132
    iput-object v0, p0, LW1/t;->t:LW1/n;

    .line 133
    .line 134
    iput-object v3, p0, LW1/t;->s:LW1/n;

    .line 135
    .line 136
    :cond_2
    iget-object v0, p0, LW1/t;->g:LW1/l;

    .line 137
    .line 138
    invoke-virtual {v0}, LW1/l;->d()V

    .line 139
    .line 140
    .line 141
    iput-object v3, v0, LW1/l;->c:Landroid/media/AudioTrack;

    .line 142
    .line 143
    iput-object v3, v0, LW1/l;->e:LG5/v;

    .line 144
    .line 145
    sget v0, LQ1/x;->a:I

    .line 146
    .line 147
    const/16 v4, 0x18

    .line 148
    .line 149
    if-lt v0, v4, :cond_3

    .line 150
    .line 151
    iget-object v0, p0, LW1/t;->y:LDd/c;

    .line 152
    .line 153
    if-eqz v0, :cond_3

    .line 154
    .line 155
    iget-object v4, v0, LDd/c;->d:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v4, LW1/q;

    .line 158
    .line 159
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    iget-object v5, v0, LDd/c;->b:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v5, Landroid/media/AudioTrack;

    .line 165
    .line 166
    invoke-static {v5, v4}, LA7/O0;->s(Landroid/media/AudioTrack;Landroid/media/AudioRouting$OnRoutingChangedListener;)V

    .line 167
    .line 168
    .line 169
    iput-object v3, v0, LDd/c;->d:Ljava/lang/Object;

    .line 170
    .line 171
    iput-object v3, p0, LW1/t;->y:LDd/c;

    .line 172
    .line 173
    :cond_3
    iget-object v5, p0, LW1/t;->v:Landroid/media/AudioTrack;

    .line 174
    .line 175
    iget-object v6, p0, LW1/t;->r:Lxa/d;

    .line 176
    .line 177
    new-instance v7, Landroid/os/Handler;

    .line 178
    .line 179
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-direct {v7, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 184
    .line 185
    .line 186
    sget-object v10, LW1/t;->j0:Ljava/lang/Object;

    .line 187
    .line 188
    monitor-enter v10

    .line 189
    :try_start_0
    sget-object v0, LW1/t;->k0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 190
    .line 191
    if-nez v0, :cond_4

    .line 192
    .line 193
    new-instance v0, LQ1/v;

    .line 194
    .line 195
    const/4 v4, 0x0

    .line 196
    invoke-direct {v0, v4}, LQ1/v;-><init>(I)V

    .line 197
    .line 198
    .line 199
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    sput-object v0, LW1/t;->k0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 204
    .line 205
    goto :goto_0

    .line 206
    :catchall_0
    move-exception v0

    .line 207
    goto :goto_1

    .line 208
    :cond_4
    :goto_0
    sget v0, LW1/t;->l0:I

    .line 209
    .line 210
    add-int/lit8 v0, v0, 0x1

    .line 211
    .line 212
    sput v0, LW1/t;->l0:I

    .line 213
    .line 214
    sget-object v0, LW1/t;->k0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 215
    .line 216
    new-instance v4, LCb/a;

    .line 217
    .line 218
    const/4 v9, 0x7

    .line 219
    invoke-direct/range {v4 .. v9}, LCb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 220
    .line 221
    .line 222
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 223
    .line 224
    const-wide/16 v6, 0x14

    .line 225
    .line 226
    invoke-interface {v0, v4, v6, v7, v5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 227
    .line 228
    .line 229
    monitor-exit v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 230
    iput-object v3, p0, LW1/t;->v:Landroid/media/AudioTrack;

    .line 231
    .line 232
    goto :goto_2

    .line 233
    :goto_1
    :try_start_1
    monitor-exit v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 234
    throw v0

    .line 235
    :cond_5
    :goto_2
    iget-object v0, p0, LW1/t;->m:LW1/r;

    .line 236
    .line 237
    iput-object v3, v0, LW1/r;->c:Ljava/io/Serializable;

    .line 238
    .line 239
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    iput-wide v4, v0, LW1/r;->a:J

    .line 245
    .line 246
    iput-wide v4, v0, LW1/r;->b:J

    .line 247
    .line 248
    iget-object v0, p0, LW1/t;->l:LW1/r;

    .line 249
    .line 250
    iput-object v3, v0, LW1/r;->c:Ljava/io/Serializable;

    .line 251
    .line 252
    iput-wide v4, v0, LW1/r;->a:J

    .line 253
    .line 254
    iput-wide v4, v0, LW1/r;->b:J

    .line 255
    .line 256
    iput-wide v1, p0, LW1/t;->g0:J

    .line 257
    .line 258
    iput-wide v1, p0, LW1/t;->h0:J

    .line 259
    .line 260
    iget-object v0, p0, LW1/t;->i0:Landroid/os/Handler;

    .line 261
    .line 262
    if-eqz v0, :cond_6

    .line 263
    .line 264
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    :cond_6
    return-void
.end method

.method public final h(LN1/n;)LW1/e;
    .locals 8

    .line 1
    iget-boolean v0, p0, LW1/t;->d0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p1, LW1/e;->d:LW1/e;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object v0, p0, LW1/t;->z:LN1/c;

    .line 9
    .line 10
    iget-object v1, p0, LW1/t;->o:LS3/c;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget v2, LQ1/x;->a:I

    .line 22
    .line 23
    const/16 v3, 0x1d

    .line 24
    .line 25
    if-lt v2, v3, :cond_d

    .line 26
    .line 27
    const/4 v3, -0x1

    .line 28
    iget v4, p1, LN1/n;->D:I

    .line 29
    .line 30
    if-ne v4, v3, :cond_1

    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_1
    iget-object v3, v1, LS3/c;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, Ljava/lang/Boolean;

    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    const/4 v6, 0x1

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    iget-object v3, v1, LS3/c;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Landroid/content/Context;

    .line 50
    .line 51
    if-eqz v3, :cond_5

    .line 52
    .line 53
    const-string v7, "audio"

    .line 54
    .line 55
    invoke-virtual {v3, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Landroid/media/AudioManager;

    .line 60
    .line 61
    if-eqz v3, :cond_4

    .line 62
    .line 63
    const-string v7, "offloadVariableRateSupported"

    .line 64
    .line 65
    invoke-virtual {v3, v7}, Landroid/media/AudioManager;->getParameters(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    const-string v7, "offloadVariableRateSupported=1"

    .line 72
    .line 73
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    move v3, v6

    .line 80
    goto :goto_0

    .line 81
    :cond_3
    move v3, v5

    .line 82
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    iput-object v3, v1, LS3/c;->c:Ljava/lang/Object;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 90
    .line 91
    iput-object v3, v1, LS3/c;->c:Ljava/lang/Object;

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_5
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 95
    .line 96
    iput-object v3, v1, LS3/c;->c:Ljava/lang/Object;

    .line 97
    .line 98
    :goto_1
    iget-object v1, v1, LS3/c;->c:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    :goto_2
    iget-object v3, p1, LN1/n;->n:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v7, p1, LN1/n;->k:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {v3, v7}, LN1/C;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_c

    .line 118
    .line 119
    invoke-static {v3}, LQ1/x;->o(I)I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    if-ge v2, v7, :cond_6

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_6
    iget p1, p1, LN1/n;->C:I

    .line 127
    .line 128
    invoke-static {p1}, LQ1/x;->q(I)I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-nez p1, :cond_7

    .line 133
    .line 134
    sget-object p1, LW1/e;->d:LW1/e;

    .line 135
    .line 136
    return-object p1

    .line 137
    :cond_7
    :try_start_0
    invoke-static {v4, p1, v3}, LQ1/x;->p(III)Landroid/media/AudioFormat;

    .line 138
    .line 139
    .line 140
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 141
    const/16 v3, 0x1f

    .line 142
    .line 143
    if-lt v2, v3, :cond_a

    .line 144
    .line 145
    invoke-virtual {v0}, LN1/c;->a()Ly3/j;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    iget-object v0, v0, Ly3/j;->b:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, Landroid/media/AudioAttributes;

    .line 152
    .line 153
    invoke-static {p1, v0}, LV1/h;->a(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-nez p1, :cond_8

    .line 158
    .line 159
    sget-object p1, LW1/e;->d:LW1/e;

    .line 160
    .line 161
    return-object p1

    .line 162
    :cond_8
    new-instance v0, LE4/j;

    .line 163
    .line 164
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 165
    .line 166
    .line 167
    const/16 v3, 0x20

    .line 168
    .line 169
    if-le v2, v3, :cond_9

    .line 170
    .line 171
    const/4 v2, 0x2

    .line 172
    if-ne p1, v2, :cond_9

    .line 173
    .line 174
    move v5, v6

    .line 175
    :cond_9
    iput-boolean v6, v0, LE4/j;->a:Z

    .line 176
    .line 177
    iput-boolean v5, v0, LE4/j;->b:Z

    .line 178
    .line 179
    iput-boolean v1, v0, LE4/j;->c:Z

    .line 180
    .line 181
    invoke-virtual {v0}, LE4/j;->a()LW1/e;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    return-object p1

    .line 186
    :cond_a
    invoke-virtual {v0}, LN1/c;->a()Ly3/j;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    iget-object v0, v0, Ly3/j;->b:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v0, Landroid/media/AudioAttributes;

    .line 193
    .line 194
    invoke-static {p1, v0}, LG5/d;->D(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    if-nez p1, :cond_b

    .line 199
    .line 200
    sget-object p1, LW1/e;->d:LW1/e;

    .line 201
    .line 202
    return-object p1

    .line 203
    :cond_b
    new-instance p1, LE4/j;

    .line 204
    .line 205
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 206
    .line 207
    .line 208
    iput-boolean v6, p1, LE4/j;->a:Z

    .line 209
    .line 210
    iput-boolean v1, p1, LE4/j;->c:Z

    .line 211
    .line 212
    invoke-virtual {p1}, LE4/j;->a()LW1/e;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    return-object p1

    .line 217
    :catch_0
    sget-object p1, LW1/e;->d:LW1/e;

    .line 218
    .line 219
    return-object p1

    .line 220
    :cond_c
    :goto_3
    sget-object p1, LW1/e;->d:LW1/e;

    .line 221
    .line 222
    return-object p1

    .line 223
    :cond_d
    :goto_4
    sget-object p1, LW1/e;->d:LW1/e;

    .line 224
    .line 225
    return-object p1
.end method

.method public final i(LN1/n;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, LW1/t;->q()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, LN1/n;->n:Ljava/lang/String;

    .line 5
    .line 6
    const-string v1, "audio/raw"

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x2

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget p1, p1, LN1/n;->E:I

    .line 17
    .line 18
    invoke-static {p1}, LQ1/x;->F(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    const-string v0, "Invalid PCM encoding: "

    .line 25
    .line 26
    const-string v2, "DefaultAudioSink"

    .line 27
    .line 28
    invoke-static {p1, v0, v2}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return v1

    .line 32
    :cond_0
    if-eq p1, v2, :cond_2

    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    return p1

    .line 36
    :cond_1
    iget-object v0, p0, LW1/t;->w:LW1/b;

    .line 37
    .line 38
    iget-object v3, p0, LW1/t;->z:LN1/c;

    .line 39
    .line 40
    invoke-virtual {v0, v3, p1}, LW1/b;->d(LN1/c;LN1/n;)Landroid/util/Pair;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    :cond_2
    return v2

    .line 47
    :cond_3
    return v1
.end method

.method public final j()J
    .locals 5

    .line 1
    iget-object v0, p0, LW1/t;->t:LW1/n;

    .line 2
    .line 3
    iget v1, v0, LW1/n;->c:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-wide v1, p0, LW1/t;->G:J

    .line 8
    .line 9
    iget v0, v0, LW1/n;->b:I

    .line 10
    .line 11
    int-to-long v3, v0

    .line 12
    div-long/2addr v1, v3

    .line 13
    return-wide v1

    .line 14
    :cond_0
    iget-wide v0, p0, LW1/t;->H:J

    .line 15
    .line 16
    return-wide v0
.end method

.method public final k()J
    .locals 7

    .line 1
    iget-object v0, p0, LW1/t;->t:LW1/n;

    .line 2
    .line 3
    iget v1, v0, LW1/n;->c:I

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-wide v1, p0, LW1/t;->I:J

    .line 8
    .line 9
    iget v0, v0, LW1/n;->d:I

    .line 10
    .line 11
    int-to-long v3, v0

    .line 12
    sget v0, LQ1/x;->a:I

    .line 13
    .line 14
    add-long/2addr v1, v3

    .line 15
    const-wide/16 v5, 0x1

    .line 16
    .line 17
    sub-long/2addr v1, v5

    .line 18
    div-long/2addr v1, v3

    .line 19
    return-wide v1

    .line 20
    :cond_0
    iget-wide v0, p0, LW1/t;->J:J

    .line 21
    .line 22
    return-wide v0
.end method

.method public final l(JILjava/nio/ByteBuffer;)Z
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    move/from16 v0, p3

    .line 6
    .line 7
    move-object/from16 v4, p4

    .line 8
    .line 9
    iget-object v5, v1, LW1/t;->P:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    if-eqz v5, :cond_1

    .line 14
    .line 15
    if-ne v4, v5, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v5, v7

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    move v5, v6

    .line 21
    :goto_1
    invoke-static {v5}, LQ1/k;->c(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v5, v1, LW1/t;->s:LW1/n;

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    const/4 v9, 0x3

    .line 28
    iget-object v10, v1, LW1/t;->g:LW1/l;

    .line 29
    .line 30
    if-eqz v5, :cond_7

    .line 31
    .line 32
    invoke-virtual {v1}, LW1/t;->f()Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-nez v5, :cond_2

    .line 37
    .line 38
    :goto_2
    move v15, v7

    .line 39
    goto/16 :goto_1e

    .line 40
    .line 41
    :cond_2
    iget-object v5, v1, LW1/t;->s:LW1/n;

    .line 42
    .line 43
    iget-object v11, v1, LW1/t;->t:LW1/n;

    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget v12, v11, LW1/n;->c:I

    .line 49
    .line 50
    iget v13, v5, LW1/n;->c:I

    .line 51
    .line 52
    if-ne v12, v13, :cond_4

    .line 53
    .line 54
    iget v12, v11, LW1/n;->g:I

    .line 55
    .line 56
    iget v13, v5, LW1/n;->g:I

    .line 57
    .line 58
    if-ne v12, v13, :cond_4

    .line 59
    .line 60
    iget v12, v11, LW1/n;->e:I

    .line 61
    .line 62
    iget v13, v5, LW1/n;->e:I

    .line 63
    .line 64
    if-ne v12, v13, :cond_4

    .line 65
    .line 66
    iget v12, v11, LW1/n;->f:I

    .line 67
    .line 68
    iget v13, v5, LW1/n;->f:I

    .line 69
    .line 70
    if-ne v12, v13, :cond_4

    .line 71
    .line 72
    iget v12, v11, LW1/n;->d:I

    .line 73
    .line 74
    iget v13, v5, LW1/n;->d:I

    .line 75
    .line 76
    if-ne v12, v13, :cond_4

    .line 77
    .line 78
    iget-boolean v12, v11, LW1/n;->j:Z

    .line 79
    .line 80
    iget-boolean v13, v5, LW1/n;->j:Z

    .line 81
    .line 82
    if-ne v12, v13, :cond_4

    .line 83
    .line 84
    iget-boolean v11, v11, LW1/n;->k:Z

    .line 85
    .line 86
    iget-boolean v5, v5, LW1/n;->k:Z

    .line 87
    .line 88
    if-ne v11, v5, :cond_4

    .line 89
    .line 90
    iget-object v5, v1, LW1/t;->s:LW1/n;

    .line 91
    .line 92
    iput-object v5, v1, LW1/t;->t:LW1/n;

    .line 93
    .line 94
    iput-object v8, v1, LW1/t;->s:LW1/n;

    .line 95
    .line 96
    iget-object v5, v1, LW1/t;->v:Landroid/media/AudioTrack;

    .line 97
    .line 98
    if-eqz v5, :cond_6

    .line 99
    .line 100
    invoke-static {v5}, LW1/t;->p(Landroid/media/AudioTrack;)Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-eqz v5, :cond_6

    .line 105
    .line 106
    iget-object v5, v1, LW1/t;->t:LW1/n;

    .line 107
    .line 108
    iget-boolean v5, v5, LW1/n;->k:Z

    .line 109
    .line 110
    if-eqz v5, :cond_6

    .line 111
    .line 112
    iget-object v5, v1, LW1/t;->v:Landroid/media/AudioTrack;

    .line 113
    .line 114
    invoke-virtual {v5}, Landroid/media/AudioTrack;->getPlayState()I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-ne v5, v9, :cond_3

    .line 119
    .line 120
    iget-object v5, v1, LW1/t;->v:Landroid/media/AudioTrack;

    .line 121
    .line 122
    invoke-static {v5}, LG5/d;->q(Landroid/media/AudioTrack;)V

    .line 123
    .line 124
    .line 125
    iput-boolean v6, v10, LW1/l;->G:Z

    .line 126
    .line 127
    iget-object v5, v10, LW1/l;->e:LG5/v;

    .line 128
    .line 129
    if-eqz v5, :cond_3

    .line 130
    .line 131
    iget-object v5, v5, LG5/v;->g:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v5, LW1/k;

    .line 134
    .line 135
    if-eqz v5, :cond_3

    .line 136
    .line 137
    iput-boolean v6, v5, LW1/k;->f:Z

    .line 138
    .line 139
    :cond_3
    iget-object v5, v1, LW1/t;->v:Landroid/media/AudioTrack;

    .line 140
    .line 141
    iget-object v11, v1, LW1/t;->t:LW1/n;

    .line 142
    .line 143
    iget-object v11, v11, LW1/n;->a:LN1/n;

    .line 144
    .line 145
    iget v12, v11, LN1/n;->F:I

    .line 146
    .line 147
    iget v11, v11, LN1/n;->G:I

    .line 148
    .line 149
    invoke-static {v5, v12, v11}, LG5/d;->r(Landroid/media/AudioTrack;II)V

    .line 150
    .line 151
    .line 152
    iput-boolean v6, v1, LW1/t;->e0:Z

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_4
    invoke-virtual {v1}, LW1/t;->s()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1}, LW1/t;->m()Z

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    if-eqz v5, :cond_5

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_5
    invoke-virtual {v1}, LW1/t;->g()V

    .line 166
    .line 167
    .line 168
    :cond_6
    :goto_3
    invoke-virtual/range {p0 .. p2}, LW1/t;->a(J)V

    .line 169
    .line 170
    .line 171
    :cond_7
    invoke-virtual {v1}, LW1/t;->o()Z

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    iget-object v11, v1, LW1/t;->l:LW1/r;

    .line 176
    .line 177
    if-nez v5, :cond_9

    .line 178
    .line 179
    :try_start_0
    invoke-virtual {v1}, LW1/t;->n()Z

    .line 180
    .line 181
    .line 182
    move-result v5
    :try_end_0
    .catch LW1/i; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    if-nez v5, :cond_9

    .line 184
    .line 185
    goto/16 :goto_2

    .line 186
    .line 187
    :catch_0
    move-exception v0

    .line 188
    iget-boolean v2, v0, LW1/i;->b:Z

    .line 189
    .line 190
    if-nez v2, :cond_8

    .line 191
    .line 192
    invoke-virtual {v11, v0}, LW1/r;->f(Ljava/lang/Exception;)V

    .line 193
    .line 194
    .line 195
    return v7

    .line 196
    :cond_8
    throw v0

    .line 197
    :cond_9
    iput-object v8, v11, LW1/r;->c:Ljava/io/Serializable;

    .line 198
    .line 199
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    iput-wide v12, v11, LW1/r;->a:J

    .line 205
    .line 206
    iput-wide v12, v11, LW1/r;->b:J

    .line 207
    .line 208
    iget-boolean v5, v1, LW1/t;->M:Z

    .line 209
    .line 210
    const-wide/16 v14, 0x0

    .line 211
    .line 212
    move-wide/from16 v16, v12

    .line 213
    .line 214
    if-eqz v5, :cond_b

    .line 215
    .line 216
    invoke-static {v14, v15, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 217
    .line 218
    .line 219
    move-result-wide v12

    .line 220
    iput-wide v12, v1, LW1/t;->N:J

    .line 221
    .line 222
    iput-boolean v7, v1, LW1/t;->L:Z

    .line 223
    .line 224
    iput-boolean v7, v1, LW1/t;->M:Z

    .line 225
    .line 226
    invoke-virtual {v1}, LW1/t;->x()Z

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    if-eqz v5, :cond_a

    .line 231
    .line 232
    invoke-virtual {v1}, LW1/t;->v()V

    .line 233
    .line 234
    .line 235
    :cond_a
    invoke-virtual/range {p0 .. p2}, LW1/t;->a(J)V

    .line 236
    .line 237
    .line 238
    iget-boolean v5, v1, LW1/t;->V:Z

    .line 239
    .line 240
    if-eqz v5, :cond_b

    .line 241
    .line 242
    invoke-virtual {v1}, LW1/t;->r()V

    .line 243
    .line 244
    .line 245
    :cond_b
    invoke-virtual {v1}, LW1/t;->k()J

    .line 246
    .line 247
    .line 248
    move-result-wide v11

    .line 249
    iget-object v5, v10, LW1/l;->c:Landroid/media/AudioTrack;

    .line 250
    .line 251
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v5}, Landroid/media/AudioTrack;->getPlayState()I

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    iget-boolean v13, v10, LW1/l;->g:Z

    .line 259
    .line 260
    move-wide/from16 v18, v14

    .line 261
    .line 262
    const/4 v14, 0x2

    .line 263
    if-eqz v13, :cond_d

    .line 264
    .line 265
    if-ne v5, v14, :cond_c

    .line 266
    .line 267
    iput-boolean v7, v10, LW1/l;->o:Z

    .line 268
    .line 269
    return v7

    .line 270
    :cond_c
    if-ne v5, v6, :cond_d

    .line 271
    .line 272
    invoke-virtual {v10}, LW1/l;->b()J

    .line 273
    .line 274
    .line 275
    move-result-wide v20

    .line 276
    cmp-long v13, v20, v18

    .line 277
    .line 278
    if-nez v13, :cond_d

    .line 279
    .line 280
    goto/16 :goto_2

    .line 281
    .line 282
    :cond_d
    iget-boolean v13, v10, LW1/l;->o:Z

    .line 283
    .line 284
    invoke-virtual {v10, v11, v12}, LW1/l;->c(J)Z

    .line 285
    .line 286
    .line 287
    move-result v11

    .line 288
    iput-boolean v11, v10, LW1/l;->o:Z

    .line 289
    .line 290
    if-eqz v13, :cond_e

    .line 291
    .line 292
    if-nez v11, :cond_e

    .line 293
    .line 294
    if-eq v5, v6, :cond_e

    .line 295
    .line 296
    iget v5, v10, LW1/l;->d:I

    .line 297
    .line 298
    iget-wide v11, v10, LW1/l;->h:J

    .line 299
    .line 300
    invoke-static {v11, v12}, LQ1/x;->W(J)J

    .line 301
    .line 302
    .line 303
    move-result-wide v23

    .line 304
    iget-object v11, v10, LW1/l;->a:LA/e0;

    .line 305
    .line 306
    iget-object v11, v11, LA/e0;->b:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v11, LW1/t;

    .line 309
    .line 310
    iget-object v12, v11, LW1/t;->r:Lxa/d;

    .line 311
    .line 312
    if-eqz v12, :cond_e

    .line 313
    .line 314
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 315
    .line 316
    .line 317
    move-result-wide v12

    .line 318
    iget-wide v7, v11, LW1/t;->c0:J

    .line 319
    .line 320
    sub-long v25, v12, v7

    .line 321
    .line 322
    iget-object v7, v11, LW1/t;->r:Lxa/d;

    .line 323
    .line 324
    iget-object v7, v7, Lxa/d;->b:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v7, LW1/v;

    .line 327
    .line 328
    iget-object v7, v7, LW1/v;->D0:LS3/s;

    .line 329
    .line 330
    iget-object v8, v7, LS3/s;->b:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v8, Landroid/os/Handler;

    .line 333
    .line 334
    if-eqz v8, :cond_e

    .line 335
    .line 336
    new-instance v20, LW1/f;

    .line 337
    .line 338
    move/from16 v22, v5

    .line 339
    .line 340
    move-object/from16 v21, v7

    .line 341
    .line 342
    invoke-direct/range {v20 .. v26}, LW1/f;-><init>(LS3/s;IJJ)V

    .line 343
    .line 344
    .line 345
    move-object/from16 v5, v20

    .line 346
    .line 347
    invoke-virtual {v8, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 348
    .line 349
    .line 350
    :cond_e
    iget-object v5, v1, LW1/t;->P:Ljava/nio/ByteBuffer;

    .line 351
    .line 352
    if-nez v5, :cond_38

    .line 353
    .line 354
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 355
    .line 356
    .line 357
    move-result-object v5

    .line 358
    sget-object v7, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 359
    .line 360
    if-ne v5, v7, :cond_f

    .line 361
    .line 362
    move v5, v6

    .line 363
    goto :goto_4

    .line 364
    :cond_f
    const/4 v5, 0x0

    .line 365
    :goto_4
    invoke-static {v5}, LQ1/k;->c(Z)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v4}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 369
    .line 370
    .line 371
    move-result v5

    .line 372
    if-nez v5, :cond_10

    .line 373
    .line 374
    goto/16 :goto_1b

    .line 375
    .line 376
    :cond_10
    iget-object v5, v1, LW1/t;->t:LW1/n;

    .line 377
    .line 378
    iget v7, v5, LW1/n;->c:I

    .line 379
    .line 380
    if-eqz v7, :cond_2f

    .line 381
    .line 382
    iget v7, v1, LW1/t;->K:I

    .line 383
    .line 384
    if-nez v7, :cond_2f

    .line 385
    .line 386
    const/16 v7, 0x14

    .line 387
    .line 388
    const/4 v8, 0x5

    .line 389
    iget v5, v5, LW1/n;->g:I

    .line 390
    .line 391
    if-eq v5, v7, :cond_2a

    .line 392
    .line 393
    const/16 v7, 0x1e

    .line 394
    .line 395
    const/4 v11, -0x2

    .line 396
    const/16 v12, 0x400

    .line 397
    .line 398
    const/4 v13, -0x1

    .line 399
    if-eq v5, v7, :cond_22

    .line 400
    .line 401
    const/16 v7, 0xa

    .line 402
    .line 403
    packed-switch v5, :pswitch_data_0

    .line 404
    .line 405
    .line 406
    const/16 v14, 0x10

    .line 407
    .line 408
    packed-switch v5, :pswitch_data_1

    .line 409
    .line 410
    .line 411
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 412
    .line 413
    const-string v2, "Unexpected audio encoding: "

    .line 414
    .line 415
    invoke-static {v5, v2}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    throw v0

    .line 423
    :pswitch_0
    new-array v5, v14, [B

    .line 424
    .line 425
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    .line 426
    .line 427
    .line 428
    move-result v7

    .line 429
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v4, v7}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 433
    .line 434
    .line 435
    new-instance v7, LJ5/y;

    .line 436
    .line 437
    const/4 v8, 0x1

    .line 438
    const/4 v9, 0x0

    .line 439
    invoke-direct {v7, v5, v14, v8, v9}, LJ5/y;-><init>([BIIB)V

    .line 440
    .line 441
    .line 442
    invoke-static {v7}, Ls2/a;->p(LJ5/y;)LG5/c;

    .line 443
    .line 444
    .line 445
    move-result-object v5

    .line 446
    iget v5, v5, LG5/c;->c:I

    .line 447
    .line 448
    goto/16 :goto_1a

    .line 449
    .line 450
    :cond_11
    :goto_5
    :pswitch_1
    move v5, v12

    .line 451
    goto/16 :goto_1a

    .line 452
    .line 453
    :pswitch_2
    const/16 v5, 0x200

    .line 454
    .line 455
    goto/16 :goto_1a

    .line 456
    .line 457
    :pswitch_3
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    .line 458
    .line 459
    .line 460
    move-result v5

    .line 461
    invoke-virtual {v4}, Ljava/nio/Buffer;->limit()I

    .line 462
    .line 463
    .line 464
    move-result v8

    .line 465
    sub-int/2addr v8, v7

    .line 466
    move v7, v5

    .line 467
    :goto_6
    if-gt v7, v8, :cond_14

    .line 468
    .line 469
    add-int/lit8 v9, v7, 0x4

    .line 470
    .line 471
    invoke-virtual {v4, v9}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 472
    .line 473
    .line 474
    move-result v9

    .line 475
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 476
    .line 477
    .line 478
    move-result-object v12

    .line 479
    move/from16 v20, v14

    .line 480
    .line 481
    sget-object v14, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 482
    .line 483
    if-ne v12, v14, :cond_12

    .line 484
    .line 485
    goto :goto_7

    .line 486
    :cond_12
    invoke-static {v9}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 487
    .line 488
    .line 489
    move-result v9

    .line 490
    :goto_7
    and-int/2addr v9, v11

    .line 491
    const v12, -0x78d9046

    .line 492
    .line 493
    .line 494
    if-ne v9, v12, :cond_13

    .line 495
    .line 496
    sub-int/2addr v7, v5

    .line 497
    goto :goto_8

    .line 498
    :cond_13
    add-int/lit8 v7, v7, 0x1

    .line 499
    .line 500
    move/from16 v14, v20

    .line 501
    .line 502
    goto :goto_6

    .line 503
    :cond_14
    move/from16 v20, v14

    .line 504
    .line 505
    move v7, v13

    .line 506
    :goto_8
    if-ne v7, v13, :cond_15

    .line 507
    .line 508
    const/4 v5, 0x0

    .line 509
    goto/16 :goto_1a

    .line 510
    .line 511
    :cond_15
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    .line 512
    .line 513
    .line 514
    move-result v5

    .line 515
    add-int/2addr v5, v7

    .line 516
    add-int/lit8 v5, v5, 0x7

    .line 517
    .line 518
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 519
    .line 520
    .line 521
    move-result v5

    .line 522
    and-int/lit16 v5, v5, 0xff

    .line 523
    .line 524
    const/16 v8, 0xbb

    .line 525
    .line 526
    if-ne v5, v8, :cond_16

    .line 527
    .line 528
    move v5, v6

    .line 529
    goto :goto_9

    .line 530
    :cond_16
    const/4 v5, 0x0

    .line 531
    :goto_9
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    .line 532
    .line 533
    .line 534
    move-result v8

    .line 535
    add-int/2addr v8, v7

    .line 536
    if-eqz v5, :cond_17

    .line 537
    .line 538
    const/16 v5, 0x9

    .line 539
    .line 540
    goto :goto_a

    .line 541
    :cond_17
    const/16 v5, 0x8

    .line 542
    .line 543
    :goto_a
    add-int/2addr v8, v5

    .line 544
    invoke-virtual {v4, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 545
    .line 546
    .line 547
    move-result v5

    .line 548
    shr-int/lit8 v5, v5, 0x4

    .line 549
    .line 550
    and-int/lit8 v5, v5, 0x7

    .line 551
    .line 552
    const/16 v7, 0x28

    .line 553
    .line 554
    shl-int v5, v7, v5

    .line 555
    .line 556
    mul-int/lit8 v5, v5, 0x10

    .line 557
    .line 558
    goto/16 :goto_1a

    .line 559
    .line 560
    :pswitch_4
    const/16 v5, 0x800

    .line 561
    .line 562
    goto/16 :goto_1a

    .line 563
    .line 564
    :pswitch_5
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    .line 565
    .line 566
    .line 567
    move-result v5

    .line 568
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 569
    .line 570
    .line 571
    move-result v5

    .line 572
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 573
    .line 574
    .line 575
    move-result-object v8

    .line 576
    sget-object v11, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 577
    .line 578
    if-ne v8, v11, :cond_18

    .line 579
    .line 580
    goto :goto_b

    .line 581
    :cond_18
    invoke-static {v5}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 582
    .line 583
    .line 584
    move-result v5

    .line 585
    :goto_b
    const/high16 v8, -0x200000

    .line 586
    .line 587
    and-int v11, v5, v8

    .line 588
    .line 589
    if-ne v11, v8, :cond_19

    .line 590
    .line 591
    ushr-int/lit8 v8, v5, 0x13

    .line 592
    .line 593
    and-int/2addr v8, v9

    .line 594
    if-ne v8, v6, :cond_1a

    .line 595
    .line 596
    :cond_19
    :goto_c
    move v15, v13

    .line 597
    goto :goto_e

    .line 598
    :cond_1a
    ushr-int/lit8 v11, v5, 0x11

    .line 599
    .line 600
    and-int/2addr v11, v9

    .line 601
    if-nez v11, :cond_1b

    .line 602
    .line 603
    goto :goto_c

    .line 604
    :cond_1b
    ushr-int/lit8 v12, v5, 0xc

    .line 605
    .line 606
    const/16 v15, 0xf

    .line 607
    .line 608
    and-int/2addr v12, v15

    .line 609
    ushr-int/2addr v5, v7

    .line 610
    and-int/2addr v5, v9

    .line 611
    if-eqz v12, :cond_19

    .line 612
    .line 613
    if-eq v12, v15, :cond_19

    .line 614
    .line 615
    if-ne v5, v9, :cond_1c

    .line 616
    .line 617
    goto :goto_c

    .line 618
    :cond_1c
    const/16 v5, 0x480

    .line 619
    .line 620
    if-eq v11, v6, :cond_1e

    .line 621
    .line 622
    if-eq v11, v14, :cond_20

    .line 623
    .line 624
    if-ne v11, v9, :cond_1d

    .line 625
    .line 626
    const/16 v5, 0x180

    .line 627
    .line 628
    goto :goto_d

    .line 629
    :cond_1d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 630
    .line 631
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 632
    .line 633
    .line 634
    throw v0

    .line 635
    :cond_1e
    if-ne v8, v9, :cond_1f

    .line 636
    .line 637
    goto :goto_d

    .line 638
    :cond_1f
    const/16 v5, 0x240

    .line 639
    .line 640
    :cond_20
    :goto_d
    move v15, v5

    .line 641
    :goto_e
    if-eq v15, v13, :cond_21

    .line 642
    .line 643
    :goto_f
    move v5, v15

    .line 644
    goto/16 :goto_1a

    .line 645
    .line 646
    :cond_21
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 647
    .line 648
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 649
    .line 650
    .line 651
    throw v0

    .line 652
    :cond_22
    :pswitch_6
    const/4 v15, 0x0

    .line 653
    goto :goto_11

    .line 654
    :pswitch_7
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    .line 655
    .line 656
    .line 657
    move-result v5

    .line 658
    add-int/2addr v5, v8

    .line 659
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 660
    .line 661
    .line 662
    move-result v5

    .line 663
    and-int/lit16 v5, v5, 0xf8

    .line 664
    .line 665
    shr-int/2addr v5, v9

    .line 666
    if-le v5, v7, :cond_24

    .line 667
    .line 668
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    .line 669
    .line 670
    .line 671
    move-result v5

    .line 672
    add-int/lit8 v5, v5, 0x4

    .line 673
    .line 674
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 675
    .line 676
    .line 677
    move-result v5

    .line 678
    and-int/lit16 v5, v5, 0xc0

    .line 679
    .line 680
    shr-int/lit8 v5, v5, 0x6

    .line 681
    .line 682
    if-ne v5, v9, :cond_23

    .line 683
    .line 684
    goto :goto_10

    .line 685
    :cond_23
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    .line 686
    .line 687
    .line 688
    move-result v5

    .line 689
    add-int/lit8 v5, v5, 0x4

    .line 690
    .line 691
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 692
    .line 693
    .line 694
    move-result v5

    .line 695
    and-int/lit8 v5, v5, 0x30

    .line 696
    .line 697
    shr-int/lit8 v9, v5, 0x4

    .line 698
    .line 699
    :goto_10
    sget-object v5, Ls2/a;->c:[I

    .line 700
    .line 701
    aget v5, v5, v9

    .line 702
    .line 703
    mul-int/lit16 v15, v5, 0x100

    .line 704
    .line 705
    goto :goto_f

    .line 706
    :cond_24
    const/16 v15, 0x600

    .line 707
    .line 708
    goto :goto_f

    .line 709
    :goto_11
    invoke-virtual {v4, v15}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 710
    .line 711
    .line 712
    move-result v5

    .line 713
    const v7, -0xde4bec0

    .line 714
    .line 715
    .line 716
    if-eq v5, v7, :cond_11

    .line 717
    .line 718
    invoke-virtual {v4, v15}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 719
    .line 720
    .line 721
    move-result v5

    .line 722
    const v7, -0x17bd3b8f

    .line 723
    .line 724
    .line 725
    if-ne v5, v7, :cond_25

    .line 726
    .line 727
    goto/16 :goto_5

    .line 728
    .line 729
    :cond_25
    invoke-virtual {v4, v15}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 730
    .line 731
    .line 732
    move-result v5

    .line 733
    const v7, 0x25205864

    .line 734
    .line 735
    .line 736
    if-ne v5, v7, :cond_26

    .line 737
    .line 738
    const/16 v5, 0x1000

    .line 739
    .line 740
    goto/16 :goto_1a

    .line 741
    .line 742
    :cond_26
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    .line 743
    .line 744
    .line 745
    move-result v5

    .line 746
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 747
    .line 748
    .line 749
    move-result v7

    .line 750
    if-eq v7, v11, :cond_29

    .line 751
    .line 752
    if-eq v7, v13, :cond_28

    .line 753
    .line 754
    const/16 v9, 0x1f

    .line 755
    .line 756
    if-eq v7, v9, :cond_27

    .line 757
    .line 758
    add-int/lit8 v7, v5, 0x4

    .line 759
    .line 760
    invoke-virtual {v4, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 761
    .line 762
    .line 763
    move-result v7

    .line 764
    and-int/2addr v7, v6

    .line 765
    shl-int/lit8 v7, v7, 0x6

    .line 766
    .line 767
    add-int/2addr v5, v8

    .line 768
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 769
    .line 770
    .line 771
    move-result v5

    .line 772
    :goto_12
    and-int/lit16 v5, v5, 0xfc

    .line 773
    .line 774
    :goto_13
    shr-int/2addr v5, v14

    .line 775
    or-int/2addr v5, v7

    .line 776
    goto :goto_15

    .line 777
    :cond_27
    add-int/lit8 v7, v5, 0x5

    .line 778
    .line 779
    invoke-virtual {v4, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 780
    .line 781
    .line 782
    move-result v7

    .line 783
    and-int/lit8 v7, v7, 0x7

    .line 784
    .line 785
    shl-int/lit8 v7, v7, 0x4

    .line 786
    .line 787
    add-int/lit8 v5, v5, 0x6

    .line 788
    .line 789
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 790
    .line 791
    .line 792
    move-result v5

    .line 793
    :goto_14
    and-int/lit8 v5, v5, 0x3c

    .line 794
    .line 795
    goto :goto_13

    .line 796
    :cond_28
    add-int/lit8 v7, v5, 0x4

    .line 797
    .line 798
    invoke-virtual {v4, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 799
    .line 800
    .line 801
    move-result v7

    .line 802
    and-int/lit8 v7, v7, 0x7

    .line 803
    .line 804
    shl-int/lit8 v7, v7, 0x4

    .line 805
    .line 806
    add-int/lit8 v5, v5, 0x7

    .line 807
    .line 808
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 809
    .line 810
    .line 811
    move-result v5

    .line 812
    goto :goto_14

    .line 813
    :cond_29
    add-int/lit8 v7, v5, 0x5

    .line 814
    .line 815
    invoke-virtual {v4, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 816
    .line 817
    .line 818
    move-result v7

    .line 819
    and-int/2addr v7, v6

    .line 820
    shl-int/lit8 v7, v7, 0x6

    .line 821
    .line 822
    add-int/lit8 v5, v5, 0x4

    .line 823
    .line 824
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 825
    .line 826
    .line 827
    move-result v5

    .line 828
    goto :goto_12

    .line 829
    :goto_15
    add-int/2addr v5, v6

    .line 830
    mul-int/lit8 v5, v5, 0x20

    .line 831
    .line 832
    goto :goto_1a

    .line 833
    :cond_2a
    invoke-virtual {v4, v8}, Ljava/nio/ByteBuffer;->get(I)B

    .line 834
    .line 835
    .line 836
    move-result v5

    .line 837
    and-int/2addr v5, v14

    .line 838
    if-nez v5, :cond_2b

    .line 839
    .line 840
    const/4 v5, 0x0

    .line 841
    goto :goto_18

    .line 842
    :cond_2b
    const/16 v5, 0x1a

    .line 843
    .line 844
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 845
    .line 846
    .line 847
    move-result v5

    .line 848
    const/16 v7, 0x1c

    .line 849
    .line 850
    move v9, v7

    .line 851
    const/4 v8, 0x0

    .line 852
    :goto_16
    if-ge v8, v5, :cond_2c

    .line 853
    .line 854
    add-int/lit8 v11, v8, 0x1b

    .line 855
    .line 856
    invoke-virtual {v4, v11}, Ljava/nio/ByteBuffer;->get(I)B

    .line 857
    .line 858
    .line 859
    move-result v11

    .line 860
    add-int/2addr v9, v11

    .line 861
    add-int/lit8 v8, v8, 0x1

    .line 862
    .line 863
    goto :goto_16

    .line 864
    :cond_2c
    add-int/lit8 v5, v9, 0x1a

    .line 865
    .line 866
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 867
    .line 868
    .line 869
    move-result v5

    .line 870
    const/4 v8, 0x0

    .line 871
    :goto_17
    if-ge v8, v5, :cond_2d

    .line 872
    .line 873
    add-int/lit8 v11, v9, 0x1b

    .line 874
    .line 875
    add-int/2addr v11, v8

    .line 876
    invoke-virtual {v4, v11}, Ljava/nio/ByteBuffer;->get(I)B

    .line 877
    .line 878
    .line 879
    move-result v11

    .line 880
    add-int/2addr v7, v11

    .line 881
    add-int/lit8 v8, v8, 0x1

    .line 882
    .line 883
    goto :goto_17

    .line 884
    :cond_2d
    add-int v5, v9, v7

    .line 885
    .line 886
    :goto_18
    add-int/lit8 v7, v5, 0x1a

    .line 887
    .line 888
    invoke-virtual {v4, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 889
    .line 890
    .line 891
    move-result v7

    .line 892
    add-int/lit8 v7, v7, 0x1b

    .line 893
    .line 894
    add-int/2addr v7, v5

    .line 895
    invoke-virtual {v4, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 896
    .line 897
    .line 898
    move-result v5

    .line 899
    invoke-virtual {v4}, Ljava/nio/Buffer;->limit()I

    .line 900
    .line 901
    .line 902
    move-result v8

    .line 903
    sub-int/2addr v8, v7

    .line 904
    if-le v8, v6, :cond_2e

    .line 905
    .line 906
    add-int/2addr v7, v6

    .line 907
    invoke-virtual {v4, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 908
    .line 909
    .line 910
    move-result v7

    .line 911
    goto :goto_19

    .line 912
    :cond_2e
    const/4 v7, 0x0

    .line 913
    :goto_19
    invoke-static {v5, v7}, Ls2/a;->l(BB)J

    .line 914
    .line 915
    .line 916
    move-result-wide v7

    .line 917
    const-wide/32 v11, 0xbb80

    .line 918
    .line 919
    .line 920
    mul-long/2addr v7, v11

    .line 921
    const-wide/32 v11, 0xf4240

    .line 922
    .line 923
    .line 924
    div-long/2addr v7, v11

    .line 925
    long-to-int v5, v7

    .line 926
    :goto_1a
    iput v5, v1, LW1/t;->K:I

    .line 927
    .line 928
    if-nez v5, :cond_2f

    .line 929
    .line 930
    :goto_1b
    return v6

    .line 931
    :cond_2f
    iget-object v5, v1, LW1/t;->A:LW1/o;

    .line 932
    .line 933
    if-eqz v5, :cond_32

    .line 934
    .line 935
    invoke-virtual {v1}, LW1/t;->f()Z

    .line 936
    .line 937
    .line 938
    move-result v5

    .line 939
    if-nez v5, :cond_31

    .line 940
    .line 941
    :cond_30
    :goto_1c
    const/4 v15, 0x0

    .line 942
    goto/16 :goto_1e

    .line 943
    .line 944
    :cond_31
    invoke-virtual/range {p0 .. p2}, LW1/t;->a(J)V

    .line 945
    .line 946
    .line 947
    const/4 v5, 0x0

    .line 948
    iput-object v5, v1, LW1/t;->A:LW1/o;

    .line 949
    .line 950
    :cond_32
    iget-wide v7, v1, LW1/t;->N:J

    .line 951
    .line 952
    iget-object v5, v1, LW1/t;->t:LW1/n;

    .line 953
    .line 954
    invoke-virtual {v1}, LW1/t;->j()J

    .line 955
    .line 956
    .line 957
    move-result-wide v11

    .line 958
    iget-object v9, v1, LW1/t;->d:LW1/z;

    .line 959
    .line 960
    iget-wide v13, v9, LW1/z;->o:J

    .line 961
    .line 962
    sub-long/2addr v11, v13

    .line 963
    iget-object v5, v5, LW1/n;->a:LN1/n;

    .line 964
    .line 965
    iget v5, v5, LN1/n;->D:I

    .line 966
    .line 967
    invoke-static {v5, v11, v12}, LQ1/x;->Q(IJ)J

    .line 968
    .line 969
    .line 970
    move-result-wide v11

    .line 971
    add-long/2addr v11, v7

    .line 972
    iget-boolean v5, v1, LW1/t;->L:Z

    .line 973
    .line 974
    if-nez v5, :cond_34

    .line 975
    .line 976
    sub-long v7, v11, v2

    .line 977
    .line 978
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    .line 979
    .line 980
    .line 981
    move-result-wide v7

    .line 982
    const-wide/32 v13, 0x30d40

    .line 983
    .line 984
    .line 985
    cmp-long v5, v7, v13

    .line 986
    .line 987
    if-lez v5, :cond_34

    .line 988
    .line 989
    iget-object v5, v1, LW1/t;->r:Lxa/d;

    .line 990
    .line 991
    if-eqz v5, :cond_33

    .line 992
    .line 993
    new-instance v7, LYa/a;

    .line 994
    .line 995
    const-string v8, "Unexpected audio track timestamp discontinuity: expected "

    .line 996
    .line 997
    const-string v9, ", got "

    .line 998
    .line 999
    invoke-static {v11, v12, v8, v9}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v8

    .line 1003
    invoke-virtual {v8, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v8

    .line 1010
    invoke-direct {v7, v8}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {v5, v7}, Lxa/d;->A(Ljava/lang/Exception;)V

    .line 1014
    .line 1015
    .line 1016
    :cond_33
    iput-boolean v6, v1, LW1/t;->L:Z

    .line 1017
    .line 1018
    :cond_34
    iget-boolean v5, v1, LW1/t;->L:Z

    .line 1019
    .line 1020
    if-eqz v5, :cond_36

    .line 1021
    .line 1022
    invoke-virtual {v1}, LW1/t;->f()Z

    .line 1023
    .line 1024
    .line 1025
    move-result v5

    .line 1026
    if-nez v5, :cond_35

    .line 1027
    .line 1028
    goto :goto_1c

    .line 1029
    :cond_35
    sub-long v7, v2, v11

    .line 1030
    .line 1031
    iget-wide v11, v1, LW1/t;->N:J

    .line 1032
    .line 1033
    add-long/2addr v11, v7

    .line 1034
    iput-wide v11, v1, LW1/t;->N:J

    .line 1035
    .line 1036
    const/4 v15, 0x0

    .line 1037
    iput-boolean v15, v1, LW1/t;->L:Z

    .line 1038
    .line 1039
    invoke-virtual/range {p0 .. p2}, LW1/t;->a(J)V

    .line 1040
    .line 1041
    .line 1042
    iget-object v5, v1, LW1/t;->r:Lxa/d;

    .line 1043
    .line 1044
    if-eqz v5, :cond_36

    .line 1045
    .line 1046
    cmp-long v7, v7, v18

    .line 1047
    .line 1048
    if-eqz v7, :cond_36

    .line 1049
    .line 1050
    iget-object v5, v5, Lxa/d;->b:Ljava/lang/Object;

    .line 1051
    .line 1052
    check-cast v5, LW1/v;

    .line 1053
    .line 1054
    iput-boolean v6, v5, LW1/v;->M0:Z

    .line 1055
    .line 1056
    :cond_36
    iget-object v5, v1, LW1/t;->t:LW1/n;

    .line 1057
    .line 1058
    iget v5, v5, LW1/n;->c:I

    .line 1059
    .line 1060
    if-nez v5, :cond_37

    .line 1061
    .line 1062
    iget-wide v7, v1, LW1/t;->G:J

    .line 1063
    .line 1064
    invoke-virtual {v4}, Ljava/nio/Buffer;->remaining()I

    .line 1065
    .line 1066
    .line 1067
    move-result v5

    .line 1068
    int-to-long v11, v5

    .line 1069
    add-long/2addr v7, v11

    .line 1070
    iput-wide v7, v1, LW1/t;->G:J

    .line 1071
    .line 1072
    goto :goto_1d

    .line 1073
    :cond_37
    iget-wide v7, v1, LW1/t;->H:J

    .line 1074
    .line 1075
    iget v5, v1, LW1/t;->K:I

    .line 1076
    .line 1077
    int-to-long v11, v5

    .line 1078
    int-to-long v13, v0

    .line 1079
    mul-long/2addr v11, v13

    .line 1080
    add-long/2addr v11, v7

    .line 1081
    iput-wide v11, v1, LW1/t;->H:J

    .line 1082
    .line 1083
    :goto_1d
    iput-object v4, v1, LW1/t;->P:Ljava/nio/ByteBuffer;

    .line 1084
    .line 1085
    iput v0, v1, LW1/t;->Q:I

    .line 1086
    .line 1087
    :cond_38
    invoke-virtual/range {p0 .. p2}, LW1/t;->t(J)V

    .line 1088
    .line 1089
    .line 1090
    iget-object v0, v1, LW1/t;->P:Ljava/nio/ByteBuffer;

    .line 1091
    .line 1092
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 1093
    .line 1094
    .line 1095
    move-result v0

    .line 1096
    if-nez v0, :cond_39

    .line 1097
    .line 1098
    const/4 v5, 0x0

    .line 1099
    iput-object v5, v1, LW1/t;->P:Ljava/nio/ByteBuffer;

    .line 1100
    .line 1101
    const/4 v15, 0x0

    .line 1102
    iput v15, v1, LW1/t;->Q:I

    .line 1103
    .line 1104
    return v6

    .line 1105
    :cond_39
    invoke-virtual {v1}, LW1/t;->k()J

    .line 1106
    .line 1107
    .line 1108
    move-result-wide v2

    .line 1109
    iget-wide v4, v10, LW1/l;->y:J

    .line 1110
    .line 1111
    cmp-long v0, v4, v16

    .line 1112
    .line 1113
    if-eqz v0, :cond_30

    .line 1114
    .line 1115
    cmp-long v0, v2, v18

    .line 1116
    .line 1117
    if-lez v0, :cond_30

    .line 1118
    .line 1119
    iget-object v0, v10, LW1/l;->I:LQ1/q;

    .line 1120
    .line 1121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1122
    .line 1123
    .line 1124
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1125
    .line 1126
    .line 1127
    move-result-wide v2

    .line 1128
    iget-wide v4, v10, LW1/l;->y:J

    .line 1129
    .line 1130
    sub-long/2addr v2, v4

    .line 1131
    const-wide/16 v4, 0xc8

    .line 1132
    .line 1133
    cmp-long v0, v2, v4

    .line 1134
    .line 1135
    if-ltz v0, :cond_30

    .line 1136
    .line 1137
    const-string v0, "DefaultAudioSink"

    .line 1138
    .line 1139
    const-string v2, "Resetting stalled audio track"

    .line 1140
    .line 1141
    invoke-static {v0, v2}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual {v1}, LW1/t;->g()V

    .line 1145
    .line 1146
    .line 1147
    return v6

    .line 1148
    :goto_1e
    return v15

    .line 1149
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_1
        :pswitch_4
        :pswitch_4
    .end packed-switch

    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    :pswitch_data_1
    .packed-switch 0xe
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_7
    .end packed-switch
.end method

.method public final m()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, LW1/t;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget v0, LQ1/x;->a:I

    .line 8
    .line 9
    const/16 v1, 0x1d

    .line 10
    .line 11
    if-lt v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LW1/t;->v:Landroid/media/AudioTrack;

    .line 14
    .line 15
    invoke-static {v0}, LG5/d;->z(Landroid/media/AudioTrack;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, LW1/t;->U:Z

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, LW1/t;->g:LW1/l;

    .line 26
    .line 27
    invoke-virtual {p0}, LW1/t;->k()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-virtual {v0, v1, v2}, LW1/l;->c(J)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    return v0

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    return v0
.end method

.method public final n()Z
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LW1/t;->l:LW1/r;

    .line 4
    .line 5
    iget-object v2, v0, LW1/r;->c:Ljava/io/Serializable;

    .line 6
    .line 7
    check-cast v2, Ljava/lang/Exception;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    sget-object v2, LW1/t;->j0:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v2

    .line 17
    :try_start_0
    sget v5, LW1/t;->l0:I

    .line 18
    .line 19
    if-lez v5, :cond_1

    .line 20
    .line 21
    move v5, v4

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move v5, v3

    .line 24
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    if-eqz v5, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 29
    .line 30
    .line 31
    move-result-wide v5

    .line 32
    iget-wide v7, v0, LW1/r;->b:J

    .line 33
    .line 34
    cmp-long v0, v5, v7

    .line 35
    .line 36
    if-gez v0, :cond_3

    .line 37
    .line 38
    :goto_1
    move v0, v4

    .line 39
    goto :goto_3

    .line 40
    :cond_3
    :goto_2
    move v0, v3

    .line 41
    :goto_3
    if-eqz v0, :cond_4

    .line 42
    .line 43
    return v3

    .line 44
    :cond_4
    :try_start_1
    iget-object v0, v1, LW1/t;->t:LW1/n;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v0}, LW1/t;->c(LW1/n;)Landroid/media/AudioTrack;

    .line 50
    .line 51
    .line 52
    move-result-object v0
    :try_end_1
    .catch LW1/i; {:try_start_1 .. :try_end_1} :catch_0

    .line 53
    goto :goto_4

    .line 54
    :catch_0
    move-exception v0

    .line 55
    move-object v2, v0

    .line 56
    iget-object v0, v1, LW1/t;->t:LW1/n;

    .line 57
    .line 58
    iget v5, v0, LW1/n;->h:I

    .line 59
    .line 60
    const v6, 0xf4240

    .line 61
    .line 62
    .line 63
    if-le v5, v6, :cond_10

    .line 64
    .line 65
    new-instance v7, LW1/n;

    .line 66
    .line 67
    iget-boolean v5, v0, LW1/n;->l:Z

    .line 68
    .line 69
    iget-object v8, v0, LW1/n;->a:LN1/n;

    .line 70
    .line 71
    iget v9, v0, LW1/n;->b:I

    .line 72
    .line 73
    iget v10, v0, LW1/n;->c:I

    .line 74
    .line 75
    iget v11, v0, LW1/n;->d:I

    .line 76
    .line 77
    iget v12, v0, LW1/n;->e:I

    .line 78
    .line 79
    iget v13, v0, LW1/n;->f:I

    .line 80
    .line 81
    iget v14, v0, LW1/n;->g:I

    .line 82
    .line 83
    iget-object v6, v0, LW1/n;->i:LO1/a;

    .line 84
    .line 85
    iget-boolean v15, v0, LW1/n;->j:Z

    .line 86
    .line 87
    iget-boolean v0, v0, LW1/n;->k:Z

    .line 88
    .line 89
    move/from16 v17, v15

    .line 90
    .line 91
    const v15, 0xf4240

    .line 92
    .line 93
    .line 94
    move/from16 v18, v0

    .line 95
    .line 96
    move/from16 v19, v5

    .line 97
    .line 98
    move-object/from16 v16, v6

    .line 99
    .line 100
    invoke-direct/range {v7 .. v19}, LW1/n;-><init>(LN1/n;IIIIIIILO1/a;ZZZ)V

    .line 101
    .line 102
    .line 103
    :try_start_2
    invoke-virtual {v1, v7}, LW1/t;->c(LW1/n;)Landroid/media/AudioTrack;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iput-object v7, v1, LW1/t;->t:LW1/n;
    :try_end_2
    .catch LW1/i; {:try_start_2 .. :try_end_2} :catch_1

    .line 108
    .line 109
    :goto_4
    iput-object v0, v1, LW1/t;->v:Landroid/media/AudioTrack;

    .line 110
    .line 111
    invoke-static {v0}, LW1/t;->p(Landroid/media/AudioTrack;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_6

    .line 116
    .line 117
    iget-object v0, v1, LW1/t;->v:Landroid/media/AudioTrack;

    .line 118
    .line 119
    iget-object v2, v1, LW1/t;->k:LG9/e;

    .line 120
    .line 121
    if-nez v2, :cond_5

    .line 122
    .line 123
    new-instance v2, LG9/e;

    .line 124
    .line 125
    invoke-direct {v2, v1}, LG9/e;-><init>(LW1/t;)V

    .line 126
    .line 127
    .line 128
    iput-object v2, v1, LW1/t;->k:LG9/e;

    .line 129
    .line 130
    :cond_5
    iget-object v2, v1, LW1/t;->k:LG9/e;

    .line 131
    .line 132
    iget-object v5, v2, LG9/e;->b:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v5, Landroid/os/Handler;

    .line 135
    .line 136
    invoke-static {v5}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    new-instance v6, LW1/s;

    .line 140
    .line 141
    const/4 v7, 0x0

    .line 142
    invoke-direct {v6, v5, v7}, LW1/s;-><init>(Ljava/lang/Object;I)V

    .line 143
    .line 144
    .line 145
    iget-object v2, v2, LG9/e;->c:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, LG5/F;

    .line 148
    .line 149
    invoke-static {v0, v6, v2}, LG5/d;->C(Landroid/media/AudioTrack;LW1/s;LG5/F;)V

    .line 150
    .line 151
    .line 152
    iget-object v0, v1, LW1/t;->t:LW1/n;

    .line 153
    .line 154
    iget-boolean v2, v0, LW1/n;->k:Z

    .line 155
    .line 156
    if-eqz v2, :cond_6

    .line 157
    .line 158
    iget-object v2, v1, LW1/t;->v:Landroid/media/AudioTrack;

    .line 159
    .line 160
    iget-object v0, v0, LW1/n;->a:LN1/n;

    .line 161
    .line 162
    iget v5, v0, LN1/n;->F:I

    .line 163
    .line 164
    iget v0, v0, LN1/n;->G:I

    .line 165
    .line 166
    invoke-static {v2, v5, v0}, LG5/d;->r(Landroid/media/AudioTrack;II)V

    .line 167
    .line 168
    .line 169
    :cond_6
    sget v0, LQ1/x;->a:I

    .line 170
    .line 171
    const/16 v2, 0x1f

    .line 172
    .line 173
    if-lt v0, v2, :cond_7

    .line 174
    .line 175
    iget-object v2, v1, LW1/t;->q:LV1/k;

    .line 176
    .line 177
    if-eqz v2, :cond_7

    .line 178
    .line 179
    iget-object v5, v1, LW1/t;->v:Landroid/media/AudioTrack;

    .line 180
    .line 181
    iget-object v2, v2, LV1/k;->b:LV1/j;

    .line 182
    .line 183
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    iget-object v2, v2, LV1/j;->a:Landroid/media/metrics/LogSessionId;

    .line 187
    .line 188
    invoke-static {}, LF5/i;->g()Landroid/media/metrics/LogSessionId;

    .line 189
    .line 190
    .line 191
    invoke-static {v2}, LV1/h;->v(Landroid/media/metrics/LogSessionId;)Z

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    if-nez v6, :cond_7

    .line 196
    .line 197
    invoke-static {v5, v2}, LV1/h;->o(Landroid/media/AudioTrack;Landroid/media/metrics/LogSessionId;)V

    .line 198
    .line 199
    .line 200
    :cond_7
    iget-object v2, v1, LW1/t;->v:Landroid/media/AudioTrack;

    .line 201
    .line 202
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    iput v2, v1, LW1/t;->X:I

    .line 207
    .line 208
    iget-object v2, v1, LW1/t;->v:Landroid/media/AudioTrack;

    .line 209
    .line 210
    iget-object v5, v1, LW1/t;->t:LW1/n;

    .line 211
    .line 212
    iget v6, v5, LW1/n;->c:I

    .line 213
    .line 214
    const/4 v7, 0x2

    .line 215
    if-ne v6, v7, :cond_8

    .line 216
    .line 217
    move v6, v4

    .line 218
    goto :goto_5

    .line 219
    :cond_8
    move v6, v3

    .line 220
    :goto_5
    iget v7, v5, LW1/n;->g:I

    .line 221
    .line 222
    iget v8, v5, LW1/n;->d:I

    .line 223
    .line 224
    iget v5, v5, LW1/n;->h:I

    .line 225
    .line 226
    iget-object v9, v1, LW1/t;->g:LW1/l;

    .line 227
    .line 228
    iput-object v2, v9, LW1/l;->c:Landroid/media/AudioTrack;

    .line 229
    .line 230
    iput v5, v9, LW1/l;->d:I

    .line 231
    .line 232
    new-instance v10, LG5/v;

    .line 233
    .line 234
    const/4 v11, 0x1

    .line 235
    invoke-direct {v10, v2, v11}, LG5/v;-><init>(Landroid/media/AudioTrack;I)V

    .line 236
    .line 237
    .line 238
    iput-object v10, v9, LW1/l;->e:LG5/v;

    .line 239
    .line 240
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getSampleRate()I

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    iput v2, v9, LW1/l;->f:I

    .line 245
    .line 246
    const/16 v2, 0x17

    .line 247
    .line 248
    if-eqz v6, :cond_a

    .line 249
    .line 250
    if-ge v0, v2, :cond_a

    .line 251
    .line 252
    const/4 v6, 0x5

    .line 253
    if-eq v7, v6, :cond_9

    .line 254
    .line 255
    const/4 v6, 0x6

    .line 256
    if-ne v7, v6, :cond_a

    .line 257
    .line 258
    :cond_9
    move v6, v4

    .line 259
    goto :goto_6

    .line 260
    :cond_a
    move v6, v3

    .line 261
    :goto_6
    iput-boolean v6, v9, LW1/l;->g:Z

    .line 262
    .line 263
    invoke-static {v7}, LQ1/x;->F(I)Z

    .line 264
    .line 265
    .line 266
    move-result v6

    .line 267
    iput-boolean v6, v9, LW1/l;->p:Z

    .line 268
    .line 269
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    if-eqz v6, :cond_b

    .line 275
    .line 276
    div-int/2addr v5, v8

    .line 277
    int-to-long v5, v5

    .line 278
    iget v7, v9, LW1/l;->f:I

    .line 279
    .line 280
    invoke-static {v7, v5, v6}, LQ1/x;->Q(IJ)J

    .line 281
    .line 282
    .line 283
    move-result-wide v5

    .line 284
    goto :goto_7

    .line 285
    :cond_b
    move-wide v5, v10

    .line 286
    :goto_7
    iput-wide v5, v9, LW1/l;->h:J

    .line 287
    .line 288
    const-wide/16 v5, 0x0

    .line 289
    .line 290
    iput-wide v5, v9, LW1/l;->s:J

    .line 291
    .line 292
    iput-wide v5, v9, LW1/l;->t:J

    .line 293
    .line 294
    iput-boolean v3, v9, LW1/l;->G:Z

    .line 295
    .line 296
    iput-wide v5, v9, LW1/l;->H:J

    .line 297
    .line 298
    iput-wide v5, v9, LW1/l;->u:J

    .line 299
    .line 300
    iput-boolean v3, v9, LW1/l;->o:Z

    .line 301
    .line 302
    iput-wide v10, v9, LW1/l;->x:J

    .line 303
    .line 304
    iput-wide v10, v9, LW1/l;->y:J

    .line 305
    .line 306
    iput-wide v5, v9, LW1/l;->q:J

    .line 307
    .line 308
    iput-wide v5, v9, LW1/l;->n:J

    .line 309
    .line 310
    const/high16 v3, 0x3f800000    # 1.0f

    .line 311
    .line 312
    iput v3, v9, LW1/l;->i:F

    .line 313
    .line 314
    invoke-virtual {v1}, LW1/t;->o()Z

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    if-eqz v3, :cond_c

    .line 319
    .line 320
    iget-object v3, v1, LW1/t;->v:Landroid/media/AudioTrack;

    .line 321
    .line 322
    iget v5, v1, LW1/t;->O:F

    .line 323
    .line 324
    invoke-virtual {v3, v5}, Landroid/media/AudioTrack;->setVolume(F)I

    .line 325
    .line 326
    .line 327
    :cond_c
    iget-object v3, v1, LW1/t;->Y:LN1/d;

    .line 328
    .line 329
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    iget-object v3, v1, LW1/t;->Z:LY9/c;

    .line 333
    .line 334
    if-eqz v3, :cond_d

    .line 335
    .line 336
    if-lt v0, v2, :cond_d

    .line 337
    .line 338
    iget-object v2, v1, LW1/t;->v:Landroid/media/AudioTrack;

    .line 339
    .line 340
    iget-object v3, v3, LY9/c;->b:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v3, Landroid/media/AudioDeviceInfo;

    .line 343
    .line 344
    invoke-virtual {v2, v3}, Landroid/media/AudioTrack;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)Z

    .line 345
    .line 346
    .line 347
    iget-object v2, v1, LW1/t;->x:LJ9/o;

    .line 348
    .line 349
    if-eqz v2, :cond_d

    .line 350
    .line 351
    iget-object v3, v1, LW1/t;->Z:LY9/c;

    .line 352
    .line 353
    iget-object v3, v3, LY9/c;->b:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v3, Landroid/media/AudioDeviceInfo;

    .line 356
    .line 357
    invoke-virtual {v2, v3}, LJ9/o;->h(Landroid/media/AudioDeviceInfo;)V

    .line 358
    .line 359
    .line 360
    :cond_d
    const/16 v2, 0x18

    .line 361
    .line 362
    if-lt v0, v2, :cond_e

    .line 363
    .line 364
    iget-object v0, v1, LW1/t;->x:LJ9/o;

    .line 365
    .line 366
    if-eqz v0, :cond_e

    .line 367
    .line 368
    new-instance v2, LDd/c;

    .line 369
    .line 370
    iget-object v3, v1, LW1/t;->v:Landroid/media/AudioTrack;

    .line 371
    .line 372
    invoke-direct {v2, v3, v0}, LDd/c;-><init>(Landroid/media/AudioTrack;LJ9/o;)V

    .line 373
    .line 374
    .line 375
    iput-object v2, v1, LW1/t;->y:LDd/c;

    .line 376
    .line 377
    :cond_e
    iput-boolean v4, v1, LW1/t;->M:Z

    .line 378
    .line 379
    iget-object v0, v1, LW1/t;->r:Lxa/d;

    .line 380
    .line 381
    if-eqz v0, :cond_f

    .line 382
    .line 383
    iget-object v2, v1, LW1/t;->t:LW1/n;

    .line 384
    .line 385
    invoke-virtual {v2}, LW1/n;->a()LW1/g;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    iget-object v0, v0, Lxa/d;->b:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v0, LW1/v;

    .line 392
    .line 393
    iget-object v0, v0, LW1/v;->D0:LS3/s;

    .line 394
    .line 395
    iget-object v3, v0, LS3/s;->b:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v3, Landroid/os/Handler;

    .line 398
    .line 399
    if-eqz v3, :cond_f

    .line 400
    .line 401
    new-instance v5, LW1/f;

    .line 402
    .line 403
    const/4 v6, 0x1

    .line 404
    invoke-direct {v5, v0, v2, v6}, LW1/f;-><init>(LS3/s;Ljava/lang/Object;I)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v3, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 408
    .line 409
    .line 410
    :cond_f
    return v4

    .line 411
    :catch_1
    move-exception v0

    .line 412
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 413
    .line 414
    .line 415
    :cond_10
    iget-object v0, v1, LW1/t;->t:LW1/n;

    .line 416
    .line 417
    iget v0, v0, LW1/n;->c:I

    .line 418
    .line 419
    if-ne v0, v4, :cond_11

    .line 420
    .line 421
    iput-boolean v4, v1, LW1/t;->d0:Z

    .line 422
    .line 423
    :cond_11
    throw v2

    .line 424
    :catchall_0
    move-exception v0

    .line 425
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 426
    throw v0
.end method

.method public final o()Z
    .locals 1

    .line 1
    iget-object v0, p0, LW1/t;->v:Landroid/media/AudioTrack;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final q()V
    .locals 6

    .line 1
    iget-object v0, p0, LW1/t;->x:LJ9/o;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, LW1/t;->a:Landroid/content/Context;

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, LW1/t;->f0:Landroid/os/Looper;

    .line 14
    .line 15
    new-instance v1, LJ9/o;

    .line 16
    .line 17
    new-instance v2, LS8/b;

    .line 18
    .line 19
    const/16 v3, 0xb

    .line 20
    .line 21
    invoke-direct {v2, p0, v3}, LS8/b;-><init>(Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    iget-object v3, p0, LW1/t;->z:LN1/c;

    .line 25
    .line 26
    iget-object v4, p0, LW1/t;->Z:LY9/c;

    .line 27
    .line 28
    invoke-direct {v1, v0, v2, v3, v4}, LJ9/o;-><init>(Landroid/content/Context;LS8/b;LN1/c;LY9/c;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, LW1/t;->x:LJ9/o;

    .line 32
    .line 33
    iget-boolean v0, v1, LJ9/o;->a:Z

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    iget-object v0, v1, LJ9/o;->h:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, LW1/b;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v0, 0x1

    .line 46
    iput-boolean v0, v1, LJ9/o;->a:Z

    .line 47
    .line 48
    iget-object v0, v1, LJ9/o;->g:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, LW1/d;

    .line 51
    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    iget-object v2, v0, LW1/d;->a:Landroid/content/ContentResolver;

    .line 55
    .line 56
    iget-object v3, v0, LW1/d;->b:Landroid/net/Uri;

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-virtual {v2, v3, v4, v0}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    sget v0, LQ1/x;->a:I

    .line 63
    .line 64
    iget-object v2, v1, LJ9/o;->d:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Landroid/os/Handler;

    .line 67
    .line 68
    const/16 v3, 0x17

    .line 69
    .line 70
    iget-object v4, v1, LJ9/o;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v4, Landroid/content/Context;

    .line 73
    .line 74
    if-lt v0, v3, :cond_2

    .line 75
    .line 76
    iget-object v0, v1, LJ9/o;->e:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, LW1/c;

    .line 79
    .line 80
    if-eqz v0, :cond_2

    .line 81
    .line 82
    const-string v3, "audio"

    .line 83
    .line 84
    invoke-virtual {v4, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, Landroid/media/AudioManager;

    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, v0, v2}, Landroid/media/AudioManager;->registerAudioDeviceCallback(Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    new-instance v0, Landroid/content/IntentFilter;

    .line 97
    .line 98
    const-string v3, "android.media.action.HDMI_AUDIO_PLUG"

    .line 99
    .line 100
    invoke-direct {v0, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const/4 v3, 0x0

    .line 104
    iget-object v5, v1, LJ9/o;->f:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v5, LA7/V1;

    .line 107
    .line 108
    invoke-virtual {v4, v5, v0, v3, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iget-object v2, v1, LJ9/o;->j:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v2, LN1/c;

    .line 115
    .line 116
    iget-object v3, v1, LJ9/o;->i:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v3, LY9/c;

    .line 119
    .line 120
    invoke-static {v4, v0, v2, v3}, LW1/b;->c(Landroid/content/Context;Landroid/content/Intent;LN1/c;LY9/c;)LW1/b;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    iput-object v0, v1, LJ9/o;->h:Ljava/lang/Object;

    .line 125
    .line 126
    :goto_0
    iput-object v0, p0, LW1/t;->w:LW1/b;

    .line 127
    .line 128
    :cond_3
    return-void
.end method

.method public final r()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LW1/t;->V:Z

    .line 3
    .line 4
    invoke-virtual {p0}, LW1/t;->o()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, LW1/t;->g:LW1/l;

    .line 11
    .line 12
    iget-wide v1, v0, LW1/l;->x:J

    .line 13
    .line 14
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v1, v1, v3

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v1, v0, LW1/l;->I:LQ1/q;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    invoke-static {v1, v2}, LQ1/x;->K(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    iput-wide v1, v0, LW1/l;->x:J

    .line 37
    .line 38
    :cond_0
    iget-object v0, v0, LW1/l;->e:LG5/v;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, LG5/v;->a()V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, LW1/t;->v:Landroid/media/AudioTrack;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
.end method

.method public final s()V
    .locals 5

    .line 1
    iget-boolean v0, p0, LW1/t;->T:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LW1/t;->T:Z

    .line 7
    .line 8
    invoke-virtual {p0}, LW1/t;->k()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object v2, p0, LW1/t;->g:LW1/l;

    .line 13
    .line 14
    invoke-virtual {v2}, LW1/l;->b()J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    iput-wide v3, v2, LW1/l;->z:J

    .line 19
    .line 20
    iget-object v3, v2, LW1/l;->I:LQ1/q;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    invoke-static {v3, v4}, LQ1/x;->K(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    iput-wide v3, v2, LW1/l;->x:J

    .line 34
    .line 35
    iput-wide v0, v2, LW1/l;->A:J

    .line 36
    .line 37
    iget-object v0, p0, LW1/t;->v:Landroid/media/AudioTrack;

    .line 38
    .line 39
    invoke-static {v0}, LW1/t;->p(Landroid/media/AudioTrack;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/4 v1, 0x0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    iput-boolean v1, p0, LW1/t;->U:Z

    .line 47
    .line 48
    :cond_0
    iget-object v0, p0, LW1/t;->v:Landroid/media/AudioTrack;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    .line 51
    .line 52
    .line 53
    iput v1, p0, LW1/t;->F:I

    .line 54
    .line 55
    :cond_1
    return-void
.end method

.method public final t(J)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, LW1/t;->e(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LW1/t;->R:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, LW1/t;->u:LO1/a;

    .line 11
    .line 12
    invoke-virtual {v0}, LO1/a;->e()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, LW1/t;->P:Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    if-eqz v0, :cond_8

    .line 21
    .line 22
    invoke-virtual {p0, v0}, LW1/t;->w(Ljava/nio/ByteBuffer;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1, p2}, LW1/t;->e(J)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    :goto_0
    iget-object v0, p0, LW1/t;->u:LO1/a;

    .line 30
    .line 31
    invoke-virtual {v0}, LO1/a;->d()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_8

    .line 36
    .line 37
    :cond_2
    iget-object v0, p0, LW1/t;->u:LO1/a;

    .line 38
    .line 39
    invoke-virtual {v0}, LO1/a;->e()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_3

    .line 44
    .line 45
    sget-object v0, LO1/d;->a:Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    iget-object v1, v0, LO1/a;->c:[Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    invoke-virtual {v0}, LO1/a;->c()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    aget-object v1, v1, v2

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    move-object v0, v1

    .line 63
    goto :goto_1

    .line 64
    :cond_4
    sget-object v1, LO1/d;->a:Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, LO1/a;->f(Ljava/nio/ByteBuffer;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, v0, LO1/a;->c:[Ljava/nio/ByteBuffer;

    .line 70
    .line 71
    invoke-virtual {v0}, LO1/a;->c()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    aget-object v0, v1, v0

    .line 76
    .line 77
    :goto_1
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_5

    .line 82
    .line 83
    invoke-virtual {p0, v0}, LW1/t;->w(Ljava/nio/ByteBuffer;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p1, p2}, LW1/t;->e(J)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, LW1/t;->R:Ljava/nio/ByteBuffer;

    .line 90
    .line 91
    if-eqz v0, :cond_2

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_5
    iget-object v0, p0, LW1/t;->P:Ljava/nio/ByteBuffer;

    .line 95
    .line 96
    if-eqz v0, :cond_8

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_6

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_6
    iget-object v0, p0, LW1/t;->u:LO1/a;

    .line 106
    .line 107
    iget-object v1, p0, LW1/t;->P:Ljava/nio/ByteBuffer;

    .line 108
    .line 109
    invoke-virtual {v0}, LO1/a;->e()Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_1

    .line 114
    .line 115
    iget-boolean v2, v0, LO1/a;->d:Z

    .line 116
    .line 117
    if-eqz v2, :cond_7

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_7
    invoke-virtual {v0, v1}, LO1/a;->f(Ljava/nio/ByteBuffer;)V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_8
    :goto_2
    return-void
.end method

.method public final u()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0}, LW1/t;->g()V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, LW1/t;->e:Ll8/e0;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ll8/K;->l(I)Ll8/I;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    invoke-virtual {v1}, Ll8/I;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Ll8/I;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, LO1/d;

    .line 22
    .line 23
    invoke-interface {v2}, LO1/d;->reset()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v1, p0, LW1/t;->f:Ll8/e0;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ll8/K;->l(I)Ll8/I;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :goto_1
    invoke-virtual {v1}, Ll8/I;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {v1}, Ll8/I;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, LO1/d;

    .line 44
    .line 45
    invoke-interface {v2}, LO1/d;->reset()V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v1, p0, LW1/t;->u:LO1/a;

    .line 50
    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    move v2, v0

    .line 54
    :goto_2
    iget-object v3, v1, LO1/a;->a:Ll8/e0;

    .line 55
    .line 56
    iget v4, v3, Ll8/e0;->d:I

    .line 57
    .line 58
    if-ge v2, v4, :cond_2

    .line 59
    .line 60
    invoke-virtual {v3, v2}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, LO1/d;

    .line 65
    .line 66
    invoke-interface {v3}, LO1/d;->flush()V

    .line 67
    .line 68
    .line 69
    invoke-interface {v3}, LO1/d;->reset()V

    .line 70
    .line 71
    .line 72
    add-int/lit8 v2, v2, 0x1

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_2
    new-array v2, v0, [Ljava/nio/ByteBuffer;

    .line 76
    .line 77
    iput-object v2, v1, LO1/a;->c:[Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    sget-object v2, LO1/b;->e:LO1/b;

    .line 80
    .line 81
    iput-boolean v0, v1, LO1/a;->d:Z

    .line 82
    .line 83
    :cond_3
    iput-boolean v0, p0, LW1/t;->V:Z

    .line 84
    .line 85
    iput-boolean v0, p0, LW1/t;->d0:Z

    .line 86
    .line 87
    return-void
.end method

.method public final v()V
    .locals 3

    .line 1
    invoke-virtual {p0}, LW1/t;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    new-instance v0, Landroid/media/PlaybackParams;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/media/PlaybackParams;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/media/PlaybackParams;->allowDefaults()Landroid/media/PlaybackParams;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, LW1/t;->C:LN1/F;

    .line 17
    .line 18
    iget v1, v1, LN1/F;->a:F

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, LW1/t;->C:LN1/F;

    .line 25
    .line 26
    iget v1, v1, LN1/F;->b:F

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setPitch(F)Landroid/media/PlaybackParams;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v1, 0x2

    .line 33
    invoke-virtual {v0, v1}, Landroid/media/PlaybackParams;->setAudioFallbackMode(I)Landroid/media/PlaybackParams;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :try_start_0
    iget-object v1, p0, LW1/t;->v:Landroid/media/AudioTrack;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Landroid/media/AudioTrack;->setPlaybackParams(Landroid/media/PlaybackParams;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception v0

    .line 44
    const-string v1, "DefaultAudioSink"

    .line 45
    .line 46
    const-string v2, "Failed to set playback params"

    .line 47
    .line 48
    invoke-static {v1, v2, v0}, LQ1/k;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    new-instance v0, LN1/F;

    .line 52
    .line 53
    iget-object v1, p0, LW1/t;->v:Landroid/media/AudioTrack;

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Landroid/media/PlaybackParams;->getSpeed()F

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    iget-object v2, p0, LW1/t;->v:Landroid/media/AudioTrack;

    .line 64
    .line 65
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, Landroid/media/PlaybackParams;->getPitch()F

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-direct {v0, v1, v2}, LN1/F;-><init>(FF)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, LW1/t;->C:LN1/F;

    .line 77
    .line 78
    iget-object v1, p0, LW1/t;->g:LW1/l;

    .line 79
    .line 80
    iget v0, v0, LN1/F;->a:F

    .line 81
    .line 82
    iput v0, v1, LW1/l;->i:F

    .line 83
    .line 84
    iget-object v0, v1, LW1/l;->e:LG5/v;

    .line 85
    .line 86
    if-eqz v0, :cond_0

    .line 87
    .line 88
    invoke-virtual {v0}, LG5/v;->a()V

    .line 89
    .line 90
    .line 91
    :cond_0
    invoke-virtual {v1}, LW1/l;->d()V

    .line 92
    .line 93
    .line 94
    :cond_1
    return-void
.end method

.method public final w(Ljava/nio/ByteBuffer;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LW1/t;->R:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    invoke-static {v1}, LQ1/k;->g(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    iget-object v1, v0, LW1/t;->t:LW1/n;

    .line 21
    .line 22
    iget v1, v1, LW1/n;->c:I

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    const-wide/16 v1, 0x14

    .line 28
    .line 29
    invoke-static {v1, v2}, LQ1/x;->K(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    iget-object v1, v0, LW1/t;->t:LW1/n;

    .line 34
    .line 35
    iget v1, v1, LW1/n;->e:I

    .line 36
    .line 37
    int-to-long v5, v1

    .line 38
    const-wide/32 v7, 0xf4240

    .line 39
    .line 40
    .line 41
    sget-object v9, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 42
    .line 43
    invoke-static/range {v3 .. v9}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 44
    .line 45
    .line 46
    move-result-wide v1

    .line 47
    long-to-int v1, v1

    .line 48
    invoke-virtual {v0}, LW1/t;->k()J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    int-to-long v4, v1

    .line 53
    cmp-long v6, v2, v4

    .line 54
    .line 55
    if-ltz v6, :cond_3

    .line 56
    .line 57
    :goto_1
    move-object/from16 v3, p1

    .line 58
    .line 59
    goto/16 :goto_8

    .line 60
    .line 61
    :cond_3
    iget-object v6, v0, LW1/t;->t:LW1/n;

    .line 62
    .line 63
    iget v7, v6, LW1/n;->g:I

    .line 64
    .line 65
    long-to-int v2, v2

    .line 66
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->remaining()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-virtual {v3, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    :cond_4
    :goto_2
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    if-eqz v9, :cond_17

    .line 91
    .line 92
    if-ge v2, v1, :cond_17

    .line 93
    .line 94
    const/high16 v12, 0x50000000

    .line 95
    .line 96
    const/high16 v13, 0x10000000

    .line 97
    .line 98
    const/16 v14, 0x16

    .line 99
    .line 100
    const/16 v15, 0x15

    .line 101
    .line 102
    const/high16 v16, 0x4f000000

    .line 103
    .line 104
    const/4 v9, 0x4

    .line 105
    const/high16 v17, -0x31000000

    .line 106
    .line 107
    const/4 v10, 0x3

    .line 108
    const/4 v11, 0x2

    .line 109
    if-eq v7, v11, :cond_d

    .line 110
    .line 111
    if-eq v7, v10, :cond_c

    .line 112
    .line 113
    if-eq v7, v9, :cond_a

    .line 114
    .line 115
    if-eq v7, v15, :cond_9

    .line 116
    .line 117
    if-eq v7, v14, :cond_8

    .line 118
    .line 119
    if-eq v7, v13, :cond_7

    .line 120
    .line 121
    if-eq v7, v12, :cond_6

    .line 122
    .line 123
    const/high16 v12, 0x60000000

    .line 124
    .line 125
    if-ne v7, v12, :cond_5

    .line 126
    .line 127
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 128
    .line 129
    .line 130
    move-result v12

    .line 131
    and-int/lit16 v12, v12, 0xff

    .line 132
    .line 133
    shl-int/lit8 v12, v12, 0x18

    .line 134
    .line 135
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 136
    .line 137
    .line 138
    move-result v13

    .line 139
    and-int/lit16 v13, v13, 0xff

    .line 140
    .line 141
    shl-int/lit8 v13, v13, 0x10

    .line 142
    .line 143
    or-int/2addr v12, v13

    .line 144
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 145
    .line 146
    .line 147
    move-result v13

    .line 148
    and-int/lit16 v13, v13, 0xff

    .line 149
    .line 150
    shl-int/lit8 v13, v13, 0x8

    .line 151
    .line 152
    or-int/2addr v12, v13

    .line 153
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 154
    .line 155
    .line 156
    move-result v13

    .line 157
    and-int/lit16 v13, v13, 0xff

    .line 158
    .line 159
    :goto_3
    or-int/2addr v12, v13

    .line 160
    goto/16 :goto_6

    .line 161
    .line 162
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 163
    .line 164
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 165
    .line 166
    .line 167
    throw v1

    .line 168
    :cond_6
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 169
    .line 170
    .line 171
    move-result v12

    .line 172
    and-int/lit16 v12, v12, 0xff

    .line 173
    .line 174
    shl-int/lit8 v12, v12, 0x18

    .line 175
    .line 176
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 177
    .line 178
    .line 179
    move-result v13

    .line 180
    and-int/lit16 v13, v13, 0xff

    .line 181
    .line 182
    shl-int/lit8 v13, v13, 0x10

    .line 183
    .line 184
    or-int/2addr v12, v13

    .line 185
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 186
    .line 187
    .line 188
    move-result v13

    .line 189
    and-int/lit16 v13, v13, 0xff

    .line 190
    .line 191
    shl-int/lit8 v13, v13, 0x8

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_7
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 195
    .line 196
    .line 197
    move-result v12

    .line 198
    and-int/lit16 v12, v12, 0xff

    .line 199
    .line 200
    shl-int/lit8 v12, v12, 0x18

    .line 201
    .line 202
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 203
    .line 204
    .line 205
    move-result v13

    .line 206
    and-int/lit16 v13, v13, 0xff

    .line 207
    .line 208
    shl-int/lit8 v13, v13, 0x10

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_8
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 212
    .line 213
    .line 214
    move-result v12

    .line 215
    and-int/lit16 v12, v12, 0xff

    .line 216
    .line 217
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 218
    .line 219
    .line 220
    move-result v13

    .line 221
    and-int/lit16 v13, v13, 0xff

    .line 222
    .line 223
    shl-int/lit8 v13, v13, 0x8

    .line 224
    .line 225
    or-int/2addr v12, v13

    .line 226
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 227
    .line 228
    .line 229
    move-result v13

    .line 230
    and-int/lit16 v13, v13, 0xff

    .line 231
    .line 232
    shl-int/lit8 v13, v13, 0x10

    .line 233
    .line 234
    or-int/2addr v12, v13

    .line 235
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 236
    .line 237
    .line 238
    move-result v13

    .line 239
    :goto_4
    and-int/lit16 v13, v13, 0xff

    .line 240
    .line 241
    shl-int/lit8 v13, v13, 0x18

    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_9
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 245
    .line 246
    .line 247
    move-result v12

    .line 248
    and-int/lit16 v12, v12, 0xff

    .line 249
    .line 250
    shl-int/lit8 v12, v12, 0x8

    .line 251
    .line 252
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 253
    .line 254
    .line 255
    move-result v13

    .line 256
    and-int/lit16 v13, v13, 0xff

    .line 257
    .line 258
    shl-int/lit8 v13, v13, 0x10

    .line 259
    .line 260
    or-int/2addr v12, v13

    .line 261
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 262
    .line 263
    .line 264
    move-result v13

    .line 265
    goto :goto_4

    .line 266
    :cond_a
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 267
    .line 268
    .line 269
    move-result v12

    .line 270
    const/high16 v13, -0x40800000    # -1.0f

    .line 271
    .line 272
    const/high16 v14, 0x3f800000    # 1.0f

    .line 273
    .line 274
    invoke-static {v12, v13, v14}, LQ1/x;->h(FFF)F

    .line 275
    .line 276
    .line 277
    move-result v12

    .line 278
    const/4 v13, 0x0

    .line 279
    cmpg-float v13, v12, v13

    .line 280
    .line 281
    if-gez v13, :cond_b

    .line 282
    .line 283
    neg-float v12, v12

    .line 284
    mul-float v12, v12, v17

    .line 285
    .line 286
    :goto_5
    float-to-int v12, v12

    .line 287
    goto :goto_6

    .line 288
    :cond_b
    mul-float v12, v12, v16

    .line 289
    .line 290
    goto :goto_5

    .line 291
    :cond_c
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 292
    .line 293
    .line 294
    move-result v12

    .line 295
    and-int/lit16 v12, v12, 0xff

    .line 296
    .line 297
    shl-int/lit8 v12, v12, 0x18

    .line 298
    .line 299
    goto :goto_6

    .line 300
    :cond_d
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 301
    .line 302
    .line 303
    move-result v12

    .line 304
    and-int/lit16 v12, v12, 0xff

    .line 305
    .line 306
    shl-int/lit8 v12, v12, 0x10

    .line 307
    .line 308
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 309
    .line 310
    .line 311
    move-result v13

    .line 312
    goto :goto_4

    .line 313
    :goto_6
    int-to-long v12, v12

    .line 314
    int-to-long v9, v2

    .line 315
    mul-long/2addr v12, v9

    .line 316
    div-long/2addr v12, v4

    .line 317
    long-to-int v9, v12

    .line 318
    if-eq v7, v11, :cond_16

    .line 319
    .line 320
    const/4 v10, 0x3

    .line 321
    if-eq v7, v10, :cond_15

    .line 322
    .line 323
    const/4 v14, 0x4

    .line 324
    if-eq v7, v14, :cond_13

    .line 325
    .line 326
    if-eq v7, v15, :cond_12

    .line 327
    .line 328
    const/16 v10, 0x16

    .line 329
    .line 330
    if-eq v7, v10, :cond_11

    .line 331
    .line 332
    const/high16 v10, 0x10000000

    .line 333
    .line 334
    if-eq v7, v10, :cond_10

    .line 335
    .line 336
    const/high16 v10, 0x50000000

    .line 337
    .line 338
    if-eq v7, v10, :cond_f

    .line 339
    .line 340
    const/high16 v12, 0x60000000

    .line 341
    .line 342
    if-ne v7, v12, :cond_e

    .line 343
    .line 344
    shr-int/lit8 v10, v9, 0x18

    .line 345
    .line 346
    int-to-byte v10, v10

    .line 347
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 348
    .line 349
    .line 350
    shr-int/lit8 v10, v9, 0x10

    .line 351
    .line 352
    int-to-byte v10, v10

    .line 353
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 354
    .line 355
    .line 356
    shr-int/lit8 v10, v9, 0x8

    .line 357
    .line 358
    int-to-byte v10, v10

    .line 359
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 360
    .line 361
    .line 362
    int-to-byte v9, v9

    .line 363
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 364
    .line 365
    .line 366
    goto/16 :goto_7

    .line 367
    .line 368
    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 369
    .line 370
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 371
    .line 372
    .line 373
    throw v1

    .line 374
    :cond_f
    shr-int/lit8 v10, v9, 0x18

    .line 375
    .line 376
    int-to-byte v10, v10

    .line 377
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 378
    .line 379
    .line 380
    shr-int/lit8 v10, v9, 0x10

    .line 381
    .line 382
    int-to-byte v10, v10

    .line 383
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 384
    .line 385
    .line 386
    shr-int/lit8 v9, v9, 0x8

    .line 387
    .line 388
    int-to-byte v9, v9

    .line 389
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 390
    .line 391
    .line 392
    goto :goto_7

    .line 393
    :cond_10
    shr-int/lit8 v10, v9, 0x18

    .line 394
    .line 395
    int-to-byte v10, v10

    .line 396
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 397
    .line 398
    .line 399
    shr-int/lit8 v9, v9, 0x10

    .line 400
    .line 401
    int-to-byte v9, v9

    .line 402
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 403
    .line 404
    .line 405
    goto :goto_7

    .line 406
    :cond_11
    int-to-byte v10, v9

    .line 407
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 408
    .line 409
    .line 410
    shr-int/lit8 v10, v9, 0x8

    .line 411
    .line 412
    int-to-byte v10, v10

    .line 413
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 414
    .line 415
    .line 416
    shr-int/lit8 v10, v9, 0x10

    .line 417
    .line 418
    int-to-byte v10, v10

    .line 419
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 420
    .line 421
    .line 422
    shr-int/lit8 v9, v9, 0x18

    .line 423
    .line 424
    int-to-byte v9, v9

    .line 425
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 426
    .line 427
    .line 428
    goto :goto_7

    .line 429
    :cond_12
    shr-int/lit8 v10, v9, 0x8

    .line 430
    .line 431
    int-to-byte v10, v10

    .line 432
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 433
    .line 434
    .line 435
    shr-int/lit8 v10, v9, 0x10

    .line 436
    .line 437
    int-to-byte v10, v10

    .line 438
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 439
    .line 440
    .line 441
    shr-int/lit8 v9, v9, 0x18

    .line 442
    .line 443
    int-to-byte v9, v9

    .line 444
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 445
    .line 446
    .line 447
    goto :goto_7

    .line 448
    :cond_13
    if-gez v9, :cond_14

    .line 449
    .line 450
    int-to-float v9, v9

    .line 451
    neg-float v9, v9

    .line 452
    div-float v9, v9, v17

    .line 453
    .line 454
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 455
    .line 456
    .line 457
    goto :goto_7

    .line 458
    :cond_14
    int-to-float v9, v9

    .line 459
    div-float v9, v9, v16

    .line 460
    .line 461
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 462
    .line 463
    .line 464
    goto :goto_7

    .line 465
    :cond_15
    shr-int/lit8 v9, v9, 0x18

    .line 466
    .line 467
    int-to-byte v9, v9

    .line 468
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 469
    .line 470
    .line 471
    goto :goto_7

    .line 472
    :cond_16
    shr-int/lit8 v10, v9, 0x10

    .line 473
    .line 474
    int-to-byte v10, v10

    .line 475
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 476
    .line 477
    .line 478
    shr-int/lit8 v9, v9, 0x18

    .line 479
    .line 480
    int-to-byte v9, v9

    .line 481
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 482
    .line 483
    .line 484
    :goto_7
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    .line 485
    .line 486
    .line 487
    move-result v9

    .line 488
    iget v10, v6, LW1/n;->d:I

    .line 489
    .line 490
    add-int/2addr v10, v8

    .line 491
    if-ne v9, v10, :cond_4

    .line 492
    .line 493
    add-int/lit8 v2, v2, 0x1

    .line 494
    .line 495
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    .line 496
    .line 497
    .line 498
    move-result v8

    .line 499
    goto/16 :goto_2

    .line 500
    .line 501
    :cond_17
    move-object/from16 v1, p1

    .line 502
    .line 503
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 507
    .line 508
    .line 509
    :goto_8
    iput-object v3, v0, LW1/t;->R:Ljava/nio/ByteBuffer;

    .line 510
    .line 511
    return-void
.end method

.method public final x()Z
    .locals 2

    .line 1
    iget-object v0, p0, LW1/t;->t:LW1/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, v0, LW1/n;->j:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget v0, LQ1/x;->a:I

    .line 10
    .line 11
    const/16 v1, 0x17

    .line 12
    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method
