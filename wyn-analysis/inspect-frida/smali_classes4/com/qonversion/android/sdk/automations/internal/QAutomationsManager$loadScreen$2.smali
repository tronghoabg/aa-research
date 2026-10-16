.class final Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$2;
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
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "it",
        "Lef/C;",
        "invoke",
        "(Lcom/qonversion/android/sdk/dto/QonversionError;)V",
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
.method public constructor <init>(Ljava/lang/String;Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$2;->$screenId:Ljava/lang/String;

    iput-object p2, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$2;->this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    iput-object p3, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$2;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/qonversion/android/sdk/dto/QonversionError;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$2;->invoke(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 10
    .param p1    # Lcom/qonversion/android/sdk/dto/QonversionError;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$2;->$screenId:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QonversionError;->getAdditionalMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Failed to load screen with id "

    const-string v3, ". "

    .line 3
    invoke-static {v2, v0, v3, v1}, LN0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 4
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$2;->this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->access$getLogger$p(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "loadScreen() -> "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->error(Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$2;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;

    if-eqz v0, :cond_0

    new-instance v4, Lcom/qonversion/android/sdk/dto/QonversionError;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QonversionError;->getCode()Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    move-result-object v5

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v4}, Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    :cond_0
    return-void
.end method
