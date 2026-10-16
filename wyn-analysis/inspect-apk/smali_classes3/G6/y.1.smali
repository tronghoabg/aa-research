.class public final LG6/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lcom/google/android/gms/internal/ads/zzato;

.field public static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LG6/y;->b:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    sget-object v0, LG6/y;->b:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v0

    .line 17
    :try_start_0
    sget-object v1, LG6/y;->a:Lcom/google/android/gms/internal/ads/zzato;

    .line 18
    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbix;->zza(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbix;->zzfy:Lcom/google/android/gms/internal/ads/zzbio;

    .line 25
    .line 26
    sget-object v2, LD6/s;->e:LD6/s;

    .line 27
    .line 28
    iget-object v2, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 29
    .line 30
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-static {p1}, LG6/n;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzato;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const/4 v1, 0x0

    .line 50
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/zzauq;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzatz;)Lcom/google/android/gms/internal/ads/zzato;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    :goto_0
    sput-object p1, LG6/y;->a:Lcom/google/android/gms/internal/ads/zzato;

    .line 55
    .line 56
    :cond_2
    monitor-exit v0

    .line 57
    return-void

    .line 58
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    throw p1
.end method


# virtual methods
.method public final a(ILjava/lang/String;Ljava/util/HashMap;[B)LG6/w;
    .locals 10

    .line 1
    new-instance v5, LG6/w;

    .line 2
    .line 3
    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/zzcgd;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v6, LS3/s;

    .line 7
    .line 8
    invoke-direct {v6, p0, p2, v5}, LS3/s;-><init>(LG6/y;Ljava/lang/String;LG6/w;)V

    .line 9
    .line 10
    .line 11
    new-instance v9, LH6/i;

    .line 12
    .line 13
    invoke-direct {v9}, LH6/i;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v1, LG6/v;

    .line 17
    .line 18
    move-object v2, p0

    .line 19
    move v3, p1

    .line 20
    move-object v4, p2

    .line 21
    move-object v8, p3

    .line 22
    move-object v7, p4

    .line 23
    invoke-direct/range {v1 .. v9}, LG6/v;-><init>(LG6/y;ILjava/lang/String;LG6/w;LS3/s;[BLjava/util/HashMap;LH6/i;)V

    .line 24
    .line 25
    .line 26
    invoke-static {}, LH6/i;->c()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    :try_start_0
    invoke-virtual {v1}, LG6/v;->zzm()Ljava/util/Map;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-nez v7, :cond_0

    .line 37
    .line 38
    const/4 p4, 0x0

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object p4, v7

    .line 41
    :goto_0
    invoke-static {}, LH6/i;->c()Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-nez p2, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance p2, LS3/n;

    .line 49
    .line 50
    const-string p3, "GET"

    .line 51
    .line 52
    invoke-direct {p2, v4, p3, p1, p4}, LS3/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[B)V

    .line 53
    .line 54
    .line 55
    const-string p1, "onNetworkRequest"

    .line 56
    .line 57
    invoke-virtual {v9, p1, p2}, LH6/i;->e(Ljava/lang/String;LH6/h;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzast; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catch_0
    move-exception v0

    .line 62
    move-object p1, v0

    .line 63
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    sget p2, LG6/L;->b:I

    .line 68
    .line 69
    invoke-static {p1}, LH6/l;->f(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    :goto_1
    sget-object p1, LG6/y;->a:Lcom/google/android/gms/internal/ads/zzato;

    .line 73
    .line 74
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/zzato;->zzb(Lcom/google/android/gms/internal/ads/zzatl;)Lcom/google/android/gms/internal/ads/zzatl;

    .line 75
    .line 76
    .line 77
    return-object v5
.end method
