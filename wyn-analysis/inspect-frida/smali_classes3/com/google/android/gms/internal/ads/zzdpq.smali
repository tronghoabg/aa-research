.class final synthetic Lcom/google/android/gms/internal/ads/zzdpq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzdpw;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzdry;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzdpw;Lcom/google/android/gms/internal/ads/zzdry;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdpq;->zza:Lcom/google/android/gms/internal/ads/zzdpw;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdpq;->zzb:Lcom/google/android/gms/internal/ads/zzdry;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdpq;->zza:Lcom/google/android/gms/internal/ads/zzdpw;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdpq;->zzb:Lcom/google/android/gms/internal/ads/zzdry;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzdpw;->zzV(Lcom/google/android/gms/internal/ads/zzdry;)V

    return-void
.end method
