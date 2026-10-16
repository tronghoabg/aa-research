.class public final synthetic LA7/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LA7/z;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 0

    .line 1
    return-void
.end method

.method private final b()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 29

    .line 1
    move-object/from16 v4, p0

    .line 2
    .line 3
    iget v0, v4, LA7/z;->a:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :pswitch_0
    :try_start_0
    const-string v0, "EmojiCompat.EmojiCompatInitializer.run"

    .line 10
    .line 11
    sget v1, Lg1/h;->a:I

    .line 12
    .line 13
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Ly1/g;->j:Ly1/g;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v2, 0x0

    .line 23
    :goto_0
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-static {}, Ly1/g;->a()Ly1/g;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ly1/g;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto :goto_2

    .line 35
    :cond_1
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :goto_2
    sget v1, Lg1/h;->a:I

    .line 40
    .line 41
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 42
    .line 43
    .line 44
    throw v0

    .line 45
    :pswitch_1
    new-instance v0, Ljava/util/ArrayList;

    .line 46
    .line 47
    sget-object v1, LWe/o;->d:Lj$/util/concurrent/ConcurrentHashMap;

    .line 48
    .line 49
    invoke-virtual {v1}, Lj$/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 71
    .line 72
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_2

    .line 77
    .line 78
    sget-object v2, LWe/o;->d:Lj$/util/concurrent/ConcurrentHashMap;

    .line 79
    .line 80
    invoke-virtual {v2, v1}, Lj$/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_2
    invoke-virtual {v1}, Ljava/util/concurrent/ThreadPoolExecutor;->purge()V

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_3
    return-void

    .line 89
    :pswitch_2
    sget-object v0, LSa/a;->i:Landroid/os/Handler;

    .line 90
    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    sget-object v1, LSa/a;->j:LA7/z;

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 96
    .line 97
    .line 98
    sget-object v0, LSa/a;->i:Landroid/os/Handler;

    .line 99
    .line 100
    sget-object v1, LSa/a;->k:LA7/z;

    .line 101
    .line 102
    const-wide/16 v2, 0xc8

    .line 103
    .line 104
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 105
    .line 106
    .line 107
    :cond_4
    return-void

    .line 108
    :pswitch_3
    const-string v5, "OMIDLIB"

    .line 109
    .line 110
    sget-object v6, LSa/a;->g:LSa/a;

    .line 111
    .line 112
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-object v0, v6, LSa/a;->b:Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 118
    .line 119
    .line 120
    sget-object v0, LOa/c;->c:LOa/c;

    .line 121
    .line 122
    iget-object v0, v0, LOa/c;->b:Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-eqz v7, :cond_5

    .line 137
    .line 138
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    check-cast v7, LMa/j;

    .line 143
    .line 144
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 149
    .line 150
    .line 151
    move-result-wide v7

    .line 152
    iput-wide v7, v6, LSa/a;->f:J

    .line 153
    .line 154
    iget-object v7, v6, LSa/a;->d:LSa/b;

    .line 155
    .line 156
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    sget-object v0, LOa/c;->c:LOa/c;

    .line 160
    .line 161
    iget-object v8, v7, LSa/b;->a:Ljava/util/HashMap;

    .line 162
    .line 163
    iget-object v9, v7, LSa/b;->d:Ljava/util/HashSet;

    .line 164
    .line 165
    iget-object v10, v7, LSa/b;->c:Ljava/util/HashMap;

    .line 166
    .line 167
    iget-object v11, v7, LSa/b;->g:Ljava/util/HashMap;

    .line 168
    .line 169
    iget-object v14, v7, LSa/b;->e:Ljava/util/HashSet;

    .line 170
    .line 171
    iget-object v12, v7, LSa/b;->f:Ljava/util/HashSet;

    .line 172
    .line 173
    if-eqz v0, :cond_12

    .line 174
    .line 175
    iget-object v0, v0, LOa/c;->b:Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v13

    .line 189
    if-eqz v13, :cond_12

    .line 190
    .line 191
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v13

    .line 195
    check-cast v13, LMa/j;

    .line 196
    .line 197
    iget-object v15, v13, LMa/j;->d:LN/O0;

    .line 198
    .line 199
    invoke-virtual {v15}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v15

    .line 203
    check-cast v15, Landroid/view/View;

    .line 204
    .line 205
    const/16 v16, 0x1

    .line 206
    .line 207
    iget-boolean v3, v13, LMa/j;->f:Z

    .line 208
    .line 209
    if-eqz v3, :cond_11

    .line 210
    .line 211
    iget-boolean v3, v13, LMa/j;->g:Z

    .line 212
    .line 213
    if-nez v3, :cond_11

    .line 214
    .line 215
    iget-object v3, v13, LMa/j;->h:Ljava/lang/String;

    .line 216
    .line 217
    if-eqz v15, :cond_10

    .line 218
    .line 219
    invoke-virtual {v15}, Landroid/view/View;->isAttachedToWindow()Z

    .line 220
    .line 221
    .line 222
    move-result v17

    .line 223
    const-string v2, "noWindowFocus"

    .line 224
    .line 225
    if-nez v17, :cond_6

    .line 226
    .line 227
    const-string v17, "notAttached"

    .line 228
    .line 229
    move-object/from16 v28, v17

    .line 230
    .line 231
    move-object/from16 v17, v0

    .line 232
    .line 233
    move-object/from16 v0, v28

    .line 234
    .line 235
    goto :goto_a

    .line 236
    :cond_6
    invoke-virtual {v15}, Landroid/view/View;->hasWindowFocus()Z

    .line 237
    .line 238
    .line 239
    move-result v17

    .line 240
    iget-object v1, v7, LSa/b;->h:Ljava/util/WeakHashMap;

    .line 241
    .line 242
    if-eqz v17, :cond_7

    .line 243
    .line 244
    invoke-virtual {v1, v15}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 248
    .line 249
    :goto_6
    move-object/from16 v17, v0

    .line 250
    .line 251
    goto :goto_7

    .line 252
    :cond_7
    invoke-virtual {v1, v15}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v17

    .line 256
    if-eqz v17, :cond_8

    .line 257
    .line 258
    invoke-virtual {v1, v15}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    check-cast v1, Ljava/lang/Boolean;

    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_8
    move-object/from16 v17, v0

    .line 266
    .line 267
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 268
    .line 269
    invoke-virtual {v1, v15, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-object v1, v0

    .line 273
    :goto_7
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_9

    .line 278
    .line 279
    move-object v0, v2

    .line 280
    goto :goto_a

    .line 281
    :cond_9
    new-instance v0, Ljava/util/HashSet;

    .line 282
    .line 283
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 284
    .line 285
    .line 286
    move-object v1, v15

    .line 287
    :goto_8
    if-eqz v1, :cond_c

    .line 288
    .line 289
    invoke-static {v1}, Lff/B;->c(Landroid/view/View;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v18

    .line 293
    if-eqz v18, :cond_a

    .line 294
    .line 295
    move-object/from16 v0, v18

    .line 296
    .line 297
    goto :goto_a

    .line 298
    :cond_a
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    instance-of v4, v1, Landroid/view/View;

    .line 306
    .line 307
    if-eqz v4, :cond_b

    .line 308
    .line 309
    check-cast v1, Landroid/view/View;

    .line 310
    .line 311
    :goto_9
    move-object/from16 v4, p0

    .line 312
    .line 313
    goto :goto_8

    .line 314
    :cond_b
    const/4 v1, 0x0

    .line 315
    goto :goto_9

    .line 316
    :cond_c
    invoke-virtual {v9, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 317
    .line 318
    .line 319
    const/4 v0, 0x0

    .line 320
    :goto_a
    if-nez v0, :cond_f

    .line 321
    .line 322
    invoke-virtual {v14, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    invoke-virtual {v8, v15, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    iget-object v0, v13, LMa/j;->c:Ljava/util/ArrayList;

    .line 329
    .line 330
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    if-nez v1, :cond_e

    .line 339
    .line 340
    :cond_d
    :goto_b
    move-object/from16 v4, p0

    .line 341
    .line 342
    move-object/from16 v0, v17

    .line 343
    .line 344
    goto/16 :goto_5

    .line 345
    .line 346
    :cond_e
    invoke-static {v0}, LVa/M6;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    throw v0

    .line 351
    :cond_f
    if-eq v0, v2, :cond_d

    .line 352
    .line 353
    invoke-virtual {v12, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    invoke-virtual {v10, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    :goto_c
    invoke-virtual {v11, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    goto :goto_b

    .line 363
    :cond_10
    move-object/from16 v17, v0

    .line 364
    .line 365
    invoke-virtual {v12, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    const-string v0, "noAdView"

    .line 369
    .line 370
    goto :goto_c

    .line 371
    :cond_11
    move-object/from16 v17, v0

    .line 372
    .line 373
    goto :goto_b

    .line 374
    :cond_12
    const/16 v16, 0x1

    .line 375
    .line 376
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 377
    .line 378
    .line 379
    move-result-wide v24

    .line 380
    iget-object v1, v6, LSa/a;->c:LS3/s;

    .line 381
    .line 382
    iget-object v0, v1, LS3/s;->c:Ljava/lang/Object;

    .line 383
    .line 384
    move-object v2, v0

    .line 385
    check-cast v2, LY9/c;

    .line 386
    .line 387
    invoke-virtual {v12}, Ljava/util/HashSet;->size()I

    .line 388
    .line 389
    .line 390
    move-result v0

    .line 391
    iget-object v13, v6, LSa/a;->e:LS3/c;

    .line 392
    .line 393
    if-lez v0, :cond_15

    .line 394
    .line 395
    invoke-virtual {v12}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 396
    .line 397
    .line 398
    move-result-object v3

    .line 399
    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    if-eqz v0, :cond_15

    .line 404
    .line 405
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    move-object v4, v0

    .line 410
    check-cast v4, Ljava/lang/String;

    .line 411
    .line 412
    move-object/from16 v17, v3

    .line 413
    .line 414
    const/4 v15, 0x0

    .line 415
    invoke-virtual {v2, v15}, LY9/c;->a(Landroid/view/View;)Lorg/json/JSONObject;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    invoke-virtual {v10, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    check-cast v0, Landroid/view/View;

    .line 424
    .line 425
    invoke-virtual {v11, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v15

    .line 429
    check-cast v15, Ljava/lang/String;

    .line 430
    .line 431
    if-eqz v15, :cond_13

    .line 432
    .line 433
    move-object/from16 v27, v8

    .line 434
    .line 435
    iget-object v8, v1, LS3/s;->b:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v8, LA/e0;

    .line 438
    .line 439
    invoke-virtual {v8, v0}, LA/e0;->b(Landroid/view/View;)Lorg/json/JSONObject;

    .line 440
    .line 441
    .line 442
    move-result-object v8

    .line 443
    :try_start_1
    const-string v0, "adSessionId"

    .line 444
    .line 445
    invoke-virtual {v8, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 446
    .line 447
    .line 448
    move-object/from16 v18, v1

    .line 449
    .line 450
    goto :goto_e

    .line 451
    :catch_0
    move-exception v0

    .line 452
    move-object/from16 v18, v1

    .line 453
    .line 454
    const-string v1, "Error with setting ad session id"

    .line 455
    .line 456
    invoke-static {v5, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 457
    .line 458
    .line 459
    :goto_e
    :try_start_2
    const-string v0, "notVisibleReason"

    .line 460
    .line 461
    invoke-virtual {v8, v0, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 462
    .line 463
    .line 464
    goto :goto_f

    .line 465
    :catch_1
    move-exception v0

    .line 466
    const-string v1, "Error with setting not visible reason"

    .line 467
    .line 468
    invoke-static {v5, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 469
    .line 470
    .line 471
    :goto_f
    invoke-static {v3, v8}, LRa/b;->c(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 472
    .line 473
    .line 474
    goto :goto_10

    .line 475
    :cond_13
    move-object/from16 v18, v1

    .line 476
    .line 477
    move-object/from16 v27, v8

    .line 478
    .line 479
    :goto_10
    invoke-static {v3}, LRa/b;->d(Lorg/json/JSONObject;)V

    .line 480
    .line 481
    .line 482
    new-instance v0, Ljava/util/HashSet;

    .line 483
    .line 484
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    new-instance v20, LTa/c;

    .line 494
    .line 495
    const/16 v26, 0x0

    .line 496
    .line 497
    move-object/from16 v22, v0

    .line 498
    .line 499
    move-object/from16 v23, v3

    .line 500
    .line 501
    move-object/from16 v21, v13

    .line 502
    .line 503
    invoke-direct/range {v20 .. v26}, LTa/c;-><init>(LS3/c;Ljava/util/HashSet;Lorg/json/JSONObject;JI)V

    .line 504
    .line 505
    .line 506
    move-object/from16 v0, v20

    .line 507
    .line 508
    iget-object v1, v13, LS3/c;->c:Ljava/lang/Object;

    .line 509
    .line 510
    check-cast v1, LG9/e;

    .line 511
    .line 512
    iput-object v1, v0, LTa/a;->a:LG9/e;

    .line 513
    .line 514
    iget-object v3, v1, LG9/e;->c:Ljava/lang/Object;

    .line 515
    .line 516
    check-cast v3, Ljava/util/ArrayDeque;

    .line 517
    .line 518
    invoke-virtual {v3, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    iget-object v0, v1, LG9/e;->d:Ljava/lang/Object;

    .line 522
    .line 523
    check-cast v0, LTa/a;

    .line 524
    .line 525
    if-nez v0, :cond_14

    .line 526
    .line 527
    invoke-virtual {v1}, LG9/e;->o()V

    .line 528
    .line 529
    .line 530
    :cond_14
    move-object/from16 v3, v17

    .line 531
    .line 532
    move-object/from16 v1, v18

    .line 533
    .line 534
    move-object/from16 v8, v27

    .line 535
    .line 536
    goto/16 :goto_d

    .line 537
    .line 538
    :cond_15
    move-object/from16 v27, v8

    .line 539
    .line 540
    invoke-virtual {v14}, Ljava/util/HashSet;->size()I

    .line 541
    .line 542
    .line 543
    move-result v0

    .line 544
    if-lez v0, :cond_1f

    .line 545
    .line 546
    const/4 v15, 0x0

    .line 547
    invoke-virtual {v2, v15}, LY9/c;->a(Landroid/view/View;)Lorg/json/JSONObject;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    new-instance v1, Ljava/util/ArrayList;

    .line 555
    .line 556
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 557
    .line 558
    .line 559
    sget-object v3, LOa/c;->c:LOa/c;

    .line 560
    .line 561
    if-eqz v3, :cond_1d

    .line 562
    .line 563
    iget-object v3, v3, LOa/c;->b:Ljava/util/ArrayList;

    .line 564
    .line 565
    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 566
    .line 567
    .line 568
    move-result-object v3

    .line 569
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 570
    .line 571
    .line 572
    move-result v4

    .line 573
    mul-int/lit8 v4, v4, 0x2

    .line 574
    .line 575
    add-int/lit8 v4, v4, 0x3

    .line 576
    .line 577
    new-instance v5, Ljava/util/IdentityHashMap;

    .line 578
    .line 579
    invoke-direct {v5, v4}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 580
    .line 581
    .line 582
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 583
    .line 584
    .line 585
    move-result-object v3

    .line 586
    :cond_16
    :goto_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 587
    .line 588
    .line 589
    move-result v4

    .line 590
    if-eqz v4, :cond_1d

    .line 591
    .line 592
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v4

    .line 596
    check-cast v4, LMa/j;

    .line 597
    .line 598
    iget-object v4, v4, LMa/j;->d:LN/O0;

    .line 599
    .line 600
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v4

    .line 604
    check-cast v4, Landroid/view/View;

    .line 605
    .line 606
    if-eqz v4, :cond_16

    .line 607
    .line 608
    invoke-virtual {v4}, Landroid/view/View;->isAttachedToWindow()Z

    .line 609
    .line 610
    .line 611
    move-result v8

    .line 612
    if-nez v8, :cond_17

    .line 613
    .line 614
    goto :goto_11

    .line 615
    :cond_17
    invoke-virtual {v4}, Landroid/view/View;->isShown()Z

    .line 616
    .line 617
    .line 618
    move-result v8

    .line 619
    if-nez v8, :cond_18

    .line 620
    .line 621
    goto :goto_11

    .line 622
    :cond_18
    move-object v8, v4

    .line 623
    :goto_12
    if-eqz v8, :cond_1b

    .line 624
    .line 625
    invoke-virtual {v8}, Landroid/view/View;->getAlpha()F

    .line 626
    .line 627
    .line 628
    move-result v15

    .line 629
    const/16 v17, 0x0

    .line 630
    .line 631
    cmpl-float v15, v15, v17

    .line 632
    .line 633
    if-nez v15, :cond_19

    .line 634
    .line 635
    goto :goto_11

    .line 636
    :cond_19
    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 637
    .line 638
    .line 639
    move-result-object v8

    .line 640
    instance-of v15, v8, Landroid/view/View;

    .line 641
    .line 642
    if-eqz v15, :cond_1a

    .line 643
    .line 644
    move-object v15, v8

    .line 645
    check-cast v15, Landroid/view/View;

    .line 646
    .line 647
    move-object v8, v15

    .line 648
    goto :goto_12

    .line 649
    :cond_1a
    const/4 v8, 0x0

    .line 650
    goto :goto_12

    .line 651
    :cond_1b
    invoke-virtual {v4}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 652
    .line 653
    .line 654
    move-result-object v4

    .line 655
    if-eqz v4, :cond_16

    .line 656
    .line 657
    invoke-virtual {v5, v4}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 658
    .line 659
    .line 660
    move-result v8

    .line 661
    if-nez v8, :cond_16

    .line 662
    .line 663
    invoke-virtual {v5, v4, v4}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v4}, Landroid/view/View;->getZ()F

    .line 667
    .line 668
    .line 669
    move-result v8

    .line 670
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 671
    .line 672
    .line 673
    move-result v15

    .line 674
    :goto_13
    move-object/from16 v17, v3

    .line 675
    .line 676
    if-lez v15, :cond_1c

    .line 677
    .line 678
    add-int/lit8 v3, v15, -0x1

    .line 679
    .line 680
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v3

    .line 684
    check-cast v3, Landroid/view/View;

    .line 685
    .line 686
    invoke-virtual {v3}, Landroid/view/View;->getZ()F

    .line 687
    .line 688
    .line 689
    move-result v3

    .line 690
    cmpl-float v3, v3, v8

    .line 691
    .line 692
    if-lez v3, :cond_1c

    .line 693
    .line 694
    add-int/lit8 v15, v15, -0x1

    .line 695
    .line 696
    move-object/from16 v3, v17

    .line 697
    .line 698
    goto :goto_13

    .line 699
    :cond_1c
    invoke-virtual {v1, v15, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 700
    .line 701
    .line 702
    move-object/from16 v3, v17

    .line 703
    .line 704
    goto :goto_11

    .line 705
    :cond_1d
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 706
    .line 707
    .line 708
    move-result-object v1

    .line 709
    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 710
    .line 711
    .line 712
    move-result v3

    .line 713
    if-eqz v3, :cond_1e

    .line 714
    .line 715
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v3

    .line 719
    check-cast v3, Landroid/view/View;

    .line 720
    .line 721
    iget-object v4, v2, LY9/c;->b:Ljava/lang/Object;

    .line 722
    .line 723
    check-cast v4, LA/e0;

    .line 724
    .line 725
    const/4 v5, 0x0

    .line 726
    invoke-virtual {v6, v3, v4, v0, v5}, LSa/a;->a(Landroid/view/View;LA/e0;Lorg/json/JSONObject;Z)V

    .line 727
    .line 728
    .line 729
    goto :goto_14

    .line 730
    :cond_1e
    invoke-static {v0}, LRa/b;->d(Lorg/json/JSONObject;)V

    .line 731
    .line 732
    .line 733
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    move-object v1, v12

    .line 737
    new-instance v12, LTa/c;

    .line 738
    .line 739
    const/16 v18, 0x1

    .line 740
    .line 741
    move-object v15, v0

    .line 742
    move-wide/from16 v16, v24

    .line 743
    .line 744
    invoke-direct/range {v12 .. v18}, LTa/c;-><init>(LS3/c;Ljava/util/HashSet;Lorg/json/JSONObject;JI)V

    .line 745
    .line 746
    .line 747
    iget-object v0, v13, LS3/c;->c:Ljava/lang/Object;

    .line 748
    .line 749
    check-cast v0, LG9/e;

    .line 750
    .line 751
    iput-object v0, v12, LTa/a;->a:LG9/e;

    .line 752
    .line 753
    iget-object v2, v0, LG9/e;->c:Ljava/lang/Object;

    .line 754
    .line 755
    check-cast v2, Ljava/util/ArrayDeque;

    .line 756
    .line 757
    invoke-virtual {v2, v12}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 758
    .line 759
    .line 760
    iget-object v2, v0, LG9/e;->d:Ljava/lang/Object;

    .line 761
    .line 762
    check-cast v2, LTa/a;

    .line 763
    .line 764
    if-nez v2, :cond_20

    .line 765
    .line 766
    invoke-virtual {v0}, LG9/e;->o()V

    .line 767
    .line 768
    .line 769
    goto :goto_15

    .line 770
    :cond_1f
    move-object v1, v12

    .line 771
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 772
    .line 773
    .line 774
    new-instance v0, LTa/b;

    .line 775
    .line 776
    invoke-direct {v0, v13}, LTa/a;-><init>(LS3/c;)V

    .line 777
    .line 778
    .line 779
    iget-object v2, v13, LS3/c;->c:Ljava/lang/Object;

    .line 780
    .line 781
    check-cast v2, LG9/e;

    .line 782
    .line 783
    iput-object v2, v0, LTa/a;->a:LG9/e;

    .line 784
    .line 785
    iget-object v3, v2, LG9/e;->c:Ljava/lang/Object;

    .line 786
    .line 787
    check-cast v3, Ljava/util/ArrayDeque;

    .line 788
    .line 789
    invoke-virtual {v3, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 790
    .line 791
    .line 792
    iget-object v0, v2, LG9/e;->d:Ljava/lang/Object;

    .line 793
    .line 794
    check-cast v0, LTa/a;

    .line 795
    .line 796
    if-nez v0, :cond_20

    .line 797
    .line 798
    invoke-virtual {v2}, LG9/e;->o()V

    .line 799
    .line 800
    .line 801
    :cond_20
    :goto_15
    invoke-virtual/range {v27 .. v27}, Ljava/util/HashMap;->clear()V

    .line 802
    .line 803
    .line 804
    iget-object v0, v7, LSa/b;->b:Ljava/util/HashMap;

    .line 805
    .line 806
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 807
    .line 808
    .line 809
    invoke-virtual {v10}, Ljava/util/HashMap;->clear()V

    .line 810
    .line 811
    .line 812
    invoke-virtual {v9}, Ljava/util/HashSet;->clear()V

    .line 813
    .line 814
    .line 815
    invoke-virtual {v14}, Ljava/util/HashSet;->clear()V

    .line 816
    .line 817
    .line 818
    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    .line 819
    .line 820
    .line 821
    invoke-virtual {v11}, Ljava/util/HashMap;->clear()V

    .line 822
    .line 823
    .line 824
    const/4 v5, 0x0

    .line 825
    iput-boolean v5, v7, LSa/b;->i:Z

    .line 826
    .line 827
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 828
    .line 829
    .line 830
    move-result-wide v0

    .line 831
    iget-wide v2, v6, LSa/a;->f:J

    .line 832
    .line 833
    sub-long/2addr v0, v2

    .line 834
    iget-object v2, v6, LSa/a;->a:Ljava/util/ArrayList;

    .line 835
    .line 836
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 837
    .line 838
    .line 839
    move-result v3

    .line 840
    if-lez v3, :cond_23

    .line 841
    .line 842
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 843
    .line 844
    .line 845
    move-result-object v2

    .line 846
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 847
    .line 848
    .line 849
    move-result v3

    .line 850
    if-nez v3, :cond_21

    .line 851
    .line 852
    goto :goto_16

    .line 853
    :cond_21
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v2

    .line 857
    if-nez v2, :cond_22

    .line 858
    .line 859
    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 860
    .line 861
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 862
    .line 863
    .line 864
    const/16 v19, 0x0

    .line 865
    .line 866
    throw v19

    .line 867
    :cond_22
    new-instance v0, Ljava/lang/ClassCastException;

    .line 868
    .line 869
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 870
    .line 871
    .line 872
    throw v0

    .line 873
    :cond_23
    :goto_16
    :pswitch_4
    return-void

    .line 874
    :pswitch_5
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzhj;->zzc()V

    .line 875
    .line 876
    .line 877
    return-void

    .line 878
    nop

    .line 879
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, LA7/z;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    const-string v0, "EmptyRunnable"

    .line 12
    .line 13
    return-object v0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
