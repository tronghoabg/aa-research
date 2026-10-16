.class public final synthetic Lkd/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lkd/V;->a:I

    iput-object p1, p0, Lkd/V;->b:Ljava/lang/Object;

    iput-object p2, p0, Lkd/V;->c:Ljava/lang/Object;

    iput-object p3, p0, Lkd/V;->d:Ljava/lang/Object;

    iput-object p4, p0, Lkd/V;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .line 1
    iget v0, p0, Lkd/V;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lkd/V;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p0, Lkd/V;->e:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v2, p0, Lkd/V;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lcom/vungle/ads/internal/w2;

    .line 15
    .line 16
    iget-object v3, p0, Lkd/V;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v2, v3, v0, v1}, Lcom/vungle/ads/internal/w2;->a(Lcom/vungle/ads/internal/w2;Landroid/content/Context;Ljava/lang/String;Lef/i;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    iget-object v0, p0, Lkd/V;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lt5/i;

    .line 27
    .line 28
    iget-object v1, v0, Lt5/i;->a:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v2, p0, Lkd/V;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Lq5/h;

    .line 33
    .line 34
    iget-object v3, p0, Lkd/V;->e:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, Lt5/h;

    .line 37
    .line 38
    iget-object v4, p0, Lkd/V;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v4, Ly5/a;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    sget-object v5, Ly5/a;->f:Ljava/util/logging/Logger;

    .line 46
    .line 47
    const-string v6, "Transport backend \'"

    .line 48
    .line 49
    :try_start_0
    iget-object v7, v4, Ly5/a;->c:Lu5/e;

    .line 50
    .line 51
    invoke-virtual {v7, v1}, Lu5/e;->a(Ljava/lang/String;)Lu5/f;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    if-nez v7, :cond_0

    .line 56
    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, "\' is not registered"

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v5, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 78
    .line 79
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v2, v1}, Lq5/h;->a(Ljava/lang/Exception;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :catch_0
    move-exception v0

    .line 87
    goto :goto_0

    .line 88
    :cond_0
    check-cast v7, Lr5/b;

    .line 89
    .line 90
    invoke-virtual {v7, v3}, Lr5/b;->a(Lt5/h;)Lt5/h;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    iget-object v3, v4, Ly5/a;->e:LB5/c;

    .line 95
    .line 96
    new-instance v6, LA5/g;

    .line 97
    .line 98
    invoke-direct {v6, v4, v0, v1}, LA5/g;-><init>(Ly5/a;Lt5/i;Lt5/h;)V

    .line 99
    .line 100
    .line 101
    check-cast v3, LA5/m;

    .line 102
    .line 103
    invoke-virtual {v3, v6}, LA5/m;->o(LB5/b;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    const/4 v0, 0x0

    .line 107
    invoke-interface {v2, v0}, Lq5/h;->a(Ljava/lang/Exception;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    const-string v3, "Error scheduling event "

    .line 114
    .line 115
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v5, v1}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v2, v0}, Lq5/h;->a(Ljava/lang/Exception;)V

    .line 133
    .line 134
    .line 135
    :goto_1
    return-void

    .line 136
    :pswitch_1
    iget-object v0, p0, Lkd/V;->b:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v0, Lp9/n;

    .line 139
    .line 140
    iget-object v1, p0, Lkd/V;->c:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v1, Lp9/u;

    .line 143
    .line 144
    iget-object v2, p0, Lkd/V;->d:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v2, Lm9/V;

    .line 147
    .line 148
    iget-object v3, p0, Lkd/V;->e:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v3, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 151
    .line 152
    iget-object v0, v0, Lp9/n;->i:Lp9/z;

    .line 153
    .line 154
    iget-object v0, v0, Lp9/z;->b:LE5/n0;

    .line 155
    .line 156
    iget-boolean v4, v0, LE5/n0;->g:Z

    .line 157
    .line 158
    if-eqz v4, :cond_7

    .line 159
    .line 160
    iget-object v0, v0, LE5/n0;->e:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v0, Lv9/g;

    .line 163
    .line 164
    iget-object v4, v0, Lv9/g;->a:Lv9/o;

    .line 165
    .line 166
    monitor-enter v1

    .line 167
    :try_start_1
    iget-object v5, v1, Lp9/u;->d:Lp9/A;

    .line 168
    .line 169
    if-nez v5, :cond_1

    .line 170
    .line 171
    iget-object v5, v1, Lp9/u;->a:Ljava/util/List;

    .line 172
    .line 173
    invoke-virtual {v1, v5}, Lp9/u;->j(Ljava/util/List;)Lp9/A;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    iput-object v5, v1, Lp9/u;->d:Lp9/A;

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :catchall_0
    move-exception v0

    .line 181
    goto/16 :goto_5

    .line 182
    .line 183
    :cond_1
    :goto_2
    iget-object v5, v1, Lp9/u;->d:Lp9/A;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 184
    .line 185
    monitor-exit v1

    .line 186
    invoke-virtual {v4, v5}, Lv9/o;->j(Lp9/A;)Lka/n1;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    new-instance v4, Ljava/util/HashMap;

    .line 191
    .line 192
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-static {}, Lka/J0;->d()Lka/I0;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    invoke-virtual {v1}, Lka/n1;->f()Lka/h1;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    invoke-virtual {v5, v6}, Lka/I0;->b(Lka/h1;)V

    .line 204
    .line 205
    .line 206
    new-instance v6, Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 209
    .line 210
    .line 211
    new-instance v7, Ljava/util/HashSet;

    .line 212
    .line 213
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    const/4 v8, 0x1

    .line 221
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v9

    .line 225
    if-eqz v9, :cond_6

    .line 226
    .line 227
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    check-cast v9, Lm9/d;

    .line 232
    .line 233
    iget-object v10, v9, Lm9/d;->c:Ljava/lang/String;

    .line 234
    .line 235
    invoke-virtual {v7, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v10

    .line 239
    if-eqz v10, :cond_2

    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_2
    iget-object v10, v9, Lm9/d;->c:Ljava/lang/String;

    .line 243
    .line 244
    invoke-virtual {v7, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    new-instance v11, Ljava/lang/StringBuilder;

    .line 248
    .line 249
    const-string v12, "aggregate_"

    .line 250
    .line 251
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    add-int/lit8 v12, v8, 0x1

    .line 255
    .line 256
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v8

    .line 263
    invoke-virtual {v4, v8, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    invoke-static {}, Lka/H0;->f()Lka/C0;

    .line 267
    .line 268
    .line 269
    move-result-object v10

    .line 270
    invoke-static {}, Lka/W0;->e()Lka/V0;

    .line 271
    .line 272
    .line 273
    move-result-object v11

    .line 274
    invoke-virtual {v9}, Lm9/d;->a()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v13

    .line 278
    invoke-virtual {v11, v13}, Lka/V0;->a(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v11}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 282
    .line 283
    .line 284
    move-result-object v11

    .line 285
    check-cast v11, Lka/W0;

    .line 286
    .line 287
    instance-of v13, v9, Lm9/b;

    .line 288
    .line 289
    if-eqz v13, :cond_3

    .line 290
    .line 291
    invoke-static {}, Lka/E0;->b()Lka/E0;

    .line 292
    .line 293
    .line 294
    move-result-object v9

    .line 295
    invoke-virtual {v10, v9}, Lka/C0;->c(Lka/E0;)V

    .line 296
    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_3
    instance-of v13, v9, Lm9/c;

    .line 300
    .line 301
    if-eqz v13, :cond_4

    .line 302
    .line 303
    invoke-static {}, Lka/G0;->c()Lka/F0;

    .line 304
    .line 305
    .line 306
    move-result-object v9

    .line 307
    invoke-virtual {v9, v11}, Lka/F0;->a(Lka/W0;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v9}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 311
    .line 312
    .line 313
    move-result-object v9

    .line 314
    check-cast v9, Lka/G0;

    .line 315
    .line 316
    invoke-virtual {v10, v9}, Lka/C0;->d(Lka/G0;)V

    .line 317
    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_4
    instance-of v9, v9, Lm9/a;

    .line 321
    .line 322
    if-eqz v9, :cond_5

    .line 323
    .line 324
    invoke-static {}, Lka/B0;->c()Lka/A0;

    .line 325
    .line 326
    .line 327
    move-result-object v9

    .line 328
    invoke-virtual {v9, v11}, Lka/A0;->a(Lka/W0;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v9}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 332
    .line 333
    .line 334
    move-result-object v9

    .line 335
    check-cast v9, Lka/B0;

    .line 336
    .line 337
    invoke-virtual {v10, v9}, Lka/C0;->b(Lka/B0;)V

    .line 338
    .line 339
    .line 340
    :goto_4
    invoke-virtual {v10, v8}, Lka/C0;->a(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v10}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 344
    .line 345
    .line 346
    move-result-object v8

    .line 347
    check-cast v8, Lka/H0;

    .line 348
    .line 349
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move v8, v12

    .line 353
    goto/16 :goto_3

    .line 354
    .line 355
    :cond_5
    new-instance v0, Ljava/lang/RuntimeException;

    .line 356
    .line 357
    const-string v1, "Unsupported aggregation"

    .line 358
    .line 359
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    throw v0

    .line 363
    :cond_6
    invoke-virtual {v5, v6}, Lka/I0;->a(Ljava/util/ArrayList;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v5}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    check-cast v2, Lka/J0;

    .line 371
    .line 372
    invoke-static {}, Lka/v0;->e()Lka/u0;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    invoke-virtual {v1}, Lka/n1;->e()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    invoke-virtual {v5, v1}, Lka/u0;->a(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v5, v2}, Lka/u0;->b(Lka/J0;)V

    .line 384
    .line 385
    .line 386
    iget-object v1, v0, Lv9/g;->c:Lv9/m;

    .line 387
    .line 388
    invoke-static {}, Lka/e0;->s()LF6/r;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    invoke-virtual {v5}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 393
    .line 394
    .line 395
    move-result-object v5

    .line 396
    check-cast v5, Lka/v0;

    .line 397
    .line 398
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    new-instance v6, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 402
    .line 403
    invoke-direct {v6}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 404
    .line 405
    .line 406
    iget-object v7, v1, Lv9/m;->d:LX8/c;

    .line 407
    .line 408
    iget-object v8, v7, LX8/c;->a:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v8, Lcom/google/android/gms/tasks/Task;

    .line 411
    .line 412
    iget-object v9, v7, LX8/c;->b:Ljava/lang/Object;

    .line 413
    .line 414
    check-cast v9, Lw9/e;

    .line 415
    .line 416
    iget-object v9, v9, Lw9/e;->a:Lw9/c;

    .line 417
    .line 418
    new-instance v10, Laa/f;

    .line 419
    .line 420
    const/16 v11, 0x1a

    .line 421
    .line 422
    invoke-direct {v10, v11, v7, v2}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    iget-object v7, v1, Lv9/m;->a:Lw9/e;

    .line 430
    .line 431
    iget-object v7, v7, Lw9/e;->a:Lw9/c;

    .line 432
    .line 433
    new-instance v8, LA5/g;

    .line 434
    .line 435
    const/16 v9, 0x17

    .line 436
    .line 437
    invoke-direct {v8, v1, v6, v5, v9}, LA5/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2, v7, v8}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v6}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    iget-object v2, v0, Lv9/g;->b:Lw9/e;

    .line 448
    .line 449
    iget-object v2, v2, Lw9/e;->a:Lw9/c;

    .line 450
    .line 451
    new-instance v5, Laa/f;

    .line 452
    .line 453
    const/16 v6, 0x19

    .line 454
    .line 455
    invoke-direct {v5, v6, v0, v4}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v1, v2, v5}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    goto :goto_6

    .line 463
    :goto_5
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 464
    throw v0

    .line 465
    :cond_7
    new-instance v0, Lm9/G;

    .line 466
    .line 467
    const-string v1, "Failed to get result from server."

    .line 468
    .line 469
    sget-object v2, Lm9/F;->k:Lm9/F;

    .line 470
    .line 471
    invoke-direct {v0, v1, v2}, Lm9/G;-><init>(Ljava/lang/String;Lm9/F;)V

    .line 472
    .line 473
    .line 474
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    :goto_6
    new-instance v1, LJ9/m;

    .line 479
    .line 480
    invoke-direct {v1, v3}, LJ9/m;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    new-instance v1, LJ9/m;

    .line 488
    .line 489
    invoke-direct {v1, v3}, LJ9/m;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 493
    .line 494
    .line 495
    return-void

    .line 496
    :pswitch_2
    iget-object v0, p0, Lkd/V;->b:Ljava/lang/Object;

    .line 497
    .line 498
    check-cast v0, Ltf/a;

    .line 499
    .line 500
    iget-object v1, p0, Lkd/V;->c:Ljava/lang/Object;

    .line 501
    .line 502
    check-cast v1, Lm5/c;

    .line 503
    .line 504
    iget-object v2, p0, Lkd/V;->d:Ljava/lang/Object;

    .line 505
    .line 506
    check-cast v2, Ltc/g;

    .line 507
    .line 508
    :try_start_3
    invoke-interface {v0}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    check-cast v0, Ljava/lang/Number;

    .line 513
    .line 514
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 515
    .line 516
    .line 517
    move-result-wide v3

    .line 518
    iget-object v0, v1, Lm5/c;->c:Landroid/os/Handler;

    .line 519
    .line 520
    new-instance v5, Lm5/b;

    .line 521
    .line 522
    invoke-direct {v5, v2, v3, v4}, Lm5/b;-><init>(Ltc/g;D)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v0, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 526
    .line 527
    .line 528
    goto :goto_7

    .line 529
    :catch_1
    move-exception v0

    .line 530
    iget-object v1, v1, Lm5/c;->c:Landroid/os/Handler;

    .line 531
    .line 532
    new-instance v3, Lcom/applovin/impl/mediation/ads/f;

    .line 533
    .line 534
    iget-object v4, p0, Lkd/V;->e:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast v4, Ljava/lang/String;

    .line 537
    .line 538
    const/16 v5, 0x18

    .line 539
    .line 540
    invoke-direct {v3, v2, v4, v0, v5}, Lcom/applovin/impl/mediation/ads/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 544
    .line 545
    .line 546
    :goto_7
    return-void

    .line 547
    :pswitch_3
    new-instance v11, Lcom/moloco/sdk/internal/publisher/d;

    .line 548
    .line 549
    const/16 v0, 0x19

    .line 550
    .line 551
    invoke-direct {v11, v0}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 552
    .line 553
    .line 554
    iget-object v0, p0, Lkd/V;->b:Ljava/lang/Object;

    .line 555
    .line 556
    move-object v7, v0

    .line 557
    check-cast v7, Lkd/W;

    .line 558
    .line 559
    iget-object v6, v7, Lkd/W;->a:Lkd/r;

    .line 560
    .line 561
    iget-object v0, p0, Lkd/V;->c:Ljava/lang/Object;

    .line 562
    .line 563
    move-object v8, v0

    .line 564
    check-cast v8, Landroid/webkit/WebView;

    .line 565
    .line 566
    iget-object v0, p0, Lkd/V;->d:Ljava/lang/Object;

    .line 567
    .line 568
    move-object v9, v0

    .line 569
    check-cast v9, Landroid/webkit/WebResourceRequest;

    .line 570
    .line 571
    iget-object v0, p0, Lkd/V;->e:Ljava/lang/Object;

    .line 572
    .line 573
    move-object v10, v0

    .line 574
    check-cast v10, Landroid/webkit/WebResourceResponse;

    .line 575
    .line 576
    invoke-virtual/range {v6 .. v11}, Lkd/r;->j(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;Ltf/l;)V

    .line 577
    .line 578
    .line 579
    return-void

    .line 580
    nop

    .line 581
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
