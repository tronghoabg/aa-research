.class Lcom/bytedance/adsdk/oa/lw/af;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static uef(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;)Lcom/bytedance/adsdk/oa/yo/oa/sy;
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v1, "o"

    .line 2
    .line 3
    const-string v2, "d"

    .line 4
    .line 5
    const/4 v4, 0x1

    .line 6
    new-instance v8, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    move v14, v6

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v10, 0x0

    .line 16
    const/4 v11, 0x0

    .line 17
    const/4 v12, 0x0

    .line 18
    const/4 v13, 0x0

    .line 19
    const/4 v15, 0x0

    .line 20
    const/16 v16, 0x0

    .line 21
    .line 22
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v17

    .line 26
    if-eqz v17, :cond_11

    .line 27
    .line 28
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v18

    .line 39
    sparse-switch v18, :sswitch_data_0

    .line 40
    .line 41
    .line 42
    :goto_1
    const/4 v0, -0x1

    .line 43
    goto/16 :goto_2

    .line 44
    .line 45
    :sswitch_0
    const-string v3, "nm"

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_0

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_0
    const/16 v0, 0x8

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :sswitch_1
    const-string v3, "ml"

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    const/4 v0, 0x7

    .line 67
    goto :goto_2

    .line 68
    :sswitch_2
    const-string v3, "lj"

    .line 69
    .line 70
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_2

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    const/4 v0, 0x6

    .line 78
    goto :goto_2

    .line 79
    :sswitch_3
    const-string v3, "lc"

    .line 80
    .line 81
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_3

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    const/4 v0, 0x5

    .line 89
    goto :goto_2

    .line 90
    :sswitch_4
    const-string v3, "hd"

    .line 91
    .line 92
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-nez v0, :cond_4

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    const/4 v0, 0x4

    .line 100
    goto :goto_2

    .line 101
    :sswitch_5
    const-string v3, "w"

    .line 102
    .line 103
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_5

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    const/4 v0, 0x3

    .line 111
    goto :goto_2

    .line 112
    :sswitch_6
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_6

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_6
    const/4 v0, 0x2

    .line 120
    goto :goto_2

    .line 121
    :sswitch_7
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-nez v0, :cond_7

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_7
    move v0, v4

    .line 129
    goto :goto_2

    .line 130
    :sswitch_8
    const-string v3, "c"

    .line 131
    .line 132
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-nez v0, :cond_8

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_8
    const/4 v0, 0x0

    .line 140
    :goto_2
    packed-switch v0, :pswitch_data_0

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->skipValue()V

    .line 144
    .line 145
    .line 146
    move-object/from16 v0, p1

    .line 147
    .line 148
    move-object v3, v6

    .line 149
    :cond_9
    const/4 v5, 0x0

    .line 150
    goto :goto_3

    .line 151
    :pswitch_0
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :pswitch_1
    move-object v3, v6

    .line 158
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextDouble()D

    .line 159
    .line 160
    .line 161
    move-result-wide v5

    .line 162
    double-to-float v14, v5

    .line 163
    :goto_3
    move-object v6, v3

    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :pswitch_2
    move-object v3, v6

    .line 167
    invoke-static {}, Lcom/bytedance/adsdk/oa/yo/oa/sy$oa;->values()[Lcom/bytedance/adsdk/oa/yo/oa/sy$oa;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextInt()I

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    sub-int/2addr v6, v4

    .line 176
    aget-object v15, v5, v6

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :pswitch_3
    move-object v3, v6

    .line 180
    invoke-static {}, Lcom/bytedance/adsdk/oa/yo/oa/sy$uef;->values()[Lcom/bytedance/adsdk/oa/yo/oa/sy$uef;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextInt()I

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    sub-int/2addr v6, v4

    .line 189
    aget-object v13, v5, v6

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :pswitch_4
    move-object v3, v6

    .line 193
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextBoolean()Z

    .line 194
    .line 195
    .line 196
    move-result v16

    .line 197
    goto/16 :goto_0

    .line 198
    .line 199
    :pswitch_5
    move-object v3, v6

    .line 200
    invoke-static/range {p0 .. p1}, Lcom/bytedance/adsdk/oa/lw/moa;->uef(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;)Lcom/bytedance/adsdk/oa/yo/uef/oa;

    .line 201
    .line 202
    .line 203
    move-result-object v12

    .line 204
    goto/16 :goto_0

    .line 205
    .line 206
    :pswitch_6
    invoke-static/range {p0 .. p1}, Lcom/bytedance/adsdk/oa/lw/moa;->oa(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;)Lcom/bytedance/adsdk/oa/yo/uef/moa;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    goto/16 :goto_0

    .line 211
    .line 212
    :pswitch_7
    move-object v3, v6

    .line 213
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->beginArray()V

    .line 214
    .line 215
    .line 216
    :goto_4
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    if-eqz v5, :cond_10

    .line 221
    .line 222
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->beginObject()V

    .line 223
    .line 224
    .line 225
    const/4 v5, 0x0

    .line 226
    const/4 v6, 0x0

    .line 227
    :goto_5
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->hasNext()Z

    .line 228
    .line 229
    .line 230
    move-result v19

    .line 231
    if-eqz v19, :cond_c

    .line 232
    .line 233
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    const-string v7, "n"

    .line 241
    .line 242
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v7

    .line 246
    if-nez v7, :cond_b

    .line 247
    .line 248
    const-string v7, "v"

    .line 249
    .line 250
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-nez v0, :cond_a

    .line 255
    .line 256
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->skipValue()V

    .line 257
    .line 258
    .line 259
    goto :goto_5

    .line 260
    :cond_a
    invoke-static/range {p0 .. p1}, Lcom/bytedance/adsdk/oa/lw/moa;->uef(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;)Lcom/bytedance/adsdk/oa/yo/uef/oa;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    goto :goto_5

    .line 265
    :cond_b
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    goto :goto_5

    .line 270
    :cond_c
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->endObject()V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    sparse-switch v0, :sswitch_data_1

    .line 281
    .line 282
    .line 283
    :goto_6
    const/4 v0, -0x1

    .line 284
    goto :goto_7

    .line 285
    :sswitch_9
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-nez v0, :cond_d

    .line 290
    .line 291
    goto :goto_6

    .line 292
    :cond_d
    const/4 v0, 0x2

    .line 293
    goto :goto_7

    .line 294
    :sswitch_a
    const-string v0, "g"

    .line 295
    .line 296
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    if-nez v0, :cond_e

    .line 301
    .line 302
    goto :goto_6

    .line 303
    :cond_e
    move v0, v4

    .line 304
    goto :goto_7

    .line 305
    :sswitch_b
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-nez v0, :cond_f

    .line 310
    .line 311
    goto :goto_6

    .line 312
    :cond_f
    const/4 v0, 0x0

    .line 313
    :goto_7
    packed-switch v0, :pswitch_data_1

    .line 314
    .line 315
    .line 316
    move-object/from16 v0, p1

    .line 317
    .line 318
    goto :goto_4

    .line 319
    :pswitch_8
    move-object v10, v6

    .line 320
    goto :goto_4

    .line 321
    :pswitch_9
    move-object/from16 v0, p1

    .line 322
    .line 323
    invoke-virtual {v0, v4}, Lcom/bytedance/adsdk/oa/xs;->uef(Z)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    goto :goto_4

    .line 330
    :cond_10
    move-object/from16 v0, p1

    .line 331
    .line 332
    invoke-virtual/range {p0 .. p0}, Landroid/util/JsonReader;->endArray()V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 336
    .line 337
    .line 338
    move-result v5

    .line 339
    if-ne v5, v4, :cond_9

    .line 340
    .line 341
    const/4 v5, 0x0

    .line 342
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    goto/16 :goto_3

    .line 350
    .line 351
    :pswitch_a
    move-object/from16 v0, p1

    .line 352
    .line 353
    move-object v3, v6

    .line 354
    const/4 v5, 0x0

    .line 355
    invoke-static/range {p0 .. p1}, Lcom/bytedance/adsdk/oa/lw/moa;->xs(Landroid/util/JsonReader;Lcom/bytedance/adsdk/oa/xs;)Lcom/bytedance/adsdk/oa/yo/uef/uef;

    .line 356
    .line 357
    .line 358
    move-result-object v11

    .line 359
    goto/16 :goto_0

    .line 360
    .line 361
    :cond_11
    move-object v3, v6

    .line 362
    if-nez v3, :cond_12

    .line 363
    .line 364
    new-instance v6, Lcom/bytedance/adsdk/oa/yo/uef/moa;

    .line 365
    .line 366
    new-instance v0, Lcom/bytedance/adsdk/oa/xs/uef;

    .line 367
    .line 368
    const/16 v1, 0x64

    .line 369
    .line 370
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    invoke-direct {v0, v1}, Lcom/bytedance/adsdk/oa/xs/uef;-><init>(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-direct {v6, v0}, Lcom/bytedance/adsdk/oa/yo/uef/moa;-><init>(Ljava/util/List;)V

    .line 382
    .line 383
    .line 384
    goto :goto_8

    .line 385
    :cond_12
    move-object v6, v3

    .line 386
    :goto_8
    new-instance v5, Lcom/bytedance/adsdk/oa/yo/oa/sy;

    .line 387
    .line 388
    move-object v7, v10

    .line 389
    move-object v10, v6

    .line 390
    move-object v6, v9

    .line 391
    move-object v9, v11

    .line 392
    move-object v11, v12

    .line 393
    move-object v12, v13

    .line 394
    move-object v13, v15

    .line 395
    move/from16 v15, v16

    .line 396
    .line 397
    invoke-direct/range {v5 .. v15}, Lcom/bytedance/adsdk/oa/yo/oa/sy;-><init>(Ljava/lang/String;Lcom/bytedance/adsdk/oa/yo/uef/oa;Ljava/util/List;Lcom/bytedance/adsdk/oa/yo/uef/uef;Lcom/bytedance/adsdk/oa/yo/uef/moa;Lcom/bytedance/adsdk/oa/yo/uef/oa;Lcom/bytedance/adsdk/oa/yo/oa/sy$uef;Lcom/bytedance/adsdk/oa/yo/oa/sy$oa;FZ)V

    .line 398
    .line 399
    .line 400
    return-object v5

    .line 401
    :sswitch_data_0
    .sparse-switch
        0x63 -> :sswitch_8
        0x64 -> :sswitch_7
        0x6f -> :sswitch_6
        0x77 -> :sswitch_5
        0xcfc -> :sswitch_4
        0xd77 -> :sswitch_3
        0xd7e -> :sswitch_2
        0xd9f -> :sswitch_1
        0xdbf -> :sswitch_0
    .end sparse-switch

    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    :sswitch_data_1
    .sparse-switch
        0x64 -> :sswitch_b
        0x67 -> :sswitch_a
        0x6f -> :sswitch_9
    .end sparse-switch

    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_9
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method
