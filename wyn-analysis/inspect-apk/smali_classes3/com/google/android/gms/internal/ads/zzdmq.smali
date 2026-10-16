.class public final Lcom/google/android/gms/internal/ads/zzdmq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzimz;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzdml;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzdml;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdmq;->zza:Lcom/google/android/gms/internal/ads/zzdml;

    return-void
.end method

.method public static zzc(Lcom/google/android/gms/internal/ads/zzdml;)Lcom/google/android/gms/internal/ads/zzdmq;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzdmq;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzdmq;-><init>(Lcom/google/android/gms/internal/ads/zzdml;)V

    return-object v0
.end method


# virtual methods
.method public final zza()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmq;->zza:Lcom/google/android/gms/internal/ads/zzdml;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdml;->zzd()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic zzb()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdmq;->zza:Lcom/google/android/gms/internal/ads/zzdml;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzdml;->zzd()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method
