.class public final LWe/f;
.super LHe/l;
.source "SourceFile"


# instance fields
.field public final a:LJe/a;

.field public final b:LWe/e;

.field public final c:LWe/g;

.field public final d:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(LWe/e;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LWe/f;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    iput-object p1, p0, LWe/f;->b:LWe/e;

    .line 12
    .line 13
    new-instance v0, LJe/a;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1}, LJe/a;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, LWe/f;->a:LJe/a;

    .line 20
    .line 21
    iget-object v0, p1, LWe/e;->c:LJe/a;

    .line 22
    .line 23
    iget-boolean v0, v0, LJe/a;->b:Z

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    sget-object p1, LWe/h;->e:LWe/g;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    iget-object v0, p1, LWe/e;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    iget-object v0, p1, LWe/e;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, LWe/g;

    .line 45
    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    :goto_0
    move-object p1, v0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    new-instance v0, LWe/g;

    .line 51
    .line 52
    iget-object v1, p1, LWe/e;->f:LWe/l;

    .line 53
    .line 54
    invoke-direct {v0, v1}, LWe/g;-><init>(LWe/l;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p1, LWe/e;->c:LJe/a;

    .line 58
    .line 59
    invoke-virtual {p1, v0}, LJe/a;->a(LJe/b;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :goto_1
    iput-object p1, p0, LWe/f;->c:LWe/g;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Runnable;Ljava/util/concurrent/TimeUnit;)LJe/b;
    .locals 2

    .line 1
    sget-object p2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    iget-object v0, p0, LWe/f;->a:LJe/a;

    .line 4
    .line 5
    iget-boolean v0, v0, LJe/a;->b:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p1, LMe/b;->a:LMe/b;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object v0, p0, LWe/f;->c:LWe/g;

    .line 13
    .line 14
    iget-object v1, p0, LWe/f;->a:LJe/a;

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2, v1}, LWe/j;->c(Ljava/lang/Runnable;Ljava/util/concurrent/TimeUnit;LJe/a;)LWe/n;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final dispose()V
    .locals 5

    .line 1
    iget-object v0, p0, LWe/f;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LWe/f;->a:LJe/a;

    .line 12
    .line 13
    invoke-virtual {v0}, LJe/a;->dispose()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LWe/f;->b:LWe/e;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    iget-wide v3, v0, LWe/e;->a:J

    .line 26
    .line 27
    add-long/2addr v1, v3

    .line 28
    iget-object v3, p0, LWe/f;->c:LWe/g;

    .line 29
    .line 30
    iput-wide v1, v3, LWe/g;->c:J

    .line 31
    .line 32
    iget-object v0, v0, LWe/e;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->offer(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method
