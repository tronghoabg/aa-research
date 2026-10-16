.class public final synthetic Lp9/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lp9/n;


# direct methods
.method public synthetic constructor <init>(Lp9/n;I)V
    .locals 0

    .line 1
    iput p2, p0, Lp9/l;->a:I

    iput-object p1, p0, Lp9/l;->b:Lp9/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    iget-object v3, p0, Lp9/l;->b:Lp9/n;

    .line 5
    .line 6
    iget v4, p0, Lp9/l;->a:I

    .line 7
    .line 8
    packed-switch v4, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v3, Lp9/n;->g:Lr9/l;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v2, Lr9/h;

    .line 17
    .line 18
    invoke-direct {v2, v0, v1}, Lr9/h;-><init>(Lr9/l;I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, v0, Lr9/l;->a:Lp7/b;

    .line 22
    .line 23
    const-string v1, "Delete All Indexes"

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lp7/b;->P(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    iget-object v0, v3, Lp9/n;->h:LE5/n0;

    .line 30
    .line 31
    iput-boolean v2, v0, LE5/n0;->g:Z

    .line 32
    .line 33
    invoke-virtual {v0}, LE5/n0;->f()V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x3

    .line 37
    iget-object v0, v0, LE5/n0;->j:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lio/flutter/plugin/platform/x;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lio/flutter/plugin/platform/x;->d(I)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_1
    iget-object v0, v3, Lp9/n;->h:LE5/n0;

    .line 46
    .line 47
    invoke-virtual {v0}, LE5/n0;->h()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_2
    iget-object v4, v3, Lp9/n;->h:LE5/n0;

    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    new-array v5, v2, [Ljava/lang/Object;

    .line 57
    .line 58
    const-string v6, "RemoteStore"

    .line 59
    .line 60
    const-string v7, "Shutting down"

    .line 61
    .line 62
    invoke-static {v6, v7, v0, v5}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object v5, v4, LE5/n0;->i:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v5, LVa/Y7;

    .line 68
    .line 69
    iget-object v6, v5, LVa/Y7;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v6, Ljava/lang/Runnable;

    .line 72
    .line 73
    if-eqz v6, :cond_0

    .line 74
    .line 75
    invoke-interface {v6}, Ljava/lang/Runnable;->run()V

    .line 76
    .line 77
    .line 78
    const/4 v6, 0x0

    .line 79
    iput-object v6, v5, LVa/Y7;->c:Ljava/lang/Object;

    .line 80
    .line 81
    :cond_0
    iput-boolean v2, v4, LE5/n0;->g:Z

    .line 82
    .line 83
    invoke-virtual {v4}, LE5/n0;->f()V

    .line 84
    .line 85
    .line 86
    iget-object v5, v4, LE5/n0;->e:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v5, Lv9/g;

    .line 89
    .line 90
    iget-object v5, v5, Lv9/g;->c:Lv9/m;

    .line 91
    .line 92
    iget-object v5, v5, Lv9/m;->d:LX8/c;

    .line 93
    .line 94
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    const-class v6, Lv9/m;

    .line 98
    .line 99
    :try_start_0
    iget-object v5, v5, LX8/c;->a:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v5, Lcom/google/android/gms/tasks/Task;

    .line 102
    .line 103
    invoke-static {v5}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    check-cast v5, Lmd/S;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2

    .line 108
    .line 109
    invoke-virtual {v5}, Lmd/S;->m()Lmd/S;

    .line 110
    .line 111
    .line 112
    :try_start_1
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 113
    .line 114
    const-wide/16 v7, 0x1

    .line 115
    .line 116
    invoke-virtual {v5, v7, v8}, Lmd/S;->i(J)Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-nez v7, :cond_1

    .line 121
    .line 122
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    const-string v8, "Unable to gracefully shutdown the gRPC ManagedChannel. Will attempt an immediate shutdown."

    .line 127
    .line 128
    new-array v9, v2, [Ljava/lang/Object;

    .line 129
    .line 130
    invoke-static {v7, v8, v0, v9}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5}, Lmd/S;->n()Lmd/S;

    .line 134
    .line 135
    .line 136
    const-wide/16 v7, 0x3c

    .line 137
    .line 138
    invoke-virtual {v5, v7, v8}, Lmd/S;->i(J)Z

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    if-nez v7, :cond_1

    .line 143
    .line 144
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    const-string v8, "Unable to forcefully shutdown the gRPC ManagedChannel."

    .line 149
    .line 150
    new-array v9, v2, [Ljava/lang/Object;

    .line 151
    .line 152
    invoke-static {v7, v8, v1, v9}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :catch_0
    invoke-virtual {v5}, Lmd/S;->n()Lmd/S;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    new-array v2, v2, [Ljava/lang/Object;

    .line 164
    .line 165
    const-string v6, "Interrupted while shutting down the gRPC Managed Channel"

    .line 166
    .line 167
    invoke-static {v5, v6, v1, v2}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :catch_1
    move-exception v5

    .line 179
    goto :goto_0

    .line 180
    :catch_2
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    new-array v2, v2, [Ljava/lang/Object;

    .line 185
    .line 186
    const-string v6, "Interrupted while retrieving the gRPC Managed Channel"

    .line 187
    .line 188
    invoke-static {v5, v6, v1, v2}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 196
    .line 197
    .line 198
    goto :goto_1

    .line 199
    :goto_0
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    new-array v7, v0, [Ljava/lang/Object;

    .line 204
    .line 205
    aput-object v5, v7, v2

    .line 206
    .line 207
    const-string v2, "Channel is not initialized, shutdown will just do nothing. Channel initializing run into exception: %s"

    .line 208
    .line 209
    invoke-static {v6, v2, v1, v7}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    :cond_1
    :goto_1
    iget-object v1, v4, LE5/n0;->j:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v1, Lio/flutter/plugin/platform/x;

    .line 215
    .line 216
    invoke-virtual {v1, v0}, Lio/flutter/plugin/platform/x;->d(I)V

    .line 217
    .line 218
    .line 219
    iget-object v0, v3, Lp9/n;->f:Lp7/b;

    .line 220
    .line 221
    invoke-virtual {v0}, Lp7/b;->S()V

    .line 222
    .line 223
    .line 224
    iget-object v0, v3, Lp9/n;->l:Lr9/P;

    .line 225
    .line 226
    if-eqz v0, :cond_2

    .line 227
    .line 228
    invoke-interface {v0}, Lr9/P;->stop()V

    .line 229
    .line 230
    .line 231
    :cond_2
    iget-object v0, v3, Lp9/n;->k:Lne/a;

    .line 232
    .line 233
    if-eqz v0, :cond_3

    .line 234
    .line 235
    invoke-virtual {v0}, Lne/a;->stop()V

    .line 236
    .line 237
    .line 238
    :cond_3
    return-void

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
