.class final synthetic Lcom/google/android/gms/internal/ads/zzglv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzglx;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfyz;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzglx;Lcom/google/android/gms/internal/ads/zzfyz;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzglv;->zza:Lcom/google/android/gms/internal/ads/zzglx;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzglv;->zzb:Lcom/google/android/gms/internal/ads/zzfyz;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzglv;->zza:Lcom/google/android/gms/internal/ads/zzglx;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzglv;->zzb:Lcom/google/android/gms/internal/ads/zzfyz;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzglx;->zzn(Lcom/google/android/gms/internal/ads/zzfyz;)V

    return-void
.end method
