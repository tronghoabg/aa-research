.class public final Lcom/google/android/gms/internal/ads/zztb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzqx;


# static fields
.field private static final zza:Ljava/lang/Object;

.field private static zzb:Ljava/util/concurrent/ScheduledExecutorService;

.field private static zzc:I


# instance fields
.field private final zzd:Landroid/media/AudioTrack;

.field private final zze:Lcom/google/android/gms/internal/ads/zzrg;

.field private final zzf:F

.field private final zzg:Lcom/google/android/gms/internal/ads/zzso;

.field private zzh:Lcom/google/android/gms/internal/ads/zzss;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzti;

.field private final zzj:Z

.field private final zzk:I

.field private final zzl:Lcom/google/android/gms/internal/ads/zzta;

.field private final zzm:Lcom/google/android/gms/internal/ads/zzeg;

.field private zzn:Z

.field private zzo:J

.field private zzp:J

.field private zzq:I

.field private zzr:I

.field private zzs:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zztb;->zza:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/media/AudioTrack;Lcom/google/android/gms/internal/ads/zzrg;Lcom/google/android/gms/internal/ads/zzso;FLcom/google/android/gms/internal/ads/zzdp;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztb;->zzd:Landroid/media/AudioTrack;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zztb;->zze:Lcom/google/android/gms/internal/ads/zzrg;

    .line 7
    .line 8
    iput p4, p0, Lcom/google/android/gms/internal/ads/zztb;->zzf:F

    .line 9
    .line 10
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zztb;->zzg:Lcom/google/android/gms/internal/ads/zzso;

    .line 11
    .line 12
    new-instance p4, Lcom/google/android/gms/internal/ads/zzeg;

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {p4, v0}, Lcom/google/android/gms/internal/ads/zzeg;-><init>(Ljava/lang/Thread;)V

    .line 19
    .line 20
    .line 21
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zztb;->zzm:Lcom/google/android/gms/internal/ads/zzeg;

    .line 22
    .line 23
    iget p4, p2, Lcom/google/android/gms/internal/ads/zzrg;->zza:I

    .line 24
    .line 25
    invoke-static {p4}, Lcom/google/android/gms/internal/ads/zzfm;->zzE(I)Z

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/zztb;->zzj:Z

    .line 30
    .line 31
    if-eqz p4, :cond_0

    .line 32
    .line 33
    iget p4, p2, Lcom/google/android/gms/internal/ads/zzrg;->zzc:I

    .line 34
    .line 35
    invoke-static {p4}, Ljava/lang/Integer;->bitCount(I)I

    .line 36
    .line 37
    .line 38
    move-result p4

    .line 39
    iget v0, p2, Lcom/google/android/gms/internal/ads/zzrg;->zza:I

    .line 40
    .line 41
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfm;->zzI(I)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    mul-int/2addr v0, p4

    .line 46
    iput v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzk:I

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 p4, -0x1

    .line 50
    iput p4, p0, Lcom/google/android/gms/internal/ads/zztb;->zzk:I

    .line 51
    .line 52
    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzti;

    .line 53
    .line 54
    new-instance v1, Lcom/google/android/gms/internal/ads/zzsu;

    .line 55
    .line 56
    const/4 p4, 0x0

    .line 57
    invoke-direct {v1, p0, p4}, Lcom/google/android/gms/internal/ads/zzsu;-><init>(Lcom/google/android/gms/internal/ads/zztb;[B)V

    .line 58
    .line 59
    .line 60
    iget v4, p2, Lcom/google/android/gms/internal/ads/zzrg;->zza:I

    .line 61
    .line 62
    iget v5, p0, Lcom/google/android/gms/internal/ads/zztb;->zzk:I

    .line 63
    .line 64
    iget v6, p2, Lcom/google/android/gms/internal/ads/zzrg;->zze:I

    .line 65
    .line 66
    move-object v3, p1

    .line 67
    move-object v2, p5

    .line 68
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzti;-><init>(Lcom/google/android/gms/internal/ads/zzth;Lcom/google/android/gms/internal/ads/zzdp;Landroid/media/AudioTrack;III)V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    .line 72
    .line 73
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 74
    .line 75
    const/16 p2, 0x18

    .line 76
    .line 77
    if-lt p1, p2, :cond_1

    .line 78
    .line 79
    if-eqz p3, :cond_1

    .line 80
    .line 81
    new-instance p1, Lcom/google/android/gms/internal/ads/zzss;

    .line 82
    .line 83
    invoke-direct {p1, v3, p3, p4}, Lcom/google/android/gms/internal/ads/zzss;-><init>(Landroid/media/AudioTrack;Lcom/google/android/gms/internal/ads/zzso;[B)V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztb;->zzh:Lcom/google/android/gms/internal/ads/zzss;

    .line 87
    .line 88
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztb;->zzg()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_2

    .line 93
    .line 94
    new-instance p1, Lcom/google/android/gms/internal/ads/zzta;

    .line 95
    .line 96
    invoke-direct {p1, p0, p4}, Lcom/google/android/gms/internal/ads/zzta;-><init>(Lcom/google/android/gms/internal/ads/zztb;[B)V

    .line 97
    .line 98
    .line 99
    move-object p4, p1

    .line 100
    :cond_2
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zztb;->zzl:Lcom/google/android/gms/internal/ads/zzta;

    .line 101
    .line 102
    return-void
.end method

.method public static synthetic zzp(Landroid/media/AudioTrack;Landroid/os/Handler;Lcom/google/android/gms/internal/ads/zzeg;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/media/AudioTrack;->flush()V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/media/AudioTrack;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Thread;->isAlive()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    new-instance p0, Lcom/google/android/gms/internal/ads/zzsl;

    .line 23
    .line 24
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzsl;-><init>(Lcom/google/android/gms/internal/ads/zzeg;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/ads/zztb;->zza:Ljava/lang/Object;

    .line 31
    .line 32
    monitor-enter p0

    .line 33
    :try_start_1
    sget p1, Lcom/google/android/gms/internal/ads/zztb;->zzc:I

    .line 34
    .line 35
    add-int/lit8 p1, p1, -0x1

    .line 36
    .line 37
    sput p1, Lcom/google/android/gms/internal/ads/zztb;->zzc:I

    .line 38
    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    sget-object p1, Lcom/google/android/gms/internal/ads/zztb;->zzb:Ljava/util/concurrent/ScheduledExecutorService;

    .line 42
    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lcom/google/android/gms/internal/ads/zztb;->zzb:Ljava/util/concurrent/ScheduledExecutorService;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    throw v0

    .line 54
    :cond_2
    :goto_0
    monitor-exit p0

    .line 55
    return-void

    .line 56
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    throw p1

    .line 58
    :catchall_1
    move-exception p0

    .line 59
    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    new-instance v1, Lcom/google/android/gms/internal/ads/zzsm;

    .line 74
    .line 75
    invoke-direct {v1, p2}, Lcom/google/android/gms/internal/ads/zzsm;-><init>(Lcom/google/android/gms/internal/ads/zzeg;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 79
    .line 80
    .line 81
    :cond_3
    sget-object p1, Lcom/google/android/gms/internal/ads/zztb;->zza:Ljava/lang/Object;

    .line 82
    .line 83
    monitor-enter p1

    .line 84
    :try_start_2
    sget p2, Lcom/google/android/gms/internal/ads/zztb;->zzc:I

    .line 85
    .line 86
    add-int/lit8 p2, p2, -0x1

    .line 87
    .line 88
    sput p2, Lcom/google/android/gms/internal/ads/zztb;->zzc:I

    .line 89
    .line 90
    if-nez p2, :cond_5

    .line 91
    .line 92
    sget-object p2, Lcom/google/android/gms/internal/ads/zztb;->zzb:Ljava/util/concurrent/ScheduledExecutorService;

    .line 93
    .line 94
    if-eqz p2, :cond_4

    .line 95
    .line 96
    invoke-interface {p2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 97
    .line 98
    .line 99
    sput-object v0, Lcom/google/android/gms/internal/ads/zztb;->zzb:Ljava/util/concurrent/ScheduledExecutorService;

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :catchall_2
    move-exception p0

    .line 103
    goto :goto_3

    .line 104
    :cond_4
    throw v0

    .line 105
    :cond_5
    :goto_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 106
    throw p0

    .line 107
    :goto_3
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 108
    throw p0
.end method

.method public static synthetic zzq(Lcom/google/android/gms/internal/ads/zzeg;)V
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zztb;->zzw(Lcom/google/android/gms/internal/ads/zzeg;)V

    return-void
.end method

.method public static synthetic zzr(Lcom/google/android/gms/internal/ads/zzeg;)V
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zztb;->zzw(Lcom/google/android/gms/internal/ads/zzeg;)V

    return-void
.end method

.method private final zzv()J
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzj:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzo:J

    .line 6
    .line 7
    iget v2, p0, Lcom/google/android/gms/internal/ads/zztb;->zzk:I

    .line 8
    .line 9
    sget-object v3, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 10
    .line 11
    int-to-long v2, v2

    .line 12
    add-long/2addr v0, v2

    .line 13
    const-wide/16 v4, -0x1

    .line 14
    .line 15
    add-long/2addr v0, v4

    .line 16
    div-long/2addr v0, v2

    .line 17
    return-wide v0

    .line 18
    :cond_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzp:J

    .line 19
    .line 20
    return-wide v0
.end method

.method private static synthetic zzw(Lcom/google/android/gms/internal/ads/zzeg;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeg;->zzb()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    sget-object v1, Lcom/google/android/gms/internal/ads/zzsj;->zza:Lcom/google/android/gms/internal/ads/zzsj;

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzeg;->zze(ILcom/google/android/gms/internal/ads/zzeb;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeg;->zzf()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzti;->zzb()V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzn:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztb;->zzg()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-void

    .line 18
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzd:Landroid/media/AudioTrack;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final zzb()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzti;->zzf()V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzn:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztb;->zzg()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-void

    .line 18
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzd:Landroid/media/AudioTrack;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final zzc(Ljava/nio/ByteBuffer;IJ)Z
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzqw;
        }
    .end annotation

    .line 1
    iget-boolean p3, p0, Lcom/google/android/gms/internal/ads/zztb;->zzj:Z

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    iget p4, p0, Lcom/google/android/gms/internal/ads/zztb;->zzq:I

    .line 6
    .line 7
    if-nez p4, :cond_0

    .line 8
    .line 9
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zztb;->zze:Lcom/google/android/gms/internal/ads/zzrg;

    .line 10
    .line 11
    iget p4, p4, Lcom/google/android/gms/internal/ads/zzrg;->zza:I

    .line 12
    .line 13
    invoke-static {p4, p1}, Lcom/google/android/gms/internal/ads/zztu;->zzF(ILjava/nio/ByteBuffer;)I

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    iput p4, p0, Lcom/google/android/gms/internal/ads/zztb;->zzq:I

    .line 18
    .line 19
    :cond_0
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zztb;->zzm:Lcom/google/android/gms/internal/ads/zzeg;

    .line 20
    .line 21
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzeg;->zzb()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/16 v1, 0x18

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x1

    .line 29
    if-eqz v0, :cond_4

    .line 30
    .line 31
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztb;->zzv()J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 36
    .line 37
    if-lt v0, v1, :cond_1

    .line 38
    .line 39
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzd:Landroid/media/AudioTrack;

    .line 40
    .line 41
    invoke-static {v0}, LW1/p;->c(Landroid/media/AudioTrack;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzs:Z

    .line 47
    .line 48
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zztb;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    .line 49
    .line 50
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zztb;->zzd:Landroid/media/AudioTrack;

    .line 51
    .line 52
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzti;->zza()J

    .line 53
    .line 54
    .line 55
    move-result-wide v8

    .line 56
    invoke-virtual {v7}, Landroid/media/AudioTrack;->getSampleRate()I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    invoke-static {v8, v9, v6}, Lcom/google/android/gms/internal/ads/zzfm;->zzv(JI)J

    .line 61
    .line 62
    .line 63
    move-result-wide v8

    .line 64
    cmp-long v4, v4, v8

    .line 65
    .line 66
    if-lez v4, :cond_2

    .line 67
    .line 68
    move v4, v3

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    move v4, v2

    .line 71
    :goto_0
    iput-boolean v4, p0, Lcom/google/android/gms/internal/ads/zztb;->zzs:Z

    .line 72
    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    if-nez v4, :cond_3

    .line 76
    .line 77
    invoke-virtual {v7}, Landroid/media/AudioTrack;->getPlayState()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eq v0, v3, :cond_3

    .line 82
    .line 83
    iget v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzr:I

    .line 84
    .line 85
    add-int/2addr v0, v3

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzr:I

    .line 88
    .line 89
    :goto_1
    iget v4, p0, Lcom/google/android/gms/internal/ads/zztb;->zzr:I

    .line 90
    .line 91
    iput v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzr:I

    .line 92
    .line 93
    if-le v0, v4, :cond_4

    .line 94
    .line 95
    const/4 v0, -0x1

    .line 96
    sget-object v4, Lcom/google/android/gms/internal/ads/zzsk;->zza:Lcom/google/android/gms/internal/ads/zzsk;

    .line 97
    .line 98
    invoke-virtual {p4, v0, v4}, Lcom/google/android/gms/internal/ads/zzeg;->zze(ILcom/google/android/gms/internal/ads/zzeb;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzeg;->zzf()V

    .line 102
    .line 103
    .line 104
    :cond_4
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 105
    .line 106
    .line 107
    move-result p4

    .line 108
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzd:Landroid/media/AudioTrack;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    invoke-virtual {v0, p1, v4, v3}, Landroid/media/AudioTrack;->write(Ljava/nio/ByteBuffer;II)I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-gez p1, :cond_9

    .line 119
    .line 120
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 121
    .line 122
    if-lt p2, v1, :cond_6

    .line 123
    .line 124
    const/4 p2, -0x6

    .line 125
    if-eq p1, p2, :cond_5

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_5
    :goto_2
    move v2, v3

    .line 129
    goto :goto_4

    .line 130
    :cond_6
    :goto_3
    const/16 p2, -0x20

    .line 131
    .line 132
    if-ne p1, p2, :cond_7

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_7
    :goto_4
    if-eqz v2, :cond_8

    .line 136
    .line 137
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zztb;->zzg:Lcom/google/android/gms/internal/ads/zzso;

    .line 138
    .line 139
    if-eqz p2, :cond_8

    .line 140
    .line 141
    check-cast p2, Lcom/google/android/gms/internal/ads/zztf;

    .line 142
    .line 143
    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zztf;->zza:Lcom/google/android/gms/internal/ads/zztg;

    .line 144
    .line 145
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zztg;->zzj()Lcom/google/android/gms/internal/ads/zzqp;

    .line 146
    .line 147
    .line 148
    move-result-object p3

    .line 149
    if-eqz p3, :cond_8

    .line 150
    .line 151
    sget-object p3, Lcom/google/android/gms/internal/ads/zzqj;->zza:Lcom/google/android/gms/internal/ads/zzqj;

    .line 152
    .line 153
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/zztg;->zzi(Lcom/google/android/gms/internal/ads/zzqj;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zztg;->zzj()Lcom/google/android/gms/internal/ads/zzqp;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/ads/zzqp;->zza(Lcom/google/android/gms/internal/ads/zzqj;)V

    .line 161
    .line 162
    .line 163
    :cond_8
    new-instance p2, Lcom/google/android/gms/internal/ads/zzqw;

    .line 164
    .line 165
    invoke-direct {p2, p1, v2}, Lcom/google/android/gms/internal/ads/zzqw;-><init>(IZ)V

    .line 166
    .line 167
    .line 168
    throw p2

    .line 169
    :cond_9
    if-ne p1, p4, :cond_a

    .line 170
    .line 171
    move v2, v3

    .line 172
    :cond_a
    if-eqz p3, :cond_b

    .line 173
    .line 174
    iget-wide p2, p0, Lcom/google/android/gms/internal/ads/zztb;->zzo:J

    .line 175
    .line 176
    int-to-long v0, p1

    .line 177
    add-long/2addr p2, v0

    .line 178
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zztb;->zzo:J

    .line 179
    .line 180
    return v2

    .line 181
    :cond_b
    if-eqz v2, :cond_c

    .line 182
    .line 183
    iget-wide p3, p0, Lcom/google/android/gms/internal/ads/zztb;->zzp:J

    .line 184
    .line 185
    iget p1, p0, Lcom/google/android/gms/internal/ads/zztb;->zzq:I

    .line 186
    .line 187
    int-to-long v0, p1

    .line 188
    int-to-long p1, p2

    .line 189
    mul-long/2addr v0, p1

    .line 190
    add-long/2addr v0, p3

    .line 191
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzp:J

    .line 192
    .line 193
    :cond_c
    return v2
.end method

.method public final zzd()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzn:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzn:Z

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztb;->zzv()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzti;->zze(J)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzd:Landroid/media/AudioTrack;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final zze()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzti;->zzc()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzd:Landroid/media/AudioTrack;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/media/AudioTrack;->pause()V

    .line 12
    .line 13
    .line 14
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    const/16 v1, 0x1d

    .line 17
    .line 18
    if-lt v0, v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zztb;->zzg()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztb;->zzl:Lcom/google/android/gms/internal/ads/zzta;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzta;->zza()V

    .line 32
    .line 33
    .line 34
    :cond_1
    const/16 v1, 0x18

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    if-lt v0, v1, :cond_2

    .line 38
    .line 39
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzh:Lcom/google/android/gms/internal/ads/zzss;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzss;->zzd()V

    .line 44
    .line 45
    .line 46
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zztb;->zzh:Lcom/google/android/gms/internal/ads/zzss;

    .line 47
    .line 48
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzd:Landroid/media/AudioTrack;

    .line 49
    .line 50
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztb;->zzm:Lcom/google/android/gms/internal/ads/zzeg;

    .line 51
    .line 52
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzfm;->zzd(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    sget-object v3, Lcom/google/android/gms/internal/ads/zztb;->zza:Ljava/lang/Object;

    .line 57
    .line 58
    monitor-enter v3

    .line 59
    :try_start_0
    sget-object v4, Lcom/google/android/gms/internal/ads/zztb;->zzb:Ljava/util/concurrent/ScheduledExecutorService;

    .line 60
    .line 61
    if-nez v4, :cond_3

    .line 62
    .line 63
    const-string v4, "ExoPlayer:AudioTrackReleaseThread"

    .line 64
    .line 65
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzfm;->zzh(Ljava/lang/String;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    sput-object v4, Lcom/google/android/gms/internal/ads/zztb;->zzb:Ljava/util/concurrent/ScheduledExecutorService;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    :goto_0
    sget v4, Lcom/google/android/gms/internal/ads/zztb;->zzc:I

    .line 75
    .line 76
    add-int/lit8 v4, v4, 0x1

    .line 77
    .line 78
    sput v4, Lcom/google/android/gms/internal/ads/zztb;->zzc:I

    .line 79
    .line 80
    sget-object v4, Lcom/google/android/gms/internal/ads/zztb;->zzb:Ljava/util/concurrent/ScheduledExecutorService;

    .line 81
    .line 82
    new-instance v5, Lcom/google/android/gms/internal/ads/zzsn;

    .line 83
    .line 84
    invoke-direct {v5, v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzsn;-><init>(Landroid/media/AudioTrack;Landroid/os/Handler;Lcom/google/android/gms/internal/ads/zzeg;)V

    .line 85
    .line 86
    .line 87
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 88
    .line 89
    const-wide/16 v1, 0x14

    .line 90
    .line 91
    invoke-interface {v4, v5, v1, v2, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 92
    .line 93
    .line 94
    monitor-exit v3

    .line 95
    return-void

    .line 96
    :goto_1
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    throw v0
.end method

.method public final zzf(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzd:Landroid/media/AudioTrack;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/AudioTrack;->setVolume(F)I

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzg()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzd:Landroid/media/AudioTrack;

    .line 8
    .line 9
    invoke-static {v0}, LG5/d;->z(Landroid/media/AudioTrack;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final zzh()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzd:Landroid/media/AudioTrack;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final zzi()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzd:Landroid/media/AudioTrack;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getSampleRate()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final zzj()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzd:Landroid/media/AudioTrack;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getBufferSizeInFrames()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-long v0, v0

    .line 8
    return-wide v0
.end method

.method public final zzk()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzti;->zza()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final zzl()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzi:Lcom/google/android/gms/internal/ads/zzti;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztb;->zzv()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzti;->zzd(J)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final zzm(Lcom/google/android/gms/internal/ads/zzqv;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzm:Lcom/google/android/gms/internal/ads/zzeg;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzeg;->zzc(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzn(Lcom/google/android/gms/internal/ads/zzqh;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzqh;->zza()Landroid/media/metrics/LogSessionId;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {}, LF5/i;->g()Landroid/media/metrics/LogSessionId;

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, LV1/h;->v(Landroid/media/metrics/LogSessionId;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzd:Landroid/media/AudioTrack;

    .line 22
    .line 23
    invoke-static {v0, p1}, LV1/h;->o(Landroid/media/AudioTrack;Landroid/media/metrics/LogSessionId;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_0
    return-void
.end method

.method public final zzo(Landroid/media/AudioDeviceInfo;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzd:Landroid/media/AudioTrack;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/AudioTrack;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final synthetic zzs()J
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zztb;->zzv()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic zzt()Landroid/media/AudioTrack;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzd:Landroid/media/AudioTrack;

    return-object v0
.end method

.method public final synthetic zzu()Lcom/google/android/gms/internal/ads/zzeg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztb;->zzm:Lcom/google/android/gms/internal/ads/zzeg;

    return-object v0
.end method
