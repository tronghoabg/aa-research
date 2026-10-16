.class public final Lcom/google/android/gms/internal/ads/zzdph;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzimz;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzdox;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzdox;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdph;->zza:Lcom/google/android/gms/internal/ads/zzdox;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzdox;)Lcom/google/android/gms/internal/ads/zzdph;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzdph;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzdph;-><init>(Lcom/google/android/gms/internal/ads/zzdox;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdph;->zza:Lcom/google/android/gms/internal/ads/zzdox;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdox;->zzb()Lcom/google/android/gms/internal/ads/zzcdu;

    move-result-object v0

    return-object v0
.end method
