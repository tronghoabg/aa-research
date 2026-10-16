.class public final Ldb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/p;


# static fields
.field public static b:LR8/a;


# instance fields
.field public a:Luc/r;


# virtual methods
.method public final onMethodCall(Luc/o;Luc/q;)V
    .locals 11

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :try_start_0
    iget-object v1, p1, Luc/o;->b:Ljava/lang/Object;

    .line 8
    .line 9
    const-string v2, "null cannot be cast to non-null type kotlin.collections.List<*>"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v1, Ljava/util/List;

    .line 15
    .line 16
    iget-object p1, p1, Luc/o;->a:Ljava/lang/String;

    .line 17
    .line 18
    if-eqz p1, :cond_36

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    const-string v3, "null cannot be cast to non-null type kotlin.Boolean"

    .line 25
    .line 26
    const/4 v4, 0x2

    .line 27
    const/16 v5, 0x1c

    .line 28
    .line 29
    const/16 v6, 0x1d

    .line 30
    .line 31
    const/4 v7, 0x1

    .line 32
    const/16 v8, 0x1f

    .line 33
    .line 34
    const/4 v9, 0x0

    .line 35
    const-string v10, "null cannot be cast to non-null type kotlin.Int"

    .line 36
    .line 37
    sparse-switch v2, :sswitch_data_0

    .line 38
    .line 39
    .line 40
    goto/16 :goto_1

    .line 41
    .line 42
    :sswitch_0
    :try_start_1
    const-string v1, "generateAudioSessionId"

    .line 43
    .line 44
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-nez p1, :cond_0

    .line 49
    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :cond_0
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 53
    .line 54
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Landroid/media/AudioManager;

    .line 60
    .line 61
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/media/AudioManager;->generateAudioSessionId()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    move-object v1, p2

    .line 73
    check-cast v1, Ltc/g;

    .line 74
    .line 75
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :catch_0
    move-exception p1

    .line 80
    goto/16 :goto_2

    .line 81
    .line 82
    :sswitch_1
    const-string v1, "isVolumeFixed"

    .line 83
    .line 84
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-nez p1, :cond_1

    .line 89
    .line 90
    goto/16 :goto_1

    .line 91
    .line 92
    :cond_1
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 93
    .line 94
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p1, Landroid/media/AudioManager;

    .line 100
    .line 101
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/media/AudioManager;->isVolumeFixed()Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    move-object v1, p2

    .line 113
    check-cast v1, Ltc/g;

    .line 114
    .line 115
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :sswitch_2
    const-string v2, "setMode"

    .line 120
    .line 121
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-nez p1, :cond_2

    .line 126
    .line 127
    goto/16 :goto_1

    .line 128
    .line 129
    :cond_2
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 130
    .line 131
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    check-cast v1, Ljava/lang/Integer;

    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast p1, Landroid/media/AudioManager;

    .line 150
    .line 151
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->setMode(I)V

    .line 155
    .line 156
    .line 157
    move-object p1, p2

    .line 158
    check-cast p1, Ltc/g;

    .line 159
    .line 160
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :sswitch_3
    const-string v1, "getAvailableCommunicationDevices"

    .line 165
    .line 166
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    if-nez p1, :cond_3

    .line 171
    .line 172
    goto/16 :goto_1

    .line 173
    .line 174
    :cond_3
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 175
    .line 176
    if-lt p1, v8, :cond_4

    .line 177
    .line 178
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 179
    .line 180
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1}, LR8/a;->g()Ljava/util/ArrayList;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    move-object v1, p2

    .line 188
    check-cast v1, Ltc/g;

    .line 189
    .line 190
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :cond_4
    new-instance p1, LE5/Q;

    .line 195
    .line 196
    invoke-direct {p1, v8}, LE5/Q;-><init>(I)V

    .line 197
    .line 198
    .line 199
    throw p1

    .line 200
    :sswitch_4
    const-string v2, "playSoundEffect"

    .line 201
    .line 202
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    if-nez p1, :cond_5

    .line 207
    .line 208
    goto/16 :goto_1

    .line 209
    .line 210
    :cond_5
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 211
    .line 212
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    check-cast v2, Ljava/lang/Integer;

    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    check-cast v1, Ljava/lang/Double;

    .line 233
    .line 234
    if-eqz v1, :cond_6

    .line 235
    .line 236
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast p1, Landroid/media/AudioManager;

    .line 239
    .line 240
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 244
    .line 245
    .line 246
    move-result-wide v3

    .line 247
    double-to-float v1, v3

    .line 248
    invoke-virtual {p1, v2, v1}, Landroid/media/AudioManager;->playSoundEffect(IF)V

    .line 249
    .line 250
    .line 251
    goto :goto_0

    .line 252
    :cond_6
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast p1, Landroid/media/AudioManager;

    .line 255
    .line 256
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p1, v2}, Landroid/media/AudioManager;->playSoundEffect(I)V

    .line 260
    .line 261
    .line 262
    :goto_0
    move-object p1, p2

    .line 263
    check-cast p1, Ltc/g;

    .line 264
    .line 265
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    return-void

    .line 269
    :sswitch_5
    const-string v2, "setRingerMode"

    .line 270
    .line 271
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result p1

    .line 275
    if-nez p1, :cond_7

    .line 276
    .line 277
    goto/16 :goto_1

    .line 278
    .line 279
    :cond_7
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 280
    .line 281
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    check-cast v1, Ljava/lang/Integer;

    .line 292
    .line 293
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast p1, Landroid/media/AudioManager;

    .line 300
    .line 301
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->setRingerMode(I)V

    .line 305
    .line 306
    .line 307
    move-object p1, p2

    .line 308
    check-cast p1, Ltc/g;

    .line 309
    .line 310
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    return-void

    .line 314
    :sswitch_6
    const-string v1, "unloadSoundEffects"

    .line 315
    .line 316
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result p1

    .line 320
    if-nez p1, :cond_8

    .line 321
    .line 322
    goto/16 :goto_1

    .line 323
    .line 324
    :cond_8
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 325
    .line 326
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast p1, Landroid/media/AudioManager;

    .line 332
    .line 333
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {p1}, Landroid/media/AudioManager;->unloadSoundEffects()V

    .line 337
    .line 338
    .line 339
    move-object p1, p2

    .line 340
    check-cast p1, Ltc/g;

    .line 341
    .line 342
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    return-void

    .line 346
    :sswitch_7
    const-string v1, "abandonAudioFocus"

    .line 347
    .line 348
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result p1

    .line 352
    if-nez p1, :cond_9

    .line 353
    .line 354
    goto/16 :goto_1

    .line 355
    .line 356
    :cond_9
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 357
    .line 358
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {p1}, LR8/a;->d()Z

    .line 362
    .line 363
    .line 364
    move-result p1

    .line 365
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    move-object v1, p2

    .line 370
    check-cast v1, Ltc/g;

    .line 371
    .line 372
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    return-void

    .line 376
    :sswitch_8
    const-string v2, "adjustSuggestedStreamVolume"

    .line 377
    .line 378
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result p1

    .line 382
    if-nez p1, :cond_a

    .line 383
    .line 384
    goto/16 :goto_1

    .line 385
    .line 386
    :cond_a
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 387
    .line 388
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    check-cast v2, Ljava/lang/Integer;

    .line 399
    .line 400
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    check-cast v3, Ljava/lang/Integer;

    .line 412
    .line 413
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    check-cast v1, Ljava/lang/Integer;

    .line 425
    .line 426
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 427
    .line 428
    .line 429
    move-result v1

    .line 430
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast p1, Landroid/media/AudioManager;

    .line 433
    .line 434
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {p1, v2, v3, v1}, Landroid/media/AudioManager;->adjustSuggestedStreamVolume(III)V

    .line 438
    .line 439
    .line 440
    move-object p1, p2

    .line 441
    check-cast p1, Ltc/g;

    .line 442
    .line 443
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    return-void

    .line 447
    :sswitch_9
    const-string v1, "clearCommunicationDevice"

    .line 448
    .line 449
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 450
    .line 451
    .line 452
    move-result p1

    .line 453
    if-nez p1, :cond_b

    .line 454
    .line 455
    goto/16 :goto_1

    .line 456
    .line 457
    :cond_b
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 458
    .line 459
    if-lt p1, v8, :cond_c

    .line 460
    .line 461
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 462
    .line 463
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 464
    .line 465
    .line 466
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast p1, Landroid/media/AudioManager;

    .line 469
    .line 470
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    invoke-static {p1}, Lab/d;->u(Landroid/media/AudioManager;)V

    .line 474
    .line 475
    .line 476
    move-object p1, p2

    .line 477
    check-cast p1, Ltc/g;

    .line 478
    .line 479
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    return-void

    .line 483
    :cond_c
    new-instance p1, LE5/Q;

    .line 484
    .line 485
    invoke-direct {p1, v8}, LE5/Q;-><init>(I)V

    .line 486
    .line 487
    .line 488
    throw p1

    .line 489
    :sswitch_a
    const-string v2, "setStreamVolume"

    .line 490
    .line 491
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    move-result p1

    .line 495
    if-nez p1, :cond_d

    .line 496
    .line 497
    goto/16 :goto_1

    .line 498
    .line 499
    :cond_d
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 500
    .line 501
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v2

    .line 508
    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    check-cast v2, Ljava/lang/Integer;

    .line 512
    .line 513
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 514
    .line 515
    .line 516
    move-result v2

    .line 517
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v3

    .line 521
    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    check-cast v3, Ljava/lang/Integer;

    .line 525
    .line 526
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 527
    .line 528
    .line 529
    move-result v3

    .line 530
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    check-cast v1, Ljava/lang/Integer;

    .line 538
    .line 539
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 540
    .line 541
    .line 542
    move-result v1

    .line 543
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 544
    .line 545
    check-cast p1, Landroid/media/AudioManager;

    .line 546
    .line 547
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {p1, v2, v3, v1}, Landroid/media/AudioManager;->setStreamVolume(III)V

    .line 551
    .line 552
    .line 553
    move-object p1, p2

    .line 554
    check-cast p1, Ltc/g;

    .line 555
    .line 556
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    return-void

    .line 560
    :sswitch_b
    const-string v1, "getAllowedCapturePolicy"

    .line 561
    .line 562
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-result p1

    .line 566
    if-nez p1, :cond_e

    .line 567
    .line 568
    goto/16 :goto_1

    .line 569
    .line 570
    :cond_e
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 571
    .line 572
    if-lt p1, v6, :cond_f

    .line 573
    .line 574
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 575
    .line 576
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 580
    .line 581
    check-cast p1, Landroid/media/AudioManager;

    .line 582
    .line 583
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    invoke-static {p1}, Ld2/n;->a(Landroid/media/AudioManager;)I

    .line 587
    .line 588
    .line 589
    move-result p1

    .line 590
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 591
    .line 592
    .line 593
    move-result-object p1

    .line 594
    move-object v1, p2

    .line 595
    check-cast v1, Ltc/g;

    .line 596
    .line 597
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 598
    .line 599
    .line 600
    return-void

    .line 601
    :cond_f
    new-instance p1, LE5/Q;

    .line 602
    .line 603
    invoke-direct {p1, v6}, LE5/Q;-><init>(I)V

    .line 604
    .line 605
    .line 606
    throw p1

    .line 607
    :sswitch_c
    const-string v2, "getProperty"

    .line 608
    .line 609
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    move-result p1

    .line 613
    if-nez p1, :cond_10

    .line 614
    .line 615
    goto/16 :goto_1

    .line 616
    .line 617
    :cond_10
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 618
    .line 619
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v1

    .line 626
    check-cast v1, Ljava/lang/String;

    .line 627
    .line 628
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 629
    .line 630
    check-cast p1, Landroid/media/AudioManager;

    .line 631
    .line 632
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 633
    .line 634
    .line 635
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object p1

    .line 639
    const-string v1, "getProperty(...)"

    .line 640
    .line 641
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    move-object v1, p2

    .line 645
    check-cast v1, Ltc/g;

    .line 646
    .line 647
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 648
    .line 649
    .line 650
    return-void

    .line 651
    :sswitch_d
    const-string v2, "isStreamMute"

    .line 652
    .line 653
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    move-result p1

    .line 657
    if-nez p1, :cond_11

    .line 658
    .line 659
    goto/16 :goto_1

    .line 660
    .line 661
    :cond_11
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 662
    .line 663
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v1

    .line 670
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 671
    .line 672
    .line 673
    check-cast v1, Ljava/lang/Integer;

    .line 674
    .line 675
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 676
    .line 677
    .line 678
    move-result v1

    .line 679
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 680
    .line 681
    check-cast p1, Landroid/media/AudioManager;

    .line 682
    .line 683
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->isStreamMute(I)Z

    .line 687
    .line 688
    .line 689
    move-result p1

    .line 690
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 691
    .line 692
    .line 693
    move-result-object p1

    .line 694
    move-object v1, p2

    .line 695
    check-cast v1, Ltc/g;

    .line 696
    .line 697
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 698
    .line 699
    .line 700
    return-void

    .line 701
    :sswitch_e
    const-string v2, "adjustVolume"

    .line 702
    .line 703
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    move-result p1

    .line 707
    if-nez p1, :cond_12

    .line 708
    .line 709
    goto/16 :goto_1

    .line 710
    .line 711
    :cond_12
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 712
    .line 713
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 714
    .line 715
    .line 716
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v2

    .line 720
    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 721
    .line 722
    .line 723
    check-cast v2, Ljava/lang/Integer;

    .line 724
    .line 725
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 726
    .line 727
    .line 728
    move-result v2

    .line 729
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 734
    .line 735
    .line 736
    check-cast v1, Ljava/lang/Integer;

    .line 737
    .line 738
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 739
    .line 740
    .line 741
    move-result v1

    .line 742
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 743
    .line 744
    check-cast p1, Landroid/media/AudioManager;

    .line 745
    .line 746
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {p1, v2, v1}, Landroid/media/AudioManager;->adjustVolume(II)V

    .line 750
    .line 751
    .line 752
    move-object p1, p2

    .line 753
    check-cast p1, Ltc/g;

    .line 754
    .line 755
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 756
    .line 757
    .line 758
    return-void

    .line 759
    :sswitch_f
    const-string v2, "setParameters"

    .line 760
    .line 761
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 762
    .line 763
    .line 764
    move-result p1

    .line 765
    if-nez p1, :cond_13

    .line 766
    .line 767
    goto/16 :goto_1

    .line 768
    .line 769
    :cond_13
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 770
    .line 771
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 772
    .line 773
    .line 774
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v1

    .line 778
    check-cast v1, Ljava/lang/String;

    .line 779
    .line 780
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 781
    .line 782
    check-cast p1, Landroid/media/AudioManager;

    .line 783
    .line 784
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 785
    .line 786
    .line 787
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->setParameters(Ljava/lang/String;)V

    .line 788
    .line 789
    .line 790
    move-object p1, p2

    .line 791
    check-cast p1, Ltc/g;

    .line 792
    .line 793
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 794
    .line 795
    .line 796
    return-void

    .line 797
    :sswitch_10
    const-string v1, "getRingerMode"

    .line 798
    .line 799
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 800
    .line 801
    .line 802
    move-result p1

    .line 803
    if-nez p1, :cond_14

    .line 804
    .line 805
    goto/16 :goto_1

    .line 806
    .line 807
    :cond_14
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 808
    .line 809
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 810
    .line 811
    .line 812
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 813
    .line 814
    check-cast p1, Landroid/media/AudioManager;

    .line 815
    .line 816
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 817
    .line 818
    .line 819
    invoke-virtual {p1}, Landroid/media/AudioManager;->getRingerMode()I

    .line 820
    .line 821
    .line 822
    move-result p1

    .line 823
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 824
    .line 825
    .line 826
    move-result-object p1

    .line 827
    move-object v1, p2

    .line 828
    check-cast v1, Ltc/g;

    .line 829
    .line 830
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 831
    .line 832
    .line 833
    return-void

    .line 834
    :sswitch_11
    const-string v1, "isBluetoothScoAvailableOffCall"

    .line 835
    .line 836
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 837
    .line 838
    .line 839
    move-result p1

    .line 840
    if-nez p1, :cond_15

    .line 841
    .line 842
    goto/16 :goto_1

    .line 843
    .line 844
    :cond_15
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 845
    .line 846
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 847
    .line 848
    .line 849
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 850
    .line 851
    check-cast p1, Landroid/media/AudioManager;

    .line 852
    .line 853
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {p1}, Landroid/media/AudioManager;->isBluetoothScoAvailableOffCall()Z

    .line 857
    .line 858
    .line 859
    move-result p1

    .line 860
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 861
    .line 862
    .line 863
    move-result-object p1

    .line 864
    move-object v1, p2

    .line 865
    check-cast v1, Ltc/g;

    .line 866
    .line 867
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 868
    .line 869
    .line 870
    return-void

    .line 871
    :sswitch_12
    const-string v2, "getStreamVolume"

    .line 872
    .line 873
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 874
    .line 875
    .line 876
    move-result p1

    .line 877
    if-nez p1, :cond_16

    .line 878
    .line 879
    goto/16 :goto_1

    .line 880
    .line 881
    :cond_16
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 882
    .line 883
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 884
    .line 885
    .line 886
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    move-result-object v1

    .line 890
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 891
    .line 892
    .line 893
    check-cast v1, Ljava/lang/Integer;

    .line 894
    .line 895
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 896
    .line 897
    .line 898
    move-result v1

    .line 899
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 900
    .line 901
    check-cast p1, Landroid/media/AudioManager;

    .line 902
    .line 903
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 904
    .line 905
    .line 906
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    .line 907
    .line 908
    .line 909
    move-result p1

    .line 910
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 911
    .line 912
    .line 913
    move-result-object p1

    .line 914
    move-object v1, p2

    .line 915
    check-cast v1, Ltc/g;

    .line 916
    .line 917
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 918
    .line 919
    .line 920
    return-void

    .line 921
    :sswitch_13
    const-string v1, "stopBluetoothSco"

    .line 922
    .line 923
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 924
    .line 925
    .line 926
    move-result p1

    .line 927
    if-nez p1, :cond_17

    .line 928
    .line 929
    goto/16 :goto_1

    .line 930
    .line 931
    :cond_17
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 932
    .line 933
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 934
    .line 935
    .line 936
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 937
    .line 938
    check-cast p1, Landroid/media/AudioManager;

    .line 939
    .line 940
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 941
    .line 942
    .line 943
    invoke-virtual {p1}, Landroid/media/AudioManager;->stopBluetoothSco()V

    .line 944
    .line 945
    .line 946
    move-object p1, p2

    .line 947
    check-cast p1, Ltc/g;

    .line 948
    .line 949
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 950
    .line 951
    .line 952
    return-void

    .line 953
    :sswitch_14
    const-string v2, "getParameters"

    .line 954
    .line 955
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 956
    .line 957
    .line 958
    move-result p1

    .line 959
    if-nez p1, :cond_18

    .line 960
    .line 961
    goto/16 :goto_1

    .line 962
    .line 963
    :cond_18
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 964
    .line 965
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 966
    .line 967
    .line 968
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 969
    .line 970
    .line 971
    move-result-object v1

    .line 972
    check-cast v1, Ljava/lang/String;

    .line 973
    .line 974
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 975
    .line 976
    check-cast p1, Landroid/media/AudioManager;

    .line 977
    .line 978
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 979
    .line 980
    .line 981
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->getParameters(Ljava/lang/String;)Ljava/lang/String;

    .line 982
    .line 983
    .line 984
    move-result-object p1

    .line 985
    const-string v1, "getParameters(...)"

    .line 986
    .line 987
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 988
    .line 989
    .line 990
    move-object v1, p2

    .line 991
    check-cast v1, Ltc/g;

    .line 992
    .line 993
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 994
    .line 995
    .line 996
    return-void

    .line 997
    :sswitch_15
    const-string v2, "dispatchMediaKeyEvent"

    .line 998
    .line 999
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1000
    .line 1001
    .line 1002
    move-result p1

    .line 1003
    if-nez p1, :cond_19

    .line 1004
    .line 1005
    goto/16 :goto_1

    .line 1006
    .line 1007
    :cond_19
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1008
    .line 1009
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1010
    .line 1011
    .line 1012
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v1

    .line 1016
    const-string v2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>"

    .line 1017
    .line 1018
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1019
    .line 1020
    .line 1021
    check-cast v1, Ljava/util/Map;

    .line 1022
    .line 1023
    invoke-virtual {p1, v1}, LR8/a;->f(Ljava/util/Map;)V

    .line 1024
    .line 1025
    .line 1026
    move-object p1, p2

    .line 1027
    check-cast p1, Ltc/g;

    .line 1028
    .line 1029
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1030
    .line 1031
    .line 1032
    return-void

    .line 1033
    :sswitch_16
    const-string v1, "getMode"

    .line 1034
    .line 1035
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1036
    .line 1037
    .line 1038
    move-result p1

    .line 1039
    if-nez p1, :cond_1a

    .line 1040
    .line 1041
    goto/16 :goto_1

    .line 1042
    .line 1043
    :cond_1a
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1044
    .line 1045
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1046
    .line 1047
    .line 1048
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 1049
    .line 1050
    check-cast p1, Landroid/media/AudioManager;

    .line 1051
    .line 1052
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {p1}, Landroid/media/AudioManager;->getMode()I

    .line 1056
    .line 1057
    .line 1058
    move-result p1

    .line 1059
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1060
    .line 1061
    .line 1062
    move-result-object p1

    .line 1063
    move-object v1, p2

    .line 1064
    check-cast v1, Ltc/g;

    .line 1065
    .line 1066
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1067
    .line 1068
    .line 1069
    return-void

    .line 1070
    :sswitch_17
    const-string v2, "getStreamVolumeDb"

    .line 1071
    .line 1072
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1073
    .line 1074
    .line 1075
    move-result p1

    .line 1076
    if-nez p1, :cond_1b

    .line 1077
    .line 1078
    goto/16 :goto_1

    .line 1079
    .line 1080
    :cond_1b
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1081
    .line 1082
    if-lt p1, v5, :cond_1c

    .line 1083
    .line 1084
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1085
    .line 1086
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1087
    .line 1088
    .line 1089
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v2

    .line 1093
    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1094
    .line 1095
    .line 1096
    check-cast v2, Ljava/lang/Integer;

    .line 1097
    .line 1098
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1099
    .line 1100
    .line 1101
    move-result v2

    .line 1102
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v3

    .line 1106
    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1107
    .line 1108
    .line 1109
    check-cast v3, Ljava/lang/Integer;

    .line 1110
    .line 1111
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1112
    .line 1113
    .line 1114
    move-result v3

    .line 1115
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v1

    .line 1119
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1120
    .line 1121
    .line 1122
    check-cast v1, Ljava/lang/Integer;

    .line 1123
    .line 1124
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1125
    .line 1126
    .line 1127
    move-result v1

    .line 1128
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 1129
    .line 1130
    check-cast p1, Landroid/media/AudioManager;

    .line 1131
    .line 1132
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1133
    .line 1134
    .line 1135
    invoke-static {p1, v2, v3, v1}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->a(Landroid/media/AudioManager;III)F

    .line 1136
    .line 1137
    .line 1138
    move-result p1

    .line 1139
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1140
    .line 1141
    .line 1142
    move-result-object p1

    .line 1143
    move-object v1, p2

    .line 1144
    check-cast v1, Ltc/g;

    .line 1145
    .line 1146
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1147
    .line 1148
    .line 1149
    return-void

    .line 1150
    :cond_1c
    new-instance p1, LE5/Q;

    .line 1151
    .line 1152
    invoke-direct {p1, v5}, LE5/Q;-><init>(I)V

    .line 1153
    .line 1154
    .line 1155
    throw p1

    .line 1156
    :sswitch_18
    const-string v2, "setCommunicationDevice"

    .line 1157
    .line 1158
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1159
    .line 1160
    .line 1161
    move-result p1

    .line 1162
    if-nez p1, :cond_1d

    .line 1163
    .line 1164
    goto/16 :goto_1

    .line 1165
    .line 1166
    :cond_1d
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1167
    .line 1168
    if-lt p1, v8, :cond_1e

    .line 1169
    .line 1170
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1171
    .line 1172
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1173
    .line 1174
    .line 1175
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v1

    .line 1179
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1180
    .line 1181
    .line 1182
    check-cast v1, Ljava/lang/Integer;

    .line 1183
    .line 1184
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1185
    .line 1186
    .line 1187
    move-result v1

    .line 1188
    invoke-virtual {p1, v1}, LR8/a;->v(I)Z

    .line 1189
    .line 1190
    .line 1191
    move-result p1

    .line 1192
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1193
    .line 1194
    .line 1195
    move-result-object p1

    .line 1196
    move-object v1, p2

    .line 1197
    check-cast v1, Ltc/g;

    .line 1198
    .line 1199
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1200
    .line 1201
    .line 1202
    return-void

    .line 1203
    :cond_1e
    new-instance p1, LE5/Q;

    .line 1204
    .line 1205
    invoke-direct {p1, v8}, LE5/Q;-><init>(I)V

    .line 1206
    .line 1207
    .line 1208
    throw p1

    .line 1209
    :sswitch_19
    const-string v1, "startBluetoothSco"

    .line 1210
    .line 1211
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1212
    .line 1213
    .line 1214
    move-result p1

    .line 1215
    if-nez p1, :cond_1f

    .line 1216
    .line 1217
    goto/16 :goto_1

    .line 1218
    .line 1219
    :cond_1f
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1220
    .line 1221
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1222
    .line 1223
    .line 1224
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 1225
    .line 1226
    check-cast p1, Landroid/media/AudioManager;

    .line 1227
    .line 1228
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {p1}, Landroid/media/AudioManager;->startBluetoothSco()V

    .line 1232
    .line 1233
    .line 1234
    move-object p1, p2

    .line 1235
    check-cast p1, Ltc/g;

    .line 1236
    .line 1237
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1238
    .line 1239
    .line 1240
    return-void

    .line 1241
    :sswitch_1a
    const-string v1, "isMusicActive"

    .line 1242
    .line 1243
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1244
    .line 1245
    .line 1246
    move-result p1

    .line 1247
    if-nez p1, :cond_20

    .line 1248
    .line 1249
    goto/16 :goto_1

    .line 1250
    .line 1251
    :cond_20
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1252
    .line 1253
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1254
    .line 1255
    .line 1256
    iget-object p1, p1, LR8/a;->e:Ljava/lang/Object;

    .line 1257
    .line 1258
    check-cast p1, Landroid/media/AudioManager;

    .line 1259
    .line 1260
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual {p1}, Landroid/media/AudioManager;->isMusicActive()Z

    .line 1264
    .line 1265
    .line 1266
    move-result p1

    .line 1267
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1268
    .line 1269
    .line 1270
    move-result-object p1

    .line 1271
    move-object v1, p2

    .line 1272
    check-cast v1, Ltc/g;

    .line 1273
    .line 1274
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1275
    .line 1276
    .line 1277
    return-void

    .line 1278
    :sswitch_1b
    const-string v1, "loadSoundEffects"

    .line 1279
    .line 1280
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1281
    .line 1282
    .line 1283
    move-result p1

    .line 1284
    if-nez p1, :cond_21

    .line 1285
    .line 1286
    goto/16 :goto_1

    .line 1287
    .line 1288
    :cond_21
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1289
    .line 1290
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1291
    .line 1292
    .line 1293
    invoke-virtual {p1}, LR8/a;->r()V

    .line 1294
    .line 1295
    .line 1296
    move-object p1, p2

    .line 1297
    check-cast p1, Ltc/g;

    .line 1298
    .line 1299
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1300
    .line 1301
    .line 1302
    return-void

    .line 1303
    :sswitch_1c
    const-string v2, "getStreamMinVolume"

    .line 1304
    .line 1305
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1306
    .line 1307
    .line 1308
    move-result p1

    .line 1309
    if-nez p1, :cond_22

    .line 1310
    .line 1311
    goto/16 :goto_1

    .line 1312
    .line 1313
    :cond_22
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1314
    .line 1315
    if-lt p1, v5, :cond_23

    .line 1316
    .line 1317
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1318
    .line 1319
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1320
    .line 1321
    .line 1322
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v1

    .line 1326
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1327
    .line 1328
    .line 1329
    check-cast v1, Ljava/lang/Integer;

    .line 1330
    .line 1331
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1332
    .line 1333
    .line 1334
    move-result v1

    .line 1335
    invoke-virtual {p1, v1}, LR8/a;->l(I)Ljava/lang/Integer;

    .line 1336
    .line 1337
    .line 1338
    move-result-object p1

    .line 1339
    move-object v1, p2

    .line 1340
    check-cast v1, Ltc/g;

    .line 1341
    .line 1342
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1343
    .line 1344
    .line 1345
    return-void

    .line 1346
    :cond_23
    new-instance p1, LE5/Q;

    .line 1347
    .line 1348
    invoke-direct {p1, v5}, LE5/Q;-><init>(I)V

    .line 1349
    .line 1350
    .line 1351
    throw p1

    .line 1352
    :sswitch_1d
    const-string v2, "setBluetoothScoOn"

    .line 1353
    .line 1354
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1355
    .line 1356
    .line 1357
    move-result p1

    .line 1358
    if-nez p1, :cond_24

    .line 1359
    .line 1360
    goto/16 :goto_1

    .line 1361
    .line 1362
    :cond_24
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1363
    .line 1364
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1365
    .line 1366
    .line 1367
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v1

    .line 1371
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1372
    .line 1373
    .line 1374
    check-cast v1, Ljava/lang/Boolean;

    .line 1375
    .line 1376
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1377
    .line 1378
    .line 1379
    move-result v1

    .line 1380
    invoke-virtual {p1, v1}, LR8/a;->u(Z)V

    .line 1381
    .line 1382
    .line 1383
    move-object p1, p2

    .line 1384
    check-cast p1, Ltc/g;

    .line 1385
    .line 1386
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1387
    .line 1388
    .line 1389
    return-void

    .line 1390
    :sswitch_1e
    const-string v2, "setAllowedCapturePolicy"

    .line 1391
    .line 1392
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1393
    .line 1394
    .line 1395
    move-result p1

    .line 1396
    if-nez p1, :cond_25

    .line 1397
    .line 1398
    goto/16 :goto_1

    .line 1399
    .line 1400
    :cond_25
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1401
    .line 1402
    if-lt p1, v6, :cond_26

    .line 1403
    .line 1404
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1405
    .line 1406
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1407
    .line 1408
    .line 1409
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v1

    .line 1413
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1414
    .line 1415
    .line 1416
    check-cast v1, Ljava/lang/Integer;

    .line 1417
    .line 1418
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1419
    .line 1420
    .line 1421
    move-result v1

    .line 1422
    invoke-virtual {p1, v1}, LR8/a;->t(I)V

    .line 1423
    .line 1424
    .line 1425
    move-object p1, p2

    .line 1426
    check-cast p1, Ltc/g;

    .line 1427
    .line 1428
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1429
    .line 1430
    .line 1431
    return-void

    .line 1432
    :cond_26
    new-instance p1, LE5/Q;

    .line 1433
    .line 1434
    invoke-direct {p1, v6}, LE5/Q;-><init>(I)V

    .line 1435
    .line 1436
    .line 1437
    throw p1

    .line 1438
    :sswitch_1f
    const-string v1, "getMicrophones"

    .line 1439
    .line 1440
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1441
    .line 1442
    .line 1443
    move-result p1

    .line 1444
    if-nez p1, :cond_27

    .line 1445
    .line 1446
    goto/16 :goto_1

    .line 1447
    .line 1448
    :cond_27
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1449
    .line 1450
    if-lt p1, v5, :cond_28

    .line 1451
    .line 1452
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1453
    .line 1454
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1455
    .line 1456
    .line 1457
    invoke-virtual {p1}, LR8/a;->j()Ljava/util/ArrayList;

    .line 1458
    .line 1459
    .line 1460
    move-result-object p1

    .line 1461
    move-object v1, p2

    .line 1462
    check-cast v1, Ltc/g;

    .line 1463
    .line 1464
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1465
    .line 1466
    .line 1467
    return-void

    .line 1468
    :cond_28
    new-instance p1, LE5/Q;

    .line 1469
    .line 1470
    invoke-direct {p1, v5}, LE5/Q;-><init>(I)V

    .line 1471
    .line 1472
    .line 1473
    throw p1

    .line 1474
    :sswitch_20
    const-string v2, "adjustStreamVolume"

    .line 1475
    .line 1476
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1477
    .line 1478
    .line 1479
    move-result p1

    .line 1480
    if-nez p1, :cond_29

    .line 1481
    .line 1482
    goto/16 :goto_1

    .line 1483
    .line 1484
    :cond_29
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1485
    .line 1486
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1487
    .line 1488
    .line 1489
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v2

    .line 1493
    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1494
    .line 1495
    .line 1496
    check-cast v2, Ljava/lang/Integer;

    .line 1497
    .line 1498
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1499
    .line 1500
    .line 1501
    move-result v2

    .line 1502
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v3

    .line 1506
    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1507
    .line 1508
    .line 1509
    check-cast v3, Ljava/lang/Integer;

    .line 1510
    .line 1511
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1512
    .line 1513
    .line 1514
    move-result v3

    .line 1515
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v1

    .line 1519
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1520
    .line 1521
    .line 1522
    check-cast v1, Ljava/lang/Integer;

    .line 1523
    .line 1524
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1525
    .line 1526
    .line 1527
    move-result v1

    .line 1528
    invoke-virtual {p1, v2, v3, v1}, LR8/a;->e(III)V

    .line 1529
    .line 1530
    .line 1531
    move-object p1, p2

    .line 1532
    check-cast p1, Ltc/g;

    .line 1533
    .line 1534
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1535
    .line 1536
    .line 1537
    return-void

    .line 1538
    :sswitch_21
    const-string v1, "isBluetoothScoOn"

    .line 1539
    .line 1540
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1541
    .line 1542
    .line 1543
    move-result p1

    .line 1544
    if-nez p1, :cond_2a

    .line 1545
    .line 1546
    goto/16 :goto_1

    .line 1547
    .line 1548
    :cond_2a
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1549
    .line 1550
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1551
    .line 1552
    .line 1553
    invoke-virtual {p1}, LR8/a;->n()Ljava/lang/Boolean;

    .line 1554
    .line 1555
    .line 1556
    move-result-object p1

    .line 1557
    move-object v1, p2

    .line 1558
    check-cast v1, Ltc/g;

    .line 1559
    .line 1560
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1561
    .line 1562
    .line 1563
    return-void

    .line 1564
    :sswitch_22
    const-string v2, "setSpeakerphoneOn"

    .line 1565
    .line 1566
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1567
    .line 1568
    .line 1569
    move-result p1

    .line 1570
    if-nez p1, :cond_2b

    .line 1571
    .line 1572
    goto/16 :goto_1

    .line 1573
    .line 1574
    :cond_2b
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1575
    .line 1576
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1577
    .line 1578
    .line 1579
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v1

    .line 1583
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1584
    .line 1585
    .line 1586
    check-cast v1, Ljava/lang/Boolean;

    .line 1587
    .line 1588
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1589
    .line 1590
    .line 1591
    move-result v1

    .line 1592
    invoke-virtual {p1, v1}, LR8/a;->x(Z)V

    .line 1593
    .line 1594
    .line 1595
    move-object p1, p2

    .line 1596
    check-cast p1, Ltc/g;

    .line 1597
    .line 1598
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1599
    .line 1600
    .line 1601
    return-void

    .line 1602
    :sswitch_23
    const-string v2, "setMicrophoneMute"

    .line 1603
    .line 1604
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1605
    .line 1606
    .line 1607
    move-result p1

    .line 1608
    if-nez p1, :cond_2c

    .line 1609
    .line 1610
    goto/16 :goto_1

    .line 1611
    .line 1612
    :cond_2c
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1613
    .line 1614
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1615
    .line 1616
    .line 1617
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v1

    .line 1621
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1622
    .line 1623
    .line 1624
    check-cast v1, Ljava/lang/Boolean;

    .line 1625
    .line 1626
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1627
    .line 1628
    .line 1629
    move-result v1

    .line 1630
    invoke-virtual {p1, v1}, LR8/a;->w(Z)V

    .line 1631
    .line 1632
    .line 1633
    move-object p1, p2

    .line 1634
    check-cast p1, Ltc/g;

    .line 1635
    .line 1636
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1637
    .line 1638
    .line 1639
    return-void

    .line 1640
    :sswitch_24
    const-string v2, "requestAudioFocus"

    .line 1641
    .line 1642
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1643
    .line 1644
    .line 1645
    move-result p1

    .line 1646
    if-nez p1, :cond_2d

    .line 1647
    .line 1648
    goto/16 :goto_1

    .line 1649
    .line 1650
    :cond_2d
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1651
    .line 1652
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1653
    .line 1654
    .line 1655
    invoke-virtual {p1, v1}, LR8/a;->s(Ljava/util/List;)Z

    .line 1656
    .line 1657
    .line 1658
    move-result p1

    .line 1659
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1660
    .line 1661
    .line 1662
    move-result-object p1

    .line 1663
    move-object v1, p2

    .line 1664
    check-cast v1, Ltc/g;

    .line 1665
    .line 1666
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1667
    .line 1668
    .line 1669
    return-void

    .line 1670
    :sswitch_25
    const-string v1, "isHapticPlaybackSupported"

    .line 1671
    .line 1672
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1673
    .line 1674
    .line 1675
    move-result p1

    .line 1676
    if-nez p1, :cond_2e

    .line 1677
    .line 1678
    goto/16 :goto_1

    .line 1679
    .line 1680
    :cond_2e
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1681
    .line 1682
    if-lt p1, v6, :cond_2f

    .line 1683
    .line 1684
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1685
    .line 1686
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1687
    .line 1688
    .line 1689
    invoke-static {}, LR8/a;->o()Ljava/lang/Boolean;

    .line 1690
    .line 1691
    .line 1692
    move-result-object p1

    .line 1693
    move-object v1, p2

    .line 1694
    check-cast v1, Ltc/g;

    .line 1695
    .line 1696
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1697
    .line 1698
    .line 1699
    return-void

    .line 1700
    :cond_2f
    new-instance p1, LE5/Q;

    .line 1701
    .line 1702
    invoke-direct {p1, v6}, LE5/Q;-><init>(I)V

    .line 1703
    .line 1704
    .line 1705
    throw p1

    .line 1706
    :sswitch_26
    const-string v1, "isSpeakerphoneOn"

    .line 1707
    .line 1708
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1709
    .line 1710
    .line 1711
    move-result p1

    .line 1712
    if-nez p1, :cond_30

    .line 1713
    .line 1714
    goto/16 :goto_1

    .line 1715
    .line 1716
    :cond_30
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1717
    .line 1718
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1719
    .line 1720
    .line 1721
    invoke-virtual {p1}, LR8/a;->q()Ljava/lang/Boolean;

    .line 1722
    .line 1723
    .line 1724
    move-result-object p1

    .line 1725
    move-object v1, p2

    .line 1726
    check-cast v1, Ltc/g;

    .line 1727
    .line 1728
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1729
    .line 1730
    .line 1731
    return-void

    .line 1732
    :sswitch_27
    const-string v2, "getStreamMaxVolume"

    .line 1733
    .line 1734
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1735
    .line 1736
    .line 1737
    move-result p1

    .line 1738
    if-nez p1, :cond_31

    .line 1739
    .line 1740
    goto/16 :goto_1

    .line 1741
    .line 1742
    :cond_31
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1743
    .line 1744
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1745
    .line 1746
    .line 1747
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v1

    .line 1751
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1752
    .line 1753
    .line 1754
    check-cast v1, Ljava/lang/Integer;

    .line 1755
    .line 1756
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1757
    .line 1758
    .line 1759
    move-result v1

    .line 1760
    invoke-virtual {p1, v1}, LR8/a;->k(I)Ljava/lang/Integer;

    .line 1761
    .line 1762
    .line 1763
    move-result-object p1

    .line 1764
    move-object v1, p2

    .line 1765
    check-cast v1, Ltc/g;

    .line 1766
    .line 1767
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1768
    .line 1769
    .line 1770
    return-void

    .line 1771
    :sswitch_28
    const-string v1, "isMicrophoneMute"

    .line 1772
    .line 1773
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1774
    .line 1775
    .line 1776
    move-result p1

    .line 1777
    if-nez p1, :cond_32

    .line 1778
    .line 1779
    goto :goto_1

    .line 1780
    :cond_32
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1781
    .line 1782
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1783
    .line 1784
    .line 1785
    invoke-virtual {p1}, LR8/a;->p()Ljava/lang/Boolean;

    .line 1786
    .line 1787
    .line 1788
    move-result-object p1

    .line 1789
    move-object v1, p2

    .line 1790
    check-cast v1, Ltc/g;

    .line 1791
    .line 1792
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1793
    .line 1794
    .line 1795
    return-void

    .line 1796
    :sswitch_29
    const-string v2, "getDevices"

    .line 1797
    .line 1798
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1799
    .line 1800
    .line 1801
    move-result p1

    .line 1802
    if-nez p1, :cond_33

    .line 1803
    .line 1804
    goto :goto_1

    .line 1805
    :cond_33
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1806
    .line 1807
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1808
    .line 1809
    .line 1810
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v1

    .line 1814
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1815
    .line 1816
    .line 1817
    check-cast v1, Ljava/lang/Integer;

    .line 1818
    .line 1819
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1820
    .line 1821
    .line 1822
    move-result v1

    .line 1823
    invoke-virtual {p1, v1}, LR8/a;->i(I)Ljava/util/ArrayList;

    .line 1824
    .line 1825
    .line 1826
    move-result-object p1

    .line 1827
    move-object v1, p2

    .line 1828
    check-cast v1, Ltc/g;

    .line 1829
    .line 1830
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1831
    .line 1832
    .line 1833
    return-void

    .line 1834
    :sswitch_2a
    const-string v1, "getCommunicationDevice"

    .line 1835
    .line 1836
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1837
    .line 1838
    .line 1839
    move-result p1

    .line 1840
    if-nez p1, :cond_34

    .line 1841
    .line 1842
    goto :goto_1

    .line 1843
    :cond_34
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1844
    .line 1845
    if-lt p1, v8, :cond_35

    .line 1846
    .line 1847
    sget-object p1, Ldb/a;->b:LR8/a;

    .line 1848
    .line 1849
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1850
    .line 1851
    .line 1852
    invoke-virtual {p1}, LR8/a;->h()Ljava/util/Map;

    .line 1853
    .line 1854
    .line 1855
    move-result-object p1

    .line 1856
    move-object v1, p2

    .line 1857
    check-cast v1, Ltc/g;

    .line 1858
    .line 1859
    invoke-virtual {v1, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1860
    .line 1861
    .line 1862
    return-void

    .line 1863
    :cond_35
    new-instance p1, LE5/Q;

    .line 1864
    .line 1865
    invoke-direct {p1, v8}, LE5/Q;-><init>(I)V

    .line 1866
    .line 1867
    .line 1868
    throw p1

    .line 1869
    :cond_36
    :goto_1
    move-object p1, p2

    .line 1870
    check-cast p1, Ltc/g;

    .line 1871
    .line 1872
    invoke-virtual {p1}, Ltc/g;->c()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1873
    .line 1874
    .line 1875
    return-void

    .line 1876
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1877
    .line 1878
    .line 1879
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1880
    .line 1881
    const-string v2, "Error: "

    .line 1882
    .line 1883
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1884
    .line 1885
    .line 1886
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1887
    .line 1888
    .line 1889
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1890
    .line 1891
    .line 1892
    move-result-object p1

    .line 1893
    check-cast p2, Ltc/g;

    .line 1894
    .line 1895
    invoke-virtual {p2, p1, v0, v0}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1896
    .line 1897
    .line 1898
    return-void

    .line 1899
    :sswitch_data_0
    .sparse-switch
        -0x68d7016a -> :sswitch_2a
        -0x653a1759 -> :sswitch_29
        -0x641dbdd3 -> :sswitch_28
        -0x5e4f1038 -> :sswitch_27
        -0x5d286128 -> :sswitch_26
        -0x5adb498e -> :sswitch_25
        -0x59af196f -> :sswitch_24
        -0x543b109b -> :sswitch_23
        -0x4d45b3f0 -> :sswitch_22
        -0x4c9a73e6 -> :sswitch_21
        -0x4759d017 -> :sswitch_20
        -0x410d2cad -> :sswitch_1f
        -0x4054a92e -> :sswitch_1e
        -0x3cb7c6ae -> :sswitch_1d
        -0x3043f9ca -> :sswitch_1c
        -0x2d824707 -> :sswitch_1b
        -0x2963f9ff -> :sswitch_1a
        -0x22a10fed -> :sswitch_19
        -0x1a9241f6 -> :sswitch_18
        -0x16b26e32 -> :sswitch_17
        -0x47d5de7 -> :sswitch_16
        0x9153925 -> :sswitch_15
        0x99879e0 -> :sswitch_14
        0xb21c3b3 -> :sswitch_13
        0x107e1530 -> :sswitch_12
        0x1bf5d05f -> :sswitch_11
        0x252e5a16 -> :sswitch_10
        0x37bcc7ec -> :sswitch_f
        0x38dee389 -> :sswitch_e
        0x3a315283 -> :sswitch_d
        0x40a81b4b -> :sswitch_c
        0x455827c6 -> :sswitch_b
        0x46c7103c -> :sswitch_a
        0x49fcee3f -> :sswitch_9
        0x4afd9d2e -> :sswitch_8
        0x50e69af7 -> :sswitch_7
        0x52277592 -> :sswitch_6
        0x5352a822 -> :sswitch_5
        0x59acfbac -> :sswitch_4
        0x5da380da -> :sswitch_3
        0x764d6925 -> :sswitch_2
        0x766c0cf0 -> :sswitch_1
        0x7ccf63f0 -> :sswitch_0
    .end sparse-switch
.end method
