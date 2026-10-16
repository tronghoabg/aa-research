.class final Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->loadScreen(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n;",
        "Ltf/l;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;",
        "screen",
        "Lef/C;",
        "invoke",
        "(Lcom/qonversion/android/sdk/internal/dto/automations/Screen;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;

.field final synthetic $screenId:Ljava/lang/String;

.field final synthetic this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    iput-object p2, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->$screenId:Ljava/lang/String;

    iput-object p3, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/automations/Screen;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->invoke(Lcom/qonversion/android/sdk/internal/dto/automations/Screen;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/internal/dto/automations/Screen;)V
    .locals 8
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/automations/Screen;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->access$getActivityProvider$p(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->access$getAppContext$p(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)Landroid/app/Application;

    move-result-object v0

    .line 3
    :goto_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->getScreenCustomizationDelegate()Ljava/lang/ref/WeakReference;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;

    if-eqz v1, :cond_1

    .line 4
    iget-object v2, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->$screenId:Ljava/lang/String;

    invoke-interface {v1, v2}, Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;->getPresentationConfigurationForScreen(Ljava/lang/String;)Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2, v3}, Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;-><init>(Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    :goto_1
    sget-object v2, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->Companion:Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity$Companion;

    .line 6
    iget-object v3, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->$screenId:Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/automations/Screen;->getHtmlPage()Ljava/lang/String;

    move-result-object p1

    .line 8
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;->getPresentationStyle()Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;

    move-result-object v4

    .line 9
    invoke-virtual {v2, v0, v3, p1, v4}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity$Companion;->getCallingIntent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;)Landroid/content/Intent;

    move-result-object p1

    .line 10
    instance-of v2, v0, Landroid/app/Activity;

    if-nez v2, :cond_2

    const/high16 v2, 0x10000000

    .line 11
    invoke-virtual {p1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 12
    iget-object v2, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    invoke-static {v2}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->access$getLogger$p(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    move-result-object v2

    const-string v3, "loadScreen() -> Screen intent will process with a non-Activity context"

    invoke-virtual {v2, v3}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->debug(Ljava/lang/String;)V

    .line 13
    :cond_2
    :try_start_0
    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 14
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;->getPresentationStyle()Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;

    move-result-object p1

    invoke-static {p1}, Lcom/qonversion/android/sdk/automations/internal/UtilsKt;->getScreenTransactionAnimations(Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;)Lef/k;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 15
    instance-of v2, v0, Landroid/app/Activity;

    if-eqz v2, :cond_3

    .line 16
    iget-object v1, p1, Lef/k;->a:Ljava/lang/Object;

    .line 17
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 18
    iget-object p1, p1, Lef/k;->b:Ljava/lang/Object;

    .line 19
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 20
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    .line 21
    :cond_3
    invoke-static {v1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->access$getLogger$p(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    move-result-object p1

    .line 22
    const-string v0, "Can\'t use transition animations, cause the provided context is not an activity. To override default animation, please, provide an activity context to AutomationsDelegate.contextForScreenIntent"

    .line 23
    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->debug(Ljava/lang/String;)V

    .line 24
    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;

    if-eqz p1, :cond_5

    invoke-interface {p1}, Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;->onSuccess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 25
    :goto_3
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->$screenId:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to start screen with id "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " with exception: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 26
    iget-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    invoke-static {p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->access$getLogger$p(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "loadScreen() -> "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->error(Ljava/lang/String;)V

    .line 27
    iget-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;

    if-eqz p1, :cond_5

    .line 28
    new-instance v2, Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 29
    sget-object v3, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->Unknown:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    .line 30
    invoke-direct/range {v2 .. v7}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 31
    invoke-interface {p1, v2}, Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    :cond_5
    return-void
.end method
