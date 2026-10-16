.class final Lcom/google/android/gms/internal/ads/zzgjl;
.super Lcom/google/android/gms/internal/ads/zzgji;
.source "SourceFile"


# instance fields
.field private final zza:Ljava/util/Map;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzgie;

.field private final zzc:Landroid/util/DisplayMetrics;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzaxt;Lcom/google/android/gms/internal/ads/zzgie;Ljava/util/Map;Landroid/util/DisplayMetrics;Lcom/google/android/gms/internal/ads/zzgqo;)V
    .locals 7

    .line 1
    const/16 v0, 0x7b

    .line 2
    .line 3
    invoke-virtual {p5, v0}, Lcom/google/android/gms/internal/ads/zzgqo;->zza(I)Lcom/google/android/gms/internal/ads/zzgqm;

    .line 4
    .line 5
    .line 6
    move-result-object v6

    .line 7
    const-string v2, "O/IhSczWkqH+q2aziu5mnePClwI2VInt8+rK2r5DAzxhVznO7DMyVuowa8d0HFxQ"

    .line 8
    .line 9
    const-string v3, "c/euB7bpmuTDKGTS9kQ/O7Lr64QuDKreUuxk5moaYNc="

    .line 10
    .line 11
    move-object v1, p0

    .line 12
    move-object v4, p1

    .line 13
    move-object v5, p2

    .line 14
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzgji;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzaxt;Lcom/google/android/gms/internal/ads/zzgie;Lcom/google/android/gms/internal/ads/zzgqm;)V

    .line 15
    .line 16
    .line 17
    iput-object v5, v1, Lcom/google/android/gms/internal/ads/zzgjl;->zzb:Lcom/google/android/gms/internal/ads/zzgie;

    .line 18
    .line 19
    iput-object p3, v1, Lcom/google/android/gms/internal/ads/zzgjl;->zza:Ljava/util/Map;

    .line 20
    .line 21
    iput-object p4, v1, Lcom/google/android/gms/internal/ads/zzgjl;->zzc:Landroid/util/DisplayMetrics;

    .line 22
    .line 23
    return-void
.end method

.method private static zzb(DLandroid/util/DisplayMetrics;)J
    .locals 2

    .line 1
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    .line 2
    .line 3
    float-to-double v0, p2

    .line 4
    div-double/2addr p0, v0

    .line 5
    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    return-wide p0
.end method

