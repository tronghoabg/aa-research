.class public final LE5/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Lf6/v;


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:I

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:I

.field public J:LE5/N;

.field public K:J

.field public L:I

.field public M:Z

.field public N:LE5/o;

.field public O:J

.field public final a:[LE5/f;

.field public final b:Ljava/util/Set;

.field public final c:[LE5/f;

.field public final d:Lr6/o;

.field public final e:Lr6/s;

.field public final f:LE5/k;

.field public final g:Lt6/e;

.field public final h:Lu6/s;

.field public final i:Landroid/os/HandlerThread;

.field public final j:Landroid/os/Looper;

.field public final k:LE5/I0;

.field public final l:LE5/H0;

.field public final m:J

.field public final n:LE5/l;

.field public final o:Ljava/util/ArrayList;

.field public final p:Lu6/q;

.field public final q:LE5/u;

.field public final r:LE5/i0;

.field public final s:LE5/n0;

.field public final t:LE5/j;

.field public final u:J

.field public v:LE5/C0;

.field public w:LE5/q0;

.field public x:LA6/d;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>([LE5/f;Lr6/o;Lr6/s;LE5/k;Lt6/e;IZLF5/f;LE5/C0;LE5/j;JZLandroid/os/Looper;Lu6/q;LE5/u;LF5/l;)V
    .locals 4

    move-object/from16 v0, p15

    move-object/from16 v1, p17

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v2, p16

    .line 2
    iput-object v2, p0, LE5/O;->q:LE5/u;

    .line 3
    iput-object p1, p0, LE5/O;->a:[LE5/f;

    .line 4
    iput-object p2, p0, LE5/O;->d:Lr6/o;

    .line 5
    iput-object p3, p0, LE5/O;->e:Lr6/s;

    .line 6
    iput-object p4, p0, LE5/O;->f:LE5/k;

    .line 7
    iput-object p5, p0, LE5/O;->g:Lt6/e;

    .line 8
    iput p6, p0, LE5/O;->D:I

    .line 9
    iput-boolean p7, p0, LE5/O;->E:Z

    .line 10
    iput-object p9, p0, LE5/O;->v:LE5/C0;

    .line 11
    iput-object p10, p0, LE5/O;->t:LE5/j;

    move-wide v2, p11

    .line 12
    iput-wide v2, p0, LE5/O;->u:J

    move/from16 v2, p13

    .line 13
    iput-boolean v2, p0, LE5/O;->z:Z

    .line 14
    iput-object v0, p0, LE5/O;->p:Lu6/q;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    iput-wide v2, p0, LE5/O;->O:J

    .line 16
    iget-wide v2, p4, LE5/k;->g:J

    .line 17
    iput-wide v2, p0, LE5/O;->m:J

    .line 18
    invoke-static {p3}, LE5/q0;->h(Lr6/s;)LE5/q0;

    move-result-object p3

    iput-object p3, p0, LE5/O;->w:LE5/q0;

    .line 19
    new-instance p4, LA6/d;

    invoke-direct {p4, p3}, LA6/d;-><init>(LE5/q0;)V

    iput-object p4, p0, LE5/O;->x:LA6/d;

    .line 20
    array-length p3, p1

    new-array p3, p3, [LE5/f;

    iput-object p3, p0, LE5/O;->c:[LE5/f;

    const/4 p3, 0x0

    .line 21
    :goto_0
    array-length p4, p1

    if-ge p3, p4, :cond_0

    .line 22
    aget-object p4, p1, p3

    .line 23
    iput p3, p4, LE5/f;->d:I

    .line 24
    iput-object v1, p4, LE5/f;->e:LF5/l;

    .line 25
    iget-object v2, p0, LE5/O;->c:[LE5/f;

    aput-object p4, v2, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 26
    :cond_0
    new-instance p1, LE5/l;

    invoke-direct {p1, p0, v0}, LE5/l;-><init>(LE5/O;Lu6/q;)V

    iput-object p1, p0, LE5/O;->n:LE5/l;

    .line 27
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LE5/O;->o:Ljava/util/ArrayList;

    .line 28
    invoke-static {}, Ll8/s;->o()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, LE5/O;->b:Ljava/util/Set;

    .line 29
    new-instance p1, LE5/I0;

    invoke-direct {p1}, LE5/I0;-><init>()V

    iput-object p1, p0, LE5/O;->k:LE5/I0;

    .line 30
    new-instance p1, LE5/H0;

    invoke-direct {p1}, LE5/H0;-><init>()V

    iput-object p1, p0, LE5/O;->l:LE5/H0;

    .line 31
    iput-object p0, p2, Lr6/o;->a:LE5/O;

    .line 32
    iput-object p5, p2, Lr6/o;->b:Lt6/e;

    const/4 p1, 0x1

    .line 33
    iput-boolean p1, p0, LE5/O;->M:Z

    .line 34
    new-instance p1, Landroid/os/Handler;

    move-object/from16 p2, p14

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 35
    new-instance p2, LE5/i0;

    invoke-direct {p2, p8, p1}, LE5/i0;-><init>(LF5/f;Landroid/os/Handler;)V

    iput-object p2, p0, LE5/O;->r:LE5/i0;

    .line 36
    new-instance p2, LE5/n0;

    invoke-direct {p2, p0, p8, p1, v1}, LE5/n0;-><init>(LE5/O;LF5/f;Landroid/os/Handler;LF5/l;)V

    iput-object p2, p0, LE5/O;->s:LE5/n0;

    .line 37
    new-instance p1, Landroid/os/HandlerThread;

    const-string p2, "ExoPlayer:Playback"

    const/16 p3, -0x10

    invoke-direct {p1, p2, p3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object p1, p0, LE5/O;->i:Landroid/os/HandlerThread;

    .line 38
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 39
    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p1

    iput-object p1, p0, LE5/O;->j:Landroid/os/Looper;

    .line 40
    invoke-virtual {v0, p1, p0}, Lu6/q;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lu6/s;

    move-result-object p1

    iput-object p1, p0, LE5/O;->h:Lu6/s;

    return-void
.end method

.method public static F(LE5/J0;LE5/N;ZIZLE5/I0;LE5/H0;)Landroid/util/Pair;
    .locals 9

    .line 1
    iget-object v0, p1, LE5/N;->a:LE5/J0;

    .line 2
    .line 3
    invoke-virtual {p0}, LE5/J0;->p()Z

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
    invoke-virtual {v0}, LE5/J0;->p()Z

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
    iget v5, p1, LE5/N;->b:I

    .line 21
    .line 22
    iget-wide v6, p1, LE5/N;->c:J

    .line 23
    .line 24
    move-object v3, p5

    .line 25
    move-object v4, p6

    .line 26
    invoke-virtual/range {v2 .. v7}, LE5/J0;->i(LE5/I0;LE5/H0;IJ)Landroid/util/Pair;

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
    invoke-virtual {p0, v2}, LE5/J0;->equals(Ljava/lang/Object;)Z

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
    invoke-virtual {p0, p6}, LE5/J0;->b(Ljava/lang/Object;)I

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
    invoke-virtual {v2, p2, v5}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iget-boolean p2, p2, LE5/H0;->f:Z

    .line 55
    .line 56
    if-eqz p2, :cond_3

    .line 57
    .line 58
    iget p2, v5, LE5/H0;->c:I

    .line 59
    .line 60
    const-wide/16 p3, 0x0

    .line 61
    .line 62
    invoke-virtual {v2, p2, v4, p3, p4}, LE5/J0;->m(ILE5/I0;J)LE5/I0;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    iget p2, p2, LE5/I0;->n:I

    .line 67
    .line 68
    iget-object p3, p5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {v2, p3}, LE5/J0;->b(Ljava/lang/Object;)I

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
    invoke-virtual {p0, p2, v5}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    iget v6, p2, LE5/H0;->c:I

    .line 83
    .line 84
    iget-wide v7, p1, LE5/N;->c:J

    .line 85
    .line 86
    move-object v3, p0

    .line 87
    invoke-virtual/range {v3 .. v8}, LE5/J0;->i(LE5/I0;LE5/H0;IJ)Landroid/util/Pair;

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
    invoke-static/range {p0 .. p6}, LE5/O;->G(LE5/I0;LE5/H0;IZLjava/lang/Object;LE5/J0;LE5/J0;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    if-eqz p2, :cond_5

    .line 110
    .line 111
    invoke-virtual {v3, p2, v5}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    iget v6, p0, LE5/H0;->c:I

    .line 116
    .line 117
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v3 .. v8}, LE5/J0;->i(LE5/I0;LE5/H0;IJ)Landroid/util/Pair;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    return-object p0

    .line 127
    :catch_0
    :cond_5
    :goto_2
    const/4 p0, 0x0

    .line 128
    return-object p0
.end method

.method public static G(LE5/I0;LE5/H0;IZLjava/lang/Object;LE5/J0;LE5/J0;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-virtual {p5, p4}, LE5/J0;->b(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p4

    .line 5
    invoke-virtual {p5}, LE5/J0;->h()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    move v4, p4

    .line 12
    move p4, v1

    .line 13
    :goto_0
    if-ge v2, v0, :cond_1

    .line 14
    .line 15
    if-ne p4, v1, :cond_1

    .line 16
    .line 17
    move-object v6, p0

    .line 18
    move-object v5, p1

    .line 19
    move v7, p2

    .line 20
    move v8, p3

    .line 21
    move-object v3, p5

    .line 22
    invoke-virtual/range {v3 .. v8}, LE5/J0;->d(ILE5/H0;LE5/I0;IZ)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-ne v4, v1, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-virtual {v3, v4}, LE5/J0;->l(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p6, p0}, LE5/J0;->b(Ljava/lang/Object;)I

    .line 34
    .line 35
    .line 36
    move-result p4

    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    move-object p5, v3

    .line 40
    move-object p1, v5

    .line 41
    move-object p0, v6

    .line 42
    move p2, v7

    .line 43
    move p3, v8

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    :goto_1
    if-ne p4, v1, :cond_2

    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-virtual {p6, p4}, LE5/J0;->l(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public static M(LE5/f;J)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LE5/f;->k:Z

    .line 3
    .line 4
    instance-of v0, p0, Lh6/k;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Lh6/k;

    .line 9
    .line 10
    iget-boolean v0, p0, LE5/f;->k:Z

    .line 11
    .line 12
    invoke-static {v0}, Lu6/a;->i(Z)V

    .line 13
    .line 14
    .line 15
    iput-wide p1, p0, Lh6/k;->A:J

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public static q(LE5/f;)Z
    .locals 0

    .line 1
    iget p0, p0, LE5/f;->f:I

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method


# virtual methods
.method public final A()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LE5/O;->n:LE5/l;

    .line 4
    .line 5
    invoke-virtual {v1}, LE5/l;->e()LE5/r0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v1, v1, LE5/r0;->a:F

    .line 10
    .line 11
    iget-object v2, v0, LE5/O;->r:LE5/i0;

    .line 12
    .line 13
    iget-object v3, v2, LE5/i0;->h:LE5/g0;

    .line 14
    .line 15
    iget-object v2, v2, LE5/i0;->i:LE5/g0;

    .line 16
    .line 17
    const/4 v10, 0x1

    .line 18
    move-object v4, v3

    .line 19
    move v3, v10

    .line 20
    :goto_0
    if-eqz v4, :cond_d

    .line 21
    .line 22
    iget-boolean v5, v4, LE5/g0;->d:Z

    .line 23
    .line 24
    if-nez v5, :cond_0

    .line 25
    .line 26
    goto/16 :goto_7

    .line 27
    .line 28
    :cond_0
    iget-object v5, v0, LE5/O;->w:LE5/q0;

    .line 29
    .line 30
    iget-object v5, v5, LE5/q0;->a:LE5/J0;

    .line 31
    .line 32
    invoke-virtual {v4, v1, v5}, LE5/g0;->g(FLE5/J0;)Lr6/s;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    iget-object v6, v4, LE5/g0;->n:Lr6/s;

    .line 37
    .line 38
    const/4 v7, 0x0

    .line 39
    if-eqz v6, :cond_5

    .line 40
    .line 41
    iget-object v8, v6, Lr6/s;->c:[Lr6/n;

    .line 42
    .line 43
    array-length v8, v8

    .line 44
    iget-object v9, v5, Lr6/s;->c:[Lr6/n;

    .line 45
    .line 46
    array-length v11, v9

    .line 47
    if-eq v8, v11, :cond_1

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    move v8, v7

    .line 51
    :goto_1
    array-length v11, v9

    .line 52
    if-ge v8, v11, :cond_3

    .line 53
    .line 54
    invoke-virtual {v5, v6, v8}, Lr6/s;->a(Lr6/s;I)Z

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    if-nez v11, :cond_2

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    if-ne v4, v2, :cond_4

    .line 65
    .line 66
    move v3, v7

    .line 67
    :cond_4
    iget-object v4, v4, LE5/g0;->l:LE5/g0;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_5
    :goto_2
    const/4 v1, 0x4

    .line 71
    if-eqz v3, :cond_b

    .line 72
    .line 73
    iget-object v2, v0, LE5/O;->r:LE5/i0;

    .line 74
    .line 75
    iget-object v11, v2, LE5/i0;->h:LE5/g0;

    .line 76
    .line 77
    invoke-virtual {v2, v11}, LE5/i0;->k(LE5/g0;)Z

    .line 78
    .line 79
    .line 80
    move-result v15

    .line 81
    iget-object v2, v0, LE5/O;->a:[LE5/f;

    .line 82
    .line 83
    array-length v2, v2

    .line 84
    new-array v2, v2, [Z

    .line 85
    .line 86
    iget-object v3, v0, LE5/O;->w:LE5/q0;

    .line 87
    .line 88
    iget-wide v13, v3, LE5/q0;->r:J

    .line 89
    .line 90
    move-object/from16 v16, v2

    .line 91
    .line 92
    move-object v12, v5

    .line 93
    invoke-virtual/range {v11 .. v16}, LE5/g0;->a(Lr6/s;JZ[Z)J

    .line 94
    .line 95
    .line 96
    move-result-wide v2

    .line 97
    iget-object v4, v0, LE5/O;->w:LE5/q0;

    .line 98
    .line 99
    iget v5, v4, LE5/q0;->e:I

    .line 100
    .line 101
    if-eq v5, v1, :cond_6

    .line 102
    .line 103
    iget-wide v4, v4, LE5/q0;->r:J

    .line 104
    .line 105
    cmp-long v4, v2, v4

    .line 106
    .line 107
    if-eqz v4, :cond_6

    .line 108
    .line 109
    move v8, v10

    .line 110
    goto :goto_3

    .line 111
    :cond_6
    move v8, v7

    .line 112
    :goto_3
    iget-object v4, v0, LE5/O;->w:LE5/q0;

    .line 113
    .line 114
    move v5, v1

    .line 115
    iget-object v1, v4, LE5/q0;->b:Lf6/z;

    .line 116
    .line 117
    iget-wide v12, v4, LE5/q0;->c:J

    .line 118
    .line 119
    iget-wide v14, v4, LE5/q0;->d:J

    .line 120
    .line 121
    const/4 v9, 0x5

    .line 122
    move-wide/from16 v17, v12

    .line 123
    .line 124
    move v13, v5

    .line 125
    move-wide/from16 v4, v17

    .line 126
    .line 127
    move v12, v7

    .line 128
    move-wide v6, v14

    .line 129
    invoke-virtual/range {v0 .. v9}, LE5/O;->o(Lf6/z;JJJZI)LE5/q0;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iput-object v1, v0, LE5/O;->w:LE5/q0;

    .line 134
    .line 135
    if-eqz v8, :cond_7

    .line 136
    .line 137
    invoke-virtual {v0, v2, v3}, LE5/O;->D(J)V

    .line 138
    .line 139
    .line 140
    :cond_7
    iget-object v1, v0, LE5/O;->a:[LE5/f;

    .line 141
    .line 142
    array-length v1, v1

    .line 143
    new-array v1, v1, [Z

    .line 144
    .line 145
    move v7, v12

    .line 146
    :goto_4
    iget-object v2, v0, LE5/O;->a:[LE5/f;

    .line 147
    .line 148
    array-length v3, v2

    .line 149
    if-ge v7, v3, :cond_a

    .line 150
    .line 151
    aget-object v2, v2, v7

    .line 152
    .line 153
    invoke-static {v2}, LE5/O;->q(LE5/f;)Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    aput-boolean v3, v1, v7

    .line 158
    .line 159
    iget-object v4, v11, LE5/g0;->c:[Lf6/V;

    .line 160
    .line 161
    aget-object v4, v4, v7

    .line 162
    .line 163
    if-eqz v3, :cond_9

    .line 164
    .line 165
    iget-object v3, v2, LE5/f;->g:Lf6/V;

    .line 166
    .line 167
    if-eq v4, v3, :cond_8

    .line 168
    .line 169
    invoke-virtual {v0, v2}, LE5/O;->d(LE5/f;)V

    .line 170
    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_8
    aget-boolean v3, v16, v7

    .line 174
    .line 175
    if-eqz v3, :cond_9

    .line 176
    .line 177
    iget-wide v3, v0, LE5/O;->K:J

    .line 178
    .line 179
    iput-boolean v12, v2, LE5/f;->k:Z

    .line 180
    .line 181
    iput-wide v3, v2, LE5/f;->j:J

    .line 182
    .line 183
    invoke-virtual {v2, v3, v4, v12}, LE5/f;->m(JZ)V

    .line 184
    .line 185
    .line 186
    :cond_9
    :goto_5
    add-int/lit8 v7, v7, 0x1

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_a
    invoke-virtual {v0, v1}, LE5/O;->f([Z)V

    .line 190
    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_b
    move v13, v1

    .line 194
    iget-object v1, v0, LE5/O;->r:LE5/i0;

    .line 195
    .line 196
    invoke-virtual {v1, v4}, LE5/i0;->k(LE5/g0;)Z

    .line 197
    .line 198
    .line 199
    iget-boolean v1, v4, LE5/g0;->d:Z

    .line 200
    .line 201
    if-eqz v1, :cond_c

    .line 202
    .line 203
    iget-object v1, v4, LE5/g0;->f:LE5/h0;

    .line 204
    .line 205
    iget-wide v1, v1, LE5/h0;->b:J

    .line 206
    .line 207
    iget-wide v6, v0, LE5/O;->K:J

    .line 208
    .line 209
    iget-wide v8, v4, LE5/g0;->o:J

    .line 210
    .line 211
    sub-long/2addr v6, v8

    .line 212
    invoke-static {v1, v2, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 213
    .line 214
    .line 215
    move-result-wide v6

    .line 216
    iget-object v1, v4, LE5/g0;->i:[LE5/f;

    .line 217
    .line 218
    array-length v1, v1

    .line 219
    new-array v9, v1, [Z

    .line 220
    .line 221
    const/4 v8, 0x0

    .line 222
    invoke-virtual/range {v4 .. v9}, LE5/g0;->a(Lr6/s;JZ[Z)J

    .line 223
    .line 224
    .line 225
    :cond_c
    :goto_6
    invoke-virtual {v0, v10}, LE5/O;->k(Z)V

    .line 226
    .line 227
    .line 228
    iget-object v1, v0, LE5/O;->w:LE5/q0;

    .line 229
    .line 230
    iget v1, v1, LE5/q0;->e:I

    .line 231
    .line 232
    if-eq v1, v13, :cond_d

    .line 233
    .line 234
    invoke-virtual {v0}, LE5/O;->s()V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0}, LE5/O;->e0()V

    .line 238
    .line 239
    .line 240
    iget-object v1, v0, LE5/O;->h:Lu6/s;

    .line 241
    .line 242
    const/4 v2, 0x2

    .line 243
    invoke-virtual {v1, v2}, Lu6/s;->c(I)Z

    .line 244
    .line 245
    .line 246
    :cond_d
    :goto_7
    return-void
.end method

.method public final B(ZZZZ)V
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    iget-object v0, v1, LE5/O;->h:Lu6/s;

    .line 5
    .line 6
    iget-object v0, v0, Lu6/s;->a:Landroid/os/Handler;

    .line 7
    .line 8
    const/4 v3, 0x2

    .line 9
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    iput-object v3, v1, LE5/O;->N:LE5/o;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    iput-boolean v4, v1, LE5/O;->B:Z

    .line 17
    .line 18
    iget-object v0, v1, LE5/O;->n:LE5/l;

    .line 19
    .line 20
    iput-boolean v4, v0, LE5/l;->c:Z

    .line 21
    .line 22
    iget-object v0, v0, LE5/l;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, LA7/a0;

    .line 25
    .line 26
    iget-boolean v5, v0, LA7/a0;->b:Z

    .line 27
    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, LA7/a0;->g()J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    invoke-virtual {v0, v5, v6}, LA7/a0;->b(J)V

    .line 35
    .line 36
    .line 37
    iput-boolean v4, v0, LA7/a0;->b:Z

    .line 38
    .line 39
    :cond_0
    const-wide v5, 0xe8d4a51000L

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    iput-wide v5, v1, LE5/O;->K:J

    .line 45
    .line 46
    iget-object v5, v1, LE5/O;->a:[LE5/f;

    .line 47
    .line 48
    array-length v6, v5

    .line 49
    move v7, v4

    .line 50
    :goto_0
    const-string v8, "ExoPlayerImplInternal"

    .line 51
    .line 52
    if-ge v7, v6, :cond_1

    .line 53
    .line 54
    aget-object v0, v5, v7

    .line 55
    .line 56
    :try_start_0
    invoke-virtual {v1, v0}, LE5/O;->d(LE5/f;)V
    :try_end_0
    .catch LE5/o; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :catch_0
    move-exception v0

    .line 61
    goto :goto_1

    .line 62
    :catch_1
    move-exception v0

    .line 63
    :goto_1
    const-string v9, "Disable failed."

    .line 64
    .line 65
    invoke-static {v8, v9, v0}, Lu6/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    :goto_2
    add-int/2addr v7, v2

    .line 69
    goto :goto_0

    .line 70
    :cond_1
    if-eqz p1, :cond_3

    .line 71
    .line 72
    iget-object v5, v1, LE5/O;->a:[LE5/f;

    .line 73
    .line 74
    array-length v6, v5

    .line 75
    move v7, v4

    .line 76
    :goto_3
    if-ge v7, v6, :cond_3

    .line 77
    .line 78
    aget-object v0, v5, v7

    .line 79
    .line 80
    iget-object v9, v1, LE5/O;->b:Ljava/util/Set;

    .line 81
    .line 82
    invoke-interface {v9, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    if-eqz v9, :cond_2

    .line 87
    .line 88
    :try_start_1
    invoke-virtual {v0}, LE5/f;->u()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 89
    .line 90
    .line 91
    goto :goto_4

    .line 92
    :catch_2
    move-exception v0

    .line 93
    const-string v9, "Reset failed."

    .line 94
    .line 95
    invoke-static {v8, v9, v0}, Lu6/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    :cond_2
    :goto_4
    add-int/2addr v7, v2

    .line 99
    goto :goto_3

    .line 100
    :cond_3
    iput v4, v1, LE5/O;->I:I

    .line 101
    .line 102
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 103
    .line 104
    iget-object v5, v0, LE5/q0;->b:Lf6/z;

    .line 105
    .line 106
    iget-wide v6, v0, LE5/q0;->r:J

    .line 107
    .line 108
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 109
    .line 110
    iget-object v0, v0, LE5/q0;->b:Lf6/z;

    .line 111
    .line 112
    invoke-virtual {v0}, Lf6/x;->a()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_5

    .line 117
    .line 118
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 119
    .line 120
    iget-object v8, v1, LE5/O;->l:LE5/H0;

    .line 121
    .line 122
    iget-object v9, v0, LE5/q0;->b:Lf6/z;

    .line 123
    .line 124
    iget-object v0, v0, LE5/q0;->a:LE5/J0;

    .line 125
    .line 126
    invoke-virtual {v0}, LE5/J0;->p()Z

    .line 127
    .line 128
    .line 129
    move-result v10

    .line 130
    if-nez v10, :cond_5

    .line 131
    .line 132
    iget-object v9, v9, Lf6/x;->a:Ljava/lang/Object;

    .line 133
    .line 134
    invoke-virtual {v0, v9, v8}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    iget-boolean v0, v0, LE5/H0;->f:Z

    .line 139
    .line 140
    if-eqz v0, :cond_4

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_4
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 144
    .line 145
    iget-wide v8, v0, LE5/q0;->r:J

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_5
    :goto_5
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 149
    .line 150
    iget-wide v8, v0, LE5/q0;->c:J

    .line 151
    .line 152
    :goto_6
    if-eqz p2, :cond_6

    .line 153
    .line 154
    iput-object v3, v1, LE5/O;->J:LE5/N;

    .line 155
    .line 156
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 157
    .line 158
    iget-object v0, v0, LE5/q0;->a:LE5/J0;

    .line 159
    .line 160
    invoke-virtual {v1, v0}, LE5/O;->h(LE5/J0;)Landroid/util/Pair;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    iget-object v5, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v5, Lf6/z;

    .line 167
    .line 168
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v0, Ljava/lang/Long;

    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 173
    .line 174
    .line 175
    move-result-wide v6

    .line 176
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 177
    .line 178
    iget-object v0, v0, LE5/q0;->b:Lf6/z;

    .line 179
    .line 180
    invoke-virtual {v5, v0}, Lf6/x;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    if-nez v0, :cond_6

    .line 190
    .line 191
    :goto_7
    move-wide v10, v6

    .line 192
    move-object v7, v5

    .line 193
    goto :goto_8

    .line 194
    :cond_6
    move v2, v4

    .line 195
    goto :goto_7

    .line 196
    :goto_8
    iget-object v0, v1, LE5/O;->r:LE5/i0;

    .line 197
    .line 198
    invoke-virtual {v0}, LE5/i0;->b()V

    .line 199
    .line 200
    .line 201
    iput-boolean v4, v1, LE5/O;->C:Z

    .line 202
    .line 203
    new-instance v5, LE5/q0;

    .line 204
    .line 205
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 206
    .line 207
    iget-object v6, v0, LE5/q0;->a:LE5/J0;

    .line 208
    .line 209
    iget v12, v0, LE5/q0;->e:I

    .line 210
    .line 211
    if-eqz p4, :cond_7

    .line 212
    .line 213
    :goto_9
    move-object v13, v3

    .line 214
    goto :goto_a

    .line 215
    :cond_7
    iget-object v3, v0, LE5/q0;->f:LE5/o;

    .line 216
    .line 217
    goto :goto_9

    .line 218
    :goto_a
    if-eqz v2, :cond_8

    .line 219
    .line 220
    sget-object v3, Lf6/a0;->d:Lf6/a0;

    .line 221
    .line 222
    :goto_b
    move-object v15, v3

    .line 223
    goto :goto_c

    .line 224
    :cond_8
    iget-object v3, v0, LE5/q0;->h:Lf6/a0;

    .line 225
    .line 226
    goto :goto_b

    .line 227
    :goto_c
    if-eqz v2, :cond_9

    .line 228
    .line 229
    iget-object v3, v1, LE5/O;->e:Lr6/s;

    .line 230
    .line 231
    :goto_d
    move-object/from16 v16, v3

    .line 232
    .line 233
    goto :goto_e

    .line 234
    :cond_9
    iget-object v3, v0, LE5/q0;->i:Lr6/s;

    .line 235
    .line 236
    goto :goto_d

    .line 237
    :goto_e
    if-eqz v2, :cond_a

    .line 238
    .line 239
    sget-object v2, Ll8/K;->b:Ll8/I;

    .line 240
    .line 241
    sget-object v2, Ll8/e0;->e:Ll8/e0;

    .line 242
    .line 243
    :goto_f
    move-object/from16 v17, v2

    .line 244
    .line 245
    goto :goto_10

    .line 246
    :cond_a
    iget-object v2, v0, LE5/q0;->j:Ljava/util/List;

    .line 247
    .line 248
    goto :goto_f

    .line 249
    :goto_10
    iget-boolean v2, v0, LE5/q0;->l:Z

    .line 250
    .line 251
    iget v3, v0, LE5/q0;->m:I

    .line 252
    .line 253
    iget-object v0, v0, LE5/q0;->n:LE5/r0;

    .line 254
    .line 255
    const/16 v28, 0x0

    .line 256
    .line 257
    const/4 v14, 0x0

    .line 258
    const-wide/16 v24, 0x0

    .line 259
    .line 260
    move-object/from16 v18, v7

    .line 261
    .line 262
    move-wide/from16 v22, v10

    .line 263
    .line 264
    move-wide/from16 v26, v10

    .line 265
    .line 266
    move-object/from16 v21, v0

    .line 267
    .line 268
    move/from16 v19, v2

    .line 269
    .line 270
    move/from16 v20, v3

    .line 271
    .line 272
    invoke-direct/range {v5 .. v28}, LE5/q0;-><init>(LE5/J0;Lf6/z;JJILE5/o;ZLf6/a0;Lr6/s;Ljava/util/List;Lf6/z;ZILE5/r0;JJJZ)V

    .line 273
    .line 274
    .line 275
    iput-object v5, v1, LE5/O;->w:LE5/q0;

    .line 276
    .line 277
    if-eqz p3, :cond_c

    .line 278
    .line 279
    iget-object v2, v1, LE5/O;->s:LE5/n0;

    .line 280
    .line 281
    iget-object v0, v2, LE5/n0;->e:Ljava/lang/Object;

    .line 282
    .line 283
    move-object v3, v0

    .line 284
    check-cast v3, Ljava/util/HashMap;

    .line 285
    .line 286
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 291
    .line 292
    .line 293
    move-result-object v5

    .line 294
    :goto_11
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    if-eqz v0, :cond_b

    .line 299
    .line 300
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    move-object v6, v0

    .line 305
    check-cast v6, LE5/l0;

    .line 306
    .line 307
    :try_start_2
    iget-object v0, v6, LE5/l0;->a:Lf6/a;

    .line 308
    .line 309
    iget-object v7, v6, LE5/l0;->b:LE5/k0;

    .line 310
    .line 311
    invoke-virtual {v0, v7}, Lf6/a;->n(Lf6/A;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3

    .line 312
    .line 313
    .line 314
    goto :goto_12

    .line 315
    :catch_3
    move-exception v0

    .line 316
    const-string v7, "MediaSourceList"

    .line 317
    .line 318
    const-string v8, "Failed to release child source."

    .line 319
    .line 320
    invoke-static {v7, v8, v0}, Lu6/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 321
    .line 322
    .line 323
    :goto_12
    iget-object v0, v6, LE5/l0;->a:Lf6/a;

    .line 324
    .line 325
    iget-object v7, v6, LE5/l0;->c:LVa/Za;

    .line 326
    .line 327
    invoke-virtual {v0, v7}, Lf6/a;->q(Lf6/D;)V

    .line 328
    .line 329
    .line 330
    iget-object v0, v6, LE5/l0;->a:Lf6/a;

    .line 331
    .line 332
    invoke-virtual {v0, v7}, Lf6/a;->p(LI5/g;)V

    .line 333
    .line 334
    .line 335
    goto :goto_11

    .line 336
    :cond_b
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 337
    .line 338
    .line 339
    iget-object v0, v2, LE5/n0;->f:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v0, Ljava/util/HashSet;

    .line 342
    .line 343
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 344
    .line 345
    .line 346
    iput-boolean v4, v2, LE5/n0;->g:Z

    .line 347
    .line 348
    :cond_c
    return-void
.end method

.method public final C()V
    .locals 1

    .line 1
    iget-object v0, p0, LE5/O;->r:LE5/i0;

    .line 2
    .line 3
    iget-object v0, v0, LE5/i0;->h:LE5/g0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, LE5/g0;->f:LE5/h0;

    .line 8
    .line 9
    iget-boolean v0, v0, LE5/h0;->h:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, LE5/O;->z:Z

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
    iput-boolean v0, p0, LE5/O;->A:Z

    .line 21
    .line 22
    return-void
.end method

.method public final D(J)V
    .locals 6

    .line 1
    iget-object v0, p0, LE5/O;->r:LE5/i0;

    .line 2
    .line 3
    iget-object v1, v0, LE5/i0;->h:LE5/g0;

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
    iget-wide v1, v1, LE5/g0;->o:J

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :goto_1
    iput-wide p1, p0, LE5/O;->K:J

    .line 18
    .line 19
    iget-object v1, p0, LE5/O;->n:LE5/l;

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
    iget-object p1, p0, LE5/O;->a:[LE5/f;

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
    invoke-static {v3}, LE5/O;->q(LE5/f;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    iget-wide v4, p0, LE5/O;->K:J

    .line 44
    .line 45
    iput-boolean v1, v3, LE5/f;->k:Z

    .line 46
    .line 47
    iput-wide v4, v3, LE5/f;->j:J

    .line 48
    .line 49
    invoke-virtual {v3, v4, v5, v1}, LE5/f;->m(JZ)V

    .line 50
    .line 51
    .line 52
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    iget-object p1, v0, LE5/i0;->h:LE5/g0;

    .line 56
    .line 57
    :goto_3
    if-eqz p1, :cond_5

    .line 58
    .line 59
    iget-object p2, p1, LE5/g0;->n:Lr6/s;

    .line 60
    .line 61
    iget-object p2, p2, Lr6/s;->c:[Lr6/n;

    .line 62
    .line 63
    array-length v0, p2

    .line 64
    move v2, v1

    .line 65
    :goto_4
    if-ge v2, v0, :cond_4

    .line 66
    .line 67
    aget-object v3, p2, v2

    .line 68
    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    invoke-interface {v3}, Lr6/n;->e()V

    .line 72
    .line 73
    .line 74
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_4
    iget-object p1, p1, LE5/g0;->l:LE5/g0;

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_5
    return-void
.end method

.method public final E(LE5/J0;LE5/J0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, LE5/J0;->p()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, LE5/J0;->p()Z

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
    iget-object p1, p0, LE5/O;->o:Ljava/util/ArrayList;

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

.method public final H(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, LE5/O;->r:LE5/i0;

    .line 2
    .line 3
    iget-object v0, v0, LE5/i0;->h:LE5/g0;

    .line 4
    .line 5
    iget-object v0, v0, LE5/g0;->f:LE5/h0;

    .line 6
    .line 7
    iget-object v2, v0, LE5/h0;->a:Lf6/z;

    .line 8
    .line 9
    iget-object v0, p0, LE5/O;->w:LE5/q0;

    .line 10
    .line 11
    iget-wide v3, v0, LE5/q0;->r:J

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v1, p0

    .line 16
    invoke-virtual/range {v1 .. v6}, LE5/O;->J(Lf6/z;JZZ)J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 21
    .line 22
    iget-wide v5, v0, LE5/q0;->r:J

    .line 23
    .line 24
    cmp-long v0, v3, v5

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 29
    .line 30
    iget-wide v5, v0, LE5/q0;->c:J

    .line 31
    .line 32
    iget-wide v7, v0, LE5/q0;->d:J

    .line 33
    .line 34
    const/4 v10, 0x5

    .line 35
    move v9, p1

    .line 36
    invoke-virtual/range {v1 .. v10}, LE5/O;->o(Lf6/z;JJJZI)LE5/q0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, v1, LE5/O;->w:LE5/q0;

    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public final I(LE5/N;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LE5/O;->x:LA6/d;

    .line 4
    .line 5
    const/4 v9, 0x1

    .line 6
    invoke-virtual {v0, v9}, LA6/d;->a(I)V

    .line 7
    .line 8
    .line 9
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 10
    .line 11
    iget-object v2, v0, LE5/q0;->a:LE5/J0;

    .line 12
    .line 13
    iget v5, v1, LE5/O;->D:I

    .line 14
    .line 15
    iget-boolean v6, v1, LE5/O;->E:Z

    .line 16
    .line 17
    iget-object v7, v1, LE5/O;->k:LE5/I0;

    .line 18
    .line 19
    iget-object v8, v1, LE5/O;->l:LE5/H0;

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    move-object/from16 v3, p1

    .line 23
    .line 24
    invoke-static/range {v2 .. v8}, LE5/O;->F(LE5/J0;LE5/N;ZIZLE5/I0;LE5/H0;)Landroid/util/Pair;

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
    iget-object v2, v1, LE5/O;->w:LE5/q0;

    .line 37
    .line 38
    iget-object v2, v2, LE5/q0;->a:LE5/J0;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, LE5/O;->h(LE5/J0;)Landroid/util/Pair;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v10, Lf6/z;

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
    iget-object v2, v1, LE5/O;->w:LE5/q0;

    .line 57
    .line 58
    iget-object v2, v2, LE5/q0;->a:LE5/J0;

    .line 59
    .line 60
    invoke-virtual {v2}, LE5/J0;->p()Z

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
    goto :goto_4

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
    iget-wide v13, v3, LE5/N;->c:J

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
    iget-object v10, v1, LE5/O;->r:LE5/i0;

    .line 89
    .line 90
    iget-object v15, v1, LE5/O;->w:LE5/q0;

    .line 91
    .line 92
    iget-object v15, v15, LE5/q0;->a:LE5/J0;

    .line 93
    .line 94
    invoke-virtual {v10, v15, v2, v11, v12}, LE5/i0;->m(LE5/J0;Ljava/lang/Object;J)Lf6/z;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    invoke-virtual {v10}, Lf6/x;->a()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_3

    .line 103
    .line 104
    iget-object v2, v1, LE5/O;->w:LE5/q0;

    .line 105
    .line 106
    iget-object v2, v2, LE5/q0;->a:LE5/J0;

    .line 107
    .line 108
    iget-object v6, v10, Lf6/x;->a:Ljava/lang/Object;

    .line 109
    .line 110
    iget-object v7, v1, LE5/O;->l:LE5/H0;

    .line 111
    .line 112
    invoke-virtual {v2, v6, v7}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 113
    .line 114
    .line 115
    iget-object v2, v1, LE5/O;->l:LE5/H0;

    .line 116
    .line 117
    iget v6, v10, Lf6/x;->b:I

    .line 118
    .line 119
    invoke-virtual {v2, v6}, LE5/H0;->f(I)I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    iget v6, v10, Lf6/x;->c:I

    .line 124
    .line 125
    if-ne v2, v6, :cond_2

    .line 126
    .line 127
    iget-object v2, v1, LE5/O;->l:LE5/H0;

    .line 128
    .line 129
    iget-object v2, v2, LE5/H0;->g:Lg6/b;

    .line 130
    .line 131
    iget-wide v6, v2, Lg6/b;->b:J

    .line 132
    .line 133
    move-wide v11, v6

    .line 134
    goto :goto_2

    .line 135
    :cond_2
    const-wide/16 v11, 0x0

    .line 136
    .line 137
    :goto_2
    move v2, v9

    .line 138
    move-wide v5, v13

    .line 139
    goto :goto_0

    .line 140
    :cond_3
    const-wide/16 v15, 0x0

    .line 141
    .line 142
    iget-wide v4, v3, LE5/N;->c:J

    .line 143
    .line 144
    cmp-long v2, v4, v6

    .line 145
    .line 146
    if-nez v2, :cond_4

    .line 147
    .line 148
    move v2, v9

    .line 149
    goto :goto_3

    .line 150
    :cond_4
    move v2, v8

    .line 151
    :goto_3
    move-wide v5, v13

    .line 152
    :goto_4
    :try_start_0
    iget-object v4, v1, LE5/O;->w:LE5/q0;

    .line 153
    .line 154
    iget-object v4, v4, LE5/q0;->a:LE5/J0;

    .line 155
    .line 156
    invoke-virtual {v4}, LE5/J0;->p()Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-eqz v4, :cond_5

    .line 161
    .line 162
    iput-object v3, v1, LE5/O;->J:LE5/N;

    .line 163
    .line 164
    goto :goto_7

    .line 165
    :catchall_0
    move-exception v0

    .line 166
    move v9, v2

    .line 167
    :goto_5
    move-object v2, v10

    .line 168
    :goto_6
    move-wide v3, v11

    .line 169
    goto/16 :goto_13

    .line 170
    .line 171
    :cond_5
    const/4 v3, 0x4

    .line 172
    if-nez v0, :cond_7

    .line 173
    .line 174
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 175
    .line 176
    iget v0, v0, LE5/q0;->e:I

    .line 177
    .line 178
    if-eq v0, v9, :cond_6

    .line 179
    .line 180
    invoke-virtual {v1, v3}, LE5/O;->W(I)V

    .line 181
    .line 182
    .line 183
    :cond_6
    invoke-virtual {v1, v8, v9, v8, v9}, LE5/O;->B(ZZZZ)V

    .line 184
    .line 185
    .line 186
    :goto_7
    move v9, v2

    .line 187
    move-object v2, v10

    .line 188
    move-wide v3, v11

    .line 189
    goto/16 :goto_10

    .line 190
    .line 191
    :cond_7
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 192
    .line 193
    iget-object v0, v0, LE5/q0;->b:Lf6/z;

    .line 194
    .line 195
    invoke-virtual {v10, v0}, Lf6/x;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    if-eqz v0, :cond_b

    .line 200
    .line 201
    :try_start_1
    iget-object v0, v1, LE5/O;->r:LE5/i0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 202
    .line 203
    :try_start_2
    iget-object v0, v0, LE5/i0;->h:LE5/g0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 204
    .line 205
    if-eqz v0, :cond_8

    .line 206
    .line 207
    :try_start_3
    iget-boolean v4, v0, LE5/g0;->d:Z

    .line 208
    .line 209
    if-eqz v4, :cond_8

    .line 210
    .line 211
    cmp-long v4, v11, v15

    .line 212
    .line 213
    if-eqz v4, :cond_8

    .line 214
    .line 215
    iget-object v0, v0, LE5/g0;->a:Ljava/lang/Object;

    .line 216
    .line 217
    iget-object v4, v1, LE5/O;->v:LE5/C0;

    .line 218
    .line 219
    invoke-interface {v0, v11, v12, v4}, Lf6/w;->s(JLE5/C0;)J

    .line 220
    .line 221
    .line 222
    move-result-wide v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 223
    goto :goto_8

    .line 224
    :cond_8
    move-wide v13, v11

    .line 225
    :goto_8
    :try_start_4
    invoke-static {v13, v14}, Lu6/v;->F(J)J

    .line 226
    .line 227
    .line 228
    move-result-wide v15

    .line 229
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 230
    .line 231
    iget-wide v8, v0, LE5/q0;->r:J

    .line 232
    .line 233
    invoke-static {v8, v9}, Lu6/v;->F(J)J

    .line 234
    .line 235
    .line 236
    move-result-wide v8

    .line 237
    cmp-long v0, v15, v8

    .line 238
    .line 239
    if-nez v0, :cond_9

    .line 240
    .line 241
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 242
    .line 243
    iget v4, v0, LE5/q0;->e:I

    .line 244
    .line 245
    const/4 v8, 0x2

    .line 246
    if-eq v4, v8, :cond_a

    .line 247
    .line 248
    const/4 v8, 0x3

    .line 249
    if-ne v4, v8, :cond_9

    .line 250
    .line 251
    goto :goto_9

    .line 252
    :cond_9
    move v9, v2

    .line 253
    move-wide v15, v5

    .line 254
    move-object v2, v10

    .line 255
    goto :goto_b

    .line 256
    :cond_a
    :goto_9
    iget-wide v3, v0, LE5/q0;->r:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 257
    .line 258
    move v9, v2

    .line 259
    move-object v2, v10

    .line 260
    const/4 v10, 0x2

    .line 261
    move-wide v7, v3

    .line 262
    :goto_a
    invoke-virtual/range {v1 .. v10}, LE5/O;->o(Lf6/z;JJJZI)LE5/q0;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    iput-object v0, v1, LE5/O;->w:LE5/q0;

    .line 267
    .line 268
    return-void

    .line 269
    :catchall_1
    move-exception v0

    .line 270
    move v9, v2

    .line 271
    move-wide v15, v5

    .line 272
    goto :goto_5

    .line 273
    :catchall_2
    move-exception v0

    .line 274
    move v9, v2

    .line 275
    move-wide v15, v5

    .line 276
    move-object v2, v10

    .line 277
    move-wide v3, v11

    .line 278
    move-wide v5, v15

    .line 279
    goto/16 :goto_13

    .line 280
    .line 281
    :cond_b
    move v9, v2

    .line 282
    move-wide v15, v5

    .line 283
    move-object v2, v10

    .line 284
    move-wide v13, v11

    .line 285
    :goto_b
    :try_start_5
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 286
    .line 287
    iget v0, v0, LE5/q0;->e:I

    .line 288
    .line 289
    if-ne v0, v3, :cond_c

    .line 290
    .line 291
    const/4 v6, 0x1

    .line 292
    goto :goto_c

    .line 293
    :cond_c
    const/4 v6, 0x0

    .line 294
    :goto_c
    iget-object v0, v1, LE5/O;->r:LE5/i0;

    .line 295
    .line 296
    iget-object v3, v0, LE5/i0;->h:LE5/g0;

    .line 297
    .line 298
    iget-object v0, v0, LE5/i0;->i:LE5/g0;

    .line 299
    .line 300
    if-eq v3, v0, :cond_d

    .line 301
    .line 302
    const/4 v5, 0x1

    .line 303
    :goto_d
    move-wide v3, v13

    .line 304
    goto :goto_e

    .line 305
    :cond_d
    const/4 v5, 0x0

    .line 306
    goto :goto_d

    .line 307
    :goto_e
    invoke-virtual/range {v1 .. v6}, LE5/O;->J(Lf6/z;JZZ)J

    .line 308
    .line 309
    .line 310
    move-result-wide v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 311
    cmp-long v0, v11, v13

    .line 312
    .line 313
    if-eqz v0, :cond_e

    .line 314
    .line 315
    const/16 v17, 0x1

    .line 316
    .line 317
    goto :goto_f

    .line 318
    :cond_e
    const/16 v17, 0x0

    .line 319
    .line 320
    :goto_f
    or-int v8, v9, v17

    .line 321
    .line 322
    :try_start_6
    iget-object v0, v1, LE5/O;->w:LE5/q0;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 323
    .line 324
    move-object v3, v2

    .line 325
    :try_start_7
    iget-object v2, v0, LE5/q0;->a:LE5/J0;

    .line 326
    .line 327
    iget-object v5, v0, LE5/q0;->b:Lf6/z;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 328
    .line 329
    move-object v4, v2

    .line 330
    move-wide v6, v15

    .line 331
    :try_start_8
    invoke-virtual/range {v1 .. v7}, LE5/O;->f0(LE5/J0;Lf6/z;LE5/J0;Lf6/z;J)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 332
    .line 333
    .line 334
    move-object v2, v3

    .line 335
    move-wide v5, v6

    .line 336
    move v9, v8

    .line 337
    move-wide v3, v13

    .line 338
    :goto_10
    const/4 v10, 0x2

    .line 339
    move-wide v7, v3

    .line 340
    move-object/from16 v1, p0

    .line 341
    .line 342
    goto :goto_a

    .line 343
    :catchall_3
    move-exception v0

    .line 344
    move-object v2, v3

    .line 345
    move-wide v5, v6

    .line 346
    :goto_11
    move v9, v8

    .line 347
    move-wide v3, v13

    .line 348
    goto :goto_13

    .line 349
    :catchall_4
    move-exception v0

    .line 350
    move-object v2, v3

    .line 351
    :goto_12
    move-wide v5, v15

    .line 352
    goto :goto_11

    .line 353
    :catchall_5
    move-exception v0

    .line 354
    goto :goto_12

    .line 355
    :catchall_6
    move-exception v0

    .line 356
    move-wide v5, v15

    .line 357
    goto/16 :goto_6

    .line 358
    .line 359
    :goto_13
    const/4 v10, 0x2

    .line 360
    move-wide v7, v3

    .line 361
    invoke-virtual/range {v1 .. v10}, LE5/O;->o(Lf6/z;JJJZI)LE5/q0;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    iput-object v2, v1, LE5/O;->w:LE5/q0;

    .line 366
    .line 367
    throw v0
.end method

.method public final J(Lf6/z;JZZ)J
    .locals 8

    .line 1
    invoke-virtual {p0}, LE5/O;->b0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LE5/O;->B:Z

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-nez p5, :cond_0

    .line 9
    .line 10
    iget-object p5, p0, LE5/O;->w:LE5/q0;

    .line 11
    .line 12
    iget p5, p5, LE5/q0;->e:I

    .line 13
    .line 14
    const/4 v2, 0x3

    .line 15
    if-ne p5, v2, :cond_1

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0, v1}, LE5/O;->W(I)V

    .line 18
    .line 19
    .line 20
    :cond_1
    iget-object p5, p0, LE5/O;->r:LE5/i0;

    .line 21
    .line 22
    iget-object v2, p5, LE5/i0;->h:LE5/g0;

    .line 23
    .line 24
    move-object v3, v2

    .line 25
    :goto_0
    if-eqz v3, :cond_3

    .line 26
    .line 27
    iget-object v4, v3, LE5/g0;->f:LE5/h0;

    .line 28
    .line 29
    iget-object v4, v4, LE5/h0;->a:Lf6/z;

    .line 30
    .line 31
    invoke-virtual {p1, v4}, Lf6/x;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    iget-object v3, v3, LE5/g0;->l:LE5/g0;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    :goto_1
    if-nez p4, :cond_4

    .line 42
    .line 43
    if-ne v2, v3, :cond_4

    .line 44
    .line 45
    if-eqz v3, :cond_7

    .line 46
    .line 47
    iget-wide v4, v3, LE5/g0;->o:J

    .line 48
    .line 49
    add-long/2addr v4, p2

    .line 50
    const-wide/16 v6, 0x0

    .line 51
    .line 52
    cmp-long p1, v4, v6

    .line 53
    .line 54
    if-gez p1, :cond_7

    .line 55
    .line 56
    :cond_4
    iget-object p1, p0, LE5/O;->a:[LE5/f;

    .line 57
    .line 58
    array-length p4, p1

    .line 59
    move v2, v0

    .line 60
    :goto_2
    if-ge v2, p4, :cond_5

    .line 61
    .line 62
    aget-object v4, p1, v2

    .line 63
    .line 64
    invoke-virtual {p0, v4}, LE5/O;->d(LE5/f;)V

    .line 65
    .line 66
    .line 67
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_5
    if-eqz v3, :cond_7

    .line 71
    .line 72
    :goto_3
    iget-object p4, p5, LE5/i0;->h:LE5/g0;

    .line 73
    .line 74
    if-eq p4, v3, :cond_6

    .line 75
    .line 76
    invoke-virtual {p5}, LE5/i0;->a()LE5/g0;

    .line 77
    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_6
    invoke-virtual {p5, v3}, LE5/i0;->k(LE5/g0;)Z

    .line 81
    .line 82
    .line 83
    const-wide v4, 0xe8d4a51000L

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    iput-wide v4, v3, LE5/g0;->o:J

    .line 89
    .line 90
    array-length p1, p1

    .line 91
    new-array p1, p1, [Z

    .line 92
    .line 93
    invoke-virtual {p0, p1}, LE5/O;->f([Z)V

    .line 94
    .line 95
    .line 96
    :cond_7
    if-eqz v3, :cond_a

    .line 97
    .line 98
    invoke-virtual {p5, v3}, LE5/i0;->k(LE5/g0;)Z

    .line 99
    .line 100
    .line 101
    iget-boolean p1, v3, LE5/g0;->d:Z

    .line 102
    .line 103
    if-nez p1, :cond_8

    .line 104
    .line 105
    iget-object p1, v3, LE5/g0;->f:LE5/h0;

    .line 106
    .line 107
    invoke-virtual {p1, p2, p3}, LE5/h0;->b(J)LE5/h0;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iput-object p1, v3, LE5/g0;->f:LE5/h0;

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_8
    iget-boolean p1, v3, LE5/g0;->e:Z

    .line 115
    .line 116
    if-eqz p1, :cond_9

    .line 117
    .line 118
    iget-object p1, v3, LE5/g0;->a:Ljava/lang/Object;

    .line 119
    .line 120
    invoke-interface {p1, p2, p3}, Lf6/w;->d(J)J

    .line 121
    .line 122
    .line 123
    move-result-wide p2

    .line 124
    iget-wide p4, p0, LE5/O;->m:J

    .line 125
    .line 126
    sub-long p4, p2, p4

    .line 127
    .line 128
    invoke-interface {p1, p4, p5}, Lf6/w;->i(J)V

    .line 129
    .line 130
    .line 131
    :cond_9
    :goto_4
    invoke-virtual {p0, p2, p3}, LE5/O;->D(J)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, LE5/O;->s()V

    .line 135
    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_a
    invoke-virtual {p5}, LE5/i0;->b()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, p2, p3}, LE5/O;->D(J)V

    .line 142
    .line 143
    .line 144
    :goto_5
    invoke-virtual {p0, v0}, LE5/O;->k(Z)V

    .line 145
    .line 146
    .line 147
    iget-object p1, p0, LE5/O;->h:Lu6/s;

    .line 148
    .line 149
    invoke-virtual {p1, v1}, Lu6/s;->c(I)Z

    .line 150
    .line 151
    .line 152
    return-wide p2
.end method

.method public final K(LE5/y0;)V
    .locals 5

    .line 1
    iget-object v0, p1, LE5/y0;->f:Landroid/os/Looper;

    .line 2
    .line 3
    iget-object v1, p0, LE5/O;->j:Landroid/os/Looper;

    .line 4
    .line 5
    iget-object v2, p0, LE5/O;->h:Lu6/s;

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
    iget-object v1, p1, LE5/y0;->a:LE5/x0;

    .line 13
    .line 14
    iget v3, p1, LE5/y0;->d:I

    .line 15
    .line 16
    iget-object v4, p1, LE5/y0;->e:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-interface {v1, v3, v4}, LE5/x0;->c(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, LE5/y0;->b(Z)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, LE5/O;->w:LE5/q0;

    .line 25
    .line 26
    iget p1, p1, LE5/q0;->e:I

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
    invoke-virtual {v2, v1}, Lu6/s;->c(I)Z

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    invoke-virtual {p1, v0}, LE5/y0;->b(Z)V

    .line 42
    .line 43
    .line 44
    throw v1

    .line 45
    :cond_2
    const/16 v0, 0xf

    .line 46
    .line 47
    invoke-virtual {v2, v0, p1}, Lu6/s;->a(ILjava/lang/Object;)Lu6/r;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Lu6/r;->b()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final L(LE5/y0;)V
    .locals 3

    .line 1
    iget-object v0, p1, LE5/y0;->f:Landroid/os/Looper;

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
    invoke-static {v0, v1}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p1, v0}, LE5/y0;->b(Z)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    iget-object v2, p0, LE5/O;->p:Lu6/q;

    .line 27
    .line 28
    invoke-virtual {v2, v0, v1}, Lu6/q;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lu6/s;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, LC8/d;

    .line 33
    .line 34
    const/4 v2, 0x5

    .line 35
    invoke-direct {v1, v2, p0, p1}, LC8/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, v0, Lu6/s;->a:Landroid/os/Handler;

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final N(ZLjava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, LE5/O;->F:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-boolean p1, p0, LE5/O;->F:Z

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, LE5/O;->a:[LE5/f;

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
    invoke-static {v2}, LE5/O;->q(LE5/f;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    iget-object v3, p0, LE5/O;->b:Ljava/util/Set;

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
    invoke-virtual {v2}, LE5/f;->u()V

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

.method public final O(LE5/L;)V
    .locals 7

    .line 1
    iget-object v0, p0, LE5/O;->x:LA6/d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, LA6/d;->a(I)V

    .line 5
    .line 6
    .line 7
    iget v0, p1, LE5/L;->c:I

    .line 8
    .line 9
    iget-object v1, p1, LE5/L;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    iget-object v3, p1, LE5/L;->b:Lf6/X;

    .line 13
    .line 14
    if-eq v0, v2, :cond_0

    .line 15
    .line 16
    new-instance v0, LE5/N;

    .line 17
    .line 18
    new-instance v2, LE5/z0;

    .line 19
    .line 20
    invoke-direct {v2, v1, v3}, LE5/z0;-><init>(Ljava/util/ArrayList;Lf6/X;)V

    .line 21
    .line 22
    .line 23
    iget v4, p1, LE5/L;->c:I

    .line 24
    .line 25
    iget-wide v5, p1, LE5/L;->d:J

    .line 26
    .line 27
    invoke-direct {v0, v2, v4, v5, v6}, LE5/N;-><init>(LE5/J0;IJ)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, LE5/O;->J:LE5/N;

    .line 31
    .line 32
    :cond_0
    iget-object p1, p0, LE5/O;->s:LE5/n0;

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
    invoke-virtual {p1, v0, v1, v3}, LE5/n0;->a(ILjava/util/ArrayList;Lf6/X;)LE5/J0;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p0, p1, v4}, LE5/O;->l(LE5/J0;Z)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final P(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LE5/O;->H:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput-boolean p1, p0, LE5/O;->H:Z

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, LE5/O;->w:LE5/q0;

    .line 11
    .line 12
    iget-boolean p1, p1, LE5/q0;->o:Z

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, LE5/O;->h:Lu6/s;

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    invoke-virtual {p1, v0}, Lu6/s;->c(I)Z

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    return-void
.end method

.method public final Q(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, LE5/O;->z:Z

    .line 2
    .line 3
    invoke-virtual {p0}, LE5/O;->C()V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, LE5/O;->A:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, LE5/O;->r:LE5/i0;

    .line 11
    .line 12
    iget-object v0, p1, LE5/i0;->i:LE5/g0;

    .line 13
    .line 14
    iget-object p1, p1, LE5/i0;->h:LE5/g0;

    .line 15
    .line 16
    if-eq v0, p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    invoke-virtual {p0, p1}, LE5/O;->H(Z)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p1}, LE5/O;->k(Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final R(IIZZ)V
    .locals 3

    .line 1
    iget-object v0, p0, LE5/O;->x:LA6/d;

    .line 2
    .line 3
    invoke-virtual {v0, p4}, LA6/d;->a(I)V

    .line 4
    .line 5
    .line 6
    iget-object p4, p0, LE5/O;->x:LA6/d;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p4, LA6/d;->a:Z

    .line 10
    .line 11
    iput-boolean v0, p4, LA6/d;->e:Z

    .line 12
    .line 13
    iput p2, p4, LA6/d;->f:I

    .line 14
    .line 15
    iget-object p2, p0, LE5/O;->w:LE5/q0;

    .line 16
    .line 17
    invoke-virtual {p2, p1, p3}, LE5/q0;->c(IZ)LE5/q0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, LE5/O;->w:LE5/q0;

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    iput-boolean p1, p0, LE5/O;->B:Z

    .line 25
    .line 26
    iget-object p2, p0, LE5/O;->r:LE5/i0;

    .line 27
    .line 28
    iget-object p2, p2, LE5/i0;->h:LE5/g0;

    .line 29
    .line 30
    :goto_0
    if-eqz p2, :cond_2

    .line 31
    .line 32
    iget-object p4, p2, LE5/g0;->n:Lr6/s;

    .line 33
    .line 34
    iget-object p4, p4, Lr6/s;->c:[Lr6/n;

    .line 35
    .line 36
    array-length v0, p4

    .line 37
    move v1, p1

    .line 38
    :goto_1
    if-ge v1, v0, :cond_1

    .line 39
    .line 40
    aget-object v2, p4, v1

    .line 41
    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-interface {v2, p3}, Lr6/n;->h(Z)V

    .line 45
    .line 46
    .line 47
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    iget-object p2, p2, LE5/g0;->l:LE5/g0;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-virtual {p0}, LE5/O;->X()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    invoke-virtual {p0}, LE5/O;->b0()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, LE5/O;->e0()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_3
    iget-object p1, p0, LE5/O;->w:LE5/q0;

    .line 67
    .line 68
    iget p1, p1, LE5/q0;->e:I

    .line 69
    .line 70
    const/4 p2, 0x3

    .line 71
    iget-object p3, p0, LE5/O;->h:Lu6/s;

    .line 72
    .line 73
    const/4 p4, 0x2

    .line 74
    if-ne p1, p2, :cond_4

    .line 75
    .line 76
    invoke-virtual {p0}, LE5/O;->Z()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p3, p4}, Lu6/s;->c(I)Z

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_4
    if-ne p1, p4, :cond_5

    .line 84
    .line 85
    invoke-virtual {p3, p4}, Lu6/s;->c(I)Z

    .line 86
    .line 87
    .line 88
    :cond_5
    return-void
.end method

.method public final S(LE5/r0;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE5/O;->n:LE5/l;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LE5/l;->a(LE5/r0;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, LE5/l;->e()LE5/r0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget v0, p1, LE5/r0;->a:F

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {p0, p1, v0, v1, v1}, LE5/O;->n(LE5/r0;FZZ)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final T(I)V
    .locals 2

    .line 1
    iput p1, p0, LE5/O;->D:I

    .line 2
    .line 3
    iget-object v0, p0, LE5/O;->w:LE5/q0;

    .line 4
    .line 5
    iget-object v0, v0, LE5/q0;->a:LE5/J0;

    .line 6
    .line 7
    iget-object v1, p0, LE5/O;->r:LE5/i0;

    .line 8
    .line 9
    iput p1, v1, LE5/i0;->f:I

    .line 10
    .line 11
    invoke-virtual {v1, v0}, LE5/i0;->n(LE5/J0;)Z

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
    invoke-virtual {p0, p1}, LE5/O;->H(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    invoke-virtual {p0, p1}, LE5/O;->k(Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final U(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, LE5/O;->E:Z

    .line 2
    .line 3
    iget-object v0, p0, LE5/O;->w:LE5/q0;

    .line 4
    .line 5
    iget-object v0, v0, LE5/q0;->a:LE5/J0;

    .line 6
    .line 7
    iget-object v1, p0, LE5/O;->r:LE5/i0;

    .line 8
    .line 9
    iput-boolean p1, v1, LE5/i0;->g:Z

    .line 10
    .line 11
    invoke-virtual {v1, v0}, LE5/i0;->n(LE5/J0;)Z

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
    invoke-virtual {p0, p1}, LE5/O;->H(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    invoke-virtual {p0, p1}, LE5/O;->k(Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final V(Lf6/X;)V
    .locals 6

    .line 1
    iget-object v0, p0, LE5/O;->x:LA6/d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, LA6/d;->a(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LE5/O;->s:LE5/n0;

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
    iget-object v2, p1, Lf6/X;->b:[I

    .line 18
    .line 19
    array-length v2, v2

    .line 20
    if-eq v2, v1, :cond_0

    .line 21
    .line 22
    new-instance v2, Lf6/X;

    .line 23
    .line 24
    new-instance v3, Ljava/util/Random;

    .line 25
    .line 26
    iget-object p1, p1, Lf6/X;->a:Ljava/util/Random;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/Random;->nextLong()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    invoke-direct {v3, v4, v5}, Ljava/util/Random;-><init>(J)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v2, v3}, Lf6/X;-><init>(Ljava/util/Random;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v1}, Lf6/X;->a(I)Lf6/X;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :cond_0
    iput-object p1, v0, LE5/n0;->l:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v0}, LE5/n0;->d()LE5/J0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-virtual {p0, p1, v0}, LE5/O;->l(LE5/J0;Z)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final W(I)V
    .locals 3

    .line 1
    iget-object v0, p0, LE5/O;->w:LE5/q0;

    .line 2
    .line 3
    iget v1, v0, LE5/q0;->e:I

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
    iput-wide v1, p0, LE5/O;->O:J

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0, p1}, LE5/q0;->f(I)LE5/q0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, LE5/O;->w:LE5/q0;

    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public final X()Z
    .locals 2

    .line 1
    iget-object v0, p0, LE5/O;->w:LE5/q0;

    .line 2
    .line 3
    iget-boolean v1, v0, LE5/q0;->l:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v0, v0, LE5/q0;->m:I

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

.method public final Y(LE5/J0;Lf6/z;)Z
    .locals 2

    .line 1
    invoke-virtual {p2}, Lf6/x;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, LE5/J0;->p()Z

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
    iget-object p2, p2, Lf6/x;->a:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v0, p0, LE5/O;->l:LE5/H0;

    .line 17
    .line 18
    invoke-virtual {p1, p2, v0}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    iget p2, p2, LE5/H0;->c:I

    .line 23
    .line 24
    iget-object v0, p0, LE5/O;->k:LE5/I0;

    .line 25
    .line 26
    invoke-virtual {p1, p2, v0}, LE5/J0;->n(ILE5/I0;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, LE5/I0;->a()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    iget-boolean p1, v0, LE5/I0;->h:Z

    .line 36
    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iget-wide p1, v0, LE5/I0;->e:J

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

.method public final Z()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LE5/O;->B:Z

    .line 3
    .line 4
    iget-object v1, p0, LE5/O;->n:LE5/l;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    iput-boolean v2, v1, LE5/l;->c:Z

    .line 8
    .line 9
    iget-object v1, v1, LE5/l;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, LA7/a0;

    .line 12
    .line 13
    invoke-virtual {v1}, LA7/a0;->c()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, LE5/O;->a:[LE5/f;

    .line 17
    .line 18
    array-length v3, v1

    .line 19
    move v4, v0

    .line 20
    :goto_0
    if-ge v4, v3, :cond_2

    .line 21
    .line 22
    aget-object v5, v1, v4

    .line 23
    .line 24
    invoke-static {v5}, LE5/O;->q(LE5/f;)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-eqz v6, :cond_1

    .line 29
    .line 30
    iget v6, v5, LE5/f;->f:I

    .line 31
    .line 32
    if-ne v6, v2, :cond_0

    .line 33
    .line 34
    move v6, v2

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    move v6, v0

    .line 37
    :goto_1
    invoke-static {v6}, Lu6/a;->i(Z)V

    .line 38
    .line 39
    .line 40
    const/4 v6, 0x2

    .line 41
    iput v6, v5, LE5/f;->f:I

    .line 42
    .line 43
    invoke-virtual {v5}, LE5/f;->o()V

    .line 44
    .line 45
    .line 46
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    return-void
.end method

.method public final a(Lf6/w;)V
    .locals 2

    .line 1
    iget-object v0, p0, LE5/O;->h:Lu6/s;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lu6/s;->a(ILjava/lang/Object;)Lu6/r;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Lu6/r;->b()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final a0(ZZ)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget-boolean p1, p0, LE5/O;->F:Z

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p1, v0

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    move p1, v1

    .line 13
    :goto_1
    invoke-virtual {p0, p1, v0, v1, v0}, LE5/O;->B(ZZZZ)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LE5/O;->x:LA6/d;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, LA6/d;->a(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, LE5/O;->f:LE5/k;

    .line 22
    .line 23
    invoke-virtual {p1, v1}, LE5/k;->b(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v1}, LE5/O;->W(I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final b(Lf6/W;)V
    .locals 2

    .line 1
    check-cast p1, Lf6/w;

    .line 2
    .line 3
    iget-object v0, p0, LE5/O;->h:Lu6/s;

    .line 4
    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, Lu6/s;->a(ILjava/lang/Object;)Lu6/r;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lu6/r;->b()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final b0()V
    .locals 8

    .line 1
    iget-object v0, p0, LE5/O;->n:LE5/l;

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
    iget-object v0, p0, LE5/O;->a:[LE5/f;

    .line 24
    .line 25
    array-length v2, v0

    .line 26
    move v3, v1

    .line 27
    :goto_0
    if-ge v3, v2, :cond_3

    .line 28
    .line 29
    aget-object v4, v0, v3

    .line 30
    .line 31
    invoke-static {v4}, LE5/O;->q(LE5/f;)Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_2

    .line 36
    .line 37
    iget v5, v4, LE5/f;->f:I

    .line 38
    .line 39
    const/4 v6, 0x2

    .line 40
    if-ne v5, v6, :cond_2

    .line 41
    .line 42
    const/4 v7, 0x1

    .line 43
    if-ne v5, v6, :cond_1

    .line 44
    .line 45
    move v5, v7

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move v5, v1

    .line 48
    :goto_1
    invoke-static {v5}, Lu6/a;->i(Z)V

    .line 49
    .line 50
    .line 51
    iput v7, v4, LE5/f;->f:I

    .line 52
    .line 53
    invoke-virtual {v4}, LE5/f;->p()V

    .line 54
    .line 55
    .line 56
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    return-void
.end method

.method public final c(LE5/L;I)V
    .locals 2

    .line 1
    iget-object v0, p0, LE5/O;->x:LA6/d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, LA6/d;->a(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iget-object v1, p0, LE5/O;->s:LE5/n0;

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
    iget-object v0, p1, LE5/L;->a:Ljava/util/ArrayList;

    .line 21
    .line 22
    iget-object p1, p1, LE5/L;->b:Lf6/X;

    .line 23
    .line 24
    invoke-virtual {v1, p2, v0, p1}, LE5/n0;->a(ILjava/util/ArrayList;Lf6/X;)LE5/J0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-virtual {p0, p1, p2}, LE5/O;->l(LE5/J0;Z)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final c0()V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LE5/O;->r:LE5/i0;

    .line 4
    .line 5
    iget-object v1, v1, LE5/i0;->j:LE5/g0;

    .line 6
    .line 7
    iget-boolean v2, v0, LE5/O;->C:Z

    .line 8
    .line 9
    if-nez v2, :cond_1

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, v1, LE5/g0;->a:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-interface {v1}, Lf6/W;->e()Z

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
    iget-object v1, v0, LE5/O;->w:LE5/q0;

    .line 28
    .line 29
    iget-boolean v2, v1, LE5/q0;->g:Z

    .line 30
    .line 31
    if-eq v11, v2, :cond_2

    .line 32
    .line 33
    new-instance v2, LE5/q0;

    .line 34
    .line 35
    iget-object v3, v1, LE5/q0;->a:LE5/J0;

    .line 36
    .line 37
    iget-object v4, v1, LE5/q0;->b:Lf6/z;

    .line 38
    .line 39
    iget-wide v5, v1, LE5/q0;->c:J

    .line 40
    .line 41
    iget-wide v7, v1, LE5/q0;->d:J

    .line 42
    .line 43
    iget v9, v1, LE5/q0;->e:I

    .line 44
    .line 45
    iget-object v10, v1, LE5/q0;->f:LE5/o;

    .line 46
    .line 47
    iget-object v12, v1, LE5/q0;->h:Lf6/a0;

    .line 48
    .line 49
    iget-object v13, v1, LE5/q0;->i:Lr6/s;

    .line 50
    .line 51
    iget-object v14, v1, LE5/q0;->j:Ljava/util/List;

    .line 52
    .line 53
    iget-object v15, v1, LE5/q0;->k:Lf6/z;

    .line 54
    .line 55
    move-object/from16 v16, v2

    .line 56
    .line 57
    iget-boolean v2, v1, LE5/q0;->l:Z

    .line 58
    .line 59
    move/from16 v17, v2

    .line 60
    .line 61
    iget v2, v1, LE5/q0;->m:I

    .line 62
    .line 63
    move/from16 v18, v2

    .line 64
    .line 65
    iget-object v2, v1, LE5/q0;->n:LE5/r0;

    .line 66
    .line 67
    move-object/from16 v20, v2

    .line 68
    .line 69
    move-object/from16 v19, v3

    .line 70
    .line 71
    iget-wide v2, v1, LE5/q0;->p:J

    .line 72
    .line 73
    move-wide/from16 v21, v2

    .line 74
    .line 75
    iget-wide v2, v1, LE5/q0;->q:J

    .line 76
    .line 77
    move-wide/from16 v23, v2

    .line 78
    .line 79
    iget-wide v2, v1, LE5/q0;->r:J

    .line 80
    .line 81
    iget-boolean v1, v1, LE5/q0;->o:Z

    .line 82
    .line 83
    move/from16 v25, v1

    .line 84
    .line 85
    move-wide/from16 v26, v2

    .line 86
    .line 87
    move-object/from16 v2, v16

    .line 88
    .line 89
    move/from16 v16, v17

    .line 90
    .line 91
    move/from16 v17, v18

    .line 92
    .line 93
    move-object/from16 v3, v19

    .line 94
    .line 95
    move-object/from16 v18, v20

    .line 96
    .line 97
    move-wide/from16 v19, v21

    .line 98
    .line 99
    move-wide/from16 v21, v23

    .line 100
    .line 101
    move-wide/from16 v23, v26

    .line 102
    .line 103
    invoke-direct/range {v2 .. v25}, LE5/q0;-><init>(LE5/J0;Lf6/z;JJILE5/o;ZLf6/a0;Lr6/s;Ljava/util/List;Lf6/z;ZILE5/r0;JJJZ)V

    .line 104
    .line 105
    .line 106
    iput-object v2, v0, LE5/O;->w:LE5/q0;

    .line 107
    .line 108
    :cond_2
    return-void
.end method

.method public final d(LE5/f;)V
    .locals 5

    .line 1
    invoke-static {p1}, LE5/O;->q(LE5/f;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, LE5/O;->n:LE5/l;

    .line 9
    .line 10
    iget-object v1, v0, LE5/l;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LE5/f;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x0

    .line 16
    if-ne p1, v1, :cond_1

    .line 17
    .line 18
    iput-object v3, v0, LE5/l;->g:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object v3, v0, LE5/l;->f:Ljava/lang/Object;

    .line 21
    .line 22
    iput-boolean v2, v0, LE5/l;->b:Z

    .line 23
    .line 24
    :cond_1
    iget v0, p1, LE5/f;->f:I

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    const/4 v4, 0x2

    .line 28
    if-ne v0, v4, :cond_3

    .line 29
    .line 30
    if-ne v0, v4, :cond_2

    .line 31
    .line 32
    move v0, v2

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    move v0, v1

    .line 35
    :goto_0
    invoke-static {v0}, Lu6/a;->i(Z)V

    .line 36
    .line 37
    .line 38
    iput v2, p1, LE5/f;->f:I

    .line 39
    .line 40
    invoke-virtual {p1}, LE5/f;->p()V

    .line 41
    .line 42
    .line 43
    :cond_3
    iget v0, p1, LE5/f;->f:I

    .line 44
    .line 45
    if-ne v0, v2, :cond_4

    .line 46
    .line 47
    move v0, v2

    .line 48
    goto :goto_1

    .line 49
    :cond_4
    move v0, v1

    .line 50
    :goto_1
    invoke-static {v0}, Lu6/a;->i(Z)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p1, LE5/f;->b:LS3/s;

    .line 54
    .line 55
    invoke-virtual {v0}, LS3/s;->e()V

    .line 56
    .line 57
    .line 58
    iput v1, p1, LE5/f;->f:I

    .line 59
    .line 60
    iput-object v3, p1, LE5/f;->g:Lf6/V;

    .line 61
    .line 62
    iput-object v3, p1, LE5/f;->h:[LE5/T;

    .line 63
    .line 64
    iput-boolean v1, p1, LE5/f;->k:Z

    .line 65
    .line 66
    invoke-virtual {p1}, LE5/f;->k()V

    .line 67
    .line 68
    .line 69
    iget p1, p0, LE5/O;->I:I

    .line 70
    .line 71
    sub-int/2addr p1, v2

    .line 72
    iput p1, p0, LE5/O;->I:I

    .line 73
    .line 74
    return-void
.end method

.method public final d0(Lr6/s;)V
    .locals 6

    .line 1
    iget-object p1, p1, Lr6/s;->c:[Lr6/n;

    .line 2
    .line 3
    iget-object v0, p0, LE5/O;->f:LE5/k;

    .line 4
    .line 5
    iget v1, v0, LE5/k;->f:I

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    if-ne v1, v2, :cond_2

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    iget-object v3, p0, LE5/O;->a:[LE5/f;

    .line 13
    .line 14
    array-length v4, v3

    .line 15
    const/high16 v5, 0xc80000

    .line 16
    .line 17
    if-ge v1, v4, :cond_1

    .line 18
    .line 19
    aget-object v4, p1, v1

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    aget-object v3, v3, v1

    .line 24
    .line 25
    iget v3, v3, LE5/f;->a:I

    .line 26
    .line 27
    const/high16 v4, 0x20000

    .line 28
    .line 29
    packed-switch v3, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :pswitch_0
    move v5, v4

    .line 39
    goto :goto_1

    .line 40
    :pswitch_1
    const/high16 v5, 0x7d00000

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :pswitch_2
    const/high16 v5, 0x89a0000

    .line 44
    .line 45
    :goto_1
    :pswitch_3
    add-int/2addr v2, v5

    .line 46
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    :cond_2
    iput v1, v0, LE5/k;->h:I

    .line 54
    .line 55
    iget-object p1, v0, LE5/k;->a:Lo2/e;

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Lo2/e;->a(I)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final e()V
    .locals 50

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LE5/O;->p:Lu6/q;

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
    iget-object v0, v1, LE5/O;->h:Lu6/s;

    .line 13
    .line 14
    iget-object v0, v0, Lu6/s;->a:Landroid/os/Handler;

    .line 15
    .line 16
    const/4 v13, 0x2

    .line 17
    invoke-virtual {v0, v13}, Landroid/os/Handler;->removeMessages(I)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 21
    .line 22
    iget-object v0, v0, LE5/q0;->a:LE5/J0;

    .line 23
    .line 24
    invoke-virtual {v0}, LE5/J0;->p()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const-wide/high16 v14, -0x8000000000000000L

    .line 29
    .line 30
    const/4 v10, 0x0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    iget-object v0, v1, LE5/O;->s:LE5/n0;

    .line 34
    .line 35
    iget-boolean v0, v0, LE5/n0;->g:Z

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    :cond_0
    move-wide/from16 v20, v11

    .line 40
    .line 41
    move-wide/from16 v25, v14

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    const/4 v15, 0x0

    .line 50
    move-object v12, v10

    .line 51
    goto/16 :goto_1b

    .line 52
    .line 53
    :cond_1
    iget-object v0, v1, LE5/O;->r:LE5/i0;

    .line 54
    .line 55
    iget-wide v4, v1, LE5/O;->K:J

    .line 56
    .line 57
    iget-object v0, v0, LE5/i0;->j:LE5/g0;

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    iget-object v6, v0, LE5/g0;->l:LE5/g0;

    .line 62
    .line 63
    if-nez v6, :cond_2

    .line 64
    .line 65
    const/4 v6, 0x1

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    const/4 v6, 0x0

    .line 68
    :goto_0
    invoke-static {v6}, Lu6/a;->i(Z)V

    .line 69
    .line 70
    .line 71
    iget-boolean v6, v0, LE5/g0;->d:Z

    .line 72
    .line 73
    if-eqz v6, :cond_3

    .line 74
    .line 75
    iget-object v6, v0, LE5/g0;->a:Ljava/lang/Object;

    .line 76
    .line 77
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    iget-wide v2, v0, LE5/g0;->o:J

    .line 83
    .line 84
    sub-long/2addr v4, v2

    .line 85
    invoke-interface {v6, v4, v5}, Lf6/W;->o(J)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    :goto_1
    iget-object v0, v1, LE5/O;->r:LE5/i0;

    .line 95
    .line 96
    iget-object v2, v0, LE5/i0;->j:LE5/g0;

    .line 97
    .line 98
    if-eqz v2, :cond_7

    .line 99
    .line 100
    iget-object v3, v2, LE5/g0;->f:LE5/h0;

    .line 101
    .line 102
    iget-boolean v3, v3, LE5/h0;->i:Z

    .line 103
    .line 104
    if-nez v3, :cond_5

    .line 105
    .line 106
    iget-boolean v3, v2, LE5/g0;->d:Z

    .line 107
    .line 108
    if-eqz v3, :cond_5

    .line 109
    .line 110
    iget-boolean v3, v2, LE5/g0;->e:Z

    .line 111
    .line 112
    if-eqz v3, :cond_4

    .line 113
    .line 114
    iget-object v2, v2, LE5/g0;->a:Ljava/lang/Object;

    .line 115
    .line 116
    invoke-interface {v2}, Lf6/W;->n()J

    .line 117
    .line 118
    .line 119
    move-result-wide v2

    .line 120
    cmp-long v2, v2, v14

    .line 121
    .line 122
    if-nez v2, :cond_5

    .line 123
    .line 124
    :cond_4
    iget-object v2, v0, LE5/i0;->j:LE5/g0;

    .line 125
    .line 126
    iget-object v2, v2, LE5/g0;->f:LE5/h0;

    .line 127
    .line 128
    iget-wide v2, v2, LE5/h0;->e:J

    .line 129
    .line 130
    cmp-long v2, v2, v16

    .line 131
    .line 132
    if-eqz v2, :cond_5

    .line 133
    .line 134
    iget v0, v0, LE5/i0;->k:I

    .line 135
    .line 136
    const/16 v2, 0x64

    .line 137
    .line 138
    if-ge v0, v2, :cond_5

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_5
    move-wide/from16 v25, v14

    .line 142
    .line 143
    :cond_6
    const/4 v15, 0x0

    .line 144
    const/16 v18, 0x1

    .line 145
    .line 146
    goto/16 :goto_6

    .line 147
    .line 148
    :cond_7
    :goto_2
    iget-object v0, v1, LE5/O;->r:LE5/i0;

    .line 149
    .line 150
    iget-wide v2, v1, LE5/O;->K:J

    .line 151
    .line 152
    iget-object v4, v1, LE5/O;->w:LE5/q0;

    .line 153
    .line 154
    iget-object v5, v0, LE5/i0;->j:LE5/g0;

    .line 155
    .line 156
    if-nez v5, :cond_8

    .line 157
    .line 158
    iget-object v2, v4, LE5/q0;->a:LE5/J0;

    .line 159
    .line 160
    iget-object v3, v4, LE5/q0;->b:Lf6/z;

    .line 161
    .line 162
    iget-wide v5, v4, LE5/q0;->c:J

    .line 163
    .line 164
    move-wide/from16 v25, v14

    .line 165
    .line 166
    iget-wide v14, v4, LE5/q0;->r:J

    .line 167
    .line 168
    move-object/from16 v18, v0

    .line 169
    .line 170
    move-object/from16 v19, v2

    .line 171
    .line 172
    move-object/from16 v20, v3

    .line 173
    .line 174
    move-wide/from16 v21, v5

    .line 175
    .line 176
    move-wide/from16 v23, v14

    .line 177
    .line 178
    invoke-virtual/range {v18 .. v24}, LE5/i0;->d(LE5/J0;Lf6/z;JJ)LE5/h0;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    goto :goto_3

    .line 183
    :cond_8
    move-wide/from16 v25, v14

    .line 184
    .line 185
    iget-object v4, v4, LE5/q0;->a:LE5/J0;

    .line 186
    .line 187
    invoke-virtual {v0, v4, v5, v2, v3}, LE5/i0;->c(LE5/J0;LE5/g0;J)LE5/h0;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    :goto_3
    if-eqz v0, :cond_6

    .line 192
    .line 193
    iget-object v2, v1, LE5/O;->r:LE5/i0;

    .line 194
    .line 195
    iget-object v3, v1, LE5/O;->c:[LE5/f;

    .line 196
    .line 197
    iget-object v4, v1, LE5/O;->d:Lr6/o;

    .line 198
    .line 199
    iget-object v5, v1, LE5/O;->f:LE5/k;

    .line 200
    .line 201
    iget-object v5, v5, LE5/k;->a:Lo2/e;

    .line 202
    .line 203
    iget-object v6, v1, LE5/O;->s:LE5/n0;

    .line 204
    .line 205
    iget-object v7, v1, LE5/O;->e:Lr6/s;

    .line 206
    .line 207
    iget-object v14, v2, LE5/i0;->j:LE5/g0;

    .line 208
    .line 209
    if-nez v14, :cond_9

    .line 210
    .line 211
    const-wide v14, 0xe8d4a51000L

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    move-wide/from16 v29, v14

    .line 217
    .line 218
    const/16 v18, 0x1

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_9
    const/16 v18, 0x1

    .line 222
    .line 223
    iget-wide v8, v14, LE5/g0;->o:J

    .line 224
    .line 225
    iget-object v14, v14, LE5/g0;->f:LE5/h0;

    .line 226
    .line 227
    iget-wide v13, v14, LE5/h0;->e:J

    .line 228
    .line 229
    add-long/2addr v8, v13

    .line 230
    iget-wide v13, v0, LE5/h0;->b:J

    .line 231
    .line 232
    sub-long/2addr v8, v13

    .line 233
    move-wide/from16 v29, v8

    .line 234
    .line 235
    :goto_4
    new-instance v27, LE5/g0;

    .line 236
    .line 237
    move-object/from16 v34, v0

    .line 238
    .line 239
    move-object/from16 v28, v3

    .line 240
    .line 241
    move-object/from16 v31, v4

    .line 242
    .line 243
    move-object/from16 v32, v5

    .line 244
    .line 245
    move-object/from16 v33, v6

    .line 246
    .line 247
    move-object/from16 v35, v7

    .line 248
    .line 249
    invoke-direct/range {v27 .. v35}, LE5/g0;-><init>([LE5/f;JLr6/o;Lo2/e;LE5/n0;LE5/h0;Lr6/s;)V

    .line 250
    .line 251
    .line 252
    move-object/from16 v3, v27

    .line 253
    .line 254
    iget-object v4, v2, LE5/i0;->j:LE5/g0;

    .line 255
    .line 256
    if-eqz v4, :cond_b

    .line 257
    .line 258
    iget-object v5, v4, LE5/g0;->l:LE5/g0;

    .line 259
    .line 260
    if-ne v3, v5, :cond_a

    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_a
    invoke-virtual {v4}, LE5/g0;->b()V

    .line 264
    .line 265
    .line 266
    iput-object v3, v4, LE5/g0;->l:LE5/g0;

    .line 267
    .line 268
    invoke-virtual {v4}, LE5/g0;->c()V

    .line 269
    .line 270
    .line 271
    goto :goto_5

    .line 272
    :cond_b
    iput-object v3, v2, LE5/i0;->h:LE5/g0;

    .line 273
    .line 274
    iput-object v3, v2, LE5/i0;->i:LE5/g0;

    .line 275
    .line 276
    :goto_5
    iput-object v10, v2, LE5/i0;->l:Ljava/lang/Object;

    .line 277
    .line 278
    iput-object v3, v2, LE5/i0;->j:LE5/g0;

    .line 279
    .line 280
    iget v4, v2, LE5/i0;->k:I

    .line 281
    .line 282
    add-int/lit8 v4, v4, 0x1

    .line 283
    .line 284
    iput v4, v2, LE5/i0;->k:I

    .line 285
    .line 286
    invoke-virtual {v2}, LE5/i0;->j()V

    .line 287
    .line 288
    .line 289
    iget-object v2, v3, LE5/g0;->a:Ljava/lang/Object;

    .line 290
    .line 291
    iget-wide v4, v0, LE5/h0;->b:J

    .line 292
    .line 293
    invoke-interface {v2, v1, v4, v5}, Lf6/w;->r(Lf6/v;J)V

    .line 294
    .line 295
    .line 296
    iget-object v2, v1, LE5/O;->r:LE5/i0;

    .line 297
    .line 298
    iget-object v2, v2, LE5/i0;->h:LE5/g0;

    .line 299
    .line 300
    if-ne v2, v3, :cond_c

    .line 301
    .line 302
    iget-wide v2, v0, LE5/h0;->b:J

    .line 303
    .line 304
    invoke-virtual {v1, v2, v3}, LE5/O;->D(J)V

    .line 305
    .line 306
    .line 307
    :cond_c
    const/4 v15, 0x0

    .line 308
    invoke-virtual {v1, v15}, LE5/O;->k(Z)V

    .line 309
    .line 310
    .line 311
    :goto_6
    iget-boolean v0, v1, LE5/O;->C:Z

    .line 312
    .line 313
    if-eqz v0, :cond_d

    .line 314
    .line 315
    invoke-virtual {v1}, LE5/O;->p()Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    iput-boolean v0, v1, LE5/O;->C:Z

    .line 320
    .line 321
    invoke-virtual {v1}, LE5/O;->c0()V

    .line 322
    .line 323
    .line 324
    goto :goto_7

    .line 325
    :cond_d
    invoke-virtual {v1}, LE5/O;->s()V

    .line 326
    .line 327
    .line 328
    :goto_7
    iget-object v0, v1, LE5/O;->r:LE5/i0;

    .line 329
    .line 330
    iget-object v2, v0, LE5/i0;->i:LE5/g0;

    .line 331
    .line 332
    if-nez v2, :cond_f

    .line 333
    .line 334
    :cond_e
    :goto_8
    move-wide/from16 v20, v11

    .line 335
    .line 336
    move-wide/from16 v10, v16

    .line 337
    .line 338
    goto/16 :goto_11

    .line 339
    .line 340
    :cond_f
    iget-object v3, v2, LE5/g0;->l:LE5/g0;

    .line 341
    .line 342
    iget-object v8, v1, LE5/O;->a:[LE5/f;

    .line 343
    .line 344
    if-eqz v3, :cond_10

    .line 345
    .line 346
    iget-boolean v3, v1, LE5/O;->A:Z

    .line 347
    .line 348
    if-eqz v3, :cond_11

    .line 349
    .line 350
    :cond_10
    move-wide/from16 v20, v11

    .line 351
    .line 352
    move-wide/from16 v10, v16

    .line 353
    .line 354
    goto/16 :goto_e

    .line 355
    .line 356
    :cond_11
    iget-boolean v3, v2, LE5/g0;->d:Z

    .line 357
    .line 358
    if-nez v3, :cond_12

    .line 359
    .line 360
    goto :goto_8

    .line 361
    :cond_12
    move v3, v15

    .line 362
    :goto_9
    array-length v4, v8

    .line 363
    if-ge v3, v4, :cond_14

    .line 364
    .line 365
    aget-object v4, v8, v3

    .line 366
    .line 367
    iget-object v5, v2, LE5/g0;->c:[Lf6/V;

    .line 368
    .line 369
    aget-object v5, v5, v3

    .line 370
    .line 371
    iget-object v6, v4, LE5/f;->g:Lf6/V;

    .line 372
    .line 373
    if-ne v6, v5, :cond_e

    .line 374
    .line 375
    if-eqz v5, :cond_13

    .line 376
    .line 377
    invoke-virtual {v4}, LE5/f;->h()Z

    .line 378
    .line 379
    .line 380
    move-result v5

    .line 381
    if-nez v5, :cond_13

    .line 382
    .line 383
    iget-object v5, v2, LE5/g0;->l:LE5/g0;

    .line 384
    .line 385
    iget-object v6, v2, LE5/g0;->f:LE5/h0;

    .line 386
    .line 387
    iget-boolean v6, v6, LE5/h0;->f:Z

    .line 388
    .line 389
    if-eqz v6, :cond_e

    .line 390
    .line 391
    iget-boolean v6, v5, LE5/g0;->d:Z

    .line 392
    .line 393
    if-eqz v6, :cond_e

    .line 394
    .line 395
    instance-of v6, v4, Lh6/k;

    .line 396
    .line 397
    if-nez v6, :cond_13

    .line 398
    .line 399
    instance-of v6, v4, LW5/f;

    .line 400
    .line 401
    if-nez v6, :cond_13

    .line 402
    .line 403
    iget-wide v6, v4, LE5/f;->j:J

    .line 404
    .line 405
    invoke-virtual {v5}, LE5/g0;->e()J

    .line 406
    .line 407
    .line 408
    move-result-wide v4

    .line 409
    cmp-long v4, v6, v4

    .line 410
    .line 411
    if-ltz v4, :cond_e

    .line 412
    .line 413
    :cond_13
    add-int/lit8 v3, v3, 0x1

    .line 414
    .line 415
    goto :goto_9

    .line 416
    :cond_14
    iget-object v3, v2, LE5/g0;->l:LE5/g0;

    .line 417
    .line 418
    iget-boolean v4, v3, LE5/g0;->d:Z

    .line 419
    .line 420
    if-nez v4, :cond_15

    .line 421
    .line 422
    iget-wide v4, v1, LE5/O;->K:J

    .line 423
    .line 424
    invoke-virtual {v3}, LE5/g0;->e()J

    .line 425
    .line 426
    .line 427
    move-result-wide v6

    .line 428
    cmp-long v3, v4, v6

    .line 429
    .line 430
    if-gez v3, :cond_15

    .line 431
    .line 432
    goto :goto_8

    .line 433
    :cond_15
    iget-object v9, v2, LE5/g0;->n:Lr6/s;

    .line 434
    .line 435
    iget-object v3, v0, LE5/i0;->i:LE5/g0;

    .line 436
    .line 437
    if-eqz v3, :cond_16

    .line 438
    .line 439
    iget-object v3, v3, LE5/g0;->l:LE5/g0;

    .line 440
    .line 441
    if-eqz v3, :cond_16

    .line 442
    .line 443
    move/from16 v3, v18

    .line 444
    .line 445
    goto :goto_a

    .line 446
    :cond_16
    move v3, v15

    .line 447
    :goto_a
    invoke-static {v3}, Lu6/a;->i(Z)V

    .line 448
    .line 449
    .line 450
    iget-object v3, v0, LE5/i0;->i:LE5/g0;

    .line 451
    .line 452
    iget-object v3, v3, LE5/g0;->l:LE5/g0;

    .line 453
    .line 454
    iput-object v3, v0, LE5/i0;->i:LE5/g0;

    .line 455
    .line 456
    invoke-virtual {v0}, LE5/i0;->j()V

    .line 457
    .line 458
    .line 459
    iget-object v0, v0, LE5/i0;->i:LE5/g0;

    .line 460
    .line 461
    iget-object v13, v0, LE5/g0;->n:Lr6/s;

    .line 462
    .line 463
    iget-object v3, v1, LE5/O;->w:LE5/q0;

    .line 464
    .line 465
    iget-object v3, v3, LE5/q0;->a:LE5/J0;

    .line 466
    .line 467
    iget-object v4, v0, LE5/g0;->f:LE5/h0;

    .line 468
    .line 469
    iget-object v4, v4, LE5/h0;->a:Lf6/z;

    .line 470
    .line 471
    iget-object v2, v2, LE5/g0;->f:LE5/h0;

    .line 472
    .line 473
    iget-object v5, v2, LE5/h0;->a:Lf6/z;

    .line 474
    .line 475
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    move-object v2, v3

    .line 481
    move-object v3, v4

    .line 482
    move-object v4, v2

    .line 483
    move-wide/from16 v20, v11

    .line 484
    .line 485
    move-wide/from16 v10, v16

    .line 486
    .line 487
    invoke-virtual/range {v1 .. v7}, LE5/O;->f0(LE5/J0;Lf6/z;LE5/J0;Lf6/z;J)V

    .line 488
    .line 489
    .line 490
    iget-boolean v2, v0, LE5/g0;->d:Z

    .line 491
    .line 492
    if-eqz v2, :cond_18

    .line 493
    .line 494
    iget-object v2, v0, LE5/g0;->a:Ljava/lang/Object;

    .line 495
    .line 496
    invoke-interface {v2}, Lf6/w;->f()J

    .line 497
    .line 498
    .line 499
    move-result-wide v2

    .line 500
    cmp-long v2, v2, v10

    .line 501
    .line 502
    if-eqz v2, :cond_18

    .line 503
    .line 504
    invoke-virtual {v0}, LE5/g0;->e()J

    .line 505
    .line 506
    .line 507
    move-result-wide v2

    .line 508
    array-length v0, v8

    .line 509
    move v4, v15

    .line 510
    :goto_b
    if-ge v4, v0, :cond_1f

    .line 511
    .line 512
    aget-object v5, v8, v4

    .line 513
    .line 514
    iget-object v6, v5, LE5/f;->g:Lf6/V;

    .line 515
    .line 516
    if-eqz v6, :cond_17

    .line 517
    .line 518
    invoke-static {v5, v2, v3}, LE5/O;->M(LE5/f;J)V

    .line 519
    .line 520
    .line 521
    :cond_17
    add-int/lit8 v4, v4, 0x1

    .line 522
    .line 523
    goto :goto_b

    .line 524
    :cond_18
    move v2, v15

    .line 525
    :goto_c
    array-length v3, v8

    .line 526
    if-ge v2, v3, :cond_1f

    .line 527
    .line 528
    invoke-virtual {v9, v2}, Lr6/s;->b(I)Z

    .line 529
    .line 530
    .line 531
    move-result v3

    .line 532
    invoke-virtual {v13, v2}, Lr6/s;->b(I)Z

    .line 533
    .line 534
    .line 535
    move-result v4

    .line 536
    if-eqz v3, :cond_1b

    .line 537
    .line 538
    aget-object v3, v8, v2

    .line 539
    .line 540
    iget-boolean v3, v3, LE5/f;->k:Z

    .line 541
    .line 542
    if-nez v3, :cond_1b

    .line 543
    .line 544
    iget-object v3, v1, LE5/O;->c:[LE5/f;

    .line 545
    .line 546
    aget-object v3, v3, v2

    .line 547
    .line 548
    iget v3, v3, LE5/f;->a:I

    .line 549
    .line 550
    const/4 v5, -0x2

    .line 551
    if-ne v3, v5, :cond_19

    .line 552
    .line 553
    move/from16 v3, v18

    .line 554
    .line 555
    goto :goto_d

    .line 556
    :cond_19
    move v3, v15

    .line 557
    :goto_d
    iget-object v5, v9, Lr6/s;->b:[LE5/B0;

    .line 558
    .line 559
    aget-object v5, v5, v2

    .line 560
    .line 561
    iget-object v6, v13, Lr6/s;->b:[LE5/B0;

    .line 562
    .line 563
    aget-object v6, v6, v2

    .line 564
    .line 565
    if-eqz v4, :cond_1a

    .line 566
    .line 567
    invoke-virtual {v6, v5}, LE5/B0;->equals(Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    move-result v4

    .line 571
    if-eqz v4, :cond_1a

    .line 572
    .line 573
    if-eqz v3, :cond_1b

    .line 574
    .line 575
    :cond_1a
    aget-object v3, v8, v2

    .line 576
    .line 577
    invoke-virtual {v0}, LE5/g0;->e()J

    .line 578
    .line 579
    .line 580
    move-result-wide v4

    .line 581
    invoke-static {v3, v4, v5}, LE5/O;->M(LE5/f;J)V

    .line 582
    .line 583
    .line 584
    :cond_1b
    add-int/lit8 v2, v2, 0x1

    .line 585
    .line 586
    goto :goto_c

    .line 587
    :goto_e
    iget-object v0, v2, LE5/g0;->f:LE5/h0;

    .line 588
    .line 589
    iget-boolean v0, v0, LE5/h0;->i:Z

    .line 590
    .line 591
    if-nez v0, :cond_1c

    .line 592
    .line 593
    iget-boolean v0, v1, LE5/O;->A:Z

    .line 594
    .line 595
    if-eqz v0, :cond_1f

    .line 596
    .line 597
    :cond_1c
    move v0, v15

    .line 598
    :goto_f
    array-length v3, v8

    .line 599
    if-ge v0, v3, :cond_1f

    .line 600
    .line 601
    aget-object v3, v8, v0

    .line 602
    .line 603
    iget-object v4, v2, LE5/g0;->c:[Lf6/V;

    .line 604
    .line 605
    aget-object v4, v4, v0

    .line 606
    .line 607
    if-eqz v4, :cond_1e

    .line 608
    .line 609
    iget-object v5, v3, LE5/f;->g:Lf6/V;

    .line 610
    .line 611
    if-ne v5, v4, :cond_1e

    .line 612
    .line 613
    invoke-virtual {v3}, LE5/f;->h()Z

    .line 614
    .line 615
    .line 616
    move-result v4

    .line 617
    if-eqz v4, :cond_1e

    .line 618
    .line 619
    iget-object v4, v2, LE5/g0;->f:LE5/h0;

    .line 620
    .line 621
    iget-wide v4, v4, LE5/h0;->e:J

    .line 622
    .line 623
    cmp-long v6, v4, v10

    .line 624
    .line 625
    if-eqz v6, :cond_1d

    .line 626
    .line 627
    cmp-long v6, v4, v25

    .line 628
    .line 629
    if-eqz v6, :cond_1d

    .line 630
    .line 631
    iget-wide v6, v2, LE5/g0;->o:J

    .line 632
    .line 633
    add-long/2addr v4, v6

    .line 634
    goto :goto_10

    .line 635
    :cond_1d
    move-wide v4, v10

    .line 636
    :goto_10
    invoke-static {v3, v4, v5}, LE5/O;->M(LE5/f;J)V

    .line 637
    .line 638
    .line 639
    :cond_1e
    add-int/lit8 v0, v0, 0x1

    .line 640
    .line 641
    goto :goto_f

    .line 642
    :cond_1f
    :goto_11
    iget-object v0, v1, LE5/O;->r:LE5/i0;

    .line 643
    .line 644
    iget-object v2, v0, LE5/i0;->i:LE5/g0;

    .line 645
    .line 646
    if-eqz v2, :cond_29

    .line 647
    .line 648
    iget-object v0, v0, LE5/i0;->h:LE5/g0;

    .line 649
    .line 650
    if-eq v0, v2, :cond_29

    .line 651
    .line 652
    iget-boolean v0, v2, LE5/g0;->g:Z

    .line 653
    .line 654
    if-eqz v0, :cond_20

    .line 655
    .line 656
    goto/16 :goto_17

    .line 657
    .line 658
    :cond_20
    iget-object v0, v2, LE5/g0;->n:Lr6/s;

    .line 659
    .line 660
    move v3, v15

    .line 661
    move v4, v3

    .line 662
    :goto_12
    iget-object v5, v1, LE5/O;->a:[LE5/f;

    .line 663
    .line 664
    array-length v6, v5

    .line 665
    if-ge v3, v6, :cond_28

    .line 666
    .line 667
    aget-object v5, v5, v3

    .line 668
    .line 669
    invoke-static {v5}, LE5/O;->q(LE5/f;)Z

    .line 670
    .line 671
    .line 672
    move-result v6

    .line 673
    if-nez v6, :cond_21

    .line 674
    .line 675
    goto :goto_16

    .line 676
    :cond_21
    iget-object v6, v5, LE5/f;->g:Lf6/V;

    .line 677
    .line 678
    iget-object v7, v2, LE5/g0;->c:[Lf6/V;

    .line 679
    .line 680
    aget-object v8, v7, v3

    .line 681
    .line 682
    if-eq v6, v8, :cond_22

    .line 683
    .line 684
    move/from16 v6, v18

    .line 685
    .line 686
    goto :goto_13

    .line 687
    :cond_22
    move v6, v15

    .line 688
    :goto_13
    invoke-virtual {v0, v3}, Lr6/s;->b(I)Z

    .line 689
    .line 690
    .line 691
    move-result v8

    .line 692
    if-eqz v8, :cond_23

    .line 693
    .line 694
    if-nez v6, :cond_23

    .line 695
    .line 696
    goto :goto_16

    .line 697
    :cond_23
    iget-boolean v6, v5, LE5/f;->k:Z

    .line 698
    .line 699
    if-nez v6, :cond_26

    .line 700
    .line 701
    iget-object v6, v0, Lr6/s;->c:[Lr6/n;

    .line 702
    .line 703
    aget-object v6, v6, v3

    .line 704
    .line 705
    if-eqz v6, :cond_24

    .line 706
    .line 707
    invoke-interface {v6}, Lr6/n;->length()I

    .line 708
    .line 709
    .line 710
    move-result v8

    .line 711
    goto :goto_14

    .line 712
    :cond_24
    move v8, v15

    .line 713
    :goto_14
    new-array v9, v8, [LE5/T;

    .line 714
    .line 715
    move v13, v15

    .line 716
    :goto_15
    if-ge v13, v8, :cond_25

    .line 717
    .line 718
    invoke-interface {v6, v13}, Lr6/n;->b(I)LE5/T;

    .line 719
    .line 720
    .line 721
    move-result-object v14

    .line 722
    aput-object v14, v9, v13

    .line 723
    .line 724
    add-int/lit8 v13, v13, 0x1

    .line 725
    .line 726
    goto :goto_15

    .line 727
    :cond_25
    aget-object v29, v7, v3

    .line 728
    .line 729
    invoke-virtual {v2}, LE5/g0;->e()J

    .line 730
    .line 731
    .line 732
    move-result-wide v30

    .line 733
    iget-wide v6, v2, LE5/g0;->o:J

    .line 734
    .line 735
    move-object/from16 v27, v5

    .line 736
    .line 737
    move-wide/from16 v32, v6

    .line 738
    .line 739
    move-object/from16 v28, v9

    .line 740
    .line 741
    invoke-virtual/range {v27 .. v33}, LE5/f;->t([LE5/T;Lf6/V;JJ)V

    .line 742
    .line 743
    .line 744
    goto :goto_16

    .line 745
    :cond_26
    invoke-virtual {v5}, LE5/f;->i()Z

    .line 746
    .line 747
    .line 748
    move-result v6

    .line 749
    if-eqz v6, :cond_27

    .line 750
    .line 751
    invoke-virtual {v1, v5}, LE5/O;->d(LE5/f;)V

    .line 752
    .line 753
    .line 754
    goto :goto_16

    .line 755
    :cond_27
    move/from16 v4, v18

    .line 756
    .line 757
    :goto_16
    add-int/lit8 v3, v3, 0x1

    .line 758
    .line 759
    goto :goto_12

    .line 760
    :cond_28
    if-nez v4, :cond_29

    .line 761
    .line 762
    array-length v0, v5

    .line 763
    new-array v0, v0, [Z

    .line 764
    .line 765
    invoke-virtual {v1, v0}, LE5/O;->f([Z)V

    .line 766
    .line 767
    .line 768
    :cond_29
    :goto_17
    move v0, v15

    .line 769
    :goto_18
    invoke-virtual {v1}, LE5/O;->X()Z

    .line 770
    .line 771
    .line 772
    move-result v2

    .line 773
    if-nez v2, :cond_2b

    .line 774
    .line 775
    :cond_2a
    :goto_19
    move-wide v13, v10

    .line 776
    move/from16 v0, v18

    .line 777
    .line 778
    const/4 v12, 0x0

    .line 779
    goto/16 :goto_1b

    .line 780
    .line 781
    :cond_2b
    iget-boolean v2, v1, LE5/O;->A:Z

    .line 782
    .line 783
    if-eqz v2, :cond_2c

    .line 784
    .line 785
    goto :goto_19

    .line 786
    :cond_2c
    iget-object v2, v1, LE5/O;->r:LE5/i0;

    .line 787
    .line 788
    iget-object v3, v2, LE5/i0;->h:LE5/g0;

    .line 789
    .line 790
    if-nez v3, :cond_2d

    .line 791
    .line 792
    goto :goto_19

    .line 793
    :cond_2d
    iget-object v3, v3, LE5/g0;->l:LE5/g0;

    .line 794
    .line 795
    if-eqz v3, :cond_2a

    .line 796
    .line 797
    iget-wide v4, v1, LE5/O;->K:J

    .line 798
    .line 799
    invoke-virtual {v3}, LE5/g0;->e()J

    .line 800
    .line 801
    .line 802
    move-result-wide v6

    .line 803
    cmp-long v4, v4, v6

    .line 804
    .line 805
    if-ltz v4, :cond_2a

    .line 806
    .line 807
    iget-boolean v3, v3, LE5/g0;->g:Z

    .line 808
    .line 809
    if-eqz v3, :cond_2a

    .line 810
    .line 811
    if-eqz v0, :cond_2e

    .line 812
    .line 813
    invoke-virtual {v1}, LE5/O;->t()V

    .line 814
    .line 815
    .line 816
    :cond_2e
    invoke-virtual {v2}, LE5/i0;->a()LE5/g0;

    .line 817
    .line 818
    .line 819
    move-result-object v0

    .line 820
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 821
    .line 822
    .line 823
    iget-object v2, v1, LE5/O;->w:LE5/q0;

    .line 824
    .line 825
    iget-object v2, v2, LE5/q0;->b:Lf6/z;

    .line 826
    .line 827
    iget-object v2, v2, Lf6/x;->a:Ljava/lang/Object;

    .line 828
    .line 829
    iget-object v3, v0, LE5/g0;->f:LE5/h0;

    .line 830
    .line 831
    iget-object v3, v3, LE5/h0;->a:Lf6/z;

    .line 832
    .line 833
    iget-object v3, v3, Lf6/x;->a:Ljava/lang/Object;

    .line 834
    .line 835
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 836
    .line 837
    .line 838
    move-result v2

    .line 839
    if-eqz v2, :cond_2f

    .line 840
    .line 841
    iget-object v2, v1, LE5/O;->w:LE5/q0;

    .line 842
    .line 843
    iget-object v2, v2, LE5/q0;->b:Lf6/z;

    .line 844
    .line 845
    iget v3, v2, Lf6/x;->b:I

    .line 846
    .line 847
    const/4 v4, -0x1

    .line 848
    if-ne v3, v4, :cond_2f

    .line 849
    .line 850
    iget-object v3, v0, LE5/g0;->f:LE5/h0;

    .line 851
    .line 852
    iget-object v3, v3, LE5/h0;->a:Lf6/z;

    .line 853
    .line 854
    iget v5, v3, Lf6/x;->b:I

    .line 855
    .line 856
    if-ne v5, v4, :cond_2f

    .line 857
    .line 858
    iget v2, v2, Lf6/x;->e:I

    .line 859
    .line 860
    iget v3, v3, Lf6/x;->e:I

    .line 861
    .line 862
    if-eq v2, v3, :cond_2f

    .line 863
    .line 864
    move/from16 v2, v18

    .line 865
    .line 866
    goto :goto_1a

    .line 867
    :cond_2f
    move v2, v15

    .line 868
    :goto_1a
    iget-object v0, v0, LE5/g0;->f:LE5/h0;

    .line 869
    .line 870
    move v3, v2

    .line 871
    iget-object v2, v0, LE5/h0;->a:Lf6/z;

    .line 872
    .line 873
    move v5, v3

    .line 874
    iget-wide v3, v0, LE5/h0;->b:J

    .line 875
    .line 876
    iget-wide v6, v0, LE5/h0;->c:J

    .line 877
    .line 878
    xor-int/lit8 v9, v5, 0x1

    .line 879
    .line 880
    move-wide/from16 v16, v10

    .line 881
    .line 882
    const/4 v10, 0x0

    .line 883
    move-wide v5, v6

    .line 884
    move-wide v7, v3

    .line 885
    move-wide/from16 v13, v16

    .line 886
    .line 887
    move/from16 v0, v18

    .line 888
    .line 889
    const/4 v12, 0x0

    .line 890
    invoke-virtual/range {v1 .. v10}, LE5/O;->o(Lf6/z;JJJZI)LE5/q0;

    .line 891
    .line 892
    .line 893
    move-result-object v2

    .line 894
    iput-object v2, v1, LE5/O;->w:LE5/q0;

    .line 895
    .line 896
    invoke-virtual {v1}, LE5/O;->C()V

    .line 897
    .line 898
    .line 899
    invoke-virtual {v1}, LE5/O;->e0()V

    .line 900
    .line 901
    .line 902
    move-wide v10, v13

    .line 903
    goto/16 :goto_18

    .line 904
    .line 905
    :goto_1b
    iget-object v2, v1, LE5/O;->w:LE5/q0;

    .line 906
    .line 907
    iget v2, v2, LE5/q0;->e:I

    .line 908
    .line 909
    if-eq v2, v0, :cond_64

    .line 910
    .line 911
    const/4 v3, 0x4

    .line 912
    if-ne v2, v3, :cond_30

    .line 913
    .line 914
    goto/16 :goto_3a

    .line 915
    .line 916
    :cond_30
    iget-object v2, v1, LE5/O;->r:LE5/i0;

    .line 917
    .line 918
    iget-object v2, v2, LE5/i0;->h:LE5/g0;

    .line 919
    .line 920
    const-wide/16 v4, 0xa

    .line 921
    .line 922
    if-nez v2, :cond_31

    .line 923
    .line 924
    add-long v11, v20, v4

    .line 925
    .line 926
    iget-object v0, v1, LE5/O;->h:Lu6/s;

    .line 927
    .line 928
    iget-object v0, v0, Lu6/s;->a:Landroid/os/Handler;

    .line 929
    .line 930
    const/4 v2, 0x2

    .line 931
    invoke-virtual {v0, v2, v11, v12}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    .line 932
    .line 933
    .line 934
    return-void

    .line 935
    :cond_31
    const-string v6, "doSomeWork"

    .line 936
    .line 937
    invoke-static {v6}, Lu6/a;->b(Ljava/lang/String;)V

    .line 938
    .line 939
    .line 940
    invoke-virtual {v1}, LE5/O;->e0()V

    .line 941
    .line 942
    .line 943
    iget-boolean v6, v2, LE5/g0;->d:Z

    .line 944
    .line 945
    const-wide/16 v7, 0x3e8

    .line 946
    .line 947
    if-eqz v6, :cond_3b

    .line 948
    .line 949
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 950
    .line 951
    .line 952
    move-result-wide v9

    .line 953
    mul-long/2addr v9, v7

    .line 954
    iget-object v6, v2, LE5/g0;->a:Ljava/lang/Object;

    .line 955
    .line 956
    iget-object v11, v1, LE5/O;->w:LE5/q0;

    .line 957
    .line 958
    move-wide/from16 v16, v4

    .line 959
    .line 960
    iget-wide v4, v11, LE5/q0;->r:J

    .line 961
    .line 962
    move-wide/from16 v22, v7

    .line 963
    .line 964
    iget-wide v7, v1, LE5/O;->m:J

    .line 965
    .line 966
    sub-long/2addr v4, v7

    .line 967
    invoke-interface {v6, v4, v5}, Lf6/w;->i(J)V

    .line 968
    .line 969
    .line 970
    move v4, v0

    .line 971
    move v5, v4

    .line 972
    move v8, v15

    .line 973
    :goto_1c
    iget-object v6, v1, LE5/O;->a:[LE5/f;

    .line 974
    .line 975
    array-length v7, v6

    .line 976
    if-ge v8, v7, :cond_3a

    .line 977
    .line 978
    aget-object v6, v6, v8

    .line 979
    .line 980
    invoke-static {v6}, LE5/O;->q(LE5/f;)Z

    .line 981
    .line 982
    .line 983
    move-result v7

    .line 984
    if-nez v7, :cond_32

    .line 985
    .line 986
    move-wide/from16 v27, v13

    .line 987
    .line 988
    goto :goto_23

    .line 989
    :cond_32
    move-wide/from16 v27, v13

    .line 990
    .line 991
    iget-wide v13, v1, LE5/O;->K:J

    .line 992
    .line 993
    invoke-virtual {v6, v13, v14, v9, v10}, LE5/f;->s(JJ)V

    .line 994
    .line 995
    .line 996
    if-eqz v4, :cond_33

    .line 997
    .line 998
    invoke-virtual {v6}, LE5/f;->i()Z

    .line 999
    .line 1000
    .line 1001
    move-result v4

    .line 1002
    if-eqz v4, :cond_33

    .line 1003
    .line 1004
    move v4, v0

    .line 1005
    goto :goto_1d

    .line 1006
    :cond_33
    move v4, v15

    .line 1007
    :goto_1d
    iget-object v7, v2, LE5/g0;->c:[Lf6/V;

    .line 1008
    .line 1009
    aget-object v7, v7, v8

    .line 1010
    .line 1011
    iget-object v11, v6, LE5/f;->g:Lf6/V;

    .line 1012
    .line 1013
    if-eq v7, v11, :cond_34

    .line 1014
    .line 1015
    move v7, v0

    .line 1016
    goto :goto_1e

    .line 1017
    :cond_34
    move v7, v15

    .line 1018
    :goto_1e
    if-nez v7, :cond_35

    .line 1019
    .line 1020
    invoke-virtual {v6}, LE5/f;->h()Z

    .line 1021
    .line 1022
    .line 1023
    move-result v11

    .line 1024
    if-eqz v11, :cond_35

    .line 1025
    .line 1026
    move v11, v0

    .line 1027
    goto :goto_1f

    .line 1028
    :cond_35
    move v11, v15

    .line 1029
    :goto_1f
    if-nez v7, :cond_37

    .line 1030
    .line 1031
    if-nez v11, :cond_37

    .line 1032
    .line 1033
    invoke-virtual {v6}, LE5/f;->j()Z

    .line 1034
    .line 1035
    .line 1036
    move-result v7

    .line 1037
    if-nez v7, :cond_37

    .line 1038
    .line 1039
    invoke-virtual {v6}, LE5/f;->i()Z

    .line 1040
    .line 1041
    .line 1042
    move-result v7

    .line 1043
    if-eqz v7, :cond_36

    .line 1044
    .line 1045
    goto :goto_20

    .line 1046
    :cond_36
    move v7, v15

    .line 1047
    goto :goto_21

    .line 1048
    :cond_37
    :goto_20
    move v7, v0

    .line 1049
    :goto_21
    if-eqz v5, :cond_38

    .line 1050
    .line 1051
    if-eqz v7, :cond_38

    .line 1052
    .line 1053
    move v5, v0

    .line 1054
    goto :goto_22

    .line 1055
    :cond_38
    move v5, v15

    .line 1056
    :goto_22
    if-nez v7, :cond_39

    .line 1057
    .line 1058
    iget-object v6, v6, LE5/f;->g:Lf6/V;

    .line 1059
    .line 1060
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1061
    .line 1062
    .line 1063
    invoke-interface {v6}, Lf6/V;->a()V

    .line 1064
    .line 1065
    .line 1066
    :cond_39
    :goto_23
    add-int/lit8 v8, v8, 0x1

    .line 1067
    .line 1068
    move-wide/from16 v13, v27

    .line 1069
    .line 1070
    goto :goto_1c

    .line 1071
    :cond_3a
    move-wide/from16 v27, v13

    .line 1072
    .line 1073
    move v9, v4

    .line 1074
    goto :goto_24

    .line 1075
    :cond_3b
    move-wide/from16 v16, v4

    .line 1076
    .line 1077
    move-wide/from16 v22, v7

    .line 1078
    .line 1079
    move-wide/from16 v27, v13

    .line 1080
    .line 1081
    iget-object v4, v2, LE5/g0;->a:Ljava/lang/Object;

    .line 1082
    .line 1083
    invoke-interface {v4}, Lf6/w;->h()V

    .line 1084
    .line 1085
    .line 1086
    move v5, v0

    .line 1087
    move v9, v5

    .line 1088
    :goto_24
    iget-object v4, v2, LE5/g0;->f:LE5/h0;

    .line 1089
    .line 1090
    iget-wide v6, v4, LE5/h0;->e:J

    .line 1091
    .line 1092
    if-eqz v9, :cond_3d

    .line 1093
    .line 1094
    iget-boolean v4, v2, LE5/g0;->d:Z

    .line 1095
    .line 1096
    if-eqz v4, :cond_3d

    .line 1097
    .line 1098
    cmp-long v4, v6, v27

    .line 1099
    .line 1100
    if-eqz v4, :cond_3c

    .line 1101
    .line 1102
    iget-object v4, v1, LE5/O;->w:LE5/q0;

    .line 1103
    .line 1104
    iget-wide v8, v4, LE5/q0;->r:J

    .line 1105
    .line 1106
    cmp-long v4, v6, v8

    .line 1107
    .line 1108
    if-gtz v4, :cond_3d

    .line 1109
    .line 1110
    :cond_3c
    move v8, v0

    .line 1111
    goto :goto_25

    .line 1112
    :cond_3d
    move v8, v15

    .line 1113
    :goto_25
    if-eqz v8, :cond_3e

    .line 1114
    .line 1115
    iget-boolean v4, v1, LE5/O;->A:Z

    .line 1116
    .line 1117
    if-eqz v4, :cond_3e

    .line 1118
    .line 1119
    iput-boolean v15, v1, LE5/O;->A:Z

    .line 1120
    .line 1121
    iget-object v4, v1, LE5/O;->w:LE5/q0;

    .line 1122
    .line 1123
    iget v4, v4, LE5/q0;->m:I

    .line 1124
    .line 1125
    const/4 v6, 0x5

    .line 1126
    invoke-virtual {v1, v4, v6, v15, v15}, LE5/O;->R(IIZZ)V

    .line 1127
    .line 1128
    .line 1129
    :cond_3e
    if-eqz v8, :cond_3f

    .line 1130
    .line 1131
    iget-object v6, v2, LE5/g0;->f:LE5/h0;

    .line 1132
    .line 1133
    iget-boolean v6, v6, LE5/h0;->i:Z

    .line 1134
    .line 1135
    if-eqz v6, :cond_3f

    .line 1136
    .line 1137
    invoke-virtual {v1, v3}, LE5/O;->W(I)V

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual {v1}, LE5/O;->b0()V

    .line 1141
    .line 1142
    .line 1143
    goto/16 :goto_31

    .line 1144
    .line 1145
    :cond_3f
    iget-object v6, v1, LE5/O;->w:LE5/q0;

    .line 1146
    .line 1147
    iget v7, v6, LE5/q0;->e:I

    .line 1148
    .line 1149
    const/4 v8, 0x2

    .line 1150
    if-ne v7, v8, :cond_4d

    .line 1151
    .line 1152
    iget v7, v1, LE5/O;->I:I

    .line 1153
    .line 1154
    if-nez v7, :cond_40

    .line 1155
    .line 1156
    invoke-virtual {v1}, LE5/O;->r()Z

    .line 1157
    .line 1158
    .line 1159
    move-result v8

    .line 1160
    goto/16 :goto_2d

    .line 1161
    .line 1162
    :cond_40
    if-nez v5, :cond_42

    .line 1163
    .line 1164
    :cond_41
    move v8, v15

    .line 1165
    goto/16 :goto_2d

    .line 1166
    .line 1167
    :cond_42
    iget-boolean v7, v6, LE5/q0;->g:Z

    .line 1168
    .line 1169
    if-nez v7, :cond_44

    .line 1170
    .line 1171
    :cond_43
    :goto_26
    move v8, v0

    .line 1172
    goto/16 :goto_2d

    .line 1173
    .line 1174
    :cond_44
    iget-object v6, v6, LE5/q0;->a:LE5/J0;

    .line 1175
    .line 1176
    iget-object v7, v1, LE5/O;->r:LE5/i0;

    .line 1177
    .line 1178
    iget-object v8, v7, LE5/i0;->h:LE5/g0;

    .line 1179
    .line 1180
    iget-object v8, v8, LE5/g0;->f:LE5/h0;

    .line 1181
    .line 1182
    iget-object v8, v8, LE5/h0;->a:Lf6/z;

    .line 1183
    .line 1184
    invoke-virtual {v1, v6, v8}, LE5/O;->Y(LE5/J0;Lf6/z;)Z

    .line 1185
    .line 1186
    .line 1187
    move-result v6

    .line 1188
    if-eqz v6, :cond_45

    .line 1189
    .line 1190
    iget-object v6, v1, LE5/O;->t:LE5/j;

    .line 1191
    .line 1192
    iget-wide v8, v6, LE5/j;->h:J

    .line 1193
    .line 1194
    goto :goto_27

    .line 1195
    :cond_45
    move-wide/from16 v8, v27

    .line 1196
    .line 1197
    :goto_27
    iget-object v6, v7, LE5/i0;->j:LE5/g0;

    .line 1198
    .line 1199
    iget-boolean v7, v6, LE5/g0;->d:Z

    .line 1200
    .line 1201
    if-eqz v7, :cond_47

    .line 1202
    .line 1203
    iget-boolean v7, v6, LE5/g0;->e:Z

    .line 1204
    .line 1205
    if-eqz v7, :cond_46

    .line 1206
    .line 1207
    iget-object v7, v6, LE5/g0;->a:Ljava/lang/Object;

    .line 1208
    .line 1209
    invoke-interface {v7}, Lf6/W;->n()J

    .line 1210
    .line 1211
    .line 1212
    move-result-wide v10

    .line 1213
    cmp-long v7, v10, v25

    .line 1214
    .line 1215
    if-nez v7, :cond_47

    .line 1216
    .line 1217
    :cond_46
    iget-object v7, v6, LE5/g0;->f:LE5/h0;

    .line 1218
    .line 1219
    iget-boolean v7, v7, LE5/h0;->i:Z

    .line 1220
    .line 1221
    if-eqz v7, :cond_47

    .line 1222
    .line 1223
    move v7, v0

    .line 1224
    goto :goto_28

    .line 1225
    :cond_47
    move v7, v15

    .line 1226
    :goto_28
    iget-object v10, v6, LE5/g0;->f:LE5/h0;

    .line 1227
    .line 1228
    iget-object v10, v10, LE5/h0;->a:Lf6/z;

    .line 1229
    .line 1230
    invoke-virtual {v10}, Lf6/x;->a()Z

    .line 1231
    .line 1232
    .line 1233
    move-result v10

    .line 1234
    if-eqz v10, :cond_48

    .line 1235
    .line 1236
    iget-boolean v6, v6, LE5/g0;->d:Z

    .line 1237
    .line 1238
    if-nez v6, :cond_48

    .line 1239
    .line 1240
    move v6, v0

    .line 1241
    goto :goto_29

    .line 1242
    :cond_48
    move v6, v15

    .line 1243
    :goto_29
    if-nez v7, :cond_43

    .line 1244
    .line 1245
    if-nez v6, :cond_43

    .line 1246
    .line 1247
    iget-object v6, v1, LE5/O;->w:LE5/q0;

    .line 1248
    .line 1249
    iget-wide v6, v6, LE5/q0;->p:J

    .line 1250
    .line 1251
    iget-object v10, v1, LE5/O;->r:LE5/i0;

    .line 1252
    .line 1253
    iget-object v10, v10, LE5/i0;->j:LE5/g0;

    .line 1254
    .line 1255
    const-wide/16 v13, 0x0

    .line 1256
    .line 1257
    if-nez v10, :cond_49

    .line 1258
    .line 1259
    move-wide v3, v13

    .line 1260
    goto :goto_2a

    .line 1261
    :cond_49
    iget-wide v3, v1, LE5/O;->K:J

    .line 1262
    .line 1263
    iget-wide v11, v10, LE5/g0;->o:J

    .line 1264
    .line 1265
    sub-long/2addr v3, v11

    .line 1266
    sub-long/2addr v6, v3

    .line 1267
    invoke-static {v13, v14, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 1268
    .line 1269
    .line 1270
    move-result-wide v3

    .line 1271
    :goto_2a
    iget-object v6, v1, LE5/O;->n:LE5/l;

    .line 1272
    .line 1273
    invoke-virtual {v6}, LE5/l;->e()LE5/r0;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v6

    .line 1277
    iget v6, v6, LE5/r0;->a:F

    .line 1278
    .line 1279
    iget-boolean v7, v1, LE5/O;->B:Z

    .line 1280
    .line 1281
    iget-object v10, v1, LE5/O;->f:LE5/k;

    .line 1282
    .line 1283
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1284
    .line 1285
    .line 1286
    const/high16 v11, 0x3f800000    # 1.0f

    .line 1287
    .line 1288
    cmpl-float v11, v6, v11

    .line 1289
    .line 1290
    if-nez v11, :cond_4a

    .line 1291
    .line 1292
    goto :goto_2b

    .line 1293
    :cond_4a
    long-to-double v3, v3

    .line 1294
    float-to-double v11, v6

    .line 1295
    div-double/2addr v3, v11

    .line 1296
    invoke-static {v3, v4}, Ljava/lang/Math;->round(D)J

    .line 1297
    .line 1298
    .line 1299
    move-result-wide v3

    .line 1300
    :goto_2b
    if-eqz v7, :cond_4b

    .line 1301
    .line 1302
    iget-wide v6, v10, LE5/k;->e:J

    .line 1303
    .line 1304
    goto :goto_2c

    .line 1305
    :cond_4b
    iget-wide v6, v10, LE5/k;->d:J

    .line 1306
    .line 1307
    :goto_2c
    cmp-long v11, v8, v27

    .line 1308
    .line 1309
    if-eqz v11, :cond_4c

    .line 1310
    .line 1311
    const-wide/16 v11, 0x2

    .line 1312
    .line 1313
    div-long/2addr v8, v11

    .line 1314
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 1315
    .line 1316
    .line 1317
    move-result-wide v6

    .line 1318
    :cond_4c
    cmp-long v8, v6, v13

    .line 1319
    .line 1320
    if-lez v8, :cond_43

    .line 1321
    .line 1322
    cmp-long v3, v3, v6

    .line 1323
    .line 1324
    if-gez v3, :cond_43

    .line 1325
    .line 1326
    iget-object v3, v10, LE5/k;->a:Lo2/e;

    .line 1327
    .line 1328
    monitor-enter v3

    .line 1329
    :try_start_0
    iget v4, v3, Lo2/e;->e:I

    .line 1330
    .line 1331
    iget v6, v3, Lo2/e;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1332
    .line 1333
    mul-int/2addr v4, v6

    .line 1334
    monitor-exit v3

    .line 1335
    iget v3, v10, LE5/k;->h:I

    .line 1336
    .line 1337
    if-lt v4, v3, :cond_41

    .line 1338
    .line 1339
    goto/16 :goto_26

    .line 1340
    .line 1341
    :catchall_0
    move-exception v0

    .line 1342
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1343
    throw v0

    .line 1344
    :goto_2d
    if-eqz v8, :cond_4d

    .line 1345
    .line 1346
    const/4 v3, 0x3

    .line 1347
    invoke-virtual {v1, v3}, LE5/O;->W(I)V

    .line 1348
    .line 1349
    .line 1350
    const/4 v12, 0x0

    .line 1351
    iput-object v12, v1, LE5/O;->N:LE5/o;

    .line 1352
    .line 1353
    invoke-virtual {v1}, LE5/O;->X()Z

    .line 1354
    .line 1355
    .line 1356
    move-result v4

    .line 1357
    if-eqz v4, :cond_56

    .line 1358
    .line 1359
    invoke-virtual {v1}, LE5/O;->Z()V

    .line 1360
    .line 1361
    .line 1362
    goto :goto_31

    .line 1363
    :cond_4d
    const/4 v3, 0x3

    .line 1364
    iget-object v4, v1, LE5/O;->w:LE5/q0;

    .line 1365
    .line 1366
    iget v4, v4, LE5/q0;->e:I

    .line 1367
    .line 1368
    if-ne v4, v3, :cond_56

    .line 1369
    .line 1370
    iget v3, v1, LE5/O;->I:I

    .line 1371
    .line 1372
    if-nez v3, :cond_4e

    .line 1373
    .line 1374
    invoke-virtual {v1}, LE5/O;->r()Z

    .line 1375
    .line 1376
    .line 1377
    move-result v3

    .line 1378
    if-eqz v3, :cond_4f

    .line 1379
    .line 1380
    goto :goto_31

    .line 1381
    :cond_4e
    if-nez v5, :cond_56

    .line 1382
    .line 1383
    :cond_4f
    invoke-virtual {v1}, LE5/O;->X()Z

    .line 1384
    .line 1385
    .line 1386
    move-result v3

    .line 1387
    iput-boolean v3, v1, LE5/O;->B:Z

    .line 1388
    .line 1389
    const/4 v8, 0x2

    .line 1390
    invoke-virtual {v1, v8}, LE5/O;->W(I)V

    .line 1391
    .line 1392
    .line 1393
    iget-boolean v3, v1, LE5/O;->B:Z

    .line 1394
    .line 1395
    if-eqz v3, :cond_55

    .line 1396
    .line 1397
    iget-object v3, v1, LE5/O;->r:LE5/i0;

    .line 1398
    .line 1399
    iget-object v3, v3, LE5/i0;->h:LE5/g0;

    .line 1400
    .line 1401
    :goto_2e
    if-eqz v3, :cond_52

    .line 1402
    .line 1403
    iget-object v4, v3, LE5/g0;->n:Lr6/s;

    .line 1404
    .line 1405
    iget-object v4, v4, Lr6/s;->c:[Lr6/n;

    .line 1406
    .line 1407
    array-length v5, v4

    .line 1408
    move v8, v15

    .line 1409
    :goto_2f
    if-ge v8, v5, :cond_51

    .line 1410
    .line 1411
    aget-object v6, v4, v8

    .line 1412
    .line 1413
    if-eqz v6, :cond_50

    .line 1414
    .line 1415
    invoke-interface {v6}, Lr6/n;->k()V

    .line 1416
    .line 1417
    .line 1418
    :cond_50
    add-int/lit8 v8, v8, 0x1

    .line 1419
    .line 1420
    goto :goto_2f

    .line 1421
    :cond_51
    iget-object v3, v3, LE5/g0;->l:LE5/g0;

    .line 1422
    .line 1423
    goto :goto_2e

    .line 1424
    :cond_52
    iget-object v3, v1, LE5/O;->t:LE5/j;

    .line 1425
    .line 1426
    iget-wide v4, v3, LE5/j;->h:J

    .line 1427
    .line 1428
    cmp-long v6, v4, v27

    .line 1429
    .line 1430
    if-nez v6, :cond_53

    .line 1431
    .line 1432
    goto :goto_30

    .line 1433
    :cond_53
    iget-wide v6, v3, LE5/j;->b:J

    .line 1434
    .line 1435
    add-long/2addr v4, v6

    .line 1436
    iput-wide v4, v3, LE5/j;->h:J

    .line 1437
    .line 1438
    iget-wide v6, v3, LE5/j;->g:J

    .line 1439
    .line 1440
    cmp-long v8, v6, v27

    .line 1441
    .line 1442
    if-eqz v8, :cond_54

    .line 1443
    .line 1444
    cmp-long v4, v4, v6

    .line 1445
    .line 1446
    if-lez v4, :cond_54

    .line 1447
    .line 1448
    iput-wide v6, v3, LE5/j;->h:J

    .line 1449
    .line 1450
    :cond_54
    move-wide/from16 v10, v27

    .line 1451
    .line 1452
    iput-wide v10, v3, LE5/j;->l:J

    .line 1453
    .line 1454
    :cond_55
    :goto_30
    invoke-virtual {v1}, LE5/O;->b0()V

    .line 1455
    .line 1456
    .line 1457
    :cond_56
    :goto_31
    iget-object v3, v1, LE5/O;->w:LE5/q0;

    .line 1458
    .line 1459
    iget v3, v3, LE5/q0;->e:I

    .line 1460
    .line 1461
    const/4 v8, 0x2

    .line 1462
    if-ne v3, v8, :cond_59

    .line 1463
    .line 1464
    move v8, v15

    .line 1465
    :goto_32
    iget-object v3, v1, LE5/O;->a:[LE5/f;

    .line 1466
    .line 1467
    array-length v4, v3

    .line 1468
    if-ge v8, v4, :cond_58

    .line 1469
    .line 1470
    aget-object v3, v3, v8

    .line 1471
    .line 1472
    invoke-static {v3}, LE5/O;->q(LE5/f;)Z

    .line 1473
    .line 1474
    .line 1475
    move-result v3

    .line 1476
    if-eqz v3, :cond_57

    .line 1477
    .line 1478
    iget-object v3, v1, LE5/O;->a:[LE5/f;

    .line 1479
    .line 1480
    aget-object v3, v3, v8

    .line 1481
    .line 1482
    iget-object v3, v3, LE5/f;->g:Lf6/V;

    .line 1483
    .line 1484
    iget-object v4, v2, LE5/g0;->c:[Lf6/V;

    .line 1485
    .line 1486
    aget-object v4, v4, v8

    .line 1487
    .line 1488
    if-ne v3, v4, :cond_57

    .line 1489
    .line 1490
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1491
    .line 1492
    .line 1493
    invoke-interface {v3}, Lf6/V;->a()V

    .line 1494
    .line 1495
    .line 1496
    :cond_57
    add-int/lit8 v8, v8, 0x1

    .line 1497
    .line 1498
    goto :goto_32

    .line 1499
    :cond_58
    iget-object v2, v1, LE5/O;->w:LE5/q0;

    .line 1500
    .line 1501
    iget-boolean v3, v2, LE5/q0;->g:Z

    .line 1502
    .line 1503
    if-nez v3, :cond_59

    .line 1504
    .line 1505
    iget-wide v2, v2, LE5/q0;->q:J

    .line 1506
    .line 1507
    const-wide/32 v4, 0x7a120

    .line 1508
    .line 1509
    .line 1510
    cmp-long v2, v2, v4

    .line 1511
    .line 1512
    if-gez v2, :cond_59

    .line 1513
    .line 1514
    invoke-virtual {v1}, LE5/O;->p()Z

    .line 1515
    .line 1516
    .line 1517
    move-result v2

    .line 1518
    if-eqz v2, :cond_59

    .line 1519
    .line 1520
    move v8, v0

    .line 1521
    goto :goto_33

    .line 1522
    :cond_59
    move v8, v15

    .line 1523
    :goto_33
    if-nez v8, :cond_5a

    .line 1524
    .line 1525
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    iput-wide v10, v1, LE5/O;->O:J

    .line 1531
    .line 1532
    goto :goto_34

    .line 1533
    :cond_5a
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    iget-wide v2, v1, LE5/O;->O:J

    .line 1539
    .line 1540
    cmp-long v2, v2, v10

    .line 1541
    .line 1542
    if-nez v2, :cond_5b

    .line 1543
    .line 1544
    iget-object v2, v1, LE5/O;->p:Lu6/q;

    .line 1545
    .line 1546
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1547
    .line 1548
    .line 1549
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1550
    .line 1551
    .line 1552
    move-result-wide v2

    .line 1553
    iput-wide v2, v1, LE5/O;->O:J

    .line 1554
    .line 1555
    goto :goto_34

    .line 1556
    :cond_5b
    iget-object v2, v1, LE5/O;->p:Lu6/q;

    .line 1557
    .line 1558
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1559
    .line 1560
    .line 1561
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1562
    .line 1563
    .line 1564
    move-result-wide v2

    .line 1565
    iget-wide v4, v1, LE5/O;->O:J

    .line 1566
    .line 1567
    sub-long/2addr v2, v4

    .line 1568
    const-wide/16 v4, 0xfa0

    .line 1569
    .line 1570
    cmp-long v2, v2, v4

    .line 1571
    .line 1572
    if-gez v2, :cond_63

    .line 1573
    .line 1574
    :goto_34
    invoke-virtual {v1}, LE5/O;->X()Z

    .line 1575
    .line 1576
    .line 1577
    move-result v2

    .line 1578
    if-eqz v2, :cond_5c

    .line 1579
    .line 1580
    iget-object v2, v1, LE5/O;->w:LE5/q0;

    .line 1581
    .line 1582
    iget v2, v2, LE5/q0;->e:I

    .line 1583
    .line 1584
    const/4 v3, 0x3

    .line 1585
    if-ne v2, v3, :cond_5c

    .line 1586
    .line 1587
    move v8, v0

    .line 1588
    goto :goto_35

    .line 1589
    :cond_5c
    move v8, v15

    .line 1590
    :goto_35
    iget-boolean v2, v1, LE5/O;->H:Z

    .line 1591
    .line 1592
    if-eqz v2, :cond_5d

    .line 1593
    .line 1594
    iget-boolean v2, v1, LE5/O;->G:Z

    .line 1595
    .line 1596
    if-eqz v2, :cond_5d

    .line 1597
    .line 1598
    if-eqz v8, :cond_5d

    .line 1599
    .line 1600
    goto :goto_36

    .line 1601
    :cond_5d
    move v0, v15

    .line 1602
    :goto_36
    iget-object v2, v1, LE5/O;->w:LE5/q0;

    .line 1603
    .line 1604
    iget-boolean v3, v2, LE5/q0;->o:Z

    .line 1605
    .line 1606
    if-eq v3, v0, :cond_5e

    .line 1607
    .line 1608
    new-instance v26, LE5/q0;

    .line 1609
    .line 1610
    iget-object v3, v2, LE5/q0;->a:LE5/J0;

    .line 1611
    .line 1612
    iget-object v4, v2, LE5/q0;->b:Lf6/z;

    .line 1613
    .line 1614
    iget-wide v5, v2, LE5/q0;->c:J

    .line 1615
    .line 1616
    iget-wide v9, v2, LE5/q0;->d:J

    .line 1617
    .line 1618
    iget v7, v2, LE5/q0;->e:I

    .line 1619
    .line 1620
    iget-object v11, v2, LE5/q0;->f:LE5/o;

    .line 1621
    .line 1622
    iget-boolean v12, v2, LE5/q0;->g:Z

    .line 1623
    .line 1624
    iget-object v13, v2, LE5/q0;->h:Lf6/a0;

    .line 1625
    .line 1626
    iget-object v14, v2, LE5/q0;->i:Lr6/s;

    .line 1627
    .line 1628
    iget-object v15, v2, LE5/q0;->j:Ljava/util/List;

    .line 1629
    .line 1630
    move/from16 v49, v0

    .line 1631
    .line 1632
    iget-object v0, v2, LE5/q0;->k:Lf6/z;

    .line 1633
    .line 1634
    move-object/from16 v39, v0

    .line 1635
    .line 1636
    iget-boolean v0, v2, LE5/q0;->l:Z

    .line 1637
    .line 1638
    move/from16 v40, v0

    .line 1639
    .line 1640
    iget v0, v2, LE5/q0;->m:I

    .line 1641
    .line 1642
    move/from16 v41, v0

    .line 1643
    .line 1644
    iget-object v0, v2, LE5/q0;->n:LE5/r0;

    .line 1645
    .line 1646
    move-object/from16 v27, v3

    .line 1647
    .line 1648
    move-object/from16 v28, v4

    .line 1649
    .line 1650
    iget-wide v3, v2, LE5/q0;->p:J

    .line 1651
    .line 1652
    move-wide/from16 v43, v3

    .line 1653
    .line 1654
    iget-wide v3, v2, LE5/q0;->q:J

    .line 1655
    .line 1656
    move-wide/from16 v45, v3

    .line 1657
    .line 1658
    iget-wide v2, v2, LE5/q0;->r:J

    .line 1659
    .line 1660
    move-object/from16 v42, v0

    .line 1661
    .line 1662
    move-wide/from16 v47, v2

    .line 1663
    .line 1664
    move-wide/from16 v29, v5

    .line 1665
    .line 1666
    move/from16 v33, v7

    .line 1667
    .line 1668
    move-wide/from16 v31, v9

    .line 1669
    .line 1670
    move-object/from16 v34, v11

    .line 1671
    .line 1672
    move/from16 v35, v12

    .line 1673
    .line 1674
    move-object/from16 v36, v13

    .line 1675
    .line 1676
    move-object/from16 v37, v14

    .line 1677
    .line 1678
    move-object/from16 v38, v15

    .line 1679
    .line 1680
    invoke-direct/range {v26 .. v49}, LE5/q0;-><init>(LE5/J0;Lf6/z;JJILE5/o;ZLf6/a0;Lr6/s;Ljava/util/List;Lf6/z;ZILE5/r0;JJJZ)V

    .line 1681
    .line 1682
    .line 1683
    move-object/from16 v0, v26

    .line 1684
    .line 1685
    iput-object v0, v1, LE5/O;->w:LE5/q0;

    .line 1686
    .line 1687
    const/4 v15, 0x0

    .line 1688
    goto :goto_37

    .line 1689
    :cond_5e
    move/from16 v49, v0

    .line 1690
    .line 1691
    :goto_37
    iput-boolean v15, v1, LE5/O;->G:Z

    .line 1692
    .line 1693
    if-nez v49, :cond_62

    .line 1694
    .line 1695
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 1696
    .line 1697
    iget v0, v0, LE5/q0;->e:I

    .line 1698
    .line 1699
    const/4 v11, 0x4

    .line 1700
    if-ne v0, v11, :cond_5f

    .line 1701
    .line 1702
    goto :goto_39

    .line 1703
    :cond_5f
    if-nez v8, :cond_61

    .line 1704
    .line 1705
    const/4 v8, 0x2

    .line 1706
    if-ne v0, v8, :cond_60

    .line 1707
    .line 1708
    goto :goto_38

    .line 1709
    :cond_60
    const/4 v3, 0x3

    .line 1710
    if-ne v0, v3, :cond_62

    .line 1711
    .line 1712
    iget v0, v1, LE5/O;->I:I

    .line 1713
    .line 1714
    if-eqz v0, :cond_62

    .line 1715
    .line 1716
    add-long v11, v20, v22

    .line 1717
    .line 1718
    iget-object v0, v1, LE5/O;->h:Lu6/s;

    .line 1719
    .line 1720
    iget-object v0, v0, Lu6/s;->a:Landroid/os/Handler;

    .line 1721
    .line 1722
    invoke-virtual {v0, v8, v11, v12}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    .line 1723
    .line 1724
    .line 1725
    goto :goto_39

    .line 1726
    :cond_61
    const/4 v8, 0x2

    .line 1727
    :goto_38
    add-long v11, v20, v16

    .line 1728
    .line 1729
    iget-object v0, v1, LE5/O;->h:Lu6/s;

    .line 1730
    .line 1731
    iget-object v0, v0, Lu6/s;->a:Landroid/os/Handler;

    .line 1732
    .line 1733
    invoke-virtual {v0, v8, v11, v12}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    .line 1734
    .line 1735
    .line 1736
    :cond_62
    :goto_39
    invoke-static {}, Lu6/a;->q()V

    .line 1737
    .line 1738
    .line 1739
    return-void

    .line 1740
    :cond_63
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1741
    .line 1742
    const-string v2, "Playback stuck buffering and not loading"

    .line 1743
    .line 1744
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1745
    .line 1746
    .line 1747
    throw v0

    .line 1748
    :cond_64
    :goto_3a
    return-void
.end method

.method public final e0()V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v10, 0x3

    .line 4
    const/4 v11, 0x0

    .line 5
    const/4 v12, 0x1

    .line 6
    iget-object v1, v0, LE5/O;->r:LE5/i0;

    .line 7
    .line 8
    iget-object v1, v1, LE5/i0;->h:LE5/g0;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_e

    .line 13
    .line 14
    :cond_0
    iget-boolean v2, v1, LE5/g0;->d:Z

    .line 15
    .line 16
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object v2, v1, LE5/g0;->a:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-interface {v2}, Lf6/w;->f()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-wide v2, v13

    .line 31
    :goto_0
    cmp-long v4, v2, v13

    .line 32
    .line 33
    if-eqz v4, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0, v2, v3}, LE5/O;->D(J)V

    .line 36
    .line 37
    .line 38
    iget-object v1, v0, LE5/O;->w:LE5/q0;

    .line 39
    .line 40
    iget-wide v4, v1, LE5/q0;->r:J

    .line 41
    .line 42
    cmp-long v1, v2, v4

    .line 43
    .line 44
    if-eqz v1, :cond_10

    .line 45
    .line 46
    iget-object v1, v0, LE5/O;->w:LE5/q0;

    .line 47
    .line 48
    iget-object v4, v1, LE5/q0;->b:Lf6/z;

    .line 49
    .line 50
    iget-wide v5, v1, LE5/q0;->c:J

    .line 51
    .line 52
    const/4 v8, 0x1

    .line 53
    const/4 v9, 0x5

    .line 54
    move-object v1, v4

    .line 55
    move-wide v4, v5

    .line 56
    move-wide v6, v2

    .line 57
    invoke-virtual/range {v0 .. v9}, LE5/O;->o(Lf6/z;JJJZI)LE5/q0;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iput-object v1, v0, LE5/O;->w:LE5/q0;

    .line 62
    .line 63
    goto/16 :goto_7

    .line 64
    .line 65
    :cond_2
    iget-object v2, v0, LE5/O;->n:LE5/l;

    .line 66
    .line 67
    iget-object v3, v0, LE5/O;->r:LE5/i0;

    .line 68
    .line 69
    iget-object v3, v3, LE5/i0;->i:LE5/g0;

    .line 70
    .line 71
    if-eq v1, v3, :cond_3

    .line 72
    .line 73
    move v3, v12

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move v3, v11

    .line 76
    :goto_1
    iget-object v4, v2, LE5/l;->f:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v4, LE5/f;

    .line 79
    .line 80
    iget-object v5, v2, LE5/l;->d:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v5, LA7/a0;

    .line 83
    .line 84
    if-eqz v4, :cond_7

    .line 85
    .line 86
    invoke-virtual {v4}, LE5/f;->i()Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-nez v4, :cond_7

    .line 91
    .line 92
    iget-object v4, v2, LE5/l;->f:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v4, LE5/f;

    .line 95
    .line 96
    invoke-virtual {v4}, LE5/f;->j()Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-nez v4, :cond_4

    .line 101
    .line 102
    if-nez v3, :cond_7

    .line 103
    .line 104
    iget-object v3, v2, LE5/l;->f:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v3, LE5/f;

    .line 107
    .line 108
    invoke-virtual {v3}, LE5/f;->h()Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_4

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    iget-object v3, v2, LE5/l;->g:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v3, Lu6/j;

    .line 118
    .line 119
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-interface {v3}, Lu6/j;->g()J

    .line 123
    .line 124
    .line 125
    move-result-wide v6

    .line 126
    iget-boolean v4, v2, LE5/l;->b:Z

    .line 127
    .line 128
    if-eqz v4, :cond_6

    .line 129
    .line 130
    invoke-virtual {v5}, LA7/a0;->g()J

    .line 131
    .line 132
    .line 133
    move-result-wide v8

    .line 134
    cmp-long v4, v6, v8

    .line 135
    .line 136
    if-gez v4, :cond_5

    .line 137
    .line 138
    iget-boolean v3, v5, LA7/a0;->b:Z

    .line 139
    .line 140
    if-eqz v3, :cond_8

    .line 141
    .line 142
    invoke-virtual {v5}, LA7/a0;->g()J

    .line 143
    .line 144
    .line 145
    move-result-wide v3

    .line 146
    invoke-virtual {v5, v3, v4}, LA7/a0;->b(J)V

    .line 147
    .line 148
    .line 149
    iput-boolean v11, v5, LA7/a0;->b:Z

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_5
    iput-boolean v11, v2, LE5/l;->b:Z

    .line 153
    .line 154
    iget-boolean v4, v2, LE5/l;->c:Z

    .line 155
    .line 156
    if-eqz v4, :cond_6

    .line 157
    .line 158
    invoke-virtual {v5}, LA7/a0;->c()V

    .line 159
    .line 160
    .line 161
    :cond_6
    invoke-virtual {v5, v6, v7}, LA7/a0;->b(J)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v3}, Lu6/j;->e()LE5/r0;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    iget-object v4, v5, LA7/a0;->f:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v4, LE5/r0;

    .line 171
    .line 172
    invoke-virtual {v3, v4}, LE5/r0;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-nez v4, :cond_8

    .line 177
    .line 178
    invoke-virtual {v5, v3}, LA7/a0;->a(LE5/r0;)V

    .line 179
    .line 180
    .line 181
    iget-object v4, v2, LE5/l;->e:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v4, LE5/O;

    .line 184
    .line 185
    iget-object v4, v4, LE5/O;->h:Lu6/s;

    .line 186
    .line 187
    const/16 v5, 0x10

    .line 188
    .line 189
    invoke-virtual {v4, v5, v3}, Lu6/s;->a(ILjava/lang/Object;)Lu6/r;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-virtual {v3}, Lu6/r;->b()V

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_7
    :goto_2
    iput-boolean v12, v2, LE5/l;->b:Z

    .line 198
    .line 199
    iget-boolean v3, v2, LE5/l;->c:Z

    .line 200
    .line 201
    if-eqz v3, :cond_8

    .line 202
    .line 203
    invoke-virtual {v5}, LA7/a0;->c()V

    .line 204
    .line 205
    .line 206
    :cond_8
    :goto_3
    invoke-virtual {v2}, LE5/l;->g()J

    .line 207
    .line 208
    .line 209
    move-result-wide v2

    .line 210
    iput-wide v2, v0, LE5/O;->K:J

    .line 211
    .line 212
    iget-wide v4, v1, LE5/g0;->o:J

    .line 213
    .line 214
    sub-long/2addr v2, v4

    .line 215
    iget-object v1, v0, LE5/O;->w:LE5/q0;

    .line 216
    .line 217
    iget-wide v4, v1, LE5/q0;->r:J

    .line 218
    .line 219
    iget-object v1, v0, LE5/O;->o:Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    if-nez v1, :cond_f

    .line 226
    .line 227
    iget-object v1, v0, LE5/O;->w:LE5/q0;

    .line 228
    .line 229
    iget-object v1, v1, LE5/q0;->b:Lf6/z;

    .line 230
    .line 231
    invoke-virtual {v1}, Lf6/x;->a()Z

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    if-eqz v1, :cond_9

    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_9
    iget-boolean v1, v0, LE5/O;->M:Z

    .line 239
    .line 240
    if-eqz v1, :cond_a

    .line 241
    .line 242
    iput-boolean v11, v0, LE5/O;->M:Z

    .line 243
    .line 244
    :cond_a
    iget-object v1, v0, LE5/O;->w:LE5/q0;

    .line 245
    .line 246
    iget-object v4, v1, LE5/q0;->a:LE5/J0;

    .line 247
    .line 248
    iget-object v1, v1, LE5/q0;->b:Lf6/z;

    .line 249
    .line 250
    iget-object v1, v1, Lf6/x;->a:Ljava/lang/Object;

    .line 251
    .line 252
    invoke-virtual {v4, v1}, LE5/J0;->b(Ljava/lang/Object;)I

    .line 253
    .line 254
    .line 255
    iget v1, v0, LE5/O;->L:I

    .line 256
    .line 257
    iget-object v4, v0, LE5/O;->o:Ljava/util/ArrayList;

    .line 258
    .line 259
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-lez v1, :cond_c

    .line 268
    .line 269
    iget-object v4, v0, LE5/O;->o:Ljava/util/ArrayList;

    .line 270
    .line 271
    add-int/lit8 v5, v1, -0x1

    .line 272
    .line 273
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    if-nez v4, :cond_b

    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_b
    new-instance v1, Ljava/lang/ClassCastException;

    .line 281
    .line 282
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 283
    .line 284
    .line 285
    throw v1

    .line 286
    :cond_c
    :goto_4
    iget-object v4, v0, LE5/O;->o:Ljava/util/ArrayList;

    .line 287
    .line 288
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    if-ge v1, v4, :cond_e

    .line 293
    .line 294
    iget-object v4, v0, LE5/O;->o:Ljava/util/ArrayList;

    .line 295
    .line 296
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    if-nez v4, :cond_d

    .line 301
    .line 302
    goto :goto_5

    .line 303
    :cond_d
    new-instance v1, Ljava/lang/ClassCastException;

    .line 304
    .line 305
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 306
    .line 307
    .line 308
    throw v1

    .line 309
    :cond_e
    :goto_5
    iput v1, v0, LE5/O;->L:I

    .line 310
    .line 311
    :cond_f
    :goto_6
    iget-object v1, v0, LE5/O;->w:LE5/q0;

    .line 312
    .line 313
    iput-wide v2, v1, LE5/q0;->r:J

    .line 314
    .line 315
    :cond_10
    :goto_7
    iget-object v1, v0, LE5/O;->r:LE5/i0;

    .line 316
    .line 317
    iget-object v1, v1, LE5/i0;->j:LE5/g0;

    .line 318
    .line 319
    iget-object v2, v0, LE5/O;->w:LE5/q0;

    .line 320
    .line 321
    invoke-virtual {v1}, LE5/g0;->d()J

    .line 322
    .line 323
    .line 324
    move-result-wide v3

    .line 325
    iput-wide v3, v2, LE5/q0;->p:J

    .line 326
    .line 327
    iget-object v1, v0, LE5/O;->w:LE5/q0;

    .line 328
    .line 329
    iget-wide v2, v1, LE5/q0;->p:J

    .line 330
    .line 331
    iget-object v4, v0, LE5/O;->r:LE5/i0;

    .line 332
    .line 333
    iget-object v4, v4, LE5/i0;->j:LE5/g0;

    .line 334
    .line 335
    const-wide/16 v5, 0x0

    .line 336
    .line 337
    if-nez v4, :cond_11

    .line 338
    .line 339
    move-wide v2, v5

    .line 340
    move v9, v12

    .line 341
    move-wide v15, v13

    .line 342
    goto :goto_8

    .line 343
    :cond_11
    iget-wide v7, v0, LE5/O;->K:J

    .line 344
    .line 345
    move v9, v12

    .line 346
    move-wide v15, v13

    .line 347
    iget-wide v12, v4, LE5/g0;->o:J

    .line 348
    .line 349
    sub-long/2addr v7, v12

    .line 350
    sub-long/2addr v2, v7

    .line 351
    invoke-static {v5, v6, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 352
    .line 353
    .line 354
    move-result-wide v2

    .line 355
    :goto_8
    iput-wide v2, v1, LE5/q0;->q:J

    .line 356
    .line 357
    iget-object v1, v0, LE5/O;->w:LE5/q0;

    .line 358
    .line 359
    iget-boolean v2, v1, LE5/q0;->l:Z

    .line 360
    .line 361
    if-eqz v2, :cond_19

    .line 362
    .line 363
    iget v2, v1, LE5/q0;->e:I

    .line 364
    .line 365
    if-ne v2, v10, :cond_19

    .line 366
    .line 367
    iget-object v2, v1, LE5/q0;->a:LE5/J0;

    .line 368
    .line 369
    iget-object v1, v1, LE5/q0;->b:Lf6/z;

    .line 370
    .line 371
    invoke-virtual {v0, v2, v1}, LE5/O;->Y(LE5/J0;Lf6/z;)Z

    .line 372
    .line 373
    .line 374
    move-result v1

    .line 375
    if-eqz v1, :cond_19

    .line 376
    .line 377
    iget-object v1, v0, LE5/O;->w:LE5/q0;

    .line 378
    .line 379
    iget-object v2, v1, LE5/q0;->n:LE5/r0;

    .line 380
    .line 381
    iget v2, v2, LE5/r0;->a:F

    .line 382
    .line 383
    const/high16 v3, 0x3f800000    # 1.0f

    .line 384
    .line 385
    cmpl-float v2, v2, v3

    .line 386
    .line 387
    if-nez v2, :cond_19

    .line 388
    .line 389
    iget-object v2, v0, LE5/O;->t:LE5/j;

    .line 390
    .line 391
    iget-object v4, v1, LE5/q0;->a:LE5/J0;

    .line 392
    .line 393
    iget-object v7, v1, LE5/q0;->b:Lf6/z;

    .line 394
    .line 395
    iget-object v7, v7, Lf6/x;->a:Ljava/lang/Object;

    .line 396
    .line 397
    iget-wide v12, v1, LE5/q0;->r:J

    .line 398
    .line 399
    invoke-virtual {v0, v4, v7, v12, v13}, LE5/O;->g(LE5/J0;Ljava/lang/Object;J)J

    .line 400
    .line 401
    .line 402
    move-result-wide v7

    .line 403
    iget-object v1, v0, LE5/O;->w:LE5/q0;

    .line 404
    .line 405
    iget-wide v12, v1, LE5/q0;->p:J

    .line 406
    .line 407
    iget-object v1, v0, LE5/O;->r:LE5/i0;

    .line 408
    .line 409
    iget-object v1, v1, LE5/i0;->j:LE5/g0;

    .line 410
    .line 411
    if-nez v1, :cond_12

    .line 412
    .line 413
    move v4, v11

    .line 414
    move-wide v11, v5

    .line 415
    goto :goto_9

    .line 416
    :cond_12
    move v4, v11

    .line 417
    move-wide/from16 v17, v12

    .line 418
    .line 419
    iget-wide v11, v0, LE5/O;->K:J

    .line 420
    .line 421
    iget-wide v13, v1, LE5/g0;->o:J

    .line 422
    .line 423
    sub-long/2addr v11, v13

    .line 424
    sub-long v11, v17, v11

    .line 425
    .line 426
    invoke-static {v5, v6, v11, v12}, Ljava/lang/Math;->max(JJ)J

    .line 427
    .line 428
    .line 429
    move-result-wide v11

    .line 430
    :goto_9
    iget-wide v13, v2, LE5/j;->c:J

    .line 431
    .line 432
    cmp-long v1, v13, v15

    .line 433
    .line 434
    if-nez v1, :cond_13

    .line 435
    .line 436
    move v1, v4

    .line 437
    goto/16 :goto_d

    .line 438
    .line 439
    :cond_13
    sub-long v11, v7, v11

    .line 440
    .line 441
    iget-wide v13, v2, LE5/j;->m:J

    .line 442
    .line 443
    cmp-long v1, v13, v15

    .line 444
    .line 445
    if-nez v1, :cond_14

    .line 446
    .line 447
    iput-wide v11, v2, LE5/j;->m:J

    .line 448
    .line 449
    iput-wide v5, v2, LE5/j;->n:J

    .line 450
    .line 451
    move v1, v4

    .line 452
    goto :goto_a

    .line 453
    :cond_14
    long-to-float v1, v13

    .line 454
    const v5, 0x3f7fbe77    # 0.999f

    .line 455
    .line 456
    .line 457
    mul-float/2addr v1, v5

    .line 458
    long-to-float v6, v11

    .line 459
    const v13, 0x3a831200    # 9.999871E-4f

    .line 460
    .line 461
    .line 462
    mul-float/2addr v6, v13

    .line 463
    add-float/2addr v6, v1

    .line 464
    move v1, v4

    .line 465
    move v14, v5

    .line 466
    float-to-long v4, v6

    .line 467
    invoke-static {v11, v12, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 468
    .line 469
    .line 470
    move-result-wide v4

    .line 471
    iput-wide v4, v2, LE5/j;->m:J

    .line 472
    .line 473
    sub-long/2addr v11, v4

    .line 474
    invoke-static {v11, v12}, Ljava/lang/Math;->abs(J)J

    .line 475
    .line 476
    .line 477
    move-result-wide v4

    .line 478
    iget-wide v11, v2, LE5/j;->n:J

    .line 479
    .line 480
    long-to-float v6, v11

    .line 481
    mul-float/2addr v6, v14

    .line 482
    long-to-float v4, v4

    .line 483
    mul-float/2addr v13, v4

    .line 484
    add-float/2addr v13, v6

    .line 485
    float-to-long v4, v13

    .line 486
    iput-wide v4, v2, LE5/j;->n:J

    .line 487
    .line 488
    :goto_a
    iget-wide v4, v2, LE5/j;->l:J

    .line 489
    .line 490
    cmp-long v4, v4, v15

    .line 491
    .line 492
    const-wide/16 v5, 0x3e8

    .line 493
    .line 494
    if-eqz v4, :cond_15

    .line 495
    .line 496
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 497
    .line 498
    .line 499
    move-result-wide v11

    .line 500
    iget-wide v13, v2, LE5/j;->l:J

    .line 501
    .line 502
    sub-long/2addr v11, v13

    .line 503
    cmp-long v4, v11, v5

    .line 504
    .line 505
    if-gez v4, :cond_15

    .line 506
    .line 507
    iget v3, v2, LE5/j;->k:F

    .line 508
    .line 509
    goto/16 :goto_d

    .line 510
    .line 511
    :cond_15
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 512
    .line 513
    .line 514
    move-result-wide v11

    .line 515
    iput-wide v11, v2, LE5/j;->l:J

    .line 516
    .line 517
    iget-wide v11, v2, LE5/j;->m:J

    .line 518
    .line 519
    const-wide/16 v13, 0x3

    .line 520
    .line 521
    move-wide/from16 v17, v5

    .line 522
    .line 523
    iget-wide v5, v2, LE5/j;->n:J

    .line 524
    .line 525
    mul-long/2addr v5, v13

    .line 526
    add-long v23, v5, v11

    .line 527
    .line 528
    iget-wide v4, v2, LE5/j;->h:J

    .line 529
    .line 530
    cmp-long v4, v4, v23

    .line 531
    .line 532
    if-lez v4, :cond_16

    .line 533
    .line 534
    invoke-static/range {v17 .. v18}, Lu6/v;->y(J)J

    .line 535
    .line 536
    .line 537
    move-result-wide v11

    .line 538
    iget v4, v2, LE5/j;->k:F

    .line 539
    .line 540
    sub-float/2addr v4, v3

    .line 541
    long-to-float v6, v11

    .line 542
    mul-float/2addr v4, v6

    .line 543
    float-to-long v11, v4

    .line 544
    iget v4, v2, LE5/j;->i:F

    .line 545
    .line 546
    sub-float/2addr v4, v3

    .line 547
    mul-float/2addr v4, v6

    .line 548
    float-to-long v13, v4

    .line 549
    add-long/2addr v11, v13

    .line 550
    iget-wide v13, v2, LE5/j;->e:J

    .line 551
    .line 552
    const v4, 0x33d6bf95    # 1.0E-7f

    .line 553
    .line 554
    .line 555
    iget-wide v5, v2, LE5/j;->h:J

    .line 556
    .line 557
    sub-long/2addr v5, v11

    .line 558
    new-array v10, v10, [J

    .line 559
    .line 560
    aput-wide v23, v10, v1

    .line 561
    .line 562
    aput-wide v13, v10, v9

    .line 563
    .line 564
    const/4 v9, 0x2

    .line 565
    aput-wide v5, v10, v9

    .line 566
    .line 567
    invoke-static {v10}, LU8/v0;->U([J)J

    .line 568
    .line 569
    .line 570
    move-result-wide v5

    .line 571
    iput-wide v5, v2, LE5/j;->h:J

    .line 572
    .line 573
    goto :goto_b

    .line 574
    :cond_16
    const v4, 0x33d6bf95    # 1.0E-7f

    .line 575
    .line 576
    .line 577
    iget v5, v2, LE5/j;->k:F

    .line 578
    .line 579
    sub-float/2addr v5, v3

    .line 580
    const/4 v6, 0x0

    .line 581
    invoke-static {v6, v5}, Ljava/lang/Math;->max(FF)F

    .line 582
    .line 583
    .line 584
    move-result v5

    .line 585
    div-float/2addr v5, v4

    .line 586
    float-to-long v5, v5

    .line 587
    sub-long v19, v7, v5

    .line 588
    .line 589
    iget-wide v5, v2, LE5/j;->h:J

    .line 590
    .line 591
    move-wide/from16 v21, v5

    .line 592
    .line 593
    invoke-static/range {v19 .. v24}, Lu6/v;->i(JJJ)J

    .line 594
    .line 595
    .line 596
    move-result-wide v5

    .line 597
    iput-wide v5, v2, LE5/j;->h:J

    .line 598
    .line 599
    iget-wide v9, v2, LE5/j;->g:J

    .line 600
    .line 601
    cmp-long v11, v9, v15

    .line 602
    .line 603
    if-eqz v11, :cond_17

    .line 604
    .line 605
    cmp-long v5, v5, v9

    .line 606
    .line 607
    if-lez v5, :cond_17

    .line 608
    .line 609
    iput-wide v9, v2, LE5/j;->h:J

    .line 610
    .line 611
    :cond_17
    :goto_b
    iget-wide v5, v2, LE5/j;->h:J

    .line 612
    .line 613
    sub-long/2addr v7, v5

    .line 614
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    .line 615
    .line 616
    .line 617
    move-result-wide v5

    .line 618
    iget-wide v9, v2, LE5/j;->a:J

    .line 619
    .line 620
    cmp-long v5, v5, v9

    .line 621
    .line 622
    if-gez v5, :cond_18

    .line 623
    .line 624
    iput v3, v2, LE5/j;->k:F

    .line 625
    .line 626
    goto :goto_c

    .line 627
    :cond_18
    long-to-float v5, v7

    .line 628
    mul-float/2addr v5, v4

    .line 629
    add-float/2addr v5, v3

    .line 630
    iget v3, v2, LE5/j;->j:F

    .line 631
    .line 632
    iget v4, v2, LE5/j;->i:F

    .line 633
    .line 634
    invoke-static {v5, v3, v4}, Lu6/v;->g(FFF)F

    .line 635
    .line 636
    .line 637
    move-result v3

    .line 638
    iput v3, v2, LE5/j;->k:F

    .line 639
    .line 640
    :goto_c
    iget v3, v2, LE5/j;->k:F

    .line 641
    .line 642
    :goto_d
    iget-object v2, v0, LE5/O;->n:LE5/l;

    .line 643
    .line 644
    invoke-virtual {v2}, LE5/l;->e()LE5/r0;

    .line 645
    .line 646
    .line 647
    move-result-object v2

    .line 648
    iget v2, v2, LE5/r0;->a:F

    .line 649
    .line 650
    cmpl-float v2, v2, v3

    .line 651
    .line 652
    if-eqz v2, :cond_19

    .line 653
    .line 654
    iget-object v2, v0, LE5/O;->n:LE5/l;

    .line 655
    .line 656
    iget-object v4, v0, LE5/O;->w:LE5/q0;

    .line 657
    .line 658
    iget-object v4, v4, LE5/q0;->n:LE5/r0;

    .line 659
    .line 660
    new-instance v5, LE5/r0;

    .line 661
    .line 662
    iget v4, v4, LE5/r0;->b:F

    .line 663
    .line 664
    invoke-direct {v5, v3, v4}, LE5/r0;-><init>(FF)V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v2, v5}, LE5/l;->a(LE5/r0;)V

    .line 668
    .line 669
    .line 670
    iget-object v2, v0, LE5/O;->w:LE5/q0;

    .line 671
    .line 672
    iget-object v2, v2, LE5/q0;->n:LE5/r0;

    .line 673
    .line 674
    iget-object v3, v0, LE5/O;->n:LE5/l;

    .line 675
    .line 676
    invoke-virtual {v3}, LE5/l;->e()LE5/r0;

    .line 677
    .line 678
    .line 679
    move-result-object v3

    .line 680
    iget v3, v3, LE5/r0;->a:F

    .line 681
    .line 682
    invoke-virtual {v0, v2, v3, v1, v1}, LE5/O;->n(LE5/r0;FZZ)V

    .line 683
    .line 684
    .line 685
    :cond_19
    :goto_e
    return-void
.end method

.method public final f([Z)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LE5/O;->r:LE5/i0;

    .line 4
    .line 5
    iget-object v2, v1, LE5/i0;->i:LE5/g0;

    .line 6
    .line 7
    iget-object v3, v2, LE5/g0;->n:Lr6/s;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    :goto_0
    iget-object v6, v0, LE5/O;->a:[LE5/f;

    .line 11
    .line 12
    array-length v7, v6

    .line 13
    iget-object v8, v0, LE5/O;->b:Ljava/util/Set;

    .line 14
    .line 15
    if-ge v5, v7, :cond_1

    .line 16
    .line 17
    invoke-virtual {v3, v5}, Lr6/s;->b(I)Z

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
    invoke-virtual {v6}, LE5/f;->u()V

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
    if-ge v5, v7, :cond_e

    .line 42
    .line 43
    invoke-virtual {v3, v5}, Lr6/s;->b(I)Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_c

    .line 48
    .line 49
    aget-boolean v7, p1, v5

    .line 50
    .line 51
    aget-object v10, v6, v5

    .line 52
    .line 53
    invoke-static {v10}, LE5/O;->q(LE5/f;)Z

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    if-eqz v11, :cond_2

    .line 58
    .line 59
    goto/16 :goto_a

    .line 60
    .line 61
    :cond_2
    iget-object v11, v1, LE5/i0;->i:LE5/g0;

    .line 62
    .line 63
    iget-object v12, v1, LE5/i0;->h:LE5/g0;

    .line 64
    .line 65
    if-ne v11, v12, :cond_3

    .line 66
    .line 67
    const/4 v12, 0x1

    .line 68
    goto :goto_2

    .line 69
    :cond_3
    const/4 v12, 0x0

    .line 70
    :goto_2
    iget-object v13, v11, LE5/g0;->n:Lr6/s;

    .line 71
    .line 72
    iget-object v14, v13, Lr6/s;->b:[LE5/B0;

    .line 73
    .line 74
    aget-object v14, v14, v5

    .line 75
    .line 76
    iget-object v13, v13, Lr6/s;->c:[Lr6/n;

    .line 77
    .line 78
    aget-object v13, v13, v5

    .line 79
    .line 80
    if-eqz v13, :cond_4

    .line 81
    .line 82
    invoke-interface {v13}, Lr6/n;->length()I

    .line 83
    .line 84
    .line 85
    move-result v15

    .line 86
    goto :goto_3

    .line 87
    :cond_4
    const/4 v15, 0x0

    .line 88
    :goto_3
    new-array v4, v15, [LE5/T;

    .line 89
    .line 90
    const/4 v9, 0x0

    .line 91
    const/16 v17, 0x1

    .line 92
    .line 93
    :goto_4
    if-ge v9, v15, :cond_5

    .line 94
    .line 95
    invoke-interface {v13, v9}, Lr6/n;->b(I)LE5/T;

    .line 96
    .line 97
    .line 98
    move-result-object v16

    .line 99
    aput-object v16, v4, v9

    .line 100
    .line 101
    add-int/lit8 v9, v9, 0x1

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_5
    invoke-virtual {v0}, LE5/O;->X()Z

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    if-eqz v9, :cond_6

    .line 109
    .line 110
    iget-object v9, v0, LE5/O;->w:LE5/q0;

    .line 111
    .line 112
    iget v9, v9, LE5/q0;->e:I

    .line 113
    .line 114
    const/4 v13, 0x3

    .line 115
    if-ne v9, v13, :cond_6

    .line 116
    .line 117
    move/from16 v9, v17

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
    move/from16 v7, v17

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_7
    const/4 v7, 0x0

    .line 129
    :goto_6
    iget v13, v0, LE5/O;->I:I

    .line 130
    .line 131
    add-int/lit8 v13, v13, 0x1

    .line 132
    .line 133
    iput v13, v0, LE5/O;->I:I

    .line 134
    .line 135
    invoke-interface {v8, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    iget-object v13, v11, LE5/g0;->c:[Lf6/V;

    .line 139
    .line 140
    aget-object v13, v13, v5

    .line 141
    .line 142
    move-object/from16 v18, v3

    .line 143
    .line 144
    move-object v15, v4

    .line 145
    iget-wide v3, v0, LE5/O;->K:J

    .line 146
    .line 147
    invoke-virtual {v11}, LE5/g0;->e()J

    .line 148
    .line 149
    .line 150
    move-result-wide v19

    .line 151
    move/from16 v22, v5

    .line 152
    .line 153
    move-object/from16 v21, v6

    .line 154
    .line 155
    iget-wide v5, v11, LE5/g0;->o:J

    .line 156
    .line 157
    iget v11, v10, LE5/f;->f:I

    .line 158
    .line 159
    if-nez v11, :cond_8

    .line 160
    .line 161
    move/from16 v11, v17

    .line 162
    .line 163
    goto :goto_7

    .line 164
    :cond_8
    const/4 v11, 0x0

    .line 165
    :goto_7
    invoke-static {v11}, Lu6/a;->i(Z)V

    .line 166
    .line 167
    .line 168
    iput-object v14, v10, LE5/f;->c:LE5/B0;

    .line 169
    .line 170
    move/from16 v11, v17

    .line 171
    .line 172
    iput v11, v10, LE5/f;->f:I

    .line 173
    .line 174
    invoke-virtual {v10, v7, v12}, LE5/f;->l(ZZ)V

    .line 175
    .line 176
    .line 177
    move-object v12, v13

    .line 178
    move-object v11, v15

    .line 179
    move-wide/from16 v13, v19

    .line 180
    .line 181
    move-wide v15, v5

    .line 182
    invoke-virtual/range {v10 .. v16}, LE5/f;->t([LE5/T;Lf6/V;JJ)V

    .line 183
    .line 184
    .line 185
    const/4 v5, 0x0

    .line 186
    iput-boolean v5, v10, LE5/f;->k:Z

    .line 187
    .line 188
    iput-wide v3, v10, LE5/f;->j:J

    .line 189
    .line 190
    invoke-virtual {v10, v3, v4, v7}, LE5/f;->m(JZ)V

    .line 191
    .line 192
    .line 193
    new-instance v3, LE5/K;

    .line 194
    .line 195
    invoke-direct {v3, v0}, LE5/K;-><init>(LE5/O;)V

    .line 196
    .line 197
    .line 198
    const/16 v4, 0xb

    .line 199
    .line 200
    invoke-interface {v10, v4, v3}, LE5/x0;->c(ILjava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    iget-object v3, v0, LE5/O;->n:LE5/l;

    .line 204
    .line 205
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v10}, LE5/f;->d()Lu6/j;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    const/4 v6, 0x2

    .line 213
    if-eqz v4, :cond_a

    .line 214
    .line 215
    iget-object v7, v3, LE5/l;->g:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v7, Lu6/j;

    .line 218
    .line 219
    if-eq v4, v7, :cond_a

    .line 220
    .line 221
    if-nez v7, :cond_9

    .line 222
    .line 223
    iput-object v4, v3, LE5/l;->g:Ljava/lang/Object;

    .line 224
    .line 225
    iput-object v10, v3, LE5/l;->f:Ljava/lang/Object;

    .line 226
    .line 227
    iget-object v3, v3, LE5/l;->d:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v3, LA7/a0;

    .line 230
    .line 231
    iget-object v3, v3, LA7/a0;->f:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v3, LE5/r0;

    .line 234
    .line 235
    check-cast v4, LG5/K;

    .line 236
    .line 237
    invoke-virtual {v4, v3}, LG5/K;->a(LE5/r0;)V

    .line 238
    .line 239
    .line 240
    goto :goto_8

    .line 241
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 242
    .line 243
    const-string v2, "Multiple renderer media clocks enabled."

    .line 244
    .line 245
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    new-instance v2, LE5/o;

    .line 249
    .line 250
    const/16 v3, 0x3e8

    .line 251
    .line 252
    invoke-direct {v2, v6, v1, v3}, LE5/o;-><init>(ILjava/lang/Exception;I)V

    .line 253
    .line 254
    .line 255
    throw v2

    .line 256
    :cond_a
    :goto_8
    if-eqz v9, :cond_d

    .line 257
    .line 258
    iget v3, v10, LE5/f;->f:I

    .line 259
    .line 260
    const/4 v11, 0x1

    .line 261
    if-ne v3, v11, :cond_b

    .line 262
    .line 263
    const/4 v9, 0x1

    .line 264
    goto :goto_9

    .line 265
    :cond_b
    move v9, v5

    .line 266
    :goto_9
    invoke-static {v9}, Lu6/a;->i(Z)V

    .line 267
    .line 268
    .line 269
    iput v6, v10, LE5/f;->f:I

    .line 270
    .line 271
    invoke-virtual {v10}, LE5/f;->o()V

    .line 272
    .line 273
    .line 274
    goto :goto_b

    .line 275
    :cond_c
    :goto_a
    move-object/from16 v18, v3

    .line 276
    .line 277
    move/from16 v22, v5

    .line 278
    .line 279
    move-object/from16 v21, v6

    .line 280
    .line 281
    const/4 v5, 0x0

    .line 282
    :cond_d
    :goto_b
    add-int/lit8 v3, v22, 0x1

    .line 283
    .line 284
    move v5, v3

    .line 285
    move-object/from16 v3, v18

    .line 286
    .line 287
    move-object/from16 v6, v21

    .line 288
    .line 289
    goto/16 :goto_1

    .line 290
    .line 291
    :cond_e
    const/4 v11, 0x1

    .line 292
    iput-boolean v11, v2, LE5/g0;->g:Z

    .line 293
    .line 294
    return-void
.end method

.method public final f0(LE5/J0;Lf6/z;LE5/J0;Lf6/z;J)V
    .locals 8

    .line 1
    invoke-virtual {p0, p1, p2}, LE5/O;->Y(LE5/J0;Lf6/z;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p2}, Lf6/x;->a()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    sget-object p1, LE5/r0;->d:LE5/r0;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p0, LE5/O;->w:LE5/q0;

    .line 17
    .line 18
    iget-object p1, p1, LE5/q0;->n:LE5/r0;

    .line 19
    .line 20
    :goto_0
    iget-object p2, p0, LE5/O;->n:LE5/l;

    .line 21
    .line 22
    invoke-virtual {p2}, LE5/l;->e()LE5/r0;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-virtual {p3, p1}, LE5/r0;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    if-nez p3, :cond_7

    .line 31
    .line 32
    invoke-virtual {p2, p1}, LE5/l;->a(LE5/r0;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-object p2, p2, Lf6/x;->a:Ljava/lang/Object;

    .line 37
    .line 38
    iget-object v0, p0, LE5/O;->l:LE5/H0;

    .line 39
    .line 40
    invoke-virtual {p1, p2, v0}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget v1, v1, LE5/H0;->c:I

    .line 45
    .line 46
    iget-object v2, p0, LE5/O;->k:LE5/I0;

    .line 47
    .line 48
    invoke-virtual {p1, v1, v2}, LE5/J0;->n(ILE5/I0;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, v2, LE5/I0;->j:LE5/Z;

    .line 52
    .line 53
    sget v3, Lu6/v;->a:I

    .line 54
    .line 55
    iget-object v3, p0, LE5/O;->t:LE5/j;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-wide v4, v1, LE5/Z;->a:J

    .line 61
    .line 62
    invoke-static {v4, v5}, Lu6/v;->y(J)J

    .line 63
    .line 64
    .line 65
    move-result-wide v4

    .line 66
    iput-wide v4, v3, LE5/j;->c:J

    .line 67
    .line 68
    iget-wide v4, v1, LE5/Z;->b:J

    .line 69
    .line 70
    invoke-static {v4, v5}, Lu6/v;->y(J)J

    .line 71
    .line 72
    .line 73
    move-result-wide v4

    .line 74
    iput-wide v4, v3, LE5/j;->f:J

    .line 75
    .line 76
    iget-wide v4, v1, LE5/Z;->c:J

    .line 77
    .line 78
    invoke-static {v4, v5}, Lu6/v;->y(J)J

    .line 79
    .line 80
    .line 81
    move-result-wide v4

    .line 82
    iput-wide v4, v3, LE5/j;->g:J

    .line 83
    .line 84
    iget v4, v1, LE5/Z;->d:F

    .line 85
    .line 86
    const v5, -0x800001

    .line 87
    .line 88
    .line 89
    cmpl-float v6, v4, v5

    .line 90
    .line 91
    if-eqz v6, :cond_2

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    const v4, 0x3f7851ec    # 0.97f

    .line 95
    .line 96
    .line 97
    :goto_1
    iput v4, v3, LE5/j;->j:F

    .line 98
    .line 99
    iget v1, v1, LE5/Z;->e:F

    .line 100
    .line 101
    cmpl-float v5, v1, v5

    .line 102
    .line 103
    if-eqz v5, :cond_3

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    const v1, 0x3f83d70a    # 1.03f

    .line 107
    .line 108
    .line 109
    :goto_2
    iput v1, v3, LE5/j;->i:F

    .line 110
    .line 111
    const/high16 v5, 0x3f800000    # 1.0f

    .line 112
    .line 113
    cmpl-float v4, v4, v5

    .line 114
    .line 115
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    if-nez v4, :cond_4

    .line 121
    .line 122
    cmpl-float v1, v1, v5

    .line 123
    .line 124
    if-nez v1, :cond_4

    .line 125
    .line 126
    iput-wide v6, v3, LE5/j;->c:J

    .line 127
    .line 128
    :cond_4
    invoke-virtual {v3}, LE5/j;->a()V

    .line 129
    .line 130
    .line 131
    cmp-long v1, p5, v6

    .line 132
    .line 133
    if-eqz v1, :cond_5

    .line 134
    .line 135
    invoke-virtual {p0, p1, p2, p5, p6}, LE5/O;->g(LE5/J0;Ljava/lang/Object;J)J

    .line 136
    .line 137
    .line 138
    move-result-wide p1

    .line 139
    iput-wide p1, v3, LE5/j;->d:J

    .line 140
    .line 141
    invoke-virtual {v3}, LE5/j;->a()V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_5
    iget-object p1, v2, LE5/I0;->a:Ljava/lang/Object;

    .line 146
    .line 147
    invoke-virtual {p3}, LE5/J0;->p()Z

    .line 148
    .line 149
    .line 150
    move-result p2

    .line 151
    if-nez p2, :cond_6

    .line 152
    .line 153
    iget-object p2, p4, Lf6/x;->a:Ljava/lang/Object;

    .line 154
    .line 155
    invoke-virtual {p3, p2, v0}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    iget p2, p2, LE5/H0;->c:I

    .line 160
    .line 161
    const-wide/16 p4, 0x0

    .line 162
    .line 163
    invoke-virtual {p3, p2, v2, p4, p5}, LE5/J0;->m(ILE5/I0;J)LE5/I0;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    iget-object p2, p2, LE5/I0;->a:Ljava/lang/Object;

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_6
    const/4 p2, 0x0

    .line 171
    :goto_3
    invoke-static {p2, p1}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    if-nez p1, :cond_7

    .line 176
    .line 177
    iput-wide v6, v3, LE5/j;->d:J

    .line 178
    .line 179
    invoke-virtual {v3}, LE5/j;->a()V

    .line 180
    .line 181
    .line 182
    :cond_7
    return-void
.end method

.method public final g(LE5/J0;Ljava/lang/Object;J)J
    .locals 5

    .line 1
    iget-object v0, p0, LE5/O;->l:LE5/H0;

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget p2, p2, LE5/H0;->c:I

    .line 8
    .line 9
    iget-object v1, p0, LE5/O;->k:LE5/I0;

    .line 10
    .line 11
    invoke-virtual {p1, p2, v1}, LE5/J0;->n(ILE5/I0;)V

    .line 12
    .line 13
    .line 14
    iget-wide p1, v1, LE5/I0;->e:J

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
    if-eqz p1, :cond_2

    .line 24
    .line 25
    invoke-virtual {v1}, LE5/I0;->a()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    iget-boolean p1, v1, LE5/I0;->h:Z

    .line 32
    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    iget-wide p1, v1, LE5/I0;->f:J

    .line 37
    .line 38
    sget v4, Lu6/v;->a:I

    .line 39
    .line 40
    cmp-long v2, p1, v2

    .line 41
    .line 42
    if-nez v2, :cond_1

    .line 43
    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 45
    .line 46
    .line 47
    move-result-wide p1

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 50
    .line 51
    .line 52
    move-result-wide v2

    .line 53
    add-long/2addr p1, v2

    .line 54
    :goto_0
    iget-wide v1, v1, LE5/I0;->e:J

    .line 55
    .line 56
    sub-long/2addr p1, v1

    .line 57
    invoke-static {p1, p2}, Lu6/v;->y(J)J

    .line 58
    .line 59
    .line 60
    move-result-wide p1

    .line 61
    iget-wide v0, v0, LE5/H0;->e:J

    .line 62
    .line 63
    add-long/2addr p3, v0

    .line 64
    sub-long/2addr p1, p3

    .line 65
    return-wide p1

    .line 66
    :cond_2
    :goto_1
    return-wide v2
.end method

.method public final declared-synchronized g0(LE5/J;J)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LE5/O;->p:Lu6/q;

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
    iget-object v3, p0, LE5/O;->p:Lu6/q;

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
    iget-object p2, p0, LE5/O;->p:Lu6/q;

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

.method public final h(LE5/J0;)Landroid/util/Pair;
    .locals 9

    .line 1
    invoke-virtual {p1}, LE5/J0;->p()Z

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
    sget-object p1, LE5/q0;->s:Lf6/z;

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
    iget-boolean v0, p0, LE5/O;->E:Z

    .line 21
    .line 22
    invoke-virtual {p1, v0}, LE5/J0;->a(Z)I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    iget-object v5, p0, LE5/O;->l:LE5/H0;

    .line 27
    .line 28
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    iget-object v4, p0, LE5/O;->k:LE5/I0;

    .line 34
    .line 35
    move-object v3, p1

    .line 36
    invoke-virtual/range {v3 .. v8}, LE5/J0;->i(LE5/I0;LE5/H0;IJ)Landroid/util/Pair;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v0, p0, LE5/O;->r:LE5/i0;

    .line 41
    .line 42
    iget-object v4, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v0, v3, v4, v1, v2}, LE5/i0;->m(LE5/J0;Ljava/lang/Object;J)Lf6/z;

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
    invoke-virtual {v0}, Lf6/x;->a()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    iget-object p1, v0, Lf6/x;->a:Ljava/lang/Object;

    .line 63
    .line 64
    iget-object v4, p0, LE5/O;->l:LE5/H0;

    .line 65
    .line 66
    invoke-virtual {v3, p1, v4}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 67
    .line 68
    .line 69
    iget p1, v0, Lf6/x;->b:I

    .line 70
    .line 71
    invoke-virtual {v4, p1}, LE5/H0;->f(I)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    iget v3, v0, Lf6/x;->c:I

    .line 76
    .line 77
    if-ne v3, p1, :cond_1

    .line 78
    .line 79
    iget-object p1, v4, LE5/H0;->g:Lg6/b;

    .line 80
    .line 81
    iget-wide v1, p1, Lg6/b;->b:J

    .line 82
    .line 83
    :cond_1
    move-wide v4, v1

    .line 84
    :cond_2
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {v0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 7

    .line 1
    const-string v0, "Playback error"

    .line 2
    .line 3
    const-string v1, "ExoPlayerImplInternal"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/16 v3, 0x3e8

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    :try_start_0
    iget v5, p1, Landroid/os/Message;->what:I

    .line 10
    .line 11
    packed-switch v5, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    return v4

    .line 15
    :pswitch_0
    invoke-virtual {p0, v2}, LE5/O;->H(Z)V

    .line 16
    .line 17
    .line 18
    goto/16 :goto_d

    .line 19
    .line 20
    :pswitch_1
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 21
    .line 22
    if-ne p1, v2, :cond_0

    .line 23
    .line 24
    move p1, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move p1, v4

    .line 27
    :goto_0
    invoke-virtual {p0, p1}, LE5/O;->P(Z)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_d

    .line 31
    .line 32
    :catch_0
    move-exception p1

    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :catch_1
    move-exception p1

    .line 36
    goto/16 :goto_6

    .line 37
    .line 38
    :catch_2
    move-exception p1

    .line 39
    goto/16 :goto_7

    .line 40
    .line 41
    :catch_3
    move-exception p1

    .line 42
    goto/16 :goto_8

    .line 43
    .line 44
    :catch_4
    move-exception p1

    .line 45
    goto/16 :goto_b

    .line 46
    .line 47
    :catch_5
    move-exception p1

    .line 48
    goto/16 :goto_c

    .line 49
    .line 50
    :pswitch_2
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 51
    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    move p1, v2

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move p1, v4

    .line 57
    :goto_1
    invoke-virtual {p0, p1}, LE5/O;->Q(Z)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_d

    .line 61
    .line 62
    :pswitch_3
    invoke-virtual {p0}, LE5/O;->u()V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_d

    .line 66
    .line 67
    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, Lf6/X;

    .line 70
    .line 71
    invoke-virtual {p0, p1}, LE5/O;->V(Lf6/X;)V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_d

    .line 75
    .line 76
    :pswitch_5
    iget v5, p1, Landroid/os/Message;->arg1:I

    .line 77
    .line 78
    iget v6, p1, Landroid/os/Message;->arg2:I

    .line 79
    .line 80
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p1, Lf6/X;

    .line 83
    .line 84
    invoke-virtual {p0, v5, v6, p1}, LE5/O;->z(IILf6/X;)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_d

    .line 88
    .line 89
    :pswitch_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 90
    .line 91
    invoke-static {p1}, LVa/M6;->z(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, LE5/O;->v()V

    .line 95
    .line 96
    .line 97
    const/4 p1, 0x0

    .line 98
    throw p1

    .line 99
    :pswitch_7
    iget-object v5, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v5, LE5/L;

    .line 102
    .line 103
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 104
    .line 105
    invoke-virtual {p0, v5, p1}, LE5/O;->c(LE5/L;I)V

    .line 106
    .line 107
    .line 108
    goto/16 :goto_d

    .line 109
    .line 110
    :pswitch_8
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p1, LE5/L;

    .line 113
    .line 114
    invoke-virtual {p0, p1}, LE5/O;->O(LE5/L;)V

    .line 115
    .line 116
    .line 117
    goto/16 :goto_d

    .line 118
    .line 119
    :pswitch_9
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p1, LE5/r0;

    .line 122
    .line 123
    iget v5, p1, LE5/r0;->a:F

    .line 124
    .line 125
    invoke-virtual {p0, p1, v5, v2, v4}, LE5/O;->n(LE5/r0;FZZ)V

    .line 126
    .line 127
    .line 128
    goto/16 :goto_d

    .line 129
    .line 130
    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p1, LE5/y0;

    .line 133
    .line 134
    invoke-virtual {p0, p1}, LE5/O;->L(LE5/y0;)V

    .line 135
    .line 136
    .line 137
    goto/16 :goto_d

    .line 138
    .line 139
    :pswitch_b
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast p1, LE5/y0;

    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, p1}, LE5/O;->K(LE5/y0;)V

    .line 147
    .line 148
    .line 149
    goto/16 :goto_d

    .line 150
    .line 151
    :pswitch_c
    iget v5, p1, Landroid/os/Message;->arg1:I

    .line 152
    .line 153
    if-eqz v5, :cond_2

    .line 154
    .line 155
    move v5, v2

    .line 156
    goto :goto_2

    .line 157
    :cond_2
    move v5, v4

    .line 158
    :goto_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 161
    .line 162
    invoke-virtual {p0, v5, p1}, LE5/O;->N(ZLjava/util/concurrent/atomic/AtomicBoolean;)V

    .line 163
    .line 164
    .line 165
    goto/16 :goto_d

    .line 166
    .line 167
    :pswitch_d
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 168
    .line 169
    if-eqz p1, :cond_3

    .line 170
    .line 171
    move p1, v2

    .line 172
    goto :goto_3

    .line 173
    :cond_3
    move p1, v4

    .line 174
    :goto_3
    invoke-virtual {p0, p1}, LE5/O;->U(Z)V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_d

    .line 178
    .line 179
    :pswitch_e
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 180
    .line 181
    invoke-virtual {p0, p1}, LE5/O;->T(I)V

    .line 182
    .line 183
    .line 184
    goto/16 :goto_d

    .line 185
    .line 186
    :pswitch_f
    invoke-virtual {p0}, LE5/O;->A()V

    .line 187
    .line 188
    .line 189
    goto/16 :goto_d

    .line 190
    .line 191
    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast p1, Lf6/w;

    .line 194
    .line 195
    invoke-virtual {p0, p1}, LE5/O;->i(Lf6/w;)V

    .line 196
    .line 197
    .line 198
    goto/16 :goto_d

    .line 199
    .line 200
    :pswitch_11
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast p1, Lf6/w;

    .line 203
    .line 204
    invoke-virtual {p0, p1}, LE5/O;->m(Lf6/w;)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_d

    .line 208
    .line 209
    :pswitch_12
    invoke-virtual {p0}, LE5/O;->y()V

    .line 210
    .line 211
    .line 212
    return v2

    .line 213
    :pswitch_13
    invoke-virtual {p0, v4, v2}, LE5/O;->a0(ZZ)V

    .line 214
    .line 215
    .line 216
    goto/16 :goto_d

    .line 217
    .line 218
    :pswitch_14
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast p1, LE5/C0;

    .line 221
    .line 222
    iput-object p1, p0, LE5/O;->v:LE5/C0;

    .line 223
    .line 224
    goto/16 :goto_d

    .line 225
    .line 226
    :pswitch_15
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast p1, LE5/r0;

    .line 229
    .line 230
    invoke-virtual {p0, p1}, LE5/O;->S(LE5/r0;)V

    .line 231
    .line 232
    .line 233
    goto/16 :goto_d

    .line 234
    .line 235
    :pswitch_16
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast p1, LE5/N;

    .line 238
    .line 239
    invoke-virtual {p0, p1}, LE5/O;->I(LE5/N;)V

    .line 240
    .line 241
    .line 242
    goto/16 :goto_d

    .line 243
    .line 244
    :pswitch_17
    invoke-virtual {p0}, LE5/O;->e()V

    .line 245
    .line 246
    .line 247
    goto/16 :goto_d

    .line 248
    .line 249
    :pswitch_18
    iget v5, p1, Landroid/os/Message;->arg1:I

    .line 250
    .line 251
    if-eqz v5, :cond_4

    .line 252
    .line 253
    move v5, v2

    .line 254
    goto :goto_4

    .line 255
    :cond_4
    move v5, v4

    .line 256
    :goto_4
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 257
    .line 258
    invoke-virtual {p0, p1, v2, v5, v2}, LE5/O;->R(IIZZ)V

    .line 259
    .line 260
    .line 261
    goto/16 :goto_d

    .line 262
    .line 263
    :pswitch_19
    invoke-virtual {p0}, LE5/O;->w()V
    :try_end_0
    .catch LE5/o; {:try_start_0 .. :try_end_0} :catch_5
    .catch LI5/d; {:try_start_0 .. :try_end_0} :catch_4
    .catch LE5/o0; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lt6/m; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 264
    .line 265
    .line 266
    goto/16 :goto_d

    .line 267
    .line 268
    :goto_5
    instance-of v5, p1, Ljava/lang/IllegalStateException;

    .line 269
    .line 270
    if-nez v5, :cond_5

    .line 271
    .line 272
    instance-of v5, p1, Ljava/lang/IllegalArgumentException;

    .line 273
    .line 274
    if-eqz v5, :cond_6

    .line 275
    .line 276
    :cond_5
    const/16 v3, 0x3ec

    .line 277
    .line 278
    :cond_6
    new-instance v5, LE5/o;

    .line 279
    .line 280
    const/4 v6, 0x2

    .line 281
    invoke-direct {v5, v6, p1, v3}, LE5/o;-><init>(ILjava/lang/Exception;I)V

    .line 282
    .line 283
    .line 284
    invoke-static {v1, v0, v5}, Lu6/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p0, v2, v4}, LE5/O;->a0(ZZ)V

    .line 288
    .line 289
    .line 290
    iget-object p1, p0, LE5/O;->w:LE5/q0;

    .line 291
    .line 292
    invoke-virtual {p1, v5}, LE5/q0;->d(LE5/o;)LE5/q0;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    iput-object p1, p0, LE5/O;->w:LE5/q0;

    .line 297
    .line 298
    goto/16 :goto_d

    .line 299
    .line 300
    :goto_6
    const/16 v0, 0x7d0

    .line 301
    .line 302
    invoke-virtual {p0, p1, v0}, LE5/O;->j(Ljava/io/IOException;I)V

    .line 303
    .line 304
    .line 305
    goto/16 :goto_d

    .line 306
    .line 307
    :goto_7
    iget v0, p1, Lt6/m;->a:I

    .line 308
    .line 309
    invoke-virtual {p0, p1, v0}, LE5/O;->j(Ljava/io/IOException;I)V

    .line 310
    .line 311
    .line 312
    goto/16 :goto_d

    .line 313
    .line 314
    :goto_8
    iget-boolean v0, p1, LE5/o0;->a:Z

    .line 315
    .line 316
    iget v1, p1, LE5/o0;->b:I

    .line 317
    .line 318
    if-ne v1, v2, :cond_8

    .line 319
    .line 320
    if-eqz v0, :cond_7

    .line 321
    .line 322
    const/16 v0, 0xbb9

    .line 323
    .line 324
    :goto_9
    move v3, v0

    .line 325
    goto :goto_a

    .line 326
    :cond_7
    const/16 v0, 0xbbb

    .line 327
    .line 328
    goto :goto_9

    .line 329
    :cond_8
    const/4 v4, 0x4

    .line 330
    if-ne v1, v4, :cond_a

    .line 331
    .line 332
    if-eqz v0, :cond_9

    .line 333
    .line 334
    const/16 v0, 0xbba

    .line 335
    .line 336
    goto :goto_9

    .line 337
    :cond_9
    const/16 v0, 0xbbc

    .line 338
    .line 339
    goto :goto_9

    .line 340
    :cond_a
    :goto_a
    invoke-virtual {p0, p1, v3}, LE5/O;->j(Ljava/io/IOException;I)V

    .line 341
    .line 342
    .line 343
    goto :goto_d

    .line 344
    :goto_b
    iget v0, p1, LI5/d;->a:I

    .line 345
    .line 346
    invoke-virtual {p0, p1, v0}, LE5/O;->j(Ljava/io/IOException;I)V

    .line 347
    .line 348
    .line 349
    goto :goto_d

    .line 350
    :goto_c
    iget v3, p1, LE5/o;->c:I

    .line 351
    .line 352
    if-ne v3, v2, :cond_b

    .line 353
    .line 354
    iget-object v3, p0, LE5/O;->r:LE5/i0;

    .line 355
    .line 356
    iget-object v3, v3, LE5/i0;->i:LE5/g0;

    .line 357
    .line 358
    if-eqz v3, :cond_b

    .line 359
    .line 360
    iget-object v3, v3, LE5/g0;->f:LE5/h0;

    .line 361
    .line 362
    iget-object v3, v3, LE5/h0;->a:Lf6/z;

    .line 363
    .line 364
    invoke-virtual {p1, v3}, LE5/o;->a(Lf6/x;)LE5/o;

    .line 365
    .line 366
    .line 367
    move-result-object p1

    .line 368
    :cond_b
    iget-boolean v3, p1, LE5/o;->i:Z

    .line 369
    .line 370
    if-eqz v3, :cond_c

    .line 371
    .line 372
    iget-object v3, p0, LE5/O;->N:LE5/o;

    .line 373
    .line 374
    if-nez v3, :cond_c

    .line 375
    .line 376
    const-string v0, "Recoverable renderer error"

    .line 377
    .line 378
    invoke-static {p1, v1, v0}, Lu6/a;->D(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    iput-object p1, p0, LE5/O;->N:LE5/o;

    .line 382
    .line 383
    const/16 v0, 0x19

    .line 384
    .line 385
    iget-object v1, p0, LE5/O;->h:Lu6/s;

    .line 386
    .line 387
    invoke-virtual {v1, v0, p1}, Lu6/s;->a(ILjava/lang/Object;)Lu6/r;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    iget-object v0, p1, Lu6/r;->a:Landroid/os/Message;

    .line 395
    .line 396
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    iget-object v1, v1, Lu6/s;->a:Landroid/os/Handler;

    .line 400
    .line 401
    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 402
    .line 403
    .line 404
    invoke-virtual {p1}, Lu6/r;->a()V

    .line 405
    .line 406
    .line 407
    goto :goto_d

    .line 408
    :cond_c
    iget-object v3, p0, LE5/O;->N:LE5/o;

    .line 409
    .line 410
    if-eqz v3, :cond_d

    .line 411
    .line 412
    invoke-virtual {v3, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 413
    .line 414
    .line 415
    iget-object p1, p0, LE5/O;->N:LE5/o;

    .line 416
    .line 417
    :cond_d
    invoke-static {v1, v0, p1}, Lu6/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {p0, v2, v4}, LE5/O;->a0(ZZ)V

    .line 421
    .line 422
    .line 423
    iget-object v0, p0, LE5/O;->w:LE5/q0;

    .line 424
    .line 425
    invoke-virtual {v0, p1}, LE5/q0;->d(LE5/o;)LE5/q0;

    .line 426
    .line 427
    .line 428
    move-result-object p1

    .line 429
    iput-object p1, p0, LE5/O;->w:LE5/q0;

    .line 430
    .line 431
    :goto_d
    invoke-virtual {p0}, LE5/O;->t()V

    .line 432
    .line 433
    .line 434
    return v2

    .line 435
    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Lf6/w;)V
    .locals 5

    .line 1
    iget-object v0, p0, LE5/O;->r:LE5/i0;

    .line 2
    .line 3
    iget-object v0, v0, LE5/i0;->j:LE5/g0;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v1, v0, LE5/g0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    if-ne v1, p1, :cond_2

    .line 10
    .line 11
    iget-wide v1, p0, LE5/O;->K:J

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object p1, v0, LE5/g0;->l:LE5/g0;

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
    invoke-static {p1}, Lu6/a;->i(Z)V

    .line 23
    .line 24
    .line 25
    iget-boolean p1, v0, LE5/g0;->d:Z

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, v0, LE5/g0;->a:Ljava/lang/Object;

    .line 30
    .line 31
    iget-wide v3, v0, LE5/g0;->o:J

    .line 32
    .line 33
    sub-long/2addr v1, v3

    .line 34
    invoke-interface {p1, v1, v2}, Lf6/W;->o(J)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {p0}, LE5/O;->s()V

    .line 38
    .line 39
    .line 40
    :cond_2
    return-void
.end method

.method public final j(Ljava/io/IOException;I)V
    .locals 2

    .line 1
    new-instance v0, LE5/o;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p1, p2}, LE5/o;-><init>(ILjava/lang/Exception;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LE5/O;->r:LE5/i0;

    .line 8
    .line 9
    iget-object p1, p1, LE5/i0;->h:LE5/g0;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, LE5/g0;->f:LE5/h0;

    .line 14
    .line 15
    iget-object p1, p1, LE5/h0;->a:Lf6/z;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, LE5/o;->a(Lf6/x;)LE5/o;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_0
    const-string p1, "ExoPlayerImplInternal"

    .line 22
    .line 23
    const-string p2, "Playback error"

    .line 24
    .line 25
    invoke-static {p1, p2, v0}, Lu6/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v1, v1}, LE5/O;->a0(ZZ)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, LE5/O;->w:LE5/q0;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, LE5/q0;->d(LE5/o;)LE5/q0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, LE5/O;->w:LE5/q0;

    .line 38
    .line 39
    return-void
.end method

.method public final k(Z)V
    .locals 12

    .line 1
    iget-object v0, p0, LE5/O;->r:LE5/i0;

    .line 2
    .line 3
    iget-object v0, v0, LE5/i0;->j:LE5/g0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, LE5/O;->w:LE5/q0;

    .line 8
    .line 9
    iget-object v1, v1, LE5/q0;->b:Lf6/z;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, v0, LE5/g0;->f:LE5/h0;

    .line 13
    .line 14
    iget-object v1, v1, LE5/h0;->a:Lf6/z;

    .line 15
    .line 16
    :goto_0
    iget-object v2, p0, LE5/O;->w:LE5/q0;

    .line 17
    .line 18
    iget-object v2, v2, LE5/q0;->k:Lf6/z;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Lf6/x;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    iget-object v3, p0, LE5/O;->w:LE5/q0;

    .line 27
    .line 28
    invoke-virtual {v3, v1}, LE5/q0;->a(Lf6/z;)LE5/q0;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, p0, LE5/O;->w:LE5/q0;

    .line 33
    .line 34
    :cond_1
    iget-object v1, p0, LE5/O;->w:LE5/q0;

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    iget-wide v3, v1, LE5/q0;->r:J

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-virtual {v0}, LE5/g0;->d()J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    :goto_1
    iput-wide v3, v1, LE5/q0;->p:J

    .line 46
    .line 47
    iget-object v1, p0, LE5/O;->w:LE5/q0;

    .line 48
    .line 49
    iget-wide v3, v1, LE5/q0;->p:J

    .line 50
    .line 51
    iget-object v5, p0, LE5/O;->r:LE5/i0;

    .line 52
    .line 53
    iget-object v5, v5, LE5/i0;->j:LE5/g0;

    .line 54
    .line 55
    const-wide/16 v6, 0x0

    .line 56
    .line 57
    if-nez v5, :cond_3

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    iget-wide v8, p0, LE5/O;->K:J

    .line 61
    .line 62
    iget-wide v10, v5, LE5/g0;->o:J

    .line 63
    .line 64
    sub-long/2addr v8, v10

    .line 65
    sub-long/2addr v3, v8

    .line 66
    invoke-static {v6, v7, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 67
    .line 68
    .line 69
    move-result-wide v6

    .line 70
    :goto_2
    iput-wide v6, v1, LE5/q0;->q:J

    .line 71
    .line 72
    if-eqz v2, :cond_4

    .line 73
    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    :cond_4
    if-eqz v0, :cond_5

    .line 77
    .line 78
    iget-boolean p1, v0, LE5/g0;->d:Z

    .line 79
    .line 80
    if-eqz p1, :cond_5

    .line 81
    .line 82
    iget-object p1, v0, LE5/g0;->n:Lr6/s;

    .line 83
    .line 84
    invoke-virtual {p0, p1}, LE5/O;->d0(Lr6/s;)V

    .line 85
    .line 86
    .line 87
    :cond_5
    return-void
.end method

.method public final l(LE5/J0;Z)V
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 4
    .line 5
    iget-object v3, v1, LE5/O;->J:LE5/N;

    .line 6
    .line 7
    iget-object v9, v1, LE5/O;->r:LE5/i0;

    .line 8
    .line 9
    iget v4, v1, LE5/O;->D:I

    .line 10
    .line 11
    iget-boolean v5, v1, LE5/O;->E:Z

    .line 12
    .line 13
    iget-object v2, v1, LE5/O;->k:LE5/I0;

    .line 14
    .line 15
    iget-object v8, v1, LE5/O;->l:LE5/H0;

    .line 16
    .line 17
    invoke-virtual/range {p1 .. p1}, LE5/J0;->p()Z

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    if-eqz v6, :cond_0

    .line 22
    .line 23
    new-instance v17, LE5/M;

    .line 24
    .line 25
    sget-object v18, LE5/q0;->s:Lf6/z;

    .line 26
    .line 27
    const/16 v24, 0x1

    .line 28
    .line 29
    const/16 v25, 0x0

    .line 30
    .line 31
    const-wide/16 v19, 0x0

    .line 32
    .line 33
    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    const/16 v23, 0x0

    .line 39
    .line 40
    invoke-direct/range {v17 .. v25}, LE5/M;-><init>(Ljava/lang/Object;JJZZZ)V

    .line 41
    .line 42
    .line 43
    move-object/from16 v2, p1

    .line 44
    .line 45
    move-object/from16 v8, v17

    .line 46
    .line 47
    const/4 v13, 0x4

    .line 48
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    goto/16 :goto_18

    .line 54
    .line 55
    :cond_0
    iget-object v6, v0, LE5/q0;->b:Lf6/z;

    .line 56
    .line 57
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    iget-object v15, v6, Lf6/x;->a:Ljava/lang/Object;

    .line 63
    .line 64
    iget-object v7, v0, LE5/q0;->a:LE5/J0;

    .line 65
    .line 66
    invoke-virtual {v7}, LE5/J0;->p()Z

    .line 67
    .line 68
    .line 69
    move-result v19

    .line 70
    if-nez v19, :cond_2

    .line 71
    .line 72
    iget-object v11, v6, Lf6/x;->a:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-virtual {v7, v11, v8}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    iget-boolean v7, v7, LE5/H0;->f:Z

    .line 79
    .line 80
    if-eqz v7, :cond_1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    const/4 v11, 0x0

    .line 84
    goto :goto_1

    .line 85
    :cond_2
    :goto_0
    const/4 v11, 0x1

    .line 86
    :goto_1
    iget-object v7, v0, LE5/q0;->b:Lf6/z;

    .line 87
    .line 88
    invoke-virtual {v7}, Lf6/x;->a()Z

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    if-nez v7, :cond_3

    .line 93
    .line 94
    if-eqz v11, :cond_4

    .line 95
    .line 96
    :cond_3
    move/from16 v21, v11

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_4
    move/from16 v21, v11

    .line 100
    .line 101
    iget-wide v10, v0, LE5/q0;->r:J

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :goto_2
    iget-wide v10, v0, LE5/q0;->c:J

    .line 105
    .line 106
    :goto_3
    if-eqz v3, :cond_8

    .line 107
    .line 108
    move-object v7, v6

    .line 109
    move v6, v5

    .line 110
    move v5, v4

    .line 111
    const/4 v4, 0x1

    .line 112
    move-object v12, v7

    .line 113
    const/4 v13, 0x4

    .line 114
    move-object v7, v2

    .line 115
    move-object/from16 v2, p1

    .line 116
    .line 117
    invoke-static/range {v2 .. v8}, LE5/O;->F(LE5/J0;LE5/N;ZIZLE5/I0;LE5/H0;)Landroid/util/Pair;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    if-nez v4, :cond_5

    .line 122
    .line 123
    invoke-virtual {v2, v6}, LE5/J0;->a(Z)I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    move v5, v3

    .line 128
    move-wide v3, v10

    .line 129
    const/4 v6, 0x1

    .line 130
    const/4 v14, 0x0

    .line 131
    const/16 v24, 0x0

    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_5
    iget-wide v5, v3, LE5/N;->c:J

    .line 135
    .line 136
    cmp-long v3, v5, v17

    .line 137
    .line 138
    if-nez v3, :cond_6

    .line 139
    .line 140
    iget-object v3, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 141
    .line 142
    invoke-virtual {v2, v3, v8}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    iget v3, v3, LE5/H0;->c:I

    .line 147
    .line 148
    move v5, v3

    .line 149
    move-wide v3, v10

    .line 150
    const/4 v6, 0x0

    .line 151
    goto :goto_4

    .line 152
    :cond_6
    iget-object v15, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 153
    .line 154
    iget-object v3, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v3, Ljava/lang/Long;

    .line 157
    .line 158
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 159
    .line 160
    .line 161
    move-result-wide v3

    .line 162
    const/4 v5, -0x1

    .line 163
    const/4 v6, 0x1

    .line 164
    :goto_4
    iget v14, v0, LE5/q0;->e:I

    .line 165
    .line 166
    if-ne v14, v13, :cond_7

    .line 167
    .line 168
    const/4 v14, 0x1

    .line 169
    goto :goto_5

    .line 170
    :cond_7
    const/4 v14, 0x0

    .line 171
    :goto_5
    move/from16 v24, v6

    .line 172
    .line 173
    const/4 v6, 0x0

    .line 174
    :goto_6
    move v2, v5

    .line 175
    move/from16 v29, v6

    .line 176
    .line 177
    move/from16 v28, v14

    .line 178
    .line 179
    move-object v6, v15

    .line 180
    move/from16 v30, v24

    .line 181
    .line 182
    const-wide/16 v14, 0x0

    .line 183
    .line 184
    move-wide v4, v3

    .line 185
    move-object v3, v7

    .line 186
    const/4 v7, -0x1

    .line 187
    goto/16 :goto_c

    .line 188
    .line 189
    :cond_8
    move-object v7, v2

    .line 190
    move-object v12, v6

    .line 191
    const/4 v13, 0x4

    .line 192
    move-object/from16 v2, p1

    .line 193
    .line 194
    move v6, v5

    .line 195
    move v5, v4

    .line 196
    iget-object v3, v0, LE5/q0;->a:LE5/J0;

    .line 197
    .line 198
    invoke-virtual {v3}, LE5/J0;->p()Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-eqz v3, :cond_9

    .line 203
    .line 204
    invoke-virtual {v2, v6}, LE5/J0;->a(Z)I

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    move v2, v3

    .line 209
    move-object v3, v7

    .line 210
    move-wide v4, v10

    .line 211
    move-object v6, v15

    .line 212
    :goto_7
    const/4 v7, -0x1

    .line 213
    const-wide/16 v14, 0x0

    .line 214
    .line 215
    :goto_8
    const/16 v28, 0x0

    .line 216
    .line 217
    const/16 v29, 0x0

    .line 218
    .line 219
    :goto_9
    const/16 v30, 0x0

    .line 220
    .line 221
    goto/16 :goto_c

    .line 222
    .line 223
    :cond_9
    invoke-virtual {v2, v15}, LE5/J0;->b(Ljava/lang/Object;)I

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    const/4 v4, -0x1

    .line 228
    if-ne v3, v4, :cond_b

    .line 229
    .line 230
    move-object v3, v7

    .line 231
    iget-object v7, v0, LE5/q0;->a:LE5/J0;

    .line 232
    .line 233
    move-object v4, v8

    .line 234
    move-object v8, v2

    .line 235
    move-object v2, v3

    .line 236
    move-object v3, v4

    .line 237
    move v4, v5

    .line 238
    move v5, v6

    .line 239
    move-object v6, v15

    .line 240
    invoke-static/range {v2 .. v8}, LE5/O;->G(LE5/I0;LE5/H0;IZLjava/lang/Object;LE5/J0;LE5/J0;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    move-object/from16 v31, v3

    .line 245
    .line 246
    move-object v3, v2

    .line 247
    move-object v2, v8

    .line 248
    move-object/from16 v8, v31

    .line 249
    .line 250
    if-nez v4, :cond_a

    .line 251
    .line 252
    invoke-virtual {v2, v5}, LE5/J0;->a(Z)I

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    const/4 v5, 0x1

    .line 257
    goto :goto_a

    .line 258
    :cond_a
    invoke-virtual {v2, v4, v8}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    iget v4, v4, LE5/H0;->c:I

    .line 263
    .line 264
    const/4 v5, 0x0

    .line 265
    :goto_a
    move v2, v4

    .line 266
    move/from16 v29, v5

    .line 267
    .line 268
    move-wide v4, v10

    .line 269
    const/4 v7, -0x1

    .line 270
    const-wide/16 v14, 0x0

    .line 271
    .line 272
    const/16 v28, 0x0

    .line 273
    .line 274
    goto :goto_9

    .line 275
    :cond_b
    move-object v3, v7

    .line 276
    move-object v6, v15

    .line 277
    cmp-long v4, v10, v17

    .line 278
    .line 279
    if-nez v4, :cond_c

    .line 280
    .line 281
    invoke-virtual {v2, v6, v8}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    iget v4, v4, LE5/H0;->c:I

    .line 286
    .line 287
    move v2, v4

    .line 288
    move-wide v4, v10

    .line 289
    goto :goto_7

    .line 290
    :cond_c
    if-eqz v21, :cond_e

    .line 291
    .line 292
    iget-object v4, v0, LE5/q0;->a:LE5/J0;

    .line 293
    .line 294
    iget-object v5, v12, Lf6/x;->a:Ljava/lang/Object;

    .line 295
    .line 296
    invoke-virtual {v4, v5, v8}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 297
    .line 298
    .line 299
    iget-object v4, v0, LE5/q0;->a:LE5/J0;

    .line 300
    .line 301
    iget v5, v8, LE5/H0;->c:I

    .line 302
    .line 303
    const-wide/16 v14, 0x0

    .line 304
    .line 305
    invoke-virtual {v4, v5, v3, v14, v15}, LE5/J0;->m(ILE5/I0;J)LE5/I0;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    iget v4, v4, LE5/I0;->n:I

    .line 310
    .line 311
    iget-object v5, v0, LE5/q0;->a:LE5/J0;

    .line 312
    .line 313
    iget-object v7, v12, Lf6/x;->a:Ljava/lang/Object;

    .line 314
    .line 315
    invoke-virtual {v5, v7}, LE5/J0;->b(Ljava/lang/Object;)I

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    if-ne v4, v5, :cond_d

    .line 320
    .line 321
    iget-wide v4, v8, LE5/H0;->e:J

    .line 322
    .line 323
    add-long/2addr v4, v10

    .line 324
    invoke-virtual {v2, v6, v8}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 325
    .line 326
    .line 327
    move-result-object v6

    .line 328
    iget v6, v6, LE5/H0;->c:I

    .line 329
    .line 330
    move-wide/from16 v31, v4

    .line 331
    .line 332
    move v5, v6

    .line 333
    move-wide/from16 v6, v31

    .line 334
    .line 335
    move-object v4, v8

    .line 336
    invoke-virtual/range {v2 .. v7}, LE5/J0;->i(LE5/I0;LE5/H0;IJ)Landroid/util/Pair;

    .line 337
    .line 338
    .line 339
    move-result-object v5

    .line 340
    iget-object v2, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 341
    .line 342
    iget-object v4, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v4, Ljava/lang/Long;

    .line 345
    .line 346
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 347
    .line 348
    .line 349
    move-result-wide v4

    .line 350
    goto :goto_b

    .line 351
    :cond_d
    move-object v2, v6

    .line 352
    move-wide v4, v10

    .line 353
    :goto_b
    move-object v6, v2

    .line 354
    const/4 v2, -0x1

    .line 355
    const/4 v7, -0x1

    .line 356
    const/16 v28, 0x0

    .line 357
    .line 358
    const/16 v29, 0x0

    .line 359
    .line 360
    const/16 v30, 0x1

    .line 361
    .line 362
    goto :goto_c

    .line 363
    :cond_e
    const-wide/16 v14, 0x0

    .line 364
    .line 365
    move-wide v4, v10

    .line 366
    const/4 v2, -0x1

    .line 367
    const/4 v7, -0x1

    .line 368
    goto/16 :goto_8

    .line 369
    .line 370
    :goto_c
    if-eq v2, v7, :cond_f

    .line 371
    .line 372
    move/from16 v16, v7

    .line 373
    .line 374
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    move v5, v2

    .line 380
    move-object v4, v8

    .line 381
    move/from16 v8, v16

    .line 382
    .line 383
    move-object/from16 v2, p1

    .line 384
    .line 385
    invoke-virtual/range {v2 .. v7}, LE5/J0;->i(LE5/I0;LE5/H0;IJ)Landroid/util/Pair;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    move-object v7, v4

    .line 390
    iget-object v6, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 391
    .line 392
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v3, Ljava/lang/Long;

    .line 395
    .line 396
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 397
    .line 398
    .line 399
    move-result-wide v4

    .line 400
    move-wide/from16 v26, v17

    .line 401
    .line 402
    goto :goto_d

    .line 403
    :cond_f
    move-object v2, v8

    .line 404
    move v8, v7

    .line 405
    move-object v7, v2

    .line 406
    move-object/from16 v2, p1

    .line 407
    .line 408
    move-wide/from16 v26, v4

    .line 409
    .line 410
    :goto_d
    invoke-virtual {v9, v2, v6, v4, v5}, LE5/i0;->m(LE5/J0;Ljava/lang/Object;J)Lf6/z;

    .line 411
    .line 412
    .line 413
    move-result-object v3

    .line 414
    iget v9, v3, Lf6/x;->e:I

    .line 415
    .line 416
    if-eq v9, v8, :cond_11

    .line 417
    .line 418
    iget v14, v12, Lf6/x;->e:I

    .line 419
    .line 420
    if-eq v14, v8, :cond_10

    .line 421
    .line 422
    if-lt v9, v14, :cond_10

    .line 423
    .line 424
    goto :goto_e

    .line 425
    :cond_10
    const/4 v8, 0x0

    .line 426
    goto :goto_f

    .line 427
    :cond_11
    :goto_e
    const/4 v8, 0x1

    .line 428
    :goto_f
    iget-object v9, v12, Lf6/x;->a:Ljava/lang/Object;

    .line 429
    .line 430
    invoke-virtual {v9, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v9

    .line 434
    if-eqz v9, :cond_12

    .line 435
    .line 436
    invoke-virtual {v12}, Lf6/x;->a()Z

    .line 437
    .line 438
    .line 439
    move-result v9

    .line 440
    if-nez v9, :cond_12

    .line 441
    .line 442
    invoke-virtual {v3}, Lf6/x;->a()Z

    .line 443
    .line 444
    .line 445
    move-result v9

    .line 446
    if-nez v9, :cond_12

    .line 447
    .line 448
    if-eqz v8, :cond_12

    .line 449
    .line 450
    const/4 v8, 0x1

    .line 451
    goto :goto_10

    .line 452
    :cond_12
    const/4 v8, 0x0

    .line 453
    :goto_10
    invoke-virtual {v2, v6, v7}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 454
    .line 455
    .line 456
    move-result-object v6

    .line 457
    if-nez v21, :cond_14

    .line 458
    .line 459
    cmp-long v9, v10, v26

    .line 460
    .line 461
    if-nez v9, :cond_14

    .line 462
    .line 463
    iget-object v9, v12, Lf6/x;->a:Ljava/lang/Object;

    .line 464
    .line 465
    iget-object v10, v3, Lf6/x;->a:Ljava/lang/Object;

    .line 466
    .line 467
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result v9

    .line 471
    if-nez v9, :cond_13

    .line 472
    .line 473
    goto :goto_12

    .line 474
    :cond_13
    invoke-virtual {v12}, Lf6/x;->a()Z

    .line 475
    .line 476
    .line 477
    move-result v9

    .line 478
    if-eqz v9, :cond_15

    .line 479
    .line 480
    iget v9, v12, Lf6/x;->b:I

    .line 481
    .line 482
    invoke-virtual {v6, v9}, LE5/H0;->g(I)Z

    .line 483
    .line 484
    .line 485
    move-result v10

    .line 486
    if-eqz v10, :cond_15

    .line 487
    .line 488
    iget v10, v12, Lf6/x;->c:I

    .line 489
    .line 490
    invoke-virtual {v6, v9, v10}, LE5/H0;->e(II)I

    .line 491
    .line 492
    .line 493
    move-result v11

    .line 494
    if-eq v11, v13, :cond_14

    .line 495
    .line 496
    invoke-virtual {v6, v9, v10}, LE5/H0;->e(II)I

    .line 497
    .line 498
    .line 499
    move-result v6

    .line 500
    const/4 v9, 0x2

    .line 501
    if-eq v6, v9, :cond_14

    .line 502
    .line 503
    :goto_11
    const/4 v6, 0x1

    .line 504
    goto :goto_13

    .line 505
    :cond_14
    :goto_12
    const/4 v6, 0x0

    .line 506
    goto :goto_13

    .line 507
    :cond_15
    invoke-virtual {v3}, Lf6/x;->a()Z

    .line 508
    .line 509
    .line 510
    move-result v9

    .line 511
    if-eqz v9, :cond_14

    .line 512
    .line 513
    iget v9, v3, Lf6/x;->b:I

    .line 514
    .line 515
    invoke-virtual {v6, v9}, LE5/H0;->g(I)Z

    .line 516
    .line 517
    .line 518
    move-result v6

    .line 519
    if-eqz v6, :cond_14

    .line 520
    .line 521
    goto :goto_11

    .line 522
    :goto_13
    if-nez v8, :cond_17

    .line 523
    .line 524
    if-eqz v6, :cond_16

    .line 525
    .line 526
    goto :goto_14

    .line 527
    :cond_16
    move-object v6, v3

    .line 528
    goto :goto_15

    .line 529
    :cond_17
    :goto_14
    move-object v6, v12

    .line 530
    :goto_15
    invoke-virtual {v6}, Lf6/x;->a()Z

    .line 531
    .line 532
    .line 533
    move-result v3

    .line 534
    if-eqz v3, :cond_18

    .line 535
    .line 536
    invoke-virtual {v6, v12}, Lf6/x;->equals(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    move-result v3

    .line 540
    if-eqz v3, :cond_19

    .line 541
    .line 542
    iget-wide v4, v0, LE5/q0;->r:J

    .line 543
    .line 544
    :cond_18
    :goto_16
    move-wide/from16 v24, v4

    .line 545
    .line 546
    goto :goto_17

    .line 547
    :cond_19
    iget-object v0, v6, Lf6/x;->a:Ljava/lang/Object;

    .line 548
    .line 549
    invoke-virtual {v2, v0, v7}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 550
    .line 551
    .line 552
    iget v0, v6, Lf6/x;->c:I

    .line 553
    .line 554
    iget v3, v6, Lf6/x;->b:I

    .line 555
    .line 556
    invoke-virtual {v7, v3}, LE5/H0;->f(I)I

    .line 557
    .line 558
    .line 559
    move-result v3

    .line 560
    if-ne v0, v3, :cond_1a

    .line 561
    .line 562
    iget-object v0, v7, LE5/H0;->g:Lg6/b;

    .line 563
    .line 564
    iget-wide v3, v0, Lg6/b;->b:J

    .line 565
    .line 566
    move-wide v4, v3

    .line 567
    goto :goto_16

    .line 568
    :cond_1a
    const-wide/16 v4, 0x0

    .line 569
    .line 570
    goto :goto_16

    .line 571
    :goto_17
    new-instance v22, LE5/M;

    .line 572
    .line 573
    move-object/from16 v23, v6

    .line 574
    .line 575
    invoke-direct/range {v22 .. v30}, LE5/M;-><init>(Ljava/lang/Object;JJZZZ)V

    .line 576
    .line 577
    .line 578
    move-object/from16 v8, v22

    .line 579
    .line 580
    :goto_18
    iget-object v0, v8, LE5/M;->f:Ljava/lang/Object;

    .line 581
    .line 582
    move-object v9, v0

    .line 583
    check-cast v9, Lf6/z;

    .line 584
    .line 585
    iget-wide v10, v8, LE5/M;->b:J

    .line 586
    .line 587
    iget-boolean v6, v8, LE5/M;->c:Z

    .line 588
    .line 589
    iget-wide v14, v8, LE5/M;->a:J

    .line 590
    .line 591
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 592
    .line 593
    iget-object v0, v0, LE5/q0;->b:Lf6/z;

    .line 594
    .line 595
    invoke-virtual {v0, v9}, Lf6/x;->equals(Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    move-result v0

    .line 599
    if-eqz v0, :cond_1c

    .line 600
    .line 601
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 602
    .line 603
    iget-wide v3, v0, LE5/q0;->r:J

    .line 604
    .line 605
    cmp-long v0, v14, v3

    .line 606
    .line 607
    if-eqz v0, :cond_1b

    .line 608
    .line 609
    goto :goto_19

    .line 610
    :cond_1b
    const/4 v12, 0x0

    .line 611
    goto :goto_1a

    .line 612
    :cond_1c
    :goto_19
    const/4 v12, 0x1

    .line 613
    :goto_1a
    const/16 v21, 0x3

    .line 614
    .line 615
    :try_start_0
    iget-boolean v0, v8, LE5/M;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_9

    .line 616
    .line 617
    if-eqz v0, :cond_1e

    .line 618
    .line 619
    :try_start_1
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 620
    .line 621
    iget v0, v0, LE5/q0;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 622
    .line 623
    const/4 v4, 0x1

    .line 624
    if-eq v0, v4, :cond_1d

    .line 625
    .line 626
    :try_start_2
    invoke-virtual {v1, v13}, LE5/O;->W(I)V

    .line 627
    .line 628
    .line 629
    :cond_1d
    const/4 v5, 0x0

    .line 630
    goto :goto_1c

    .line 631
    :catchall_0
    move-exception v0

    .line 632
    :goto_1b
    move-wide/from16 v31, v10

    .line 633
    .line 634
    move-object v11, v2

    .line 635
    move-object v2, v9

    .line 636
    move-wide/from16 v9, v31

    .line 637
    .line 638
    move/from16 v20, v4

    .line 639
    .line 640
    const/4 v13, 0x0

    .line 641
    goto/16 :goto_2f

    .line 642
    .line 643
    :goto_1c
    invoke-virtual {v1, v5, v5, v5, v4}, LE5/O;->B(ZZZZ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 644
    .line 645
    .line 646
    goto :goto_1d

    .line 647
    :catchall_1
    move-exception v0

    .line 648
    const/4 v4, 0x1

    .line 649
    goto :goto_1b

    .line 650
    :cond_1e
    const/4 v4, 0x1

    .line 651
    :goto_1d
    if-nez v12, :cond_26

    .line 652
    .line 653
    :try_start_3
    iget-object v2, v1, LE5/O;->r:LE5/i0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    .line 654
    .line 655
    move/from16 v20, v4

    .line 656
    .line 657
    :try_start_4
    iget-wide v4, v1, LE5/O;->K:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 658
    .line 659
    :try_start_5
    iget-object v0, v2, LE5/i0;->i:LE5/g0;

    .line 660
    .line 661
    if-nez v0, :cond_1f

    .line 662
    .line 663
    move-object/from16 v3, p1

    .line 664
    .line 665
    const-wide/16 v6, 0x0

    .line 666
    .line 667
    :goto_1e
    const/4 v13, 0x0

    .line 668
    goto :goto_21

    .line 669
    :cond_1f
    iget-wide v6, v0, LE5/g0;->o:J

    .line 670
    .line 671
    iget-boolean v3, v0, LE5/g0;->d:Z

    .line 672
    .line 673
    if-nez v3, :cond_20

    .line 674
    .line 675
    move-object/from16 v3, p1

    .line 676
    .line 677
    goto :goto_1e

    .line 678
    :cond_20
    const/4 v3, 0x0

    .line 679
    :goto_1f
    iget-object v13, v1, LE5/O;->a:[LE5/f;

    .line 680
    .line 681
    move-object/from16 v24, v2

    .line 682
    .line 683
    array-length v2, v13

    .line 684
    if-ge v3, v2, :cond_24

    .line 685
    .line 686
    aget-object v2, v13, v3

    .line 687
    .line 688
    invoke-static {v2}, LE5/O;->q(LE5/f;)Z

    .line 689
    .line 690
    .line 691
    move-result v2

    .line 692
    if-eqz v2, :cond_23

    .line 693
    .line 694
    aget-object v2, v13, v3

    .line 695
    .line 696
    iget-object v13, v2, LE5/f;->g:Lf6/V;

    .line 697
    .line 698
    move/from16 v25, v3

    .line 699
    .line 700
    iget-object v3, v0, LE5/g0;->c:[Lf6/V;

    .line 701
    .line 702
    aget-object v3, v3, v25

    .line 703
    .line 704
    if-eq v13, v3, :cond_21

    .line 705
    .line 706
    goto :goto_20

    .line 707
    :cond_21
    iget-wide v2, v2, LE5/f;->j:J

    .line 708
    .line 709
    const-wide/high16 v26, -0x8000000000000000L

    .line 710
    .line 711
    cmp-long v13, v2, v26

    .line 712
    .line 713
    if-nez v13, :cond_22

    .line 714
    .line 715
    move-object/from16 v3, p1

    .line 716
    .line 717
    move-object/from16 v2, v24

    .line 718
    .line 719
    move-wide/from16 v6, v26

    .line 720
    .line 721
    goto :goto_1e

    .line 722
    :cond_22
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 723
    .line 724
    .line 725
    move-result-wide v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 726
    goto :goto_20

    .line 727
    :cond_23
    move/from16 v25, v3

    .line 728
    .line 729
    :goto_20
    add-int/lit8 v3, v25, 0x1

    .line 730
    .line 731
    move-object/from16 v2, v24

    .line 732
    .line 733
    goto :goto_1f

    .line 734
    :cond_24
    move-object/from16 v3, p1

    .line 735
    .line 736
    move-object/from16 v2, v24

    .line 737
    .line 738
    goto :goto_1e

    .line 739
    :goto_21
    :try_start_6
    invoke-virtual/range {v2 .. v7}, LE5/i0;->o(LE5/J0;JJ)Z

    .line 740
    .line 741
    .line 742
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 743
    move-object v7, v3

    .line 744
    if-nez v0, :cond_25

    .line 745
    .line 746
    const/4 v5, 0x0

    .line 747
    :try_start_7
    invoke-virtual {v1, v5}, LE5/O;->H(Z)V

    .line 748
    .line 749
    .line 750
    :cond_25
    move-object v2, v9

    .line 751
    goto/16 :goto_28

    .line 752
    .line 753
    :catchall_2
    move-exception v0

    .line 754
    :goto_22
    move-object v2, v9

    .line 755
    :goto_23
    move-wide v9, v10

    .line 756
    move-object v11, v7

    .line 757
    goto/16 :goto_2f

    .line 758
    .line 759
    :catchall_3
    move-exception v0

    .line 760
    move-object v7, v3

    .line 761
    goto :goto_22

    .line 762
    :catchall_4
    move-exception v0

    .line 763
    move-object/from16 v7, p1

    .line 764
    .line 765
    goto :goto_24

    .line 766
    :catchall_5
    move-exception v0

    .line 767
    move-object/from16 v7, p1

    .line 768
    .line 769
    :goto_24
    const/4 v13, 0x0

    .line 770
    goto :goto_22

    .line 771
    :catchall_6
    move-exception v0

    .line 772
    move-object/from16 v7, p1

    .line 773
    .line 774
    move/from16 v20, v4

    .line 775
    .line 776
    goto :goto_24

    .line 777
    :cond_26
    move-object v7, v2

    .line 778
    move/from16 v20, v4

    .line 779
    .line 780
    const/4 v13, 0x0

    .line 781
    invoke-virtual {v7}, LE5/J0;->p()Z

    .line 782
    .line 783
    .line 784
    move-result v0

    .line 785
    if-nez v0, :cond_25

    .line 786
    .line 787
    iget-object v0, v1, LE5/O;->r:LE5/i0;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 788
    .line 789
    :try_start_8
    iget-object v0, v0, LE5/i0;->h:LE5/g0;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 790
    .line 791
    :goto_25
    if-eqz v0, :cond_28

    .line 792
    .line 793
    :try_start_9
    iget-object v2, v0, LE5/g0;->f:LE5/h0;

    .line 794
    .line 795
    iget-object v2, v2, LE5/h0;->a:Lf6/z;

    .line 796
    .line 797
    invoke-virtual {v2, v9}, Lf6/x;->equals(Ljava/lang/Object;)Z

    .line 798
    .line 799
    .line 800
    move-result v2

    .line 801
    if-eqz v2, :cond_27

    .line 802
    .line 803
    iget-object v2, v1, LE5/O;->r:LE5/i0;

    .line 804
    .line 805
    iget-object v3, v0, LE5/g0;->f:LE5/h0;

    .line 806
    .line 807
    invoke-virtual {v2, v7, v3}, LE5/i0;->g(LE5/J0;LE5/h0;)LE5/h0;

    .line 808
    .line 809
    .line 810
    move-result-object v2

    .line 811
    iput-object v2, v0, LE5/g0;->f:LE5/h0;

    .line 812
    .line 813
    invoke-virtual {v0}, LE5/g0;->h()V

    .line 814
    .line 815
    .line 816
    :cond_27
    iget-object v0, v0, LE5/g0;->l:LE5/g0;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 817
    .line 818
    goto :goto_25

    .line 819
    :cond_28
    :try_start_a
    iget-object v0, v1, LE5/O;->r:LE5/i0;

    .line 820
    .line 821
    iget-object v2, v0, LE5/i0;->h:LE5/g0;

    .line 822
    .line 823
    iget-object v0, v0, LE5/i0;->i:LE5/g0;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 824
    .line 825
    if-eq v2, v0, :cond_29

    .line 826
    .line 827
    move/from16 v5, v20

    .line 828
    .line 829
    :goto_26
    move-object v2, v9

    .line 830
    move-wide v3, v14

    .line 831
    goto :goto_27

    .line 832
    :cond_29
    const/4 v5, 0x0

    .line 833
    goto :goto_26

    .line 834
    :goto_27
    :try_start_b
    invoke-virtual/range {v1 .. v6}, LE5/O;->J(Lf6/z;JZZ)J

    .line 835
    .line 836
    .line 837
    move-result-wide v14
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 838
    goto :goto_28

    .line 839
    :catchall_7
    move-exception v0

    .line 840
    move-wide v14, v3

    .line 841
    goto :goto_23

    .line 842
    :catchall_8
    move-exception v0

    .line 843
    goto :goto_22

    .line 844
    :goto_28
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 845
    .line 846
    iget-object v4, v0, LE5/q0;->a:LE5/J0;

    .line 847
    .line 848
    iget-object v5, v0, LE5/q0;->b:Lf6/z;

    .line 849
    .line 850
    iget-boolean v0, v8, LE5/M;->e:Z

    .line 851
    .line 852
    if-eqz v0, :cond_2a

    .line 853
    .line 854
    move-object v3, v2

    .line 855
    move-object v2, v7

    .line 856
    move-wide v6, v14

    .line 857
    goto :goto_29

    .line 858
    :cond_2a
    move-object v3, v2

    .line 859
    move-object v2, v7

    .line 860
    move-wide/from16 v6, v17

    .line 861
    .line 862
    :goto_29
    invoke-virtual/range {v1 .. v7}, LE5/O;->f0(LE5/J0;Lf6/z;LE5/J0;Lf6/z;J)V

    .line 863
    .line 864
    .line 865
    if-nez v12, :cond_2c

    .line 866
    .line 867
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 868
    .line 869
    iget-wide v4, v0, LE5/q0;->c:J

    .line 870
    .line 871
    cmp-long v0, v10, v4

    .line 872
    .line 873
    if-eqz v0, :cond_2b

    .line 874
    .line 875
    goto :goto_2a

    .line 876
    :cond_2b
    move-object v11, v2

    .line 877
    goto :goto_2e

    .line 878
    :cond_2c
    :goto_2a
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 879
    .line 880
    iget-object v4, v0, LE5/q0;->b:Lf6/z;

    .line 881
    .line 882
    iget-object v4, v4, Lf6/x;->a:Ljava/lang/Object;

    .line 883
    .line 884
    iget-object v0, v0, LE5/q0;->a:LE5/J0;

    .line 885
    .line 886
    if-eqz v12, :cond_2d

    .line 887
    .line 888
    if-eqz p2, :cond_2d

    .line 889
    .line 890
    invoke-virtual {v0}, LE5/J0;->p()Z

    .line 891
    .line 892
    .line 893
    move-result v5

    .line 894
    if-nez v5, :cond_2d

    .line 895
    .line 896
    iget-object v5, v1, LE5/O;->l:LE5/H0;

    .line 897
    .line 898
    invoke-virtual {v0, v4, v5}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    iget-boolean v0, v0, LE5/H0;->f:Z

    .line 903
    .line 904
    if-nez v0, :cond_2d

    .line 905
    .line 906
    move/from16 v9, v20

    .line 907
    .line 908
    goto :goto_2b

    .line 909
    :cond_2d
    const/4 v9, 0x0

    .line 910
    :goto_2b
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 911
    .line 912
    iget-wide v7, v0, LE5/q0;->d:J

    .line 913
    .line 914
    invoke-virtual {v2, v4}, LE5/J0;->b(Ljava/lang/Object;)I

    .line 915
    .line 916
    .line 917
    move-result v0

    .line 918
    const/4 v4, -0x1

    .line 919
    if-ne v0, v4, :cond_2e

    .line 920
    .line 921
    move-wide v5, v10

    .line 922
    const/4 v10, 0x4

    .line 923
    :goto_2c
    move-object v11, v2

    .line 924
    move-object v2, v3

    .line 925
    move-wide v3, v14

    .line 926
    goto :goto_2d

    .line 927
    :cond_2e
    move-wide v5, v10

    .line 928
    move/from16 v10, v21

    .line 929
    .line 930
    goto :goto_2c

    .line 931
    :goto_2d
    invoke-virtual/range {v1 .. v10}, LE5/O;->o(Lf6/z;JJJZI)LE5/q0;

    .line 932
    .line 933
    .line 934
    move-result-object v0

    .line 935
    iput-object v0, v1, LE5/O;->w:LE5/q0;

    .line 936
    .line 937
    :goto_2e
    invoke-virtual {v1}, LE5/O;->C()V

    .line 938
    .line 939
    .line 940
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 941
    .line 942
    iget-object v0, v0, LE5/q0;->a:LE5/J0;

    .line 943
    .line 944
    invoke-virtual {v1, v11, v0}, LE5/O;->E(LE5/J0;LE5/J0;)V

    .line 945
    .line 946
    .line 947
    iget-object v0, v1, LE5/O;->w:LE5/q0;

    .line 948
    .line 949
    invoke-virtual {v0, v11}, LE5/q0;->g(LE5/J0;)LE5/q0;

    .line 950
    .line 951
    .line 952
    move-result-object v0

    .line 953
    iput-object v0, v1, LE5/O;->w:LE5/q0;

    .line 954
    .line 955
    invoke-virtual {v11}, LE5/J0;->p()Z

    .line 956
    .line 957
    .line 958
    move-result v0

    .line 959
    if-nez v0, :cond_2f

    .line 960
    .line 961
    iput-object v13, v1, LE5/O;->J:LE5/N;

    .line 962
    .line 963
    :cond_2f
    const/4 v5, 0x0

    .line 964
    invoke-virtual {v1, v5}, LE5/O;->k(Z)V

    .line 965
    .line 966
    .line 967
    return-void

    .line 968
    :catchall_9
    move-exception v0

    .line 969
    move-wide/from16 v31, v10

    .line 970
    .line 971
    move-object v11, v2

    .line 972
    move-object v2, v9

    .line 973
    move-wide/from16 v9, v31

    .line 974
    .line 975
    const/4 v13, 0x0

    .line 976
    const/16 v20, 0x1

    .line 977
    .line 978
    :goto_2f
    iget-object v3, v1, LE5/O;->w:LE5/q0;

    .line 979
    .line 980
    iget-object v4, v3, LE5/q0;->a:LE5/J0;

    .line 981
    .line 982
    iget-object v5, v3, LE5/q0;->b:Lf6/z;

    .line 983
    .line 984
    iget-boolean v3, v8, LE5/M;->e:Z

    .line 985
    .line 986
    if-eqz v3, :cond_30

    .line 987
    .line 988
    move-wide v6, v14

    .line 989
    :goto_30
    move-object v3, v2

    .line 990
    move-object v2, v11

    .line 991
    goto :goto_31

    .line 992
    :cond_30
    move-wide/from16 v6, v17

    .line 993
    .line 994
    goto :goto_30

    .line 995
    :goto_31
    invoke-virtual/range {v1 .. v7}, LE5/O;->f0(LE5/J0;Lf6/z;LE5/J0;Lf6/z;J)V

    .line 996
    .line 997
    .line 998
    move-object v11, v2

    .line 999
    move-object v2, v3

    .line 1000
    if-nez v12, :cond_31

    .line 1001
    .line 1002
    iget-object v3, v1, LE5/O;->w:LE5/q0;

    .line 1003
    .line 1004
    iget-wide v3, v3, LE5/q0;->c:J

    .line 1005
    .line 1006
    cmp-long v3, v9, v3

    .line 1007
    .line 1008
    if-eqz v3, :cond_34

    .line 1009
    .line 1010
    :cond_31
    iget-object v3, v1, LE5/O;->w:LE5/q0;

    .line 1011
    .line 1012
    iget-object v4, v3, LE5/q0;->b:Lf6/z;

    .line 1013
    .line 1014
    iget-object v4, v4, Lf6/x;->a:Ljava/lang/Object;

    .line 1015
    .line 1016
    iget-object v3, v3, LE5/q0;->a:LE5/J0;

    .line 1017
    .line 1018
    if-eqz v12, :cond_32

    .line 1019
    .line 1020
    if-eqz p2, :cond_32

    .line 1021
    .line 1022
    invoke-virtual {v3}, LE5/J0;->p()Z

    .line 1023
    .line 1024
    .line 1025
    move-result v5

    .line 1026
    if-nez v5, :cond_32

    .line 1027
    .line 1028
    iget-object v5, v1, LE5/O;->l:LE5/H0;

    .line 1029
    .line 1030
    invoke-virtual {v3, v4, v5}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v3

    .line 1034
    iget-boolean v3, v3, LE5/H0;->f:Z

    .line 1035
    .line 1036
    if-nez v3, :cond_32

    .line 1037
    .line 1038
    move-wide v5, v9

    .line 1039
    move/from16 v9, v20

    .line 1040
    .line 1041
    goto :goto_32

    .line 1042
    :cond_32
    move-wide v5, v9

    .line 1043
    const/4 v9, 0x0

    .line 1044
    :goto_32
    iget-object v3, v1, LE5/O;->w:LE5/q0;

    .line 1045
    .line 1046
    iget-wide v7, v3, LE5/q0;->d:J

    .line 1047
    .line 1048
    invoke-virtual {v11, v4}, LE5/J0;->b(Ljava/lang/Object;)I

    .line 1049
    .line 1050
    .line 1051
    move-result v3

    .line 1052
    const/4 v4, -0x1

    .line 1053
    if-ne v3, v4, :cond_33

    .line 1054
    .line 1055
    const/4 v10, 0x4

    .line 1056
    :goto_33
    move-wide v3, v14

    .line 1057
    goto :goto_34

    .line 1058
    :cond_33
    move/from16 v10, v21

    .line 1059
    .line 1060
    goto :goto_33

    .line 1061
    :goto_34
    invoke-virtual/range {v1 .. v10}, LE5/O;->o(Lf6/z;JJJZI)LE5/q0;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v2

    .line 1065
    iput-object v2, v1, LE5/O;->w:LE5/q0;

    .line 1066
    .line 1067
    :cond_34
    invoke-virtual {v1}, LE5/O;->C()V

    .line 1068
    .line 1069
    .line 1070
    iget-object v2, v1, LE5/O;->w:LE5/q0;

    .line 1071
    .line 1072
    iget-object v2, v2, LE5/q0;->a:LE5/J0;

    .line 1073
    .line 1074
    invoke-virtual {v1, v11, v2}, LE5/O;->E(LE5/J0;LE5/J0;)V

    .line 1075
    .line 1076
    .line 1077
    iget-object v2, v1, LE5/O;->w:LE5/q0;

    .line 1078
    .line 1079
    invoke-virtual {v2, v11}, LE5/q0;->g(LE5/J0;)LE5/q0;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v2

    .line 1083
    iput-object v2, v1, LE5/O;->w:LE5/q0;

    .line 1084
    .line 1085
    invoke-virtual {v11}, LE5/J0;->p()Z

    .line 1086
    .line 1087
    .line 1088
    move-result v2

    .line 1089
    if-nez v2, :cond_35

    .line 1090
    .line 1091
    iput-object v13, v1, LE5/O;->J:LE5/N;

    .line 1092
    .line 1093
    :cond_35
    const/4 v5, 0x0

    .line 1094
    invoke-virtual {v1, v5}, LE5/O;->k(Z)V

    .line 1095
    .line 1096
    .line 1097
    throw v0
.end method

.method public final m(Lf6/w;)V
    .locals 12

    .line 1
    iget-object v0, p0, LE5/O;->r:LE5/i0;

    .line 2
    .line 3
    iget-object v1, v0, LE5/i0;->j:LE5/g0;

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    iget-object v2, v1, LE5/g0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    if-ne v2, p1, :cond_2

    .line 10
    .line 11
    iget-object p1, p0, LE5/O;->n:LE5/l;

    .line 12
    .line 13
    invoke-virtual {p1}, LE5/l;->e()LE5/r0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget p1, p1, LE5/r0;->a:F

    .line 18
    .line 19
    iget-object v2, p0, LE5/O;->w:LE5/q0;

    .line 20
    .line 21
    iget-object v2, v2, LE5/q0;->a:LE5/J0;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    iput-boolean v3, v1, LE5/g0;->d:Z

    .line 25
    .line 26
    iget-object v3, v1, LE5/g0;->a:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-interface {v3}, Lf6/w;->j()Lf6/a0;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    iput-object v3, v1, LE5/g0;->m:Lf6/a0;

    .line 33
    .line 34
    invoke-virtual {v1, p1, v2}, LE5/g0;->g(FLE5/J0;)Lr6/s;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object p1, v1, LE5/g0;->f:LE5/h0;

    .line 39
    .line 40
    iget-wide v3, p1, LE5/h0;->e:J

    .line 41
    .line 42
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    cmp-long v5, v3, v5

    .line 48
    .line 49
    iget-wide v6, p1, LE5/h0;->b:J

    .line 50
    .line 51
    if-eqz v5, :cond_0

    .line 52
    .line 53
    cmp-long p1, v6, v3

    .line 54
    .line 55
    if-ltz p1, :cond_0

    .line 56
    .line 57
    const-wide/16 v5, 0x1

    .line 58
    .line 59
    sub-long/2addr v3, v5

    .line 60
    const-wide/16 v5, 0x0

    .line 61
    .line 62
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 63
    .line 64
    .line 65
    move-result-wide v6

    .line 66
    :cond_0
    move-wide v3, v6

    .line 67
    iget-object p1, v1, LE5/g0;->i:[LE5/f;

    .line 68
    .line 69
    array-length p1, p1

    .line 70
    new-array v6, p1, [Z

    .line 71
    .line 72
    const/4 v5, 0x0

    .line 73
    invoke-virtual/range {v1 .. v6}, LE5/g0;->a(Lr6/s;JZ[Z)J

    .line 74
    .line 75
    .line 76
    move-result-wide v2

    .line 77
    iget-wide v4, v1, LE5/g0;->o:J

    .line 78
    .line 79
    iget-object p1, v1, LE5/g0;->f:LE5/h0;

    .line 80
    .line 81
    iget-wide v6, p1, LE5/h0;->b:J

    .line 82
    .line 83
    sub-long/2addr v6, v2

    .line 84
    add-long/2addr v6, v4

    .line 85
    iput-wide v6, v1, LE5/g0;->o:J

    .line 86
    .line 87
    invoke-virtual {p1, v2, v3}, LE5/h0;->b(J)LE5/h0;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iput-object p1, v1, LE5/g0;->f:LE5/h0;

    .line 92
    .line 93
    iget-object p1, v1, LE5/g0;->n:Lr6/s;

    .line 94
    .line 95
    invoke-virtual {p0, p1}, LE5/O;->d0(Lr6/s;)V

    .line 96
    .line 97
    .line 98
    iget-object p1, v0, LE5/i0;->h:LE5/g0;

    .line 99
    .line 100
    if-ne v1, p1, :cond_1

    .line 101
    .line 102
    iget-object p1, v1, LE5/g0;->f:LE5/h0;

    .line 103
    .line 104
    iget-wide v2, p1, LE5/h0;->b:J

    .line 105
    .line 106
    invoke-virtual {p0, v2, v3}, LE5/O;->D(J)V

    .line 107
    .line 108
    .line 109
    iget-object p1, p0, LE5/O;->a:[LE5/f;

    .line 110
    .line 111
    array-length p1, p1

    .line 112
    new-array p1, p1, [Z

    .line 113
    .line 114
    invoke-virtual {p0, p1}, LE5/O;->f([Z)V

    .line 115
    .line 116
    .line 117
    iget-object p1, p0, LE5/O;->w:LE5/q0;

    .line 118
    .line 119
    iget-object v3, p1, LE5/q0;->b:Lf6/z;

    .line 120
    .line 121
    iget-object v0, v1, LE5/g0;->f:LE5/h0;

    .line 122
    .line 123
    const/4 v10, 0x0

    .line 124
    const/4 v11, 0x5

    .line 125
    iget-wide v4, v0, LE5/h0;->b:J

    .line 126
    .line 127
    iget-wide v6, p1, LE5/q0;->c:J

    .line 128
    .line 129
    move-wide v8, v4

    .line 130
    move-object v2, p0

    .line 131
    invoke-virtual/range {v2 .. v11}, LE5/O;->o(Lf6/z;JJJZI)LE5/q0;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iput-object p1, v2, LE5/O;->w:LE5/q0;

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_1
    move-object v2, p0

    .line 139
    :goto_0
    invoke-virtual {p0}, LE5/O;->s()V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_2
    move-object v2, p0

    .line 144
    return-void
.end method

.method public final n(LE5/r0;FZZ)V
    .locals 4

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, LE5/O;->x:LA6/d;

    .line 6
    .line 7
    const/4 p4, 0x1

    .line 8
    invoke-virtual {p3, p4}, LA6/d;->a(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p3, p0, LE5/O;->w:LE5/q0;

    .line 12
    .line 13
    invoke-virtual {p3, p1}, LE5/q0;->e(LE5/r0;)LE5/q0;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    iput-object p3, p0, LE5/O;->w:LE5/q0;

    .line 18
    .line 19
    :cond_1
    iget p3, p1, LE5/r0;->a:F

    .line 20
    .line 21
    iget-object p4, p0, LE5/O;->r:LE5/i0;

    .line 22
    .line 23
    iget-object p4, p4, LE5/i0;->h:LE5/g0;

    .line 24
    .line 25
    :goto_0
    const/4 v0, 0x0

    .line 26
    if-eqz p4, :cond_4

    .line 27
    .line 28
    iget-object v1, p4, LE5/g0;->n:Lr6/s;

    .line 29
    .line 30
    iget-object v1, v1, Lr6/s;->c:[Lr6/n;

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
    invoke-interface {v3, p3}, Lr6/n;->d(F)V

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
    iget-object p4, p4, LE5/g0;->l:LE5/g0;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    iget-object p3, p0, LE5/O;->a:[LE5/f;

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
    iget v2, p1, LE5/r0;->a:F

    .line 58
    .line 59
    invoke-virtual {v1, p2, v2}, LE5/f;->v(FF)V

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

.method public final o(Lf6/z;JJJZI)LE5/q0;
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
    iget-boolean v3, v0, LE5/O;->M:Z

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    iget-object v3, v0, LE5/O;->w:LE5/q0;

    .line 15
    .line 16
    iget-wide v8, v3, LE5/q0;->r:J

    .line 17
    .line 18
    cmp-long v3, p2, v8

    .line 19
    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    iget-object v3, v0, LE5/O;->w:LE5/q0;

    .line 23
    .line 24
    iget-object v3, v3, LE5/q0;->b:Lf6/z;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Lf6/x;->equals(Ljava/lang/Object;)Z

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
    iput-boolean v3, v0, LE5/O;->M:Z

    .line 37
    .line 38
    invoke-virtual {v0}, LE5/O;->C()V

    .line 39
    .line 40
    .line 41
    iget-object v3, v0, LE5/O;->w:LE5/q0;

    .line 42
    .line 43
    iget-object v8, v3, LE5/q0;->h:Lf6/a0;

    .line 44
    .line 45
    iget-object v9, v3, LE5/q0;->i:Lr6/s;

    .line 46
    .line 47
    iget-object v10, v3, LE5/q0;->j:Ljava/util/List;

    .line 48
    .line 49
    iget-object v11, v0, LE5/O;->s:LE5/n0;

    .line 50
    .line 51
    iget-boolean v11, v11, LE5/n0;->g:Z

    .line 52
    .line 53
    if-eqz v11, :cond_9

    .line 54
    .line 55
    iget-object v3, v0, LE5/O;->r:LE5/i0;

    .line 56
    .line 57
    iget-object v3, v3, LE5/i0;->h:LE5/g0;

    .line 58
    .line 59
    if-nez v3, :cond_2

    .line 60
    .line 61
    sget-object v8, Lf6/a0;->d:Lf6/a0;

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    iget-object v8, v3, LE5/g0;->m:Lf6/a0;

    .line 65
    .line 66
    :goto_2
    if-nez v3, :cond_3

    .line 67
    .line 68
    iget-object v9, v0, LE5/O;->e:Lr6/s;

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    iget-object v9, v3, LE5/g0;->n:Lr6/s;

    .line 72
    .line 73
    :goto_3
    iget-object v10, v9, Lr6/s;->c:[Lr6/n;

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
    invoke-interface {v15, v4}, Lr6/n;->b(I)LE5/T;

    .line 91
    .line 92
    .line 93
    move-result-object v15

    .line 94
    iget-object v15, v15, LE5/T;->j:LW5/c;

    .line 95
    .line 96
    if-nez v15, :cond_4

    .line 97
    .line 98
    new-instance v15, LW5/c;

    .line 99
    .line 100
    const/16 v16, 0x1

    .line 101
    .line 102
    new-array v7, v4, [LW5/b;

    .line 103
    .line 104
    invoke-direct {v15, v7}, LW5/c;-><init>([LW5/b;)V

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
    iget-object v7, v3, LE5/g0;->f:LE5/h0;

    .line 142
    .line 143
    iget-wide v11, v7, LE5/h0;->c:J

    .line 144
    .line 145
    cmp-long v11, v11, v5

    .line 146
    .line 147
    if-eqz v11, :cond_8

    .line 148
    .line 149
    invoke-virtual {v7, v5, v6}, LE5/h0;->a(J)LE5/h0;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    iput-object v7, v3, LE5/g0;->f:LE5/h0;

    .line 154
    .line 155
    :cond_8
    :goto_8
    move-object v11, v8

    .line 156
    move-object v12, v9

    .line 157
    move-object v13, v10

    .line 158
    goto :goto_9

    .line 159
    :cond_9
    const/16 v16, 0x1

    .line 160
    .line 161
    iget-object v3, v3, LE5/q0;->b:Lf6/z;

    .line 162
    .line 163
    invoke-virtual {v2, v3}, Lf6/x;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    if-nez v3, :cond_8

    .line 168
    .line 169
    sget-object v8, Lf6/a0;->d:Lf6/a0;

    .line 170
    .line 171
    iget-object v9, v0, LE5/O;->e:Lr6/s;

    .line 172
    .line 173
    sget-object v10, Ll8/e0;->e:Ll8/e0;

    .line 174
    .line 175
    goto :goto_8

    .line 176
    :goto_9
    if-eqz p8, :cond_c

    .line 177
    .line 178
    iget-object v3, v0, LE5/O;->x:LA6/d;

    .line 179
    .line 180
    iget-boolean v7, v3, LA6/d;->c:Z

    .line 181
    .line 182
    if-eqz v7, :cond_b

    .line 183
    .line 184
    iget v7, v3, LA6/d;->d:I

    .line 185
    .line 186
    const/4 v8, 0x5

    .line 187
    if-eq v7, v8, :cond_b

    .line 188
    .line 189
    if-ne v1, v8, :cond_a

    .line 190
    .line 191
    move/from16 v4, v16

    .line 192
    .line 193
    :cond_a
    invoke-static {v4}, Lu6/a;->e(Z)V

    .line 194
    .line 195
    .line 196
    goto :goto_a

    .line 197
    :cond_b
    move/from16 v4, v16

    .line 198
    .line 199
    iput-boolean v4, v3, LA6/d;->a:Z

    .line 200
    .line 201
    iput-boolean v4, v3, LA6/d;->c:Z

    .line 202
    .line 203
    iput v1, v3, LA6/d;->d:I

    .line 204
    .line 205
    :cond_c
    :goto_a
    iget-object v1, v0, LE5/O;->w:LE5/q0;

    .line 206
    .line 207
    iget-wide v3, v1, LE5/q0;->p:J

    .line 208
    .line 209
    iget-object v7, v0, LE5/O;->r:LE5/i0;

    .line 210
    .line 211
    iget-object v7, v7, LE5/i0;->j:LE5/g0;

    .line 212
    .line 213
    if-nez v7, :cond_d

    .line 214
    .line 215
    const-wide/16 v9, 0x0

    .line 216
    .line 217
    :goto_b
    move-wide/from16 v3, p2

    .line 218
    .line 219
    move-wide/from16 v7, p6

    .line 220
    .line 221
    goto :goto_c

    .line 222
    :cond_d
    iget-wide v14, v0, LE5/O;->K:J

    .line 223
    .line 224
    iget-wide v8, v7, LE5/g0;->o:J

    .line 225
    .line 226
    sub-long/2addr v14, v8

    .line 227
    sub-long/2addr v3, v14

    .line 228
    const-wide/16 v7, 0x0

    .line 229
    .line 230
    invoke-static {v7, v8, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 231
    .line 232
    .line 233
    move-result-wide v8

    .line 234
    move-wide v9, v8

    .line 235
    goto :goto_b

    .line 236
    :goto_c
    invoke-virtual/range {v1 .. v13}, LE5/q0;->b(Lf6/z;JJJJLf6/a0;Lr6/s;Ljava/util/List;)LE5/q0;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    return-object v1
.end method

.method public final p()Z
    .locals 4

    .line 1
    iget-object v0, p0, LE5/O;->r:LE5/i0;

    .line 2
    .line 3
    iget-object v0, v0, LE5/i0;->j:LE5/g0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-boolean v1, v0, LE5/g0;->d:Z

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    iget-object v0, v0, LE5/g0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-interface {v0}, Lf6/W;->c()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    :goto_0
    const-wide/high16 v2, -0x8000000000000000L

    .line 22
    .line 23
    cmp-long v0, v0, v2

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    :goto_1
    const/4 v0, 0x0

    .line 28
    return v0

    .line 29
    :cond_2
    const/4 v0, 0x1

    .line 30
    return v0
.end method

.method public final r()Z
    .locals 5

    .line 1
    iget-object v0, p0, LE5/O;->r:LE5/i0;

    .line 2
    .line 3
    iget-object v0, v0, LE5/i0;->h:LE5/g0;

    .line 4
    .line 5
    iget-object v1, v0, LE5/g0;->f:LE5/h0;

    .line 6
    .line 7
    iget-wide v1, v1, LE5/h0;->e:J

    .line 8
    .line 9
    iget-boolean v0, v0, LE5/g0;->d:Z

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
    iget-object v0, p0, LE5/O;->w:LE5/q0;

    .line 23
    .line 24
    iget-wide v3, v0, LE5/q0;->r:J

    .line 25
    .line 26
    cmp-long v0, v3, v1

    .line 27
    .line 28
    if-ltz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, LE5/O;->X()Z

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

.method public final s()V
    .locals 11

    .line 1
    invoke-virtual {p0}, LE5/O;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    move v0, v1

    .line 9
    goto :goto_2

    .line 10
    :cond_0
    iget-object v0, p0, LE5/O;->r:LE5/i0;

    .line 11
    .line 12
    iget-object v0, v0, LE5/i0;->j:LE5/g0;

    .line 13
    .line 14
    iget-boolean v2, v0, LE5/g0;->d:Z

    .line 15
    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    move-wide v5, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object v0, v0, LE5/g0;->a:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-interface {v0}, Lf6/W;->c()J

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    :goto_0
    iget-object v0, p0, LE5/O;->r:LE5/i0;

    .line 29
    .line 30
    iget-object v0, v0, LE5/i0;->j:LE5/g0;

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    move-wide v5, v3

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    iget-wide v7, p0, LE5/O;->K:J

    .line 37
    .line 38
    iget-wide v9, v0, LE5/g0;->o:J

    .line 39
    .line 40
    sub-long/2addr v7, v9

    .line 41
    sub-long/2addr v5, v7

    .line 42
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    :goto_1
    iget-object v0, p0, LE5/O;->r:LE5/i0;

    .line 47
    .line 48
    iget-object v0, v0, LE5/i0;->h:LE5/g0;

    .line 49
    .line 50
    iget-object v0, p0, LE5/O;->f:LE5/k;

    .line 51
    .line 52
    iget-object v2, p0, LE5/O;->n:LE5/l;

    .line 53
    .line 54
    invoke-virtual {v2}, LE5/l;->e()LE5/r0;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iget v2, v2, LE5/r0;->a:F

    .line 59
    .line 60
    invoke-virtual {v0, v5, v6, v2}, LE5/k;->c(JF)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_4

    .line 65
    .line 66
    const-wide/32 v7, 0x7a120

    .line 67
    .line 68
    .line 69
    cmp-long v2, v5, v7

    .line 70
    .line 71
    if-gez v2, :cond_4

    .line 72
    .line 73
    iget-wide v7, p0, LE5/O;->m:J

    .line 74
    .line 75
    cmp-long v2, v7, v3

    .line 76
    .line 77
    if-gtz v2, :cond_3

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    iget-object v0, p0, LE5/O;->r:LE5/i0;

    .line 81
    .line 82
    iget-object v0, v0, LE5/i0;->h:LE5/g0;

    .line 83
    .line 84
    iget-object v0, v0, LE5/g0;->a:Ljava/lang/Object;

    .line 85
    .line 86
    iget-object v2, p0, LE5/O;->w:LE5/q0;

    .line 87
    .line 88
    iget-wide v2, v2, LE5/q0;->r:J

    .line 89
    .line 90
    invoke-interface {v0, v2, v3}, Lf6/w;->i(J)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, LE5/O;->f:LE5/k;

    .line 94
    .line 95
    iget-object v2, p0, LE5/O;->n:LE5/l;

    .line 96
    .line 97
    invoke-virtual {v2}, LE5/l;->e()LE5/r0;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    iget v2, v2, LE5/r0;->a:F

    .line 102
    .line 103
    invoke-virtual {v0, v5, v6, v2}, LE5/k;->c(JF)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    :cond_4
    :goto_2
    iput-boolean v0, p0, LE5/O;->C:Z

    .line 108
    .line 109
    if-eqz v0, :cond_6

    .line 110
    .line 111
    iget-object v0, p0, LE5/O;->r:LE5/i0;

    .line 112
    .line 113
    iget-object v0, v0, LE5/i0;->j:LE5/g0;

    .line 114
    .line 115
    iget-wide v2, p0, LE5/O;->K:J

    .line 116
    .line 117
    iget-object v4, v0, LE5/g0;->l:LE5/g0;

    .line 118
    .line 119
    if-nez v4, :cond_5

    .line 120
    .line 121
    const/4 v1, 0x1

    .line 122
    :cond_5
    invoke-static {v1}, Lu6/a;->i(Z)V

    .line 123
    .line 124
    .line 125
    iget-wide v4, v0, LE5/g0;->o:J

    .line 126
    .line 127
    sub-long/2addr v2, v4

    .line 128
    iget-object v0, v0, LE5/g0;->a:Ljava/lang/Object;

    .line 129
    .line 130
    invoke-interface {v0, v2, v3}, Lf6/W;->z(J)Z

    .line 131
    .line 132
    .line 133
    :cond_6
    invoke-virtual {p0}, LE5/O;->c0()V

    .line 134
    .line 135
    .line 136
    return-void
.end method

.method public final t()V
    .locals 5

    .line 1
    iget-object v0, p0, LE5/O;->x:LA6/d;

    .line 2
    .line 3
    iget-object v1, p0, LE5/O;->w:LE5/q0;

    .line 4
    .line 5
    iget-boolean v2, v0, LA6/d;->a:Z

    .line 6
    .line 7
    iget-object v3, v0, LA6/d;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, LE5/q0;

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
    iput-boolean v2, v0, LA6/d;->a:Z

    .line 18
    .line 19
    iput-object v1, v0, LA6/d;->g:Ljava/lang/Object;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, LE5/O;->q:LE5/u;

    .line 24
    .line 25
    iget-object v1, v1, LE5/u;->a:LE5/I;

    .line 26
    .line 27
    iget-object v2, v1, LE5/I;->i:Lu6/s;

    .line 28
    .line 29
    new-instance v3, LC8/d;

    .line 30
    .line 31
    const/4 v4, 0x4

    .line 32
    invoke-direct {v3, v4, v1, v0}, LC8/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v2, Lu6/s;->a:Landroid/os/Handler;

    .line 36
    .line 37
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 38
    .line 39
    .line 40
    new-instance v0, LA6/d;

    .line 41
    .line 42
    iget-object v1, p0, LE5/O;->w:LE5/q0;

    .line 43
    .line 44
    invoke-direct {v0, v1}, LA6/d;-><init>(LE5/q0;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, LE5/O;->x:LA6/d;

    .line 48
    .line 49
    :cond_1
    return-void
.end method

.method public final u()V
    .locals 2

    .line 1
    iget-object v0, p0, LE5/O;->s:LE5/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, LE5/n0;->d()LE5/J0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {p0, v0, v1}, LE5/O;->l(LE5/J0;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final v()V
    .locals 2

    .line 1
    iget-object v0, p0, LE5/O;->x:LA6/d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, LA6/d;->a(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    throw v0
.end method

.method public final w()V
    .locals 6

    .line 1
    iget-object v0, p0, LE5/O;->x:LA6/d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, LA6/d;->a(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0, v0, v0, v1}, LE5/O;->B(ZZZZ)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, LE5/O;->f:LE5/k;

    .line 12
    .line 13
    invoke-virtual {v2, v0}, LE5/k;->b(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, LE5/O;->w:LE5/q0;

    .line 17
    .line 18
    iget-object v2, v2, LE5/q0;->a:LE5/J0;

    .line 19
    .line 20
    invoke-virtual {v2}, LE5/J0;->p()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v2, v3

    .line 30
    :goto_0
    invoke-virtual {p0, v2}, LE5/O;->W(I)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, LE5/O;->g:Lt6/e;

    .line 34
    .line 35
    check-cast v2, Lt6/p;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v4, p0, LE5/O;->s:LE5/n0;

    .line 41
    .line 42
    iget-boolean v5, v4, LE5/n0;->g:Z

    .line 43
    .line 44
    xor-int/2addr v5, v1

    .line 45
    invoke-static {v5}, Lu6/a;->i(Z)V

    .line 46
    .line 47
    .line 48
    iput-object v2, v4, LE5/n0;->m:Ljava/lang/Object;

    .line 49
    .line 50
    :goto_1
    iget-object v2, v4, LE5/n0;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-ge v0, v5, :cond_1

    .line 59
    .line 60
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, LE5/m0;

    .line 65
    .line 66
    invoke-virtual {v4, v2}, LE5/n0;->n(LE5/m0;)V

    .line 67
    .line 68
    .line 69
    iget-object v5, v4, LE5/n0;->f:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v5, Ljava/util/HashSet;

    .line 72
    .line 73
    invoke-virtual {v5, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    add-int/lit8 v0, v0, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    iput-boolean v1, v4, LE5/n0;->g:Z

    .line 80
    .line 81
    iget-object v0, p0, LE5/O;->h:Lu6/s;

    .line 82
    .line 83
    invoke-virtual {v0, v3}, Lu6/s;->c(I)Z

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final declared-synchronized x()Z
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LE5/O;->y:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, LE5/O;->i:Landroid/os/HandlerThread;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, LE5/O;->h:Lu6/s;

    .line 16
    .line 17
    const/4 v1, 0x7

    .line 18
    invoke-virtual {v0, v1}, Lu6/s;->c(I)Z

    .line 19
    .line 20
    .line 21
    new-instance v0, LE5/J;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, p0, v1}, LE5/J;-><init>(Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    iget-wide v1, p0, LE5/O;->u:J

    .line 28
    .line 29
    invoke-virtual {p0, v0, v1, v2}, LE5/O;->g0(LE5/J;J)V

    .line 30
    .line 31
    .line 32
    iget-boolean v0, p0, LE5/O;->y:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    monitor-exit p0

    .line 35
    return v0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    :goto_0
    monitor-exit p0

    .line 39
    const/4 v0, 0x1

    .line 40
    return v0

    .line 41
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw v0
.end method

.method public final y()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, v1, v0, v1, v0}, LE5/O;->B(ZZZZ)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LE5/O;->f:LE5/k;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, LE5/k;->b(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, LE5/O;->W(I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LE5/O;->i:Landroid/os/HandlerThread;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 17
    .line 18
    .line 19
    monitor-enter p0

    .line 20
    :try_start_0
    iput-boolean v1, p0, LE5/O;->y:Z

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 23
    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw v0
.end method

.method public final z(IILf6/X;)V
    .locals 4

    .line 1
    iget-object v0, p0, LE5/O;->x:LA6/d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, LA6/d;->a(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LE5/O;->s:LE5/n0;

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
    invoke-static {v1}, Lu6/a;->e(Z)V

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
    invoke-virtual {v0}, LE5/n0;->d()LE5/J0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1, v2}, LE5/O;->l(LE5/J0;Z)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
