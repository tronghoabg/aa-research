.class final synthetic Lcom/google/android/gms/internal/ads/zzdso;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzdsq;

.field private final synthetic zzb:Ljava/lang/String;

.field private final synthetic zzc:D

.field private final synthetic zzd:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzdsq;Ljava/lang/String;DZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdso;->zza:Lcom/google/android/gms/internal/ads/zzdsq;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdso;->zzb:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzdso;->zzc:D

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/zzdso;->zzd:Z

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdso;->zza:Lcom/google/android/gms/internal/ads/zzdsq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdso;->zzb:Ljava/lang/String;

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzdso;->zzc:D

    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzdso;->zzd:Z

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzdsq;->zzc(Ljava/lang/String;DZ)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
