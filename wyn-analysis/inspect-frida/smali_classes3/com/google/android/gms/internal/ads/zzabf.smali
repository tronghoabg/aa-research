.class public abstract Lcom/google/android/gms/internal/ads/zzabf;
.super Lcom/google/android/gms/internal/ads/zzabi;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzabi;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract zzh(Lcom/google/android/gms/internal/ads/zzabe;[[[I[ILcom/google/android/gms/internal/ads/zzxl;Lcom/google/android/gms/internal/ads/zzbf;)Landroid/util/Pair;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation
.end method

.method public final zzq(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzabe;

    .line 2
    .line 3
    return-void
.end method

.method public final zzr([Lcom/google/android/gms/internal/ads/zzne;Lcom/google/android/gms/internal/ads/zzzo;Lcom/google/android/gms/internal/ads/zzxl;Lcom/google/android/gms/internal/ads/zzbf;)Lcom/google/android/gms/internal/ads/zzabj;
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    new-array v2, v1, [I

    .line 5
    .line 6
    new-array v3, v1, [[Lcom/google/android/gms/internal/ads/zzbg;

    .line 7
    .line 8
    new-array v6, v1, [[[I

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    :goto_0
    if-ge v4, v1, :cond_0

    .line 12
    .line 13
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzzo;->zzb:I

    .line 14
    .line 15
    new-array v7, v5, [Lcom/google/android/gms/internal/ads/zzbg;

    .line 16
    .line 17
    aput-object v7, v3, v4

    .line 18
    .line 19
    new-array v5, v5, [[I

    .line 20
    .line 21
    aput-object v5, v6, v4

    .line 22
    .line 23
    add-int/lit8 v4, v4, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x2

    .line 27
    new-array v7, v1, [I

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    :goto_1
    if-ge v4, v1, :cond_1

    .line 31
    .line 32
    aget-object v5, p1, v4

    .line 33
    .line 34
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzne;->zzu()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    aput v5, v7, v4

    .line 39
    .line 40
    add-int/lit8 v4, v4, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/4 v4, 0x0

    .line 44
    :goto_2
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzzo;->zzb:I

    .line 45
    .line 46
    if-ge v4, v5, :cond_9

    .line 47
    .line 48
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzzo;->zza(I)Lcom/google/android/gms/internal/ads/zzbg;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    iget v8, v5, Lcom/google/android/gms/internal/ads/zzbg;->zzc:I

    .line 53
    .line 54
    move v10, v1

    .line 55
    const/4 v9, 0x0

    .line 56
    const/4 v13, 0x0

    .line 57
    const/4 v14, 0x1

    .line 58
    :goto_3
    if-ge v9, v1, :cond_6

    .line 59
    .line 60
    aget-object v15, p1, v9

    .line 61
    .line 62
    const/4 v11, 0x0

    .line 63
    const/4 v12, 0x0

    .line 64
    const/16 v16, 0x1

    .line 65
    .line 66
    :goto_4
    iget v1, v5, Lcom/google/android/gms/internal/ads/zzbg;->zza:I

    .line 67
    .line 68
    if-ge v12, v1, :cond_2

    .line 69
    .line 70
    invoke-virtual {v5, v12}, Lcom/google/android/gms/internal/ads/zzbg;->zza(I)Lcom/google/android/gms/internal/ads/zzv;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-interface {v15, v1}, Lcom/google/android/gms/internal/ads/zzne;->zzae(Lcom/google/android/gms/internal/ads/zzv;)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    and-int/lit8 v1, v1, 0x7

    .line 79
    .line 80
    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    add-int/lit8 v12, v12, 0x1

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_2
    aget v1, v2, v9

    .line 88
    .line 89
    if-nez v1, :cond_3

    .line 90
    .line 91
    move/from16 v1, v16

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_3
    const/4 v1, 0x0

    .line 95
    :goto_5
    if-gt v11, v13, :cond_4

    .line 96
    .line 97
    if-ne v11, v13, :cond_5

    .line 98
    .line 99
    const/4 v12, 0x5

    .line 100
    if-ne v8, v12, :cond_5

    .line 101
    .line 102
    if-nez v14, :cond_5

    .line 103
    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    move v10, v9

    .line 107
    move v13, v11

    .line 108
    move/from16 v14, v16

    .line 109
    .line 110
    goto :goto_6

    .line 111
    :cond_4
    move v14, v1

    .line 112
    move v10, v9

    .line 113
    move v13, v11

    .line 114
    :cond_5
    :goto_6
    add-int/lit8 v9, v9, 0x1

    .line 115
    .line 116
    const/4 v1, 0x2

    .line 117
    goto :goto_3

    .line 118
    :cond_6
    const/16 v16, 0x1

    .line 119
    .line 120
    if-ne v10, v1, :cond_7

    .line 121
    .line 122
    iget v1, v5, Lcom/google/android/gms/internal/ads/zzbg;->zza:I

    .line 123
    .line 124
    new-array v1, v1, [I

    .line 125
    .line 126
    goto :goto_8

    .line 127
    :cond_7
    aget-object v1, p1, v10

    .line 128
    .line 129
    iget v8, v5, Lcom/google/android/gms/internal/ads/zzbg;->zza:I

    .line 130
    .line 131
    new-array v9, v8, [I

    .line 132
    .line 133
    const/4 v11, 0x0

    .line 134
    :goto_7
    if-ge v11, v8, :cond_8

    .line 135
    .line 136
    invoke-virtual {v5, v11}, Lcom/google/android/gms/internal/ads/zzbg;->zza(I)Lcom/google/android/gms/internal/ads/zzv;

    .line 137
    .line 138
    .line 139
    move-result-object v12

    .line 140
    invoke-interface {v1, v12}, Lcom/google/android/gms/internal/ads/zzne;->zzae(Lcom/google/android/gms/internal/ads/zzv;)I

    .line 141
    .line 142
    .line 143
    move-result v12

    .line 144
    aput v12, v9, v11

    .line 145
    .line 146
    add-int/lit8 v11, v11, 0x1

    .line 147
    .line 148
    goto :goto_7

    .line 149
    :cond_8
    move-object v1, v9

    .line 150
    :goto_8
    aget v8, v2, v10

    .line 151
    .line 152
    aget-object v9, v3, v10

    .line 153
    .line 154
    aput-object v5, v9, v8

    .line 155
    .line 156
    aget-object v5, v6, v10

    .line 157
    .line 158
    aput-object v1, v5, v8

    .line 159
    .line 160
    add-int/lit8 v8, v8, 0x1

    .line 161
    .line 162
    aput v8, v2, v10

    .line 163
    .line 164
    add-int/lit8 v4, v4, 0x1

    .line 165
    .line 166
    const/4 v1, 0x2

    .line 167
    goto :goto_2

    .line 168
    :cond_9
    const/16 v16, 0x1

    .line 169
    .line 170
    new-array v0, v1, [Lcom/google/android/gms/internal/ads/zzzo;

    .line 171
    .line 172
    new-array v5, v1, [Ljava/lang/String;

    .line 173
    .line 174
    move-object v9, v6

    .line 175
    new-array v6, v1, [I

    .line 176
    .line 177
    const/4 v4, 0x0

    .line 178
    :goto_9
    if-ge v4, v1, :cond_a

    .line 179
    .line 180
    aget v1, v2, v4

    .line 181
    .line 182
    new-instance v8, Lcom/google/android/gms/internal/ads/zzzo;

    .line 183
    .line 184
    aget-object v10, v3, v4

    .line 185
    .line 186
    invoke-static {v10, v1}, Lcom/google/android/gms/internal/ads/zzfm;->zzb([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    check-cast v10, [Lcom/google/android/gms/internal/ads/zzbg;

    .line 191
    .line 192
    invoke-direct {v8, v10}, Lcom/google/android/gms/internal/ads/zzzo;-><init>([Lcom/google/android/gms/internal/ads/zzbg;)V

    .line 193
    .line 194
    .line 195
    aput-object v8, v0, v4

    .line 196
    .line 197
    aget-object v8, v9, v4

    .line 198
    .line 199
    invoke-static {v8, v1}, Lcom/google/android/gms/internal/ads/zzfm;->zzb([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    check-cast v1, [[I

    .line 204
    .line 205
    aput-object v1, v9, v4

    .line 206
    .line 207
    aget-object v1, p1, v4

    .line 208
    .line 209
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzne;->zzV()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    aput-object v1, v5, v4

    .line 214
    .line 215
    aget-object v1, p1, v4

    .line 216
    .line 217
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzne;->zza()I

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    aput v1, v6, v4

    .line 222
    .line 223
    add-int/lit8 v4, v4, 0x1

    .line 224
    .line 225
    const/4 v1, 0x2

    .line 226
    goto :goto_9

    .line 227
    :cond_a
    move/from16 v17, v1

    .line 228
    .line 229
    aget v1, v2, v17

    .line 230
    .line 231
    new-instance v10, Lcom/google/android/gms/internal/ads/zzzo;

    .line 232
    .line 233
    aget-object v2, v3, v17

    .line 234
    .line 235
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzfm;->zzb([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    check-cast v1, [Lcom/google/android/gms/internal/ads/zzbg;

    .line 240
    .line 241
    invoke-direct {v10, v1}, Lcom/google/android/gms/internal/ads/zzzo;-><init>([Lcom/google/android/gms/internal/ads/zzbg;)V

    .line 242
    .line 243
    .line 244
    new-instance v4, Lcom/google/android/gms/internal/ads/zzabe;

    .line 245
    .line 246
    move-object v8, v7

    .line 247
    move-object v7, v0

    .line 248
    invoke-direct/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/zzabe;-><init>([Ljava/lang/String;[I[Lcom/google/android/gms/internal/ads/zzzo;[I[[[ILcom/google/android/gms/internal/ads/zzzo;)V

    .line 249
    .line 250
    .line 251
    move-object v5, v4

    .line 252
    move-object v7, v8

    .line 253
    move-object v6, v9

    .line 254
    move-object/from16 v4, p0

    .line 255
    .line 256
    move-object/from16 v8, p3

    .line 257
    .line 258
    move-object/from16 v9, p4

    .line 259
    .line 260
    invoke-virtual/range {v4 .. v9}, Lcom/google/android/gms/internal/ads/zzabf;->zzh(Lcom/google/android/gms/internal/ads/zzabe;[[[I[ILcom/google/android/gms/internal/ads/zzxl;Lcom/google/android/gms/internal/ads/zzbf;)Landroid/util/Pair;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    move-object v4, v5

    .line 265
    iget-object v1, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v1, [Lcom/google/android/gms/internal/ads/zzabg;

    .line 268
    .line 269
    array-length v2, v1

    .line 270
    new-array v3, v2, [Ljava/util/List;

    .line 271
    .line 272
    const/4 v5, 0x0

    .line 273
    :goto_a
    array-length v6, v1

    .line 274
    if-ge v5, v6, :cond_c

    .line 275
    .line 276
    aget-object v6, v1, v5

    .line 277
    .line 278
    if-eqz v6, :cond_b

    .line 279
    .line 280
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    goto :goto_b

    .line 285
    :cond_b
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgwt;->zzi()Lcom/google/android/gms/internal/ads/zzgwt;

    .line 286
    .line 287
    .line 288
    move-result-object v6

    .line 289
    :goto_b
    aput-object v6, v3, v5

    .line 290
    .line 291
    add-int/lit8 v5, v5, 0x1

    .line 292
    .line 293
    goto :goto_a

    .line 294
    :cond_c
    new-instance v1, Lcom/google/android/gms/internal/ads/zzgwq;

    .line 295
    .line 296
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzgwq;-><init>()V

    .line 297
    .line 298
    .line 299
    const/4 v6, 0x0

    .line 300
    :goto_c
    const/4 v5, 0x2

    .line 301
    if-ge v6, v5, :cond_13

    .line 302
    .line 303
    invoke-virtual {v4, v6}, Lcom/google/android/gms/internal/ads/zzabe;->zzb(I)Lcom/google/android/gms/internal/ads/zzzo;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    const/4 v8, 0x0

    .line 308
    :goto_d
    iget v9, v7, Lcom/google/android/gms/internal/ads/zzzo;->zzb:I

    .line 309
    .line 310
    if-ge v8, v9, :cond_12

    .line 311
    .line 312
    invoke-virtual {v7, v8}, Lcom/google/android/gms/internal/ads/zzzo;->zza(I)Lcom/google/android/gms/internal/ads/zzbg;

    .line 313
    .line 314
    .line 315
    move-result-object v9

    .line 316
    const/4 v10, 0x0

    .line 317
    invoke-virtual {v4, v6, v8, v10}, Lcom/google/android/gms/internal/ads/zzabe;->zzd(IIZ)I

    .line 318
    .line 319
    .line 320
    move-result v11

    .line 321
    if-eqz v11, :cond_d

    .line 322
    .line 323
    move/from16 v10, v16

    .line 324
    .line 325
    goto :goto_e

    .line 326
    :cond_d
    const/4 v10, 0x0

    .line 327
    :goto_e
    iget v11, v9, Lcom/google/android/gms/internal/ads/zzbg;->zza:I

    .line 328
    .line 329
    new-array v12, v11, [I

    .line 330
    .line 331
    new-array v13, v11, [Z

    .line 332
    .line 333
    const/4 v14, 0x0

    .line 334
    :goto_f
    if-ge v14, v11, :cond_11

    .line 335
    .line 336
    invoke-virtual {v4, v6, v8, v14}, Lcom/google/android/gms/internal/ads/zzabe;->zzc(III)I

    .line 337
    .line 338
    .line 339
    move-result v15

    .line 340
    and-int/lit8 v15, v15, 0x7

    .line 341
    .line 342
    aput v15, v12, v14

    .line 343
    .line 344
    const/4 v15, 0x0

    .line 345
    const/16 v17, 0x0

    .line 346
    .line 347
    :goto_10
    if-ge v15, v2, :cond_10

    .line 348
    .line 349
    aget-object v5, v3, v15

    .line 350
    .line 351
    move/from16 p2, v2

    .line 352
    .line 353
    move-object/from16 p3, v3

    .line 354
    .line 355
    const/4 v2, 0x0

    .line 356
    :goto_11
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    if-ge v2, v3, :cond_f

    .line 361
    .line 362
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    check-cast v3, Lcom/google/android/gms/internal/ads/zzabg;

    .line 367
    .line 368
    move/from16 p4, v2

    .line 369
    .line 370
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzabg;->zza()Lcom/google/android/gms/internal/ads/zzbg;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/ads/zzbg;->equals(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    if-eqz v2, :cond_e

    .line 379
    .line 380
    invoke-interface {v3, v14}, Lcom/google/android/gms/internal/ads/zzabg;->zzg(I)I

    .line 381
    .line 382
    .line 383
    move-result v2

    .line 384
    const/4 v3, -0x1

    .line 385
    if-eq v2, v3, :cond_e

    .line 386
    .line 387
    move/from16 v17, v16

    .line 388
    .line 389
    goto :goto_12

    .line 390
    :cond_e
    add-int/lit8 v2, p4, 0x1

    .line 391
    .line 392
    goto :goto_11

    .line 393
    :cond_f
    :goto_12
    add-int/lit8 v15, v15, 0x1

    .line 394
    .line 395
    move/from16 v2, p2

    .line 396
    .line 397
    move-object/from16 v3, p3

    .line 398
    .line 399
    const/4 v5, 0x2

    .line 400
    goto :goto_10

    .line 401
    :cond_10
    move/from16 p2, v2

    .line 402
    .line 403
    move-object/from16 p3, v3

    .line 404
    .line 405
    aput-boolean v17, v13, v14

    .line 406
    .line 407
    add-int/lit8 v14, v14, 0x1

    .line 408
    .line 409
    const/4 v5, 0x2

    .line 410
    goto :goto_f

    .line 411
    :cond_11
    move/from16 p2, v2

    .line 412
    .line 413
    move-object/from16 p3, v3

    .line 414
    .line 415
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbm;

    .line 416
    .line 417
    invoke-direct {v2, v9, v10, v12, v13}, Lcom/google/android/gms/internal/ads/zzbm;-><init>(Lcom/google/android/gms/internal/ads/zzbg;Z[I[Z)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzgwq;->zzf(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwq;

    .line 421
    .line 422
    .line 423
    add-int/lit8 v8, v8, 0x1

    .line 424
    .line 425
    move/from16 v2, p2

    .line 426
    .line 427
    const/4 v5, 0x2

    .line 428
    goto :goto_d

    .line 429
    :cond_12
    move/from16 p2, v2

    .line 430
    .line 431
    move-object/from16 p3, v3

    .line 432
    .line 433
    add-int/lit8 v6, v6, 0x1

    .line 434
    .line 435
    goto/16 :goto_c

    .line 436
    .line 437
    :cond_13
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzabe;->zze()Lcom/google/android/gms/internal/ads/zzzo;

    .line 438
    .line 439
    .line 440
    move-result-object v2

    .line 441
    const/4 v10, 0x0

    .line 442
    :goto_13
    iget v3, v2, Lcom/google/android/gms/internal/ads/zzzo;->zzb:I

    .line 443
    .line 444
    if-ge v10, v3, :cond_14

    .line 445
    .line 446
    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/ads/zzzo;->zza(I)Lcom/google/android/gms/internal/ads/zzbg;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    iget v5, v3, Lcom/google/android/gms/internal/ads/zzbg;->zza:I

    .line 451
    .line 452
    new-array v6, v5, [I

    .line 453
    .line 454
    const/4 v7, 0x0

    .line 455
    invoke-static {v6, v7}, Ljava/util/Arrays;->fill([II)V

    .line 456
    .line 457
    .line 458
    new-array v5, v5, [Z

    .line 459
    .line 460
    new-instance v8, Lcom/google/android/gms/internal/ads/zzbm;

    .line 461
    .line 462
    invoke-direct {v8, v3, v7, v6, v5}, Lcom/google/android/gms/internal/ads/zzbm;-><init>(Lcom/google/android/gms/internal/ads/zzbg;Z[I[Z)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v1, v8}, Lcom/google/android/gms/internal/ads/zzgwq;->zzf(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwq;

    .line 466
    .line 467
    .line 468
    add-int/lit8 v10, v10, 0x1

    .line 469
    .line 470
    goto :goto_13

    .line 471
    :cond_14
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbn;

    .line 472
    .line 473
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzgwq;->zzi()Lcom/google/android/gms/internal/ads/zzgwt;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/ads/zzbn;-><init>(Ljava/util/List;)V

    .line 478
    .line 479
    .line 480
    new-instance v1, Lcom/google/android/gms/internal/ads/zzabj;

    .line 481
    .line 482
    iget-object v3, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast v3, [Lcom/google/android/gms/internal/ads/zznf;

    .line 485
    .line 486
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v0, [Lcom/google/android/gms/internal/ads/zzabb;

    .line 489
    .line 490
    invoke-direct {v1, v3, v0, v2, v4}, Lcom/google/android/gms/internal/ads/zzabj;-><init>([Lcom/google/android/gms/internal/ads/zznf;[Lcom/google/android/gms/internal/ads/zzabb;Lcom/google/android/gms/internal/ads/zzbn;Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    return-object v1
.end method
