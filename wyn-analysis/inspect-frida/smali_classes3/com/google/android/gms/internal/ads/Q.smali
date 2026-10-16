.class public abstract synthetic Lcom/google/android/gms/internal/ads/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/google/android/gms/internal/ads/zzxn;Lcom/google/android/gms/internal/ads/zzak;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static b(Lcom/google/android/gms/internal/ads/zzxn;)Lcom/google/android/gms/internal/ads/zzbf;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public static c(Lcom/google/android/gms/internal/ads/zzxn;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public static d(Lcom/google/android/gms/internal/ads/zzxn;Lcom/google/android/gms/internal/ads/zzxm;Lcom/google/android/gms/internal/ads/zzqh;Lcom/google/android/gms/internal/ads/zzabr;)V
    .locals 0

    .line 1
    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/zzabr;->zze()Lcom/google/android/gms/internal/ads/zzip;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    const-string p1, "prepareSource(MediaSourceCaller, TransferListener, PlayerId) not implemented"

    .line 7
    .line 8
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p0
.end method
