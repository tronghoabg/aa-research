.class public abstract LHe/a;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final b(LLe/a;)LQe/e;
    .locals 2

    .line 1
    sget-object v0, LNe/b;->d:Lya/b;

    .line 2
    .line 3
    new-instance v1, LQe/e;

    .line 4
    .line 5
    invoke-direct {v1, p0, v0, p1}, LQe/e;-><init>(LHe/a;LLe/b;LLe/a;)V

    .line 6
    .line 7
    .line 8
    return-object v1
.end method

.method public final c()LJe/c;
    .locals 2

    .line 1
    new-instance v0, LJe/c;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, LJe/c;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, LHe/a;->d(LHe/b;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final d(LHe/b;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, LHe/a;->e(LHe/b;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catchall_0
    move-exception p1

    .line 6
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Ljava/lang/NullPointerException;

    .line 13
    .line 14
    const-string v1, "Actually not, but can\'t pass out an exception otherwise..."

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 20
    .line 21
    .line 22
    throw v0

    .line 23
    :catch_0
    move-exception p1

    .line 24
    throw p1
.end method

.method public abstract e(LHe/b;)V
.end method

.method public final f()LHe/g;
    .locals 2

    .line 1
    new-instance v0, LSe/d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, LSe/d;-><init>(Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
