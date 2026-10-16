.class final Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$2;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->forceSendProperties(Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;)V
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
.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$2;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/qonversion/android/sdk/dto/QonversionError;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$2;->invoke(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 3
    .param p1    # Lcom/qonversion/android/sdk/dto/QonversionError;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$2;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->access$fireCallbacks(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V

    .line 3
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$2;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->access$setRequestInProgress$p(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;Z)V

    .line 4
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QonversionError;->getCode()Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    move-result-object p1

    sget-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->InvalidClientUid:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    if-ne p1, v0, :cond_1

    .line 5
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$2;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->getProductCenterManager$sdk_release()Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 6
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->UserProperties:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 7
    new-instance v1, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$2$1;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$2;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    invoke-direct {v1, v2}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$2$1;-><init>(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V

    .line 8
    invoke-virtual {p1, v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launch(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    :cond_0
    return-void

    .line 9
    :cond_1
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$2;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->retryPropertiesRequest()V

    return-void
.end method
