.class public final LA7/X0;
.super LA7/n;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:LA7/P0;


# direct methods
.method public synthetic constructor <init>(LA7/P0;LA7/C0;I)V
    .locals 0

    .line 1
    iput p3, p0, LA7/X0;->e:I

    iput-object p1, p0, LA7/X0;->f:LA7/P0;

    invoke-direct {p0, p2}, LA7/n;-><init>(LA7/C0;)V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, LA7/X0;->e:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v2, v1, LA7/X0;->f:LA7/P0;

    .line 9
    .line 10
    iget-object v0, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v3, v0

    .line 13
    check-cast v3, LA7/n0;

    .line 14
    .line 15
    const-string v4, "v106000."

    .line 16
    .line 17
    iget-object v0, v3, LA7/n0;->j:LA7/k0;

    .line 18
    .line 19
    invoke-static {v0}, LA7/n0;->d(LA7/D0;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, LA7/k0;->c0()V

    .line 23
    .line 24
    .line 25
    iget-object v5, v3, LA7/n0;->r:LA7/f1;

    .line 26
    .line 27
    invoke-static {v5}, LA7/n0;->d(LA7/D0;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v5}, LA7/n0;->d(LA7/D0;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, LA7/n0;->j()LA7/I;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, LA7/I;->k0()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    const-string v0, "google_analytics_adid_collection_enabled"

    .line 42
    .line 43
    iget-object v7, v3, LA7/n0;->g:LA7/e;

    .line 44
    .line 45
    invoke-virtual {v7, v0}, LA7/e;->m0(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const/4 v7, 0x0

    .line 50
    const/4 v8, 0x1

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move v0, v7

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    :goto_0
    move v0, v8

    .line 63
    :goto_1
    iget-object v9, v3, LA7/n0;->i:LA7/N;

    .line 64
    .line 65
    if-nez v0, :cond_2

    .line 66
    .line 67
    invoke-static {v9}, LA7/n0;->d(LA7/D0;)V

    .line 68
    .line 69
    .line 70
    const-string v0, "ADID collection is disabled from Manifest. Skipping"

    .line 71
    .line 72
    iget-object v3, v9, LA7/N;->n:LA7/P;

    .line 73
    .line 74
    invoke-virtual {v3, v0}, LA7/P;->c(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_13

    .line 78
    .line 79
    :cond_2
    iget-object v10, v3, LA7/n0;->h:LA7/Z;

    .line 80
    .line 81
    invoke-static {v10}, LA7/n0;->c(LA7/B0;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v10}, LA7/B0;->c0()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v10}, LA7/Z;->n0()LA7/F0;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sget-object v11, LA7/E0;->b:LA7/E0;

    .line 92
    .line 93
    invoke-virtual {v0, v11}, LA7/F0;->i(LA7/E0;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    const-string v11, ""

    .line 98
    .line 99
    if-nez v0, :cond_3

    .line 100
    .line 101
    new-instance v0, Landroid/util/Pair;

    .line 102
    .line 103
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-direct {v0, v11, v12}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :goto_2
    move-object v11, v0

    .line 109
    goto :goto_6

    .line 110
    :cond_3
    iget-object v0, v10, LA7/B0;->a:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, LA7/n0;

    .line 113
    .line 114
    iget-object v12, v0, LA7/n0;->n:Ln7/b;

    .line 115
    .line 116
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 120
    .line 121
    .line 122
    move-result-wide v12

    .line 123
    iget-object v14, v10, LA7/Z;->i:Ljava/lang/String;

    .line 124
    .line 125
    if-eqz v14, :cond_4

    .line 126
    .line 127
    iget-wide v14, v10, LA7/Z;->k:J

    .line 128
    .line 129
    cmp-long v14, v12, v14

    .line 130
    .line 131
    if-gez v14, :cond_4

    .line 132
    .line 133
    new-instance v0, Landroid/util/Pair;

    .line 134
    .line 135
    iget-object v11, v10, LA7/Z;->i:Ljava/lang/String;

    .line 136
    .line 137
    iget-boolean v12, v10, LA7/Z;->j:Z

    .line 138
    .line 139
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 140
    .line 141
    .line 142
    move-result-object v12

    .line 143
    invoke-direct {v0, v11, v12}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_4
    iget-object v14, v0, LA7/n0;->g:LA7/e;

    .line 148
    .line 149
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    sget-object v15, LA7/y;->b:LA7/D;

    .line 153
    .line 154
    invoke-virtual {v14, v6, v15}, LA7/e;->j0(Ljava/lang/String;LA7/D;)J

    .line 155
    .line 156
    .line 157
    move-result-wide v14

    .line 158
    add-long/2addr v14, v12

    .line 159
    iput-wide v14, v10, LA7/Z;->k:J

    .line 160
    .line 161
    invoke-static {v8}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->setShouldSkipGmsCoreVersionCheck(Z)V

    .line 162
    .line 163
    .line 164
    :try_start_0
    iget-object v0, v0, LA7/n0;->a:Landroid/content/Context;

    .line 165
    .line 166
    invoke-static {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    iput-object v11, v10, LA7/Z;->i:Ljava/lang/String;

    .line 171
    .line 172
    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v12

    .line 176
    if-eqz v12, :cond_5

    .line 177
    .line 178
    iput-object v12, v10, LA7/Z;->i:Ljava/lang/String;

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :catch_0
    move-exception v0

    .line 182
    goto :goto_4

    .line 183
    :cond_5
    :goto_3
    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    iput-boolean v0, v10, LA7/Z;->j:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :goto_4
    invoke-virtual {v10}, LA7/B0;->zzj()LA7/N;

    .line 191
    .line 192
    .line 193
    move-result-object v12

    .line 194
    const-string v13, "Unable to get advertising id"

    .line 195
    .line 196
    iget-object v12, v12, LA7/N;->m:LA7/P;

    .line 197
    .line 198
    invoke-virtual {v12, v13, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    iput-object v11, v10, LA7/Z;->i:Ljava/lang/String;

    .line 202
    .line 203
    :goto_5
    invoke-static {v7}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->setShouldSkipGmsCoreVersionCheck(Z)V

    .line 204
    .line 205
    .line 206
    new-instance v0, Landroid/util/Pair;

    .line 207
    .line 208
    iget-object v11, v10, LA7/Z;->i:Ljava/lang/String;

    .line 209
    .line 210
    iget-boolean v12, v10, LA7/Z;->j:Z

    .line 211
    .line 212
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 213
    .line 214
    .line 215
    move-result-object v12

    .line 216
    invoke-direct {v0, v11, v12}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    goto :goto_2

    .line 220
    :goto_6
    iget-object v0, v11, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v0, Ljava/lang/Boolean;

    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-nez v0, :cond_16

    .line 229
    .line 230
    iget-object v0, v11, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v0, Ljava/lang/CharSequence;

    .line 233
    .line 234
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-eqz v0, :cond_6

    .line 239
    .line 240
    goto/16 :goto_12

    .line 241
    .line 242
    :cond_6
    invoke-static {v5}, LA7/n0;->d(LA7/D0;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5}, LA7/D0;->e0()V

    .line 246
    .line 247
    .line 248
    iget-object v0, v5, LA7/B0;->a:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v0, LA7/n0;

    .line 251
    .line 252
    iget-object v0, v0, LA7/n0;->a:Landroid/content/Context;

    .line 253
    .line 254
    const-string v12, "connectivity"

    .line 255
    .line 256
    invoke-virtual {v0, v12}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 261
    .line 262
    const/4 v12, 0x0

    .line 263
    if-eqz v0, :cond_7

    .line 264
    .line 265
    :try_start_1
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 266
    .line 267
    .line 268
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    .line 269
    goto :goto_7

    .line 270
    :catch_1
    :cond_7
    move-object v0, v12

    .line 271
    :goto_7
    if-eqz v0, :cond_15

    .line 272
    .line 273
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_15

    .line 278
    .line 279
    new-instance v13, Ljava/lang/StringBuilder;

    .line 280
    .line 281
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 282
    .line 283
    .line 284
    invoke-static {v3}, LA7/p0;->h(LA7/n0;)LA7/m1;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual {v0}, LA7/m1;->t0()Z

    .line 289
    .line 290
    .line 291
    move-result v14

    .line 292
    if-nez v14, :cond_8

    .line 293
    .line 294
    goto :goto_8

    .line 295
    :cond_8
    invoke-virtual {v0}, LA7/B0;->b0()LA7/U1;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-virtual {v0}, LA7/U1;->i1()I

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    const v14, 0x392d8

    .line 304
    .line 305
    .line 306
    if-lt v0, v14, :cond_11

    .line 307
    .line 308
    :goto_8
    iget-object v0, v3, LA7/n0;->p:LA7/P0;

    .line 309
    .line 310
    invoke-static {v0}, LA7/n0;->b(LA7/Y;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0}, LA7/B;->c0()V

    .line 314
    .line 315
    .line 316
    iget-object v0, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v0, LA7/n0;

    .line 319
    .line 320
    invoke-static {v0}, LA7/p0;->h(LA7/n0;)LA7/m1;

    .line 321
    .line 322
    .line 323
    move-result-object v14

    .line 324
    iget-object v0, v14, LA7/m1;->d:LA7/F;

    .line 325
    .line 326
    if-nez v0, :cond_9

    .line 327
    .line 328
    invoke-virtual {v14}, LA7/m1;->p0()V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v14}, LA7/B0;->zzj()LA7/N;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    const-string v14, "Failed to get consents; not connected to service yet."

    .line 336
    .line 337
    iget-object v0, v0, LA7/N;->m:LA7/P;

    .line 338
    .line 339
    invoke-virtual {v0, v14}, LA7/P;->c(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    :goto_9
    move-object v0, v12

    .line 343
    goto :goto_a

    .line 344
    :cond_9
    invoke-virtual {v14, v7}, LA7/m1;->w0(Z)LA7/N1;

    .line 345
    .line 346
    .line 347
    move-result-object v15

    .line 348
    :try_start_2
    invoke-interface {v0, v15}, LA7/F;->r(LA7/N1;)LA7/g;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    invoke-virtual {v14}, LA7/m1;->v0()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    .line 353
    .line 354
    .line 355
    goto :goto_a

    .line 356
    :catch_2
    move-exception v0

    .line 357
    invoke-virtual {v14}, LA7/B0;->zzj()LA7/N;

    .line 358
    .line 359
    .line 360
    move-result-object v14

    .line 361
    const-string v15, "Failed to get consents; remote exception"

    .line 362
    .line 363
    iget-object v14, v14, LA7/N;->f:LA7/P;

    .line 364
    .line 365
    invoke-virtual {v14, v15, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    goto :goto_9

    .line 369
    :goto_a
    if-eqz v0, :cond_a

    .line 370
    .line 371
    iget-object v0, v0, LA7/g;->a:Landroid/os/Bundle;

    .line 372
    .line 373
    goto :goto_b

    .line 374
    :cond_a
    move-object v0, v12

    .line 375
    :goto_b
    if-nez v0, :cond_d

    .line 376
    .line 377
    iget v0, v3, LA7/n0;->F:I

    .line 378
    .line 379
    add-int/lit8 v4, v0, 0x1

    .line 380
    .line 381
    iput v4, v3, LA7/n0;->F:I

    .line 382
    .line 383
    const/16 v4, 0xa

    .line 384
    .line 385
    if-ge v0, v4, :cond_b

    .line 386
    .line 387
    move v7, v8

    .line 388
    :cond_b
    invoke-static {v9}, LA7/n0;->d(LA7/D0;)V

    .line 389
    .line 390
    .line 391
    if-eqz v7, :cond_c

    .line 392
    .line 393
    const-string v0, "Retrying."

    .line 394
    .line 395
    goto :goto_c

    .line 396
    :cond_c
    const-string v0, "Skipping."

    .line 397
    .line 398
    :goto_c
    const-string v4, "Failed to retrieve DMA consent from the service, "

    .line 399
    .line 400
    const-string v5, " retryCount"

    .line 401
    .line 402
    invoke-static {v4, v0, v5}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    iget v3, v3, LA7/n0;->F:I

    .line 407
    .line 408
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 409
    .line 410
    .line 411
    move-result-object v3

    .line 412
    iget-object v4, v9, LA7/N;->m:LA7/P;

    .line 413
    .line 414
    invoke-virtual {v4, v0, v3}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    goto/16 :goto_13

    .line 418
    .line 419
    :cond_d
    const/16 v14, 0x64

    .line 420
    .line 421
    invoke-static {v14, v0}, LA7/F0;->b(ILandroid/os/Bundle;)LA7/F0;

    .line 422
    .line 423
    .line 424
    move-result-object v15

    .line 425
    const-string v8, "&gcs="

    .line 426
    .line 427
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v15}, LA7/F0;->l()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v8

    .line 434
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    invoke-static {v14, v0}, LA7/o;->a(ILandroid/os/Bundle;)LA7/o;

    .line 438
    .line 439
    .line 440
    move-result-object v8

    .line 441
    const-string v14, "&dma="

    .line 442
    .line 443
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 447
    .line 448
    iget-object v15, v8, LA7/o;->c:Ljava/lang/Boolean;

    .line 449
    .line 450
    if-ne v15, v14, :cond_e

    .line 451
    .line 452
    move v14, v7

    .line 453
    goto :goto_d

    .line 454
    :cond_e
    const/4 v14, 0x1

    .line 455
    :goto_d
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    iget-object v8, v8, LA7/o;->d:Ljava/lang/String;

    .line 459
    .line 460
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 461
    .line 462
    .line 463
    move-result v14

    .line 464
    if-nez v14, :cond_f

    .line 465
    .line 466
    const-string v14, "&dma_cps="

    .line 467
    .line 468
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    :cond_f
    invoke-static {v0}, LA7/o;->c(Landroid/os/Bundle;)Ljava/lang/Boolean;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 479
    .line 480
    if-ne v0, v8, :cond_10

    .line 481
    .line 482
    move v8, v7

    .line 483
    goto :goto_e

    .line 484
    :cond_10
    const/4 v8, 0x1

    .line 485
    :goto_e
    const-string v0, "&npa="

    .line 486
    .line 487
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    invoke-static {v9}, LA7/n0;->d(LA7/D0;)V

    .line 494
    .line 495
    .line 496
    const-string v0, "Consent query parameters to Bow"

    .line 497
    .line 498
    iget-object v8, v9, LA7/N;->n:LA7/P;

    .line 499
    .line 500
    invoke-virtual {v8, v0, v13}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 501
    .line 502
    .line 503
    :cond_11
    iget-object v8, v3, LA7/n0;->l:LA7/U1;

    .line 504
    .line 505
    invoke-static {v8}, LA7/n0;->c(LA7/B0;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v3}, LA7/n0;->j()LA7/I;

    .line 509
    .line 510
    .line 511
    iget-object v0, v11, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 512
    .line 513
    check-cast v0, Ljava/lang/String;

    .line 514
    .line 515
    iget-object v9, v10, LA7/Z;->v:LA7/a0;

    .line 516
    .line 517
    invoke-virtual {v9}, LA7/a0;->d()J

    .line 518
    .line 519
    .line 520
    move-result-wide v9

    .line 521
    const-wide/16 v14, 0x1

    .line 522
    .line 523
    sub-long/2addr v9, v14

    .line 524
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v11

    .line 528
    const-string v13, "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version="

    .line 529
    .line 530
    :try_start_3
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    invoke-static {v6}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v8}, LA7/U1;->i1()I

    .line 537
    .line 538
    .line 539
    move-result v14

    .line 540
    new-instance v15, Ljava/lang/StringBuilder;

    .line 541
    .line 542
    invoke-direct {v15, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v4

    .line 552
    new-instance v14, Ljava/lang/StringBuilder;

    .line 553
    .line 554
    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    .line 560
    const-string v4, "&rdid="

    .line 561
    .line 562
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    const-string v0, "&bundleid="

    .line 569
    .line 570
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    const-string v0, "&retry="

    .line 577
    .line 578
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v14, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    iget-object v4, v8, LA7/B0;->a:Ljava/lang/Object;

    .line 589
    .line 590
    check-cast v4, LA7/n0;

    .line 591
    .line 592
    iget-object v4, v4, LA7/n0;->g:LA7/e;

    .line 593
    .line 594
    const-string v9, "debug.deferred.deeplink"

    .line 595
    .line 596
    invoke-virtual {v4, v9}, LA7/e;->f0(Ljava/lang/String;)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v4

    .line 600
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    move-result v4

    .line 604
    if-eqz v4, :cond_12

    .line 605
    .line 606
    const-string v4, "&ddl_test=1"

    .line 607
    .line 608
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    goto :goto_f

    .line 613
    :catch_3
    move-exception v0

    .line 614
    goto :goto_10

    .line 615
    :catch_4
    move-exception v0

    .line 616
    goto :goto_10

    .line 617
    :cond_12
    :goto_f
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    .line 618
    .line 619
    .line 620
    move-result v4

    .line 621
    if-nez v4, :cond_14

    .line 622
    .line 623
    invoke-virtual {v11, v7}, Ljava/lang/String;->charAt(I)C

    .line 624
    .line 625
    .line 626
    move-result v4

    .line 627
    const/16 v9, 0x26

    .line 628
    .line 629
    if-eq v4, v9, :cond_13

    .line 630
    .line 631
    const-string v4, "&"

    .line 632
    .line 633
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    :cond_13
    invoke-virtual {v0, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    :cond_14
    new-instance v4, Ljava/net/URL;

    .line 642
    .line 643
    invoke-direct {v4, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/net/MalformedURLException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    .line 644
    .line 645
    .line 646
    move-object v12, v4

    .line 647
    goto :goto_11

    .line 648
    :goto_10
    invoke-virtual {v8}, LA7/B0;->zzj()LA7/N;

    .line 649
    .line 650
    .line 651
    move-result-object v4

    .line 652
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    iget-object v4, v4, LA7/N;->f:LA7/P;

    .line 657
    .line 658
    const-string v8, "Failed to create BOW URL for Deferred Deep Link. exception"

    .line 659
    .line 660
    invoke-virtual {v4, v8, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 661
    .line 662
    .line 663
    :goto_11
    if-eqz v12, :cond_17

    .line 664
    .line 665
    invoke-static {v5}, LA7/n0;->d(LA7/D0;)V

    .line 666
    .line 667
    .line 668
    new-instance v0, LA/e0;

    .line 669
    .line 670
    const/4 v4, 0x2

    .line 671
    const/4 v8, 0x0

    .line 672
    invoke-direct {v0, v4, v8}, LA/e0;-><init>(IZ)V

    .line 673
    .line 674
    .line 675
    iput-object v3, v0, LA/e0;->b:Ljava/lang/Object;

    .line 676
    .line 677
    invoke-virtual {v5}, LA7/B0;->c0()V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v5}, LA7/D0;->e0()V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v5}, LA7/B0;->zzl()LA7/k0;

    .line 684
    .line 685
    .line 686
    move-result-object v3

    .line 687
    new-instance v4, LA7/w0;

    .line 688
    .line 689
    invoke-direct {v4, v5, v6, v12, v0}, LA7/w0;-><init>(LA7/f1;Ljava/lang/String;Ljava/net/URL;LA/e0;)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v3, v4}, LA7/k0;->k0(Ljava/lang/Runnable;)V

    .line 693
    .line 694
    .line 695
    goto :goto_13

    .line 696
    :cond_15
    invoke-static {v9}, LA7/n0;->d(LA7/D0;)V

    .line 697
    .line 698
    .line 699
    const-string v0, "Network is not available for Deferred Deep Link request. Skipping"

    .line 700
    .line 701
    iget-object v3, v9, LA7/N;->i:LA7/P;

    .line 702
    .line 703
    invoke-virtual {v3, v0}, LA7/P;->c(Ljava/lang/String;)V

    .line 704
    .line 705
    .line 706
    goto :goto_13

    .line 707
    :cond_16
    :goto_12
    invoke-static {v9}, LA7/n0;->d(LA7/D0;)V

    .line 708
    .line 709
    .line 710
    const-string v0, "ADID unavailable to retrieve Deferred Deep Link. Skipping"

    .line 711
    .line 712
    iget-object v3, v9, LA7/N;->n:LA7/P;

    .line 713
    .line 714
    invoke-virtual {v3, v0}, LA7/P;->c(Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    :cond_17
    :goto_13
    if-eqz v7, :cond_18

    .line 718
    .line 719
    iget-object v0, v2, LA7/P0;->s:LA7/X0;

    .line 720
    .line 721
    const-wide/16 v2, 0x7d0

    .line 722
    .line 723
    invoke-virtual {v0, v2, v3}, LA7/n;->b(J)V

    .line 724
    .line 725
    .line 726
    :cond_18
    return-void

    .line 727
    :pswitch_0
    iget-object v0, v1, LA7/X0;->f:LA7/P0;

    .line 728
    .line 729
    invoke-virtual {v0}, LA7/P0;->C0()V

    .line 730
    .line 731
    .line 732
    return-void

    .line 733
    :pswitch_1
    iget-object v0, v1, LA7/X0;->f:LA7/P0;

    .line 734
    .line 735
    invoke-virtual {v0}, LA7/P0;->D0()V

    .line 736
    .line 737
    .line 738
    return-void

    .line 739
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
