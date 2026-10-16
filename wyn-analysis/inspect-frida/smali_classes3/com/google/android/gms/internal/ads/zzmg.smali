.class final synthetic Lcom/google/android/gms/internal/ads/zzmg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Lcom/google/android/gms/internal/ads/zzmh;

.field private final synthetic zzb:Lcom/google/android/gms/internal/ads/zzgwq;

.field private final synthetic zzc:Lcom/google/android/gms/internal/ads/zzxl;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzmh;Lcom/google/android/gms/internal/ads/zzgwq;Lcom/google/android/gms/internal/ads/zzxl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzmg;->zza:Lcom/google/android/gms/internal/ads/zzmh;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzmg;->zzb:Lcom/google/android/gms/internal/ads/zzgwq;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzmg;->zzc:Lcom/google/android/gms/internal/ads/zzxl;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzmg;->zza:Lcom/google/android/gms/internal/ads/zzmh;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzmg;->zzb:Lcom/google/android/gms/internal/ads/zzgwq;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzmg;->zzc:Lcom/google/android/gms/internal/ads/zzxl;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzmh;->zzz(Lcom/google/android/gms/internal/ads/zzgwq;Lcom/google/android/gms/internal/ads/zzxl;)V

    return-void
.end method
