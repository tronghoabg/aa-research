.class public final Lcom/google/android/gms/internal/ads/zzyv;
.super Lcom/google/android/gms/internal/ads/zzwm;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzyj;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzhq;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzyd;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzuq;

.field private final zzd:I

.field private zze:Z

.field private zzf:J

.field private zzg:Z

.field private zzh:Z

.field private zzi:Z

.field private zzj:Lcom/google/android/gms/internal/ads/zzip;

.field private zzk:Lcom/google/android/gms/internal/ads/zzak;

.field private final zzl:Lcom/google/android/gms/internal/ads/zzabw;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzak;Lcom/google/android/gms/internal/ads/zzhq;Lcom/google/android/gms/internal/ads/zzyd;Lcom/google/android/gms/internal/ads/zzuq;Lcom/google/android/gms/internal/ads/zzabw;IZILcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzguj;[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzwm;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyv;->zzk:Lcom/google/android/gms/internal/ads/zzak;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzyv;->zza:Lcom/google/android/gms/internal/ads/zzhq;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzyv;->zzb:Lcom/google/android/gms/internal/ads/zzyd;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzyv;->zzc:Lcom/google/android/gms/internal/ads/zzuq;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzyv;->zzl:Lcom/google/android/gms/internal/ads/zzabw;

    .line 13
    .line 14
    iput p6, p0, Lcom/google/android/gms/internal/ads/zzyv;->zzd:I

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzyv;->zze:Z

    .line 18
    .line 19
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzyv;->zzf:J

    .line 25
    .line 26
    return-void
.end method

.method private final zzv()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/internal/ads/zzzh;

    .line 4
    .line 5
    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/zzyv;->zzf:J

    .line 6
    .line 7
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzyv;->zzg:Z

    .line 8
    .line 9
    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzyv;->zzh:Z

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzyv;->zzK()Lcom/google/android/gms/internal/ads/zzak;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    iget-object v3, v4, Lcom/google/android/gms/internal/ads/zzak;->zzc:Lcom/google/android/gms/internal/ads/zzaf;

    .line 18
    .line 19
    :goto_0
    move-object/from16 v21, v3

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const/4 v3, 0x0

    .line 23
    goto :goto_0

    .line 24
    :goto_1
    const-wide/16 v14, 0x0

    .line 25
    .line 26
    const/16 v17, 0x0

    .line 27
    .line 28
    move/from16 v16, v2

    .line 29
    .line 30
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    const-wide/16 v12, 0x0

    .line 36
    .line 37
    const/16 v18, 0x0

    .line 38
    .line 39
    const/16 v19, 0x0

    .line 40
    .line 41
    move-object/from16 v20, v4

    .line 42
    .line 43
    move-wide v4, v2

    .line 44
    move-wide v6, v2

    .line 45
    move-wide v10, v8

    .line 46
    invoke-direct/range {v1 .. v21}, Lcom/google/android/gms/internal/ads/zzzh;-><init>(JJJJJJJZZZLjava/lang/Object;Lcom/google/android/gms/internal/ads/zzak;Lcom/google/android/gms/internal/ads/zzaf;)V

    .line 47
    .line 48
    .line 49
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzyv;->zze:Z

    .line 50
    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    new-instance v2, Lcom/google/android/gms/internal/ads/zzys;

    .line 54
    .line 55
    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzys;-><init>(Lcom/google/android/gms/internal/ads/zzyv;Lcom/google/android/gms/internal/ads/zzbf;)V

    .line 56
    .line 57
    .line 58
    move-object v1, v2

    .line 59
    :cond_1
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzwm;->zze(Lcom/google/android/gms/internal/ads/zzbf;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final declared-synchronized zzB(Lcom/google/android/gms/internal/ads/zzak;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyv;->zzk:Lcom/google/android/gms/internal/ads/zzak;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final zzE(Lcom/google/android/gms/internal/ads/zzxj;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzyr;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzyr;->zza()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzH(Lcom/google/android/gms/internal/ads/zzxl;Lcom/google/android/gms/internal/ads/zzabm;J)Lcom/google/android/gms/internal/ads/zzxj;
    .locals 18

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    iget-object v0, v8, Lcom/google/android/gms/internal/ads/zzyv;->zza:Lcom/google/android/gms/internal/ads/zzhq;

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhq;->zza()Lcom/google/android/gms/internal/ads/zzhr;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v0, v8, Lcom/google/android/gms/internal/ads/zzyv;->zzj:Lcom/google/android/gms/internal/ads/zzip;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/ads/zzhr;->zze(Lcom/google/android/gms/internal/ads/zzip;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzyv;->zzK()Lcom/google/android/gms/internal/ads/zzak;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzak;->zzb:Lcom/google/android/gms/internal/ads/zzag;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzag;->zza:Landroid/net/Uri;

    .line 26
    .line 27
    iget-object v0, v8, Lcom/google/android/gms/internal/ads/zzyv;->zzb:Lcom/google/android/gms/internal/ads/zzyd;

    .line 28
    .line 29
    new-instance v3, Lcom/google/android/gms/internal/ads/zzyr;

    .line 30
    .line 31
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzwm;->zzk()Lcom/google/android/gms/internal/ads/zzqh;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-interface {v0, v4}, Lcom/google/android/gms/internal/ads/zzyd;->zza(Lcom/google/android/gms/internal/ads/zzqh;)Lcom/google/android/gms/internal/ads/zzye;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v4, v8, Lcom/google/android/gms/internal/ads/zzyv;->zzc:Lcom/google/android/gms/internal/ads/zzuq;

    .line 40
    .line 41
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzwm;->zzh(Lcom/google/android/gms/internal/ads/zzxl;)Lcom/google/android/gms/internal/ads/zzul;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    iget-object v6, v8, Lcom/google/android/gms/internal/ads/zzyv;->zzl:Lcom/google/android/gms/internal/ads/zzabw;

    .line 46
    .line 47
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzwm;->zzf(Lcom/google/android/gms/internal/ads/zzxl;)Lcom/google/android/gms/internal/ads/zzxv;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    iget v11, v8, Lcom/google/android/gms/internal/ads/zzyv;->zzd:I

    .line 52
    .line 53
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-static {v9, v10}, Lcom/google/android/gms/internal/ads/zzfm;->zzt(J)J

    .line 59
    .line 60
    .line 61
    move-result-wide v15

    .line 62
    const/16 v17, 0x0

    .line 63
    .line 64
    const/4 v10, 0x0

    .line 65
    const/4 v12, 0x0

    .line 66
    const/4 v13, 0x0

    .line 67
    const/4 v14, 0x0

    .line 68
    move-object v9, v3

    .line 69
    move-object v3, v0

    .line 70
    move-object v0, v9

    .line 71
    move-object/from16 v9, p2

    .line 72
    .line 73
    invoke-direct/range {v0 .. v17}, Lcom/google/android/gms/internal/ads/zzyr;-><init>(Landroid/net/Uri;Lcom/google/android/gms/internal/ads/zzhr;Lcom/google/android/gms/internal/ads/zzye;Lcom/google/android/gms/internal/ads/zzuq;Lcom/google/android/gms/internal/ads/zzul;Lcom/google/android/gms/internal/ads/zzabw;Lcom/google/android/gms/internal/ads/zzxv;Lcom/google/android/gms/internal/ads/zzyj;Lcom/google/android/gms/internal/ads/zzabm;Ljava/lang/String;IZILcom/google/android/gms/internal/ads/zzv;JLcom/google/android/gms/internal/ads/zzacl;)V

    .line 74
    .line 75
    .line 76
    return-object v0
.end method

.method public final declared-synchronized zzK()Lcom/google/android/gms/internal/ads/zzak;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyv;->zzk:Lcom/google/android/gms/internal/ads/zzak;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzip;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyv;->zzj:Lcom/google/android/gms/internal/ads/zzip;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzwm;->zzk()Lcom/google/android/gms/internal/ads/zzqh;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzyv;->zzv()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final zzb(JLcom/google/android/gms/internal/ads/zzahd;Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzyv;->zzi:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzahd;->zzj()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzahd;->zzj()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    xor-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzyv;->zzi:Z

    .line 19
    .line 20
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmp-long v0, p1, v0

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/zzyv;->zzf:J

    .line 30
    .line 31
    :cond_1
    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzahd;->zzb()Z

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzyv;->zze:Z

    .line 36
    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzyv;->zzf:J

    .line 40
    .line 41
    cmp-long v0, v0, p1

    .line 42
    .line 43
    if-nez v0, :cond_3

    .line 44
    .line 45
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzyv;->zzg:Z

    .line 46
    .line 47
    if-ne v0, p3, :cond_3

    .line 48
    .line 49
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzyv;->zzh:Z

    .line 50
    .line 51
    if-eq v0, p4, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    :goto_0
    return-void

    .line 55
    :cond_3
    :goto_1
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzyv;->zzf:J

    .line 56
    .line 57
    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzyv;->zzg:Z

    .line 58
    .line 59
    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/zzyv;->zzh:Z

    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzyv;->zze:Z

    .line 63
    .line 64
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzyv;->zzv()V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final zzd()V
    .locals 0

    return-void
.end method

.method public final zzu()V
    .locals 0

    return-void
.end method
