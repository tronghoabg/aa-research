.class public final synthetic Lq6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lq6/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget v3, p0, Lq6/d;->a:I

    .line 7
    .line 8
    packed-switch v3, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/lang/Comparable;

    .line 12
    .line 13
    check-cast p2, Ljava/lang/Comparable;

    .line 14
    .line 15
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :pswitch_0
    check-cast p1, Ljava/lang/Comparable;

    .line 21
    .line 22
    check-cast p2, Ljava/lang/Comparable;

    .line 23
    .line 24
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1

    .line 29
    :pswitch_1
    check-cast p1, Lt6/H;

    .line 30
    .line 31
    check-cast p2, Lt6/H;

    .line 32
    .line 33
    iget p1, p1, Lt6/H;->c:F

    .line 34
    .line 35
    iget p2, p2, Lt6/H;->c:F

    .line 36
    .line 37
    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1

    .line 42
    :pswitch_2
    check-cast p1, Lt6/H;

    .line 43
    .line 44
    check-cast p2, Lt6/H;

    .line 45
    .line 46
    iget p1, p1, Lt6/H;->a:I

    .line 47
    .line 48
    iget p2, p2, Lt6/H;->a:I

    .line 49
    .line 50
    sub-int/2addr p1, p2

    .line 51
    return p1

    .line 52
    :pswitch_3
    check-cast p1, Lt0/t;

    .line 53
    .line 54
    check-cast p2, Lt0/t;

    .line 55
    .line 56
    iget v0, p1, Lt0/t;->z:F

    .line 57
    .line 58
    iget v1, p2, Lt0/t;->z:F

    .line 59
    .line 60
    cmpg-float v2, v0, v1

    .line 61
    .line 62
    if-nez v2, :cond_0

    .line 63
    .line 64
    iget p1, p1, Lt0/t;->t:I

    .line 65
    .line 66
    iget p2, p2, Lt0/t;->t:I

    .line 67
    .line 68
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->g(II)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    :goto_0
    return p1

    .line 78
    :pswitch_4
    check-cast p1, Lp9/j;

    .line 79
    .line 80
    check-cast p2, Lp9/j;

    .line 81
    .line 82
    iget-object p1, p1, Lp9/j;->c:Ls9/j;

    .line 83
    .line 84
    iget-object p2, p2, Lp9/j;->c:Ls9/j;

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Ls9/e;->d(Ls9/e;)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    return p1

    .line 91
    :pswitch_5
    check-cast p1, Ls9/k;

    .line 92
    .line 93
    check-cast p2, Ls9/k;

    .line 94
    .line 95
    invoke-static {p1}, Ls9/b;->b(Ls9/k;)Ls9/b;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-static {p2}, Ls9/b;->b(Ls9/k;)Ls9/b;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-virtual {p1, p2}, Ls9/b;->a(Ls9/b;)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    return p1

    .line 108
    :pswitch_6
    check-cast p1, Ls9/a;

    .line 109
    .line 110
    check-cast p2, Ls9/a;

    .line 111
    .line 112
    iget-object v0, p1, Ls9/a;->b:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v1, p2, Ls9/a;->b:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_1

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_1
    iget-object p1, p1, Ls9/a;->c:Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    iget-object p2, p2, Ls9/a;->c:Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_4

    .line 140
    .line 141
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_4

    .line 146
    .line 147
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, Ls9/d;

    .line 152
    .line 153
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    check-cast v1, Ls9/d;

    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    iget-object v2, v1, Ls9/d;->a:Ls9/j;

    .line 163
    .line 164
    iget-object v3, v0, Ls9/d;->a:Ls9/j;

    .line 165
    .line 166
    invoke-virtual {v3, v2}, Ls9/e;->d(Ls9/e;)I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-eqz v2, :cond_3

    .line 171
    .line 172
    move v0, v2

    .line 173
    goto :goto_1

    .line 174
    :cond_3
    iget v0, v0, Ls9/d;->b:I

    .line 175
    .line 176
    iget v1, v1, Ls9/d;->b:I

    .line 177
    .line 178
    invoke-static {v0, v1}, LA/f;->a(II)I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    :goto_1
    if-eqz v0, :cond_2

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 190
    .line 191
    .line 192
    move-result p2

    .line 193
    invoke-static {p1, p2}, Ljava/lang/Boolean;->compare(ZZ)I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    :goto_2
    return v0

    .line 198
    :pswitch_7
    check-cast p1, Ls9/h;

    .line 199
    .line 200
    check-cast p2, Ls9/h;

    .line 201
    .line 202
    invoke-virtual {p1, p2}, Ls9/h;->a(Ls9/h;)I

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    return p1

    .line 207
    :pswitch_8
    check-cast p1, Ls6/f;

    .line 208
    .line 209
    check-cast p2, Ls6/f;

    .line 210
    .line 211
    iget v0, p2, Ls6/f;->a:I

    .line 212
    .line 213
    iget v1, p1, Ls6/f;->a:I

    .line 214
    .line 215
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    if-eqz v0, :cond_5

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_5
    iget-object v0, p2, Ls6/f;->c:Ljava/lang/String;

    .line 223
    .line 224
    iget-object v1, p1, Ls6/f;->c:Ljava/lang/String;

    .line 225
    .line 226
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-eqz v0, :cond_6

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_6
    iget-object p2, p2, Ls6/f;->d:Ljava/lang/String;

    .line 234
    .line 235
    iget-object p1, p1, Ls6/f;->d:Ljava/lang/String;

    .line 236
    .line 237
    invoke-virtual {p2, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    :goto_3
    return v0

    .line 242
    :pswitch_9
    check-cast p1, Ls6/f;

    .line 243
    .line 244
    check-cast p2, Ls6/f;

    .line 245
    .line 246
    iget v0, p2, Ls6/f;->b:I

    .line 247
    .line 248
    iget v1, p1, Ls6/f;->b:I

    .line 249
    .line 250
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-eqz v0, :cond_7

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_7
    iget-object v0, p1, Ls6/f;->c:Ljava/lang/String;

    .line 258
    .line 259
    iget-object v1, p2, Ls6/f;->c:Ljava/lang/String;

    .line 260
    .line 261
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-eqz v0, :cond_8

    .line 266
    .line 267
    goto :goto_4

    .line 268
    :cond_8
    iget-object p1, p1, Ls6/f;->d:Ljava/lang/String;

    .line 269
    .line 270
    iget-object p2, p2, Ls6/f;->d:Ljava/lang/String;

    .line 271
    .line 272
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    :goto_4
    return v0

    .line 277
    :pswitch_a
    check-cast p1, Lt9/i;

    .line 278
    .line 279
    check-cast p2, Lt9/i;

    .line 280
    .line 281
    iget p1, p1, Lt9/i;->a:I

    .line 282
    .line 283
    iget p2, p2, Lt9/i;->a:I

    .line 284
    .line 285
    invoke-static {p1, p2}, Lw9/p;->d(II)I

    .line 286
    .line 287
    .line 288
    move-result p1

    .line 289
    return p1

    .line 290
    :pswitch_b
    check-cast p1, Ls9/a;

    .line 291
    .line 292
    check-cast p2, Ls9/a;

    .line 293
    .line 294
    iget-object v0, p1, Ls9/a;->d:Ls9/c;

    .line 295
    .line 296
    iget-wide v0, v0, Ls9/c;->a:J

    .line 297
    .line 298
    iget-object v2, p2, Ls9/a;->d:Ls9/c;

    .line 299
    .line 300
    iget-wide v2, v2, Ls9/c;->a:J

    .line 301
    .line 302
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    if-nez v0, :cond_9

    .line 307
    .line 308
    iget-object p1, p1, Ls9/a;->b:Ljava/lang/String;

    .line 309
    .line 310
    iget-object p2, p2, Ls9/a;->b:Ljava/lang/String;

    .line 311
    .line 312
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    :cond_9
    return v0

    .line 317
    :pswitch_c
    check-cast p1, Ljava/lang/Long;

    .line 318
    .line 319
    check-cast p2, Ljava/lang/Long;

    .line 320
    .line 321
    invoke-virtual {p2, p1}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    .line 322
    .line 323
    .line 324
    move-result p1

    .line 325
    return p1

    .line 326
    :pswitch_d
    check-cast p1, Lr9/c;

    .line 327
    .line 328
    check-cast p2, Lr9/c;

    .line 329
    .line 330
    iget v0, p1, Lr9/c;->b:I

    .line 331
    .line 332
    iget v1, p2, Lr9/c;->b:I

    .line 333
    .line 334
    invoke-static {v0, v1}, Lw9/p;->d(II)I

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    if-eqz v0, :cond_a

    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_a
    iget-object p1, p1, Lr9/c;->a:Ls9/h;

    .line 342
    .line 343
    iget-object p2, p2, Lr9/c;->a:Ls9/h;

    .line 344
    .line 345
    invoke-virtual {p1, p2}, Ls9/h;->a(Ls9/h;)I

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    :goto_5
    return v0

    .line 350
    :pswitch_e
    check-cast p1, Lr9/c;

    .line 351
    .line 352
    check-cast p2, Lr9/c;

    .line 353
    .line 354
    iget-object v0, p1, Lr9/c;->a:Ls9/h;

    .line 355
    .line 356
    iget-object v1, p2, Lr9/c;->a:Ls9/h;

    .line 357
    .line 358
    invoke-virtual {v0, v1}, Ls9/h;->a(Ls9/h;)I

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    if-eqz v0, :cond_b

    .line 363
    .line 364
    goto :goto_6

    .line 365
    :cond_b
    iget p1, p1, Lr9/c;->b:I

    .line 366
    .line 367
    iget p2, p2, Lr9/c;->b:I

    .line 368
    .line 369
    invoke-static {p1, p2}, Lw9/p;->d(II)I

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    :goto_6
    return v0

    .line 374
    :pswitch_f
    check-cast p1, Lr6/k;

    .line 375
    .line 376
    check-cast p2, Lr6/k;

    .line 377
    .line 378
    iget-boolean v0, p1, Lr6/k;->e:Z

    .line 379
    .line 380
    if-eqz v0, :cond_c

    .line 381
    .line 382
    iget-boolean v0, p1, Lr6/k;->h:Z

    .line 383
    .line 384
    if-eqz v0, :cond_c

    .line 385
    .line 386
    sget-object v0, Lr6/l;->j:Ll8/d0;

    .line 387
    .line 388
    goto :goto_7

    .line 389
    :cond_c
    sget-object v0, Lr6/l;->j:Ll8/d0;

    .line 390
    .line 391
    invoke-virtual {v0}, Ll8/d0;->a()Ll8/d0;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    :goto_7
    sget-object v1, Ll8/A;->a:Ll8/y;

    .line 396
    .line 397
    iget v2, p1, Lr6/k;->i:I

    .line 398
    .line 399
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    iget v4, p2, Lr6/k;->i:I

    .line 404
    .line 405
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    iget-object v5, p1, Lr6/k;->f:Lr6/f;

    .line 410
    .line 411
    iget-boolean v5, v5, Lr6/r;->w:Z

    .line 412
    .line 413
    if-eqz v5, :cond_d

    .line 414
    .line 415
    sget-object v5, Lr6/l;->j:Ll8/d0;

    .line 416
    .line 417
    invoke-virtual {v5}, Ll8/d0;->a()Ll8/d0;

    .line 418
    .line 419
    .line 420
    move-result-object v5

    .line 421
    goto :goto_8

    .line 422
    :cond_d
    sget-object v5, Lr6/l;->k:Ll8/d0;

    .line 423
    .line 424
    :goto_8
    invoke-virtual {v1, v3, v4, v5}, Ll8/y;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll8/A;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    iget p1, p1, Lr6/k;->j:I

    .line 429
    .line 430
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 431
    .line 432
    .line 433
    move-result-object p1

    .line 434
    iget v3, p2, Lr6/k;->j:I

    .line 435
    .line 436
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    invoke-virtual {v1, p1, v3, v0}, Ll8/A;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll8/A;

    .line 441
    .line 442
    .line 443
    move-result-object p1

    .line 444
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    iget p2, p2, Lr6/k;->i:I

    .line 449
    .line 450
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 451
    .line 452
    .line 453
    move-result-object p2

    .line 454
    invoke-virtual {p1, v1, p2, v0}, Ll8/A;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll8/A;

    .line 455
    .line 456
    .line 457
    move-result-object p1

    .line 458
    invoke-virtual {p1}, Ll8/A;->e()I

    .line 459
    .line 460
    .line 461
    move-result p1

    .line 462
    return p1

    .line 463
    :pswitch_10
    check-cast p1, Lr6/k;

    .line 464
    .line 465
    check-cast p2, Lr6/k;

    .line 466
    .line 467
    invoke-static {p1, p2}, Lr6/k;->c(Lr6/k;Lr6/k;)I

    .line 468
    .line 469
    .line 470
    move-result p1

    .line 471
    return p1

    .line 472
    :pswitch_11
    check-cast p1, Ljava/util/List;

    .line 473
    .line 474
    check-cast p2, Ljava/util/List;

    .line 475
    .line 476
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object p1

    .line 480
    check-cast p1, Lr6/h;

    .line 481
    .line 482
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object p2

    .line 486
    check-cast p2, Lr6/h;

    .line 487
    .line 488
    invoke-virtual {p1, p2}, Lr6/h;->c(Lr6/h;)I

    .line 489
    .line 490
    .line 491
    move-result p1

    .line 492
    return p1

    .line 493
    :pswitch_12
    check-cast p1, Ljava/util/List;

    .line 494
    .line 495
    check-cast p2, Ljava/util/List;

    .line 496
    .line 497
    invoke-static {p1}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object p1

    .line 501
    check-cast p1, Lr6/c;

    .line 502
    .line 503
    invoke-static {p2}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object p2

    .line 507
    check-cast p2, Lr6/c;

    .line 508
    .line 509
    invoke-virtual {p1, p2}, Lr6/c;->c(Lr6/c;)I

    .line 510
    .line 511
    .line 512
    move-result p1

    .line 513
    return p1

    .line 514
    :pswitch_13
    check-cast p1, Ljava/util/List;

    .line 515
    .line 516
    check-cast p2, Ljava/util/List;

    .line 517
    .line 518
    new-instance v2, Lq6/d;

    .line 519
    .line 520
    invoke-direct {v2, v0}, Lq6/d;-><init>(I)V

    .line 521
    .line 522
    .line 523
    invoke-static {p1, v2}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    check-cast v2, Lr6/k;

    .line 528
    .line 529
    new-instance v3, Lq6/d;

    .line 530
    .line 531
    invoke-direct {v3, v0}, Lq6/d;-><init>(I)V

    .line 532
    .line 533
    .line 534
    invoke-static {p2, v3}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    check-cast v0, Lr6/k;

    .line 539
    .line 540
    invoke-static {v2, v0}, Lr6/k;->c(Lr6/k;Lr6/k;)I

    .line 541
    .line 542
    .line 543
    move-result v0

    .line 544
    invoke-static {v0}, Ll8/y;->f(I)Ll8/A;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 549
    .line 550
    .line 551
    move-result v2

    .line 552
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 553
    .line 554
    .line 555
    move-result v3

    .line 556
    invoke-virtual {v0, v2, v3}, Ll8/A;->a(II)Ll8/A;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    new-instance v2, Lq6/d;

    .line 561
    .line 562
    invoke-direct {v2, v1}, Lq6/d;-><init>(I)V

    .line 563
    .line 564
    .line 565
    invoke-static {p1, v2}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object p1

    .line 569
    check-cast p1, Lr6/k;

    .line 570
    .line 571
    new-instance v2, Lq6/d;

    .line 572
    .line 573
    invoke-direct {v2, v1}, Lq6/d;-><init>(I)V

    .line 574
    .line 575
    .line 576
    invoke-static {p2, v2}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object p2

    .line 580
    check-cast p2, Lr6/k;

    .line 581
    .line 582
    new-instance v2, Lq6/d;

    .line 583
    .line 584
    invoke-direct {v2, v1}, Lq6/d;-><init>(I)V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v0, p1, p2, v2}, Ll8/A;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll8/A;

    .line 588
    .line 589
    .line 590
    move-result-object p1

    .line 591
    invoke-virtual {p1}, Ll8/A;->e()I

    .line 592
    .line 593
    .line 594
    move-result p1

    .line 595
    return p1

    .line 596
    :pswitch_14
    check-cast p1, Ljava/lang/Integer;

    .line 597
    .line 598
    check-cast p2, Ljava/lang/Integer;

    .line 599
    .line 600
    sget-object p1, Lr6/l;->j:Ll8/d0;

    .line 601
    .line 602
    return v2

    .line 603
    :pswitch_15
    check-cast p1, Ljava/lang/Integer;

    .line 604
    .line 605
    check-cast p2, Ljava/lang/Integer;

    .line 606
    .line 607
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    const/4 v1, -0x1

    .line 612
    if-ne v0, v1, :cond_f

    .line 613
    .line 614
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 615
    .line 616
    .line 617
    move-result p1

    .line 618
    if-ne p1, v1, :cond_e

    .line 619
    .line 620
    goto :goto_9

    .line 621
    :cond_e
    move v2, v1

    .line 622
    goto :goto_9

    .line 623
    :cond_f
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 624
    .line 625
    .line 626
    move-result v0

    .line 627
    if-ne v0, v1, :cond_10

    .line 628
    .line 629
    const/4 v2, 0x1

    .line 630
    goto :goto_9

    .line 631
    :cond_10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 632
    .line 633
    .line 634
    move-result p1

    .line 635
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 636
    .line 637
    .line 638
    move-result p2

    .line 639
    sub-int v2, p1, p2

    .line 640
    .line 641
    :goto_9
    return v2

    .line 642
    :pswitch_16
    check-cast p1, LE5/T;

    .line 643
    .line 644
    check-cast p2, LE5/T;

    .line 645
    .line 646
    iget p2, p2, LE5/T;->h:I

    .line 647
    .line 648
    iget p1, p1, LE5/T;->h:I

    .line 649
    .line 650
    sub-int/2addr p2, p1

    .line 651
    return p2

    .line 652
    :pswitch_17
    check-cast p1, Lq6/c;

    .line 653
    .line 654
    check-cast p2, Lq6/c;

    .line 655
    .line 656
    iget-wide v0, p1, Lq6/c;->b:J

    .line 657
    .line 658
    iget-wide p1, p2, Lq6/c;->b:J

    .line 659
    .line 660
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compare(JJ)I

    .line 661
    .line 662
    .line 663
    move-result p1

    .line 664
    return p1

    .line 665
    :pswitch_18
    check-cast p1, Lq6/e;

    .line 666
    .line 667
    check-cast p2, Lq6/e;

    .line 668
    .line 669
    iget-object p1, p1, Lq6/e;->a:Lq6/f;

    .line 670
    .line 671
    iget p1, p1, Lq6/f;->b:I

    .line 672
    .line 673
    iget-object p2, p2, Lq6/e;->a:Lq6/f;

    .line 674
    .line 675
    iget p2, p2, Lq6/f;->b:I

    .line 676
    .line 677
    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    .line 678
    .line 679
    .line 680
    move-result p1

    .line 681
    return p1

    .line 682
    nop

    .line 683
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
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
