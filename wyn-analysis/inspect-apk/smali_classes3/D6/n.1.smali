.class public final LD6/n;
.super LD6/p;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lcom/google/android/gms/ads/nativead/NativeAdView;

.field public final synthetic c:Landroid/widget/FrameLayout;

.field public final synthetic d:Landroid/content/Context;

.field public final synthetic e:LD6/o;


# direct methods
.method public constructor <init>(LD6/o;Lcom/google/android/gms/ads/nativead/NativeAdView;Landroid/widget/FrameLayout;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LD6/n;->b:Lcom/google/android/gms/ads/nativead/NativeAdView;

    .line 5
    .line 6
    iput-object p3, p0, LD6/n;->c:Landroid/widget/FrameLayout;

    .line 7
    .line 8
    iput-object p4, p0, LD6/n;->d:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LD6/n;->e:LD6/o;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LD6/n;->d:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "native_ad_view_delegate"

    .line 4
    .line 5
    invoke-static {v0, v1}, LD6/o;->k(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, LD6/k1;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbmo;-><init>()V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, LD6/n;->d:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbix;->zza(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbix;->zzmo:Lcom/google/android/gms/internal/ads/zzbio;

    .line 7
    .line 8
    sget-object v2, LD6/s;->e:LD6/s;

    .line 9
    .line 10
    iget-object v2, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-object v2, p0, LD6/n;->c:Landroid/widget/FrameLayout;

    .line 23
    .line 24
    iget-object v3, p0, LD6/n;->b:Lcom/google/android/gms/ads/nativead/NativeAdView;

    .line 25
    .line 26
    iget-object v4, p0, LD6/n;->e:LD6/o;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    :try_start_0
    new-instance v1, Lq7/b;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance v5, Lq7/b;

    .line 36
    .line 37
    invoke-direct {v5, v3}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance v3, Lq7/b;

    .line 41
    .line 42
    invoke-direct {v3, v2}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const-string v2, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl"
    :try_end_0
    .catch LH6/n; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    :try_start_1
    invoke-static {v0}, Ltg/b;->X(Landroid/content/Context;)Lr7/d;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-virtual {v6, v2}, Lr7/d;->b(Ljava/lang/String;)Landroid/os/IBinder;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Landroid/os/IBinder;

    .line 56
    .line 57
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzbmr;->zzb(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/zzbms;

    .line 58
    .line 59
    .line 60
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 61
    const v6, 0xf9960b0

    .line 62
    .line 63
    .line 64
    :try_start_2
    invoke-interface {v2, v1, v5, v3, v6}, Lcom/google/android/gms/internal/ads/zzbms;->zze(Lq7/a;Lq7/a;Lq7/a;I)Landroid/os/IBinder;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzbmo;->zzdG(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/zzbmp;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0

    .line 73
    :catch_0
    move-exception v1

    .line 74
    goto :goto_0

    .line 75
    :catch_1
    move-exception v1

    .line 76
    goto :goto_0

    .line 77
    :catch_2
    move-exception v1

    .line 78
    goto :goto_0

    .line 79
    :catch_3
    move-exception v1

    .line 80
    new-instance v2, LH6/n;

    .line 81
    .line 82
    invoke-direct {v2, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    throw v2
    :try_end_2
    .catch LH6/n; {:try_start_2 .. :try_end_2} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_0

    .line 86
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcaf;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcah;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iput-object v0, v4, LD6/o;->f:Ljava/lang/Object;

    .line 91
    .line 92
    const-string v2, "ClientApiBroker.createNativeAdViewDelegate"

    .line 93
    .line 94
    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzcah;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const/4 v0, 0x0

    .line 98
    return-object v0

    .line 99
    :cond_0
    iget-object v1, v4, LD6/o;->d:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v1, Lcom/google/android/gms/internal/ads/zzboe;

    .line 102
    .line 103
    invoke-virtual {v1, v0, v3, v2}, Lcom/google/android/gms/internal/ads/zzboe;->zza(Landroid/content/Context;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;)Lcom/google/android/gms/internal/ads/zzbmp;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    return-object v0
.end method

.method public final c(LD6/d0;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lq7/b;

    .line 2
    .line 3
    iget-object v1, p0, LD6/n;->b:Lcom/google/android/gms/ads/nativead/NativeAdView;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lq7/b;

    .line 9
    .line 10
    iget-object v2, p0, LD6/n;->c:Landroid/widget/FrameLayout;

    .line 11
    .line 12
    invoke-direct {v1, v2}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, v0, v1}, LD6/d0;->C(Lq7/a;Lq7/a;)Lcom/google/android/gms/internal/ads/zzbmp;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method
