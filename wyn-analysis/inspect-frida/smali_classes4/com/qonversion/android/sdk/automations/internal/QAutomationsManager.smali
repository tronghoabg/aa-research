.class public final Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 =2\u00020\u0001:\u0001=B)\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c0\u0013H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c0\u0013\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J1\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c0\u0013\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000c2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!\u00a2\u0006\u0004\u0008#\u0010$J\u0015\u0010%\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!\u00a2\u0006\u0004\u0008%\u0010$J\u0015\u0010&\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!\u00a2\u0006\u0004\u0008&\u0010$J\u0015\u0010\'\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\'\u0010\u0010J\r\u0010(\u001a\u00020\u000e\u00a2\u0006\u0004\u0008(\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010+R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010,R:\u00100\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8F@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103\"\u0004\u00084\u00105R:\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010-2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010-8F@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00087\u00101\u001a\u0004\u00088\u00103\"\u0004\u00089\u00105R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010<\u00a8\u0006>"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;",
        "",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "repository",
        "Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;",
        "eventMapper",
        "Landroid/app/Application;",
        "appContext",
        "Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;",
        "activityProvider",
        "<init>",
        "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;Landroid/app/Application;Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;)V",
        "",
        "functionName",
        "Lef/C;",
        "logDelegateErrorForFunctionName",
        "(Ljava/lang/String;)V",
        "loadScreenIfPossible",
        "()V",
        "",
        "getQueryParams",
        "()Ljava/util/Map;",
        "messageData",
        "",
        "handlePushIfPossible",
        "(Ljava/util/Map;)Z",
        "getNotificationCustomPayload",
        "(Ljava/util/Map;)Ljava/util/Map;",
        "screenId",
        "Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;",
        "callback",
        "loadScreen",
        "(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;)V",
        "Lcom/qonversion/android/sdk/automations/dto/QActionResult;",
        "actionResult",
        "automationsDidStartExecuting",
        "(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V",
        "automationsDidFailExecuting",
        "automationsDidFinishExecuting",
        "automationsDidShowScreen",
        "automationsFinished",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;",
        "Landroid/app/Application;",
        "Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;",
        "Ljava/lang/ref/WeakReference;",
        "Lcom/qonversion/android/sdk/automations/AutomationsDelegate;",
        "<set-?>",
        "automationsDelegate",
        "Ljava/lang/ref/WeakReference;",
        "getAutomationsDelegate",
        "()Ljava/lang/ref/WeakReference;",
        "setAutomationsDelegate",
        "(Ljava/lang/ref/WeakReference;)V",
        "Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;",
        "screenCustomizationDelegate",
        "getScreenCustomizationDelegate",
        "setScreenCustomizationDelegate",
        "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;",
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
.field public static final Companion:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final KEY_CUSTOM_PAYLOAD:Ljava/lang/String; = "qonv.custom_payload"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final PICK_SCREEN:Ljava/lang/String; = "qonv.pick_screen"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final QUERY_PARAM_ACTIVE:Ljava/lang/String; = "active"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final QUERY_PARAM_ACTIVE_VALUE:I = 0x1

.field private static final QUERY_PARAM_TYPE:Ljava/lang/String; = "type"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final QUERY_PARAM_TYPE_VALUE:Ljava/lang/String; = "screen_view"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final activityProvider:Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final appContext:Landroid/app/Application;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile automationsDelegate:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/qonversion/android/sdk/automations/AutomationsDelegate;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final eventMapper:Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile screenCustomizationDelegate:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->Companion:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;Landroid/app/Application;Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/repository/QRepository;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;
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
    const-string v0, "eventMapper"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "appContext"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "activityProvider"

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
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->eventMapper:Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->appContext:Landroid/app/Application;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->activityProvider:Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;

    .line 31
    .line 32
    new-instance p1, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 33
    .line 34
    invoke-direct {p1}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 38
    .line 39
    return-void
.end method

