.class final Lcom/google/android/gms/internal/ads/zzhln;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final zza:[J

.field final zzb:[J

.field final zzc:[J


# direct methods
.method public constructor <init>()V
    .locals 3

    const/16 v0, 0xa

    .line 2
    new-array v1, v0, [J

    new-array v2, v0, [J

    new-array v0, v0, [J

    invoke-direct {p0, v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzhln;-><init>([J[J[J)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzhlm;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzhln;-><init>()V

    .line 4
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/zzhln;->zza(Lcom/google/android/gms/internal/ads/zzhln;Lcom/google/android/gms/internal/ads/zzhlm;)Lcom/google/android/gms/internal/ads/zzhln;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzhln;)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzhln;->zza:[J

    const/16 v1, 0xa

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhln;->zza:[J

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzhln;->zzb:[J

    .line 6
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhln;->zzb:[J

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzhln;->zzc:[J

    .line 7
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhln;->zzc:[J

    return-void
.end method

.method public constructor <init>([J[J[J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhln;->zza:[J

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzhln;->zzb:[J

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzhln;->zzc:[J

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzhln;Lcom/google/android/gms/internal/ads/zzhlm;)Lcom/google/android/gms/internal/ads/zzhln;
    .locals 3

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzhlm;->zza:Lcom/google/android/gms/internal/ads/zzhln;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhln;->zza:[J

    .line 4
    .line 5
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzhln;->zza:[J

    .line 6
    .line 7
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzhlm;->zzb:[J

    .line 8
    .line 9
    invoke-static {v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzhlw;->zze([J[J[J)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhln;->zzb:[J

    .line 13
    .line 14
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzhln;->zzb:[J

    .line 15
    .line 16
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzhln;->zzc:[J

    .line 17
    .line 18
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzhlw;->zze([J[J[J)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhln;->zzc:[J

    .line 22
    .line 23
    invoke-static {v1, v0, p1}, Lcom/google/android/gms/internal/ads/zzhlw;->zze([J[J[J)V

    .line 24
    .line 25
    .line 26
    return-object p0
.end method


# virtual methods
.method public final zzb()[B
    .locals 15

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    new-array v1, v0, [J

    .line 4
    .line 5
    new-array v2, v0, [J

    .line 6
    .line 7
    new-array v3, v0, [J

    .line 8
    .line 9
    new-array v4, v0, [J

    .line 10
    .line 11
    new-array v5, v0, [J

    .line 12
    .line 13
    new-array v6, v0, [J

    .line 14
    .line 15
    new-array v7, v0, [J

    .line 16
    .line 17
    new-array v8, v0, [J

    .line 18
    .line 19
    new-array v9, v0, [J

    .line 20
    .line 21
    new-array v10, v0, [J

    .line 22
    .line 23
    new-array v11, v0, [J

    .line 24
    .line 25
    new-array v12, v0, [J

    .line 26
    .line 27
    new-array v13, v0, [J

    .line 28
    .line 29
    iget-object v14, p0, Lcom/google/android/gms/internal/ads/zzhln;->zzc:[J

    .line 30
    .line 31
    invoke-static {v4, v14}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 32
    .line 33
    .line 34
    invoke-static {v13, v4}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 35
    .line 36
    .line 37
    invoke-static {v12, v13}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 38
    .line 39
    .line 40
    invoke-static {v5, v12, v14}, Lcom/google/android/gms/internal/ads/zzhlw;->zze([J[J[J)V

    .line 41
    .line 42
    .line 43
    invoke-static {v6, v5, v4}, Lcom/google/android/gms/internal/ads/zzhlw;->zze([J[J[J)V

    .line 44
    .line 45
    .line 46
    invoke-static {v12, v6}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 47
    .line 48
    .line 49
    invoke-static {v7, v12, v5}, Lcom/google/android/gms/internal/ads/zzhlw;->zze([J[J[J)V

    .line 50
    .line 51
    .line 52
    invoke-static {v12, v7}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 53
    .line 54
    .line 55
    invoke-static {v13, v12}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 56
    .line 57
    .line 58
    invoke-static {v12, v13}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 59
    .line 60
    .line 61
    invoke-static {v13, v12}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 62
    .line 63
    .line 64
    invoke-static {v12, v13}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 65
    .line 66
    .line 67
    invoke-static {v8, v12, v7}, Lcom/google/android/gms/internal/ads/zzhlw;->zze([J[J[J)V

    .line 68
    .line 69
    .line 70
    invoke-static {v12, v8}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 71
    .line 72
    .line 73
    invoke-static {v13, v12}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 74
    .line 75
    .line 76
    const/4 v4, 0x2

    .line 77
    move v5, v4

    .line 78
    :goto_0
    if-ge v5, v0, :cond_0

    .line 79
    .line 80
    invoke-static {v12, v13}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 81
    .line 82
    .line 83
    invoke-static {v13, v12}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 84
    .line 85
    .line 86
    add-int/lit8 v5, v5, 0x2

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    invoke-static {v9, v13, v8}, Lcom/google/android/gms/internal/ads/zzhlw;->zze([J[J[J)V

    .line 90
    .line 91
    .line 92
    invoke-static {v12, v9}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 93
    .line 94
    .line 95
    invoke-static {v13, v12}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 96
    .line 97
    .line 98
    move v5, v4

    .line 99
    :goto_1
    const/16 v7, 0x14

    .line 100
    .line 101
    if-ge v5, v7, :cond_1

    .line 102
    .line 103
    invoke-static {v12, v13}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 104
    .line 105
    .line 106
    invoke-static {v13, v12}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 107
    .line 108
    .line 109
    add-int/lit8 v5, v5, 0x2

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_1
    invoke-static {v12, v13, v9}, Lcom/google/android/gms/internal/ads/zzhlw;->zze([J[J[J)V

    .line 113
    .line 114
    .line 115
    invoke-static {v13, v12}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 116
    .line 117
    .line 118
    invoke-static {v12, v13}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 119
    .line 120
    .line 121
    move v5, v4

    .line 122
    :goto_2
    if-ge v5, v0, :cond_2

    .line 123
    .line 124
    invoke-static {v13, v12}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 125
    .line 126
    .line 127
    invoke-static {v12, v13}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 128
    .line 129
    .line 130
    add-int/lit8 v5, v5, 0x2

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_2
    invoke-static {v10, v12, v8}, Lcom/google/android/gms/internal/ads/zzhlw;->zze([J[J[J)V

    .line 134
    .line 135
    .line 136
    invoke-static {v12, v10}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 137
    .line 138
    .line 139
    invoke-static {v13, v12}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 140
    .line 141
    .line 142
    move v0, v4

    .line 143
    :goto_3
    const/16 v5, 0x32

    .line 144
    .line 145
    if-ge v0, v5, :cond_3

    .line 146
    .line 147
    invoke-static {v12, v13}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 148
    .line 149
    .line 150
    invoke-static {v13, v12}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 151
    .line 152
    .line 153
    add-int/lit8 v0, v0, 0x2

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_3
    invoke-static {v11, v13, v10}, Lcom/google/android/gms/internal/ads/zzhlw;->zze([J[J[J)V

    .line 157
    .line 158
    .line 159
    invoke-static {v13, v11}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 160
    .line 161
    .line 162
    invoke-static {v12, v13}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 163
    .line 164
    .line 165
    move v0, v4

    .line 166
    :goto_4
    const/16 v7, 0x64

    .line 167
    .line 168
    if-ge v0, v7, :cond_4

    .line 169
    .line 170
    invoke-static {v13, v12}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 171
    .line 172
    .line 173
    invoke-static {v12, v13}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 174
    .line 175
    .line 176
    add-int/lit8 v0, v0, 0x2

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_4
    invoke-static {v13, v12, v11}, Lcom/google/android/gms/internal/ads/zzhlw;->zze([J[J[J)V

    .line 180
    .line 181
    .line 182
    invoke-static {v12, v13}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 183
    .line 184
    .line 185
    invoke-static {v13, v12}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 186
    .line 187
    .line 188
    :goto_5
    if-ge v4, v5, :cond_5

    .line 189
    .line 190
    invoke-static {v12, v13}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 191
    .line 192
    .line 193
    invoke-static {v13, v12}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 194
    .line 195
    .line 196
    add-int/lit8 v4, v4, 0x2

    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_5
    invoke-static {v12, v13, v10}, Lcom/google/android/gms/internal/ads/zzhlw;->zze([J[J[J)V

    .line 200
    .line 201
    .line 202
    invoke-static {v13, v12}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 203
    .line 204
    .line 205
    invoke-static {v12, v13}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 206
    .line 207
    .line 208
    invoke-static {v13, v12}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 209
    .line 210
    .line 211
    invoke-static {v12, v13}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 212
    .line 213
    .line 214
    invoke-static {v13, v12}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf([J[J)V

    .line 215
    .line 216
    .line 217
    invoke-static {v1, v13, v6}, Lcom/google/android/gms/internal/ads/zzhlw;->zze([J[J[J)V

    .line 218
    .line 219
    .line 220
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhln;->zza:[J

    .line 221
    .line 222
    invoke-static {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzhlw;->zze([J[J[J)V

    .line 223
    .line 224
    .line 225
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhln;->zzb:[J

    .line 226
    .line 227
    invoke-static {v3, v0, v1}, Lcom/google/android/gms/internal/ads/zzhlw;->zze([J[J[J)V

    .line 228
    .line 229
    .line 230
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzhlw;->zzh([J)[B

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    const/16 v1, 0x1f

    .line 235
    .line 236
    aget-byte v3, v0, v1

    .line 237
    .line 238
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzhlp;->zzf([J)I

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    shl-int/lit8 v2, v2, 0x7

    .line 243
    .line 244
    xor-int/2addr v2, v3

    .line 245
    int-to-byte v2, v2

    .line 246
    aput-byte v2, v0, v1

    .line 247
    .line 248
    return-object v0
.end method
