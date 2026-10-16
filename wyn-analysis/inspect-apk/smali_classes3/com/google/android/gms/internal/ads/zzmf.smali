.class final Lcom/google/android/gms/internal/ads/zzmf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final zza:Lcom/google/android/gms/internal/ads/zzxl;

.field public final zzb:J

.field public final zzc:J

.field public final zzd:J

.field public final zze:J

.field public final zzf:Z

.field public final zzg:Z

.field public final zzh:Z

.field public final zzi:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzxl;JJJJZZZZ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p10, 0x0

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p13, :cond_0

    .line 7
    .line 8
    if-eqz p11, :cond_1

    .line 9
    .line 10
    :cond_0
    move v1, v0

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    move v1, p10

    .line 13
    :goto_0
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzgtr;->zza(Z)V

    .line 14
    .line 15
    .line 16
    if-eqz p12, :cond_3

    .line 17
    .line 18
    if-eqz p11, :cond_2

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_2
    move v0, p10

    .line 22
    :cond_3
    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgtr;->zza(Z)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzmf;->zza:Lcom/google/android/gms/internal/ads/zzxl;

    .line 26
    .line 27
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzmf;->zzb:J

    .line 28
    .line 29
    iput-wide p4, p0, Lcom/google/android/gms/internal/ads/zzmf;->zzc:J

    .line 30
    .line 31
    iput-wide p6, p0, Lcom/google/android/gms/internal/ads/zzmf;->zzd:J

    .line 32
    .line 33
    iput-wide p8, p0, Lcom/google/android/gms/internal/ads/zzmf;->zze:J

    .line 34
    .line 35
    iput-boolean p10, p0, Lcom/google/android/gms/internal/ads/zzmf;->zzf:Z

    .line 36
    .line 37
    iput-boolean p11, p0, Lcom/google/android/gms/internal/ads/zzmf;->zzg:Z

    .line 38
    .line 39
    iput-boolean p12, p0, Lcom/google/android/gms/internal/ads/zzmf;->zzh:Z

    .line 40
    .line 41
    iput-boolean p13, p0, Lcom/google/android/gms/internal/ads/zzmf;->zzi:Z

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

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
    const-class v3, Lcom/google/android/gms/internal/ads/zzmf;

    .line 13
    .line 14
    if-eq v3, v2, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzmf;

    .line 18
    .line 19
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzmf;->zzb:J

    .line 20
    .line 21
    iget-wide v4, p1, Lcom/google/android/gms/internal/ads/zzmf;->zzb:J

    .line 22
    .line 23
    cmp-long v2, v2, v4

    .line 24
    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzmf;->zzd:J

    .line 28
    .line 29
    iget-wide v4, p1, Lcom/google/android/gms/internal/ads/zzmf;->zzd:J

    .line 30
    .line 31
    cmp-long v2, v2, v4

    .line 32
    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzmf;->zze:J

    .line 36
    .line 37
    iget-wide v4, p1, Lcom/google/android/gms/internal/ads/zzmf;->zze:J

    .line 38
    .line 39
    cmp-long v2, v2, v4

    .line 40
    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzmf;->zzg:Z

    .line 44
    .line 45
    iget-boolean v3, p1, Lcom/google/android/gms/internal/ads/zzmf;->zzg:Z

    .line 46
    .line 47
    if-ne v2, v3, :cond_2

    .line 48
    .line 49
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzmf;->zzh:Z

    .line 50
    .line 51
    iget-boolean v3, p1, Lcom/google/android/gms/internal/ads/zzmf;->zzh:Z

    .line 52
    .line 53
    if-ne v2, v3, :cond_2

    .line 54
    .line 55
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzmf;->zzi:Z

    .line 56
    .line 57
    iget-boolean v3, p1, Lcom/google/android/gms/internal/ads/zzmf;->zzi:Z

    .line 58
    .line 59
    if-ne v2, v3, :cond_2

    .line 60
    .line 61
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzmf;->zza:Lcom/google/android/gms/internal/ads/zzxl;

    .line 62
    .line 63
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzmf;->zza:Lcom/google/android/gms/internal/ads/zzxl;

    .line 64
    .line 65
    invoke-static {v2, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_2

    .line 70
    .line 71
    return v0

    .line 72
    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzmf;->zza:Lcom/google/android/gms/internal/ads/zzxl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzxl;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit16 v0, v0, 0x20f

    .line 8
    .line 9
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzmf;->zze:J

    .line 10
    .line 11
    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzmf;->zzd:J

    .line 12
    .line 13
    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzmf;->zzb:J

    .line 14
    .line 15
    mul-int/lit8 v0, v0, 0x1f

    .line 16
    .line 17
    long-to-int v5, v5

    .line 18
    add-int/2addr v0, v5

    .line 19
    mul-int/lit8 v0, v0, 0x1f

    .line 20
    .line 21
    long-to-int v3, v3

    .line 22
    add-int/2addr v0, v3

    .line 23
    mul-int/lit8 v0, v0, 0x1f

    .line 24
    .line 25
    long-to-int v1, v1

    .line 26
    add-int/2addr v0, v1

    .line 27
    mul-int/lit16 v0, v0, 0x3c1

    .line 28
    .line 29
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzmf;->zzg:Z

    .line 30
    .line 31
    add-int/2addr v0, v1

    .line 32
    mul-int/lit8 v0, v0, 0x1f

    .line 33
    .line 34
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzmf;->zzh:Z

    .line 35
    .line 36
    add-int/2addr v0, v1

    .line 37
    mul-int/lit8 v0, v0, 0x1f

    .line 38
    .line 39
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzmf;->zzi:Z

    .line 40
    .line 41
    add-int/2addr v0, v1

    .line 42
    return v0
.end method

.method public final zza(JJ)Lcom/google/android/gms/internal/ads/zzmf;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzmf;->zzb:J

    .line 4
    .line 5
    cmp-long v1, p1, v1

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzmf;->zzc:J

    .line 10
    .line 11
    cmp-long v1, p3, v1

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzmf;->zza:Lcom/google/android/gms/internal/ads/zzxl;

    .line 17
    .line 18
    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/zzmf;->zzd:J

    .line 19
    .line 20
    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/zzmf;->zze:J

    .line 21
    .line 22
    iget-boolean v13, v0, Lcom/google/android/gms/internal/ads/zzmf;->zzg:Z

    .line 23
    .line 24
    iget-boolean v14, v0, Lcom/google/android/gms/internal/ads/zzmf;->zzh:Z

    .line 25
    .line 26
    iget-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzmf;->zzi:Z

    .line 27
    .line 28
    new-instance v2, Lcom/google/android/gms/internal/ads/zzmf;

    .line 29
    .line 30
    const/4 v12, 0x0

    .line 31
    move-wide/from16 v4, p1

    .line 32
    .line 33
    move-wide/from16 v6, p3

    .line 34
    .line 35
    invoke-direct/range {v2 .. v15}, Lcom/google/android/gms/internal/ads/zzmf;-><init>(Lcom/google/android/gms/internal/ads/zzxl;JJJJZZZZ)V

    .line 36
    .line 37
    .line 38
    return-object v2
.end method

.method public final zzb(J)Lcom/google/android/gms/internal/ads/zzmf;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzmf;->zzd:J

    .line 4
    .line 5
    cmp-long v1, p1, v1

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzmf;->zza:Lcom/google/android/gms/internal/ads/zzxl;

    .line 11
    .line 12
    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzmf;->zzb:J

    .line 13
    .line 14
    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/zzmf;->zzc:J

    .line 15
    .line 16
    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/zzmf;->zze:J

    .line 17
    .line 18
    iget-boolean v13, v0, Lcom/google/android/gms/internal/ads/zzmf;->zzg:Z

    .line 19
    .line 20
    iget-boolean v14, v0, Lcom/google/android/gms/internal/ads/zzmf;->zzh:Z

    .line 21
    .line 22
    iget-boolean v15, v0, Lcom/google/android/gms/internal/ads/zzmf;->zzi:Z

    .line 23
    .line 24
    new-instance v2, Lcom/google/android/gms/internal/ads/zzmf;

    .line 25
    .line 26
    const/4 v12, 0x0

    .line 27
    move-wide/from16 v8, p1

    .line 28
    .line 29
    invoke-direct/range {v2 .. v15}, Lcom/google/android/gms/internal/ads/zzmf;-><init>(Lcom/google/android/gms/internal/ads/zzxl;JJJJZZZZ)V

    .line 30
    .line 31
    .line 32
    return-object v2
.end method
