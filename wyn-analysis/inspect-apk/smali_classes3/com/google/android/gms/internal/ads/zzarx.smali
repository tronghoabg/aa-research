.class public final Lcom/google/android/gms/internal/ads/zzarx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaga;


# instance fields
.field private zza:Lcom/google/android/gms/internal/ads/zzagd;

.field private zzb:Lcom/google/android/gms/internal/ads/zzahm;

.field private zzc:I

.field private zzd:J

.field private zze:Lcom/google/android/gms/internal/ads/zzaru;

.field private zzf:I

.field private zzg:J


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzarx;->zzc:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzarx;->zzd:J

    const/4 v2, -0x1

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzarx;->zzf:I

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzarx;->zzg:J

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzagb;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzasa;->zza(Lcom/google/android/gms/internal/ads/zzagb;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final synthetic zzb()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/f;->a(Lcom/google/android/gms/internal/ads/zzaga;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzagd;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzarx;->zza:Lcom/google/android/gms/internal/ads/zzagd;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzagd;->zzs(II)Lcom/google/android/gms/internal/ads/zzahm;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzarx;->zzb:Lcom/google/android/gms/internal/ads/zzahm;

    .line 10
    .line 11
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagd;->zzv()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzaha;)I
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzarx;->zzb:Lcom/google/android/gms/internal/ads/zzahm;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v2, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 11
    .line 12
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzarx;->zzc:I

    .line 13
    .line 14
    const/4 v3, -0x1

    .line 15
    const/4 v4, 0x4

    .line 16
    const/4 v5, 0x1

    .line 17
    const/4 v6, 0x0

    .line 18
    if-eqz v2, :cond_e

    .line 19
    .line 20
    const/4 v7, 0x2

    .line 21
    const-wide/16 v8, -0x1

    .line 22
    .line 23
    if-eq v2, v5, :cond_c

    .line 24
    .line 25
    const/4 v10, 0x3

    .line 26
    if-eq v2, v7, :cond_5

    .line 27
    .line 28
    if-eq v2, v10, :cond_2

    .line 29
    .line 30
    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/zzarx;->zzg:J

    .line 31
    .line 32
    cmp-long v2, v10, v8

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v5, v6

    .line 38
    :goto_0
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzgtr;->zzi(Z)V

    .line 39
    .line 40
    .line 41
    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzarx;->zzg:J

    .line 42
    .line 43
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 44
    .line 45
    .line 46
    move-result-wide v7

    .line 47
    sub-long/2addr v4, v7

    .line 48
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzarx;->zze:Lcom/google/android/gms/internal/ads/zzaru;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-interface {v2, v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzaru;->zzc(Lcom/google/android/gms/internal/ads/zzagb;J)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    return v3

    .line 60
    :cond_1
    return v6

    .line 61
    :cond_2
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzasa;->zzc(Lcom/google/android/gms/internal/ads/zzagb;)Landroid/util/Pair;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, Ljava/lang/Long;

    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/Long;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzarx;->zzf:I

    .line 74
    .line 75
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v2, Ljava/lang/Long;

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 80
    .line 81
    .line 82
    move-result-wide v2

    .line 83
    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/zzarx;->zzd:J

    .line 84
    .line 85
    cmp-long v5, v10, v8

    .line 86
    .line 87
    if-eqz v5, :cond_3

    .line 88
    .line 89
    const-wide v12, 0xffffffffL

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    cmp-long v5, v2, v12

    .line 95
    .line 96
    if-nez v5, :cond_3

    .line 97
    .line 98
    move-wide v2, v10

    .line 99
    :cond_3
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzarx;->zzf:I

    .line 100
    .line 101
    int-to-long v10, v5

    .line 102
    add-long/2addr v10, v2

    .line 103
    iput-wide v10, v0, Lcom/google/android/gms/internal/ads/zzarx;->zzg:J

    .line 104
    .line 105
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzo()J

    .line 106
    .line 107
    .line 108
    move-result-wide v1

    .line 109
    cmp-long v3, v1, v8

    .line 110
    .line 111
    if-eqz v3, :cond_4

    .line 112
    .line 113
    cmp-long v3, v10, v1

    .line 114
    .line 115
    if-lez v3, :cond_4

    .line 116
    .line 117
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    add-int/lit8 v3, v3, 0x1d

    .line 130
    .line 131
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    new-instance v7, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    add-int/2addr v3, v5

    .line 138
    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 139
    .line 140
    .line 141
    const-string v3, "Data exceeds input length: "

    .line 142
    .line 143
    const-string v5, ", "

    .line 144
    .line 145
    invoke-static {v7, v3, v10, v11, v5}, LVa/M6;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v7, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    const-string v5, "WavExtractor"

    .line 156
    .line 157
    invoke-static {v5, v3}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzarx;->zzg:J

    .line 161
    .line 162
    move-wide v10, v1

    .line 163
    :cond_4
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzarx;->zze:Lcom/google/android/gms/internal/ads/zzaru;

    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzarx;->zzf:I

    .line 169
    .line 170
    invoke-interface {v1, v2, v10, v11}, Lcom/google/android/gms/internal/ads/zzaru;->zzb(IJ)V

    .line 171
    .line 172
    .line 173
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzarx;->zzc:I

    .line 174
    .line 175
    return v6

    .line 176
    :cond_5
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzasa;->zzb(Lcom/google/android/gms/internal/ads/zzagb;)Lcom/google/android/gms/internal/ads/zzary;

    .line 177
    .line 178
    .line 179
    move-result-object v15

    .line 180
    iget v1, v15, Lcom/google/android/gms/internal/ads/zzary;->zza:I

    .line 181
    .line 182
    const/16 v2, 0x11

    .line 183
    .line 184
    if-ne v1, v2, :cond_6

    .line 185
    .line 186
    new-instance v1, Lcom/google/android/gms/internal/ads/zzart;

    .line 187
    .line 188
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzarx;->zza:Lcom/google/android/gms/internal/ads/zzagd;

    .line 189
    .line 190
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzarx;->zzb:Lcom/google/android/gms/internal/ads/zzahm;

    .line 191
    .line 192
    invoke-direct {v1, v2, v3, v15}, Lcom/google/android/gms/internal/ads/zzart;-><init>(Lcom/google/android/gms/internal/ads/zzagd;Lcom/google/android/gms/internal/ads/zzahm;Lcom/google/android/gms/internal/ads/zzary;)V

    .line 193
    .line 194
    .line 195
    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzarx;->zze:Lcom/google/android/gms/internal/ads/zzaru;

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_6
    const/4 v2, 0x6

    .line 199
    if-ne v1, v2, :cond_7

    .line 200
    .line 201
    new-instance v12, Lcom/google/android/gms/internal/ads/zzarv;

    .line 202
    .line 203
    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzarx;->zza:Lcom/google/android/gms/internal/ads/zzagd;

    .line 204
    .line 205
    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzarx;->zzb:Lcom/google/android/gms/internal/ads/zzahm;

    .line 206
    .line 207
    const-string v16, "audio/g711-alaw"

    .line 208
    .line 209
    const/16 v17, -0x1

    .line 210
    .line 211
    invoke-direct/range {v12 .. v17}, Lcom/google/android/gms/internal/ads/zzarv;-><init>(Lcom/google/android/gms/internal/ads/zzagd;Lcom/google/android/gms/internal/ads/zzahm;Lcom/google/android/gms/internal/ads/zzary;Ljava/lang/String;I)V

    .line 212
    .line 213
    .line 214
    iput-object v12, v0, Lcom/google/android/gms/internal/ads/zzarx;->zze:Lcom/google/android/gms/internal/ads/zzaru;

    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_7
    const/4 v2, 0x7

    .line 218
    if-ne v1, v2, :cond_8

    .line 219
    .line 220
    new-instance v12, Lcom/google/android/gms/internal/ads/zzarv;

    .line 221
    .line 222
    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzarx;->zza:Lcom/google/android/gms/internal/ads/zzagd;

    .line 223
    .line 224
    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzarx;->zzb:Lcom/google/android/gms/internal/ads/zzahm;

    .line 225
    .line 226
    const-string v16, "audio/g711-mlaw"

    .line 227
    .line 228
    const/16 v17, -0x1

    .line 229
    .line 230
    invoke-direct/range {v12 .. v17}, Lcom/google/android/gms/internal/ads/zzarv;-><init>(Lcom/google/android/gms/internal/ads/zzagd;Lcom/google/android/gms/internal/ads/zzahm;Lcom/google/android/gms/internal/ads/zzary;Ljava/lang/String;I)V

    .line 231
    .line 232
    .line 233
    iput-object v12, v0, Lcom/google/android/gms/internal/ads/zzarx;->zze:Lcom/google/android/gms/internal/ads/zzaru;

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_8
    iget v2, v15, Lcom/google/android/gms/internal/ads/zzary;->zze:I

    .line 237
    .line 238
    if-eq v1, v5, :cond_a

    .line 239
    .line 240
    if-eq v1, v10, :cond_9

    .line 241
    .line 242
    const v3, 0xfffe

    .line 243
    .line 244
    .line 245
    if-eq v1, v3, :cond_a

    .line 246
    .line 247
    move/from16 v17, v6

    .line 248
    .line 249
    goto :goto_2

    .line 250
    :cond_9
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 251
    .line 252
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzfm;->zzD(ILjava/nio/ByteOrder;)I

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    :goto_1
    move/from16 v17, v2

    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_a
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 260
    .line 261
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzfm;->zzC(ILjava/nio/ByteOrder;)I

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    goto :goto_1

    .line 266
    :goto_2
    if-eqz v17, :cond_b

    .line 267
    .line 268
    new-instance v12, Lcom/google/android/gms/internal/ads/zzarv;

    .line 269
    .line 270
    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzarx;->zza:Lcom/google/android/gms/internal/ads/zzagd;

    .line 271
    .line 272
    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzarx;->zzb:Lcom/google/android/gms/internal/ads/zzahm;

    .line 273
    .line 274
    const-string v16, "audio/raw"

    .line 275
    .line 276
    invoke-direct/range {v12 .. v17}, Lcom/google/android/gms/internal/ads/zzarv;-><init>(Lcom/google/android/gms/internal/ads/zzagd;Lcom/google/android/gms/internal/ads/zzahm;Lcom/google/android/gms/internal/ads/zzary;Ljava/lang/String;I)V

    .line 277
    .line 278
    .line 279
    iput-object v12, v0, Lcom/google/android/gms/internal/ads/zzarx;->zze:Lcom/google/android/gms/internal/ads/zzaru;

    .line 280
    .line 281
    :goto_3
    iput v10, v0, Lcom/google/android/gms/internal/ads/zzarx;->zzc:I

    .line 282
    .line 283
    return v6

    .line 284
    :cond_b
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    new-instance v3, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    add-int/lit8 v2, v2, 0x1d

    .line 295
    .line 296
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 297
    .line 298
    .line 299
    const-string v2, "Unsupported WAV format type: "

    .line 300
    .line 301
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    throw v1

    .line 316
    :cond_c
    new-instance v2, Lcom/google/android/gms/internal/ads/zzeu;

    .line 317
    .line 318
    const/16 v3, 0x8

    .line 319
    .line 320
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 321
    .line 322
    .line 323
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzarz;->zza(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzarz;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    iget v5, v4, Lcom/google/android/gms/internal/ads/zzarz;->zza:I

    .line 328
    .line 329
    const v10, 0x64733634

    .line 330
    .line 331
    .line 332
    if-eq v5, v10, :cond_d

    .line 333
    .line 334
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzl()V

    .line 335
    .line 336
    .line 337
    goto :goto_4

    .line 338
    :cond_d
    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/zzagb;->zzk(I)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 345
    .line 346
    .line 347
    move-result-object v5

    .line 348
    invoke-interface {v1, v5, v6, v3}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzE()J

    .line 352
    .line 353
    .line 354
    move-result-wide v8

    .line 355
    iget-wide v4, v4, Lcom/google/android/gms/internal/ads/zzarz;->zzb:J

    .line 356
    .line 357
    long-to-int v2, v4

    .line 358
    add-int/2addr v2, v3

    .line 359
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 360
    .line 361
    .line 362
    :goto_4
    iput-wide v8, v0, Lcom/google/android/gms/internal/ads/zzarx;->zzd:J

    .line 363
    .line 364
    iput v7, v0, Lcom/google/android/gms/internal/ads/zzarx;->zzc:I

    .line 365
    .line 366
    return v6

    .line 367
    :cond_e
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 368
    .line 369
    .line 370
    move-result-wide v7

    .line 371
    const-wide/16 v9, 0x0

    .line 372
    .line 373
    cmp-long v2, v7, v9

    .line 374
    .line 375
    if-nez v2, :cond_f

    .line 376
    .line 377
    move v2, v5

    .line 378
    goto :goto_5

    .line 379
    :cond_f
    move v2, v6

    .line 380
    :goto_5
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzgtr;->zzi(Z)V

    .line 381
    .line 382
    .line 383
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzarx;->zzf:I

    .line 384
    .line 385
    if-eq v2, v3, :cond_10

    .line 386
    .line 387
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 388
    .line 389
    .line 390
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzarx;->zzc:I

    .line 391
    .line 392
    return v6

    .line 393
    :cond_10
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzasa;->zza(Lcom/google/android/gms/internal/ads/zzagb;)Z

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    if-eqz v2, :cond_11

    .line 398
    .line 399
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzm()J

    .line 400
    .line 401
    .line 402
    move-result-wide v2

    .line 403
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 404
    .line 405
    .line 406
    move-result-wide v7

    .line 407
    sub-long/2addr v2, v7

    .line 408
    long-to-int v2, v2

    .line 409
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 410
    .line 411
    .line 412
    iput v5, v0, Lcom/google/android/gms/internal/ads/zzarx;->zzc:I

    .line 413
    .line 414
    return v6

    .line 415
    :cond_11
    const-string v1, "Unsupported or unrecognized wav file type."

    .line 416
    .line 417
    const/4 v2, 0x0

    .line 418
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    throw v1
.end method

.method public final zze(JJ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p1, 0x4

    .line 10
    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzarx;->zzc:I

    .line 11
    .line 12
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzarx;->zze:Lcom/google/android/gms/internal/ads/zzaru;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-interface {p1, p3, p4}, Lcom/google/android/gms/internal/ads/zzaru;->zza(J)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final zzf()V
    .locals 0

    return-void
.end method

.method public final synthetic zzg()Lcom/google/android/gms/internal/ads/zzaga;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/f;->b(Lcom/google/android/gms/internal/ads/zzaga;)Lcom/google/android/gms/internal/ads/zzaga;

    move-result-object v0

    return-object v0
.end method
