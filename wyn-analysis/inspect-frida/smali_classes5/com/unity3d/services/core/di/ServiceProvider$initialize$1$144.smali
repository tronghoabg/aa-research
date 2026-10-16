.class final Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$144;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unity3d/services/core/di/ServiceProvider$initialize$1;->invoke(Lcom/unity3d/services/core/di/ServicesRegistry;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n;",
        "Ltf/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/unity3d/ads/core/domain/InitializeBoldSDK;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $this_registry:Lcom/unity3d/services/core/di/ServicesRegistry;


# direct methods
.method public constructor <init>(Lcom/unity3d/services/core/di/ServicesRegistry;)V
    .locals 0

    iput-object p1, p0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$144;->$this_registry:Lcom/unity3d/services/core/di/ServicesRegistry;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/unity3d/ads/core/domain/InitializeBoldSDK;
    .locals 23
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    .line 2
    new-instance v1, Lcom/unity3d/ads/core/domain/AndroidInitializeBoldSDK;

    .line 3
    iget-object v2, v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$144;->$this_registry:Lcom/unity3d/services/core/di/ServicesRegistry;

    .line 4
    new-instance v3, Lcom/unity3d/services/core/di/ServiceKey;

    .line 5
    sget-object v4, Lkotlin/jvm/internal/H;->a:Lkotlin/jvm/internal/I;

    const-class v5, LEf/A;

    invoke-virtual {v4, v5}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    .line 6
    const-string v6, "default_dispatcher"

    invoke-direct {v3, v6, v5}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;Lkotlin/reflect/KClass;)V

    .line 7
    invoke-virtual {v2, v3}, Lcom/unity3d/services/core/di/ServicesRegistry;->resolveService(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LEf/A;

    .line 8
    iget-object v3, v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$144;->$this_registry:Lcom/unity3d/services/core/di/ServicesRegistry;

    .line 9
    new-instance v5, Lcom/unity3d/services/core/di/ServiceKey;

    .line 10
    const-class v6, Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;

    invoke-virtual {v4, v6}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v6

    .line 11
    const-string v7, ""

    invoke-direct {v5, v7, v6}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;Lkotlin/reflect/KClass;)V

    .line 12
    invoke-virtual {v3, v5}, Lcom/unity3d/services/core/di/ServicesRegistry;->resolveService(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;

    .line 13
    iget-object v5, v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$144;->$this_registry:Lcom/unity3d/services/core/di/ServicesRegistry;

    .line 14
    new-instance v6, Lcom/unity3d/services/core/di/ServiceKey;

    .line 15
    const-class v8, Lcom/unity3d/ads/core/domain/GetInitializationRequest;

    invoke-virtual {v4, v8}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v8

    .line 16
    invoke-direct {v6, v7, v8}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;Lkotlin/reflect/KClass;)V

    .line 17
    invoke-virtual {v5, v6}, Lcom/unity3d/services/core/di/ServicesRegistry;->resolveService(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/unity3d/ads/core/domain/GetInitializationRequest;

    .line 18
    iget-object v6, v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$144;->$this_registry:Lcom/unity3d/services/core/di/ServicesRegistry;

    .line 19
    new-instance v8, Lcom/unity3d/services/core/di/ServiceKey;

    .line 20
    const-class v9, Lcom/unity3d/ads/core/domain/GetRequestPolicy;

    invoke-virtual {v4, v9}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v9

    .line 21
    const-string v10, "init_req"

    invoke-direct {v8, v10, v9}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;Lkotlin/reflect/KClass;)V

    .line 22
    invoke-virtual {v6, v8}, Lcom/unity3d/services/core/di/ServicesRegistry;->resolveService(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/unity3d/ads/core/domain/GetRequestPolicy;

    .line 23
    iget-object v8, v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$144;->$this_registry:Lcom/unity3d/services/core/di/ServicesRegistry;

    .line 24
    new-instance v9, Lcom/unity3d/services/core/di/ServiceKey;

    .line 25
    const-class v10, Lcom/unity3d/ads/core/domain/CleanAssets;

    invoke-virtual {v4, v10}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v10

    .line 26
    invoke-direct {v9, v7, v10}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;Lkotlin/reflect/KClass;)V

    .line 27
    invoke-virtual {v8, v9}, Lcom/unity3d/services/core/di/ServicesRegistry;->resolveService(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/unity3d/ads/core/domain/CleanAssets;

    .line 28
    iget-object v9, v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$144;->$this_registry:Lcom/unity3d/services/core/di/ServicesRegistry;

    .line 29
    new-instance v10, Lcom/unity3d/services/core/di/ServiceKey;

    .line 30
    const-class v11, Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;

    invoke-virtual {v4, v11}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v11

    .line 31
    invoke-direct {v10, v7, v11}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;Lkotlin/reflect/KClass;)V

    .line 32
    invoke-virtual {v9, v10}, Lcom/unity3d/services/core/di/ServicesRegistry;->resolveService(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;

    .line 33
    iget-object v10, v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$144;->$this_registry:Lcom/unity3d/services/core/di/ServicesRegistry;

    .line 34
    new-instance v11, Lcom/unity3d/services/core/di/ServiceKey;

    .line 35
    const-class v12, Lcom/unity3d/ads/gatewayclient/GatewayClient;

    invoke-virtual {v4, v12}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v12

    .line 36
    invoke-direct {v11, v7, v12}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;Lkotlin/reflect/KClass;)V

    .line 37
    invoke-virtual {v10, v11}, Lcom/unity3d/services/core/di/ServicesRegistry;->resolveService(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/unity3d/ads/gatewayclient/GatewayClient;

    .line 38
    iget-object v11, v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$144;->$this_registry:Lcom/unity3d/services/core/di/ServicesRegistry;

    .line 39
    new-instance v12, Lcom/unity3d/services/core/di/ServiceKey;

    .line 40
    const-class v13, Lcom/unity3d/ads/core/data/repository/SessionRepository;

    invoke-virtual {v4, v13}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v13

    .line 41
    invoke-direct {v12, v7, v13}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;Lkotlin/reflect/KClass;)V

    .line 42
    invoke-virtual {v11, v12}, Lcom/unity3d/services/core/di/ServicesRegistry;->resolveService(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/unity3d/ads/core/data/repository/SessionRepository;

    .line 43
    iget-object v12, v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$144;->$this_registry:Lcom/unity3d/services/core/di/ServicesRegistry;

    .line 44
    new-instance v13, Lcom/unity3d/services/core/di/ServiceKey;

    .line 45
    const-class v14, Lcom/unity3d/ads/core/domain/events/EventObservers;

    invoke-virtual {v4, v14}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v14

    .line 46
    invoke-direct {v13, v7, v14}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;Lkotlin/reflect/KClass;)V

    .line 47
    invoke-virtual {v12, v13}, Lcom/unity3d/services/core/di/ServicesRegistry;->resolveService(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/unity3d/ads/core/domain/events/EventObservers;

    .line 48
    iget-object v13, v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$144;->$this_registry:Lcom/unity3d/services/core/di/ServicesRegistry;

    .line 49
    new-instance v14, Lcom/unity3d/services/core/di/ServiceKey;

    .line 50
    const-class v15, Lcom/unity3d/ads/core/domain/TriggerInitializeListener;

    invoke-virtual {v4, v15}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v15

    .line 51
    invoke-direct {v14, v7, v15}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;Lkotlin/reflect/KClass;)V

    .line 52
    invoke-virtual {v13, v14}, Lcom/unity3d/services/core/di/ServicesRegistry;->resolveService(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/unity3d/ads/core/domain/TriggerInitializeListener;

    .line 53
    iget-object v14, v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$144;->$this_registry:Lcom/unity3d/services/core/di/ServicesRegistry;

    .line 54
    new-instance v15, Lcom/unity3d/services/core/di/ServiceKey;

    move-object/from16 v16, v1

    .line 55
    const-class v1, Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    .line 56
    invoke-direct {v15, v7, v1}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;Lkotlin/reflect/KClass;)V

    .line 57
    invoke-virtual {v14, v15}, Lcom/unity3d/services/core/di/ServicesRegistry;->resolveService(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;

    .line 58
    iget-object v14, v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$144;->$this_registry:Lcom/unity3d/services/core/di/ServicesRegistry;

    .line 59
    new-instance v15, Lcom/unity3d/services/core/di/ServiceKey;

    move-object/from16 v17, v1

    .line 60
    const-class v1, Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    .line 61
    invoke-direct {v15, v7, v1}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;Lkotlin/reflect/KClass;)V

    .line 62
    invoke-virtual {v14, v15}, Lcom/unity3d/services/core/di/ServicesRegistry;->resolveService(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;

    .line 63
    iget-object v14, v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$144;->$this_registry:Lcom/unity3d/services/core/di/ServicesRegistry;

    .line 64
    new-instance v15, Lcom/unity3d/services/core/di/ServiceKey;

    move-object/from16 v18, v1

    .line 65
    const-class v1, Lcom/unity3d/ads/core/data/manager/StorageManager;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    .line 66
    invoke-direct {v15, v7, v1}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;Lkotlin/reflect/KClass;)V

    .line 67
    invoke-virtual {v14, v15}, Lcom/unity3d/services/core/di/ServicesRegistry;->resolveService(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lcom/unity3d/ads/core/data/manager/StorageManager;

    .line 68
    iget-object v1, v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$144;->$this_registry:Lcom/unity3d/services/core/di/ServicesRegistry;

    .line 69
    new-instance v15, Lcom/unity3d/services/core/di/ServiceKey;

    move-object/from16 v19, v2

    .line 70
    const-class v2, Lcom/unity3d/services/core/configuration/ConfigurationReader;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    .line 71
    invoke-direct {v15, v7, v2}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;Lkotlin/reflect/KClass;)V

    .line 72
    invoke-virtual {v1, v15}, Lcom/unity3d/services/core/di/ServicesRegistry;->resolveService(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Lcom/unity3d/services/core/configuration/ConfigurationReader;

    .line 73
    iget-object v1, v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$144;->$this_registry:Lcom/unity3d/services/core/di/ServicesRegistry;

    .line 74
    new-instance v2, Lcom/unity3d/services/core/di/ServiceKey;

    move-object/from16 v20, v3

    .line 75
    const-class v3, Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;

    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v3

    .line 76
    invoke-direct {v2, v7, v3}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;Lkotlin/reflect/KClass;)V

    .line 77
    invoke-virtual {v1, v2}, Lcom/unity3d/services/core/di/ServicesRegistry;->resolveService(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;

    .line 78
    iget-object v2, v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$144;->$this_registry:Lcom/unity3d/services/core/di/ServicesRegistry;

    .line 79
    new-instance v3, Lcom/unity3d/services/core/di/ServiceKey;

    move-object/from16 v21, v1

    .line 80
    const-class v1, Lcom/unity3d/ads/core/domain/GetGameId;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    .line 81
    invoke-direct {v3, v7, v1}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;Lkotlin/reflect/KClass;)V

    .line 82
    invoke-virtual {v2, v3}, Lcom/unity3d/services/core/di/ServicesRegistry;->resolveService(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/unity3d/ads/core/domain/GetGameId;

    .line 83
    iget-object v2, v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$144;->$this_registry:Lcom/unity3d/services/core/di/ServicesRegistry;

    .line 84
    new-instance v3, Lcom/unity3d/services/core/di/ServiceKey;

    move-object/from16 v22, v1

    .line 85
    const-class v1, Lcom/unity3d/ads/core/log/Logger;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    .line 86
    invoke-direct {v3, v7, v1}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;Lkotlin/reflect/KClass;)V

    .line 87
    invoke-virtual {v2, v3}, Lcom/unity3d/services/core/di/ServicesRegistry;->resolveService(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/unity3d/ads/core/log/Logger;

    .line 88
    iget-object v2, v0, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$144;->$this_registry:Lcom/unity3d/services/core/di/ServicesRegistry;

    .line 89
    new-instance v3, Lcom/unity3d/services/core/di/ServiceKey;

    .line 90
    const-class v0, Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;

    invoke-virtual {v4, v0}, Lkotlin/jvm/internal/I;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    .line 91
    invoke-direct {v3, v7, v0}, Lcom/unity3d/services/core/di/ServiceKey;-><init>(Ljava/lang/String;Lkotlin/reflect/KClass;)V

    .line 92
    invoke-virtual {v2, v3}, Lcom/unity3d/services/core/di/ServicesRegistry;->resolveService(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;

    move-object v4, v5

    move-object v5, v6

    move-object v6, v8

    move-object v7, v9

    move-object v8, v10

    move-object v9, v11

    move-object v10, v12

    move-object v11, v13

    move-object/from16 v12, v17

    move-object/from16 v13, v18

    move-object/from16 v2, v19

    move-object/from16 v3, v20

    move-object/from16 v17, v22

    move-object/from16 v19, v0

    move-object/from16 v18, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v21

    .line 93
    invoke-direct/range {v1 .. v19}, Lcom/unity3d/ads/core/domain/AndroidInitializeBoldSDK;-><init>(LEf/A;Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;Lcom/unity3d/ads/core/domain/GetInitializationRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/domain/CleanAssets;Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/events/EventObservers;Lcom/unity3d/ads/core/domain/TriggerInitializeListener;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;Lcom/unity3d/ads/core/data/manager/StorageManager;Lcom/unity3d/services/core/configuration/ConfigurationReader;Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;Lcom/unity3d/ads/core/domain/GetGameId;Lcom/unity3d/ads/core/log/Logger;Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;)V

    move-object/from16 v16, v1

    return-object v16
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/unity3d/services/core/di/ServiceProvider$initialize$1$144;->invoke()Lcom/unity3d/ads/core/domain/InitializeBoldSDK;

    move-result-object v0

    return-object v0
.end method
