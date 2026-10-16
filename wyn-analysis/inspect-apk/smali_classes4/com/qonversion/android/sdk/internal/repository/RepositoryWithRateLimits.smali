.class public final Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/repository/QRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ca\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006JA\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\r2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ-\u0010\"\u001a\u00020\r2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020!H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010\"\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020!H\u0016\u00a2\u0006\u0004\u0008\"\u0010$J\'\u0010(\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\'H\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u001f\u0010*\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\'H\u0016\u00a2\u0006\u0004\u0008*\u0010+J\u001f\u0010.\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020-H\u0016\u00a2\u0006\u0004\u0008.\u0010/J\u001f\u00100\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020-H\u0016\u00a2\u0006\u0004\u00080\u0010/J1\u00104\u001a\u00020\r2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0008\u00105\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u000206H\u0016\u00a2\u0006\u0004\u00084\u00107J5\u0010<\u001a\u00020\r2\u0006\u00102\u001a\u0002012\u000c\u00109\u001a\u0008\u0012\u0004\u0012\u0002080\u001d2\u0006\u0010\u001a\u001a\u0002062\u0006\u0010;\u001a\u00020:H\u0016\u00a2\u0006\u0004\u0008<\u0010=JQ\u0010B\u001a\u00020\r2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020?0>2\u0006\u0010A\u001a\u00020\u00172\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008B\u0010CJK\u0010F\u001a\u00020\r2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170>2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000bH\u0016\u00a2\u0006\u0004\u0008F\u0010GJ=\u0010I\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020H0\u001d\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000bH\u0016\u00a2\u0006\u0004\u0008I\u0010JJ-\u0010M\u001a\u00020\r2\u000c\u0010K\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u001d2\u0006\u00102\u001a\u0002012\u0006\u0010\u001a\u001a\u00020LH\u0016\u00a2\u0006\u0004\u0008M\u0010NJG\u0010Q\u001a\u00020\r2\u0006\u0010O\u001a\u00020\u00172\u0006\u0010P\u001a\u00020\u00172\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000bH\u0016\u00a2\u0006\u0004\u0008Q\u0010RJ?\u0010U\u001a\u00020\r2\u0006\u0010S\u001a\u00020\u00172\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000bH\u0016\u00a2\u0006\u0004\u0008U\u0010VJ\u0017\u0010W\u001a\u00020\r2\u0006\u0010S\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008W\u0010XJM\u0010[\u001a\u00020\r2\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170>2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010Z\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000bH\u0016\u00a2\u0006\u0004\u0008[\u0010GJ9\u0010^\u001a\u00020\r2\u0006\u0010]\u001a\u00020\\2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000bH\u0016\u00a2\u0006\u0004\u0008^\u0010_R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010`R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010a\u00a8\u0006b"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "repository",
        "Lcom/qonversion/android/sdk/internal/api/RateLimiter;",
        "rateLimiter",
        "<init>",
        "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/api/RateLimiter;)V",
        "Lcom/qonversion/android/sdk/internal/api/RequestType;",
        "requestType",
        "",
        "hash",
        "Lkotlin/Function1;",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "Lef/C;",
        "onError",
        "Lkotlin/Function0;",
        "onSuccess",
        "withRateLimitCheck",
        "(Lcom/qonversion/android/sdk/internal/api/RequestType;ILtf/l;Ltf/a;)V",
        "Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;",
        "requestData",
        "init",
        "(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V",
        "",
        "contextKey",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;",
        "callback",
        "remoteConfig",
        "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V",
        "",
        "contextKeys",
        "",
        "includeEmptyContextKey",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
        "remoteConfigList",
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
        "",
        "installDate",
        "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
        "purchase",
        "qProductId",
        "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
        "(JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V",
        "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
        "historyRecords",
        "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
        "requestTrigger",
        "restore",
        "(JLjava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V",
        "",
        "",
        "conversionInfo",
        "from",
        "attribution",
        "(Ljava/util/Map;Ljava/lang/String;Ltf/a;Ltf/l;)V",
        "properties",
        "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;",
        "sendProperties",
        "(Ljava/util/Map;Ltf/l;Ltf/l;)V",
        "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;",
        "getProperties",
        "(Ltf/l;Ltf/l;)V",
        "productIds",
        "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;",
        "eligibilityForProductIds",
        "(Ljava/util/List;JLcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V",
        "userID",
        "currentUserID",
        "identify",
        "(Ljava/lang/String;Ljava/lang/String;Ltf/l;Ltf/l;)V",
        "screenId",
        "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;",
        "screens",
        "(Ljava/lang/String;Ltf/l;Ltf/l;)V",
        "views",
        "(Ljava/lang/String;)V",
        "queryParams",
        "Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;",
        "actionPoints",
        "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;",
        "crashData",
        "crashReport",
        "(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Ltf/a;Ltf/l;)V",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "Lcom/qonversion/android/sdk/internal/api/RateLimiter;",
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
.field private final rateLimiter:Lcom/qonversion/android/sdk/internal/api/RateLimiter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/api/RateLimiter;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/repository/QRepository;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/api/RateLimiter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "repository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "rateLimiter"

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
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->rateLimiter:Lcom/qonversion/android/sdk/internal/api/RateLimiter;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic access$getRepository$p(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;)Lcom/qonversion/android/sdk/internal/repository/QRepository;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 2
    .line 3
    return-object p0
