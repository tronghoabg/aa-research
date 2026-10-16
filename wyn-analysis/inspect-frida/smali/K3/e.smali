.class public final synthetic LK3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LK3/e;->a:I

    iput-object p1, p0, LK3/e;->b:Ljava/lang/Object;

    iput-object p2, p0, LK3/e;->c:Ljava/lang/Object;

    iput-object p3, p0, LK3/e;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, LK3/e;->a:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, LK3/e;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lp9/n;

    .line 11
    .line 12
    iget-object v2, v0, Lp9/n;->i:Lp9/z;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v3, LR1/q;

    .line 18
    .line 19
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 23
    .line 24
    invoke-direct {v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v4, v3, LR1/q;->f:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v6, v0, Lp9/n;->d:Lw9/e;

    .line 30
    .line 31
    iput-object v6, v3, LR1/q;->b:Ljava/lang/Object;

    .line 32
    .line 33
    iget-object v0, v2, Lp9/z;->b:LE5/n0;

    .line 34
    .line 35
    iput-object v0, v3, LR1/q;->c:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v0, v1, LK3/e;->d:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, LA5/g;

    .line 40
    .line 41
    iput-object v0, v3, LR1/q;->d:Ljava/lang/Object;

    .line 42
    .line 43
    iget-object v0, v1, LK3/e;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lm9/e0;

    .line 46
    .line 47
    iget v0, v0, Lm9/e0;->a:I

    .line 48
    .line 49
    iput v0, v3, LR1/q;->a:I

    .line 50
    .line 51
    new-instance v5, Lw9/l;

    .line 52
    .line 53
    sget-object v7, Lw9/d;->h:Lw9/d;

    .line 54
    .line 55
    const-wide/16 v8, 0x3e8

    .line 56
    .line 57
    const-wide/32 v10, 0xea60

    .line 58
    .line 59
    .line 60
    invoke-direct/range {v5 .. v11}, Lw9/l;-><init>(Lw9/e;Lw9/d;JJ)V

    .line 61
    .line 62
    .line 63
    iput-object v5, v3, LR1/q;->e:Ljava/lang/Object;

    .line 64
    .line 65
    iget v0, v3, LR1/q;->a:I

    .line 66
    .line 67
    add-int/lit8 v0, v0, -0x1

    .line 68
    .line 69
    iput v0, v3, LR1/q;->a:I

    .line 70
    .line 71
    new-instance v0, Lkd/c;

    .line 72
    .line 73
    const/4 v2, 0x6

    .line 74
    invoke-direct {v0, v3, v2}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5, v0}, Lw9/l;->a(Ljava/lang/Runnable;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    return-object v0

    .line 85
    :pswitch_0
    iget-object v0, v1, LK3/e;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    new-instance v2, Lm9/d0;

    .line 93
    .line 94
    iget-object v3, v1, LK3/e;->d:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v3, Lp9/B;

    .line 97
    .line 98
    invoke-direct {v2, v3, v0}, Lm9/d0;-><init>(Lp9/B;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    .line 99
    .line 100
    .line 101
    iget-object v0, v1, LK3/e;->c:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, LVc/e;

    .line 104
    .line 105
    iget-object v3, v0, LVc/e;->a:LVc/g;

    .line 106
    .line 107
    iget-object v4, v3, LVc/g;->a:LA5/h;

    .line 108
    .line 109
    iget-object v5, v4, LA5/h;->b:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v5, LUc/f;

    .line 112
    .line 113
    iget-object v5, v5, LUc/f;->d:Ljava/util/HashMap;

    .line 114
    .line 115
    iget-object v4, v4, LA5/h;->c:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v4, Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v5, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    new-instance v4, Ljava/util/HashMap;

    .line 123
    .line 124
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 125
    .line 126
    .line 127
    iget-object v5, v3, LVc/g;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 128
    .line 129
    iget-object v6, v5, Lcom/google/firebase/firestore/FirebaseFirestore;->g:Ls8/g;

    .line 130
    .line 131
    invoke-virtual {v6}, Ls8/g;->a()V

    .line 132
    .line 133
    .line 134
    const-string v7, "appName"

    .line 135
    .line 136
    iget-object v6, v6, Ls8/g;->b:Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {v4, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    iget-object v6, v3, LVc/g;->h:Landroid/os/Handler;

    .line 142
    .line 143
    new-instance v7, LVc/f;

    .line 144
    .line 145
    iget-object v0, v0, LVc/e;->b:Luc/h;

    .line 146
    .line 147
    const/4 v8, 0x1

    .line 148
    invoke-direct {v7, v0, v4, v8}, LVc/f;-><init>(Luc/h;Ljava/util/HashMap;I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 152
    .line 153
    .line 154
    :try_start_0
    iget-object v0, v3, LVc/g;->e:Ljava/util/concurrent/Semaphore;

    .line 155
    .line 156
    iget-object v4, v3, LVc/g;->c:Ljava/lang/Long;

    .line 157
    .line 158
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 159
    .line 160
    .line 161
    move-result-wide v6

    .line 162
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 163
    .line 164
    invoke-virtual {v0, v6, v7, v4}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-nez v0, :cond_0

    .line 169
    .line 170
    new-instance v0, Lm9/G;

    .line 171
    .line 172
    const-string v2, "timed out"

    .line 173
    .line 174
    sget-object v3, Lm9/F;->f:Lm9/F;

    .line 175
    .line 176
    invoke-direct {v0, v2, v3}, Lm9/G;-><init>(Ljava/lang/String;Lm9/F;)V

    .line 177
    .line 178
    .line 179
    new-instance v2, LUc/g;

    .line 180
    .line 181
    invoke-direct {v2, v0}, LUc/g;-><init>(Lm9/G;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    .line 182
    .line 183
    .line 184
    goto/16 :goto_3

    .line 185
    .line 186
    :cond_0
    iget-object v0, v3, LVc/g;->g:Ljava/util/List;

    .line 187
    .line 188
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_1

    .line 193
    .line 194
    new-instance v2, LUc/g;

    .line 195
    .line 196
    invoke-direct {v2}, LUc/g;-><init>()V

    .line 197
    .line 198
    .line 199
    goto/16 :goto_3

    .line 200
    .line 201
    :cond_1
    iget v0, v3, LVc/g;->f:I

    .line 202
    .line 203
    const/4 v4, 0x2

    .line 204
    if-ne v0, v4, :cond_2

    .line 205
    .line 206
    new-instance v2, LUc/g;

    .line 207
    .line 208
    invoke-direct {v2}, LUc/g;-><init>()V

    .line 209
    .line 210
    .line 211
    goto/16 :goto_3

    .line 212
    .line 213
    :cond_2
    iget-object v0, v3, LVc/g;->g:Ljava/util/List;

    .line 214
    .line 215
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_9

    .line 224
    .line 225
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    check-cast v0, LUc/x;

    .line 230
    .line 231
    iget-object v6, v0, LUc/x;->b:Ljava/lang/String;

    .line 232
    .line 233
    invoke-virtual {v5, v6}, Lcom/google/firebase/firestore/FirebaseFirestore;->d(Ljava/lang/String;)Lm9/m;

    .line 234
    .line 235
    .line 236
    move-result-object v6

    .line 237
    iget v7, v0, LUc/x;->a:I

    .line 238
    .line 239
    invoke-static {v7}, LA/f;->f(I)I

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    const-string v8, "A transaction object cannot be used after its update callback has been invoked."

    .line 244
    .line 245
    const/4 v9, 0x0

    .line 246
    const/4 v10, 0x1

    .line 247
    iget-object v11, v2, Lm9/d0;->a:Lp9/B;

    .line 248
    .line 249
    iget-object v12, v2, Lm9/d0;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 250
    .line 251
    iget-object v14, v6, Lm9/m;->a:Ls9/h;

    .line 252
    .line 253
    if-eq v7, v10, :cond_8

    .line 254
    .line 255
    if-eq v7, v4, :cond_4

    .line 256
    .line 257
    const/4 v0, 0x3

    .line 258
    if-eq v7, v0, :cond_3

    .line 259
    .line 260
    goto :goto_0

    .line 261
    :cond_3
    invoke-virtual {v12, v6}, Lcom/google/firebase/firestore/FirebaseFirestore;->k(Lm9/m;)V

    .line 262
    .line 263
    .line 264
    new-instance v0, Lt9/e;

    .line 265
    .line 266
    invoke-virtual {v11, v14}, Lp9/B;->a(Ls9/h;)Lt9/m;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    invoke-direct {v0, v14, v6}, Lt9/h;-><init>(Ls9/h;Lt9/m;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    iget-boolean v6, v11, Lp9/B;->d:Z

    .line 278
    .line 279
    xor-int/2addr v6, v10

    .line 280
    new-array v7, v9, [Ljava/lang/Object;

    .line 281
    .line 282
    invoke-static {v6, v8, v7}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    iget-object v6, v11, Lp9/B;->c:Ljava/util/ArrayList;

    .line 286
    .line 287
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 288
    .line 289
    .line 290
    iget-object v0, v11, Lp9/B;->f:Ljava/util/HashSet;

    .line 291
    .line 292
    invoke-virtual {v0, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    goto :goto_0

    .line 296
    :cond_4
    iget-object v7, v0, LUc/x;->d:LUc/q;

    .line 297
    .line 298
    invoke-static {v7}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    iget-object v8, v7, LUc/q;->a:Ljava/lang/Boolean;

    .line 302
    .line 303
    if-eqz v8, :cond_5

    .line 304
    .line 305
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 306
    .line 307
    .line 308
    move-result v8

    .line 309
    if-eqz v8, :cond_5

    .line 310
    .line 311
    sget-object v7, Lm9/a0;->d:Lm9/a0;

    .line 312
    .line 313
    goto :goto_1

    .line 314
    :cond_5
    iget-object v7, v7, LUc/q;->b:Ljava/util/List;

    .line 315
    .line 316
    if-eqz v7, :cond_6

    .line 317
    .line 318
    check-cast v7, Ljava/util/List;

    .line 319
    .line 320
    invoke-static {v7}, Lxg/g;->D(Ljava/util/List;)Ljava/util/ArrayList;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    invoke-static {v7}, Lm9/a0;->a(Ljava/util/ArrayList;)Lm9/a0;

    .line 325
    .line 326
    .line 327
    move-result-object v7

    .line 328
    goto :goto_1

    .line 329
    :cond_6
    const/4 v7, 0x0

    .line 330
    :goto_1
    iget-object v0, v0, LUc/x;->c:Ljava/util/Map;

    .line 331
    .line 332
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    check-cast v0, Ljava/util/Map;

    .line 336
    .line 337
    if-nez v7, :cond_7

    .line 338
    .line 339
    sget-object v7, Lm9/a0;->c:Lm9/a0;

    .line 340
    .line 341
    check-cast v0, Ljava/util/Map;

    .line 342
    .line 343
    invoke-virtual {v2, v6, v0, v7}, Lm9/d0;->c(Lm9/m;Ljava/util/Map;Lm9/a0;)V

    .line 344
    .line 345
    .line 346
    goto :goto_0

    .line 347
    :cond_7
    check-cast v0, Ljava/util/Map;

    .line 348
    .line 349
    invoke-virtual {v2, v6, v0, v7}, Lm9/d0;->c(Lm9/m;Ljava/util/Map;Lm9/a0;)V

    .line 350
    .line 351
    .line 352
    goto/16 :goto_0

    .line 353
    .line 354
    :cond_8
    iget-object v0, v0, LUc/x;->c:Ljava/util/Map;

    .line 355
    .line 356
    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    check-cast v0, Ljava/util/Map;

    .line 360
    .line 361
    iget-object v7, v12, Lcom/google/firebase/firestore/FirebaseFirestore;->h:Lm9/f0;

    .line 362
    .line 363
    invoke-virtual {v7, v0}, Lm9/f0;->i(Ljava/util/Map;)Lne/a;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-virtual {v12, v6}, Lcom/google/firebase/firestore/FirebaseFirestore;->k(Lm9/m;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    :try_start_1
    invoke-virtual {v11, v14}, Lp9/B;->b(Ls9/h;)Lt9/m;

    .line 374
    .line 375
    .line 376
    move-result-object v17

    .line 377
    new-instance v13, Lt9/l;

    .line 378
    .line 379
    iget-object v6, v0, Lne/a;->b:Ljava/lang/Object;

    .line 380
    .line 381
    move-object/from16 v16, v6

    .line 382
    .line 383
    check-cast v16, Lt9/f;

    .line 384
    .line 385
    iget-object v6, v0, Lne/a;->a:Ljava/lang/Object;

    .line 386
    .line 387
    move-object v15, v6

    .line 388
    check-cast v15, Ls9/l;

    .line 389
    .line 390
    iget-object v0, v0, Lne/a;->c:Ljava/lang/Object;

    .line 391
    .line 392
    move-object/from16 v18, v0

    .line 393
    .line 394
    check-cast v18, Ljava/util/List;

    .line 395
    .line 396
    invoke-direct/range {v13 .. v18}, Lt9/l;-><init>(Ls9/h;Ls9/l;Lt9/f;Lt9/m;Ljava/util/List;)V

    .line 397
    .line 398
    .line 399
    invoke-static {v13}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    iget-boolean v6, v11, Lp9/B;->d:Z

    .line 404
    .line 405
    xor-int/2addr v6, v10

    .line 406
    new-array v7, v9, [Ljava/lang/Object;

    .line 407
    .line 408
    invoke-static {v6, v8, v7}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    iget-object v6, v11, Lp9/B;->c:Ljava/util/ArrayList;

    .line 412
    .line 413
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_1
    .catch Lm9/G; {:try_start_1 .. :try_end_1} :catch_0

    .line 414
    .line 415
    .line 416
    goto :goto_2

    .line 417
    :catch_0
    move-exception v0

    .line 418
    iput-object v0, v11, Lp9/B;->e:Lm9/G;

    .line 419
    .line 420
    :goto_2
    iget-object v0, v11, Lp9/B;->f:Ljava/util/HashSet;

    .line 421
    .line 422
    invoke-virtual {v0, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    goto/16 :goto_0

    .line 426
    .line 427
    :cond_9
    new-instance v0, LUc/g;

    .line 428
    .line 429
    invoke-direct {v0}, LUc/g;-><init>()V

    .line 430
    .line 431
    .line 432
    move-object v2, v0

    .line 433
    goto :goto_3

    .line 434
    :catch_1
    new-instance v0, Lm9/G;

    .line 435
    .line 436
    sget-object v2, Lm9/F;->f:Lm9/F;

    .line 437
    .line 438
    const-string v3, "interrupted"

    .line 439
    .line 440
    invoke-direct {v0, v3, v2}, Lm9/G;-><init>(Ljava/lang/String;Lm9/F;)V

    .line 441
    .line 442
    .line 443
    new-instance v2, LUc/g;

    .line 444
    .line 445
    invoke-direct {v2, v0}, LUc/g;-><init>(Lm9/G;)V

    .line 446
    .line 447
    .line 448
    :goto_3
    return-object v2

    .line 449
    :pswitch_1
    iget-object v0, v1, LK3/e;->b:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v0, LM8/f;

    .line 452
    .line 453
    new-instance v2, LC8/d;

    .line 454
    .line 455
    iget-object v3, v1, LK3/e;->d:Ljava/lang/Object;

    .line 456
    .line 457
    check-cast v3, Lxa/d;

    .line 458
    .line 459
    iget-object v4, v1, LK3/e;->c:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v4, Ljava/util/concurrent/Callable;

    .line 462
    .line 463
    const/16 v5, 0x16

    .line 464
    .line 465
    invoke-direct {v2, v5, v4, v3}, LC8/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    iget-object v0, v0, LM8/f;->a:Ljava/util/concurrent/ExecutorService;

    .line 469
    .line 470
    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    return-object v0

    .line 475
    :pswitch_2
    iget-object v0, v1, LK3/e;->b:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast v0, LK3/f;

    .line 478
    .line 479
    iget-object v0, v0, LK3/f;->e:Landroidx/work/impl/WorkDatabase;

    .line 480
    .line 481
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->v()LS3/s;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    iget-object v3, v1, LK3/e;->d:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast v3, Ljava/lang/String;

    .line 488
    .line 489
    invoke-virtual {v2, v3}, LS3/s;->r(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    iget-object v4, v1, LK3/e;->c:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v4, Ljava/util/ArrayList;

    .line 496
    .line 497
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 498
    .line 499
    .line 500
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->u()LS3/q;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-virtual {v0, v3}, LS3/q;->h(Ljava/lang/String;)LS3/p;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    return-object v0

    .line 509
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
