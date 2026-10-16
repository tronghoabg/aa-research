.class public final LSe/p;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements LHe/h;
.implements LJe/b;
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:LHe/h;

.field public final b:LHe/m;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(LHe/h;LHe/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LSe/p;->a:LHe/h;

    .line 5
    .line 6
    iput-object p2, p0, LSe/p;->b:LHe/m;

    .line 7
    .line 8
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
    iget-object p1, p0, LSe/p;->a:LHe/h;

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
    iget-object v0, p0, LSe/p;->b:LHe/m;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LHe/m;->b(Ljava/lang/Runnable;)LJe/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0, v0}, LMe/a;->c(Ljava/util/concurrent/atomic/AtomicReference;LJe/b;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iput-object p1, p0, LSe/p;->d:Ljava/lang/Throwable;

    .line 2
    .line 3
    iget-object p1, p0, LSe/p;->b:LHe/m;

    .line 4
    .line 5
    invoke-virtual {p1, p0}, LHe/m;->b(Ljava/lang/Runnable;)LJe/b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p0, p1}, LMe/a;->c(Ljava/util/concurrent/atomic/AtomicReference;LJe/b;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LSe/p;->c:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p1, p0, LSe/p;->b:LHe/m;

    .line 4
    .line 5
    invoke-virtual {p1, p0}, LHe/m;->b(Ljava/lang/Runnable;)LJe/b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p0, p1}, LMe/a;->c(Ljava/util/concurrent/atomic/AtomicReference;LJe/b;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LSe/p;->d:Ljava/lang/Throwable;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, LSe/p;->a:LHe/h;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iput-object v1, p0, LSe/p;->d:Ljava/lang/Throwable;

    .line 9
    .line 10
    invoke-interface {v2, v0}, LHe/h;->onError(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, LSe/p;->c:Ljava/lang/Object;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iput-object v1, p0, LSe/p;->c:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-interface {v2, v0}, LHe/h;->onSuccess(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    invoke-interface {v2}, LHe/h;->onComplete()V

    .line 25
    .line 26
    .line 27
    return-void
.end method
