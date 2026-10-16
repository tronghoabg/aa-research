.class public final LX1/f;
.super Lk2/a;
.source "SourceFile"


# instance fields
.field public A:Lo2/m;

.field public B:LS1/A;

.field public C:Lio/ktor/utils/io/T;

.field public D:Landroid/os/Handler;

.field public E:LN1/s;

.field public F:Landroid/net/Uri;

.field public final G:Landroid/net/Uri;

.field public H:LY1/c;

.field public I:Z

.field public J:J

.field public K:J

.field public L:J

.field public M:I

.field public N:J

.field public O:I

.field public P:LN1/w;

.field public final h:Z

.field public final i:LS1/g;

.field public final j:LE4/n;

.field public final k:La9/b;

.field public final l:LZ1/g;

.field public final m:Lae/d;

.field public final n:LS3/n;

.field public final o:J

.field public final p:J

.field public final q:LZ1/d;

.field public final r:Lo2/o;

.field public final s:LA/e0;

.field public final t:Ljava/lang/Object;

.field public final u:Landroid/util/SparseArray;

.field public final v:LX1/c;

.field public final w:LX1/c;

.field public final x:LY9/c;

.field public final y:Lo2/n;

.field public z:LS1/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.exoplayer.dash"

    .line 2
    .line 3
    invoke-static {v0}, LN1/x;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(LN1/w;LS1/g;Lo2/o;LE4/n;La9/b;LZ1/g;Lae/d;JJ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lk2/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LX1/f;->P:LN1/w;

    .line 5
    .line 6
    iget-object v0, p1, LN1/w;->c:LN1/s;

    .line 7
    .line 8
    iput-object v0, p0, LX1/f;->E:LN1/s;

    .line 9
    .line 10
    iget-object p1, p1, LN1/w;->b:LN1/t;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p1, p1, LN1/t;->a:Landroid/net/Uri;

    .line 16
    .line 17
    iput-object p1, p0, LX1/f;->F:Landroid/net/Uri;

    .line 18
    .line 19
    iput-object p1, p0, LX1/f;->G:Landroid/net/Uri;

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    iput-object p1, p0, LX1/f;->H:LY1/c;

    .line 23
    .line 24
    iput-object p2, p0, LX1/f;->i:LS1/g;

    .line 25
    .line 26
    iput-object p3, p0, LX1/f;->r:Lo2/o;

    .line 27
    .line 28
    iput-object p4, p0, LX1/f;->j:LE4/n;

    .line 29
    .line 30
    iput-object p6, p0, LX1/f;->l:LZ1/g;

    .line 31
    .line 32
    iput-object p7, p0, LX1/f;->m:Lae/d;

    .line 33
    .line 34
    iput-wide p8, p0, LX1/f;->o:J

    .line 35
    .line 36
    iput-wide p10, p0, LX1/f;->p:J

    .line 37
    .line 38
    iput-object p5, p0, LX1/f;->k:La9/b;

    .line 39
    .line 40
    new-instance p2, LS3/n;

    .line 41
    .line 42
    new-instance p3, Ljava/util/Random;

    .line 43
    .line 44
    invoke-direct {p3}, Ljava/util/Random;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance p4, Ljava/util/HashMap;

    .line 51
    .line 52
    invoke-direct {p4}, Ljava/util/HashMap;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p4, p2, LS3/n;->c:Ljava/lang/Object;

    .line 56
    .line 57
    iput-object p3, p2, LS3/n;->d:Ljava/lang/Object;

    .line 58
    .line 59
    new-instance p3, Ljava/util/HashMap;

    .line 60
    .line 61
    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object p3, p2, LS3/n;->a:Ljava/lang/Object;

    .line 65
    .line 66
    new-instance p3, Ljava/util/HashMap;

    .line 67
    .line 68
    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object p3, p2, LS3/n;->b:Ljava/lang/Object;

    .line 72
    .line 73
    iput-object p2, p0, LX1/f;->n:LS3/n;

    .line 74
    .line 75
    const/4 p2, 0x0

    .line 76
    iput-boolean p2, p0, LX1/f;->h:Z

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Lk2/a;->a(Lk2/H;)LZ1/d;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iput-object p1, p0, LX1/f;->q:LZ1/d;

    .line 83
    .line 84
    new-instance p1, Ljava/lang/Object;

    .line 85
    .line 86
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object p1, p0, LX1/f;->t:Ljava/lang/Object;

    .line 90
    .line 91
    new-instance p1, Landroid/util/SparseArray;

    .line 92
    .line 93
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-object p1, p0, LX1/f;->u:Landroid/util/SparseArray;

    .line 97
    .line 98
    new-instance p1, LY9/c;

    .line 99
    .line 100
    const/16 p2, 0x19

    .line 101
    .line 102
    invoke-direct {p1, p0, p2}, LY9/c;-><init>(Ljava/lang/Object;I)V

    .line 103
    .line 104
    .line 105
    iput-object p1, p0, LX1/f;->x:LY9/c;

    .line 106
    .line 107
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    iput-wide p1, p0, LX1/f;->N:J

    .line 113
    .line 114
    iput-wide p1, p0, LX1/f;->L:J

    .line 115
    .line 116
    new-instance p1, LA/e0;

    .line 117
    .line 118
    const/16 p2, 0x18

    .line 119
    .line 120
    invoke-direct {p1, p0, p2}, LA/e0;-><init>(Ljava/lang/Object;I)V

    .line 121
    .line 122
    .line 123
    iput-object p1, p0, LX1/f;->s:LA/e0;

    .line 124
    .line 125
    new-instance p1, Lxa/d;

    .line 126
    .line 127
    const/16 p2, 0x1a

    .line 128
    .line 129
    invoke-direct {p1, p0, p2}, Lxa/d;-><init>(Ljava/lang/Object;I)V

    .line 130
    .line 131
    .line 132
    iput-object p1, p0, LX1/f;->y:Lo2/n;

    .line 133
    .line 134
    new-instance p1, LX1/c;

    .line 135
    .line 136
    const/4 p2, 0x0

    .line 137
    invoke-direct {p1, p0, p2}, LX1/c;-><init>(LX1/f;I)V

    .line 138
    .line 139
    .line 140
    iput-object p1, p0, LX1/f;->v:LX1/c;

    .line 141
    .line 142
    new-instance p1, LX1/c;

    .line 143
    .line 144
    const/4 p2, 0x1

    .line 145
    invoke-direct {p1, p0, p2}, LX1/c;-><init>(LX1/f;I)V

    .line 146
    .line 147
    .line 148
    iput-object p1, p0, LX1/f;->w:LX1/c;

    .line 149
    .line 150
    return-void
.end method

.method public static t(LY1/h;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, LY1/h;->c:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    if-ge v1, v3, :cond_2

    .line 10
    .line 11
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, LY1/a;

    .line 16
    .line 17
    iget v2, v2, LY1/a;->b:I

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    if-eq v2, v3, :cond_1

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    if-ne v2, v4, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    :goto_1
    return v3

    .line 30
    :cond_2
    return v0
.end method


# virtual methods
.method public final b(Lk2/H;Lo2/e;J)Lk2/F;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lk2/H;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget v3, v0, LX1/f;->O:I

    .line 14
    .line 15
    sub-int v8, v2, v3

    .line 16
    .line 17
    invoke-virtual/range {p0 .. p1}, Lk2/a;->a(Lk2/H;)LZ1/d;

    .line 18
    .line 19
    .line 20
    move-result-object v14

    .line 21
    new-instance v12, LZ1/d;

    .line 22
    .line 23
    iget-object v2, v0, Lk2/a;->d:LZ1/d;

    .line 24
    .line 25
    iget-object v2, v2, LZ1/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct {v12, v2, v3, v1}, LZ1/d;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILk2/H;)V

    .line 29
    .line 30
    .line 31
    new-instance v4, LX1/b;

    .line 32
    .line 33
    iget v1, v0, LX1/f;->O:I

    .line 34
    .line 35
    add-int v5, v1, v8

    .line 36
    .line 37
    iget-object v6, v0, LX1/f;->H:LY1/c;

    .line 38
    .line 39
    iget-object v10, v0, LX1/f;->B:LS1/A;

    .line 40
    .line 41
    iget-wide v1, v0, LX1/f;->L:J

    .line 42
    .line 43
    iget-object v3, v0, Lk2/a;->g:LV1/k;

    .line 44
    .line 45
    invoke-static {v3}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v7, v0, LX1/f;->k:La9/b;

    .line 49
    .line 50
    iget-object v9, v0, LX1/f;->x:LY9/c;

    .line 51
    .line 52
    move-object/from16 v19, v7

    .line 53
    .line 54
    iget-object v7, v0, LX1/f;->n:LS3/n;

    .line 55
    .line 56
    move-object/from16 v20, v9

    .line 57
    .line 58
    iget-object v9, v0, LX1/f;->j:LE4/n;

    .line 59
    .line 60
    iget-object v11, v0, LX1/f;->l:LZ1/g;

    .line 61
    .line 62
    iget-object v13, v0, LX1/f;->m:Lae/d;

    .line 63
    .line 64
    iget-object v15, v0, LX1/f;->y:Lo2/n;

    .line 65
    .line 66
    move-object/from16 v18, p2

    .line 67
    .line 68
    move-object/from16 v21, v3

    .line 69
    .line 70
    move-object/from16 v17, v15

    .line 71
    .line 72
    move-wide v15, v1

    .line 73
    invoke-direct/range {v4 .. v21}, LX1/b;-><init>(ILY1/c;LS3/n;ILE4/n;LS1/A;LZ1/g;LZ1/d;Lae/d;LZ1/d;JLo2/n;Lo2/e;La9/b;LY9/c;LV1/k;)V

    .line 74
    .line 75
    .line 76
    iget-object v1, v0, LX1/f;->u:Landroid/util/SparseArray;

    .line 77
    .line 78
    invoke-virtual {v1, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-object v4
.end method

.method public final declared-synchronized h()LN1/w;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LX1/f;->P:LN1/w;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-object v0, p0, LX1/f;->y:Lo2/n;

    .line 2
    .line 3
    invoke-interface {v0}, Lo2/n;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l(LS1/A;)V
    .locals 2

    .line 1
    iput-object p1, p0, LX1/f;->B:LS1/A;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lk2/a;->g:LV1/k;

    .line 8
    .line 9
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, LX1/f;->l:LZ1/g;

    .line 13
    .line 14
    invoke-interface {v1, p1, v0}, LZ1/g;->h(Landroid/os/Looper;LV1/k;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1}, LZ1/g;->f()V

    .line 18
    .line 19
    .line 20
    iget-boolean p1, p0, LX1/f;->h:Z

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-virtual {p0, p1}, LX1/f;->y(Z)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object p1, p0, LX1/f;->i:LS1/g;

    .line 30
    .line 31
    invoke-interface {p1}, LS1/g;->b()LS1/h;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, LX1/f;->z:LS1/h;

    .line 36
    .line 37
    new-instance p1, Lo2/m;

    .line 38
    .line 39
    const-string v0, "DashMediaSource"

    .line 40
    .line 41
    invoke-direct {p1, v0}, Lo2/m;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, LX1/f;->A:Lo2/m;

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    invoke-static {p1}, LQ1/x;->m(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, LX1/f;->D:Landroid/os/Handler;

    .line 52
    .line 53
    invoke-virtual {p0}, LX1/f;->z()V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final n(Lk2/F;)V
    .locals 5

    .line 1
    check-cast p1, LX1/b;

    .line 2
    .line 3
    iget-object v0, p1, LX1/b;->m:LX1/m;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iput-boolean v1, v0, LX1/m;->i:Z

    .line 7
    .line 8
    iget-object v0, v0, LX1/m;->d:Landroid/os/Handler;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, LX1/b;->r:[Ll2/h;

    .line 15
    .line 16
    array-length v2, v0

    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_0
    if-ge v3, v2, :cond_0

    .line 19
    .line 20
    aget-object v4, v0, v3

    .line 21
    .line 22
    invoke-virtual {v4, p1}, Ll2/h;->y(LX1/b;)V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iput-object v1, p1, LX1/b;->q:Lk2/E;

    .line 29
    .line 30
    iget-object v0, p0, LX1/f;->u:Landroid/util/SparseArray;

    .line 31
    .line 32
    iget p1, p1, LX1/b;->a:I

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final p()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LX1/f;->I:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, LX1/f;->z:LS1/h;

    .line 6
    .line 7
    iget-object v2, p0, LX1/f;->A:Lo2/m;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Lo2/m;->e(Lo2/k;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, LX1/f;->A:Lo2/m;

    .line 15
    .line 16
    :cond_0
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    iput-wide v2, p0, LX1/f;->J:J

    .line 19
    .line 20
    iput-wide v2, p0, LX1/f;->K:J

    .line 21
    .line 22
    iget-object v2, p0, LX1/f;->G:Landroid/net/Uri;

    .line 23
    .line 24
    iput-object v2, p0, LX1/f;->F:Landroid/net/Uri;

    .line 25
    .line 26
    iput-object v1, p0, LX1/f;->C:Lio/ktor/utils/io/T;

    .line 27
    .line 28
    iget-object v2, p0, LX1/f;->D:Landroid/os/Handler;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, LX1/f;->D:Landroid/os/Handler;

    .line 36
    .line 37
    :cond_1
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    iput-wide v1, p0, LX1/f;->L:J

    .line 43
    .line 44
    iput v0, p0, LX1/f;->M:I

    .line 45
    .line 46
    iput-wide v1, p0, LX1/f;->N:J

    .line 47
    .line 48
    iget-object v0, p0, LX1/f;->u:Landroid/util/SparseArray;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, LX1/f;->n:LS3/n;

    .line 54
    .line 55
    iget-object v1, v0, LS3/n;->a:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Ljava/util/HashMap;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 60
    .line 61
    .line 62
    iget-object v1, v0, LS3/n;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Ljava/util/HashMap;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 67
    .line 68
    .line 69
    iget-object v0, v0, LS3/n;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Ljava/util/HashMap;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, LX1/f;->l:LZ1/g;

    .line 77
    .line 78
    invoke-interface {v0}, LZ1/g;->release()V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final declared-synchronized s(LN1/w;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, LX1/f;->P:LN1/w;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public final u()V
    .locals 5

    .line 1
    iget-object v0, p0, LX1/f;->A:Lo2/m;

    .line 2
    .line 3
    new-instance v1, LS3/l;

    .line 4
    .line 5
    invoke-direct {v1, p0}, LS3/l;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget-object v2, Lp2/b;->b:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v2

    .line 11
    :try_start_0
    sget-boolean v3, Lp2/b;->c:Z

    .line 12
    .line 13
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, LS3/l;->r()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    if-nez v0, :cond_1

    .line 21
    .line 22
    new-instance v0, Lo2/m;

    .line 23
    .line 24
    const-string v2, "SntpClient"

    .line 25
    .line 26
    invoke-direct {v0, v2}, Lo2/m;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    new-instance v2, La9/a;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v3, La2/c;

    .line 35
    .line 36
    const/16 v4, 0x15

    .line 37
    .line 38
    invoke-direct {v3, v1, v4}, La2/c;-><init>(Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-virtual {v0, v2, v3, v1}, Lo2/m;->f(Lo2/j;Lo2/h;I)J

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw v0
.end method

.method public final v(Lo2/p;J)V
    .locals 11

    .line 1
    new-instance v1, Lk2/z;

    .line 2
    .line 3
    iget-wide v2, p1, Lo2/p;->a:J

    .line 4
    .line 5
    iget-object v0, p1, Lo2/p;->d:LS1/z;

    .line 6
    .line 7
    iget-object v0, v0, LS1/z;->c:Landroid/net/Uri;

    .line 8
    .line 9
    invoke-direct {v1, p2, p3}, Lk2/z;-><init>(J)V

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, LX1/f;->m:Lae/d;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    iget-object v0, p0, LX1/f;->q:LZ1/d;

    .line 28
    .line 29
    iget v2, p1, Lo2/p;->c:I

    .line 30
    .line 31
    const/4 v3, -0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    invoke-virtual/range {v0 .. v10}, LZ1/d;->c(Lk2/z;IILN1/n;ILjava/lang/Object;JJ)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final x(Ljava/io/IOException;)V
    .locals 4

    .line 1
    const-string v0, "DashMediaSource"

    .line 2
    .line 3
    const-string v1, "Failed to resolve time offset."

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, LQ1/k;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    sub-long/2addr v0, v2

    .line 17
    iput-wide v0, p0, LX1/f;->L:J

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p1}, LX1/f;->y(Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final y(Z)V
    .locals 42

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    move v3, v2

    .line 5
    :goto_0
    iget-object v0, v1, LX1/f;->u:Landroid/util/SparseArray;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    if-ge v3, v4, :cond_9

    .line 12
    .line 13
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->keyAt(I)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    iget v6, v1, LX1/f;->O:I

    .line 18
    .line 19
    if-lt v4, v6, :cond_8

    .line 20
    .line 21
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v6, v0

    .line 26
    check-cast v6, LX1/b;

    .line 27
    .line 28
    iget-object v7, v1, LX1/f;->H:LY1/c;

    .line 29
    .line 30
    iget v0, v1, LX1/f;->O:I

    .line 31
    .line 32
    sub-int/2addr v4, v0

    .line 33
    iput-object v7, v6, LX1/b;->u:LY1/c;

    .line 34
    .line 35
    iput v4, v6, LX1/b;->v:I

    .line 36
    .line 37
    iget-object v0, v6, LX1/b;->m:LX1/m;

    .line 38
    .line 39
    iput-boolean v2, v0, LX1/m;->h:Z

    .line 40
    .line 41
    iput-object v7, v0, LX1/m;->f:LY1/c;

    .line 42
    .line 43
    iget-object v8, v0, LX1/m;->e:Ljava/util/TreeMap;

    .line 44
    .line 45
    invoke-virtual {v8}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    :cond_0
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    if-eqz v9, :cond_1

    .line 58
    .line 59
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    check-cast v9, Ljava/util/Map$Entry;

    .line 64
    .line 65
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    check-cast v9, Ljava/lang/Long;

    .line 70
    .line 71
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 72
    .line 73
    .line 74
    move-result-wide v9

    .line 75
    iget-object v11, v0, LX1/m;->f:LY1/c;

    .line 76
    .line 77
    iget-wide v11, v11, LY1/c;->h:J

    .line 78
    .line 79
    cmp-long v9, v9, v11

    .line 80
    .line 81
    if-gez v9, :cond_0

    .line 82
    .line 83
    invoke-interface {v8}, Ljava/util/Iterator;->remove()V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    iget-object v8, v6, LX1/b;->r:[Ll2/h;

    .line 88
    .line 89
    if-eqz v8, :cond_4

    .line 90
    .line 91
    array-length v9, v8

    .line 92
    move v10, v2

    .line 93
    :goto_2
    if-ge v10, v9, :cond_3

    .line 94
    .line 95
    aget-object v0, v8, v10

    .line 96
    .line 97
    iget-object v0, v0, Ll2/h;->e:Ll2/i;

    .line 98
    .line 99
    move-object v11, v0

    .line 100
    check-cast v11, LX1/i;

    .line 101
    .line 102
    iget-object v0, v11, LX1/i;->i:[LA7/u;

    .line 103
    .line 104
    :try_start_0
    iput-object v7, v11, LX1/i;->k:LY1/c;

    .line 105
    .line 106
    iput v4, v11, LX1/i;->l:I

    .line 107
    .line 108
    invoke-virtual {v7, v4}, LY1/c;->d(I)J

    .line 109
    .line 110
    .line 111
    move-result-wide v12

    .line 112
    invoke-virtual {v11}, LX1/i;->h()Ljava/util/ArrayList;

    .line 113
    .line 114
    .line 115
    move-result-object v14
    :try_end_0
    .catch Lk2/b; {:try_start_0 .. :try_end_0} :catch_1

    .line 116
    move v15, v2

    .line 117
    const/16 v16, 0x1

    .line 118
    .line 119
    :goto_3
    :try_start_1
    array-length v5, v0

    .line 120
    if-ge v15, v5, :cond_2

    .line 121
    .line 122
    iget-object v5, v11, LX1/i;->j:Ln2/q;

    .line 123
    .line 124
    invoke-interface {v5, v15}, Ln2/q;->c(I)I

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    check-cast v5, LY1/m;

    .line 133
    .line 134
    aget-object v2, v0, v15

    .line 135
    .line 136
    invoke-virtual {v2, v12, v13, v5}, LA7/u;->a(JLY1/m;)LA7/u;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    aput-object v2, v0, v15
    :try_end_1
    .catch Lk2/b; {:try_start_1 .. :try_end_1} :catch_0

    .line 141
    .line 142
    add-int/lit8 v15, v15, 0x1

    .line 143
    .line 144
    const/4 v2, 0x0

    .line 145
    goto :goto_3

    .line 146
    :catch_0
    move-exception v0

    .line 147
    goto :goto_4

    .line 148
    :catch_1
    move-exception v0

    .line 149
    const/16 v16, 0x1

    .line 150
    .line 151
    :goto_4
    iput-object v0, v11, LX1/i;->m:Lk2/b;

    .line 152
    .line 153
    :cond_2
    add-int/lit8 v10, v10, 0x1

    .line 154
    .line 155
    const/4 v2, 0x0

    .line 156
    goto :goto_2

    .line 157
    :cond_3
    const/16 v16, 0x1

    .line 158
    .line 159
    iget-object v0, v6, LX1/b;->q:Lk2/E;

    .line 160
    .line 161
    invoke-interface {v0, v6}, Lk2/e0;->a(Lk2/f0;)V

    .line 162
    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_4
    const/16 v16, 0x1

    .line 166
    .line 167
    :goto_5
    invoke-virtual {v7, v4}, LY1/c;->b(I)LY1/h;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    iget-object v0, v0, LY1/h;->d:Ljava/util/List;

    .line 172
    .line 173
    iput-object v0, v6, LX1/b;->w:Ljava/util/List;

    .line 174
    .line 175
    iget-object v0, v6, LX1/b;->s:[LX1/j;

    .line 176
    .line 177
    array-length v2, v0

    .line 178
    const/4 v5, 0x0

    .line 179
    :goto_6
    if-ge v5, v2, :cond_8

    .line 180
    .line 181
    aget-object v8, v0, v5

    .line 182
    .line 183
    iget-object v9, v6, LX1/b;->w:Ljava/util/List;

    .line 184
    .line 185
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    :cond_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    if-eqz v10, :cond_7

    .line 194
    .line 195
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v10

    .line 199
    check-cast v10, LY1/g;

    .line 200
    .line 201
    invoke-virtual {v10}, LY1/g;->a()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v11

    .line 205
    iget-object v12, v8, LX1/j;->e:LY1/g;

    .line 206
    .line 207
    invoke-virtual {v12}, LY1/g;->a()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v12

    .line 211
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    if-eqz v11, :cond_5

    .line 216
    .line 217
    iget-object v9, v7, LY1/c;->m:Ljava/util/List;

    .line 218
    .line 219
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 220
    .line 221
    .line 222
    move-result v9

    .line 223
    add-int/lit8 v9, v9, -0x1

    .line 224
    .line 225
    iget-boolean v11, v7, LY1/c;->d:Z

    .line 226
    .line 227
    if-eqz v11, :cond_6

    .line 228
    .line 229
    if-ne v4, v9, :cond_6

    .line 230
    .line 231
    move/from16 v9, v16

    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_6
    const/4 v9, 0x0

    .line 235
    :goto_7
    invoke-virtual {v8, v10, v9}, LX1/j;->b(LY1/g;Z)V

    .line 236
    .line 237
    .line 238
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 239
    .line 240
    goto :goto_6

    .line 241
    :cond_8
    add-int/lit8 v3, v3, 0x1

    .line 242
    .line 243
    const/4 v2, 0x0

    .line 244
    goto/16 :goto_0

    .line 245
    .line 246
    :cond_9
    const/16 v16, 0x1

    .line 247
    .line 248
    iget-object v0, v1, LX1/f;->H:LY1/c;

    .line 249
    .line 250
    const/4 v2, 0x0

    .line 251
    invoke-virtual {v0, v2}, LY1/c;->b(I)LY1/h;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    iget-object v2, v1, LX1/f;->H:LY1/c;

    .line 256
    .line 257
    iget-object v2, v2, LY1/c;->m:Ljava/util/List;

    .line 258
    .line 259
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    add-int/lit8 v2, v2, -0x1

    .line 264
    .line 265
    iget-object v3, v1, LX1/f;->H:LY1/c;

    .line 266
    .line 267
    invoke-virtual {v3, v2}, LY1/c;->b(I)LY1/h;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    iget-object v4, v1, LX1/f;->H:LY1/c;

    .line 272
    .line 273
    invoke-virtual {v4, v2}, LY1/c;->d(I)J

    .line 274
    .line 275
    .line 276
    move-result-wide v4

    .line 277
    iget-wide v6, v1, LX1/f;->L:J

    .line 278
    .line 279
    invoke-static {v6, v7}, LQ1/x;->x(J)J

    .line 280
    .line 281
    .line 282
    move-result-wide v6

    .line 283
    invoke-static {v6, v7}, LQ1/x;->K(J)J

    .line 284
    .line 285
    .line 286
    move-result-wide v6

    .line 287
    iget-object v2, v1, LX1/f;->H:LY1/c;

    .line 288
    .line 289
    const/4 v8, 0x0

    .line 290
    invoke-virtual {v2, v8}, LY1/c;->d(I)J

    .line 291
    .line 292
    .line 293
    move-result-wide v9

    .line 294
    iget-wide v11, v0, LY1/h;->b:J

    .line 295
    .line 296
    invoke-static {v11, v12}, LQ1/x;->K(J)J

    .line 297
    .line 298
    .line 299
    move-result-wide v11

    .line 300
    invoke-static {v0}, LX1/f;->t(LY1/h;)Z

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    move-wide v13, v11

    .line 305
    const/4 v8, 0x0

    .line 306
    :goto_8
    iget-object v15, v0, LY1/h;->c:Ljava/util/List;

    .line 307
    .line 308
    move/from16 v17, v2

    .line 309
    .line 310
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    move-wide/from16 v18, v11

    .line 315
    .line 316
    if-ge v8, v2, :cond_10

    .line 317
    .line 318
    invoke-interface {v15, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    check-cast v2, LY1/a;

    .line 323
    .line 324
    iget-object v15, v2, LY1/a;->c:Ljava/util/List;

    .line 325
    .line 326
    iget v2, v2, LY1/a;->b:I

    .line 327
    .line 328
    move/from16 v11, v16

    .line 329
    .line 330
    const-wide/16 v21, 0x0

    .line 331
    .line 332
    if-eq v2, v11, :cond_a

    .line 333
    .line 334
    const/4 v11, 0x2

    .line 335
    if-eq v2, v11, :cond_a

    .line 336
    .line 337
    const/4 v2, 0x1

    .line 338
    goto :goto_9

    .line 339
    :cond_a
    const/4 v2, 0x0

    .line 340
    :goto_9
    if-eqz v17, :cond_b

    .line 341
    .line 342
    if-nez v2, :cond_f

    .line 343
    .line 344
    :cond_b
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    .line 345
    .line 346
    .line 347
    move-result v2

    .line 348
    if-eqz v2, :cond_c

    .line 349
    .line 350
    goto :goto_b

    .line 351
    :cond_c
    const/4 v2, 0x0

    .line 352
    invoke-interface {v15, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v11

    .line 356
    check-cast v11, LY1/m;

    .line 357
    .line 358
    invoke-virtual {v11}, LY1/m;->c()LX1/g;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    if-nez v2, :cond_d

    .line 363
    .line 364
    goto :goto_a

    .line 365
    :cond_d
    invoke-interface {v2, v9, v10, v6, v7}, LX1/g;->F(JJ)J

    .line 366
    .line 367
    .line 368
    move-result-wide v11

    .line 369
    cmp-long v11, v11, v21

    .line 370
    .line 371
    if-nez v11, :cond_e

    .line 372
    .line 373
    :goto_a
    move-wide/from16 v11, v18

    .line 374
    .line 375
    goto :goto_c

    .line 376
    :cond_e
    invoke-interface {v2, v9, v10, v6, v7}, LX1/g;->q(JJ)J

    .line 377
    .line 378
    .line 379
    move-result-wide v11

    .line 380
    invoke-interface {v2, v11, v12}, LX1/g;->b(J)J

    .line 381
    .line 382
    .line 383
    move-result-wide v11

    .line 384
    add-long v11, v11, v18

    .line 385
    .line 386
    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->max(JJ)J

    .line 387
    .line 388
    .line 389
    move-result-wide v13

    .line 390
    :cond_f
    :goto_b
    add-int/lit8 v8, v8, 0x1

    .line 391
    .line 392
    move/from16 v2, v17

    .line 393
    .line 394
    move-wide/from16 v11, v18

    .line 395
    .line 396
    const/16 v16, 0x1

    .line 397
    .line 398
    goto :goto_8

    .line 399
    :cond_10
    const-wide/16 v21, 0x0

    .line 400
    .line 401
    move-wide v11, v13

    .line 402
    :goto_c
    iget-wide v8, v3, LY1/h;->b:J

    .line 403
    .line 404
    invoke-static {v8, v9}, LQ1/x;->K(J)J

    .line 405
    .line 406
    .line 407
    move-result-wide v8

    .line 408
    invoke-static {v3}, LX1/f;->t(LY1/h;)Z

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    const-wide v13, 0x7fffffffffffffffL

    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    const/4 v10, 0x0

    .line 418
    :goto_d
    iget-object v15, v3, LY1/h;->c:Ljava/util/List;

    .line 419
    .line 420
    move/from16 v17, v2

    .line 421
    .line 422
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 423
    .line 424
    .line 425
    move-result v2

    .line 426
    if-ge v10, v2, :cond_18

    .line 427
    .line 428
    invoke-interface {v15, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    check-cast v2, LY1/a;

    .line 433
    .line 434
    move-object/from16 v18, v3

    .line 435
    .line 436
    iget-object v3, v2, LY1/a;->c:Ljava/util/List;

    .line 437
    .line 438
    iget v2, v2, LY1/a;->b:I

    .line 439
    .line 440
    move-wide/from16 v23, v8

    .line 441
    .line 442
    const/4 v8, 0x1

    .line 443
    if-eq v2, v8, :cond_11

    .line 444
    .line 445
    const/4 v8, 0x2

    .line 446
    if-eq v2, v8, :cond_12

    .line 447
    .line 448
    const/4 v2, 0x1

    .line 449
    goto :goto_e

    .line 450
    :cond_11
    const/4 v8, 0x2

    .line 451
    :cond_12
    const/4 v2, 0x0

    .line 452
    :goto_e
    if-eqz v17, :cond_13

    .line 453
    .line 454
    if-nez v2, :cond_17

    .line 455
    .line 456
    :cond_13
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 457
    .line 458
    .line 459
    move-result v2

    .line 460
    if-eqz v2, :cond_14

    .line 461
    .line 462
    goto :goto_f

    .line 463
    :cond_14
    const/4 v2, 0x0

    .line 464
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    check-cast v3, LY1/m;

    .line 469
    .line 470
    invoke-virtual {v3}, LY1/m;->c()LX1/g;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    if-nez v2, :cond_15

    .line 475
    .line 476
    add-long v8, v23, v4

    .line 477
    .line 478
    goto :goto_10

    .line 479
    :cond_15
    invoke-interface {v2, v4, v5, v6, v7}, LX1/g;->F(JJ)J

    .line 480
    .line 481
    .line 482
    move-result-wide v19

    .line 483
    cmp-long v3, v19, v21

    .line 484
    .line 485
    if-nez v3, :cond_16

    .line 486
    .line 487
    move-wide/from16 v8, v23

    .line 488
    .line 489
    goto :goto_10

    .line 490
    :cond_16
    invoke-interface {v2, v4, v5, v6, v7}, LX1/g;->q(JJ)J

    .line 491
    .line 492
    .line 493
    move-result-wide v25

    .line 494
    add-long v25, v25, v19

    .line 495
    .line 496
    const-wide/16 v19, 0x1

    .line 497
    .line 498
    sub-long v8, v25, v19

    .line 499
    .line 500
    invoke-interface {v2, v8, v9}, LX1/g;->b(J)J

    .line 501
    .line 502
    .line 503
    move-result-wide v19

    .line 504
    add-long v19, v19, v23

    .line 505
    .line 506
    invoke-interface {v2, v8, v9, v4, v5}, LX1/g;->o(JJ)J

    .line 507
    .line 508
    .line 509
    move-result-wide v8

    .line 510
    add-long v8, v8, v19

    .line 511
    .line 512
    invoke-static {v13, v14, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 513
    .line 514
    .line 515
    move-result-wide v8

    .line 516
    move-wide v13, v8

    .line 517
    :cond_17
    :goto_f
    add-int/lit8 v10, v10, 0x1

    .line 518
    .line 519
    move/from16 v2, v17

    .line 520
    .line 521
    move-object/from16 v3, v18

    .line 522
    .line 523
    move-wide/from16 v8, v23

    .line 524
    .line 525
    goto :goto_d

    .line 526
    :cond_18
    move-wide v8, v13

    .line 527
    :goto_10
    iget-object v2, v1, LX1/f;->H:LY1/c;

    .line 528
    .line 529
    iget-boolean v2, v2, LY1/c;->d:Z

    .line 530
    .line 531
    if-eqz v2, :cond_1b

    .line 532
    .line 533
    const/4 v2, 0x0

    .line 534
    :goto_11
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 535
    .line 536
    .line 537
    move-result v3

    .line 538
    if-ge v2, v3, :cond_1a

    .line 539
    .line 540
    invoke-interface {v15, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v3

    .line 544
    check-cast v3, LY1/a;

    .line 545
    .line 546
    iget-object v3, v3, LY1/a;->c:Ljava/util/List;

    .line 547
    .line 548
    const/4 v4, 0x0

    .line 549
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v3

    .line 553
    check-cast v3, LY1/m;

    .line 554
    .line 555
    invoke-virtual {v3}, LY1/m;->c()LX1/g;

    .line 556
    .line 557
    .line 558
    move-result-object v3

    .line 559
    if-eqz v3, :cond_1b

    .line 560
    .line 561
    invoke-interface {v3}, LX1/g;->D()Z

    .line 562
    .line 563
    .line 564
    move-result v3

    .line 565
    if-eqz v3, :cond_19

    .line 566
    .line 567
    goto :goto_12

    .line 568
    :cond_19
    add-int/lit8 v2, v2, 0x1

    .line 569
    .line 570
    goto :goto_11

    .line 571
    :cond_1a
    const/4 v2, 0x1

    .line 572
    goto :goto_13

    .line 573
    :cond_1b
    :goto_12
    const/4 v2, 0x0

    .line 574
    :goto_13
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    if-eqz v2, :cond_1c

    .line 580
    .line 581
    iget-object v5, v1, LX1/f;->H:LY1/c;

    .line 582
    .line 583
    iget-wide v13, v5, LY1/c;->f:J

    .line 584
    .line 585
    cmp-long v5, v13, v3

    .line 586
    .line 587
    if-eqz v5, :cond_1c

    .line 588
    .line 589
    invoke-static {v13, v14}, LQ1/x;->K(J)J

    .line 590
    .line 591
    .line 592
    move-result-wide v13

    .line 593
    sub-long v13, v8, v13

    .line 594
    .line 595
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->max(JJ)J

    .line 596
    .line 597
    .line 598
    move-result-wide v11

    .line 599
    :cond_1c
    sub-long v33, v8, v11

    .line 600
    .line 601
    iget-object v5, v1, LX1/f;->H:LY1/c;

    .line 602
    .line 603
    iget-boolean v8, v5, LY1/c;->d:Z

    .line 604
    .line 605
    if-eqz v8, :cond_32

    .line 606
    .line 607
    iget-wide v8, v5, LY1/c;->a:J

    .line 608
    .line 609
    cmp-long v5, v8, v3

    .line 610
    .line 611
    if-eqz v5, :cond_1d

    .line 612
    .line 613
    const/4 v5, 0x1

    .line 614
    goto :goto_14

    .line 615
    :cond_1d
    const/4 v5, 0x0

    .line 616
    :goto_14
    invoke-static {v5}, LQ1/k;->g(Z)V

    .line 617
    .line 618
    .line 619
    iget-object v5, v1, LX1/f;->H:LY1/c;

    .line 620
    .line 621
    iget-wide v8, v5, LY1/c;->a:J

    .line 622
    .line 623
    invoke-static {v8, v9}, LQ1/x;->K(J)J

    .line 624
    .line 625
    .line 626
    move-result-wide v8

    .line 627
    sub-long/2addr v6, v8

    .line 628
    sub-long/2addr v6, v11

    .line 629
    invoke-virtual {v1}, LX1/f;->h()LN1/w;

    .line 630
    .line 631
    .line 632
    move-result-object v5

    .line 633
    iget-object v5, v5, LN1/w;->c:LN1/s;

    .line 634
    .line 635
    invoke-static {v6, v7}, LQ1/x;->W(J)J

    .line 636
    .line 637
    .line 638
    move-result-wide v8

    .line 639
    iget-wide v13, v5, LN1/s;->c:J

    .line 640
    .line 641
    cmp-long v10, v13, v3

    .line 642
    .line 643
    if-eqz v10, :cond_1e

    .line 644
    .line 645
    invoke-static {v8, v9, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 646
    .line 647
    .line 648
    move-result-wide v13

    .line 649
    goto :goto_15

    .line 650
    :cond_1e
    iget-object v10, v1, LX1/f;->H:LY1/c;

    .line 651
    .line 652
    iget-object v10, v10, LY1/c;->j:LE5/Y;

    .line 653
    .line 654
    if-eqz v10, :cond_1f

    .line 655
    .line 656
    iget-wide v13, v10, LE5/Y;->c:J

    .line 657
    .line 658
    cmp-long v10, v13, v3

    .line 659
    .line 660
    if-eqz v10, :cond_1f

    .line 661
    .line 662
    invoke-static {v8, v9, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 663
    .line 664
    .line 665
    move-result-wide v13

    .line 666
    goto :goto_15

    .line 667
    :cond_1f
    move-wide v13, v8

    .line 668
    :goto_15
    sub-long v17, v6, v33

    .line 669
    .line 670
    invoke-static/range {v17 .. v18}, LQ1/x;->W(J)J

    .line 671
    .line 672
    .line 673
    move-result-wide v17

    .line 674
    cmp-long v10, v17, v21

    .line 675
    .line 676
    if-gez v10, :cond_20

    .line 677
    .line 678
    cmp-long v10, v13, v21

    .line 679
    .line 680
    if-lez v10, :cond_20

    .line 681
    .line 682
    move-wide/from16 v17, v21

    .line 683
    .line 684
    :cond_20
    iget-object v10, v1, LX1/f;->H:LY1/c;

    .line 685
    .line 686
    move-wide/from16 v19, v3

    .line 687
    .line 688
    iget-wide v3, v10, LY1/c;->c:J

    .line 689
    .line 690
    cmp-long v10, v3, v19

    .line 691
    .line 692
    if-eqz v10, :cond_21

    .line 693
    .line 694
    add-long v3, v17, v3

    .line 695
    .line 696
    invoke-static {v3, v4, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 697
    .line 698
    .line 699
    move-result-wide v17

    .line 700
    :cond_21
    move-wide/from16 v25, v17

    .line 701
    .line 702
    iget-wide v3, v5, LN1/s;->b:J

    .line 703
    .line 704
    cmp-long v10, v3, v19

    .line 705
    .line 706
    if-eqz v10, :cond_23

    .line 707
    .line 708
    move-wide/from16 v23, v3

    .line 709
    .line 710
    move-wide/from16 v27, v8

    .line 711
    .line 712
    invoke-static/range {v23 .. v28}, LQ1/x;->j(JJJ)J

    .line 713
    .line 714
    .line 715
    move-result-wide v25

    .line 716
    :cond_22
    :goto_16
    move-wide/from16 v29, v25

    .line 717
    .line 718
    goto :goto_17

    .line 719
    :cond_23
    move-wide/from16 v27, v8

    .line 720
    .line 721
    iget-object v3, v1, LX1/f;->H:LY1/c;

    .line 722
    .line 723
    iget-object v3, v3, LY1/c;->j:LE5/Y;

    .line 724
    .line 725
    if-eqz v3, :cond_22

    .line 726
    .line 727
    iget-wide v3, v3, LE5/Y;->b:J

    .line 728
    .line 729
    cmp-long v8, v3, v19

    .line 730
    .line 731
    if-eqz v8, :cond_22

    .line 732
    .line 733
    move-wide/from16 v23, v3

    .line 734
    .line 735
    invoke-static/range {v23 .. v28}, LQ1/x;->j(JJJ)J

    .line 736
    .line 737
    .line 738
    move-result-wide v25

    .line 739
    goto :goto_16

    .line 740
    :goto_17
    cmp-long v3, v29, v13

    .line 741
    .line 742
    if-lez v3, :cond_24

    .line 743
    .line 744
    move-wide/from16 v31, v29

    .line 745
    .line 746
    goto :goto_18

    .line 747
    :cond_24
    move-wide/from16 v31, v13

    .line 748
    .line 749
    :goto_18
    iget-object v3, v1, LX1/f;->E:LN1/s;

    .line 750
    .line 751
    iget-wide v3, v3, LN1/s;->a:J

    .line 752
    .line 753
    cmp-long v8, v3, v19

    .line 754
    .line 755
    if-eqz v8, :cond_25

    .line 756
    .line 757
    goto :goto_19

    .line 758
    :cond_25
    iget-object v3, v1, LX1/f;->H:LY1/c;

    .line 759
    .line 760
    iget-object v4, v3, LY1/c;->j:LE5/Y;

    .line 761
    .line 762
    if-eqz v4, :cond_26

    .line 763
    .line 764
    iget-wide v8, v4, LE5/Y;->a:J

    .line 765
    .line 766
    cmp-long v4, v8, v19

    .line 767
    .line 768
    if-eqz v4, :cond_26

    .line 769
    .line 770
    move-wide v3, v8

    .line 771
    goto :goto_19

    .line 772
    :cond_26
    iget-wide v3, v3, LY1/c;->g:J

    .line 773
    .line 774
    cmp-long v8, v3, v19

    .line 775
    .line 776
    if-eqz v8, :cond_27

    .line 777
    .line 778
    goto :goto_19

    .line 779
    :cond_27
    iget-wide v3, v1, LX1/f;->o:J

    .line 780
    .line 781
    :goto_19
    cmp-long v8, v3, v29

    .line 782
    .line 783
    if-gez v8, :cond_28

    .line 784
    .line 785
    move-wide/from16 v3, v29

    .line 786
    .line 787
    :cond_28
    cmp-long v8, v3, v31

    .line 788
    .line 789
    iget-wide v9, v1, LX1/f;->p:J

    .line 790
    .line 791
    const-wide/16 v13, 0x2

    .line 792
    .line 793
    if-lez v8, :cond_29

    .line 794
    .line 795
    div-long v3, v33, v13

    .line 796
    .line 797
    invoke-static {v9, v10, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 798
    .line 799
    .line 800
    move-result-wide v3

    .line 801
    sub-long v3, v6, v3

    .line 802
    .line 803
    invoke-static {v3, v4}, LQ1/x;->W(J)J

    .line 804
    .line 805
    .line 806
    move-result-wide v27

    .line 807
    invoke-static/range {v27 .. v32}, LQ1/x;->j(JJJ)J

    .line 808
    .line 809
    .line 810
    move-result-wide v3

    .line 811
    move-wide/from16 v23, v3

    .line 812
    .line 813
    move-wide/from16 v17, v13

    .line 814
    .line 815
    move-wide/from16 v13, v29

    .line 816
    .line 817
    move-wide/from16 v40, v23

    .line 818
    .line 819
    move-wide/from16 v23, v6

    .line 820
    .line 821
    move-wide/from16 v6, v40

    .line 822
    .line 823
    :goto_1a
    move v8, v2

    .line 824
    move-wide/from16 v2, v31

    .line 825
    .line 826
    goto :goto_1b

    .line 827
    :cond_29
    move-wide/from16 v17, v13

    .line 828
    .line 829
    move-wide/from16 v13, v29

    .line 830
    .line 831
    move-wide/from16 v29, v3

    .line 832
    .line 833
    move-wide/from16 v23, v6

    .line 834
    .line 835
    move-wide/from16 v6, v29

    .line 836
    .line 837
    goto :goto_1a

    .line 838
    :goto_1b
    iget v4, v5, LN1/s;->d:F

    .line 839
    .line 840
    const v15, -0x800001

    .line 841
    .line 842
    .line 843
    cmpl-float v25, v4, v15

    .line 844
    .line 845
    if-eqz v25, :cond_2a

    .line 846
    .line 847
    goto :goto_1c

    .line 848
    :cond_2a
    iget-object v4, v1, LX1/f;->H:LY1/c;

    .line 849
    .line 850
    iget-object v4, v4, LY1/c;->j:LE5/Y;

    .line 851
    .line 852
    if-eqz v4, :cond_2b

    .line 853
    .line 854
    iget v4, v4, LE5/Y;->d:F

    .line 855
    .line 856
    goto :goto_1c

    .line 857
    :cond_2b
    move v4, v15

    .line 858
    :goto_1c
    iget v5, v5, LN1/s;->e:F

    .line 859
    .line 860
    cmpl-float v25, v5, v15

    .line 861
    .line 862
    if-eqz v25, :cond_2c

    .line 863
    .line 864
    goto :goto_1d

    .line 865
    :cond_2c
    iget-object v5, v1, LX1/f;->H:LY1/c;

    .line 866
    .line 867
    iget-object v5, v5, LY1/c;->j:LE5/Y;

    .line 868
    .line 869
    if-eqz v5, :cond_2d

    .line 870
    .line 871
    iget v5, v5, LE5/Y;->e:F

    .line 872
    .line 873
    goto :goto_1d

    .line 874
    :cond_2d
    move v5, v15

    .line 875
    :goto_1d
    cmpl-float v25, v4, v15

    .line 876
    .line 877
    if-nez v25, :cond_2f

    .line 878
    .line 879
    cmpl-float v15, v5, v15

    .line 880
    .line 881
    if-nez v15, :cond_2f

    .line 882
    .line 883
    iget-object v15, v1, LX1/f;->H:LY1/c;

    .line 884
    .line 885
    iget-object v15, v15, LY1/c;->j:LE5/Y;

    .line 886
    .line 887
    if-eqz v15, :cond_2e

    .line 888
    .line 889
    move/from16 v25, v4

    .line 890
    .line 891
    move/from16 v26, v5

    .line 892
    .line 893
    iget-wide v4, v15, LE5/Y;->a:J

    .line 894
    .line 895
    cmp-long v4, v4, v19

    .line 896
    .line 897
    if-nez v4, :cond_30

    .line 898
    .line 899
    :cond_2e
    const/high16 v4, 0x3f800000    # 1.0f

    .line 900
    .line 901
    move v5, v4

    .line 902
    goto :goto_1e

    .line 903
    :cond_2f
    move/from16 v25, v4

    .line 904
    .line 905
    move/from16 v26, v5

    .line 906
    .line 907
    :cond_30
    move/from16 v4, v25

    .line 908
    .line 909
    move/from16 v5, v26

    .line 910
    .line 911
    :goto_1e
    new-instance v15, LE5/Y;

    .line 912
    .line 913
    invoke-direct {v15}, LE5/Y;-><init>()V

    .line 914
    .line 915
    .line 916
    iput-wide v6, v15, LE5/Y;->a:J

    .line 917
    .line 918
    iput-wide v13, v15, LE5/Y;->b:J

    .line 919
    .line 920
    iput-wide v2, v15, LE5/Y;->c:J

    .line 921
    .line 922
    iput v4, v15, LE5/Y;->d:F

    .line 923
    .line 924
    iput v5, v15, LE5/Y;->e:F

    .line 925
    .line 926
    new-instance v2, LN1/s;

    .line 927
    .line 928
    invoke-direct {v2, v15}, LN1/s;-><init>(LE5/Y;)V

    .line 929
    .line 930
    .line 931
    iput-object v2, v1, LX1/f;->E:LN1/s;

    .line 932
    .line 933
    iget-object v2, v1, LX1/f;->H:LY1/c;

    .line 934
    .line 935
    iget-wide v2, v2, LY1/c;->a:J

    .line 936
    .line 937
    invoke-static {v11, v12}, LQ1/x;->W(J)J

    .line 938
    .line 939
    .line 940
    move-result-wide v4

    .line 941
    add-long/2addr v4, v2

    .line 942
    iget-object v2, v1, LX1/f;->E:LN1/s;

    .line 943
    .line 944
    iget-wide v2, v2, LN1/s;->a:J

    .line 945
    .line 946
    invoke-static {v2, v3}, LQ1/x;->K(J)J

    .line 947
    .line 948
    .line 949
    move-result-wide v2

    .line 950
    sub-long v6, v23, v2

    .line 951
    .line 952
    div-long v2, v33, v17

    .line 953
    .line 954
    invoke-static {v9, v10, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 955
    .line 956
    .line 957
    move-result-wide v2

    .line 958
    cmp-long v9, v6, v2

    .line 959
    .line 960
    if-gez v9, :cond_31

    .line 961
    .line 962
    move-wide/from16 v35, v2

    .line 963
    .line 964
    move-wide/from16 v26, v4

    .line 965
    .line 966
    goto :goto_1f

    .line 967
    :cond_31
    move-wide/from16 v26, v4

    .line 968
    .line 969
    move-wide/from16 v35, v6

    .line 970
    .line 971
    goto :goto_1f

    .line 972
    :cond_32
    move v8, v2

    .line 973
    move-wide/from16 v19, v3

    .line 974
    .line 975
    move-wide/from16 v26, v19

    .line 976
    .line 977
    move-wide/from16 v35, v21

    .line 978
    .line 979
    :goto_1f
    iget-wide v2, v0, LY1/h;->b:J

    .line 980
    .line 981
    invoke-static {v2, v3}, LQ1/x;->K(J)J

    .line 982
    .line 983
    .line 984
    move-result-wide v2

    .line 985
    sub-long v31, v11, v2

    .line 986
    .line 987
    new-instance v23, LX1/d;

    .line 988
    .line 989
    iget-object v0, v1, LX1/f;->H:LY1/c;

    .line 990
    .line 991
    iget-wide v2, v0, LY1/c;->a:J

    .line 992
    .line 993
    iget-wide v4, v1, LX1/f;->L:J

    .line 994
    .line 995
    iget v6, v1, LX1/f;->O:I

    .line 996
    .line 997
    invoke-virtual {v1}, LX1/f;->h()LN1/w;

    .line 998
    .line 999
    .line 1000
    move-result-object v38

    .line 1001
    iget-object v7, v1, LX1/f;->H:LY1/c;

    .line 1002
    .line 1003
    iget-boolean v7, v7, LY1/c;->d:Z

    .line 1004
    .line 1005
    if-eqz v7, :cond_33

    .line 1006
    .line 1007
    iget-object v7, v1, LX1/f;->E:LN1/s;

    .line 1008
    .line 1009
    :goto_20
    move-object/from16 v37, v0

    .line 1010
    .line 1011
    move-wide/from16 v24, v2

    .line 1012
    .line 1013
    move-wide/from16 v28, v4

    .line 1014
    .line 1015
    move/from16 v30, v6

    .line 1016
    .line 1017
    move-object/from16 v39, v7

    .line 1018
    .line 1019
    goto :goto_21

    .line 1020
    :cond_33
    const/4 v7, 0x0

    .line 1021
    goto :goto_20

    .line 1022
    :goto_21
    invoke-direct/range {v23 .. v39}, LX1/d;-><init>(JJJIJJJLY1/c;LN1/w;LN1/s;)V

    .line 1023
    .line 1024
    .line 1025
    move-object/from16 v0, v23

    .line 1026
    .line 1027
    invoke-virtual {v1, v0}, Lk2/a;->m(LN1/N;)V

    .line 1028
    .line 1029
    .line 1030
    iget-boolean v0, v1, LX1/f;->h:Z

    .line 1031
    .line 1032
    if-nez v0, :cond_3b

    .line 1033
    .line 1034
    iget-object v0, v1, LX1/f;->D:Landroid/os/Handler;

    .line 1035
    .line 1036
    iget-object v2, v1, LX1/f;->w:LX1/c;

    .line 1037
    .line 1038
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1039
    .line 1040
    .line 1041
    const-wide/16 v3, 0x1388

    .line 1042
    .line 1043
    if-eqz v8, :cond_38

    .line 1044
    .line 1045
    iget-object v0, v1, LX1/f;->D:Landroid/os/Handler;

    .line 1046
    .line 1047
    iget-object v5, v1, LX1/f;->H:LY1/c;

    .line 1048
    .line 1049
    iget-wide v6, v1, LX1/f;->L:J

    .line 1050
    .line 1051
    invoke-static {v6, v7}, LQ1/x;->x(J)J

    .line 1052
    .line 1053
    .line 1054
    move-result-wide v6

    .line 1055
    iget-object v8, v5, LY1/c;->m:Ljava/util/List;

    .line 1056
    .line 1057
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 1058
    .line 1059
    .line 1060
    move-result v8

    .line 1061
    const/16 v16, 0x1

    .line 1062
    .line 1063
    add-int/lit8 v8, v8, -0x1

    .line 1064
    .line 1065
    invoke-virtual {v5, v8}, LY1/c;->b(I)LY1/h;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v9

    .line 1069
    iget-wide v10, v9, LY1/h;->b:J

    .line 1070
    .line 1071
    invoke-static {v10, v11}, LQ1/x;->K(J)J

    .line 1072
    .line 1073
    .line 1074
    move-result-wide v10

    .line 1075
    invoke-virtual {v5, v8}, LY1/c;->d(I)J

    .line 1076
    .line 1077
    .line 1078
    move-result-wide v12

    .line 1079
    invoke-static {v6, v7}, LQ1/x;->K(J)J

    .line 1080
    .line 1081
    .line 1082
    move-result-wide v6

    .line 1083
    iget-wide v14, v5, LY1/c;->a:J

    .line 1084
    .line 1085
    invoke-static {v14, v15}, LQ1/x;->K(J)J

    .line 1086
    .line 1087
    .line 1088
    move-result-wide v14

    .line 1089
    invoke-static {v3, v4}, LQ1/x;->K(J)J

    .line 1090
    .line 1091
    .line 1092
    move-result-wide v17

    .line 1093
    move-wide/from16 v3, v17

    .line 1094
    .line 1095
    const/4 v5, 0x0

    .line 1096
    :goto_22
    iget-object v8, v9, LY1/h;->c:Ljava/util/List;

    .line 1097
    .line 1098
    move-object/from16 v16, v9

    .line 1099
    .line 1100
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 1101
    .line 1102
    .line 1103
    move-result v9

    .line 1104
    if-ge v5, v9, :cond_37

    .line 1105
    .line 1106
    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v8

    .line 1110
    check-cast v8, LY1/a;

    .line 1111
    .line 1112
    iget-object v8, v8, LY1/a;->c:Ljava/util/List;

    .line 1113
    .line 1114
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 1115
    .line 1116
    .line 1117
    move-result v9

    .line 1118
    if-eqz v9, :cond_34

    .line 1119
    .line 1120
    const/4 v9, 0x0

    .line 1121
    goto :goto_23

    .line 1122
    :cond_34
    const/4 v9, 0x0

    .line 1123
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v8

    .line 1127
    check-cast v8, LY1/m;

    .line 1128
    .line 1129
    invoke-virtual {v8}, LY1/m;->c()LX1/g;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v8

    .line 1133
    if-eqz v8, :cond_36

    .line 1134
    .line 1135
    add-long v23, v14, v10

    .line 1136
    .line 1137
    invoke-interface {v8, v12, v13, v6, v7}, LX1/g;->r(JJ)J

    .line 1138
    .line 1139
    .line 1140
    move-result-wide v25

    .line 1141
    add-long v25, v25, v23

    .line 1142
    .line 1143
    sub-long v25, v25, v6

    .line 1144
    .line 1145
    const-wide/32 v23, 0x186a0

    .line 1146
    .line 1147
    .line 1148
    sub-long v27, v3, v23

    .line 1149
    .line 1150
    cmp-long v8, v25, v27

    .line 1151
    .line 1152
    if-ltz v8, :cond_35

    .line 1153
    .line 1154
    cmp-long v8, v25, v3

    .line 1155
    .line 1156
    if-lez v8, :cond_36

    .line 1157
    .line 1158
    add-long v23, v3, v23

    .line 1159
    .line 1160
    cmp-long v8, v25, v23

    .line 1161
    .line 1162
    if-gez v8, :cond_36

    .line 1163
    .line 1164
    :cond_35
    move-wide/from16 v3, v25

    .line 1165
    .line 1166
    :cond_36
    :goto_23
    add-int/lit8 v5, v5, 0x1

    .line 1167
    .line 1168
    move-object/from16 v9, v16

    .line 1169
    .line 1170
    goto :goto_22

    .line 1171
    :cond_37
    const-wide/16 v5, 0x3e8

    .line 1172
    .line 1173
    sget-object v7, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 1174
    .line 1175
    invoke-static {v3, v4, v5, v6, v7}, LA6/h;->t(JJLjava/math/RoundingMode;)J

    .line 1176
    .line 1177
    .line 1178
    move-result-wide v3

    .line 1179
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1180
    .line 1181
    .line 1182
    :cond_38
    iget-boolean v0, v1, LX1/f;->I:Z

    .line 1183
    .line 1184
    if-eqz v0, :cond_39

    .line 1185
    .line 1186
    invoke-virtual {v1}, LX1/f;->z()V

    .line 1187
    .line 1188
    .line 1189
    goto :goto_25

    .line 1190
    :cond_39
    if-eqz p1, :cond_3b

    .line 1191
    .line 1192
    iget-object v0, v1, LX1/f;->H:LY1/c;

    .line 1193
    .line 1194
    iget-boolean v2, v0, LY1/c;->d:Z

    .line 1195
    .line 1196
    if-eqz v2, :cond_3b

    .line 1197
    .line 1198
    iget-wide v2, v0, LY1/c;->e:J

    .line 1199
    .line 1200
    cmp-long v0, v2, v19

    .line 1201
    .line 1202
    if-eqz v0, :cond_3b

    .line 1203
    .line 1204
    cmp-long v0, v2, v21

    .line 1205
    .line 1206
    if-nez v0, :cond_3a

    .line 1207
    .line 1208
    const-wide/16 v3, 0x1388

    .line 1209
    .line 1210
    goto :goto_24

    .line 1211
    :cond_3a
    move-wide v3, v2

    .line 1212
    :goto_24
    iget-wide v5, v1, LX1/f;->J:J

    .line 1213
    .line 1214
    add-long/2addr v5, v3

    .line 1215
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1216
    .line 1217
    .line 1218
    move-result-wide v2

    .line 1219
    sub-long/2addr v5, v2

    .line 1220
    move-wide/from16 v2, v21

    .line 1221
    .line 1222
    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 1223
    .line 1224
    .line 1225
    move-result-wide v2

    .line 1226
    iget-object v0, v1, LX1/f;->D:Landroid/os/Handler;

    .line 1227
    .line 1228
    iget-object v4, v1, LX1/f;->v:LX1/c;

    .line 1229
    .line 1230
    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1231
    .line 1232
    .line 1233
    :cond_3b
    :goto_25
    return-void
.end method

.method public final z()V
    .locals 15

    .line 1
    iget-object v0, p0, LX1/f;->D:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, LX1/f;->v:LX1/c;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LX1/f;->A:Lo2/m;

    .line 9
    .line 10
    invoke-virtual {v0}, Lo2/m;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, p0, LX1/f;->A:Lo2/m;

    .line 18
    .line 19
    invoke-virtual {v0}, Lo2/m;->d()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, LX1/f;->I:Z

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v1, p0, LX1/f;->t:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v1

    .line 32
    :try_start_0
    iget-object v0, p0, LX1/f;->F:Landroid/net/Uri;

    .line 33
    .line 34
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    const/4 v1, 0x0

    .line 36
    iput-boolean v1, p0, LX1/f;->I:Z

    .line 37
    .line 38
    new-instance v1, Lo2/p;

    .line 39
    .line 40
    iget-object v2, p0, LX1/f;->z:LS1/h;

    .line 41
    .line 42
    iget-object v3, p0, LX1/f;->r:Lo2/o;

    .line 43
    .line 44
    const/4 v4, 0x4

    .line 45
    invoke-direct {v1, v2, v0, v4, v3}, Lo2/p;-><init>(LS1/h;Landroid/net/Uri;ILo2/o;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, LX1/f;->s:LA/e0;

    .line 49
    .line 50
    iget-object v2, p0, LX1/f;->m:Lae/d;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const/4 v2, 0x3

    .line 56
    iget-object v3, p0, LX1/f;->A:Lo2/m;

    .line 57
    .line 58
    invoke-virtual {v3, v1, v0, v2}, Lo2/m;->f(Lo2/j;Lo2/h;I)J

    .line 59
    .line 60
    .line 61
    new-instance v5, Lk2/z;

    .line 62
    .line 63
    iget-object v0, v1, Lo2/p;->b:LS1/k;

    .line 64
    .line 65
    invoke-direct {v5, v0}, Lk2/z;-><init>(LS1/k;)V

    .line 66
    .line 67
    .line 68
    iget-object v4, p0, LX1/f;->q:LZ1/d;

    .line 69
    .line 70
    iget v6, v1, Lo2/p;->c:I

    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    const/4 v10, 0x0

    .line 74
    const/4 v7, -0x1

    .line 75
    const/4 v8, 0x0

    .line 76
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    invoke-virtual/range {v4 .. v14}, LZ1/d;->h(Lk2/z;IILN1/n;ILjava/lang/Object;JJ)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :catchall_0
    move-exception v0

    .line 91
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    throw v0
.end method
