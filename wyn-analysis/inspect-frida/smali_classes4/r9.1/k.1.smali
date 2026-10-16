.class public final synthetic Lr9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lr9/k;->a:I

    iput-object p1, p0, Lr9/k;->b:Ljava/lang/Object;

    iput-object p2, p0, Lr9/k;->c:Ljava/lang/Object;

    iput-object p3, p0, Lr9/k;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Lr9/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr9/k;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lzg/k;

    .line 9
    .line 10
    iget-object v0, v0, Lzg/k;->b:Ljava/lang/Cloneable;

    .line 11
    .line 12
    check-cast v0, Lzg/l;

    .line 13
    .line 14
    iget-object v1, p0, Lr9/k;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lzg/f;

    .line 17
    .line 18
    iget-object v2, p0, Lr9/k;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Ljava/lang/Throwable;

    .line 21
    .line 22
    invoke-interface {v1, v0, v2}, Lzg/f;->onFailure(Lzg/c;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    iget-object v0, p0, Lr9/k;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lzg/k;

    .line 29
    .line 30
    iget-object v0, v0, Lzg/k;->b:Ljava/lang/Cloneable;

    .line 31
    .line 32
    check-cast v0, Lzg/l;

    .line 33
    .line 34
    iget-object v1, v0, Lzg/l;->b:Lzg/c;

    .line 35
    .line 36
    invoke-interface {v1}, Lzg/c;->isCanceled()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget-object v2, p0, Lr9/k;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Lzg/f;

    .line 43
    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    new-instance v1, Ljava/io/IOException;

    .line 47
    .line 48
    const-string v3, "Canceled"

    .line 49
    .line 50
    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v2, v0, v1}, Lzg/f;->onFailure(Lzg/c;Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object v1, p0, Lr9/k;->d:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, Lzg/Q;

    .line 60
    .line 61
    invoke-interface {v2, v0, v1}, Lzg/f;->onResponse(Lzg/c;Lzg/Q;)V

    .line 62
    .line 63
    .line 64
    :goto_0
    return-void

    .line 65
    :pswitch_1
    iget-object v0, p0, Lr9/k;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Ljava/lang/String;

    .line 68
    .line 69
    iget-object v1, p0, Lr9/k;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Lcom/vungle/ads/internal/util/s;

    .line 72
    .line 73
    iget-object v2, p0, Lr9/k;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;

    .line 76
    .line 77
    invoke-static {v2, v0, v1}, Lcom/vungle/ads/internal/AnalyticsClient;->b(Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;Ljava/lang/String;Lcom/vungle/ads/internal/util/s;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_2
    new-instance v0, Lyc/o;

    .line 82
    .line 83
    iget-object v1, p0, Lr9/k;->c:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, Ljava/lang/String;

    .line 86
    .line 87
    iget-object v2, p0, Lr9/k;->d:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v2, Ljava/lang/String;

    .line 90
    .line 91
    const/4 v3, 0x0

    .line 92
    invoke-direct {v0, v1, v2, v3}, Lyc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-object v1, p0, Lr9/k;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, Lyc/C;

    .line 98
    .line 99
    invoke-interface {v1, v0}, Lyc/C;->c(Lyc/o;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :pswitch_3
    iget-object v0, p0, Lr9/k;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, LG4/c;

    .line 106
    .line 107
    iget-object v1, p0, Lr9/k;->c:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v1, Ltg/b;

    .line 110
    .line 111
    iget-object v2, p0, Lr9/k;->d:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    :try_start_0
    iget-object v0, v0, LG4/c;->a:Landroid/content/Context;

    .line 119
    .line 120
    invoke-static {v0}, Lff/B;->n(Landroid/content/Context;)Ly1/k;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-eqz v0, :cond_1

    .line 125
    .line 126
    iget-object v3, v0, Ly1/k;->a:Ly1/f;

    .line 127
    .line 128
    check-cast v3, Ly1/j;

    .line 129
    .line 130
    iget-object v4, v3, Ly1/j;->d:Ljava/lang/Object;

    .line 131
    .line 132
    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    :try_start_1
    iput-object v2, v3, Ly1/j;->f:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 134
    .line 135
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 136
    :try_start_2
    iget-object v0, v0, Ly1/k;->a:Ly1/f;

    .line 137
    .line 138
    new-instance v3, Ly1/h;

    .line 139
    .line 140
    invoke-direct {v3, v1, v2}, Ly1/h;-><init>(Ltg/b;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v0, v3}, Ly1/f;->a(Ltg/b;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :catchall_0
    move-exception v0

    .line 148
    goto :goto_1

    .line 149
    :catchall_1
    move-exception v0

    .line 150
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 151
    :try_start_4
    throw v0

    .line 152
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 153
    .line 154
    const-string v3, "EmojiCompat font provider not available on this device."

    .line 155
    .line 156
    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 160
    :goto_1
    invoke-virtual {v1, v0}, Ltg/b;->J(Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 164
    .line 165
    .line 166
    :goto_2
    return-void

    .line 167
    :pswitch_4
    iget-object v0, p0, Lr9/k;->b:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v0, LK3/e;

    .line 170
    .line 171
    iget-object v1, p0, Lr9/k;->c:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 174
    .line 175
    iget-object v2, p0, Lr9/k;->d:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 178
    .line 179
    :try_start_5
    invoke-virtual {v0}, LK3/e;->call()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    check-cast v0, Lcom/google/android/gms/tasks/Task;

    .line 184
    .line 185
    new-instance v3, LJ9/m;

    .line 186
    .line 187
    invoke-direct {v3, v2}, LJ9/m;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 191
    .line 192
    .line 193
    goto :goto_5

    .line 194
    :catchall_2
    move-exception v0

    .line 195
    goto :goto_3

    .line 196
    :catch_0
    move-exception v0

    .line 197
    goto :goto_4

    .line 198
    :goto_3
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 199
    .line 200
    const-string v3, "Unhandled throwable in callTask."

    .line 201
    .line 202
    invoke-direct {v1, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 206
    .line 207
    .line 208
    goto :goto_5

    .line 209
    :goto_4
    invoke-virtual {v2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 210
    .line 211
    .line 212
    :goto_5
    return-void

    .line 213
    :pswitch_5
    iget-object v0, p0, Lr9/k;->c:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, Ljava/lang/String;

    .line 216
    .line 217
    iget-object v1, p0, Lr9/k;->b:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v1, Luc/q;

    .line 220
    .line 221
    iget-object v2, p0, Lr9/k;->d:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v2, Ljava/lang/String;

    .line 224
    .line 225
    if-eqz v1, :cond_2

    .line 226
    .line 227
    const/4 v3, 0x0

    .line 228
    invoke-interface {v1, v0, v2, v3}, Luc/q;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_2
    const-string v1, "ResultHandler can not send failure response "

    .line 233
    .line 234
    const-string v3, ":"

    .line 235
    .line 236
    const-string v4, " on a null method call result."

    .line 237
    .line 238
    invoke-static {v1, v0, v3, v2, v4}, LR8/v;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    const-string v1, "ffmpeg-kit-flutter"

    .line 243
    .line 244
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 245
    .line 246
    .line 247
    :goto_6
    return-void

    .line 248
    :pswitch_6
    iget-object v0, p0, Lr9/k;->b:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v0, Lr9/l;

    .line 251
    .line 252
    iget-object v1, v0, Lr9/l;->m:LR1/i;

    .line 253
    .line 254
    iget v4, v1, LR1/i;->b:I

    .line 255
    .line 256
    add-int/lit8 v2, v4, 0x2

    .line 257
    .line 258
    iput v2, v1, LR1/i;->b:I

    .line 259
    .line 260
    iget-object v1, p0, Lr9/k;->c:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v1, Lr9/p;

    .line 263
    .line 264
    iput v4, v1, Lr9/p;->a:I

    .line 265
    .line 266
    new-instance v2, Lr9/S;

    .line 267
    .line 268
    iget-object v3, v0, Lr9/l;->a:Lp7/b;

    .line 269
    .line 270
    invoke-virtual {v3}, Lp7/b;->D()Lr9/z;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-interface {v3}, Lr9/z;->d()J

    .line 275
    .line 276
    .line 277
    move-result-wide v5

    .line 278
    sget-object v7, Lr9/y;->a:Lr9/y;

    .line 279
    .line 280
    iget-object v3, p0, Lr9/k;->d:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v3, Lp9/A;

    .line 283
    .line 284
    invoke-direct/range {v2 .. v7}, Lr9/S;-><init>(Lp9/A;IJLr9/y;)V

    .line 285
    .line 286
    .line 287
    iput-object v2, v1, Lr9/p;->b:Ljava/lang/Object;

    .line 288
    .line 289
    iget-object v0, v0, Lr9/l;->i:Lr9/Q;

    .line 290
    .line 291
    invoke-interface {v0, v2}, Lr9/Q;->f(Lr9/S;)V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
