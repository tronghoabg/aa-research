.class public final LR8/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Ljava/lang/Throwable;

.field public final synthetic c:Ljava/lang/Thread;

.field public final synthetic d:LK3/r;

.field public final synthetic e:Z

.field public final synthetic f:LR8/m;


# direct methods
.method public constructor <init>(LR8/m;JLjava/lang/Throwable;Ljava/lang/Thread;LK3/r;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR8/k;->f:LR8/m;

    .line 5
    .line 6
    iput-wide p2, p0, LR8/k;->a:J

    .line 7
    .line 8
    iput-object p4, p0, LR8/k;->b:Ljava/lang/Throwable;

    .line 9
    .line 10
    iput-object p5, p0, LR8/k;->c:Ljava/lang/Thread;

    .line 11
    .line 12
    iput-object p6, p0, LR8/k;->d:LK3/r;

    .line 13
    .line 14
    iput-boolean p7, p0, LR8/k;->e:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 14

    .line 1
    const-wide/16 v0, 0x3e8

    .line 2
    .line 3
    iget-wide v2, p0, LR8/k;->a:J

    .line 4
    .line 5
    div-long v5, v2, v0

    .line 6
    .line 7
    iget-object v1, p0, LR8/k;->f:LR8/m;

    .line 8
    .line 9
    invoke-virtual {v1}, LR8/m;->e()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v9

    .line 13
    const-string v12, "FirebaseCrashlytics"

    .line 14
    .line 15
    const/4 v13, 0x0

    .line 16
    if-nez v9, :cond_0

    .line 17
    .line 18
    const-string v0, "Tried to write a fatal exception while no session was open."

    .line 19
    .line 20
    invoke-static {v12, v0, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 21
    .line 22
    .line 23
    invoke-static {v13}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :cond_0
    iget-object v0, v1, LR8/m;->c:LS3/e;

    .line 29
    .line 30
    invoke-virtual {v0}, LS3/e;->l()V

    .line 31
    .line 32
    .line 33
    iget-object v4, v1, LR8/m;->m:LD6/o;

    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const-string v0, "Persisting fatal event for session "

    .line 39
    .line 40
    invoke-virtual {v0, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/4 v7, 0x2

    .line 45
    invoke-static {v12, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-eqz v7, :cond_1

    .line 50
    .line 51
    invoke-static {v12, v0, v13}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 52
    .line 53
    .line 54
    :cond_1
    const-string v10, "crash"

    .line 55
    .line 56
    const/4 v11, 0x1

    .line 57
    iget-object v8, p0, LR8/k;->b:Ljava/lang/Throwable;

    .line 58
    .line 59
    iget-object v7, p0, LR8/k;->c:Ljava/lang/Thread;

    .line 60
    .line 61
    invoke-virtual/range {v4 .. v11}, LD6/o;->h(JLjava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, ".ae"

    .line 65
    .line 66
    :try_start_0
    iget-object v4, v1, LR8/m;->g:LX8/c;

    .line 67
    .line 68
    new-instance v5, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    new-instance v2, Ljava/io/File;

    .line 84
    .line 85
    iget-object v3, v4, LX8/c;->c:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v3, Ljava/io/File;

    .line 88
    .line 89
    invoke-direct {v2, v3, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_2

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    new-instance v0, Ljava/io/IOException;

    .line 100
    .line 101
    const-string v2, "Create new file failed."

    .line 102
    .line 103
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    :catch_0
    move-exception v0

    .line 108
    const-string v2, "Could not create app exception marker file."

    .line 109
    .line 110
    invoke-static {v12, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 111
    .line 112
    .line 113
    :goto_0
    const/4 v0, 0x0

    .line 114
    iget-object v2, p0, LR8/k;->d:LK3/r;

    .line 115
    .line 116
    invoke-virtual {v1, v0, v2, v0}, LR8/m;->b(ZLK3/r;Z)V

    .line 117
    .line 118
    .line 119
    new-instance v0, LR8/e;

    .line 120
    .line 121
    invoke-direct {v0}, LR8/e;-><init>()V

    .line 122
    .line 123
    .line 124
    iget-boolean v3, p0, LR8/k;->e:Z

    .line 125
    .line 126
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    iget-object v0, v0, LR8/e;->a:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v1, v0, v3}, LR8/m;->c(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 133
    .line 134
    .line 135
    iget-object v0, v1, LR8/m;->b:LR0/e;

    .line 136
    .line 137
    invoke-virtual {v0}, LR0/e;->f()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-nez v0, :cond_3

    .line 142
    .line 143
    invoke-static {v13}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    return-object v0

    .line 148
    :cond_3
    iget-object v0, v2, LK3/r;->i:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    check-cast v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 157
    .line 158
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iget-object v1, v1, LR8/m;->e:LS8/f;

    .line 163
    .line 164
    iget-object v1, v1, LS8/f;->a:LS8/c;

    .line 165
    .line 166
    new-instance v2, LS3/s;

    .line 167
    .line 168
    const/16 v3, 0x13

    .line 169
    .line 170
    invoke-direct {v2, v3, p0, v9}, LS3/s;-><init>(ILjava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    return-object v0
.end method
