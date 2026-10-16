.class public final Lcom/google/android/gms/internal/ads/zzzv;
.super Lcom/google/android/gms/internal/ads/zzzx;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzbg;[IILcom/google/android/gms/internal/ads/zzabr;JJJIIFFLjava/util/List;Lcom/google/android/gms/internal/ads/zzdp;)V
    .locals 0

    .line 1
    const/4 p3, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzzx;-><init>(Lcom/google/android/gms/internal/ads/zzbg;[II)V

    .line 3
    .line 4
    .line 5
    invoke-static {p15}, Lcom/google/android/gms/internal/ads/zzgwt;->zzq(Ljava/util/Collection;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic zzd([Lcom/google/android/gms/internal/ads/zzaba;)Lcom/google/android/gms/internal/ads/zzgwt;
    .locals 23

    .line 1
    const/4 v0, 0x1

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    const-wide/16 v4, 0x0

    .line 10
    .line 11
    const/4 v6, 0x2

    .line 12
    if-ge v3, v6, :cond_1

    .line 13
    .line 14
    aget-object v6, p0, v3

    .line 15
    .line 16
    if-eqz v6, :cond_0

    .line 17
    .line 18
    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzaba;->zzb:[I

    .line 19
    .line 20
    array-length v6, v6

    .line 21
    if-le v6, v0, :cond_0

    .line 22
    .line 23
    sget v6, Lcom/google/android/gms/internal/ads/zzgwt;->zzd:I

    .line 24
    .line 25
    new-instance v6, Lcom/google/android/gms/internal/ads/zzgwq;

    .line 26
    .line 27
    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/zzgwq;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v7, Lcom/google/android/gms/internal/ads/zzzt;

    .line 31
    .line 32
    invoke-direct {v7, v4, v5, v4, v5}, Lcom/google/android/gms/internal/ads/zzzt;-><init>(JJ)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzgwq;->zzf(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwq;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    const/4 v4, 0x0

    .line 43
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    :goto_1
    add-int/2addr v3, v0

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    new-array v3, v6, [[J

    .line 49
    .line 50
    move v7, v2

    .line 51
    :goto_2
    const-wide/16 v8, -0x1

    .line 52
    .line 53
    if-ge v7, v6, :cond_5

    .line 54
    .line 55
    aget-object v10, p0, v7

    .line 56
    .line 57
    if-nez v10, :cond_2

    .line 58
    .line 59
    new-array v8, v2, [J

    .line 60
    .line 61
    aput-object v8, v3, v7

    .line 62
    .line 63
    goto :goto_4

    .line 64
    :cond_2
    iget-object v11, v10, Lcom/google/android/gms/internal/ads/zzaba;->zzb:[I

    .line 65
    .line 66
    array-length v12, v11

    .line 67
    new-array v12, v12, [J

    .line 68
    .line 69
    aput-object v12, v3, v7

    .line 70
    .line 71
    move v12, v2

    .line 72
    :goto_3
    array-length v13, v11

    .line 73
    if-ge v12, v13, :cond_4

    .line 74
    .line 75
    iget-object v13, v10, Lcom/google/android/gms/internal/ads/zzaba;->zza:Lcom/google/android/gms/internal/ads/zzbg;

    .line 76
    .line 77
    aget v14, v11, v12

    .line 78
    .line 79
    invoke-virtual {v13, v14}, Lcom/google/android/gms/internal/ads/zzbg;->zza(I)Lcom/google/android/gms/internal/ads/zzv;

    .line 80
    .line 81
    .line 82
    move-result-object v13

    .line 83
    iget v13, v13, Lcom/google/android/gms/internal/ads/zzv;->zzj:I

    .line 84
    .line 85
    int-to-long v13, v13

    .line 86
    aget-object v15, v3, v7

    .line 87
    .line 88
    cmp-long v16, v13, v8

    .line 89
    .line 90
    if-nez v16, :cond_3

    .line 91
    .line 92
    move-wide v13, v4

    .line 93
    :cond_3
    aput-wide v13, v15, v12

    .line 94
    .line 95
    add-int/2addr v12, v0

    .line 96
    goto :goto_3

    .line 97
    :cond_4
    aget-object v8, v3, v7

    .line 98
    .line 99
    invoke-static {v8}, Ljava/util/Arrays;->sort([J)V

    .line 100
    .line 101
    .line 102
    :goto_4
    add-int/2addr v7, v0

    .line 103
    goto :goto_2

    .line 104
    :cond_5
    new-array v7, v6, [I

    .line 105
    .line 106
    new-array v10, v6, [J

    .line 107
    .line 108
    move v11, v2

    .line 109
    :goto_5
    if-ge v11, v6, :cond_7

    .line 110
    .line 111
    aget-object v12, v3, v11

    .line 112
    .line 113
    array-length v13, v12

    .line 114
    if-nez v13, :cond_6

    .line 115
    .line 116
    move-wide v13, v4

    .line 117
    goto :goto_6

    .line 118
    :cond_6
    aget-wide v13, v12, v2

    .line 119
    .line 120
    :goto_6
    aput-wide v13, v10, v11

    .line 121
    .line 122
    add-int/2addr v11, v0

    .line 123
    goto :goto_5

    .line 124
    :cond_7
    invoke-static {v1, v10}, Lcom/google/android/gms/internal/ads/zzzv;->zzi(Ljava/util/List;[J)V

    .line 125
    .line 126
    .line 127
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgyn;->zzb()Lcom/google/android/gms/internal/ads/zzgyn;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzgyi;->zzc(Ljava/util/Comparator;)Lcom/google/android/gms/internal/ads/zzgyh;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-virtual {v4, v6}, Lcom/google/android/gms/internal/ads/zzgyh;->zzb(I)Lcom/google/android/gms/internal/ads/zzgyf;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzgyf;->zza()Lcom/google/android/gms/internal/ads/zzgxo;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    move v5, v2

    .line 144
    :goto_7
    if-ge v5, v6, :cond_d

    .line 145
    .line 146
    aget-object v11, v3, v5

    .line 147
    .line 148
    array-length v11, v11

    .line 149
    if-gt v11, v0, :cond_9

    .line 150
    .line 151
    move v15, v2

    .line 152
    move-object/from16 v18, v3

    .line 153
    .line 154
    :cond_8
    move/from16 v19, v0

    .line 155
    .line 156
    goto :goto_c

    .line 157
    :cond_9
    new-array v12, v11, [D

    .line 158
    .line 159
    move v13, v2

    .line 160
    :goto_8
    aget-object v14, v3, v5

    .line 161
    .line 162
    array-length v15, v14

    .line 163
    const-wide/16 v16, 0x0

    .line 164
    .line 165
    if-ge v13, v15, :cond_b

    .line 166
    .line 167
    move v15, v2

    .line 168
    move-object/from16 v18, v3

    .line 169
    .line 170
    aget-wide v2, v14, v13

    .line 171
    .line 172
    cmp-long v14, v2, v8

    .line 173
    .line 174
    if-nez v14, :cond_a

    .line 175
    .line 176
    goto :goto_9

    .line 177
    :cond_a
    long-to-double v2, v2

    .line 178
    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    .line 179
    .line 180
    .line 181
    move-result-wide v16

    .line 182
    :goto_9
    aput-wide v16, v12, v13

    .line 183
    .line 184
    add-int/2addr v13, v0

    .line 185
    move v2, v15

    .line 186
    move-object/from16 v3, v18

    .line 187
    .line 188
    goto :goto_8

    .line 189
    :cond_b
    move v15, v2

    .line 190
    move-object/from16 v18, v3

    .line 191
    .line 192
    add-int/lit8 v11, v11, -0x1

    .line 193
    .line 194
    aget-wide v2, v12, v11

    .line 195
    .line 196
    aget-wide v13, v12, v15

    .line 197
    .line 198
    sub-double/2addr v2, v13

    .line 199
    move v13, v15

    .line 200
    :goto_a
    if-ge v13, v11, :cond_8

    .line 201
    .line 202
    aget-wide v19, v12, v13

    .line 203
    .line 204
    add-int/2addr v13, v0

    .line 205
    aget-wide v21, v12, v13

    .line 206
    .line 207
    add-double v19, v19, v21

    .line 208
    .line 209
    cmpl-double v14, v2, v16

    .line 210
    .line 211
    if-nez v14, :cond_c

    .line 212
    .line 213
    const-wide/high16 v19, 0x3ff0000000000000L    # 1.0

    .line 214
    .line 215
    goto :goto_b

    .line 216
    :cond_c
    const-wide/high16 v21, 0x3fe0000000000000L    # 0.5

    .line 217
    .line 218
    mul-double v19, v19, v21

    .line 219
    .line 220
    aget-wide v21, v12, v15

    .line 221
    .line 222
    sub-double v19, v19, v21

    .line 223
    .line 224
    div-double v19, v19, v2

    .line 225
    .line 226
    :goto_b
    invoke-static/range {v19 .. v20}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 227
    .line 228
    .line 229
    move-result-object v14

    .line 230
    move/from16 v19, v0

    .line 231
    .line 232
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-interface {v4, v14, v0}, Lcom/google/android/gms/internal/ads/zzgyb;->zze(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move/from16 v0, v19

    .line 240
    .line 241
    goto :goto_a

    .line 242
    :goto_c
    add-int/lit8 v5, v5, 0x1

    .line 243
    .line 244
    move v2, v15

    .line 245
    move-object/from16 v3, v18

    .line 246
    .line 247
    move/from16 v0, v19

    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_d
    move/from16 v19, v0

    .line 251
    .line 252
    move v15, v2

    .line 253
    move-object/from16 v18, v3

    .line 254
    .line 255
    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/zzgyb;->zzt()Ljava/util/Collection;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgwt;->zzq(Ljava/util/Collection;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    :goto_d
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    if-ge v2, v3, :cond_e

    .line 268
    .line 269
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    check-cast v3, Ljava/lang/Integer;

    .line 274
    .line 275
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    aget v4, v7, v3

    .line 280
    .line 281
    add-int/lit8 v4, v4, 0x1

    .line 282
    .line 283
    aput v4, v7, v3

    .line 284
    .line 285
    aget-object v5, v18, v3

    .line 286
    .line 287
    aget-wide v4, v5, v4

    .line 288
    .line 289
    aput-wide v4, v10, v3

    .line 290
    .line 291
    invoke-static {v1, v10}, Lcom/google/android/gms/internal/ads/zzzv;->zzi(Ljava/util/List;[J)V

    .line 292
    .line 293
    .line 294
    add-int/lit8 v2, v2, 0x1

    .line 295
    .line 296
    goto :goto_d

    .line 297
    :cond_e
    move v0, v15

    .line 298
    :goto_e
    if-ge v0, v6, :cond_10

    .line 299
    .line 300
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    if-eqz v2, :cond_f

    .line 305
    .line 306
    aget-wide v2, v10, v0

    .line 307
    .line 308
    add-long/2addr v2, v2

    .line 309
    aput-wide v2, v10, v0

    .line 310
    .line 311
    :cond_f
    add-int/lit8 v0, v0, 0x1

    .line 312
    .line 313
    goto :goto_e

    .line 314
    :cond_10
    invoke-static {v1, v10}, Lcom/google/android/gms/internal/ads/zzzv;->zzi(Ljava/util/List;[J)V

    .line 315
    .line 316
    .line 317
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgwq;

    .line 318
    .line 319
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgwq;-><init>()V

    .line 320
    .line 321
    .line 322
    move v2, v15

    .line 323
    :goto_f
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    if-ge v2, v3, :cond_12

    .line 328
    .line 329
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    check-cast v3, Lcom/google/android/gms/internal/ads/zzgwq;

    .line 334
    .line 335
    if-nez v3, :cond_11

    .line 336
    .line 337
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgwt;->zzi()Lcom/google/android/gms/internal/ads/zzgwt;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    goto :goto_10

    .line 342
    :cond_11
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzgwq;->zzi()Lcom/google/android/gms/internal/ads/zzgwt;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    :goto_10
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzgwq;->zzf(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwq;

    .line 347
    .line 348
    .line 349
    add-int/lit8 v2, v2, 0x1

    .line 350
    .line 351
    goto :goto_f

    .line 352
    :cond_12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgwq;->zzi()Lcom/google/android/gms/internal/ads/zzgwt;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    return-object v0
.end method

.method private static zzi(Ljava/util/List;[J)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const-wide/16 v1, 0x0

    .line 3
    .line 4
    move v3, v0

    .line 5
    :goto_0
    const/4 v4, 0x2

    .line 6
    if-ge v3, v4, :cond_0

    .line 7
    .line 8
    aget-wide v4, p1, v3

    .line 9
    .line 10
    add-long/2addr v1, v4

    .line 11
    add-int/lit8 v3, v3, 0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-ge v0, v3, :cond_2

    .line 19
    .line 20
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lcom/google/android/gms/internal/ads/zzgwq;

    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    new-instance v4, Lcom/google/android/gms/internal/ads/zzzt;

    .line 29
    .line 30
    aget-wide v5, p1, v0

    .line 31
    .line 32
    invoke-direct {v4, v1, v2, v5, v6}, Lcom/google/android/gms/internal/ads/zzzt;-><init>(JJ)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzgwq;->zzf(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwq;

    .line 36
    .line 37
    .line 38
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    return-void
.end method
