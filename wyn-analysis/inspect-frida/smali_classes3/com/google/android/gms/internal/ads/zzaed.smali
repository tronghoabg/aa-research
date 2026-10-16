.class public final Lcom/google/android/gms/internal/ads/zzaed;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzacz;

.field private final zzb:Landroid/content/Context;

.field private zzc:Lcom/google/android/gms/internal/ads/zzadz;

.field private zzd:Z

.field private zze:Landroid/view/Surface;

.field private zzf:F

.field private zzg:F

.field private zzh:F

.field private zzi:F

.field private zzj:I

.field private zzk:J

.field private zzl:J

.field private zzm:J

.field private zzn:J

.field private zzo:J

.field private zzp:J

.field private zzq:J

.field private zzr:J

.field private zzs:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzb:Landroid/content/Context;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzacz;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzacz;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaed;->zza:Lcom/google/android/gms/internal/ads/zzacz;

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzf:F

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzi:F

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzj:I

    return-void
.end method

.method private final zzj()V
    .locals 4

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzm:J

    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzq:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzn:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzk:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzl:J

    return-void
.end method

.method private final zzk()V
    .locals 6

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_7

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zze:Landroid/view/Surface;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zza:Lcom/google/android/gms/internal/ads/zzacz;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzacz;->zzc()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzacz;->zzg()F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzf:F

    .line 26
    .line 27
    :goto_0
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzg:F

    .line 28
    .line 29
    cmpl-float v4, v2, v3

    .line 30
    .line 31
    if-eqz v4, :cond_7

    .line 32
    .line 33
    const/high16 v4, -0x40800000    # -1.0f

    .line 34
    .line 35
    cmpl-float v5, v2, v4

    .line 36
    .line 37
    if-eqz v5, :cond_4

    .line 38
    .line 39
    cmpl-float v3, v3, v4

    .line 40
    .line 41
    if-eqz v3, :cond_4

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzacz;->zzc()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    const/high16 v3, 0x3f800000    # 1.0f

    .line 48
    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzacz;->zze()J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    const-wide v4, 0x12a05f200L

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    cmp-long v0, v0, v4

    .line 61
    .line 62
    if-ltz v0, :cond_2

    .line 63
    .line 64
    const v3, 0x3dcccccd    # 0.1f

    .line 65
    .line 66
    .line 67
    :cond_2
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzg:F

    .line 68
    .line 69
    sub-float v0, v2, v0

    .line 70
    .line 71
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    cmpl-float v0, v0, v3

    .line 76
    .line 77
    if-ltz v0, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    return-void

    .line 81
    :cond_4
    if-nez v5, :cond_6

    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzacz;->zzd()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-lt v0, v1, :cond_5

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_5
    return-void

    .line 91
    :cond_6
    :goto_1
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzg:F

    .line 92
    .line 93
    const/4 v0, 0x0

    .line 94
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzaed;->zzl(Z)V

    .line 95
    .line 96
    .line 97
    :cond_7
    :goto_2
    return-void
.end method

.method private final zzl(Z)V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zze:Landroid/view/Surface;

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzj:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    if-eq v1, v2, :cond_3

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzd:Z

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzg:F

    .line 30
    .line 31
    const/high16 v2, -0x40800000    # -1.0f

    .line 32
    .line 33
    cmpl-float v2, v0, v2

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzi:F

    .line 38
    .line 39
    mul-float/2addr v1, v0

    .line 40
    :cond_1
    if-nez p1, :cond_2

    .line 41
    .line 42
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzh:F

    .line 43
    .line 44
    cmpl-float p1, p1, v1

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    :cond_2
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzh:F

    .line 49
    .line 50
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaed;->zze:Landroid/view/Surface;

    .line 51
    .line 52
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/zzady;->zza(Landroid/view/Surface;F)V

    .line 53
    .line 54
    .line 55
    :cond_3
    :goto_0
    return-void
.end method

