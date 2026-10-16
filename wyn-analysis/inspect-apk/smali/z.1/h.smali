.class public final Lz/h;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:LA/U;

.field public final synthetic k:LN/V;

.field public final synthetic l:LN/V;


# direct methods
.method public synthetic constructor <init>(LA/U;LN/V;LN/V;I)V
    .locals 0

    .line 1
    iput p4, p0, Lz/h;->i:I

    iput-object p1, p0, Lz/h;->j:LA/U;

    iput-object p2, p0, Lz/h;->k:LN/V;

    iput-object p3, p0, Lz/h;->l:LN/V;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const v1, -0x1d58f75c

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    sget-object v3, LN/k;->a:LN/P;

    .line 8
    .line 9
    iget-object v4, v0, Lz/h;->j:LA/U;

    .line 10
    .line 11
    const v5, 0x44faf204

    .line 12
    .line 13
    .line 14
    const-string v6, "$this$composed"

    .line 15
    .line 16
    iget v7, v0, Lz/h;->i:I

    .line 17
    .line 18
    packed-switch v7, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object/from16 v7, p1

    .line 22
    .line 23
    check-cast v7, LZ/k;

    .line 24
    .line 25
    move-object/from16 v8, p2

    .line 26
    .line 27
    check-cast v8, LN/o;

    .line 28
    .line 29
    move-object/from16 v9, p3

    .line 30
    .line 31
    check-cast v9, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 34
    .line 35
    .line 36
    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const v6, 0x970add0

    .line 40
    .line 41
    .line 42
    invoke-virtual {v8, v6}, LN/o;->M(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v8, v5}, LN/o;->M(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v8, v4}, LN/o;->e(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    invoke-virtual {v8}, LN/o;->F()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    if-nez v6, :cond_0

    .line 57
    .line 58
    if-ne v9, v3, :cond_1

    .line 59
    .line 60
    :cond_0
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 61
    .line 62
    sget-object v9, LN/P;->f:LN/P;

    .line 63
    .line 64
    invoke-static {v6, v9}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    invoke-virtual {v8, v9}, LN/o;->U(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    invoke-virtual {v8, v2}, LN/o;->p(Z)V

    .line 72
    .line 73
    .line 74
    check-cast v9, LN/V;

    .line 75
    .line 76
    invoke-virtual {v4}, LA/U;->b()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    iget-object v10, v4, LA/U;->c:LN/Y;

    .line 81
    .line 82
    invoke-virtual {v10}, LN/Y;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    iget-object v11, v0, Lz/h;->l:LN/V;

    .line 87
    .line 88
    iget-object v12, v0, Lz/h;->k:LN/V;

    .line 89
    .line 90
    if-ne v6, v10, :cond_2

    .line 91
    .line 92
    invoke-virtual {v4}, LA/U;->d()Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-nez v6, :cond_2

    .line 97
    .line 98
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 99
    .line 100
    invoke-interface {v9, v6}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    invoke-interface {v12}, LN/K0;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    if-nez v6, :cond_3

    .line 109
    .line 110
    invoke-interface {v11}, LN/K0;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    if-eqz v6, :cond_4

    .line 115
    .line 116
    :cond_3
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 117
    .line 118
    invoke-interface {v9, v6}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_4
    :goto_0
    invoke-interface {v9}, LN/K0;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    check-cast v6, Ljava/lang/Boolean;

    .line 126
    .line 127
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-eqz v6, :cond_8

    .line 132
    .line 133
    sget v6, LL0/g;->c:I

    .line 134
    .line 135
    sget-object v6, LA/b0;->g:LS3/e;

    .line 136
    .line 137
    invoke-virtual {v8, v1}, LN/o;->M(I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v8}, LN/o;->F()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    if-ne v1, v3, :cond_5

    .line 145
    .line 146
    const-string v1, "Built-in slide"

    .line 147
    .line 148
    invoke-virtual {v8, v1}, LN/o;->U(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :cond_5
    invoke-virtual {v8, v2}, LN/o;->p(Z)V

    .line 152
    .line 153
    .line 154
    check-cast v1, Ljava/lang/String;

    .line 155
    .line 156
    invoke-static {v4, v6, v1, v8}, LA/t;->d(LA/U;LS3/e;Ljava/lang/String;LN/o;)LA/M;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v8, v5}, LN/o;->M(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v8, v4}, LN/o;->e(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    invoke-virtual {v8}, LN/o;->F()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    if-nez v4, :cond_6

    .line 172
    .line 173
    if-ne v5, v3, :cond_7

    .line 174
    .line 175
    :cond_6
    new-instance v5, Lz/v;

    .line 176
    .line 177
    invoke-direct {v5, v1, v12, v11}, Lz/v;-><init>(LA/M;LN/V;LN/V;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v8, v5}, LN/o;->U(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :cond_7
    invoke-virtual {v8, v2}, LN/o;->p(Z)V

    .line 184
    .line 185
    .line 186
    check-cast v5, Lz/v;

    .line 187
    .line 188
    invoke-interface {v7, v5}, LZ/k;->g(LZ/k;)LZ/k;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    :cond_8
    invoke-virtual {v8, v2}, LN/o;->p(Z)V

    .line 193
    .line 194
    .line 195
    return-object v7

    .line 196
    :pswitch_0
    move-object/from16 v7, p1

    .line 197
    .line 198
    check-cast v7, LZ/k;

    .line 199
    .line 200
    move-object/from16 v8, p2

    .line 201
    .line 202
    check-cast v8, LN/o;

    .line 203
    .line 204
    move-object/from16 v9, p3

    .line 205
    .line 206
    check-cast v9, Ljava/lang/Number;

    .line 207
    .line 208
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 209
    .line 210
    .line 211
    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    const v6, -0x861e7e5

    .line 215
    .line 216
    .line 217
    invoke-virtual {v8, v6}, LN/o;->M(I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v8, v5}, LN/o;->M(I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v8, v4}, LN/o;->e(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    invoke-virtual {v8}, LN/o;->F()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    if-nez v6, :cond_9

    .line 232
    .line 233
    if-ne v9, v3, :cond_a

    .line 234
    .line 235
    :cond_9
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 236
    .line 237
    sget-object v9, LN/P;->f:LN/P;

    .line 238
    .line 239
    invoke-static {v6, v9}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    invoke-virtual {v8, v9}, LN/o;->U(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    :cond_a
    invoke-virtual {v8, v2}, LN/o;->p(Z)V

    .line 247
    .line 248
    .line 249
    check-cast v9, LN/V;

    .line 250
    .line 251
    invoke-virtual {v4}, LA/U;->b()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v6

    .line 255
    iget-object v10, v4, LA/U;->c:LN/Y;

    .line 256
    .line 257
    invoke-virtual {v10}, LN/Y;->getValue()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v11

    .line 261
    iget-object v12, v0, Lz/h;->l:LN/V;

    .line 262
    .line 263
    iget-object v15, v0, Lz/h;->k:LN/V;

    .line 264
    .line 265
    if-ne v6, v11, :cond_b

    .line 266
    .line 267
    invoke-virtual {v4}, LA/U;->d()Z

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    if-nez v6, :cond_b

    .line 272
    .line 273
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 274
    .line 275
    invoke-interface {v9, v6}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    goto :goto_1

    .line 279
    :cond_b
    invoke-interface {v15}, LN/K0;->getValue()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v6

    .line 283
    if-nez v6, :cond_c

    .line 284
    .line 285
    invoke-interface {v12}, LN/K0;->getValue()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v6

    .line 289
    if-eqz v6, :cond_d

    .line 290
    .line 291
    :cond_c
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 292
    .line 293
    invoke-interface {v9, v6}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    :cond_d
    :goto_1
    invoke-interface {v9}, LN/K0;->getValue()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    check-cast v6, Ljava/lang/Boolean;

    .line 301
    .line 302
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 303
    .line 304
    .line 305
    move-result v6

    .line 306
    if-eqz v6, :cond_1a

    .line 307
    .line 308
    invoke-virtual {v4}, LA/U;->c()LA/N;

    .line 309
    .line 310
    .line 311
    move-result-object v6

    .line 312
    sget-object v9, Lz/f;->a:Lz/f;

    .line 313
    .line 314
    sget-object v11, Lz/f;->b:Lz/f;

    .line 315
    .line 316
    invoke-virtual {v6, v9, v11}, LA/N;->a(Lz/f;Lz/f;)Z

    .line 317
    .line 318
    .line 319
    move-result v6

    .line 320
    const/4 v9, 0x0

    .line 321
    if-eqz v6, :cond_10

    .line 322
    .line 323
    invoke-interface {v15}, LN/K0;->getValue()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v6

    .line 327
    check-cast v6, Lz/e;

    .line 328
    .line 329
    if-eqz v6, :cond_e

    .line 330
    .line 331
    goto :goto_2

    .line 332
    :cond_e
    invoke-interface {v12}, LN/K0;->getValue()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v6

    .line 336
    check-cast v6, Lz/e;

    .line 337
    .line 338
    if-eqz v6, :cond_f

    .line 339
    .line 340
    :goto_2
    iget-object v6, v6, Lz/e;->a:LZ/d;

    .line 341
    .line 342
    goto :goto_4

    .line 343
    :cond_f
    move-object v6, v9

    .line 344
    goto :goto_4

    .line 345
    :cond_10
    invoke-interface {v12}, LN/K0;->getValue()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v6

    .line 349
    check-cast v6, Lz/e;

    .line 350
    .line 351
    if-eqz v6, :cond_11

    .line 352
    .line 353
    goto :goto_3

    .line 354
    :cond_11
    invoke-interface {v15}, LN/K0;->getValue()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v6

    .line 358
    check-cast v6, Lz/e;

    .line 359
    .line 360
    if-eqz v6, :cond_f

    .line 361
    .line 362
    :goto_3
    iget-object v6, v6, Lz/e;->a:LZ/d;

    .line 363
    .line 364
    :goto_4
    invoke-static {v6, v8}, LN/d;->I(Ljava/lang/Object;LN/o;)LN/V;

    .line 365
    .line 366
    .line 367
    move-result-object v17

    .line 368
    sget-object v6, LA/b0;->h:LS3/e;

    .line 369
    .line 370
    invoke-virtual {v8, v1}, LN/o;->M(I)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v8}, LN/o;->F()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v11

    .line 377
    if-ne v11, v3, :cond_12

    .line 378
    .line 379
    const-string v11, "Built-in shrink/expand"

    .line 380
    .line 381
    invoke-virtual {v8, v11}, LN/o;->U(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    :cond_12
    invoke-virtual {v8, v2}, LN/o;->p(Z)V

    .line 385
    .line 386
    .line 387
    check-cast v11, Ljava/lang/String;

    .line 388
    .line 389
    invoke-static {v4, v6, v11, v8}, LA/t;->d(LA/U;LS3/e;Ljava/lang/String;LN/o;)LA/M;

    .line 390
    .line 391
    .line 392
    move-result-object v13

    .line 393
    invoke-virtual {v4}, LA/U;->b()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    invoke-virtual {v10}, LN/Y;->getValue()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v11

    .line 401
    if-ne v6, v11, :cond_13

    .line 402
    .line 403
    const/4 v6, 0x1

    .line 404
    goto :goto_5

    .line 405
    :cond_13
    move v6, v2

    .line 406
    :goto_5
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 407
    .line 408
    .line 409
    move-result-object v6

    .line 410
    const v11, -0x5c942cad

    .line 411
    .line 412
    .line 413
    invoke-virtual {v8, v11, v6, v2, v9}, LN/o;->J(ILjava/lang/Object;ILN/c0;)V

    .line 414
    .line 415
    .line 416
    sget v6, LL0/g;->c:I

    .line 417
    .line 418
    sget-object v6, LA/b0;->g:LS3/e;

    .line 419
    .line 420
    invoke-virtual {v8, v1}, LN/o;->M(I)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v8}, LN/o;->F()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    if-ne v1, v3, :cond_14

    .line 428
    .line 429
    const-string v1, "Built-in InterruptionHandlingOffset"

    .line 430
    .line 431
    invoke-virtual {v8, v1}, LN/o;->U(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    :cond_14
    invoke-virtual {v8, v2}, LN/o;->p(Z)V

    .line 435
    .line 436
    .line 437
    check-cast v1, Ljava/lang/String;

    .line 438
    .line 439
    invoke-static {v4, v6, v1, v8}, LA/t;->d(LA/U;LS3/e;Ljava/lang/String;LN/o;)LA/M;

    .line 440
    .line 441
    .line 442
    move-result-object v14

    .line 443
    invoke-virtual {v8, v2}, LN/o;->p(Z)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v8, v5}, LN/o;->M(I)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v8, v4}, LN/o;->e(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    move-result v1

    .line 453
    invoke-virtual {v8}, LN/o;->F()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v5

    .line 457
    if-nez v1, :cond_15

    .line 458
    .line 459
    if-ne v5, v3, :cond_16

    .line 460
    .line 461
    :cond_15
    move-object/from16 v16, v12

    .line 462
    .line 463
    goto :goto_6

    .line 464
    :cond_16
    move-object/from16 v16, v12

    .line 465
    .line 466
    goto :goto_7

    .line 467
    :goto_6
    new-instance v12, Lz/n;

    .line 468
    .line 469
    invoke-direct/range {v12 .. v17}, Lz/n;-><init>(LA/M;LA/M;LN/V;LN/V;LN/V;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v8, v12}, LN/o;->U(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    move-object v5, v12

    .line 476
    :goto_7
    invoke-virtual {v8, v2}, LN/o;->p(Z)V

    .line 477
    .line 478
    .line 479
    check-cast v5, Lz/n;

    .line 480
    .line 481
    invoke-virtual {v4}, LA/U;->b()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    invoke-virtual {v10}, LN/Y;->getValue()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v3

    .line 489
    if-ne v1, v3, :cond_17

    .line 490
    .line 491
    iput-object v9, v5, Lz/n;->f:LZ/d;

    .line 492
    .line 493
    goto :goto_8

    .line 494
    :cond_17
    iget-object v1, v5, Lz/n;->f:LZ/d;

    .line 495
    .line 496
    if-nez v1, :cond_19

    .line 497
    .line 498
    invoke-interface/range {v17 .. v17}, LN/K0;->getValue()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    check-cast v1, LZ/d;

    .line 503
    .line 504
    if-nez v1, :cond_18

    .line 505
    .line 506
    sget-object v1, LZ/a;->a:LZ/d;

    .line 507
    .line 508
    :cond_18
    iput-object v1, v5, Lz/n;->f:LZ/d;

    .line 509
    .line 510
    :cond_19
    :goto_8
    invoke-interface {v15}, LN/K0;->getValue()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    check-cast v1, Lz/e;

    .line 515
    .line 516
    sget-object v1, LZ/i;->a:LZ/i;

    .line 517
    .line 518
    invoke-interface/range {v16 .. v16}, LN/K0;->getValue()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v3

    .line 522
    check-cast v3, Lz/e;

    .line 523
    .line 524
    invoke-static {v1}, Lic/d;->l(LZ/k;)LZ/k;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    invoke-interface {v7, v1}, LZ/k;->g(LZ/k;)LZ/k;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    invoke-interface {v1, v5}, LZ/k;->g(LZ/k;)LZ/k;

    .line 533
    .line 534
    .line 535
    move-result-object v7

    .line 536
    :cond_1a
    invoke-virtual {v8, v2}, LN/o;->p(Z)V

    .line 537
    .line 538
    .line 539
    return-object v7

    .line 540
    nop

    .line 541
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
