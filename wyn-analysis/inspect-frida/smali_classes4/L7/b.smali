.class public final LL7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LL7/b;->a:I

    iput-object p2, p0, LL7/b;->b:Ljava/lang/Object;

    iput-object p3, p0, LL7/b;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;Landroid/view/View;Z)V
    .locals 0

    const/4 p3, 0x0

    iput p3, p0, LL7/b;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL7/b;->c:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, LL7/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, LL7/b;->a:I

    iput-object p1, p0, LL7/b;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, LL7/b;->a:I

    iput-object p1, p0, LL7/b;->c:Ljava/lang/Object;

    iput-object p3, p0, LL7/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 4

    .line 1
    iget-object v0, p0, LL7/b;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LR3/a;

    .line 4
    .line 5
    iget-object v0, v0, LR3/a;->b:LK3/q;

    .line 6
    .line 7
    iget-object v0, v0, LK3/q;->f:LK3/f;

    .line 8
    .line 9
    iget-object v1, p0, LL7/b;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, LK3/f;->b(Ljava/lang/String;)LS3/p;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, LS3/p;->b()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, LL7/b;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, LR3/a;

    .line 28
    .line 29
    iget-object v1, v1, LR3/a;->d:Ljava/lang/Object;

    .line 30
    .line 31
    monitor-enter v1

    .line 32
    :try_start_0
    iget-object v2, p0, LL7/b;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, LR3/a;

    .line 35
    .line 36
    iget-object v2, v2, LR3/a;->g:Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-static {v0}, LFe/c;->s(LS3/p;)LS3/j;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, LL7/b;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, LR3/a;

    .line 48
    .line 49
    iget-object v2, v2, LR3/a;->h:Ljava/util/HashSet;

    .line 50
    .line 51
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, LL7/b;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, LR3/a;

    .line 57
    .line 58
    iget-object v2, v0, LR3/a;->i:Lb7/k;

    .line 59
    .line 60
    iget-object v0, v0, LR3/a;->h:Ljava/util/HashSet;

    .line 61
    .line 62
    invoke-virtual {v2, v0}, Lb7/k;->F(Ljava/lang/Iterable;)V

    .line 63
    .line 64
    .line 65
    monitor-exit v1

    .line 66
    return-void

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    throw v0

    .line 70
    :cond_0
    return-void
.end method

.method private final b()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, LL7/b;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Runnable;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LL7/b;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LT3/m;

    .line 11
    .line 12
    iget-object v0, v0, LT3/m;->b:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_1
    iget-object v1, p0, LL7/b;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, LT3/m;

    .line 18
    .line 19
    invoke-virtual {v1}, LT3/m;->e()V

    .line 20
    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception v1

    .line 25
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw v1

    .line 27
    :catchall_1
    move-exception v0

    .line 28
    iget-object v1, p0, LL7/b;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, LT3/m;

    .line 31
    .line 32
    iget-object v1, v1, LT3/m;->b:Ljava/lang/Object;

    .line 33
    .line 34
    monitor-enter v1

    .line 35
    :try_start_2
    iget-object v2, p0, LL7/b;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, LT3/m;

    .line 38
    .line 39
    invoke-virtual {v2}, LT3/m;->e()V

    .line 40
    .line 41
    .line 42
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 43
    throw v0

    .line 44
    :catchall_2
    move-exception v0

    .line 45
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 46
    throw v0
.end method

