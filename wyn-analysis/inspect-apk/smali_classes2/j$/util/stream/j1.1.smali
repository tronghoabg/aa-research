.class final Lj$/util/stream/j1;
.super Lj$/util/stream/m1;
.source "SourceFile"

# interfaces
.implements Lj$/util/V;


# virtual methods
.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/S;->a(Lj$/util/V;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final synthetic tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 0

    invoke-static {p0, p1}, Lj$/util/S;->f(Lj$/util/V;Ljava/util/function/Consumer;)Z

    move-result p1

    return p1
.end method
