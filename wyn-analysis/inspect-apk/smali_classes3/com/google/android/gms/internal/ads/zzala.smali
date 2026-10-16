.class final Lcom/google/android/gms/internal/ads/zzala;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final zza:Lcom/google/android/gms/internal/ads/zzagx;

.field public final zzb:J

.field public final zzc:J

.field public final zzd:Lcom/google/android/gms/internal/ads/zzakw;

.field public final zze:I

.field public final zzf:I

.field public final zzg:[J


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzagx;JJ[JLcom/google/android/gms/internal/ads/zzakw;II)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzagx;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzagx;-><init>(Lcom/google/android/gms/internal/ads/zzagx;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzala;->zza:Lcom/google/android/gms/internal/ads/zzagx;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzala;->zzb:J

    iput-wide p4, p0, Lcom/google/android/gms/internal/ads/zzala;->zzc:J

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzala;->zzg:[J

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzala;->zzd:Lcom/google/android/gms/internal/ads/zzakw;

    iput p8, p0, Lcom/google/android/gms/internal/ads/zzala;->zze:I

    iput p9, p0, Lcom/google/android/gms/internal/ads/zzala;->zzf:I

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzagx;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzala;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    and-int/lit8 v2, v1, 0x1

    .line 8
    .line 9
    const/4 v3, -0x1

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v2, v3

    .line 18
    :goto_0
    and-int/lit8 v4, v1, 0x2

    .line 19
    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzz()J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    :goto_1
    move-wide v10, v4

    .line 27
    goto :goto_2

    .line 28
    :cond_1
    const-wide/16 v4, -0x1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :goto_2
    and-int/lit8 v4, v1, 0x4

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x4

    .line 35
    if-ne v4, v6, :cond_3

    .line 36
    .line 37
    const/16 v4, 0x64

    .line 38
    .line 39
    new-array v7, v4, [J

    .line 40
    .line 41
    const/4 v8, 0x0

    .line 42
    :goto_3
    if-ge v8, v4, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    int-to-long v12, v9

    .line 49
    aput-wide v12, v7, v8

    .line 50
    .line 51
    add-int/lit8 v8, v8, 0x1

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_2
    move-object v12, v7

    .line 55
    goto :goto_4

    .line 56
    :cond_3
    move-object v12, v5

    .line 57
    :goto_4
    and-int/lit8 v1, v1, 0x8

    .line 58
    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 62
    .line 63
    .line 64
    :cond_4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    const/16 v4, 0x18

    .line 69
    .line 70
    if-lt v1, v4, :cond_5

    .line 71
    .line 72
    const/16 v1, 0xb

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    invoke-static {v1, v3, v4}, Lcom/google/android/gms/internal/ads/zzakw;->zzb(FII)Lcom/google/android/gms/internal/ads/zzakw;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    const/4 v1, 0x2

    .line 98
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzx()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    shr-int/lit8 v3, v0, 0xc

    .line 106
    .line 107
    and-int/lit16 v0, v0, 0xfff

    .line 108
    .line 109
    move v15, v0

    .line 110
    move v14, v3

    .line 111
    :goto_5
    move-object v13, v5

    .line 112
    goto :goto_6

    .line 113
    :cond_5
    move v14, v3

    .line 114
    move v15, v14

    .line 115
    goto :goto_5

    .line 116
    :goto_6
    int-to-long v8, v2

    .line 117
    new-instance v6, Lcom/google/android/gms/internal/ads/zzala;

    .line 118
    .line 119
    move-object/from16 v7, p0

    .line 120
    .line 121
    invoke-direct/range {v6 .. v15}, Lcom/google/android/gms/internal/ads/zzala;-><init>(Lcom/google/android/gms/internal/ads/zzagx;JJ[JLcom/google/android/gms/internal/ads/zzakw;II)V

    .line 122
    .line 123
    .line 124
    return-object v6
.end method


# virtual methods
.method public final zzb()J
    .locals 7

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzala;->zzb:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-eqz v4, :cond_1

    .line 8
    .line 9
    const-wide/16 v4, 0x0

    .line 10
    .line 11
    cmp-long v4, v0, v4

    .line 12
    .line 13
    if-nez v4, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzala;->zza:Lcom/google/android/gms/internal/ads/zzagx;

    .line 17
    .line 18
    iget v5, v4, Lcom/google/android/gms/internal/ads/zzagx;->zzg:I

    .line 19
    .line 20
    int-to-long v5, v5

    .line 21
    mul-long/2addr v0, v5

    .line 22
    add-long/2addr v0, v2

    .line 23
    iget v2, v4, Lcom/google/android/gms/internal/ads/zzagx;->zzd:I

    .line 24
    .line 25
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzfm;->zzu(JI)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    return-wide v0

    .line 30
    :cond_1
    :goto_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    return-wide v0
.end method
