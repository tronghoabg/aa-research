.class public final synthetic Lcom/android/billingclient/api/zzan;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic zza:Lcom/android/billingclient/api/a;

.field public final synthetic zzb:Lcom/android/billingclient/api/QueryProductDetailsParams;

.field public final synthetic zzc:Lcom/android/billingclient/api/ProductDetailsResponseListener;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/a;Lcom/android/billingclient/api/QueryProductDetailsParams;Lcom/android/billingclient/api/ProductDetailsResponseListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/zzan;->zza:Lcom/android/billingclient/api/a;

    iput-object p2, p0, Lcom/android/billingclient/api/zzan;->zzb:Lcom/android/billingclient/api/QueryProductDetailsParams;

    iput-object p3, p0, Lcom/android/billingclient/api/zzan;->zzc:Lcom/android/billingclient/api/ProductDetailsResponseListener;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lcom/android/billingclient/api/zzan;->zza:Lcom/android/billingclient/api/a;

    .line 4
    .line 5
    iget-object v0, v1, Lcom/android/billingclient/api/zzan;->zzb:Lcom/android/billingclient/api/QueryProductDetailsParams;

    .line 6
    .line 7
    iget-object v3, v1, Lcom/android/billingclient/api/zzan;->zzc:Lcom/android/billingclient/api/ProductDetailsResponseListener;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string v4, "BillingClient"

    .line 13
    .line 14
    new-instance v5, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/android/billingclient/api/QueryProductDetailsParams;->zzb()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v9

    .line 23
    invoke-virtual {v0}, Lcom/android/billingclient/api/QueryProductDetailsParams;->zza()Lcom/google/android/gms/internal/play_billing/zzai;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v12

    .line 31
    const/4 v6, 0x0

    .line 32
    :goto_0
    if-ge v6, v12, :cond_12

    .line 33
    .line 34
    add-int/lit8 v15, v6, 0x14

    .line 35
    .line 36
    if-le v15, v12, :cond_0

    .line 37
    .line 38
    move v7, v12

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    move v7, v15

    .line 41
    :goto_1
    new-instance v8, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-interface {v0, v6, v7}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-direct {v8, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 48
    .line 49
    .line 50
    new-instance v6, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    const/4 v10, 0x0

    .line 60
    :goto_2
    if-ge v10, v7, :cond_1

    .line 61
    .line 62
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    check-cast v11, Lcom/android/billingclient/api/QueryProductDetailsParams$Product;

    .line 67
    .line 68
    invoke-virtual {v11}, Lcom/android/billingclient/api/QueryProductDetailsParams$Product;->zza()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v11

    .line 72
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    add-int/lit8 v10, v10, 0x1

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_1
    new-instance v10, Landroid/os/Bundle;

    .line 79
    .line 80
    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v7, "ITEM_ID_LIST"

    .line 84
    .line 85
    invoke-virtual {v10, v7, v6}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 86
    .line 87
    .line 88
    iget-object v6, v2, Lcom/android/billingclient/api/a;->b:Ljava/lang/String;

    .line 89
    .line 90
    const-string v7, "playBillingLibraryVersion"

    .line 91
    .line 92
    invoke-virtual {v10, v7, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const/4 v6, 0x6

    .line 96
    move/from16 v16, v6

    .line 97
    .line 98
    :try_start_0
    iget-object v6, v2, Lcom/android/billingclient/api/a;->g:Lcom/google/android/gms/internal/play_billing/zzs;

    .line 99
    .line 100
    iget-boolean v11, v2, Lcom/android/billingclient/api/a;->w:Z

    .line 101
    .line 102
    const/4 v13, 0x1

    .line 103
    if-eq v13, v11, :cond_2

    .line 104
    .line 105
    const/16 v11, 0x11

    .line 106
    .line 107
    :goto_3
    const/16 v17, 0x0

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_2
    const/16 v11, 0x14

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :goto_4
    iget-object v14, v2, Lcom/android/billingclient/api/a;->e:Landroid/content/Context;

    .line 114
    .line 115
    invoke-virtual {v14}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v14

    .line 119
    iget-boolean v13, v2, Lcom/android/billingclient/api/a;->v:Z

    .line 120
    .line 121
    if-eqz v13, :cond_3

    .line 122
    .line 123
    iget-object v13, v2, Lcom/android/billingclient/api/a;->z:Lcom/android/billingclient/api/PendingPurchasesParams;

    .line 124
    .line 125
    iget-boolean v13, v13, Lcom/android/billingclient/api/PendingPurchasesParams;->a:Z

    .line 126
    .line 127
    if-eqz v13, :cond_3

    .line 128
    .line 129
    const/4 v13, 0x1

    .line 130
    :goto_5
    move-object/from16 v19, v0

    .line 131
    .line 132
    goto :goto_6

    .line 133
    :cond_3
    const/4 v13, 0x0

    .line 134
    goto :goto_5

    .line 135
    :goto_6
    iget-object v0, v2, Lcom/android/billingclient/api/a;->b:Ljava/lang/String;

    .line 136
    .line 137
    invoke-static/range {v17 .. v17}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 138
    .line 139
    .line 140
    move-result v20

    .line 141
    if-nez v20, :cond_4

    .line 142
    .line 143
    goto :goto_7

    .line 144
    :cond_4
    iget-object v1, v2, Lcom/android/billingclient/api/a;->e:Landroid/content/Context;

    .line 145
    .line 146
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    :goto_7
    invoke-static/range {v17 .. v17}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-nez v1, :cond_5

    .line 154
    .line 155
    goto :goto_8

    .line 156
    :cond_5
    iget-object v1, v2, Lcom/android/billingclient/api/a;->e:Landroid/content/Context;

    .line 157
    .line 158
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    :goto_8
    invoke-static/range {v17 .. v17}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-nez v1, :cond_6

    .line 166
    .line 167
    :goto_9
    move v1, v11

    .line 168
    goto :goto_a

    .line 169
    :cond_6
    iget-object v1, v2, Lcom/android/billingclient/api/a;->e:Landroid/content/Context;

    .line 170
    .line 171
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    goto :goto_9

    .line 175
    :goto_a
    new-instance v11, Landroid/os/Bundle;

    .line 176
    .line 177
    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v11, v7, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    const-string v0, "enablePendingPurchases"

    .line 184
    .line 185
    const/4 v7, 0x1

    .line 186
    invoke-virtual {v11, v0, v7}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 187
    .line 188
    .line 189
    const-string v0, "SKU_DETAILS_RESPONSE_FORMAT"

    .line 190
    .line 191
    const-string v7, "PRODUCT_DETAILS"

    .line 192
    .line 193
    invoke-virtual {v11, v0, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    if-eqz v13, :cond_7

    .line 197
    .line 198
    const-string v0, "enablePendingPurchaseForSubscriptions"

    .line 199
    .line 200
    const/4 v7, 0x1

    .line 201
    invoke-virtual {v11, v0, v7}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 202
    .line 203
    .line 204
    goto :goto_b

    .line 205
    :catch_0
    move-exception v0

    .line 206
    move/from16 v1, v16

    .line 207
    .line 208
    const/4 v13, 0x7

    .line 209
    goto/16 :goto_10

    .line 210
    .line 211
    :cond_7
    :goto_b
    new-instance v0, Ljava/util/ArrayList;

    .line 212
    .line 213
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 214
    .line 215
    .line 216
    new-instance v7, Ljava/util/ArrayList;

    .line 217
    .line 218
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 222
    .line 223
    .line 224
    move-result v13

    .line 225
    move/from16 v21, v1

    .line 226
    .line 227
    const/4 v1, 0x0

    .line 228
    const/16 v20, 0x0

    .line 229
    .line 230
    const/16 v22, 0x0

    .line 231
    .line 232
    :goto_c
    if-ge v1, v13, :cond_9

    .line 233
    .line 234
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v23

    .line 238
    check-cast v23, Lcom/android/billingclient/api/QueryProductDetailsParams$Product;

    .line 239
    .line 240
    move/from16 v24, v1

    .line 241
    .line 242
    move-object/from16 v1, v17

    .line 243
    .line 244
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 248
    .line 249
    .line 250
    move-result v25

    .line 251
    const/16 v18, 0x1

    .line 252
    .line 253
    xor-int/lit8 v1, v25, 0x1

    .line 254
    .line 255
    or-int v22, v22, v1

    .line 256
    .line 257
    invoke-virtual/range {v23 .. v23}, Lcom/android/billingclient/api/QueryProductDetailsParams$Product;->zzb()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    move-object/from16 v23, v6

    .line 262
    .line 263
    const-string v6, "first_party"

    .line 264
    .line 265
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    if-eqz v1, :cond_8

    .line 270
    .line 271
    const-string v1, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products."

    .line 272
    .line 273
    const/4 v6, 0x0

    .line 274
    invoke-static {v6, v1}, Lcom/google/android/gms/internal/play_billing/zzaa;->zzc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move/from16 v20, v18

    .line 281
    .line 282
    :cond_8
    add-int/lit8 v1, v24, 0x1

    .line 283
    .line 284
    move-object/from16 v6, v23

    .line 285
    .line 286
    const/16 v17, 0x0

    .line 287
    .line 288
    goto :goto_c

    .line 289
    :cond_9
    move-object/from16 v23, v6

    .line 290
    .line 291
    if-eqz v22, :cond_a

    .line 292
    .line 293
    const-string v1, "SKU_OFFER_ID_TOKEN_LIST"

    .line 294
    .line 295
    invoke-virtual {v11, v1, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 296
    .line 297
    .line 298
    :cond_a
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-nez v0, :cond_b

    .line 303
    .line 304
    const-string v0, "SKU_SERIALIZED_DOCID_LIST"

    .line 305
    .line 306
    invoke-virtual {v11, v0, v7}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 307
    .line 308
    .line 309
    :cond_b
    if-eqz v20, :cond_c

    .line 310
    .line 311
    const/4 v1, 0x0

    .line 312
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    if-nez v0, :cond_c

    .line 317
    .line 318
    const-string v0, "accountName"

    .line 319
    .line 320
    invoke-virtual {v11, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 321
    .line 322
    .line 323
    :cond_c
    move-object v8, v14

    .line 324
    move/from16 v1, v16

    .line 325
    .line 326
    move/from16 v7, v21

    .line 327
    .line 328
    move-object/from16 v6, v23

    .line 329
    .line 330
    const/4 v13, 0x7

    .line 331
    :try_start_1
    invoke-interface/range {v6 .. v11}, Lcom/google/android/gms/internal/play_billing/zzs;->zzl(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 332
    .line 333
    .line 334
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 335
    const/4 v6, 0x4

    .line 336
    const-string v7, "Item is unavailable for purchase."

    .line 337
    .line 338
    if-nez v0, :cond_d

    .line 339
    .line 340
    const-string v0, "queryProductDetailsAsync got empty product details response."

    .line 341
    .line 342
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/play_billing/zzb;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    const/16 v0, 0x2c

    .line 346
    .line 347
    sget-object v1, Lcom/android/billingclient/api/i;->A:Lcom/android/billingclient/api/BillingResult;

    .line 348
    .line 349
    invoke-static {v0, v13, v1}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 354
    .line 355
    .line 356
    :goto_d
    move v13, v6

    .line 357
    goto/16 :goto_11

    .line 358
    .line 359
    :cond_d
    const-string v8, "DETAILS_LIST"

    .line 360
    .line 361
    invoke-virtual {v0, v8}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 362
    .line 363
    .line 364
    move-result v10

    .line 365
    if-nez v10, :cond_f

    .line 366
    .line 367
    invoke-static {v0, v4}, Lcom/google/android/gms/internal/play_billing/zzb;->zzb(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 368
    .line 369
    .line 370
    move-result v6

    .line 371
    invoke-static {v0, v4}, Lcom/google/android/gms/internal/play_billing/zzb;->zzg(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v7

    .line 375
    if-eqz v6, :cond_e

    .line 376
    .line 377
    new-instance v0, Ljava/lang/StringBuilder;

    .line 378
    .line 379
    const-string v1, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "

    .line 380
    .line 381
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/play_billing/zzb;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    const/16 v0, 0x17

    .line 395
    .line 396
    invoke-static {v6, v7}, Lcom/android/billingclient/api/i;->a(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    invoke-static {v0, v13, v1}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 405
    .line 406
    .line 407
    goto :goto_d

    .line 408
    :cond_e
    const-string v0, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync."

    .line 409
    .line 410
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/play_billing/zzb;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    const/16 v0, 0x2d

    .line 414
    .line 415
    invoke-static {v1, v7}, Lcom/android/billingclient/api/i;->a(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    invoke-static {v0, v13, v4}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 424
    .line 425
    .line 426
    :goto_e
    move v13, v1

    .line 427
    goto/16 :goto_11

    .line 428
    .line 429
    :cond_f
    invoke-virtual {v0, v8}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    if-nez v0, :cond_10

    .line 434
    .line 435
    const-string v0, "queryProductDetailsAsync got null response list"

    .line 436
    .line 437
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/play_billing/zzb;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    const/16 v0, 0x2e

    .line 441
    .line 442
    sget-object v1, Lcom/android/billingclient/api/i;->A:Lcom/android/billingclient/api/BillingResult;

    .line 443
    .line 444
    invoke-static {v0, v13, v1}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 449
    .line 450
    .line 451
    goto :goto_d

    .line 452
    :cond_10
    const/4 v6, 0x0

    .line 453
    :goto_f
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 454
    .line 455
    .line 456
    move-result v7

    .line 457
    if-ge v6, v7, :cond_11

    .line 458
    .line 459
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v7

    .line 463
    check-cast v7, Ljava/lang/String;

    .line 464
    .line 465
    :try_start_2
    new-instance v8, Lcom/android/billingclient/api/ProductDetails;

    .line 466
    .line 467
    invoke-direct {v8, v7}, Lcom/android/billingclient/api/ProductDetails;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 468
    .line 469
    .line 470
    invoke-virtual {v8}, Lcom/android/billingclient/api/ProductDetails;->toString()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v7

    .line 474
    const-string v10, "Got product details: "

    .line 475
    .line 476
    invoke-virtual {v10, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v7

    .line 480
    invoke-static {v4, v7}, Lcom/google/android/gms/internal/play_billing/zzb;->zzj(Ljava/lang/String;Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    add-int/lit8 v6, v6, 0x1

    .line 487
    .line 488
    goto :goto_f

    .line 489
    :catch_1
    move-exception v0

    .line 490
    const-string v6, "Got a JSON exception trying to decode ProductDetails. \n Exception: "

    .line 491
    .line 492
    invoke-static {v4, v6, v0}, Lcom/google/android/gms/internal/play_billing/zzb;->zzl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 493
    .line 494
    .line 495
    const-string v7, "Error trying to decode SkuDetails."

    .line 496
    .line 497
    invoke-static {v1, v7}, Lcom/android/billingclient/api/i;->a(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    const/16 v4, 0x2f

    .line 502
    .line 503
    invoke-static {v4, v13, v0}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 508
    .line 509
    .line 510
    goto :goto_e

    .line 511
    :cond_11
    move-object/from16 v1, p0

    .line 512
    .line 513
    move v6, v15

    .line 514
    move-object/from16 v0, v19

    .line 515
    .line 516
    goto/16 :goto_0

    .line 517
    .line 518
    :catch_2
    move-exception v0

    .line 519
    :goto_10
    const-string v6, "queryProductDetailsAsync got a remote exception (try to reconnect)."

    .line 520
    .line 521
    invoke-static {v4, v6, v0}, Lcom/google/android/gms/internal/play_billing/zzb;->zzl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 522
    .line 523
    .line 524
    const/16 v0, 0x2b

    .line 525
    .line 526
    sget-object v4, Lcom/android/billingclient/api/i;->j:Lcom/android/billingclient/api/BillingResult;

    .line 527
    .line 528
    invoke-static {v0, v13, v4}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 533
    .line 534
    .line 535
    const-string v7, "An internal error occurred."

    .line 536
    .line 537
    goto :goto_e

    .line 538
    :cond_12
    const-string v7, ""

    .line 539
    .line 540
    const/4 v13, 0x0

    .line 541
    :goto_11
    invoke-static {v13, v7}, Lcom/android/billingclient/api/i;->a(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    invoke-interface {v3, v0, v5}, Lcom/android/billingclient/api/ProductDetailsResponseListener;->onProductDetailsResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    .line 546
    .line 547
    .line 548
    const/16 v17, 0x0

    .line 549
    .line 550
    return-object v17
.end method
