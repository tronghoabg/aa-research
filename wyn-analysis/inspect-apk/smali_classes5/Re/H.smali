.class public final LRe/H;
.super LXe/b;
.source "SourceFile"


# instance fields
.field public final f:LY9/c;


# direct methods
.method public constructor <init>(LHe/f;LY9/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LXe/b;-><init>(LHe/f;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LRe/H;->f:LY9/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LXe/b;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget v0, p0, LXe/b;->e:I

    .line 7
    .line 8
    iget-object v1, p0, LXe/b;->a:LHe/f;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-interface {v1, p1}, LHe/f;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    :try_start_0
    iget-object v0, p0, LRe/H;->f:LY9/c;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, LY9/c;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v0, "The mapper function returned a null value."

    .line 24
    .line 25
    invoke-static {p1, v0}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    invoke-interface {v1, p1}, LHe/f;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, LXe/b;->b:Lug/b;

    .line 37
    .line 38
    invoke-interface {v0}, Lug/b;->cancel()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1}, LXe/b;->onError(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    return-void
.end method

.method public final poll()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LXe/b;->c:LOe/e;

    .line 2
    .line 3
    invoke-interface {v0}, LOe/h;->poll()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, LRe/H;->f:LY9/c;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, LY9/c;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "The mapper function returned a null value."

    .line 16
    .line 17
    invoke-static {v0, v1}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return-object v0
.end method
