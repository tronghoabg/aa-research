.class public final Lcom/google/android/gms/internal/ads/zzamn;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1d

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzamn;->zza:[I

    return-void

    :array_0
    .array-data 4
        0x69736f6d
        0x69736f32
        0x69736f33
        0x69736f34
        0x69736f35
        0x69736f36
        0x69736f39
        0x61766331
        0x68766331
        0x68657631
        0x61763031
        0x6d703431
        0x6d703432
        0x33673261
        0x33673262
        0x33677236
        0x33677336
        0x33676536
        0x33676736
        0x4d345620    # 1.8909645E8f
        0x4d344120    # 1.8901043E8f
        0x66347620
        0x6b646469
        0x4d345650
        0x71742020
        0x4d534e56    # 2.215704E8f
        0x64627931
        0x69736d6c
        0x70696666
    .end array-data
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzagb;)Lcom/google/android/gms/internal/ads/zzahh;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/zzamn;->zzc(Lcom/google/android/gms/internal/ads/zzagb;Z)Lcom/google/android/gms/internal/ads/zzahh;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static zzb(Lcom/google/android/gms/internal/ads/zzagb;)Lcom/google/android/gms/internal/ads/zzahh;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/zzamn;->zzc(Lcom/google/android/gms/internal/ads/zzagb;Z)Lcom/google/android/gms/internal/ads/zzahh;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method private static zzc(Lcom/google/android/gms/internal/ads/zzagb;Z)Lcom/google/android/gms/internal/ads/zzahh;
    .locals 23
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzo()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    const-wide/16 v3, -0x1

    .line 8
    .line 9
    cmp-long v5, v1, v3

    .line 10
    .line 11
    const-wide/16 v6, 0x1000

    .line 12
    .line 13
    if-eqz v5, :cond_1

    .line 14
    .line 15
    cmp-long v8, v1, v6

    .line 16
    .line 17
    if-lez v8, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-wide v6, v1

    .line 21
    :cond_1
    :goto_0
    new-instance v8, Lcom/google/android/gms/internal/ads/zzeu;

    .line 22
    .line 23
    const/16 v9, 0x40

    .line 24
    .line 25
    invoke-direct {v8, v9}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 26
    .line 27
    .line 28
    long-to-int v6, v6

    .line 29
    const/4 v7, 0x0

    .line 30
    move v9, v7

    .line 31
    move v10, v9

    .line 32
    :goto_1
    if-ge v9, v6, :cond_1b

    .line 33
    .line 34
    const/16 v12, 0x8

    .line 35
    .line 36
    invoke-virtual {v8, v12}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 40
    .line 41
    .line 42
    move-result-object v13

    .line 43
    const/4 v14, 0x1

    .line 44
    invoke-interface {v0, v13, v7, v12, v14}, Lcom/google/android/gms/internal/ads/zzagb;->zzh([BIIZ)Z

    .line 45
    .line 46
    .line 47
    move-result v13

    .line 48
    if-nez v13, :cond_2

    .line 49
    .line 50
    :goto_2
    const/16 v22, 0x0

    .line 51
    .line 52
    goto/16 :goto_c

    .line 53
    .line 54
    :cond_2
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzeu;->zzz()J

    .line 55
    .line 56
    .line 57
    move-result-wide v15

    .line 58
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 59
    .line 60
    .line 61
    move-result v13

    .line 62
    const-wide/16 v17, 0x1

    .line 63
    .line 64
    cmp-long v17, v15, v17

    .line 65
    .line 66
    const-wide/16 v18, 0x8

    .line 67
    .line 68
    if-nez v17, :cond_3

    .line 69
    .line 70
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 71
    .line 72
    .line 73
    move-result-object v15

    .line 74
    invoke-interface {v0, v15, v12, v12}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 75
    .line 76
    .line 77
    const/16 v15, 0x10

    .line 78
    .line 79
    invoke-virtual {v8, v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzf(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzeu;->zzD()J

    .line 83
    .line 84
    .line 85
    move-result-wide v16

    .line 86
    move-wide/from16 v3, v16

    .line 87
    .line 88
    move-object/from16 v16, v8

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_3
    const-wide/16 v20, 0x0

    .line 92
    .line 93
    cmp-long v17, v15, v20

    .line 94
    .line 95
    if-nez v17, :cond_4

    .line 96
    .line 97
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzo()J

    .line 98
    .line 99
    .line 100
    move-result-wide v20

    .line 101
    cmp-long v17, v20, v3

    .line 102
    .line 103
    if-eqz v17, :cond_4

    .line 104
    .line 105
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzm()J

    .line 106
    .line 107
    .line 108
    move-result-wide v15

    .line 109
    sub-long v20, v20, v15

    .line 110
    .line 111
    add-long v15, v20, v18

    .line 112
    .line 113
    :cond_4
    move-wide v3, v15

    .line 114
    move-object/from16 v16, v8

    .line 115
    .line 116
    move v15, v12

    .line 117
    :goto_3
    int-to-long v7, v15

    .line 118
    cmp-long v22, v3, v7

    .line 119
    .line 120
    if-gez v22, :cond_7

    .line 121
    .line 122
    const/16 v22, 0x0

    .line 123
    .line 124
    const v11, 0x66726565

    .line 125
    .line 126
    .line 127
    if-ne v13, v11, :cond_6

    .line 128
    .line 129
    if-ne v15, v12, :cond_5

    .line 130
    .line 131
    move v13, v11

    .line 132
    move-wide/from16 v3, v18

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_5
    move v13, v11

    .line 136
    :cond_6
    new-instance v0, Lcom/google/android/gms/internal/ads/zzalc;

    .line 137
    .line 138
    invoke-direct {v0, v13, v3, v4, v15}, Lcom/google/android/gms/internal/ads/zzalc;-><init>(IJI)V

    .line 139
    .line 140
    .line 141
    return-object v0

    .line 142
    :cond_7
    const/16 v22, 0x0

    .line 143
    .line 144
    :goto_4
    add-int/2addr v9, v15

    .line 145
    const v11, 0x6d6f6f76

    .line 146
    .line 147
    .line 148
    if-eq v13, v11, :cond_9

    .line 149
    .line 150
    const v15, 0x75756964

    .line 151
    .line 152
    .line 153
    if-ne v13, v15, :cond_8

    .line 154
    .line 155
    move v13, v15

    .line 156
    goto :goto_5

    .line 157
    :cond_8
    move/from16 v18, v14

    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_9
    :goto_5
    long-to-int v15, v3

    .line 161
    add-int/2addr v6, v15

    .line 162
    move/from16 v18, v14

    .line 163
    .line 164
    if-eqz v5, :cond_a

    .line 165
    .line 166
    int-to-long v14, v6

    .line 167
    cmp-long v14, v14, v1

    .line 168
    .line 169
    if-lez v14, :cond_a

    .line 170
    .line 171
    long-to-int v6, v1

    .line 172
    :cond_a
    if-ne v13, v11, :cond_b

    .line 173
    .line 174
    move-object/from16 v8, v16

    .line 175
    .line 176
    const-wide/16 v3, -0x1

    .line 177
    .line 178
    const/4 v7, 0x0

    .line 179
    goto/16 :goto_1

    .line 180
    .line 181
    :cond_b
    :goto_6
    const v11, 0x7472616b

    .line 182
    .line 183
    .line 184
    if-eq v13, v11, :cond_c

    .line 185
    .line 186
    const v11, 0x6d646961

    .line 187
    .line 188
    .line 189
    if-eq v13, v11, :cond_c

    .line 190
    .line 191
    const v11, 0x6d696e66

    .line 192
    .line 193
    .line 194
    if-ne v13, v11, :cond_d

    .line 195
    .line 196
    :cond_c
    move-object/from16 v4, v16

    .line 197
    .line 198
    const/4 v8, 0x0

    .line 199
    goto/16 :goto_b

    .line 200
    .line 201
    :cond_d
    const v11, 0x6d6f6f66

    .line 202
    .line 203
    .line 204
    if-eq v13, v11, :cond_e

    .line 205
    .line 206
    const v11, 0x6d766578

    .line 207
    .line 208
    .line 209
    if-ne v13, v11, :cond_f

    .line 210
    .line 211
    :cond_e
    move/from16 v7, v18

    .line 212
    .line 213
    goto/16 :goto_c

    .line 214
    .line 215
    :cond_f
    const v11, 0x6d646174

    .line 216
    .line 217
    .line 218
    if-ne v13, v11, :cond_10

    .line 219
    .line 220
    const/4 v11, 0x0

    .line 221
    goto :goto_7

    .line 222
    :cond_10
    move/from16 v11, v18

    .line 223
    .line 224
    :goto_7
    xor-int/lit8 v11, v11, 0x1

    .line 225
    .line 226
    or-int/2addr v10, v11

    .line 227
    const v11, 0x7374626c

    .line 228
    .line 229
    .line 230
    if-ne v13, v11, :cond_12

    .line 231
    .line 232
    const-wide/32 v13, 0xf4240

    .line 233
    .line 234
    .line 235
    cmp-long v13, v3, v13

    .line 236
    .line 237
    if-lez v13, :cond_11

    .line 238
    .line 239
    :goto_8
    const/4 v7, 0x0

    .line 240
    goto/16 :goto_c

    .line 241
    .line 242
    :cond_11
    move v13, v11

    .line 243
    :cond_12
    int-to-long v14, v9

    .line 244
    move/from16 v19, v13

    .line 245
    .line 246
    int-to-long v12, v6

    .line 247
    add-long/2addr v14, v3

    .line 248
    sub-long/2addr v14, v7

    .line 249
    cmp-long v12, v14, v12

    .line 250
    .line 251
    if-ltz v12, :cond_13

    .line 252
    .line 253
    goto :goto_8

    .line 254
    :cond_13
    sub-long/2addr v3, v7

    .line 255
    long-to-int v3, v3

    .line 256
    add-int/2addr v9, v3

    .line 257
    const v4, 0x66747970

    .line 258
    .line 259
    .line 260
    move/from16 v13, v19

    .line 261
    .line 262
    if-ne v13, v4, :cond_19

    .line 263
    .line 264
    const/16 v11, 0x8

    .line 265
    .line 266
    if-ge v3, v11, :cond_14

    .line 267
    .line 268
    int-to-long v0, v3

    .line 269
    new-instance v2, Lcom/google/android/gms/internal/ads/zzalc;

    .line 270
    .line 271
    invoke-direct {v2, v4, v0, v1, v11}, Lcom/google/android/gms/internal/ads/zzalc;-><init>(IJI)V

    .line 272
    .line 273
    .line 274
    return-object v2

    .line 275
    :cond_14
    move-object/from16 v4, v16

    .line 276
    .line 277
    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 281
    .line 282
    .line 283
    move-result-object v7

    .line 284
    const/4 v8, 0x0

    .line 285
    invoke-interface {v0, v7, v8, v3}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzamn;->zzd(I)Z

    .line 293
    .line 294
    .line 295
    move-result v7

    .line 296
    or-int/2addr v7, v10

    .line 297
    const/4 v10, 0x4

    .line 298
    invoke-virtual {v4, v10}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 302
    .line 303
    .line 304
    move-result v11

    .line 305
    div-int/2addr v11, v10

    .line 306
    if-nez v7, :cond_17

    .line 307
    .line 308
    if-lez v11, :cond_17

    .line 309
    .line 310
    new-array v10, v11, [I

    .line 311
    .line 312
    move v12, v8

    .line 313
    :goto_9
    if-ge v12, v11, :cond_16

    .line 314
    .line 315
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 316
    .line 317
    .line 318
    move-result v13

    .line 319
    aput v13, v10, v12

    .line 320
    .line 321
    invoke-static {v13}, Lcom/google/android/gms/internal/ads/zzamn;->zzd(I)Z

    .line 322
    .line 323
    .line 324
    move-result v13

    .line 325
    if-eqz v13, :cond_15

    .line 326
    .line 327
    move-object v11, v10

    .line 328
    move/from16 v14, v18

    .line 329
    .line 330
    goto :goto_a

    .line 331
    :cond_15
    add-int/lit8 v12, v12, 0x1

    .line 332
    .line 333
    goto :goto_9

    .line 334
    :cond_16
    move v14, v7

    .line 335
    move-object v11, v10

    .line 336
    goto :goto_a

    .line 337
    :cond_17
    move v14, v7

    .line 338
    move-object/from16 v11, v22

    .line 339
    .line 340
    :goto_a
    if-eqz v14, :cond_18

    .line 341
    .line 342
    move v10, v14

    .line 343
    goto :goto_b

    .line 344
    :cond_18
    new-instance v0, Lcom/google/android/gms/internal/ads/zzamt;

    .line 345
    .line 346
    invoke-direct {v0, v3, v11}, Lcom/google/android/gms/internal/ads/zzamt;-><init>(I[I)V

    .line 347
    .line 348
    .line 349
    return-object v0

    .line 350
    :cond_19
    move-object/from16 v4, v16

    .line 351
    .line 352
    const/4 v8, 0x0

    .line 353
    if-eqz v3, :cond_1a

    .line 354
    .line 355
    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/ads/zzagb;->zzk(I)V

    .line 356
    .line 357
    .line 358
    :cond_1a
    :goto_b
    move v7, v8

    .line 359
    move-object v8, v4

    .line 360
    const-wide/16 v3, -0x1

    .line 361
    .line 362
    goto/16 :goto_1

    .line 363
    .line 364
    :cond_1b
    move v8, v7

    .line 365
    goto/16 :goto_2

    .line 366
    .line 367
    :goto_c
    if-nez v10, :cond_1c

    .line 368
    .line 369
    sget-object v0, Lcom/google/android/gms/internal/ads/zzamj;->zza:Lcom/google/android/gms/internal/ads/zzamj;

    .line 370
    .line 371
    return-object v0

    .line 372
    :cond_1c
    move/from16 v0, p1

    .line 373
    .line 374
    if-eq v0, v7, :cond_1e

    .line 375
    .line 376
    if-eqz v7, :cond_1d

    .line 377
    .line 378
    sget-object v0, Lcom/google/android/gms/internal/ads/zzalx;->zza:Lcom/google/android/gms/internal/ads/zzalx;

    .line 379
    .line 380
    return-object v0

    .line 381
    :cond_1d
    sget-object v0, Lcom/google/android/gms/internal/ads/zzalx;->zzb:Lcom/google/android/gms/internal/ads/zzalx;

    .line 382
    .line 383
    return-object v0

    .line 384
    :cond_1e
    return-object v22
.end method

.method private static zzd(I)Z
    .locals 5

    .line 1
    ushr-int/lit8 v0, p0, 0x8

    .line 2
    .line 3
    const v1, 0x336770

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    return v2

    .line 10
    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzamn;->zza:[I

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    move v3, v1

    .line 14
    :goto_0
    const/16 v4, 0x1d

    .line 15
    .line 16
    if-ge v3, v4, :cond_2

    .line 17
    .line 18
    aget v4, v0, v3

    .line 19
    .line 20
    if-ne v4, p0, :cond_1

    .line 21
    .line 22
    return v2

    .line 23
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    return v1
.end method
