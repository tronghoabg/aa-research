.class final Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$loadProducts$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->loadProducts(Ljava/util/List;Ltf/l;Ltf/l;)V
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
        "Lcom/android/billingclient/api/ProductDetails;",
        "subscriptionProductDetails",
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

.field final synthetic $productIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Ltf/l;Ltf/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$loadProducts$1;->$productIds:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$loadProducts$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$loadProducts$1;->$onFailed:Ltf/l;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$loadProducts$1;->$onCompleted:Ltf/l;

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
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$loadProducts$1;->invoke(Ljava/util/List;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/ProductDetails;",
            ">;)V"
        }
    .end annotation

    const-string v0, "subscriptionProductDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 5
    check-cast v2, Lcom/android/billingclient/api/ProductDetails;

    .line 6
    invoke-virtual {v2}, Lcom/android/billingclient/api/ProductDetails;->getProductId()Ljava/lang/String;

    move-result-object v2

    .line 7
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 8
    :cond_0
    invoke-static {v1}, Lff/o;->X0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$loadProducts$1;->$productIds:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v1, v0}, Lff/o;->B0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 10
    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 11
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$loadProducts$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$loadProducts$1$1;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$loadProducts$1;->$onCompleted:Ltf/l;

    invoke-direct {v2, v3, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$loadProducts$1$1;-><init>(Ltf/l;Ljava/util/List;)V

    .line 12
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$loadProducts$1;->$onFailed:Ltf/l;

    .line 13
    const-string v3, "inapp"

    invoke-static {v1, v3, v0, v2, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->access$queryProductDetailsAsync(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Ljava/lang/String;Ljava/util/List;Ltf/l;Ltf/l;)V

    return-void

    .line 14
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$loadProducts$1;->$onCompleted:Ltf/l;

    invoke-interface {v0, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
