.class final Lcom/google/android/gms/internal/ads/zzue;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/zzgwt;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/google/android/gms/internal/ads/zzue;->zza:Lcom/google/android/gms/internal/ads/zzgwt;

    .line 12
    .line 13
    return-void
.end method

.method public static zza(Landroid/media/AudioDeviceInfo;)Lcom/google/android/gms/internal/ads/zzgwt;
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zztx;->zza(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_6

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x1

    .line 18
    if-eq v0, v1, :cond_23

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x2

    .line 25
    if-ne v0, v2, :cond_2

    .line 26
    .line 27
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 28
    .line 29
    const/16 v2, 0x24

    .line 30
    .line 31
    if-lt v0, v2, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getSpeakerLayoutChannelMask()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    if-eq p0, v1, :cond_1

    .line 40
    .line 41
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_1
    const-string p0, "SpeakerLayoutUtil"

    .line 51
    .line 52
    const-string v0, "Built-in speaker\'s getSpeakerLayoutChannelMask not usable, defaulting to stereo."

    .line 53
    .line 54
    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Lcom/google/android/gms/internal/ads/zzue;->zza:Lcom/google/android/gms/internal/ads/zzgwt;

    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 61
    .line 62
    const/16 v3, 0x1f

    .line 63
    .line 64
    if-lt v0, v3, :cond_4

    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    const/16 v5, 0xa

    .line 71
    .line 72
    if-ne v4, v5, :cond_4

    .line 73
    .line 74
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzue;->zzb(Landroid/media/AudioDeviceInfo;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_3

    .line 83
    .line 84
    return-object v0

    .line 85
    :cond_3
    invoke-static {p0}, Lab/d;->o(Landroid/media/AudioDeviceInfo;)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzqs;->zza(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_22

    .line 98
    .line 99
    return-object p0

    .line 100
    :cond_4
    const/16 v4, 0xc

    .line 101
    .line 102
    if-lt v0, v3, :cond_1f

    .line 103
    .line 104
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-lt v0, v3, :cond_1f

    .line 109
    .line 110
    const/16 v6, 0x1d

    .line 111
    .line 112
    if-ne v5, v6, :cond_1f

    .line 113
    .line 114
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzue;->zzb(Landroid/media/AudioDeviceInfo;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-nez v5, :cond_5

    .line 123
    .line 124
    return-object v3

    .line 125
    :cond_5
    invoke-static {p0}, Lab/d;->o(Landroid/media/AudioDeviceInfo;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    const/16 v3, 0x22

    .line 130
    .line 131
    if-lt v0, v3, :cond_1e

    .line 132
    .line 133
    if-lt v0, v3, :cond_1c

    .line 134
    .line 135
    if-nez p0, :cond_6

    .line 136
    .line 137
    goto/16 :goto_2

    .line 138
    .line 139
    :cond_6
    new-instance v0, Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    :cond_7
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    if-eqz v6, :cond_1b

    .line 153
    .line 154
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    invoke-static {v6}, Lab/d;->f(Ljava/lang/Object;)Landroid/media/AudioDescriptor;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-static {v6}, Lab/d;->b(Landroid/media/AudioDescriptor;)I

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    if-ne v7, v2, :cond_7

    .line 167
    .line 168
    invoke-static {v6}, Lab/d;->C(Landroid/media/AudioDescriptor;)[B

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    array-length v7, v6

    .line 173
    const/4 v8, 0x3

    .line 174
    if-eq v7, v8, :cond_8

    .line 175
    .line 176
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 181
    .line 182
    .line 183
    move-result v6

    .line 184
    new-instance v8, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    add-int/lit8 v6, v6, 0x15

    .line 187
    .line 188
    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 189
    .line 190
    .line 191
    const-string v6, "Invalid SADB length: "

    .line 192
    .line 193
    const-string v9, "AudioDescriptorUtil"

    .line 194
    .line 195
    invoke-static {v8, v6, v7, v9}, Lcb/a;->v(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 196
    .line 197
    .line 198
    goto :goto_0

    .line 199
    :cond_8
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 200
    .line 201
    const/4 v8, 0x0

    .line 202
    if-lt v7, v3, :cond_1a

    .line 203
    .line 204
    aget-byte v7, v6, v8

    .line 205
    .line 206
    and-int/lit8 v9, v7, 0x1

    .line 207
    .line 208
    if-eq v1, v9, :cond_9

    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_9
    move v8, v4

    .line 212
    :goto_1
    and-int/lit8 v9, v7, 0x2

    .line 213
    .line 214
    if-eqz v9, :cond_a

    .line 215
    .line 216
    or-int/lit8 v8, v8, 0x20

    .line 217
    .line 218
    :cond_a
    and-int/lit8 v9, v7, 0x4

    .line 219
    .line 220
    if-eqz v9, :cond_b

    .line 221
    .line 222
    or-int/lit8 v8, v8, 0x10

    .line 223
    .line 224
    :cond_b
    and-int/lit8 v9, v7, 0x8

    .line 225
    .line 226
    if-eqz v9, :cond_c

    .line 227
    .line 228
    or-int/lit16 v8, v8, 0xc0

    .line 229
    .line 230
    :cond_c
    and-int/lit8 v9, v7, 0x10

    .line 231
    .line 232
    if-eqz v9, :cond_d

    .line 233
    .line 234
    or-int/lit16 v8, v8, 0x400

    .line 235
    .line 236
    :cond_d
    and-int/lit8 v9, v7, 0x20

    .line 237
    .line 238
    if-eqz v9, :cond_e

    .line 239
    .line 240
    or-int/lit16 v8, v8, 0x300

    .line 241
    .line 242
    :cond_e
    and-int/lit16 v7, v7, 0x80

    .line 243
    .line 244
    if-eqz v7, :cond_f

    .line 245
    .line 246
    const/high16 v7, 0xc000000

    .line 247
    .line 248
    or-int/2addr v8, v7

    .line 249
    :cond_f
    aget-byte v7, v6, v1

    .line 250
    .line 251
    and-int/lit8 v9, v7, 0x1

    .line 252
    .line 253
    if-eqz v9, :cond_10

    .line 254
    .line 255
    const v9, 0x14000

    .line 256
    .line 257
    .line 258
    or-int/2addr v8, v9

    .line 259
    :cond_10
    and-int/lit8 v9, v7, 0x2

    .line 260
    .line 261
    if-eqz v9, :cond_11

    .line 262
    .line 263
    or-int/lit16 v8, v8, 0x2000

    .line 264
    .line 265
    :cond_11
    and-int/lit8 v9, v7, 0x4

    .line 266
    .line 267
    if-eqz v9, :cond_12

    .line 268
    .line 269
    const v9, 0x8000

    .line 270
    .line 271
    .line 272
    or-int/2addr v8, v9

    .line 273
    :cond_12
    and-int/lit8 v9, v7, 0x8

    .line 274
    .line 275
    if-eqz v9, :cond_13

    .line 276
    .line 277
    or-int/lit16 v8, v8, 0x1800

    .line 278
    .line 279
    :cond_13
    and-int/lit8 v9, v7, 0x10

    .line 280
    .line 281
    if-eqz v9, :cond_14

    .line 282
    .line 283
    const/high16 v9, 0x2000000

    .line 284
    .line 285
    or-int/2addr v8, v9

    .line 286
    :cond_14
    and-int/lit8 v9, v7, 0x20

    .line 287
    .line 288
    if-eqz v9, :cond_15

    .line 289
    .line 290
    const/high16 v9, 0x40000

    .line 291
    .line 292
    or-int/2addr v8, v9

    .line 293
    :cond_15
    and-int/lit8 v9, v7, 0x40

    .line 294
    .line 295
    if-eqz v9, :cond_16

    .line 296
    .line 297
    or-int/lit16 v8, v8, 0x1800

    .line 298
    .line 299
    :cond_16
    and-int/lit16 v7, v7, 0x80

    .line 300
    .line 301
    if-eqz v7, :cond_17

    .line 302
    .line 303
    const/high16 v7, 0x300000

    .line 304
    .line 305
    or-int/2addr v8, v7

    .line 306
    :cond_17
    aget-byte v6, v6, v2

    .line 307
    .line 308
    and-int/lit8 v7, v6, 0x1

    .line 309
    .line 310
    if-eqz v7, :cond_18

    .line 311
    .line 312
    const/high16 v7, 0xa0000

    .line 313
    .line 314
    or-int/2addr v8, v7

    .line 315
    :cond_18
    and-int/lit8 v7, v6, 0x2

    .line 316
    .line 317
    if-eqz v7, :cond_19

    .line 318
    .line 319
    const/high16 v7, 0x800000

    .line 320
    .line 321
    or-int/2addr v7, v8

    .line 322
    move v8, v7

    .line 323
    :cond_19
    and-int/lit8 v6, v6, 0x4

    .line 324
    .line 325
    if-eqz v6, :cond_1a

    .line 326
    .line 327
    const/high16 v6, 0x1400000

    .line 328
    .line 329
    or-int/2addr v8, v6

    .line 330
    :cond_1a
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 331
    .line 332
    .line 333
    move-result-object v6

    .line 334
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    goto/16 :goto_0

    .line 338
    .line 339
    :cond_1b
    sget-object v1, Lcom/google/android/gms/internal/ads/zzqq;->zza:Lcom/google/android/gms/internal/ads/zzqq;

    .line 340
    .line 341
    invoke-static {v0, v1}, Lj$/util/List$-EL;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 342
    .line 343
    .line 344
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgwt;->zzq(Ljava/util/Collection;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    goto :goto_3

    .line 349
    :cond_1c
    :goto_2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgwt;->zzi()Lcom/google/android/gms/internal/ads/zzgwt;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    :goto_3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 354
    .line 355
    .line 356
    move-result v1

    .line 357
    if-eqz v1, :cond_1d

    .line 358
    .line 359
    goto :goto_4

    .line 360
    :cond_1d
    return-object v0

    .line 361
    :cond_1e
    :goto_4
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzqs;->zza(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    if-nez v0, :cond_22

    .line 370
    .line 371
    return-object p0

    .line 372
    :cond_1f
    if-lt v0, v3, :cond_22

    .line 373
    .line 374
    invoke-virtual {p0}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    const/16 v2, 0xb

    .line 379
    .line 380
    if-eq v1, v2, :cond_21

    .line 381
    .line 382
    if-ne v1, v4, :cond_20

    .line 383
    .line 384
    goto :goto_5

    .line 385
    :cond_20
    if-lt v0, v3, :cond_22

    .line 386
    .line 387
    const/16 v0, 0x16

    .line 388
    .line 389
    if-ne v1, v0, :cond_22

    .line 390
    .line 391
    :cond_21
    :goto_5
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzue;->zzb(Landroid/media/AudioDeviceInfo;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 392
    .line 393
    .line 394
    move-result-object p0

    .line 395
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    if-nez v0, :cond_22

    .line 400
    .line 401
    return-object p0

    .line 402
    :cond_22
    :goto_6
    sget-object p0, Lcom/google/android/gms/internal/ads/zzue;->zza:Lcom/google/android/gms/internal/ads/zzgwt;

    .line 403
    .line 404
    return-object p0

    .line 405
    :cond_23
    const/4 p0, 0x4

    .line 406
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 407
    .line 408
    .line 409
    move-result-object p0

    .line 410
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 411
    .line 412
    .line 413
    move-result-object p0

    .line 414
    return-object p0
.end method

.method private static zzb(Landroid/media/AudioDeviceInfo;)Lcom/google/android/gms/internal/ads/zzgwt;
    .locals 5

    .line 1
    invoke-static {p0}, Lab/d;->D(Landroid/media/AudioDeviceInfo;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/util/TreeSet;

    .line 6
    .line 7
    sget-object v1, Lcom/google/android/gms/internal/ads/zzud;->zza:Lcom/google/android/gms/internal/ads/zzud;

    .line 8
    .line 9
    invoke-static {v1}, Lj$/util/Comparator$-CC;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, Lj$/util/Comparator$-EL;->reversed(Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v1}, LV1/h;->c(Ljava/lang/Object;)Landroid/media/AudioProfile;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v1}, LV1/h;->b(Landroid/media/AudioProfile;)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const/4 v3, 0x1

    .line 43
    if-eq v2, v3, :cond_0

    .line 44
    .line 45
    invoke-static {v1}, LV1/h;->x(Landroid/media/AudioProfile;)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzfm;->zzE(I)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_0

    .line 54
    .line 55
    invoke-static {v1}, LV1/h;->w(Landroid/media/AudioProfile;)[I

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    array-length v2, v1

    .line 60
    const/4 v3, 0x0

    .line 61
    :goto_0
    if-ge v3, v2, :cond_0

    .line 62
    .line 63
    aget v4, v1, v3

    .line 64
    .line 65
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v0, v4}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    add-int/lit8 v3, v3, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgwt;->zzq(Ljava/util/Collection;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0
.end method
