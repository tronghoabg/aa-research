.class final Lcom/google/android/gms/internal/ads/zzake;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:[B

.field private final zzb:Ljava/util/ArrayDeque;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzako;

.field private zzd:Lcom/google/android/gms/internal/ads/zzakf;

.field private zze:I

.field private zzf:I

.field private zzg:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzake;->zza:[B

    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayDeque;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzake;->zzb:Ljava/util/ArrayDeque;

    .line 16
    .line 17
    new-instance v0, Lcom/google/android/gms/internal/ads/zzako;

    .line 18
    .line 19
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzako;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzake;->zzc:Lcom/google/android/gms/internal/ads/zzako;

    .line 23
    .line 24
    return-void
.end method

.method private final zzd(Lcom/google/android/gms/internal/ads/zzagb;I)J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzake;->zza:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {p1, v0, v1, p2}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 5
    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    :goto_0
    if-ge v1, p2, :cond_0

    .line 10
    .line 11
    const/16 p1, 0x8

    .line 12
    .line 13
    shl-long/2addr v2, p1

    .line 14
    aget-byte p1, v0, v1

    .line 15
    .line 16
    and-int/lit16 p1, p1, 0xff

    .line 17
    .line 18
    int-to-long v4, p1

    .line 19
    or-long/2addr v2, v4

    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-wide v2
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzakf;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzake;->zzd:Lcom/google/android/gms/internal/ads/zzakf;

    return-void
.end method

.method public final zzb()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzake;->zze:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzake;->zzb:Ljava/util/ArrayDeque;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzake;->zzc:Lcom/google/android/gms/internal/ads/zzako;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzako;->zza()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzagb;)Z
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzake;->zzd:Lcom/google/android/gms/internal/ads/zzakf;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzake;->zzb:Ljava/util/ArrayDeque;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lcom/google/android/gms/internal/ads/zzakd;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzakd;->zzb()J

    .line 22
    .line 23
    .line 24
    move-result-wide v5

    .line 25
    cmp-long v1, v3, v5

    .line 26
    .line 27
    if-ltz v1, :cond_0

    .line 28
    .line 29
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzake;->zzd:Lcom/google/android/gms/internal/ads/zzakf;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lcom/google/android/gms/internal/ads/zzakd;

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzakd;->zza()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    check-cast p1, Lcom/google/android/gms/internal/ads/zzakh;

    .line 42
    .line 43
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzakh;->zza:Lcom/google/android/gms/internal/ads/zzakm;

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzakm;->zzi(I)V

    .line 46
    .line 47
    .line 48
    return v2

    .line 49
    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzake;->zze:I

    .line 50
    .line 51
    const/4 v3, 0x4

    .line 52
    const/4 v4, 0x0

    .line 53
    if-nez v1, :cond_5

    .line 54
    .line 55
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzake;->zzc:Lcom/google/android/gms/internal/ads/zzako;

    .line 56
    .line 57
    invoke-virtual {v1, p1, v2, v4, v3}, Lcom/google/android/gms/internal/ads/zzako;->zzb(Lcom/google/android/gms/internal/ads/zzagb;ZZI)J

    .line 58
    .line 59
    .line 60
    move-result-wide v5

    .line 61
    const-wide/16 v7, -0x2

    .line 62
    .line 63
    cmp-long v1, v5, v7

    .line 64
    .line 65
    if-nez v1, :cond_3

    .line 66
    .line 67
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzl()V

    .line 68
    .line 69
    .line 70
    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzake;->zza:[B

    .line 71
    .line 72
    invoke-interface {p1, v1, v4, v3}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 73
    .line 74
    .line 75
    aget-byte v5, v1, v4

    .line 76
    .line 77
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzako;->zzd(I)I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    const/4 v6, -0x1

    .line 82
    if-eq v5, v6, :cond_2

    .line 83
    .line 84
    if-gt v5, v3, :cond_2

    .line 85
    .line 86
    invoke-static {v1, v5, v4}, Lcom/google/android/gms/internal/ads/zzako;->zze([BIZ)J

    .line 87
    .line 88
    .line 89
    move-result-wide v6

    .line 90
    long-to-int v1, v6

    .line 91
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzake;->zzd:Lcom/google/android/gms/internal/ads/zzakf;

    .line 92
    .line 93
    check-cast v6, Lcom/google/android/gms/internal/ads/zzakh;

    .line 94
    .line 95
    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzakh;->zza:Lcom/google/android/gms/internal/ads/zzakm;

    .line 96
    .line 97
    const v6, 0x1549a966

    .line 98
    .line 99
    .line 100
    if-eq v1, v6, :cond_1

    .line 101
    .line 102
    const v6, 0x1043a770

    .line 103
    .line 104
    .line 105
    if-eq v1, v6, :cond_1

    .line 106
    .line 107
    const v6, 0x1f43b675

    .line 108
    .line 109
    .line 110
    if-eq v1, v6, :cond_1

    .line 111
    .line 112
    const v6, 0x1c53bb6b

    .line 113
    .line 114
    .line 115
    if-eq v1, v6, :cond_1

    .line 116
    .line 117
    const v6, 0x1654ae6b

    .line 118
    .line 119
    .line 120
    if-ne v1, v6, :cond_2

    .line 121
    .line 122
    move v1, v6

    .line 123
    :cond_1
    invoke-interface {p1, v5}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 124
    .line 125
    .line 126
    int-to-long v5, v1

    .line 127
    goto :goto_2

    .line 128
    :cond_2
    invoke-interface {p1, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    :goto_2
    const-wide/16 v7, -0x1

    .line 133
    .line 134
    cmp-long v1, v5, v7

    .line 135
    .line 136
    if-nez v1, :cond_4

    .line 137
    .line 138
    return v4

    .line 139
    :cond_4
    long-to-int v1, v5

    .line 140
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzake;->zzf:I

    .line 141
    .line 142
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzake;->zze:I

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_5
    if-ne v1, v2, :cond_6

    .line 146
    .line 147
    :goto_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzake;->zzc:Lcom/google/android/gms/internal/ads/zzako;

    .line 148
    .line 149
    const/16 v5, 0x8

    .line 150
    .line 151
    invoke-virtual {v1, p1, v4, v2, v5}, Lcom/google/android/gms/internal/ads/zzako;->zzb(Lcom/google/android/gms/internal/ads/zzagb;ZZI)J

    .line 152
    .line 153
    .line 154
    move-result-wide v5

    .line 155
    iput-wide v5, p0, Lcom/google/android/gms/internal/ads/zzake;->zzg:J

    .line 156
    .line 157
    const/4 v1, 0x2

    .line 158
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzake;->zze:I

    .line 159
    .line 160
    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzake;->zzd:Lcom/google/android/gms/internal/ads/zzakf;

    .line 161
    .line 162
    iget v5, p0, Lcom/google/android/gms/internal/ads/zzake;->zzf:I

    .line 163
    .line 164
    check-cast v1, Lcom/google/android/gms/internal/ads/zzakh;

    .line 165
    .line 166
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzakh;->zza:Lcom/google/android/gms/internal/ads/zzakm;

    .line 167
    .line 168
    const-wide/16 v6, 0x8

    .line 169
    .line 170
    const/4 v8, 0x0

    .line 171
    sparse-switch v5, :sswitch_data_0

    .line 172
    .line 173
    .line 174
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzake;->zzg:J

    .line 175
    .line 176
    long-to-int v0, v0

    .line 177
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 178
    .line 179
    .line 180
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzake;->zze:I

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :sswitch_0
    iget-wide v9, p0, Lcom/google/android/gms/internal/ads/zzake;->zzg:J

    .line 185
    .line 186
    const-wide/16 v11, 0x4

    .line 187
    .line 188
    cmp-long v0, v9, v11

    .line 189
    .line 190
    if-eqz v0, :cond_8

    .line 191
    .line 192
    cmp-long v0, v9, v6

    .line 193
    .line 194
    if-nez v0, :cond_7

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_7
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    new-instance v0, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    add-int/lit8 p1, p1, 0x14

    .line 208
    .line 209
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 210
    .line 211
    .line 212
    const-string p1, "Invalid float size: "

    .line 213
    .line 214
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-static {p1, v8}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    throw p1

    .line 229
    :cond_8
    :goto_4
    long-to-int v0, v9

    .line 230
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzake;->zzd(Lcom/google/android/gms/internal/ads/zzagb;I)J

    .line 231
    .line 232
    .line 233
    move-result-wide v6

    .line 234
    if-ne v0, v3, :cond_9

    .line 235
    .line 236
    long-to-int p1, v6

    .line 237
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    float-to-double v6, p1

    .line 242
    goto :goto_5

    .line 243
    :cond_9
    invoke-static {v6, v7}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 244
    .line 245
    .line 246
    move-result-wide v6

    .line 247
    :goto_5
    invoke-virtual {v1, v5, v6, v7}, Lcom/google/android/gms/internal/ads/zzakm;->zzk(ID)V

    .line 248
    .line 249
    .line 250
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzake;->zze:I

    .line 251
    .line 252
    return v2

    .line 253
    :sswitch_1
    iget-wide v6, p0, Lcom/google/android/gms/internal/ads/zzake;->zzg:J

    .line 254
    .line 255
    long-to-int v0, v6

    .line 256
    invoke-virtual {v1, v5, v0, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzm(IILcom/google/android/gms/internal/ads/zzagb;)V

    .line 257
    .line 258
    .line 259
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzake;->zze:I

    .line 260
    .line 261
    return v2

    .line 262
    :sswitch_2
    iget-wide v6, p0, Lcom/google/android/gms/internal/ads/zzake;->zzg:J

    .line 263
    .line 264
    const-wide/32 v9, 0x7fffffff

    .line 265
    .line 266
    .line 267
    cmp-long v0, v6, v9

    .line 268
    .line 269
    if-gtz v0, :cond_c

    .line 270
    .line 271
    long-to-int v0, v6

    .line 272
    if-nez v0, :cond_a

    .line 273
    .line 274
    const-string p1, ""

    .line 275
    .line 276
    goto :goto_7

    .line 277
    :cond_a
    new-array v3, v0, [B

    .line 278
    .line 279
    invoke-interface {p1, v3, v4, v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 280
    .line 281
    .line 282
    :goto_6
    if-lez v0, :cond_b

    .line 283
    .line 284
    add-int/lit8 p1, v0, -0x1

    .line 285
    .line 286
    aget-byte v6, v3, p1

    .line 287
    .line 288
    if-nez v6, :cond_b

    .line 289
    .line 290
    move v0, p1

    .line 291
    goto :goto_6

    .line 292
    :cond_b
    new-instance p1, Ljava/lang/String;

    .line 293
    .line 294
    invoke-direct {p1, v3, v4, v0}, Ljava/lang/String;-><init>([BII)V

    .line 295
    .line 296
    .line 297
    :goto_7
    invoke-virtual {v1, v5, p1}, Lcom/google/android/gms/internal/ads/zzakm;->zzl(ILjava/lang/String;)V

    .line 298
    .line 299
    .line 300
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzake;->zze:I

    .line 301
    .line 302
    return v2

    .line 303
    :cond_c
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 308
    .line 309
    .line 310
    move-result p1

    .line 311
    new-instance v0, Ljava/lang/StringBuilder;

    .line 312
    .line 313
    add-int/lit8 p1, p1, 0x15

    .line 314
    .line 315
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 316
    .line 317
    .line 318
    const-string p1, "String element size: "

    .line 319
    .line 320
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    invoke-static {p1, v8}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    throw p1

    .line 335
    :sswitch_3
    iget-wide v9, p0, Lcom/google/android/gms/internal/ads/zzake;->zzg:J

    .line 336
    .line 337
    cmp-long v0, v9, v6

    .line 338
    .line 339
    if-gtz v0, :cond_d

    .line 340
    .line 341
    long-to-int v0, v9

    .line 342
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzake;->zzd(Lcom/google/android/gms/internal/ads/zzagb;I)J

    .line 343
    .line 344
    .line 345
    move-result-wide v6

    .line 346
    invoke-virtual {v1, v5, v6, v7}, Lcom/google/android/gms/internal/ads/zzakm;->zzj(IJ)V

    .line 347
    .line 348
    .line 349
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzake;->zze:I

    .line 350
    .line 351
    return v2

    .line 352
    :cond_d
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 357
    .line 358
    .line 359
    move-result p1

    .line 360
    new-instance v0, Ljava/lang/StringBuilder;

    .line 361
    .line 362
    add-int/lit8 p1, p1, 0x16

    .line 363
    .line 364
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 365
    .line 366
    .line 367
    const-string p1, "Invalid integer size: "

    .line 368
    .line 369
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    invoke-static {p1, v8}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 380
    .line 381
    .line 382
    move-result-object p1

    .line 383
    throw p1

    .line 384
    :sswitch_4
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 385
    .line 386
    .line 387
    move-result-wide v6

    .line 388
    iget-wide v9, p0, Lcom/google/android/gms/internal/ads/zzake;->zzg:J

    .line 389
    .line 390
    add-long/2addr v9, v6

    .line 391
    new-instance p1, Lcom/google/android/gms/internal/ads/zzakd;

    .line 392
    .line 393
    invoke-direct {p1, v5, v9, v10, v8}, Lcom/google/android/gms/internal/ads/zzakd;-><init>(IJ[B)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzake;->zzd:Lcom/google/android/gms/internal/ads/zzakf;

    .line 400
    .line 401
    move-wide v7, v6

    .line 402
    iget v6, p0, Lcom/google/android/gms/internal/ads/zzake;->zzf:I

    .line 403
    .line 404
    iget-wide v9, p0, Lcom/google/android/gms/internal/ads/zzake;->zzg:J

    .line 405
    .line 406
    check-cast p1, Lcom/google/android/gms/internal/ads/zzakh;

    .line 407
    .line 408
    iget-object v5, p1, Lcom/google/android/gms/internal/ads/zzakh;->zza:Lcom/google/android/gms/internal/ads/zzakm;

    .line 409
    .line 410
    invoke-virtual/range {v5 .. v10}, Lcom/google/android/gms/internal/ads/zzakm;->zzh(IJJ)V

    .line 411
    .line 412
    .line 413
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzake;->zze:I

    .line 414
    .line 415
    return v2

    .line 416
    nop

    .line 417
    :sswitch_data_0
    .sparse-switch
        0x80 -> :sswitch_4
        0x83 -> :sswitch_3
        0x85 -> :sswitch_2
        0x86 -> :sswitch_2
        0x88 -> :sswitch_3
        0x89 -> :sswitch_3
        0x8f -> :sswitch_4
        0x91 -> :sswitch_3
        0x92 -> :sswitch_3
        0x98 -> :sswitch_3
        0x9b -> :sswitch_3
        0x9f -> :sswitch_3
        0xa0 -> :sswitch_4
        0xa1 -> :sswitch_1
        0xa3 -> :sswitch_1
        0xa5 -> :sswitch_1
        0xa6 -> :sswitch_4
        0xae -> :sswitch_4
        0xb0 -> :sswitch_3
        0xb3 -> :sswitch_3
        0xb5 -> :sswitch_0
        0xb6 -> :sswitch_4
        0xb7 -> :sswitch_4
        0xba -> :sswitch_3
        0xbb -> :sswitch_4
        0xd7 -> :sswitch_3
        0xe0 -> :sswitch_4
        0xe1 -> :sswitch_4
        0xe7 -> :sswitch_3
        0xee -> :sswitch_3
        0xf0 -> :sswitch_3
        0xf1 -> :sswitch_3
        0xf7 -> :sswitch_3
        0xfb -> :sswitch_3
        0x41e4 -> :sswitch_4
        0x41e7 -> :sswitch_3
        0x41ed -> :sswitch_1
        0x4254 -> :sswitch_3
        0x4255 -> :sswitch_1
        0x4282 -> :sswitch_2
        0x4285 -> :sswitch_3
        0x42f7 -> :sswitch_3
        0x437c -> :sswitch_2
        0x4489 -> :sswitch_0
        0x45b9 -> :sswitch_4
        0x47e1 -> :sswitch_3
        0x47e2 -> :sswitch_1
        0x47e7 -> :sswitch_4
        0x47e8 -> :sswitch_3
        0x4dbb -> :sswitch_4
        0x5031 -> :sswitch_3
        0x5032 -> :sswitch_3
        0x5034 -> :sswitch_4
        0x5035 -> :sswitch_4
        0x536e -> :sswitch_2
        0x53ab -> :sswitch_1
        0x53ac -> :sswitch_3
        0x53b8 -> :sswitch_3
        0x54b0 -> :sswitch_3
        0x54b2 -> :sswitch_3
        0x54ba -> :sswitch_3
        0x55aa -> :sswitch_3
        0x55b0 -> :sswitch_4
        0x55b2 -> :sswitch_3
        0x55b9 -> :sswitch_3
        0x55ba -> :sswitch_3
        0x55bb -> :sswitch_3
        0x55bc -> :sswitch_3
        0x55bd -> :sswitch_3
        0x55d0 -> :sswitch_4
        0x55d1 -> :sswitch_0
        0x55d2 -> :sswitch_0
        0x55d3 -> :sswitch_0
        0x55d4 -> :sswitch_0
        0x55d5 -> :sswitch_0
        0x55d6 -> :sswitch_0
        0x55d7 -> :sswitch_0
        0x55d8 -> :sswitch_0
        0x55d9 -> :sswitch_0
        0x55da -> :sswitch_0
        0x55ee -> :sswitch_3
        0x56aa -> :sswitch_3
        0x56bb -> :sswitch_3
        0x6240 -> :sswitch_4
        0x6264 -> :sswitch_3
        0x63a2 -> :sswitch_1
        0x6d80 -> :sswitch_4
        0x73c4 -> :sswitch_3
        0x73c5 -> :sswitch_3
        0x75a1 -> :sswitch_4
        0x75a2 -> :sswitch_3
        0x7670 -> :sswitch_4
        0x7671 -> :sswitch_3
        0x7672 -> :sswitch_1
        0x7673 -> :sswitch_0
        0x7674 -> :sswitch_0
        0x7675 -> :sswitch_0
        0x22b59c -> :sswitch_2
        0x23e383 -> :sswitch_3
        0x2ad7b1 -> :sswitch_3
        0x1043a770 -> :sswitch_4
        0x114d9b74 -> :sswitch_4
        0x1549a966 -> :sswitch_4
        0x1654ae6b -> :sswitch_4
        0x18538067 -> :sswitch_4
        0x1a45dfa3 -> :sswitch_4
        0x1c53bb6b -> :sswitch_4
        0x1f43b675 -> :sswitch_4
    .end sparse-switch
.end method
