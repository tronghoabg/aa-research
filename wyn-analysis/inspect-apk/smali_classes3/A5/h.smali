.class public final synthetic LA5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA5/k;
.implements Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingDisplay;
.implements Lu6/h;
.implements Lu6/g;
.implements LL8/e;
.implements LLe/a;
.implements LLe/c;
.implements Lcom/google/android/gms/tasks/OnSuccessListener;
.implements LO9/a;
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements LQ1/h;
.implements LQ1/g;
.implements Lcom/google/android/gms/tasks/OnFailureListener;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LA5/h;->a:I

    iput-object p2, p0, LA5/h;->b:Ljava/lang/Object;

    iput-object p3, p0, LA5/h;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LA5/h;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LW9/i;

    .line 4
    .line 5
    iget-object v1, p0, LA5/h;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v2, v0, LW9/i;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lx/e;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Lx/v;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-object p1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p1
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lu6/e;)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v1, LA5/h;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v3, LF5/f;

    .line 9
    .line 10
    iget-object v4, v1, LA5/h;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v4, LE5/I;

    .line 13
    .line 14
    move-object/from16 v5, p1

    .line 15
    .line 16
    check-cast v5, LF5/j;

    .line 17
    .line 18
    iget-object v3, v3, LF5/f;->e:Landroid/util/SparseArray;

    .line 19
    .line 20
    new-instance v6, Landroid/util/SparseArray;

    .line 21
    .line 22
    iget-object v7, v0, Lu6/e;->a:Landroid/util/SparseBooleanArray;

    .line 23
    .line 24
    invoke-virtual {v7}, Landroid/util/SparseBooleanArray;->size()I

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    invoke-direct {v6, v7}, Landroid/util/SparseArray;-><init>(I)V

    .line 29
    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    move v8, v7

    .line 33
    :goto_0
    iget-object v9, v0, Lu6/e;->a:Landroid/util/SparseBooleanArray;

    .line 34
    .line 35
    invoke-virtual {v9}, Landroid/util/SparseBooleanArray;->size()I

    .line 36
    .line 37
    .line 38
    move-result v9

    .line 39
    if-ge v8, v9, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0, v8}, Lu6/e;->a(I)I

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    invoke-virtual {v3, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v10

    .line 49
    check-cast v10, LF5/a;

    .line 50
    .line 51
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v6, v9, v10}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    add-int/2addr v8, v2

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v3, v0, Lu6/e;->a:Landroid/util/SparseBooleanArray;

    .line 63
    .line 64
    invoke-virtual {v3}, Landroid/util/SparseBooleanArray;->size()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-nez v3, :cond_1

    .line 69
    .line 70
    goto/16 :goto_27

    .line 71
    .line 72
    :cond_1
    move v3, v7

    .line 73
    :goto_1
    iget-object v8, v0, Lu6/e;->a:Landroid/util/SparseBooleanArray;

    .line 74
    .line 75
    invoke-virtual {v8}, Landroid/util/SparseBooleanArray;->size()I

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    const/16 v9, 0xb

    .line 80
    .line 81
    const/4 v10, 0x0

    .line 82
    if-ge v3, v8, :cond_8

    .line 83
    .line 84
    invoke-virtual {v0, v3}, Lu6/e;->a(I)I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    invoke-virtual {v6, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    check-cast v11, LF5/a;

    .line 93
    .line 94
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    if-nez v8, :cond_6

    .line 98
    .line 99
    iget-object v12, v5, LF5/j;->b:LF5/h;

    .line 100
    .line 101
    monitor-enter v12

    .line 102
    :try_start_0
    iget-object v8, v12, LF5/h;->d:LF5/j;

    .line 103
    .line 104
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object v8, v12, LF5/h;->e:LE5/J0;

    .line 108
    .line 109
    iget-object v9, v11, LF5/a;->b:LE5/J0;

    .line 110
    .line 111
    iput-object v9, v12, LF5/h;->e:LE5/J0;

    .line 112
    .line 113
    iget-object v9, v12, LF5/h;->c:Ljava/util/HashMap;

    .line 114
    .line 115
    invoke-virtual {v9}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-interface {v9}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    :cond_2
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v13

    .line 127
    if-eqz v13, :cond_5

    .line 128
    .line 129
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v13

    .line 133
    check-cast v13, LF5/g;

    .line 134
    .line 135
    iget-object v14, v12, LF5/h;->e:LE5/J0;

    .line 136
    .line 137
    invoke-virtual {v13, v8, v14}, LF5/g;->b(LE5/J0;LE5/J0;)Z

    .line 138
    .line 139
    .line 140
    move-result v14

    .line 141
    if-eqz v14, :cond_3

    .line 142
    .line 143
    invoke-virtual {v13, v11}, LF5/g;->a(LF5/a;)Z

    .line 144
    .line 145
    .line 146
    move-result v14

    .line 147
    if-eqz v14, :cond_2

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :catchall_0
    move-exception v0

    .line 151
    goto :goto_4

    .line 152
    :cond_3
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->remove()V

    .line 153
    .line 154
    .line 155
    iget-boolean v14, v13, LF5/g;->e:Z

    .line 156
    .line 157
    if-eqz v14, :cond_2

    .line 158
    .line 159
    iget-object v14, v13, LF5/g;->a:Ljava/lang/String;

    .line 160
    .line 161
    iget-object v15, v12, LF5/h;->f:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v14

    .line 167
    if-eqz v14, :cond_4

    .line 168
    .line 169
    iput-object v10, v12, LF5/h;->f:Ljava/lang/String;

    .line 170
    .line 171
    :cond_4
    iget-object v14, v12, LF5/h;->d:LF5/j;

    .line 172
    .line 173
    iget-object v13, v13, LF5/g;->a:Ljava/lang/String;

    .line 174
    .line 175
    invoke-virtual {v14, v11, v13}, LF5/j;->d(LF5/a;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_5
    invoke-virtual {v12, v11}, LF5/h;->d(LF5/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    .line 181
    .line 182
    monitor-exit v12

    .line 183
    goto :goto_5

    .line 184
    :goto_4
    :try_start_1
    monitor-exit v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 185
    throw v0

    .line 186
    :cond_6
    if-ne v8, v9, :cond_7

    .line 187
    .line 188
    iget-object v8, v5, LF5/j;->b:LF5/h;

    .line 189
    .line 190
    iget v9, v5, LF5/j;->k:I

    .line 191
    .line 192
    invoke-virtual {v8, v11, v9}, LF5/h;->f(LF5/a;I)V

    .line 193
    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_7
    iget-object v8, v5, LF5/j;->b:LF5/h;

    .line 197
    .line 198
    invoke-virtual {v8, v11}, LF5/h;->e(LF5/a;)V

    .line 199
    .line 200
    .line 201
    :goto_5
    add-int/2addr v3, v2

    .line 202
    goto/16 :goto_1

    .line 203
    .line 204
    :cond_8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 205
    .line 206
    .line 207
    move-result-wide v11

    .line 208
    iget-object v3, v0, Lu6/e;->a:Landroid/util/SparseBooleanArray;

    .line 209
    .line 210
    invoke-virtual {v3, v7}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-eqz v3, :cond_9

    .line 215
    .line 216
    invoke-virtual {v6, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    check-cast v3, LF5/a;

    .line 221
    .line 222
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    iget-object v8, v5, LF5/j;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 226
    .line 227
    if-eqz v8, :cond_9

    .line 228
    .line 229
    iget-object v8, v3, LF5/a;->b:LE5/J0;

    .line 230
    .line 231
    iget-object v3, v3, LF5/a;->d:Lf6/z;

    .line 232
    .line 233
    invoke-virtual {v5, v8, v3}, LF5/j;->c(LE5/J0;Lf6/z;)V

    .line 234
    .line 235
    .line 236
    :cond_9
    iget-object v3, v0, Lu6/e;->a:Landroid/util/SparseBooleanArray;

    .line 237
    .line 238
    const/4 v8, 0x2

    .line 239
    invoke-virtual {v3, v8}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    if-eqz v3, :cond_11

    .line 244
    .line 245
    iget-object v3, v5, LF5/j;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 246
    .line 247
    if-eqz v3, :cond_11

    .line 248
    .line 249
    invoke-virtual {v4}, LE5/I;->p0()LE5/L0;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    iget-object v3, v3, LE5/L0;->a:Ll8/K;

    .line 254
    .line 255
    invoke-virtual {v3, v7}, Ll8/K;->l(I)Ll8/I;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    :goto_6
    invoke-virtual {v3}, Ll8/I;->hasNext()Z

    .line 260
    .line 261
    .line 262
    move-result v15

    .line 263
    if-eqz v15, :cond_c

    .line 264
    .line 265
    invoke-virtual {v3}, Ll8/I;->next()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v15

    .line 269
    check-cast v15, LE5/K0;

    .line 270
    .line 271
    move v9, v7

    .line 272
    :goto_7
    iget v10, v15, LE5/K0;->a:I

    .line 273
    .line 274
    if-ge v9, v10, :cond_b

    .line 275
    .line 276
    iget-object v10, v15, LE5/K0;->e:[Z

    .line 277
    .line 278
    aget-boolean v10, v10, v9

    .line 279
    .line 280
    if-eqz v10, :cond_a

    .line 281
    .line 282
    iget-object v10, v15, LE5/K0;->b:Lf6/Z;

    .line 283
    .line 284
    iget-object v10, v10, Lf6/Z;->d:[LE5/T;

    .line 285
    .line 286
    aget-object v10, v10, v9

    .line 287
    .line 288
    iget-object v10, v10, LE5/T;->o:LI5/c;

    .line 289
    .line 290
    if-eqz v10, :cond_a

    .line 291
    .line 292
    goto :goto_8

    .line 293
    :cond_a
    add-int/2addr v9, v2

    .line 294
    goto :goto_7

    .line 295
    :cond_b
    const/16 v9, 0xb

    .line 296
    .line 297
    const/4 v10, 0x0

    .line 298
    goto :goto_6

    .line 299
    :cond_c
    const/4 v10, 0x0

    .line 300
    :goto_8
    if-eqz v10, :cond_11

    .line 301
    .line 302
    iget-object v3, v5, LF5/j;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 303
    .line 304
    sget v9, Lu6/v;->a:I

    .line 305
    .line 306
    invoke-static {v3}, LV1/g;->k(Ljava/lang/Object;)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    move v9, v7

    .line 311
    :goto_9
    iget v15, v10, LI5/c;->d:I

    .line 312
    .line 313
    if-ge v9, v15, :cond_10

    .line 314
    .line 315
    iget-object v15, v10, LI5/c;->a:[LI5/b;

    .line 316
    .line 317
    aget-object v15, v15, v9

    .line 318
    .line 319
    iget-object v15, v15, LI5/b;->b:Ljava/util/UUID;

    .line 320
    .line 321
    sget-object v8, LE5/i;->c:Ljava/util/UUID;

    .line 322
    .line 323
    invoke-virtual {v15, v8}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v8

    .line 327
    if-eqz v8, :cond_d

    .line 328
    .line 329
    const/4 v8, 0x3

    .line 330
    goto :goto_a

    .line 331
    :cond_d
    sget-object v8, LE5/i;->d:Ljava/util/UUID;

    .line 332
    .line 333
    invoke-virtual {v15, v8}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v8

    .line 337
    if-eqz v8, :cond_e

    .line 338
    .line 339
    const/4 v8, 0x2

    .line 340
    goto :goto_a

    .line 341
    :cond_e
    sget-object v8, LE5/i;->b:Ljava/util/UUID;

    .line 342
    .line 343
    invoke-virtual {v15, v8}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v8

    .line 347
    if-eqz v8, :cond_f

    .line 348
    .line 349
    const/4 v8, 0x6

    .line 350
    goto :goto_a

    .line 351
    :cond_f
    add-int/2addr v9, v2

    .line 352
    const/4 v8, 0x2

    .line 353
    goto :goto_9

    .line 354
    :cond_10
    move v8, v2

    .line 355
    :goto_a
    invoke-static {v3, v8}, LV1/g;->m(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 356
    .line 357
    .line 358
    :cond_11
    iget-object v3, v0, Lu6/e;->a:Landroid/util/SparseBooleanArray;

    .line 359
    .line 360
    const/16 v8, 0x3f3

    .line 361
    .line 362
    invoke-virtual {v3, v8}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    if-eqz v3, :cond_12

    .line 367
    .line 368
    iget v3, v5, LF5/j;->z:I

    .line 369
    .line 370
    add-int/2addr v3, v2

    .line 371
    iput v3, v5, LF5/j;->z:I

    .line 372
    .line 373
    :cond_12
    iget-object v3, v5, LF5/j;->n:LE5/o;

    .line 374
    .line 375
    const/4 v8, 0x5

    .line 376
    const/4 v10, 0x4

    .line 377
    if-nez v3, :cond_13

    .line 378
    .line 379
    move v7, v2

    .line 380
    const/16 v8, 0xd

    .line 381
    .line 382
    const/16 v16, 0x8

    .line 383
    .line 384
    const/16 v17, 0x7

    .line 385
    .line 386
    const/16 v18, 0x6

    .line 387
    .line 388
    const/16 v19, 0x9

    .line 389
    .line 390
    goto/16 :goto_19

    .line 391
    .line 392
    :cond_13
    iget v15, v5, LF5/j;->v:I

    .line 393
    .line 394
    if-ne v15, v10, :cond_14

    .line 395
    .line 396
    move v15, v2

    .line 397
    goto :goto_b

    .line 398
    :cond_14
    move v15, v7

    .line 399
    :goto_b
    iget v10, v3, LE5/o;->a:I

    .line 400
    .line 401
    const/16 v13, 0x3e9

    .line 402
    .line 403
    if-ne v10, v13, :cond_15

    .line 404
    .line 405
    new-instance v10, LD9/n;

    .line 406
    .line 407
    const/16 v13, 0x14

    .line 408
    .line 409
    invoke-direct {v10, v13, v7, v2}, LD9/n;-><init>(III)V

    .line 410
    .line 411
    .line 412
    :goto_c
    const/16 v8, 0xd

    .line 413
    .line 414
    const/16 v16, 0x8

    .line 415
    .line 416
    const/16 v17, 0x7

    .line 417
    .line 418
    const/16 v18, 0x6

    .line 419
    .line 420
    const/16 v19, 0x9

    .line 421
    .line 422
    goto/16 :goto_18

    .line 423
    .line 424
    :cond_15
    instance-of v13, v3, LE5/o;

    .line 425
    .line 426
    if-eqz v13, :cond_17

    .line 427
    .line 428
    iget v13, v3, LE5/o;->c:I

    .line 429
    .line 430
    if-ne v13, v2, :cond_16

    .line 431
    .line 432
    move v13, v2

    .line 433
    goto :goto_d

    .line 434
    :cond_16
    move v13, v7

    .line 435
    :goto_d
    iget v14, v3, LE5/o;->g:I

    .line 436
    .line 437
    goto :goto_e

    .line 438
    :cond_17
    move v13, v7

    .line 439
    move v14, v13

    .line 440
    :goto_e
    invoke-virtual {v3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 441
    .line 442
    .line 443
    move-result-object v9

    .line 444
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    instance-of v7, v9, Ljava/io/IOException;

    .line 448
    .line 449
    const/16 v20, 0x19

    .line 450
    .line 451
    const/16 v21, 0x1a

    .line 452
    .line 453
    const/16 v2, 0x17

    .line 454
    .line 455
    if-eqz v7, :cond_2c

    .line 456
    .line 457
    instance-of v7, v9, Lt6/z;

    .line 458
    .line 459
    if-eqz v7, :cond_18

    .line 460
    .line 461
    check-cast v9, Lt6/z;

    .line 462
    .line 463
    new-instance v10, LD9/n;

    .line 464
    .line 465
    iget v2, v9, Lt6/z;->d:I

    .line 466
    .line 467
    const/4 v7, 0x1

    .line 468
    invoke-direct {v10, v8, v2, v7}, LD9/n;-><init>(III)V

    .line 469
    .line 470
    .line 471
    goto :goto_c

    .line 472
    :cond_18
    instance-of v7, v9, Lt6/y;

    .line 473
    .line 474
    if-nez v7, :cond_19

    .line 475
    .line 476
    instance-of v7, v9, LE5/o0;

    .line 477
    .line 478
    if-eqz v7, :cond_1a

    .line 479
    .line 480
    :cond_19
    const/16 v2, 0x9

    .line 481
    .line 482
    const/16 v7, 0x8

    .line 483
    .line 484
    const/4 v13, 0x0

    .line 485
    const/4 v14, 0x1

    .line 486
    const/16 v17, 0x7

    .line 487
    .line 488
    const/16 v18, 0x6

    .line 489
    .line 490
    goto/16 :goto_14

    .line 491
    .line 492
    :cond_1a
    instance-of v7, v9, Lt6/x;

    .line 493
    .line 494
    if-nez v7, :cond_1b

    .line 495
    .line 496
    instance-of v13, v9, Lt6/L;

    .line 497
    .line 498
    if-eqz v13, :cond_1c

    .line 499
    .line 500
    :cond_1b
    const/16 v2, 0x9

    .line 501
    .line 502
    const/4 v13, 0x0

    .line 503
    const/4 v14, 0x1

    .line 504
    goto/16 :goto_11

    .line 505
    .line 506
    :cond_1c
    const/16 v7, 0x3ea

    .line 507
    .line 508
    const/16 v13, 0x15

    .line 509
    .line 510
    if-ne v10, v7, :cond_1d

    .line 511
    .line 512
    new-instance v10, LD9/n;

    .line 513
    .line 514
    const/4 v2, 0x0

    .line 515
    const/4 v7, 0x1

    .line 516
    invoke-direct {v10, v13, v2, v7}, LD9/n;-><init>(III)V

    .line 517
    .line 518
    .line 519
    goto :goto_c

    .line 520
    :cond_1d
    instance-of v7, v9, LI5/d;

    .line 521
    .line 522
    if-eqz v7, :cond_24

    .line 523
    .line 524
    invoke-virtual {v9}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 525
    .line 526
    .line 527
    move-result-object v7

    .line 528
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 529
    .line 530
    .line 531
    sget v9, Lu6/v;->a:I

    .line 532
    .line 533
    if-lt v9, v13, :cond_1e

    .line 534
    .line 535
    instance-of v10, v7, Landroid/media/MediaDrm$MediaDrmStateException;

    .line 536
    .line 537
    if-eqz v10, :cond_1e

    .line 538
    .line 539
    check-cast v7, Landroid/media/MediaDrm$MediaDrmStateException;

    .line 540
    .line 541
    invoke-virtual {v7}, Landroid/media/MediaDrm$MediaDrmStateException;->getDiagnosticInfo()Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    invoke-static {v2}, Lu6/v;->m(Ljava/lang/String;)I

    .line 546
    .line 547
    .line 548
    move-result v2

    .line 549
    invoke-static {v2}, Lu6/v;->l(I)I

    .line 550
    .line 551
    .line 552
    move-result v7

    .line 553
    packed-switch v7, :pswitch_data_0

    .line 554
    .line 555
    .line 556
    const/16 v7, 0x1b

    .line 557
    .line 558
    goto :goto_f

    .line 559
    :pswitch_0
    move/from16 v7, v21

    .line 560
    .line 561
    goto :goto_f

    .line 562
    :pswitch_1
    move/from16 v7, v20

    .line 563
    .line 564
    goto :goto_f

    .line 565
    :pswitch_2
    const/16 v7, 0x1c

    .line 566
    .line 567
    goto :goto_f

    .line 568
    :pswitch_3
    const/16 v7, 0x18

    .line 569
    .line 570
    :goto_f
    new-instance v10, LD9/n;

    .line 571
    .line 572
    const/4 v13, 0x1

    .line 573
    invoke-direct {v10, v7, v2, v13}, LD9/n;-><init>(III)V

    .line 574
    .line 575
    .line 576
    goto/16 :goto_c

    .line 577
    .line 578
    :cond_1e
    const/4 v13, 0x1

    .line 579
    if-lt v9, v2, :cond_1f

    .line 580
    .line 581
    instance-of v10, v7, Landroid/media/MediaDrmResetException;

    .line 582
    .line 583
    if-eqz v10, :cond_1f

    .line 584
    .line 585
    new-instance v10, LD9/n;

    .line 586
    .line 587
    const/16 v7, 0x1b

    .line 588
    .line 589
    const/4 v14, 0x0

    .line 590
    invoke-direct {v10, v7, v14, v13}, LD9/n;-><init>(III)V

    .line 591
    .line 592
    .line 593
    goto/16 :goto_c

    .line 594
    .line 595
    :cond_1f
    const/4 v14, 0x0

    .line 596
    const/16 v10, 0x12

    .line 597
    .line 598
    if-lt v9, v10, :cond_20

    .line 599
    .line 600
    instance-of v15, v7, Landroid/media/NotProvisionedException;

    .line 601
    .line 602
    if-eqz v15, :cond_20

    .line 603
    .line 604
    new-instance v10, LD9/n;

    .line 605
    .line 606
    const/16 v15, 0x18

    .line 607
    .line 608
    invoke-direct {v10, v15, v14, v13}, LD9/n;-><init>(III)V

    .line 609
    .line 610
    .line 611
    goto/16 :goto_c

    .line 612
    .line 613
    :cond_20
    if-lt v9, v10, :cond_21

    .line 614
    .line 615
    instance-of v9, v7, Landroid/media/DeniedByServerException;

    .line 616
    .line 617
    if-eqz v9, :cond_21

    .line 618
    .line 619
    new-instance v10, LD9/n;

    .line 620
    .line 621
    const/16 v2, 0x1d

    .line 622
    .line 623
    invoke-direct {v10, v2, v14, v13}, LD9/n;-><init>(III)V

    .line 624
    .line 625
    .line 626
    goto/16 :goto_c

    .line 627
    .line 628
    :cond_21
    instance-of v9, v7, LI5/k;

    .line 629
    .line 630
    if-eqz v9, :cond_22

    .line 631
    .line 632
    new-instance v10, LD9/n;

    .line 633
    .line 634
    invoke-direct {v10, v2, v14, v13}, LD9/n;-><init>(III)V

    .line 635
    .line 636
    .line 637
    goto/16 :goto_c

    .line 638
    .line 639
    :cond_22
    instance-of v2, v7, LI5/a;

    .line 640
    .line 641
    if-eqz v2, :cond_23

    .line 642
    .line 643
    new-instance v10, LD9/n;

    .line 644
    .line 645
    const/16 v2, 0x1c

    .line 646
    .line 647
    invoke-direct {v10, v2, v14, v13}, LD9/n;-><init>(III)V

    .line 648
    .line 649
    .line 650
    goto/16 :goto_c

    .line 651
    .line 652
    :cond_23
    new-instance v10, LD9/n;

    .line 653
    .line 654
    const/16 v2, 0x1e

    .line 655
    .line 656
    invoke-direct {v10, v2, v14, v13}, LD9/n;-><init>(III)V

    .line 657
    .line 658
    .line 659
    goto/16 :goto_c

    .line 660
    .line 661
    :cond_24
    instance-of v2, v9, Lt6/u;

    .line 662
    .line 663
    if-eqz v2, :cond_26

    .line 664
    .line 665
    invoke-virtual {v9}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    instance-of v2, v2, Ljava/io/FileNotFoundException;

    .line 670
    .line 671
    if-eqz v2, :cond_26

    .line 672
    .line 673
    invoke-virtual {v9}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 674
    .line 675
    .line 676
    move-result-object v2

    .line 677
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    sget v7, Lu6/v;->a:I

    .line 685
    .line 686
    if-lt v7, v13, :cond_25

    .line 687
    .line 688
    instance-of v7, v2, Landroid/system/ErrnoException;

    .line 689
    .line 690
    if-eqz v7, :cond_25

    .line 691
    .line 692
    check-cast v2, Landroid/system/ErrnoException;

    .line 693
    .line 694
    iget v2, v2, Landroid/system/ErrnoException;->errno:I

    .line 695
    .line 696
    sget v7, Landroid/system/OsConstants;->EACCES:I

    .line 697
    .line 698
    if-ne v2, v7, :cond_25

    .line 699
    .line 700
    new-instance v10, LD9/n;

    .line 701
    .line 702
    const/16 v2, 0x20

    .line 703
    .line 704
    const/4 v13, 0x0

    .line 705
    const/4 v14, 0x1

    .line 706
    invoke-direct {v10, v2, v13, v14}, LD9/n;-><init>(III)V

    .line 707
    .line 708
    .line 709
    goto/16 :goto_c

    .line 710
    .line 711
    :cond_25
    const/4 v13, 0x0

    .line 712
    const/4 v14, 0x1

    .line 713
    new-instance v10, LD9/n;

    .line 714
    .line 715
    const/16 v2, 0x1f

    .line 716
    .line 717
    invoke-direct {v10, v2, v13, v14}, LD9/n;-><init>(III)V

    .line 718
    .line 719
    .line 720
    goto/16 :goto_c

    .line 721
    .line 722
    :cond_26
    const/4 v13, 0x0

    .line 723
    const/4 v14, 0x1

    .line 724
    new-instance v10, LD9/n;

    .line 725
    .line 726
    const/16 v2, 0x9

    .line 727
    .line 728
    invoke-direct {v10, v2, v13, v14}, LD9/n;-><init>(III)V

    .line 729
    .line 730
    .line 731
    :goto_10
    move/from16 v19, v2

    .line 732
    .line 733
    const/16 v8, 0xd

    .line 734
    .line 735
    const/16 v16, 0x8

    .line 736
    .line 737
    const/16 v17, 0x7

    .line 738
    .line 739
    const/16 v18, 0x6

    .line 740
    .line 741
    goto/16 :goto_18

    .line 742
    .line 743
    :goto_11
    iget-object v10, v5, LF5/j;->a:Landroid/content/Context;

    .line 744
    .line 745
    invoke-static {v10}, Lu6/o;->b(Landroid/content/Context;)Lu6/o;

    .line 746
    .line 747
    .line 748
    move-result-object v10

    .line 749
    invoke-virtual {v10}, Lu6/o;->c()I

    .line 750
    .line 751
    .line 752
    move-result v10

    .line 753
    if-ne v10, v14, :cond_27

    .line 754
    .line 755
    new-instance v10, LD9/n;

    .line 756
    .line 757
    const/4 v7, 0x3

    .line 758
    invoke-direct {v10, v7, v13, v14}, LD9/n;-><init>(III)V

    .line 759
    .line 760
    .line 761
    goto :goto_10

    .line 762
    :cond_27
    invoke-virtual {v9}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 763
    .line 764
    .line 765
    move-result-object v10

    .line 766
    instance-of v15, v10, Ljava/net/UnknownHostException;

    .line 767
    .line 768
    if-eqz v15, :cond_28

    .line 769
    .line 770
    new-instance v10, LD9/n;

    .line 771
    .line 772
    const/4 v15, 0x6

    .line 773
    invoke-direct {v10, v15, v13, v14}, LD9/n;-><init>(III)V

    .line 774
    .line 775
    .line 776
    move/from16 v19, v2

    .line 777
    .line 778
    move/from16 v18, v15

    .line 779
    .line 780
    const/16 v8, 0xd

    .line 781
    .line 782
    const/16 v16, 0x8

    .line 783
    .line 784
    const/16 v17, 0x7

    .line 785
    .line 786
    goto/16 :goto_18

    .line 787
    .line 788
    :cond_28
    const/4 v15, 0x6

    .line 789
    instance-of v10, v10, Ljava/net/SocketTimeoutException;

    .line 790
    .line 791
    if-eqz v10, :cond_29

    .line 792
    .line 793
    new-instance v10, LD9/n;

    .line 794
    .line 795
    const/4 v7, 0x7

    .line 796
    invoke-direct {v10, v7, v13, v14}, LD9/n;-><init>(III)V

    .line 797
    .line 798
    .line 799
    move/from16 v19, v2

    .line 800
    .line 801
    move/from16 v17, v7

    .line 802
    .line 803
    :goto_12
    move/from16 v18, v15

    .line 804
    .line 805
    const/16 v8, 0xd

    .line 806
    .line 807
    const/16 v16, 0x8

    .line 808
    .line 809
    goto/16 :goto_18

    .line 810
    .line 811
    :cond_29
    const/16 v17, 0x7

    .line 812
    .line 813
    if-eqz v7, :cond_2a

    .line 814
    .line 815
    check-cast v9, Lt6/x;

    .line 816
    .line 817
    iget v7, v9, Lt6/x;->c:I

    .line 818
    .line 819
    if-ne v7, v14, :cond_2a

    .line 820
    .line 821
    new-instance v10, LD9/n;

    .line 822
    .line 823
    const/4 v7, 0x4

    .line 824
    invoke-direct {v10, v7, v13, v14}, LD9/n;-><init>(III)V

    .line 825
    .line 826
    .line 827
    move/from16 v19, v2

    .line 828
    .line 829
    goto :goto_12

    .line 830
    :cond_2a
    new-instance v10, LD9/n;

    .line 831
    .line 832
    const/16 v7, 0x8

    .line 833
    .line 834
    invoke-direct {v10, v7, v13, v14}, LD9/n;-><init>(III)V

    .line 835
    .line 836
    .line 837
    move/from16 v19, v2

    .line 838
    .line 839
    move/from16 v16, v7

    .line 840
    .line 841
    move/from16 v18, v15

    .line 842
    .line 843
    :goto_13
    const/16 v8, 0xd

    .line 844
    .line 845
    goto/16 :goto_18

    .line 846
    .line 847
    :goto_14
    new-instance v10, LD9/n;

    .line 848
    .line 849
    if-eqz v15, :cond_2b

    .line 850
    .line 851
    const/16 v9, 0xa

    .line 852
    .line 853
    goto :goto_15

    .line 854
    :cond_2b
    const/16 v9, 0xb

    .line 855
    .line 856
    :goto_15
    invoke-direct {v10, v9, v13, v14}, LD9/n;-><init>(III)V

    .line 857
    .line 858
    .line 859
    move/from16 v19, v2

    .line 860
    .line 861
    move/from16 v16, v7

    .line 862
    .line 863
    goto :goto_13

    .line 864
    :cond_2c
    const/4 v7, 0x1

    .line 865
    const/4 v10, 0x0

    .line 866
    const/16 v15, 0x18

    .line 867
    .line 868
    const/16 v16, 0x8

    .line 869
    .line 870
    const/16 v17, 0x7

    .line 871
    .line 872
    const/16 v18, 0x6

    .line 873
    .line 874
    const/16 v19, 0x9

    .line 875
    .line 876
    const/16 v22, 0x1c

    .line 877
    .line 878
    if-eqz v13, :cond_2e

    .line 879
    .line 880
    if-eqz v14, :cond_2d

    .line 881
    .line 882
    if-ne v14, v7, :cond_2e

    .line 883
    .line 884
    :cond_2d
    new-instance v2, LD9/n;

    .line 885
    .line 886
    const/16 v9, 0x23

    .line 887
    .line 888
    invoke-direct {v2, v9, v10, v7}, LD9/n;-><init>(III)V

    .line 889
    .line 890
    .line 891
    :goto_16
    move-object v10, v2

    .line 892
    goto :goto_13

    .line 893
    :cond_2e
    if-eqz v13, :cond_2f

    .line 894
    .line 895
    const/4 v8, 0x3

    .line 896
    if-ne v14, v8, :cond_2f

    .line 897
    .line 898
    new-instance v2, LD9/n;

    .line 899
    .line 900
    const/16 v8, 0xf

    .line 901
    .line 902
    invoke-direct {v2, v8, v10, v7}, LD9/n;-><init>(III)V

    .line 903
    .line 904
    .line 905
    goto :goto_16

    .line 906
    :cond_2f
    if-eqz v13, :cond_30

    .line 907
    .line 908
    const/4 v8, 0x2

    .line 909
    if-ne v14, v8, :cond_30

    .line 910
    .line 911
    new-instance v8, LD9/n;

    .line 912
    .line 913
    invoke-direct {v8, v2, v10, v7}, LD9/n;-><init>(III)V

    .line 914
    .line 915
    .line 916
    move-object v10, v8

    .line 917
    goto :goto_13

    .line 918
    :cond_30
    instance-of v2, v9, LV5/p;

    .line 919
    .line 920
    if-eqz v2, :cond_31

    .line 921
    .line 922
    check-cast v9, LV5/p;

    .line 923
    .line 924
    iget-object v2, v9, LV5/p;->d:Ljava/lang/String;

    .line 925
    .line 926
    invoke-static {v2}, Lu6/v;->m(Ljava/lang/String;)I

    .line 927
    .line 928
    .line 929
    move-result v2

    .line 930
    new-instance v10, LD9/n;

    .line 931
    .line 932
    const/16 v8, 0xd

    .line 933
    .line 934
    invoke-direct {v10, v8, v2, v7}, LD9/n;-><init>(III)V

    .line 935
    .line 936
    .line 937
    goto/16 :goto_18

    .line 938
    .line 939
    :cond_31
    const/16 v8, 0xd

    .line 940
    .line 941
    instance-of v2, v9, LV5/l;

    .line 942
    .line 943
    const/16 v10, 0xe

    .line 944
    .line 945
    if-eqz v2, :cond_32

    .line 946
    .line 947
    check-cast v9, LV5/l;

    .line 948
    .line 949
    iget-object v2, v9, LV5/l;->a:Ljava/lang/String;

    .line 950
    .line 951
    invoke-static {v2}, Lu6/v;->m(Ljava/lang/String;)I

    .line 952
    .line 953
    .line 954
    move-result v2

    .line 955
    new-instance v9, LD9/n;

    .line 956
    .line 957
    invoke-direct {v9, v10, v2, v7}, LD9/n;-><init>(III)V

    .line 958
    .line 959
    .line 960
    move-object v10, v9

    .line 961
    goto :goto_18

    .line 962
    :cond_32
    instance-of v2, v9, Ljava/lang/OutOfMemoryError;

    .line 963
    .line 964
    if-eqz v2, :cond_33

    .line 965
    .line 966
    new-instance v2, LD9/n;

    .line 967
    .line 968
    const/4 v13, 0x0

    .line 969
    invoke-direct {v2, v10, v13, v7}, LD9/n;-><init>(III)V

    .line 970
    .line 971
    .line 972
    move-object v10, v2

    .line 973
    goto :goto_18

    .line 974
    :cond_33
    instance-of v2, v9, LG5/r;

    .line 975
    .line 976
    if-eqz v2, :cond_34

    .line 977
    .line 978
    check-cast v9, LG5/r;

    .line 979
    .line 980
    new-instance v10, LD9/n;

    .line 981
    .line 982
    const/16 v2, 0x11

    .line 983
    .line 984
    iget v9, v9, LG5/r;->a:I

    .line 985
    .line 986
    invoke-direct {v10, v2, v9, v7}, LD9/n;-><init>(III)V

    .line 987
    .line 988
    .line 989
    goto :goto_18

    .line 990
    :cond_34
    instance-of v2, v9, LG5/s;

    .line 991
    .line 992
    if-eqz v2, :cond_35

    .line 993
    .line 994
    check-cast v9, LG5/s;

    .line 995
    .line 996
    new-instance v10, LD9/n;

    .line 997
    .line 998
    iget v2, v9, LG5/s;->a:I

    .line 999
    .line 1000
    const/16 v9, 0x12

    .line 1001
    .line 1002
    invoke-direct {v10, v9, v2, v7}, LD9/n;-><init>(III)V

    .line 1003
    .line 1004
    .line 1005
    goto :goto_18

    .line 1006
    :cond_35
    sget v2, Lu6/v;->a:I

    .line 1007
    .line 1008
    const/16 v7, 0x10

    .line 1009
    .line 1010
    if-lt v2, v7, :cond_36

    .line 1011
    .line 1012
    instance-of v2, v9, Landroid/media/MediaCodec$CryptoException;

    .line 1013
    .line 1014
    if-eqz v2, :cond_36

    .line 1015
    .line 1016
    check-cast v9, Landroid/media/MediaCodec$CryptoException;

    .line 1017
    .line 1018
    invoke-virtual {v9}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 1019
    .line 1020
    .line 1021
    move-result v2

    .line 1022
    invoke-static {v2}, Lu6/v;->l(I)I

    .line 1023
    .line 1024
    .line 1025
    move-result v7

    .line 1026
    packed-switch v7, :pswitch_data_1

    .line 1027
    .line 1028
    .line 1029
    const/16 v15, 0x1b

    .line 1030
    .line 1031
    goto :goto_17

    .line 1032
    :pswitch_4
    move/from16 v15, v21

    .line 1033
    .line 1034
    goto :goto_17

    .line 1035
    :pswitch_5
    move/from16 v15, v20

    .line 1036
    .line 1037
    goto :goto_17

    .line 1038
    :pswitch_6
    move/from16 v15, v22

    .line 1039
    .line 1040
    :goto_17
    :pswitch_7
    new-instance v10, LD9/n;

    .line 1041
    .line 1042
    const/4 v7, 0x1

    .line 1043
    invoke-direct {v10, v15, v2, v7}, LD9/n;-><init>(III)V

    .line 1044
    .line 1045
    .line 1046
    goto :goto_18

    .line 1047
    :cond_36
    const/4 v7, 0x1

    .line 1048
    new-instance v10, LD9/n;

    .line 1049
    .line 1050
    const/16 v2, 0x16

    .line 1051
    .line 1052
    const/4 v13, 0x0

    .line 1053
    invoke-direct {v10, v2, v13, v7}, LD9/n;-><init>(III)V

    .line 1054
    .line 1055
    .line 1056
    :goto_18
    iget-object v2, v5, LF5/j;->c:Landroid/media/metrics/PlaybackSession;

    .line 1057
    .line 1058
    invoke-static {}, LV1/g;->e()Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v7

    .line 1062
    iget-wide v13, v5, LF5/j;->d:J

    .line 1063
    .line 1064
    sub-long v13, v11, v13

    .line 1065
    .line 1066
    invoke-static {v7, v13, v14}, LV1/g;->g(Landroid/media/metrics/PlaybackErrorEvent$Builder;J)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v7

    .line 1070
    iget v9, v10, LD9/n;->b:I

    .line 1071
    .line 1072
    invoke-static {v7, v9}, LV1/g;->f(Landroid/media/metrics/PlaybackErrorEvent$Builder;I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v7

    .line 1076
    iget v9, v10, LD9/n;->c:I

    .line 1077
    .line 1078
    invoke-static {v7, v9}, LV1/g;->t(Landroid/media/metrics/PlaybackErrorEvent$Builder;I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v7

    .line 1082
    invoke-static {v7, v3}, LF5/i;->h(Landroid/media/metrics/PlaybackErrorEvent$Builder;LE5/o;)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v3

    .line 1086
    invoke-static {v3}, LV1/g;->i(Landroid/media/metrics/PlaybackErrorEvent$Builder;)Landroid/media/metrics/PlaybackErrorEvent;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v3

    .line 1090
    invoke-static {v2, v3}, LV1/g;->o(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackErrorEvent;)V

    .line 1091
    .line 1092
    .line 1093
    const/4 v7, 0x1

    .line 1094
    iput-boolean v7, v5, LF5/j;->A:Z

    .line 1095
    .line 1096
    const/4 v2, 0x0

    .line 1097
    iput-object v2, v5, LF5/j;->n:LE5/o;

    .line 1098
    .line 1099
    :goto_19
    iget-object v2, v0, Lu6/e;->a:Landroid/util/SparseBooleanArray;

    .line 1100
    .line 1101
    const/4 v3, 0x2

    .line 1102
    invoke-virtual {v2, v3}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 1103
    .line 1104
    .line 1105
    move-result v2

    .line 1106
    if-eqz v2, :cond_3d

    .line 1107
    .line 1108
    invoke-virtual {v4}, LE5/I;->p0()LE5/L0;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v2

    .line 1112
    invoke-virtual {v2, v3}, LE5/L0;->a(I)Z

    .line 1113
    .line 1114
    .line 1115
    move-result v9

    .line 1116
    invoke-virtual {v2, v7}, LE5/L0;->a(I)Z

    .line 1117
    .line 1118
    .line 1119
    move-result v3

    .line 1120
    const/4 v7, 0x3

    .line 1121
    invoke-virtual {v2, v7}, LE5/L0;->a(I)Z

    .line 1122
    .line 1123
    .line 1124
    move-result v2

    .line 1125
    if-nez v9, :cond_37

    .line 1126
    .line 1127
    if-nez v3, :cond_37

    .line 1128
    .line 1129
    if-eqz v2, :cond_3d

    .line 1130
    .line 1131
    :cond_37
    if-nez v9, :cond_39

    .line 1132
    .line 1133
    iget-object v7, v5, LF5/j;->r:LE5/T;

    .line 1134
    .line 1135
    const/4 v9, 0x0

    .line 1136
    invoke-static {v7, v9}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1137
    .line 1138
    .line 1139
    move-result v7

    .line 1140
    if-eqz v7, :cond_38

    .line 1141
    .line 1142
    goto :goto_1a

    .line 1143
    :cond_38
    iput-object v9, v5, LF5/j;->r:LE5/T;

    .line 1144
    .line 1145
    const/4 v7, 0x1

    .line 1146
    invoke-virtual {v5, v7, v11, v12, v9}, LF5/j;->e(IJLE5/T;)V

    .line 1147
    .line 1148
    .line 1149
    goto :goto_1a

    .line 1150
    :cond_39
    const/4 v9, 0x0

    .line 1151
    :goto_1a
    if-nez v3, :cond_3b

    .line 1152
    .line 1153
    iget-object v3, v5, LF5/j;->s:LE5/T;

    .line 1154
    .line 1155
    invoke-static {v3, v9}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1156
    .line 1157
    .line 1158
    move-result v3

    .line 1159
    if-eqz v3, :cond_3a

    .line 1160
    .line 1161
    goto :goto_1b

    .line 1162
    :cond_3a
    iput-object v9, v5, LF5/j;->s:LE5/T;

    .line 1163
    .line 1164
    const/4 v13, 0x0

    .line 1165
    invoke-virtual {v5, v13, v11, v12, v9}, LF5/j;->e(IJLE5/T;)V

    .line 1166
    .line 1167
    .line 1168
    :cond_3b
    :goto_1b
    if-nez v2, :cond_3d

    .line 1169
    .line 1170
    iget-object v2, v5, LF5/j;->t:LE5/T;

    .line 1171
    .line 1172
    invoke-static {v2, v9}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1173
    .line 1174
    .line 1175
    move-result v2

    .line 1176
    if-eqz v2, :cond_3c

    .line 1177
    .line 1178
    goto :goto_1c

    .line 1179
    :cond_3c
    iput-object v9, v5, LF5/j;->t:LE5/T;

    .line 1180
    .line 1181
    const/4 v3, 0x2

    .line 1182
    invoke-virtual {v5, v3, v11, v12, v9}, LF5/j;->e(IJLE5/T;)V

    .line 1183
    .line 1184
    .line 1185
    :cond_3d
    :goto_1c
    iget-object v2, v5, LF5/j;->o:LS3/e;

    .line 1186
    .line 1187
    invoke-virtual {v5, v2}, LF5/j;->a(LS3/e;)Z

    .line 1188
    .line 1189
    .line 1190
    move-result v2

    .line 1191
    if-eqz v2, :cond_3f

    .line 1192
    .line 1193
    iget-object v2, v5, LF5/j;->o:LS3/e;

    .line 1194
    .line 1195
    iget-object v2, v2, LS3/e;->b:Ljava/lang/Object;

    .line 1196
    .line 1197
    check-cast v2, LE5/T;

    .line 1198
    .line 1199
    iget v3, v2, LE5/T;->r:I

    .line 1200
    .line 1201
    const/4 v7, -0x1

    .line 1202
    if-eq v3, v7, :cond_3f

    .line 1203
    .line 1204
    iget-object v3, v5, LF5/j;->r:LE5/T;

    .line 1205
    .line 1206
    invoke-static {v3, v2}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1207
    .line 1208
    .line 1209
    move-result v3

    .line 1210
    if-eqz v3, :cond_3e

    .line 1211
    .line 1212
    :goto_1d
    const/4 v2, 0x0

    .line 1213
    goto :goto_1e

    .line 1214
    :cond_3e
    iput-object v2, v5, LF5/j;->r:LE5/T;

    .line 1215
    .line 1216
    const/4 v7, 0x1

    .line 1217
    invoke-virtual {v5, v7, v11, v12, v2}, LF5/j;->e(IJLE5/T;)V

    .line 1218
    .line 1219
    .line 1220
    goto :goto_1d

    .line 1221
    :goto_1e
    iput-object v2, v5, LF5/j;->o:LS3/e;

    .line 1222
    .line 1223
    :cond_3f
    iget-object v2, v5, LF5/j;->p:LS3/e;

    .line 1224
    .line 1225
    invoke-virtual {v5, v2}, LF5/j;->a(LS3/e;)Z

    .line 1226
    .line 1227
    .line 1228
    move-result v2

    .line 1229
    if-eqz v2, :cond_41

    .line 1230
    .line 1231
    iget-object v2, v5, LF5/j;->p:LS3/e;

    .line 1232
    .line 1233
    iget-object v2, v2, LS3/e;->b:Ljava/lang/Object;

    .line 1234
    .line 1235
    check-cast v2, LE5/T;

    .line 1236
    .line 1237
    iget-object v3, v5, LF5/j;->s:LE5/T;

    .line 1238
    .line 1239
    invoke-static {v3, v2}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1240
    .line 1241
    .line 1242
    move-result v3

    .line 1243
    if-eqz v3, :cond_40

    .line 1244
    .line 1245
    :goto_1f
    const/4 v2, 0x0

    .line 1246
    goto :goto_20

    .line 1247
    :cond_40
    iput-object v2, v5, LF5/j;->s:LE5/T;

    .line 1248
    .line 1249
    const/4 v13, 0x0

    .line 1250
    invoke-virtual {v5, v13, v11, v12, v2}, LF5/j;->e(IJLE5/T;)V

    .line 1251
    .line 1252
    .line 1253
    goto :goto_1f

    .line 1254
    :goto_20
    iput-object v2, v5, LF5/j;->p:LS3/e;

    .line 1255
    .line 1256
    :cond_41
    iget-object v2, v5, LF5/j;->q:LS3/e;

    .line 1257
    .line 1258
    invoke-virtual {v5, v2}, LF5/j;->a(LS3/e;)Z

    .line 1259
    .line 1260
    .line 1261
    move-result v2

    .line 1262
    if-eqz v2, :cond_43

    .line 1263
    .line 1264
    iget-object v2, v5, LF5/j;->q:LS3/e;

    .line 1265
    .line 1266
    iget-object v2, v2, LS3/e;->b:Ljava/lang/Object;

    .line 1267
    .line 1268
    check-cast v2, LE5/T;

    .line 1269
    .line 1270
    iget-object v3, v5, LF5/j;->t:LE5/T;

    .line 1271
    .line 1272
    invoke-static {v3, v2}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1273
    .line 1274
    .line 1275
    move-result v3

    .line 1276
    if-eqz v3, :cond_42

    .line 1277
    .line 1278
    :goto_21
    const/4 v2, 0x0

    .line 1279
    goto :goto_22

    .line 1280
    :cond_42
    iput-object v2, v5, LF5/j;->t:LE5/T;

    .line 1281
    .line 1282
    const/4 v3, 0x2

    .line 1283
    invoke-virtual {v5, v3, v11, v12, v2}, LF5/j;->e(IJLE5/T;)V

    .line 1284
    .line 1285
    .line 1286
    goto :goto_21

    .line 1287
    :goto_22
    iput-object v2, v5, LF5/j;->q:LS3/e;

    .line 1288
    .line 1289
    :cond_43
    iget-object v2, v5, LF5/j;->a:Landroid/content/Context;

    .line 1290
    .line 1291
    invoke-static {v2}, Lu6/o;->b(Landroid/content/Context;)Lu6/o;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v2

    .line 1295
    invoke-virtual {v2}, Lu6/o;->c()I

    .line 1296
    .line 1297
    .line 1298
    move-result v2

    .line 1299
    packed-switch v2, :pswitch_data_2

    .line 1300
    .line 1301
    .line 1302
    :pswitch_8
    const/4 v2, 0x1

    .line 1303
    goto :goto_23

    .line 1304
    :pswitch_9
    move/from16 v2, v17

    .line 1305
    .line 1306
    goto :goto_23

    .line 1307
    :pswitch_a
    move/from16 v2, v16

    .line 1308
    .line 1309
    goto :goto_23

    .line 1310
    :pswitch_b
    const/4 v2, 0x3

    .line 1311
    goto :goto_23

    .line 1312
    :pswitch_c
    move/from16 v2, v18

    .line 1313
    .line 1314
    goto :goto_23

    .line 1315
    :pswitch_d
    const/4 v2, 0x5

    .line 1316
    goto :goto_23

    .line 1317
    :pswitch_e
    const/4 v2, 0x4

    .line 1318
    goto :goto_23

    .line 1319
    :pswitch_f
    const/4 v2, 0x2

    .line 1320
    goto :goto_23

    .line 1321
    :pswitch_10
    move/from16 v2, v19

    .line 1322
    .line 1323
    goto :goto_23

    .line 1324
    :pswitch_11
    const/4 v2, 0x0

    .line 1325
    :goto_23
    iget v3, v5, LF5/j;->m:I

    .line 1326
    .line 1327
    if-eq v2, v3, :cond_44

    .line 1328
    .line 1329
    iput v2, v5, LF5/j;->m:I

    .line 1330
    .line 1331
    iget-object v3, v5, LF5/j;->c:Landroid/media/metrics/PlaybackSession;

    .line 1332
    .line 1333
    invoke-static {}, LV1/g;->a()Landroid/media/metrics/NetworkEvent$Builder;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v7

    .line 1337
    invoke-static {v7, v2}, LV1/g;->b(Landroid/media/metrics/NetworkEvent$Builder;I)Landroid/media/metrics/NetworkEvent$Builder;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v2

    .line 1341
    iget-wide v9, v5, LF5/j;->d:J

    .line 1342
    .line 1343
    sub-long v9, v11, v9

    .line 1344
    .line 1345
    invoke-static {v2, v9, v10}, LV1/g;->c(Landroid/media/metrics/NetworkEvent$Builder;J)Landroid/media/metrics/NetworkEvent$Builder;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v2

    .line 1349
    invoke-static {v2}, LV1/g;->d(Landroid/media/metrics/NetworkEvent$Builder;)Landroid/media/metrics/NetworkEvent;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v2

    .line 1353
    invoke-static {v3, v2}, LV1/g;->n(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/NetworkEvent;)V

    .line 1354
    .line 1355
    .line 1356
    :cond_44
    invoke-virtual {v4}, LE5/I;->t0()I

    .line 1357
    .line 1358
    .line 1359
    move-result v2

    .line 1360
    const/4 v3, 0x2

    .line 1361
    const/4 v13, 0x0

    .line 1362
    if-eq v2, v3, :cond_45

    .line 1363
    .line 1364
    iput-boolean v13, v5, LF5/j;->u:Z

    .line 1365
    .line 1366
    :cond_45
    invoke-virtual {v4}, LE5/I;->Q0()V

    .line 1367
    .line 1368
    .line 1369
    iget-object v2, v4, LE5/I;->j0:LE5/q0;

    .line 1370
    .line 1371
    iget-object v2, v2, LE5/q0;->f:LE5/o;

    .line 1372
    .line 1373
    if-nez v2, :cond_46

    .line 1374
    .line 1375
    iput-boolean v13, v5, LF5/j;->w:Z

    .line 1376
    .line 1377
    const/16 v3, 0xa

    .line 1378
    .line 1379
    goto :goto_24

    .line 1380
    :cond_46
    iget-object v2, v0, Lu6/e;->a:Landroid/util/SparseBooleanArray;

    .line 1381
    .line 1382
    const/16 v3, 0xa

    .line 1383
    .line 1384
    invoke-virtual {v2, v3}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 1385
    .line 1386
    .line 1387
    move-result v2

    .line 1388
    if-eqz v2, :cond_47

    .line 1389
    .line 1390
    const/4 v7, 0x1

    .line 1391
    iput-boolean v7, v5, LF5/j;->w:Z

    .line 1392
    .line 1393
    :cond_47
    :goto_24
    invoke-virtual {v4}, LE5/I;->t0()I

    .line 1394
    .line 1395
    .line 1396
    move-result v2

    .line 1397
    iget-boolean v7, v5, LF5/j;->u:Z

    .line 1398
    .line 1399
    if-eqz v7, :cond_48

    .line 1400
    .line 1401
    const/4 v9, 0x5

    .line 1402
    goto :goto_26

    .line 1403
    :cond_48
    iget-boolean v7, v5, LF5/j;->w:Z

    .line 1404
    .line 1405
    if-eqz v7, :cond_4a

    .line 1406
    .line 1407
    :cond_49
    :goto_25
    move v9, v8

    .line 1408
    goto :goto_26

    .line 1409
    :cond_4a
    const/4 v7, 0x4

    .line 1410
    if-ne v2, v7, :cond_4b

    .line 1411
    .line 1412
    const/16 v9, 0xb

    .line 1413
    .line 1414
    goto :goto_26

    .line 1415
    :cond_4b
    const/4 v8, 0x2

    .line 1416
    if-ne v2, v8, :cond_4f

    .line 1417
    .line 1418
    iget v2, v5, LF5/j;->l:I

    .line 1419
    .line 1420
    if-eqz v2, :cond_49

    .line 1421
    .line 1422
    if-ne v2, v8, :cond_4c

    .line 1423
    .line 1424
    goto :goto_25

    .line 1425
    :cond_4c
    invoke-virtual {v4}, LE5/I;->s0()Z

    .line 1426
    .line 1427
    .line 1428
    move-result v2

    .line 1429
    if-nez v2, :cond_4d

    .line 1430
    .line 1431
    move/from16 v9, v17

    .line 1432
    .line 1433
    goto :goto_26

    .line 1434
    :cond_4d
    invoke-virtual {v4}, LE5/I;->Q0()V

    .line 1435
    .line 1436
    .line 1437
    iget-object v2, v4, LE5/I;->j0:LE5/q0;

    .line 1438
    .line 1439
    iget v2, v2, LE5/q0;->m:I

    .line 1440
    .line 1441
    if-eqz v2, :cond_4e

    .line 1442
    .line 1443
    move v9, v3

    .line 1444
    goto :goto_26

    .line 1445
    :cond_4e
    move/from16 v9, v18

    .line 1446
    .line 1447
    goto :goto_26

    .line 1448
    :cond_4f
    const/4 v8, 0x3

    .line 1449
    if-ne v2, v8, :cond_51

    .line 1450
    .line 1451
    invoke-virtual {v4}, LE5/I;->s0()Z

    .line 1452
    .line 1453
    .line 1454
    move-result v2

    .line 1455
    if-nez v2, :cond_50

    .line 1456
    .line 1457
    move v9, v7

    .line 1458
    goto :goto_26

    .line 1459
    :cond_50
    invoke-virtual {v4}, LE5/I;->Q0()V

    .line 1460
    .line 1461
    .line 1462
    iget-object v2, v4, LE5/I;->j0:LE5/q0;

    .line 1463
    .line 1464
    iget v2, v2, LE5/q0;->m:I

    .line 1465
    .line 1466
    if-eqz v2, :cond_49

    .line 1467
    .line 1468
    move/from16 v9, v19

    .line 1469
    .line 1470
    goto :goto_26

    .line 1471
    :cond_51
    const/4 v7, 0x1

    .line 1472
    if-ne v2, v7, :cond_52

    .line 1473
    .line 1474
    iget v2, v5, LF5/j;->l:I

    .line 1475
    .line 1476
    if-eqz v2, :cond_52

    .line 1477
    .line 1478
    const/16 v9, 0xc

    .line 1479
    .line 1480
    goto :goto_26

    .line 1481
    :cond_52
    iget v9, v5, LF5/j;->l:I

    .line 1482
    .line 1483
    :goto_26
    iget v2, v5, LF5/j;->l:I

    .line 1484
    .line 1485
    if-eq v2, v9, :cond_53

    .line 1486
    .line 1487
    iput v9, v5, LF5/j;->l:I

    .line 1488
    .line 1489
    const/4 v7, 0x1

    .line 1490
    iput-boolean v7, v5, LF5/j;->A:Z

    .line 1491
    .line 1492
    iget-object v2, v5, LF5/j;->c:Landroid/media/metrics/PlaybackSession;

    .line 1493
    .line 1494
    invoke-static {}, LV1/h;->i()Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v3

    .line 1498
    iget v4, v5, LF5/j;->l:I

    .line 1499
    .line 1500
    invoke-static {v3, v4}, LV1/h;->j(Landroid/media/metrics/PlaybackStateEvent$Builder;I)Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v3

    .line 1504
    iget-wide v7, v5, LF5/j;->d:J

    .line 1505
    .line 1506
    sub-long/2addr v11, v7

    .line 1507
    invoke-static {v3, v11, v12}, LV1/h;->k(Landroid/media/metrics/PlaybackStateEvent$Builder;J)Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v3

    .line 1511
    invoke-static {v3}, LV1/h;->l(Landroid/media/metrics/PlaybackStateEvent$Builder;)Landroid/media/metrics/PlaybackStateEvent;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v3

    .line 1515
    invoke-static {v2, v3}, LV1/h;->s(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackStateEvent;)V

    .line 1516
    .line 1517
    .line 1518
    :cond_53
    iget-object v0, v0, Lu6/e;->a:Landroid/util/SparseBooleanArray;

    .line 1519
    .line 1520
    const/16 v2, 0x404

    .line 1521
    .line 1522
    invoke-virtual {v0, v2}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 1523
    .line 1524
    .line 1525
    move-result v0

    .line 1526
    if-eqz v0, :cond_54

    .line 1527
    .line 1528
    iget-object v0, v5, LF5/j;->b:LF5/h;

    .line 1529
    .line 1530
    invoke-virtual {v6, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v2

    .line 1534
    check-cast v2, LF5/a;

    .line 1535
    .line 1536
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1537
    .line 1538
    .line 1539
    invoke-virtual {v0, v2}, LF5/h;->a(LF5/a;)V

    .line 1540
    .line 1541
    .line 1542
    :cond_54
    :goto_27
    return-void

    .line 1543
    :pswitch_data_0
    .packed-switch 0x1772
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    :pswitch_data_1
    .packed-switch 0x1772
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_8
        :pswitch_b
        :pswitch_8
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    const/4 v0, 0x5

    .line 2
    const-wide/16 v1, 0x1

    .line 3
    .line 4
    const/4 v3, 0x2

    .line 5
    const/4 v4, 0x0

    .line 6
    const/4 v5, 0x1

    .line 7
    iget v6, p0, LA5/h;->a:I

    .line 8
    .line 9
    sparse-switch v6, :sswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, LJ9/O;

    .line 13
    .line 14
    invoke-static {p1}, LJ9/O;->h(LJ9/O;)LJ9/N;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, LJ9/N;->a()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, LJ9/O;->getValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    add-long/2addr v3, v1

    .line 26
    invoke-virtual {v0, v3, v4}, LJ9/N;->c(J)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, LJ9/O;

    .line 34
    .line 35
    iget-object v0, p0, LA5/h;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, LJ9/S;

    .line 38
    .line 39
    invoke-static {v0}, LJ9/S;->e(LJ9/S;)LJ9/P;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, LA5/h;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, LN9/b;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p1}, LJ9/P;->a(LJ9/O;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, LJ9/S;

    .line 58
    .line 59
    return-object p1

    .line 60
    :sswitch_0
    iget-object v0, p0, LA5/h;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, LJ9/C;

    .line 63
    .line 64
    iget-object v3, p0, LA5/h;->c:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v3, Lta/f;

    .line 67
    .line 68
    check-cast p1, LJ9/d;

    .line 69
    .line 70
    iget-object v6, v0, LJ9/C;->e:LJ9/c;

    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    const-string v0, "Fetching campaigns from service."

    .line 76
    .line 77
    invoke-static {v0}, Lic/d;->F(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, v6, LJ9/c;->d:LJ9/J;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    :try_start_0
    iget-object v0, v0, LJ9/J;->a:Landroid/app/Application;

    .line 86
    .line 87
    invoke-static {v0}, LD7/a;->a(Landroid/content/Context;)V
    :try_end_0
    .catch Ld7/g; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ld7/h; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :catch_0
    move-exception v0

    .line 92
    goto :goto_0

    .line 93
    :catch_1
    move-exception v0

    .line 94
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 95
    .line 96
    .line 97
    :goto_1
    iget-object v0, v6, LJ9/c;->a:Ldf/a;

    .line 98
    .line 99
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    move-object v7, v0

    .line 104
    check-cast v7, LJ9/q;

    .line 105
    .line 106
    invoke-static {}, Lta/l;->g()Lta/k;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    iget-object v0, v6, LJ9/c;->b:Ls8/g;

    .line 111
    .line 112
    invoke-virtual {v0}, Ls8/g;->a()V

    .line 113
    .line 114
    .line 115
    iget-object v0, v0, Ls8/g;->c:Ls8/l;

    .line 116
    .line 117
    iget-object v0, v0, Ls8/l;->e:Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v8, v0}, Lta/k;->c(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3}, Lta/f;->c()Lcom/google/protobuf/Internal$ProtobufList;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v8, v0}, Lta/k;->a(Lcom/google/protobuf/Internal$ProtobufList;)V

    .line 127
    .line 128
    .line 129
    invoke-static {}, Lr8/c;->f()Lr8/b;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 134
    .line 135
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v3, v0}, Lr8/b;->c(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {v0}, Ljava/util/Locale;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v3, v0}, Lr8/b;->b(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v3, v0}, Lr8/b;->d(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    iget-object v0, v6, LJ9/c;->c:Landroid/app/Application;

    .line 165
    .line 166
    const/4 v9, 0x0

    .line 167
    :try_start_1
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v10, v0, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_2

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :catch_2
    move-exception v0

    .line 183
    new-instance v10, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    const-string v11, "Error finding versionName : "

    .line 186
    .line 187
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    const-string v10, "FIAM.Headless"

    .line 202
    .line 203
    invoke-static {v10, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 204
    .line 205
    .line 206
    move-object v0, v9

    .line 207
    :goto_2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 208
    .line 209
    .line 210
    move-result v10

    .line 211
    if-nez v10, :cond_0

    .line 212
    .line 213
    invoke-virtual {v3, v0}, Lr8/b;->a(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    :cond_0
    invoke-virtual {v3}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    check-cast v0, Lr8/c;

    .line 221
    .line 222
    invoke-virtual {v8, v0}, Lta/k;->b(Lr8/c;)V

    .line 223
    .line 224
    .line 225
    invoke-static {}, Lta/i;->e()Lta/h;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    iget-object v3, v6, LJ9/c;->b:Ls8/g;

    .line 230
    .line 231
    invoke-virtual {v3}, Ls8/g;->a()V

    .line 232
    .line 233
    .line 234
    iget-object v3, v3, Ls8/g;->c:Ls8/l;

    .line 235
    .line 236
    iget-object v3, v3, Ls8/l;->b:Ljava/lang/String;

    .line 237
    .line 238
    invoke-virtual {v0, v3}, Lta/h;->c(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    iget-object v3, p1, LJ9/d;->a:Ljava/lang/String;

    .line 242
    .line 243
    invoke-virtual {v0, v3}, Lta/h;->a(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    iget-object p1, p1, LJ9/d;->b:LP9/a;

    .line 247
    .line 248
    iget-object p1, p1, LP9/a;->a:Ljava/lang/String;

    .line 249
    .line 250
    invoke-virtual {v0, p1}, Lta/h;->b(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    check-cast p1, Lta/i;

    .line 258
    .line 259
    invoke-virtual {v8, p1}, Lta/k;->d(Lta/i;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v8}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    check-cast p1, Lta/l;

    .line 267
    .line 268
    iget-object v0, v7, LJ9/q;->a:Lta/p;

    .line 269
    .line 270
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 271
    .line 272
    iget-object v6, v0, LJ4/d;->c:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v6, Lmd/c;

    .line 275
    .line 276
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    if-eqz v3, :cond_8

    .line 280
    .line 281
    new-instance v7, Lmd/r;

    .line 282
    .line 283
    const-wide/16 v10, 0x7530

    .line 284
    .line 285
    invoke-virtual {v3, v10, v11}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 286
    .line 287
    .line 288
    move-result-wide v10

    .line 289
    invoke-direct {v7, v10, v11}, Lmd/r;-><init>(J)V

    .line 290
    .line 291
    .line 292
    invoke-static {v6}, Lmd/c;->b(Lmd/c;)LR8/a;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    iput-object v7, v3, LR8/a;->a:Ljava/lang/Object;

    .line 297
    .line 298
    new-instance v6, Lmd/c;

    .line 299
    .line 300
    invoke-direct {v6, v3}, Lmd/c;-><init>(LR8/a;)V

    .line 301
    .line 302
    .line 303
    iget-object v0, v0, LJ4/d;->b:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v0, Lmd/d;

    .line 306
    .line 307
    const-string v3, "channel"

    .line 308
    .line 309
    invoke-static {v0, v3}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    sget-object v3, Lff/B;->a:LF6/r;

    .line 313
    .line 314
    if-nez v3, :cond_2

    .line 315
    .line 316
    const-class v7, Lff/B;

    .line 317
    .line 318
    monitor-enter v7

    .line 319
    :try_start_2
    sget-object v3, Lff/B;->a:LF6/r;

    .line 320
    .line 321
    if-nez v3, :cond_1

    .line 322
    .line 323
    invoke-static {}, LF6/r;->d()LM/y;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    sget-object v8, Lmd/c0;->a:Lmd/c0;

    .line 328
    .line 329
    iput-object v8, v3, LM/y;->d:Ljava/lang/Object;

    .line 330
    .line 331
    const-string v8, "google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServing"

    .line 332
    .line 333
    const-string v10, "FetchEligibleCampaigns"

    .line 334
    .line 335
    invoke-static {v8, v10}, LF6/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v8

    .line 339
    iput-object v8, v3, LM/y;->e:Ljava/lang/Object;

    .line 340
    .line 341
    iput-boolean v5, v3, LM/y;->a:Z

    .line 342
    .line 343
    invoke-static {}, Lta/l;->f()Lta/l;

    .line 344
    .line 345
    .line 346
    move-result-object v8

    .line 347
    sget-object v10, Ltd/c;->a:Lcom/google/protobuf/ExtensionRegistryLite;

    .line 348
    .line 349
    new-instance v10, Ltd/b;

    .line 350
    .line 351
    invoke-direct {v10, v8}, Ltd/b;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 352
    .line 353
    .line 354
    iput-object v10, v3, LM/y;->b:Ljava/lang/Object;

    .line 355
    .line 356
    invoke-static {}, Lta/o;->c()Lta/o;

    .line 357
    .line 358
    .line 359
    move-result-object v8

    .line 360
    new-instance v10, Ltd/b;

    .line 361
    .line 362
    invoke-direct {v10, v8}, Ltd/b;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 363
    .line 364
    .line 365
    iput-object v10, v3, LM/y;->c:Ljava/lang/Object;

    .line 366
    .line 367
    invoke-virtual {v3}, LM/y;->d()LF6/r;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    sput-object v3, Lff/B;->a:LF6/r;

    .line 372
    .line 373
    goto :goto_3

    .line 374
    :catchall_0
    move-exception v0

    .line 375
    move-object p1, v0

    .line 376
    goto :goto_4

    .line 377
    :cond_1
    :goto_3
    monitor-exit v7

    .line 378
    goto :goto_5

    .line 379
    :goto_4
    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 380
    throw p1

    .line 381
    :cond_2
    :goto_5
    sget-object v7, Lud/e;->a:Ljava/util/logging/Logger;

    .line 382
    .line 383
    new-instance v7, Lud/c;

    .line 384
    .line 385
    invoke-direct {v7}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 386
    .line 387
    .line 388
    sget-object v8, Lud/b;->a:Lud/b;

    .line 389
    .line 390
    sget-object v10, Lud/e;->c:LB8/e;

    .line 391
    .line 392
    invoke-virtual {v6, v10, v8}, Lmd/c;->c(LB8/e;Ljava/lang/Object;)Lmd/c;

    .line 393
    .line 394
    .line 395
    move-result-object v6

    .line 396
    invoke-static {v6}, Lmd/c;->b(Lmd/c;)LR8/a;

    .line 397
    .line 398
    .line 399
    move-result-object v6

    .line 400
    iput-object v7, v6, LR8/a;->b:Ljava/lang/Object;

    .line 401
    .line 402
    new-instance v8, Lmd/c;

    .line 403
    .line 404
    invoke-direct {v8, v6}, Lmd/c;-><init>(LR8/a;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v0, v3, v8}, Lmd/d;->h(LF6/r;Lmd/c;)Lmd/f;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    :try_start_3
    invoke-static {v3, p1}, Lud/e;->b(Lmd/f;Lta/l;)Lud/a;

    .line 412
    .line 413
    .line 414
    move-result-object p1

    .line 415
    :goto_6
    invoke-virtual {p1}, Lp8/m;->isDone()Z

    .line 416
    .line 417
    .line 418
    move-result v0
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 419
    if-nez v0, :cond_3

    .line 420
    .line 421
    :try_start_4
    invoke-virtual {v7}, Lud/c;->b()V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 422
    .line 423
    .line 424
    goto :goto_6

    .line 425
    :catchall_1
    move-exception v0

    .line 426
    move-object p1, v0

    .line 427
    goto/16 :goto_a

    .line 428
    .line 429
    :catch_3
    move-exception v0

    .line 430
    :goto_7
    move-object p1, v0

    .line 431
    goto/16 :goto_9

    .line 432
    .line 433
    :catch_4
    move-exception v0

    .line 434
    goto :goto_7

    .line 435
    :catch_5
    move-exception v0

    .line 436
    :try_start_5
    const-string v4, "Thread interrupted"

    .line 437
    .line 438
    invoke-virtual {v3, v4, v0}, Lmd/f;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_7
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_6
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 439
    .line 440
    .line 441
    move v4, v5

    .line 442
    goto :goto_6

    .line 443
    :catchall_2
    move-exception v0

    .line 444
    move-object p1, v0

    .line 445
    move v4, v5

    .line 446
    goto :goto_a

    .line 447
    :catch_6
    move-exception v0

    .line 448
    :goto_8
    move-object p1, v0

    .line 449
    move v4, v5

    .line 450
    goto :goto_9

    .line 451
    :catch_7
    move-exception v0

    .line 452
    goto :goto_8

    .line 453
    :cond_3
    :try_start_6
    invoke-virtual {v7}, Lud/c;->shutdown()V

    .line 454
    .line 455
    .line 456
    invoke-static {p1}, Lud/e;->c(Lud/a;)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object p1
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 460
    if-eqz v4, :cond_4

    .line 461
    .line 462
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 467
    .line 468
    .line 469
    :cond_4
    check-cast p1, Lta/o;

    .line 470
    .line 471
    invoke-virtual {p1}, Lta/o;->d()J

    .line 472
    .line 473
    .line 474
    move-result-wide v3

    .line 475
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 476
    .line 477
    .line 478
    move-result-wide v5

    .line 479
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 480
    .line 481
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 482
    .line 483
    .line 484
    move-result-wide v7

    .line 485
    add-long/2addr v7, v5

    .line 486
    cmp-long v0, v3, v7

    .line 487
    .line 488
    if-ltz v0, :cond_5

    .line 489
    .line 490
    invoke-virtual {p1}, Lta/o;->d()J

    .line 491
    .line 492
    .line 493
    move-result-wide v3

    .line 494
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 495
    .line 496
    .line 497
    move-result-wide v5

    .line 498
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 499
    .line 500
    const-wide/16 v7, 0x3

    .line 501
    .line 502
    invoke-virtual {v0, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 503
    .line 504
    .line 505
    move-result-wide v7

    .line 506
    add-long/2addr v7, v5

    .line 507
    cmp-long v0, v3, v7

    .line 508
    .line 509
    if-lez v0, :cond_6

    .line 510
    .line 511
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    .line 512
    .line 513
    .line 514
    move-result-object p1

    .line 515
    check-cast p1, Lta/n;

    .line 516
    .line 517
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 518
    .line 519
    .line 520
    move-result-wide v3

    .line 521
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 522
    .line 523
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 524
    .line 525
    .line 526
    move-result-wide v0

    .line 527
    add-long/2addr v0, v3

    .line 528
    invoke-virtual {p1, v0, v1}, Lta/n;->a(J)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 532
    .line 533
    .line 534
    move-result-object p1

    .line 535
    check-cast p1, Lta/o;

    .line 536
    .line 537
    :cond_6
    return-object p1

    .line 538
    :goto_9
    :try_start_7
    invoke-static {v3, p1}, Lud/e;->a(Lmd/f;Ljava/lang/Throwable;)V

    .line 539
    .line 540
    .line 541
    throw v9
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 542
    :goto_a
    if-eqz v4, :cond_7

    .line 543
    .line 544
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 549
    .line 550
    .line 551
    :cond_7
    throw p1

    .line 552
    :cond_8
    sget-object p1, Lmd/r;->d:Lmd/j;

    .line 553
    .line 554
    new-instance p1, Ljava/lang/NullPointerException;

    .line 555
    .line 556
    const-string v0, "units"

    .line 557
    .line 558
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    throw p1

    .line 562
    :sswitch_1
    check-cast p1, Lta/f;

    .line 563
    .line 564
    iget-object v6, p0, LA5/h;->b:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast v6, LJ9/C;

    .line 567
    .line 568
    iget-object v7, v6, LJ9/C;->n:LJ9/i;

    .line 569
    .line 570
    invoke-virtual {v7}, LJ9/i;->a()Z

    .line 571
    .line 572
    .line 573
    move-result v7

    .line 574
    if-nez v7, :cond_9

    .line 575
    .line 576
    const-string p1, "Automatic data collection is disabled, not attempting campaign fetch from service."

    .line 577
    .line 578
    invoke-static {p1}, Lic/d;->F(Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    invoke-static {}, Lta/o;->f()Lta/n;

    .line 582
    .line 583
    .line 584
    move-result-object p1

    .line 585
    invoke-virtual {p1, v1, v2}, Lta/n;->a(J)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 589
    .line 590
    .line 591
    move-result-object p1

    .line 592
    check-cast p1, Lta/o;

    .line 593
    .line 594
    invoke-static {p1}, LHe/g;->a(Ljava/lang/Object;)LHe/g;

    .line 595
    .line 596
    .line 597
    move-result-object p1

    .line 598
    goto/16 :goto_b

    .line 599
    .line 600
    :cond_9
    new-instance v7, LF5/d;

    .line 601
    .line 602
    const/16 v8, 0x17

    .line 603
    .line 604
    invoke-direct {v7, v8}, LF5/d;-><init>(I)V

    .line 605
    .line 606
    .line 607
    iget-object v8, p0, LA5/h;->c:Ljava/lang/Object;

    .line 608
    .line 609
    check-cast v8, LHe/g;

    .line 610
    .line 611
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    new-instance v9, LSe/g;

    .line 615
    .line 616
    invoke-direct {v9, v8, v7, v4}, LSe/g;-><init>(LHe/g;Ljava/lang/Object;I)V

    .line 617
    .line 618
    .line 619
    new-instance v7, LA5/h;

    .line 620
    .line 621
    const/16 v8, 0xc

    .line 622
    .line 623
    invoke-direct {v7, v8, v6, p1}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    new-instance p1, LSe/j;

    .line 627
    .line 628
    invoke-direct {p1, v9, v7, v5}, LSe/j;-><init>(LHe/g;LLe/c;I)V

    .line 629
    .line 630
    .line 631
    invoke-static {}, Lta/o;->f()Lta/n;

    .line 632
    .line 633
    .line 634
    move-result-object v5

    .line 635
    invoke-virtual {v5, v1, v2}, Lta/n;->a(J)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v5}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 639
    .line 640
    .line 641
    move-result-object v1

    .line 642
    check-cast v1, Lta/o;

    .line 643
    .line 644
    invoke-static {v1}, LHe/g;->a(Ljava/lang/Object;)LHe/g;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    invoke-virtual {p1, v1}, LHe/g;->d(LHe/g;)LHe/g;

    .line 649
    .line 650
    .line 651
    move-result-object p1

    .line 652
    new-instance v1, LF5/d;

    .line 653
    .line 654
    const/16 v2, 0x18

    .line 655
    .line 656
    invoke-direct {v1, v2}, LF5/d;-><init>(I)V

    .line 657
    .line 658
    .line 659
    new-instance v2, LSe/r;

    .line 660
    .line 661
    sget-object v5, LNe/b;->d:Lya/b;

    .line 662
    .line 663
    invoke-direct {v2, p1, v1, v5}, LSe/r;-><init>(LHe/g;LLe/b;LLe/b;)V

    .line 664
    .line 665
    .line 666
    new-instance p1, LJ9/w;

    .line 667
    .line 668
    invoke-direct {p1, v6, v4}, LJ9/w;-><init>(LJ9/C;I)V

    .line 669
    .line 670
    .line 671
    new-instance v1, LSe/r;

    .line 672
    .line 673
    invoke-direct {v1, v2, p1, v5}, LSe/r;-><init>(LHe/g;LLe/b;LLe/b;)V

    .line 674
    .line 675
    .line 676
    iget-object p1, v6, LJ9/C;->j:LJ9/b;

    .line 677
    .line 678
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    new-instance v2, LB8/b;

    .line 682
    .line 683
    const/16 v4, 0xe

    .line 684
    .line 685
    invoke-direct {v2, p1, v4}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 686
    .line 687
    .line 688
    new-instance p1, LSe/r;

    .line 689
    .line 690
    invoke-direct {p1, v1, v2, v5}, LSe/r;-><init>(LHe/g;LLe/b;LLe/b;)V

    .line 691
    .line 692
    .line 693
    iget-object v1, v6, LJ9/C;->k:LJ9/Z;

    .line 694
    .line 695
    invoke-static {v1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    new-instance v2, LB8/b;

    .line 699
    .line 700
    const/16 v4, 0xf

    .line 701
    .line 702
    invoke-direct {v2, v1, v4}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 703
    .line 704
    .line 705
    new-instance v1, LSe/r;

    .line 706
    .line 707
    invoke-direct {v1, p1, v2, v5}, LSe/r;-><init>(LHe/g;LLe/b;LLe/b;)V

    .line 708
    .line 709
    .line 710
    new-instance p1, LF5/d;

    .line 711
    .line 712
    const/16 v2, 0x19

    .line 713
    .line 714
    invoke-direct {p1, v2}, LF5/d;-><init>(I)V

    .line 715
    .line 716
    .line 717
    new-instance v2, LSe/r;

    .line 718
    .line 719
    invoke-direct {v2, v1, v5, p1}, LSe/r;-><init>(LHe/g;LLe/b;LLe/b;)V

    .line 720
    .line 721
    .line 722
    sget-object p1, LSe/e;->a:LSe/e;

    .line 723
    .line 724
    new-instance v1, LA7/h0;

    .line 725
    .line 726
    invoke-direct {v1, p1, v0}, LA7/h0;-><init>(Ljava/lang/Object;I)V

    .line 727
    .line 728
    .line 729
    new-instance p1, LSe/j;

    .line 730
    .line 731
    invoke-direct {p1, v2, v1, v3}, LSe/j;-><init>(LHe/g;LLe/c;I)V

    .line 732
    .line 733
    .line 734
    :goto_b
    return-object p1

    .line 735
    :sswitch_2
    check-cast p1, Lta/f;

    .line 736
    .line 737
    iget-object v1, p0, LA5/h;->b:Ljava/lang/Object;

    .line 738
    .line 739
    check-cast v1, LJ9/u;

    .line 740
    .line 741
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 742
    .line 743
    .line 744
    new-instance v2, Ljava/lang/StringBuilder;

    .line 745
    .line 746
    const-string v4, "Existing impressions: "

    .line 747
    .line 748
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 749
    .line 750
    .line 751
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite;->toString()Ljava/lang/String;

    .line 752
    .line 753
    .line 754
    move-result-object v4

    .line 755
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v2

    .line 762
    invoke-static {v2}, Lic/d;->E(Ljava/lang/String;)V

    .line 763
    .line 764
    .line 765
    invoke-static {}, Lta/f;->e()Lta/e;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    invoke-virtual {p1}, Lta/f;->c()Lcom/google/protobuf/Internal$ProtobufList;

    .line 770
    .line 771
    .line 772
    move-result-object p1

    .line 773
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 774
    .line 775
    .line 776
    move-result-object p1

    .line 777
    :cond_a
    :goto_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 778
    .line 779
    .line 780
    move-result v4

    .line 781
    if-eqz v4, :cond_b

    .line 782
    .line 783
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v4

    .line 787
    check-cast v4, Lta/c;

    .line 788
    .line 789
    invoke-virtual {v4}, Lta/c;->d()Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v6

    .line 793
    iget-object v7, p0, LA5/h;->c:Ljava/lang/Object;

    .line 794
    .line 795
    check-cast v7, Ljava/util/HashSet;

    .line 796
    .line 797
    invoke-virtual {v7, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 798
    .line 799
    .line 800
    move-result v6

    .line 801
    if-nez v6, :cond_a

    .line 802
    .line 803
    invoke-virtual {v2, v4}, Lta/e;->a(Lta/c;)V

    .line 804
    .line 805
    .line 806
    goto :goto_c

    .line 807
    :cond_b
    invoke-virtual {v2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 808
    .line 809
    .line 810
    move-result-object p1

    .line 811
    check-cast p1, Lta/f;

    .line 812
    .line 813
    new-instance v2, Ljava/lang/StringBuilder;

    .line 814
    .line 815
    const-string v4, "New cleared impression list: "

    .line 816
    .line 817
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite;->toString()Ljava/lang/String;

    .line 821
    .line 822
    .line 823
    move-result-object v4

    .line 824
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 825
    .line 826
    .line 827
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 828
    .line 829
    .line 830
    move-result-object v2

    .line 831
    invoke-static {v2}, Lic/d;->E(Ljava/lang/String;)V

    .line 832
    .line 833
    .line 834
    iget-object v2, v1, LJ9/u;->a:LJ9/I;

    .line 835
    .line 836
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 837
    .line 838
    .line 839
    new-instance v4, LB8/c;

    .line 840
    .line 841
    invoke-direct {v4, v0, v2, p1}, LB8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 842
    .line 843
    .line 844
    new-instance v0, LQe/b;

    .line 845
    .line 846
    invoke-direct {v0, v4, v3}, LQe/b;-><init>(Ljava/lang/Object;I)V

    .line 847
    .line 848
    .line 849
    new-instance v2, LJ9/t;

    .line 850
    .line 851
    invoke-direct {v2, v1, p1, v5}, LJ9/t;-><init>(LJ9/u;Lta/f;I)V

    .line 852
    .line 853
    .line 854
    invoke-virtual {v0, v2}, LHe/a;->b(LLe/a;)LQe/e;

    .line 855
    .line 856
    .line 857
    move-result-object p1

    .line 858
    return-object p1

    .line 859
    :sswitch_3
    check-cast p1, Lta/f;

    .line 860
    .line 861
    iget-object v1, p0, LA5/h;->b:Ljava/lang/Object;

    .line 862
    .line 863
    check-cast v1, LJ9/u;

    .line 864
    .line 865
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 866
    .line 867
    .line 868
    invoke-static {p1}, Lta/f;->f(Lta/f;)Lta/e;

    .line 869
    .line 870
    .line 871
    move-result-object p1

    .line 872
    iget-object v2, p0, LA5/h;->c:Ljava/lang/Object;

    .line 873
    .line 874
    check-cast v2, Lta/c;

    .line 875
    .line 876
    invoke-virtual {p1, v2}, Lta/e;->a(Lta/c;)V

    .line 877
    .line 878
    .line 879
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 880
    .line 881
    .line 882
    move-result-object p1

    .line 883
    check-cast p1, Lta/f;

    .line 884
    .line 885
    iget-object v2, v1, LJ9/u;->a:LJ9/I;

    .line 886
    .line 887
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 888
    .line 889
    .line 890
    new-instance v5, LB8/c;

    .line 891
    .line 892
    invoke-direct {v5, v0, v2, p1}, LB8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 893
    .line 894
    .line 895
    new-instance v0, LQe/b;

    .line 896
    .line 897
    invoke-direct {v0, v5, v3}, LQe/b;-><init>(Ljava/lang/Object;I)V

    .line 898
    .line 899
    .line 900
    new-instance v2, LJ9/t;

    .line 901
    .line 902
    invoke-direct {v2, v1, p1, v4}, LJ9/t;-><init>(LJ9/u;Lta/f;I)V

    .line 903
    .line 904
    .line 905
    invoke-virtual {v0, v2}, LHe/a;->b(LLe/a;)LQe/e;

    .line 906
    .line 907
    .line 908
    move-result-object p1

    .line 909
    return-object p1

    .line 910
    :sswitch_4
    move-object v6, p1

    .line 911
    check-cast v6, Landroid/database/sqlite/SQLiteDatabase;

    .line 912
    .line 913
    iget-object p1, p0, LA5/h;->b:Ljava/lang/Object;

    .line 914
    .line 915
    check-cast p1, LA5/m;

    .line 916
    .line 917
    iget-object v0, p1, LA5/m;->d:LA5/a;

    .line 918
    .line 919
    iget v1, v0, LA5/a;->b:I

    .line 920
    .line 921
    iget-object v2, p0, LA5/h;->c:Ljava/lang/Object;

    .line 922
    .line 923
    check-cast v2, Lt5/i;

    .line 924
    .line 925
    invoke-virtual {p1, v6, v2, v1}, LA5/m;->h(Landroid/database/sqlite/SQLiteDatabase;Lt5/i;I)Ljava/util/ArrayList;

    .line 926
    .line 927
    .line 928
    move-result-object v1

    .line 929
    invoke-static {}, Lq5/e;->values()[Lq5/e;

    .line 930
    .line 931
    .line 932
    move-result-object v7

    .line 933
    array-length v8, v7

    .line 934
    move v9, v4

    .line 935
    :goto_d
    if-ge v9, v8, :cond_e

    .line 936
    .line 937
    aget-object v10, v7, v9

    .line 938
    .line 939
    iget-object v11, v2, Lt5/i;->c:Lq5/e;

    .line 940
    .line 941
    if-ne v10, v11, :cond_c

    .line 942
    .line 943
    goto :goto_e

    .line 944
    :cond_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 945
    .line 946
    .line 947
    move-result v11

    .line 948
    iget v12, v0, LA5/a;->b:I

    .line 949
    .line 950
    sub-int/2addr v12, v11

    .line 951
    if-gtz v12, :cond_d

    .line 952
    .line 953
    goto :goto_f

    .line 954
    :cond_d
    invoke-virtual {v2, v10}, Lt5/i;->b(Lq5/e;)Lt5/i;

    .line 955
    .line 956
    .line 957
    move-result-object v10

    .line 958
    invoke-virtual {p1, v6, v10, v12}, LA5/m;->h(Landroid/database/sqlite/SQLiteDatabase;Lt5/i;I)Ljava/util/ArrayList;

    .line 959
    .line 960
    .line 961
    move-result-object v10

    .line 962
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 963
    .line 964
    .line 965
    :goto_e
    add-int/2addr v9, v5

    .line 966
    goto :goto_d

    .line 967
    :cond_e
    :goto_f
    new-instance p1, Ljava/util/HashMap;

    .line 968
    .line 969
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 970
    .line 971
    .line 972
    new-instance v0, Ljava/lang/StringBuilder;

    .line 973
    .line 974
    const-string v2, "event_id IN ("

    .line 975
    .line 976
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 977
    .line 978
    .line 979
    move v2, v4

    .line 980
    :goto_10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 981
    .line 982
    .line 983
    move-result v7

    .line 984
    if-ge v2, v7, :cond_10

    .line 985
    .line 986
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v7

    .line 990
    check-cast v7, LA5/b;

    .line 991
    .line 992
    iget-wide v7, v7, LA5/b;->a:J

    .line 993
    .line 994
    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 995
    .line 996
    .line 997
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 998
    .line 999
    .line 1000
    move-result v7

    .line 1001
    sub-int/2addr v7, v5

    .line 1002
    if-ge v2, v7, :cond_f

    .line 1003
    .line 1004
    const/16 v7, 0x2c

    .line 1005
    .line 1006
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1007
    .line 1008
    .line 1009
    :cond_f
    add-int/2addr v2, v5

    .line 1010
    goto :goto_10

    .line 1011
    :cond_10
    const/16 v2, 0x29

    .line 1012
    .line 1013
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1014
    .line 1015
    .line 1016
    const-string v2, "value"

    .line 1017
    .line 1018
    const-string v7, "event_id"

    .line 1019
    .line 1020
    const-string v8, "name"

    .line 1021
    .line 1022
    filled-new-array {v7, v8, v2}, [Ljava/lang/String;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v8

    .line 1026
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v9

    .line 1030
    const/4 v12, 0x0

    .line 1031
    const/4 v13, 0x0

    .line 1032
    const-string v7, "event_metadata"

    .line 1033
    .line 1034
    const/4 v10, 0x0

    .line 1035
    const/4 v11, 0x0

    .line 1036
    invoke-virtual/range {v6 .. v13}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v2

    .line 1040
    :goto_11
    :try_start_8
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 1041
    .line 1042
    .line 1043
    move-result v0

    .line 1044
    if-eqz v0, :cond_12

    .line 1045
    .line 1046
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 1047
    .line 1048
    .line 1049
    move-result-wide v6

    .line 1050
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v0

    .line 1054
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v0

    .line 1058
    check-cast v0, Ljava/util/Set;

    .line 1059
    .line 1060
    if-nez v0, :cond_11

    .line 1061
    .line 1062
    new-instance v0, Ljava/util/HashSet;

    .line 1063
    .line 1064
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 1065
    .line 1066
    .line 1067
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v6

    .line 1071
    invoke-virtual {p1, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1072
    .line 1073
    .line 1074
    :cond_11
    new-instance v6, LA5/l;

    .line 1075
    .line 1076
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v7

    .line 1080
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v8

    .line 1084
    invoke-direct {v6, v7, v8}, LA5/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1085
    .line 1086
    .line 1087
    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 1088
    .line 1089
    .line 1090
    goto :goto_11

    .line 1091
    :cond_12
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v1}, Ljava/util/ArrayList;->listIterator()Ljava/util/ListIterator;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v0

    .line 1098
    :goto_12
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 1099
    .line 1100
    .line 1101
    move-result v2

    .line 1102
    if-eqz v2, :cond_15

    .line 1103
    .line 1104
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v2

    .line 1108
    check-cast v2, LA5/b;

    .line 1109
    .line 1110
    iget-wide v3, v2, LA5/b;->a:J

    .line 1111
    .line 1112
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v3

    .line 1116
    invoke-virtual {p1, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 1117
    .line 1118
    .line 1119
    move-result v3

    .line 1120
    if-nez v3, :cond_13

    .line 1121
    .line 1122
    goto :goto_12

    .line 1123
    :cond_13
    iget-object v3, v2, LA5/b;->c:Lt5/h;

    .line 1124
    .line 1125
    invoke-virtual {v3}, Lt5/h;->c()Lcom/bumptech/glide/f;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v3

    .line 1129
    iget-wide v4, v2, LA5/b;->a:J

    .line 1130
    .line 1131
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v6

    .line 1135
    invoke-virtual {p1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v6

    .line 1139
    check-cast v6, Ljava/util/Set;

    .line 1140
    .line 1141
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v6

    .line 1145
    :goto_13
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1146
    .line 1147
    .line 1148
    move-result v7

    .line 1149
    if-eqz v7, :cond_14

    .line 1150
    .line 1151
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v7

    .line 1155
    check-cast v7, LA5/l;

    .line 1156
    .line 1157
    iget-object v8, v7, LA5/l;->a:Ljava/lang/String;

    .line 1158
    .line 1159
    iget-object v7, v7, LA5/l;->b:Ljava/lang/String;

    .line 1160
    .line 1161
    invoke-virtual {v3, v8, v7}, Lcom/bumptech/glide/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1162
    .line 1163
    .line 1164
    goto :goto_13

    .line 1165
    :cond_14
    invoke-virtual {v3}, Lcom/bumptech/glide/f;->f()Lt5/h;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v3

    .line 1169
    new-instance v6, LA5/b;

    .line 1170
    .line 1171
    iget-object v2, v2, LA5/b;->b:Lt5/i;

    .line 1172
    .line 1173
    invoke-direct {v6, v4, v5, v2, v3}, LA5/b;-><init>(JLt5/i;Lt5/h;)V

    .line 1174
    .line 1175
    .line 1176
    invoke-interface {v0, v6}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    .line 1177
    .line 1178
    .line 1179
    goto :goto_12

    .line 1180
    :cond_15
    return-object v1

    .line 1181
    :catchall_3
    move-exception v0

    .line 1182
    move-object p1, v0

    .line 1183
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 1184
    .line 1185
    .line 1186
    throw p1

    .line 1187
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_4
        0x8 -> :sswitch_3
        0x9 -> :sswitch_2
        0xa -> :sswitch_1
        0xc -> :sswitch_0
    .end sparse-switch
.end method

.method public b(Ljava/lang/Object;LN1/l;)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x6

    .line 7
    iget-object v4, v1, LA5/h;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v4, LV1/d;

    .line 10
    .line 11
    iget-object v5, v1, LA5/h;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v5, LU1/u;

    .line 14
    .line 15
    move-object/from16 v6, p1

    .line 16
    .line 17
    check-cast v6, LV1/i;

    .line 18
    .line 19
    iget-object v4, v4, LV1/d;->e:Landroid/util/SparseArray;

    .line 20
    .line 21
    new-instance v12, Landroid/util/SparseArray;

    .line 22
    .line 23
    iget-object v7, v0, LN1/l;->a:Landroid/util/SparseBooleanArray;

    .line 24
    .line 25
    invoke-virtual {v7}, Landroid/util/SparseBooleanArray;->size()I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    invoke-direct {v12, v7}, Landroid/util/SparseArray;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const/4 v13, 0x0

    .line 33
    move v7, v13

    .line 34
    :goto_0
    iget-object v8, v0, LN1/l;->a:Landroid/util/SparseBooleanArray;

    .line 35
    .line 36
    invoke-virtual {v8}, Landroid/util/SparseBooleanArray;->size()I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    if-ge v7, v8, :cond_0

    .line 41
    .line 42
    invoke-virtual {v0, v7}, LN1/l;->a(I)I

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    invoke-virtual {v4, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    check-cast v9, LV1/a;

    .line 51
    .line 52
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v12, v8, v9}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    add-int/2addr v7, v2

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object v4, v0, LN1/l;->a:Landroid/util/SparseBooleanArray;

    .line 64
    .line 65
    invoke-virtual {v4}, Landroid/util/SparseBooleanArray;->size()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-nez v4, :cond_1

    .line 70
    .line 71
    goto/16 :goto_32

    .line 72
    .line 73
    :cond_1
    move v4, v13

    .line 74
    :goto_1
    iget-object v7, v0, LN1/l;->a:Landroid/util/SparseBooleanArray;

    .line 75
    .line 76
    invoke-virtual {v7}, Landroid/util/SparseBooleanArray;->size()I

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    const/16 v14, 0xb

    .line 81
    .line 82
    if-ge v4, v7, :cond_8

    .line 83
    .line 84
    invoke-virtual {v0, v4}, LN1/l;->a(I)I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    invoke-virtual {v12, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    check-cast v8, LV1/a;

    .line 93
    .line 94
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    if-nez v7, :cond_6

    .line 98
    .line 99
    iget-object v9, v6, LV1/i;->b:LV1/f;

    .line 100
    .line 101
    monitor-enter v9

    .line 102
    :try_start_0
    iget-object v7, v9, LV1/f;->d:LV1/i;

    .line 103
    .line 104
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object v7, v9, LV1/f;->e:LN1/N;

    .line 108
    .line 109
    iget-object v10, v8, LV1/a;->b:LN1/N;

    .line 110
    .line 111
    iput-object v10, v9, LV1/f;->e:LN1/N;

    .line 112
    .line 113
    iget-object v10, v9, LV1/f;->c:Ljava/util/HashMap;

    .line 114
    .line 115
    invoke-virtual {v10}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    invoke-interface {v10}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    :cond_2
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    if-eqz v11, :cond_5

    .line 128
    .line 129
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v11

    .line 133
    check-cast v11, LV1/e;

    .line 134
    .line 135
    iget-object v14, v9, LV1/f;->e:LN1/N;

    .line 136
    .line 137
    invoke-virtual {v11, v7, v14}, LV1/e;->b(LN1/N;LN1/N;)Z

    .line 138
    .line 139
    .line 140
    move-result v14

    .line 141
    if-eqz v14, :cond_3

    .line 142
    .line 143
    invoke-virtual {v11, v8}, LV1/e;->a(LV1/a;)Z

    .line 144
    .line 145
    .line 146
    move-result v14

    .line 147
    if-eqz v14, :cond_2

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :catchall_0
    move-exception v0

    .line 151
    goto :goto_4

    .line 152
    :cond_3
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->remove()V

    .line 153
    .line 154
    .line 155
    iget-boolean v14, v11, LV1/e;->e:Z

    .line 156
    .line 157
    if-eqz v14, :cond_2

    .line 158
    .line 159
    iget-object v14, v11, LV1/e;->a:Ljava/lang/String;

    .line 160
    .line 161
    iget-object v15, v9, LV1/f;->f:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v14

    .line 167
    if-eqz v14, :cond_4

    .line 168
    .line 169
    invoke-virtual {v9, v11}, LV1/f;->a(LV1/e;)V

    .line 170
    .line 171
    .line 172
    :cond_4
    iget-object v14, v9, LV1/f;->d:LV1/i;

    .line 173
    .line 174
    iget-object v11, v11, LV1/e;->a:Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {v14, v8, v11}, LV1/i;->d(LV1/a;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_5
    invoke-virtual {v9, v8}, LV1/f;->e(LV1/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    .line 182
    .line 183
    monitor-exit v9

    .line 184
    goto :goto_5

    .line 185
    :goto_4
    :try_start_1
    monitor-exit v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 186
    throw v0

    .line 187
    :cond_6
    if-ne v7, v14, :cond_7

    .line 188
    .line 189
    iget-object v7, v6, LV1/i;->b:LV1/f;

    .line 190
    .line 191
    iget v9, v6, LV1/i;->k:I

    .line 192
    .line 193
    invoke-virtual {v7, v8, v9}, LV1/f;->g(LV1/a;I)V

    .line 194
    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_7
    iget-object v7, v6, LV1/i;->b:LV1/f;

    .line 198
    .line 199
    invoke-virtual {v7, v8}, LV1/f;->f(LV1/a;)V

    .line 200
    .line 201
    .line 202
    :goto_5
    add-int/2addr v4, v2

    .line 203
    goto/16 :goto_1

    .line 204
    .line 205
    :cond_8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 206
    .line 207
    .line 208
    move-result-wide v8

    .line 209
    iget-object v4, v0, LN1/l;->a:Landroid/util/SparseBooleanArray;

    .line 210
    .line 211
    invoke-virtual {v4, v13}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-eqz v4, :cond_9

    .line 216
    .line 217
    invoke-virtual {v12, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    check-cast v4, LV1/a;

    .line 222
    .line 223
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    iget-object v7, v6, LV1/i;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 227
    .line 228
    if-eqz v7, :cond_9

    .line 229
    .line 230
    iget-object v7, v4, LV1/a;->b:LN1/N;

    .line 231
    .line 232
    iget-object v4, v4, LV1/a;->d:Lk2/H;

    .line 233
    .line 234
    invoke-virtual {v6, v7, v4}, LV1/i;->c(LN1/N;Lk2/H;)V

    .line 235
    .line 236
    .line 237
    :cond_9
    iget-object v4, v0, LN1/l;->a:Landroid/util/SparseBooleanArray;

    .line 238
    .line 239
    const/4 v15, 0x2

    .line 240
    invoke-virtual {v4, v15}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    if-eqz v4, :cond_11

    .line 245
    .line 246
    iget-object v4, v6, LV1/i;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 247
    .line 248
    if-eqz v4, :cond_11

    .line 249
    .line 250
    invoke-virtual {v5}, LU1/u;->S0()V

    .line 251
    .line 252
    .line 253
    iget-object v4, v5, LU1/u;->d0:LU1/P;

    .line 254
    .line 255
    iget-object v4, v4, LU1/P;->i:Ln2/t;

    .line 256
    .line 257
    iget-object v4, v4, Ln2/t;->d:LN1/V;

    .line 258
    .line 259
    iget-object v4, v4, LN1/V;->a:Ll8/K;

    .line 260
    .line 261
    invoke-virtual {v4, v13}, Ll8/K;->l(I)Ll8/I;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    :goto_6
    invoke-virtual {v4}, Ll8/I;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result v11

    .line 269
    if-eqz v11, :cond_c

    .line 270
    .line 271
    invoke-virtual {v4}, Ll8/I;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v11

    .line 275
    check-cast v11, LN1/U;

    .line 276
    .line 277
    move v14, v13

    .line 278
    :goto_7
    iget v10, v11, LN1/U;->a:I

    .line 279
    .line 280
    if-ge v14, v10, :cond_b

    .line 281
    .line 282
    iget-object v10, v11, LN1/U;->e:[Z

    .line 283
    .line 284
    aget-boolean v10, v10, v14

    .line 285
    .line 286
    if-eqz v10, :cond_a

    .line 287
    .line 288
    iget-object v10, v11, LN1/U;->b:LN1/O;

    .line 289
    .line 290
    iget-object v10, v10, LN1/O;->d:[LN1/n;

    .line 291
    .line 292
    aget-object v10, v10, v14

    .line 293
    .line 294
    iget-object v10, v10, LN1/n;->r:LN1/j;

    .line 295
    .line 296
    if-eqz v10, :cond_a

    .line 297
    .line 298
    goto :goto_8

    .line 299
    :cond_a
    add-int/2addr v14, v2

    .line 300
    goto :goto_7

    .line 301
    :cond_b
    const/16 v14, 0xb

    .line 302
    .line 303
    goto :goto_6

    .line 304
    :cond_c
    const/4 v10, 0x0

    .line 305
    :goto_8
    if-eqz v10, :cond_11

    .line 306
    .line 307
    iget-object v4, v6, LV1/i;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 308
    .line 309
    invoke-static {v4}, LV1/g;->k(Ljava/lang/Object;)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    move v11, v13

    .line 314
    :goto_9
    iget v14, v10, LN1/j;->d:I

    .line 315
    .line 316
    if-ge v11, v14, :cond_10

    .line 317
    .line 318
    iget-object v14, v10, LN1/j;->a:[LN1/i;

    .line 319
    .line 320
    aget-object v14, v14, v11

    .line 321
    .line 322
    iget-object v14, v14, LN1/i;->b:Ljava/util/UUID;

    .line 323
    .line 324
    sget-object v15, LN1/e;->d:Ljava/util/UUID;

    .line 325
    .line 326
    invoke-virtual {v14, v15}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v15

    .line 330
    if-eqz v15, :cond_d

    .line 331
    .line 332
    const/4 v10, 0x3

    .line 333
    goto :goto_a

    .line 334
    :cond_d
    sget-object v15, LN1/e;->e:Ljava/util/UUID;

    .line 335
    .line 336
    invoke-virtual {v14, v15}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v15

    .line 340
    if-eqz v15, :cond_e

    .line 341
    .line 342
    const/4 v10, 0x2

    .line 343
    goto :goto_a

    .line 344
    :cond_e
    sget-object v15, LN1/e;->c:Ljava/util/UUID;

    .line 345
    .line 346
    invoke-virtual {v14, v15}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v14

    .line 350
    if-eqz v14, :cond_f

    .line 351
    .line 352
    move v10, v3

    .line 353
    goto :goto_a

    .line 354
    :cond_f
    add-int/2addr v11, v2

    .line 355
    const/4 v15, 0x2

    .line 356
    goto :goto_9

    .line 357
    :cond_10
    move v10, v2

    .line 358
    :goto_a
    invoke-static {v4, v10}, LV1/g;->m(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 359
    .line 360
    .line 361
    :cond_11
    iget-object v4, v0, LN1/l;->a:Landroid/util/SparseBooleanArray;

    .line 362
    .line 363
    const/16 v10, 0x3f3

    .line 364
    .line 365
    invoke-virtual {v4, v10}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 366
    .line 367
    .line 368
    move-result v4

    .line 369
    if-eqz v4, :cond_12

    .line 370
    .line 371
    iget v4, v6, LV1/i;->z:I

    .line 372
    .line 373
    add-int/2addr v4, v2

    .line 374
    iput v4, v6, LV1/i;->z:I

    .line 375
    .line 376
    :cond_12
    iget-object v4, v6, LV1/i;->n:LN1/E;

    .line 377
    .line 378
    const/4 v14, 0x5

    .line 379
    const/4 v10, 0x4

    .line 380
    if-nez v4, :cond_13

    .line 381
    .line 382
    move/from16 v18, v10

    .line 383
    .line 384
    const/16 v3, 0xd

    .line 385
    .line 386
    const/16 v16, 0x8

    .line 387
    .line 388
    const/16 v17, 0x7

    .line 389
    .line 390
    const/16 v19, 0x9

    .line 391
    .line 392
    goto/16 :goto_1e

    .line 393
    .line 394
    :cond_13
    iget v11, v6, LV1/i;->v:I

    .line 395
    .line 396
    if-ne v11, v10, :cond_14

    .line 397
    .line 398
    move v11, v2

    .line 399
    goto :goto_b

    .line 400
    :cond_14
    move v11, v13

    .line 401
    :goto_b
    iget v10, v4, LN1/E;->a:I

    .line 402
    .line 403
    const/16 v7, 0x3e9

    .line 404
    .line 405
    if-ne v10, v7, :cond_15

    .line 406
    .line 407
    new-instance v7, LD9/n;

    .line 408
    .line 409
    const/16 v10, 0x14

    .line 410
    .line 411
    invoke-direct {v7, v10, v13, v3}, LD9/n;-><init>(III)V

    .line 412
    .line 413
    .line 414
    :goto_c
    move v13, v3

    .line 415
    :goto_d
    const/16 v3, 0xd

    .line 416
    .line 417
    const/16 v16, 0x8

    .line 418
    .line 419
    const/16 v17, 0x7

    .line 420
    .line 421
    const/16 v18, 0x4

    .line 422
    .line 423
    const/16 v19, 0x9

    .line 424
    .line 425
    goto/16 :goto_1d

    .line 426
    .line 427
    :cond_15
    instance-of v7, v4, LU1/j;

    .line 428
    .line 429
    if-eqz v7, :cond_17

    .line 430
    .line 431
    move-object v7, v4

    .line 432
    check-cast v7, LU1/j;

    .line 433
    .line 434
    iget v15, v7, LU1/j;->c:I

    .line 435
    .line 436
    if-ne v15, v2, :cond_16

    .line 437
    .line 438
    move v15, v2

    .line 439
    goto :goto_e

    .line 440
    :cond_16
    move v15, v13

    .line 441
    :goto_e
    iget v7, v7, LU1/j;->g:I

    .line 442
    .line 443
    goto :goto_f

    .line 444
    :cond_17
    move v7, v13

    .line 445
    move v15, v7

    .line 446
    :goto_f
    invoke-virtual {v4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    instance-of v13, v2, Ljava/io/IOException;

    .line 454
    .line 455
    const/16 v20, 0x19

    .line 456
    .line 457
    const/16 v21, 0x1a

    .line 458
    .line 459
    const/16 v3, 0x17

    .line 460
    .line 461
    if-eqz v13, :cond_2c

    .line 462
    .line 463
    instance-of v7, v2, LS1/u;

    .line 464
    .line 465
    if-eqz v7, :cond_18

    .line 466
    .line 467
    check-cast v2, LS1/u;

    .line 468
    .line 469
    new-instance v7, LD9/n;

    .line 470
    .line 471
    iget v2, v2, LS1/u;->d:I

    .line 472
    .line 473
    const/4 v3, 0x6

    .line 474
    invoke-direct {v7, v14, v2, v3}, LD9/n;-><init>(III)V

    .line 475
    .line 476
    .line 477
    goto :goto_c

    .line 478
    :cond_18
    instance-of v7, v2, LS1/t;

    .line 479
    .line 480
    if-nez v7, :cond_19

    .line 481
    .line 482
    instance-of v7, v2, LN1/D;

    .line 483
    .line 484
    if-eqz v7, :cond_1a

    .line 485
    .line 486
    :cond_19
    const/4 v2, 0x4

    .line 487
    const/4 v3, 0x6

    .line 488
    const/4 v10, 0x0

    .line 489
    const/16 v13, 0x9

    .line 490
    .line 491
    const/4 v15, 0x7

    .line 492
    const/16 v16, 0x8

    .line 493
    .line 494
    goto/16 :goto_18

    .line 495
    .line 496
    :cond_1a
    instance-of v7, v2, LS1/s;

    .line 497
    .line 498
    if-nez v7, :cond_1b

    .line 499
    .line 500
    instance-of v11, v2, LS1/B;

    .line 501
    .line 502
    if-eqz v11, :cond_1c

    .line 503
    .line 504
    :cond_1b
    const/4 v3, 0x6

    .line 505
    const/4 v10, 0x0

    .line 506
    const/16 v13, 0x9

    .line 507
    .line 508
    goto/16 :goto_16

    .line 509
    .line 510
    :cond_1c
    const/16 v7, 0x3ea

    .line 511
    .line 512
    if-ne v10, v7, :cond_1d

    .line 513
    .line 514
    new-instance v7, LD9/n;

    .line 515
    .line 516
    const/16 v2, 0x15

    .line 517
    .line 518
    const/4 v3, 0x0

    .line 519
    const/4 v10, 0x6

    .line 520
    invoke-direct {v7, v2, v3, v10}, LD9/n;-><init>(III)V

    .line 521
    .line 522
    .line 523
    :goto_10
    move v13, v10

    .line 524
    goto :goto_d

    .line 525
    :cond_1d
    instance-of v7, v2, LZ1/b;

    .line 526
    .line 527
    if-eqz v7, :cond_24

    .line 528
    .line 529
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    instance-of v7, v2, Landroid/media/MediaDrm$MediaDrmStateException;

    .line 537
    .line 538
    if-eqz v7, :cond_1e

    .line 539
    .line 540
    check-cast v2, Landroid/media/MediaDrm$MediaDrmStateException;

    .line 541
    .line 542
    invoke-virtual {v2}, Landroid/media/MediaDrm$MediaDrmStateException;->getDiagnosticInfo()Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    invoke-static {v2}, LQ1/x;->v(Ljava/lang/String;)I

    .line 547
    .line 548
    .line 549
    move-result v2

    .line 550
    invoke-static {v2}, LQ1/x;->u(I)I

    .line 551
    .line 552
    .line 553
    move-result v3

    .line 554
    packed-switch v3, :pswitch_data_0

    .line 555
    .line 556
    .line 557
    const/16 v3, 0x1b

    .line 558
    .line 559
    goto :goto_11

    .line 560
    :pswitch_0
    move/from16 v3, v21

    .line 561
    .line 562
    goto :goto_11

    .line 563
    :pswitch_1
    move/from16 v3, v20

    .line 564
    .line 565
    goto :goto_11

    .line 566
    :pswitch_2
    const/16 v3, 0x1c

    .line 567
    .line 568
    goto :goto_11

    .line 569
    :pswitch_3
    const/16 v3, 0x18

    .line 570
    .line 571
    :goto_11
    new-instance v7, LD9/n;

    .line 572
    .line 573
    const/4 v10, 0x6

    .line 574
    invoke-direct {v7, v3, v2, v10}, LD9/n;-><init>(III)V

    .line 575
    .line 576
    .line 577
    goto :goto_10

    .line 578
    :cond_1e
    const/4 v10, 0x6

    .line 579
    sget v7, LQ1/x;->a:I

    .line 580
    .line 581
    if-lt v7, v3, :cond_1f

    .line 582
    .line 583
    instance-of v7, v2, Landroid/media/MediaDrmResetException;

    .line 584
    .line 585
    if-eqz v7, :cond_1f

    .line 586
    .line 587
    new-instance v7, LD9/n;

    .line 588
    .line 589
    const/4 v11, 0x0

    .line 590
    const/16 v13, 0x1b

    .line 591
    .line 592
    invoke-direct {v7, v13, v11, v10}, LD9/n;-><init>(III)V

    .line 593
    .line 594
    .line 595
    goto :goto_10

    .line 596
    :cond_1f
    const/4 v11, 0x0

    .line 597
    instance-of v7, v2, Landroid/media/NotProvisionedException;

    .line 598
    .line 599
    if-eqz v7, :cond_20

    .line 600
    .line 601
    new-instance v7, LD9/n;

    .line 602
    .line 603
    const/16 v2, 0x18

    .line 604
    .line 605
    invoke-direct {v7, v2, v11, v10}, LD9/n;-><init>(III)V

    .line 606
    .line 607
    .line 608
    goto :goto_10

    .line 609
    :cond_20
    instance-of v7, v2, Landroid/media/DeniedByServerException;

    .line 610
    .line 611
    if-eqz v7, :cond_21

    .line 612
    .line 613
    new-instance v7, LD9/n;

    .line 614
    .line 615
    const/16 v2, 0x1d

    .line 616
    .line 617
    invoke-direct {v7, v2, v11, v10}, LD9/n;-><init>(III)V

    .line 618
    .line 619
    .line 620
    goto :goto_10

    .line 621
    :cond_21
    instance-of v7, v2, LZ1/i;

    .line 622
    .line 623
    if-eqz v7, :cond_22

    .line 624
    .line 625
    new-instance v7, LD9/n;

    .line 626
    .line 627
    invoke-direct {v7, v3, v11, v10}, LD9/n;-><init>(III)V

    .line 628
    .line 629
    .line 630
    goto :goto_10

    .line 631
    :cond_22
    instance-of v2, v2, LZ1/a;

    .line 632
    .line 633
    if-eqz v2, :cond_23

    .line 634
    .line 635
    new-instance v7, LD9/n;

    .line 636
    .line 637
    const/16 v2, 0x1c

    .line 638
    .line 639
    invoke-direct {v7, v2, v11, v10}, LD9/n;-><init>(III)V

    .line 640
    .line 641
    .line 642
    goto :goto_10

    .line 643
    :cond_23
    new-instance v7, LD9/n;

    .line 644
    .line 645
    const/16 v2, 0x1e

    .line 646
    .line 647
    invoke-direct {v7, v2, v11, v10}, LD9/n;-><init>(III)V

    .line 648
    .line 649
    .line 650
    goto :goto_10

    .line 651
    :cond_24
    instance-of v3, v2, LS1/p;

    .line 652
    .line 653
    if-eqz v3, :cond_26

    .line 654
    .line 655
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 656
    .line 657
    .line 658
    move-result-object v3

    .line 659
    instance-of v3, v3, Ljava/io/FileNotFoundException;

    .line 660
    .line 661
    if-eqz v3, :cond_26

    .line 662
    .line 663
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 664
    .line 665
    .line 666
    move-result-object v2

    .line 667
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 671
    .line 672
    .line 673
    move-result-object v2

    .line 674
    instance-of v3, v2, Landroid/system/ErrnoException;

    .line 675
    .line 676
    if-eqz v3, :cond_25

    .line 677
    .line 678
    check-cast v2, Landroid/system/ErrnoException;

    .line 679
    .line 680
    iget v2, v2, Landroid/system/ErrnoException;->errno:I

    .line 681
    .line 682
    sget v3, Landroid/system/OsConstants;->EACCES:I

    .line 683
    .line 684
    if-ne v2, v3, :cond_25

    .line 685
    .line 686
    new-instance v7, LD9/n;

    .line 687
    .line 688
    const/16 v2, 0x20

    .line 689
    .line 690
    const/4 v3, 0x6

    .line 691
    const/4 v10, 0x0

    .line 692
    invoke-direct {v7, v2, v10, v3}, LD9/n;-><init>(III)V

    .line 693
    .line 694
    .line 695
    goto/16 :goto_c

    .line 696
    .line 697
    :cond_25
    const/4 v3, 0x6

    .line 698
    const/4 v10, 0x0

    .line 699
    new-instance v7, LD9/n;

    .line 700
    .line 701
    const/16 v2, 0x1f

    .line 702
    .line 703
    invoke-direct {v7, v2, v10, v3}, LD9/n;-><init>(III)V

    .line 704
    .line 705
    .line 706
    goto/16 :goto_c

    .line 707
    .line 708
    :cond_26
    const/4 v3, 0x6

    .line 709
    const/4 v10, 0x0

    .line 710
    new-instance v7, LD9/n;

    .line 711
    .line 712
    const/16 v13, 0x9

    .line 713
    .line 714
    invoke-direct {v7, v13, v10, v3}, LD9/n;-><init>(III)V

    .line 715
    .line 716
    .line 717
    :goto_12
    move/from16 v19, v13

    .line 718
    .line 719
    const/16 v16, 0x8

    .line 720
    .line 721
    const/16 v17, 0x7

    .line 722
    .line 723
    :goto_13
    const/16 v18, 0x4

    .line 724
    .line 725
    :goto_14
    move v13, v3

    .line 726
    :goto_15
    const/16 v3, 0xd

    .line 727
    .line 728
    goto/16 :goto_1d

    .line 729
    .line 730
    :goto_16
    iget-object v11, v6, LV1/i;->a:Landroid/content/Context;

    .line 731
    .line 732
    invoke-static {v11}, LQ1/n;->b(Landroid/content/Context;)LQ1/n;

    .line 733
    .line 734
    .line 735
    move-result-object v11

    .line 736
    invoke-virtual {v11}, LQ1/n;->c()I

    .line 737
    .line 738
    .line 739
    move-result v11

    .line 740
    const/4 v15, 0x1

    .line 741
    if-ne v11, v15, :cond_27

    .line 742
    .line 743
    new-instance v7, LD9/n;

    .line 744
    .line 745
    const/4 v2, 0x3

    .line 746
    invoke-direct {v7, v2, v10, v3}, LD9/n;-><init>(III)V

    .line 747
    .line 748
    .line 749
    goto :goto_12

    .line 750
    :cond_27
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 751
    .line 752
    .line 753
    move-result-object v11

    .line 754
    instance-of v15, v11, Ljava/net/UnknownHostException;

    .line 755
    .line 756
    if-eqz v15, :cond_28

    .line 757
    .line 758
    new-instance v7, LD9/n;

    .line 759
    .line 760
    invoke-direct {v7, v3, v10, v3}, LD9/n;-><init>(III)V

    .line 761
    .line 762
    .line 763
    goto :goto_12

    .line 764
    :cond_28
    instance-of v11, v11, Ljava/net/SocketTimeoutException;

    .line 765
    .line 766
    if-eqz v11, :cond_29

    .line 767
    .line 768
    new-instance v7, LD9/n;

    .line 769
    .line 770
    const/4 v15, 0x7

    .line 771
    invoke-direct {v7, v15, v10, v3}, LD9/n;-><init>(III)V

    .line 772
    .line 773
    .line 774
    move/from16 v19, v13

    .line 775
    .line 776
    move/from16 v17, v15

    .line 777
    .line 778
    const/16 v16, 0x8

    .line 779
    .line 780
    goto :goto_13

    .line 781
    :cond_29
    const/4 v15, 0x7

    .line 782
    if-eqz v7, :cond_2a

    .line 783
    .line 784
    check-cast v2, LS1/s;

    .line 785
    .line 786
    iget v2, v2, LS1/s;->c:I

    .line 787
    .line 788
    const/4 v7, 0x1

    .line 789
    if-ne v2, v7, :cond_2a

    .line 790
    .line 791
    new-instance v7, LD9/n;

    .line 792
    .line 793
    const/4 v2, 0x4

    .line 794
    invoke-direct {v7, v2, v10, v3}, LD9/n;-><init>(III)V

    .line 795
    .line 796
    .line 797
    move/from16 v18, v2

    .line 798
    .line 799
    move/from16 v19, v13

    .line 800
    .line 801
    move/from16 v17, v15

    .line 802
    .line 803
    const/16 v16, 0x8

    .line 804
    .line 805
    goto :goto_14

    .line 806
    :cond_2a
    const/4 v2, 0x4

    .line 807
    new-instance v7, LD9/n;

    .line 808
    .line 809
    const/16 v11, 0x8

    .line 810
    .line 811
    invoke-direct {v7, v11, v10, v3}, LD9/n;-><init>(III)V

    .line 812
    .line 813
    .line 814
    move/from16 v18, v2

    .line 815
    .line 816
    move/from16 v16, v11

    .line 817
    .line 818
    :goto_17
    move/from16 v19, v13

    .line 819
    .line 820
    move/from16 v17, v15

    .line 821
    .line 822
    goto :goto_14

    .line 823
    :goto_18
    new-instance v7, LD9/n;

    .line 824
    .line 825
    if-eqz v11, :cond_2b

    .line 826
    .line 827
    const/16 v11, 0xa

    .line 828
    .line 829
    goto :goto_19

    .line 830
    :cond_2b
    const/16 v11, 0xb

    .line 831
    .line 832
    :goto_19
    invoke-direct {v7, v11, v10, v3}, LD9/n;-><init>(III)V

    .line 833
    .line 834
    .line 835
    move/from16 v18, v2

    .line 836
    .line 837
    goto :goto_17

    .line 838
    :cond_2c
    const/4 v10, 0x0

    .line 839
    const/4 v11, 0x6

    .line 840
    const/16 v13, 0x1b

    .line 841
    .line 842
    const/16 v16, 0x8

    .line 843
    .line 844
    const/16 v17, 0x7

    .line 845
    .line 846
    const/16 v18, 0x4

    .line 847
    .line 848
    const/16 v19, 0x9

    .line 849
    .line 850
    const/16 v22, 0x18

    .line 851
    .line 852
    const/16 v23, 0x1c

    .line 853
    .line 854
    if-eqz v15, :cond_2e

    .line 855
    .line 856
    if-eqz v7, :cond_2d

    .line 857
    .line 858
    const/4 v13, 0x1

    .line 859
    if-ne v7, v13, :cond_2e

    .line 860
    .line 861
    :cond_2d
    new-instance v7, LD9/n;

    .line 862
    .line 863
    const/16 v2, 0x23

    .line 864
    .line 865
    invoke-direct {v7, v2, v10, v11}, LD9/n;-><init>(III)V

    .line 866
    .line 867
    .line 868
    :goto_1a
    move v13, v11

    .line 869
    goto/16 :goto_15

    .line 870
    .line 871
    :cond_2e
    if-eqz v15, :cond_2f

    .line 872
    .line 873
    const/4 v13, 0x3

    .line 874
    if-ne v7, v13, :cond_2f

    .line 875
    .line 876
    new-instance v7, LD9/n;

    .line 877
    .line 878
    const/16 v2, 0xf

    .line 879
    .line 880
    invoke-direct {v7, v2, v10, v11}, LD9/n;-><init>(III)V

    .line 881
    .line 882
    .line 883
    goto :goto_1a

    .line 884
    :cond_2f
    if-eqz v15, :cond_30

    .line 885
    .line 886
    const/4 v13, 0x2

    .line 887
    if-ne v7, v13, :cond_30

    .line 888
    .line 889
    new-instance v7, LD9/n;

    .line 890
    .line 891
    invoke-direct {v7, v3, v10, v11}, LD9/n;-><init>(III)V

    .line 892
    .line 893
    .line 894
    goto :goto_1a

    .line 895
    :cond_30
    instance-of v3, v2, Ld2/o;

    .line 896
    .line 897
    if-eqz v3, :cond_31

    .line 898
    .line 899
    check-cast v2, Ld2/o;

    .line 900
    .line 901
    iget-object v2, v2, Ld2/o;->d:Ljava/lang/String;

    .line 902
    .line 903
    invoke-static {v2}, LQ1/x;->v(Ljava/lang/String;)I

    .line 904
    .line 905
    .line 906
    move-result v2

    .line 907
    new-instance v7, LD9/n;

    .line 908
    .line 909
    const/16 v3, 0xd

    .line 910
    .line 911
    invoke-direct {v7, v3, v2, v11}, LD9/n;-><init>(III)V

    .line 912
    .line 913
    .line 914
    :goto_1b
    move v13, v11

    .line 915
    goto/16 :goto_1d

    .line 916
    .line 917
    :cond_31
    const/16 v3, 0xd

    .line 918
    .line 919
    instance-of v7, v2, Ld2/l;

    .line 920
    .line 921
    const/16 v10, 0xe

    .line 922
    .line 923
    if-eqz v7, :cond_32

    .line 924
    .line 925
    check-cast v2, Ld2/l;

    .line 926
    .line 927
    new-instance v7, LD9/n;

    .line 928
    .line 929
    iget v2, v2, Ld2/l;->a:I

    .line 930
    .line 931
    invoke-direct {v7, v10, v2, v11}, LD9/n;-><init>(III)V

    .line 932
    .line 933
    .line 934
    goto :goto_1b

    .line 935
    :cond_32
    instance-of v7, v2, Ljava/lang/OutOfMemoryError;

    .line 936
    .line 937
    if-eqz v7, :cond_33

    .line 938
    .line 939
    new-instance v7, LD9/n;

    .line 940
    .line 941
    const/4 v2, 0x0

    .line 942
    invoke-direct {v7, v10, v2, v11}, LD9/n;-><init>(III)V

    .line 943
    .line 944
    .line 945
    goto :goto_1b

    .line 946
    :cond_33
    instance-of v7, v2, LW1/i;

    .line 947
    .line 948
    if-eqz v7, :cond_34

    .line 949
    .line 950
    check-cast v2, LW1/i;

    .line 951
    .line 952
    new-instance v7, LD9/n;

    .line 953
    .line 954
    const/16 v10, 0x11

    .line 955
    .line 956
    iget v2, v2, LW1/i;->a:I

    .line 957
    .line 958
    invoke-direct {v7, v10, v2, v11}, LD9/n;-><init>(III)V

    .line 959
    .line 960
    .line 961
    goto :goto_1b

    .line 962
    :cond_34
    instance-of v7, v2, LW1/j;

    .line 963
    .line 964
    if-eqz v7, :cond_35

    .line 965
    .line 966
    check-cast v2, LW1/j;

    .line 967
    .line 968
    new-instance v7, LD9/n;

    .line 969
    .line 970
    const/16 v10, 0x12

    .line 971
    .line 972
    iget v2, v2, LW1/j;->a:I

    .line 973
    .line 974
    invoke-direct {v7, v10, v2, v11}, LD9/n;-><init>(III)V

    .line 975
    .line 976
    .line 977
    goto :goto_1b

    .line 978
    :cond_35
    instance-of v7, v2, Landroid/media/MediaCodec$CryptoException;

    .line 979
    .line 980
    if-eqz v7, :cond_36

    .line 981
    .line 982
    check-cast v2, Landroid/media/MediaCodec$CryptoException;

    .line 983
    .line 984
    invoke-virtual {v2}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 985
    .line 986
    .line 987
    move-result v2

    .line 988
    invoke-static {v2}, LQ1/x;->u(I)I

    .line 989
    .line 990
    .line 991
    move-result v7

    .line 992
    packed-switch v7, :pswitch_data_1

    .line 993
    .line 994
    .line 995
    const/16 v7, 0x1b

    .line 996
    .line 997
    goto :goto_1c

    .line 998
    :pswitch_4
    move/from16 v7, v21

    .line 999
    .line 1000
    goto :goto_1c

    .line 1001
    :pswitch_5
    move/from16 v7, v20

    .line 1002
    .line 1003
    goto :goto_1c

    .line 1004
    :pswitch_6
    move/from16 v7, v23

    .line 1005
    .line 1006
    goto :goto_1c

    .line 1007
    :pswitch_7
    move/from16 v7, v22

    .line 1008
    .line 1009
    :goto_1c
    new-instance v10, LD9/n;

    .line 1010
    .line 1011
    const/4 v13, 0x6

    .line 1012
    invoke-direct {v10, v7, v2, v13}, LD9/n;-><init>(III)V

    .line 1013
    .line 1014
    .line 1015
    move-object v7, v10

    .line 1016
    goto :goto_1d

    .line 1017
    :cond_36
    const/4 v13, 0x6

    .line 1018
    new-instance v7, LD9/n;

    .line 1019
    .line 1020
    const/16 v2, 0x16

    .line 1021
    .line 1022
    const/4 v10, 0x0

    .line 1023
    invoke-direct {v7, v2, v10, v13}, LD9/n;-><init>(III)V

    .line 1024
    .line 1025
    .line 1026
    :goto_1d
    iget-object v2, v6, LV1/i;->c:Landroid/media/metrics/PlaybackSession;

    .line 1027
    .line 1028
    invoke-static {}, LV1/g;->e()Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v10

    .line 1032
    iget-wide v13, v6, LV1/i;->d:J

    .line 1033
    .line 1034
    sub-long v13, v8, v13

    .line 1035
    .line 1036
    invoke-static {v10, v13, v14}, LV1/g;->g(Landroid/media/metrics/PlaybackErrorEvent$Builder;J)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v10

    .line 1040
    iget v11, v7, LD9/n;->b:I

    .line 1041
    .line 1042
    invoke-static {v10, v11}, LV1/g;->f(Landroid/media/metrics/PlaybackErrorEvent$Builder;I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v10

    .line 1046
    iget v7, v7, LD9/n;->c:I

    .line 1047
    .line 1048
    invoke-static {v10, v7}, LV1/g;->t(Landroid/media/metrics/PlaybackErrorEvent$Builder;I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v7

    .line 1052
    invoke-static {v7, v4}, LV1/g;->h(Landroid/media/metrics/PlaybackErrorEvent$Builder;LN1/E;)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v4

    .line 1056
    invoke-static {v4}, LV1/g;->i(Landroid/media/metrics/PlaybackErrorEvent$Builder;)Landroid/media/metrics/PlaybackErrorEvent;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v4

    .line 1060
    invoke-static {v2, v4}, LV1/g;->o(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackErrorEvent;)V

    .line 1061
    .line 1062
    .line 1063
    const/4 v13, 0x1

    .line 1064
    iput-boolean v13, v6, LV1/i;->A:Z

    .line 1065
    .line 1066
    const/4 v10, 0x0

    .line 1067
    iput-object v10, v6, LV1/i;->n:LN1/E;

    .line 1068
    .line 1069
    :goto_1e
    iget-object v2, v0, LN1/l;->a:Landroid/util/SparseBooleanArray;

    .line 1070
    .line 1071
    const/4 v13, 0x2

    .line 1072
    invoke-virtual {v2, v13}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 1073
    .line 1074
    .line 1075
    move-result v2

    .line 1076
    if-eqz v2, :cond_42

    .line 1077
    .line 1078
    invoke-virtual {v5}, LU1/u;->S0()V

    .line 1079
    .line 1080
    .line 1081
    iget-object v2, v5, LU1/u;->d0:LU1/P;

    .line 1082
    .line 1083
    iget-object v2, v2, LU1/P;->i:Ln2/t;

    .line 1084
    .line 1085
    iget-object v2, v2, Ln2/t;->d:LN1/V;

    .line 1086
    .line 1087
    invoke-virtual {v2, v13}, LN1/V;->a(I)Z

    .line 1088
    .line 1089
    .line 1090
    move-result v4

    .line 1091
    const/4 v13, 0x1

    .line 1092
    invoke-virtual {v2, v13}, LN1/V;->a(I)Z

    .line 1093
    .line 1094
    .line 1095
    move-result v14

    .line 1096
    const/4 v13, 0x3

    .line 1097
    invoke-virtual {v2, v13}, LN1/V;->a(I)Z

    .line 1098
    .line 1099
    .line 1100
    move-result v2

    .line 1101
    if-nez v4, :cond_38

    .line 1102
    .line 1103
    if-nez v14, :cond_38

    .line 1104
    .line 1105
    if-eqz v2, :cond_37

    .line 1106
    .line 1107
    goto :goto_1f

    .line 1108
    :cond_37
    move/from16 v4, v18

    .line 1109
    .line 1110
    const/4 v2, 0x0

    .line 1111
    goto :goto_26

    .line 1112
    :cond_38
    :goto_1f
    if-nez v4, :cond_3b

    .line 1113
    .line 1114
    iget-object v4, v6, LV1/i;->r:LN1/n;

    .line 1115
    .line 1116
    sget v7, LQ1/x;->a:I

    .line 1117
    .line 1118
    const/4 v10, 0x0

    .line 1119
    invoke-static {v4, v10}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1120
    .line 1121
    .line 1122
    move-result v4

    .line 1123
    if-eqz v4, :cond_39

    .line 1124
    .line 1125
    move/from16 v4, v18

    .line 1126
    .line 1127
    goto :goto_21

    .line 1128
    :cond_39
    iget-object v4, v6, LV1/i;->r:LN1/n;

    .line 1129
    .line 1130
    if-nez v4, :cond_3a

    .line 1131
    .line 1132
    const/4 v11, 0x1

    .line 1133
    goto :goto_20

    .line 1134
    :cond_3a
    const/4 v11, 0x0

    .line 1135
    :goto_20
    iput-object v10, v6, LV1/i;->r:LN1/n;

    .line 1136
    .line 1137
    const/4 v7, 0x1

    .line 1138
    move/from16 v4, v18

    .line 1139
    .line 1140
    invoke-virtual/range {v6 .. v11}, LV1/i;->e(IJLN1/n;I)V

    .line 1141
    .line 1142
    .line 1143
    goto :goto_21

    .line 1144
    :cond_3b
    move/from16 v4, v18

    .line 1145
    .line 1146
    const/4 v10, 0x0

    .line 1147
    :goto_21
    if-nez v14, :cond_3e

    .line 1148
    .line 1149
    iget-object v7, v6, LV1/i;->s:LN1/n;

    .line 1150
    .line 1151
    sget v11, LQ1/x;->a:I

    .line 1152
    .line 1153
    invoke-static {v7, v10}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1154
    .line 1155
    .line 1156
    move-result v7

    .line 1157
    if-eqz v7, :cond_3c

    .line 1158
    .line 1159
    goto :goto_23

    .line 1160
    :cond_3c
    iget-object v7, v6, LV1/i;->s:LN1/n;

    .line 1161
    .line 1162
    if-nez v7, :cond_3d

    .line 1163
    .line 1164
    const/4 v11, 0x1

    .line 1165
    goto :goto_22

    .line 1166
    :cond_3d
    const/4 v11, 0x0

    .line 1167
    :goto_22
    iput-object v10, v6, LV1/i;->s:LN1/n;

    .line 1168
    .line 1169
    const/4 v7, 0x0

    .line 1170
    invoke-virtual/range {v6 .. v11}, LV1/i;->e(IJLN1/n;I)V

    .line 1171
    .line 1172
    .line 1173
    :cond_3e
    :goto_23
    if-nez v2, :cond_41

    .line 1174
    .line 1175
    iget-object v2, v6, LV1/i;->t:LN1/n;

    .line 1176
    .line 1177
    sget v7, LQ1/x;->a:I

    .line 1178
    .line 1179
    invoke-static {v2, v10}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1180
    .line 1181
    .line 1182
    move-result v2

    .line 1183
    if-eqz v2, :cond_3f

    .line 1184
    .line 1185
    goto :goto_25

    .line 1186
    :cond_3f
    iget-object v2, v6, LV1/i;->t:LN1/n;

    .line 1187
    .line 1188
    if-nez v2, :cond_40

    .line 1189
    .line 1190
    const/4 v11, 0x1

    .line 1191
    goto :goto_24

    .line 1192
    :cond_40
    const/4 v11, 0x0

    .line 1193
    :goto_24
    iput-object v10, v6, LV1/i;->t:LN1/n;

    .line 1194
    .line 1195
    const/4 v7, 0x2

    .line 1196
    invoke-virtual/range {v6 .. v11}, LV1/i;->e(IJLN1/n;I)V

    .line 1197
    .line 1198
    .line 1199
    :cond_41
    :goto_25
    move-object v2, v10

    .line 1200
    goto :goto_26

    .line 1201
    :cond_42
    move/from16 v4, v18

    .line 1202
    .line 1203
    const/4 v2, 0x0

    .line 1204
    const/4 v13, 0x3

    .line 1205
    :goto_26
    iget-object v7, v6, LV1/i;->o:LE4/n;

    .line 1206
    .line 1207
    invoke-virtual {v6, v7}, LV1/i;->a(LE4/n;)Z

    .line 1208
    .line 1209
    .line 1210
    move-result v7

    .line 1211
    if-eqz v7, :cond_45

    .line 1212
    .line 1213
    iget-object v7, v6, LV1/i;->o:LE4/n;

    .line 1214
    .line 1215
    iget-object v10, v7, LE4/n;->c:Ljava/lang/Object;

    .line 1216
    .line 1217
    check-cast v10, LN1/n;

    .line 1218
    .line 1219
    iget v11, v10, LN1/n;->v:I

    .line 1220
    .line 1221
    const/4 v14, -0x1

    .line 1222
    if-eq v11, v14, :cond_45

    .line 1223
    .line 1224
    iget v7, v7, LE4/n;->b:I

    .line 1225
    .line 1226
    iget-object v11, v6, LV1/i;->r:LN1/n;

    .line 1227
    .line 1228
    sget v14, LQ1/x;->a:I

    .line 1229
    .line 1230
    invoke-static {v11, v10}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1231
    .line 1232
    .line 1233
    move-result v11

    .line 1234
    if-eqz v11, :cond_43

    .line 1235
    .line 1236
    goto :goto_28

    .line 1237
    :cond_43
    iget-object v11, v6, LV1/i;->r:LN1/n;

    .line 1238
    .line 1239
    if-nez v11, :cond_44

    .line 1240
    .line 1241
    if-nez v7, :cond_44

    .line 1242
    .line 1243
    const/4 v11, 0x1

    .line 1244
    goto :goto_27

    .line 1245
    :cond_44
    move v11, v7

    .line 1246
    :goto_27
    iput-object v10, v6, LV1/i;->r:LN1/n;

    .line 1247
    .line 1248
    const/4 v7, 0x1

    .line 1249
    invoke-virtual/range {v6 .. v11}, LV1/i;->e(IJLN1/n;I)V

    .line 1250
    .line 1251
    .line 1252
    :goto_28
    iput-object v2, v6, LV1/i;->o:LE4/n;

    .line 1253
    .line 1254
    :cond_45
    iget-object v7, v6, LV1/i;->p:LE4/n;

    .line 1255
    .line 1256
    invoke-virtual {v6, v7}, LV1/i;->a(LE4/n;)Z

    .line 1257
    .line 1258
    .line 1259
    move-result v7

    .line 1260
    if-eqz v7, :cond_48

    .line 1261
    .line 1262
    iget-object v7, v6, LV1/i;->p:LE4/n;

    .line 1263
    .line 1264
    iget-object v10, v7, LE4/n;->c:Ljava/lang/Object;

    .line 1265
    .line 1266
    check-cast v10, LN1/n;

    .line 1267
    .line 1268
    iget v7, v7, LE4/n;->b:I

    .line 1269
    .line 1270
    iget-object v11, v6, LV1/i;->s:LN1/n;

    .line 1271
    .line 1272
    sget v14, LQ1/x;->a:I

    .line 1273
    .line 1274
    invoke-static {v11, v10}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1275
    .line 1276
    .line 1277
    move-result v11

    .line 1278
    if-eqz v11, :cond_46

    .line 1279
    .line 1280
    goto :goto_2a

    .line 1281
    :cond_46
    iget-object v11, v6, LV1/i;->s:LN1/n;

    .line 1282
    .line 1283
    if-nez v11, :cond_47

    .line 1284
    .line 1285
    if-nez v7, :cond_47

    .line 1286
    .line 1287
    const/4 v11, 0x1

    .line 1288
    goto :goto_29

    .line 1289
    :cond_47
    move v11, v7

    .line 1290
    :goto_29
    iput-object v10, v6, LV1/i;->s:LN1/n;

    .line 1291
    .line 1292
    const/4 v7, 0x0

    .line 1293
    invoke-virtual/range {v6 .. v11}, LV1/i;->e(IJLN1/n;I)V

    .line 1294
    .line 1295
    .line 1296
    :goto_2a
    iput-object v2, v6, LV1/i;->p:LE4/n;

    .line 1297
    .line 1298
    :cond_48
    iget-object v7, v6, LV1/i;->q:LE4/n;

    .line 1299
    .line 1300
    invoke-virtual {v6, v7}, LV1/i;->a(LE4/n;)Z

    .line 1301
    .line 1302
    .line 1303
    move-result v7

    .line 1304
    if-eqz v7, :cond_4b

    .line 1305
    .line 1306
    iget-object v7, v6, LV1/i;->q:LE4/n;

    .line 1307
    .line 1308
    iget-object v10, v7, LE4/n;->c:Ljava/lang/Object;

    .line 1309
    .line 1310
    check-cast v10, LN1/n;

    .line 1311
    .line 1312
    iget v7, v7, LE4/n;->b:I

    .line 1313
    .line 1314
    iget-object v11, v6, LV1/i;->t:LN1/n;

    .line 1315
    .line 1316
    sget v14, LQ1/x;->a:I

    .line 1317
    .line 1318
    invoke-static {v11, v10}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1319
    .line 1320
    .line 1321
    move-result v11

    .line 1322
    if-eqz v11, :cond_49

    .line 1323
    .line 1324
    goto :goto_2c

    .line 1325
    :cond_49
    iget-object v11, v6, LV1/i;->t:LN1/n;

    .line 1326
    .line 1327
    if-nez v11, :cond_4a

    .line 1328
    .line 1329
    if-nez v7, :cond_4a

    .line 1330
    .line 1331
    const/4 v11, 0x1

    .line 1332
    goto :goto_2b

    .line 1333
    :cond_4a
    move v11, v7

    .line 1334
    :goto_2b
    iput-object v10, v6, LV1/i;->t:LN1/n;

    .line 1335
    .line 1336
    const/4 v7, 0x2

    .line 1337
    invoke-virtual/range {v6 .. v11}, LV1/i;->e(IJLN1/n;I)V

    .line 1338
    .line 1339
    .line 1340
    :goto_2c
    iput-object v2, v6, LV1/i;->q:LE4/n;

    .line 1341
    .line 1342
    :cond_4b
    iget-object v2, v6, LV1/i;->a:Landroid/content/Context;

    .line 1343
    .line 1344
    invoke-static {v2}, LQ1/n;->b(Landroid/content/Context;)LQ1/n;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v2

    .line 1348
    invoke-virtual {v2}, LQ1/n;->c()I

    .line 1349
    .line 1350
    .line 1351
    move-result v2

    .line 1352
    packed-switch v2, :pswitch_data_2

    .line 1353
    .line 1354
    .line 1355
    :pswitch_8
    const/4 v7, 0x1

    .line 1356
    goto :goto_2d

    .line 1357
    :pswitch_9
    move/from16 v7, v17

    .line 1358
    .line 1359
    goto :goto_2d

    .line 1360
    :pswitch_a
    move/from16 v7, v16

    .line 1361
    .line 1362
    goto :goto_2d

    .line 1363
    :pswitch_b
    move v7, v13

    .line 1364
    goto :goto_2d

    .line 1365
    :pswitch_c
    const/4 v7, 0x6

    .line 1366
    goto :goto_2d

    .line 1367
    :pswitch_d
    const/4 v7, 0x5

    .line 1368
    goto :goto_2d

    .line 1369
    :pswitch_e
    move v7, v4

    .line 1370
    goto :goto_2d

    .line 1371
    :pswitch_f
    const/4 v7, 0x2

    .line 1372
    goto :goto_2d

    .line 1373
    :pswitch_10
    move/from16 v7, v19

    .line 1374
    .line 1375
    goto :goto_2d

    .line 1376
    :pswitch_11
    const/4 v7, 0x0

    .line 1377
    :goto_2d
    iget v2, v6, LV1/i;->m:I

    .line 1378
    .line 1379
    if-eq v7, v2, :cond_4c

    .line 1380
    .line 1381
    iput v7, v6, LV1/i;->m:I

    .line 1382
    .line 1383
    iget-object v2, v6, LV1/i;->c:Landroid/media/metrics/PlaybackSession;

    .line 1384
    .line 1385
    invoke-static {}, LV1/g;->a()Landroid/media/metrics/NetworkEvent$Builder;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v10

    .line 1389
    invoke-static {v10, v7}, LV1/g;->b(Landroid/media/metrics/NetworkEvent$Builder;I)Landroid/media/metrics/NetworkEvent$Builder;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v7

    .line 1393
    iget-wide v10, v6, LV1/i;->d:J

    .line 1394
    .line 1395
    sub-long v10, v8, v10

    .line 1396
    .line 1397
    invoke-static {v7, v10, v11}, LV1/g;->c(Landroid/media/metrics/NetworkEvent$Builder;J)Landroid/media/metrics/NetworkEvent$Builder;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v7

    .line 1401
    invoke-static {v7}, LV1/g;->d(Landroid/media/metrics/NetworkEvent$Builder;)Landroid/media/metrics/NetworkEvent;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v7

    .line 1405
    invoke-static {v2, v7}, LV1/g;->n(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/NetworkEvent;)V

    .line 1406
    .line 1407
    .line 1408
    :cond_4c
    invoke-virtual {v5}, LU1/u;->t0()I

    .line 1409
    .line 1410
    .line 1411
    move-result v2

    .line 1412
    const/4 v7, 0x2

    .line 1413
    const/4 v10, 0x0

    .line 1414
    if-eq v2, v7, :cond_4d

    .line 1415
    .line 1416
    iput-boolean v10, v6, LV1/i;->u:Z

    .line 1417
    .line 1418
    :cond_4d
    invoke-virtual {v5}, LU1/u;->S0()V

    .line 1419
    .line 1420
    .line 1421
    iget-object v2, v5, LU1/u;->d0:LU1/P;

    .line 1422
    .line 1423
    iget-object v2, v2, LU1/P;->f:LU1/j;

    .line 1424
    .line 1425
    if-nez v2, :cond_4e

    .line 1426
    .line 1427
    iput-boolean v10, v6, LV1/i;->w:Z

    .line 1428
    .line 1429
    const/16 v7, 0xa

    .line 1430
    .line 1431
    goto :goto_2e

    .line 1432
    :cond_4e
    iget-object v2, v0, LN1/l;->a:Landroid/util/SparseBooleanArray;

    .line 1433
    .line 1434
    const/16 v7, 0xa

    .line 1435
    .line 1436
    invoke-virtual {v2, v7}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 1437
    .line 1438
    .line 1439
    move-result v2

    .line 1440
    if-eqz v2, :cond_4f

    .line 1441
    .line 1442
    const/4 v2, 0x1

    .line 1443
    iput-boolean v2, v6, LV1/i;->w:Z

    .line 1444
    .line 1445
    :cond_4f
    :goto_2e
    invoke-virtual {v5}, LU1/u;->t0()I

    .line 1446
    .line 1447
    .line 1448
    move-result v2

    .line 1449
    iget-boolean v10, v6, LV1/i;->u:Z

    .line 1450
    .line 1451
    if-eqz v10, :cond_50

    .line 1452
    .line 1453
    const/4 v3, 0x5

    .line 1454
    :goto_2f
    const/4 v13, 0x1

    .line 1455
    goto/16 :goto_31

    .line 1456
    .line 1457
    :cond_50
    iget-boolean v10, v6, LV1/i;->w:Z

    .line 1458
    .line 1459
    if-eqz v10, :cond_51

    .line 1460
    .line 1461
    goto :goto_2f

    .line 1462
    :cond_51
    if-ne v2, v4, :cond_52

    .line 1463
    .line 1464
    const/16 v3, 0xb

    .line 1465
    .line 1466
    goto :goto_2f

    .line 1467
    :cond_52
    const/16 v3, 0xc

    .line 1468
    .line 1469
    const/4 v10, 0x2

    .line 1470
    if-ne v2, v10, :cond_57

    .line 1471
    .line 1472
    iget v2, v6, LV1/i;->l:I

    .line 1473
    .line 1474
    if-eqz v2, :cond_56

    .line 1475
    .line 1476
    if-eq v2, v10, :cond_56

    .line 1477
    .line 1478
    if-ne v2, v3, :cond_53

    .line 1479
    .line 1480
    goto :goto_30

    .line 1481
    :cond_53
    invoke-virtual {v5}, LU1/u;->s0()Z

    .line 1482
    .line 1483
    .line 1484
    move-result v2

    .line 1485
    if-nez v2, :cond_54

    .line 1486
    .line 1487
    move/from16 v3, v17

    .line 1488
    .line 1489
    goto :goto_2f

    .line 1490
    :cond_54
    invoke-virtual {v5}, LU1/u;->S0()V

    .line 1491
    .line 1492
    .line 1493
    iget-object v2, v5, LU1/u;->d0:LU1/P;

    .line 1494
    .line 1495
    iget v2, v2, LU1/P;->n:I

    .line 1496
    .line 1497
    if-eqz v2, :cond_55

    .line 1498
    .line 1499
    move v3, v7

    .line 1500
    goto :goto_2f

    .line 1501
    :cond_55
    const/4 v3, 0x6

    .line 1502
    goto :goto_2f

    .line 1503
    :cond_56
    :goto_30
    move v3, v10

    .line 1504
    goto :goto_2f

    .line 1505
    :cond_57
    if-ne v2, v13, :cond_5a

    .line 1506
    .line 1507
    invoke-virtual {v5}, LU1/u;->s0()Z

    .line 1508
    .line 1509
    .line 1510
    move-result v2

    .line 1511
    if-nez v2, :cond_58

    .line 1512
    .line 1513
    move v3, v4

    .line 1514
    goto :goto_2f

    .line 1515
    :cond_58
    invoke-virtual {v5}, LU1/u;->S0()V

    .line 1516
    .line 1517
    .line 1518
    iget-object v2, v5, LU1/u;->d0:LU1/P;

    .line 1519
    .line 1520
    iget v2, v2, LU1/P;->n:I

    .line 1521
    .line 1522
    if-eqz v2, :cond_59

    .line 1523
    .line 1524
    move/from16 v3, v19

    .line 1525
    .line 1526
    goto :goto_2f

    .line 1527
    :cond_59
    move v3, v13

    .line 1528
    goto :goto_2f

    .line 1529
    :cond_5a
    const/4 v13, 0x1

    .line 1530
    if-ne v2, v13, :cond_5b

    .line 1531
    .line 1532
    iget v2, v6, LV1/i;->l:I

    .line 1533
    .line 1534
    if-eqz v2, :cond_5b

    .line 1535
    .line 1536
    goto :goto_31

    .line 1537
    :cond_5b
    iget v3, v6, LV1/i;->l:I

    .line 1538
    .line 1539
    :goto_31
    iget v2, v6, LV1/i;->l:I

    .line 1540
    .line 1541
    if-eq v2, v3, :cond_5c

    .line 1542
    .line 1543
    iput v3, v6, LV1/i;->l:I

    .line 1544
    .line 1545
    iput-boolean v13, v6, LV1/i;->A:Z

    .line 1546
    .line 1547
    iget-object v2, v6, LV1/i;->c:Landroid/media/metrics/PlaybackSession;

    .line 1548
    .line 1549
    invoke-static {}, LV1/h;->i()Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v3

    .line 1553
    iget v4, v6, LV1/i;->l:I

    .line 1554
    .line 1555
    invoke-static {v3, v4}, LV1/h;->j(Landroid/media/metrics/PlaybackStateEvent$Builder;I)Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v3

    .line 1559
    iget-wide v4, v6, LV1/i;->d:J

    .line 1560
    .line 1561
    sub-long/2addr v8, v4

    .line 1562
    invoke-static {v3, v8, v9}, LV1/h;->k(Landroid/media/metrics/PlaybackStateEvent$Builder;J)Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v3

    .line 1566
    invoke-static {v3}, LV1/h;->l(Landroid/media/metrics/PlaybackStateEvent$Builder;)Landroid/media/metrics/PlaybackStateEvent;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v3

    .line 1570
    invoke-static {v2, v3}, LV1/h;->s(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackStateEvent;)V

    .line 1571
    .line 1572
    .line 1573
    :cond_5c
    iget-object v0, v0, LN1/l;->a:Landroid/util/SparseBooleanArray;

    .line 1574
    .line 1575
    const/16 v2, 0x404

    .line 1576
    .line 1577
    invoke-virtual {v0, v2}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 1578
    .line 1579
    .line 1580
    move-result v0

    .line 1581
    if-eqz v0, :cond_5d

    .line 1582
    .line 1583
    iget-object v0, v6, LV1/i;->b:LV1/f;

    .line 1584
    .line 1585
    invoke-virtual {v12, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v2

    .line 1589
    check-cast v2, LV1/a;

    .line 1590
    .line 1591
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1592
    .line 1593
    .line 1594
    invoke-virtual {v0, v2}, LV1/f;->b(LV1/a;)V

    .line 1595
    .line 1596
    .line 1597
    :cond_5d
    :goto_32
    return-void

    .line 1598
    nop

    .line 1599
    :pswitch_data_0
    .packed-switch 0x1772
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    :pswitch_data_1
    .packed-switch 0x1772
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_8
        :pswitch_b
        :pswitch_8
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method

.method public displayMessage(LN9/h;Lz9/E;)V
    .locals 2

    .line 1
    iget-object v0, p0, LA5/h;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LB9/f;

    .line 4
    .line 5
    iget-object v1, v0, LB9/f;->j:LN9/h;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    iget-object v1, v0, LB9/f;->a:Lz9/B;

    .line 10
    .line 11
    iget-boolean v1, v1, Lz9/B;->e:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iput-object p1, v0, LB9/f;->j:LN9/h;

    .line 17
    .line 18
    iput-object p2, v0, LB9/f;->k:Lz9/E;

    .line 19
    .line 20
    iget-object p1, p0, LA5/h;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Landroid/app/Activity;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, LB9/f;->f(Landroid/app/Activity;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    :goto_0
    const-string p1, "Active FIAM exists. Skipping trigger"

    .line 29
    .line 30
    invoke-static {p1}, LD9/e;->a(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public f(LO9/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LA5/h;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LO9/a;

    .line 4
    .line 5
    invoke-interface {v0, p1}, LO9/a;->f(LO9/b;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LA5/h;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LO9/a;

    .line 11
    .line 12
    invoke-interface {v0, p1}, LO9/a;->f(LO9/b;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget v0, p0, LA5/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LV1/i;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LA5/h;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, LV1/a;

    .line 14
    .line 15
    iget-object v1, v0, LV1/a;->d:Lk2/H;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v2, LE4/n;

    .line 21
    .line 22
    iget-object v3, p0, LA5/h;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Lh2/g;

    .line 25
    .line 26
    iget-object v4, v3, Lh2/g;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, LN1/n;

    .line 29
    .line 30
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object v0, v0, LV1/a;->b:LN1/N;

    .line 37
    .line 38
    iget-object v5, p1, LV1/i;->b:LV1/f;

    .line 39
    .line 40
    invoke-virtual {v5, v0, v1}, LV1/f;->d(LN1/N;Lk2/H;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget v1, v3, Lh2/g;->c:I

    .line 45
    .line 46
    const/4 v5, 0x4

    .line 47
    invoke-direct {v2, v0, v1, v5, v4}, LE4/n;-><init>(Ljava/lang/String;IILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget v0, v3, Lh2/g;->b:I

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    if-eq v0, v1, :cond_2

    .line 56
    .line 57
    const/4 v1, 0x2

    .line 58
    if-eq v0, v1, :cond_3

    .line 59
    .line 60
    const/4 v1, 0x3

    .line 61
    if-eq v0, v1, :cond_1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    iput-object v2, p1, LV1/i;->q:LE4/n;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    iput-object v2, p1, LV1/i;->p:LE4/n;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    iput-object v2, p1, LV1/i;->o:LE4/n;

    .line 71
    .line 72
    :goto_0
    return-void

    .line 73
    :pswitch_0
    check-cast p1, LF5/j;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, LA5/h;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, LF5/a;

    .line 81
    .line 82
    iget-object v1, v0, LF5/a;->d:Lf6/z;

    .line 83
    .line 84
    if-nez v1, :cond_4

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    new-instance v2, LS3/e;

    .line 88
    .line 89
    iget-object v3, p0, LA5/h;->c:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v3, Lf6/u;

    .line 92
    .line 93
    iget-object v4, v3, Lf6/u;->c:LE5/T;

    .line 94
    .line 95
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    iget-object v0, v0, LF5/a;->b:LE5/J0;

    .line 102
    .line 103
    iget-object v5, p1, LF5/j;->b:LF5/h;

    .line 104
    .line 105
    invoke-virtual {v5, v0, v1}, LF5/h;->c(LE5/J0;Lf6/z;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const/4 v1, 0x5

    .line 110
    const/4 v5, 0x0

    .line 111
    invoke-direct {v2, v4, v5, v0, v1}, LS3/e;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 112
    .line 113
    .line 114
    iget v0, v3, Lf6/u;->b:I

    .line 115
    .line 116
    if-eqz v0, :cond_7

    .line 117
    .line 118
    const/4 v1, 0x1

    .line 119
    if-eq v0, v1, :cond_6

    .line 120
    .line 121
    const/4 v1, 0x2

    .line 122
    if-eq v0, v1, :cond_7

    .line 123
    .line 124
    const/4 v1, 0x3

    .line 125
    if-eq v0, v1, :cond_5

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_5
    iput-object v2, p1, LF5/j;->q:LS3/e;

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_6
    iput-object v2, p1, LF5/j;->p:LS3/e;

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_7
    iput-object v2, p1, LF5/j;->o:LS3/e;

    .line 135
    .line 136
    :goto_1
    return-void

    .line 137
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public o(LC6/l;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LA5/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-class v0, Landroid/content/Context;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, LC6/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Landroid/content/Context;

    .line 13
    .line 14
    iget-object v0, p0, LA5/h;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lm9/B;

    .line 17
    .line 18
    iget v0, v0, Lm9/B;->a:I

    .line 19
    .line 20
    packed-switch v0, :pswitch_data_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    invoke-static {p1}, Lcom/google/firebase/FirebaseCommonRegistrar;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :cond_0
    const-string p1, ""

    .line 44
    .line 45
    goto/16 :goto_0

    .line 46
    .line 47
    :pswitch_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-string v2, "android.hardware.type.television"

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    const-string p1, "tv"

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const-string v2, "android.hardware.type.watch"

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_2

    .line 75
    .line 76
    const-string p1, "watch"

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    const-string v2, "android.hardware.type.automotive"

    .line 84
    .line 85
    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_3

    .line 90
    .line 91
    const-string p1, "auto"

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    const/16 v1, 0x1a

    .line 95
    .line 96
    if-lt v0, v1, :cond_4

    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const-string v0, "android.hardware.type.embedded"

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-eqz p1, :cond_4

    .line 109
    .line 110
    const-string p1, "embedded"

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_4
    const-string p1, ""

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :pswitch_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-eqz p1, :cond_5

    .line 121
    .line 122
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 123
    .line 124
    const/16 v1, 0x18

    .line 125
    .line 126
    if-lt v0, v1, :cond_5

    .line 127
    .line 128
    invoke-static {p1}, LW1/p;->b(Landroid/content/pm/ApplicationInfo;)I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    goto :goto_0

    .line 137
    :cond_5
    const-string p1, ""

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :pswitch_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    if-eqz p1, :cond_6

    .line 145
    .line 146
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 147
    .line 148
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    goto :goto_0

    .line 153
    :cond_6
    const-string p1, ""

    .line 154
    .line 155
    :goto_0
    new-instance v0, LY9/a;

    .line 156
    .line 157
    iget-object v1, p0, LA5/h;->b:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v1, Ljava/lang/String;

    .line 160
    .line 161
    invoke-direct {v0, v1, p1}, LY9/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    return-object v0

    .line 165
    :pswitch_3
    new-instance v0, LG8/d;

    .line 166
    .line 167
    const-class v1, Ls8/g;

    .line 168
    .line 169
    invoke-virtual {p1, v1}, LC6/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    check-cast v1, Ls8/g;

    .line 174
    .line 175
    iget-object v2, p0, LA5/h;->b:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v2, LL8/t;

    .line 178
    .line 179
    invoke-virtual {p1, v2}, LC6/l;->b(LL8/t;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    check-cast v2, Ljava/util/concurrent/Executor;

    .line 184
    .line 185
    iget-object v3, p0, LA5/h;->c:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v3, LL8/t;

    .line 188
    .line 189
    invoke-virtual {p1, v3}, LC6/l;->b(LL8/t;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    check-cast p1, Ljava/util/concurrent/Executor;

    .line 194
    .line 195
    invoke-direct {v0, v1, v2, p1}, LG8/d;-><init>(Ls8/g;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    .line 196
    .line 197
    .line 198
    return-object v0

    .line 199
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_3
    .end packed-switch

    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    :pswitch_data_1
    .packed-switch 0x13
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 4

    .line 1
    iget v0, p0, LA5/h;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA5/h;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LYc/f;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, LA5/h;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ltc/g;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 v0, 0x0

    .line 43
    :goto_0
    const-string v2, "code"

    .line 44
    .line 45
    const-string v3, "unknown"

    .line 46
    .line 47
    invoke-static {v2, v3}, Lcb/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const-string v3, "message"

    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {v2, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    const-string p1, "An unknown error has occurred."

    .line 64
    .line 65
    invoke-virtual {v2, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    :goto_1
    const-string p1, "firebase_messaging"

    .line 69
    .line 70
    invoke-virtual {v1, p1, v0, v2}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :goto_2
    return-void

    .line 74
    :sswitch_0
    iget-object p1, p0, LA5/h;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, LW9/g;

    .line 77
    .line 78
    iget-object v0, p0, LA5/h;->c:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Landroid/content/Intent;

    .line 81
    .line 82
    invoke-virtual {p1, v0}, LW9/g;->a(Landroid/content/Intent;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :sswitch_1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-object v1, p0, LA5/h;->b:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, LPc/p;

    .line 93
    .line 94
    if-eqz v0, :cond_3

    .line 95
    .line 96
    iget-object p1, p0, LA5/h;->c:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p1, LJ8/o;

    .line 99
    .line 100
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->j0(LJ8/o;)LPc/N;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {v1, p1}, LPc/p;->a(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-static {p1}, La/a;->G(Ljava/lang/Exception;)LPc/t;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {v1, p1}, LPc/p;->b(Ljava/lang/Exception;)V

    .line 117
    .line 118
    .line 119
    :goto_3
    return-void

    .line 120
    :sswitch_2
    iget-object v0, p0, LA5/h;->b:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, LOc/b;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    iget-object v1, p0, LA5/h;->c:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v1, Ltc/g;

    .line 134
    .line 135
    if-eqz v0, :cond_4

    .line 136
    .line 137
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    if-eqz p1, :cond_5

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    goto :goto_4

    .line 156
    :cond_5
    const/4 v0, 0x0

    .line 157
    :goto_4
    const-string v2, "code"

    .line 158
    .line 159
    const-string v3, "unknown"

    .line 160
    .line 161
    invoke-static {v2, v3}, Lcb/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    const-string v3, "message"

    .line 166
    .line 167
    if-eqz p1, :cond_6

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {v2, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_6
    const-string p1, "An unknown error has occurred."

    .line 178
    .line 179
    invoke-virtual {v2, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    :goto_5
    const-string p1, "firebase_app_check"

    .line 183
    .line 184
    invoke-virtual {v1, p1, v0, v2}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :goto_6
    return-void

    .line 188
    nop

    .line 189
    :sswitch_data_0
    .sparse-switch
        0x11 -> :sswitch_2
        0x12 -> :sswitch_1
        0x17 -> :sswitch_0
    .end sparse-switch
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    iget-object v0, p0, LA5/h;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LVc/d;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lvf/a;->n(Ljava/lang/Exception;)Ljava/util/HashMap;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v2, p0, LA5/h;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Luc/h;

    .line 19
    .line 20
    const-string v3, "firebase_firestore"

    .line 21
    .line 22
    invoke-virtual {v2, v3, p1, v1}, Luc/h;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-virtual {v0, p1}, LVc/d;->onCancel(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LA5/h;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LKa/c;

    .line 6
    .line 7
    iget-object v2, v1, LA5/h;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ltc/g;

    .line 10
    .line 11
    move-object/from16 v3, p1

    .line 12
    .line 13
    check-cast v3, LCa/f;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v4, "text"

    .line 24
    .line 25
    iget-object v5, v3, LCa/f;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    new-instance v4, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iget-object v3, v3, LCa/f;->a:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_3

    .line 50
    .line 51
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    check-cast v5, LCa/e;

    .line 56
    .line 57
    new-instance v6, Ljava/util/HashMap;

    .line 58
    .line 59
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5}, LCa/d;->p()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    iget-object v8, v5, LCa/d;->c:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v8, Landroid/graphics/Rect;

    .line 69
    .line 70
    iget-object v9, v5, LCa/d;->d:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v9, [Landroid/graphics/Point;

    .line 73
    .line 74
    iget-object v10, v5, LCa/d;->b:Ljava/io/Serializable;

    .line 75
    .line 76
    check-cast v10, Ljava/lang/String;

    .line 77
    .line 78
    const/4 v11, 0x0

    .line 79
    const/4 v12, 0x0

    .line 80
    invoke-static/range {v6 .. v12}, LKa/c;->a(Ljava/util/HashMap;Ljava/lang/String;Landroid/graphics/Rect;[Landroid/graphics/Point;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)V

    .line 81
    .line 82
    .line 83
    new-instance v7, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    monitor-enter v5

    .line 89
    :try_start_0
    iget-object v8, v5, LCa/e;->e:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    monitor-exit v5

    .line 92
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    if-eqz v8, :cond_2

    .line 101
    .line 102
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    check-cast v8, LCa/b;

    .line 107
    .line 108
    new-instance v9, Ljava/util/HashMap;

    .line 109
    .line 110
    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v8}, LCa/d;->p()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    iget-object v11, v8, LCa/d;->c:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v11, Landroid/graphics/Rect;

    .line 120
    .line 121
    iget-object v12, v8, LCa/d;->d:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v12, [Landroid/graphics/Point;

    .line 124
    .line 125
    iget-object v13, v8, LCa/d;->b:Ljava/io/Serializable;

    .line 126
    .line 127
    check-cast v13, Ljava/lang/String;

    .line 128
    .line 129
    iget v14, v8, LCa/b;->f:F

    .line 130
    .line 131
    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 132
    .line 133
    .line 134
    move-result-object v14

    .line 135
    iget v15, v8, LCa/b;->g:F

    .line 136
    .line 137
    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 138
    .line 139
    .line 140
    move-result-object v15

    .line 141
    invoke-static/range {v9 .. v15}, LKa/c;->a(Ljava/util/HashMap;Ljava/lang/String;Landroid/graphics/Rect;[Landroid/graphics/Point;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)V

    .line 142
    .line 143
    .line 144
    new-instance v10, Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v8}, LCa/b;->q()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    if-eqz v11, :cond_1

    .line 162
    .line 163
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v11

    .line 167
    check-cast v11, LCa/a;

    .line 168
    .line 169
    new-instance v12, Ljava/util/HashMap;

    .line 170
    .line 171
    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v11}, LCa/d;->p()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v13

    .line 178
    iget-object v14, v11, LCa/d;->c:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v14, Landroid/graphics/Rect;

    .line 181
    .line 182
    iget-object v15, v11, LCa/d;->d:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v15, [Landroid/graphics/Point;

    .line 185
    .line 186
    iget-object v1, v11, LCa/d;->b:Ljava/io/Serializable;

    .line 187
    .line 188
    move-object/from16 v16, v1

    .line 189
    .line 190
    check-cast v16, Ljava/lang/String;

    .line 191
    .line 192
    iget v1, v11, LCa/a;->f:F

    .line 193
    .line 194
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 195
    .line 196
    .line 197
    move-result-object v17

    .line 198
    iget v1, v11, LCa/a;->g:F

    .line 199
    .line 200
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 201
    .line 202
    .line 203
    move-result-object v18

    .line 204
    invoke-static/range {v12 .. v18}, LKa/c;->a(Ljava/util/HashMap;Ljava/lang/String;Landroid/graphics/Rect;[Landroid/graphics/Point;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)V

    .line 205
    .line 206
    .line 207
    new-instance v1, Ljava/util/ArrayList;

    .line 208
    .line 209
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v11}, LCa/a;->q()Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v11

    .line 216
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v11

    .line 220
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v13

    .line 224
    if-eqz v13, :cond_0

    .line 225
    .line 226
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v13

    .line 230
    check-cast v13, LCa/c;

    .line 231
    .line 232
    new-instance v14, Ljava/util/HashMap;

    .line 233
    .line 234
    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v13}, LCa/d;->p()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v15

    .line 241
    move-object/from16 p1, v3

    .line 242
    .line 243
    iget-object v3, v13, LCa/d;->c:Ljava/lang/Object;

    .line 244
    .line 245
    move-object/from16 v16, v3

    .line 246
    .line 247
    check-cast v16, Landroid/graphics/Rect;

    .line 248
    .line 249
    iget-object v3, v13, LCa/d;->d:Ljava/lang/Object;

    .line 250
    .line 251
    move-object/from16 v17, v3

    .line 252
    .line 253
    check-cast v17, [Landroid/graphics/Point;

    .line 254
    .line 255
    iget-object v3, v13, LCa/d;->b:Ljava/io/Serializable;

    .line 256
    .line 257
    move-object/from16 v18, v3

    .line 258
    .line 259
    check-cast v18, Ljava/lang/String;

    .line 260
    .line 261
    iget v3, v13, LCa/c;->e:F

    .line 262
    .line 263
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 264
    .line 265
    .line 266
    move-result-object v19

    .line 267
    iget v3, v13, LCa/c;->f:F

    .line 268
    .line 269
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 270
    .line 271
    .line 272
    move-result-object v20

    .line 273
    invoke-static/range {v14 .. v20}, LKa/c;->a(Ljava/util/HashMap;Ljava/lang/String;Landroid/graphics/Rect;[Landroid/graphics/Point;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-object/from16 v3, p1

    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_0
    move-object/from16 p1, v3

    .line 283
    .line 284
    const-string v3, "symbols"

    .line 285
    .line 286
    invoke-virtual {v12, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-object/from16 v1, p0

    .line 293
    .line 294
    move-object/from16 v3, p1

    .line 295
    .line 296
    goto/16 :goto_2

    .line 297
    .line 298
    :cond_1
    move-object/from16 p1, v3

    .line 299
    .line 300
    const-string v1, "elements"

    .line 301
    .line 302
    invoke-virtual {v9, v1, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-object/from16 v1, p0

    .line 309
    .line 310
    goto/16 :goto_1

    .line 311
    .line 312
    :cond_2
    move-object/from16 p1, v3

    .line 313
    .line 314
    const-string v1, "lines"

    .line 315
    .line 316
    invoke-virtual {v6, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-object/from16 v1, p0

    .line 323
    .line 324
    goto/16 :goto_0

    .line 325
    .line 326
    :catchall_0
    move-exception v0

    .line 327
    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 328
    throw v0

    .line 329
    :cond_3
    const-string v1, "blocks"

    .line 330
    .line 331
    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    return-void
.end method

.method public run()V
    .locals 6

    .line 1
    iget v0, p0, LA5/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA5/h;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LJ9/V;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, LA5/h;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, LJ9/S;

    .line 16
    .line 17
    invoke-static {v1}, LHe/g;->a(Ljava/lang/Object;)LHe/g;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, v0, LJ9/V;->c:LHe/g;

    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    iget-object v0, p0, LA5/h;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, LJ9/o;

    .line 27
    .line 28
    iget-object v1, v0, LJ9/o;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, LJ9/G;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, LJ9/o;->i:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, LN9/h;

    .line 38
    .line 39
    iget-object v2, v0, LN9/h;->b:LE5/b;

    .line 40
    .line 41
    iget-boolean v2, v2, LE5/b;->b:Z

    .line 42
    .line 43
    if-nez v2, :cond_0

    .line 44
    .line 45
    iget-object v2, v1, LJ9/G;->c:LP9/d;

    .line 46
    .line 47
    check-cast v2, LP9/c;

    .line 48
    .line 49
    invoke-virtual {v2}, LP9/c;->d()Lcom/google/android/gms/tasks/Task;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    new-instance v3, LA5/g;

    .line 54
    .line 55
    iget-object v4, p0, LA5/h;->c:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v4, Lz9/C;

    .line 58
    .line 59
    const/4 v5, 0x4

    .line 60
    invoke-direct {v3, v1, v0, v4, v5}, LA5/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 61
    .line 62
    .line 63
    iget-object v4, v1, LJ9/G;->g:Ljava/util/concurrent/Executor;

    .line 64
    .line 65
    invoke-virtual {v2, v4, v3}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 66
    .line 67
    .line 68
    const-string v2, "fiam_dismiss"

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    invoke-virtual {v1, v0, v2, v3}, LJ9/G;->c(LN9/h;Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    :cond_0
    iget-object v0, v1, LJ9/G;->f:LJ9/j;

    .line 75
    .line 76
    iget-object v0, v0, LJ9/j;->c:Ljava/util/HashMap;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-nez v1, :cond_1

    .line 91
    .line 92
    return-void

    .line 93
    :cond_1
    invoke-static {v0}, LVa/M6;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    throw v0

    .line 98
    :pswitch_1
    iget-object v0, p0, LA5/h;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, LJ9/o;

    .line 101
    .line 102
    iget-object v1, v0, LJ9/o;->g:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v1, LJ9/G;

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iget-object v0, v0, LJ9/o;->i:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v0, LN9/h;

    .line 112
    .line 113
    iget-object v2, v0, LN9/h;->b:LE5/b;

    .line 114
    .line 115
    iget-boolean v2, v2, LE5/b;->b:Z

    .line 116
    .line 117
    if-nez v2, :cond_2

    .line 118
    .line 119
    iget-object v2, v1, LJ9/G;->c:LP9/d;

    .line 120
    .line 121
    check-cast v2, LP9/c;

    .line 122
    .line 123
    invoke-virtual {v2}, LP9/c;->d()Lcom/google/android/gms/tasks/Task;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    new-instance v3, LA5/g;

    .line 128
    .line 129
    iget-object v4, p0, LA5/h;->c:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v4, Lz9/D;

    .line 132
    .line 133
    const/4 v5, 0x3

    .line 134
    invoke-direct {v3, v1, v0, v4, v5}, LA5/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 135
    .line 136
    .line 137
    iget-object v0, v1, LJ9/G;->g:Ljava/util/concurrent/Executor;

    .line 138
    .line 139
    invoke-virtual {v2, v0, v3}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 140
    .line 141
    .line 142
    :cond_2
    iget-object v0, v1, LJ9/G;->f:LJ9/j;

    .line 143
    .line 144
    iget-object v0, v0, LJ9/j;->d:Ljava/util/HashMap;

    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-nez v1, :cond_3

    .line 159
    .line 160
    return-void

    .line 161
    :cond_3
    invoke-static {v0}, LVa/M6;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    throw v0

    .line 166
    :pswitch_2
    iget-object v0, p0, LA5/h;->b:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, LJ9/f;

    .line 169
    .line 170
    iget-object v1, p0, LA5/h;->c:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v1, Lta/o;

    .line 173
    .line 174
    iput-object v1, v0, LJ9/f;->d:Lta/o;

    .line 175
    .line 176
    return-void

    .line 177
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    iget-object v0, p0, LA5/h;->b:Ljava/lang/Object;

    check-cast v0, Laa/c;

    iget-object v1, p0, LA5/h;->c:Ljava/lang/Object;

    check-cast v1, Laa/e;

    check-cast p1, Ljava/lang/Void;

    .line 1
    monitor-enter v0

    .line 2
    :try_start_0
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iput-object p1, v0, Laa/c;->c:Lcom/google/android/gms/tasks/Task;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit v0

    .line 4
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 5
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, LA5/h;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LA5/h;->b:Ljava/lang/Object;

    check-cast v0, Laa/h;

    iget-object v1, p0, LA5/h;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Date;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 7
    iget-object v0, v0, Laa/h;->g:Laa/k;

    .line 8
    iget-object v2, v0, Laa/k;->b:Ljava/lang/Object;

    .line 9
    monitor-enter v2

    .line 10
    :try_start_0
    iget-object v0, v0, Laa/k;->a:Landroid/content/SharedPreferences;

    .line 11
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v3, "last_fetch_status"

    const/4 v4, -0x1

    .line 12
    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v3, "last_fetch_time_in_millis"

    .line 13
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-interface {v0, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 14
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 15
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 16
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 17
    :cond_1
    instance-of v1, v1, LZ9/g;

    if-eqz v1, :cond_2

    .line 18
    iget-object v0, v0, Laa/h;->g:Laa/k;

    invoke-virtual {v0}, Laa/k;->g()V

    goto :goto_0

    .line 19
    :cond_2
    iget-object v0, v0, Laa/h;->g:Laa/k;

    invoke-virtual {v0}, Laa/k;->f()V

    :goto_0
    return-object p1

    .line 20
    :pswitch_0
    invoke-direct {p0, p1}, LA5/h;->c(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_0
    .end packed-switch
.end method
