.class final Lcom/google/android/gms/internal/ads/zzani;
.super Lcom/google/android/gms/internal/ads/zzang;
.source "SourceFile"


# instance fields
.field private zza:Lcom/google/android/gms/internal/ads/zzanh;

.field private zzb:I

.field private zzc:Z

.field private zzd:Lcom/google/android/gms/internal/ads/zzhf;

.field private zze:Lcom/google/android/gms/internal/ads/zzhd;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzang;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final zza(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/zzang;->zza(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzani;->zza:Lcom/google/android/gms/internal/ads/zzanh;

    .line 8
    .line 9
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzani;->zzd:Lcom/google/android/gms/internal/ads/zzhf;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzani;->zze:Lcom/google/android/gms/internal/ads/zzhd;

    .line 12
    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzani;->zzb:I

    .line 15
    .line 16
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzani;->zzc:Z

    .line 17
    .line 18
    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzeu;)J
    .locals 11

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    aget-byte v0, v0, v1

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    and-int/2addr v0, v2

    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    const-wide/16 v0, -0x1

    .line 13
    .line 14
    return-wide v0

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzani;->zza:Lcom/google/android/gms/internal/ads/zzanh;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    aget-byte v3, v3, v1

    .line 25
    .line 26
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzanh;->zza:Lcom/google/android/gms/internal/ads/zzhf;

    .line 27
    .line 28
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzanh;->zzd:[Lcom/google/android/gms/internal/ads/zzhe;

    .line 29
    .line 30
    shr-int/2addr v3, v2

    .line 31
    array-length v5, v0

    .line 32
    add-int/lit8 v5, v5, -0x1

    .line 33
    .line 34
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzhg;->zza(I)I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    const/16 v6, 0x8

    .line 39
    .line 40
    rsub-int/lit8 v5, v5, 0x8

    .line 41
    .line 42
    const/16 v7, 0xff

    .line 43
    .line 44
    ushr-int v5, v7, v5

    .line 45
    .line 46
    and-int/2addr v3, v5

    .line 47
    aget-object v0, v0, v3

    .line 48
    .line 49
    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzhe;->zza:Z

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    iget v0, v4, Lcom/google/android/gms/internal/ads/zzhf;->zzf:I

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iget v0, v4, Lcom/google/android/gms/internal/ads/zzhf;->zze:I

    .line 57
    .line 58
    :goto_0
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzani;->zzb:I

    .line 59
    .line 60
    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzani;->zzc:Z

    .line 61
    .line 62
    if-eqz v4, :cond_2

    .line 63
    .line 64
    add-int/2addr v3, v0

    .line 65
    div-int/lit8 v1, v3, 0x4

    .line 66
    .line 67
    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzj()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    add-int/lit8 v4, v4, 0x4

    .line 76
    .line 77
    if-ge v3, v4, :cond_3

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    add-int/lit8 v4, v4, 0x4

    .line 88
    .line 89
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    array-length v4, v3

    .line 94
    invoke-virtual {p1, v3, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzb([BI)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    add-int/lit8 v3, v3, 0x4

    .line 103
    .line 104
    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzf(I)V

    .line 105
    .line 106
    .line 107
    :goto_1
    int-to-long v3, v1

    .line 108
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    add-int/lit8 v5, v5, -0x4

    .line 117
    .line 118
    const-wide/16 v7, 0xff

    .line 119
    .line 120
    and-long v9, v3, v7

    .line 121
    .line 122
    long-to-int v9, v9

    .line 123
    int-to-byte v9, v9

    .line 124
    aput-byte v9, v1, v5

    .line 125
    .line 126
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    add-int/lit8 v5, v5, -0x3

    .line 131
    .line 132
    ushr-long v9, v3, v6

    .line 133
    .line 134
    and-long/2addr v9, v7

    .line 135
    long-to-int v6, v9

    .line 136
    int-to-byte v6, v6

    .line 137
    aput-byte v6, v1, v5

    .line 138
    .line 139
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    add-int/lit8 v5, v5, -0x2

    .line 144
    .line 145
    const/16 v6, 0x10

    .line 146
    .line 147
    ushr-long v9, v3, v6

    .line 148
    .line 149
    and-long/2addr v9, v7

    .line 150
    long-to-int v6, v9

    .line 151
    int-to-byte v6, v6

    .line 152
    aput-byte v6, v1, v5

    .line 153
    .line 154
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    add-int/lit8 p1, p1, -0x1

    .line 159
    .line 160
    const/16 v5, 0x18

    .line 161
    .line 162
    ushr-long v5, v3, v5

    .line 163
    .line 164
    and-long/2addr v5, v7

    .line 165
    long-to-int v5, v5

    .line 166
    int-to-byte v5, v5

    .line 167
    aput-byte v5, v1, p1

    .line 168
    .line 169
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzani;->zzc:Z

    .line 170
    .line 171
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzani;->zzb:I

    .line 172
    .line 173
    return-wide v3
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzeu;JLcom/google/android/gms/internal/ads/zzane;)Z
    .locals 25
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
    move-object/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzani;->zza:Lcom/google/android/gms/internal/ads/zzanh;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    iget-object v1, v2, Lcom/google/android/gms/internal/ads/zzane;->zza:Lcom/google/android/gms/internal/ads/zzv;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    return v4

    .line 18
    :cond_0
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzani;->zzd:Lcom/google/android/gms/internal/ads/zzhf;

    .line 19
    .line 20
    const/4 v11, 0x1

    .line 21
    if-nez v6, :cond_5

    .line 22
    .line 23
    invoke-static {v11, v1, v4}, Lcom/google/android/gms/internal/ads/zzhg;->zzc(ILcom/google/android/gms/internal/ads/zzeu;Z)Z

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzI()I

    .line 27
    .line 28
    .line 29
    move-result v13

    .line 30
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 31
    .line 32
    .line 33
    move-result v14

    .line 34
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzI()I

    .line 35
    .line 36
    .line 37
    move-result v15

    .line 38
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-gtz v6, :cond_1

    .line 43
    .line 44
    const/16 v16, -0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move/from16 v16, v6

    .line 48
    .line 49
    :goto_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-gtz v6, :cond_2

    .line 54
    .line 55
    const/16 v17, -0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move/from16 v17, v6

    .line 59
    .line 60
    :goto_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-gtz v6, :cond_3

    .line 65
    .line 66
    const/16 v18, -0x1

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    move/from16 v18, v6

    .line 70
    .line 71
    :goto_2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    and-int/lit8 v6, v3, 0xf

    .line 76
    .line 77
    int-to-double v8, v6

    .line 78
    const/16 p2, 0x4

    .line 79
    .line 80
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    .line 81
    .line 82
    invoke-static {v5, v6, v8, v9}, Ljava/lang/Math;->pow(DD)D

    .line 83
    .line 84
    .line 85
    move-result-wide v8

    .line 86
    double-to-int v8, v8

    .line 87
    and-int/lit16 v3, v3, 0xf0

    .line 88
    .line 89
    shr-int/lit8 v3, v3, 0x4

    .line 90
    .line 91
    int-to-double v9, v3

    .line 92
    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->pow(DD)D

    .line 93
    .line 94
    .line 95
    move-result-wide v5

    .line 96
    double-to-int v3, v5

    .line 97
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    and-int/2addr v5, v11

    .line 102
    if-eq v11, v5, :cond_4

    .line 103
    .line 104
    move/from16 v21, v4

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_4
    move/from16 v21, v11

    .line 108
    .line 109
    :goto_3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 118
    .line 119
    .line 120
    move-result-object v22

    .line 121
    new-instance v12, Lcom/google/android/gms/internal/ads/zzhf;

    .line 122
    .line 123
    move/from16 v20, v3

    .line 124
    .line 125
    move/from16 v19, v8

    .line 126
    .line 127
    invoke-direct/range {v12 .. v22}, Lcom/google/android/gms/internal/ads/zzhf;-><init>(IIIIIIIIZ[B)V

    .line 128
    .line 129
    .line 130
    iput-object v12, v0, Lcom/google/android/gms/internal/ads/zzani;->zzd:Lcom/google/android/gms/internal/ads/zzhf;

    .line 131
    .line 132
    :goto_4
    const/4 v7, 0x0

    .line 133
    goto/16 :goto_22

    .line 134
    .line 135
    :cond_5
    const/16 p2, 0x4

    .line 136
    .line 137
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzani;->zze:Lcom/google/android/gms/internal/ads/zzhd;

    .line 138
    .line 139
    if-nez v5, :cond_6

    .line 140
    .line 141
    invoke-static {v1, v11, v11}, Lcom/google/android/gms/internal/ads/zzhg;->zzb(Lcom/google/android/gms/internal/ads/zzeu;ZZ)Lcom/google/android/gms/internal/ads/zzhd;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzani;->zze:Lcom/google/android/gms/internal/ads/zzhd;

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_6
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    new-array v8, v8, [B

    .line 153
    .line 154
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    invoke-static {v9, v4, v8, v4, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 163
    .line 164
    .line 165
    iget v9, v6, Lcom/google/android/gms/internal/ads/zzhf;->zza:I

    .line 166
    .line 167
    const/4 v10, 0x5

    .line 168
    invoke-static {v10, v1, v4}, Lcom/google/android/gms/internal/ads/zzhg;->zzc(ILcom/google/android/gms/internal/ads/zzeu;Z)Z

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 172
    .line 173
    .line 174
    move-result v12

    .line 175
    add-int/2addr v12, v11

    .line 176
    new-instance v13, Lcom/google/android/gms/internal/ads/zzhc;

    .line 177
    .line 178
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 179
    .line 180
    .line 181
    move-result-object v14

    .line 182
    invoke-direct {v13, v14}, Lcom/google/android/gms/internal/ads/zzhc;-><init>([B)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    const/16 v14, 0x8

    .line 190
    .line 191
    mul-int/2addr v1, v14

    .line 192
    invoke-virtual {v13, v1}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 193
    .line 194
    .line 195
    move v1, v4

    .line 196
    :goto_5
    const/16 v15, 0x18

    .line 197
    .line 198
    const/4 v3, 0x2

    .line 199
    const/16 v4, 0x10

    .line 200
    .line 201
    if-ge v1, v12, :cond_11

    .line 202
    .line 203
    invoke-virtual {v13, v15}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 204
    .line 205
    .line 206
    move-result v14

    .line 207
    const v7, 0x564342

    .line 208
    .line 209
    .line 210
    if-ne v14, v7, :cond_10

    .line 211
    .line 212
    invoke-virtual {v13, v4}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    invoke-virtual {v13, v15}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzhc;->zza()Z

    .line 221
    .line 222
    .line 223
    move-result v14

    .line 224
    if-nez v14, :cond_a

    .line 225
    .line 226
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzhc;->zza()Z

    .line 227
    .line 228
    .line 229
    move-result v14

    .line 230
    const/4 v15, 0x0

    .line 231
    :goto_6
    if-ge v15, v7, :cond_9

    .line 232
    .line 233
    if-eqz v14, :cond_7

    .line 234
    .line 235
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzhc;->zza()Z

    .line 236
    .line 237
    .line 238
    move-result v18

    .line 239
    if-eqz v18, :cond_8

    .line 240
    .line 241
    invoke-virtual {v13, v10}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 242
    .line 243
    .line 244
    goto :goto_7

    .line 245
    :cond_7
    invoke-virtual {v13, v10}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 246
    .line 247
    .line 248
    :cond_8
    :goto_7
    add-int/lit8 v15, v15, 0x1

    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_9
    move/from16 v14, p2

    .line 252
    .line 253
    goto :goto_9

    .line 254
    :cond_a
    invoke-virtual {v13, v10}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 255
    .line 256
    .line 257
    const/4 v14, 0x0

    .line 258
    :goto_8
    if-ge v14, v7, :cond_9

    .line 259
    .line 260
    sub-int v15, v7, v14

    .line 261
    .line 262
    invoke-static {v15}, Lcom/google/android/gms/internal/ads/zzhg;->zza(I)I

    .line 263
    .line 264
    .line 265
    move-result v15

    .line 266
    invoke-virtual {v13, v15}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 267
    .line 268
    .line 269
    move-result v15

    .line 270
    add-int/2addr v14, v15

    .line 271
    goto :goto_8

    .line 272
    :goto_9
    invoke-virtual {v13, v14}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 273
    .line 274
    .line 275
    move-result v15

    .line 276
    if-gt v15, v3, :cond_f

    .line 277
    .line 278
    if-eq v15, v11, :cond_c

    .line 279
    .line 280
    if-ne v15, v3, :cond_b

    .line 281
    .line 282
    goto :goto_a

    .line 283
    :cond_b
    move v14, v11

    .line 284
    goto :goto_c

    .line 285
    :cond_c
    move v3, v15

    .line 286
    :goto_a
    const/16 v15, 0x20

    .line 287
    .line 288
    invoke-virtual {v13, v15}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v13, v15}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v13, v14}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 295
    .line 296
    .line 297
    move-result v15

    .line 298
    add-int/2addr v15, v11

    .line 299
    invoke-virtual {v13, v11}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 300
    .line 301
    .line 302
    if-ne v3, v11, :cond_e

    .line 303
    .line 304
    if-eqz v4, :cond_d

    .line 305
    .line 306
    move v14, v11

    .line 307
    int-to-long v10, v7

    .line 308
    int-to-long v3, v4

    .line 309
    long-to-double v3, v3

    .line 310
    long-to-double v10, v10

    .line 311
    const-wide/high16 v19, 0x3ff0000000000000L    # 1.0

    .line 312
    .line 313
    div-double v3, v19, v3

    .line 314
    .line 315
    invoke-static {v10, v11, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 316
    .line 317
    .line 318
    move-result-wide v3

    .line 319
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 320
    .line 321
    .line 322
    move-result-wide v3

    .line 323
    double-to-long v3, v3

    .line 324
    goto :goto_b

    .line 325
    :cond_d
    move v14, v11

    .line 326
    const-wide/16 v3, 0x0

    .line 327
    .line 328
    goto :goto_b

    .line 329
    :cond_e
    move v14, v11

    .line 330
    int-to-long v3, v4

    .line 331
    int-to-long v10, v7

    .line 332
    mul-long/2addr v3, v10

    .line 333
    :goto_b
    int-to-long v10, v15

    .line 334
    mul-long/2addr v3, v10

    .line 335
    long-to-int v3, v3

    .line 336
    invoke-virtual {v13, v3}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 337
    .line 338
    .line 339
    :goto_c
    add-int/lit8 v1, v1, 0x1

    .line 340
    .line 341
    move v11, v14

    .line 342
    const/16 p2, 0x4

    .line 343
    .line 344
    const/4 v4, 0x0

    .line 345
    const/4 v10, 0x5

    .line 346
    const/16 v14, 0x8

    .line 347
    .line 348
    goto/16 :goto_5

    .line 349
    .line 350
    :cond_f
    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 355
    .line 356
    .line 357
    move-result v1

    .line 358
    new-instance v2, Ljava/lang/StringBuilder;

    .line 359
    .line 360
    add-int/lit8 v1, v1, 0x2a

    .line 361
    .line 362
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 363
    .line 364
    .line 365
    const-string v1, "lookup type greater than 2 not decodable: "

    .line 366
    .line 367
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    const/4 v2, 0x0

    .line 378
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    throw v1

    .line 383
    :cond_10
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzhc;->zzd()I

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 392
    .line 393
    .line 394
    move-result v2

    .line 395
    new-instance v3, Ljava/lang/StringBuilder;

    .line 396
    .line 397
    add-int/lit8 v2, v2, 0x37

    .line 398
    .line 399
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 400
    .line 401
    .line 402
    const-string v2, "expected code book to start with [0x56, 0x43, 0x42] at "

    .line 403
    .line 404
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    const/4 v2, 0x0

    .line 415
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    throw v1

    .line 420
    :cond_11
    move v14, v11

    .line 421
    const/4 v1, 0x6

    .line 422
    invoke-virtual {v13, v1}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 423
    .line 424
    .line 425
    move-result v7

    .line 426
    add-int/2addr v7, v14

    .line 427
    const/4 v10, 0x0

    .line 428
    :goto_d
    if-ge v10, v7, :cond_13

    .line 429
    .line 430
    invoke-virtual {v13, v4}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 431
    .line 432
    .line 433
    move-result v11

    .line 434
    if-nez v11, :cond_12

    .line 435
    .line 436
    add-int/lit8 v10, v10, 0x1

    .line 437
    .line 438
    goto :goto_d

    .line 439
    :cond_12
    const-string v1, "placeholder of time domain transforms not zeroed out"

    .line 440
    .line 441
    const/4 v2, 0x0

    .line 442
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    throw v1

    .line 447
    :cond_13
    invoke-virtual {v13, v1}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 448
    .line 449
    .line 450
    move-result v7

    .line 451
    add-int/2addr v7, v14

    .line 452
    const/4 v10, 0x0

    .line 453
    :goto_e
    const/4 v11, 0x3

    .line 454
    const/16 v12, 0x29

    .line 455
    .line 456
    if-ge v10, v7, :cond_1d

    .line 457
    .line 458
    invoke-virtual {v13, v4}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 459
    .line 460
    .line 461
    move-result v14

    .line 462
    if-eqz v14, :cond_1b

    .line 463
    .line 464
    const/4 v15, 0x1

    .line 465
    if-ne v14, v15, :cond_1a

    .line 466
    .line 467
    const/4 v15, 0x5

    .line 468
    invoke-virtual {v13, v15}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 469
    .line 470
    .line 471
    move-result v12

    .line 472
    new-array v14, v12, [I

    .line 473
    .line 474
    const/4 v1, -0x1

    .line 475
    const/4 v15, 0x0

    .line 476
    :goto_f
    if-ge v15, v12, :cond_15

    .line 477
    .line 478
    const/4 v4, 0x4

    .line 479
    invoke-virtual {v13, v4}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 480
    .line 481
    .line 482
    move-result v3

    .line 483
    aput v3, v14, v15

    .line 484
    .line 485
    if-le v3, v1, :cond_14

    .line 486
    .line 487
    move v1, v3

    .line 488
    :cond_14
    add-int/lit8 v15, v15, 0x1

    .line 489
    .line 490
    const/4 v3, 0x2

    .line 491
    const/16 v4, 0x10

    .line 492
    .line 493
    goto :goto_f

    .line 494
    :cond_15
    add-int/lit8 v1, v1, 0x1

    .line 495
    .line 496
    new-array v3, v1, [I

    .line 497
    .line 498
    const/4 v4, 0x0

    .line 499
    :goto_10
    if-ge v4, v1, :cond_18

    .line 500
    .line 501
    invoke-virtual {v13, v11}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 502
    .line 503
    .line 504
    move-result v15

    .line 505
    const/16 v19, 0x1

    .line 506
    .line 507
    add-int/lit8 v15, v15, 0x1

    .line 508
    .line 509
    aput v15, v3, v4

    .line 510
    .line 511
    const/4 v15, 0x2

    .line 512
    invoke-virtual {v13, v15}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 513
    .line 514
    .line 515
    move-result v23

    .line 516
    if-lez v23, :cond_16

    .line 517
    .line 518
    const/16 v15, 0x8

    .line 519
    .line 520
    invoke-virtual {v13, v15}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 521
    .line 522
    .line 523
    :goto_11
    move/from16 v24, v1

    .line 524
    .line 525
    const/4 v11, 0x0

    .line 526
    goto :goto_12

    .line 527
    :cond_16
    const/16 v15, 0x8

    .line 528
    .line 529
    goto :goto_11

    .line 530
    :goto_12
    shl-int v1, v19, v23

    .line 531
    .line 532
    if-ge v11, v1, :cond_17

    .line 533
    .line 534
    invoke-virtual {v13, v15}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 535
    .line 536
    .line 537
    add-int/lit8 v11, v11, 0x1

    .line 538
    .line 539
    const/16 v15, 0x8

    .line 540
    .line 541
    const/16 v19, 0x1

    .line 542
    .line 543
    goto :goto_12

    .line 544
    :cond_17
    add-int/lit8 v4, v4, 0x1

    .line 545
    .line 546
    move/from16 v1, v24

    .line 547
    .line 548
    const/4 v11, 0x3

    .line 549
    goto :goto_10

    .line 550
    :cond_18
    const/4 v15, 0x2

    .line 551
    invoke-virtual {v13, v15}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 552
    .line 553
    .line 554
    const/4 v4, 0x4

    .line 555
    invoke-virtual {v13, v4}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 556
    .line 557
    .line 558
    move-result v1

    .line 559
    const/4 v4, 0x0

    .line 560
    const/4 v11, 0x0

    .line 561
    const/4 v15, 0x0

    .line 562
    :goto_13
    if-ge v4, v12, :cond_1c

    .line 563
    .line 564
    aget v23, v14, v4

    .line 565
    .line 566
    aget v23, v3, v23

    .line 567
    .line 568
    add-int v11, v11, v23

    .line 569
    .line 570
    :goto_14
    if-ge v15, v11, :cond_19

    .line 571
    .line 572
    invoke-virtual {v13, v1}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 573
    .line 574
    .line 575
    add-int/lit8 v15, v15, 0x1

    .line 576
    .line 577
    goto :goto_14

    .line 578
    :cond_19
    add-int/lit8 v4, v4, 0x1

    .line 579
    .line 580
    goto :goto_13

    .line 581
    :cond_1a
    invoke-static {v14, v12}, LA7/p0;->f(II)I

    .line 582
    .line 583
    .line 584
    move-result v1

    .line 585
    new-instance v2, Ljava/lang/StringBuilder;

    .line 586
    .line 587
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 588
    .line 589
    .line 590
    const-string v1, "floor type greater than 1 not decodable: "

    .line 591
    .line 592
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    const/4 v2, 0x0

    .line 603
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 604
    .line 605
    .line 606
    move-result-object v1

    .line 607
    throw v1

    .line 608
    :cond_1b
    const/16 v15, 0x8

    .line 609
    .line 610
    invoke-virtual {v13, v15}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 611
    .line 612
    .line 613
    const/16 v1, 0x10

    .line 614
    .line 615
    invoke-virtual {v13, v1}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v13, v1}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 619
    .line 620
    .line 621
    const/4 v1, 0x6

    .line 622
    invoke-virtual {v13, v1}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v13, v15}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 626
    .line 627
    .line 628
    const/4 v4, 0x4

    .line 629
    invoke-virtual {v13, v4}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 630
    .line 631
    .line 632
    move-result v1

    .line 633
    const/4 v14, 0x1

    .line 634
    add-int/2addr v1, v14

    .line 635
    const/4 v3, 0x0

    .line 636
    :goto_15
    if-ge v3, v1, :cond_1c

    .line 637
    .line 638
    invoke-virtual {v13, v15}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 639
    .line 640
    .line 641
    add-int/lit8 v3, v3, 0x1

    .line 642
    .line 643
    const/16 v15, 0x8

    .line 644
    .line 645
    goto :goto_15

    .line 646
    :cond_1c
    add-int/lit8 v10, v10, 0x1

    .line 647
    .line 648
    const/4 v1, 0x6

    .line 649
    const/4 v3, 0x2

    .line 650
    const/16 v4, 0x10

    .line 651
    .line 652
    const/4 v14, 0x1

    .line 653
    const/16 v15, 0x18

    .line 654
    .line 655
    goto/16 :goto_e

    .line 656
    .line 657
    :cond_1d
    invoke-virtual {v13, v1}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 658
    .line 659
    .line 660
    move-result v3

    .line 661
    const/4 v14, 0x1

    .line 662
    add-int/2addr v3, v14

    .line 663
    const/4 v4, 0x0

    .line 664
    :goto_16
    if-ge v4, v3, :cond_24

    .line 665
    .line 666
    const/16 v7, 0x10

    .line 667
    .line 668
    invoke-virtual {v13, v7}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 669
    .line 670
    .line 671
    move-result v10

    .line 672
    const/4 v15, 0x2

    .line 673
    if-gt v10, v15, :cond_23

    .line 674
    .line 675
    const/16 v7, 0x18

    .line 676
    .line 677
    invoke-virtual {v13, v7}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v13, v7}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v13, v7}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v13, v1}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 687
    .line 688
    .line 689
    move-result v10

    .line 690
    add-int/2addr v10, v14

    .line 691
    const/16 v15, 0x8

    .line 692
    .line 693
    invoke-virtual {v13, v15}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 694
    .line 695
    .line 696
    new-array v1, v10, [I

    .line 697
    .line 698
    const/4 v11, 0x0

    .line 699
    :goto_17
    if-ge v11, v10, :cond_1f

    .line 700
    .line 701
    const/4 v7, 0x3

    .line 702
    invoke-virtual {v13, v7}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 703
    .line 704
    .line 705
    move-result v19

    .line 706
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzhc;->zza()Z

    .line 707
    .line 708
    .line 709
    move-result v23

    .line 710
    if-eqz v23, :cond_1e

    .line 711
    .line 712
    const/4 v7, 0x5

    .line 713
    invoke-virtual {v13, v7}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 714
    .line 715
    .line 716
    move-result v18

    .line 717
    goto :goto_18

    .line 718
    :cond_1e
    const/4 v7, 0x5

    .line 719
    const/16 v18, 0x0

    .line 720
    .line 721
    :goto_18
    mul-int/lit8 v18, v18, 0x8

    .line 722
    .line 723
    add-int v18, v18, v19

    .line 724
    .line 725
    aput v18, v1, v11

    .line 726
    .line 727
    add-int/lit8 v11, v11, 0x1

    .line 728
    .line 729
    const/16 v7, 0x18

    .line 730
    .line 731
    goto :goto_17

    .line 732
    :cond_1f
    const/4 v11, 0x0

    .line 733
    :goto_19
    const/4 v7, 0x5

    .line 734
    if-ge v11, v10, :cond_22

    .line 735
    .line 736
    const/4 v7, 0x0

    .line 737
    :goto_1a
    if-ge v7, v15, :cond_21

    .line 738
    .line 739
    aget v19, v1, v11

    .line 740
    .line 741
    const/4 v14, 0x1

    .line 742
    shl-int v23, v14, v7

    .line 743
    .line 744
    and-int v19, v19, v23

    .line 745
    .line 746
    if-eqz v19, :cond_20

    .line 747
    .line 748
    invoke-virtual {v13, v15}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 749
    .line 750
    .line 751
    :cond_20
    add-int/lit8 v7, v7, 0x1

    .line 752
    .line 753
    const/16 v15, 0x8

    .line 754
    .line 755
    goto :goto_1a

    .line 756
    :cond_21
    add-int/lit8 v11, v11, 0x1

    .line 757
    .line 758
    const/16 v15, 0x8

    .line 759
    .line 760
    goto :goto_19

    .line 761
    :cond_22
    add-int/lit8 v4, v4, 0x1

    .line 762
    .line 763
    const/4 v1, 0x6

    .line 764
    const/4 v14, 0x1

    .line 765
    goto :goto_16

    .line 766
    :cond_23
    const-string v1, "residueType greater than 2 is not decodable"

    .line 767
    .line 768
    const/4 v2, 0x0

    .line 769
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 770
    .line 771
    .line 772
    move-result-object v1

    .line 773
    throw v1

    .line 774
    :cond_24
    invoke-virtual {v13, v1}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 775
    .line 776
    .line 777
    move-result v3

    .line 778
    const/4 v14, 0x1

    .line 779
    add-int/2addr v3, v14

    .line 780
    const/4 v1, 0x0

    .line 781
    :goto_1b
    if-ge v1, v3, :cond_2b

    .line 782
    .line 783
    const/16 v7, 0x10

    .line 784
    .line 785
    invoke-virtual {v13, v7}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 786
    .line 787
    .line 788
    move-result v4

    .line 789
    if-eqz v4, :cond_25

    .line 790
    .line 791
    invoke-static {v4, v12}, LA7/p0;->f(II)I

    .line 792
    .line 793
    .line 794
    move-result v7

    .line 795
    new-instance v10, Ljava/lang/StringBuilder;

    .line 796
    .line 797
    invoke-direct {v10, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 798
    .line 799
    .line 800
    const-string v7, "mapping type other than 0 not supported: "

    .line 801
    .line 802
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 803
    .line 804
    .line 805
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 806
    .line 807
    .line 808
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 809
    .line 810
    .line 811
    move-result-object v4

    .line 812
    const-string v7, "VorbisUtil"

    .line 813
    .line 814
    invoke-static {v7, v4}, Lcom/google/android/gms/internal/ads/zzeh;->zze(Ljava/lang/String;Ljava/lang/String;)V

    .line 815
    .line 816
    .line 817
    const/4 v10, 0x4

    .line 818
    const/4 v15, 0x2

    .line 819
    goto :goto_20

    .line 820
    :cond_25
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzhc;->zza()Z

    .line 821
    .line 822
    .line 823
    move-result v4

    .line 824
    if-eqz v4, :cond_26

    .line 825
    .line 826
    const/4 v4, 0x4

    .line 827
    invoke-virtual {v13, v4}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 828
    .line 829
    .line 830
    move-result v7

    .line 831
    const/4 v14, 0x1

    .line 832
    add-int/lit8 v4, v7, 0x1

    .line 833
    .line 834
    goto :goto_1c

    .line 835
    :cond_26
    const/4 v14, 0x1

    .line 836
    move v4, v14

    .line 837
    :goto_1c
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzhc;->zza()Z

    .line 838
    .line 839
    .line 840
    move-result v7

    .line 841
    if-eqz v7, :cond_27

    .line 842
    .line 843
    const/16 v15, 0x8

    .line 844
    .line 845
    invoke-virtual {v13, v15}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 846
    .line 847
    .line 848
    move-result v7

    .line 849
    add-int/2addr v7, v14

    .line 850
    const/4 v10, 0x0

    .line 851
    :goto_1d
    if-ge v10, v7, :cond_27

    .line 852
    .line 853
    add-int/lit8 v11, v9, -0x1

    .line 854
    .line 855
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzhg;->zza(I)I

    .line 856
    .line 857
    .line 858
    move-result v15

    .line 859
    invoke-virtual {v13, v15}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 860
    .line 861
    .line 862
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzhg;->zza(I)I

    .line 863
    .line 864
    .line 865
    move-result v11

    .line 866
    invoke-virtual {v13, v11}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 867
    .line 868
    .line 869
    add-int/lit8 v10, v10, 0x1

    .line 870
    .line 871
    goto :goto_1d

    .line 872
    :cond_27
    const/4 v15, 0x2

    .line 873
    invoke-virtual {v13, v15}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 874
    .line 875
    .line 876
    move-result v7

    .line 877
    if-nez v7, :cond_2a

    .line 878
    .line 879
    const/4 v14, 0x1

    .line 880
    if-le v4, v14, :cond_28

    .line 881
    .line 882
    const/4 v7, 0x0

    .line 883
    :goto_1e
    if-ge v7, v9, :cond_28

    .line 884
    .line 885
    const/4 v10, 0x4

    .line 886
    invoke-virtual {v13, v10}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 887
    .line 888
    .line 889
    add-int/lit8 v7, v7, 0x1

    .line 890
    .line 891
    goto :goto_1e

    .line 892
    :cond_28
    const/4 v10, 0x4

    .line 893
    const/4 v7, 0x0

    .line 894
    :goto_1f
    if-ge v7, v4, :cond_29

    .line 895
    .line 896
    const/16 v11, 0x8

    .line 897
    .line 898
    invoke-virtual {v13, v11}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 899
    .line 900
    .line 901
    invoke-virtual {v13, v11}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {v13, v11}, Lcom/google/android/gms/internal/ads/zzhc;->zzc(I)V

    .line 905
    .line 906
    .line 907
    add-int/lit8 v7, v7, 0x1

    .line 908
    .line 909
    goto :goto_1f

    .line 910
    :cond_29
    :goto_20
    add-int/lit8 v1, v1, 0x1

    .line 911
    .line 912
    goto/16 :goto_1b

    .line 913
    .line 914
    :cond_2a
    const-string v1, "to reserved bits must be zero after mapping coupling steps"

    .line 915
    .line 916
    const/4 v2, 0x0

    .line 917
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 918
    .line 919
    .line 920
    move-result-object v1

    .line 921
    throw v1

    .line 922
    :cond_2b
    const/4 v1, 0x6

    .line 923
    invoke-virtual {v13, v1}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 924
    .line 925
    .line 926
    move-result v1

    .line 927
    add-int/lit8 v3, v1, 0x1

    .line 928
    .line 929
    new-array v9, v3, [Lcom/google/android/gms/internal/ads/zzhe;

    .line 930
    .line 931
    const/4 v4, 0x0

    .line 932
    :goto_21
    if-ge v4, v3, :cond_2c

    .line 933
    .line 934
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzhc;->zza()Z

    .line 935
    .line 936
    .line 937
    move-result v7

    .line 938
    const/16 v10, 0x10

    .line 939
    .line 940
    invoke-virtual {v13, v10}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 941
    .line 942
    .line 943
    move-result v11

    .line 944
    invoke-virtual {v13, v10}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 945
    .line 946
    .line 947
    move-result v12

    .line 948
    const/16 v15, 0x8

    .line 949
    .line 950
    invoke-virtual {v13, v15}, Lcom/google/android/gms/internal/ads/zzhc;->zzb(I)I

    .line 951
    .line 952
    .line 953
    move-result v10

    .line 954
    new-instance v14, Lcom/google/android/gms/internal/ads/zzhe;

    .line 955
    .line 956
    invoke-direct {v14, v7, v11, v12, v10}, Lcom/google/android/gms/internal/ads/zzhe;-><init>(ZIII)V

    .line 957
    .line 958
    .line 959
    aput-object v14, v9, v4

    .line 960
    .line 961
    add-int/lit8 v4, v4, 0x1

    .line 962
    .line 963
    goto :goto_21

    .line 964
    :cond_2c
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzhc;->zza()Z

    .line 965
    .line 966
    .line 967
    move-result v3

    .line 968
    if-eqz v3, :cond_2e

    .line 969
    .line 970
    move-object v7, v5

    .line 971
    new-instance v5, Lcom/google/android/gms/internal/ads/zzanh;

    .line 972
    .line 973
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzhg;->zza(I)I

    .line 974
    .line 975
    .line 976
    move-result v10

    .line 977
    invoke-direct/range {v5 .. v10}, Lcom/google/android/gms/internal/ads/zzanh;-><init>(Lcom/google/android/gms/internal/ads/zzhf;Lcom/google/android/gms/internal/ads/zzhd;[B[Lcom/google/android/gms/internal/ads/zzhe;I)V

    .line 978
    .line 979
    .line 980
    move-object v7, v5

    .line 981
    :goto_22
    iput-object v7, v0, Lcom/google/android/gms/internal/ads/zzani;->zza:Lcom/google/android/gms/internal/ads/zzanh;

    .line 982
    .line 983
    if-nez v7, :cond_2d

    .line 984
    .line 985
    const/4 v14, 0x1

    .line 986
    return v14

    .line 987
    :cond_2d
    new-instance v1, Ljava/util/ArrayList;

    .line 988
    .line 989
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 990
    .line 991
    .line 992
    iget-object v3, v7, Lcom/google/android/gms/internal/ads/zzanh;->zza:Lcom/google/android/gms/internal/ads/zzhf;

    .line 993
    .line 994
    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzhf;->zzg:[B

    .line 995
    .line 996
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 997
    .line 998
    .line 999
    iget-object v4, v7, Lcom/google/android/gms/internal/ads/zzanh;->zzc:[B

    .line 1000
    .line 1001
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1002
    .line 1003
    .line 1004
    iget-object v4, v7, Lcom/google/android/gms/internal/ads/zzanh;->zzb:Lcom/google/android/gms/internal/ads/zzhd;

    .line 1005
    .line 1006
    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzhd;->zza:[Ljava/lang/String;

    .line 1007
    .line 1008
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzgwt;->zzr([Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v4

    .line 1012
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzaho;->zzb(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzap;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v4

    .line 1016
    new-instance v5, Lcom/google/android/gms/internal/ads/zzt;

    .line 1017
    .line 1018
    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 1019
    .line 1020
    .line 1021
    const-string v6, "audio/ogg"

    .line 1022
    .line 1023
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzn(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 1024
    .line 1025
    .line 1026
    const-string v6, "audio/vorbis"

    .line 1027
    .line 1028
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 1029
    .line 1030
    .line 1031
    iget v6, v3, Lcom/google/android/gms/internal/ads/zzhf;->zzd:I

    .line 1032
    .line 1033
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzi(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 1034
    .line 1035
    .line 1036
    iget v6, v3, Lcom/google/android/gms/internal/ads/zzhf;->zzc:I

    .line 1037
    .line 1038
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzj(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 1039
    .line 1040
    .line 1041
    iget v6, v3, Lcom/google/android/gms/internal/ads/zzhf;->zza:I

    .line 1042
    .line 1043
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzG(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 1044
    .line 1045
    .line 1046
    iget v3, v3, Lcom/google/android/gms/internal/ads/zzhf;->zzb:I

    .line 1047
    .line 1048
    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzI(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/ads/zzt;->zzr(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzt;

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzl(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzt;

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v1

    .line 1061
    iput-object v1, v2, Lcom/google/android/gms/internal/ads/zzane;->zza:Lcom/google/android/gms/internal/ads/zzv;

    .line 1062
    .line 1063
    const/4 v14, 0x1

    .line 1064
    return v14

    .line 1065
    :cond_2e
    const-string v1, "framing bit after modes not set as expected"

    .line 1066
    .line 1067
    const/4 v2, 0x0

    .line 1068
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v1

    .line 1072
    throw v1
.end method

.method public final zzj(J)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzang;->zzj(J)V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long p1, p1, v0

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move p1, p2

    .line 14
    :goto_0
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzani;->zzc:Z

    .line 15
    .line 16
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzani;->zzd:Lcom/google/android/gms/internal/ads/zzhf;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    iget p2, p1, Lcom/google/android/gms/internal/ads/zzhf;->zze:I

    .line 21
    .line 22
    :cond_1
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzani;->zzb:I

    .line 23
    .line 24
    return-void
.end method
