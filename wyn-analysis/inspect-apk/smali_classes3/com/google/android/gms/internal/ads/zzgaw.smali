.class public final Lcom/google/android/gms/internal/ads/zzgaw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Lcom/google/android/gms/internal/ads/zzgat;

.field private static volatile zzb:Lcom/google/android/gms/internal/ads/zzgat;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgau;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzgau;-><init>([B)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgaw;->zza:Lcom/google/android/gms/internal/ads/zzgat;

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgaw;->zzb:Lcom/google/android/gms/internal/ads/zzgat;

    return-void
.end method

.method public static zza()Lcom/google/android/gms/internal/ads/zzgat;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzgaw;->zzb:Lcom/google/android/gms/internal/ads/zzgat;

    return-object v0
.end method
