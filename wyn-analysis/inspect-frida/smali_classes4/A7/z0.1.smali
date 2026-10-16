.class public final LA7/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, LA7/z0;->a:I

    iput-object p2, p0, LA7/z0;->b:Ljava/lang/Object;

    iput-object p3, p0, LA7/z0;->c:Ljava/lang/Object;

    iput-object p4, p0, LA7/z0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LN6/j;Lcom/google/android/gms/internal/ads/zzcex;Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LA7/z0;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA7/z0;->b:Ljava/lang/Object;

    iput-object p2, p0, LA7/z0;->d:Ljava/lang/Object;

    iput-object p3, p0, LA7/z0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, LA7/z0;->a:I

    iput-object p2, p0, LA7/z0;->b:Ljava/lang/Object;

    iput-object p3, p0, LA7/z0;->c:Ljava/lang/Object;

    iput-object p1, p0, LA7/z0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "ms"

    .line 4
    .line 5
    const-string v0, "Continuation token: "

    .line 6
    .line 7
    const-string v3, "INAPP_CONTINUATION_TOKEN"

    .line 8
    .line 9
    const-string v6, "Got an exception trying to decode the purchase!"

    .line 10
    .line 11
    const-string v7, "BUG: empty/null token!"

    .line 12
    .line 13
    const-string v8, "INAPP_DATA_SIGNATURE_LIST"

    .line 14
    .line 15
    const-string v9, "INAPP_PURCHASE_DATA_LIST"

    .line 16
    .line 17
    const-string v10, "INAPP_PURCHASE_ITEM_LIST"

    .line 18
    .line 19
    const-string v11, "BillingClient"

    .line 20
    .line 21
    const-string v12, ""

    .line 22
    .line 23
    const/4 v13, 0x1

    .line 24
    iget v4, v1, LA7/z0;->a:I

    .line 25
    .line 26
    packed-switch v4, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    iget-object v2, v1, LA7/z0;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Lcom/android/billingclient/api/a;

    .line 32
    .line 33
    iget-object v4, v1, LA7/z0;->b:Ljava/lang/Object;

    .line 34
    .line 35
    move-object/from16 v19, v4

    .line 36
    .line 37
    check-cast v19, Ljava/lang/String;

    .line 38
    .line 39
    invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    const-string v12, "Querying purchase history, item type: "

    .line 44
    .line 45
    invoke-virtual {v12, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-static {v11, v4}, Lcom/google/android/gms/internal/play_billing/zzb;->zzj(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    new-instance v4, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    iget-boolean v12, v2, Lcom/android/billingclient/api/a;->n:Z

    .line 58
    .line 59
    iget-boolean v5, v2, Lcom/android/billingclient/api/a;->v:Z

    .line 60
    .line 61
    iget-object v14, v2, Lcom/android/billingclient/api/a;->z:Lcom/android/billingclient/api/PendingPurchasesParams;

    .line 62
    .line 63
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget-boolean v14, v14, Lcom/android/billingclient/api/PendingPurchasesParams;->a:Z

    .line 67
    .line 68
    iget-object v15, v2, Lcom/android/billingclient/api/a;->b:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v12, v5, v13, v14, v15}, Lcom/google/android/gms/internal/play_billing/zzb;->zzc(ZZZZLjava/lang/String;)Landroid/os/Bundle;

    .line 71
    .line 72
    .line 73
    move-result-object v21

    .line 74
    const/16 v20, 0x0

    .line 75
    .line 76
    :goto_0
    iget-boolean v5, v2, Lcom/android/billingclient/api/a;->l:Z

    .line 77
    .line 78
    if-nez v5, :cond_0

    .line 79
    .line 80
    const-string v0, "getPurchaseHistory is not supported on current device"

    .line 81
    .line 82
    invoke-static {v11, v0}, Lcom/google/android/gms/internal/play_billing/zzb;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    new-instance v0, LY2/B;

    .line 86
    .line 87
    sget-object v2, Lcom/android/billingclient/api/i;->p:Lcom/android/billingclient/api/BillingResult;

    .line 88
    .line 89
    const/4 v3, 0x0

    .line 90
    const/16 v4, 0x14

    .line 91
    .line 92
    invoke-direct {v0, v4, v2, v3}, LY2/B;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto/16 :goto_3

    .line 96
    .line 97
    :cond_0
    const/16 v5, 0xb

    .line 98
    .line 99
    :try_start_0
    iget-object v12, v2, Lcom/android/billingclient/api/a;->g:Lcom/google/android/gms/internal/play_billing/zzs;

    .line 100
    .line 101
    iget-object v14, v2, Lcom/android/billingclient/api/a;->e:Landroid/content/Context;

    .line 102
    .line 103
    invoke-virtual {v14}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v18

    .line 107
    const/16 v17, 0x6

    .line 108
    .line 109
    move-object/from16 v16, v12

    .line 110
    .line 111
    invoke-interface/range {v16 .. v21}, Lcom/google/android/gms/internal/play_billing/zzs;->zzh(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 112
    .line 113
    .line 114
    move-result-object v12
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    .line 115
    const-string v14, "getPurchaseHistory()"

    .line 116
    .line 117
    invoke-static {v12, v14}, Lcom/android/billingclient/api/j;->a(Landroid/os/Bundle;Ljava/lang/String;)LA/x;

    .line 118
    .line 119
    .line 120
    move-result-object v14

    .line 121
    iget-object v15, v14, LA/x;->c:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v15, Lcom/android/billingclient/api/BillingResult;

    .line 124
    .line 125
    move/from16 v16, v13

    .line 126
    .line 127
    sget-object v13, Lcom/android/billingclient/api/i;->k:Lcom/android/billingclient/api/BillingResult;

    .line 128
    .line 129
    if-eq v15, v13, :cond_1

    .line 130
    .line 131
    iget v0, v14, LA/x;->b:I

    .line 132
    .line 133
    invoke-static {v0, v5, v15}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 138
    .line 139
    .line 140
    new-instance v0, LY2/B;

    .line 141
    .line 142
    const/4 v3, 0x0

    .line 143
    const/16 v4, 0x14

    .line 144
    .line 145
    invoke-direct {v0, v4, v15, v3}, LY2/B;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_3

    .line 149
    .line 150
    :cond_1
    invoke-virtual {v12, v10}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 151
    .line 152
    .line 153
    move-result-object v13

    .line 154
    invoke-virtual {v12, v9}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 155
    .line 156
    .line 157
    move-result-object v14

    .line 158
    invoke-virtual {v12, v8}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 159
    .line 160
    .line 161
    move-result-object v15

    .line 162
    move-object/from16 v20, v8

    .line 163
    .line 164
    const/4 v5, 0x0

    .line 165
    const/16 v17, 0x0

    .line 166
    .line 167
    :goto_1
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    if-ge v5, v8, :cond_3

    .line 172
    .line 173
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    check-cast v8, Ljava/lang/String;

    .line 178
    .line 179
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v24

    .line 183
    move-object/from16 v25, v14

    .line 184
    .line 185
    move-object/from16 v14, v24

    .line 186
    .line 187
    check-cast v14, Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v24

    .line 193
    check-cast v24, Ljava/lang/String;

    .line 194
    .line 195
    move/from16 v26, v5

    .line 196
    .line 197
    invoke-static/range {v24 .. v24}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    move-object/from16 v24, v13

    .line 202
    .line 203
    const-string v13, "Purchase record found for sku : "

    .line 204
    .line 205
    invoke-virtual {v13, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    invoke-static {v11, v5}, Lcom/google/android/gms/internal/play_billing/zzb;->zzj(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    :try_start_1
    new-instance v5, Lcom/android/billingclient/api/PurchaseHistoryRecord;

    .line 213
    .line 214
    invoke-direct {v5, v8, v14}, Lcom/android/billingclient/api/PurchaseHistoryRecord;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 215
    .line 216
    .line 217
    invoke-virtual {v5}, Lcom/android/billingclient/api/PurchaseHistoryRecord;->getPurchaseToken()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v8

    .line 221
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 222
    .line 223
    .line 224
    move-result v8

    .line 225
    if-eqz v8, :cond_2

    .line 226
    .line 227
    invoke-static {v11, v7}, Lcom/google/android/gms/internal/play_billing/zzb;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    move/from16 v17, v16

    .line 231
    .line 232
    :cond_2
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    add-int/lit8 v5, v26, 0x1

    .line 236
    .line 237
    move-object/from16 v13, v24

    .line 238
    .line 239
    move-object/from16 v14, v25

    .line 240
    .line 241
    goto :goto_1

    .line 242
    :catch_0
    move-exception v0

    .line 243
    invoke-static {v11, v6, v0}, Lcom/google/android/gms/internal/play_billing/zzb;->zzl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 244
    .line 245
    .line 246
    sget-object v0, Lcom/android/billingclient/api/i;->j:Lcom/android/billingclient/api/BillingResult;

    .line 247
    .line 248
    const/16 v3, 0x33

    .line 249
    .line 250
    const/16 v5, 0xb

    .line 251
    .line 252
    invoke-static {v3, v5, v0}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    invoke-virtual {v2, v3}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 257
    .line 258
    .line 259
    new-instance v2, LY2/B;

    .line 260
    .line 261
    const/4 v3, 0x0

    .line 262
    const/16 v4, 0x14

    .line 263
    .line 264
    invoke-direct {v2, v4, v0, v3}, LY2/B;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    :goto_2
    move-object v0, v2

    .line 268
    goto :goto_3

    .line 269
    :cond_3
    const/16 v5, 0xb

    .line 270
    .line 271
    if-eqz v17, :cond_4

    .line 272
    .line 273
    sget-object v8, Lcom/android/billingclient/api/i;->j:Lcom/android/billingclient/api/BillingResult;

    .line 274
    .line 275
    const/16 v13, 0x1a

    .line 276
    .line 277
    invoke-static {v13, v5, v8}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    invoke-virtual {v2, v5}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 282
    .line 283
    .line 284
    :cond_4
    invoke-virtual {v12, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v8

    .line 292
    invoke-virtual {v0, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v8

    .line 296
    invoke-static {v11, v8}, Lcom/google/android/gms/internal/play_billing/zzb;->zzj(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 300
    .line 301
    .line 302
    move-result v8

    .line 303
    if-eqz v8, :cond_5

    .line 304
    .line 305
    new-instance v0, LY2/B;

    .line 306
    .line 307
    sget-object v2, Lcom/android/billingclient/api/i;->k:Lcom/android/billingclient/api/BillingResult;

    .line 308
    .line 309
    const/16 v3, 0x14

    .line 310
    .line 311
    invoke-direct {v0, v3, v2, v4}, LY2/B;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    goto :goto_3

    .line 315
    :cond_5
    move/from16 v13, v16

    .line 316
    .line 317
    move-object/from16 v8, v20

    .line 318
    .line 319
    move-object/from16 v20, v5

    .line 320
    .line 321
    goto/16 :goto_0

    .line 322
    .line 323
    :catch_1
    move-exception v0

    .line 324
    const-string v3, "Got exception trying to get purchase history, try to reconnect"

    .line 325
    .line 326
    invoke-static {v11, v3, v0}, Lcom/google/android/gms/internal/play_billing/zzb;->zzl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 327
    .line 328
    .line 329
    sget-object v0, Lcom/android/billingclient/api/i;->l:Lcom/android/billingclient/api/BillingResult;

    .line 330
    .line 331
    const/16 v3, 0x3b

    .line 332
    .line 333
    const/16 v5, 0xb

    .line 334
    .line 335
    invoke-static {v3, v5, v0}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    invoke-virtual {v2, v3}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 340
    .line 341
    .line 342
    new-instance v2, LY2/B;

    .line 343
    .line 344
    const/4 v3, 0x0

    .line 345
    const/16 v4, 0x14

    .line 346
    .line 347
    invoke-direct {v2, v4, v0, v3}, LY2/B;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    goto :goto_2

    .line 351
    :goto_3
    iget-object v2, v0, LY2/B;->c:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v2, Lcom/android/billingclient/api/BillingResult;

    .line 354
    .line 355
    iget-object v0, v0, LY2/B;->b:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v0, Ljava/util/ArrayList;

    .line 358
    .line 359
    iget-object v3, v1, LA7/z0;->c:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v3, Lcom/android/billingclient/api/PurchaseHistoryResponseListener;

    .line 362
    .line 363
    invoke-interface {v3, v2, v0}, Lcom/android/billingclient/api/PurchaseHistoryResponseListener;->onPurchaseHistoryResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    .line 364
    .line 365
    .line 366
    const/16 v23, 0x0

    .line 367
    .line 368
    return-object v23

    .line 369
    :pswitch_0
    move-object/from16 v20, v8

    .line 370
    .line 371
    move/from16 v16, v13

    .line 372
    .line 373
    iget-object v2, v1, LA7/z0;->d:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v2, Lcom/android/billingclient/api/a;

    .line 376
    .line 377
    iget-object v4, v1, LA7/z0;->b:Ljava/lang/Object;

    .line 378
    .line 379
    move-object/from16 v27, v4

    .line 380
    .line 381
    check-cast v27, Ljava/lang/String;

    .line 382
    .line 383
    invoke-static/range {v27 .. v27}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v4

    .line 387
    const-string v5, "Querying owned items, item type: "

    .line 388
    .line 389
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    invoke-static {v11, v4}, Lcom/google/android/gms/internal/play_billing/zzb;->zzj(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    new-instance v4, Ljava/util/ArrayList;

    .line 397
    .line 398
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 399
    .line 400
    .line 401
    iget-boolean v5, v2, Lcom/android/billingclient/api/a;->n:Z

    .line 402
    .line 403
    iget-boolean v8, v2, Lcom/android/billingclient/api/a;->v:Z

    .line 404
    .line 405
    iget-object v12, v2, Lcom/android/billingclient/api/a;->z:Lcom/android/billingclient/api/PendingPurchasesParams;

    .line 406
    .line 407
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    iget-boolean v12, v12, Lcom/android/billingclient/api/PendingPurchasesParams;->a:Z

    .line 411
    .line 412
    iget-object v13, v2, Lcom/android/billingclient/api/a;->b:Ljava/lang/String;

    .line 413
    .line 414
    move/from16 v14, v16

    .line 415
    .line 416
    invoke-static {v5, v8, v14, v12, v13}, Lcom/google/android/gms/internal/play_billing/zzb;->zzc(ZZZZLjava/lang/String;)Landroid/os/Bundle;

    .line 417
    .line 418
    .line 419
    move-result-object v29

    .line 420
    const/16 v28, 0x0

    .line 421
    .line 422
    :goto_4
    const/16 v5, 0x9

    .line 423
    .line 424
    :try_start_2
    iget-boolean v8, v2, Lcom/android/billingclient/api/a;->n:Z

    .line 425
    .line 426
    if-eqz v8, :cond_7

    .line 427
    .line 428
    iget-object v8, v2, Lcom/android/billingclient/api/a;->g:Lcom/google/android/gms/internal/play_billing/zzs;

    .line 429
    .line 430
    iget-boolean v12, v2, Lcom/android/billingclient/api/a;->v:Z

    .line 431
    .line 432
    if-eq v14, v12, :cond_6

    .line 433
    .line 434
    move/from16 v25, v5

    .line 435
    .line 436
    goto :goto_5

    .line 437
    :cond_6
    const/16 v12, 0x13

    .line 438
    .line 439
    move/from16 v25, v12

    .line 440
    .line 441
    :goto_5
    iget-object v12, v2, Lcom/android/billingclient/api/a;->e:Landroid/content/Context;

    .line 442
    .line 443
    invoke-virtual {v12}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v26

    .line 447
    move-object/from16 v24, v8

    .line 448
    .line 449
    invoke-interface/range {v24 .. v29}, Lcom/google/android/gms/internal/play_billing/zzs;->zzj(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 450
    .line 451
    .line 452
    move-result-object v8

    .line 453
    move-object/from16 v12, v27

    .line 454
    .line 455
    goto :goto_6

    .line 456
    :catch_2
    move-exception v0

    .line 457
    goto/16 :goto_9

    .line 458
    .line 459
    :cond_7
    move-object/from16 v12, v27

    .line 460
    .line 461
    move-object/from16 v8, v28

    .line 462
    .line 463
    iget-object v13, v2, Lcom/android/billingclient/api/a;->g:Lcom/google/android/gms/internal/play_billing/zzs;

    .line 464
    .line 465
    iget-object v14, v2, Lcom/android/billingclient/api/a;->e:Landroid/content/Context;

    .line 466
    .line 467
    invoke-virtual {v14}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v14

    .line 471
    const/4 v15, 0x3

    .line 472
    invoke-interface {v13, v15, v14, v12, v8}, Lcom/google/android/gms/internal/play_billing/zzs;->zzi(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 473
    .line 474
    .line 475
    move-result-object v8
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 476
    :goto_6
    const-string v13, "getPurchase()"

    .line 477
    .line 478
    invoke-static {v8, v13}, Lcom/android/billingclient/api/j;->a(Landroid/os/Bundle;Ljava/lang/String;)LA/x;

    .line 479
    .line 480
    .line 481
    move-result-object v13

    .line 482
    iget-object v14, v13, LA/x;->c:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast v14, Lcom/android/billingclient/api/BillingResult;

    .line 485
    .line 486
    sget-object v15, Lcom/android/billingclient/api/i;->k:Lcom/android/billingclient/api/BillingResult;

    .line 487
    .line 488
    if-eq v14, v15, :cond_8

    .line 489
    .line 490
    iget v0, v13, LA/x;->b:I

    .line 491
    .line 492
    invoke-static {v0, v5, v14}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    invoke-virtual {v2, v0}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 497
    .line 498
    .line 499
    new-instance v0, Lcom/android/billingclient/api/zzcz;

    .line 500
    .line 501
    const/4 v3, 0x0

    .line 502
    invoke-direct {v0, v14, v3}, Lcom/android/billingclient/api/zzcz;-><init>(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    .line 503
    .line 504
    .line 505
    goto/16 :goto_a

    .line 506
    .line 507
    :cond_8
    invoke-virtual {v8, v10}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 508
    .line 509
    .line 510
    move-result-object v13

    .line 511
    invoke-virtual {v8, v9}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 512
    .line 513
    .line 514
    move-result-object v14

    .line 515
    move-object/from16 v15, v20

    .line 516
    .line 517
    invoke-virtual {v8, v15}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 518
    .line 519
    .line 520
    move-result-object v5

    .line 521
    move-object/from16 v19, v9

    .line 522
    .line 523
    move-object/from16 v20, v10

    .line 524
    .line 525
    const/4 v9, 0x0

    .line 526
    const/16 v18, 0x0

    .line 527
    .line 528
    :goto_7
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 529
    .line 530
    .line 531
    move-result v10

    .line 532
    if-ge v9, v10, :cond_a

    .line 533
    .line 534
    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v10

    .line 538
    check-cast v10, Ljava/lang/String;

    .line 539
    .line 540
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v21

    .line 544
    move-object/from16 v22, v5

    .line 545
    .line 546
    move-object/from16 v5, v21

    .line 547
    .line 548
    check-cast v5, Ljava/lang/String;

    .line 549
    .line 550
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v21

    .line 554
    check-cast v21, Ljava/lang/String;

    .line 555
    .line 556
    move/from16 v24, v9

    .line 557
    .line 558
    invoke-static/range {v21 .. v21}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v9

    .line 562
    move-object/from16 v27, v12

    .line 563
    .line 564
    const-string v12, "Sku is owned: "

    .line 565
    .line 566
    invoke-virtual {v12, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v9

    .line 570
    invoke-static {v11, v9}, Lcom/google/android/gms/internal/play_billing/zzb;->zzj(Ljava/lang/String;Ljava/lang/String;)V

    .line 571
    .line 572
    .line 573
    :try_start_3
    new-instance v9, Lcom/android/billingclient/api/Purchase;

    .line 574
    .line 575
    invoke-direct {v9, v10, v5}, Lcom/android/billingclient/api/Purchase;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_3

    .line 576
    .line 577
    .line 578
    invoke-virtual {v9}, Lcom/android/billingclient/api/Purchase;->getPurchaseToken()Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v5

    .line 582
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 583
    .line 584
    .line 585
    move-result v5

    .line 586
    if-eqz v5, :cond_9

    .line 587
    .line 588
    invoke-static {v11, v7}, Lcom/google/android/gms/internal/play_billing/zzb;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    const/16 v18, 0x1

    .line 592
    .line 593
    :cond_9
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    const/16 v16, 0x1

    .line 597
    .line 598
    add-int/lit8 v9, v24, 0x1

    .line 599
    .line 600
    move-object/from16 v5, v22

    .line 601
    .line 602
    move-object/from16 v12, v27

    .line 603
    .line 604
    goto :goto_7

    .line 605
    :catch_3
    move-exception v0

    .line 606
    invoke-static {v11, v6, v0}, Lcom/google/android/gms/internal/play_billing/zzb;->zzl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 607
    .line 608
    .line 609
    sget-object v0, Lcom/android/billingclient/api/i;->j:Lcom/android/billingclient/api/BillingResult;

    .line 610
    .line 611
    const/16 v5, 0x9

    .line 612
    .line 613
    const/16 v9, 0x33

    .line 614
    .line 615
    invoke-static {v9, v5, v0}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 616
    .line 617
    .line 618
    move-result-object v3

    .line 619
    invoke-virtual {v2, v3}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 620
    .line 621
    .line 622
    new-instance v2, Lcom/android/billingclient/api/zzcz;

    .line 623
    .line 624
    const/4 v3, 0x0

    .line 625
    invoke-direct {v2, v0, v3}, Lcom/android/billingclient/api/zzcz;-><init>(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    .line 626
    .line 627
    .line 628
    move-object v0, v2

    .line 629
    goto :goto_a

    .line 630
    :cond_a
    move-object/from16 v27, v12

    .line 631
    .line 632
    const/16 v5, 0x9

    .line 633
    .line 634
    const/16 v9, 0x33

    .line 635
    .line 636
    if-eqz v18, :cond_b

    .line 637
    .line 638
    sget-object v10, Lcom/android/billingclient/api/i;->j:Lcom/android/billingclient/api/BillingResult;

    .line 639
    .line 640
    const/16 v13, 0x1a

    .line 641
    .line 642
    invoke-static {v13, v5, v10}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 643
    .line 644
    .line 645
    move-result-object v5

    .line 646
    invoke-virtual {v2, v5}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 647
    .line 648
    .line 649
    goto :goto_8

    .line 650
    :cond_b
    const/16 v13, 0x1a

    .line 651
    .line 652
    :goto_8
    invoke-virtual {v8, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v28

    .line 656
    invoke-static/range {v28 .. v28}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v5

    .line 660
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v5

    .line 664
    invoke-static {v11, v5}, Lcom/google/android/gms/internal/play_billing/zzb;->zzj(Ljava/lang/String;Ljava/lang/String;)V

    .line 665
    .line 666
    .line 667
    invoke-static/range {v28 .. v28}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 668
    .line 669
    .line 670
    move-result v5

    .line 671
    if-eqz v5, :cond_c

    .line 672
    .line 673
    new-instance v0, Lcom/android/billingclient/api/zzcz;

    .line 674
    .line 675
    sget-object v2, Lcom/android/billingclient/api/i;->k:Lcom/android/billingclient/api/BillingResult;

    .line 676
    .line 677
    invoke-direct {v0, v2, v4}, Lcom/android/billingclient/api/zzcz;-><init>(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    .line 678
    .line 679
    .line 680
    goto :goto_a

    .line 681
    :cond_c
    move-object/from16 v9, v19

    .line 682
    .line 683
    move-object/from16 v10, v20

    .line 684
    .line 685
    const/4 v14, 0x1

    .line 686
    move-object/from16 v20, v15

    .line 687
    .line 688
    goto/16 :goto_4

    .line 689
    .line 690
    :goto_9
    sget-object v3, Lcom/android/billingclient/api/i;->l:Lcom/android/billingclient/api/BillingResult;

    .line 691
    .line 692
    const/16 v4, 0x34

    .line 693
    .line 694
    const/16 v5, 0x9

    .line 695
    .line 696
    invoke-static {v4, v5, v3}, Lcom/android/billingclient/api/zzcb;->zza(IILcom/android/billingclient/api/BillingResult;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 697
    .line 698
    .line 699
    move-result-object v4

    .line 700
    invoke-virtual {v2, v4}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 701
    .line 702
    .line 703
    const-string v2, "Got exception trying to get purchasesm try to reconnect"

    .line 704
    .line 705
    invoke-static {v11, v2, v0}, Lcom/google/android/gms/internal/play_billing/zzb;->zzl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 706
    .line 707
    .line 708
    new-instance v0, Lcom/android/billingclient/api/zzcz;

    .line 709
    .line 710
    const/4 v2, 0x0

    .line 711
    invoke-direct {v0, v3, v2}, Lcom/android/billingclient/api/zzcz;-><init>(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    .line 712
    .line 713
    .line 714
    :goto_a
    invoke-virtual {v0}, Lcom/android/billingclient/api/zzcz;->zzb()Ljava/util/List;

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    if-eqz v2, :cond_d

    .line 719
    .line 720
    iget-object v2, v1, LA7/z0;->c:Ljava/lang/Object;

    .line 721
    .line 722
    check-cast v2, Lcom/android/billingclient/api/PurchasesResponseListener;

    .line 723
    .line 724
    invoke-virtual {v0}, Lcom/android/billingclient/api/zzcz;->zza()Lcom/android/billingclient/api/BillingResult;

    .line 725
    .line 726
    .line 727
    move-result-object v3

    .line 728
    invoke-virtual {v0}, Lcom/android/billingclient/api/zzcz;->zzb()Ljava/util/List;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    invoke-interface {v2, v3, v0}, Lcom/android/billingclient/api/PurchasesResponseListener;->onQueryPurchasesResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    .line 733
    .line 734
    .line 735
    :goto_b
    const/16 v23, 0x0

    .line 736
    .line 737
    goto :goto_c

    .line 738
    :cond_d
    iget-object v2, v1, LA7/z0;->c:Ljava/lang/Object;

    .line 739
    .line 740
    check-cast v2, Lcom/android/billingclient/api/PurchasesResponseListener;

    .line 741
    .line 742
    invoke-virtual {v0}, Lcom/android/billingclient/api/zzcz;->zza()Lcom/android/billingclient/api/BillingResult;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzai;->zzk()Lcom/google/android/gms/internal/play_billing/zzai;

    .line 747
    .line 748
    .line 749
    move-result-object v3

    .line 750
    invoke-interface {v2, v0, v3}, Lcom/android/billingclient/api/PurchasesResponseListener;->onQueryPurchasesResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    .line 751
    .line 752
    .line 753
    goto :goto_b

    .line 754
    :goto_c
    return-object v23

    .line 755
    :pswitch_1
    sget-object v0, Lx6/b;->b:Lx6/b;

    .line 756
    .line 757
    iget-object v2, v1, LA7/z0;->b:Ljava/lang/Object;

    .line 758
    .line 759
    check-cast v2, LN6/x;

    .line 760
    .line 761
    iget-object v2, v2, LN6/x;->c:Landroid/content/Context;

    .line 762
    .line 763
    iget-object v3, v1, LA7/z0;->c:Ljava/lang/Object;

    .line 764
    .line 765
    check-cast v3, Lx6/g;

    .line 766
    .line 767
    iget-object v4, v1, LA7/z0;->d:Ljava/lang/Object;

    .line 768
    .line 769
    check-cast v4, LN6/y;

    .line 770
    .line 771
    invoke-static {v2, v0, v3, v4}, LQ6/a;->a(Landroid/content/Context;Lx6/b;Lx6/g;LQ6/b;)V

    .line 772
    .line 773
    .line 774
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 775
    .line 776
    return-object v0

    .line 777
    :pswitch_2
    iget-object v0, v1, LA7/z0;->b:Ljava/lang/Object;

    .line 778
    .line 779
    move-object v2, v0

    .line 780
    check-cast v2, LN6/j;

    .line 781
    .line 782
    iget-object v3, v2, LN6/j;->b:Landroid/content/Context;

    .line 783
    .line 784
    iget-object v0, v1, LA7/z0;->d:Ljava/lang/Object;

    .line 785
    .line 786
    check-cast v0, Lcom/google/android/gms/internal/ads/zzcex;

    .line 787
    .line 788
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzcex;->zza:Ljava/lang/String;

    .line 789
    .line 790
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzcex;->zzb:Ljava/lang/String;

    .line 791
    .line 792
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzcex;->zzc:LD6/x1;

    .line 793
    .line 794
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzcex;->zzd:LD6/v1;

    .line 795
    .line 796
    iget-object v0, v1, LA7/z0;->c:Ljava/lang/Object;

    .line 797
    .line 798
    move-object v8, v0

    .line 799
    check-cast v8, Landroid/os/Bundle;

    .line 800
    .line 801
    invoke-virtual/range {v2 .. v8}, LN6/j;->W(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;LD6/x1;LD6/v1;Landroid/os/Bundle;)LN6/G;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    return-object v0

    .line 806
    :pswitch_3
    iget-object v0, v1, LA7/z0;->c:Ljava/lang/Object;

    .line 807
    .line 808
    move-object v3, v0

    .line 809
    check-cast v3, Landroid/net/Uri;

    .line 810
    .line 811
    iget-object v0, v1, LA7/z0;->b:Ljava/lang/Object;

    .line 812
    .line 813
    check-cast v0, LN6/j;

    .line 814
    .line 815
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 816
    .line 817
    .line 818
    :try_start_4
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbix;->zznH:Lcom/google/android/gms/internal/ads/zzbio;

    .line 819
    .line 820
    sget-object v5, LD6/s;->e:LD6/s;

    .line 821
    .line 822
    iget-object v5, v5, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 823
    .line 824
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v4

    .line 828
    check-cast v4, Ljava/lang/Boolean;

    .line 829
    .line 830
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 831
    .line 832
    .line 833
    move-result v4
    :try_end_4
    .catch Lcom/google/android/gms/internal/ads/zzbax; {:try_start_4 .. :try_end_4} :catch_4

    .line 834
    iget-object v5, v1, LA7/z0;->d:Ljava/lang/Object;

    .line 835
    .line 836
    check-cast v5, Lq7/a;

    .line 837
    .line 838
    if-eqz v4, :cond_e

    .line 839
    .line 840
    :try_start_5
    iget-object v4, v0, LN6/j;->d:Lcom/google/android/gms/internal/ads/zzflk;

    .line 841
    .line 842
    if-eqz v4, :cond_e

    .line 843
    .line 844
    iget-object v0, v0, LN6/j;->b:Landroid/content/Context;

    .line 845
    .line 846
    invoke-static {v5}, Lq7/b;->S(Lq7/a;)Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v5

    .line 850
    check-cast v5, Landroid/view/View;

    .line 851
    .line 852
    const/4 v6, 0x0

    .line 853
    invoke-virtual {v4, v3, v0, v5, v6}, Lcom/google/android/gms/internal/ads/zzflk;->zza(Landroid/net/Uri;Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Landroid/net/Uri;

    .line 854
    .line 855
    .line 856
    move-result-object v3

    .line 857
    goto :goto_e

    .line 858
    :catch_4
    move-exception v0

    .line 859
    goto :goto_d

    .line 860
    :cond_e
    iget-object v4, v0, LN6/j;->c:Lcom/google/android/gms/internal/ads/zzbaw;

    .line 861
    .line 862
    iget-object v0, v0, LN6/j;->b:Landroid/content/Context;

    .line 863
    .line 864
    invoke-static {v5}, Lq7/b;->S(Lq7/a;)Ljava/lang/Object;

    .line 865
    .line 866
    .line 867
    move-result-object v5

    .line 868
    check-cast v5, Landroid/view/View;

    .line 869
    .line 870
    const/4 v6, 0x0

    .line 871
    invoke-virtual {v4, v3, v0, v5, v6}, Lcom/google/android/gms/internal/ads/zzbaw;->zzd(Landroid/net/Uri;Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Landroid/net/Uri;

    .line 872
    .line 873
    .line 874
    move-result-object v3
    :try_end_5
    .catch Lcom/google/android/gms/internal/ads/zzbax; {:try_start_5 .. :try_end_5} :catch_4

    .line 875
    goto :goto_e

    .line 876
    :goto_d
    sget v4, LG6/L;->b:I

    .line 877
    .line 878
    invoke-static {v12, v0}, LH6/l;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 879
    .line 880
    .line 881
    :goto_e
    invoke-virtual {v3, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 882
    .line 883
    .line 884
    move-result-object v0

    .line 885
    if-eqz v0, :cond_f

    .line 886
    .line 887
    return-object v3

    .line 888
    :cond_f
    new-instance v0, Ljava/lang/Exception;

    .line 889
    .line 890
    const-string v2, "Failed to append spam signals to click url."

    .line 891
    .line 892
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 893
    .line 894
    .line 895
    throw v0

    .line 896
    :pswitch_4
    iget-object v0, v1, LA7/z0;->b:Ljava/lang/Object;

    .line 897
    .line 898
    check-cast v0, LN6/j;

    .line 899
    .line 900
    iget-object v3, v0, LN6/j;->c:Lcom/google/android/gms/internal/ads/zzbaw;

    .line 901
    .line 902
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzbaw;->zzb()Lcom/google/android/gms/internal/ads/zzbar;

    .line 903
    .line 904
    .line 905
    move-result-object v4

    .line 906
    if-eqz v4, :cond_10

    .line 907
    .line 908
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzbaw;->zzb()Lcom/google/android/gms/internal/ads/zzbar;

    .line 909
    .line 910
    .line 911
    move-result-object v3

    .line 912
    iget-object v4, v0, LN6/j;->b:Landroid/content/Context;

    .line 913
    .line 914
    iget-object v5, v1, LA7/z0;->d:Ljava/lang/Object;

    .line 915
    .line 916
    check-cast v5, Lq7/a;

    .line 917
    .line 918
    invoke-static {v5}, Lq7/b;->S(Lq7/a;)Ljava/lang/Object;

    .line 919
    .line 920
    .line 921
    move-result-object v5

    .line 922
    check-cast v5, Landroid/view/View;

    .line 923
    .line 924
    const/4 v6, 0x0

    .line 925
    invoke-interface {v3, v4, v5, v6}, Lcom/google/android/gms/internal/ads/zzbar;->zzj(Landroid/content/Context;Landroid/view/View;Landroid/app/Activity;)Ljava/lang/String;

    .line 926
    .line 927
    .line 928
    move-result-object v12

    .line 929
    :cond_10
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 930
    .line 931
    .line 932
    move-result v3

    .line 933
    if-nez v3, :cond_14

    .line 934
    .line 935
    new-instance v3, Ljava/util/ArrayList;

    .line 936
    .line 937
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 938
    .line 939
    .line 940
    iget-object v4, v1, LA7/z0;->c:Ljava/lang/Object;

    .line 941
    .line 942
    check-cast v4, Ljava/util/List;

    .line 943
    .line 944
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 945
    .line 946
    .line 947
    move-result-object v4

    .line 948
    :goto_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 949
    .line 950
    .line 951
    move-result v5

    .line 952
    if-eqz v5, :cond_12

    .line 953
    .line 954
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    move-result-object v5

    .line 958
    check-cast v5, Landroid/net/Uri;

    .line 959
    .line 960
    iget-object v6, v0, LN6/j;->y:Ljava/util/ArrayList;

    .line 961
    .line 962
    iget-object v7, v0, LN6/j;->z:Ljava/util/ArrayList;

    .line 963
    .line 964
    invoke-static {v5, v6, v7}, LN6/j;->V(Landroid/net/Uri;Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 965
    .line 966
    .line 967
    move-result v6

    .line 968
    if-nez v6, :cond_11

    .line 969
    .line 970
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 971
    .line 972
    .line 973
    move-result-object v6

    .line 974
    sget v7, LG6/L;->b:I

    .line 975
    .line 976
    const-string v7, "Not a Google URL: "

    .line 977
    .line 978
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    move-result-object v6

    .line 982
    invoke-static {v6}, LH6/l;->f(Ljava/lang/String;)V

    .line 983
    .line 984
    .line 985
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 986
    .line 987
    .line 988
    goto :goto_f

    .line 989
    :cond_11
    invoke-static {v5, v2, v12}, LN6/j;->Y(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 990
    .line 991
    .line 992
    move-result-object v5

    .line 993
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 994
    .line 995
    .line 996
    goto :goto_f

    .line 997
    :cond_12
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 998
    .line 999
    .line 1000
    move-result v0

    .line 1001
    if-nez v0, :cond_13

    .line 1002
    .line 1003
    return-object v3

    .line 1004
    :cond_13
    new-instance v0, Ljava/lang/Exception;

    .line 1005
    .line 1006
    const-string v2, "Empty impression URLs result."

    .line 1007
    .line 1008
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1009
    .line 1010
    .line 1011
    throw v0

    .line 1012
    :cond_14
    new-instance v0, Ljava/lang/Exception;

    .line 1013
    .line 1014
    const-string v2, "Failed to get view signals."

    .line 1015
    .line 1016
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1017
    .line 1018
    .line 1019
    throw v0

    .line 1020
    :pswitch_5
    const/4 v6, 0x0

    .line 1021
    iget-object v0, v1, LA7/z0;->d:Ljava/lang/Object;

    .line 1022
    .line 1023
    check-cast v0, LA7/s0;

    .line 1024
    .line 1025
    iget-object v2, v0, LA7/s0;->a:LA7/L1;

    .line 1026
    .line 1027
    invoke-virtual {v2}, LA7/L1;->Z()V

    .line 1028
    .line 1029
    .line 1030
    iget-object v2, v0, LA7/s0;->a:LA7/L1;

    .line 1031
    .line 1032
    invoke-virtual {v2}, LA7/L1;->zzl()LA7/k0;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v0

    .line 1036
    invoke-virtual {v0}, LA7/k0;->c0()V

    .line 1037
    .line 1038
    .line 1039
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpn;->zza()Z

    .line 1040
    .line 1041
    .line 1042
    move-result v0

    .line 1043
    if-eqz v0, :cond_1d

    .line 1044
    .line 1045
    invoke-virtual {v2}, LA7/L1;->O()LA7/e;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v0

    .line 1049
    iget-object v3, v1, LA7/z0;->b:Ljava/lang/Object;

    .line 1050
    .line 1051
    check-cast v3, LA7/N1;

    .line 1052
    .line 1053
    iget-object v4, v3, LA7/N1;->a:Ljava/lang/String;

    .line 1054
    .line 1055
    sget-object v5, LA7/y;->H0:LA7/D;

    .line 1056
    .line 1057
    invoke-virtual {v0, v4, v5}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 1058
    .line 1059
    .line 1060
    move-result v0

    .line 1061
    if-eqz v0, :cond_1d

    .line 1062
    .line 1063
    iget-object v3, v3, LA7/N1;->a:Ljava/lang/String;

    .line 1064
    .line 1065
    if-nez v3, :cond_15

    .line 1066
    .line 1067
    goto/16 :goto_16

    .line 1068
    .line 1069
    :cond_15
    iget-object v0, v1, LA7/z0;->c:Ljava/lang/Object;

    .line 1070
    .line 1071
    check-cast v0, Landroid/os/Bundle;

    .line 1072
    .line 1073
    if-eqz v0, :cond_18

    .line 1074
    .line 1075
    const-string v4, "uriSources"

    .line 1076
    .line 1077
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 1078
    .line 1079
    .line 1080
    move-result-object v4

    .line 1081
    const-string v5, "uriTimestamps"

    .line 1082
    .line 1083
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getLongArray(Ljava/lang/String;)[J

    .line 1084
    .line 1085
    .line 1086
    move-result-object v5

    .line 1087
    if-eqz v4, :cond_18

    .line 1088
    .line 1089
    if-eqz v5, :cond_17

    .line 1090
    .line 1091
    array-length v0, v5

    .line 1092
    array-length v7, v4

    .line 1093
    if-eq v0, v7, :cond_16

    .line 1094
    .line 1095
    goto :goto_13

    .line 1096
    :cond_16
    const/4 v7, 0x0

    .line 1097
    :goto_10
    array-length v0, v4

    .line 1098
    if-ge v7, v0, :cond_18

    .line 1099
    .line 1100
    iget-object v8, v2, LA7/L1;->c:LA7/i;

    .line 1101
    .line 1102
    invoke-static {v8}, LA7/L1;->m(LA7/G1;)V

    .line 1103
    .line 1104
    .line 1105
    aget v0, v4, v7

    .line 1106
    .line 1107
    aget-wide v9, v5, v7

    .line 1108
    .line 1109
    invoke-static {v3}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual {v8}, LA7/B0;->c0()V

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual {v8}, LA7/G1;->h0()V

    .line 1116
    .line 1117
    .line 1118
    :try_start_6
    invoke-virtual {v8}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v11

    .line 1122
    const-string v13, "trigger_uris"

    .line 1123
    .line 1124
    const-string v14, "app_id=? and source=? and timestamp_millis<=?"

    .line 1125
    .line 1126
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v15

    .line 1130
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v6

    .line 1134
    filled-new-array {v3, v15, v6}, [Ljava/lang/String;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v6

    .line 1138
    invoke-virtual {v11, v13, v14, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 1139
    .line 1140
    .line 1141
    move-result v6

    .line 1142
    invoke-virtual {v8}, LA7/B0;->zzj()LA7/N;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v11

    .line 1146
    iget-object v11, v11, LA7/N;->n:LA7/P;

    .line 1147
    .line 1148
    new-instance v13, Ljava/lang/StringBuilder;

    .line 1149
    .line 1150
    const-string v14, "Pruned "

    .line 1151
    .line 1152
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1156
    .line 1157
    .line 1158
    const-string v6, " trigger URIs. appId, source, timestamp"

    .line 1159
    .line 1160
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v6

    .line 1167
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v0

    .line 1171
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v9

    .line 1175
    invoke-virtual {v11, v3, v0, v9, v6}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_5

    .line 1176
    .line 1177
    .line 1178
    :goto_11
    const/16 v16, 0x1

    .line 1179
    .line 1180
    goto :goto_12

    .line 1181
    :catch_5
    move-exception v0

    .line 1182
    invoke-virtual {v8}, LA7/B0;->zzj()LA7/N;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v6

    .line 1186
    invoke-static {v3}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v8

    .line 1190
    iget-object v6, v6, LA7/N;->f:LA7/P;

    .line 1191
    .line 1192
    const-string v9, "Error pruning trigger URIs. appId"

    .line 1193
    .line 1194
    invoke-virtual {v6, v8, v9, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1195
    .line 1196
    .line 1197
    goto :goto_11

    .line 1198
    :goto_12
    add-int/lit8 v7, v7, 0x1

    .line 1199
    .line 1200
    const/4 v6, 0x0

    .line 1201
    goto :goto_10

    .line 1202
    :cond_17
    :goto_13
    invoke-virtual {v2}, LA7/L1;->zzj()LA7/N;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v0

    .line 1206
    const-string v4, "Uri sources and timestamps do not match"

    .line 1207
    .line 1208
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 1209
    .line 1210
    invoke-virtual {v0, v4}, LA7/P;->c(Ljava/lang/String;)V

    .line 1211
    .line 1212
    .line 1213
    :cond_18
    iget-object v2, v2, LA7/L1;->c:LA7/i;

    .line 1214
    .line 1215
    invoke-static {v2}, LA7/L1;->m(LA7/G1;)V

    .line 1216
    .line 1217
    .line 1218
    invoke-static {v3}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v2}, LA7/B0;->c0()V

    .line 1222
    .line 1223
    .line 1224
    invoke-virtual {v2}, LA7/G1;->h0()V

    .line 1225
    .line 1226
    .line 1227
    new-instance v0, Ljava/util/ArrayList;

    .line 1228
    .line 1229
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1230
    .line 1231
    .line 1232
    :try_start_7
    invoke-virtual {v2}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v24

    .line 1236
    const-string v25, "trigger_uris"

    .line 1237
    .line 1238
    const-string v4, "trigger_uri"

    .line 1239
    .line 1240
    const-string v5, "timestamp_millis"

    .line 1241
    .line 1242
    const-string v6, "source"

    .line 1243
    .line 1244
    filled-new-array {v4, v5, v6}, [Ljava/lang/String;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v26

    .line 1248
    const-string v27, "app_id=?"

    .line 1249
    .line 1250
    filled-new-array {v3}, [Ljava/lang/String;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v28

    .line 1254
    const-string v31, "rowid"

    .line 1255
    .line 1256
    const/16 v30, 0x0

    .line 1257
    .line 1258
    const/16 v32, 0x0

    .line 1259
    .line 1260
    const/16 v29, 0x0

    .line 1261
    .line 1262
    invoke-virtual/range {v24 .. v32}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v15
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 1266
    :try_start_8
    invoke-interface {v15}, Landroid/database/Cursor;->moveToFirst()Z

    .line 1267
    .line 1268
    .line 1269
    move-result v4
    :try_end_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_6
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 1270
    if-nez v4, :cond_19

    .line 1271
    .line 1272
    invoke-interface {v15}, Landroid/database/Cursor;->close()V

    .line 1273
    .line 1274
    .line 1275
    goto :goto_17

    .line 1276
    :cond_19
    const/4 v4, 0x0

    .line 1277
    :cond_1a
    :try_start_9
    invoke-interface {v15, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v5

    .line 1281
    if-nez v5, :cond_1b

    .line 1282
    .line 1283
    move-object v5, v12

    .line 1284
    :cond_1b
    const/4 v14, 0x1

    .line 1285
    invoke-interface {v15, v14}, Landroid/database/Cursor;->getLong(I)J

    .line 1286
    .line 1287
    .line 1288
    move-result-wide v6

    .line 1289
    const/4 v8, 0x2

    .line 1290
    invoke-interface {v15, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 1291
    .line 1292
    .line 1293
    move-result v8

    .line 1294
    new-instance v9, LA7/E1;

    .line 1295
    .line 1296
    invoke-direct {v9, v5, v6, v7, v8}, LA7/E1;-><init>(Ljava/lang/String;JI)V

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1300
    .line 1301
    .line 1302
    invoke-interface {v15}, Landroid/database/Cursor;->moveToNext()Z

    .line 1303
    .line 1304
    .line 1305
    move-result v5
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 1306
    if-nez v5, :cond_1a

    .line 1307
    .line 1308
    invoke-interface {v15}, Landroid/database/Cursor;->close()V

    .line 1309
    .line 1310
    .line 1311
    goto :goto_17

    .line 1312
    :catchall_0
    move-exception v0

    .line 1313
    goto :goto_15

    .line 1314
    :catch_6
    move-exception v0

    .line 1315
    goto :goto_14

    .line 1316
    :catchall_1
    move-exception v0

    .line 1317
    const/4 v15, 0x0

    .line 1318
    goto :goto_15

    .line 1319
    :catch_7
    move-exception v0

    .line 1320
    const/4 v15, 0x0

    .line 1321
    :goto_14
    :try_start_a
    invoke-virtual {v2}, LA7/B0;->zzj()LA7/N;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v2

    .line 1325
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 1326
    .line 1327
    const-string v4, "Error querying trigger uris. appId"

    .line 1328
    .line 1329
    invoke-static {v3}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v3

    .line 1333
    invoke-virtual {v2, v3, v4, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1334
    .line 1335
    .line 1336
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 1337
    .line 1338
    if-eqz v15, :cond_1e

    .line 1339
    .line 1340
    invoke-interface {v15}, Landroid/database/Cursor;->close()V

    .line 1341
    .line 1342
    .line 1343
    goto :goto_17

    .line 1344
    :goto_15
    if-eqz v15, :cond_1c

    .line 1345
    .line 1346
    invoke-interface {v15}, Landroid/database/Cursor;->close()V

    .line 1347
    .line 1348
    .line 1349
    :cond_1c
    throw v0

    .line 1350
    :cond_1d
    :goto_16
    new-instance v0, Ljava/util/ArrayList;

    .line 1351
    .line 1352
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1353
    .line 1354
    .line 1355
    :cond_1e
    :goto_17
    return-object v0

    .line 1356
    nop

    .line 1357
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
