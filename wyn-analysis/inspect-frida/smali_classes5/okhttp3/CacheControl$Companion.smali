.class public final Lokhttp3/CacheControl$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/CacheControl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lokhttp3/CacheControl$Companion;",
        "",
        "<init>",
        "()V",
        "Lokhttp3/CacheControl;",
        "FORCE_CACHE",
        "Lokhttp3/CacheControl;",
        "FORCE_NETWORK",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lokhttp3/CacheControl$Companion;-><init>()V

    return-void
.end method

.method public static a(Lokhttp3/Headers;)Lokhttp3/CacheControl;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "headers"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lokhttp3/Headers;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v4, 0x1

    .line 13
    move v7, v4

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x0

    .line 17
    const/4 v10, 0x0

    .line 18
    const/4 v11, -0x1

    .line 19
    const/4 v12, -0x1

    .line 20
    const/4 v13, 0x0

    .line 21
    const/4 v14, 0x0

    .line 22
    const/4 v15, 0x0

    .line 23
    const/16 v16, -0x1

    .line 24
    .line 25
    const/16 v17, -0x1

    .line 26
    .line 27
    const/16 v18, 0x0

    .line 28
    .line 29
    const/16 v19, 0x0

    .line 30
    .line 31
    const/16 v20, 0x0

    .line 32
    .line 33
    :goto_0
    if-ge v6, v1, :cond_18

    .line 34
    .line 35
    add-int/lit8 v21, v6, 0x1

    .line 36
    .line 37
    invoke-virtual {v0, v6}, Lokhttp3/Headers;->c(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v0, v6}, Lokhttp3/Headers;->f(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    const-string v5, "Cache-Control"

    .line 46
    .line 47
    invoke-static {v2, v5, v4}, LBf/r;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_1

    .line 52
    .line 53
    if-eqz v8, :cond_0

    .line 54
    .line 55
    :goto_1
    const/4 v7, 0x0

    .line 56
    goto :goto_2

    .line 57
    :cond_0
    move-object v8, v6

    .line 58
    goto :goto_2

    .line 59
    :cond_1
    const-string v5, "Pragma"

    .line 60
    .line 61
    invoke-static {v2, v5, v4}, LBf/r;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_17

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :goto_2
    const/4 v2, 0x0

    .line 69
    :goto_3
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-ge v2, v5, :cond_17

    .line 74
    .line 75
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    move/from16 v22, v4

    .line 80
    .line 81
    move v4, v2

    .line 82
    :goto_4
    if-ge v4, v5, :cond_3

    .line 83
    .line 84
    add-int/lit8 v23, v4, 0x1

    .line 85
    .line 86
    invoke-virtual {v6, v4}, Ljava/lang/String;->charAt(I)C

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    const-string v0, "=,;"

    .line 91
    .line 92
    invoke-static {v0, v3}, LBf/k;->o0(Ljava/lang/CharSequence;C)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_2

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_2
    move-object/from16 v0, p0

    .line 100
    .line 101
    move/from16 v4, v23

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_3
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    :goto_5
    invoke-virtual {v6, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    const-string v2, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 113
    .line 114
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v0}, LBf/k;->V0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eq v4, v3, :cond_4

    .line 130
    .line 131
    invoke-virtual {v6, v4}, Ljava/lang/String;->charAt(I)C

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    const/16 v5, 0x2c

    .line 136
    .line 137
    if-eq v3, v5, :cond_4

    .line 138
    .line 139
    invoke-virtual {v6, v4}, Ljava/lang/String;->charAt(I)C

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    const/16 v5, 0x3b

    .line 144
    .line 145
    if-ne v3, v5, :cond_5

    .line 146
    .line 147
    :cond_4
    move/from16 v23, v1

    .line 148
    .line 149
    goto/16 :goto_a

    .line 150
    .line 151
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 152
    .line 153
    sget-object v3, Lokhttp3/internal/Util;->a:[B

    .line 154
    .line 155
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    :goto_6
    if-ge v4, v3, :cond_7

    .line 160
    .line 161
    add-int/lit8 v5, v4, 0x1

    .line 162
    .line 163
    move/from16 v23, v1

    .line 164
    .line 165
    invoke-virtual {v6, v4}, Ljava/lang/String;->charAt(I)C

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    move/from16 v24, v3

    .line 170
    .line 171
    const/16 v3, 0x20

    .line 172
    .line 173
    if-eq v1, v3, :cond_6

    .line 174
    .line 175
    const/16 v3, 0x9

    .line 176
    .line 177
    if-eq v1, v3, :cond_6

    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_6
    move v4, v5

    .line 181
    move/from16 v1, v23

    .line 182
    .line 183
    move/from16 v3, v24

    .line 184
    .line 185
    goto :goto_6

    .line 186
    :cond_7
    move/from16 v23, v1

    .line 187
    .line 188
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    :goto_7
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-ge v4, v1, :cond_8

    .line 197
    .line 198
    invoke-virtual {v6, v4}, Ljava/lang/String;->charAt(I)C

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    const/16 v3, 0x22

    .line 203
    .line 204
    if-ne v1, v3, :cond_8

    .line 205
    .line 206
    add-int/lit8 v4, v4, 0x1

    .line 207
    .line 208
    const/4 v1, 0x4

    .line 209
    invoke-static {v6, v3, v4, v1}, LBf/k;->v0(Ljava/lang/CharSequence;CII)I

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    invoke-virtual {v6, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    add-int/lit8 v1, v1, 0x1

    .line 221
    .line 222
    move v2, v1

    .line 223
    goto :goto_b

    .line 224
    :cond_8
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    move v3, v4

    .line 229
    :goto_8
    if-ge v3, v1, :cond_a

    .line 230
    .line 231
    add-int/lit8 v5, v3, 0x1

    .line 232
    .line 233
    move/from16 v24, v1

    .line 234
    .line 235
    invoke-virtual {v6, v3}, Ljava/lang/String;->charAt(I)C

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    move/from16 v25, v3

    .line 240
    .line 241
    const-string v3, ",;"

    .line 242
    .line 243
    invoke-static {v3, v1}, LBf/k;->o0(Ljava/lang/CharSequence;C)Z

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    if-eqz v1, :cond_9

    .line 248
    .line 249
    move/from16 v3, v25

    .line 250
    .line 251
    goto :goto_9

    .line 252
    :cond_9
    move v3, v5

    .line 253
    move/from16 v1, v24

    .line 254
    .line 255
    goto :goto_8

    .line 256
    :cond_a
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    :goto_9
    invoke-virtual {v6, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-static {v1}, LBf/k;->V0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    move v2, v3

    .line 276
    move-object v3, v1

    .line 277
    goto :goto_b

    .line 278
    :goto_a
    add-int/lit8 v4, v4, 0x1

    .line 279
    .line 280
    move v2, v4

    .line 281
    const/4 v3, 0x0

    .line 282
    :goto_b
    const-string v1, "no-cache"

    .line 283
    .line 284
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    if-eqz v1, :cond_b

    .line 289
    .line 290
    move-object/from16 v0, p0

    .line 291
    .line 292
    move/from16 v4, v22

    .line 293
    .line 294
    move v9, v4

    .line 295
    :goto_c
    move/from16 v1, v23

    .line 296
    .line 297
    goto/16 :goto_3

    .line 298
    .line 299
    :cond_b
    const-string v1, "no-store"

    .line 300
    .line 301
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    if-eqz v1, :cond_c

    .line 306
    .line 307
    move-object/from16 v0, p0

    .line 308
    .line 309
    move/from16 v4, v22

    .line 310
    .line 311
    move v10, v4

    .line 312
    goto :goto_c

    .line 313
    :cond_c
    const-string v1, "max-age"

    .line 314
    .line 315
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    if-eqz v1, :cond_e

    .line 320
    .line 321
    const/4 v1, -0x1

    .line 322
    invoke-static {v3, v1}, Lokhttp3/internal/Util;->y(Ljava/lang/String;I)I

    .line 323
    .line 324
    .line 325
    move-result v11

    .line 326
    :cond_d
    :goto_d
    move-object/from16 v0, p0

    .line 327
    .line 328
    move/from16 v4, v22

    .line 329
    .line 330
    goto :goto_c

    .line 331
    :cond_e
    const/4 v1, -0x1

    .line 332
    const-string v4, "s-maxage"

    .line 333
    .line 334
    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 335
    .line 336
    .line 337
    move-result v4

    .line 338
    if-eqz v4, :cond_f

    .line 339
    .line 340
    invoke-static {v3, v1}, Lokhttp3/internal/Util;->y(Ljava/lang/String;I)I

    .line 341
    .line 342
    .line 343
    move-result v12

    .line 344
    goto :goto_d

    .line 345
    :cond_f
    const-string v1, "private"

    .line 346
    .line 347
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    if-eqz v1, :cond_10

    .line 352
    .line 353
    move-object/from16 v0, p0

    .line 354
    .line 355
    move/from16 v4, v22

    .line 356
    .line 357
    move v13, v4

    .line 358
    goto :goto_c

    .line 359
    :cond_10
    const-string v1, "public"

    .line 360
    .line 361
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    if-eqz v1, :cond_11

    .line 366
    .line 367
    move-object/from16 v0, p0

    .line 368
    .line 369
    move/from16 v4, v22

    .line 370
    .line 371
    move v14, v4

    .line 372
    goto :goto_c

    .line 373
    :cond_11
    const-string v1, "must-revalidate"

    .line 374
    .line 375
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    if-eqz v1, :cond_12

    .line 380
    .line 381
    move-object/from16 v0, p0

    .line 382
    .line 383
    move/from16 v4, v22

    .line 384
    .line 385
    move v15, v4

    .line 386
    goto :goto_c

    .line 387
    :cond_12
    const-string v1, "max-stale"

    .line 388
    .line 389
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 390
    .line 391
    .line 392
    move-result v1

    .line 393
    if-eqz v1, :cond_13

    .line 394
    .line 395
    const v0, 0x7fffffff

    .line 396
    .line 397
    .line 398
    invoke-static {v3, v0}, Lokhttp3/internal/Util;->y(Ljava/lang/String;I)I

    .line 399
    .line 400
    .line 401
    move-result v16

    .line 402
    goto :goto_d

    .line 403
    :cond_13
    const-string v1, "min-fresh"

    .line 404
    .line 405
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    if-eqz v1, :cond_14

    .line 410
    .line 411
    const/4 v1, -0x1

    .line 412
    invoke-static {v3, v1}, Lokhttp3/internal/Util;->y(Ljava/lang/String;I)I

    .line 413
    .line 414
    .line 415
    move-result v17

    .line 416
    goto :goto_d

    .line 417
    :cond_14
    const/4 v1, -0x1

    .line 418
    const-string v3, "only-if-cached"

    .line 419
    .line 420
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 421
    .line 422
    .line 423
    move-result v3

    .line 424
    if-eqz v3, :cond_15

    .line 425
    .line 426
    move-object/from16 v0, p0

    .line 427
    .line 428
    move/from16 v4, v22

    .line 429
    .line 430
    move/from16 v18, v4

    .line 431
    .line 432
    goto/16 :goto_c

    .line 433
    .line 434
    :cond_15
    const-string v3, "no-transform"

    .line 435
    .line 436
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 437
    .line 438
    .line 439
    move-result v3

    .line 440
    if-eqz v3, :cond_16

    .line 441
    .line 442
    move-object/from16 v0, p0

    .line 443
    .line 444
    move/from16 v4, v22

    .line 445
    .line 446
    move/from16 v19, v4

    .line 447
    .line 448
    goto/16 :goto_c

    .line 449
    .line 450
    :cond_16
    const-string v3, "immutable"

    .line 451
    .line 452
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 453
    .line 454
    .line 455
    move-result v0

    .line 456
    if-eqz v0, :cond_d

    .line 457
    .line 458
    move-object/from16 v0, p0

    .line 459
    .line 460
    move/from16 v4, v22

    .line 461
    .line 462
    move/from16 v20, v4

    .line 463
    .line 464
    goto/16 :goto_c

    .line 465
    .line 466
    :cond_17
    move-object/from16 v0, p0

    .line 467
    .line 468
    move/from16 v6, v21

    .line 469
    .line 470
    goto/16 :goto_0

    .line 471
    .line 472
    :cond_18
    if-nez v7, :cond_19

    .line 473
    .line 474
    const/16 v21, 0x0

    .line 475
    .line 476
    goto :goto_e

    .line 477
    :cond_19
    move-object/from16 v21, v8

    .line 478
    .line 479
    :goto_e
    new-instance v8, Lokhttp3/CacheControl;

    .line 480
    .line 481
    invoke-direct/range {v8 .. v21}, Lokhttp3/CacheControl;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    .line 482
    .line 483
    .line 484
    return-object v8
.end method
