.class final Lcom/google/android/gms/internal/ads/zzasa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic zza:I

.field private static final zzb:[B

.field private static final zzc:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xe

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, Lcom/google/android/gms/internal/ads/zzasa;->zzb:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    sput-object v0, Lcom/google/android/gms/internal/ads/zzasa;->zzc:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x10t
        0x0t
        -0x80t
        0x0t
        0x0t
        -0x56t
        0x0t
        0x38t
        -0x65t
        0x71t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x0t
        0x0t
        0x21t
        0x7t
        -0x2dt
        0x11t
        -0x7at
        0x44t
        -0x38t
        -0x3ft
        -0x36t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzagb;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeu;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/zzarz;->zza(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzarz;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget v1, v1, Lcom/google/android/gms/internal/ads/zzarz;->zza:I

    .line 13
    .line 14
    const v2, 0x52494646

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-eq v1, v2, :cond_1

    .line 19
    .line 20
    const v2, 0x52463634

    .line 21
    .line 22
    .line 23
    if-ne v1, v2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return v3

    .line 27
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v2, 0x4

    .line 32
    invoke-interface {p0, v1, v3, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    const v0, 0x57415645

    .line 43
    .line 44
    .line 45
    if-eq p0, v0, :cond_2

    .line 46
    .line 47
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    add-int/lit8 v0, v0, 0x17

    .line 58
    .line 59
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 60
    .line 61
    .line 62
    const-string v0, "Unsupported form type: "

    .line 63
    .line 64
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    const-string v0, "WavHeaderReader"

    .line 75
    .line 76
    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzeh;->zze(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return v3

    .line 80
    :cond_2
    const/4 p0, 0x1

    .line 81
    return p0
.end method

.method public static zzb(Lcom/google/android/gms/internal/ads/zzagb;)Lcom/google/android/gms/internal/ads/zzary;
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeu;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const v2, 0x666d7420

    .line 9
    .line 10
    .line 11
    invoke-static {v2, p0, v0}, Lcom/google/android/gms/internal/ads/zzasa;->zzd(ILcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzarz;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-wide v2, v2, Lcom/google/android/gms/internal/ads/zzarz;->zzb:J

    .line 16
    .line 17
    const-wide/16 v4, 0x10

    .line 18
    .line 19
    cmp-long v4, v2, v4

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    if-ltz v4, :cond_0

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v4, v5

    .line 27
    :goto_0
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzgtr;->zzi(Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-interface {p0, v4, v5, v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzu()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzu()I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzI()I

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzI()I

    .line 53
    .line 54
    .line 55
    move-result v10

    .line 56
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzu()I

    .line 57
    .line 58
    .line 59
    move-result v11

    .line 60
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzu()I

    .line 61
    .line 62
    .line 63
    move-result v12

    .line 64
    long-to-int v0, v2

    .line 65
    add-int/lit8 v0, v0, -0x10

    .line 66
    .line 67
    if-lez v0, :cond_8

    .line 68
    .line 69
    new-array v2, v0, [B

    .line 70
    .line 71
    invoke-interface {p0, v2, v5, v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 72
    .line 73
    .line 74
    const v3, 0xfffe

    .line 75
    .line 76
    .line 77
    if-ne v1, v3, :cond_7

    .line 78
    .line 79
    const/16 v1, 0x18

    .line 80
    .line 81
    if-ne v0, v1, :cond_6

    .line 82
    .line 83
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeu;

    .line 84
    .line 85
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzeu;-><init>([B)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzu()I

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzu()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_2

    .line 96
    .line 97
    if-ne v1, v12, :cond_1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    add-int/lit8 p0, p0, 0x21

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    add-int/2addr v0, p0

    .line 119
    new-instance p0, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    add-int/lit8 v0, v0, 0x13

    .line 122
    .line 123
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 124
    .line 125
    .line 126
    const-string v0, "validBits ( "

    .line 127
    .line 128
    const-string v2, ")  != bitsPerSample( "

    .line 129
    .line 130
    invoke-static {v1, v12, v0, v2, p0}, LN0/a;->l(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 131
    .line 132
    .line 133
    const-string v0, ") are not supported"

    .line 134
    .line 135
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    throw p0

    .line 147
    :cond_2
    :goto_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzI()I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    invoke-static {v1, v8}, Lcom/google/android/gms/internal/ads/zzft;->zza(II)Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-eqz v3, :cond_5

    .line 156
    .line 157
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzu()I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    const/16 v4, 0xe

    .line 162
    .line 163
    new-array v6, v4, [B

    .line 164
    .line 165
    invoke-virtual {v0, v6, v5, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzm([BII)V

    .line 166
    .line 167
    .line 168
    sget-object v0, Lcom/google/android/gms/internal/ads/zzasa;->zzb:[B

    .line 169
    .line 170
    invoke-static {v6, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-nez v0, :cond_4

    .line 175
    .line 176
    sget-object v0, Lcom/google/android/gms/internal/ads/zzasa;->zzc:[B

    .line 177
    .line 178
    invoke-static {v6, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_3

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_3
    const-string p0, "invalid wav format extension guid"

    .line 186
    .line 187
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    throw p0

    .line 192
    :cond_4
    :goto_2
    move v14, v1

    .line 193
    move-object v13, v2

    .line 194
    move v7, v3

    .line 195
    goto :goto_5

    .line 196
    :cond_5
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 201
    .line 202
    .line 203
    move-result p0

    .line 204
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    add-int/lit8 p0, p0, 0x39

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    new-instance v2, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    add-int/2addr p0, v0

    .line 217
    invoke-direct {v2, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 218
    .line 219
    .line 220
    const-string p0, "Channel mask "

    .line 221
    .line 222
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    const-string p0, " is invalid or does not match channel count "

    .line 229
    .line 230
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    throw p0

    .line 245
    :cond_6
    move-object v13, v2

    .line 246
    move v7, v3

    .line 247
    :goto_3
    move v14, v5

    .line 248
    goto :goto_5

    .line 249
    :cond_7
    :goto_4
    move v7, v1

    .line 250
    move-object v13, v2

    .line 251
    goto :goto_3

    .line 252
    :cond_8
    sget-object v2, Lcom/google/android/gms/internal/ads/zzfm;->zzb:[B

    .line 253
    .line 254
    goto :goto_4

    .line 255
    :goto_5
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzagb;->zzm()J

    .line 256
    .line 257
    .line 258
    move-result-wide v0

    .line 259
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 260
    .line 261
    .line 262
    move-result-wide v2

    .line 263
    sub-long/2addr v0, v2

    .line 264
    long-to-int v0, v0

    .line 265
    invoke-interface {p0, v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 266
    .line 267
    .line 268
    new-instance v6, Lcom/google/android/gms/internal/ads/zzary;

    .line 269
    .line 270
    invoke-direct/range {v6 .. v14}, Lcom/google/android/gms/internal/ads/zzary;-><init>(IIIIII[BI)V

    .line 271
    .line 272
    .line 273
    return-object v6
.end method

.method public static zzc(Lcom/google/android/gms/internal/ads/zzagb;)Landroid/util/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzagb;->zzl()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeu;

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const v2, 0x64617461

    .line 12
    .line 13
    .line 14
    invoke-static {v2, p0, v0}, Lcom/google/android/gms/internal/ads/zzasa;->zzd(ILcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzarz;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {p0, v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    iget-wide v0, v0, Lcom/google/android/gms/internal/ads/zzarz;->zzb:J

    .line 30
    .line 31
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {p0, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method private static zzd(ILcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzarz;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzarz;->zza(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzarz;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzarz;->zza:I

    .line 6
    .line 7
    if-eq v1, p0, :cond_2

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    new-instance v3, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    add-int/lit8 v2, v2, 0x1c

    .line 20
    .line 21
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 22
    .line 23
    .line 24
    const-string v2, "Ignoring unknown WAV chunk: "

    .line 25
    .line 26
    const-string v4, "WavHeaderReader"

    .line 27
    .line 28
    invoke-static {v3, v2, v1, v4}, Lcb/a;->v(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzarz;->zzb:J

    .line 32
    .line 33
    const-wide/16 v4, 0x1

    .line 34
    .line 35
    and-long/2addr v4, v2

    .line 36
    const-wide/16 v6, 0x0

    .line 37
    .line 38
    cmp-long v0, v4, v6

    .line 39
    .line 40
    const-wide/16 v4, 0x8

    .line 41
    .line 42
    add-long/2addr v4, v2

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    const-wide/16 v4, 0x9

    .line 46
    .line 47
    add-long/2addr v4, v2

    .line 48
    :cond_0
    const-wide/32 v2, 0x7fffffff

    .line 49
    .line 50
    .line 51
    cmp-long v0, v4, v2

    .line 52
    .line 53
    if-gtz v0, :cond_1

    .line 54
    .line 55
    long-to-int v0, v4

    .line 56
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 57
    .line 58
    .line 59
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzarz;->zza(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzarz;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    new-instance p1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    add-int/lit8 p0, p0, 0x28

    .line 75
    .line 76
    invoke-direct {p1, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 77
    .line 78
    .line 79
    const-string p0, "Chunk is too large (~2GB+) to skip; id: "

    .line 80
    .line 81
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    throw p0

    .line 96
    :cond_2
    return-object v0
.end method
