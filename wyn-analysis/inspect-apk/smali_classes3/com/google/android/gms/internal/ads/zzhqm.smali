.class public final Lcom/google/android/gms/internal/ads/zzhqm;
.super Lcom/google/android/gms/internal/ads/zzhqp;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzhqn;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzibm;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzhqn;Lcom/google/android/gms/internal/ads/zzibm;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzhqp;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhqm;->zza:Lcom/google/android/gms/internal/ads/zzhqn;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzhqm;->zzb:Lcom/google/android/gms/internal/ads/zzibm;

    return-void
.end method

.method public static zzc(Lcom/google/android/gms/internal/ads/zzhqn;Lcom/google/android/gms/internal/ads/zzibm;)Lcom/google/android/gms/internal/ads/zzhqm;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhqn;->zzc()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzibm;->zzd()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhqm;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzhqm;-><init>(Lcom/google/android/gms/internal/ads/zzhqn;Lcom/google/android/gms/internal/ads/zzibm;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 18
    .line 19
    const-string p1, "Key size mismatch"

    .line 20
    .line 21
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p0
.end method


# virtual methods
.method public final synthetic zza()Lcom/google/android/gms/internal/ads/zzheq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhqm;->zza:Lcom/google/android/gms/internal/ads/zzhqn;

    return-object v0
.end method

.method public final zzb()Ljava/lang/Integer;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzibm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhqm;->zzb:Lcom/google/android/gms/internal/ads/zzibm;

    return-object v0
.end method
