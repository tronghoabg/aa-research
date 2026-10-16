.class public final Lcom/google/android/gms/internal/ads/zzdce;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzfps;

.field private final zzb:LH6/a;

.field private final zzc:Landroid/content/pm/ApplicationInfo;

.field private final zzd:Ljava/lang/String;

.field private final zze:Ljava/util/List;

.field private final zzf:Landroid/content/pm/PackageInfo;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzimt;

.field private final zzh:Ljava/lang/String;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzfcv;

.field private final zzj:LG6/N;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzflg;

.field private final zzl:Lcom/google/android/gms/internal/ads/zzdis;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzfps;LH6/a;Landroid/content/pm/ApplicationInfo;Ljava/lang/String;Ljava/util/List;Landroid/content/pm/PackageInfo;Lcom/google/android/gms/internal/ads/zzimt;LG6/N;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzfcv;Lcom/google/android/gms/internal/ads/zzflg;Lcom/google/android/gms/internal/ads/zzdis;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdce;->zza:Lcom/google/android/gms/internal/ads/zzfps;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzb:LH6/a;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzc:Landroid/content/pm/ApplicationInfo;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzd:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzdce;->zze:Ljava/util/List;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzf:Landroid/content/pm/PackageInfo;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzg:Lcom/google/android/gms/internal/ads/zzimt;

    .line 17
    .line 18
    iput-object p9, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzh:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p10, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzi:Lcom/google/android/gms/internal/ads/zzfcv;

    .line 21
    .line 22
    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzj:LG6/N;

    .line 23
    .line 24
    iput-object p11, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzk:Lcom/google/android/gms/internal/ads/zzflg;

    .line 25
    .line 26
    iput-object p12, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzl:Lcom/google/android/gms/internal/ads/zzdis;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final zza(Landroid/os/Bundle;)Lp8/p;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzl:Lcom/google/android/gms/internal/ads/zzdis;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdis;->zza()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfpm;->zza:Lcom/google/android/gms/internal/ads/zzfpm;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdce;->zza:Lcom/google/android/gms/internal/ads/zzfps;

    .line 9
    .line 10
    invoke-static {v1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    new-instance v2, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzi:Lcom/google/android/gms/internal/ads/zzfcv;

    .line 19
    .line 20
    invoke-virtual {v3, v2, p1}, Lcom/google/android/gms/internal/ads/zzfcv;->zza(Ljava/lang/Object;Landroid/os/Bundle;)Lp8/p;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzfpd;->zza(Lp8/p;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzfpk;)Lcom/google/android/gms/internal/ads/zzfpj;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfpj;->zzi()Lcom/google/android/gms/internal/ads/zzfoz;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
.end method

.method public final zzb()Lp8/p;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    new-instance v1, Landroid/os/Bundle;

    .line 3
    .line 4
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 5
    .line 6
    .line 7
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbix;->zzcS:Lcom/google/android/gms/internal/ads/zzbio;

    .line 8
    .line 9
    sget-object v3, LD6/s;->e:LD6/s;

    .line 10
    .line 11
    iget-object v3, v3, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzk:Lcom/google/android/gms/internal/ads/zzflg;

    .line 26
    .line 27
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzflg;->zzt:Landroid/os/Bundle;

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    const-string v2, "ls"

    .line 35
    .line 36
    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzdce;->zza(Landroid/os/Bundle;)Lp8/p;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdce;->zza:Lcom/google/android/gms/internal/ads/zzfps;

    .line 44
    .line 45
    sget-object v4, Lcom/google/android/gms/internal/ads/zzfpm;->zzb:Lcom/google/android/gms/internal/ads/zzfpm;

    .line 46
    .line 47
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzg:Lcom/google/android/gms/internal/ads/zzimt;

    .line 48
    .line 49
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzimt;->zzb()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, Lp8/p;

    .line 54
    .line 55
    const/4 v6, 0x2

    .line 56
    new-array v6, v6, [Lp8/p;

    .line 57
    .line 58
    aput-object v2, v6, v0

    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    aput-object v5, v6, v0

    .line 62
    .line 63
    invoke-virtual {v3, v4, v6}, Lcom/google/android/gms/internal/ads/zzfpk;->zzb(Ljava/lang/Object;[Lp8/p;)Lcom/google/android/gms/internal/ads/zzfpb;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v3, Lcom/google/android/gms/internal/ads/zzdcd;

    .line 68
    .line 69
    invoke-direct {v3, p0, v2, v1}, Lcom/google/android/gms/internal/ads/zzdcd;-><init>(Lcom/google/android/gms/internal/ads/zzdce;Lp8/p;Landroid/os/Bundle;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzfpb;->zza(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/zzfpj;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfpj;->zzi()Lcom/google/android/gms/internal/ads/zzfoz;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0
.end method

.method public final zzc(Lp8/p;Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/zzcbk;
    .locals 14

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzcbk;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Landroid/os/Bundle;

    .line 9
    .line 10
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzg:Lcom/google/android/gms/internal/ads/zzimt;

    .line 11
    .line 12
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzimt;->zzb()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lp8/p;

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    move-object v7, p1

    .line 23
    check-cast v7, Ljava/lang/String;

    .line 24
    .line 25
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbix;->zzid:Lcom/google/android/gms/internal/ads/zzbio;

    .line 26
    .line 27
    sget-object v2, LD6/s;->e:LD6/s;

    .line 28
    .line 29
    iget-object v2, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 30
    .line 31
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    const/4 v2, 0x0

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzj:LG6/N;

    .line 45
    .line 46
    check-cast p1, LG6/O;

    .line 47
    .line 48
    invoke-virtual {p1}, LG6/O;->D()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_0

    .line 53
    .line 54
    const/4 v2, 0x1

    .line 55
    :cond_0
    move v11, v2

    .line 56
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzh:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzf:Landroid/content/pm/PackageInfo;

    .line 59
    .line 60
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzdce;->zze:Ljava/util/List;

    .line 61
    .line 62
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzd:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzc:Landroid/content/pm/ApplicationInfo;

    .line 65
    .line 66
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzb:LH6/a;

    .line 67
    .line 68
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdce;->zzk:Lcom/google/android/gms/internal/ads/zzflg;

    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzflg;->zza()Z

    .line 71
    .line 72
    .line 73
    move-result v12

    .line 74
    const/4 v9, 0x0

    .line 75
    const/4 v10, 0x0

    .line 76
    move-object/from16 v13, p2

    .line 77
    .line 78
    invoke-direct/range {v0 .. v13}, Lcom/google/android/gms/internal/ads/zzcbk;-><init>(Landroid/os/Bundle;LH6/a;Landroid/content/pm/ApplicationInfo;Ljava/lang/String;Ljava/util/List;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzfnc;Ljava/lang/String;ZZLandroid/os/Bundle;)V

    .line 79
    .line 80
    .line 81
    return-object v0
.end method
