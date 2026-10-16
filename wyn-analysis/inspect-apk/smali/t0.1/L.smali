.class public final Lt0/L;
.super LX0/E;
.source "SourceFile"


# virtual methods
.method public final g()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LX0/E;->a:Z

    .line 3
    .line 4
    iget-object v1, p0, LX0/E;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, LZ/j;

    .line 7
    .line 8
    check-cast v1, Lp0/o;

    .line 9
    .line 10
    invoke-interface {v1}, Lp0/o;->s()Lp0/n;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v3, p0, LX0/E;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Lt0/y;

    .line 17
    .line 18
    iput-object v3, v2, Lp0/n;->a:Lr0/k;

    .line 19
    .line 20
    invoke-interface {v1}, Lp0/o;->s()Lp0/n;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iput-boolean v0, v1, Lp0/n;->b:Z

    .line 25
    .line 26
    return-void
.end method

.method public final h()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LX0/E;->a:Z

    .line 3
    .line 4
    iget-object v1, p0, LX0/E;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, LZ/j;

    .line 7
    .line 8
    check-cast v1, Lp0/o;

    .line 9
    .line 10
    invoke-interface {v1}, Lp0/o;->s()Lp0/n;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-boolean v0, v1, Lp0/n;->b:Z

    .line 15
    .line 16
    return-void
.end method

.method public final j()Z
    .locals 2

    .line 1
    iget-object v0, p0, LX0/E;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LZ/j;

    .line 4
    .line 5
    check-cast v0, Lp0/o;

    .line 6
    .line 7
    invoke-interface {v0}, Lp0/o;->s()Lp0/n;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    instance-of v0, v0, Lp0/q;

    .line 15
    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, LX0/E;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, LX0/E;

    .line 21
    .line 22
    check-cast v0, Lt0/L;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Lt0/L;->j()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v0, v1

    .line 33
    :goto_0
    if-eqz v0, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    return v1

    .line 37
    :cond_2
    :goto_1
    const/4 v0, 0x1

    .line 38
    return v0
.end method
