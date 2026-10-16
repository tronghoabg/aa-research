.class public final Lcom/google/android/gms/internal/ads/zzjf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:J

.field private final zzb:J

.field private zzc:J

.field private zzd:J

.field private zze:J

.field private zzf:J

.field private zzg:J

.field private zzh:J

.field private zzi:F

.field private zzj:F

.field private zzk:F

.field private zzl:J

.field private zzm:J

.field private zzn:J


# direct methods
.method public synthetic constructor <init>(FFJFJJF[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p6, p0, Lcom/google/android/gms/internal/ads/zzjf;->zza:J

    iput-wide p8, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzb:J

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzc:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzd:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzf:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzg:J

    const p3, 0x3f7851ec    # 0.97f

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzj:F

    const p3, 0x3f83d70a    # 1.03f

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzi:F

    const/high16 p3, 0x3f800000    # 1.0f

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzk:F

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzl:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzjf;->zze:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzh:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzm:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzn:J

    return-void
.end method

.method private final zzf()V
    .locals 7

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzc:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_2

    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzd:J

    cmp-long v6, v4, v2

    if-nez v6, :cond_3

    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzf:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_0

    cmp-long v6, v0, v4

    if-gez v6, :cond_0

    move-wide v0, v4

    :cond_0
    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzg:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_1

    cmp-long v6, v0, v4

    if-lez v6, :cond_1

    goto :goto_0

    :cond_1
    move-wide v4, v0

    goto :goto_0

    :cond_2
    move-wide v4, v2

    :cond_3
    :goto_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzjf;->zze:J

    cmp-long v0, v0, v4

    if-nez v0, :cond_4

    return-void

    :cond_4
    iput-wide v4, p0, Lcom/google/android/gms/internal/ads/zzjf;->zze:J

    iput-wide v4, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzh:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzm:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzn:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzl:J

    return-void
.end method

.method private static zzg(JJF)J
    .locals 0

    long-to-float p0, p0

    long-to-float p1, p2

    const p2, 0x3f7fbe77    # 0.999f

    mul-float/2addr p0, p2

    const p2, 0x3a831200    # 9.999871E-4f

    mul-float/2addr p1, p2

    add-float/2addr p1, p0

    float-to-long p0, p1

    return-wide p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzaf;)V
    .locals 4

    .line 1
    iget-wide v0, p1, Lcom/google/android/gms/internal/ads/zzaf;->zza:J

    .line 2
    .line 3
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfm;->zzt(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzc:J

    .line 13
    .line 14
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfm;->zzt(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzf:J

    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfm;->zzt(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzg:J

    .line 25
    .line 26
    const p1, 0x3f7851ec    # 0.97f

    .line 27
    .line 28
    .line 29
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzj:F

    .line 30
    .line 31
    const p1, 0x3f83d70a    # 1.03f

    .line 32
    .line 33
    .line 34
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzi:F

    .line 35
    .line 36
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjf;->zzf()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final zzb(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzd:J

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzjf;->zzf()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzc()V
    .locals 7

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzh:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-void

    :cond_0
    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzb:J

    add-long/2addr v0, v4

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzh:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzg:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_1

    cmp-long v0, v0, v4

    if-lez v0, :cond_1

    iput-wide v4, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzh:J

    :cond_1
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzl:J

    return-void
.end method

.method public final zzd(JJ)F
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzc:J

    .line 6
    .line 7
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long v4, v4, v6

    .line 13
    .line 14
    const/high16 v5, 0x3f800000    # 1.0f

    .line 15
    .line 16
    if-eqz v4, :cond_7

    .line 17
    .line 18
    sub-long v8, p1, p3

    .line 19
    .line 20
    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzm:J

    .line 21
    .line 22
    cmp-long v4, v10, v6

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    iput-wide v8, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzm:J

    .line 27
    .line 28
    const-wide/16 v8, 0x0

    .line 29
    .line 30
    iput-wide v8, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzn:J

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const v4, 0x3f7fbe77    # 0.999f

    .line 34
    .line 35
    .line 36
    invoke-static {v10, v11, v8, v9, v4}, Lcom/google/android/gms/internal/ads/zzjf;->zzg(JJF)J

    .line 37
    .line 38
    .line 39
    move-result-wide v10

    .line 40
    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide v10

    .line 44
    iput-wide v10, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzm:J

    .line 45
    .line 46
    sub-long/2addr v8, v10

    .line 47
    invoke-static {v8, v9}, Ljava/lang/Math;->abs(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v8

    .line 51
    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzn:J

    .line 52
    .line 53
    invoke-static {v10, v11, v8, v9, v4}, Lcom/google/android/gms/internal/ads/zzjf;->zzg(JJF)J

    .line 54
    .line 55
    .line 56
    move-result-wide v8

    .line 57
    iput-wide v8, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzn:J

    .line 58
    .line 59
    :goto_0
    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzl:J

    .line 60
    .line 61
    cmp-long v4, v8, v6

    .line 62
    .line 63
    const-wide/16 v8, 0x3e8

    .line 64
    .line 65
    if-eqz v4, :cond_1

    .line 66
    .line 67
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 68
    .line 69
    .line 70
    move-result-wide v10

    .line 71
    iget-wide v12, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzl:J

    .line 72
    .line 73
    sub-long/2addr v10, v12

    .line 74
    cmp-long v4, v10, v8

    .line 75
    .line 76
    if-gez v4, :cond_1

    .line 77
    .line 78
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzk:F

    .line 79
    .line 80
    return v1

    .line 81
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 82
    .line 83
    .line 84
    move-result-wide v10

    .line 85
    iput-wide v10, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzl:J

    .line 86
    .line 87
    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzm:J

    .line 88
    .line 89
    iget-wide v12, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzn:J

    .line 90
    .line 91
    const-wide/16 v14, 0x3

    .line 92
    .line 93
    mul-long/2addr v12, v14

    .line 94
    add-long/2addr v12, v10

    .line 95
    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzh:J

    .line 96
    .line 97
    cmp-long v4, v10, v12

    .line 98
    .line 99
    const/high16 v11, -0x40800000    # -1.0f

    .line 100
    .line 101
    if-lez v4, :cond_4

    .line 102
    .line 103
    invoke-static {v8, v9}, Lcom/google/android/gms/internal/ads/zzfm;->zzt(J)J

    .line 104
    .line 105
    .line 106
    move-result-wide v6

    .line 107
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzk:F

    .line 108
    .line 109
    add-float/2addr v4, v11

    .line 110
    iget v8, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzi:F

    .line 111
    .line 112
    add-float/2addr v8, v11

    .line 113
    iget-wide v14, v0, Lcom/google/android/gms/internal/ads/zzjf;->zze:J

    .line 114
    .line 115
    move/from16 p3, v4

    .line 116
    .line 117
    const/4 v9, 0x1

    .line 118
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzh:J

    .line 119
    .line 120
    long-to-float v6, v6

    .line 121
    mul-float/2addr v8, v6

    .line 122
    mul-float v6, v6, p3

    .line 123
    .line 124
    float-to-long v6, v6

    .line 125
    move/from16 p4, v9

    .line 126
    .line 127
    const p3, 0x33d6bf95    # 1.0E-7f

    .line 128
    .line 129
    .line 130
    float-to-long v9, v8

    .line 131
    add-long/2addr v6, v9

    .line 132
    sub-long/2addr v3, v6

    .line 133
    new-array v6, v2, [J

    .line 134
    .line 135
    aput-wide v12, v6, v1

    .line 136
    .line 137
    aput-wide v14, v6, p4

    .line 138
    .line 139
    const/4 v7, 0x2

    .line 140
    aput-wide v3, v6, v7

    .line 141
    .line 142
    aget-wide v3, v6, v1

    .line 143
    .line 144
    move/from16 v1, p4

    .line 145
    .line 146
    :goto_1
    if-ge v1, v2, :cond_3

    .line 147
    .line 148
    aget-wide v7, v6, v1

    .line 149
    .line 150
    cmp-long v9, v7, v3

    .line 151
    .line 152
    if-gtz v9, :cond_2

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_2
    move-wide v3, v7

    .line 156
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_3
    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzh:J

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_4
    const p3, 0x33d6bf95    # 1.0E-7f

    .line 163
    .line 164
    .line 165
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzk:F

    .line 166
    .line 167
    add-float/2addr v1, v11

    .line 168
    const/4 v2, 0x0

    .line 169
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    div-float v1, v1, p3

    .line 174
    .line 175
    float-to-long v1, v1

    .line 176
    sub-long v1, p1, v1

    .line 177
    .line 178
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzh:J

    .line 179
    .line 180
    sget-object v8, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 181
    .line 182
    invoke-static {v1, v2, v12, v13}, Ljava/lang/Math;->min(JJ)J

    .line 183
    .line 184
    .line 185
    move-result-wide v1

    .line 186
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 187
    .line 188
    .line 189
    move-result-wide v3

    .line 190
    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzh:J

    .line 191
    .line 192
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzg:J

    .line 193
    .line 194
    cmp-long v6, v1, v6

    .line 195
    .line 196
    if-eqz v6, :cond_5

    .line 197
    .line 198
    cmp-long v6, v3, v1

    .line 199
    .line 200
    if-lez v6, :cond_5

    .line 201
    .line 202
    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzh:J

    .line 203
    .line 204
    move-wide v3, v1

    .line 205
    :cond_5
    :goto_3
    sub-long v1, p1, v3

    .line 206
    .line 207
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzjf;->zza:J

    .line 208
    .line 209
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    .line 210
    .line 211
    .line 212
    move-result-wide v6

    .line 213
    cmp-long v3, v6, v3

    .line 214
    .line 215
    if-gez v3, :cond_6

    .line 216
    .line 217
    iput v5, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzk:F

    .line 218
    .line 219
    return v5

    .line 220
    :cond_6
    long-to-float v1, v1

    .line 221
    mul-float v1, v1, p3

    .line 222
    .line 223
    add-float/2addr v1, v5

    .line 224
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzj:F

    .line 225
    .line 226
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzi:F

    .line 227
    .line 228
    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzjf;->zzk:F

    .line 237
    .line 238
    return v1

    .line 239
    :cond_7
    return v5
.end method

.method public final zze()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzjf;->zzh:J

    return-wide v0
.end method
