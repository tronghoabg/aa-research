.class final synthetic Lcom/google/android/gms/internal/ads/zzgol;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzgon;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzggb;

.field private final synthetic zzc:[B

.field private final synthetic zzd:[B


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzgon;Lcom/google/android/gms/internal/ads/zzggb;[B[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgol;->zza:Lcom/google/android/gms/internal/ads/zzgon;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzgol;->zzb:Lcom/google/android/gms/internal/ads/zzggb;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzgol;->zzc:[B

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzgol;->zzd:[B

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgol;->zza:Lcom/google/android/gms/internal/ads/zzgon;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgol;->zzb:Lcom/google/android/gms/internal/ads/zzggb;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzgol;->zzc:[B

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzgol;->zzd:[B

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzgon;->zzi(Lcom/google/android/gms/internal/ads/zzggb;[B[B)Ljava/lang/Void;

    const/4 v0, 0x0

    return-object v0
.end method
