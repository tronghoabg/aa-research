.class public final Lcom/google/android/gms/internal/ads/zzftg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:J

.field private final zzb:J

.field private zzc:J

.field private zzd:J

.field private zze:J

.field private final zzf:Ln7/a;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzftn;

.field private zzh:J

.field private final zzi:Ljava/util/Random;


# direct methods
.method public constructor <init>(JDJDLn7/a;Lcom/google/android/gms/internal/ads/zzftn;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 p3, 0x5

    .line 5
    .line 6
    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzd:J

    .line 7
    .line 8
    const-wide/16 p3, 0x0

    .line 9
    .line 10
    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzftg;->zze:J

    .line 11
    .line 12
    new-instance p7, Ljava/util/Random;

    .line 13
    .line 14
    invoke-direct {p7}, Ljava/util/Random;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzi:Ljava/util/Random;

    .line 18
    .line 19
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzftg;->zza:J

    .line 20
    .line 21
    iput-wide p5, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzb:J

    .line 22
    .line 23
    iput-object p10, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzg:Lcom/google/android/gms/internal/ads/zzftn;

    .line 24
    .line 25
    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzc:J

    .line 26
    .line 27
    iput-object p9, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzf:Ln7/a;

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzftg;->zza()V

    .line 30
    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final declared-synchronized zza()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzftg;->zza:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzh:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzc:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzftg;->zze:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized zzb()J
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzh:J

    .line 3
    .line 4
    long-to-double v0, v0

    .line 5
    const-wide v2, 0x3fc999999999999aL    # 0.2

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    mul-double/2addr v2, v0

    .line 11
    add-double v4, v0, v2

    .line 12
    .line 13
    double-to-long v4, v4

    .line 14
    sub-double/2addr v0, v2

    .line 15
    double-to-long v0, v0

    .line 16
    sub-long/2addr v4, v0

    .line 17
    const-wide/16 v2, 0x1

    .line 18
    .line 19
    add-long/2addr v4, v2

    .line 20
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzi:Ljava/util/Random;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/util/Random;->nextDouble()D

    .line 23
    .line 24
    .line 25
    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    long-to-double v4, v4

    .line 27
    mul-double/2addr v2, v4

    .line 28
    double-to-long v2, v2

    .line 29
    add-long/2addr v0, v2

    .line 30
    monitor-exit p0

    .line 31
    return-wide v0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw v0
.end method

.method public final declared-synchronized zzc()V
    .locals 13

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzftg;->zzb()J

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzf:Ln7/a;

    .line 7
    .line 8
    check-cast v2, Ln7/b;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    add-long/2addr v2, v0

    .line 18
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzftg;->zze:J

    .line 19
    .line 20
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzh:J

    .line 21
    .line 22
    long-to-double v0, v0

    .line 23
    add-double/2addr v0, v0

    .line 24
    double-to-long v0, v0

    .line 25
    iget-wide v11, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzb:J

    .line 26
    .line 27
    invoke-static {v0, v1, v11, v12}, Ljava/lang/Math;->min(JJ)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzh:J

    .line 32
    .line 33
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzc:J

    .line 34
    .line 35
    const-wide/16 v2, 0x1

    .line 36
    .line 37
    add-long/2addr v0, v2

    .line 38
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzc:J

    .line 39
    .line 40
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzM:Lcom/google/android/gms/internal/ads/zzbio;

    .line 41
    .line 42
    sget-object v1, LD6/s;->e:LD6/s;

    .line 43
    .line 44
    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzg:Lcom/google/android/gms/internal/ads/zzftn;

    .line 59
    .line 60
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzc:J

    .line 65
    .line 66
    iget-wide v7, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzh:J

    .line 67
    .line 68
    iget-wide v9, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzd:J

    .line 69
    .line 70
    invoke-virtual/range {v2 .. v12}, Lcom/google/android/gms/internal/ads/zzftn;->zzt(JJJJJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    monitor-exit p0

    .line 74
    return-void

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    goto :goto_0

    .line 77
    :cond_0
    monitor-exit p0

    .line 78
    return-void

    .line 79
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    throw v0
.end method

.method public final declared-synchronized zzd()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzf:Ln7/a;

    .line 3
    .line 4
    check-cast v0, Ln7/b;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzftg;->zze:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    if-gez v0, :cond_0

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

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw v0
.end method

.method public final declared-synchronized zze()Z
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzN:Lcom/google/android/gms/internal/ads/zzbio;

    .line 3
    .line 4
    sget-object v1, LD6/s;->e:LD6/s;

    .line 5
    .line 6
    iget-object v2, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 7
    .line 8
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    const/4 v3, 0x0

    .line 19
    if-gez v2, :cond_0

    .line 20
    .line 21
    monitor-exit p0

    .line 22
    return v3

    .line 23
    :cond_0
    :try_start_1
    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzc:J

    .line 24
    .line 25
    iget-wide v6, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzd:J

    .line 26
    .line 27
    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    int-to-long v0, v0

    .line 40
    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    cmp-long v0, v4, v0

    .line 45
    .line 46
    if-lez v0, :cond_1

    .line 47
    .line 48
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzh:J

    .line 49
    .line 50
    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzb:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    cmp-long v0, v0, v4

    .line 53
    .line 54
    if-ltz v0, :cond_1

    .line 55
    .line 56
    monitor-exit p0

    .line 57
    const/4 v0, 0x1

    .line 58
    return v0

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    monitor-exit p0

    .line 62
    return v3

    .line 63
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 64
    throw v0
.end method

.method public final declared-synchronized zzf(I)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    if-lez p1, :cond_0

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    :goto_0
    :try_start_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->b(Z)V

    .line 8
    .line 9
    .line 10
    int-to-long v0, p1

    .line 11
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzftg;->zzd:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    monitor-exit p0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw p1
.end method