.method private final zzm()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zze:Landroid/view/Surface;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzj:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    if-eq v1, v2, :cond_1

    .line 16
    .line 17
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzh:F

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    cmpl-float v1, v1, v2

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/Surface;->isValid()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzh:F

    .line 32
    .line 33
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zze:Landroid/view/Surface;

    .line 34
    .line 35
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/zzady;->zza(Landroid/view/Surface;F)V

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final zza(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzj:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzj:I

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzaed;->zzl(Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final zzb()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzd:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzaed;->zzj()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzb:Landroid/content/Context;

    .line 8
    .line 9
    const-string v1, "display"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/hardware/display/DisplayManager;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :try_start_0
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 22
    .line 23
    .line 24
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 26
    .line 27
    const/16 v4, 0x21

    .line 28
    .line 29
    if-lt v3, v4, :cond_1

    .line 30
    .line 31
    new-instance v3, Lcom/google/android/gms/internal/ads/zzaec;

    .line 32
    .line 33
    invoke-direct {v3, v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzaec;-><init>(Landroid/view/Choreographer;Landroid/hardware/display/DisplayManager;[B)V

    .line 34
    .line 35
    .line 36
    :goto_0
    move-object v1, v3

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    new-instance v3, Lcom/google/android/gms/internal/ads/zzaea;

    .line 39
    .line 40
    invoke-direct {v3, v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzaea;-><init>(Landroid/view/Choreographer;Landroid/hardware/display/DisplayManager;[B)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catch_0
    move-exception v0

    .line 45
    const-string v2, "VideoFrameReleaseHelper"

    .line 46
    .line 47
    const-string v3, "Vsync sampling disabled due to platform error"

    .line 48
    .line 49
    invoke-static {v2, v3, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzc:Lcom/google/android/gms/internal/ads/zzadz;

    .line 53
    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzadz;->zza()V

    .line 57
    .line 58
    .line 59
    :cond_2
    const/4 v0, 0x0

    .line 60
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzaed;->zzl(Z)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final zzc(Landroid/view/Surface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zze:Landroid/view/Surface;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzaed;->zzm()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaed;->zze:Landroid/view/Surface;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzaed;->zzl(Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final zzd()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzaed;->zzj()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final zze(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzi:F

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzaed;->zzl(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final zzf(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzf:F

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaed;->zza:Lcom/google/android/gms/internal/ads/zzacz;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzacz;->zza()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzaed;->zzk()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final zzg(J)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzn:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzq:J

    .line 10
    .line 11
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzo:J

    .line 12
    .line 13
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzr:J

    .line 14
    .line 15
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzp:J

    .line 16
    .line 17
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzs:J

    .line 18
    .line 19
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzl:J

    .line 20
    .line 21
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzk:J

    .line 22
    .line 23
    :cond_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzm:J

    .line 24
    .line 25
    const-wide/16 v2, 0x1

    .line 26
    .line 27
    add-long/2addr v0, v2

    .line 28
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzm:J

    .line 29
    .line 30
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zza:Lcom/google/android/gms/internal/ads/zzacz;

    .line 31
    .line 32
    const-wide/16 v1, 0x3e8

    .line 33
    .line 34
    mul-long/2addr p1, v1

    .line 35
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzacz;->zzb(J)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzaed;->zzk()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final zzh()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzd:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaed;->zzc:Lcom/google/android/gms/internal/ads/zzadz;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzadz;->zzb()V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzaed;->zzm()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final zzi(JJ)J
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p3

    .line 4
    .line 5
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzaed;->zzq:J

    .line 6
    .line 7
    const-wide/16 v5, -0x1

    .line 8
    .line 9
    cmp-long v3, v3, v5

    .line 10
    .line 11
    if-eqz v3, :cond_1

    .line 12
    .line 13
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaed;->zza:Lcom/google/android/gms/internal/ads/zzacz;

    .line 14
    .line 15
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzacz;->zzc()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzacz;->zzf()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzaed;->zzm:J

    .line 26
    .line 27
    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/zzaed;->zzq:J

    .line 28
    .line 29
    sub-long/2addr v5, v7

    .line 30
    mul-long/2addr v5, v3

    .line 31
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzaed;->zzi:F

    .line 32
    .line 33
    long-to-float v4, v5

    .line 34
    div-float/2addr v4, v3

    .line 35
    float-to-long v3, v4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzaed;->zzs:J

    .line 38
    .line 39
    sub-long v3, v1, v3

    .line 40
    .line 41
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzaed;->zzi:F

    .line 42
    .line 43
    const-wide/16 v6, 0x3e8

    .line 44
    .line 45
    mul-long/2addr v3, v6

    .line 46
    long-to-float v3, v3

    .line 47
    div-float/2addr v3, v5

    .line 48
    float-to-long v3, v3

    .line 49
    :goto_0
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzaed;->zzr:J

    .line 50
    .line 51
    add-long/2addr v5, v3

    .line 52
    sub-long v3, p1, v5

    .line 53
    .line 54
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    .line 55
    .line 56
    .line 57
    move-result-wide v3

    .line 58
    const-wide/32 v7, 0x1312d00

    .line 59
    .line 60
    .line 61
    cmp-long v3, v3, v7

    .line 62
    .line 63
    if-lez v3, :cond_2

    .line 64
    .line 65
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaed;->zzj()V

    .line 66
    .line 67
    .line 68
    :cond_1
    move-wide/from16 v5, p1

    .line 69
    .line 70
    :cond_2
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzaed;->zzm:J

    .line 71
    .line 72
    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzaed;->zzn:J

    .line 73
    .line 74
    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzaed;->zzo:J

    .line 75
    .line 76
    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzaed;->zzp:J

    .line 77
    .line 78
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaed;->zzc:Lcom/google/android/gms/internal/ads/zzadz;

    .line 79
    .line 80
    if-nez v1, :cond_3

    .line 81
    .line 82
    goto/16 :goto_6

    .line 83
    .line 84
    :cond_3
    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/zzadz;->zzc:J

    .line 85
    .line 86
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaed;->zzc:Lcom/google/android/gms/internal/ads/zzadz;

    .line 87
    .line 88
    iget-wide v3, v3, Lcom/google/android/gms/internal/ads/zzadz;->zzd:J

    .line 89
    .line 90
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    cmp-long v9, v1, v7

    .line 96
    .line 97
    if-eqz v9, :cond_a

    .line 98
    .line 99
    cmp-long v7, v3, v7

    .line 100
    .line 101
    if-eqz v7, :cond_a

    .line 102
    .line 103
    sub-long v7, v5, v1

    .line 104
    .line 105
    div-long/2addr v7, v3

    .line 106
    mul-long/2addr v7, v3

    .line 107
    add-long/2addr v7, v1

    .line 108
    cmp-long v1, v5, v7

    .line 109
    .line 110
    if-gtz v1, :cond_4

    .line 111
    .line 112
    sub-long v1, v7, v3

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_4
    add-long v1, v7, v3

    .line 116
    .line 117
    move-wide/from16 v16, v7

    .line 118
    .line 119
    move-wide v7, v1

    .line 120
    move-wide/from16 v1, v16

    .line 121
    .line 122
    :goto_1
    const-wide/16 v9, 0x2

    .line 123
    .line 124
    div-long v9, v3, v9

    .line 125
    .line 126
    sub-long v11, v7, v5

    .line 127
    .line 128
    sub-long/2addr v5, v1

    .line 129
    sub-long v13, v11, v5

    .line 130
    .line 131
    invoke-static {v13, v14}, Ljava/lang/Math;->abs(J)J

    .line 132
    .line 133
    .line 134
    move-result-wide v13

    .line 135
    cmp-long v9, v13, v9

    .line 136
    .line 137
    if-gez v9, :cond_8

    .line 138
    .line 139
    const-wide/16 v9, 0x4

    .line 140
    .line 141
    div-long v9, v3, v9

    .line 142
    .line 143
    cmp-long v13, v13, v9

    .line 144
    .line 145
    if-gez v13, :cond_7

    .line 146
    .line 147
    const-wide/16 p1, 0x0

    .line 148
    .line 149
    iget-wide v14, v0, Lcom/google/android/gms/internal/ads/zzaed;->zzk:J

    .line 150
    .line 151
    cmp-long v13, v14, p1

    .line 152
    .line 153
    if-eqz v13, :cond_5

    .line 154
    .line 155
    :goto_2
    iput-wide v14, v0, Lcom/google/android/gms/internal/ads/zzaed;->zzl:J

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_5
    cmp-long v13, v11, v5

    .line 159
    .line 160
    if-gez v13, :cond_6

    .line 161
    .line 162
    neg-long v9, v9

    .line 163
    :cond_6
    :goto_3
    iput-wide v9, v0, Lcom/google/android/gms/internal/ads/zzaed;->zzl:J

    .line 164
    .line 165
    move-wide v14, v9

    .line 166
    goto :goto_4

    .line 167
    :cond_7
    const-wide/16 v9, 0x0

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_8
    iget-wide v14, v0, Lcom/google/android/gms/internal/ads/zzaed;->zzk:J

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :goto_4
    add-long/2addr v11, v14

    .line 174
    cmp-long v5, v11, v5

    .line 175
    .line 176
    if-gez v5, :cond_9

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_9
    move-wide v7, v1

    .line 180
    :goto_5
    const-wide/16 v1, 0x50

    .line 181
    .line 182
    mul-long/2addr v3, v1

    .line 183
    const-wide/16 v1, 0x64

    .line 184
    .line 185
    div-long/2addr v3, v1

    .line 186
    sub-long/2addr v7, v3

    .line 187
    return-wide v7

    .line 188
    :cond_a
    :goto_6
    return-wide v5
.end method
