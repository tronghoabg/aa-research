.class public final LA7/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LA7/m1;Ljava/lang/String;Ljava/lang/String;LA7/N1;Lcom/google/android/gms/internal/measurement/zzdo;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LA7/r1;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LA7/r1;->b:Ljava/lang/Object;

    iput-object p3, p0, LA7/r1;->c:Ljava/lang/Object;

    iput-object p4, p0, LA7/r1;->d:Ljava/lang/Object;

    iput-object p5, p0, LA7/r1;->f:Ljava/lang/Object;

    iput-object p1, p0, LA7/r1;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(LE9/c;Lcom/google/android/gms/tasks/CancellationToken;Lcom/google/android/gms/tasks/CancellationTokenSource;Ljava/util/concurrent/Callable;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LA7/r1;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA7/r1;->f:Ljava/lang/Object;

    iput-object p2, p0, LA7/r1;->b:Ljava/lang/Object;

    iput-object p3, p0, LA7/r1;->c:Ljava/lang/Object;

    iput-object p4, p0, LA7/r1;->d:Ljava/lang/Object;

    iput-object p5, p0, LA7/r1;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p6, p0, LA7/r1;->a:I

    iput-object p2, p0, LA7/r1;->f:Ljava/lang/Object;

    iput-object p3, p0, LA7/r1;->b:Ljava/lang/Object;

    iput-object p4, p0, LA7/r1;->c:Ljava/lang/Object;

    iput-object p5, p0, LA7/r1;->d:Ljava/lang/Object;

    iput-object p1, p0, LA7/r1;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 7

    .line 1
    iget-object v0, p0, LA7/r1;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_0
    iget-object v2, p0, LA7/r1;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, LA7/m1;

    .line 10
    .line 11
    iget-object v3, v2, LA7/m1;->d:LA7/F;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2}, LA7/B0;->zzj()LA7/N;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 20
    .line 21
    const-string v3, "(legacy) Failed to get conditional properties; not connected to service"

    .line 22
    .line 23
    iget-object v4, p0, LA7/r1;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Ljava/lang/String;

    .line 26
    .line 27
    iget-object v5, p0, LA7/r1;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v5, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v2, v1, v4, v5, v3}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, LA7/r1;->f:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 37
    .line 38
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 41
    .line 42
    .line 43
    :try_start_1
    iget-object v1, p0, LA7/r1;->f:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 48
    .line 49
    .line 50
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    return-void

    .line 52
    :catchall_0
    move-exception v1

    .line 53
    goto :goto_4

    .line 54
    :catchall_1
    move-exception v1

    .line 55
    goto :goto_3

    .line 56
    :catch_0
    move-exception v2

    .line 57
    goto :goto_1

    .line 58
    :cond_0
    :try_start_2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    iget-object v2, p0, LA7/r1;->d:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, LA7/N1;

    .line 67
    .line 68
    iget-object v4, p0, LA7/r1;->f:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 71
    .line 72
    iget-object v5, p0, LA7/r1;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v5, Ljava/lang/String;

    .line 75
    .line 76
    iget-object v6, p0, LA7/r1;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v6, Ljava/lang/String;

    .line 79
    .line 80
    invoke-interface {v3, v5, v6, v2}, LA7/F;->E(Ljava/lang/String;Ljava/lang/String;LA7/N1;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v4, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    iget-object v2, p0, LA7/r1;->f:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 91
    .line 92
    iget-object v4, p0, LA7/r1;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v4, Ljava/lang/String;

    .line 95
    .line 96
    iget-object v5, p0, LA7/r1;->c:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v5, Ljava/lang/String;

    .line 99
    .line 100
    invoke-interface {v3, v1, v4, v5}, LA7/F;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :goto_0
    iget-object v2, p0, LA7/r1;->e:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v2, LA7/m1;

    .line 110
    .line 111
    invoke-virtual {v2}, LA7/m1;->v0()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 112
    .line 113
    .line 114
    :try_start_3
    iget-object v1, p0, LA7/r1;->f:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :goto_1
    :try_start_4
    iget-object v3, p0, LA7/r1;->e:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v3, LA7/m1;

    .line 125
    .line 126
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    iget-object v3, v3, LA7/N;->f:LA7/P;

    .line 131
    .line 132
    const-string v4, "(legacy) Failed to get conditional properties; remote exception"

    .line 133
    .line 134
    iget-object v5, p0, LA7/r1;->b:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v5, Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {v3, v1, v5, v2, v4}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    iget-object v1, p0, LA7/r1;->f:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 144
    .line 145
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 146
    .line 147
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 148
    .line 149
    .line 150
    :try_start_5
    iget-object v1, p0, LA7/r1;->f:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 155
    .line 156
    .line 157
    :goto_2
    monitor-exit v0

    .line 158
    return-void

    .line 159
    :goto_3
    iget-object v2, p0, LA7/r1;->f:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 164
    .line 165
    .line 166
    throw v1

    .line 167
    :goto_4
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 168
    throw v1
.end method

.method private final b()V
    .locals 4

    .line 1
    iget-object v0, p0, LA7/r1;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Collection;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lod/G1;

    .line 20
    .line 21
    iget-object v2, p0, LA7/r1;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lod/G1;

    .line 24
    .line 25
    if-eq v1, v2, :cond_0

    .line 26
    .line 27
    iget-object v1, v1, Lod/G1;->a:Lod/r;

    .line 28
    .line 29
    sget-object v2, Lod/B0;->G:Lmd/k0;

    .line 30
    .line 31
    invoke-interface {v1, v2}, Lod/r;->g(Lmd/k0;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v0, p0, LA7/r1;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ljava/util/concurrent/Future;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 43
    .line 44
    .line 45
    :cond_2
    iget-object v0, p0, LA7/r1;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljava/util/concurrent/Future;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 52
    .line 53
    .line 54
    :cond_3
    iget-object v0, p0, LA7/r1;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lod/B0;

    .line 57
    .line 58
    iget-object v1, v0, Lod/B0;->D:Ld7/j;

    .line 59
    .line 60
    iget-object v1, v1, Ld7/j;->a:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Lod/M0;

    .line 63
    .line 64
    iget-object v1, v1, Lod/M0;->F:LVa/Y7;

    .line 65
    .line 66
    iget-object v2, v1, LVa/Y7;->a:Ljava/lang/Object;

    .line 67
    .line 68
    monitor-enter v2

    .line 69
    :try_start_0
    iget-object v3, v1, LVa/Y7;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v3, Ljava/util/HashSet;

    .line 72
    .line 73
    invoke-virtual {v3, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    iget-object v0, v1, LVa/Y7;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Ljava/util/HashSet;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_4

    .line 85
    .line 86
    iget-object v0, v1, LVa/Y7;->c:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Lmd/k0;

    .line 89
    .line 90
    new-instance v3, Ljava/util/HashSet;

    .line 91
    .line 92
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 93
    .line 94
    .line 95
    iput-object v3, v1, LVa/Y7;->b:Ljava/lang/Object;

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :catchall_0
    move-exception v0

    .line 99
    goto :goto_2

    .line 100
    :cond_4
    const/4 v0, 0x0

    .line 101
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    iget-object v1, v1, LVa/Y7;->d:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v1, Lod/M0;

    .line 107
    .line 108
    iget-object v1, v1, Lod/M0;->E:Lod/H;

    .line 109
    .line 110
    invoke-virtual {v1, v0}, Lod/H;->d(Lmd/k0;)V

    .line 111
    .line 112
    .line 113
    :cond_5
    return-void

    .line 114
    :goto_2
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 115
    throw v0
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, LA7/r1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA7/r1;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LE9/c;

    .line 9
    .line 10
    iget-object v1, p0, LA7/r1;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lcom/google/android/gms/tasks/CancellationToken;

    .line 13
    .line 14
    iget-object v2, p0, LA7/r1;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lcom/google/android/gms/tasks/CancellationTokenSource;

    .line 17
    .line 18
    iget-object v3, p0, LA7/r1;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Ljava/util/concurrent/Callable;

    .line 21
    .line 22
    iget-object v4, p0, LA7/r1;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v4, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/CancellationToken;->isCancellationRequested()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_0

    .line 34
    .line 35
    invoke-virtual {v2}, Lcom/google/android/gms/tasks/CancellationTokenSource;->cancel()V

    .line 36
    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_0
    :try_start_0
    iget-object v5, v0, LE9/c;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v5, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-nez v5, :cond_1

    .line 48
    .line 49
    move-object v5, v0

    .line 50
    check-cast v5, LEa/a;

    .line 51
    .line 52
    monitor-enter v5
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    :try_start_1
    iget-object v6, v5, LEa/a;->d:LEa/e;

    .line 54
    .line 55
    invoke-interface {v6}, LEa/e;->zzb()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    .line 57
    .line 58
    :try_start_2
    monitor-exit v5

    .line 59
    iget-object v0, v0, LE9/c;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 62
    .line 63
    const/4 v5, 0x1

    .line 64
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catch_0
    move-exception v0

    .line 69
    goto :goto_2

    .line 70
    :catch_1
    move-exception v0

    .line 71
    goto :goto_1

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    :try_start_3
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 74
    :try_start_4
    throw v0

    .line 75
    :cond_1
    :goto_0
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/CancellationToken;->isCancellationRequested()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    invoke-virtual {v2}, Lcom/google/android/gms/tasks/CancellationTokenSource;->cancel()V

    .line 82
    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_2
    invoke-interface {v3}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 89
    :try_start_5
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/CancellationToken;->isCancellationRequested()Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_3

    .line 94
    .line 95
    invoke-virtual {v2}, Lcom/google/android/gms/tasks/CancellationTokenSource;->cancel()V

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_3
    invoke-virtual {v4, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :goto_1
    new-instance v3, Lua/a;

    .line 104
    .line 105
    const-string v5, "Internal error has occurred when executing ML Kit tasks"

    .line 106
    .line 107
    invoke-direct {v3, v5, v0}, Lua/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 108
    .line 109
    .line 110
    throw v3
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 111
    :goto_2
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/CancellationToken;->isCancellationRequested()Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_4

    .line 116
    .line 117
    invoke-virtual {v2}, Lcom/google/android/gms/tasks/CancellationTokenSource;->cancel()V

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_4
    invoke-virtual {v4, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 122
    .line 123
    .line 124
    :goto_3
    return-void

    .line 125
    :pswitch_0
    invoke-direct {p0}, LA7/r1;->b()V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :pswitch_1
    :try_start_6
    iget-object v0, p0, LA7/r1;->f:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, LU3/j;

    .line 132
    .line 133
    iget-object v0, v0, LU3/h;->a:Ljava/lang/Object;

    .line 134
    .line 135
    instance-of v0, v0, LU3/a;

    .line 136
    .line 137
    if-nez v0, :cond_6

    .line 138
    .line 139
    iget-object v0, p0, LA7/r1;->b:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, Ljava/util/UUID;

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    iget-object v1, p0, LA7/r1;->e:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v1, LT3/t;

    .line 150
    .line 151
    iget-object v1, v1, LT3/t;->c:LS3/q;

    .line 152
    .line 153
    invoke-virtual {v1, v0}, LS3/q;->h(Ljava/lang/String;)LS3/p;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    if-eqz v1, :cond_5

    .line 158
    .line 159
    iget v2, v1, LS3/p;->b:I

    .line 160
    .line 161
    invoke-static {v2}, LA7/p0;->d(I)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-nez v2, :cond_5

    .line 166
    .line 167
    iget-object v2, p0, LA7/r1;->e:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v2, LT3/t;

    .line 170
    .line 171
    iget-object v2, v2, LT3/t;->b:LK3/f;

    .line 172
    .line 173
    iget-object v3, p0, LA7/r1;->c:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v3, LJ3/j;

    .line 176
    .line 177
    invoke-virtual {v2, v0, v3}, LK3/f;->i(Ljava/lang/String;LJ3/j;)V

    .line 178
    .line 179
    .line 180
    iget-object v0, p0, LA7/r1;->d:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v0, Landroid/content/Context;

    .line 183
    .line 184
    invoke-static {v1}, LFe/c;->s(LS3/p;)LS3/j;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    iget-object v2, p0, LA7/r1;->c:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v2, LJ3/j;

    .line 191
    .line 192
    invoke-static {v0, v1, v2}, LR3/a;->a(Landroid/content/Context;LS3/j;LJ3/j;)Landroid/content/Intent;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    iget-object v1, p0, LA7/r1;->d:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v1, Landroid/content/Context;

    .line 199
    .line 200
    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 201
    .line 202
    .line 203
    goto :goto_4

    .line 204
    :catchall_1
    move-exception v0

    .line 205
    goto :goto_5

    .line 206
    :cond_5
    const-string v0, "Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    .line 207
    .line 208
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 209
    .line 210
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw v1

    .line 214
    :cond_6
    :goto_4
    iget-object v0, p0, LA7/r1;->f:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v0, LU3/j;

    .line 217
    .line 218
    const/4 v1, 0x0

    .line 219
    invoke-virtual {v0, v1}, LU3/j;->i(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 220
    .line 221
    .line 222
    goto :goto_6

    .line 223
    :goto_5
    iget-object v1, p0, LA7/r1;->f:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v1, LU3/j;

    .line 226
    .line 227
    invoke-virtual {v1, v0}, LU3/j;->j(Ljava/lang/Throwable;)Z

    .line 228
    .line 229
    .line 230
    :goto_6
    return-void

    .line 231
    :pswitch_2
    iget-object v0, p0, LA7/r1;->d:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v0, LA7/N1;

    .line 234
    .line 235
    iget-object v1, p0, LA7/r1;->c:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v1, Ljava/lang/String;

    .line 238
    .line 239
    iget-object v2, p0, LA7/r1;->b:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v2, Ljava/lang/String;

    .line 242
    .line 243
    iget-object v3, p0, LA7/r1;->f:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v3, Lcom/google/android/gms/internal/measurement/zzdo;

    .line 246
    .line 247
    iget-object v4, p0, LA7/r1;->e:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v4, LA7/m1;

    .line 250
    .line 251
    new-instance v5, Ljava/util/ArrayList;

    .line 252
    .line 253
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 254
    .line 255
    .line 256
    :try_start_7
    iget-object v6, v4, LA7/m1;->d:LA7/F;

    .line 257
    .line 258
    if-nez v6, :cond_7

    .line 259
    .line 260
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 265
    .line 266
    const-string v6, "Failed to get conditional properties; not connected to service"

    .line 267
    .line 268
    invoke-virtual {v0, v2, v6, v1}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 269
    .line 270
    .line 271
    invoke-virtual {v4}, LA7/B0;->b0()LA7/U1;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {v0, v3, v5}, LA7/U1;->B0(Lcom/google/android/gms/internal/measurement/zzdo;Ljava/util/ArrayList;)V

    .line 276
    .line 277
    .line 278
    goto :goto_8

    .line 279
    :catchall_2
    move-exception v0

    .line 280
    goto :goto_9

    .line 281
    :catch_2
    move-exception v0

    .line 282
    goto :goto_7

    .line 283
    :cond_7
    :try_start_8
    invoke-interface {v6, v2, v1, v0}, LA7/F;->E(Ljava/lang/String;Ljava/lang/String;LA7/N1;)Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-static {v0}, LA7/U1;->Y0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    invoke-virtual {v4}, LA7/m1;->v0()V
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 292
    .line 293
    .line 294
    invoke-virtual {v4}, LA7/B0;->b0()LA7/U1;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {v0, v3, v5}, LA7/U1;->B0(Lcom/google/android/gms/internal/measurement/zzdo;Ljava/util/ArrayList;)V

    .line 299
    .line 300
    .line 301
    goto :goto_8

    .line 302
    :goto_7
    :try_start_9
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    iget-object v6, v6, LA7/N;->f:LA7/P;

    .line 307
    .line 308
    const-string v7, "Failed to get conditional properties; remote exception"

    .line 309
    .line 310
    invoke-virtual {v6, v2, v1, v0, v7}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 311
    .line 312
    .line 313
    invoke-virtual {v4}, LA7/B0;->b0()LA7/U1;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-virtual {v0, v3, v5}, LA7/U1;->B0(Lcom/google/android/gms/internal/measurement/zzdo;Ljava/util/ArrayList;)V

    .line 318
    .line 319
    .line 320
    :goto_8
    return-void

    .line 321
    :goto_9
    invoke-virtual {v4}, LA7/B0;->b0()LA7/U1;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-virtual {v1, v3, v5}, LA7/U1;->B0(Lcom/google/android/gms/internal/measurement/zzdo;Ljava/util/ArrayList;)V

    .line 326
    .line 327
    .line 328
    throw v0

    .line 329
    :pswitch_3
    invoke-direct {p0}, LA7/r1;->a()V

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
