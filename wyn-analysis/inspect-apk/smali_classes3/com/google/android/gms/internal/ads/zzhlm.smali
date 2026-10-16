.class final Lcom/google/android/gms/internal/ads/zzhlm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final zza:Lcom/google/android/gms/internal/ads/zzhln;

.field final zzb:[J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 2
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhln;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzhln;-><init>()V

    const/16 v1, 0xa

    new-array v1, v1, [J

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzhlm;-><init>(Lcom/google/android/gms/internal/ads/zzhln;[J)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzhlm;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhln;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzhlm;->zza:Lcom/google/android/gms/internal/ads/zzhln;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzhln;-><init>(Lcom/google/android/gms/internal/ads/zzhln;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhlm;->zza:Lcom/google/android/gms/internal/ads/zzhln;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzhlm;->zzb:[J

    const/16 v0, 0xa

    .line 4
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhlm;->zzb:[J

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzhln;[J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhlm;->zza:Lcom/google/android/gms/internal/ads/zzhln;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzhlm;->zzb:[J

    return-void
.end method
