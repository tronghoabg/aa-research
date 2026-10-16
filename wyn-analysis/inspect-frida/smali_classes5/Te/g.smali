.class public final LTe/g;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements LHe/j;


# instance fields
.field public final a:J

.field public final b:LTe/h;

.field public volatile c:Z

.field public volatile d:LOe/h;

.field public e:I


# direct methods
.method public constructor <init>(LTe/h;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p2, p0, LTe/g;->a:J

    .line 5
    .line 6
    iput-object p1, p0, LTe/g;->b:LTe/h;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(LJe/b;)V
    .locals 2

    .line 1
    invoke-static {p0, p1}, LMe/a;->e(Ljava/util/concurrent/atomic/AtomicReference;LJe/b;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    instance-of v0, p1, LOe/c;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    check-cast p1, LOe/c;

    .line 12
    .line 13
    const/4 v0, 0x7

    .line 14
    invoke-interface {p1, v0}, LOe/d;->c(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x1

    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    iput v0, p0, LTe/g;->e:I

    .line 22
    .line 23
    iput-object p1, p0, LTe/g;->d:LOe/h;

    .line 24
    .line 25
    iput-boolean v1, p0, LTe/g;->c:Z

    .line 26
    .line 27
    iget-object p1, p0, LTe/g;->b:LTe/h;

    .line 28
    .line 29
    invoke-virtual {p1}, LTe/h;->e()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    const/4 v1, 0x2

    .line 34
    if-ne v0, v1, :cond_1

    .line 35
    .line 36
    iput v0, p0, LTe/g;->e:I

    .line 37
    .line 38
    iput-object p1, p0, LTe/g;->d:LOe/h;

    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, LTe/g;->e:I

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, LTe/g;->b:LTe/h;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-object v1, v0, LTe/h;->a:LHe/j;

    .line 22
    .line 23
    invoke-interface {v1, p1}, LHe/j;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-nez p1, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v1, p0, LTe/g;->d:LOe/h;

    .line 34
    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    new-instance v1, LVe/b;

    .line 38
    .line 39
    iget v2, v0, LTe/h;->d:I

    .line 40
    .line 41
    invoke-direct {v1, v2}, LVe/b;-><init>(I)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, LTe/g;->d:LOe/h;

    .line 45
    .line 46
    :cond_1
    invoke-interface {v1, p1}, LOe/h;->offer(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    :goto_0
    return-void

    .line 56
    :cond_2
    invoke-virtual {v0}, LTe/h;->f()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3
    iget-object p1, p0, LTe/g;->b:LTe/h;

    .line 61
    .line 62
    invoke-virtual {p1}, LTe/h;->e()V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final onComplete()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LTe/g;->c:Z

    .line 3
    .line 4
    iget-object v0, p0, LTe/g;->b:LTe/h;

    .line 5
    .line 6
    invoke-virtual {v0}, LTe/h;->e()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LTe/g;->b:LTe/h;

    .line 2
    .line 3
    iget-object v0, v0, LTe/h;->g:LZe/b;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v0, p1}, LZe/d;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, LTe/g;->b:LTe/h;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, LTe/h;->d()Z

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, LTe/g;->c:Z

    .line 24
    .line 25
    iget-object p1, p0, LTe/g;->b:LTe/h;

    .line 26
    .line 27
    invoke-virtual {p1}, LTe/h;->e()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
