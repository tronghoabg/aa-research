.class public abstract LEf/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements LEf/U;


# instance fields
.field private volatile _heap:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public a:J

.field public b:I


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, LEf/Z;->a:J

    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    iput p1, p0, LEf/Z;->b:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final b()LJf/w;
    .locals 2

    .line 1
    iget-object v0, p0, LEf/Z;->_heap:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, LJf/w;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, LJf/w;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final c(JLEf/a0;LEf/b0;)I
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LEf/Z;->_heap:Ljava/lang/Object;

    .line 3
    .line 4
    sget-object v1, LEf/H;->b:LH6/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    const/4 p1, 0x2

    .line 10
    return p1

    .line 11
    :cond_0
    :try_start_1
    monitor-enter p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    :try_start_2
    iget-object v0, p3, LJf/w;->a:[LEf/Z;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    aget-object v0, v0, v1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_0
    sget-object v2, LEf/b0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 22
    .line 23
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    sget-object v2, LEf/b0;->h:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 27
    .line 28
    invoke-virtual {v2, p4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 29
    .line 30
    .line 31
    move-result p4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 32
    const/4 v2, 0x1

    .line 33
    if-ne p4, v2, :cond_2

    .line 34
    .line 35
    move p4, v2

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move p4, v1

    .line 38
    :goto_1
    if-eqz p4, :cond_3

    .line 39
    .line 40
    :try_start_3
    monitor-exit p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 41
    monitor-exit p0

    .line 42
    return v2

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_5

    .line 45
    :cond_3
    const-wide/16 v2, 0x0

    .line 46
    .line 47
    if-nez v0, :cond_4

    .line 48
    .line 49
    :try_start_4
    iput-wide p1, p3, LEf/a0;->c:J

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :catchall_1
    move-exception p1

    .line 53
    goto :goto_4

    .line 54
    :cond_4
    iget-wide v4, v0, LEf/Z;->a:J

    .line 55
    .line 56
    sub-long v6, v4, p1

    .line 57
    .line 58
    cmp-long p4, v6, v2

    .line 59
    .line 60
    if-ltz p4, :cond_5

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_5
    move-wide p1, v4

    .line 64
    :goto_2
    iget-wide v4, p3, LEf/a0;->c:J

    .line 65
    .line 66
    sub-long v4, p1, v4

    .line 67
    .line 68
    cmp-long p4, v4, v2

    .line 69
    .line 70
    if-lez p4, :cond_6

    .line 71
    .line 72
    iput-wide p1, p3, LEf/a0;->c:J

    .line 73
    .line 74
    :cond_6
    :goto_3
    iget-wide p1, p0, LEf/Z;->a:J

    .line 75
    .line 76
    iget-wide v4, p3, LEf/a0;->c:J

    .line 77
    .line 78
    sub-long/2addr p1, v4

    .line 79
    cmp-long p1, p1, v2

    .line 80
    .line 81
    if-gez p1, :cond_7

    .line 82
    .line 83
    iput-wide v4, p0, LEf/Z;->a:J

    .line 84
    .line 85
    :cond_7
    invoke-virtual {p3, p0}, LJf/w;->a(LEf/Z;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 86
    .line 87
    .line 88
    :try_start_5
    monitor-exit p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 89
    monitor-exit p0

    .line 90
    return v1

    .line 91
    :goto_4
    :try_start_6
    monitor-exit p3

    .line 92
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 93
    :goto_5
    monitor-exit p0

    .line 94
    throw p1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    .line 1
    check-cast p1, LEf/Z;

    .line 2
    .line 3
    iget-wide v0, p0, LEf/Z;->a:J

    .line 4
    .line 5
    iget-wide v2, p1, LEf/Z;->a:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long p1, v0, v2

    .line 11
    .line 12
    if-lez p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :cond_0
    if-gez p1, :cond_1

    .line 17
    .line 18
    const/4 p1, -0x1

    .line 19
    return p1

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    return p1
.end method

.method public final d(LEf/a0;)V
    .locals 2

    .line 1
    iget-object v0, p0, LEf/Z;->_heap:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, LEf/H;->b:LH6/g;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, LEf/Z;->_heap:Ljava/lang/Object;

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    const-string v0, "Failed requirement."

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1
.end method

.method public final dispose()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LEf/Z;->_heap:Ljava/lang/Object;

    .line 3
    .line 4
    sget-object v1, LEf/H;->b:LH6/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_1
    instance-of v2, v0, LEf/a0;

    .line 11
    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    check-cast v0, LEf/a0;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    :goto_0
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0, p0}, LJf/w;->b(LEf/Z;)V

    .line 23
    .line 24
    .line 25
    :cond_2
    iput-object v1, p0, LEf/Z;->_heap:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    .line 27
    monitor-exit p0

    .line 28
    return-void

    .line 29
    :goto_1
    monitor-exit p0

    .line 30
    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Delayed[nanos="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, LEf/Z;->a:J

    .line 9
    .line 10
    const/16 v3, 0x5d

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, LA/f;->e(Ljava/lang/StringBuilder;JC)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method
