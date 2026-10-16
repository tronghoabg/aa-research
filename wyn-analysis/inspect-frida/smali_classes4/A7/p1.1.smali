.class public final LA7/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public c:Z

.field public final synthetic d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LA7/m1;LA7/N1;ZLA7/d;LA7/d;)V
    .locals 0

    const/4 p5, 0x2

    iput p5, p0, LA7/p1;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LA7/p1;->b:Ljava/lang/Object;

    iput-boolean p3, p0, LA7/p1;->c:Z

    iput-object p4, p0, LA7/p1;->e:Ljava/lang/Object;

    iput-object p1, p0, LA7/p1;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(LA7/m1;LA7/N1;ZLf7/a;I)V
    .locals 0

    .line 1
    iput p5, p0, LA7/p1;->a:I

    iput-object p2, p0, LA7/p1;->b:Ljava/lang/Object;

    iput-boolean p3, p0, LA7/p1;->c:Z

    iput-object p4, p0, LA7/p1;->e:Ljava/lang/Object;

    iput-object p1, p0, LA7/p1;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/firebase/iid/FirebaseInstanceIdReceiver;Landroid/content/Intent;Landroid/content/Context;ZLandroid/content/BroadcastReceiver$PendingResult;)V
    .locals 0

    const/4 p1, 0x3

    iput p1, p0, LA7/p1;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LA7/p1;->b:Ljava/lang/Object;

    iput-object p3, p0, LA7/p1;->e:Ljava/lang/Object;

    iput-boolean p4, p0, LA7/p1;->c:Z

    iput-object p5, p0, LA7/p1;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lpd/m;Lrd/h;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LA7/p1;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA7/p1;->d:Ljava/lang/Object;

    .line 5
    new-instance p1, Lba/a;

    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const/16 v0, 0x13

    invoke-direct {p1, v0}, Lba/a;-><init>(I)V

    iput-object p1, p0, LA7/p1;->b:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, LA7/p1;->c:Z

    .line 7
    iput-object p2, p0, LA7/p1;->e:Ljava/lang/Object;

    return-void
.end method

