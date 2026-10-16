.class public final Lcom/google/android/gms/internal/ads/zzaqt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzarp;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzaqa;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzet;

.field private zzc:I

.field private zzd:I

.field private zze:Lcom/google/android/gms/internal/ads/zzfj;

.field private zzf:Z

.field private zzg:Z

.field private zzh:Z

.field private zzi:I

.field private zzj:I

.field private zzk:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzaqa;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqt;->zza:Lcom/google/android/gms/internal/ads/zzaqa;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzet;

    const/16 v0, 0xa

    new-array v1, v0, [B

    invoke-direct {p1, v1, v0}, Lcom/google/android/gms/internal/ads/zzet;-><init>([BI)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqt;->zzb:Lcom/google/android/gms/internal/ads/zzet;

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaqt;->zzc:I

    return-void
.end method

.method private final zze(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaqt;->zzc:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaqt;->zzd:I

    return-void
.end method

.method private final zzf(Lcom/google/android/gms/internal/ads/zzeu;[BI)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzaqt;->zzd:I

    .line 6
    .line 7
    sub-int v1, p3, v1

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-gtz v0, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    if-nez p2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzaqt;->zzd:I

    .line 24
    .line 25
    invoke-virtual {p1, p2, v2, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzaqt;->zzd:I

    .line 29
    .line 30
    add-int/2addr p1, v0

    .line 31
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaqt;->zzd:I

    .line 32
    .line 33
    if-ne p1, p3, :cond_2

    .line 34
    .line 35
    return v1

    .line 36
    :cond_2
    const/4 p1, 0x0

    .line 37
    return p1
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzfj;Lcom/google/android/gms/internal/ads/zzagd;Lcom/google/android/gms/internal/ads/zzaro;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqt;->zze:Lcom/google/android/gms/internal/ads/zzfj;

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqt;->zza:Lcom/google/android/gms/internal/ads/zzaqa;

    .line 4
    .line 5
    invoke-interface {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzaqa;->zzb(Lcom/google/android/gms/internal/ads/zzagd;Lcom/google/android/gms/internal/ads/zzaro;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final zzb()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaqt;->zzc:I

    .line 3
    .line 4
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaqt;->zzd:I

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaqt;->zzh:Z

    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqt;->zza:Lcom/google/android/gms/internal/ads/zzaqa;

    .line 9
    .line 10
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaqa;->zza()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzeu;I)V
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zze:Lcom/google/android/gms/internal/ads/zzfj;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    and-int/lit8 v2, p2, 0x1

    .line 11
    .line 12
    const-string v3, "PesReader"

    .line 13
    .line 14
    const/4 v4, -0x1

    .line 15
    const/4 v5, 0x2

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x1

    .line 18
    if-eqz v2, :cond_4

    .line 19
    .line 20
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzc:I

    .line 21
    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    if-eq v2, v7, :cond_3

    .line 25
    .line 26
    if-eq v2, v5, :cond_2

    .line 27
    .line 28
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzj:I

    .line 29
    .line 30
    if-eq v2, v4, :cond_0

    .line 31
    .line 32
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    new-instance v9, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    add-int/lit8 v8, v8, 0x30

    .line 43
    .line 44
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 45
    .line 46
    .line 47
    const-string v8, "Unexpected start indicator: expected "

    .line 48
    .line 49
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v2, " more bytes"

    .line 56
    .line 57
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-nez v2, :cond_1

    .line 72
    .line 73
    move v2, v7

    .line 74
    goto :goto_0

    .line 75
    :cond_1
    move v2, v6

    .line 76
    :goto_0
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zza:Lcom/google/android/gms/internal/ads/zzaqa;

    .line 77
    .line 78
    invoke-interface {v8, v2}, Lcom/google/android/gms/internal/ads/zzaqa;->zze(Z)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    const-string v2, "Unexpected start indicator reading extended header"

    .line 83
    .line 84
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    :goto_1
    invoke-direct {v0, v7}, Lcom/google/android/gms/internal/ads/zzaqt;->zze(I)V

    .line 88
    .line 89
    .line 90
    :cond_4
    move/from16 v2, p2

    .line 91
    .line 92
    :goto_2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    if-lez v8, :cond_12

    .line 97
    .line 98
    iget v8, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzc:I

    .line 99
    .line 100
    if-eqz v8, :cond_11

    .line 101
    .line 102
    if-eq v8, v7, :cond_c

    .line 103
    .line 104
    if-eq v8, v5, :cond_8

    .line 105
    .line 106
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    iget v9, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzj:I

    .line 111
    .line 112
    if-ne v9, v4, :cond_5

    .line 113
    .line 114
    move v9, v6

    .line 115
    goto :goto_3

    .line 116
    :cond_5
    sub-int v9, v8, v9

    .line 117
    .line 118
    :goto_3
    if-lez v9, :cond_6

    .line 119
    .line 120
    sub-int/2addr v8, v9

    .line 121
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    add-int/2addr v9, v8

    .line 126
    invoke-virtual {v1, v9}, Lcom/google/android/gms/internal/ads/zzeu;->zzf(I)V

    .line 127
    .line 128
    .line 129
    :cond_6
    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zza:Lcom/google/android/gms/internal/ads/zzaqa;

    .line 130
    .line 131
    invoke-interface {v9, v1}, Lcom/google/android/gms/internal/ads/zzaqa;->zzd(Lcom/google/android/gms/internal/ads/zzeu;)V

    .line 132
    .line 133
    .line 134
    iget v10, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzj:I

    .line 135
    .line 136
    if-eq v10, v4, :cond_7

    .line 137
    .line 138
    sub-int/2addr v10, v8

    .line 139
    iput v10, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzj:I

    .line 140
    .line 141
    if-nez v10, :cond_7

    .line 142
    .line 143
    invoke-interface {v9, v6}, Lcom/google/android/gms/internal/ads/zzaqa;->zze(Z)V

    .line 144
    .line 145
    .line 146
    invoke-direct {v0, v7}, Lcom/google/android/gms/internal/ads/zzaqt;->zze(I)V

    .line 147
    .line 148
    .line 149
    :cond_7
    move v9, v5

    .line 150
    goto/16 :goto_9

    .line 151
    .line 152
    :cond_8
    const/16 v8, 0xa

    .line 153
    .line 154
    iget v10, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzi:I

    .line 155
    .line 156
    invoke-static {v8, v10}, Ljava/lang/Math;->min(II)I

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzb:Lcom/google/android/gms/internal/ads/zzet;

    .line 161
    .line 162
    iget-object v11, v10, Lcom/google/android/gms/internal/ads/zzet;->zza:[B

    .line 163
    .line 164
    invoke-direct {v0, v1, v11, v8}, Lcom/google/android/gms/internal/ads/zzaqt;->zzf(Lcom/google/android/gms/internal/ads/zzeu;[BI)Z

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    if-eqz v8, :cond_7

    .line 169
    .line 170
    const/4 v8, 0x0

    .line 171
    iget v11, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzi:I

    .line 172
    .line 173
    invoke-direct {v0, v1, v8, v11}, Lcom/google/android/gms/internal/ads/zzaqt;->zzf(Lcom/google/android/gms/internal/ads/zzeu;[BI)Z

    .line 174
    .line 175
    .line 176
    move-result v8

    .line 177
    if-eqz v8, :cond_7

    .line 178
    .line 179
    invoke-virtual {v10, v6}, Lcom/google/android/gms/internal/ads/zzet;->zzf(I)V

    .line 180
    .line 181
    .line 182
    iget-boolean v8, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzf:Z

    .line 183
    .line 184
    const/4 v11, 0x3

    .line 185
    const/4 v12, 0x4

    .line 186
    if-eqz v8, :cond_a

    .line 187
    .line 188
    invoke-virtual {v10, v12}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v10, v11}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    int-to-long v13, v8

    .line 196
    invoke-virtual {v10, v7}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 197
    .line 198
    .line 199
    const/16 v8, 0xf

    .line 200
    .line 201
    invoke-virtual {v10, v8}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 202
    .line 203
    .line 204
    move-result v15

    .line 205
    shl-int/2addr v15, v8

    .line 206
    invoke-virtual {v10, v7}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 207
    .line 208
    .line 209
    const/16 p2, 0x1e

    .line 210
    .line 211
    invoke-virtual {v10, v8}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 212
    .line 213
    .line 214
    move-result v9

    .line 215
    int-to-long v4, v9

    .line 216
    invoke-virtual {v10, v7}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 217
    .line 218
    .line 219
    iget-boolean v9, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzh:Z

    .line 220
    .line 221
    if-nez v9, :cond_9

    .line 222
    .line 223
    iget-boolean v9, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzg:Z

    .line 224
    .line 225
    if-eqz v9, :cond_9

    .line 226
    .line 227
    invoke-virtual {v10, v12}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v10, v11}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 231
    .line 232
    .line 233
    move-result v9

    .line 234
    move-wide/from16 v16, v13

    .line 235
    .line 236
    int-to-long v12, v9

    .line 237
    shl-long v12, v12, p2

    .line 238
    .line 239
    invoke-virtual {v10, v7}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v10, v8}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 243
    .line 244
    .line 245
    move-result v9

    .line 246
    shl-int/2addr v9, v8

    .line 247
    invoke-virtual {v10, v7}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v10, v8}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    move-wide/from16 v18, v12

    .line 255
    .line 256
    int-to-long v11, v8

    .line 257
    invoke-virtual {v10, v7}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 258
    .line 259
    .line 260
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zze:Lcom/google/android/gms/internal/ads/zzfj;

    .line 261
    .line 262
    int-to-long v9, v9

    .line 263
    or-long v9, v18, v9

    .line 264
    .line 265
    or-long/2addr v9, v11

    .line 266
    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/internal/ads/zzfj;->zze(J)J

    .line 267
    .line 268
    .line 269
    iput-boolean v7, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzh:Z

    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_9
    move-wide/from16 v16, v13

    .line 273
    .line 274
    :goto_4
    shl-long v8, v16, p2

    .line 275
    .line 276
    int-to-long v10, v15

    .line 277
    or-long/2addr v8, v10

    .line 278
    or-long/2addr v4, v8

    .line 279
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zze:Lcom/google/android/gms/internal/ads/zzfj;

    .line 280
    .line 281
    invoke-virtual {v8, v4, v5}, Lcom/google/android/gms/internal/ads/zzfj;->zze(J)J

    .line 282
    .line 283
    .line 284
    move-result-wide v4

    .line 285
    goto :goto_5

    .line 286
    :cond_a
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    :goto_5
    iget-boolean v8, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzk:Z

    .line 292
    .line 293
    if-eq v7, v8, :cond_b

    .line 294
    .line 295
    move v12, v6

    .line 296
    goto :goto_6

    .line 297
    :cond_b
    const/4 v12, 0x4

    .line 298
    :goto_6
    or-int/2addr v2, v12

    .line 299
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zza:Lcom/google/android/gms/internal/ads/zzaqa;

    .line 300
    .line 301
    invoke-interface {v8, v4, v5, v2}, Lcom/google/android/gms/internal/ads/zzaqa;->zzc(JI)V

    .line 302
    .line 303
    .line 304
    const/4 v14, 0x3

    .line 305
    invoke-direct {v0, v14}, Lcom/google/android/gms/internal/ads/zzaqt;->zze(I)V

    .line 306
    .line 307
    .line 308
    const/4 v4, -0x1

    .line 309
    const/4 v5, 0x2

    .line 310
    goto/16 :goto_2

    .line 311
    .line 312
    :cond_c
    const/16 p2, 0x1e

    .line 313
    .line 314
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzb:Lcom/google/android/gms/internal/ads/zzet;

    .line 315
    .line 316
    iget-object v5, v4, Lcom/google/android/gms/internal/ads/zzet;->zza:[B

    .line 317
    .line 318
    const/16 v8, 0x9

    .line 319
    .line 320
    invoke-direct {v0, v1, v5, v8}, Lcom/google/android/gms/internal/ads/zzaqt;->zzf(Lcom/google/android/gms/internal/ads/zzeu;[BI)Z

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    if-eqz v5, :cond_10

    .line 325
    .line 326
    invoke-virtual {v4, v6}, Lcom/google/android/gms/internal/ads/zzet;->zzf(I)V

    .line 327
    .line 328
    .line 329
    const/16 v5, 0x18

    .line 330
    .line 331
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 332
    .line 333
    .line 334
    move-result v5

    .line 335
    if-eq v5, v7, :cond_d

    .line 336
    .line 337
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 342
    .line 343
    .line 344
    move-result v4

    .line 345
    new-instance v8, Ljava/lang/StringBuilder;

    .line 346
    .line 347
    add-int/lit8 v4, v4, 0x1e

    .line 348
    .line 349
    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 350
    .line 351
    .line 352
    const-string v4, "Unexpected start code prefix: "

    .line 353
    .line 354
    invoke-static {v8, v4, v5, v3}, Lcb/a;->v(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 355
    .line 356
    .line 357
    const/4 v4, -0x1

    .line 358
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzj:I

    .line 359
    .line 360
    move v5, v6

    .line 361
    const/4 v9, 0x2

    .line 362
    goto :goto_8

    .line 363
    :cond_d
    const/16 v5, 0x8

    .line 364
    .line 365
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 366
    .line 367
    .line 368
    const/16 v8, 0x10

    .line 369
    .line 370
    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 371
    .line 372
    .line 373
    move-result v8

    .line 374
    const/4 v9, 0x5

    .line 375
    invoke-virtual {v4, v9}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 379
    .line 380
    .line 381
    move-result v9

    .line 382
    iput-boolean v9, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzk:Z

    .line 383
    .line 384
    const/4 v9, 0x2

    .line 385
    invoke-virtual {v4, v9}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 389
    .line 390
    .line 391
    move-result v10

    .line 392
    iput-boolean v10, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzf:Z

    .line 393
    .line 394
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 395
    .line 396
    .line 397
    move-result v10

    .line 398
    iput-boolean v10, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzg:Z

    .line 399
    .line 400
    const/4 v10, 0x6

    .line 401
    invoke-virtual {v4, v10}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 405
    .line 406
    .line 407
    move-result v4

    .line 408
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzi:I

    .line 409
    .line 410
    if-nez v8, :cond_e

    .line 411
    .line 412
    const/4 v5, -0x1

    .line 413
    iput v5, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzj:I

    .line 414
    .line 415
    move v4, v5

    .line 416
    :goto_7
    move v5, v9

    .line 417
    goto :goto_8

    .line 418
    :cond_e
    add-int/lit8 v8, v8, -0x3

    .line 419
    .line 420
    sub-int/2addr v8, v4

    .line 421
    iput v8, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzj:I

    .line 422
    .line 423
    if-gez v8, :cond_f

    .line 424
    .line 425
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v4

    .line 429
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 430
    .line 431
    .line 432
    move-result v4

    .line 433
    new-instance v5, Ljava/lang/StringBuilder;

    .line 434
    .line 435
    add-int/lit8 v4, v4, 0x24

    .line 436
    .line 437
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 438
    .line 439
    .line 440
    const-string v4, "Found negative packet payload size: "

    .line 441
    .line 442
    invoke-static {v5, v4, v8, v3}, Lcb/a;->v(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 443
    .line 444
    .line 445
    const/4 v4, -0x1

    .line 446
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzaqt;->zzj:I

    .line 447
    .line 448
    goto :goto_7

    .line 449
    :cond_f
    const/4 v4, -0x1

    .line 450
    goto :goto_7

    .line 451
    :goto_8
    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/ads/zzaqt;->zze(I)V

    .line 452
    .line 453
    .line 454
    goto :goto_9

    .line 455
    :cond_10
    const/4 v4, -0x1

    .line 456
    const/4 v9, 0x2

    .line 457
    goto :goto_9

    .line 458
    :cond_11
    move v9, v5

    .line 459
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 460
    .line 461
    .line 462
    move-result v5

    .line 463
    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 464
    .line 465
    .line 466
    :goto_9
    move v5, v9

    .line 467
    goto/16 :goto_2

    .line 468
    .line 469
    :cond_12
    return-void
.end method

.method public final zzd(Z)Z
    .locals 1

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzaqt;->zzc:I

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzaqt;->zzj:I

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
