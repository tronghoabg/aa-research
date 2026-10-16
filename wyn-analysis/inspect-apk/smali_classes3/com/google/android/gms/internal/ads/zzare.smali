.class final Lcom/google/android/gms/internal/ads/zzare;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzafl;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzfj;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzc:I


# direct methods
.method public constructor <init>(ILcom/google/android/gms/internal/ads/zzfj;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzare;->zzc:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzare;->zza:Lcom/google/android/gms/internal/ads/zzfj;

    .line 7
    .line 8
    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    .line 9
    .line 10
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzare;->zzb:Lcom/google/android/gms/internal/ads/zzeu;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzagb;J)Lcom/google/android/gms/internal/ads/zzafk;
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzo()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    sub-long/2addr v3, v1

    .line 12
    const-wide/32 v5, 0x1b8a0

    .line 13
    .line 14
    .line 15
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    long-to-int v3, v3

    .line 20
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzare;->zzb:Lcom/google/android/gms/internal/ads/zzeu;

    .line 21
    .line 22
    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    const/4 v6, 0x0

    .line 30
    move-object/from16 v7, p1

    .line 31
    .line 32
    invoke-interface {v7, v5, v6, v3}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    const-wide/16 v7, -0x1

    .line 45
    .line 46
    move-wide v11, v5

    .line 47
    move-wide v9, v7

    .line 48
    :goto_0
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 49
    .line 50
    .line 51
    move-result v13

    .line 52
    const/16 v14, 0xbc

    .line 53
    .line 54
    if-lt v13, v14, :cond_5

    .line 55
    .line 56
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 57
    .line 58
    .line 59
    move-result-object v13

    .line 60
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 61
    .line 62
    .line 63
    move-result v14

    .line 64
    invoke-static {v13, v14, v3}, Lcom/google/android/gms/internal/ads/zzarq;->zza([BII)I

    .line 65
    .line 66
    .line 67
    move-result v13

    .line 68
    add-int/lit16 v14, v13, 0xbc

    .line 69
    .line 70
    if-le v14, v3, :cond_0

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_0
    iget v7, v0, Lcom/google/android/gms/internal/ads/zzare;->zzc:I

    .line 74
    .line 75
    invoke-static {v4, v13, v7}, Lcom/google/android/gms/internal/ads/zzarq;->zzb(Lcom/google/android/gms/internal/ads/zzeu;II)J

    .line 76
    .line 77
    .line 78
    move-result-wide v7

    .line 79
    cmp-long v15, v7, v5

    .line 80
    .line 81
    if-eqz v15, :cond_4

    .line 82
    .line 83
    iget-object v15, v0, Lcom/google/android/gms/internal/ads/zzare;->zza:Lcom/google/android/gms/internal/ads/zzfj;

    .line 84
    .line 85
    invoke-virtual {v15, v7, v8}, Lcom/google/android/gms/internal/ads/zzfj;->zze(J)J

    .line 86
    .line 87
    .line 88
    move-result-wide v7

    .line 89
    cmp-long v15, v7, p2

    .line 90
    .line 91
    if-lez v15, :cond_2

    .line 92
    .line 93
    cmp-long v3, v11, v5

    .line 94
    .line 95
    if-nez v3, :cond_1

    .line 96
    .line 97
    invoke-static {v7, v8, v1, v2}, Lcom/google/android/gms/internal/ads/zzafk;->zza(JJ)Lcom/google/android/gms/internal/ads/zzafk;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    return-object v1

    .line 102
    :cond_1
    add-long/2addr v1, v9

    .line 103
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzafk;->zzc(J)Lcom/google/android/gms/internal/ads/zzafk;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    return-object v1

    .line 108
    :cond_2
    int-to-long v9, v13

    .line 109
    const-wide/32 v11, 0x186a0

    .line 110
    .line 111
    .line 112
    add-long/2addr v11, v7

    .line 113
    cmp-long v11, v11, p2

    .line 114
    .line 115
    if-lez v11, :cond_3

    .line 116
    .line 117
    add-long/2addr v1, v9

    .line 118
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzafk;->zzc(J)Lcom/google/android/gms/internal/ads/zzafk;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    return-object v1

    .line 123
    :cond_3
    move-wide v11, v7

    .line 124
    :cond_4
    invoke-virtual {v4, v14}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 125
    .line 126
    .line 127
    int-to-long v7, v14

    .line 128
    goto :goto_0

    .line 129
    :cond_5
    :goto_1
    cmp-long v3, v11, v5

    .line 130
    .line 131
    if-eqz v3, :cond_6

    .line 132
    .line 133
    add-long/2addr v1, v7

    .line 134
    invoke-static {v11, v12, v1, v2}, Lcom/google/android/gms/internal/ads/zzafk;->zzb(JJ)Lcom/google/android/gms/internal/ads/zzafk;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    return-object v1

    .line 139
    :cond_6
    sget-object v1, Lcom/google/android/gms/internal/ads/zzafk;->zza:Lcom/google/android/gms/internal/ads/zzafk;

    .line 140
    .line 141
    return-object v1
.end method

.method public final zzb()V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfm;->zzb:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzare;->zzb:Lcom/google/android/gms/internal/ads/zzeu;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzb([BI)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
