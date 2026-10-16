.class public final synthetic LG8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LG8/d;Lx9/d;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    iput p2, p0, LG8/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG8/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, LG8/c;->a:I

    iput-object p1, p0, LG8/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 13

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    iget v4, p0, LG8/c;->a:I

    .line 6
    .line 7
    packed-switch v4, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, Ly3/f;

    .line 11
    .line 12
    iget-object v1, p0, LG8/c;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ly3/f;-><init>(Lorg/chromium/support_lib_boundary/JsReplyProxyBoundaryInterface;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    iget-object v0, p0, LG8/c;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lp9/l;

    .line 23
    .line 24
    invoke-virtual {v0}, Lp9/l;->run()V

    .line 25
    .line 26
    .line 27
    return-object v2

    .line 28
    :pswitch_1
    iget-object v0, p0, LG8/c;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ljava/lang/Runnable;

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 33
    .line 34
    .line 35
    return-object v2

    .line 36
    :pswitch_2
    const-string v2, "GrpcCallProvider"

    .line 37
    .line 38
    iget-object v4, p0, LG8/c;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v4, LX8/c;

    .line 41
    .line 42
    iget-object v5, v4, LX8/c;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v5, Landroid/content/Context;

    .line 45
    .line 46
    :try_start_0
    invoke-static {v5}, LD7/a;->a(Landroid/content/Context;)V
    :try_end_0
    .catch Ld7/g; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ld7/h; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catch_0
    move-exception v6

    .line 51
    goto :goto_0

    .line 52
    :catch_1
    move-exception v6

    .line 53
    goto :goto_0

    .line 54
    :catch_2
    move-exception v6

    .line 55
    :goto_0
    new-array v7, v1, [Ljava/lang/Object;

    .line 56
    .line 57
    aput-object v6, v7, v3

    .line 58
    .line 59
    const-string v6, "Failed to update ssl context: %s"

    .line 60
    .line 61
    invoke-static {v2, v6, v0, v7}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    iget-object v6, v4, LX8/c;->f:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v6, LA7/b0;

    .line 67
    .line 68
    iget-object v7, v6, LA7/b0;->d:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v7, Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v7}, Lmd/y;->c(Ljava/lang/String;)Lpd/h;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    iget-boolean v6, v6, LA7/b0;->b:Z

    .line 77
    .line 78
    if-nez v6, :cond_0

    .line 79
    .line 80
    iput v0, v7, Lpd/h;->g:I

    .line 81
    .line 82
    :cond_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 83
    .line 84
    const-wide/16 v8, 0x1e

    .line 85
    .line 86
    invoke-virtual {v0, v8, v9}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 87
    .line 88
    .line 89
    move-result-wide v8

    .line 90
    iput-wide v8, v7, Lpd/h;->h:J

    .line 91
    .line 92
    sget-wide v10, Lod/u0;->k:J

    .line 93
    .line 94
    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 95
    .line 96
    .line 97
    move-result-wide v8

    .line 98
    iput-wide v8, v7, Lpd/h;->h:J

    .line 99
    .line 100
    sget-wide v10, Lpd/h;->n:J

    .line 101
    .line 102
    cmp-long v0, v8, v10

    .line 103
    .line 104
    if-ltz v0, :cond_1

    .line 105
    .line 106
    const-wide v8, 0x7fffffffffffffffL

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    iput-wide v8, v7, Lpd/h;->h:J

    .line 112
    .line 113
    :cond_1
    new-instance v0, Lnd/c;

    .line 114
    .line 115
    invoke-direct {v0, v7}, Lnd/c;-><init>(Lpd/h;)V

    .line 116
    .line 117
    .line 118
    iput-object v5, v0, Lnd/c;->b:Landroid/content/Context;

    .line 119
    .line 120
    invoke-virtual {v0}, Lnd/c;->a()Lmd/S;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    new-instance v5, Lv9/n;

    .line 125
    .line 126
    move-object v6, v0

    .line 127
    check-cast v6, Lnd/b;

    .line 128
    .line 129
    invoke-direct {v5, v4, v6, v3}, Lv9/n;-><init>(LX8/c;Lnd/b;I)V

    .line 130
    .line 131
    .line 132
    iget-object v6, v4, LX8/c;->b:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v6, Lw9/e;

    .line 135
    .line 136
    invoke-virtual {v6, v5}, Lw9/e;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 137
    .line 138
    .line 139
    sget-object v5, Lmd/c;->i:Lmd/c;

    .line 140
    .line 141
    sget-object v7, Lud/e;->c:LB8/e;

    .line 142
    .line 143
    sget-object v8, Lud/b;->b:Lud/b;

    .line 144
    .line 145
    invoke-virtual {v5, v7, v8}, Lmd/c;->c(LB8/e;Ljava/lang/Object;)Lmd/c;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-static {v5}, Lmd/c;->b(Lmd/c;)LR8/a;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    iget-object v7, v4, LX8/c;->g:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v7, Lv9/i;

    .line 156
    .line 157
    iput-object v7, v5, LR8/a;->c:Ljava/lang/Object;

    .line 158
    .line 159
    new-instance v7, Lmd/c;

    .line 160
    .line 161
    invoke-direct {v7, v5}, Lmd/c;-><init>(LR8/a;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v7}, Lmd/c;->b(Lmd/c;)LR8/a;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    iget-object v6, v6, Lw9/e;->a:Lw9/c;

    .line 169
    .line 170
    iput-object v6, v5, LR8/a;->b:Ljava/lang/Object;

    .line 171
    .line 172
    new-instance v6, Lmd/c;

    .line 173
    .line 174
    invoke-direct {v6, v5}, Lmd/c;-><init>(LR8/a;)V

    .line 175
    .line 176
    .line 177
    iput-object v6, v4, LX8/c;->c:Ljava/lang/Object;

    .line 178
    .line 179
    new-array v3, v3, [Ljava/lang/Object;

    .line 180
    .line 181
    const-string v4, "Channel successfully reset."

    .line 182
    .line 183
    invoke-static {v2, v4, v1, v3}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    return-object v0

    .line 187
    :pswitch_3
    iget-object v0, p0, LG8/c;->b:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v0, Lorg/apache/tika/pipes/async/AsyncProcessor;

    .line 190
    .line 191
    invoke-static {v0}, Lorg/apache/tika/pipes/async/AsyncProcessor;->b(Lorg/apache/tika/pipes/async/AsyncProcessor;)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    return-object v0

    .line 196
    :pswitch_4
    iget-object v0, p0, LG8/c;->b:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v0, Laa/o;

    .line 199
    .line 200
    monitor-enter v0

    .line 201
    :try_start_1
    iget-object v1, v0, Laa/o;->a:Landroid/content/Context;

    .line 202
    .line 203
    iget-object v4, v0, Laa/o;->b:Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual {v1, v4}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    .line 206
    .line 207
    .line 208
    move-result-object v1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 209
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileInputStream;->available()I

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    new-array v5, v4, [B

    .line 214
    .line 215
    invoke-virtual {v1, v5, v3, v4}, Ljava/io/FileInputStream;->read([BII)I

    .line 216
    .line 217
    .line 218
    new-instance v3, Ljava/lang/String;

    .line 219
    .line 220
    const-string v4, "UTF-8"

    .line 221
    .line 222
    invoke-direct {v3, v5, v4}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 223
    .line 224
    .line 225
    new-instance v4, Lorg/json/JSONObject;

    .line 226
    .line 227
    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-static {v4}, Laa/e;->a(Lorg/json/JSONObject;)Laa/e;

    .line 231
    .line 232
    .line 233
    move-result-object v2
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 234
    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 235
    .line 236
    .line 237
    monitor-exit v0

    .line 238
    goto :goto_6

    .line 239
    :catchall_0
    move-exception v1

    .line 240
    goto :goto_4

    .line 241
    :catchall_1
    move-exception v2

    .line 242
    goto :goto_2

    .line 243
    :catchall_2
    move-exception v1

    .line 244
    move-object v12, v2

    .line 245
    move-object v2, v1

    .line 246
    move-object v1, v12

    .line 247
    goto :goto_2

    .line 248
    :catch_3
    move-object v1, v2

    .line 249
    goto :goto_3

    .line 250
    :goto_2
    if-eqz v1, :cond_2

    .line 251
    .line 252
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    .line 253
    .line 254
    .line 255
    :cond_2
    throw v2

    .line 256
    :catch_4
    :goto_3
    if-eqz v1, :cond_3

    .line 257
    .line 258
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    .line 259
    .line 260
    .line 261
    goto :goto_5

    .line 262
    :goto_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 263
    throw v1

    .line 264
    :cond_3
    :goto_5
    monitor-exit v0

    .line 265
    :goto_6
    return-object v2

    .line 266
    :pswitch_5
    iget-object v0, p0, LG8/c;->b:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v0, LZ9/k;

    .line 269
    .line 270
    invoke-virtual {v0}, LZ9/k;->a()LZ9/d;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    return-object v0

    .line 275
    :pswitch_6
    iget-object v0, p0, LG8/c;->b:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v0, LZ9/d;

    .line 278
    .line 279
    invoke-virtual {v0}, LZ9/d;->c()Laa/p;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    return-object v0

    .line 284
    :pswitch_7
    iget-object v1, p0, LG8/c;->b:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v1, LY2/B;

    .line 287
    .line 288
    iget-object v1, v1, LY2/B;->c:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v1, LK3/r;

    .line 291
    .line 292
    iget-object v3, v1, LK3/r;->b:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v3, LZ8/c;

    .line 295
    .line 296
    iget-object v1, v1, LK3/r;->f:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v1, LB8/e;

    .line 299
    .line 300
    iget-object v4, v1, LB8/e;->b:Ljava/lang/String;

    .line 301
    .line 302
    const-string v5, "FirebaseCrashlytics"

    .line 303
    .line 304
    const-string v6, "Settings query params were: "

    .line 305
    .line 306
    const-string v7, "Requesting settings from "

    .line 307
    .line 308
    invoke-static {}, LS8/f;->b()V

    .line 309
    .line 310
    .line 311
    :try_start_5
    invoke-static {v3}, LB8/e;->c(LZ8/c;)Ljava/util/HashMap;

    .line 312
    .line 313
    .line 314
    move-result-object v8

    .line 315
    new-instance v9, Lb7/k;

    .line 316
    .line 317
    invoke-direct {v9, v8, v4}, Lb7/k;-><init>(Ljava/util/HashMap;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    const-string v10, "User-Agent"

    .line 321
    .line 322
    const-string v11, "Crashlytics Android SDK/19.3.0"

    .line 323
    .line 324
    invoke-virtual {v9, v10, v11}, Lb7/k;->x(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    const-string v10, "X-CRASHLYTICS-DEVELOPER-TOKEN"

    .line 328
    .line 329
    const-string v11, "470fa2b4ae81cd56ecbcda9735803434cec591fa"

    .line 330
    .line 331
    invoke-virtual {v9, v10, v11}, Lb7/k;->x(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-static {v9, v3}, LB8/e;->b(Lb7/k;LZ8/c;)V

    .line 335
    .line 336
    .line 337
    new-instance v3, Ljava/lang/StringBuilder;

    .line 338
    .line 339
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    const/4 v4, 0x3

    .line 350
    invoke-static {v5, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 351
    .line 352
    .line 353
    move-result v4

    .line 354
    if-eqz v4, :cond_4

    .line 355
    .line 356
    invoke-static {v5, v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 357
    .line 358
    .line 359
    :cond_4
    new-instance v3, Ljava/lang/StringBuilder;

    .line 360
    .line 361
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    invoke-static {v5, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 372
    .line 373
    .line 374
    move-result v0

    .line 375
    if-eqz v0, :cond_5

    .line 376
    .line 377
    invoke-static {v5, v3, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 378
    .line 379
    .line 380
    :cond_5
    invoke-virtual {v9}, Lb7/k;->u()LVa/Aa;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-virtual {v1, v0}, LB8/e;->d(LVa/Aa;)Lorg/json/JSONObject;

    .line 385
    .line 386
    .line 387
    move-result-object v2
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_5

    .line 388
    goto :goto_7

    .line 389
    :catch_5
    move-exception v0

    .line 390
    const-string v1, "Settings request failed."

    .line 391
    .line 392
    invoke-static {v5, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 393
    .line 394
    .line 395
    :goto_7
    return-object v2

    .line 396
    :pswitch_8
    iget-object v0, p0, LG8/c;->b:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v0, LA/e0;

    .line 399
    .line 400
    iget-object v0, v0, LA/e0;->b:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v0, Landroidx/work/impl/WorkDatabase;

    .line 403
    .line 404
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->q()LS3/e;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    const-string v4, "next_alarm_manager_id"

    .line 409
    .line 410
    invoke-virtual {v2, v4}, LS3/e;->o(Ljava/lang/String;)Ljava/lang/Long;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    if-eqz v2, :cond_6

    .line 415
    .line 416
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 417
    .line 418
    .line 419
    move-result-wide v5

    .line 420
    long-to-int v2, v5

    .line 421
    goto :goto_8

    .line 422
    :cond_6
    move v2, v3

    .line 423
    :goto_8
    const v5, 0x7fffffff

    .line 424
    .line 425
    .line 426
    if-ne v2, v5, :cond_7

    .line 427
    .line 428
    goto :goto_9

    .line 429
    :cond_7
    add-int/lit8 v3, v2, 0x1

    .line 430
    .line 431
    :goto_9
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->q()LS3/e;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    new-instance v1, LS3/d;

    .line 436
    .line 437
    int-to-long v5, v3

    .line 438
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    invoke-direct {v1, v4, v3}, LS3/d;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v0, v1}, LS3/e;->q(LS3/d;)V

    .line 446
    .line 447
    .line 448
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    return-object v0

    .line 453
    :pswitch_9
    iget-object v4, p0, LG8/c;->b:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v4, LR8/s;

    .line 456
    .line 457
    iget-object v4, v4, LR8/s;->h:LR8/m;

    .line 458
    .line 459
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    invoke-static {}, LS8/f;->a()V

    .line 463
    .line 464
    .line 465
    iget-object v5, v4, LR8/m;->c:LS3/e;

    .line 466
    .line 467
    iget-object v6, v5, LS3/e;->b:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast v6, Ljava/lang/String;

    .line 470
    .line 471
    iget-object v7, v5, LS3/e;->c:Ljava/lang/Object;

    .line 472
    .line 473
    check-cast v7, LX8/c;

    .line 474
    .line 475
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    new-instance v8, Ljava/io/File;

    .line 479
    .line 480
    iget-object v9, v7, LX8/c;->c:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast v9, Ljava/io/File;

    .line 483
    .line 484
    invoke-direct {v8, v9, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    .line 488
    .line 489
    .line 490
    move-result v6

    .line 491
    if-nez v6, :cond_9

    .line 492
    .line 493
    invoke-virtual {v4}, LR8/m;->e()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    if-eqz v0, :cond_8

    .line 498
    .line 499
    iget-object v2, v4, LR8/m;->j:LO8/a;

    .line 500
    .line 501
    invoke-virtual {v2, v0}, LO8/a;->c(Ljava/lang/String;)Z

    .line 502
    .line 503
    .line 504
    move-result v0

    .line 505
    if-eqz v0, :cond_8

    .line 506
    .line 507
    goto :goto_a

    .line 508
    :cond_8
    move v1, v3

    .line 509
    goto :goto_a

    .line 510
    :cond_9
    const-string v3, "FirebaseCrashlytics"

    .line 511
    .line 512
    invoke-static {v3, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 513
    .line 514
    .line 515
    move-result v0

    .line 516
    if-eqz v0, :cond_a

    .line 517
    .line 518
    const-string v0, "Found previous crash marker."

    .line 519
    .line 520
    invoke-static {v3, v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 521
    .line 522
    .line 523
    :cond_a
    iget-object v0, v5, LS3/e;->b:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast v0, Ljava/lang/String;

    .line 526
    .line 527
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    new-instance v2, Ljava/io/File;

    .line 531
    .line 532
    iget-object v3, v7, LX8/c;->c:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v3, Ljava/io/File;

    .line 535
    .line 536
    invoke-direct {v2, v3, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 540
    .line 541
    .line 542
    :goto_a
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    return-object v0

    .line 547
    :pswitch_a
    iget-object v0, p0, LG8/c;->b:Ljava/lang/Object;

    .line 548
    .line 549
    check-cast v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 550
    .line 551
    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    return-object v2

    .line 555
    :pswitch_b
    iget-object v0, p0, LG8/c;->b:Ljava/lang/Object;

    .line 556
    .line 557
    check-cast v0, LJ9/f;

    .line 558
    .line 559
    iget-object v0, v0, LJ9/f;->d:Lta/o;

    .line 560
    .line 561
    return-object v0

    .line 562
    :pswitch_c
    iget-object v0, p0, LG8/c;->b:Ljava/lang/Object;

    .line 563
    .line 564
    check-cast v0, Lcom/vungle/ads/internal/session/b;

    .line 565
    .line 566
    invoke-static {v0}, Lcom/vungle/ads/internal/session/b;->a(Lcom/vungle/ads/internal/session/b;)Ljava/util/List;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    return-object v0

    .line 571
    :pswitch_d
    iget-object v0, p0, LG8/c;->b:Ljava/lang/Object;

    .line 572
    .line 573
    check-cast v0, LG8/d;

    .line 574
    .line 575
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    new-instance v1, Lorg/json/JSONObject;

    .line 579
    .line 580
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    const-string v2, "UTF-8"

    .line 588
    .line 589
    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 590
    .line 591
    .line 592
    move-result-object v1

    .line 593
    iget-object v2, v0, LG8/d;->c:LC8/i;

    .line 594
    .line 595
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 596
    .line 597
    .line 598
    iget-object v0, v0, LG8/d;->f:LC8/j;

    .line 599
    .line 600
    iget-wide v4, v0, LC8/j;->b:J

    .line 601
    .line 602
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 603
    .line 604
    .line 605
    move-result-wide v6

    .line 606
    cmp-long v4, v4, v6

    .line 607
    .line 608
    if-gtz v4, :cond_c

    .line 609
    .line 610
    new-instance v4, Ljava/net/URL;

    .line 611
    .line 612
    new-instance v5, Ljava/lang/StringBuilder;

    .line 613
    .line 614
    const-string v6, "https://firebaseappcheck.googleapis.com/v1/projects/"

    .line 615
    .line 616
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 617
    .line 618
    .line 619
    iget-object v6, v2, LC8/i;->e:Ljava/lang/Object;

    .line 620
    .line 621
    check-cast v6, Ljava/lang/String;

    .line 622
    .line 623
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 624
    .line 625
    .line 626
    const-string v6, "/apps/"

    .line 627
    .line 628
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 629
    .line 630
    .line 631
    iget-object v6, v2, LC8/i;->d:Ljava/lang/Object;

    .line 632
    .line 633
    check-cast v6, Ljava/lang/String;

    .line 634
    .line 635
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 636
    .line 637
    .line 638
    const-string v6, ":generatePlayIntegrityChallenge?key="

    .line 639
    .line 640
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 641
    .line 642
    .line 643
    iget-object v6, v2, LC8/i;->c:Ljava/lang/Object;

    .line 644
    .line 645
    check-cast v6, Ljava/lang/String;

    .line 646
    .line 647
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v5

    .line 654
    invoke-direct {v4, v5}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v2, v4, v1, v0, v3}, LC8/i;->u(Ljava/net/URL;[BLC8/j;Z)Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    new-instance v1, Lorg/json/JSONObject;

    .line 662
    .line 663
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 664
    .line 665
    .line 666
    const-string v0, "challenge"

    .line 667
    .line 668
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    invoke-static {v0}, Ln7/f;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    const-string v2, "ttl"

    .line 677
    .line 678
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v1

    .line 682
    invoke-static {v1}, Ln7/f;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    if-eqz v0, :cond_b

    .line 687
    .line 688
    if-eqz v1, :cond_b

    .line 689
    .line 690
    new-instance v1, LG8/a;

    .line 691
    .line 692
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 693
    .line 694
    .line 695
    iput-object v0, v1, LG8/a;->a:Ljava/lang/String;

    .line 696
    .line 697
    return-object v1

    .line 698
    :cond_b
    new-instance v0, Ls8/j;

    .line 699
    .line 700
    const-string v1, "Unexpected server response."

    .line 701
    .line 702
    invoke-direct {v0, v1}, Ls8/j;-><init>(Ljava/lang/String;)V

    .line 703
    .line 704
    .line 705
    throw v0

    .line 706
    :cond_c
    new-instance v0, Ls8/j;

    .line 707
    .line 708
    const-string v1, "Too many attempts."

    .line 709
    .line 710
    invoke-direct {v0, v1}, Ls8/j;-><init>(Ljava/lang/String;)V

    .line 711
    .line 712
    .line 713
    throw v0

    .line 714
    nop

    .line 715
    :pswitch_data_0
    .packed-switch 0x0
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
