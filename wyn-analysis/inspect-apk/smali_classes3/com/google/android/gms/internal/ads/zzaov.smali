.class final Lcom/google/android/gms/internal/ads/zzaov;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zza:Ljava/lang/String;

.field private zzb:I

.field private zzc:Z

.field private zzd:I

.field private zze:Z

.field private zzf:I

.field private zzg:I

.field private zzh:I

.field private zzi:I

.field private zzj:I

.field private zzk:F

.field private zzl:Ljava/lang/String;

.field private zzm:I

.field private zzn:I

.field private zzo:Landroid/text/Layout$Alignment;

.field private zzp:Landroid/text/Layout$Alignment;

.field private zzq:I

.field private zzr:Lcom/google/android/gms/internal/ads/zzaoo;

.field private zzs:F

.field private zzt:Ljava/lang/String;

.field private zzu:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzf:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzg:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzh:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzi:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzj:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzm:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzn:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzq:I

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzs:F

    return-void
.end method


# virtual methods
.method public final zzA()Landroid/text/Layout$Alignment;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzp:Landroid/text/Layout$Alignment;

    return-object v0
.end method

.method public final zzB(Landroid/text/Layout$Alignment;)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzp:Landroid/text/Layout$Alignment;

    return-object p0
.end method

.method public final zzC()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzq:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzD(Z)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzq:I

    return-object p0
.end method

.method public final zzE()Lcom/google/android/gms/internal/ads/zzaoo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzr:Lcom/google/android/gms/internal/ads/zzaoo;

    return-object v0
.end method

.method public final zzF(Lcom/google/android/gms/internal/ads/zzaoo;)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzr:Lcom/google/android/gms/internal/ads/zzaoo;

    return-object p0
.end method

.method public final zzG(F)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzk:F

    return-object p0
.end method

.method public final zzH(I)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzj:I

    return-object p0
.end method

.method public final zzI()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzj:I

    return v0
.end method

.method public final zzJ()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzk:F

    return v0
.end method

