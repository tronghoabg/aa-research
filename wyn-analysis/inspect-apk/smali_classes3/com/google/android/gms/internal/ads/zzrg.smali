.class public final Lcom/google/android/gms/internal/ads/zzrg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final zza:I

.field public final zzb:I

.field public final zzc:I

.field public final zzd:Z

.field public final zze:I

.field public final zzf:Lcom/google/android/gms/internal/ads/zzd;

.field public final zzg:I

.field public final zzh:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzrf;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzrf;->zzi()I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzrg;->zza:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzrf;->zzj()I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzrg;->zzb:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzrf;->zzk()I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzrg;->zzc:I

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzrg;->zzd:Z

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzrf;->zzl()I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzrg;->zze:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzrf;->zzm()Lcom/google/android/gms/internal/ads/zzd;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzrg;->zzf:Lcom/google/android/gms/internal/ads/zzd;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzrf;->zzn()I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzrg;->zzg:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzrf;->zzo()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzrg;->zzh:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, Lcom/google/android/gms/internal/ads/zzrg;

    .line 13
    .line 14
    if-eq v3, v2, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzrg;

    .line 18
    .line 19
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzrg;->zza:I

    .line 20
    .line 21
    iget v3, p1, Lcom/google/android/gms/internal/ads/zzrg;->zza:I

    .line 22
    .line 23
    if-ne v2, v3, :cond_2

    .line 24
    .line 25
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzrg;->zzb:I

    .line 26
    .line 27
    iget v3, p1, Lcom/google/android/gms/internal/ads/zzrg;->zzb:I

    .line 28
    .line 29
    if-ne v2, v3, :cond_2

    .line 30
    .line 31
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzrg;->zzc:I

    .line 32
    .line 33
    iget v3, p1, Lcom/google/android/gms/internal/ads/zzrg;->zzc:I

    .line 34
    .line 35
    if-ne v2, v3, :cond_2

    .line 36
    .line 37
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzrg;->zze:I

    .line 38
    .line 39
    iget v3, p1, Lcom/google/android/gms/internal/ads/zzrg;->zze:I

    .line 40
    .line 41
    if-ne v2, v3, :cond_2

    .line 42
    .line 43
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzrg;->zzg:I

    .line 44
    .line 45
    iget v3, p1, Lcom/google/android/gms/internal/ads/zzrg;->zzg:I

    .line 46
    .line 47
    if-ne v2, v3, :cond_2

    .line 48
    .line 49
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzrg;->zzh:I

    .line 50
    .line 51
    iget v3, p1, Lcom/google/android/gms/internal/ads/zzrg;->zzh:I

    .line 52
    .line 53
    if-ne v2, v3, :cond_2

    .line 54
    .line 55
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzrg;->zzf:Lcom/google/android/gms/internal/ads/zzd;

    .line 56
    .line 57
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzrg;->zzf:Lcom/google/android/gms/internal/ads/zzd;

    .line 58
    .line 59
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzd;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    return v0

    .line 66
    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 9

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzrg;->zza:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzrg;->zzb:I

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzrg;->zzc:I

    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzrg;->zze:I

    .line 20
    .line 21
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzrg;->zzf:Lcom/google/android/gms/internal/ads/zzd;

    .line 26
    .line 27
    iget v5, p0, Lcom/google/android/gms/internal/ads/zzrg;->zzg:I

    .line 28
    .line 29
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    iget v6, p0, Lcom/google/android/gms/internal/ads/zzrg;->zzh:I

    .line 34
    .line 35
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    const/16 v7, 0xb

    .line 40
    .line 41
    new-array v7, v7, [Ljava/lang/Object;

    .line 42
    .line 43
    const/4 v8, 0x0

    .line 44
    aput-object v0, v7, v8

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    aput-object v1, v7, v0

    .line 48
    .line 49
    const/4 v0, 0x2

    .line 50
    aput-object v2, v7, v0

    .line 51
    .line 52
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 53
    .line 54
    const/4 v1, 0x3

    .line 55
    aput-object v0, v7, v1

    .line 56
    .line 57
    const/4 v1, 0x4

    .line 58
    aput-object v0, v7, v1

    .line 59
    .line 60
    const/4 v1, 0x5

    .line 61
    aput-object v3, v7, v1

    .line 62
    .line 63
    const/4 v1, 0x6

    .line 64
    aput-object v4, v7, v1

    .line 65
    .line 66
    const/4 v1, 0x7

    .line 67
    aput-object v5, v7, v1

    .line 68
    .line 69
    const/16 v1, 0x8

    .line 70
    .line 71
    aput-object v6, v7, v1

    .line 72
    .line 73
    const/16 v1, 0x9

    .line 74
    .line 75
    aput-object v0, v7, v1

    .line 76
    .line 77
    const/16 v1, 0xa

    .line 78
    .line 79
    aput-object v0, v7, v1

    .line 80
    .line 81
    invoke-static {v7}, Lj$/util/Objects;->hash([Ljava/lang/Object;)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    return v0
.end method
