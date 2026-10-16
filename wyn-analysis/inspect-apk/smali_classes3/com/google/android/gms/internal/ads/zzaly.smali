.class final Lcom/google/android/gms/internal/ads/zzaly;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static varargs zza(ILcom/google/android/gms/internal/ads/zzap;Lcom/google/android/gms/internal/ads/zzt;Lcom/google/android/gms/internal/ads/zzap;[Lcom/google/android/gms/internal/ads/zzap;)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    new-instance p3, Lcom/google/android/gms/internal/ads/zzap;

    .line 6
    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    new-array v4, v1, [Lcom/google/android/gms/internal/ads/zzao;

    .line 13
    .line 14
    invoke-direct {p3, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzap;-><init>(J[Lcom/google/android/gms/internal/ads/zzao;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    if-eqz p1, :cond_3

    .line 18
    .line 19
    const-class v2, Lcom/google/android/gms/internal/ads/zzfx;

    .line 20
    .line 21
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/zzap;->zzd(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    move v3, v1

    .line 30
    :goto_0
    if-ge v3, v2, :cond_3

    .line 31
    .line 32
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Lcom/google/android/gms/internal/ads/zzfx;

    .line 37
    .line 38
    iget-object v5, v4, Lcom/google/android/gms/internal/ads/zzfx;->zza:Ljava/lang/String;

    .line 39
    .line 40
    const-string v6, "com.android.capture.fps"

    .line 41
    .line 42
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_1

    .line 47
    .line 48
    const/4 v5, 0x2

    .line 49
    if-ne p0, v5, :cond_2

    .line 50
    .line 51
    :cond_1
    new-array v5, v0, [Lcom/google/android/gms/internal/ads/zzao;

    .line 52
    .line 53
    aput-object v4, v5, v1

    .line 54
    .line 55
    invoke-virtual {p3, v5}, Lcom/google/android/gms/internal/ads/zzap;->zzg([Lcom/google/android/gms/internal/ads/zzao;)Lcom/google/android/gms/internal/ads/zzap;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    :cond_2
    add-int/2addr v3, v0

    .line 60
    goto :goto_0

    .line 61
    :cond_3
    array-length p0, p4

    .line 62
    :goto_1
    if-ge v1, p0, :cond_4

    .line 63
    .line 64
    aget-object p1, p4, v1

    .line 65
    .line 66
    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/ads/zzap;->zzf(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzap;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    add-int/2addr v1, v0

    .line 71
    goto :goto_1

    .line 72
    :cond_4
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzap;->zza()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-lez p0, :cond_5

    .line 77
    .line 78
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/zzt;->zzl(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzt;

    .line 79
    .line 80
    .line 81
    :cond_5
    return-void
.end method

.method public static zzb(ILcom/google/android/gms/internal/ads/zzagt;Lcom/google/android/gms/internal/ads/zzt;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, v0, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzagt;->zzb()Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    iget p0, p1, Lcom/google/android/gms/internal/ads/zzagt;->zza:I

    .line 11
    .line 12
    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/ads/zzt;->zzK(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 13
    .line 14
    .line 15
    iget p0, p1, Lcom/google/android/gms/internal/ads/zzagt;->zzb:I

    .line 16
    .line 17
    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/ads/zzt;->zzL(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public static zzc(Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzao;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const v0, 0x74767368

    .line 4
    .line 5
    .line 6
    const v2, 0x736f736e

    .line 7
    .line 8
    .line 9
    const v3, 0x70676170

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    add-int/2addr v5, v4

    .line 21
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    shr-int/lit8 v6, v4, 0x18

    .line 26
    .line 27
    and-int/lit16 v6, v6, 0xff

    .line 28
    .line 29
    const-string v7, "Skipped unknown metadata entry: "

    .line 30
    .line 31
    const/16 v8, 0xa9

    .line 32
    .line 33
    const v9, 0xffffff

    .line 34
    .line 35
    .line 36
    const-string v10, "TCON"

    .line 37
    .line 38
    const v11, 0x64617461

    .line 39
    .line 40
    .line 41
    const/4 v12, 0x1

    .line 42
    const-string v13, "MetadataUtil"

    .line 43
    .line 44
    const/4 v14, 0x0

    .line 45
    const/4 v15, 0x0

    .line 46
    if-eq v6, v8, :cond_1c

    .line 47
    .line 48
    const/16 v8, 0xfd

    .line 49
    .line 50
    if-ne v6, v8, :cond_0

    .line 51
    .line 52
    goto/16 :goto_3

    .line 53
    .line 54
    :cond_0
    const v6, 0x676e7265

    .line 55
    .line 56
    .line 57
    const/4 v8, -0x1

    .line 58
    if-ne v4, v6, :cond_2

    .line 59
    .line 60
    :try_start_0
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzaly;->zzf(Lcom/google/android/gms/internal/ads/zzeu;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    add-int/2addr v0, v8

    .line 65
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzajt;->zza(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    new-instance v2, Lcom/google/android/gms/internal/ads/zzajx;

    .line 72
    .line 73
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-direct {v2, v10, v15, v0}, Lcom/google/android/gms/internal/ads/zzajx;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 78
    .line 79
    .line 80
    :goto_0
    move-object v15, v2

    .line 81
    goto/16 :goto_6

    .line 82
    .line 83
    :catchall_0
    move-exception v0

    .line 84
    goto/16 :goto_7

    .line 85
    .line 86
    :cond_1
    const-string v0, "Failed to parse standard genre code"

    .line 87
    .line 88
    invoke-static {v13, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_6

    .line 92
    .line 93
    :cond_2
    const v6, 0x6469736b

    .line 94
    .line 95
    .line 96
    if-ne v4, v6, :cond_3

    .line 97
    .line 98
    const-string v0, "TPOS"

    .line 99
    .line 100
    invoke-static {v6, v0, v1}, Lcom/google/android/gms/internal/ads/zzaly;->zzg(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;

    .line 101
    .line 102
    .line 103
    move-result-object v15

    .line 104
    goto/16 :goto_6

    .line 105
    .line 106
    :cond_3
    const v6, 0x74726b6e

    .line 107
    .line 108
    .line 109
    if-ne v4, v6, :cond_4

    .line 110
    .line 111
    const-string v0, "TRCK"

    .line 112
    .line 113
    invoke-static {v6, v0, v1}, Lcom/google/android/gms/internal/ads/zzaly;->zzg(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;

    .line 114
    .line 115
    .line 116
    move-result-object v15

    .line 117
    goto/16 :goto_6

    .line 118
    .line 119
    :cond_4
    const v6, 0x746d706f

    .line 120
    .line 121
    .line 122
    if-ne v4, v6, :cond_5

    .line 123
    .line 124
    const-string v0, "TBPM"

    .line 125
    .line 126
    invoke-static {v6, v0, v1, v12, v14}, Lcom/google/android/gms/internal/ads/zzaly;->zze(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;ZZ)Lcom/google/android/gms/internal/ads/zzajs;

    .line 127
    .line 128
    .line 129
    move-result-object v15

    .line 130
    goto/16 :goto_6

    .line 131
    .line 132
    :cond_5
    const v6, 0x6370696c

    .line 133
    .line 134
    .line 135
    if-ne v4, v6, :cond_6

    .line 136
    .line 137
    const-string v0, "TCMP"

    .line 138
    .line 139
    invoke-static {v6, v0, v1, v12, v12}, Lcom/google/android/gms/internal/ads/zzaly;->zze(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;ZZ)Lcom/google/android/gms/internal/ads/zzajs;

    .line 140
    .line 141
    .line 142
    move-result-object v15

    .line 143
    goto/16 :goto_6

    .line 144
    .line 145
    :cond_6
    const v6, 0x636f7672

    .line 146
    .line 147
    .line 148
    const/4 v10, 0x4

    .line 149
    if-ne v4, v6, :cond_b

    .line 150
    .line 151
    const-string v0, "Unrecognized cover art flags: "

    .line 152
    .line 153
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-ne v3, v11, :cond_a

    .line 162
    .line 163
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    sget v4, Lcom/google/android/gms/internal/ads/zzalo;->zza:I

    .line 168
    .line 169
    and-int/2addr v3, v9

    .line 170
    const/16 v4, 0xd

    .line 171
    .line 172
    if-ne v3, v4, :cond_7

    .line 173
    .line 174
    const-string v4, "image/jpeg"

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_7
    const/16 v4, 0xe

    .line 178
    .line 179
    if-ne v3, v4, :cond_8

    .line 180
    .line 181
    const-string v3, "image/png"

    .line 182
    .line 183
    move/from16 v16, v4

    .line 184
    .line 185
    move-object v4, v3

    .line 186
    move/from16 v3, v16

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_8
    move-object v4, v15

    .line 190
    :goto_1
    if-nez v4, :cond_9

    .line 191
    .line 192
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    add-int/lit8 v2, v2, 0x1e

    .line 201
    .line 202
    new-instance v4, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-static {v13, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    goto/16 :goto_6

    .line 221
    .line 222
    :cond_9
    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 223
    .line 224
    .line 225
    add-int/lit8 v2, v2, -0x10

    .line 226
    .line 227
    new-array v0, v2, [B

    .line 228
    .line 229
    invoke-virtual {v1, v0, v14, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    .line 230
    .line 231
    .line 232
    new-instance v2, Lcom/google/android/gms/internal/ads/zzaji;

    .line 233
    .line 234
    const/4 v3, 0x3

    .line 235
    invoke-direct {v2, v4, v15, v3, v0}, Lcom/google/android/gms/internal/ads/zzaji;-><init>(Ljava/lang/String;Ljava/lang/String;I[B)V

    .line 236
    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :cond_a
    const-string v0, "Failed to parse cover art attribute"

    .line 241
    .line 242
    invoke-static {v13, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    goto/16 :goto_6

    .line 246
    .line 247
    :cond_b
    const v6, 0x61415254

    .line 248
    .line 249
    .line 250
    if-ne v4, v6, :cond_c

    .line 251
    .line 252
    const-string v0, "TPE2"

    .line 253
    .line 254
    invoke-static {v6, v0, v1}, Lcom/google/android/gms/internal/ads/zzaly;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;

    .line 255
    .line 256
    .line 257
    move-result-object v15

    .line 258
    goto/16 :goto_6

    .line 259
    .line 260
    :cond_c
    const v6, 0x736f6e6d

    .line 261
    .line 262
    .line 263
    if-ne v4, v6, :cond_d

    .line 264
    .line 265
    const-string v0, "TSOT"

    .line 266
    .line 267
    invoke-static {v6, v0, v1}, Lcom/google/android/gms/internal/ads/zzaly;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;

    .line 268
    .line 269
    .line 270
    move-result-object v15

    .line 271
    goto/16 :goto_6

    .line 272
    .line 273
    :cond_d
    const v6, 0x736f616c

    .line 274
    .line 275
    .line 276
    if-ne v4, v6, :cond_e

    .line 277
    .line 278
    const-string v0, "TSOA"

    .line 279
    .line 280
    invoke-static {v6, v0, v1}, Lcom/google/android/gms/internal/ads/zzaly;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;

    .line 281
    .line 282
    .line 283
    move-result-object v15

    .line 284
    goto/16 :goto_6

    .line 285
    .line 286
    :cond_e
    const v6, 0x736f6172

    .line 287
    .line 288
    .line 289
    if-ne v4, v6, :cond_f

    .line 290
    .line 291
    const-string v0, "TSOP"

    .line 292
    .line 293
    invoke-static {v6, v0, v1}, Lcom/google/android/gms/internal/ads/zzaly;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;

    .line 294
    .line 295
    .line 296
    move-result-object v15

    .line 297
    goto/16 :goto_6

    .line 298
    .line 299
    :cond_f
    const v6, 0x736f6161

    .line 300
    .line 301
    .line 302
    if-ne v4, v6, :cond_10

    .line 303
    .line 304
    const-string v0, "TSO2"

    .line 305
    .line 306
    invoke-static {v6, v0, v1}, Lcom/google/android/gms/internal/ads/zzaly;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;

    .line 307
    .line 308
    .line 309
    move-result-object v15

    .line 310
    goto/16 :goto_6

    .line 311
    .line 312
    :cond_10
    const v6, 0x736f636f

    .line 313
    .line 314
    .line 315
    if-ne v4, v6, :cond_11

    .line 316
    .line 317
    const-string v0, "TSOC"

    .line 318
    .line 319
    invoke-static {v6, v0, v1}, Lcom/google/android/gms/internal/ads/zzaly;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;

    .line 320
    .line 321
    .line 322
    move-result-object v15

    .line 323
    goto/16 :goto_6

    .line 324
    .line 325
    :cond_11
    const v6, 0x72746e67

    .line 326
    .line 327
    .line 328
    if-ne v4, v6, :cond_12

    .line 329
    .line 330
    const-string v0, "ITUNESADVISORY"

    .line 331
    .line 332
    invoke-static {v6, v0, v1, v14, v14}, Lcom/google/android/gms/internal/ads/zzaly;->zze(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;ZZ)Lcom/google/android/gms/internal/ads/zzajs;

    .line 333
    .line 334
    .line 335
    move-result-object v15

    .line 336
    goto/16 :goto_6

    .line 337
    .line 338
    :cond_12
    if-ne v4, v3, :cond_13

    .line 339
    .line 340
    const-string v0, "ITUNESGAPLESS"

    .line 341
    .line 342
    invoke-static {v3, v0, v1, v14, v12}, Lcom/google/android/gms/internal/ads/zzaly;->zze(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;ZZ)Lcom/google/android/gms/internal/ads/zzajs;

    .line 343
    .line 344
    .line 345
    move-result-object v15

    .line 346
    goto/16 :goto_6

    .line 347
    .line 348
    :cond_13
    if-ne v4, v2, :cond_14

    .line 349
    .line 350
    const-string v0, "TVSHOWSORT"

    .line 351
    .line 352
    invoke-static {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzaly;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;

    .line 353
    .line 354
    .line 355
    move-result-object v15

    .line 356
    goto/16 :goto_6

    .line 357
    .line 358
    :cond_14
    if-ne v4, v0, :cond_15

    .line 359
    .line 360
    const-string v2, "TVSHOW"

    .line 361
    .line 362
    invoke-static {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzaly;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;

    .line 363
    .line 364
    .line 365
    move-result-object v15

    .line 366
    goto/16 :goto_6

    .line 367
    .line 368
    :cond_15
    const v0, 0x2d2d2d2d

    .line 369
    .line 370
    .line 371
    if-ne v4, v0, :cond_29

    .line 372
    .line 373
    move v3, v8

    .line 374
    move v4, v3

    .line 375
    move-object v0, v15

    .line 376
    move-object v2, v0

    .line 377
    :goto_2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 378
    .line 379
    .line 380
    move-result v6

    .line 381
    if-ge v6, v5, :cond_1a

    .line 382
    .line 383
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 384
    .line 385
    .line 386
    move-result v6

    .line 387
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 388
    .line 389
    .line 390
    move-result v7

    .line 391
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 392
    .line 393
    .line 394
    move-result v9

    .line 395
    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 396
    .line 397
    .line 398
    const v12, 0x6d65616e

    .line 399
    .line 400
    .line 401
    if-ne v9, v12, :cond_16

    .line 402
    .line 403
    add-int/lit8 v7, v7, -0xc

    .line 404
    .line 405
    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/ads/zzeu;->zzL(I)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    goto :goto_2

    .line 410
    :cond_16
    add-int/lit8 v12, v7, -0xc

    .line 411
    .line 412
    const v13, 0x6e616d65

    .line 413
    .line 414
    .line 415
    if-ne v9, v13, :cond_17

    .line 416
    .line 417
    invoke-virtual {v1, v12}, Lcom/google/android/gms/internal/ads/zzeu;->zzL(I)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    goto :goto_2

    .line 422
    :cond_17
    if-ne v9, v11, :cond_18

    .line 423
    .line 424
    move v4, v7

    .line 425
    :cond_18
    if-ne v9, v11, :cond_19

    .line 426
    .line 427
    move v3, v6

    .line 428
    :cond_19
    invoke-virtual {v1, v12}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 429
    .line 430
    .line 431
    goto :goto_2

    .line 432
    :cond_1a
    if-eqz v0, :cond_2c

    .line 433
    .line 434
    if-eqz v2, :cond_2c

    .line 435
    .line 436
    if-ne v3, v8, :cond_1b

    .line 437
    .line 438
    goto/16 :goto_6

    .line 439
    .line 440
    :cond_1b
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 441
    .line 442
    .line 443
    const/16 v3, 0x10

    .line 444
    .line 445
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 446
    .line 447
    .line 448
    add-int/lit8 v4, v4, -0x10

    .line 449
    .line 450
    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzL(I)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    new-instance v15, Lcom/google/android/gms/internal/ads/zzaju;

    .line 455
    .line 456
    invoke-direct {v15, v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzaju;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    goto/16 :goto_6

    .line 460
    .line 461
    :cond_1c
    :goto_3
    and-int v0, v4, v9

    .line 462
    .line 463
    const v2, 0x636d74

    .line 464
    .line 465
    .line 466
    if-ne v0, v2, :cond_1e

    .line 467
    .line 468
    const-string v0, "Failed to parse comment attribute: "

    .line 469
    .line 470
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 471
    .line 472
    .line 473
    move-result v2

    .line 474
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 475
    .line 476
    .line 477
    move-result v3

    .line 478
    if-ne v3, v11, :cond_1d

    .line 479
    .line 480
    const/16 v0, 0x8

    .line 481
    .line 482
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 483
    .line 484
    .line 485
    add-int/lit8 v2, v2, -0x10

    .line 486
    .line 487
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzL(I)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    new-instance v15, Lcom/google/android/gms/internal/ads/zzajm;

    .line 492
    .line 493
    const-string v2, "und"

    .line 494
    .line 495
    invoke-direct {v15, v2, v0, v0}, Lcom/google/android/gms/internal/ads/zzajm;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    goto/16 :goto_6

    .line 499
    .line 500
    :cond_1d
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzgb;->zze(I)Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-static {v13, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    goto/16 :goto_6

    .line 512
    .line 513
    :cond_1e
    const v2, 0x6e616d

    .line 514
    .line 515
    .line 516
    if-eq v0, v2, :cond_2b

    .line 517
    .line 518
    const v2, 0x74726b

    .line 519
    .line 520
    .line 521
    if-ne v0, v2, :cond_1f

    .line 522
    .line 523
    goto/16 :goto_5

    .line 524
    .line 525
    :cond_1f
    const v2, 0x636f6d

    .line 526
    .line 527
    .line 528
    if-eq v0, v2, :cond_2a

    .line 529
    .line 530
    const v2, 0x777274

    .line 531
    .line 532
    .line 533
    if-ne v0, v2, :cond_20

    .line 534
    .line 535
    goto/16 :goto_4

    .line 536
    .line 537
    :cond_20
    const v2, 0x646179

    .line 538
    .line 539
    .line 540
    if-ne v0, v2, :cond_21

    .line 541
    .line 542
    const-string v0, "TDRC"

    .line 543
    .line 544
    invoke-static {v4, v0, v1}, Lcom/google/android/gms/internal/ads/zzaly;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;

    .line 545
    .line 546
    .line 547
    move-result-object v15

    .line 548
    goto/16 :goto_6

    .line 549
    .line 550
    :cond_21
    const v2, 0x415254

    .line 551
    .line 552
    .line 553
    if-ne v0, v2, :cond_22

    .line 554
    .line 555
    const-string v0, "TPE1"

    .line 556
    .line 557
    invoke-static {v4, v0, v1}, Lcom/google/android/gms/internal/ads/zzaly;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;

    .line 558
    .line 559
    .line 560
    move-result-object v15

    .line 561
    goto/16 :goto_6

    .line 562
    .line 563
    :cond_22
    const v2, 0x746f6f

    .line 564
    .line 565
    .line 566
    if-ne v0, v2, :cond_23

    .line 567
    .line 568
    const-string v0, "TSSE"

    .line 569
    .line 570
    invoke-static {v4, v0, v1}, Lcom/google/android/gms/internal/ads/zzaly;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;

    .line 571
    .line 572
    .line 573
    move-result-object v15

    .line 574
    goto/16 :goto_6

    .line 575
    .line 576
    :cond_23
    const v2, 0x616c62

    .line 577
    .line 578
    .line 579
    if-ne v0, v2, :cond_24

    .line 580
    .line 581
    const-string v0, "TALB"

    .line 582
    .line 583
    invoke-static {v4, v0, v1}, Lcom/google/android/gms/internal/ads/zzaly;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;

    .line 584
    .line 585
    .line 586
    move-result-object v15

    .line 587
    goto :goto_6

    .line 588
    :cond_24
    const v2, 0x6c7972

    .line 589
    .line 590
    .line 591
    if-ne v0, v2, :cond_25

    .line 592
    .line 593
    const-string v0, "USLT"

    .line 594
    .line 595
    invoke-static {v4, v0, v1}, Lcom/google/android/gms/internal/ads/zzaly;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;

    .line 596
    .line 597
    .line 598
    move-result-object v15

    .line 599
    goto :goto_6

    .line 600
    :cond_25
    const v2, 0x67656e

    .line 601
    .line 602
    .line 603
    if-ne v0, v2, :cond_26

    .line 604
    .line 605
    invoke-static {v4, v10, v1}, Lcom/google/android/gms/internal/ads/zzaly;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;

    .line 606
    .line 607
    .line 608
    move-result-object v15

    .line 609
    goto :goto_6

    .line 610
    :cond_26
    const v2, 0x677270

    .line 611
    .line 612
    .line 613
    if-ne v0, v2, :cond_27

    .line 614
    .line 615
    const-string v0, "TIT1"

    .line 616
    .line 617
    invoke-static {v4, v0, v1}, Lcom/google/android/gms/internal/ads/zzaly;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;

    .line 618
    .line 619
    .line 620
    move-result-object v15

    .line 621
    goto :goto_6

    .line 622
    :cond_27
    const v2, 0x6d766e

    .line 623
    .line 624
    .line 625
    if-ne v0, v2, :cond_28

    .line 626
    .line 627
    const-string v0, "MVNM"

    .line 628
    .line 629
    invoke-static {v4, v0, v1}, Lcom/google/android/gms/internal/ads/zzaly;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;

    .line 630
    .line 631
    .line 632
    move-result-object v15

    .line 633
    goto :goto_6

    .line 634
    :cond_28
    const v2, 0x6d7669

    .line 635
    .line 636
    .line 637
    if-ne v0, v2, :cond_29

    .line 638
    .line 639
    const-string v0, "MVIN"

    .line 640
    .line 641
    invoke-static {v4, v0, v1, v12, v14}, Lcom/google/android/gms/internal/ads/zzaly;->zze(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;ZZ)Lcom/google/android/gms/internal/ads/zzajs;

    .line 642
    .line 643
    .line 644
    move-result-object v15

    .line 645
    goto :goto_6

    .line 646
    :cond_29
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzgb;->zze(I)Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 651
    .line 652
    .line 653
    move-result v2

    .line 654
    add-int/lit8 v2, v2, 0x20

    .line 655
    .line 656
    new-instance v3, Ljava/lang/StringBuilder;

    .line 657
    .line 658
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    invoke-static {v13, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zza(Ljava/lang/String;Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    goto :goto_6

    .line 675
    :cond_2a
    :goto_4
    const-string v0, "TCOM"

    .line 676
    .line 677
    invoke-static {v4, v0, v1}, Lcom/google/android/gms/internal/ads/zzaly;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;

    .line 678
    .line 679
    .line 680
    move-result-object v15

    .line 681
    goto :goto_6

    .line 682
    :cond_2b
    :goto_5
    const-string v0, "TIT2"

    .line 683
    .line 684
    invoke-static {v4, v0, v1}, Lcom/google/android/gms/internal/ads/zzaly;->zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;

    .line 685
    .line 686
    .line 687
    move-result-object v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 688
    :cond_2c
    :goto_6
    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 689
    .line 690
    .line 691
    return-object v15

    .line 692
    :goto_7
    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 693
    .line 694
    .line 695
    throw v0
.end method

.method private static zzd(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;
    .locals 4

    .line 1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0x64617461

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    const/16 p0, 0x8

    .line 16
    .line 17
    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v0, v0, -0x10

    .line 21
    .line 22
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzL(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    new-instance p2, Lcom/google/android/gms/internal/ads/zzajx;

    .line 27
    .line 28
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {p2, p1, v3, p0}, Lcom/google/android/gms/internal/ads/zzajx;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    return-object p2

    .line 36
    :cond_0
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgb;->zze(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const-string p1, "Failed to parse text attribute: "

    .line 41
    .line 42
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const-string p1, "MetadataUtil"

    .line 47
    .line 48
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v3
.end method

.method private static zze(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;ZZ)Lcom/google/android/gms/internal/ads/zzajs;
    .locals 0

    .line 1
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzaly;->zzf(Lcom/google/android/gms/internal/ads/zzeu;)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p4, 0x1

    .line 8
    invoke-static {p4, p2}, Ljava/lang/Math;->min(II)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    :cond_0
    const/4 p4, 0x0

    .line 13
    if-ltz p2, :cond_2

    .line 14
    .line 15
    if-eqz p3, :cond_1

    .line 16
    .line 17
    new-instance p0, Lcom/google/android/gms/internal/ads/zzajx;

    .line 18
    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-direct {p0, p1, p4, p2}, Lcom/google/android/gms/internal/ads/zzajx;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    new-instance p0, Lcom/google/android/gms/internal/ads/zzajm;

    .line 32
    .line 33
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    const-string p3, "und"

    .line 38
    .line 39
    invoke-direct {p0, p3, p1, p2}, Lcom/google/android/gms/internal/ads/zzajm;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_2
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgb;->zze(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string p1, "Failed to parse uint8 attribute: "

    .line 48
    .line 49
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-string p1, "MetadataUtil"

    .line 54
    .line 55
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object p4
.end method

.method private static zzf(Lcom/google/android/gms/internal/ads/zzeu;)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0x64617461

    .line 10
    .line 11
    .line 12
    if-ne v1, v2, :cond_4

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v0, v0, -0x10

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    if-eq v0, v1, :cond_2

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    if-eq v0, v1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzn()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    and-int/lit16 v0, v0, 0x80

    .line 39
    .line 40
    if-nez v0, :cond_4

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0

    .line 47
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzx()I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    return p0

    .line 52
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    return p0

    .line 62
    :cond_4
    :goto_0
    const-string p0, "MetadataUtil"

    .line 63
    .line 64
    const-string v0, "Failed to parse data atom to int"

    .line 65
    .line 66
    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, -0x1

    .line 70
    return p0
.end method

.method private static zzg(ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzajx;
    .locals 4

    .line 1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const v2, 0x64617461

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v1, v2, :cond_1

    .line 14
    .line 15
    const/16 v1, 0x16

    .line 16
    .line 17
    if-lt v0, v1, :cond_1

    .line 18
    .line 19
    const/16 v0, 0xa

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-lez v0, :cond_1

    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-lez p2, :cond_0

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    add-int/lit8 v0, v0, 0x1

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    new-instance v2, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    add-int/2addr v0, v1

    .line 73
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string p0, "/"

    .line 80
    .line 81
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    :cond_0
    new-instance p2, Lcom/google/android/gms/internal/ads/zzajx;

    .line 92
    .line 93
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgwt;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-direct {p2, p1, v3, p0}, Lcom/google/android/gms/internal/ads/zzajx;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 98
    .line 99
    .line 100
    return-object p2

    .line 101
    :cond_1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgb;->zze(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    const-string p1, "Failed to parse index/count attribute: "

    .line 106
    .line 107
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    const-string p1, "MetadataUtil"

    .line 112
    .line 113
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-object v3
.end method
