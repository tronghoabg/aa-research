.class public final Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$Presenter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$Companion;,
        Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0019\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\r\u001a\u0004\u0018\u00010\u000c*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u000f*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0019\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u000cH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;",
        "Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$Presenter;",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "repository",
        "Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;",
        "view",
        "<init>",
        "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;)V",
        "Landroid/net/Uri;",
        "Lcom/qonversion/android/sdk/automations/dto/QActionResultType;",
        "getActionType",
        "(Landroid/net/Uri;)Lcom/qonversion/android/sdk/automations/dto/QActionResultType;",
        "",
        "getData",
        "(Landroid/net/Uri;)Ljava/lang/String;",
        "",
        "shouldOverrideUrlLoading",
        "(Landroid/net/Uri;)Z",
        "isQScheme",
        "isAutomationsHost",
        "screenId",
        "Lef/C;",
        "getHtmlPageForScreen",
        "(Ljava/lang/String;)V",
        "url",
        "(Ljava/lang/String;)Z",
        "confirmScreenView",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;",
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
.field private static final ACTION:Ljava/lang/String; = "action"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Companion:Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final DATA:Ljava/lang/String; = "data"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final HOST:Ljava/lang/String; = "automation"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final REGEX:Ljava/lang/String; = "qon-.+"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final SCHEMA:Ljava/lang/String; = "qon-"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final view:Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->Companion:Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/repository/QRepository;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;
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
    const-string v0, "view"

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
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->view:Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    .line 17
    .line 18
    new-instance p1, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 19
    .line 20
    invoke-direct {p1}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 24
    .line 25
    return-void
.end method

.method public static final synthetic access$getView$p(Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;)Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->view:Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    .line 2
    .line 3
    return-object p0
.end method

.method private final getActionType(Landroid/net/Uri;)Lcom/qonversion/android/sdk/automations/dto/QActionResultType;
    .locals 1

    .line 1
    const-string v0, "action"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->Companion:Lcom/qonversion/android/sdk/automations/dto/QActionResultType$Companion;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/automations/dto/QActionResultType$Companion;->fromType(Ljava/lang/String;)Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method private final getData(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method private final getHtmlPageForScreen(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 2
    .line 3
    new-instance v1, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$getHtmlPageForScreen$1;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$getHtmlPageForScreen$1;-><init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v2, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$getHtmlPageForScreen$2;

    .line 9
    .line 10
    invoke-direct {v2, p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$getHtmlPageForScreen$2;-><init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, p1, v1, v2}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->screens(Ljava/lang/String;Ltf/l;Ltf/l;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private final isAutomationsHost(Landroid/net/Uri;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    const-string v1, "automation"

    .line 7
    .line 8
    invoke-static {p1, v1, v0}, LBf/r;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method private final isQScheme(Landroid/net/Uri;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const-string v0, "qon-.+"

    .line 8
    .line 9
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "compile(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method private final shouldOverrideUrlLoading(Landroid/net/Uri;)Z
    .locals 1

    .line 16
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->isAutomationsHost(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->isQScheme(Landroid/net/Uri;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public confirmScreenView(Ljava/lang/String;)V
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
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->views(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public shouldOverrideUrlLoading(Ljava/lang/String;)Z
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "shouldOverrideUrlLoading() -> url:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->debug(Ljava/lang/String;)V

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    .line 2
    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->shouldOverrideUrlLoading(Landroid/net/Uri;)Z

    move-result v1

    if-nez v1, :cond_1

    return v0

    .line 4
    :cond_1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->getActionType(Landroid/net/Uri;)Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    move-result-object v1

    sget-object v2, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    return v0

    .line 5
    :pswitch_0
    iget-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->view:Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    invoke-interface {p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;->restore()V

    goto :goto_0

    .line 6
    :pswitch_1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->getData(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 7
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->view:Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    invoke-interface {v1, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;->purchase(Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :pswitch_2
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->getData(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 9
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->getHtmlPageForScreen(Ljava/lang/String;)V

    goto :goto_0

    .line 10
    :pswitch_3
    iget-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->view:Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    invoke-static {p1, v2, v0, v2}, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View$DefaultImpls;->closeAll$default(Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;Lcom/qonversion/android/sdk/automations/dto/QActionResult;ILjava/lang/Object;)V

    goto :goto_0

    .line 11
    :pswitch_4
    iget-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->view:Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    invoke-static {p1, v2, v0, v2}, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View$DefaultImpls;->close$default(Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;Lcom/qonversion/android/sdk/automations/dto/QActionResult;ILjava/lang/Object;)V

    goto :goto_0

    .line 12
    :pswitch_5
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->getData(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 13
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->view:Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    invoke-interface {v1, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;->openDeepLink(Ljava/lang/String;)V

    goto :goto_0

    .line 14
    :pswitch_6
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->getData(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 15
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->view:Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    invoke-interface {v1, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;->openLink(Ljava/lang/String;)V

    :cond_2
    :goto_0
    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
