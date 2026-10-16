.class public final Lcom/google/android/gms/internal/ads/zzgv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final zza:Z

.field public final zzb:Z

.field public final zzc:Z

.field public final zzd:Z

.field public final zze:Z

.field public final zzf:I

.field public final zzg:I

.field public final zzh:Z

.field public final zzi:Z

.field public final zzj:Z

.field public final zzk:Z

.field public final zzl:B

.field public final zzm:B


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzgu;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzgt;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzgu;->zza:I

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    move v0, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v1

    .line 13
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgtr;->zza(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzgu;->zzb:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    new-array v3, v0, [B

    .line 23
    .line 24
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzgu;->zzb:Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    .line 33
    new-instance p1, Lcom/google/android/gms/internal/ads/zzet;

    .line 34
    .line 35
    invoke-direct {p1, v3, v0}, Lcom/google/android/gms/internal/ads/zzet;-><init>([BI)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x3

    .line 39
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzg:I

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzgv;->zza:Z

    .line 53
    .line 54
    const/4 v4, 0x5

    .line 55
    const/4 v5, 0x4

    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 59
    .line 60
    .line 61
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzb:Z

    .line 62
    .line 63
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzh:Z

    .line 64
    .line 65
    goto/16 :goto_7

    .line 66
    .line 67
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_4

    .line 72
    .line 73
    const/16 v3, 0x40

    .line 74
    .line 75
    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_3

    .line 83
    .line 84
    move v3, v1

    .line 85
    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-eqz v6, :cond_2

    .line 90
    .line 91
    const/16 v6, 0x20

    .line 92
    .line 93
    if-ge v3, v6, :cond_3

    .line 94
    .line 95
    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    :goto_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzb:Z

    .line 107
    .line 108
    if-eqz v3, :cond_5

    .line 109
    .line 110
    const/16 v3, 0x2f

    .line 111
    .line 112
    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_4
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzb:Z

    .line 117
    .line 118
    :cond_5
    :goto_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzh:Z

    .line 123
    .line 124
    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    move v6, v1

    .line 129
    :goto_4
    if-gt v6, v3, :cond_b

    .line 130
    .line 131
    const/16 v7, 0xc

    .line 132
    .line 133
    invoke-virtual {p1, v7}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 134
    .line 135
    .line 136
    const/4 v7, 0x7

    .line 137
    if-nez v6, :cond_6

    .line 138
    .line 139
    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 140
    .line 141
    .line 142
    move-result v8

    .line 143
    if-le v8, v7, :cond_7

    .line 144
    .line 145
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 146
    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_6
    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 150
    .line 151
    .line 152
    move-result v8

    .line 153
    if-le v8, v7, :cond_7

    .line 154
    .line 155
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 156
    .line 157
    .line 158
    :cond_7
    :goto_5
    iget-boolean v7, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzb:Z

    .line 159
    .line 160
    if-eqz v7, :cond_8

    .line 161
    .line 162
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 163
    .line 164
    .line 165
    :cond_8
    iget-boolean v7, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzh:Z

    .line 166
    .line 167
    if-eqz v7, :cond_a

    .line 168
    .line 169
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    if-eqz v7, :cond_a

    .line 174
    .line 175
    if-nez v6, :cond_9

    .line 176
    .line 177
    invoke-virtual {p1, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 178
    .line 179
    .line 180
    goto :goto_6

    .line 181
    :cond_9
    invoke-virtual {p1, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 182
    .line 183
    .line 184
    :cond_a
    :goto_6
    add-int/lit8 v6, v6, 0x1

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_b
    :goto_7
    invoke-virtual {p1, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    invoke-virtual {p1, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    add-int/2addr v3, v2

    .line 196
    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 197
    .line 198
    .line 199
    add-int/2addr v4, v2

    .line 200
    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 201
    .line 202
    .line 203
    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzgv;->zza:Z

    .line 204
    .line 205
    if-nez v3, :cond_c

    .line 206
    .line 207
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzc:Z

    .line 212
    .line 213
    if-eqz v3, :cond_d

    .line 214
    .line 215
    invoke-virtual {p1, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 219
    .line 220
    .line 221
    goto :goto_8

    .line 222
    :cond_c
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzc:Z

    .line 223
    .line 224
    :cond_d
    :goto_8
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 225
    .line 226
    .line 227
    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzgv;->zza:Z

    .line 228
    .line 229
    const/4 v4, 0x2

    .line 230
    if-eqz v3, :cond_e

    .line 231
    .line 232
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzgv;->zze:Z

    .line 233
    .line 234
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzd:Z

    .line 235
    .line 236
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzf:I

    .line 237
    .line 238
    goto :goto_b

    .line 239
    :cond_e
    invoke-virtual {p1, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-eqz v3, :cond_f

    .line 247
    .line 248
    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 249
    .line 250
    .line 251
    :cond_f
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    if-eqz v5, :cond_10

    .line 256
    .line 257
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzd:Z

    .line 258
    .line 259
    goto :goto_9

    .line 260
    :cond_10
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    iput-boolean v5, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzd:Z

    .line 265
    .line 266
    if-nez v5, :cond_11

    .line 267
    .line 268
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzgv;->zze:Z

    .line 269
    .line 270
    goto :goto_a

    .line 271
    :cond_11
    :goto_9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 272
    .line 273
    .line 274
    move-result v5

    .line 275
    if-eqz v5, :cond_12

    .line 276
    .line 277
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzgv;->zze:Z

    .line 278
    .line 279
    goto :goto_a

    .line 280
    :cond_12
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 281
    .line 282
    .line 283
    move-result v5

    .line 284
    iput-boolean v5, p0, Lcom/google/android/gms/internal/ads/zzgv;->zze:Z

    .line 285
    .line 286
    :goto_a
    if-eqz v3, :cond_13

    .line 287
    .line 288
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    add-int/2addr v3, v2

    .line 293
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzf:I

    .line 294
    .line 295
    goto :goto_b

    .line 296
    :cond_13
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzf:I

    .line 297
    .line 298
    :goto_b
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzg:I

    .line 306
    .line 307
    if-ne v3, v4, :cond_14

    .line 308
    .line 309
    if-eqz v0, :cond_14

    .line 310
    .line 311
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzi:Z

    .line 316
    .line 317
    goto :goto_c

    .line 318
    :cond_14
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzi:Z

    .line 319
    .line 320
    :goto_c
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzg:I

    .line 321
    .line 322
    if-eq v0, v2, :cond_15

    .line 323
    .line 324
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzj:Z

    .line 329
    .line 330
    goto :goto_d

    .line 331
    :cond_15
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzj:Z

    .line 332
    .line 333
    :goto_d
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    if-eqz v0, :cond_16

    .line 338
    .line 339
    const/16 v0, 0x8

    .line 340
    .line 341
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    int-to-byte v3, v3

    .line 346
    iput-byte v3, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzl:B

    .line 347
    .line 348
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    int-to-byte v3, v3

    .line 353
    iput-byte v3, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzm:B

    .line 354
    .line 355
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 356
    .line 357
    .line 358
    move-result v0

    .line 359
    int-to-byte v0, v0

    .line 360
    goto :goto_e

    .line 361
    :cond_16
    iput-byte v1, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzl:B

    .line 362
    .line 363
    iput-byte v1, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzm:B

    .line 364
    .line 365
    move v0, v1

    .line 366
    :goto_e
    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzj:Z

    .line 367
    .line 368
    if-eqz v3, :cond_17

    .line 369
    .line 370
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 371
    .line 372
    .line 373
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzk:Z

    .line 374
    .line 375
    goto :goto_10

    .line 376
    :cond_17
    iget-byte v3, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzl:B

    .line 377
    .line 378
    if-ne v3, v2, :cond_18

    .line 379
    .line 380
    iget-byte v3, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzm:B

    .line 381
    .line 382
    const/16 v5, 0xd

    .line 383
    .line 384
    if-ne v3, v5, :cond_18

    .line 385
    .line 386
    if-nez v0, :cond_18

    .line 387
    .line 388
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzk:Z

    .line 389
    .line 390
    goto :goto_10

    .line 391
    :cond_18
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 392
    .line 393
    .line 394
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzg:I

    .line 395
    .line 396
    if-nez v0, :cond_19

    .line 397
    .line 398
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzk:Z

    .line 399
    .line 400
    move v1, v2

    .line 401
    goto :goto_f

    .line 402
    :cond_19
    if-ne v0, v2, :cond_1a

    .line 403
    .line 404
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzk:Z

    .line 405
    .line 406
    goto :goto_f

    .line 407
    :cond_1a
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzi:Z

    .line 408
    .line 409
    if-eqz v0, :cond_1b

    .line 410
    .line 411
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzk:Z

    .line 416
    .line 417
    if-eqz v0, :cond_1c

    .line 418
    .line 419
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    goto :goto_f

    .line 424
    :cond_1b
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzk:Z

    .line 425
    .line 426
    :cond_1c
    :goto_f
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgv;->zzk:Z

    .line 427
    .line 428
    if-eqz v0, :cond_1d

    .line 429
    .line 430
    if-eqz v1, :cond_1d

    .line 431
    .line 432
    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 433
    .line 434
    .line 435
    :cond_1d
    :goto_10
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 436
    .line 437
    .line 438
    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzgu;)Lcom/google/android/gms/internal/ads/zzgv;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgv;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzgv;-><init>(Lcom/google/android/gms/internal/ads/zzgu;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzgt; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-object v0

    .line 7
    :catch_0
    const/4 p0, 0x0

    .line 8
    return-object p0
.end method
