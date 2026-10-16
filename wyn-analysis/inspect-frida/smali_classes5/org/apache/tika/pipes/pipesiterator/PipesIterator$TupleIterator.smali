.class Lorg/apache/tika/pipes/pipesiterator/PipesIterator$TupleIterator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/tika/pipes/pipesiterator/PipesIterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TupleIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lorg/apache/tika/pipes/FetchEmitTuple;",
        ">;"
    }
.end annotation


# instance fields
.field next:Lorg/apache/tika/pipes/FetchEmitTuple;

.field final synthetic this$0:Lorg/apache/tika/pipes/pipesiterator/PipesIterator;


# direct methods
.method private constructor <init>(Lorg/apache/tika/pipes/pipesiterator/PipesIterator;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator$TupleIterator;->this$0:Lorg/apache/tika/pipes/pipesiterator/PipesIterator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator$TupleIterator;->next:Lorg/apache/tika/pipes/FetchEmitTuple;

    return-void
.end method

.method public synthetic constructor <init>(Lorg/apache/tika/pipes/pipesiterator/PipesIterator;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator$TupleIterator;-><init>(Lorg/apache/tika/pipes/pipesiterator/PipesIterator;)V

    return-void
.end method

.method private checkThreadOk()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator$TupleIterator;->this$0:Lorg/apache/tika/pipes/pipesiterator/PipesIterator;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->a(Lorg/apache/tika/pipes/pipesiterator/PipesIterator;)Ljava/util/concurrent/FutureTask;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->isDone()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    :try_start_0
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator$TupleIterator;->this$0:Lorg/apache/tika/pipes/pipesiterator/PipesIterator;

    .line 14
    .line 15
    invoke-static {v0}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->a(Lorg/apache/tika/pipes/pipesiterator/PipesIterator;)Ljava/util/concurrent/FutureTask;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catch_0
    move-exception v0

    .line 24
    new-instance v1, Ljava/lang/RuntimeException;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    throw v1

    .line 34
    :cond_0
    return-void
.end method

.method private pollNext()Lorg/apache/tika/pipes/FetchEmitTuple;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/tika/exception/TikaTimeoutException;
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    sub-long/2addr v2, v0

    .line 10
    const/4 v4, 0x0

    .line 11
    :goto_0
    if-nez v4, :cond_0

    .line 12
    .line 13
    iget-object v5, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator$TupleIterator;->this$0:Lorg/apache/tika/pipes/pipesiterator/PipesIterator;

    .line 14
    .line 15
    invoke-static {v5}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->b(Lorg/apache/tika/pipes/pipesiterator/PipesIterator;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    cmp-long v2, v2, v5

    .line 20
    .line 21
    if-gez v2, :cond_0

    .line 22
    .line 23
    invoke-direct {p0}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator$TupleIterator;->checkThreadOk()V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator$TupleIterator;->this$0:Lorg/apache/tika/pipes/pipesiterator/PipesIterator;

    .line 27
    .line 28
    invoke-static {v2}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->d(Lorg/apache/tika/pipes/pipesiterator/PipesIterator;)Ljava/util/concurrent/ArrayBlockingQueue;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 33
    .line 34
    const-wide/16 v4, 0x64

    .line 35
    .line 36
    invoke-virtual {v2, v4, v5, v3}, Ljava/util/concurrent/ArrayBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    move-object v4, v2

    .line 41
    check-cast v4, Lorg/apache/tika/pipes/FetchEmitTuple;

    .line 42
    .line 43
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 44
    .line 45
    .line 46
    move-result-wide v2
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    sub-long/2addr v2, v0

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    if-eqz v4, :cond_1

    .line 50
    .line 51
    return-object v4

    .line 52
    :cond_1
    new-instance v0, Lorg/apache/tika/exception/TikaTimeoutException;

    .line 53
    .line 54
    iget-object v1, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator$TupleIterator;->this$0:Lorg/apache/tika/pipes/pipesiterator/PipesIterator;

    .line 55
    .line 56
    invoke-static {v1}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->b(Lorg/apache/tika/pipes/pipesiterator/PipesIterator;)J

    .line 57
    .line 58
    .line 59
    move-result-wide v1

    .line 60
    const-string v3, "waited longer than "

    .line 61
    .line 62
    const-string v4, "ms for the next tuple"

    .line 63
    .line 64
    invoke-static {v1, v2, v3, v4}, Lcb/a;->h(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-direct {v0, v1}, Lorg/apache/tika/exception/TikaTimeoutException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v0

    .line 72
    :catch_0
    invoke-static {}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->h()Lvg/b;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v1, "interrupted"

    .line 77
    .line 78
    invoke-interface {v0, v1}, Lvg/b;->warn(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    sget-object v0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->COMPLETED_SEMAPHORE:Lorg/apache/tika/pipes/FetchEmitTuple;

    .line 82
    .line 83
    return-object v0
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator$TupleIterator;->next:Lorg/apache/tika/pipes/FetchEmitTuple;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator$TupleIterator;->pollNext()Lorg/apache/tika/pipes/FetchEmitTuple;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator$TupleIterator;->next:Lorg/apache/tika/pipes/FetchEmitTuple;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator$TupleIterator;->next:Lorg/apache/tika/pipes/FetchEmitTuple;

    .line 12
    .line 13
    sget-object v1, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->COMPLETED_SEMAPHORE:Lorg/apache/tika/pipes/FetchEmitTuple;

    .line 14
    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator$TupleIterator;->next()Lorg/apache/tika/pipes/FetchEmitTuple;

    move-result-object v0

    return-object v0
.end method

.method public next()Lorg/apache/tika/pipes/FetchEmitTuple;
    .locals 2

    .line 2
    iget-object v0, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator$TupleIterator;->next:Lorg/apache/tika/pipes/FetchEmitTuple;

    sget-object v1, Lorg/apache/tika/pipes/pipesiterator/PipesIterator;->COMPLETED_SEMAPHORE:Lorg/apache/tika/pipes/FetchEmitTuple;

    if-eq v0, v1, :cond_0

    .line 3
    invoke-direct {p0}, Lorg/apache/tika/pipes/pipesiterator/PipesIterator$TupleIterator;->pollNext()Lorg/apache/tika/pipes/FetchEmitTuple;

    move-result-object v1

    iput-object v1, p0, Lorg/apache/tika/pipes/pipesiterator/PipesIterator$TupleIterator;->next:Lorg/apache/tika/pipes/FetchEmitTuple;

    return-object v0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "don\'t call next() after hasNext() has returned false!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
