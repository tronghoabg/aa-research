.class public abstract LLf/h;
.super LEf/d0;
.source "SourceFile"


# instance fields
.field public b:LLf/c;


# virtual methods
.method public final i(Ljf/h;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    const/4 p1, 0x6

    .line 2
    iget-object v0, p0, LLf/h;->b:LLf/c;

    .line 3
    .line 4
    invoke-static {v0, p2, p1}, LLf/c;->h(LLf/c;Ljava/lang/Runnable;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final o(Ljf/h;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    const/4 p1, 0x2

    .line 2
    iget-object v0, p0, LLf/h;->b:LLf/c;

    .line 3
    .line 4
    invoke-static {v0, p2, p1}, LLf/c;->h(LLf/c;Ljava/lang/Runnable;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final z()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    iget-object v0, p0, LLf/h;->b:LLf/c;

    .line 2
    .line 3
    return-object v0
.end method
