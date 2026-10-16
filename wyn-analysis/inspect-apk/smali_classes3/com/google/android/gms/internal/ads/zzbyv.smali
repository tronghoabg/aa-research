.class public final Lcom/google/android/gms/internal/ads/zzbyv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/ads/nativead/j;

.field private final zzb:Lcom/google/android/gms/ads/nativead/i;

.field private zzc:Lcom/google/android/gms/ads/nativead/k;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/nativead/j;Lcom/google/android/gms/ads/nativead/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final declared-synchronized zzf(Lcom/google/android/gms/internal/ads/zzbnc;)Lcom/google/android/gms/ads/nativead/k;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyv;->zzc:Lcom/google/android/gms/ads/nativead/k;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbyw;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzbyw;-><init>(Lcom/google/android/gms/internal/ads/zzbnc;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbyv;->zzc:Lcom/google/android/gms/ads/nativead/k;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzbnp;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbyu;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzbyu;-><init>(Lcom/google/android/gms/internal/ads/zzbyv;[B)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzbnm;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final synthetic zzc(Lcom/google/android/gms/internal/ads/zzbnc;)Lcom/google/android/gms/ads/nativead/k;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzbyv;->zzf(Lcom/google/android/gms/internal/ads/zzbnc;)Lcom/google/android/gms/ads/nativead/k;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic zzd()Lcom/google/android/gms/ads/nativead/j;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final synthetic zze()Lcom/google/android/gms/ads/nativead/i;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
