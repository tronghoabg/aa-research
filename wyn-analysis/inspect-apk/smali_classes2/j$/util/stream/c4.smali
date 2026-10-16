.class final Lj$/util/stream/c4;
.super Lj$/util/stream/k2;
.source "SourceFile"


# instance fields
.field b:Z


# virtual methods
.method public final accept(D)V
    .locals 1

    .line 269
    iget-boolean v0, p0, Lj$/util/stream/c4;->b:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-interface {v0, p1, p2}, Ljava/util/function/DoublePredicate;->test(D)Z

    throw v0
.end method

.method public final l(J)V
    .locals 2

    .line 264
    iget-object p1, p0, Lj$/util/stream/k2;->a:Lj$/util/stream/r2;

    const-wide/16 v0, -0x1

    invoke-interface {p1, v0, v1}, Lj$/util/stream/r2;->l(J)V

    return-void
.end method

.method public final n()Z
    .locals 1

    .line 276
    iget-boolean v0, p0, Lj$/util/stream/c4;->b:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lj$/util/stream/k2;->a:Lj$/util/stream/r2;

    invoke-interface {v0}, Lj$/util/stream/r2;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
