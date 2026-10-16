.class public final Lcom/google/android/gms/internal/ads/zztj;
.super Lcom/google/android/gms/internal/ads/zzcq;
.source "SourceFile"


# instance fields
.field private zzd:Lcom/google/android/gms/internal/ads/zzham;

.field private zze:Lcom/google/android/gms/internal/ads/zzham;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzcq;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final zzd(Ljava/nio/ByteBuffer;)V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztj;->zze:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    sub-int v3, v2, v1

    .line 15
    .line 16
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzcq;->zzb:Lcom/google/android/gms/internal/ads/zzcl;

    .line 17
    .line 18
    iget v4, v4, Lcom/google/android/gms/internal/ads/zzcl;->zze:I

    .line 19
    .line 20
    div-int/2addr v3, v4

    .line 21
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzcq;->zzc:Lcom/google/android/gms/internal/ads/zzcl;

    .line 22
    .line 23
    iget v4, v4, Lcom/google/android/gms/internal/ads/zzcl;->zze:I

    .line 24
    .line 25
    mul-int/2addr v3, v4

    .line 26
    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/ads/zzcq;->zzk(I)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    :goto_0
    if-ge v1, v2, :cond_f

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    move v5, v4

    .line 34
    :goto_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzh()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-ge v5, v6, :cond_e

    .line 39
    .line 40
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/zzham;->zzi(I)I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzcq;->zzb:Lcom/google/android/gms/internal/ads/zzcl;

    .line 45
    .line 46
    iget v7, v7, Lcom/google/android/gms/internal/ads/zzcl;->zzd:I

    .line 47
    .line 48
    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzfm;->zzI(I)I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    mul-int/2addr v7, v6

    .line 53
    add-int/2addr v7, v1

    .line 54
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzcq;->zzb:Lcom/google/android/gms/internal/ads/zzcl;

    .line 55
    .line 56
    iget v6, v6, Lcom/google/android/gms/internal/ads/zzcl;->zzd:I

    .line 57
    .line 58
    const/4 v8, 0x2

    .line 59
    if-eq v6, v8, :cond_d

    .line 60
    .line 61
    const/4 v8, 0x3

    .line 62
    if-eq v6, v8, :cond_c

    .line 63
    .line 64
    const/4 v9, 0x4

    .line 65
    if-eq v6, v9, :cond_b

    .line 66
    .line 67
    const/16 v9, 0x15

    .line 68
    .line 69
    if-eq v6, v9, :cond_3

    .line 70
    .line 71
    const/16 v10, 0x16

    .line 72
    .line 73
    if-eq v6, v10, :cond_2

    .line 74
    .line 75
    const/high16 v10, 0x10000000

    .line 76
    .line 77
    if-eq v6, v10, :cond_d

    .line 78
    .line 79
    const/high16 v10, 0x50000000

    .line 80
    .line 81
    if-eq v6, v10, :cond_3

    .line 82
    .line 83
    const/high16 v8, 0x60000000

    .line 84
    .line 85
    if-eq v6, v8, :cond_2

    .line 86
    .line 87
    const/high16 v8, 0x70000000

    .line 88
    .line 89
    if-eq v6, v8, :cond_1

    .line 90
    .line 91
    const/high16 v8, 0x71000000

    .line 92
    .line 93
    if-eq v6, v8, :cond_b

    .line 94
    .line 95
    const/high16 v8, 0x72000000

    .line 96
    .line 97
    if-ne v6, v8, :cond_0

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 101
    .line 102
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    new-instance v1, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    add-int/2addr v0, v9

    .line 113
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 114
    .line 115
    .line 116
    const-string v0, "Unexpected encoding: "

    .line 117
    .line 118
    invoke-static {v6, v0, v1}, LN0/a;->d(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p1

    .line 126
    :cond_1
    :goto_2
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->getDouble(I)D

    .line 127
    .line 128
    .line 129
    move-result-wide v6

    .line 130
    invoke-virtual {v3, v6, v7}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 131
    .line 132
    .line 133
    goto/16 :goto_a

    .line 134
    .line 135
    :cond_2
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 140
    .line 141
    .line 142
    goto/16 :goto_a

    .line 143
    .line 144
    :cond_3
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    sget-object v9, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 149
    .line 150
    if-ne v6, v9, :cond_4

    .line 151
    .line 152
    move v6, v7

    .line 153
    goto :goto_3

    .line 154
    :cond_4
    add-int/lit8 v6, v7, 0x2

    .line 155
    .line 156
    :goto_3
    invoke-virtual {p1, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    add-int/lit8 v10, v7, 0x1

    .line 161
    .line 162
    invoke-virtual {p1, v10}, Ljava/nio/ByteBuffer;->get(I)B

    .line 163
    .line 164
    .line 165
    move-result v10

    .line 166
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    if-ne v11, v9, :cond_5

    .line 171
    .line 172
    add-int/lit8 v7, v7, 0x2

    .line 173
    .line 174
    :cond_5
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    shl-int/lit8 v6, v6, 0x18

    .line 179
    .line 180
    shl-int/lit8 v10, v10, 0x10

    .line 181
    .line 182
    shl-int/lit8 v7, v7, 0x8

    .line 183
    .line 184
    const/high16 v11, -0x1000000

    .line 185
    .line 186
    and-int/2addr v6, v11

    .line 187
    const/high16 v12, 0xff0000

    .line 188
    .line 189
    and-int/2addr v10, v12

    .line 190
    or-int/2addr v6, v10

    .line 191
    const v10, 0xff00

    .line 192
    .line 193
    .line 194
    and-int/2addr v7, v10

    .line 195
    or-int/2addr v6, v7

    .line 196
    shr-int/lit8 v7, v6, 0x8

    .line 197
    .line 198
    and-int v10, v7, v11

    .line 199
    .line 200
    const/4 v11, 0x1

    .line 201
    if-eqz v10, :cond_6

    .line 202
    .line 203
    const/high16 v10, -0x800000    # Float.NEGATIVE_INFINITY

    .line 204
    .line 205
    and-int v12, v7, v10

    .line 206
    .line 207
    if-ne v12, v10, :cond_7

    .line 208
    .line 209
    :cond_6
    move v10, v11

    .line 210
    goto :goto_4

    .line 211
    :cond_7
    move v10, v4

    .line 212
    :goto_4
    invoke-static {v7}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v12

    .line 216
    const-string v13, "Value out of range of 24-bit integer: %s"

    .line 217
    .line 218
    invoke-static {v10, v13, v12}, Lcom/google/android/gms/internal/ads/zzgtr;->zzf(ZLjava/lang/String;Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    if-lt v10, v8, :cond_8

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_8
    move v11, v4

    .line 229
    :goto_5
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzgtr;->zza(Z)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    if-ne v8, v9, :cond_9

    .line 237
    .line 238
    shr-int/lit8 v8, v6, 0x18

    .line 239
    .line 240
    and-int/lit16 v8, v8, 0xff

    .line 241
    .line 242
    :goto_6
    int-to-byte v8, v8

    .line 243
    goto :goto_7

    .line 244
    :cond_9
    and-int/lit16 v8, v7, 0xff

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :goto_7
    shr-int/lit8 v10, v6, 0x10

    .line 248
    .line 249
    and-int/lit16 v10, v10, 0xff

    .line 250
    .line 251
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 252
    .line 253
    .line 254
    move-result-object v11

    .line 255
    if-ne v11, v9, :cond_a

    .line 256
    .line 257
    and-int/lit16 v6, v7, 0xff

    .line 258
    .line 259
    :goto_8
    int-to-byte v6, v6

    .line 260
    goto :goto_9

    .line 261
    :cond_a
    shr-int/lit8 v6, v6, 0x18

    .line 262
    .line 263
    and-int/lit16 v6, v6, 0xff

    .line 264
    .line 265
    goto :goto_8

    .line 266
    :goto_9
    int-to-byte v7, v10

    .line 267
    invoke-virtual {v3, v8}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    invoke-virtual {v7, v6}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 276
    .line 277
    .line 278
    goto :goto_a

    .line 279
    :cond_b
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->getFloat(I)F

    .line 280
    .line 281
    .line 282
    move-result v6

    .line 283
    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 284
    .line 285
    .line 286
    goto :goto_a

    .line 287
    :cond_c
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 288
    .line 289
    .line 290
    move-result v6

    .line 291
    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 292
    .line 293
    .line 294
    goto :goto_a

    .line 295
    :cond_d
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 296
    .line 297
    .line 298
    move-result v6

    .line 299
    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 300
    .line 301
    .line 302
    :goto_a
    add-int/lit8 v5, v5, 0x1

    .line 303
    .line 304
    goto/16 :goto_1

    .line 305
    .line 306
    :cond_e
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzcq;->zzb:Lcom/google/android/gms/internal/ads/zzcl;

    .line 307
    .line 308
    iget v4, v4, Lcom/google/android/gms/internal/ads/zzcl;->zze:I

    .line 309
    .line 310
    add-int/2addr v1, v4

    .line 311
    goto/16 :goto_0

    .line 312
    .line 313
    :cond_f
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 317
    .line 318
    .line 319
    return-void
.end method

.method public final zzm(Lcom/google/android/gms/internal/ads/zzcl;)Lcom/google/android/gms/internal/ads/zzcl;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzco;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztj;->zzd:Lcom/google/android/gms/internal/ads/zzham;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lcom/google/android/gms/internal/ads/zzcl;->zza:Lcom/google/android/gms/internal/ads/zzcl;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget v1, p1, Lcom/google/android/gms/internal/ads/zzcl;->zzd:I

    .line 9
    .line 10
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzfm;->zzE(I)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_6

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->zzh()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    iget v3, p1, Lcom/google/android/gms/internal/ads/zzcl;->zzc:I

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x1

    .line 24
    if-eq v3, v2, :cond_1

    .line 25
    .line 26
    move v6, v5

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v6, v4

    .line 29
    :goto_0
    move v7, v4

    .line 30
    :goto_1
    if-ge v7, v2, :cond_4

    .line 31
    .line 32
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/ads/zzham;->zzi(I)I

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    if-ge v8, v3, :cond_3

    .line 37
    .line 38
    if-eq v8, v7, :cond_2

    .line 39
    .line 40
    move v8, v5

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move v8, v4

    .line 43
    :goto_2
    or-int/2addr v6, v8

    .line 44
    add-int/lit8 v7, v7, 0x1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    new-instance v1, Lcom/google/android/gms/internal/ads/zzco;

    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzham;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    new-instance v3, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    add-int/lit8 v2, v2, 0x3b

    .line 60
    .line 61
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 62
    .line 63
    .line 64
    const-string v2, "Channel map ("

    .line 65
    .line 66
    const-string v4, ") trying to access non-existent input channel."

    .line 67
    .line 68
    invoke-static {v3, v2, v0, v4}, LVa/M6;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-direct {v1, v0, p1}, Lcom/google/android/gms/internal/ads/zzco;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcl;)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_4
    if-eqz v6, :cond_5

    .line 77
    .line 78
    new-instance v0, Lcom/google/android/gms/internal/ads/zzcl;

    .line 79
    .line 80
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzcl;->zzb:I

    .line 81
    .line 82
    invoke-direct {v0, p1, v2, v1}, Lcom/google/android/gms/internal/ads/zzcl;-><init>(III)V

    .line 83
    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_5
    sget-object p1, Lcom/google/android/gms/internal/ads/zzcl;->zza:Lcom/google/android/gms/internal/ads/zzcl;

    .line 87
    .line 88
    return-object p1

    .line 89
    :cond_6
    new-instance v0, Lcom/google/android/gms/internal/ads/zzco;

    .line 90
    .line 91
    const-string v1, "Unhandled input format:"

    .line 92
    .line 93
    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzco;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcl;)V

    .line 94
    .line 95
    .line 96
    throw v0
.end method

.method public final zzo(Lcom/google/android/gms/internal/ads/zzcn;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zztj;->zzd:Lcom/google/android/gms/internal/ads/zzham;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztj;->zze:Lcom/google/android/gms/internal/ads/zzham;

    return-void
.end method

.method public final zzp()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztj;->zze:Lcom/google/android/gms/internal/ads/zzham;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztj;->zzd:Lcom/google/android/gms/internal/ads/zzham;

    return-void
.end method

.method public final zzq(Lcom/google/android/gms/internal/ads/zzham;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztj;->zzd:Lcom/google/android/gms/internal/ads/zzham;

    return-void
.end method
