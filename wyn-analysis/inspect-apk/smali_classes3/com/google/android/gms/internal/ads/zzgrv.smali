.class final synthetic Lcom/google/android/gms/internal/ads/zzgrv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzgry;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzgsa;

.field private final synthetic zzc:Lcom/google/android/gms/internal/ads/zzgsd;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzgry;Lcom/google/android/gms/internal/ads/zzgsa;Lcom/google/android/gms/internal/ads/zzgsd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgrv;->zza:Lcom/google/android/gms/internal/ads/zzgry;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzgrv;->zzb:Lcom/google/android/gms/internal/ads/zzgsa;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzgrv;->zzc:Lcom/google/android/gms/internal/ads/zzgsd;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgrv;->zza:Lcom/google/android/gms/internal/ads/zzgry;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgrv;->zzb:Lcom/google/android/gms/internal/ads/zzgsa;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzgrv;->zzc:Lcom/google/android/gms/internal/ads/zzgsd;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzgry;->zze(Lcom/google/android/gms/internal/ads/zzgsa;Lcom/google/android/gms/internal/ads/zzgsd;)V

    return-void
.end method
