.class public final Lcom/google/android/gms/internal/ads/zzchj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzchu;

.field private final zzc:Landroid/view/ViewGroup;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzdzt;

.field private zze:Lcom/google/android/gms/internal/ads/zzchi;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/google/android/gms/internal/ads/zzclb;Lcom/google/android/gms/internal/ads/zzdzt;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzchj;->zza:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzchj;->zzc:Landroid/view/ViewGroup;

    .line 17
    .line 18
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzchj;->zzb:Lcom/google/android/gms/internal/ads/zzchu;

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzchj;->zze:Lcom/google/android/gms/internal/ads/zzchi;

    .line 22
    .line 23
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzchj;->zzd:Lcom/google/android/gms/internal/ads/zzdzt;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzchj;->zze:Lcom/google/android/gms/internal/ads/zzchi;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzchi;->zzl()Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzb(IIII)V
    .locals 1

    .line 1
    const-string v0, "The underlay may only be modified from the UI thread."

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->e(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzchj;->zze:Lcom/google/android/gms/internal/ads/zzchi;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzchi;->zzn(IIII)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final zzc(IIIIIZLcom/google/android/gms/internal/ads/zzcht;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzchj;->zze:Lcom/google/android/gms/internal/ads/zzchi;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzchj;->zzb:Lcom/google/android/gms/internal/ads/zzchu;

    .line 7
    .line 8
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzchu;->zzq()Lcom/google/android/gms/internal/ads/zzbjk;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbjk;->zzc()Lcom/google/android/gms/internal/ads/zzbjm;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzchu;->zzi()Lcom/google/android/gms/internal/ads/zzbjj;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "vpr2"

    .line 21
    .line 22
    filled-new-array {v2}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzbje;->zza(Lcom/google/android/gms/internal/ads/zzbjm;Lcom/google/android/gms/internal/ads/zzbjj;[Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzchj;->zza:Landroid/content/Context;

    .line 30
    .line 31
    new-instance v1, Lcom/google/android/gms/internal/ads/zzchi;

    .line 32
    .line 33
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzchu;->zzq()Lcom/google/android/gms/internal/ads/zzbjk;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbjk;->zzc()Lcom/google/android/gms/internal/ads/zzbjm;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzchj;->zzd:Lcom/google/android/gms/internal/ads/zzdzt;

    .line 42
    .line 43
    move v4, p5

    .line 44
    move v5, p6

    .line 45
    move-object/from16 v7, p7

    .line 46
    .line 47
    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/ads/zzchi;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;IZLcom/google/android/gms/internal/ads/zzbjm;Lcom/google/android/gms/internal/ads/zzcht;Lcom/google/android/gms/internal/ads/zzdzt;)V

    .line 48
    .line 49
    .line 50
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzchj;->zze:Lcom/google/android/gms/internal/ads/zzchi;

    .line 51
    .line 52
    iget-object p5, p0, Lcom/google/android/gms/internal/ads/zzchj;->zzc:Landroid/view/ViewGroup;

    .line 53
    .line 54
    new-instance p6, Landroid/view/ViewGroup$LayoutParams;

    .line 55
    .line 56
    const/4 v0, -0x1

    .line 57
    invoke-direct {p6, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    invoke-virtual {p5, v1, v0, p6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 62
    .line 63
    .line 64
    iget-object p5, p0, Lcom/google/android/gms/internal/ads/zzchj;->zze:Lcom/google/android/gms/internal/ads/zzchi;

    .line 65
    .line 66
    invoke-virtual {p5, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzchi;->zzn(IIII)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v3, v0}, Lcom/google/android/gms/internal/ads/zzchu;->zzdn(Z)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzchi;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzchj;->zze:Lcom/google/android/gms/internal/ads/zzchi;

    return-object v0
.end method

.method public final zze()V
    .locals 1

    .line 1
    const-string v0, "onPause must be called from the UI thread."

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->e(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzchj;->zze:Lcom/google/android/gms/internal/ads/zzchi;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzchi;->zzr()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final zzf()V
    .locals 2

    .line 1
    const-string v0, "onDestroy must be called from the UI thread."

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->e(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzchj;->zze:Lcom/google/android/gms/internal/ads/zzchi;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzchi;->zzE()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzchj;->zzc:Landroid/view/ViewGroup;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzchj;->zze:Lcom/google/android/gms/internal/ads/zzchi;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzchj;->zze:Lcom/google/android/gms/internal/ads/zzchi;

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final zzg(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzchj;->zze:Lcom/google/android/gms/internal/ads/zzchi;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzchi;->zzm(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
