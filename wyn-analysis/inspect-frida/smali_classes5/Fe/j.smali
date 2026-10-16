.class public final LFe/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;


# instance fields
.field public final synthetic a:LFe/m;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public constructor <init>(LFe/m;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LFe/j;->a:LFe/m;

    .line 5
    .line 6
    iput-object p2, p0, LFe/j;->b:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 3

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LFe/j;->a:LFe/m;

    .line 7
    .line 8
    iget-object v0, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lac/a;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, "Failed to load products for the screen:\n"

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {v0, p1}, LBa/c;->q(Lac/a;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final onSuccess(Ljava/util/Map;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "data"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x2

    .line 8
    const-string v5, "products"

    .line 9
    .line 10
    move-object/from16 v6, p1

    .line 11
    .line 12
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-eqz v7, :cond_1

    .line 33
    .line 34
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    check-cast v7, Ljava/util/Map$Entry;

    .line 39
    .line 40
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    check-cast v8, Ljava/lang/String;

    .line 45
    .line 46
    iget-object v9, v1, LFe/j;->b:Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {v9, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    if-eqz v8, :cond_0

    .line 53
    .line 54
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-virtual {v5, v8, v7}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    invoke-interface {v5}, Ljava/util/Map;->size()I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    invoke-static {v7}, Lff/B;->D(I)I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    invoke-direct {v6, v7}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    check-cast v5, Ljava/lang/Iterable;

    .line 84
    .line 85
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    iget-object v8, v1, LFe/j;->a:LFe/m;

    .line 94
    .line 95
    if-eqz v7, :cond_a

    .line 96
    .line 97
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    check-cast v7, Ljava/util/Map$Entry;

    .line 102
    .line 103
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    check-cast v7, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 112
    .line 113
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v7}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    new-instance v10, Lef/k;

    .line 121
    .line 122
    const-string v11, "id"

    .line 123
    .line 124
    invoke-direct {v10, v11, v8}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v7}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    new-instance v11, Lef/k;

    .line 132
    .line 133
    const-string v12, "store_id"

    .line 134
    .line 135
    invoke-direct {v11, v12, v8}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    new-array v8, v4, [Lef/k;

    .line 139
    .line 140
    const/4 v12, 0x0

    .line 141
    aput-object v10, v8, v12

    .line 142
    .line 143
    aput-object v11, v8, v2

    .line 144
    .line 145
    invoke-static {v8}, Lff/A;->S([Lef/k;)Ljava/util/LinkedHashMap;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    invoke-virtual {v7}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreDetails()Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    if-eqz v7, :cond_9

    .line 154
    .line 155
    const-string v10, "title"

    .line 156
    .line 157
    invoke-virtual {v7}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getTitle()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    invoke-interface {v8, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v7}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isInApp()Z

    .line 165
    .line 166
    .line 167
    move-result v10

    .line 168
    const-string v11, "currency_code"

    .line 169
    .line 170
    const-string v12, "currency_symbol"

    .line 171
    .line 172
    const-string v13, "price"

    .line 173
    .line 174
    if-eqz v10, :cond_2

    .line 175
    .line 176
    invoke-virtual {v7}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getInAppOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    if-eqz v7, :cond_9

    .line 181
    .line 182
    invoke-virtual {v7}, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;->getPrice()Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    if-eqz v7, :cond_9

    .line 187
    .line 188
    invoke-virtual {v7}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getPriceAmount()D

    .line 189
    .line 190
    .line 191
    move-result-wide v14

    .line 192
    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    invoke-interface {v8, v13, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v7}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getCurrencySymbol()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v10

    .line 203
    invoke-interface {v8, v12, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v7}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getPriceCurrencyCode()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    invoke-interface {v8, v11, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    goto/16 :goto_4

    .line 214
    .line 215
    :cond_2
    invoke-virtual {v7}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getDefaultSubscriptionOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    if-eqz v7, :cond_9

    .line 220
    .line 221
    invoke-virtual {v7}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getBasePlan()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    if-eqz v10, :cond_3

    .line 226
    .line 227
    invoke-virtual {v10}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getPrice()Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    .line 228
    .line 229
    .line 230
    move-result-object v14

    .line 231
    invoke-virtual {v14}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getPriceAmount()D

    .line 232
    .line 233
    .line 234
    move-result-wide v15

    .line 235
    invoke-static/range {v15 .. v16}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 236
    .line 237
    .line 238
    move-result-object v15

    .line 239
    invoke-interface {v8, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v14}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getCurrencySymbol()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v13

    .line 246
    invoke-interface {v8, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v14}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getPriceCurrencyCode()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v12

    .line 253
    invoke-interface {v8, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v10}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 257
    .line 258
    .line 259
    move-result-object v11

    .line 260
    invoke-virtual {v11}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->getUnit()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 261
    .line 262
    .line 263
    move-result-object v11

    .line 264
    invoke-static {v11}, LFe/m;->e0(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v11

    .line 268
    const-string v12, "period_unit"

    .line 269
    .line 270
    invoke-interface {v8, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v10}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 274
    .line 275
    .line 276
    move-result-object v10

    .line 277
    invoke-virtual {v10}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->getUnitCount()I

    .line 278
    .line 279
    .line 280
    move-result v10

    .line 281
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 282
    .line 283
    .line 284
    move-result-object v10

    .line 285
    const-string v11, "period_unit_count"

    .line 286
    .line 287
    invoke-interface {v8, v11, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    :cond_3
    invoke-virtual {v7}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getTrialPhase()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 291
    .line 292
    .line 293
    move-result-object v10

    .line 294
    if-nez v10, :cond_4

    .line 295
    .line 296
    invoke-virtual {v7}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getIntroPhase()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 297
    .line 298
    .line 299
    move-result-object v10

    .line 300
    :cond_4
    if-eqz v10, :cond_9

    .line 301
    .line 302
    invoke-virtual {v10}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->isTrial()Z

    .line 303
    .line 304
    .line 305
    move-result v7

    .line 306
    const-string v11, "trial"

    .line 307
    .line 308
    if-eqz v7, :cond_5

    .line 309
    .line 310
    move-object v7, v11

    .line 311
    goto :goto_2

    .line 312
    :cond_5
    const-string v7, "intro"

    .line 313
    .line 314
    :goto_2
    const-string v12, "payment_mode"

    .line 315
    .line 316
    invoke-interface {v8, v12, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v10}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getPrice()Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    .line 320
    .line 321
    .line 322
    move-result-object v7

    .line 323
    invoke-virtual {v7}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getPriceAmount()D

    .line 324
    .line 325
    .line 326
    move-result-wide v12

    .line 327
    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 328
    .line 329
    .line 330
    move-result-object v7

    .line 331
    const-string v12, "intro_price"

    .line 332
    .line 333
    invoke-interface {v8, v12, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v10}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getType()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 337
    .line 338
    .line 339
    move-result-object v7

    .line 340
    sget-object v12, LFe/i;->b:[I

    .line 341
    .line 342
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 343
    .line 344
    .line 345
    move-result v7

    .line 346
    aget v7, v12, v7

    .line 347
    .line 348
    if-eq v7, v2, :cond_8

    .line 349
    .line 350
    if-eq v7, v4, :cond_7

    .line 351
    .line 352
    const/4 v11, 0x3

    .line 353
    if-eq v7, v11, :cond_6

    .line 354
    .line 355
    move-object v11, v3

    .line 356
    goto :goto_3

    .line 357
    :cond_6
    const-string v11, "pay_as_you_go"

    .line 358
    .line 359
    goto :goto_3

    .line 360
    :cond_7
    const-string v11, "pay_up_front"

    .line 361
    .line 362
    :cond_8
    :goto_3
    const-string v7, "intro_price_type"

    .line 363
    .line 364
    invoke-interface {v8, v7, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v10}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 368
    .line 369
    .line 370
    move-result-object v7

    .line 371
    invoke-virtual {v7}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->getUnit()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 372
    .line 373
    .line 374
    move-result-object v7

    .line 375
    invoke-static {v7}, LFe/m;->e0(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v7

    .line 379
    const-string v11, "intro_period_unit"

    .line 380
    .line 381
    invoke-interface {v8, v11, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v10}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 385
    .line 386
    .line 387
    move-result-object v7

    .line 388
    invoke-virtual {v7}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->getUnitCount()I

    .line 389
    .line 390
    .line 391
    move-result v7

    .line 392
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 393
    .line 394
    .line 395
    move-result-object v7

    .line 396
    const-string v11, "intro_period_unit_count"

    .line 397
    .line 398
    invoke-interface {v8, v11, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v10}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingCycleCount()I

    .line 402
    .line 403
    .line 404
    move-result v7

    .line 405
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 406
    .line 407
    .line 408
    move-result-object v7

    .line 409
    const-string v10, "intro_number_of_periods"

    .line 410
    .line 411
    invoke-interface {v8, v10, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    :cond_9
    :goto_4
    invoke-interface {v6, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    goto/16 :goto_1

    .line 418
    .line 419
    :cond_a
    new-instance v2, Lef/k;

    .line 420
    .line 421
    invoke-direct {v2, v0, v6}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    invoke-static {v2}, Lff/B;->E(Lef/k;)Ljava/util/Map;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    iget-object v5, v8, LFe/m;->e:Landroidx/fragment/app/X;

    .line 429
    .line 430
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 437
    .line 438
    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 445
    if-eqz v0, :cond_c

    .line 446
    .line 447
    iget-object v2, v8, LFe/m;->c:LFe/h;

    .line 448
    .line 449
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    iget-object v2, v2, LFe/h;->d:LX2/j;

    .line 453
    .line 454
    if-eqz v2, :cond_b

    .line 455
    .line 456
    iget-object v2, v2, LX2/j;->c:Ljava/lang/Object;

    .line 457
    .line 458
    check-cast v2, Landroid/webkit/WebView;

    .line 459
    .line 460
    new-instance v4, Ljava/lang/StringBuilder;

    .line 461
    .line 462
    const-string v5, "window.dispatchEvent(new CustomEvent(\"setProducts\",  {detail: "

    .line 463
    .line 464
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    const-string v0, "} ))"

    .line 471
    .line 472
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    invoke-virtual {v2, v0, v3}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 480
    .line 481
    .line 482
    :cond_b
    return-void

    .line 483
    :cond_c
    :try_start_1
    new-instance v0, Lbe/b;

    .line 484
    .line 485
    sget-object v2, Lbe/a;->e:Lbe/a;

    .line 486
    .line 487
    const-string v5, "Json might contain unsupported elements (f.e. null keys)"

    .line 488
    .line 489
    const/4 v6, 0x4

    .line 490
    invoke-direct {v0, v2, v5, v3, v6}, Lbe/b;-><init>(Lbe/a;Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 491
    .line 492
    .line 493
    throw v0
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 494
    :catch_0
    move-exception v0

    .line 495
    new-instance v2, Lbe/b;

    .line 496
    .line 497
    sget-object v5, Lbe/a;->e:Lbe/a;

    .line 498
    .line 499
    invoke-direct {v2, v5, v3, v0, v4}, Lbe/b;-><init>(Lbe/a;Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 500
    .line 501
    .line 502
    throw v2
.end method
