.class public Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/uef;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static uef(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)Lcom/bytedance/sdk/openadsdk/core/dz/yo;
    .locals 29
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "HTMLResource"

    .line 6
    .line 7
    const-string v3, "CompanionClickTracking"

    .line 8
    .line 9
    const-string v4, "StaticResource"

    .line 10
    .line 11
    const-string v5, "TrackingEvents"

    .line 12
    .line 13
    const-string v6, "CompanionClickThrough"

    .line 14
    .line 15
    const-string v7, "IFrameResource"

    .line 16
    .line 17
    const/4 v8, 0x2

    .line 18
    const/4 v9, 0x3

    .line 19
    const/4 v10, 0x0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->uef(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 23
    .line 24
    .line 25
    return-object v10

    .line 26
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object v11

    .line 30
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 31
    .line 32
    .line 33
    move-result-object v11

    .line 34
    iget v12, v11, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 35
    .line 36
    iget v13, v11, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 37
    .line 38
    int-to-float v12, v12

    .line 39
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 40
    .line 41
    div-float/2addr v12, v11

    .line 42
    float-to-int v14, v12

    .line 43
    int-to-float v12, v13

    .line 44
    div-float/2addr v12, v11

    .line 45
    float-to-int v15, v12

    .line 46
    const/4 v11, 0x1

    .line 47
    move-object v12, v10

    .line 48
    :goto_0
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 49
    .line 50
    .line 51
    move-result v13

    .line 52
    if-ne v13, v9, :cond_2

    .line 53
    .line 54
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v13

    .line 58
    const-string v10, "CompanionAds"

    .line 59
    .line 60
    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    if-nez v10, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    return-object v12

    .line 68
    :cond_2
    :goto_1
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 69
    .line 70
    .line 71
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    if-ne v10, v8, :cond_1c

    .line 76
    .line 77
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    const-string v13, "Companion"

    .line 82
    .line 83
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    if-eqz v10, :cond_1c

    .line 88
    .line 89
    sget-object v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->xs:Ljava/lang/String;

    .line 90
    .line 91
    const-string v8, "width"

    .line 92
    .line 93
    invoke-interface {v1, v10, v8}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    invoke-static {v8}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    const-string v9, "height"

    .line 102
    .line 103
    invoke-interface {v1, v10, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    invoke-static {v9}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    const/16 v10, 0x12c

    .line 112
    .line 113
    if-lt v8, v10, :cond_3

    .line 114
    .line 115
    const/16 v10, 0xfa

    .line 116
    .line 117
    if-ge v9, v10, :cond_4

    .line 118
    .line 119
    :cond_3
    move-object/from16 v23, v2

    .line 120
    .line 121
    move-object/from16 v24, v3

    .line 122
    .line 123
    move/from16 v20, v11

    .line 124
    .line 125
    move-object/from16 v21, v12

    .line 126
    .line 127
    const/4 v11, 0x3

    .line 128
    goto/16 :goto_12

    .line 129
    .line 130
    :cond_4
    new-instance v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;

    .line 131
    .line 132
    invoke-direct {v10}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;-><init>()V

    .line 133
    .line 134
    .line 135
    :goto_2
    move/from16 v21, v8

    .line 136
    .line 137
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    move/from16 v22, v9

    .line 142
    .line 143
    const/4 v9, 0x3

    .line 144
    if-ne v8, v9, :cond_5

    .line 145
    .line 146
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v8

    .line 154
    if-nez v8, :cond_6

    .line 155
    .line 156
    :cond_5
    move/from16 v8, v21

    .line 157
    .line 158
    move/from16 v9, v22

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_6
    iget-object v8, v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->uef:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    if-nez v8, :cond_7

    .line 168
    .line 169
    iget v8, v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->xs:F

    .line 170
    .line 171
    cmpl-float v8, v8, v11

    .line 172
    .line 173
    if-ltz v8, :cond_7

    .line 174
    .line 175
    new-instance v20, Lcom/bytedance/sdk/openadsdk/core/dz/yo;

    .line 176
    .line 177
    iget-object v8, v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->oa:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;

    .line 178
    .line 179
    iget-object v9, v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->yo:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;

    .line 180
    .line 181
    iget-object v11, v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->uef:Ljava/lang/String;

    .line 182
    .line 183
    iget-object v12, v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->lw:Ljava/util/List;

    .line 184
    .line 185
    iget-object v13, v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->ivm:Ljava/util/List;

    .line 186
    .line 187
    move-object/from16 v23, v8

    .line 188
    .line 189
    iget-object v8, v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->moa:Ljava/lang/String;

    .line 190
    .line 191
    move-object/from16 v28, v8

    .line 192
    .line 193
    move-object/from16 v24, v9

    .line 194
    .line 195
    move-object/from16 v25, v11

    .line 196
    .line 197
    move-object/from16 v26, v12

    .line 198
    .line 199
    move-object/from16 v27, v13

    .line 200
    .line 201
    invoke-direct/range {v20 .. v28}, Lcom/bytedance/sdk/openadsdk/core/dz/yo;-><init>(IILcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    iget v8, v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->xs:F

    .line 205
    .line 206
    move v11, v8

    .line 207
    move-object/from16 v12, v20

    .line 208
    .line 209
    :cond_7
    const/4 v8, 0x2

    .line 210
    const/4 v9, 0x3

    .line 211
    :goto_3
    const/4 v10, 0x0

    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :goto_4
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 215
    .line 216
    .line 217
    move/from16 v20, v11

    .line 218
    .line 219
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 220
    .line 221
    .line 222
    move-result v11

    .line 223
    move-object/from16 v21, v12

    .line 224
    .line 225
    const/4 v12, 0x2

    .line 226
    if-ne v11, v12, :cond_11

    .line 227
    .line 228
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v11

    .line 232
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    const/4 v12, -0x1

    .line 236
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 237
    .line 238
    .line 239
    move-result v16

    .line 240
    sparse-switch v16, :sswitch_data_0

    .line 241
    .line 242
    .line 243
    goto :goto_6

    .line 244
    :sswitch_0
    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v11

    .line 248
    if-nez v11, :cond_8

    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_8
    const/4 v11, 0x5

    .line 252
    goto :goto_5

    .line 253
    :sswitch_1
    invoke-virtual {v11, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v11

    .line 257
    if-nez v11, :cond_9

    .line 258
    .line 259
    goto :goto_6

    .line 260
    :cond_9
    const/4 v11, 0x4

    .line 261
    goto :goto_5

    .line 262
    :sswitch_2
    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v11

    .line 266
    if-nez v11, :cond_a

    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_a
    const/4 v12, 0x3

    .line 270
    goto :goto_6

    .line 271
    :sswitch_3
    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v11

    .line 275
    if-nez v11, :cond_b

    .line 276
    .line 277
    goto :goto_6

    .line 278
    :cond_b
    const/4 v12, 0x2

    .line 279
    goto :goto_6

    .line 280
    :sswitch_4
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v11

    .line 284
    if-nez v11, :cond_c

    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_c
    const/4 v11, 0x1

    .line 288
    goto :goto_5

    .line 289
    :sswitch_5
    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v11

    .line 293
    if-nez v11, :cond_d

    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_d
    const/4 v11, 0x0

    .line 297
    :goto_5
    move v12, v11

    .line 298
    :goto_6
    packed-switch v12, :pswitch_data_0

    .line 299
    .line 300
    .line 301
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->uef(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 302
    .line 303
    .line 304
    move-object/from16 v23, v2

    .line 305
    .line 306
    move-object/from16 v24, v3

    .line 307
    .line 308
    move-object/from16 v22, v13

    .line 309
    .line 310
    goto/16 :goto_e

    .line 311
    .line 312
    :pswitch_0
    sget-object v11, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;->uef:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;

    .line 313
    .line 314
    invoke-static {v0, v8, v9, v11}, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef;->uef(Landroid/content/Context;IILcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;)Landroid/graphics/Point;

    .line 315
    .line 316
    .line 317
    move-result-object v12

    .line 318
    move-object/from16 v18, v11

    .line 319
    .line 320
    iget v11, v12, Landroid/graphics/Point;->x:I

    .line 321
    .line 322
    iget v12, v12, Landroid/graphics/Point;->y:I

    .line 323
    .line 324
    sget-object v19, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;->uef:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;

    .line 325
    .line 326
    move/from16 v16, v11

    .line 327
    .line 328
    move/from16 v17, v12

    .line 329
    .line 330
    invoke-static/range {v14 .. v19}, Lcom/bytedance/sdk/openadsdk/core/dz/yo;->uef(IIIILcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;)F

    .line 331
    .line 332
    .line 333
    move-result v11

    .line 334
    move-object/from16 v22, v13

    .line 335
    .line 336
    move/from16 v16, v14

    .line 337
    .line 338
    move-object/from16 v12, v18

    .line 339
    .line 340
    move-object/from16 v13, v19

    .line 341
    .line 342
    invoke-static {v1, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v14

    .line 346
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 347
    .line 348
    .line 349
    move-result v17

    .line 350
    if-nez v17, :cond_10

    .line 351
    .line 352
    move/from16 v17, v15

    .line 353
    .line 354
    iget v15, v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->xs:F

    .line 355
    .line 356
    cmpg-float v15, v11, v15

    .line 357
    .line 358
    if-lez v15, :cond_e

    .line 359
    .line 360
    cmpg-float v15, v11, v20

    .line 361
    .line 362
    if-gtz v15, :cond_f

    .line 363
    .line 364
    :cond_e
    :goto_7
    const/4 v11, 0x3

    .line 365
    goto :goto_9

    .line 366
    :cond_f
    iput v11, v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->xs:F

    .line 367
    .line 368
    invoke-virtual {v10, v14, v13, v12}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;)V

    .line 369
    .line 370
    .line 371
    :goto_8
    move/from16 v14, v16

    .line 372
    .line 373
    move/from16 v15, v17

    .line 374
    .line 375
    move/from16 v11, v20

    .line 376
    .line 377
    move-object/from16 v12, v21

    .line 378
    .line 379
    move-object/from16 v13, v22

    .line 380
    .line 381
    goto/16 :goto_2

    .line 382
    .line 383
    :cond_10
    move/from16 v17, v15

    .line 384
    .line 385
    goto :goto_7

    .line 386
    :goto_9
    invoke-static {v1, v2, v11}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->uef(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)V

    .line 387
    .line 388
    .line 389
    goto :goto_8

    .line 390
    :pswitch_1
    move-object/from16 v22, v13

    .line 391
    .line 392
    move/from16 v16, v14

    .line 393
    .line 394
    move/from16 v17, v15

    .line 395
    .line 396
    invoke-static {v1, v3}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v11

    .line 400
    invoke-virtual {v10, v11}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->uef(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    :cond_11
    move/from16 v11, v20

    .line 404
    .line 405
    move-object/from16 v12, v21

    .line 406
    .line 407
    goto/16 :goto_2

    .line 408
    .line 409
    :pswitch_2
    move-object/from16 v22, v13

    .line 410
    .line 411
    move/from16 v16, v14

    .line 412
    .line 413
    move/from16 v17, v15

    .line 414
    .line 415
    sget-object v11, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;->uef:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;

    .line 416
    .line 417
    sget-object v11, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->xs:Ljava/lang/String;

    .line 418
    .line 419
    const-string v12, "creativeType"

    .line 420
    .line 421
    invoke-interface {v1, v11, v12}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v11

    .line 425
    invoke-virtual {v11}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v11

    .line 429
    sget-object v12, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef;->uef:Ljava/util/Set;

    .line 430
    .line 431
    invoke-interface {v12, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    move-result v13

    .line 435
    if-eqz v13, :cond_12

    .line 436
    .line 437
    sget-object v13, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;->oa:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;

    .line 438
    .line 439
    :goto_a
    move-object/from16 v19, v13

    .line 440
    .line 441
    goto :goto_b

    .line 442
    :cond_12
    sget-object v13, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;->yo:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;

    .line 443
    .line 444
    goto :goto_a

    .line 445
    :goto_b
    sget-object v13, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;->oa:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;

    .line 446
    .line 447
    invoke-static {v0, v8, v9, v13}, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef;->uef(Landroid/content/Context;IILcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;)Landroid/graphics/Point;

    .line 448
    .line 449
    .line 450
    move-result-object v14

    .line 451
    iget v15, v14, Landroid/graphics/Point;->x:I

    .line 452
    .line 453
    iget v14, v14, Landroid/graphics/Point;->y:I

    .line 454
    .line 455
    move/from16 v18, v17

    .line 456
    .line 457
    move/from16 v17, v14

    .line 458
    .line 459
    move/from16 v14, v16

    .line 460
    .line 461
    move/from16 v16, v15

    .line 462
    .line 463
    move/from16 v15, v18

    .line 464
    .line 465
    move-object/from16 v18, v13

    .line 466
    .line 467
    invoke-static/range {v14 .. v19}, Lcom/bytedance/sdk/openadsdk/core/dz/yo;->uef(IIIILcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;)F

    .line 468
    .line 469
    .line 470
    move-result v13

    .line 471
    move-object/from16 v23, v2

    .line 472
    .line 473
    move-object/from16 v24, v3

    .line 474
    .line 475
    move-object/from16 v3, v18

    .line 476
    .line 477
    move-object/from16 v2, v19

    .line 478
    .line 479
    invoke-interface {v12, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v12

    .line 483
    if-nez v12, :cond_14

    .line 484
    .line 485
    sget-object v12, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef;->oa:Ljava/util/Set;

    .line 486
    .line 487
    invoke-interface {v12, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    move-result v11

    .line 491
    if-eqz v11, :cond_13

    .line 492
    .line 493
    goto :goto_c

    .line 494
    :cond_13
    const/4 v11, 0x0

    .line 495
    goto :goto_d

    .line 496
    :cond_14
    :goto_c
    invoke-static {v1, v4}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v11

    .line 500
    :goto_d
    iget v12, v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->xs:F

    .line 501
    .line 502
    cmpg-float v12, v13, v12

    .line 503
    .line 504
    if-ltz v12, :cond_15

    .line 505
    .line 506
    cmpg-float v12, v13, v20

    .line 507
    .line 508
    if-lez v12, :cond_15

    .line 509
    .line 510
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 511
    .line 512
    .line 513
    move-result v12

    .line 514
    if-eqz v12, :cond_16

    .line 515
    .line 516
    :cond_15
    const/4 v11, 0x3

    .line 517
    goto :goto_f

    .line 518
    :cond_16
    iput v13, v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->xs:F

    .line 519
    .line 520
    invoke-virtual {v10, v11, v2, v3}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;)V

    .line 521
    .line 522
    .line 523
    :cond_17
    :goto_e
    move/from16 v11, v20

    .line 524
    .line 525
    move-object/from16 v12, v21

    .line 526
    .line 527
    move-object/from16 v13, v22

    .line 528
    .line 529
    move-object/from16 v2, v23

    .line 530
    .line 531
    move-object/from16 v3, v24

    .line 532
    .line 533
    goto/16 :goto_2

    .line 534
    .line 535
    :goto_f
    invoke-static {v1, v4, v11}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->uef(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)V

    .line 536
    .line 537
    .line 538
    goto :goto_e

    .line 539
    :pswitch_3
    move-object/from16 v23, v2

    .line 540
    .line 541
    move-object/from16 v24, v3

    .line 542
    .line 543
    move-object/from16 v22, v13

    .line 544
    .line 545
    :cond_18
    :goto_10
    const/4 v11, 0x3

    .line 546
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 547
    .line 548
    .line 549
    move-result v2

    .line 550
    if-ne v2, v11, :cond_19

    .line 551
    .line 552
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v2

    .line 556
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    move-result v2

    .line 560
    if-nez v2, :cond_17

    .line 561
    .line 562
    :cond_19
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 563
    .line 564
    .line 565
    move-result v2

    .line 566
    const/4 v12, 0x2

    .line 567
    if-ne v2, v12, :cond_18

    .line 568
    .line 569
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    const-string v3, "Tracking"

    .line 574
    .line 575
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    move-result v2

    .line 579
    if-eqz v2, :cond_18

    .line 580
    .line 581
    invoke-static {v1, v3}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    invoke-virtual {v10, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->oa(Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    goto :goto_10

    .line 589
    :pswitch_4
    move-object/from16 v23, v2

    .line 590
    .line 591
    move-object/from16 v24, v3

    .line 592
    .line 593
    move-object/from16 v22, v13

    .line 594
    .line 595
    const/4 v12, 0x2

    .line 596
    invoke-static {v1, v6}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v2

    .line 600
    iput-object v2, v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->moa:Ljava/lang/String;

    .line 601
    .line 602
    move/from16 v11, v20

    .line 603
    .line 604
    move-object/from16 v12, v21

    .line 605
    .line 606
    move-object/from16 v2, v23

    .line 607
    .line 608
    goto/16 :goto_2

    .line 609
    .line 610
    :pswitch_5
    move-object/from16 v23, v2

    .line 611
    .line 612
    move-object/from16 v24, v3

    .line 613
    .line 614
    move-object/from16 v22, v13

    .line 615
    .line 616
    const/4 v12, 0x2

    .line 617
    sget-object v2, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;->uef:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;

    .line 618
    .line 619
    invoke-static {v0, v8, v9, v2}, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef;->uef(Landroid/content/Context;IILcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;)Landroid/graphics/Point;

    .line 620
    .line 621
    .line 622
    move-result-object v2

    .line 623
    iget v3, v2, Landroid/graphics/Point;->x:I

    .line 624
    .line 625
    iget v2, v2, Landroid/graphics/Point;->y:I

    .line 626
    .line 627
    sget-object v18, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;->yo:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;

    .line 628
    .line 629
    sget-object v19, Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;->uef:Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;

    .line 630
    .line 631
    move/from16 v17, v2

    .line 632
    .line 633
    move/from16 v16, v3

    .line 634
    .line 635
    invoke-static/range {v14 .. v19}, Lcom/bytedance/sdk/openadsdk/core/dz/yo;->uef(IIIILcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;)F

    .line 636
    .line 637
    .line 638
    move-result v2

    .line 639
    move-object/from16 v3, v18

    .line 640
    .line 641
    move-object/from16 v11, v19

    .line 642
    .line 643
    invoke-static {v1, v7}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->oa(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v13

    .line 647
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 648
    .line 649
    .line 650
    move-result v16

    .line 651
    if-nez v16, :cond_1a

    .line 652
    .line 653
    iget v12, v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->xs:F

    .line 654
    .line 655
    cmpg-float v12, v2, v12

    .line 656
    .line 657
    if-lez v12, :cond_1a

    .line 658
    .line 659
    cmpg-float v12, v2, v20

    .line 660
    .line 661
    if-gtz v12, :cond_1b

    .line 662
    .line 663
    :cond_1a
    const/4 v11, 0x3

    .line 664
    goto :goto_11

    .line 665
    :cond_1b
    iput v2, v10, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->xs:F

    .line 666
    .line 667
    invoke-virtual {v10, v13, v11, v3}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw$uef;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$uef;Lcom/bytedance/sdk/openadsdk/core/dz/yo/uef$oa;)V

    .line 668
    .line 669
    .line 670
    goto/16 :goto_e

    .line 671
    .line 672
    :goto_11
    invoke-static {v1, v7, v11}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->uef(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)V

    .line 673
    .line 674
    .line 675
    goto/16 :goto_e

    .line 676
    .line 677
    :goto_12
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/dz/uef/uef/lw;->uef(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 678
    .line 679
    .line 680
    goto :goto_13

    .line 681
    :cond_1c
    move-object/from16 v23, v2

    .line 682
    .line 683
    move-object/from16 v24, v3

    .line 684
    .line 685
    move/from16 v20, v11

    .line 686
    .line 687
    move-object/from16 v21, v12

    .line 688
    .line 689
    move v11, v9

    .line 690
    :goto_13
    move v9, v11

    .line 691
    move/from16 v11, v20

    .line 692
    .line 693
    move-object/from16 v12, v21

    .line 694
    .line 695
    move-object/from16 v2, v23

    .line 696
    .line 697
    move-object/from16 v3, v24

    .line 698
    .line 699
    const/4 v8, 0x2

    .line 700
    goto/16 :goto_3

    .line 701
    .line 702
    nop

    .line 703
    :sswitch_data_0
    .sparse-switch
        -0x165f3d2e -> :sswitch_5
        -0x14c116d7 -> :sswitch_4
        0x247392d0 -> :sswitch_3
        0x285474bc -> :sswitch_2
        0x6fec8cd3 -> :sswitch_1
        0x72ef4cd9 -> :sswitch_0
    .end sparse-switch

    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
