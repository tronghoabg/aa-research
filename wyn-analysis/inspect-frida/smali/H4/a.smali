.class public final LH4/a;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, LH4/a;->a:I

    iput-object p2, p0, LH4/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method

.method public constructor <init>(LH4/b;Ljava/lang/Runnable;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LH4/a;->a:I

    .line 3
    iput-object p1, p0, LH4/a;->b:Ljava/lang/Object;

    invoke-direct {p0, p2, p3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, LH4/a;->a:I

    iput-object p1, p0, LH4/a;->b:Ljava/lang/Object;

    const-string p1, "ExoPlayer:SimpleDecoder"

    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, LH4/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LH4/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lyc/G;

    .line 9
    .line 10
    invoke-virtual {v0}, Lyc/G;->a()V

    .line 11
    .line 12
    .line 13
    :goto_0
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, LH4/a;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lyc/G;

    .line 22
    .line 23
    iget-object v0, v0, Lyc/G;->r:Ljava/lang/Object;

    .line 24
    .line 25
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    :goto_1
    :try_start_1
    iget-object v1, p0, LH4/a;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lyc/G;

    .line 29
    .line 30
    iget-object v1, v1, Lyc/G;->s:Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    iget-object v1, p0, LH4/a;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lyc/G;

    .line 41
    .line 42
    iget-object v1, v1, Lyc/G;->r:Ljava/lang/Object;

    .line 43
    .line 44
    const-wide/16 v2, 0x1f4

    .line 45
    .line 46
    invoke-virtual {v1, v2, v3}, Ljava/lang/Object;->wait(J)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception v1

    .line 51
    goto :goto_2

    .line 52
    :cond_0
    iget-object v1, p0, LH4/a;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lyc/G;

    .line 55
    .line 56
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 57
    .line 58
    iput-object v2, v1, Lyc/G;->s:Ljava/lang/Boolean;

    .line 59
    .line 60
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    :try_start_2
    iget-object v0, v1, Lyc/G;->o:Landroid/graphics/SurfaceTexture;

    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    .line 64
    .line 65
    .line 66
    const/16 v0, 0x10

    .line 67
    .line 68
    new-array v0, v0, [F

    .line 69
    .line 70
    iget-object v1, p0, LH4/a;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, Lyc/G;

    .line 73
    .line 74
    iget-object v1, v1, Lyc/G;->o:Landroid/graphics/SurfaceTexture;

    .line 75
    .line 76
    invoke-virtual {v1, v0}, Landroid/graphics/SurfaceTexture;->getTransformMatrix([F)V

    .line 77
    .line 78
    .line 79
    iget-object v1, p0, LH4/a;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, Lyc/G;

    .line 82
    .line 83
    iget v2, v1, Lyc/G;->t:I

    .line 84
    .line 85
    iget v3, v1, Lyc/G;->u:I

    .line 86
    .line 87
    invoke-virtual {v1, v0, v2, v3}, Lyc/G;->b([FII)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :goto_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 92
    :try_start_4
    throw v1
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0

    .line 93
    :catch_0
    const-string v0, "VideoRenderer"

    .line 94
    .line 95
    const-string v1, "thread interrupted while waiting for frames"

    .line 96
    .line 97
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    :cond_1
    return-void

    .line 101
    :pswitch_0
    iget-object v0, p0, LH4/a;->b:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, LAf/q;

    .line 104
    .line 105
    invoke-virtual {v0}, LAf/q;->invoke()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :pswitch_1
    iget-object v0, p0, LH4/a;->b:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v0, Lc2/b;

    .line 112
    .line 113
    :goto_3
    :try_start_5
    invoke-virtual {v0}, Lc2/b;->h()Z

    .line 114
    .line 115
    .line 116
    move-result v1
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_1

    .line 117
    if-eqz v1, :cond_2

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_2
    return-void

    .line 121
    :catch_1
    move-exception v0

    .line 122
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 123
    .line 124
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    throw v1

    .line 128
    :pswitch_2
    iget-object v0, p0, LH4/a;->b:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Lh6/e;

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    :goto_4
    :try_start_6
    invoke-virtual {v0}, Lh6/e;->g()Z

    .line 136
    .line 137
    .line 138
    move-result v1
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_2

    .line 139
    if-eqz v1, :cond_3

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_3
    return-void

    .line 143
    :catch_2
    move-exception v0

    .line 144
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 145
    .line 146
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    throw v1

    .line 150
    :pswitch_3
    const/16 v0, 0x9

    .line 151
    .line 152
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, LH4/a;->b:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, LH4/b;

    .line 158
    .line 159
    iget-boolean v0, v0, LH4/b;->b:Z

    .line 160
    .line 161
    if-eqz v0, :cond_4

    .line 162
    .line 163
    new-instance v0, Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 164
    .line 165
    invoke-direct {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectNetwork()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyDeath()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 181
    .line 182
    .line 183
    :cond_4
    :try_start_7
    invoke-super {p0}, Ljava/lang/Thread;->run()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 184
    .line 185
    .line 186
    goto :goto_5

    .line 187
    :catchall_1
    move-exception v0

    .line 188
    const/4 v1, 0x6

    .line 189
    const-string v2, "GlideExecutor"

    .line 190
    .line 191
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-eqz v1, :cond_5

    .line 196
    .line 197
    const-string v1, "Request threw uncaught throwable"

    .line 198
    .line 199
    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 200
    .line 201
    .line 202
    :cond_5
    :goto_5
    return-void

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
