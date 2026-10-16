.class public final Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/FacebookAttributionListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010!\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 G2\u00020\u0001:\u0001GB9\u0008\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0015\u0010\u0012J\u0019\u0010\u0018\u001a\u00020\u00102\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00102\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\u0012J\u001d\u0010\"\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u001d\u0010$\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0016\u00a2\u0006\u0004\u0008$\u0010%J\u0015\u0010\'\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020&\u00a2\u0006\u0004\u0008\'\u0010(J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)H\u0007\u00a2\u0006\u0004\u0008+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010.R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010/R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u00101R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u00102R$\u00104\u001a\u0004\u0018\u0001038\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u00084\u00105\u001a\u0004\u00086\u00107\"\u0004\u00088\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008@\u0010?R\u0016\u0010A\u001a\u00020)8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u0016\u0010C\u001a\u00020)8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008C\u0010BR\u001c\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u001a0D8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008E\u0010F\u00a8\u0006H"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;",
        "Lcom/qonversion/android/sdk/internal/FacebookAttributionListener;",
        "Landroid/app/Application;",
        "context",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "repository",
        "Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;",
        "propertiesStorage",
        "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;",
        "delayCalculator",
        "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
        "appStateProvider",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "logger",
        "<init>",
        "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/logger/Logger;)V",
        "Lef/C;",
        "fireCallbacks",
        "()V",
        "onAppBackground",
        "onAppForeground",
        "sendFacebookAttribution",
        "",
        "id",
        "onFbAttributionIdResult",
        "(Ljava/lang/String;)V",
        "Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;",
        "callback",
        "forceSendProperties",
        "(Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;)V",
        "retryPropertiesRequest",
        "Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;",
        "key",
        "value",
        "setUserProperty",
        "(Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;Ljava/lang/String;)V",
        "setCustomUserProperty",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;",
        "userProperties",
        "(Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;)V",
        "",
        "delaySec",
        "sendPropertiesWithDelay",
        "(I)V",
        "Landroid/app/Application;",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;",
        "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;",
        "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "Lcom/qonversion/android/sdk/internal/QProductCenterManager;",
        "productCenterManager",
        "Lcom/qonversion/android/sdk/internal/QProductCenterManager;",
        "getProductCenterManager$sdk_release",
        "()Lcom/qonversion/android/sdk/internal/QProductCenterManager;",
        "setProductCenterManager$sdk_release",
        "(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V",
        "Landroid/os/Handler;",
        "handler",
        "Landroid/os/Handler;",
        "",
        "isRequestInProgress",
        "Z",
        "isSendingScheduled",
        "retryDelay",
        "I",
        "retriesCounter",
        "",
        "completions",
        "Ljava/util/List;",
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
.field public static final Companion:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final LOOPER_THREAD_NAME:Ljava/lang/String; = "userPropertiesThread"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final PROPERTY_UPLOAD_MIN_DELAY:I = 0x5


# instance fields
.field private final appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private completions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final context:Landroid/app/Application;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final delayCalculator:Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private handler:Landroid/os/Handler;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private isRequestInProgress:Z

.field private isSendingScheduled:Z

.field private final logger:Lcom/qonversion/android/sdk/internal/logger/Logger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private propertiesStorage:Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private retriesCounter:I

