.class final Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;->invoke(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n;",
        "Ltf/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lef/C;",
        "invoke",
        "()V",
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
.field final synthetic $onEnriched:Ltf/l;
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

.field final synthetic $products:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ltf/l;Ltf/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;",
            "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;->$products:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;->$onFailed:Ltf/l;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;->$onEnriched:Ltf/l;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;->invoke()V

    sget-object v0, Lef/C;->a:Lef/C;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;->$products:Ljava/util/List;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;->$onFailed:Ltf/l;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2$2;->$onEnriched:Ltf/l;

    invoke-static {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$enrichStoreDataAsync$fetchProductDetails(Ljava/util/List;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ltf/l;Ltf/l;)V

    return-void
.end method
