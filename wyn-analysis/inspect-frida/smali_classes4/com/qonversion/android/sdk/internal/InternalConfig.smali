.class public final Lcom/qonversion/android/sdk/internal/InternalConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/provider/EnvironmentProvider;
.implements Lcom/qonversion/android/sdk/internal/provider/PrimaryConfigProvider;
.implements Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;
.implements Lcom/qonversion/android/sdk/internal/provider/UidProvider;
.implements Lcom/qonversion/android/sdk/internal/provider/EntitlementsUpdateListenerProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/InternalConfig$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0000\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00011B\u000f\u0008\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008B\u001f\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\u000cX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR*\u0010 \u001a\u0004\u0018\u00010\u001f2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R\u0011\u0010%\u001a\u00020&8F\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010\'R\u0014\u0010(\u001a\u00020&8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010\'R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R&\u0010-\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00118V@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008.\u0010\u0013\"\u0004\u0008/\u00100\u00a8\u00062"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "Lcom/qonversion/android/sdk/internal/provider/EnvironmentProvider;",
        "Lcom/qonversion/android/sdk/internal/provider/PrimaryConfigProvider;",
        "Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;",
        "Lcom/qonversion/android/sdk/internal/provider/UidProvider;",
        "Lcom/qonversion/android/sdk/internal/provider/EntitlementsUpdateListenerProvider;",
        "qonversionConfig",
        "Lcom/qonversion/android/sdk/QonversionConfig;",
        "(Lcom/qonversion/android/sdk/QonversionConfig;)V",
        "primaryConfig",
        "Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;",
        "cacheConfig",
        "Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;",
        "entitlementsUpdateListener",
        "Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;",
        "(Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V",
        "apiUrl",
        "",
        "getApiUrl",
        "()Ljava/lang/String;",
        "getCacheConfig",
        "()Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;",
        "getEntitlementsUpdateListener",
        "()Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;",
        "setEntitlementsUpdateListener",
        "(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V",
        "environment",
        "Lcom/qonversion/android/sdk/dto/QEnvironment;",
        "getEnvironment",
        "()Lcom/qonversion/android/sdk/dto/QEnvironment;",
        "<set-?>",
        "Lcom/qonversion/android/sdk/internal/HttpError;",
        "fatalError",
        "getFatalError",
        "()Lcom/qonversion/android/sdk/internal/HttpError;",
        "setFatalError",
        "(Lcom/qonversion/android/sdk/internal/HttpError;)V",
        "isAnalyticsMode",
        "",
        "()Z",
        "isSandbox",
        "getPrimaryConfig",
        "()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;",
        "setPrimaryConfig",
        "(Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;)V",
        "uid",
        "getUid",
        "setUid",
        "(Ljava/lang/String;)V",
        "Companion",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final BASE_URL:Ljava/lang/String; = "https://api.qonversion.io/"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Companion:Lcom/qonversion/android/sdk/internal/InternalConfig$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final cacheConfig:Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private entitlementsUpdateListener:Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private volatile fatalError:Lcom/qonversion/android/sdk/internal/HttpError;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private primaryConfig:Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile uid:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/internal/InternalConfig$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/InternalConfig$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/InternalConfig;->Companion:Lcom/qonversion/android/sdk/internal/InternalConfig$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/QonversionConfig;)V
    .locals 2
    .param p1    # Lcom/qonversion/android/sdk/QonversionConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "qonversionConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/QonversionConfig;->getPrimaryConfig$sdk_release()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    move-result-object v0

    .line 7
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/QonversionConfig;->getCacheConfig$sdk_release()Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;

    move-result-object v1

    .line 8
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/QonversionConfig;->getEntitlementsUpdateListener$sdk_release()Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

    move-result-object p1

    .line 9
    invoke-direct {p0, v0, v1, p1}, Lcom/qonversion/android/sdk/internal/InternalConfig;-><init>(Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "primaryConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cacheConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->primaryConfig:Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->cacheConfig:Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;

    .line 4
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->entitlementsUpdateListener:Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

    .line 5
    const-string p1, ""

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->uid:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getApiUrl()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getPrimaryConfig()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;->getProxyUrl()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "https://api.qonversion.io/"

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public getCacheConfig()Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->cacheConfig:Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEntitlementsUpdateListener()Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->entitlementsUpdateListener:Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEnvironment()Lcom/qonversion/android/sdk/dto/QEnvironment;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getPrimaryConfig()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;->getEnvironment()Lcom/qonversion/android/sdk/dto/QEnvironment;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final declared-synchronized getFatalError()Lcom/qonversion/android/sdk/internal/HttpError;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->fatalError:Lcom/qonversion/android/sdk/internal/HttpError;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public getPrimaryConfig()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->primaryConfig:Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public declared-synchronized getUid()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->uid:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public final isAnalyticsMode()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getPrimaryConfig()Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;->getLaunchMode()Lcom/qonversion/android/sdk/dto/QLaunchMode;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lcom/qonversion/android/sdk/dto/QLaunchMode;->Analytics:Lcom/qonversion/android/sdk/dto/QLaunchMode;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public isSandbox()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getEnvironment()Lcom/qonversion/android/sdk/dto/QEnvironment;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/qonversion/android/sdk/dto/QEnvironment;->Sandbox:Lcom/qonversion/android/sdk/dto/QEnvironment;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public setEntitlementsUpdateListener(Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;)V
    .locals 0
    .param p1    # Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->entitlementsUpdateListener:Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

    .line 2
    .line 3
    return-void
.end method

.method public final declared-synchronized setFatalError(Lcom/qonversion/android/sdk/internal/HttpError;)V
    .locals 0
    .param p1    # Lcom/qonversion/android/sdk/internal/HttpError;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->fatalError:Lcom/qonversion/android/sdk/internal/HttpError;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public setPrimaryConfig(Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->primaryConfig:Lcom/qonversion/android/sdk/internal/dto/config/PrimaryConfig;

    .line 7
    .line 8
    return-void
.end method

.method public declared-synchronized setUid(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "<set-?>"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/InternalConfig;->uid:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw p1
.end method