.field private retryDelay:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->Companion:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/logger/Logger;)V
    .locals 1
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/repository/QRepository;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/qonversion/android/sdk/internal/logger/Logger;
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
    const-string v0, "repository"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "propertiesStorage"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "delayCalculator"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "appStateProvider"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "logger"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->context:Landroid/app/Application;

    .line 35
    .line 36
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 37
    .line 38
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->propertiesStorage:Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;

    .line 39
    .line 40
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->delayCalculator:Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;

    .line 41
    .line 42
    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

    .line 43
    .line 44
    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 45
    .line 46
    const/4 p1, 0x5

    .line 47
    iput p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->retryDelay:I

    .line 48
    .line 49
    new-instance p1, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->completions:Ljava/util/List;

    .line 55
    .line 56
    new-instance p1, Landroid/os/HandlerThread;

    .line 57
    .line 58
    const-string p2, "userPropertiesThread"

    .line 59
    .line 60
    invoke-direct {p1, p2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 64
    .line 65
    .line 66
    new-instance p2, Landroid/os/Handler;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-direct {p2, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 73
    .line 74
    .line 75
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->handler:Landroid/os/Handler;

    .line 76
    .line 77
    return-void
.end method

.method public static synthetic a(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->sendPropertiesWithDelay$lambda$1(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V

    return-void
.end method

.method public static final synthetic access$fireCallbacks(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->fireCallbacks()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getLogger$p(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)Lcom/qonversion/android/sdk/internal/logger/Logger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getPropertiesStorage$p(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->propertiesStorage:Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$setRequestInProgress$p(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->isRequestInProgress:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setRetriesCounter$p(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->retriesCounter:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setRetryDelay$p(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->retryDelay:I

    .line 2
    .line 3
    return-void
.end method

.method private final fireCallbacks()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->completions:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Iterable;

    .line 4
    .line 5
    invoke-static {v0}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->completions:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 12
    .line 13
    .line 14
    check-cast v0, Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;

    .line 31
    .line 32
    invoke-interface {v1}, Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;->onComplete()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-void
.end method

.method public static synthetic forceSendProperties$default(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->forceSendProperties(Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final sendPropertiesWithDelay$lambda$1(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-static {p0, v0, v1, v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->forceSendProperties$default(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final forceSendProperties(Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;)V
    .locals 3
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->isRequestInProgress:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->completions:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->propertiesStorage:Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;

    .line 14
    .line 15
    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;->getProperties()Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->completions:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    :cond_1
    const/4 p1, 0x1

    .line 33
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->isRequestInProgress:Z

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->isSendingScheduled:Z

    .line 37
    .line 38
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 39
    .line 40
    new-instance v1, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;

    .line 41
    .line 42
    invoke-direct {v1, p0, v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;-><init>(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;Ljava/util/Map;)V

    .line 43
    .line 44
    .line 45
    new-instance v2, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$2;

    .line 46
    .line 47
    invoke-direct {v2, p0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$2;-><init>(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p1, v0, v1, v2}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->sendProperties(Ljava/util/Map;Ltf/l;Ltf/l;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    if-eqz p1, :cond_3

    .line 55
    .line 56
    invoke-interface {p1}, Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;->onComplete()V

    .line 57
    .line 58
    .line 59
    :cond_3
    return-void
.end method

.method public final getProductCenterManager$sdk_release()Lcom/qonversion/android/sdk/internal/QProductCenterManager;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public final onAppBackground()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, v0, v1, v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->forceSendProperties$default(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onAppForeground()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->propertiesStorage:Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;->getProperties()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->retryDelay:I

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->sendPropertiesWithDelay(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public onFbAttributionIdResult(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    sget-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->FacebookAttribution:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->getUserPropertyCode()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0, v0, p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->setCustomUserProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final retryPropertiesRequest()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->retriesCounter:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->retriesCounter:I

    .line 6
    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->delayCalculator:Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;

    .line 8
    .line 9
    const/4 v2, 0x5

    .line 10
    invoke-virtual {v1, v2, v0}, Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;->countDelay(II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->retryDelay:I

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->sendPropertiesWithDelay(I)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catch_0
    move-exception v0

    .line 21
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 22
    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v3, "The error occurred during properties sending. "

    .line 26
    .line 27
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v1, v0}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final sendFacebookAttribution()V
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Lcom/qonversion/android/sdk/internal/FacebookAttribution;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/FacebookAttribution;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->context:Landroid/app/Application;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "getContentResolver(...)"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1, p0}, Lcom/qonversion/android/sdk/internal/FacebookAttribution;->getAttributionId(Landroid/content/ContentResolver;Lcom/qonversion/android/sdk/internal/FacebookAttributionListener;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception v0

    .line 22
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v3, "Failed to retrieve facebook attribution "

    .line 31
    .line 32
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v1, v0}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final sendPropertiesWithDelay(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;->getAppState()Lcom/qonversion/android/sdk/internal/AppState;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/AppState;->isBackground()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    int-to-long v0, p1

    .line 15
    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->secondsToMilliSeconds(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    const/4 p1, 0x1

    .line 20
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->isSendingScheduled:Z

    .line 21
    .line 22
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->handler:Landroid/os/Handler;

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    new-instance v2, Lcom/applovin/adview/a;

    .line 27
    .line 28
    const/16 v3, 0xc

    .line 29
    .line 30
    invoke-direct {v2, p0, v3}, Lcom/applovin/adview/a;-><init>(Ljava/lang/Object;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void
.end method

.method public final setCustomUserProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->propertiesStorage:Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;

    .line 19
    .line 20
    invoke-interface {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;->save(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-boolean p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->isSendingScheduled:Z

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->retryDelay:I

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->sendPropertiesWithDelay(I)V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public final setProductCenterManager$sdk_release(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V
    .locals 0
    .param p1    # Lcom/qonversion/android/sdk/internal/QProductCenterManager;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 2
    .line 3
    return-void
.end method

.method public final setUserProperty(Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->Custom:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 16
    .line 17
    const-string p2, "Can not set user property with the key `QUserPropertyKey.Custom`. To set custom user property, use the `setCustomUserProperty` method."

    .line 18
    .line 19
    invoke-interface {p1, p2}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->getUserPropertyCode()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->setCustomUserProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final userProperties(Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;)V
    .locals 3
    .param p1    # Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 7
    .line 8
    new-instance v1, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$userProperties$1;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$userProperties$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$userProperties$2;

    .line 14
    .line 15
    invoke-direct {v2, p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$userProperties$2;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->getProperties(Ltf/l;Ltf/l;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
