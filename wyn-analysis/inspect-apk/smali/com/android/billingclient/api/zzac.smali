.class public final synthetic Lcom/android/billingclient/api/zzac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic zza:Lcom/android/billingclient/api/a;

.field public final synthetic zzb:Ljava/lang/String;

.field public final synthetic zzc:Ljava/util/List;

.field public final synthetic zzd:Lcom/android/billingclient/api/SkuDetailsResponseListener;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/a;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/android/billingclient/api/SkuDetailsResponseListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/zzac;->zza:Lcom/android/billingclient/api/a;

    iput-object p2, p0, Lcom/android/billingclient/api/zzac;->zzb:Ljava/lang/String;

    iput-object p3, p0, Lcom/android/billingclient/api/zzac;->zzc:Ljava/util/List;

    iput-object p5, p0, Lcom/android/billingclient/api/zzac;->zzd:Lcom/android/billingclient/api/SkuDetailsResponseListener;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lcom/android/billingclient/api/zzac;->zza:Lcom/android/billingclient/api/a;

    .line 4
    .line 5
    iget-object v6, v1, Lcom/android/billingclient/api/zzac;->zzb:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v0, v1, Lcom/android/billingclient/api/zzac;->zzc:Ljava/util/List;

    .line 8
    .line 9
    iget-object v9, v1, Lcom/android/billingclient/api/zzac;->zzd:Lcom/android/billingclient/api/SkuDetailsResponseListener;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const-string v10, "BillingClient"

    .line 15
    .line 16
    new-instance v11, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v12

    .line 25
    const/4 v3, 0x0

    .line 26
    :goto_0
    if-ge v3, v12, :cond_b

    .line 27
    .line 28
    add-int/lit8 v15, v3, 0x14

    .line 29
    .line 30
    if-le v15, v12, :cond_0

    .line 31
    .line 32
    move v4, v12

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    move v4, v15

    .line 35
    :goto_1
    new-instance v5, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-interface {v0, v3, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 42
    .line 43
    .line 44
    new-instance v7, Landroid/os/Bundle;

    .line 45
    .line 46
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v3, "ITEM_ID_LIST"

    .line 50
    .line 51
    invoke-virtual {v7, v3, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 52
    .line 53
    .line 54
    iget-object v3, v2, Lcom/android/billingclient/api/a;->b:Ljava/lang/String;

    .line 55
    .line 56
    const-string v4, "playBillingLibraryVersion"

    .line 57
    .line 58
    invoke-virtual {v7, v4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/16 v3, 0x8

    .line 62
    .line 63
    :try_start_0
    iget-boolean v5, v2, Lcom/android/billingclient/api/a;->o:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_6

    .line 64
    .line 65
    if-eqz v5, :cond_5

    .line 66
    .line 67
    move v5, v3

    .line 68
    :try_start_1
    iget-object v3, v2, Lcom/android/billingclient/api/a;->g:Lcom/google/android/gms/internal/play_billing/zzs;

    .line 69
    .line 70
    iget-object v8, v2, Lcom/android/billingclient/api/a;->e:Landroid/content/Context;

    .line 71
    .line 72
    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v8
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    .line 76
    :try_start_2
    iget v5, v2, Lcom/android/billingclient/api/a;->k:I

    .line 77
    .line 78
    iget-object v13, v2, Lcom/android/billingclient/api/a;->z:Lcom/android/billingclient/api/PendingPurchasesParams;

    .line 79
    .line 80
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 81
    .line 82
    .line 83
    :try_start_3
    iget-boolean v13, v2, Lcom/android/billingclient/api/a;->v:Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 84
    .line 85
    const/16 v16, 0x0

    .line 86
    .line 87
    if-eqz v13, :cond_1

    .line 88
    .line 89
    :try_start_4
    iget-object v13, v2, Lcom/android/billingclient/api/a;->z:Lcom/android/billingclient/api/PendingPurchasesParams;

    .line 90
    .line 91
    iget-boolean v13, v13, Lcom/android/billingclient/api/PendingPurchasesParams;->a:Z

    .line 92
    .line 93
    if-eqz v13, :cond_1

    .line 94
    .line 95
    const/4 v13, 0x1

    .line 96
    goto :goto_2

    .line 97
    :cond_1
    const/4 v13, 0x0

    .line 98
    :goto_2
    iget-object v14, v2, Lcom/android/billingclient/api/a;->b:Ljava/lang/String;

    .line 99
    .line 100
    move-object/from16 v17, v8

    .line 101
    .line 102
    new-instance v8, Landroid/os/Bundle;

    .line 103
    .line 104
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 105
    .line 106
    .line 107
    move-object/from16 v18, v0

    .line 108
    .line 109
    const/16 v0, 0x9

    .line 110
    .line 111
    if-lt v5, v0, :cond_2

    .line 112
    .line 113
    invoke-virtual {v8, v4, v14}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto :goto_4

    .line 117
    :catch_0
    move-exception v0

    .line 118
    :goto_3
    const/16 v13, 0x8

    .line 119
    .line 120
    goto/16 :goto_b

    .line 121
    .line 122
    :cond_2
    :goto_4
    if-lt v5, v0, :cond_3

    .line 123
    .line 124
    const-string v0, "enablePendingPurchases"

    .line 125
    .line 126
    const/4 v4, 0x1

    .line 127
    invoke-virtual {v8, v0, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 128
    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_3
    const/4 v4, 0x1

    .line 132
    :goto_5
    if-eqz v13, :cond_4

    .line 133
    .line 134
    const-string v0, "enablePendingPurchaseForSubscriptions"

    .line 135
    .line 136
    invoke-virtual {v8, v0, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 137
    .line 138
    .line 139
    :cond_4
    const/16 v4, 0xa

    .line 140
    .line 141
    move-object/from16 v5, v17

    .line 142
    .line 143
    const/16 v13, 0x8

    .line 144
    .line 145
    :try_start_5
    invoke-interface/range {v3 .. v8}, Lcom/google/android/gms/internal/play_billing/zzs;->zzl(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    goto :goto_7

    .line 150
    :catch_1
    move-exception v0

    .line 151
    goto/16 :goto_b

    .line 152
    .line 153
    :catch_2
    move-exception v0

    .line 154
    const/16 v16, 0x0

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :catch_3
    move-exception v0

    .line 158
    const/16 v13, 0x8

    .line 159
    .line 160
    :goto_6
    const/16 v16, 0x0

    .line 161
    .line 162
    goto/16 :goto_b

    .line 163
    .line 164
    :catch_4
    move-exception v0

    .line 165
    move v13, v5

    .line 166
    goto :goto_6

    .line 167
    :cond_5
    move-object/from16 v18, v0

    .line 168
    .line 169
    move v13, v3

    .line 170
    const/16 v16, 0x0

    .line 171
    .line 172
    iget-object v0, v2, Lcom/android/billingclient/api/a;->g:Lcom/google/android/gms/internal/play_billing/zzs;

    .line 173
    .line 174
    iget-object v3, v2, Lcom/android/billingclient/api/a;->e:Landroid/content/Context;

    .line 175
    .line 176
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    const/4 v4, 0x3

    .line 181
    invoke-interface {v0, v4, v3, v6, v7}, Lcom/google/android/gms/internal/play_billing/zzs;->zzk(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 182
    .line 183
    .line 184
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 185
    :goto_7
    const/4 v3, 0x4

    .line 186
    const-string v4, "Item is unavailable for purchase."

    .line 187
    .line 188
    if-nez v0, :cond_6

    .line 189
    .line 190
    const-string v0, "querySkuDetailsAsync got null sku details list"

    .line 191
    .line 192
    invoke-static {v10, v0}, Lcom/google/android/gms/internal/play_billing/zzb;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    const/16 v0, 0x2c

    .line 196
    .line 197
    sget-object v5, Lcom/android/billingclient/api/i;->A:Lcom/android/billingclient/api/BillingResult;

    .line 198
    .line 199
    invoke-static {v0, v13, v5}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 204
    .line 205
    .line 206
    :goto_8
    move v13, v3

    .line 207
    :goto_9
    move-object/from16 v11, v16

    .line 208
    .line 209
    goto/16 :goto_c

    .line 210
    .line 211
    :cond_6
    const-string v5, "DETAILS_LIST"

    .line 212
    .line 213
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    const/4 v8, 0x6

    .line 218
    if-nez v7, :cond_8

    .line 219
    .line 220
    invoke-static {v0, v10}, Lcom/google/android/gms/internal/play_billing/zzb;->zzb(Landroid/os/Bundle;Ljava/lang/String;)I

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    invoke-static {v0, v10}, Lcom/google/android/gms/internal/play_billing/zzb;->zzg(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    if-eqz v3, :cond_7

    .line 229
    .line 230
    new-instance v0, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    const-string v5, "getSkuDetails() failed. Response code: "

    .line 233
    .line 234
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-static {v10, v0}, Lcom/google/android/gms/internal/play_billing/zzb;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    const/16 v0, 0x17

    .line 248
    .line 249
    invoke-static {v3, v4}, Lcom/android/billingclient/api/i;->a(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    invoke-static {v0, v13, v5}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 258
    .line 259
    .line 260
    move v13, v3

    .line 261
    goto/16 :goto_c

    .line 262
    .line 263
    :cond_7
    const-string v0, "getSkuDetails() returned a bundle with neither an error nor a detail list."

    .line 264
    .line 265
    invoke-static {v10, v0}, Lcom/google/android/gms/internal/play_billing/zzb;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    const/16 v0, 0x2d

    .line 269
    .line 270
    invoke-static {v8, v4}, Lcom/android/billingclient/api/i;->a(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-static {v0, v13, v3}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 279
    .line 280
    .line 281
    move v13, v8

    .line 282
    goto/16 :goto_c

    .line 283
    .line 284
    :cond_8
    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    if-nez v0, :cond_9

    .line 289
    .line 290
    const-string v0, "querySkuDetailsAsync got null response list"

    .line 291
    .line 292
    invoke-static {v10, v0}, Lcom/google/android/gms/internal/play_billing/zzb;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    const/16 v0, 0x2e

    .line 296
    .line 297
    sget-object v5, Lcom/android/billingclient/api/i;->A:Lcom/android/billingclient/api/BillingResult;

    .line 298
    .line 299
    invoke-static {v0, v13, v5}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 304
    .line 305
    .line 306
    goto :goto_8

    .line 307
    :cond_9
    const/4 v3, 0x0

    .line 308
    :goto_a
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    if-ge v3, v4, :cond_a

    .line 313
    .line 314
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    check-cast v4, Ljava/lang/String;

    .line 319
    .line 320
    :try_start_6
    new-instance v5, Lcom/android/billingclient/api/SkuDetails;

    .line 321
    .line 322
    invoke-direct {v5, v4}, Lcom/android/billingclient/api/SkuDetails;-><init>(Ljava/lang/String;)V
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_5

    .line 323
    .line 324
    .line 325
    invoke-virtual {v5}, Lcom/android/billingclient/api/SkuDetails;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    const-string v7, "Got sku details: "

    .line 330
    .line 331
    invoke-virtual {v7, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    invoke-static {v10, v4}, Lcom/google/android/gms/internal/play_billing/zzb;->zzj(Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    add-int/lit8 v3, v3, 0x1

    .line 342
    .line 343
    goto :goto_a

    .line 344
    :catch_5
    move-exception v0

    .line 345
    const-string v3, "Got a JSON exception trying to decode SkuDetails."

    .line 346
    .line 347
    invoke-static {v10, v3, v0}, Lcom/google/android/gms/internal/play_billing/zzb;->zzl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 348
    .line 349
    .line 350
    const-string v4, "Error trying to decode SkuDetails."

    .line 351
    .line 352
    invoke-static {v8, v4}, Lcom/android/billingclient/api/i;->a(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    const/16 v3, 0x2f

    .line 357
    .line 358
    invoke-static {v3, v13, v0}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 363
    .line 364
    .line 365
    move v13, v8

    .line 366
    goto/16 :goto_9

    .line 367
    .line 368
    :cond_a
    move v3, v15

    .line 369
    move-object/from16 v0, v18

    .line 370
    .line 371
    goto/16 :goto_0

    .line 372
    .line 373
    :catch_6
    move-exception v0

    .line 374
    move v13, v3

    .line 375
    goto/16 :goto_6

    .line 376
    .line 377
    :goto_b
    const-string v3, "querySkuDetailsAsync got a remote exception (try to reconnect)."

    .line 378
    .line 379
    invoke-static {v10, v3, v0}, Lcom/google/android/gms/internal/play_billing/zzb;->zzl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 380
    .line 381
    .line 382
    const/16 v0, 0x2b

    .line 383
    .line 384
    sget-object v3, Lcom/android/billingclient/api/i;->l:Lcom/android/billingclient/api/BillingResult;

    .line 385
    .line 386
    invoke-static {v0, v13, v3}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 391
    .line 392
    .line 393
    const-string v4, "Service connection is disconnected."

    .line 394
    .line 395
    const/4 v13, -0x1

    .line 396
    goto/16 :goto_9

    .line 397
    .line 398
    :cond_b
    const/16 v16, 0x0

    .line 399
    .line 400
    const-string v4, ""

    .line 401
    .line 402
    const/4 v13, 0x0

    .line 403
    :goto_c
    invoke-static {v13, v4}, Lcom/android/billingclient/api/i;->a(ILjava/lang/String;)Lcom/android/billingclient/api/BillingResult;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-interface {v9, v0, v11}, Lcom/android/billingclient/api/SkuDetailsResponseListener;->onSkuDetailsResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    .line 408
    .line 409
    .line 410
    return-object v16
.end method
