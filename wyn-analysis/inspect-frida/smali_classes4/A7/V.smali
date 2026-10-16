.class public final LA7/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LA7/V;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LA7/L1;LA7/Q1;)V
    .locals 0

    const/4 p2, 0x2

    iput p2, p0, LA7/V;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA7/V;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LA7/W;Z)V
    .locals 0

    const/4 p2, 0x0

    iput p2, p0, LA7/V;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA7/V;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LD6/g1;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, LA7/V;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LA7/V;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LD6/i1;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, LA7/V;->a:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LA7/V;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LG6/p;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, LA7/V;->a:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LA7/V;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LQa/c;)V
    .locals 1

    const/16 v0, 0x11

    iput v0, p0, LA7/V;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object p1, p1, LQa/c;->f:Landroid/webkit/WebView;

    .line 3
    iput-object p1, p0, LA7/V;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 4
    iput p2, p0, LA7/V;->a:I

    iput-object p1, p0, LA7/V;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 5

    .line 1
    iget-object v0, p0, LA7/V;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LG7/a;

    .line 4
    .line 5
    iget-object v1, v0, LG7/a;->a:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    invoke-virtual {v0}, LG7/a;->b()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    monitor-exit v1

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string v2, "WakeLock"

    .line 19
    .line 20
    iget-object v3, v0, LG7/a;->j:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const-string v4, " ** IS FORCE-RELEASED ON TIMEOUT **"

    .line 27
    .line 28
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, LG7/a;->d()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, LG7/a;->b()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_1

    .line 43
    .line 44
    monitor-exit v1

    .line 45
    return-void

    .line 46
    :cond_1
    const/4 v2, 0x1

    .line 47
    iput v2, v0, LG7/a;->c:I

    .line 48
    .line 49
    invoke-virtual {v0}, LG7/a;->e()V

    .line 50
    .line 51
    .line 52
    monitor-exit v1

    .line 53
    return-void

    .line 54
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    throw v0
.end method

