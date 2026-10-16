.class public Lorg/apache/tika/pipes/async/AsyncStatus;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;
    }
.end annotation


# instance fields
.field private asyncStatus:Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;

.field private crashMessage:Ljava/lang/String;

.field private lastUpdate:Lj$/time/Instant;

.field private final started:Lj$/time/Instant;

.field private statusCounts:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lorg/apache/tika/pipes/PipesResult$STATUS;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private totalCountResult:Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    sget-object v3, Lorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;->NOT_COMPLETED:Lorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;

    .line 9
    .line 10
    invoke-direct {v0, v1, v2, v3}, Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;-><init>(JLorg/apache/tika/pipes/pipesiterator/TotalCountResult$STATUS;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->totalCountResult:Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;

    .line 14
    .line 15
    new-instance v0, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->statusCounts:Ljava/util/Map;

    .line 21
    .line 22
    sget-object v0, Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;->STARTED:Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;

    .line 23
    .line 24
    iput-object v0, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->asyncStatus:Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;

    .line 25
    .line 26
    const-string v0, ""

    .line 27
    .line 28
    iput-object v0, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->crashMessage:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {}, Lj$/time/Instant;->now()Lj$/time/Instant;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->started:Lj$/time/Instant;

    .line 35
    .line 36
    iput-object v0, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->lastUpdate:Lj$/time/Instant;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public getAsyncStatus()Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->asyncStatus:Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCrashMessage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->crashMessage:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLastUpdate()Lj$/time/Instant;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->lastUpdate:Lj$/time/Instant;

    .line 2
    .line 3
    return-object v0
.end method

.method public getStarted()Lj$/time/Instant;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->started:Lj$/time/Instant;

    .line 2
    .line 3
    return-object v0
.end method

.method public getStatusCounts()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lorg/apache/tika/pipes/PipesResult$STATUS;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->statusCounts:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTotalCountResult()Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->totalCountResult:Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->started:Lj$/time/Instant;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->lastUpdate:Lj$/time/Instant;

    .line 4
    .line 5
    iget-object v2, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->totalCountResult:Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;

    .line 6
    .line 7
    iget-object v3, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->statusCounts:Ljava/util/Map;

    .line 8
    .line 9
    iget-object v4, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->asyncStatus:Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;

    .line 10
    .line 11
    iget-object v5, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->crashMessage:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v6, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v7, "AsyncStatus{started="

    .line 16
    .line 17
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, ", lastUpdate="

    .line 24
    .line 25
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v0, ", totalCountResult="

    .line 32
    .line 33
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v0, ", statusCounts="

    .line 40
    .line 41
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, ", asyncStatus="

    .line 48
    .line 49
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v0, ", crashMessage=\'"

    .line 56
    .line 57
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, "\'}"

    .line 64
    .line 65
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0
.end method

.method public declared-synchronized update(Ljava/util/Map;Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lorg/apache/tika/pipes/PipesResult$STATUS;",
            "Ljava/lang/Long;",
            ">;",
            "Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;",
            "Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;",
            ")V"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {}, Lj$/time/Instant;->now()Lj$/time/Instant;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iput-object v0, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->lastUpdate:Lj$/time/Instant;

    .line 7
    .line 8
    iput-object p1, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->statusCounts:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p2, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->totalCountResult:Lorg/apache/tika/pipes/pipesiterator/TotalCountResult;

    .line 11
    .line 12
    iput-object p3, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->asyncStatus:Lorg/apache/tika/pipes/async/AsyncStatus$ASYNC_STATUS;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw p1
.end method

.method public updateCrash(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/pipes/async/AsyncStatus;->crashMessage:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
