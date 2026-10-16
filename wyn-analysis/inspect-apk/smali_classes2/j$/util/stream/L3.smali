.class public abstract Lj$/util/stream/L3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lj$/util/V;)Lj$/util/stream/E;
    .locals 3

    .line 274
    new-instance v0, Lj$/util/stream/z;

    .line 275
    invoke-static {p0}, Lj$/util/stream/g3;->s(Lj$/util/Spliterator;)I

    move-result v1

    const/4 v2, 0x0

    .line 79
    invoke-direct {v0, p0, v1, v2}, Lj$/util/stream/b;-><init>(Lj$/util/Spliterator;IZ)V

    return-object v0
.end method

.method public static b(Lj$/util/Spliterator$OfInt;)Lj$/util/stream/IntStream;
    .locals 3

    .line 138
    new-instance v0, Lj$/util/stream/Z;

    .line 139
    invoke-static {p0}, Lj$/util/stream/g3;->s(Lj$/util/Spliterator;)I

    move-result v1

    const/4 v2, 0x0

    .line 80
    invoke-direct {v0, p0, v1, v2}, Lj$/util/stream/b;-><init>(Lj$/util/Spliterator;IZ)V

    return-object v0
.end method

.method public static c(Lj$/util/a0;)Lj$/util/stream/n0;
    .locals 3

    .line 206
    new-instance v0, Lj$/util/stream/i0;

    .line 207
    invoke-static {p0}, Lj$/util/stream/g3;->s(Lj$/util/Spliterator;)I

    move-result v1

    const/4 v2, 0x0

    .line 81
    invoke-direct {v0, p0, v1, v2}, Lj$/util/stream/b;-><init>(Lj$/util/Spliterator;IZ)V

    return-object v0
.end method

.method public static d(Lj$/util/Spliterator;Z)Lj$/util/stream/Stream;
    .locals 2

    .line 68
    invoke-static {p0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    new-instance v0, Lj$/util/stream/h2;

    .line 70
    invoke-static {p0}, Lj$/util/stream/g3;->s(Lj$/util/Spliterator;)I

    move-result v1

    .line 84
    invoke-direct {v0, p0, v1, p1}, Lj$/util/stream/b;-><init>(Lj$/util/Spliterator;IZ)V

    return-object v0
.end method
