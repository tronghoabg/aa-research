.class public final Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;
.super Landroidx/fragment/app/F;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0001PB\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0004J\u000f\u0010\u0008\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0004J#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\u00052\u0008\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001c2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\"\u0010\u0004J\u001f\u0010%\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u0017\u0010(\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u0017\u0010*\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008*\u0010)J\u0017\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008,\u0010)J\u000f\u0010-\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008-\u0010\u0004J\u0017\u0010.\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008.\u0010/J\u0017\u00100\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u00080\u0010/J\u001f\u00103\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00102\u001a\u000201H\u0016\u00a2\u0006\u0004\u00083\u00104R\"\u00106\u001a\u0002058\u0000@\u0000X\u0081.\u00a2\u0006\u0012\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109\"\u0004\u0008:\u0010;R\"\u0010=\u001a\u00020<8\u0000@\u0000X\u0081.\u00a2\u0006\u0012\n\u0004\u0008=\u0010>\u001a\u0004\u0008?\u0010@\"\u0004\u0008A\u0010BR\"\u0010D\u001a\u00020C8\u0000@\u0000X\u0081.\u00a2\u0006\u0012\n\u0004\u0008D\u0010E\u001a\u0004\u0008F\u0010G\"\u0004\u0008H\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008N\u0010O\u00a8\u0006Q"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;",
        "Landroidx/fragment/app/F;",
        "Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;",
        "<init>",
        "()V",
        "Lef/C;",
        "configureWebClient",
        "injectDependencies",
        "loadWebView",
        "confirmScreenView",
        "",
        "value",
        "",
        "getActionResultMap",
        "(Ljava/lang/String;)Ljava/util/Map;",
        "functionName",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "error",
        "Lcom/qonversion/android/sdk/automations/dto/QActionResult;",
        "actionResult",
        "handleOnErrorCallback",
        "(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "onDestroyView",
        "screenId",
        "htmlPage",
        "openScreen",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "url",
        "openLink",
        "(Ljava/lang/String;)V",
        "openDeepLink",
        "productId",
        "purchase",
        "restore",
        "close",
        "(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V",
        "closeAll",
        "",
        "shouldCloseScreen",
        "onError",
        "(Lcom/qonversion/android/sdk/dto/QonversionError;Z)V",
        "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;",
        "automationsManager",
        "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;",
        "getAutomationsManager$sdk_release",
        "()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;",
        "setAutomationsManager$sdk_release",
        "(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)V",
        "Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;",
        "presenter",
        "Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;",
        "getPresenter$sdk_release",
        "()Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;",
        "setPresenter$sdk_release",
        "(Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;)V",
        "Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;",
        "screenProcessor",
        "Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;",
        "getScreenProcessor$sdk_release",
        "()Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;",
        "setScreenProcessor$sdk_release",
        "(Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;)V",
        "Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;",
        "binding",
        "Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;",
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
.field private static final ACTION_MAP_KEY:Ljava/lang/String; = "value"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Companion:Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final ENCODING:Ljava/lang/String; = "UTF-8"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final EX_HTML_PAGE:Ljava/lang/String; = "htmlPage"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final EX_SCREEN_ID:Ljava/lang/String; = "screenId"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final MIME_TYPE:Ljava/lang/String; = "text/html"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public automationsManager:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

.field private binding:Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public presenter:Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

