.class public final Lcom/vungle/ads/internal/load/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/vungle/ads/internal/downloader/d;


# instance fields
.field public a:Z

.field public final synthetic b:Lcom/vungle/ads/internal/load/g;


# direct methods
.method public constructor <init>(Lcom/vungle/ads/internal/load/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/vungle/ads/internal/load/c;->b:Lcom/vungle/ads/internal/load/g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final a(Lcom/vungle/ads/internal/downloader/k;Lcom/vungle/ads/internal/load/g;Lcom/vungle/ads/internal/load/c;Lcom/vungle/ads/internal/downloader/b;)V
    .locals 3

    const-string v0, "$downloadRequest"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-virtual {p0}, Lcom/vungle/ads/internal/downloader/k;->a()Lcom/vungle/ads/internal/model/b;

    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lcom/vungle/ads/internal/model/b;->m()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 29
    invoke-virtual {p1}, Lcom/vungle/ads/internal/load/g;->f()Lcom/vungle/ads/internal/util/PathProvider;

    move-result-object v1

    invoke-virtual {v1}, Lcom/vungle/ads/internal/util/PathProvider;->getVmDir()Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Lcom/vungle/ads/internal/downloader/i;->a(Ljava/io/File;)Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 30
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 31
    invoke-virtual {p2, v1, p0}, Lcom/vungle/ads/internal/load/c;->a(Ljava/io/File;Lcom/vungle/ads/internal/downloader/k;)V

    return-void

    .line 32
    :cond_0
    new-instance p2, Lcom/vungle/ads/PrivacyIconFallbackError;

    const-string v1, "Failed to inject default privacy icon"

    invoke-direct {p2, v1}, Lcom/vungle/ads/PrivacyIconFallbackError;-><init>(Ljava/lang/String;)V

    .line 33
    invoke-virtual {p1}, Lcom/vungle/ads/internal/load/g;->e()Lcom/vungle/ads/internal/util/s;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/vungle/ads/VungleError;->setLogEntry$vungle_ads_release(Lcom/vungle/ads/internal/util/s;)Lcom/vungle/ads/VungleError;

    move-result-object p2

    invoke-virtual {p2}, Lcom/vungle/ads/VungleError;->logErrorNoReturnValue$vungle_ads_release()V

    .line 34
    :cond_1
    sget-object p2, Lcom/vungle/ads/internal/model/a;->b:Lcom/vungle/ads/internal/model/a;

    invoke-virtual {v0, p2}, Lcom/vungle/ads/internal/model/b;->a(Lcom/vungle/ads/internal/model/a;)V

    .line 35
    invoke-static {p1}, Lcom/vungle/ads/internal/load/g;->c(Lcom/vungle/ads/internal/load/g;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p2

    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 36
    invoke-virtual {v0}, Lcom/vungle/ads/internal/model/b;->n()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 37
    invoke-static {p1}, Lcom/vungle/ads/internal/load/g;->e(Lcom/vungle/ads/internal/load/g;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 38
    :cond_2
    const-string p2, "Failed to download assets "

    invoke-static {p2}, Lcom/iab/omid/library/vungle/internal/l;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 39
    invoke-virtual {v0}, Lcom/vungle/ads/internal/model/b;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". error: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " errorType="

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_3

    .line 40
    invoke-virtual {p3}, Lcom/vungle/ads/internal/downloader/b;->a()Ljava/lang/Throwable;

    move-result-object p3

    goto :goto_0

    :cond_3
    const/4 p3, 0x0

    :goto_0
    invoke-static {p3}, Lcom/vungle/ads/internal/platform/e;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p3

    .line 41
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " proxyEnabled="

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    invoke-virtual {p1}, Lcom/vungle/ads/internal/load/g;->d()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lcom/vungle/ads/internal/platform/e;->e(Landroid/content/Context;)Z

    move-result p3

    .line 43
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p3, " privateDns="

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    invoke-virtual {p1}, Lcom/vungle/ads/internal/load/g;->d()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lcom/vungle/ads/internal/platform/e;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p3

    .line 45
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " network="

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    invoke-virtual {p1}, Lcom/vungle/ads/internal/load/g;->d()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lcom/vungle/ads/internal/platform/e;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p3

    .line 47
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 48
    new-instance p3, Lcom/vungle/ads/AssetRequestError;

    invoke-direct {p3, p2}, Lcom/vungle/ads/AssetRequestError;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/vungle/ads/internal/load/g;->e()Lcom/vungle/ads/internal/util/s;

    move-result-object p2

    invoke-virtual {p3, p2}, Lcom/vungle/ads/VungleError;->setLogEntry$vungle_ads_release(Lcom/vungle/ads/internal/util/s;)Lcom/vungle/ads/VungleError;

    move-result-object p2

    invoke-virtual {p2}, Lcom/vungle/ads/VungleError;->logErrorNoReturnValue$vungle_ads_release()V

    .line 49
    invoke-virtual {v0}, Lcom/vungle/ads/internal/model/b;->n()Z

    move-result p2

    if-eqz p2, :cond_4

    .line 50
    invoke-static {p1}, Lcom/vungle/ads/internal/load/g;->b(Lcom/vungle/ads/internal/load/g;)Ljava/util/LinkedHashSet;

    move-result-object p2

    invoke-virtual {p0}, Lcom/vungle/ads/internal/downloader/k;->a()Lcom/vungle/ads/internal/model/b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/vungle/ads/internal/model/b;->h()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p2, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 51
    invoke-static {p1}, Lcom/vungle/ads/internal/load/g;->b(Lcom/vungle/ads/internal/load/g;)Ljava/util/LinkedHashSet;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_4

    .line 52
    invoke-virtual {p1}, Lcom/vungle/ads/internal/load/g;->a()V

    .line 53
    new-instance p0, Lcom/vungle/ads/AssetRequestError;

    const-string p2, "Error: Failed to download required assets."

    invoke-direct {p0, p2}, Lcom/vungle/ads/AssetRequestError;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lcom/vungle/ads/internal/load/g;->a(Lcom/vungle/ads/VungleError;)V

    return-void

    .line 54
    :cond_4
    invoke-static {p1}, Lcom/vungle/ads/internal/load/g;->a(Lcom/vungle/ads/internal/load/g;)Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->decrementAndGet()J

    move-result-wide p2

    const-wide/16 v0, 0x0

    cmp-long p0, p2, v0

    if-gtz p0, :cond_5

    .line 55
    new-instance p0, Lcom/vungle/ads/AssetRequestError;

    const-string p2, "Error: Failed to download assets."

    invoke-direct {p0, p2}, Lcom/vungle/ads/AssetRequestError;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lcom/vungle/ads/internal/load/g;->a(Lcom/vungle/ads/VungleError;)V

    :cond_5
    return-void
.end method

.method public static final a(Lcom/vungle/ads/internal/load/g;Lcom/vungle/ads/internal/model/b;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$adAsset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-static {p0}, Lcom/vungle/ads/internal/load/g;->b(Lcom/vungle/ads/internal/load/g;)Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/b;->h()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 20
    invoke-static {p0}, Lcom/vungle/ads/internal/load/g;->b(Lcom/vungle/ads/internal/load/g;)Ljava/util/LinkedHashSet;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 21
    invoke-static {p0}, Lcom/vungle/ads/internal/load/g;->e(Lcom/vungle/ads/internal/load/g;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 22
    invoke-static {p0}, Lcom/vungle/ads/internal/load/g;->g(Lcom/vungle/ads/internal/load/g;)V

    return-void

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/vungle/ads/internal/load/g;->a()V

    .line 24
    new-instance p1, Lcom/vungle/ads/AssetRequestError;

    const-string v0, "Failed to download required assets."

    invoke-direct {p1, v0}, Lcom/vungle/ads/AssetRequestError;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/vungle/ads/internal/load/g;->a(Lcom/vungle/ads/VungleError;)V

    :cond_1
    return-void
.end method

.method public static final a(Ljava/io/File;Lcom/vungle/ads/internal/load/c;Lcom/vungle/ads/internal/downloader/k;Lcom/vungle/ads/internal/load/g;)V
    .locals 3

    const-string v0, "$file"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$downloadRequest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$1"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 58
    new-instance p0, Lcom/vungle/ads/internal/downloader/b;

    .line 59
    new-instance p3, Ljava/io/IOException;

    const-string v0, "Downloaded file not found!"

    invoke-direct {p3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    const/4 v0, -0x1

    const/4 v1, 0x3

    .line 60
    invoke-direct {p0, v0, p3, v1}, Lcom/vungle/ads/internal/downloader/b;-><init>(ILjava/lang/Exception;I)V

    .line 61
    invoke-virtual {p1, p0, p2}, Lcom/vungle/ads/internal/load/c;->a(Lcom/vungle/ads/internal/downloader/b;Lcom/vungle/ads/internal/downloader/k;)V

    return-void

    .line 62
    :cond_0
    invoke-virtual {p2}, Lcom/vungle/ads/internal/downloader/k;->a()Lcom/vungle/ads/internal/model/b;

    move-result-object p1

    .line 63
    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/vungle/ads/internal/model/b;->b(J)V

    .line 64
    sget-object v0, Lcom/vungle/ads/internal/model/a;->c:Lcom/vungle/ads/internal/model/a;

    invoke-virtual {p1, v0}, Lcom/vungle/ads/internal/model/b;->a(Lcom/vungle/ads/internal/model/a;)V

    .line 65
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/b;->e()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 66
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x64

    if-ne v0, v1, :cond_2

    .line 67
    :cond_1
    invoke-virtual {p2}, Lcom/vungle/ads/internal/downloader/k;->h()V

    .line 68
    :cond_2
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/b;->j()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 69
    invoke-virtual {p2}, Lcom/vungle/ads/internal/downloader/k;->i()V

    .line 70
    invoke-static {p3}, Lcom/vungle/ads/internal/load/g;->f(Lcom/vungle/ads/internal/load/g;)Lcom/vungle/ads/internal/m2;

    move-result-object p2

    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/vungle/ads/internal/m2;->a(Ljava/lang/Long;)V

    .line 71
    sget-object p2, Lcom/vungle/ads/internal/AnalyticsClient;->INSTANCE:Lcom/vungle/ads/internal/AnalyticsClient;

    .line 72
    invoke-static {p3}, Lcom/vungle/ads/internal/load/g;->f(Lcom/vungle/ads/internal/load/g;)Lcom/vungle/ads/internal/m2;

    move-result-object v0

    .line 73
    invoke-virtual {p3}, Lcom/vungle/ads/internal/load/g;->e()Lcom/vungle/ads/internal/util/s;

    move-result-object v1

    .line 74
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/b;->h()Ljava/lang/String;

    move-result-object v2

    .line 75
    invoke-virtual {p2, v0, v1, v2}, Lcom/vungle/ads/internal/AnalyticsClient;->a(Lcom/vungle/ads/internal/m2;Lcom/vungle/ads/internal/util/s;Ljava/lang/String;)V

    goto :goto_0

    .line 76
    :cond_3
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/b;->l()Z

    move-result p2

    if-eqz p2, :cond_4

    .line 77
    invoke-static {p3}, Lcom/vungle/ads/internal/load/g;->d(Lcom/vungle/ads/internal/load/g;)Lcom/vungle/ads/internal/m2;

    move-result-object p2

    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/vungle/ads/internal/m2;->a(Ljava/lang/Long;)V

    .line 78
    sget-object p2, Lcom/vungle/ads/internal/AnalyticsClient;->INSTANCE:Lcom/vungle/ads/internal/AnalyticsClient;

    .line 79
    invoke-static {p3}, Lcom/vungle/ads/internal/load/g;->d(Lcom/vungle/ads/internal/load/g;)Lcom/vungle/ads/internal/m2;

    move-result-object v0

    .line 80
    invoke-virtual {p3}, Lcom/vungle/ads/internal/load/g;->e()Lcom/vungle/ads/internal/util/s;

    move-result-object v1

    .line 81
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/b;->h()Ljava/lang/String;

    move-result-object v2

    .line 82
    invoke-virtual {p2, v0, v1, v2}, Lcom/vungle/ads/internal/AnalyticsClient;->a(Lcom/vungle/ads/internal/m2;Lcom/vungle/ads/internal/util/s;Ljava/lang/String;)V

    .line 83
    :cond_4
    :goto_0
    invoke-virtual {p3}, Lcom/vungle/ads/internal/load/g;->c()Lcom/vungle/ads/internal/model/h0;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, p0, v0}, Lcom/vungle/ads/internal/model/h0;->a(Ljava/io/File;Ljava/lang/String;)V

    .line 84
    :cond_5
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/b;->j()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-virtual {p3}, Lcom/vungle/ads/internal/load/g;->c()Lcom/vungle/ads/internal/model/h0;

    move-result-object p0

    invoke-static {p3, p1, p0}, Lcom/vungle/ads/internal/load/g;->a(Lcom/vungle/ads/internal/load/g;Lcom/vungle/ads/internal/model/b;Lcom/vungle/ads/internal/model/h0;)Z

    move-result p0

    if-nez p0, :cond_6

    .line 85
    invoke-static {p3}, Lcom/vungle/ads/internal/load/g;->c(Lcom/vungle/ads/internal/load/g;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 86
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/b;->n()Z

    move-result p0

    if-eqz p0, :cond_6

    .line 87
    invoke-static {p3}, Lcom/vungle/ads/internal/load/g;->e(Lcom/vungle/ads/internal/load/g;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 88
    :cond_6
    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/b;->n()Z

    move-result p0

    if-eqz p0, :cond_8

    .line 89
    invoke-static {p3}, Lcom/vungle/ads/internal/load/g;->b(Lcom/vungle/ads/internal/load/g;)Ljava/util/LinkedHashSet;

    move-result-object p0

    invoke-virtual {p1}, Lcom/vungle/ads/internal/model/b;->h()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 90
    invoke-static {p3}, Lcom/vungle/ads/internal/load/g;->b(Lcom/vungle/ads/internal/load/g;)Ljava/util/LinkedHashSet;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_8

    .line 91
    invoke-static {p3}, Lcom/vungle/ads/internal/load/g;->e(Lcom/vungle/ads/internal/load/g;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p0

    if-eqz p0, :cond_7

    .line 92
    invoke-static {p3}, Lcom/vungle/ads/internal/load/g;->g(Lcom/vungle/ads/internal/load/g;)V

    goto :goto_1

    .line 93
    :cond_7
    invoke-virtual {p3}, Lcom/vungle/ads/internal/load/g;->a()V

    .line 94
    new-instance p0, Lcom/vungle/ads/AssetRequestError;

    const-string p1, "Failed to download required assets."

    invoke-direct {p0, p1}, Lcom/vungle/ads/AssetRequestError;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/vungle/ads/internal/load/g;->a(Lcom/vungle/ads/VungleError;)V

    return-void

    .line 95
    :cond_8
    :goto_1
    invoke-static {p3}, Lcom/vungle/ads/internal/load/g;->a(Lcom/vungle/ads/internal/load/g;)Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->decrementAndGet()J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-gtz p0, :cond_a

    .line 96
    invoke-static {p3}, Lcom/vungle/ads/internal/load/g;->c(Lcom/vungle/ads/internal/load/g;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p0

    if-eqz p0, :cond_9

    .line 97
    invoke-virtual {p3}, Lcom/vungle/ads/internal/load/g;->b()Lcom/vungle/ads/internal/load/b;

    move-result-object p0

    invoke-static {p3, p0}, Lcom/vungle/ads/internal/load/g;->a(Lcom/vungle/ads/internal/load/g;Lcom/vungle/ads/internal/load/b;)V

    return-void

    .line 98
    :cond_9
    new-instance p0, Lcom/vungle/ads/AssetRequestError;

    const-string p1, "Failed to download assets."

    invoke-direct {p0, p1}, Lcom/vungle/ads/AssetRequestError;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Lcom/vungle/ads/internal/load/g;->a(Lcom/vungle/ads/VungleError;)V

    :cond_a
    return-void
.end method


# virtual methods
.method public final a(Lcom/vungle/ads/internal/downloader/b;Lcom/vungle/ads/internal/downloader/k;)V
    .locals 7

    const-string v0, "downloadRequest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    sget-boolean v0, Lcom/vungle/ads/internal/util/u;->a:Z

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onError called: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BaseAdLoader"

    invoke-static {v1, v0}, Lcom/vungle/ads/internal/util/t;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    iget-object v0, p0, Lcom/vungle/ads/internal/load/c;->b:Lcom/vungle/ads/internal/load/g;

    invoke-virtual {v0}, Lcom/vungle/ads/internal/load/g;->g()Lcom/vungle/ads/internal/executor/a;

    move-result-object v0

    check-cast v0, Lcom/vungle/ads/internal/executor/d;

    invoke-virtual {v0}, Lcom/vungle/ads/internal/executor/d;->b()Lcom/vungle/ads/internal/executor/j;

    move-result-object v0

    iget-object v3, p0, Lcom/vungle/ads/internal/load/c;->b:Lcom/vungle/ads/internal/load/g;

    new-instance v1, LCb/a;

    const/4 v6, 0x0

    move-object v4, p0

    move-object v5, p1

    move-object v2, p2

    invoke-direct/range {v1 .. v6}, LCb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Lcom/vungle/ads/internal/executor/j;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Lcom/vungle/ads/internal/downloader/c;Lcom/vungle/ads/internal/downloader/k;)V
    .locals 5

    const-string v0, "progress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "downloadRequest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p2}, Lcom/vungle/ads/internal/downloader/k;->a()Lcom/vungle/ads/internal/model/b;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Lcom/vungle/ads/internal/model/b;->e()Ljava/lang/Integer;

    move-result-object v1

    .line 7
    sget-boolean v2, Lcom/vungle/ads/internal/util/u;->a:Z

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Download progress: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " url: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/vungle/ads/internal/model/b;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "BaseAdLoader"

    invoke-static {v3, v2}, Lcom/vungle/ads/internal/util/t;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    iget-boolean v2, p0, Lcom/vungle/ads/internal/load/c;->a:Z

    if-nez v2, :cond_1

    if-eqz v1, :cond_1

    .line 9
    invoke-virtual {p1}, Lcom/vungle/ads/internal/downloader/c;->a()I

    move-result p1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-lt p1, v2, :cond_1

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/vungle/ads/internal/load/c;->a:Z

    .line 11
    new-instance v2, Lzf/g;

    const/16 v4, 0x63

    .line 12
    invoke-direct {v2, p1, v4, p1}, Lzf/e;-><init>(III)V

    .line 13
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v2, p1}, Lzf/g;->a(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 14
    invoke-virtual {p2}, Lcom/vungle/ads/internal/downloader/k;->h()V

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Download progress: hit chunk percentage="

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " for url: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/vungle/ads/internal/model/b;->h()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 16
    invoke-static {v3, p1}, Lcom/vungle/ads/internal/util/t;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    invoke-virtual {v0}, Lcom/vungle/ads/internal/model/b;->n()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 18
    iget-object p1, p0, Lcom/vungle/ads/internal/load/c;->b:Lcom/vungle/ads/internal/load/g;

    invoke-virtual {p1}, Lcom/vungle/ads/internal/load/g;->g()Lcom/vungle/ads/internal/executor/a;

    move-result-object p1

    check-cast p1, Lcom/vungle/ads/internal/executor/d;

    invoke-virtual {p1}, Lcom/vungle/ads/internal/executor/d;->b()Lcom/vungle/ads/internal/executor/j;

    move-result-object p1

    iget-object p2, p0, Lcom/vungle/ads/internal/load/c;->b:Lcom/vungle/ads/internal/load/g;

    new-instance v1, LC8/d;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p2, v0}, LC8/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Lcom/vungle/ads/internal/executor/j;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public final a(Lcom/vungle/ads/internal/downloader/k;)V
    .locals 2

    const-string v0, "downloadRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-boolean v0, Lcom/vungle/ads/internal/util/u;->a:Z

    .line 2
    const-string v0, "onStart called: "

    invoke-static {v0}, Lcom/iab/omid/library/vungle/internal/l;->a(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Lcom/vungle/ads/internal/downloader/k;->a()Lcom/vungle/ads/internal/model/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/vungle/ads/internal/model/b;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BaseAdLoader"

    invoke-static {v1, v0}, Lcom/vungle/ads/internal/util/t;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p1}, Lcom/vungle/ads/internal/downloader/k;->f()V

    return-void
.end method

.method public final a(Ljava/io/File;Lcom/vungle/ads/internal/downloader/k;)V
    .locals 3

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "downloadRequest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    iget-object v0, p0, Lcom/vungle/ads/internal/load/c;->b:Lcom/vungle/ads/internal/load/g;

    invoke-virtual {v0}, Lcom/vungle/ads/internal/load/g;->g()Lcom/vungle/ads/internal/executor/a;

    move-result-object v0

    check-cast v0, Lcom/vungle/ads/internal/executor/d;

    invoke-virtual {v0}, Lcom/vungle/ads/internal/executor/d;->b()Lcom/vungle/ads/internal/executor/j;

    move-result-object v0

    iget-object v1, p0, Lcom/vungle/ads/internal/load/c;->b:Lcom/vungle/ads/internal/load/g;

    new-instance v2, LCb/a;

    invoke-direct {v2, p1, p0, p2, v1}, LCb/a;-><init>(Ljava/io/File;Lcom/vungle/ads/internal/load/c;Lcom/vungle/ads/internal/downloader/k;Lcom/vungle/ads/internal/load/g;)V

    invoke-virtual {v0, v2}, Lcom/vungle/ads/internal/executor/j;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
