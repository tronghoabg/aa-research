.class public final Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u001b\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\"\u0010\u0013J\r\u0010#\u001a\u00020\u0015\u00a2\u0006\u0004\u0008#\u0010$J\r\u0010%\u001a\u00020\u0015\u00a2\u0006\u0004\u0008%\u0010$J\u001b\u0010\'\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020&\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\'\u0010\u0013J!\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100(\u0018\u00010\u000f\u00a2\u0006\u0004\u0008)\u0010\u0013J\u000f\u0010+\u001a\u0004\u0018\u00010*\u00a2\u0006\u0004\u0008+\u0010,J\u0015\u0010.\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u000c\u00a2\u0006\u0004\u0008.\u0010/J!\u00100\u001a\u00020\u00152\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f\u00a2\u0006\u0004\u00080\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u00102R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u00103R\u001a\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u000c048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u001d\u0010<\u001a\u0004\u0018\u0001078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;R&\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u00106R(\u0010?\u001a\u0004\u0018\u00010\u000c2\u0008\u0010>\u001a\u0004\u0018\u00010\u000c8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008?\u0010@\u001a\u0004\u0008A\u0010\u000eR$\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010B\u00a8\u0006C"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;",
        "",
        "Lhb/K;",
        "moshi",
        "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
        "cache",
        "Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;",
        "cacheConfigProvider",
        "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;",
        "fallbacksService",
        "<init>",
        "(Lhb/K;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;Lcom/qonversion/android/sdk/internal/services/QFallbacksService;)V",
        "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
        "getLaunchResult",
        "()Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
        "",
        "",
        "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
        "getPermissions",
        "()Ljava/util/Map;",
        "permissions",
        "Lef/C;",
        "savePermissions",
        "(Ljava/util/Map;)V",
        "",
        "isPermissionsCacheOutdated",
        "()Z",
        "timeKey",
        "",
        "lifetimeSec",
        "isCacheOutdated",
        "(Ljava/lang/String;J)Z",
        "getCurrentTimeInSec",
        "()J",
        "getActualPermissions",
        "resetSessionCache",
        "()V",
        "clearPermissionsCache",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "getActualProducts",
        "",
        "getProductPermissions",
        "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;",
        "getActualOfferings",
        "()Lcom/qonversion/android/sdk/dto/offerings/QOfferings;",
        "launchResult",
        "save",
        "(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V",
        "updatePermissions",
        "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
        "Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;",
        "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;",
        "Lhb/r;",
        "launchResultAdapter",
        "Lhb/r;",
        "Lcom/qonversion/android/sdk/dto/QFallbackObject;",
        "fallbackData$delegate",
        "Lef/i;",
        "getFallbackData",
        "()Lcom/qonversion/android/sdk/dto/QFallbackObject;",
        "fallbackData",
        "permissionsAdapter",
        "<set-?>",
        "sessionLaunchResult",
        "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
        "getSessionLaunchResult",
        "Ljava/util/Map;",
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


