.class public final Lcom/unity3d/ads/core/data/datasource/AndroidAdQualityVersionDataSource;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/unity3d/ads/core/data/datasource/AndroidAdQualityVersionDataSource;",
        "Lcom/unity3d/ads/core/data/datasource/AdQualityVersionDataSource;",
        "logger",
        "Lcom/unity3d/ads/core/log/Logger;",
        "(Lcom/unity3d/ads/core/log/Logger;)V",
        "invoke",
        "",
        "unity-ads_defaultRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final logger:Lcom/unity3d/ads/core/log/Logger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/unity3d/ads/core/log/Logger;)V
    .locals 1
    .param p1    # Lcom/unity3d/ads/core/log/Logger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "logger"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/unity3d/ads/core/data/datasource/AndroidAdQualityVersionDataSource;->logger:Lcom/unity3d/ads/core/log/Logger;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/IronSourceAdQuality;->getSDKVersion()Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    invoke-static {v1}, LBf/k;->y0(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v2
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    return-object v0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception v1

    .line 19
    goto :goto_1

    .line 20
    :catch_1
    move-exception v1

    .line 21
    goto :goto_2

    .line 22
    :catch_2
    move-exception v1

    .line 23
    goto :goto_3

    .line 24
    :cond_1
    return-object v0

    .line 25
    :goto_0
    iget-object v2, p0, Lcom/unity3d/ads/core/data/datasource/AndroidAdQualityVersionDataSource;->logger:Lcom/unity3d/ads/core/log/Logger;

    .line 26
    .line 27
    const-string v3, "Failed to get Ad Quality version"

    .line 28
    .line 29
    invoke-interface {v2, v3, v1}, Lcom/unity3d/ads/core/log/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    goto :goto_4

    .line 33
    :goto_1
    iget-object v2, p0, Lcom/unity3d/ads/core/data/datasource/AndroidAdQualityVersionDataSource;->logger:Lcom/unity3d/ads/core/log/Logger;

    .line 34
    .line 35
    new-instance v3, Lcom/unity3d/ads/core/data/datasource/AndroidAdQualityVersionDataSource$invoke$4;

    .line 36
    .line 37
    invoke-direct {v3, v1}, Lcom/unity3d/ads/core/data/datasource/AndroidAdQualityVersionDataSource$invoke$4;-><init>(Ljava/lang/NoSuchMethodError;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v2, v3}, Lcom/unity3d/ads/core/log/Logger;->debug(Ltf/a;)V

    .line 41
    .line 42
    .line 43
    goto :goto_4

    .line 44
    :goto_2
    iget-object v2, p0, Lcom/unity3d/ads/core/data/datasource/AndroidAdQualityVersionDataSource;->logger:Lcom/unity3d/ads/core/log/Logger;

    .line 45
    .line 46
    new-instance v3, Lcom/unity3d/ads/core/data/datasource/AndroidAdQualityVersionDataSource$invoke$3;

    .line 47
    .line 48
    invoke-direct {v3, v1}, Lcom/unity3d/ads/core/data/datasource/AndroidAdQualityVersionDataSource$invoke$3;-><init>(Ljava/lang/ClassNotFoundException;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v2, v3}, Lcom/unity3d/ads/core/log/Logger;->debug(Ltf/a;)V

    .line 52
    .line 53
    .line 54
    goto :goto_4

    .line 55
    :goto_3
    iget-object v2, p0, Lcom/unity3d/ads/core/data/datasource/AndroidAdQualityVersionDataSource;->logger:Lcom/unity3d/ads/core/log/Logger;

    .line 56
    .line 57
    new-instance v3, Lcom/unity3d/ads/core/data/datasource/AndroidAdQualityVersionDataSource$invoke$2;

    .line 58
    .line 59
    invoke-direct {v3, v1}, Lcom/unity3d/ads/core/data/datasource/AndroidAdQualityVersionDataSource$invoke$2;-><init>(Ljava/lang/NoClassDefFoundError;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v2, v3}, Lcom/unity3d/ads/core/log/Logger;->debug(Ltf/a;)V

    .line 63
    .line 64
    .line 65
    :goto_4
    return-object v0
.end method
