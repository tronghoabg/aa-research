.class public final LSe/s;
.super LYe/c;
.source "SourceFile"

# interfaces
.implements LHe/h;


# instance fields
.field public c:LJe/b;


# virtual methods
.method public final a(LJe/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LSe/s;->c:LJe/b;

    .line 2
    .line 3
    invoke-static {v0, p1}, LMe/a;->f(LJe/b;LJe/b;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, LSe/s;->c:LJe/b;

    .line 10
    .line 11
    iget-object p1, p0, LYe/c;->a:LHe/f;

    .line 12
    .line 13
    invoke-interface {p1, p0}, LHe/f;->e(Lug/b;)V

    .line 14
    .line 15
    .line 16
    :cond_0
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
    iget-object v0, p0, LSe/s;->c:LJe/b;

    .line 9
    .line 10
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onComplete()V
    .locals 1

    .line 1
    iget-object v0, p0, LYe/c;->a:LHe/f;

    .line 2
    .line 3
    invoke-interface {v0}, LHe/f;->onComplete()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LYe/c;->a:LHe/f;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
