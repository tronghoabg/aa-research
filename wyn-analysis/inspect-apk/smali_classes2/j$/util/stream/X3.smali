.class final Lj$/util/stream/X3;
.super Lj$/util/stream/a0;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/g4;


# instance fields
.field final synthetic l:Ljava/util/function/IntPredicate;


# direct methods
.method public constructor <init>(Lj$/util/stream/c0;ILjava/util/function/IntPredicate;)V
    .locals 0

    .line 410
    iput-object p3, p0, Lj$/util/stream/X3;->l:Ljava/util/function/IntPredicate;

    .line 91
    invoke-direct {p0, p1, p2}, Lj$/util/stream/b;-><init>(Lj$/util/stream/b;I)V

    return-void
.end method


# virtual methods
.method final L(Lj$/util/stream/b;Lj$/util/Spliterator;Ljava/util/function/IntFunction;)Lj$/util/stream/K0;
    .locals 1

    .line 431
    new-instance v0, Lj$/util/stream/i4;

    invoke-direct {v0, p0, p1, p2, p3}, Lj$/util/stream/i4;-><init>(Lj$/util/stream/b;Lj$/util/stream/b;Lj$/util/Spliterator;Ljava/util/function/IntFunction;)V

    .line 432
    invoke-virtual {v0}, Ljava/util/concurrent/ForkJoinTask;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/util/stream/K0;

    return-object p1
.end method

.method final M(Lj$/util/stream/b;Lj$/util/Spliterator;)Lj$/util/Spliterator;
    .locals 2

    .line 417
    sget-object v0, Lj$/util/stream/g3;->ORDERED:Lj$/util/stream/g3;

    invoke-virtual {p1}, Lj$/util/stream/b;->H()I

    move-result v1

    invoke-virtual {v0, v1}, Lj$/util/stream/g3;->t(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 418
    new-instance v0, Lj$/util/stream/d2;

    const/4 v1, 0x7

    .line 0
    invoke-direct {v0, v1}, Lj$/util/stream/d2;-><init>(I)V

    .line 418
    invoke-virtual {p0, p1, p2, v0}, Lj$/util/stream/X3;->L(Lj$/util/stream/b;Lj$/util/Spliterator;Ljava/util/function/IntFunction;)Lj$/util/stream/K0;

    move-result-object p1

    .line 419
    invoke-interface {p1}, Lj$/util/stream/K0;->spliterator()Lj$/util/Spliterator;

    move-result-object p1

    return-object p1

    .line 422
    :cond_0
    new-instance v0, Lj$/util/stream/l4;

    .line 423
    invoke-virtual {p1, p2}, Lj$/util/stream/b;->U(Lj$/util/Spliterator;)Lj$/util/Spliterator;

    move-result-object p1

    check-cast p1, Lj$/util/Spliterator$OfInt;

    .line 887
    iget-object p2, p0, Lj$/util/stream/X3;->l:Ljava/util/function/IntPredicate;

    invoke-direct {v0, p1, p2}, Lj$/util/stream/n4;-><init>(Lj$/util/Spliterator$OfInt;Ljava/util/function/IntPredicate;)V

    return-object v0
.end method

.method final O(ILj$/util/stream/r2;)Lj$/util/stream/r2;
    .locals 1

    .line 469
    new-instance p1, Lj$/util/stream/W3;

    const/4 v0, 0x0

    invoke-direct {p1, p0, p2, v0}, Lj$/util/stream/W3;-><init>(Lj$/util/stream/X3;Lj$/util/stream/r2;Z)V

    return-object p1
.end method

.method public final k(Lj$/util/stream/C0;Z)Lj$/util/stream/h4;
    .locals 1

    .line 469
    new-instance v0, Lj$/util/stream/W3;

    invoke-direct {v0, p0, p1, p2}, Lj$/util/stream/W3;-><init>(Lj$/util/stream/X3;Lj$/util/stream/r2;Z)V

    return-object v0
.end method
