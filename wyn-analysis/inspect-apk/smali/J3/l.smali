.class public final LJ3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp8/p;


# instance fields
.field public final a:LU3/j;


# direct methods
.method public constructor <init>(LEf/o0;)V
    .locals 2

    .line 1
    new-instance v0, LU3/j;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LJ3/l;->a:LU3/j;

    .line 10
    .line 11
    new-instance v0, LB/F;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-direct {v0, p0, v1}, LB/F;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, LEf/z0;->invokeOnCompletion(Ltf/l;)LEf/U;

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ3/l;->a:LU3/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LU3/h;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final cancel(Z)Z
    .locals 1

    .line 1
    iget-object v0, p0, LJ3/l;->a:LU3/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LU3/h;->cancel(Z)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LJ3/l;->a:LU3/j;

    invoke-virtual {v0}, LU3/h;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1

    .line 2
    iget-object v0, p0, LJ3/l;->a:LU3/j;

    invoke-virtual {v0, p1, p2, p3}, LU3/h;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final isCancelled()Z
    .locals 1

    .line 1
    iget-object v0, p0, LJ3/l;->a:LU3/j;

    .line 2
    .line 3
    iget-object v0, v0, LU3/h;->a:Ljava/lang/Object;

    .line 4
    .line 5
    instance-of v0, v0, LU3/a;

    .line 6
    .line 7
    return v0
.end method

.method public final isDone()Z
    .locals 1

    .line 1
    iget-object v0, p0, LJ3/l;->a:LU3/j;

    .line 2
    .line 3
    invoke-virtual {v0}, LU3/h;->isDone()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
