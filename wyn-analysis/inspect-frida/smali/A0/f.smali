.class public final synthetic LA0/f;
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
    iput p1, p0, LA0/f;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .line 1
    iget v0, p0, LA0/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2}, Lorg/apache/tika/utils/CompareUtils;->compareClassName(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    check-cast p1, Lorg/apache/tika/language/detect/LanguageDetector;

    .line 12
    .line 13
    check-cast p2, Lorg/apache/tika/language/detect/LanguageDetector;

    .line 14
    .line 15
    invoke-static {p1, p2}, Lorg/apache/tika/utils/CompareUtils;->compareClassName(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :pswitch_1
    check-cast p1, Lorg/apache/tika/language/translate/Translator;

    .line 21
    .line 22
    check-cast p2, Lorg/apache/tika/language/translate/Translator;

    .line 23
    .line 24
    invoke-static {p1, p2}, Lorg/apache/tika/utils/CompareUtils;->compareClassName(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1

    .line 29
    :pswitch_2
    check-cast p1, Lo2/q;

    .line 30
    .line 31
    check-cast p2, Lo2/q;

    .line 32
    .line 33
    iget p1, p1, Lo2/q;->c:F

    .line 34
    .line 35
    iget p2, p2, Lo2/q;->c:F

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
    :pswitch_3
    check-cast p1, Lo2/q;

    .line 43
    .line 44
    check-cast p2, Lo2/q;

    .line 45
    .line 46
    iget p1, p1, Lo2/q;->a:I

    .line 47
    .line 48
    iget p2, p2, Lo2/q;->a:I

    .line 49
    .line 50
    sub-int/2addr p1, p2

    .line 51
    return p1

    .line 52
    :pswitch_4
    check-cast p1, Ln2/n;

    .line 53
    .line 54
    check-cast p2, Ln2/n;

    .line 55
    .line 56
    iget-boolean v0, p1, Ln2/n;->e:Z

    .line 57
    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    iget-boolean v0, p1, Ln2/n;->h:Z

    .line 61
    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    sget-object v0, Ln2/o;->j:Ll8/d0;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    sget-object v0, Ln2/o;->j:Ll8/d0;

    .line 68
    .line 69
    invoke-virtual {v0}, Ll8/d0;->a()Ll8/d0;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    :goto_0
    sget-object v1, Ll8/A;->a:Ll8/y;

    .line 74
    .line 75
    iget-object v2, p1, Ln2/n;->f:Ln2/i;

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget v2, p1, Ln2/n;->k:I

    .line 81
    .line 82
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    iget v3, p2, Ln2/n;->k:I

    .line 87
    .line 88
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v1, v2, v3, v0}, Ll8/A;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll8/A;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    iget p1, p1, Ln2/n;->j:I

    .line 97
    .line 98
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iget p2, p2, Ln2/n;->j:I

    .line 103
    .line 104
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {v1, p1, p2, v0}, Ll8/A;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll8/A;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p1}, Ll8/A;->e()I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    return p1

    .line 117
    :pswitch_5
    check-cast p1, Ln2/n;

    .line 118
    .line 119
    check-cast p2, Ln2/n;

    .line 120
    .line 121
    invoke-static {p1, p2}, Ln2/n;->c(Ln2/n;Ln2/n;)I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    return p1

    .line 126
    :pswitch_6
    check-cast p1, Ljava/util/List;

    .line 127
    .line 128
    check-cast p2, Ljava/util/List;

    .line 129
    .line 130
    const/4 v0, 0x0

    .line 131
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, Ln2/k;

    .line 136
    .line 137
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    check-cast p2, Ln2/k;

    .line 142
    .line 143
    invoke-virtual {p1, p2}, Ln2/k;->c(Ln2/k;)I

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    return p1

    .line 148
    :pswitch_7
    check-cast p1, Ljava/util/List;

    .line 149
    .line 150
    check-cast p2, Ljava/util/List;

    .line 151
    .line 152
    new-instance v0, LA0/f;

    .line 153
    .line 154
    const/16 v1, 0x17

    .line 155
    .line 156
    invoke-direct {v0, v1}, LA0/f;-><init>(I)V

    .line 157
    .line 158
    .line 159
    invoke-static {p1, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    check-cast v0, Ln2/n;

    .line 164
    .line 165
    new-instance v1, LA0/f;

    .line 166
    .line 167
    const/16 v2, 0x17

    .line 168
    .line 169
    invoke-direct {v1, v2}, LA0/f;-><init>(I)V

    .line 170
    .line 171
    .line 172
    invoke-static {p2, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    check-cast v1, Ln2/n;

    .line 177
    .line 178
    invoke-static {v0, v1}, Ln2/n;->c(Ln2/n;Ln2/n;)I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    invoke-static {v0}, Ll8/y;->f(I)Ll8/A;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    invoke-virtual {v0, v1, v2}, Ll8/A;->a(II)Ll8/A;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    new-instance v1, LA0/f;

    .line 199
    .line 200
    const/16 v2, 0x18

    .line 201
    .line 202
    invoke-direct {v1, v2}, LA0/f;-><init>(I)V

    .line 203
    .line 204
    .line 205
    invoke-static {p1, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    check-cast p1, Ln2/n;

    .line 210
    .line 211
    new-instance v1, LA0/f;

    .line 212
    .line 213
    const/16 v2, 0x18

    .line 214
    .line 215
    invoke-direct {v1, v2}, LA0/f;-><init>(I)V

    .line 216
    .line 217
    .line 218
    invoke-static {p2, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    check-cast p2, Ln2/n;

    .line 223
    .line 224
    new-instance v1, LA0/f;

    .line 225
    .line 226
    const/16 v2, 0x18

    .line 227
    .line 228
    invoke-direct {v1, v2}, LA0/f;-><init>(I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0, p1, p2, v1}, Ll8/A;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll8/A;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-virtual {p1}, Ll8/A;->e()I

    .line 236
    .line 237
    .line 238
    move-result p1

    .line 239
    return p1

    .line 240
    :pswitch_8
    check-cast p1, Ljava/util/List;

    .line 241
    .line 242
    check-cast p2, Ljava/util/List;

    .line 243
    .line 244
    invoke-static {p1}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    check-cast p1, Ln2/e;

    .line 249
    .line 250
    invoke-static {p2}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p2

    .line 254
    check-cast p2, Ln2/e;

    .line 255
    .line 256
    invoke-virtual {p1, p2}, Ln2/e;->c(Ln2/e;)I

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    return p1

    .line 261
    :pswitch_9
    check-cast p1, Ljava/util/List;

    .line 262
    .line 263
    check-cast p2, Ljava/util/List;

    .line 264
    .line 265
    const/4 v0, 0x0

    .line 266
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    check-cast p1, Ln2/f;

    .line 271
    .line 272
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object p2

    .line 276
    check-cast p2, Ln2/f;

    .line 277
    .line 278
    iget p1, p1, Ln2/f;->f:I

    .line 279
    .line 280
    iget p2, p2, Ln2/f;->f:I

    .line 281
    .line 282
    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    .line 283
    .line 284
    .line 285
    move-result p1

    .line 286
    return p1

    .line 287
    :pswitch_a
    check-cast p1, Ljava/lang/Integer;

    .line 288
    .line 289
    check-cast p2, Ljava/lang/Integer;

    .line 290
    .line 291
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    const/4 v1, -0x1

    .line 296
    if-ne v0, v1, :cond_1

    .line 297
    .line 298
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 299
    .line 300
    .line 301
    move-result p1

    .line 302
    if-ne p1, v1, :cond_3

    .line 303
    .line 304
    const/4 v1, 0x0

    .line 305
    goto :goto_1

    .line 306
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-ne v0, v1, :cond_2

    .line 311
    .line 312
    const/4 v1, 0x1

    .line 313
    goto :goto_1

    .line 314
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 315
    .line 316
    .line 317
    move-result p1

    .line 318
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 319
    .line 320
    .line 321
    move-result p2

    .line 322
    sub-int v1, p1, p2

    .line 323
    .line 324
    :cond_3
    :goto_1
    return v1

    .line 325
    :pswitch_b
    check-cast p1, LN1/n;

    .line 326
    .line 327
    check-cast p2, LN1/n;

    .line 328
    .line 329
    iget p2, p2, LN1/n;->j:I

    .line 330
    .line 331
    iget p1, p1, LN1/n;->j:I

    .line 332
    .line 333
    sub-int/2addr p2, p1

    .line 334
    return p2

    .line 335
    :pswitch_c
    check-cast p1, Li6/d;

    .line 336
    .line 337
    check-cast p2, Li6/d;

    .line 338
    .line 339
    iget p2, p2, Li6/d;->b:I

    .line 340
    .line 341
    iget p1, p1, Li6/d;->b:I

    .line 342
    .line 343
    invoke-static {p2, p1}, Ljava/lang/Integer;->compare(II)I

    .line 344
    .line 345
    .line 346
    move-result p1

    .line 347
    return p1

    .line 348
    :pswitch_d
    check-cast p1, [B

    .line 349
    .line 350
    check-cast p2, [B

    .line 351
    .line 352
    array-length v0, p1

    .line 353
    array-length v1, p2

    .line 354
    if-eq v0, v1, :cond_4

    .line 355
    .line 356
    array-length p1, p1

    .line 357
    array-length p2, p2

    .line 358
    sub-int/2addr p1, p2

    .line 359
    goto :goto_3

    .line 360
    :cond_4
    const/4 v0, 0x0

    .line 361
    move v1, v0

    .line 362
    :goto_2
    array-length v2, p1

    .line 363
    if-ge v1, v2, :cond_6

    .line 364
    .line 365
    aget-byte v2, p1, v1

    .line 366
    .line 367
    aget-byte v3, p2, v1

    .line 368
    .line 369
    if-eq v2, v3, :cond_5

    .line 370
    .line 371
    sub-int p1, v2, v3

    .line 372
    .line 373
    goto :goto_3

    .line 374
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 375
    .line 376
    goto :goto_2

    .line 377
    :cond_6
    move p1, v0

    .line 378
    :goto_3
    return p1

    .line 379
    :pswitch_e
    check-cast p1, Lg2/j;

    .line 380
    .line 381
    check-cast p2, Lg2/j;

    .line 382
    .line 383
    iget-object p1, p1, Lg2/j;->a:Lg2/i;

    .line 384
    .line 385
    iget p1, p1, Lg2/i;->c:I

    .line 386
    .line 387
    iget-object p2, p2, Lg2/j;->a:Lg2/i;

    .line 388
    .line 389
    iget p2, p2, Lg2/i;->c:I

    .line 390
    .line 391
    invoke-static {p1, p2}, Lg2/k;->b(II)I

    .line 392
    .line 393
    .line 394
    move-result p1

    .line 395
    return p1

    .line 396
    :pswitch_f
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/q;

    .line 397
    .line 398
    check-cast p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/q;

    .line 399
    .line 400
    iget-object p1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/q;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/I;

    .line 401
    .line 402
    iget-object p2, p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/q;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/I;

    .line 403
    .line 404
    invoke-static {p2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    invoke-static {p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/G;->i(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/I;)I

    .line 408
    .line 409
    .line 410
    move-result p2

    .line 411
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    invoke-static {p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/G;->i(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/I;)I

    .line 415
    .line 416
    .line 417
    move-result p1

    .line 418
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->g(II)I

    .line 419
    .line 420
    .line 421
    move-result p1

    .line 422
    return p1

    .line 423
    :pswitch_10
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/I;

    .line 424
    .line 425
    check-cast p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/I;

    .line 426
    .line 427
    invoke-static {p2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    invoke-static {p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/G;->i(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/I;)I

    .line 431
    .line 432
    .line 433
    move-result p2

    .line 434
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    invoke-static {p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/G;->i(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/I;)I

    .line 438
    .line 439
    .line 440
    move-result p1

    .line 441
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->g(II)I

    .line 442
    .line 443
    .line 444
    move-result p1

    .line 445
    return p1

    .line 446
    :pswitch_11
    check-cast p1, Lcom/applovin/impl/d8;

    .line 447
    .line 448
    check-cast p2, Lcom/applovin/impl/d8;

    .line 449
    .line 450
    invoke-static {p1, p2}, Lcom/applovin/impl/c8;->b(Lcom/applovin/impl/d8;Lcom/applovin/impl/d8;)I

    .line 451
    .line 452
    .line 453
    move-result p1

    .line 454
    return p1

    .line 455
    :pswitch_12
    check-cast p1, Ljava/io/File;

    .line 456
    .line 457
    check-cast p2, Ljava/io/File;

    .line 458
    .line 459
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object p1

    .line 463
    sget v0, LX8/a;->f:I

    .line 464
    .line 465
    const/4 v1, 0x0

    .line 466
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object p1

    .line 470
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object p2

    .line 474
    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object p2

    .line 478
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 479
    .line 480
    .line 481
    move-result p1

    .line 482
    return p1

    .line 483
    :pswitch_13
    check-cast p1, Ljava/io/File;

    .line 484
    .line 485
    check-cast p2, Ljava/io/File;

    .line 486
    .line 487
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object p2

    .line 491
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object p1

    .line 495
    invoke-virtual {p2, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 496
    .line 497
    .line 498
    move-result p1

    .line 499
    return p1

    .line 500
    :pswitch_14
    check-cast p1, LX2/d;

    .line 501
    .line 502
    check-cast p2, LX2/d;

    .line 503
    .line 504
    iget-wide v0, p1, LX2/d;->b:J

    .line 505
    .line 506
    iget-wide p1, p2, LX2/d;->b:J

    .line 507
    .line 508
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compare(JJ)I

    .line 509
    .line 510
    .line 511
    move-result p1

    .line 512
    return p1

    .line 513
    :pswitch_15
    check-cast p1, LX2/e;

    .line 514
    .line 515
    check-cast p2, LX2/e;

    .line 516
    .line 517
    iget-object p1, p1, LX2/e;->a:LX2/f;

    .line 518
    .line 519
    iget p1, p1, LX2/f;->b:I

    .line 520
    .line 521
    iget-object p2, p2, LX2/e;->a:LX2/f;

    .line 522
    .line 523
    iget p2, p2, LX2/f;->b:I

    .line 524
    .line 525
    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    .line 526
    .line 527
    .line 528
    move-result p1

    .line 529
    return p1

    .line 530
    :pswitch_16
    check-cast p1, LY1/b;

    .line 531
    .line 532
    check-cast p2, LY1/b;

    .line 533
    .line 534
    iget v0, p1, LY1/b;->c:I

    .line 535
    .line 536
    iget v1, p2, LY1/b;->c:I

    .line 537
    .line 538
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    .line 539
    .line 540
    .line 541
    move-result v0

    .line 542
    if-eqz v0, :cond_7

    .line 543
    .line 544
    goto :goto_4

    .line 545
    :cond_7
    iget-object p1, p1, LY1/b;->b:Ljava/lang/String;

    .line 546
    .line 547
    iget-object p2, p2, LY1/b;->b:Ljava/lang/String;

    .line 548
    .line 549
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 550
    .line 551
    .line 552
    move-result v0

    .line 553
    :goto_4
    return v0

    .line 554
    :pswitch_17
    check-cast p1, LU8/s0;

    .line 555
    .line 556
    check-cast p2, LU8/s0;

    .line 557
    .line 558
    check-cast p1, LU8/G;

    .line 559
    .line 560
    iget-object p1, p1, LU8/G;->a:Ljava/lang/String;

    .line 561
    .line 562
    check-cast p2, LU8/G;

    .line 563
    .line 564
    iget-object p2, p2, LU8/G;->a:Ljava/lang/String;

    .line 565
    .line 566
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 567
    .line 568
    .line 569
    move-result p1

    .line 570
    return p1

    .line 571
    :pswitch_18
    check-cast p1, Ljava/io/File;

    .line 572
    .line 573
    check-cast p2, Ljava/io/File;

    .line 574
    .line 575
    invoke-virtual {p2}, Ljava/io/File;->lastModified()J

    .line 576
    .line 577
    .line 578
    move-result-wide v0

    .line 579
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 580
    .line 581
    .line 582
    move-result-wide p1

    .line 583
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compare(JJ)I

    .line 584
    .line 585
    .line 586
    move-result p1

    .line 587
    return p1

    .line 588
    :pswitch_19
    check-cast p1, LQ2/d;

    .line 589
    .line 590
    check-cast p2, LQ2/d;

    .line 591
    .line 592
    iget p2, p2, LQ2/d;->b:I

    .line 593
    .line 594
    iget p1, p1, LQ2/d;->b:I

    .line 595
    .line 596
    invoke-static {p2, p1}, Ljava/lang/Integer;->compare(II)I

    .line 597
    .line 598
    .line 599
    move-result p1

    .line 600
    return p1

    .line 601
    :pswitch_1a
    check-cast p1, LN/J;

    .line 602
    .line 603
    check-cast p2, LN/J;

    .line 604
    .line 605
    iget p1, p1, LN/J;->b:I

    .line 606
    .line 607
    iget p2, p2, LN/J;->b:I

    .line 608
    .line 609
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->g(II)I

    .line 610
    .line 611
    .line 612
    move-result p1

    .line 613
    return p1

    .line 614
    :pswitch_1b
    check-cast p1, Lsa/f;

    .line 615
    .line 616
    check-cast p2, Lsa/f;

    .line 617
    .line 618
    invoke-virtual {p1}, Lsa/f;->e()Z

    .line 619
    .line 620
    .line 621
    move-result v0

    .line 622
    if-eqz v0, :cond_8

    .line 623
    .line 624
    invoke-virtual {p2}, Lsa/f;->e()Z

    .line 625
    .line 626
    .line 627
    move-result v0

    .line 628
    if-nez v0, :cond_8

    .line 629
    .line 630
    const/4 p1, -0x1

    .line 631
    goto :goto_5

    .line 632
    :cond_8
    invoke-virtual {p2}, Lsa/f;->e()Z

    .line 633
    .line 634
    .line 635
    move-result v0

    .line 636
    if-eqz v0, :cond_9

    .line 637
    .line 638
    invoke-virtual {p1}, Lsa/f;->e()Z

    .line 639
    .line 640
    .line 641
    move-result v0

    .line 642
    if-nez v0, :cond_9

    .line 643
    .line 644
    const/4 p1, 0x1

    .line 645
    goto :goto_5

    .line 646
    :cond_9
    invoke-virtual {p1}, Lsa/f;->g()Lz9/k;

    .line 647
    .line 648
    .line 649
    move-result-object p1

    .line 650
    invoke-virtual {p1}, Lz9/k;->getValue()I

    .line 651
    .line 652
    .line 653
    move-result p1

    .line 654
    invoke-virtual {p2}, Lsa/f;->g()Lz9/k;

    .line 655
    .line 656
    .line 657
    move-result-object p2

    .line 658
    invoke-virtual {p2}, Lz9/k;->getValue()I

    .line 659
    .line 660
    .line 661
    move-result p2

    .line 662
    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    .line 663
    .line 664
    .line 665
    move-result p1

    .line 666
    :goto_5
    return p1

    .line 667
    :pswitch_1c
    check-cast p1, Lef/k;

    .line 668
    .line 669
    check-cast p2, Lef/k;

    .line 670
    .line 671
    iget-object v0, p1, Lef/k;->b:Ljava/lang/Object;

    .line 672
    .line 673
    check-cast v0, Ljava/lang/Number;

    .line 674
    .line 675
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 676
    .line 677
    .line 678
    move-result v0

    .line 679
    iget-object p1, p1, Lef/k;->a:Ljava/lang/Object;

    .line 680
    .line 681
    check-cast p1, Ljava/lang/Number;

    .line 682
    .line 683
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 684
    .line 685
    .line 686
    move-result p1

    .line 687
    sub-int/2addr v0, p1

    .line 688
    iget-object p1, p2, Lef/k;->b:Ljava/lang/Object;

    .line 689
    .line 690
    check-cast p1, Ljava/lang/Number;

    .line 691
    .line 692
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 693
    .line 694
    .line 695
    move-result p1

    .line 696
    iget-object p2, p2, Lef/k;->a:Ljava/lang/Object;

    .line 697
    .line 698
    check-cast p2, Ljava/lang/Number;

    .line 699
    .line 700
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 701
    .line 702
    .line 703
    move-result p2

    .line 704
    sub-int/2addr p1, p2

    .line 705
    sub-int/2addr v0, p1

    .line 706
    return v0

    .line 707
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
