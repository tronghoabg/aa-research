.class final synthetic Lcom/google/android/gms/internal/ads/zzgok;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzgon;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzggb;

.field private final synthetic zzc:[B


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzgon;Lcom/google/android/gms/internal/ads/zzggb;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgok;->zza:Lcom/google/android/gms/internal/ads/zzgon;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzgok;->zzb:Lcom/google/android/gms/internal/ads/zzggb;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzgok;->zzc:[B

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgok;->zza:Lcom/google/android/gms/internal/ads/zzgon;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgok;->zzb:Lcom/google/android/gms/internal/ads/zzggb;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzgok;->zzc:[B

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgon;->zzh(Lcom/google/android/gms/internal/ads/zzggb;[B)Ljava/lang/Void;

    const/4 v0, 0x0

    return-object v0
.end method
