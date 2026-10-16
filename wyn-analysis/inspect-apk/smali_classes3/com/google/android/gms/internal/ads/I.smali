.class public abstract synthetic Lcom/google/android/gms/internal/ads/I;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/google/android/gms/internal/ads/zzne;Lcom/google/android/gms/internal/ads/zznd;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static b(Lcom/google/android/gms/internal/ads/zzne;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static c(IZ)Z
    .locals 2

    .line 1
    and-int/lit8 p0, p0, 0x7

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    const/4 v1, 0x1

    .line 5
    if-eq p0, v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x3

    .line 11
    if-ne p0, p1, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    return v0

    .line 15
    :cond_1
    return v1
.end method
