.class final Lcom/qonversion/android/sdk/internal/QProductCenterManager$grantPermissionsAfterFailedRestore$newPermissions$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QProductCenterManager;->grantPermissionsAfterFailedRestore(Ljava/util/List;Ljava/util/Collection;Ljava/util/Map;)Ljava/util/Map;
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
        "\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
        "record",
        "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $productPermissions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $products:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;


# direct methods
.method public constructor <init>(Ljava/util/Collection;Ljava/util/Map;Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lcom/qonversion/android/sdk/internal/QProductCenterManager;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$grantPermissionsAfterFailedRestore$newPermissions$1;->$products:Ljava/util/Collection;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$grantPermissionsAfterFailedRestore$newPermissions$1;->$productPermissions:Ljava/util/Map;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$grantPermissionsAfterFailedRestore$newPermissions$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$grantPermissionsAfterFailedRestore$newPermissions$1;->invoke(Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;)Ljava/util/List;
    .locals 10
    .param p1    # Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ")",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "record"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$grantPermissionsAfterFailedRestore$newPermissions$1;->$products:Ljava/util/Collection;

    check-cast v0, Ljava/lang/Iterable;

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 5
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;->getHistoryRecord()Lcom/android/billingclient/api/PurchaseHistoryRecord;

    move-result-object v4

    invoke-static {v4}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 6
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$grantPermissionsAfterFailedRestore$newPermissions$1;->$productPermissions:Ljava/util/Map;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$grantPermissionsAfterFailedRestore$newPermissions$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 8
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 10
    check-cast v4, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 11
    invoke-virtual {v4}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-nez v5, :cond_2

    sget-object v5, Lff/v;->a:Lff/v;

    .line 12
    :cond_2
    check-cast v5, Ljava/lang/Iterable;

    .line 13
    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v5, v7}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 15
    check-cast v7, Ljava/lang/String;

    .line 16
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;->getHistoryRecord()Lcom/android/billingclient/api/PurchaseHistoryRecord;

    move-result-object v8

    invoke-virtual {v8}, Lcom/android/billingclient/api/PurchaseHistoryRecord;->getPurchaseTime()J

    move-result-wide v8

    .line 17
    invoke-static {v2, v7, v8, v9, v4}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$createPermission(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;JLcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/dto/QPermission;

    move-result-object v7

    .line 18
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 19
    :cond_3
    invoke-static {v6, v3}, Lff/t;->e0(Ljava/lang/Iterable;Ljava/util/Collection;)V

    goto :goto_1

    :cond_4
    return-object v3
.end method
