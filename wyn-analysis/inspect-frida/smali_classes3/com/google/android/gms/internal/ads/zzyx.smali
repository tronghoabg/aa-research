.class final Lcom/google/android/gms/internal/ads/zzyx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzabm;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzeu;

.field private zzc:Lcom/google/android/gms/internal/ads/zzyw;

.field private zzd:Lcom/google/android/gms/internal/ads/zzyw;

.field private zze:Lcom/google/android/gms/internal/ads/zzyw;

.field private zzf:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzabm;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyx;->zza:Lcom/google/android/gms/internal/ads/zzabm;

    .line 5
    .line 6
    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    .line 7
    .line 8
    const/16 v0, 0x20

    .line 9
    .line 10
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzb:Lcom/google/android/gms/internal/ads/zzeu;

    .line 14
    .line 15
    new-instance p1, Lcom/google/android/gms/internal/ads/zzyw;

    .line 16
    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    const/high16 v2, 0x10000

    .line 20
    .line 21
    invoke-direct {p1, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzyw;-><init>(JI)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzc:Lcom/google/android/gms/internal/ads/zzyw;

    .line 25
    .line 26
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzd:Lcom/google/android/gms/internal/ads/zzyw;

    .line 27
    .line 28
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyx;->zze:Lcom/google/android/gms/internal/ads/zzyw;

    .line 29
    .line 30
    return-void
.end method

.method private final zzi(I)I
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyx;->zze:Lcom/google/android/gms/internal/ads/zzyw;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzyw;->zzc:Lcom/google/android/gms/internal/ads/zzabk;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzyx;->zza:Lcom/google/android/gms/internal/ads/zzabm;

    .line 8
    .line 9
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzabm;->zza()Lcom/google/android/gms/internal/ads/zzabk;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Lcom/google/android/gms/internal/ads/zzyw;

    .line 14
    .line 15
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzyx;->zze:Lcom/google/android/gms/internal/ads/zzyw;

    .line 16
    .line 17
    iget-wide v3, v3, Lcom/google/android/gms/internal/ads/zzyw;->zzb:J

    .line 18
    .line 19
    const/high16 v5, 0x10000

    .line 20
    .line 21
    invoke-direct {v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzyw;-><init>(JI)V

    .line 22
    .line 23
    .line 24
    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzyw;->zzc:Lcom/google/android/gms/internal/ads/zzabk;

    .line 25
    .line 26
    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzyw;->zzd:Lcom/google/android/gms/internal/ads/zzyw;

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyx;->zze:Lcom/google/android/gms/internal/ads/zzyw;

    .line 29
    .line 30
    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zzyw;->zzb:J

    .line 31
    .line 32
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzf:J

    .line 33
    .line 34
    sub-long/2addr v0, v2

    .line 35
    long-to-int v0, v0

    .line 36
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1
.end method

.method private final zzj(I)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzf:J

    .line 2
    .line 3
    int-to-long v2, p1

    .line 4
    add-long/2addr v0, v2

    .line 5
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzf:J

    .line 6
    .line 7
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzyx;->zze:Lcom/google/android/gms/internal/ads/zzyw;

    .line 8
    .line 9
    iget-wide v2, p1, Lcom/google/android/gms/internal/ads/zzyw;->zzb:J

    .line 10
    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzyw;->zzd:Lcom/google/android/gms/internal/ads/zzyw;

    .line 16
    .line 17
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyx;->zze:Lcom/google/android/gms/internal/ads/zzyw;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method private static zzk(Lcom/google/android/gms/internal/ads/zzyw;Lcom/google/android/gms/internal/ads/zzix;Lcom/google/android/gms/internal/ads/zzyy;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzyw;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzix;->zzk()Z

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    if-eqz v4, :cond_9

    .line 13
    .line 14
    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/zzyy;->zzb:J

    .line 15
    .line 16
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    move-object/from16 v7, p0

    .line 24
    .line 25
    invoke-static {v7, v4, v5, v6, v3}, Lcom/google/android/gms/internal/ads/zzyx;->zzm(Lcom/google/android/gms/internal/ads/zzyw;J[BI)Lcom/google/android/gms/internal/ads/zzyw;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    const-wide/16 v7, 0x1

    .line 30
    .line 31
    add-long/2addr v4, v7

    .line 32
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    const/4 v8, 0x0

    .line 37
    aget-byte v7, v7, v8

    .line 38
    .line 39
    and-int/lit16 v9, v7, 0x80

    .line 40
    .line 41
    and-int/lit8 v7, v7, 0x7f

    .line 42
    .line 43
    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzix;->zzb:Lcom/google/android/gms/internal/ads/zziu;

    .line 44
    .line 45
    iget-object v11, v10, Lcom/google/android/gms/internal/ads/zziu;->zza:[B

    .line 46
    .line 47
    if-nez v11, :cond_0

    .line 48
    .line 49
    const/16 v11, 0x10

    .line 50
    .line 51
    new-array v11, v11, [B

    .line 52
    .line 53
    iput-object v11, v10, Lcom/google/android/gms/internal/ads/zziu;->zza:[B

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-static {v11, v8}, Ljava/util/Arrays;->fill([BB)V

    .line 57
    .line 58
    .line 59
    :goto_0
    if-eqz v9, :cond_1

    .line 60
    .line 61
    move v9, v3

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move v9, v8

    .line 64
    :goto_1
    iget-object v11, v10, Lcom/google/android/gms/internal/ads/zziu;->zza:[B

    .line 65
    .line 66
    invoke-static {v6, v4, v5, v11, v7}, Lcom/google/android/gms/internal/ads/zzyx;->zzm(Lcom/google/android/gms/internal/ads/zzyw;J[BI)Lcom/google/android/gms/internal/ads/zzyw;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    int-to-long v11, v7

    .line 71
    add-long/2addr v4, v11

    .line 72
    if-eqz v9, :cond_2

    .line 73
    .line 74
    const/4 v7, 0x2

    .line 75
    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 79
    .line 80
    .line 81
    move-result-object v11

    .line 82
    invoke-static {v6, v4, v5, v11, v7}, Lcom/google/android/gms/internal/ads/zzyx;->zzm(Lcom/google/android/gms/internal/ads/zzyw;J[BI)Lcom/google/android/gms/internal/ads/zzyw;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    const-wide/16 v11, 0x2

    .line 87
    .line 88
    add-long/2addr v4, v11

    .line 89
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    move v11, v7

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    move v11, v3

    .line 96
    :goto_2
    iget-object v7, v10, Lcom/google/android/gms/internal/ads/zziu;->zzd:[I

    .line 97
    .line 98
    if-eqz v7, :cond_4

    .line 99
    .line 100
    array-length v12, v7

    .line 101
    if-ge v12, v11, :cond_3

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_3
    :goto_3
    move-object v12, v7

    .line 105
    goto :goto_5

    .line 106
    :cond_4
    :goto_4
    new-array v7, v11, [I

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :goto_5
    iget-object v7, v10, Lcom/google/android/gms/internal/ads/zziu;->zze:[I

    .line 110
    .line 111
    if-eqz v7, :cond_6

    .line 112
    .line 113
    array-length v13, v7

    .line 114
    if-ge v13, v11, :cond_5

    .line 115
    .line 116
    goto :goto_7

    .line 117
    :cond_5
    :goto_6
    move-object v13, v7

    .line 118
    goto :goto_8

    .line 119
    :cond_6
    :goto_7
    new-array v7, v11, [I

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :goto_8
    if-eqz v9, :cond_7

    .line 123
    .line 124
    mul-int/lit8 v7, v11, 0x6

    .line 125
    .line 126
    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    invoke-static {v6, v4, v5, v9, v7}, Lcom/google/android/gms/internal/ads/zzyx;->zzm(Lcom/google/android/gms/internal/ads/zzyw;J[BI)Lcom/google/android/gms/internal/ads/zzyw;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    int-to-long v14, v7

    .line 138
    add-long/2addr v4, v14

    .line 139
    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 140
    .line 141
    .line 142
    :goto_9
    if-ge v8, v11, :cond_8

    .line 143
    .line 144
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    aput v7, v12, v8

    .line 149
    .line 150
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    aput v7, v13, v8

    .line 155
    .line 156
    add-int/2addr v8, v3

    .line 157
    goto :goto_9

    .line 158
    :cond_7
    aput v8, v12, v8

    .line 159
    .line 160
    iget v3, v1, Lcom/google/android/gms/internal/ads/zzyy;->zza:I

    .line 161
    .line 162
    iget-wide v14, v1, Lcom/google/android/gms/internal/ads/zzyy;->zzb:J

    .line 163
    .line 164
    sub-long v14, v4, v14

    .line 165
    .line 166
    long-to-int v7, v14

    .line 167
    sub-int/2addr v3, v7

    .line 168
    aput v3, v13, v8

    .line 169
    .line 170
    :cond_8
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzyy;->zzc:Lcom/google/android/gms/internal/ads/zzahl;

    .line 171
    .line 172
    sget-object v7, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 173
    .line 174
    iget-object v14, v3, Lcom/google/android/gms/internal/ads/zzahl;->zzb:[B

    .line 175
    .line 176
    iget-object v15, v10, Lcom/google/android/gms/internal/ads/zziu;->zza:[B

    .line 177
    .line 178
    iget v7, v3, Lcom/google/android/gms/internal/ads/zzahl;->zza:I

    .line 179
    .line 180
    iget v8, v3, Lcom/google/android/gms/internal/ads/zzahl;->zzc:I

    .line 181
    .line 182
    iget v3, v3, Lcom/google/android/gms/internal/ads/zzahl;->zzd:I

    .line 183
    .line 184
    move/from16 v18, v3

    .line 185
    .line 186
    move/from16 v16, v7

    .line 187
    .line 188
    move/from16 v17, v8

    .line 189
    .line 190
    invoke-virtual/range {v10 .. v18}, Lcom/google/android/gms/internal/ads/zziu;->zza(I[I[I[B[BIII)V

    .line 191
    .line 192
    .line 193
    iget-wide v7, v1, Lcom/google/android/gms/internal/ads/zzyy;->zzb:J

    .line 194
    .line 195
    sub-long/2addr v4, v7

    .line 196
    long-to-int v3, v4

    .line 197
    int-to-long v4, v3

    .line 198
    add-long/2addr v7, v4

    .line 199
    iput-wide v7, v1, Lcom/google/android/gms/internal/ads/zzyy;->zzb:J

    .line 200
    .line 201
    iget v4, v1, Lcom/google/android/gms/internal/ads/zzyy;->zza:I

    .line 202
    .line 203
    sub-int/2addr v4, v3

    .line 204
    iput v4, v1, Lcom/google/android/gms/internal/ads/zzyy;->zza:I

    .line 205
    .line 206
    goto :goto_a

    .line 207
    :cond_9
    move-object/from16 v7, p0

    .line 208
    .line 209
    move-object v6, v7

    .line 210
    :goto_a
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzis;->zze()Z

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-eqz v3, :cond_c

    .line 215
    .line 216
    const/4 v3, 0x4

    .line 217
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 218
    .line 219
    .line 220
    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/zzyy;->zzb:J

    .line 221
    .line 222
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    invoke-static {v6, v4, v5, v7, v3}, Lcom/google/android/gms/internal/ads/zzyx;->zzm(Lcom/google/android/gms/internal/ads/zzyw;J[BI)Lcom/google/android/gms/internal/ads/zzyw;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/zzyy;->zzb:J

    .line 235
    .line 236
    const-wide/16 v6, 0x4

    .line 237
    .line 238
    add-long/2addr v4, v6

    .line 239
    iput-wide v4, v1, Lcom/google/android/gms/internal/ads/zzyy;->zzb:J

    .line 240
    .line 241
    iget v4, v1, Lcom/google/android/gms/internal/ads/zzyy;->zza:I

    .line 242
    .line 243
    add-int/lit8 v4, v4, -0x4

    .line 244
    .line 245
    iput v4, v1, Lcom/google/android/gms/internal/ads/zzyy;->zza:I

    .line 246
    .line 247
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzix;->zzj(I)V

    .line 248
    .line 249
    .line 250
    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/zzyy;->zzb:J

    .line 251
    .line 252
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzix;->zzc:Ljava/nio/ByteBuffer;

    .line 253
    .line 254
    invoke-static {v3, v4, v5, v6, v2}, Lcom/google/android/gms/internal/ads/zzyx;->zzl(Lcom/google/android/gms/internal/ads/zzyw;JLjava/nio/ByteBuffer;I)Lcom/google/android/gms/internal/ads/zzyw;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/zzyy;->zzb:J

    .line 259
    .line 260
    int-to-long v6, v2

    .line 261
    add-long/2addr v4, v6

    .line 262
    iput-wide v4, v1, Lcom/google/android/gms/internal/ads/zzyy;->zzb:J

    .line 263
    .line 264
    iget v4, v1, Lcom/google/android/gms/internal/ads/zzyy;->zza:I

    .line 265
    .line 266
    sub-int/2addr v4, v2

    .line 267
    iput v4, v1, Lcom/google/android/gms/internal/ads/zzyy;->zza:I

    .line 268
    .line 269
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzix;->zze:Ljava/nio/ByteBuffer;

    .line 270
    .line 271
    if-eqz v2, :cond_b

    .line 272
    .line 273
    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    if-ge v2, v4, :cond_a

    .line 278
    .line 279
    goto :goto_b

    .line 280
    :cond_a
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzix;->zze:Ljava/nio/ByteBuffer;

    .line 281
    .line 282
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 283
    .line 284
    .line 285
    goto :goto_c

    .line 286
    :cond_b
    :goto_b
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzix;->zze:Ljava/nio/ByteBuffer;

    .line 291
    .line 292
    :goto_c
    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/zzyy;->zzb:J

    .line 293
    .line 294
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzix;->zze:Ljava/nio/ByteBuffer;

    .line 295
    .line 296
    iget v1, v1, Lcom/google/android/gms/internal/ads/zzyy;->zza:I

    .line 297
    .line 298
    invoke-static {v3, v4, v5, v0, v1}, Lcom/google/android/gms/internal/ads/zzyx;->zzl(Lcom/google/android/gms/internal/ads/zzyw;JLjava/nio/ByteBuffer;I)Lcom/google/android/gms/internal/ads/zzyw;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    return-object v0

    .line 303
    :cond_c
    iget v2, v1, Lcom/google/android/gms/internal/ads/zzyy;->zza:I

    .line 304
    .line 305
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzix;->zzj(I)V

    .line 306
    .line 307
    .line 308
    iget-wide v2, v1, Lcom/google/android/gms/internal/ads/zzyy;->zzb:J

    .line 309
    .line 310
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzix;->zzc:Ljava/nio/ByteBuffer;

    .line 311
    .line 312
    iget v1, v1, Lcom/google/android/gms/internal/ads/zzyy;->zza:I

    .line 313
    .line 314
    invoke-static {v6, v2, v3, v0, v1}, Lcom/google/android/gms/internal/ads/zzyx;->zzl(Lcom/google/android/gms/internal/ads/zzyw;JLjava/nio/ByteBuffer;I)Lcom/google/android/gms/internal/ads/zzyw;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    return-object v0
.end method

.method private static zzl(Lcom/google/android/gms/internal/ads/zzyw;JLjava/nio/ByteBuffer;I)Lcom/google/android/gms/internal/ads/zzyw;
    .locals 3

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzyx;->zzn(Lcom/google/android/gms/internal/ads/zzyw;J)Lcom/google/android/gms/internal/ads/zzyw;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_0
    :goto_0
    if-lez p4, :cond_1

    .line 6
    .line 7
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzyw;->zzb:J

    .line 8
    .line 9
    sub-long/2addr v0, p1

    .line 10
    long-to-int v0, v0

    .line 11
    invoke-static {p4, v0}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzyw;->zzc:Lcom/google/android/gms/internal/ads/zzabk;

    .line 16
    .line 17
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzabk;->zza:[B

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzyw;->zzb(J)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {p3, v1, v2, v0}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    sub-int/2addr p4, v0

    .line 27
    int-to-long v0, v0

    .line 28
    add-long/2addr p1, v0

    .line 29
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzyw;->zzb:J

    .line 30
    .line 31
    cmp-long v0, p1, v0

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzyw;->zzd:Lcom/google/android/gms/internal/ads/zzyw;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return-object p0
.end method

.method private static zzm(Lcom/google/android/gms/internal/ads/zzyw;J[BI)Lcom/google/android/gms/internal/ads/zzyw;
    .locals 5

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzyx;->zzn(Lcom/google/android/gms/internal/ads/zzyw;J)Lcom/google/android/gms/internal/ads/zzyw;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    move v0, p4

    .line 6
    :cond_0
    :goto_0
    if-lez v0, :cond_1

    .line 7
    .line 8
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzyw;->zzb:J

    .line 9
    .line 10
    sub-long/2addr v1, p1

    .line 11
    long-to-int v1, v1

    .line 12
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzyw;->zzc:Lcom/google/android/gms/internal/ads/zzabk;

    .line 17
    .line 18
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzabk;->zza:[B

    .line 19
    .line 20
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzyw;->zzb(J)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    sub-int v4, p4, v0

    .line 25
    .line 26
    invoke-static {v2, v3, p3, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 27
    .line 28
    .line 29
    sub-int/2addr v0, v1

    .line 30
    int-to-long v1, v1

    .line 31
    add-long/2addr p1, v1

    .line 32
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzyw;->zzb:J

    .line 33
    .line 34
    cmp-long v1, p1, v1

    .line 35
    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzyw;->zzd:Lcom/google/android/gms/internal/ads/zzyw;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-object p0
.end method

.method private static zzn(Lcom/google/android/gms/internal/ads/zzyw;J)Lcom/google/android/gms/internal/ads/zzyw;
    .locals 2

    .line 1
    :goto_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzyw;->zzb:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzyw;->zzd:Lcom/google/android/gms/internal/ads/zzyw;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-object p0
.end method


# virtual methods
.method public final zza()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzc:Lcom/google/android/gms/internal/ads/zzyw;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzyw;->zzc:Lcom/google/android/gms/internal/ads/zzabk;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzyx;->zza:Lcom/google/android/gms/internal/ads/zzabm;

    .line 8
    .line 9
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzabm;->zzc(Lcom/google/android/gms/internal/ads/zzabl;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzyw;->zzc()Lcom/google/android/gms/internal/ads/zzyw;

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzc:Lcom/google/android/gms/internal/ads/zzyw;

    .line 16
    .line 17
    const/high16 v1, 0x10000

    .line 18
    .line 19
    const-wide/16 v2, 0x0

    .line 20
    .line 21
    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/internal/ads/zzyw;->zza(JI)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzc:Lcom/google/android/gms/internal/ads/zzyw;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzd:Lcom/google/android/gms/internal/ads/zzyw;

    .line 27
    .line 28
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzyx;->zze:Lcom/google/android/gms/internal/ads/zzyw;

    .line 29
    .line 30
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzf:J

    .line 31
    .line 32
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyx;->zza:Lcom/google/android/gms/internal/ads/zzabm;

    .line 33
    .line 34
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzabm;->zzd()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final zzb()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzc:Lcom/google/android/gms/internal/ads/zzyw;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzd:Lcom/google/android/gms/internal/ads/zzyw;

    return-void
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzix;Lcom/google/android/gms/internal/ads/zzyy;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzb:Lcom/google/android/gms/internal/ads/zzeu;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzd:Lcom/google/android/gms/internal/ads/zzyw;

    .line 4
    .line 5
    invoke-static {v1, p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzyx;->zzk(Lcom/google/android/gms/internal/ads/zzyw;Lcom/google/android/gms/internal/ads/zzix;Lcom/google/android/gms/internal/ads/zzyy;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzyw;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzd:Lcom/google/android/gms/internal/ads/zzyw;

    .line 10
    .line 11
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzix;Lcom/google/android/gms/internal/ads/zzyy;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzb:Lcom/google/android/gms/internal/ads/zzeu;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzd:Lcom/google/android/gms/internal/ads/zzyw;

    .line 4
    .line 5
    invoke-static {v1, p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzyx;->zzk(Lcom/google/android/gms/internal/ads/zzyw;Lcom/google/android/gms/internal/ads/zzix;Lcom/google/android/gms/internal/ads/zzyy;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzyw;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final zze(J)V
    .locals 3

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzc:Lcom/google/android/gms/internal/ads/zzyw;

    .line 8
    .line 9
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzyw;->zzb:J

    .line 10
    .line 11
    cmp-long v1, p1, v1

    .line 12
    .line 13
    if-ltz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzyx;->zza:Lcom/google/android/gms/internal/ads/zzabm;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzyw;->zzc:Lcom/google/android/gms/internal/ads/zzabk;

    .line 18
    .line 19
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzabm;->zzb(Lcom/google/android/gms/internal/ads/zzabk;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzc:Lcom/google/android/gms/internal/ads/zzyw;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzyw;->zzc()Lcom/google/android/gms/internal/ads/zzyw;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzc:Lcom/google/android/gms/internal/ads/zzyw;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzd:Lcom/google/android/gms/internal/ads/zzyw;

    .line 32
    .line 33
    iget-wide p1, p1, Lcom/google/android/gms/internal/ads/zzyw;->zza:J

    .line 34
    .line 35
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzyw;->zza:J

    .line 36
    .line 37
    cmp-long p1, p1, v1

    .line 38
    .line 39
    if-gez p1, :cond_1

    .line 40
    .line 41
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzd:Lcom/google/android/gms/internal/ads/zzyw;

    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public final zzf()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzf:J

    return-wide v0
.end method

.method public final zzg(Lcom/google/android/gms/internal/ads/zzj;IZ)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzyx;->zzi(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyx;->zze:Lcom/google/android/gms/internal/ads/zzyw;

    .line 6
    .line 7
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzyw;->zzc:Lcom/google/android/gms/internal/ads/zzabk;

    .line 8
    .line 9
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzabk;->zza:[B

    .line 10
    .line 11
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzf:J

    .line 12
    .line 13
    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzyw;->zzb(J)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-interface {p1, v1, v0, p2}, Lcom/google/android/gms/internal/ads/zzj;->zza([BII)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/4 p2, -0x1

    .line 22
    if-ne p1, p2, :cond_1

    .line 23
    .line 24
    if-eqz p3, :cond_0

    .line 25
    .line 26
    return p2

    .line 27
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzyx;->zzj(I)V

    .line 34
    .line 35
    .line 36
    return p1
.end method

.method public final zzh(Lcom/google/android/gms/internal/ads/zzeu;I)V
    .locals 5

    .line 1
    :goto_0
    if-lez p2, :cond_0

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzyx;->zzi(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzyx;->zze:Lcom/google/android/gms/internal/ads/zzyw;

    .line 8
    .line 9
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzyw;->zzc:Lcom/google/android/gms/internal/ads/zzabk;

    .line 10
    .line 11
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzabk;->zza:[B

    .line 12
    .line 13
    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzyx;->zzf:J

    .line 14
    .line 15
    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzyw;->zzb(J)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p1, v2, v1, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    .line 20
    .line 21
    .line 22
    sub-int/2addr p2, v0

    .line 23
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzyx;->zzj(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method
