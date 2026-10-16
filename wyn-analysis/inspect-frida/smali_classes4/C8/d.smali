.class public final synthetic LC8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LC8/d;->a:I

    iput-object p2, p0, LC8/d;->b:Ljava/lang/Object;

    iput-object p3, p0, LC8/d;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    .line 2
    const/16 v0, 0xc

    iput v0, p0, LC8/d;->a:I

    sget-object v0, Ld7/e;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC8/d;->b:Ljava/lang/Object;

    iput-object p2, p0, LC8/d;->c:Ljava/lang/Object;

    return-void
.end method

.method private final a()V
    .locals 5

    .line 1
    iget-object v0, p0, LC8/d;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LE5/y0;

    .line 4
    .line 5
    iget-object v1, p0, LC8/d;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LE5/O;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    :try_start_0
    monitor-enter v0

    .line 13
    monitor-exit v0
    :try_end_0
    .catch LE5/o; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    const/4 v1, 0x1

    .line 15
    :try_start_1
    iget-object v2, v0, LE5/y0;->a:LE5/x0;

    .line 16
    .line 17
    iget v3, v0, LE5/y0;->d:I

    .line 18
    .line 19
    iget-object v4, v0, LE5/y0;->e:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-interface {v2, v3, v4}, LE5/x0;->c(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    :try_start_2
    invoke-virtual {v0, v1}, LE5/y0;->b(Z)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception v2

    .line 29
    invoke-virtual {v0, v1}, LE5/y0;->b(Z)V

    .line 30
    .line 31
    .line 32
    throw v2
    :try_end_2
    .catch LE5/o; {:try_start_2 .. :try_end_2} :catch_0

    .line 33
    :catch_0
    move-exception v0

    .line 34
    const-string v1, "ExoPlayerImplInternal"

    .line 35
    .line 36
    const-string v2, "Unexpected error delivering message on external thread."

    .line 37
    .line 38
    invoke-static {v1, v2, v0}, Lu6/a;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    new-instance v1, Ljava/lang/RuntimeException;

    .line 42
    .line 43
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    throw v1
.end method

.method private final b()V
    .locals 4

    .line 1
    iget-object v0, p0, LC8/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LG5/p;

    .line 4
    .line 5
    iget-object v1, p0, LC8/d;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LH5/e;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    monitor-enter v1

    .line 13
    monitor-exit v1

    .line 14
    iget-object v0, v0, LG5/p;->c:LE5/F;

    .line 15
    .line 16
    sget v1, Lu6/v;->a:I

    .line 17
    .line 18
    iget-object v0, v0, LE5/F;->a:LE5/I;

    .line 19
    .line 20
    iget-object v0, v0, LE5/I;->r:LF5/f;

    .line 21
    .line 22
    iget-object v1, v0, LF5/f;->d:LC6/l;

    .line 23
    .line 24
    iget-object v1, v1, LC6/l;->e:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lf6/z;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, LF5/f;->L(Lf6/z;)LF5/a;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    new-instance v2, LF5/b;

    .line 33
    .line 34
    const/4 v3, 0x6

    .line 35
    invoke-direct {v2, v3}, LF5/b;-><init>(I)V

    .line 36
    .line 37
    .line 38
    const/16 v3, 0x3f5

    .line 39
    .line 40
    invoke-virtual {v0, v1, v3, v2}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method private final c()V
    .locals 4

    .line 1
    iget-object v0, p0, LC8/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/AudioTrack;

    .line 4
    .line 5
    iget-object v1, p0, LC8/d;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ls8/b;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :try_start_0
    invoke-virtual {v0}, Landroid/media/AudioTrack;->flush()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ls8/b;->e()Z

    .line 17
    .line 18
    .line 19
    sget-object v0, LG5/G;->d0:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v0

    .line 22
    :try_start_1
    sget v1, LG5/G;->f0:I

    .line 23
    .line 24
    add-int/lit8 v1, v1, -0x1

    .line 25
    .line 26
    sput v1, LG5/G;->f0:I

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    sget-object v1, LG5/G;->e0:Ljava/util/concurrent/ExecutorService;

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 33
    .line 34
    .line 35
    sput-object v2, LG5/G;->e0:Ljava/util/concurrent/ExecutorService;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v1

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    :goto_0
    monitor-exit v0

    .line 41
    return-void

    .line 42
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    throw v1

    .line 44
    :catchall_1
    move-exception v0

    .line 45
    invoke-virtual {v1}, Ls8/b;->e()Z

    .line 46
    .line 47
    .line 48
    sget-object v1, LG5/G;->d0:Ljava/lang/Object;

    .line 49
    .line 50
    monitor-enter v1

    .line 51
    :try_start_2
    sget v3, LG5/G;->f0:I

    .line 52
    .line 53
    add-int/lit8 v3, v3, -0x1

    .line 54
    .line 55
    sput v3, LG5/G;->f0:I

    .line 56
    .line 57
    if-nez v3, :cond_1

    .line 58
    .line 59
    sget-object v3, LG5/G;->e0:Ljava/util/concurrent/ExecutorService;

    .line 60
    .line 61
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 62
    .line 63
    .line 64
    sput-object v2, LG5/G;->e0:Ljava/util/concurrent/ExecutorService;

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :catchall_2
    move-exception v0

    .line 68
    goto :goto_3

    .line 69
    :cond_1
    :goto_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 70
    throw v0

    .line 71
    :goto_3
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 72
    throw v0
.end method

.method private final d()V
    .locals 4

    .line 1
    iget-object v0, p0, LC8/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LL8/r;

    .line 4
    .line 5
    iget-object v1, p0, LC8/d;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LO9/b;

    .line 8
    .line 9
    iget-object v2, v0, LL8/r;->b:LO9/b;

    .line 10
    .line 11
    sget-object v3, LL8/r;->d:LL8/g;

    .line 12
    .line 13
    if-ne v2, v3, :cond_0

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v2, v0, LL8/r;->a:LO9/a;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    iput-object v3, v0, LL8/r;->a:LO9/a;

    .line 20
    .line 21
    iput-object v1, v0, LL8/r;->b:LO9/b;

    .line 22
    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    invoke-interface {v2, v1}, LO9/a;->f(LO9/b;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw v1

    .line 31
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v1, "provide() can be called only once."

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
.end method

.method private final e()V
    .locals 3

    .line 1
    iget-object v0, p0, LC8/d;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LL8/q;

    .line 4
    .line 5
    iget-object v1, p0, LC8/d;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LO9/b;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v2, v0, LL8/q;->b:Ljava/util/Set;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    iget-object v2, v0, LL8/q;->a:Ljava/util/Set;

    .line 15
    .line 16
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget-object v2, v0, LL8/q;->b:Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {v1}, LO9/b;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    :goto_0
    monitor-exit v0

    .line 32
    return-void

    .line 33
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw v1
.end method


# virtual methods
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x1

    .line 8
    iget v6, v1, LC8/d;->a:I

    .line 9
    .line 10
    packed-switch v6, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v1, LC8/d;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, LR8/s;

    .line 16
    .line 17
    iget-object v2, v1, LC8/d;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Ljava/lang/String;

    .line 20
    .line 21
    iget-object v0, v0, LR8/s;->h:LR8/m;

    .line 22
    .line 23
    iget-object v0, v0, LR8/m;->d:LX8/c;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const/16 v4, 0x400

    .line 29
    .line 30
    invoke-static {v4, v2}, LT8/d;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget-object v4, v0, LX8/c;->g:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v4, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 37
    .line 38
    monitor-enter v4

    .line 39
    :try_start_0
    iget-object v6, v0, LX8/c;->g:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v6, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 42
    .line 43
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    check-cast v6, Ljava/lang/String;

    .line 48
    .line 49
    if-nez v2, :cond_0

    .line 50
    .line 51
    if-nez v6, :cond_1

    .line 52
    .line 53
    move v3, v5

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    :cond_1
    :goto_0
    if-eqz v3, :cond_2

    .line 60
    .line 61
    monitor-exit v4

    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    iget-object v3, v0, LX8/c;->g:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 68
    .line 69
    invoke-virtual {v3, v2, v5}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    .line 70
    .line 71
    .line 72
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    iget-object v2, v0, LX8/c;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, LS8/f;

    .line 76
    .line 77
    iget-object v2, v2, LS8/f;->b:LS8/c;

    .line 78
    .line 79
    new-instance v3, LC8/g;

    .line 80
    .line 81
    const/16 v4, 0xc

    .line 82
    .line 83
    invoke-direct {v3, v0, v4}, LC8/g;-><init>(Ljava/lang/Object;I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v3}, LS8/c;->b(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 87
    .line 88
    .line 89
    :goto_1
    return-void

    .line 90
    :goto_2
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    throw v0

    .line 92
    :pswitch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 93
    .line 94
    iget-object v2, v1, LC8/d;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v2, LR8/m;

    .line 97
    .line 98
    iget-object v3, v1, LC8/d;->c:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v3, Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v2, v3, v0}, LR8/m;->c(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_1
    iget-object v0, v1, LC8/d;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, Ljava/lang/String;

    .line 109
    .line 110
    iget-object v2, v1, LC8/d;->c:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 113
    .line 114
    sget-object v3, LQc/c;->c:Ljava/util/HashMap;

    .line 115
    .line 116
    :try_start_2
    invoke-static {v0}, Ls8/g;->f(Ljava/lang/String;)Ls8/g;

    .line 117
    .line 118
    .line 119
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 120
    :try_start_3
    invoke-virtual {v0}, Ls8/g;->b()V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :catch_0
    move-exception v0

    .line 125
    goto :goto_4

    .line 126
    :catch_1
    :goto_3
    :try_start_4
    invoke-virtual {v2, v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 127
    .line 128
    .line 129
    goto :goto_5

    .line 130
    :goto_4
    invoke-virtual {v2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 131
    .line 132
    .line 133
    :goto_5
    return-void

    .line 134
    :pswitch_2
    iget-object v0, v1, LC8/d;->b:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, Ljava/util/List;

    .line 137
    .line 138
    iget-object v2, v1, LC8/d;->c:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v2, LQ3/f;

    .line 141
    .line 142
    const-string v3, "this$0"

    .line 143
    .line 144
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    check-cast v0, Ljava/lang/Iterable;

    .line 148
    .line 149
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    if-eqz v3, :cond_3

    .line 158
    .line 159
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    check-cast v3, LP3/b;

    .line 164
    .line 165
    iget-object v4, v2, LQ3/f;->e:Ljava/lang/Object;

    .line 166
    .line 167
    iput-object v4, v3, LP3/b;->d:Ljava/lang/Object;

    .line 168
    .line 169
    iget-object v5, v3, LP3/b;->e:Lb7/k;

    .line 170
    .line 171
    invoke-virtual {v3, v5, v4}, LP3/b;->d(Lb7/k;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    goto :goto_6

    .line 175
    :cond_3
    return-void

    .line 176
    :pswitch_3
    iget-object v0, v1, LC8/d;->b:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v0, LQ1/n;

    .line 179
    .line 180
    invoke-virtual {v0}, LQ1/n;->c()I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    iget-object v2, v1, LC8/d;->c:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v2, Lo2/f;

    .line 187
    .line 188
    invoke-virtual {v2, v0}, Lo2/f;->a(I)V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :pswitch_4
    iget-object v0, v1, LC8/d;->c:Ljava/lang/Object;

    .line 193
    .line 194
    move-object v2, v0

    .line 195
    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 196
    .line 197
    sget-object v0, LPc/d;->i:Ljava/util/HashMap;

    .line 198
    .line 199
    iget-object v0, v1, LC8/d;->b:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v0, LPc/d;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    :try_start_5
    invoke-virtual {v0}, LPc/d;->b()V

    .line 207
    .line 208
    .line 209
    sget-object v0, LPc/d;->i:Ljava/util/HashMap;

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2, v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 215
    .line 216
    .line 217
    goto :goto_7

    .line 218
    :catch_2
    move-exception v0

    .line 219
    invoke-virtual {v2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 220
    .line 221
    .line 222
    :goto_7
    return-void

    .line 223
    :pswitch_5
    iget-object v0, v1, LC8/d;->b:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v0, Ljava/lang/String;

    .line 226
    .line 227
    iget-object v2, v1, LC8/d;->c:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v2, Lcom/vungle/ads/internal/j1;

    .line 230
    .line 231
    invoke-static {v0, v2}, Lcom/vungle/ads/internal/util/p;->a(Ljava/lang/String;Ltf/l;)V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :pswitch_6
    iget-object v0, v1, LC8/d;->b:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v0, Ljava/util/concurrent/Callable;

    .line 238
    .line 239
    iget-object v2, v1, LC8/d;->c:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v2, Lxa/d;

    .line 242
    .line 243
    iget-object v2, v2, Lxa/d;->b:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v2, LM8/h;

    .line 246
    .line 247
    :try_start_6
    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-virtual {v2, v0}, LN0/i;->i(Ljava/lang/Object;)Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 252
    .line 253
    .line 254
    goto :goto_8

    .line 255
    :catch_3
    move-exception v0

    .line 256
    invoke-virtual {v2, v0}, LN0/i;->j(Ljava/lang/Throwable;)Z

    .line 257
    .line 258
    .line 259
    :goto_8
    return-void

    .line 260
    :pswitch_7
    iget-object v0, v1, LC8/d;->b:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v0, LM8/a;

    .line 263
    .line 264
    iget v2, v0, LM8/a;->c:I

    .line 265
    .line 266
    invoke-static {v2}, Landroid/os/Process;->setThreadPriority(I)V

    .line 267
    .line 268
    .line 269
    iget-object v0, v0, LM8/a;->d:Landroid/os/StrictMode$ThreadPolicy;

    .line 270
    .line 271
    if-eqz v0, :cond_4

    .line 272
    .line 273
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 274
    .line 275
    .line 276
    :cond_4
    iget-object v0, v1, LC8/d;->c:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v0, Ljava/lang/Runnable;

    .line 279
    .line 280
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 281
    .line 282
    .line 283
    return-void

    .line 284
    :pswitch_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 285
    .line 286
    const-string v2, "Caught IllegalStateException: "

    .line 287
    .line 288
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    iget-object v2, v1, LC8/d;->c:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v2, Ljava/lang/IllegalStateException;

    .line 294
    .line 295
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    iget-object v2, v1, LC8/d;->b:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v2, Luc/h;

    .line 309
    .line 310
    const-string v3, "IllegalStateException"

    .line 311
    .line 312
    invoke-virtual {v2, v3, v0, v4}, Luc/h;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    .line 313
    .line 314
    .line 315
    return-void

    .line 316
    :pswitch_9
    iget-object v0, v1, LC8/d;->b:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v0, Ljava/util/Map$Entry;

    .line 319
    .line 320
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    check-cast v0, Ll9/b;

    .line 325
    .line 326
    iget-object v2, v1, LC8/d;->c:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v2, Ll9/a;

    .line 329
    .line 330
    invoke-interface {v0, v2}, Ll9/b;->a(Ll9/a;)V

    .line 331
    .line 332
    .line 333
    return-void

    .line 334
    :pswitch_a
    invoke-direct {v1}, LC8/d;->e()V

    .line 335
    .line 336
    .line 337
    return-void

    .line 338
    :pswitch_b
    invoke-direct {v1}, LC8/d;->d()V

    .line 339
    .line 340
    .line 341
    return-void

    .line 342
    :pswitch_c
    iget-object v0, v1, LC8/d;->b:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v0, LK3/s;

    .line 345
    .line 346
    iget-object v2, v1, LC8/d;->c:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v2, LU3/j;

    .line 349
    .line 350
    iget-object v0, v0, LK3/s;->q:LU3/j;

    .line 351
    .line 352
    iget-object v0, v0, LU3/h;->a:Ljava/lang/Object;

    .line 353
    .line 354
    instance-of v0, v0, LU3/a;

    .line 355
    .line 356
    if-eqz v0, :cond_5

    .line 357
    .line 358
    invoke-virtual {v2, v5}, LU3/h;->cancel(Z)Z

    .line 359
    .line 360
    .line 361
    :cond_5
    return-void

    .line 362
    :pswitch_d
    iget-object v0, v1, LC8/d;->c:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v0, LS3/j;

    .line 365
    .line 366
    iget-object v2, v1, LC8/d;->b:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v2, LK3/f;

    .line 369
    .line 370
    invoke-virtual {v2, v0, v3}, LK3/f;->d(LS3/j;Z)V

    .line 371
    .line 372
    .line 373
    return-void

    .line 374
    :pswitch_e
    iget-object v0, v1, LC8/d;->c:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v0, Lz9/y;

    .line 377
    .line 378
    iget-object v2, v1, LC8/d;->b:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v2, LJ9/a;

    .line 381
    .line 382
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    const-string v3, "Updating active experiment: "

    .line 386
    .line 387
    :try_start_7
    new-instance v4, Ljava/lang/StringBuilder;

    .line 388
    .line 389
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->toString()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    invoke-static {v3}, Lic/d;->E(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    iget-object v2, v2, LJ9/a;->a:Lt8/c;

    .line 407
    .line 408
    new-instance v3, Lt8/b;

    .line 409
    .line 410
    invoke-virtual {v0}, Lz9/y;->c()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v4

    .line 414
    invoke-virtual {v0}, Lz9/y;->h()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v5

    .line 418
    invoke-virtual {v0}, Lz9/y;->f()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v6

    .line 422
    new-instance v7, Ljava/util/Date;

    .line 423
    .line 424
    invoke-virtual {v0}, Lz9/y;->d()J

    .line 425
    .line 426
    .line 427
    move-result-wide v8

    .line 428
    invoke-direct {v7, v8, v9}, Ljava/util/Date;-><init>(J)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0}, Lz9/y;->g()J

    .line 432
    .line 433
    .line 434
    move-result-wide v8

    .line 435
    invoke-virtual {v0}, Lz9/y;->e()J

    .line 436
    .line 437
    .line 438
    move-result-wide v10

    .line 439
    invoke-direct/range {v3 .. v11}, Lt8/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;JJ)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v2}, Lt8/c;->d()V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v3}, Lt8/b;->c()Ljava/util/HashMap;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-static {v0}, Lt8/b;->d(Ljava/util/Map;)V

    .line 450
    .line 451
    .line 452
    new-instance v0, Ljava/util/ArrayList;

    .line 453
    .line 454
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v3}, Lt8/b;->c()Ljava/util/HashMap;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    const-string v4, "triggerEvent"

    .line 462
    .line 463
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    invoke-static {v3}, Lt8/b;->a(Ljava/util/Map;)Lt8/b;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    invoke-virtual {v2, v0}, Lt8/c;->a(Ljava/util/ArrayList;)V
    :try_end_7
    .catch Lt8/a; {:try_start_7 .. :try_end_7} :catch_4

    .line 474
    .line 475
    .line 476
    goto :goto_9

    .line 477
    :catch_4
    move-exception v0

    .line 478
    new-instance v2, Ljava/lang/StringBuilder;

    .line 479
    .line 480
    const-string v3, "Unable to set experiment as active with ABT, missing analytics?\n"

    .line 481
    .line 482
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    const-string v2, "FIAM.Headless"

    .line 497
    .line 498
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 499
    .line 500
    .line 501
    :goto_9
    return-void

    .line 502
    :pswitch_f
    iget-object v0, v1, LC8/d;->b:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast v0, Lcom/vungle/ads/internal/session/b;

    .line 505
    .line 506
    iget-object v2, v1, LC8/d;->c:Ljava/lang/Object;

    .line 507
    .line 508
    check-cast v2, Ljava/lang/String;

    .line 509
    .line 510
    invoke-static {v0, v2}, Lcom/vungle/ads/internal/session/b;->a(Lcom/vungle/ads/internal/session/b;Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    return-void

    .line 514
    :pswitch_10
    sget v3, Ld7/f;->a:I

    .line 515
    .line 516
    sget-object v4, Ld7/e;->d:Ld7/e;

    .line 517
    .line 518
    iget-object v6, v1, LC8/d;->b:Ljava/lang/Object;

    .line 519
    .line 520
    move-object v8, v6

    .line 521
    check-cast v8, Landroid/content/Context;

    .line 522
    .line 523
    invoke-virtual {v4, v8, v3}, Ld7/f;->d(Landroid/content/Context;I)I

    .line 524
    .line 525
    .line 526
    move-result v3

    .line 527
    iget-object v4, v1, LC8/d;->c:Ljava/lang/Object;

    .line 528
    .line 529
    check-cast v4, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 530
    .line 531
    if-nez v3, :cond_6

    .line 532
    .line 533
    sget-object v0, LC7/c;->a:Lcom/google/android/gms/common/api/i;

    .line 534
    .line 535
    new-instance v7, LC7/g;

    .line 536
    .line 537
    new-instance v0, Lcom/google/android/gms/common/api/internal/a;

    .line 538
    .line 539
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 540
    .line 541
    .line 542
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    new-instance v12, Lcom/google/android/gms/common/api/k;

    .line 547
    .line 548
    invoke-direct {v12, v0, v2}, Lcom/google/android/gms/common/api/k;-><init>(Lcom/google/android/gms/common/api/internal/a;Landroid/os/Looper;)V

    .line 549
    .line 550
    .line 551
    sget-object v10, LC7/c;->a:Lcom/google/android/gms/common/api/i;

    .line 552
    .line 553
    const/4 v9, 0x0

    .line 554
    const/4 v11, 0x0

    .line 555
    invoke-direct/range {v7 .. v12}, Lcom/google/android/gms/common/api/l;-><init>(Landroid/content/Context;Landroid/app/Activity;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/k;)V

    .line 556
    .line 557
    .line 558
    invoke-virtual {v4, v7}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    goto :goto_b

    .line 562
    :cond_6
    new-instance v6, Ljava/lang/IllegalStateException;

    .line 563
    .line 564
    if-eq v3, v5, :cond_b

    .line 565
    .line 566
    if-eq v3, v2, :cond_a

    .line 567
    .line 568
    if-eq v3, v0, :cond_9

    .line 569
    .line 570
    const/16 v0, 0x9

    .line 571
    .line 572
    if-eq v3, v0, :cond_8

    .line 573
    .line 574
    const/16 v0, 0x12

    .line 575
    .line 576
    if-eq v3, v0, :cond_7

    .line 577
    .line 578
    const-string v0, "Unknown error."

    .line 579
    .line 580
    goto :goto_a

    .line 581
    :cond_7
    const-string v0, "Google Play services is currently being updated on this device."

    .line 582
    .line 583
    goto :goto_a

    .line 584
    :cond_8
    const-string v0, "The version of the Google Play services installed on this device is not authentic."

    .line 585
    .line 586
    goto :goto_a

    .line 587
    :cond_9
    const-string v0, "The installed version of Google Play services has been disabled on this device."

    .line 588
    .line 589
    goto :goto_a

    .line 590
    :cond_a
    const-string v0, "The installed version of Google Play services is out of date."

    .line 591
    .line 592
    goto :goto_a

    .line 593
    :cond_b
    const-string v0, "Google Play services is missing on this device."

    .line 594
    .line 595
    :goto_a
    const-string v2, "SafetyNet unavailable; unable to connect to Google Play Services: "

    .line 596
    .line 597
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    invoke-direct {v6, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 602
    .line 603
    .line 604
    invoke-virtual {v4, v6}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 605
    .line 606
    .line 607
    :goto_b
    return-void

    .line 608
    :pswitch_11
    iget-object v0, v1, LC8/d;->b:Ljava/lang/Object;

    .line 609
    .line 610
    check-cast v0, Lcom/vungle/ads/internal/platform/c;

    .line 611
    .line 612
    iget-object v2, v1, LC8/d;->c:Ljava/lang/Object;

    .line 613
    .line 614
    check-cast v2, Lcom/vungle/ads/internal/network/w;

    .line 615
    .line 616
    invoke-static {v0, v2}, Lcom/vungle/ads/internal/platform/c;->a(Lcom/vungle/ads/internal/platform/c;Lj1/a;)V

    .line 617
    .line 618
    .line 619
    return-void

    .line 620
    :pswitch_12
    invoke-direct {v1}, LC8/d;->c()V

    .line 621
    .line 622
    .line 623
    return-void

    .line 624
    :pswitch_13
    invoke-direct {v1}, LC8/d;->b()V

    .line 625
    .line 626
    .line 627
    return-void

    .line 628
    :pswitch_14
    sget-object v0, Lef/C;->a:Lef/C;

    .line 629
    .line 630
    iget-object v2, v1, LC8/d;->b:Ljava/lang/Object;

    .line 631
    .line 632
    check-cast v2, LEf/n;

    .line 633
    .line 634
    iget-object v3, v1, LC8/d;->c:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v3, LFf/e;

    .line 637
    .line 638
    invoke-virtual {v2, v3, v0}, LEf/n;->C(LEf/A;Ljava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    return-void

    .line 642
    :pswitch_15
    iget-object v2, v1, LC8/d;->b:Ljava/lang/Object;

    .line 643
    .line 644
    check-cast v2, LFe/h;

    .line 645
    .line 646
    iget-object v6, v1, LC8/d;->c:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast v6, Ljava/lang/String;

    .line 649
    .line 650
    iget-object v2, v2, LFe/h;->a:LFe/a;

    .line 651
    .line 652
    check-cast v2, LFe/m;

    .line 653
    .line 654
    iget-object v7, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 655
    .line 656
    check-cast v7, Lac/a;

    .line 657
    .line 658
    :try_start_8
    iget-object v8, v2, LFe/m;->e:Landroidx/fragment/app/X;

    .line 659
    .line 660
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 661
    .line 662
    .line 663
    invoke-static {v6}, Landroidx/fragment/app/X;->j(Ljava/lang/String;)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v8

    .line 667
    check-cast v8, Ljava/util/Map;

    .line 668
    .line 669
    iget-object v9, v2, LFe/m;->f:Lge/a;

    .line 670
    .line 671
    const-string v10, "data"

    .line 672
    .line 673
    invoke-interface {v8, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v8

    .line 677
    const-string v10, "null cannot be cast to non-null type kotlin.collections.Map<*, *>"

    .line 678
    .line 679
    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    check-cast v8, Ljava/util/Map;

    .line 683
    .line 684
    invoke-interface {v9, v8}, Lge/a;->i(Ljava/util/Map;)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v8

    .line 688
    check-cast v8, Lae/f;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    .line 689
    .line 690
    iget-object v6, v8, Lae/f;->a:Lae/e;

    .line 691
    .line 692
    new-instance v9, Ljava/lang/StringBuilder;

    .line 693
    .line 694
    const-string v10, "ScreenPresenter -> handling action with type "

    .line 695
    .line 696
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v6

    .line 706
    invoke-virtual {v7, v6}, Lac/a;->O(Ljava/lang/String;)V

    .line 707
    .line 708
    .line 709
    iget-object v6, v8, Lae/f;->a:Lae/e;

    .line 710
    .line 711
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 712
    .line 713
    .line 714
    move-result v9

    .line 715
    const-string v10, "android.intent.action.VIEW"

    .line 716
    .line 717
    const/16 v11, 0x8

    .line 718
    .line 719
    iget-object v12, v2, LFe/m;->c:LFe/h;

    .line 720
    .line 721
    iget-object v8, v8, Lae/f;->b:Ljava/util/Map;

    .line 722
    .line 723
    packed-switch v9, :pswitch_data_1

    .line 724
    .line 725
    .line 726
    new-instance v0, Ljava/lang/StringBuilder;

    .line 727
    .line 728
    const-string v2, "ScreenPresenter -> action type "

    .line 729
    .line 730
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 731
    .line 732
    .line 733
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 734
    .line 735
    .line 736
    const-string v2, " is not supported"

    .line 737
    .line 738
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 739
    .line 740
    .line 741
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    invoke-static {v7, v0}, LBa/c;->U(Lac/a;Ljava/lang/String;)V

    .line 746
    .line 747
    .line 748
    goto/16 :goto_13

    .line 749
    .line 750
    :pswitch_16
    iget-object v0, v12, LFe/h;->d:LX2/j;

    .line 751
    .line 752
    if-eqz v0, :cond_c

    .line 753
    .line 754
    iget-object v0, v0, LX2/j;->c:Ljava/lang/Object;

    .line 755
    .line 756
    check-cast v0, Landroid/webkit/WebView;

    .line 757
    .line 758
    goto :goto_c

    .line 759
    :cond_c
    move-object v0, v4

    .line 760
    :goto_c
    if-nez v0, :cond_d

    .line 761
    .line 762
    goto :goto_d

    .line 763
    :cond_d
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 764
    .line 765
    .line 766
    :goto_d
    iget-object v0, v12, LFe/h;->d:LX2/j;

    .line 767
    .line 768
    if-eqz v0, :cond_e

    .line 769
    .line 770
    iget-object v0, v0, LX2/j;->b:Ljava/lang/Object;

    .line 771
    .line 772
    check-cast v0, Ly3/j;

    .line 773
    .line 774
    iget-object v0, v0, Ly3/j;->b:Ljava/lang/Object;

    .line 775
    .line 776
    move-object v4, v0

    .line 777
    check-cast v4, Landroid/widget/ProgressBar;

    .line 778
    .line 779
    :cond_e
    if-nez v4, :cond_f

    .line 780
    .line 781
    goto/16 :goto_13

    .line 782
    .line 783
    :cond_f
    invoke-virtual {v4, v11}, Landroid/view/View;->setVisibility(I)V

    .line 784
    .line 785
    .line 786
    goto/16 :goto_13

    .line 787
    .line 788
    :pswitch_17
    if-eqz v8, :cond_10

    .line 789
    .line 790
    sget-object v0, Lae/c;->f:Lae/c;

    .line 791
    .line 792
    invoke-interface {v8, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    goto :goto_e

    .line 797
    :cond_10
    move-object v0, v4

    .line 798
    :goto_e
    instance-of v3, v0, Ljava/util/List;

    .line 799
    .line 800
    if-eqz v3, :cond_11

    .line 801
    .line 802
    move-object v4, v0

    .line 803
    check-cast v4, Ljava/util/List;

    .line 804
    .line 805
    :cond_11
    if-eqz v4, :cond_1f

    .line 806
    .line 807
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 808
    .line 809
    .line 810
    move-result v0

    .line 811
    if-nez v0, :cond_1f

    .line 812
    .line 813
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    .line 814
    .line 815
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    new-instance v3, LFe/j;

    .line 820
    .line 821
    invoke-direct {v3, v2, v4}, LFe/j;-><init>(LFe/m;Ljava/util/List;)V

    .line 822
    .line 823
    .line 824
    invoke-interface {v0, v3}, Lcom/qonversion/android/sdk/Qonversion;->products(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V

    .line 825
    .line 826
    .line 827
    goto/16 :goto_13

    .line 828
    .line 829
    :pswitch_18
    new-instance v0, Lae/f;

    .line 830
    .line 831
    sget-object v2, Lae/e;->j:Lae/e;

    .line 832
    .line 833
    invoke-direct {v0, v2}, Lae/f;-><init>(Lae/e;)V

    .line 834
    .line 835
    .line 836
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 837
    .line 838
    .line 839
    iget-object v2, v12, LFe/h;->d:LX2/j;

    .line 840
    .line 841
    if-eqz v2, :cond_12

    .line 842
    .line 843
    iget-object v2, v2, LX2/j;->b:Ljava/lang/Object;

    .line 844
    .line 845
    check-cast v2, Ly3/j;

    .line 846
    .line 847
    iget-object v2, v2, Ly3/j;->b:Ljava/lang/Object;

    .line 848
    .line 849
    move-object v4, v2

    .line 850
    check-cast v4, Landroid/widget/ProgressBar;

    .line 851
    .line 852
    :cond_12
    if-nez v4, :cond_13

    .line 853
    .line 854
    goto :goto_f

    .line 855
    :cond_13
    invoke-virtual {v4, v11}, Landroid/view/View;->setVisibility(I)V

    .line 856
    .line 857
    .line 858
    :goto_f
    invoke-virtual {v12}, Landroidx/fragment/app/F;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 859
    .line 860
    .line 861
    move-result-object v2

    .line 862
    if-eqz v2, :cond_14

    .line 863
    .line 864
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    .line 865
    .line 866
    .line 867
    :cond_14
    iget-object v2, v12, LFe/h;->c:Lre/c;

    .line 868
    .line 869
    if-eqz v2, :cond_15

    .line 870
    .line 871
    invoke-virtual {v2, v0}, Lre/c;->e(Lae/f;)V

    .line 872
    .line 873
    .line 874
    :cond_15
    if-eqz v2, :cond_1f

    .line 875
    .line 876
    invoke-virtual {v2}, Lre/c;->c()V

    .line 877
    .line 878
    .line 879
    goto/16 :goto_13

    .line 880
    .line 881
    :pswitch_19
    new-instance v0, Lae/f;

    .line 882
    .line 883
    sget-object v2, Lae/e;->i:Lae/e;

    .line 884
    .line 885
    invoke-direct {v0, v2}, Lae/f;-><init>(Lae/e;)V

    .line 886
    .line 887
    .line 888
    invoke-virtual {v12, v0}, LFe/h;->H(Lae/f;)V

    .line 889
    .line 890
    .line 891
    goto/16 :goto_13

    .line 892
    .line 893
    :pswitch_1a
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 894
    .line 895
    .line 896
    new-instance v0, Lae/f;

    .line 897
    .line 898
    sget-object v2, Lae/e;->h:Lae/e;

    .line 899
    .line 900
    invoke-direct {v0, v2}, Lae/f;-><init>(Lae/e;)V

    .line 901
    .line 902
    .line 903
    iget-object v2, v12, LFe/h;->c:Lre/c;

    .line 904
    .line 905
    if-eqz v2, :cond_16

    .line 906
    .line 907
    invoke-virtual {v2, v0}, Lre/c;->f(Lae/f;)V

    .line 908
    .line 909
    .line 910
    :cond_16
    iget-object v2, v12, LFe/h;->d:LX2/j;

    .line 911
    .line 912
    if-eqz v2, :cond_17

    .line 913
    .line 914
    iget-object v2, v2, LX2/j;->b:Ljava/lang/Object;

    .line 915
    .line 916
    check-cast v2, Ly3/j;

    .line 917
    .line 918
    iget-object v2, v2, Ly3/j;->b:Ljava/lang/Object;

    .line 919
    .line 920
    move-object v4, v2

    .line 921
    check-cast v4, Landroid/widget/ProgressBar;

    .line 922
    .line 923
    :cond_17
    if-nez v4, :cond_18

    .line 924
    .line 925
    goto :goto_10

    .line 926
    :cond_18
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 927
    .line 928
    .line 929
    :goto_10
    sget-object v2, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    .line 930
    .line 931
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    .line 932
    .line 933
    .line 934
    move-result-object v2

    .line 935
    new-instance v3, LFe/d;

    .line 936
    .line 937
    invoke-direct {v3, v12, v0, v5}, LFe/d;-><init>(LFe/h;Lae/f;I)V

    .line 938
    .line 939
    .line 940
    invoke-interface {v2, v3}, Lcom/qonversion/android/sdk/Qonversion;->restore(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    .line 941
    .line 942
    .line 943
    goto/16 :goto_13

    .line 944
    .line 945
    :pswitch_1b
    if-eqz v8, :cond_1f

    .line 946
    .line 947
    sget-object v0, Lae/c;->e:Lae/c;

    .line 948
    .line 949
    invoke-interface {v8, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 950
    .line 951
    .line 952
    move-result-object v5

    .line 953
    if-eqz v5, :cond_1f

    .line 954
    .line 955
    move-object v13, v5

    .line 956
    check-cast v13, Ljava/lang/String;

    .line 957
    .line 958
    iget-object v2, v2, LFe/m;->h:Lqe/a;

    .line 959
    .line 960
    if-eqz v2, :cond_19

    .line 961
    .line 962
    iget-object v2, v2, Lqe/a;->a:Ljava/lang/String;

    .line 963
    .line 964
    move-object v14, v2

    .line 965
    goto :goto_11

    .line 966
    :cond_19
    move-object v14, v4

    .line 967
    :goto_11
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 968
    .line 969
    .line 970
    new-instance v2, Lae/f;

    .line 971
    .line 972
    sget-object v5, Lae/e;->g:Lae/e;

    .line 973
    .line 974
    invoke-direct {v2, v5, v0, v13}, Lae/f;-><init>(Lae/e;Lae/c;Ljava/lang/Object;)V

    .line 975
    .line 976
    .line 977
    iget-object v0, v12, LFe/h;->c:Lre/c;

    .line 978
    .line 979
    if-eqz v0, :cond_1a

    .line 980
    .line 981
    invoke-virtual {v0, v2}, Lre/c;->f(Lae/f;)V

    .line 982
    .line 983
    .line 984
    :cond_1a
    iget-object v0, v12, LFe/h;->d:LX2/j;

    .line 985
    .line 986
    if-eqz v0, :cond_1b

    .line 987
    .line 988
    iget-object v0, v0, LX2/j;->b:Ljava/lang/Object;

    .line 989
    .line 990
    check-cast v0, Ly3/j;

    .line 991
    .line 992
    iget-object v0, v0, Ly3/j;->b:Ljava/lang/Object;

    .line 993
    .line 994
    move-object v4, v0

    .line 995
    check-cast v4, Landroid/widget/ProgressBar;

    .line 996
    .line 997
    :cond_1b
    if-nez v4, :cond_1c

    .line 998
    .line 999
    goto :goto_12

    .line 1000
    :cond_1c
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1001
    .line 1002
    .line 1003
    :goto_12
    invoke-virtual {v12}, Landroidx/fragment/app/F;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v15

    .line 1007
    if-eqz v15, :cond_1f

    .line 1008
    .line 1009
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    .line 1010
    .line 1011
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v0

    .line 1015
    move-object/from16 v16, v12

    .line 1016
    .line 1017
    new-instance v12, LFe/f;

    .line 1018
    .line 1019
    move-object/from16 v17, v2

    .line 1020
    .line 1021
    invoke-direct/range {v12 .. v17}, LFe/f;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/FragmentActivity;LFe/h;Lae/f;)V

    .line 1022
    .line 1023
    .line 1024
    invoke-interface {v0, v12}, Lcom/qonversion/android/sdk/Qonversion;->products(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;)V

    .line 1025
    .line 1026
    .line 1027
    goto/16 :goto_13

    .line 1028
    .line 1029
    :pswitch_1c
    if-eqz v8, :cond_1f

    .line 1030
    .line 1031
    sget-object v3, Lae/c;->g:Lae/c;

    .line 1032
    .line 1033
    invoke-interface {v8, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v3

    .line 1037
    if-eqz v3, :cond_1f

    .line 1038
    .line 1039
    check-cast v3, Ljava/lang/String;

    .line 1040
    .line 1041
    :try_start_9
    iget-object v5, v2, LFe/m;->g:LEf/E;

    .line 1042
    .line 1043
    new-instance v6, LFe/k;

    .line 1044
    .line 1045
    invoke-direct {v6, v2, v3, v4}, LFe/k;-><init>(LFe/m;Ljava/lang/String;Ljf/c;)V

    .line 1046
    .line 1047
    .line 1048
    invoke-static {v5, v4, v6, v0}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5

    .line 1049
    .line 1050
    .line 1051
    goto/16 :goto_13

    .line 1052
    .line 1053
    :catch_5
    const-string v0, "ScreenPresenter -> failed to open the screen with id "

    .line 1054
    .line 1055
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v0

    .line 1059
    invoke-static {v7, v0}, LBa/c;->q(Lac/a;Ljava/lang/String;)V

    .line 1060
    .line 1061
    .line 1062
    goto/16 :goto_13

    .line 1063
    .line 1064
    :pswitch_1d
    move-object v0, v12

    .line 1065
    if-eqz v8, :cond_1f

    .line 1066
    .line 1067
    sget-object v2, Lae/c;->d:Lae/c;

    .line 1068
    .line 1069
    invoke-interface {v8, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v2

    .line 1073
    if-eqz v2, :cond_1f

    .line 1074
    .line 1075
    check-cast v2, Ljava/lang/String;

    .line 1076
    .line 1077
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1078
    .line 1079
    .line 1080
    new-instance v3, Lae/f;

    .line 1081
    .line 1082
    sget-object v4, Lae/e;->e:Lae/e;

    .line 1083
    .line 1084
    sget-object v5, Lae/c;->c:Lae/c;

    .line 1085
    .line 1086
    invoke-direct {v3, v4, v5, v2}, Lae/f;-><init>(Lae/e;Lae/c;Ljava/lang/Object;)V

    .line 1087
    .line 1088
    .line 1089
    iget-object v4, v0, LFe/h;->c:Lre/c;

    .line 1090
    .line 1091
    if-eqz v4, :cond_1d

    .line 1092
    .line 1093
    invoke-virtual {v4, v3}, Lre/c;->f(Lae/f;)V

    .line 1094
    .line 1095
    .line 1096
    :cond_1d
    :try_start_a
    new-instance v5, Landroid/content/Intent;

    .line 1097
    .line 1098
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v6

    .line 1102
    invoke-direct {v5, v10, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual {v0, v5}, Landroidx/fragment/app/F;->startActivity(Landroid/content/Intent;)V

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v0, v3}, LFe/h;->H(Lae/f;)V
    :try_end_a
    .catch Landroid/content/ActivityNotFoundException; {:try_start_a .. :try_end_a} :catch_6

    .line 1109
    .line 1110
    .line 1111
    goto :goto_13

    .line 1112
    :catch_6
    const-string v5, "ScreenActivity -> Couldn\'t find any Activity to handle the Intent with deeplink "

    .line 1113
    .line 1114
    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v2

    .line 1118
    iget-object v0, v0, LFe/h;->b:Lac/a;

    .line 1119
    .line 1120
    invoke-static {v0, v2}, LBa/c;->q(Lac/a;Ljava/lang/String;)V

    .line 1121
    .line 1122
    .line 1123
    if-eqz v4, :cond_1f

    .line 1124
    .line 1125
    invoke-virtual {v4, v3}, Lre/c;->b(Lae/f;)V

    .line 1126
    .line 1127
    .line 1128
    goto :goto_13

    .line 1129
    :pswitch_1e
    move-object v0, v12

    .line 1130
    if-eqz v8, :cond_1f

    .line 1131
    .line 1132
    sget-object v2, Lae/c;->c:Lae/c;

    .line 1133
    .line 1134
    invoke-interface {v8, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v3

    .line 1138
    if-eqz v3, :cond_1f

    .line 1139
    .line 1140
    check-cast v3, Ljava/lang/String;

    .line 1141
    .line 1142
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1143
    .line 1144
    .line 1145
    new-instance v4, Lae/f;

    .line 1146
    .line 1147
    sget-object v5, Lae/e;->d:Lae/e;

    .line 1148
    .line 1149
    invoke-direct {v4, v5, v2, v3}, Lae/f;-><init>(Lae/e;Lae/c;Ljava/lang/Object;)V

    .line 1150
    .line 1151
    .line 1152
    iget-object v2, v0, LFe/h;->c:Lre/c;

    .line 1153
    .line 1154
    if-eqz v2, :cond_1e

    .line 1155
    .line 1156
    invoke-virtual {v2, v4}, Lre/c;->f(Lae/f;)V

    .line 1157
    .line 1158
    .line 1159
    :cond_1e
    :try_start_b
    new-instance v5, Landroid/content/Intent;

    .line 1160
    .line 1161
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v6

    .line 1165
    invoke-direct {v5, v10, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual {v0, v5}, Landroidx/fragment/app/F;->startActivity(Landroid/content/Intent;)V

    .line 1169
    .line 1170
    .line 1171
    if-eqz v2, :cond_1f

    .line 1172
    .line 1173
    invoke-virtual {v2, v4}, Lre/c;->e(Lae/f;)V
    :try_end_b
    .catch Landroid/content/ActivityNotFoundException; {:try_start_b .. :try_end_b} :catch_7

    .line 1174
    .line 1175
    .line 1176
    goto :goto_13

    .line 1177
    :catch_7
    const-string v5, "ScreenActivity -> Couldn\'t find any Activity to handle the Intent with url "

    .line 1178
    .line 1179
    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v3

    .line 1183
    iget-object v0, v0, LFe/h;->b:Lac/a;

    .line 1184
    .line 1185
    invoke-static {v0, v3}, LBa/c;->q(Lac/a;Ljava/lang/String;)V

    .line 1186
    .line 1187
    .line 1188
    if-eqz v2, :cond_1f

    .line 1189
    .line 1190
    invoke-virtual {v2, v4}, Lre/c;->b(Lae/f;)V

    .line 1191
    .line 1192
    .line 1193
    goto :goto_13

    .line 1194
    :catch_8
    move-exception v0

    .line 1195
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1196
    .line 1197
    const-string v3, "ScreenPresenter -> failed to map action from web page: "

    .line 1198
    .line 1199
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1203
    .line 1204
    .line 1205
    const-string v0, ". Original message: "

    .line 1206
    .line 1207
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v0

    .line 1217
    invoke-static {v7, v0}, LBa/c;->q(Lac/a;Ljava/lang/String;)V

    .line 1218
    .line 1219
    .line 1220
    :cond_1f
    :goto_13
    return-void

    .line 1221
    :pswitch_1f
    iget-object v0, v1, LC8/d;->b:Ljava/lang/Object;

    .line 1222
    .line 1223
    check-cast v0, Lcom/vungle/ads/internal/persistence/FilePreferences;

    .line 1224
    .line 1225
    iget-object v2, v1, LC8/d;->c:Ljava/lang/Object;

    .line 1226
    .line 1227
    check-cast v2, Ljava/util/HashMap;

    .line 1228
    .line 1229
    invoke-static {v0, v2}, Lcom/vungle/ads/internal/persistence/FilePreferences;->a(Lcom/vungle/ads/internal/persistence/FilePreferences;Ljava/io/Serializable;)V

    .line 1230
    .line 1231
    .line 1232
    return-void

    .line 1233
    :pswitch_20
    invoke-direct {v1}, LC8/d;->a()V

    .line 1234
    .line 1235
    .line 1236
    return-void

    .line 1237
    :pswitch_21
    iget-object v0, v1, LC8/d;->b:Ljava/lang/Object;

    .line 1238
    .line 1239
    move-object v6, v0

    .line 1240
    check-cast v6, LE5/I;

    .line 1241
    .line 1242
    iget-object v0, v1, LC8/d;->c:Ljava/lang/Object;

    .line 1243
    .line 1244
    check-cast v0, LA6/d;

    .line 1245
    .line 1246
    iget v2, v6, LE5/I;->H:I

    .line 1247
    .line 1248
    iget v4, v0, LA6/d;->b:I

    .line 1249
    .line 1250
    sub-int/2addr v2, v4

    .line 1251
    iput v2, v6, LE5/I;->H:I

    .line 1252
    .line 1253
    iget-boolean v4, v0, LA6/d;->c:Z

    .line 1254
    .line 1255
    if-eqz v4, :cond_20

    .line 1256
    .line 1257
    iget v4, v0, LA6/d;->d:I

    .line 1258
    .line 1259
    iput v4, v6, LE5/I;->I:I

    .line 1260
    .line 1261
    iput-boolean v5, v6, LE5/I;->J:Z

    .line 1262
    .line 1263
    :cond_20
    iget-boolean v4, v0, LA6/d;->e:Z

    .line 1264
    .line 1265
    if-eqz v4, :cond_21

    .line 1266
    .line 1267
    iget v4, v0, LA6/d;->f:I

    .line 1268
    .line 1269
    iput v4, v6, LE5/I;->K:I

    .line 1270
    .line 1271
    :cond_21
    if-nez v2, :cond_2b

    .line 1272
    .line 1273
    iget-object v2, v0, LA6/d;->g:Ljava/lang/Object;

    .line 1274
    .line 1275
    check-cast v2, LE5/q0;

    .line 1276
    .line 1277
    iget-object v2, v2, LE5/q0;->a:LE5/J0;

    .line 1278
    .line 1279
    iget-object v4, v6, LE5/I;->j0:LE5/q0;

    .line 1280
    .line 1281
    iget-object v4, v4, LE5/q0;->a:LE5/J0;

    .line 1282
    .line 1283
    invoke-virtual {v4}, LE5/J0;->p()Z

    .line 1284
    .line 1285
    .line 1286
    move-result v4

    .line 1287
    if-nez v4, :cond_22

    .line 1288
    .line 1289
    invoke-virtual {v2}, LE5/J0;->p()Z

    .line 1290
    .line 1291
    .line 1292
    move-result v4

    .line 1293
    if-eqz v4, :cond_22

    .line 1294
    .line 1295
    const/4 v4, -0x1

    .line 1296
    iput v4, v6, LE5/I;->k0:I

    .line 1297
    .line 1298
    const-wide/16 v7, 0x0

    .line 1299
    .line 1300
    iput-wide v7, v6, LE5/I;->l0:J

    .line 1301
    .line 1302
    :cond_22
    invoke-virtual {v2}, LE5/J0;->p()Z

    .line 1303
    .line 1304
    .line 1305
    move-result v4

    .line 1306
    if-nez v4, :cond_24

    .line 1307
    .line 1308
    move-object v4, v2

    .line 1309
    check-cast v4, LE5/z0;

    .line 1310
    .line 1311
    iget-object v4, v4, LE5/z0;->h:[LE5/J0;

    .line 1312
    .line 1313
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v4

    .line 1317
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1318
    .line 1319
    .line 1320
    move-result v7

    .line 1321
    iget-object v8, v6, LE5/I;->o:Ljava/util/ArrayList;

    .line 1322
    .line 1323
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 1324
    .line 1325
    .line 1326
    move-result v8

    .line 1327
    if-ne v7, v8, :cond_23

    .line 1328
    .line 1329
    move v7, v5

    .line 1330
    goto :goto_14

    .line 1331
    :cond_23
    move v7, v3

    .line 1332
    :goto_14
    invoke-static {v7}, Lu6/a;->i(Z)V

    .line 1333
    .line 1334
    .line 1335
    move v7, v3

    .line 1336
    :goto_15
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1337
    .line 1338
    .line 1339
    move-result v8

    .line 1340
    if-ge v7, v8, :cond_24

    .line 1341
    .line 1342
    iget-object v8, v6, LE5/I;->o:Ljava/util/ArrayList;

    .line 1343
    .line 1344
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v8

    .line 1348
    check-cast v8, LE5/H;

    .line 1349
    .line 1350
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v9

    .line 1354
    check-cast v9, LE5/J0;

    .line 1355
    .line 1356
    iput-object v9, v8, LE5/H;->b:LE5/J0;

    .line 1357
    .line 1358
    add-int/2addr v7, v5

    .line 1359
    goto :goto_15

    .line 1360
    :cond_24
    iget-boolean v4, v6, LE5/I;->J:Z

    .line 1361
    .line 1362
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    if-eqz v4, :cond_2a

    .line 1368
    .line 1369
    iget-object v4, v0, LA6/d;->g:Ljava/lang/Object;

    .line 1370
    .line 1371
    check-cast v4, LE5/q0;

    .line 1372
    .line 1373
    iget-object v4, v4, LE5/q0;->b:Lf6/z;

    .line 1374
    .line 1375
    iget-object v9, v6, LE5/I;->j0:LE5/q0;

    .line 1376
    .line 1377
    iget-object v9, v9, LE5/q0;->b:Lf6/z;

    .line 1378
    .line 1379
    invoke-virtual {v4, v9}, Lf6/x;->equals(Ljava/lang/Object;)Z

    .line 1380
    .line 1381
    .line 1382
    move-result v4

    .line 1383
    if-eqz v4, :cond_26

    .line 1384
    .line 1385
    iget-object v4, v0, LA6/d;->g:Ljava/lang/Object;

    .line 1386
    .line 1387
    check-cast v4, LE5/q0;

    .line 1388
    .line 1389
    iget-wide v9, v4, LE5/q0;->d:J

    .line 1390
    .line 1391
    iget-object v4, v6, LE5/I;->j0:LE5/q0;

    .line 1392
    .line 1393
    iget-wide v11, v4, LE5/q0;->r:J

    .line 1394
    .line 1395
    cmp-long v4, v9, v11

    .line 1396
    .line 1397
    if-eqz v4, :cond_25

    .line 1398
    .line 1399
    goto :goto_16

    .line 1400
    :cond_25
    move v5, v3

    .line 1401
    :cond_26
    :goto_16
    if-eqz v5, :cond_29

    .line 1402
    .line 1403
    invoke-virtual {v2}, LE5/J0;->p()Z

    .line 1404
    .line 1405
    .line 1406
    move-result v4

    .line 1407
    if-nez v4, :cond_28

    .line 1408
    .line 1409
    iget-object v4, v0, LA6/d;->g:Ljava/lang/Object;

    .line 1410
    .line 1411
    check-cast v4, LE5/q0;

    .line 1412
    .line 1413
    iget-object v4, v4, LE5/q0;->b:Lf6/z;

    .line 1414
    .line 1415
    invoke-virtual {v4}, Lf6/x;->a()Z

    .line 1416
    .line 1417
    .line 1418
    move-result v4

    .line 1419
    if-eqz v4, :cond_27

    .line 1420
    .line 1421
    goto :goto_17

    .line 1422
    :cond_27
    iget-object v4, v0, LA6/d;->g:Ljava/lang/Object;

    .line 1423
    .line 1424
    check-cast v4, LE5/q0;

    .line 1425
    .line 1426
    iget-object v7, v4, LE5/q0;->b:Lf6/z;

    .line 1427
    .line 1428
    iget-wide v8, v4, LE5/q0;->d:J

    .line 1429
    .line 1430
    iget-object v4, v7, Lf6/x;->a:Ljava/lang/Object;

    .line 1431
    .line 1432
    iget-object v7, v6, LE5/I;->n:LE5/H0;

    .line 1433
    .line 1434
    invoke-virtual {v2, v4, v7}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 1435
    .line 1436
    .line 1437
    iget-wide v10, v7, LE5/H0;->e:J

    .line 1438
    .line 1439
    add-long/2addr v8, v10

    .line 1440
    move-wide v7, v8

    .line 1441
    goto :goto_18

    .line 1442
    :cond_28
    :goto_17
    iget-object v2, v0, LA6/d;->g:Ljava/lang/Object;

    .line 1443
    .line 1444
    check-cast v2, LE5/q0;

    .line 1445
    .line 1446
    iget-wide v7, v2, LE5/q0;->d:J

    .line 1447
    .line 1448
    :cond_29
    :goto_18
    move v11, v5

    .line 1449
    :goto_19
    move-wide v13, v7

    .line 1450
    goto :goto_1a

    .line 1451
    :cond_2a
    move v11, v3

    .line 1452
    goto :goto_19

    .line 1453
    :goto_1a
    iput-boolean v3, v6, LE5/I;->J:Z

    .line 1454
    .line 1455
    iget-object v0, v0, LA6/d;->g:Ljava/lang/Object;

    .line 1456
    .line 1457
    move-object v7, v0

    .line 1458
    check-cast v7, LE5/q0;

    .line 1459
    .line 1460
    iget v9, v6, LE5/I;->K:I

    .line 1461
    .line 1462
    iget v12, v6, LE5/I;->I:I

    .line 1463
    .line 1464
    const/4 v15, -0x1

    .line 1465
    const/16 v16, 0x0

    .line 1466
    .line 1467
    const/4 v8, 0x1

    .line 1468
    const/4 v10, 0x0

    .line 1469
    invoke-virtual/range {v6 .. v16}, LE5/I;->O0(LE5/q0;IIZZIJIZ)V

    .line 1470
    .line 1471
    .line 1472
    :cond_2b
    return-void

    .line 1473
    :pswitch_22
    iget-object v0, v1, LC8/d;->b:Ljava/lang/Object;

    .line 1474
    .line 1475
    check-cast v0, Lcom/vungle/ads/internal/load/j;

    .line 1476
    .line 1477
    iget-object v2, v1, LC8/d;->c:Ljava/lang/Object;

    .line 1478
    .line 1479
    check-cast v2, Ljava/lang/Throwable;

    .line 1480
    .line 1481
    invoke-static {v0, v2}, Lcom/vungle/ads/internal/load/i;->a(Lcom/vungle/ads/internal/load/j;Ljava/lang/Throwable;)V

    .line 1482
    .line 1483
    .line 1484
    return-void

    .line 1485
    :pswitch_23
    iget-object v0, v1, LC8/d;->b:Ljava/lang/Object;

    .line 1486
    .line 1487
    check-cast v0, Lcom/vungle/ads/internal/load/g;

    .line 1488
    .line 1489
    iget-object v2, v1, LC8/d;->c:Ljava/lang/Object;

    .line 1490
    .line 1491
    check-cast v2, Lcom/vungle/ads/internal/model/b;

    .line 1492
    .line 1493
    invoke-static {v0, v2}, Lcom/vungle/ads/internal/load/c;->a(Lcom/vungle/ads/internal/load/g;Lcom/vungle/ads/internal/model/b;)V

    .line 1494
    .line 1495
    .line 1496
    return-void

    .line 1497
    :pswitch_24
    iget-object v0, v1, LC8/d;->b:Ljava/lang/Object;

    .line 1498
    .line 1499
    check-cast v0, LC8/f;

    .line 1500
    .line 1501
    iget-object v0, v0, LC8/f;->e:LC8/l;

    .line 1502
    .line 1503
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1504
    .line 1505
    .line 1506
    iget-object v2, v1, LC8/d;->c:Ljava/lang/Object;

    .line 1507
    .line 1508
    check-cast v2, LC8/b;

    .line 1509
    .line 1510
    instance-of v3, v2, LC8/b;

    .line 1511
    .line 1512
    const-string v5, "com.google.firebase.appcheck.TOKEN_TYPE"

    .line 1513
    .line 1514
    const-string v6, "com.google.firebase.appcheck.APP_CHECK_TOKEN"

    .line 1515
    .line 1516
    iget-object v0, v0, LC8/l;->a:LL8/p;

    .line 1517
    .line 1518
    if-eqz v3, :cond_2c

    .line 1519
    .line 1520
    invoke-virtual {v0}, LL8/p;->get()Ljava/lang/Object;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v0

    .line 1524
    check-cast v0, Landroid/content/SharedPreferences;

    .line 1525
    .line 1526
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v3

    .line 1530
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1531
    .line 1532
    .line 1533
    :try_start_c
    new-instance v0, Lorg/json/JSONObject;

    .line 1534
    .line 1535
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 1536
    .line 1537
    .line 1538
    const-string v7, "token"

    .line 1539
    .line 1540
    iget-object v8, v2, LC8/b;->a:Ljava/lang/String;

    .line 1541
    .line 1542
    invoke-virtual {v0, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1543
    .line 1544
    .line 1545
    const-string v7, "receivedAt"

    .line 1546
    .line 1547
    iget-wide v8, v2, LC8/b;->b:J

    .line 1548
    .line 1549
    invoke-virtual {v0, v7, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1550
    .line 1551
    .line 1552
    const-string v7, "expiresIn"

    .line 1553
    .line 1554
    iget-wide v8, v2, LC8/b;->c:J

    .line 1555
    .line 1556
    invoke-virtual {v0, v7, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1557
    .line 1558
    .line 1559
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v4
    :try_end_c
    .catch Lorg/json/JSONException; {:try_start_c .. :try_end_c} :catch_9

    .line 1563
    goto :goto_1b

    .line 1564
    :catch_9
    move-exception v0

    .line 1565
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1566
    .line 1567
    const-string v7, "Could not serialize token: "

    .line 1568
    .line 1569
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1570
    .line 1571
    .line 1572
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v0

    .line 1576
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1577
    .line 1578
    .line 1579
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v0

    .line 1583
    const-string v2, "C8.b"

    .line 1584
    .line 1585
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1586
    .line 1587
    .line 1588
    :goto_1b
    invoke-interface {v3, v6, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v0

    .line 1592
    const-string v2, "DEFAULT_APP_CHECK_TOKEN"

    .line 1593
    .line 1594
    invoke-interface {v0, v5, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v0

    .line 1598
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1599
    .line 1600
    .line 1601
    goto :goto_1c

    .line 1602
    :cond_2c
    invoke-virtual {v0}, LL8/p;->get()Ljava/lang/Object;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v0

    .line 1606
    check-cast v0, Landroid/content/SharedPreferences;

    .line 1607
    .line 1608
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v0

    .line 1612
    iget-object v2, v2, LC8/b;->a:Ljava/lang/String;

    .line 1613
    .line 1614
    invoke-interface {v0, v6, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v0

    .line 1618
    const-string v2, "UNKNOWN_APP_CHECK_TOKEN"

    .line 1619
    .line 1620
    invoke-interface {v0, v5, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v0

    .line 1624
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1625
    .line 1626
    .line 1627
    :goto_1c
    return-void

    .line 1628
    :pswitch_25
    iget-object v0, v1, LC8/d;->b:Ljava/lang/Object;

    .line 1629
    .line 1630
    move-object v3, v0

    .line 1631
    check-cast v3, LC8/f;

    .line 1632
    .line 1633
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1634
    .line 1635
    .line 1636
    sget-object v0, LC8/l;->b:LD8/a;

    .line 1637
    .line 1638
    iget-object v6, v0, LD8/a;->b:Ljava/lang/String;

    .line 1639
    .line 1640
    iget-object v0, v3, LC8/f;->e:LC8/l;

    .line 1641
    .line 1642
    iget-object v7, v0, LC8/l;->a:LL8/p;

    .line 1643
    .line 1644
    invoke-virtual {v7}, LL8/p;->get()Ljava/lang/Object;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v0

    .line 1648
    check-cast v0, Landroid/content/SharedPreferences;

    .line 1649
    .line 1650
    const-string v8, "com.google.firebase.appcheck.TOKEN_TYPE"

    .line 1651
    .line 1652
    invoke-interface {v0, v8, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v9

    .line 1656
    invoke-virtual {v7}, LL8/p;->get()Ljava/lang/Object;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v0

    .line 1660
    check-cast v0, Landroid/content/SharedPreferences;

    .line 1661
    .line 1662
    const-string v10, "com.google.firebase.appcheck.APP_CHECK_TOKEN"

    .line 1663
    .line 1664
    invoke-interface {v0, v10, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v0

    .line 1668
    if-eqz v9, :cond_2f

    .line 1669
    .line 1670
    if-nez v0, :cond_2d

    .line 1671
    .line 1672
    goto :goto_1e

    .line 1673
    :cond_2d
    if-eqz v9, :cond_33

    .line 1674
    .line 1675
    :try_start_d
    const-string v11, "DEFAULT_APP_CHECK_TOKEN"

    .line 1676
    .line 1677
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1678
    .line 1679
    .line 1680
    move-result v11

    .line 1681
    if-eqz v11, :cond_2e

    .line 1682
    .line 1683
    move v2, v5

    .line 1684
    goto :goto_1d

    .line 1685
    :cond_2e
    const-string v11, "UNKNOWN_APP_CHECK_TOKEN"

    .line 1686
    .line 1687
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1688
    .line 1689
    .line 1690
    move-result v11

    .line 1691
    if-eqz v11, :cond_32

    .line 1692
    .line 1693
    :goto_1d
    invoke-static {v2}, LA/f;->f(I)I

    .line 1694
    .line 1695
    .line 1696
    move-result v2
    :try_end_d
    .catch Ljava/lang/IllegalArgumentException; {:try_start_d .. :try_end_d} :catch_a

    .line 1697
    if-eqz v2, :cond_31

    .line 1698
    .line 1699
    if-eq v2, v5, :cond_30

    .line 1700
    .line 1701
    const-string v0, "Reached unreachable section in #retrieveAppCheckToken()"

    .line 1702
    .line 1703
    invoke-static {v6, v0, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1704
    .line 1705
    .line 1706
    :cond_2f
    :goto_1e
    move-object v0, v4

    .line 1707
    goto :goto_20

    .line 1708
    :cond_30
    :try_start_e
    invoke-static {v0}, LC8/b;->b(Ljava/lang/String;)LC8/b;

    .line 1709
    .line 1710
    .line 1711
    move-result-object v0

    .line 1712
    goto :goto_20

    .line 1713
    :catch_a
    move-exception v0

    .line 1714
    goto :goto_1f

    .line 1715
    :cond_31
    invoke-static {v0}, LC8/b;->c(Ljava/lang/String;)LC8/b;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v0

    .line 1719
    goto :goto_20

    .line 1720
    :cond_32
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1721
    .line 1722
    const-string v2, "No enum constant com.google.firebase.appcheck.internal.StorageHelper.TokenType."

    .line 1723
    .line 1724
    invoke-virtual {v2, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1725
    .line 1726
    .line 1727
    move-result-object v2

    .line 1728
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1729
    .line 1730
    .line 1731
    throw v0

    .line 1732
    :cond_33
    new-instance v0, Ljava/lang/NullPointerException;

    .line 1733
    .line 1734
    const-string v2, "Name is null"

    .line 1735
    .line 1736
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1737
    .line 1738
    .line 1739
    throw v0
    :try_end_e
    .catch Ljava/lang/IllegalArgumentException; {:try_start_e .. :try_end_e} :catch_a

    .line 1740
    :goto_1f
    const-string v2, "Failed to parse TokenType of stored token  with type ["

    .line 1741
    .line 1742
    const-string v5, "] with exception: "

    .line 1743
    .line 1744
    invoke-static {v2, v9, v5}, Lcom/google/android/gms/internal/consent_sdk/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v2

    .line 1748
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1749
    .line 1750
    .line 1751
    move-result-object v0

    .line 1752
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1753
    .line 1754
    .line 1755
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v0

    .line 1759
    invoke-static {v6, v0, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1760
    .line 1761
    .line 1762
    invoke-virtual {v7}, LL8/p;->get()Ljava/lang/Object;

    .line 1763
    .line 1764
    .line 1765
    move-result-object v0

    .line 1766
    check-cast v0, Landroid/content/SharedPreferences;

    .line 1767
    .line 1768
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v0

    .line 1772
    invoke-interface {v0, v10}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1773
    .line 1774
    .line 1775
    move-result-object v0

    .line 1776
    invoke-interface {v0, v8}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v0

    .line 1780
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1781
    .line 1782
    .line 1783
    goto :goto_1e

    .line 1784
    :goto_20
    if-eqz v0, :cond_34

    .line 1785
    .line 1786
    iput-object v0, v3, LC8/f;->m:LC8/b;

    .line 1787
    .line 1788
    :cond_34
    iget-object v0, v1, LC8/d;->c:Ljava/lang/Object;

    .line 1789
    .line 1790
    check-cast v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 1791
    .line 1792
    invoke-virtual {v0, v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 1793
    .line 1794
    .line 1795
    return-void

    .line 1796
    nop

    .line 1797
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
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

    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
    .end packed-switch
.end method
