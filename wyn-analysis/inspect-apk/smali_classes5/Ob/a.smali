.class public LOb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/b;
.implements Luc/p;


# static fields
.field public static b:LA7/b0;


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onAttachedToEngine(Lqc/a;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lqc/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    iput-object v0, p0, LOb/a;->a:Landroid/content/Context;

    .line 4
    .line 5
    new-instance v0, Luc/r;

    .line 6
    .line 7
    const-string v1, "safe_device"

    .line 8
    .line 9
    iget-object p1, p1, Lqc/a;->c:Luc/f;

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Luc/r;->b(Luc/p;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, LOb/a;->a:Landroid/content/Context;

    .line 3
    .line 4
    return-void
.end method

.method public final onMethodCall(Luc/o;Luc/q;)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p1, Luc/o;->a:Ljava/lang/String;

    .line 4
    .line 5
    const-string v3, "getPlatformVersion"

    .line 6
    .line 7
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    new-instance p1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v0, "Android "

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p2, Ltc/g;

    .line 30
    .line 31
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    iget-object v2, p1, Luc/o;->a:Ljava/lang/String;

    .line 36
    .line 37
    const-string v3, "isJailBroken"

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    iget-object p1, p0, LOb/a;->a:Landroid/content/Context;

    .line 46
    .line 47
    invoke-static {p1}, Ltg/b;->H(Landroid/content/Context;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p2, Ltc/g;

    .line 56
    .line 57
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_1
    const-string v3, "isRealDevice"

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    const/4 v4, 0x0

    .line 68
    if-eqz v3, :cond_a

    .line 69
    .line 70
    sget-object p1, LPb/a;->a:Ljava/util/ArrayList;

    .line 71
    .line 72
    sget-object p1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 73
    .line 74
    const-string v2, "generic"

    .line 75
    .line 76
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-nez v3, :cond_8

    .line 81
    .line 82
    const-string v3, "unknown"

    .line 83
    .line 84
    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-nez p1, :cond_8

    .line 89
    .line 90
    sget-object p1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 91
    .line 92
    const-string v3, "google_sdk"

    .line 93
    .line 94
    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-nez v5, :cond_8

    .line 99
    .line 100
    const-string v5, "Emulator"

    .line 101
    .line 102
    invoke-virtual {p1, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-nez v5, :cond_8

    .line 107
    .line 108
    const-string v5, "Android SDK built for x86"

    .line 109
    .line 110
    invoke-virtual {p1, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    if-nez v5, :cond_8

    .line 115
    .line 116
    sget-object v5, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 117
    .line 118
    const-string v6, "Genymotion"

    .line 119
    .line 120
    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-nez v6, :cond_8

    .line 125
    .line 126
    const-string v6, "sdk_"

    .line 127
    .line 128
    invoke-virtual {p1, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-nez p1, :cond_8

    .line 133
    .line 134
    sget-object p1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 135
    .line 136
    const-string v6, "emulator"

    .line 137
    .line 138
    invoke-virtual {p1, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    if-nez v6, :cond_8

    .line 143
    .line 144
    sget-object v6, Landroid/os/Build;->HOST:Ljava/lang/String;

    .line 145
    .line 146
    const-string v7, "Build"

    .line 147
    .line 148
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    if-eqz v6, :cond_2

    .line 153
    .line 154
    const-string v6, "sony"

    .line 155
    .line 156
    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    if-eqz v5, :cond_8

    .line 161
    .line 162
    :cond_2
    sget-object v5, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v5, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    if-eqz v5, :cond_3

    .line 169
    .line 170
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-nez p1, :cond_8

    .line 175
    .line 176
    :cond_3
    sget-object p1, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 177
    .line 178
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    if-nez p1, :cond_8

    .line 183
    .line 184
    :try_start_0
    sget-object p1, LOb/b;->a:Ljava/lang/Class;

    .line 185
    .line 186
    const-string v2, "get"

    .line 187
    .line 188
    new-array v3, v1, [Ljava/lang/Class;

    .line 189
    .line 190
    const-class v5, Ljava/lang/String;

    .line 191
    .line 192
    aput-object v5, v3, v0

    .line 193
    .line 194
    invoke-virtual {p1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    new-array v2, v1, [Ljava/lang/Object;

    .line 199
    .line 200
    const-string v3, "ro.kernel.qemu"

    .line 201
    .line 202
    aput-object v3, v2, v0

    .line 203
    .line 204
    invoke-virtual {p1, v4, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 209
    .line 210
    move-object v4, p1

    .line 211
    :catch_0
    const-string p1, "1"

    .line 212
    .line 213
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    if-nez p1, :cond_8

    .line 218
    .line 219
    sget-object p1, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    .line 220
    .line 221
    const-string v2, "goldfish"

    .line 222
    .line 223
    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    if-nez v2, :cond_8

    .line 228
    .line 229
    const-string v2, "ranchu"

    .line 230
    .line 231
    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    if-nez v2, :cond_8

    .line 236
    .line 237
    sget-object v2, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 238
    .line 239
    const-string v3, "vbox86p"

    .line 240
    .line 241
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    if-nez v3, :cond_8

    .line 246
    .line 247
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    const-string v4, "nox"

    .line 252
    .line 253
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    if-nez v3, :cond_8

    .line 258
    .line 259
    sget-object v3, Landroid/os/Build;->BOARD:Ljava/lang/String;

    .line 260
    .line 261
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    invoke-virtual {v5, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 266
    .line 267
    .line 268
    move-result v5

    .line 269
    if-nez v5, :cond_8

    .line 270
    .line 271
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    invoke-virtual {v5, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    if-nez v4, :cond_8

    .line 280
    .line 281
    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 282
    .line 283
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    const-string v6, "droid4x"

    .line 288
    .line 289
    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    if-nez v5, :cond_8

    .line 294
    .line 295
    const-string v5, "vbox86"

    .line 296
    .line 297
    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    if-nez v5, :cond_8

    .line 302
    .line 303
    sget-object v5, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 304
    .line 305
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v6

    .line 309
    const-string v7, "changwan"

    .line 310
    .line 311
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 312
    .line 313
    .line 314
    move-result v6

    .line 315
    if-nez v6, :cond_8

    .line 316
    .line 317
    sget-object v6, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 318
    .line 319
    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v8

    .line 323
    invoke-virtual {v8, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 324
    .line 325
    .line 326
    move-result v8

    .line 327
    if-nez v8, :cond_8

    .line 328
    .line 329
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v8

    .line 333
    invoke-virtual {v8, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 334
    .line 335
    .line 336
    move-result v8

    .line 337
    if-nez v8, :cond_8

    .line 338
    .line 339
    sget-object v8, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 340
    .line 341
    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v9

    .line 345
    invoke-virtual {v9, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 346
    .line 347
    .line 348
    move-result v9

    .line 349
    if-nez v9, :cond_8

    .line 350
    .line 351
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v9

    .line 355
    invoke-virtual {v9, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 356
    .line 357
    .line 358
    move-result v9

    .line 359
    if-nez v9, :cond_8

    .line 360
    .line 361
    sget-object v9, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 362
    .line 363
    invoke-virtual {v9}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v10

    .line 367
    invoke-virtual {v10, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 368
    .line 369
    .line 370
    move-result v7

    .line 371
    if-nez v7, :cond_8

    .line 372
    .line 373
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v7

    .line 377
    const-string v10, "ldplayer"

    .line 378
    .line 379
    invoke-virtual {v7, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 380
    .line 381
    .line 382
    move-result v7

    .line 383
    if-nez v7, :cond_8

    .line 384
    .line 385
    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    invoke-virtual {v7, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 390
    .line 391
    .line 392
    move-result v7

    .line 393
    if-nez v7, :cond_8

    .line 394
    .line 395
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v7

    .line 399
    invoke-virtual {v7, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 400
    .line 401
    .line 402
    move-result v7

    .line 403
    if-nez v7, :cond_8

    .line 404
    .line 405
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v7

    .line 409
    const-string v10, "lkm"

    .line 410
    .line 411
    invoke-virtual {v7, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 412
    .line 413
    .line 414
    move-result v7

    .line 415
    if-nez v7, :cond_8

    .line 416
    .line 417
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v7

    .line 421
    const-string v10, "ttvm"

    .line 422
    .line 423
    invoke-virtual {v7, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 424
    .line 425
    .line 426
    move-result v7

    .line 427
    if-nez v7, :cond_8

    .line 428
    .line 429
    const-string v7, "LDPlayer"

    .line 430
    .line 431
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    move-result v10

    .line 435
    if-nez v10, :cond_8

    .line 436
    .line 437
    const-string v10, "Chang Wan"

    .line 438
    .line 439
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    move-result v10

    .line 443
    if-nez v10, :cond_8

    .line 444
    .line 445
    const-string v10, "ttVM_Hdragon"

    .line 446
    .line 447
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    move-result v10

    .line 451
    if-nez v10, :cond_8

    .line 452
    .line 453
    invoke-virtual {v9, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 454
    .line 455
    .line 456
    move-result v7

    .line 457
    if-nez v7, :cond_8

    .line 458
    .line 459
    sget-object v7, LPb/a;->f:Ljava/util/ArrayList;

    .line 460
    .line 461
    invoke-static {v7}, LPb/a;->a(Ljava/util/ArrayList;)Z

    .line 462
    .line 463
    .line 464
    move-result v9

    .line 465
    if-eqz v9, :cond_4

    .line 466
    .line 467
    goto/16 :goto_0

    .line 468
    .line 469
    :cond_4
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v9

    .line 473
    const-string v10, "memu"

    .line 474
    .line 475
    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 476
    .line 477
    .line 478
    move-result v9

    .line 479
    if-nez v9, :cond_8

    .line 480
    .line 481
    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v9

    .line 485
    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 486
    .line 487
    .line 488
    move-result v9

    .line 489
    if-nez v9, :cond_8

    .line 490
    .line 491
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v9

    .line 495
    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 496
    .line 497
    .line 498
    move-result v9

    .line 499
    if-nez v9, :cond_8

    .line 500
    .line 501
    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v9

    .line 505
    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 506
    .line 507
    .line 508
    move-result v9

    .line 509
    if-nez v9, :cond_8

    .line 510
    .line 511
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v9

    .line 515
    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 516
    .line 517
    .line 518
    move-result v9

    .line 519
    if-nez v9, :cond_8

    .line 520
    .line 521
    const-string v9, "Microvirt"

    .line 522
    .line 523
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    move-result v9

    .line 527
    if-nez v9, :cond_8

    .line 528
    .line 529
    const-string v9, "MEmu"

    .line 530
    .line 531
    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 532
    .line 533
    .line 534
    move-result v9

    .line 535
    if-nez v9, :cond_8

    .line 536
    .line 537
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object p1

    .line 541
    invoke-virtual {p1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 542
    .line 543
    .line 544
    move-result p1

    .line 545
    if-nez p1, :cond_8

    .line 546
    .line 547
    sget-object p1, LPb/a;->g:Ljava/util/ArrayList;

    .line 548
    .line 549
    invoke-static {p1}, LPb/a;->a(Ljava/util/ArrayList;)Z

    .line 550
    .line 551
    .line 552
    move-result v9

    .line 553
    if-eqz v9, :cond_5

    .line 554
    .line 555
    goto/16 :goto_0

    .line 556
    .line 557
    :cond_5
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v9

    .line 561
    const-string v10, "bluestacks"

    .line 562
    .line 563
    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 564
    .line 565
    .line 566
    move-result v9

    .line 567
    if-nez v9, :cond_8

    .line 568
    .line 569
    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v6

    .line 573
    invoke-virtual {v6, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 574
    .line 575
    .line 576
    move-result v6

    .line 577
    if-nez v6, :cond_8

    .line 578
    .line 579
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v4

    .line 583
    invoke-virtual {v4, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 584
    .line 585
    .line 586
    move-result v4

    .line 587
    if-nez v4, :cond_8

    .line 588
    .line 589
    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object v4

    .line 593
    invoke-virtual {v4, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 594
    .line 595
    .line 596
    move-result v4

    .line 597
    if-nez v4, :cond_8

    .line 598
    .line 599
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    invoke-virtual {v2, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 604
    .line 605
    .line 606
    move-result v2

    .line 607
    if-nez v2, :cond_8

    .line 608
    .line 609
    const-string v2, "BlueStacks"

    .line 610
    .line 611
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    move-result v2

    .line 615
    if-nez v2, :cond_8

    .line 616
    .line 617
    const-string v2, "QC_Reference_Phone"

    .line 618
    .line 619
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 620
    .line 621
    .line 622
    move-result v2

    .line 623
    if-eqz v2, :cond_6

    .line 624
    .line 625
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v2

    .line 629
    const-string v3, "xiaomi"

    .line 630
    .line 631
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    move-result v3

    .line 635
    if-nez v3, :cond_6

    .line 636
    .line 637
    const-string v3, "samsung"

    .line 638
    .line 639
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    move-result v3

    .line 643
    if-nez v3, :cond_6

    .line 644
    .line 645
    const-string v3, "motorola"

    .line 646
    .line 647
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 648
    .line 649
    .line 650
    move-result v3

    .line 651
    if-nez v3, :cond_6

    .line 652
    .line 653
    const-string v3, "lge"

    .line 654
    .line 655
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    move-result v2

    .line 659
    if-eqz v2, :cond_8

    .line 660
    .line 661
    :cond_6
    :try_start_1
    const-string v2, "os.arch"

    .line 662
    .line 663
    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v2

    .line 667
    if-eqz v2, :cond_7

    .line 668
    .line 669
    const-string v3, "x86"

    .line 670
    .line 671
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 672
    .line 673
    .line 674
    move-result v3

    .line 675
    if-nez v3, :cond_8

    .line 676
    .line 677
    const-string v3, "i686"

    .line 678
    .line 679
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 680
    .line 681
    .line 682
    move-result v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 683
    if-eqz v2, :cond_7

    .line 684
    .line 685
    goto :goto_0

    .line 686
    :catch_1
    :cond_7
    sget-object v2, LPb/a;->a:Ljava/util/ArrayList;

    .line 687
    .line 688
    invoke-static {v2}, LPb/a;->a(Ljava/util/ArrayList;)Z

    .line 689
    .line 690
    .line 691
    move-result v2

    .line 692
    if-nez v2, :cond_8

    .line 693
    .line 694
    sget-object v2, LPb/a;->d:Ljava/util/ArrayList;

    .line 695
    .line 696
    invoke-static {v2}, LPb/a;->a(Ljava/util/ArrayList;)Z

    .line 697
    .line 698
    .line 699
    move-result v2

    .line 700
    if-nez v2, :cond_8

    .line 701
    .line 702
    sget-object v2, LPb/a;->e:Ljava/util/ArrayList;

    .line 703
    .line 704
    invoke-static {v2}, LPb/a;->a(Ljava/util/ArrayList;)Z

    .line 705
    .line 706
    .line 707
    move-result v2

    .line 708
    if-nez v2, :cond_8

    .line 709
    .line 710
    sget-object v2, LPb/a;->c:Ljava/util/ArrayList;

    .line 711
    .line 712
    invoke-static {v2}, LPb/a;->a(Ljava/util/ArrayList;)Z

    .line 713
    .line 714
    .line 715
    move-result v2

    .line 716
    if-nez v2, :cond_8

    .line 717
    .line 718
    sget-object v2, LPb/a;->b:Ljava/util/ArrayList;

    .line 719
    .line 720
    invoke-static {v2}, LPb/a;->a(Ljava/util/ArrayList;)Z

    .line 721
    .line 722
    .line 723
    move-result v2

    .line 724
    if-nez v2, :cond_8

    .line 725
    .line 726
    invoke-static {v7}, LPb/a;->a(Ljava/util/ArrayList;)Z

    .line 727
    .line 728
    .line 729
    move-result v2

    .line 730
    if-nez v2, :cond_8

    .line 731
    .line 732
    invoke-static {p1}, LPb/a;->a(Ljava/util/ArrayList;)Z

    .line 733
    .line 734
    .line 735
    move-result p1

    .line 736
    if-eqz p1, :cond_9

    .line 737
    .line 738
    :cond_8
    :goto_0
    move v0, v1

    .line 739
    :cond_9
    xor-int/lit8 p1, v0, 0x1

    .line 740
    .line 741
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 742
    .line 743
    .line 744
    move-result-object p1

    .line 745
    check-cast p2, Ltc/g;

    .line 746
    .line 747
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 748
    .line 749
    .line 750
    goto :goto_3

    .line 751
    :cond_a
    const-string v3, "isOnExternalStorage"

    .line 752
    .line 753
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 754
    .line 755
    .line 756
    move-result v3

    .line 757
    if-eqz v3, :cond_e

    .line 758
    .line 759
    iget-object p1, p0, LOb/a;->a:Landroid/content/Context;

    .line 760
    .line 761
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 762
    .line 763
    .line 764
    move-result-object v2

    .line 765
    :try_start_2
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v3

    .line 769
    invoke-virtual {v2, v3, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 770
    .line 771
    .line 772
    move-result-object v2

    .line 773
    iget-object v2, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 774
    .line 775
    iget p1, v2, Landroid/content/pm/ApplicationInfo;->flags:I
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 776
    .line 777
    const/high16 v2, 0x40000

    .line 778
    .line 779
    and-int/2addr p1, v2

    .line 780
    if-ne p1, v2, :cond_d

    .line 781
    .line 782
    :cond_b
    :goto_1
    move v0, v1

    .line 783
    goto :goto_2

    .line 784
    :catch_2
    :try_start_3
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 785
    .line 786
    .line 787
    move-result-object p1

    .line 788
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 789
    .line 790
    .line 791
    move-result-object p1

    .line 792
    const-string v2, "/data/"

    .line 793
    .line 794
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 795
    .line 796
    .line 797
    move-result v2

    .line 798
    if-eqz v2, :cond_c

    .line 799
    .line 800
    goto :goto_2

    .line 801
    :cond_c
    const-string v2, "/mnt/"

    .line 802
    .line 803
    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 804
    .line 805
    .line 806
    move-result v2

    .line 807
    if-nez v2, :cond_b

    .line 808
    .line 809
    const-string v2, "/sdcard/"

    .line 810
    .line 811
    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 812
    .line 813
    .line 814
    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 815
    if-eqz p1, :cond_d

    .line 816
    .line 817
    goto :goto_1

    .line 818
    :catchall_0
    :cond_d
    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 819
    .line 820
    .line 821
    move-result-object p1

    .line 822
    check-cast p2, Ltc/g;

    .line 823
    .line 824
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 825
    .line 826
    .line 827
    :goto_3
    return-void

    .line 828
    :cond_e
    const-string v3, "isDevelopmentModeEnable"

    .line 829
    .line 830
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 831
    .line 832
    .line 833
    move-result v3

    .line 834
    if-eqz v3, :cond_10

    .line 835
    .line 836
    iget-object p1, p0, LOb/a;->a:Landroid/content/Context;

    .line 837
    .line 838
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 839
    .line 840
    .line 841
    move-result-object p1

    .line 842
    const-string v2, "development_settings_enabled"

    .line 843
    .line 844
    invoke-static {p1, v2, v0}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 845
    .line 846
    .line 847
    move-result p1

    .line 848
    if-eqz p1, :cond_f

    .line 849
    .line 850
    move v0, v1

    .line 851
    :cond_f
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 852
    .line 853
    .line 854
    move-result-object p1

    .line 855
    check-cast p2, Ltc/g;

    .line 856
    .line 857
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 858
    .line 859
    .line 860
    return-void

    .line 861
    :cond_10
    const-string v3, "usbDebuggingCheck"

    .line 862
    .line 863
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 864
    .line 865
    .line 866
    move-result v3

    .line 867
    if-eqz v3, :cond_12

    .line 868
    .line 869
    iget-object p1, p0, LOb/a;->a:Landroid/content/Context;

    .line 870
    .line 871
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 872
    .line 873
    .line 874
    move-result-object p1

    .line 875
    const-string v2, "adb_enabled"

    .line 876
    .line 877
    invoke-static {p1, v2, v0}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 878
    .line 879
    .line 880
    move-result p1

    .line 881
    if-eqz p1, :cond_11

    .line 882
    .line 883
    move v0, v1

    .line 884
    :cond_11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 885
    .line 886
    .line 887
    move-result-object p1

    .line 888
    check-cast p2, Ltc/g;

    .line 889
    .line 890
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 891
    .line 892
    .line 893
    return-void

    .line 894
    :cond_12
    const-string v3, "isMockLocation"

    .line 895
    .line 896
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 897
    .line 898
    .line 899
    move-result v3

    .line 900
    if-eqz v3, :cond_15

    .line 901
    .line 902
    sget-object p1, LOb/a;->b:LA7/b0;

    .line 903
    .line 904
    iget-boolean v0, p1, LA7/b0;->b:Z

    .line 905
    .line 906
    if-eqz v0, :cond_13

    .line 907
    .line 908
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 909
    .line 910
    check-cast p2, Ltc/g;

    .line 911
    .line 912
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 913
    .line 914
    .line 915
    return-void

    .line 916
    :cond_13
    iget-object v0, p1, LA7/b0;->c:Ljava/lang/Object;

    .line 917
    .line 918
    check-cast v0, Ljava/lang/String;

    .line 919
    .line 920
    if-eqz v0, :cond_14

    .line 921
    .line 922
    iget-object p1, p1, LA7/b0;->d:Ljava/lang/Object;

    .line 923
    .line 924
    check-cast p1, Ljava/lang/String;

    .line 925
    .line 926
    if-eqz p1, :cond_14

    .line 927
    .line 928
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 929
    .line 930
    check-cast p2, Ltc/g;

    .line 931
    .line 932
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 933
    .line 934
    .line 935
    return-void

    .line 936
    :cond_14
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 937
    .line 938
    check-cast p2, Ltc/g;

    .line 939
    .line 940
    invoke-virtual {p2, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 941
    .line 942
    .line 943
    return-void

    .line 944
    :cond_15
    const-string v3, "rootDetectionDetails"

    .line 945
    .line 946
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 947
    .line 948
    .line 949
    move-result v3

    .line 950
    if-eqz v3, :cond_1d

    .line 951
    .line 952
    iget-object p1, p0, LOb/a;->a:Landroid/content/Context;

    .line 953
    .line 954
    new-instance v2, Ljava/util/HashMap;

    .line 955
    .line 956
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 957
    .line 958
    .line 959
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 960
    .line 961
    new-instance v4, Lx4/d;

    .line 962
    .line 963
    const/16 v5, 0x1a

    .line 964
    .line 965
    invoke-direct {v4, v5}, Lx4/d;-><init>(I)V

    .line 966
    .line 967
    .line 968
    sget-object v5, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 969
    .line 970
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 971
    .line 972
    .line 973
    move-result-object v5

    .line 974
    const-string v6, "brand"

    .line 975
    .line 976
    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    const-string v5, "model"

    .line 980
    .line 981
    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 982
    .line 983
    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 984
    .line 985
    .line 986
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 987
    .line 988
    .line 989
    move-result-object v3

    .line 990
    const-string v5, "apiLevel"

    .line 991
    .line 992
    invoke-virtual {v2, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 993
    .line 994
    .line 995
    sget-object v3, Landroid/os/Build;->TAGS:Ljava/lang/String;

    .line 996
    .line 997
    if-eqz v3, :cond_16

    .line 998
    .line 999
    move-object v5, v3

    .line 1000
    goto :goto_4

    .line 1001
    :cond_16
    const-string v5, "null"

    .line 1002
    .line 1003
    :goto_4
    const-string v6, "buildTags"

    .line 1004
    .line 1005
    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1006
    .line 1007
    .line 1008
    sget-object v5, Landroid/os/Build;->TYPE:Ljava/lang/String;

    .line 1009
    .line 1010
    const-string v6, "buildType"

    .line 1011
    .line 1012
    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1013
    .line 1014
    .line 1015
    const-string v6, "eng"

    .line 1016
    .line 1017
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1018
    .line 1019
    .line 1020
    move-result v6

    .line 1021
    if-nez v6, :cond_18

    .line 1022
    .line 1023
    const-string v6, "userdebug"

    .line 1024
    .line 1025
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1026
    .line 1027
    .line 1028
    move-result v5

    .line 1029
    if-eqz v5, :cond_17

    .line 1030
    .line 1031
    goto :goto_5

    .line 1032
    :cond_17
    move v5, v0

    .line 1033
    goto :goto_6

    .line 1034
    :cond_18
    :goto_5
    move v5, v1

    .line 1035
    :goto_6
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v5

    .line 1039
    const-string v6, "isDebuggable"

    .line 1040
    .line 1041
    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1042
    .line 1043
    .line 1044
    invoke-static {}, Ltg/b;->E()Z

    .line 1045
    .line 1046
    .line 1047
    move-result v5

    .line 1048
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v5

    .line 1052
    const-string v6, "isDevelopmentEnvironment"

    .line 1053
    .line 1054
    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual {v4}, Lx4/d;->a()Z

    .line 1058
    .line 1059
    .line 1060
    move-result v4

    .line 1061
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v4

    .line 1065
    const-string v5, "basicRootCheck"

    .line 1066
    .line 1067
    invoke-virtual {v2, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1068
    .line 1069
    .line 1070
    invoke-static {p1}, Ltg/b;->N(Landroid/content/Context;)Ljava/lang/Boolean;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v4

    .line 1074
    const-string v5, "rootBeerCheck"

    .line 1075
    .line 1076
    invoke-virtual {v2, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1077
    .line 1078
    .line 1079
    invoke-static {}, Ltg/b;->r()Z

    .line 1080
    .line 1081
    .line 1082
    move-result v4

    .line 1083
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v4

    .line 1087
    const-string v5, "emulatorSpecificRoot"

    .line 1088
    .line 1089
    invoke-virtual {v2, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1090
    .line 1091
    .line 1092
    invoke-static {}, Ltg/b;->v()Z

    .line 1093
    .line 1094
    .line 1095
    move-result v4

    .line 1096
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v4

    .line 1100
    const-string v5, "suBinaryFound"

    .line 1101
    .line 1102
    invoke-virtual {v2, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1103
    .line 1104
    .line 1105
    invoke-static {v0}, Ltg/b;->p(Z)Z

    .line 1106
    .line 1107
    .line 1108
    move-result v4

    .line 1109
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v4

    .line 1113
    const-string v5, "dangerousProps"

    .line 1114
    .line 1115
    invoke-virtual {v2, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1116
    .line 1117
    .line 1118
    invoke-static {}, Ltg/b;->D()Z

    .line 1119
    .line 1120
    .line 1121
    move-result v4

    .line 1122
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v4

    .line 1126
    const-string v5, "hasObviousRootSigns"

    .line 1127
    .line 1128
    invoke-virtual {v2, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1129
    .line 1130
    .line 1131
    const-string v4, "test-keys"

    .line 1132
    .line 1133
    if-eqz v3, :cond_19

    .line 1134
    .line 1135
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1136
    .line 1137
    .line 1138
    move-result v5

    .line 1139
    if-eqz v5, :cond_19

    .line 1140
    .line 1141
    invoke-static {}, Ltg/b;->E()Z

    .line 1142
    .line 1143
    .line 1144
    move-result v5

    .line 1145
    if-eqz v5, :cond_1a

    .line 1146
    .line 1147
    :cond_19
    move v5, v0

    .line 1148
    goto :goto_7

    .line 1149
    :cond_1a
    move v5, v1

    .line 1150
    :goto_7
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v5

    .line 1154
    const-string v6, "hasTestKeys"

    .line 1155
    .line 1156
    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1157
    .line 1158
    .line 1159
    if-eqz v3, :cond_1c

    .line 1160
    .line 1161
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1162
    .line 1163
    .line 1164
    move-result v3

    .line 1165
    if-eqz v3, :cond_1c

    .line 1166
    .line 1167
    invoke-static {}, Ltg/b;->E()Z

    .line 1168
    .line 1169
    .line 1170
    move-result v3

    .line 1171
    if-eqz v3, :cond_1b

    .line 1172
    .line 1173
    goto :goto_8

    .line 1174
    :cond_1b
    move v0, v1

    .line 1175
    :cond_1c
    :goto_8
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v0

    .line 1179
    const-string v1, "buildTagsHasTestKeys"

    .line 1180
    .line 1181
    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1182
    .line 1183
    .line 1184
    const-string v0, "ro.debuggable"

    .line 1185
    .line 1186
    invoke-static {v0}, Ltg/b;->B(Ljava/lang/String;)Ljava/lang/String;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v1

    .line 1190
    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1191
    .line 1192
    .line 1193
    const-string v0, "ro.secure"

    .line 1194
    .line 1195
    invoke-static {v0}, Ltg/b;->B(Ljava/lang/String;)Ljava/lang/String;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v1

    .line 1199
    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1200
    .line 1201
    .line 1202
    const-string v0, "service.adb.root"

    .line 1203
    .line 1204
    invoke-static {v0}, Ltg/b;->B(Ljava/lang/String;)Ljava/lang/String;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v1

    .line 1208
    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1209
    .line 1210
    .line 1211
    const-string v0, "ro.build.type"

    .line 1212
    .line 1213
    invoke-static {v0}, Ltg/b;->B(Ljava/lang/String;)Ljava/lang/String;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v1

    .line 1217
    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1218
    .line 1219
    .line 1220
    const-string v0, "ro.build.tags"

    .line 1221
    .line 1222
    invoke-static {v0}, Ltg/b;->B(Ljava/lang/String;)Ljava/lang/String;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v1

    .line 1226
    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1227
    .line 1228
    .line 1229
    invoke-static {p1}, Ltg/b;->H(Landroid/content/Context;)Z

    .line 1230
    .line 1231
    .line 1232
    move-result p1

    .line 1233
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1234
    .line 1235
    .line 1236
    move-result-object p1

    .line 1237
    const-string v0, "isRooted"

    .line 1238
    .line 1239
    invoke-virtual {v2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1240
    .line 1241
    .line 1242
    check-cast p2, Ltc/g;

    .line 1243
    .line 1244
    invoke-virtual {p2, v2}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1245
    .line 1246
    .line 1247
    return-void

    .line 1248
    :cond_1d
    const-string v0, "init"

    .line 1249
    .line 1250
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1251
    .line 1252
    .line 1253
    move-result v0

    .line 1254
    if-eqz v0, :cond_22

    .line 1255
    .line 1256
    iget-object p1, p1, Luc/o;->b:Ljava/lang/Object;

    .line 1257
    .line 1258
    check-cast p1, Ljava/util/Map;

    .line 1259
    .line 1260
    const-string v0, "mockLocationCheckEnabled"

    .line 1261
    .line 1262
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1263
    .line 1264
    .line 1265
    move-result-object p1

    .line 1266
    check-cast p1, Ljava/lang/Boolean;

    .line 1267
    .line 1268
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1269
    .line 1270
    .line 1271
    move-result p1

    .line 1272
    iget-object v0, p0, LOb/a;->a:Landroid/content/Context;

    .line 1273
    .line 1274
    if-eqz p1, :cond_20

    .line 1275
    .line 1276
    sget-object p1, LOb/a;->b:LA7/b0;

    .line 1277
    .line 1278
    if-nez p1, :cond_1e

    .line 1279
    .line 1280
    new-instance p1, LA7/b0;

    .line 1281
    .line 1282
    const/4 v1, 0x4

    .line 1283
    invoke-direct {p1, v0, v1}, LA7/b0;-><init>(Landroid/content/Context;I)V

    .line 1284
    .line 1285
    .line 1286
    sput-object p1, LOb/a;->b:LA7/b0;

    .line 1287
    .line 1288
    :cond_1e
    sget-object p1, LOb/a;->b:LA7/b0;

    .line 1289
    .line 1290
    iget-object p1, p1, LA7/b0;->e:Ljava/lang/Object;

    .line 1291
    .line 1292
    check-cast p1, LC8/i;

    .line 1293
    .line 1294
    iget-object v0, p1, LC8/i;->b:Ljava/lang/Object;

    .line 1295
    .line 1296
    check-cast v0, Landroid/content/Context;

    .line 1297
    .line 1298
    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    .line 1299
    .line 1300
    invoke-static {v0, v1}, LY0/e;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 1301
    .line 1302
    .line 1303
    move-result v0

    .line 1304
    if-eqz v0, :cond_1f

    .line 1305
    .line 1306
    iget-object p1, p1, LC8/i;->c:Ljava/lang/Object;

    .line 1307
    .line 1308
    check-cast p1, LA7/b0;

    .line 1309
    .line 1310
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1311
    .line 1312
    .line 1313
    goto :goto_9

    .line 1314
    :cond_1f
    iget-object v0, p1, LC8/i;->e:Ljava/lang/Object;

    .line 1315
    .line 1316
    check-cast v0, Lcom/google/android/gms/location/LocationRequest;

    .line 1317
    .line 1318
    iget-object v1, p1, LC8/i;->f:Ljava/lang/Object;

    .line 1319
    .line 1320
    check-cast v1, LQb/a;

    .line 1321
    .line 1322
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v2

    .line 1326
    iget-object p1, p1, LC8/i;->d:Ljava/lang/Object;

    .line 1327
    .line 1328
    check-cast p1, Lcom/google/android/gms/internal/location/zzbi;

    .line 1329
    .line 1330
    invoke-interface {p1, v0, v1, v2}, Lx7/h;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Lx7/l;Landroid/os/Looper;)Lcom/google/android/gms/tasks/Task;

    .line 1331
    .line 1332
    .line 1333
    goto :goto_9

    .line 1334
    :cond_20
    sget-object p1, LOb/a;->b:LA7/b0;

    .line 1335
    .line 1336
    if-eqz p1, :cond_21

    .line 1337
    .line 1338
    iget-object p1, p1, LA7/b0;->e:Ljava/lang/Object;

    .line 1339
    .line 1340
    check-cast p1, LC8/i;

    .line 1341
    .line 1342
    iget-object v0, p1, LC8/i;->d:Ljava/lang/Object;

    .line 1343
    .line 1344
    check-cast v0, Lcom/google/android/gms/internal/location/zzbi;

    .line 1345
    .line 1346
    iget-object p1, p1, LC8/i;->f:Ljava/lang/Object;

    .line 1347
    .line 1348
    check-cast p1, LQb/a;

    .line 1349
    .line 1350
    invoke-interface {v0, p1}, Lx7/h;->removeLocationUpdates(Lx7/l;)Lcom/google/android/gms/tasks/Task;

    .line 1351
    .line 1352
    .line 1353
    :cond_21
    :goto_9
    check-cast p2, Ltc/g;

    .line 1354
    .line 1355
    invoke-virtual {p2, v4}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1356
    .line 1357
    .line 1358
    return-void

    .line 1359
    :cond_22
    check-cast p2, Ltc/g;

    .line 1360
    .line 1361
    invoke-virtual {p2}, Ltc/g;->c()V

    .line 1362
    .line 1363
    .line 1364
    return-void
.end method