.method private final c()V
    .locals 4

    .line 1
    iget-object v0, p0, LL7/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc7/j;

    .line 4
    .line 5
    iget-object v1, p0, LL7/b;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/os/IBinder;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    :try_start_0
    const-string v1, "Null service connection"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lc7/j;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    :try_start_1
    new-instance v2, LY2/B;

    .line 22
    .line 23
    invoke-direct {v2, v1}, LY2/B;-><init>(Landroid/os/IBinder;)V

    .line 24
    .line 25
    .line 26
    iput-object v2, v0, Lc7/j;->c:LY2/B;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    :try_start_2
    iput v1, v0, Lc7/j;->a:I

    .line 30
    .line 31
    iget-object v1, v0, Lc7/j;->f:Lc7/l;

    .line 32
    .line 33
    iget-object v1, v1, Lc7/l;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    .line 36
    .line 37
    new-instance v2, Lc7/i;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-direct {v2, v0, v3}, Lc7/i;-><init>(Lc7/j;I)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 44
    .line 45
    .line 46
    monitor-exit v0

    .line 47
    return-void

    .line 48
    :catch_0
    move-exception v1

    .line 49
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, v1}, Lc7/j;->a(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    monitor-exit v0

    .line 57
    return-void

    .line 58
    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    throw v1
.end method

.method private final d()V
    .locals 5

    .line 1
    iget-object v0, p0, LL7/b;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc7/j;

    .line 4
    .line 5
    iget-object v1, p0, LL7/b;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lc7/k;

    .line 8
    .line 9
    iget v1, v1, Lc7/k;->a:I

    .line 10
    .line 11
    const-string v2, "Timing out request: "

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    iget-object v3, v0, Lc7/j;->e:Landroid/util/SparseArray;

    .line 15
    .line 16
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Lc7/k;

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    new-instance v4, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v4, "MessengerIpcClient"

    .line 37
    .line 38
    invoke-static {v4, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    iget-object v2, v0, Lc7/j;->e:Landroid/util/SparseArray;

    .line 42
    .line 43
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->remove(I)V

    .line 44
    .line 45
    .line 46
    const-string v1, "Timed out waiting for response"

    .line 47
    .line 48
    new-instance v2, LYa/a;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-direct {v2, v1, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v2}, Lc7/k;->b(LYa/a;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lc7/j;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-void

    .line 62
    :catchall_0
    move-exception v1

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    monitor-exit v0

    .line 65
    return-void

    .line 66
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    throw v1
.end method


# virtual methods
.method public e()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    :try_start_0
    iget-object v2, p0, LL7/b;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, LM8/j;

    .line 6
    .line 7
    iget-object v2, v2, LM8/j;->b:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    const/4 v3, 0x1

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    :try_start_1
    iget-object v0, p0, LL7/b;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, LM8/j;

    .line 16
    .line 17
    iget v4, v0, LM8/j;->c:I

    .line 18
    .line 19
    const/4 v5, 0x4

    .line 20
    if-ne v4, v5, :cond_0

    .line 21
    .line 22
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto :goto_5

    .line 35
    :cond_0
    :try_start_2
    iget-wide v6, v0, LM8/j;->d:J

    .line 36
    .line 37
    const-wide/16 v8, 0x1

    .line 38
    .line 39
    add-long/2addr v6, v8

    .line 40
    iput-wide v6, v0, LM8/j;->d:J

    .line 41
    .line 42
    iput v5, v0, LM8/j;->c:I

    .line 43
    .line 44
    move v0, v3

    .line 45
    :cond_1
    iget-object v4, p0, LL7/b;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, LM8/j;

    .line 48
    .line 49
    iget-object v4, v4, LM8/j;->b:Ljava/util/ArrayDeque;

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ljava/lang/Runnable;

    .line 56
    .line 57
    iput-object v4, p0, LL7/b;->b:Ljava/lang/Object;

    .line 58
    .line 59
    if-nez v4, :cond_3

    .line 60
    .line 61
    iget-object v0, p0, LL7/b;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, LM8/j;

    .line 64
    .line 65
    iput v3, v0, LM8/j;->c:I

    .line 66
    .line 67
    monitor-exit v2

    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    :goto_2
    return-void

    .line 72
    :cond_3
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 73
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 74
    .line 75
    .line 76
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 77
    or-int/2addr v1, v2

    .line 78
    const/4 v2, 0x0

    .line 79
    :try_start_4
    iget-object v3, p0, LL7/b;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v3, Ljava/lang/Runnable;

    .line 82
    .line 83
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 84
    .line 85
    .line 86
    :goto_3
    :try_start_5
    iput-object v2, p0, LL7/b;->b:Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catchall_1
    move-exception v0

    .line 90
    goto :goto_6

    .line 91
    :catchall_2
    move-exception v0

    .line 92
    goto :goto_4

    .line 93
    :catch_0
    move-exception v3

    .line 94
    :try_start_6
    sget-object v4, LM8/j;->f:Ljava/util/logging/Logger;

    .line 95
    .line 96
    sget-object v5, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    .line 97
    .line 98
    new-instance v6, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v7, "Exception while executing runnable "

    .line 104
    .line 105
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v7, p0, LL7/b;->b:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v7, Ljava/lang/Runnable;

    .line 111
    .line 112
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    invoke-virtual {v4, v5, v6, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :goto_4
    :try_start_7
    iput-object v2, p0, LL7/b;->b:Ljava/lang/Object;

    .line 124
    .line 125
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 126
    :goto_5
    :try_start_8
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 127
    :try_start_9
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 128
    :goto_6
    if-eqz v1, :cond_4

    .line 129
    .line 130
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 135
    .line 136
    .line 137
    :cond_4
    throw v0
.end method

.method public final run()V
    .locals 10

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x1

    .line 5
    iget v4, p0, LL7/b;->a:I

    .line 6
    .line 7
    packed-switch v4, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LL7/b;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljava/lang/ref/ReferenceQueue;

    .line 13
    .line 14
    :catch_0
    :goto_0
    iget-object v1, p0, LL7/b;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ljava/util/Set;

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/ref/ReferenceQueue;->remove()Ljava/lang/ref/Reference;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lya/l;

    .line 29
    .line 30
    iget-object v2, v1, Lya/l;->a:Ljava/util/Set;

    .line 31
    .line 32
    invoke-interface {v2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->clear()V

    .line 40
    .line 41
    .line 42
    iget-object v1, v1, Lya/l;->b:LA7/z;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void

    .line 49
    :pswitch_0
    iget-object v0, p0, LL7/b;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Ly6/b;

    .line 52
    .line 53
    iget-object v1, p0, LL7/b;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Ly6/c;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    :try_start_1
    iget-object v2, v1, Lx6/j;->a:LD6/S0;

    .line 61
    .line 62
    iget-object v0, v0, Lx6/g;->a:LD6/Q0;

    .line 63
    .line 64
    invoke-virtual {v2, v0}, LD6/S0;->b(LD6/Q0;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catch_1
    move-exception v0

    .line 69
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzcaf;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcah;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const-string v2, "AdManagerAdView.loadAd"

    .line 78
    .line 79
    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzcah;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :goto_1
    return-void

    .line 83
    :pswitch_1
    iget-object v0, p0, LL7/b;->c:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Lx6/g;

    .line 86
    .line 87
    iget-object v1, p0, LL7/b;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v1, Lx6/j;

    .line 90
    .line 91
    :try_start_2
    iget-object v2, v1, Lx6/j;->a:LD6/S0;

    .line 92
    .line 93
    iget-object v0, v0, Lx6/g;->a:LD6/Q0;

    .line 94
    .line 95
    invoke-virtual {v2, v0}, LD6/S0;->b(LD6/Q0;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :catch_2
    move-exception v0

    .line 100
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzcaf;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcah;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    const-string v2, "BaseAdView.loadAd"

    .line 109
    .line 110
    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzcah;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :goto_2
    return-void

    .line 114
    :pswitch_2
    iget-object v0, p0, LL7/b;->c:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, LD6/Q0;

    .line 117
    .line 118
    iget-object v1, p0, LL7/b;->b:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v1, Lx6/f;

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    :try_start_3
    iget-object v2, v1, Lx6/f;->b:LD6/E;

    .line 126
    .line 127
    iget-object v1, v1, Lx6/f;->a:Landroid/content/Context;

    .line 128
    .line 129
    invoke-static {v1, v0}, LD6/w1;->a(Landroid/content/Context;LD6/Q0;)LD6/v1;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-interface {v2, v0}, LD6/E;->zze(LD6/v1;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_3

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :catch_3
    move-exception v0

    .line 138
    const-string v1, "Failed to load ad."

    .line 139
    .line 140
    invoke-static {v1, v0}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    :goto_3
    return-void

    .line 144
    :pswitch_3
    iget-object v0, p0, LL7/b;->c:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, Ljava/lang/Integer;

    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    iget-object v1, p0, LL7/b;->b:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v1, Lr4/f;

    .line 155
    .line 156
    invoke-static {v1, v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->i(Lr4/f;I)V

    .line 157
    .line 158
    .line 159
    sget-object v0, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->l:Ls4/a;

    .line 160
    .line 161
    if-eqz v0, :cond_2

    .line 162
    .line 163
    :try_start_4
    iget-object v0, v0, Ls4/a;->a:Ls4/b;

    .line 164
    .line 165
    invoke-virtual {v0, v1}, Ls4/b;->b(Lr4/a;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 166
    .line 167
    .line 168
    goto :goto_4

    .line 169
    :catch_4
    move-exception v0

    .line 170
    invoke-static {v0}, Lu4/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    const-string v1, "Exception thrown inside global complete callback."

    .line 175
    .line 176
    const-string v2, "ffmpeg-kit"

    .line 177
    .line 178
    invoke-static {v1, v0, v2}, Lcb/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    :cond_2
    :goto_4
    return-void

    .line 182
    :pswitch_4
    iget-object v0, p0, LL7/b;->b:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v0, Lp8/p;

    .line 185
    .line 186
    instance-of v4, v0, Lq8/a;

    .line 187
    .line 188
    iget-object v5, p0, LL7/b;->c:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v5, LS3/e;

    .line 191
    .line 192
    if-eqz v4, :cond_4

    .line 193
    .line 194
    move-object v4, v0

    .line 195
    check-cast v4, Lq8/a;

    .line 196
    .line 197
    check-cast v4, Lp8/m;

    .line 198
    .line 199
    instance-of v6, v4, Lp8/f;

    .line 200
    .line 201
    if-eqz v6, :cond_3

    .line 202
    .line 203
    iget-object v4, v4, Lp8/m;->a:Ljava/lang/Object;

    .line 204
    .line 205
    instance-of v6, v4, Lp8/b;

    .line 206
    .line 207
    if-eqz v6, :cond_3

    .line 208
    .line 209
    check-cast v4, Lp8/b;

    .line 210
    .line 211
    iget-object v4, v4, Lp8/b;->a:Ljava/lang/Throwable;

    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_3
    move-object v4, v1

    .line 215
    :goto_5
    if-eqz v4, :cond_4

    .line 216
    .line 217
    invoke-virtual {v5, v4}, LS3/e;->u(Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_4
    :try_start_5
    invoke-static {v0}, Lka/e0;->p(Lp8/p;)V
    :try_end_5
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 222
    .line 223
    .line 224
    iget-object v0, v5, LS3/e;->c:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v0, LA7/P0;

    .line 227
    .line 228
    invoke-virtual {v0}, LA7/B;->c0()V

    .line 229
    .line 230
    .line 231
    iget-object v4, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v4, LA7/n0;

    .line 234
    .line 235
    iget-object v4, v4, LA7/n0;->g:LA7/e;

    .line 236
    .line 237
    sget-object v6, LA7/y;->N0:LA7/D;

    .line 238
    .line 239
    invoke-virtual {v4, v1, v6}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    iget-object v4, v5, LS3/e;->b:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v4, LA7/E1;

    .line 246
    .line 247
    if-eqz v1, :cond_5

    .line 248
    .line 249
    iget-object v1, v5, LS3/e;->c:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v1, LA7/P0;

    .line 252
    .line 253
    invoke-virtual {v1}, LA7/B0;->a0()LA7/Z;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    invoke-virtual {v6}, LA7/Z;->m0()Landroid/util/SparseArray;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    iget-object v5, v5, LS3/e;->b:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v5, LA7/E1;

    .line 264
    .line 265
    iget v7, v5, LA7/E1;->c:I

    .line 266
    .line 267
    iget-wide v8, v5, LA7/E1;->b:J

    .line 268
    .line 269
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    invoke-virtual {v6, v7, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1}, LA7/B0;->a0()LA7/Z;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-virtual {v1, v6}, LA7/Z;->h0(Landroid/util/SparseArray;)V

    .line 281
    .line 282
    .line 283
    iput-boolean v2, v0, LA7/P0;->i:Z

    .line 284
    .line 285
    iput v3, v0, LA7/P0;->j:I

    .line 286
    .line 287
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    iget-object v2, v4, LA7/E1;->a:Ljava/lang/String;

    .line 292
    .line 293
    iget-object v1, v1, LA7/N;->m:LA7/P;

    .line 294
    .line 295
    const-string v3, "Successfully registered trigger URI"

    .line 296
    .line 297
    invoke-virtual {v1, v3, v2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0}, LA7/P0;->D0()V

    .line 301
    .line 302
    .line 303
    goto :goto_6

    .line 304
    :cond_5
    iput-boolean v2, v0, LA7/P0;->i:Z

    .line 305
    .line 306
    invoke-virtual {v0}, LA7/P0;->D0()V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    iget-object v1, v4, LA7/E1;->a:Ljava/lang/String;

    .line 314
    .line 315
    iget-object v0, v0, LA7/N;->m:LA7/P;

    .line 316
    .line 317
    const-string v2, "registerTriggerAsync ran. uri"

    .line 318
    .line 319
    invoke-virtual {v0, v2, v1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    goto :goto_6

    .line 323
    :catchall_0
    move-exception v0

    .line 324
    invoke-virtual {v5, v0}, LS3/e;->u(Ljava/lang/Throwable;)V

    .line 325
    .line 326
    .line 327
    goto :goto_6

    .line 328
    :catch_5
    move-exception v0

    .line 329
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-virtual {v5, v0}, LS3/e;->u(Ljava/lang/Throwable;)V

    .line 334
    .line 335
    .line 336
    :goto_6
    return-void

    .line 337
    :pswitch_5
    iget-object v0, p0, LL7/b;->c:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v0, Lh9/c;

    .line 340
    .line 341
    iget-object v1, v0, Lh9/c;->a:Ljava/util/HashMap;

    .line 342
    .line 343
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    iget-object v3, p0, LL7/b;->b:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v3, Lob/a;

    .line 350
    .line 351
    if-lez v2, :cond_6

    .line 352
    .line 353
    new-instance v0, Lorg/json/JSONObject;

    .line 354
    .line 355
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-interface {v3, v0}, Lob/a;->onSignalsCollected(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    goto :goto_7

    .line 366
    :cond_6
    iget-object v0, v0, Lh9/c;->b:Ljava/lang/String;

    .line 367
    .line 368
    if-nez v0, :cond_7

    .line 369
    .line 370
    const-string v0, ""

    .line 371
    .line 372
    invoke-interface {v3, v0}, Lob/a;->onSignalsCollected(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    goto :goto_7

    .line 376
    :cond_7
    invoke-interface {v3, v0}, Lob/a;->onSignalsCollectionFailed(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    :goto_7
    return-void

    .line 380
    :pswitch_6
    iget-object v0, p0, LL7/b;->c:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v0, Lnd/b;

    .line 383
    .line 384
    iget-object v0, v0, Lnd/b;->b:Landroid/content/Context;

    .line 385
    .line 386
    iget-object v1, p0, LL7/b;->b:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v1, Lnd/a;

    .line 389
    .line 390
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 391
    .line 392
    .line 393
    return-void

    .line 394
    :pswitch_7
    iget-object v0, p0, LL7/b;->c:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v0, Lnd/b;

    .line 397
    .line 398
    iget-object v0, v0, Lnd/b;->c:Landroid/net/ConnectivityManager;

    .line 399
    .line 400
    iget-object v1, p0, LL7/b;->b:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v1, LQ3/h;

    .line 403
    .line 404
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 405
    .line 406
    .line 407
    return-void

    .line 408
    :pswitch_8
    iget-object v0, p0, LL7/b;->b:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v0, Ll4/g;

    .line 411
    .line 412
    iget-object v1, v0, Ll4/g;->g:Landroid/widget/EditText;

    .line 413
    .line 414
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 415
    .line 416
    .line 417
    iget-object v1, p0, LL7/b;->c:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v1, Ll4/e;

    .line 420
    .line 421
    iget-object v1, v1, Ll4/e;->a:Landroid/content/Context;

    .line 422
    .line 423
    const-string v2, "input_method"

    .line 424
    .line 425
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 430
    .line 431
    if-eqz v1, :cond_8

    .line 432
    .line 433
    iget-object v0, v0, Ll4/g;->g:Landroid/widget/EditText;

    .line 434
    .line 435
    invoke-virtual {v1, v0, v3}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 436
    .line 437
    .line 438
    :cond_8
    return-void

    .line 439
    :pswitch_9
    iget-object v0, p0, LL7/b;->b:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast v0, Lh1/f;

    .line 442
    .line 443
    iget-object v1, p0, LL7/b;->c:Ljava/lang/Object;

    .line 444
    .line 445
    invoke-virtual {v0, v1}, Lh1/f;->accept(Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    return-void

    .line 449
    :pswitch_a
    iget-object v0, p0, LL7/b;->b:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v0, La2/v;

    .line 452
    .line 453
    iget-object v0, v0, La2/v;->b:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v0, La1/b;

    .line 456
    .line 457
    if-eqz v0, :cond_9

    .line 458
    .line 459
    iget-object v1, p0, LL7/b;->c:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v1, Landroid/graphics/Typeface;

    .line 462
    .line 463
    invoke-virtual {v0, v1}, La1/b;->k(Landroid/graphics/Typeface;)V

    .line 464
    .line 465
    .line 466
    :cond_9
    return-void

    .line 467
    :pswitch_b
    iget-object v0, p0, LL7/b;->c:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast v0, LWa/h;

    .line 470
    .line 471
    iget-object v0, v0, LWa/h;->c:Ltc/g;

    .line 472
    .line 473
    iget-object v1, p0, LL7/b;->b:Ljava/lang/Object;

    .line 474
    .line 475
    invoke-virtual {v0, v1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    return-void

    .line 479
    :pswitch_c
    iget-object v0, p0, LL7/b;->c:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast v0, LCa/d;

    .line 482
    .line 483
    iget-object v0, v0, LCa/d;->c:Ljava/lang/Object;

    .line 484
    .line 485
    check-cast v0, Lnb/a;

    .line 486
    .line 487
    iget-object v1, p0, LL7/b;->b:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast v1, Landroid/app/Activity;

    .line 490
    .line 491
    invoke-interface {v0, v1}, Lnb/a;->a(Landroid/app/Activity;)V

    .line 492
    .line 493
    .line 494
    return-void

    .line 495
    :pswitch_d
    invoke-direct {p0}, LL7/b;->d()V

    .line 496
    .line 497
    .line 498
    return-void

    .line 499
    :pswitch_e
    invoke-direct {p0}, LL7/b;->c()V

    .line 500
    .line 501
    .line 502
    return-void

    .line 503
    :pswitch_f
    iget-object v0, p0, LL7/b;->c:Ljava/lang/Object;

    .line 504
    .line 505
    check-cast v0, Lad/W;

    .line 506
    .line 507
    iget-object v1, p0, LL7/b;->b:Ljava/lang/Object;

    .line 508
    .line 509
    check-cast v1, Landroid/content/Context;

    .line 510
    .line 511
    invoke-static {v1, v0}, Lcom/google/android/gms/ads/MobileAds;->initialize(Landroid/content/Context;Lcom/google/android/gms/ads/initialization/OnInitializationCompleteListener;)V

    .line 512
    .line 513
    .line 514
    return-void

    .line 515
    :pswitch_10
    iget-object v0, p0, LL7/b;->c:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast v0, LG9/e;

    .line 518
    .line 519
    iget-object v0, v0, LG9/e;->d:Ljava/lang/Object;

    .line 520
    .line 521
    check-cast v0, Luc/r;

    .line 522
    .line 523
    iget-object v2, p0, LL7/b;->b:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast v2, Ljava/util/HashMap;

    .line 526
    .line 527
    const-string v3, "onAdEvent"

    .line 528
    .line 529
    invoke-virtual {v0, v3, v2, v1}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 530
    .line 531
    .line 532
    return-void

    .line 533
    :pswitch_11
    :try_start_6
    sget-object v1, LX0/d;->d:Ljava/lang/reflect/Method;
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 534
    .line 535
    iget-object v4, p0, LL7/b;->c:Ljava/lang/Object;

    .line 536
    .line 537
    iget-object v5, p0, LL7/b;->b:Ljava/lang/Object;

    .line 538
    .line 539
    if-eqz v1, :cond_a

    .line 540
    .line 541
    const/4 v6, 0x3

    .line 542
    :try_start_7
    new-array v6, v6, [Ljava/lang/Object;

    .line 543
    .line 544
    aput-object v4, v6, v2

    .line 545
    .line 546
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 547
    .line 548
    aput-object v2, v6, v3

    .line 549
    .line 550
    const-string v2, "AppCompat recreation"

    .line 551
    .line 552
    aput-object v2, v6, v0

    .line 553
    .line 554
    invoke-virtual {v1, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    goto :goto_a

    .line 558
    :catchall_1
    move-exception v0

    .line 559
    goto :goto_8

    .line 560
    :catch_6
    move-exception v0

    .line 561
    goto :goto_9

    .line 562
    :cond_a
    sget-object v1, LX0/d;->e:Ljava/lang/reflect/Method;

    .line 563
    .line 564
    new-array v0, v0, [Ljava/lang/Object;

    .line 565
    .line 566
    aput-object v4, v0, v2

    .line 567
    .line 568
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 569
    .line 570
    aput-object v2, v0, v3

    .line 571
    .line 572
    invoke-virtual {v1, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_6
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 573
    .line 574
    .line 575
    goto :goto_a

    .line 576
    :goto_8
    const-string v1, "ActivityRecreator"

    .line 577
    .line 578
    const-string v2, "Exception while invoking performStopActivity"

    .line 579
    .line 580
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 581
    .line 582
    .line 583
    goto :goto_a

    .line 584
    :goto_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    const-class v2, Ljava/lang/RuntimeException;

    .line 589
    .line 590
    if-ne v1, v2, :cond_c

    .line 591
    .line 592
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    if-eqz v1, :cond_c

    .line 597
    .line 598
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    const-string v2, "Unable to stop"

    .line 603
    .line 604
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 605
    .line 606
    .line 607
    move-result v1

    .line 608
    if-nez v1, :cond_b

    .line 609
    .line 610
    goto :goto_a

    .line 611
    :cond_b
    throw v0

    .line 612
    :cond_c
    :goto_a
    return-void

    .line 613
    :pswitch_12
    iget-object v0, p0, LL7/b;->b:Ljava/lang/Object;

    .line 614
    .line 615
    check-cast v0, Landroid/app/Application;

    .line 616
    .line 617
    iget-object v1, p0, LL7/b;->c:Ljava/lang/Object;

    .line 618
    .line 619
    check-cast v1, LX0/c;

    .line 620
    .line 621
    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 622
    .line 623
    .line 624
    return-void

    .line 625
    :pswitch_13
    iget-object v0, p0, LL7/b;->b:Ljava/lang/Object;

    .line 626
    .line 627
    check-cast v0, LX0/c;

    .line 628
    .line 629
    iget-object v1, p0, LL7/b;->c:Ljava/lang/Object;

    .line 630
    .line 631
    iput-object v1, v0, LX0/c;->a:Ljava/lang/Object;

    .line 632
    .line 633
    return-void

    .line 634
    :pswitch_14
    const-string v0, "Updating notification for "

    .line 635
    .line 636
    const-string v1, "Worker was marked important ("

    .line 637
    .line 638
    iget-object v2, p0, LL7/b;->c:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast v2, LT3/s;

    .line 641
    .line 642
    iget-object v2, v2, LT3/s;->a:LU3/j;

    .line 643
    .line 644
    iget-object v2, v2, LU3/h;->a:Ljava/lang/Object;

    .line 645
    .line 646
    instance-of v2, v2, LU3/a;

    .line 647
    .line 648
    if-eqz v2, :cond_d

    .line 649
    .line 650
    goto/16 :goto_c

    .line 651
    .line 652
    :cond_d
    :try_start_8
    iget-object v2, p0, LL7/b;->b:Ljava/lang/Object;

    .line 653
    .line 654
    check-cast v2, LU3/j;

    .line 655
    .line 656
    invoke-virtual {v2}, LU3/h;->get()Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v2

    .line 660
    move-object v7, v2

    .line 661
    check-cast v7, LJ3/j;

    .line 662
    .line 663
    if-eqz v7, :cond_e

    .line 664
    .line 665
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 666
    .line 667
    .line 668
    move-result-object v1

    .line 669
    sget-object v2, LT3/s;->g:Ljava/lang/String;

    .line 670
    .line 671
    new-instance v3, Ljava/lang/StringBuilder;

    .line 672
    .line 673
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    iget-object v0, p0, LL7/b;->c:Ljava/lang/Object;

    .line 677
    .line 678
    check-cast v0, LT3/s;

    .line 679
    .line 680
    iget-object v0, v0, LT3/s;->c:LS3/p;

    .line 681
    .line 682
    iget-object v0, v0, LS3/p;->c:Ljava/lang/String;

    .line 683
    .line 684
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    invoke-virtual {v1, v2, v0}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    iget-object v0, p0, LL7/b;->c:Ljava/lang/Object;

    .line 695
    .line 696
    check-cast v0, LT3/s;

    .line 697
    .line 698
    iget-object v1, v0, LT3/s;->a:LU3/j;

    .line 699
    .line 700
    iget-object v4, v0, LT3/s;->e:LT3/t;

    .line 701
    .line 702
    iget-object v8, v0, LT3/s;->b:Landroid/content/Context;

    .line 703
    .line 704
    iget-object v0, v0, LT3/s;->d:LJ3/q;

    .line 705
    .line 706
    invoke-virtual {v0}, LJ3/q;->getId()Ljava/util/UUID;

    .line 707
    .line 708
    .line 709
    move-result-object v6

    .line 710
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 711
    .line 712
    .line 713
    new-instance v5, LU3/j;

    .line 714
    .line 715
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 716
    .line 717
    .line 718
    new-instance v3, LA7/r1;

    .line 719
    .line 720
    const/4 v9, 0x2

    .line 721
    invoke-direct/range {v3 .. v9}, LA7/r1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 722
    .line 723
    .line 724
    iget-object v0, v4, LT3/t;->a:Lb7/k;

    .line 725
    .line 726
    invoke-virtual {v0, v3}, Lb7/k;->v(Ljava/lang/Runnable;)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v1, v5}, LU3/j;->k(Lp8/p;)Z

    .line 730
    .line 731
    .line 732
    goto :goto_c

    .line 733
    :catchall_2
    move-exception v0

    .line 734
    goto :goto_b

    .line 735
    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 736
    .line 737
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 738
    .line 739
    .line 740
    iget-object v1, p0, LL7/b;->c:Ljava/lang/Object;

    .line 741
    .line 742
    check-cast v1, LT3/s;

    .line 743
    .line 744
    iget-object v1, v1, LT3/s;->c:LS3/p;

    .line 745
    .line 746
    iget-object v1, v1, LS3/p;->c:Ljava/lang/String;

    .line 747
    .line 748
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 749
    .line 750
    .line 751
    const-string v1, ") but did not provide ForegroundInfo"

    .line 752
    .line 753
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 754
    .line 755
    .line 756
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 761
    .line 762
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 763
    .line 764
    .line 765
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 766
    :goto_b
    iget-object v1, p0, LL7/b;->c:Ljava/lang/Object;

    .line 767
    .line 768
    check-cast v1, LT3/s;

    .line 769
    .line 770
    iget-object v1, v1, LT3/s;->a:LU3/j;

    .line 771
    .line 772
    invoke-virtual {v1, v0}, LU3/j;->j(Ljava/lang/Throwable;)Z

    .line 773
    .line 774
    .line 775
    :goto_c
    return-void

    .line 776
    :pswitch_15
    invoke-direct {p0}, LL7/b;->b()V

    .line 777
    .line 778
    .line 779
    return-void

    .line 780
    :pswitch_16
    iget-object v0, p0, LL7/b;->b:Ljava/lang/Object;

    .line 781
    .line 782
    check-cast v0, LSe/i;

    .line 783
    .line 784
    iget-object v1, p0, LL7/b;->c:Ljava/lang/Object;

    .line 785
    .line 786
    check-cast v1, LHe/g;

    .line 787
    .line 788
    invoke-virtual {v1, v0}, LHe/g;->b(LHe/h;)V

    .line 789
    .line 790
    .line 791
    return-void

    .line 792
    :pswitch_17
    invoke-direct {p0}, LL7/b;->a()V

    .line 793
    .line 794
    .line 795
    return-void

    .line 796
    :pswitch_18
    iget-object v0, p0, LL7/b;->b:Ljava/lang/Object;

    .line 797
    .line 798
    move-object v2, v0

    .line 799
    check-cast v2, LN6/a;

    .line 800
    .line 801
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 802
    .line 803
    .line 804
    iget-object v0, p0, LL7/b;->c:Ljava/lang/Object;

    .line 805
    .line 806
    check-cast v0, Ljava/lang/String;

    .line 807
    .line 808
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 809
    .line 810
    .line 811
    move-result-object v3

    .line 812
    :try_start_9
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zznH:Lcom/google/android/gms/internal/ads/zzbio;

    .line 813
    .line 814
    sget-object v4, LD6/s;->e:LD6/s;

    .line 815
    .line 816
    iget-object v4, v4, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 817
    .line 818
    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    check-cast v0, Ljava/lang/Boolean;

    .line 823
    .line 824
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 825
    .line 826
    .line 827
    move-result v0
    :try_end_9
    .catch Lcom/google/android/gms/internal/ads/zzbax; {:try_start_9 .. :try_end_9} :catch_7

    .line 828
    iget-object v4, v2, LN6/a;->b:Landroid/webkit/WebView;

    .line 829
    .line 830
    iget-object v5, v2, LN6/a;->a:Landroid/content/Context;

    .line 831
    .line 832
    if-eqz v0, :cond_f

    .line 833
    .line 834
    :try_start_a
    iget-object v0, v2, LN6/a;->d:Lcom/google/android/gms/internal/ads/zzflk;

    .line 835
    .line 836
    if-eqz v0, :cond_f

    .line 837
    .line 838
    invoke-virtual {v0, v3, v5, v4, v1}, Lcom/google/android/gms/internal/ads/zzflk;->zza(Landroid/net/Uri;Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Landroid/net/Uri;

    .line 839
    .line 840
    .line 841
    move-result-object v3

    .line 842
    goto :goto_e

    .line 843
    :catch_7
    move-exception v0

    .line 844
    goto :goto_d

    .line 845
    :cond_f
    iget-object v0, v2, LN6/a;->c:Lcom/google/android/gms/internal/ads/zzbaw;

    .line 846
    .line 847
    invoke-virtual {v0, v3, v5, v4, v1}, Lcom/google/android/gms/internal/ads/zzbaw;->zzd(Landroid/net/Uri;Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Landroid/net/Uri;

    .line 848
    .line 849
    .line 850
    move-result-object v3
    :try_end_a
    .catch Lcom/google/android/gms/internal/ads/zzbax; {:try_start_a .. :try_end_a} :catch_7

    .line 851
    goto :goto_e

    .line 852
    :goto_d
    sget v4, LG6/L;->b:I

    .line 853
    .line 854
    const-string v4, "Failed to append the click signal to URL: "

    .line 855
    .line 856
    invoke-static {v4, v0}, LH6/l;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 857
    .line 858
    .line 859
    sget-object v4, LC6/n;->D:LC6/n;

    .line 860
    .line 861
    iget-object v4, v4, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 862
    .line 863
    const-string v5, "TaggingLibraryJsInterface.recordClick"

    .line 864
    .line 865
    invoke-virtual {v4, v0, v5}, Lcom/google/android/gms/internal/ads/zzcfk;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 866
    .line 867
    .line 868
    :goto_e
    iget-object v0, v2, LN6/a;->i:Lcom/google/android/gms/internal/ads/zzfsm;

    .line 869
    .line 870
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 871
    .line 872
    .line 873
    move-result-object v2

    .line 874
    invoke-virtual {v0, v2, v1, v1, v1}, Lcom/google/android/gms/internal/ads/zzfsm;->zzb(Ljava/lang/String;LH6/q;Lcom/google/android/gms/internal/ads/zzfqq;Lcom/google/android/gms/internal/ads/zzdfo;)V

    .line 875
    .line 876
    .line 877
    return-void

    .line 878
    :pswitch_19
    iget-object v0, p0, LL7/b;->b:Ljava/lang/Object;

    .line 879
    .line 880
    check-cast v0, LN6/j;

    .line 881
    .line 882
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 883
    .line 884
    .line 885
    iget-object v1, p0, LL7/b;->c:Ljava/lang/Object;

    .line 886
    .line 887
    check-cast v1, [Lcom/google/android/gms/internal/ads/zzdvf;

    .line 888
    .line 889
    aget-object v1, v1, v2

    .line 890
    .line 891
    if-eqz v1, :cond_10

    .line 892
    .line 893
    iget-object v0, v0, LN6/j;->e:Lcom/google/android/gms/internal/ads/zzfmf;

    .line 894
    .line 895
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzhcf;->zza(Ljava/lang/Object;)Lp8/p;

    .line 896
    .line 897
    .line 898
    move-result-object v1

    .line 899
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzfmf;->zzc(Lp8/p;)V

    .line 900
    .line 901
    .line 902
    :cond_10
    return-void

    .line 903
    :pswitch_1a
    :try_start_b
    invoke-virtual {p0}, LL7/b;->e()V
    :try_end_b
    .catch Ljava/lang/Error; {:try_start_b .. :try_end_b} :catch_8

    .line 904
    .line 905
    .line 906
    return-void

    .line 907
    :catch_8
    move-exception v0

    .line 908
    iget-object v1, p0, LL7/b;->c:Ljava/lang/Object;

    .line 909
    .line 910
    check-cast v1, LM8/j;

    .line 911
    .line 912
    iget-object v1, v1, LM8/j;->b:Ljava/util/ArrayDeque;

    .line 913
    .line 914
    monitor-enter v1

    .line 915
    :try_start_c
    iget-object v2, p0, LL7/b;->c:Ljava/lang/Object;

    .line 916
    .line 917
    check-cast v2, LM8/j;

    .line 918
    .line 919
    iput v3, v2, LM8/j;->c:I

    .line 920
    .line 921
    monitor-exit v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 922
    throw v0

    .line 923
    :catchall_3
    move-exception v0

    .line 924
    :try_start_d
    monitor-exit v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 925
    throw v0

    .line 926
    :pswitch_1b
    iget-object v0, p0, LL7/b;->b:Ljava/lang/Object;

    .line 927
    .line 928
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 929
    .line 930
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v0

    .line 934
    check-cast v0, Ljava/util/Map;

    .line 935
    .line 936
    if-nez v0, :cond_11

    .line 937
    .line 938
    const-string v0, "ImageStreamReader"

    .line 939
    .line 940
    const-string v1, "Image buffer was dropped by garbage collector."

    .line 941
    .line 942
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 943
    .line 944
    .line 945
    goto :goto_f

    .line 946
    :cond_11
    iget-object v1, p0, LL7/b;->c:Ljava/lang/Object;

    .line 947
    .line 948
    check-cast v1, Luc/h;

    .line 949
    .line 950
    invoke-virtual {v1, v0}, Luc/h;->a(Ljava/lang/Object;)V

    .line 951
    .line 952
    .line 953
    :goto_f
    return-void

    .line 954
    :pswitch_1c
    iget-object v0, p0, LL7/b;->c:Ljava/lang/Object;

    .line 955
    .line 956
    check-cast v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    .line 957
    .line 958
    iget-object v0, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a:Lt1/d;

    .line 959
    .line 960
    if-eqz v0, :cond_12

    .line 961
    .line 962
    invoke-virtual {v0}, Lt1/d;->f()Z

    .line 963
    .line 964
    .line 965
    move-result v0

    .line 966
    if-eqz v0, :cond_12

    .line 967
    .line 968
    sget-object v0, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 969
    .line 970
    iget-object v0, p0, LL7/b;->b:Ljava/lang/Object;

    .line 971
    .line 972
    check-cast v0, Landroid/view/View;

    .line 973
    .line 974
    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 975
    .line 976
    .line 977
    :cond_12
    return-void

    .line 978
    nop

    .line 979
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, LL7/b;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :sswitch_0
    invoke-static {p0}, LBa/c;->S(Ljava/lang/Object;)LA7/b0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, LG9/e;

    .line 16
    .line 17
    const/16 v2, 0x1c

    .line 18
    .line 19
    invoke-direct {v1, v2}, LG9/e;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iget-object v2, v0, LA7/b0;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, LG9/e;

    .line 25
    .line 26
    iput-object v1, v2, LG9/e;->d:Ljava/lang/Object;

    .line 27
    .line 28
    iput-object v1, v0, LA7/b0;->e:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v2, p0, LL7/b;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, LS3/e;

    .line 33
    .line 34
    iput-object v2, v1, LG9/e;->c:Ljava/lang/Object;

    .line 35
    .line 36
    invoke-virtual {v0}, LA7/b0;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0

    .line 41
    :sswitch_1
    iget-object v0, p0, LL7/b;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Ljava/lang/Runnable;

    .line 44
    .line 45
    const-string v1, "}"

    .line 46
    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    new-instance v2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v3, "SequentialExecutorWorker{running="

    .line 52
    .line 53
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v2, "SequentialExecutorWorker{state="

    .line 70
    .line 71
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object v2, p0, LL7/b;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, LM8/j;

    .line 77
    .line 78
    iget v2, v2, LM8/j;->c:I

    .line 79
    .line 80
    const/4 v3, 0x1

    .line 81
    if-eq v2, v3, :cond_4

    .line 82
    .line 83
    const/4 v3, 0x2

    .line 84
    if-eq v2, v3, :cond_3

    .line 85
    .line 86
    const/4 v3, 0x3

    .line 87
    if-eq v2, v3, :cond_2

    .line 88
    .line 89
    const/4 v3, 0x4

    .line 90
    if-eq v2, v3, :cond_1

    .line 91
    .line 92
    const-string v2, "null"

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    const-string v2, "RUNNING"

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_2
    const-string v2, "QUEUED"

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    const-string v2, "QUEUING"

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    const-string v2, "IDLE"

    .line 105
    .line 106
    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    :goto_1
    return-object v0

    .line 117
    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_1
        0x18 -> :sswitch_0
    .end sparse-switch
.end method
