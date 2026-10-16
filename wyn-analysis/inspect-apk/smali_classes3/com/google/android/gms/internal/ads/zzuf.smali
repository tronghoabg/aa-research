.class public final Lcom/google/android/gms/internal/ads/zzuf;
.super Lcom/google/android/gms/internal/ads/zzcq;
.source "SourceFile"


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

.method private static zzq(ILjava/nio/ByteBuffer;)V
    .locals 4

    .line 1
    int-to-double v0, p0

    .line 2
    const-wide v2, 0x3e00000000200000L    # 4.656612875245797E-10

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    mul-double/2addr v0, v2

    .line 8
    double-to-float p0, v0

    .line 9
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {p0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    :goto_0
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final zzd(Ljava/nio/ByteBuffer;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int v2, v1, v0

    .line 10
    .line 11
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcq;->zzb:Lcom/google/android/gms/internal/ads/zzcl;

    .line 12
    .line 13
    iget v3, v3, Lcom/google/android/gms/internal/ads/zzcl;->zzd:I

    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    if-eq v3, v4, :cond_9

    .line 17
    .line 18
    const/4 v5, 0x3

    .line 19
    if-eq v3, v5, :cond_8

    .line 20
    .line 21
    const/16 v6, 0x15

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    if-eq v3, v6, :cond_7

    .line 25
    .line 26
    const/16 v6, 0x16

    .line 27
    .line 28
    if-eq v3, v6, :cond_6

    .line 29
    .line 30
    const/high16 v6, 0x10000000

    .line 31
    .line 32
    if-eq v3, v6, :cond_5

    .line 33
    .line 34
    const/high16 v6, 0x50000000

    .line 35
    .line 36
    if-eq v3, v6, :cond_4

    .line 37
    .line 38
    const/high16 v5, 0x60000000

    .line 39
    .line 40
    if-eq v3, v5, :cond_3

    .line 41
    .line 42
    const/high16 v5, 0x70000000

    .line 43
    .line 44
    if-eq v3, v5, :cond_2

    .line 45
    .line 46
    const/high16 v5, 0x71000000

    .line 47
    .line 48
    if-eq v3, v5, :cond_1

    .line 49
    .line 50
    const/high16 v5, 0x72000000

    .line 51
    .line 52
    if-ne v3, v5, :cond_0

    .line 53
    .line 54
    div-int/2addr v2, v4

    .line 55
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzcq;->zzk(I)Ljava/nio/ByteBuffer;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    :goto_0
    if-ge v0, v1, :cond_a

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getLong(I)J

    .line 62
    .line 63
    .line 64
    move-result-wide v3

    .line 65
    invoke-static {v3, v4}, Ljava/lang/Long;->reverseBytes(J)J

    .line 66
    .line 67
    .line 68
    move-result-wide v3

    .line 69
    invoke-static {v3, v4}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 70
    .line 71
    .line 72
    move-result-wide v3

    .line 73
    double-to-float v3, v3

    .line 74
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 75
    .line 76
    .line 77
    add-int/lit8 v0, v0, 0x8

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :cond_1
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzcq;->zzk(I)Ljava/nio/ByteBuffer;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    :goto_1
    if-ge v0, v1, :cond_a

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    invoke-static {v3}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 105
    .line 106
    .line 107
    add-int/lit8 v0, v0, 0x4

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_2
    div-int/2addr v2, v4

    .line 111
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzcq;->zzk(I)Ljava/nio/ByteBuffer;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    :goto_2
    if-ge v0, v1, :cond_a

    .line 116
    .line 117
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getDouble(I)D

    .line 118
    .line 119
    .line 120
    move-result-wide v3

    .line 121
    double-to-float v3, v3

    .line 122
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 123
    .line 124
    .line 125
    add-int/lit8 v0, v0, 0x8

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_3
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzcq;->zzk(I)Ljava/nio/ByteBuffer;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    :goto_3
    if-ge v0, v1, :cond_a

    .line 133
    .line 134
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    invoke-static {v3}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/zzuf;->zzq(ILjava/nio/ByteBuffer;)V

    .line 143
    .line 144
    .line 145
    add-int/lit8 v0, v0, 0x4

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_4
    div-int/2addr v2, v5

    .line 149
    mul-int/lit8 v2, v2, 0x4

    .line 150
    .line 151
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzcq;->zzk(I)Ljava/nio/ByteBuffer;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    :goto_4
    if-ge v0, v1, :cond_a

    .line 156
    .line 157
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    add-int/lit8 v4, v0, 0x1

    .line 162
    .line 163
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    add-int/lit8 v5, v0, 0x2

    .line 168
    .line 169
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    invoke-static {v3, v4, v5, v7}, Lcom/google/android/gms/internal/ads/zzhaq;->zze(BBBB)I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/zzuf;->zzq(ILjava/nio/ByteBuffer;)V

    .line 178
    .line 179
    .line 180
    add-int/lit8 v0, v0, 0x3

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_5
    add-int/2addr v2, v2

    .line 184
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzcq;->zzk(I)Ljava/nio/ByteBuffer;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    :goto_5
    if-ge v0, v1, :cond_a

    .line 189
    .line 190
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    invoke-static {v3}, Ljava/lang/Short;->reverseBytes(S)S

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    shl-int/lit8 v3, v3, 0x10

    .line 199
    .line 200
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/zzuf;->zzq(ILjava/nio/ByteBuffer;)V

    .line 201
    .line 202
    .line 203
    add-int/lit8 v0, v0, 0x2

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_6
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzcq;->zzk(I)Ljava/nio/ByteBuffer;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    :goto_6
    if-ge v0, v1, :cond_a

    .line 211
    .line 212
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/zzuf;->zzq(ILjava/nio/ByteBuffer;)V

    .line 217
    .line 218
    .line 219
    add-int/lit8 v0, v0, 0x4

    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_7
    div-int/2addr v2, v5

    .line 223
    mul-int/lit8 v2, v2, 0x4

    .line 224
    .line 225
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzcq;->zzk(I)Ljava/nio/ByteBuffer;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    :goto_7
    if-ge v0, v1, :cond_a

    .line 230
    .line 231
    add-int/lit8 v3, v0, 0x2

    .line 232
    .line 233
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    add-int/lit8 v4, v0, 0x1

    .line 238
    .line 239
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->get(I)B

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    invoke-static {v3, v4, v5, v7}, Lcom/google/android/gms/internal/ads/zzhaq;->zze(BBBB)I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/zzuf;->zzq(ILjava/nio/ByteBuffer;)V

    .line 252
    .line 253
    .line 254
    add-int/lit8 v0, v0, 0x3

    .line 255
    .line 256
    goto :goto_7

    .line 257
    :cond_8
    mul-int/lit8 v2, v2, 0x4

    .line 258
    .line 259
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzcq;->zzk(I)Ljava/nio/ByteBuffer;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    :goto_8
    if-ge v0, v1, :cond_a

    .line 264
    .line 265
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    and-int/lit16 v3, v3, 0xff

    .line 270
    .line 271
    add-int/lit8 v3, v3, -0x80

    .line 272
    .line 273
    shl-int/lit8 v3, v3, 0x18

    .line 274
    .line 275
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/zzuf;->zzq(ILjava/nio/ByteBuffer;)V

    .line 276
    .line 277
    .line 278
    add-int/lit8 v0, v0, 0x1

    .line 279
    .line 280
    goto :goto_8

    .line 281
    :cond_9
    add-int/2addr v2, v2

    .line 282
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzcq;->zzk(I)Ljava/nio/ByteBuffer;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    :goto_9
    if-ge v0, v1, :cond_a

    .line 287
    .line 288
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    shl-int/lit8 v3, v3, 0x10

    .line 293
    .line 294
    invoke-static {v3, v2}, Lcom/google/android/gms/internal/ads/zzuf;->zzq(ILjava/nio/ByteBuffer;)V

    .line 295
    .line 296
    .line 297
    add-int/lit8 v0, v0, 0x2

    .line 298
    .line 299
    goto :goto_9

    .line 300
    :cond_a
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 308
    .line 309
    .line 310
    return-void
.end method

.method public final zzm(Lcom/google/android/gms/internal/ads/zzcl;)Lcom/google/android/gms/internal/ads/zzcl;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzco;
        }
    .end annotation

    .line 1
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzcl;->zzd:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfm;->zzE(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/internal/ads/zzcl;

    .line 13
    .line 14
    iget v2, p1, Lcom/google/android/gms/internal/ads/zzcl;->zzb:I

    .line 15
    .line 16
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzcl;->zzc:I

    .line 17
    .line 18
    invoke-direct {v0, v2, p1, v1}, Lcom/google/android/gms/internal/ads/zzcl;-><init>(III)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzcl;->zza:Lcom/google/android/gms/internal/ads/zzcl;

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzco;

    .line 26
    .line 27
    const-string v1, "Unhandled input format:"

    .line 28
    .line 29
    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzco;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcl;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method
