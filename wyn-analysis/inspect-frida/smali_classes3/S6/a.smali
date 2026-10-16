.class public abstract LS6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static load(Landroid/content/Context;Ljava/lang/String;Lx6/g;LS6/b;)V
    .locals 7

    .line 1
    const-string v0, "Context cannot be null."

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/v;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "AdUnitId cannot be null."

    .line 2
    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/v;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "AdRequest cannot be null."

    .line 3
    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/v;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "LoadCallback cannot be null."

    .line 4
    invoke-static {p3, v0}, Lcom/google/android/gms/common/internal/v;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "#008 Must be called on the main UI thread."

    .line 5
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->e(Ljava/lang/String;)V

    .line 6
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzbix;->zza(Landroid/content/Context;)V

    .line 7
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbkv;->zzk:Lcom/google/android/gms/internal/ads/zzbkh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzmO:Lcom/google/android/gms/internal/ads/zzbio;

    .line 8
    sget-object v1, LD6/s;->e:LD6/s;

    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 9
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 11
    sget-object v0, LH6/c;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, LA7/W0;

    const/16 v6, 0xc

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, LA7/W0;-><init>(Landroid/content/Context;Ljava/lang/String;Lx6/g;Lx6/d;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    new-instance p0, Lcom/google/android/gms/internal/ads/zzcdj;

    .line 12
    invoke-direct {p0, v2, v3}, Lcom/google/android/gms/internal/ads/zzcdj;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 13
    iget-object p1, v4, Lx6/g;->a:LD6/Q0;

    invoke-virtual {p0, p1, v5}, Lcom/google/android/gms/internal/ads/zzcdj;->zza(LD6/Q0;LS6/b;)V

    return-void
.end method

.method public static load(Landroid/content/Context;Ljava/lang/String;Ly6/b;LS6/b;)V
    .locals 7

    .line 14
    const-string v0, "Context cannot be null."

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/v;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "AdUnitId cannot be null."

    .line 15
    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/v;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "AdManagerAdRequest cannot be null."

    .line 16
    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/v;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "LoadCallback cannot be null."

    .line 17
    invoke-static {p3, v0}, Lcom/google/android/gms/common/internal/v;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "#008 Must be called on the main UI thread."

    .line 18
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->e(Ljava/lang/String;)V

    .line 19
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzbix;->zza(Landroid/content/Context;)V

    .line 20
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbkv;->zzk:Lcom/google/android/gms/internal/ads/zzbkh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzmO:Lcom/google/android/gms/internal/ads/zzbio;

    .line 21
    sget-object v1, LD6/s;->e:LD6/s;

    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 22
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24
    sget-object v0, LH6/c;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, LA7/W0;

    const/16 v6, 0xb

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, LA7/W0;-><init>(Landroid/content/Context;Ljava/lang/String;Lx6/g;Lx6/d;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    new-instance p0, Lcom/google/android/gms/internal/ads/zzcdj;

    .line 25
    invoke-direct {p0, v2, v3}, Lcom/google/android/gms/internal/ads/zzcdj;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 26
    iget-object p1, v4, Lx6/g;->a:LD6/Q0;

    invoke-virtual {p0, p1, v5}, Lcom/google/android/gms/internal/ads/zzcdj;->zza(LD6/Q0;LS6/b;)V

    return-void
.end method


# virtual methods
.method public abstract getResponseInfo()Lx6/t;
.end method

.method public abstract setFullScreenContentCallback(Lx6/k;)V
.end method

.method public abstract setImmersiveMode(Z)V
.end method

.method public abstract setOnAdMetadataChangedListener(LR6/a;)V
.end method

.method public abstract setOnPaidEventListener(Lx6/q;)V
.end method

.method public abstract setServerSideVerificationOptions(LR6/e;)V
.end method

.method public abstract show(Landroid/app/Activity;Lx6/r;)V
.end method
