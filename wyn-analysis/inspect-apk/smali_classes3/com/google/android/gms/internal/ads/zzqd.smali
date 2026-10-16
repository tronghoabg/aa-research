.class public final Lcom/google/android/gms/internal/ads/zzqd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zznr;
.implements Lcom/google/android/gms/internal/ads/zzqe;


# instance fields
.field private zzA:Z

.field private final zza:Landroid/content/Context;

.field private final zzb:Ljava/util/concurrent/Executor;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzqf;

.field private final zzd:Landroid/media/metrics/PlaybackSession;

.field private final zze:J

.field private final zzf:Lcom/google/android/gms/internal/ads/zzbe;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzbd;

.field private final zzh:Ljava/util/HashMap;

.field private final zzi:Ljava/util/HashMap;

.field private zzj:Ljava/lang/String;

.field private zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

.field private zzl:I

.field private zzm:I

.field private zzn:I

.field private zzo:Lcom/google/android/gms/internal/ads/zzau;

.field private zzp:Lcom/google/android/gms/internal/ads/zzqc;

.field private zzq:Lcom/google/android/gms/internal/ads/zzqc;

.field private zzr:Lcom/google/android/gms/internal/ads/zzqc;

.field private zzs:Lcom/google/android/gms/internal/ads/zzv;

.field private zzt:Lcom/google/android/gms/internal/ads/zzv;

.field private zzu:Lcom/google/android/gms/internal/ads/zzv;

.field private zzv:Z

.field private zzw:Z

.field private zzx:I

.field private zzy:I

.field private zzz:I


