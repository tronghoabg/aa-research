.class public final LQe/a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements LHe/b;


# instance fields
.field public final a:LHe/b;

.field public final b:[LHe/a;

.field public c:I

.field public final d:LJe/c;


# direct methods
.method public constructor <init>(LHe/b;[LHe/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQe/a;->a:LHe/b;

    .line 5
    .line 6
    iput-object p2, p0, LQe/a;->b:[LHe/a;

    .line 7
    .line 8
    new-instance p1, LJe/c;

    .line 9
    .line 10
    const/4 p2, 0x1

    .line 11
    invoke-direct {p1, p2}, LJe/c;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LQe/a;->d:LJe/c;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(LJe/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LQe/a;->d:LJe/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p1}, LMe/a;->c(Ljava/util/concurrent/atomic/AtomicReference;LJe/b;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, LQe/a;->d:LJe/c;

    .line 2
    .line 3
    invoke-virtual {v0}, LJe/c;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {v0}, LJe/c;->b()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    iget v1, p0, LQe/a;->c:I

    .line 25
    .line 26
    add-int/lit8 v2, v1, 0x1

    .line 27
    .line 28
    iput v2, p0, LQe/a;->c:I

    .line 29
    .line 30
    iget-object v2, p0, LQe/a;->b:[LHe/a;

    .line 31
    .line 32
    array-length v3, v2

    .line 33
    if-ne v1, v3, :cond_3

    .line 34
    .line 35
    iget-object v0, p0, LQe/a;->a:LHe/b;

    .line 36
    .line 37
    invoke-interface {v0}, LHe/b;->onComplete()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_3
    aget-object v1, v2, v1

    .line 42
    .line 43
    invoke-virtual {v1, p0}, LHe/a;->d(LHe/b;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    :goto_0
    return-void
.end method

.method public final onComplete()V
    .locals 0

    .line 1
    invoke-virtual {p0}, LQe/a;->b()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LQe/a;->a:LHe/b;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LHe/b;->onError(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
