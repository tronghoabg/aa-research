.class final Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QProductCenterManager;->continueLaunchWithPurchasesInfo(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
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
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "Lcom/android/billingclient/api/Purchase;",
        "purchases",
        "Lef/C;",
        "invoke",
        "(Ljava/util/List;)V",
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
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

.field final synthetic $requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->$requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->invoke(Ljava/util/List;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 9
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    const-string v0, "purchases"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->$requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    invoke-static {p1, v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$continueLaunchWithPurchasesInfo$processInitDefault(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    return-void

    .line 4
    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/android/billingclient/api/Purchase;

    .line 7
    invoke-virtual {v2}, Lcom/android/billingclient/api/Purchase;->getPurchaseState()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    .line 8
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 9
    :cond_2
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$setProcessingPurchases$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/List;)V

    .line 10
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getConverter$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;

    move-result-object p1

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getProcessingPurchaseOptions(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;->convertPurchases(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;

    move-result-object v6

    .line 11
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    invoke-static {p1, v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getWrappedPurchasesCallback(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    move-result-object v7

    .line 12
    new-instance v2, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;

    .line 13
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getInstallDate$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)J

    move-result-wide v3

    .line 14
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getAdvertisingID$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Ljava/lang/String;

    move-result-object v5

    .line 15
    iget-object v8, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->$requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 16
    invoke-direct/range {v2 .. v8}, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;-><init>(JLjava/lang/String;Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    .line 17
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$continueLaunchWithPurchasesInfo$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {p1, v2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$processInit(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V

    return-void
.end method
