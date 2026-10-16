.class public final Lcom/google/android/gms/internal/ads/zzafe;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final zza:I

.field public final zzb:I

.field public final zzc:I

.field public final zzd:I

.field public final zze:Ljava/lang/String;


# direct methods
.method private constructor <init>(ILjava/lang/String;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzafe;->zza:I

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzafe;->zze:Ljava/lang/String;

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzafe;->zzb:I

    iput p4, p0, Lcom/google/android/gms/internal/ads/zzafe;->zzc:I

    iput p5, p0, Lcom/google/android/gms/internal/ads/zzafe;->zzd:I

    return-void
.end method

.method public static zza([B)Lcom/google/android/gms/internal/ads/zzafe;
    .locals 22
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    const-string v3, "%02d"

    .line 5
    .line 6
    const-string v4, "Unsupported obu_type: "

    .line 7
    .line 8
    const-string v5, "Unsupported av1C version: "

    .line 9
    .line 10
    :try_start_0
    new-instance v6, Lcom/google/android/gms/internal/ads/zzet;

    .line 11
    .line 12
    array-length v7, v0

    .line 13
    invoke-direct {v6, v0, v7}, Lcom/google/android/gms/internal/ads/zzet;-><init>([BI)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x7

    .line 20
    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 21
    .line 22
    .line 23
    move-result v7
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    const-string v8, "Av1Config"

    .line 25
    .line 26
    if-eq v7, v2, :cond_0

    .line 27
    .line 28
    :try_start_1
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    add-int/lit8 v0, v0, 0x1a

    .line 37
    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    return-object v0

    .line 58
    :cond_0
    const/4 v5, 0x3

    .line 59
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    const/4 v9, 0x5

    .line 64
    invoke-virtual {v6, v9}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 65
    .line 66
    .line 67
    move-result v10

    .line 68
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 73
    .line 74
    .line 75
    move-result v12

    .line 76
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 77
    .line 78
    .line 79
    move-result v13

    .line 80
    const/16 v15, 0x8

    .line 81
    .line 82
    if-eqz v12, :cond_2

    .line 83
    .line 84
    if-eq v2, v13, :cond_1

    .line 85
    .line 86
    const/16 v12, 0xa

    .line 87
    .line 88
    move/from16 v17, v12

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    const/16 v17, 0xc

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    move/from16 v17, v15

    .line 95
    .line 96
    :goto_0
    const/16 v12, 0xd

    .line 97
    .line 98
    invoke-virtual {v6, v12}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 99
    .line 100
    .line 101
    const-string v13, "av01."

    .line 102
    .line 103
    const/16 v16, 0x0

    .line 104
    .line 105
    const-string v1, "."

    .line 106
    .line 107
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    new-array v12, v2, [Ljava/lang/Object;

    .line 112
    .line 113
    aput-object v10, v12, v16

    .line 114
    .line 115
    sget-object v10, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 116
    .line 117
    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 118
    .line 119
    invoke-static {v10, v3, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v12

    .line 123
    const-string v18, "H"

    .line 124
    .line 125
    const-string v19, "M"

    .line 126
    .line 127
    if-eq v2, v11, :cond_3

    .line 128
    .line 129
    move-object/from16 v11, v19

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    move-object/from16 v11, v18

    .line 133
    .line 134
    :goto_1
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v18

    .line 138
    new-array v0, v2, [Ljava/lang/Object;

    .line 139
    .line 140
    aput-object v18, v0, v16

    .line 141
    .line 142
    invoke-static {v10, v3, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    add-int/lit8 v3, v3, 0x6

    .line 155
    .line 156
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 157
    .line 158
    .line 159
    move-result v10

    .line 160
    add-int/2addr v3, v10

    .line 161
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 162
    .line 163
    .line 164
    move-result v10

    .line 165
    const/4 v14, 0x2

    .line 166
    add-int/2addr v3, v14

    .line 167
    add-int/2addr v3, v10

    .line 168
    new-instance v10, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {v10, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzc()I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-gtz v1, :cond_4

    .line 203
    .line 204
    new-instance v16, Lcom/google/android/gms/internal/ads/zzafe;

    .line 205
    .line 206
    const/16 v20, -0x1

    .line 207
    .line 208
    const/16 v21, -0x1

    .line 209
    .line 210
    const/16 v19, -0x1

    .line 211
    .line 212
    move-object/from16 v18, v0

    .line 213
    .line 214
    invoke-direct/range {v16 .. v21}, Lcom/google/android/gms/internal/ads/zzafe;-><init>(ILjava/lang/String;III)V

    .line 215
    .line 216
    .line 217
    return-object v16

    .line 218
    :cond_4
    move-object/from16 v18, v0

    .line 219
    .line 220
    const/16 v0, 0xc

    .line 221
    .line 222
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 223
    .line 224
    .line 225
    const/4 v1, 0x4

    .line 226
    invoke-virtual {v6, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    if-eq v3, v2, :cond_5

    .line 231
    .line 232
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    add-int/lit8 v0, v0, 0x16

    .line 241
    .line 242
    new-instance v1, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzb(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    new-instance v16, Lcom/google/android/gms/internal/ads/zzafe;

    .line 261
    .line 262
    const/16 v20, -0x1

    .line 263
    .line 264
    const/16 v21, -0x1

    .line 265
    .line 266
    const/16 v19, -0x1

    .line 267
    .line 268
    invoke-direct/range {v16 .. v21}, Lcom/google/android/gms/internal/ads/zzafe;-><init>(ILjava/lang/String;III)V

    .line 269
    .line 270
    .line 271
    return-object v16

    .line 272
    :cond_5
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    if-eqz v3, :cond_6

    .line 277
    .line 278
    const-string v0, "Unsupported obu_extension_flag"

    .line 279
    .line 280
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzb(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    new-instance v16, Lcom/google/android/gms/internal/ads/zzafe;

    .line 284
    .line 285
    const/16 v20, -0x1

    .line 286
    .line 287
    const/16 v21, -0x1

    .line 288
    .line 289
    const/16 v19, -0x1

    .line 290
    .line 291
    invoke-direct/range {v16 .. v21}, Lcom/google/android/gms/internal/ads/zzafe;-><init>(ILjava/lang/String;III)V

    .line 292
    .line 293
    .line 294
    return-object v16

    .line 295
    :cond_6
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 296
    .line 297
    .line 298
    move-result v3

    .line 299
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 300
    .line 301
    .line 302
    if-eqz v3, :cond_7

    .line 303
    .line 304
    invoke-virtual {v6, v15}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 305
    .line 306
    .line 307
    move-result v3

    .line 308
    const/16 v4, 0x7f

    .line 309
    .line 310
    if-le v3, v4, :cond_7

    .line 311
    .line 312
    const-string v0, "Excessive obu_size"

    .line 313
    .line 314
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzb(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    new-instance v16, Lcom/google/android/gms/internal/ads/zzafe;

    .line 318
    .line 319
    const/16 v20, -0x1

    .line 320
    .line 321
    const/16 v21, -0x1

    .line 322
    .line 323
    const/16 v19, -0x1

    .line 324
    .line 325
    invoke-direct/range {v16 .. v21}, Lcom/google/android/gms/internal/ads/zzafe;-><init>(ILjava/lang/String;III)V

    .line 326
    .line 327
    .line 328
    return-object v16

    .line 329
    :cond_7
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    if-eqz v4, :cond_8

    .line 341
    .line 342
    const-string v0, "Unsupported reduced_still_picture_header"

    .line 343
    .line 344
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzb(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    new-instance v16, Lcom/google/android/gms/internal/ads/zzafe;

    .line 348
    .line 349
    const/16 v20, -0x1

    .line 350
    .line 351
    const/16 v21, -0x1

    .line 352
    .line 353
    const/16 v19, -0x1

    .line 354
    .line 355
    invoke-direct/range {v16 .. v21}, Lcom/google/android/gms/internal/ads/zzafe;-><init>(ILjava/lang/String;III)V

    .line 356
    .line 357
    .line 358
    return-object v16

    .line 359
    :cond_8
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 360
    .line 361
    .line 362
    move-result v4

    .line 363
    if-eqz v4, :cond_9

    .line 364
    .line 365
    const-string v0, "Unsupported timing_info_present_flag"

    .line 366
    .line 367
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzb(Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    new-instance v16, Lcom/google/android/gms/internal/ads/zzafe;

    .line 371
    .line 372
    const/16 v20, -0x1

    .line 373
    .line 374
    const/16 v21, -0x1

    .line 375
    .line 376
    const/16 v19, -0x1

    .line 377
    .line 378
    invoke-direct/range {v16 .. v21}, Lcom/google/android/gms/internal/ads/zzafe;-><init>(ILjava/lang/String;III)V

    .line 379
    .line 380
    .line 381
    return-object v16

    .line 382
    :cond_9
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 383
    .line 384
    .line 385
    move-result v4

    .line 386
    if-eqz v4, :cond_a

    .line 387
    .line 388
    const-string v0, "Unsupported initial_display_delay_present_flag"

    .line 389
    .line 390
    invoke-static {v8, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzb(Ljava/lang/String;Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    new-instance v16, Lcom/google/android/gms/internal/ads/zzafe;

    .line 394
    .line 395
    const/16 v20, -0x1

    .line 396
    .line 397
    const/16 v21, -0x1

    .line 398
    .line 399
    const/16 v19, -0x1

    .line 400
    .line 401
    invoke-direct/range {v16 .. v21}, Lcom/google/android/gms/internal/ads/zzafe;-><init>(ILjava/lang/String;III)V

    .line 402
    .line 403
    .line 404
    return-object v16

    .line 405
    :cond_a
    invoke-virtual {v6, v9}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 406
    .line 407
    .line 408
    move-result v4

    .line 409
    move/from16 v7, v16

    .line 410
    .line 411
    :goto_2
    if-gt v7, v4, :cond_c

    .line 412
    .line 413
    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v6, v9}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 417
    .line 418
    .line 419
    move-result v8

    .line 420
    const/4 v10, 0x7

    .line 421
    if-le v8, v10, :cond_b

    .line 422
    .line 423
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 424
    .line 425
    .line 426
    :cond_b
    add-int/2addr v7, v2

    .line 427
    goto :goto_2

    .line 428
    :cond_c
    invoke-virtual {v6, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 429
    .line 430
    .line 431
    move-result v0

    .line 432
    invoke-virtual {v6, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 433
    .line 434
    .line 435
    move-result v1

    .line 436
    add-int/2addr v0, v2

    .line 437
    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 438
    .line 439
    .line 440
    add-int/2addr v1, v2

    .line 441
    invoke-virtual {v6, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 445
    .line 446
    .line 447
    move-result v0

    .line 448
    if-eqz v0, :cond_d

    .line 449
    .line 450
    const/4 v10, 0x7

    .line 451
    invoke-virtual {v6, v10}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 452
    .line 453
    .line 454
    goto :goto_3

    .line 455
    :cond_d
    const/4 v10, 0x7

    .line 456
    :goto_3
    invoke-virtual {v6, v10}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    if-eqz v0, :cond_e

    .line 464
    .line 465
    invoke-virtual {v6, v14}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 466
    .line 467
    .line 468
    :cond_e
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 469
    .line 470
    .line 471
    move-result v1

    .line 472
    if-eqz v1, :cond_f

    .line 473
    .line 474
    goto :goto_4

    .line 475
    :cond_f
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 476
    .line 477
    .line 478
    move-result v1

    .line 479
    if-lez v1, :cond_10

    .line 480
    .line 481
    :goto_4
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 482
    .line 483
    .line 484
    move-result v1

    .line 485
    if-nez v1, :cond_10

    .line 486
    .line 487
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 488
    .line 489
    .line 490
    :cond_10
    if-eqz v0, :cond_11

    .line 491
    .line 492
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 493
    .line 494
    .line 495
    :cond_11
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 499
    .line 500
    .line 501
    move-result v0

    .line 502
    if-ne v3, v14, :cond_12

    .line 503
    .line 504
    if-eqz v0, :cond_14

    .line 505
    .line 506
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 507
    .line 508
    .line 509
    goto :goto_5

    .line 510
    :cond_12
    if-ne v3, v2, :cond_14

    .line 511
    .line 512
    :cond_13
    move/from16 v1, v16

    .line 513
    .line 514
    goto :goto_6

    .line 515
    :cond_14
    :goto_5
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 516
    .line 517
    .line 518
    move-result v0

    .line 519
    if-eqz v0, :cond_13

    .line 520
    .line 521
    move v1, v2

    .line 522
    :goto_6
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 523
    .line 524
    .line 525
    move-result v0

    .line 526
    if-nez v0, :cond_15

    .line 527
    .line 528
    new-instance v16, Lcom/google/android/gms/internal/ads/zzafe;

    .line 529
    .line 530
    const/16 v20, -0x1

    .line 531
    .line 532
    const/16 v21, -0x1

    .line 533
    .line 534
    const/16 v19, -0x1

    .line 535
    .line 536
    invoke-direct/range {v16 .. v21}, Lcom/google/android/gms/internal/ads/zzafe;-><init>(ILjava/lang/String;III)V

    .line 537
    .line 538
    .line 539
    return-object v16

    .line 540
    :cond_15
    invoke-virtual {v6, v15}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 541
    .line 542
    .line 543
    move-result v0

    .line 544
    invoke-virtual {v6, v15}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 545
    .line 546
    .line 547
    move-result v3

    .line 548
    invoke-virtual {v6, v15}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 549
    .line 550
    .line 551
    move-result v4

    .line 552
    if-nez v1, :cond_18

    .line 553
    .line 554
    if-ne v0, v2, :cond_18

    .line 555
    .line 556
    const/16 v1, 0xd

    .line 557
    .line 558
    if-ne v3, v1, :cond_17

    .line 559
    .line 560
    if-nez v4, :cond_16

    .line 561
    .line 562
    move v12, v1

    .line 563
    move v0, v2

    .line 564
    move v1, v0

    .line 565
    goto :goto_8

    .line 566
    :cond_16
    move v12, v1

    .line 567
    move v0, v2

    .line 568
    goto :goto_7

    .line 569
    :cond_17
    move v0, v2

    .line 570
    :cond_18
    move v12, v3

    .line 571
    :goto_7
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 572
    .line 573
    .line 574
    move-result v1

    .line 575
    :goto_8
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzi;->zzb(I)I

    .line 576
    .line 577
    .line 578
    move-result v19

    .line 579
    if-ne v1, v2, :cond_19

    .line 580
    .line 581
    move/from16 v20, v2

    .line 582
    .line 583
    goto :goto_9

    .line 584
    :cond_19
    move/from16 v20, v14

    .line 585
    .line 586
    :goto_9
    invoke-static {v12}, Lcom/google/android/gms/internal/ads/zzi;->zzc(I)I

    .line 587
    .line 588
    .line 589
    move-result v21

    .line 590
    new-instance v16, Lcom/google/android/gms/internal/ads/zzafe;

    .line 591
    .line 592
    invoke-direct/range {v16 .. v21}, Lcom/google/android/gms/internal/ads/zzafe;-><init>(ILjava/lang/String;III)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 593
    .line 594
    .line 595
    return-object v16

    .line 596
    :catch_0
    move-exception v0

    .line 597
    const-string v1, "Error parsing AV1 config"

    .line 598
    .line 599
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    throw v0
.end method
