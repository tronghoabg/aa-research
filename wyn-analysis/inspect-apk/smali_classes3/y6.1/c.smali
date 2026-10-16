.class public final Ly6/c;
.super Lx6/j;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lx6/j;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "Context cannot be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/v;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final c(Ly6/b;)V
    .locals 3

    .line 1
    const-string v0, "#008 Must be called on the main UI thread."

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->e(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbix;->zza(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbkv;->zzf:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzmO:Lcom/google/android/gms/internal/ads/zzbio;

    .line 28
    .line 29
    sget-object v1, LD6/s;->e:LD6/s;

    .line 30
    .line 31
    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    sget-object v0, LH6/c;->b:Ljava/util/concurrent/ExecutorService;

    .line 46
    .line 47
    new-instance v1, LL7/b;

    .line 48
    .line 49
    const/16 v2, 0x1c

    .line 50
    .line 51
    invoke-direct {v1, v2, p0, p1}, LL7/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    iget-object p1, p1, Lx6/g;->a:LD6/Q0;

    .line 59
    .line 60
    iget-object v0, p0, Lx6/j;->a:LD6/S0;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, LD6/S0;->b(LD6/Q0;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public getAdSizes()[Lcom/google/android/gms/ads/AdSize;
    .locals 1

    .line 1
    iget-object v0, p0, Lx6/j;->a:LD6/S0;

    .line 2
    .line 3
    iget-object v0, v0, LD6/S0;->g:[Lcom/google/android/gms/ads/AdSize;

    .line 4
    .line 5
    return-object v0
.end method

.method public getAppEventListener()Ly6/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lx6/j;->a:LD6/S0;

    .line 2
    .line 3
    iget-object v0, v0, LD6/S0;->h:Ly6/f;

    .line 4
    .line 5
    return-object v0
.end method

.method public getVideoController()Lcom/google/android/gms/ads/VideoController;
    .locals 1

    .line 1
    iget-object v0, p0, Lx6/j;->a:LD6/S0;

    .line 2
    .line 3
    iget-object v0, v0, LD6/S0;->c:Lcom/google/android/gms/ads/VideoController;

    .line 4
    .line 5
    return-object v0
.end method

.method public getVideoOptions()Lx6/w;
    .locals 1

    .line 1
    iget-object v0, p0, Lx6/j;->a:LD6/S0;

    .line 2
    .line 3
    iget-object v0, v0, LD6/S0;->j:Lx6/w;

    .line 4
    .line 5
    return-object v0
.end method

.method public varargs setAdSizes([Lcom/google/android/gms/ads/AdSize;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lx6/j;->a:LD6/S0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LD6/S0;->d([Lcom/google/android/gms/ads/AdSize;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string v0, "The supported ad sizes must contain at least one valid ad size."

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1
.end method

.method public setAppEventListener(Ly6/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx6/j;->a:LD6/S0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LD6/S0;->e(Ly6/f;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setManualImpressionsEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx6/j;->a:LD6/S0;

    .line 2
    .line 3
    iput-boolean p1, v0, LD6/S0;->m:Z

    .line 4
    .line 5
    :try_start_0
    iget-object v0, v0, LD6/S0;->i:LD6/L;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p1}, LD6/L;->zzz(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    move-exception p1

    .line 14
    const-string v0, "#007 Could not call remote method."

    .line 15
    .line 16
    invoke-static {v0, p1}, LH6/l;->i(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public setVideoOptions(Lx6/w;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx6/j;->a:LD6/S0;

    .line 2
    .line 3
    iput-object p1, v0, LD6/S0;->j:Lx6/w;

    .line 4
    .line 5
    :try_start_0
    iget-object v0, v0, LD6/S0;->i:LD6/L;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v1, LD6/r1;

    .line 14
    .line 15
    invoke-direct {v1, p1}, LD6/r1;-><init>(Lx6/w;)V

    .line 16
    .line 17
    .line 18
    move-object p1, v1

    .line 19
    :goto_0
    invoke-interface {v0, p1}, LD6/L;->zzG(LD6/r1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catch_0
    move-exception p1

    .line 24
    const-string v0, "#007 Could not call remote method."

    .line 25
    .line 26
    invoke-static {v0, p1}, LH6/l;->i(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method
