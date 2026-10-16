.class public final LSe/w;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements LHe/h;


# instance fields
.field public final a:LSe/v;

.field public final b:I


# direct methods
.method public constructor <init>(LSe/v;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LSe/w;->a:LSe/v;

    .line 5
    .line 6
    iput p2, p0, LSe/w;->b:I

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
    return-void
.end method

.method public final onComplete()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LSe/w;->a:LSe/v;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    iget v0, p0, LSe/w;->b:I

    .line 11
    .line 12
    invoke-virtual {v1, v0}, LSe/v;->a(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v1, LSe/v;->a:LHe/h;

    .line 16
    .line 17
    invoke-interface {v0}, LHe/h;->onComplete()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LSe/w;->a:LSe/v;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    iget v0, p0, LSe/w;->b:I

    .line 11
    .line 12
    invoke-virtual {v1, v0}, LSe/v;->a(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, v1, LSe/v;->a:LHe/h;

    .line 16
    .line 17
    invoke-interface {v0, p1}, LHe/h;->onError(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, LSe/w;->a:LSe/v;

    .line 2
    .line 3
    iget-object v1, v0, LSe/v;->a:LHe/h;

    .line 4
    .line 5
    iget v2, p0, LSe/w;->b:I

    .line 6
    .line 7
    iget-object v3, v0, LSe/v;->d:[Ljava/lang/Object;

    .line 8
    .line 9
    aput-object p1, v3, v2

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    :try_start_0
    iget-object p1, v0, LSe/v;->b:Lx4/d;

    .line 18
    .line 19
    invoke-virtual {p1, v3}, Lx4/d;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    invoke-interface {v1, p1}, LHe/h;->onSuccess(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v1, p1}, LHe/h;->onError(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method
