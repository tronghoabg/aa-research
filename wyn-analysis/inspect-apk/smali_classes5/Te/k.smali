.class public final LTe/k;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements LJe/b;
.implements LHe/j;


# instance fields
.field public final a:LHe/b;

.field public final b:LZe/b;

.field public final c:LJ9/U;

.field public final d:LJe/a;

.field public e:LJe/b;

.field public volatile f:Z


# direct methods
.method public constructor <init>(LHe/b;LJ9/U;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LTe/k;->a:LHe/b;

    .line 5
    .line 6
    iput-object p2, p0, LTe/k;->c:LJ9/U;

    .line 7
    .line 8
    new-instance p1, LZe/b;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LTe/k;->b:LZe/b;

    .line 14
    .line 15
    new-instance p1, LJe/a;

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    invoke-direct {p1, p2}, LJe/a;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, LTe/k;->d:LJe/a;

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->lazySet(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final a(LJe/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LTe/k;->e:LJe/b;

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
    iput-object p1, p0, LTe/k;->e:LJe/b;

    .line 10
    .line 11
    iget-object p1, p0, LTe/k;->a:LHe/b;

    .line 12
    .line 13
    invoke-interface {p1, p0}, LHe/b;->a(LJe/b;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, LTe/k;->c:LJ9/U;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LJ9/U;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LHe/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 10
    .line 11
    .line 12
    new-instance v0, LSe/c;

    .line 13
    .line 14
    const/4 v1, 0x3

    .line 15
    invoke-direct {v0, p0, v1}, LSe/c;-><init>(Ljava/util/concurrent/atomic/AtomicInteger;I)V

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, LTe/k;->f:Z

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    iget-object v1, p0, LTe/k;->d:LJe/a;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, LJe/a;->a(LJe/b;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1, v0}, LHe/a;->d(LHe/b;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, LTe/k;->e:LJe/b;

    .line 39
    .line 40
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, LTe/k;->onError(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final dispose()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LTe/k;->f:Z

    .line 3
    .line 4
    iget-object v0, p0, LTe/k;->e:LJe/b;

    .line 5
    .line 6
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LTe/k;->d:LJe/a;

    .line 10
    .line 11
    invoke-virtual {v0}, LJe/a;->dispose()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onComplete()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, LTe/k;->b:LZe/b;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, LTe/k;->a:LHe/b;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-interface {v1, v0}, LHe/b;->onError(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-interface {v1}, LHe/b;->onComplete()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, LTe/k;->b:LZe/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p1}, LZe/d;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, LTe/k;->dispose()V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-lez p1, :cond_0

    .line 21
    .line 22
    invoke-static {v0}, LZe/d;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object v0, p0, LTe/k;->a:LHe/b;

    .line 27
    .line 28
    invoke-interface {v0, p1}, LHe/b;->onError(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void

    .line 32
    :cond_1
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
