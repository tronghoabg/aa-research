.class public final LRe/q;
.super LYe/c;
.source "SourceFile"

# interfaces
.implements LHe/f;


# instance fields
.field public c:Lug/b;

.field public d:J

.field public e:Z


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, LRe/q;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-wide v0, p0, LRe/q;->d:J

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v2, v0, v2

    .line 11
    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, LRe/q;->e:Z

    .line 16
    .line 17
    iget-object v0, p0, LRe/q;->c:Lug/b;

    .line 18
    .line 19
    invoke-interface {v0}, Lug/b;->cancel()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, LYe/c;->f(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const-wide/16 v2, 0x1

    .line 27
    .line 28
    add-long/2addr v0, v2

    .line 29
    iput-wide v0, p0, LRe/q;->d:J

    .line 30
    .line 31
    return-void
.end method

.method public final cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, LYe/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v0, p0, LRe/q;->c:Lug/b;

    .line 9
    .line 10
    invoke-interface {v0}, Lug/b;->cancel()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final e(Lug/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, LRe/q;->c:Lug/b;

    .line 2
    .line 3
    invoke-static {v0, p1}, LYe/f;->d(Lug/b;Lug/b;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, LRe/q;->c:Lug/b;

    .line 10
    .line 11
    iget-object v0, p0, LYe/c;->a:LHe/f;

    .line 12
    .line 13
    invoke-interface {v0, p0}, LHe/f;->e(Lug/b;)V

    .line 14
    .line 15
    .line 16
    const-wide v0, 0x7fffffffffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0, v1}, Lug/b;->request(J)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final onComplete()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LRe/q;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, LRe/q;->e:Z

    .line 7
    .line 8
    iget-object v0, p0, LYe/c;->a:LHe/f;

    .line 9
    .line 10
    invoke-interface {v0}, LHe/f;->onComplete()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LRe/q;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, LRe/q;->e:Z

    .line 11
    .line 12
    iget-object v0, p0, LYe/c;->a:LHe/f;

    .line 13
    .line 14
    invoke-interface {v0, p1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
