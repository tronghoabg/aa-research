.class Lcom/bytedance/adsdk/oa/lw/bs;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static uef(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;)Lcom/bytedance/adsdk/oa/yo/oa/ivm;
    .locals 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "o"

    .line 4
    .line 5
    const-string v2, "g"

    .line 6
    .line 7
    const-string v3, "d"

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    new-instance v6, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x0

    .line 17
    move-object v10, v7

    .line 18
    move-object v11, v10

    .line 19
    move-object v12, v11

    .line 20
    move-object v13, v12

    .line 21
    move-object v14, v13

    .line 22
    move-object v15, v14

    .line 23
    move-object/from16 v17, v15

    .line 24
    .line 25
    move-object/from16 v18, v17

    .line 26
    .line 27
    move-object/from16 v19, v18

    .line 28
    .line 29
    move/from16 v16, v8

    .line 30
    .line 31
    const/16 v20, 0x0

    .line 32
    .line 33
    move-object/from16 v8, v19

    .line 34
    .line 35
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v21

    .line 39
    if-eqz v21, :cond_18

    .line 40
    .line 41
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v22

    .line 52
    sparse-switch v22, :sswitch_data_0

    .line 53
    .line 54
    .line 55
    :goto_1
    const/4 v4, -0x1

    .line 56
    goto/16 :goto_2

    .line 57
    .line 58
    :sswitch_0
    const-string v10, "nm"

    .line 59
    .line 60
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-nez v4, :cond_0

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_0
    const/16 v4, 0xb

    .line 68
    .line 69
    goto/16 :goto_2

    .line 70
    .line 71
    :sswitch_1
    const-string v10, "ml"

    .line 72
    .line 73
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-nez v4, :cond_1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    const/16 v4, 0xa

    .line 81
    .line 82
    goto/16 :goto_2

    .line 83
    .line 84
    :sswitch_2
    const-string v10, "lj"

    .line 85
    .line 86
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-nez v4, :cond_2

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    const/16 v4, 0x9

    .line 94
    .line 95
    goto/16 :goto_2

    .line 96
    .line 97
    :sswitch_3
    const-string v10, "lc"

    .line 98
    .line 99
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-nez v4, :cond_3

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    const/16 v4, 0x8

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :sswitch_4
    const-string v10, "hd"

    .line 110
    .line 111
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-nez v4, :cond_4

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_4
    const/4 v4, 0x7

    .line 119
    goto :goto_2

    .line 120
    :sswitch_5
    const-string v10, "w"

    .line 121
    .line 122
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-nez v4, :cond_5

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_5
    const/4 v4, 0x6

    .line 130
    goto :goto_2

    .line 131
    :sswitch_6
    const-string v10, "t"

    .line 132
    .line 133
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-nez v4, :cond_6

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_6
    const/4 v4, 0x5

    .line 141
    goto :goto_2

    .line 142
    :sswitch_7
    const-string v10, "s"

    .line 143
    .line 144
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-nez v4, :cond_7

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_7
    const/4 v4, 0x4

    .line 152
    goto :goto_2

    .line 153
    :sswitch_8
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-nez v4, :cond_8

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_8
    const/4 v4, 0x3

    .line 161
    goto :goto_2

    .line 162
    :sswitch_9
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-nez v4, :cond_9

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_9
    const/4 v4, 0x2

    .line 170
    goto :goto_2

    .line 171
    :sswitch_a
    const-string v10, "e"

    .line 172
    .line 173
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    if-nez v4, :cond_a

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_a
    move v4, v5

    .line 181
    goto :goto_2

    .line 182
    :sswitch_b
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-nez v4, :cond_b

    .line 187
    .line 188
    goto/16 :goto_1

    .line 189
    .line 190
    :cond_b
    const/4 v4, 0x0

    .line 191
    :goto_2
    packed-switch v4, :pswitch_data_0

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->skipValue()V

    .line 195
    .line 196
    .line 197
    move v4, v5

    .line 198
    :cond_c
    const/4 v5, 0x0

    .line 199
    goto/16 :goto_b

    .line 200
    .line 201
    :pswitch_0
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    :goto_3
    const/4 v10, 0x0

    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :pswitch_1
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextDouble()D

    .line 209
    .line 210
    .line 211
    move-result-wide v9

    .line 212
    double-to-float v9, v9

    .line 213
    move/from16 v16, v9

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :pswitch_2
    invoke-static {}, Lcom/bytedance/adsdk/oa/yo/oa/sy$oa;->values()[Lcom/bytedance/adsdk/oa/yo/oa/sy$oa;

    .line 217
    .line 218
    .line 219
    move-result-object v9

    .line 220
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextInt()I

    .line 221
    .line 222
    .line 223
    move-result v10

    .line 224
    sub-int/2addr v10, v5

    .line 225
    aget-object v18, v9, v10

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :pswitch_3
    invoke-static {}, Lcom/bytedance/adsdk/oa/yo/oa/sy$uef;->values()[Lcom/bytedance/adsdk/oa/yo/oa/sy$uef;

    .line 229
    .line 230
    .line 231
    move-result-object v9

    .line 232
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextInt()I

    .line 233
    .line 234
    .line 235
    move-result v10

    .line 236
    sub-int/2addr v10, v5

    .line 237
    aget-object v17, v9, v10

    .line 238
    .line 239
    goto :goto_3

    .line 240
    :pswitch_4
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 241
    .line 242
    .line 243
    move-result v20

    .line 244
    goto :goto_3

    .line 245
    :pswitch_5
    invoke-static/range {p0 .. p1}, Lcom/bytedance/adsdk/oa/lw/moa;->uef(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;)Lcom/bytedance/adsdk/oa/yo/uef/oa;

    .line 246
    .line 247
    .line 248
    move-result-object v15

    .line 249
    goto :goto_3

    .line 250
    :pswitch_6
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextInt()I

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    if-ne v9, v5, :cond_d

    .line 255
    .line 256
    sget-object v9, Lcom/bytedance/adsdk/oa/yo/oa/xs;->uef:Lcom/bytedance/adsdk/oa/yo/oa/xs;

    .line 257
    .line 258
    :goto_4
    move-object v11, v9

    .line 259
    goto :goto_3

    .line 260
    :cond_d
    sget-object v9, Lcom/bytedance/adsdk/oa/yo/oa/xs;->oa:Lcom/bytedance/adsdk/oa/yo/oa/xs;

    .line 261
    .line 262
    goto :goto_4

    .line 263
    :pswitch_7
    invoke-static/range {p0 .. p1}, Lcom/bytedance/adsdk/oa/lw/moa;->yo(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;)Lcom/bytedance/adsdk/oa/yo/uef/ivm;

    .line 264
    .line 265
    .line 266
    move-result-object v13

    .line 267
    goto :goto_3

    .line 268
    :pswitch_8
    invoke-static/range {p0 .. p1}, Lcom/bytedance/adsdk/oa/lw/moa;->oa(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;)Lcom/bytedance/adsdk/oa/yo/uef/moa;

    .line 269
    .line 270
    .line 271
    move-result-object v8

    .line 272
    goto :goto_3

    .line 273
    :pswitch_9
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->beginObject()V

    .line 274
    .line 275
    .line 276
    const/4 v9, -0x1

    .line 277
    :goto_5
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 278
    .line 279
    .line 280
    move-result v10

    .line 281
    if-eqz v10, :cond_10

    .line 282
    .line 283
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v10

    .line 287
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    const-string v4, "k"

    .line 291
    .line 292
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    if-nez v4, :cond_f

    .line 297
    .line 298
    const-string v4, "p"

    .line 299
    .line 300
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v4

    .line 304
    if-nez v4, :cond_e

    .line 305
    .line 306
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->skipValue()V

    .line 307
    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_e
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextInt()I

    .line 311
    .line 312
    .line 313
    move-result v9

    .line 314
    goto :goto_5

    .line 315
    :cond_f
    move-object/from16 v4, p0

    .line 316
    .line 317
    invoke-static {v4, v0, v9}, Lcom/bytedance/adsdk/oa/lw/moa;->uef(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;I)Lcom/bytedance/adsdk/oa/yo/uef/yo;

    .line 318
    .line 319
    .line 320
    move-result-object v12

    .line 321
    goto :goto_5

    .line 322
    :cond_10
    move-object/from16 v4, p0

    .line 323
    .line 324
    invoke-virtual {v4}, Landroid/util/JsonReader;->endObject()V

    .line 325
    .line 326
    .line 327
    goto :goto_3

    .line 328
    :pswitch_a
    move-object/from16 v4, p0

    .line 329
    .line 330
    invoke-static/range {p0 .. p1}, Lcom/bytedance/adsdk/oa/lw/moa;->yo(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;)Lcom/bytedance/adsdk/oa/yo/uef/ivm;

    .line 331
    .line 332
    .line 333
    move-result-object v14

    .line 334
    goto/16 :goto_3

    .line 335
    .line 336
    :pswitch_b
    move-object/from16 v4, p0

    .line 337
    .line 338
    invoke-virtual {v4}, Landroid/util/JsonReader;->beginArray()V

    .line 339
    .line 340
    .line 341
    :goto_6
    invoke-virtual {v4}, Landroid/util/JsonReader;->hasNext()Z

    .line 342
    .line 343
    .line 344
    move-result v9

    .line 345
    if-eqz v9, :cond_17

    .line 346
    .line 347
    invoke-virtual {v4}, Landroid/util/JsonReader;->beginObject()V

    .line 348
    .line 349
    .line 350
    const/4 v9, 0x0

    .line 351
    const/4 v10, 0x0

    .line 352
    :goto_7
    invoke-virtual {v4}, Landroid/util/JsonReader;->hasNext()Z

    .line 353
    .line 354
    .line 355
    move-result v23

    .line 356
    if-eqz v23, :cond_13

    .line 357
    .line 358
    invoke-virtual {v4}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v5

    .line 362
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    const-string v4, "n"

    .line 366
    .line 367
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v4

    .line 371
    if-nez v4, :cond_12

    .line 372
    .line 373
    const-string v4, "v"

    .line 374
    .line 375
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v4

    .line 379
    if-nez v4, :cond_11

    .line 380
    .line 381
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->skipValue()V

    .line 382
    .line 383
    .line 384
    :goto_8
    move-object/from16 v4, p0

    .line 385
    .line 386
    const/4 v5, 0x1

    .line 387
    goto :goto_7

    .line 388
    :cond_11
    invoke-static/range {p0 .. p1}, Lcom/bytedance/adsdk/oa/lw/moa;->uef(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;)Lcom/bytedance/adsdk/oa/yo/uef/oa;

    .line 389
    .line 390
    .line 391
    move-result-object v10

    .line 392
    goto :goto_8

    .line 393
    :cond_12
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v9

    .line 397
    goto :goto_8

    .line 398
    :cond_13
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->endObject()V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v4

    .line 405
    if-eqz v4, :cond_14

    .line 406
    .line 407
    move-object/from16 v4, p0

    .line 408
    .line 409
    move-object/from16 v19, v10

    .line 410
    .line 411
    const/4 v5, 0x1

    .line 412
    goto :goto_6

    .line 413
    :cond_14
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v4

    .line 417
    if-nez v4, :cond_15

    .line 418
    .line 419
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-result v4

    .line 423
    if-eqz v4, :cond_16

    .line 424
    .line 425
    :cond_15
    const/4 v4, 0x1

    .line 426
    goto :goto_9

    .line 427
    :cond_16
    const/4 v4, 0x1

    .line 428
    goto :goto_a

    .line 429
    :goto_9
    invoke-virtual {v0, v4}, Lcom/bytedance/adsdk/oa/xs;->uef(Z)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    :goto_a
    move v5, v4

    .line 436
    move-object/from16 v4, p0

    .line 437
    .line 438
    goto :goto_6

    .line 439
    :cond_17
    move v4, v5

    .line 440
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->endArray()V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 444
    .line 445
    .line 446
    move-result v5

    .line 447
    if-ne v5, v4, :cond_c

    .line 448
    .line 449
    const/4 v5, 0x0

    .line 450
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v9

    .line 454
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    :goto_b
    move v5, v4

    .line 458
    goto/16 :goto_3

    .line 459
    .line 460
    :cond_18
    if-nez v8, :cond_19

    .line 461
    .line 462
    new-instance v8, Lcom/bytedance/adsdk/oa/yo/uef/moa;

    .line 463
    .line 464
    new-instance v0, Lcom/bytedance/adsdk/oa/xs/uef;

    .line 465
    .line 466
    const/16 v1, 0x64

    .line 467
    .line 468
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    invoke-direct {v0, v1}, Lcom/bytedance/adsdk/oa/xs/uef;-><init>(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    invoke-direct {v8, v0}, Lcom/bytedance/adsdk/oa/yo/uef/moa;-><init>(Ljava/util/List;)V

    .line 480
    .line 481
    .line 482
    :cond_19
    move-object v10, v8

    .line 483
    move-object v9, v12

    .line 484
    move-object v12, v14

    .line 485
    move-object/from16 v14, v17

    .line 486
    .line 487
    move-object/from16 v17, v6

    .line 488
    .line 489
    new-instance v6, Lcom/bytedance/adsdk/oa/yo/oa/ivm;

    .line 490
    .line 491
    move-object v8, v11

    .line 492
    move-object v11, v13

    .line 493
    move-object v13, v15

    .line 494
    move-object/from16 v15, v18

    .line 495
    .line 496
    move-object/from16 v18, v19

    .line 497
    .line 498
    move/from16 v19, v20

    .line 499
    .line 500
    invoke-direct/range {v6 .. v19}, Lcom/bytedance/adsdk/oa/yo/oa/ivm;-><init>(Ljava/lang/String;Lcom/bytedance/adsdk/oa/yo/oa/xs;Lcom/bytedance/adsdk/oa/yo/uef/yo;Lcom/bytedance/adsdk/oa/yo/uef/moa;Lcom/bytedance/adsdk/oa/yo/uef/ivm;Lcom/bytedance/adsdk/oa/yo/uef/ivm;Lcom/bytedance/adsdk/oa/yo/uef/oa;Lcom/bytedance/adsdk/oa/yo/oa/sy$uef;Lcom/bytedance/adsdk/oa/yo/oa/sy$oa;FLjava/util/List;Lcom/bytedance/adsdk/oa/yo/uef/oa;Z)V

    .line 501
    .line 502
    .line 503
    return-object v6

    .line 504
    nop

    .line 505
    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_b
        0x65 -> :sswitch_a
        0x67 -> :sswitch_9
        0x6f -> :sswitch_8
        0x73 -> :sswitch_7
        0x74 -> :sswitch_6
        0x77 -> :sswitch_5
        0xcfc -> :sswitch_4
        0xd77 -> :sswitch_3
        0xd7e -> :sswitch_2
        0xd9f -> :sswitch_1
        0xdbf -> :sswitch_0
    .end sparse-switch

    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    :pswitch_data_0
    .packed-switch 0x0
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
