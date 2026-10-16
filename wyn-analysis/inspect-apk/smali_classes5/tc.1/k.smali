.class public final Ltc/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:I

.field public final g:LN1/P;

.field public final h:Ljava/lang/Integer;

.field public final i:Ljava/lang/String;

.field public final j:LS3/i;

.field public final k:[Ljava/lang/String;

.field public final l:[Ltc/k;


# direct methods
.method public constructor <init>(ZZZZZILN1/P;Ljava/lang/Integer;Ljava/lang/String;LS3/i;[Ljava/lang/String;[Ltc/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Ltc/k;->a:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Ltc/k;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Ltc/k;->c:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Ltc/k;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Ltc/k;->e:Z

    .line 13
    .line 14
    iput p6, p0, Ltc/k;->f:I

    .line 15
    .line 16
    iput-object p7, p0, Ltc/k;->g:LN1/P;

    .line 17
    .line 18
    iput-object p8, p0, Ltc/k;->h:Ljava/lang/Integer;

    .line 19
    .line 20
    iput-object p9, p0, Ltc/k;->i:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p10, p0, Ltc/k;->j:LS3/i;

    .line 23
    .line 24
    iput-object p11, p0, Ltc/k;->k:[Ljava/lang/String;

    .line 25
    .line 26
    iput-object p12, p0, Ltc/k;->l:[Ltc/k;

    .line 27
    .line 28
    return-void
.end method

.method public static a(Lorg/json/JSONObject;)Ltc/k;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "username"

    .line 4
    .line 5
    const-string v2, "creditCardExpirationYear"

    .line 6
    .line 7
    const-string v3, "creditCardExpirationDate"

    .line 8
    .line 9
    const-string v4, "creditCardNumber"

    .line 10
    .line 11
    const-string v5, "gender"

    .line 12
    .line 13
    const-string v6, "creditCardExpirationDay"

    .line 14
    .line 15
    const-string v7, "creditCardSecurityCode"

    .line 16
    .line 17
    const-string v8, "newPassword"

    .line 18
    .line 19
    const-string v9, "creditCardExpirationMonth"

    .line 20
    .line 21
    const-string v12, "name"

    .line 22
    .line 23
    const/16 v16, 0x5

    .line 24
    .line 25
    const/16 v17, 0xd

    .line 26
    .line 27
    const/16 v18, 0x0

    .line 28
    .line 29
    const/16 v19, 0x7

    .line 30
    .line 31
    const/16 v20, 0x6

    .line 32
    .line 33
    const/16 v22, 0x0

    .line 34
    .line 35
    const-string v11, "inputAction"

    .line 36
    .line 37
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v11

    .line 41
    if-eqz v11, :cond_3d

    .line 42
    .line 43
    const/16 v23, 0x4

    .line 44
    .line 45
    const-string v15, "fields"

    .line 46
    .line 47
    invoke-virtual {v0, v15}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v24

    .line 51
    if-nez v24, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0, v15}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 54
    .line 55
    .line 56
    move-result-object v15

    .line 57
    const/16 v24, 0x3

    .line 58
    .line 59
    invoke-virtual {v15}, Lorg/json/JSONArray;->length()I

    .line 60
    .line 61
    .line 62
    move-result v13

    .line 63
    const/16 v25, 0x2

    .line 64
    .line 65
    new-array v14, v13, [Ltc/k;

    .line 66
    .line 67
    move/from16 v10, v22

    .line 68
    .line 69
    const/16 v26, 0x1

    .line 70
    .line 71
    :goto_0
    if-ge v10, v13, :cond_0

    .line 72
    .line 73
    invoke-virtual {v15, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    move-result-object v27

    .line 77
    invoke-static/range {v27 .. v27}, Ltc/k;->a(Lorg/json/JSONObject;)Ltc/k;

    .line 78
    .line 79
    .line 80
    move-result-object v27

    .line 81
    aput-object v27, v14, v10

    .line 82
    .line 83
    add-int/lit8 v10, v10, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    move-object/from16 v39, v14

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    const/16 v24, 0x3

    .line 90
    .line 91
    const/16 v25, 0x2

    .line 92
    .line 93
    const/16 v26, 0x1

    .line 94
    .line 95
    move-object/from16 v39, v18

    .line 96
    .line 97
    :goto_1
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v13

    .line 105
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 106
    .line 107
    .line 108
    move-result v14

    .line 109
    sparse-switch v14, :sswitch_data_0

    .line 110
    .line 111
    .line 112
    :goto_2
    const/4 v11, -0x1

    .line 113
    goto/16 :goto_3

    .line 114
    .line 115
    :sswitch_0
    const-string v14, "TextInputAction.previous"

    .line 116
    .line 117
    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v11

    .line 121
    if-nez v11, :cond_2

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_2
    move/from16 v11, v19

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :sswitch_1
    const-string v14, "TextInputAction.newline"

    .line 128
    .line 129
    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v11

    .line 133
    if-nez v11, :cond_3

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_3
    move/from16 v11, v20

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :sswitch_2
    const-string v14, "TextInputAction.go"

    .line 140
    .line 141
    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    if-nez v11, :cond_4

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_4
    move/from16 v11, v16

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :sswitch_3
    const-string v14, "TextInputAction.search"

    .line 152
    .line 153
    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v11

    .line 157
    if-nez v11, :cond_5

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_5
    move/from16 v11, v23

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :sswitch_4
    const-string v14, "TextInputAction.send"

    .line 164
    .line 165
    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v11

    .line 169
    if-nez v11, :cond_6

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_6
    move/from16 v11, v24

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :sswitch_5
    const-string v14, "TextInputAction.none"

    .line 176
    .line 177
    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v11

    .line 181
    if-nez v11, :cond_7

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_7
    move/from16 v11, v25

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :sswitch_6
    const-string v14, "TextInputAction.next"

    .line 188
    .line 189
    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v11

    .line 193
    if-nez v11, :cond_8

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_8
    move/from16 v11, v26

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :sswitch_7
    const-string v14, "TextInputAction.done"

    .line 200
    .line 201
    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v11

    .line 205
    if-nez v11, :cond_9

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_9
    move/from16 v11, v22

    .line 209
    .line 210
    :goto_3
    packed-switch v11, :pswitch_data_0

    .line 211
    .line 212
    .line 213
    move-object/from16 v35, v13

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :pswitch_0
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v10

    .line 220
    :goto_4
    :pswitch_1
    move-object/from16 v35, v10

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :pswitch_2
    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 224
    .line 225
    .line 226
    move-result-object v10

    .line 227
    goto :goto_4

    .line 228
    :pswitch_3
    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    goto :goto_4

    .line 233
    :pswitch_4
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 234
    .line 235
    .line 236
    move-result-object v10

    .line 237
    goto :goto_4

    .line 238
    :pswitch_5
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object v10

    .line 242
    goto :goto_4

    .line 243
    :pswitch_6
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 244
    .line 245
    .line 246
    move-result-object v10

    .line 247
    goto :goto_4

    .line 248
    :goto_5
    new-instance v10, Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 251
    .line 252
    .line 253
    const-string v11, "contentCommitMimeTypes"

    .line 254
    .line 255
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 256
    .line 257
    .line 258
    move-result v13

    .line 259
    if-eqz v13, :cond_a

    .line 260
    .line 261
    move-object/from16 v11, v18

    .line 262
    .line 263
    goto :goto_6

    .line 264
    :cond_a
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 265
    .line 266
    .line 267
    move-result-object v11

    .line 268
    :goto_6
    if-eqz v11, :cond_b

    .line 269
    .line 270
    move/from16 v13, v22

    .line 271
    .line 272
    :goto_7
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    .line 273
    .line 274
    .line 275
    move-result v14

    .line 276
    if-ge v13, v14, :cond_b

    .line 277
    .line 278
    invoke-virtual {v11, v13}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v14

    .line 282
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    add-int/lit8 v13, v13, 0x1

    .line 286
    .line 287
    goto :goto_7

    .line 288
    :cond_b
    new-instance v27, Ltc/k;

    .line 289
    .line 290
    const-string v11, "obscureText"

    .line 291
    .line 292
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 293
    .line 294
    .line 295
    move-result v28

    .line 296
    const-string v11, "autocorrect"

    .line 297
    .line 298
    move/from16 v13, v26

    .line 299
    .line 300
    invoke-virtual {v0, v11, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 301
    .line 302
    .line 303
    move-result v29

    .line 304
    const-string v11, "enableSuggestions"

    .line 305
    .line 306
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 307
    .line 308
    .line 309
    move-result v30

    .line 310
    const-string v11, "enableIMEPersonalizedLearning"

    .line 311
    .line 312
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 313
    .line 314
    .line 315
    move-result v31

    .line 316
    const-string v11, "enableDeltaModel"

    .line 317
    .line 318
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 319
    .line 320
    .line 321
    move-result v32

    .line 322
    const-string v11, "textCapitalization"

    .line 323
    .line 324
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v11

    .line 328
    invoke-static/range {v23 .. v23}, LA/f;->g(I)[I

    .line 329
    .line 330
    .line 331
    move-result-object v13

    .line 332
    array-length v14, v13

    .line 333
    move/from16 v15, v22

    .line 334
    .line 335
    :goto_8
    if-ge v15, v14, :cond_3c

    .line 336
    .line 337
    move-object/from16 v33, v13

    .line 338
    .line 339
    aget v13, v33, v15

    .line 340
    .line 341
    move/from16 v34, v14

    .line 342
    .line 343
    const/4 v14, 0x1

    .line 344
    if-eq v13, v14, :cond_f

    .line 345
    .line 346
    move/from16 v14, v25

    .line 347
    .line 348
    if-eq v13, v14, :cond_e

    .line 349
    .line 350
    move/from16 v14, v24

    .line 351
    .line 352
    if-eq v13, v14, :cond_d

    .line 353
    .line 354
    move/from16 v14, v23

    .line 355
    .line 356
    if-ne v13, v14, :cond_c

    .line 357
    .line 358
    const-string v23, "TextCapitalization.none"

    .line 359
    .line 360
    :goto_9
    move-object/from16 v14, v23

    .line 361
    .line 362
    goto :goto_a

    .line 363
    :cond_c
    throw v18

    .line 364
    :cond_d
    move/from16 v14, v23

    .line 365
    .line 366
    const-string v23, "TextCapitalization.sentences"

    .line 367
    .line 368
    goto :goto_9

    .line 369
    :cond_e
    move/from16 v14, v23

    .line 370
    .line 371
    const-string v23, "TextCapitalization.words"

    .line 372
    .line 373
    goto :goto_9

    .line 374
    :cond_f
    move/from16 v14, v23

    .line 375
    .line 376
    const-string v23, "TextCapitalization.characters"

    .line 377
    .line 378
    goto :goto_9

    .line 379
    :goto_a
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v14

    .line 383
    if-eqz v14, :cond_3b

    .line 384
    .line 385
    const-string v11, "inputType"

    .line 386
    .line 387
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 388
    .line 389
    .line 390
    move-result-object v11

    .line 391
    new-instance v14, LN1/P;

    .line 392
    .line 393
    invoke-virtual {v11, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v15

    .line 397
    move/from16 v23, v13

    .line 398
    .line 399
    invoke-static/range {v17 .. v17}, LA/f;->g(I)[I

    .line 400
    .line 401
    .line 402
    move-result-object v13

    .line 403
    move-object/from16 v37, v10

    .line 404
    .line 405
    array-length v10, v13

    .line 406
    move-object/from16 v33, v13

    .line 407
    .line 408
    move/from16 v13, v22

    .line 409
    .line 410
    :goto_b
    if-ge v13, v10, :cond_3a

    .line 411
    .line 412
    move/from16 v34, v10

    .line 413
    .line 414
    aget v10, v33, v13

    .line 415
    .line 416
    packed-switch v10, :pswitch_data_1

    .line 417
    .line 418
    .line 419
    throw v18

    .line 420
    :pswitch_7
    const-string v38, "TextInputType.twitter"

    .line 421
    .line 422
    :goto_c
    move/from16 v40, v13

    .line 423
    .line 424
    move-object/from16 v13, v38

    .line 425
    .line 426
    goto :goto_d

    .line 427
    :pswitch_8
    const-string v38, "TextInputType.webSearch"

    .line 428
    .line 429
    goto :goto_c

    .line 430
    :pswitch_9
    const-string v38, "TextInputType.none"

    .line 431
    .line 432
    goto :goto_c

    .line 433
    :pswitch_a
    const-string v38, "TextInputType.visiblePassword"

    .line 434
    .line 435
    goto :goto_c

    .line 436
    :pswitch_b
    const-string v38, "TextInputType.url"

    .line 437
    .line 438
    goto :goto_c

    .line 439
    :pswitch_c
    const-string v38, "TextInputType.emailAddress"

    .line 440
    .line 441
    goto :goto_c

    .line 442
    :pswitch_d
    const-string v38, "TextInputType.multiline"

    .line 443
    .line 444
    goto :goto_c

    .line 445
    :pswitch_e
    const-string v38, "TextInputType.phone"

    .line 446
    .line 447
    goto :goto_c

    .line 448
    :pswitch_f
    const-string v38, "TextInputType.number"

    .line 449
    .line 450
    goto :goto_c

    .line 451
    :pswitch_10
    const-string v38, "TextInputType.address"

    .line 452
    .line 453
    goto :goto_c

    .line 454
    :pswitch_11
    const-string v38, "TextInputType.name"

    .line 455
    .line 456
    goto :goto_c

    .line 457
    :pswitch_12
    const-string v38, "TextInputType.datetime"

    .line 458
    .line 459
    goto :goto_c

    .line 460
    :pswitch_13
    const-string v38, "TextInputType.text"

    .line 461
    .line 462
    goto :goto_c

    .line 463
    :goto_d
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v13

    .line 467
    if-eqz v13, :cond_39

    .line 468
    .line 469
    const-string v13, "signed"

    .line 470
    .line 471
    move/from16 v15, v22

    .line 472
    .line 473
    invoke-virtual {v11, v13, v15}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 474
    .line 475
    .line 476
    move-result v13

    .line 477
    move-object/from16 v22, v9

    .line 478
    .line 479
    const-string v9, "decimal"

    .line 480
    .line 481
    invoke-virtual {v11, v9, v15}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 482
    .line 483
    .line 484
    move-result v9

    .line 485
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 486
    .line 487
    .line 488
    iput v10, v14, LN1/P;->a:I

    .line 489
    .line 490
    iput-boolean v13, v14, LN1/P;->b:Z

    .line 491
    .line 492
    iput-boolean v9, v14, LN1/P;->c:Z

    .line 493
    .line 494
    const-string v9, "actionLabel"

    .line 495
    .line 496
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 497
    .line 498
    .line 499
    move-result v10

    .line 500
    if-eqz v10, :cond_10

    .line 501
    .line 502
    move-object/from16 v9, v18

    .line 503
    .line 504
    goto :goto_e

    .line 505
    :cond_10
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v9

    .line 509
    :goto_e
    const-string v10, "autofill"

    .line 510
    .line 511
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 512
    .line 513
    .line 514
    move-result v11

    .line 515
    if-eqz v11, :cond_11

    .line 516
    .line 517
    move-object/from16 v34, v9

    .line 518
    .line 519
    move-object/from16 v38, v14

    .line 520
    .line 521
    goto/16 :goto_19

    .line 522
    .line 523
    :cond_11
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    const-string v10, "uniqueIdentifier"

    .line 528
    .line 529
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v10

    .line 533
    const-string v11, "hints"

    .line 534
    .line 535
    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 536
    .line 537
    .line 538
    move-result-object v11

    .line 539
    const-string v13, "hintText"

    .line 540
    .line 541
    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 542
    .line 543
    .line 544
    move-result v33

    .line 545
    if-eqz v33, :cond_12

    .line 546
    .line 547
    :goto_f
    move-object/from16 v13, v18

    .line 548
    .line 549
    goto :goto_10

    .line 550
    :cond_12
    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v18

    .line 554
    goto :goto_f

    .line 555
    :goto_10
    const-string v15, "editingValue"

    .line 556
    .line 557
    invoke-virtual {v0, v15}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    .line 562
    .line 563
    .line 564
    move-result v15

    .line 565
    new-array v15, v15, [Ljava/lang/String;

    .line 566
    .line 567
    move-object/from16 p0, v0

    .line 568
    .line 569
    move-object/from16 v34, v9

    .line 570
    .line 571
    const/4 v0, 0x0

    .line 572
    :goto_11
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    .line 573
    .line 574
    .line 575
    move-result v9

    .line 576
    if-ge v0, v9, :cond_38

    .line 577
    .line 578
    invoke-virtual {v11, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v9

    .line 582
    move/from16 v18, v0

    .line 583
    .line 584
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 585
    .line 586
    move-object/from16 v38, v14

    .line 587
    .line 588
    const/16 v14, 0x1a

    .line 589
    .line 590
    if-ge v0, v14, :cond_13

    .line 591
    .line 592
    move-object/from16 v0, v22

    .line 593
    .line 594
    goto/16 :goto_18

    .line 595
    .line 596
    :cond_13
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    .line 600
    .line 601
    .line 602
    move-result v0

    .line 603
    sparse-switch v0, :sswitch_data_1

    .line 604
    .line 605
    .line 606
    :goto_12
    move-object/from16 v0, v22

    .line 607
    .line 608
    :goto_13
    const/4 v14, -0x1

    .line 609
    goto/16 :goto_17

    .line 610
    .line 611
    :sswitch_8
    const-string v0, "birthdayDay"

    .line 612
    .line 613
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result v0

    .line 617
    if-nez v0, :cond_14

    .line 618
    .line 619
    goto :goto_12

    .line 620
    :cond_14
    const/16 v0, 0x23

    .line 621
    .line 622
    goto/16 :goto_14

    .line 623
    .line 624
    :sswitch_9
    const-string v0, "postalCode"

    .line 625
    .line 626
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    move-result v0

    .line 630
    if-nez v0, :cond_15

    .line 631
    .line 632
    goto :goto_12

    .line 633
    :cond_15
    const/16 v0, 0x22

    .line 634
    .line 635
    goto/16 :goto_14

    .line 636
    .line 637
    :sswitch_a
    const-string v0, "postalAddressExtended"

    .line 638
    .line 639
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    move-result v0

    .line 643
    if-nez v0, :cond_16

    .line 644
    .line 645
    goto :goto_12

    .line 646
    :cond_16
    const/16 v0, 0x21

    .line 647
    .line 648
    goto/16 :goto_14

    .line 649
    .line 650
    :sswitch_b
    const-string v0, "postalAddress"

    .line 651
    .line 652
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    move-result v0

    .line 656
    if-nez v0, :cond_17

    .line 657
    .line 658
    goto :goto_12

    .line 659
    :cond_17
    const/16 v0, 0x20

    .line 660
    .line 661
    goto/16 :goto_14

    .line 662
    .line 663
    :sswitch_c
    const-string v0, "givenName"

    .line 664
    .line 665
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 666
    .line 667
    .line 668
    move-result v0

    .line 669
    if-nez v0, :cond_18

    .line 670
    .line 671
    goto :goto_12

    .line 672
    :cond_18
    const/16 v0, 0x1f

    .line 673
    .line 674
    goto/16 :goto_14

    .line 675
    .line 676
    :sswitch_d
    const-string v0, "password"

    .line 677
    .line 678
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    move-result v0

    .line 682
    if-nez v0, :cond_19

    .line 683
    .line 684
    goto :goto_12

    .line 685
    :cond_19
    const/16 v0, 0x1e

    .line 686
    .line 687
    goto/16 :goto_14

    .line 688
    .line 689
    :sswitch_e
    const-string v0, "birthday"

    .line 690
    .line 691
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    move-result v0

    .line 695
    if-nez v0, :cond_1a

    .line 696
    .line 697
    goto :goto_12

    .line 698
    :cond_1a
    const/16 v0, 0x1d

    .line 699
    .line 700
    goto/16 :goto_14

    .line 701
    .line 702
    :sswitch_f
    const-string v0, "newUsername"

    .line 703
    .line 704
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 705
    .line 706
    .line 707
    move-result v0

    .line 708
    if-nez v0, :cond_1b

    .line 709
    .line 710
    goto :goto_12

    .line 711
    :cond_1b
    const/16 v0, 0x1c

    .line 712
    .line 713
    goto/16 :goto_14

    .line 714
    .line 715
    :sswitch_10
    const-string v0, "telephoneNumber"

    .line 716
    .line 717
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 718
    .line 719
    .line 720
    move-result v0

    .line 721
    if-nez v0, :cond_1c

    .line 722
    .line 723
    goto :goto_12

    .line 724
    :cond_1c
    const/16 v0, 0x1b

    .line 725
    .line 726
    goto/16 :goto_14

    .line 727
    .line 728
    :sswitch_11
    const-string v0, "familyName"

    .line 729
    .line 730
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 731
    .line 732
    .line 733
    move-result v0

    .line 734
    if-nez v0, :cond_32

    .line 735
    .line 736
    goto/16 :goto_12

    .line 737
    .line 738
    :sswitch_12
    const-string v0, "birthdayMonth"

    .line 739
    .line 740
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 741
    .line 742
    .line 743
    move-result v0

    .line 744
    if-nez v0, :cond_1d

    .line 745
    .line 746
    goto/16 :goto_12

    .line 747
    .line 748
    :cond_1d
    const/16 v0, 0x19

    .line 749
    .line 750
    goto/16 :goto_14

    .line 751
    .line 752
    :sswitch_13
    const-string v0, "addressState"

    .line 753
    .line 754
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 755
    .line 756
    .line 757
    move-result v0

    .line 758
    if-nez v0, :cond_1e

    .line 759
    .line 760
    goto/16 :goto_12

    .line 761
    .line 762
    :cond_1e
    const/16 v0, 0x18

    .line 763
    .line 764
    goto/16 :goto_14

    .line 765
    .line 766
    :sswitch_14
    const-string v0, "email"

    .line 767
    .line 768
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 769
    .line 770
    .line 771
    move-result v0

    .line 772
    if-nez v0, :cond_1f

    .line 773
    .line 774
    goto/16 :goto_12

    .line 775
    .line 776
    :cond_1f
    const/16 v0, 0x17

    .line 777
    .line 778
    goto/16 :goto_14

    .line 779
    .line 780
    :sswitch_15
    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 781
    .line 782
    .line 783
    move-result v0

    .line 784
    if-nez v0, :cond_20

    .line 785
    .line 786
    goto/16 :goto_12

    .line 787
    .line 788
    :cond_20
    const/16 v0, 0x16

    .line 789
    .line 790
    goto/16 :goto_14

    .line 791
    .line 792
    :sswitch_16
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 793
    .line 794
    .line 795
    move-result v0

    .line 796
    if-nez v0, :cond_21

    .line 797
    .line 798
    goto/16 :goto_12

    .line 799
    .line 800
    :cond_21
    const/16 v0, 0x15

    .line 801
    .line 802
    goto/16 :goto_14

    .line 803
    .line 804
    :sswitch_17
    const-string v0, "telephoneNumberCountryCode"

    .line 805
    .line 806
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 807
    .line 808
    .line 809
    move-result v0

    .line 810
    if-nez v0, :cond_22

    .line 811
    .line 812
    goto/16 :goto_12

    .line 813
    .line 814
    :cond_22
    const/16 v0, 0x14

    .line 815
    .line 816
    goto/16 :goto_14

    .line 817
    .line 818
    :sswitch_18
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 819
    .line 820
    .line 821
    move-result v0

    .line 822
    if-nez v0, :cond_23

    .line 823
    .line 824
    goto/16 :goto_12

    .line 825
    .line 826
    :cond_23
    const/16 v0, 0x13

    .line 827
    .line 828
    goto/16 :goto_14

    .line 829
    .line 830
    :sswitch_19
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 831
    .line 832
    .line 833
    move-result v0

    .line 834
    if-nez v0, :cond_24

    .line 835
    .line 836
    goto/16 :goto_12

    .line 837
    .line 838
    :cond_24
    const/16 v0, 0x12

    .line 839
    .line 840
    goto/16 :goto_14

    .line 841
    .line 842
    :sswitch_1a
    const-string v0, "nameSuffix"

    .line 843
    .line 844
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 845
    .line 846
    .line 847
    move-result v0

    .line 848
    if-nez v0, :cond_25

    .line 849
    .line 850
    goto/16 :goto_12

    .line 851
    .line 852
    :cond_25
    const/16 v0, 0x11

    .line 853
    .line 854
    goto/16 :goto_14

    .line 855
    .line 856
    :sswitch_1b
    const-string v0, "middleName"

    .line 857
    .line 858
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 859
    .line 860
    .line 861
    move-result v0

    .line 862
    if-nez v0, :cond_26

    .line 863
    .line 864
    goto/16 :goto_12

    .line 865
    .line 866
    :cond_26
    const/16 v0, 0x10

    .line 867
    .line 868
    goto/16 :goto_14

    .line 869
    .line 870
    :sswitch_1c
    const-string v0, "namePrefix"

    .line 871
    .line 872
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 873
    .line 874
    .line 875
    move-result v0

    .line 876
    if-nez v0, :cond_27

    .line 877
    .line 878
    goto/16 :goto_12

    .line 879
    .line 880
    :cond_27
    const/16 v0, 0xf

    .line 881
    .line 882
    goto :goto_14

    .line 883
    :sswitch_1d
    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 884
    .line 885
    .line 886
    move-result v0

    .line 887
    if-nez v0, :cond_28

    .line 888
    .line 889
    goto/16 :goto_12

    .line 890
    .line 891
    :cond_28
    const/16 v0, 0xe

    .line 892
    .line 893
    goto :goto_14

    .line 894
    :sswitch_1e
    const-string v0, "postalAddressExtendedPostalCode"

    .line 895
    .line 896
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 897
    .line 898
    .line 899
    move-result v0

    .line 900
    if-nez v0, :cond_29

    .line 901
    .line 902
    goto/16 :goto_12

    .line 903
    .line 904
    :cond_29
    move/from16 v14, v17

    .line 905
    .line 906
    goto/16 :goto_15

    .line 907
    .line 908
    :sswitch_1f
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 909
    .line 910
    .line 911
    move-result v0

    .line 912
    if-nez v0, :cond_2a

    .line 913
    .line 914
    goto/16 :goto_12

    .line 915
    .line 916
    :cond_2a
    const/16 v0, 0xc

    .line 917
    .line 918
    goto :goto_14

    .line 919
    :sswitch_20
    const-string v0, "addressCity"

    .line 920
    .line 921
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 922
    .line 923
    .line 924
    move-result v0

    .line 925
    if-nez v0, :cond_2b

    .line 926
    .line 927
    goto/16 :goto_12

    .line 928
    .line 929
    :cond_2b
    const/16 v0, 0xb

    .line 930
    .line 931
    goto :goto_14

    .line 932
    :sswitch_21
    const-string v0, "middleInitial"

    .line 933
    .line 934
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 935
    .line 936
    .line 937
    move-result v0

    .line 938
    if-nez v0, :cond_2c

    .line 939
    .line 940
    goto/16 :goto_12

    .line 941
    .line 942
    :cond_2c
    const/16 v0, 0xa

    .line 943
    .line 944
    goto :goto_14

    .line 945
    :sswitch_22
    const-string v0, "countryName"

    .line 946
    .line 947
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 948
    .line 949
    .line 950
    move-result v0

    .line 951
    if-nez v0, :cond_2d

    .line 952
    .line 953
    goto/16 :goto_12

    .line 954
    .line 955
    :cond_2d
    const/16 v0, 0x9

    .line 956
    .line 957
    goto :goto_14

    .line 958
    :sswitch_23
    const-string v0, "telephoneNumberDevice"

    .line 959
    .line 960
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 961
    .line 962
    .line 963
    move-result v0

    .line 964
    if-nez v0, :cond_2e

    .line 965
    .line 966
    goto/16 :goto_12

    .line 967
    .line 968
    :cond_2e
    const/16 v0, 0x8

    .line 969
    .line 970
    :goto_14
    move v14, v0

    .line 971
    goto :goto_15

    .line 972
    :sswitch_24
    const-string v0, "fullStreetAddress"

    .line 973
    .line 974
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 975
    .line 976
    .line 977
    move-result v0

    .line 978
    if-nez v0, :cond_2f

    .line 979
    .line 980
    goto/16 :goto_12

    .line 981
    .line 982
    :cond_2f
    move/from16 v14, v19

    .line 983
    .line 984
    goto :goto_15

    .line 985
    :sswitch_25
    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 986
    .line 987
    .line 988
    move-result v0

    .line 989
    if-nez v0, :cond_30

    .line 990
    .line 991
    goto/16 :goto_12

    .line 992
    .line 993
    :cond_30
    move/from16 v14, v20

    .line 994
    .line 995
    goto :goto_15

    .line 996
    :sswitch_26
    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 997
    .line 998
    .line 999
    move-result v0

    .line 1000
    if-nez v0, :cond_31

    .line 1001
    .line 1002
    goto/16 :goto_12

    .line 1003
    .line 1004
    :cond_31
    move/from16 v14, v16

    .line 1005
    .line 1006
    :cond_32
    :goto_15
    move-object/from16 v0, v22

    .line 1007
    .line 1008
    goto :goto_17

    .line 1009
    :sswitch_27
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1010
    .line 1011
    .line 1012
    move-result v0

    .line 1013
    if-nez v0, :cond_33

    .line 1014
    .line 1015
    goto/16 :goto_12

    .line 1016
    .line 1017
    :cond_33
    move-object/from16 v0, v22

    .line 1018
    .line 1019
    const/4 v14, 0x4

    .line 1020
    goto :goto_17

    .line 1021
    :sswitch_28
    const-string v0, "telephoneNumberNational"

    .line 1022
    .line 1023
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1024
    .line 1025
    .line 1026
    move-result v0

    .line 1027
    if-nez v0, :cond_34

    .line 1028
    .line 1029
    goto/16 :goto_12

    .line 1030
    .line 1031
    :cond_34
    move-object/from16 v0, v22

    .line 1032
    .line 1033
    const/4 v14, 0x3

    .line 1034
    goto :goto_17

    .line 1035
    :sswitch_29
    move-object/from16 v0, v22

    .line 1036
    .line 1037
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1038
    .line 1039
    .line 1040
    move-result v21

    .line 1041
    if-nez v21, :cond_35

    .line 1042
    .line 1043
    goto :goto_16

    .line 1044
    :cond_35
    const/4 v14, 0x2

    .line 1045
    goto :goto_17

    .line 1046
    :sswitch_2a
    move-object/from16 v0, v22

    .line 1047
    .line 1048
    const-string v14, "oneTimeCode"

    .line 1049
    .line 1050
    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1051
    .line 1052
    .line 1053
    move-result v14

    .line 1054
    if-nez v14, :cond_36

    .line 1055
    .line 1056
    goto :goto_16

    .line 1057
    :cond_36
    const/4 v14, 0x1

    .line 1058
    goto :goto_17

    .line 1059
    :sswitch_2b
    move-object/from16 v0, v22

    .line 1060
    .line 1061
    const-string v14, "birthdayYear"

    .line 1062
    .line 1063
    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1064
    .line 1065
    .line 1066
    move-result v14

    .line 1067
    if-nez v14, :cond_37

    .line 1068
    .line 1069
    :goto_16
    goto/16 :goto_13

    .line 1070
    .line 1071
    :cond_37
    const/4 v14, 0x0

    .line 1072
    :goto_17
    packed-switch v14, :pswitch_data_2

    .line 1073
    .line 1074
    .line 1075
    goto/16 :goto_18

    .line 1076
    .line 1077
    :pswitch_14
    const-string v9, "birthDateDay"

    .line 1078
    .line 1079
    goto/16 :goto_18

    .line 1080
    .line 1081
    :pswitch_15
    const-string v9, "postalCode"

    .line 1082
    .line 1083
    goto/16 :goto_18

    .line 1084
    .line 1085
    :pswitch_16
    const-string v9, "extendedAddress"

    .line 1086
    .line 1087
    goto/16 :goto_18

    .line 1088
    .line 1089
    :pswitch_17
    const-string v9, "postalAddress"

    .line 1090
    .line 1091
    goto/16 :goto_18

    .line 1092
    .line 1093
    :pswitch_18
    const-string v9, "personGivenName"

    .line 1094
    .line 1095
    goto/16 :goto_18

    .line 1096
    .line 1097
    :pswitch_19
    const-string v9, "password"

    .line 1098
    .line 1099
    goto/16 :goto_18

    .line 1100
    .line 1101
    :pswitch_1a
    const-string v9, "birthDateFull"

    .line 1102
    .line 1103
    goto/16 :goto_18

    .line 1104
    .line 1105
    :pswitch_1b
    const-string v9, "newUsername"

    .line 1106
    .line 1107
    goto/16 :goto_18

    .line 1108
    .line 1109
    :pswitch_1c
    const-string v9, "phoneNumber"

    .line 1110
    .line 1111
    goto/16 :goto_18

    .line 1112
    .line 1113
    :pswitch_1d
    const-string v9, "personFamilyName"

    .line 1114
    .line 1115
    goto/16 :goto_18

    .line 1116
    .line 1117
    :pswitch_1e
    const-string v9, "birthDateMonth"

    .line 1118
    .line 1119
    goto/16 :goto_18

    .line 1120
    .line 1121
    :pswitch_1f
    const-string v9, "addressRegion"

    .line 1122
    .line 1123
    goto/16 :goto_18

    .line 1124
    .line 1125
    :pswitch_20
    const-string v9, "emailAddress"

    .line 1126
    .line 1127
    goto :goto_18

    .line 1128
    :pswitch_21
    const-string v9, "personName"

    .line 1129
    .line 1130
    goto :goto_18

    .line 1131
    :pswitch_22
    move-object v9, v1

    .line 1132
    goto :goto_18

    .line 1133
    :pswitch_23
    const-string v9, "phoneCountryCode"

    .line 1134
    .line 1135
    goto :goto_18

    .line 1136
    :pswitch_24
    move-object v9, v2

    .line 1137
    goto :goto_18

    .line 1138
    :pswitch_25
    move-object v9, v3

    .line 1139
    goto :goto_18

    .line 1140
    :pswitch_26
    const-string v9, "personNameSuffix"

    .line 1141
    .line 1142
    goto :goto_18

    .line 1143
    :pswitch_27
    const-string v9, "personMiddleName"

    .line 1144
    .line 1145
    goto :goto_18

    .line 1146
    :pswitch_28
    const-string v9, "personNamePrefix"

    .line 1147
    .line 1148
    goto :goto_18

    .line 1149
    :pswitch_29
    move-object v9, v4

    .line 1150
    goto :goto_18

    .line 1151
    :pswitch_2a
    const-string v9, "extendedPostalCode"

    .line 1152
    .line 1153
    goto :goto_18

    .line 1154
    :pswitch_2b
    move-object v9, v5

    .line 1155
    goto :goto_18

    .line 1156
    :pswitch_2c
    const-string v9, "addressLocality"

    .line 1157
    .line 1158
    goto :goto_18

    .line 1159
    :pswitch_2d
    const-string v9, "personMiddleInitial"

    .line 1160
    .line 1161
    goto :goto_18

    .line 1162
    :pswitch_2e
    const-string v9, "addressCountry"

    .line 1163
    .line 1164
    goto :goto_18

    .line 1165
    :pswitch_2f
    const-string v9, "phoneNumberDevice"

    .line 1166
    .line 1167
    goto :goto_18

    .line 1168
    :pswitch_30
    const-string v9, "streetAddress"

    .line 1169
    .line 1170
    goto :goto_18

    .line 1171
    :pswitch_31
    move-object v9, v6

    .line 1172
    goto :goto_18

    .line 1173
    :pswitch_32
    move-object v9, v7

    .line 1174
    goto :goto_18

    .line 1175
    :pswitch_33
    move-object v9, v8

    .line 1176
    goto :goto_18

    .line 1177
    :pswitch_34
    const-string v9, "phoneNational"

    .line 1178
    .line 1179
    goto :goto_18

    .line 1180
    :pswitch_35
    move-object v9, v0

    .line 1181
    goto :goto_18

    .line 1182
    :pswitch_36
    const-string v9, "smsOTPCode"

    .line 1183
    .line 1184
    goto :goto_18

    .line 1185
    :pswitch_37
    const-string v9, "birthDateYear"

    .line 1186
    .line 1187
    :goto_18
    aput-object v9, v15, v18

    .line 1188
    .line 1189
    const/16 v26, 0x1

    .line 1190
    .line 1191
    add-int/lit8 v9, v18, 0x1

    .line 1192
    .line 1193
    move-object/from16 v22, v0

    .line 1194
    .line 1195
    move v0, v9

    .line 1196
    move-object/from16 v14, v38

    .line 1197
    .line 1198
    goto/16 :goto_11

    .line 1199
    .line 1200
    :cond_38
    move-object/from16 v38, v14

    .line 1201
    .line 1202
    new-instance v0, LS3/i;

    .line 1203
    .line 1204
    invoke-static/range {p0 .. p0}, Ltc/l;->a(Lorg/json/JSONObject;)Ltc/l;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v1

    .line 1208
    invoke-direct {v0, v10, v15, v13, v1}, LS3/i;-><init>(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ltc/l;)V

    .line 1209
    .line 1210
    .line 1211
    move-object/from16 v18, v0

    .line 1212
    .line 1213
    :goto_19
    invoke-virtual/range {v37 .. v37}, Ljava/util/ArrayList;->size()I

    .line 1214
    .line 1215
    .line 1216
    move-result v0

    .line 1217
    new-array v0, v0, [Ljava/lang/String;

    .line 1218
    .line 1219
    move-object/from16 v9, v37

    .line 1220
    .line 1221
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v0

    .line 1225
    check-cast v0, [Ljava/lang/String;

    .line 1226
    .line 1227
    move-object/from16 v37, v18

    .line 1228
    .line 1229
    move/from16 v33, v23

    .line 1230
    .line 1231
    move-object/from16 v36, v34

    .line 1232
    .line 1233
    move-object/from16 v34, v38

    .line 1234
    .line 1235
    move-object/from16 v38, v0

    .line 1236
    .line 1237
    invoke-direct/range {v27 .. v39}, Ltc/k;-><init>(ZZZZZILN1/P;Ljava/lang/Integer;Ljava/lang/String;LS3/i;[Ljava/lang/String;[Ltc/k;)V

    .line 1238
    .line 1239
    .line 1240
    return-object v27

    .line 1241
    :cond_39
    move-object v10, v9

    .line 1242
    move-object/from16 v38, v14

    .line 1243
    .line 1244
    move-object/from16 v9, v37

    .line 1245
    .line 1246
    const/16 v26, 0x1

    .line 1247
    .line 1248
    add-int/lit8 v13, v40, 0x1

    .line 1249
    .line 1250
    move-object v9, v10

    .line 1251
    move/from16 v10, v34

    .line 1252
    .line 1253
    goto/16 :goto_b

    .line 1254
    .line 1255
    :cond_3a
    new-instance v0, Ljava/lang/NoSuchFieldException;

    .line 1256
    .line 1257
    const-string v1, "No such TextInputType: "

    .line 1258
    .line 1259
    invoke-static {v1, v15}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v1

    .line 1263
    invoke-direct {v0, v1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 1264
    .line 1265
    .line 1266
    throw v0

    .line 1267
    :cond_3b
    move-object/from16 v26, v10

    .line 1268
    .line 1269
    move-object v10, v9

    .line 1270
    move-object/from16 v9, v26

    .line 1271
    .line 1272
    const/16 v26, 0x1

    .line 1273
    .line 1274
    add-int/lit8 v15, v15, 0x1

    .line 1275
    .line 1276
    move-object v13, v10

    .line 1277
    move-object v10, v9

    .line 1278
    move-object v9, v13

    .line 1279
    move-object/from16 v13, v33

    .line 1280
    .line 1281
    move/from16 v14, v34

    .line 1282
    .line 1283
    const/16 v23, 0x4

    .line 1284
    .line 1285
    const/16 v24, 0x3

    .line 1286
    .line 1287
    const/16 v25, 0x2

    .line 1288
    .line 1289
    goto/16 :goto_8

    .line 1290
    .line 1291
    :cond_3c
    new-instance v0, Ljava/lang/NoSuchFieldException;

    .line 1292
    .line 1293
    const-string v1, "No such TextCapitalization: "

    .line 1294
    .line 1295
    invoke-static {v1, v11}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v1

    .line 1299
    invoke-direct {v0, v1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 1300
    .line 1301
    .line 1302
    throw v0

    .line 1303
    :cond_3d
    new-instance v0, Lorg/json/JSONException;

    .line 1304
    .line 1305
    const-string v1, "Configuration JSON missing \'inputAction\' property."

    .line 1306
    .line 1307
    invoke-direct {v0, v1}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    .line 1308
    .line 1309
    .line 1310
    throw v0

    :sswitch_data_0
    .sparse-switch
        -0x2bf37e83 -> :sswitch_7
        -0x2bef1712 -> :sswitch_6
        -0x2beef2cd -> :sswitch_5
        -0x2becd27d -> :sswitch_4
        0x1bf830e3 -> :sswitch_3
        0x4a02ada3 -> :sswitch_2
        0x5bc225b9 -> :sswitch_1
        0x7dcba372 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
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
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x7ab827a6 -> :sswitch_2b
        -0x72476d20 -> :sswitch_2a
        -0x6df5a7d8 -> :sswitch_29
        -0x6cd04ac1 -> :sswitch_28
        -0x6c8dd7a5 -> :sswitch_27
        -0x68c2726a -> :sswitch_26
        -0x6446fcbc -> :sswitch_25
        -0x62e1a7de -> :sswitch_24
        -0x5d6852dd -> :sswitch_23
        -0x580574bf -> :sswitch_22
        -0x5443ec11 -> :sswitch_21
        -0x521f7081 -> :sswitch_20
        -0x4a7a0d3f -> :sswitch_1f
        -0x46b1d806 -> :sswitch_1e
        -0x449b65ae -> :sswitch_1d
        -0x31d43b03 -> :sswitch_1c
        -0x30c50a40 -> :sswitch_1b
        -0x2c8af644 -> :sswitch_1a
        -0x24989afa -> :sswitch_19
        -0x248f026b -> :sswitch_18
        -0x20bc980a -> :sswitch_17
        -0xfd6772a -> :sswitch_16
        0x337a8b -> :sswitch_15
        0x5c24b9c -> :sswitch_14
        0xf1790fd -> :sswitch_13
        0x230ed603 -> :sswitch_12
        0x2f98f80f -> :sswitch_11
        0x352e686d -> :sswitch_10
        0x3b11f696 -> :sswitch_f
        0x3fbd627d -> :sswitch_e
        0x4889ba9b -> :sswitch_d
        0x578fdfa8 -> :sswitch_c
        0x631a4ca9 -> :sswitch_b
        0x728d6502 -> :sswitch_a
        0x77dfc158 -> :sswitch_9
        0x77e93bdf -> :sswitch_8
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
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
    .end packed-switch
.end method
