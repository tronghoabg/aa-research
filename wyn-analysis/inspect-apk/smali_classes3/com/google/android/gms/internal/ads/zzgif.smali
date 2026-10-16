.class final synthetic Lcom/google/android/gms/internal/ads/zzgif;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzgig;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzgii;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzgig;Lcom/google/android/gms/internal/ads/zzgii;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgif;->zza:Lcom/google/android/gms/internal/ads/zzgig;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzgif;->zzb:Lcom/google/android/gms/internal/ads/zzgii;

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgif;->zza:Lcom/google/android/gms/internal/ads/zzgig;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgif;->zzb:Lcom/google/android/gms/internal/ads/zzgii;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgig;->zzd(Lcom/google/android/gms/internal/ads/zzgii;)Ljava/lang/reflect/Method;

    move-result-object v0

    return-object v0
.end method
