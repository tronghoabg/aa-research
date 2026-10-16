.class final Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->makePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)V
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
        "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
        "billingSetupError",
        "Lef/C;",
        "invoke",
        "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V",
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

.field final synthetic $product:Lcom/qonversion/android/sdk/dto/products/QProduct;

.field final synthetic $updatePurchaseInfo:Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/dto/products/QProduct;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;->$product:Lcom/qonversion/android/sdk/dto/products/QProduct;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;->$activity:Landroid/app/Activity;

    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;->$offerId:Ljava/lang/String;

    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;->$applyOffer:Ljava/lang/Boolean;

    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;->$updatePurchaseInfo:Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/qonversion/android/sdk/internal/billing/BillingError;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;->invoke(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V
    .locals 8
    .param p1    # Lcom/qonversion/android/sdk/internal/billing/BillingError;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;->$product:Lcom/qonversion/android/sdk/dto/products/QProduct;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$chooseBillingClientWrapperForProductPurchase(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;

    move-result-object v1

    if-nez v1, :cond_1

    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;->$product:Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 3
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$getPurchasesListener$p(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;

    move-result-object p1

    .line 4
    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/BillingError;

    .line 5
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Store details for purchasing Qonversion product "

    const-string v3, " were not found"

    .line 6
    invoke-static {v2, v0, v3}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x4

    .line 7
    invoke-direct {v1, v2, v0}, Lcom/qonversion/android/sdk/internal/billing/BillingError;-><init>(ILjava/lang/String;)V

    const/4 v0, 0x2

    const/4 v2, 0x0

    .line 8
    invoke-static {p1, v1, v2, v0, v2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener$DefaultImpls;->onPurchasesFailed$default(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;Lcom/qonversion/android/sdk/internal/billing/BillingError;Ljava/util/List;ILjava/lang/Object;)V

    return-void

    .line 9
    :cond_1
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;->$activity:Landroid/app/Activity;

    .line 10
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;->$product:Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 11
    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;->$offerId:Ljava/lang/String;

    .line 12
    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;->$applyOffer:Ljava/lang/Boolean;

    .line 13
    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;->$updatePurchaseInfo:Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;

    .line 14
    new-instance v7, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1$1;

    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    invoke-direct {v7, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)V

    invoke-interface/range {v1 .. v7}, Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;->makePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;Ltf/l;)V

    return-void
.end method
