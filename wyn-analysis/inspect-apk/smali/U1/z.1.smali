.class public final LU1/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Lk2/E;
.implements LU1/Q;


# static fields
.field public static final W:J


# instance fields
.field public A:LU1/P;

.field public B:LT5/s;

.field public C:Z

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:J

.field public H:Z

.field public I:I

.field public J:Z

.field public K:Z

.field public L:Z

.field public M:Z

.field public N:I

.field public O:LU1/y;

.field public P:J

.field public Q:J

.field public R:I

.field public S:Z

.field public T:LU1/j;

.field public U:J

.field public V:LU1/l;

.field public final a:[LU1/W;

.field public final b:Ljava/util/Set;

.field public final c:[LU1/X;

.field public final d:[Z

.field public final e:Ln2/s;

.field public final f:Ln2/t;

.field public final g:LU1/h;

.field public final h:Lo2/d;

.field public final i:LQ1/s;

.field public final j:Lc7/l;

.field public final k:Landroid/os/Looper;

.field public final l:LN1/M;

.field public final m:LN1/L;

.field public final n:J

.field public final o:LE5/l;

.field public final p:Ljava/util/ArrayList;

.field public final q:LQ1/q;

.field public final r:LU1/o;

.field public final s:LU1/G;

.field public final t:LE5/n0;

.field public final u:LU1/f;

.field public final v:J

.field public final w:LV1/k;

.field public final x:LV1/d;

.field public final y:LQ1/s;

.field public z:LU1/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x2710

    .line 2
    .line 3
    invoke-static {v0, v1}, LQ1/x;->W(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sput-wide v0, LU1/z;->W:J

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>([LU1/W;Ln2/s;Ln2/t;LU1/h;Lo2/d;IZLV1/d;LU1/a0;LU1/f;JLandroid/os/Looper;LQ1/q;LU1/o;LV1/k;LU1/l;)V
    .locals 9

    move-object/from16 v2, p8

    move-object/from16 v3, p14

    move-object/from16 v4, p16

    move-object/from16 v5, p17

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v6, p15

    .line 2
    iput-object v6, p0, LU1/z;->r:LU1/o;

    .line 3
    iput-object p1, p0, LU1/z;->a:[LU1/W;

    .line 4
    iput-object p2, p0, LU1/z;->e:Ln2/s;

    .line 5
    iput-object p3, p0, LU1/z;->f:Ln2/t;

    .line 6
    iput-object p4, p0, LU1/z;->g:LU1/h;

    .line 7
    iput-object p5, p0, LU1/z;->h:Lo2/d;

    .line 8
    iput p6, p0, LU1/z;->I:I

    move/from16 v6, p7

    .line 9
    iput-boolean v6, p0, LU1/z;->J:Z

    move-object/from16 v6, p9

    .line 10
    iput-object v6, p0, LU1/z;->z:LU1/a0;

    move-object/from16 v6, p10

    .line 11
    iput-object v6, p0, LU1/z;->u:LU1/f;

    move-wide/from16 v6, p11

    .line 12
    iput-wide v6, p0, LU1/z;->v:J

    const/4 v6, 0x0

    .line 13
    iput-boolean v6, p0, LU1/z;->D:Z

    .line 14
    iput-object v3, p0, LU1/z;->q:LQ1/q;

    .line 15
    iput-object v4, p0, LU1/z;->w:LV1/k;

    .line 16
    iput-object v5, p0, LU1/z;->V:LU1/l;

    .line 17
    iput-object v2, p0, LU1/z;->x:LV1/d;

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    iput-wide v7, p0, LU1/z;->U:J

    .line 19
    iput-wide v7, p0, LU1/z;->G:J

    .line 20
    iget-wide v7, p4, LU1/h;->h:J

    .line 21
    iput-wide v7, p0, LU1/z;->n:J

    .line 22
    sget-object v0, LN1/N;->a:LN1/K;

    .line 23
    invoke-static {p3}, LU1/P;->i(Ln2/t;)LU1/P;

    move-result-object p3

    iput-object p3, p0, LU1/z;->A:LU1/P;

    .line 24
    new-instance v0, LT5/s;

    invoke-direct {v0, p3}, LT5/s;-><init>(LU1/P;)V

    iput-object v0, p0, LU1/z;->B:LT5/s;

    .line 25
    array-length p3, p1

    new-array p3, p3, [LU1/X;

    iput-object p3, p0, LU1/z;->c:[LU1/X;

    .line 26
    array-length p3, p1

    new-array p3, p3, [Z

    iput-object p3, p0, LU1/z;->d:[Z

    .line 27
    move-object p3, p2

    check-cast p3, Ln2/o;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move v0, v6

    .line 28
    :goto_0
    array-length v7, p1

    if-ge v0, v7, :cond_0

    .line 29
    aget-object v7, p1, v0

    invoke-interface {v7, v0, v4, v3}, LU1/W;->w(ILV1/k;LQ1/q;)V

    .line 30
    iget-object v7, p0, LU1/z;->c:[LU1/X;

    aget-object v8, p1, v0

    invoke-interface {v8}, LU1/W;->s()LU1/X;

    move-result-object v8

    aput-object v8, v7, v0

    .line 31
    iget-object v7, p0, LU1/z;->c:[LU1/X;

    aget-object v7, v7, v0

    invoke-interface {v7, p3}, LU1/X;->y(Ln2/o;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 32
    :cond_0
    new-instance p1, LE5/l;

    invoke-direct {p1, p0, v3}, LE5/l;-><init>(LU1/z;LQ1/q;)V

    iput-object p1, p0, LU1/z;->o:LE5/l;

    .line 33
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LU1/z;->p:Ljava/util/ArrayList;

    .line 34
    invoke-static {}, Ll8/s;->o()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, LU1/z;->b:Ljava/util/Set;

    .line 35
    new-instance p1, LN1/M;

    invoke-direct {p1}, LN1/M;-><init>()V

    iput-object p1, p0, LU1/z;->l:LN1/M;

    .line 36
    new-instance p1, LN1/L;

    invoke-direct {p1}, LN1/L;-><init>()V

    iput-object p1, p0, LU1/z;->m:LN1/L;

    .line 37
    iput-object p0, p2, Ln2/s;->a:LU1/z;

    .line 38
    iput-object p5, p2, Ln2/s;->b:Lo2/d;

    const/4 p1, 0x1

    .line 39
    iput-boolean p1, p0, LU1/z;->S:Z

    const/4 p2, 0x0

    move-object/from16 p3, p13

    .line 40
    invoke-virtual {v3, p3, p2}, LQ1/q;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)LQ1/s;

    move-result-object p2

    iput-object p2, p0, LU1/z;->y:LQ1/s;

    .line 41
    new-instance p3, LU1/G;

    new-instance v0, LS8/b;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, LS8/b;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p3, v2, p2, v0, v5}, LU1/G;-><init>(LV1/d;LQ1/s;LS8/b;LU1/l;)V

    iput-object p3, p0, LU1/z;->s:LU1/G;

    .line 42
    new-instance p3, LE5/n0;

    invoke-direct {p3, p0, v2, p2, v4}, LE5/n0;-><init>(LU1/z;LV1/d;LQ1/s;LV1/k;)V

    iput-object p3, p0, LU1/z;->t:LE5/n0;

    .line 43
    new-instance p2, Lc7/l;

    const/4 p3, 0x2

    invoke-direct {p2, p3}, Lc7/l;-><init>(I)V

    iput-object p2, p0, LU1/z;->j:Lc7/l;

    .line 44
    iget-object p3, p2, Lc7/l;->b:Ljava/lang/Object;

    monitor-enter p3

    .line 45
    :try_start_0
    iget-object v0, p2, Lc7/l;->c:Ljava/lang/Object;

    check-cast v0, Landroid/os/Looper;

    if-nez v0, :cond_2

    .line 46
    iget v0, p2, Lc7/l;->a:I

    if-nez v0, :cond_1

    iget-object v0, p2, Lc7/l;->d:Ljava/lang/Object;

    check-cast v0, Landroid/os/HandlerThread;

    if-nez v0, :cond_1

    move v6, p1

    :cond_1
    invoke-static {v6}, LQ1/k;->g(Z)V

    .line 47
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "ExoPlayer:Playback"

    const/16 v2, -0x10

    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object v0, p2, Lc7/l;->d:Ljava/lang/Object;

    .line 48
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 49
    iget-object v0, p2, Lc7/l;->d:Ljava/lang/Object;

    check-cast v0, Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p2, Lc7/l;->c:Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    .line 50
    :cond_2
    :goto_1
    iget v0, p2, Lc7/l;->a:I

    add-int/2addr v0, p1

    iput v0, p2, Lc7/l;->a:I

    .line 51
    iget-object p1, p2, Lc7/l;->c:Ljava/lang/Object;

    check-cast p1, Landroid/os/Looper;

    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    iput-object p1, p0, LU1/z;->k:Landroid/os/Looper;

    .line 53
    invoke-virtual {v3, p1, p0}, LQ1/q;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)LQ1/s;

    move-result-object p1

    iput-object p1, p0, LU1/z;->i:LQ1/s;

    return-void

    .line 54
    :goto_2
    :try_start_1
    monitor-exit p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public static K(LN1/N;LU1/y;ZIZLN1/M;LN1/L;)Landroid/util/Pair;
    .locals 9

    .line 1
    iget-object v0, p1, LU1/y;->a:LN1/N;

    .line 2
    .line 3
    invoke-virtual {p0}, LN1/N;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0}, LN1/N;->p()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    move-object v2, p0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move-object v2, v0

    .line 20
    :goto_0
    :try_start_0
    iget v5, p1, LU1/y;->b:I

    .line 21
    .line 22
    iget-wide v6, p1, LU1/y;->c:J

    .line 23
    .line 24
    move-object v3, p5

    .line 25
    move-object v4, p6

    .line 26
    invoke-virtual/range {v2 .. v7}, LN1/N;->i(LN1/M;LN1/L;IJ)Landroid/util/Pair;

    .line 27
    .line 28
    .line 29
    move-result-object p5
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    move-object v5, v4

    .line 31
    move-object v4, v3

    .line 32
    invoke-virtual {p0, v2}, LN1/N;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p6

    .line 36
    if-eqz p6, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    iget-object p6, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {p0, p6}, LN1/N;->b(Ljava/lang/Object;)I

    .line 42
    .line 43
    .line 44
    move-result p6

    .line 45
    const/4 v0, -0x1

    .line 46
    if-eq p6, v0, :cond_4

    .line 47
    .line 48
    iget-object p2, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-virtual {v2, p2, v5}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iget-boolean p2, p2, LN1/L;->f:Z

    .line 55
    .line 56
    if-eqz p2, :cond_3

    .line 57
    .line 58
    iget p2, v5, LN1/L;->c:I

    .line 59
    .line 60
    const-wide/16 p3, 0x0

    .line 61
    .line 62
    invoke-virtual {v2, p2, v4, p3, p4}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    iget p2, p2, LN1/M;->n:I

    .line 67
    .line 68
    iget-object p3, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {v2, p3}, LN1/N;->b(Ljava/lang/Object;)I

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    if-ne p2, p3, :cond_3

    .line 75
    .line 76
    iget-object p2, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 77
    .line 78
    invoke-virtual {p0, p2, v5}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    iget v6, p2, LN1/L;->c:I

    .line 83
    .line 84
    iget-wide v7, p1, LU1/y;->c:J

    .line 85
    .line 86
    move-object v3, p0

    .line 87
    invoke-virtual/range {v3 .. v8}, LN1/N;->i(LN1/M;LN1/L;IJ)Landroid/util/Pair;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    :cond_3
    :goto_1
    return-object p5

    .line 93
    :cond_4
    move-object v3, p0

    .line 94
    if-eqz p2, :cond_5

    .line 95
    .line 96
    iget-object p0, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 97
    .line 98
    move p2, p3

    .line 99
    move p3, p4

    .line 100
    move-object p5, v2

    .line 101
    move-object p6, v3

    .line 102
    move-object p1, v5

    .line 103
    move-object p4, p0

    .line 104
    move-object p0, v4

    .line 105
    invoke-static/range {p0 .. p6}, LU1/z;->L(LN1/M;LN1/L;IZLjava/lang/Object;LN1/N;LN1/N;)I

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eq v6, v0, :cond_5

    .line 110
    .line 111
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v3 .. v8}, LN1/N;->i(LN1/M;LN1/L;IJ)Landroid/util/Pair;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0

    .line 121
    :catch_0
    :cond_5
    :goto_2
    const/4 p0, 0x0

    .line 122
    return-object p0
.end method

.method public static L(LN1/M;LN1/L;IZLjava/lang/Object;LN1/N;LN1/N;)I
    .locals 12

    .line 1
    move-object v3, p0

    .line 2
    move-object v2, p1

    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    move-object/from16 v1, p5

    .line 6
    .line 7
    move-object/from16 v6, p6

    .line 8
    .line 9
    invoke-virtual {v1, v0, p1}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    iget v4, v4, LN1/L;->c:I

    .line 14
    .line 15
    const-wide/16 v7, 0x0

    .line 16
    .line 17
    invoke-virtual {v1, v4, p0, v7, v8}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-object v4, v4, LN1/M;->a:Ljava/lang/Object;

    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    move v5, v9

    .line 25
    :goto_0
    invoke-virtual {v6}, LN1/N;->o()I

    .line 26
    .line 27
    .line 28
    move-result v10

    .line 29
    if-ge v5, v10, :cond_1

    .line 30
    .line 31
    invoke-virtual {v6, v5, p0, v7, v8}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 32
    .line 33
    .line 34
    move-result-object v10

    .line 35
    iget-object v10, v10, LN1/M;->a:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-virtual {v10, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v10

    .line 41
    if-eqz v10, :cond_0

    .line 42
    .line 43
    return v5

    .line 44
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v1, v0}, LN1/N;->b(Ljava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {v1}, LN1/N;->h()I

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    const/4 v8, -0x1

    .line 56
    move v11, v8

    .line 57
    move v10, v9

    .line 58
    :goto_1
    if-ge v10, v7, :cond_3

    .line 59
    .line 60
    if-ne v11, v8, :cond_3

    .line 61
    .line 62
    move-object v4, v1

    .line 63
    move v1, v0

    .line 64
    move-object v0, v4

    .line 65
    move v4, p2

    .line 66
    move v5, p3

    .line 67
    invoke-virtual/range {v0 .. v5}, LN1/N;->d(ILN1/L;LN1/M;IZ)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-ne v1, v8, :cond_2

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    invoke-virtual {v0, v1}, LN1/N;->l(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v6, v3}, LN1/N;->b(Ljava/lang/Object;)I

    .line 79
    .line 80
    .line 81
    move-result v11

    .line 82
    add-int/lit8 v10, v10, 0x1

    .line 83
    .line 84
    move v3, v1

    .line 85
    move-object v1, v0

    .line 86
    move v0, v3

    .line 87
    move-object v3, p0

    .line 88
    goto :goto_1

    .line 89
    :cond_3
    :goto_2
    if-ne v11, v8, :cond_4

    .line 90
    .line 91
    return v8

    .line 92
    :cond_4
    invoke-virtual {v6, v11, p1, v9}, LN1/N;->f(ILN1/L;Z)LN1/L;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget v0, v0, LN1/L;->c:I

    .line 97
    .line 98
    return v0
.end method

.method public static S(LU1/W;J)V
    .locals 1

    .line 1
    invoke-interface {p0}, LU1/W;->k()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Lm2/d;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Lm2/d;

    .line 9
    .line 10
    iget-boolean v0, p0, LU1/d;->n:Z

    .line 11
    .line 12
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 13
    .line 14
    .line 15
    iput-wide p1, p0, Lm2/d;->J:J

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public static r(LU1/E;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    :try_start_0
    iget-object v1, p0, LU1/E;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iget-boolean v2, p0, LU1/E;->e:Z

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    invoke-interface {v1}, Lk2/F;->h()V

    .line 11
    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object v2, p0, LU1/E;->c:[Lk2/d0;

    .line 15
    .line 16
    array-length v3, v2

    .line 17
    move v4, v0

    .line 18
    :goto_0
    if-ge v4, v3, :cond_2

    .line 19
    .line 20
    aget-object v5, v2, v4

    .line 21
    .line 22
    if-eqz v5, :cond_1

    .line 23
    .line 24
    invoke-interface {v5}, Lk2/d0;->a()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    :goto_1
    iget-boolean p0, p0, LU1/E;->e:Z

    .line 31
    .line 32
    if-nez p0, :cond_3

    .line 33
    .line 34
    const-wide/16 v1, 0x0

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_3
    invoke-interface {v1}, Lk2/f0;->c()J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    :goto_2
    const-wide/high16 v3, -0x8000000000000000L

    .line 42
    .line 43
    cmp-long p0, v1, v3

    .line 44
    .line 45
    if-eqz p0, :cond_4

    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    return p0

    .line 49
    :catch_0
    :cond_4
    return v0
.end method

.method public static s(LU1/W;)Z
    .locals 0

    .line 1
    invoke-interface {p0}, LU1/W;->getState()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method


# virtual methods
.method public final A(LU1/x;)V
    .locals 8

    .line 1
    iget-object v0, p0, LU1/z;->B:LT5/s;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, LT5/s;->c(I)V

    .line 5
    .line 6
    .line 7
    iget v0, p1, LU1/x;->a:I

    .line 8
    .line 9
    iget-object v2, p0, LU1/z;->t:LE5/n0;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v3, v2, LE5/n0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    iget v5, p1, LU1/x;->b:I

    .line 20
    .line 21
    iget v6, p1, LU1/x;->c:I

    .line 22
    .line 23
    if-ltz v0, :cond_0

    .line 24
    .line 25
    if-gt v0, v5, :cond_0

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    if-gt v5, v7, :cond_0

    .line 32
    .line 33
    if-ltz v6, :cond_0

    .line 34
    .line 35
    move v7, v1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v7, v4

    .line 38
    :goto_0
    invoke-static {v7}, LQ1/k;->c(Z)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p1, LU1/x;->d:Lk2/g0;

    .line 42
    .line 43
    iput-object p1, v2, LE5/n0;->l:Ljava/lang/Object;

    .line 44
    .line 45
    if-eq v0, v5, :cond_3

    .line 46
    .line 47
    if-ne v0, v6, :cond_1

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    invoke-static {v0, v6}, Ljava/lang/Math;->min(II)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    sub-int v7, v5, v0

    .line 55
    .line 56
    add-int/2addr v7, v6

    .line 57
    sub-int/2addr v7, v1

    .line 58
    add-int/lit8 v1, v5, -0x1

    .line 59
    .line 60
    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    check-cast v7, LU1/O;

    .line 69
    .line 70
    iget v7, v7, LU1/O;->d:I

    .line 71
    .line 72
    invoke-static {v3, v0, v5, v6}, LQ1/x;->J(Ljava/util/ArrayList;III)V

    .line 73
    .line 74
    .line 75
    :goto_1
    if-gt p1, v1, :cond_2

    .line 76
    .line 77
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, LU1/O;

    .line 82
    .line 83
    iput v7, v0, LU1/O;->d:I

    .line 84
    .line 85
    iget-object v0, v0, LU1/O;->a:Lk2/D;

    .line 86
    .line 87
    iget-object v0, v0, Lk2/D;->o:Lk2/B;

    .line 88
    .line 89
    iget-object v0, v0, Lk2/x;->b:LN1/N;

    .line 90
    .line 91
    invoke-virtual {v0}, LN1/N;->o()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    add-int/2addr v7, v0

    .line 96
    add-int/lit8 p1, p1, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    invoke-virtual {v2}, LE5/n0;->e()LN1/N;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    goto :goto_3

    .line 104
    :cond_3
    :goto_2
    invoke-virtual {v2}, LE5/n0;->e()LN1/N;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    :goto_3
    invoke-virtual {p0, p1, v4}, LU1/z;->n(LN1/N;Z)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public final B()V
    .locals 9

    .line 1
    iget-object v0, p0, LU1/z;->B:LT5/s;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, LT5/s;->c(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0, v0, v0, v1}, LU1/z;->G(ZZZZ)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, LU1/z;->g:LU1/h;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3}, Ljava/lang/Thread;->getId()J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    iget-wide v5, v2, LU1/h;->j:J

    .line 25
    .line 26
    const-wide/16 v7, -0x1

    .line 27
    .line 28
    cmp-long v7, v5, v7

    .line 29
    .line 30
    if-eqz v7, :cond_1

    .line 31
    .line 32
    cmp-long v5, v5, v3

    .line 33
    .line 34
    if-nez v5, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v5, v0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    move v5, v1

    .line 40
    :goto_1
    const-string v6, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper)."

    .line 41
    .line 42
    invoke-static {v6, v5}, LQ1/k;->f(Ljava/lang/String;Z)V

    .line 43
    .line 44
    .line 45
    iput-wide v3, v2, LU1/h;->j:J

    .line 46
    .line 47
    iget-object v3, v2, LU1/h;->i:Ljava/util/HashMap;

    .line 48
    .line 49
    iget-object v4, p0, LU1/z;->w:LV1/k;

    .line 50
    .line 51
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-nez v5, :cond_2

    .line 56
    .line 57
    new-instance v5, LU1/g;

    .line 58
    .line 59
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, LU1/g;

    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    const/4 v4, -0x1

    .line 75
    iget v2, v2, LU1/h;->f:I

    .line 76
    .line 77
    if-ne v2, v4, :cond_3

    .line 78
    .line 79
    const/high16 v2, 0xc80000

    .line 80
    .line 81
    :cond_3
    iput v2, v3, LU1/g;->b:I

    .line 82
    .line 83
    iput-boolean v0, v3, LU1/g;->a:Z

    .line 84
    .line 85
    iget-object v2, p0, LU1/z;->A:LU1/P;

    .line 86
    .line 87
    iget-object v2, v2, LU1/P;->a:LN1/N;

    .line 88
    .line 89
    invoke-virtual {v2}, LN1/N;->p()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    const/4 v3, 0x2

    .line 94
    if-eqz v2, :cond_4

    .line 95
    .line 96
    const/4 v2, 0x4

    .line 97
    goto :goto_2

    .line 98
    :cond_4
    move v2, v3

    .line 99
    :goto_2
    invoke-virtual {p0, v2}, LU1/z;->c0(I)V

    .line 100
    .line 101
    .line 102
    iget-object v2, p0, LU1/z;->h:Lo2/d;

    .line 103
    .line 104
    check-cast v2, Lo2/g;

    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iget-object v4, p0, LU1/z;->t:LE5/n0;

    .line 110
    .line 111
    iget-boolean v5, v4, LE5/n0;->g:Z

    .line 112
    .line 113
    xor-int/2addr v5, v1

    .line 114
    invoke-static {v5}, LQ1/k;->g(Z)V

    .line 115
    .line 116
    .line 117
    iput-object v2, v4, LE5/n0;->m:Ljava/lang/Object;

    .line 118
    .line 119
    :goto_3
    iget-object v2, v4, LE5/n0;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v2, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-ge v0, v5, :cond_5

    .line 128
    .line 129
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    check-cast v2, LU1/O;

    .line 134
    .line 135
    invoke-virtual {v4, v2}, LE5/n0;->o(LU1/O;)V

    .line 136
    .line 137
    .line 138
    iget-object v5, v4, LE5/n0;->f:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v5, Ljava/util/HashSet;

    .line 141
    .line 142
    invoke-virtual {v5, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    add-int/lit8 v0, v0, 0x1

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_5
    iput-boolean v1, v4, LE5/n0;->g:Z

    .line 149
    .line 150
    iget-object v0, p0, LU1/z;->i:LQ1/s;

    .line 151
    .line 152
    invoke-virtual {v0, v3}, LQ1/s;->e(I)Z

    .line 153
    .line 154
    .line 155
    return-void
.end method

.method public final declared-synchronized C()Z
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LU1/z;->C:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, LU1/z;->k:Landroid/os/Looper;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, LU1/z;->i:LQ1/s;

    .line 20
    .line 21
    const/4 v1, 0x7

    .line 22
    invoke-virtual {v0, v1}, LQ1/s;->e(I)Z

    .line 23
    .line 24
    .line 25
    new-instance v0, LE5/J;

    .line 26
    .line 27
    const/4 v1, 0x4

    .line 28
    invoke-direct {v0, p0, v1}, LE5/J;-><init>(Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    iget-wide v1, p0, LU1/z;->v:J

    .line 32
    .line 33
    invoke-virtual {p0, v0, v1, v2}, LU1/z;->o0(LE5/J;J)V

    .line 34
    .line 35
    .line 36
    iget-boolean v0, p0, LU1/z;->C:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    monitor-exit p0

    .line 39
    return v0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    :goto_0
    monitor-exit p0

    .line 43
    const/4 v0, 0x1

    .line 44
    return v0

    .line 45
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    throw v0
.end method

.method public final D()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p0, v0, v1, v0, v1}, LU1/z;->G(ZZZZ)V

    .line 4
    .line 5
    .line 6
    :goto_0
    iget-object v2, p0, LU1/z;->a:[LU1/W;

    .line 7
    .line 8
    array-length v3, v2

    .line 9
    if-ge v1, v3, :cond_0

    .line 10
    .line 11
    iget-object v3, p0, LU1/z;->c:[LU1/X;

    .line 12
    .line 13
    aget-object v3, v3, v1

    .line 14
    .line 15
    invoke-interface {v3}, LU1/X;->h()V

    .line 16
    .line 17
    .line 18
    aget-object v2, v2, v1

    .line 19
    .line 20
    invoke-interface {v2}, LU1/W;->release()V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v1, p0, LU1/z;->g:LU1/h;

    .line 27
    .line 28
    iget-object v2, p0, LU1/z;->w:LV1/k;

    .line 29
    .line 30
    iget-object v3, v1, LU1/h;->i:Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    invoke-virtual {v1}, LU1/h;->d()V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object v2, v1, LU1/h;->i:Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    const-wide/16 v2, -0x1

    .line 50
    .line 51
    iput-wide v2, v1, LU1/h;->j:J

    .line 52
    .line 53
    :cond_2
    invoke-virtual {p0, v0}, LU1/z;->c0(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, LU1/z;->j:Lc7/l;

    .line 57
    .line 58
    invoke-virtual {v1}, Lc7/l;->b()V

    .line 59
    .line 60
    .line 61
    monitor-enter p0

    .line 62
    :try_start_1
    iput-boolean v0, p0, LU1/z;->C:Z

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 65
    .line 66
    .line 67
    monitor-exit p0

    .line 68
    return-void

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    throw v0

    .line 72
    :catchall_1
    move-exception v1

    .line 73
    iget-object v2, p0, LU1/z;->j:Lc7/l;

    .line 74
    .line 75
    invoke-virtual {v2}, Lc7/l;->b()V

    .line 76
    .line 77
    .line 78
    monitor-enter p0

    .line 79
    :try_start_2
    iput-boolean v0, p0, LU1/z;->C:Z

    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 82
    .line 83
    .line 84
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 85
    throw v1

    .line 86
    :catchall_2
    move-exception v0

    .line 87
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 88
    throw v0
.end method

.method public final E(IILk2/g0;)V
    .locals 4

    .line 1
    iget-object v0, p0, LU1/z;->B:LT5/s;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, LT5/s;->c(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LU1/z;->t:LE5/n0;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-ltz p1, :cond_0

    .line 14
    .line 15
    if-gt p1, p2, :cond_0

    .line 16
    .line 17
    iget-object v3, v0, LE5/n0;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-gt p2, v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v1, v2

    .line 29
    :goto_0
    invoke-static {v1}, LQ1/k;->c(Z)V

    .line 30
    .line 31
    .line 32
    iput-object p3, v0, LE5/n0;->l:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2}, LE5/n0;->r(II)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, LE5/n0;->e()LN1/N;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1, v2}, LU1/z;->n(LN1/N;Z)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final F()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LU1/z;->o:LE5/l;

    .line 4
    .line 5
    invoke-virtual {v1}, LE5/l;->e()LN1/F;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v1, v1, LN1/F;->a:F

    .line 10
    .line 11
    iget-object v2, v0, LU1/z;->s:LU1/G;

    .line 12
    .line 13
    iget-object v3, v2, LU1/G;->i:LU1/E;

    .line 14
    .line 15
    iget-object v2, v2, LU1/G;->j:LU1/E;

    .line 16
    .line 17
    const/4 v10, 0x1

    .line 18
    const/4 v4, 0x0

    .line 19
    move-object v11, v3

    .line 20
    move v3, v10

    .line 21
    :goto_0
    if-eqz v11, :cond_e

    .line 22
    .line 23
    iget-boolean v5, v11, LU1/E;->e:Z

    .line 24
    .line 25
    if-nez v5, :cond_0

    .line 26
    .line 27
    goto/16 :goto_8

    .line 28
    .line 29
    :cond_0
    iget-object v5, v0, LU1/z;->A:LU1/P;

    .line 30
    .line 31
    iget-object v6, v5, LU1/P;->a:LN1/N;

    .line 32
    .line 33
    iget-boolean v5, v5, LU1/P;->l:Z

    .line 34
    .line 35
    invoke-virtual {v11, v1, v6, v5}, LU1/E;->j(FLN1/N;Z)Ln2/t;

    .line 36
    .line 37
    .line 38
    move-result-object v12

    .line 39
    iget-object v5, v0, LU1/z;->s:LU1/G;

    .line 40
    .line 41
    iget-object v5, v5, LU1/G;->i:LU1/E;

    .line 42
    .line 43
    if-ne v11, v5, :cond_1

    .line 44
    .line 45
    move-object v14, v12

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object v14, v4

    .line 48
    :goto_1
    iget-object v4, v11, LU1/E;->o:Ln2/t;

    .line 49
    .line 50
    const/16 v19, 0x0

    .line 51
    .line 52
    if-eqz v4, :cond_6

    .line 53
    .line 54
    iget-object v5, v4, Ln2/t;->c:[Ln2/q;

    .line 55
    .line 56
    array-length v5, v5

    .line 57
    iget-object v6, v12, Ln2/t;->c:[Ln2/q;

    .line 58
    .line 59
    array-length v7, v6

    .line 60
    if-eq v5, v7, :cond_2

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_2
    move/from16 v5, v19

    .line 64
    .line 65
    :goto_2
    array-length v7, v6

    .line 66
    if-ge v5, v7, :cond_4

    .line 67
    .line 68
    invoke-virtual {v12, v4, v5}, Ln2/t;->a(Ln2/t;I)Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-nez v7, :cond_3

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    if-ne v11, v2, :cond_5

    .line 79
    .line 80
    move/from16 v3, v19

    .line 81
    .line 82
    :cond_5
    iget-object v11, v11, LU1/E;->m:LU1/E;

    .line 83
    .line 84
    move-object v4, v14

    .line 85
    goto :goto_0

    .line 86
    :cond_6
    :goto_3
    const/4 v1, 0x4

    .line 87
    if-eqz v3, :cond_d

    .line 88
    .line 89
    iget-object v2, v0, LU1/z;->s:LU1/G;

    .line 90
    .line 91
    iget-object v13, v2, LU1/G;->i:LU1/E;

    .line 92
    .line 93
    invoke-virtual {v2, v13}, LU1/G;->l(LU1/E;)Z

    .line 94
    .line 95
    .line 96
    move-result v17

    .line 97
    iget-object v2, v0, LU1/z;->a:[LU1/W;

    .line 98
    .line 99
    array-length v2, v2

    .line 100
    new-array v2, v2, [Z

    .line 101
    .line 102
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    iget-object v3, v0, LU1/z;->A:LU1/P;

    .line 106
    .line 107
    iget-wide v3, v3, LU1/P;->s:J

    .line 108
    .line 109
    move-object/from16 v18, v2

    .line 110
    .line 111
    move-wide v15, v3

    .line 112
    invoke-virtual/range {v13 .. v18}, LU1/E;->a(Ln2/t;JZ[Z)J

    .line 113
    .line 114
    .line 115
    move-result-wide v2

    .line 116
    iget-object v4, v0, LU1/z;->A:LU1/P;

    .line 117
    .line 118
    iget v5, v4, LU1/P;->e:I

    .line 119
    .line 120
    if-eq v5, v1, :cond_7

    .line 121
    .line 122
    iget-wide v4, v4, LU1/P;->s:J

    .line 123
    .line 124
    cmp-long v4, v2, v4

    .line 125
    .line 126
    if-eqz v4, :cond_7

    .line 127
    .line 128
    move v8, v10

    .line 129
    goto :goto_4

    .line 130
    :cond_7
    move/from16 v8, v19

    .line 131
    .line 132
    :goto_4
    iget-object v4, v0, LU1/z;->A:LU1/P;

    .line 133
    .line 134
    move v5, v1

    .line 135
    iget-object v1, v4, LU1/P;->b:Lk2/H;

    .line 136
    .line 137
    iget-wide v6, v4, LU1/P;->c:J

    .line 138
    .line 139
    iget-wide v11, v4, LU1/P;->d:J

    .line 140
    .line 141
    const/4 v9, 0x5

    .line 142
    move v14, v5

    .line 143
    move-wide v4, v6

    .line 144
    move-wide v6, v11

    .line 145
    invoke-virtual/range {v0 .. v9}, LU1/z;->q(Lk2/H;JJJZI)LU1/P;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    iput-object v1, v0, LU1/z;->A:LU1/P;

    .line 150
    .line 151
    if-eqz v8, :cond_8

    .line 152
    .line 153
    invoke-virtual {v0, v2, v3}, LU1/z;->I(J)V

    .line 154
    .line 155
    .line 156
    :cond_8
    iget-object v1, v0, LU1/z;->a:[LU1/W;

    .line 157
    .line 158
    array-length v1, v1

    .line 159
    new-array v1, v1, [Z

    .line 160
    .line 161
    move/from16 v2, v19

    .line 162
    .line 163
    :goto_5
    iget-object v3, v0, LU1/z;->a:[LU1/W;

    .line 164
    .line 165
    array-length v4, v3

    .line 166
    if-ge v2, v4, :cond_b

    .line 167
    .line 168
    aget-object v3, v3, v2

    .line 169
    .line 170
    invoke-static {v3}, LU1/z;->s(LU1/W;)Z

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    aput-boolean v4, v1, v2

    .line 175
    .line 176
    iget-object v5, v13, LU1/E;->c:[Lk2/d0;

    .line 177
    .line 178
    aget-object v5, v5, v2

    .line 179
    .line 180
    if-eqz v4, :cond_a

    .line 181
    .line 182
    invoke-interface {v3}, LU1/W;->x()Lk2/d0;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    if-eq v5, v4, :cond_9

    .line 187
    .line 188
    invoke-virtual {v0, v2}, LU1/z;->c(I)V

    .line 189
    .line 190
    .line 191
    goto :goto_6

    .line 192
    :cond_9
    aget-boolean v4, v18, v2

    .line 193
    .line 194
    if-eqz v4, :cond_a

    .line 195
    .line 196
    iget-wide v4, v0, LU1/z;->P:J

    .line 197
    .line 198
    invoke-interface {v3, v4, v5}, LU1/W;->A(J)V

    .line 199
    .line 200
    .line 201
    :cond_a
    :goto_6
    add-int/lit8 v2, v2, 0x1

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_b
    iget-wide v2, v0, LU1/z;->P:J

    .line 205
    .line 206
    invoke-virtual {v0, v1, v2, v3}, LU1/z;->e([ZJ)V

    .line 207
    .line 208
    .line 209
    :cond_c
    move v5, v14

    .line 210
    goto :goto_7

    .line 211
    :cond_d
    move v14, v1

    .line 212
    iget-object v1, v0, LU1/z;->s:LU1/G;

    .line 213
    .line 214
    invoke-virtual {v1, v11}, LU1/G;->l(LU1/E;)Z

    .line 215
    .line 216
    .line 217
    iget-boolean v1, v11, LU1/E;->e:Z

    .line 218
    .line 219
    if-eqz v1, :cond_c

    .line 220
    .line 221
    iget-object v1, v11, LU1/E;->g:LU1/F;

    .line 222
    .line 223
    iget-wide v1, v1, LU1/F;->b:J

    .line 224
    .line 225
    iget-wide v3, v0, LU1/z;->P:J

    .line 226
    .line 227
    iget-wide v5, v11, LU1/E;->p:J

    .line 228
    .line 229
    sub-long/2addr v3, v5

    .line 230
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 231
    .line 232
    .line 233
    move-result-wide v1

    .line 234
    iget-object v3, v11, LU1/E;->j:[LU1/X;

    .line 235
    .line 236
    array-length v3, v3

    .line 237
    new-array v3, v3, [Z

    .line 238
    .line 239
    const/4 v15, 0x0

    .line 240
    move-object/from16 v16, v3

    .line 241
    .line 242
    move v5, v14

    .line 243
    move-wide v13, v1

    .line 244
    invoke-virtual/range {v11 .. v16}, LU1/E;->a(Ln2/t;JZ[Z)J

    .line 245
    .line 246
    .line 247
    :goto_7
    invoke-virtual {v0, v10}, LU1/z;->m(Z)V

    .line 248
    .line 249
    .line 250
    iget-object v1, v0, LU1/z;->A:LU1/P;

    .line 251
    .line 252
    iget v1, v1, LU1/P;->e:I

    .line 253
    .line 254
    if-eq v1, v5, :cond_e

    .line 255
    .line 256
    invoke-virtual {v0}, LU1/z;->u()V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0}, LU1/z;->l0()V

    .line 260
    .line 261
    .line 262
    iget-object v1, v0, LU1/z;->i:LQ1/s;

    .line 263
    .line 264
    const/4 v2, 0x2

    .line 265
    invoke-virtual {v1, v2}, LQ1/s;->e(I)Z

    .line 266
    .line 267
    .line 268
    :cond_e
    :goto_8
    return-void
.end method

.method public final G(ZZZZ)V
    .locals 34

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LU1/z;->i:LQ1/s;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-virtual {v0, v2}, LQ1/s;->d(I)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    iput-object v2, v1, LU1/z;->T:LU1/j;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    invoke-virtual {v1, v3, v4}, LU1/z;->n0(ZZ)V

    .line 15
    .line 16
    .line 17
    iget-object v0, v1, LU1/z;->o:LE5/l;

    .line 18
    .line 19
    iput-boolean v3, v0, LE5/l;->c:Z

    .line 20
    .line 21
    iget-object v0, v0, LE5/l;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, LA7/a0;

    .line 24
    .line 25
    iget-boolean v5, v0, LA7/a0;->b:Z

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, LA7/a0;->g()J

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    invoke-virtual {v0, v5, v6}, LA7/a0;->b(J)V

    .line 34
    .line 35
    .line 36
    iput-boolean v3, v0, LA7/a0;->b:Z

    .line 37
    .line 38
    :cond_0
    const-wide v5, 0xe8d4a51000L

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    iput-wide v5, v1, LU1/z;->P:J

    .line 44
    .line 45
    move v5, v3

    .line 46
    :goto_0
    iget-object v6, v1, LU1/z;->a:[LU1/W;

    .line 47
    .line 48
    array-length v0, v6

    .line 49
    const-string v7, "ExoPlayerImplInternal"

    .line 50
    .line 51
    if-ge v5, v0, :cond_1

    .line 52
    .line 53
    :try_start_0
    invoke-virtual {v1, v5}, LU1/z;->c(I)V
    :try_end_0
    .catch LU1/j; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :catch_0
    move-exception v0

    .line 58
    goto :goto_1

    .line 59
    :catch_1
    move-exception v0

    .line 60
    :goto_1
    const-string v6, "Disable failed."

    .line 61
    .line 62
    invoke-static {v7, v6, v0}, LQ1/k;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    :goto_2
    add-int/2addr v5, v4

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    if-eqz p1, :cond_3

    .line 68
    .line 69
    array-length v5, v6

    .line 70
    move v8, v3

    .line 71
    :goto_3
    if-ge v8, v5, :cond_3

    .line 72
    .line 73
    aget-object v0, v6, v8

    .line 74
    .line 75
    iget-object v9, v1, LU1/z;->b:Ljava/util/Set;

    .line 76
    .line 77
    invoke-interface {v9, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-eqz v9, :cond_2

    .line 82
    .line 83
    :try_start_1
    invoke-interface {v0}, LU1/W;->reset()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 84
    .line 85
    .line 86
    goto :goto_4

    .line 87
    :catch_2
    move-exception v0

    .line 88
    const-string v9, "Reset failed."

    .line 89
    .line 90
    invoke-static {v7, v9, v0}, LQ1/k;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    :goto_4
    add-int/2addr v8, v4

    .line 94
    goto :goto_3

    .line 95
    :cond_3
    iput v3, v1, LU1/z;->N:I

    .line 96
    .line 97
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 98
    .line 99
    iget-object v5, v0, LU1/P;->b:Lk2/H;

    .line 100
    .line 101
    iget-wide v6, v0, LU1/P;->s:J

    .line 102
    .line 103
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 104
    .line 105
    iget-object v0, v0, LU1/P;->b:Lk2/H;

    .line 106
    .line 107
    invoke-virtual {v0}, Lk2/H;->b()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_5

    .line 112
    .line 113
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 114
    .line 115
    iget-object v8, v1, LU1/z;->m:LN1/L;

    .line 116
    .line 117
    iget-object v9, v0, LU1/P;->b:Lk2/H;

    .line 118
    .line 119
    iget-object v0, v0, LU1/P;->a:LN1/N;

    .line 120
    .line 121
    invoke-virtual {v0}, LN1/N;->p()Z

    .line 122
    .line 123
    .line 124
    move-result v10

    .line 125
    if-nez v10, :cond_5

    .line 126
    .line 127
    iget-object v9, v9, Lk2/H;->a:Ljava/lang/Object;

    .line 128
    .line 129
    invoke-virtual {v0, v9, v8}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iget-boolean v0, v0, LN1/L;->f:Z

    .line 134
    .line 135
    if-eqz v0, :cond_4

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_4
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 139
    .line 140
    iget-wide v8, v0, LU1/P;->s:J

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_5
    :goto_5
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 144
    .line 145
    iget-wide v8, v0, LU1/P;->c:J

    .line 146
    .line 147
    :goto_6
    if-eqz p2, :cond_6

    .line 148
    .line 149
    iput-object v2, v1, LU1/z;->O:LU1/y;

    .line 150
    .line 151
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 152
    .line 153
    iget-object v0, v0, LU1/P;->a:LN1/N;

    .line 154
    .line 155
    invoke-virtual {v1, v0}, LU1/z;->h(LN1/N;)Landroid/util/Pair;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    iget-object v5, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v5, Lk2/H;

    .line 162
    .line 163
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, Ljava/lang/Long;

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 168
    .line 169
    .line 170
    move-result-wide v6

    .line 171
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 172
    .line 173
    iget-object v0, v0, LU1/P;->b:Lk2/H;

    .line 174
    .line 175
    invoke-virtual {v5, v0}, Lk2/H;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    if-nez v0, :cond_6

    .line 185
    .line 186
    move v0, v4

    .line 187
    :goto_7
    move-wide v11, v6

    .line 188
    move-wide v9, v8

    .line 189
    goto :goto_8

    .line 190
    :cond_6
    move v0, v3

    .line 191
    goto :goto_7

    .line 192
    :goto_8
    iget-object v6, v1, LU1/z;->s:LU1/G;

    .line 193
    .line 194
    invoke-virtual {v6}, LU1/G;->b()V

    .line 195
    .line 196
    .line 197
    iput-boolean v3, v1, LU1/z;->H:Z

    .line 198
    .line 199
    iget-object v6, v1, LU1/z;->A:LU1/P;

    .line 200
    .line 201
    iget-object v6, v6, LU1/P;->a:LN1/N;

    .line 202
    .line 203
    if-eqz p3, :cond_9

    .line 204
    .line 205
    instance-of v7, v6, LU1/V;

    .line 206
    .line 207
    if-eqz v7, :cond_9

    .line 208
    .line 209
    check-cast v6, LU1/V;

    .line 210
    .line 211
    iget-object v7, v1, LU1/z;->t:LE5/n0;

    .line 212
    .line 213
    iget-object v7, v7, LE5/n0;->l:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v7, Lk2/g0;

    .line 216
    .line 217
    iget-object v8, v6, LU1/V;->i:[LN1/N;

    .line 218
    .line 219
    array-length v13, v8

    .line 220
    new-array v13, v13, [LN1/N;

    .line 221
    .line 222
    move v14, v3

    .line 223
    :goto_9
    array-length v15, v8

    .line 224
    if-ge v14, v15, :cond_7

    .line 225
    .line 226
    new-instance v15, LU1/U;

    .line 227
    .line 228
    move/from16 v33, v4

    .line 229
    .line 230
    aget-object v4, v8, v14

    .line 231
    .line 232
    invoke-direct {v15, v4}, LU1/U;-><init>(LN1/N;)V

    .line 233
    .line 234
    .line 235
    aput-object v15, v13, v14

    .line 236
    .line 237
    add-int/lit8 v14, v14, 0x1

    .line 238
    .line 239
    move/from16 v4, v33

    .line 240
    .line 241
    goto :goto_9

    .line 242
    :cond_7
    move/from16 v33, v4

    .line 243
    .line 244
    new-instance v4, LU1/V;

    .line 245
    .line 246
    iget-object v6, v6, LU1/V;->j:[Ljava/lang/Object;

    .line 247
    .line 248
    invoke-direct {v4, v13, v6, v7}, LU1/V;-><init>([LN1/N;[Ljava/lang/Object;Lk2/g0;)V

    .line 249
    .line 250
    .line 251
    iget v6, v5, Lk2/H;->b:I

    .line 252
    .line 253
    const/4 v7, -0x1

    .line 254
    if-eq v6, v7, :cond_8

    .line 255
    .line 256
    iget-object v6, v5, Lk2/H;->a:Ljava/lang/Object;

    .line 257
    .line 258
    iget-object v7, v1, LU1/z;->m:LN1/L;

    .line 259
    .line 260
    invoke-virtual {v4, v6, v7}, LU1/a;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 261
    .line 262
    .line 263
    iget-object v6, v1, LU1/z;->m:LN1/L;

    .line 264
    .line 265
    iget v6, v6, LN1/L;->c:I

    .line 266
    .line 267
    iget-object v7, v1, LU1/z;->l:LN1/M;

    .line 268
    .line 269
    const-wide/16 v13, 0x0

    .line 270
    .line 271
    invoke-virtual {v4, v6, v7, v13, v14}, LU1/a;->m(ILN1/M;J)LN1/M;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v7}, LN1/M;->a()Z

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    if-eqz v6, :cond_8

    .line 279
    .line 280
    new-instance v6, Lk2/H;

    .line 281
    .line 282
    iget-object v7, v5, Lk2/H;->a:Ljava/lang/Object;

    .line 283
    .line 284
    iget-wide v13, v5, Lk2/H;->d:J

    .line 285
    .line 286
    invoke-direct {v6, v7, v13, v14}, Lk2/H;-><init>(Ljava/lang/Object;J)V

    .line 287
    .line 288
    .line 289
    move-object v7, v4

    .line 290
    move-object v8, v6

    .line 291
    goto :goto_a

    .line 292
    :cond_8
    move-object v7, v4

    .line 293
    move-object v8, v5

    .line 294
    goto :goto_a

    .line 295
    :cond_9
    move/from16 v33, v4

    .line 296
    .line 297
    move-object v8, v5

    .line 298
    move-object v7, v6

    .line 299
    :goto_a
    new-instance v6, LU1/P;

    .line 300
    .line 301
    iget-object v4, v1, LU1/z;->A:LU1/P;

    .line 302
    .line 303
    iget v13, v4, LU1/P;->e:I

    .line 304
    .line 305
    if-eqz p4, :cond_a

    .line 306
    .line 307
    move-object v14, v2

    .line 308
    goto :goto_b

    .line 309
    :cond_a
    iget-object v5, v4, LU1/P;->f:LU1/j;

    .line 310
    .line 311
    move-object v14, v5

    .line 312
    :goto_b
    if-eqz v0, :cond_b

    .line 313
    .line 314
    sget-object v5, Lk2/n0;->d:Lk2/n0;

    .line 315
    .line 316
    :goto_c
    move-object/from16 v16, v5

    .line 317
    .line 318
    goto :goto_d

    .line 319
    :cond_b
    iget-object v5, v4, LU1/P;->h:Lk2/n0;

    .line 320
    .line 321
    goto :goto_c

    .line 322
    :goto_d
    if-eqz v0, :cond_c

    .line 323
    .line 324
    iget-object v5, v1, LU1/z;->f:Ln2/t;

    .line 325
    .line 326
    :goto_e
    move-object/from16 v17, v5

    .line 327
    .line 328
    goto :goto_f

    .line 329
    :cond_c
    iget-object v5, v4, LU1/P;->i:Ln2/t;

    .line 330
    .line 331
    goto :goto_e

    .line 332
    :goto_f
    if-eqz v0, :cond_d

    .line 333
    .line 334
    sget-object v0, Ll8/K;->b:Ll8/I;

    .line 335
    .line 336
    sget-object v0, Ll8/e0;->e:Ll8/e0;

    .line 337
    .line 338
    :goto_10
    move-object/from16 v18, v0

    .line 339
    .line 340
    goto :goto_11

    .line 341
    :cond_d
    iget-object v0, v4, LU1/P;->j:Ljava/util/List;

    .line 342
    .line 343
    goto :goto_10

    .line 344
    :goto_11
    iget-boolean v0, v4, LU1/P;->l:Z

    .line 345
    .line 346
    iget v5, v4, LU1/P;->m:I

    .line 347
    .line 348
    iget v15, v4, LU1/P;->n:I

    .line 349
    .line 350
    iget-object v4, v4, LU1/P;->o:LN1/F;

    .line 351
    .line 352
    move/from16 v22, v15

    .line 353
    .line 354
    const/4 v15, 0x0

    .line 355
    const-wide/16 v26, 0x0

    .line 356
    .line 357
    const-wide/16 v30, 0x0

    .line 358
    .line 359
    const/16 v32, 0x0

    .line 360
    .line 361
    move-object/from16 v19, v8

    .line 362
    .line 363
    move-wide/from16 v24, v11

    .line 364
    .line 365
    move-wide/from16 v28, v11

    .line 366
    .line 367
    move/from16 v20, v0

    .line 368
    .line 369
    move-object/from16 v23, v4

    .line 370
    .line 371
    move/from16 v21, v5

    .line 372
    .line 373
    invoke-direct/range {v6 .. v32}, LU1/P;-><init>(LN1/N;Lk2/H;JJILU1/j;ZLk2/n0;Ln2/t;Ljava/util/List;Lk2/H;ZIILN1/F;JJJJZ)V

    .line 374
    .line 375
    .line 376
    iput-object v6, v1, LU1/z;->A:LU1/P;

    .line 377
    .line 378
    if-eqz p3, :cond_11

    .line 379
    .line 380
    iget-object v0, v1, LU1/z;->s:LU1/G;

    .line 381
    .line 382
    iget-object v4, v0, LU1/G;->p:Ljava/util/ArrayList;

    .line 383
    .line 384
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 385
    .line 386
    .line 387
    move-result v4

    .line 388
    if-nez v4, :cond_f

    .line 389
    .line 390
    new-instance v4, Ljava/util/ArrayList;

    .line 391
    .line 392
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 393
    .line 394
    .line 395
    move v5, v3

    .line 396
    :goto_12
    iget-object v6, v0, LU1/G;->p:Ljava/util/ArrayList;

    .line 397
    .line 398
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 399
    .line 400
    .line 401
    move-result v6

    .line 402
    if-ge v5, v6, :cond_e

    .line 403
    .line 404
    iget-object v6, v0, LU1/G;->p:Ljava/util/ArrayList;

    .line 405
    .line 406
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v6

    .line 410
    check-cast v6, LU1/E;

    .line 411
    .line 412
    invoke-virtual {v6}, LU1/E;->i()V

    .line 413
    .line 414
    .line 415
    add-int/lit8 v5, v5, 0x1

    .line 416
    .line 417
    goto :goto_12

    .line 418
    :cond_e
    iput-object v4, v0, LU1/G;->p:Ljava/util/ArrayList;

    .line 419
    .line 420
    iput-object v2, v0, LU1/G;->l:LU1/E;

    .line 421
    .line 422
    invoke-virtual {v0}, LU1/G;->j()V

    .line 423
    .line 424
    .line 425
    :cond_f
    iget-object v2, v1, LU1/z;->t:LE5/n0;

    .line 426
    .line 427
    iget-object v0, v2, LE5/n0;->e:Ljava/lang/Object;

    .line 428
    .line 429
    move-object v4, v0

    .line 430
    check-cast v4, Ljava/util/HashMap;

    .line 431
    .line 432
    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 437
    .line 438
    .line 439
    move-result-object v5

    .line 440
    :goto_13
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    if-eqz v0, :cond_10

    .line 445
    .line 446
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    move-object v6, v0

    .line 451
    check-cast v6, LU1/N;

    .line 452
    .line 453
    :try_start_2
    iget-object v0, v6, LU1/N;->a:Lk2/a;

    .line 454
    .line 455
    iget-object v7, v6, LU1/N;->b:LU1/I;

    .line 456
    .line 457
    invoke-virtual {v0, v7}, Lk2/a;->o(Lk2/I;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3

    .line 458
    .line 459
    .line 460
    goto :goto_14

    .line 461
    :catch_3
    move-exception v0

    .line 462
    const-string v7, "MediaSourceList"

    .line 463
    .line 464
    const-string v8, "Failed to release child source."

    .line 465
    .line 466
    invoke-static {v7, v8, v0}, LQ1/k;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 467
    .line 468
    .line 469
    :goto_14
    iget-object v0, v6, LU1/N;->a:Lk2/a;

    .line 470
    .line 471
    iget-object v7, v6, LU1/N;->c:LU1/M;

    .line 472
    .line 473
    invoke-virtual {v0, v7}, Lk2/a;->r(Lk2/M;)V

    .line 474
    .line 475
    .line 476
    iget-object v0, v6, LU1/N;->a:Lk2/a;

    .line 477
    .line 478
    invoke-virtual {v0, v7}, Lk2/a;->q(LZ1/e;)V

    .line 479
    .line 480
    .line 481
    goto :goto_13

    .line 482
    :cond_10
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 483
    .line 484
    .line 485
    iget-object v0, v2, LE5/n0;->f:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast v0, Ljava/util/HashSet;

    .line 488
    .line 489
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 490
    .line 491
    .line 492
    iput-boolean v3, v2, LE5/n0;->g:Z

    .line 493
    .line 494
    :cond_11
    return-void
.end method

.method public final H()V
    .locals 1

    .line 1
    iget-object v0, p0, LU1/z;->s:LU1/G;

    .line 2
    .line 3
    iget-object v0, v0, LU1/G;->i:LU1/E;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, LU1/E;->g:LU1/F;

    .line 8
    .line 9
    iget-boolean v0, v0, LU1/F;->h:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, LU1/z;->D:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    iput-boolean v0, p0, LU1/z;->E:Z

    .line 21
    .line 22
    return-void
.end method

.method public final I(J)V
    .locals 6

    .line 1
    iget-object v0, p0, LU1/z;->s:LU1/G;

    .line 2
    .line 3
    iget-object v1, v0, LU1/G;->i:LU1/E;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const-wide v1, 0xe8d4a51000L

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    :goto_0
    add-long/2addr p1, v1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-wide v1, v1, LU1/E;->p:J

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :goto_1
    iput-wide p1, p0, LU1/z;->P:J

    .line 18
    .line 19
    iget-object v1, p0, LU1/z;->o:LE5/l;

    .line 20
    .line 21
    iget-object v1, v1, LE5/l;->d:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, LA7/a0;

    .line 24
    .line 25
    invoke-virtual {v1, p1, p2}, LA7/a0;->b(J)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, LU1/z;->a:[LU1/W;

    .line 29
    .line 30
    array-length p2, p1

    .line 31
    const/4 v1, 0x0

    .line 32
    move v2, v1

    .line 33
    :goto_2
    if-ge v2, p2, :cond_2

    .line 34
    .line 35
    aget-object v3, p1, v2

    .line 36
    .line 37
    invoke-static {v3}, LU1/z;->s(LU1/W;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    iget-wide v4, p0, LU1/z;->P:J

    .line 44
    .line 45
    invoke-interface {v3, v4, v5}, LU1/W;->A(J)V

    .line 46
    .line 47
    .line 48
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    iget-object p1, v0, LU1/G;->i:LU1/E;

    .line 52
    .line 53
    :goto_3
    if-eqz p1, :cond_5

    .line 54
    .line 55
    iget-object p2, p1, LU1/E;->o:Ln2/t;

    .line 56
    .line 57
    iget-object p2, p2, Ln2/t;->c:[Ln2/q;

    .line 58
    .line 59
    array-length v0, p2

    .line 60
    move v2, v1

    .line 61
    :goto_4
    if-ge v2, v0, :cond_4

    .line 62
    .line 63
    aget-object v3, p2, v2

    .line 64
    .line 65
    if-eqz v3, :cond_3

    .line 66
    .line 67
    invoke-interface {v3}, Ln2/q;->e()V

    .line 68
    .line 69
    .line 70
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_4
    iget-object p1, p1, LU1/E;->m:LU1/E;

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_5
    return-void
.end method

.method public final J(LN1/N;LN1/N;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, LN1/N;->p()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, LN1/N;->p()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p1, p0, LU1/z;->p:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    add-int/lit8 p2, p2, -0x1

    .line 21
    .line 22
    if-gez p2, :cond_1

    .line 23
    .line 24
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, LVa/M6;->z(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    throw p1
.end method

.method public final M(J)V
    .locals 2

    .line 1
    iget-object v0, p0, LU1/z;->A:LU1/P;

    .line 2
    .line 3
    iget v0, v0, LU1/P;->e:I

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, LU1/z;->d0()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-wide/16 v0, 0x3e8

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-wide v0, LU1/z;->W:J

    .line 18
    .line 19
    :goto_0
    add-long/2addr p1, v0

    .line 20
    iget-object v0, p0, LU1/z;->i:LQ1/s;

    .line 21
    .line 22
    iget-object v0, v0, LQ1/s;->a:Landroid/os/Handler;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final N(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, LU1/z;->s:LU1/G;

    .line 2
    .line 3
    iget-object v0, v0, LU1/G;->i:LU1/E;

    .line 4
    .line 5
    iget-object v0, v0, LU1/E;->g:LU1/F;

    .line 6
    .line 7
    iget-object v2, v0, LU1/F;->a:Lk2/H;

    .line 8
    .line 9
    iget-object v0, p0, LU1/z;->A:LU1/P;

    .line 10
    .line 11
    iget-wide v3, v0, LU1/P;->s:J

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v1, p0

    .line 16
    invoke-virtual/range {v1 .. v6}, LU1/z;->P(Lk2/H;JZZ)J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 21
    .line 22
    iget-wide v5, v0, LU1/P;->s:J

    .line 23
    .line 24
    cmp-long v0, v3, v5

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 29
    .line 30
    iget-wide v5, v0, LU1/P;->c:J

    .line 31
    .line 32
    iget-wide v7, v0, LU1/P;->d:J

    .line 33
    .line 34
    const/4 v10, 0x5

    .line 35
    move v9, p1

    .line 36
    invoke-virtual/range {v1 .. v10}, LU1/z;->q(Lk2/H;JJJZI)LU1/P;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, v1, LU1/z;->A:LU1/P;

    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public final O(LU1/y;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LU1/z;->B:LT5/s;

    .line 4
    .line 5
    const/4 v9, 0x1

    .line 6
    invoke-virtual {v0, v9}, LT5/s;->c(I)V

    .line 7
    .line 8
    .line 9
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 10
    .line 11
    iget-object v2, v0, LU1/P;->a:LN1/N;

    .line 12
    .line 13
    iget v5, v1, LU1/z;->I:I

    .line 14
    .line 15
    iget-boolean v6, v1, LU1/z;->J:Z

    .line 16
    .line 17
    iget-object v7, v1, LU1/z;->l:LN1/M;

    .line 18
    .line 19
    iget-object v8, v1, LU1/z;->m:LN1/L;

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    move-object/from16 v3, p1

    .line 23
    .line 24
    invoke-static/range {v2 .. v8}, LU1/z;->K(LN1/N;LU1/y;ZIZLN1/M;LN1/L;)Landroid/util/Pair;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    const/4 v8, 0x0

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    iget-object v2, v1, LU1/z;->A:LU1/P;

    .line 37
    .line 38
    iget-object v2, v2, LU1/P;->a:LN1/N;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, LU1/z;->h(LN1/N;)Landroid/util/Pair;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v10, Lk2/H;

    .line 47
    .line 48
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Ljava/lang/Long;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v11

    .line 56
    iget-object v2, v1, LU1/z;->A:LU1/P;

    .line 57
    .line 58
    iget-object v2, v2, LU1/P;->a:LN1/N;

    .line 59
    .line 60
    invoke-virtual {v2}, LN1/N;->p()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    xor-int/2addr v2, v9

    .line 65
    move-wide v5, v6

    .line 66
    :goto_0
    const-wide/16 v15, 0x0

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_0
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 70
    .line 71
    iget-object v10, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v10, Ljava/lang/Long;

    .line 74
    .line 75
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 76
    .line 77
    .line 78
    move-result-wide v11

    .line 79
    iget-wide v13, v3, LU1/y;->c:J

    .line 80
    .line 81
    cmp-long v10, v13, v6

    .line 82
    .line 83
    if-nez v10, :cond_1

    .line 84
    .line 85
    move-wide v13, v6

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    move-wide v13, v11

    .line 88
    :goto_1
    iget-object v10, v1, LU1/z;->s:LU1/G;

    .line 89
    .line 90
    iget-object v15, v1, LU1/z;->A:LU1/P;

    .line 91
    .line 92
    iget-object v15, v15, LU1/P;->a:LN1/N;

    .line 93
    .line 94
    invoke-virtual {v10, v15, v2, v11, v12}, LU1/G;->n(LN1/N;Ljava/lang/Object;J)Lk2/H;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    invoke-virtual {v10}, Lk2/H;->b()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_3

    .line 103
    .line 104
    iget-object v2, v1, LU1/z;->A:LU1/P;

    .line 105
    .line 106
    iget-object v2, v2, LU1/P;->a:LN1/N;

    .line 107
    .line 108
    iget-object v6, v10, Lk2/H;->a:Ljava/lang/Object;

    .line 109
    .line 110
    iget-object v7, v1, LU1/z;->m:LN1/L;

    .line 111
    .line 112
    invoke-virtual {v2, v6, v7}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 113
    .line 114
    .line 115
    iget-object v2, v1, LU1/z;->m:LN1/L;

    .line 116
    .line 117
    iget v6, v10, Lk2/H;->b:I

    .line 118
    .line 119
    invoke-virtual {v2, v6}, LN1/L;->e(I)I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    iget v6, v10, Lk2/H;->c:I

    .line 124
    .line 125
    if-ne v2, v6, :cond_2

    .line 126
    .line 127
    iget-object v2, v1, LU1/z;->m:LN1/L;

    .line 128
    .line 129
    iget-object v2, v2, LN1/L;->g:LN1/b;

    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    :cond_2
    move v2, v9

    .line 135
    move-wide v5, v13

    .line 136
    const-wide/16 v11, 0x0

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_3
    const-wide/16 v15, 0x0

    .line 140
    .line 141
    iget-wide v4, v3, LU1/y;->c:J

    .line 142
    .line 143
    cmp-long v2, v4, v6

    .line 144
    .line 145
    if-nez v2, :cond_4

    .line 146
    .line 147
    move v2, v9

    .line 148
    goto :goto_2

    .line 149
    :cond_4
    move v2, v8

    .line 150
    :goto_2
    move-wide v5, v13

    .line 151
    :goto_3
    :try_start_0
    iget-object v4, v1, LU1/z;->A:LU1/P;

    .line 152
    .line 153
    iget-object v4, v4, LU1/P;->a:LN1/N;

    .line 154
    .line 155
    invoke-virtual {v4}, LN1/N;->p()Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    if-eqz v4, :cond_5

    .line 160
    .line 161
    iput-object v3, v1, LU1/z;->O:LU1/y;

    .line 162
    .line 163
    goto :goto_6

    .line 164
    :catchall_0
    move-exception v0

    .line 165
    move v9, v2

    .line 166
    :goto_4
    move-object v2, v10

    .line 167
    :goto_5
    move-wide v3, v11

    .line 168
    goto/16 :goto_12

    .line 169
    .line 170
    :cond_5
    const/4 v3, 0x4

    .line 171
    if-nez v0, :cond_7

    .line 172
    .line 173
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 174
    .line 175
    iget v0, v0, LU1/P;->e:I

    .line 176
    .line 177
    if-eq v0, v9, :cond_6

    .line 178
    .line 179
    invoke-virtual {v1, v3}, LU1/z;->c0(I)V

    .line 180
    .line 181
    .line 182
    :cond_6
    invoke-virtual {v1, v8, v9, v8, v9}, LU1/z;->G(ZZZZ)V

    .line 183
    .line 184
    .line 185
    :goto_6
    move v9, v2

    .line 186
    move-object v2, v10

    .line 187
    move-wide v3, v11

    .line 188
    goto/16 :goto_f

    .line 189
    .line 190
    :cond_7
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 191
    .line 192
    iget-object v0, v0, LU1/P;->b:Lk2/H;

    .line 193
    .line 194
    invoke-virtual {v10, v0}, Lk2/H;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    if-eqz v0, :cond_b

    .line 199
    .line 200
    :try_start_1
    iget-object v0, v1, LU1/z;->s:LU1/G;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 201
    .line 202
    :try_start_2
    iget-object v0, v0, LU1/G;->i:LU1/E;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 203
    .line 204
    if-eqz v0, :cond_8

    .line 205
    .line 206
    :try_start_3
    iget-boolean v4, v0, LU1/E;->e:Z

    .line 207
    .line 208
    if-eqz v4, :cond_8

    .line 209
    .line 210
    cmp-long v4, v11, v15

    .line 211
    .line 212
    if-eqz v4, :cond_8

    .line 213
    .line 214
    iget-object v0, v0, LU1/E;->a:Ljava/lang/Object;

    .line 215
    .line 216
    iget-object v4, v1, LU1/z;->z:LU1/a0;

    .line 217
    .line 218
    invoke-interface {v0, v11, v12, v4}, Lk2/F;->b(JLU1/a0;)J

    .line 219
    .line 220
    .line 221
    move-result-wide v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 222
    goto :goto_7

    .line 223
    :cond_8
    move-wide v13, v11

    .line 224
    :goto_7
    :try_start_4
    invoke-static {v13, v14}, LQ1/x;->W(J)J

    .line 225
    .line 226
    .line 227
    move-result-wide v15

    .line 228
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 229
    .line 230
    iget-wide v8, v0, LU1/P;->s:J

    .line 231
    .line 232
    invoke-static {v8, v9}, LQ1/x;->W(J)J

    .line 233
    .line 234
    .line 235
    move-result-wide v8

    .line 236
    cmp-long v0, v15, v8

    .line 237
    .line 238
    if-nez v0, :cond_9

    .line 239
    .line 240
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 241
    .line 242
    iget v4, v0, LU1/P;->e:I

    .line 243
    .line 244
    const/4 v8, 0x2

    .line 245
    if-eq v4, v8, :cond_a

    .line 246
    .line 247
    const/4 v8, 0x3

    .line 248
    if-ne v4, v8, :cond_9

    .line 249
    .line 250
    goto :goto_8

    .line 251
    :cond_9
    move v9, v2

    .line 252
    move-wide v15, v5

    .line 253
    move-object v2, v10

    .line 254
    goto :goto_a

    .line 255
    :cond_a
    :goto_8
    iget-wide v3, v0, LU1/P;->s:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 256
    .line 257
    move v9, v2

    .line 258
    move-object v2, v10

    .line 259
    const/4 v10, 0x2

    .line 260
    move-wide v7, v3

    .line 261
    :goto_9
    invoke-virtual/range {v1 .. v10}, LU1/z;->q(Lk2/H;JJJZI)LU1/P;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    iput-object v0, v1, LU1/z;->A:LU1/P;

    .line 266
    .line 267
    return-void

    .line 268
    :catchall_1
    move-exception v0

    .line 269
    move v9, v2

    .line 270
    move-wide v15, v5

    .line 271
    goto :goto_4

    .line 272
    :catchall_2
    move-exception v0

    .line 273
    move v9, v2

    .line 274
    move-wide v15, v5

    .line 275
    move-object v2, v10

    .line 276
    move-wide v3, v11

    .line 277
    move-wide v5, v15

    .line 278
    goto/16 :goto_12

    .line 279
    .line 280
    :cond_b
    move v9, v2

    .line 281
    move-wide v15, v5

    .line 282
    move-object v2, v10

    .line 283
    move-wide v13, v11

    .line 284
    :goto_a
    :try_start_5
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 285
    .line 286
    iget v0, v0, LU1/P;->e:I

    .line 287
    .line 288
    if-ne v0, v3, :cond_c

    .line 289
    .line 290
    const/4 v6, 0x1

    .line 291
    goto :goto_b

    .line 292
    :cond_c
    const/4 v6, 0x0

    .line 293
    :goto_b
    iget-object v0, v1, LU1/z;->s:LU1/G;

    .line 294
    .line 295
    iget-object v3, v0, LU1/G;->i:LU1/E;

    .line 296
    .line 297
    iget-object v0, v0, LU1/G;->j:LU1/E;

    .line 298
    .line 299
    if-eq v3, v0, :cond_d

    .line 300
    .line 301
    const/4 v5, 0x1

    .line 302
    :goto_c
    move-wide v3, v13

    .line 303
    goto :goto_d

    .line 304
    :cond_d
    const/4 v5, 0x0

    .line 305
    goto :goto_c

    .line 306
    :goto_d
    invoke-virtual/range {v1 .. v6}, LU1/z;->P(Lk2/H;JZZ)J

    .line 307
    .line 308
    .line 309
    move-result-wide v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 310
    cmp-long v0, v11, v13

    .line 311
    .line 312
    if-eqz v0, :cond_e

    .line 313
    .line 314
    const/16 v17, 0x1

    .line 315
    .line 316
    goto :goto_e

    .line 317
    :cond_e
    const/16 v17, 0x0

    .line 318
    .line 319
    :goto_e
    or-int v9, v9, v17

    .line 320
    .line 321
    :try_start_6
    iget-object v0, v1, LU1/z;->A:LU1/P;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 322
    .line 323
    move-object v3, v2

    .line 324
    :try_start_7
    iget-object v2, v0, LU1/P;->a:LN1/N;

    .line 325
    .line 326
    iget-object v5, v0, LU1/P;->b:Lk2/H;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 327
    .line 328
    const/4 v8, 0x1

    .line 329
    move-object v4, v2

    .line 330
    move-wide v6, v15

    .line 331
    :try_start_8
    invoke-virtual/range {v1 .. v8}, LU1/z;->m0(LN1/N;Lk2/H;LN1/N;Lk2/H;JZ)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 332
    .line 333
    .line 334
    move-object v2, v3

    .line 335
    move-wide v5, v6

    .line 336
    move-wide v3, v13

    .line 337
    :goto_f
    const/4 v10, 0x2

    .line 338
    move-wide v7, v3

    .line 339
    move-object/from16 v1, p0

    .line 340
    .line 341
    goto :goto_9

    .line 342
    :catchall_3
    move-exception v0

    .line 343
    move-object v2, v3

    .line 344
    move-wide v5, v6

    .line 345
    :goto_10
    move-wide v3, v13

    .line 346
    goto :goto_12

    .line 347
    :catchall_4
    move-exception v0

    .line 348
    move-object v2, v3

    .line 349
    :goto_11
    move-wide v5, v15

    .line 350
    goto :goto_10

    .line 351
    :catchall_5
    move-exception v0

    .line 352
    goto :goto_11

    .line 353
    :catchall_6
    move-exception v0

    .line 354
    move-wide v5, v15

    .line 355
    goto/16 :goto_5

    .line 356
    .line 357
    :goto_12
    const/4 v10, 0x2

    .line 358
    move-wide v7, v3

    .line 359
    invoke-virtual/range {v1 .. v10}, LU1/z;->q(Lk2/H;JJJZI)LU1/P;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    iput-object v2, v1, LU1/z;->A:LU1/P;

    .line 364
    .line 365
    throw v0
.end method

.method public final P(Lk2/H;JZZ)J
    .locals 8

    .line 1
    invoke-virtual {p0}, LU1/z;->h0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v0, v1}, LU1/z;->n0(ZZ)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    if-nez p5, :cond_0

    .line 11
    .line 12
    iget-object p5, p0, LU1/z;->A:LU1/P;

    .line 13
    .line 14
    iget p5, p5, LU1/P;->e:I

    .line 15
    .line 16
    const/4 v2, 0x3

    .line 17
    if-ne p5, v2, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0, v1}, LU1/z;->c0(I)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object p5, p0, LU1/z;->s:LU1/G;

    .line 23
    .line 24
    iget-object v2, p5, LU1/G;->i:LU1/E;

    .line 25
    .line 26
    move-object v3, v2

    .line 27
    :goto_0
    if-eqz v3, :cond_3

    .line 28
    .line 29
    iget-object v4, v3, LU1/E;->g:LU1/F;

    .line 30
    .line 31
    iget-object v4, v4, LU1/F;->a:Lk2/H;

    .line 32
    .line 33
    invoke-virtual {p1, v4}, Lk2/H;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    iget-object v3, v3, LU1/E;->m:LU1/E;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    :goto_1
    if-nez p4, :cond_4

    .line 44
    .line 45
    if-ne v2, v3, :cond_4

    .line 46
    .line 47
    if-eqz v3, :cond_7

    .line 48
    .line 49
    iget-wide v4, v3, LU1/E;->p:J

    .line 50
    .line 51
    add-long/2addr v4, p2

    .line 52
    const-wide/16 v6, 0x0

    .line 53
    .line 54
    cmp-long p1, v4, v6

    .line 55
    .line 56
    if-gez p1, :cond_7

    .line 57
    .line 58
    :cond_4
    move p1, v0

    .line 59
    :goto_2
    iget-object p4, p0, LU1/z;->a:[LU1/W;

    .line 60
    .line 61
    array-length v2, p4

    .line 62
    if-ge p1, v2, :cond_5

    .line 63
    .line 64
    invoke-virtual {p0, p1}, LU1/z;->c(I)V

    .line 65
    .line 66
    .line 67
    add-int/lit8 p1, p1, 0x1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_5
    if-eqz v3, :cond_7

    .line 71
    .line 72
    :goto_3
    iget-object p1, p5, LU1/G;->i:LU1/E;

    .line 73
    .line 74
    if-eq p1, v3, :cond_6

    .line 75
    .line 76
    invoke-virtual {p5}, LU1/G;->a()LU1/E;

    .line 77
    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_6
    invoke-virtual {p5, v3}, LU1/G;->l(LU1/E;)Z

    .line 81
    .line 82
    .line 83
    const-wide v4, 0xe8d4a51000L

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    iput-wide v4, v3, LU1/E;->p:J

    .line 89
    .line 90
    array-length p1, p4

    .line 91
    new-array p1, p1, [Z

    .line 92
    .line 93
    iget-object p4, p5, LU1/G;->j:LU1/E;

    .line 94
    .line 95
    invoke-virtual {p4}, LU1/E;->e()J

    .line 96
    .line 97
    .line 98
    move-result-wide v4

    .line 99
    invoke-virtual {p0, p1, v4, v5}, LU1/z;->e([ZJ)V

    .line 100
    .line 101
    .line 102
    :cond_7
    if-eqz v3, :cond_a

    .line 103
    .line 104
    invoke-virtual {p5, v3}, LU1/G;->l(LU1/E;)Z

    .line 105
    .line 106
    .line 107
    iget-boolean p1, v3, LU1/E;->e:Z

    .line 108
    .line 109
    if-nez p1, :cond_8

    .line 110
    .line 111
    iget-object p1, v3, LU1/E;->g:LU1/F;

    .line 112
    .line 113
    invoke-virtual {p1, p2, p3}, LU1/F;->b(J)LU1/F;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iput-object p1, v3, LU1/E;->g:LU1/F;

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_8
    iget-boolean p1, v3, LU1/E;->f:Z

    .line 121
    .line 122
    if-eqz p1, :cond_9

    .line 123
    .line 124
    iget-object p1, v3, LU1/E;->a:Ljava/lang/Object;

    .line 125
    .line 126
    invoke-interface {p1, p2, p3}, Lk2/F;->d(J)J

    .line 127
    .line 128
    .line 129
    move-result-wide p2

    .line 130
    iget-wide p4, p0, LU1/z;->n:J

    .line 131
    .line 132
    sub-long p4, p2, p4

    .line 133
    .line 134
    invoke-interface {p1, p4, p5}, Lk2/F;->i(J)V

    .line 135
    .line 136
    .line 137
    :cond_9
    :goto_4
    invoke-virtual {p0, p2, p3}, LU1/z;->I(J)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, LU1/z;->u()V

    .line 141
    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_a
    invoke-virtual {p5}, LU1/G;->b()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, p2, p3}, LU1/z;->I(J)V

    .line 148
    .line 149
    .line 150
    :goto_5
    invoke-virtual {p0, v0}, LU1/z;->m(Z)V

    .line 151
    .line 152
    .line 153
    iget-object p1, p0, LU1/z;->i:LQ1/s;

    .line 154
    .line 155
    invoke-virtual {p1, v1}, LQ1/s;->e(I)Z

    .line 156
    .line 157
    .line 158
    return-wide p2
.end method

.method public final Q(LU1/T;)V
    .locals 5

    .line 1
    iget-object v0, p1, LU1/T;->f:Landroid/os/Looper;

    .line 2
    .line 3
    iget-object v1, p0, LU1/z;->k:Landroid/os/Looper;

    .line 4
    .line 5
    iget-object v2, p0, LU1/z;->i:LQ1/s;

    .line 6
    .line 7
    if-ne v0, v1, :cond_2

    .line 8
    .line 9
    monitor-enter p1

    .line 10
    monitor-exit p1

    .line 11
    const/4 v0, 0x1

    .line 12
    :try_start_0
    iget-object v1, p1, LU1/T;->a:LU1/W;

    .line 13
    .line 14
    iget v3, p1, LU1/T;->d:I

    .line 15
    .line 16
    iget-object v4, p1, LU1/T;->e:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {v1, v3, v4}, LU1/S;->c(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, LU1/T;->b(Z)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, LU1/z;->A:LU1/P;

    .line 25
    .line 26
    iget p1, p1, LU1/P;->e:I

    .line 27
    .line 28
    const/4 v0, 0x3

    .line 29
    const/4 v1, 0x2

    .line 30
    if-eq p1, v0, :cond_1

    .line 31
    .line 32
    if-ne p1, v1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-void

    .line 36
    :cond_1
    :goto_0
    invoke-virtual {v2, v1}, LQ1/s;->e(I)Z

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    invoke-virtual {p1, v0}, LU1/T;->b(Z)V

    .line 42
    .line 43
    .line 44
    throw v1

    .line 45
    :cond_2
    const/16 v0, 0xf

    .line 46
    .line 47
    invoke-virtual {v2, v0, p1}, LQ1/s;->a(ILjava/lang/Object;)LQ1/r;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, LQ1/r;->b()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final R(LU1/T;)V
    .locals 3

    .line 1
    iget-object v0, p1, LU1/T;->f:Landroid/os/Looper;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const-string v0, "TAG"

    .line 14
    .line 15
    const-string v1, "Trying to send message on a dead thread."

    .line 16
    .line 17
    invoke-static {v0, v1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p1, v0}, LU1/T;->b(Z)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    iget-object v2, p0, LU1/z;->q:LQ1/q;

    .line 27
    .line 28
    invoke-virtual {v2, v0, v1}, LQ1/q;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)LQ1/s;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, LT3/r;

    .line 33
    .line 34
    const/4 v2, 0x5

    .line 35
    invoke-direct {v1, v2, p0, p1}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, LQ1/s;->c(Ljava/lang/Runnable;)Z

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final T(ZLjava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, LU1/z;->K:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-boolean p1, p0, LU1/z;->K:Z

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, LU1/z;->a:[LU1/W;

    .line 10
    .line 11
    array-length v0, p1

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_1

    .line 14
    .line 15
    aget-object v2, p1, v1

    .line 16
    .line 17
    invoke-static {v2}, LU1/z;->s(LU1/W;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    iget-object v3, p0, LU1/z;->b:Ljava/util/Set;

    .line 24
    .line 25
    invoke-interface {v3, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-interface {v2}, LU1/W;->reset()V

    .line 32
    .line 33
    .line 34
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    if-eqz p2, :cond_2

    .line 38
    .line 39
    monitor-enter p0

    .line 40
    const/4 p1, 0x1

    .line 41
    :try_start_0
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 45
    .line 46
    .line 47
    monitor-exit p0

    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    throw p1

    .line 52
    :cond_2
    return-void
.end method

.method public final U(LU1/w;)V
    .locals 7

    .line 1
    iget-object v0, p0, LU1/z;->B:LT5/s;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, LT5/s;->c(I)V

    .line 5
    .line 6
    .line 7
    iget v0, p1, LU1/w;->c:I

    .line 8
    .line 9
    iget-object v1, p1, LU1/w;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    iget-object v3, p1, LU1/w;->b:Lk2/g0;

    .line 13
    .line 14
    if-eq v0, v2, :cond_0

    .line 15
    .line 16
    new-instance v0, LU1/y;

    .line 17
    .line 18
    new-instance v2, LU1/V;

    .line 19
    .line 20
    invoke-direct {v2, v1, v3}, LU1/V;-><init>(Ljava/util/ArrayList;Lk2/g0;)V

    .line 21
    .line 22
    .line 23
    iget v4, p1, LU1/w;->c:I

    .line 24
    .line 25
    iget-wide v5, p1, LU1/w;->d:J

    .line 26
    .line 27
    invoke-direct {v0, v2, v4, v5, v6}, LU1/y;-><init>(LN1/N;IJ)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, LU1/z;->O:LU1/y;

    .line 31
    .line 32
    :cond_0
    iget-object p1, p0, LU1/z;->t:LE5/n0;

    .line 33
    .line 34
    iget-object v0, p1, LE5/n0;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const/4 v4, 0x0

    .line 43
    invoke-virtual {p1, v4, v2}, LE5/n0;->r(II)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {p1, v0, v1, v3}, LE5/n0;->b(ILjava/util/ArrayList;Lk2/g0;)LN1/N;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p0, p1, v4}, LU1/z;->n(LN1/N;Z)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final V(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, LU1/z;->D:Z

    .line 2
    .line 3
    invoke-virtual {p0}, LU1/z;->H()V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, LU1/z;->E:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, LU1/z;->s:LU1/G;

    .line 11
    .line 12
    iget-object v0, p1, LU1/G;->j:LU1/E;

    .line 13
    .line 14
    iget-object p1, p1, LU1/G;->i:LU1/E;

    .line 15
    .line 16
    if-eq v0, p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    invoke-virtual {p0, p1}, LU1/z;->N(Z)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p1}, LU1/z;->m(Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final W(IIZZ)V
    .locals 3

    .line 1
    iget-object v0, p0, LU1/z;->B:LT5/s;

    .line 2
    .line 3
    invoke-virtual {v0, p4}, LT5/s;->c(I)V

    .line 4
    .line 5
    .line 6
    iget-object p4, p0, LU1/z;->A:LU1/P;

    .line 7
    .line 8
    invoke-virtual {p4, p2, p1, p3}, LU1/P;->d(IIZ)LU1/P;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, LU1/z;->A:LU1/P;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-virtual {p0, p1, p1}, LU1/z;->n0(ZZ)V

    .line 16
    .line 17
    .line 18
    iget-object p2, p0, LU1/z;->s:LU1/G;

    .line 19
    .line 20
    iget-object p2, p2, LU1/G;->i:LU1/E;

    .line 21
    .line 22
    :goto_0
    if-eqz p2, :cond_2

    .line 23
    .line 24
    iget-object p4, p2, LU1/E;->o:Ln2/t;

    .line 25
    .line 26
    iget-object p4, p4, Ln2/t;->c:[Ln2/q;

    .line 27
    .line 28
    array-length v0, p4

    .line 29
    move v1, p1

    .line 30
    :goto_1
    if-ge v1, v0, :cond_1

    .line 31
    .line 32
    aget-object v2, p4, v1

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-interface {v2, p3}, Ln2/q;->h(Z)V

    .line 37
    .line 38
    .line 39
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    iget-object p2, p2, LU1/E;->m:LU1/E;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {p0}, LU1/z;->d0()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_3

    .line 50
    .line 51
    invoke-virtual {p0}, LU1/z;->h0()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, LU1/z;->l0()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    iget-object p1, p0, LU1/z;->A:LU1/P;

    .line 59
    .line 60
    iget p1, p1, LU1/P;->e:I

    .line 61
    .line 62
    const/4 p2, 0x3

    .line 63
    iget-object p3, p0, LU1/z;->i:LQ1/s;

    .line 64
    .line 65
    const/4 p4, 0x2

    .line 66
    if-ne p1, p2, :cond_4

    .line 67
    .line 68
    iget-object p1, p0, LU1/z;->o:LE5/l;

    .line 69
    .line 70
    const/4 p2, 0x1

    .line 71
    iput-boolean p2, p1, LE5/l;->c:Z

    .line 72
    .line 73
    iget-object p1, p1, LE5/l;->d:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, LA7/a0;

    .line 76
    .line 77
    invoke-virtual {p1}, LA7/a0;->c()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, LU1/z;->f0()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p3, p4}, LQ1/s;->e(I)Z

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_4
    if-ne p1, p4, :cond_5

    .line 88
    .line 89
    invoke-virtual {p3, p4}, LQ1/s;->e(I)Z

    .line 90
    .line 91
    .line 92
    :cond_5
    return-void
.end method

.method public final X(LN1/F;)V
    .locals 2

    .line 1
    iget-object v0, p0, LU1/z;->i:LQ1/s;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LQ1/s;->d(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LU1/z;->o:LE5/l;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, LE5/l;->q(LN1/F;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, LE5/l;->e()LN1/F;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget v0, p1, LN1/F;->a:F

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {p0, p1, v0, v1, v1}, LU1/z;->p(LN1/F;FZZ)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final Y(LU1/l;)V
    .locals 3

    .line 1
    iput-object p1, p0, LU1/z;->V:LU1/l;

    .line 2
    .line 3
    iget-object v0, p0, LU1/z;->A:LU1/P;

    .line 4
    .line 5
    iget-object v0, v0, LU1/P;->a:LN1/N;

    .line 6
    .line 7
    iget-object v0, p0, LU1/z;->s:LU1/G;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p1, v0, LU1/G;->p:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_0
    iget-object v2, v0, LU1/G;->p:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-ge v1, v2, :cond_0

    .line 36
    .line 37
    iget-object v2, v0, LU1/G;->p:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, LU1/E;

    .line 44
    .line 45
    invoke-virtual {v2}, LU1/E;->i()V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iput-object p1, v0, LU1/G;->p:Ljava/util/ArrayList;

    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    iput-object p1, v0, LU1/G;->l:LU1/E;

    .line 55
    .line 56
    invoke-virtual {v0}, LU1/G;->j()V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void
.end method

.method public final Z(I)V
    .locals 2

    .line 1
    iput p1, p0, LU1/z;->I:I

    .line 2
    .line 3
    iget-object v0, p0, LU1/z;->A:LU1/P;

    .line 4
    .line 5
    iget-object v0, v0, LU1/P;->a:LN1/N;

    .line 6
    .line 7
    iget-object v1, p0, LU1/z;->s:LU1/G;

    .line 8
    .line 9
    iput p1, v1, LU1/G;->g:I

    .line 10
    .line 11
    invoke-virtual {v1, v0}, LU1/G;->p(LN1/N;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-virtual {p0, p1}, LU1/z;->N(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    invoke-virtual {p0, p1}, LU1/z;->m(Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final a(Lk2/f0;)V
    .locals 2

    .line 1
    check-cast p1, Lk2/F;

    .line 2
    .line 3
    iget-object v0, p0, LU1/z;->i:LQ1/s;

    .line 4
    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, LQ1/s;->a(ILjava/lang/Object;)LQ1/r;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, LQ1/r;->b()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final a0(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, LU1/z;->J:Z

    .line 2
    .line 3
    iget-object v0, p0, LU1/z;->A:LU1/P;

    .line 4
    .line 5
    iget-object v0, v0, LU1/P;->a:LN1/N;

    .line 6
    .line 7
    iget-object v1, p0, LU1/z;->s:LU1/G;

    .line 8
    .line 9
    iput-boolean p1, v1, LU1/G;->h:Z

    .line 10
    .line 11
    invoke-virtual {v1, v0}, LU1/G;->p(LN1/N;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-virtual {p0, p1}, LU1/z;->N(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    invoke-virtual {p0, p1}, LU1/z;->m(Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final b(LU1/w;I)V
    .locals 2

    .line 1
    iget-object v0, p0, LU1/z;->B:LT5/s;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, LT5/s;->c(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iget-object v1, p0, LU1/z;->t:LE5/n0;

    .line 9
    .line 10
    if-ne p2, v0, :cond_0

    .line 11
    .line 12
    iget-object p2, v1, LE5/n0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p2, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    :cond_0
    iget-object v0, p1, LU1/w;->a:Ljava/util/ArrayList;

    .line 21
    .line 22
    iget-object p1, p1, LU1/w;->b:Lk2/g0;

    .line 23
    .line 24
    invoke-virtual {v1, p2, v0, p1}, LE5/n0;->b(ILjava/util/ArrayList;Lk2/g0;)LN1/N;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-virtual {p0, p1, p2}, LU1/z;->n(LN1/N;Z)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final b0(Lk2/g0;)V
    .locals 4

    .line 1
    iget-object v0, p0, LU1/z;->B:LT5/s;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, LT5/s;->c(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LU1/z;->t:LE5/n0;

    .line 8
    .line 9
    iget-object v1, v0, LE5/n0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p1, Lk2/g0;->b:[I

    .line 18
    .line 19
    array-length v2, v2

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eq v2, v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Lk2/g0;->a()Lk2/g0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1, v3, v1}, Lk2/g0;->b(II)Lk2/g0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :cond_0
    iput-object p1, v0, LE5/n0;->l:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-virtual {v0}, LE5/n0;->e()LN1/N;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p0, p1, v3}, LU1/z;->n(LN1/N;Z)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final c(I)V
    .locals 3

    .line 1
    iget-object v0, p0, LU1/z;->a:[LU1/W;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    invoke-static {v0}, LU1/z;->s(LU1/W;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, p1, v1}, LU1/z;->y(IZ)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LU1/z;->o:LE5/l;

    .line 17
    .line 18
    iget-object v1, p1, LE5/l;->f:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, LU1/W;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    if-ne v0, v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iput-object v1, p1, LE5/l;->g:Ljava/lang/Object;

    .line 27
    .line 28
    iput-object v1, p1, LE5/l;->f:Ljava/lang/Object;

    .line 29
    .line 30
    iput-boolean v2, p1, LE5/l;->b:Z

    .line 31
    .line 32
    :cond_1
    invoke-interface {v0}, LU1/W;->getState()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    const/4 v1, 0x2

    .line 37
    if-ne p1, v1, :cond_2

    .line 38
    .line 39
    invoke-interface {v0}, LU1/W;->stop()V

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-interface {v0}, LU1/W;->a()V

    .line 43
    .line 44
    .line 45
    iget p1, p0, LU1/z;->N:I

    .line 46
    .line 47
    sub-int/2addr p1, v2

    .line 48
    iput p1, p0, LU1/z;->N:I

    .line 49
    .line 50
    return-void
.end method

.method public final c0(I)V
    .locals 3

    .line 1
    iget-object v0, p0, LU1/z;->A:LU1/P;

    .line 2
    .line 3
    iget v1, v0, LU1/P;->e:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq p1, v1, :cond_0

    .line 9
    .line 10
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide v1, p0, LU1/z;->U:J

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0, p1}, LU1/P;->g(I)LU1/P;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, LU1/z;->A:LU1/P;

    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public final d()V
    .locals 51

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LU1/z;->q:LQ1/q;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v11

    .line 12
    iget-object v0, v1, LU1/z;->i:LQ1/s;

    .line 13
    .line 14
    const/4 v13, 0x2

    .line 15
    invoke-virtual {v0, v13}, LQ1/s;->d(I)V

    .line 16
    .line 17
    .line 18
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 19
    .line 20
    iget-object v0, v0, LU1/P;->a:LN1/N;

    .line 21
    .line 22
    invoke-virtual {v0}, LN1/N;->p()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const/4 v10, 0x0

    .line 33
    const/4 v2, 0x1

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    iget-object v0, v1, LU1/z;->t:LE5/n0;

    .line 37
    .line 38
    iget-boolean v0, v0, LE5/n0;->g:Z

    .line 39
    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    :cond_0
    move v13, v2

    .line 43
    move-wide/from16 v16, v14

    .line 44
    .line 45
    const/4 v3, 0x3

    .line 46
    move-object v15, v9

    .line 47
    move v14, v10

    .line 48
    goto/16 :goto_1e

    .line 49
    .line 50
    :cond_1
    iget-object v0, v1, LU1/z;->s:LU1/G;

    .line 51
    .line 52
    iget-wide v4, v1, LU1/z;->P:J

    .line 53
    .line 54
    iget-object v0, v0, LU1/G;->k:LU1/E;

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    iget-object v6, v0, LU1/E;->m:LU1/E;

    .line 59
    .line 60
    if-nez v6, :cond_2

    .line 61
    .line 62
    move v6, v2

    .line 63
    goto :goto_0

    .line 64
    :cond_2
    move v6, v10

    .line 65
    :goto_0
    invoke-static {v6}, LQ1/k;->g(Z)V

    .line 66
    .line 67
    .line 68
    iget-boolean v6, v0, LU1/E;->e:Z

    .line 69
    .line 70
    if-eqz v6, :cond_3

    .line 71
    .line 72
    iget-object v6, v0, LU1/E;->a:Ljava/lang/Object;

    .line 73
    .line 74
    iget-wide v7, v0, LU1/E;->p:J

    .line 75
    .line 76
    sub-long/2addr v4, v7

    .line 77
    invoke-interface {v6, v4, v5}, Lk2/f0;->o(J)V

    .line 78
    .line 79
    .line 80
    :cond_3
    iget-object v0, v1, LU1/z;->s:LU1/G;

    .line 81
    .line 82
    iget-object v4, v0, LU1/G;->k:LU1/E;

    .line 83
    .line 84
    if-eqz v4, :cond_5

    .line 85
    .line 86
    iget-object v5, v4, LU1/E;->g:LU1/F;

    .line 87
    .line 88
    iget-boolean v5, v5, LU1/F;->i:Z

    .line 89
    .line 90
    if-nez v5, :cond_4

    .line 91
    .line 92
    invoke-virtual {v4}, LU1/E;->g()Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_4

    .line 97
    .line 98
    iget-object v4, v0, LU1/G;->k:LU1/E;

    .line 99
    .line 100
    iget-object v4, v4, LU1/E;->g:LU1/F;

    .line 101
    .line 102
    iget-wide v4, v4, LU1/F;->e:J

    .line 103
    .line 104
    cmp-long v4, v4, v14

    .line 105
    .line 106
    if-eqz v4, :cond_4

    .line 107
    .line 108
    iget v0, v0, LU1/G;->m:I

    .line 109
    .line 110
    const/16 v4, 0x64

    .line 111
    .line 112
    if-ge v0, v4, :cond_4

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_4
    move-wide/from16 v16, v14

    .line 116
    .line 117
    goto/16 :goto_9

    .line 118
    .line 119
    :cond_5
    :goto_1
    iget-object v0, v1, LU1/z;->s:LU1/G;

    .line 120
    .line 121
    iget-wide v4, v1, LU1/z;->P:J

    .line 122
    .line 123
    iget-object v6, v1, LU1/z;->A:LU1/P;

    .line 124
    .line 125
    iget-object v7, v0, LU1/G;->k:LU1/E;

    .line 126
    .line 127
    if-nez v7, :cond_6

    .line 128
    .line 129
    iget-object v4, v6, LU1/P;->a:LN1/N;

    .line 130
    .line 131
    iget-object v5, v6, LU1/P;->b:Lk2/H;

    .line 132
    .line 133
    iget-wide v7, v6, LU1/P;->c:J

    .line 134
    .line 135
    move-object/from16 v17, v4

    .line 136
    .line 137
    iget-wide v3, v6, LU1/P;->s:J

    .line 138
    .line 139
    move-object/from16 v16, v0

    .line 140
    .line 141
    move-wide/from16 v21, v3

    .line 142
    .line 143
    move-object/from16 v18, v5

    .line 144
    .line 145
    move-wide/from16 v19, v7

    .line 146
    .line 147
    invoke-virtual/range {v16 .. v22}, LU1/G;->d(LN1/N;Lk2/H;JJ)LU1/F;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    goto :goto_2

    .line 152
    :cond_6
    iget-object v3, v6, LU1/P;->a:LN1/N;

    .line 153
    .line 154
    invoke-virtual {v0, v3, v7, v4, v5}, LU1/G;->c(LN1/N;LU1/E;J)LU1/F;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    :goto_2
    if-eqz v0, :cond_4

    .line 159
    .line 160
    iget-object v3, v1, LU1/z;->s:LU1/G;

    .line 161
    .line 162
    iget-object v4, v3, LU1/G;->k:LU1/E;

    .line 163
    .line 164
    if-nez v4, :cond_7

    .line 165
    .line 166
    const-wide v4, 0xe8d4a51000L

    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    move-wide/from16 v26, v4

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_7
    iget-wide v5, v4, LU1/E;->p:J

    .line 175
    .line 176
    iget-object v4, v4, LU1/E;->g:LU1/F;

    .line 177
    .line 178
    iget-wide v7, v4, LU1/F;->e:J

    .line 179
    .line 180
    add-long/2addr v5, v7

    .line 181
    iget-wide v7, v0, LU1/F;->b:J

    .line 182
    .line 183
    sub-long/2addr v5, v7

    .line 184
    move-wide/from16 v26, v5

    .line 185
    .line 186
    :goto_3
    move v4, v10

    .line 187
    :goto_4
    iget-object v5, v3, LU1/G;->p:Ljava/util/ArrayList;

    .line 188
    .line 189
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-ge v4, v5, :cond_a

    .line 194
    .line 195
    iget-object v5, v3, LU1/G;->p:Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    check-cast v5, LU1/E;

    .line 202
    .line 203
    iget-object v5, v5, LU1/E;->g:LU1/F;

    .line 204
    .line 205
    iget-wide v6, v5, LU1/F;->e:J

    .line 206
    .line 207
    cmp-long v8, v6, v14

    .line 208
    .line 209
    move-wide/from16 v16, v14

    .line 210
    .line 211
    if-eqz v8, :cond_8

    .line 212
    .line 213
    iget-wide v14, v0, LU1/F;->e:J

    .line 214
    .line 215
    cmp-long v6, v6, v14

    .line 216
    .line 217
    if-nez v6, :cond_9

    .line 218
    .line 219
    :cond_8
    iget-wide v6, v5, LU1/F;->b:J

    .line 220
    .line 221
    iget-wide v14, v0, LU1/F;->b:J

    .line 222
    .line 223
    cmp-long v6, v6, v14

    .line 224
    .line 225
    if-nez v6, :cond_9

    .line 226
    .line 227
    iget-object v5, v5, LU1/F;->a:Lk2/H;

    .line 228
    .line 229
    iget-object v6, v0, LU1/F;->a:Lk2/H;

    .line 230
    .line 231
    invoke-virtual {v5, v6}, Lk2/H;->equals(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    if-eqz v5, :cond_9

    .line 236
    .line 237
    iget-object v5, v3, LU1/G;->p:Ljava/util/ArrayList;

    .line 238
    .line 239
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    check-cast v4, LU1/E;

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 247
    .line 248
    move-wide/from16 v14, v16

    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_a
    move-wide/from16 v16, v14

    .line 252
    .line 253
    move-object v4, v9

    .line 254
    :goto_5
    if-nez v4, :cond_b

    .line 255
    .line 256
    iget-object v4, v3, LU1/G;->e:LS8/b;

    .line 257
    .line 258
    new-instance v24, LU1/E;

    .line 259
    .line 260
    iget-object v4, v4, LS8/b;->b:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v4, LU1/z;

    .line 263
    .line 264
    iget-object v5, v4, LU1/z;->g:LU1/h;

    .line 265
    .line 266
    iget-object v5, v5, LU1/h;->a:Lo2/e;

    .line 267
    .line 268
    iget-object v6, v4, LU1/z;->V:LU1/l;

    .line 269
    .line 270
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    iget-object v6, v4, LU1/z;->t:LE5/n0;

    .line 274
    .line 275
    iget-object v7, v4, LU1/z;->f:Ln2/t;

    .line 276
    .line 277
    iget-object v8, v4, LU1/z;->c:[LU1/X;

    .line 278
    .line 279
    iget-object v4, v4, LU1/z;->e:Ln2/s;

    .line 280
    .line 281
    move-object/from16 v31, v0

    .line 282
    .line 283
    move-object/from16 v28, v4

    .line 284
    .line 285
    move-object/from16 v29, v5

    .line 286
    .line 287
    move-object/from16 v30, v6

    .line 288
    .line 289
    move-object/from16 v32, v7

    .line 290
    .line 291
    move-object/from16 v25, v8

    .line 292
    .line 293
    invoke-direct/range {v24 .. v32}, LU1/E;-><init>([LU1/X;JLn2/s;Lo2/e;LE5/n0;LU1/F;Ln2/t;)V

    .line 294
    .line 295
    .line 296
    move-object/from16 v4, v24

    .line 297
    .line 298
    goto :goto_6

    .line 299
    :cond_b
    move-wide/from16 v5, v26

    .line 300
    .line 301
    iput-object v0, v4, LU1/E;->g:LU1/F;

    .line 302
    .line 303
    iput-wide v5, v4, LU1/E;->p:J

    .line 304
    .line 305
    :goto_6
    iget-object v5, v3, LU1/G;->k:LU1/E;

    .line 306
    .line 307
    if-eqz v5, :cond_d

    .line 308
    .line 309
    iget-object v6, v5, LU1/E;->m:LU1/E;

    .line 310
    .line 311
    if-ne v4, v6, :cond_c

    .line 312
    .line 313
    goto :goto_7

    .line 314
    :cond_c
    invoke-virtual {v5}, LU1/E;->b()V

    .line 315
    .line 316
    .line 317
    iput-object v4, v5, LU1/E;->m:LU1/E;

    .line 318
    .line 319
    invoke-virtual {v5}, LU1/E;->c()V

    .line 320
    .line 321
    .line 322
    goto :goto_7

    .line 323
    :cond_d
    iput-object v4, v3, LU1/G;->i:LU1/E;

    .line 324
    .line 325
    iput-object v4, v3, LU1/G;->j:LU1/E;

    .line 326
    .line 327
    :goto_7
    iput-object v9, v3, LU1/G;->n:Ljava/lang/Object;

    .line 328
    .line 329
    iput-object v4, v3, LU1/G;->k:LU1/E;

    .line 330
    .line 331
    iget v5, v3, LU1/G;->m:I

    .line 332
    .line 333
    add-int/2addr v5, v2

    .line 334
    iput v5, v3, LU1/G;->m:I

    .line 335
    .line 336
    invoke-virtual {v3}, LU1/G;->k()V

    .line 337
    .line 338
    .line 339
    iget-boolean v3, v4, LU1/E;->d:Z

    .line 340
    .line 341
    if-nez v3, :cond_e

    .line 342
    .line 343
    iget-wide v5, v0, LU1/F;->b:J

    .line 344
    .line 345
    iput-boolean v2, v4, LU1/E;->d:Z

    .line 346
    .line 347
    iget-object v3, v4, LU1/E;->a:Ljava/lang/Object;

    .line 348
    .line 349
    invoke-interface {v3, v1, v5, v6}, Lk2/F;->q(Lk2/E;J)V

    .line 350
    .line 351
    .line 352
    goto :goto_8

    .line 353
    :cond_e
    iget-boolean v3, v4, LU1/E;->e:Z

    .line 354
    .line 355
    if-eqz v3, :cond_f

    .line 356
    .line 357
    iget-object v3, v1, LU1/z;->i:LQ1/s;

    .line 358
    .line 359
    iget-object v5, v4, LU1/E;->a:Ljava/lang/Object;

    .line 360
    .line 361
    const/16 v6, 0x8

    .line 362
    .line 363
    invoke-virtual {v3, v6, v5}, LQ1/s;->a(ILjava/lang/Object;)LQ1/r;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    invoke-virtual {v3}, LQ1/r;->b()V

    .line 368
    .line 369
    .line 370
    :cond_f
    :goto_8
    iget-object v3, v1, LU1/z;->s:LU1/G;

    .line 371
    .line 372
    iget-object v3, v3, LU1/G;->i:LU1/E;

    .line 373
    .line 374
    if-ne v3, v4, :cond_10

    .line 375
    .line 376
    iget-wide v3, v0, LU1/F;->b:J

    .line 377
    .line 378
    invoke-virtual {v1, v3, v4}, LU1/z;->I(J)V

    .line 379
    .line 380
    .line 381
    :cond_10
    invoke-virtual {v1, v10}, LU1/z;->m(Z)V

    .line 382
    .line 383
    .line 384
    :goto_9
    iget-boolean v0, v1, LU1/z;->H:Z

    .line 385
    .line 386
    if-eqz v0, :cond_11

    .line 387
    .line 388
    iget-object v0, v1, LU1/z;->s:LU1/G;

    .line 389
    .line 390
    iget-object v0, v0, LU1/G;->k:LU1/E;

    .line 391
    .line 392
    invoke-static {v0}, LU1/z;->r(LU1/E;)Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    iput-boolean v0, v1, LU1/z;->H:Z

    .line 397
    .line 398
    invoke-virtual {v1}, LU1/z;->i0()V

    .line 399
    .line 400
    .line 401
    goto :goto_a

    .line 402
    :cond_11
    invoke-virtual {v1}, LU1/z;->u()V

    .line 403
    .line 404
    .line 405
    :goto_a
    iget-object v0, v1, LU1/z;->s:LU1/G;

    .line 406
    .line 407
    iget-object v3, v0, LU1/G;->j:LU1/E;

    .line 408
    .line 409
    if-nez v3, :cond_12

    .line 410
    .line 411
    goto/16 :goto_12

    .line 412
    .line 413
    :cond_12
    iget-object v4, v3, LU1/E;->m:LU1/E;

    .line 414
    .line 415
    iget-object v14, v1, LU1/z;->a:[LU1/W;

    .line 416
    .line 417
    if-eqz v4, :cond_1e

    .line 418
    .line 419
    iget-boolean v4, v1, LU1/z;->E:Z

    .line 420
    .line 421
    if-eqz v4, :cond_13

    .line 422
    .line 423
    goto/16 :goto_f

    .line 424
    .line 425
    :cond_13
    iget-boolean v4, v3, LU1/E;->e:Z

    .line 426
    .line 427
    if-nez v4, :cond_14

    .line 428
    .line 429
    goto/16 :goto_12

    .line 430
    .line 431
    :cond_14
    move v4, v10

    .line 432
    :goto_b
    array-length v5, v14

    .line 433
    if-ge v4, v5, :cond_16

    .line 434
    .line 435
    aget-object v5, v14, v4

    .line 436
    .line 437
    iget-object v6, v3, LU1/E;->c:[Lk2/d0;

    .line 438
    .line 439
    aget-object v6, v6, v4

    .line 440
    .line 441
    invoke-interface {v5}, LU1/W;->x()Lk2/d0;

    .line 442
    .line 443
    .line 444
    move-result-object v7

    .line 445
    if-ne v7, v6, :cond_22

    .line 446
    .line 447
    if-eqz v6, :cond_15

    .line 448
    .line 449
    invoke-interface {v5}, LU1/W;->i()Z

    .line 450
    .line 451
    .line 452
    move-result v6

    .line 453
    if-nez v6, :cond_15

    .line 454
    .line 455
    iget-object v6, v3, LU1/E;->m:LU1/E;

    .line 456
    .line 457
    iget-object v7, v3, LU1/E;->g:LU1/F;

    .line 458
    .line 459
    iget-boolean v7, v7, LU1/F;->f:Z

    .line 460
    .line 461
    if-eqz v7, :cond_22

    .line 462
    .line 463
    iget-boolean v7, v6, LU1/E;->e:Z

    .line 464
    .line 465
    if-eqz v7, :cond_22

    .line 466
    .line 467
    instance-of v7, v5, Lm2/d;

    .line 468
    .line 469
    if-nez v7, :cond_15

    .line 470
    .line 471
    instance-of v7, v5, Le2/b;

    .line 472
    .line 473
    if-nez v7, :cond_15

    .line 474
    .line 475
    invoke-interface {v5}, LU1/W;->z()J

    .line 476
    .line 477
    .line 478
    move-result-wide v7

    .line 479
    invoke-virtual {v6}, LU1/E;->e()J

    .line 480
    .line 481
    .line 482
    move-result-wide v5

    .line 483
    cmp-long v5, v7, v5

    .line 484
    .line 485
    if-ltz v5, :cond_22

    .line 486
    .line 487
    :cond_15
    add-int/lit8 v4, v4, 0x1

    .line 488
    .line 489
    goto :goto_b

    .line 490
    :cond_16
    iget-object v4, v3, LU1/E;->m:LU1/E;

    .line 491
    .line 492
    iget-boolean v5, v4, LU1/E;->e:Z

    .line 493
    .line 494
    if-nez v5, :cond_17

    .line 495
    .line 496
    iget-wide v5, v1, LU1/z;->P:J

    .line 497
    .line 498
    invoke-virtual {v4}, LU1/E;->e()J

    .line 499
    .line 500
    .line 501
    move-result-wide v7

    .line 502
    cmp-long v4, v5, v7

    .line 503
    .line 504
    if-gez v4, :cond_17

    .line 505
    .line 506
    goto/16 :goto_12

    .line 507
    .line 508
    :cond_17
    iget-object v15, v3, LU1/E;->o:Ln2/t;

    .line 509
    .line 510
    iget-object v4, v0, LU1/G;->j:LU1/E;

    .line 511
    .line 512
    invoke-static {v4}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    iget-object v4, v4, LU1/E;->m:LU1/E;

    .line 516
    .line 517
    iput-object v4, v0, LU1/G;->j:LU1/E;

    .line 518
    .line 519
    invoke-virtual {v0}, LU1/G;->k()V

    .line 520
    .line 521
    .line 522
    iget-object v4, v0, LU1/G;->j:LU1/E;

    .line 523
    .line 524
    invoke-static {v4}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    iget-object v5, v4, LU1/E;->o:Ln2/t;

    .line 528
    .line 529
    iget-object v6, v1, LU1/z;->A:LU1/P;

    .line 530
    .line 531
    iget-object v6, v6, LU1/P;->a:LN1/N;

    .line 532
    .line 533
    iget-object v7, v4, LU1/E;->g:LU1/F;

    .line 534
    .line 535
    iget-object v7, v7, LU1/F;->a:Lk2/H;

    .line 536
    .line 537
    iget-object v3, v3, LU1/E;->g:LU1/F;

    .line 538
    .line 539
    iget-object v3, v3, LU1/F;->a:Lk2/H;

    .line 540
    .line 541
    move v8, v2

    .line 542
    move-object/from16 v18, v5

    .line 543
    .line 544
    move-object v2, v6

    .line 545
    move-object v5, v3

    .line 546
    move-object v3, v7

    .line 547
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    move/from16 v19, v8

    .line 553
    .line 554
    const/4 v8, 0x0

    .line 555
    move-object/from16 v20, v4

    .line 556
    .line 557
    move-object v4, v2

    .line 558
    move-object/from16 v13, v18

    .line 559
    .line 560
    move-object/from16 v9, v20

    .line 561
    .line 562
    invoke-virtual/range {v1 .. v8}, LU1/z;->m0(LN1/N;Lk2/H;LN1/N;Lk2/H;JZ)V

    .line 563
    .line 564
    .line 565
    iget-boolean v2, v9, LU1/E;->e:Z

    .line 566
    .line 567
    if-eqz v2, :cond_1a

    .line 568
    .line 569
    iget-object v2, v9, LU1/E;->a:Ljava/lang/Object;

    .line 570
    .line 571
    invoke-interface {v2}, Lk2/F;->f()J

    .line 572
    .line 573
    .line 574
    move-result-wide v2

    .line 575
    cmp-long v2, v2, v16

    .line 576
    .line 577
    if-eqz v2, :cond_1a

    .line 578
    .line 579
    invoke-virtual {v9}, LU1/E;->e()J

    .line 580
    .line 581
    .line 582
    move-result-wide v2

    .line 583
    array-length v4, v14

    .line 584
    move v5, v10

    .line 585
    :goto_c
    if-ge v5, v4, :cond_19

    .line 586
    .line 587
    aget-object v6, v14, v5

    .line 588
    .line 589
    invoke-interface {v6}, LU1/W;->x()Lk2/d0;

    .line 590
    .line 591
    .line 592
    move-result-object v7

    .line 593
    if-eqz v7, :cond_18

    .line 594
    .line 595
    invoke-static {v6, v2, v3}, LU1/z;->S(LU1/W;J)V

    .line 596
    .line 597
    .line 598
    :cond_18
    add-int/lit8 v5, v5, 0x1

    .line 599
    .line 600
    goto :goto_c

    .line 601
    :cond_19
    invoke-virtual {v9}, LU1/E;->g()Z

    .line 602
    .line 603
    .line 604
    move-result v2

    .line 605
    if-nez v2, :cond_22

    .line 606
    .line 607
    invoke-virtual {v0, v9}, LU1/G;->l(LU1/E;)Z

    .line 608
    .line 609
    .line 610
    invoke-virtual {v1, v10}, LU1/z;->m(Z)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v1}, LU1/z;->u()V

    .line 614
    .line 615
    .line 616
    goto/16 :goto_12

    .line 617
    .line 618
    :cond_1a
    move v0, v10

    .line 619
    :goto_d
    array-length v2, v14

    .line 620
    if-ge v0, v2, :cond_22

    .line 621
    .line 622
    invoke-virtual {v15, v0}, Ln2/t;->b(I)Z

    .line 623
    .line 624
    .line 625
    move-result v2

    .line 626
    invoke-virtual {v13, v0}, Ln2/t;->b(I)Z

    .line 627
    .line 628
    .line 629
    move-result v3

    .line 630
    if-eqz v2, :cond_1d

    .line 631
    .line 632
    aget-object v2, v14, v0

    .line 633
    .line 634
    invoke-interface {v2}, LU1/W;->r()Z

    .line 635
    .line 636
    .line 637
    move-result v2

    .line 638
    if-nez v2, :cond_1d

    .line 639
    .line 640
    iget-object v2, v1, LU1/z;->c:[LU1/X;

    .line 641
    .line 642
    aget-object v2, v2, v0

    .line 643
    .line 644
    invoke-interface {v2}, LU1/X;->f()I

    .line 645
    .line 646
    .line 647
    move-result v2

    .line 648
    const/4 v4, -0x2

    .line 649
    if-ne v2, v4, :cond_1b

    .line 650
    .line 651
    const/4 v2, 0x1

    .line 652
    goto :goto_e

    .line 653
    :cond_1b
    move v2, v10

    .line 654
    :goto_e
    iget-object v4, v15, Ln2/t;->b:[LU1/Y;

    .line 655
    .line 656
    aget-object v4, v4, v0

    .line 657
    .line 658
    iget-object v5, v13, Ln2/t;->b:[LU1/Y;

    .line 659
    .line 660
    aget-object v5, v5, v0

    .line 661
    .line 662
    if-eqz v3, :cond_1c

    .line 663
    .line 664
    invoke-virtual {v5, v4}, LU1/Y;->equals(Ljava/lang/Object;)Z

    .line 665
    .line 666
    .line 667
    move-result v3

    .line 668
    if-eqz v3, :cond_1c

    .line 669
    .line 670
    if-eqz v2, :cond_1d

    .line 671
    .line 672
    :cond_1c
    aget-object v2, v14, v0

    .line 673
    .line 674
    invoke-virtual {v9}, LU1/E;->e()J

    .line 675
    .line 676
    .line 677
    move-result-wide v3

    .line 678
    invoke-static {v2, v3, v4}, LU1/z;->S(LU1/W;J)V

    .line 679
    .line 680
    .line 681
    :cond_1d
    add-int/lit8 v0, v0, 0x1

    .line 682
    .line 683
    goto :goto_d

    .line 684
    :cond_1e
    :goto_f
    iget-object v0, v3, LU1/E;->g:LU1/F;

    .line 685
    .line 686
    iget-boolean v0, v0, LU1/F;->i:Z

    .line 687
    .line 688
    if-nez v0, :cond_1f

    .line 689
    .line 690
    iget-boolean v0, v1, LU1/z;->E:Z

    .line 691
    .line 692
    if-eqz v0, :cond_22

    .line 693
    .line 694
    :cond_1f
    move v0, v10

    .line 695
    :goto_10
    array-length v2, v14

    .line 696
    if-ge v0, v2, :cond_22

    .line 697
    .line 698
    aget-object v2, v14, v0

    .line 699
    .line 700
    iget-object v4, v3, LU1/E;->c:[Lk2/d0;

    .line 701
    .line 702
    aget-object v4, v4, v0

    .line 703
    .line 704
    if-eqz v4, :cond_21

    .line 705
    .line 706
    invoke-interface {v2}, LU1/W;->x()Lk2/d0;

    .line 707
    .line 708
    .line 709
    move-result-object v5

    .line 710
    if-ne v5, v4, :cond_21

    .line 711
    .line 712
    invoke-interface {v2}, LU1/W;->i()Z

    .line 713
    .line 714
    .line 715
    move-result v4

    .line 716
    if-eqz v4, :cond_21

    .line 717
    .line 718
    iget-object v4, v3, LU1/E;->g:LU1/F;

    .line 719
    .line 720
    iget-wide v4, v4, LU1/F;->e:J

    .line 721
    .line 722
    cmp-long v6, v4, v16

    .line 723
    .line 724
    if-eqz v6, :cond_20

    .line 725
    .line 726
    const-wide/high16 v6, -0x8000000000000000L

    .line 727
    .line 728
    cmp-long v6, v4, v6

    .line 729
    .line 730
    if-eqz v6, :cond_20

    .line 731
    .line 732
    iget-wide v6, v3, LU1/E;->p:J

    .line 733
    .line 734
    add-long/2addr v4, v6

    .line 735
    goto :goto_11

    .line 736
    :cond_20
    move-wide/from16 v4, v16

    .line 737
    .line 738
    :goto_11
    invoke-static {v2, v4, v5}, LU1/z;->S(LU1/W;J)V

    .line 739
    .line 740
    .line 741
    :cond_21
    add-int/lit8 v0, v0, 0x1

    .line 742
    .line 743
    goto :goto_10

    .line 744
    :cond_22
    :goto_12
    iget-object v0, v1, LU1/z;->s:LU1/G;

    .line 745
    .line 746
    iget-object v2, v0, LU1/G;->j:LU1/E;

    .line 747
    .line 748
    if-eqz v2, :cond_2e

    .line 749
    .line 750
    iget-object v0, v0, LU1/G;->i:LU1/E;

    .line 751
    .line 752
    if-eq v0, v2, :cond_2e

    .line 753
    .line 754
    iget-boolean v0, v2, LU1/E;->h:Z

    .line 755
    .line 756
    if-eqz v0, :cond_23

    .line 757
    .line 758
    goto/16 :goto_18

    .line 759
    .line 760
    :cond_23
    iget-object v0, v2, LU1/E;->o:Ln2/t;

    .line 761
    .line 762
    move v3, v10

    .line 763
    move v4, v3

    .line 764
    :goto_13
    iget-object v5, v1, LU1/z;->a:[LU1/W;

    .line 765
    .line 766
    array-length v6, v5

    .line 767
    if-ge v4, v6, :cond_2d

    .line 768
    .line 769
    aget-object v20, v5, v4

    .line 770
    .line 771
    invoke-static/range {v20 .. v20}, LU1/z;->s(LU1/W;)Z

    .line 772
    .line 773
    .line 774
    move-result v5

    .line 775
    if-nez v5, :cond_24

    .line 776
    .line 777
    goto/16 :goto_17

    .line 778
    .line 779
    :cond_24
    invoke-interface/range {v20 .. v20}, LU1/W;->x()Lk2/d0;

    .line 780
    .line 781
    .line 782
    move-result-object v5

    .line 783
    iget-object v6, v2, LU1/E;->c:[Lk2/d0;

    .line 784
    .line 785
    aget-object v7, v6, v4

    .line 786
    .line 787
    if-eq v5, v7, :cond_25

    .line 788
    .line 789
    const/4 v5, 0x1

    .line 790
    goto :goto_14

    .line 791
    :cond_25
    move v5, v10

    .line 792
    :goto_14
    invoke-virtual {v0, v4}, Ln2/t;->b(I)Z

    .line 793
    .line 794
    .line 795
    move-result v7

    .line 796
    if-eqz v7, :cond_26

    .line 797
    .line 798
    if-nez v5, :cond_26

    .line 799
    .line 800
    goto :goto_17

    .line 801
    :cond_26
    invoke-interface/range {v20 .. v20}, LU1/W;->r()Z

    .line 802
    .line 803
    .line 804
    move-result v5

    .line 805
    if-nez v5, :cond_2a

    .line 806
    .line 807
    iget-object v5, v0, Ln2/t;->c:[Ln2/q;

    .line 808
    .line 809
    aget-object v5, v5, v4

    .line 810
    .line 811
    if-eqz v5, :cond_27

    .line 812
    .line 813
    invoke-interface {v5}, Ln2/q;->length()I

    .line 814
    .line 815
    .line 816
    move-result v7

    .line 817
    goto :goto_15

    .line 818
    :cond_27
    move v7, v10

    .line 819
    :goto_15
    new-array v8, v7, [LN1/n;

    .line 820
    .line 821
    move v9, v10

    .line 822
    :goto_16
    if-ge v9, v7, :cond_28

    .line 823
    .line 824
    invoke-interface {v5, v9}, Ln2/q;->b(I)LN1/n;

    .line 825
    .line 826
    .line 827
    move-result-object v13

    .line 828
    aput-object v13, v8, v9

    .line 829
    .line 830
    add-int/lit8 v9, v9, 0x1

    .line 831
    .line 832
    goto :goto_16

    .line 833
    :cond_28
    aget-object v22, v6, v4

    .line 834
    .line 835
    invoke-virtual {v2}, LU1/E;->e()J

    .line 836
    .line 837
    .line 838
    move-result-wide v23

    .line 839
    iget-wide v5, v2, LU1/E;->p:J

    .line 840
    .line 841
    iget-object v7, v2, LU1/E;->g:LU1/F;

    .line 842
    .line 843
    iget-object v7, v7, LU1/F;->a:Lk2/H;

    .line 844
    .line 845
    move-wide/from16 v25, v5

    .line 846
    .line 847
    move-object/from16 v27, v7

    .line 848
    .line 849
    move-object/from16 v21, v8

    .line 850
    .line 851
    invoke-interface/range {v20 .. v27}, LU1/W;->o([LN1/n;Lk2/d0;JJLk2/H;)V

    .line 852
    .line 853
    .line 854
    iget-boolean v5, v1, LU1/z;->M:Z

    .line 855
    .line 856
    if-eqz v5, :cond_2c

    .line 857
    .line 858
    if-nez v5, :cond_29

    .line 859
    .line 860
    goto :goto_17

    .line 861
    :cond_29
    iput-boolean v10, v1, LU1/z;->M:Z

    .line 862
    .line 863
    iget-object v5, v1, LU1/z;->A:LU1/P;

    .line 864
    .line 865
    iget-boolean v5, v5, LU1/P;->p:Z

    .line 866
    .line 867
    if-eqz v5, :cond_2c

    .line 868
    .line 869
    iget-object v5, v1, LU1/z;->i:LQ1/s;

    .line 870
    .line 871
    const/4 v6, 0x2

    .line 872
    invoke-virtual {v5, v6}, LQ1/s;->e(I)Z

    .line 873
    .line 874
    .line 875
    goto :goto_17

    .line 876
    :cond_2a
    invoke-interface/range {v20 .. v20}, LU1/W;->b()Z

    .line 877
    .line 878
    .line 879
    move-result v5

    .line 880
    if-eqz v5, :cond_2b

    .line 881
    .line 882
    invoke-virtual {v1, v4}, LU1/z;->c(I)V

    .line 883
    .line 884
    .line 885
    goto :goto_17

    .line 886
    :cond_2b
    const/4 v3, 0x1

    .line 887
    :cond_2c
    :goto_17
    add-int/lit8 v4, v4, 0x1

    .line 888
    .line 889
    goto :goto_13

    .line 890
    :cond_2d
    if-nez v3, :cond_2e

    .line 891
    .line 892
    array-length v0, v5

    .line 893
    new-array v0, v0, [Z

    .line 894
    .line 895
    iget-object v2, v1, LU1/z;->s:LU1/G;

    .line 896
    .line 897
    iget-object v2, v2, LU1/G;->j:LU1/E;

    .line 898
    .line 899
    invoke-virtual {v2}, LU1/E;->e()J

    .line 900
    .line 901
    .line 902
    move-result-wide v2

    .line 903
    invoke-virtual {v1, v0, v2, v3}, LU1/z;->e([ZJ)V

    .line 904
    .line 905
    .line 906
    :cond_2e
    :goto_18
    move v2, v10

    .line 907
    :goto_19
    invoke-virtual {v1}, LU1/z;->d0()Z

    .line 908
    .line 909
    .line 910
    move-result v0

    .line 911
    if-nez v0, :cond_30

    .line 912
    .line 913
    :cond_2f
    :goto_1a
    move v14, v10

    .line 914
    const/4 v3, 0x3

    .line 915
    const/4 v13, 0x1

    .line 916
    const/4 v15, 0x0

    .line 917
    goto/16 :goto_1d

    .line 918
    .line 919
    :cond_30
    iget-boolean v0, v1, LU1/z;->E:Z

    .line 920
    .line 921
    if-eqz v0, :cond_31

    .line 922
    .line 923
    goto :goto_1a

    .line 924
    :cond_31
    iget-object v0, v1, LU1/z;->s:LU1/G;

    .line 925
    .line 926
    iget-object v3, v0, LU1/G;->i:LU1/E;

    .line 927
    .line 928
    if-nez v3, :cond_32

    .line 929
    .line 930
    goto :goto_1a

    .line 931
    :cond_32
    iget-object v3, v3, LU1/E;->m:LU1/E;

    .line 932
    .line 933
    if-eqz v3, :cond_2f

    .line 934
    .line 935
    iget-wide v4, v1, LU1/z;->P:J

    .line 936
    .line 937
    invoke-virtual {v3}, LU1/E;->e()J

    .line 938
    .line 939
    .line 940
    move-result-wide v6

    .line 941
    cmp-long v4, v4, v6

    .line 942
    .line 943
    if-ltz v4, :cond_2f

    .line 944
    .line 945
    iget-boolean v3, v3, LU1/E;->h:Z

    .line 946
    .line 947
    if-eqz v3, :cond_2f

    .line 948
    .line 949
    if-eqz v2, :cond_33

    .line 950
    .line 951
    invoke-virtual {v1}, LU1/z;->w()V

    .line 952
    .line 953
    .line 954
    :cond_33
    invoke-virtual {v0}, LU1/G;->a()LU1/E;

    .line 955
    .line 956
    .line 957
    move-result-object v2

    .line 958
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 959
    .line 960
    .line 961
    iget-object v3, v1, LU1/z;->A:LU1/P;

    .line 962
    .line 963
    iget-object v3, v3, LU1/P;->b:Lk2/H;

    .line 964
    .line 965
    iget-object v3, v3, Lk2/H;->a:Ljava/lang/Object;

    .line 966
    .line 967
    iget-object v4, v2, LU1/E;->g:LU1/F;

    .line 968
    .line 969
    iget-object v4, v4, LU1/F;->a:Lk2/H;

    .line 970
    .line 971
    iget-object v4, v4, Lk2/H;->a:Ljava/lang/Object;

    .line 972
    .line 973
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 974
    .line 975
    .line 976
    move-result v3

    .line 977
    if-eqz v3, :cond_34

    .line 978
    .line 979
    iget-object v3, v1, LU1/z;->A:LU1/P;

    .line 980
    .line 981
    iget-object v3, v3, LU1/P;->b:Lk2/H;

    .line 982
    .line 983
    iget v4, v3, Lk2/H;->b:I

    .line 984
    .line 985
    const/4 v5, -0x1

    .line 986
    if-ne v4, v5, :cond_34

    .line 987
    .line 988
    iget-object v4, v2, LU1/E;->g:LU1/F;

    .line 989
    .line 990
    iget-object v4, v4, LU1/F;->a:Lk2/H;

    .line 991
    .line 992
    iget v6, v4, Lk2/H;->b:I

    .line 993
    .line 994
    if-ne v6, v5, :cond_34

    .line 995
    .line 996
    iget v3, v3, Lk2/H;->e:I

    .line 997
    .line 998
    iget v4, v4, Lk2/H;->e:I

    .line 999
    .line 1000
    if-eq v3, v4, :cond_34

    .line 1001
    .line 1002
    const/4 v3, 0x1

    .line 1003
    goto :goto_1b

    .line 1004
    :cond_34
    move v3, v10

    .line 1005
    :goto_1b
    iget-object v2, v2, LU1/E;->g:LU1/F;

    .line 1006
    .line 1007
    iget-object v4, v2, LU1/F;->a:Lk2/H;

    .line 1008
    .line 1009
    move v5, v3

    .line 1010
    move-object v6, v4

    .line 1011
    iget-wide v3, v2, LU1/F;->b:J

    .line 1012
    .line 1013
    iget-wide v7, v2, LU1/F;->c:J

    .line 1014
    .line 1015
    const/4 v13, 0x1

    .line 1016
    xor-int/lit8 v9, v5, 0x1

    .line 1017
    .line 1018
    move v2, v10

    .line 1019
    const/4 v10, 0x0

    .line 1020
    move v14, v2

    .line 1021
    move-object v2, v6

    .line 1022
    move-wide v5, v7

    .line 1023
    move-wide v7, v3

    .line 1024
    const/4 v15, 0x0

    .line 1025
    invoke-virtual/range {v1 .. v10}, LU1/z;->q(Lk2/H;JJJZI)LU1/P;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v2

    .line 1029
    iput-object v2, v1, LU1/z;->A:LU1/P;

    .line 1030
    .line 1031
    invoke-virtual {v1}, LU1/z;->H()V

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual {v1}, LU1/z;->l0()V

    .line 1035
    .line 1036
    .line 1037
    iget-object v2, v1, LU1/z;->A:LU1/P;

    .line 1038
    .line 1039
    iget v2, v2, LU1/P;->e:I

    .line 1040
    .line 1041
    const/4 v3, 0x3

    .line 1042
    if-ne v2, v3, :cond_35

    .line 1043
    .line 1044
    invoke-virtual {v1}, LU1/z;->f0()V

    .line 1045
    .line 1046
    .line 1047
    :cond_35
    iget-object v0, v0, LU1/G;->i:LU1/E;

    .line 1048
    .line 1049
    iget-object v0, v0, LU1/E;->o:Ln2/t;

    .line 1050
    .line 1051
    move v10, v14

    .line 1052
    :goto_1c
    iget-object v2, v1, LU1/z;->a:[LU1/W;

    .line 1053
    .line 1054
    array-length v4, v2

    .line 1055
    if-ge v10, v4, :cond_37

    .line 1056
    .line 1057
    invoke-virtual {v0, v10}, Ln2/t;->b(I)Z

    .line 1058
    .line 1059
    .line 1060
    move-result v4

    .line 1061
    if-eqz v4, :cond_36

    .line 1062
    .line 1063
    aget-object v2, v2, v10

    .line 1064
    .line 1065
    invoke-interface {v2}, LU1/W;->j()V

    .line 1066
    .line 1067
    .line 1068
    :cond_36
    add-int/lit8 v10, v10, 0x1

    .line 1069
    .line 1070
    goto :goto_1c

    .line 1071
    :cond_37
    move v2, v13

    .line 1072
    move v10, v14

    .line 1073
    goto/16 :goto_19

    .line 1074
    .line 1075
    :goto_1d
    iget-object v0, v1, LU1/z;->V:LU1/l;

    .line 1076
    .line 1077
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1078
    .line 1079
    .line 1080
    :goto_1e
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 1081
    .line 1082
    iget v0, v0, LU1/P;->e:I

    .line 1083
    .line 1084
    if-eq v0, v13, :cond_69

    .line 1085
    .line 1086
    const/4 v2, 0x4

    .line 1087
    if-ne v0, v2, :cond_38

    .line 1088
    .line 1089
    goto/16 :goto_3a

    .line 1090
    .line 1091
    :cond_38
    iget-object v0, v1, LU1/z;->s:LU1/G;

    .line 1092
    .line 1093
    iget-object v0, v0, LU1/G;->i:LU1/E;

    .line 1094
    .line 1095
    if-nez v0, :cond_39

    .line 1096
    .line 1097
    invoke-virtual {v1, v11, v12}, LU1/z;->M(J)V

    .line 1098
    .line 1099
    .line 1100
    return-void

    .line 1101
    :cond_39
    const-string v4, "doSomeWork"

    .line 1102
    .line 1103
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v1}, LU1/z;->l0()V

    .line 1107
    .line 1108
    .line 1109
    iget-boolean v4, v0, LU1/E;->e:Z

    .line 1110
    .line 1111
    if-eqz v4, :cond_43

    .line 1112
    .line 1113
    iget-object v4, v1, LU1/z;->q:LQ1/q;

    .line 1114
    .line 1115
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1116
    .line 1117
    .line 1118
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1119
    .line 1120
    .line 1121
    move-result-wide v4

    .line 1122
    invoke-static {v4, v5}, LQ1/x;->K(J)J

    .line 1123
    .line 1124
    .line 1125
    move-result-wide v4

    .line 1126
    iput-wide v4, v1, LU1/z;->Q:J

    .line 1127
    .line 1128
    iget-object v4, v0, LU1/E;->a:Ljava/lang/Object;

    .line 1129
    .line 1130
    iget-object v5, v1, LU1/z;->A:LU1/P;

    .line 1131
    .line 1132
    iget-wide v5, v5, LU1/P;->s:J

    .line 1133
    .line 1134
    iget-wide v7, v1, LU1/z;->n:J

    .line 1135
    .line 1136
    sub-long/2addr v5, v7

    .line 1137
    invoke-interface {v4, v5, v6}, Lk2/F;->i(J)V

    .line 1138
    .line 1139
    .line 1140
    move v4, v13

    .line 1141
    move v5, v4

    .line 1142
    move v10, v14

    .line 1143
    :goto_1f
    iget-object v6, v1, LU1/z;->a:[LU1/W;

    .line 1144
    .line 1145
    array-length v7, v6

    .line 1146
    if-ge v10, v7, :cond_42

    .line 1147
    .line 1148
    aget-object v6, v6, v10

    .line 1149
    .line 1150
    invoke-static {v6}, LU1/z;->s(LU1/W;)Z

    .line 1151
    .line 1152
    .line 1153
    move-result v7

    .line 1154
    if-nez v7, :cond_3a

    .line 1155
    .line 1156
    invoke-virtual {v1, v10, v14}, LU1/z;->y(IZ)V

    .line 1157
    .line 1158
    .line 1159
    goto/16 :goto_26

    .line 1160
    .line 1161
    :cond_3a
    iget-wide v7, v1, LU1/z;->P:J

    .line 1162
    .line 1163
    move v9, v4

    .line 1164
    iget-wide v3, v1, LU1/z;->Q:J

    .line 1165
    .line 1166
    invoke-interface {v6, v7, v8, v3, v4}, LU1/W;->v(JJ)V

    .line 1167
    .line 1168
    .line 1169
    if-eqz v9, :cond_3b

    .line 1170
    .line 1171
    invoke-interface {v6}, LU1/W;->b()Z

    .line 1172
    .line 1173
    .line 1174
    move-result v3

    .line 1175
    if-eqz v3, :cond_3b

    .line 1176
    .line 1177
    move v3, v13

    .line 1178
    goto :goto_20

    .line 1179
    :cond_3b
    move v3, v14

    .line 1180
    :goto_20
    iget-object v4, v0, LU1/E;->c:[Lk2/d0;

    .line 1181
    .line 1182
    aget-object v4, v4, v10

    .line 1183
    .line 1184
    invoke-interface {v6}, LU1/W;->x()Lk2/d0;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v7

    .line 1188
    if-eq v4, v7, :cond_3c

    .line 1189
    .line 1190
    move v4, v13

    .line 1191
    goto :goto_21

    .line 1192
    :cond_3c
    move v4, v14

    .line 1193
    :goto_21
    if-nez v4, :cond_3d

    .line 1194
    .line 1195
    invoke-interface {v6}, LU1/W;->i()Z

    .line 1196
    .line 1197
    .line 1198
    move-result v7

    .line 1199
    if-eqz v7, :cond_3d

    .line 1200
    .line 1201
    move v7, v13

    .line 1202
    goto :goto_22

    .line 1203
    :cond_3d
    move v7, v14

    .line 1204
    :goto_22
    if-nez v4, :cond_3f

    .line 1205
    .line 1206
    if-nez v7, :cond_3f

    .line 1207
    .line 1208
    invoke-interface {v6}, LU1/W;->isReady()Z

    .line 1209
    .line 1210
    .line 1211
    move-result v4

    .line 1212
    if-nez v4, :cond_3f

    .line 1213
    .line 1214
    invoke-interface {v6}, LU1/W;->b()Z

    .line 1215
    .line 1216
    .line 1217
    move-result v4

    .line 1218
    if-eqz v4, :cond_3e

    .line 1219
    .line 1220
    goto :goto_23

    .line 1221
    :cond_3e
    move v4, v14

    .line 1222
    goto :goto_24

    .line 1223
    :cond_3f
    :goto_23
    move v4, v13

    .line 1224
    :goto_24
    invoke-virtual {v1, v10, v4}, LU1/z;->y(IZ)V

    .line 1225
    .line 1226
    .line 1227
    if-eqz v5, :cond_40

    .line 1228
    .line 1229
    if-eqz v4, :cond_40

    .line 1230
    .line 1231
    move v5, v13

    .line 1232
    goto :goto_25

    .line 1233
    :cond_40
    move v5, v14

    .line 1234
    :goto_25
    if-nez v4, :cond_41

    .line 1235
    .line 1236
    invoke-virtual {v1, v10}, LU1/z;->x(I)V

    .line 1237
    .line 1238
    .line 1239
    :cond_41
    move v4, v3

    .line 1240
    :goto_26
    add-int/lit8 v10, v10, 0x1

    .line 1241
    .line 1242
    const/4 v3, 0x3

    .line 1243
    goto :goto_1f

    .line 1244
    :cond_42
    move v9, v4

    .line 1245
    goto :goto_27

    .line 1246
    :cond_43
    iget-object v3, v0, LU1/E;->a:Ljava/lang/Object;

    .line 1247
    .line 1248
    invoke-interface {v3}, Lk2/F;->h()V

    .line 1249
    .line 1250
    .line 1251
    move v5, v13

    .line 1252
    move v9, v5

    .line 1253
    :goto_27
    iget-object v3, v0, LU1/E;->g:LU1/F;

    .line 1254
    .line 1255
    iget-wide v3, v3, LU1/F;->e:J

    .line 1256
    .line 1257
    if-eqz v9, :cond_45

    .line 1258
    .line 1259
    iget-boolean v6, v0, LU1/E;->e:Z

    .line 1260
    .line 1261
    if-eqz v6, :cond_45

    .line 1262
    .line 1263
    cmp-long v6, v3, v16

    .line 1264
    .line 1265
    if-eqz v6, :cond_44

    .line 1266
    .line 1267
    iget-object v6, v1, LU1/z;->A:LU1/P;

    .line 1268
    .line 1269
    iget-wide v6, v6, LU1/P;->s:J

    .line 1270
    .line 1271
    cmp-long v3, v3, v6

    .line 1272
    .line 1273
    if-gtz v3, :cond_45

    .line 1274
    .line 1275
    :cond_44
    move v10, v13

    .line 1276
    goto :goto_28

    .line 1277
    :cond_45
    move v10, v14

    .line 1278
    :goto_28
    if-eqz v10, :cond_46

    .line 1279
    .line 1280
    iget-boolean v3, v1, LU1/z;->E:Z

    .line 1281
    .line 1282
    if-eqz v3, :cond_46

    .line 1283
    .line 1284
    iput-boolean v14, v1, LU1/z;->E:Z

    .line 1285
    .line 1286
    iget-object v3, v1, LU1/z;->A:LU1/P;

    .line 1287
    .line 1288
    iget v3, v3, LU1/P;->n:I

    .line 1289
    .line 1290
    const/4 v4, 0x5

    .line 1291
    invoke-virtual {v1, v3, v4, v14, v14}, LU1/z;->W(IIZZ)V

    .line 1292
    .line 1293
    .line 1294
    :cond_46
    if-eqz v10, :cond_47

    .line 1295
    .line 1296
    iget-object v3, v0, LU1/E;->g:LU1/F;

    .line 1297
    .line 1298
    iget-boolean v3, v3, LU1/F;->i:Z

    .line 1299
    .line 1300
    if-eqz v3, :cond_47

    .line 1301
    .line 1302
    invoke-virtual {v1, v2}, LU1/z;->c0(I)V

    .line 1303
    .line 1304
    .line 1305
    invoke-virtual {v1}, LU1/z;->h0()V

    .line 1306
    .line 1307
    .line 1308
    goto/16 :goto_32

    .line 1309
    .line 1310
    :cond_47
    iget-object v3, v1, LU1/z;->A:LU1/P;

    .line 1311
    .line 1312
    iget v4, v3, LU1/P;->e:I

    .line 1313
    .line 1314
    const/4 v6, 0x2

    .line 1315
    if-ne v4, v6, :cond_53

    .line 1316
    .line 1317
    iget v4, v1, LU1/z;->N:I

    .line 1318
    .line 1319
    if-nez v4, :cond_48

    .line 1320
    .line 1321
    invoke-virtual {v1}, LU1/z;->t()Z

    .line 1322
    .line 1323
    .line 1324
    move-result v10

    .line 1325
    goto/16 :goto_2e

    .line 1326
    .line 1327
    :cond_48
    if-nez v5, :cond_4a

    .line 1328
    .line 1329
    :cond_49
    move v10, v14

    .line 1330
    goto/16 :goto_2e

    .line 1331
    .line 1332
    :cond_4a
    iget-boolean v4, v3, LU1/P;->g:Z

    .line 1333
    .line 1334
    if-nez v4, :cond_4c

    .line 1335
    .line 1336
    :cond_4b
    :goto_29
    move v10, v13

    .line 1337
    goto/16 :goto_2e

    .line 1338
    .line 1339
    :cond_4c
    iget-object v4, v1, LU1/z;->s:LU1/G;

    .line 1340
    .line 1341
    iget-object v6, v4, LU1/G;->i:LU1/E;

    .line 1342
    .line 1343
    iget-object v3, v3, LU1/P;->a:LN1/N;

    .line 1344
    .line 1345
    iget-object v6, v6, LU1/E;->g:LU1/F;

    .line 1346
    .line 1347
    iget-object v6, v6, LU1/F;->a:Lk2/H;

    .line 1348
    .line 1349
    invoke-virtual {v1, v3, v6}, LU1/z;->e0(LN1/N;Lk2/H;)Z

    .line 1350
    .line 1351
    .line 1352
    move-result v3

    .line 1353
    if-eqz v3, :cond_4d

    .line 1354
    .line 1355
    iget-object v3, v1, LU1/z;->u:LU1/f;

    .line 1356
    .line 1357
    iget-wide v6, v3, LU1/f;->m:J

    .line 1358
    .line 1359
    goto :goto_2a

    .line 1360
    :cond_4d
    move-wide/from16 v6, v16

    .line 1361
    .line 1362
    :goto_2a
    iget-object v3, v4, LU1/G;->k:LU1/E;

    .line 1363
    .line 1364
    invoke-virtual {v3}, LU1/E;->g()Z

    .line 1365
    .line 1366
    .line 1367
    move-result v4

    .line 1368
    if-eqz v4, :cond_4e

    .line 1369
    .line 1370
    iget-object v4, v3, LU1/E;->g:LU1/F;

    .line 1371
    .line 1372
    iget-boolean v4, v4, LU1/F;->i:Z

    .line 1373
    .line 1374
    if-eqz v4, :cond_4e

    .line 1375
    .line 1376
    move v10, v13

    .line 1377
    goto :goto_2b

    .line 1378
    :cond_4e
    move v10, v14

    .line 1379
    :goto_2b
    iget-object v4, v3, LU1/E;->g:LU1/F;

    .line 1380
    .line 1381
    iget-object v4, v4, LU1/F;->a:Lk2/H;

    .line 1382
    .line 1383
    invoke-virtual {v4}, Lk2/H;->b()Z

    .line 1384
    .line 1385
    .line 1386
    move-result v4

    .line 1387
    if-eqz v4, :cond_4f

    .line 1388
    .line 1389
    iget-boolean v4, v3, LU1/E;->e:Z

    .line 1390
    .line 1391
    if-nez v4, :cond_4f

    .line 1392
    .line 1393
    move v4, v13

    .line 1394
    goto :goto_2c

    .line 1395
    :cond_4f
    move v4, v14

    .line 1396
    :goto_2c
    if-nez v10, :cond_4b

    .line 1397
    .line 1398
    if-eqz v4, :cond_50

    .line 1399
    .line 1400
    goto :goto_29

    .line 1401
    :cond_50
    invoke-virtual {v3}, LU1/E;->d()J

    .line 1402
    .line 1403
    .line 1404
    move-result-wide v3

    .line 1405
    invoke-virtual {v1, v3, v4}, LU1/z;->i(J)J

    .line 1406
    .line 1407
    .line 1408
    move-result-wide v3

    .line 1409
    iget-object v8, v1, LU1/z;->A:LU1/P;

    .line 1410
    .line 1411
    iget-object v8, v8, LU1/P;->a:LN1/N;

    .line 1412
    .line 1413
    iget-object v8, v1, LU1/z;->o:LE5/l;

    .line 1414
    .line 1415
    invoke-virtual {v8}, LE5/l;->e()LN1/F;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v8

    .line 1419
    iget v8, v8, LN1/F;->a:F

    .line 1420
    .line 1421
    iget-object v9, v1, LU1/z;->A:LU1/P;

    .line 1422
    .line 1423
    iget-boolean v9, v9, LU1/P;->l:Z

    .line 1424
    .line 1425
    iget-boolean v9, v1, LU1/z;->F:Z

    .line 1426
    .line 1427
    iget-object v10, v1, LU1/z;->g:LU1/h;

    .line 1428
    .line 1429
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1430
    .line 1431
    .line 1432
    invoke-static {v3, v4, v8}, LQ1/x;->A(JF)J

    .line 1433
    .line 1434
    .line 1435
    move-result-wide v3

    .line 1436
    if-eqz v9, :cond_51

    .line 1437
    .line 1438
    iget-wide v8, v10, LU1/h;->e:J

    .line 1439
    .line 1440
    goto :goto_2d

    .line 1441
    :cond_51
    iget-wide v8, v10, LU1/h;->d:J

    .line 1442
    .line 1443
    :goto_2d
    cmp-long v18, v6, v16

    .line 1444
    .line 1445
    if-eqz v18, :cond_52

    .line 1446
    .line 1447
    const-wide/16 v20, 0x2

    .line 1448
    .line 1449
    div-long v6, v6, v20

    .line 1450
    .line 1451
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 1452
    .line 1453
    .line 1454
    move-result-wide v8

    .line 1455
    :cond_52
    const-wide/16 v6, 0x0

    .line 1456
    .line 1457
    cmp-long v6, v8, v6

    .line 1458
    .line 1459
    if-lez v6, :cond_4b

    .line 1460
    .line 1461
    cmp-long v3, v3, v8

    .line 1462
    .line 1463
    if-gez v3, :cond_4b

    .line 1464
    .line 1465
    iget-boolean v3, v10, LU1/h;->g:Z

    .line 1466
    .line 1467
    if-nez v3, :cond_49

    .line 1468
    .line 1469
    iget-object v3, v10, LU1/h;->a:Lo2/e;

    .line 1470
    .line 1471
    monitor-enter v3

    .line 1472
    :try_start_0
    iget v4, v3, Lo2/e;->e:I

    .line 1473
    .line 1474
    iget v6, v3, Lo2/e;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1475
    .line 1476
    mul-int/2addr v4, v6

    .line 1477
    monitor-exit v3

    .line 1478
    invoke-virtual {v10}, LU1/h;->b()I

    .line 1479
    .line 1480
    .line 1481
    move-result v3

    .line 1482
    if-lt v4, v3, :cond_49

    .line 1483
    .line 1484
    goto/16 :goto_29

    .line 1485
    .line 1486
    :catchall_0
    move-exception v0

    .line 1487
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1488
    throw v0

    .line 1489
    :goto_2e
    if-eqz v10, :cond_53

    .line 1490
    .line 1491
    const/4 v3, 0x3

    .line 1492
    invoke-virtual {v1, v3}, LU1/z;->c0(I)V

    .line 1493
    .line 1494
    .line 1495
    iput-object v15, v1, LU1/z;->T:LU1/j;

    .line 1496
    .line 1497
    invoke-virtual {v1}, LU1/z;->d0()Z

    .line 1498
    .line 1499
    .line 1500
    move-result v3

    .line 1501
    if-eqz v3, :cond_5c

    .line 1502
    .line 1503
    invoke-virtual {v1, v14, v14}, LU1/z;->n0(ZZ)V

    .line 1504
    .line 1505
    .line 1506
    iget-object v3, v1, LU1/z;->o:LE5/l;

    .line 1507
    .line 1508
    iput-boolean v13, v3, LE5/l;->c:Z

    .line 1509
    .line 1510
    iget-object v3, v3, LE5/l;->d:Ljava/lang/Object;

    .line 1511
    .line 1512
    check-cast v3, LA7/a0;

    .line 1513
    .line 1514
    invoke-virtual {v3}, LA7/a0;->c()V

    .line 1515
    .line 1516
    .line 1517
    invoke-virtual {v1}, LU1/z;->f0()V

    .line 1518
    .line 1519
    .line 1520
    goto :goto_32

    .line 1521
    :cond_53
    iget-object v3, v1, LU1/z;->A:LU1/P;

    .line 1522
    .line 1523
    iget v3, v3, LU1/P;->e:I

    .line 1524
    .line 1525
    const/4 v4, 0x3

    .line 1526
    if-ne v3, v4, :cond_5c

    .line 1527
    .line 1528
    iget v3, v1, LU1/z;->N:I

    .line 1529
    .line 1530
    if-nez v3, :cond_54

    .line 1531
    .line 1532
    invoke-virtual {v1}, LU1/z;->t()Z

    .line 1533
    .line 1534
    .line 1535
    move-result v3

    .line 1536
    if-eqz v3, :cond_55

    .line 1537
    .line 1538
    goto :goto_32

    .line 1539
    :cond_54
    if-nez v5, :cond_5c

    .line 1540
    .line 1541
    :cond_55
    invoke-virtual {v1}, LU1/z;->d0()Z

    .line 1542
    .line 1543
    .line 1544
    move-result v3

    .line 1545
    invoke-virtual {v1, v3, v14}, LU1/z;->n0(ZZ)V

    .line 1546
    .line 1547
    .line 1548
    const/4 v6, 0x2

    .line 1549
    invoke-virtual {v1, v6}, LU1/z;->c0(I)V

    .line 1550
    .line 1551
    .line 1552
    iget-boolean v3, v1, LU1/z;->F:Z

    .line 1553
    .line 1554
    if-eqz v3, :cond_5b

    .line 1555
    .line 1556
    iget-object v3, v1, LU1/z;->s:LU1/G;

    .line 1557
    .line 1558
    iget-object v3, v3, LU1/G;->i:LU1/E;

    .line 1559
    .line 1560
    :goto_2f
    if-eqz v3, :cond_58

    .line 1561
    .line 1562
    iget-object v4, v3, LU1/E;->o:Ln2/t;

    .line 1563
    .line 1564
    iget-object v4, v4, Ln2/t;->c:[Ln2/q;

    .line 1565
    .line 1566
    array-length v5, v4

    .line 1567
    move v10, v14

    .line 1568
    :goto_30
    if-ge v10, v5, :cond_57

    .line 1569
    .line 1570
    aget-object v6, v4, v10

    .line 1571
    .line 1572
    if-eqz v6, :cond_56

    .line 1573
    .line 1574
    invoke-interface {v6}, Ln2/q;->k()V

    .line 1575
    .line 1576
    .line 1577
    :cond_56
    add-int/lit8 v10, v10, 0x1

    .line 1578
    .line 1579
    goto :goto_30

    .line 1580
    :cond_57
    iget-object v3, v3, LU1/E;->m:LU1/E;

    .line 1581
    .line 1582
    goto :goto_2f

    .line 1583
    :cond_58
    iget-object v3, v1, LU1/z;->u:LU1/f;

    .line 1584
    .line 1585
    iget-wide v4, v3, LU1/f;->m:J

    .line 1586
    .line 1587
    cmp-long v6, v4, v16

    .line 1588
    .line 1589
    if-nez v6, :cond_59

    .line 1590
    .line 1591
    goto :goto_31

    .line 1592
    :cond_59
    iget-wide v6, v3, LU1/f;->f:J

    .line 1593
    .line 1594
    add-long/2addr v4, v6

    .line 1595
    iput-wide v4, v3, LU1/f;->m:J

    .line 1596
    .line 1597
    iget-wide v6, v3, LU1/f;->l:J

    .line 1598
    .line 1599
    cmp-long v8, v6, v16

    .line 1600
    .line 1601
    if-eqz v8, :cond_5a

    .line 1602
    .line 1603
    cmp-long v4, v4, v6

    .line 1604
    .line 1605
    if-lez v4, :cond_5a

    .line 1606
    .line 1607
    iput-wide v6, v3, LU1/f;->m:J

    .line 1608
    .line 1609
    :cond_5a
    move-wide/from16 v4, v16

    .line 1610
    .line 1611
    iput-wide v4, v3, LU1/f;->q:J

    .line 1612
    .line 1613
    :cond_5b
    :goto_31
    invoke-virtual {v1}, LU1/z;->h0()V

    .line 1614
    .line 1615
    .line 1616
    :cond_5c
    :goto_32
    iget-object v3, v1, LU1/z;->A:LU1/P;

    .line 1617
    .line 1618
    iget v3, v3, LU1/P;->e:I

    .line 1619
    .line 1620
    const/4 v6, 0x2

    .line 1621
    if-ne v3, v6, :cond_5f

    .line 1622
    .line 1623
    move v10, v14

    .line 1624
    :goto_33
    iget-object v3, v1, LU1/z;->a:[LU1/W;

    .line 1625
    .line 1626
    array-length v4, v3

    .line 1627
    if-ge v10, v4, :cond_5e

    .line 1628
    .line 1629
    aget-object v3, v3, v10

    .line 1630
    .line 1631
    invoke-static {v3}, LU1/z;->s(LU1/W;)Z

    .line 1632
    .line 1633
    .line 1634
    move-result v3

    .line 1635
    if-eqz v3, :cond_5d

    .line 1636
    .line 1637
    iget-object v3, v1, LU1/z;->a:[LU1/W;

    .line 1638
    .line 1639
    aget-object v3, v3, v10

    .line 1640
    .line 1641
    invoke-interface {v3}, LU1/W;->x()Lk2/d0;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v3

    .line 1645
    iget-object v4, v0, LU1/E;->c:[Lk2/d0;

    .line 1646
    .line 1647
    aget-object v4, v4, v10

    .line 1648
    .line 1649
    if-ne v3, v4, :cond_5d

    .line 1650
    .line 1651
    invoke-virtual {v1, v10}, LU1/z;->x(I)V

    .line 1652
    .line 1653
    .line 1654
    :cond_5d
    add-int/lit8 v10, v10, 0x1

    .line 1655
    .line 1656
    goto :goto_33

    .line 1657
    :cond_5e
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 1658
    .line 1659
    iget-boolean v3, v0, LU1/P;->g:Z

    .line 1660
    .line 1661
    if-nez v3, :cond_5f

    .line 1662
    .line 1663
    iget-wide v3, v0, LU1/P;->r:J

    .line 1664
    .line 1665
    const-wide/32 v5, 0x7a120

    .line 1666
    .line 1667
    .line 1668
    cmp-long v0, v3, v5

    .line 1669
    .line 1670
    if-gez v0, :cond_5f

    .line 1671
    .line 1672
    iget-object v0, v1, LU1/z;->s:LU1/G;

    .line 1673
    .line 1674
    iget-object v0, v0, LU1/G;->k:LU1/E;

    .line 1675
    .line 1676
    invoke-static {v0}, LU1/z;->r(LU1/E;)Z

    .line 1677
    .line 1678
    .line 1679
    move-result v0

    .line 1680
    if-eqz v0, :cond_5f

    .line 1681
    .line 1682
    move v10, v13

    .line 1683
    goto :goto_34

    .line 1684
    :cond_5f
    move v10, v14

    .line 1685
    :goto_34
    if-nez v10, :cond_60

    .line 1686
    .line 1687
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    iput-wide v4, v1, LU1/z;->U:J

    .line 1693
    .line 1694
    goto :goto_35

    .line 1695
    :cond_60
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    iget-wide v6, v1, LU1/z;->U:J

    .line 1701
    .line 1702
    cmp-long v0, v6, v4

    .line 1703
    .line 1704
    if-nez v0, :cond_61

    .line 1705
    .line 1706
    iget-object v0, v1, LU1/z;->q:LQ1/q;

    .line 1707
    .line 1708
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1709
    .line 1710
    .line 1711
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1712
    .line 1713
    .line 1714
    move-result-wide v3

    .line 1715
    iput-wide v3, v1, LU1/z;->U:J

    .line 1716
    .line 1717
    goto :goto_35

    .line 1718
    :cond_61
    iget-object v0, v1, LU1/z;->q:LQ1/q;

    .line 1719
    .line 1720
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1721
    .line 1722
    .line 1723
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1724
    .line 1725
    .line 1726
    move-result-wide v3

    .line 1727
    iget-wide v5, v1, LU1/z;->U:J

    .line 1728
    .line 1729
    sub-long/2addr v3, v5

    .line 1730
    const-wide/16 v5, 0xfa0

    .line 1731
    .line 1732
    cmp-long v0, v3, v5

    .line 1733
    .line 1734
    if-gez v0, :cond_68

    .line 1735
    .line 1736
    :goto_35
    invoke-virtual {v1}, LU1/z;->d0()Z

    .line 1737
    .line 1738
    .line 1739
    move-result v0

    .line 1740
    if-eqz v0, :cond_62

    .line 1741
    .line 1742
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 1743
    .line 1744
    iget v0, v0, LU1/P;->e:I

    .line 1745
    .line 1746
    const/4 v3, 0x3

    .line 1747
    if-ne v0, v3, :cond_62

    .line 1748
    .line 1749
    move v10, v13

    .line 1750
    goto :goto_36

    .line 1751
    :cond_62
    move v10, v14

    .line 1752
    :goto_36
    iget-boolean v0, v1, LU1/z;->M:Z

    .line 1753
    .line 1754
    if-eqz v0, :cond_63

    .line 1755
    .line 1756
    iget-boolean v0, v1, LU1/z;->L:Z

    .line 1757
    .line 1758
    if-eqz v0, :cond_63

    .line 1759
    .line 1760
    if-eqz v10, :cond_63

    .line 1761
    .line 1762
    goto :goto_37

    .line 1763
    :cond_63
    move v13, v14

    .line 1764
    :goto_37
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 1765
    .line 1766
    iget-boolean v3, v0, LU1/P;->p:Z

    .line 1767
    .line 1768
    if-eq v3, v13, :cond_64

    .line 1769
    .line 1770
    new-instance v24, LU1/P;

    .line 1771
    .line 1772
    iget-object v3, v0, LU1/P;->a:LN1/N;

    .line 1773
    .line 1774
    iget-object v4, v0, LU1/P;->b:Lk2/H;

    .line 1775
    .line 1776
    iget-wide v5, v0, LU1/P;->c:J

    .line 1777
    .line 1778
    iget-wide v7, v0, LU1/P;->d:J

    .line 1779
    .line 1780
    iget v9, v0, LU1/P;->e:I

    .line 1781
    .line 1782
    iget-object v15, v0, LU1/P;->f:LU1/j;

    .line 1783
    .line 1784
    iget-boolean v2, v0, LU1/P;->g:Z

    .line 1785
    .line 1786
    iget-object v14, v0, LU1/P;->h:Lk2/n0;

    .line 1787
    .line 1788
    move/from16 v33, v2

    .line 1789
    .line 1790
    iget-object v2, v0, LU1/P;->i:Ln2/t;

    .line 1791
    .line 1792
    move-object/from16 v35, v2

    .line 1793
    .line 1794
    iget-object v2, v0, LU1/P;->j:Ljava/util/List;

    .line 1795
    .line 1796
    move-object/from16 v36, v2

    .line 1797
    .line 1798
    iget-object v2, v0, LU1/P;->k:Lk2/H;

    .line 1799
    .line 1800
    move-object/from16 v37, v2

    .line 1801
    .line 1802
    iget-boolean v2, v0, LU1/P;->l:Z

    .line 1803
    .line 1804
    move/from16 v38, v2

    .line 1805
    .line 1806
    iget v2, v0, LU1/P;->m:I

    .line 1807
    .line 1808
    move/from16 v39, v2

    .line 1809
    .line 1810
    iget v2, v0, LU1/P;->n:I

    .line 1811
    .line 1812
    move/from16 v40, v2

    .line 1813
    .line 1814
    iget-object v2, v0, LU1/P;->o:LN1/F;

    .line 1815
    .line 1816
    move-object/from16 v41, v2

    .line 1817
    .line 1818
    move-object/from16 v25, v3

    .line 1819
    .line 1820
    iget-wide v2, v0, LU1/P;->q:J

    .line 1821
    .line 1822
    move-wide/from16 v42, v2

    .line 1823
    .line 1824
    iget-wide v2, v0, LU1/P;->r:J

    .line 1825
    .line 1826
    move-wide/from16 v44, v2

    .line 1827
    .line 1828
    iget-wide v2, v0, LU1/P;->s:J

    .line 1829
    .line 1830
    move-wide/from16 v46, v2

    .line 1831
    .line 1832
    iget-wide v2, v0, LU1/P;->t:J

    .line 1833
    .line 1834
    move-wide/from16 v48, v2

    .line 1835
    .line 1836
    move-object/from16 v26, v4

    .line 1837
    .line 1838
    move-wide/from16 v27, v5

    .line 1839
    .line 1840
    move-wide/from16 v29, v7

    .line 1841
    .line 1842
    move/from16 v31, v9

    .line 1843
    .line 1844
    move/from16 v50, v13

    .line 1845
    .line 1846
    move-object/from16 v34, v14

    .line 1847
    .line 1848
    move-object/from16 v32, v15

    .line 1849
    .line 1850
    invoke-direct/range {v24 .. v50}, LU1/P;-><init>(LN1/N;Lk2/H;JJILU1/j;ZLk2/n0;Ln2/t;Ljava/util/List;Lk2/H;ZIILN1/F;JJJJZ)V

    .line 1851
    .line 1852
    .line 1853
    move-object/from16 v0, v24

    .line 1854
    .line 1855
    iput-object v0, v1, LU1/z;->A:LU1/P;

    .line 1856
    .line 1857
    const/4 v14, 0x0

    .line 1858
    goto :goto_38

    .line 1859
    :cond_64
    move/from16 v50, v13

    .line 1860
    .line 1861
    :goto_38
    iput-boolean v14, v1, LU1/z;->L:Z

    .line 1862
    .line 1863
    if-nez v50, :cond_67

    .line 1864
    .line 1865
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 1866
    .line 1867
    iget v0, v0, LU1/P;->e:I

    .line 1868
    .line 1869
    const/4 v2, 0x4

    .line 1870
    if-ne v0, v2, :cond_65

    .line 1871
    .line 1872
    goto :goto_39

    .line 1873
    :cond_65
    if-nez v10, :cond_66

    .line 1874
    .line 1875
    const/4 v6, 0x2

    .line 1876
    if-eq v0, v6, :cond_66

    .line 1877
    .line 1878
    const/4 v3, 0x3

    .line 1879
    if-ne v0, v3, :cond_67

    .line 1880
    .line 1881
    iget v0, v1, LU1/z;->N:I

    .line 1882
    .line 1883
    if-eqz v0, :cond_67

    .line 1884
    .line 1885
    :cond_66
    invoke-virtual {v1, v11, v12}, LU1/z;->M(J)V

    .line 1886
    .line 1887
    .line 1888
    :cond_67
    :goto_39
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1889
    .line 1890
    .line 1891
    return-void

    .line 1892
    :cond_68
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1893
    .line 1894
    const-string v2, "Playback stuck buffering and not loading"

    .line 1895
    .line 1896
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1897
    .line 1898
    .line 1899
    throw v0

    .line 1900
    :cond_69
    :goto_3a
    return-void
.end method

.method public final d0()Z
    .locals 2

    .line 1
    iget-object v0, p0, LU1/z;->A:LU1/P;

    .line 2
    .line 3
    iget-boolean v1, v0, LU1/P;->l:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v0, v0, LU1/P;->n:I

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final e([ZJ)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LU1/z;->s:LU1/G;

    .line 4
    .line 5
    iget-object v2, v1, LU1/G;->j:LU1/E;

    .line 6
    .line 7
    iget-object v3, v2, LU1/E;->o:Ln2/t;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    :goto_0
    iget-object v6, v0, LU1/z;->a:[LU1/W;

    .line 11
    .line 12
    array-length v7, v6

    .line 13
    iget-object v8, v0, LU1/z;->b:Ljava/util/Set;

    .line 14
    .line 15
    if-ge v5, v7, :cond_1

    .line 16
    .line 17
    invoke-virtual {v3, v5}, Ln2/t;->b(I)Z

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    if-nez v7, :cond_0

    .line 22
    .line 23
    aget-object v7, v6, v5

    .line 24
    .line 25
    invoke-interface {v8, v7}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    if-eqz v7, :cond_0

    .line 30
    .line 31
    aget-object v6, v6, v5

    .line 32
    .line 33
    invoke-interface {v6}, LU1/W;->reset()V

    .line 34
    .line 35
    .line 36
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v5, 0x0

    .line 40
    :goto_1
    array-length v7, v6

    .line 41
    if-ge v5, v7, :cond_c

    .line 42
    .line 43
    invoke-virtual {v3, v5}, Ln2/t;->b(I)Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_a

    .line 48
    .line 49
    aget-boolean v7, p1, v5

    .line 50
    .line 51
    aget-object v10, v6, v5

    .line 52
    .line 53
    invoke-static {v10}, LU1/z;->s(LU1/W;)Z

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    if-eqz v11, :cond_2

    .line 58
    .line 59
    goto/16 :goto_8

    .line 60
    .line 61
    :cond_2
    iget-object v11, v1, LU1/G;->j:LU1/E;

    .line 62
    .line 63
    iget-object v12, v1, LU1/G;->i:LU1/E;

    .line 64
    .line 65
    if-ne v11, v12, :cond_3

    .line 66
    .line 67
    const/4 v15, 0x1

    .line 68
    goto :goto_2

    .line 69
    :cond_3
    const/4 v15, 0x0

    .line 70
    :goto_2
    iget-object v12, v11, LU1/E;->o:Ln2/t;

    .line 71
    .line 72
    iget-object v13, v12, Ln2/t;->b:[LU1/Y;

    .line 73
    .line 74
    aget-object v13, v13, v5

    .line 75
    .line 76
    iget-object v12, v12, Ln2/t;->c:[Ln2/q;

    .line 77
    .line 78
    aget-object v12, v12, v5

    .line 79
    .line 80
    if-eqz v12, :cond_4

    .line 81
    .line 82
    invoke-interface {v12}, Ln2/q;->length()I

    .line 83
    .line 84
    .line 85
    move-result v14

    .line 86
    goto :goto_3

    .line 87
    :cond_4
    const/4 v14, 0x0

    .line 88
    :goto_3
    new-array v4, v14, [LN1/n;

    .line 89
    .line 90
    const/4 v9, 0x0

    .line 91
    const/16 v16, 0x1

    .line 92
    .line 93
    :goto_4
    if-ge v9, v14, :cond_5

    .line 94
    .line 95
    invoke-interface {v12, v9}, Ln2/q;->b(I)LN1/n;

    .line 96
    .line 97
    .line 98
    move-result-object v17

    .line 99
    aput-object v17, v4, v9

    .line 100
    .line 101
    add-int/lit8 v9, v9, 0x1

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_5
    invoke-virtual {v0}, LU1/z;->d0()Z

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    if-eqz v9, :cond_6

    .line 109
    .line 110
    iget-object v9, v0, LU1/z;->A:LU1/P;

    .line 111
    .line 112
    iget v9, v9, LU1/P;->e:I

    .line 113
    .line 114
    const/4 v12, 0x3

    .line 115
    if-ne v9, v12, :cond_6

    .line 116
    .line 117
    move/from16 v9, v16

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_6
    const/4 v9, 0x0

    .line 121
    :goto_5
    if-nez v7, :cond_7

    .line 122
    .line 123
    if-eqz v9, :cond_7

    .line 124
    .line 125
    move/from16 v14, v16

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_7
    const/4 v14, 0x0

    .line 129
    :goto_6
    iget v7, v0, LU1/z;->N:I

    .line 130
    .line 131
    add-int/lit8 v7, v7, 0x1

    .line 132
    .line 133
    iput v7, v0, LU1/z;->N:I

    .line 134
    .line 135
    invoke-interface {v8, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    iget-object v7, v11, LU1/E;->c:[Lk2/d0;

    .line 139
    .line 140
    aget-object v7, v7, v5

    .line 141
    .line 142
    move-object/from16 v21, v3

    .line 143
    .line 144
    move-object v12, v4

    .line 145
    iget-wide v3, v11, LU1/E;->p:J

    .line 146
    .line 147
    iget-object v11, v11, LU1/E;->g:LU1/F;

    .line 148
    .line 149
    iget-object v11, v11, LU1/F;->a:Lk2/H;

    .line 150
    .line 151
    move-wide/from16 v16, p2

    .line 152
    .line 153
    move-wide/from16 v18, v3

    .line 154
    .line 155
    move-object/from16 v20, v11

    .line 156
    .line 157
    move-object v11, v13

    .line 158
    move-object v13, v7

    .line 159
    invoke-interface/range {v10 .. v20}, LU1/W;->m(LU1/Y;[LN1/n;Lk2/d0;ZZJJLk2/H;)V

    .line 160
    .line 161
    .line 162
    new-instance v3, LU1/v;

    .line 163
    .line 164
    invoke-direct {v3, v0}, LU1/v;-><init>(LU1/z;)V

    .line 165
    .line 166
    .line 167
    const/16 v4, 0xb

    .line 168
    .line 169
    invoke-interface {v10, v4, v3}, LU1/S;->c(ILjava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    iget-object v3, v0, LU1/z;->o:LE5/l;

    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-interface {v10}, LU1/W;->B()LU1/D;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    if-eqz v4, :cond_9

    .line 182
    .line 183
    iget-object v7, v3, LE5/l;->g:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v7, LU1/D;

    .line 186
    .line 187
    if-eq v4, v7, :cond_9

    .line 188
    .line 189
    if-nez v7, :cond_8

    .line 190
    .line 191
    iput-object v4, v3, LE5/l;->g:Ljava/lang/Object;

    .line 192
    .line 193
    iput-object v10, v3, LE5/l;->f:Ljava/lang/Object;

    .line 194
    .line 195
    iget-object v3, v3, LE5/l;->d:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v3, LA7/a0;

    .line 198
    .line 199
    iget-object v3, v3, LA7/a0;->f:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v3, LN1/F;

    .line 202
    .line 203
    check-cast v4, LW1/v;

    .line 204
    .line 205
    invoke-virtual {v4, v3}, LW1/v;->q(LN1/F;)V

    .line 206
    .line 207
    .line 208
    goto :goto_7

    .line 209
    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 210
    .line 211
    const-string v2, "Multiple renderer media clocks enabled."

    .line 212
    .line 213
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    new-instance v2, LU1/j;

    .line 217
    .line 218
    const/4 v3, 0x2

    .line 219
    const/16 v4, 0x3e8

    .line 220
    .line 221
    invoke-direct {v2, v3, v1, v4}, LU1/j;-><init>(ILjava/lang/Exception;I)V

    .line 222
    .line 223
    .line 224
    throw v2

    .line 225
    :cond_9
    :goto_7
    if-eqz v9, :cond_b

    .line 226
    .line 227
    if-eqz v15, :cond_b

    .line 228
    .line 229
    invoke-interface {v10}, LU1/W;->start()V

    .line 230
    .line 231
    .line 232
    goto :goto_9

    .line 233
    :cond_a
    :goto_8
    move-object/from16 v21, v3

    .line 234
    .line 235
    :cond_b
    :goto_9
    add-int/lit8 v5, v5, 0x1

    .line 236
    .line 237
    move-object/from16 v3, v21

    .line 238
    .line 239
    goto/16 :goto_1

    .line 240
    .line 241
    :cond_c
    const/4 v3, 0x1

    .line 242
    iput-boolean v3, v2, LU1/E;->h:Z

    .line 243
    .line 244
    return-void
.end method

.method public final e0(LN1/N;Lk2/H;)Z
    .locals 2

    .line 1
    invoke-virtual {p2}, Lk2/H;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, LN1/N;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p2, p2, Lk2/H;->a:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v0, p0, LU1/z;->m:LN1/L;

    .line 17
    .line 18
    invoke-virtual {p1, p2, v0}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    iget p2, p2, LN1/L;->c:I

    .line 23
    .line 24
    iget-object v0, p0, LU1/z;->l:LN1/M;

    .line 25
    .line 26
    invoke-virtual {p1, p2, v0}, LN1/N;->n(ILN1/M;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, LN1/M;->a()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    iget-boolean p1, v0, LN1/M;->i:Z

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iget-wide p1, v0, LN1/M;->f:J

    .line 40
    .line 41
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    cmp-long p1, p1, v0

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    return p1

    .line 52
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 53
    return p1
.end method

.method public final f(LN1/N;Ljava/lang/Object;J)J
    .locals 4

    .line 1
    iget-object v0, p0, LU1/z;->m:LN1/L;

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget p2, p2, LN1/L;->c:I

    .line 8
    .line 9
    iget-object v1, p0, LU1/z;->l:LN1/M;

    .line 10
    .line 11
    invoke-virtual {p1, p2, v1}, LN1/N;->n(ILN1/M;)V

    .line 12
    .line 13
    .line 14
    iget-wide p1, v1, LN1/M;->f:J

    .line 15
    .line 16
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    cmp-long p1, p1, v2

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1}, LN1/M;->a()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    iget-boolean p1, v1, LN1/M;->i:Z

    .line 32
    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-wide p1, v1, LN1/M;->g:J

    .line 37
    .line 38
    invoke-static {p1, p2}, LQ1/x;->x(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide p1

    .line 42
    iget-wide v1, v1, LN1/M;->f:J

    .line 43
    .line 44
    sub-long/2addr p1, v1

    .line 45
    invoke-static {p1, p2}, LQ1/x;->K(J)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    iget-wide v0, v0, LN1/L;->e:J

    .line 50
    .line 51
    add-long/2addr p3, v0

    .line 52
    sub-long/2addr p1, p3

    .line 53
    return-wide p1

    .line 54
    :cond_1
    :goto_0
    return-wide v2
.end method

.method public final f0()V
    .locals 5

    .line 1
    iget-object v0, p0, LU1/z;->s:LU1/G;

    .line 2
    .line 3
    iget-object v0, v0, LU1/G;->i:LU1/E;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, v0, LU1/E;->o:Ln2/t;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    iget-object v2, p0, LU1/z;->a:[LU1/W;

    .line 12
    .line 13
    array-length v3, v2

    .line 14
    if-ge v1, v3, :cond_2

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ln2/t;->b(I)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    aget-object v3, v2, v1

    .line 23
    .line 24
    invoke-interface {v3}, LU1/W;->getState()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/4 v4, 0x1

    .line 29
    if-ne v3, v4, :cond_1

    .line 30
    .line 31
    aget-object v2, v2, v1

    .line 32
    .line 33
    invoke-interface {v2}, LU1/W;->start()V

    .line 34
    .line 35
    .line 36
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    :goto_1
    return-void
.end method

.method public final g()J
    .locals 9

    .line 1
    iget-object v0, p0, LU1/z;->s:LU1/G;

    .line 2
    .line 3
    iget-object v0, v0, LU1/G;->j:LU1/E;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-wide v1, v0, LU1/E;->p:J

    .line 11
    .line 12
    iget-boolean v3, v0, LU1/E;->e:Z

    .line 13
    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    return-wide v1

    .line 17
    :cond_1
    const/4 v3, 0x0

    .line 18
    :goto_0
    iget-object v4, p0, LU1/z;->a:[LU1/W;

    .line 19
    .line 20
    array-length v5, v4

    .line 21
    if-ge v3, v5, :cond_5

    .line 22
    .line 23
    aget-object v5, v4, v3

    .line 24
    .line 25
    invoke-static {v5}, LU1/z;->s(LU1/W;)Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-eqz v5, :cond_4

    .line 30
    .line 31
    aget-object v5, v4, v3

    .line 32
    .line 33
    invoke-interface {v5}, LU1/W;->x()Lk2/d0;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    iget-object v6, v0, LU1/E;->c:[Lk2/d0;

    .line 38
    .line 39
    aget-object v6, v6, v3

    .line 40
    .line 41
    if-eq v5, v6, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    aget-object v4, v4, v3

    .line 45
    .line 46
    invoke-interface {v4}, LU1/W;->z()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    const-wide/high16 v6, -0x8000000000000000L

    .line 51
    .line 52
    cmp-long v8, v4, v6

    .line 53
    .line 54
    if-nez v8, :cond_3

    .line 55
    .line 56
    return-wide v6

    .line 57
    :cond_3
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 58
    .line 59
    .line 60
    move-result-wide v1

    .line 61
    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_5
    return-wide v1
.end method

.method public final g0(ZZ)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget-boolean p1, p0, LU1/z;->K:Z

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p1, v1

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    move p1, v0

    .line 13
    :goto_1
    invoke-virtual {p0, p1, v1, v0, v1}, LU1/z;->G(ZZZZ)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LU1/z;->B:LT5/s;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, LT5/s;->c(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, LU1/z;->g:LU1/h;

    .line 22
    .line 23
    iget-object p2, p0, LU1/z;->w:LV1/k;

    .line 24
    .line 25
    iget-object v1, p1, LU1/h;->i:Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-virtual {v1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1}, LU1/h;->d()V

    .line 34
    .line 35
    .line 36
    :cond_2
    invoke-virtual {p0, v0}, LU1/z;->c0(I)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final h(LN1/N;)Landroid/util/Pair;
    .locals 9

    .line 1
    invoke-virtual {p1}, LN1/N;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p1, LU1/P;->u:Lk2/H;

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-boolean v0, p0, LU1/z;->J:Z

    .line 21
    .line 22
    invoke-virtual {p1, v0}, LN1/N;->a(Z)I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    iget-object v4, p0, LU1/z;->l:LN1/M;

    .line 32
    .line 33
    iget-object v5, p0, LU1/z;->m:LN1/L;

    .line 34
    .line 35
    move-object v3, p1

    .line 36
    invoke-virtual/range {v3 .. v8}, LN1/N;->i(LN1/M;LN1/L;IJ)Landroid/util/Pair;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v0, p0, LU1/z;->s:LU1/G;

    .line 41
    .line 42
    iget-object v4, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v0, v3, v4, v1, v2}, LU1/G;->n(LN1/N;Ljava/lang/Object;J)Lk2/H;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Ljava/lang/Long;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    invoke-virtual {v0}, Lk2/H;->b()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    iget-object p1, v0, Lk2/H;->a:Ljava/lang/Object;

    .line 63
    .line 64
    iget-object v4, p0, LU1/z;->m:LN1/L;

    .line 65
    .line 66
    invoke-virtual {v3, p1, v4}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 67
    .line 68
    .line 69
    iget p1, v0, Lk2/H;->b:I

    .line 70
    .line 71
    invoke-virtual {v4, p1}, LN1/L;->e(I)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    iget v3, v0, Lk2/H;->c:I

    .line 76
    .line 77
    if-ne v3, p1, :cond_2

    .line 78
    .line 79
    iget-object p1, v4, LN1/L;->g:LN1/b;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    move-wide v1, v4

    .line 86
    :cond_2
    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {v0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1
.end method

.method public final h0()V
    .locals 6

    .line 1
    iget-object v0, p0, LU1/z;->o:LE5/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, LE5/l;->c:Z

    .line 5
    .line 6
    iget-object v0, v0, LE5/l;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LA7/a0;

    .line 9
    .line 10
    iget-boolean v2, v0, LA7/a0;->b:Z

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, LA7/a0;->g()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    invoke-virtual {v0, v2, v3}, LA7/a0;->b(J)V

    .line 19
    .line 20
    .line 21
    iput-boolean v1, v0, LA7/a0;->b:Z

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, LU1/z;->a:[LU1/W;

    .line 24
    .line 25
    array-length v2, v0

    .line 26
    :goto_0
    if-ge v1, v2, :cond_2

    .line 27
    .line 28
    aget-object v3, v0, v1

    .line 29
    .line 30
    invoke-static {v3}, LU1/z;->s(LU1/W;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    invoke-interface {v3}, LU1/W;->getState()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const/4 v5, 0x2

    .line 41
    if-ne v4, v5, :cond_1

    .line 42
    .line 43
    invoke-interface {v3}, LU1/W;->stop()V

    .line 44
    .line 45
    .line 46
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "Playback error"

    .line 6
    .line 7
    const-string v3, "ExoPlayerImplInternal"

    .line 8
    .line 9
    const/4 v11, 0x1

    .line 10
    const/16 v4, 0x3e8

    .line 11
    .line 12
    const/4 v12, 0x0

    .line 13
    :try_start_0
    iget v5, v0, Landroid/os/Message;->what:I

    .line 14
    .line 15
    packed-switch v5, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    :pswitch_0
    return v12

    .line 19
    :pswitch_1
    invoke-virtual {v1}, LU1/z;->B()V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_4

    .line 23
    .line 24
    :catch_0
    move-exception v0

    .line 25
    goto/16 :goto_5

    .line 26
    .line 27
    :catch_1
    move-exception v0

    .line 28
    goto/16 :goto_6

    .line 29
    .line 30
    :catch_2
    move-exception v0

    .line 31
    goto/16 :goto_7

    .line 32
    .line 33
    :catch_3
    move-exception v0

    .line 34
    goto/16 :goto_8

    .line 35
    .line 36
    :catch_4
    move-exception v0

    .line 37
    goto/16 :goto_9

    .line 38
    .line 39
    :catch_5
    move-exception v0

    .line 40
    goto/16 :goto_c

    .line 41
    .line 42
    :catch_6
    move-exception v0

    .line 43
    goto/16 :goto_d

    .line 44
    .line 45
    :pswitch_2
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, LU1/l;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, LU1/z;->Y(LU1/l;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :pswitch_3
    iget v5, v0, Landroid/os/Message;->arg1:I

    .line 55
    .line 56
    iget v6, v0, Landroid/os/Message;->arg2:I

    .line 57
    .line 58
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Ljava/util/List;

    .line 61
    .line 62
    invoke-virtual {v1, v5, v6, v0}, LU1/z;->k0(IILjava/util/List;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_4

    .line 66
    .line 67
    :pswitch_4
    invoke-virtual {v1}, LU1/z;->F()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v11}, LU1/z;->N(Z)V

    .line 71
    .line 72
    .line 73
    goto/16 :goto_4

    .line 74
    .line 75
    :pswitch_5
    invoke-virtual {v1}, LU1/z;->F()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v11}, LU1/z;->N(Z)V

    .line 79
    .line 80
    .line 81
    goto/16 :goto_4

    .line 82
    .line 83
    :pswitch_6
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 84
    .line 85
    if-eqz v0, :cond_0

    .line 86
    .line 87
    move v0, v11

    .line 88
    goto :goto_0

    .line 89
    :cond_0
    move v0, v12

    .line 90
    :goto_0
    invoke-virtual {v1, v0}, LU1/z;->V(Z)V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_4

    .line 94
    .line 95
    :pswitch_7
    invoke-virtual {v1}, LU1/z;->z()V

    .line 96
    .line 97
    .line 98
    goto/16 :goto_4

    .line 99
    .line 100
    :pswitch_8
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Lk2/g0;

    .line 103
    .line 104
    invoke-virtual {v1, v0}, LU1/z;->b0(Lk2/g0;)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_4

    .line 108
    .line 109
    :pswitch_9
    iget v5, v0, Landroid/os/Message;->arg1:I

    .line 110
    .line 111
    iget v6, v0, Landroid/os/Message;->arg2:I

    .line 112
    .line 113
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, Lk2/g0;

    .line 116
    .line 117
    invoke-virtual {v1, v5, v6, v0}, LU1/z;->E(IILk2/g0;)V

    .line 118
    .line 119
    .line 120
    goto/16 :goto_4

    .line 121
    .line 122
    :pswitch_a
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, LU1/x;

    .line 125
    .line 126
    invoke-virtual {v1, v0}, LU1/z;->A(LU1/x;)V

    .line 127
    .line 128
    .line 129
    goto/16 :goto_4

    .line 130
    .line 131
    :pswitch_b
    iget-object v5, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v5, LU1/w;

    .line 134
    .line 135
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 136
    .line 137
    invoke-virtual {v1, v5, v0}, LU1/z;->b(LU1/w;I)V

    .line 138
    .line 139
    .line 140
    goto/16 :goto_4

    .line 141
    .line 142
    :pswitch_c
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v0, LU1/w;

    .line 145
    .line 146
    invoke-virtual {v1, v0}, LU1/z;->U(LU1/w;)V

    .line 147
    .line 148
    .line 149
    goto/16 :goto_4

    .line 150
    .line 151
    :pswitch_d
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, LN1/F;

    .line 154
    .line 155
    iget v5, v0, LN1/F;->a:F

    .line 156
    .line 157
    invoke-virtual {v1, v0, v5, v11, v12}, LU1/z;->p(LN1/F;FZZ)V

    .line 158
    .line 159
    .line 160
    goto/16 :goto_4

    .line 161
    .line 162
    :pswitch_e
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, LU1/T;

    .line 165
    .line 166
    invoke-virtual {v1, v0}, LU1/z;->R(LU1/T;)V

    .line 167
    .line 168
    .line 169
    goto/16 :goto_4

    .line 170
    .line 171
    :pswitch_f
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, LU1/T;

    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v0}, LU1/z;->Q(LU1/T;)V

    .line 179
    .line 180
    .line 181
    goto/16 :goto_4

    .line 182
    .line 183
    :pswitch_10
    iget v5, v0, Landroid/os/Message;->arg1:I

    .line 184
    .line 185
    if-eqz v5, :cond_1

    .line 186
    .line 187
    move v5, v11

    .line 188
    goto :goto_1

    .line 189
    :cond_1
    move v5, v12

    .line 190
    :goto_1
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 193
    .line 194
    invoke-virtual {v1, v5, v0}, LU1/z;->T(ZLjava/util/concurrent/atomic/AtomicBoolean;)V

    .line 195
    .line 196
    .line 197
    goto :goto_4

    .line 198
    :pswitch_11
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 199
    .line 200
    if-eqz v0, :cond_2

    .line 201
    .line 202
    move v0, v11

    .line 203
    goto :goto_2

    .line 204
    :cond_2
    move v0, v12

    .line 205
    :goto_2
    invoke-virtual {v1, v0}, LU1/z;->a0(Z)V

    .line 206
    .line 207
    .line 208
    goto :goto_4

    .line 209
    :pswitch_12
    iget v0, v0, Landroid/os/Message;->arg1:I

    .line 210
    .line 211
    invoke-virtual {v1, v0}, LU1/z;->Z(I)V

    .line 212
    .line 213
    .line 214
    goto :goto_4

    .line 215
    :pswitch_13
    invoke-virtual {v1}, LU1/z;->F()V

    .line 216
    .line 217
    .line 218
    goto :goto_4

    .line 219
    :pswitch_14
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v0, Lk2/F;

    .line 222
    .line 223
    invoke-virtual {v1, v0}, LU1/z;->j(Lk2/F;)V

    .line 224
    .line 225
    .line 226
    goto :goto_4

    .line 227
    :pswitch_15
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v0, Lk2/F;

    .line 230
    .line 231
    invoke-virtual {v1, v0}, LU1/z;->o(Lk2/F;)V

    .line 232
    .line 233
    .line 234
    goto :goto_4

    .line 235
    :pswitch_16
    invoke-virtual {v1}, LU1/z;->D()V

    .line 236
    .line 237
    .line 238
    return v11

    .line 239
    :pswitch_17
    invoke-virtual {v1, v12, v11}, LU1/z;->g0(ZZ)V

    .line 240
    .line 241
    .line 242
    goto :goto_4

    .line 243
    :pswitch_18
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v0, LU1/a0;

    .line 246
    .line 247
    iput-object v0, v1, LU1/z;->z:LU1/a0;

    .line 248
    .line 249
    goto :goto_4

    .line 250
    :pswitch_19
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v0, LN1/F;

    .line 253
    .line 254
    invoke-virtual {v1, v0}, LU1/z;->X(LN1/F;)V

    .line 255
    .line 256
    .line 257
    goto :goto_4

    .line 258
    :pswitch_1a
    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v0, LU1/y;

    .line 261
    .line 262
    invoke-virtual {v1, v0}, LU1/z;->O(LU1/y;)V

    .line 263
    .line 264
    .line 265
    goto :goto_4

    .line 266
    :pswitch_1b
    invoke-virtual {v1}, LU1/z;->d()V

    .line 267
    .line 268
    .line 269
    goto :goto_4

    .line 270
    :pswitch_1c
    iget v5, v0, Landroid/os/Message;->arg1:I

    .line 271
    .line 272
    if-eqz v5, :cond_3

    .line 273
    .line 274
    move v5, v11

    .line 275
    goto :goto_3

    .line 276
    :cond_3
    move v5, v12

    .line 277
    :goto_3
    iget v0, v0, Landroid/os/Message;->arg2:I

    .line 278
    .line 279
    shr-int/lit8 v6, v0, 0x4

    .line 280
    .line 281
    and-int/lit8 v0, v0, 0xf

    .line 282
    .line 283
    invoke-virtual {v1, v6, v0, v5, v11}, LU1/z;->W(IIZZ)V
    :try_end_0
    .catch LU1/j; {:try_start_0 .. :try_end_0} :catch_6
    .catch LZ1/b; {:try_start_0 .. :try_end_0} :catch_5
    .catch LN1/D; {:try_start_0 .. :try_end_0} :catch_4
    .catch LS1/i; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lk2/b; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 284
    .line 285
    .line 286
    :goto_4
    move v3, v11

    .line 287
    goto/16 :goto_11

    .line 288
    .line 289
    :goto_5
    instance-of v5, v0, Ljava/lang/IllegalStateException;

    .line 290
    .line 291
    if-nez v5, :cond_4

    .line 292
    .line 293
    instance-of v5, v0, Ljava/lang/IllegalArgumentException;

    .line 294
    .line 295
    if-eqz v5, :cond_5

    .line 296
    .line 297
    :cond_4
    const/16 v4, 0x3ec

    .line 298
    .line 299
    :cond_5
    new-instance v5, LU1/j;

    .line 300
    .line 301
    const/4 v6, 0x2

    .line 302
    invoke-direct {v5, v6, v0, v4}, LU1/j;-><init>(ILjava/lang/Exception;I)V

    .line 303
    .line 304
    .line 305
    invoke-static {v3, v2, v5}, LQ1/k;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v1, v11, v12}, LU1/z;->g0(ZZ)V

    .line 309
    .line 310
    .line 311
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 312
    .line 313
    invoke-virtual {v0, v5}, LU1/P;->e(LU1/j;)LU1/P;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    iput-object v0, v1, LU1/z;->A:LU1/P;

    .line 318
    .line 319
    goto :goto_4

    .line 320
    :goto_6
    const/16 v2, 0x7d0

    .line 321
    .line 322
    invoke-virtual {v1, v0, v2}, LU1/z;->k(Ljava/io/IOException;I)V

    .line 323
    .line 324
    .line 325
    goto :goto_4

    .line 326
    :goto_7
    const/16 v2, 0x3ea

    .line 327
    .line 328
    invoke-virtual {v1, v0, v2}, LU1/z;->k(Ljava/io/IOException;I)V

    .line 329
    .line 330
    .line 331
    goto :goto_4

    .line 332
    :goto_8
    iget v2, v0, LS1/i;->a:I

    .line 333
    .line 334
    invoke-virtual {v1, v0, v2}, LU1/z;->k(Ljava/io/IOException;I)V

    .line 335
    .line 336
    .line 337
    goto :goto_4

    .line 338
    :goto_9
    iget-boolean v2, v0, LN1/D;->a:Z

    .line 339
    .line 340
    iget v3, v0, LN1/D;->b:I

    .line 341
    .line 342
    if-ne v3, v11, :cond_7

    .line 343
    .line 344
    if-eqz v2, :cond_6

    .line 345
    .line 346
    const/16 v2, 0xbb9

    .line 347
    .line 348
    :goto_a
    move v4, v2

    .line 349
    goto :goto_b

    .line 350
    :cond_6
    const/16 v2, 0xbbb

    .line 351
    .line 352
    goto :goto_a

    .line 353
    :cond_7
    const/4 v5, 0x4

    .line 354
    if-ne v3, v5, :cond_9

    .line 355
    .line 356
    if-eqz v2, :cond_8

    .line 357
    .line 358
    const/16 v2, 0xbba

    .line 359
    .line 360
    goto :goto_a

    .line 361
    :cond_8
    const/16 v2, 0xbbc

    .line 362
    .line 363
    goto :goto_a

    .line 364
    :cond_9
    :goto_b
    invoke-virtual {v1, v0, v4}, LU1/z;->k(Ljava/io/IOException;I)V

    .line 365
    .line 366
    .line 367
    goto :goto_4

    .line 368
    :goto_c
    iget v2, v0, LZ1/b;->a:I

    .line 369
    .line 370
    invoke-virtual {v1, v0, v2}, LU1/z;->k(Ljava/io/IOException;I)V

    .line 371
    .line 372
    .line 373
    goto :goto_4

    .line 374
    :goto_d
    iget v4, v0, LU1/j;->c:I

    .line 375
    .line 376
    iget-object v5, v1, LU1/z;->s:LU1/G;

    .line 377
    .line 378
    if-ne v4, v11, :cond_a

    .line 379
    .line 380
    iget-object v4, v5, LU1/G;->j:LU1/E;

    .line 381
    .line 382
    if-eqz v4, :cond_a

    .line 383
    .line 384
    iget-object v4, v4, LU1/E;->g:LU1/F;

    .line 385
    .line 386
    new-instance v13, LU1/j;

    .line 387
    .line 388
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v14

    .line 392
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 393
    .line 394
    .line 395
    move-result-object v15

    .line 396
    iget-wide v6, v0, LN1/E;->b:J

    .line 397
    .line 398
    iget-boolean v8, v0, LU1/j;->i:Z

    .line 399
    .line 400
    iget v9, v0, LN1/E;->a:I

    .line 401
    .line 402
    iget v10, v0, LU1/j;->c:I

    .line 403
    .line 404
    iget-object v12, v0, LU1/j;->d:Ljava/lang/String;

    .line 405
    .line 406
    iget v11, v0, LU1/j;->e:I

    .line 407
    .line 408
    move-wide/from16 v23, v6

    .line 409
    .line 410
    iget-object v6, v0, LU1/j;->f:LN1/n;

    .line 411
    .line 412
    iget v0, v0, LU1/j;->g:I

    .line 413
    .line 414
    iget-object v4, v4, LU1/F;->a:Lk2/H;

    .line 415
    .line 416
    move/from16 v21, v0

    .line 417
    .line 418
    move-object/from16 v22, v4

    .line 419
    .line 420
    move-object/from16 v20, v6

    .line 421
    .line 422
    move/from16 v25, v8

    .line 423
    .line 424
    move/from16 v16, v9

    .line 425
    .line 426
    move/from16 v17, v10

    .line 427
    .line 428
    move/from16 v19, v11

    .line 429
    .line 430
    move-object/from16 v18, v12

    .line 431
    .line 432
    invoke-direct/range {v13 .. v25}, LU1/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILN1/n;ILk2/H;JZ)V

    .line 433
    .line 434
    .line 435
    move-object v0, v13

    .line 436
    :cond_a
    iget-boolean v4, v0, LU1/j;->i:Z

    .line 437
    .line 438
    if-eqz v4, :cond_d

    .line 439
    .line 440
    iget-object v4, v1, LU1/z;->T:LU1/j;

    .line 441
    .line 442
    if-eqz v4, :cond_b

    .line 443
    .line 444
    const/16 v4, 0x138c

    .line 445
    .line 446
    iget v6, v0, LN1/E;->a:I

    .line 447
    .line 448
    if-eq v6, v4, :cond_b

    .line 449
    .line 450
    const/16 v4, 0x138b

    .line 451
    .line 452
    if-ne v6, v4, :cond_d

    .line 453
    .line 454
    :cond_b
    const-string v2, "Recoverable renderer error"

    .line 455
    .line 456
    invoke-static {v3, v2, v0}, LQ1/k;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 457
    .line 458
    .line 459
    iget-object v2, v1, LU1/z;->T:LU1/j;

    .line 460
    .line 461
    if-eqz v2, :cond_c

    .line 462
    .line 463
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 464
    .line 465
    .line 466
    iget-object v0, v1, LU1/z;->T:LU1/j;

    .line 467
    .line 468
    goto :goto_e

    .line 469
    :cond_c
    iput-object v0, v1, LU1/z;->T:LU1/j;

    .line 470
    .line 471
    :goto_e
    const/16 v2, 0x19

    .line 472
    .line 473
    iget-object v3, v1, LU1/z;->i:LQ1/s;

    .line 474
    .line 475
    invoke-virtual {v3, v2, v0}, LQ1/s;->a(ILjava/lang/Object;)LQ1/r;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    iget-object v2, v0, LQ1/r;->a:Landroid/os/Message;

    .line 483
    .line 484
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    iget-object v3, v3, LQ1/s;->a:Landroid/os/Handler;

    .line 488
    .line 489
    invoke-virtual {v3, v2}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 490
    .line 491
    .line 492
    invoke-virtual {v0}, LQ1/r;->a()V

    .line 493
    .line 494
    .line 495
    const/4 v3, 0x1

    .line 496
    goto :goto_11

    .line 497
    :cond_d
    iget-object v4, v1, LU1/z;->T:LU1/j;

    .line 498
    .line 499
    if-eqz v4, :cond_e

    .line 500
    .line 501
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 502
    .line 503
    .line 504
    iget-object v0, v1, LU1/z;->T:LU1/j;

    .line 505
    .line 506
    :cond_e
    invoke-static {v3, v2, v0}, LQ1/k;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 507
    .line 508
    .line 509
    iget v2, v0, LU1/j;->c:I

    .line 510
    .line 511
    const/4 v3, 0x1

    .line 512
    if-ne v2, v3, :cond_11

    .line 513
    .line 514
    iget-object v2, v5, LU1/G;->i:LU1/E;

    .line 515
    .line 516
    iget-object v3, v5, LU1/G;->j:LU1/E;

    .line 517
    .line 518
    if-eq v2, v3, :cond_10

    .line 519
    .line 520
    :goto_f
    iget-object v2, v5, LU1/G;->i:LU1/E;

    .line 521
    .line 522
    iget-object v3, v5, LU1/G;->j:LU1/E;

    .line 523
    .line 524
    if-eq v2, v3, :cond_f

    .line 525
    .line 526
    invoke-virtual {v5}, LU1/G;->a()LU1/E;

    .line 527
    .line 528
    .line 529
    goto :goto_f

    .line 530
    :cond_f
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v1}, LU1/z;->w()V

    .line 534
    .line 535
    .line 536
    iget-object v2, v2, LU1/E;->g:LU1/F;

    .line 537
    .line 538
    const/4 v9, 0x1

    .line 539
    const/4 v10, 0x0

    .line 540
    iget-object v3, v2, LU1/F;->a:Lk2/H;

    .line 541
    .line 542
    move-object v5, v3

    .line 543
    iget-wide v3, v2, LU1/F;->b:J

    .line 544
    .line 545
    iget-wide v6, v2, LU1/F;->c:J

    .line 546
    .line 547
    move-object v2, v5

    .line 548
    move-wide v5, v6

    .line 549
    move-wide v7, v3

    .line 550
    invoke-virtual/range {v1 .. v10}, LU1/z;->q(Lk2/H;JJJZI)LU1/P;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    iput-object v2, v1, LU1/z;->A:LU1/P;

    .line 555
    .line 556
    :cond_10
    const/4 v2, 0x0

    .line 557
    const/4 v3, 0x1

    .line 558
    goto :goto_10

    .line 559
    :cond_11
    const/4 v2, 0x0

    .line 560
    :goto_10
    invoke-virtual {v1, v3, v2}, LU1/z;->g0(ZZ)V

    .line 561
    .line 562
    .line 563
    iget-object v2, v1, LU1/z;->A:LU1/P;

    .line 564
    .line 565
    invoke-virtual {v2, v0}, LU1/P;->e(LU1/j;)LU1/P;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    iput-object v0, v1, LU1/z;->A:LU1/P;

    .line 570
    .line 571
    :goto_11
    invoke-virtual {v1}, LU1/z;->w()V

    .line 572
    .line 573
    .line 574
    return v3

    .line 575
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final i(J)J
    .locals 7

    .line 1
    iget-object v0, p0, LU1/z;->s:LU1/G;

    .line 2
    .line 3
    iget-object v0, v0, LU1/G;->k:LU1/E;

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-wide v1

    .line 10
    :cond_0
    iget-wide v3, p0, LU1/z;->P:J

    .line 11
    .line 12
    iget-wide v5, v0, LU1/E;->p:J

    .line 13
    .line 14
    sub-long/2addr v3, v5

    .line 15
    sub-long/2addr p1, v3

    .line 16
    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    return-wide p1
.end method

.method public final i0()V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LU1/z;->s:LU1/G;

    .line 4
    .line 5
    iget-object v1, v1, LU1/G;->k:LU1/E;

    .line 6
    .line 7
    iget-boolean v2, v0, LU1/z;->H:Z

    .line 8
    .line 9
    if-nez v2, :cond_1

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, v1, LU1/E;->a:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-interface {v1}, Lk2/f0;->e()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    :goto_0
    move v11, v1

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    :goto_1
    const/4 v1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :goto_2
    iget-object v1, v0, LU1/z;->A:LU1/P;

    .line 28
    .line 29
    iget-boolean v2, v1, LU1/P;->g:Z

    .line 30
    .line 31
    if-eq v11, v2, :cond_2

    .line 32
    .line 33
    new-instance v2, LU1/P;

    .line 34
    .line 35
    iget-object v3, v1, LU1/P;->a:LN1/N;

    .line 36
    .line 37
    iget-object v4, v1, LU1/P;->b:Lk2/H;

    .line 38
    .line 39
    iget-wide v5, v1, LU1/P;->c:J

    .line 40
    .line 41
    iget-wide v7, v1, LU1/P;->d:J

    .line 42
    .line 43
    iget v9, v1, LU1/P;->e:I

    .line 44
    .line 45
    iget-object v10, v1, LU1/P;->f:LU1/j;

    .line 46
    .line 47
    iget-object v12, v1, LU1/P;->h:Lk2/n0;

    .line 48
    .line 49
    iget-object v13, v1, LU1/P;->i:Ln2/t;

    .line 50
    .line 51
    iget-object v14, v1, LU1/P;->j:Ljava/util/List;

    .line 52
    .line 53
    iget-object v15, v1, LU1/P;->k:Lk2/H;

    .line 54
    .line 55
    move-object/from16 v16, v2

    .line 56
    .line 57
    iget-boolean v2, v1, LU1/P;->l:Z

    .line 58
    .line 59
    move/from16 v17, v2

    .line 60
    .line 61
    iget v2, v1, LU1/P;->m:I

    .line 62
    .line 63
    move/from16 v18, v2

    .line 64
    .line 65
    iget v2, v1, LU1/P;->n:I

    .line 66
    .line 67
    move/from16 v19, v2

    .line 68
    .line 69
    iget-object v2, v1, LU1/P;->o:LN1/F;

    .line 70
    .line 71
    move-object/from16 v21, v2

    .line 72
    .line 73
    move-object/from16 v20, v3

    .line 74
    .line 75
    iget-wide v2, v1, LU1/P;->q:J

    .line 76
    .line 77
    move-wide/from16 v22, v2

    .line 78
    .line 79
    iget-wide v2, v1, LU1/P;->r:J

    .line 80
    .line 81
    move-wide/from16 v24, v2

    .line 82
    .line 83
    iget-wide v2, v1, LU1/P;->s:J

    .line 84
    .line 85
    move-wide/from16 v26, v2

    .line 86
    .line 87
    iget-wide v2, v1, LU1/P;->t:J

    .line 88
    .line 89
    iget-boolean v1, v1, LU1/P;->p:Z

    .line 90
    .line 91
    move/from16 v28, v1

    .line 92
    .line 93
    move-wide/from16 v29, v2

    .line 94
    .line 95
    move-object/from16 v2, v16

    .line 96
    .line 97
    move/from16 v16, v17

    .line 98
    .line 99
    move/from16 v17, v18

    .line 100
    .line 101
    move/from16 v18, v19

    .line 102
    .line 103
    move-object/from16 v3, v20

    .line 104
    .line 105
    move-object/from16 v19, v21

    .line 106
    .line 107
    move-wide/from16 v20, v22

    .line 108
    .line 109
    move-wide/from16 v22, v24

    .line 110
    .line 111
    move-wide/from16 v24, v26

    .line 112
    .line 113
    move-wide/from16 v26, v29

    .line 114
    .line 115
    invoke-direct/range {v2 .. v28}, LU1/P;-><init>(LN1/N;Lk2/H;JJILU1/j;ZLk2/n0;Ln2/t;Ljava/util/List;Lk2/H;ZIILN1/F;JJJJZ)V

    .line 116
    .line 117
    .line 118
    iput-object v2, v0, LU1/z;->A:LU1/P;

    .line 119
    .line 120
    :cond_2
    return-void
.end method

.method public final j(Lk2/F;)V
    .locals 4

    .line 1
    iget-object v0, p0, LU1/z;->s:LU1/G;

    .line 2
    .line 3
    iget-object v1, v0, LU1/G;->k:LU1/E;

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    iget-object v2, v1, LU1/E;->a:Ljava/lang/Object;

    .line 8
    .line 9
    if-ne v2, p1, :cond_2

    .line 10
    .line 11
    iget-wide v2, p0, LU1/z;->P:J

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object p1, v1, LU1/E;->m:LU1/E;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    invoke-static {p1}, LQ1/k;->g(Z)V

    .line 23
    .line 24
    .line 25
    iget-boolean p1, v1, LU1/E;->e:Z

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, v1, LU1/E;->a:Ljava/lang/Object;

    .line 30
    .line 31
    iget-wide v0, v1, LU1/E;->p:J

    .line 32
    .line 33
    sub-long/2addr v2, v0

    .line 34
    invoke-interface {p1, v2, v3}, Lk2/f0;->o(J)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {p0}, LU1/z;->u()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    iget-object v0, v0, LU1/G;->l:LU1/E;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    iget-object v0, v0, LU1/E;->a:Ljava/lang/Object;

    .line 46
    .line 47
    if-ne v0, p1, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0}, LU1/z;->v()V

    .line 50
    .line 51
    .line 52
    :cond_3
    return-void
.end method

.method public final j0(Ln2/t;)V
    .locals 9

    .line 1
    iget-object v0, p0, LU1/z;->s:LU1/G;

    .line 2
    .line 3
    iget-object v0, v0, LU1/G;->k:LU1/E;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, LU1/E;->d()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-virtual {p0, v1, v2}, LU1/z;->i(J)J

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, LU1/z;->A:LU1/P;

    .line 16
    .line 17
    iget-object v1, v1, LU1/P;->a:LN1/N;

    .line 18
    .line 19
    iget-object v0, v0, LU1/E;->g:LU1/F;

    .line 20
    .line 21
    iget-object v0, v0, LU1/F;->a:Lk2/H;

    .line 22
    .line 23
    invoke-virtual {p0, v1, v0}, LU1/z;->e0(LN1/N;Lk2/H;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, LU1/z;->u:LU1/f;

    .line 30
    .line 31
    iget-wide v0, v0, LU1/f;->m:J

    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, LU1/z;->A:LU1/P;

    .line 34
    .line 35
    iget-object v0, v0, LU1/P;->a:LN1/N;

    .line 36
    .line 37
    iget-object v0, p0, LU1/z;->o:LE5/l;

    .line 38
    .line 39
    invoke-virtual {v0}, LE5/l;->e()LN1/F;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget v0, v0, LN1/F;->a:F

    .line 44
    .line 45
    iget-object v0, p0, LU1/z;->A:LU1/P;

    .line 46
    .line 47
    iget-boolean v0, v0, LU1/P;->l:Z

    .line 48
    .line 49
    iget-object p1, p1, Ln2/t;->c:[Ln2/q;

    .line 50
    .line 51
    iget-object v0, p0, LU1/z;->g:LU1/h;

    .line 52
    .line 53
    iget-object v1, v0, LU1/h;->i:Ljava/util/HashMap;

    .line 54
    .line 55
    iget-object v2, p0, LU1/z;->w:LV1/k;

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, LU1/g;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    const/4 v2, -0x1

    .line 67
    iget v3, v0, LU1/h;->f:I

    .line 68
    .line 69
    if-ne v3, v2, :cond_3

    .line 70
    .line 71
    array-length v2, p1

    .line 72
    const/4 v3, 0x0

    .line 73
    move v4, v3

    .line 74
    move v5, v4

    .line 75
    :goto_0
    const/high16 v6, 0xc80000

    .line 76
    .line 77
    if-ge v4, v2, :cond_2

    .line 78
    .line 79
    aget-object v7, p1, v4

    .line 80
    .line 81
    if-eqz v7, :cond_1

    .line 82
    .line 83
    invoke-interface {v7}, Ln2/q;->g()LN1/O;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    iget v7, v7, LN1/O;->c:I

    .line 88
    .line 89
    const/high16 v8, 0x20000

    .line 90
    .line 91
    packed-switch v7, :pswitch_data_0

    .line 92
    .line 93
    .line 94
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 95
    .line 96
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 97
    .line 98
    .line 99
    throw p1

    .line 100
    :pswitch_0
    move v6, v8

    .line 101
    goto :goto_1

    .line 102
    :pswitch_1
    const/high16 v6, 0x7d00000

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :pswitch_2
    const/high16 v6, 0x89a0000

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :pswitch_3
    move v6, v3

    .line 109
    :goto_1
    :pswitch_4
    add-int/2addr v5, v6

    .line 110
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_2
    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    :cond_3
    iput v3, v1, LU1/g;->b:I

    .line 118
    .line 119
    invoke-virtual {v0}, LU1/h;->d()V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :pswitch_data_0
    .packed-switch -0x2
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final k(Ljava/io/IOException;I)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, LU1/j;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move-object/from16 v3, p1

    .line 7
    .line 8
    move/from16 v4, p2

    .line 9
    .line 10
    invoke-direct {v1, v2, v3, v4}, LU1/j;-><init>(ILjava/lang/Exception;I)V

    .line 11
    .line 12
    .line 13
    iget-object v3, v0, LU1/z;->s:LU1/G;

    .line 14
    .line 15
    iget-object v3, v3, LU1/G;->i:LU1/E;

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    iget-object v3, v3, LU1/E;->g:LU1/F;

    .line 20
    .line 21
    new-instance v4, LU1/j;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    iget-wide v14, v1, LN1/E;->b:J

    .line 32
    .line 33
    iget-boolean v7, v1, LU1/j;->i:Z

    .line 34
    .line 35
    move/from16 v16, v7

    .line 36
    .line 37
    iget v7, v1, LN1/E;->a:I

    .line 38
    .line 39
    iget v8, v1, LU1/j;->c:I

    .line 40
    .line 41
    iget-object v9, v1, LU1/j;->d:Ljava/lang/String;

    .line 42
    .line 43
    iget v10, v1, LU1/j;->e:I

    .line 44
    .line 45
    iget-object v11, v1, LU1/j;->f:LN1/n;

    .line 46
    .line 47
    iget v12, v1, LU1/j;->g:I

    .line 48
    .line 49
    iget-object v13, v3, LU1/F;->a:Lk2/H;

    .line 50
    .line 51
    invoke-direct/range {v4 .. v16}, LU1/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;IILjava/lang/String;ILN1/n;ILk2/H;JZ)V

    .line 52
    .line 53
    .line 54
    move-object v1, v4

    .line 55
    :cond_0
    const-string v3, "ExoPlayerImplInternal"

    .line 56
    .line 57
    const-string v4, "Playback error"

    .line 58
    .line 59
    invoke-static {v3, v4, v1}, LQ1/k;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v2, v2}, LU1/z;->g0(ZZ)V

    .line 63
    .line 64
    .line 65
    iget-object v2, v0, LU1/z;->A:LU1/P;

    .line 66
    .line 67
    invoke-virtual {v2, v1}, LU1/P;->e(LU1/j;)LU1/P;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iput-object v1, v0, LU1/z;->A:LU1/P;

    .line 72
    .line 73
    return-void
.end method

.method public final k0(IILjava/util/List;)V
    .locals 6

    .line 1
    iget-object v0, p0, LU1/z;->B:LT5/s;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, LT5/s;->c(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LU1/z;->t:LE5/n0;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, LE5/n0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-ltz p1, :cond_0

    .line 18
    .line 19
    if-gt p1, p2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-gt p2, v4, :cond_0

    .line 26
    .line 27
    move v4, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v4, v3

    .line 30
    :goto_0
    invoke-static {v4}, LQ1/k;->c(Z)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    sub-int v5, p2, p1

    .line 38
    .line 39
    if-ne v4, v5, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v1, v3

    .line 43
    :goto_1
    invoke-static {v1}, LQ1/k;->c(Z)V

    .line 44
    .line 45
    .line 46
    move v1, p1

    .line 47
    :goto_2
    if-ge v1, p2, :cond_2

    .line 48
    .line 49
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, LU1/O;

    .line 54
    .line 55
    iget-object v4, v4, LU1/O;->a:Lk2/D;

    .line 56
    .line 57
    sub-int v5, v1, p1

    .line 58
    .line 59
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    check-cast v5, LN1/w;

    .line 64
    .line 65
    invoke-virtual {v4, v5}, Lk2/D;->s(LN1/w;)V

    .line 66
    .line 67
    .line 68
    add-int/lit8 v1, v1, 0x1

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    invoke-virtual {v0}, LE5/n0;->e()LN1/N;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p0, p1, v3}, LU1/z;->n(LN1/N;Z)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final l(Lk2/F;)V
    .locals 2

    .line 1
    iget-object v0, p0, LU1/z;->i:LQ1/s;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, LQ1/s;->a(ILjava/lang/Object;)LQ1/r;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, LQ1/r;->b()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final l0()V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v10, 0x3

    .line 4
    const/4 v11, 0x2

    .line 5
    const/4 v12, 0x0

    .line 6
    const/4 v13, 0x1

    .line 7
    iget-object v1, v0, LU1/z;->s:LU1/G;

    .line 8
    .line 9
    iget-object v1, v1, LU1/G;->i:LU1/E;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_c

    .line 14
    .line 15
    :cond_0
    iget-boolean v2, v1, LU1/E;->e:Z

    .line 16
    .line 17
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    iget-object v2, v1, LU1/E;->a:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-interface {v2}, Lk2/F;->f()J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-wide v2, v14

    .line 32
    :goto_0
    cmp-long v4, v2, v14

    .line 33
    .line 34
    const/16 v5, 0x10

    .line 35
    .line 36
    if-eqz v4, :cond_4

    .line 37
    .line 38
    invoke-virtual {v1}, LU1/E;->g()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-nez v4, :cond_2

    .line 43
    .line 44
    iget-object v4, v0, LU1/z;->s:LU1/G;

    .line 45
    .line 46
    invoke-virtual {v4, v1}, LU1/G;->l(LU1/E;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v12}, LU1/z;->m(Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, LU1/z;->u()V

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-virtual {v0, v2, v3}, LU1/z;->I(J)V

    .line 56
    .line 57
    .line 58
    iget-object v1, v0, LU1/z;->A:LU1/P;

    .line 59
    .line 60
    iget-wide v6, v1, LU1/P;->s:J

    .line 61
    .line 62
    cmp-long v1, v2, v6

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    iget-object v1, v0, LU1/z;->A:LU1/P;

    .line 67
    .line 68
    iget-object v4, v1, LU1/P;->b:Lk2/H;

    .line 69
    .line 70
    iget-wide v6, v1, LU1/P;->c:J

    .line 71
    .line 72
    const/4 v8, 0x1

    .line 73
    const/4 v9, 0x5

    .line 74
    move-object/from16 v16, v4

    .line 75
    .line 76
    move v1, v5

    .line 77
    move-wide v4, v6

    .line 78
    move-wide v6, v2

    .line 79
    move-wide/from16 v17, v14

    .line 80
    .line 81
    move v14, v1

    .line 82
    move-object/from16 v1, v16

    .line 83
    .line 84
    invoke-virtual/range {v0 .. v9}, LU1/z;->q(Lk2/H;JJJZI)LU1/P;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iput-object v1, v0, LU1/z;->A:LU1/P;

    .line 89
    .line 90
    goto/16 :goto_7

    .line 91
    .line 92
    :cond_3
    move-wide/from16 v17, v14

    .line 93
    .line 94
    move v14, v5

    .line 95
    goto/16 :goto_7

    .line 96
    .line 97
    :cond_4
    move-wide/from16 v17, v14

    .line 98
    .line 99
    move v14, v5

    .line 100
    iget-object v2, v0, LU1/z;->o:LE5/l;

    .line 101
    .line 102
    iget-object v3, v0, LU1/z;->s:LU1/G;

    .line 103
    .line 104
    iget-object v3, v3, LU1/G;->j:LU1/E;

    .line 105
    .line 106
    if-eq v1, v3, :cond_5

    .line 107
    .line 108
    move v3, v13

    .line 109
    goto :goto_1

    .line 110
    :cond_5
    move v3, v12

    .line 111
    :goto_1
    iget-object v4, v2, LE5/l;->f:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v4, LU1/W;

    .line 114
    .line 115
    iget-object v5, v2, LE5/l;->d:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v5, LA7/a0;

    .line 118
    .line 119
    if-eqz v4, :cond_a

    .line 120
    .line 121
    invoke-interface {v4}, LU1/W;->b()Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-nez v4, :cond_a

    .line 126
    .line 127
    if-eqz v3, :cond_6

    .line 128
    .line 129
    iget-object v4, v2, LE5/l;->f:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v4, LU1/W;

    .line 132
    .line 133
    invoke-interface {v4}, LU1/W;->getState()I

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-ne v4, v11, :cond_a

    .line 138
    .line 139
    :cond_6
    iget-object v4, v2, LE5/l;->f:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v4, LU1/W;

    .line 142
    .line 143
    invoke-interface {v4}, LU1/W;->isReady()Z

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    if-nez v4, :cond_7

    .line 148
    .line 149
    if-nez v3, :cond_a

    .line 150
    .line 151
    iget-object v3, v2, LE5/l;->f:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v3, LU1/W;

    .line 154
    .line 155
    invoke-interface {v3}, LU1/W;->i()Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-eqz v3, :cond_7

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_7
    iget-object v3, v2, LE5/l;->g:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v3, LU1/D;

    .line 165
    .line 166
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-interface {v3}, LU1/D;->g()J

    .line 170
    .line 171
    .line 172
    move-result-wide v6

    .line 173
    iget-boolean v4, v2, LE5/l;->b:Z

    .line 174
    .line 175
    if-eqz v4, :cond_9

    .line 176
    .line 177
    invoke-virtual {v5}, LA7/a0;->g()J

    .line 178
    .line 179
    .line 180
    move-result-wide v8

    .line 181
    cmp-long v4, v6, v8

    .line 182
    .line 183
    if-gez v4, :cond_8

    .line 184
    .line 185
    iget-boolean v3, v5, LA7/a0;->b:Z

    .line 186
    .line 187
    if-eqz v3, :cond_b

    .line 188
    .line 189
    invoke-virtual {v5}, LA7/a0;->g()J

    .line 190
    .line 191
    .line 192
    move-result-wide v3

    .line 193
    invoke-virtual {v5, v3, v4}, LA7/a0;->b(J)V

    .line 194
    .line 195
    .line 196
    iput-boolean v12, v5, LA7/a0;->b:Z

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_8
    iput-boolean v12, v2, LE5/l;->b:Z

    .line 200
    .line 201
    iget-boolean v4, v2, LE5/l;->c:Z

    .line 202
    .line 203
    if-eqz v4, :cond_9

    .line 204
    .line 205
    invoke-virtual {v5}, LA7/a0;->c()V

    .line 206
    .line 207
    .line 208
    :cond_9
    invoke-virtual {v5, v6, v7}, LA7/a0;->b(J)V

    .line 209
    .line 210
    .line 211
    invoke-interface {v3}, LU1/D;->e()LN1/F;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    iget-object v4, v5, LA7/a0;->f:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v4, LN1/F;

    .line 218
    .line 219
    invoke-virtual {v3, v4}, LN1/F;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-nez v4, :cond_b

    .line 224
    .line 225
    invoke-virtual {v5, v3}, LA7/a0;->q(LN1/F;)V

    .line 226
    .line 227
    .line 228
    iget-object v4, v2, LE5/l;->e:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v4, LU1/z;

    .line 231
    .line 232
    iget-object v4, v4, LU1/z;->i:LQ1/s;

    .line 233
    .line 234
    invoke-virtual {v4, v14, v3}, LQ1/s;->a(ILjava/lang/Object;)LQ1/r;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-virtual {v3}, LQ1/r;->b()V

    .line 239
    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_a
    :goto_2
    iput-boolean v13, v2, LE5/l;->b:Z

    .line 243
    .line 244
    iget-boolean v3, v2, LE5/l;->c:Z

    .line 245
    .line 246
    if-eqz v3, :cond_b

    .line 247
    .line 248
    invoke-virtual {v5}, LA7/a0;->c()V

    .line 249
    .line 250
    .line 251
    :cond_b
    :goto_3
    invoke-virtual {v2}, LE5/l;->g()J

    .line 252
    .line 253
    .line 254
    move-result-wide v2

    .line 255
    iput-wide v2, v0, LU1/z;->P:J

    .line 256
    .line 257
    iget-wide v4, v1, LU1/E;->p:J

    .line 258
    .line 259
    sub-long/2addr v2, v4

    .line 260
    iget-object v1, v0, LU1/z;->A:LU1/P;

    .line 261
    .line 262
    iget-wide v4, v1, LU1/P;->s:J

    .line 263
    .line 264
    iget-object v1, v0, LU1/z;->p:Ljava/util/ArrayList;

    .line 265
    .line 266
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-nez v1, :cond_12

    .line 271
    .line 272
    iget-object v1, v0, LU1/z;->A:LU1/P;

    .line 273
    .line 274
    iget-object v1, v1, LU1/P;->b:Lk2/H;

    .line 275
    .line 276
    invoke-virtual {v1}, Lk2/H;->b()Z

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    if-eqz v1, :cond_c

    .line 281
    .line 282
    goto :goto_6

    .line 283
    :cond_c
    iget-boolean v1, v0, LU1/z;->S:Z

    .line 284
    .line 285
    if-eqz v1, :cond_d

    .line 286
    .line 287
    iput-boolean v12, v0, LU1/z;->S:Z

    .line 288
    .line 289
    :cond_d
    iget-object v1, v0, LU1/z;->A:LU1/P;

    .line 290
    .line 291
    iget-object v4, v1, LU1/P;->a:LN1/N;

    .line 292
    .line 293
    iget-object v1, v1, LU1/P;->b:Lk2/H;

    .line 294
    .line 295
    iget-object v1, v1, Lk2/H;->a:Ljava/lang/Object;

    .line 296
    .line 297
    invoke-virtual {v4, v1}, LN1/N;->b(Ljava/lang/Object;)I

    .line 298
    .line 299
    .line 300
    iget v1, v0, LU1/z;->R:I

    .line 301
    .line 302
    iget-object v4, v0, LU1/z;->p:Ljava/util/ArrayList;

    .line 303
    .line 304
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    if-lez v1, :cond_f

    .line 313
    .line 314
    iget-object v4, v0, LU1/z;->p:Ljava/util/ArrayList;

    .line 315
    .line 316
    add-int/lit8 v5, v1, -0x1

    .line 317
    .line 318
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    if-nez v4, :cond_e

    .line 323
    .line 324
    goto :goto_4

    .line 325
    :cond_e
    new-instance v1, Ljava/lang/ClassCastException;

    .line 326
    .line 327
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 328
    .line 329
    .line 330
    throw v1

    .line 331
    :cond_f
    :goto_4
    iget-object v4, v0, LU1/z;->p:Ljava/util/ArrayList;

    .line 332
    .line 333
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 334
    .line 335
    .line 336
    move-result v4

    .line 337
    if-ge v1, v4, :cond_11

    .line 338
    .line 339
    iget-object v4, v0, LU1/z;->p:Ljava/util/ArrayList;

    .line 340
    .line 341
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    if-nez v4, :cond_10

    .line 346
    .line 347
    goto :goto_5

    .line 348
    :cond_10
    new-instance v1, Ljava/lang/ClassCastException;

    .line 349
    .line 350
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 351
    .line 352
    .line 353
    throw v1

    .line 354
    :cond_11
    :goto_5
    iput v1, v0, LU1/z;->R:I

    .line 355
    .line 356
    :cond_12
    :goto_6
    iget-object v1, v0, LU1/z;->o:LE5/l;

    .line 357
    .line 358
    invoke-virtual {v1}, LE5/l;->n()Z

    .line 359
    .line 360
    .line 361
    move-result v1

    .line 362
    if-eqz v1, :cond_13

    .line 363
    .line 364
    iget-object v1, v0, LU1/z;->B:LT5/s;

    .line 365
    .line 366
    iget-boolean v1, v1, LT5/s;->d:Z

    .line 367
    .line 368
    xor-int/lit8 v8, v1, 0x1

    .line 369
    .line 370
    iget-object v1, v0, LU1/z;->A:LU1/P;

    .line 371
    .line 372
    iget-object v4, v1, LU1/P;->b:Lk2/H;

    .line 373
    .line 374
    iget-wide v5, v1, LU1/P;->c:J

    .line 375
    .line 376
    const/4 v9, 0x6

    .line 377
    move-object v1, v4

    .line 378
    move-wide v4, v5

    .line 379
    move-wide v6, v2

    .line 380
    invoke-virtual/range {v0 .. v9}, LU1/z;->q(Lk2/H;JJJZI)LU1/P;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    iput-object v1, v0, LU1/z;->A:LU1/P;

    .line 385
    .line 386
    goto :goto_7

    .line 387
    :cond_13
    iget-object v1, v0, LU1/z;->A:LU1/P;

    .line 388
    .line 389
    iput-wide v2, v1, LU1/P;->s:J

    .line 390
    .line 391
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 392
    .line 393
    .line 394
    move-result-wide v2

    .line 395
    iput-wide v2, v1, LU1/P;->t:J

    .line 396
    .line 397
    :goto_7
    iget-object v1, v0, LU1/z;->s:LU1/G;

    .line 398
    .line 399
    iget-object v1, v1, LU1/G;->k:LU1/E;

    .line 400
    .line 401
    iget-object v2, v0, LU1/z;->A:LU1/P;

    .line 402
    .line 403
    invoke-virtual {v1}, LU1/E;->d()J

    .line 404
    .line 405
    .line 406
    move-result-wide v3

    .line 407
    iput-wide v3, v2, LU1/P;->q:J

    .line 408
    .line 409
    iget-object v1, v0, LU1/z;->A:LU1/P;

    .line 410
    .line 411
    iget-wide v2, v1, LU1/P;->q:J

    .line 412
    .line 413
    invoke-virtual {v0, v2, v3}, LU1/z;->i(J)J

    .line 414
    .line 415
    .line 416
    move-result-wide v2

    .line 417
    iput-wide v2, v1, LU1/P;->r:J

    .line 418
    .line 419
    iget-object v1, v0, LU1/z;->A:LU1/P;

    .line 420
    .line 421
    iget-boolean v2, v1, LU1/P;->l:Z

    .line 422
    .line 423
    if-eqz v2, :cond_1b

    .line 424
    .line 425
    iget v2, v1, LU1/P;->e:I

    .line 426
    .line 427
    if-ne v2, v10, :cond_1b

    .line 428
    .line 429
    iget-object v2, v1, LU1/P;->a:LN1/N;

    .line 430
    .line 431
    iget-object v1, v1, LU1/P;->b:Lk2/H;

    .line 432
    .line 433
    invoke-virtual {v0, v2, v1}, LU1/z;->e0(LN1/N;Lk2/H;)Z

    .line 434
    .line 435
    .line 436
    move-result v1

    .line 437
    if-eqz v1, :cond_1b

    .line 438
    .line 439
    iget-object v1, v0, LU1/z;->A:LU1/P;

    .line 440
    .line 441
    iget-object v2, v1, LU1/P;->o:LN1/F;

    .line 442
    .line 443
    iget v2, v2, LN1/F;->a:F

    .line 444
    .line 445
    const/high16 v3, 0x3f800000    # 1.0f

    .line 446
    .line 447
    cmpl-float v2, v2, v3

    .line 448
    .line 449
    if-nez v2, :cond_1b

    .line 450
    .line 451
    iget-object v2, v0, LU1/z;->u:LU1/f;

    .line 452
    .line 453
    iget-object v4, v1, LU1/P;->a:LN1/N;

    .line 454
    .line 455
    iget-object v5, v1, LU1/P;->b:Lk2/H;

    .line 456
    .line 457
    iget-object v5, v5, Lk2/H;->a:Ljava/lang/Object;

    .line 458
    .line 459
    iget-wide v6, v1, LU1/P;->s:J

    .line 460
    .line 461
    invoke-virtual {v0, v4, v5, v6, v7}, LU1/z;->f(LN1/N;Ljava/lang/Object;J)J

    .line 462
    .line 463
    .line 464
    move-result-wide v4

    .line 465
    iget-object v1, v0, LU1/z;->A:LU1/P;

    .line 466
    .line 467
    iget-wide v6, v1, LU1/P;->r:J

    .line 468
    .line 469
    iget-wide v8, v2, LU1/f;->h:J

    .line 470
    .line 471
    cmp-long v1, v8, v17

    .line 472
    .line 473
    if-nez v1, :cond_14

    .line 474
    .line 475
    move/from16 v16, v12

    .line 476
    .line 477
    goto/16 :goto_b

    .line 478
    .line 479
    :cond_14
    sub-long v6, v4, v6

    .line 480
    .line 481
    iget-wide v8, v2, LU1/f;->r:J

    .line 482
    .line 483
    cmp-long v1, v8, v17

    .line 484
    .line 485
    if-nez v1, :cond_15

    .line 486
    .line 487
    iput-wide v6, v2, LU1/f;->r:J

    .line 488
    .line 489
    const-wide/16 v6, 0x0

    .line 490
    .line 491
    iput-wide v6, v2, LU1/f;->s:J

    .line 492
    .line 493
    move v8, v11

    .line 494
    move/from16 v16, v12

    .line 495
    .line 496
    goto :goto_8

    .line 497
    :cond_15
    iget v1, v2, LU1/f;->g:F

    .line 498
    .line 499
    long-to-float v8, v8

    .line 500
    mul-float/2addr v8, v1

    .line 501
    sub-float v9, v3, v1

    .line 502
    .line 503
    long-to-float v15, v6

    .line 504
    mul-float/2addr v15, v9

    .line 505
    add-float/2addr v15, v8

    .line 506
    move v8, v11

    .line 507
    move/from16 v16, v12

    .line 508
    .line 509
    float-to-long v11, v15

    .line 510
    invoke-static {v6, v7, v11, v12}, Ljava/lang/Math;->max(JJ)J

    .line 511
    .line 512
    .line 513
    move-result-wide v11

    .line 514
    iput-wide v11, v2, LU1/f;->r:J

    .line 515
    .line 516
    sub-long/2addr v6, v11

    .line 517
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(J)J

    .line 518
    .line 519
    .line 520
    move-result-wide v6

    .line 521
    iget-wide v11, v2, LU1/f;->s:J

    .line 522
    .line 523
    long-to-float v11, v11

    .line 524
    mul-float/2addr v1, v11

    .line 525
    long-to-float v6, v6

    .line 526
    mul-float/2addr v9, v6

    .line 527
    add-float/2addr v9, v1

    .line 528
    float-to-long v6, v9

    .line 529
    iput-wide v6, v2, LU1/f;->s:J

    .line 530
    .line 531
    :goto_8
    iget-wide v6, v2, LU1/f;->q:J

    .line 532
    .line 533
    cmp-long v1, v6, v17

    .line 534
    .line 535
    iget-wide v6, v2, LU1/f;->c:J

    .line 536
    .line 537
    if-eqz v1, :cond_16

    .line 538
    .line 539
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 540
    .line 541
    .line 542
    move-result-wide v11

    .line 543
    move v1, v8

    .line 544
    iget-wide v8, v2, LU1/f;->q:J

    .line 545
    .line 546
    sub-long/2addr v11, v8

    .line 547
    cmp-long v8, v11, v6

    .line 548
    .line 549
    if-gez v8, :cond_17

    .line 550
    .line 551
    iget v3, v2, LU1/f;->p:F

    .line 552
    .line 553
    goto/16 :goto_b

    .line 554
    .line 555
    :cond_16
    move v1, v8

    .line 556
    :cond_17
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 557
    .line 558
    .line 559
    move-result-wide v8

    .line 560
    iput-wide v8, v2, LU1/f;->q:J

    .line 561
    .line 562
    iget-wide v8, v2, LU1/f;->r:J

    .line 563
    .line 564
    const-wide/16 v19, 0x3

    .line 565
    .line 566
    iget-wide v11, v2, LU1/f;->s:J

    .line 567
    .line 568
    mul-long v11, v11, v19

    .line 569
    .line 570
    add-long v23, v11, v8

    .line 571
    .line 572
    iget-wide v8, v2, LU1/f;->m:J

    .line 573
    .line 574
    cmp-long v8, v8, v23

    .line 575
    .line 576
    iget v9, v2, LU1/f;->d:F

    .line 577
    .line 578
    if-lez v8, :cond_18

    .line 579
    .line 580
    invoke-static {v6, v7}, LQ1/x;->K(J)J

    .line 581
    .line 582
    .line 583
    move-result-wide v6

    .line 584
    iget v8, v2, LU1/f;->p:F

    .line 585
    .line 586
    sub-float/2addr v8, v3

    .line 587
    long-to-float v6, v6

    .line 588
    mul-float/2addr v8, v6

    .line 589
    float-to-long v7, v8

    .line 590
    iget v11, v2, LU1/f;->n:F

    .line 591
    .line 592
    sub-float/2addr v11, v3

    .line 593
    mul-float/2addr v11, v6

    .line 594
    float-to-long v11, v11

    .line 595
    add-long/2addr v7, v11

    .line 596
    iget-wide v11, v2, LU1/f;->j:J

    .line 597
    .line 598
    move v15, v13

    .line 599
    iget-wide v13, v2, LU1/f;->m:J

    .line 600
    .line 601
    sub-long/2addr v13, v7

    .line 602
    new-array v7, v10, [J

    .line 603
    .line 604
    aput-wide v23, v7, v16

    .line 605
    .line 606
    aput-wide v11, v7, v15

    .line 607
    .line 608
    aput-wide v13, v7, v1

    .line 609
    .line 610
    invoke-static {v7}, LU8/v0;->U([J)J

    .line 611
    .line 612
    .line 613
    move-result-wide v7

    .line 614
    iput-wide v7, v2, LU1/f;->m:J

    .line 615
    .line 616
    goto :goto_9

    .line 617
    :cond_18
    iget v1, v2, LU1/f;->p:F

    .line 618
    .line 619
    sub-float/2addr v1, v3

    .line 620
    const/4 v7, 0x0

    .line 621
    invoke-static {v7, v1}, Ljava/lang/Math;->max(FF)F

    .line 622
    .line 623
    .line 624
    move-result v1

    .line 625
    div-float/2addr v1, v9

    .line 626
    float-to-long v7, v1

    .line 627
    sub-long v19, v4, v7

    .line 628
    .line 629
    iget-wide v7, v2, LU1/f;->m:J

    .line 630
    .line 631
    move-wide/from16 v21, v7

    .line 632
    .line 633
    invoke-static/range {v19 .. v24}, LQ1/x;->j(JJJ)J

    .line 634
    .line 635
    .line 636
    move-result-wide v7

    .line 637
    iput-wide v7, v2, LU1/f;->m:J

    .line 638
    .line 639
    iget-wide v10, v2, LU1/f;->l:J

    .line 640
    .line 641
    cmp-long v1, v10, v17

    .line 642
    .line 643
    if-eqz v1, :cond_19

    .line 644
    .line 645
    cmp-long v1, v7, v10

    .line 646
    .line 647
    if-lez v1, :cond_19

    .line 648
    .line 649
    iput-wide v10, v2, LU1/f;->m:J

    .line 650
    .line 651
    :cond_19
    :goto_9
    iget-wide v7, v2, LU1/f;->m:J

    .line 652
    .line 653
    sub-long/2addr v4, v7

    .line 654
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    .line 655
    .line 656
    .line 657
    move-result-wide v7

    .line 658
    iget-wide v10, v2, LU1/f;->e:J

    .line 659
    .line 660
    cmp-long v1, v7, v10

    .line 661
    .line 662
    if-gez v1, :cond_1a

    .line 663
    .line 664
    iput v3, v2, LU1/f;->p:F

    .line 665
    .line 666
    goto :goto_a

    .line 667
    :cond_1a
    long-to-float v1, v4

    .line 668
    mul-float/2addr v9, v1

    .line 669
    add-float/2addr v9, v3

    .line 670
    iget v1, v2, LU1/f;->o:F

    .line 671
    .line 672
    iget v3, v2, LU1/f;->n:F

    .line 673
    .line 674
    invoke-static {v9, v1, v3}, LQ1/x;->h(FFF)F

    .line 675
    .line 676
    .line 677
    move-result v1

    .line 678
    iput v1, v2, LU1/f;->p:F

    .line 679
    .line 680
    :goto_a
    iget v3, v2, LU1/f;->p:F

    .line 681
    .line 682
    :goto_b
    iget-object v1, v0, LU1/z;->o:LE5/l;

    .line 683
    .line 684
    invoke-virtual {v1}, LE5/l;->e()LN1/F;

    .line 685
    .line 686
    .line 687
    move-result-object v1

    .line 688
    iget v1, v1, LN1/F;->a:F

    .line 689
    .line 690
    cmpl-float v1, v1, v3

    .line 691
    .line 692
    if-eqz v1, :cond_1b

    .line 693
    .line 694
    iget-object v1, v0, LU1/z;->A:LU1/P;

    .line 695
    .line 696
    iget-object v1, v1, LU1/P;->o:LN1/F;

    .line 697
    .line 698
    new-instance v2, LN1/F;

    .line 699
    .line 700
    iget v1, v1, LN1/F;->b:F

    .line 701
    .line 702
    invoke-direct {v2, v3, v1}, LN1/F;-><init>(FF)V

    .line 703
    .line 704
    .line 705
    iget-object v1, v0, LU1/z;->i:LQ1/s;

    .line 706
    .line 707
    const/16 v6, 0x10

    .line 708
    .line 709
    invoke-virtual {v1, v6}, LQ1/s;->d(I)V

    .line 710
    .line 711
    .line 712
    iget-object v1, v0, LU1/z;->o:LE5/l;

    .line 713
    .line 714
    invoke-virtual {v1, v2}, LE5/l;->q(LN1/F;)V

    .line 715
    .line 716
    .line 717
    iget-object v1, v0, LU1/z;->A:LU1/P;

    .line 718
    .line 719
    iget-object v1, v1, LU1/P;->o:LN1/F;

    .line 720
    .line 721
    iget-object v2, v0, LU1/z;->o:LE5/l;

    .line 722
    .line 723
    invoke-virtual {v2}, LE5/l;->e()LN1/F;

    .line 724
    .line 725
    .line 726
    move-result-object v2

    .line 727
    iget v2, v2, LN1/F;->a:F

    .line 728
    .line 729
    move/from16 v3, v16

    .line 730
    .line 731
    invoke-virtual {v0, v1, v2, v3, v3}, LU1/z;->p(LN1/F;FZZ)V

    .line 732
    .line 733
    .line 734
    :cond_1b
    :goto_c
    return-void
.end method

.method public final m(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, LU1/z;->s:LU1/G;

    .line 2
    .line 3
    iget-object v0, v0, LU1/G;->k:LU1/E;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, LU1/z;->A:LU1/P;

    .line 8
    .line 9
    iget-object v1, v1, LU1/P;->b:Lk2/H;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, v0, LU1/E;->g:LU1/F;

    .line 13
    .line 14
    iget-object v1, v1, LU1/F;->a:Lk2/H;

    .line 15
    .line 16
    :goto_0
    iget-object v2, p0, LU1/z;->A:LU1/P;

    .line 17
    .line 18
    iget-object v2, v2, LU1/P;->k:Lk2/H;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Lk2/H;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    iget-object v3, p0, LU1/z;->A:LU1/P;

    .line 27
    .line 28
    invoke-virtual {v3, v1}, LU1/P;->b(Lk2/H;)LU1/P;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, p0, LU1/z;->A:LU1/P;

    .line 33
    .line 34
    :cond_1
    iget-object v1, p0, LU1/z;->A:LU1/P;

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    iget-wide v3, v1, LU1/P;->s:J

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-virtual {v0}, LU1/E;->d()J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    :goto_1
    iput-wide v3, v1, LU1/P;->q:J

    .line 46
    .line 47
    iget-object v1, p0, LU1/z;->A:LU1/P;

    .line 48
    .line 49
    iget-wide v3, v1, LU1/P;->q:J

    .line 50
    .line 51
    invoke-virtual {p0, v3, v4}, LU1/z;->i(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide v3

    .line 55
    iput-wide v3, v1, LU1/P;->r:J

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    :cond_3
    if-eqz v0, :cond_4

    .line 62
    .line 63
    iget-boolean p1, v0, LU1/E;->e:Z

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    iget-object p1, v0, LU1/E;->o:Ln2/t;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, LU1/z;->j0(Ln2/t;)V

    .line 70
    .line 71
    .line 72
    :cond_4
    return-void
.end method

.method public final m0(LN1/N;Lk2/H;LN1/N;Lk2/H;JZ)V
    .locals 8

    .line 1
    invoke-virtual {p0, p1, p2}, LU1/z;->e0(LN1/N;Lk2/H;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p2}, Lk2/H;->b()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    sget-object p1, LN1/F;->d:LN1/F;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p0, LU1/z;->A:LU1/P;

    .line 17
    .line 18
    iget-object p1, p1, LU1/P;->o:LN1/F;

    .line 19
    .line 20
    :goto_0
    iget-object p2, p0, LU1/z;->o:LE5/l;

    .line 21
    .line 22
    invoke-virtual {p2}, LE5/l;->e()LN1/F;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-virtual {p3, p1}, LN1/F;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    if-nez p3, :cond_7

    .line 31
    .line 32
    iget-object p3, p0, LU1/z;->i:LQ1/s;

    .line 33
    .line 34
    const/16 p4, 0x10

    .line 35
    .line 36
    invoke-virtual {p3, p4}, LQ1/s;->d(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, p1}, LE5/l;->q(LN1/F;)V

    .line 40
    .line 41
    .line 42
    iget-object p2, p0, LU1/z;->A:LU1/P;

    .line 43
    .line 44
    iget-object p2, p2, LU1/P;->o:LN1/F;

    .line 45
    .line 46
    iget p1, p1, LN1/F;->a:F

    .line 47
    .line 48
    const/4 p3, 0x0

    .line 49
    invoke-virtual {p0, p2, p1, p3, p3}, LU1/z;->p(LN1/F;FZZ)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    iget-object p2, p2, Lk2/H;->a:Ljava/lang/Object;

    .line 54
    .line 55
    iget-object v0, p0, LU1/z;->m:LN1/L;

    .line 56
    .line 57
    invoke-virtual {p1, p2, v0}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget v1, v1, LN1/L;->c:I

    .line 62
    .line 63
    iget-object v2, p0, LU1/z;->l:LN1/M;

    .line 64
    .line 65
    invoke-virtual {p1, v1, v2}, LN1/N;->n(ILN1/M;)V

    .line 66
    .line 67
    .line 68
    iget-object v1, v2, LN1/M;->j:LN1/s;

    .line 69
    .line 70
    iget-object v3, p0, LU1/z;->u:LU1/f;

    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-wide v4, v1, LN1/s;->a:J

    .line 76
    .line 77
    invoke-static {v4, v5}, LQ1/x;->K(J)J

    .line 78
    .line 79
    .line 80
    move-result-wide v4

    .line 81
    iput-wide v4, v3, LU1/f;->h:J

    .line 82
    .line 83
    iget-wide v4, v1, LN1/s;->b:J

    .line 84
    .line 85
    invoke-static {v4, v5}, LQ1/x;->K(J)J

    .line 86
    .line 87
    .line 88
    move-result-wide v4

    .line 89
    iput-wide v4, v3, LU1/f;->k:J

    .line 90
    .line 91
    iget-wide v4, v1, LN1/s;->c:J

    .line 92
    .line 93
    invoke-static {v4, v5}, LQ1/x;->K(J)J

    .line 94
    .line 95
    .line 96
    move-result-wide v4

    .line 97
    iput-wide v4, v3, LU1/f;->l:J

    .line 98
    .line 99
    iget v4, v1, LN1/s;->d:F

    .line 100
    .line 101
    const v5, -0x800001

    .line 102
    .line 103
    .line 104
    cmpl-float v6, v4, v5

    .line 105
    .line 106
    if-eqz v6, :cond_2

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_2
    iget v4, v3, LU1/f;->a:F

    .line 110
    .line 111
    :goto_1
    iput v4, v3, LU1/f;->o:F

    .line 112
    .line 113
    iget v1, v1, LN1/s;->e:F

    .line 114
    .line 115
    cmpl-float v5, v1, v5

    .line 116
    .line 117
    if-eqz v5, :cond_3

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    iget v1, v3, LU1/f;->b:F

    .line 121
    .line 122
    :goto_2
    iput v1, v3, LU1/f;->n:F

    .line 123
    .line 124
    const/high16 v5, 0x3f800000    # 1.0f

    .line 125
    .line 126
    cmpl-float v4, v4, v5

    .line 127
    .line 128
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    if-nez v4, :cond_4

    .line 134
    .line 135
    cmpl-float v1, v1, v5

    .line 136
    .line 137
    if-nez v1, :cond_4

    .line 138
    .line 139
    iput-wide v6, v3, LU1/f;->h:J

    .line 140
    .line 141
    :cond_4
    invoke-virtual {v3}, LU1/f;->a()V

    .line 142
    .line 143
    .line 144
    cmp-long v1, p5, v6

    .line 145
    .line 146
    if-eqz v1, :cond_5

    .line 147
    .line 148
    invoke-virtual {p0, p1, p2, p5, p6}, LU1/z;->f(LN1/N;Ljava/lang/Object;J)J

    .line 149
    .line 150
    .line 151
    move-result-wide p1

    .line 152
    iput-wide p1, v3, LU1/f;->i:J

    .line 153
    .line 154
    invoke-virtual {v3}, LU1/f;->a()V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_5
    iget-object p1, v2, LN1/M;->a:Ljava/lang/Object;

    .line 159
    .line 160
    invoke-virtual {p3}, LN1/N;->p()Z

    .line 161
    .line 162
    .line 163
    move-result p2

    .line 164
    if-nez p2, :cond_6

    .line 165
    .line 166
    iget-object p2, p4, Lk2/H;->a:Ljava/lang/Object;

    .line 167
    .line 168
    invoke-virtual {p3, p2, v0}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    iget p2, p2, LN1/L;->c:I

    .line 173
    .line 174
    const-wide/16 p4, 0x0

    .line 175
    .line 176
    invoke-virtual {p3, p2, v2, p4, p5}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    iget-object p2, p2, LN1/M;->a:Ljava/lang/Object;

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_6
    const/4 p2, 0x0

    .line 184
    :goto_3
    invoke-static {p2, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-eqz p1, :cond_8

    .line 189
    .line 190
    if-eqz p7, :cond_7

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_7
    return-void

    .line 194
    :cond_8
    :goto_4
    iput-wide v6, v3, LU1/f;->i:J

    .line 195
    .line 196
    invoke-virtual {v3}, LU1/f;->a()V

    .line 197
    .line 198
    .line 199
    return-void
.end method

.method public final n(LN1/N;Z)V
    .locals 34

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 4
    .line 5
    iget-object v3, v1, LU1/z;->O:LU1/y;

    .line 6
    .line 7
    iget-object v9, v1, LU1/z;->s:LU1/G;

    .line 8
    .line 9
    iget v4, v1, LU1/z;->I:I

    .line 10
    .line 11
    iget-boolean v5, v1, LU1/z;->J:Z

    .line 12
    .line 13
    iget-object v2, v1, LU1/z;->l:LN1/M;

    .line 14
    .line 15
    iget-object v8, v1, LU1/z;->m:LN1/L;

    .line 16
    .line 17
    invoke-virtual/range {p1 .. p1}, LN1/N;->p()Z

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    const/4 v15, 0x4

    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    new-instance v16, LE5/M;

    .line 25
    .line 26
    sget-object v17, LU1/P;->u:Lk2/H;

    .line 27
    .line 28
    const/16 v23, 0x1

    .line 29
    .line 30
    const/16 v24, 0x0

    .line 31
    .line 32
    const-wide/16 v18, 0x0

    .line 33
    .line 34
    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    const/16 v22, 0x0

    .line 40
    .line 41
    invoke-direct/range {v16 .. v24}, LE5/M;-><init>(Ljava/lang/Object;JJZZZ)V

    .line 42
    .line 43
    .line 44
    move-object/from16 v2, p1

    .line 45
    .line 46
    move-object/from16 v8, v16

    .line 47
    .line 48
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    goto/16 :goto_15

    .line 54
    .line 55
    :cond_0
    iget-object v6, v0, LU1/P;->b:Lk2/H;

    .line 56
    .line 57
    iget-object v7, v6, Lk2/H;->a:Ljava/lang/Object;

    .line 58
    .line 59
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    iget-object v13, v0, LU1/P;->a:LN1/N;

    .line 65
    .line 66
    invoke-virtual {v13}, LN1/N;->p()Z

    .line 67
    .line 68
    .line 69
    move-result v14

    .line 70
    if-nez v14, :cond_2

    .line 71
    .line 72
    iget-object v14, v6, Lk2/H;->a:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-virtual {v13, v14, v8}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 75
    .line 76
    .line 77
    move-result-object v13

    .line 78
    iget-boolean v13, v13, LN1/L;->f:Z

    .line 79
    .line 80
    if-eqz v13, :cond_1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    const/4 v13, 0x0

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    :goto_0
    const/4 v13, 0x1

    .line 86
    :goto_1
    iget-object v14, v0, LU1/P;->b:Lk2/H;

    .line 87
    .line 88
    invoke-virtual {v14}, Lk2/H;->b()Z

    .line 89
    .line 90
    .line 91
    move-result v14

    .line 92
    if-nez v14, :cond_4

    .line 93
    .line 94
    if-eqz v13, :cond_3

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_3
    iget-wide v10, v0, LU1/P;->s:J

    .line 98
    .line 99
    :goto_2
    move/from16 v20, v13

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_4
    :goto_3
    iget-wide v10, v0, LU1/P;->c:J

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :goto_4
    if-eqz v3, :cond_8

    .line 106
    .line 107
    move-object/from16 v21, v6

    .line 108
    .line 109
    move v6, v5

    .line 110
    move v5, v4

    .line 111
    const/4 v4, 0x1

    .line 112
    move-object v12, v7

    .line 113
    move-object/from16 v14, v21

    .line 114
    .line 115
    move-object v7, v2

    .line 116
    move-object/from16 v2, p1

    .line 117
    .line 118
    invoke-static/range {v2 .. v8}, LU1/z;->K(LN1/N;LU1/y;ZIZLN1/M;LN1/L;)Landroid/util/Pair;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    if-nez v4, :cond_5

    .line 123
    .line 124
    invoke-virtual {v2, v6}, LN1/N;->a(Z)I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    move/from16 v21, v3

    .line 129
    .line 130
    move-wide v4, v10

    .line 131
    move-object v3, v12

    .line 132
    const/4 v6, 0x1

    .line 133
    const/4 v12, 0x0

    .line 134
    const/4 v13, 0x0

    .line 135
    goto :goto_7

    .line 136
    :cond_5
    iget-wide v5, v3, LU1/y;->c:J

    .line 137
    .line 138
    cmp-long v3, v5, v16

    .line 139
    .line 140
    if-nez v3, :cond_6

    .line 141
    .line 142
    iget-object v3, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 143
    .line 144
    invoke-virtual {v2, v3, v8}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    iget v3, v3, LN1/L;->c:I

    .line 149
    .line 150
    move-object v4, v12

    .line 151
    move v12, v3

    .line 152
    move-object v3, v4

    .line 153
    move-wide v4, v10

    .line 154
    const/4 v6, 0x0

    .line 155
    goto :goto_5

    .line 156
    :cond_6
    iget-object v3, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 157
    .line 158
    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v4, Ljava/lang/Long;

    .line 161
    .line 162
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 163
    .line 164
    .line 165
    move-result-wide v4

    .line 166
    const/4 v6, 0x1

    .line 167
    const/4 v12, -0x1

    .line 168
    :goto_5
    iget v13, v0, LU1/P;->e:I

    .line 169
    .line 170
    if-ne v13, v15, :cond_7

    .line 171
    .line 172
    const/4 v13, 0x1

    .line 173
    goto :goto_6

    .line 174
    :cond_7
    const/4 v13, 0x0

    .line 175
    :goto_6
    move/from16 v21, v12

    .line 176
    .line 177
    move v12, v6

    .line 178
    const/4 v6, 0x0

    .line 179
    :goto_7
    move-object v2, v7

    .line 180
    move-object v7, v3

    .line 181
    move-object v3, v2

    .line 182
    move/from16 v30, v6

    .line 183
    .line 184
    move/from16 v31, v12

    .line 185
    .line 186
    move/from16 v29, v13

    .line 187
    .line 188
    move/from16 v2, v21

    .line 189
    .line 190
    const/4 v6, -0x1

    .line 191
    const-wide/16 v12, 0x0

    .line 192
    .line 193
    goto/16 :goto_d

    .line 194
    .line 195
    :cond_8
    move-object v14, v6

    .line 196
    move-object v12, v7

    .line 197
    move-object v7, v2

    .line 198
    move v6, v5

    .line 199
    move-object/from16 v2, p1

    .line 200
    .line 201
    move v5, v4

    .line 202
    iget-object v3, v0, LU1/P;->a:LN1/N;

    .line 203
    .line 204
    invoke-virtual {v3}, LN1/N;->p()Z

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-eqz v3, :cond_9

    .line 209
    .line 210
    invoke-virtual {v2, v6}, LN1/N;->a(Z)I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    move v2, v3

    .line 215
    move-object v3, v7

    .line 216
    move-wide v4, v10

    .line 217
    move-object v7, v12

    .line 218
    :goto_8
    const/4 v6, -0x1

    .line 219
    const-wide/16 v12, 0x0

    .line 220
    .line 221
    :goto_9
    const/16 v29, 0x0

    .line 222
    .line 223
    const/16 v30, 0x0

    .line 224
    .line 225
    :goto_a
    const/16 v31, 0x0

    .line 226
    .line 227
    goto/16 :goto_d

    .line 228
    .line 229
    :cond_9
    invoke-virtual {v2, v12}, LN1/N;->b(Ljava/lang/Object;)I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    const/4 v13, -0x1

    .line 234
    if-ne v3, v13, :cond_b

    .line 235
    .line 236
    move-object v3, v7

    .line 237
    iget-object v7, v0, LU1/P;->a:LN1/N;

    .line 238
    .line 239
    move-object v4, v8

    .line 240
    move-object v8, v2

    .line 241
    move-object v2, v3

    .line 242
    move-object v3, v4

    .line 243
    move v4, v5

    .line 244
    move v5, v6

    .line 245
    move-object v6, v12

    .line 246
    invoke-static/range {v2 .. v8}, LU1/z;->L(LN1/M;LN1/L;IZLjava/lang/Object;LN1/N;LN1/N;)I

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    move-object/from16 v32, v3

    .line 251
    .line 252
    move-object v3, v2

    .line 253
    move-object v2, v8

    .line 254
    move-object/from16 v8, v32

    .line 255
    .line 256
    if-ne v4, v13, :cond_a

    .line 257
    .line 258
    invoke-virtual {v2, v5}, LN1/N;->a(Z)I

    .line 259
    .line 260
    .line 261
    move-result v4

    .line 262
    move v5, v4

    .line 263
    const/4 v4, 0x1

    .line 264
    goto :goto_b

    .line 265
    :cond_a
    move v5, v4

    .line 266
    const/4 v4, 0x0

    .line 267
    :goto_b
    move/from16 v30, v4

    .line 268
    .line 269
    move v2, v5

    .line 270
    move-object v7, v6

    .line 271
    move-wide v4, v10

    .line 272
    const/4 v6, -0x1

    .line 273
    const-wide/16 v12, 0x0

    .line 274
    .line 275
    const/16 v29, 0x0

    .line 276
    .line 277
    goto :goto_a

    .line 278
    :cond_b
    move-object v3, v7

    .line 279
    move-object v6, v12

    .line 280
    cmp-long v4, v10, v16

    .line 281
    .line 282
    if-nez v4, :cond_c

    .line 283
    .line 284
    invoke-virtual {v2, v6, v8}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    iget v4, v4, LN1/L;->c:I

    .line 289
    .line 290
    move v2, v4

    .line 291
    move-object v7, v6

    .line 292
    move-wide v4, v10

    .line 293
    goto :goto_8

    .line 294
    :cond_c
    if-eqz v20, :cond_e

    .line 295
    .line 296
    iget-object v4, v0, LU1/P;->a:LN1/N;

    .line 297
    .line 298
    iget-object v5, v14, Lk2/H;->a:Ljava/lang/Object;

    .line 299
    .line 300
    invoke-virtual {v4, v5, v8}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 301
    .line 302
    .line 303
    iget-object v4, v0, LU1/P;->a:LN1/N;

    .line 304
    .line 305
    iget v5, v8, LN1/L;->c:I

    .line 306
    .line 307
    const-wide/16 v12, 0x0

    .line 308
    .line 309
    invoke-virtual {v4, v5, v3, v12, v13}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    iget v4, v4, LN1/M;->n:I

    .line 314
    .line 315
    iget-object v5, v0, LU1/P;->a:LN1/N;

    .line 316
    .line 317
    iget-object v7, v14, Lk2/H;->a:Ljava/lang/Object;

    .line 318
    .line 319
    invoke-virtual {v5, v7}, LN1/N;->b(Ljava/lang/Object;)I

    .line 320
    .line 321
    .line 322
    move-result v5

    .line 323
    if-ne v4, v5, :cond_d

    .line 324
    .line 325
    iget-wide v4, v8, LN1/L;->e:J

    .line 326
    .line 327
    add-long/2addr v4, v10

    .line 328
    invoke-virtual {v2, v6, v8}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 329
    .line 330
    .line 331
    move-result-object v6

    .line 332
    iget v6, v6, LN1/L;->c:I

    .line 333
    .line 334
    move-wide/from16 v32, v4

    .line 335
    .line 336
    move v5, v6

    .line 337
    move-wide/from16 v6, v32

    .line 338
    .line 339
    move-object v4, v8

    .line 340
    invoke-virtual/range {v2 .. v7}, LN1/N;->i(LN1/M;LN1/L;IJ)Landroid/util/Pair;

    .line 341
    .line 342
    .line 343
    move-result-object v5

    .line 344
    iget-object v7, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 345
    .line 346
    iget-object v2, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v2, Ljava/lang/Long;

    .line 349
    .line 350
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 351
    .line 352
    .line 353
    move-result-wide v4

    .line 354
    goto :goto_c

    .line 355
    :cond_d
    move-object v7, v6

    .line 356
    move-wide v4, v10

    .line 357
    :goto_c
    const/4 v2, -0x1

    .line 358
    const/4 v6, -0x1

    .line 359
    const/16 v29, 0x0

    .line 360
    .line 361
    const/16 v30, 0x0

    .line 362
    .line 363
    const/16 v31, 0x1

    .line 364
    .line 365
    goto :goto_d

    .line 366
    :cond_e
    const-wide/16 v12, 0x0

    .line 367
    .line 368
    move-object v7, v6

    .line 369
    move-wide v4, v10

    .line 370
    const/4 v2, -0x1

    .line 371
    const/4 v6, -0x1

    .line 372
    goto/16 :goto_9

    .line 373
    .line 374
    :goto_d
    if-eq v2, v6, :cond_f

    .line 375
    .line 376
    move/from16 v19, v6

    .line 377
    .line 378
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    move v5, v2

    .line 384
    move-object v4, v8

    .line 385
    move/from16 v8, v19

    .line 386
    .line 387
    move-object/from16 v2, p1

    .line 388
    .line 389
    invoke-virtual/range {v2 .. v7}, LN1/N;->i(LN1/M;LN1/L;IJ)Landroid/util/Pair;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    move-object v6, v4

    .line 394
    iget-object v7, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 395
    .line 396
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v3, Ljava/lang/Long;

    .line 399
    .line 400
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 401
    .line 402
    .line 403
    move-result-wide v4

    .line 404
    move-wide/from16 v27, v16

    .line 405
    .line 406
    goto :goto_e

    .line 407
    :cond_f
    move-object v2, v8

    .line 408
    move v8, v6

    .line 409
    move-object v6, v2

    .line 410
    move-object/from16 v2, p1

    .line 411
    .line 412
    move-wide/from16 v27, v4

    .line 413
    .line 414
    :goto_e
    invoke-virtual {v9, v2, v7, v4, v5}, LU1/G;->n(LN1/N;Ljava/lang/Object;J)Lk2/H;

    .line 415
    .line 416
    .line 417
    move-result-object v3

    .line 418
    iget v9, v3, Lk2/H;->e:I

    .line 419
    .line 420
    if-eq v9, v8, :cond_11

    .line 421
    .line 422
    iget v12, v14, Lk2/H;->e:I

    .line 423
    .line 424
    if-eq v12, v8, :cond_10

    .line 425
    .line 426
    if-lt v9, v12, :cond_10

    .line 427
    .line 428
    goto :goto_f

    .line 429
    :cond_10
    const/4 v8, 0x0

    .line 430
    goto :goto_10

    .line 431
    :cond_11
    :goto_f
    const/4 v8, 0x1

    .line 432
    :goto_10
    iget-object v9, v14, Lk2/H;->a:Ljava/lang/Object;

    .line 433
    .line 434
    invoke-virtual {v9, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v9

    .line 438
    if-eqz v9, :cond_12

    .line 439
    .line 440
    invoke-virtual {v14}, Lk2/H;->b()Z

    .line 441
    .line 442
    .line 443
    move-result v9

    .line 444
    if-nez v9, :cond_12

    .line 445
    .line 446
    invoke-virtual {v3}, Lk2/H;->b()Z

    .line 447
    .line 448
    .line 449
    move-result v9

    .line 450
    if-nez v9, :cond_12

    .line 451
    .line 452
    if-eqz v8, :cond_12

    .line 453
    .line 454
    const/4 v8, 0x1

    .line 455
    goto :goto_11

    .line 456
    :cond_12
    const/4 v8, 0x0

    .line 457
    :goto_11
    invoke-virtual {v2, v7, v6}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 458
    .line 459
    .line 460
    move-result-object v7

    .line 461
    if-nez v20, :cond_15

    .line 462
    .line 463
    cmp-long v9, v10, v27

    .line 464
    .line 465
    if-nez v9, :cond_15

    .line 466
    .line 467
    iget-object v9, v14, Lk2/H;->a:Ljava/lang/Object;

    .line 468
    .line 469
    iget-object v10, v3, Lk2/H;->a:Ljava/lang/Object;

    .line 470
    .line 471
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v9

    .line 475
    if-nez v9, :cond_13

    .line 476
    .line 477
    goto :goto_12

    .line 478
    :cond_13
    invoke-virtual {v14}, Lk2/H;->b()Z

    .line 479
    .line 480
    .line 481
    move-result v9

    .line 482
    if-eqz v9, :cond_14

    .line 483
    .line 484
    iget v9, v14, Lk2/H;->b:I

    .line 485
    .line 486
    invoke-virtual {v7, v9}, LN1/L;->g(I)Z

    .line 487
    .line 488
    .line 489
    :cond_14
    invoke-virtual {v3}, Lk2/H;->b()Z

    .line 490
    .line 491
    .line 492
    move-result v9

    .line 493
    if-eqz v9, :cond_15

    .line 494
    .line 495
    iget v9, v3, Lk2/H;->b:I

    .line 496
    .line 497
    invoke-virtual {v7, v9}, LN1/L;->g(I)Z

    .line 498
    .line 499
    .line 500
    :cond_15
    :goto_12
    if-nez v8, :cond_16

    .line 501
    .line 502
    goto :goto_13

    .line 503
    :cond_16
    move-object v3, v14

    .line 504
    :goto_13
    invoke-virtual {v3}, Lk2/H;->b()Z

    .line 505
    .line 506
    .line 507
    move-result v7

    .line 508
    if-eqz v7, :cond_19

    .line 509
    .line 510
    invoke-virtual {v3, v14}, Lk2/H;->equals(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    move-result v4

    .line 514
    if-eqz v4, :cond_17

    .line 515
    .line 516
    iget-wide v12, v0, LU1/P;->s:J

    .line 517
    .line 518
    move-wide/from16 v25, v12

    .line 519
    .line 520
    goto :goto_14

    .line 521
    :cond_17
    iget-object v0, v3, Lk2/H;->a:Ljava/lang/Object;

    .line 522
    .line 523
    invoke-virtual {v2, v0, v6}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 524
    .line 525
    .line 526
    iget v0, v3, Lk2/H;->c:I

    .line 527
    .line 528
    iget v4, v3, Lk2/H;->b:I

    .line 529
    .line 530
    invoke-virtual {v6, v4}, LN1/L;->e(I)I

    .line 531
    .line 532
    .line 533
    move-result v4

    .line 534
    if-ne v0, v4, :cond_18

    .line 535
    .line 536
    iget-object v0, v6, LN1/L;->g:LN1/b;

    .line 537
    .line 538
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    :cond_18
    const-wide/16 v25, 0x0

    .line 542
    .line 543
    goto :goto_14

    .line 544
    :cond_19
    move-wide/from16 v25, v4

    .line 545
    .line 546
    :goto_14
    new-instance v23, LE5/M;

    .line 547
    .line 548
    move-object/from16 v24, v3

    .line 549
    .line 550
    invoke-direct/range {v23 .. v31}, LE5/M;-><init>(Ljava/lang/Object;JJZZZ)V

    .line 551
    .line 552
    .line 553
    move-object/from16 v8, v23

    .line 554
    .line 555
    :goto_15
    iget-object v0, v8, LE5/M;->f:Ljava/lang/Object;

    .line 556
    .line 557
    move-object v9, v0

    .line 558
    check-cast v9, Lk2/H;

    .line 559
    .line 560
    iget-wide v10, v8, LE5/M;->b:J

    .line 561
    .line 562
    iget-boolean v6, v8, LE5/M;->c:Z

    .line 563
    .line 564
    iget-wide v12, v8, LE5/M;->a:J

    .line 565
    .line 566
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 567
    .line 568
    iget-object v0, v0, LU1/P;->b:Lk2/H;

    .line 569
    .line 570
    invoke-virtual {v0, v9}, Lk2/H;->equals(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move-result v0

    .line 574
    if-eqz v0, :cond_1b

    .line 575
    .line 576
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 577
    .line 578
    iget-wide v3, v0, LU1/P;->s:J

    .line 579
    .line 580
    cmp-long v0, v12, v3

    .line 581
    .line 582
    if-eqz v0, :cond_1a

    .line 583
    .line 584
    goto :goto_16

    .line 585
    :cond_1a
    const/16 v20, 0x0

    .line 586
    .line 587
    goto :goto_17

    .line 588
    :cond_1b
    :goto_16
    const/16 v20, 0x1

    .line 589
    .line 590
    :goto_17
    const/16 v21, 0x3

    .line 591
    .line 592
    :try_start_0
    iget-boolean v0, v8, LE5/M;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 593
    .line 594
    if-eqz v0, :cond_1d

    .line 595
    .line 596
    :try_start_1
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 597
    .line 598
    iget v0, v0, LU1/P;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 599
    .line 600
    const/4 v5, 0x1

    .line 601
    if-eq v0, v5, :cond_1c

    .line 602
    .line 603
    :try_start_2
    invoke-virtual {v1, v15}, LU1/z;->c0(I)V

    .line 604
    .line 605
    .line 606
    :cond_1c
    const/4 v14, 0x0

    .line 607
    goto :goto_19

    .line 608
    :catchall_0
    move-exception v0

    .line 609
    :goto_18
    move-wide v14, v10

    .line 610
    move-object v11, v2

    .line 611
    move-object v2, v9

    .line 612
    move-wide v9, v14

    .line 613
    move/from16 v18, v5

    .line 614
    .line 615
    const/4 v14, 0x2

    .line 616
    const/4 v15, 0x0

    .line 617
    goto/16 :goto_29

    .line 618
    .line 619
    :goto_19
    invoke-virtual {v1, v14, v14, v14, v5}, LU1/z;->G(ZZZZ)V

    .line 620
    .line 621
    .line 622
    goto :goto_1a

    .line 623
    :catchall_1
    move-exception v0

    .line 624
    const/4 v5, 0x1

    .line 625
    goto :goto_18

    .line 626
    :cond_1d
    const/4 v5, 0x1

    .line 627
    :goto_1a
    iget-object v0, v1, LU1/z;->a:[LU1/W;

    .line 628
    .line 629
    array-length v7, v0

    .line 630
    const/4 v3, 0x0

    .line 631
    :goto_1b
    if-ge v3, v7, :cond_1e

    .line 632
    .line 633
    aget-object v4, v0, v3

    .line 634
    .line 635
    invoke-interface {v4, v2}, LU1/W;->l(LN1/N;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 636
    .line 637
    .line 638
    add-int/lit8 v3, v3, 0x1

    .line 639
    .line 640
    goto :goto_1b

    .line 641
    :cond_1e
    if-nez v20, :cond_20

    .line 642
    .line 643
    :try_start_3
    iget-object v2, v1, LU1/z;->s:LU1/G;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 644
    .line 645
    move v3, v5

    .line 646
    :try_start_4
    iget-wide v4, v1, LU1/z;->P:J

    .line 647
    .line 648
    invoke-virtual {v1}, LU1/z;->g()J

    .line 649
    .line 650
    .line 651
    move-result-wide v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 652
    move/from16 v18, v3

    .line 653
    .line 654
    const/4 v14, 0x2

    .line 655
    const/4 v15, 0x0

    .line 656
    move-object/from16 v3, p1

    .line 657
    .line 658
    :try_start_5
    invoke-virtual/range {v2 .. v7}, LU1/G;->q(LN1/N;JJ)Z

    .line 659
    .line 660
    .line 661
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 662
    move-object v7, v3

    .line 663
    if-nez v0, :cond_1f

    .line 664
    .line 665
    const/4 v2, 0x0

    .line 666
    :try_start_6
    invoke-virtual {v1, v2}, LU1/z;->N(Z)V

    .line 667
    .line 668
    .line 669
    :cond_1f
    move-object v2, v9

    .line 670
    goto/16 :goto_22

    .line 671
    .line 672
    :catchall_2
    move-exception v0

    .line 673
    :goto_1c
    move-object v2, v9

    .line 674
    :goto_1d
    move-wide v9, v10

    .line 675
    move-object v11, v7

    .line 676
    goto/16 :goto_29

    .line 677
    .line 678
    :catchall_3
    move-exception v0

    .line 679
    move-object v7, v3

    .line 680
    goto :goto_1c

    .line 681
    :catchall_4
    move-exception v0

    .line 682
    move-object/from16 v7, p1

    .line 683
    .line 684
    move/from16 v18, v3

    .line 685
    .line 686
    :goto_1e
    const/4 v14, 0x2

    .line 687
    const/4 v15, 0x0

    .line 688
    goto :goto_1c

    .line 689
    :catchall_5
    move-exception v0

    .line 690
    move-object/from16 v7, p1

    .line 691
    .line 692
    move/from16 v18, v5

    .line 693
    .line 694
    goto :goto_1e

    .line 695
    :cond_20
    move-object v7, v2

    .line 696
    move/from16 v18, v5

    .line 697
    .line 698
    const/4 v14, 0x2

    .line 699
    const/4 v15, 0x0

    .line 700
    invoke-virtual {v7}, LN1/N;->p()Z

    .line 701
    .line 702
    .line 703
    move-result v0

    .line 704
    if-nez v0, :cond_1f

    .line 705
    .line 706
    iget-object v0, v1, LU1/z;->s:LU1/G;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 707
    .line 708
    :try_start_7
    iget-object v0, v0, LU1/G;->i:LU1/E;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 709
    .line 710
    :goto_1f
    if-eqz v0, :cond_22

    .line 711
    .line 712
    :try_start_8
    iget-object v2, v0, LU1/E;->g:LU1/F;

    .line 713
    .line 714
    iget-object v2, v2, LU1/F;->a:Lk2/H;

    .line 715
    .line 716
    invoke-virtual {v2, v9}, Lk2/H;->equals(Ljava/lang/Object;)Z

    .line 717
    .line 718
    .line 719
    move-result v2

    .line 720
    if-eqz v2, :cond_21

    .line 721
    .line 722
    iget-object v2, v1, LU1/z;->s:LU1/G;

    .line 723
    .line 724
    iget-object v3, v0, LU1/E;->g:LU1/F;

    .line 725
    .line 726
    invoke-virtual {v2, v7, v3}, LU1/G;->g(LN1/N;LU1/F;)LU1/F;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    iput-object v2, v0, LU1/E;->g:LU1/F;

    .line 731
    .line 732
    invoke-virtual {v0}, LU1/E;->k()V

    .line 733
    .line 734
    .line 735
    :cond_21
    iget-object v0, v0, LU1/E;->m:LU1/E;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 736
    .line 737
    goto :goto_1f

    .line 738
    :cond_22
    :try_start_9
    iget-object v0, v1, LU1/z;->s:LU1/G;

    .line 739
    .line 740
    iget-object v2, v0, LU1/G;->i:LU1/E;

    .line 741
    .line 742
    iget-object v0, v0, LU1/G;->j:LU1/E;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 743
    .line 744
    if-eq v2, v0, :cond_23

    .line 745
    .line 746
    move/from16 v5, v18

    .line 747
    .line 748
    :goto_20
    move-object v2, v9

    .line 749
    move-wide v3, v12

    .line 750
    goto :goto_21

    .line 751
    :cond_23
    const/4 v5, 0x0

    .line 752
    goto :goto_20

    .line 753
    :goto_21
    :try_start_a
    invoke-virtual/range {v1 .. v6}, LU1/z;->P(Lk2/H;JZZ)J

    .line 754
    .line 755
    .line 756
    move-result-wide v12
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 757
    goto :goto_22

    .line 758
    :catchall_6
    move-exception v0

    .line 759
    move-wide v12, v3

    .line 760
    goto :goto_1d

    .line 761
    :catchall_7
    move-exception v0

    .line 762
    goto :goto_1c

    .line 763
    :goto_22
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 764
    .line 765
    iget-object v4, v0, LU1/P;->a:LN1/N;

    .line 766
    .line 767
    iget-object v5, v0, LU1/P;->b:Lk2/H;

    .line 768
    .line 769
    iget-boolean v0, v8, LE5/M;->e:Z

    .line 770
    .line 771
    if-eqz v0, :cond_24

    .line 772
    .line 773
    move-wide v6, v12

    .line 774
    goto :goto_23

    .line 775
    :cond_24
    move-wide/from16 v6, v16

    .line 776
    .line 777
    :goto_23
    const/4 v8, 0x0

    .line 778
    move-object v3, v2

    .line 779
    move-object/from16 v2, p1

    .line 780
    .line 781
    invoke-virtual/range {v1 .. v8}, LU1/z;->m0(LN1/N;Lk2/H;LN1/N;Lk2/H;JZ)V

    .line 782
    .line 783
    .line 784
    if-nez v20, :cond_26

    .line 785
    .line 786
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 787
    .line 788
    iget-wide v4, v0, LU1/P;->c:J

    .line 789
    .line 790
    cmp-long v0, v10, v4

    .line 791
    .line 792
    if-eqz v0, :cond_25

    .line 793
    .line 794
    goto :goto_24

    .line 795
    :cond_25
    move-object v11, v2

    .line 796
    goto :goto_28

    .line 797
    :cond_26
    :goto_24
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 798
    .line 799
    iget-object v4, v0, LU1/P;->b:Lk2/H;

    .line 800
    .line 801
    iget-object v4, v4, Lk2/H;->a:Ljava/lang/Object;

    .line 802
    .line 803
    iget-object v0, v0, LU1/P;->a:LN1/N;

    .line 804
    .line 805
    if-eqz v20, :cond_27

    .line 806
    .line 807
    if-eqz p2, :cond_27

    .line 808
    .line 809
    invoke-virtual {v0}, LN1/N;->p()Z

    .line 810
    .line 811
    .line 812
    move-result v5

    .line 813
    if-nez v5, :cond_27

    .line 814
    .line 815
    iget-object v5, v1, LU1/z;->m:LN1/L;

    .line 816
    .line 817
    invoke-virtual {v0, v4, v5}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    iget-boolean v0, v0, LN1/L;->f:Z

    .line 822
    .line 823
    if-nez v0, :cond_27

    .line 824
    .line 825
    move/from16 v9, v18

    .line 826
    .line 827
    goto :goto_25

    .line 828
    :cond_27
    const/4 v9, 0x0

    .line 829
    :goto_25
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 830
    .line 831
    iget-wide v7, v0, LU1/P;->d:J

    .line 832
    .line 833
    invoke-virtual {v2, v4}, LN1/N;->b(Ljava/lang/Object;)I

    .line 834
    .line 835
    .line 836
    move-result v0

    .line 837
    const/4 v6, -0x1

    .line 838
    if-ne v0, v6, :cond_28

    .line 839
    .line 840
    move-wide v5, v10

    .line 841
    const/4 v10, 0x4

    .line 842
    :goto_26
    move-object v11, v2

    .line 843
    move-object v2, v3

    .line 844
    move-wide v3, v12

    .line 845
    goto :goto_27

    .line 846
    :cond_28
    move-wide v5, v10

    .line 847
    move/from16 v10, v21

    .line 848
    .line 849
    goto :goto_26

    .line 850
    :goto_27
    invoke-virtual/range {v1 .. v10}, LU1/z;->q(Lk2/H;JJJZI)LU1/P;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    iput-object v0, v1, LU1/z;->A:LU1/P;

    .line 855
    .line 856
    :goto_28
    invoke-virtual {v1}, LU1/z;->H()V

    .line 857
    .line 858
    .line 859
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 860
    .line 861
    iget-object v0, v0, LU1/P;->a:LN1/N;

    .line 862
    .line 863
    invoke-virtual {v1, v11, v0}, LU1/z;->J(LN1/N;LN1/N;)V

    .line 864
    .line 865
    .line 866
    iget-object v0, v1, LU1/z;->A:LU1/P;

    .line 867
    .line 868
    invoke-virtual {v0, v11}, LU1/P;->h(LN1/N;)LU1/P;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    iput-object v0, v1, LU1/z;->A:LU1/P;

    .line 873
    .line 874
    invoke-virtual {v11}, LN1/N;->p()Z

    .line 875
    .line 876
    .line 877
    move-result v0

    .line 878
    if-nez v0, :cond_29

    .line 879
    .line 880
    iput-object v15, v1, LU1/z;->O:LU1/y;

    .line 881
    .line 882
    :cond_29
    const/4 v2, 0x0

    .line 883
    invoke-virtual {v1, v2}, LU1/z;->m(Z)V

    .line 884
    .line 885
    .line 886
    iget-object v0, v1, LU1/z;->i:LQ1/s;

    .line 887
    .line 888
    invoke-virtual {v0, v14}, LQ1/s;->e(I)Z

    .line 889
    .line 890
    .line 891
    return-void

    .line 892
    :catchall_8
    move-exception v0

    .line 893
    move-wide v14, v10

    .line 894
    move-object v11, v2

    .line 895
    move-object v2, v9

    .line 896
    move-wide v9, v14

    .line 897
    const/4 v14, 0x2

    .line 898
    const/4 v15, 0x0

    .line 899
    const/16 v18, 0x1

    .line 900
    .line 901
    :goto_29
    iget-object v3, v1, LU1/z;->A:LU1/P;

    .line 902
    .line 903
    iget-object v4, v3, LU1/P;->a:LN1/N;

    .line 904
    .line 905
    iget-object v5, v3, LU1/P;->b:Lk2/H;

    .line 906
    .line 907
    iget-boolean v3, v8, LE5/M;->e:Z

    .line 908
    .line 909
    if-eqz v3, :cond_2a

    .line 910
    .line 911
    move-wide v6, v12

    .line 912
    goto :goto_2a

    .line 913
    :cond_2a
    move-wide/from16 v6, v16

    .line 914
    .line 915
    :goto_2a
    const/4 v8, 0x0

    .line 916
    move-object v3, v2

    .line 917
    move-object v2, v11

    .line 918
    invoke-virtual/range {v1 .. v8}, LU1/z;->m0(LN1/N;Lk2/H;LN1/N;Lk2/H;JZ)V

    .line 919
    .line 920
    .line 921
    move-object v2, v3

    .line 922
    if-nez v20, :cond_2b

    .line 923
    .line 924
    iget-object v3, v1, LU1/z;->A:LU1/P;

    .line 925
    .line 926
    iget-wide v3, v3, LU1/P;->c:J

    .line 927
    .line 928
    cmp-long v3, v9, v3

    .line 929
    .line 930
    if-eqz v3, :cond_2e

    .line 931
    .line 932
    :cond_2b
    iget-object v3, v1, LU1/z;->A:LU1/P;

    .line 933
    .line 934
    iget-object v4, v3, LU1/P;->b:Lk2/H;

    .line 935
    .line 936
    iget-object v4, v4, Lk2/H;->a:Ljava/lang/Object;

    .line 937
    .line 938
    iget-object v3, v3, LU1/P;->a:LN1/N;

    .line 939
    .line 940
    if-eqz v20, :cond_2c

    .line 941
    .line 942
    if-eqz p2, :cond_2c

    .line 943
    .line 944
    invoke-virtual {v3}, LN1/N;->p()Z

    .line 945
    .line 946
    .line 947
    move-result v5

    .line 948
    if-nez v5, :cond_2c

    .line 949
    .line 950
    iget-object v5, v1, LU1/z;->m:LN1/L;

    .line 951
    .line 952
    invoke-virtual {v3, v4, v5}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 953
    .line 954
    .line 955
    move-result-object v3

    .line 956
    iget-boolean v3, v3, LN1/L;->f:Z

    .line 957
    .line 958
    if-nez v3, :cond_2c

    .line 959
    .line 960
    move-wide v5, v9

    .line 961
    move/from16 v9, v18

    .line 962
    .line 963
    goto :goto_2b

    .line 964
    :cond_2c
    move-wide v5, v9

    .line 965
    const/4 v9, 0x0

    .line 966
    :goto_2b
    iget-object v3, v1, LU1/z;->A:LU1/P;

    .line 967
    .line 968
    iget-wide v7, v3, LU1/P;->d:J

    .line 969
    .line 970
    invoke-virtual {v11, v4}, LN1/N;->b(Ljava/lang/Object;)I

    .line 971
    .line 972
    .line 973
    move-result v3

    .line 974
    const/4 v4, -0x1

    .line 975
    if-ne v3, v4, :cond_2d

    .line 976
    .line 977
    const/4 v10, 0x4

    .line 978
    :goto_2c
    move-wide v3, v12

    .line 979
    goto :goto_2d

    .line 980
    :cond_2d
    move/from16 v10, v21

    .line 981
    .line 982
    goto :goto_2c

    .line 983
    :goto_2d
    invoke-virtual/range {v1 .. v10}, LU1/z;->q(Lk2/H;JJJZI)LU1/P;

    .line 984
    .line 985
    .line 986
    move-result-object v2

    .line 987
    iput-object v2, v1, LU1/z;->A:LU1/P;

    .line 988
    .line 989
    :cond_2e
    invoke-virtual {v1}, LU1/z;->H()V

    .line 990
    .line 991
    .line 992
    iget-object v2, v1, LU1/z;->A:LU1/P;

    .line 993
    .line 994
    iget-object v2, v2, LU1/P;->a:LN1/N;

    .line 995
    .line 996
    invoke-virtual {v1, v11, v2}, LU1/z;->J(LN1/N;LN1/N;)V

    .line 997
    .line 998
    .line 999
    iget-object v2, v1, LU1/z;->A:LU1/P;

    .line 1000
    .line 1001
    invoke-virtual {v2, v11}, LU1/P;->h(LN1/N;)LU1/P;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v2

    .line 1005
    iput-object v2, v1, LU1/z;->A:LU1/P;

    .line 1006
    .line 1007
    invoke-virtual {v11}, LN1/N;->p()Z

    .line 1008
    .line 1009
    .line 1010
    move-result v2

    .line 1011
    if-nez v2, :cond_2f

    .line 1012
    .line 1013
    iput-object v15, v1, LU1/z;->O:LU1/y;

    .line 1014
    .line 1015
    :cond_2f
    const/4 v2, 0x0

    .line 1016
    invoke-virtual {v1, v2}, LU1/z;->m(Z)V

    .line 1017
    .line 1018
    .line 1019
    iget-object v2, v1, LU1/z;->i:LQ1/s;

    .line 1020
    .line 1021
    invoke-virtual {v2, v14}, LQ1/s;->e(I)Z

    .line 1022
    .line 1023
    .line 1024
    throw v0
.end method

.method public final n0(ZZ)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LU1/z;->F:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LU1/z;->q:LQ1/q;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    :goto_0
    iput-wide p1, p0, LU1/z;->G:J

    .line 23
    .line 24
    return-void
.end method

.method public final o(Lk2/F;)V
    .locals 12

    .line 1
    iget-object v0, p0, LU1/z;->s:LU1/G;

    .line 2
    .line 3
    iget-object v1, v0, LU1/G;->k:LU1/E;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v4, v1, LU1/E;->a:Ljava/lang/Object;

    .line 10
    .line 11
    if-ne v4, p1, :cond_0

    .line 12
    .line 13
    move v4, v3

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v4, v2

    .line 16
    :goto_0
    iget-object v5, p0, LU1/z;->o:LE5/l;

    .line 17
    .line 18
    if-eqz v4, :cond_3

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-boolean p1, v1, LU1/E;->e:Z

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v5}, LE5/l;->e()LN1/F;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget p1, p1, LN1/F;->a:F

    .line 32
    .line 33
    iget-object v2, p0, LU1/z;->A:LU1/P;

    .line 34
    .line 35
    iget-object v3, v2, LU1/P;->a:LN1/N;

    .line 36
    .line 37
    iget-boolean v2, v2, LU1/P;->l:Z

    .line 38
    .line 39
    invoke-virtual {v1, p1, v3, v2}, LU1/E;->f(FLN1/N;Z)V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object p1, v1, LU1/E;->o:Ln2/t;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, LU1/z;->j0(Ln2/t;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, v0, LU1/G;->i:LU1/E;

    .line 48
    .line 49
    if-ne v1, p1, :cond_2

    .line 50
    .line 51
    iget-object p1, v1, LU1/E;->g:LU1/F;

    .line 52
    .line 53
    iget-wide v2, p1, LU1/F;->b:J

    .line 54
    .line 55
    invoke-virtual {p0, v2, v3}, LU1/z;->I(J)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, LU1/z;->a:[LU1/W;

    .line 59
    .line 60
    array-length p1, p1

    .line 61
    new-array p1, p1, [Z

    .line 62
    .line 63
    iget-object v0, v0, LU1/G;->j:LU1/E;

    .line 64
    .line 65
    invoke-virtual {v0}, LU1/E;->e()J

    .line 66
    .line 67
    .line 68
    move-result-wide v2

    .line 69
    invoke-virtual {p0, p1, v2, v3}, LU1/z;->e([ZJ)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, LU1/z;->A:LU1/P;

    .line 73
    .line 74
    iget-object v3, p1, LU1/P;->b:Lk2/H;

    .line 75
    .line 76
    iget-object v0, v1, LU1/E;->g:LU1/F;

    .line 77
    .line 78
    const/4 v11, 0x5

    .line 79
    iget-wide v6, p1, LU1/P;->c:J

    .line 80
    .line 81
    iget-wide v4, v0, LU1/F;->b:J

    .line 82
    .line 83
    const/4 v10, 0x0

    .line 84
    move-wide v8, v4

    .line 85
    move-object v2, p0

    .line 86
    invoke-virtual/range {v2 .. v11}, LU1/z;->q(Lk2/H;JJJZI)LU1/P;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    move-object v1, v2

    .line 91
    iput-object p1, v1, LU1/z;->A:LU1/P;

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    move-object v1, p0

    .line 95
    :goto_1
    invoke-virtual {p0}, LU1/z;->u()V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_3
    move-object v1, p0

    .line 100
    :goto_2
    iget-object v4, v0, LU1/G;->p:Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-ge v2, v4, :cond_5

    .line 107
    .line 108
    iget-object v4, v0, LU1/G;->p:Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    check-cast v4, LU1/E;

    .line 115
    .line 116
    iget-object v6, v4, LU1/E;->a:Ljava/lang/Object;

    .line 117
    .line 118
    if-ne v6, p1, :cond_4

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_5
    const/4 v4, 0x0

    .line 125
    :goto_3
    if-eqz v4, :cond_6

    .line 126
    .line 127
    iget-boolean v2, v4, LU1/E;->e:Z

    .line 128
    .line 129
    xor-int/2addr v2, v3

    .line 130
    invoke-static {v2}, LQ1/k;->g(Z)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5}, LE5/l;->e()LN1/F;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    iget v2, v2, LN1/F;->a:F

    .line 138
    .line 139
    iget-object v3, v1, LU1/z;->A:LU1/P;

    .line 140
    .line 141
    iget-object v5, v3, LU1/P;->a:LN1/N;

    .line 142
    .line 143
    iget-boolean v3, v3, LU1/P;->l:Z

    .line 144
    .line 145
    invoke-virtual {v4, v2, v5, v3}, LU1/E;->f(FLN1/N;Z)V

    .line 146
    .line 147
    .line 148
    iget-object v0, v0, LU1/G;->l:LU1/E;

    .line 149
    .line 150
    if-eqz v0, :cond_6

    .line 151
    .line 152
    iget-object v0, v0, LU1/E;->a:Ljava/lang/Object;

    .line 153
    .line 154
    if-ne v0, p1, :cond_6

    .line 155
    .line 156
    invoke-virtual {p0}, LU1/z;->v()V

    .line 157
    .line 158
    .line 159
    :cond_6
    return-void
.end method

.method public final declared-synchronized o0(LE5/J;J)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LU1/z;->q:LQ1/q;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    add-long/2addr v0, p2

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    invoke-virtual {p1}, LE5/J;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    const-wide/16 v3, 0x0

    .line 26
    .line 27
    cmp-long v3, p2, v3

    .line 28
    .line 29
    if-lez v3, :cond_0

    .line 30
    .line 31
    :try_start_1
    iget-object v3, p0, LU1/z;->q:LQ1/q;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p2, p3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_2

    .line 42
    :catch_0
    const/4 p2, 0x1

    .line 43
    move v2, p2

    .line 44
    :goto_1
    :try_start_2
    iget-object p2, p0, LU1/z;->q:LQ1/q;

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 50
    .line 51
    .line 52
    move-result-wide p2

    .line 53
    sub-long p2, v0, p2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    if-eqz v2, :cond_1

    .line 57
    .line 58
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    .line 64
    .line 65
    :cond_1
    monitor-exit p0

    .line 66
    return-void

    .line 67
    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 68
    throw p1
.end method

.method public final p(LN1/F;FZZ)V
    .locals 4

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, LU1/z;->B:LT5/s;

    .line 6
    .line 7
    const/4 p4, 0x1

    .line 8
    invoke-virtual {p3, p4}, LT5/s;->c(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p3, p0, LU1/z;->A:LU1/P;

    .line 12
    .line 13
    invoke-virtual {p3, p1}, LU1/P;->f(LN1/F;)LU1/P;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    iput-object p3, p0, LU1/z;->A:LU1/P;

    .line 18
    .line 19
    :cond_1
    iget p3, p1, LN1/F;->a:F

    .line 20
    .line 21
    iget-object p4, p0, LU1/z;->s:LU1/G;

    .line 22
    .line 23
    iget-object p4, p4, LU1/G;->i:LU1/E;

    .line 24
    .line 25
    :goto_0
    const/4 v0, 0x0

    .line 26
    if-eqz p4, :cond_4

    .line 27
    .line 28
    iget-object v1, p4, LU1/E;->o:Ln2/t;

    .line 29
    .line 30
    iget-object v1, v1, Ln2/t;->c:[Ln2/q;

    .line 31
    .line 32
    array-length v2, v1

    .line 33
    :goto_1
    if-ge v0, v2, :cond_3

    .line 34
    .line 35
    aget-object v3, v1, v0

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    invoke-interface {v3, p3}, Ln2/q;->d(F)V

    .line 40
    .line 41
    .line 42
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    iget-object p4, p4, LU1/E;->m:LU1/E;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    iget-object p3, p0, LU1/z;->a:[LU1/W;

    .line 49
    .line 50
    array-length p4, p3

    .line 51
    :goto_2
    if-ge v0, p4, :cond_6

    .line 52
    .line 53
    aget-object v1, p3, v0

    .line 54
    .line 55
    if-eqz v1, :cond_5

    .line 56
    .line 57
    iget v2, p1, LN1/F;->a:F

    .line 58
    .line 59
    invoke-interface {v1, p2, v2}, LU1/W;->t(FF)V

    .line 60
    .line 61
    .line 62
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_6
    return-void
.end method

.method public final q(Lk2/H;JJJZI)LU1/P;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-wide/from16 v5, p4

    .line 6
    .line 7
    move/from16 v1, p9

    .line 8
    .line 9
    iget-boolean v3, v0, LU1/z;->S:Z

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    iget-object v3, v0, LU1/z;->A:LU1/P;

    .line 15
    .line 16
    iget-wide v8, v3, LU1/P;->s:J

    .line 17
    .line 18
    cmp-long v3, p2, v8

    .line 19
    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    iget-object v3, v0, LU1/z;->A:LU1/P;

    .line 23
    .line 24
    iget-object v3, v3, LU1/P;->b:Lk2/H;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Lk2/H;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v3, v4

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    const/4 v3, 0x1

    .line 36
    :goto_1
    iput-boolean v3, v0, LU1/z;->S:Z

    .line 37
    .line 38
    invoke-virtual {v0}, LU1/z;->H()V

    .line 39
    .line 40
    .line 41
    iget-object v3, v0, LU1/z;->A:LU1/P;

    .line 42
    .line 43
    iget-object v8, v3, LU1/P;->h:Lk2/n0;

    .line 44
    .line 45
    iget-object v9, v3, LU1/P;->i:Ln2/t;

    .line 46
    .line 47
    iget-object v10, v3, LU1/P;->j:Ljava/util/List;

    .line 48
    .line 49
    iget-object v11, v0, LU1/z;->t:LE5/n0;

    .line 50
    .line 51
    iget-boolean v11, v11, LE5/n0;->g:Z

    .line 52
    .line 53
    if-eqz v11, :cond_10

    .line 54
    .line 55
    iget-object v3, v0, LU1/z;->s:LU1/G;

    .line 56
    .line 57
    iget-object v3, v3, LU1/G;->i:LU1/E;

    .line 58
    .line 59
    if-nez v3, :cond_2

    .line 60
    .line 61
    sget-object v8, Lk2/n0;->d:Lk2/n0;

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    iget-object v8, v3, LU1/E;->n:Lk2/n0;

    .line 65
    .line 66
    :goto_2
    if-nez v3, :cond_3

    .line 67
    .line 68
    iget-object v9, v0, LU1/z;->f:Ln2/t;

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    iget-object v9, v3, LU1/E;->o:Ln2/t;

    .line 72
    .line 73
    :goto_3
    iget-object v10, v9, Ln2/t;->c:[Ln2/q;

    .line 74
    .line 75
    new-instance v11, Ll8/H;

    .line 76
    .line 77
    const/4 v12, 0x4

    .line 78
    invoke-direct {v11, v12}, Ll8/E;-><init>(I)V

    .line 79
    .line 80
    .line 81
    array-length v12, v10

    .line 82
    move v13, v4

    .line 83
    move v14, v13

    .line 84
    :goto_4
    if-ge v13, v12, :cond_6

    .line 85
    .line 86
    aget-object v15, v10, v13

    .line 87
    .line 88
    if-eqz v15, :cond_5

    .line 89
    .line 90
    invoke-interface {v15, v4}, Ln2/q;->b(I)LN1/n;

    .line 91
    .line 92
    .line 93
    move-result-object v15

    .line 94
    iget-object v15, v15, LN1/n;->l:LN1/B;

    .line 95
    .line 96
    if-nez v15, :cond_4

    .line 97
    .line 98
    new-instance v15, LN1/B;

    .line 99
    .line 100
    const/16 v16, 0x1

    .line 101
    .line 102
    new-array v7, v4, [LN1/A;

    .line 103
    .line 104
    invoke-direct {v15, v7}, LN1/B;-><init>([LN1/A;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v11, v15}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_4
    const/16 v16, 0x1

    .line 112
    .line 113
    invoke-virtual {v11, v15}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    move/from16 v14, v16

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_5
    const/16 v16, 0x1

    .line 120
    .line 121
    :goto_5
    add-int/lit8 v13, v13, 0x1

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_6
    const/16 v16, 0x1

    .line 125
    .line 126
    if-eqz v14, :cond_7

    .line 127
    .line 128
    invoke-virtual {v11}, Ll8/H;->g()Ll8/e0;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    :goto_6
    move-object v10, v7

    .line 133
    goto :goto_7

    .line 134
    :cond_7
    sget-object v7, Ll8/K;->b:Ll8/I;

    .line 135
    .line 136
    sget-object v7, Ll8/e0;->e:Ll8/e0;

    .line 137
    .line 138
    goto :goto_6

    .line 139
    :goto_7
    if-eqz v3, :cond_8

    .line 140
    .line 141
    iget-object v7, v3, LU1/E;->g:LU1/F;

    .line 142
    .line 143
    iget-wide v11, v7, LU1/F;->c:J

    .line 144
    .line 145
    cmp-long v11, v11, v5

    .line 146
    .line 147
    if-eqz v11, :cond_8

    .line 148
    .line 149
    invoke-virtual {v7, v5, v6}, LU1/F;->a(J)LU1/F;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    iput-object v7, v3, LU1/E;->g:LU1/F;

    .line 154
    .line 155
    :cond_8
    iget-object v3, v0, LU1/z;->s:LU1/G;

    .line 156
    .line 157
    iget-object v3, v3, LU1/G;->i:LU1/E;

    .line 158
    .line 159
    if-eqz v3, :cond_f

    .line 160
    .line 161
    iget-object v3, v3, LU1/E;->o:Ln2/t;

    .line 162
    .line 163
    move v7, v4

    .line 164
    move v11, v7

    .line 165
    :goto_8
    iget-object v12, v0, LU1/z;->a:[LU1/W;

    .line 166
    .line 167
    array-length v13, v12

    .line 168
    if-ge v7, v13, :cond_c

    .line 169
    .line 170
    invoke-virtual {v3, v7}, Ln2/t;->b(I)Z

    .line 171
    .line 172
    .line 173
    move-result v13

    .line 174
    if-eqz v13, :cond_a

    .line 175
    .line 176
    aget-object v12, v12, v7

    .line 177
    .line 178
    invoke-interface {v12}, LU1/W;->f()I

    .line 179
    .line 180
    .line 181
    move-result v12

    .line 182
    move/from16 v13, v16

    .line 183
    .line 184
    if-eq v12, v13, :cond_9

    .line 185
    .line 186
    move v13, v4

    .line 187
    goto :goto_a

    .line 188
    :cond_9
    iget-object v12, v3, Ln2/t;->b:[LU1/Y;

    .line 189
    .line 190
    aget-object v12, v12, v7

    .line 191
    .line 192
    iget v12, v12, LU1/Y;->a:I

    .line 193
    .line 194
    if-eqz v12, :cond_b

    .line 195
    .line 196
    move v11, v13

    .line 197
    goto :goto_9

    .line 198
    :cond_a
    move/from16 v13, v16

    .line 199
    .line 200
    :cond_b
    :goto_9
    add-int/2addr v7, v13

    .line 201
    move/from16 v16, v13

    .line 202
    .line 203
    goto :goto_8

    .line 204
    :cond_c
    const/4 v13, 0x1

    .line 205
    :goto_a
    if-eqz v11, :cond_d

    .line 206
    .line 207
    if-eqz v13, :cond_d

    .line 208
    .line 209
    const/4 v13, 0x1

    .line 210
    goto :goto_b

    .line 211
    :cond_d
    move v13, v4

    .line 212
    :goto_b
    iget-boolean v3, v0, LU1/z;->M:Z

    .line 213
    .line 214
    if-ne v13, v3, :cond_e

    .line 215
    .line 216
    goto :goto_c

    .line 217
    :cond_e
    iput-boolean v13, v0, LU1/z;->M:Z

    .line 218
    .line 219
    if-nez v13, :cond_f

    .line 220
    .line 221
    iget-object v3, v0, LU1/z;->A:LU1/P;

    .line 222
    .line 223
    iget-boolean v3, v3, LU1/P;->p:Z

    .line 224
    .line 225
    if-eqz v3, :cond_f

    .line 226
    .line 227
    iget-object v3, v0, LU1/z;->i:LQ1/s;

    .line 228
    .line 229
    const/4 v7, 0x2

    .line 230
    invoke-virtual {v3, v7}, LQ1/s;->e(I)Z

    .line 231
    .line 232
    .line 233
    :cond_f
    :goto_c
    move-object v11, v8

    .line 234
    move-object v12, v9

    .line 235
    move-object v13, v10

    .line 236
    goto :goto_d

    .line 237
    :cond_10
    iget-object v3, v3, LU1/P;->b:Lk2/H;

    .line 238
    .line 239
    invoke-virtual {v2, v3}, Lk2/H;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    if-nez v3, :cond_f

    .line 244
    .line 245
    sget-object v8, Lk2/n0;->d:Lk2/n0;

    .line 246
    .line 247
    iget-object v9, v0, LU1/z;->f:Ln2/t;

    .line 248
    .line 249
    sget-object v10, Ll8/e0;->e:Ll8/e0;

    .line 250
    .line 251
    goto :goto_c

    .line 252
    :goto_d
    if-eqz p8, :cond_13

    .line 253
    .line 254
    iget-object v3, v0, LU1/z;->B:LT5/s;

    .line 255
    .line 256
    iget-boolean v7, v3, LT5/s;->d:Z

    .line 257
    .line 258
    if-eqz v7, :cond_12

    .line 259
    .line 260
    iget v7, v3, LT5/s;->f:I

    .line 261
    .line 262
    const/4 v8, 0x5

    .line 263
    if-eq v7, v8, :cond_12

    .line 264
    .line 265
    if-ne v1, v8, :cond_11

    .line 266
    .line 267
    const/4 v4, 0x1

    .line 268
    :cond_11
    invoke-static {v4}, LQ1/k;->c(Z)V

    .line 269
    .line 270
    .line 271
    goto :goto_e

    .line 272
    :cond_12
    const/4 v4, 0x1

    .line 273
    iput-boolean v4, v3, LT5/s;->c:Z

    .line 274
    .line 275
    iput-boolean v4, v3, LT5/s;->d:Z

    .line 276
    .line 277
    iput v1, v3, LT5/s;->f:I

    .line 278
    .line 279
    :cond_13
    :goto_e
    iget-object v1, v0, LU1/z;->A:LU1/P;

    .line 280
    .line 281
    iget-wide v3, v1, LU1/P;->q:J

    .line 282
    .line 283
    invoke-virtual {v0, v3, v4}, LU1/z;->i(J)J

    .line 284
    .line 285
    .line 286
    move-result-wide v9

    .line 287
    move-wide/from16 v3, p2

    .line 288
    .line 289
    move-wide/from16 v7, p6

    .line 290
    .line 291
    invoke-virtual/range {v1 .. v13}, LU1/P;->c(Lk2/H;JJJJLk2/n0;Ln2/t;Ljava/util/List;)LU1/P;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    return-object v1
.end method

.method public final t()Z
    .locals 5

    .line 1
    iget-object v0, p0, LU1/z;->s:LU1/G;

    .line 2
    .line 3
    iget-object v0, v0, LU1/G;->i:LU1/E;

    .line 4
    .line 5
    iget-object v1, v0, LU1/E;->g:LU1/F;

    .line 6
    .line 7
    iget-wide v1, v1, LU1/F;->e:J

    .line 8
    .line 9
    iget-boolean v0, v0, LU1/E;->e:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    cmp-long v0, v1, v3

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, LU1/z;->A:LU1/P;

    .line 23
    .line 24
    iget-wide v3, v0, LU1/P;->s:J

    .line 25
    .line 26
    cmp-long v0, v3, v1

    .line 27
    .line 28
    if-ltz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, LU1/z;->d0()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    :cond_0
    const/4 v0, 0x1

    .line 37
    return v0

    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    return v0
.end method

.method public final u()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LU1/z;->s:LU1/G;

    .line 4
    .line 5
    iget-object v1, v1, LU1/G;->k:LU1/E;

    .line 6
    .line 7
    invoke-static {v1}, LU1/z;->r(LU1/E;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    move v1, v6

    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    :cond_0
    iget-object v1, v0, LU1/z;->s:LU1/G;

    .line 25
    .line 26
    iget-object v1, v1, LU1/G;->k:LU1/E;

    .line 27
    .line 28
    iget-boolean v7, v1, LU1/E;->e:Z

    .line 29
    .line 30
    if-nez v7, :cond_1

    .line 31
    .line 32
    move-wide v7, v4

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object v7, v1, LU1/E;->a:Ljava/lang/Object;

    .line 35
    .line 36
    invoke-interface {v7}, Lk2/f0;->c()J

    .line 37
    .line 38
    .line 39
    move-result-wide v7

    .line 40
    :goto_0
    invoke-virtual {v0, v7, v8}, LU1/z;->i(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v11

    .line 44
    iget-object v7, v0, LU1/z;->s:LU1/G;

    .line 45
    .line 46
    iget-object v7, v7, LU1/G;->i:LU1/E;

    .line 47
    .line 48
    iget-object v7, v0, LU1/z;->A:LU1/P;

    .line 49
    .line 50
    iget-object v7, v7, LU1/P;->a:LN1/N;

    .line 51
    .line 52
    iget-object v1, v1, LU1/E;->g:LU1/F;

    .line 53
    .line 54
    iget-object v1, v1, LU1/F;->a:Lk2/H;

    .line 55
    .line 56
    invoke-virtual {v0, v7, v1}, LU1/z;->e0(LN1/N;Lk2/H;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    iget-object v1, v0, LU1/z;->u:LU1/f;

    .line 63
    .line 64
    iget-wide v7, v1, LU1/f;->m:J

    .line 65
    .line 66
    move-wide v15, v7

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move-wide v15, v2

    .line 69
    :goto_1
    new-instance v9, LU1/A;

    .line 70
    .line 71
    iget-object v10, v0, LU1/z;->w:LV1/k;

    .line 72
    .line 73
    iget-object v1, v0, LU1/z;->A:LU1/P;

    .line 74
    .line 75
    iget-object v1, v1, LU1/P;->a:LN1/N;

    .line 76
    .line 77
    iget-object v1, v0, LU1/z;->o:LE5/l;

    .line 78
    .line 79
    invoke-virtual {v1}, LE5/l;->e()LN1/F;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iget v13, v1, LN1/F;->a:F

    .line 84
    .line 85
    iget-object v1, v0, LU1/z;->A:LU1/P;

    .line 86
    .line 87
    iget-boolean v1, v1, LU1/P;->l:Z

    .line 88
    .line 89
    iget-boolean v14, v0, LU1/z;->F:Z

    .line 90
    .line 91
    invoke-direct/range {v9 .. v16}, LU1/A;-><init>(LV1/k;JFZJ)V

    .line 92
    .line 93
    .line 94
    iget-object v1, v0, LU1/z;->g:LU1/h;

    .line 95
    .line 96
    invoke-virtual {v1, v9}, LU1/h;->c(LU1/A;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    iget-object v7, v0, LU1/z;->s:LU1/G;

    .line 101
    .line 102
    iget-object v7, v7, LU1/G;->i:LU1/E;

    .line 103
    .line 104
    if-nez v1, :cond_4

    .line 105
    .line 106
    iget-boolean v8, v7, LU1/E;->e:Z

    .line 107
    .line 108
    if-eqz v8, :cond_4

    .line 109
    .line 110
    const-wide/32 v13, 0x7a120

    .line 111
    .line 112
    .line 113
    cmp-long v8, v11, v13

    .line 114
    .line 115
    if-gez v8, :cond_4

    .line 116
    .line 117
    iget-wide v10, v0, LU1/z;->n:J

    .line 118
    .line 119
    cmp-long v8, v10, v4

    .line 120
    .line 121
    if-gtz v8, :cond_3

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_3
    iget-object v1, v7, LU1/E;->a:Ljava/lang/Object;

    .line 125
    .line 126
    iget-object v7, v0, LU1/z;->A:LU1/P;

    .line 127
    .line 128
    iget-wide v7, v7, LU1/P;->s:J

    .line 129
    .line 130
    invoke-interface {v1, v7, v8}, Lk2/F;->i(J)V

    .line 131
    .line 132
    .line 133
    iget-object v1, v0, LU1/z;->g:LU1/h;

    .line 134
    .line 135
    invoke-virtual {v1, v9}, LU1/h;->c(LU1/A;)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    :cond_4
    :goto_2
    iput-boolean v1, v0, LU1/z;->H:Z

    .line 140
    .line 141
    if-eqz v1, :cond_a

    .line 142
    .line 143
    iget-object v1, v0, LU1/z;->s:LU1/G;

    .line 144
    .line 145
    iget-object v1, v1, LU1/G;->k:LU1/E;

    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    new-instance v7, LU1/B;

    .line 151
    .line 152
    invoke-direct {v7}, LU1/B;-><init>()V

    .line 153
    .line 154
    .line 155
    iget-wide v8, v0, LU1/z;->P:J

    .line 156
    .line 157
    iget-wide v10, v1, LU1/E;->p:J

    .line 158
    .line 159
    sub-long/2addr v8, v10

    .line 160
    iput-wide v8, v7, LU1/B;->a:J

    .line 161
    .line 162
    iget-object v8, v0, LU1/z;->o:LE5/l;

    .line 163
    .line 164
    invoke-virtual {v8}, LE5/l;->e()LN1/F;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    iget v8, v8, LN1/F;->a:F

    .line 169
    .line 170
    const/4 v9, 0x0

    .line 171
    cmpl-float v9, v8, v9

    .line 172
    .line 173
    const/4 v10, 0x1

    .line 174
    if-gtz v9, :cond_6

    .line 175
    .line 176
    const v9, -0x800001

    .line 177
    .line 178
    .line 179
    cmpl-float v9, v8, v9

    .line 180
    .line 181
    if-nez v9, :cond_5

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_5
    move v9, v6

    .line 185
    goto :goto_4

    .line 186
    :cond_6
    :goto_3
    move v9, v10

    .line 187
    :goto_4
    invoke-static {v9}, LQ1/k;->c(Z)V

    .line 188
    .line 189
    .line 190
    iput v8, v7, LU1/B;->b:F

    .line 191
    .line 192
    iget-wide v8, v0, LU1/z;->G:J

    .line 193
    .line 194
    cmp-long v4, v8, v4

    .line 195
    .line 196
    if-gez v4, :cond_8

    .line 197
    .line 198
    cmp-long v2, v8, v2

    .line 199
    .line 200
    if-nez v2, :cond_7

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_7
    move v2, v6

    .line 204
    goto :goto_6

    .line 205
    :cond_8
    :goto_5
    move v2, v10

    .line 206
    :goto_6
    invoke-static {v2}, LQ1/k;->c(Z)V

    .line 207
    .line 208
    .line 209
    iput-wide v8, v7, LU1/B;->c:J

    .line 210
    .line 211
    new-instance v2, LU1/C;

    .line 212
    .line 213
    invoke-direct {v2, v7}, LU1/C;-><init>(LU1/B;)V

    .line 214
    .line 215
    .line 216
    iget-object v3, v1, LU1/E;->m:LU1/E;

    .line 217
    .line 218
    if-nez v3, :cond_9

    .line 219
    .line 220
    move v6, v10

    .line 221
    :cond_9
    invoke-static {v6}, LQ1/k;->g(Z)V

    .line 222
    .line 223
    .line 224
    iget-object v1, v1, LU1/E;->a:Ljava/lang/Object;

    .line 225
    .line 226
    invoke-interface {v1, v2}, Lk2/f0;->k(LU1/C;)Z

    .line 227
    .line 228
    .line 229
    :cond_a
    invoke-virtual {v0}, LU1/z;->i0()V

    .line 230
    .line 231
    .line 232
    return-void
.end method

.method public final v()V
    .locals 9

    .line 1
    iget-object v0, p0, LU1/z;->s:LU1/G;

    .line 2
    .line 3
    invoke-virtual {v0}, LU1/G;->j()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, LU1/G;->l:LU1/E;

    .line 7
    .line 8
    if-eqz v0, :cond_a

    .line 9
    .line 10
    iget-boolean v1, v0, LU1/E;->d:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-boolean v1, v0, LU1/E;->e:Z

    .line 15
    .line 16
    if-eqz v1, :cond_a

    .line 17
    .line 18
    :cond_0
    iget-object v1, v0, LU1/E;->a:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-interface {v1}, Lk2/f0;->e()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_a

    .line 25
    .line 26
    iget-object v2, p0, LU1/z;->A:LU1/P;

    .line 27
    .line 28
    iget-object v2, v2, LU1/P;->a:LN1/N;

    .line 29
    .line 30
    iget-boolean v2, v0, LU1/E;->e:Z

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-interface {v1}, Lk2/f0;->n()J

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v2, p0, LU1/z;->g:LU1/h;

    .line 38
    .line 39
    iget-object v2, v2, LU1/h;->i:Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, LU1/g;

    .line 60
    .line 61
    iget-boolean v3, v3, LU1/g;->a:Z

    .line 62
    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    goto/16 :goto_5

    .line 66
    .line 67
    :cond_3
    iget-boolean v2, v0, LU1/E;->d:Z

    .line 68
    .line 69
    const/4 v3, 0x1

    .line 70
    if-nez v2, :cond_4

    .line 71
    .line 72
    iget-object v2, v0, LU1/E;->g:LU1/F;

    .line 73
    .line 74
    iput-boolean v3, v0, LU1/E;->d:Z

    .line 75
    .line 76
    iget-wide v2, v2, LU1/F;->b:J

    .line 77
    .line 78
    invoke-interface {v1, p0, v2, v3}, Lk2/F;->q(Lk2/E;J)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_4
    new-instance v2, LU1/B;

    .line 83
    .line 84
    invoke-direct {v2}, LU1/B;-><init>()V

    .line 85
    .line 86
    .line 87
    iget-wide v4, p0, LU1/z;->P:J

    .line 88
    .line 89
    iget-wide v6, v0, LU1/E;->p:J

    .line 90
    .line 91
    sub-long/2addr v4, v6

    .line 92
    iput-wide v4, v2, LU1/B;->a:J

    .line 93
    .line 94
    iget-object v4, p0, LU1/z;->o:LE5/l;

    .line 95
    .line 96
    invoke-virtual {v4}, LE5/l;->e()LN1/F;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    iget v4, v4, LN1/F;->a:F

    .line 101
    .line 102
    const/4 v5, 0x0

    .line 103
    cmpl-float v5, v4, v5

    .line 104
    .line 105
    const/4 v6, 0x0

    .line 106
    if-gtz v5, :cond_6

    .line 107
    .line 108
    const v5, -0x800001

    .line 109
    .line 110
    .line 111
    cmpl-float v5, v4, v5

    .line 112
    .line 113
    if-nez v5, :cond_5

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_5
    move v5, v6

    .line 117
    goto :goto_1

    .line 118
    :cond_6
    :goto_0
    move v5, v3

    .line 119
    :goto_1
    invoke-static {v5}, LQ1/k;->c(Z)V

    .line 120
    .line 121
    .line 122
    iput v4, v2, LU1/B;->b:F

    .line 123
    .line 124
    iget-wide v4, p0, LU1/z;->G:J

    .line 125
    .line 126
    const-wide/16 v7, 0x0

    .line 127
    .line 128
    cmp-long v7, v4, v7

    .line 129
    .line 130
    if-gez v7, :cond_8

    .line 131
    .line 132
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    cmp-long v7, v4, v7

    .line 138
    .line 139
    if-nez v7, :cond_7

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_7
    move v7, v6

    .line 143
    goto :goto_3

    .line 144
    :cond_8
    :goto_2
    move v7, v3

    .line 145
    :goto_3
    invoke-static {v7}, LQ1/k;->c(Z)V

    .line 146
    .line 147
    .line 148
    iput-wide v4, v2, LU1/B;->c:J

    .line 149
    .line 150
    new-instance v4, LU1/C;

    .line 151
    .line 152
    invoke-direct {v4, v2}, LU1/C;-><init>(LU1/B;)V

    .line 153
    .line 154
    .line 155
    iget-object v0, v0, LU1/E;->m:LU1/E;

    .line 156
    .line 157
    if-nez v0, :cond_9

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_9
    move v3, v6

    .line 161
    :goto_4
    invoke-static {v3}, LQ1/k;->g(Z)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v1, v4}, Lk2/f0;->k(LU1/C;)Z

    .line 165
    .line 166
    .line 167
    :cond_a
    :goto_5
    return-void
.end method

.method public final w()V
    .locals 5

    .line 1
    iget-object v0, p0, LU1/z;->B:LT5/s;

    .line 2
    .line 3
    iget-object v1, p0, LU1/z;->A:LU1/P;

    .line 4
    .line 5
    iget-boolean v2, v0, LT5/s;->c:Z

    .line 6
    .line 7
    iget-object v3, v0, LT5/s;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, LU1/P;

    .line 10
    .line 11
    if-eq v3, v1, :cond_0

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v3, 0x0

    .line 16
    :goto_0
    or-int/2addr v2, v3

    .line 17
    iput-boolean v2, v0, LT5/s;->c:Z

    .line 18
    .line 19
    iput-object v1, v0, LT5/s;->e:Ljava/lang/Object;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, LU1/z;->r:LU1/o;

    .line 24
    .line 25
    iget-object v1, v1, LU1/o;->a:LU1/u;

    .line 26
    .line 27
    iget-object v2, v1, LU1/u;->i:LQ1/s;

    .line 28
    .line 29
    new-instance v3, LT3/r;

    .line 30
    .line 31
    const/4 v4, 0x4

    .line 32
    invoke-direct {v3, v4, v1, v0}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v3}, LQ1/s;->c(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    new-instance v0, LT5/s;

    .line 39
    .line 40
    iget-object v1, p0, LU1/z;->A:LU1/P;

    .line 41
    .line 42
    invoke-direct {v0, v1}, LT5/s;-><init>(LU1/P;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, LU1/z;->B:LT5/s;

    .line 46
    .line 47
    :cond_1
    return-void
.end method

.method public final x(I)V
    .locals 10

    .line 1
    iget-object v0, p0, LU1/z;->a:[LU1/W;

    .line 2
    .line 3
    aget-object v1, v0, p1

    .line 4
    .line 5
    :try_start_0
    invoke-interface {v1}, LU1/W;->p()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    move-exception v0

    .line 10
    goto :goto_0

    .line 11
    :catch_1
    move-exception v0

    .line 12
    :goto_0
    invoke-interface {v1}, LU1/W;->f()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x3

    .line 17
    if-eq v1, v2, :cond_1

    .line 18
    .line 19
    const/4 v2, 0x5

    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    throw v0

    .line 24
    :cond_1
    :goto_1
    iget-object v1, p0, LU1/z;->s:LU1/G;

    .line 25
    .line 26
    iget-object v1, v1, LU1/G;->i:LU1/E;

    .line 27
    .line 28
    iget-object v1, v1, LU1/E;->o:Ln2/t;

    .line 29
    .line 30
    new-instance v2, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v3, "Disabling track due to error: "

    .line 33
    .line 34
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v3, v1, Ln2/t;->c:[Ln2/q;

    .line 38
    .line 39
    aget-object v3, v3, p1

    .line 40
    .line 41
    invoke-interface {v3}, Ln2/q;->j()LN1/n;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-static {v3}, LN1/n;->c(LN1/n;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const-string v3, "ExoPlayerImplInternal"

    .line 57
    .line 58
    invoke-static {v3, v2, v0}, LQ1/k;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    new-instance v5, Ln2/t;

    .line 62
    .line 63
    iget-object v0, v1, Ln2/t;->b:[LU1/Y;

    .line 64
    .line 65
    invoke-virtual {v0}, [LU1/Y;->clone()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, [LU1/Y;

    .line 70
    .line 71
    iget-object v2, v1, Ln2/t;->c:[Ln2/q;

    .line 72
    .line 73
    invoke-virtual {v2}, [Ln2/q;->clone()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, [Ln2/q;

    .line 78
    .line 79
    iget-object v3, v1, Ln2/t;->d:LN1/V;

    .line 80
    .line 81
    iget-object v1, v1, Ln2/t;->e:LR1/q;

    .line 82
    .line 83
    invoke-direct {v5, v0, v2, v3, v1}, Ln2/t;-><init>([LU1/Y;[Ln2/q;LN1/V;LR1/q;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, v5, Ln2/t;->b:[LU1/Y;

    .line 87
    .line 88
    const/4 v1, 0x0

    .line 89
    aput-object v1, v0, p1

    .line 90
    .line 91
    iget-object v0, v5, Ln2/t;->c:[Ln2/q;

    .line 92
    .line 93
    aput-object v1, v0, p1

    .line 94
    .line 95
    invoke-virtual {p0, p1}, LU1/z;->c(I)V

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, LU1/z;->s:LU1/G;

    .line 99
    .line 100
    iget-object v4, p1, LU1/G;->i:LU1/E;

    .line 101
    .line 102
    iget-object p1, p0, LU1/z;->A:LU1/P;

    .line 103
    .line 104
    iget-wide v6, p1, LU1/P;->s:J

    .line 105
    .line 106
    iget-object p1, v4, LU1/E;->j:[LU1/X;

    .line 107
    .line 108
    array-length p1, p1

    .line 109
    new-array v9, p1, [Z

    .line 110
    .line 111
    const/4 v8, 0x0

    .line 112
    invoke-virtual/range {v4 .. v9}, LU1/E;->a(Ln2/t;JZ[Z)J

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final y(IZ)V
    .locals 2

    .line 1
    iget-object v0, p0, LU1/z;->d:[Z

    .line 2
    .line 3
    aget-boolean v1, v0, p1

    .line 4
    .line 5
    if-eq v1, p2, :cond_0

    .line 6
    .line 7
    aput-boolean p2, v0, p1

    .line 8
    .line 9
    new-instance v0, LE5/c;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2}, LE5/c;-><init>(LU1/z;IZ)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, LU1/z;->y:LQ1/s;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, LQ1/s;->c(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final z()V
    .locals 2

    .line 1
    iget-object v0, p0, LU1/z;->t:LE5/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, LE5/n0;->e()LN1/N;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {p0, v0, v1}, LU1/z;->n(LN1/N;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
