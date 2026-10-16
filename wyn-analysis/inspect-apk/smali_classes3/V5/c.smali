.class public final LV5/c;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x5

    iput v0, p0, LV5/c;->a:I

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/os/Looper;I)V
    .locals 0

    .line 2
    iput p3, p0, LV5/c;->a:I

    iput-object p1, p0, LV5/c;->b:Ljava/lang/Object;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method public constructor <init>(Ljf/h;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LV5/c;->a:I

    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    iput-object p1, p0, LV5/c;->b:Ljava/lang/Object;

    return-void
.end method

.method private final a(Landroid/os/Message;)V
    .locals 11

    .line 1
    iget-object v0, p0, LV5/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Ld2/d;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget v0, p1, Landroid/os/Message;->what:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eq v0, v2, :cond_9

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    if-eq v0, v2, :cond_6

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    if-eq v0, v2, :cond_5

    .line 20
    .line 21
    const/4 v2, 0x4

    .line 22
    if-eq v0, v2, :cond_2

    .line 23
    .line 24
    iget-object v0, v1, Ld2/d;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 25
    .line 26
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    iget p1, p1, Landroid/os/Message;->what:I

    .line 29
    .line 30
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {v2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {v0, v3, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    goto/16 :goto_2

    .line 44
    .line 45
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    goto/16 :goto_2

    .line 52
    .line 53
    :cond_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Landroid/os/Bundle;

    .line 56
    .line 57
    :try_start_0
    iget-object v0, v1, Ld2/d;->a:Landroid/media/MediaCodec;

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    .line 62
    goto/16 :goto_2

    .line 63
    .line 64
    :catch_0
    move-exception v0

    .line 65
    move-object p1, v0

    .line 66
    iget-object v0, v1, Ld2/d;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 67
    .line 68
    :cond_3
    invoke-virtual {v0, v3, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_4

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_5
    iget-object p1, v1, Ld2/d;->e:Ls8/b;

    .line 83
    .line 84
    invoke-virtual {p1}, Ls8/b;->e()Z

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 89
    .line 90
    move-object v2, p1

    .line 91
    check-cast v2, Ld2/c;

    .line 92
    .line 93
    iget v5, v2, Ld2/c;->a:I

    .line 94
    .line 95
    iget-object v7, v2, Ld2/c;->c:Landroid/media/MediaCodec$CryptoInfo;

    .line 96
    .line 97
    iget-wide v8, v2, Ld2/c;->d:J

    .line 98
    .line 99
    iget v10, v2, Ld2/c;->e:I

    .line 100
    .line 101
    :try_start_1
    sget-object p1, Ld2/d;->h:Ljava/lang/Object;

    .line 102
    .line 103
    monitor-enter p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 104
    :try_start_2
    iget-object v4, v1, Ld2/d;->a:Landroid/media/MediaCodec;

    .line 105
    .line 106
    const/4 v6, 0x0

    .line 107
    invoke-virtual/range {v4 .. v10}, Landroid/media/MediaCodec;->queueSecureInputBuffer(IILandroid/media/MediaCodec$CryptoInfo;JI)V

    .line 108
    .line 109
    .line 110
    monitor-exit p1

    .line 111
    goto :goto_0

    .line 112
    :catchall_0
    move-exception v0

    .line 113
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 114
    :try_start_3
    throw v0
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    .line 115
    :catch_1
    move-exception v0

    .line 116
    move-object p1, v0

    .line 117
    iget-object v4, v1, Ld2/d;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 118
    .line 119
    :cond_7
    invoke-virtual {v4, v3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_8

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_8
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-eqz p1, :cond_7

    .line 131
    .line 132
    :goto_0
    move-object v3, v2

    .line 133
    goto :goto_2

    .line 134
    :cond_9
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast p1, Ld2/c;

    .line 137
    .line 138
    iget v5, p1, Ld2/c;->a:I

    .line 139
    .line 140
    iget v7, p1, Ld2/c;->b:I

    .line 141
    .line 142
    iget-wide v8, p1, Ld2/c;->d:J

    .line 143
    .line 144
    iget v10, p1, Ld2/c;->e:I

    .line 145
    .line 146
    :try_start_4
    iget-object v4, v1, Ld2/d;->a:Landroid/media/MediaCodec;

    .line 147
    .line 148
    const/4 v6, 0x0

    .line 149
    invoke-virtual/range {v4 .. v10}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :catch_2
    move-exception v0

    .line 154
    iget-object v1, v1, Ld2/d;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 155
    .line 156
    :cond_a
    invoke-virtual {v1, v3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-eqz v2, :cond_b

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_b
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    if-eqz v2, :cond_a

    .line 168
    .line 169
    :goto_1
    move-object v3, p1

    .line 170
    :goto_2
    if-eqz v3, :cond_c

    .line 171
    .line 172
    invoke-static {v3}, Ld2/d;->e(Ld2/c;)V

    .line 173
    .line 174
    .line 175
    :cond_c
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 11

    .line 1
    iget v0, p0, LV5/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p1, Landroid/os/Message;->what:I

    .line 7
    .line 8
    const/4 v1, -0x3

    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    const/4 v1, -0x2

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, Landroid/content/DialogInterface;

    .line 24
    .line 25
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Landroid/content/DialogInterface$OnClickListener;

    .line 32
    .line 33
    iget-object v1, p0, LV5/c;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Landroid/content/DialogInterface;

    .line 42
    .line 43
    iget p1, p1, Landroid/os/Message;->what:I

    .line 44
    .line 45
    invoke-interface {v0, v1, p1}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    .line 46
    .line 47
    .line 48
    :goto_0
    return-void

    .line 49
    :pswitch_0
    const-string v0, "msg"

    .line 50
    .line 51
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget v0, p1, Landroid/os/Message;->what:I

    .line 55
    .line 56
    const/4 v1, 0x3

    .line 57
    const-string v2, "SessionLifecycleClient"

    .line 58
    .line 59
    if-ne v0, v1, :cond_4

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    const-string v0, "SessionUpdateExtra"

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-nez p1, :cond_3

    .line 74
    .line 75
    :cond_2
    const-string p1, ""

    .line 76
    .line 77
    :cond_3
    const-string v0, "Session update received."

    .line 78
    .line 79
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, LV5/c;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Ljf/h;

    .line 85
    .line 86
    invoke-static {v0}, LEf/H;->c(Ljf/h;)LKd/a;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v2, Lea/O;

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    invoke-direct {v2, p1, v3}, Lea/O;-><init>(Ljava/lang/String;Ljf/c;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v0, v3, v2, v1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v1, "Received unexpected event from the SessionLifecycleService: "

    .line 103
    .line 104
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 118
    .line 119
    .line 120
    :goto_1
    return-void

    .line 121
    :pswitch_1
    invoke-direct {p0, p1}, LV5/c;->a(Landroid/os/Message;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_2
    iget v0, p1, Landroid/os/Message;->what:I

    .line 126
    .line 127
    const/4 v1, 0x1

    .line 128
    if-eq v0, v1, :cond_5

    .line 129
    .line 130
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_5
    iget-object p1, p0, LV5/c;->b:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast p1, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;

    .line 137
    .line 138
    invoke-virtual {p1}, Landroidx/localbroadcastmanager/content/LocalBroadcastManager;->executePendingBroadcasts()V

    .line 139
    .line 140
    .line 141
    :goto_2
    return-void

    .line 142
    :pswitch_3
    iget v0, p1, Landroid/os/Message;->what:I

    .line 143
    .line 144
    const/4 v1, 0x1

    .line 145
    if-eq v0, v1, :cond_6

    .line 146
    .line 147
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_6
    sget p1, LVa/Xa;->l:I

    .line 152
    .line 153
    add-int/lit8 p1, p1, 0x17

    .line 154
    .line 155
    rem-int/lit16 v0, p1, 0x80

    .line 156
    .line 157
    sput v0, LVa/Xa;->k:I

    .line 158
    .line 159
    rem-int/lit8 p1, p1, 0x2

    .line 160
    .line 161
    iget-object v0, p0, LV5/c;->b:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v0, LVa/Xa;

    .line 164
    .line 165
    invoke-virtual {v0}, LVa/Xa;->f()V

    .line 166
    .line 167
    .line 168
    if-nez p1, :cond_7

    .line 169
    .line 170
    sget p1, LVa/Xa;->l:I

    .line 171
    .line 172
    add-int/lit8 p1, p1, 0x51

    .line 173
    .line 174
    rem-int/lit16 p1, p1, 0x80

    .line 175
    .line 176
    sput p1, LVa/Xa;->k:I

    .line 177
    .line 178
    :goto_3
    return-void

    .line 179
    :cond_7
    const/4 p1, 0x0

    .line 180
    throw p1

    .line 181
    :pswitch_4
    iget-object v0, p0, LV5/c;->b:Ljava/lang/Object;

    .line 182
    .line 183
    move-object v1, v0

    .line 184
    check-cast v1, LV5/e;

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    iget v0, p1, Landroid/os/Message;->what:I

    .line 190
    .line 191
    const/4 v2, 0x0

    .line 192
    if-eqz v0, :cond_e

    .line 193
    .line 194
    const/4 v3, 0x1

    .line 195
    if-eq v0, v3, :cond_b

    .line 196
    .line 197
    const/4 v3, 0x2

    .line 198
    if-eq v0, v3, :cond_a

    .line 199
    .line 200
    iget-object v0, v1, LV5/e;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 201
    .line 202
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 203
    .line 204
    iget p1, p1, Landroid/os/Message;->what:I

    .line 205
    .line 206
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-direct {v3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    :cond_8
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    if-eqz p1, :cond_9

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    if-eqz p1, :cond_8

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_a
    iget-object p1, v1, LV5/e;->e:Ls8/b;

    .line 228
    .line 229
    invoke-virtual {p1}, Ls8/b;->e()Z

    .line 230
    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_b
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 234
    .line 235
    move-object v3, p1

    .line 236
    check-cast v3, LV5/d;

    .line 237
    .line 238
    iget v5, v3, LV5/d;->a:I

    .line 239
    .line 240
    iget-object v7, v3, LV5/d;->c:Landroid/media/MediaCodec$CryptoInfo;

    .line 241
    .line 242
    iget-wide v8, v3, LV5/d;->d:J

    .line 243
    .line 244
    iget v10, v3, LV5/d;->e:I

    .line 245
    .line 246
    :try_start_0
    sget-object p1, LV5/e;->h:Ljava/lang/Object;

    .line 247
    .line 248
    monitor-enter p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 249
    :try_start_1
    iget-object v4, v1, LV5/e;->a:Landroid/media/MediaCodec;

    .line 250
    .line 251
    const/4 v6, 0x0

    .line 252
    invoke-virtual/range {v4 .. v10}, Landroid/media/MediaCodec;->queueSecureInputBuffer(IILandroid/media/MediaCodec$CryptoInfo;JI)V

    .line 253
    .line 254
    .line 255
    monitor-exit p1

    .line 256
    goto :goto_4

    .line 257
    :catchall_0
    move-exception v0

    .line 258
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 259
    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    .line 260
    :catch_0
    move-exception v0

    .line 261
    move-object p1, v0

    .line 262
    iget-object v4, v1, LV5/e;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 263
    .line 264
    :cond_c
    invoke-virtual {v4, v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    if-eqz p1, :cond_d

    .line 269
    .line 270
    goto :goto_4

    .line 271
    :cond_d
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    if-eqz p1, :cond_c

    .line 276
    .line 277
    :goto_4
    move-object v2, v3

    .line 278
    goto :goto_6

    .line 279
    :cond_e
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast p1, LV5/d;

    .line 282
    .line 283
    iget v4, p1, LV5/d;->a:I

    .line 284
    .line 285
    iget v6, p1, LV5/d;->b:I

    .line 286
    .line 287
    iget-wide v7, p1, LV5/d;->d:J

    .line 288
    .line 289
    iget v9, p1, LV5/d;->e:I

    .line 290
    .line 291
    :try_start_3
    iget-object v3, v1, LV5/e;->a:Landroid/media/MediaCodec;

    .line 292
    .line 293
    const/4 v5, 0x0

    .line 294
    invoke-virtual/range {v3 .. v9}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    .line 295
    .line 296
    .line 297
    goto :goto_5

    .line 298
    :catch_1
    move-exception v0

    .line 299
    iget-object v1, v1, LV5/e;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 300
    .line 301
    :cond_f
    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    if-eqz v3, :cond_10

    .line 306
    .line 307
    goto :goto_5

    .line 308
    :cond_10
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    if-eqz v3, :cond_f

    .line 313
    .line 314
    :goto_5
    move-object v2, p1

    .line 315
    :goto_6
    if-eqz v2, :cond_11

    .line 316
    .line 317
    invoke-static {v2}, LV5/e;->c(LV5/d;)V

    .line 318
    .line 319
    .line 320
    :cond_11
    return-void

    .line 321
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
