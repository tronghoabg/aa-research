.class public final Lcom/vungle/ads/internal/downloader/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/vungle/ads/internal/downloader/m;


# instance fields
.field public final a:Lcom/vungle/ads/internal/executor/j;

.field public final b:Lcom/vungle/ads/internal/util/PathProvider;

.field public final c:Lef/i;

.field public final d:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>(Lcom/vungle/ads/internal/executor/j;Lcom/vungle/ads/internal/util/PathProvider;)V
    .locals 1

    .line 1
    const-string v0, "downloadExecutor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "pathProvider"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/vungle/ads/internal/downloader/h;->a:Lcom/vungle/ads/internal/executor/j;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/vungle/ads/internal/downloader/h;->b:Lcom/vungle/ads/internal/util/PathProvider;

    .line 17
    .line 18
    new-instance p1, Lcom/vungle/ads/internal/downloader/g;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lcom/vungle/ads/internal/downloader/g;-><init>(Lcom/vungle/ads/internal/downloader/h;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lcom/vungle/ads/internal/downloader/h;->c:Lef/i;

    .line 28
    .line 29
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/vungle/ads/internal/downloader/h;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 35
    .line 36
    return-void
.end method

.method public static a(Lokhttp3/Response;)Lokhttp3/ResponseBody;
    .locals 4

    .line 158
    iget-object v0, p0, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    .line 159
    const-string v1, "Content-Encoding"

    invoke-static {v1, p0}, Lokhttp3/Response;->b(Ljava/lang/String;Lokhttp3/Response;)Ljava/lang/String;

    move-result-object v1

    .line 160
    const-string v2, "gzip"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 161
    new-instance v1, Lcg/r;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->source()Lcg/i;

    move-result-object v0

    invoke-direct {v1, v0}, Lcg/r;-><init>(Lcg/H;)V

    .line 162
    const-string v0, "Content-Type"

    invoke-static {v0, p0}, Lokhttp3/Response;->b(Ljava/lang/String;Lokhttp3/Response;)Ljava/lang/String;

    move-result-object p0

    .line 163
    new-instance v0, Lokhttp3/internal/http/RealResponseBody;

    invoke-static {v1}, Lcg/b;->d(Lcg/H;)Lcg/B;

    move-result-object v1

    const-wide/16 v2, -0x1

    invoke-direct {v0, p0, v2, v3, v1}, Lokhttp3/internal/http/RealResponseBody;-><init>(Ljava/lang/String;JLcg/B;)V

    :cond_0
    return-object v0
.end method

.method public static final a(Lcom/vungle/ads/internal/downloader/k;Lcom/vungle/ads/internal/downloader/h;Lcom/vungle/ads/internal/downloader/d;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Failed to execute download request: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/vungle/ads/internal/downloader/k;->a()Lcom/vungle/ads/internal/model/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/vungle/ads/internal/model/b;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 4
    new-instance v0, Lcom/vungle/ads/internal/downloader/b;

    .line 5
    new-instance v1, Lcom/vungle/ads/OutOfMemory;

    invoke-direct {v1, p1}, Lcom/vungle/ads/OutOfMemory;-><init>(Ljava/lang/String;)V

    const/4 p1, -0x1

    const/4 v2, 0x4

    .line 6
    invoke-direct {v0, p1, v1, v2}, Lcom/vungle/ads/internal/downloader/b;-><init>(ILjava/lang/Exception;I)V

    if-eqz p2, :cond_0

    .line 7
    check-cast p2, Lcom/vungle/ads/internal/load/c;

    invoke-virtual {p2, v0, p0}, Lcom/vungle/ads/internal/load/c;->a(Lcom/vungle/ads/internal/downloader/b;Lcom/vungle/ads/internal/downloader/k;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/vungle/ads/internal/downloader/k;Lcom/vungle/ads/internal/downloader/d;)Lcom/vungle/ads/internal/downloader/b;
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    .line 8
    const-string v3, "download status: "

    const-string v0, "Start download from url: "

    invoke-virtual {v2}, Lcom/vungle/ads/internal/downloader/k;->a()Lcom/vungle/ads/internal/model/b;

    move-result-object v4

    .line 9
    sget-boolean v5, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 10
    const-string v5, "launch request in thread: "

    invoke-static {v5}, Lcom/iab/omid/library/vungle/internal/l;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 11
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->getId()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " request: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/vungle/ads/internal/model/b;->h()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 12
    const-string v6, "AssetDownloader"

    invoke-static {v6, v5}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    invoke-virtual {v2}, Lcom/vungle/ads/internal/downloader/k;->e()Z

    move-result v5

    const/4 v7, 0x3

    const/4 v8, 0x0

    if-eqz v5, :cond_0

    .line 14
    const-string v0, "Request "

    invoke-static {v0}, Lcom/iab/omid/library/vungle/internal/l;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 15
    invoke-virtual {v4}, Lcom/vungle/ads/internal/model/b;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " is cancelled before starting"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 16
    invoke-static {v6, v0}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    new-instance v0, Lcom/vungle/ads/internal/downloader/c;

    invoke-direct {v0}, Lcom/vungle/ads/internal/downloader/c;-><init>()V

    .line 18
    invoke-virtual {v0, v7}, Lcom/vungle/ads/internal/downloader/c;->b(I)V

    return-object v8

    .line 19
    :cond_0
    new-instance v5, Lcom/vungle/ads/internal/downloader/c;

    invoke-direct {v5}, Lcom/vungle/ads/internal/downloader/c;-><init>()V

    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    invoke-virtual {v5, v9, v10}, Lcom/vungle/ads/internal/downloader/c;->c(J)V

    .line 21
    invoke-virtual {v4}, Lcom/vungle/ads/internal/model/b;->h()Ljava/lang/String;

    move-result-object v9

    .line 22
    invoke-virtual {v4}, Lcom/vungle/ads/internal/model/b;->c()Ljava/lang/String;

    move-result-object v10

    .line 23
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v11

    const/4 v12, 0x4

    const/4 v13, -0x1

    if-nez v11, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v9}, Lcom/vungle/ads/internal/util/n;->a(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_2

    .line 24
    :goto_0
    new-instance v0, Lcom/vungle/ads/internal/downloader/b;

    .line 25
    new-instance v3, Lcom/vungle/ads/InvalidAssetUrlError;

    .line 26
    const-string v4, "invalid url: "

    invoke-static {v4, v9}, Lcom/iab/omid/library/vungle/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 27
    invoke-direct {v3, v4}, Lcom/vungle/ads/InvalidAssetUrlError;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/vungle/ads/internal/downloader/k;->c()Lcom/vungle/ads/internal/util/s;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/vungle/ads/VungleError;->setLogEntry$vungle_ads_release(Lcom/vungle/ads/internal/util/s;)Lcom/vungle/ads/VungleError;

    move-result-object v2

    .line 28
    invoke-virtual {v2}, Lcom/vungle/ads/VungleError;->logError$vungle_ads_release()Lcom/vungle/ads/VungleError;

    move-result-object v2

    .line 29
    invoke-direct {v0, v13, v2, v12}, Lcom/vungle/ads/internal/downloader/b;-><init>(ILjava/lang/Exception;I)V

    return-object v0

    .line 30
    :cond_2
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v11

    if-nez v11, :cond_3

    .line 31
    new-instance v0, Lcom/vungle/ads/internal/downloader/b;

    .line 32
    new-instance v3, Lcom/vungle/ads/AssetWriteError;

    .line 33
    const-string v4, "invalid path: "

    invoke-static {v4, v10}, Lcom/iab/omid/library/vungle/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 34
    invoke-direct {v3, v4}, Lcom/vungle/ads/AssetWriteError;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/vungle/ads/internal/downloader/k;->c()Lcom/vungle/ads/internal/util/s;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/vungle/ads/VungleError;->setLogEntry$vungle_ads_release(Lcom/vungle/ads/internal/util/s;)Lcom/vungle/ads/VungleError;

    move-result-object v2

    .line 35
    invoke-virtual {v2}, Lcom/vungle/ads/VungleError;->logError$vungle_ads_release()Lcom/vungle/ads/VungleError;

    move-result-object v2

    .line 36
    invoke-direct {v0, v13, v2, v7}, Lcom/vungle/ads/internal/downloader/b;-><init>(ILjava/lang/Exception;I)V

    return-object v0

    .line 37
    :cond_3
    iget-object v11, v1, Lcom/vungle/ads/internal/downloader/h;->b:Lcom/vungle/ads/internal/util/PathProvider;

    invoke-virtual {v11}, Lcom/vungle/ads/internal/util/PathProvider;->c()Ljava/io/File;

    move-result-object v11

    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v11

    const-string v14, "pathProvider.getVungleDir().absolutePath"

    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11}, Lcom/vungle/ads/internal/util/PathProvider;->a(Ljava/lang/String;)J

    move-result-wide v14

    const-wide/32 v16, 0x1400000

    cmp-long v11, v14, v16

    const/4 v12, 0x2

    const/4 v7, 0x1

    if-gez v11, :cond_4

    .line 38
    new-instance v0, Lcom/vungle/ads/NoSpaceError;

    const-string v3, "Insufficient space "

    .line 39
    invoke-static {v14, v15, v3}, LA7/p0;->k(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 40
    invoke-direct {v0, v3}, Lcom/vungle/ads/NoSpaceError;-><init>(Ljava/lang/String;)V

    .line 41
    invoke-virtual {v2}, Lcom/vungle/ads/internal/downloader/k;->c()Lcom/vungle/ads/internal/util/s;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/vungle/ads/VungleError;->setLogEntry$vungle_ads_release(Lcom/vungle/ads/internal/util/s;)Lcom/vungle/ads/VungleError;

    move-result-object v0

    invoke-virtual {v0}, Lcom/vungle/ads/VungleError;->logErrorNoReturnValue$vungle_ads_release()V

    .line 42
    new-instance v0, Lcom/vungle/ads/internal/downloader/b;

    .line 43
    new-instance v3, Lcom/vungle/ads/NoSpaceError;

    invoke-direct {v3, v8, v7, v8}, Lcom/vungle/ads/NoSpaceError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2}, Lcom/vungle/ads/internal/downloader/k;->c()Lcom/vungle/ads/internal/util/s;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/vungle/ads/VungleError;->setLogEntry$vungle_ads_release(Lcom/vungle/ads/internal/util/s;)Lcom/vungle/ads/VungleError;

    move-result-object v2

    invoke-virtual {v2}, Lcom/vungle/ads/VungleError;->logError$vungle_ads_release()Lcom/vungle/ads/VungleError;

    move-result-object v2

    .line 44
    invoke-direct {v0, v13, v2, v12}, Lcom/vungle/ads/internal/downloader/b;-><init>(ILjava/lang/Exception;I)V

    return-object v0

    .line 45
    :cond_4
    new-instance v11, Ljava/io/File;

    invoke-direct {v11, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 46
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v10

    if-eqz v10, :cond_5

    .line 47
    const-string v10, "Deleting existing file before download: "

    invoke-static {v10}, Lcom/iab/omid/library/vungle/internal/l;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 48
    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v6, v10}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    invoke-virtual {v11}, Ljava/io/File;->delete()Z

    move-result v10

    if-nez v10, :cond_5

    .line 50
    new-instance v0, Lcom/vungle/ads/internal/downloader/b;

    .line 51
    new-instance v3, Lcom/vungle/ads/AssetWriteError;

    const-string v4, "Cannot delete partial file for restart"

    invoke-direct {v3, v4}, Lcom/vungle/ads/AssetWriteError;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/vungle/ads/internal/downloader/k;->c()Lcom/vungle/ads/internal/util/s;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/vungle/ads/VungleError;->setLogEntry$vungle_ads_release(Lcom/vungle/ads/internal/util/s;)Lcom/vungle/ads/VungleError;

    move-result-object v2

    invoke-virtual {v2}, Lcom/vungle/ads/VungleError;->logError$vungle_ads_release()Lcom/vungle/ads/VungleError;

    move-result-object v2

    .line 52
    invoke-direct {v0, v13, v2, v12}, Lcom/vungle/ads/internal/downloader/b;-><init>(ILjava/lang/Exception;I)V

    return-object v0

    .line 53
    :cond_5
    :try_start_0
    invoke-virtual {v11}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v12
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_d
    .catchall {:try_start_0 .. :try_end_0} :catchall_b

    if-eqz v12, :cond_6

    .line 54
    :try_start_1
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    move-result v14

    if-nez v14, :cond_6

    .line 55
    invoke-virtual {v12}, Ljava/io/File;->mkdirs()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v7, v8

    move-object v12, v7

    move-object v14, v12

    move-object v15, v14

    goto/16 :goto_1f

    :catch_0
    move-exception v0

    move-object/from16 v23, v4

    move-object v7, v8

    move-object v12, v7

    move-object v14, v12

    move-object v15, v14

    goto/16 :goto_19

    .line 56
    :cond_6
    :goto_1
    :try_start_2
    new-instance v12, Lokhttp3/Request$Builder;

    invoke-direct {v12}, Lokhttp3/Request$Builder;-><init>()V

    invoke-virtual {v12, v9}, Lokhttp3/Request$Builder;->h(Ljava/lang/String;)V

    .line 57
    iget-object v14, v1, Lcom/vungle/ads/internal/downloader/h;->c:Lef/i;

    invoke-interface {v14}, Lef/i;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lokhttp3/OkHttpClient;

    .line 58
    invoke-virtual {v12}, Lokhttp3/Request$Builder;->b()Lokhttp3/Request;

    move-result-object v12

    invoke-virtual {v14, v12}, Lokhttp3/OkHttpClient;->a(Lokhttp3/Request;)Lokhttp3/internal/connection/RealCall;

    move-result-object v12
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_d
    .catchall {:try_start_2 .. :try_end_2} :catchall_b

    .line 59
    :try_start_3
    invoke-virtual {v12}, Lokhttp3/internal/connection/RealCall;->execute()Lokhttp3/Response;

    move-result-object v14
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_c
    .catchall {:try_start_3 .. :try_end_3} :catchall_a

    .line 60
    :try_start_4
    iget v13, v14, Lokhttp3/Response;->d:I

    .line 61
    invoke-virtual {v14}, Lokhttp3/Response;->d()Z

    move-result v15

    if-eqz v15, :cond_18

    .line 62
    iget-object v15, v14, Lokhttp3/Response;->i:Lokhttp3/Response;

    if-eqz v15, :cond_7

    .line 63
    sget-object v15, Lcom/vungle/ads/internal/AnalyticsClient;->INSTANCE:Lcom/vungle/ads/internal/AnalyticsClient;

    .line 64
    new-instance v8, Lcom/vungle/ads/internal/m2;

    sget-object v10, Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;->CACHED_ASSETS_USED:Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;

    invoke-direct {v8, v10}, Lcom/vungle/ads/internal/m2;-><init>(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V

    .line 65
    invoke-virtual {v2}, Lcom/vungle/ads/internal/downloader/k;->c()Lcom/vungle/ads/internal/util/s;

    move-result-object v10

    .line 66
    invoke-virtual {v15, v8, v10, v9}, Lcom/vungle/ads/internal/AnalyticsClient;->a(Lcom/vungle/ads/internal/m2;Lcom/vungle/ads/internal/util/s;Ljava/lang/String;)V

    goto :goto_5

    :catchall_1
    move-exception v0

    const/4 v7, 0x0

    :goto_2
    const/4 v15, 0x0

    goto/16 :goto_1f

    :catch_1
    move-exception v0

    move-object/from16 v23, v4

    :goto_3
    const/4 v7, 0x0

    :goto_4
    const/4 v15, 0x0

    goto/16 :goto_19

    .line 67
    :cond_7
    :goto_5
    invoke-static {v14}, Lcom/vungle/ads/internal/downloader/h;->a(Lokhttp3/Response;)Lokhttp3/ResponseBody;

    move-result-object v8

    .line 68
    const-string v10, "Content-Type"

    invoke-static {v10, v14}, Lokhttp3/Response;->b(Ljava/lang/String;Lokhttp3/Response;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_8

    .line 69
    invoke-virtual {v2}, Lcom/vungle/ads/internal/downloader/k;->a()Lcom/vungle/ads/internal/model/b;

    move-result-object v15

    invoke-virtual {v15, v10}, Lcom/vungle/ads/internal/model/b;->a(Ljava/lang/String;)V

    :cond_8
    if-eqz v8, :cond_9

    .line 70
    invoke-virtual {v8}, Lokhttp3/ResponseBody;->source()Lcg/i;

    move-result-object v15
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_6

    :cond_9
    const/4 v15, 0x0

    .line 71
    :goto_6
    :try_start_5
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " mimeType="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    invoke-static {v11}, Lcg/b;->k(Ljava/io/File;)Lcg/c;

    move-result-object v0

    invoke-static {v0}, Lcg/b;->c(Lcg/F;)Lcg/A;

    move-result-object v7
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_a
    .catchall {:try_start_5 .. :try_end_5} :catchall_9

    if-eqz v8, :cond_a

    .line 73
    :try_start_6
    invoke-virtual {v8}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v18
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    move-wide/from16 v0, v18

    goto :goto_8

    :catchall_2
    move-exception v0

    goto/16 :goto_1f

    :catch_2
    move-exception v0

    :goto_7
    move-object/from16 v23, v4

    goto/16 :goto_19

    :cond_a
    const-wide/16 v0, 0x0

    :goto_8
    const/4 v8, 0x0

    .line 74
    :try_start_7
    invoke-virtual {v5, v8}, Lcom/vungle/ads/internal/downloader/c;->b(I)V

    .line 75
    invoke-virtual {v5, v0, v1}, Lcom/vungle/ads/internal/downloader/c;->b(J)V

    move-object v10, v9

    const-wide/16 v8, 0x0

    .line 76
    invoke-virtual {v5, v8, v9}, Lcom/vungle/ads/internal/downloader/c;->a(J)V

    const/4 v8, 0x0

    .line 77
    invoke-virtual {v5, v8}, Lcom/vungle/ads/internal/downloader/c;->a(I)V

    .line 78
    invoke-virtual {v4, v0, v1}, Lcom/vungle/ads/internal/model/b;->a(J)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_9
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    if-eqz p2, :cond_b

    .line 79
    :try_start_8
    move-object/from16 v9, p2

    check-cast v9, Lcom/vungle/ads/internal/load/c;

    invoke-virtual {v9, v5, v2}, Lcom/vungle/ads/internal/load/c;->a(Lcom/vungle/ads/internal/downloader/c;Lcom/vungle/ads/internal/downloader/k;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :cond_b
    move/from16 v20, v8

    const-wide/16 v8, 0x0

    :goto_9
    if-eqz v15, :cond_c

    move-wide/from16 v21, v0

    .line 80
    :try_start_9
    iget-object v0, v7, Lcg/A;->b:Lcg/g;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    move-object v1, v7

    move-wide/from16 v23, v8

    const-wide/16 v7, 0x2000

    .line 81
    :try_start_a
    invoke-interface {v15, v0, v7, v8}, Lcg/H;->read(Lcg/g;J)J

    move-result-wide v7
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :goto_a
    const-wide/16 v18, 0x0

    goto :goto_d

    :catchall_3
    move-exception v0

    :goto_b
    move-object v7, v1

    goto/16 :goto_1f

    :catch_3
    move-exception v0

    :goto_c
    move-object v7, v1

    goto :goto_7

    :catchall_4
    move-exception v0

    move-object v1, v7

    goto :goto_b

    :catch_4
    move-exception v0

    move-object v1, v7

    goto :goto_c

    :cond_c
    move-wide/from16 v21, v0

    move-object v1, v7

    move-wide/from16 v23, v8

    const-wide/16 v7, -0x1

    goto :goto_a

    :goto_d
    cmp-long v0, v7, v18

    if-lez v0, :cond_d

    .line 82
    :try_start_b
    invoke-virtual {v2}, Lcom/vungle/ads/internal/downloader/k;->e()Z

    move-result v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_8
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    if-eqz v0, :cond_e

    const/4 v9, 0x3

    .line 83
    :try_start_c
    invoke-virtual {v5, v9}, Lcom/vungle/ads/internal/downloader/c;->b(I)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :cond_d
    move-object/from16 v24, v1

    move-object/from16 v23, v4

    goto/16 :goto_16

    .line 84
    :cond_e
    :try_start_d
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_15

    const/4 v9, 0x1

    .line 85
    invoke-virtual {v5, v9}, Lcom/vungle/ads/internal/downloader/c;->b(I)V

    .line 86
    invoke-virtual {v1}, Lcg/A;->a()Lcg/h;

    .line 87
    invoke-virtual {v1}, Lcg/A;->flush()V

    add-long v7, v23, v7

    .line 88
    invoke-virtual {v5, v7, v8}, Lcom/vungle/ads/internal/downloader/c;->a(J)V

    .line 89
    invoke-virtual {v4}, Lcom/vungle/ads/internal/model/b;->f()Ljava/lang/Long;

    move-result-object v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_8
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    if-eqz v0, :cond_f

    :try_start_e
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v23
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_3
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    :goto_e
    move-object v9, v1

    move-wide/from16 v0, v23

    goto :goto_f

    :cond_f
    :try_start_f
    invoke-virtual {v4}, Lcom/vungle/ads/internal/model/b;->g()J

    move-result-wide v23
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_8
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    goto :goto_e

    .line 90
    :goto_f
    :try_start_10
    invoke-virtual {v4}, Lcom/vungle/ads/internal/model/b;->o()Z

    move-result v23

    if-eqz v23, :cond_10

    cmp-long v23, v7, v0

    if-ltz v23, :cond_10

    .line 91
    sget-boolean v23, Lcom/vungle/ads/internal/util/u;->a:Z
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_7
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    move-object/from16 v23, v4

    :try_start_11
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_6
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    move-object/from16 v24, v9

    :try_start_12
    const-string v9, "Downloader totalRead="

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v9, " requiredBytes="

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lcom/vungle/ads/internal/util/t;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    invoke-virtual/range {v23 .. v23}, Lcom/vungle/ads/internal/model/b;->p()V

    :goto_10
    const-wide/16 v18, 0x0

    goto :goto_14

    :catchall_5
    move-exception v0

    :goto_11
    move-object/from16 v7, v24

    goto/16 :goto_1f

    :catch_5
    move-exception v0

    :goto_12
    move-object/from16 v7, v24

    goto/16 :goto_19

    :catchall_6
    move-exception v0

    move-object/from16 v24, v9

    goto :goto_11

    :catch_6
    move-exception v0

    :goto_13
    move-object/from16 v24, v9

    goto :goto_12

    :catch_7
    move-exception v0

    move-object/from16 v23, v4

    goto :goto_13

    :cond_10
    move-object/from16 v23, v4

    move-object/from16 v24, v9

    goto :goto_10

    :goto_14
    cmp-long v0, v21, v18

    const/16 v1, 0x64

    move-wide/from16 v25, v7

    if-lez v0, :cond_11

    int-to-long v7, v1

    mul-long v7, v7, v25

    .line 93
    div-long v7, v7, v21

    long-to-int v0, v7

    goto :goto_15

    :cond_11
    move/from16 v0, v20

    .line 94
    :cond_12
    :goto_15
    invoke-virtual {v5}, Lcom/vungle/ads/internal/downloader/c;->a()I

    move-result v4

    const/4 v9, 0x1

    add-int/2addr v4, v9

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v7

    if-gt v4, v7, :cond_14

    .line 95
    invoke-virtual {v5, v9}, Lcom/vungle/ads/internal/downloader/c;->b(I)V

    .line 96
    invoke-virtual {v5}, Lcom/vungle/ads/internal/downloader/c;->a()I

    move-result v4

    add-int/2addr v4, v9

    invoke-virtual {v5, v4}, Lcom/vungle/ads/internal/downloader/c;->a(I)V

    .line 97
    invoke-virtual {v5}, Lcom/vungle/ads/internal/downloader/c;->a()I

    move-result v4

    if-lt v4, v1, :cond_13

    const/4 v4, 0x4

    .line 98
    invoke-virtual {v5, v4}, Lcom/vungle/ads/internal/downloader/c;->b(I)V

    :cond_13
    if-eqz p2, :cond_12

    .line 99
    move-object/from16 v4, p2

    check-cast v4, Lcom/vungle/ads/internal/load/c;

    invoke-virtual {v4, v5, v2}, Lcom/vungle/ads/internal/load/c;->a(Lcom/vungle/ads/internal/downloader/c;Lcom/vungle/ads/internal/downloader/k;)V

    goto :goto_15

    :cond_14
    move/from16 v20, v0

    move-wide/from16 v0, v21

    move-object/from16 v4, v23

    move-object/from16 v7, v24

    move-wide/from16 v8, v25

    goto/16 :goto_9

    :catchall_7
    move-exception v0

    move-object/from16 v24, v1

    goto :goto_11

    :catch_8
    move-exception v0

    move-object/from16 v24, v1

    move-object/from16 v23, v4

    goto :goto_12

    :cond_15
    move-object/from16 v24, v1

    move-object/from16 v23, v4

    .line 100
    new-instance v0, Lcom/vungle/ads/AssetWriteError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Asset save error "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/vungle/ads/AssetWriteError;-><init>(Ljava/lang/String;)V

    .line 101
    invoke-virtual {v2}, Lcom/vungle/ads/internal/downloader/k;->c()Lcom/vungle/ads/internal/util/s;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/vungle/ads/VungleError;->setLogEntry$vungle_ads_release(Lcom/vungle/ads/internal/util/s;)Lcom/vungle/ads/VungleError;

    move-result-object v0

    invoke-virtual {v0}, Lcom/vungle/ads/VungleError;->logErrorNoReturnValue$vungle_ads_release()V

    .line 102
    new-instance v0, Lcom/vungle/ads/internal/downloader/l;

    const-string v1, "File is not existing"

    invoke-direct {v0, v1}, Lcom/vungle/ads/internal/downloader/l;-><init>(Ljava/lang/String;)V

    throw v0

    .line 103
    :goto_16
    invoke-virtual/range {v24 .. v24}, Lcg/A;->flush()V

    .line 104
    invoke-virtual {v5}, Lcom/vungle/ads/internal/downloader/c;->b()I

    move-result v0

    const/4 v9, 0x1

    if-ne v0, v9, :cond_16

    const/4 v4, 0x4

    .line 105
    invoke-virtual {v5, v4}, Lcom/vungle/ads/internal/downloader/c;->b(I)V

    if-eqz p2, :cond_16

    .line 106
    move-object/from16 v0, p2

    check-cast v0, Lcom/vungle/ads/internal/load/c;

    invoke-virtual {v0, v5, v2}, Lcom/vungle/ads/internal/load/c;->a(Lcom/vungle/ads/internal/downloader/c;Lcom/vungle/ads/internal/downloader/k;)V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_5
    .catchall {:try_start_12 .. :try_end_12} :catchall_5

    .line 107
    :cond_16
    iget-object v0, v14, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    if-eqz v0, :cond_17

    .line 108
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->close()V

    .line 109
    :cond_17
    invoke-virtual {v12}, Lokhttp3/internal/connection/RealCall;->cancel()V

    .line 110
    invoke-static/range {v24 .. v24}, Lcom/vungle/ads/internal/util/n;->a(Ljava/io/Closeable;)V

    .line 111
    invoke-static {v15}, Lcom/vungle/ads/internal/util/n;->a(Ljava/io/Closeable;)V

    .line 112
    sget-boolean v0, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 113
    invoke-static {v3}, Lcom/iab/omid/library/vungle/internal/l;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 114
    invoke-virtual {v5}, Lcom/vungle/ads/internal/downloader/c;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v1, 0x0

    goto/16 :goto_1b

    :catchall_8
    move-exception v0

    move-object/from16 v24, v7

    goto/16 :goto_1f

    :catch_9
    move-exception v0

    move-object/from16 v23, v4

    move-object/from16 v24, v7

    goto :goto_19

    :catchall_9
    move-exception v0

    const/4 v7, 0x0

    goto/16 :goto_1f

    :catch_a
    move-exception v0

    move-object/from16 v23, v4

    const/4 v7, 0x0

    goto :goto_19

    :cond_18
    move-object/from16 v23, v4

    .line 115
    :try_start_13
    new-instance v0, Lcom/vungle/ads/internal/downloader/l;

    .line 116
    iget-object v1, v14, Lokhttp3/Response;->c:Ljava/lang/String;

    .line 117
    invoke-direct {v0, v1}, Lcom/vungle/ads/internal/downloader/l;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_b
    .catchall {:try_start_13 .. :try_end_13} :catchall_1

    :catch_b
    move-exception v0

    goto/16 :goto_3

    :catchall_a
    move-exception v0

    const/4 v7, 0x0

    :goto_17
    const/4 v14, 0x0

    goto/16 :goto_2

    :catch_c
    move-exception v0

    move-object/from16 v23, v4

    const/4 v7, 0x0

    :goto_18
    const/4 v14, 0x0

    goto/16 :goto_4

    :catchall_b
    move-exception v0

    const/4 v7, 0x0

    const/4 v12, 0x0

    goto :goto_17

    :catch_d
    move-exception v0

    move-object/from16 v23, v4

    const/4 v7, 0x0

    const/4 v12, 0x0

    goto :goto_18

    .line 118
    :goto_19
    :try_start_14
    sget-boolean v1, Lcom/vungle/ads/internal/util/u;->a:Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Download exception for "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v23 .. v23}, Lcom/vungle/ads/internal/model/b;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Lcom/vungle/ads/internal/util/t;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x7

    .line 119
    invoke-virtual {v5, v1}, Lcom/vungle/ads/internal/downloader/c;->b(I)V

    .line 120
    new-instance v1, Lcom/vungle/ads/internal/downloader/b;

    const/4 v9, 0x1

    invoke-direct {v1, v13, v0, v9}, Lcom/vungle/ads/internal/downloader/b;-><init>(ILjava/lang/Exception;I)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_2

    if-eqz v14, :cond_19

    .line 121
    iget-object v0, v14, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    goto :goto_1a

    :cond_19
    const/4 v0, 0x0

    :goto_1a
    if-eqz v0, :cond_1a

    .line 122
    iget-object v0, v14, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    if-eqz v0, :cond_1a

    .line 123
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->close()V

    :cond_1a
    if-eqz v12, :cond_1b

    .line 124
    invoke-virtual {v12}, Lokhttp3/internal/connection/RealCall;->cancel()V

    .line 125
    :cond_1b
    invoke-static {v7}, Lcom/vungle/ads/internal/util/n;->a(Ljava/io/Closeable;)V

    .line 126
    invoke-static {v15}, Lcom/vungle/ads/internal/util/n;->a(Ljava/io/Closeable;)V

    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Lcom/vungle/ads/internal/downloader/c;->b()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    :goto_1b
    invoke-virtual {v5}, Lcom/vungle/ads/internal/downloader/c;->b()I

    move-result v0

    const/4 v3, 0x7

    if-ne v0, v3, :cond_1c

    goto :goto_1c

    :cond_1c
    if-nez v0, :cond_1d

    :goto_1c
    move-object v8, v1

    goto :goto_1e

    :cond_1d
    const/4 v9, 0x3

    if-ne v0, v9, :cond_1e

    .line 129
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "On cancel "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p2, :cond_20

    .line 130
    move-object/from16 v0, p2

    check-cast v0, Lcom/vungle/ads/internal/load/c;

    invoke-virtual {v0, v5, v2}, Lcom/vungle/ads/internal/load/c;->a(Lcom/vungle/ads/internal/downloader/c;Lcom/vungle/ads/internal/downloader/k;)V

    goto :goto_1d

    .line 131
    :cond_1e
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "On success "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p2, :cond_1f

    .line 132
    move-object/from16 v0, p2

    check-cast v0, Lcom/vungle/ads/internal/load/c;

    invoke-virtual {v0, v11, v2}, Lcom/vungle/ads/internal/load/c;->a(Ljava/io/File;Lcom/vungle/ads/internal/downloader/k;)V

    .line 133
    :cond_1f
    invoke-virtual {v2}, Lcom/vungle/ads/internal/downloader/k;->b()I

    move-result v0

    if-lez v0, :cond_20

    .line 134
    sget-object v1, Lcom/vungle/ads/internal/AnalyticsClient;->INSTANCE:Lcom/vungle/ads/internal/AnalyticsClient;

    .line 135
    sget-object v2, Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;->ASSET_DOWNLOAD_RETRY_STATUS:Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;

    .line 136
    invoke-virtual/range {p1 .. p1}, Lcom/vungle/ads/internal/downloader/k;->c()Lcom/vungle/ads/internal/util/s;

    move-result-object v5

    .line 137
    const-string v3, "retryCount="

    const-string v4, " url="

    .line 138
    invoke-static {v0, v3, v4}, Lpd/f;->l(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 139
    invoke-virtual/range {p1 .. p1}, Lcom/vungle/ads/internal/downloader/k;->a()Lcom/vungle/ads/internal/model/b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/vungle/ads/internal/model/b;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-wide/16 v3, 0x1

    .line 140
    invoke-virtual/range {v1 .. v6}, Lcom/vungle/ads/internal/AnalyticsClient;->c(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;JLcom/vungle/ads/internal/util/s;Ljava/lang/String;)V

    :cond_20
    :goto_1d
    const/4 v8, 0x0

    :goto_1e
    return-object v8

    :goto_1f
    if-eqz v14, :cond_21

    .line 141
    iget-object v8, v14, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    goto :goto_20

    :cond_21
    const/4 v8, 0x0

    :goto_20
    if-eqz v8, :cond_22

    .line 142
    iget-object v1, v14, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    if-eqz v1, :cond_22

    .line 143
    invoke-virtual {v1}, Lokhttp3/ResponseBody;->close()V

    :cond_22
    if-eqz v12, :cond_23

    .line 144
    invoke-virtual {v12}, Lokhttp3/internal/connection/RealCall;->cancel()V

    .line 145
    :cond_23
    invoke-static {v7}, Lcom/vungle/ads/internal/util/n;->a(Ljava/io/Closeable;)V

    .line 146
    invoke-static {v15}, Lcom/vungle/ads/internal/util/n;->a(Ljava/io/Closeable;)V

    .line 147
    sget-boolean v1, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 148
    invoke-static {v3}, Lcom/iab/omid/library/vungle/internal/l;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 149
    invoke-virtual {v5}, Lcom/vungle/ads/internal/downloader/c;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    throw v0
.end method

.method public final a(Lcom/vungle/ads/internal/downloader/k;Lcom/vungle/ads/internal/load/c;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/vungle/ads/internal/downloader/h;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 2
    iget-object v0, p0, Lcom/vungle/ads/internal/downloader/h;->a:Lcom/vungle/ads/internal/executor/j;

    new-instance v1, Lcom/vungle/ads/internal/downloader/f;

    invoke-direct {v1, p1, p0, p2}, Lcom/vungle/ads/internal/downloader/f;-><init>(Lcom/vungle/ads/internal/downloader/k;Lcom/vungle/ads/internal/downloader/h;Lcom/vungle/ads/internal/load/c;)V

    new-instance v2, LAb/a;

    const/4 v3, 0x0

    invoke-direct {v2, p1, p0, p2, v3}, LAb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1, v2}, Lcom/vungle/ads/internal/executor/j;->a(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    return-void
.end method
