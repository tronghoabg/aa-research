.class public final synthetic LJ9/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLe/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LJ9/C;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LJ9/C;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, LJ9/z;->a:I

    iput-object p1, p0, LJ9/z;->b:LJ9/C;

    iput-object p2, p0, LJ9/z;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LJ9/z;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lsa/f;

    .line 11
    .line 12
    iget-object v2, v0, LJ9/z;->b:LJ9/C;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lsa/f;->e()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    const-string v3, "ON_FOREGROUND"

    .line 24
    .line 25
    iget-object v4, v0, LJ9/z;->c:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iget-object v3, v2, LJ9/C;->h:LJ9/V;

    .line 34
    .line 35
    invoke-virtual {v3}, LJ9/V;->a()LHe/g;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-static {}, LJ9/S;->c()LJ9/S;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-static {v5}, LHe/g;->a(Ljava/lang/Object;)LHe/g;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v4, v5}, LHe/g;->d(LHe/g;)LHe/g;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    new-instance v5, LJ9/T;

    .line 52
    .line 53
    iget-object v2, v2, LJ9/C;->i:LN9/b;

    .line 54
    .line 55
    const/4 v6, 0x2

    .line 56
    invoke-direct {v5, v3, v2, v6}, LJ9/T;-><init>(LJ9/V;LN9/b;I)V

    .line 57
    .line 58
    .line 59
    new-instance v6, LSe/j;

    .line 60
    .line 61
    const/4 v7, 0x1

    .line 62
    invoke-direct {v6, v4, v5, v7}, LSe/j;-><init>(LHe/g;LLe/c;I)V

    .line 63
    .line 64
    .line 65
    new-instance v4, LJ9/T;

    .line 66
    .line 67
    const/4 v5, 0x3

    .line 68
    invoke-direct {v4, v3, v2, v5}, LJ9/T;-><init>(LJ9/V;LN9/b;I)V

    .line 69
    .line 70
    .line 71
    new-instance v2, LSe/g;

    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    invoke-direct {v2, v6, v4, v3}, LSe/g;-><init>(LHe/g;Ljava/lang/Object;I)V

    .line 75
    .line 76
    .line 77
    new-instance v3, LSe/n;

    .line 78
    .line 79
    invoke-direct {v3, v2}, LSe/n;-><init>(LHe/g;)V

    .line 80
    .line 81
    .line 82
    new-instance v2, LF5/d;

    .line 83
    .line 84
    const/16 v4, 0x15

    .line 85
    .line 86
    invoke-direct {v2, v4}, LF5/d;-><init>(I)V

    .line 87
    .line 88
    .line 89
    new-instance v4, LUe/a;

    .line 90
    .line 91
    const/4 v5, 0x1

    .line 92
    invoke-direct {v4, v3, v2, v5}, LUe/a;-><init>(LHe/n;Ljava/lang/Object;I)V

    .line 93
    .line 94
    .line 95
    new-instance v2, LUe/b;

    .line 96
    .line 97
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 98
    .line 99
    .line 100
    new-instance v3, LA7/h0;

    .line 101
    .line 102
    const/4 v5, 0x5

    .line 103
    invoke-direct {v3, v2, v5}, LA7/h0;-><init>(Ljava/lang/Object;I)V

    .line 104
    .line 105
    .line 106
    new-instance v2, LUe/a;

    .line 107
    .line 108
    const/4 v5, 0x2

    .line 109
    invoke-direct {v2, v4, v3, v5}, LUe/a;-><init>(LHe/n;Ljava/lang/Object;I)V

    .line 110
    .line 111
    .line 112
    new-instance v3, LF5/d;

    .line 113
    .line 114
    const/16 v4, 0x16

    .line 115
    .line 116
    invoke-direct {v3, v4}, LF5/d;-><init>(I)V

    .line 117
    .line 118
    .line 119
    new-instance v4, LSe/h;

    .line 120
    .line 121
    const/4 v5, 0x0

    .line 122
    invoke-direct {v4, v5, v2, v3}, LSe/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    new-instance v2, LJ9/v;

    .line 126
    .line 127
    invoke-direct {v2, v1}, LJ9/v;-><init>(Lsa/f;)V

    .line 128
    .line 129
    .line 130
    new-instance v1, LSe/j;

    .line 131
    .line 132
    const/4 v3, 0x1

    .line 133
    invoke-direct {v1, v4, v2, v3}, LSe/j;-><init>(LHe/g;LLe/c;I)V

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_0
    invoke-static {v1}, LHe/g;->a(Ljava/lang/Object;)LHe/g;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    :goto_0
    return-object v1

    .line 142
    :pswitch_0
    move-object/from16 v1, p1

    .line 143
    .line 144
    check-cast v1, Lsa/f;

    .line 145
    .line 146
    iget-object v2, v0, LJ9/z;->b:LJ9/C;

    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, Lsa/f;->f()I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    const/4 v4, 0x1

    .line 156
    invoke-static {v3, v4}, LA/f;->b(II)Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    sget-object v5, LSe/e;->a:LSe/e;

    .line 161
    .line 162
    const/4 v6, 0x2

    .line 163
    if-eqz v3, :cond_1

    .line 164
    .line 165
    invoke-virtual {v1}, Lsa/f;->i()Lsa/h;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v2}, Lsa/h;->c()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-virtual {v1}, Lsa/f;->i()Lsa/h;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-virtual {v3}, Lsa/h;->d()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    goto :goto_1

    .line 182
    :cond_1
    invoke-virtual {v1}, Lsa/f;->f()I

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    invoke-static {v3, v6}, LA/f;->b(II)Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-eqz v3, :cond_36

    .line 191
    .line 192
    invoke-virtual {v1}, Lsa/f;->d()Lsa/c;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v3}, Lsa/c;->c()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-virtual {v1}, Lsa/f;->d()Lsa/c;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    invoke-virtual {v7}, Lsa/c;->d()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    invoke-virtual {v1}, Lsa/f;->e()Z

    .line 209
    .line 210
    .line 211
    move-result v8

    .line 212
    if-nez v8, :cond_2

    .line 213
    .line 214
    invoke-virtual {v1}, Lsa/f;->d()Lsa/c;

    .line 215
    .line 216
    .line 217
    move-result-object v8

    .line 218
    invoke-virtual {v8}, Lsa/c;->g()Lz9/y;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    iget-object v2, v2, LJ9/C;->l:LJ9/a;

    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    new-instance v9, LC8/d;

    .line 228
    .line 229
    const/16 v10, 0xe

    .line 230
    .line 231
    invoke-direct {v9, v10, v2, v8}, LC8/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    iget-object v2, v2, LJ9/a;->b:Ljava/util/concurrent/Executor;

    .line 235
    .line 236
    invoke-interface {v2, v9}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 237
    .line 238
    .line 239
    :cond_2
    move-object v2, v3

    .line 240
    move-object v3, v7

    .line 241
    :goto_1
    invoke-virtual {v1}, Lsa/f;->b()Lz9/Q;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    invoke-virtual {v1}, Lsa/f;->e()Z

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    invoke-virtual {v1}, Lsa/f;->c()Ljava/util/Map;

    .line 250
    .line 251
    .line 252
    const-string v1, "FirebaseInAppMessaging content cannot be null."

    .line 253
    .line 254
    invoke-static {v7, v1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    const-string v1, "FirebaseInAppMessaging campaign id cannot be null."

    .line 258
    .line 259
    invoke-static {v2, v1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    const-string v1, "FirebaseInAppMessaging campaign name cannot be null."

    .line 263
    .line 264
    invoke-static {v3, v1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    new-instance v1, Ljava/lang/StringBuilder;

    .line 268
    .line 269
    const-string v9, "Decoding message: "

    .line 270
    .line 271
    invoke-direct {v1, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v7}, Lcom/google/protobuf/GeneratedMessageLite;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    invoke-static {v1}, Lic/d;->E(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    new-instance v10, LE5/b;

    .line 289
    .line 290
    const/4 v1, 0x1

    .line 291
    invoke-direct {v10, v2, v3, v8, v1}, LE5/b;-><init>(Ljava/lang/Object;Ljava/lang/Comparable;ZI)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v7}, Lz9/Q;->f()I

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    invoke-static {v1}, LA/f;->f(I)I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    const-string v9, "ImageData model must have an imageUrl"

    .line 303
    .line 304
    const/4 v11, 0x0

    .line 305
    if-eqz v1, :cond_2b

    .line 306
    .line 307
    if-eq v1, v4, :cond_1f

    .line 308
    .line 309
    if-eq v1, v6, :cond_19

    .line 310
    .line 311
    const/4 v4, 0x3

    .line 312
    if-eq v1, v4, :cond_3

    .line 313
    .line 314
    new-instance v1, LN9/j;

    .line 315
    .line 316
    new-instance v4, LE5/b;

    .line 317
    .line 318
    const/4 v6, 0x1

    .line 319
    invoke-direct {v4, v2, v3, v8, v6}, LE5/b;-><init>(Ljava/lang/Object;Ljava/lang/Comparable;ZI)V

    .line 320
    .line 321
    .line 322
    sget-object v2, Lcom/google/firebase/inappmessaging/model/MessageType;->UNSUPPORTED:Lcom/google/firebase/inappmessaging/model/MessageType;

    .line 323
    .line 324
    invoke-direct {v1, v4, v2}, LN9/h;-><init>(LE5/b;Lcom/google/firebase/inappmessaging/model/MessageType;)V

    .line 325
    .line 326
    .line 327
    goto/16 :goto_1c

    .line 328
    .line 329
    :cond_3
    invoke-virtual {v7}, Lz9/Q;->c()Lz9/O;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    invoke-virtual {v1}, Lz9/O;->q()Z

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    if-eqz v2, :cond_4

    .line 338
    .line 339
    invoke-virtual {v1}, Lz9/O;->k()Lz9/X;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    invoke-static {v2}, LXd/c;->r(Lz9/X;)LN9/l;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    goto :goto_2

    .line 348
    :cond_4
    move-object v2, v11

    .line 349
    :goto_2
    invoke-virtual {v1}, Lz9/O;->l()Z

    .line 350
    .line 351
    .line 352
    move-result v3

    .line 353
    if-eqz v3, :cond_5

    .line 354
    .line 355
    invoke-virtual {v1}, Lz9/O;->c()Lz9/X;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    invoke-static {v3}, LXd/c;->r(Lz9/X;)LN9/l;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    move-object v12, v3

    .line 364
    goto :goto_3

    .line 365
    :cond_5
    move-object v12, v11

    .line 366
    :goto_3
    invoke-virtual {v1}, Lz9/O;->b()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 371
    .line 372
    .line 373
    move-result v3

    .line 374
    if-nez v3, :cond_6

    .line 375
    .line 376
    invoke-virtual {v1}, Lz9/O;->b()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    move-object v15, v3

    .line 381
    goto :goto_4

    .line 382
    :cond_6
    move-object v15, v11

    .line 383
    :goto_4
    invoke-virtual {v1}, Lz9/O;->m()Z

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    if-nez v3, :cond_8

    .line 388
    .line 389
    invoke-virtual {v1}, Lz9/O;->n()Z

    .line 390
    .line 391
    .line 392
    move-result v3

    .line 393
    if-eqz v3, :cond_7

    .line 394
    .line 395
    goto :goto_5

    .line 396
    :cond_7
    move-object v3, v11

    .line 397
    goto :goto_6

    .line 398
    :cond_8
    :goto_5
    invoke-virtual {v1}, Lz9/O;->g()Lz9/I;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    invoke-virtual {v1}, Lz9/O;->h()Lz9/M;

    .line 403
    .line 404
    .line 405
    move-result-object v4

    .line 406
    invoke-static {v3, v4}, LXd/c;->p(Lz9/I;Lz9/M;)LN9/a;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    :goto_6
    invoke-virtual {v1}, Lz9/O;->o()Z

    .line 411
    .line 412
    .line 413
    move-result v4

    .line 414
    if-nez v4, :cond_a

    .line 415
    .line 416
    invoke-virtual {v1}, Lz9/O;->p()Z

    .line 417
    .line 418
    .line 419
    move-result v4

    .line 420
    if-eqz v4, :cond_9

    .line 421
    .line 422
    goto :goto_7

    .line 423
    :cond_9
    move-object v4, v11

    .line 424
    goto :goto_8

    .line 425
    :cond_a
    :goto_7
    invoke-virtual {v1}, Lz9/O;->i()Lz9/I;

    .line 426
    .line 427
    .line 428
    move-result-object v4

    .line 429
    invoke-virtual {v1}, Lz9/O;->j()Lz9/M;

    .line 430
    .line 431
    .line 432
    move-result-object v6

    .line 433
    invoke-static {v4, v6}, LXd/c;->p(Lz9/I;Lz9/M;)LN9/a;

    .line 434
    .line 435
    .line 436
    move-result-object v4

    .line 437
    :goto_8
    invoke-virtual {v1}, Lz9/O;->f()Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v6

    .line 441
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 442
    .line 443
    .line 444
    move-result v6

    .line 445
    if-nez v6, :cond_d

    .line 446
    .line 447
    invoke-virtual {v1}, Lz9/O;->f()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v6

    .line 451
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 452
    .line 453
    .line 454
    move-result v7

    .line 455
    if-nez v7, :cond_b

    .line 456
    .line 457
    goto :goto_9

    .line 458
    :cond_b
    move-object v6, v11

    .line 459
    :goto_9
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 460
    .line 461
    .line 462
    move-result v7

    .line 463
    if-nez v7, :cond_c

    .line 464
    .line 465
    new-instance v7, LN9/f;

    .line 466
    .line 467
    invoke-direct {v7, v6}, LN9/f;-><init>(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    move-object v13, v7

    .line 471
    goto :goto_a

    .line 472
    :cond_c
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 473
    .line 474
    invoke-direct {v1, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    throw v1

    .line 478
    :cond_d
    move-object v13, v11

    .line 479
    :goto_a
    invoke-virtual {v1}, Lz9/O;->e()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v6

    .line 483
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 484
    .line 485
    .line 486
    move-result v6

    .line 487
    if-nez v6, :cond_10

    .line 488
    .line 489
    invoke-virtual {v1}, Lz9/O;->e()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 494
    .line 495
    .line 496
    move-result v6

    .line 497
    if-nez v6, :cond_e

    .line 498
    .line 499
    move-object v11, v1

    .line 500
    :cond_e
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 501
    .line 502
    .line 503
    move-result v1

    .line 504
    if-nez v1, :cond_f

    .line 505
    .line 506
    new-instance v1, LN9/f;

    .line 507
    .line 508
    invoke-direct {v1, v11}, LN9/f;-><init>(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    move-object v14, v1

    .line 512
    goto :goto_b

    .line 513
    :cond_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 514
    .line 515
    invoke-direct {v1, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    throw v1

    .line 519
    :cond_10
    move-object v14, v11

    .line 520
    :goto_b
    if-eqz v3, :cond_18

    .line 521
    .line 522
    iget-object v1, v3, LN9/a;->b:LN9/d;

    .line 523
    .line 524
    if-eqz v1, :cond_17

    .line 525
    .line 526
    if-eqz v4, :cond_12

    .line 527
    .line 528
    iget-object v1, v4, LN9/a;->b:LN9/d;

    .line 529
    .line 530
    if-eqz v1, :cond_11

    .line 531
    .line 532
    goto :goto_c

    .line 533
    :cond_11
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 534
    .line 535
    const-string v2, "Card model secondary action must be null or have a button"

    .line 536
    .line 537
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    throw v1

    .line 541
    :cond_12
    :goto_c
    if-eqz v2, :cond_16

    .line 542
    .line 543
    if-nez v13, :cond_14

    .line 544
    .line 545
    if-eqz v14, :cond_13

    .line 546
    .line 547
    goto :goto_d

    .line 548
    :cond_13
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 549
    .line 550
    const-string v2, "Card model must have at least one image"

    .line 551
    .line 552
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    throw v1

    .line 556
    :cond_14
    :goto_d
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 557
    .line 558
    .line 559
    move-result v1

    .line 560
    if-nez v1, :cond_15

    .line 561
    .line 562
    new-instance v9, LN9/e;

    .line 563
    .line 564
    move-object v11, v2

    .line 565
    move-object/from16 v16, v3

    .line 566
    .line 567
    move-object/from16 v17, v4

    .line 568
    .line 569
    invoke-direct/range {v9 .. v17}, LN9/e;-><init>(LE5/b;LN9/l;LN9/l;LN9/f;LN9/f;Ljava/lang/String;LN9/a;LN9/a;)V

    .line 570
    .line 571
    .line 572
    :goto_e
    move-object v1, v9

    .line 573
    goto/16 :goto_1c

    .line 574
    .line 575
    :cond_15
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 576
    .line 577
    const-string v2, "Card model must have a background color"

    .line 578
    .line 579
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 580
    .line 581
    .line 582
    throw v1

    .line 583
    :cond_16
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 584
    .line 585
    const-string v2, "Card model must have a title"

    .line 586
    .line 587
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    throw v1

    .line 591
    :cond_17
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 592
    .line 593
    const-string v2, "Card model must have a primary action button"

    .line 594
    .line 595
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    throw v1

    .line 599
    :cond_18
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 600
    .line 601
    const-string v2, "Card model must have a primary action"

    .line 602
    .line 603
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    throw v1

    .line 607
    :cond_19
    invoke-virtual {v7}, Lz9/Q;->e()Lz9/T;

    .line 608
    .line 609
    .line 610
    move-result-object v1

    .line 611
    invoke-virtual {v1}, Lz9/T;->d()Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 616
    .line 617
    .line 618
    move-result v2

    .line 619
    if-nez v2, :cond_1c

    .line 620
    .line 621
    invoke-virtual {v1}, Lz9/T;->d()Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 626
    .line 627
    .line 628
    move-result v3

    .line 629
    if-nez v3, :cond_1a

    .line 630
    .line 631
    goto :goto_f

    .line 632
    :cond_1a
    move-object v2, v11

    .line 633
    :goto_f
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 634
    .line 635
    .line 636
    move-result v3

    .line 637
    if-nez v3, :cond_1b

    .line 638
    .line 639
    new-instance v3, LN9/f;

    .line 640
    .line 641
    invoke-direct {v3, v2}, LN9/f;-><init>(Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    goto :goto_10

    .line 645
    :cond_1b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 646
    .line 647
    invoke-direct {v1, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    throw v1

    .line 651
    :cond_1c
    move-object v3, v11

    .line 652
    :goto_10
    invoke-virtual {v1}, Lz9/T;->e()Z

    .line 653
    .line 654
    .line 655
    move-result v2

    .line 656
    if-eqz v2, :cond_1d

    .line 657
    .line 658
    invoke-virtual {v1}, Lz9/T;->b()Lz9/I;

    .line 659
    .line 660
    .line 661
    move-result-object v1

    .line 662
    invoke-static {v1}, LXd/c;->s(Lz9/I;)LS3/s;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    new-instance v11, LN9/a;

    .line 667
    .line 668
    iget-object v2, v1, LS3/s;->b:Ljava/lang/Object;

    .line 669
    .line 670
    check-cast v2, Ljava/lang/String;

    .line 671
    .line 672
    iget-object v1, v1, LS3/s;->c:Ljava/lang/Object;

    .line 673
    .line 674
    check-cast v1, LN9/d;

    .line 675
    .line 676
    invoke-direct {v11, v2, v1}, LN9/a;-><init>(Ljava/lang/String;LN9/d;)V

    .line 677
    .line 678
    .line 679
    :cond_1d
    if-eqz v3, :cond_1e

    .line 680
    .line 681
    new-instance v1, LN9/g;

    .line 682
    .line 683
    sget-object v2, Lcom/google/firebase/inappmessaging/model/MessageType;->IMAGE_ONLY:Lcom/google/firebase/inappmessaging/model/MessageType;

    .line 684
    .line 685
    invoke-direct {v1, v10, v2}, LN9/h;-><init>(LE5/b;Lcom/google/firebase/inappmessaging/model/MessageType;)V

    .line 686
    .line 687
    .line 688
    iput-object v3, v1, LN9/g;->c:LN9/f;

    .line 689
    .line 690
    iput-object v11, v1, LN9/g;->d:LN9/a;

    .line 691
    .line 692
    goto/16 :goto_1c

    .line 693
    .line 694
    :cond_1e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 695
    .line 696
    const-string v2, "ImageOnly model must have image data"

    .line 697
    .line 698
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    throw v1

    .line 702
    :cond_1f
    invoke-virtual {v7}, Lz9/Q;->g()Lz9/V;

    .line 703
    .line 704
    .line 705
    move-result-object v1

    .line 706
    invoke-virtual {v1}, Lz9/V;->d()Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v2

    .line 710
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 711
    .line 712
    .line 713
    move-result v2

    .line 714
    if-nez v2, :cond_20

    .line 715
    .line 716
    invoke-virtual {v1}, Lz9/V;->d()Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v2

    .line 720
    move-object v15, v2

    .line 721
    goto :goto_11

    .line 722
    :cond_20
    move-object v15, v11

    .line 723
    :goto_11
    invoke-virtual {v1}, Lz9/V;->g()Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v2

    .line 727
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 728
    .line 729
    .line 730
    move-result v2

    .line 731
    if-nez v2, :cond_23

    .line 732
    .line 733
    invoke-virtual {v1}, Lz9/V;->g()Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v2

    .line 737
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 738
    .line 739
    .line 740
    move-result v3

    .line 741
    if-nez v3, :cond_21

    .line 742
    .line 743
    goto :goto_12

    .line 744
    :cond_21
    move-object v2, v11

    .line 745
    :goto_12
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 746
    .line 747
    .line 748
    move-result v3

    .line 749
    if-nez v3, :cond_22

    .line 750
    .line 751
    new-instance v3, LN9/f;

    .line 752
    .line 753
    invoke-direct {v3, v2}, LN9/f;-><init>(Ljava/lang/String;)V

    .line 754
    .line 755
    .line 756
    move-object v13, v3

    .line 757
    goto :goto_13

    .line 758
    :cond_22
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 759
    .line 760
    invoke-direct {v1, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 761
    .line 762
    .line 763
    throw v1

    .line 764
    :cond_23
    move-object v13, v11

    .line 765
    :goto_13
    invoke-virtual {v1}, Lz9/V;->i()Z

    .line 766
    .line 767
    .line 768
    move-result v2

    .line 769
    if-eqz v2, :cond_24

    .line 770
    .line 771
    invoke-virtual {v1}, Lz9/V;->b()Lz9/I;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    invoke-virtual {v1}, Lz9/V;->c()Lz9/M;

    .line 776
    .line 777
    .line 778
    move-result-object v3

    .line 779
    invoke-static {v2, v3}, LXd/c;->p(Lz9/I;Lz9/M;)LN9/a;

    .line 780
    .line 781
    .line 782
    move-result-object v2

    .line 783
    move-object v14, v2

    .line 784
    goto :goto_14

    .line 785
    :cond_24
    move-object v14, v11

    .line 786
    :goto_14
    invoke-virtual {v1}, Lz9/V;->j()Z

    .line 787
    .line 788
    .line 789
    move-result v2

    .line 790
    if-eqz v2, :cond_25

    .line 791
    .line 792
    invoke-virtual {v1}, Lz9/V;->e()Lz9/X;

    .line 793
    .line 794
    .line 795
    move-result-object v2

    .line 796
    invoke-static {v2}, LXd/c;->r(Lz9/X;)LN9/l;

    .line 797
    .line 798
    .line 799
    move-result-object v2

    .line 800
    move-object v12, v2

    .line 801
    goto :goto_15

    .line 802
    :cond_25
    move-object v12, v11

    .line 803
    :goto_15
    invoke-virtual {v1}, Lz9/V;->k()Z

    .line 804
    .line 805
    .line 806
    move-result v2

    .line 807
    if-eqz v2, :cond_26

    .line 808
    .line 809
    invoke-virtual {v1}, Lz9/V;->h()Lz9/X;

    .line 810
    .line 811
    .line 812
    move-result-object v1

    .line 813
    invoke-static {v1}, LXd/c;->r(Lz9/X;)LN9/l;

    .line 814
    .line 815
    .line 816
    move-result-object v11

    .line 817
    :cond_26
    if-eqz v11, :cond_2a

    .line 818
    .line 819
    if-eqz v14, :cond_28

    .line 820
    .line 821
    iget-object v1, v14, LN9/a;->b:LN9/d;

    .line 822
    .line 823
    if-eqz v1, :cond_27

    .line 824
    .line 825
    goto :goto_16

    .line 826
    :cond_27
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 827
    .line 828
    const-string v2, "Modal model action must be null or have a button"

    .line 829
    .line 830
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 831
    .line 832
    .line 833
    throw v1

    .line 834
    :cond_28
    :goto_16
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 835
    .line 836
    .line 837
    move-result v1

    .line 838
    if-nez v1, :cond_29

    .line 839
    .line 840
    new-instance v9, LN9/i;

    .line 841
    .line 842
    invoke-direct/range {v9 .. v15}, LN9/i;-><init>(LE5/b;LN9/l;LN9/l;LN9/f;LN9/a;Ljava/lang/String;)V

    .line 843
    .line 844
    .line 845
    goto/16 :goto_e

    .line 846
    .line 847
    :cond_29
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 848
    .line 849
    const-string v2, "Modal model must have a background color"

    .line 850
    .line 851
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 852
    .line 853
    .line 854
    throw v1

    .line 855
    :cond_2a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 856
    .line 857
    const-string v2, "Modal model must have a title"

    .line 858
    .line 859
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 860
    .line 861
    .line 862
    throw v1

    .line 863
    :cond_2b
    invoke-virtual {v7}, Lz9/Q;->b()Lz9/K;

    .line 864
    .line 865
    .line 866
    move-result-object v1

    .line 867
    invoke-virtual {v1}, Lz9/K;->c()Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object v2

    .line 871
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 872
    .line 873
    .line 874
    move-result v2

    .line 875
    if-nez v2, :cond_2c

    .line 876
    .line 877
    invoke-virtual {v1}, Lz9/K;->c()Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v2

    .line 881
    move-object v15, v2

    .line 882
    goto :goto_17

    .line 883
    :cond_2c
    move-object v15, v11

    .line 884
    :goto_17
    invoke-virtual {v1}, Lz9/K;->f()Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v2

    .line 888
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 889
    .line 890
    .line 891
    move-result v2

    .line 892
    if-nez v2, :cond_2f

    .line 893
    .line 894
    invoke-virtual {v1}, Lz9/K;->f()Ljava/lang/String;

    .line 895
    .line 896
    .line 897
    move-result-object v2

    .line 898
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 899
    .line 900
    .line 901
    move-result v3

    .line 902
    if-nez v3, :cond_2d

    .line 903
    .line 904
    goto :goto_18

    .line 905
    :cond_2d
    move-object v2, v11

    .line 906
    :goto_18
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 907
    .line 908
    .line 909
    move-result v3

    .line 910
    if-nez v3, :cond_2e

    .line 911
    .line 912
    new-instance v3, LN9/f;

    .line 913
    .line 914
    invoke-direct {v3, v2}, LN9/f;-><init>(Ljava/lang/String;)V

    .line 915
    .line 916
    .line 917
    move-object v13, v3

    .line 918
    goto :goto_19

    .line 919
    :cond_2e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 920
    .line 921
    invoke-direct {v1, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 922
    .line 923
    .line 924
    throw v1

    .line 925
    :cond_2f
    move-object v13, v11

    .line 926
    :goto_19
    invoke-virtual {v1}, Lz9/K;->h()Z

    .line 927
    .line 928
    .line 929
    move-result v2

    .line 930
    if-eqz v2, :cond_30

    .line 931
    .line 932
    invoke-virtual {v1}, Lz9/K;->b()Lz9/I;

    .line 933
    .line 934
    .line 935
    move-result-object v2

    .line 936
    invoke-static {v2}, LXd/c;->s(Lz9/I;)LS3/s;

    .line 937
    .line 938
    .line 939
    move-result-object v2

    .line 940
    new-instance v3, LN9/a;

    .line 941
    .line 942
    iget-object v4, v2, LS3/s;->b:Ljava/lang/Object;

    .line 943
    .line 944
    check-cast v4, Ljava/lang/String;

    .line 945
    .line 946
    iget-object v2, v2, LS3/s;->c:Ljava/lang/Object;

    .line 947
    .line 948
    check-cast v2, LN9/d;

    .line 949
    .line 950
    invoke-direct {v3, v4, v2}, LN9/a;-><init>(Ljava/lang/String;LN9/d;)V

    .line 951
    .line 952
    .line 953
    move-object v14, v3

    .line 954
    goto :goto_1a

    .line 955
    :cond_30
    move-object v14, v11

    .line 956
    :goto_1a
    invoke-virtual {v1}, Lz9/K;->i()Z

    .line 957
    .line 958
    .line 959
    move-result v2

    .line 960
    if-eqz v2, :cond_31

    .line 961
    .line 962
    invoke-virtual {v1}, Lz9/K;->d()Lz9/X;

    .line 963
    .line 964
    .line 965
    move-result-object v2

    .line 966
    invoke-static {v2}, LXd/c;->r(Lz9/X;)LN9/l;

    .line 967
    .line 968
    .line 969
    move-result-object v2

    .line 970
    move-object v12, v2

    .line 971
    goto :goto_1b

    .line 972
    :cond_31
    move-object v12, v11

    .line 973
    :goto_1b
    invoke-virtual {v1}, Lz9/K;->j()Z

    .line 974
    .line 975
    .line 976
    move-result v2

    .line 977
    if-eqz v2, :cond_32

    .line 978
    .line 979
    invoke-virtual {v1}, Lz9/K;->g()Lz9/X;

    .line 980
    .line 981
    .line 982
    move-result-object v1

    .line 983
    invoke-static {v1}, LXd/c;->r(Lz9/X;)LN9/l;

    .line 984
    .line 985
    .line 986
    move-result-object v11

    .line 987
    :cond_32
    if-eqz v11, :cond_35

    .line 988
    .line 989
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 990
    .line 991
    .line 992
    move-result v1

    .line 993
    if-nez v1, :cond_34

    .line 994
    .line 995
    new-instance v9, LN9/c;

    .line 996
    .line 997
    invoke-direct/range {v9 .. v15}, LN9/c;-><init>(LE5/b;LN9/l;LN9/l;LN9/f;LN9/a;Ljava/lang/String;)V

    .line 998
    .line 999
    .line 1000
    goto/16 :goto_e

    .line 1001
    .line 1002
    :goto_1c
    sget-object v2, Lcom/google/firebase/inappmessaging/model/MessageType;->UNSUPPORTED:Lcom/google/firebase/inappmessaging/model/MessageType;

    .line 1003
    .line 1004
    iget-object v3, v1, LN9/h;->a:Lcom/google/firebase/inappmessaging/model/MessageType;

    .line 1005
    .line 1006
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1007
    .line 1008
    .line 1009
    move-result v2

    .line 1010
    if-eqz v2, :cond_33

    .line 1011
    .line 1012
    goto :goto_1d

    .line 1013
    :cond_33
    new-instance v2, LN9/m;

    .line 1014
    .line 1015
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1016
    .line 1017
    .line 1018
    iput-object v1, v2, LN9/m;->a:LN9/h;

    .line 1019
    .line 1020
    iget-object v1, v0, LJ9/z;->c:Ljava/lang/String;

    .line 1021
    .line 1022
    iput-object v1, v2, LN9/m;->b:Ljava/lang/String;

    .line 1023
    .line 1024
    invoke-static {v2}, LHe/g;->a(Ljava/lang/Object;)LHe/g;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v5

    .line 1028
    goto :goto_1d

    .line 1029
    :cond_34
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 1030
    .line 1031
    const-string v2, "Banner model must have a background color"

    .line 1032
    .line 1033
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1034
    .line 1035
    .line 1036
    throw v1

    .line 1037
    :cond_35
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 1038
    .line 1039
    const-string v2, "Banner model must have a title"

    .line 1040
    .line 1041
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1042
    .line 1043
    .line 1044
    throw v1

    .line 1045
    :cond_36
    :goto_1d
    return-object v5

    .line 1046
    nop

    .line 1047
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
