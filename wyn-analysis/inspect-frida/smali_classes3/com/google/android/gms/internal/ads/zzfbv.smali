.class final synthetic Lcom/google/android/gms/internal/ads/zzfbv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzfby;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzbxi;

.field private final synthetic zzc:Landroid/os/Bundle;

.field private final synthetic zzd:Ljava/util/List;

.field private final synthetic zze:Lcom/google/android/gms/internal/ads/zzesh;

.field private final synthetic zzf:Lcom/google/android/gms/internal/ads/zzcgd;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfby;Lcom/google/android/gms/internal/ads/zzbxi;Landroid/os/Bundle;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzesh;Lcom/google/android/gms/internal/ads/zzcgd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfbv;->zza:Lcom/google/android/gms/internal/ads/zzfby;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfbv;->zzb:Lcom/google/android/gms/internal/ads/zzbxi;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfbv;->zzc:Landroid/os/Bundle;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfbv;->zzd:Ljava/util/List;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzfbv;->zze:Lcom/google/android/gms/internal/ads/zzesh;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzfbv;->zzf:Lcom/google/android/gms/internal/ads/zzcgd;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfbv;->zza:Lcom/google/android/gms/internal/ads/zzfby;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfbv;->zzb:Lcom/google/android/gms/internal/ads/zzbxi;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfbv;->zzc:Landroid/os/Bundle;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfbv;->zzd:Ljava/util/List;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfbv;->zze:Lcom/google/android/gms/internal/ads/zzesh;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzfbv;->zzf:Lcom/google/android/gms/internal/ads/zzcgd;

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzfby;->zze(Lcom/google/android/gms/internal/ads/zzbxi;Landroid/os/Bundle;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzesh;Lcom/google/android/gms/internal/ads/zzcgd;)V

    return-void
.end method
