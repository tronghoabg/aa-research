.class public final synthetic Lj$/io/DesugarBufferedReader;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static lines(Ljava/io/BufferedReader;)Lj$/util/stream/Stream;
    .locals 1

    .line 566
    new-instance v0, Lj$/io/a;

    invoke-direct {v0, p0}, Lj$/io/a;-><init>(Ljava/io/BufferedReader;)V

    .line 568
    invoke-static {v0}, Lj$/util/Spliterators;->m(Ljava/util/Iterator;)Lj$/util/Spliterator;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lj$/util/stream/L3;->d(Lj$/util/Spliterator;Z)Lj$/util/stream/Stream;

    move-result-object p0

    return-object p0
.end method
