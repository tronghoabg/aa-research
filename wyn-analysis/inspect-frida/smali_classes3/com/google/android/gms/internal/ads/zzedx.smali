.class public final Lcom/google/android/gms/internal/ads/zzedx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zza:Lx6/g;

.field private zzb:Lcom/google/android/gms/ads/nativead/g;

.field private zzc:Lx6/w;

.field private zzd:Lcom/google/android/gms/ads/AdSize;

.field private zze:Ljava/lang/String;

.field private zzf:Ljava/lang/String;

.field private zzg:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/google/android/gms/ads/AdSize;->i:Lcom/google/android/gms/ads/AdSize;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzedx;->zzd:Lcom/google/android/gms/ads/AdSize;

    .line 7
    .line 8
    const-string v0, ""

    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzedx;->zze:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzedx;->zzf:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzedx;->zzg:Z

    .line 16
    .line 17
    const-string v0, "request_origin"

    .line 18
    .line 19
    const-string v1, "inspector_ooct"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lka/n;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 26
    .line 27
    const/16 v2, 0xe

    .line 28
    .line 29
    invoke-direct {v1, v2}, LA7/B0;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const-class v2, Lcom/google/ads/mediation/admob/AdMobAdapter;

    .line 33
    .line 34
    invoke-virtual {v1, v2, v0}, LA7/B0;->x(Ljava/lang/Class;Landroid/os/Bundle;)LA7/B0;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 39
    .line 40
    new-instance v1, Lx6/g;

    .line 41
    .line 42
    invoke-direct {v1, v0}, Lx6/g;-><init>(LA7/B0;)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzedx;->zza:Lx6/g;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzedx;->zze:Ljava/lang/String;

    return-object v0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzedx;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public final zzc()Lx6/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzedx;->zza:Lx6/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/ads/AdSize;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzedx;->zzd:Lcom/google/android/gms/ads/AdSize;

    return-object v0
.end method

.method public final zze()Lcom/google/android/gms/ads/nativead/g;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzedx;->zzb:Lcom/google/android/gms/ads/nativead/g;

    return-object v0
.end method

.method public final zzf()Lx6/w;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzedx;->zzc:Lx6/w;

    .line 2
    .line 3
    return-object v0
.end method

.method public final zzg()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzedx;->zzg:Z

    return v0
.end method

.method public final zzh(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzedx;->zze:Ljava/lang/String;

    return-void
.end method

.method public final zzi(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzedx;->zzf:Ljava/lang/String;

    return-void
.end method

.method public final zzj(Lx6/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzedx;->zza:Lx6/g;

    .line 2
    .line 3
    return-void
.end method

.method public final zzk(Lcom/google/android/gms/ads/AdSize;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzedx;->zzd:Lcom/google/android/gms/ads/AdSize;

    return-void
.end method

.method public final zzl(Lcom/google/android/gms/ads/nativead/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzedx;->zzb:Lcom/google/android/gms/ads/nativead/g;

    return-void
.end method

.method public final zzm(Lx6/w;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzedx;->zzc:Lx6/w;

    .line 2
    .line 3
    return-void
.end method

.method public final zzn(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzedx;->zzg:Z

    return-void
.end method
