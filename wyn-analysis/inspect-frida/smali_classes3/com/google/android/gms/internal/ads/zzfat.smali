.class public final Lcom/google/android/gms/internal/ads/zzfat;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfcq;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzflg;

.field private final zzb:Landroid/content/pm/PackageInfo;

.field private final zzc:LG6/N;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzflg;Landroid/content/pm/PackageInfo;LG6/N;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfat;->zza:Lcom/google/android/gms/internal/ads/zzflg;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfat;->zzb:Landroid/content/pm/PackageInfo;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfat;->zzc:LG6/N;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfat;->zza:Lcom/google/android/gms/internal/ads/zzflg;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzflg;->zzh:Ljava/util/ArrayList;

    .line 4
    .line 5
    check-cast p1, Landroid/os/Bundle;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_5

    .line 10
    .line 11
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    const-string v0, "native_version"

    .line 19
    .line 20
    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const-string v2, "native_version"

    .line 25
    .line 26
    const/4 v4, 0x3

    .line 27
    invoke-virtual {p1, v2, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 28
    .line 29
    .line 30
    const-string v2, "native_templates"

    .line 31
    .line 32
    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzflg;->zzi:Ljava/util/ArrayList;

    .line 36
    .line 37
    const-string v2, "native_custom_templates"

    .line 38
    .line 39
    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzflg;->zzj:Lcom/google/android/gms/internal/ads/zzbma;

    .line 43
    .line 44
    const/4 v2, 0x2

    .line 45
    const/4 v5, 0x1

    .line 46
    if-eqz v1, :cond_b

    .line 47
    .line 48
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzbma;->zza:I

    .line 49
    .line 50
    if-le v6, v4, :cond_6

    .line 51
    .line 52
    const-string v6, "enable_native_media_orientation"

    .line 53
    .line 54
    invoke-virtual {p1, v6, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 55
    .line 56
    .line 57
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzbma;->zzh:I

    .line 58
    .line 59
    if-eq v6, v5, :cond_5

    .line 60
    .line 61
    if-eq v6, v2, :cond_4

    .line 62
    .line 63
    if-eq v6, v4, :cond_3

    .line 64
    .line 65
    const/4 v7, 0x4

    .line 66
    if-eq v6, v7, :cond_2

    .line 67
    .line 68
    const-string v6, "unknown"

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    const-string v6, "square"

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    const-string v6, "portrait"

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    const-string v6, "landscape"

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_5
    const-string v6, "any"

    .line 81
    .line 82
    :goto_0
    const-string v7, "unknown"

    .line 83
    .line 84
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-nez v7, :cond_6

    .line 89
    .line 90
    const-string v7, "native_media_orientation"

    .line 91
    .line 92
    invoke-virtual {p1, v7, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_6
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzbma;->zzc:I

    .line 96
    .line 97
    if-eqz v6, :cond_9

    .line 98
    .line 99
    if-eq v6, v5, :cond_8

    .line 100
    .line 101
    if-eq v6, v2, :cond_7

    .line 102
    .line 103
    const-string v6, "unknown"

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_7
    const-string v6, "landscape"

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_8
    const-string v6, "portrait"

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_9
    const-string v6, "any"

    .line 113
    .line 114
    :goto_1
    const-string v7, "unknown"

    .line 115
    .line 116
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-nez v7, :cond_a

    .line 121
    .line 122
    const-string v7, "native_image_orientation"

    .line 123
    .line 124
    invoke-virtual {p1, v7, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    :cond_a
    iget-boolean v6, v1, Lcom/google/android/gms/internal/ads/zzbma;->zzd:Z

    .line 128
    .line 129
    const-string v7, "native_multiple_images"

    .line 130
    .line 131
    invoke-virtual {p1, v7, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 132
    .line 133
    .line 134
    iget-boolean v6, v1, Lcom/google/android/gms/internal/ads/zzbma;->zzg:Z

    .line 135
    .line 136
    const-string v7, "use_custom_mute"

    .line 137
    .line 138
    invoke-virtual {p1, v7, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 139
    .line 140
    .line 141
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzbma;->zzi:I

    .line 142
    .line 143
    if-eqz v6, :cond_b

    .line 144
    .line 145
    iget-boolean v7, v1, Lcom/google/android/gms/internal/ads/zzbma;->zzj:Z

    .line 146
    .line 147
    const-string v8, "sccg_tap"

    .line 148
    .line 149
    invoke-virtual {p1, v8, v7}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 150
    .line 151
    .line 152
    const-string v7, "sccg_dir"

    .line 153
    .line 154
    invoke-virtual {p1, v7, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 155
    .line 156
    .line 157
    :cond_b
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzfat;->zzb:Landroid/content/pm/PackageInfo;

    .line 158
    .line 159
    if-nez v6, :cond_c

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_c
    iget v3, v6, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 163
    .line 164
    :goto_2
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzfat;->zzc:LG6/N;

    .line 165
    .line 166
    check-cast v6, LG6/O;

    .line 167
    .line 168
    invoke-virtual {v6}, LG6/O;->l()V

    .line 169
    .line 170
    .line 171
    iget-object v7, v6, LG6/O;->a:Ljava/lang/Object;

    .line 172
    .line 173
    monitor-enter v7

    .line 174
    :try_start_0
    iget v8, v6, LG6/O;->r:I

    .line 175
    .line 176
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    if-le v3, v8, :cond_d

    .line 178
    .line 179
    invoke-virtual {v6}, LG6/O;->z()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v6, v3}, LG6/O;->q(I)V

    .line 183
    .line 184
    .line 185
    :cond_d
    invoke-virtual {v6}, LG6/O;->y()Lorg/json/JSONObject;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    const/4 v6, 0x0

    .line 190
    if-eqz v3, :cond_e

    .line 191
    .line 192
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzflg;->zzg:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v3, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    if-eqz v3, :cond_e

    .line 199
    .line 200
    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    :cond_e
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-nez v3, :cond_f

    .line 209
    .line 210
    const-string v3, "native_advanced_settings"

    .line 211
    .line 212
    invoke-virtual {p1, v3, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    :cond_f
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzflg;->zzl:I

    .line 216
    .line 217
    if-le v3, v5, :cond_10

    .line 218
    .line 219
    const-string v6, "max_num_ads"

    .line 220
    .line 221
    invoke-virtual {p1, v6, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 222
    .line 223
    .line 224
    :cond_10
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzflg;->zzb:Lcom/google/android/gms/internal/ads/zzbsi;

    .line 225
    .line 226
    if-eqz v0, :cond_17

    .line 227
    .line 228
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzbsi;->zzc:Ljava/lang/String;

    .line 229
    .line 230
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 231
    .line 232
    .line 233
    move-result v6

    .line 234
    if-eqz v6, :cond_16

    .line 235
    .line 236
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzbsi;->zza:I

    .line 237
    .line 238
    if-lt v3, v2, :cond_13

    .line 239
    .line 240
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzbsi;->zzd:I

    .line 241
    .line 242
    if-eq v0, v2, :cond_12

    .line 243
    .line 244
    if-eq v0, v4, :cond_11

    .line 245
    .line 246
    const-string v0, "l"

    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_11
    const-string v0, "p"

    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_12
    const-string v0, "l"

    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_13
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzbsi;->zzb:I

    .line 256
    .line 257
    if-eq v0, v5, :cond_14

    .line 258
    .line 259
    if-eq v0, v2, :cond_15

    .line 260
    .line 261
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    new-instance v3, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    add-int/lit8 v2, v2, 0x29

    .line 272
    .line 273
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 274
    .line 275
    .line 276
    const-string v2, "Instream ad video aspect ratio "

    .line 277
    .line 278
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    const-string v0, " is wrong."

    .line 285
    .line 286
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-static {v0}, LH6/l;->c(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    :cond_14
    const-string v0, "l"

    .line 297
    .line 298
    goto :goto_3

    .line 299
    :cond_15
    const-string v0, "p"

    .line 300
    .line 301
    :goto_3
    const-string v2, "ia_var"

    .line 302
    .line 303
    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    goto :goto_4

    .line 307
    :cond_16
    const-string v0, "ad_tag"

    .line 308
    .line 309
    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    :goto_4
    const-string v0, "instr"

    .line 313
    .line 314
    invoke-virtual {p1, v0, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 315
    .line 316
    .line 317
    :cond_17
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zznA:Lcom/google/android/gms/internal/ads/zzbio;

    .line 318
    .line 319
    sget-object v2, LD6/s;->e:LD6/s;

    .line 320
    .line 321
    iget-object v2, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 322
    .line 323
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    check-cast v0, Ljava/lang/Boolean;

    .line 328
    .line 329
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-eqz v0, :cond_19

    .line 334
    .line 335
    if-eqz v1, :cond_19

    .line 336
    .line 337
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzbma;->zzf:LD6/r1;

    .line 338
    .line 339
    if-eqz v0, :cond_18

    .line 340
    .line 341
    new-instance v2, Landroid/os/Bundle;

    .line 342
    .line 343
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 344
    .line 345
    .line 346
    const-string v3, "startMuted"

    .line 347
    .line 348
    iget-boolean v4, v0, LD6/r1;->a:Z

    .line 349
    .line 350
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 351
    .line 352
    .line 353
    const-string v3, "clickToExpandRequested"

    .line 354
    .line 355
    iget-boolean v4, v0, LD6/r1;->c:Z

    .line 356
    .line 357
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 358
    .line 359
    .line 360
    const-string v3, "customControlsRequested"

    .line 361
    .line 362
    iget-boolean v0, v0, LD6/r1;->b:Z

    .line 363
    .line 364
    invoke-virtual {v2, v3, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 365
    .line 366
    .line 367
    const-string v0, "video"

    .line 368
    .line 369
    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 370
    .line 371
    .line 372
    :cond_18
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzbma;->zzb:Z

    .line 373
    .line 374
    const-string v2, "disable_image_loading"

    .line 375
    .line 376
    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 377
    .line 378
    .line 379
    iget v0, v1, Lcom/google/android/gms/internal/ads/zzbma;->zze:I

    .line 380
    .line 381
    const-string v1, "preferred_ad_choices_position"

    .line 382
    .line 383
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 384
    .line 385
    .line 386
    :cond_19
    :goto_5
    return-void

    .line 387
    :catchall_0
    move-exception p1

    .line 388
    :try_start_1
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 389
    throw p1
.end method
