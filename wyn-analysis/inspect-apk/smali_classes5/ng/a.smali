.class public final synthetic Lng/a;
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
    iput p1, p0, Lng/a;->a:I

    iput-object p2, p0, Lng/a;->b:Ljava/lang/Object;

    iput-object p3, p0, Lng/a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LX2/j;LN1/n;LU1/e;)V
    .locals 0

    .line 2
    const/16 p3, 0x9

    iput p3, p0, Lng/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lng/a;->b:Ljava/lang/Object;

    iput-object p2, p0, Lng/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Process;Ljava/io/InputStream;)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Lng/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lng/a;->c:Ljava/lang/Object;

    iput-object p2, p0, Lng/a;->b:Ljava/lang/Object;

    return-void
.end method

.method private final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LG5/p;

    .line 4
    .line 5
    iget-object v1, p0, Lng/a;->c:Ljava/lang/Object;

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
    sget v2, Lu6/v;->a:I

    .line 17
    .line 18
    iget-object v0, v0, LE5/F;->a:LE5/I;

    .line 19
    .line 20
    iget-object v0, v0, LE5/I;->r:LF5/f;

    .line 21
    .line 22
    iget-object v2, v0, LF5/f;->d:LC6/l;

    .line 23
    .line 24
    iget-object v2, v2, LC6/l;->e:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Lf6/z;

    .line 27
    .line 28
    invoke-virtual {v0, v2}, LF5/f;->L(Lf6/z;)LF5/a;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    new-instance v3, LB8/b;

    .line 33
    .line 34
    const/16 v4, 0xb

    .line 35
    .line 36
    invoke-direct {v3, v2, v1, v4}, LB8/b;-><init>(LF5/a;Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    const/16 v1, 0x3fc

    .line 40
    .line 41
    invoke-virtual {v0, v2, v1, v3}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    const/4 v0, 0x7

    .line 2
    const/16 v1, 0x19

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x1

    .line 7
    const/4 v5, 0x0

    .line 8
    iget v6, p0, Lng/a;->a:I

    .line 9
    .line 10
    packed-switch v6, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/lang/Integer;

    .line 16
    .line 17
    iget-object v1, p0, Lng/a;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/unity3d/services/store/core/api/Store;->a(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lp2/a;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lng/a;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ljava/lang/Runnable;

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 37
    .line 38
    .line 39
    iget-object v0, v0, Lp2/a;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Ljava/util/concurrent/Semaphore;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_1
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lw9/l;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    new-instance v1, Ljava/util/Date;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    iput-wide v1, v0, Lw9/l;->g:J

    .line 64
    .line 65
    iget-object v0, p0, Lng/a;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Ljava/lang/Runnable;

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_2
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lw9/f;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, Lng/a;->c:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, Ljava/lang/Runnable;

    .line 83
    .line 84
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 85
    .line 86
    .line 87
    iget-object v0, v0, Lw9/f;->a:Ljava/util/concurrent/Semaphore;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :pswitch_3
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 96
    .line 97
    iget-object v1, p0, Lng/a;->c:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, Ljava/util/concurrent/Callable;

    .line 100
    .line 101
    :try_start_0
    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :catch_0
    move-exception v1

    .line 110
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 111
    .line 112
    .line 113
    new-instance v0, Ljava/lang/RuntimeException;

    .line 114
    .line 115
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    throw v0

    .line 119
    :pswitch_4
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, Lw6/k;

    .line 122
    .line 123
    iget-object v1, v0, Lw6/k;->g:Landroid/graphics/SurfaceTexture;

    .line 124
    .line 125
    iget-object v2, v0, Lw6/k;->h:Landroid/view/Surface;

    .line 126
    .line 127
    new-instance v3, Landroid/view/Surface;

    .line 128
    .line 129
    iget-object v4, p0, Lng/a;->c:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v4, Landroid/graphics/SurfaceTexture;

    .line 132
    .line 133
    invoke-direct {v3, v4}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 134
    .line 135
    .line 136
    iput-object v4, v0, Lw6/k;->g:Landroid/graphics/SurfaceTexture;

    .line 137
    .line 138
    iput-object v3, v0, Lw6/k;->h:Landroid/view/Surface;

    .line 139
    .line 140
    iget-object v0, v0, Lw6/k;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-eqz v4, :cond_0

    .line 151
    .line 152
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    check-cast v4, LE5/F;

    .line 157
    .line 158
    iget-object v4, v4, LE5/F;->a:LE5/I;

    .line 159
    .line 160
    invoke-virtual {v4, v3}, LE5/I;->L0(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_0
    if-eqz v1, :cond_1

    .line 165
    .line 166
    invoke-virtual {v1}, Landroid/graphics/SurfaceTexture;->release()V

    .line 167
    .line 168
    .line 169
    :cond_1
    if-eqz v2, :cond_2

    .line 170
    .line 171
    invoke-virtual {v2}, Landroid/view/Surface;->release()V

    .line 172
    .line 173
    .line 174
    :cond_2
    return-void

    .line 175
    :pswitch_5
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, LE5/n0;

    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    sget-object v1, Lv9/f;->b:Lv9/f;

    .line 183
    .line 184
    iget-object v2, p0, Lng/a;->c:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v2, Lv9/f;

    .line 187
    .line 188
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    iget-object v6, v0, LE5/n0;->j:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v6, Lio/flutter/plugin/platform/x;

    .line 195
    .line 196
    if-eqz v1, :cond_3

    .line 197
    .line 198
    iget v1, v6, Lio/flutter/plugin/platform/x;->a:I

    .line 199
    .line 200
    invoke-static {v1, v3}, LA/f;->b(II)Z

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-eqz v1, :cond_3

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_3
    sget-object v1, Lv9/f;->a:Lv9/f;

    .line 208
    .line 209
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    if-eqz v1, :cond_4

    .line 214
    .line 215
    iget v1, v6, Lio/flutter/plugin/platform/x;->a:I

    .line 216
    .line 217
    const/4 v2, 0x3

    .line 218
    invoke-static {v1, v2}, LA/f;->b(II)Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-eqz v1, :cond_4

    .line 223
    .line 224
    goto :goto_1

    .line 225
    :cond_4
    iget-boolean v1, v0, LE5/n0;->g:Z

    .line 226
    .line 227
    if-nez v1, :cond_5

    .line 228
    .line 229
    goto :goto_1

    .line 230
    :cond_5
    new-array v1, v5, [Ljava/lang/Object;

    .line 231
    .line 232
    const-string v2, "RemoteStore"

    .line 233
    .line 234
    const-string v3, "Restarting streams for network reachability change."

    .line 235
    .line 236
    invoke-static {v2, v3, v4, v1}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    iput-boolean v5, v0, LE5/n0;->g:Z

    .line 240
    .line 241
    invoke-virtual {v0}, LE5/n0;->f()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v6, v4}, Lio/flutter/plugin/platform/x;->d(I)V

    .line 245
    .line 246
    .line 247
    iget-object v1, v0, LE5/n0;->f:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v1, Lv9/B;

    .line 250
    .line 251
    invoke-virtual {v1}, Lv9/b;->b()V

    .line 252
    .line 253
    .line 254
    iget-object v1, v0, LE5/n0;->k:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v1, Lv9/A;

    .line 257
    .line 258
    invoke-virtual {v1}, Lv9/b;->b()V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0}, LE5/n0;->h()V

    .line 262
    .line 263
    .line 264
    :goto_1
    return-void

    .line 265
    :pswitch_6
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v0, LVa/Y7;

    .line 268
    .line 269
    iget-object v0, v0, LVa/Y7;->a:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v0, Landroid/content/Context;

    .line 272
    .line 273
    iget-object v1, p0, Lng/a;->c:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v1, Lnd/a;

    .line 276
    .line 277
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 278
    .line 279
    .line 280
    return-void

    .line 281
    :pswitch_7
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v0, LVa/Y7;

    .line 284
    .line 285
    iget-object v0, v0, LVa/Y7;->b:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 288
    .line 289
    iget-object v1, p0, Lng/a;->c:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v1, LQ3/h;

    .line 292
    .line 293
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 294
    .line 295
    .line 296
    return-void

    .line 297
    :pswitch_8
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v0, LE4/n;

    .line 300
    .line 301
    iget-object v1, p0, Lng/a;->c:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v1, Lmd/k0;

    .line 304
    .line 305
    invoke-virtual {v1}, Lmd/k0;->f()Z

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    iget-object v0, v0, LE4/n;->d:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v0, Lv9/b;

    .line 312
    .line 313
    if-eqz v2, :cond_6

    .line 314
    .line 315
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    new-array v6, v4, [Ljava/lang/Object;

    .line 332
    .line 333
    aput-object v3, v6, v5

    .line 334
    .line 335
    const-string v3, "(%x) Stream closed."

    .line 336
    .line 337
    invoke-static {v2, v3, v4, v6}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    goto :goto_2

    .line 341
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 350
    .line 351
    .line 352
    move-result v6

    .line 353
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 354
    .line 355
    .line 356
    move-result-object v6

    .line 357
    new-array v7, v3, [Ljava/lang/Object;

    .line 358
    .line 359
    aput-object v6, v7, v5

    .line 360
    .line 361
    aput-object v1, v7, v4

    .line 362
    .line 363
    const-string v4, "(%x) Stream closed with status: %s."

    .line 364
    .line 365
    invoke-static {v2, v4, v3, v7}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    :goto_2
    invoke-virtual {v0}, Lv9/b;->d()Z

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    new-array v3, v5, [Ljava/lang/Object;

    .line 373
    .line 374
    const-string v4, "Can\'t handle server close on non-started stream!"

    .line 375
    .line 376
    invoke-static {v2, v4, v3}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    sget-object v2, Lv9/r;->e:Lv9/r;

    .line 380
    .line 381
    invoke-virtual {v0, v2, v1}, Lv9/b;->a(Lv9/r;Lmd/k0;)V

    .line 382
    .line 383
    .line 384
    return-void

    .line 385
    :pswitch_9
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v0, LE4/n;

    .line 388
    .line 389
    invoke-static {}, LBa/c;->E()Z

    .line 390
    .line 391
    .line 392
    move-result v1

    .line 393
    if-eqz v1, :cond_b

    .line 394
    .line 395
    new-instance v1, Ljava/util/HashMap;

    .line 396
    .line 397
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 398
    .line 399
    .line 400
    iget-object v2, p0, Lng/a;->c:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v2, Lmd/b0;

    .line 403
    .line 404
    iget v6, v2, Lmd/b0;->b:I

    .line 405
    .line 406
    if-nez v6, :cond_7

    .line 407
    .line 408
    sget-object v6, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 409
    .line 410
    goto :goto_4

    .line 411
    :cond_7
    new-instance v6, Ljava/util/HashSet;

    .line 412
    .line 413
    iget v7, v2, Lmd/b0;->b:I

    .line 414
    .line 415
    invoke-direct {v6, v7}, Ljava/util/HashSet;-><init>(I)V

    .line 416
    .line 417
    .line 418
    move v7, v5

    .line 419
    :goto_3
    iget v8, v2, Lmd/b0;->b:I

    .line 420
    .line 421
    if-ge v7, v8, :cond_8

    .line 422
    .line 423
    new-instance v8, Ljava/lang/String;

    .line 424
    .line 425
    invoke-virtual {v2, v7}, Lmd/b0;->e(I)[B

    .line 426
    .line 427
    .line 428
    move-result-object v9

    .line 429
    invoke-direct {v8, v9, v5}, Ljava/lang/String;-><init>([BI)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v6, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    add-int/2addr v7, v4

    .line 436
    goto :goto_3

    .line 437
    :cond_8
    invoke-static {v6}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 438
    .line 439
    .line 440
    move-result-object v6

    .line 441
    :goto_4
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 442
    .line 443
    .line 444
    move-result-object v6

    .line 445
    :cond_9
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 446
    .line 447
    .line 448
    move-result v7

    .line 449
    if-eqz v7, :cond_a

    .line 450
    .line 451
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v7

    .line 455
    check-cast v7, Ljava/lang/String;

    .line 456
    .line 457
    sget-object v8, Lv9/g;->d:Ljava/util/HashSet;

    .line 458
    .line 459
    sget-object v9, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 460
    .line 461
    invoke-virtual {v7, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v9

    .line 465
    invoke-virtual {v8, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    move-result v8

    .line 469
    if-eqz v8, :cond_9

    .line 470
    .line 471
    sget-object v8, Lmd/b0;->d:Lmd/j;

    .line 472
    .line 473
    sget-object v9, Lmd/Y;->d:Ljava/util/BitSet;

    .line 474
    .line 475
    new-instance v9, Lmd/W;

    .line 476
    .line 477
    invoke-direct {v9, v7, v8}, Lmd/W;-><init>(Ljava/lang/String;Lmd/X;)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v2, v9}, Lmd/b0;->c(Lmd/Y;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v8

    .line 484
    check-cast v8, Ljava/lang/String;

    .line 485
    .line 486
    invoke-virtual {v1, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    goto :goto_5

    .line 490
    :cond_a
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 491
    .line 492
    .line 493
    move-result v2

    .line 494
    if-nez v2, :cond_b

    .line 495
    .line 496
    iget-object v0, v0, LE4/n;->d:Ljava/lang/Object;

    .line 497
    .line 498
    check-cast v0, Lv9/b;

    .line 499
    .line 500
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v2

    .line 508
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    new-array v3, v3, [Ljava/lang/Object;

    .line 517
    .line 518
    aput-object v0, v3, v5

    .line 519
    .line 520
    aput-object v1, v3, v4

    .line 521
    .line 522
    const-string v0, "(%x) Stream received headers: %s"

    .line 523
    .line 524
    invoke-static {v2, v0, v4, v3}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    :cond_b
    return-void

    .line 528
    :pswitch_a
    invoke-direct {p0}, Lng/a;->a()V

    .line 529
    .line 530
    .line 531
    return-void

    .line 532
    :pswitch_b
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v0, LG5/p;

    .line 535
    .line 536
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 537
    .line 538
    .line 539
    sget v2, Lu6/v;->a:I

    .line 540
    .line 541
    iget-object v0, v0, LG5/p;->c:LE5/F;

    .line 542
    .line 543
    iget-object v0, v0, LE5/F;->a:LE5/I;

    .line 544
    .line 545
    iget-object v2, p0, Lng/a;->c:Ljava/lang/Object;

    .line 546
    .line 547
    check-cast v2, Lv6/o;

    .line 548
    .line 549
    iput-object v2, v0, LE5/I;->h0:Lv6/o;

    .line 550
    .line 551
    new-instance v3, LE5/E;

    .line 552
    .line 553
    invoke-direct {v3, v2}, LE5/E;-><init>(Lv6/o;)V

    .line 554
    .line 555
    .line 556
    iget-object v0, v0, LE5/I;->l:LK8/H;

    .line 557
    .line 558
    invoke-virtual {v0, v1, v3}, LK8/H;->p(ILu6/g;)V

    .line 559
    .line 560
    .line 561
    return-void

    .line 562
    :pswitch_c
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 563
    .line 564
    check-cast v0, Lu6/o;

    .line 565
    .line 566
    invoke-virtual {v0}, Lu6/o;->c()I

    .line 567
    .line 568
    .line 569
    move-result v0

    .line 570
    iget-object v1, p0, Lng/a;->c:Ljava/lang/Object;

    .line 571
    .line 572
    check-cast v1, Lt6/o;

    .line 573
    .line 574
    invoke-virtual {v1, v0}, Lt6/o;->a(I)V

    .line 575
    .line 576
    .line 577
    return-void

    .line 578
    :pswitch_d
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 579
    .line 580
    check-cast v0, Luc/q;

    .line 581
    .line 582
    iget-object v1, p0, Lng/a;->c:Ljava/lang/Object;

    .line 583
    .line 584
    check-cast v1, Ljava/io/Serializable;

    .line 585
    .line 586
    if-eqz v0, :cond_c

    .line 587
    .line 588
    invoke-interface {v0, v1}, Luc/q;->a(Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    goto :goto_6

    .line 592
    :cond_c
    const-string v0, "ResultHandler can not send successful response %s on a null method call result."

    .line 593
    .line 594
    new-array v2, v4, [Ljava/lang/Object;

    .line 595
    .line 596
    aput-object v1, v2, v5

    .line 597
    .line 598
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    const-string v1, "ffmpeg-kit-flutter"

    .line 603
    .line 604
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 605
    .line 606
    .line 607
    :goto_6
    return-void

    .line 608
    :pswitch_e
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 609
    .line 610
    check-cast v0, Lre/c;

    .line 611
    .line 612
    const-string v1, "this$0"

    .line 613
    .line 614
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 615
    .line 616
    .line 617
    iget-object v1, p0, Lng/a;->c:Ljava/lang/Object;

    .line 618
    .line 619
    check-cast v1, Ljava/lang/String;

    .line 620
    .line 621
    iget-object v0, v0, Lre/c;->a:Ljava/lang/ref/WeakReference;

    .line 622
    .line 623
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    check-cast v0, Lce/a;

    .line 628
    .line 629
    if-eqz v0, :cond_d

    .line 630
    .line 631
    invoke-interface {v0, v1}, Lce/a;->a(Ljava/lang/String;)V

    .line 632
    .line 633
    .line 634
    :cond_d
    return-void

    .line 635
    :pswitch_f
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast v0, Lre/c;

    .line 638
    .line 639
    const-string v1, "this$0"

    .line 640
    .line 641
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    iget-object v1, p0, Lng/a;->c:Ljava/lang/Object;

    .line 645
    .line 646
    check-cast v1, LG9/e;

    .line 647
    .line 648
    iget-object v0, v0, Lre/c;->a:Ljava/lang/ref/WeakReference;

    .line 649
    .line 650
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    check-cast v0, Lce/a;

    .line 655
    .line 656
    if-eqz v0, :cond_e

    .line 657
    .line 658
    invoke-interface {v0, v1}, Lce/a;->d(LG9/e;)V

    .line 659
    .line 660
    .line 661
    :cond_e
    return-void

    .line 662
    :pswitch_10
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast v0, Lr9/l;

    .line 665
    .line 666
    iget-object v0, v0, Lr9/l;->c:Lr9/v;

    .line 667
    .line 668
    iget-object v1, p0, Lng/a;->c:Ljava/lang/Object;

    .line 669
    .line 670
    check-cast v1, Lcom/google/protobuf/ByteString;

    .line 671
    .line 672
    invoke-interface {v0, v1}, Lr9/v;->f(Lcom/google/protobuf/ByteString;)V

    .line 673
    .line 674
    .line 675
    return-void

    .line 676
    :pswitch_11
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 677
    .line 678
    check-cast v0, Lr9/l;

    .line 679
    .line 680
    iget-object v0, v0, Lr9/l;->j:Lr9/a;

    .line 681
    .line 682
    iget-object v1, p0, Lng/a;->c:Ljava/lang/Object;

    .line 683
    .line 684
    check-cast v1, Lo9/e;

    .line 685
    .line 686
    invoke-interface {v0, v1}, Lr9/a;->Q(Lo9/e;)V

    .line 687
    .line 688
    .line 689
    return-void

    .line 690
    :pswitch_12
    iget-object v1, p0, Lng/a;->b:Ljava/lang/Object;

    .line 691
    .line 692
    check-cast v1, LX2/j;

    .line 693
    .line 694
    iget-object v3, p0, Lng/a;->c:Ljava/lang/Object;

    .line 695
    .line 696
    check-cast v3, LH5/e;

    .line 697
    .line 698
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 699
    .line 700
    .line 701
    monitor-enter v3

    .line 702
    monitor-exit v3

    .line 703
    iget-object v1, v1, LX2/j;->c:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v1, LU1/r;

    .line 706
    .line 707
    sget v4, LQ1/x;->a:I

    .line 708
    .line 709
    iget-object v1, v1, LU1/r;->a:LU1/u;

    .line 710
    .line 711
    iget-object v4, v1, LU1/u;->r:LV1/d;

    .line 712
    .line 713
    iget-object v5, v4, LV1/d;->d:LC6/l;

    .line 714
    .line 715
    iget-object v5, v5, LC6/l;->e:Ljava/lang/Object;

    .line 716
    .line 717
    check-cast v5, Lk2/H;

    .line 718
    .line 719
    invoke-virtual {v4, v5}, LV1/d;->I(Lk2/H;)LV1/a;

    .line 720
    .line 721
    .line 722
    move-result-object v5

    .line 723
    new-instance v6, LS8/b;

    .line 724
    .line 725
    invoke-direct {v6, v5, v3, v0}, LS8/b;-><init>(LV1/a;Ljava/lang/Object;I)V

    .line 726
    .line 727
    .line 728
    const/16 v0, 0x3fc

    .line 729
    .line 730
    invoke-virtual {v4, v5, v0, v6}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 731
    .line 732
    .line 733
    iput-object v2, v1, LU1/u;->M:LN1/n;

    .line 734
    .line 735
    return-void

    .line 736
    :pswitch_13
    iget-object v1, p0, Lng/a;->b:Ljava/lang/Object;

    .line 737
    .line 738
    check-cast v1, LX2/j;

    .line 739
    .line 740
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 741
    .line 742
    .line 743
    sget v2, LQ1/x;->a:I

    .line 744
    .line 745
    iget-object v1, v1, LX2/j;->c:Ljava/lang/Object;

    .line 746
    .line 747
    check-cast v1, LU1/r;

    .line 748
    .line 749
    iget-object v2, p0, Lng/a;->c:Ljava/lang/Object;

    .line 750
    .line 751
    check-cast v2, LN1/n;

    .line 752
    .line 753
    iget-object v1, v1, LU1/r;->a:LU1/u;

    .line 754
    .line 755
    iput-object v2, v1, LU1/u;->M:LN1/n;

    .line 756
    .line 757
    iget-object v1, v1, LU1/u;->r:LV1/d;

    .line 758
    .line 759
    invoke-virtual {v1}, LV1/d;->K()LV1/a;

    .line 760
    .line 761
    .line 762
    move-result-object v2

    .line 763
    new-instance v3, LV1/b;

    .line 764
    .line 765
    invoke-direct {v3, v0}, LV1/b;-><init>(I)V

    .line 766
    .line 767
    .line 768
    const/16 v0, 0x3f9

    .line 769
    .line 770
    invoke-virtual {v1, v2, v0, v3}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 771
    .line 772
    .line 773
    return-void

    .line 774
    :pswitch_14
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 775
    .line 776
    check-cast v0, LX2/j;

    .line 777
    .line 778
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 779
    .line 780
    .line 781
    sget v2, LQ1/x;->a:I

    .line 782
    .line 783
    iget-object v0, v0, LX2/j;->c:Ljava/lang/Object;

    .line 784
    .line 785
    check-cast v0, LU1/r;

    .line 786
    .line 787
    iget-object v0, v0, LU1/r;->a:LU1/u;

    .line 788
    .line 789
    iget-object v2, p0, Lng/a;->c:Ljava/lang/Object;

    .line 790
    .line 791
    check-cast v2, LN1/Y;

    .line 792
    .line 793
    iput-object v2, v0, LU1/u;->b0:LN1/Y;

    .line 794
    .line 795
    new-instance v3, LU1/q;

    .line 796
    .line 797
    invoke-direct {v3, v2}, LU1/q;-><init>(LN1/Y;)V

    .line 798
    .line 799
    .line 800
    iget-object v0, v0, LU1/u;->l:LQ1/j;

    .line 801
    .line 802
    invoke-virtual {v0, v1, v3}, LQ1/j;->e(ILQ1/g;)V

    .line 803
    .line 804
    .line 805
    return-void

    .line 806
    :pswitch_15
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 807
    .line 808
    check-cast v0, Lp9/n;

    .line 809
    .line 810
    iget-object v1, v0, Lp9/n;->i:Lp9/z;

    .line 811
    .line 812
    if-eqz v1, :cond_f

    .line 813
    .line 814
    move v1, v4

    .line 815
    goto :goto_7

    .line 816
    :cond_f
    move v1, v5

    .line 817
    :goto_7
    const-string v6, "SyncEngine not yet initialized"

    .line 818
    .line 819
    new-array v7, v5, [Ljava/lang/Object;

    .line 820
    .line 821
    invoke-static {v1, v6, v7}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 822
    .line 823
    .line 824
    iget-object v1, p0, Lng/a;->c:Ljava/lang/Object;

    .line 825
    .line 826
    check-cast v1, Ln9/e;

    .line 827
    .line 828
    iget-object v6, v1, Ln9/e;->a:Ljava/lang/String;

    .line 829
    .line 830
    new-array v7, v4, [Ljava/lang/Object;

    .line 831
    .line 832
    aput-object v6, v7, v5

    .line 833
    .line 834
    const-string v6, "FirestoreClient"

    .line 835
    .line 836
    const-string v8, "Credential changed. Current user: %s"

    .line 837
    .line 838
    invoke-static {v6, v8, v4, v7}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 839
    .line 840
    .line 841
    iget-object v0, v0, Lp9/n;->i:Lp9/z;

    .line 842
    .line 843
    iget-object v6, v0, Lp9/z;->l:Ln9/e;

    .line 844
    .line 845
    invoke-virtual {v6, v1}, Ln9/e;->equals(Ljava/lang/Object;)Z

    .line 846
    .line 847
    .line 848
    move-result v6

    .line 849
    iput-object v1, v0, Lp9/z;->l:Ln9/e;

    .line 850
    .line 851
    if-nez v6, :cond_15

    .line 852
    .line 853
    iget-object v6, v0, Lp9/z;->j:Ljava/util/HashMap;

    .line 854
    .line 855
    invoke-virtual {v6}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 856
    .line 857
    .line 858
    move-result-object v7

    .line 859
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 860
    .line 861
    .line 862
    move-result-object v7

    .line 863
    :cond_10
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 864
    .line 865
    .line 866
    move-result v8

    .line 867
    if-eqz v8, :cond_11

    .line 868
    .line 869
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v8

    .line 873
    check-cast v8, Ljava/util/Map$Entry;

    .line 874
    .line 875
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v8

    .line 879
    check-cast v8, Ljava/util/List;

    .line 880
    .line 881
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 882
    .line 883
    .line 884
    move-result-object v8

    .line 885
    :goto_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 886
    .line 887
    .line 888
    move-result v9

    .line 889
    if-eqz v9, :cond_10

    .line 890
    .line 891
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    move-result-object v9

    .line 895
    check-cast v9, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 896
    .line 897
    new-instance v10, Lm9/G;

    .line 898
    .line 899
    sget-object v11, Lm9/F;->c:Lm9/F;

    .line 900
    .line 901
    const-string v12, "\'waitForPendingWrites\' task is cancelled due to User change."

    .line 902
    .line 903
    invoke-direct {v10, v12, v11}, Lm9/G;-><init>(Ljava/lang/String;Lm9/F;)V

    .line 904
    .line 905
    .line 906
    invoke-virtual {v9, v10}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 907
    .line 908
    .line 909
    goto :goto_8

    .line 910
    :cond_11
    invoke-virtual {v6}, Ljava/util/HashMap;->clear()V

    .line 911
    .line 912
    .line 913
    iget-object v6, v0, Lp9/z;->a:Lr9/l;

    .line 914
    .line 915
    iget-object v7, v6, Lr9/l;->c:Lr9/v;

    .line 916
    .line 917
    invoke-interface {v7}, Lr9/v;->k()Ljava/util/List;

    .line 918
    .line 919
    .line 920
    move-result-object v7

    .line 921
    invoke-virtual {v6, v1}, Lr9/l;->c(Ln9/e;)V

    .line 922
    .line 923
    .line 924
    new-instance v1, Lr9/h;

    .line 925
    .line 926
    invoke-direct {v1, v6, v5}, Lr9/h;-><init>(Lr9/l;I)V

    .line 927
    .line 928
    .line 929
    const-string v8, "Start IndexManager"

    .line 930
    .line 931
    iget-object v9, v6, Lr9/l;->a:Lp7/b;

    .line 932
    .line 933
    invoke-virtual {v9, v8, v1}, Lp7/b;->P(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 934
    .line 935
    .line 936
    new-instance v1, Lr9/h;

    .line 937
    .line 938
    invoke-direct {v1, v6, v4}, Lr9/h;-><init>(Lr9/l;I)V

    .line 939
    .line 940
    .line 941
    const-string v8, "Start MutationQueue"

    .line 942
    .line 943
    invoke-virtual {v9, v8, v1}, Lp7/b;->P(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 944
    .line 945
    .line 946
    iget-object v1, v6, Lr9/l;->c:Lr9/v;

    .line 947
    .line 948
    invoke-interface {v1}, Lr9/v;->k()Ljava/util/List;

    .line 949
    .line 950
    .line 951
    move-result-object v1

    .line 952
    sget-object v8, Ls9/h;->c:Lc9/d;

    .line 953
    .line 954
    new-array v3, v3, [Ljava/util/List;

    .line 955
    .line 956
    aput-object v7, v3, v5

    .line 957
    .line 958
    aput-object v1, v3, v4

    .line 959
    .line 960
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 961
    .line 962
    .line 963
    move-result-object v1

    .line 964
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 965
    .line 966
    .line 967
    move-result-object v1

    .line 968
    :cond_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 969
    .line 970
    .line 971
    move-result v3

    .line 972
    if-eqz v3, :cond_14

    .line 973
    .line 974
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 975
    .line 976
    .line 977
    move-result-object v3

    .line 978
    check-cast v3, Ljava/util/List;

    .line 979
    .line 980
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 981
    .line 982
    .line 983
    move-result-object v3

    .line 984
    :cond_13
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 985
    .line 986
    .line 987
    move-result v7

    .line 988
    if-eqz v7, :cond_12

    .line 989
    .line 990
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 991
    .line 992
    .line 993
    move-result-object v7

    .line 994
    check-cast v7, Lt9/i;

    .line 995
    .line 996
    iget-object v7, v7, Lt9/i;->d:Ljava/util/List;

    .line 997
    .line 998
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 999
    .line 1000
    .line 1001
    move-result-object v7

    .line 1002
    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1003
    .line 1004
    .line 1005
    move-result v9

    .line 1006
    if-eqz v9, :cond_13

    .line 1007
    .line 1008
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v9

    .line 1012
    check-cast v9, Lt9/h;

    .line 1013
    .line 1014
    iget-object v9, v9, Lt9/h;->a:Ls9/h;

    .line 1015
    .line 1016
    invoke-virtual {v8, v9}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v8

    .line 1020
    goto :goto_9

    .line 1021
    :cond_14
    iget-object v1, v6, Lr9/l;->f:LVa/Za;

    .line 1022
    .line 1023
    invoke-virtual {v1, v8}, LVa/Za;->e(Ljava/lang/Iterable;)Lc9/c;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v1

    .line 1027
    invoke-virtual {v0, v1, v2}, Lp9/z;->b(Lc9/c;LC8/i;)V

    .line 1028
    .line 1029
    .line 1030
    :cond_15
    iget-object v0, v0, Lp9/z;->b:LE5/n0;

    .line 1031
    .line 1032
    iget-boolean v1, v0, LE5/n0;->g:Z

    .line 1033
    .line 1034
    if-eqz v1, :cond_16

    .line 1035
    .line 1036
    new-array v1, v5, [Ljava/lang/Object;

    .line 1037
    .line 1038
    const-string v2, "RemoteStore"

    .line 1039
    .line 1040
    const-string v3, "Restarting streams for new credential."

    .line 1041
    .line 1042
    invoke-static {v2, v3, v4, v1}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 1043
    .line 1044
    .line 1045
    iput-boolean v5, v0, LE5/n0;->g:Z

    .line 1046
    .line 1047
    invoke-virtual {v0}, LE5/n0;->f()V

    .line 1048
    .line 1049
    .line 1050
    iget-object v1, v0, LE5/n0;->j:Ljava/lang/Object;

    .line 1051
    .line 1052
    check-cast v1, Lio/flutter/plugin/platform/x;

    .line 1053
    .line 1054
    invoke-virtual {v1, v4}, Lio/flutter/plugin/platform/x;->d(I)V

    .line 1055
    .line 1056
    .line 1057
    iget-object v1, v0, LE5/n0;->f:Ljava/lang/Object;

    .line 1058
    .line 1059
    check-cast v1, Lv9/B;

    .line 1060
    .line 1061
    invoke-virtual {v1}, Lv9/b;->b()V

    .line 1062
    .line 1063
    .line 1064
    iget-object v1, v0, LE5/n0;->k:Ljava/lang/Object;

    .line 1065
    .line 1066
    check-cast v1, Lv9/A;

    .line 1067
    .line 1068
    invoke-virtual {v1}, Lv9/b;->b()V

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual {v0}, LE5/n0;->h()V

    .line 1072
    .line 1073
    .line 1074
    :cond_16
    return-void

    .line 1075
    :pswitch_16
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 1076
    .line 1077
    check-cast v0, Lp9/n;

    .line 1078
    .line 1079
    iget-object v0, v0, Lp9/n;->j:LQ1/n;

    .line 1080
    .line 1081
    iget-object v0, v0, LQ1/n;->d:Ljava/lang/Object;

    .line 1082
    .line 1083
    check-cast v0, Ljava/util/HashSet;

    .line 1084
    .line 1085
    iget-object v1, p0, Lng/a;->c:Ljava/lang/Object;

    .line 1086
    .line 1087
    check-cast v1, Lp9/b;

    .line 1088
    .line 1089
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v1, v2, v2}, Lp9/b;->a(Ljava/lang/Object;Lm9/G;)V

    .line 1093
    .line 1094
    .line 1095
    return-void

    .line 1096
    :pswitch_17
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 1097
    .line 1098
    check-cast v0, Lp9/n;

    .line 1099
    .line 1100
    iget-object v0, v0, Lp9/n;->j:LQ1/n;

    .line 1101
    .line 1102
    iget-object v0, v0, LQ1/n;->d:Ljava/lang/Object;

    .line 1103
    .line 1104
    check-cast v0, Ljava/util/HashSet;

    .line 1105
    .line 1106
    iget-object v1, p0, Lng/a;->c:Ljava/lang/Object;

    .line 1107
    .line 1108
    check-cast v1, Lm9/p;

    .line 1109
    .line 1110
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 1111
    .line 1112
    .line 1113
    return-void

    .line 1114
    :pswitch_18
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 1115
    .line 1116
    check-cast v0, Lp9/n;

    .line 1117
    .line 1118
    iget-object v0, v0, Lp9/n;->g:Lr9/l;

    .line 1119
    .line 1120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1121
    .line 1122
    .line 1123
    new-instance v1, Lr9/i;

    .line 1124
    .line 1125
    iget-object v2, p0, Lng/a;->c:Ljava/lang/Object;

    .line 1126
    .line 1127
    check-cast v2, Ljava/util/ArrayList;

    .line 1128
    .line 1129
    invoke-direct {v1, v0, v2, v5}, Lr9/i;-><init>(Lr9/l;Ljava/util/ArrayList;I)V

    .line 1130
    .line 1131
    .line 1132
    iget-object v0, v0, Lr9/l;->a:Lp7/b;

    .line 1133
    .line 1134
    const-string v2, "Configure indexes"

    .line 1135
    .line 1136
    invoke-virtual {v0, v2, v1}, Lp7/b;->P(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 1137
    .line 1138
    .line 1139
    return-void

    .line 1140
    :pswitch_19
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 1141
    .line 1142
    check-cast v0, Lp9/n;

    .line 1143
    .line 1144
    iget-object v0, v0, Lp9/n;->i:Lp9/z;

    .line 1145
    .line 1146
    iget-object v1, v0, Lp9/z;->b:LE5/n0;

    .line 1147
    .line 1148
    iget-boolean v1, v1, LE5/n0;->g:Z

    .line 1149
    .line 1150
    if-nez v1, :cond_17

    .line 1151
    .line 1152
    new-array v1, v5, [Ljava/lang/Object;

    .line 1153
    .line 1154
    const-string v3, "z"

    .line 1155
    .line 1156
    const-string v5, "The network is disabled. The task returned by \'awaitPendingWrites()\' will not complete until the network is enabled."

    .line 1157
    .line 1158
    invoke-static {v3, v5, v4, v1}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 1159
    .line 1160
    .line 1161
    :cond_17
    iget-object v1, v0, Lp9/z;->a:Lr9/l;

    .line 1162
    .line 1163
    iget-object v1, v1, Lr9/l;->c:Lr9/v;

    .line 1164
    .line 1165
    invoke-interface {v1}, Lr9/v;->i()I

    .line 1166
    .line 1167
    .line 1168
    move-result v1

    .line 1169
    iget-object v3, p0, Lng/a;->c:Ljava/lang/Object;

    .line 1170
    .line 1171
    check-cast v3, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 1172
    .line 1173
    const/4 v4, -0x1

    .line 1174
    if-ne v1, v4, :cond_18

    .line 1175
    .line 1176
    invoke-virtual {v3, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 1177
    .line 1178
    .line 1179
    goto :goto_a

    .line 1180
    :cond_18
    iget-object v0, v0, Lp9/z;->j:Ljava/util/HashMap;

    .line 1181
    .line 1182
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v2

    .line 1186
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 1187
    .line 1188
    .line 1189
    move-result v2

    .line 1190
    if-nez v2, :cond_19

    .line 1191
    .line 1192
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v2

    .line 1196
    new-instance v4, Ljava/util/ArrayList;

    .line 1197
    .line 1198
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual {v0, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1202
    .line 1203
    .line 1204
    :cond_19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v1

    .line 1208
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v0

    .line 1212
    check-cast v0, Ljava/util/List;

    .line 1213
    .line 1214
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1215
    .line 1216
    .line 1217
    :goto_a
    return-void

    .line 1218
    :pswitch_1a
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 1219
    .line 1220
    check-cast v0, Lorg/apache/tika/pipes/async/AsyncProcessor;

    .line 1221
    .line 1222
    iget-object v1, p0, Lng/a;->c:Ljava/lang/Object;

    .line 1223
    .line 1224
    check-cast v1, Lorg/apache/tika/pipes/pipesiterator/TotalCounter;

    .line 1225
    .line 1226
    invoke-static {v0, v1}, Lorg/apache/tika/pipes/async/AsyncProcessor;->a(Lorg/apache/tika/pipes/async/AsyncProcessor;Lorg/apache/tika/pipes/pipesiterator/TotalCounter;)V

    .line 1227
    .line 1228
    .line 1229
    return-void

    .line 1230
    :pswitch_1b
    iget-object v0, p0, Lng/a;->c:Ljava/lang/Object;

    .line 1231
    .line 1232
    check-cast v0, Ljava/lang/Process;

    .line 1233
    .line 1234
    iget-object v1, p0, Lng/a;->b:Ljava/lang/Object;

    .line 1235
    .line 1236
    check-cast v1, Ljava/io/InputStream;

    .line 1237
    .line 1238
    invoke-static {v0, v1}, Lorg/apache/tika/parser/external/ExternalParser;->b(Ljava/lang/Process;Ljava/io/InputStream;)V

    .line 1239
    .line 1240
    .line 1241
    return-void

    .line 1242
    :pswitch_1c
    iget-object v0, p0, Lng/a;->b:Ljava/lang/Object;

    .line 1243
    .line 1244
    check-cast v0, Ljava/io/InputStream;

    .line 1245
    .line 1246
    iget-object v1, p0, Lng/a;->c:Ljava/lang/Object;

    .line 1247
    .line 1248
    check-cast v1, Ljava/io/OutputStream;

    .line 1249
    .line 1250
    invoke-static {v0, v1}, Lorg/apache/tika/embedder/ExternalEmbedder;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 1251
    .line 1252
    .line 1253
    return-void

    .line 1254
    nop

    .line 1255
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
