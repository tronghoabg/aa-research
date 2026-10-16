.class final Lcom/google/android/gms/internal/ads/zzfdd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfcs;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzhcp;

.field private final zzb:Landroid/content/Context;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzeej;

.field private final zzd:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzhcp;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzeej;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfdd;->zza:Lcom/google/android/gms/internal/ads/zzhcp;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfdd;->zzb:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfdd;->zzc:Lcom/google/android/gms/internal/ads/zzeej;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfdd;->zzd:Ljava/lang/String;

    return-void
.end method

.method private static zzd(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/ResolveInfo;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "android.intent.action.VIEW"

    .line 4
    .line 5
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 10
    .line 11
    .line 12
    const/high16 p1, 0x10000

    .line 13
    .line 14
    invoke-virtual {p0, v0, p1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method


# virtual methods
.method public final zza()Lp8/p;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfdc;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfdc;-><init>(Lcom/google/android/gms/internal/ads/zzfdd;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfdd;->zza:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 7
    .line 8
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzhcp;->zzc(Ljava/util/concurrent/Callable;)Lp8/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final zzb()I
    .locals 1

    const/16 v0, 0x26

    return v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzfdb;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzfdd;->zzb:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    const-string v4, "geo:0,0?q=donuts"

    .line 14
    .line 15
    invoke-static {v2, v4}, Lcom/google/android/gms/internal/ads/zzfdd;->zzd(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/ResolveInfo;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const-string v5, "http://www.google.com"

    .line 20
    .line 21
    invoke-static {v2, v5}, Lcom/google/android/gms/internal/ads/zzfdd;->zzd(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/ResolveInfo;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual {v3}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v9

    .line 29
    sget-object v6, LC6/n;->D:LC6/n;

    .line 30
    .line 31
    iget-object v6, v6, LC6/n;->c:LG6/U;

    .line 32
    .line 33
    sget-object v6, LD6/q;->g:LD6/q;

    .line 34
    .line 35
    iget-object v6, v6, LD6/q;->a:LH6/f;

    .line 36
    .line 37
    invoke-static {}, LH6/f;->t()Z

    .line 38
    .line 39
    .line 40
    move-result v10

    .line 41
    invoke-static {v1}, Ln7/c;->k(Landroid/content/Context;)Z

    .line 42
    .line 43
    .line 44
    move-result v11

    .line 45
    invoke-static {v1}, Ln7/c;->p(Landroid/content/Context;)Z

    .line 46
    .line 47
    .line 48
    move-result v12

    .line 49
    invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v13

    .line 53
    new-instance v14, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 59
    .line 60
    const/16 v6, 0x18

    .line 61
    .line 62
    const/4 v7, 0x0

    .line 63
    if-lt v3, v6, :cond_0

    .line 64
    .line 65
    invoke-static {}, LA7/O0;->f()Landroid/os/LocaleList;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    move v6, v7

    .line 70
    :goto_0
    invoke-static {v3}, LA7/O0;->c(Landroid/os/LocaleList;)I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    if-ge v6, v8, :cond_0

    .line 75
    .line 76
    invoke-static {v3, v6}, LA7/O0;->j(Landroid/os/LocaleList;I)Ljava/util/Locale;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    invoke-virtual {v8}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    add-int/lit8 v6, v6, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    const-string v3, "market://details?id=com.google.android.gms.ads"

    .line 91
    .line 92
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzfdd;->zzd(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/ResolveInfo;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    const-string v8, "."

    .line 97
    .line 98
    if-nez v3, :cond_1

    .line 99
    .line 100
    :goto_1
    const/4 v15, 0x0

    .line 101
    const/16 v16, 0x1

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_1
    iget-object v3, v3, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 105
    .line 106
    if-nez v3, :cond_2

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_2
    :try_start_0
    invoke-static {v1}, Lp7/c;->a(Landroid/content/Context;)LE0/a;

    .line 110
    .line 111
    .line 112
    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 113
    const/16 v16, 0x1

    .line 114
    .line 115
    :try_start_1
    iget-object v6, v3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v1, v7, v6}, LE0/a;->c(ILjava/lang/String;)Landroid/content/pm/PackageInfo;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    if-eqz v1, :cond_3

    .line 122
    .line 123
    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 124
    .line 125
    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    add-int/lit8 v6, v6, 0x1

    .line 136
    .line 137
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v17

    .line 141
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    .line 142
    .line 143
    .line 144
    move-result v17

    .line 145
    add-int v6, v6, v17

    .line 146
    .line 147
    new-instance v15, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v15, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v1
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 165
    move-object v15, v1

    .line 166
    goto :goto_3

    .line 167
    :catch_0
    :cond_3
    :goto_2
    const/4 v15, 0x0

    .line 168
    goto :goto_3

    .line 169
    :catch_1
    const/16 v16, 0x1

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :goto_3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzfdd;->zzb:Landroid/content/Context;

    .line 173
    .line 174
    :try_start_2
    invoke-static {v1}, Lp7/c;->a(Landroid/content/Context;)LE0/a;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    const-string v3, "com.android.vending"

    .line 179
    .line 180
    const/16 v6, 0x80

    .line 181
    .line 182
    invoke-virtual {v1, v6, v3}, LE0/a;->c(ILjava/lang/String;)Landroid/content/pm/PackageInfo;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    if-eqz v1, :cond_4

    .line 187
    .line 188
    iget v3, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 189
    .line 190
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 191
    .line 192
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 197
    .line 198
    .line 199
    move-result v6

    .line 200
    add-int/lit8 v6, v6, 0x1

    .line 201
    .line 202
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v18

    .line 206
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    .line 207
    .line 208
    .line 209
    move-result v18

    .line 210
    add-int v6, v6, v18

    .line 211
    .line 212
    new-instance v7, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 230
    :goto_4
    const/4 v3, 0x0

    .line 231
    goto :goto_5

    .line 232
    :catch_2
    :cond_4
    const/4 v1, 0x0

    .line 233
    goto :goto_4

    .line 234
    :goto_5
    sget-object v17, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 235
    .line 236
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 237
    .line 238
    .line 239
    move-result-object v6

    .line 240
    invoke-virtual {v6}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    sget-object v7, Lcom/google/android/gms/internal/ads/zzbix;->zzpg:Lcom/google/android/gms/internal/ads/zzbio;

    .line 245
    .line 246
    sget-object v8, LD6/s;->e:LD6/s;

    .line 247
    .line 248
    iget-object v3, v8, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 249
    .line 250
    invoke-virtual {v3, v7}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    check-cast v3, Ljava/lang/Boolean;

    .line 255
    .line 256
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    if-eqz v3, :cond_5

    .line 261
    .line 262
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzfdd;->zzb:Landroid/content/Context;

    .line 263
    .line 264
    invoke-static {v3}, LG6/U;->I(Landroid/content/Context;)LG6/S;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    iget-object v6, v3, LG6/S;->a:Ljava/lang/String;

    .line 269
    .line 270
    iget-object v3, v3, LG6/S;->b:Ljava/lang/String;

    .line 271
    .line 272
    move-object/from16 v26, v3

    .line 273
    .line 274
    move-object/from16 v25, v6

    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_5
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbix;->zzpf:Lcom/google/android/gms/internal/ads/zzbio;

    .line 278
    .line 279
    iget-object v7, v8, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 280
    .line 281
    invoke-virtual {v7, v3}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    check-cast v3, Ljava/lang/Boolean;

    .line 286
    .line 287
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    if-eqz v3, :cond_6

    .line 292
    .line 293
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzfdd;->zzb:Landroid/content/Context;

    .line 294
    .line 295
    invoke-static {v3}, LG6/U;->I(Landroid/content/Context;)LG6/S;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    iget-object v6, v3, LG6/S;->a:Ljava/lang/String;

    .line 300
    .line 301
    :cond_6
    move-object/from16 v25, v6

    .line 302
    .line 303
    const/16 v26, 0x0

    .line 304
    .line 305
    :goto_6
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzfdd;->zzb:Landroid/content/Context;

    .line 306
    .line 307
    if-nez v2, :cond_8

    .line 308
    .line 309
    :cond_7
    move-object/from16 v19, v1

    .line 310
    .line 311
    const/4 v1, 0x0

    .line 312
    goto :goto_8

    .line 313
    :cond_8
    new-instance v6, Landroid/content/Intent;

    .line 314
    .line 315
    const-string v7, "http://www.example.com"

    .line 316
    .line 317
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 318
    .line 319
    .line 320
    move-result-object v7

    .line 321
    const-string v8, "android.intent.action.VIEW"

    .line 322
    .line 323
    invoke-direct {v6, v8, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 324
    .line 325
    .line 326
    const/4 v7, 0x0

    .line 327
    invoke-virtual {v2, v6, v7}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 328
    .line 329
    .line 330
    move-result-object v8

    .line 331
    const/high16 v7, 0x10000

    .line 332
    .line 333
    invoke-virtual {v2, v6, v7}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    if-eqz v2, :cond_7

    .line 338
    .line 339
    if-eqz v8, :cond_7

    .line 340
    .line 341
    const/4 v6, 0x0

    .line 342
    :goto_7
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 343
    .line 344
    .line 345
    move-result v7

    .line 346
    if-ge v6, v7, :cond_7

    .line 347
    .line 348
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v7

    .line 352
    check-cast v7, Landroid/content/pm/ResolveInfo;

    .line 353
    .line 354
    move-object/from16 v19, v1

    .line 355
    .line 356
    iget-object v1, v8, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 357
    .line 358
    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 359
    .line 360
    iget-object v7, v7, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 361
    .line 362
    iget-object v7, v7, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 363
    .line 364
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    if-eqz v1, :cond_9

    .line 369
    .line 370
    iget-object v1, v8, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 371
    .line 372
    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 373
    .line 374
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzinp;->zza(Landroid/content/Context;)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v1

    .line 382
    goto :goto_8

    .line 383
    :cond_9
    add-int/lit8 v6, v6, 0x1

    .line 384
    .line 385
    move-object/from16 v1, v19

    .line 386
    .line 387
    goto :goto_7

    .line 388
    :goto_8
    sget-object v2, LC6/n;->D:LC6/n;

    .line 389
    .line 390
    iget-object v2, v2, LC6/n;->c:LG6/U;

    .line 391
    .line 392
    new-instance v2, Landroid/os/StatFs;

    .line 393
    .line 394
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    .line 395
    .line 396
    .line 397
    move-result-object v6

    .line 398
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v6

    .line 402
    invoke-direct {v2, v6}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v2}, Landroid/os/StatFs;->getAvailableBytes()J

    .line 406
    .line 407
    .line 408
    move-result-wide v6

    .line 409
    const-wide/16 v20, 0x400

    .line 410
    .line 411
    div-long v20, v6, v20

    .line 412
    .line 413
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbix;->zzmX:Lcom/google/android/gms/internal/ads/zzbio;

    .line 414
    .line 415
    sget-object v6, LD6/s;->e:LD6/s;

    .line 416
    .line 417
    iget-object v7, v6, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 418
    .line 419
    invoke-virtual {v7, v2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    check-cast v2, Ljava/lang/Boolean;

    .line 424
    .line 425
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    if-eqz v2, :cond_a

    .line 430
    .line 431
    invoke-static {v3}, LG6/U;->d(Landroid/content/Context;)Z

    .line 432
    .line 433
    .line 434
    move-result v2

    .line 435
    if-eqz v2, :cond_a

    .line 436
    .line 437
    move/from16 v22, v16

    .line 438
    .line 439
    goto :goto_9

    .line 440
    :cond_a
    const/16 v22, 0x0

    .line 441
    .line 442
    :goto_9
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbix;->zznb:Lcom/google/android/gms/internal/ads/zzbio;

    .line 443
    .line 444
    iget-object v6, v6, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 445
    .line 446
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    check-cast v2, Ljava/lang/Boolean;

    .line 451
    .line 452
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 453
    .line 454
    .line 455
    move-result v2

    .line 456
    if-eqz v2, :cond_c

    .line 457
    .line 458
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbix;->zznd:Lcom/google/android/gms/internal/ads/zzbio;

    .line 459
    .line 460
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    check-cast v2, Ljava/lang/Boolean;

    .line 465
    .line 466
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 467
    .line 468
    .line 469
    move-result v2

    .line 470
    if-eqz v2, :cond_b

    .line 471
    .line 472
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzfdd;->zzd:Ljava/lang/String;

    .line 473
    .line 474
    :goto_a
    move-object/from16 v23, v2

    .line 475
    .line 476
    goto :goto_b

    .line 477
    :cond_b
    invoke-static {v3}, LH6/f;->j(Landroid/content/Context;)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    goto :goto_a

    .line 482
    :cond_c
    const-string v2, ""

    .line 483
    .line 484
    goto :goto_a

    .line 485
    :goto_b
    if-eqz v5, :cond_d

    .line 486
    .line 487
    move/from16 v8, v16

    .line 488
    .line 489
    goto :goto_c

    .line 490
    :cond_d
    const/4 v8, 0x0

    .line 491
    :goto_c
    if-eqz v4, :cond_e

    .line 492
    .line 493
    move/from16 v7, v16

    .line 494
    .line 495
    goto :goto_d

    .line 496
    :cond_e
    const/4 v7, 0x0

    .line 497
    :goto_d
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzfdd;->zzc:Lcom/google/android/gms/internal/ads/zzeej;

    .line 498
    .line 499
    new-instance v6, Lcom/google/android/gms/internal/ads/zzfdb;

    .line 500
    .line 501
    move-object/from16 v16, v19

    .line 502
    .line 503
    sget-object v19, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 504
    .line 505
    sget v24, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 506
    .line 507
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeej;->zza()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v27

    .line 511
    move/from16 v18, v1

    .line 512
    .line 513
    invoke-direct/range {v6 .. v27}, Lcom/google/android/gms/internal/ads/zzfdb;-><init>(ZZLjava/lang/String;ZZZLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    return-object v6
.end method
