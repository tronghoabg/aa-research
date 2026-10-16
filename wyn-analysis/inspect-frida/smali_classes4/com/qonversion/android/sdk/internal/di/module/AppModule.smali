.class public final Lcom/qonversion/android/sdk/internal/di/module/AppModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0011H\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0007\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\'\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0007\u00a2\u0006\u0004\u0008$\u0010%J\'\u0010\'\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0018H\u0007\u00a2\u0006\u0004\u0008\'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010+\u00a8\u0006,"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/di/module/AppModule;",
        "",
        "Landroid/app/Application;",
        "application",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "internalConfig",
        "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
        "appStateProvider",
        "<init>",
        "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;)V",
        "provideApplication",
        "()Landroid/app/Application;",
        "provideConfig",
        "()Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "provideAppStateProvider",
        "()Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
        "context",
        "Landroid/content/SharedPreferences;",
        "provideSharedPreferences",
        "(Landroid/app/Application;)Landroid/content/SharedPreferences;",
        "sharedPreferences",
        "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
        "provideSharedPreferencesCache",
        "(Landroid/content/SharedPreferences;)Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "provideLogger",
        "()Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;",
        "providePurchasesCache",
        "(Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;)Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;",
        "Lhb/K;",
        "moshi",
        "sharedPreferencesCache",
        "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;",
        "fallbacksService",
        "Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;",
        "provideLaunchResultCacheWrapper",
        "(Lhb/K;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/services/QFallbacksService;)Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;",
        "logger",
        "provideFallbackService",
        "(Landroid/app/Application;Lhb/K;Lcom/qonversion/android/sdk/internal/logger/Logger;)Lcom/qonversion/android/sdk/internal/services/QFallbacksService;",
        "Landroid/app/Application;",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
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
.field private final appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final application:Landroid/app/Application;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;)V
    .locals 1
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/InternalConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "application"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "internalConfig"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "appStateProvider"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule;->application:Landroid/app/Application;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule;->appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final provideAppStateProvider()Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule;->appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

    .line 2
    .line 3
    return-object v0
.end method

.method public final provideApplication()Landroid/app/Application;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule;->application:Landroid/app/Application;

    .line 2
    .line 3
    return-object v0
.end method

.method public final provideConfig()Lcom/qonversion/android/sdk/internal/InternalConfig;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public final provideFallbackService(Landroid/app/Application;Lhb/K;Lcom/qonversion/android/sdk/internal/logger/Logger;)Lcom/qonversion/android/sdk/internal/services/QFallbacksService;
    .locals 2
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lhb/K;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/logger/Logger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "moshi"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "logger"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 19
    .line 20
    invoke-direct {v0, p1, v1, p2, p3}, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;-><init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;Lhb/K;Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public final provideLaunchResultCacheWrapper(Lhb/K;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/services/QFallbacksService;)Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;
    .locals 2
    .param p1    # Lhb/K;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/services/QFallbacksService;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "moshi"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sharedPreferencesCache"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "fallbacksService"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule;->internalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 19
    .line 20
    invoke-direct {v0, p1, p2, v1, p3}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;-><init>(Lhb/K;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;Lcom/qonversion/android/sdk/internal/services/QFallbacksService;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public final provideLogger()Lcom/qonversion/android/sdk/internal/logger/Logger;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final providePurchasesCache(Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;)Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "sharedPreferences"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;-><init>(Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final provideSharedPreferences(Landroid/app/Application;)Landroid/content/SharedPreferences;
    .locals 2
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, "_preferences"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v0, "getDefaultSharedPreferences(...)"

    .line 33
    .line 34
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object p1
.end method

.method public final provideSharedPreferencesCache(Landroid/content/SharedPreferences;)Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;
    .locals 1
    .param p1    # Landroid/content/SharedPreferences;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "sharedPreferences"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;-><init>(Landroid/content/SharedPreferences;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
