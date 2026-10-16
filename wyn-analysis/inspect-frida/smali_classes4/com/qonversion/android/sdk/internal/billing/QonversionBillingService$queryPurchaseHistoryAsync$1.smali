.class final Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->queryPurchaseHistoryAsync(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ltf/l;Ltf/l;)V
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
.field final synthetic $onQueryHistoryCompleted:Ltf/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltf/l;"
        }
    .end annotation
.end field

.field final synthetic $onQueryHistoryFailed:Ltf/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltf/l;"
        }
    .end annotation
.end field

.field final synthetic $productType:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ltf/l;Ltf/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;",
            "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1;->$productType:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1;->$onQueryHistoryFailed:Ltf/l;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1;->$onQueryHistoryCompleted:Ltf/l;

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


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/qonversion/android/sdk/internal/billing/BillingError;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1;->invoke(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V
    .locals 5
    .param p1    # Lcom/qonversion/android/sdk/internal/billing/BillingError;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$getBillingClientWrapper$p(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    move-result-object p1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1;->$productType:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1$1;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1;->$onQueryHistoryCompleted:Ltf/l;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1;->$onQueryHistoryFailed:Ltf/l;

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ltf/l;Ltf/l;)V

    invoke-virtual {p1, v0, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->queryPurchaseHistory(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ltf/p;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1;->$onQueryHistoryFailed:Ltf/l;

    invoke-interface {v0, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