.method private final b()V
    .locals 3

    .line 1
    :goto_0
    iget-object v0, p0, LA7/V;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LG9/e;

    .line 4
    .line 5
    iget-object v0, v0, LG9/e;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lio/flutter/plugins/firebase/messaging/a;

    .line 8
    .line 9
    iget-object v1, v0, Lio/flutter/plugins/firebase/messaging/a;->a:LYc/m;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, LYc/m;->a()LYc/l;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    iget-object v1, v0, Lio/flutter/plugins/firebase/messaging/a;->e:Ljava/util/ArrayList;

    .line 21
    .line 22
    monitor-enter v1

    .line 23
    :try_start_0
    iget-object v2, v0, Lio/flutter/plugins/firebase/messaging/a;->e:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-lez v2, :cond_1

    .line 30
    .line 31
    iget-object v0, v0, Lio/flutter/plugins/firebase/messaging/a;->e:Ljava/util/ArrayList;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, LYc/k;

    .line 39
    .line 40
    monitor-exit v1

    .line 41
    move-object v1, v0

    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    const/4 v1, 0x0

    .line 47
    :goto_1
    if-eqz v1, :cond_2

    .line 48
    .line 49
    iget-object v0, p0, LA7/V;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, LG9/e;

    .line 52
    .line 53
    iget-object v0, v0, LG9/e;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lio/flutter/plugins/firebase/messaging/a;

    .line 56
    .line 57
    invoke-interface {v1}, LYc/k;->getIntent()Landroid/content/Intent;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v0, v2}, Lio/flutter/plugins/firebase/messaging/a;->c(Landroid/content/Intent;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v1}, LYc/k;->a()V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    iget-object v0, p0, LA7/V;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, LG9/e;

    .line 71
    .line 72
    iget-object v0, v0, LG9/e;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Landroid/os/Handler;

    .line 75
    .line 76
    new-instance v1, LA7/V;

    .line 77
    .line 78
    const/16 v2, 0x14

    .line 79
    .line 80
    invoke-direct {v1, p0, v2}, LA7/V;-><init>(Ljava/lang/Object;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :goto_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    throw v0
.end method

.method private final c()V
    .locals 4

    .line 1
    iget-object v0, p0, LA7/V;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/lifecycle/D;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/lifecycle/D;->a:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, LA7/V;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroidx/lifecycle/D;

    .line 11
    .line 12
    iget-object v1, v1, Landroidx/lifecycle/D;->f:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v2, p0, LA7/V;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Landroidx/lifecycle/D;

    .line 17
    .line 18
    sget-object v3, Landroidx/lifecycle/D;->k:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object v3, v2, Landroidx/lifecycle/D;->f:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    iget-object v0, p0, LA7/V;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Landroidx/lifecycle/D;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroidx/lifecycle/D;->j(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw v1
.end method


# virtual methods
.method public final run()V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-wide/16 v2, 0x1

    .line 4
    .line 5
    const/4 v0, 0x3

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x2

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x1

    .line 10
    iget v8, v1, LA7/V;->a:I

    .line 11
    .line 12
    packed-switch v8, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v2, v1, LA7/V;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Leb/c;

    .line 18
    .line 19
    iget-object v3, v2, Leb/c;->x:LU1/u;

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v3}, LU1/u;->h0()J

    .line 25
    .line 26
    .line 27
    move-result-wide v3

    .line 28
    iget-wide v6, v2, Leb/c;->f:J

    .line 29
    .line 30
    cmp-long v3, v3, v6

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {v2}, Leb/c;->r()V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v3, v2, Leb/c;->x:LU1/u;

    .line 38
    .line 39
    invoke-virtual {v3}, LU1/u;->t0()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    iget-object v4, v2, Leb/c;->C:Landroid/os/Handler;

    .line 44
    .line 45
    if-eq v3, v5, :cond_4

    .line 46
    .line 47
    if-eq v3, v0, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    iget-object v0, v2, Leb/c;->x:LU1/u;

    .line 51
    .line 52
    invoke-virtual {v0}, LU1/u;->s0()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    const-wide/16 v2, 0x1f4

    .line 59
    .line 60
    invoke-virtual {v4, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    const-wide/16 v2, 0x3e8

    .line 65
    .line 66
    invoke-virtual {v4, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    const-wide/16 v2, 0xc8

    .line 71
    .line 72
    invoke-virtual {v4, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 73
    .line 74
    .line 75
    :goto_0
    return-void

    .line 76
    :pswitch_0
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Lcom/google/android/gms/common/api/internal/U;

    .line 79
    .line 80
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/U;->g:LF6/r;

    .line 81
    .line 82
    new-instance v2, Ld7/b;

    .line 83
    .line 84
    const/4 v3, 0x4

    .line 85
    invoke-direct {v2, v3, v4, v4}, Ld7/b;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v2}, LF6/r;->g(Ld7/b;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_1
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Lad/L;

    .line 95
    .line 96
    iget-object v0, v0, Lad/L;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Lcom/google/android/gms/common/api/internal/H;

    .line 99
    .line 100
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/H;->b:Lcom/google/android/gms/common/api/g;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    const-string v3, " disconnecting because it was signed out."

    .line 111
    .line 112
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-interface {v0, v2}, Lcom/google/android/gms/common/api/g;->disconnect(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :pswitch_2
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Lcom/google/android/gms/common/api/internal/H;

    .line 123
    .line 124
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/H;->e()V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :pswitch_3
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Lcom/bumptech/glide/h;

    .line 131
    .line 132
    iget-object v2, v0, Lcom/bumptech/glide/h;->c:LR4/d;

    .line 133
    .line 134
    invoke-interface {v2, v0}, LR4/d;->f(LR4/e;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :pswitch_4
    new-instance v0, Ljava/io/IOException;

    .line 139
    .line 140
    const-string v2, "TIMEOUT"

    .line 141
    .line 142
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    iget-object v2, v1, LA7/V;->b:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 148
    .line 149
    invoke-virtual {v2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_5

    .line 154
    .line 155
    const-string v0, "Rpc"

    .line 156
    .line 157
    const-string v2, "No response"

    .line 158
    .line 159
    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 160
    .line 161
    .line 162
    :cond_5
    return-void

    .line 163
    :pswitch_5
    invoke-direct {v1}, LA7/V;->c()V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :pswitch_6
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v0, Laa/n;

    .line 170
    .line 171
    invoke-virtual {v0}, Laa/n;->a()Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-nez v2, :cond_6

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_6
    iget-object v2, v0, Laa/n;->o:Laa/k;

    .line 179
    .line 180
    invoke-virtual {v2}, Laa/k;->b()Laa/j;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    new-instance v3, Ljava/util/Date;

    .line 185
    .line 186
    iget-object v4, v0, Laa/n;->n:Ln7/b;

    .line 187
    .line 188
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 192
    .line 193
    .line 194
    move-result-wide v8

    .line 195
    invoke-direct {v3, v8, v9}, Ljava/util/Date;-><init>(J)V

    .line 196
    .line 197
    .line 198
    iget-object v2, v2, Laa/j;->b:Ljava/util/Date;

    .line 199
    .line 200
    invoke-virtual {v3, v2}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-eqz v2, :cond_7

    .line 205
    .line 206
    invoke-virtual {v0}, Laa/n;->h()V

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_7
    iget-object v2, v0, Laa/n;->i:LP9/d;

    .line 211
    .line 212
    check-cast v2, LP9/c;

    .line 213
    .line 214
    invoke-virtual {v2}, LP9/c;->e()Lcom/google/android/gms/tasks/Task;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    invoke-virtual {v2}, LP9/c;->d()Lcom/google/android/gms/tasks/Task;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    new-array v4, v5, [Lcom/google/android/gms/tasks/Task;

    .line 223
    .line 224
    aput-object v3, v4, v6

    .line 225
    .line 226
    aput-object v2, v4, v7

    .line 227
    .line 228
    invoke-static {v4}, Lcom/google/android/gms/tasks/Tasks;->whenAllComplete([Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    new-instance v5, LA5/g;

    .line 233
    .line 234
    const/16 v8, 0x9

    .line 235
    .line 236
    invoke-direct {v5, v0, v3, v2, v8}, LA5/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 237
    .line 238
    .line 239
    iget-object v2, v0, Laa/n;->f:Ljava/util/concurrent/ScheduledExecutorService;

    .line 240
    .line 241
    invoke-virtual {v4, v2, v5}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    new-array v4, v7, [Lcom/google/android/gms/tasks/Task;

    .line 246
    .line 247
    aput-object v3, v4, v6

    .line 248
    .line 249
    invoke-static {v4}, Lcom/google/android/gms/tasks/Tasks;->whenAllComplete([Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    new-instance v5, Laa/f;

    .line 254
    .line 255
    invoke-direct {v5, v7, v0, v3}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v4, v2, v5}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 259
    .line 260
    .line 261
    :goto_1
    return-void

    .line 262
    :pswitch_7
    invoke-direct {v1}, LA7/V;->b()V

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    :pswitch_8
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v0, LA7/V;

    .line 269
    .line 270
    iget-object v0, v0, LA7/V;->b:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v0, LG9/e;

    .line 273
    .line 274
    iget-object v0, v0, LG9/e;->d:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v0, Lio/flutter/plugins/firebase/messaging/a;

    .line 277
    .line 278
    invoke-virtual {v0}, Lio/flutter/plugins/firebase/messaging/a;->d()V

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :pswitch_9
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v0, Landroid/view/View;

    .line 285
    .line 286
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    const-string v3, "input_method"

    .line 291
    .line 292
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 297
    .line 298
    invoke-virtual {v2, v0, v7}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 299
    .line 300
    .line 301
    return-void

    .line 302
    :pswitch_a
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, LSa/a;

    .line 305
    .line 306
    iget-object v0, v0, LSa/a;->e:LS3/c;

    .line 307
    .line 308
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    new-instance v2, LTa/b;

    .line 312
    .line 313
    invoke-direct {v2, v0}, LTa/a;-><init>(LS3/c;)V

    .line 314
    .line 315
    .line 316
    iget-object v0, v0, LS3/c;->c:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v0, LG9/e;

    .line 319
    .line 320
    iput-object v0, v2, LTa/a;->a:LG9/e;

    .line 321
    .line 322
    iget-object v3, v0, LG9/e;->c:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v3, Ljava/util/ArrayDeque;

    .line 325
    .line 326
    invoke-virtual {v3, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    iget-object v2, v0, LG9/e;->d:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v2, LTa/a;

    .line 332
    .line 333
    if-nez v2, :cond_8

    .line 334
    .line 335
    invoke-virtual {v0}, LG9/e;->o()V

    .line 336
    .line 337
    .line 338
    :cond_8
    return-void

    .line 339
    :pswitch_b
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v0, Landroid/webkit/WebView;

    .line 342
    .line 343
    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 344
    .line 345
    .line 346
    return-void

    .line 347
    :pswitch_c
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v0, LN7/e;

    .line 350
    .line 351
    iput-boolean v6, v0, LN7/e;->b:Z

    .line 352
    .line 353
    iget-object v2, v0, LN7/e;->e:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 356
    .line 357
    iget-object v3, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M:Lt1/d;

    .line 358
    .line 359
    if-eqz v3, :cond_9

    .line 360
    .line 361
    invoke-virtual {v3}, Lt1/d;->f()Z

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    if-eqz v3, :cond_9

    .line 366
    .line 367
    iget v2, v0, LN7/e;->c:I

    .line 368
    .line 369
    invoke-virtual {v0, v2}, LN7/e;->f(I)V

    .line 370
    .line 371
    .line 372
    goto :goto_2

    .line 373
    :cond_9
    iget v3, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:I

    .line 374
    .line 375
    if-ne v3, v5, :cond_a

    .line 376
    .line 377
    iget v0, v0, LN7/e;->c:I

    .line 378
    .line 379
    invoke-virtual {v2, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->A(I)V

    .line 380
    .line 381
    .line 382
    :cond_a
    :goto_2
    return-void

    .line 383
    :pswitch_d
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 384
    .line 385
    move-object v2, v0

    .line 386
    check-cast v2, Landroidx/work/Worker;

    .line 387
    .line 388
    :try_start_0
    invoke-virtual {v2}, Landroidx/work/Worker;->doWork()LJ3/p;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    iget-object v3, v2, Landroidx/work/Worker;->a:LU3/j;

    .line 393
    .line 394
    invoke-virtual {v3, v0}, LU3/j;->i(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 395
    .line 396
    .line 397
    goto :goto_3

    .line 398
    :catchall_0
    move-exception v0

    .line 399
    iget-object v2, v2, Landroidx/work/Worker;->a:LU3/j;

    .line 400
    .line 401
    invoke-virtual {v2, v0}, LU3/j;->j(Ljava/lang/Throwable;)Z

    .line 402
    .line 403
    .line 404
    :goto_3
    return-void

    .line 405
    :pswitch_e
    invoke-direct {v1}, LA7/V;->a()V

    .line 406
    .line 407
    .line 408
    return-void

    .line 409
    :pswitch_f
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v0, LG6/O;

    .line 412
    .line 413
    iget-boolean v2, v0, LG6/O;->b:Z

    .line 414
    .line 415
    if-nez v2, :cond_b

    .line 416
    .line 417
    goto :goto_4

    .line 418
    :cond_b
    invoke-virtual {v0}, LG6/O;->o()Z

    .line 419
    .line 420
    .line 421
    move-result v2

    .line 422
    if-eqz v2, :cond_c

    .line 423
    .line 424
    invoke-virtual {v0}, LG6/O;->p()Z

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    if-eqz v2, :cond_c

    .line 429
    .line 430
    goto :goto_4

    .line 431
    :cond_c
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbko;->zzb:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 432
    .line 433
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    check-cast v2, Ljava/lang/Boolean;

    .line 438
    .line 439
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 440
    .line 441
    .line 442
    move-result v2

    .line 443
    if-nez v2, :cond_d

    .line 444
    .line 445
    goto :goto_4

    .line 446
    :cond_d
    iget-object v2, v0, LG6/O;->a:Ljava/lang/Object;

    .line 447
    .line 448
    monitor-enter v2

    .line 449
    :try_start_1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 450
    .line 451
    .line 452
    move-result-object v3

    .line 453
    if-nez v3, :cond_e

    .line 454
    .line 455
    monitor-exit v2

    .line 456
    goto :goto_4

    .line 457
    :catchall_1
    move-exception v0

    .line 458
    goto :goto_5

    .line 459
    :cond_e
    iget-object v3, v0, LG6/O;->e:Lcom/google/android/gms/internal/ads/zzbfx;

    .line 460
    .line 461
    if-nez v3, :cond_f

    .line 462
    .line 463
    new-instance v3, Lcom/google/android/gms/internal/ads/zzbfx;

    .line 464
    .line 465
    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/zzbfx;-><init>()V

    .line 466
    .line 467
    .line 468
    iput-object v3, v0, LG6/O;->e:Lcom/google/android/gms/internal/ads/zzbfx;

    .line 469
    .line 470
    :cond_f
    iget-object v0, v0, LG6/O;->e:Lcom/google/android/gms/internal/ads/zzbfx;

    .line 471
    .line 472
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbfx;->zza()V

    .line 473
    .line 474
    .line 475
    const-string v0, "start fetching content..."

    .line 476
    .line 477
    sget v3, LG6/L;->b:I

    .line 478
    .line 479
    invoke-static {v0}, LH6/l;->e(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    monitor-exit v2

    .line 483
    :goto_4
    return-void

    .line 484
    :goto_5
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 485
    throw v0

    .line 486
    :pswitch_10
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    iget-object v2, v1, LA7/V;->b:Ljava/lang/Object;

    .line 491
    .line 492
    check-cast v2, LG6/p;

    .line 493
    .line 494
    invoke-virtual {v2, v0}, LG6/p;->zzc(Ljava/lang/Thread;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v2}, LG6/p;->zza()V

    .line 498
    .line 499
    .line 500
    return-void

    .line 501
    :pswitch_11
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v0, LF6/l;

    .line 504
    .line 505
    invoke-virtual {v0}, LF6/l;->S()V

    .line 506
    .line 507
    .line 508
    return-void

    .line 509
    :pswitch_12
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 510
    .line 511
    check-cast v0, LF6/b;

    .line 512
    .line 513
    iget-boolean v2, v0, LF6/b;->g:Z

    .line 514
    .line 515
    if-eqz v2, :cond_10

    .line 516
    .line 517
    iget-object v0, v0, LF6/b;->b:Landroid/app/Activity;

    .line 518
    .line 519
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 520
    .line 521
    .line 522
    :cond_10
    return-void

    .line 523
    :pswitch_13
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast v0, LVa/Y7;

    .line 526
    .line 527
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    :goto_6
    :try_start_2
    iget-object v2, v0, LVa/Y7;->c:Ljava/lang/Object;

    .line 531
    .line 532
    check-cast v2, Ljava/lang/ref/ReferenceQueue;

    .line 533
    .line 534
    invoke-virtual {v2}, Ljava/lang/ref/ReferenceQueue;->remove()Ljava/lang/ref/Reference;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    check-cast v2, LE4/c;

    .line 539
    .line 540
    invoke-virtual {v0, v2}, LVa/Y7;->d(LE4/c;)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 541
    .line 542
    .line 543
    goto :goto_6

    .line 544
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 549
    .line 550
    .line 551
    goto :goto_6

    .line 552
    :pswitch_14
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v0, Lcom/google/android/gms/internal/ads/zzccw;

    .line 555
    .line 556
    if-eqz v0, :cond_11

    .line 557
    .line 558
    :try_start_3
    invoke-interface {v0, v7}, Lcom/google/android/gms/internal/ads/zzccw;->zzf(I)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1

    .line 559
    .line 560
    .line 561
    goto :goto_7

    .line 562
    :catch_1
    move-exception v0

    .line 563
    const-string v2, "#007 Could not call remote method."

    .line 564
    .line 565
    invoke-static {v2, v0}, LH6/l;->i(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 566
    .line 567
    .line 568
    :cond_11
    :goto_7
    return-void

    .line 569
    :pswitch_15
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 570
    .line 571
    check-cast v0, LD6/j1;

    .line 572
    .line 573
    iget-object v0, v0, LD6/j1;->a:Lcom/google/android/gms/internal/ads/zzbsd;

    .line 574
    .line 575
    if-eqz v0, :cond_12

    .line 576
    .line 577
    :try_start_4
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 578
    .line 579
    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/zzbsd;->zzb(Ljava/util/List;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_2

    .line 580
    .line 581
    .line 582
    goto :goto_8

    .line 583
    :catch_2
    move-exception v0

    .line 584
    const-string v2, "Could not notify onComplete event."

    .line 585
    .line 586
    invoke-static {v2, v0}, LH6/l;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 587
    .line 588
    .line 589
    :cond_12
    :goto_8
    return-void

    .line 590
    :pswitch_16
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 591
    .line 592
    check-cast v0, LD6/i1;

    .line 593
    .line 594
    iget-object v0, v0, LD6/i1;->a:LD6/y;

    .line 595
    .line 596
    if-eqz v0, :cond_13

    .line 597
    .line 598
    :try_start_5
    invoke-interface {v0, v7}, LD6/y;->zzc(I)V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_3

    .line 599
    .line 600
    .line 601
    goto :goto_9

    .line 602
    :catch_3
    move-exception v0

    .line 603
    const-string v2, "Could not notify onAdFailedToLoad event."

    .line 604
    .line 605
    invoke-static {v2, v0}, LH6/l;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 606
    .line 607
    .line 608
    :cond_13
    :goto_9
    return-void

    .line 609
    :pswitch_17
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 610
    .line 611
    check-cast v0, LD6/g1;

    .line 612
    .line 613
    iget-object v0, v0, LD6/g1;->a:LD6/h1;

    .line 614
    .line 615
    iget-object v0, v0, LD6/h1;->a:LD6/y;

    .line 616
    .line 617
    if-eqz v0, :cond_14

    .line 618
    .line 619
    :try_start_6
    invoke-interface {v0, v7}, LD6/y;->zzc(I)V
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_4

    .line 620
    .line 621
    .line 622
    goto :goto_a

    .line 623
    :catch_4
    move-exception v0

    .line 624
    const-string v2, "Could not notify onAdFailedToLoad event."

    .line 625
    .line 626
    invoke-static {v2, v0}, LH6/l;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 627
    .line 628
    .line 629
    :cond_14
    :goto_a
    return-void

    .line 630
    :pswitch_18
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 631
    .line 632
    check-cast v0, LB9/d;

    .line 633
    .line 634
    iget-object v4, v0, LB9/d;->h:LB9/f;

    .line 635
    .line 636
    iget-object v4, v4, LB9/f;->f:LD9/i;

    .line 637
    .line 638
    iget-object v5, v0, LB9/d;->f:Landroid/app/Activity;

    .line 639
    .line 640
    iget-object v7, v4, LD9/i;->a:LE9/c;

    .line 641
    .line 642
    if-nez v7, :cond_15

    .line 643
    .line 644
    move v7, v6

    .line 645
    goto :goto_b

    .line 646
    :cond_15
    invoke-virtual {v7}, LE9/c;->j()Landroid/view/ViewGroup;

    .line 647
    .line 648
    .line 649
    move-result-object v7

    .line 650
    invoke-virtual {v7}, Landroid/view/View;->isShown()Z

    .line 651
    .line 652
    .line 653
    move-result v7

    .line 654
    :goto_b
    iget-object v13, v0, LB9/d;->e:LE9/c;

    .line 655
    .line 656
    const/4 v14, -0x1

    .line 657
    if-eqz v7, :cond_16

    .line 658
    .line 659
    const-string v4, "Fiam already active. Cannot show new Fiam."

    .line 660
    .line 661
    invoke-static {v4}, LD9/e;->d(Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    goto/16 :goto_e

    .line 665
    .line 666
    :cond_16
    invoke-virtual {v5}, Landroid/app/Activity;->isFinishing()Z

    .line 667
    .line 668
    .line 669
    move-result v7

    .line 670
    if-nez v7, :cond_1b

    .line 671
    .line 672
    invoke-virtual {v5}, Landroid/app/Activity;->isDestroyed()Z

    .line 673
    .line 674
    .line 675
    move-result v7

    .line 676
    if-eqz v7, :cond_17

    .line 677
    .line 678
    goto/16 :goto_d

    .line 679
    .line 680
    :cond_17
    invoke-virtual {v13}, LE9/c;->f()LD9/k;

    .line 681
    .line 682
    .line 683
    move-result-object v7

    .line 684
    new-instance v15, Landroid/view/WindowManager$LayoutParams;

    .line 685
    .line 686
    iget-object v8, v7, LD9/k;->g:Ljava/lang/Integer;

    .line 687
    .line 688
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 689
    .line 690
    .line 691
    move-result v16

    .line 692
    iget-object v8, v7, LD9/k;->h:Ljava/lang/Integer;

    .line 693
    .line 694
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 695
    .line 696
    .line 697
    move-result v17

    .line 698
    iget-object v8, v7, LD9/k;->e:Ljava/lang/Integer;

    .line 699
    .line 700
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 701
    .line 702
    .line 703
    move-result v19

    .line 704
    const/16 v20, -0x3

    .line 705
    .line 706
    const/16 v18, 0x3eb

    .line 707
    .line 708
    invoke-direct/range {v15 .. v20}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    .line 709
    .line 710
    .line 711
    invoke-static {v5}, LD9/i;->a(Landroid/app/Activity;)Landroid/graphics/Rect;

    .line 712
    .line 713
    .line 714
    move-result-object v8

    .line 715
    iget-object v9, v7, LD9/k;->f:Ljava/lang/Integer;

    .line 716
    .line 717
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 718
    .line 719
    .line 720
    move-result v9

    .line 721
    const/16 v10, 0x30

    .line 722
    .line 723
    and-int/2addr v9, v10

    .line 724
    if-ne v9, v10, :cond_18

    .line 725
    .line 726
    iget v8, v8, Landroid/graphics/Rect;->top:I

    .line 727
    .line 728
    iput v8, v15, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 729
    .line 730
    :cond_18
    const v8, 0x3e99999a    # 0.3f

    .line 731
    .line 732
    .line 733
    iput v8, v15, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    .line 734
    .line 735
    iget-object v8, v7, LD9/k;->f:Ljava/lang/Integer;

    .line 736
    .line 737
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 738
    .line 739
    .line 740
    move-result v8

    .line 741
    iput v8, v15, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 742
    .line 743
    iput v6, v15, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 744
    .line 745
    const-string v8, "window"

    .line 746
    .line 747
    invoke-virtual {v5, v8}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v8

    .line 751
    move-object v12, v8

    .line 752
    check-cast v12, Landroid/view/WindowManager;

    .line 753
    .line 754
    invoke-virtual {v13}, LE9/c;->j()Landroid/view/ViewGroup;

    .line 755
    .line 756
    .line 757
    move-result-object v8

    .line 758
    invoke-interface {v12, v8, v15}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 759
    .line 760
    .line 761
    invoke-static {v5}, LD9/i;->a(Landroid/app/Activity;)Landroid/graphics/Rect;

    .line 762
    .line 763
    .line 764
    move-result-object v5

    .line 765
    iget v8, v5, Landroid/graphics/Rect;->top:I

    .line 766
    .line 767
    int-to-float v8, v8

    .line 768
    iget v9, v5, Landroid/graphics/Rect;->bottom:I

    .line 769
    .line 770
    int-to-float v9, v9

    .line 771
    const-string v10, "Inset (top, bottom)"

    .line 772
    .line 773
    invoke-static {v10, v8, v9}, LD9/e;->c(Ljava/lang/String;FF)V

    .line 774
    .line 775
    .line 776
    iget v8, v5, Landroid/graphics/Rect;->left:I

    .line 777
    .line 778
    int-to-float v8, v8

    .line 779
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 780
    .line 781
    int-to-float v5, v5

    .line 782
    const-string v9, "Inset (left, right)"

    .line 783
    .line 784
    invoke-static {v9, v8, v5}, LD9/e;->c(Ljava/lang/String;FF)V

    .line 785
    .line 786
    .line 787
    instance-of v5, v13, LE9/a;

    .line 788
    .line 789
    if-eqz v5, :cond_1a

    .line 790
    .line 791
    new-instance v10, LS3/l;

    .line 792
    .line 793
    invoke-direct {v10, v13}, LS3/l;-><init>(Ljava/lang/Object;)V

    .line 794
    .line 795
    .line 796
    iget-object v5, v7, LD9/k;->g:Ljava/lang/Integer;

    .line 797
    .line 798
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 799
    .line 800
    .line 801
    move-result v5

    .line 802
    if-ne v5, v14, :cond_19

    .line 803
    .line 804
    new-instance v5, LD9/s;

    .line 805
    .line 806
    invoke-virtual {v13}, LE9/c;->g()Landroid/view/View;

    .line 807
    .line 808
    .line 809
    move-result-object v7

    .line 810
    invoke-direct {v5, v7, v10}, LD9/s;-><init>(Landroid/view/View;LS3/l;)V

    .line 811
    .line 812
    .line 813
    goto :goto_c

    .line 814
    :cond_19
    new-instance v8, LD9/h;

    .line 815
    .line 816
    invoke-virtual {v13}, LE9/c;->g()Landroid/view/View;

    .line 817
    .line 818
    .line 819
    move-result-object v9

    .line 820
    move-object v11, v15

    .line 821
    invoke-direct/range {v8 .. v13}, LD9/h;-><init>(Landroid/view/View;LS3/l;Landroid/view/WindowManager$LayoutParams;Landroid/view/WindowManager;LE9/c;)V

    .line 822
    .line 823
    .line 824
    move-object v5, v8

    .line 825
    :goto_c
    invoke-virtual {v13}, LE9/c;->g()Landroid/view/View;

    .line 826
    .line 827
    .line 828
    move-result-object v7

    .line 829
    invoke-virtual {v7, v5}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 830
    .line 831
    .line 832
    :cond_1a
    iput-object v13, v4, LD9/i;->a:LE9/c;

    .line 833
    .line 834
    goto :goto_e

    .line 835
    :cond_1b
    :goto_d
    const-string v4, "Activity is finishing or does not have valid window token. Cannot show FIAM."

    .line 836
    .line 837
    invoke-static {v4}, LD9/e;->d(Ljava/lang/String;)V

    .line 838
    .line 839
    .line 840
    :goto_e
    invoke-virtual {v13}, LE9/c;->f()LD9/k;

    .line 841
    .line 842
    .line 843
    move-result-object v4

    .line 844
    iget-object v4, v4, LD9/k;->j:Ljava/lang/Boolean;

    .line 845
    .line 846
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 847
    .line 848
    .line 849
    move-result v4

    .line 850
    if-eqz v4, :cond_1c

    .line 851
    .line 852
    iget-object v0, v0, LB9/d;->h:LB9/f;

    .line 853
    .line 854
    iget-object v4, v0, LB9/f;->i:LD9/d;

    .line 855
    .line 856
    invoke-virtual {v13}, LE9/c;->j()Landroid/view/ViewGroup;

    .line 857
    .line 858
    .line 859
    move-result-object v5

    .line 860
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 861
    .line 862
    .line 863
    const/4 v4, 0x0

    .line 864
    invoke-virtual {v5, v4}, Landroid/view/View;->setAlpha(F)V

    .line 865
    .line 866
    .line 867
    const/4 v4, -0x2

    .line 868
    invoke-virtual {v5, v4, v4}, Landroid/view/View;->measure(II)V

    .line 869
    .line 870
    .line 871
    new-instance v4, Landroid/graphics/Point;

    .line 872
    .line 873
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    .line 874
    .line 875
    .line 876
    move-result v7

    .line 877
    mul-int/2addr v7, v14

    .line 878
    invoke-direct {v4, v6, v7}, Landroid/graphics/Point;-><init>(II)V

    .line 879
    .line 880
    .line 881
    invoke-virtual {v5}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 882
    .line 883
    .line 884
    move-result-object v7

    .line 885
    iget v8, v4, Landroid/graphics/Point;->x:I

    .line 886
    .line 887
    int-to-float v8, v8

    .line 888
    invoke-virtual {v7, v8}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 889
    .line 890
    .line 891
    move-result-object v7

    .line 892
    iget v4, v4, Landroid/graphics/Point;->y:I

    .line 893
    .line 894
    int-to-float v4, v4

    .line 895
    invoke-virtual {v7, v4}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 896
    .line 897
    .line 898
    move-result-object v4

    .line 899
    invoke-virtual {v4, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 900
    .line 901
    .line 902
    move-result-object v2

    .line 903
    new-instance v3, LD9/c;

    .line 904
    .line 905
    iget-object v0, v0, LB9/f;->h:Landroid/app/Application;

    .line 906
    .line 907
    invoke-direct {v3, v6, v5, v0}, LD9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 908
    .line 909
    .line 910
    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 911
    .line 912
    .line 913
    :cond_1c
    return-void

    .line 914
    :pswitch_19
    iget-object v4, v1, LA7/V;->b:Ljava/lang/Object;

    .line 915
    .line 916
    check-cast v4, LA7/n0;

    .line 917
    .line 918
    iget-object v5, v4, LA7/n0;->l:LA7/U1;

    .line 919
    .line 920
    invoke-static {v5}, LA7/n0;->c(LA7/B0;)V

    .line 921
    .line 922
    .line 923
    invoke-virtual {v5}, LA7/B0;->c0()V

    .line 924
    .line 925
    .line 926
    invoke-virtual {v5}, LA7/U1;->n1()J

    .line 927
    .line 928
    .line 929
    move-result-wide v5

    .line 930
    cmp-long v2, v5, v2

    .line 931
    .line 932
    if-nez v2, :cond_1d

    .line 933
    .line 934
    new-instance v2, Ljava/lang/Thread;

    .line 935
    .line 936
    iget-object v3, v4, LA7/n0;->p:LA7/P0;

    .line 937
    .line 938
    invoke-static {v3}, LA7/n0;->b(LA7/Y;)V

    .line 939
    .line 940
    .line 941
    new-instance v4, LA7/r0;

    .line 942
    .line 943
    invoke-direct {v4, v0}, LA7/r0;-><init>(I)V

    .line 944
    .line 945
    .line 946
    iput-object v3, v4, LA7/r0;->b:LA7/P0;

    .line 947
    .line 948
    invoke-direct {v2, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 949
    .line 950
    .line 951
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 952
    .line 953
    .line 954
    goto :goto_f

    .line 955
    :cond_1d
    iget-object v0, v4, LA7/n0;->i:LA7/N;

    .line 956
    .line 957
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 958
    .line 959
    .line 960
    const-string v2, "registerTrigger called but app not eligible"

    .line 961
    .line 962
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 963
    .line 964
    invoke-virtual {v0, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 965
    .line 966
    .line 967
    :goto_f
    return-void

    .line 968
    :pswitch_1a
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 969
    .line 970
    check-cast v0, LA7/L1;

    .line 971
    .line 972
    invoke-virtual {v0}, LA7/L1;->zzl()LA7/k0;

    .line 973
    .line 974
    .line 975
    move-result-object v2

    .line 976
    invoke-virtual {v2}, LA7/k0;->c0()V

    .line 977
    .line 978
    .line 979
    new-instance v2, Ly3/j;

    .line 980
    .line 981
    invoke-direct {v2, v0}, Ly3/j;-><init>(LA7/L1;)V

    .line 982
    .line 983
    .line 984
    iput-object v2, v0, LA7/L1;->k:Ly3/j;

    .line 985
    .line 986
    new-instance v2, LA7/i;

    .line 987
    .line 988
    invoke-direct {v2, v0}, LA7/i;-><init>(LA7/L1;)V

    .line 989
    .line 990
    .line 991
    invoke-virtual {v2}, LA7/G1;->i0()V

    .line 992
    .line 993
    .line 994
    iput-object v2, v0, LA7/L1;->c:LA7/i;

    .line 995
    .line 996
    invoke-virtual {v0}, LA7/L1;->O()LA7/e;

    .line 997
    .line 998
    .line 999
    move-result-object v2

    .line 1000
    iget-object v3, v0, LA7/L1;->a:LA7/f0;

    .line 1001
    .line 1002
    invoke-static {v3}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 1003
    .line 1004
    .line 1005
    iput-object v3, v2, LA7/e;->d:LA7/f;

    .line 1006
    .line 1007
    new-instance v2, LA7/w1;

    .line 1008
    .line 1009
    invoke-direct {v2, v0}, LA7/w1;-><init>(LA7/L1;)V

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v2}, LA7/G1;->i0()V

    .line 1013
    .line 1014
    .line 1015
    iput-object v2, v0, LA7/L1;->i:LA7/w1;

    .line 1016
    .line 1017
    new-instance v2, LA7/W1;

    .line 1018
    .line 1019
    invoke-direct {v2, v0}, LA7/G1;-><init>(LA7/L1;)V

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v2}, LA7/G1;->i0()V

    .line 1023
    .line 1024
    .line 1025
    iput-object v2, v0, LA7/L1;->f:LA7/W1;

    .line 1026
    .line 1027
    new-instance v2, LA7/h1;

    .line 1028
    .line 1029
    invoke-direct {v2, v0}, LA7/G1;-><init>(LA7/L1;)V

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual {v2}, LA7/G1;->i0()V

    .line 1033
    .line 1034
    .line 1035
    iput-object v2, v0, LA7/L1;->h:LA7/h1;

    .line 1036
    .line 1037
    new-instance v2, LA7/F1;

    .line 1038
    .line 1039
    invoke-direct {v2, v0}, LA7/F1;-><init>(LA7/L1;)V

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v2}, LA7/G1;->i0()V

    .line 1043
    .line 1044
    .line 1045
    iput-object v2, v0, LA7/L1;->e:LA7/F1;

    .line 1046
    .line 1047
    new-instance v2, LA7/W;

    .line 1048
    .line 1049
    invoke-direct {v2, v0}, LA7/W;-><init>(LA7/L1;)V

    .line 1050
    .line 1051
    .line 1052
    iput-object v2, v0, LA7/L1;->d:LA7/W;

    .line 1053
    .line 1054
    iget v2, v0, LA7/L1;->r:I

    .line 1055
    .line 1056
    iget v3, v0, LA7/L1;->s:I

    .line 1057
    .line 1058
    if-eq v2, v3, :cond_1e

    .line 1059
    .line 1060
    invoke-virtual {v0}, LA7/L1;->zzj()LA7/N;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v2

    .line 1064
    iget v3, v0, LA7/L1;->r:I

    .line 1065
    .line 1066
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v3

    .line 1070
    iget v5, v0, LA7/L1;->s:I

    .line 1071
    .line 1072
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v5

    .line 1076
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 1077
    .line 1078
    const-string v6, "Not all upload components initialized"

    .line 1079
    .line 1080
    invoke-virtual {v2, v3, v6, v5}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1081
    .line 1082
    .line 1083
    :cond_1e
    iput-boolean v7, v0, LA7/L1;->m:Z

    .line 1084
    .line 1085
    invoke-virtual {v0}, LA7/L1;->zzl()LA7/k0;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v2

    .line 1089
    invoke-virtual {v2}, LA7/k0;->c0()V

    .line 1090
    .line 1091
    .line 1092
    iget-object v2, v0, LA7/L1;->c:LA7/i;

    .line 1093
    .line 1094
    invoke-static {v2}, LA7/L1;->m(LA7/G1;)V

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v2}, LA7/i;->q1()V

    .line 1098
    .line 1099
    .line 1100
    iget-object v2, v0, LA7/L1;->c:LA7/i;

    .line 1101
    .line 1102
    invoke-static {v2}, LA7/L1;->m(LA7/G1;)V

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual {v2}, LA7/B0;->c0()V

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v2}, LA7/G1;->h0()V

    .line 1109
    .line 1110
    .line 1111
    invoke-virtual {v2}, LA7/i;->Q0()Z

    .line 1112
    .line 1113
    .line 1114
    move-result v3

    .line 1115
    const-wide/16 v5, 0x0

    .line 1116
    .line 1117
    if-eqz v3, :cond_20

    .line 1118
    .line 1119
    sget-object v3, LA7/y;->i0:LA7/D;

    .line 1120
    .line 1121
    invoke-virtual {v3, v4}, LA7/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v7

    .line 1125
    check-cast v7, Ljava/lang/Long;

    .line 1126
    .line 1127
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 1128
    .line 1129
    .line 1130
    move-result-wide v7

    .line 1131
    cmp-long v7, v7, v5

    .line 1132
    .line 1133
    if-nez v7, :cond_1f

    .line 1134
    .line 1135
    goto :goto_10

    .line 1136
    :cond_1f
    invoke-virtual {v2}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v7

    .line 1140
    iget-object v8, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 1141
    .line 1142
    check-cast v8, LA7/n0;

    .line 1143
    .line 1144
    iget-object v8, v8, LA7/n0;->n:Ln7/b;

    .line 1145
    .line 1146
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1147
    .line 1148
    .line 1149
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1150
    .line 1151
    .line 1152
    move-result-wide v8

    .line 1153
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v8

    .line 1157
    invoke-virtual {v3, v4}, LA7/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v3

    .line 1161
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v3

    .line 1165
    filled-new-array {v8, v3}, [Ljava/lang/String;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v3

    .line 1169
    const-string v4, "trigger_uris"

    .line 1170
    .line 1171
    const-string v8, "abs(timestamp_millis - ?) > cast(? as integer)"

    .line 1172
    .line 1173
    invoke-virtual {v7, v4, v8, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 1174
    .line 1175
    .line 1176
    move-result v3

    .line 1177
    if-lez v3, :cond_20

    .line 1178
    .line 1179
    invoke-virtual {v2}, LA7/B0;->zzj()LA7/N;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v2

    .line 1183
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v3

    .line 1187
    iget-object v2, v2, LA7/N;->n:LA7/P;

    .line 1188
    .line 1189
    const-string v4, "Deleted stale trigger uris. rowsDeleted"

    .line 1190
    .line 1191
    invoke-virtual {v2, v4, v3}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1192
    .line 1193
    .line 1194
    :cond_20
    :goto_10
    iget-object v2, v0, LA7/L1;->i:LA7/w1;

    .line 1195
    .line 1196
    iget-object v2, v2, LA7/w1;->h:LA7/a0;

    .line 1197
    .line 1198
    invoke-virtual {v2}, LA7/a0;->d()J

    .line 1199
    .line 1200
    .line 1201
    move-result-wide v2

    .line 1202
    cmp-long v2, v2, v5

    .line 1203
    .line 1204
    if-nez v2, :cond_21

    .line 1205
    .line 1206
    iget-object v2, v0, LA7/L1;->i:LA7/w1;

    .line 1207
    .line 1208
    iget-object v2, v2, LA7/w1;->h:LA7/a0;

    .line 1209
    .line 1210
    invoke-virtual {v0}, LA7/L1;->zzb()Ln7/a;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v3

    .line 1214
    check-cast v3, Ln7/b;

    .line 1215
    .line 1216
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1217
    .line 1218
    .line 1219
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1220
    .line 1221
    .line 1222
    move-result-wide v3

    .line 1223
    invoke-virtual {v2, v3, v4}, LA7/a0;->f(J)V

    .line 1224
    .line 1225
    .line 1226
    :cond_21
    invoke-virtual {v0}, LA7/L1;->C()V

    .line 1227
    .line 1228
    .line 1229
    return-void

    .line 1230
    :pswitch_1b
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 1231
    .line 1232
    check-cast v0, LA7/A1;

    .line 1233
    .line 1234
    iget-object v2, v0, LA7/A1;->c:LS3/s;

    .line 1235
    .line 1236
    iget-object v3, v2, LS3/s;->c:Ljava/lang/Object;

    .line 1237
    .line 1238
    check-cast v3, LA7/x1;

    .line 1239
    .line 1240
    invoke-virtual {v3}, LA7/B;->c0()V

    .line 1241
    .line 1242
    .line 1243
    iget-object v2, v2, LS3/s;->c:Ljava/lang/Object;

    .line 1244
    .line 1245
    check-cast v2, LA7/x1;

    .line 1246
    .line 1247
    invoke-virtual {v2}, LA7/B0;->zzj()LA7/N;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v3

    .line 1251
    const-string v8, "Application going to the background"

    .line 1252
    .line 1253
    iget-object v3, v3, LA7/N;->m:LA7/P;

    .line 1254
    .line 1255
    invoke-virtual {v3, v8}, LA7/P;->c(Ljava/lang/String;)V

    .line 1256
    .line 1257
    .line 1258
    invoke-virtual {v2}, LA7/B0;->a0()LA7/Z;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v3

    .line 1262
    iget-object v3, v3, LA7/Z;->t:LA7/X;

    .line 1263
    .line 1264
    invoke-virtual {v3, v7}, LA7/X;->c(Z)V

    .line 1265
    .line 1266
    .line 1267
    invoke-virtual {v2}, LA7/B;->c0()V

    .line 1268
    .line 1269
    .line 1270
    iput-boolean v7, v2, LA7/x1;->d:Z

    .line 1271
    .line 1272
    iget-object v3, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 1273
    .line 1274
    check-cast v3, LA7/n0;

    .line 1275
    .line 1276
    iget-object v8, v3, LA7/n0;->g:LA7/e;

    .line 1277
    .line 1278
    invoke-virtual {v8}, LA7/e;->q0()Z

    .line 1279
    .line 1280
    .line 1281
    move-result v8

    .line 1282
    if-nez v8, :cond_23

    .line 1283
    .line 1284
    iget-object v8, v3, LA7/n0;->g:LA7/e;

    .line 1285
    .line 1286
    sget-object v9, LA7/y;->P0:LA7/D;

    .line 1287
    .line 1288
    invoke-virtual {v8, v4, v9}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 1289
    .line 1290
    .line 1291
    move-result v8

    .line 1292
    iget-wide v9, v0, LA7/A1;->b:J

    .line 1293
    .line 1294
    iget-object v11, v2, LA7/x1;->f:LA7/B1;

    .line 1295
    .line 1296
    if-eqz v8, :cond_22

    .line 1297
    .line 1298
    invoke-virtual {v11, v9, v10, v6, v6}, LA7/B1;->c(JZZ)Z

    .line 1299
    .line 1300
    .line 1301
    iget-object v6, v11, LA7/B1;->d:Ljava/lang/Object;

    .line 1302
    .line 1303
    check-cast v6, LA7/C1;

    .line 1304
    .line 1305
    invoke-virtual {v6}, LA7/n;->a()V

    .line 1306
    .line 1307
    .line 1308
    goto :goto_11

    .line 1309
    :cond_22
    iget-object v8, v11, LA7/B1;->d:Ljava/lang/Object;

    .line 1310
    .line 1311
    check-cast v8, LA7/C1;

    .line 1312
    .line 1313
    invoke-virtual {v8}, LA7/n;->a()V

    .line 1314
    .line 1315
    .line 1316
    invoke-virtual {v11, v9, v10, v6, v6}, LA7/B1;->c(JZZ)Z

    .line 1317
    .line 1318
    .line 1319
    :cond_23
    :goto_11
    invoke-virtual {v2}, LA7/B0;->zzj()LA7/N;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v6

    .line 1323
    iget-wide v8, v0, LA7/A1;->a:J

    .line 1324
    .line 1325
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v0

    .line 1329
    iget-object v6, v6, LA7/N;->l:LA7/P;

    .line 1330
    .line 1331
    const-string v8, "Application backgrounded at: timestamp_millis"

    .line 1332
    .line 1333
    invoke-virtual {v6, v8, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1334
    .line 1335
    .line 1336
    iget-object v0, v3, LA7/n0;->g:LA7/e;

    .line 1337
    .line 1338
    sget-object v3, LA7/y;->d1:LA7/D;

    .line 1339
    .line 1340
    invoke-virtual {v0, v4, v3}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 1341
    .line 1342
    .line 1343
    move-result v0

    .line 1344
    if-eqz v0, :cond_25

    .line 1345
    .line 1346
    invoke-virtual {v2}, LA7/B;->e0()LA7/P0;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v0

    .line 1350
    invoke-virtual {v0}, LA7/B;->c0()V

    .line 1351
    .line 1352
    .line 1353
    invoke-virtual {v0}, LA7/Y;->h0()V

    .line 1354
    .line 1355
    .line 1356
    iget-object v0, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 1357
    .line 1358
    check-cast v0, LA7/n0;

    .line 1359
    .line 1360
    iget-object v2, v0, LA7/n0;->g:LA7/e;

    .line 1361
    .line 1362
    invoke-virtual {v2, v4, v3}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 1363
    .line 1364
    .line 1365
    move-result v2

    .line 1366
    if-eqz v2, :cond_25

    .line 1367
    .line 1368
    invoke-static {v0}, LA7/p0;->h(LA7/n0;)LA7/m1;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v2

    .line 1372
    invoke-virtual {v2}, LA7/m1;->t0()Z

    .line 1373
    .line 1374
    .line 1375
    move-result v3

    .line 1376
    if-nez v3, :cond_24

    .line 1377
    .line 1378
    goto :goto_12

    .line 1379
    :cond_24
    invoke-virtual {v2}, LA7/B0;->b0()LA7/U1;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v2

    .line 1383
    invoke-virtual {v2}, LA7/U1;->i1()I

    .line 1384
    .line 1385
    .line 1386
    move-result v2

    .line 1387
    const v3, 0x3b3a8

    .line 1388
    .line 1389
    .line 1390
    if-lt v2, v3, :cond_25

    .line 1391
    .line 1392
    :goto_12
    invoke-static {v0}, LA7/p0;->h(LA7/n0;)LA7/m1;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v0

    .line 1396
    invoke-virtual {v0, v7}, LA7/m1;->w0(Z)LA7/N1;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v2

    .line 1400
    new-instance v3, LA7/q1;

    .line 1401
    .line 1402
    invoke-direct {v3, v0, v2, v5}, LA7/q1;-><init>(LA7/m1;LA7/N1;I)V

    .line 1403
    .line 1404
    .line 1405
    invoke-virtual {v0, v3}, LA7/m1;->m0(Ljava/lang/Runnable;)V

    .line 1406
    .line 1407
    .line 1408
    :cond_25
    return-void

    .line 1409
    :pswitch_1c
    iget-object v0, v1, LA7/V;->b:Ljava/lang/Object;

    .line 1410
    .line 1411
    check-cast v0, LA7/W;

    .line 1412
    .line 1413
    iget-object v0, v0, LA7/W;->d:Ljava/lang/Object;

    .line 1414
    .line 1415
    check-cast v0, LA7/L1;

    .line 1416
    .line 1417
    invoke-virtual {v0}, LA7/L1;->C()V

    .line 1418
    .line 1419
    .line 1420
    return-void

    .line 1421
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