.method public static final synthetic access$getActivityProvider$p(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->activityProvider:Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getAppContext$p(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)Landroid/app/Application;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->appContext:Landroid/app/Application;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 2
    .line 3
    return-object p0
.end method

.method private final getQueryParams()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lef/k;

    .line 2
    .line 3
    const-string v1, "type"

    .line 4
    .line 5
    const-string v2, "screen_view"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lef/k;

    .line 11
    .line 12
    const-string v2, "active"

    .line 13
    .line 14
    const-string v3, "1"

    .line 15
    .line 16
    invoke-direct {v1, v2, v3}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    new-array v2, v2, [Lef/k;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    aput-object v0, v2, v3

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    aput-object v1, v2, v0

    .line 27
    .line 28
    invoke-static {v2}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
.end method

.method public static synthetic loadScreen$default(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->loadScreen(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final loadScreenIfPossible()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->getQueryParams()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreenIfPossible$1;

    .line 8
    .line 9
    invoke-direct {v2, p0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreenIfPossible$1;-><init>(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreenIfPossible$2;

    .line 13
    .line 14
    invoke-direct {v3, p0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreenIfPossible$2;-><init>(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->actionPoints(Ljava/util/Map;Ltf/l;Ltf/l;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private final logDelegateErrorForFunctionName(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "AutomationsDelegate."

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p1, "() function can not be executed. It looks like Automations.setDelegate() was not called or delegate has been destroyed by GC"

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->error(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final automationsDidFailExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .locals 2
    .param p1    # Lcom/qonversion/android/sdk/automations/dto/QActionResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "actionResult"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDelegate:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;->automationsDidFailExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Lef/C;->a:Lef/C;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object p1, v1

    .line 26
    :goto_0
    if-nez p1, :cond_2

    .line 27
    .line 28
    new-instance p1, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsDidFailExecuting$1;

    .line 29
    .line 30
    invoke-direct {p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsDidFailExecuting$1;-><init>()V

    .line 31
    .line 32
    .line 33
    const-class p1, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsDidFailExecuting$1;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :cond_1
    invoke-direct {p0, v1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->logDelegateErrorForFunctionName(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void
.end method

.method public final automationsDidFinishExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .locals 2
    .param p1    # Lcom/qonversion/android/sdk/automations/dto/QActionResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "actionResult"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDelegate:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;->automationsDidFinishExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Lef/C;->a:Lef/C;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object p1, v1

    .line 26
    :goto_0
    if-nez p1, :cond_2

    .line 27
    .line 28
    new-instance p1, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsDidFinishExecuting$1;

    .line 29
    .line 30
    invoke-direct {p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsDidFinishExecuting$1;-><init>()V

    .line 31
    .line 32
    .line 33
    const-class p1, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsDidFinishExecuting$1;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :cond_1
    invoke-direct {p0, v1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->logDelegateErrorForFunctionName(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void
.end method

.method public final automationsDidShowScreen(Ljava/lang/String;)V
    .locals 2
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
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDelegate:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;->automationsDidShowScreen(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Lef/C;->a:Lef/C;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object p1, v1

    .line 26
    :goto_0
    if-nez p1, :cond_2

    .line 27
    .line 28
    new-instance p1, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsDidShowScreen$1;

    .line 29
    .line 30
    invoke-direct {p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsDidShowScreen$1;-><init>()V

    .line 31
    .line 32
    .line 33
    const-class p1, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsDidShowScreen$1;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :cond_1
    invoke-direct {p0, v1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->logDelegateErrorForFunctionName(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void
.end method

.method public final automationsDidStartExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .locals 2
    .param p1    # Lcom/qonversion/android/sdk/automations/dto/QActionResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "actionResult"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDelegate:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;->automationsDidStartExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Lef/C;->a:Lef/C;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object p1, v1

    .line 26
    :goto_0
    if-nez p1, :cond_2

    .line 27
    .line 28
    new-instance p1, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsDidStartExecuting$1;

    .line 29
    .line 30
    invoke-direct {p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsDidStartExecuting$1;-><init>()V

    .line 31
    .line 32
    .line 33
    const-class p1, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsDidStartExecuting$1;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :cond_1
    invoke-direct {p0, v1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->logDelegateErrorForFunctionName(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void
.end method

.method public final automationsFinished()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDelegate:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;->automationsFinished()V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lef/C;->a:Lef/C;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v1

    .line 21
    :goto_0
    if-nez v0, :cond_2

    .line 22
    .line 23
    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsFinished$1;

    .line 24
    .line 25
    invoke-direct {v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsFinished$1;-><init>()V

    .line 26
    .line 27
    .line 28
    const-class v0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsFinished$1;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :cond_1
    invoke-direct {p0, v1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->logDelegateErrorForFunctionName(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method public final declared-synchronized getAutomationsDelegate()Ljava/lang/ref/WeakReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/qonversion/android/sdk/automations/AutomationsDelegate;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDelegate:Ljava/lang/ref/WeakReference;
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

.method public final getNotificationCustomPayload(Ljava/util/Map;)Ljava/util/Map;
    .locals 2
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "messageData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "qonv.custom_payload"

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/lang/String;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 18
    .line 19
    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->toMap(Lorg/json/JSONObject;)Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    :catch_0
    :cond_0
    return-object v0
.end method

.method public final declared-synchronized getScreenCustomizationDelegate()Ljava/lang/ref/WeakReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->screenCustomizationDelegate:Ljava/lang/ref/WeakReference;
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

.method public final handlePushIfPossible(Ljava/util/Map;)Z
    .locals 4
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "messageData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "qonv.pick_screen"

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->toBoolean(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 21
    .line 22
    const-string v2, "handlePushIfPossible() -> Qonversion push notification was received"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->release(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->eventMapper:Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;->getEventFromRemoteMessage(Ljava/util/Map;)Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v2, 0x1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    iget-object v3, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDelegate:Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;

    .line 45
    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    invoke-interface {v3, v1, p1}, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;->shouldHandleEvent(Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;Ljava/util/Map;)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const/4 p1, 0x0

    .line 54
    :goto_0
    if-nez p1, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    :cond_2
    :goto_1
    if-eqz v2, :cond_3

    .line 62
    .line 63
    invoke-direct {p0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->loadScreenIfPossible()V

    .line 64
    .line 65
    .line 66
    :cond_3
    return v0
.end method

.method public final loadScreen(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
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
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 7
    .line 8
    new-instance v1, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1, p2}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;-><init>(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$2;

    .line 14
    .line 15
    invoke-direct {v2, p1, p0, p2}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$2;-><init>(Ljava/lang/String;Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, p1, v1, v2}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->screens(Ljava/lang/String;Ltf/l;Ltf/l;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final declared-synchronized setAutomationsDelegate(Ljava/lang/ref/WeakReference;)V
    .locals 0
    .param p1    # Ljava/lang/ref/WeakReference;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/qonversion/android/sdk/automations/AutomationsDelegate;",
            ">;)V"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDelegate:Ljava/lang/ref/WeakReference;
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

.method public final declared-synchronized setScreenCustomizationDelegate(Ljava/lang/ref/WeakReference;)V
    .locals 0
    .param p1    # Ljava/lang/ref/WeakReference;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;",
            ">;)V"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->screenCustomizationDelegate:Ljava/lang/ref/WeakReference;
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
