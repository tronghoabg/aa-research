.class public final Lcom/google/android/gms/internal/ads/zzgs;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Z


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzgv;Lcom/google/android/gms/internal/ads/zzgu;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzgt;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget v0, p2, Lcom/google/android/gms/internal/ads/zzgu;->zza:I

    .line 5
    .line 6
    const/4 v1, 0x6

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x3

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    if-ne v0, v3, :cond_1

    .line 13
    .line 14
    :cond_0
    move v0, v4

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move v0, v2

    .line 17
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgtr;->zza(Z)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/zzgu;->zzb:Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x4

    .line 27
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    new-array v1, v0, [B

    .line 32
    .line 33
    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzgu;->zzb:Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p2, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    .line 42
    new-instance p2, Lcom/google/android/gms/internal/ads/zzet;

    .line 43
    .line 44
    invoke-direct {p2, v1, v0}, Lcom/google/android/gms/internal/ads/zzet;-><init>([BI)V

    .line 45
    .line 46
    .line 47
    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/zzgv;->zza:Z

    .line 48
    .line 49
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgw;->zzb(Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_2
    const/4 v0, 0x2

    .line 60
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    iget-boolean v6, p1, Lcom/google/android/gms/internal/ads/zzgv;->zzb:Z

    .line 69
    .line 70
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzgw;->zzb(Z)V

    .line 71
    .line 72
    .line 73
    if-nez v5, :cond_4

    .line 74
    .line 75
    :cond_3
    :goto_1
    move v2, v4

    .line 76
    goto :goto_3

    .line 77
    :cond_4
    if-eq v1, v3, :cond_5

    .line 78
    .line 79
    if-nez v1, :cond_6

    .line 80
    .line 81
    :cond_5
    move v5, v4

    .line 82
    goto :goto_2

    .line 83
    :cond_6
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 88
    .line 89
    .line 90
    iget-boolean v6, p1, Lcom/google/android/gms/internal/ads/zzgv;->zzd:Z

    .line 91
    .line 92
    xor-int/2addr v6, v4

    .line 93
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzgw;->zzb(Z)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-eqz v6, :cond_7

    .line 101
    .line 102
    iget-boolean v6, p1, Lcom/google/android/gms/internal/ads/zzgv;->zze:Z

    .line 103
    .line 104
    xor-int/2addr v6, v4

    .line 105
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzgw;->zzb(Z)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 109
    .line 110
    .line 111
    :cond_7
    iget-boolean v6, p1, Lcom/google/android/gms/internal/ads/zzgv;->zzc:Z

    .line 112
    .line 113
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzgw;->zzb(Z)V

    .line 114
    .line 115
    .line 116
    if-eq v1, v3, :cond_8

    .line 117
    .line 118
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 119
    .line 120
    .line 121
    :cond_8
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzgv;->zzf:I

    .line 122
    .line 123
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 124
    .line 125
    .line 126
    if-eq v1, v0, :cond_9

    .line 127
    .line 128
    if-eqz v1, :cond_9

    .line 129
    .line 130
    if-nez v5, :cond_9

    .line 131
    .line 132
    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 133
    .line 134
    .line 135
    :cond_9
    if-eq v1, v3, :cond_3

    .line 136
    .line 137
    if-nez v1, :cond_a

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_a
    const/16 p1, 0x8

    .line 141
    .line 142
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-eqz p1, :cond_b

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_b
    :goto_3
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzgs;->zza:Z

    .line 150
    .line 151
    return-void
.end method

.method public static zzb(Lcom/google/android/gms/internal/ads/zzgv;Lcom/google/android/gms/internal/ads/zzgu;)Lcom/google/android/gms/internal/ads/zzgs;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgs;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzgs;-><init>(Lcom/google/android/gms/internal/ads/zzgv;Lcom/google/android/gms/internal/ads/zzgu;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzgt; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-object v0

    .line 7
    :catch_0
    const/4 p0, 0x0

    .line 8
    return-object p0
.end method


# virtual methods
.method public final zza()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgs;->zza:Z

    return v0
.end method
