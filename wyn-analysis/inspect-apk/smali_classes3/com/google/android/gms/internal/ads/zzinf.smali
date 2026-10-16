.class public final Lcom/google/android/gms/internal/ads/zzinf;
.super Lcom/google/android/gms/internal/ads/zzimu;
.source "SourceFile"


# direct methods
.method public synthetic constructor <init>(ILcom/google/android/gms/internal/ads/zzine;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzimu;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final zzb(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzini;)Lcom/google/android/gms/internal/ads/zzinf;
    .locals 0

    .line 1
    const-string p1, "Network"

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzimu;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzini;)Lcom/google/android/gms/internal/ads/zzimu;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzing;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzing;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzimu;->zza:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzing;-><init>(Ljava/util/Map;Lcom/google/android/gms/internal/ads/zzine;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method
