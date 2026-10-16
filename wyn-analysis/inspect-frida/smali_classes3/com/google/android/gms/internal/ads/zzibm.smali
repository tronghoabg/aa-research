.class public final Lcom/google/android/gms/internal/ads/zzibm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzibk;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzibk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzibm;->zza:Lcom/google/android/gms/internal/ads/zzibk;

    return-void
.end method

.method public static zza([BLcom/google/android/gms/internal/ads/zzhey;)Lcom/google/android/gms/internal/ads/zzibm;
    .locals 0

    .line 1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzibm;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzibk;->zza([B)Lcom/google/android/gms/internal/ads/zzibk;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/zzibm;-><init>(Lcom/google/android/gms/internal/ads/zzibk;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public static zzb(I)Lcom/google/android/gms/internal/ads/zzibm;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzibm;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzhoc;->zza(I)[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzibk;->zza([B)Lcom/google/android/gms/internal/ads/zzibk;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzibm;-><init>(Lcom/google/android/gms/internal/ads/zzibk;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public final zzc(Lcom/google/android/gms/internal/ads/zzhey;)[B
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzibm;->zza:Lcom/google/android/gms/internal/ads/zzibk;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzibk;->zzc()[B

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final zzd()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzibm;->zza:Lcom/google/android/gms/internal/ads/zzibk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzibk;->zzd()I

    move-result v0

    return v0
.end method
