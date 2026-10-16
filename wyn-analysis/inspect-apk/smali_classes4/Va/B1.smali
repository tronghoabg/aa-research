.class public final LVa/B1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/B1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget p2, p0, LVa/B1;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget p1, LVa/K3;->T:I

    .line 7
    .line 8
    add-int/lit8 p1, p1, 0xf

    .line 9
    .line 10
    rem-int/lit16 p2, p1, 0x80

    .line 11
    .line 12
    sput p2, LVa/K3;->U:I

    .line 13
    .line 14
    rem-int/lit8 p1, p1, 0x2

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    invoke-static {}, LVa/K3;->H0()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/16 p2, 0x5c

    .line 23
    .line 24
    div-int/lit8 p2, p2, 0x0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {}, LVa/K3;->H0()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_0
    const/4 p2, 0x0

    .line 37
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Ljava/lang/String;

    .line 42
    .line 43
    sget v0, LVa/K3;->U:I

    .line 44
    .line 45
    add-int/lit8 v0, v0, 0x5

    .line 46
    .line 47
    rem-int/lit16 v1, v0, 0x80

    .line 48
    .line 49
    sput v1, LVa/K3;->T:I

    .line 50
    .line 51
    rem-int/lit8 v0, v0, 0x2

    .line 52
    .line 53
    invoke-static {p1}, LVa/K3;->E0(Ljava/lang/String;)Ljava/lang/Enum;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    const/16 v0, 0x38

    .line 60
    .line 61
    div-int/2addr v0, p2

    .line 62
    :cond_1
    return-object p1

    .line 63
    :pswitch_1
    sget p1, LVa/l3;->T:I

    .line 64
    .line 65
    add-int/lit8 p1, p1, 0x41

    .line 66
    .line 67
    rem-int/lit16 p1, p1, 0x80

    .line 68
    .line 69
    sput p1, LVa/l3;->S:I

    .line 70
    .line 71
    invoke-static {}, LVa/l3;->C0()Lcom/five_corp/ad/FiveAd;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    sget p2, LVa/l3;->T:I

    .line 76
    .line 77
    add-int/lit8 p2, p2, 0x3d

    .line 78
    .line 79
    rem-int/lit16 p2, p2, 0x80

    .line 80
    .line 81
    sput p2, LVa/l3;->S:I

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_2
    sget p1, LVa/a3;->T:I

    .line 85
    .line 86
    add-int/lit8 p1, p1, 0x1b

    .line 87
    .line 88
    rem-int/lit16 p2, p1, 0x80

    .line 89
    .line 90
    sput p2, LVa/a3;->S:I

    .line 91
    .line 92
    rem-int/lit8 p1, p1, 0x2

    .line 93
    .line 94
    if-nez p1, :cond_2

    .line 95
    .line 96
    invoke-static {}, LVa/a3;->H0()Lcom/fyber/fairbid/mediation/MediationManager;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    return-object p1

    .line 101
    :cond_2
    invoke-static {}, LVa/a3;->H0()Lcom/fyber/fairbid/mediation/MediationManager;

    .line 102
    .line 103
    .line 104
    const/4 p1, 0x0

    .line 105
    throw p1

    .line 106
    :pswitch_3
    sget p1, LVa/a3;->T:I

    .line 107
    .line 108
    add-int/lit8 p1, p1, 0x39

    .line 109
    .line 110
    rem-int/lit16 p1, p1, 0x80

    .line 111
    .line 112
    sput p1, LVa/a3;->S:I

    .line 113
    .line 114
    invoke-static {}, LVa/a3;->K0()Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    sget p2, LVa/a3;->S:I

    .line 119
    .line 120
    add-int/lit8 p2, p2, 0x6f

    .line 121
    .line 122
    rem-int/lit16 p2, p2, 0x80

    .line 123
    .line 124
    sput p2, LVa/a3;->T:I

    .line 125
    .line 126
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    return-object p1

    .line 131
    :pswitch_4
    const/4 p2, 0x0

    .line 132
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    check-cast p1, Ljava/lang/String;

    .line 137
    .line 138
    sget p2, LVa/a3;->T:I

    .line 139
    .line 140
    add-int/lit8 p2, p2, 0x1d

    .line 141
    .line 142
    rem-int/lit16 p2, p2, 0x80

    .line 143
    .line 144
    sput p2, LVa/a3;->S:I

    .line 145
    .line 146
    invoke-static {p1}, LVa/a3;->M0(Ljava/lang/String;)Lcom/fyber/fairbid/internal/Constants$AdType;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    sget p2, LVa/a3;->T:I

    .line 151
    .line 152
    add-int/lit8 p2, p2, 0x6f

    .line 153
    .line 154
    rem-int/lit16 p2, p2, 0x80

    .line 155
    .line 156
    sput p2, LVa/a3;->S:I

    .line 157
    .line 158
    return-object p1

    .line 159
    :pswitch_5
    const/4 p2, 0x0

    .line 160
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    check-cast p1, Ljava/lang/String;

    .line 165
    .line 166
    sget p2, LVa/H2;->S:I

    .line 167
    .line 168
    add-int/lit8 p2, p2, 0x3b

    .line 169
    .line 170
    rem-int/lit16 p2, p2, 0x80

    .line 171
    .line 172
    sput p2, LVa/H2;->T:I

    .line 173
    .line 174
    invoke-static {p1}, LVa/H2;->F0(Ljava/lang/String;)Ljava/lang/Enum;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    sget p2, LVa/H2;->T:I

    .line 179
    .line 180
    add-int/lit8 p2, p2, 0x21

    .line 181
    .line 182
    rem-int/lit16 p2, p2, 0x80

    .line 183
    .line 184
    sput p2, LVa/H2;->S:I

    .line 185
    .line 186
    return-object p1

    .line 187
    :pswitch_6
    const/4 p2, 0x0

    .line 188
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    check-cast p1, Ljava/lang/String;

    .line 193
    .line 194
    sget v0, LVa/H2;->S:I

    .line 195
    .line 196
    add-int/lit8 v0, v0, 0x65

    .line 197
    .line 198
    rem-int/lit16 v1, v0, 0x80

    .line 199
    .line 200
    sput v1, LVa/H2;->T:I

    .line 201
    .line 202
    rem-int/lit8 v0, v0, 0x2

    .line 203
    .line 204
    invoke-static {p1}, LVa/H2;->D0(Ljava/lang/String;)Ljava/lang/Enum;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    if-nez v0, :cond_3

    .line 209
    .line 210
    const/16 v0, 0x3e

    .line 211
    .line 212
    div-int/2addr v0, p2

    .line 213
    :cond_3
    return-object p1

    .line 214
    :pswitch_7
    const/4 p2, 0x0

    .line 215
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    check-cast p1, Ljava/lang/String;

    .line 220
    .line 221
    sget v0, LVa/H2;->T:I

    .line 222
    .line 223
    add-int/lit8 v0, v0, 0x37

    .line 224
    .line 225
    rem-int/lit16 v0, v0, 0x80

    .line 226
    .line 227
    sput v0, LVa/H2;->S:I

    .line 228
    .line 229
    invoke-static {p1}, LVa/H2;->G0(Ljava/lang/String;)Ljava/lang/Enum;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    sget v0, LVa/H2;->T:I

    .line 234
    .line 235
    add-int/lit8 v0, v0, 0x77

    .line 236
    .line 237
    rem-int/lit16 v1, v0, 0x80

    .line 238
    .line 239
    sput v1, LVa/H2;->S:I

    .line 240
    .line 241
    rem-int/lit8 v0, v0, 0x2

    .line 242
    .line 243
    if-eqz v0, :cond_4

    .line 244
    .line 245
    const/16 v0, 0xc

    .line 246
    .line 247
    div-int/2addr v0, p2

    .line 248
    :cond_4
    return-object p1

    .line 249
    :pswitch_8
    sget p1, LVa/w2;->T:I

    .line 250
    .line 251
    add-int/lit8 p1, p1, 0x41

    .line 252
    .line 253
    rem-int/lit16 p2, p1, 0x80

    .line 254
    .line 255
    sput p2, LVa/w2;->U:I

    .line 256
    .line 257
    rem-int/lit8 p1, p1, 0x2

    .line 258
    .line 259
    if-eqz p1, :cond_5

    .line 260
    .line 261
    invoke-static {}, LVa/w2;->C0()Lcom/hyprmx/android/sdk/core/DependencyHolder;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    return-object p1

    .line 266
    :cond_5
    invoke-static {}, LVa/w2;->C0()Lcom/hyprmx/android/sdk/core/DependencyHolder;

    .line 267
    .line 268
    .line 269
    const/4 p1, 0x0

    .line 270
    throw p1

    .line 271
    :pswitch_9
    const/4 p2, 0x0

    .line 272
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    check-cast p1, Ljava/lang/String;

    .line 277
    .line 278
    sget p2, LVa/w2;->U:I

    .line 279
    .line 280
    add-int/lit8 p2, p2, 0x21

    .line 281
    .line 282
    rem-int/lit16 v0, p2, 0x80

    .line 283
    .line 284
    sput v0, LVa/w2;->T:I

    .line 285
    .line 286
    rem-int/lit8 p2, p2, 0x2

    .line 287
    .line 288
    if-nez p2, :cond_6

    .line 289
    .line 290
    invoke-static {p1}, LVa/w2;->D0(Ljava/lang/String;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    sget p2, LVa/w2;->T:I

    .line 295
    .line 296
    add-int/lit8 p2, p2, 0xb

    .line 297
    .line 298
    rem-int/lit16 p2, p2, 0x80

    .line 299
    .line 300
    sput p2, LVa/w2;->U:I

    .line 301
    .line 302
    return-object p1

    .line 303
    :cond_6
    invoke-static {p1}, LVa/w2;->D0(Ljava/lang/String;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    const/4 p1, 0x0

    .line 307
    throw p1

    .line 308
    :pswitch_a
    sget p1, LVa/o2;->T:I

    .line 309
    .line 310
    add-int/lit8 p1, p1, 0x37

    .line 311
    .line 312
    rem-int/lit16 p2, p1, 0x80

    .line 313
    .line 314
    sput p2, LVa/o2;->U:I

    .line 315
    .line 316
    rem-int/lit8 p1, p1, 0x2

    .line 317
    .line 318
    if-eqz p1, :cond_7

    .line 319
    .line 320
    invoke-static {}, LVa/o2;->D0()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    sget p2, LVa/o2;->T:I

    .line 325
    .line 326
    add-int/lit8 p2, p2, 0x2b

    .line 327
    .line 328
    rem-int/lit16 p2, p2, 0x80

    .line 329
    .line 330
    sput p2, LVa/o2;->U:I

    .line 331
    .line 332
    return-object p1

    .line 333
    :cond_7
    invoke-static {}, LVa/o2;->D0()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    const/4 p1, 0x0

    .line 337
    throw p1

    .line 338
    :pswitch_b
    sget p1, LVa/o2;->U:I

    .line 339
    .line 340
    add-int/lit8 p1, p1, 0x19

    .line 341
    .line 342
    rem-int/lit16 p2, p1, 0x80

    .line 343
    .line 344
    sput p2, LVa/o2;->T:I

    .line 345
    .line 346
    rem-int/lit8 p1, p1, 0x2

    .line 347
    .line 348
    const/4 p2, 0x0

    .line 349
    if-nez p1, :cond_9

    .line 350
    .line 351
    invoke-static {}, LVa/o2;->E0()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object p1

    .line 355
    sget v0, LVa/o2;->T:I

    .line 356
    .line 357
    add-int/lit8 v0, v0, 0x11

    .line 358
    .line 359
    rem-int/lit16 v1, v0, 0x80

    .line 360
    .line 361
    sput v1, LVa/o2;->U:I

    .line 362
    .line 363
    rem-int/lit8 v0, v0, 0x2

    .line 364
    .line 365
    if-eqz v0, :cond_8

    .line 366
    .line 367
    return-object p1

    .line 368
    :cond_8
    throw p2

    .line 369
    :cond_9
    invoke-static {}, LVa/o2;->E0()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    throw p2

    .line 373
    :pswitch_c
    sget p1, LVa/o2;->T:I

    .line 374
    .line 375
    add-int/lit8 p1, p1, 0x2d

    .line 376
    .line 377
    rem-int/lit16 p1, p1, 0x80

    .line 378
    .line 379
    sput p1, LVa/o2;->U:I

    .line 380
    .line 381
    invoke-static {}, LVa/o2;->C0()Lcom/facebook/ads/internal/dynamicloading/DynamicLoader;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    sget p2, LVa/o2;->U:I

    .line 386
    .line 387
    add-int/lit8 p2, p2, 0x5b

    .line 388
    .line 389
    rem-int/lit16 p2, p2, 0x80

    .line 390
    .line 391
    sput p2, LVa/o2;->T:I

    .line 392
    .line 393
    return-object p1

    .line 394
    :pswitch_d
    const/4 p2, 0x0

    .line 395
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    check-cast p1, Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAd;

    .line 400
    .line 401
    sget p2, LVa/h2;->T:I

    .line 402
    .line 403
    add-int/lit8 p2, p2, 0x6d

    .line 404
    .line 405
    rem-int/lit16 p2, p2, 0x80

    .line 406
    .line 407
    sput p2, LVa/h2;->U:I

    .line 408
    .line 409
    add-int/lit8 p2, p2, 0x1

    .line 410
    .line 411
    rem-int/lit16 v0, p2, 0x80

    .line 412
    .line 413
    sput v0, LVa/h2;->T:I

    .line 414
    .line 415
    rem-int/lit8 p2, p2, 0x2

    .line 416
    .line 417
    const/4 v0, 0x0

    .line 418
    if-nez p2, :cond_b

    .line 419
    .line 420
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAd;->getBannerView()Landroid/view/View;

    .line 421
    .line 422
    .line 423
    move-result-object p1

    .line 424
    sget p2, LVa/h2;->T:I

    .line 425
    .line 426
    add-int/lit8 p2, p2, 0x4f

    .line 427
    .line 428
    rem-int/lit16 v1, p2, 0x80

    .line 429
    .line 430
    sput v1, LVa/h2;->U:I

    .line 431
    .line 432
    rem-int/lit8 p2, p2, 0x2

    .line 433
    .line 434
    if-eqz p2, :cond_a

    .line 435
    .line 436
    return-object p1

    .line 437
    :cond_a
    throw v0

    .line 438
    :cond_b
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAd;->getBannerView()Landroid/view/View;

    .line 439
    .line 440
    .line 441
    throw v0

    .line 442
    :pswitch_e
    const/4 p2, 0x0

    .line 443
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object p2

    .line 447
    check-cast p2, Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAd;

    .line 448
    .line 449
    const/4 v0, 0x1

    .line 450
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    check-cast p1, Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdInteractionListener;

    .line 455
    .line 456
    sget v0, LVa/h2;->U:I

    .line 457
    .line 458
    add-int/lit8 v0, v0, 0x59

    .line 459
    .line 460
    rem-int/lit16 v1, v0, 0x80

    .line 461
    .line 462
    sput v1, LVa/h2;->T:I

    .line 463
    .line 464
    rem-int/lit8 v0, v0, 0x2

    .line 465
    .line 466
    const/4 v1, 0x0

    .line 467
    invoke-static {p2, p1}, LVa/h2;->F0(Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAd;Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdInteractionListener;)V

    .line 468
    .line 469
    .line 470
    if-nez v0, :cond_c

    .line 471
    .line 472
    return-object v1

    .line 473
    :cond_c
    throw v1

    .line 474
    :pswitch_f
    const/4 p2, 0x0

    .line 475
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object p1

    .line 479
    check-cast p1, Lcom/bytedance/sdk/openadsdk/api/PangleAd;

    .line 480
    .line 481
    sget v0, LVa/h2;->T:I

    .line 482
    .line 483
    add-int/lit8 v0, v0, 0x77

    .line 484
    .line 485
    rem-int/lit16 v0, v0, 0x80

    .line 486
    .line 487
    sput v0, LVa/h2;->U:I

    .line 488
    .line 489
    add-int/lit8 v0, v0, 0x1

    .line 490
    .line 491
    rem-int/lit16 v1, v0, 0x80

    .line 492
    .line 493
    sput v1, LVa/h2;->T:I

    .line 494
    .line 495
    rem-int/lit8 v0, v0, 0x2

    .line 496
    .line 497
    if-nez v0, :cond_e

    .line 498
    .line 499
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/api/PangleAd;->getMediaExtraInfo()Ljava/util/Map;

    .line 500
    .line 501
    .line 502
    move-result-object p1

    .line 503
    sget v0, LVa/h2;->U:I

    .line 504
    .line 505
    add-int/lit8 v0, v0, 0x35

    .line 506
    .line 507
    rem-int/lit16 v1, v0, 0x80

    .line 508
    .line 509
    sput v1, LVa/h2;->T:I

    .line 510
    .line 511
    rem-int/lit8 v0, v0, 0x2

    .line 512
    .line 513
    if-eqz v0, :cond_d

    .line 514
    .line 515
    const/16 v0, 0x3b

    .line 516
    .line 517
    div-int/2addr v0, p2

    .line 518
    :cond_d
    add-int/lit8 v1, v1, 0x71

    .line 519
    .line 520
    rem-int/lit16 v1, v1, 0x80

    .line 521
    .line 522
    sput v1, LVa/h2;->U:I

    .line 523
    .line 524
    return-object p1

    .line 525
    :cond_e
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/api/PangleAd;->getMediaExtraInfo()Ljava/util/Map;

    .line 526
    .line 527
    .line 528
    const/4 p1, 0x0

    .line 529
    throw p1

    .line 530
    :pswitch_10
    const/4 p2, 0x0

    .line 531
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object p1

    .line 535
    check-cast p1, Lcom/bytedance/sdk/openadsdk/api/reward/PAGRewardItem;

    .line 536
    .line 537
    sget p2, LVa/h2;->U:I

    .line 538
    .line 539
    add-int/lit8 p2, p2, 0x25

    .line 540
    .line 541
    rem-int/lit16 p2, p2, 0x80

    .line 542
    .line 543
    sput p2, LVa/h2;->T:I

    .line 544
    .line 545
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/api/reward/PAGRewardItem;->getRewardAmount()I

    .line 546
    .line 547
    .line 548
    move-result p1

    .line 549
    sget p2, LVa/h2;->U:I

    .line 550
    .line 551
    add-int/lit8 p2, p2, 0x3f

    .line 552
    .line 553
    rem-int/lit16 p2, p2, 0x80

    .line 554
    .line 555
    sput p2, LVa/h2;->T:I

    .line 556
    .line 557
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 558
    .line 559
    .line 560
    move-result-object p1

    .line 561
    return-object p1

    .line 562
    :pswitch_11
    sget p1, LVa/h2;->T:I

    .line 563
    .line 564
    add-int/lit8 p1, p1, 0x4b

    .line 565
    .line 566
    rem-int/lit16 p1, p1, 0x80

    .line 567
    .line 568
    sput p1, LVa/h2;->U:I

    .line 569
    .line 570
    invoke-static {}, LVa/h2;->C0()I

    .line 571
    .line 572
    .line 573
    move-result p1

    .line 574
    sget p2, LVa/h2;->U:I

    .line 575
    .line 576
    add-int/lit8 p2, p2, 0x2f

    .line 577
    .line 578
    rem-int/lit16 v0, p2, 0x80

    .line 579
    .line 580
    sput v0, LVa/h2;->T:I

    .line 581
    .line 582
    rem-int/lit8 p2, p2, 0x2

    .line 583
    .line 584
    if-eqz p2, :cond_f

    .line 585
    .line 586
    const/16 p2, 0x40

    .line 587
    .line 588
    div-int/lit8 p2, p2, 0x0

    .line 589
    .line 590
    :cond_f
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 591
    .line 592
    .line 593
    move-result-object p1

    .line 594
    return-object p1

    .line 595
    :pswitch_12
    const/4 p2, 0x0

    .line 596
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object p1

    .line 600
    check-cast p1, Lcom/bytedance/sdk/openadsdk/api/reward/PAGRewardItem;

    .line 601
    .line 602
    sget p2, LVa/h2;->T:I

    .line 603
    .line 604
    add-int/lit8 p2, p2, 0x77

    .line 605
    .line 606
    rem-int/lit16 p2, p2, 0x80

    .line 607
    .line 608
    sput p2, LVa/h2;->U:I

    .line 609
    .line 610
    add-int/lit8 p2, p2, 0x3d

    .line 611
    .line 612
    rem-int/lit16 p2, p2, 0x80

    .line 613
    .line 614
    sput p2, LVa/h2;->T:I

    .line 615
    .line 616
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/api/reward/PAGRewardItem;->getRewardName()Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object p1

    .line 620
    sget p2, LVa/h2;->T:I

    .line 621
    .line 622
    add-int/lit8 p2, p2, 0x9

    .line 623
    .line 624
    rem-int/lit16 p2, p2, 0x80

    .line 625
    .line 626
    sput p2, LVa/h2;->U:I

    .line 627
    .line 628
    return-object p1

    .line 629
    :pswitch_13
    sget p1, LVa/K1;->T:I

    .line 630
    .line 631
    add-int/lit8 p2, p1, 0x3d

    .line 632
    .line 633
    rem-int/lit16 v0, p2, 0x80

    .line 634
    .line 635
    sput v0, LVa/K1;->S:I

    .line 636
    .line 637
    rem-int/lit8 p2, p2, 0x2

    .line 638
    .line 639
    if-nez p2, :cond_10

    .line 640
    .line 641
    add-int/lit8 p1, p1, 0x65

    .line 642
    .line 643
    rem-int/lit16 p1, p1, 0x80

    .line 644
    .line 645
    sput p1, LVa/K1;->S:I

    .line 646
    .line 647
    invoke-static {}, LVa/K1;->C0()Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object p1

    .line 651
    instance-of p1, p1, LVa/J1;

    .line 652
    .line 653
    sget p2, LVa/K1;->S:I

    .line 654
    .line 655
    add-int/lit8 p2, p2, 0x21

    .line 656
    .line 657
    rem-int/lit16 p2, p2, 0x80

    .line 658
    .line 659
    sput p2, LVa/K1;->T:I

    .line 660
    .line 661
    add-int/lit8 p2, p2, 0x2f

    .line 662
    .line 663
    rem-int/lit16 p2, p2, 0x80

    .line 664
    .line 665
    sput p2, LVa/K1;->S:I

    .line 666
    .line 667
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 668
    .line 669
    .line 670
    move-result-object p1

    .line 671
    return-object p1

    .line 672
    :cond_10
    add-int/lit8 p1, p1, 0x65

    .line 673
    .line 674
    rem-int/lit16 p1, p1, 0x80

    .line 675
    .line 676
    sput p1, LVa/K1;->S:I

    .line 677
    .line 678
    invoke-static {}, LVa/K1;->C0()Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object p1

    .line 682
    instance-of p1, p1, LVa/J1;

    .line 683
    .line 684
    sget p1, LVa/K1;->S:I

    .line 685
    .line 686
    add-int/lit8 p1, p1, 0x21

    .line 687
    .line 688
    rem-int/lit16 p1, p1, 0x80

    .line 689
    .line 690
    sput p1, LVa/K1;->T:I

    .line 691
    .line 692
    const/4 p1, 0x0

    .line 693
    throw p1

    .line 694
    :pswitch_14
    sget p1, LVa/K1;->S:I

    .line 695
    .line 696
    add-int/lit8 p1, p1, 0x61

    .line 697
    .line 698
    rem-int/lit16 p1, p1, 0x80

    .line 699
    .line 700
    sput p1, LVa/K1;->T:I

    .line 701
    .line 702
    invoke-static {}, LVa/K1;->C0()Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object p1

    .line 706
    sget p2, LVa/K1;->S:I

    .line 707
    .line 708
    add-int/lit8 p2, p2, 0x37

    .line 709
    .line 710
    rem-int/lit16 v0, p2, 0x80

    .line 711
    .line 712
    sput v0, LVa/K1;->T:I

    .line 713
    .line 714
    rem-int/lit8 p2, p2, 0x2

    .line 715
    .line 716
    if-eqz p2, :cond_11

    .line 717
    .line 718
    return-object p1

    .line 719
    :cond_11
    const/4 p1, 0x0

    .line 720
    throw p1

    .line 721
    :pswitch_15
    sget p1, LVa/K1;->S:I

    .line 722
    .line 723
    add-int/lit8 p1, p1, 0x37

    .line 724
    .line 725
    rem-int/lit16 p2, p1, 0x80

    .line 726
    .line 727
    sput p2, LVa/K1;->T:I

    .line 728
    .line 729
    rem-int/lit8 p1, p1, 0x2

    .line 730
    .line 731
    if-nez p1, :cond_12

    .line 732
    .line 733
    invoke-static {}, LVa/K1;->E0()Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object p1

    .line 737
    const/16 p2, 0x24

    .line 738
    .line 739
    div-int/lit8 p2, p2, 0x0

    .line 740
    .line 741
    goto :goto_1

    .line 742
    :cond_12
    invoke-static {}, LVa/K1;->E0()Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object p1

    .line 746
    :goto_1
    sget p2, LVa/K1;->T:I

    .line 747
    .line 748
    add-int/lit8 p2, p2, 0x69

    .line 749
    .line 750
    rem-int/lit16 v0, p2, 0x80

    .line 751
    .line 752
    sput v0, LVa/K1;->S:I

    .line 753
    .line 754
    rem-int/lit8 p2, p2, 0x2

    .line 755
    .line 756
    if-nez p2, :cond_13

    .line 757
    .line 758
    return-object p1

    .line 759
    :cond_13
    const/4 p1, 0x0

    .line 760
    throw p1

    .line 761
    :pswitch_16
    sget p1, LVa/K1;->T:I

    .line 762
    .line 763
    add-int/lit8 p1, p1, 0x11

    .line 764
    .line 765
    rem-int/lit16 p1, p1, 0x80

    .line 766
    .line 767
    sput p1, LVa/K1;->S:I

    .line 768
    .line 769
    invoke-static {}, LVa/K1;->D0()Z

    .line 770
    .line 771
    .line 772
    move-result p1

    .line 773
    sget p2, LVa/K1;->S:I

    .line 774
    .line 775
    add-int/lit8 p2, p2, 0x3b

    .line 776
    .line 777
    rem-int/lit16 p2, p2, 0x80

    .line 778
    .line 779
    sput p2, LVa/K1;->T:I

    .line 780
    .line 781
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 782
    .line 783
    .line 784
    move-result-object p1

    .line 785
    return-object p1

    .line 786
    :pswitch_17
    const/4 p2, 0x0

    .line 787
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object p1

    .line 791
    check-cast p1, Lcom/applovin/communicator/AppLovinCommunicatorMessage;

    .line 792
    .line 793
    sget p2, LVa/E1;->T:I

    .line 794
    .line 795
    add-int/lit8 p2, p2, 0x17

    .line 796
    .line 797
    rem-int/lit16 v0, p2, 0x80

    .line 798
    .line 799
    sput v0, LVa/E1;->U:I

    .line 800
    .line 801
    rem-int/lit8 p2, p2, 0x2

    .line 802
    .line 803
    const/4 v0, 0x0

    .line 804
    if-eqz p2, :cond_15

    .line 805
    .line 806
    sget p2, LVa/E1;->T:I

    .line 807
    .line 808
    add-int/lit8 p2, p2, 0x43

    .line 809
    .line 810
    rem-int/lit16 v1, p2, 0x80

    .line 811
    .line 812
    sput v1, LVa/E1;->U:I

    .line 813
    .line 814
    rem-int/lit8 p2, p2, 0x2

    .line 815
    .line 816
    if-eqz p2, :cond_14

    .line 817
    .line 818
    invoke-virtual {p1}, Lcom/applovin/communicator/AppLovinCommunicatorMessage;->getMessageData()Landroid/os/Bundle;

    .line 819
    .line 820
    .line 821
    move-result-object p1

    .line 822
    return-object p1

    .line 823
    :cond_14
    invoke-virtual {p1}, Lcom/applovin/communicator/AppLovinCommunicatorMessage;->getMessageData()Landroid/os/Bundle;

    .line 824
    .line 825
    .line 826
    throw v0

    .line 827
    :cond_15
    sget p2, LVa/E1;->T:I

    .line 828
    .line 829
    add-int/lit8 p2, p2, 0x43

    .line 830
    .line 831
    rem-int/lit16 v1, p2, 0x80

    .line 832
    .line 833
    sput v1, LVa/E1;->U:I

    .line 834
    .line 835
    rem-int/lit8 p2, p2, 0x2

    .line 836
    .line 837
    invoke-virtual {p1}, Lcom/applovin/communicator/AppLovinCommunicatorMessage;->getMessageData()Landroid/os/Bundle;

    .line 838
    .line 839
    .line 840
    if-eqz p2, :cond_16

    .line 841
    .line 842
    throw v0

    .line 843
    :cond_16
    throw v0

    .line 844
    :pswitch_18
    const/4 p2, 0x0

    .line 845
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object p1

    .line 849
    check-cast p1, Lcom/applovin/impl/sdk/nativeAd/AppLovinNativeAdImpl;

    .line 850
    .line 851
    sget p2, LVa/E1;->T:I

    .line 852
    .line 853
    add-int/lit8 p2, p2, 0x21

    .line 854
    .line 855
    rem-int/lit16 p2, p2, 0x80

    .line 856
    .line 857
    sput p2, LVa/E1;->U:I

    .line 858
    .line 859
    invoke-virtual {p1}, Lcom/applovin/impl/sdk/nativeAd/AppLovinNativeAdImpl;->getMainImageUri()Landroid/net/Uri;

    .line 860
    .line 861
    .line 862
    move-result-object p1

    .line 863
    sget p2, LVa/E1;->T:I

    .line 864
    .line 865
    add-int/lit8 p2, p2, 0x65

    .line 866
    .line 867
    rem-int/lit16 p2, p2, 0x80

    .line 868
    .line 869
    sput p2, LVa/E1;->U:I

    .line 870
    .line 871
    return-object p1

    .line 872
    :pswitch_19
    const/4 p2, 0x0

    .line 873
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    move-result-object p1

    .line 877
    check-cast p1, Lcom/applovin/sdk/AppLovinAd;

    .line 878
    .line 879
    sget v0, LVa/E1;->T:I

    .line 880
    .line 881
    add-int/lit8 v0, v0, 0x3

    .line 882
    .line 883
    rem-int/lit16 v1, v0, 0x80

    .line 884
    .line 885
    sput v1, LVa/E1;->U:I

    .line 886
    .line 887
    rem-int/lit8 v0, v0, 0x2

    .line 888
    .line 889
    invoke-static {p1}, LVa/E1;->C0(Lcom/applovin/sdk/AppLovinAd;)Z

    .line 890
    .line 891
    .line 892
    move-result p1

    .line 893
    if-nez v0, :cond_17

    .line 894
    .line 895
    const/16 v0, 0x2d

    .line 896
    .line 897
    div-int/2addr v0, p2

    .line 898
    :cond_17
    sget p2, LVa/E1;->U:I

    .line 899
    .line 900
    add-int/lit8 p2, p2, 0x13

    .line 901
    .line 902
    rem-int/lit16 v0, p2, 0x80

    .line 903
    .line 904
    sput v0, LVa/E1;->T:I

    .line 905
    .line 906
    rem-int/lit8 p2, p2, 0x2

    .line 907
    .line 908
    if-nez p2, :cond_18

    .line 909
    .line 910
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 911
    .line 912
    .line 913
    move-result-object p1

    .line 914
    return-object p1

    .line 915
    :cond_18
    const/4 p1, 0x0

    .line 916
    throw p1

    .line 917
    :pswitch_1a
    const/4 p2, 0x0

    .line 918
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 919
    .line 920
    .line 921
    move-result-object p1

    .line 922
    check-cast p1, Landroid/content/Context;

    .line 923
    .line 924
    sget v0, LVa/E1;->T:I

    .line 925
    .line 926
    add-int/lit8 v0, v0, 0x55

    .line 927
    .line 928
    rem-int/lit16 v1, v0, 0x80

    .line 929
    .line 930
    sput v1, LVa/E1;->U:I

    .line 931
    .line 932
    rem-int/lit8 v0, v0, 0x2

    .line 933
    .line 934
    invoke-static {p1}, LVa/E1;->O0(Landroid/content/Context;)Lcom/applovin/impl/sdk/AppLovinBroadcastManager;

    .line 935
    .line 936
    .line 937
    move-result-object p1

    .line 938
    if-nez v0, :cond_19

    .line 939
    .line 940
    const/16 v0, 0x47

    .line 941
    .line 942
    div-int/2addr v0, p2

    .line 943
    :cond_19
    sget p2, LVa/E1;->T:I

    .line 944
    .line 945
    add-int/lit8 p2, p2, 0x6f

    .line 946
    .line 947
    rem-int/lit16 p2, p2, 0x80

    .line 948
    .line 949
    sput p2, LVa/E1;->U:I

    .line 950
    .line 951
    return-object p1

    .line 952
    :pswitch_1b
    const/4 p2, 0x0

    .line 953
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 954
    .line 955
    .line 956
    move-result-object p1

    .line 957
    check-cast p1, Lcom/applovin/sdk/AppLovinAd;

    .line 958
    .line 959
    sget p2, LVa/E1;->U:I

    .line 960
    .line 961
    add-int/lit8 p2, p2, 0x49

    .line 962
    .line 963
    rem-int/lit16 v0, p2, 0x80

    .line 964
    .line 965
    sput v0, LVa/E1;->T:I

    .line 966
    .line 967
    rem-int/lit8 p2, p2, 0x2

    .line 968
    .line 969
    const/4 v0, 0x0

    .line 970
    if-nez p2, :cond_1b

    .line 971
    .line 972
    invoke-static {p1}, LVa/E1;->D0(Lcom/applovin/sdk/AppLovinAd;)Z

    .line 973
    .line 974
    .line 975
    move-result p1

    .line 976
    sget p2, LVa/E1;->T:I

    .line 977
    .line 978
    add-int/lit8 p2, p2, 0x19

    .line 979
    .line 980
    rem-int/lit16 v1, p2, 0x80

    .line 981
    .line 982
    sput v1, LVa/E1;->U:I

    .line 983
    .line 984
    rem-int/lit8 p2, p2, 0x2

    .line 985
    .line 986
    if-eqz p2, :cond_1a

    .line 987
    .line 988
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 989
    .line 990
    .line 991
    move-result-object p1

    .line 992
    return-object p1

    .line 993
    :cond_1a
    throw v0

    .line 994
    :cond_1b
    invoke-static {p1}, LVa/E1;->D0(Lcom/applovin/sdk/AppLovinAd;)Z

    .line 995
    .line 996
    .line 997
    throw v0

    .line 998
    :pswitch_1c
    const/4 p2, 0x0

    .line 999
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1000
    .line 1001
    .line 1002
    move-result-object p2

    .line 1003
    check-cast p2, Lcom/applovin/adview/AppLovinInterstitialAdDialog;

    .line 1004
    .line 1005
    const/4 v0, 0x1

    .line 1006
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1007
    .line 1008
    .line 1009
    move-result-object p1

    .line 1010
    check-cast p1, Lcom/applovin/sdk/AppLovinAdClickListener;

    .line 1011
    .line 1012
    sget v0, LVa/E1;->T:I

    .line 1013
    .line 1014
    add-int/lit8 v0, v0, 0xd

    .line 1015
    .line 1016
    rem-int/lit16 v1, v0, 0x80

    .line 1017
    .line 1018
    sput v1, LVa/E1;->U:I

    .line 1019
    .line 1020
    rem-int/lit8 v0, v0, 0x2

    .line 1021
    .line 1022
    const/4 v1, 0x0

    .line 1023
    invoke-static {p2, p1}, LVa/E1;->L0(Lcom/applovin/adview/AppLovinInterstitialAdDialog;Lcom/applovin/sdk/AppLovinAdClickListener;)V

    .line 1024
    .line 1025
    .line 1026
    if-eqz v0, :cond_1c

    .line 1027
    .line 1028
    sget p1, LVa/E1;->U:I

    .line 1029
    .line 1030
    add-int/lit8 p1, p1, 0x19

    .line 1031
    .line 1032
    rem-int/lit16 p1, p1, 0x80

    .line 1033
    .line 1034
    sput p1, LVa/E1;->T:I

    .line 1035
    .line 1036
    return-object v1

    .line 1037
    :cond_1c
    throw v1

    .line 1038
    nop

    .line 1039
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
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
