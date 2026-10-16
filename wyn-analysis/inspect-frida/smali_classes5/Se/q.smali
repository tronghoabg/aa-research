.class public final LSe/q;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements LHe/h;
.implements LJe/b;


# instance fields
.field public final a:LHe/h;

.field public final b:LLe/c;

.field public final c:Z


# direct methods
.method public constructor <init>(LHe/h;LLe/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LSe/q;->a:LHe/h;

    .line 5
    .line 6
    iput-object p2, p0, LSe/q;->b:LLe/c;

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, LSe/q;->c:Z

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(LJe/b;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, LMe/a;->e(Ljava/util/concurrent/atomic/AtomicReference;LJe/b;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LSe/q;->a:LHe/h;

    .line 8
    .line 9
    invoke-interface {p1, p0}, LHe/h;->a(LJe/b;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final dispose()V
    .locals 0

    .line 1
    invoke-static {p0}, LMe/a;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onComplete()V
    .locals 1

    .line 1
    iget-object v0, p0, LSe/q;->a:LHe/h;

    .line 2
    .line 3
    invoke-interface {v0}, LHe/h;->onComplete()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-boolean v1, p0, LSe/q;->c:Z

    .line 3
    .line 4
    iget-object v2, p0, LSe/q;->a:LHe/h;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    instance-of v1, p1, Ljava/lang/Exception;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-interface {v2, p1}, LHe/h;->onError(Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    :try_start_0
    iget-object v1, p0, LSe/q;->b:LLe/c;

    .line 17
    .line 18
    invoke-interface {v1, p1}, LLe/c;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v3, "The resumeFunction returned a null MaybeSource"

    .line 23
    .line 24
    invoke-static {v1, v3}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast v1, LHe/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    invoke-static {p0, p1}, LMe/a;->c(Ljava/util/concurrent/atomic/AtomicReference;LJe/b;)Z

    .line 31
    .line 32
    .line 33
    new-instance p1, LS3/e;

    .line 34
    .line 35
    const/16 v3, 0x11

    .line 36
    .line 37
    invoke-direct {p1, v2, v0, p0, v3}, LS3/e;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p1}, LHe/g;->b(LHe/h;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception v1

    .line 45
    invoke-static {v1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    new-instance v3, LKe/b;

    .line 49
    .line 50
    const/4 v4, 0x2

    .line 51
    new-array v4, v4, [Ljava/lang/Throwable;

    .line 52
    .line 53
    aput-object p1, v4, v0

    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    aput-object v1, v4, p1

    .line 57
    .line 58
    invoke-direct {v3, v4}, LKe/b;-><init>([Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v2, v3}, LHe/h;->onError(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LSe/q;->a:LHe/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LHe/h;->onSuccess(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