# instance fields
.field private final cache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final cacheConfigProvider:Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final fallbackData$delegate:Lef/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final fallbacksService:Lcom/qonversion/android/sdk/internal/services/QFallbacksService;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final launchResultAdapter:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private permissions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final permissionsAdapter:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private sessionLaunchResult:Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhb/K;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;Lcom/qonversion/android/sdk/internal/services/QFallbacksService;)V
    .locals 1
    .param p1    # Lhb/K;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/qonversion/android/sdk/internal/services/QFallbacksService;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "moshi"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cache"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "cacheConfigProvider"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "fallbacksService"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->cache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 25
    .line 26
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->cacheConfigProvider:Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;

    .line 27
    .line 28
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->fallbacksService:Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    .line 29
    .line 30
    const-class p2, Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Lhb/K;->a(Ljava/lang/Class;)Lhb/r;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->launchResultAdapter:Lhb/r;

    .line 37
    .line 38
    new-instance p2, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper$fallbackData$2;

    .line 39
    .line 40
    invoke-direct {p2, p0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper$fallbackData$2;-><init>(Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p2}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->fallbackData$delegate:Lef/i;

    .line 48
    .line 49
    const/4 p2, 0x2

    .line 50
    new-array p2, p2, [Ljava/lang/reflect/Type;

    .line 51
    .line 52
    const-class p3, Ljava/lang/String;

    .line 53
    .line 54
    const/4 p4, 0x0

    .line 55
    aput-object p3, p2, p4

    .line 56
    .line 57
    const-class p3, Lcom/qonversion/android/sdk/internal/dto/QPermission;

    .line 58
    .line 59
    const/4 p4, 0x1

    .line 60
    aput-object p3, p2, p4

    .line 61
    .line 62
    const-class p3, Ljava/util/Map;

    .line 63
    .line 64
    invoke-static {p3, p2}, Lhb/P;->f(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lib/d;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {p1, p2}, Lhb/K;->b(Ljava/lang/reflect/Type;)Lhb/r;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const-string p2, "adapter(...)"

    .line 73
    .line 74
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->permissionsAdapter:Lhb/r;

    .line 78
    .line 79
    return-void
.end method

.method public static final synthetic access$getFallbacksService$p(Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;)Lcom/qonversion/android/sdk/internal/services/QFallbacksService;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->fallbacksService:Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    .line 2
    .line 3
    return-object p0
.end method

.method private final getCurrentTimeInSec()J
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->milliSecondsToSeconds(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method private final getFallbackData()Lcom/qonversion/android/sdk/dto/QFallbackObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->fallbackData$delegate:Lef/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lef/i;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/qonversion/android/sdk/dto/QFallbackObject;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getLaunchResult()Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->sessionLaunchResult:Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->cache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 6
    .line 7
    const-string v1, "launchResult"

    .line 8
    .line 9
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->launchResultAdapter:Lhb/r;

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;->getObject(Ljava/lang/String;Lhb/r;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;

    .line 16
    .line 17
    :cond_0
    return-object v0
.end method

.method private final getPermissions()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->permissions:Ljava/util/Map;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->cache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 6
    .line 7
    const-string v1, "last_loaded_permissions"

    .line 8
    .line 9
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->permissionsAdapter:Lhb/r;

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;->getObject(Ljava/lang/String;Lhb/r;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/util/Map;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->permissions:Ljava/util/Map;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->permissions:Ljava/util/Map;

    .line 20
    .line 21
    return-object v0
.end method

.method private final isCacheOutdated(Ljava/lang/String;J)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->cache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-virtual {v0, p1, v1, v2}, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;->getLong(Ljava/lang/String;J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getCurrentTimeInSec()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    sub-long/2addr v2, v0

    .line 14
    cmp-long p1, v2, p2

    .line 15
    .line 16
    if-ltz p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1
.end method

.method private final isPermissionsCacheOutdated()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->cacheConfigProvider:Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;->getCacheConfig()Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;->getEntitlementsCacheLifetime()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;->getDays()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/UtilsKt;->getDaysToSeconds(I)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    const-string v2, "permissions_timestamp"

    .line 20
    .line 21
    invoke-direct {p0, v2, v0, v1}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->isCacheOutdated(Ljava/lang/String;J)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0
.end method

.method private final savePermissions(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->permissions:Ljava/util/Map;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->cache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 4
    .line 5
    const-string v1, "last_loaded_permissions"

    .line 6
    .line 7
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->permissionsAdapter:Lhb/r;

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1, v2}, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;->putObject(Ljava/lang/String;Ljava/lang/Object;Lhb/r;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getCurrentTimeInSec()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->cache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 17
    .line 18
    const-string v2, "permissions_timestamp"

    .line 19
    .line 20
    invoke-virtual {p1, v2, v0, v1}, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;->putLong(Ljava/lang/String;J)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final clearPermissionsCache()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->permissions:Ljava/util/Map;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->cache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 5
    .line 6
    const-string v1, "last_loaded_permissions"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;->remove(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final getActualOfferings()Lcom/qonversion/android/sdk/dto/offerings/QOfferings;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getLaunchResult()Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;->getOfferings()Lcom/qonversion/android/sdk/dto/offerings/QOfferings;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object v0

    .line 15
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getFallbackData()Lcom/qonversion/android/sdk/dto/QFallbackObject;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QFallbackObject;->getOfferings()Lcom/qonversion/android/sdk/dto/offerings/QOfferings;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :cond_2
    const/4 v0, 0x0

    .line 27
    return-object v0
.end method

.method public final getActualPermissions()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->permissions:Ljava/util/Map;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->isPermissionsCacheOutdated()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0

    .line 13
    :cond_0
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getPermissions()Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_1
    return-object v0
.end method

.method public final getActualProducts()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getLaunchResult()Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;->getProducts()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object v0

    .line 15
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getFallbackData()Lcom/qonversion/android/sdk/dto/QFallbackObject;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QFallbackObject;->getProducts()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :cond_2
    const/4 v0, 0x0

    .line 27
    return-object v0
.end method

.method public final getProductPermissions()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getLaunchResult()Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;->getProductPermissions$sdk_release()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object v0

    .line 15
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getFallbackData()Lcom/qonversion/android/sdk/dto/QFallbackObject;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QFallbackObject;->getProductPermissions()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :cond_2
    const/4 v0, 0x0

    .line 27
    return-object v0
.end method

.method public final getSessionLaunchResult()Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->sessionLaunchResult:Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;

    .line 2
    .line 3
    return-object v0
.end method

.method public final resetSessionCache()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->sessionLaunchResult:Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->permissions:Ljava/util/Map;

    .line 5
    .line 6
    return-void
.end method

.method public final save(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V
    .locals 4
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "launchResult"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->sessionLaunchResult:Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->cache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->launchResultAdapter:Lhb/r;

    .line 11
    .line 12
    invoke-virtual {v1, v0, p1, v2}, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;->putObject(Ljava/lang/String;Ljava/lang/Object;Lhb/r;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getCurrentTimeInSec()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->cache:Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 20
    .line 21
    const-string v3, "timestamp"

    .line 22
    .line 23
    invoke-virtual {v2, v3, v0, v1}, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;->putLong(Ljava/lang/String;J)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;->getPermissions$sdk_release()Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->permissions:Ljava/util/Map;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;->getPermissions$sdk_release()Ljava/util/Map;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->savePermissions(Ljava/util/Map;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final updatePermissions(Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "permissions"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->savePermissions(Ljava/util/Map;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
