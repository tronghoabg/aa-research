.class public final LVa/N3;
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
    iput p1, p0, LVa/N3;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget p2, p0, LVa/N3;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget p1, LVa/P6;->U:I

    .line 7
    .line 8
    add-int/lit8 p1, p1, 0x6b

    .line 9
    .line 10
    rem-int/lit16 p2, p1, 0x80

    .line 11
    .line 12
    sput p2, LVa/P6;->T:I

    .line 13
    .line 14
    rem-int/lit8 p1, p1, 0x2

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    invoke-static {}, LVa/P6;->D0()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    sget v0, LVa/P6;->U:I

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0xb

    .line 26
    .line 27
    rem-int/lit16 v1, v0, 0x80

    .line 28
    .line 29
    sput v1, LVa/P6;->T:I

    .line 30
    .line 31
    rem-int/lit8 v0, v0, 0x2

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_0
    throw p2

    .line 37
    :cond_1
    invoke-static {}, LVa/P6;->D0()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    throw p2

    .line 41
    :pswitch_0
    const/4 p2, 0x0

    .line 42
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Lcom/unity3d/ads/core/data/model/AdObject;

    .line 47
    .line 48
    sget p2, LVa/P6;->U:I

    .line 49
    .line 50
    add-int/lit8 p2, p2, 0x23

    .line 51
    .line 52
    rem-int/lit16 p2, p2, 0x80

    .line 53
    .line 54
    sput p2, LVa/P6;->T:I

    .line 55
    .line 56
    add-int/lit8 p2, p2, 0x5

    .line 57
    .line 58
    rem-int/lit16 v0, p2, 0x80

    .line 59
    .line 60
    sput v0, LVa/P6;->U:I

    .line 61
    .line 62
    rem-int/lit8 p2, p2, 0x2

    .line 63
    .line 64
    if-eqz p2, :cond_2

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/unity3d/ads/core/data/model/AdObject;->getOpportunityId()Lcom/google/protobuf/ByteString;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    sget p2, LVa/P6;->T:I

    .line 71
    .line 72
    add-int/lit8 p2, p2, 0x77

    .line 73
    .line 74
    rem-int/lit16 p2, p2, 0x80

    .line 75
    .line 76
    sput p2, LVa/P6;->U:I

    .line 77
    .line 78
    return-object p1

    .line 79
    :cond_2
    invoke-virtual {p1}, Lcom/unity3d/ads/core/data/model/AdObject;->getOpportunityId()Lcom/google/protobuf/ByteString;

    .line 80
    .line 81
    .line 82
    const/4 p1, 0x0

    .line 83
    throw p1

    .line 84
    :pswitch_1
    const/4 p2, 0x0

    .line 85
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Lcom/unity3d/ads/core/data/model/AdObject;

    .line 90
    .line 91
    sget p2, LVa/P6;->U:I

    .line 92
    .line 93
    add-int/lit8 p2, p2, 0x3f

    .line 94
    .line 95
    rem-int/lit16 v0, p2, 0x80

    .line 96
    .line 97
    sput v0, LVa/P6;->T:I

    .line 98
    .line 99
    rem-int/lit8 p2, p2, 0x2

    .line 100
    .line 101
    if-nez p2, :cond_3

    .line 102
    .line 103
    invoke-static {p1}, LVa/P6;->F0(Lcom/unity3d/ads/core/data/model/AdObject;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    return-object p1

    .line 108
    :cond_3
    invoke-static {p1}, LVa/P6;->F0(Lcom/unity3d/ads/core/data/model/AdObject;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    const/4 p1, 0x0

    .line 112
    throw p1

    .line 113
    :pswitch_2
    const/4 p2, 0x0

    .line 114
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, Lcom/unity3d/ads/UnityAdsLoadOptions;

    .line 119
    .line 120
    sget v0, LVa/P6;->U:I

    .line 121
    .line 122
    add-int/lit8 v0, v0, 0x1b

    .line 123
    .line 124
    rem-int/lit16 v1, v0, 0x80

    .line 125
    .line 126
    sput v1, LVa/P6;->T:I

    .line 127
    .line 128
    rem-int/lit8 v0, v0, 0x2

    .line 129
    .line 130
    if-eqz v0, :cond_4

    .line 131
    .line 132
    add-int/lit8 v1, v1, 0x29

    .line 133
    .line 134
    rem-int/lit16 v1, v1, 0x80

    .line 135
    .line 136
    sput v1, LVa/P6;->U:I

    .line 137
    .line 138
    invoke-virtual {p1}, Lcom/unity3d/ads/UnityAdsBaseOptions;->getData()Lorg/json/JSONObject;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    sget v0, LVa/P6;->U:I

    .line 143
    .line 144
    add-int/lit8 v0, v0, 0x27

    .line 145
    .line 146
    rem-int/lit16 v0, v0, 0x80

    .line 147
    .line 148
    sput v0, LVa/P6;->T:I

    .line 149
    .line 150
    const/16 v0, 0x5d

    .line 151
    .line 152
    div-int/2addr v0, p2

    .line 153
    goto :goto_0

    .line 154
    :cond_4
    add-int/lit8 v1, v1, 0x29

    .line 155
    .line 156
    rem-int/lit16 v1, v1, 0x80

    .line 157
    .line 158
    sput v1, LVa/P6;->U:I

    .line 159
    .line 160
    invoke-virtual {p1}, Lcom/unity3d/ads/UnityAdsBaseOptions;->getData()Lorg/json/JSONObject;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    sget p2, LVa/P6;->U:I

    .line 165
    .line 166
    add-int/lit8 p2, p2, 0x27

    .line 167
    .line 168
    rem-int/lit16 p2, p2, 0x80

    .line 169
    .line 170
    sput p2, LVa/P6;->T:I

    .line 171
    .line 172
    :goto_0
    return-object p1

    .line 173
    :pswitch_3
    sget p1, LVa/P6;->T:I

    .line 174
    .line 175
    add-int/lit8 p1, p1, 0x5d

    .line 176
    .line 177
    rem-int/lit16 p1, p1, 0x80

    .line 178
    .line 179
    sput p1, LVa/P6;->U:I

    .line 180
    .line 181
    invoke-static {}, Lcom/unity3d/services/core/webview/WebViewApp;->getCurrentApp()Lcom/unity3d/services/core/webview/WebViewApp;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    sget p2, LVa/P6;->U:I

    .line 186
    .line 187
    add-int/lit8 p2, p2, 0x47

    .line 188
    .line 189
    rem-int/lit16 v0, p2, 0x80

    .line 190
    .line 191
    sput v0, LVa/P6;->T:I

    .line 192
    .line 193
    rem-int/lit8 p2, p2, 0x2

    .line 194
    .line 195
    if-nez p2, :cond_5

    .line 196
    .line 197
    return-object p1

    .line 198
    :cond_5
    const/4 p1, 0x0

    .line 199
    throw p1

    .line 200
    :pswitch_4
    const/4 p2, 0x0

    .line 201
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    check-cast p1, Ljava/lang/String;

    .line 206
    .line 207
    sget v0, LVa/P6;->U:I

    .line 208
    .line 209
    add-int/lit8 v0, v0, 0x11

    .line 210
    .line 211
    rem-int/lit16 v0, v0, 0x80

    .line 212
    .line 213
    sput v0, LVa/P6;->T:I

    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    const v1, 0xaeb2139

    .line 220
    .line 221
    .line 222
    const/4 v2, 0x1

    .line 223
    if-eq v0, v1, :cond_7

    .line 224
    .line 225
    const v1, 0x7b29883d

    .line 226
    .line 227
    .line 228
    if-eq v0, v1, :cond_6

    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_6
    const-string v0, ""

    .line 232
    .line 233
    invoke-static {v0, p2}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    rsub-int v1, v1, 0x1800

    .line 238
    .line 239
    int-to-char v1, v1

    .line 240
    invoke-static {p2, p2, p2, p2}, Landroid/graphics/Color;->argb(IIII)I

    .line 241
    .line 242
    .line 243
    move-result p2

    .line 244
    rsub-int p2, p2, 0x4fb

    .line 245
    .line 246
    const/16 v3, 0x30

    .line 247
    .line 248
    invoke-static {v0, v3}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    add-int/lit8 v0, v0, 0x7

    .line 253
    .line 254
    invoke-static {p2, v0, v1}, LVa/P6;->I0(IIC)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object p2

    .line 258
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p2

    .line 262
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result p1

    .line 266
    if-eqz p1, :cond_8

    .line 267
    .line 268
    sget p1, LVa/P6;->U:I

    .line 269
    .line 270
    add-int/lit8 p1, p1, 0x4b

    .line 271
    .line 272
    rem-int/lit16 p1, p1, 0x80

    .line 273
    .line 274
    sput p1, LVa/P6;->T:I

    .line 275
    .line 276
    :goto_1
    move p2, v2

    .line 277
    goto :goto_3

    .line 278
    :cond_7
    invoke-static {p2}, Landroid/graphics/Color;->red(I)I

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    int-to-char v0, v0

    .line 283
    const-wide/16 v3, 0x0

    .line 284
    .line 285
    invoke-static {v3, v4}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    rsub-int v1, v1, 0x4f2

    .line 290
    .line 291
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    const/16 v4, 0x8

    .line 296
    .line 297
    shr-int/2addr v3, v4

    .line 298
    invoke-static {v4, v3, v0, v1, p1}, LVa/M6;->B(IICILjava/lang/String;)Z

    .line 299
    .line 300
    .line 301
    move-result p1

    .line 302
    if-eqz p1, :cond_8

    .line 303
    .line 304
    sget p1, LVa/P6;->U:I

    .line 305
    .line 306
    add-int/lit8 p1, p1, 0x7b

    .line 307
    .line 308
    rem-int/lit16 v0, p1, 0x80

    .line 309
    .line 310
    sput v0, LVa/P6;->T:I

    .line 311
    .line 312
    rem-int/lit8 p1, p1, 0x2

    .line 313
    .line 314
    if-eqz p1, :cond_9

    .line 315
    .line 316
    goto :goto_1

    .line 317
    :cond_8
    :goto_2
    const/4 p2, -0x1

    .line 318
    :cond_9
    :goto_3
    if-eqz p2, :cond_b

    .line 319
    .line 320
    if-eq p2, v2, :cond_a

    .line 321
    .line 322
    const/4 p1, 0x0

    .line 323
    goto :goto_4

    .line 324
    :cond_a
    sget-object p1, Lcom/unity3d/services/core/request/WebRequestEvent;->FAILED:Lcom/unity3d/services/core/request/WebRequestEvent;

    .line 325
    .line 326
    goto :goto_4

    .line 327
    :cond_b
    sget-object p1, Lcom/unity3d/services/core/request/WebRequestEvent;->COMPLETE:Lcom/unity3d/services/core/request/WebRequestEvent;

    .line 328
    .line 329
    :goto_4
    return-object p1

    .line 330
    :pswitch_5
    const/4 p2, 0x0

    .line 331
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    check-cast p1, Lcom/unity3d/services/banners/BannerView;

    .line 336
    .line 337
    sget p2, LVa/P6;->U:I

    .line 338
    .line 339
    add-int/lit8 p2, p2, 0x53

    .line 340
    .line 341
    rem-int/lit16 p2, p2, 0x80

    .line 342
    .line 343
    sput p2, LVa/P6;->T:I

    .line 344
    .line 345
    add-int/lit8 p2, p2, 0x73

    .line 346
    .line 347
    rem-int/lit16 v0, p2, 0x80

    .line 348
    .line 349
    sput v0, LVa/P6;->U:I

    .line 350
    .line 351
    rem-int/lit8 p2, p2, 0x2

    .line 352
    .line 353
    if-eqz p2, :cond_c

    .line 354
    .line 355
    invoke-virtual {p1}, Lcom/unity3d/services/banners/BannerView;->getPlacementId()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    sget p2, LVa/P6;->T:I

    .line 360
    .line 361
    add-int/lit8 p2, p2, 0x5d

    .line 362
    .line 363
    rem-int/lit16 p2, p2, 0x80

    .line 364
    .line 365
    sput p2, LVa/P6;->U:I

    .line 366
    .line 367
    return-object p1

    .line 368
    :cond_c
    invoke-virtual {p1}, Lcom/unity3d/services/banners/BannerView;->getPlacementId()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    const/4 p1, 0x0

    .line 372
    throw p1

    .line 373
    :pswitch_6
    const/4 p2, 0x0

    .line 374
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    check-cast p1, Ljava/lang/String;

    .line 379
    .line 380
    sget v0, LVa/P6;->U:I

    .line 381
    .line 382
    add-int/lit8 v0, v0, 0x67

    .line 383
    .line 384
    rem-int/lit16 v1, v0, 0x80

    .line 385
    .line 386
    sput v1, LVa/P6;->T:I

    .line 387
    .line 388
    const/4 v1, 0x2

    .line 389
    rem-int/2addr v0, v1

    .line 390
    const/4 v2, 0x0

    .line 391
    if-nez v0, :cond_10

    .line 392
    .line 393
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    const/4 v3, 0x1

    .line 398
    const/4 v4, 0x5

    .line 399
    const/16 v5, 0x8

    .line 400
    .line 401
    const/16 v6, 0x30

    .line 402
    .line 403
    const/4 v7, 0x7

    .line 404
    const/4 v8, 0x6

    .line 405
    const-string v9, ""

    .line 406
    .line 407
    const/4 v10, 0x0

    .line 408
    const/4 v11, -0x1

    .line 409
    sparse-switch v0, :sswitch_data_0

    .line 410
    .line 411
    .line 412
    :cond_d
    move p2, v11

    .line 413
    goto/16 :goto_5

    .line 414
    .line 415
    :sswitch_0
    const v0, 0xb61a

    .line 416
    .line 417
    .line 418
    invoke-static {v9, v6, p2, p2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    sub-int/2addr v0, v1

    .line 423
    int-to-char v0, v0

    .line 424
    invoke-static {v9}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    rsub-int v1, v1, 0x4a9

    .line 429
    .line 430
    invoke-static {p2, p2, p2, p2}, Landroid/graphics/Color;->argb(IIII)I

    .line 431
    .line 432
    .line 433
    move-result v3

    .line 434
    invoke-static {v8, v3, v0, v1, p1}, LVa/M6;->B(IICILjava/lang/String;)Z

    .line 435
    .line 436
    .line 437
    move-result p1

    .line 438
    if-eqz p1, :cond_d

    .line 439
    .line 440
    goto/16 :goto_5

    .line 441
    .line 442
    :sswitch_1
    invoke-static {p2, p2}, Landroid/view/View;->resolveSize(II)I

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    int-to-char v0, v0

    .line 447
    invoke-static {p2, p2}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 448
    .line 449
    .line 450
    move-result p2

    .line 451
    rsub-int p2, p2, 0x4c2

    .line 452
    .line 453
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 454
    .line 455
    .line 456
    move-result v1

    .line 457
    shr-int/lit8 v1, v1, 0x10

    .line 458
    .line 459
    invoke-static {v7, v1, v0, p2, p1}, LVa/M6;->B(IICILjava/lang/String;)Z

    .line 460
    .line 461
    .line 462
    move-result p1

    .line 463
    if-eqz p1, :cond_d

    .line 464
    .line 465
    const/4 p2, 0x3

    .line 466
    goto/16 :goto_5

    .line 467
    .line 468
    :sswitch_2
    invoke-static {p2, p2}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    int-to-char v0, v0

    .line 473
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 474
    .line 475
    .line 476
    move-result v3

    .line 477
    shr-int/lit8 v3, v3, 0x10

    .line 478
    .line 479
    rsub-int v3, v3, 0x4bb

    .line 480
    .line 481
    invoke-static {p2, v10, v10}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 482
    .line 483
    .line 484
    move-result p2

    .line 485
    cmpl-float p2, p2, v10

    .line 486
    .line 487
    add-int/2addr p2, v7

    .line 488
    invoke-static {v3, p2, v0}, LVa/P6;->I0(IIC)Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object p2

    .line 492
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object p2

    .line 496
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    move-result p1

    .line 500
    if-eqz p1, :cond_d

    .line 501
    .line 502
    sget p1, LVa/P6;->T:I

    .line 503
    .line 504
    add-int/lit8 p1, p1, 0x7d

    .line 505
    .line 506
    rem-int/lit16 p1, p1, 0x80

    .line 507
    .line 508
    sput p1, LVa/P6;->U:I

    .line 509
    .line 510
    move p2, v1

    .line 511
    goto/16 :goto_5

    .line 512
    .line 513
    :sswitch_3
    const v0, 0xa7f3

    .line 514
    .line 515
    .line 516
    invoke-static {p2, p2}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 517
    .line 518
    .line 519
    move-result p2

    .line 520
    add-int/2addr p2, v0

    .line 521
    int-to-char p2, p2

    .line 522
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 523
    .line 524
    .line 525
    move-result-wide v3

    .line 526
    const-wide/16 v8, 0x0

    .line 527
    .line 528
    cmp-long v0, v3, v8

    .line 529
    .line 530
    rsub-int v0, v0, 0x4e2

    .line 531
    .line 532
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 533
    .line 534
    .line 535
    move-result v3

    .line 536
    cmpl-float v3, v3, v10

    .line 537
    .line 538
    add-int/2addr v3, v5

    .line 539
    invoke-static {v0, v3, p2}, LVa/P6;->I0(IIC)Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object p2

    .line 543
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object p2

    .line 547
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    move-result p1

    .line 551
    if-eqz p1, :cond_d

    .line 552
    .line 553
    sget p1, LVa/P6;->T:I

    .line 554
    .line 555
    add-int/lit8 p1, p1, 0x4f

    .line 556
    .line 557
    rem-int/lit16 p2, p1, 0x80

    .line 558
    .line 559
    sput p2, LVa/P6;->U:I

    .line 560
    .line 561
    rem-int/2addr p1, v1

    .line 562
    if-nez p1, :cond_e

    .line 563
    .line 564
    const/16 p2, 0x28

    .line 565
    .line 566
    goto/16 :goto_5

    .line 567
    .line 568
    :cond_e
    move p2, v7

    .line 569
    goto/16 :goto_5

    .line 570
    .line 571
    :sswitch_4
    const v0, 0xa492

    .line 572
    .line 573
    .line 574
    invoke-static {v9}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 575
    .line 576
    .line 577
    move-result v1

    .line 578
    add-int/2addr v1, v0

    .line 579
    int-to-char v0, v1

    .line 580
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 581
    .line 582
    .line 583
    move-result-wide v5

    .line 584
    const-wide/16 v7, -0x1

    .line 585
    .line 586
    cmp-long v1, v5, v7

    .line 587
    .line 588
    rsub-int v1, v1, 0x4ca

    .line 589
    .line 590
    invoke-static {p2, p2}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 591
    .line 592
    .line 593
    move-result p2

    .line 594
    add-int/2addr p2, v4

    .line 595
    invoke-static {v1, p2, v0}, LVa/P6;->I0(IIC)Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object p2

    .line 599
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object p2

    .line 603
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    move-result p1

    .line 607
    if-eqz p1, :cond_d

    .line 608
    .line 609
    const/4 p2, 0x4

    .line 610
    goto/16 :goto_5

    .line 611
    .line 612
    :sswitch_5
    invoke-static {v10, v10}, Landroid/graphics/PointF;->length(FF)F

    .line 613
    .line 614
    .line 615
    move-result p2

    .line 616
    cmpl-float p2, p2, v10

    .line 617
    .line 618
    const v0, 0x9188

    .line 619
    .line 620
    .line 621
    sub-int/2addr v0, p2

    .line 622
    int-to-char p2, v0

    .line 623
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 624
    .line 625
    .line 626
    move-result v0

    .line 627
    shr-int/lit8 v0, v0, 0x10

    .line 628
    .line 629
    rsub-int v0, v0, 0x4ce

    .line 630
    .line 631
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 632
    .line 633
    .line 634
    move-result v1

    .line 635
    shr-int/lit8 v1, v1, 0x10

    .line 636
    .line 637
    const/16 v3, 0xc

    .line 638
    .line 639
    invoke-static {v3, v1, p2, v0, p1}, LVa/M6;->B(IICILjava/lang/String;)Z

    .line 640
    .line 641
    .line 642
    move-result p1

    .line 643
    if-eqz p1, :cond_d

    .line 644
    .line 645
    move p2, v4

    .line 646
    goto/16 :goto_5

    .line 647
    .line 648
    :sswitch_6
    const v0, 0x8677

    .line 649
    .line 650
    .line 651
    invoke-static {p2}, Landroid/graphics/Color;->red(I)I

    .line 652
    .line 653
    .line 654
    move-result p2

    .line 655
    sub-int/2addr v0, p2

    .line 656
    int-to-char p2, v0

    .line 657
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 658
    .line 659
    .line 660
    move-result v0

    .line 661
    shr-int/lit8 v0, v0, 0x10

    .line 662
    .line 663
    rsub-int v0, v0, 0x4b0

    .line 664
    .line 665
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 666
    .line 667
    .line 668
    move-result v1

    .line 669
    shr-int/lit8 v1, v1, 0x10

    .line 670
    .line 671
    const/16 v4, 0xb

    .line 672
    .line 673
    invoke-static {v4, v1, p2, v0, p1}, LVa/M6;->B(IICILjava/lang/String;)Z

    .line 674
    .line 675
    .line 676
    move-result p1

    .line 677
    if-eqz p1, :cond_d

    .line 678
    .line 679
    move p2, v3

    .line 680
    goto :goto_5

    .line 681
    :sswitch_7
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 682
    .line 683
    .line 684
    move-result v0

    .line 685
    shr-int/lit8 v0, v0, 0x10

    .line 686
    .line 687
    int-to-char v0, v0

    .line 688
    invoke-static {p2}, Landroid/os/Process;->getThreadPriority(I)I

    .line 689
    .line 690
    .line 691
    move-result p2

    .line 692
    add-int/lit8 p2, p2, 0x14

    .line 693
    .line 694
    shr-int/2addr p2, v8

    .line 695
    rsub-int p2, p2, 0x4da

    .line 696
    .line 697
    invoke-static {v6}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 698
    .line 699
    .line 700
    move-result v1

    .line 701
    add-int/lit8 v1, v1, -0x29

    .line 702
    .line 703
    invoke-static {p2, v1, v0}, LVa/P6;->I0(IIC)Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object p2

    .line 707
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object p2

    .line 711
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 712
    .line 713
    .line 714
    move-result p1

    .line 715
    if-eqz p1, :cond_d

    .line 716
    .line 717
    move p2, v8

    .line 718
    goto :goto_5

    .line 719
    :sswitch_8
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 720
    .line 721
    .line 722
    move-result v0

    .line 723
    cmpl-float v0, v0, v10

    .line 724
    .line 725
    add-int/lit16 v0, v0, 0x9cb

    .line 726
    .line 727
    int-to-char v0, v0

    .line 728
    invoke-static {p2, p2, p2, p2}, Landroid/graphics/Color;->argb(IIII)I

    .line 729
    .line 730
    .line 731
    move-result p2

    .line 732
    add-int/lit16 p2, p2, 0x4ea

    .line 733
    .line 734
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 735
    .line 736
    .line 737
    move-result v4

    .line 738
    cmpl-float v4, v4, v10

    .line 739
    .line 740
    const/16 v6, 0xa

    .line 741
    .line 742
    invoke-static {v6, v4, v0, p2, p1}, LVa/M6;->B(IICILjava/lang/String;)Z

    .line 743
    .line 744
    .line 745
    move-result p1

    .line 746
    if-eqz p1, :cond_d

    .line 747
    .line 748
    sget p1, LVa/P6;->T:I

    .line 749
    .line 750
    add-int/2addr p1, v3

    .line 751
    rem-int/lit16 p2, p1, 0x80

    .line 752
    .line 753
    sput p2, LVa/P6;->U:I

    .line 754
    .line 755
    rem-int/2addr p1, v1

    .line 756
    if-nez p1, :cond_f

    .line 757
    .line 758
    const/16 p2, 0x5f

    .line 759
    .line 760
    goto :goto_5

    .line 761
    :cond_f
    move p2, v5

    .line 762
    :goto_5
    packed-switch p2, :pswitch_data_1

    .line 763
    .line 764
    .line 765
    goto :goto_6

    .line 766
    :pswitch_7
    sget-object v2, Lcom/unity3d/services/core/webview/WebViewEventCategory;->LIFECYCLE:Lcom/unity3d/services/core/webview/WebViewEventCategory;

    .line 767
    .line 768
    goto :goto_6

    .line 769
    :pswitch_8
    sget-object v2, Lcom/unity3d/services/core/webview/WebViewEventCategory;->BROADCAST:Lcom/unity3d/services/core/webview/WebViewEventCategory;

    .line 770
    .line 771
    goto :goto_6

    .line 772
    :pswitch_9
    sget-object v2, Lcom/unity3d/services/core/webview/WebViewEventCategory;->STORAGE:Lcom/unity3d/services/core/webview/WebViewEventCategory;

    .line 773
    .line 774
    goto :goto_6

    .line 775
    :pswitch_a
    sget-object v2, Lcom/unity3d/services/core/webview/WebViewEventCategory;->CONNECTIVITY:Lcom/unity3d/services/core/webview/WebViewEventCategory;

    .line 776
    .line 777
    goto :goto_6

    .line 778
    :pswitch_b
    sget-object v2, Lcom/unity3d/services/core/webview/WebViewEventCategory;->CACHE:Lcom/unity3d/services/core/webview/WebViewEventCategory;

    .line 779
    .line 780
    goto :goto_6

    .line 781
    :pswitch_c
    sget-object v2, Lcom/unity3d/services/core/webview/WebViewEventCategory;->RESOLVE:Lcom/unity3d/services/core/webview/WebViewEventCategory;

    .line 782
    .line 783
    goto :goto_6

    .line 784
    :pswitch_d
    sget-object v2, Lcom/unity3d/services/core/webview/WebViewEventCategory;->REQUEST:Lcom/unity3d/services/core/webview/WebViewEventCategory;

    .line 785
    .line 786
    goto :goto_6

    .line 787
    :pswitch_e
    sget-object v2, Lcom/unity3d/services/core/webview/WebViewEventCategory;->VIDEOPLAYER:Lcom/unity3d/services/core/webview/WebViewEventCategory;

    .line 788
    .line 789
    goto :goto_6

    .line 790
    :pswitch_f
    sget-object v2, Lcom/unity3d/services/core/webview/WebViewEventCategory;->ADUNIT:Lcom/unity3d/services/core/webview/WebViewEventCategory;

    .line 791
    .line 792
    :goto_6
    return-object v2

    .line 793
    :cond_10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 794
    .line 795
    .line 796
    throw v2

    .line 797
    :pswitch_10
    sget p1, LVa/P6;->U:I

    .line 798
    .line 799
    add-int/lit8 p1, p1, 0x5

    .line 800
    .line 801
    rem-int/lit16 p2, p1, 0x80

    .line 802
    .line 803
    sput p2, LVa/P6;->T:I

    .line 804
    .line 805
    rem-int/lit8 p1, p1, 0x2

    .line 806
    .line 807
    if-nez p1, :cond_11

    .line 808
    .line 809
    invoke-static {}, LVa/P6;->C0()Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object p1

    .line 813
    return-object p1

    .line 814
    :cond_11
    invoke-static {}, LVa/P6;->C0()Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    const/4 p1, 0x0

    .line 818
    throw p1

    .line 819
    :pswitch_11
    sget p1, LVa/P6;->T:I

    .line 820
    .line 821
    add-int/lit8 p1, p1, 0x41

    .line 822
    .line 823
    rem-int/lit16 p1, p1, 0x80

    .line 824
    .line 825
    sput p1, LVa/P6;->U:I

    .line 826
    .line 827
    invoke-static {}, Lcom/unity3d/services/core/properties/ClientProperties;->getGameId()Ljava/lang/String;

    .line 828
    .line 829
    .line 830
    move-result-object p1

    .line 831
    sget p2, LVa/P6;->T:I

    .line 832
    .line 833
    add-int/lit8 p2, p2, 0x9

    .line 834
    .line 835
    rem-int/lit16 p2, p2, 0x80

    .line 836
    .line 837
    sput p2, LVa/P6;->U:I

    .line 838
    .line 839
    return-object p1

    .line 840
    :pswitch_12
    const/4 p2, 0x0

    .line 841
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object p1

    .line 845
    check-cast p1, Lcom/unity3d/ads/core/data/model/AdObject;

    .line 846
    .line 847
    sget p2, LVa/P6;->T:I

    .line 848
    .line 849
    add-int/lit8 p2, p2, 0x4f

    .line 850
    .line 851
    rem-int/lit16 p2, p2, 0x80

    .line 852
    .line 853
    sput p2, LVa/P6;->U:I

    .line 854
    .line 855
    add-int/lit8 p2, p2, 0x19

    .line 856
    .line 857
    rem-int/lit16 v0, p2, 0x80

    .line 858
    .line 859
    sput v0, LVa/P6;->T:I

    .line 860
    .line 861
    rem-int/lit8 p2, p2, 0x2

    .line 862
    .line 863
    const/4 v0, 0x0

    .line 864
    invoke-virtual {p1}, Lcom/unity3d/ads/core/data/model/AdObject;->getTrackingToken()Lcom/google/protobuf/ByteString;

    .line 865
    .line 866
    .line 867
    move-result-object p1

    .line 868
    if-nez p2, :cond_13

    .line 869
    .line 870
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->toByteArray()[B

    .line 871
    .line 872
    .line 873
    move-result-object p1

    .line 874
    sget p2, LVa/P6;->T:I

    .line 875
    .line 876
    add-int/lit8 p2, p2, 0x71

    .line 877
    .line 878
    rem-int/lit16 v1, p2, 0x80

    .line 879
    .line 880
    sput v1, LVa/P6;->U:I

    .line 881
    .line 882
    rem-int/lit8 p2, p2, 0x2

    .line 883
    .line 884
    if-eqz p2, :cond_12

    .line 885
    .line 886
    add-int/lit8 v1, v1, 0x67

    .line 887
    .line 888
    rem-int/lit16 v1, v1, 0x80

    .line 889
    .line 890
    sput v1, LVa/P6;->T:I

    .line 891
    .line 892
    return-object p1

    .line 893
    :cond_12
    throw v0

    .line 894
    :cond_13
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->toByteArray()[B

    .line 895
    .line 896
    .line 897
    throw v0

    .line 898
    :pswitch_13
    const/4 p2, 0x0

    .line 899
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object p1

    .line 903
    sget v0, LVa/P6;->T:I

    .line 904
    .line 905
    add-int/lit8 v0, v0, 0x15

    .line 906
    .line 907
    rem-int/lit16 v0, v0, 0x80

    .line 908
    .line 909
    sput v0, LVa/P6;->U:I

    .line 910
    .line 911
    check-cast p1, LVa/O6;

    .line 912
    .line 913
    invoke-static {p1}, Lcom/unity3d/services/core/webview/WebViewApp;->setCurrentApp(Lcom/unity3d/services/core/webview/WebViewApp;)V

    .line 914
    .line 915
    .line 916
    sget p1, LVa/P6;->U:I

    .line 917
    .line 918
    add-int/lit8 p1, p1, 0x5d

    .line 919
    .line 920
    rem-int/lit16 v0, p1, 0x80

    .line 921
    .line 922
    sput v0, LVa/P6;->T:I

    .line 923
    .line 924
    rem-int/lit8 p1, p1, 0x2

    .line 925
    .line 926
    if-eqz p1, :cond_14

    .line 927
    .line 928
    const/16 p1, 0x32

    .line 929
    .line 930
    div-int/2addr p1, p2

    .line 931
    :cond_14
    const/4 p1, 0x0

    .line 932
    return-object p1

    .line 933
    :pswitch_14
    const/4 p2, 0x0

    .line 934
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 935
    .line 936
    .line 937
    move-result-object p1

    .line 938
    check-cast p1, Lcom/unity3d/ads/core/data/model/AdObject;

    .line 939
    .line 940
    sget p2, LVa/P6;->U:I

    .line 941
    .line 942
    add-int/lit8 p2, p2, 0x6d

    .line 943
    .line 944
    rem-int/lit16 v0, p2, 0x80

    .line 945
    .line 946
    sput v0, LVa/P6;->T:I

    .line 947
    .line 948
    rem-int/lit8 p2, p2, 0x2

    .line 949
    .line 950
    const/4 v0, 0x0

    .line 951
    if-nez p2, :cond_16

    .line 952
    .line 953
    invoke-static {p1}, LVa/P6;->G0(Lcom/unity3d/ads/core/data/model/AdObject;)Lcom/unity3d/ads/UnityAdsLoadOptions;

    .line 954
    .line 955
    .line 956
    move-result-object p1

    .line 957
    sget p2, LVa/P6;->U:I

    .line 958
    .line 959
    add-int/lit8 p2, p2, 0x41

    .line 960
    .line 961
    rem-int/lit16 v1, p2, 0x80

    .line 962
    .line 963
    sput v1, LVa/P6;->T:I

    .line 964
    .line 965
    rem-int/lit8 p2, p2, 0x2

    .line 966
    .line 967
    if-nez p2, :cond_15

    .line 968
    .line 969
    return-object p1

    .line 970
    :cond_15
    throw v0

    .line 971
    :cond_16
    invoke-static {p1}, LVa/P6;->G0(Lcom/unity3d/ads/core/data/model/AdObject;)Lcom/unity3d/ads/UnityAdsLoadOptions;

    .line 972
    .line 973
    .line 974
    throw v0

    .line 975
    :pswitch_15
    sget p1, LVa/F6;->T:I

    .line 976
    .line 977
    add-int/lit8 p1, p1, 0x45

    .line 978
    .line 979
    rem-int/lit16 p1, p1, 0x80

    .line 980
    .line 981
    sput p1, LVa/F6;->U:I

    .line 982
    .line 983
    invoke-static {}, LVa/F6;->C0()Lcom/qq/e/comm/managers/IGDTAdManager;

    .line 984
    .line 985
    .line 986
    move-result-object p1

    .line 987
    sget p2, LVa/F6;->U:I

    .line 988
    .line 989
    add-int/lit8 p2, p2, 0x65

    .line 990
    .line 991
    rem-int/lit16 v0, p2, 0x80

    .line 992
    .line 993
    sput v0, LVa/F6;->T:I

    .line 994
    .line 995
    rem-int/lit8 p2, p2, 0x2

    .line 996
    .line 997
    if-nez p2, :cond_17

    .line 998
    .line 999
    return-object p1

    .line 1000
    :cond_17
    const/4 p1, 0x0

    .line 1001
    throw p1

    .line 1002
    :pswitch_16
    sget p1, LVa/q6;->S:I

    .line 1003
    .line 1004
    add-int/lit8 p1, p1, 0x73

    .line 1005
    .line 1006
    rem-int/lit16 p1, p1, 0x80

    .line 1007
    .line 1008
    sput p1, LVa/q6;->T:I

    .line 1009
    .line 1010
    invoke-static {}, LVa/q6;->C0()Ltv/superawesome/sdk/publisher/SAInterface;

    .line 1011
    .line 1012
    .line 1013
    move-result-object p1

    .line 1014
    sget p2, LVa/q6;->S:I

    .line 1015
    .line 1016
    add-int/lit8 p2, p2, 0x57

    .line 1017
    .line 1018
    rem-int/lit16 p2, p2, 0x80

    .line 1019
    .line 1020
    sput p2, LVa/q6;->T:I

    .line 1021
    .line 1022
    return-object p1

    .line 1023
    :pswitch_17
    sget p1, LVa/h6;->U:I

    .line 1024
    .line 1025
    add-int/lit8 p1, p1, 0x33

    .line 1026
    .line 1027
    rem-int/lit16 p2, p1, 0x80

    .line 1028
    .line 1029
    sput p2, LVa/h6;->T:I

    .line 1030
    .line 1031
    rem-int/lit8 p1, p1, 0x2

    .line 1032
    .line 1033
    if-nez p1, :cond_18

    .line 1034
    .line 1035
    invoke-static {}, LVa/h6;->E0()Ljava/lang/String;

    .line 1036
    .line 1037
    .line 1038
    move-result-object p1

    .line 1039
    return-object p1

    .line 1040
    :cond_18
    invoke-static {}, LVa/h6;->E0()Ljava/lang/String;

    .line 1041
    .line 1042
    .line 1043
    const/4 p1, 0x0

    .line 1044
    throw p1

    .line 1045
    :pswitch_18
    sget p1, LVa/v5;->T:I

    .line 1046
    .line 1047
    add-int/lit8 p1, p1, 0x77

    .line 1048
    .line 1049
    rem-int/lit16 p2, p1, 0x80

    .line 1050
    .line 1051
    sput p2, LVa/v5;->U:I

    .line 1052
    .line 1053
    rem-int/lit8 p1, p1, 0x2

    .line 1054
    .line 1055
    if-nez p1, :cond_19

    .line 1056
    .line 1057
    invoke-static {}, LVa/v5;->C0()Lio/presage/Presage;

    .line 1058
    .line 1059
    .line 1060
    move-result-object p1

    .line 1061
    const/16 p2, 0x1d

    .line 1062
    .line 1063
    div-int/lit8 p2, p2, 0x0

    .line 1064
    .line 1065
    goto :goto_7

    .line 1066
    :cond_19
    invoke-static {}, LVa/v5;->C0()Lio/presage/Presage;

    .line 1067
    .line 1068
    .line 1069
    move-result-object p1

    .line 1070
    :goto_7
    sget p2, LVa/v5;->T:I

    .line 1071
    .line 1072
    add-int/lit8 p2, p2, 0x29

    .line 1073
    .line 1074
    rem-int/lit16 v0, p2, 0x80

    .line 1075
    .line 1076
    sput v0, LVa/v5;->U:I

    .line 1077
    .line 1078
    rem-int/lit8 p2, p2, 0x2

    .line 1079
    .line 1080
    if-eqz p2, :cond_1a

    .line 1081
    .line 1082
    return-object p1

    .line 1083
    :cond_1a
    const/4 p1, 0x0

    .line 1084
    throw p1

    .line 1085
    :pswitch_19
    sget p1, LVa/p5;->U:I

    .line 1086
    .line 1087
    add-int/lit8 p1, p1, 0x17

    .line 1088
    .line 1089
    rem-int/lit16 p1, p1, 0x80

    .line 1090
    .line 1091
    sput p1, LVa/p5;->T:I

    .line 1092
    .line 1093
    invoke-static {}, LVa/p5;->O0()Ljava/lang/String;

    .line 1094
    .line 1095
    .line 1096
    move-result-object p1

    .line 1097
    sget p2, LVa/p5;->U:I

    .line 1098
    .line 1099
    add-int/lit8 p2, p2, 0x2f

    .line 1100
    .line 1101
    rem-int/lit16 p2, p2, 0x80

    .line 1102
    .line 1103
    sput p2, LVa/p5;->T:I

    .line 1104
    .line 1105
    return-object p1

    .line 1106
    :pswitch_1a
    sget p1, LVa/z4;->W:I

    .line 1107
    .line 1108
    add-int/lit8 p1, p1, 0x65

    .line 1109
    .line 1110
    rem-int/lit16 p2, p1, 0x80

    .line 1111
    .line 1112
    sput p2, LVa/z4;->X:I

    .line 1113
    .line 1114
    rem-int/lit8 p1, p1, 0x2

    .line 1115
    .line 1116
    if-eqz p1, :cond_1b

    .line 1117
    .line 1118
    invoke-static {}, LVa/z4;->W0()Ljava/lang/Object;

    .line 1119
    .line 1120
    .line 1121
    move-result-object p1

    .line 1122
    sget p2, LVa/z4;->W:I

    .line 1123
    .line 1124
    add-int/lit8 p2, p2, 0x6f

    .line 1125
    .line 1126
    rem-int/lit16 p2, p2, 0x80

    .line 1127
    .line 1128
    sput p2, LVa/z4;->X:I

    .line 1129
    .line 1130
    return-object p1

    .line 1131
    :cond_1b
    invoke-static {}, LVa/z4;->W0()Ljava/lang/Object;

    .line 1132
    .line 1133
    .line 1134
    const/4 p1, 0x0

    .line 1135
    throw p1

    .line 1136
    :pswitch_1b
    sget p1, LVa/Z3;->X:I

    .line 1137
    .line 1138
    add-int/lit8 p1, p1, 0x65

    .line 1139
    .line 1140
    rem-int/lit16 p2, p1, 0x80

    .line 1141
    .line 1142
    sput p2, LVa/Z3;->W:I

    .line 1143
    .line 1144
    rem-int/lit8 p1, p1, 0x2

    .line 1145
    .line 1146
    if-eqz p1, :cond_1c

    .line 1147
    .line 1148
    invoke-static {}, LVa/Z3;->K0()Ljava/lang/Object;

    .line 1149
    .line 1150
    .line 1151
    move-result-object p1

    .line 1152
    const/16 p2, 0x3f

    .line 1153
    .line 1154
    div-int/lit8 p2, p2, 0x0

    .line 1155
    .line 1156
    goto :goto_8

    .line 1157
    :cond_1c
    invoke-static {}, LVa/Z3;->K0()Ljava/lang/Object;

    .line 1158
    .line 1159
    .line 1160
    move-result-object p1

    .line 1161
    :goto_8
    sget p2, LVa/Z3;->W:I

    .line 1162
    .line 1163
    add-int/lit8 p2, p2, 0x25

    .line 1164
    .line 1165
    rem-int/lit16 v0, p2, 0x80

    .line 1166
    .line 1167
    sput v0, LVa/Z3;->X:I

    .line 1168
    .line 1169
    rem-int/lit8 p2, p2, 0x2

    .line 1170
    .line 1171
    if-eqz p2, :cond_1d

    .line 1172
    .line 1173
    return-object p1

    .line 1174
    :cond_1d
    const/4 p1, 0x0

    .line 1175
    throw p1

    .line 1176
    :pswitch_1c
    const/4 p2, 0x0

    .line 1177
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1178
    .line 1179
    .line 1180
    move-result-object p1

    .line 1181
    check-cast p1, Lcom/moloco/sdk/publisher/Banner;

    .line 1182
    .line 1183
    sget v0, LVa/a1;->Z:I

    .line 1184
    .line 1185
    add-int/lit8 v0, v0, 0x23

    .line 1186
    .line 1187
    rem-int/lit16 v0, v0, 0x80

    .line 1188
    .line 1189
    sput v0, LVa/a1;->a0:I

    .line 1190
    .line 1191
    add-int/lit8 v0, v0, 0x5d

    .line 1192
    .line 1193
    rem-int/lit16 v0, v0, 0x80

    .line 1194
    .line 1195
    sput v0, LVa/a1;->Z:I

    .line 1196
    .line 1197
    invoke-virtual {p1}, Lcom/moloco/sdk/publisher/Banner;->getAdShowListener()Lcom/moloco/sdk/publisher/BannerAdShowListener;

    .line 1198
    .line 1199
    .line 1200
    move-result-object p1

    .line 1201
    sget v0, LVa/a1;->a0:I

    .line 1202
    .line 1203
    add-int/lit8 v0, v0, 0x4b

    .line 1204
    .line 1205
    rem-int/lit16 v1, v0, 0x80

    .line 1206
    .line 1207
    sput v1, LVa/a1;->Z:I

    .line 1208
    .line 1209
    rem-int/lit8 v0, v0, 0x2

    .line 1210
    .line 1211
    if-eqz v0, :cond_1e

    .line 1212
    .line 1213
    const/16 v0, 0x30

    .line 1214
    .line 1215
    div-int/2addr v0, p2

    .line 1216
    :cond_1e
    return-object p1

    .line 1217
    :pswitch_1d
    const/4 p2, 0x0

    .line 1218
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1219
    .line 1220
    .line 1221
    move-result-object p2

    .line 1222
    check-cast p2, Lcom/moloco/sdk/publisher/Banner;

    .line 1223
    .line 1224
    const/4 v0, 0x1

    .line 1225
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1226
    .line 1227
    .line 1228
    move-result-object p1

    .line 1229
    check-cast p1, Lcom/moloco/sdk/publisher/BannerAdShowListener;

    .line 1230
    .line 1231
    sget v0, LVa/a1;->a0:I

    .line 1232
    .line 1233
    add-int/lit8 v0, v0, 0x27

    .line 1234
    .line 1235
    rem-int/lit16 v0, v0, 0x80

    .line 1236
    .line 1237
    sput v0, LVa/a1;->Z:I

    .line 1238
    .line 1239
    add-int/lit8 v0, v0, 0x43

    .line 1240
    .line 1241
    rem-int/lit16 v0, v0, 0x80

    .line 1242
    .line 1243
    sput v0, LVa/a1;->a0:I

    .line 1244
    .line 1245
    invoke-virtual {p2, p1}, Lcom/moloco/sdk/publisher/Banner;->setAdShowListener(Lcom/moloco/sdk/publisher/BannerAdShowListener;)V

    .line 1246
    .line 1247
    .line 1248
    sget p1, LVa/a1;->a0:I

    .line 1249
    .line 1250
    add-int/lit8 p2, p1, 0x47

    .line 1251
    .line 1252
    rem-int/lit16 v0, p2, 0x80

    .line 1253
    .line 1254
    sput v0, LVa/a1;->Z:I

    .line 1255
    .line 1256
    rem-int/lit8 p2, p2, 0x2

    .line 1257
    .line 1258
    const/4 v0, 0x0

    .line 1259
    if-nez p2, :cond_20

    .line 1260
    .line 1261
    add-int/lit8 p1, p1, 0x53

    .line 1262
    .line 1263
    rem-int/lit16 p2, p1, 0x80

    .line 1264
    .line 1265
    sput p2, LVa/a1;->Z:I

    .line 1266
    .line 1267
    rem-int/lit8 p1, p1, 0x2

    .line 1268
    .line 1269
    if-nez p1, :cond_1f

    .line 1270
    .line 1271
    return-object v0

    .line 1272
    :cond_1f
    throw v0

    .line 1273
    :cond_20
    throw v0

    .line 1274
    :pswitch_1e
    sget p1, LVa/a1;->Z:I

    .line 1275
    .line 1276
    add-int/lit8 p1, p1, 0x23

    .line 1277
    .line 1278
    rem-int/lit16 p2, p1, 0x80

    .line 1279
    .line 1280
    sput p2, LVa/a1;->a0:I

    .line 1281
    .line 1282
    rem-int/lit8 p1, p1, 0x2

    .line 1283
    .line 1284
    if-nez p1, :cond_21

    .line 1285
    .line 1286
    invoke-static {}, LVa/a1;->C0()Lcom/moloco/sdk/publisher/Moloco;

    .line 1287
    .line 1288
    .line 1289
    move-result-object p1

    .line 1290
    const/16 p2, 0x3f

    .line 1291
    .line 1292
    div-int/lit8 p2, p2, 0x0

    .line 1293
    .line 1294
    goto :goto_9

    .line 1295
    :cond_21
    invoke-static {}, LVa/a1;->C0()Lcom/moloco/sdk/publisher/Moloco;

    .line 1296
    .line 1297
    .line 1298
    move-result-object p1

    .line 1299
    :goto_9
    return-object p1

    .line 1300
    nop

    .line 1301
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1e
        :pswitch_1d
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
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    :sswitch_data_0
    .sparse-switch
        -0x6bed08b6 -> :sswitch_8
        -0x458431a5 -> :sswitch_7
        -0x107e4504 -> :sswitch_6
        -0x33dae49 -> :sswitch_5
        0x3ceb762 -> :sswitch_4
        0x4599f8a1 -> :sswitch_3
        0x6c1a7e6f -> :sswitch_2
        0x6c340dcc -> :sswitch_1
        0x72d11027 -> :sswitch_0
    .end sparse-switch

    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch
.end method
