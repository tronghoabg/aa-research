.class public final Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;,
        Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001:\u0002NOB\u0019\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\r2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J-\u0010\u0016\u001a\u00020\u00142\u0008\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u001e\u0010\u0019J!\u0010\u001f\u001a\u00020\u00142\u0008\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u001f\u0010 J+\u0010!\u001a\u00020\u00142\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008!\u0010\"J\u0015\u0010!\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008!\u0010#J%\u0010\'\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020&\u00a2\u0006\u0004\u0008\'\u0010(J\u001d\u0010)\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020&\u00a2\u0006\u0004\u0008)\u0010*J\u001d\u0010-\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020,\u00a2\u0006\u0004\u0008-\u0010.J\u001d\u0010/\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020,\u00a2\u0006\u0004\u0008/\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u00101R\u001d\u00107\u001a\u0004\u0018\u0001028BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00083\u00104\u001a\u0004\u00085\u00106R\"\u00109\u001a\u0002088\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u00089\u0010:\u001a\u0004\u0008;\u0010<\"\u0004\u0008=\u0010>R$\u0010A\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020@0?8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u001a\u0010E\u001a\u0008\u0012\u0004\u0012\u00020D0C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR\"\u0010H\u001a\u00020G8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008H\u0010I\u001a\u0004\u0008J\u0010K\"\u0004\u0008L\u0010M\u00a8\u0006P"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;",
        "",
        "Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;",
        "remoteConfigService",
        "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;",
        "fallbacksService",
        "<init>",
        "(Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;Lcom/qonversion/android/sdk/internal/services/QFallbacksService;)V",
        "",
        "",
        "contextKeys",
        "",
        "includeEmptyContextKey",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
        "callback",
        "getRemoteConfigListCallbackWrapper",
        "(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
        "contextKey",
        "Lkotlin/Function1;",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;",
        "Lef/C;",
        "action",
        "fireToCallbacks",
        "(Ljava/lang/String;Ltf/l;)V",
        "handlePendingRequests",
        "()V",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "error",
        "userChangingRequestFailedWithError",
        "(Lcom/qonversion/android/sdk/dto/QonversionError;)V",
        "onUserUpdate",
        "loadRemoteConfig",
        "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V",
        "loadRemoteConfigList",
        "(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V",
        "(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V",
        "experimentId",
        "groupId",
        "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;",
        "attachUserToExperiment",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V",
        "detachUserFromExperiment",
        "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V",
        "remoteConfigurationId",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;",
        "attachUserToRemoteConfiguration",
        "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V",
        "detachUserFromRemoteConfiguration",
        "Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;",
        "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;",
        "Lcom/qonversion/android/sdk/dto/QFallbackObject;",
        "fallbackData$delegate",
        "Lef/i;",
        "getFallbackData",
        "()Lcom/qonversion/android/sdk/dto/QFallbackObject;",
        "fallbackData",
        "Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;",
        "userStateProvider",
        "Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;",
        "getUserStateProvider",
        "()Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;",
        "setUserStateProvider",
        "(Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;)V",
        "",
        "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;",
        "loadingStates",
        "Ljava/util/Map;",
        "",
        "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;",
        "listRequests",
        "Ljava/util/List;",
        "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;",
        "userPropertiesManager",
        "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;",
        "getUserPropertiesManager",
        "()Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;",
        "setUserPropertiesManager",
        "(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V",
        "ListRequestData",
        "LoadingState",
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
.field private final fallbackData$delegate:Lef/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final fallbacksService:Lcom/qonversion/android/sdk/internal/services/QFallbacksService;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final listRequests:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private loadingStates:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final remoteConfigService:Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

