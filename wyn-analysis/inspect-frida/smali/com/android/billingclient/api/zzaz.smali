.class public final synthetic Lcom/android/billingclient/api/zzaz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic zza:Lcom/android/billingclient/api/d;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/zzaz;->zza:Lcom/android/billingclient/api/d;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/zzaz;->zza:Lcom/android/billingclient/api/d;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/android/billingclient/api/d;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-boolean v2, v0, Lcom/android/billingclient/api/d;->b:Z

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    monitor-exit v1

    .line 12
    return-object v3

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto/16 :goto_1f

    .line 15
    .line 16
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    const-string v1, "accountName"

    .line 24
    .line 25
    invoke-static {v1, v3}, Lka/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object v1, v3

    .line 31
    :goto_0
    const/4 v2, 0x6

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x0

    .line 34
    :try_start_1
    iget-object v6, v0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a;

    .line 35
    .line 36
    iget-object v6, v6, Lcom/android/billingclient/api/a;->e:Landroid/content/Context;

    .line 37
    .line 38
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 42
    const/16 v7, 0x16

    .line 43
    .line 44
    move v9, v4

    .line 45
    move v8, v7

    .line 46
    :goto_1
    if-lt v8, v4, :cond_4

    .line 47
    .line 48
    if-nez v1, :cond_2

    .line 49
    .line 50
    :try_start_2
    iget-object v10, v0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a;

    .line 51
    .line 52
    iget-object v10, v10, Lcom/android/billingclient/api/a;->g:Lcom/google/android/gms/internal/play_billing/zzs;

    .line 53
    .line 54
    const-string v11, "subs"

    .line 55
    .line 56
    invoke-interface {v10, v8, v6, v11}, Lcom/google/android/gms/internal/play_billing/zzs;->zzy(ILjava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    iget-object v10, v0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a;

    .line 62
    .line 63
    iget-object v10, v10, Lcom/android/billingclient/api/a;->g:Lcom/google/android/gms/internal/play_billing/zzs;

    .line 64
    .line 65
    const-string v11, "subs"

    .line 66
    .line 67
    invoke-interface {v10, v8, v6, v11, v1}, Lcom/google/android/gms/internal/play_billing/zzs;->zzc(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)I

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    :goto_2
    if-nez v9, :cond_3

    .line 72
    .line 73
    const-string v10, "BillingClient"

    .line 74
    .line 75
    new-instance v11, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v12, "highestLevelSupportedForSubs: "

    .line 81
    .line 82
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    invoke-static {v10, v11}, Lcom/google/android/gms/internal/play_billing/zzb;->zzj(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :catch_0
    move-exception v1

    .line 97
    move v4, v9

    .line 98
    goto/16 :goto_19

    .line 99
    .line 100
    :cond_3
    add-int/lit8 v8, v8, -0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    move v8, v5

    .line 104
    :goto_3
    iget-object v10, v0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a;

    .line 105
    .line 106
    const/4 v11, 0x5

    .line 107
    const/4 v12, 0x1

    .line 108
    if-lt v8, v11, :cond_5

    .line 109
    .line 110
    move v11, v12

    .line 111
    goto :goto_4

    .line 112
    :cond_5
    move v11, v5

    .line 113
    :goto_4
    iput-boolean v11, v10, Lcom/android/billingclient/api/a;->j:Z

    .line 114
    .line 115
    if-lt v8, v4, :cond_6

    .line 116
    .line 117
    move v11, v12

    .line 118
    goto :goto_5

    .line 119
    :cond_6
    move v11, v5

    .line 120
    :goto_5
    iput-boolean v11, v10, Lcom/android/billingclient/api/a;->i:Z

    .line 121
    .line 122
    const/16 v10, 0x9

    .line 123
    .line 124
    if-ge v8, v4, :cond_7

    .line 125
    .line 126
    const-string v8, "BillingClient"

    .line 127
    .line 128
    const-string v11, "In-app billing API does not support subscription on this device."

    .line 129
    .line 130
    invoke-static {v8, v11}, Lcom/google/android/gms/internal/play_billing/zzb;->zzj(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    move v8, v10

    .line 134
    goto :goto_6

    .line 135
    :cond_7
    move v8, v12

    .line 136
    :goto_6
    move v11, v7

    .line 137
    :goto_7
    if-lt v11, v4, :cond_a

    .line 138
    .line 139
    if-nez v1, :cond_8

    .line 140
    .line 141
    iget-object v13, v0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a;

    .line 142
    .line 143
    iget-object v13, v13, Lcom/android/billingclient/api/a;->g:Lcom/google/android/gms/internal/play_billing/zzs;

    .line 144
    .line 145
    const-string v14, "inapp"

    .line 146
    .line 147
    invoke-interface {v13, v11, v6, v14}, Lcom/google/android/gms/internal/play_billing/zzs;->zzy(ILjava/lang/String;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    goto :goto_8

    .line 152
    :cond_8
    iget-object v13, v0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a;

    .line 153
    .line 154
    iget-object v13, v13, Lcom/android/billingclient/api/a;->g:Lcom/google/android/gms/internal/play_billing/zzs;

    .line 155
    .line 156
    const-string v14, "inapp"

    .line 157
    .line 158
    invoke-interface {v13, v11, v6, v14, v1}, Lcom/google/android/gms/internal/play_billing/zzs;->zzc(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)I

    .line 159
    .line 160
    .line 161
    move-result v9

    .line 162
    :goto_8
    if-nez v9, :cond_9

    .line 163
    .line 164
    iget-object v1, v0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a;

    .line 165
    .line 166
    iput v11, v1, Lcom/android/billingclient/api/a;->k:I

    .line 167
    .line 168
    const-string v1, "BillingClient"

    .line 169
    .line 170
    new-instance v6, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    const-string v13, "mHighestLevelSupportedForInApp: "

    .line 176
    .line 177
    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    invoke-static {v1, v6}, Lcom/google/android/gms/internal/play_billing/zzb;->zzj(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    goto :goto_9

    .line 191
    :cond_9
    add-int/lit8 v11, v11, -0x1

    .line 192
    .line 193
    goto :goto_7

    .line 194
    :cond_a
    :goto_9
    iget-object v1, v0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a;

    .line 195
    .line 196
    iget v6, v1, Lcom/android/billingclient/api/a;->k:I

    .line 197
    .line 198
    if-lt v6, v7, :cond_b

    .line 199
    .line 200
    move v7, v12

    .line 201
    goto :goto_a

    .line 202
    :cond_b
    move v7, v5

    .line 203
    :goto_a
    iput-boolean v7, v1, Lcom/android/billingclient/api/a;->y:Z

    .line 204
    .line 205
    const/16 v7, 0x15

    .line 206
    .line 207
    if-lt v6, v7, :cond_c

    .line 208
    .line 209
    move v7, v12

    .line 210
    goto :goto_b

    .line 211
    :cond_c
    move v7, v5

    .line 212
    :goto_b
    iput-boolean v7, v1, Lcom/android/billingclient/api/a;->x:Z

    .line 213
    .line 214
    const/16 v7, 0x14

    .line 215
    .line 216
    if-lt v6, v7, :cond_d

    .line 217
    .line 218
    move v7, v12

    .line 219
    goto :goto_c

    .line 220
    :cond_d
    move v7, v5

    .line 221
    :goto_c
    iput-boolean v7, v1, Lcom/android/billingclient/api/a;->w:Z

    .line 222
    .line 223
    const/16 v7, 0x13

    .line 224
    .line 225
    if-lt v6, v7, :cond_e

    .line 226
    .line 227
    move v7, v12

    .line 228
    goto :goto_d

    .line 229
    :cond_e
    move v7, v5

    .line 230
    :goto_d
    iput-boolean v7, v1, Lcom/android/billingclient/api/a;->v:Z

    .line 231
    .line 232
    const/16 v7, 0x12

    .line 233
    .line 234
    if-lt v6, v7, :cond_f

    .line 235
    .line 236
    move v7, v12

    .line 237
    goto :goto_e

    .line 238
    :cond_f
    move v7, v5

    .line 239
    :goto_e
    iput-boolean v7, v1, Lcom/android/billingclient/api/a;->u:Z

    .line 240
    .line 241
    const/16 v7, 0x11

    .line 242
    .line 243
    if-lt v6, v7, :cond_10

    .line 244
    .line 245
    move v7, v12

    .line 246
    goto :goto_f

    .line 247
    :cond_10
    move v7, v5

    .line 248
    :goto_f
    iput-boolean v7, v1, Lcom/android/billingclient/api/a;->t:Z

    .line 249
    .line 250
    const/16 v7, 0x10

    .line 251
    .line 252
    if-lt v6, v7, :cond_11

    .line 253
    .line 254
    move v7, v12

    .line 255
    goto :goto_10

    .line 256
    :cond_11
    move v7, v5

    .line 257
    :goto_10
    iput-boolean v7, v1, Lcom/android/billingclient/api/a;->s:Z

    .line 258
    .line 259
    const/16 v7, 0xf

    .line 260
    .line 261
    if-lt v6, v7, :cond_12

    .line 262
    .line 263
    move v7, v12

    .line 264
    goto :goto_11

    .line 265
    :cond_12
    move v7, v5

    .line 266
    :goto_11
    iput-boolean v7, v1, Lcom/android/billingclient/api/a;->r:Z

    .line 267
    .line 268
    const/16 v7, 0xe

    .line 269
    .line 270
    if-lt v6, v7, :cond_13

    .line 271
    .line 272
    move v7, v12

    .line 273
    goto :goto_12

    .line 274
    :cond_13
    move v7, v5

    .line 275
    :goto_12
    iput-boolean v7, v1, Lcom/android/billingclient/api/a;->q:Z

    .line 276
    .line 277
    const/16 v7, 0xc

    .line 278
    .line 279
    if-lt v6, v7, :cond_14

    .line 280
    .line 281
    move v7, v12

    .line 282
    goto :goto_13

    .line 283
    :cond_14
    move v7, v5

    .line 284
    :goto_13
    iput-boolean v7, v1, Lcom/android/billingclient/api/a;->p:Z

    .line 285
    .line 286
    const/16 v7, 0xa

    .line 287
    .line 288
    if-lt v6, v7, :cond_15

    .line 289
    .line 290
    move v7, v12

    .line 291
    goto :goto_14

    .line 292
    :cond_15
    move v7, v5

    .line 293
    :goto_14
    iput-boolean v7, v1, Lcom/android/billingclient/api/a;->o:Z

    .line 294
    .line 295
    if-lt v6, v10, :cond_16

    .line 296
    .line 297
    move v7, v12

    .line 298
    goto :goto_15

    .line 299
    :cond_16
    move v7, v5

    .line 300
    :goto_15
    iput-boolean v7, v1, Lcom/android/billingclient/api/a;->n:Z

    .line 301
    .line 302
    const/16 v7, 0x8

    .line 303
    .line 304
    if-lt v6, v7, :cond_17

    .line 305
    .line 306
    move v7, v12

    .line 307
    goto :goto_16

    .line 308
    :cond_17
    move v7, v5

    .line 309
    :goto_16
    iput-boolean v7, v1, Lcom/android/billingclient/api/a;->m:Z

    .line 310
    .line 311
    if-lt v6, v2, :cond_18

    .line 312
    .line 313
    goto :goto_17

    .line 314
    :cond_18
    move v12, v5

    .line 315
    :goto_17
    iput-boolean v12, v1, Lcom/android/billingclient/api/a;->l:Z

    .line 316
    .line 317
    if-ge v6, v4, :cond_19

    .line 318
    .line 319
    const-string v1, "BillingClient"

    .line 320
    .line 321
    const-string v4, "In-app billing API version 3 is not supported on this device."

    .line 322
    .line 323
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/play_billing/zzb;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    const/16 v8, 0x24

    .line 327
    .line 328
    :cond_19
    if-nez v9, :cond_1b

    .line 329
    .line 330
    iget-object v1, v0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a;

    .line 331
    .line 332
    const/4 v4, 0x2

    .line 333
    iput v4, v1, Lcom/android/billingclient/api/a;->a:I

    .line 334
    .line 335
    iget-object v1, v0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a;

    .line 336
    .line 337
    iget-object v1, v1, Lcom/android/billingclient/api/a;->d:LK8/H;

    .line 338
    .line 339
    if-eqz v1, :cond_1a

    .line 340
    .line 341
    iget-object v1, v0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a;

    .line 342
    .line 343
    iget-object v1, v1, Lcom/android/billingclient/api/a;->d:LK8/H;

    .line 344
    .line 345
    iget-object v4, v0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a;

    .line 346
    .line 347
    iget-boolean v4, v4, Lcom/android/billingclient/api/a;->x:Z

    .line 348
    .line 349
    invoke-virtual {v1, v4}, LK8/H;->q(Z)V

    .line 350
    .line 351
    .line 352
    :cond_1a
    :goto_18
    move-object v1, v3

    .line 353
    goto :goto_1d

    .line 354
    :cond_1b
    iget-object v1, v0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a;

    .line 355
    .line 356
    iput v5, v1, Lcom/android/billingclient/api/a;->a:I

    .line 357
    .line 358
    iget-object v1, v0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a;

    .line 359
    .line 360
    iput-object v3, v1, Lcom/android/billingclient/api/a;->g:Lcom/google/android/gms/internal/play_billing/zzs;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 361
    .line 362
    goto :goto_18

    .line 363
    :catch_1
    move-exception v1

    .line 364
    :goto_19
    const-string v6, "BillingClient"

    .line 365
    .line 366
    const-string v7, "Exception while checking if billing is supported; try to reconnect"

    .line 367
    .line 368
    invoke-static {v6, v7, v1}, Lcom/google/android/gms/internal/play_billing/zzb;->zzl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 369
    .line 370
    .line 371
    instance-of v6, v1, Landroid/os/DeadObjectException;

    .line 372
    .line 373
    const/16 v7, 0x2a

    .line 374
    .line 375
    if-eqz v6, :cond_1c

    .line 376
    .line 377
    const/16 v6, 0x65

    .line 378
    .line 379
    :goto_1a
    move v8, v6

    .line 380
    goto :goto_1b

    .line 381
    :cond_1c
    instance-of v6, v1, Landroid/os/RemoteException;

    .line 382
    .line 383
    if-eqz v6, :cond_1d

    .line 384
    .line 385
    const/16 v6, 0x64

    .line 386
    .line 387
    goto :goto_1a

    .line 388
    :cond_1d
    instance-of v6, v1, Ljava/lang/SecurityException;

    .line 389
    .line 390
    if-eqz v6, :cond_1e

    .line 391
    .line 392
    const/16 v6, 0x66

    .line 393
    .line 394
    goto :goto_1a

    .line 395
    :cond_1e
    move v8, v7

    .line 396
    :goto_1b
    if-ne v8, v7, :cond_1f

    .line 397
    .line 398
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    move-result-object v6

    .line 402
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v6

    .line 406
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/zzab;->zzb(Ljava/lang/String;)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    const-string v7, ": "

    .line 415
    .line 416
    invoke-static {v6, v7, v1}, LN0/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 421
    .line 422
    .line 423
    move-result v6

    .line 424
    const/16 v7, 0x46

    .line 425
    .line 426
    if-le v6, v7, :cond_20

    .line 427
    .line 428
    invoke-virtual {v1, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    goto :goto_1c

    .line 433
    :cond_1f
    move-object v1, v3

    .line 434
    :cond_20
    :goto_1c
    iget-object v6, v0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a;

    .line 435
    .line 436
    iput v5, v6, Lcom/android/billingclient/api/a;->a:I

    .line 437
    .line 438
    iget-object v5, v0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a;

    .line 439
    .line 440
    iput-object v3, v5, Lcom/android/billingclient/api/a;->g:Lcom/google/android/gms/internal/play_billing/zzs;

    .line 441
    .line 442
    move v9, v4

    .line 443
    :goto_1d
    if-nez v9, :cond_21

    .line 444
    .line 445
    iget-object v1, v0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a;

    .line 446
    .line 447
    invoke-static {v2}, Lcom/android/billingclient/api/zzcb;->zzc(I)Lcom/google/android/gms/internal/play_billing/zzge;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    invoke-virtual {v1, v2}, Lcom/android/billingclient/api/a;->g(Lcom/google/android/gms/internal/play_billing/zzge;)V

    .line 452
    .line 453
    .line 454
    sget-object v1, Lcom/android/billingclient/api/i;->k:Lcom/android/billingclient/api/BillingResult;

    .line 455
    .line 456
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/d;->a(Lcom/android/billingclient/api/BillingResult;)V

    .line 457
    .line 458
    .line 459
    goto :goto_1e

    .line 460
    :cond_21
    iget-object v4, v0, Lcom/android/billingclient/api/d;->d:Lcom/android/billingclient/api/a;

    .line 461
    .line 462
    sget-object v5, Lcom/android/billingclient/api/i;->a:Lcom/android/billingclient/api/BillingResult;

    .line 463
    .line 464
    invoke-static {v8, v2, v5, v1}, Lcom/android/billingclient/api/zzcb;->zzb(IILcom/android/billingclient/api/BillingResult;Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/zzga;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    invoke-virtual {v4, v1}, Lcom/android/billingclient/api/a;->f(Lcom/google/android/gms/internal/play_billing/zzga;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v0, v5}, Lcom/android/billingclient/api/d;->a(Lcom/android/billingclient/api/BillingResult;)V

    .line 472
    .line 473
    .line 474
    :goto_1e
    return-object v3

    .line 475
    :goto_1f
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 476
    throw v0
.end method
