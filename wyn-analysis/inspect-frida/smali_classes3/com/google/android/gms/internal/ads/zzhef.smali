.class public final Lcom/google/android/gms/internal/ads/zzhef;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Ljava/util/List;

.field private final zzb:Ljava/util/Map;

.field private zzc:Z


# direct methods
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
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhef;->zza:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhef;->zzb:Ljava/util/Map;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzhef;->zzc:Z

    .line 20
    .line 21
    return-void
.end method

.method private final zzd()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhef;->zza:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/google/android/gms/internal/ads/zzhed;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzhed;->zzd(Z)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzhed;)Lcom/google/android/gms/internal/ads/zzhef;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzhed;->zzh()Lcom/google/android/gms/internal/ads/zzhef;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzhed;->zzc()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzhef;->zzd()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/ads/zzhed;->zzi(Lcom/google/android/gms/internal/ads/zzhef;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhef;->zza:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "Entry has already been added to a KeysetHandle.Builder"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzhek;
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzhef;->zzc:Z

    .line 5
    .line 6
    if-nez v2, :cond_12

    .line 7
    .line 8
    iput-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzhef;->zzc:Z

    .line 9
    .line 10
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzhef;->zza:Ljava/util/List;

    .line 11
    .line 12
    new-instance v3, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    move v5, v4

    .line 23
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    add-int/lit8 v6, v6, -0x1

    .line 28
    .line 29
    if-ge v5, v6, :cond_2

    .line 30
    .line 31
    add-int/lit8 v6, v5, 0x1

    .line 32
    .line 33
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    check-cast v5, Lcom/google/android/gms/internal/ads/zzhed;

    .line 38
    .line 39
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzhed;->zzg()Lcom/google/android/gms/internal/ads/zzhee;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhee;->zzb()Lcom/google/android/gms/internal/ads/zzhee;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    if-ne v5, v7, :cond_1

    .line 48
    .line 49
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, Lcom/google/android/gms/internal/ads/zzhed;

    .line 54
    .line 55
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzhed;->zzg()Lcom/google/android/gms/internal/ads/zzhee;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhee;->zzb()Lcom/google/android/gms/internal/ads/zzhee;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    if-ne v5, v7, :cond_0

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_0
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 67
    .line 68
    const-string v2, "Entries with \'withRandomId()\' may only be followed by other entries with \'withRandomId()\'."

    .line 69
    .line 70
    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v1

    .line 74
    :cond_1
    :goto_1
    move v5, v6

    .line 75
    goto :goto_0

    .line 76
    :cond_2
    new-instance v5, Ljava/util/HashSet;

    .line 77
    .line 78
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    const/4 v6, 0x0

    .line 86
    move-object v7, v6

    .line 87
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    if-eqz v8, :cond_10

    .line 92
    .line 93
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    check-cast v8, Lcom/google/android/gms/internal/ads/zzhed;

    .line 98
    .line 99
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzhed;->zze()Lcom/google/android/gms/internal/ads/zzheb;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzhed;->zzg()Lcom/google/android/gms/internal/ads/zzhee;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    if-eqz v9, :cond_f

    .line 107
    .line 108
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzhed;->zzg()Lcom/google/android/gms/internal/ads/zzhee;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhee;->zzb()Lcom/google/android/gms/internal/ads/zzhee;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    const/4 v11, 0x3

    .line 117
    const/4 v12, 0x4

    .line 118
    if-ne v9, v10, :cond_6

    .line 119
    .line 120
    move v9, v4

    .line 121
    :cond_3
    if-eqz v9, :cond_5

    .line 122
    .line 123
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    invoke-virtual {v5, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    if-eqz v10, :cond_4

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_4
    move/from16 v16, v9

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_5
    :goto_3
    sget v9, Lcom/google/android/gms/internal/ads/zzhok;->zza:I

    .line 138
    .line 139
    move v9, v4

    .line 140
    :goto_4
    if-nez v9, :cond_3

    .line 141
    .line 142
    invoke-static {v12}, Lcom/google/android/gms/internal/ads/zzhoc;->zza(I)[B

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    aget-byte v10, v9, v4

    .line 147
    .line 148
    and-int/lit16 v10, v10, 0xff

    .line 149
    .line 150
    aget-byte v13, v9, v1

    .line 151
    .line 152
    and-int/lit16 v13, v13, 0xff

    .line 153
    .line 154
    const/4 v14, 0x2

    .line 155
    aget-byte v14, v9, v14

    .line 156
    .line 157
    and-int/lit16 v14, v14, 0xff

    .line 158
    .line 159
    aget-byte v9, v9, v11

    .line 160
    .line 161
    and-int/lit16 v9, v9, 0xff

    .line 162
    .line 163
    shl-int/lit8 v10, v10, 0x18

    .line 164
    .line 165
    shl-int/lit8 v13, v13, 0x10

    .line 166
    .line 167
    or-int/2addr v10, v13

    .line 168
    shl-int/lit8 v13, v14, 0x8

    .line 169
    .line 170
    or-int/2addr v10, v13

    .line 171
    or-int/2addr v9, v10

    .line 172
    goto :goto_4

    .line 173
    :cond_6
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzhed;->zzg()Lcom/google/android/gms/internal/ads/zzhee;

    .line 174
    .line 175
    .line 176
    move/from16 v16, v4

    .line 177
    .line 178
    :goto_5
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    invoke-virtual {v5, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    if-nez v10, :cond_e

    .line 187
    .line 188
    invoke-virtual {v5, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzhed;->zzf()Lcom/google/android/gms/internal/ads/zzheq;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzheq;->zza()Z

    .line 196
    .line 197
    .line 198
    move-result v10

    .line 199
    if-eq v1, v10, :cond_7

    .line 200
    .line 201
    move-object v10, v6

    .line 202
    goto :goto_6

    .line 203
    :cond_7
    move-object v10, v9

    .line 204
    :goto_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhmv;->zza()Lcom/google/android/gms/internal/ads/zzhmv;

    .line 205
    .line 206
    .line 207
    move-result-object v13

    .line 208
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzhed;->zzf()Lcom/google/android/gms/internal/ads/zzheq;

    .line 209
    .line 210
    .line 211
    move-result-object v14

    .line 212
    invoke-virtual {v13, v14, v10}, Lcom/google/android/gms/internal/ads/zzhmv;->zzc(Lcom/google/android/gms/internal/ads/zzheq;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/zzhdz;

    .line 213
    .line 214
    .line 215
    move-result-object v14

    .line 216
    new-instance v13, Lcom/google/android/gms/internal/ads/zzhei;

    .line 217
    .line 218
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzhed;->zze()Lcom/google/android/gms/internal/ads/zzheb;

    .line 219
    .line 220
    .line 221
    move-result-object v10

    .line 222
    sget-object v15, Lcom/google/android/gms/internal/ads/zzheb;->zza:Lcom/google/android/gms/internal/ads/zzheb;

    .line 223
    .line 224
    invoke-virtual {v15, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v17

    .line 228
    if-eqz v17, :cond_8

    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_8
    sget-object v11, Lcom/google/android/gms/internal/ads/zzheb;->zzb:Lcom/google/android/gms/internal/ads/zzheb;

    .line 232
    .line 233
    invoke-virtual {v11, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v11

    .line 237
    if-eqz v11, :cond_9

    .line 238
    .line 239
    move v11, v12

    .line 240
    goto :goto_7

    .line 241
    :cond_9
    sget-object v11, Lcom/google/android/gms/internal/ads/zzheb;->zzc:Lcom/google/android/gms/internal/ads/zzheb;

    .line 242
    .line 243
    invoke-virtual {v11, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v10

    .line 247
    if-eqz v10, :cond_d

    .line 248
    .line 249
    const/4 v11, 0x5

    .line 250
    :goto_7
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzhed;->zzc()Z

    .line 251
    .line 252
    .line 253
    move-result v17

    .line 254
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhei;->zze()Lcom/google/android/gms/internal/ads/zzheg;

    .line 255
    .line 256
    .line 257
    move-result-object v19

    .line 258
    const/16 v20, 0x0

    .line 259
    .line 260
    const/16 v18, 0x0

    .line 261
    .line 262
    move-object v10, v15

    .line 263
    move v15, v11

    .line 264
    invoke-direct/range {v13 .. v20}, Lcom/google/android/gms/internal/ads/zzhei;-><init>(Lcom/google/android/gms/internal/ads/zzhdz;IIZZLcom/google/android/gms/internal/ads/zzheg;[B)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzhed;->zzc()Z

    .line 268
    .line 269
    .line 270
    move-result v11

    .line 271
    if-eqz v11, :cond_c

    .line 272
    .line 273
    if-nez v7, :cond_b

    .line 274
    .line 275
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzhed;->zze()Lcom/google/android/gms/internal/ads/zzheb;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    if-ne v7, v10, :cond_a

    .line 280
    .line 281
    move-object v7, v9

    .line 282
    goto :goto_8

    .line 283
    :cond_a
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 284
    .line 285
    const-string v2, "Primary key is not enabled"

    .line 286
    .line 287
    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    throw v1

    .line 291
    :cond_b
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 292
    .line 293
    const-string v2, "Two primaries were set"

    .line 294
    .line 295
    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    throw v1

    .line 299
    :cond_c
    :goto_8
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    goto/16 :goto_2

    .line 303
    .line 304
    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 305
    .line 306
    const-string v2, "Unknown key status"

    .line 307
    .line 308
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    throw v1

    .line 312
    :cond_e
    move/from16 v4, v16

    .line 313
    .line 314
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 315
    .line 316
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    new-instance v3, Ljava/lang/StringBuilder;

    .line 325
    .line 326
    add-int/lit8 v2, v2, 0x1f

    .line 327
    .line 328
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 329
    .line 330
    .line 331
    const-string v2, "Id "

    .line 332
    .line 333
    const-string v5, " is used twice in the keyset"

    .line 334
    .line 335
    invoke-static {v3, v2, v4, v5}, LA7/p0;->o(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    throw v1

    .line 343
    :cond_f
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 344
    .line 345
    const-string v2, "No ID was set (with withFixedId or withRandomId)"

    .line 346
    .line 347
    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    throw v1

    .line 351
    :cond_10
    if-eqz v7, :cond_11

    .line 352
    .line 353
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzhef;->zzb:Ljava/util/Map;

    .line 354
    .line 355
    new-instance v2, Lcom/google/android/gms/internal/ads/zzhek;

    .line 356
    .line 357
    invoke-direct {v2, v3, v1, v6}, Lcom/google/android/gms/internal/ads/zzhek;-><init>(Ljava/util/List;Ljava/util/Map;[B)V

    .line 358
    .line 359
    .line 360
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzhek;->zzi(Lcom/google/android/gms/internal/ads/zzhek;)Lcom/google/android/gms/internal/ads/zzhek;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    return-object v1

    .line 365
    :cond_11
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 366
    .line 367
    const-string v2, "No primary was set"

    .line 368
    .line 369
    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    throw v1

    .line 373
    :cond_12
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 374
    .line 375
    const-string v2, "KeysetHandle.Builder#build must only be called once"

    .line 376
    .line 377
    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    throw v1
.end method

.method public final synthetic zzc()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzhef;->zzd()V

    return-void
.end method