.field public userStateProvider:Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;Lcom/qonversion/android/sdk/internal/services/QFallbacksService;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/services/QFallbacksService;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "remoteConfigService"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fallbacksService"

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
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->remoteConfigService:Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->fallbacksService:Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    .line 17
    .line 18
    new-instance p1, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$fallbackData$2;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$fallbackData$2;-><init>(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->fallbackData$delegate:Lef/i;

    .line 28
    .line 29
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    .line 35
    .line 36
    new-instance p1, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->listRequests:Ljava/util/List;

    .line 42
    .line 43
    return-void
.end method

.method public static final synthetic access$fireToCallbacks(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/lang/String;Ltf/l;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->fireToCallbacks(Ljava/lang/String;Ltf/l;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getFallbackData(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)Lcom/qonversion/android/sdk/dto/QFallbackObject;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->getFallbackData()Lcom/qonversion/android/sdk/dto/QFallbackObject;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getFallbacksService$p(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)Lcom/qonversion/android/sdk/internal/services/QFallbacksService;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->fallbacksService:Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getRemoteConfigListCallbackWrapper(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->getRemoteConfigListCallbackWrapper(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getRemoteConfigService$p(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->remoteConfigService:Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

    .line 2
    .line 3
    return-object p0
.end method

.method private final fireToCallbacks(Ljava/lang/String;Ltf/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->setInProgress(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->getCallbacks()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/Iterable;

    .line 20
    .line 21
    invoke-static {v0}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->getCallbacks()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 30
    .line 31
    .line 32
    check-cast v0, Ljava/lang/Iterable;

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;

    .line 49
    .line 50
    invoke-interface {p2, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    return-void
.end method

.method private final getFallbackData()Lcom/qonversion/android/sdk/dto/QFallbackObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->fallbackData$delegate:Lef/i;

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

.method private final getRemoteConfigListCallbackWrapper(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
            ")",
            "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;"
        }
    .end annotation

    .line 1
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    .line 2
    .line 3
    new-instance v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;

    .line 4
    .line 5
    move-object v3, p0

    .line 6
    move-object v4, p1

    .line 7
    move v5, p2

    .line 8
    move-object v1, p3

    .line 9
    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;Ljava/util/Map;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/util/List;Z)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method


# virtual methods
.method public final attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "experimentId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "groupId"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "callback"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    .line 17
    .line 18
    invoke-static {}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManagerKt;->access$getEmptyContextKey$p()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v1, 0x0

    .line 32
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->setLoadedConfig(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->remoteConfigService:Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

    .line 36
    .line 37
    invoke-virtual {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;->attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final attachUserToRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "remoteConfigurationId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    .line 12
    .line 13
    invoke-static {}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManagerKt;->access$getEmptyContextKey$p()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->setLoadedConfig(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->remoteConfigService:Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;->attachUserToRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final detachUserFromExperiment(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "experimentId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    .line 12
    .line 13
    invoke-static {}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManagerKt;->access$getEmptyContextKey$p()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->setLoadedConfig(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->remoteConfigService:Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;->detachUserFromExperiment(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final detachUserFromRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "remoteConfigurationId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    .line 12
    .line 13
    invoke-static {}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManagerKt;->access$getEmptyContextKey$p()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->setLoadedConfig(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->remoteConfigService:Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;->detachUserFromRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final getUserPropertiesManager()Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "userPropertiesManager"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final getUserStateProvider()Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->userStateProvider:Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "userStateProvider"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final handlePendingRequests()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    .line 2
    .line 3
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/util/Map$Entry;

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    .line 33
    .line 34
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->getCallbacks()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/util/Collection;

    .line 39
    .line 40
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-nez v3, :cond_0

    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/lang/Iterable;

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    const/4 v2, 0x0

    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {p0, v1, v2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadRemoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->listRequests:Ljava/util/List;

    .line 86
    .line 87
    check-cast v0, Ljava/lang/Iterable;

    .line 88
    .line 89
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_5

    .line 98
    .line 99
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;

    .line 104
    .line 105
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;->getContextKeys()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    if-eqz v3, :cond_4

    .line 110
    .line 111
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;->getIncludeEmptyContextKey()Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;->getCallback()Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-virtual {p0, v3, v4, v5}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadRemoteConfigList(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    .line 120
    .line 121
    .line 122
    sget-object v3, Lef/C;->a:Lef/C;

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_4
    move-object v3, v2

    .line 126
    :goto_3
    if-nez v3, :cond_3

    .line 127
    .line 128
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;->getCallback()Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {p0, v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadRemoteConfigList(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_5
    return-void
.end method

.method public final loadRemoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->getLoadedConfig()Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->getUserStateProvider()Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-interface {v2}, Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;->isUserStable()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v0, v1

    .line 30
    :goto_0
    if-eqz v0, :cond_1

    .line 31
    .line 32
    if-eqz p2, :cond_5

    .line 33
    .line 34
    invoke-interface {p2, v0}, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;->onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    .line 39
    .line 40
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    .line 45
    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    new-instance v2, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    .line 49
    .line 50
    const/4 v6, 0x7

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v3, 0x0

    .line 53
    const/4 v4, 0x0

    .line 54
    const/4 v5, 0x0

    .line 55
    invoke-direct/range {v2 .. v7}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;-><init>(Lcom/qonversion/android/sdk/dto/QRemoteConfig;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 56
    .line 57
    .line 58
    move-object v0, v2

    .line 59
    :cond_2
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    .line 60
    .line 61
    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    if-eqz p2, :cond_3

    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->getCallbacks()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-interface {v2, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    :cond_3
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->getUserStateProvider()Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-interface {p2}, Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;->isUserStable()Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-eqz p2, :cond_5

    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->isInProgress()Z

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    if-eqz p2, :cond_4

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    const/4 p2, 0x1

    .line 91
    invoke-virtual {v0, p2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->setInProgress(Z)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->setLoadedConfig(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->getUserPropertiesManager()Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    new-instance v1, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;

    .line 102
    .line 103
    invoke-direct {v1, p0, p1, v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;-><init>(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2, v1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->forceSendProperties(Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;)V

    .line 107
    .line 108
    .line 109
    :cond_5
    :goto_1
    return-void
.end method

.method public final loadRemoteConfigList(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 7
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->getUserStateProvider()Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;

    move-result-object v0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;->isUserStable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->listRequests:Ljava/util/List;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    move-object v2, p1

    .line 17
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->getUserPropertiesManager()Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    move-result-object p1

    new-instance v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$3;

    invoke-direct {v0, p0, v2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$3;-><init>(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->forceSendProperties(Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;)V

    return-void
.end method

.method public final loadRemoteConfigList(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 5
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
            ")V"
        }
    .end annotation

    const-string v0, "contextKeys"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 1
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-static {}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManagerKt;->access$getEmptyContextKey$p()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lff/o;->F0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    .line 2
    :goto_0
    check-cast v0, Ljava/lang/Iterable;

    .line 3
    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_3

    .line 4
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 5
    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->getLoadedConfig()Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, v2

    :goto_2
    if-eqz v3, :cond_3

    goto :goto_1

    .line 6
    :cond_3
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->getUserStateProvider()Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;

    move-result-object v0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;->isUserStable()Z

    move-result v0

    if-nez v0, :cond_4

    .line 7
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->listRequests:Ljava/util/List;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;

    invoke-direct {v1, p3, p1, p2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;Ljava/util/List;Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 8
    :cond_4
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->getUserPropertiesManager()Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    move-result-object v0

    new-instance v1, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$2;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$2;-><init>(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->forceSendProperties(Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;)V

    return-void

    .line 9
    :cond_5
    :goto_3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_6
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->getLoadedConfig()Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    move-result-object v0

    goto :goto_5

    :cond_7
    move-object v0, v2

    :goto_5
    if-eqz v0, :cond_6

    .line 13
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 14
    :cond_8
    new-instance p2, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;

    invoke-direct {p2, p1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;-><init>(Ljava/util/List;)V

    invoke-interface {p3, p2}, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;->onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)V

    return-void
.end method

.method public final onUserUpdate()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    .line 7
    .line 8
    return-void
.end method

.method public final setUserPropertiesManager(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;
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
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    .line 7
    .line 8
    return-void
.end method

.method public final setUserStateProvider(Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;
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
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->userStateProvider:Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;

    .line 7
    .line 8
    return-void
.end method

.method public final userChangingRequestFailedWithError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 3
    .param p1    # Lcom/qonversion/android/sdk/dto/QonversionError;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Iterable;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/String;

    .line 29
    .line 30
    new-instance v2, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$userChangingRequestFailedWithError$1$1;

    .line 31
    .line 32
    invoke-direct {v2, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$userChangingRequestFailedWithError$1$1;-><init>(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v1, v2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->fireToCallbacks(Ljava/lang/String;Ltf/l;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void
.end method
