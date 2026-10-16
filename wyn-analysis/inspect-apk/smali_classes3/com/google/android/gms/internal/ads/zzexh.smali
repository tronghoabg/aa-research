.class final synthetic Lcom/google/android/gms/internal/ads/zzexh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzexi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzexj;

    .line 2
    .line 3
    sget-object v1, LC6/n;->D:LC6/n;

    .line 4
    .line 5
    iget-object v2, v1, LC6/n;->k:Ln7/b;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    iget-object v1, v1, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcfk;->zzp()LG6/N;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, LG6/O;

    .line 21
    .line 22
    invoke-virtual {v1}, LG6/O;->r()Lcom/google/android/gms/internal/ads/zzcff;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcff;->zzb()J

    .line 27
    .line 28
    .line 29
    move-result-wide v4

    .line 30
    sub-long/2addr v2, v4

    .line 31
    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzexj;-><init>(J)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method
