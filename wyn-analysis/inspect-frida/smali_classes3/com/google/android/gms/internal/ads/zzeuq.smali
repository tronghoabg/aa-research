.class public final Lcom/google/android/gms/internal/ads/zzeuq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfcq;


# instance fields
.field final zza:Lcom/google/android/gms/internal/ads/zzflg;

.field private final zzb:J

.field private final zzc:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzflg;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeuq;->zza:Lcom/google/android/gms/internal/ads/zzflg;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzeuq;->zzb:J

    iput-wide p4, p0, Lcom/google/android/gms/internal/ads/zzeuq;->zzc:J

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Landroid/os/Bundle;

    .line 6
    .line 7
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzeuq;->zza:Lcom/google/android/gms/internal/ads/zzflg;

    .line 8
    .line 9
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzflg;->zzd:LD6/v1;

    .line 10
    .line 11
    iget v4, v3, LD6/v1;->w:I

    .line 12
    .line 13
    const-string v5, "http_timeout_millis"

    .line 14
    .line 15
    invoke-virtual {v1, v5, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    const-string v4, "slotname"

    .line 19
    .line 20
    iget-object v5, v2, Lcom/google/android/gms/internal/ads/zzflg;->zzg:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v1, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzflg;->zzp:Lcom/google/android/gms/internal/ads/zzfku;

    .line 26
    .line 27
    iget v4, v4, Lcom/google/android/gms/internal/ads/zzfku;->zza:I

    .line 28
    .line 29
    if-eqz v4, :cond_10

    .line 30
    .line 31
    const/4 v5, -0x1

    .line 32
    add-int/2addr v4, v5

    .line 33
    const/4 v6, 0x2

    .line 34
    const/4 v7, 0x1

    .line 35
    if-eq v4, v7, :cond_1

    .line 36
    .line 37
    if-eq v4, v6, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-string v4, "is_rewarded_interstitial"

    .line 41
    .line 42
    invoke-virtual {v1, v4, v7}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const-string v4, "is_new_rewarded"

    .line 47
    .line 48
    invoke-virtual {v1, v4, v7}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 49
    .line 50
    .line 51
    :goto_0
    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/zzeuq;->zzb:J

    .line 52
    .line 53
    const-string v4, "start_signals_timestamp"

    .line 54
    .line 55
    invoke-virtual {v1, v4, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 56
    .line 57
    .line 58
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbix;->zzpi:Lcom/google/android/gms/internal/ads/zzbio;

    .line 59
    .line 60
    sget-object v10, LD6/s;->e:LD6/s;

    .line 61
    .line 62
    iget-object v10, v10, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 63
    .line 64
    invoke-virtual {v10, v4}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    check-cast v4, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_2

    .line 75
    .line 76
    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/zzeuq;->zzc:J

    .line 77
    .line 78
    sub-long/2addr v8, v10

    .line 79
    const-string v4, "tsi"

    .line 80
    .line 81
    invoke-virtual {v1, v4, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 82
    .line 83
    .line 84
    :cond_2
    iget-object v4, v3, LD6/v1;->c:Landroid/os/Bundle;

    .line 85
    .line 86
    const-string v8, "is_sdk_preload"

    .line 87
    .line 88
    const/4 v9, 0x0

    .line 89
    invoke-virtual {v4, v8, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    invoke-static {v1, v8, v7, v10}, Lcom/google/android/gms/internal/ads/zzflv;->zzd(Landroid/os/Bundle;Ljava/lang/String;ZZ)V

    .line 94
    .line 95
    .line 96
    const-string v8, "zenith_v2"

    .line 97
    .line 98
    invoke-virtual {v4, v8, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    const-string v11, "prefetch_type"

    .line 103
    .line 104
    invoke-static {v1, v11, v8, v10}, Lcom/google/android/gms/internal/ads/zzflv;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 105
    .line 106
    .line 107
    new-instance v8, Ljava/text/SimpleDateFormat;

    .line 108
    .line 109
    const-string v10, "yyyyMMdd"

    .line 110
    .line 111
    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 112
    .line 113
    invoke-direct {v8, v10, v11}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 114
    .line 115
    .line 116
    new-instance v10, Ljava/util/Date;

    .line 117
    .line 118
    iget-wide v11, v3, LD6/v1;->b:J

    .line 119
    .line 120
    invoke-direct {v10, v11, v12}, Ljava/util/Date;-><init>(J)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v8, v10}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    const-wide/16 v13, -0x1

    .line 128
    .line 129
    cmp-long v10, v11, v13

    .line 130
    .line 131
    if-eqz v10, :cond_3

    .line 132
    .line 133
    move v10, v7

    .line 134
    goto :goto_1

    .line 135
    :cond_3
    move v10, v9

    .line 136
    :goto_1
    const-string v11, "cust_age"

    .line 137
    .line 138
    invoke-static {v1, v11, v8, v10}, Lcom/google/android/gms/internal/ads/zzflv;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 139
    .line 140
    .line 141
    const-string v8, "extras"

    .line 142
    .line 143
    invoke-static {v1, v8, v4}, Lcom/google/android/gms/internal/ads/zzflv;->zzf(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 144
    .line 145
    .line 146
    iget v4, v3, LD6/v1;->d:I

    .line 147
    .line 148
    if-eq v4, v5, :cond_4

    .line 149
    .line 150
    move v8, v7

    .line 151
    goto :goto_2

    .line 152
    :cond_4
    move v8, v9

    .line 153
    :goto_2
    const-string v10, "cust_gender"

    .line 154
    .line 155
    invoke-static {v1, v10, v4, v8}, Lcom/google/android/gms/internal/ads/zzflv;->zzc(Landroid/os/Bundle;Ljava/lang/String;IZ)V

    .line 156
    .line 157
    .line 158
    iget-object v4, v3, LD6/v1;->e:Ljava/util/List;

    .line 159
    .line 160
    const-string v8, "kw"

    .line 161
    .line 162
    invoke-static {v1, v8, v4}, Lcom/google/android/gms/internal/ads/zzflv;->zzg(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V

    .line 163
    .line 164
    .line 165
    iget v4, v3, LD6/v1;->g:I

    .line 166
    .line 167
    if-eq v4, v5, :cond_5

    .line 168
    .line 169
    move v8, v7

    .line 170
    goto :goto_3

    .line 171
    :cond_5
    move v8, v9

    .line 172
    :goto_3
    const-string v10, "tag_for_child_directed_treatment"

    .line 173
    .line 174
    invoke-static {v1, v10, v4, v8}, Lcom/google/android/gms/internal/ads/zzflv;->zzc(Landroid/os/Bundle;Ljava/lang/String;IZ)V

    .line 175
    .line 176
    .line 177
    iget-boolean v4, v3, LD6/v1;->f:Z

    .line 178
    .line 179
    if-eqz v4, :cond_6

    .line 180
    .line 181
    const-string v4, "test_request"

    .line 182
    .line 183
    invoke-virtual {v1, v4, v7}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 184
    .line 185
    .line 186
    :cond_6
    iget v4, v3, LD6/v1;->y:I

    .line 187
    .line 188
    const-string v8, "ppt_p13n"

    .line 189
    .line 190
    invoke-virtual {v1, v8, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 191
    .line 192
    .line 193
    iget v4, v3, LD6/v1;->a:I

    .line 194
    .line 195
    if-lt v4, v6, :cond_7

    .line 196
    .line 197
    iget-boolean v8, v3, LD6/v1;->h:Z

    .line 198
    .line 199
    if-eqz v8, :cond_7

    .line 200
    .line 201
    move v8, v7

    .line 202
    goto :goto_4

    .line 203
    :cond_7
    move v8, v9

    .line 204
    :goto_4
    const-string v10, "d_imp_hdr"

    .line 205
    .line 206
    invoke-static {v1, v10, v7, v8}, Lcom/google/android/gms/internal/ads/zzflv;->zzc(Landroid/os/Bundle;Ljava/lang/String;IZ)V

    .line 207
    .line 208
    .line 209
    iget-object v8, v3, LD6/v1;->i:Ljava/lang/String;

    .line 210
    .line 211
    if-lt v4, v6, :cond_8

    .line 212
    .line 213
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    if-nez v6, :cond_8

    .line 218
    .line 219
    move v6, v7

    .line 220
    goto :goto_5

    .line 221
    :cond_8
    move v6, v9

    .line 222
    :goto_5
    const-string v10, "ppid"

    .line 223
    .line 224
    invoke-static {v1, v10, v8, v6}, Lcom/google/android/gms/internal/ads/zzflv;->zzb(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 225
    .line 226
    .line 227
    iget-object v6, v3, LD6/v1;->k:Landroid/location/Location;

    .line 228
    .line 229
    if-eqz v6, :cond_9

    .line 230
    .line 231
    invoke-virtual {v6}, Landroid/location/Location;->getAccuracy()F

    .line 232
    .line 233
    .line 234
    move-result v8

    .line 235
    const/high16 v10, 0x447a0000    # 1000.0f

    .line 236
    .line 237
    mul-float/2addr v8, v10

    .line 238
    invoke-virtual {v6}, Landroid/location/Location;->getTime()J

    .line 239
    .line 240
    .line 241
    move-result-wide v10

    .line 242
    const-wide/16 v12, 0x3e8

    .line 243
    .line 244
    mul-long/2addr v10, v12

    .line 245
    invoke-virtual {v6}, Landroid/location/Location;->getLatitude()D

    .line 246
    .line 247
    .line 248
    move-result-wide v12

    .line 249
    const-wide v14, 0x416312d000000000L    # 1.0E7

    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    mul-double/2addr v12, v14

    .line 255
    invoke-virtual {v6}, Landroid/location/Location;->getLongitude()D

    .line 256
    .line 257
    .line 258
    move-result-wide v16

    .line 259
    mul-double v14, v14, v16

    .line 260
    .line 261
    new-instance v6, Landroid/os/Bundle;

    .line 262
    .line 263
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 264
    .line 265
    .line 266
    const-string v9, "radius"

    .line 267
    .line 268
    invoke-virtual {v6, v9, v8}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 269
    .line 270
    .line 271
    const-string v8, "lat"

    .line 272
    .line 273
    double-to-long v12, v12

    .line 274
    invoke-virtual {v6, v8, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 275
    .line 276
    .line 277
    const-string v8, "long"

    .line 278
    .line 279
    double-to-long v12, v14

    .line 280
    invoke-virtual {v6, v8, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 281
    .line 282
    .line 283
    const-string v8, "time"

    .line 284
    .line 285
    invoke-virtual {v6, v8, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 286
    .line 287
    .line 288
    const-string v8, "uule"

    .line 289
    .line 290
    invoke-virtual {v1, v8, v6}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 291
    .line 292
    .line 293
    :cond_9
    iget-object v6, v3, LD6/v1;->l:Ljava/lang/String;

    .line 294
    .line 295
    const-string v8, "url"

    .line 296
    .line 297
    invoke-static {v1, v8, v6}, Lcom/google/android/gms/internal/ads/zzflv;->zze(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    iget-object v6, v3, LD6/v1;->v:Ljava/util/List;

    .line 301
    .line 302
    const-string v8, "neighboring_content_urls"

    .line 303
    .line 304
    invoke-static {v1, v8, v6}, Lcom/google/android/gms/internal/ads/zzflv;->zzg(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V

    .line 305
    .line 306
    .line 307
    iget-object v6, v3, LD6/v1;->n:Landroid/os/Bundle;

    .line 308
    .line 309
    const-string v8, "custom_targeting"

    .line 310
    .line 311
    invoke-static {v1, v8, v6}, Lcom/google/android/gms/internal/ads/zzflv;->zzf(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 312
    .line 313
    .line 314
    iget-object v6, v3, LD6/v1;->o:Ljava/util/List;

    .line 315
    .line 316
    const-string v8, "category_exclusions"

    .line 317
    .line 318
    invoke-static {v1, v8, v6}, Lcom/google/android/gms/internal/ads/zzflv;->zzg(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V

    .line 319
    .line 320
    .line 321
    iget-object v6, v3, LD6/v1;->p:Ljava/lang/String;

    .line 322
    .line 323
    const-string v8, "request_agent"

    .line 324
    .line 325
    invoke-static {v1, v8, v6}, Lcom/google/android/gms/internal/ads/zzflv;->zze(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    iget-object v6, v3, LD6/v1;->q:Ljava/lang/String;

    .line 329
    .line 330
    const-string v8, "request_pkg"

    .line 331
    .line 332
    invoke-static {v1, v8, v6}, Lcom/google/android/gms/internal/ads/zzflv;->zze(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    const/4 v6, 0x7

    .line 336
    if-lt v4, v6, :cond_a

    .line 337
    .line 338
    move v6, v7

    .line 339
    goto :goto_6

    .line 340
    :cond_a
    const/4 v6, 0x0

    .line 341
    :goto_6
    const-string v8, "is_designed_for_families"

    .line 342
    .line 343
    iget-boolean v9, v3, LD6/v1;->r:Z

    .line 344
    .line 345
    invoke-static {v1, v8, v9, v6}, Lcom/google/android/gms/internal/ads/zzflv;->zzd(Landroid/os/Bundle;Ljava/lang/String;ZZ)V

    .line 346
    .line 347
    .line 348
    const/16 v6, 0x8

    .line 349
    .line 350
    if-lt v4, v6, :cond_c

    .line 351
    .line 352
    iget v4, v3, LD6/v1;->t:I

    .line 353
    .line 354
    if-eq v4, v5, :cond_b

    .line 355
    .line 356
    move v6, v7

    .line 357
    goto :goto_7

    .line 358
    :cond_b
    const/4 v6, 0x0

    .line 359
    :goto_7
    const-string v8, "tag_for_under_age_of_consent"

    .line 360
    .line 361
    invoke-static {v1, v8, v4, v6}, Lcom/google/android/gms/internal/ads/zzflv;->zzc(Landroid/os/Bundle;Ljava/lang/String;IZ)V

    .line 362
    .line 363
    .line 364
    iget-object v4, v3, LD6/v1;->u:Ljava/lang/String;

    .line 365
    .line 366
    const-string v6, "max_ad_content_rating"

    .line 367
    .line 368
    invoke-static {v1, v6, v4}, Lcom/google/android/gms/internal/ads/zzflv;->zze(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    :cond_c
    iget v4, v3, LD6/v1;->B:I

    .line 372
    .line 373
    if-eq v4, v5, :cond_d

    .line 374
    .line 375
    move v5, v7

    .line 376
    goto :goto_8

    .line 377
    :cond_d
    const/4 v5, 0x0

    .line 378
    :goto_8
    const-string v6, "tfat"

    .line 379
    .line 380
    invoke-static {v1, v6, v4, v5}, Lcom/google/android/gms/internal/ads/zzflv;->zzc(Landroid/os/Bundle;Ljava/lang/String;IZ)V

    .line 381
    .line 382
    .line 383
    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzflg;->zze:Landroid/os/Bundle;

    .line 384
    .line 385
    const-string v5, "plcs"

    .line 386
    .line 387
    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 388
    .line 389
    .line 390
    move-result v6

    .line 391
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 392
    .line 393
    .line 394
    move-result-object v6

    .line 395
    invoke-static {v1, v5, v6}, Lcom/google/android/gms/internal/ads/zzflv;->zzh(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 396
    .line 397
    .line 398
    const-string v5, "plbs"

    .line 399
    .line 400
    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 401
    .line 402
    .line 403
    move-result v6

    .line 404
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object v6

    .line 408
    invoke-static {v1, v5, v6}, Lcom/google/android/gms/internal/ads/zzflv;->zzh(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 409
    .line 410
    .line 411
    const-string v5, "plid"

    .line 412
    .line 413
    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v4

    .line 417
    invoke-static {v1, v5, v4}, Lcom/google/android/gms/internal/ads/zzflv;->zze(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/zzflg;->zzv:Z

    .line 421
    .line 422
    if-eqz v2, :cond_f

    .line 423
    .line 424
    iget-object v2, v3, LD6/v1;->s:LD6/Q;

    .line 425
    .line 426
    if-nez v2, :cond_e

    .line 427
    .line 428
    iget-object v2, v3, LD6/v1;->x:Ljava/lang/String;

    .line 429
    .line 430
    if-eqz v2, :cond_f

    .line 431
    .line 432
    :cond_e
    move v9, v7

    .line 433
    goto :goto_9

    .line 434
    :cond_f
    const/4 v9, 0x0

    .line 435
    :goto_9
    const-string v2, "s2s_rr"

    .line 436
    .line 437
    invoke-static {v1, v2, v7, v9}, Lcom/google/android/gms/internal/ads/zzflv;->zzc(Landroid/os/Bundle;Ljava/lang/String;IZ)V

    .line 438
    .line 439
    .line 440
    return-void

    .line 441
    :cond_10
    const/4 v1, 0x0

    .line 442
    throw v1
.end method
