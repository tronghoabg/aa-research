.class final Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->queryPurchasesHistory(Ltf/l;Ltf/l;)V
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
        "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
        "subsPurchasesList",
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
.field final synthetic $onCompleted:Ltf/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltf/l;"
        }
    .end annotation
.end field

.field final synthetic $onFailed:Ltf/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltf/l;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ltf/l;Ltf/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;->$onCompleted:Ltf/l;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;->$onFailed:Ltf/l;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;->invoke(Ljava/util/List;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 5
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;)V"
        }
    .end annotation

    const-string v0, "subsPurchasesList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    .line 3
    sget-object v1, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->InApp:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    .line 4
    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1$1;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;->$onCompleted:Ltf/l;

    invoke-direct {v2, v3, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1$1;-><init>(Ltf/l;Ljava/util/List;)V

    new-instance p1, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1$2;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;->$onFailed:Ltf/l;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    invoke-direct {p1, v3, v4}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1$2;-><init>(Ltf/l;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)V

    invoke-static {v0, v1, v2, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$queryPurchaseHistoryAsync(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ltf/l;Ltf/l;)V

    return-void
.end method
