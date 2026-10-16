.class public final synthetic LUc/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/b;
.implements LQ1/g;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LUc/l;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LUc/f;I)V
    .locals 0

    .line 2
    iput p2, p0, LUc/l;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Ljava/lang/Object;Lba/a;)V
    .locals 11

    .line 1
    iget v0, p0, LUc/l;->a:I

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
    move-result-object v2

    .line 18
    check-cast v2, LUc/n;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Ljava/lang/String;

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    check-cast v6, LUc/u;

    .line 33
    .line 34
    invoke-static {v3}, LA/f;->g(I)[I

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    const/4 v8, 0x3

    .line 39
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    check-cast v8, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    aget v7, v7, v8

    .line 50
    .line 51
    const/4 v8, 0x4

    .line 52
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    check-cast v8, Ljava/util/List;

    .line 57
    .line 58
    const/4 v9, 0x5

    .line 59
    invoke-virtual {p1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Ljava/lang/Boolean;

    .line 64
    .line 65
    new-instance v9, LPc/p;

    .line 66
    .line 67
    const/16 v10, 0xf

    .line 68
    .line 69
    invoke-direct {v9, v0, p2, v10}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 70
    .line 71
    .line 72
    invoke-static {v2}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-static {p2, v4, p1, v6}, Lxg/g;->I(Lcom/google/firebase/firestore/FirebaseFirestore;Ljava/lang/String;ZLUc/u;)Lm9/W;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    new-instance p2, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-eqz v2, :cond_3

    .line 98
    .line 99
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    check-cast v2, LUc/h;

    .line 104
    .line 105
    iget v4, v2, LUc/h;->a:I

    .line 106
    .line 107
    invoke-static {v4}, LA/f;->f(I)I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-eqz v4, :cond_2

    .line 112
    .line 113
    if-eq v4, v3, :cond_1

    .line 114
    .line 115
    if-eq v4, v5, :cond_0

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_0
    iget-object v2, v2, LUc/h;->b:Ljava/lang/String;

    .line 119
    .line 120
    new-instance v4, Lm9/a;

    .line 121
    .line 122
    invoke-static {v2}, Lm9/r;->a(Ljava/lang/String;)Lm9/r;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    const-string v6, "average"

    .line 127
    .line 128
    invoke-direct {v4, v2, v6}, Lm9/d;-><init>(Lm9/r;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_1
    iget-object v2, v2, LUc/h;->b:Ljava/lang/String;

    .line 136
    .line 137
    new-instance v4, Lm9/c;

    .line 138
    .line 139
    invoke-static {v2}, Lm9/r;->a(Ljava/lang/String;)Lm9/r;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    const-string v6, "sum"

    .line 144
    .line 145
    invoke-direct {v4, v2, v6}, Lm9/d;-><init>(Lm9/r;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_2
    new-instance v2, Lm9/b;

    .line 153
    .line 154
    const/4 v4, 0x0

    .line 155
    const-string v6, "count"

    .line 156
    .line 157
    invoke-direct {v2, v4, v6}, Lm9/d;-><init>(Lm9/r;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_3
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    check-cast v0, Lm9/d;

    .line 169
    .line 170
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    invoke-virtual {p2, v3, v2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    new-array v1, v1, [Lm9/d;

    .line 179
    .line 180
    invoke-interface {p2, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    check-cast p2, [Lm9/d;

    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    new-instance v1, Lm9/V;

    .line 190
    .line 191
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 202
    .line 203
    .line 204
    new-instance p2, Lm9/e;

    .line 205
    .line 206
    invoke-direct {p2, p1, v1}, Lm9/e;-><init>(Lm9/W;Lm9/V;)V

    .line 207
    .line 208
    .line 209
    sget-object p1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 210
    .line 211
    new-instance v0, LUc/e;

    .line 212
    .line 213
    invoke-direct {v0, p2, v7, v8, v9}, LUc/e;-><init>(Lm9/e;ILjava/util/List;LPc/p;)V

    .line 214
    .line 215
    .line 216
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :pswitch_0
    new-instance v0, Ljava/util/ArrayList;

    .line 221
    .line 222
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 223
    .line 224
    .line 225
    check-cast p1, Ljava/util/ArrayList;

    .line 226
    .line 227
    const/4 v1, 0x0

    .line 228
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    move-object v4, v1

    .line 233
    check-cast v4, LUc/n;

    .line 234
    .line 235
    const/4 v1, 0x1

    .line 236
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    move-object v5, v1

    .line 241
    check-cast v5, Ljava/lang/String;

    .line 242
    .line 243
    const/4 v1, 0x2

    .line 244
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    move-object v6, v1

    .line 249
    check-cast v6, Ljava/lang/Boolean;

    .line 250
    .line 251
    const/4 v1, 0x3

    .line 252
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    move-object v7, v1

    .line 257
    check-cast v7, LUc/u;

    .line 258
    .line 259
    const/4 v1, 0x4

    .line 260
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    move-object v3, p1

    .line 265
    check-cast v3, LUc/t;

    .line 266
    .line 267
    new-instance v8, LPc/o;

    .line 268
    .line 269
    const/16 p1, 0xf

    .line 270
    .line 271
    invoke-direct {v8, v0, p2, p1}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 272
    .line 273
    .line 274
    sget-object p1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 275
    .line 276
    new-instance v2, LUc/d;

    .line 277
    .line 278
    const/4 v9, 0x0

    .line 279
    invoke-direct/range {v2 .. v9}, LUc/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 280
    .line 281
    .line 282
    invoke-interface {p1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 283
    .line 284
    .line 285
    return-void

    .line 286
    :pswitch_1
    new-instance v0, Ljava/util/ArrayList;

    .line 287
    .line 288
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 289
    .line 290
    .line 291
    check-cast p1, Ljava/util/ArrayList;

    .line 292
    .line 293
    const/4 v1, 0x0

    .line 294
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    check-cast v1, LUc/n;

    .line 299
    .line 300
    const/4 v2, 0x1

    .line 301
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    check-cast p1, LUc/j;

    .line 306
    .line 307
    new-instance v2, LPc/q;

    .line 308
    .line 309
    const/16 v3, 0xe

    .line 310
    .line 311
    invoke-direct {v2, v0, p2, v3}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 312
    .line 313
    .line 314
    sget-object p2, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 315
    .line 316
    new-instance v0, LAb/a;

    .line 317
    .line 318
    const/16 v3, 0xa

    .line 319
    .line 320
    invoke-direct {v0, v1, p1, v2, v3}, LAb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 321
    .line 322
    .line 323
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :pswitch_2
    new-instance v0, Ljava/util/ArrayList;

    .line 328
    .line 329
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 330
    .line 331
    .line 332
    check-cast p1, Ljava/util/ArrayList;

    .line 333
    .line 334
    const/4 v1, 0x0

    .line 335
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    check-cast v1, LUc/n;

    .line 340
    .line 341
    const/4 v2, 0x1

    .line 342
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    check-cast p1, LUc/j;

    .line 347
    .line 348
    new-instance v2, LPc/p;

    .line 349
    .line 350
    const/16 v3, 0xe

    .line 351
    .line 352
    invoke-direct {v2, v0, p2, v3}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 353
    .line 354
    .line 355
    sget-object p2, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 356
    .line 357
    new-instance v0, LAb/a;

    .line 358
    .line 359
    const/16 v3, 0xc

    .line 360
    .line 361
    invoke-direct {v0, p1, v1, v2, v3}, LAb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 362
    .line 363
    .line 364
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 365
    .line 366
    .line 367
    return-void

    .line 368
    :pswitch_3
    new-instance v0, Ljava/util/ArrayList;

    .line 369
    .line 370
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 371
    .line 372
    .line 373
    check-cast p1, Ljava/util/ArrayList;

    .line 374
    .line 375
    const/4 v1, 0x0

    .line 376
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    check-cast v1, LUc/n;

    .line 381
    .line 382
    const/4 v2, 0x1

    .line 383
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    check-cast p1, LUc/j;

    .line 388
    .line 389
    new-instance v2, LPc/o;

    .line 390
    .line 391
    const/16 v3, 0xe

    .line 392
    .line 393
    invoke-direct {v2, v0, p2, v3}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 394
    .line 395
    .line 396
    sget-object p2, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 397
    .line 398
    new-instance v0, LAb/a;

    .line 399
    .line 400
    const/16 v3, 0xe

    .line 401
    .line 402
    invoke-direct {v0, v1, p1, v2, v3}, LAb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 403
    .line 404
    .line 405
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 406
    .line 407
    .line 408
    return-void

    .line 409
    :pswitch_4
    new-instance v0, Ljava/util/ArrayList;

    .line 410
    .line 411
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 412
    .line 413
    .line 414
    check-cast p1, Ljava/util/ArrayList;

    .line 415
    .line 416
    const/4 v1, 0x0

    .line 417
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    check-cast v1, LUc/n;

    .line 422
    .line 423
    const/4 v2, 0x1

    .line 424
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object p1

    .line 428
    check-cast p1, LUc/j;

    .line 429
    .line 430
    new-instance v2, LPc/q;

    .line 431
    .line 432
    const/16 v3, 0xd

    .line 433
    .line 434
    invoke-direct {v2, v0, p2, v3}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 435
    .line 436
    .line 437
    sget-object p2, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 438
    .line 439
    new-instance v0, LAb/a;

    .line 440
    .line 441
    const/16 v3, 0xb

    .line 442
    .line 443
    invoke-direct {v0, v1, p1, v2, v3}, LAb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 444
    .line 445
    .line 446
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 447
    .line 448
    .line 449
    return-void

    .line 450
    :pswitch_5
    new-instance v0, Ljava/util/ArrayList;

    .line 451
    .line 452
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 453
    .line 454
    .line 455
    check-cast p1, Ljava/util/ArrayList;

    .line 456
    .line 457
    const/4 v1, 0x0

    .line 458
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object p1

    .line 462
    check-cast p1, Ljava/lang/Boolean;

    .line 463
    .line 464
    new-instance v1, LPc/q;

    .line 465
    .line 466
    const/16 v2, 0x12

    .line 467
    .line 468
    invoke-direct {v1, v0, p2, v2}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 469
    .line 470
    .line 471
    sget-object p2, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 472
    .line 473
    new-instance v0, LT3/r;

    .line 474
    .line 475
    const/16 v2, 0x8

    .line 476
    .line 477
    invoke-direct {v0, v2, p1, v1}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 481
    .line 482
    .line 483
    return-void

    .line 484
    :pswitch_6
    new-instance v0, Ljava/util/ArrayList;

    .line 485
    .line 486
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 487
    .line 488
    .line 489
    check-cast p1, Ljava/util/ArrayList;

    .line 490
    .line 491
    const/4 v1, 0x0

    .line 492
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    check-cast v1, LUc/n;

    .line 497
    .line 498
    const/4 v2, 0x1

    .line 499
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object p1

    .line 503
    check-cast p1, Ljava/lang/String;

    .line 504
    .line 505
    new-instance v2, LPc/p;

    .line 506
    .line 507
    const/16 v3, 0x12

    .line 508
    .line 509
    invoke-direct {v2, v0, p2, v3}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 510
    .line 511
    .line 512
    sget-object p2, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 513
    .line 514
    new-instance v0, LAb/a;

    .line 515
    .line 516
    const/16 v3, 0x9

    .line 517
    .line 518
    invoke-direct {v0, v1, p1, v2, v3}, LAb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 519
    .line 520
    .line 521
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 522
    .line 523
    .line 524
    return-void

    .line 525
    :pswitch_7
    new-instance v0, Ljava/util/ArrayList;

    .line 526
    .line 527
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 528
    .line 529
    .line 530
    check-cast p1, Ljava/util/ArrayList;

    .line 531
    .line 532
    const/4 v1, 0x0

    .line 533
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object p1

    .line 537
    check-cast p1, LUc/n;

    .line 538
    .line 539
    new-instance v1, LPc/o;

    .line 540
    .line 541
    const/16 v2, 0x12

    .line 542
    .line 543
    invoke-direct {v1, v0, p2, v2}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 544
    .line 545
    .line 546
    sget-object p2, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 547
    .line 548
    new-instance v0, LT3/r;

    .line 549
    .line 550
    const/16 v2, 0xb

    .line 551
    .line 552
    invoke-direct {v0, v2, p1, v1}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 556
    .line 557
    .line 558
    return-void

    .line 559
    :pswitch_8
    new-instance v0, Ljava/util/ArrayList;

    .line 560
    .line 561
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 562
    .line 563
    .line 564
    check-cast p1, Ljava/util/ArrayList;

    .line 565
    .line 566
    const/4 v1, 0x0

    .line 567
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object p1

    .line 571
    check-cast p1, LUc/n;

    .line 572
    .line 573
    new-instance v1, LPc/q;

    .line 574
    .line 575
    const/16 v2, 0x11

    .line 576
    .line 577
    invoke-direct {v1, v0, p2, v2}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 578
    .line 579
    .line 580
    sget-object p2, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 581
    .line 582
    new-instance v0, LT3/r;

    .line 583
    .line 584
    const/16 v2, 0xc

    .line 585
    .line 586
    invoke-direct {v0, v2, p1, v1}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 590
    .line 591
    .line 592
    return-void

    .line 593
    :pswitch_9
    new-instance v0, Ljava/util/ArrayList;

    .line 594
    .line 595
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 596
    .line 597
    .line 598
    check-cast p1, Ljava/util/ArrayList;

    .line 599
    .line 600
    const/4 v1, 0x0

    .line 601
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object p1

    .line 605
    check-cast p1, LUc/n;

    .line 606
    .line 607
    new-instance v1, LPc/p;

    .line 608
    .line 609
    const/16 v2, 0x11

    .line 610
    .line 611
    invoke-direct {v1, v0, p2, v2}, LPc/p;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 612
    .line 613
    .line 614
    sget-object p2, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 615
    .line 616
    new-instance v0, LT3/r;

    .line 617
    .line 618
    const/16 v2, 0xa

    .line 619
    .line 620
    invoke-direct {v0, v2, p1, v1}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 624
    .line 625
    .line 626
    return-void

    .line 627
    :pswitch_a
    new-instance v0, Ljava/util/ArrayList;

    .line 628
    .line 629
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 630
    .line 631
    .line 632
    check-cast p1, Ljava/util/ArrayList;

    .line 633
    .line 634
    const/4 v1, 0x0

    .line 635
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object p1

    .line 639
    check-cast p1, LUc/n;

    .line 640
    .line 641
    new-instance v1, LPc/o;

    .line 642
    .line 643
    const/16 v2, 0x11

    .line 644
    .line 645
    invoke-direct {v1, v0, p2, v2}, LPc/o;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 646
    .line 647
    .line 648
    sget-object p2, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 649
    .line 650
    new-instance v0, LT3/r;

    .line 651
    .line 652
    const/4 v2, 0x7

    .line 653
    invoke-direct {v0, v2, p1, v1}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 654
    .line 655
    .line 656
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 657
    .line 658
    .line 659
    return-void

    .line 660
    :pswitch_b
    new-instance v0, Ljava/util/ArrayList;

    .line 661
    .line 662
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 663
    .line 664
    .line 665
    check-cast p1, Ljava/util/ArrayList;

    .line 666
    .line 667
    const/4 v1, 0x0

    .line 668
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object p1

    .line 672
    check-cast p1, LUc/n;

    .line 673
    .line 674
    new-instance v1, LPc/q;

    .line 675
    .line 676
    const/16 v2, 0x10

    .line 677
    .line 678
    invoke-direct {v1, v0, p2, v2}, LPc/q;-><init>(Ljava/util/ArrayList;Lba/a;I)V

    .line 679
    .line 680
    .line 681
    sget-object p2, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 682
    .line 683
    new-instance v0, LT3/r;

    .line 684
    .line 685
    const/4 v2, 0x6

    .line 686
    invoke-direct {v0, v2, p1, v1}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 687
    .line 688
    .line 689
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 690
    .line 691
    .line 692
    return-void

    .line 693
    :pswitch_data_0
    .packed-switch 0x0
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

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, LUc/l;->a:I

    .line 2
    .line 3
    check-cast p1, LV1/i;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0xd
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
