.class final synthetic Lcom/google/android/gms/internal/ads/zzyl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzyr;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzahd;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzyr;Lcom/google/android/gms/internal/ads/zzahd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyl;->zza:Lcom/google/android/gms/internal/ads/zzyr;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzb:Lcom/google/android/gms/internal/ads/zzahd;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyl;->zza:Lcom/google/android/gms/internal/ads/zzyr;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzyl;->zzb:Lcom/google/android/gms/internal/ads/zzahd;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzyr;->zzF(Lcom/google/android/gms/internal/ads/zzahd;)V

    return-void
.end method
