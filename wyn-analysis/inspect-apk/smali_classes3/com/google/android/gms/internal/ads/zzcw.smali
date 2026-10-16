.class public final Lcom/google/android/gms/internal/ads/zzcw;
.super Lcom/google/android/gms/internal/ads/zzcq;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzcq;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final zzd(Ljava/nio/ByteBuffer;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x4

    .line 7
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    sub-int v6, v5, v4

    .line 16
    .line 17
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzcq;->zzb:Lcom/google/android/gms/internal/ads/zzcl;

    .line 18
    .line 19
    iget v7, v7, Lcom/google/android/gms/internal/ads/zzcl;->zzd:I

    .line 20
    .line 21
    const/high16 v8, 0x72000000

    .line 22
    .line 23
    const/high16 v9, 0x71000000

    .line 24
    .line 25
    const/high16 v10, 0x70000000

    .line 26
    .line 27
    const/high16 v11, 0x60000000

    .line 28
    .line 29
    const/high16 v12, 0x50000000

    .line 30
    .line 31
    const/high16 v13, 0x10000000

    .line 32
    .line 33
    const/16 v14, 0x16

    .line 34
    .line 35
    const/16 v15, 0x15

    .line 36
    .line 37
    if-eq v7, v2, :cond_3

    .line 38
    .line 39
    if-eq v7, v3, :cond_4

    .line 40
    .line 41
    if-eq v7, v15, :cond_2

    .line 42
    .line 43
    if-eq v7, v14, :cond_4

    .line 44
    .line 45
    if-eq v7, v13, :cond_5

    .line 46
    .line 47
    if-eq v7, v12, :cond_2

    .line 48
    .line 49
    if-eq v7, v11, :cond_4

    .line 50
    .line 51
    if-eq v7, v10, :cond_1

    .line 52
    .line 53
    if-eq v7, v9, :cond_4

    .line 54
    .line 55
    if-ne v7, v8, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 61
    .line 62
    .line 63
    throw v1

    .line 64
    :cond_1
    :goto_0
    div-int/2addr v6, v3

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    div-int/2addr v6, v2

    .line 67
    :cond_3
    add-int/2addr v6, v6

    .line 68
    goto :goto_1

    .line 69
    :cond_4
    div-int/lit8 v6, v6, 0x2

    .line 70
    .line 71
    :cond_5
    :goto_1
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzcq;->zzk(I)Ljava/nio/ByteBuffer;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzcq;->zzb:Lcom/google/android/gms/internal/ads/zzcl;

    .line 76
    .line 77
    iget v7, v7, Lcom/google/android/gms/internal/ads/zzcl;->zzd:I

    .line 78
    .line 79
    if-eq v7, v2, :cond_f

    .line 80
    .line 81
    const v16, 0x46fffe00    # 32767.0f

    .line 82
    .line 83
    .line 84
    move/from16 v17, v2

    .line 85
    .line 86
    const/high16 v2, -0x40800000    # -1.0f

    .line 87
    .line 88
    if-eq v7, v3, :cond_e

    .line 89
    .line 90
    if-eq v7, v15, :cond_d

    .line 91
    .line 92
    if-eq v7, v14, :cond_c

    .line 93
    .line 94
    if-eq v7, v13, :cond_b

    .line 95
    .line 96
    if-eq v7, v12, :cond_a

    .line 97
    .line 98
    if-eq v7, v11, :cond_9

    .line 99
    .line 100
    const-wide v11, 0x40dfffc000000000L    # 32767.0

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    if-eq v7, v10, :cond_8

    .line 106
    .line 107
    if-eq v7, v9, :cond_7

    .line 108
    .line 109
    if-ne v7, v8, :cond_6

    .line 110
    .line 111
    :goto_2
    if-ge v4, v5, :cond_10

    .line 112
    .line 113
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->getLong(I)J

    .line 114
    .line 115
    .line 116
    move-result-wide v2

    .line 117
    invoke-static {v2, v3}, Ljava/lang/Long;->reverseBytes(J)J

    .line 118
    .line 119
    .line 120
    move-result-wide v2

    .line 121
    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 122
    .line 123
    .line 124
    move-result-wide v13

    .line 125
    const-wide/high16 v15, -0x4010000000000000L    # -1.0

    .line 126
    .line 127
    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    .line 128
    .line 129
    invoke-static/range {v13 .. v18}, Lcom/google/android/gms/internal/ads/zzfm;->zzm(DDD)D

    .line 130
    .line 131
    .line 132
    move-result-wide v2

    .line 133
    mul-double/2addr v2, v11

    .line 134
    double-to-int v2, v2

    .line 135
    int-to-short v2, v2

    .line 136
    and-int/lit16 v3, v2, 0xff

    .line 137
    .line 138
    int-to-byte v3, v3

    .line 139
    invoke-virtual {v6, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 140
    .line 141
    .line 142
    shr-int/lit8 v2, v2, 0x8

    .line 143
    .line 144
    and-int/lit16 v2, v2, 0xff

    .line 145
    .line 146
    int-to-byte v2, v2

    .line 147
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 148
    .line 149
    .line 150
    add-int/lit8 v4, v4, 0x8

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 154
    .line 155
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 156
    .line 157
    .line 158
    throw v1

    .line 159
    :cond_7
    :goto_3
    if-ge v4, v5, :cond_10

    .line 160
    .line 161
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 162
    .line 163
    .line 164
    move-result v7

    .line 165
    invoke-static {v7}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    sget-object v8, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 174
    .line 175
    const/high16 v8, 0x3f800000    # 1.0f

    .line 176
    .line 177
    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    invoke-static {v2, v7}, Ljava/lang/Math;->max(FF)F

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    mul-float v7, v7, v16

    .line 186
    .line 187
    float-to-int v7, v7

    .line 188
    int-to-short v7, v7

    .line 189
    and-int/lit16 v8, v7, 0xff

    .line 190
    .line 191
    int-to-byte v8, v8

    .line 192
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 193
    .line 194
    .line 195
    shr-int/lit8 v7, v7, 0x8

    .line 196
    .line 197
    and-int/lit16 v7, v7, 0xff

    .line 198
    .line 199
    int-to-byte v7, v7

    .line 200
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 201
    .line 202
    .line 203
    add-int/2addr v4, v3

    .line 204
    goto :goto_3

    .line 205
    :cond_8
    :goto_4
    if-ge v4, v5, :cond_10

    .line 206
    .line 207
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->getDouble(I)D

    .line 208
    .line 209
    .line 210
    move-result-wide v13

    .line 211
    const-wide/high16 v15, -0x4010000000000000L    # -1.0

    .line 212
    .line 213
    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    .line 214
    .line 215
    invoke-static/range {v13 .. v18}, Lcom/google/android/gms/internal/ads/zzfm;->zzm(DDD)D

    .line 216
    .line 217
    .line 218
    move-result-wide v2

    .line 219
    mul-double/2addr v2, v11

    .line 220
    double-to-int v2, v2

    .line 221
    int-to-short v2, v2

    .line 222
    and-int/lit16 v3, v2, 0xff

    .line 223
    .line 224
    int-to-byte v3, v3

    .line 225
    invoke-virtual {v6, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 226
    .line 227
    .line 228
    shr-int/lit8 v2, v2, 0x8

    .line 229
    .line 230
    and-int/lit16 v2, v2, 0xff

    .line 231
    .line 232
    int-to-byte v2, v2

    .line 233
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 234
    .line 235
    .line 236
    add-int/lit8 v4, v4, 0x8

    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_9
    :goto_5
    if-ge v4, v5, :cond_10

    .line 240
    .line 241
    add-int/lit8 v2, v4, 0x1

    .line 242
    .line 243
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 255
    .line 256
    .line 257
    add-int/2addr v4, v3

    .line 258
    goto :goto_5

    .line 259
    :cond_a
    :goto_6
    if-ge v4, v5, :cond_10

    .line 260
    .line 261
    add-int/lit8 v2, v4, 0x1

    .line 262
    .line 263
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 275
    .line 276
    .line 277
    add-int/lit8 v4, v4, 0x3

    .line 278
    .line 279
    goto :goto_6

    .line 280
    :cond_b
    :goto_7
    if-ge v4, v5, :cond_10

    .line 281
    .line 282
    add-int/lit8 v2, v4, 0x1

    .line 283
    .line 284
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 285
    .line 286
    .line 287
    move-result v2

    .line 288
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 296
    .line 297
    .line 298
    add-int/lit8 v4, v4, 0x2

    .line 299
    .line 300
    goto :goto_7

    .line 301
    :cond_c
    :goto_8
    if-ge v4, v5, :cond_10

    .line 302
    .line 303
    add-int/lit8 v2, v4, 0x2

    .line 304
    .line 305
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 310
    .line 311
    .line 312
    add-int/lit8 v2, v4, 0x3

    .line 313
    .line 314
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 319
    .line 320
    .line 321
    add-int/2addr v4, v3

    .line 322
    goto :goto_8

    .line 323
    :cond_d
    :goto_9
    if-ge v4, v5, :cond_10

    .line 324
    .line 325
    add-int/lit8 v2, v4, 0x1

    .line 326
    .line 327
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 332
    .line 333
    .line 334
    add-int/lit8 v2, v4, 0x2

    .line 335
    .line 336
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 341
    .line 342
    .line 343
    add-int/lit8 v4, v4, 0x3

    .line 344
    .line 345
    goto :goto_9

    .line 346
    :cond_e
    :goto_a
    if-ge v4, v5, :cond_10

    .line 347
    .line 348
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->getFloat(I)F

    .line 349
    .line 350
    .line 351
    move-result v7

    .line 352
    sget-object v8, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 353
    .line 354
    const/high16 v8, 0x3f800000    # 1.0f

    .line 355
    .line 356
    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    .line 357
    .line 358
    .line 359
    move-result v7

    .line 360
    invoke-static {v2, v7}, Ljava/lang/Math;->max(FF)F

    .line 361
    .line 362
    .line 363
    move-result v7

    .line 364
    mul-float v7, v7, v16

    .line 365
    .line 366
    float-to-int v7, v7

    .line 367
    int-to-short v7, v7

    .line 368
    and-int/lit16 v9, v7, 0xff

    .line 369
    .line 370
    int-to-byte v9, v9

    .line 371
    invoke-virtual {v6, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 372
    .line 373
    .line 374
    shr-int/lit8 v7, v7, 0x8

    .line 375
    .line 376
    and-int/lit16 v7, v7, 0xff

    .line 377
    .line 378
    int-to-byte v7, v7

    .line 379
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 380
    .line 381
    .line 382
    add-int/2addr v4, v3

    .line 383
    goto :goto_a

    .line 384
    :cond_f
    :goto_b
    if-ge v4, v5, :cond_10

    .line 385
    .line 386
    const/4 v2, 0x0

    .line 387
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 391
    .line 392
    .line 393
    move-result v2

    .line 394
    and-int/lit16 v2, v2, 0xff

    .line 395
    .line 396
    add-int/lit8 v2, v2, -0x80

    .line 397
    .line 398
    int-to-byte v2, v2

    .line 399
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 400
    .line 401
    .line 402
    add-int/lit8 v4, v4, 0x1

    .line 403
    .line 404
    goto :goto_b

    .line 405
    :cond_10
    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 413
    .line 414
    .line 415
    return-void
.end method

.method public final zzm(Lcom/google/android/gms/internal/ads/zzcl;)Lcom/google/android/gms/internal/ads/zzcl;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzco;
        }
    .end annotation

    .line 1
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzcl;->zzd:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfm;->zzE(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/internal/ads/zzcl;

    .line 13
    .line 14
    iget v2, p1, Lcom/google/android/gms/internal/ads/zzcl;->zzb:I

    .line 15
    .line 16
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzcl;->zzc:I

    .line 17
    .line 18
    invoke-direct {v0, v2, p1, v1}, Lcom/google/android/gms/internal/ads/zzcl;-><init>(III)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzcl;->zza:Lcom/google/android/gms/internal/ads/zzcl;

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzco;

    .line 26
    .line 27
    const-string v1, "Unhandled input format:"

    .line 28
    .line 29
    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzco;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcl;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method
