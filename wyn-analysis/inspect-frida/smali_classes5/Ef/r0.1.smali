.class public final LEf/r0;
.super LEf/n;
.source "SourceFile"


# instance fields
.field public final i:LEf/z0;


# direct methods
.method public constructor <init>(LEf/z0;Ljf/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0, p2}, LEf/n;-><init>(ILjf/c;)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, LEf/r0;->i:LEf/z0;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final r(LEf/z0;)Ljava/lang/Throwable;
    .locals 2

    .line 1
    iget-object v0, p0, LEf/r0;->i:LEf/z0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, LEf/z0;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    instance-of v1, v0, LEf/t0;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    move-object v1, v0

    .line 17
    check-cast v1, LEf/t0;

    .line 18
    .line 19
    invoke-virtual {v1}, LEf/t0;->c()Ljava/lang/Throwable;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_0
    instance-of v1, v0, LEf/x;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    check-cast v0, LEf/x;

    .line 31
    .line 32
    iget-object p1, v0, LEf/x;->a:Ljava/lang/Throwable;

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_1
    invoke-virtual {p1}, LEf/z0;->getCancellationException()Ljava/util/concurrent/CancellationException;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1
.end method

.method public final z()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "AwaitContinuation"

    .line 2
    .line 3
    return-object v0
.end method
