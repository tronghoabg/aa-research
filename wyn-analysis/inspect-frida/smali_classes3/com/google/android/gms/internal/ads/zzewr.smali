.class public final Lcom/google/android/gms/internal/ads/zzewr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfcq;


# instance fields
.field public final zza:I

.field public final zzb:Z

.field public final zzc:Z

.field public final zzd:I

.field public final zze:I

.field public final zzf:I

.field public final zzg:I

.field public final zzh:I

.field public final zzi:F

.field public final zzj:Z

.field public final zzk:Z


# direct methods
.method public constructor <init>(IZZIIIIIFZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzewr;->zza:I

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzewr;->zzb:Z

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzewr;->zzc:Z

    iput p4, p0, Lcom/google/android/gms/internal/ads/zzewr;->zzd:I

    iput p5, p0, Lcom/google/android/gms/internal/ads/zzewr;->zze:I

    iput p6, p0, Lcom/google/android/gms/internal/ads/zzewr;->zzf:I

    iput p7, p0, Lcom/google/android/gms/internal/ads/zzewr;->zzg:I

    iput p8, p0, Lcom/google/android/gms/internal/ads/zzewr;->zzh:I

    iput p9, p0, Lcom/google/android/gms/internal/ads/zzewr;->zzi:F

    iput-boolean p10, p0, Lcom/google/android/gms/internal/ads/zzewr;->zzj:Z

    iput-boolean p11, p0, Lcom/google/android/gms/internal/ads/zzewr;->zzk:Z

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Landroid/os/Bundle;

    .line 2
    .line 3
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzmE:Lcom/google/android/gms/internal/ads/zzbio;

    .line 4
    .line 5
    sget-object v1, LD6/s;->e:LD6/s;

    .line 6
    .line 7
    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzewr;->zze:I

    .line 22
    .line 23
    const-string v1, "muv_min"

    .line 24
    .line 25
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzewr;->zzf:I

    .line 29
    .line 30
    const-string v1, "muv_max"

    .line 31
    .line 32
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzewr;->zzi:F

    .line 36
    .line 37
    const-string v1, "android_app_volume"

    .line 38
    .line 39
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 40
    .line 41
    .line 42
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzewr;->zzj:Z

    .line 43
    .line 44
    const-string v1, "android_app_muted"

    .line 45
    .line 46
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzewr;->zzk:Z

    .line 50
    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzewr;->zza:I

    .line 54
    .line 55
    const-string v1, "am"

    .line 56
    .line 57
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 58
    .line 59
    .line 60
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzewr;->zzb:Z

    .line 61
    .line 62
    const-string v1, "ma"

    .line 63
    .line 64
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 65
    .line 66
    .line 67
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzewr;->zzc:Z

    .line 68
    .line 69
    const-string v1, "sp"

    .line 70
    .line 71
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzewr;->zzd:I

    .line 75
    .line 76
    const-string v1, "muv"

    .line 77
    .line 78
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 79
    .line 80
    .line 81
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzewr;->zzg:I

    .line 82
    .line 83
    const-string v1, "rm"

    .line 84
    .line 85
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 86
    .line 87
    .line 88
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzewr;->zzh:I

    .line 89
    .line 90
    const-string v1, "riv"

    .line 91
    .line 92
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 93
    .line 94
    .line 95
    :cond_1
    return-void
.end method
