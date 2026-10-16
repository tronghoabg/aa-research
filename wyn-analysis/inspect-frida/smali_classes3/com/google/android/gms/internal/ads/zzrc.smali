.class public final Lcom/google/android/gms/internal/ads/zzrc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final zza:Z

.field public final zzb:Z

.field public final zzc:Z

.field public final zzd:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzrb;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzrb;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzrb;->zze()Lcom/google/android/gms/internal/ads/zzrc;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzrb;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzrb;->zzf()Z

    move-result p2

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzrc;->zza:Z

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzrb;->zzg()Z

    move-result p2

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzrc;->zzb:Z

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzrb;->zzh()Z

    move-result p2

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzrc;->zzc:Z

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzrb;->zzi()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzrc;->zzd:I

    return-void
.end method
