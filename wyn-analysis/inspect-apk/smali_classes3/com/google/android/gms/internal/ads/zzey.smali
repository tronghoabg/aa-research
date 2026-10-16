.class final Lcom/google/android/gms/internal/ads/zzey;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzfd;

.field private final zzb:I

.field private zzc:Ljava/lang/Object;

.field private zzd:I

.field private zze:I

.field private zzf:J

.field private zzg:J

.field private zzh:Z

.field private zzi:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzfd;I)V
    .locals 0

    .line 1
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzey;->zza:Lcom/google/android/gms/internal/ads/zzfd;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzey;->zzb:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzey;->zza:Lcom/google/android/gms/internal/ads/zzfd;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()Lcom/google/android/gms/internal/ads/zzbb;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzbb;->zzh()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x2

    .line 12
    const/4 v3, 0x1

    .line 13
    if-ne v1, v2, :cond_5

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()Lcom/google/android/gms/internal/ads/zzbb;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzbb;->zzk()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_5

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()Lcom/google/android/gms/internal/ads/zzbb;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzbb;->zzi()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    goto/16 :goto_1

    .line 36
    .line 37
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()Lcom/google/android/gms/internal/ads/zzbb;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzbb;->zzq()Lcom/google/android/gms/internal/ads/zzbf;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbf;->zzg()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()Lcom/google/android/gms/internal/ads/zzbb;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzbb;->zzr()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzbf;->zzf(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()Lcom/google/android/gms/internal/ads/zzbb;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()Lcom/google/android/gms/internal/ads/zzbb;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()Lcom/google/android/gms/internal/ads/zzbb;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()Lcom/google/android/gms/internal/ads/zzbb;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/zzbb;->zzy()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzbb;->zzz()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzbb;->zzv()J

    .line 90
    .line 91
    .line 92
    move-result-wide v8

    .line 93
    invoke-interface {v7}, Lcom/google/android/gms/internal/ads/zzbb;->zzu()J

    .line 94
    .line 95
    .line 96
    move-result-wide v6

    .line 97
    sub-long v6, v8, v6

    .line 98
    .line 99
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()Lcom/google/android/gms/internal/ads/zzbb;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    const-wide/16 v11, 0x0

    .line 104
    .line 105
    invoke-static {v11, v12, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 106
    .line 107
    .line 108
    move-result-wide v6

    .line 109
    invoke-interface {v10}, Lcom/google/android/gms/internal/ads/zzbb;->zzw()J

    .line 110
    .line 111
    .line 112
    move-result-wide v13

    .line 113
    sub-long/2addr v13, v6

    .line 114
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->max(JJ)J

    .line 115
    .line 116
    .line 117
    move-result-wide v6

    .line 118
    if-eqz v2, :cond_2

    .line 119
    .line 120
    const/4 v10, -0x1

    .line 121
    if-ne v4, v10, :cond_2

    .line 122
    .line 123
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzf()Lcom/google/android/gms/internal/ads/zzbd;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-virtual {v1, v2, v4}, Lcom/google/android/gms/internal/ads/zzbf;->zzo(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzbd;)Lcom/google/android/gms/internal/ads/zzbd;

    .line 128
    .line 129
    .line 130
    invoke-static {v11, v12}, Lcom/google/android/gms/internal/ads/zzfm;->zzs(J)J

    .line 131
    .line 132
    .line 133
    move-result-wide v11

    .line 134
    sub-long/2addr v8, v11

    .line 135
    move v4, v10

    .line 136
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 137
    .line 138
    .line 139
    move-result-wide v10

    .line 140
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzey;->zzh:Z

    .line 141
    .line 142
    if-eqz v1, :cond_4

    .line 143
    .line 144
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzey;->zzc:Ljava/lang/Object;

    .line 145
    .line 146
    invoke-static {v2, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eqz v1, :cond_4

    .line 151
    .line 152
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzey;->zzd:I

    .line 153
    .line 154
    if-ne v4, v1, :cond_4

    .line 155
    .line 156
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzey;->zze:I

    .line 157
    .line 158
    if-ne v5, v1, :cond_4

    .line 159
    .line 160
    iget-wide v12, p0, Lcom/google/android/gms/internal/ads/zzey;->zzf:J

    .line 161
    .line 162
    cmp-long v1, v8, v12

    .line 163
    .line 164
    if-nez v1, :cond_4

    .line 165
    .line 166
    iget-wide v12, p0, Lcom/google/android/gms/internal/ads/zzey;->zzg:J

    .line 167
    .line 168
    cmp-long v1, v6, v12

    .line 169
    .line 170
    if-nez v1, :cond_4

    .line 171
    .line 172
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzey;->zzi:J

    .line 173
    .line 174
    sub-long/2addr v10, v1

    .line 175
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzey;->zzb:I

    .line 176
    .line 177
    int-to-long v4, v1

    .line 178
    cmp-long v2, v10, v4

    .line 179
    .line 180
    if-ltz v2, :cond_3

    .line 181
    .line 182
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zze()Lcom/google/android/gms/internal/ads/zzex;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    new-instance v2, Lcom/google/android/gms/internal/ads/zzfe;

    .line 187
    .line 188
    invoke-direct {v2, v3, v1}, Lcom/google/android/gms/internal/ads/zzfe;-><init>(II)V

    .line 189
    .line 190
    .line 191
    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/zzex;->zza(Lcom/google/android/gms/internal/ads/zzfe;)V

    .line 192
    .line 193
    .line 194
    :cond_3
    return-void

    .line 195
    :cond_4
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzey;->zzh:Z

    .line 196
    .line 197
    iput-wide v10, p0, Lcom/google/android/gms/internal/ads/zzey;->zzi:J

    .line 198
    .line 199
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzey;->zzc:Ljava/lang/Object;

    .line 200
    .line 201
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzey;->zzd:I

    .line 202
    .line 203
    iput v5, p0, Lcom/google/android/gms/internal/ads/zzey;->zze:I

    .line 204
    .line 205
    iput-wide v8, p0, Lcom/google/android/gms/internal/ads/zzey;->zzf:J

    .line 206
    .line 207
    iput-wide v6, p0, Lcom/google/android/gms/internal/ads/zzey;->zzg:J

    .line 208
    .line 209
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzg()Lcom/google/android/gms/internal/ads/zzea;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/zzea;->zzk(I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzg()Lcom/google/android/gms/internal/ads/zzea;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzey;->zzb:I

    .line 221
    .line 222
    invoke-interface {v0, v3, v1}, Lcom/google/android/gms/internal/ads/zzea;->zzi(II)Z

    .line 223
    .line 224
    .line 225
    return-void

    .line 226
    :cond_5
    :goto_1
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzey;->zzh:Z

    .line 227
    .line 228
    if-eqz v1, :cond_6

    .line 229
    .line 230
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzg()Lcom/google/android/gms/internal/ads/zzea;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/ads/zzea;->zzk(I)V

    .line 235
    .line 236
    .line 237
    :cond_6
    const/4 v0, 0x0

    .line 238
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzey;->zzh:Z

    .line 239
    .line 240
    return-void
.end method
