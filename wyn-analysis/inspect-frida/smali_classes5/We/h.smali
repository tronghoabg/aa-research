.class public final LWe/h;
.super LHe/m;
.source "SourceFile"


# static fields
.field public static final b:LWe/l;

.field public static final c:LWe/l;

.field public static final d:Ljava/util/concurrent/TimeUnit;

.field public static final e:LWe/g;

.field public static final f:LWe/e;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    sput-object v0, LWe/h;->d:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    new-instance v0, LWe/g;

    .line 6
    .line 7
    new-instance v1, LWe/l;

    .line 8
    .line 9
    const-string v2, "RxCachedThreadSchedulerShutdown"

    .line 10
    .line 11
    invoke-direct {v1, v2}, LWe/l;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, LWe/g;-><init>(LWe/l;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LWe/h;->e:LWe/g;

    .line 18
    .line 19
    invoke-virtual {v0}, LWe/j;->dispose()V

    .line 20
    .line 21
    .line 22
    const-string v0, "rx2.io-priority"

    .line 23
    .line 24
    const/4 v1, 0x5

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/16 v1, 0xa

    .line 34
    .line 35
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v1, 0x1

    .line 40
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    new-instance v2, LWe/l;

    .line 45
    .line 46
    const-string v3, "RxCachedThreadScheduler"

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    invoke-direct {v2, v3, v0, v4}, LWe/l;-><init>(Ljava/lang/String;IZ)V

    .line 50
    .line 51
    .line 52
    sput-object v2, LWe/h;->b:LWe/l;

    .line 53
    .line 54
    new-instance v3, LWe/l;

    .line 55
    .line 56
    const-string v5, "RxCachedWorkerPoolEvictor"

    .line 57
    .line 58
    invoke-direct {v3, v5, v0, v4}, LWe/l;-><init>(Ljava/lang/String;IZ)V

    .line 59
    .line 60
    .line 61
    sput-object v3, LWe/h;->c:LWe/l;

    .line 62
    .line 63
    new-instance v0, LWe/e;

    .line 64
    .line 65
    const-wide/16 v3, 0x0

    .line 66
    .line 67
    const/4 v5, 0x0

    .line 68
    invoke-direct {v0, v3, v4, v5, v2}, LWe/e;-><init>(JLjava/util/concurrent/TimeUnit;LWe/l;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, LWe/h;->f:LWe/e;

    .line 72
    .line 73
    iget-object v2, v0, LWe/e;->c:LJe/a;

    .line 74
    .line 75
    invoke-virtual {v2}, LJe/a;->dispose()V

    .line 76
    .line 77
    .line 78
    iget-object v2, v0, LWe/e;->e:Ljava/util/concurrent/ScheduledFuture;

    .line 79
    .line 80
    if-eqz v2, :cond_0

    .line 81
    .line 82
    invoke-interface {v2, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 83
    .line 84
    .line 85
    :cond_0
    iget-object v0, v0, LWe/e;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 86
    .line 87
    if-eqz v0, :cond_1

    .line 88
    .line 89
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    :cond_1
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LWe/h;->b:LWe/l;

    .line 5
    .line 6
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    sget-object v2, LWe/h;->f:LWe/e;

    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, LWe/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    new-instance v1, LWe/e;

    .line 16
    .line 17
    sget-object v3, LWe/h;->d:Ljava/util/concurrent/TimeUnit;

    .line 18
    .line 19
    const-wide/16 v4, 0x3c

    .line 20
    .line 21
    invoke-direct {v1, v4, v5, v3, v0}, LWe/e;-><init>(JLjava/util/concurrent/TimeUnit;LWe/l;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, LWe/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 25
    .line 26
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eq v0, v2, :cond_0

    .line 38
    .line 39
    iget-object v0, v1, LWe/e;->c:LJe/a;

    .line 40
    .line 41
    invoke-virtual {v0}, LJe/a;->dispose()V

    .line 42
    .line 43
    .line 44
    iget-object v0, v1, LWe/e;->e:Ljava/util/concurrent/ScheduledFuture;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-interface {v0, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 50
    .line 51
    .line 52
    :cond_2
    iget-object v0, v1, LWe/e;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public final a()LHe/l;
    .locals 2

    .line 1
    new-instance v0, LWe/f;

    .line 2
    .line 3
    iget-object v1, p0, LWe/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, LWe/e;

    .line 10
    .line 11
    invoke-direct {v0, v1}, LWe/f;-><init>(LWe/e;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
