.class public final LG/f;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LG/f;->i:I

    iput-object p1, p0, LG/f;->j:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    const v0, -0x1d58f75c

    .line 2
    .line 3
    .line 4
    const v1, 0x44faf204

    .line 5
    .line 6
    .line 7
    sget-object v2, LN/k;->a:LN/P;

    .line 8
    .line 9
    const-string v3, "$this$composed"

    .line 10
    .line 11
    iget-object v4, p0, LG/f;->j:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    iget v6, p0, LG/f;->i:I

    .line 15
    .line 16
    packed-switch v6, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p1, LA/N;

    .line 20
    .line 21
    check-cast p2, LN/o;

    .line 22
    .line 23
    check-cast p3, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 26
    .line 27
    .line 28
    const-string p3, "$this$animateFloat"

    .line 29
    .line 30
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const p1, 0x1a218d63

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, p1}, LN/o;->M(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, v5}, LN/o;->p(Z)V

    .line 40
    .line 41
    .line 42
    check-cast v4, LA/Z;

    .line 43
    .line 44
    return-object v4

    .line 45
    :pswitch_0
    check-cast p1, LZ/k;

    .line 46
    .line 47
    check-cast p2, LN/o;

    .line 48
    .line 49
    check-cast p3, Ljava/lang/Number;

    .line 50
    .line 51
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const p3, -0x3241ea3f

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, p3}, LN/o;->M(I)V

    .line 61
    .line 62
    .line 63
    const p3, 0x2e20b340

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, p3}, LN/o;->M(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, v0}, LN/o;->M(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    if-ne p3, v2, :cond_0

    .line 77
    .line 78
    sget-object p3, Ljf/i;->a:Ljf/i;

    .line 79
    .line 80
    invoke-static {p3, p2}, LN/d;->x(Ljf/h;LN/o;)LKd/a;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    new-instance v0, LN/t;

    .line 85
    .line 86
    invoke-direct {v0, p3}, LN/t;-><init>(LKd/a;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2, v0}, LN/o;->U(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    move-object p3, v0

    .line 93
    :cond_0
    invoke-virtual {p2, v5}, LN/o;->p(Z)V

    .line 94
    .line 95
    .line 96
    check-cast p3, LN/t;

    .line 97
    .line 98
    iget-object p3, p3, LN/t;->a:LKd/a;

    .line 99
    .line 100
    invoke-virtual {p2, v5}, LN/o;->p(Z)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2, v1}, LN/o;->M(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2, p3}, LN/o;->e(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    if-nez v0, :cond_1

    .line 115
    .line 116
    if-ne v1, v2, :cond_2

    .line 117
    .line 118
    :cond_1
    new-instance v1, Lz/s;

    .line 119
    .line 120
    check-cast v4, LA/u;

    .line 121
    .line 122
    invoke-direct {v1, v4, p3}, Lz/s;-><init>(LA/i;LKd/a;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2, v1}, LN/o;->U(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_2
    invoke-virtual {p2, v5}, LN/o;->p(Z)V

    .line 129
    .line 130
    .line 131
    check-cast v1, Lz/s;

    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-static {p1}, Lic/d;->l(LZ/k;)LZ/k;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-interface {p1, v1}, LZ/k;->g(LZ/k;)LZ/k;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p2, v5}, LN/o;->p(Z)V

    .line 145
    .line 146
    .line 147
    return-object p1

    .line 148
    :pswitch_1
    check-cast p1, LN/u0;

    .line 149
    .line 150
    iget-object p1, p1, LN/u0;->a:LN/o;

    .line 151
    .line 152
    check-cast p2, LN/o;

    .line 153
    .line 154
    check-cast p3, Ljava/lang/Number;

    .line 155
    .line 156
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 157
    .line 158
    .line 159
    const-string p3, "$this$null"

    .line 160
    .line 161
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    check-cast v4, LZ/k;

    .line 165
    .line 166
    invoke-static {p2, v4}, Lr7/e;->F(LN/o;LZ/k;)LZ/k;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    const p3, 0x1e65194f

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, p3}, LN/o;->M(I)V

    .line 174
    .line 175
    .line 176
    sget-object p3, Lt0/c;->g9:Lt0/b;

    .line 177
    .line 178
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    sget-object p3, Lt0/b;->c:Lt0/a;

    .line 182
    .line 183
    invoke-static {p1, p2, p3}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1, v5}, LN/o;->p(Z)V

    .line 187
    .line 188
    .line 189
    sget-object p1, Lef/C;->a:Lef/C;

    .line 190
    .line 191
    return-object p1

    .line 192
    :pswitch_2
    check-cast p1, LZ/k;

    .line 193
    .line 194
    check-cast p2, LN/o;

    .line 195
    .line 196
    check-cast p3, Ljava/lang/Number;

    .line 197
    .line 198
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 199
    .line 200
    .line 201
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    const p1, -0x1252808e

    .line 205
    .line 206
    .line 207
    invoke-virtual {p2, p1}, LN/o;->M(I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p2, v1}, LN/o;->M(I)V

    .line 211
    .line 212
    .line 213
    check-cast v4, Lc0/o;

    .line 214
    .line 215
    invoke-virtual {p2, v4}, LN/o;->e(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p3

    .line 223
    if-nez p1, :cond_3

    .line 224
    .line 225
    if-ne p3, v2, :cond_4

    .line 226
    .line 227
    :cond_3
    new-instance p3, Lc0/q;

    .line 228
    .line 229
    invoke-direct {p3, v4}, Lc0/q;-><init>(Lc0/o;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p2, p3}, LN/o;->U(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    :cond_4
    invoke-virtual {p2, v5}, LN/o;->p(Z)V

    .line 236
    .line 237
    .line 238
    check-cast p3, Lc0/q;

    .line 239
    .line 240
    invoke-virtual {p2, v5}, LN/o;->p(Z)V

    .line 241
    .line 242
    .line 243
    return-object p3

    .line 244
    :pswitch_3
    check-cast p1, LZ/k;

    .line 245
    .line 246
    check-cast p2, LN/o;

    .line 247
    .line 248
    check-cast p3, Ljava/lang/Number;

    .line 249
    .line 250
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 251
    .line 252
    .line 253
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    const p1, 0x242ea520

    .line 257
    .line 258
    .line 259
    invoke-virtual {p2, p1}, LN/o;->M(I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {p2, v1}, LN/o;->M(I)V

    .line 263
    .line 264
    .line 265
    check-cast v4, LA/W;

    .line 266
    .line 267
    invoke-virtual {p2, v4}, LN/o;->e(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result p1

    .line 271
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object p3

    .line 275
    if-nez p1, :cond_5

    .line 276
    .line 277
    if-ne p3, v2, :cond_6

    .line 278
    .line 279
    :cond_5
    new-instance p3, Lc0/d;

    .line 280
    .line 281
    invoke-direct {p3, v4}, Lc0/d;-><init>(Ltf/l;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {p2, p3}, LN/o;->U(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    :cond_6
    invoke-virtual {p2, v5}, LN/o;->p(Z)V

    .line 288
    .line 289
    .line 290
    check-cast p3, Lc0/d;

    .line 291
    .line 292
    new-instance p1, LA0/p;

    .line 293
    .line 294
    const/16 v0, 0x12

    .line 295
    .line 296
    invoke-direct {p1, p3, v0}, LA0/p;-><init>(Ljava/lang/Object;I)V

    .line 297
    .line 298
    .line 299
    invoke-static {p1, p2}, LN/d;->g(Ltf/a;LN/o;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {p2, v5}, LN/o;->p(Z)V

    .line 303
    .line 304
    .line 305
    return-object p3

    .line 306
    :pswitch_4
    check-cast p1, LZ/k;

    .line 307
    .line 308
    check-cast p2, LN/o;

    .line 309
    .line 310
    check-cast p3, Ljava/lang/Number;

    .line 311
    .line 312
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 313
    .line 314
    .line 315
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    const p1, -0x67d12d20

    .line 319
    .line 320
    .line 321
    invoke-virtual {p2, p1}, LN/o;->M(I)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {p2, v0}, LN/o;->M(I)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    if-ne p1, v2, :cond_7

    .line 332
    .line 333
    sget-object p1, LN/P;->f:LN/P;

    .line 334
    .line 335
    const/4 p3, 0x0

    .line 336
    invoke-static {p3, p1}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    invoke-virtual {p2, p1}, LN/o;->U(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    :cond_7
    invoke-virtual {p2, v5}, LN/o;->p(Z)V

    .line 344
    .line 345
    .line 346
    check-cast p1, LN/V;

    .line 347
    .line 348
    sget-object p3, LZ/i;->a:LZ/i;

    .line 349
    .line 350
    new-instance v0, LA/W;

    .line 351
    .line 352
    check-cast v4, LB/D;

    .line 353
    .line 354
    const/16 v1, 0x11

    .line 355
    .line 356
    invoke-direct {v0, v1, p1, v4}, LA/W;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    sget-object p1, Lc0/c;->a:La2/v;

    .line 360
    .line 361
    new-instance p1, LG/f;

    .line 362
    .line 363
    const/4 v1, 0x3

    .line 364
    invoke-direct {p1, v0, v1}, LG/f;-><init>(Ljava/lang/Object;I)V

    .line 365
    .line 366
    .line 367
    invoke-static {p3, p1}, Lr7/e;->n(LZ/k;Ltf/q;)LZ/k;

    .line 368
    .line 369
    .line 370
    move-result-object p1

    .line 371
    invoke-virtual {p2, v5}, LN/o;->p(Z)V

    .line 372
    .line 373
    .line 374
    return-object p1

    .line 375
    :pswitch_5
    check-cast p1, LZ/k;

    .line 376
    .line 377
    check-cast p2, LN/o;

    .line 378
    .line 379
    check-cast p3, Ljava/lang/Number;

    .line 380
    .line 381
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 382
    .line 383
    .line 384
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    const p3, -0x64b4c6fb

    .line 388
    .line 389
    .line 390
    invoke-virtual {p2, p3}, LN/o;->M(I)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {p2, v0}, LN/o;->M(I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object p3

    .line 400
    if-ne p3, v2, :cond_8

    .line 401
    .line 402
    new-instance p3, Lb0/b;

    .line 403
    .line 404
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 405
    .line 406
    .line 407
    sget-object v0, Lb0/g;->a:Lb0/g;

    .line 408
    .line 409
    iput-object v0, p3, Lb0/b;->a:Lb0/a;

    .line 410
    .line 411
    invoke-virtual {p2, p3}, LN/o;->U(Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    :cond_8
    invoke-virtual {p2, v5}, LN/o;->p(Z)V

    .line 415
    .line 416
    .line 417
    check-cast p3, Lb0/b;

    .line 418
    .line 419
    new-instance v0, Lb0/d;

    .line 420
    .line 421
    check-cast v4, LB/c;

    .line 422
    .line 423
    invoke-direct {v0, p3, v4}, Lb0/d;-><init>(Lb0/b;LB/c;)V

    .line 424
    .line 425
    .line 426
    invoke-interface {p1, v0}, LZ/k;->g(LZ/k;)LZ/k;

    .line 427
    .line 428
    .line 429
    move-result-object p1

    .line 430
    invoke-virtual {p2, v5}, LN/o;->p(Z)V

    .line 431
    .line 432
    .line 433
    return-object p1

    .line 434
    :pswitch_6
    check-cast p1, LZ/k;

    .line 435
    .line 436
    check-cast p2, LN/o;

    .line 437
    .line 438
    check-cast p3, Ljava/lang/Number;

    .line 439
    .line 440
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 441
    .line 442
    .line 443
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    const p1, -0x3b2dbfe9

    .line 447
    .line 448
    .line 449
    invoke-virtual {p2, p1}, LN/o;->M(I)V

    .line 450
    .line 451
    .line 452
    const p1, -0x3d7a14e4

    .line 453
    .line 454
    .line 455
    invoke-virtual {p2, p1}, LN/o;->M(I)V

    .line 456
    .line 457
    .line 458
    sget-object p1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:LN/L0;

    .line 459
    .line 460
    invoke-virtual {p2, p1}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object p1

    .line 464
    check-cast p1, Landroid/view/View;

    .line 465
    .line 466
    invoke-virtual {p2, v1}, LN/o;->M(I)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {p2, p1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result p3

    .line 473
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    if-nez p3, :cond_9

    .line 478
    .line 479
    if-ne v0, v2, :cond_a

    .line 480
    .line 481
    :cond_9
    new-instance v0, LG/a;

    .line 482
    .line 483
    invoke-direct {v0, p1}, LG/a;-><init>(Landroid/view/View;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {p2, v0}, LN/o;->U(Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    :cond_a
    invoke-virtual {p2, v5}, LN/o;->p(Z)V

    .line 490
    .line 491
    .line 492
    check-cast v0, LG/a;

    .line 493
    .line 494
    invoke-virtual {p2, v5}, LN/o;->p(Z)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {p2, v1}, LN/o;->M(I)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {p2, v0}, LN/o;->e(Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    move-result p1

    .line 504
    invoke-virtual {p2}, LN/o;->F()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object p3

    .line 508
    if-nez p1, :cond_b

    .line 509
    .line 510
    if-ne p3, v2, :cond_c

    .line 511
    .line 512
    :cond_b
    new-instance p3, LG/g;

    .line 513
    .line 514
    invoke-direct {p3, v0}, LG/g;-><init>(LG/a;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {p2, p3}, LN/o;->U(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    :cond_c
    invoke-virtual {p2, v5}, LN/o;->p(Z)V

    .line 521
    .line 522
    .line 523
    check-cast p3, LG/g;

    .line 524
    .line 525
    check-cast v4, LG/e;

    .line 526
    .line 527
    new-instance p1, LA/W;

    .line 528
    .line 529
    const/16 v0, 0x8

    .line 530
    .line 531
    invoke-direct {p1, v0, v4, p3}, LA/W;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    invoke-static {v4, p1, p2}, LN/d;->c(Ljava/lang/Object;Ltf/l;LN/o;)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {p2, v5}, LN/o;->p(Z)V

    .line 538
    .line 539
    .line 540
    return-object p3

    .line 541
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
