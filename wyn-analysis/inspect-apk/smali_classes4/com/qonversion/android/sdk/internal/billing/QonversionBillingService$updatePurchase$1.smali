.class final Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->updatePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n;",
        "Ltf/p;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lcom/android/billingclient/api/BillingResult;",
        "billingResult",
        "Lcom/android/billingclient/api/PurchaseHistoryRecord;",
        "purchaseHistoryRecord",
        "Lef/C;",
        "invoke",
        "(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/PurchaseHistoryRecord;)V",
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
.field final synthetic $activity:Landroid/app/Activity;

.field final synthetic $applyOffer:Ljava/lang/Boolean;

.field final synthetic $offerId:Ljava/lang/String;

.field final synthetic $oldProduct:Lcom/qonversion/android/sdk/dto/products/QProduct;

.field final synthetic $product:Lcom/qonversion/android/sdk/dto/products/QProduct;

.field final synthetic $updatePolicy:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Lcom/qonversion/android/sdk/dto/products/QProduct;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;->$activity:Landroid/app/Activity;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;->$product:Lcom/qonversion/android/sdk/dto/products/QProduct;

    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;->$offerId:Ljava/lang/String;

    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;->$applyOffer:Ljava/lang/Boolean;

    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;->$updatePolicy:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    iput-object p7, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;->$oldProduct:Lcom/qonversion/android/sdk/dto/products/QProduct;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/android/billingclient/api/BillingResult;

    check-cast p2, Lcom/android/billingclient/api/PurchaseHistoryRecord;

    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;->invoke(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/PurchaseHistoryRecord;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Lcom/android/billingclient/api/BillingResult;Lcom/android/billingclient/api/PurchaseHistoryRecord;)V
    .locals 8
    .param p1    # Lcom/android/billingclient/api/BillingResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/android/billingclient/api/PurchaseHistoryRecord;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "billingResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->isOk(Lcom/android/billingclient/api/BillingResult;)Z

    move-result v0

    const-string v1, "updatePurchase() -> "

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-nez v0, :cond_0

    .line 3
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDescription(Lcom/android/billingclient/api/BillingResult;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "Failed to update purchase: "

    .line 4
    invoke-static {v0, p2}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 5
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$getPurchasesListener$p(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;

    move-result-object v0

    .line 6
    new-instance v4, Lcom/qonversion/android/sdk/internal/billing/BillingError;

    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result p1

    invoke-direct {v4, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingError;-><init>(ILjava/lang/String;)V

    .line 7
    invoke-static {v0, v4, v3, v2, v3}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener$DefaultImpls;->onPurchasesFailed$default(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;Lcom/qonversion/android/sdk/internal/billing/BillingError;Ljava/util/List;ILjava/lang/Object;)V

    .line 8
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$getLogger$p(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz p2, :cond_1

    .line 9
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$getLogger$p(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object p1

    .line 10
    invoke-static {p2}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "updatePurchase() -> Purchase was found successfully for store product: "

    .line 11
    invoke-static {v1, v0, p1}, Lcom/google/android/gms/internal/consent_sdk/a;->z(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    .line 12
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    .line 13
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;->$activity:Landroid/app/Activity;

    .line 14
    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;->$product:Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 15
    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;->$offerId:Ljava/lang/String;

    .line 16
    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;->$applyOffer:Ljava/lang/Boolean;

    .line 17
    new-instance v7, Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;

    invoke-virtual {p2}, Lcom/android/billingclient/api/PurchaseHistoryRecord;->getPurchaseToken()Ljava/lang/String;

    move-result-object p1

    const-string p2, "getPurchaseToken(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;->$updatePolicy:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    invoke-direct {v7, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;-><init>(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)V

    .line 18
    invoke-static/range {v2 .. v7}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$makePurchase(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)V

    return-void

    .line 19
    :cond_1
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;->$oldProduct:Lcom/qonversion/android/sdk/dto/products/QProduct;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    move-result-object p2

    const-string v0, "No existing purchase for Qonversion product: "

    .line 20
    invoke-static {v0, p2}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 21
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$getPurchasesListener$p(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;

    move-result-object v0

    .line 22
    new-instance v4, Lcom/qonversion/android/sdk/internal/billing/BillingError;

    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result p1

    invoke-direct {v4, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingError;-><init>(ILjava/lang/String;)V

    .line 23
    invoke-static {v0, v4, v3, v2, v3}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener$DefaultImpls;->onPurchasesFailed$default(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;Lcom/qonversion/android/sdk/internal/billing/BillingError;Ljava/util/List;ILjava/lang/Object;)V

    .line 24
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$getLogger$p(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    return-void
.end method