.field public screenProcessor:Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->Companion:Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/F;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic G(ZLcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->onError$lambda$1(ZLcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static final synthetic access$getBinding$p(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->binding:Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$handleOnErrorCallback(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->handleOnErrorCallback(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final configureWebClient()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->binding:Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;->webView:Landroid/webkit/WebView;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-nez v0, :cond_1

    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance v1, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$configureWebClient$1;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$configureWebClient$1;-><init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private final confirmScreenView()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/F;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v2, "screenId"

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidShowScreen(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getPresenter$sdk_release()Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->confirmScreenView(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sget-object v1, Lef/C;->a:Lef/C;

    .line 33
    .line 34
    :cond_1
    if-nez v1, :cond_2

    .line 35
    .line 36
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 37
    .line 38
    const-string v1, "confirmScreenView() -> Failed to confirm screen view"

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->debug(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method private final getActionResultMap(Ljava/lang/String;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
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
    const-string v1, "value"

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    new-array p1, p1, [Lef/k;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    aput-object v0, p1, v1

    .line 13
    .line 14
    invoke-static {p1}, Lff/A;->S([Lef/k;)Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method private final handleOnErrorCallback(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->binding:Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;->progressBarLayout:Lcom/qonversion/android/sdk/databinding/QProgressBarBinding;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lcom/qonversion/android/sdk/databinding/QProgressBarBinding;->progressBar:Landroid/widget/ProgressBar;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    const/16 v1, 0x8

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    :goto_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 22
    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v2, "ScreenActivity "

    .line 26
    .line 27
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p1, " -> "

    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p1, ".description"

    .line 42
    .line 43
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->error(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p3, p2}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->setError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1, p3}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidFailExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method private final injectDependencies()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->builder()Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->INSTANCE:Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;->appComponent(Lcom/qonversion/android/sdk/internal/di/component/AppComponent;)Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;

    .line 16
    .line 17
    invoke-direct {v1, p0}, Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;-><init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;->fragmentModule(Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;)Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;->build()Lcom/qonversion/android/sdk/internal/di/component/FragmentComponent;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0, p0}, Lcom/qonversion/android/sdk/internal/di/component/FragmentComponent;->inject(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private final loadWebView()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/F;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v2, "htmlPage"

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getScreenProcessor$sdk_release()Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v2, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$loadWebView$1$1;

    .line 23
    .line 24
    invoke-direct {v2, p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$loadWebView$1$1;-><init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)V

    .line 25
    .line 26
    .line 27
    new-instance v3, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$loadWebView$1$2;

    .line 28
    .line 29
    invoke-direct {v3, p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$loadWebView$1$2;-><init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v0, v2, v3}, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;->processScreen(Ljava/lang/String;Ltf/l;Ltf/l;)V

    .line 33
    .line 34
    .line 35
    sget-object v1, Lef/C;->a:Lef/C;

    .line 36
    .line 37
    :cond_1
    if-nez v1, :cond_2

    .line 38
    .line 39
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 40
    .line 41
    const-string v1, "loadWebView() -> Failed to fetch html page for the app screen"

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->error(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance v2, Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 47
    .line 48
    sget-object v3, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->Unknown:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 49
    .line 50
    const/4 v6, 0x6

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v5, 0x0

    .line 54
    invoke-direct/range {v2 .. v7}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    invoke-virtual {p0, v2, v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;Z)V

    .line 59
    .line 60
    .line 61
    :cond_2
    return-void
.end method

.method private static final onError$lambda$1(ZLcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    const-string p2, "this$0"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    const/4 p2, 0x0

    .line 10
    invoke-static {p1, p2, p0, p2}, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View$DefaultImpls;->close$default(Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;Lcom/qonversion/android/sdk/automations/dto/QActionResult;ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method


# virtual methods
.method public close(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .locals 3
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
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->binding:Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;->progressBarLayout:Lcom/qonversion/android/sdk/databinding/QProgressBarBinding;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Lcom/qonversion/android/sdk/databinding/QProgressBarBinding;->progressBar:Landroid/widget/ProgressBar;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, v1

    .line 19
    :goto_0
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const/16 v2, 0x8

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/F;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    instance-of v2, v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;

    .line 32
    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    move-object v1, v0

    .line 36
    check-cast v1, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;

    .line 37
    .line 38
    :cond_2
    if-eqz v1, :cond_3

    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->goBack$sdk_release()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    goto :goto_2

    .line 45
    :cond_3
    const/4 v0, 0x0

    .line 46
    :goto_2
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1, p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidFinishExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 51
    .line 52
    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsFinished()V

    .line 60
    .line 61
    .line 62
    :cond_4
    return-void
.end method

.method public closeAll(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
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
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->binding:Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;->progressBarLayout:Lcom/qonversion/android/sdk/databinding/QProgressBarBinding;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, Lcom/qonversion/android/sdk/databinding/QProgressBarBinding;->progressBar:Landroid/widget/ProgressBar;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    const/16 v1, 0x8

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/F;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidFinishExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsFinished()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->automationsManager:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "automationsManager"

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

.method public final getPresenter$sdk_release()Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->presenter:Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "presenter"

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

.method public final getScreenProcessor$sdk_release()Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->screenProcessor:Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "screenProcessor"

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

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string p3, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p3, 0x0

    .line 7
    invoke-static {p1, p2, p3}, Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string p2, "inflate(...)"

    .line 12
    .line 13
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->binding:Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;->getRoot()Landroid/widget/RelativeLayout;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string p2, "getRoot(...)"

    .line 23
    .line 24
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/F;->onDestroyView()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->binding:Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

    .line 6
    .line 7
    return-void
.end method

.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;Z)V
    .locals 2
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
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/F;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "Failed to show the in-app screen"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QonversionError;->getDescription()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 25
    .line 26
    .line 27
    new-instance p1, Lcom/qonversion/android/sdk/automations/mvp/a;

    .line 28
    .line 29
    invoke-direct {p1, p2, p0}, Lcom/qonversion/android/sdk/automations/mvp/a;-><init>(ZLcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)V

    .line 30
    .line 31
    .line 32
    const p2, 0x104000a

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p2, p1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string p2, "view"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->injectDependencies()V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->configureWebClient()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->loadWebView()V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->confirmScreenView()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public openDeepLink(Ljava/lang/String;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;

    .line 7
    .line 8
    sget-object v1, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->DeepLink:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getActionResultMap(Ljava/lang/String;)Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;-><init>(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidStartExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 22
    .line 23
    .line 24
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    .line 25
    .line 26
    const-string v3, "android.intent.action.VIEW"

    .line 27
    .line 28
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v2}, Landroidx/fragment/app/F;->startActivity(Landroid/content/Intent;)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Lcom/qonversion/android/sdk/automations/dto/QActionResult;

    .line 39
    .line 40
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getActionResultMap(Ljava/lang/String;)Ljava/util/Map;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-direct {v2, v1, v3}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;-><init>(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v2}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->close(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catch_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 52
    .line 53
    const-string v2, "Couldn\'t find any Activity to handle the Intent with deeplink "

    .line 54
    .line 55
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {v1, p1}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->error(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidFailExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public openLink(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;

    .line 7
    .line 8
    sget-object v1, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Url:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getActionResultMap(Ljava/lang/String;)Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;-><init>(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidStartExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 22
    .line 23
    .line 24
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    .line 25
    .line 26
    const-string v2, "android.intent.action.VIEW"

    .line 27
    .line 28
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1}, Landroidx/fragment/app/F;->startActivity(Landroid/content/Intent;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidFinishExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catch_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 47
    .line 48
    const-string v2, "Couldn\'t find any Activity to handle the Intent with url "

    .line 49
    .line 50
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v1, p1}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->error(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidFailExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public openScreen(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
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
    const-string v0, "htmlPage"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;

    .line 12
    .line 13
    sget-object v1, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Navigation:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    .line 14
    .line 15
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getActionResultMap(Ljava/lang/String;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;-><init>(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidStartExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 27
    .line 28
    .line 29
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/F;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "null cannot be cast to non-null type com.qonversion.android.sdk.automations.mvp.ScreenActivity"

    .line 34
    .line 35
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    move-object v3, v1

    .line 39
    check-cast v3, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;

    .line 40
    .line 41
    const/4 v8, 0x0

    .line 42
    const/4 v6, 0x0

    .line 43
    const/4 v7, 0x4

    .line 44
    move-object v4, p1

    .line 45
    move-object v5, p2

    .line 46
    invoke-static/range {v3 .. v8}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->showScreen$sdk_release$default(Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidFinishExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :catch_0
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidFailExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public purchase(Ljava/lang/String;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "productId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;

    .line 7
    .line 8
    sget-object v1, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Purchase:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getActionResultMap(Ljava/lang/String;)Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;-><init>(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidStartExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->binding:Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    iget-object v1, v1, Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;->progressBarLayout:Lcom/qonversion/android/sdk/databinding/QProgressBarBinding;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    iget-object v1, v1, Lcom/qonversion/android/sdk/databinding/QProgressBarBinding;->progressBar:Landroid/widget/ProgressBar;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object v1, v2

    .line 37
    :goto_0
    if-nez v1, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v3, 0x0

    .line 41
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/F;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    sget-object v3, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    .line 51
    .line 52
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    new-instance v4, Lcom/qonversion/android/sdk/dto/QPurchaseModel;

    .line 57
    .line 58
    const/4 v5, 0x2

    .line 59
    invoke-direct {v4, p1, v2, v5, v2}, Lcom/qonversion/android/sdk/dto/QPurchaseModel;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 60
    .line 61
    .line 62
    new-instance p1, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$purchase$1$1;

    .line 63
    .line 64
    invoke-direct {p1, p0, v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$purchase$1$1;-><init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v3, v1, v4, p1}, Lcom/qonversion/android/sdk/Qonversion;->purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/QPurchaseModel;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    return-void
.end method

.method public restore()V
    .locals 4

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/QActionResult;

    .line 2
    .line 3
    sget-object v1, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Restore:Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v1, v3, v2, v3}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;-><init>(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->getAutomationsManager$sdk_release()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDidStartExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->binding:Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    iget-object v1, v1, Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;->progressBarLayout:Lcom/qonversion/android/sdk/databinding/QProgressBarBinding;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v3, v1, Lcom/qonversion/android/sdk/databinding/QProgressBarBinding;->progressBar:Landroid/widget/ProgressBar;

    .line 26
    .line 27
    :cond_0
    if-nez v3, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v1, 0x0

    .line 31
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    :goto_0
    sget-object v1, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$restore$1;

    .line 41
    .line 42
    invoke-direct {v2, p0, v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$restore$1;-><init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v1, v2}, Lcom/qonversion/android/sdk/Qonversion;->restore(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final setAutomationsManager$sdk_release(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;
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
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->automationsManager:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 7
    .line 8
    return-void
.end method

.method public final setPresenter$sdk_release(Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;
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
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->presenter:Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    .line 7
    .line 8
    return-void
.end method

.method public final setScreenProcessor$sdk_release(Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;
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
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->screenProcessor:Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;

    .line 7
    .line 8
    return-void
.end method