.method public final zzK(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzt:Ljava/lang/String;

    return-object p0
.end method

.method public final zzL()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzt:Ljava/lang/String;

    return-object v0
.end method

.method public final zzM(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzu:Ljava/lang/String;

    return-object p0
.end method

.method public final zzN()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzu:Ljava/lang/String;

    return-object v0
.end method

.method public final zza()I
    .locals 4

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzh:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzi:I

    if-ne v2, v1, :cond_0

    return v1

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzi:I

    if-ne v3, v2, :cond_2

    const/4 v1, 0x2

    :cond_2
    or-int/2addr v0, v1

    return v0
.end method

.method public final zzb()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzf:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzc(Z)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzf:I

    return-object p0
.end method

.method public final zzd()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzg:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zze(Z)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzg:I

    return-object p0
.end method

.method public final zzf(Z)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzh:I

    return-object p0
.end method

.method public final zzg(Z)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzi:I

    return-object p0
.end method

.method public final zzh()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zza:Ljava/lang/String;

    return-object v0
.end method

.method public final zzi(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zza:Ljava/lang/String;

    return-object p0
.end method

.method public final zzj()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzc:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzb:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v1, "Font color has not been defined."

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v0
.end method

.method public final zzk(I)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzb:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzc:Z

    return-object p0
.end method

.method public final zzl()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzc:Z

    return v0
.end method

.method public final zzm()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zze:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzd:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v1, "Background color has not been defined."

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v0
.end method

.method public final zzn(I)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzd:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zze:Z

    return-object p0
.end method

.method public final zzo()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zze:Z

    return v0
.end method

.method public final zzp(F)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzs:F

    return-object p0
.end method

.method public final zzq()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzs:F

    return v0
.end method

.method public final zzr(Lcom/google/android/gms/internal/ads/zzaov;)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 3

    .line 1
    if-eqz p1, :cond_10

    .line 2
    .line 3
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzc:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/zzaov;->zzc:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzaov;->zzb:I

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzaov;->zzk(I)Lcom/google/android/gms/internal/ads/zzaov;

    .line 14
    .line 15
    .line 16
    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzh:I

    .line 17
    .line 18
    const/4 v1, -0x1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzaov;->zzh:I

    .line 22
    .line 23
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzh:I

    .line 24
    .line 25
    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzi:I

    .line 26
    .line 27
    if-ne v0, v1, :cond_2

    .line 28
    .line 29
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzaov;->zzi:I

    .line 30
    .line 31
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzi:I

    .line 32
    .line 33
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zza:Ljava/lang/String;

    .line 34
    .line 35
    if-nez v0, :cond_3

    .line 36
    .line 37
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzaov;->zza:Ljava/lang/String;

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zza:Ljava/lang/String;

    .line 42
    .line 43
    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzf:I

    .line 44
    .line 45
    if-ne v0, v1, :cond_4

    .line 46
    .line 47
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzaov;->zzf:I

    .line 48
    .line 49
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzf:I

    .line 50
    .line 51
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzg:I

    .line 52
    .line 53
    if-ne v0, v1, :cond_5

    .line 54
    .line 55
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzaov;->zzg:I

    .line 56
    .line 57
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzg:I

    .line 58
    .line 59
    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzn:I

    .line 60
    .line 61
    if-ne v0, v1, :cond_6

    .line 62
    .line 63
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzaov;->zzn:I

    .line 64
    .line 65
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzn:I

    .line 66
    .line 67
    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzo:Landroid/text/Layout$Alignment;

    .line 68
    .line 69
    if-nez v0, :cond_7

    .line 70
    .line 71
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzaov;->zzo:Landroid/text/Layout$Alignment;

    .line 72
    .line 73
    if-eqz v0, :cond_7

    .line 74
    .line 75
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzo:Landroid/text/Layout$Alignment;

    .line 76
    .line 77
    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzp:Landroid/text/Layout$Alignment;

    .line 78
    .line 79
    if-nez v0, :cond_8

    .line 80
    .line 81
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzaov;->zzp:Landroid/text/Layout$Alignment;

    .line 82
    .line 83
    if-eqz v0, :cond_8

    .line 84
    .line 85
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzp:Landroid/text/Layout$Alignment;

    .line 86
    .line 87
    :cond_8
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzq:I

    .line 88
    .line 89
    if-ne v0, v1, :cond_9

    .line 90
    .line 91
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzaov;->zzq:I

    .line 92
    .line 93
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzq:I

    .line 94
    .line 95
    :cond_9
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzj:I

    .line 96
    .line 97
    if-ne v0, v1, :cond_a

    .line 98
    .line 99
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzaov;->zzj:I

    .line 100
    .line 101
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzj:I

    .line 102
    .line 103
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzaov;->zzk:F

    .line 104
    .line 105
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzk:F

    .line 106
    .line 107
    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzr:Lcom/google/android/gms/internal/ads/zzaoo;

    .line 108
    .line 109
    if-nez v0, :cond_b

    .line 110
    .line 111
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzaov;->zzr:Lcom/google/android/gms/internal/ads/zzaoo;

    .line 112
    .line 113
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzr:Lcom/google/android/gms/internal/ads/zzaoo;

    .line 114
    .line 115
    :cond_b
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzs:F

    .line 116
    .line 117
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 118
    .line 119
    .line 120
    cmpl-float v0, v0, v2

    .line 121
    .line 122
    if-nez v0, :cond_c

    .line 123
    .line 124
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzaov;->zzs:F

    .line 125
    .line 126
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzs:F

    .line 127
    .line 128
    :cond_c
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzt:Ljava/lang/String;

    .line 129
    .line 130
    if-nez v0, :cond_d

    .line 131
    .line 132
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzaov;->zzt:Ljava/lang/String;

    .line 133
    .line 134
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzt:Ljava/lang/String;

    .line 135
    .line 136
    :cond_d
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzu:Ljava/lang/String;

    .line 137
    .line 138
    if-nez v0, :cond_e

    .line 139
    .line 140
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzaov;->zzu:Ljava/lang/String;

    .line 141
    .line 142
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzu:Ljava/lang/String;

    .line 143
    .line 144
    :cond_e
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zze:Z

    .line 145
    .line 146
    if-nez v0, :cond_f

    .line 147
    .line 148
    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/zzaov;->zze:Z

    .line 149
    .line 150
    if-eqz v0, :cond_f

    .line 151
    .line 152
    iget v0, p1, Lcom/google/android/gms/internal/ads/zzaov;->zzd:I

    .line 153
    .line 154
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzaov;->zzn(I)Lcom/google/android/gms/internal/ads/zzaov;

    .line 155
    .line 156
    .line 157
    :cond_f
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzm:I

    .line 158
    .line 159
    if-ne v0, v1, :cond_10

    .line 160
    .line 161
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzaov;->zzm:I

    .line 162
    .line 163
    if-eq p1, v1, :cond_10

    .line 164
    .line 165
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzm:I

    .line 166
    .line 167
    :cond_10
    return-object p0
.end method

.method public final zzs(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzl:Ljava/lang/String;

    return-object p0
.end method

.method public final zzt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzl:Ljava/lang/String;

    return-object v0
.end method

.method public final zzu(I)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzm:I

    return-object p0
.end method

.method public final zzv()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzm:I

    return v0
.end method

.method public final zzw(I)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzn:I

    return-object p0
.end method

.method public final zzx()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzn:I

    return v0
.end method

.method public final zzy()Landroid/text/Layout$Alignment;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzo:Landroid/text/Layout$Alignment;

    return-object v0
.end method

.method public final zzz(Landroid/text/Layout$Alignment;)Lcom/google/android/gms/internal/ads/zzaov;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaov;->zzo:Landroid/text/Layout$Alignment;

    return-object p0
.end method
