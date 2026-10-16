.class public final Lcom/google/android/gms/internal/ads/zzfwf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzfwh;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzfwg;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfwh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfwh;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfwf;->zza:Lcom/google/android/gms/internal/ads/zzfwh;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzfwg;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzfwg;-><init>(Lcom/google/android/gms/internal/ads/zzfwe;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzfwf;->zzb:Lcom/google/android/gms/internal/ads/zzfwg;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzfwe;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfwf;->zzb:Lcom/google/android/gms/internal/ads/zzfwg;

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzfwe;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfwf;->zza:Lcom/google/android/gms/internal/ads/zzfwh;

    return-object v0
.end method
