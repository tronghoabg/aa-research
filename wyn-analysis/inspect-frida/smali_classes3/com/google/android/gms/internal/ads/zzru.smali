.class final synthetic Lcom/google/android/gms/internal/ads/zzru;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzrw;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzsa;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzrw;Lcom/google/android/gms/internal/ads/zzsa;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzru;->zza:Lcom/google/android/gms/internal/ads/zzrw;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzru;->zzb:Lcom/google/android/gms/internal/ads/zzsa;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzru;->zza:Lcom/google/android/gms/internal/ads/zzrw;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzru;->zzb:Lcom/google/android/gms/internal/ads/zzsa;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzrw;->zzy(Lcom/google/android/gms/internal/ads/zzsa;)V

    return-void
.end method
