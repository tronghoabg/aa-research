.class final synthetic Lcom/google/android/gms/internal/ads/zzgpp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzgpq;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzgpq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgpp;->zza:Lcom/google/android/gms/internal/ads/zzgpq;

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgpp;->zza:Lcom/google/android/gms/internal/ads/zzgpq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgpq;->zze()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
