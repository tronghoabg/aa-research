.class final Lcom/google/android/gms/internal/ads/zzamm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/zzgug;

.field private static final zzb:Lcom/google/android/gms/internal/ads/zzgug;


# instance fields
.field private final zzc:Ljava/util/List;

.field private zzd:I

.field private zze:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x3a

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgtf;->zzd(C)Lcom/google/android/gms/internal/ads/zzgtf;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgug;->zza(Lcom/google/android/gms/internal/ads/zzgtf;)Lcom/google/android/gms/internal/ads/zzgug;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/google/android/gms/internal/ads/zzamm;->zza:Lcom/google/android/gms/internal/ads/zzgug;

    .line 12
    .line 13
    const/16 v0, 0x2a

    .line 14
    .line 15
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgtf;->zzd(C)Lcom/google/android/gms/internal/ads/zzgtf;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgug;->zza(Lcom/google/android/gms/internal/ads/zzgtf;)Lcom/google/android/gms/internal/ads/zzgug;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lcom/google/android/gms/internal/ads/zzamm;->zzb:Lcom/google/android/gms/internal/ads/zzgug;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzamm;->zzc:Ljava/util/List;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamm;->zzd:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzamm;->zzc:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzamm;->zzd:I

    .line 8
    .line 9
    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzaha;Ljava/util/List;)I
    .locals 30
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v1, Lcom/google/android/gms/internal/ads/zzamm;->zzd:I

    .line 8
    .line 9
    const/4 v6, 0x1

    .line 10
    if-eqz v3, :cond_12

    .line 11
    .line 12
    const/16 v7, 0x8

    .line 13
    .line 14
    const/4 v8, 0x2

    .line 15
    const/4 v9, 0x0

    .line 16
    if-eq v3, v6, :cond_10

    .line 17
    .line 18
    const/16 v12, 0xb01

    .line 19
    .line 20
    const/16 v13, 0xb00

    .line 21
    .line 22
    const/16 v14, 0x890

    .line 23
    .line 24
    const/4 v15, 0x3

    .line 25
    if-eq v3, v8, :cond_c

    .line 26
    .line 27
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 28
    .line 29
    .line 30
    move-result-wide v16

    .line 31
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzo()J

    .line 32
    .line 33
    .line 34
    move-result-wide v18

    .line 35
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 36
    .line 37
    .line 38
    move-result-wide v20

    .line 39
    sub-long v18, v18, v20

    .line 40
    .line 41
    iget v3, v1, Lcom/google/android/gms/internal/ads/zzamm;->zze:I

    .line 42
    .line 43
    int-to-long v4, v3

    .line 44
    new-instance v3, Lcom/google/android/gms/internal/ads/zzeu;

    .line 45
    .line 46
    sub-long v4, v18, v4

    .line 47
    .line 48
    long-to-int v4, v4

    .line 49
    invoke-direct {v3, v4}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-interface {v0, v5, v9, v4}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 57
    .line 58
    .line 59
    move v0, v9

    .line 60
    :goto_0
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzamm;->zzc:Ljava/util/List;

    .line 61
    .line 62
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-ge v0, v5, :cond_b

    .line 67
    .line 68
    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Lcom/google/android/gms/internal/ads/zzaml;

    .line 73
    .line 74
    iget-wide v9, v4, Lcom/google/android/gms/internal/ads/zzaml;->zza:J

    .line 75
    .line 76
    sub-long v9, v9, v16

    .line 77
    .line 78
    long-to-int v7, v9

    .line 79
    invoke-virtual {v3, v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 80
    .line 81
    .line 82
    const/4 v7, 0x4

    .line 83
    invoke-virtual {v3, v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    sget-object v10, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 91
    .line 92
    invoke-virtual {v3, v9, v10}, Lcom/google/android/gms/internal/ads/zzeu;->zzK(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 97
    .line 98
    .line 99
    move-result v19

    .line 100
    const/16 v22, -0x1

    .line 101
    .line 102
    sparse-switch v19, :sswitch_data_0

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :sswitch_0
    const-string v11, "Super_SlowMotion_BGM"

    .line 107
    .line 108
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-eqz v5, :cond_0

    .line 113
    .line 114
    move v5, v8

    .line 115
    goto :goto_2

    .line 116
    :sswitch_1
    const-string v11, "Super_SlowMotion_Deflickering_On"

    .line 117
    .line 118
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-eqz v5, :cond_0

    .line 123
    .line 124
    move v5, v7

    .line 125
    goto :goto_2

    .line 126
    :sswitch_2
    const-string v11, "Super_SlowMotion_Data"

    .line 127
    .line 128
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    if-eqz v5, :cond_0

    .line 133
    .line 134
    move v5, v6

    .line 135
    goto :goto_2

    .line 136
    :sswitch_3
    const-string v11, "Super_SlowMotion_Edit_Data"

    .line 137
    .line 138
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-eqz v5, :cond_0

    .line 143
    .line 144
    move v5, v15

    .line 145
    goto :goto_2

    .line 146
    :sswitch_4
    const-string v11, "SlowMotion_Data"

    .line 147
    .line 148
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    if-eqz v5, :cond_0

    .line 153
    .line 154
    const/4 v5, 0x0

    .line 155
    goto :goto_2

    .line 156
    :cond_0
    :goto_1
    move/from16 v5, v22

    .line 157
    .line 158
    :goto_2
    const/4 v11, 0x0

    .line 159
    if-eqz v5, :cond_5

    .line 160
    .line 161
    if-eq v5, v6, :cond_4

    .line 162
    .line 163
    if-eq v5, v8, :cond_3

    .line 164
    .line 165
    if-eq v5, v15, :cond_2

    .line 166
    .line 167
    if-ne v5, v7, :cond_1

    .line 168
    .line 169
    const/16 v5, 0xb04

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_1
    const-string v0, "Invalid SEF name"

    .line 173
    .line 174
    invoke-static {v0, v11}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    throw v0

    .line 179
    :cond_2
    const/16 v5, 0xb03

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_3
    move v5, v12

    .line 183
    goto :goto_3

    .line 184
    :cond_4
    move v5, v13

    .line 185
    goto :goto_3

    .line 186
    :cond_5
    move v5, v14

    .line 187
    :goto_3
    iget v4, v4, Lcom/google/android/gms/internal/ads/zzaml;->zzb:I

    .line 188
    .line 189
    add-int/lit8 v9, v9, 0x8

    .line 190
    .line 191
    sub-int/2addr v4, v9

    .line 192
    if-eq v5, v14, :cond_8

    .line 193
    .line 194
    if-eq v5, v13, :cond_7

    .line 195
    .line 196
    if-eq v5, v12, :cond_7

    .line 197
    .line 198
    const/16 v4, 0xb03

    .line 199
    .line 200
    if-eq v5, v4, :cond_7

    .line 201
    .line 202
    const/16 v4, 0xb04

    .line 203
    .line 204
    if-ne v5, v4, :cond_6

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 208
    .line 209
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 210
    .line 211
    .line 212
    throw v0

    .line 213
    :cond_7
    :goto_4
    move-object/from16 v7, p3

    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_8
    new-instance v7, Ljava/util/ArrayList;

    .line 217
    .line 218
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v3, v4, v10}, Lcom/google/android/gms/internal/ads/zzeu;->zzK(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    sget-object v5, Lcom/google/android/gms/internal/ads/zzamm;->zzb:Lcom/google/android/gms/internal/ads/zzgug;

    .line 226
    .line 227
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzgug;->zzg(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    const/4 v9, 0x0

    .line 232
    :goto_5
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 233
    .line 234
    .line 235
    move-result v5

    .line 236
    if-ge v9, v5, :cond_a

    .line 237
    .line 238
    sget-object v5, Lcom/google/android/gms/internal/ads/zzamm;->zza:Lcom/google/android/gms/internal/ads/zzgug;

    .line 239
    .line 240
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v10

    .line 244
    check-cast v10, Ljava/lang/CharSequence;

    .line 245
    .line 246
    invoke-virtual {v5, v10}, Lcom/google/android/gms/internal/ads/zzgug;->zzg(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object v10

    .line 250
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    if-ne v5, v15, :cond_9

    .line 255
    .line 256
    const/4 v5, 0x0

    .line 257
    :try_start_0
    invoke-interface {v10, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v23

    .line 261
    check-cast v23, Ljava/lang/String;

    .line 262
    .line 263
    invoke-static/range {v23 .. v23}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 264
    .line 265
    .line 266
    move-result-wide v25

    .line 267
    invoke-interface {v10, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v23

    .line 271
    check-cast v23, Ljava/lang/String;

    .line 272
    .line 273
    invoke-static/range {v23 .. v23}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 274
    .line 275
    .line 276
    move-result-wide v27

    .line 277
    invoke-interface {v10, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v10

    .line 281
    check-cast v10, Ljava/lang/String;

    .line 282
    .line 283
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 284
    .line 285
    .line 286
    move-result v10

    .line 287
    add-int/lit8 v10, v10, -0x1

    .line 288
    .line 289
    shl-int v29, v6, v10

    .line 290
    .line 291
    new-instance v24, Lcom/google/android/gms/internal/ads/zzajz;

    .line 292
    .line 293
    invoke-direct/range {v24 .. v29}, Lcom/google/android/gms/internal/ads/zzajz;-><init>(JJI)V

    .line 294
    .line 295
    .line 296
    move-object/from16 v10, v24

    .line 297
    .line 298
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 299
    .line 300
    .line 301
    add-int/lit8 v9, v9, 0x1

    .line 302
    .line 303
    goto :goto_5

    .line 304
    :catch_0
    move-exception v0

    .line 305
    invoke-static {v11, v0}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    throw v0

    .line 310
    :cond_9
    invoke-static {v11, v11}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    throw v0

    .line 315
    :cond_a
    new-instance v4, Lcom/google/android/gms/internal/ads/zzaka;

    .line 316
    .line 317
    invoke-direct {v4, v7}, Lcom/google/android/gms/internal/ads/zzaka;-><init>(Ljava/util/List;)V

    .line 318
    .line 319
    .line 320
    move-object/from16 v7, p3

    .line 321
    .line 322
    invoke-interface {v7, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    :goto_6
    add-int/lit8 v0, v0, 0x1

    .line 326
    .line 327
    const/4 v9, 0x0

    .line 328
    goto/16 :goto_0

    .line 329
    .line 330
    :cond_b
    const-wide/16 v9, 0x0

    .line 331
    .line 332
    iput-wide v9, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 333
    .line 334
    move v0, v6

    .line 335
    goto/16 :goto_b

    .line 336
    .line 337
    :cond_c
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzo()J

    .line 338
    .line 339
    .line 340
    move-result-wide v3

    .line 341
    iget v9, v1, Lcom/google/android/gms/internal/ads/zzamm;->zze:I

    .line 342
    .line 343
    add-int/lit8 v9, v9, -0x14

    .line 344
    .line 345
    new-instance v10, Lcom/google/android/gms/internal/ads/zzeu;

    .line 346
    .line 347
    invoke-direct {v10, v9}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 351
    .line 352
    .line 353
    move-result-object v11

    .line 354
    const/4 v5, 0x0

    .line 355
    invoke-interface {v0, v11, v5, v9}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 356
    .line 357
    .line 358
    const/4 v0, 0x0

    .line 359
    :goto_7
    div-int/lit8 v11, v9, 0xc

    .line 360
    .line 361
    if-ge v0, v11, :cond_e

    .line 362
    .line 363
    invoke-virtual {v10, v8}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzeu;->zzw()S

    .line 367
    .line 368
    .line 369
    move-result v11

    .line 370
    if-eq v11, v14, :cond_d

    .line 371
    .line 372
    if-eq v11, v13, :cond_d

    .line 373
    .line 374
    if-eq v11, v12, :cond_d

    .line 375
    .line 376
    const/16 v5, 0xb03

    .line 377
    .line 378
    if-eq v11, v5, :cond_d

    .line 379
    .line 380
    const/16 v5, 0xb04

    .line 381
    .line 382
    if-eq v11, v5, :cond_d

    .line 383
    .line 384
    invoke-virtual {v10, v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 385
    .line 386
    .line 387
    move/from16 p3, v9

    .line 388
    .line 389
    goto :goto_8

    .line 390
    :cond_d
    iget v5, v1, Lcom/google/android/gms/internal/ads/zzamm;->zze:I

    .line 391
    .line 392
    int-to-long v12, v5

    .line 393
    sub-long v12, v3, v12

    .line 394
    .line 395
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    .line 396
    .line 397
    .line 398
    move-result v5

    .line 399
    move/from16 p3, v9

    .line 400
    .line 401
    int-to-long v8, v5

    .line 402
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    .line 403
    .line 404
    .line 405
    move-result v5

    .line 406
    iget-object v14, v1, Lcom/google/android/gms/internal/ads/zzamm;->zzc:Ljava/util/List;

    .line 407
    .line 408
    new-instance v6, Lcom/google/android/gms/internal/ads/zzaml;

    .line 409
    .line 410
    sub-long/2addr v12, v8

    .line 411
    invoke-direct {v6, v11, v12, v13, v5}, Lcom/google/android/gms/internal/ads/zzaml;-><init>(IJI)V

    .line 412
    .line 413
    .line 414
    invoke-interface {v14, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    :goto_8
    add-int/lit8 v0, v0, 0x1

    .line 418
    .line 419
    move/from16 v9, p3

    .line 420
    .line 421
    const/4 v6, 0x1

    .line 422
    const/4 v8, 0x2

    .line 423
    const/16 v12, 0xb01

    .line 424
    .line 425
    const/16 v13, 0xb00

    .line 426
    .line 427
    const/16 v14, 0x890

    .line 428
    .line 429
    goto :goto_7

    .line 430
    :cond_e
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzamm;->zzc:Ljava/util/List;

    .line 431
    .line 432
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    if-eqz v3, :cond_f

    .line 437
    .line 438
    const-wide/16 v9, 0x0

    .line 439
    .line 440
    iput-wide v9, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 441
    .line 442
    :goto_9
    const/4 v0, 0x1

    .line 443
    goto :goto_b

    .line 444
    :cond_f
    iput v15, v1, Lcom/google/android/gms/internal/ads/zzamm;->zzd:I

    .line 445
    .line 446
    const/4 v5, 0x0

    .line 447
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    check-cast v0, Lcom/google/android/gms/internal/ads/zzaml;

    .line 452
    .line 453
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzaml;->zza:J

    .line 454
    .line 455
    iput-wide v3, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 456
    .line 457
    goto :goto_9

    .line 458
    :cond_10
    move v5, v9

    .line 459
    new-instance v3, Lcom/google/android/gms/internal/ads/zzeu;

    .line 460
    .line 461
    invoke-direct {v3, v7}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 465
    .line 466
    .line 467
    move-result-object v4

    .line 468
    invoke-interface {v0, v4, v5, v7}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    .line 472
    .line 473
    .line 474
    move-result v4

    .line 475
    add-int/2addr v4, v7

    .line 476
    iput v4, v1, Lcom/google/android/gms/internal/ads/zzamm;->zze:I

    .line 477
    .line 478
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 479
    .line 480
    .line 481
    move-result v3

    .line 482
    const v4, 0x53454654

    .line 483
    .line 484
    .line 485
    if-eq v3, v4, :cond_11

    .line 486
    .line 487
    const-wide/16 v9, 0x0

    .line 488
    .line 489
    iput-wide v9, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 490
    .line 491
    goto :goto_9

    .line 492
    :cond_11
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 493
    .line 494
    .line 495
    move-result-wide v3

    .line 496
    iget v0, v1, Lcom/google/android/gms/internal/ads/zzamm;->zze:I

    .line 497
    .line 498
    add-int/lit8 v0, v0, -0xc

    .line 499
    .line 500
    int-to-long v5, v0

    .line 501
    sub-long/2addr v3, v5

    .line 502
    iput-wide v3, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 503
    .line 504
    const/4 v0, 0x2

    .line 505
    iput v0, v1, Lcom/google/android/gms/internal/ads/zzamm;->zzd:I

    .line 506
    .line 507
    goto :goto_9

    .line 508
    :cond_12
    const-wide/16 v9, 0x0

    .line 509
    .line 510
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzo()J

    .line 511
    .line 512
    .line 513
    move-result-wide v3

    .line 514
    const-wide/16 v5, -0x1

    .line 515
    .line 516
    cmp-long v0, v3, v5

    .line 517
    .line 518
    if-eqz v0, :cond_13

    .line 519
    .line 520
    const-wide/16 v5, 0x8

    .line 521
    .line 522
    cmp-long v0, v3, v5

    .line 523
    .line 524
    if-gez v0, :cond_14

    .line 525
    .line 526
    :cond_13
    move-wide v4, v9

    .line 527
    goto :goto_a

    .line 528
    :cond_14
    const-wide/16 v5, -0x8

    .line 529
    .line 530
    add-long/2addr v3, v5

    .line 531
    move-wide v4, v3

    .line 532
    :goto_a
    iput-wide v4, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 533
    .line 534
    const/4 v0, 0x1

    .line 535
    iput v0, v1, Lcom/google/android/gms/internal/ads/zzamm;->zzd:I

    .line 536
    .line 537
    :goto_b
    return v0

    .line 538
    nop

    .line 539
    :sswitch_data_0
    .sparse-switch
        -0x6604662e -> :sswitch_4
        -0x4f6659e5 -> :sswitch_3
        -0x4a96a712 -> :sswitch_2
        -0x3182f331 -> :sswitch_1
        0x68f2d704 -> :sswitch_0
    .end sparse-switch
.end method
