.class final Lcom/google/android/gms/internal/ads/zzfa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzfd;

.field private final zzb:I

.field private zzc:Ljava/lang/Object;

.field private zzd:I

.field private zze:I

.field private zzf:J

.field private zzg:Z

.field private zzh:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzfd;I)V
    .locals 0

    .line 1
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfa;->zza:Lcom/google/android/gms/internal/ads/zzfd;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzfa;->zzb:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfa;->zza:Lcom/google/android/gms/internal/ads/zzfd;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()Lcom/google/android/gms/internal/ads/zzbb;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzbb;->zza()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x2

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzfa;->zzg:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzg()Lcom/google/android/gms/internal/ads/zzea;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/zzea;->zzk(I)V

    .line 23
    .line 24
    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzfa;->zzg:Z

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()Lcom/google/android/gms/internal/ads/zzbb;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzbb;->zzq()Lcom/google/android/gms/internal/ads/zzbf;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbf;->zzg()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()Lcom/google/android/gms/internal/ads/zzbb;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzbb;->zzr()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzbf;->zzf(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()Lcom/google/android/gms/internal/ads/zzbb;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()Lcom/google/android/gms/internal/ads/zzbb;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzd()Lcom/google/android/gms/internal/ads/zzbb;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/zzbb;->zzy()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzbb;->zzz()I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzbb;->zzu()J

    .line 78
    .line 79
    .line 80
    move-result-wide v6

    .line 81
    if-eqz v3, :cond_3

    .line 82
    .line 83
    const/4 v8, -0x1

    .line 84
    if-ne v4, v8, :cond_3

    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzf()Lcom/google/android/gms/internal/ads/zzbd;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzbf;->zzo(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzbd;)Lcom/google/android/gms/internal/ads/zzbd;

    .line 91
    .line 92
    .line 93
    const-wide/16 v9, 0x0

    .line 94
    .line 95
    invoke-static {v9, v10}, Lcom/google/android/gms/internal/ads/zzfm;->zzs(J)J

    .line 96
    .line 97
    .line 98
    move-result-wide v9

    .line 99
    sub-long/2addr v6, v9

    .line 100
    move v4, v8

    .line 101
    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 102
    .line 103
    .line 104
    move-result-wide v8

    .line 105
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzfa;->zzg:Z

    .line 106
    .line 107
    if-eqz v1, :cond_5

    .line 108
    .line 109
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfa;->zzc:Ljava/lang/Object;

    .line 110
    .line 111
    invoke-static {v3, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_5

    .line 116
    .line 117
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzfa;->zzd:I

    .line 118
    .line 119
    if-ne v4, v1, :cond_5

    .line 120
    .line 121
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzfa;->zze:I

    .line 122
    .line 123
    if-ne v5, v1, :cond_5

    .line 124
    .line 125
    iget-wide v10, p0, Lcom/google/android/gms/internal/ads/zzfa;->zzf:J

    .line 126
    .line 127
    cmp-long v1, v6, v10

    .line 128
    .line 129
    if-nez v1, :cond_5

    .line 130
    .line 131
    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzfa;->zzh:J

    .line 132
    .line 133
    sub-long/2addr v8, v3

    .line 134
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzfa;->zzb:I

    .line 135
    .line 136
    int-to-long v3, v1

    .line 137
    cmp-long v3, v8, v3

    .line 138
    .line 139
    if-ltz v3, :cond_4

    .line 140
    .line 141
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zze()Lcom/google/android/gms/internal/ads/zzex;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    new-instance v3, Lcom/google/android/gms/internal/ads/zzfe;

    .line 146
    .line 147
    invoke-direct {v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzfe;-><init>(II)V

    .line 148
    .line 149
    .line 150
    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/ads/zzex;->zza(Lcom/google/android/gms/internal/ads/zzfe;)V

    .line 151
    .line 152
    .line 153
    :cond_4
    return-void

    .line 154
    :cond_5
    const/4 v1, 0x1

    .line 155
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzfa;->zzg:Z

    .line 156
    .line 157
    iput-wide v8, p0, Lcom/google/android/gms/internal/ads/zzfa;->zzh:J

    .line 158
    .line 159
    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zzfa;->zzc:Ljava/lang/Object;

    .line 160
    .line 161
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzfa;->zzd:I

    .line 162
    .line 163
    iput v5, p0, Lcom/google/android/gms/internal/ads/zzfa;->zze:I

    .line 164
    .line 165
    iput-wide v6, p0, Lcom/google/android/gms/internal/ads/zzfa;->zzf:J

    .line 166
    .line 167
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzg()Lcom/google/android/gms/internal/ads/zzea;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzea;->zzk(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfd;->zzg()Lcom/google/android/gms/internal/ads/zzea;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzfa;->zzb:I

    .line 179
    .line 180
    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzea;->zzi(II)Z

    .line 181
    .line 182
    .line 183
    return-void
.end method