.end method

.method private final withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILtf/l;Ltf/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/api/RequestType;",
            "I",
            "Ltf/l;",
            "Ltf/a;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->rateLimiter:Lcom/qonversion/android/sdk/internal/api/RateLimiter;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/api/RateLimiter;->isRateLimitExceeded(Lcom/qonversion/android/sdk/internal/api/RequestType;I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 10
    .line 11
    sget-object v2, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ApiRateLimitExceeded:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 12
    .line 13
    const/4 v5, 0x6

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p3, v1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object p3, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->rateLimiter:Lcom/qonversion/android/sdk/internal/api/RateLimiter;

    .line 25
    .line 26
    invoke-virtual {p3, p1, p2}, Lcom/qonversion/android/sdk/internal/api/RateLimiter;->saveRequest(Lcom/qonversion/android/sdk/internal/api/RequestType;I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p4}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public actionPoints(Ljava/util/Map;Ltf/l;Ltf/l;)V
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "queryParams"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onSuccess"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onError"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 17
    .line 18
    invoke-interface {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->actionPoints(Ljava/util/Map;Ltf/l;Ltf/l;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
    .locals 4
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
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->AttachUserToExperiment:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    new-instance v2, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attachUserToExperiment$1;

    .line 27
    .line 28
    invoke-direct {v2, p3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attachUserToExperiment$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attachUserToExperiment$2;

    .line 32
    .line 33
    invoke-direct {v3, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attachUserToExperiment$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILtf/l;Ltf/a;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public attachUserToRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
    .locals 4
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
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->AttachUserToRemoteConfiguration:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    new-instance v2, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attachUserToRemoteConfiguration$1;

    .line 18
    .line 19
    invoke-direct {v2, p2}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attachUserToRemoteConfiguration$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attachUserToRemoteConfiguration$2;

    .line 23
    .line 24
    invoke-direct {v3, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attachUserToRemoteConfiguration$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILtf/l;Ltf/a;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public attribution(Ljava/util/Map;Ljava/lang/String;Ltf/a;Ltf/l;)V
    .locals 9
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ltf/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Ltf/a;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "conversionInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "from"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->Attribution:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    add-int/2addr v2, v1

    .line 22
    new-instance v1, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attribution$1;

    .line 23
    .line 24
    invoke-direct {v1, p4}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attribution$1;-><init>(Ltf/l;)V

    .line 25
    .line 26
    .line 27
    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attribution$2;

    .line 28
    .line 29
    move-object v4, p0

    .line 30
    move-object v5, p1

    .line 31
    move-object v6, p2

    .line 32
    move-object v7, p3

    .line 33
    move-object v8, p4

    .line 34
    invoke-direct/range {v3 .. v8}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attribution$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ljava/util/Map;Ljava/lang/String;Ltf/a;Ltf/l;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v0, v2, v1, v3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILtf/l;Ltf/a;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public crashReport(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Ltf/a;Ltf/l;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltf/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;",
            "Ltf/a;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "crashData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onSuccess"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onError"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 17
    .line 18
    invoke-interface {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->crashReport(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Ltf/a;Ltf/l;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public detachUserFromExperiment(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
    .locals 4
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
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->DetachUserFromExperiment:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    new-instance v2, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$detachUserFromExperiment$1;

    .line 18
    .line 19
    invoke-direct {v2, p2}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$detachUserFromExperiment$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$detachUserFromExperiment$2;

    .line 23
    .line 24
    invoke-direct {v3, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$detachUserFromExperiment$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILtf/l;Ltf/a;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public detachUserFromRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
    .locals 4
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
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->DetachUserFromRemoteConfiguration:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    new-instance v2, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$detachUserFromRemoteConfiguration$1;

    .line 18
    .line 19
    invoke-direct {v2, p2}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$detachUserFromRemoteConfiguration$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$detachUserFromRemoteConfiguration$2;

    .line 23
    .line 24
    invoke-direct {v3, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$detachUserFromRemoteConfiguration$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILtf/l;Ltf/a;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public eligibilityForProductIds(Ljava/util/List;JLcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V
    .locals 9
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;J",
            "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "productIds"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->EligibilityForProductIds:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/16 v2, 0x20

    .line 18
    .line 19
    ushr-long v2, p2, v2

    .line 20
    .line 21
    xor-long/2addr v2, p2

    .line 22
    long-to-int v2, v2

    .line 23
    add-int/2addr v1, v2

    .line 24
    new-instance v2, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$eligibilityForProductIds$1;

    .line 25
    .line 26
    invoke-direct {v2, p4}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$eligibilityForProductIds$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V

    .line 27
    .line 28
    .line 29
    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$eligibilityForProductIds$2;

    .line 30
    .line 31
    move-object v4, p0

    .line 32
    move-object v5, p1

    .line 33
    move-wide v6, p2

    .line 34
    move-object v8, p4

    .line 35
    invoke-direct/range {v3 .. v8}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$eligibilityForProductIds$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ljava/util/List;JLcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILtf/l;Ltf/a;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public getProperties(Ltf/l;Ltf/l;)V
    .locals 2
    .param p1    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "onSuccess"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onError"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->GetProperties:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 12
    .line 13
    new-instance v1, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$getProperties$1;

    .line 14
    .line 15
    invoke-direct {v1, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$getProperties$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ltf/l;Ltf/l;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-direct {p0, v0, p1, p2, v1}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILtf/l;Ltf/a;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public identify(Ljava/lang/String;Ljava/lang/String;Ltf/l;Ltf/l;)V
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "userID"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "currentUserID"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onSuccess"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "onError"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->Identify:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    new-instance v2, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$identify$1;

    .line 32
    .line 33
    move-object v3, p0

    .line 34
    move-object v4, p1

    .line 35
    move-object v5, p2

    .line 36
    move-object v6, p3

    .line 37
    move-object v7, p4

    .line 38
    invoke-direct/range {v2 .. v7}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$identify$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ljava/lang/String;Ljava/lang/String;Ltf/l;Ltf/l;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0, v0, v1, v7, v2}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILtf/l;Ltf/a;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public init(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V
    .locals 4
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "requestData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->Init:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    new-instance v2, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$init$1;

    .line 13
    .line 14
    invoke-direct {v2, p1}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$init$1;-><init>(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V

    .line 15
    .line 16
    .line 17
    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$init$2;

    .line 18
    .line 19
    invoke-direct {v3, p0, p1}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$init$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILtf/l;Ltf/a;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public purchase(JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V
    .locals 10
    .param p3    # Lcom/qonversion/android/sdk/internal/purchase/Purchase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "purchase"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->Purchase:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 12
    .line 13
    invoke-virtual {p3}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/2addr v2, v1

    .line 37
    new-instance v1, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$purchase$1;

    .line 38
    .line 39
    invoke-direct {v1, p5}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$purchase$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    .line 40
    .line 41
    .line 42
    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$purchase$2;

    .line 43
    .line 44
    move-object v4, p0

    .line 45
    move-wide v5, p1

    .line 46
    move-object v7, p3

    .line 47
    move-object v8, p4

    .line 48
    move-object v9, p5

    .line 49
    invoke-direct/range {v3 .. v9}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$purchase$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0, v0, v2, v1, v3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILtf/l;Ltf/a;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public remoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->RemoteConfig:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    new-instance v2, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfig$1;

    .line 17
    .line 18
    invoke-direct {v2, p2}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfig$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfig$2;

    .line 22
    .line 23
    invoke-direct {v3, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfig$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILtf/l;Ltf/a;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public remoteConfigList(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 3
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->RemoteConfigList:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 5
    new-instance v1, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$3;

    invoke-direct {v1, p1}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$3;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    new-instance v2, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$4;

    invoke-direct {v2, p0, p1}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$4;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    const/4 p1, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILtf/l;Ltf/a;)V

    return-void
.end method

.method public remoteConfigList(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 4
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

    .line 1
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->RemoteConfigList:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    .line 3
    new-instance v2, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$1;

    invoke-direct {v2, p3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$2;

    invoke-direct {v3, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILtf/l;Ltf/a;)V

    return-void
.end method

.method public restore(JLjava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 10
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/qonversion/android/sdk/internal/api/RequestTrigger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;",
            "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
            "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "historyRecords"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "requestTrigger"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->Restore:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 17
    .line 18
    const/16 v1, 0x20

    .line 19
    .line 20
    ushr-long v1, p1, v1

    .line 21
    .line 22
    xor-long/2addr v1, p1

    .line 23
    long-to-int v1, v1

    .line 24
    invoke-virtual {p3}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v1

    .line 29
    new-instance v1, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$restore$1;

    .line 30
    .line 31
    invoke-direct {v1, p4}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$restore$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    .line 32
    .line 33
    .line 34
    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$restore$2;

    .line 35
    .line 36
    move-object v4, p0

    .line 37
    move-wide v5, p1

    .line 38
    move-object v7, p3

    .line 39
    move-object v8, p4

    .line 40
    move-object v9, p5

    .line 41
    invoke-direct/range {v3 .. v9}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$restore$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;JLjava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {p0, v0, v2, v1, v3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILtf/l;Ltf/a;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public screens(Ljava/lang/String;Ltf/l;Ltf/l;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "screenId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onSuccess"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onError"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 17
    .line 18
    invoke-interface {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->screens(Ljava/lang/String;Ltf/l;Ltf/l;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public sendProperties(Ljava/util/Map;Ltf/l;Ltf/l;)V
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "properties"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onSuccess"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onError"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 17
    .line 18
    invoke-interface {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->sendProperties(Ljava/util/Map;Ltf/l;Ltf/l;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public views(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "screenId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->views(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
