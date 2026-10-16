.class public abstract Lcom/google/android/gms/internal/ads/zzepa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzema;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static zzd(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzfky;Lcom/google/android/gms/internal/ads/zzfkn;)Z
    .locals 1

    .line 1
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzfkn;->zzv:Lorg/json/JSONObject;

    .line 2
    .line 3
    const-string p2, "pubid"

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzfky;Lcom/google/android/gms/internal/ads/zzfkn;)Lp8/p;
    .locals 40

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzv:Lorg/json/JSONObject;

    .line 6
    .line 7
    const-string v3, "pubid"

    .line 8
    .line 9
    const-string v4, ""

    .line 10
    .line 11
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzfky;->zza:Lcom/google/android/gms/internal/ads/zzfkv;

    .line 16
    .line 17
    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzfkv;->zza:Lcom/google/android/gms/internal/ads/zzflg;

    .line 18
    .line 19
    new-instance v5, Lcom/google/android/gms/internal/ads/zzflf;

    .line 20
    .line 21
    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/zzflf;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzflf;->zzA(Lcom/google/android/gms/internal/ads/zzflg;)Lcom/google/android/gms/internal/ads/zzflf;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/ads/zzflf;->zzg(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzflf;

    .line 28
    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/ads/zzflf;->zzy(Z)Lcom/google/android/gms/internal/ads/zzflf;

    .line 32
    .line 33
    .line 34
    iget-object v6, v4, Lcom/google/android/gms/internal/ads/zzflg;->zzd:LD6/v1;

    .line 35
    .line 36
    iget-object v7, v6, LD6/v1;->m:Landroid/os/Bundle;

    .line 37
    .line 38
    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzepa;->zzd(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    const-string v8, "com.google.ads.mediation.admob.AdMobAdapter"

    .line 43
    .line 44
    invoke-virtual {v7, v8}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    invoke-static {v9}, Lcom/google/android/gms/internal/ads/zzepa;->zzd(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 49
    .line 50
    .line 51
    move-result-object v12

    .line 52
    const-string v9, "gw"

    .line 53
    .line 54
    invoke-virtual {v12, v9, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    const-string v9, "mad_hac"

    .line 58
    .line 59
    const/4 v10, 0x0

    .line 60
    invoke-virtual {v2, v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    if-eqz v11, :cond_0

    .line 65
    .line 66
    invoke-virtual {v12, v9, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_0
    const-string v9, "adJson"

    .line 70
    .line 71
    invoke-virtual {v2, v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    if-eqz v2, :cond_1

    .line 76
    .line 77
    const-string v9, "_ad"

    .line 78
    .line 79
    invoke-virtual {v12, v9, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_1
    const-string v2, "_noRefresh"

    .line 83
    .line 84
    invoke-virtual {v12, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 85
    .line 86
    .line 87
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzD:Lorg/json/JSONObject;

    .line 88
    .line 89
    invoke-virtual {v2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    :cond_2
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    if-eqz v11, :cond_3

    .line 98
    .line 99
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    check-cast v11, Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {v2, v11, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v13

    .line 109
    if-eqz v11, :cond_2

    .line 110
    .line 111
    invoke-virtual {v12, v11, v13}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_3
    invoke-virtual {v7, v8, v12}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 116
    .line 117
    .line 118
    new-instance v8, LD6/v1;

    .line 119
    .line 120
    iget v9, v6, LD6/v1;->a:I

    .line 121
    .line 122
    iget-wide v10, v6, LD6/v1;->b:J

    .line 123
    .line 124
    iget v13, v6, LD6/v1;->d:I

    .line 125
    .line 126
    iget-object v14, v6, LD6/v1;->e:Ljava/util/List;

    .line 127
    .line 128
    iget-boolean v15, v6, LD6/v1;->f:Z

    .line 129
    .line 130
    iget v2, v6, LD6/v1;->g:I

    .line 131
    .line 132
    iget-boolean v3, v6, LD6/v1;->h:Z

    .line 133
    .line 134
    move/from16 v16, v2

    .line 135
    .line 136
    iget-object v2, v6, LD6/v1;->i:Ljava/lang/String;

    .line 137
    .line 138
    move-object/from16 v18, v2

    .line 139
    .line 140
    iget-object v2, v6, LD6/v1;->j:LD6/q1;

    .line 141
    .line 142
    move-object/from16 v19, v2

    .line 143
    .line 144
    iget-object v2, v6, LD6/v1;->k:Landroid/location/Location;

    .line 145
    .line 146
    move-object/from16 v20, v2

    .line 147
    .line 148
    iget-object v2, v6, LD6/v1;->l:Ljava/lang/String;

    .line 149
    .line 150
    move-object/from16 v21, v2

    .line 151
    .line 152
    iget-object v2, v6, LD6/v1;->n:Landroid/os/Bundle;

    .line 153
    .line 154
    move-object/from16 v23, v2

    .line 155
    .line 156
    iget-object v2, v6, LD6/v1;->o:Ljava/util/List;

    .line 157
    .line 158
    move-object/from16 v24, v2

    .line 159
    .line 160
    iget-object v2, v6, LD6/v1;->p:Ljava/lang/String;

    .line 161
    .line 162
    move-object/from16 v25, v2

    .line 163
    .line 164
    iget-object v2, v6, LD6/v1;->q:Ljava/lang/String;

    .line 165
    .line 166
    move-object/from16 v26, v2

    .line 167
    .line 168
    iget-boolean v2, v6, LD6/v1;->r:Z

    .line 169
    .line 170
    move/from16 v27, v2

    .line 171
    .line 172
    iget-object v2, v6, LD6/v1;->s:LD6/Q;

    .line 173
    .line 174
    move-object/from16 v28, v2

    .line 175
    .line 176
    iget v2, v6, LD6/v1;->t:I

    .line 177
    .line 178
    move/from16 v29, v2

    .line 179
    .line 180
    iget-object v2, v6, LD6/v1;->u:Ljava/lang/String;

    .line 181
    .line 182
    move-object/from16 v30, v2

    .line 183
    .line 184
    iget-object v2, v6, LD6/v1;->v:Ljava/util/List;

    .line 185
    .line 186
    move-object/from16 v31, v2

    .line 187
    .line 188
    iget v2, v6, LD6/v1;->w:I

    .line 189
    .line 190
    move/from16 v32, v2

    .line 191
    .line 192
    iget-object v2, v6, LD6/v1;->x:Ljava/lang/String;

    .line 193
    .line 194
    move-object/from16 v33, v2

    .line 195
    .line 196
    iget v2, v6, LD6/v1;->y:I

    .line 197
    .line 198
    move/from16 v34, v2

    .line 199
    .line 200
    move/from16 v17, v3

    .line 201
    .line 202
    iget-wide v2, v6, LD6/v1;->z:J

    .line 203
    .line 204
    move-wide/from16 v35, v2

    .line 205
    .line 206
    iget-wide v2, v6, LD6/v1;->A:J

    .line 207
    .line 208
    iget v6, v6, LD6/v1;->B:I

    .line 209
    .line 210
    move-wide/from16 v37, v2

    .line 211
    .line 212
    move/from16 v39, v6

    .line 213
    .line 214
    move-object/from16 v22, v7

    .line 215
    .line 216
    invoke-direct/range {v8 .. v39}, LD6/v1;-><init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;LD6/q1;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLD6/Q;ILjava/lang/String;Ljava/util/List;ILjava/lang/String;IJJI)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v5, v8}, Lcom/google/android/gms/internal/ads/zzflf;->zza(LD6/v1;)Lcom/google/android/gms/internal/ads/zzflf;

    .line 220
    .line 221
    .line 222
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzaH:Lorg/json/JSONArray;

    .line 223
    .line 224
    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/ads/zzflf;->zzz(Lorg/json/JSONArray;)Lcom/google/android/gms/internal/ads/zzflf;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzflf;->zzB()Lcom/google/android/gms/internal/ads/zzflg;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    new-instance v3, Landroid/os/Bundle;

    .line 232
    .line 233
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 234
    .line 235
    .line 236
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzfky;->zzb:Lcom/google/android/gms/internal/ads/zzfkx;

    .line 237
    .line 238
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzfkx;->zzb:Lcom/google/android/gms/internal/ads/zzfkq;

    .line 239
    .line 240
    new-instance v6, Landroid/os/Bundle;

    .line 241
    .line 242
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 243
    .line 244
    .line 245
    new-instance v7, Ljava/util/ArrayList;

    .line 246
    .line 247
    iget-object v8, v5, Lcom/google/android/gms/internal/ads/zzfkq;->zza:Ljava/util/List;

    .line 248
    .line 249
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 250
    .line 251
    .line 252
    const-string v8, "nofill_urls"

    .line 253
    .line 254
    invoke-virtual {v6, v8, v7}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 255
    .line 256
    .line 257
    const-string v7, "refresh_interval"

    .line 258
    .line 259
    iget v8, v5, Lcom/google/android/gms/internal/ads/zzfkq;->zzc:I

    .line 260
    .line 261
    invoke-virtual {v6, v7, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 262
    .line 263
    .line 264
    const-string v7, "gws_query_id"

    .line 265
    .line 266
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzfkq;->zzb:Ljava/lang/String;

    .line 267
    .line 268
    invoke-virtual {v6, v7, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    const-string v5, "parent_common_config"

    .line 272
    .line 273
    invoke-virtual {v3, v5, v6}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 274
    .line 275
    .line 276
    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzflg;->zzg:Ljava/lang/String;

    .line 277
    .line 278
    const-string v5, "initial_ad_unit_id"

    .line 279
    .line 280
    invoke-static {v5, v4}, Lka/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzw:Ljava/lang/String;

    .line 285
    .line 286
    const-string v6, "allocation_id"

    .line 287
    .line 288
    invoke-virtual {v4, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzF:Ljava/lang/String;

    .line 292
    .line 293
    const-string v6, "ad_source_name"

    .line 294
    .line 295
    invoke-virtual {v4, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    new-instance v5, Ljava/util/ArrayList;

    .line 299
    .line 300
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzc:Ljava/util/List;

    .line 301
    .line 302
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 303
    .line 304
    .line 305
    const-string v6, "click_urls"

    .line 306
    .line 307
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 308
    .line 309
    .line 310
    new-instance v5, Ljava/util/ArrayList;

    .line 311
    .line 312
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzd:Ljava/util/List;

    .line 313
    .line 314
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 315
    .line 316
    .line 317
    const-string v6, "imp_urls"

    .line 318
    .line 319
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 320
    .line 321
    .line 322
    new-instance v5, Ljava/util/ArrayList;

    .line 323
    .line 324
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzp:Ljava/util/List;

    .line 325
    .line 326
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 327
    .line 328
    .line 329
    const-string v6, "manual_tracking_urls"

    .line 330
    .line 331
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 332
    .line 333
    .line 334
    new-instance v5, Ljava/util/ArrayList;

    .line 335
    .line 336
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzm:Ljava/util/List;

    .line 337
    .line 338
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 339
    .line 340
    .line 341
    const-string v6, "fill_urls"

    .line 342
    .line 343
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 344
    .line 345
    .line 346
    new-instance v5, Ljava/util/ArrayList;

    .line 347
    .line 348
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzg:Ljava/util/List;

    .line 349
    .line 350
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 351
    .line 352
    .line 353
    const-string v6, "video_start_urls"

    .line 354
    .line 355
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 356
    .line 357
    .line 358
    new-instance v5, Ljava/util/ArrayList;

    .line 359
    .line 360
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzh:Ljava/util/List;

    .line 361
    .line 362
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 363
    .line 364
    .line 365
    const-string v6, "video_reward_urls"

    .line 366
    .line 367
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 368
    .line 369
    .line 370
    new-instance v5, Ljava/util/ArrayList;

    .line 371
    .line 372
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzi:Ljava/util/List;

    .line 373
    .line 374
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 375
    .line 376
    .line 377
    const-string v6, "video_complete_urls"

    .line 378
    .line 379
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 380
    .line 381
    .line 382
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzj:Ljava/lang/String;

    .line 383
    .line 384
    const-string v6, "transaction_id"

    .line 385
    .line 386
    invoke-virtual {v4, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzk:Ljava/lang/String;

    .line 390
    .line 391
    const-string v6, "valid_from_timestamp"

    .line 392
    .line 393
    invoke-virtual {v4, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    iget-boolean v5, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzP:Z

    .line 397
    .line 398
    const-string v6, "is_closable_area_disabled"

    .line 399
    .line 400
    invoke-virtual {v4, v6, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 401
    .line 402
    .line 403
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzao:Ljava/lang/String;

    .line 404
    .line 405
    const-string v6, "recursive_server_response_data"

    .line 406
    .line 407
    invoke-virtual {v4, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    iget-boolean v5, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzW:Z

    .line 411
    .line 412
    const-string v6, "is_analytics_logging_enabled"

    .line 413
    .line 414
    invoke-virtual {v4, v6, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 415
    .line 416
    .line 417
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzfkn;->zzl:Lcom/google/android/gms/internal/ads/zzcci;

    .line 418
    .line 419
    if-eqz v5, :cond_4

    .line 420
    .line 421
    new-instance v6, Landroid/os/Bundle;

    .line 422
    .line 423
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 424
    .line 425
    .line 426
    const-string v7, "rb_amount"

    .line 427
    .line 428
    iget v8, v5, Lcom/google/android/gms/internal/ads/zzcci;->zzb:I

    .line 429
    .line 430
    invoke-virtual {v6, v7, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 431
    .line 432
    .line 433
    const-string v7, "rb_type"

    .line 434
    .line 435
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzcci;->zza:Ljava/lang/String;

    .line 436
    .line 437
    invoke-virtual {v6, v7, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    const/4 v5, 0x1

    .line 441
    new-array v5, v5, [Landroid/os/Bundle;

    .line 442
    .line 443
    const/4 v7, 0x0

    .line 444
    aput-object v6, v5, v7

    .line 445
    .line 446
    const-string v6, "rewards"

    .line 447
    .line 448
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 449
    .line 450
    .line 451
    :cond_4
    const-string v5, "parent_ad_config"

    .line 452
    .line 453
    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 454
    .line 455
    .line 456
    move-object/from16 v4, p0

    .line 457
    .line 458
    invoke-virtual {v4, v2, v3, v1, v0}, Lcom/google/android/gms/internal/ads/zzepa;->zzc(Lcom/google/android/gms/internal/ads/zzflg;Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/zzfkn;Lcom/google/android/gms/internal/ads/zzfky;)Lp8/p;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    return-object v0
.end method

.method public abstract zzc(Lcom/google/android/gms/internal/ads/zzflg;Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/zzfkn;Lcom/google/android/gms/internal/ads/zzfky;)Lp8/p;
.end method
