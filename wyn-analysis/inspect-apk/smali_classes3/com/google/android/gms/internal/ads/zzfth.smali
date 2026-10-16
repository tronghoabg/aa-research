.class final synthetic Lcom/google/android/gms/internal/ads/zzfth;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzfti;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfsx;

.field private final synthetic zzc:Lcom/google/android/gms/internal/ads/zzful;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfti;Lcom/google/android/gms/internal/ads/zzfsx;Lcom/google/android/gms/internal/ads/zzful;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfth;->zza:Lcom/google/android/gms/internal/ads/zzfti;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfth;->zzb:Lcom/google/android/gms/internal/ads/zzfsx;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfth;->zzc:Lcom/google/android/gms/internal/ads/zzful;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfth;->zza:Lcom/google/android/gms/internal/ads/zzfti;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfth;->zzb:Lcom/google/android/gms/internal/ads/zzfsx;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfth;->zzc:Lcom/google/android/gms/internal/ads/zzful;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzfti;->zzb(Lcom/google/android/gms/internal/ads/zzfsx;Lcom/google/android/gms/internal/ads/zzful;)V

    return-void
.end method
