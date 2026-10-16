.class public final Lcom/google/android/gms/internal/ads/zzadw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzadv;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzaed;

.field private zzc:Z

.field private zzd:I

.field private zze:J

.field private zzf:J

.field private zzg:J

.field private zzh:J

.field private zzi:Z

.field private zzj:F

.field private zzk:Lcom/google/android/gms/internal/ads/zzdp;

.field private zzl:Z

.field private zzm:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzadv;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzadw;->zza:Lcom/google/android/gms/internal/ads/zzadv;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzaed;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/zzaed;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzb:Lcom/google/android/gms/internal/ads/zzaed;

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzd:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzadw;->zze:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzg:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzh:J

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzj:F

    sget-object p1, Lcom/google/android/gms/internal/ads/zzdp;->zza:Lcom/google/android/gms/internal/ads/zzdp;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzk:Lcom/google/android/gms/internal/ads/zzdp;

    return-void
.end method

.method private final zzo(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzd:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzd:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final zza(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x2

    .line 7
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzadw;->zzo(I)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzd:I

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzd:I

    .line 16
    .line 17
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzb:Lcom/google/android/gms/internal/ads/zzaed;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzaed;->zzd()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final zzb()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzc:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzk:Lcom/google/android/gms/internal/ads/zzdp;

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzdp;->zzb()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfm;->zzt(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzf:J

    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzb:Lcom/google/android/gms/internal/ads/zzaed;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaed;->zzb()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final zzc()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzc:Z

    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzh:J

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzb:Lcom/google/android/gms/internal/ads/zzaed;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaed;->zzh()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final zzd(Landroid/view/Surface;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move v2, v1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v2, v0

    .line 8
    :goto_0
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzl:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzm:Z

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzb:Lcom/google/android/gms/internal/ads/zzaed;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzaed;->zzc(Landroid/view/Surface;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzadw;->zzo(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final zze(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzb:Lcom/google/android/gms/internal/ads/zzaed;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzaed;->zzf(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzf()Z
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzd:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzd:I

    .line 5
    .line 6
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzk:Lcom/google/android/gms/internal/ads/zzdp;

    .line 7
    .line 8
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzdp;->zzb()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzfm;->zzt(J)J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzf:J

    .line 17
    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    return v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0
.end method

.method public final zzg(Lcom/google/android/gms/internal/ads/zzdp;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzk:Lcom/google/android/gms/internal/ads/zzdp;

    return-void
.end method

.method public final zzh()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzd:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzd:I

    :cond_0
    return-void
.end method

.method public final zzi(Z)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzd:I

    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    if-eq p1, v3, :cond_0

    .line 13
    .line 14
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzm:Z

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzl:Z

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzh:J

    .line 24
    .line 25
    return v0

    .line 26
    :cond_1
    :goto_0
    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzh:J

    .line 27
    .line 28
    cmp-long p1, v3, v1

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    return v3

    .line 34
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzk:Lcom/google/android/gms/internal/ads/zzdp;

    .line 35
    .line 36
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzdp;->zzb()J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    iget-wide v6, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzh:J

    .line 41
    .line 42
    cmp-long p1, v4, v6

    .line 43
    .line 44
    if-gez p1, :cond_3

    .line 45
    .line 46
    return v0

    .line 47
    :cond_3
    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzh:J

    .line 48
    .line 49
    return v3
.end method

.method public final zzj(Z)V
    .locals 2

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzi:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzh:J

    return-void
.end method

.method public final zzk(JJJJZZLcom/google/android/gms/internal/ads/zzadu;)I
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzjm;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v10, p11

    .line 8
    .line 9
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzadu;->zzc()V

    .line 10
    .line 11
    .line 12
    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzc:Z

    .line 13
    .line 14
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/zzadw;->zze:J

    .line 22
    .line 23
    cmp-long v3, v8, v6

    .line 24
    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    iput-wide v4, v0, Lcom/google/android/gms/internal/ads/zzadw;->zze:J

    .line 28
    .line 29
    :cond_0
    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzg:J

    .line 30
    .line 31
    cmp-long v3, v8, v1

    .line 32
    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzb:Lcom/google/android/gms/internal/ads/zzaed;

    .line 36
    .line 37
    invoke-virtual {v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzaed;->zzg(J)V

    .line 38
    .line 39
    .line 40
    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzg:J

    .line 41
    .line 42
    :cond_1
    sub-long v8, v1, v4

    .line 43
    .line 44
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzj:F

    .line 45
    .line 46
    float-to-double v11, v3

    .line 47
    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzc:Z

    .line 48
    .line 49
    long-to-double v8, v8

    .line 50
    div-double/2addr v8, v11

    .line 51
    double-to-long v8, v8

    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzk:Lcom/google/android/gms/internal/ads/zzdp;

    .line 55
    .line 56
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzdp;->zzb()J

    .line 57
    .line 58
    .line 59
    move-result-wide v11

    .line 60
    invoke-static {v11, v12}, Lcom/google/android/gms/internal/ads/zzfm;->zzt(J)J

    .line 61
    .line 62
    .line 63
    move-result-wide v11

    .line 64
    sub-long v11, v11, p5

    .line 65
    .line 66
    sub-long/2addr v8, v11

    .line 67
    :cond_2
    invoke-virtual {v10, v8, v9}, Lcom/google/android/gms/internal/ads/zzadu;->zze(J)V

    .line 68
    .line 69
    .line 70
    const/4 v11, 0x3

    .line 71
    if-eqz p9, :cond_4

    .line 72
    .line 73
    if-eqz p10, :cond_3

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    return v11

    .line 77
    :cond_4
    :goto_0
    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzl:Z

    .line 78
    .line 79
    const/4 v12, 0x4

    .line 80
    const/4 v13, 0x5

    .line 81
    const/4 v14, 0x1

    .line 82
    if-nez v3, :cond_7

    .line 83
    .line 84
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzadw;->zza:Lcom/google/android/gms/internal/ads/zzadv;

    .line 85
    .line 86
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzadu;->zzd()J

    .line 87
    .line 88
    .line 89
    move-result-wide v2

    .line 90
    const/4 v9, 0x1

    .line 91
    move-wide/from16 v6, p5

    .line 92
    .line 93
    move/from16 v8, p10

    .line 94
    .line 95
    invoke-interface/range {v1 .. v9}, Lcom/google/android/gms/internal/ads/zzadv;->zzar(JJJZZ)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_5

    .line 100
    .line 101
    return v12

    .line 102
    :cond_5
    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzc:Z

    .line 103
    .line 104
    if-eqz v1, :cond_6

    .line 105
    .line 106
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzadu;->zzd()J

    .line 107
    .line 108
    .line 109
    move-result-wide v1

    .line 110
    const-wide/16 v3, 0x7530

    .line 111
    .line 112
    cmp-long v1, v1, v3

    .line 113
    .line 114
    if-gez v1, :cond_6

    .line 115
    .line 116
    return v11

    .line 117
    :cond_6
    iput-boolean v14, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzm:Z

    .line 118
    .line 119
    return v13

    .line 120
    :cond_7
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzadu;->zzd()J

    .line 121
    .line 122
    .line 123
    move-result-wide v3

    .line 124
    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzh:J

    .line 125
    .line 126
    cmp-long v5, v8, v6

    .line 127
    .line 128
    const-wide/16 v15, -0x7530

    .line 129
    .line 130
    const/4 v8, 0x2

    .line 131
    const/4 v9, 0x0

    .line 132
    if-eqz v5, :cond_8

    .line 133
    .line 134
    iget-boolean v5, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzi:Z

    .line 135
    .line 136
    if-nez v5, :cond_8

    .line 137
    .line 138
    move-wide/from16 v19, v6

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_8
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzd:I

    .line 142
    .line 143
    if-eqz v5, :cond_b

    .line 144
    .line 145
    if-eq v5, v14, :cond_c

    .line 146
    .line 147
    if-eq v5, v8, :cond_a

    .line 148
    .line 149
    if-ne v5, v11, :cond_9

    .line 150
    .line 151
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzk:Lcom/google/android/gms/internal/ads/zzdp;

    .line 152
    .line 153
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzdp;->zzb()J

    .line 154
    .line 155
    .line 156
    move-result-wide v17

    .line 157
    invoke-static/range {v17 .. v18}, Lcom/google/android/gms/internal/ads/zzfm;->zzt(J)J

    .line 158
    .line 159
    .line 160
    move-result-wide v17

    .line 161
    move-wide/from16 v19, v6

    .line 162
    .line 163
    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzf:J

    .line 164
    .line 165
    sub-long v17, v17, v6

    .line 166
    .line 167
    iget-boolean v5, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzc:Z

    .line 168
    .line 169
    if-eqz v5, :cond_d

    .line 170
    .line 171
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzadw;->zze:J

    .line 172
    .line 173
    cmp-long v7, v5, v19

    .line 174
    .line 175
    if-eqz v7, :cond_d

    .line 176
    .line 177
    cmp-long v5, v5, p3

    .line 178
    .line 179
    if-eqz v5, :cond_d

    .line 180
    .line 181
    cmp-long v3, v3, v15

    .line 182
    .line 183
    if-gez v3, :cond_d

    .line 184
    .line 185
    const-wide/32 v3, 0x186a0

    .line 186
    .line 187
    .line 188
    cmp-long v3, v17, v3

    .line 189
    .line 190
    if-lez v3, :cond_d

    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 194
    .line 195
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 196
    .line 197
    .line 198
    throw v1

    .line 199
    :cond_a
    move-wide/from16 v19, v6

    .line 200
    .line 201
    cmp-long v3, p3, p7

    .line 202
    .line 203
    if-ltz v3, :cond_d

    .line 204
    .line 205
    goto :goto_1

    .line 206
    :cond_b
    move-wide/from16 v19, v6

    .line 207
    .line 208
    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzc:Z

    .line 209
    .line 210
    if-eqz v3, :cond_d

    .line 211
    .line 212
    :cond_c
    :goto_1
    return v9

    .line 213
    :cond_d
    :goto_2
    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzc:Z

    .line 214
    .line 215
    if-eqz v3, :cond_14

    .line 216
    .line 217
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzadw;->zze:J

    .line 218
    .line 219
    cmp-long v3, p3, v3

    .line 220
    .line 221
    if-nez v3, :cond_e

    .line 222
    .line 223
    goto :goto_3

    .line 224
    :cond_e
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzk:Lcom/google/android/gms/internal/ads/zzdp;

    .line 225
    .line 226
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzdp;->zzc()J

    .line 227
    .line 228
    .line 229
    move-result-wide v3

    .line 230
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzb:Lcom/google/android/gms/internal/ads/zzaed;

    .line 231
    .line 232
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzadu;->zzd()J

    .line 233
    .line 234
    .line 235
    move-result-wide v6

    .line 236
    const-wide/16 v17, 0x3e8

    .line 237
    .line 238
    mul-long v6, v6, v17

    .line 239
    .line 240
    add-long/2addr v6, v3

    .line 241
    invoke-virtual {v5, v6, v7, v1, v2}, Lcom/google/android/gms/internal/ads/zzaed;->zzi(JJ)J

    .line 242
    .line 243
    .line 244
    move-result-wide v1

    .line 245
    invoke-virtual {v10, v1, v2}, Lcom/google/android/gms/internal/ads/zzadu;->zzg(J)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzadu;->zzf()J

    .line 249
    .line 250
    .line 251
    move-result-wide v1

    .line 252
    sub-long/2addr v1, v3

    .line 253
    div-long v1, v1, v17

    .line 254
    .line 255
    invoke-virtual {v10, v1, v2}, Lcom/google/android/gms/internal/ads/zzadu;->zze(J)V

    .line 256
    .line 257
    .line 258
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzh:J

    .line 259
    .line 260
    cmp-long v1, v1, v19

    .line 261
    .line 262
    if-eqz v1, :cond_f

    .line 263
    .line 264
    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzadw;->zzi:Z

    .line 265
    .line 266
    if-nez v1, :cond_f

    .line 267
    .line 268
    move v9, v14

    .line 269
    :cond_f
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzadw;->zza:Lcom/google/android/gms/internal/ads/zzadv;

    .line 270
    .line 271
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzadu;->zzd()J

    .line 272
    .line 273
    .line 274
    move-result-wide v2

    .line 275
    move-wide/from16 v4, p3

    .line 276
    .line 277
    move-wide/from16 v6, p5

    .line 278
    .line 279
    move/from16 v17, v8

    .line 280
    .line 281
    move/from16 v8, p10

    .line 282
    .line 283
    invoke-interface/range {v1 .. v9}, Lcom/google/android/gms/internal/ads/zzadv;->zzar(JJJZZ)Z

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    if-eqz v1, :cond_10

    .line 288
    .line 289
    return v12

    .line 290
    :cond_10
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzadu;->zzd()J

    .line 291
    .line 292
    .line 293
    move-result-wide v1

    .line 294
    cmp-long v1, v1, v15

    .line 295
    .line 296
    if-gez v1, :cond_12

    .line 297
    .line 298
    if-nez p10, :cond_12

    .line 299
    .line 300
    if-eqz v9, :cond_11

    .line 301
    .line 302
    return v11

    .line 303
    :cond_11
    return v17

    .line 304
    :cond_12
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzadu;->zzd()J

    .line 305
    .line 306
    .line 307
    move-result-wide v1

    .line 308
    const-wide/32 v3, 0xc350

    .line 309
    .line 310
    .line 311
    cmp-long v1, v1, v3

    .line 312
    .line 313
    if-lez v1, :cond_13

    .line 314
    .line 315
    return v13

    .line 316
    :cond_13
    return v14

    .line 317
    :cond_14
    :goto_3
    return v13
.end method

.method public final zzl()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzb:Lcom/google/android/gms/internal/ads/zzaed;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaed;->zzd()V

    .line 4
    .line 5
    .line 6
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzg:J

    .line 12
    .line 13
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zze:J

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/ads/zzadw;->zzo(I)V

    .line 17
    .line 18
    .line 19
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzh:J

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzm:Z

    .line 23
    .line 24
    return-void
.end method

.method public final zzm(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzb:Lcom/google/android/gms/internal/ads/zzaed;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzaed;->zza(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzn(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgtr;->zza(Z)V

    .line 10
    .line 11
    .line 12
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzj:F

    .line 13
    .line 14
    cmpl-float v0, p1, v0

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzj:F

    .line 20
    .line 21
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzadw;->zzb:Lcom/google/android/gms/internal/ads/zzaed;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzaed;->zze(F)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
