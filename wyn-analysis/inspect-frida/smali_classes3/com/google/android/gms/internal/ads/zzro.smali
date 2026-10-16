.class final synthetic Lcom/google/android/gms/internal/ads/zzro;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzrw;

.field private final synthetic zzb:I

.field private final synthetic zzc:J

.field private final synthetic zzd:J


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzrw;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzro;->zza:Lcom/google/android/gms/internal/ads/zzrw;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzro;->zzb:I

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzro;->zzc:J

    iput-wide p5, p0, Lcom/google/android/gms/internal/ads/zzro;->zzd:J

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzro;->zza:Lcom/google/android/gms/internal/ads/zzrw;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzro;->zzb:I

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzro;->zzc:J

    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzro;->zzd:J

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzrw;->zzs(IJJ)V

    return-void
.end method
