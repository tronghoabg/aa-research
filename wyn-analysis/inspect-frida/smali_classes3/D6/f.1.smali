.class public final LD6/f;
.super LD6/p;
.source "SourceFile"


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lcom/google/android/gms/internal/ads/zzbvf;


# direct methods
.method public constructor <init>(LD6/o;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbvf;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LD6/f;->b:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p3, p0, LD6/f;->c:Lcom/google/android/gms/internal/ads/zzbvf;

    .line 7
    .line 8
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lq7/b;

    .line 2
    .line 3
    iget-object v1, p0, LD6/f;->b:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    const-string v2, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl"
    :try_end_0
    .catch LH6/n; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    .line 9
    .line 10
    :try_start_1
    invoke-static {v1}, Ltg/b;->X(Landroid/content/Context;)Lr7/d;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1, v2}, Lr7/d;->b(Ljava/lang/String;)Landroid/os/IBinder;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Landroid/os/IBinder;

    .line 19
    .line 20
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzbzd;->zzb(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/zzbze;

    .line 21
    .line 22
    .line 23
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 24
    :try_start_2
    iget-object v2, p0, LD6/f;->c:Lcom/google/android/gms/internal/ads/zzbvf;

    .line 25
    .line 26
    const v3, 0xf9960b0

    .line 27
    .line 28
    .line 29
    invoke-interface {v1, v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzbze;->zze(Lq7/a;Lcom/google/android/gms/internal/ads/zzbvj;I)Lcom/google/android/gms/internal/ads/zzbzb;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0

    .line 34
    :catch_0
    move-exception v0

    .line 35
    new-instance v1, LH6/n;

    .line 36
    .line 37
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    throw v1
    :try_end_2
    .catch LH6/n; {:try_start_2 .. :try_end_2} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_1

    .line 41
    :catch_1
    const/4 v0, 0x0

    .line 42
    return-object v0
.end method

.method public final c(LD6/d0;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lq7/b;

    .line 2
    .line 3
    iget-object v1, p0, LD6/f;->b:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LD6/f;->c:Lcom/google/android/gms/internal/ads/zzbvf;

    .line 9
    .line 10
    const v2, 0xf9960b0

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, v0, v1, v2}, LD6/d0;->J(Lq7/a;Lcom/google/android/gms/internal/ads/zzbvj;I)Lcom/google/android/gms/internal/ads/zzbzb;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
