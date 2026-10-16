.class final Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;
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
        "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;",
        "result",
        "Lef/C;",
        "invoke",
        "(Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;)V",
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
.field final synthetic $properties:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;->$properties:Ljava/util/Map;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;->invoke(Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;)V
    .locals 6
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->access$fireCallbacks(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V

    .line 3
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;->getPropertyErrors()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    .line 4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult$PropertyError;

    .line 5
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->access$getLogger$p(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object v2

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult$PropertyError;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult$PropertyError;->getError()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Failed to save property "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->access$setRequestInProgress$p(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;Z)V

    .line 7
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->access$setRetriesCounter$p(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;I)V

    .line 8
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    const/4 v0, 0x5

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->access$setRetryDelay$p(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;I)V

    .line 9
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->access$getPropertiesStorage$p(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;

    move-result-object p1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;->$properties:Ljava/util/Map;

    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;->clear(Ljava/util/Map;)V

    return-void
.end method
