.class public final Lcom/qonversion/android/sdk/internal/QonversionFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0003J\u0008\u0010\u000b\u001a\u00020\u000cH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000cH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000cH\u0002JN\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/QonversionFactory;",
        "",
        "context",
        "Landroid/app/Application;",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/logger/Logger;)V",
        "createBillingClient",
        "Lcom/android/billingclient/api/BillingClient;",
        "listener",
        "Lcom/android/billingclient/api/PurchasesUpdatedListener;",
        "createBillingClientHolder",
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;",
        "createBillingClientWrapper",
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;",
        "billingClientHolder",
        "createBillingService",
        "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;",
        "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;",
        "isAnalyticsMode",
        "",
        "createLegacyBillingClientWrapper",
        "Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;",
        "createProductCenterManager",
        "Lcom/qonversion/android/sdk/internal/QProductCenterManager;",
        "repository",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "purchasesCache",
        "Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;",
        "handledPurchasesCache",
        "Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;",
        "launchResultCacheWrapper",
        "Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;",
        "userInfoService",
        "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;",
        "identityManager",
        "Lcom/qonversion/android/sdk/internal/QIdentityManager;",
        "config",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "appStateProvider",
        "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
        "remoteConfigManager",
        "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;",
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
.field private final context:Landroid/app/Application;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final logger:Lcom/qonversion/android/sdk/internal/logger/Logger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/logger/Logger;)V
    .locals 1
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/logger/Logger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "logger"

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
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->context:Landroid/app/Application;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 17
    .line 18
    return-void
.end method

.method private final createBillingClient(Lcom/android/billingclient/api/PurchasesUpdatedListener;)Lcom/android/billingclient/api/BillingClient;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->context:Landroid/app/Application;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/android/billingclient/api/BillingClient;->newBuilder(Landroid/content/Context;)Lcom/android/billingclient/api/BillingClient$Builder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "newBuilder(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/android/billingclient/api/PendingPurchasesParams;->newBuilder()Lcom/android/billingclient/api/PendingPurchasesParams$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Lcom/android/billingclient/api/PendingPurchasesParams$Builder;->enableOneTimeProducts()Lcom/android/billingclient/api/PendingPurchasesParams$Builder;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Lcom/android/billingclient/api/PendingPurchasesParams$Builder;->enablePrepaidPlans()Lcom/android/billingclient/api/PendingPurchasesParams$Builder;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Lcom/android/billingclient/api/PendingPurchasesParams$Builder;->build()Lcom/android/billingclient/api/PendingPurchasesParams;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/BillingClient$Builder;->enablePendingPurchases(Lcom/android/billingclient/api/PendingPurchasesParams;)Lcom/android/billingclient/api/BillingClient$Builder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/BillingClient$Builder;->setListener(Lcom/android/billingclient/api/PurchasesUpdatedListener;)Lcom/android/billingclient/api/BillingClient$Builder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/android/billingclient/api/BillingClient$Builder;->build()Lcom/android/billingclient/api/BillingClient;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string v0, "build(...)"

    .line 39
    .line 40
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object p1
.end method

.method private final createBillingClientHolder()Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;
    .locals 3

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    .line 2
    .line 3
    new-instance v1, Landroid/os/Handler;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->context:Landroid/app/Application;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;-><init>(Landroid/os/Handler;Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/QonversionFactory;->createBillingClient(Lcom/android/billingclient/api/PurchasesUpdatedListener;)Lcom/android/billingclient/api/BillingClient;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->setBillingClient(Lcom/android/billingclient/api/BillingClient;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method private final createBillingClientWrapper(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;)Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;
    .locals 2

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;-><init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method private final createBillingService(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;Z)Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;
    .locals 8

    .line 1
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QonversionFactory;->createBillingClientHolder()Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    .line 2
    .line 3
    .line 4
    move-result-object v5

    .line 5
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    .line 6
    .line 7
    new-instance v1, Landroid/os/Handler;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->context:Landroid/app/Application;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 16
    .line 17
    .line 18
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 19
    .line 20
    invoke-direct {p0, v5}, Lcom/qonversion/android/sdk/internal/QonversionFactory;->createBillingClientWrapper(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;)Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    invoke-direct {p0, v5}, Lcom/qonversion/android/sdk/internal/QonversionFactory;->createLegacyBillingClientWrapper(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;)Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    move-object v2, p1

    .line 29
    move v4, p2

    .line 30
    invoke-direct/range {v0 .. v7}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;-><init>(Landroid/os/Handler;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;Lcom/qonversion/android/sdk/internal/logger/Logger;ZLcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method private final createLegacyBillingClientWrapper(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;)Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;
    .locals 2

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;-><init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method


# virtual methods
.method public final createProductCenterManager(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;Lcom/qonversion/android/sdk/internal/services/QUserInfoService;Lcom/qonversion/android/sdk/internal/QIdentityManager;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)Lcom/qonversion/android/sdk/internal/QProductCenterManager;
    .locals 13
    .param p1    # Lcom/qonversion/android/sdk/internal/repository/QRepository;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/qonversion/android/sdk/internal/services/QUserInfoService;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/qonversion/android/sdk/internal/QIdentityManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/qonversion/android/sdk/internal/InternalConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "repository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "purchasesCache"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "handledPurchasesCache"

    .line 12
    .line 13
    move-object/from16 v6, p3

    .line 14
    .line 15
    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "launchResultCacheWrapper"

    .line 19
    .line 20
    move-object/from16 v7, p4

    .line 21
    .line 22
    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v0, "userInfoService"

    .line 26
    .line 27
    move-object/from16 v8, p5

    .line 28
    .line 29
    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v0, "identityManager"

    .line 33
    .line 34
    move-object/from16 v9, p6

    .line 35
    .line 36
    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v0, "config"

    .line 40
    .line 41
    move-object/from16 v10, p7

    .line 42
    .line 43
    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v0, "appStateProvider"

    .line 47
    .line 48
    move-object/from16 v11, p8

    .line 49
    .line 50
    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v0, "remoteConfigManager"

    .line 54
    .line 55
    move-object/from16 v12, p9

    .line 56
    .line 57
    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    new-instance v1, Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 61
    .line 62
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->context:Landroid/app/Application;

    .line 63
    .line 64
    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/QonversionFactory;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 65
    .line 66
    move-object v3, p1

    .line 67
    move-object v5, p2

    .line 68
    invoke-direct/range {v1 .. v12}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;-><init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;Lcom/qonversion/android/sdk/internal/services/QUserInfoService;Lcom/qonversion/android/sdk/internal/QIdentityManager;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual/range {p7 .. p7}, Lcom/qonversion/android/sdk/internal/InternalConfig;->isAnalyticsMode()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    invoke-direct {p0, v1, p1}, Lcom/qonversion/android/sdk/internal/QonversionFactory;->createBillingService(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;Z)Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {v1, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->setBillingService(Lcom/qonversion/android/sdk/internal/billing/BillingService;)V

    .line 80
    .line 81
    .line 82
    return-object v1
.end method
