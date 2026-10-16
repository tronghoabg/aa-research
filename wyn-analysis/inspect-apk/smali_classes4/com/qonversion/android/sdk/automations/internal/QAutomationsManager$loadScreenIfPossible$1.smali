.class final Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreenIfPossible$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->loadScreenIfPossible()V
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;",
        "actionPoint",
        "Lef/C;",
        "invoke",
        "(Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;)V",
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
.field final synthetic this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreenIfPossible$1;->this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreenIfPossible$1;->invoke(Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;)V
    .locals 6
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 2
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreenIfPossible$1;->this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 3
    invoke-static {v1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->access$getLogger$p(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    move-result-object v2

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;->getScreenId()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "loadScreenIfPossible() ->  Screen with id "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " was found to show"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->debug(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;->getScreenId()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x2

    invoke-static {v1, p1, v0, v2, v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->loadScreen$default(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;ILjava/lang/Object;)V

    .line 5
    sget-object v0, Lef/C;->a:Lef/C;

    :cond_0
    if-nez v0, :cond_1

    .line 6
    iget-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreenIfPossible$1;->this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    invoke-static {p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->access$getLogger$p(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    move-result-object p1

    const-string v0, "loadScreenIfPossible() ->  No screens to show"

    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->warn(Ljava/lang/String;)V

    :cond_1
    return-void
.end method
