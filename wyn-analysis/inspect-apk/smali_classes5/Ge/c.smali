.class public abstract LGe/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/util/Map;)Ljava/util/LinkedHashMap;
    .locals 41

    .line 1
    new-instance v11, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-interface/range {p0 .. p0}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result v12

    .line 7
    invoke-static {v12}, Lff/B;->D(I)I

    .line 8
    .line 9
    .line 10
    move-result v12

    .line 11
    invoke-direct {v11, v12}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface/range {p0 .. p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v12

    .line 18
    check-cast v12, Ljava/lang/Iterable;

    .line 19
    .line 20
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v12

    .line 24
    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v13

    .line 28
    if-eqz v13, :cond_8

    .line 29
    .line 30
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v13

    .line 34
    check-cast v13, Ljava/util/Map$Entry;

    .line 35
    .line 36
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v14

    .line 40
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v13

    .line 44
    check-cast v13, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;

    .line 45
    .line 46
    const-string v15, "<this>"

    .line 47
    .line 48
    invoke-static {v13, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/16 v16, 0x8

    .line 52
    .line 53
    invoke-virtual {v13}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getId()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const/16 v17, 0x7

    .line 58
    .line 59
    new-instance v1, Lef/k;

    .line 60
    .line 61
    const/16 v18, 0x6

    .line 62
    .line 63
    const-string v2, "id"

    .line 64
    .line 65
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v13}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getStartedDate()Ljava/util/Date;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const/4 v2, 0x5

    .line 73
    const/16 v19, 0x4

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 76
    .line 77
    .line 78
    move-result-wide v3

    .line 79
    long-to-double v3, v3

    .line 80
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    new-instance v3, Lef/k;

    .line 85
    .line 86
    const-string v4, "startedTimestamp"

    .line 87
    .line 88
    invoke-direct {v3, v4, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v13}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getExpirationDate()Ljava/util/Date;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    move/from16 p0, v2

    .line 96
    .line 97
    move-object/from16 v20, v3

    .line 98
    .line 99
    if-eqz v0, :cond_0

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 102
    .line 103
    .line 104
    move-result-wide v2

    .line 105
    long-to-double v2, v2

    .line 106
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    goto :goto_1

    .line 111
    :cond_0
    const/4 v0, 0x0

    .line 112
    :goto_1
    new-instance v2, Lef/k;

    .line 113
    .line 114
    const-string v3, "expirationTimestamp"

    .line 115
    .line 116
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v13}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->isActive()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    new-instance v4, Lef/k;

    .line 128
    .line 129
    const/16 v21, 0x3

    .line 130
    .line 131
    const-string v5, "active"

    .line 132
    .line 133
    invoke-direct {v4, v5, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v13}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getSource()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    new-instance v5, Lef/k;

    .line 145
    .line 146
    const/16 v22, 0x2

    .line 147
    .line 148
    const-string v6, "source"

    .line 149
    .line 150
    invoke-direct {v5, v6, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v13}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getProductId()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    new-instance v6, Lef/k;

    .line 158
    .line 159
    const/16 v23, 0x1

    .line 160
    .line 161
    const-string v7, "productId"

    .line 162
    .line 163
    invoke-direct {v6, v7, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v13}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getRenewState()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->getType()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    new-instance v7, Lef/k;

    .line 175
    .line 176
    const/16 v24, 0x0

    .line 177
    .line 178
    const-string v8, "renewState"

    .line 179
    .line 180
    invoke-direct {v7, v8, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v13}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getRenewsCount()I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    new-instance v8, Lef/k;

    .line 192
    .line 193
    const-string v9, "renewsCount"

    .line 194
    .line 195
    invoke-direct {v8, v9, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v13}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getTrialStartDate()Ljava/util/Date;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    move-object/from16 v26, v11

    .line 203
    .line 204
    if-eqz v0, :cond_1

    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 207
    .line 208
    .line 209
    move-result-wide v10

    .line 210
    long-to-double v10, v10

    .line 211
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    goto :goto_2

    .line 216
    :cond_1
    const/4 v0, 0x0

    .line 217
    :goto_2
    new-instance v10, Lef/k;

    .line 218
    .line 219
    const-string v11, "trialStartTimestamp"

    .line 220
    .line 221
    invoke-direct {v10, v11, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v13}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getFirstPurchaseDate()Ljava/util/Date;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    move-object/from16 v27, v10

    .line 229
    .line 230
    if-eqz v0, :cond_2

    .line 231
    .line 232
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 233
    .line 234
    .line 235
    move-result-wide v9

    .line 236
    long-to-double v9, v9

    .line 237
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    goto :goto_3

    .line 242
    :cond_2
    const/4 v0, 0x0

    .line 243
    :goto_3
    new-instance v10, Lef/k;

    .line 244
    .line 245
    const-string v9, "firstPurchaseTimestamp"

    .line 246
    .line 247
    invoke-direct {v10, v9, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v13}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getLastPurchaseDate()Ljava/util/Date;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    move-object/from16 v28, v12

    .line 255
    .line 256
    if-eqz v0, :cond_3

    .line 257
    .line 258
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 259
    .line 260
    .line 261
    move-result-wide v11

    .line 262
    long-to-double v11, v11

    .line 263
    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    goto :goto_4

    .line 268
    :cond_3
    const/4 v0, 0x0

    .line 269
    :goto_4
    new-instance v11, Lef/k;

    .line 270
    .line 271
    const-string v12, "lastPurchaseTimestamp"

    .line 272
    .line 273
    invoke-direct {v11, v12, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v13}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getLastActivatedOfferCode()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    new-instance v12, Lef/k;

    .line 281
    .line 282
    const-string v9, "lastActivatedOfferCode"

    .line 283
    .line 284
    invoke-direct {v12, v9, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v13}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getAutoRenewDisableDate()Ljava/util/Date;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    move-object/from16 v30, v1

    .line 292
    .line 293
    if-eqz v0, :cond_4

    .line 294
    .line 295
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 296
    .line 297
    .line 298
    move-result-wide v0

    .line 299
    long-to-double v0, v0

    .line 300
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    goto :goto_5

    .line 305
    :cond_4
    const/4 v0, 0x0

    .line 306
    :goto_5
    new-instance v1, Lef/k;

    .line 307
    .line 308
    const-string v9, "autoRenewDisableTimestamp"

    .line 309
    .line 310
    invoke-direct {v1, v9, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v13}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getGrantType()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    new-instance v9, Lef/k;

    .line 322
    .line 323
    move-object/from16 v31, v1

    .line 324
    .line 325
    const-string v1, "grantType"

    .line 326
    .line 327
    invoke-direct {v9, v1, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v13}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getTransactions()Ljava/util/List;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    check-cast v0, Ljava/lang/Iterable;

    .line 335
    .line 336
    new-instance v1, Ljava/util/ArrayList;

    .line 337
    .line 338
    move-object/from16 v29, v2

    .line 339
    .line 340
    const/16 v13, 0xa

    .line 341
    .line 342
    invoke-static {v0, v13}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    move-object v13, v9

    .line 347
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 348
    .line 349
    .line 350
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    if-eqz v2, :cond_7

    .line 359
    .line 360
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    check-cast v2, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;

    .line 365
    .line 366
    invoke-static {v2, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->getOriginalTransactionId()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v9

    .line 373
    move-object/from16 v32, v0

    .line 374
    .line 375
    new-instance v0, Lef/k;

    .line 376
    .line 377
    move-object/from16 v33, v2

    .line 378
    .line 379
    const-string v2, "originalTransactionId"

    .line 380
    .line 381
    invoke-direct {v0, v2, v9}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v33 .. v33}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->getTransactionId()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    new-instance v9, Lef/k;

    .line 389
    .line 390
    move-object/from16 v34, v0

    .line 391
    .line 392
    const-string v0, "transactionId"

    .line 393
    .line 394
    invoke-direct {v9, v0, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v33 .. v33}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->getOfferCode()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    new-instance v2, Lef/k;

    .line 402
    .line 403
    move-object/from16 v35, v4

    .line 404
    .line 405
    const-string v4, "offerCode"

    .line 406
    .line 407
    invoke-direct {v2, v4, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v33 .. v33}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->getTransactionDate()Ljava/util/Date;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    move-object/from16 v36, v5

    .line 415
    .line 416
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 417
    .line 418
    .line 419
    move-result-wide v4

    .line 420
    long-to-double v4, v4

    .line 421
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    new-instance v4, Lef/k;

    .line 426
    .line 427
    const-string v5, "transactionTimestamp"

    .line 428
    .line 429
    invoke-direct {v4, v5, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v33 .. v33}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->getExpirationDate()Ljava/util/Date;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    move-object/from16 v37, v4

    .line 437
    .line 438
    if-eqz v0, :cond_5

    .line 439
    .line 440
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 441
    .line 442
    .line 443
    move-result-wide v4

    .line 444
    long-to-double v4, v4

    .line 445
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    goto :goto_7

    .line 450
    :cond_5
    const/4 v0, 0x0

    .line 451
    :goto_7
    new-instance v4, Lef/k;

    .line 452
    .line 453
    invoke-direct {v4, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v33 .. v33}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->getTransactionRevocationDate()Ljava/util/Date;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    move-object/from16 v38, v2

    .line 461
    .line 462
    move-object v5, v3

    .line 463
    if-eqz v0, :cond_6

    .line 464
    .line 465
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 466
    .line 467
    .line 468
    move-result-wide v2

    .line 469
    long-to-double v2, v2

    .line 470
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    goto :goto_8

    .line 475
    :cond_6
    const/4 v0, 0x0

    .line 476
    :goto_8
    new-instance v2, Lef/k;

    .line 477
    .line 478
    const-string v3, "transactionRevocationTimestamp"

    .line 479
    .line 480
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v33 .. v33}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->getOwnershipType()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    new-instance v3, Lef/k;

    .line 492
    .line 493
    move-object/from16 v39, v2

    .line 494
    .line 495
    const-string v2, "ownershipType"

    .line 496
    .line 497
    invoke-direct {v3, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v33 .. v33}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->getType()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    new-instance v2, Lef/k;

    .line 509
    .line 510
    move-object/from16 v40, v3

    .line 511
    .line 512
    const-string v3, "type"

    .line 513
    .line 514
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v33 .. v33}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->getEnvironment()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    new-instance v3, Lef/k;

    .line 526
    .line 527
    move-object/from16 v33, v2

    .line 528
    .line 529
    const-string v2, "environment"

    .line 530
    .line 531
    invoke-direct {v3, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    const/16 v0, 0x9

    .line 535
    .line 536
    new-array v2, v0, [Lef/k;

    .line 537
    .line 538
    aput-object v34, v2, v24

    .line 539
    .line 540
    aput-object v9, v2, v23

    .line 541
    .line 542
    aput-object v38, v2, v22

    .line 543
    .line 544
    aput-object v37, v2, v21

    .line 545
    .line 546
    aput-object v4, v2, v19

    .line 547
    .line 548
    aput-object v39, v2, p0

    .line 549
    .line 550
    aput-object v40, v2, v18

    .line 551
    .line 552
    aput-object v33, v2, v17

    .line 553
    .line 554
    aput-object v3, v2, v16

    .line 555
    .line 556
    invoke-static {v2}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-object v3, v5

    .line 564
    move-object/from16 v0, v32

    .line 565
    .line 566
    move-object/from16 v4, v35

    .line 567
    .line 568
    move-object/from16 v5, v36

    .line 569
    .line 570
    goto/16 :goto_6

    .line 571
    .line 572
    :cond_7
    move-object/from16 v35, v4

    .line 573
    .line 574
    move-object/from16 v36, v5

    .line 575
    .line 576
    new-instance v0, Lef/k;

    .line 577
    .line 578
    const-string v2, "transactions"

    .line 579
    .line 580
    invoke-direct {v0, v2, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 581
    .line 582
    .line 583
    const/16 v1, 0xf

    .line 584
    .line 585
    new-array v1, v1, [Lef/k;

    .line 586
    .line 587
    aput-object v30, v1, v24

    .line 588
    .line 589
    aput-object v20, v1, v23

    .line 590
    .line 591
    aput-object v29, v1, v22

    .line 592
    .line 593
    aput-object v35, v1, v21

    .line 594
    .line 595
    aput-object v36, v1, v19

    .line 596
    .line 597
    aput-object v6, v1, p0

    .line 598
    .line 599
    aput-object v7, v1, v18

    .line 600
    .line 601
    aput-object v8, v1, v17

    .line 602
    .line 603
    aput-object v27, v1, v16

    .line 604
    .line 605
    const/16 v25, 0x9

    .line 606
    .line 607
    aput-object v10, v1, v25

    .line 608
    .line 609
    const/16 v9, 0xa

    .line 610
    .line 611
    aput-object v11, v1, v9

    .line 612
    .line 613
    const/16 v2, 0xb

    .line 614
    .line 615
    aput-object v12, v1, v2

    .line 616
    .line 617
    const/16 v2, 0xc

    .line 618
    .line 619
    aput-object v31, v1, v2

    .line 620
    .line 621
    const/16 v2, 0xd

    .line 622
    .line 623
    aput-object v13, v1, v2

    .line 624
    .line 625
    const/16 v2, 0xe

    .line 626
    .line 627
    aput-object v0, v1, v2

    .line 628
    .line 629
    invoke-static {v1}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    move-object/from16 v1, v26

    .line 634
    .line 635
    invoke-interface {v1, v14, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-object v11, v1

    .line 639
    move-object/from16 v12, v28

    .line 640
    .line 641
    goto/16 :goto_0

    .line 642
    .line 643
    :cond_8
    move-object v1, v11

    .line 644
    return-object v1
.end method

.method public static final b(LG9/e;)Ljava/util/Map;
    .locals 10

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x3

    .line 5
    const-string v4, "<this>"

    .line 6
    .line 7
    invoke-static {p0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v4, p0, LG9/e;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v4, Lbe/a;

    .line 13
    .line 14
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    new-instance v5, Lef/k;

    .line 19
    .line 20
    const-string v6, "code"

    .line 21
    .line 22
    invoke-direct {v5, v6, v4}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance v4, Lef/k;

    .line 26
    .line 27
    const-string v7, "description"

    .line 28
    .line 29
    iget-object v8, p0, LG9/e;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v8, Ljava/lang/String;

    .line 32
    .line 33
    invoke-direct {v4, v7, v8}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, LG9/e;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 39
    .line 40
    if-eqz p0, :cond_0

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QonversionError;->getCode()Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    new-instance v9, Lef/k;

    .line 51
    .line 52
    invoke-direct {v9, v6, v8}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QonversionError;->getDescription()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    new-instance v8, Lef/k;

    .line 60
    .line 61
    invoke-direct {v8, v7, v6}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QonversionError;->getAdditionalMessage()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    new-instance v6, Lef/k;

    .line 69
    .line 70
    const-string v7, "additionalMessage"

    .line 71
    .line 72
    invoke-direct {v6, v7, p0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    new-array p0, v3, [Lef/k;

    .line 76
    .line 77
    aput-object v9, p0, v2

    .line 78
    .line 79
    aput-object v8, p0, v1

    .line 80
    .line 81
    aput-object v6, p0, v0

    .line 82
    .line 83
    invoke-static {p0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    goto :goto_0

    .line 88
    :cond_0
    const/4 p0, 0x0

    .line 89
    :goto_0
    new-instance v6, Lef/k;

    .line 90
    .line 91
    const-string v7, "qonversionError"

    .line 92
    .line 93
    invoke-direct {v6, v7, p0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    new-array p0, v3, [Lef/k;

    .line 97
    .line 98
    aput-object v5, p0, v2

    .line 99
    .line 100
    aput-object v4, p0, v1

    .line 101
    .line 102
    aput-object v6, p0, v0

    .line 103
    .line 104
    invoke-static {p0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0
.end method

.method public static final c(Lae/f;)Ljava/util/Map;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lae/f;->b:Ljava/util/Map;

    .line 3
    .line 4
    if-eqz v1, :cond_1

    .line 5
    .line 6
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    invoke-static {v3}, Lff/B;->D(I)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-direct {v2, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/Iterable;

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ljava/util/Map$Entry;

    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Lae/c;

    .line 46
    .line 47
    iget-object v4, v4, Lae/c;->a:Ljava/lang/String;

    .line 48
    .line 49
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-static {v3}, Lff/B;->D(I)I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-direct {v1, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Ljava/lang/Iterable;

    .line 75
    .line 76
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_2

    .line 85
    .line 86
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    check-cast v3, Ljava/util/Map$Entry;

    .line 91
    .line 92
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_1
    move-object v1, v0

    .line 105
    :cond_2
    iget-object v2, p0, Lae/f;->a:Lae/e;

    .line 106
    .line 107
    iget-object v2, v2, Lae/e;->a:Ljava/lang/String;

    .line 108
    .line 109
    new-instance v3, Lef/k;

    .line 110
    .line 111
    const-string v4, "type"

    .line 112
    .line 113
    invoke-direct {v3, v4, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    new-instance v2, Lef/k;

    .line 117
    .line 118
    const-string v4, "parameters"

    .line 119
    .line 120
    invoke-direct {v2, v4, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iget-object p0, p0, Lae/f;->c:LG9/e;

    .line 124
    .line 125
    if-eqz p0, :cond_3

    .line 126
    .line 127
    invoke-static {p0}, LGe/c;->b(LG9/e;)Ljava/util/Map;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    :cond_3
    new-instance p0, Lef/k;

    .line 132
    .line 133
    const-string v1, "error"

    .line 134
    .line 135
    invoke-direct {p0, v1, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    const/4 v0, 0x3

    .line 139
    new-array v0, v0, [Lef/k;

    .line 140
    .line 141
    const/4 v1, 0x0

    .line 142
    aput-object v3, v0, v1

    .line 143
    .line 144
    const/4 v1, 0x1

    .line 145
    aput-object v2, v0, v1

    .line 146
    .line 147
    const/4 v1, 0x2

    .line 148
    aput-object p0, v0, v1

    .line 149
    .line 150
    invoke-static {v0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    return-object p0
.end method

.method public static final d(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)Ljava/util/Map;
    .locals 17

    .line 1
    const/4 v1, 0x3

    .line 2
    const/4 v2, 0x1

    .line 3
    const/4 v3, 0x2

    .line 4
    const-string v4, "<this>"

    .line 5
    .line 6
    move-object/from16 v5, p0

    .line 7
    .line 8
    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->getPayload()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v6

    .line 15
    new-instance v7, Lef/k;

    .line 16
    .line 17
    const-string v8, "payload"

    .line 18
    .line 19
    invoke-direct {v7, v8, v6}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->getExperiment()Lcom/qonversion/android/sdk/dto/experiments/QExperiment;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    const-string v8, "type"

    .line 27
    .line 28
    const-string v9, "unknown"

    .line 29
    .line 30
    const-string v10, "name"

    .line 31
    .line 32
    const-string v11, "id"

    .line 33
    .line 34
    if-eqz v6, :cond_2

    .line 35
    .line 36
    invoke-virtual {v6}, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->getId()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v12

    .line 40
    new-instance v13, Lef/k;

    .line 41
    .line 42
    invoke-direct {v13, v11, v12}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v6}, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v12

    .line 49
    new-instance v14, Lef/k;

    .line 50
    .line 51
    invoke-direct {v14, v10, v12}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v6}, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->getGroup()Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v6}, Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;->getId()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v12

    .line 65
    new-instance v15, Lef/k;

    .line 66
    .line 67
    invoke-direct {v15, v11, v12}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6}, Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v12

    .line 74
    const/16 v16, 0x0

    .line 75
    .line 76
    new-instance v0, Lef/k;

    .line 77
    .line 78
    invoke-direct {v0, v10, v12}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6}, Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;->getType()Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    sget-object v12, LGe/b;->a:[I

    .line 89
    .line 90
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    aget v6, v12, v6

    .line 95
    .line 96
    if-eq v6, v2, :cond_1

    .line 97
    .line 98
    if-eq v6, v3, :cond_0

    .line 99
    .line 100
    move-object v6, v9

    .line 101
    goto :goto_0

    .line 102
    :cond_0
    const-string v6, "control"

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_1
    const-string v6, "treatment"

    .line 106
    .line 107
    :goto_0
    new-instance v12, Lef/k;

    .line 108
    .line 109
    invoke-direct {v12, v8, v6}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    new-array v6, v1, [Lef/k;

    .line 113
    .line 114
    aput-object v15, v6, v16

    .line 115
    .line 116
    aput-object v0, v6, v2

    .line 117
    .line 118
    aput-object v12, v6, v3

    .line 119
    .line 120
    invoke-static {v6}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    new-instance v6, Lef/k;

    .line 125
    .line 126
    const-string v12, "group"

    .line 127
    .line 128
    invoke-direct {v6, v12, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    new-array v0, v1, [Lef/k;

    .line 132
    .line 133
    aput-object v13, v0, v16

    .line 134
    .line 135
    aput-object v14, v0, v2

    .line 136
    .line 137
    aput-object v6, v0, v3

    .line 138
    .line 139
    invoke-static {v0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    goto :goto_1

    .line 144
    :cond_2
    const/16 v16, 0x0

    .line 145
    .line 146
    const/4 v0, 0x0

    .line 147
    :goto_1
    new-instance v6, Lef/k;

    .line 148
    .line 149
    const-string v12, "experiment"

    .line 150
    .line 151
    invoke-direct {v6, v12, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->getSource()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->getId()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    new-instance v12, Lef/k;

    .line 166
    .line 167
    invoke-direct {v12, v11, v5}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->getName()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    new-instance v11, Lef/k;

    .line 175
    .line 176
    invoke-direct {v11, v10, v5}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->getType()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    sget-object v10, LGe/b;->b:[I

    .line 187
    .line 188
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    aget v5, v10, v5

    .line 193
    .line 194
    if-eq v5, v2, :cond_5

    .line 195
    .line 196
    if-eq v5, v3, :cond_4

    .line 197
    .line 198
    if-eq v5, v1, :cond_3

    .line 199
    .line 200
    move-object v5, v9

    .line 201
    goto :goto_2

    .line 202
    :cond_3
    const-string v5, "experiment_control_group"

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_4
    const-string v5, "experiment_treatment_group"

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_5
    const-string v5, "remote_configuration"

    .line 209
    .line 210
    :goto_2
    new-instance v10, Lef/k;

    .line 211
    .line 212
    invoke-direct {v10, v8, v5}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->getAssignmentType()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    sget-object v4, LGe/b;->c:[I

    .line 223
    .line 224
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 225
    .line 226
    .line 227
    move-result v5

    .line 228
    aget v4, v4, v5

    .line 229
    .line 230
    if-eq v4, v2, :cond_7

    .line 231
    .line 232
    if-eq v4, v3, :cond_6

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_6
    const-string v9, "manual"

    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_7
    const-string v9, "auto"

    .line 239
    .line 240
    :goto_3
    new-instance v4, Lef/k;

    .line 241
    .line 242
    const-string v5, "assignmentType"

    .line 243
    .line 244
    invoke-direct {v4, v5, v9}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->getContextKey()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    new-instance v5, Lef/k;

    .line 252
    .line 253
    const-string v8, "contextKey"

    .line 254
    .line 255
    invoke-direct {v5, v8, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    const/4 v0, 0x5

    .line 259
    new-array v0, v0, [Lef/k;

    .line 260
    .line 261
    aput-object v12, v0, v16

    .line 262
    .line 263
    aput-object v11, v0, v2

    .line 264
    .line 265
    aput-object v10, v0, v3

    .line 266
    .line 267
    aput-object v4, v0, v1

    .line 268
    .line 269
    const/4 v4, 0x4

    .line 270
    aput-object v5, v0, v4

    .line 271
    .line 272
    invoke-static {v0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    new-instance v4, Lef/k;

    .line 277
    .line 278
    const-string v5, "source"

    .line 279
    .line 280
    invoke-direct {v4, v5, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    new-array v0, v1, [Lef/k;

    .line 284
    .line 285
    aput-object v7, v0, v16

    .line 286
    .line 287
    aput-object v6, v0, v2

    .line 288
    .line 289
    aput-object v4, v0, v3

    .line 290
    .line 291
    invoke-static {v0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    return-object v0
.end method

.method public static final e(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)Ljava/util/Map;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->getRemoteConfigs()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Iterable;

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/16 v1, 0xa

    .line 10
    .line 11
    invoke-static {p0, v1}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    .line 33
    .line 34
    invoke-static {v1}, LGe/c;->d(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)Ljava/util/Map;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance p0, Lef/k;

    .line 43
    .line 44
    const-string v1, "remoteConfigs"

    .line 45
    .line 46
    invoke-direct {p0, v1, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, Lff/B;->E(Lef/k;)Ljava/util/Map;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public static final f(Lcom/qonversion/android/sdk/dto/offerings/QOffering;)Ljava/util/Map;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->getOfferingID()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lef/k;

    .line 11
    .line 12
    const-string v2, "id"

    .line 13
    .line 14
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->getTag()Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->getTag()Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v2, Lef/k;

    .line 26
    .line 27
    const-string v3, "tag"

    .line 28
    .line 29
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->getProducts()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Ljava/lang/Iterable;

    .line 37
    .line 38
    new-instance v0, Ljava/util/ArrayList;

    .line 39
    .line 40
    const/16 v3, 0xa

    .line 41
    .line 42
    invoke-static {p0, v3}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_0

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    check-cast v3, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 64
    .line 65
    invoke-static {v3}, LGe/c;->g(Lcom/qonversion/android/sdk/dto/products/QProduct;)Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    new-instance p0, Lef/k;

    .line 74
    .line 75
    const-string v3, "products"

    .line 76
    .line 77
    invoke-direct {p0, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    const/4 v0, 0x3

    .line 81
    new-array v0, v0, [Lef/k;

    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    aput-object v1, v0, v3

    .line 85
    .line 86
    const/4 v1, 0x1

    .line 87
    aput-object v2, v0, v1

    .line 88
    .line 89
    const/4 v1, 0x2

    .line 90
    aput-object p0, v0, v1

    .line 91
    .line 92
    invoke-static {v0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0
.end method

.method public static final g(Lcom/qonversion/android/sdk/dto/products/QProduct;)Ljava/util/Map;
    .locals 51

    .line 1
    const/16 v16, 0x0

    .line 2
    .line 3
    const/16 v17, 0x10

    .line 4
    .line 5
    const/16 v18, 0xf

    .line 6
    .line 7
    const-string v2, "<this>"

    .line 8
    .line 9
    const/16 v19, 0xe

    .line 10
    .line 11
    move-object/from16 v3, p0

    .line 12
    .line 13
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/16 v20, 0xd

    .line 21
    .line 22
    new-instance v4, Lef/k;

    .line 23
    .line 24
    const/16 v21, 0xc

    .line 25
    .line 26
    const-string v5, "id"

    .line 27
    .line 28
    invoke-direct {v4, v5, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    new-instance v5, Lef/k;

    .line 36
    .line 37
    const/16 v22, 0xb

    .line 38
    .line 39
    const-string v6, "storeId"

    .line 40
    .line 41
    invoke-direct {v5, v6, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getBasePlanID()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    new-instance v6, Lef/k;

    .line 49
    .line 50
    const/16 v23, 0x9

    .line 51
    .line 52
    const-string v7, "basePlanId"

    .line 53
    .line 54
    invoke-direct {v6, v7, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getType()Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    const/16 v24, 0x8

    .line 66
    .line 67
    new-instance v8, Lef/k;

    .line 68
    .line 69
    const/16 v25, 0x7

    .line 70
    .line 71
    const-string v9, "type"

    .line 72
    .line 73
    invoke-direct {v8, v9, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getSubscriptionPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    const/16 v26, 0x0

    .line 81
    .line 82
    if-eqz v2, :cond_0

    .line 83
    .line 84
    invoke-static {v2}, LGe/c;->k(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;)Ljava/util/Map;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    :goto_0
    const/16 v27, 0x6

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_0
    move-object/from16 v2, v26

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :goto_1
    new-instance v10, Lef/k;

    .line 95
    .line 96
    const/16 v28, 0x5

    .line 97
    .line 98
    const-string v11, "subscriptionPeriod"

    .line 99
    .line 100
    invoke-direct {v10, v11, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getTrialPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    if-eqz v2, :cond_1

    .line 108
    .line 109
    invoke-static {v2}, LGe/c;->k(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;)Ljava/util/Map;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    :goto_2
    const/16 v29, 0x4

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_1
    move-object/from16 v2, v26

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :goto_3
    new-instance v12, Lef/k;

    .line 120
    .line 121
    const/16 v30, 0x3

    .line 122
    .line 123
    const-string v13, "trialPeriod"

    .line 124
    .line 125
    invoke-direct {v12, v13, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getSkuDetail()Lcom/android/billingclient/api/SkuDetails;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    const-string v13, "title"

    .line 133
    .line 134
    const/16 v31, 0x2

    .line 135
    .line 136
    const-string v14, "price"

    .line 137
    .line 138
    const/16 v32, 0x1

    .line 139
    .line 140
    const-string v15, "description"

    .line 141
    .line 142
    const/16 v33, 0x11

    .line 143
    .line 144
    if-eqz v2, :cond_2

    .line 145
    .line 146
    invoke-virtual {v2}, Lcom/android/billingclient/api/SkuDetails;->getDescription()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    const/16 v34, 0xa

    .line 151
    .line 152
    new-instance v1, Lef/k;

    .line 153
    .line 154
    invoke-direct {v1, v15, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Lcom/android/billingclient/api/SkuDetails;->getFreeTrialPeriod()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    move-object/from16 v35, v1

    .line 162
    .line 163
    new-instance v1, Lef/k;

    .line 164
    .line 165
    move-object/from16 v36, v2

    .line 166
    .line 167
    const-string v2, "freeTrialPeriod"

    .line 168
    .line 169
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v36 .. v36}, Lcom/android/billingclient/api/SkuDetails;->getIconUrl()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    new-instance v2, Lef/k;

    .line 177
    .line 178
    move-object/from16 v37, v1

    .line 179
    .line 180
    const-string v1, "iconUrl"

    .line 181
    .line 182
    invoke-direct {v2, v1, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v36 .. v36}, Lcom/android/billingclient/api/SkuDetails;->getIntroductoryPrice()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    new-instance v1, Lef/k;

    .line 190
    .line 191
    move-object/from16 v38, v2

    .line 192
    .line 193
    const-string v2, "introductoryPrice"

    .line 194
    .line 195
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v36 .. v36}, Lcom/android/billingclient/api/SkuDetails;->getIntroductoryPriceAmountMicros()J

    .line 199
    .line 200
    .line 201
    move-result-wide v39

    .line 202
    invoke-static/range {v39 .. v40}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    new-instance v2, Lef/k;

    .line 207
    .line 208
    move-object/from16 v39, v1

    .line 209
    .line 210
    const-string v1, "introductoryPriceAmountMicros"

    .line 211
    .line 212
    invoke-direct {v2, v1, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v36 .. v36}, Lcom/android/billingclient/api/SkuDetails;->getIntroductoryPriceCycles()I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    new-instance v1, Lef/k;

    .line 224
    .line 225
    move-object/from16 v40, v2

    .line 226
    .line 227
    const-string v2, "introductoryPriceCycles"

    .line 228
    .line 229
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v36 .. v36}, Lcom/android/billingclient/api/SkuDetails;->getIntroductoryPricePeriod()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    new-instance v2, Lef/k;

    .line 237
    .line 238
    move-object/from16 v41, v1

    .line 239
    .line 240
    const-string v1, "introductoryPricePeriod"

    .line 241
    .line 242
    invoke-direct {v2, v1, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v36 .. v36}, Lcom/android/billingclient/api/SkuDetails;->getOriginalJson()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    new-instance v1, Lef/k;

    .line 250
    .line 251
    move-object/from16 v42, v2

    .line 252
    .line 253
    const-string v2, "originalJson"

    .line 254
    .line 255
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v36 .. v36}, Lcom/android/billingclient/api/SkuDetails;->getOriginalPrice()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    new-instance v2, Lef/k;

    .line 263
    .line 264
    move-object/from16 v43, v1

    .line 265
    .line 266
    const-string v1, "originalPrice"

    .line 267
    .line 268
    invoke-direct {v2, v1, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v36 .. v36}, Lcom/android/billingclient/api/SkuDetails;->getOriginalPriceAmountMicros()J

    .line 272
    .line 273
    .line 274
    move-result-wide v0

    .line 275
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    new-instance v1, Lef/k;

    .line 280
    .line 281
    move-object/from16 v44, v2

    .line 282
    .line 283
    const-string v2, "originalPriceAmountMicros"

    .line 284
    .line 285
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v36 .. v36}, Lcom/android/billingclient/api/SkuDetails;->getPrice()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    new-instance v2, Lef/k;

    .line 293
    .line 294
    invoke-direct {v2, v14, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v36 .. v36}, Lcom/android/billingclient/api/SkuDetails;->getPriceAmountMicros()J

    .line 298
    .line 299
    .line 300
    move-result-wide v45

    .line 301
    invoke-static/range {v45 .. v46}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    move-object/from16 v45, v1

    .line 306
    .line 307
    new-instance v1, Lef/k;

    .line 308
    .line 309
    move-object/from16 v46, v2

    .line 310
    .line 311
    const-string v2, "priceAmountMicros"

    .line 312
    .line 313
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v36 .. v36}, Lcom/android/billingclient/api/SkuDetails;->getPriceCurrencyCode()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    new-instance v2, Lef/k;

    .line 321
    .line 322
    move-object/from16 v47, v1

    .line 323
    .line 324
    const-string v1, "priceCurrencyCode"

    .line 325
    .line 326
    invoke-direct {v2, v1, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v36 .. v36}, Lcom/android/billingclient/api/SkuDetails;->getSku()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    new-instance v1, Lef/k;

    .line 334
    .line 335
    move-object/from16 v48, v2

    .line 336
    .line 337
    const-string v2, "sku"

    .line 338
    .line 339
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v36 .. v36}, Lcom/android/billingclient/api/SkuDetails;->getSubscriptionPeriod()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    new-instance v2, Lef/k;

    .line 347
    .line 348
    invoke-direct {v2, v11, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v36 .. v36}, Lcom/android/billingclient/api/SkuDetails;->getTitle()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    new-instance v11, Lef/k;

    .line 356
    .line 357
    invoke-direct {v11, v13, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v36 .. v36}, Lcom/android/billingclient/api/SkuDetails;->getType()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    move-object/from16 v49, v1

    .line 365
    .line 366
    new-instance v1, Lef/k;

    .line 367
    .line 368
    invoke-direct {v1, v9, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v36 .. v36}, Lcom/android/billingclient/api/SkuDetails;->hashCode()I

    .line 372
    .line 373
    .line 374
    move-result v0

    .line 375
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    new-instance v9, Lef/k;

    .line 380
    .line 381
    move-object/from16 v50, v1

    .line 382
    .line 383
    const-string v1, "hashCode"

    .line 384
    .line 385
    invoke-direct {v9, v1, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v36 .. v36}, Lcom/android/billingclient/api/SkuDetails;->toString()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    new-instance v1, Lef/k;

    .line 393
    .line 394
    move-object/from16 v36, v2

    .line 395
    .line 396
    const-string v2, "toString"

    .line 397
    .line 398
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    const/16 v0, 0x13

    .line 402
    .line 403
    new-array v0, v0, [Lef/k;

    .line 404
    .line 405
    aput-object v35, v0, v16

    .line 406
    .line 407
    aput-object v37, v0, v32

    .line 408
    .line 409
    aput-object v38, v0, v31

    .line 410
    .line 411
    aput-object v39, v0, v30

    .line 412
    .line 413
    aput-object v40, v0, v29

    .line 414
    .line 415
    aput-object v41, v0, v28

    .line 416
    .line 417
    aput-object v42, v0, v27

    .line 418
    .line 419
    aput-object v43, v0, v25

    .line 420
    .line 421
    aput-object v44, v0, v24

    .line 422
    .line 423
    aput-object v45, v0, v23

    .line 424
    .line 425
    aput-object v46, v0, v34

    .line 426
    .line 427
    aput-object v47, v0, v22

    .line 428
    .line 429
    aput-object v48, v0, v21

    .line 430
    .line 431
    aput-object v49, v0, v20

    .line 432
    .line 433
    aput-object v36, v0, v19

    .line 434
    .line 435
    aput-object v11, v0, v18

    .line 436
    .line 437
    aput-object v50, v0, v17

    .line 438
    .line 439
    aput-object v9, v0, v33

    .line 440
    .line 441
    const/16 v2, 0x12

    .line 442
    .line 443
    aput-object v1, v0, v2

    .line 444
    .line 445
    invoke-static {v0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    goto :goto_4

    .line 450
    :cond_2
    const/16 v34, 0xa

    .line 451
    .line 452
    move-object/from16 v0, v26

    .line 453
    .line 454
    :goto_4
    new-instance v1, Lef/k;

    .line 455
    .line 456
    const-string v2, "skuDetails"

    .line 457
    .line 458
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreDetails()Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    if-eqz v0, :cond_8

    .line 466
    .line 467
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getBasePlanId()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    new-instance v9, Lef/k;

    .line 472
    .line 473
    invoke-direct {v9, v7, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getProductId()Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    new-instance v7, Lef/k;

    .line 481
    .line 482
    const-string v11, "productId"

    .line 483
    .line 484
    invoke-direct {v7, v11, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getName()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    new-instance v11, Lef/k;

    .line 492
    .line 493
    move-object/from16 v35, v0

    .line 494
    .line 495
    const-string v0, "name"

    .line 496
    .line 497
    invoke-direct {v11, v0, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v35 .. v35}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getTitle()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    new-instance v2, Lef/k;

    .line 505
    .line 506
    invoke-direct {v2, v13, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v35 .. v35}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getDescription()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    new-instance v13, Lef/k;

    .line 514
    .line 515
    invoke-direct {v13, v15, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v35 .. v35}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getSubscriptionOfferDetails()Ljava/util/List;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    if-eqz v0, :cond_3

    .line 523
    .line 524
    check-cast v0, Ljava/lang/Iterable;

    .line 525
    .line 526
    new-instance v15, Ljava/util/ArrayList;

    .line 527
    .line 528
    move-object/from16 v36, v1

    .line 529
    .line 530
    move-object/from16 v37, v2

    .line 531
    .line 532
    move/from16 v1, v34

    .line 533
    .line 534
    invoke-static {v0, v1}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 535
    .line 536
    .line 537
    move-result v2

    .line 538
    invoke-direct {v15, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 539
    .line 540
    .line 541
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 546
    .line 547
    .line 548
    move-result v1

    .line 549
    if-eqz v1, :cond_4

    .line 550
    .line 551
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    check-cast v1, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 556
    .line 557
    invoke-static {v1}, LGe/c;->h(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)Ljava/util/Map;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 562
    .line 563
    .line 564
    goto :goto_5

    .line 565
    :cond_3
    move-object/from16 v36, v1

    .line 566
    .line 567
    move-object/from16 v37, v2

    .line 568
    .line 569
    move-object/from16 v15, v26

    .line 570
    .line 571
    :cond_4
    new-instance v0, Lef/k;

    .line 572
    .line 573
    const-string v1, "subscriptionOfferDetails"

    .line 574
    .line 575
    invoke-direct {v0, v1, v15}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v35 .. v35}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getDefaultSubscriptionOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    if-eqz v1, :cond_5

    .line 583
    .line 584
    invoke-static {v1}, LGe/c;->h(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)Ljava/util/Map;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    goto :goto_6

    .line 589
    :cond_5
    move-object/from16 v1, v26

    .line 590
    .line 591
    :goto_6
    new-instance v2, Lef/k;

    .line 592
    .line 593
    const-string v15, "defaultSubscriptionOfferDetails"

    .line 594
    .line 595
    invoke-direct {v2, v15, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v35 .. v35}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getBasePlanSubscriptionOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    if-eqz v1, :cond_6

    .line 603
    .line 604
    invoke-static {v1}, LGe/c;->h(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)Ljava/util/Map;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    goto :goto_7

    .line 609
    :cond_6
    move-object/from16 v1, v26

    .line 610
    .line 611
    :goto_7
    new-instance v15, Lef/k;

    .line 612
    .line 613
    move-object/from16 v38, v0

    .line 614
    .line 615
    const-string v0, "basePlanSubscriptionOfferDetails"

    .line 616
    .line 617
    invoke-direct {v15, v0, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual/range {v35 .. v35}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getInAppOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    if-eqz v0, :cond_7

    .line 625
    .line 626
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;->getPrice()Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    invoke-static {v0}, LGe/c;->i(Lcom/qonversion/android/sdk/dto/products/QProductPrice;)Ljava/util/Map;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    new-instance v1, Lef/k;

    .line 635
    .line 636
    invoke-direct {v1, v14, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 637
    .line 638
    .line 639
    invoke-static {v1}, Lff/B;->E(Lef/k;)Ljava/util/Map;

    .line 640
    .line 641
    .line 642
    move-result-object v26

    .line 643
    :cond_7
    move-object/from16 v0, v26

    .line 644
    .line 645
    new-instance v1, Lef/k;

    .line 646
    .line 647
    const-string v14, "inAppOfferDetails"

    .line 648
    .line 649
    invoke-direct {v1, v14, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v35 .. v35}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getHasTrialOffer()Z

    .line 653
    .line 654
    .line 655
    move-result v0

    .line 656
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    new-instance v14, Lef/k;

    .line 661
    .line 662
    move-object/from16 v26, v1

    .line 663
    .line 664
    const-string v1, "hasTrialOffer"

    .line 665
    .line 666
    invoke-direct {v14, v1, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 667
    .line 668
    .line 669
    invoke-virtual/range {v35 .. v35}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getHasIntroOffer()Z

    .line 670
    .line 671
    .line 672
    move-result v0

    .line 673
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    new-instance v1, Lef/k;

    .line 678
    .line 679
    move-object/from16 v39, v2

    .line 680
    .line 681
    const-string v2, "hasIntroOffer"

    .line 682
    .line 683
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v35 .. v35}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getHasTrialOrIntroOffer()Z

    .line 687
    .line 688
    .line 689
    move-result v0

    .line 690
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    new-instance v2, Lef/k;

    .line 695
    .line 696
    move-object/from16 v40, v1

    .line 697
    .line 698
    const-string v1, "hasTrialOrIntroOffer"

    .line 699
    .line 700
    invoke-direct {v2, v1, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 701
    .line 702
    .line 703
    invoke-virtual/range {v35 .. v35}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getProductType()Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    new-instance v1, Lef/k;

    .line 712
    .line 713
    move-object/from16 v41, v2

    .line 714
    .line 715
    const-string v2, "productType"

    .line 716
    .line 717
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 718
    .line 719
    .line 720
    invoke-virtual/range {v35 .. v35}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isInApp()Z

    .line 721
    .line 722
    .line 723
    move-result v0

    .line 724
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 725
    .line 726
    .line 727
    move-result-object v0

    .line 728
    new-instance v2, Lef/k;

    .line 729
    .line 730
    move-object/from16 v42, v1

    .line 731
    .line 732
    const-string v1, "isInApp"

    .line 733
    .line 734
    invoke-direct {v2, v1, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 735
    .line 736
    .line 737
    invoke-virtual/range {v35 .. v35}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isSubscription()Z

    .line 738
    .line 739
    .line 740
    move-result v0

    .line 741
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    new-instance v1, Lef/k;

    .line 746
    .line 747
    move-object/from16 v43, v2

    .line 748
    .line 749
    const-string v2, "isSubscription"

    .line 750
    .line 751
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 752
    .line 753
    .line 754
    invoke-virtual/range {v35 .. v35}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isPrepaid()Z

    .line 755
    .line 756
    .line 757
    move-result v0

    .line 758
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    new-instance v2, Lef/k;

    .line 763
    .line 764
    move-object/from16 v44, v1

    .line 765
    .line 766
    const-string v1, "isPrepaid"

    .line 767
    .line 768
    invoke-direct {v2, v1, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 769
    .line 770
    .line 771
    invoke-virtual/range {v35 .. v35}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isInstallment()Z

    .line 772
    .line 773
    .line 774
    move-result v0

    .line 775
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    new-instance v1, Lef/k;

    .line 780
    .line 781
    move-object/from16 v35, v2

    .line 782
    .line 783
    const-string v2, "isInstallment"

    .line 784
    .line 785
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 786
    .line 787
    .line 788
    move/from16 v0, v33

    .line 789
    .line 790
    new-array v0, v0, [Lef/k;

    .line 791
    .line 792
    aput-object v9, v0, v16

    .line 793
    .line 794
    aput-object v7, v0, v32

    .line 795
    .line 796
    aput-object v11, v0, v31

    .line 797
    .line 798
    aput-object v37, v0, v30

    .line 799
    .line 800
    aput-object v13, v0, v29

    .line 801
    .line 802
    aput-object v38, v0, v28

    .line 803
    .line 804
    aput-object v39, v0, v27

    .line 805
    .line 806
    aput-object v15, v0, v25

    .line 807
    .line 808
    aput-object v26, v0, v24

    .line 809
    .line 810
    aput-object v14, v0, v23

    .line 811
    .line 812
    const/16 v34, 0xa

    .line 813
    .line 814
    aput-object v40, v0, v34

    .line 815
    .line 816
    aput-object v41, v0, v22

    .line 817
    .line 818
    aput-object v42, v0, v21

    .line 819
    .line 820
    aput-object v43, v0, v20

    .line 821
    .line 822
    aput-object v44, v0, v19

    .line 823
    .line 824
    aput-object v35, v0, v18

    .line 825
    .line 826
    aput-object v1, v0, v17

    .line 827
    .line 828
    invoke-static {v0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 829
    .line 830
    .line 831
    move-result-object v26

    .line 832
    :goto_8
    move-object/from16 v0, v26

    .line 833
    .line 834
    goto :goto_9

    .line 835
    :cond_8
    move-object/from16 v36, v1

    .line 836
    .line 837
    goto :goto_8

    .line 838
    :goto_9
    new-instance v1, Lef/k;

    .line 839
    .line 840
    const-string v2, "storeDetails"

    .line 841
    .line 842
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 843
    .line 844
    .line 845
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getPrettyPrice()Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    new-instance v2, Lef/k;

    .line 850
    .line 851
    const-string v7, "prettyPrice"

    .line 852
    .line 853
    invoke-direct {v2, v7, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getOfferingID()Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    new-instance v3, Lef/k;

    .line 861
    .line 862
    const-string v7, "offeringId"

    .line 863
    .line 864
    invoke-direct {v3, v7, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 865
    .line 866
    .line 867
    const/16 v0, 0xa

    .line 868
    .line 869
    new-array v0, v0, [Lef/k;

    .line 870
    .line 871
    aput-object v4, v0, v16

    .line 872
    .line 873
    aput-object v5, v0, v32

    .line 874
    .line 875
    aput-object v6, v0, v31

    .line 876
    .line 877
    aput-object v8, v0, v30

    .line 878
    .line 879
    aput-object v10, v0, v29

    .line 880
    .line 881
    aput-object v12, v0, v28

    .line 882
    .line 883
    aput-object v36, v0, v27

    .line 884
    .line 885
    aput-object v1, v0, v25

    .line 886
    .line 887
    aput-object v2, v0, v24

    .line 888
    .line 889
    aput-object v3, v0, v23

    .line 890
    .line 891
    invoke-static {v0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 892
    .line 893
    .line 894
    move-result-object v0

    .line 895
    return-object v0
.end method

.method public static final h(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)Ljava/util/Map;
    .locals 18

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    const/16 v3, 0xa

    .line 5
    .line 6
    const-string v4, "<this>"

    .line 7
    .line 8
    move-object/from16 v5, p0

    .line 9
    .line 10
    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getBasePlanId()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    new-instance v6, Lef/k;

    .line 18
    .line 19
    const-string v7, "basePlanId"

    .line 20
    .line 21
    invoke-direct {v6, v7, v4}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getOfferId()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    new-instance v7, Lef/k;

    .line 29
    .line 30
    const-string v8, "offerId"

    .line 31
    .line 32
    invoke-direct {v7, v8, v4}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getOfferToken()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    new-instance v8, Lef/k;

    .line 40
    .line 41
    const-string v9, "offerToken"

    .line 42
    .line 43
    invoke-direct {v8, v9, v4}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getTags()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    new-instance v9, Lef/k;

    .line 51
    .line 52
    const-string v10, "tags"

    .line 53
    .line 54
    invoke-direct {v9, v10, v4}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getPricingPhases()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, Ljava/lang/Iterable;

    .line 62
    .line 63
    new-instance v10, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-static {v4, v3}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    if-eqz v11, :cond_0

    .line 81
    .line 82
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v11

    .line 86
    check-cast v11, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 87
    .line 88
    invoke-static {v11}, LGe/c;->j(Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;)Ljava/util/Map;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    invoke-interface {v10, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    new-instance v4, Lef/k;

    .line 97
    .line 98
    const-string v11, "pricingPhases"

    .line 99
    .line 100
    invoke-direct {v4, v11, v10}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getBasePlan()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    const/4 v11, 0x0

    .line 108
    if-eqz v10, :cond_1

    .line 109
    .line 110
    invoke-static {v10}, LGe/c;->j(Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;)Ljava/util/Map;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    goto :goto_1

    .line 115
    :cond_1
    move-object v10, v11

    .line 116
    :goto_1
    new-instance v12, Lef/k;

    .line 117
    .line 118
    const-string v13, "basePlan"

    .line 119
    .line 120
    invoke-direct {v12, v13, v10}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getInstallmentPlanDetails()Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    if-eqz v10, :cond_2

    .line 128
    .line 129
    invoke-virtual {v10}, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;->getCommitmentPaymentsCount()I

    .line 130
    .line 131
    .line 132
    move-result v13

    .line 133
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object v13

    .line 137
    new-instance v14, Lef/k;

    .line 138
    .line 139
    const-string v15, "commitmentPaymentsCount"

    .line 140
    .line 141
    invoke-direct {v14, v15, v13}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v10}, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;->getSubsequentCommitmentPaymentsCount()I

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    new-instance v13, Lef/k;

    .line 153
    .line 154
    const-string v15, "subsequentCommitmentPaymentsCount"

    .line 155
    .line 156
    invoke-direct {v13, v15, v10}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    new-array v10, v2, [Lef/k;

    .line 160
    .line 161
    aput-object v14, v10, v1

    .line 162
    .line 163
    aput-object v13, v10, v0

    .line 164
    .line 165
    invoke-static {v10}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    goto :goto_2

    .line 170
    :cond_2
    move-object v10, v11

    .line 171
    :goto_2
    new-instance v13, Lef/k;

    .line 172
    .line 173
    const-string v14, "installmentPlanDetails"

    .line 174
    .line 175
    invoke-direct {v13, v14, v10}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getTrialPhase()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    if-eqz v10, :cond_3

    .line 183
    .line 184
    invoke-static {v10}, LGe/c;->j(Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;)Ljava/util/Map;

    .line 185
    .line 186
    .line 187
    move-result-object v10

    .line 188
    goto :goto_3

    .line 189
    :cond_3
    move-object v10, v11

    .line 190
    :goto_3
    new-instance v14, Lef/k;

    .line 191
    .line 192
    const-string v15, "trialPhase"

    .line 193
    .line 194
    invoke-direct {v14, v15, v10}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getIntroPhase()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 198
    .line 199
    .line 200
    move-result-object v10

    .line 201
    if-eqz v10, :cond_4

    .line 202
    .line 203
    invoke-static {v10}, LGe/c;->j(Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;)Ljava/util/Map;

    .line 204
    .line 205
    .line 206
    move-result-object v11

    .line 207
    :cond_4
    new-instance v10, Lef/k;

    .line 208
    .line 209
    const-string v15, "introPhase"

    .line 210
    .line 211
    invoke-direct {v10, v15, v11}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getHasTrial()Z

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 219
    .line 220
    .line 221
    move-result-object v11

    .line 222
    new-instance v15, Lef/k;

    .line 223
    .line 224
    move/from16 v16, v0

    .line 225
    .line 226
    const-string v0, "hasTrial"

    .line 227
    .line 228
    invoke-direct {v15, v0, v11}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getHasIntro()Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    new-instance v11, Lef/k;

    .line 240
    .line 241
    move/from16 v17, v1

    .line 242
    .line 243
    const-string v1, "hasIntro"

    .line 244
    .line 245
    invoke-direct {v11, v1, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getHasTrialOrIntro()Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    new-instance v1, Lef/k;

    .line 257
    .line 258
    const-string v5, "hasTrialOrIntro"

    .line 259
    .line 260
    invoke-direct {v1, v5, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    const/16 v0, 0xc

    .line 264
    .line 265
    new-array v0, v0, [Lef/k;

    .line 266
    .line 267
    aput-object v6, v0, v17

    .line 268
    .line 269
    aput-object v7, v0, v16

    .line 270
    .line 271
    aput-object v8, v0, v2

    .line 272
    .line 273
    const/4 v2, 0x3

    .line 274
    aput-object v9, v0, v2

    .line 275
    .line 276
    const/4 v2, 0x4

    .line 277
    aput-object v4, v0, v2

    .line 278
    .line 279
    const/4 v2, 0x5

    .line 280
    aput-object v12, v0, v2

    .line 281
    .line 282
    const/4 v2, 0x6

    .line 283
    aput-object v13, v0, v2

    .line 284
    .line 285
    const/4 v2, 0x7

    .line 286
    aput-object v14, v0, v2

    .line 287
    .line 288
    const/16 v2, 0x8

    .line 289
    .line 290
    aput-object v10, v0, v2

    .line 291
    .line 292
    const/16 v2, 0x9

    .line 293
    .line 294
    aput-object v15, v0, v2

    .line 295
    .line 296
    aput-object v11, v0, v3

    .line 297
    .line 298
    const/16 v2, 0xb

    .line 299
    .line 300
    aput-object v1, v0, v2

    .line 301
    .line 302
    invoke-static {v0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    return-object v0
.end method

.method public static final i(Lcom/qonversion/android/sdk/dto/products/QProductPrice;)Ljava/util/Map;
    .locals 6

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getPriceAmountMicros()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lef/k;

    .line 15
    .line 16
    const-string v2, "priceAmountMicros"

    .line 17
    .line 18
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getPriceCurrencyCode()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v2, Lef/k;

    .line 26
    .line 27
    const-string v3, "priceCurrencyCode"

    .line 28
    .line 29
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getFormattedPrice()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v3, Lef/k;

    .line 37
    .line 38
    const-string v4, "formattedPrice"

    .line 39
    .line 40
    invoke-direct {v3, v4, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->isFree()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    new-instance v4, Lef/k;

    .line 52
    .line 53
    const-string v5, "isFree"

    .line 54
    .line 55
    invoke-direct {v4, v5, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getCurrencySymbol()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    new-instance v0, Lef/k;

    .line 63
    .line 64
    const-string v5, "currencySymbol"

    .line 65
    .line 66
    invoke-direct {v0, v5, p0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x5

    .line 70
    new-array p0, p0, [Lef/k;

    .line 71
    .line 72
    const/4 v5, 0x0

    .line 73
    aput-object v1, p0, v5

    .line 74
    .line 75
    const/4 v1, 0x1

    .line 76
    aput-object v2, p0, v1

    .line 77
    .line 78
    const/4 v1, 0x2

    .line 79
    aput-object v3, p0, v1

    .line 80
    .line 81
    const/4 v1, 0x3

    .line 82
    aput-object v4, p0, v1

    .line 83
    .line 84
    const/4 v1, 0x4

    .line 85
    aput-object v0, p0, v1

    .line 86
    .line 87
    invoke-static {p0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
.end method

.method public static final j(Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;)Ljava/util/Map;
    .locals 9

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getPrice()Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, LGe/c;->i(Lcom/qonversion/android/sdk/dto/products/QProductPrice;)Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lef/k;

    .line 15
    .line 16
    const-string v2, "price"

    .line 17
    .line 18
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, LGe/c;->k(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;)Ljava/util/Map;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v2, Lef/k;

    .line 30
    .line 31
    const-string v3, "billingPeriod"

    .line 32
    .line 33
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingCycleCount()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v3, Lef/k;

    .line 45
    .line 46
    const-string v4, "billingCycleCount"

    .line 47
    .line 48
    invoke-direct {v3, v4, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getRecurrenceMode()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v4, Lef/k;

    .line 60
    .line 61
    const-string v5, "recurrenceMode"

    .line 62
    .line 63
    invoke-direct {v4, v5, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getType()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    new-instance v5, Lef/k;

    .line 75
    .line 76
    const-string v6, "type"

    .line 77
    .line 78
    invoke-direct {v5, v6, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->isTrial()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    new-instance v6, Lef/k;

    .line 90
    .line 91
    const-string v7, "isTrial"

    .line 92
    .line 93
    invoke-direct {v6, v7, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->isIntro()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    new-instance v7, Lef/k;

    .line 105
    .line 106
    const-string v8, "isIntro"

    .line 107
    .line 108
    invoke-direct {v7, v8, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->isBasePlan()Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    new-instance v0, Lef/k;

    .line 120
    .line 121
    const-string v8, "isBasePlan"

    .line 122
    .line 123
    invoke-direct {v0, v8, p0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    const/16 p0, 0x8

    .line 127
    .line 128
    new-array p0, p0, [Lef/k;

    .line 129
    .line 130
    const/4 v8, 0x0

    .line 131
    aput-object v1, p0, v8

    .line 132
    .line 133
    const/4 v1, 0x1

    .line 134
    aput-object v2, p0, v1

    .line 135
    .line 136
    const/4 v1, 0x2

    .line 137
    aput-object v3, p0, v1

    .line 138
    .line 139
    const/4 v1, 0x3

    .line 140
    aput-object v4, p0, v1

    .line 141
    .line 142
    const/4 v1, 0x4

    .line 143
    aput-object v5, p0, v1

    .line 144
    .line 145
    const/4 v1, 0x5

    .line 146
    aput-object v6, p0, v1

    .line 147
    .line 148
    const/4 v1, 0x6

    .line 149
    aput-object v7, p0, v1

    .line 150
    .line 151
    const/4 v1, 0x7

    .line 152
    aput-object v0, p0, v1

    .line 153
    .line 154
    invoke-static {p0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0
.end method

.method public static final k(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;)Ljava/util/Map;
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->getUnitCount()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lef/k;

    .line 15
    .line 16
    const-string v2, "unitCount"

    .line 17
    .line 18
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->getUnit()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v2, Lef/k;

    .line 30
    .line 31
    const-string v3, "unit"

    .line 32
    .line 33
    invoke-direct {v2, v3, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->getIso()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance v0, Lef/k;

    .line 41
    .line 42
    const-string v3, "iso"

    .line 43
    .line 44
    invoke-direct {v0, v3, p0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x3

    .line 48
    new-array p0, p0, [Lef/k;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    aput-object v1, p0, v3

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    aput-object v2, p0, v1

    .line 55
    .line 56
    const/4 v1, 0x2

    .line 57
    aput-object v0, p0, v1

    .line 58
    .line 59
    invoke-static {p0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public static final l(Lcom/qonversion/android/sdk/dto/QonversionError;)LGe/v;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LGe/v;

    .line 7
    .line 8
    invoke-direct {v0, p0}, LGe/v;-><init>(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
