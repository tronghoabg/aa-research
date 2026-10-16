.class public final synthetic LUc/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LUc/f;


# direct methods
.method public synthetic constructor <init>(LUc/f;I)V
    .locals 0

    .line 1
    iput p2, p0, LUc/k;->a:I

    iput-object p1, p0, LUc/k;->b:LUc/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lba/a;)V
    .locals 12

    .line 1
    iget v0, p0, LUc/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    move-object v4, v1

    .line 19
    check-cast v4, LUc/n;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    move-object v6, v1

    .line 27
    check-cast v6, Ljava/lang/String;

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    move-object v5, p1

    .line 35
    check-cast v5, Ljava/lang/String;

    .line 36
    .line 37
    new-instance v7, LPc/p;

    .line 38
    .line 39
    const/16 p1, 0xd

    .line 40
    .line 41
    invoke-direct {v7, v0, p2, p1}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 42
    .line 43
    .line 44
    iget-object v3, p0, LUc/k;->b:LUc/f;

    .line 45
    .line 46
    sget-object p1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 47
    .line 48
    new-instance v2, LKb/c;

    .line 49
    .line 50
    invoke-direct/range {v2 .. v7}, LKb/c;-><init>(LUc/f;LUc/n;Ljava/lang/String;Ljava/lang/String;LPc/p;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_0
    new-instance v0, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    check-cast p1, Ljava/util/ArrayList;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Ljava/lang/String;

    .line 70
    .line 71
    const/4 v3, 0x2

    .line 72
    invoke-static {v3}, LA/f;->g(I)[I

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    const/4 v5, 0x1

    .line 77
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    check-cast v5, Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    aget v4, v4, v5

    .line 88
    .line 89
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, Ljava/util/List;

    .line 94
    .line 95
    iget-object v3, p0, LUc/k;->b:LUc/f;

    .line 96
    .line 97
    iget-object v3, v3, LUc/f;->g:Ljava/util/HashMap;

    .line 98
    .line 99
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    check-cast v2, LVc/g;

    .line 104
    .line 105
    invoke-static {v2}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    iput v4, v2, LVc/g;->f:I

    .line 109
    .line 110
    iput-object p1, v2, LVc/g;->g:Ljava/util/List;

    .line 111
    .line 112
    iget-object p1, v2, LVc/g;->e:Ljava/util/concurrent/Semaphore;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/util/concurrent/Semaphore;->release()V

    .line 115
    .line 116
    .line 117
    const/4 p1, 0x0

    .line 118
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_1
    new-instance v0, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 128
    .line 129
    .line 130
    check-cast p1, Ljava/util/ArrayList;

    .line 131
    .line 132
    const/4 v1, 0x0

    .line 133
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    check-cast p1, LUc/n;

    .line 138
    .line 139
    iget-object v2, p0, LUc/k;->b:LUc/f;

    .line 140
    .line 141
    invoke-static {p1}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    new-instance v3, LOc/d;

    .line 146
    .line 147
    const/4 v4, 0x3

    .line 148
    invoke-direct {v3, v4}, LOc/d;-><init>(I)V

    .line 149
    .line 150
    .line 151
    iput-object p1, v3, LOc/d;->c:Ljava/lang/Object;

    .line 152
    .line 153
    const-string p1, "plugins.flutter.io/firebase_firestore/snapshotsInSync"

    .line 154
    .line 155
    invoke-virtual {v2, p1, v3}, LUc/f;->f(Ljava/lang/String;Luc/i;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :pswitch_2
    new-instance v0, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 169
    .line 170
    .line 171
    check-cast p1, Ljava/util/ArrayList;

    .line 172
    .line 173
    const/4 v1, 0x0

    .line 174
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    check-cast v2, LUc/n;

    .line 179
    .line 180
    const/4 v3, 0x1

    .line 181
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    check-cast v3, Ljava/lang/Number;

    .line 186
    .line 187
    const/4 v4, 0x2

    .line 188
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    check-cast p1, Ljava/lang/Number;

    .line 193
    .line 194
    const/4 v4, 0x0

    .line 195
    if-nez v3, :cond_0

    .line 196
    .line 197
    move-object v3, v4

    .line 198
    goto :goto_0

    .line 199
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 200
    .line 201
    .line 202
    move-result-wide v5

    .line 203
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    :goto_0
    if-nez p1, :cond_1

    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 211
    .line 212
    .line 213
    move-result-wide v4

    .line 214
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    :goto_1
    iget-object p1, p0, LUc/k;->b:LUc/f;

    .line 219
    .line 220
    invoke-static {v2}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 233
    .line 234
    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    new-instance v6, LVc/g;

    .line 239
    .line 240
    new-instance v7, LA5/h;

    .line 241
    .line 242
    const/16 v8, 0x13

    .line 243
    .line 244
    invoke-direct {v7, v8, p1, v5}, LA5/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-direct {v6, v7, v2, v3, v4}, LVc/g;-><init>(LA5/h;Lcom/google/firebase/firestore/FirebaseFirestore;Ljava/lang/Long;Ljava/lang/Long;)V

    .line 248
    .line 249
    .line 250
    const-string v2, "plugins.flutter.io/firebase_firestore/transaction"

    .line 251
    .line 252
    invoke-virtual {p1, v2, v5, v6}, LUc/f;->g(Ljava/lang/String;Ljava/lang/String;Luc/i;)V

    .line 253
    .line 254
    .line 255
    iget-object p1, p1, LUc/f;->g:Ljava/util/HashMap;

    .line 256
    .line 257
    invoke-virtual {p1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v1, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :pswitch_3
    new-instance v0, Ljava/util/ArrayList;

    .line 268
    .line 269
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 270
    .line 271
    .line 272
    check-cast p1, Ljava/util/ArrayList;

    .line 273
    .line 274
    const/4 v1, 0x0

    .line 275
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    check-cast v2, LUc/n;

    .line 280
    .line 281
    const/4 v3, 0x1

    .line 282
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    check-cast v4, LUc/j;

    .line 287
    .line 288
    const/4 v5, 0x2

    .line 289
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    check-cast v6, Ljava/lang/Boolean;

    .line 294
    .line 295
    invoke-static {v5}, LA/f;->g(I)[I

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    const/4 v8, 0x3

    .line 300
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    check-cast p1, Ljava/lang/Integer;

    .line 305
    .line 306
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 307
    .line 308
    .line 309
    move-result p1

    .line 310
    aget p1, v7, p1

    .line 311
    .line 312
    iget-object v7, p0, LUc/k;->b:LUc/f;

    .line 313
    .line 314
    invoke-static {v2}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 315
    .line 316
    .line 317
    invoke-static {v2}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    iget-object v8, v4, LUc/j;->a:Ljava/lang/String;

    .line 322
    .line 323
    invoke-virtual {v2, v8}, Lcom/google/firebase/firestore/FirebaseFirestore;->d(Ljava/lang/String;)Lm9/m;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    new-instance v8, LVc/b;

    .line 328
    .line 329
    iget v4, v4, LUc/j;->e:I

    .line 330
    .line 331
    invoke-static {v4}, Lxg/g;->G(I)Lm9/n;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    invoke-static {p1}, Lxg/g;->E(I)I

    .line 336
    .line 337
    .line 338
    move-result p1

    .line 339
    const/4 v9, 0x0

    .line 340
    invoke-direct {v8, v9}, LVc/b;-><init>(I)V

    .line 341
    .line 342
    .line 343
    iput-object v2, v8, LVc/b;->f:Ljava/lang/Object;

    .line 344
    .line 345
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    if-eqz v2, :cond_2

    .line 350
    .line 351
    move v3, v5

    .line 352
    :cond_2
    iput v3, v8, LVc/b;->b:I

    .line 353
    .line 354
    iput-object v4, v8, LVc/b;->c:Lm9/n;

    .line 355
    .line 356
    iput p1, v8, LVc/b;->d:I

    .line 357
    .line 358
    const-string p1, "plugins.flutter.io/firebase_firestore/document"

    .line 359
    .line 360
    invoke-virtual {v7, p1, v8}, LUc/f;->f(Ljava/lang/String;Luc/i;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {p2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    return-void

    .line 371
    :pswitch_4
    new-instance v0, Ljava/util/ArrayList;

    .line 372
    .line 373
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 374
    .line 375
    .line 376
    check-cast p1, Ljava/util/ArrayList;

    .line 377
    .line 378
    const/4 v1, 0x0

    .line 379
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    check-cast v2, LUc/n;

    .line 384
    .line 385
    const/4 v3, 0x1

    .line 386
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    check-cast v4, Ljava/lang/String;

    .line 391
    .line 392
    const/4 v5, 0x2

    .line 393
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    check-cast v6, Ljava/lang/Boolean;

    .line 398
    .line 399
    const/4 v7, 0x3

    .line 400
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v7

    .line 404
    check-cast v7, LUc/u;

    .line 405
    .line 406
    const/4 v8, 0x4

    .line 407
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v8

    .line 411
    check-cast v8, LUc/t;

    .line 412
    .line 413
    const/4 v9, 0x5

    .line 414
    invoke-virtual {p1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v9

    .line 418
    check-cast v9, Ljava/lang/Boolean;

    .line 419
    .line 420
    invoke-static {v5}, LA/f;->g(I)[I

    .line 421
    .line 422
    .line 423
    move-result-object v10

    .line 424
    const/4 v11, 0x6

    .line 425
    invoke-virtual {p1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object p1

    .line 429
    check-cast p1, Ljava/lang/Integer;

    .line 430
    .line 431
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 432
    .line 433
    .line 434
    move-result p1

    .line 435
    aget p1, v10, p1

    .line 436
    .line 437
    iget-object v10, p0, LUc/k;->b:LUc/f;

    .line 438
    .line 439
    invoke-static {v2}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 444
    .line 445
    .line 446
    move-result v6

    .line 447
    invoke-static {v2, v4, v6, v7}, Lxg/g;->I(Lcom/google/firebase/firestore/FirebaseFirestore;Ljava/lang/String;ZLUc/u;)Lm9/W;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    if-nez v2, :cond_3

    .line 452
    .line 453
    new-instance p1, LUc/o;

    .line 454
    .line 455
    const-string v0, "An error occurred while parsing query arguments, see native logs for more information. Please report this issue."

    .line 456
    .line 457
    const/4 v1, 0x0

    .line 458
    const-string v2, "invalid_query"

    .line 459
    .line 460
    invoke-direct {p1, v2, v0, v1}, LUc/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    .line 461
    .line 462
    .line 463
    invoke-static {p1}, LA6/h;->R(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 464
    .line 465
    .line 466
    move-result-object p1

    .line 467
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    goto :goto_2

    .line 471
    :cond_3
    new-instance v4, LVc/b;

    .line 472
    .line 473
    iget v6, v8, LUc/t;->b:I

    .line 474
    .line 475
    invoke-static {v6}, Lxg/g;->G(I)Lm9/n;

    .line 476
    .line 477
    .line 478
    move-result-object v6

    .line 479
    invoke-static {p1}, Lxg/g;->E(I)I

    .line 480
    .line 481
    .line 482
    move-result p1

    .line 483
    const/4 v7, 0x1

    .line 484
    invoke-direct {v4, v7}, LVc/b;-><init>(I)V

    .line 485
    .line 486
    .line 487
    iput-object v2, v4, LVc/b;->f:Ljava/lang/Object;

    .line 488
    .line 489
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 490
    .line 491
    .line 492
    move-result v2

    .line 493
    if-eqz v2, :cond_4

    .line 494
    .line 495
    move v3, v5

    .line 496
    :cond_4
    iput v3, v4, LVc/b;->b:I

    .line 497
    .line 498
    iput-object v6, v4, LVc/b;->c:Lm9/n;

    .line 499
    .line 500
    iput p1, v4, LVc/b;->d:I

    .line 501
    .line 502
    const-string p1, "plugins.flutter.io/firebase_firestore/query"

    .line 503
    .line 504
    invoke-virtual {v10, p1, v4}, LUc/f;->f(Ljava/lang/String;Luc/i;)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object p1

    .line 508
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {p2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 512
    .line 513
    .line 514
    :goto_2
    return-void

    .line 515
    :pswitch_5
    new-instance v0, Ljava/util/ArrayList;

    .line 516
    .line 517
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 518
    .line 519
    .line 520
    check-cast p1, Ljava/util/ArrayList;

    .line 521
    .line 522
    const/4 v1, 0x0

    .line 523
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    check-cast v2, LUc/n;

    .line 528
    .line 529
    const/4 v3, 0x1

    .line 530
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object p1

    .line 534
    check-cast p1, [B

    .line 535
    .line 536
    iget-object v3, p0, LUc/k;->b:LUc/f;

    .line 537
    .line 538
    new-instance v4, LVc/d;

    .line 539
    .line 540
    invoke-static {v2}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    invoke-direct {v4, v2, p1}, LVc/d;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;[B)V

    .line 545
    .line 546
    .line 547
    const-string p1, "plugins.flutter.io/firebase_firestore/loadBundle"

    .line 548
    .line 549
    invoke-virtual {v3, p1, v4}, LUc/f;->f(Ljava/lang/String;Luc/i;)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object p1

    .line 553
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {p2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    return-void

    .line 560
    nop

    .line 561
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
