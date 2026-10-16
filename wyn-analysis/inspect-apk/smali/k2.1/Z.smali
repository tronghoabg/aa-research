.class public final Lk2/Z;
.super Lk2/a;
.source "SourceFile"


# instance fields
.field public final h:LS3/c;

.field public final i:Lcom/unity3d/services/core/webview/b;

.field public final j:LZ1/g;

.field public final k:Lae/d;

.field public final l:I

.field public final m:Z

.field public n:Z

.field public o:J

.field public p:Z

.field public q:Z

.field public r:LS1/A;

.field public s:LN1/w;


# direct methods
.method public constructor <init>(LN1/w;LS3/c;Lcom/unity3d/services/core/webview/b;LZ1/g;Lae/d;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk2/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk2/Z;->s:LN1/w;

    .line 5
    .line 6
    iput-object p2, p0, Lk2/Z;->h:LS3/c;

    .line 7
    .line 8
    iput-object p3, p0, Lk2/Z;->i:Lcom/unity3d/services/core/webview/b;

    .line 9
    .line 10
    iput-object p4, p0, Lk2/Z;->j:LZ1/g;

    .line 11
    .line 12
    iput-object p5, p0, Lk2/Z;->k:Lae/d;

    .line 13
    .line 14
    iput p6, p0, Lk2/Z;->l:I

    .line 15
    .line 16
    iput-boolean p7, p0, Lk2/Z;->m:Z

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, Lk2/Z;->n:Z

    .line 20
    .line 21
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    iput-wide p1, p0, Lk2/Z;->o:J

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final b(Lk2/H;Lo2/e;J)Lk2/F;
    .locals 15

    .line 1
    iget-object v0, p0, Lk2/Z;->h:LS3/c;

    .line 2
    .line 3
    invoke-virtual {v0}, LS3/c;->b()LS1/h;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget-object v0, p0, Lk2/Z;->r:LS1/A;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v1, v2

    .line 12
    check-cast v1, LS1/l;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, LS1/l;->C(LS1/A;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lk2/Z;->h()LN1/w;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v0, v0, LN1/w;->b:LN1/t;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance v1, Lk2/X;

    .line 27
    .line 28
    iget-object v3, p0, Lk2/a;->g:LV1/k;

    .line 29
    .line 30
    invoke-static {v3}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    new-instance v3, LDd/c;

    .line 34
    .line 35
    iget-object v4, p0, Lk2/Z;->i:Lcom/unity3d/services/core/webview/b;

    .line 36
    .line 37
    iget-object v4, v4, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v4, Ls2/p;

    .line 40
    .line 41
    invoke-direct {v3, v4}, LDd/c;-><init>(Ls2/p;)V

    .line 42
    .line 43
    .line 44
    new-instance v5, LZ1/d;

    .line 45
    .line 46
    iget-object v4, p0, Lk2/a;->d:LZ1/d;

    .line 47
    .line 48
    iget-object v4, v4, LZ1/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    move-object/from16 v7, p1

    .line 52
    .line 53
    invoke-direct {v5, v4, v6, v7}, LZ1/d;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILk2/H;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual/range {p0 .. p1}, Lk2/a;->a(Lk2/H;)LZ1/d;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    iget-wide v9, v0, LN1/t;->f:J

    .line 61
    .line 62
    invoke-static {v9, v10}, LQ1/x;->K(J)J

    .line 63
    .line 64
    .line 65
    move-result-wide v12

    .line 66
    iget v10, p0, Lk2/Z;->l:I

    .line 67
    .line 68
    iget-boolean v11, p0, Lk2/Z;->m:Z

    .line 69
    .line 70
    iget-object v0, v0, LN1/t;->a:Landroid/net/Uri;

    .line 71
    .line 72
    iget-object v4, p0, Lk2/Z;->j:LZ1/g;

    .line 73
    .line 74
    iget-object v6, p0, Lk2/Z;->k:Lae/d;

    .line 75
    .line 76
    const/4 v14, 0x0

    .line 77
    move-object v8, v1

    .line 78
    move-object v1, v0

    .line 79
    move-object v0, v8

    .line 80
    move-object v8, p0

    .line 81
    move-object/from16 v9, p2

    .line 82
    .line 83
    invoke-direct/range {v0 .. v14}, Lk2/X;-><init>(Landroid/net/Uri;LS1/h;LDd/c;LZ1/g;LZ1/d;Lae/d;LZ1/d;Lk2/Z;Lo2/e;IZJLp2/a;)V

    .line 84
    .line 85
    .line 86
    return-object v0
.end method

.method public final declared-synchronized h()LN1/w;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lk2/Z;->s:LN1/w;
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
    .locals 0

    .line 1
    return-void
.end method

.method public final l(LS1/A;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lk2/Z;->r:LS1/A;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lk2/a;->g:LV1/k;

    .line 11
    .line 12
    invoke-static {v0}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lk2/Z;->j:LZ1/g;

    .line 16
    .line 17
    invoke-interface {v1, p1, v0}, LZ1/g;->h(Landroid/os/Looper;LV1/k;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, LZ1/g;->f()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lk2/Z;->t()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final n(Lk2/F;)V
    .locals 7

    .line 1
    check-cast p1, Lk2/X;

    .line 2
    .line 3
    iget-boolean v0, p1, Lk2/X;->w:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p1, Lk2/X;->t:[Lk2/c0;

    .line 9
    .line 10
    array-length v2, v0

    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    if-ge v3, v2, :cond_1

    .line 13
    .line 14
    aget-object v4, v0, v3

    .line 15
    .line 16
    invoke-virtual {v4}, Lk2/c0;->j()V

    .line 17
    .line 18
    .line 19
    iget-object v5, v4, Lk2/c0;->h:LS3/l;

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    iget-object v6, v4, Lk2/c0;->e:LZ1/d;

    .line 24
    .line 25
    invoke-virtual {v5, v6}, LS3/l;->s(LZ1/d;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, v4, Lk2/c0;->h:LS3/l;

    .line 29
    .line 30
    iput-object v1, v4, Lk2/c0;->g:LN1/n;

    .line 31
    .line 32
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v0, p1, Lk2/X;->l:Lo2/m;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lo2/m;->e(Lo2/k;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p1, Lk2/X;->q:Landroid/os/Handler;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p1, Lk2/X;->r:Lk2/E;

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    iput-boolean v0, p1, Lk2/X;->O:Z

    .line 49
    .line 50
    return-void
.end method

.method public final p()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/Z;->j:LZ1/g;

    .line 2
    .line 3
    invoke-interface {v0}, LZ1/g;->release()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final declared-synchronized s(LN1/w;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Lk2/Z;->s:LN1/w;
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

.method public final t()V
    .locals 6

    .line 1
    new-instance v0, Lk2/k0;

    .line 2
    .line 3
    iget-wide v1, p0, Lk2/Z;->o:J

    .line 4
    .line 5
    iget-boolean v3, p0, Lk2/Z;->p:Z

    .line 6
    .line 7
    iget-boolean v4, p0, Lk2/Z;->q:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Lk2/Z;->h()LN1/w;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    invoke-direct/range {v0 .. v5}, Lk2/k0;-><init>(JZZLN1/w;)V

    .line 14
    .line 15
    .line 16
    iget-boolean v1, p0, Lk2/Z;->n:Z

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    new-instance v1, Lg2/t;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-direct {v1, v0, v2}, Lg2/t;-><init>(LN1/N;I)V

    .line 24
    .line 25
    .line 26
    move-object v0, v1

    .line 27
    :cond_0
    invoke-virtual {p0, v0}, Lk2/a;->m(LN1/N;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final u(JZZ)V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-wide p1, p0, Lk2/Z;->o:J

    .line 11
    .line 12
    :cond_0
    iget-boolean v0, p0, Lk2/Z;->n:Z

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-wide v0, p0, Lk2/Z;->o:J

    .line 17
    .line 18
    cmp-long v0, v0, p1

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-boolean v0, p0, Lk2/Z;->p:Z

    .line 23
    .line 24
    if-ne v0, p3, :cond_1

    .line 25
    .line 26
    iget-boolean v0, p0, Lk2/Z;->q:Z

    .line 27
    .line 28
    if-ne v0, p4, :cond_1

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iput-wide p1, p0, Lk2/Z;->o:J

    .line 32
    .line 33
    iput-boolean p3, p0, Lk2/Z;->p:Z

    .line 34
    .line 35
    iput-boolean p4, p0, Lk2/Z;->q:Z

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iput-boolean p1, p0, Lk2/Z;->n:Z

    .line 39
    .line 40
    invoke-virtual {p0}, Lk2/Z;->t()V

    .line 41
    .line 42
    .line 43
    return-void
.end method
