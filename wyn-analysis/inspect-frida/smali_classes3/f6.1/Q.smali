.class public final Lf6/Q;
.super Lf6/a;
.source "SourceFile"


# instance fields
.field public final h:LE5/d0;

.field public final i:LE5/a0;

.field public final j:Lt6/k;

.field public final k:Lcom/unity3d/services/core/webview/b;

.field public final l:LI5/i;

.field public final m:Lae/d;

.field public final n:I

.field public o:Z

.field public p:J

.field public q:Z

.field public r:Z

.field public s:Lt6/K;


# direct methods
.method public constructor <init>(LE5/d0;Lt6/k;Lcom/unity3d/services/core/webview/b;LI5/i;Lae/d;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lf6/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, LE5/d0;->b:LE5/a0;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lf6/Q;->i:LE5/a0;

    .line 10
    .line 11
    iput-object p1, p0, Lf6/Q;->h:LE5/d0;

    .line 12
    .line 13
    iput-object p2, p0, Lf6/Q;->j:Lt6/k;

    .line 14
    .line 15
    iput-object p3, p0, Lf6/Q;->k:Lcom/unity3d/services/core/webview/b;

    .line 16
    .line 17
    iput-object p4, p0, Lf6/Q;->l:LI5/i;

    .line 18
    .line 19
    iput-object p5, p0, Lf6/Q;->m:Lae/d;

    .line 20
    .line 21
    iput p6, p0, Lf6/Q;->n:I

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    iput-boolean p1, p0, Lf6/Q;->o:Z

    .line 25
    .line 26
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    iput-wide p1, p0, Lf6/Q;->p:J

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a(Lf6/z;Lo2/e;J)Lf6/w;
    .locals 11

    .line 1
    iget-object p3, p0, Lf6/Q;->j:Lt6/k;

    .line 2
    .line 3
    invoke-interface {p3}, Lt6/k;->b()Lt6/l;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget-object p3, p0, Lf6/Q;->s:Lt6/K;

    .line 8
    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    invoke-interface {v2, p3}, Lt6/l;->z(Lt6/K;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    new-instance v0, Lf6/N;

    .line 15
    .line 16
    iget-object p3, p0, Lf6/Q;->i:LE5/a0;

    .line 17
    .line 18
    iget-object v1, p3, LE5/a0;->a:Landroid/net/Uri;

    .line 19
    .line 20
    iget-object p3, p0, Lf6/a;->g:LF5/l;

    .line 21
    .line 22
    invoke-static {p3}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance v3, Lb7/k;

    .line 26
    .line 27
    iget-object p3, p0, Lf6/Q;->k:Lcom/unity3d/services/core/webview/b;

    .line 28
    .line 29
    iget-object p3, p3, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p3, LJ5/i;

    .line 32
    .line 33
    invoke-direct {v3, p3}, Lb7/k;-><init>(LJ5/i;)V

    .line 34
    .line 35
    .line 36
    new-instance v5, LI5/f;

    .line 37
    .line 38
    iget-object p3, p0, Lf6/a;->d:LI5/f;

    .line 39
    .line 40
    iget-object p3, p3, LI5/f;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 41
    .line 42
    const/4 p4, 0x0

    .line 43
    invoke-direct {v5, p3, p4, p1}, LI5/f;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILf6/z;)V

    .line 44
    .line 45
    .line 46
    new-instance v7, LI5/f;

    .line 47
    .line 48
    iget-object p3, p0, Lf6/a;->c:LI5/f;

    .line 49
    .line 50
    iget-object p3, p3, LI5/f;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 51
    .line 52
    invoke-direct {v7, p3, p4, p1}, LI5/f;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILf6/z;)V

    .line 53
    .line 54
    .line 55
    iget-object v4, p0, Lf6/Q;->l:LI5/i;

    .line 56
    .line 57
    iget-object v6, p0, Lf6/Q;->m:Lae/d;

    .line 58
    .line 59
    iget v10, p0, Lf6/Q;->n:I

    .line 60
    .line 61
    move-object v8, p0

    .line 62
    move-object v9, p2

    .line 63
    invoke-direct/range {v0 .. v10}, Lf6/N;-><init>(Landroid/net/Uri;Lt6/l;Lb7/k;LI5/i;LI5/f;Lae/d;LI5/f;Lf6/Q;Lo2/e;I)V

    .line 64
    .line 65
    .line 66
    return-object v0
.end method

.method public final g()LE5/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/Q;->h:LE5/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()V
    .locals 0

    .line 1
    return-void
.end method

