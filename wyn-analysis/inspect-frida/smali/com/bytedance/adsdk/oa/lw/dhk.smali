.class Lcom/bytedance/adsdk/oa/lw/dhk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static oa:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/animation/Interpolator;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final uef:Landroid/view/animation/Interpolator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/bytedance/adsdk/oa/lw/dhk;->uef:Landroid/view/animation/Interpolator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static oa(Lcom/bytedance/adsdk/oa/xs;Landroid/util/JsonReader;FLcom/bytedance/adsdk/oa/lw/rl;)Lcom/bytedance/adsdk/oa/xs/uef;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/bytedance/adsdk/oa/xs;",
            "Landroid/util/JsonReader;",
            "F",
            "Lcom/bytedance/adsdk/oa/lw/rl<",
            "TT;>;)",
            "Lcom/bytedance/adsdk/oa/xs/uef<",
            "TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "y"

    .line 8
    .line 9
    const-string v4, "x"

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/util/JsonReader;->beginObject()V

    .line 12
    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v9, 0x0

    .line 18
    const/4 v10, 0x0

    .line 19
    const/4 v11, 0x0

    .line 20
    const/4 v12, 0x0

    .line 21
    const/4 v13, 0x0

    .line 22
    const/4 v14, 0x0

    .line 23
    const/4 v15, 0x0

    .line 24
    const/16 v19, 0x0

    .line 25
    .line 26
    const/16 v20, 0x0

    .line 27
    .line 28
    :goto_0
    invoke-virtual {v0}, Landroid/util/JsonReader;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v21

    .line 32
    if-eqz v21, :cond_19

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/16 v22, -0x1

    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v23

    .line 47
    sparse-switch v23, :sswitch_data_0

    .line 48
    .line 49
    .line 50
    move/from16 v23, v9

    .line 51
    .line 52
    goto/16 :goto_1

    .line 53
    .line 54
    :sswitch_0
    move/from16 v23, v9

    .line 55
    .line 56
    const-string v9, "to"

    .line 57
    .line 58
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-nez v5, :cond_0

    .line 63
    .line 64
    goto/16 :goto_1

    .line 65
    .line 66
    :cond_0
    const/16 v22, 0x7

    .line 67
    .line 68
    goto/16 :goto_1

    .line 69
    .line 70
    :sswitch_1
    move/from16 v23, v9

    .line 71
    .line 72
    const-string v9, "ti"

    .line 73
    .line 74
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-nez v5, :cond_1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    const/16 v22, 0x6

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :sswitch_2
    move/from16 v23, v9

    .line 85
    .line 86
    const-string v9, "t"

    .line 87
    .line 88
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-nez v5, :cond_2

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    const/16 v22, 0x5

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :sswitch_3
    move/from16 v23, v9

    .line 99
    .line 100
    const-string v9, "s"

    .line 101
    .line 102
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-nez v5, :cond_3

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    const/16 v22, 0x4

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :sswitch_4
    move/from16 v23, v9

    .line 113
    .line 114
    const-string v9, "o"

    .line 115
    .line 116
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-nez v5, :cond_4

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_4
    const/16 v22, 0x3

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :sswitch_5
    move/from16 v23, v9

    .line 127
    .line 128
    const-string v9, "i"

    .line 129
    .line 130
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-nez v5, :cond_5

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_5
    const/16 v22, 0x2

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :sswitch_6
    move/from16 v23, v9

    .line 141
    .line 142
    const-string v9, "h"

    .line 143
    .line 144
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-nez v5, :cond_6

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_6
    const/16 v22, 0x1

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :sswitch_7
    move/from16 v23, v9

    .line 155
    .line 156
    const-string v9, "e"

    .line 157
    .line 158
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    if-nez v5, :cond_7

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_7
    const/16 v22, 0x0

    .line 166
    .line 167
    :goto_1
    packed-switch v22, :pswitch_data_0

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Landroid/util/JsonReader;->skipValue()V

    .line 171
    .line 172
    .line 173
    :goto_2
    move/from16 v9, v23

    .line 174
    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :pswitch_0
    invoke-static/range {p1 .. p2}, Lcom/bytedance/adsdk/oa/lw/oib;->oa(Landroid/util/JsonReader;F)Landroid/graphics/PointF;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    goto :goto_2

    .line 182
    :pswitch_1
    invoke-static/range {p1 .. p2}, Lcom/bytedance/adsdk/oa/lw/oib;->oa(Landroid/util/JsonReader;F)Landroid/graphics/PointF;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    goto :goto_2

    .line 187
    :pswitch_2
    move-object v5, v8

    .line 188
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextDouble()D

    .line 189
    .line 190
    .line 191
    move-result-wide v8

    .line 192
    double-to-float v8, v8

    .line 193
    move/from16 v19, v8

    .line 194
    .line 195
    move/from16 v9, v23

    .line 196
    .line 197
    move-object v8, v5

    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :pswitch_3
    move-object v5, v8

    .line 201
    invoke-interface {v2, v0, v1}, Lcom/bytedance/adsdk/oa/lw/rl;->oa(Landroid/util/JsonReader;F)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v13

    .line 205
    goto :goto_2

    .line 206
    :pswitch_4
    move-object v5, v8

    .line 207
    invoke-virtual {v0}, Landroid/util/JsonReader;->peek()Landroid/util/JsonToken;

    .line 208
    .line 209
    .line 210
    move-result-object v8

    .line 211
    sget-object v9, Landroid/util/JsonToken;->BEGIN_OBJECT:Landroid/util/JsonToken;

    .line 212
    .line 213
    if-ne v8, v9, :cond_f

    .line 214
    .line 215
    invoke-virtual {v0}, Landroid/util/JsonReader;->beginObject()V

    .line 216
    .line 217
    .line 218
    const/4 v8, 0x0

    .line 219
    const/4 v9, 0x0

    .line 220
    const/4 v12, 0x0

    .line 221
    const/4 v14, 0x0

    .line 222
    :goto_3
    invoke-virtual {v0}, Landroid/util/JsonReader;->hasNext()Z

    .line 223
    .line 224
    .line 225
    move-result v22

    .line 226
    if-eqz v22, :cond_e

    .line 227
    .line 228
    move-object/from16 v22, v5

    .line 229
    .line 230
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v24

    .line 241
    if-nez v24, :cond_b

    .line 242
    .line 243
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    if-nez v5, :cond_8

    .line 248
    .line 249
    invoke-virtual {v0}, Landroid/util/JsonReader;->skipValue()V

    .line 250
    .line 251
    .line 252
    :goto_4
    move-object/from16 v5, v22

    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_8
    invoke-virtual {v0}, Landroid/util/JsonReader;->peek()Landroid/util/JsonToken;

    .line 256
    .line 257
    .line 258
    move-result-object v5

    .line 259
    sget-object v9, Landroid/util/JsonToken;->NUMBER:Landroid/util/JsonToken;

    .line 260
    .line 261
    if-ne v5, v9, :cond_9

    .line 262
    .line 263
    move-object v5, v13

    .line 264
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextDouble()D

    .line 265
    .line 266
    .line 267
    move-result-wide v13

    .line 268
    double-to-float v14, v13

    .line 269
    move-object v13, v5

    .line 270
    move v9, v14

    .line 271
    goto :goto_4

    .line 272
    :cond_9
    move-object v5, v13

    .line 273
    invoke-virtual {v0}, Landroid/util/JsonReader;->beginArray()V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextDouble()D

    .line 277
    .line 278
    .line 279
    move-result-wide v13

    .line 280
    double-to-float v13, v13

    .line 281
    invoke-virtual {v0}, Landroid/util/JsonReader;->peek()Landroid/util/JsonToken;

    .line 282
    .line 283
    .line 284
    move-result-object v14

    .line 285
    if-ne v14, v9, :cond_a

    .line 286
    .line 287
    move v9, v13

    .line 288
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextDouble()D

    .line 289
    .line 290
    .line 291
    move-result-wide v13

    .line 292
    double-to-float v13, v13

    .line 293
    move v14, v13

    .line 294
    goto :goto_5

    .line 295
    :cond_a
    move v9, v13

    .line 296
    move v14, v9

    .line 297
    :goto_5
    invoke-virtual {v0}, Landroid/util/JsonReader;->endArray()V

    .line 298
    .line 299
    .line 300
    move-object v13, v5

    .line 301
    goto :goto_4

    .line 302
    :cond_b
    move-object v5, v13

    .line 303
    invoke-virtual {v0}, Landroid/util/JsonReader;->peek()Landroid/util/JsonToken;

    .line 304
    .line 305
    .line 306
    move-result-object v8

    .line 307
    sget-object v12, Landroid/util/JsonToken;->NUMBER:Landroid/util/JsonToken;

    .line 308
    .line 309
    if-ne v8, v12, :cond_c

    .line 310
    .line 311
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextDouble()D

    .line 312
    .line 313
    .line 314
    move-result-wide v12

    .line 315
    double-to-float v12, v12

    .line 316
    move-object v13, v5

    .line 317
    move v8, v12

    .line 318
    goto :goto_4

    .line 319
    :cond_c
    invoke-virtual {v0}, Landroid/util/JsonReader;->beginArray()V

    .line 320
    .line 321
    .line 322
    move-object/from16 v24, v7

    .line 323
    .line 324
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextDouble()D

    .line 325
    .line 326
    .line 327
    move-result-wide v7

    .line 328
    double-to-float v8, v7

    .line 329
    invoke-virtual {v0}, Landroid/util/JsonReader;->peek()Landroid/util/JsonToken;

    .line 330
    .line 331
    .line 332
    move-result-object v7

    .line 333
    if-ne v7, v12, :cond_d

    .line 334
    .line 335
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextDouble()D

    .line 336
    .line 337
    .line 338
    move-result-wide v12

    .line 339
    double-to-float v7, v12

    .line 340
    move v12, v7

    .line 341
    goto :goto_6

    .line 342
    :cond_d
    move v12, v8

    .line 343
    :goto_6
    invoke-virtual {v0}, Landroid/util/JsonReader;->endArray()V

    .line 344
    .line 345
    .line 346
    move-object v13, v5

    .line 347
    move-object/from16 v5, v22

    .line 348
    .line 349
    move-object/from16 v7, v24

    .line 350
    .line 351
    goto/16 :goto_3

    .line 352
    .line 353
    :cond_e
    move-object/from16 v22, v5

    .line 354
    .line 355
    move-object/from16 v24, v7

    .line 356
    .line 357
    move-object v5, v13

    .line 358
    new-instance v7, Landroid/graphics/PointF;

    .line 359
    .line 360
    invoke-direct {v7, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    .line 361
    .line 362
    .line 363
    new-instance v8, Landroid/graphics/PointF;

    .line 364
    .line 365
    invoke-direct {v8, v12, v14}, Landroid/graphics/PointF;-><init>(FF)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v0}, Landroid/util/JsonReader;->endObject()V

    .line 369
    .line 370
    .line 371
    move-object v12, v7

    .line 372
    move-object v14, v8

    .line 373
    move-object/from16 v8, v22

    .line 374
    .line 375
    move/from16 v9, v23

    .line 376
    .line 377
    move-object/from16 v7, v24

    .line 378
    .line 379
    goto/16 :goto_0

    .line 380
    .line 381
    :cond_f
    move-object/from16 v22, v5

    .line 382
    .line 383
    move-object/from16 v24, v7

    .line 384
    .line 385
    move-object v5, v13

    .line 386
    invoke-static/range {p1 .. p2}, Lcom/bytedance/adsdk/oa/lw/oib;->oa(Landroid/util/JsonReader;F)Landroid/graphics/PointF;

    .line 387
    .line 388
    .line 389
    move-result-object v10

    .line 390
    move-object/from16 v8, v22

    .line 391
    .line 392
    goto/16 :goto_2

    .line 393
    .line 394
    :pswitch_5
    move-object/from16 v24, v7

    .line 395
    .line 396
    move-object/from16 v22, v8

    .line 397
    .line 398
    move-object v5, v13

    .line 399
    invoke-virtual {v0}, Landroid/util/JsonReader;->peek()Landroid/util/JsonToken;

    .line 400
    .line 401
    .line 402
    move-result-object v7

    .line 403
    sget-object v8, Landroid/util/JsonToken;->BEGIN_OBJECT:Landroid/util/JsonToken;

    .line 404
    .line 405
    if-ne v7, v8, :cond_17

    .line 406
    .line 407
    invoke-virtual {v0}, Landroid/util/JsonReader;->beginObject()V

    .line 408
    .line 409
    .line 410
    const/4 v6, 0x0

    .line 411
    const/4 v7, 0x0

    .line 412
    const/4 v8, 0x0

    .line 413
    const/4 v9, 0x0

    .line 414
    :goto_7
    invoke-virtual {v0}, Landroid/util/JsonReader;->hasNext()Z

    .line 415
    .line 416
    .line 417
    move-result v13

    .line 418
    if-eqz v13, :cond_16

    .line 419
    .line 420
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v13

    .line 424
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v15

    .line 431
    if-nez v15, :cond_13

    .line 432
    .line 433
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    move-result v13

    .line 437
    if-nez v13, :cond_10

    .line 438
    .line 439
    invoke-virtual {v0}, Landroid/util/JsonReader;->skipValue()V

    .line 440
    .line 441
    .line 442
    goto :goto_7

    .line 443
    :cond_10
    invoke-virtual {v0}, Landroid/util/JsonReader;->peek()Landroid/util/JsonToken;

    .line 444
    .line 445
    .line 446
    move-result-object v7

    .line 447
    sget-object v9, Landroid/util/JsonToken;->NUMBER:Landroid/util/JsonToken;

    .line 448
    .line 449
    if-ne v7, v9, :cond_11

    .line 450
    .line 451
    move-object v13, v3

    .line 452
    move-object/from16 v25, v4

    .line 453
    .line 454
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextDouble()D

    .line 455
    .line 456
    .line 457
    move-result-wide v3

    .line 458
    double-to-float v9, v3

    .line 459
    move v7, v9

    .line 460
    :goto_8
    move-object v3, v13

    .line 461
    move-object/from16 v4, v25

    .line 462
    .line 463
    goto :goto_7

    .line 464
    :cond_11
    move-object v13, v3

    .line 465
    move-object/from16 v25, v4

    .line 466
    .line 467
    invoke-virtual {v0}, Landroid/util/JsonReader;->beginArray()V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextDouble()D

    .line 471
    .line 472
    .line 473
    move-result-wide v3

    .line 474
    double-to-float v7, v3

    .line 475
    invoke-virtual {v0}, Landroid/util/JsonReader;->peek()Landroid/util/JsonToken;

    .line 476
    .line 477
    .line 478
    move-result-object v3

    .line 479
    if-ne v3, v9, :cond_12

    .line 480
    .line 481
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextDouble()D

    .line 482
    .line 483
    .line 484
    move-result-wide v3

    .line 485
    double-to-float v3, v3

    .line 486
    move v9, v3

    .line 487
    goto :goto_9

    .line 488
    :cond_12
    move v9, v7

    .line 489
    :goto_9
    invoke-virtual {v0}, Landroid/util/JsonReader;->endArray()V

    .line 490
    .line 491
    .line 492
    goto :goto_8

    .line 493
    :cond_13
    move-object v13, v3

    .line 494
    move-object/from16 v25, v4

    .line 495
    .line 496
    invoke-virtual {v0}, Landroid/util/JsonReader;->peek()Landroid/util/JsonToken;

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    sget-object v4, Landroid/util/JsonToken;->NUMBER:Landroid/util/JsonToken;

    .line 501
    .line 502
    if-ne v3, v4, :cond_14

    .line 503
    .line 504
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextDouble()D

    .line 505
    .line 506
    .line 507
    move-result-wide v3

    .line 508
    double-to-float v8, v3

    .line 509
    move v6, v8

    .line 510
    goto :goto_8

    .line 511
    :cond_14
    invoke-virtual {v0}, Landroid/util/JsonReader;->beginArray()V

    .line 512
    .line 513
    .line 514
    move-object v3, v5

    .line 515
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextDouble()D

    .line 516
    .line 517
    .line 518
    move-result-wide v5

    .line 519
    double-to-float v6, v5

    .line 520
    invoke-virtual {v0}, Landroid/util/JsonReader;->peek()Landroid/util/JsonToken;

    .line 521
    .line 522
    .line 523
    move-result-object v5

    .line 524
    if-ne v5, v4, :cond_15

    .line 525
    .line 526
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextDouble()D

    .line 527
    .line 528
    .line 529
    move-result-wide v4

    .line 530
    double-to-float v4, v4

    .line 531
    move v8, v4

    .line 532
    goto :goto_a

    .line 533
    :cond_15
    move v8, v6

    .line 534
    :goto_a
    invoke-virtual {v0}, Landroid/util/JsonReader;->endArray()V

    .line 535
    .line 536
    .line 537
    move-object v5, v3

    .line 538
    goto :goto_8

    .line 539
    :cond_16
    move-object v13, v3

    .line 540
    move-object/from16 v25, v4

    .line 541
    .line 542
    move-object v3, v5

    .line 543
    new-instance v15, Landroid/graphics/PointF;

    .line 544
    .line 545
    invoke-direct {v15, v6, v7}, Landroid/graphics/PointF;-><init>(FF)V

    .line 546
    .line 547
    .line 548
    new-instance v6, Landroid/graphics/PointF;

    .line 549
    .line 550
    invoke-direct {v6, v8, v9}, Landroid/graphics/PointF;-><init>(FF)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v0}, Landroid/util/JsonReader;->endObject()V

    .line 554
    .line 555
    .line 556
    :goto_b
    move-object v4, v13

    .line 557
    move-object v13, v3

    .line 558
    move-object v3, v4

    .line 559
    move-object/from16 v8, v22

    .line 560
    .line 561
    move/from16 v9, v23

    .line 562
    .line 563
    :goto_c
    move-object/from16 v7, v24

    .line 564
    .line 565
    :goto_d
    move-object/from16 v4, v25

    .line 566
    .line 567
    goto/16 :goto_0

    .line 568
    .line 569
    :cond_17
    move-object v13, v3

    .line 570
    move-object/from16 v25, v4

    .line 571
    .line 572
    move-object v3, v5

    .line 573
    invoke-static/range {p1 .. p2}, Lcom/bytedance/adsdk/oa/lw/oib;->oa(Landroid/util/JsonReader;F)Landroid/graphics/PointF;

    .line 574
    .line 575
    .line 576
    move-result-object v11

    .line 577
    goto :goto_b

    .line 578
    :pswitch_6
    move-object/from16 v22, v13

    .line 579
    .line 580
    move-object v13, v3

    .line 581
    move-object/from16 v3, v22

    .line 582
    .line 583
    move-object/from16 v25, v4

    .line 584
    .line 585
    move-object/from16 v24, v7

    .line 586
    .line 587
    move-object/from16 v22, v8

    .line 588
    .line 589
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextInt()I

    .line 590
    .line 591
    .line 592
    move-result v4

    .line 593
    const/4 v5, 0x1

    .line 594
    if-ne v4, v5, :cond_18

    .line 595
    .line 596
    move v9, v5

    .line 597
    goto :goto_e

    .line 598
    :cond_18
    const/4 v9, 0x0

    .line 599
    :goto_e
    move-object v4, v13

    .line 600
    move-object v13, v3

    .line 601
    move-object v3, v4

    .line 602
    move-object/from16 v8, v22

    .line 603
    .line 604
    goto :goto_c

    .line 605
    :pswitch_7
    move-object v5, v13

    .line 606
    move-object v13, v3

    .line 607
    move-object v3, v5

    .line 608
    move-object/from16 v25, v4

    .line 609
    .line 610
    move-object/from16 v24, v7

    .line 611
    .line 612
    move-object/from16 v22, v8

    .line 613
    .line 614
    const/4 v5, 0x1

    .line 615
    invoke-interface {v2, v0, v1}, Lcom/bytedance/adsdk/oa/lw/rl;->oa(Landroid/util/JsonReader;F)Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v20

    .line 619
    move-object v4, v13

    .line 620
    move-object v13, v3

    .line 621
    move-object v3, v4

    .line 622
    move/from16 v9, v23

    .line 623
    .line 624
    goto :goto_d

    .line 625
    :cond_19
    move-object/from16 v24, v7

    .line 626
    .line 627
    move-object/from16 v22, v8

    .line 628
    .line 629
    move/from16 v23, v9

    .line 630
    .line 631
    move-object v3, v13

    .line 632
    invoke-virtual {v0}, Landroid/util/JsonReader;->endObject()V

    .line 633
    .line 634
    .line 635
    if-eqz v23, :cond_1a

    .line 636
    .line 637
    move-object/from16 v20, v3

    .line 638
    .line 639
    goto :goto_10

    .line 640
    :cond_1a
    if-eqz v10, :cond_1b

    .line 641
    .line 642
    if-eqz v11, :cond_1b

    .line 643
    .line 644
    invoke-static {v10, v11}, Lcom/bytedance/adsdk/oa/lw/dhk;->uef(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/view/animation/Interpolator;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    :goto_f
    move-object v6, v0

    .line 649
    move-object/from16 v14, v20

    .line 650
    .line 651
    const/4 v15, 0x0

    .line 652
    const/16 v16, 0x0

    .line 653
    .line 654
    goto :goto_11

    .line 655
    :cond_1b
    if-eqz v12, :cond_1c

    .line 656
    .line 657
    if-eqz v14, :cond_1c

    .line 658
    .line 659
    if-eqz v15, :cond_1c

    .line 660
    .line 661
    if-eqz v6, :cond_1c

    .line 662
    .line 663
    invoke-static {v12, v15}, Lcom/bytedance/adsdk/oa/lw/dhk;->uef(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/view/animation/Interpolator;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-static {v14, v6}, Lcom/bytedance/adsdk/oa/lw/dhk;->uef(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/view/animation/Interpolator;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    move-object v15, v0

    .line 672
    move-object/from16 v16, v1

    .line 673
    .line 674
    move-object/from16 v14, v20

    .line 675
    .line 676
    const/4 v6, 0x0

    .line 677
    goto :goto_11

    .line 678
    :cond_1c
    :goto_10
    sget-object v0, Lcom/bytedance/adsdk/oa/lw/dhk;->uef:Landroid/view/animation/Interpolator;

    .line 679
    .line 680
    goto :goto_f

    .line 681
    :goto_11
    if-eqz v15, :cond_1d

    .line 682
    .line 683
    if-eqz v16, :cond_1d

    .line 684
    .line 685
    new-instance v11, Lcom/bytedance/adsdk/oa/xs/uef;

    .line 686
    .line 687
    const/16 v18, 0x0

    .line 688
    .line 689
    move-object/from16 v12, p0

    .line 690
    .line 691
    move-object v13, v3

    .line 692
    move/from16 v17, v19

    .line 693
    .line 694
    invoke-direct/range {v11 .. v18}, Lcom/bytedance/adsdk/oa/xs/uef;-><init>(Lcom/bytedance/adsdk/oa/xs;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    .line 695
    .line 696
    .line 697
    :goto_12
    move-object/from16 v7, v24

    .line 698
    .line 699
    goto :goto_13

    .line 700
    :cond_1d
    move-object v13, v3

    .line 701
    move/from16 v16, v19

    .line 702
    .line 703
    new-instance v11, Lcom/bytedance/adsdk/oa/xs/uef;

    .line 704
    .line 705
    const/16 v17, 0x0

    .line 706
    .line 707
    move-object/from16 v12, p0

    .line 708
    .line 709
    move-object v15, v6

    .line 710
    invoke-direct/range {v11 .. v17}, Lcom/bytedance/adsdk/oa/xs/uef;-><init>(Lcom/bytedance/adsdk/oa/xs;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    .line 711
    .line 712
    .line 713
    goto :goto_12

    .line 714
    :goto_13
    iput-object v7, v11, Lcom/bytedance/adsdk/oa/xs/uef;->bcc:Landroid/graphics/PointF;

    .line 715
    .line 716
    move-object/from16 v5, v22

    .line 717
    .line 718
    iput-object v5, v11, Lcom/bytedance/adsdk/oa/xs/uef;->cz:Landroid/graphics/PointF;

    .line 719
    .line 720
    return-object v11

    .line 721
    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_7
        0x68 -> :sswitch_6
        0x69 -> :sswitch_5
        0x6f -> :sswitch_4
        0x73 -> :sswitch_3
        0x74 -> :sswitch_2
        0xe75 -> :sswitch_1
        0xe7b -> :sswitch_0
    .end sparse-switch

    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    :pswitch_data_0
    .packed-switch 0x0
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

.method private static uef()Landroid/util/SparseArray;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/animation/Interpolator;",
            ">;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/bytedance/adsdk/oa/lw/dhk;->oa:Landroid/util/SparseArray;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lcom/bytedance/adsdk/oa/lw/dhk;->oa:Landroid/util/SparseArray;

    .line 3
    :cond_0
    sget-object v0, Lcom/bytedance/adsdk/oa/lw/dhk;->oa:Landroid/util/SparseArray;

    return-object v0
.end method

.method private static uef(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/view/animation/Interpolator;
    .locals 6

    .line 31
    iget v0, p0, Landroid/graphics/PointF;->x:F

    const/high16 v1, -0x40800000    # -1.0f

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v0, v1, v2}, Lcom/bytedance/adsdk/oa/ivm/lw;->oa(FFF)F

    move-result v0

    iput v0, p0, Landroid/graphics/PointF;->x:F

    .line 32
    iget v0, p0, Landroid/graphics/PointF;->y:F

    const/high16 v3, -0x3d380000    # -100.0f

    const/high16 v4, 0x42c80000    # 100.0f

    invoke-static {v0, v3, v4}, Lcom/bytedance/adsdk/oa/ivm/lw;->oa(FFF)F

    move-result v0

    iput v0, p0, Landroid/graphics/PointF;->y:F

    .line 33
    iget v0, p1, Landroid/graphics/PointF;->x:F

    invoke-static {v0, v1, v2}, Lcom/bytedance/adsdk/oa/ivm/lw;->oa(FFF)F

    move-result v0

    iput v0, p1, Landroid/graphics/PointF;->x:F

    .line 34
    iget v0, p1, Landroid/graphics/PointF;->y:F

    invoke-static {v0, v3, v4}, Lcom/bytedance/adsdk/oa/ivm/lw;->oa(FFF)F

    move-result v0

    iput v0, p1, Landroid/graphics/PointF;->y:F

    .line 35
    iget v1, p0, Landroid/graphics/PointF;->x:F

    iget v3, p0, Landroid/graphics/PointF;->y:F

    iget v4, p1, Landroid/graphics/PointF;->x:F

    invoke-static {v1, v3, v4, v0}, Lcom/bytedance/adsdk/oa/ivm/ivm;->uef(FFFF)I

    move-result v0

    .line 36
    invoke-static {}, Lcom/bytedance/adsdk/oa/lw;->uef()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move-object v1, v3

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lcom/bytedance/adsdk/oa/lw/dhk;->uef(I)Ljava/lang/ref/WeakReference;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_1

    .line 37
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/animation/Interpolator;

    :cond_1
    if-eqz v1, :cond_3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    return-object v3

    .line 38
    :cond_3
    :goto_1
    :try_start_0
    iget v1, p0, Landroid/graphics/PointF;->x:F

    iget v3, p0, Landroid/graphics/PointF;->y:F

    iget v4, p1, Landroid/graphics/PointF;->x:F

    iget v5, p1, Landroid/graphics/PointF;->y:F

    invoke-static {v1, v3, v4, v5}, Lcom/bytedance/adsdk/oa/bs;->uef(FFFF)Landroid/view/animation/Interpolator;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    .line 39
    const-string v3, "The Path cannot loop back on itself."

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 40
    iget v1, p0, Landroid/graphics/PointF;->x:F

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iget p0, p0, Landroid/graphics/PointF;->y:F

    iget v2, p1, Landroid/graphics/PointF;->x:F

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-static {v1, p0, v2, p1}, Lcom/bytedance/adsdk/oa/bs;->uef(FFFF)Landroid/view/animation/Interpolator;

    move-result-object p0

    goto :goto_2

    .line 41
    :cond_4
    new-instance p0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {p0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 42
    :goto_2
    invoke-static {}, Lcom/bytedance/adsdk/oa/lw;->uef()Z

    move-result p1

    if-nez p1, :cond_5

    .line 43
    :try_start_1
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, p1}, Lcom/bytedance/adsdk/oa/lw/dhk;->uef(ILjava/lang/ref/WeakReference;)V
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_5
    return-object p0
.end method

.method private static uef(Landroid/util/JsonReader;FLcom/bytedance/adsdk/oa/lw/rl;)Lcom/bytedance/adsdk/oa/xs/uef;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/util/JsonReader;",
            "F",
            "Lcom/bytedance/adsdk/oa/lw/rl<",
            "TT;>;)",
            "Lcom/bytedance/adsdk/oa/xs/uef<",
            "TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 44
    invoke-interface {p2, p0, p1}, Lcom/bytedance/adsdk/oa/lw/rl;->oa(Landroid/util/JsonReader;F)Ljava/lang/Object;

    move-result-object p0

    .line 45
    new-instance p1, Lcom/bytedance/adsdk/oa/xs/uef;

    invoke-direct {p1, p0}, Lcom/bytedance/adsdk/oa/xs/uef;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public static uef(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;FLcom/bytedance/adsdk/oa/lw/rl;ZZ)Lcom/bytedance/adsdk/oa/xs/uef;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/util/JsonReader;",
            "Lcom/bytedance/adsdk/oa/xs;",
            "F",
            "Lcom/bytedance/adsdk/oa/lw/rl<",
            "TT;>;ZZ)",
            "Lcom/bytedance/adsdk/oa/xs/uef<",
            "TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p4, :cond_0

    if-eqz p5, :cond_0

    .line 10
    invoke-static {p1, p0, p2, p3}, Lcom/bytedance/adsdk/oa/lw/dhk;->oa(Lcom/bytedance/adsdk/oa/xs;Landroid/util/JsonReader;FLcom/bytedance/adsdk/oa/lw/rl;)Lcom/bytedance/adsdk/oa/xs/uef;

    move-result-object p0

    return-object p0

    :cond_0
    if-eqz p4, :cond_1

    .line 11
    invoke-static {p1, p0, p2, p3}, Lcom/bytedance/adsdk/oa/lw/dhk;->uef(Lcom/bytedance/adsdk/oa/xs;Landroid/util/JsonReader;FLcom/bytedance/adsdk/oa/lw/rl;)Lcom/bytedance/adsdk/oa/xs/uef;

    move-result-object p0

    return-object p0

    .line 12
    :cond_1
    invoke-static {p0, p2, p3}, Lcom/bytedance/adsdk/oa/lw/dhk;->uef(Landroid/util/JsonReader;FLcom/bytedance/adsdk/oa/lw/rl;)Lcom/bytedance/adsdk/oa/xs/uef;

    move-result-object p0

    return-object p0
.end method

.method private static uef(Lcom/bytedance/adsdk/oa/xs;Landroid/util/JsonReader;FLcom/bytedance/adsdk/oa/lw/rl;)Lcom/bytedance/adsdk/oa/xs/uef;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/bytedance/adsdk/oa/xs;",
            "Landroid/util/JsonReader;",
            "F",
            "Lcom/bytedance/adsdk/oa/lw/rl<",
            "TT;>;)",
            "Lcom/bytedance/adsdk/oa/xs/uef<",
            "TT;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p3

    const/4 v3, 0x1

    .line 13
    invoke-virtual {v0}, Landroid/util/JsonReader;->beginObject()V

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v7, v4

    move-object v9, v7

    move-object v14, v9

    move-object v15, v14

    move v12, v5

    const/4 v8, 0x0

    move-object v5, v15

    .line 14
    :goto_0
    invoke-virtual {v0}, Landroid/util/JsonReader;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_9

    .line 15
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v11, 0x3f800000    # 1.0f

    const/4 v13, -0x1

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v16

    sparse-switch v16, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v6, "to"

    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_1

    :cond_0
    const/4 v13, 0x7

    goto :goto_1

    :sswitch_1
    const-string v6, "ti"

    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    const/4 v13, 0x6

    goto :goto_1

    :sswitch_2
    const-string v6, "t"

    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_1

    :cond_2
    const/4 v13, 0x5

    goto :goto_1

    :sswitch_3
    const-string v6, "s"

    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    const/4 v13, 0x4

    goto :goto_1

    :sswitch_4
    const-string v6, "o"

    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_1

    :cond_4
    const/4 v13, 0x3

    goto :goto_1

    :sswitch_5
    const-string v6, "i"

    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_1

    :cond_5
    const/4 v13, 0x2

    goto :goto_1

    :sswitch_6
    const-string v6, "h"

    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_1

    :cond_6
    move v13, v3

    goto :goto_1

    :sswitch_7
    const-string v6, "e"

    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    goto :goto_1

    :cond_7
    const/4 v13, 0x0

    :goto_1
    packed-switch v13, :pswitch_data_0

    .line 16
    invoke-virtual {v0}, Landroid/util/JsonReader;->skipValue()V

    goto :goto_0

    .line 17
    :pswitch_0
    invoke-static/range {p1 .. p2}, Lcom/bytedance/adsdk/oa/lw/oib;->oa(Landroid/util/JsonReader;F)Landroid/graphics/PointF;

    move-result-object v14

    goto :goto_0

    .line 18
    :pswitch_1
    invoke-static/range {p1 .. p2}, Lcom/bytedance/adsdk/oa/lw/oib;->oa(Landroid/util/JsonReader;F)Landroid/graphics/PointF;

    move-result-object v15

    goto/16 :goto_0

    .line 19
    :pswitch_2
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextDouble()D

    move-result-wide v10

    double-to-float v12, v10

    goto/16 :goto_0

    .line 20
    :pswitch_3
    invoke-interface {v2, v0, v1}, Lcom/bytedance/adsdk/oa/lw/rl;->oa(Landroid/util/JsonReader;F)Ljava/lang/Object;

    move-result-object v9

    goto/16 :goto_0

    .line 21
    :pswitch_4
    invoke-static {v0, v11}, Lcom/bytedance/adsdk/oa/lw/oib;->oa(Landroid/util/JsonReader;F)Landroid/graphics/PointF;

    move-result-object v4

    goto/16 :goto_0

    .line 22
    :pswitch_5
    invoke-static {v0, v11}, Lcom/bytedance/adsdk/oa/lw/oib;->oa(Landroid/util/JsonReader;F)Landroid/graphics/PointF;

    move-result-object v5

    goto/16 :goto_0

    .line 23
    :pswitch_6
    invoke-virtual {v0}, Landroid/util/JsonReader;->nextInt()I

    move-result v6

    if-ne v6, v3, :cond_8

    move v8, v3

    goto/16 :goto_0

    :cond_8
    const/4 v8, 0x0

    goto/16 :goto_0

    .line 24
    :pswitch_7
    invoke-interface {v2, v0, v1}, Lcom/bytedance/adsdk/oa/lw/rl;->oa(Landroid/util/JsonReader;F)Ljava/lang/Object;

    move-result-object v7

    goto/16 :goto_0

    .line 25
    :cond_9
    invoke-virtual {v0}, Landroid/util/JsonReader;->endObject()V

    if-eqz v8, :cond_a

    move-object v7, v9

    goto :goto_3

    :cond_a
    if-eqz v4, :cond_b

    if-eqz v5, :cond_b

    .line 26
    invoke-static {v4, v5}, Lcom/bytedance/adsdk/oa/lw/dhk;->uef(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/view/animation/Interpolator;

    move-result-object v0

    :goto_2
    move-object v11, v0

    move-object v10, v7

    goto :goto_4

    .line 27
    :cond_b
    :goto_3
    sget-object v0, Lcom/bytedance/adsdk/oa/lw/dhk;->uef:Landroid/view/animation/Interpolator;

    goto :goto_2

    .line 28
    :goto_4
    new-instance v7, Lcom/bytedance/adsdk/oa/xs/uef;

    const/4 v13, 0x0

    move-object/from16 v8, p0

    invoke-direct/range {v7 .. v13}, Lcom/bytedance/adsdk/oa/xs/uef;-><init>(Lcom/bytedance/adsdk/oa/xs;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    .line 29
    iput-object v14, v7, Lcom/bytedance/adsdk/oa/xs/uef;->bcc:Landroid/graphics/PointF;

    .line 30
    iput-object v15, v7, Lcom/bytedance/adsdk/oa/xs/uef;->cz:Landroid/graphics/PointF;

    return-object v7

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_7
        0x68 -> :sswitch_6
        0x69 -> :sswitch_5
        0x6f -> :sswitch_4
        0x73 -> :sswitch_3
        0x74 -> :sswitch_2
        0xe75 -> :sswitch_1
        0xe7b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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

.method private static uef(I)Ljava/lang/ref/WeakReference;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/animation/Interpolator;",
            ">;"
        }
    .end annotation

    .line 4
    const-class v0, Lcom/bytedance/adsdk/oa/lw/dhk;

    monitor-enter v0

    .line 5
    :try_start_0
    invoke-static {}, Lcom/bytedance/adsdk/oa/lw/dhk;->uef()Landroid/util/SparseArray;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/ref/WeakReference;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 6
    monitor-exit v0

    throw p0
.end method

.method private static uef(ILjava/lang/ref/WeakReference;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/animation/Interpolator;",
            ">;)V"
        }
    .end annotation

    .line 7
    const-class v0, Lcom/bytedance/adsdk/oa/lw/dhk;

    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/bytedance/adsdk/oa/lw/dhk;->oa:Landroid/util/SparseArray;

    invoke-virtual {v1, p0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
