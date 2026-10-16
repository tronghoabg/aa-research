.class public final Lcom/google/android/gms/internal/ads/zzra;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final zza:Lcom/google/android/gms/internal/ads/zzv;

.field public final zzb:Lcom/google/android/gms/internal/ads/zzd;

.field public final zzc:Landroid/media/AudioDeviceInfo;

.field public final zzd:I

.field public final zze:I

.field public final zzf:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzqz;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzqz;->zzf()Lcom/google/android/gms/internal/ads/zzv;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzra;->zza:Lcom/google/android/gms/internal/ads/zzv;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzqz;->zzg()Lcom/google/android/gms/internal/ads/zzd;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzra;->zzb:Lcom/google/android/gms/internal/ads/zzd;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzqz;->zzh()Landroid/media/AudioDeviceInfo;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzra;->zzc:Landroid/media/AudioDeviceInfo;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzqz;->zzi()I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzra;->zzd:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzqz;->zzj()I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzra;->zze:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzqz;->zzk()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzra;->zzf:I

    return-void
.end method
