.class public abstract Lcom/vungle/ads/internal/downloader/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lokhttp3/OkHttpClient;


# direct methods
.method public static a(Lcom/vungle/ads/internal/util/PathProvider;)Lokhttp3/OkHttpClient;
    .locals 8

    .line 1
    const-string v0, "pathProvider"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/vungle/ads/internal/downloader/e;->a:Lokhttp3/OkHttpClient;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    .line 11
    .line 12
    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 13
    .line 14
    .line 15
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 16
    .line 17
    const-wide/16 v2, 0x3c

    .line 18
    .line 19
    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->b(JLjava/util/concurrent/TimeUnit;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->a(JLjava/util/concurrent/TimeUnit;)V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iput-object v1, v0, Lokhttp3/OkHttpClient$Builder;->k:Lokhttp3/Cache;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    iput-boolean v1, v0, Lokhttp3/OkHttpClient$Builder;->h:Z

    .line 30
    .line 31
    iput-boolean v1, v0, Lokhttp3/OkHttpClient$Builder;->i:Z

    .line 32
    .line 33
    sget-object v1, Lcom/vungle/ads/internal/ConfigManager;->INSTANCE:Lcom/vungle/ads/internal/ConfigManager;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lcom/vungle/ads/internal/ConfigManager;->e()J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    invoke-static {}, Lcom/vungle/ads/internal/ConfigManager;->d()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-virtual {p0}, Lcom/vungle/ads/internal/util/PathProvider;->getCleverCacheDir()Ljava/io/File;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    const-string v5, "pathProvider.getCleverCacheDir().absolutePath"

    .line 55
    .line 56
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v4}, Lcom/vungle/ads/internal/util/PathProvider;->a(Ljava/lang/String;)J

    .line 60
    .line 61
    .line 62
    move-result-wide v4

    .line 63
    int-to-long v6, v3

    .line 64
    mul-long/2addr v4, v6

    .line 65
    const/16 v3, 0x64

    .line 66
    .line 67
    int-to-long v6, v3

    .line 68
    div-long/2addr v4, v6

    .line 69
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 70
    .line 71
    .line 72
    move-result-wide v1

    .line 73
    const-wide/16 v3, 0x0

    .line 74
    .line 75
    cmp-long v3, v1, v3

    .line 76
    .line 77
    if-lez v3, :cond_0

    .line 78
    .line 79
    new-instance v3, Lokhttp3/Cache;

    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/vungle/ads/internal/util/PathProvider;->getCleverCacheDir()Ljava/io/File;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-direct {v3, p0, v1, v2}, Lokhttp3/Cache;-><init>(Ljava/io/File;J)V

    .line 86
    .line 87
    .line 88
    iput-object v3, v0, Lokhttp3/OkHttpClient$Builder;->k:Lokhttp3/Cache;

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    sget-boolean p0, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 92
    .line 93
    const-string p0, "AssetDownloader"

    .line 94
    .line 95
    const-string v1, "cache disk capacity size <=0, no clever cache active."

    .line 96
    .line 97
    invoke-static {p0, v1}, Lcom/vungle/ads/internal/util/t;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :goto_0
    new-instance p0, Lokhttp3/OkHttpClient;

    .line 101
    .line 102
    invoke-direct {p0, v0}, Lokhttp3/OkHttpClient;-><init>(Lokhttp3/OkHttpClient$Builder;)V

    .line 103
    .line 104
    .line 105
    sput-object p0, Lcom/vungle/ads/internal/downloader/e;->a:Lokhttp3/OkHttpClient;

    .line 106
    .line 107
    return-object p0

    .line 108
    :cond_1
    return-object v0
.end method
