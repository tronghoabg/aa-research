.class final Lj$/util/stream/n;
.super Lj$/util/stream/i2;
.source "SourceFile"


# direct methods
.method static V(Lj$/util/stream/b;Lj$/util/Spliterator;)Lj$/util/stream/O0;
    .locals 6

    .line 62
    new-instance v4, Lj$/util/stream/p;

    const/16 v0, 0x13

    .line 0
    invoke-direct {v4, v0}, Lj$/util/stream/p;-><init>(I)V

    .line 62
    new-instance v3, Lj$/util/stream/p;

    const/16 v0, 0x14

    .line 0
    invoke-direct {v3, v0}, Lj$/util/stream/p;-><init>(I)V

    .line 62
    new-instance v2, Lj$/util/stream/p;

    const/16 v0, 0x15

    .line 0
    invoke-direct {v2, v0}, Lj$/util/stream/p;-><init>(I)V

    .line 208
    invoke-static {v4}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    invoke-static {v3}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    invoke-static {v2}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    new-instance v0, Lj$/util/stream/F1;

    sget-object v1, Lj$/util/stream/h3;->REFERENCE:Lj$/util/stream/h3;

    const/4 v5, 0x3

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/F1;-><init>(Lj$/util/stream/h3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 65
    invoke-virtual {v0, p0, p1}, Lj$/util/stream/y0;->c(Lj$/util/stream/b;Lj$/util/Spliterator;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    .line 161
    new-instance p1, Lj$/util/stream/O0;

    invoke-direct {p1, p0}, Lj$/util/stream/O0;-><init>(Ljava/util/Collection;)V

    return-object p1
.end method


# virtual methods
.method final L(Lj$/util/stream/b;Lj$/util/Spliterator;Ljava/util/function/IntFunction;)Lj$/util/stream/K0;
    .locals 4

    .line 72
    sget-object v0, Lj$/util/stream/g3;->DISTINCT:Lj$/util/stream/g3;

    invoke-virtual {p1}, Lj$/util/stream/b;->H()I

    move-result v1

    invoke-virtual {v0, v1}, Lj$/util/stream/g3;->t(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 74
    invoke-virtual {p1, p2, v1, p3}, Lj$/util/stream/b;->z(Lj$/util/Spliterator;ZLjava/util/function/IntFunction;)Lj$/util/stream/K0;

    move-result-object p1

    return-object p1

    .line 76
    :cond_0
    sget-object p3, Lj$/util/stream/g3;->ORDERED:Lj$/util/stream/g3;

    invoke-virtual {p1}, Lj$/util/stream/b;->H()I

    move-result v0

    invoke-virtual {p3, v0}, Lj$/util/stream/g3;->t(I)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 77
    invoke-static {p1, p2}, Lj$/util/stream/n;->V(Lj$/util/stream/b;Lj$/util/Spliterator;)Lj$/util/stream/O0;

    move-result-object p1

    return-object p1

    .line 81
    :cond_1
    new-instance p3, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p3, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 82
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 83
    new-instance v2, Lj$/util/stream/p0;

    const/4 v3, 0x3

    invoke-direct {v2, v3, p3, v0}, Lj$/util/stream/p0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 71
    invoke-static {v2}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    new-instance v3, Lj$/util/stream/P;

    invoke-direct {v3, v2, v1}, Lj$/util/stream/P;-><init>(Ljava/util/function/Consumer;Z)V

    .line 173
    invoke-virtual {v3, p1, p2}, Lj$/util/stream/Q;->e(Lj$/util/stream/b;Lj$/util/Spliterator;)V

    .line 94
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    .line 95
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 97
    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 p1, 0x0

    .line 98
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-object p1, p2

    .line 161
    :cond_2
    new-instance p2, Lj$/util/stream/O0;

    invoke-direct {p2, p1}, Lj$/util/stream/O0;-><init>(Ljava/util/Collection;)V

    return-object p2
.end method

.method final M(Lj$/util/stream/b;Lj$/util/Spliterator;)Lj$/util/Spliterator;
    .locals 2

    .line 106
    sget-object v0, Lj$/util/stream/g3;->DISTINCT:Lj$/util/stream/g3;

    invoke-virtual {p1}, Lj$/util/stream/b;->H()I

    move-result v1

    invoke-virtual {v0, v1}, Lj$/util/stream/g3;->t(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    invoke-virtual {p1, p2}, Lj$/util/stream/b;->U(Lj$/util/Spliterator;)Lj$/util/Spliterator;

    move-result-object p1

    return-object p1

    .line 110
    :cond_0
    sget-object v0, Lj$/util/stream/g3;->ORDERED:Lj$/util/stream/g3;

    invoke-virtual {p1}, Lj$/util/stream/b;->H()I

    move-result v1

    invoke-virtual {v0, v1}, Lj$/util/stream/g3;->t(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 112
    invoke-static {p1, p2}, Lj$/util/stream/n;->V(Lj$/util/stream/b;Lj$/util/Spliterator;)Lj$/util/stream/O0;

    move-result-object p1

    invoke-virtual {p1}, Lj$/util/stream/O0;->spliterator()Lj$/util/Spliterator;

    move-result-object p1

    return-object p1

    .line 116
    :cond_1
    new-instance v0, Lj$/util/stream/p3;

    invoke-virtual {p1, p2}, Lj$/util/stream/b;->U(Lj$/util/Spliterator;)Lj$/util/Spliterator;

    move-result-object p1

    invoke-direct {v0, p1}, Lj$/util/stream/p3;-><init>(Lj$/util/Spliterator;)V

    return-object v0
.end method

.method final O(ILj$/util/stream/r2;)Lj$/util/stream/r2;
    .locals 1

    .line 122
    invoke-static {p2}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    sget-object v0, Lj$/util/stream/g3;->DISTINCT:Lj$/util/stream/g3;

    invoke-virtual {v0, p1}, Lj$/util/stream/g3;->t(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    .line 126
    :cond_0
    sget-object v0, Lj$/util/stream/g3;->SORTED:Lj$/util/stream/g3;

    invoke-virtual {v0, p1}, Lj$/util/stream/g3;->t(I)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 127
    new-instance p1, Lj$/util/stream/l;

    .line 127
    invoke-direct {p1, p2}, Lj$/util/stream/l;-><init>(Lj$/util/stream/r2;)V

    return-object p1

    .line 158
    :cond_1
    new-instance p1, Lj$/util/stream/m;

    .line 158
    invoke-direct {p1, p2}, Lj$/util/stream/m;-><init>(Lj$/util/stream/r2;)V

    return-object p1
.end method