.method private static zzc(Landroid/util/DisplayMetrics;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    cmpl-float p0, p0, v0

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method


# virtual methods
.method public final zza(Ljava/lang/reflect/Method;Lcom/google/android/gms/internal/ads/zzaxt;)V
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/reflect/InvocationTargetException;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzgjl;->zza:Ljava/util/Map;

    .line 6
    .line 7
    const-string v3, "nv"

    .line 8
    .line 9
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    check-cast v3, Landroid/view/MotionEvent;

    .line 14
    .line 15
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzgjl;->zzc:Landroid/util/DisplayMetrics;

    .line 16
    .line 17
    const/4 v5, 0x2

    .line 18
    new-array v6, v5, [Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    aput-object v3, v6, v7

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    aput-object v4, v6, v3

    .line 25
    .line 26
    const-string v8, ""

    .line 27
    .line 28
    move-object/from16 v9, p1

    .line 29
    .line 30
    invoke-virtual {v9, v8, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    check-cast v6, [Ljava/lang/Object;

    .line 35
    .line 36
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzayq;->zza()Lcom/google/android/gms/internal/ads/zzayp;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    aget-object v9, v6, v7

    .line 44
    .line 45
    if-eqz v9, :cond_0

    .line 46
    .line 47
    aget-object v10, v6, v3

    .line 48
    .line 49
    if-eqz v10, :cond_0

    .line 50
    .line 51
    check-cast v9, Ljava/lang/Long;

    .line 52
    .line 53
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 54
    .line 55
    .line 56
    move-result-wide v9

    .line 57
    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/internal/ads/zzayp;->zza(J)Lcom/google/android/gms/internal/ads/zzayp;

    .line 58
    .line 59
    .line 60
    aget-object v9, v6, v3

    .line 61
    .line 62
    check-cast v9, Ljava/lang/Long;

    .line 63
    .line 64
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 65
    .line 66
    .line 67
    move-result-wide v9

    .line 68
    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/internal/ads/zzayp;->zzb(J)Lcom/google/android/gms/internal/ads/zzayp;

    .line 69
    .line 70
    .line 71
    :cond_0
    aget-object v9, v6, v5

    .line 72
    .line 73
    if-eqz v9, :cond_1

    .line 74
    .line 75
    check-cast v9, Ljava/lang/Long;

    .line 76
    .line 77
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 78
    .line 79
    .line 80
    move-result-wide v9

    .line 81
    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/internal/ads/zzayp;->zzh(J)Lcom/google/android/gms/internal/ads/zzayp;

    .line 82
    .line 83
    .line 84
    :cond_1
    const/4 v9, 0x3

    .line 85
    aget-object v10, v6, v9

    .line 86
    .line 87
    if-eqz v10, :cond_2

    .line 88
    .line 89
    check-cast v10, Ljava/lang/Long;

    .line 90
    .line 91
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 92
    .line 93
    .line 94
    move-result-wide v10

    .line 95
    invoke-virtual {v8, v10, v11}, Lcom/google/android/gms/internal/ads/zzayp;->zzf(J)Lcom/google/android/gms/internal/ads/zzayp;

    .line 96
    .line 97
    .line 98
    :cond_2
    const/4 v10, 0x4

    .line 99
    aget-object v11, v6, v10

    .line 100
    .line 101
    if-eqz v11, :cond_3

    .line 102
    .line 103
    check-cast v11, Ljava/lang/Long;

    .line 104
    .line 105
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 106
    .line 107
    .line 108
    move-result-wide v11

    .line 109
    invoke-virtual {v8, v11, v12}, Lcom/google/android/gms/internal/ads/zzayp;->zzc(J)Lcom/google/android/gms/internal/ads/zzayp;

    .line 110
    .line 111
    .line 112
    :cond_3
    const/4 v11, 0x5

    .line 113
    aget-object v11, v6, v11

    .line 114
    .line 115
    const-wide/16 v12, 0x0

    .line 116
    .line 117
    if-eqz v11, :cond_5

    .line 118
    .line 119
    check-cast v11, Ljava/lang/Long;

    .line 120
    .line 121
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 122
    .line 123
    .line 124
    move-result-wide v14

    .line 125
    cmp-long v11, v14, v12

    .line 126
    .line 127
    if-eqz v11, :cond_4

    .line 128
    .line 129
    move v11, v5

    .line 130
    goto :goto_0

    .line 131
    :cond_4
    move v11, v3

    .line 132
    :goto_0
    invoke-virtual {v8, v11}, Lcom/google/android/gms/internal/ads/zzayp;->zzs(I)Lcom/google/android/gms/internal/ads/zzayp;

    .line 133
    .line 134
    .line 135
    :cond_5
    const/4 v11, 0x6

    .line 136
    aget-object v11, v6, v11

    .line 137
    .line 138
    if-eqz v11, :cond_6

    .line 139
    .line 140
    check-cast v11, Ljava/lang/Long;

    .line 141
    .line 142
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 143
    .line 144
    .line 145
    move-result-wide v14

    .line 146
    invoke-virtual {v8, v14, v15}, Lcom/google/android/gms/internal/ads/zzayp;->zzj(J)Lcom/google/android/gms/internal/ads/zzayp;

    .line 147
    .line 148
    .line 149
    :cond_6
    const/4 v11, 0x7

    .line 150
    aget-object v11, v6, v11

    .line 151
    .line 152
    if-eqz v11, :cond_7

    .line 153
    .line 154
    check-cast v11, Ljava/lang/Long;

    .line 155
    .line 156
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 157
    .line 158
    .line 159
    move-result-wide v14

    .line 160
    invoke-virtual {v8, v14, v15}, Lcom/google/android/gms/internal/ads/zzayp;->zzi(J)Lcom/google/android/gms/internal/ads/zzayp;

    .line 161
    .line 162
    .line 163
    :cond_7
    const/16 v11, 0x8

    .line 164
    .line 165
    aget-object v6, v6, v11

    .line 166
    .line 167
    if-eqz v6, :cond_9

    .line 168
    .line 169
    check-cast v6, Ljava/lang/Long;

    .line 170
    .line 171
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 172
    .line 173
    .line 174
    move-result-wide v14

    .line 175
    cmp-long v6, v14, v12

    .line 176
    .line 177
    if-eqz v6, :cond_8

    .line 178
    .line 179
    move v6, v5

    .line 180
    goto :goto_1

    .line 181
    :cond_8
    move v6, v3

    .line 182
    :goto_1
    invoke-virtual {v8, v6}, Lcom/google/android/gms/internal/ads/zzayp;->zzt(I)Lcom/google/android/gms/internal/ads/zzayp;

    .line 183
    .line 184
    .line 185
    :cond_9
    monitor-enter p2

    .line 186
    :try_start_0
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzgjl;->zzb:Lcom/google/android/gms/internal/ads/zzgie;

    .line 187
    .line 188
    const-string v11, "8cUAbwpt6SKUQHhtSwuMmdGkTrID2QvHq2LA27x2GE3ivBr88edu7HCA+XurISAj"

    .line 189
    .line 190
    const-string v14, "khOZexiJY4Vla3osCKZbCsXRCvuYnTPcWDFUfUGsZNQ="

    .line 191
    .line 192
    invoke-interface {v6, v11, v14}, Lcom/google/android/gms/internal/ads/zzgie;->zzc(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    const/4 v11, 0x0

    .line 197
    if-eqz v6, :cond_1b

    .line 198
    .line 199
    const-string v14, "nv"

    .line 200
    .line 201
    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v14

    .line 205
    check-cast v14, Landroid/view/MotionEvent;

    .line 206
    .line 207
    const-string v15, ""

    .line 208
    .line 209
    move/from16 v16, v3

    .line 210
    .line 211
    new-array v3, v5, [Ljava/lang/Object;

    .line 212
    .line 213
    aput-object v14, v3, v7

    .line 214
    .line 215
    aput-object v4, v3, v16

    .line 216
    .line 217
    invoke-virtual {v6, v15, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    check-cast v3, [Ljava/lang/Object;

    .line 222
    .line 223
    if-eqz v3, :cond_1a

    .line 224
    .line 225
    aget-object v6, v3, v7

    .line 226
    .line 227
    if-eqz v6, :cond_a

    .line 228
    .line 229
    check-cast v6, Ljava/lang/Long;

    .line 230
    .line 231
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 232
    .line 233
    .line 234
    move-result-wide v14

    .line 235
    invoke-virtual {v2, v14, v15}, Lcom/google/android/gms/internal/ads/zzaxt;->zzh(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 236
    .line 237
    .line 238
    goto :goto_2

    .line 239
    :catchall_0
    move-exception v0

    .line 240
    goto/16 :goto_6

    .line 241
    .line 242
    :cond_a
    :goto_2
    aget-object v6, v3, v16

    .line 243
    .line 244
    if-eqz v6, :cond_b

    .line 245
    .line 246
    check-cast v6, Ljava/lang/Long;

    .line 247
    .line 248
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 249
    .line 250
    .line 251
    move-result-wide v14

    .line 252
    invoke-virtual {v2, v14, v15}, Lcom/google/android/gms/internal/ads/zzaxt;->zzi(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 253
    .line 254
    .line 255
    :cond_b
    aget-object v5, v3, v5

    .line 256
    .line 257
    if-eqz v5, :cond_c

    .line 258
    .line 259
    check-cast v5, Ljava/lang/Long;

    .line 260
    .line 261
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 262
    .line 263
    .line 264
    move-result-wide v5

    .line 265
    invoke-virtual {v2, v5, v6}, Lcom/google/android/gms/internal/ads/zzaxt;->zzj(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 266
    .line 267
    .line 268
    :cond_c
    aget-object v5, v3, v9

    .line 269
    .line 270
    if-eqz v5, :cond_d

    .line 271
    .line 272
    check-cast v5, Ljava/lang/Long;

    .line 273
    .line 274
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 275
    .line 276
    .line 277
    move-result-wide v5

    .line 278
    invoke-virtual {v2, v5, v6}, Lcom/google/android/gms/internal/ads/zzaxt;->zzv(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 279
    .line 280
    .line 281
    :cond_d
    aget-object v3, v3, v10

    .line 282
    .line 283
    if-eqz v3, :cond_e

    .line 284
    .line 285
    check-cast v3, Ljava/lang/Long;

    .line 286
    .line 287
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 288
    .line 289
    .line 290
    move-result-wide v5

    .line 291
    invoke-virtual {v2, v5, v6}, Lcom/google/android/gms/internal/ads/zzaxt;->zzw(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 292
    .line 293
    .line 294
    :cond_e
    const-string v3, "oe"

    .line 295
    .line 296
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    check-cast v3, Lcom/google/android/gms/internal/ads/zzggy;

    .line 301
    .line 302
    if-nez v3, :cond_f

    .line 303
    .line 304
    goto :goto_3

    .line 305
    :cond_f
    iget-wide v5, v3, Lcom/google/android/gms/internal/ads/zzggy;->zza:J

    .line 306
    .line 307
    cmp-long v9, v5, v12

    .line 308
    .line 309
    if-lez v9, :cond_10

    .line 310
    .line 311
    invoke-virtual {v2, v5, v6}, Lcom/google/android/gms/internal/ads/zzaxt;->zzz(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 312
    .line 313
    .line 314
    :cond_10
    iget-wide v5, v3, Lcom/google/android/gms/internal/ads/zzggy;->zzb:J

    .line 315
    .line 316
    cmp-long v9, v5, v12

    .line 317
    .line 318
    if-lez v9, :cond_11

    .line 319
    .line 320
    invoke-virtual {v2, v5, v6}, Lcom/google/android/gms/internal/ads/zzaxt;->zzy(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 321
    .line 322
    .line 323
    :cond_11
    iget-wide v5, v3, Lcom/google/android/gms/internal/ads/zzggy;->zzc:J

    .line 324
    .line 325
    cmp-long v9, v5, v12

    .line 326
    .line 327
    if-lez v9, :cond_12

    .line 328
    .line 329
    invoke-virtual {v2, v5, v6}, Lcom/google/android/gms/internal/ads/zzaxt;->zzx(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 330
    .line 331
    .line 332
    :cond_12
    iget-wide v5, v3, Lcom/google/android/gms/internal/ads/zzggy;->zzd:J

    .line 333
    .line 334
    cmp-long v3, v5, v12

    .line 335
    .line 336
    if-lez v3, :cond_13

    .line 337
    .line 338
    invoke-virtual {v2, v5, v6}, Lcom/google/android/gms/internal/ads/zzaxt;->zzA(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 339
    .line 340
    .line 341
    :cond_13
    :goto_3
    const-string v3, "oe"

    .line 342
    .line 343
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    check-cast v3, Lcom/google/android/gms/internal/ads/zzggy;

    .line 348
    .line 349
    if-nez v3, :cond_14

    .line 350
    .line 351
    goto/16 :goto_4

    .line 352
    .line 353
    :cond_14
    iget-wide v5, v3, Lcom/google/android/gms/internal/ads/zzggy;->zza:J

    .line 354
    .line 355
    cmp-long v5, v5, v12

    .line 356
    .line 357
    if-eqz v5, :cond_17

    .line 358
    .line 359
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzgjl;->zzc(Landroid/util/DisplayMetrics;)Z

    .line 360
    .line 361
    .line 362
    move-result v5

    .line 363
    if-eqz v5, :cond_17

    .line 364
    .line 365
    iget-wide v5, v3, Lcom/google/android/gms/internal/ads/zzggy;->zze:D

    .line 366
    .line 367
    if-eqz v4, :cond_16

    .line 368
    .line 369
    invoke-static {v5, v6, v4}, Lcom/google/android/gms/internal/ads/zzgjl;->zzb(DLandroid/util/DisplayMetrics;)J

    .line 370
    .line 371
    .line 372
    move-result-wide v5

    .line 373
    invoke-virtual {v8, v5, v6}, Lcom/google/android/gms/internal/ads/zzayp;->zzl(J)Lcom/google/android/gms/internal/ads/zzayp;

    .line 374
    .line 375
    .line 376
    iget v5, v3, Lcom/google/android/gms/internal/ads/zzggy;->zzh:F

    .line 377
    .line 378
    iget v6, v3, Lcom/google/android/gms/internal/ads/zzggy;->zzf:F

    .line 379
    .line 380
    sub-float/2addr v5, v6

    .line 381
    float-to-double v5, v5

    .line 382
    invoke-static {v5, v6, v4}, Lcom/google/android/gms/internal/ads/zzgjl;->zzb(DLandroid/util/DisplayMetrics;)J

    .line 383
    .line 384
    .line 385
    move-result-wide v5

    .line 386
    invoke-virtual {v8, v5, v6}, Lcom/google/android/gms/internal/ads/zzayp;->zzm(J)Lcom/google/android/gms/internal/ads/zzayp;

    .line 387
    .line 388
    .line 389
    iget v5, v3, Lcom/google/android/gms/internal/ads/zzggy;->zzi:F

    .line 390
    .line 391
    iget v6, v3, Lcom/google/android/gms/internal/ads/zzggy;->zzg:F

    .line 392
    .line 393
    sub-float/2addr v5, v6

    .line 394
    float-to-double v5, v5

    .line 395
    invoke-static {v5, v6, v4}, Lcom/google/android/gms/internal/ads/zzgjl;->zzb(DLandroid/util/DisplayMetrics;)J

    .line 396
    .line 397
    .line 398
    move-result-wide v5

    .line 399
    invoke-virtual {v8, v5, v6}, Lcom/google/android/gms/internal/ads/zzayp;->zzn(J)Lcom/google/android/gms/internal/ads/zzayp;

    .line 400
    .line 401
    .line 402
    iget v5, v3, Lcom/google/android/gms/internal/ads/zzggy;->zzf:F

    .line 403
    .line 404
    float-to-double v5, v5

    .line 405
    invoke-static {v5, v6, v4}, Lcom/google/android/gms/internal/ads/zzgjl;->zzb(DLandroid/util/DisplayMetrics;)J

    .line 406
    .line 407
    .line 408
    move-result-wide v5

    .line 409
    invoke-virtual {v8, v5, v6}, Lcom/google/android/gms/internal/ads/zzayp;->zzq(J)Lcom/google/android/gms/internal/ads/zzayp;

    .line 410
    .line 411
    .line 412
    iget v5, v3, Lcom/google/android/gms/internal/ads/zzggy;->zzg:F

    .line 413
    .line 414
    float-to-double v5, v5

    .line 415
    invoke-static {v5, v6, v4}, Lcom/google/android/gms/internal/ads/zzgjl;->zzb(DLandroid/util/DisplayMetrics;)J

    .line 416
    .line 417
    .line 418
    move-result-wide v5

    .line 419
    invoke-virtual {v8, v5, v6}, Lcom/google/android/gms/internal/ads/zzayp;->zzr(J)Lcom/google/android/gms/internal/ads/zzayp;

    .line 420
    .line 421
    .line 422
    const-string v5, "nv"

    .line 423
    .line 424
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v5

    .line 428
    check-cast v5, Landroid/view/MotionEvent;

    .line 429
    .line 430
    if-eqz v5, :cond_17

    .line 431
    .line 432
    iget v6, v3, Lcom/google/android/gms/internal/ads/zzggy;->zzf:F

    .line 433
    .line 434
    iget v9, v3, Lcom/google/android/gms/internal/ads/zzggy;->zzh:F

    .line 435
    .line 436
    sub-float/2addr v6, v9

    .line 437
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getRawX()F

    .line 438
    .line 439
    .line 440
    move-result v9

    .line 441
    add-float/2addr v6, v9

    .line 442
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getX()F

    .line 443
    .line 444
    .line 445
    move-result v9

    .line 446
    sub-float/2addr v6, v9

    .line 447
    float-to-double v9, v6

    .line 448
    invoke-static {v9, v10, v4}, Lcom/google/android/gms/internal/ads/zzgjl;->zzb(DLandroid/util/DisplayMetrics;)J

    .line 449
    .line 450
    .line 451
    move-result-wide v9

    .line 452
    cmp-long v6, v9, v12

    .line 453
    .line 454
    if-eqz v6, :cond_15

    .line 455
    .line 456
    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/internal/ads/zzayp;->zzo(J)Lcom/google/android/gms/internal/ads/zzayp;

    .line 457
    .line 458
    .line 459
    :cond_15
    iget v6, v3, Lcom/google/android/gms/internal/ads/zzggy;->zzg:F

    .line 460
    .line 461
    iget v3, v3, Lcom/google/android/gms/internal/ads/zzggy;->zzi:F

    .line 462
    .line 463
    sub-float/2addr v6, v3

    .line 464
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getRawY()F

    .line 465
    .line 466
    .line 467
    move-result v3

    .line 468
    add-float/2addr v6, v3

    .line 469
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getY()F

    .line 470
    .line 471
    .line 472
    move-result v3

    .line 473
    sub-float/2addr v6, v3

    .line 474
    float-to-double v5, v6

    .line 475
    invoke-static {v5, v6, v4}, Lcom/google/android/gms/internal/ads/zzgjl;->zzb(DLandroid/util/DisplayMetrics;)J

    .line 476
    .line 477
    .line 478
    move-result-wide v5

    .line 479
    cmp-long v3, v5, v12

    .line 480
    .line 481
    if-eqz v3, :cond_17

    .line 482
    .line 483
    invoke-virtual {v8, v5, v6}, Lcom/google/android/gms/internal/ads/zzayp;->zzp(J)Lcom/google/android/gms/internal/ads/zzayp;

    .line 484
    .line 485
    .line 486
    goto :goto_4

    .line 487
    :cond_16
    throw v11

    .line 488
    :cond_17
    :goto_4
    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/zzaxt;->zzJ(Lcom/google/android/gms/internal/ads/zzayp;)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 489
    .line 490
    .line 491
    const-string v3, "ro"

    .line 492
    .line 493
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    check-cast v0, [Lcom/google/android/gms/internal/ads/zzggz;

    .line 498
    .line 499
    if-eqz v0, :cond_19

    .line 500
    .line 501
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzgjl;->zzc(Landroid/util/DisplayMetrics;)Z

    .line 502
    .line 503
    .line 504
    move-result v3

    .line 505
    if-eqz v3, :cond_19

    .line 506
    .line 507
    :goto_5
    array-length v3, v0

    .line 508
    add-int/lit8 v3, v3, -0x2

    .line 509
    .line 510
    if-gt v7, v3, :cond_19

    .line 511
    .line 512
    aget-object v3, v0, v7

    .line 513
    .line 514
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzayq;->zza()Lcom/google/android/gms/internal/ads/zzayp;

    .line 515
    .line 516
    .line 517
    move-result-object v5

    .line 518
    iget v6, v3, Lcom/google/android/gms/internal/ads/zzggz;->zza:F

    .line 519
    .line 520
    float-to-double v8, v6

    .line 521
    if-eqz v4, :cond_18

    .line 522
    .line 523
    invoke-static {v8, v9, v4}, Lcom/google/android/gms/internal/ads/zzgjl;->zzb(DLandroid/util/DisplayMetrics;)J

    .line 524
    .line 525
    .line 526
    move-result-wide v8

    .line 527
    invoke-virtual {v5, v8, v9}, Lcom/google/android/gms/internal/ads/zzayp;->zza(J)Lcom/google/android/gms/internal/ads/zzayp;

    .line 528
    .line 529
    .line 530
    iget v3, v3, Lcom/google/android/gms/internal/ads/zzggz;->zzb:F

    .line 531
    .line 532
    float-to-double v8, v3

    .line 533
    invoke-static {v8, v9, v4}, Lcom/google/android/gms/internal/ads/zzgjl;->zzb(DLandroid/util/DisplayMetrics;)J

    .line 534
    .line 535
    .line 536
    move-result-wide v8

    .line 537
    invoke-virtual {v5, v8, v9}, Lcom/google/android/gms/internal/ads/zzayp;->zzb(J)Lcom/google/android/gms/internal/ads/zzayp;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zziej;->zzbm()Lcom/google/android/gms/internal/ads/zziep;

    .line 541
    .line 542
    .line 543
    move-result-object v3

    .line 544
    check-cast v3, Lcom/google/android/gms/internal/ads/zzayq;

    .line 545
    .line 546
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzaxt;->zzK(Lcom/google/android/gms/internal/ads/zzayq;)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 547
    .line 548
    .line 549
    add-int/lit8 v7, v7, 0x1

    .line 550
    .line 551
    goto :goto_5

    .line 552
    :cond_18
    throw v11

    .line 553
    :cond_19
    monitor-exit p2

    .line 554
    return-void

    .line 555
    :cond_1a
    throw v11

    .line 556
    :cond_1b
    throw v11

    .line 557
    :goto_6
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 558
    throw v0
.end method