.method public final k(Lt6/K;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lf6/Q;->s:Lt6/K;

    .line 2
    .line 3
    iget-object p1, p0, Lf6/Q;->l:LI5/i;

    .line 4
    .line 5
    invoke-interface {p1}, LI5/i;->f()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lf6/a;->g:LF5/l;

    .line 16
    .line 17
    invoke-static {v1}, Lu6/a;->j(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, v0, v1}, LI5/i;->g(Landroid/os/Looper;LF5/l;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lf6/Q;->r()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final m(Lf6/w;)V
    .locals 7

    .line 1
    check-cast p1, Lf6/N;

    .line 2
    .line 3
    iget-boolean v0, p1, Lf6/N;->u:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p1, Lf6/N;->r:[Lf6/U;

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
    invoke-virtual {v4}, Lf6/U;->g()V

    .line 17
    .line 18
    .line 19
    iget-object v5, v4, Lf6/U;->h:LA/e0;

    .line 20
    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    iget-object v6, v4, Lf6/U;->e:LI5/f;

    .line 24
    .line 25
    invoke-virtual {v5, v6}, LA/e0;->y(LI5/f;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, v4, Lf6/U;->h:LA/e0;

    .line 29
    .line 30
    iput-object v1, v4, Lf6/U;->g:LE5/T;

    .line 31
    .line 32
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v0, p1, Lf6/N;->j:Lt6/E;

    .line 36
    .line 37
    iget-object v2, v0, Lt6/E;->b:Lt6/C;

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Lt6/C;->a(Z)V

    .line 43
    .line 44
    .line 45
    :cond_2
    new-instance v2, Lg5/d;

    .line 46
    .line 47
    const/16 v4, 0x19

    .line 48
    .line 49
    invoke-direct {v2, p1, v4}, Lg5/d;-><init>(Ljava/lang/Object;I)V

    .line 50
    .line 51
    .line 52
    iget-object v0, v0, Lt6/E;->a:Ljava/util/concurrent/ExecutorService;

    .line 53
    .line 54
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 58
    .line 59
    .line 60
    iget-object v0, p1, Lf6/N;->o:Landroid/os/Handler;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iput-object v1, p1, Lf6/N;->p:Lf6/v;

    .line 66
    .line 67
    iput-boolean v3, p1, Lf6/N;->K:Z

    .line 68
    .line 69
    return-void
.end method

.method public final o()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/Q;->l:LI5/i;

    .line 2
    .line 3
    invoke-interface {v0}, LI5/i;->release()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final r()V
    .locals 6

    .line 1
    new-instance v0, Lf6/Y;

    .line 2
    .line 3
    iget-wide v1, p0, Lf6/Q;->p:J

    .line 4
    .line 5
    iget-boolean v3, p0, Lf6/Q;->q:Z

    .line 6
    .line 7
    iget-boolean v4, p0, Lf6/Q;->r:Z

    .line 8
    .line 9
    iget-object v5, p0, Lf6/Q;->h:LE5/d0;

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, Lf6/Y;-><init>(JZZLE5/d0;)V

    .line 12
    .line 13
    .line 14
    iget-boolean v1, p0, Lf6/Q;->o:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    new-instance v1, Lf6/O;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lf6/n;-><init>(LE5/J0;)V

    .line 21
    .line 22
    .line 23
    move-object v0, v1

    .line 24
    :cond_0
    invoke-virtual {p0, v0}, Lf6/a;->l(LE5/J0;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final s(JZZ)V
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
    iget-wide p1, p0, Lf6/Q;->p:J

    .line 11
    .line 12
    :cond_0
    iget-boolean v0, p0, Lf6/Q;->o:Z

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-wide v0, p0, Lf6/Q;->p:J

    .line 17
    .line 18
    cmp-long v0, v0, p1

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-boolean v0, p0, Lf6/Q;->q:Z

    .line 23
    .line 24
    if-ne v0, p3, :cond_1

    .line 25
    .line 26
    iget-boolean v0, p0, Lf6/Q;->r:Z

    .line 27
    .line 28
    if-ne v0, p4, :cond_1

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iput-wide p1, p0, Lf6/Q;->p:J

    .line 32
    .line 33
    iput-boolean p3, p0, Lf6/Q;->q:Z

    .line 34
    .line 35
    iput-boolean p4, p0, Lf6/Q;->r:Z

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iput-boolean p1, p0, Lf6/Q;->o:Z

    .line 39
    .line 40
    invoke-virtual {p0}, Lf6/Q;->r()V

    .line 41
    .line 42
    .line 43
    return-void
.end method