.method private final a()V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LA7/p1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/content/Intent;

    .line 6
    .line 7
    iget-object v2, v1, LA7/p1;->e:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v5, v2

    .line 10
    check-cast v5, Landroid/content/Context;

    .line 11
    .line 12
    iget-boolean v2, v1, LA7/p1;->c:Z

    .line 13
    .line 14
    iget-object v3, v1, LA7/p1;->d:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v9, v3

    .line 17
    check-cast v9, Landroid/content/BroadcastReceiver$PendingResult;

    .line 18
    .line 19
    :try_start_0
    const-string v3, "wrapped_intent"

    .line 20
    .line 21
    invoke-virtual {v0, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    instance-of v4, v3, Landroid/content/Intent;

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    check-cast v3, Landroid/content/Intent;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto/16 :goto_7

    .line 35
    .line 36
    :cond_0
    move-object v3, v6

    .line 37
    :goto_0
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-static {v3}, Lcom/google/firebase/iid/FirebaseInstanceIdReceiver;->a(Landroid/content/Intent;)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    goto/16 :goto_5

    .line 44
    .line 45
    :cond_1
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    const/16 v10, 0x1f4

    .line 50
    .line 51
    if-nez v3, :cond_3

    .line 52
    .line 53
    :cond_2
    :goto_1
    move v0, v10

    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :cond_3
    move-object v3, v6

    .line 57
    new-instance v6, Lc7/a;

    .line 58
    .line 59
    invoke-direct {v6, v0}, Lc7/a;-><init>(Landroid/content/Intent;)V

    .line 60
    .line 61
    .line 62
    new-instance v7, Ljava/util/concurrent/CountDownLatch;

    .line 63
    .line 64
    const/4 v4, 0x1

    .line 65
    invoke-direct {v7, v4}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 66
    .line 67
    .line 68
    const-class v8, Lcom/google/firebase/iid/FirebaseInstanceIdReceiver;

    .line 69
    .line 70
    monitor-enter v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    :try_start_1
    sget-object v11, Lcom/google/firebase/iid/FirebaseInstanceIdReceiver;->b:Ljava/lang/ref/SoftReference;

    .line 72
    .line 73
    if-eqz v11, :cond_4

    .line 74
    .line 75
    invoke-virtual {v11}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Ljava/util/concurrent/Executor;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :catchall_1
    move-exception v0

    .line 83
    goto/16 :goto_6

    .line 84
    .line 85
    :cond_4
    :goto_2
    if-nez v3, :cond_5

    .line 86
    .line 87
    invoke-static {}, Lcom/google/android/gms/internal/cloudmessaging/zze;->zza()Lcom/google/android/gms/internal/cloudmessaging/zzb;

    .line 88
    .line 89
    .line 90
    new-instance v3, LH6/b;

    .line 91
    .line 92
    const-string v11, "pscm-ack-executor"

    .line 93
    .line 94
    const/4 v12, 0x2

    .line 95
    invoke-direct {v3, v11, v12}, LH6/b;-><init>(Ljava/lang/String;I)V

    .line 96
    .line 97
    .line 98
    new-instance v11, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 99
    .line 100
    sget-object v16, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 101
    .line 102
    new-instance v17, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 103
    .line 104
    invoke-direct/range {v17 .. v17}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 105
    .line 106
    .line 107
    const-wide/16 v14, 0x3c

    .line 108
    .line 109
    const/4 v12, 0x1

    .line 110
    const/4 v13, 0x1

    .line 111
    move-object/from16 v18, v3

    .line 112
    .line 113
    invoke-direct/range {v11 .. v18}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v11, v4}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 117
    .line 118
    .line 119
    invoke-static {v11}, Ljava/util/concurrent/Executors;->unconfigurableExecutorService(Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ExecutorService;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    new-instance v4, Ljava/lang/ref/SoftReference;

    .line 124
    .line 125
    invoke-direct {v4, v3}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    sput-object v4, Lcom/google/firebase/iid/FirebaseInstanceIdReceiver;->b:Ljava/lang/ref/SoftReference;

    .line 129
    .line 130
    :cond_5
    move-object v11, v3

    .line 131
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 132
    :try_start_2
    new-instance v3, LA7/w0;

    .line 133
    .line 134
    const/16 v4, 0x14

    .line 135
    .line 136
    const/4 v8, 0x0

    .line 137
    invoke-direct/range {v3 .. v8}, LA7/w0;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v11, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 141
    .line 142
    .line 143
    :try_start_3
    new-instance v3, LW9/i;

    .line 144
    .line 145
    invoke-direct {v3, v5}, LW9/i;-><init>(Landroid/content/Context;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3, v0}, LW9/i;->b(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    check-cast v0, Ljava/lang/Integer;

    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result v0
    :try_end_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 162
    move v10, v0

    .line 163
    goto :goto_4

    .line 164
    :catch_0
    move-exception v0

    .line 165
    goto :goto_3

    .line 166
    :catch_1
    move-exception v0

    .line 167
    :goto_3
    :try_start_4
    const-string v3, "FirebaseMessaging"

    .line 168
    .line 169
    const-string v4, "Failed to send message to service."

    .line 170
    .line 171
    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 172
    .line 173
    .line 174
    :goto_4
    :try_start_5
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 175
    .line 176
    const-wide/16 v3, 0x1

    .line 177
    .line 178
    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 179
    .line 180
    .line 181
    move-result-wide v3

    .line 182
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 183
    .line 184
    invoke-virtual {v7, v3, v4, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-nez v0, :cond_2

    .line 189
    .line 190
    const-string v0, "CloudMessagingReceiver"

    .line 191
    .line 192
    const-string v3, "Message ack timed out"

    .line 193
    .line 194
    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 195
    .line 196
    .line 197
    goto/16 :goto_1

    .line 198
    .line 199
    :catch_2
    move-exception v0

    .line 200
    :try_start_6
    const-string v3, "CloudMessagingReceiver"

    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    const-string v4, "Message ack failed: "

    .line 207
    .line 208
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    goto/16 :goto_1

    .line 216
    .line 217
    :goto_5
    if-eqz v2, :cond_6

    .line 218
    .line 219
    if-eqz v9, :cond_6

    .line 220
    .line 221
    invoke-virtual {v9, v0}, Landroid/content/BroadcastReceiver$PendingResult;->setResultCode(I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 222
    .line 223
    .line 224
    :cond_6
    if-eqz v9, :cond_7

    .line 225
    .line 226
    invoke-virtual {v9}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 227
    .line 228
    .line 229
    :cond_7
    return-void

    .line 230
    :goto_6
    :try_start_7
    monitor-exit v8
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 231
    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 232
    :goto_7
    if-eqz v9, :cond_8

    .line 233
    .line 234
    invoke-virtual {v9}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 235
    .line 236
    .line 237
    :cond_8
    throw v0
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iget v1, p0, LA7/p1;->a:I

    .line 3
    .line 4
    packed-switch v1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "OkHttpClientTransport"

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 25
    :try_start_0
    iget-object v2, p0, LA7/p1;->e:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Lrd/h;

    .line 28
    .line 29
    invoke-virtual {v2, p0}, Lrd/h;->a(LA7/p1;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    iget-object v2, p0, LA7/p1;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Lpd/m;

    .line 38
    .line 39
    iget-object v2, v2, Lpd/m;->F:Lod/u0;

    .line 40
    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    invoke-virtual {v2}, Lod/u0;->a()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v2

    .line 48
    goto :goto_5

    .line 49
    :cond_1
    iget-object v2, p0, LA7/p1;->d:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Lpd/m;

    .line 52
    .line 53
    iget-object v2, v2, Lpd/m;->k:Ljava/lang/Object;

    .line 54
    .line 55
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    :try_start_1
    iget-object v3, p0, LA7/p1;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Lpd/m;

    .line 59
    .line 60
    iget-object v3, v3, Lpd/m;->v:Lmd/k0;

    .line 61
    .line 62
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    if-nez v3, :cond_2

    .line 64
    .line 65
    :try_start_2
    sget-object v2, Lmd/k0;->n:Lmd/k0;

    .line 66
    .line 67
    const-string v3, "End of stream or IOException"

    .line 68
    .line 69
    invoke-virtual {v2, v3}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    :cond_2
    iget-object v2, p0, LA7/p1;->d:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, Lpd/m;

    .line 76
    .line 77
    sget-object v4, Lrd/a;->d:Lrd/a;

    .line 78
    .line 79
    invoke-virtual {v2, v1, v4, v3}, Lpd/m;->u(ILrd/a;Lmd/k0;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 80
    .line 81
    .line 82
    :try_start_3
    iget-object v1, p0, LA7/p1;->e:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v1, Lrd/h;

    .line 85
    .line 86
    invoke-virtual {v1}, Lrd/h;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :catch_0
    move-exception v1

    .line 91
    goto :goto_1

    .line 92
    :catch_1
    move-exception v1

    .line 93
    goto :goto_2

    .line 94
    :goto_1
    const-string v2, "bio == null"

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_3

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_3
    throw v1

    .line 108
    :goto_2
    sget-object v2, Lpd/m;->Q:Ljava/util/logging/Logger;

    .line 109
    .line 110
    sget-object v3, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    .line 111
    .line 112
    const-string v4, "Exception closing frame reader"

    .line 113
    .line 114
    invoke-virtual {v2, v3, v4, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    :goto_3
    iget-object v1, p0, LA7/p1;->d:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v1, Lpd/m;

    .line 120
    .line 121
    :goto_4
    iget-object v1, v1, Lpd/m;->h:LE5/b;

    .line 122
    .line 123
    invoke-virtual {v1}, LE5/b;->p()V

    .line 124
    .line 125
    .line 126
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto :goto_9

    .line 134
    :catchall_1
    move-exception v3

    .line 135
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 136
    :try_start_5
    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 137
    :goto_5
    :try_start_6
    iget-object v3, p0, LA7/p1;->d:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v3, Lpd/m;

    .line 140
    .line 141
    sget-object v4, Lrd/a;->c:Lrd/a;

    .line 142
    .line 143
    sget-object v5, Lmd/k0;->m:Lmd/k0;

    .line 144
    .line 145
    const-string v6, "error in frame handler"

    .line 146
    .line 147
    invoke-virtual {v5, v6}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-virtual {v5, v2}, Lmd/k0;->g(Ljava/lang/Throwable;)Lmd/k0;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    sget-object v5, Lpd/m;->P:Ljava/util/Map;

    .line 156
    .line 157
    invoke-virtual {v3, v1, v4, v2}, Lpd/m;->u(ILrd/a;Lmd/k0;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 158
    .line 159
    .line 160
    :try_start_7
    iget-object v1, p0, LA7/p1;->e:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v1, Lrd/h;

    .line 163
    .line 164
    invoke-virtual {v1}, Lrd/h;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_2

    .line 165
    .line 166
    .line 167
    goto :goto_8

    .line 168
    :catch_2
    move-exception v1

    .line 169
    goto :goto_6

    .line 170
    :catch_3
    move-exception v1

    .line 171
    goto :goto_7

    .line 172
    :goto_6
    const-string v2, "bio == null"

    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-eqz v2, :cond_4

    .line 183
    .line 184
    goto :goto_8

    .line 185
    :cond_4
    throw v1

    .line 186
    :goto_7
    sget-object v2, Lpd/m;->Q:Ljava/util/logging/Logger;

    .line 187
    .line 188
    sget-object v3, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    .line 189
    .line 190
    const-string v4, "Exception closing frame reader"

    .line 191
    .line 192
    invoke-virtual {v2, v3, v4, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 193
    .line 194
    .line 195
    :goto_8
    iget-object v1, p0, LA7/p1;->d:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v1, Lpd/m;

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :goto_9
    return-void

    .line 201
    :catchall_2
    move-exception v1

    .line 202
    :try_start_8
    iget-object v2, p0, LA7/p1;->e:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v2, Lrd/h;

    .line 205
    .line 206
    invoke-virtual {v2}, Lrd/h;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_4

    .line 207
    .line 208
    .line 209
    goto :goto_c

    .line 210
    :catch_4
    move-exception v2

    .line 211
    goto :goto_a

    .line 212
    :catch_5
    move-exception v2

    .line 213
    goto :goto_b

    .line 214
    :goto_a
    const-string v3, "bio == null"

    .line 215
    .line 216
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    if-nez v3, :cond_5

    .line 225
    .line 226
    throw v2

    .line 227
    :goto_b
    sget-object v3, Lpd/m;->Q:Ljava/util/logging/Logger;

    .line 228
    .line 229
    sget-object v4, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    .line 230
    .line 231
    const-string v5, "Exception closing frame reader"

    .line 232
    .line 233
    invoke-virtual {v3, v4, v5, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 234
    .line 235
    .line 236
    :cond_5
    :goto_c
    iget-object v2, p0, LA7/p1;->d:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v2, Lpd/m;

    .line 239
    .line 240
    iget-object v2, v2, Lpd/m;->h:LE5/b;

    .line 241
    .line 242
    invoke-virtual {v2}, LE5/b;->p()V

    .line 243
    .line 244
    .line 245
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-virtual {v2, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    throw v1

    .line 253
    :pswitch_0
    invoke-direct {p0}, LA7/p1;->a()V

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :pswitch_1
    iget-object v1, p0, LA7/p1;->d:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v1, LA7/m1;

    .line 260
    .line 261
    iget-object v2, v1, LA7/m1;->d:LA7/F;

    .line 262
    .line 263
    if-nez v2, :cond_6

    .line 264
    .line 265
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    const-string v1, "Discarding data. Failed to send conditional user property to service"

    .line 270
    .line 271
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 272
    .line 273
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    goto :goto_e

    .line 277
    :cond_6
    iget-object v3, p0, LA7/p1;->b:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v3, LA7/N1;

    .line 280
    .line 281
    iget-boolean v4, p0, LA7/p1;->c:Z

    .line 282
    .line 283
    if-eqz v4, :cond_7

    .line 284
    .line 285
    goto :goto_d

    .line 286
    :cond_7
    iget-object v0, p0, LA7/p1;->e:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v0, LA7/d;

    .line 289
    .line 290
    :goto_d
    invoke-virtual {v1, v2, v0, v3}, LA7/m1;->l0(LA7/F;Lf7/a;LA7/N1;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1}, LA7/m1;->v0()V

    .line 294
    .line 295
    .line 296
    :goto_e
    return-void

    .line 297
    :pswitch_2
    iget-object v1, p0, LA7/p1;->d:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v1, LA7/m1;

    .line 300
    .line 301
    iget-object v2, v1, LA7/m1;->d:LA7/F;

    .line 302
    .line 303
    if-nez v2, :cond_8

    .line 304
    .line 305
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    const-string v1, "Discarding data. Failed to send event to service"

    .line 310
    .line 311
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 312
    .line 313
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    goto :goto_10

    .line 317
    :cond_8
    iget-object v3, p0, LA7/p1;->b:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v3, LA7/N1;

    .line 320
    .line 321
    iget-boolean v4, p0, LA7/p1;->c:Z

    .line 322
    .line 323
    if-eqz v4, :cond_9

    .line 324
    .line 325
    goto :goto_f

    .line 326
    :cond_9
    iget-object v0, p0, LA7/p1;->e:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v0, LA7/x;

    .line 329
    .line 330
    :goto_f
    invoke-virtual {v1, v2, v0, v3}, LA7/m1;->l0(LA7/F;Lf7/a;LA7/N1;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v1}, LA7/m1;->v0()V

    .line 334
    .line 335
    .line 336
    :goto_10
    return-void

    .line 337
    :pswitch_3
    iget-object v1, p0, LA7/p1;->d:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v1, LA7/m1;

    .line 340
    .line 341
    iget-object v2, v1, LA7/m1;->d:LA7/F;

    .line 342
    .line 343
    if-nez v2, :cond_a

    .line 344
    .line 345
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    const-string v1, "Discarding data. Failed to set user property"

    .line 350
    .line 351
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 352
    .line 353
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    goto :goto_12

    .line 357
    :cond_a
    iget-object v3, p0, LA7/p1;->b:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v3, LA7/N1;

    .line 360
    .line 361
    iget-boolean v4, p0, LA7/p1;->c:Z

    .line 362
    .line 363
    if-eqz v4, :cond_b

    .line 364
    .line 365
    goto :goto_11

    .line 366
    :cond_b
    iget-object v0, p0, LA7/p1;->e:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v0, LA7/R1;

    .line 369
    .line 370
    :goto_11
    invoke-virtual {v1, v2, v0, v3}, LA7/m1;->l0(LA7/F;Lf7/a;LA7/N1;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v1}, LA7/m1;->v0()V

    .line 374
    .line 375
    .line 376
    :goto_12
    return-void

    .line 377
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