# direct methods
.method private constructor <init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zza:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzd:Landroid/media/metrics/PlaybackSession;

    .line 11
    .line 12
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzdi;->zza()Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzb:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    new-instance p1, Lcom/google/android/gms/internal/ads/zzbe;

    .line 19
    .line 20
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzbe;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzf:Lcom/google/android/gms/internal/ads/zzbe;

    .line 24
    .line 25
    new-instance p1, Lcom/google/android/gms/internal/ads/zzbd;

    .line 26
    .line 27
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzbd;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzg:Lcom/google/android/gms/internal/ads/zzbd;

    .line 31
    .line 32
    new-instance p1, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzi:Ljava/util/HashMap;

    .line 38
    .line 39
    new-instance p1, Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzh:Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zze:J

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzm:I

    .line 54
    .line 55
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzn:I

    .line 56
    .line 57
    new-instance p1, Lcom/google/android/gms/internal/ads/zzpw;

    .line 58
    .line 59
    sget-object p2, Lcom/google/android/gms/internal/ads/zzpw;->zza:Lcom/google/android/gms/internal/ads/zzguj;

    .line 60
    .line 61
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzpw;-><init>(Lcom/google/android/gms/internal/ads/zzguj;)V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzc:Lcom/google/android/gms/internal/ads/zzqf;

    .line 65
    .line 66
    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/ads/zzqf;->zza(Lcom/google/android/gms/internal/ads/zzqe;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method private final zzA(IJLcom/google/android/gms/internal/ads/zzv;I)V
    .locals 2

    .line 1
    invoke-static {p1}, LF5/i;->j(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zze:J

    .line 6
    .line 7
    sub-long/2addr p2, v0

    .line 8
    invoke-static {p1, p2, p3}, LV1/h;->m(Landroid/media/metrics/TrackChangeEvent$Builder;J)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 p2, 0x1

    .line 13
    if-eqz p4, :cond_b

    .line 14
    .line 15
    invoke-static {p1}, LV1/g;->w(Landroid/media/metrics/TrackChangeEvent$Builder;)V

    .line 16
    .line 17
    .line 18
    const/4 p3, 0x2

    .line 19
    if-eq p5, p2, :cond_0

    .line 20
    .line 21
    move p5, p2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move p5, p3

    .line 24
    :goto_0
    invoke-static {p1, p5}, LV1/g;->r(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 25
    .line 26
    .line 27
    iget-object p5, p4, Lcom/google/android/gms/internal/ads/zzv;->zzo:Ljava/lang/String;

    .line 28
    .line 29
    if-eqz p5, :cond_1

    .line 30
    .line 31
    invoke-static {p1, p5}, LV1/g;->s(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object p5, p4, Lcom/google/android/gms/internal/ads/zzv;->zzp:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz p5, :cond_2

    .line 37
    .line 38
    invoke-static {p1, p5}, LV1/g;->y(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    iget-object p5, p4, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    .line 42
    .line 43
    if-eqz p5, :cond_3

    .line 44
    .line 45
    invoke-static {p1, p5}, LV1/g;->B(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_3
    iget p5, p4, Lcom/google/android/gms/internal/ads/zzv;->zzj:I

    .line 49
    .line 50
    const/4 v0, -0x1

    .line 51
    if-eq p5, v0, :cond_4

    .line 52
    .line 53
    invoke-static {p1, p5}, LV1/g;->x(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 54
    .line 55
    .line 56
    :cond_4
    iget p5, p4, Lcom/google/android/gms/internal/ads/zzv;->zzw:I

    .line 57
    .line 58
    if-eq p5, v0, :cond_5

    .line 59
    .line 60
    invoke-static {p1, p5}, LV1/g;->A(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 61
    .line 62
    .line 63
    :cond_5
    iget p5, p4, Lcom/google/android/gms/internal/ads/zzv;->zzx:I

    .line 64
    .line 65
    if-eq p5, v0, :cond_6

    .line 66
    .line 67
    invoke-static {p1, p5}, LV1/g;->C(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 68
    .line 69
    .line 70
    :cond_6
    iget p5, p4, Lcom/google/android/gms/internal/ads/zzv;->zzH:I

    .line 71
    .line 72
    if-eq p5, v0, :cond_7

    .line 73
    .line 74
    invoke-static {p1, p5}, LV1/g;->D(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 75
    .line 76
    .line 77
    :cond_7
    iget p5, p4, Lcom/google/android/gms/internal/ads/zzv;->zzJ:I

    .line 78
    .line 79
    if-eq p5, v0, :cond_8

    .line 80
    .line 81
    invoke-static {p1, p5}, LV1/h;->t(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 82
    .line 83
    .line 84
    :cond_8
    iget-object p5, p4, Lcom/google/android/gms/internal/ads/zzv;->zzd:Ljava/lang/String;

    .line 85
    .line 86
    if-eqz p5, :cond_a

    .line 87
    .line 88
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 89
    .line 90
    const-string v1, "-"

    .line 91
    .line 92
    invoke-virtual {p5, v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p5

    .line 96
    const/4 v0, 0x0

    .line 97
    aget-object v0, p5, v0

    .line 98
    .line 99
    array-length v1, p5

    .line 100
    if-lt v1, p3, :cond_9

    .line 101
    .line 102
    aget-object p3, p5, p2

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_9
    const/4 p3, 0x0

    .line 106
    :goto_1
    invoke-static {v0, p3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    iget-object p5, p3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p5, Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {p1, p5}, LV1/h;->u(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iget-object p3, p3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 118
    .line 119
    if-eqz p3, :cond_a

    .line 120
    .line 121
    check-cast p3, Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {p1, p3}, LV1/h;->A(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    :cond_a
    iget p3, p4, Lcom/google/android/gms/internal/ads/zzv;->zzA:F

    .line 127
    .line 128
    const/high16 p4, -0x40800000    # -1.0f

    .line 129
    .line 130
    cmpl-float p4, p3, p4

    .line 131
    .line 132
    if-eqz p4, :cond_c

    .line 133
    .line 134
    invoke-static {p1, p3}, Lyc/a;->b(Landroid/media/metrics/TrackChangeEvent$Builder;F)V

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_b
    invoke-static {p1}, LV1/g;->q(Landroid/media/metrics/TrackChangeEvent$Builder;)V

    .line 139
    .line 140
    .line 141
    :cond_c
    :goto_2
    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzA:Z

    .line 142
    .line 143
    invoke-static {p1}, LV1/g;->l(Landroid/media/metrics/TrackChangeEvent$Builder;)Landroid/media/metrics/TrackChangeEvent;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzb:Ljava/util/concurrent/Executor;

    .line 148
    .line 149
    new-instance p3, Lcom/google/android/gms/internal/ads/zzpz;

    .line 150
    .line 151
    invoke-direct {p3, p0, p1}, Lcom/google/android/gms/internal/ads/zzpz;-><init>(Lcom/google/android/gms/internal/ads/zzqd;Landroid/media/metrics/TrackChangeEvent;)V

    .line 152
    .line 153
    .line 154
    invoke-interface {p2, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method private final zzB(Lcom/google/android/gms/internal/ads/zzbf;Lcom/google/android/gms/internal/ads/zzxl;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzxl;->zza:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzbf;->zze(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const/4 v1, -0x1

    .line 13
    if-eq p2, v1, :cond_7

    .line 14
    .line 15
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzg:Lcom/google/android/gms/internal/ads/zzbd;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {p1, p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzbf;->zzd(ILcom/google/android/gms/internal/ads/zzbd;Z)Lcom/google/android/gms/internal/ads/zzbd;

    .line 19
    .line 20
    .line 21
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzf:Lcom/google/android/gms/internal/ads/zzbe;

    .line 22
    .line 23
    iget v1, v1, Lcom/google/android/gms/internal/ads/zzbd;->zzc:I

    .line 24
    .line 25
    const-wide/16 v3, 0x0

    .line 26
    .line 27
    invoke-virtual {p1, v1, p2, v3, v4}, Lcom/google/android/gms/internal/ads/zzbf;->zzb(ILcom/google/android/gms/internal/ads/zzbe;J)Lcom/google/android/gms/internal/ads/zzbe;

    .line 28
    .line 29
    .line 30
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzbe;->zzd:Lcom/google/android/gms/internal/ads/zzak;

    .line 31
    .line 32
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzak;->zzb:Lcom/google/android/gms/internal/ads/zzag;

    .line 33
    .line 34
    const/4 v1, 0x2

    .line 35
    const/4 v3, 0x1

    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzag;->zza:Landroid/net/Uri;

    .line 40
    .line 41
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfm;->zzK(Landroid/net/Uri;)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_4

    .line 46
    .line 47
    if-eq p1, v3, :cond_3

    .line 48
    .line 49
    if-eq p1, v1, :cond_2

    .line 50
    .line 51
    move v2, v3

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const/4 v2, 0x4

    .line 54
    goto :goto_0

    .line 55
    :cond_3
    const/4 v2, 0x5

    .line 56
    goto :goto_0

    .line 57
    :cond_4
    const/4 v2, 0x3

    .line 58
    :goto_0
    invoke-static {v0, v2}, LV1/h;->B(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 59
    .line 60
    .line 61
    iget-wide v4, p2, Lcom/google/android/gms/internal/ads/zzbe;->zzm:J

    .line 62
    .line 63
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    cmp-long p1, v4, v6

    .line 69
    .line 70
    if-eqz p1, :cond_5

    .line 71
    .line 72
    iget-boolean p1, p2, Lcom/google/android/gms/internal/ads/zzbe;->zzk:Z

    .line 73
    .line 74
    if-nez p1, :cond_5

    .line 75
    .line 76
    iget-boolean p1, p2, Lcom/google/android/gms/internal/ads/zzbe;->zzi:Z

    .line 77
    .line 78
    if-nez p1, :cond_5

    .line 79
    .line 80
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzbe;->zzb()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-nez p1, :cond_5

    .line 85
    .line 86
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/ads/zzfm;->zzs(J)J

    .line 87
    .line 88
    .line 89
    move-result-wide v4

    .line 90
    invoke-static {v0, v4, v5}, LV1/h;->C(Landroid/media/metrics/PlaybackMetrics$Builder;J)V

    .line 91
    .line 92
    .line 93
    :cond_5
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzbe;->zzb()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eq v3, p1, :cond_6

    .line 98
    .line 99
    move v1, v3

    .line 100
    :cond_6
    invoke-static {v0, v1}, LV1/h;->D(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 101
    .line 102
    .line 103
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzA:Z

    .line 104
    .line 105
    :cond_7
    :goto_1
    return-void
.end method

.method private final zzC()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzA:Z

    .line 7
    .line 8
    if-eqz v2, :cond_3

    .line 9
    .line 10
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzz:I

    .line 11
    .line 12
    invoke-static {v0, v2}, LV1/g;->v(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 16
    .line 17
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzx:I

    .line 18
    .line 19
    invoke-static {v0, v2}, LV1/g;->z(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 23
    .line 24
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzy:I

    .line 25
    .line 26
    invoke-static {v0, v2}, LV1/h;->p(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzh:Ljava/util/HashMap;

    .line 30
    .line 31
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzj:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/Long;

    .line 38
    .line 39
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 40
    .line 41
    const-wide/16 v3, 0x0

    .line 42
    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    move-wide v5, v3

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v5

    .line 51
    :goto_0
    invoke-static {v2, v5, v6}, LV1/h;->q(Landroid/media/metrics/PlaybackMetrics$Builder;J)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzi:Ljava/util/HashMap;

    .line 55
    .line 56
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzj:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/lang/Long;

    .line 63
    .line 64
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 65
    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    move-wide v5, v3

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 71
    .line 72
    .line 73
    move-result-wide v5

    .line 74
    :goto_1
    invoke-static {v2, v5, v6}, LV1/h;->z(Landroid/media/metrics/PlaybackMetrics$Builder;J)V

    .line 75
    .line 76
    .line 77
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 78
    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v5

    .line 85
    cmp-long v0, v5, v3

    .line 86
    .line 87
    if-lez v0, :cond_2

    .line 88
    .line 89
    const/4 v0, 0x1

    .line 90
    goto :goto_2

    .line 91
    :cond_2
    move v0, v1

    .line 92
    :goto_2
    invoke-static {v2, v0}, LV1/h;->y(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 96
    .line 97
    invoke-static {v0}, LV1/h;->g(Landroid/media/metrics/PlaybackMetrics$Builder;)Landroid/media/metrics/PlaybackMetrics;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzb:Ljava/util/concurrent/Executor;

    .line 102
    .line 103
    new-instance v3, Lcom/google/android/gms/internal/ads/zzqa;

    .line 104
    .line 105
    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/internal/ads/zzqa;-><init>(Lcom/google/android/gms/internal/ads/zzqd;Landroid/media/metrics/PlaybackMetrics;)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 109
    .line 110
    .line 111
    :cond_3
    const/4 v0, 0x0

    .line 112
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 113
    .line 114
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzj:Ljava/lang/String;

    .line 115
    .line 116
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzz:I

    .line 117
    .line 118
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzx:I

    .line 119
    .line 120
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzy:I

    .line 121
    .line 122
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzs:Lcom/google/android/gms/internal/ads/zzv;

    .line 123
    .line 124
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzt:Lcom/google/android/gms/internal/ads/zzv;

    .line 125
    .line 126
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzu:Lcom/google/android/gms/internal/ads/zzv;

    .line 127
    .line 128
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzA:Z

    .line 129
    .line 130
    return-void
.end method

.method private static zzD(I)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzfm;->zzJ(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/16 p0, 0x1b

    .line 9
    .line 10
    return p0

    .line 11
    :pswitch_0
    const/16 p0, 0x1a

    .line 12
    .line 13
    return p0

    .line 14
    :pswitch_1
    const/16 p0, 0x19

    .line 15
    .line 16
    return p0

    .line 17
    :pswitch_2
    const/16 p0, 0x1c

    .line 18
    .line 19
    return p0

    .line 20
    :pswitch_3
    const/16 p0, 0x18

    .line 21
    .line 22
    return p0

    .line 23
    :pswitch_data_0
    .packed-switch 0x1772
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzqd;
    .locals 2

    .line 1
    const-string v0, "media_metrics"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, LV1/h;->e(Ljava/lang/Object;)Landroid/media/metrics/MediaMetricsManager;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/zzqd;

    .line 16
    .line 17
    invoke-static {v0}, LV1/h;->h(Landroid/media/metrics/MediaMetricsManager;)Landroid/media/metrics/PlaybackSession;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ads/zzqd;-><init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method

.method private final zzw(Lcom/google/android/gms/internal/ads/zzqc;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzc:Lcom/google/android/gms/internal/ads/zzqf;

    .line 4
    .line 5
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzqc;->zzc:Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzqf;->zzf()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method private final zzx(JLcom/google/android/gms/internal/ads/zzv;I)V
    .locals 6

    .line 1
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzs:Lcom/google/android/gms/internal/ads/zzv;

    .line 2
    .line 3
    invoke-static {p4, p3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p4

    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzs:Lcom/google/android/gms/internal/ads/zzv;

    .line 11
    .line 12
    if-nez p4, :cond_1

    .line 13
    .line 14
    const/4 p4, 0x1

    .line 15
    :goto_0
    move v5, p4

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    const/4 p4, 0x0

    .line 18
    goto :goto_0

    .line 19
    :goto_1
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzs:Lcom/google/android/gms/internal/ads/zzv;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    move-object v0, p0

    .line 23
    move-wide v2, p1

    .line 24
    move-object v4, p3

    .line 25
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzqd;->zzA(IJLcom/google/android/gms/internal/ads/zzv;I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private final zzy(JLcom/google/android/gms/internal/ads/zzv;I)V
    .locals 6

    .line 1
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzt:Lcom/google/android/gms/internal/ads/zzv;

    .line 2
    .line 3
    invoke-static {p4, p3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p4

    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzt:Lcom/google/android/gms/internal/ads/zzv;

    .line 11
    .line 12
    if-nez p4, :cond_1

    .line 13
    .line 14
    const/4 p4, 0x1

    .line 15
    :goto_0
    move v5, p4

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    const/4 p4, 0x0

    .line 18
    goto :goto_0

    .line 19
    :goto_1
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzt:Lcom/google/android/gms/internal/ads/zzv;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    move-object v0, p0

    .line 23
    move-wide v2, p1

    .line 24
    move-object v4, p3

    .line 25
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzqd;->zzA(IJLcom/google/android/gms/internal/ads/zzv;I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private final zzz(JLcom/google/android/gms/internal/ads/zzv;I)V
    .locals 6

    .line 1
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzu:Lcom/google/android/gms/internal/ads/zzv;

    .line 2
    .line 3
    invoke-static {p4, p3}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p4

    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzu:Lcom/google/android/gms/internal/ads/zzv;

    .line 11
    .line 12
    if-nez p4, :cond_1

    .line 13
    .line 14
    const/4 p4, 0x1

    .line 15
    :goto_0
    move v5, p4

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    const/4 p4, 0x0

    .line 18
    goto :goto_0

    .line 19
    :goto_1
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzu:Lcom/google/android/gms/internal/ads/zzv;

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    move-object v0, p0

    .line 23
    move-wide v2, p1

    .line 24
    move-object v4, p3

    .line 25
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzqd;->zzA(IJLcom/google/android/gms/internal/ads/zzv;I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final zzb()Landroid/media/metrics/LogSessionId;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzd:Landroid/media/metrics/PlaybackSession;

    .line 2
    .line 3
    invoke-static {v0}, LV1/h;->d(Landroid/media/metrics/PlaybackSession;)Landroid/media/metrics/LogSessionId;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zznp;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zznp;->zzd:Lcom/google/android/gms/internal/ads/zzxl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzxl;->zzb()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzqd;->zzC()V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzj:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {}, LV1/h;->f()Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-static {p2}, LV1/g;->j(Landroid/media/metrics/PlaybackMetrics$Builder;)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-static {p2}, Lab/d;->i(Landroid/media/metrics/PlaybackMetrics$Builder;)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 30
    .line 31
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zznp;->zzb:Lcom/google/android/gms/internal/ads/zzbf;

    .line 32
    .line 33
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzqd;->zzB(Lcom/google/android/gms/internal/ads/zzbf;Lcom/google/android/gms/internal/ads/zzxl;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zznp;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zznp;->zzd:Lcom/google/android/gms/internal/ads/zzxl;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzxl;->zzb()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzj:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzqd;->zzC()V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzh:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzi:Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final zzde(Lcom/google/android/gms/internal/ads/zznp;Lcom/google/android/gms/internal/ads/zzba;Lcom/google/android/gms/internal/ads/zzba;I)V
    .locals 0

    const/4 p1, 0x1

    if-ne p4, p1, :cond_0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzv:Z

    move p4, p1

    :cond_0
    iput p4, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzl:I

    return-void
.end method

.method public final zzdf(Lcom/google/android/gms/internal/ads/zznp;Lcom/google/android/gms/internal/ads/zzxh;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zznp;->zzd:Lcom/google/android/gms/internal/ads/zzxl;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p2, Lcom/google/android/gms/internal/ads/zzxh;->zzb:Lcom/google/android/gms/internal/ads/zzv;

    .line 7
    .line 8
    new-instance v2, Lcom/google/android/gms/internal/ads/zzqc;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzc:Lcom/google/android/gms/internal/ads/zzqf;

    .line 14
    .line 15
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zznp;->zzb:Lcom/google/android/gms/internal/ads/zzbf;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-interface {v3, p1, v0}, Lcom/google/android/gms/internal/ads/zzqf;->zzb(Lcom/google/android/gms/internal/ads/zzbf;Lcom/google/android/gms/internal/ads/zzxl;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {v2, v1, v4, p1}, Lcom/google/android/gms/internal/ads/zzqc;-><init>(Lcom/google/android/gms/internal/ads/zzv;ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget p1, p2, Lcom/google/android/gms/internal/ads/zzxh;->zza:I

    .line 26
    .line 27
    if-eqz p1, :cond_3

    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    if-eq p1, p2, :cond_2

    .line 31
    .line 32
    const/4 p2, 0x2

    .line 33
    if-eq p1, p2, :cond_3

    .line 34
    .line 35
    const/4 p2, 0x3

    .line 36
    if-eq p1, p2, :cond_1

    .line 37
    .line 38
    :goto_0
    return-void

    .line 39
    :cond_1
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzr:Lcom/google/android/gms/internal/ads/zzqc;

    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzq:Lcom/google/android/gms/internal/ads/zzqc;

    .line 43
    .line 44
    return-void

    .line 45
    :cond_3
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzp:Lcom/google/android/gms/internal/ads/zzqc;

    .line 46
    .line 47
    return-void
.end method

.method public final zzdg(Lcom/google/android/gms/internal/ads/zznp;IJJ)V
    .locals 6

    .line 1
    iget-object p5, p1, Lcom/google/android/gms/internal/ads/zznp;->zzd:Lcom/google/android/gms/internal/ads/zzxl;

    .line 2
    .line 3
    if-eqz p5, :cond_2

    .line 4
    .line 5
    iget-object p6, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzc:Lcom/google/android/gms/internal/ads/zzqf;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zznp;->zzb:Lcom/google/android/gms/internal/ads/zzbf;

    .line 8
    .line 9
    invoke-interface {p6, p1, p5}, Lcom/google/android/gms/internal/ads/zzqf;->zzb(Lcom/google/android/gms/internal/ads/zzbf;Lcom/google/android/gms/internal/ads/zzxl;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p5, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzi:Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {p5, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p6

    .line 19
    check-cast p6, Ljava/lang/Long;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzh:Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/Long;

    .line 28
    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    if-nez p6, :cond_0

    .line 32
    .line 33
    move-wide v4, v2

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p6}, Ljava/lang/Long;->longValue()J

    .line 36
    .line 37
    .line 38
    move-result-wide v4

    .line 39
    :goto_0
    add-long/2addr v4, p3

    .line 40
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    invoke-virtual {p5, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 51
    .line 52
    .line 53
    move-result-wide v2

    .line 54
    :goto_1
    int-to-long p2, p2

    .line 55
    add-long/2addr v2, p2

    .line 56
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_2
    return-void
.end method

.method public final zzdh(Lcom/google/android/gms/internal/ads/zznp;Lcom/google/android/gms/internal/ads/zzjd;)V
    .locals 1

    .line 1
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzx:I

    .line 2
    .line 3
    iget v0, p2, Lcom/google/android/gms/internal/ads/zzjd;->zzg:I

    .line 4
    .line 5
    add-int/2addr p1, v0

    .line 6
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzx:I

    .line 7
    .line 8
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzy:I

    .line 9
    .line 10
    iget p2, p2, Lcom/google/android/gms/internal/ads/zzjd;->zze:I

    .line 11
    .line 12
    add-int/2addr p1, p2

    .line 13
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzy:I

    .line 14
    .line 15
    return-void
.end method

.method public final zzdi(Lcom/google/android/gms/internal/ads/zzbb;Lcom/google/android/gms/internal/ads/zznq;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zznq;->zzc()I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    if-nez v3, :cond_0

    .line 11
    .line 12
    goto/16 :goto_11

    .line 13
    .line 14
    :cond_0
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zznq;->zzc()I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    const/16 v6, 0xb

    .line 21
    .line 22
    if-ge v4, v5, :cond_3

    .line 23
    .line 24
    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/ads/zznq;->zzd(I)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/ads/zznq;->zza(I)Lcom/google/android/gms/internal/ads/zznp;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    if-nez v5, :cond_1

    .line 33
    .line 34
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzc:Lcom/google/android/gms/internal/ads/zzqf;

    .line 35
    .line 36
    invoke-interface {v5, v7}, Lcom/google/android/gms/internal/ads/zzqf;->zzd(Lcom/google/android/gms/internal/ads/zznp;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    if-ne v5, v6, :cond_2

    .line 41
    .line 42
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzc:Lcom/google/android/gms/internal/ads/zzqf;

    .line 43
    .line 44
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzl:I

    .line 45
    .line 46
    invoke-interface {v5, v7, v6}, Lcom/google/android/gms/internal/ads/zzqf;->zze(Lcom/google/android/gms/internal/ads/zznp;I)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzc:Lcom/google/android/gms/internal/ads/zzqf;

    .line 51
    .line 52
    invoke-interface {v5, v7}, Lcom/google/android/gms/internal/ads/zzqf;->zzc(Lcom/google/android/gms/internal/ads/zznp;)V

    .line 53
    .line 54
    .line 55
    :goto_1
    add-int/2addr v4, v2

    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 58
    .line 59
    .line 60
    move-result-wide v4

    .line 61
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zznq;->zzb(I)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-eqz v7, :cond_4

    .line 66
    .line 67
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zznq;->zza(I)Lcom/google/android/gms/internal/ads/zznp;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 72
    .line 73
    if-eqz v8, :cond_4

    .line 74
    .line 75
    iget-object v8, v7, Lcom/google/android/gms/internal/ads/zznp;->zzb:Lcom/google/android/gms/internal/ads/zzbf;

    .line 76
    .line 77
    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zznp;->zzd:Lcom/google/android/gms/internal/ads/zzxl;

    .line 78
    .line 79
    invoke-direct {v0, v8, v7}, Lcom/google/android/gms/internal/ads/zzqd;->zzB(Lcom/google/android/gms/internal/ads/zzbf;Lcom/google/android/gms/internal/ads/zzxl;)V

    .line 80
    .line 81
    .line 82
    :cond_4
    const/4 v7, 0x2

    .line 83
    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/ads/zznq;->zzb(I)Z

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    const/4 v10, 0x3

    .line 88
    const/4 v11, 0x0

    .line 89
    if-eqz v8, :cond_c

    .line 90
    .line 91
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 92
    .line 93
    if-eqz v8, :cond_c

    .line 94
    .line 95
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzbb;->zzp()Lcom/google/android/gms/internal/ads/zzbn;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzbn;->zza()Lcom/google/android/gms/internal/ads/zzgwt;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result v12

    .line 107
    move v13, v3

    .line 108
    :goto_2
    if-ge v13, v12, :cond_7

    .line 109
    .line 110
    invoke-interface {v8, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v14

    .line 114
    check-cast v14, Lcom/google/android/gms/internal/ads/zzbm;

    .line 115
    .line 116
    move v15, v3

    .line 117
    :goto_3
    iget v6, v14, Lcom/google/android/gms/internal/ads/zzbm;->zza:I

    .line 118
    .line 119
    add-int/lit8 v16, v13, 0x1

    .line 120
    .line 121
    if-ge v15, v6, :cond_6

    .line 122
    .line 123
    invoke-virtual {v14, v15}, Lcom/google/android/gms/internal/ads/zzbm;->zzc(I)Z

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-eqz v6, :cond_5

    .line 128
    .line 129
    invoke-virtual {v14, v15}, Lcom/google/android/gms/internal/ads/zzbm;->zza(I)Lcom/google/android/gms/internal/ads/zzv;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzv;->zzt:Lcom/google/android/gms/internal/ads/zzq;

    .line 134
    .line 135
    if-eqz v6, :cond_5

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_5
    add-int/2addr v15, v2

    .line 139
    goto :goto_3

    .line 140
    :cond_6
    move/from16 v13, v16

    .line 141
    .line 142
    const/16 v6, 0xb

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_7
    move-object v6, v11

    .line 146
    :goto_4
    if-eqz v6, :cond_c

    .line 147
    .line 148
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzk:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 149
    .line 150
    sget-object v12, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 151
    .line 152
    invoke-static {v8}, LV1/g;->k(Ljava/lang/Object;)Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    move v12, v3

    .line 157
    :goto_5
    iget v13, v6, Lcom/google/android/gms/internal/ads/zzq;->zzb:I

    .line 158
    .line 159
    if-ge v12, v13, :cond_b

    .line 160
    .line 161
    invoke-virtual {v6, v12}, Lcom/google/android/gms/internal/ads/zzq;->zza(I)Lcom/google/android/gms/internal/ads/zzp;

    .line 162
    .line 163
    .line 164
    move-result-object v13

    .line 165
    iget-object v13, v13, Lcom/google/android/gms/internal/ads/zzp;->zza:Ljava/util/UUID;

    .line 166
    .line 167
    sget-object v14, Lcom/google/android/gms/internal/ads/zzg;->zzd:Ljava/util/UUID;

    .line 168
    .line 169
    invoke-virtual {v13, v14}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v14

    .line 173
    if-eqz v14, :cond_8

    .line 174
    .line 175
    move v6, v10

    .line 176
    goto :goto_6

    .line 177
    :cond_8
    sget-object v14, Lcom/google/android/gms/internal/ads/zzg;->zze:Ljava/util/UUID;

    .line 178
    .line 179
    invoke-virtual {v13, v14}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v14

    .line 183
    if-eqz v14, :cond_9

    .line 184
    .line 185
    move v6, v7

    .line 186
    goto :goto_6

    .line 187
    :cond_9
    sget-object v14, Lcom/google/android/gms/internal/ads/zzg;->zzc:Ljava/util/UUID;

    .line 188
    .line 189
    invoke-virtual {v13, v14}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v13

    .line 193
    if-eqz v13, :cond_a

    .line 194
    .line 195
    const/4 v6, 0x6

    .line 196
    goto :goto_6

    .line 197
    :cond_a
    add-int/2addr v12, v2

    .line 198
    goto :goto_5

    .line 199
    :cond_b
    move v6, v2

    .line 200
    :goto_6
    invoke-static {v8, v6}, LV1/g;->m(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 201
    .line 202
    .line 203
    :cond_c
    const/16 v6, 0x3f3

    .line 204
    .line 205
    invoke-virtual {v1, v6}, Lcom/google/android/gms/internal/ads/zznq;->zzb(I)Z

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    if-eqz v6, :cond_d

    .line 210
    .line 211
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzz:I

    .line 212
    .line 213
    add-int/2addr v6, v2

    .line 214
    iput v6, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzz:I

    .line 215
    .line 216
    :cond_d
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzo:Lcom/google/android/gms/internal/ads/zzau;

    .line 217
    .line 218
    const/16 v16, 0x9

    .line 219
    .line 220
    if-nez v6, :cond_e

    .line 221
    .line 222
    goto/16 :goto_d

    .line 223
    .line 224
    :cond_e
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzqd;->zza:Landroid/content/Context;

    .line 225
    .line 226
    iget v9, v6, Lcom/google/android/gms/internal/ads/zzau;->zza:I

    .line 227
    .line 228
    const/16 v12, 0x3e9

    .line 229
    .line 230
    if-ne v9, v12, :cond_10

    .line 231
    .line 232
    const/16 v8, 0x14

    .line 233
    .line 234
    :cond_f
    :goto_7
    move v9, v3

    .line 235
    goto/16 :goto_c

    .line 236
    .line 237
    :cond_10
    move-object v12, v6

    .line 238
    check-cast v12, Lcom/google/android/gms/internal/ads/zzjm;

    .line 239
    .line 240
    iget v13, v12, Lcom/google/android/gms/internal/ads/zzjm;->zzc:I

    .line 241
    .line 242
    if-ne v13, v2, :cond_11

    .line 243
    .line 244
    move v13, v2

    .line 245
    goto :goto_8

    .line 246
    :cond_11
    move v13, v3

    .line 247
    :goto_8
    iget v12, v12, Lcom/google/android/gms/internal/ads/zzjm;->zzg:I

    .line 248
    .line 249
    invoke-virtual {v6}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 250
    .line 251
    .line 252
    move-result-object v14

    .line 253
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    instance-of v15, v14, Ljava/io/IOException;

    .line 257
    .line 258
    const/16 v17, 0x17

    .line 259
    .line 260
    if-eqz v15, :cond_25

    .line 261
    .line 262
    instance-of v12, v14, Lcom/google/android/gms/internal/ads/zzii;

    .line 263
    .line 264
    if-eqz v12, :cond_12

    .line 265
    .line 266
    check-cast v14, Lcom/google/android/gms/internal/ads/zzii;

    .line 267
    .line 268
    iget v8, v14, Lcom/google/android/gms/internal/ads/zzii;->zzc:I

    .line 269
    .line 270
    move v9, v8

    .line 271
    const/4 v8, 0x5

    .line 272
    goto/16 :goto_c

    .line 273
    .line 274
    :cond_12
    instance-of v12, v14, Lcom/google/android/gms/internal/ads/zzih;

    .line 275
    .line 276
    if-nez v12, :cond_13

    .line 277
    .line 278
    instance-of v12, v14, Lcom/google/android/gms/internal/ads/zzat;

    .line 279
    .line 280
    if-eqz v12, :cond_14

    .line 281
    .line 282
    :cond_13
    move v9, v3

    .line 283
    const/16 v8, 0xb

    .line 284
    .line 285
    goto/16 :goto_c

    .line 286
    .line 287
    :cond_14
    instance-of v12, v14, Lcom/google/android/gms/internal/ads/zzig;

    .line 288
    .line 289
    if-nez v12, :cond_20

    .line 290
    .line 291
    instance-of v13, v14, Lcom/google/android/gms/internal/ads/zziq;

    .line 292
    .line 293
    if-eqz v13, :cond_15

    .line 294
    .line 295
    goto/16 :goto_b

    .line 296
    .line 297
    :cond_15
    const/16 v8, 0x3ea

    .line 298
    .line 299
    if-ne v9, v8, :cond_16

    .line 300
    .line 301
    const/16 v8, 0x15

    .line 302
    .line 303
    goto :goto_7

    .line 304
    :cond_16
    instance-of v8, v14, Lcom/google/android/gms/internal/ads/zzui;

    .line 305
    .line 306
    if-eqz v8, :cond_1d

    .line 307
    .line 308
    invoke-virtual {v14}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 309
    .line 310
    .line 311
    move-result-object v8

    .line 312
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    instance-of v9, v8, Landroid/media/MediaDrm$MediaDrmStateException;

    .line 316
    .line 317
    if-eqz v9, :cond_17

    .line 318
    .line 319
    check-cast v8, Landroid/media/MediaDrm$MediaDrmStateException;

    .line 320
    .line 321
    invoke-virtual {v8}, Landroid/media/MediaDrm$MediaDrmStateException;->getDiagnosticInfo()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v8

    .line 325
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzfm;->zzV(Ljava/lang/String;)I

    .line 326
    .line 327
    .line 328
    move-result v8

    .line 329
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzqd;->zzD(I)I

    .line 330
    .line 331
    .line 332
    move-result v9

    .line 333
    :goto_9
    move/from16 v18, v9

    .line 334
    .line 335
    move v9, v8

    .line 336
    move/from16 v8, v18

    .line 337
    .line 338
    goto/16 :goto_c

    .line 339
    .line 340
    :cond_17
    instance-of v9, v8, Landroid/media/MediaDrmResetException;

    .line 341
    .line 342
    if-eqz v9, :cond_18

    .line 343
    .line 344
    const/16 v8, 0x1b

    .line 345
    .line 346
    goto :goto_7

    .line 347
    :cond_18
    instance-of v9, v8, Landroid/media/NotProvisionedException;

    .line 348
    .line 349
    if-eqz v9, :cond_19

    .line 350
    .line 351
    const/16 v8, 0x18

    .line 352
    .line 353
    goto :goto_7

    .line 354
    :cond_19
    instance-of v9, v8, Landroid/media/DeniedByServerException;

    .line 355
    .line 356
    if-eqz v9, :cond_1a

    .line 357
    .line 358
    const/16 v8, 0x1d

    .line 359
    .line 360
    goto :goto_7

    .line 361
    :cond_1a
    instance-of v9, v8, Lcom/google/android/gms/internal/ads/zzus;

    .line 362
    .line 363
    if-eqz v9, :cond_1b

    .line 364
    .line 365
    :goto_a
    move v9, v3

    .line 366
    move/from16 v8, v17

    .line 367
    .line 368
    goto/16 :goto_c

    .line 369
    .line 370
    :cond_1b
    instance-of v8, v8, Lcom/google/android/gms/internal/ads/zzuh;

    .line 371
    .line 372
    if-eqz v8, :cond_1c

    .line 373
    .line 374
    const/16 v8, 0x1c

    .line 375
    .line 376
    goto/16 :goto_7

    .line 377
    .line 378
    :cond_1c
    const/16 v8, 0x1e

    .line 379
    .line 380
    goto/16 :goto_7

    .line 381
    .line 382
    :cond_1d
    instance-of v8, v14, Lcom/google/android/gms/internal/ads/zzid;

    .line 383
    .line 384
    if-eqz v8, :cond_1f

    .line 385
    .line 386
    invoke-virtual {v14}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 387
    .line 388
    .line 389
    move-result-object v8

    .line 390
    instance-of v8, v8, Ljava/io/FileNotFoundException;

    .line 391
    .line 392
    if-eqz v8, :cond_1f

    .line 393
    .line 394
    invoke-virtual {v14}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 395
    .line 396
    .line 397
    move-result-object v8

    .line 398
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v8}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 402
    .line 403
    .line 404
    move-result-object v8

    .line 405
    instance-of v9, v8, Landroid/system/ErrnoException;

    .line 406
    .line 407
    const/16 v12, 0x1f

    .line 408
    .line 409
    if-eqz v9, :cond_1e

    .line 410
    .line 411
    check-cast v8, Landroid/system/ErrnoException;

    .line 412
    .line 413
    iget v8, v8, Landroid/system/ErrnoException;->errno:I

    .line 414
    .line 415
    sget v9, Landroid/system/OsConstants;->EACCES:I

    .line 416
    .line 417
    if-ne v8, v9, :cond_1e

    .line 418
    .line 419
    const/16 v8, 0x20

    .line 420
    .line 421
    goto/16 :goto_7

    .line 422
    .line 423
    :cond_1e
    move v9, v3

    .line 424
    move v8, v12

    .line 425
    goto/16 :goto_c

    .line 426
    .line 427
    :cond_1f
    move v9, v3

    .line 428
    move/from16 v8, v16

    .line 429
    .line 430
    goto/16 :goto_c

    .line 431
    .line 432
    :cond_20
    :goto_b
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzes;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzes;

    .line 433
    .line 434
    .line 435
    move-result-object v8

    .line 436
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzes;->zzc()I

    .line 437
    .line 438
    .line 439
    move-result v8

    .line 440
    if-ne v8, v2, :cond_21

    .line 441
    .line 442
    move v9, v3

    .line 443
    move v8, v10

    .line 444
    goto/16 :goto_c

    .line 445
    .line 446
    :cond_21
    invoke-virtual {v14}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 447
    .line 448
    .line 449
    move-result-object v8

    .line 450
    instance-of v9, v8, Ljava/net/UnknownHostException;

    .line 451
    .line 452
    if-eqz v9, :cond_22

    .line 453
    .line 454
    move v9, v3

    .line 455
    const/4 v8, 0x6

    .line 456
    goto/16 :goto_c

    .line 457
    .line 458
    :cond_22
    instance-of v8, v8, Ljava/net/SocketTimeoutException;

    .line 459
    .line 460
    if-eqz v8, :cond_23

    .line 461
    .line 462
    move v9, v3

    .line 463
    const/4 v8, 0x7

    .line 464
    goto/16 :goto_c

    .line 465
    .line 466
    :cond_23
    if-eqz v12, :cond_24

    .line 467
    .line 468
    check-cast v14, Lcom/google/android/gms/internal/ads/zzig;

    .line 469
    .line 470
    iget v8, v14, Lcom/google/android/gms/internal/ads/zzig;->zzb:I

    .line 471
    .line 472
    if-ne v8, v2, :cond_24

    .line 473
    .line 474
    move v9, v3

    .line 475
    const/4 v8, 0x4

    .line 476
    goto/16 :goto_c

    .line 477
    .line 478
    :cond_24
    move v9, v3

    .line 479
    const/16 v8, 0x8

    .line 480
    .line 481
    goto/16 :goto_c

    .line 482
    .line 483
    :cond_25
    if-eqz v13, :cond_26

    .line 484
    .line 485
    const/16 v8, 0x23

    .line 486
    .line 487
    if-eqz v12, :cond_f

    .line 488
    .line 489
    if-ne v12, v2, :cond_26

    .line 490
    .line 491
    goto/16 :goto_7

    .line 492
    .line 493
    :cond_26
    if-eqz v13, :cond_27

    .line 494
    .line 495
    if-ne v12, v10, :cond_27

    .line 496
    .line 497
    const/16 v8, 0xf

    .line 498
    .line 499
    goto/16 :goto_7

    .line 500
    .line 501
    :cond_27
    if-eqz v13, :cond_28

    .line 502
    .line 503
    if-ne v12, v7, :cond_28

    .line 504
    .line 505
    goto/16 :goto_a

    .line 506
    .line 507
    :cond_28
    instance-of v8, v14, Lcom/google/android/gms/internal/ads/zzvs;

    .line 508
    .line 509
    if-eqz v8, :cond_29

    .line 510
    .line 511
    check-cast v14, Lcom/google/android/gms/internal/ads/zzvs;

    .line 512
    .line 513
    iget-object v8, v14, Lcom/google/android/gms/internal/ads/zzvs;->zzd:Ljava/lang/String;

    .line 514
    .line 515
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzfm;->zzV(Ljava/lang/String;)I

    .line 516
    .line 517
    .line 518
    move-result v8

    .line 519
    move v9, v8

    .line 520
    const/16 v8, 0xd

    .line 521
    .line 522
    goto :goto_c

    .line 523
    :cond_29
    instance-of v8, v14, Lcom/google/android/gms/internal/ads/zzvo;

    .line 524
    .line 525
    const/16 v9, 0xe

    .line 526
    .line 527
    if-eqz v8, :cond_2a

    .line 528
    .line 529
    check-cast v14, Lcom/google/android/gms/internal/ads/zzvo;

    .line 530
    .line 531
    iget v8, v14, Lcom/google/android/gms/internal/ads/zzvo;->zza:I

    .line 532
    .line 533
    goto/16 :goto_9

    .line 534
    .line 535
    :cond_2a
    instance-of v8, v14, Ljava/lang/OutOfMemoryError;

    .line 536
    .line 537
    if-eqz v8, :cond_2b

    .line 538
    .line 539
    move v8, v9

    .line 540
    goto/16 :goto_7

    .line 541
    .line 542
    :cond_2b
    instance-of v8, v14, Lcom/google/android/gms/internal/ads/zzsc;

    .line 543
    .line 544
    if-eqz v8, :cond_2c

    .line 545
    .line 546
    check-cast v14, Lcom/google/android/gms/internal/ads/zzsc;

    .line 547
    .line 548
    const/16 v8, 0x11

    .line 549
    .line 550
    goto/16 :goto_7

    .line 551
    .line 552
    :cond_2c
    instance-of v8, v14, Lcom/google/android/gms/internal/ads/zzsf;

    .line 553
    .line 554
    if-eqz v8, :cond_2d

    .line 555
    .line 556
    check-cast v14, Lcom/google/android/gms/internal/ads/zzsf;

    .line 557
    .line 558
    iget v8, v14, Lcom/google/android/gms/internal/ads/zzsf;->zza:I

    .line 559
    .line 560
    const/16 v9, 0x12

    .line 561
    .line 562
    goto/16 :goto_9

    .line 563
    .line 564
    :cond_2d
    instance-of v8, v14, Landroid/media/MediaCodec$CryptoException;

    .line 565
    .line 566
    if-eqz v8, :cond_2e

    .line 567
    .line 568
    check-cast v14, Landroid/media/MediaCodec$CryptoException;

    .line 569
    .line 570
    invoke-virtual {v14}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 571
    .line 572
    .line 573
    move-result v8

    .line 574
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzqd;->zzD(I)I

    .line 575
    .line 576
    .line 577
    move-result v9

    .line 578
    goto/16 :goto_9

    .line 579
    .line 580
    :cond_2e
    const/16 v8, 0x16

    .line 581
    .line 582
    goto/16 :goto_7

    .line 583
    .line 584
    :goto_c
    invoke-static {}, LV1/g;->e()Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 585
    .line 586
    .line 587
    move-result-object v12

    .line 588
    iget-wide v13, v0, Lcom/google/android/gms/internal/ads/zzqd;->zze:J

    .line 589
    .line 590
    sub-long v13, v4, v13

    .line 591
    .line 592
    invoke-static {v12, v13, v14}, LV1/g;->g(Landroid/media/metrics/PlaybackErrorEvent$Builder;J)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 593
    .line 594
    .line 595
    move-result-object v12

    .line 596
    invoke-static {v12, v8}, LV1/g;->f(Landroid/media/metrics/PlaybackErrorEvent$Builder;I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 597
    .line 598
    .line 599
    move-result-object v8

    .line 600
    invoke-static {v8, v9}, LV1/g;->t(Landroid/media/metrics/PlaybackErrorEvent$Builder;I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 601
    .line 602
    .line 603
    move-result-object v8

    .line 604
    invoke-static {v8, v6}, Lab/d;->h(Landroid/media/metrics/PlaybackErrorEvent$Builder;Ljava/lang/Exception;)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    .line 605
    .line 606
    .line 607
    move-result-object v6

    .line 608
    invoke-static {v6}, LV1/g;->i(Landroid/media/metrics/PlaybackErrorEvent$Builder;)Landroid/media/metrics/PlaybackErrorEvent;

    .line 609
    .line 610
    .line 611
    move-result-object v6

    .line 612
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzb:Ljava/util/concurrent/Executor;

    .line 613
    .line 614
    new-instance v9, Lcom/google/android/gms/internal/ads/zzqb;

    .line 615
    .line 616
    invoke-direct {v9, v0, v6}, Lcom/google/android/gms/internal/ads/zzqb;-><init>(Lcom/google/android/gms/internal/ads/zzqd;Landroid/media/metrics/PlaybackErrorEvent;)V

    .line 617
    .line 618
    .line 619
    invoke-interface {v8, v9}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 620
    .line 621
    .line 622
    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzA:Z

    .line 623
    .line 624
    iput-object v11, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzo:Lcom/google/android/gms/internal/ads/zzau;

    .line 625
    .line 626
    :goto_d
    invoke-virtual {v1, v7}, Lcom/google/android/gms/internal/ads/zznq;->zzb(I)Z

    .line 627
    .line 628
    .line 629
    move-result v6

    .line 630
    if-eqz v6, :cond_32

    .line 631
    .line 632
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzbb;->zzp()Lcom/google/android/gms/internal/ads/zzbn;

    .line 633
    .line 634
    .line 635
    move-result-object v6

    .line 636
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzbn;->zzb(I)Z

    .line 637
    .line 638
    .line 639
    move-result v8

    .line 640
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzbn;->zzb(I)Z

    .line 641
    .line 642
    .line 643
    move-result v9

    .line 644
    invoke-virtual {v6, v10}, Lcom/google/android/gms/internal/ads/zzbn;->zzb(I)Z

    .line 645
    .line 646
    .line 647
    move-result v6

    .line 648
    if-nez v8, :cond_2f

    .line 649
    .line 650
    if-nez v9, :cond_2f

    .line 651
    .line 652
    if-eqz v6, :cond_32

    .line 653
    .line 654
    move v6, v2

    .line 655
    :cond_2f
    if-nez v8, :cond_30

    .line 656
    .line 657
    invoke-direct {v0, v4, v5, v11, v3}, Lcom/google/android/gms/internal/ads/zzqd;->zzx(JLcom/google/android/gms/internal/ads/zzv;I)V

    .line 658
    .line 659
    .line 660
    :cond_30
    if-nez v9, :cond_31

    .line 661
    .line 662
    invoke-direct {v0, v4, v5, v11, v3}, Lcom/google/android/gms/internal/ads/zzqd;->zzy(JLcom/google/android/gms/internal/ads/zzv;I)V

    .line 663
    .line 664
    .line 665
    :cond_31
    if-nez v6, :cond_32

    .line 666
    .line 667
    invoke-direct {v0, v4, v5, v11, v3}, Lcom/google/android/gms/internal/ads/zzqd;->zzz(JLcom/google/android/gms/internal/ads/zzv;I)V

    .line 668
    .line 669
    .line 670
    :cond_32
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzp:Lcom/google/android/gms/internal/ads/zzqc;

    .line 671
    .line 672
    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/ads/zzqd;->zzw(Lcom/google/android/gms/internal/ads/zzqc;)Z

    .line 673
    .line 674
    .line 675
    move-result v6

    .line 676
    if-eqz v6, :cond_33

    .line 677
    .line 678
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzp:Lcom/google/android/gms/internal/ads/zzqc;

    .line 679
    .line 680
    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzqc;->zza:Lcom/google/android/gms/internal/ads/zzv;

    .line 681
    .line 682
    iget v8, v6, Lcom/google/android/gms/internal/ads/zzv;->zzx:I

    .line 683
    .line 684
    const/4 v9, -0x1

    .line 685
    if-eq v8, v9, :cond_33

    .line 686
    .line 687
    invoke-direct {v0, v4, v5, v6, v3}, Lcom/google/android/gms/internal/ads/zzqd;->zzx(JLcom/google/android/gms/internal/ads/zzv;I)V

    .line 688
    .line 689
    .line 690
    iput-object v11, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzp:Lcom/google/android/gms/internal/ads/zzqc;

    .line 691
    .line 692
    :cond_33
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzq:Lcom/google/android/gms/internal/ads/zzqc;

    .line 693
    .line 694
    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/ads/zzqd;->zzw(Lcom/google/android/gms/internal/ads/zzqc;)Z

    .line 695
    .line 696
    .line 697
    move-result v6

    .line 698
    if-eqz v6, :cond_34

    .line 699
    .line 700
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzq:Lcom/google/android/gms/internal/ads/zzqc;

    .line 701
    .line 702
    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzqc;->zza:Lcom/google/android/gms/internal/ads/zzv;

    .line 703
    .line 704
    invoke-direct {v0, v4, v5, v6, v3}, Lcom/google/android/gms/internal/ads/zzqd;->zzy(JLcom/google/android/gms/internal/ads/zzv;I)V

    .line 705
    .line 706
    .line 707
    iput-object v11, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzq:Lcom/google/android/gms/internal/ads/zzqc;

    .line 708
    .line 709
    :cond_34
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzr:Lcom/google/android/gms/internal/ads/zzqc;

    .line 710
    .line 711
    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/ads/zzqd;->zzw(Lcom/google/android/gms/internal/ads/zzqc;)Z

    .line 712
    .line 713
    .line 714
    move-result v6

    .line 715
    if-eqz v6, :cond_35

    .line 716
    .line 717
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzr:Lcom/google/android/gms/internal/ads/zzqc;

    .line 718
    .line 719
    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzqc;->zza:Lcom/google/android/gms/internal/ads/zzv;

    .line 720
    .line 721
    invoke-direct {v0, v4, v5, v6, v3}, Lcom/google/android/gms/internal/ads/zzqd;->zzz(JLcom/google/android/gms/internal/ads/zzv;I)V

    .line 722
    .line 723
    .line 724
    iput-object v11, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzr:Lcom/google/android/gms/internal/ads/zzqc;

    .line 725
    .line 726
    :cond_35
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzqd;->zza:Landroid/content/Context;

    .line 727
    .line 728
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzes;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzes;

    .line 729
    .line 730
    .line 731
    move-result-object v6

    .line 732
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzes;->zzc()I

    .line 733
    .line 734
    .line 735
    move-result v6

    .line 736
    packed-switch v6, :pswitch_data_0

    .line 737
    .line 738
    .line 739
    :pswitch_0
    move v12, v2

    .line 740
    goto :goto_e

    .line 741
    :pswitch_1
    const/4 v12, 0x7

    .line 742
    goto :goto_e

    .line 743
    :pswitch_2
    const/16 v12, 0x8

    .line 744
    .line 745
    goto :goto_e

    .line 746
    :pswitch_3
    move v12, v10

    .line 747
    goto :goto_e

    .line 748
    :pswitch_4
    const/4 v12, 0x6

    .line 749
    goto :goto_e

    .line 750
    :pswitch_5
    const/4 v12, 0x5

    .line 751
    goto :goto_e

    .line 752
    :pswitch_6
    const/4 v12, 0x4

    .line 753
    goto :goto_e

    .line 754
    :pswitch_7
    move v12, v7

    .line 755
    goto :goto_e

    .line 756
    :pswitch_8
    move/from16 v12, v16

    .line 757
    .line 758
    goto :goto_e

    .line 759
    :pswitch_9
    move v12, v3

    .line 760
    :goto_e
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzn:I

    .line 761
    .line 762
    if-eq v12, v6, :cond_36

    .line 763
    .line 764
    iput v12, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzn:I

    .line 765
    .line 766
    invoke-static {}, LV1/g;->a()Landroid/media/metrics/NetworkEvent$Builder;

    .line 767
    .line 768
    .line 769
    move-result-object v6

    .line 770
    invoke-static {v6, v12}, LV1/g;->b(Landroid/media/metrics/NetworkEvent$Builder;I)Landroid/media/metrics/NetworkEvent$Builder;

    .line 771
    .line 772
    .line 773
    move-result-object v6

    .line 774
    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/zzqd;->zze:J

    .line 775
    .line 776
    sub-long v8, v4, v8

    .line 777
    .line 778
    invoke-static {v6, v8, v9}, LV1/g;->c(Landroid/media/metrics/NetworkEvent$Builder;J)Landroid/media/metrics/NetworkEvent$Builder;

    .line 779
    .line 780
    .line 781
    move-result-object v6

    .line 782
    invoke-static {v6}, LV1/g;->d(Landroid/media/metrics/NetworkEvent$Builder;)Landroid/media/metrics/NetworkEvent;

    .line 783
    .line 784
    .line 785
    move-result-object v6

    .line 786
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzb:Ljava/util/concurrent/Executor;

    .line 787
    .line 788
    new-instance v9, Lcom/google/android/gms/internal/ads/zzpx;

    .line 789
    .line 790
    invoke-direct {v9, v0, v6}, Lcom/google/android/gms/internal/ads/zzpx;-><init>(Lcom/google/android/gms/internal/ads/zzqd;Landroid/media/metrics/NetworkEvent;)V

    .line 791
    .line 792
    .line 793
    invoke-interface {v8, v9}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 794
    .line 795
    .line 796
    :cond_36
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzbb;->zzh()I

    .line 797
    .line 798
    .line 799
    move-result v6

    .line 800
    if-eq v6, v7, :cond_37

    .line 801
    .line 802
    iput-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzv:Z

    .line 803
    .line 804
    :cond_37
    move-object/from16 v6, p1

    .line 805
    .line 806
    check-cast v6, Lcom/google/android/gms/internal/ads/zznm;

    .line 807
    .line 808
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zznm;->zzI()Lcom/google/android/gms/internal/ads/zzjm;

    .line 809
    .line 810
    .line 811
    move-result-object v6

    .line 812
    const/16 v8, 0xa

    .line 813
    .line 814
    if-nez v6, :cond_38

    .line 815
    .line 816
    iput-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzw:Z

    .line 817
    .line 818
    goto :goto_f

    .line 819
    :cond_38
    invoke-virtual {v1, v8}, Lcom/google/android/gms/internal/ads/zznq;->zzb(I)Z

    .line 820
    .line 821
    .line 822
    move-result v3

    .line 823
    if-eqz v3, :cond_39

    .line 824
    .line 825
    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzw:Z

    .line 826
    .line 827
    :cond_39
    :goto_f
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzbb;->zzh()I

    .line 828
    .line 829
    .line 830
    move-result v3

    .line 831
    iget-boolean v6, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzv:Z

    .line 832
    .line 833
    if-eqz v6, :cond_3a

    .line 834
    .line 835
    const/4 v6, 0x5

    .line 836
    goto :goto_10

    .line 837
    :cond_3a
    iget-boolean v6, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzw:Z

    .line 838
    .line 839
    if-eqz v6, :cond_3b

    .line 840
    .line 841
    const/16 v6, 0xd

    .line 842
    .line 843
    goto :goto_10

    .line 844
    :cond_3b
    const/4 v6, 0x4

    .line 845
    if-ne v3, v6, :cond_3c

    .line 846
    .line 847
    const/16 v6, 0xb

    .line 848
    .line 849
    goto :goto_10

    .line 850
    :cond_3c
    const/16 v9, 0xc

    .line 851
    .line 852
    if-ne v3, v7, :cond_41

    .line 853
    .line 854
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzm:I

    .line 855
    .line 856
    if-eqz v3, :cond_3d

    .line 857
    .line 858
    if-eq v3, v7, :cond_3d

    .line 859
    .line 860
    if-ne v3, v9, :cond_3e

    .line 861
    .line 862
    :cond_3d
    move v6, v7

    .line 863
    goto :goto_10

    .line 864
    :cond_3e
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzbb;->zzk()Z

    .line 865
    .line 866
    .line 867
    move-result v3

    .line 868
    if-nez v3, :cond_3f

    .line 869
    .line 870
    const/4 v6, 0x7

    .line 871
    goto :goto_10

    .line 872
    :cond_3f
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzbb;->zzi()I

    .line 873
    .line 874
    .line 875
    move-result v3

    .line 876
    if-eqz v3, :cond_40

    .line 877
    .line 878
    move v6, v8

    .line 879
    goto :goto_10

    .line 880
    :cond_40
    const/4 v6, 0x6

    .line 881
    goto :goto_10

    .line 882
    :cond_41
    if-ne v3, v10, :cond_44

    .line 883
    .line 884
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzbb;->zzk()Z

    .line 885
    .line 886
    .line 887
    move-result v3

    .line 888
    if-nez v3, :cond_42

    .line 889
    .line 890
    goto :goto_10

    .line 891
    :cond_42
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzbb;->zzi()I

    .line 892
    .line 893
    .line 894
    move-result v3

    .line 895
    if-eqz v3, :cond_43

    .line 896
    .line 897
    move/from16 v6, v16

    .line 898
    .line 899
    goto :goto_10

    .line 900
    :cond_43
    move v6, v10

    .line 901
    goto :goto_10

    .line 902
    :cond_44
    if-ne v3, v2, :cond_45

    .line 903
    .line 904
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzm:I

    .line 905
    .line 906
    if-eqz v3, :cond_45

    .line 907
    .line 908
    move v6, v9

    .line 909
    goto :goto_10

    .line 910
    :cond_45
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzm:I

    .line 911
    .line 912
    :goto_10
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzm:I

    .line 913
    .line 914
    if-eq v3, v6, :cond_46

    .line 915
    .line 916
    iput v6, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzm:I

    .line 917
    .line 918
    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzA:Z

    .line 919
    .line 920
    invoke-static {}, LV1/h;->i()Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 921
    .line 922
    .line 923
    move-result-object v2

    .line 924
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzm:I

    .line 925
    .line 926
    invoke-static {v2, v3}, LV1/h;->j(Landroid/media/metrics/PlaybackStateEvent$Builder;I)Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/zzqd;->zze:J

    .line 931
    .line 932
    sub-long/2addr v4, v6

    .line 933
    invoke-static {v2, v4, v5}, LV1/h;->k(Landroid/media/metrics/PlaybackStateEvent$Builder;J)Landroid/media/metrics/PlaybackStateEvent$Builder;

    .line 934
    .line 935
    .line 936
    move-result-object v2

    .line 937
    invoke-static {v2}, LV1/h;->l(Landroid/media/metrics/PlaybackStateEvent$Builder;)Landroid/media/metrics/PlaybackStateEvent;

    .line 938
    .line 939
    .line 940
    move-result-object v2

    .line 941
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzb:Ljava/util/concurrent/Executor;

    .line 942
    .line 943
    new-instance v4, Lcom/google/android/gms/internal/ads/zzpy;

    .line 944
    .line 945
    invoke-direct {v4, v0, v2}, Lcom/google/android/gms/internal/ads/zzpy;-><init>(Lcom/google/android/gms/internal/ads/zzqd;Landroid/media/metrics/PlaybackStateEvent;)V

    .line 946
    .line 947
    .line 948
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 949
    .line 950
    .line 951
    :cond_46
    const/16 v2, 0x404

    .line 952
    .line 953
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zznq;->zzb(I)Z

    .line 954
    .line 955
    .line 956
    move-result v3

    .line 957
    if-eqz v3, :cond_47

    .line 958
    .line 959
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzqd;->zzc:Lcom/google/android/gms/internal/ads/zzqf;

    .line 960
    .line 961
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zznq;->zza(I)Lcom/google/android/gms/internal/ads/zznp;

    .line 962
    .line 963
    .line 964
    move-result-object v1

    .line 965
    invoke-interface {v3, v1}, Lcom/google/android/gms/internal/ads/zzqf;->zzg(Lcom/google/android/gms/internal/ads/zznp;)V

    .line 966
    .line 967
    .line 968
    :cond_47
    :goto_11
    return-void

    .line 969
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final synthetic zze(Lcom/google/android/gms/internal/ads/zznp;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/J;->f(Lcom/google/android/gms/internal/ads/zznr;Lcom/google/android/gms/internal/ads/zznp;I)V

    return-void
.end method

.method public final zzg(Lcom/google/android/gms/internal/ads/zznp;Lcom/google/android/gms/internal/ads/zzau;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzo:Lcom/google/android/gms/internal/ads/zzau;

    return-void
.end method

.method public final zzh(Lcom/google/android/gms/internal/ads/zznp;Lcom/google/android/gms/internal/ads/zzxc;Lcom/google/android/gms/internal/ads/zzxh;Ljava/io/IOException;Z)V
    .locals 0

    return-void
.end method

.method public final synthetic zzk(Lcom/google/android/gms/internal/ads/zznp;Lcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzje;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/J;->i(Lcom/google/android/gms/internal/ads/zznr;Lcom/google/android/gms/internal/ads/zznp;Lcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzje;)V

    return-void
.end method

.method public final synthetic zzl(Lcom/google/android/gms/internal/ads/zznp;Lcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzje;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/J;->j(Lcom/google/android/gms/internal/ads/zznr;Lcom/google/android/gms/internal/ads/zznp;Lcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzje;)V

    return-void
.end method

.method public final synthetic zzm(Lcom/google/android/gms/internal/ads/zznp;IJ)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/J;->k(Lcom/google/android/gms/internal/ads/zznr;Lcom/google/android/gms/internal/ads/zznp;IJ)V

    return-void
.end method

.method public final synthetic zzo(Lcom/google/android/gms/internal/ads/zznp;Ljava/lang/Object;J)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/J;->l(Lcom/google/android/gms/internal/ads/zznr;Lcom/google/android/gms/internal/ads/zznp;Ljava/lang/Object;J)V

    return-void
.end method

.method public final zzp(Lcom/google/android/gms/internal/ads/zznp;Lcom/google/android/gms/internal/ads/zzbv;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzp:Lcom/google/android/gms/internal/ads/zzqc;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzqc;->zza:Lcom/google/android/gms/internal/ads/zzv;

    .line 6
    .line 7
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzv;->zzx:I

    .line 8
    .line 9
    const/4 v2, -0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v1, p2, Lcom/google/android/gms/internal/ads/zzbv;->zzb:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzt;->zzv(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 19
    .line 20
    .line 21
    iget p2, p2, Lcom/google/android/gms/internal/ads/zzbv;->zzc:I

    .line 22
    .line 23
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzt;->zzw(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzqc;->zzc:Ljava/lang/String;

    .line 31
    .line 32
    new-instance v0, Lcom/google/android/gms/internal/ads/zzqc;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-direct {v0, p2, v1, p1}, Lcom/google/android/gms/internal/ads/zzqc;-><init>(Lcom/google/android/gms/internal/ads/zzv;ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzp:Lcom/google/android/gms/internal/ads/zzqc;

    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public final synthetic zzr(Landroid/media/metrics/PlaybackErrorEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzd:Landroid/media/metrics/PlaybackSession;

    .line 2
    .line 3
    invoke-static {v0, p1}, LV1/g;->o(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackErrorEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final synthetic zzs(Landroid/media/metrics/NetworkEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzd:Landroid/media/metrics/PlaybackSession;

    .line 2
    .line 3
    invoke-static {v0, p1}, LV1/g;->n(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/NetworkEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final synthetic zzt(Landroid/media/metrics/PlaybackStateEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzd:Landroid/media/metrics/PlaybackSession;

    .line 2
    .line 3
    invoke-static {v0, p1}, LV1/h;->s(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackStateEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final synthetic zzu(Landroid/media/metrics/TrackChangeEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzd:Landroid/media/metrics/PlaybackSession;

    .line 2
    .line 3
    invoke-static {v0, p1}, LV1/g;->p(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/TrackChangeEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final synthetic zzv(Landroid/media/metrics/PlaybackMetrics;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzqd;->zzd:Landroid/media/metrics/PlaybackSession;

    .line 2
    .line 3
    invoke-static {v0, p1}, LV1/h;->r(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackMetrics;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
