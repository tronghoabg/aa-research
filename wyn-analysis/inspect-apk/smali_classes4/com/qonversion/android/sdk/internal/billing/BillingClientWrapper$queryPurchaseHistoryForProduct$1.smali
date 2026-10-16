.class final Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->queryPurchaseHistoryForProduct(Lcom/qonversion/android/sdk/dto/products/QProduct;Ltf/p;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lcom/android/billingclient/api/BillingClient;",
        "Lef/C;",
        "invoke",
        "(Lcom/android/billingclient/api/BillingClient;)V",
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
.field final synthetic $onCompleted:Ltf/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltf/p;"
        }
    .end annotation
.end field

.field final synthetic $productType:Ljava/lang/String;

.field final synthetic $storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;Ljava/lang/String;Ltf/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;",
            "Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;",
            "Ljava/lang/String;",
            "Ltf/p;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1;->$storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1;->$productType:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1;->$onCompleted:Ltf/p;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static synthetic a(Ltf/p;Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1;->invoke$lambda$1(Ltf/p;Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method

.method private static final invoke$lambda$1(Ltf/p;Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 4

    .line 1
    const-string v0, "$onCompleted"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$storeDetails"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "billingResult"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    if-eqz p3, :cond_2

    .line 18
    .line 19
    check-cast p3, Ljava/lang/Iterable;

    .line 20
    .line 21
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    move-object v2, v1

    .line 36
    check-cast v2, Lcom/android/billingclient/api/PurchaseHistoryRecord;

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getProductId()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v2}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_0

    .line 54
    .line 55
    move-object v0, v1

    .line 56
    :cond_1
    check-cast v0, Lcom/android/billingclient/api/PurchaseHistoryRecord;

    .line 57
    .line 58
    :cond_2
    invoke-interface {p0, p2, v0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/android/billingclient/api/BillingClient;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1;->invoke(Lcom/android/billingclient/api/BillingClient;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Lcom/android/billingclient/api/BillingClient;)V
    .locals 5
    .param p1    # Lcom/android/billingclient/api/BillingClient;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "$this$withReadyClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->getLogger()Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1;->$storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getProductId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1;->$productType:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "queryPurchaseHistoryForProduct() -> Querying purchase history for "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " with type "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 5
    invoke-static {}, Lcom/android/billingclient/api/QueryPurchaseHistoryParams;->newBuilder()Lcom/android/billingclient/api/QueryPurchaseHistoryParams$Builder;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1;->$productType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/QueryPurchaseHistoryParams$Builder;->setProductType(Ljava/lang/String;)Lcom/android/billingclient/api/QueryPurchaseHistoryParams$Builder;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/android/billingclient/api/QueryPurchaseHistoryParams$Builder;->build()Lcom/android/billingclient/api/QueryPurchaseHistoryParams;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1;->$onCompleted:Ltf/p;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1;->$storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    new-instance v3, Lcom/qonversion/android/sdk/internal/billing/d;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v1, v2}, Lcom/qonversion/android/sdk/internal/billing/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v0, v3}, Lcom/android/billingclient/api/BillingClient;->queryPurchaseHistoryAsync(Lcom/android/billingclient/api/QueryPurchaseHistoryParams;Lcom/android/billingclient/api/PurchaseHistoryResponseListener;)V

    return-void
.end method
