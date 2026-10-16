.class public final Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;
.super Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;",
        "Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper<",
        "Ljava/lang/String;",
        "Lcom/android/billingclient/api/SkuDetails;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u00012\u0012\u0012\u0008\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u0002B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJO\u0010\u0013\u001a\u00020\u00102\u0010\u0010\r\u001a\u000c\u0012\u0008\u0012\u00060\u0003j\u0002`\u00040\u000c2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u000c\u0012\u0004\u0012\u00020\u00100\u000eH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014JW\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00032\u0010\u0010\u0016\u001a\u000c\u0012\u0008\u0012\u00060\u0003j\u0002`\u00040\u000c2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u000c\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J/\u0010\u001a\u001a\u00020\u00102\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000c2\u0010\u0010\u0016\u001a\u000c\u0012\u0008\u0012\u00060\u0003j\u0002`\u00040\u000cH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJC\u0010 \u001a\u00020\u00102\u0010\u0010\u001c\u001a\u000c\u0012\u0008\u0012\u00060\u0003j\u0002`\u00040\u000c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u001eH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u001d\u0010#\u001a\u0004\u0018\u00010\u00052\n\u0010\"\u001a\u00060\u0003j\u0002`\u0004H\u0016\u00a2\u0006\u0004\u0008#\u0010$JQ\u0010.\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020\'2\u0008\u0010)\u001a\u0004\u0018\u00010\u00032\u0008\u0010+\u001a\u0004\u0018\u00010*2\u0008\u0010-\u001a\u0004\u0018\u00010,2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016\u00a2\u0006\u0004\u0008.\u0010/J3\u00104\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\'2\u001a\u00103\u001a\u0016\u0012\u0004\u0012\u000201\u0012\u0006\u0012\u0004\u0018\u000102\u0012\u0004\u0012\u00020\u001000H\u0016\u00a2\u0006\u0004\u00084\u00105J9\u00107\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u0002062 \u00103\u001a\u001c\u0012\u0004\u0012\u000201\u0012\u000c\u0012\n\u0012\u0004\u0012\u000202\u0018\u00010\u000c\u0012\u0004\u0012\u00020\u001000H\u0016\u00a2\u0006\u0004\u00087\u00108J=\u0010:\u001a\u00020\u00102\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0018\u00103\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002090\u000c\u0012\u0004\u0012\u00020\u00100\u000eH\u0016\u00a2\u0006\u0004\u0008:\u0010;J?\u0010=\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00032\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00100\u000eH\u0016\u00a2\u0006\u0004\u0008=\u0010>R,\u0010@\u001a\u0012\u0012\u0008\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050?8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008@\u0010A\u0012\u0004\u0008B\u0010C\u00a8\u0006D"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;",
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;",
        "Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;",
        "",
        "Lcom/qonversion/android/sdk/internal/billing/LegacyStoreId;",
        "Lcom/android/billingclient/api/SkuDetails;",
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;",
        "billingClientHolder",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "logger",
        "<init>",
        "(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/logger/Logger;)V",
        "",
        "productIds",
        "Lkotlin/Function1;",
        "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
        "Lef/C;",
        "onQuerySkuFailed",
        "onQuerySkuCompleted",
        "loadProducts",
        "(Ljava/util/List;Ltf/l;Ltf/l;)V",
        "productType",
        "skuList",
        "querySkuDetailsAsync",
        "(Ljava/lang/String;Ljava/util/List;Ltf/l;Ltf/l;)V",
        "skuDetailsList",
        "logSkuDetails",
        "(Ljava/util/List;Ljava/util/List;)V",
        "storeIds",
        "onFailed",
        "Lkotlin/Function0;",
        "onReady",
        "withStoreDataLoaded",
        "(Ljava/util/List;Ltf/l;Ltf/a;)V",
        "storeId",
        "getStoreData",
        "(Ljava/lang/String;)Lcom/android/billingclient/api/SkuDetails;",
        "Landroid/app/Activity;",
        "activity",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "product",
        "offerId",
        "",
        "applyOffer",
        "Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;",
        "updatePurchaseInfo",
        "makePurchase",
        "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;Ltf/l;)V",
        "Lkotlin/Function2;",
        "Lcom/android/billingclient/api/BillingResult;",
        "Lcom/android/billingclient/api/PurchaseHistoryRecord;",
        "onCompleted",
        "queryPurchaseHistoryForProduct",
        "(Lcom/qonversion/android/sdk/dto/products/QProduct;Ltf/p;)V",
        "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
        "queryPurchaseHistory",
        "(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ltf/p;)V",
        "Lcom/android/billingclient/api/Purchase;",
        "queryPurchases",
        "(Ltf/l;Ltf/l;)V",
        "onSuccess",
        "getStoreProductType",
        "(Ljava/lang/String;Ltf/l;Ltf/l;)V",
        "",
        "skuDetails",
        "Ljava/util/Map;",
        "getSkuDetails$annotations",
        "()V",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private skuDetails:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/android/billingclient/api/SkuDetails;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/logger/Logger;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/logger/Logger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "billingClientHolder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "logger"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;-><init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    .line 12
    .line 13
    .line 14
    sget-object p1, Lff/w;->a:Lff/w;

    .line 15
    .line 16
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->skuDetails:Ljava/util/Map;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic access$getSkuDetails$p(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->skuDetails:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$logSkuDetails(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->logSkuDetails(Ljava/util/List;Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$querySkuDetailsAsync(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Ljava/lang/String;Ljava/util/List;Ltf/l;Ltf/l;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->querySkuDetailsAsync(Ljava/lang/String;Ljava/util/List;Ltf/l;Ltf/l;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$setSkuDetails$p(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Ljava/util/Map;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->skuDetails:Ljava/util/Map;

    .line 2
    .line 3
    return-void
.end method

.method private static synthetic getSkuDetails$annotations()V
    .locals 0

    return-void
.end method

.method private final loadProducts(Ljava/util/List;Ltf/l;Ltf/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$loadProducts$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0, p2, p3}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$loadProducts$1;-><init>(Ljava/util/List;Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Ltf/l;Ltf/l;)V

    .line 4
    .line 5
    .line 6
    const-string p3, "subs"

    .line 7
    .line 8
    invoke-direct {p0, p3, p1, v0, p2}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->querySkuDetailsAsync(Ljava/lang/String;Ljava/util/List;Ltf/l;Ltf/l;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final logSkuDetails(Ljava/util/List;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/SkuDetails;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p1, v1

    .line 10
    :goto_0
    if-eqz p1, :cond_2

    .line 11
    .line 12
    check-cast p1, Ljava/lang/Iterable;

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lcom/android/billingclient/api/SkuDetails;

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->getLogger()Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v3, "querySkuDetailsAsync() -> "

    .line 37
    .line 38
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-interface {v1, v0}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    sget-object v1, Lef/C;->a:Lef/C;

    .line 53
    .line 54
    :cond_2
    if-nez v1, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->getLogger()Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v1, "querySkuDetailsAsync() -> SkuDetails list for "

    .line 63
    .line 64
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string p2, " is empty."

    .line 71
    .line 72
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-interface {p1, p2}, Lcom/qonversion/android/sdk/internal/logger/Logger;->warn(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    return-void
.end method

.method private final querySkuDetailsAsync(Ljava/lang/String;Ljava/util/List;Ltf/l;Ltf/l;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/android/billingclient/api/SkuDetailsParams;->newBuilder()Lcom/android/billingclient/api/SkuDetailsParams$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/android/billingclient/api/SkuDetailsParams$Builder;->setType(Ljava/lang/String;)Lcom/android/billingclient/api/SkuDetailsParams$Builder;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1, p2}, Lcom/android/billingclient/api/SkuDetailsParams$Builder;->setSkusList(Ljava/util/List;)Lcom/android/billingclient/api/SkuDetailsParams$Builder;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Lcom/android/billingclient/api/SkuDetailsParams$Builder;->build()Lcom/android/billingclient/api/SkuDetailsParams;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string p1, "build(...)"

    .line 18
    .line 19
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->getBillingClientHolder()Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$querySkuDetailsAsync$1;

    .line 27
    .line 28
    move-object v2, p0

    .line 29
    move-object v3, p2

    .line 30
    move-object v4, p3

    .line 31
    move-object v5, p4

    .line 32
    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$querySkuDetailsAsync$1;-><init>(Lcom/android/billingclient/api/SkuDetailsParams;Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Ljava/util/List;Ltf/l;Ltf/l;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->withReadyClient(Ltf/l;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public getStoreData(Ljava/lang/String;)Lcom/android/billingclient/api/SkuDetails;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "storeId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->skuDetails:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/billingclient/api/SkuDetails;

    return-object p1
.end method

.method public bridge synthetic getStoreData(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->getStoreData(Ljava/lang/String;)Lcom/android/billingclient/api/SkuDetails;

    move-result-object p1

    return-object p1
.end method

.method public getStoreProductType(Ljava/lang/String;Ltf/l;Ltf/l;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "storeId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onFailed"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onSuccess"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->skuDetails:Ljava/util/Map;

    .line 17
    .line 18
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/android/billingclient/api/SkuDetails;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    sget-object p1, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->Companion:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType$Companion;

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/android/billingclient/api/SkuDetails;->getType()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    const-string v0, "getType(...)"

    .line 33
    .line 34
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p2}, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType$Companion;->fromSkuType(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-interface {p3, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    invoke-static {p1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$getStoreProductType$2;

    .line 50
    .line 51
    invoke-direct {v1, p2, p1, p3}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$getStoreProductType$2;-><init>(Ltf/l;Ljava/lang/String;Ltf/l;)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p0, v0, p2, v1}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->loadProducts(Ljava/util/List;Ltf/l;Ltf/l;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public makePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;Ltf/l;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/dto/products/QProduct;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string p3, "activity"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p3, "product"

    .line 7
    .line 8
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p3, "onFailed"

    .line 12
    .line 13
    invoke-static {p6, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getSkuDetail()Lcom/android/billingclient/api/SkuDetails;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    if-nez p2, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->getLogger()Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    invoke-virtual {p2}, Lcom/android/billingclient/api/SkuDetails;->getSku()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p4

    .line 31
    new-instance p6, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v0, "makePurchase() -> Purchasing the sku: "

    .line 34
    .line 35
    invoke-direct {p6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p6, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p4

    .line 45
    invoke-interface {p3, p4}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lcom/android/billingclient/api/BillingFlowParams;->newBuilder()Lcom/android/billingclient/api/BillingFlowParams$Builder;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    invoke-virtual {p3, p2}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->setSkuDetails(Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    const-string p3, "setSkuDetails(...)"

    .line 57
    .line 58
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p2, p5}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->setSubscriptionUpdateParams(Lcom/android/billingclient/api/BillingFlowParams$Builder;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)Lcom/android/billingclient/api/BillingFlowParams$Builder;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-virtual {p2}, Lcom/android/billingclient/api/BillingFlowParams$Builder;->build()Lcom/android/billingclient/api/BillingFlowParams;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    const-string p3, "build(...)"

    .line 70
    .line 71
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->launchBillingFlow(Landroid/app/Activity;Lcom/android/billingclient/api/BillingFlowParams;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public queryPurchaseHistory(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ltf/p;)V
    .locals 2
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltf/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
            "Ltf/p;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "productType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onCompleted"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->getBillingClientHolder()Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistory$1;

    .line 16
    .line 17
    invoke-direct {v1, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistory$1;-><init>(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ltf/p;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->withReadyClient(Ltf/l;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public queryPurchaseHistoryForProduct(Lcom/qonversion/android/sdk/dto/products/QProduct;Ltf/p;)V
    .locals 2
    .param p1    # Lcom/qonversion/android/sdk/dto/products/QProduct;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltf/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            "Ltf/p;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "product"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onCompleted"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getSkuDetail()Lcom/android/billingclient/api/SkuDetails;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->getBillingClientHolder()Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1;

    .line 23
    .line 24
    invoke-direct {v1, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Lcom/android/billingclient/api/SkuDetails;Ltf/p;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->withReadyClient(Ltf/l;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public queryPurchases(Ltf/l;Ltf/l;)V
    .locals 2
    .param p1    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "onFailed"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onCompleted"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->getBillingClientHolder()Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1;

    .line 16
    .line 17
    invoke-direct {v1, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Ltf/l;Ltf/l;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->withReadyClient(Ltf/l;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public withStoreDataLoaded(Ljava/util/List;Ltf/l;Ltf/a;)V
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ltf/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ltf/l;",
            "Ltf/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "storeIds"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onFailed"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onReady"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast p1, Ljava/lang/Iterable;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object v2, v1

    .line 38
    check-cast v2, Ljava/lang/String;

    .line 39
    .line 40
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->skuDetails:Ljava/util/Map;

    .line 41
    .line 42
    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_0

    .line 47
    .line 48
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    invoke-interface {p3}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    new-instance p1, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$withStoreDataLoaded$1;

    .line 63
    .line 64
    invoke-direct {p1, p0, p3}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$withStoreDataLoaded$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Ltf/a;)V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0, v0, p2, p1}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->loadProducts(Ljava/util/List;Ltf/l;Ltf/l;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method
