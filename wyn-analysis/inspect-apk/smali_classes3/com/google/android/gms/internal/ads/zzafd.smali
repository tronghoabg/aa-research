.class public final Lcom/google/android/gms/internal/ads/zzafd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic zza:I

.field private static final zzb:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xe

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzafd;->zzb:[I

    return-void

    :array_0
    .array-data 4
        0x7d2
        0x7d0
        0x780
        0x641
        0x640
        0x3e9
        0x3e8
        0x3c0
        0x320
        0x320
        0x1e0
        0x190
        0x190
        0x800
    .end array-data
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzeu;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzq;)Lcom/google/android/gms/internal/ads/zzv;
    .locals 22
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    const/16 v1, 0x8

    .line 3
    .line 4
    new-instance v3, Lcom/google/android/gms/internal/ads/zzet;

    .line 5
    .line 6
    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/zzet;-><init>()V

    .line 7
    .line 8
    .line 9
    move-object/from16 v4, p0

    .line 10
    .line 11
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzet;->zza(Lcom/google/android/gms/internal/ads/zzeu;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzc()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    const/4 v5, 0x3

    .line 19
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    const/4 v7, 0x1

    .line 24
    if-gt v6, v7, :cond_3a

    .line 25
    .line 26
    const/4 v8, 0x7

    .line 27
    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 28
    .line 29
    .line 30
    move-result v9

    .line 31
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    if-eq v7, v10, :cond_0

    .line 36
    .line 37
    const v10, 0xac44

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const v10, 0xbb80

    .line 42
    .line 43
    .line 44
    :goto_0
    const/4 v11, 0x4

    .line 45
    invoke-virtual {v3, v11}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 46
    .line 47
    .line 48
    const/16 v12, 0x9

    .line 49
    .line 50
    invoke-virtual {v3, v12}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 51
    .line 52
    .line 53
    move-result v12

    .line 54
    const/16 v13, 0x10

    .line 55
    .line 56
    if-le v9, v7, :cond_2

    .line 57
    .line 58
    if-eqz v6, :cond_1

    .line 59
    .line 60
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 61
    .line 62
    .line 63
    move-result v14

    .line 64
    if-eqz v14, :cond_2

    .line 65
    .line 66
    invoke-virtual {v3, v13}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 70
    .line 71
    .line 72
    move-result v14

    .line 73
    if-eqz v14, :cond_2

    .line 74
    .line 75
    const/16 v14, 0x80

    .line 76
    .line 77
    invoke-virtual {v3, v14}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    const-string v0, "Invalid AC-4 DSI version: 0"

    .line 82
    .line 83
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    throw v0

    .line 88
    :cond_2
    :goto_1
    if-ne v6, v7, :cond_4

    .line 89
    .line 90
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzafd;->zzg(Lcom/google/android/gms/internal/ads/zzet;)Z

    .line 91
    .line 92
    .line 93
    move-result v14

    .line 94
    if-eqz v14, :cond_3

    .line 95
    .line 96
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzm()V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    const-string v0, "Invalid AC-4 DSI bitrate."

    .line 101
    .line 102
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    throw v0

    .line 107
    :cond_4
    :goto_2
    new-instance v14, Lcom/google/android/gms/internal/ads/zzafb;

    .line 108
    .line 109
    const/4 v15, 0x0

    .line 110
    invoke-direct {v14, v15}, Lcom/google/android/gms/internal/ads/zzafb;-><init>([B)V

    .line 111
    .line 112
    .line 113
    const/4 v15, 0x0

    .line 114
    const/16 v16, 0x0

    .line 115
    .line 116
    :goto_3
    const/4 v11, 0x6

    .line 117
    const/4 v2, 0x5

    .line 118
    if-ge v15, v12, :cond_2c

    .line 119
    .line 120
    if-nez v6, :cond_5

    .line 121
    .line 122
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 123
    .line 124
    .line 125
    move-result v12

    .line 126
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 127
    .line 128
    .line 129
    move-result v17

    .line 130
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 131
    .line 132
    .line 133
    move-result v18

    .line 134
    move/from16 v19, v1

    .line 135
    .line 136
    move/from16 v1, v16

    .line 137
    .line 138
    move v13, v1

    .line 139
    move/from16 v8, v17

    .line 140
    .line 141
    move/from16 v0, v18

    .line 142
    .line 143
    move/from16 v18, v7

    .line 144
    .line 145
    move v7, v13

    .line 146
    goto :goto_5

    .line 147
    :cond_5
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 148
    .line 149
    .line 150
    move-result v8

    .line 151
    move/from16 v18, v7

    .line 152
    .line 153
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    move/from16 v19, v1

    .line 158
    .line 159
    const/16 v1, 0xff

    .line 160
    .line 161
    if-ne v7, v1, :cond_6

    .line 162
    .line 163
    invoke-virtual {v3, v13}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    add-int/2addr v7, v1

    .line 168
    :cond_6
    if-le v8, v0, :cond_7

    .line 169
    .line 170
    mul-int/lit8 v7, v7, 0x8

    .line 171
    .line 172
    invoke-virtual {v3, v7}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 173
    .line 174
    .line 175
    add-int/lit8 v15, v15, 0x1

    .line 176
    .line 177
    move/from16 v7, v18

    .line 178
    .line 179
    move/from16 v1, v19

    .line 180
    .line 181
    const/4 v8, 0x7

    .line 182
    const/4 v11, 0x4

    .line 183
    goto :goto_3

    .line 184
    :cond_7
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzc()I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    sub-int v1, v4, v1

    .line 189
    .line 190
    div-int/lit8 v1, v1, 0x8

    .line 191
    .line 192
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 193
    .line 194
    .line 195
    move-result v12

    .line 196
    const/16 v13, 0x1f

    .line 197
    .line 198
    if-ne v12, v13, :cond_8

    .line 199
    .line 200
    move/from16 v13, v18

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_8
    move/from16 v13, v16

    .line 204
    .line 205
    :goto_4
    move v0, v8

    .line 206
    move v8, v12

    .line 207
    move/from16 v12, v16

    .line 208
    .line 209
    :goto_5
    iput v0, v14, Lcom/google/android/gms/internal/ads/zzafb;->zzf:I

    .line 210
    .line 211
    const/16 v2, 0xf

    .line 212
    .line 213
    if-nez v12, :cond_a

    .line 214
    .line 215
    if-nez v13, :cond_a

    .line 216
    .line 217
    if-eq v8, v11, :cond_9

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_9
    move/from16 v21, v1

    .line 221
    .line 222
    const/4 v5, 0x7

    .line 223
    goto/16 :goto_17

    .line 224
    .line 225
    :cond_a
    :goto_6
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 226
    .line 227
    .line 228
    move-result v11

    .line 229
    iput v11, v14, Lcom/google/android/gms/internal/ads/zzafb;->zzg:I

    .line 230
    .line 231
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 232
    .line 233
    .line 234
    move-result v11

    .line 235
    if-eqz v11, :cond_b

    .line 236
    .line 237
    const/4 v11, 0x5

    .line 238
    invoke-virtual {v3, v11}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 239
    .line 240
    .line 241
    :cond_b
    const/4 v11, 0x2

    .line 242
    invoke-virtual {v3, v11}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 243
    .line 244
    .line 245
    move/from16 v5, v18

    .line 246
    .line 247
    if-ne v6, v5, :cond_d

    .line 248
    .line 249
    if-eq v0, v5, :cond_c

    .line 250
    .line 251
    if-ne v0, v11, :cond_d

    .line 252
    .line 253
    move v0, v11

    .line 254
    :cond_c
    invoke-virtual {v3, v11}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 255
    .line 256
    .line 257
    :cond_d
    const/4 v11, 0x5

    .line 258
    invoke-virtual {v3, v11}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 259
    .line 260
    .line 261
    const/16 v11, 0xa

    .line 262
    .line 263
    invoke-virtual {v3, v11}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 264
    .line 265
    .line 266
    if-ne v6, v5, :cond_17

    .line 267
    .line 268
    if-lez v0, :cond_e

    .line 269
    .line 270
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 271
    .line 272
    .line 273
    move-result v11

    .line 274
    iput-boolean v11, v14, Lcom/google/android/gms/internal/ads/zzafb;->zza:Z

    .line 275
    .line 276
    :cond_e
    iget-boolean v11, v14, Lcom/google/android/gms/internal/ads/zzafb;->zza:Z

    .line 277
    .line 278
    if-eqz v11, :cond_13

    .line 279
    .line 280
    if-eq v0, v5, :cond_10

    .line 281
    .line 282
    const/4 v11, 0x2

    .line 283
    if-ne v0, v11, :cond_f

    .line 284
    .line 285
    const/4 v5, 0x2

    .line 286
    :goto_7
    move/from16 v21, v1

    .line 287
    .line 288
    const/4 v11, 0x5

    .line 289
    goto :goto_9

    .line 290
    :cond_f
    move v5, v0

    .line 291
    move/from16 v21, v1

    .line 292
    .line 293
    :goto_8
    const/16 v1, 0x18

    .line 294
    .line 295
    goto :goto_a

    .line 296
    :cond_10
    const/4 v5, 0x1

    .line 297
    goto :goto_7

    .line 298
    :goto_9
    invoke-virtual {v3, v11}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    if-ltz v1, :cond_11

    .line 303
    .line 304
    if-gt v1, v2, :cond_11

    .line 305
    .line 306
    iput v1, v14, Lcom/google/android/gms/internal/ads/zzafb;->zzb:I

    .line 307
    .line 308
    :cond_11
    const/16 v11, 0xb

    .line 309
    .line 310
    if-lt v1, v11, :cond_12

    .line 311
    .line 312
    const/16 v11, 0xe

    .line 313
    .line 314
    if-gt v1, v11, :cond_12

    .line 315
    .line 316
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    iput-boolean v1, v14, Lcom/google/android/gms/internal/ads/zzafb;->zzd:Z

    .line 321
    .line 322
    const/4 v11, 0x2

    .line 323
    invoke-virtual {v3, v11}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    iput v1, v14, Lcom/google/android/gms/internal/ads/zzafb;->zze:I

    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_12
    const/4 v11, 0x2

    .line 331
    goto :goto_8

    .line 332
    :goto_a
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 333
    .line 334
    .line 335
    const/4 v1, 0x1

    .line 336
    goto :goto_b

    .line 337
    :cond_13
    move/from16 v21, v1

    .line 338
    .line 339
    const/4 v11, 0x2

    .line 340
    move v1, v5

    .line 341
    move v5, v0

    .line 342
    :goto_b
    if-eq v0, v1, :cond_14

    .line 343
    .line 344
    if-ne v0, v11, :cond_16

    .line 345
    .line 346
    :cond_14
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    if-eqz v0, :cond_15

    .line 351
    .line 352
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-eqz v0, :cond_15

    .line 357
    .line 358
    invoke-virtual {v3, v11}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 359
    .line 360
    .line 361
    :cond_15
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    if-eqz v0, :cond_16

    .line 366
    .line 367
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 368
    .line 369
    .line 370
    move/from16 v0, v19

    .line 371
    .line 372
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    move/from16 v11, v16

    .line 377
    .line 378
    :goto_c
    if-ge v11, v1, :cond_16

    .line 379
    .line 380
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 381
    .line 382
    .line 383
    const/16 v18, 0x1

    .line 384
    .line 385
    add-int/lit8 v11, v11, 0x1

    .line 386
    .line 387
    const/16 v0, 0x8

    .line 388
    .line 389
    goto :goto_c

    .line 390
    :cond_16
    move v0, v5

    .line 391
    goto :goto_d

    .line 392
    :cond_17
    move/from16 v21, v1

    .line 393
    .line 394
    :goto_d
    if-nez v12, :cond_20

    .line 395
    .line 396
    if-eqz v13, :cond_18

    .line 397
    .line 398
    goto/16 :goto_15

    .line 399
    .line 400
    :cond_18
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 401
    .line 402
    .line 403
    const/4 v1, 0x1

    .line 404
    if-eqz v8, :cond_1e

    .line 405
    .line 406
    if-eq v8, v1, :cond_1e

    .line 407
    .line 408
    const/4 v11, 0x2

    .line 409
    if-eq v8, v11, :cond_1e

    .line 410
    .line 411
    const/4 v5, 0x3

    .line 412
    if-eq v8, v5, :cond_1c

    .line 413
    .line 414
    const/4 v5, 0x4

    .line 415
    if-eq v8, v5, :cond_1c

    .line 416
    .line 417
    const/4 v11, 0x5

    .line 418
    if-eq v8, v11, :cond_19

    .line 419
    .line 420
    const/4 v5, 0x7

    .line 421
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 422
    .line 423
    .line 424
    move-result v8

    .line 425
    move/from16 v5, v16

    .line 426
    .line 427
    :goto_e
    if-ge v5, v8, :cond_22

    .line 428
    .line 429
    const/16 v11, 0x8

    .line 430
    .line 431
    invoke-virtual {v3, v11}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 432
    .line 433
    .line 434
    add-int/2addr v5, v1

    .line 435
    goto :goto_e

    .line 436
    :cond_19
    if-nez v0, :cond_1b

    .line 437
    .line 438
    invoke-static {v3, v14}, Lcom/google/android/gms/internal/ads/zzafd;->zzd(Lcom/google/android/gms/internal/ads/zzet;Lcom/google/android/gms/internal/ads/zzafb;)V

    .line 439
    .line 440
    .line 441
    :cond_1a
    :goto_f
    move/from16 v0, v16

    .line 442
    .line 443
    goto :goto_16

    .line 444
    :cond_1b
    const/4 v5, 0x3

    .line 445
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 446
    .line 447
    .line 448
    move-result v8

    .line 449
    move/from16 v5, v16

    .line 450
    .line 451
    :goto_10
    const/16 v20, 0x2

    .line 452
    .line 453
    add-int/lit8 v11, v8, 0x2

    .line 454
    .line 455
    if-ge v5, v11, :cond_22

    .line 456
    .line 457
    invoke-static {v3, v14}, Lcom/google/android/gms/internal/ads/zzafd;->zze(Lcom/google/android/gms/internal/ads/zzet;Lcom/google/android/gms/internal/ads/zzafb;)V

    .line 458
    .line 459
    .line 460
    add-int/2addr v5, v1

    .line 461
    goto :goto_10

    .line 462
    :cond_1c
    if-nez v0, :cond_1d

    .line 463
    .line 464
    move/from16 v0, v16

    .line 465
    .line 466
    const/4 v5, 0x3

    .line 467
    :goto_11
    if-ge v0, v5, :cond_1a

    .line 468
    .line 469
    invoke-static {v3, v14}, Lcom/google/android/gms/internal/ads/zzafd;->zzd(Lcom/google/android/gms/internal/ads/zzet;Lcom/google/android/gms/internal/ads/zzafb;)V

    .line 470
    .line 471
    .line 472
    add-int/2addr v0, v1

    .line 473
    goto :goto_11

    .line 474
    :cond_1d
    move/from16 v8, v16

    .line 475
    .line 476
    :goto_12
    const/4 v5, 0x3

    .line 477
    if-ge v8, v5, :cond_22

    .line 478
    .line 479
    invoke-static {v3, v14}, Lcom/google/android/gms/internal/ads/zzafd;->zze(Lcom/google/android/gms/internal/ads/zzet;Lcom/google/android/gms/internal/ads/zzafb;)V

    .line 480
    .line 481
    .line 482
    add-int/2addr v8, v1

    .line 483
    goto :goto_12

    .line 484
    :cond_1e
    if-nez v0, :cond_1f

    .line 485
    .line 486
    move/from16 v0, v16

    .line 487
    .line 488
    const/4 v11, 0x2

    .line 489
    :goto_13
    if-ge v0, v11, :cond_1a

    .line 490
    .line 491
    invoke-static {v3, v14}, Lcom/google/android/gms/internal/ads/zzafd;->zzd(Lcom/google/android/gms/internal/ads/zzet;Lcom/google/android/gms/internal/ads/zzafb;)V

    .line 492
    .line 493
    .line 494
    add-int/2addr v0, v1

    .line 495
    goto :goto_13

    .line 496
    :cond_1f
    move/from16 v5, v16

    .line 497
    .line 498
    :goto_14
    const/4 v11, 0x2

    .line 499
    if-ge v5, v11, :cond_22

    .line 500
    .line 501
    invoke-static {v3, v14}, Lcom/google/android/gms/internal/ads/zzafd;->zze(Lcom/google/android/gms/internal/ads/zzet;Lcom/google/android/gms/internal/ads/zzafb;)V

    .line 502
    .line 503
    .line 504
    add-int/2addr v5, v1

    .line 505
    goto :goto_14

    .line 506
    :cond_20
    :goto_15
    if-nez v0, :cond_21

    .line 507
    .line 508
    invoke-static {v3, v14}, Lcom/google/android/gms/internal/ads/zzafd;->zzd(Lcom/google/android/gms/internal/ads/zzet;Lcom/google/android/gms/internal/ads/zzafb;)V

    .line 509
    .line 510
    .line 511
    goto :goto_f

    .line 512
    :cond_21
    invoke-static {v3, v14}, Lcom/google/android/gms/internal/ads/zzafd;->zze(Lcom/google/android/gms/internal/ads/zzet;Lcom/google/android/gms/internal/ads/zzafb;)V

    .line 513
    .line 514
    .line 515
    :cond_22
    :goto_16
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 519
    .line 520
    .line 521
    move-result v1

    .line 522
    const/4 v5, 0x7

    .line 523
    if-eqz v1, :cond_23

    .line 524
    .line 525
    :goto_17
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 526
    .line 527
    .line 528
    move-result v1

    .line 529
    move/from16 v8, v16

    .line 530
    .line 531
    :goto_18
    if-ge v8, v1, :cond_23

    .line 532
    .line 533
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 534
    .line 535
    .line 536
    const/16 v18, 0x1

    .line 537
    .line 538
    add-int/lit8 v8, v8, 0x1

    .line 539
    .line 540
    goto :goto_18

    .line 541
    :cond_23
    if-lez v0, :cond_27

    .line 542
    .line 543
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    if-eqz v0, :cond_25

    .line 548
    .line 549
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzafd;->zzg(Lcom/google/android/gms/internal/ads/zzet;)Z

    .line 550
    .line 551
    .line 552
    move-result v0

    .line 553
    if-eqz v0, :cond_24

    .line 554
    .line 555
    goto :goto_19

    .line 556
    :cond_24
    const-string v0, "Can\'t parse bitrate DSI."

    .line 557
    .line 558
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    throw v0

    .line 563
    :cond_25
    :goto_19
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 564
    .line 565
    .line 566
    move-result v0

    .line 567
    if-eqz v0, :cond_27

    .line 568
    .line 569
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzm()V

    .line 570
    .line 571
    .line 572
    const/16 v0, 0x10

    .line 573
    .line 574
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 575
    .line 576
    .line 577
    move-result v0

    .line 578
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzo(I)V

    .line 579
    .line 580
    .line 581
    const/4 v11, 0x5

    .line 582
    invoke-virtual {v3, v11}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 583
    .line 584
    .line 585
    move-result v0

    .line 586
    move/from16 v1, v16

    .line 587
    .line 588
    :goto_1a
    if-ge v1, v0, :cond_26

    .line 589
    .line 590
    const/4 v2, 0x3

    .line 591
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 592
    .line 593
    .line 594
    const/16 v2, 0x8

    .line 595
    .line 596
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 597
    .line 598
    .line 599
    const/4 v8, 0x1

    .line 600
    add-int/2addr v1, v8

    .line 601
    goto :goto_1a

    .line 602
    :cond_26
    const/16 v2, 0x8

    .line 603
    .line 604
    const/4 v8, 0x1

    .line 605
    goto :goto_1b

    .line 606
    :cond_27
    const/16 v2, 0x8

    .line 607
    .line 608
    const/4 v8, 0x1

    .line 609
    const/4 v11, 0x5

    .line 610
    :goto_1b
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzm()V

    .line 611
    .line 612
    .line 613
    if-ne v6, v8, :cond_29

    .line 614
    .line 615
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzet;->zzc()I

    .line 616
    .line 617
    .line 618
    move-result v0

    .line 619
    sub-int/2addr v4, v0

    .line 620
    div-int/2addr v4, v2

    .line 621
    sub-int v4, v4, v21

    .line 622
    .line 623
    if-lt v7, v4, :cond_28

    .line 624
    .line 625
    sub-int/2addr v7, v4

    .line 626
    invoke-virtual {v3, v7}, Lcom/google/android/gms/internal/ads/zzet;->zzo(I)V

    .line 627
    .line 628
    .line 629
    goto :goto_1c

    .line 630
    :cond_28
    const-string v0, "pres_bytes is smaller than presentation bytes read."

    .line 631
    .line 632
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    throw v0

    .line 637
    :cond_29
    :goto_1c
    iget-boolean v0, v14, Lcom/google/android/gms/internal/ads/zzafb;->zza:Z

    .line 638
    .line 639
    if-eqz v0, :cond_2b

    .line 640
    .line 641
    iget v0, v14, Lcom/google/android/gms/internal/ads/zzafb;->zzb:I

    .line 642
    .line 643
    const/4 v1, -0x1

    .line 644
    if-eq v0, v1, :cond_2a

    .line 645
    .line 646
    goto :goto_1e

    .line 647
    :cond_2a
    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 652
    .line 653
    .line 654
    move-result v0

    .line 655
    new-instance v1, Ljava/lang/StringBuilder;

    .line 656
    .line 657
    add-int/lit8 v0, v0, 0x2d

    .line 658
    .line 659
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 660
    .line 661
    .line 662
    const-string v0, "Can\'t determine channel mode of presentation "

    .line 663
    .line 664
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    throw v0

    .line 679
    :cond_2b
    :goto_1d
    const/4 v1, -0x1

    .line 680
    goto :goto_1e

    .line 681
    :cond_2c
    move v11, v2

    .line 682
    const/4 v5, 0x7

    .line 683
    move v2, v1

    .line 684
    goto :goto_1d

    .line 685
    :goto_1e
    iget-boolean v0, v14, Lcom/google/android/gms/internal/ads/zzafb;->zza:Z

    .line 686
    .line 687
    const/16 v3, 0xc

    .line 688
    .line 689
    if-eqz v0, :cond_31

    .line 690
    .line 691
    iget v0, v14, Lcom/google/android/gms/internal/ads/zzafb;->zzb:I

    .line 692
    .line 693
    iget-boolean v4, v14, Lcom/google/android/gms/internal/ads/zzafb;->zzd:Z

    .line 694
    .line 695
    iget v6, v14, Lcom/google/android/gms/internal/ads/zzafb;->zze:I

    .line 696
    .line 697
    const/16 v7, 0xd

    .line 698
    .line 699
    packed-switch v0, :pswitch_data_0

    .line 700
    .line 701
    .line 702
    :goto_1f
    const/16 v11, 0xb

    .line 703
    .line 704
    goto :goto_20

    .line 705
    :pswitch_0
    const/16 v1, 0x18

    .line 706
    .line 707
    goto :goto_1f

    .line 708
    :pswitch_1
    const/16 v1, 0xe

    .line 709
    .line 710
    goto :goto_1f

    .line 711
    :pswitch_2
    move v1, v7

    .line 712
    goto :goto_1f

    .line 713
    :pswitch_3
    move v1, v3

    .line 714
    goto :goto_1f

    .line 715
    :pswitch_4
    const/16 v1, 0xb

    .line 716
    .line 717
    goto :goto_1f

    .line 718
    :pswitch_5
    move v1, v2

    .line 719
    goto :goto_1f

    .line 720
    :pswitch_6
    move v1, v5

    .line 721
    goto :goto_1f

    .line 722
    :pswitch_7
    const/4 v1, 0x6

    .line 723
    goto :goto_1f

    .line 724
    :pswitch_8
    move v1, v11

    .line 725
    goto :goto_1f

    .line 726
    :pswitch_9
    const/4 v1, 0x3

    .line 727
    goto :goto_1f

    .line 728
    :pswitch_a
    const/4 v1, 0x2

    .line 729
    goto :goto_1f

    .line 730
    :pswitch_b
    const/4 v1, 0x1

    .line 731
    goto :goto_1f

    .line 732
    :goto_20
    if-eq v0, v11, :cond_2d

    .line 733
    .line 734
    if-eq v0, v3, :cond_2d

    .line 735
    .line 736
    if-eq v0, v7, :cond_2d

    .line 737
    .line 738
    const/16 v11, 0xe

    .line 739
    .line 740
    if-ne v0, v11, :cond_38

    .line 741
    .line 742
    :cond_2d
    if-nez v4, :cond_2e

    .line 743
    .line 744
    add-int/lit8 v1, v1, -0x2

    .line 745
    .line 746
    :cond_2e
    if-eqz v6, :cond_30

    .line 747
    .line 748
    const/4 v5, 0x1

    .line 749
    if-eq v6, v5, :cond_2f

    .line 750
    .line 751
    goto :goto_21

    .line 752
    :cond_2f
    add-int/lit8 v1, v1, -0x2

    .line 753
    .line 754
    goto :goto_21

    .line 755
    :cond_30
    const/4 v5, 0x1

    .line 756
    add-int/lit8 v1, v1, -0x4

    .line 757
    .line 758
    goto :goto_21

    .line 759
    :cond_31
    const/4 v5, 0x1

    .line 760
    iget v0, v14, Lcom/google/android/gms/internal/ads/zzafb;->zzc:I

    .line 761
    .line 762
    if-lez v0, :cond_32

    .line 763
    .line 764
    add-int/lit8 v1, v0, 0x1

    .line 765
    .line 766
    iget v0, v14, Lcom/google/android/gms/internal/ads/zzafb;->zzg:I

    .line 767
    .line 768
    const/4 v5, 0x4

    .line 769
    if-ne v0, v5, :cond_38

    .line 770
    .line 771
    const/16 v0, 0x11

    .line 772
    .line 773
    if-ne v1, v0, :cond_38

    .line 774
    .line 775
    const/16 v1, 0x15

    .line 776
    .line 777
    goto :goto_21

    .line 778
    :cond_32
    iget v0, v14, Lcom/google/android/gms/internal/ads/zzafb;->zzg:I

    .line 779
    .line 780
    if-eqz v0, :cond_33

    .line 781
    .line 782
    const/4 v1, 0x1

    .line 783
    if-eq v0, v1, :cond_37

    .line 784
    .line 785
    const/4 v11, 0x2

    .line 786
    if-eq v0, v11, :cond_36

    .line 787
    .line 788
    const/4 v5, 0x3

    .line 789
    if-eq v0, v5, :cond_35

    .line 790
    .line 791
    const/4 v5, 0x4

    .line 792
    if-eq v0, v5, :cond_34

    .line 793
    .line 794
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v1

    .line 798
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 799
    .line 800
    .line 801
    move-result v1

    .line 802
    new-instance v2, Ljava/lang/StringBuilder;

    .line 803
    .line 804
    add-int/lit8 v1, v1, 0x21

    .line 805
    .line 806
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 807
    .line 808
    .line 809
    const-string v1, "AC-4 level "

    .line 810
    .line 811
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 812
    .line 813
    .line 814
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 815
    .line 816
    .line 817
    const-string v0, " has not been defined."

    .line 818
    .line 819
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 820
    .line 821
    .line 822
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    const-string v1, "Ac4Util"

    .line 827
    .line 828
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 829
    .line 830
    .line 831
    :cond_33
    const/4 v1, 0x2

    .line 832
    goto :goto_21

    .line 833
    :cond_34
    move v1, v3

    .line 834
    goto :goto_21

    .line 835
    :cond_35
    const/16 v1, 0xa

    .line 836
    .line 837
    goto :goto_21

    .line 838
    :cond_36
    move v1, v2

    .line 839
    goto :goto_21

    .line 840
    :cond_37
    const/4 v1, 0x6

    .line 841
    :cond_38
    :goto_21
    if-lez v1, :cond_39

    .line 842
    .line 843
    iget v0, v14, Lcom/google/android/gms/internal/ads/zzafb;->zzf:I

    .line 844
    .line 845
    iget v2, v14, Lcom/google/android/gms/internal/ads/zzafb;->zzg:I

    .line 846
    .line 847
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 848
    .line 849
    .line 850
    move-result-object v3

    .line 851
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 856
    .line 857
    .line 858
    move-result-object v2

    .line 859
    const/4 v5, 0x3

    .line 860
    new-array v4, v5, [Ljava/lang/Object;

    .line 861
    .line 862
    aput-object v3, v4, v16

    .line 863
    .line 864
    const/16 v18, 0x1

    .line 865
    .line 866
    aput-object v0, v4, v18

    .line 867
    .line 868
    const/16 v20, 0x2

    .line 869
    .line 870
    aput-object v2, v4, v20

    .line 871
    .line 872
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 873
    .line 874
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 875
    .line 876
    const-string v2, "ac-4.%02d.%02d.%02d"

    .line 877
    .line 878
    invoke-static {v0, v2, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    new-instance v2, Lcom/google/android/gms/internal/ads/zzt;

    .line 883
    .line 884
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 885
    .line 886
    .line 887
    move-object/from16 v3, p1

    .line 888
    .line 889
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzt;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 890
    .line 891
    .line 892
    const-string v3, "audio/ac4"

    .line 893
    .line 894
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 895
    .line 896
    .line 897
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzt;->zzG(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 898
    .line 899
    .line 900
    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/ads/zzt;->zzI(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 901
    .line 902
    .line 903
    move-object/from16 v1, p3

    .line 904
    .line 905
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzt;->zzs(Lcom/google/android/gms/internal/ads/zzq;)Lcom/google/android/gms/internal/ads/zzt;

    .line 906
    .line 907
    .line 908
    move-object/from16 v1, p2

    .line 909
    .line 910
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzt;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 911
    .line 912
    .line 913
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzt;->zzk(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 914
    .line 915
    .line 916
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    return-object v0

    .line 921
    :cond_39
    const-string v0, "Cannot determine channel count of presentation."

    .line 922
    .line 923
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 924
    .line 925
    .line 926
    move-result-object v0

    .line 927
    throw v0

    .line 928
    :cond_3a
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    move-result-object v0

    .line 932
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 933
    .line 934
    .line 935
    move-result v0

    .line 936
    new-instance v1, Ljava/lang/StringBuilder;

    .line 937
    .line 938
    add-int/lit8 v0, v0, 0x1e

    .line 939
    .line 940
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 941
    .line 942
    .line 943
    const-string v0, "Unsupported AC-4 DSI version: "

    .line 944
    .line 945
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 946
    .line 947
    .line 948
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 949
    .line 950
    .line 951
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 956
    .line 957
    .line 958
    move-result-object v0

    .line 959
    throw v0

    .line 960
    nop

    .line 961
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static zzb(Lcom/google/android/gms/internal/ads/zzet;)Lcom/google/android/gms/internal/ads/zzafc;
    .locals 11

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const v2, 0xffff

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x4

    .line 15
    if-ne v0, v2, :cond_0

    .line 16
    .line 17
    const/16 v0, 0x18

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v2, 0x7

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v2, v3

    .line 26
    :goto_0
    add-int/2addr v0, v2

    .line 27
    const v2, 0xac41

    .line 28
    .line 29
    .line 30
    if-ne v1, v2, :cond_1

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x2

    .line 33
    .line 34
    :cond_1
    move v8, v0

    .line 35
    const/4 v0, 0x2

    .line 36
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x0

    .line 41
    const/4 v4, 0x3

    .line 42
    if-ne v1, v4, :cond_2

    .line 43
    .line 44
    move v1, v2

    .line 45
    :goto_1
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    add-int/2addr v5, v1

    .line 50
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    add-int/lit8 v1, v5, 0x3

    .line 57
    .line 58
    :cond_2
    move v5, v1

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 61
    .line 62
    shl-int/lit8 v1, v5, 0x2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :goto_2
    const/16 v1, 0xa

    .line 66
    .line 67
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_4

    .line 76
    .line 77
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-lez v6, :cond_4

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 84
    .line 85
    .line 86
    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    const v7, 0xbb80

    .line 91
    .line 92
    .line 93
    const v9, 0xac44

    .line 94
    .line 95
    .line 96
    const/4 v10, 0x1

    .line 97
    if-eq v10, v6, :cond_5

    .line 98
    .line 99
    move v6, v7

    .line 100
    move v7, v9

    .line 101
    goto :goto_3

    .line 102
    :cond_5
    move v6, v7

    .line 103
    :goto_3
    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-ne v7, v9, :cond_7

    .line 108
    .line 109
    const/16 v9, 0xd

    .line 110
    .line 111
    if-ne p0, v9, :cond_7

    .line 112
    .line 113
    sget-object p0, Lcom/google/android/gms/internal/ads/zzafd;->zzb:[I

    .line 114
    .line 115
    aget v2, p0, v9

    .line 116
    .line 117
    :cond_6
    :goto_4
    move v9, v2

    .line 118
    goto :goto_6

    .line 119
    :cond_7
    if-ne v7, v6, :cond_6

    .line 120
    .line 121
    const/16 v6, 0xe

    .line 122
    .line 123
    if-ge p0, v6, :cond_6

    .line 124
    .line 125
    sget-object v2, Lcom/google/android/gms/internal/ads/zzafd;->zzb:[I

    .line 126
    .line 127
    aget v2, v2, p0

    .line 128
    .line 129
    rem-int/lit8 v1, v1, 0x5

    .line 130
    .line 131
    const/16 v6, 0x8

    .line 132
    .line 133
    if-eq v1, v10, :cond_b

    .line 134
    .line 135
    const/16 v9, 0xb

    .line 136
    .line 137
    if-eq v1, v0, :cond_a

    .line 138
    .line 139
    if-eq v1, v4, :cond_b

    .line 140
    .line 141
    if-eq v1, v3, :cond_8

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_8
    if-eq p0, v4, :cond_9

    .line 145
    .line 146
    if-eq p0, v6, :cond_9

    .line 147
    .line 148
    if-ne p0, v9, :cond_6

    .line 149
    .line 150
    :cond_9
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_a
    if-eq p0, v6, :cond_9

    .line 154
    .line 155
    if-ne p0, v9, :cond_6

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_b
    if-eq p0, v4, :cond_9

    .line 159
    .line 160
    if-ne p0, v6, :cond_6

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :goto_6
    new-instance v4, Lcom/google/android/gms/internal/ads/zzafc;

    .line 164
    .line 165
    const/4 v6, 0x2

    .line 166
    const/4 v10, 0x0

    .line 167
    invoke-direct/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/zzafc;-><init>(IIIII[B)V

    .line 168
    .line 169
    .line 170
    return-object v4
.end method

.method public static zzc(ILcom/google/android/gms/internal/ads/zzeu;)V
    .locals 2

    .line 1
    const/4 v0, 0x7

    .line 2
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    const/16 v1, -0x54

    .line 11
    .line 12
    aput-byte v1, p1, v0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    const/16 v1, 0x40

    .line 16
    .line 17
    aput-byte v1, p1, v0

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    const/4 v1, -0x1

    .line 21
    aput-byte v1, p1, v0

    .line 22
    .line 23
    const/4 v0, 0x3

    .line 24
    aput-byte v1, p1, v0

    .line 25
    .line 26
    shr-int/lit8 v0, p0, 0x10

    .line 27
    .line 28
    and-int/lit16 v0, v0, 0xff

    .line 29
    .line 30
    int-to-byte v0, v0

    .line 31
    const/4 v1, 0x4

    .line 32
    aput-byte v0, p1, v1

    .line 33
    .line 34
    shr-int/lit8 v0, p0, 0x8

    .line 35
    .line 36
    and-int/lit16 v0, v0, 0xff

    .line 37
    .line 38
    int-to-byte v0, v0

    .line 39
    const/4 v1, 0x5

    .line 40
    aput-byte v0, p1, v1

    .line 41
    .line 42
    and-int/lit16 p0, p0, 0xff

    .line 43
    .line 44
    int-to-byte p0, p0

    .line 45
    const/4 v0, 0x6

    .line 46
    aput-byte p0, p1, v0

    .line 47
    .line 48
    return-void
.end method

.method private static zzd(Lcom/google/android/gms/internal/ads/zzet;Lcom/google/android/gms/internal/ads/zzafb;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x2

    .line 7
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v0, 0x7

    .line 20
    if-lt v1, v0, :cond_1

    .line 21
    .line 22
    const/16 v0, 0xa

    .line 23
    .line 24
    if-gt v1, v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_4

    .line 34
    .line 35
    const/4 v0, 0x3

    .line 36
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p1, Lcom/google/android/gms/internal/ads/zzafb;->zzb:I

    .line 41
    .line 42
    const/4 v3, -0x1

    .line 43
    if-ne v2, v3, :cond_3

    .line 44
    .line 45
    if-ltz v1, :cond_3

    .line 46
    .line 47
    const/16 v2, 0xf

    .line 48
    .line 49
    if-gt v1, v2, :cond_3

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    if-ne v0, v2, :cond_3

    .line 55
    .line 56
    :cond_2
    iput v1, p1, Lcom/google/android/gms/internal/ads/zzafb;->zzb:I

    .line 57
    .line 58
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzafd;->zzf(Lcom/google/android/gms/internal/ads/zzet;)V

    .line 65
    .line 66
    .line 67
    :cond_4
    return-void
.end method

.method private static zze(Lcom/google/android/gms/internal/ads/zzet;Lcom/google/android/gms/internal/ads/zzafb;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x8

    .line 10
    .line 11
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    if-ge v3, v2, :cond_4

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    const/4 v4, 0x5

    .line 28
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 29
    .line 30
    .line 31
    :cond_0
    if-eqz v1, :cond_1

    .line 32
    .line 33
    const/16 v4, 0x18

    .line 34
    .line 35
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/4 v5, 0x4

    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-nez v4, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 53
    .line 54
    .line 55
    :cond_2
    const/4 v4, 0x6

    .line 56
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    add-int/lit8 v4, v4, 0x1

    .line 61
    .line 62
    iput v4, p1, Lcom/google/android/gms/internal/ads/zzafb;->zzc:I

    .line 63
    .line 64
    :cond_3
    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 65
    .line 66
    .line 67
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    const/4 p1, 0x3

    .line 77
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_5

    .line 85
    .line 86
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzafd;->zzf(Lcom/google/android/gms/internal/ads/zzet;)V

    .line 87
    .line 88
    .line 89
    :cond_5
    return-void
.end method

.method private static zzf(Lcom/google/android/gms/internal/ads/zzet;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/4 v1, 0x2

    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    const/16 v1, 0x2a

    .line 10
    .line 11
    if-gt v0, v1, :cond_0

    .line 12
    .line 13
    mul-int/lit8 v0, v0, 0x8

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const/4 v0, 0x1

    .line 24
    new-array v0, v0, [Ljava/lang/Object;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    aput-object p0, v0, v1

    .line 28
    .line 29
    const-string p0, "Invalid language tag bytes number: %d. Must be between 2 and 42."

    .line 30
    .line 31
    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    throw p0
.end method

.method private static zzg(Lcom/google/android/gms/internal/ads/zzet;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzc()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x42

    .line 6
    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_0
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0
.end method
