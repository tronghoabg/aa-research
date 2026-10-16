.class final Lcom/google/android/gms/internal/ads/zzsi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzsh;

.field private final zzb:I

.field private final zzc:Lcom/google/android/gms/internal/ads/zzth;

.field private zzd:I

.field private zze:J

.field private zzf:J

.field private zzg:J

.field private zzh:J

.field private zzi:J


# direct methods
.method public constructor <init>(Landroid/media/AudioTrack;Lcom/google/android/gms/internal/ads/zzth;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/internal/ads/zzsh;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzsh;-><init>(Landroid/media/AudioTrack;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzsi;->zza:Lcom/google/android/gms/internal/ads/zzsh;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getSampleRate()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzb:I

    .line 16
    .line 17
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzc:Lcom/google/android/gms/internal/ads/zzth;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzsi;->zzf(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method private final zzf(I)V
    .locals 6

    .line 1
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzd:I

    .line 2
    .line 3
    const-wide/16 v0, 0x2710

    .line 4
    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eq p1, v2, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p1, v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-eq p1, v0, :cond_0

    .line 15
    .line 16
    const-wide/32 v0, 0x7a120

    .line 17
    .line 18
    .line 19
    :goto_0
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzf:J

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-wide/32 v0, 0x989680

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzf:J

    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzg:J

    .line 32
    .line 33
    const-wide/16 v2, -0x1

    .line 34
    .line 35
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzh:J

    .line 36
    .line 37
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzi:J

    .line 43
    .line 44
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    const-wide/16 v4, 0x3e8

    .line 49
    .line 50
    div-long/2addr v2, v4

    .line 51
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzsi;->zze:J

    .line 52
    .line 53
    goto :goto_0
.end method

.method private final zzg(JF)J
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsi;->zza:Lcom/google/android/gms/internal/ads/zzsh;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsh;->zzc()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzsh;->zzb()J

    .line 8
    .line 9
    .line 10
    move-result-wide v4

    .line 11
    move-object v1, p0

    .line 12
    move-wide v6, p1

    .line 13
    move v8, p3

    .line 14
    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/ads/zzsi;->zzh(JJJF)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    return-wide p1
.end method

.method private final zzh(JJJF)J
    .locals 0

    .line 1
    sub-long/2addr p5, p3

    .line 2
    iget p3, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzb:I

    .line 3
    .line 4
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzfm;->zzu(JI)J

    .line 5
    .line 6
    .line 7
    move-result-wide p1

    .line 8
    invoke-static {p5, p6, p7}, Lcom/google/android/gms/internal/ads/zzfm;->zzy(JF)J

    .line 9
    .line 10
    .line 11
    move-result-wide p3

    .line 12
    add-long/2addr p3, p1

    .line 13
    return-wide p3
.end method


# virtual methods
.method public final zza(JFJZ)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v5, p1

    .line 4
    .line 5
    move-wide/from16 v1, p4

    .line 6
    .line 7
    if-nez p6, :cond_0

    .line 8
    .line 9
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzsi;->zzg:J

    .line 10
    .line 11
    sub-long v3, v5, v3

    .line 12
    .line 13
    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/zzsi;->zzf:J

    .line 14
    .line 15
    cmp-long v3, v3, v7

    .line 16
    .line 17
    if-gez v3, :cond_0

    .line 18
    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :cond_0
    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzsi;->zzg:J

    .line 22
    .line 23
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzsi;->zza:Lcom/google/android/gms/internal/ads/zzsh;

    .line 24
    .line 25
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzsh;->zza()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_3

    .line 30
    .line 31
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzsh;->zzb()J

    .line 32
    .line 33
    .line 34
    move-result-wide v10

    .line 35
    invoke-direct/range {p0 .. p3}, Lcom/google/android/gms/internal/ads/zzsi;->zzg(JF)J

    .line 36
    .line 37
    .line 38
    move-result-wide v12

    .line 39
    sub-long v14, v10, v5

    .line 40
    .line 41
    invoke-static {v14, v15}, Ljava/lang/Math;->abs(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v14

    .line 45
    const-wide/32 v16, 0x4c4b40

    .line 46
    .line 47
    .line 48
    cmp-long v7, v14, v16

    .line 49
    .line 50
    const-string v14, "AudioTrackAudioOutput"

    .line 51
    .line 52
    const-string v15, ", "

    .line 53
    .line 54
    const/16 p6, 0x2

    .line 55
    .line 56
    const/4 v9, 0x4

    .line 57
    if-lez v7, :cond_1

    .line 58
    .line 59
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzsi;->zzc:Lcom/google/android/gms/internal/ads/zzth;

    .line 60
    .line 61
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzsh;->zzc()J

    .line 62
    .line 63
    .line 64
    move-result-wide v12

    .line 65
    check-cast v7, Lcom/google/android/gms/internal/ads/zzsu;

    .line 66
    .line 67
    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzsu;->zza:Lcom/google/android/gms/internal/ads/zztb;

    .line 68
    .line 69
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zztb;->zzs()J

    .line 70
    .line 71
    .line 72
    move-result-wide v4

    .line 73
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v16

    .line 85
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    .line 86
    .line 87
    .line 88
    move-result v16

    .line 89
    invoke-static/range {p1 .. p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v17

    .line 93
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    .line 94
    .line 95
    .line 96
    move-result v17

    .line 97
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v18

    .line 101
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    .line 102
    .line 103
    .line 104
    move-result v18

    .line 105
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v19

    .line 109
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    .line 110
    .line 111
    .line 112
    move-result v19

    .line 113
    add-int/lit8 v7, v7, 0x34

    .line 114
    .line 115
    add-int v7, v7, v16

    .line 116
    .line 117
    add-int/lit8 v7, v7, 0x2

    .line 118
    .line 119
    add-int v7, v7, v17

    .line 120
    .line 121
    add-int/lit8 v7, v7, 0x2

    .line 122
    .line 123
    add-int v7, v7, v18

    .line 124
    .line 125
    add-int/lit8 v7, v7, 0x2

    .line 126
    .line 127
    new-instance v6, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    add-int v7, v7, v19

    .line 130
    .line 131
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 132
    .line 133
    .line 134
    const-string v7, "Spurious audio timestamp (system clock mismatch): "

    .line 135
    .line 136
    invoke-static {v6, v7, v12, v13, v15}, LVa/M6;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    move-wide/from16 v10, p1

    .line 143
    .line 144
    invoke-static {v6, v15, v10, v11, v15}, LVa/M6;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v6, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-static {v14, v1}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/ads/zzsi;->zzf(I)V

    .line 164
    .line 165
    .line 166
    move/from16 v19, v3

    .line 167
    .line 168
    move-wide v4, v10

    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_1
    move-wide v4, v5

    .line 172
    sub-long/2addr v12, v1

    .line 173
    invoke-static {v12, v13}, Ljava/lang/Math;->abs(J)J

    .line 174
    .line 175
    .line 176
    move-result-wide v6

    .line 177
    cmp-long v6, v6, v16

    .line 178
    .line 179
    if-lez v6, :cond_2

    .line 180
    .line 181
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzsi;->zzc:Lcom/google/android/gms/internal/ads/zzth;

    .line 182
    .line 183
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzsh;->zzc()J

    .line 184
    .line 185
    .line 186
    move-result-wide v12

    .line 187
    check-cast v6, Lcom/google/android/gms/internal/ads/zzsu;

    .line 188
    .line 189
    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzsu;->zza:Lcom/google/android/gms/internal/ads/zztb;

    .line 190
    .line 191
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zztb;->zzs()J

    .line 192
    .line 193
    .line 194
    move-result-wide v6

    .line 195
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v16

    .line 199
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    .line 200
    .line 201
    .line 202
    move-result v16

    .line 203
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v17

    .line 207
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    .line 208
    .line 209
    .line 210
    move-result v17

    .line 211
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v19

    .line 215
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    .line 216
    .line 217
    .line 218
    move-result v19

    .line 219
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v20

    .line 223
    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    .line 224
    .line 225
    .line 226
    move-result v20

    .line 227
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v21

    .line 231
    invoke-virtual/range {v21 .. v21}, Ljava/lang/String;->length()I

    .line 232
    .line 233
    .line 234
    move-result v21

    .line 235
    add-int/lit8 v16, v16, 0x36

    .line 236
    .line 237
    add-int v16, v16, v17

    .line 238
    .line 239
    add-int/lit8 v16, v16, 0x2

    .line 240
    .line 241
    add-int v16, v16, v19

    .line 242
    .line 243
    add-int/lit8 v16, v16, 0x2

    .line 244
    .line 245
    add-int v16, v16, v20

    .line 246
    .line 247
    add-int/lit8 v16, v16, 0x2

    .line 248
    .line 249
    new-instance v9, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    move/from16 v19, v3

    .line 252
    .line 253
    add-int v3, v16, v21

    .line 254
    .line 255
    invoke-direct {v9, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 256
    .line 257
    .line 258
    const-string v3, "Spurious audio timestamp (frame position mismatch): "

    .line 259
    .line 260
    invoke-static {v9, v3, v12, v13, v15}, LVa/M6;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v9, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-static {v9, v15, v4, v5, v15}, LVa/M6;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v9, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v9, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    invoke-static {v14, v1}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    const/4 v1, 0x4

    .line 286
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzsi;->zzf(I)V

    .line 287
    .line 288
    .line 289
    goto :goto_0

    .line 290
    :cond_2
    move/from16 v19, v3

    .line 291
    .line 292
    move v1, v9

    .line 293
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzsi;->zzd:I

    .line 294
    .line 295
    if-ne v2, v1, :cond_4

    .line 296
    .line 297
    const/4 v6, 0x0

    .line 298
    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/ads/zzsi;->zzf(I)V

    .line 299
    .line 300
    .line 301
    goto :goto_0

    .line 302
    :cond_3
    move/from16 v19, v3

    .line 303
    .line 304
    move-wide v4, v5

    .line 305
    const/16 p6, 0x2

    .line 306
    .line 307
    :cond_4
    :goto_0
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzsi;->zzd:I

    .line 308
    .line 309
    const/4 v2, 0x1

    .line 310
    const/4 v9, 0x3

    .line 311
    if-eqz v1, :cond_c

    .line 312
    .line 313
    if-eq v1, v2, :cond_7

    .line 314
    .line 315
    move/from16 v2, p6

    .line 316
    .line 317
    if-eq v1, v2, :cond_6

    .line 318
    .line 319
    if-eq v1, v9, :cond_5

    .line 320
    .line 321
    goto/16 :goto_2

    .line 322
    .line 323
    :cond_5
    if-eqz v19, :cond_e

    .line 324
    .line 325
    const/4 v6, 0x0

    .line 326
    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/ads/zzsi;->zzf(I)V

    .line 327
    .line 328
    .line 329
    return-void

    .line 330
    :cond_6
    const/4 v6, 0x0

    .line 331
    if-nez v19, :cond_e

    .line 332
    .line 333
    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/ads/zzsi;->zzf(I)V

    .line 334
    .line 335
    .line 336
    return-void

    .line 337
    :cond_7
    if-eqz v19, :cond_b

    .line 338
    .line 339
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzsh;->zzc()J

    .line 340
    .line 341
    .line 342
    move-result-wide v1

    .line 343
    move-wide v6, v1

    .line 344
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzsi;->zzh:J

    .line 345
    .line 346
    cmp-long v3, v6, v1

    .line 347
    .line 348
    if-gtz v3, :cond_8

    .line 349
    .line 350
    goto :goto_1

    .line 351
    :cond_8
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzsi;->zzi:J

    .line 352
    .line 353
    move-wide/from16 v5, p1

    .line 354
    .line 355
    move/from16 v7, p3

    .line 356
    .line 357
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/zzsi;->zzh(JJJF)J

    .line 358
    .line 359
    .line 360
    move-result-wide v1

    .line 361
    invoke-direct/range {p0 .. p3}, Lcom/google/android/gms/internal/ads/zzsi;->zzg(JF)J

    .line 362
    .line 363
    .line 364
    move-result-wide v3

    .line 365
    sub-long/2addr v3, v1

    .line 366
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    .line 367
    .line 368
    .line 369
    move-result-wide v1

    .line 370
    const-wide/16 v3, 0x3e8

    .line 371
    .line 372
    cmp-long v1, v1, v3

    .line 373
    .line 374
    if-gez v1, :cond_9

    .line 375
    .line 376
    const/4 v2, 0x2

    .line 377
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzsi;->zzf(I)V

    .line 378
    .line 379
    .line 380
    return-void

    .line 381
    :cond_9
    :goto_1
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzsi;->zze:J

    .line 382
    .line 383
    sub-long v1, p1, v1

    .line 384
    .line 385
    const-wide/32 v3, 0x1e8480

    .line 386
    .line 387
    .line 388
    cmp-long v1, v1, v3

    .line 389
    .line 390
    if-lez v1, :cond_a

    .line 391
    .line 392
    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/ads/zzsi;->zzf(I)V

    .line 393
    .line 394
    .line 395
    return-void

    .line 396
    :cond_a
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzsh;->zzc()J

    .line 397
    .line 398
    .line 399
    move-result-wide v1

    .line 400
    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzsi;->zzh:J

    .line 401
    .line 402
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzsh;->zzb()J

    .line 403
    .line 404
    .line 405
    move-result-wide v1

    .line 406
    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzsi;->zzi:J

    .line 407
    .line 408
    return-void

    .line 409
    :cond_b
    const/4 v6, 0x0

    .line 410
    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/ads/zzsi;->zzf(I)V

    .line 411
    .line 412
    .line 413
    return-void

    .line 414
    :cond_c
    if-eqz v19, :cond_d

    .line 415
    .line 416
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzsh;->zzb()J

    .line 417
    .line 418
    .line 419
    move-result-wide v3

    .line 420
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzsi;->zze:J

    .line 421
    .line 422
    cmp-long v1, v3, v5

    .line 423
    .line 424
    if-ltz v1, :cond_e

    .line 425
    .line 426
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzsh;->zzc()J

    .line 427
    .line 428
    .line 429
    move-result-wide v3

    .line 430
    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzsi;->zzh:J

    .line 431
    .line 432
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzsh;->zzb()J

    .line 433
    .line 434
    .line 435
    move-result-wide v3

    .line 436
    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzsi;->zzi:J

    .line 437
    .line 438
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzsi;->zzf(I)V

    .line 439
    .line 440
    .line 441
    return-void

    .line 442
    :cond_d
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzsi;->zze:J

    .line 443
    .line 444
    sub-long v1, p1, v1

    .line 445
    .line 446
    const-wide/32 v3, 0x7a120

    .line 447
    .line 448
    .line 449
    cmp-long v1, v1, v3

    .line 450
    .line 451
    if-lez v1, :cond_e

    .line 452
    .line 453
    invoke-direct {v0, v9}, Lcom/google/android/gms/internal/ads/zzsi;->zzf(I)V

    .line 454
    .line 455
    .line 456
    :cond_e
    :goto_2
    return-void
.end method

.method public final zzb()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzd:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzc()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzsi;->zzd:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    return v1
.end method

.method public final zzd()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzsi;->zzf(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final zze(JF)J
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzsi;->zzg(JF)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    return-wide p1
.end method
