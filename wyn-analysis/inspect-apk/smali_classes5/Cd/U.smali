.class public final synthetic LCd/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LCd/U;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LCd/U;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljf/h;

    .line 7
    .line 8
    check-cast p2, Ljf/f;

    .line 9
    .line 10
    const-string v0, "acc"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "element"

    .line 16
    .line 17
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p2}, Ljf/f;->getKey()Ljf/g;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {p1, v0}, Ljf/h;->minusKey(Ljf/g;)Ljf/h;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sget-object v0, Ljf/i;->a:Ljf/i;

    .line 29
    .line 30
    if-ne p1, v0, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    sget-object v1, Ljf/d;->a:Ljf/d;

    .line 34
    .line 35
    invoke-interface {p1, v1}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Ljf/e;

    .line 40
    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    new-instance v0, Ljf/b;

    .line 44
    .line 45
    invoke-direct {v0, p2, p1}, Ljf/b;-><init>(Ljf/f;Ljf/h;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    move-object p2, v0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-interface {p1, v1}, Ljf/h;->minusKey(Ljf/g;)Ljf/h;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-ne p1, v0, :cond_2

    .line 55
    .line 56
    new-instance p1, Ljf/b;

    .line 57
    .line 58
    invoke-direct {p1, v2, p2}, Ljf/b;-><init>(Ljf/f;Ljf/h;)V

    .line 59
    .line 60
    .line 61
    move-object p2, p1

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    new-instance v0, Ljf/b;

    .line 64
    .line 65
    new-instance v1, Ljf/b;

    .line 66
    .line 67
    invoke-direct {v1, p2, p1}, Ljf/b;-><init>(Ljf/f;Ljf/h;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v0, v2, v1}, Ljf/b;-><init>(Ljf/f;Ljf/h;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :goto_1
    return-object p2

    .line 75
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 76
    .line 77
    check-cast p2, Ljf/f;

    .line 78
    .line 79
    const-string v0, "acc"

    .line 80
    .line 81
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const-string v0, "element"

    .line 85
    .line 86
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_3

    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    goto :goto_2

    .line 100
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string p1, ", "

    .line 109
    .line 110
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    :goto_2
    return-object p1

    .line 121
    :pswitch_1
    check-cast p1, Landroid/content/pm/PackageManager;

    .line 122
    .line 123
    check-cast p2, Landroid/content/Intent;

    .line 124
    .line 125
    const-string v0, "pm"

    .line 126
    .line 127
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    const-string v0, "i"

    .line 131
    .line 132
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, p1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-eqz p1, :cond_4

    .line 140
    .line 141
    const/4 p1, 0x1

    .line 142
    goto :goto_3

    .line 143
    :cond_4
    const/4 p1, 0x0

    .line 144
    :goto_3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    return-object p1

    .line 149
    :pswitch_2
    check-cast p1, LCd/d0;

    .line 150
    .line 151
    check-cast p2, Ljava/lang/Integer;

    .line 152
    .line 153
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 154
    .line 155
    .line 156
    const-string p2, "$this$delayMillis"

    .line 157
    .line 158
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    const-wide/16 p1, 0x64

    .line 162
    .line 163
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    return-object p1

    .line 168
    :pswitch_3
    check-cast p1, LCd/d0;

    .line 169
    .line 170
    check-cast p2, Ljava/lang/Integer;

    .line 171
    .line 172
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 173
    .line 174
    .line 175
    const-string p2, "$this$delayMillis"

    .line 176
    .line 177
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    const-wide/16 p1, 0x64

    .line 181
    .line 182
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    return-object p1

    .line 187
    :pswitch_4
    check-cast p1, Lcom/moloco/sdk/publisher/InterstitialAd;

    .line 188
    .line 189
    check-cast p2, Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;

    .line 190
    .line 191
    invoke-static {p1, p2}, Lcom/moloco/sdk/publisher/MolocoSamplesKt;->c(Lcom/moloco/sdk/publisher/InterstitialAd;Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;)Lef/C;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    return-object p1

    .line 196
    :pswitch_5
    check-cast p1, Lcom/moloco/sdk/publisher/NativeAd;

    .line 197
    .line 198
    check-cast p2, Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;

    .line 199
    .line 200
    invoke-static {p1, p2}, Lcom/moloco/sdk/publisher/MolocoSamplesKt;->e(Lcom/moloco/sdk/publisher/NativeAd;Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;)Lef/C;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    return-object p1

    .line 205
    :pswitch_6
    check-cast p1, Lcom/moloco/sdk/publisher/RewardedInterstitialAd;

    .line 206
    .line 207
    check-cast p2, Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;

    .line 208
    .line 209
    invoke-static {p1, p2}, Lcom/moloco/sdk/publisher/MolocoSamplesKt;->h(Lcom/moloco/sdk/publisher/RewardedInterstitialAd;Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;)Lef/C;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    return-object p1

    .line 214
    :pswitch_7
    check-cast p1, Lkotlin/reflect/KClass;

    .line 215
    .line 216
    check-cast p2, Ljava/util/List;

    .line 217
    .line 218
    const-string v0, "clazz"

    .line 219
    .line 220
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    const-string v0, "types"

    .line 224
    .line 225
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    const/4 v0, 0x1

    .line 229
    sget-object v1, LZf/a;->a:Lza/a;

    .line 230
    .line 231
    invoke-static {v1, p2, v0}, Lcom/moloco/sdk/internal/publisher/H;->p0(Lza/a;Ljava/util/List;Z)Ljava/util/ArrayList;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    new-instance v1, LSf/g;

    .line 239
    .line 240
    const/4 v2, 0x1

    .line 241
    invoke-direct {v1, v2, p2}, LSf/g;-><init>(ILjava/util/List;)V

    .line 242
    .line 243
    .line 244
    invoke-static {p1, v0, v1}, Lcom/moloco/sdk/internal/publisher/H;->g0(Lkotlin/reflect/KClass;Ljava/util/ArrayList;Ltf/a;)Lkotlinx/serialization/KSerializer;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    if-eqz p1, :cond_5

    .line 249
    .line 250
    invoke-static {p1}, Lff/B;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    goto :goto_4

    .line 255
    :cond_5
    const/4 p1, 0x0

    .line 256
    :goto_4
    return-object p1

    .line 257
    :pswitch_8
    check-cast p1, Lkotlin/reflect/KClass;

    .line 258
    .line 259
    check-cast p2, Ljava/util/List;

    .line 260
    .line 261
    const-string v0, "clazz"

    .line 262
    .line 263
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    const-string v0, "types"

    .line 267
    .line 268
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    const/4 v0, 0x1

    .line 272
    sget-object v1, LZf/a;->a:Lza/a;

    .line 273
    .line 274
    invoke-static {v1, p2, v0}, Lcom/moloco/sdk/internal/publisher/H;->p0(Lza/a;Ljava/util/List;Z)Ljava/util/ArrayList;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    new-instance v1, LSf/g;

    .line 282
    .line 283
    const/4 v2, 0x0

    .line 284
    invoke-direct {v1, v2, p2}, LSf/g;-><init>(ILjava/util/List;)V

    .line 285
    .line 286
    .line 287
    invoke-static {p1, v0, v1}, Lcom/moloco/sdk/internal/publisher/H;->g0(Lkotlin/reflect/KClass;Ljava/util/ArrayList;Ltf/a;)Lkotlinx/serialization/KSerializer;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    return-object p1

    .line 292
    :pswitch_9
    check-cast p1, LJd/s;

    .line 293
    .line 294
    check-cast p2, Ljava/lang/Integer;

    .line 295
    .line 296
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 297
    .line 298
    .line 299
    move-result p2

    .line 300
    const-string v0, "m"

    .line 301
    .line 302
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    iget-object p1, p1, LJd/s;->a:Ljava/lang/String;

    .line 306
    .line 307
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 308
    .line 309
    .line 310
    move-result p1

    .line 311
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    return-object p1

    .line 316
    :pswitch_a
    check-cast p1, Ljava/lang/CharSequence;

    .line 317
    .line 318
    check-cast p2, Ljava/lang/Integer;

    .line 319
    .line 320
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 321
    .line 322
    .line 323
    move-result p2

    .line 324
    const-string v0, "s"

    .line 325
    .line 326
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 330
    .line 331
    .line 332
    move-result p1

    .line 333
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    return-object p1

    .line 338
    :pswitch_b
    check-cast p1, LJf/x;

    .line 339
    .line 340
    check-cast p2, Ljf/f;

    .line 341
    .line 342
    instance-of v0, p2, LJf/u;

    .line 343
    .line 344
    if-eqz v0, :cond_6

    .line 345
    .line 346
    check-cast p2, LJf/u;

    .line 347
    .line 348
    iget-object v0, p1, LJf/x;->a:Ljf/h;

    .line 349
    .line 350
    invoke-virtual {p2, v0}, LJf/u;->b(Ljf/h;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    iget v1, p1, LJf/x;->d:I

    .line 355
    .line 356
    iget-object v2, p1, LJf/x;->b:[Ljava/lang/Object;

    .line 357
    .line 358
    aput-object v0, v2, v1

    .line 359
    .line 360
    add-int/lit8 v0, v1, 0x1

    .line 361
    .line 362
    iput v0, p1, LJf/x;->d:I

    .line 363
    .line 364
    iget-object v0, p1, LJf/x;->c:[LJf/u;

    .line 365
    .line 366
    aput-object p2, v0, v1

    .line 367
    .line 368
    :cond_6
    return-object p1

    .line 369
    :pswitch_c
    check-cast p1, LJf/u;

    .line 370
    .line 371
    check-cast p2, Ljf/f;

    .line 372
    .line 373
    if-eqz p1, :cond_7

    .line 374
    .line 375
    goto :goto_5

    .line 376
    :cond_7
    instance-of p1, p2, LJf/u;

    .line 377
    .line 378
    if-eqz p1, :cond_8

    .line 379
    .line 380
    move-object p1, p2

    .line 381
    check-cast p1, LJf/u;

    .line 382
    .line 383
    goto :goto_5

    .line 384
    :cond_8
    const/4 p1, 0x0

    .line 385
    :goto_5
    return-object p1

    .line 386
    :pswitch_d
    check-cast p2, Ljf/f;

    .line 387
    .line 388
    instance-of v0, p2, LJf/u;

    .line 389
    .line 390
    if-eqz v0, :cond_c

    .line 391
    .line 392
    instance-of v0, p1, Ljava/lang/Integer;

    .line 393
    .line 394
    if-eqz v0, :cond_9

    .line 395
    .line 396
    check-cast p1, Ljava/lang/Integer;

    .line 397
    .line 398
    goto :goto_6

    .line 399
    :cond_9
    const/4 p1, 0x0

    .line 400
    :goto_6
    const/4 v0, 0x1

    .line 401
    if-eqz p1, :cond_a

    .line 402
    .line 403
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 404
    .line 405
    .line 406
    move-result p1

    .line 407
    goto :goto_7

    .line 408
    :cond_a
    move p1, v0

    .line 409
    :goto_7
    if-nez p1, :cond_b

    .line 410
    .line 411
    move-object p1, p2

    .line 412
    goto :goto_8

    .line 413
    :cond_b
    add-int/2addr p1, v0

    .line 414
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    :cond_c
    :goto_8
    return-object p1

    .line 419
    :pswitch_e
    check-cast p1, Ljava/lang/Integer;

    .line 420
    .line 421
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 422
    .line 423
    .line 424
    move-result p1

    .line 425
    check-cast p2, Ljf/f;

    .line 426
    .line 427
    add-int/lit8 p1, p1, 0x1

    .line 428
    .line 429
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 430
    .line 431
    .line 432
    move-result-object p1

    .line 433
    return-object p1

    .line 434
    :pswitch_f
    check-cast p1, Ljf/h;

    .line 435
    .line 436
    check-cast p2, Ljf/f;

    .line 437
    .line 438
    invoke-interface {p1, p2}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    return-object p1

    .line 443
    :pswitch_10
    check-cast p1, Ljf/h;

    .line 444
    .line 445
    check-cast p2, Ljf/f;

    .line 446
    .line 447
    invoke-interface {p1, p2}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 448
    .line 449
    .line 450
    move-result-object p1

    .line 451
    return-object p1

    .line 452
    :pswitch_11
    check-cast p1, Ljava/lang/Boolean;

    .line 453
    .line 454
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 455
    .line 456
    .line 457
    check-cast p2, Ljf/f;

    .line 458
    .line 459
    return-object p1

    .line 460
    :pswitch_12
    check-cast p1, LCd/f0;

    .line 461
    .line 462
    check-cast p2, LFd/c;

    .line 463
    .line 464
    const-string v0, "<this>"

    .line 465
    .line 466
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    const-string p1, "it"

    .line 470
    .line 471
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    sget-object p1, Lef/C;->a:Lef/C;

    .line 475
    .line 476
    return-object p1

    .line 477
    :pswitch_data_0
    .packed-switch 0x0
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
