.class public final Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePurchases(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "com/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1",
        "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
        "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
        "launchResult",
        "Lef/C;",
        "onSuccess",
        "(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "error",
        "onError",
        "(Lcom/qonversion/android/sdk/dto/QonversionError;)V",
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
.field final synthetic $product:Lcom/qonversion/android/sdk/dto/products/QProduct;

.field final synthetic $purchase:Lcom/android/billingclient/api/Purchase;

.field final synthetic $purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

.field final synthetic $purchaseInfo:Lcom/qonversion/android/sdk/internal/purchase/Purchase;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$product:Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchase:Lcom/android/billingclient/api/Purchase;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchaseInfo:Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 4
    .param p1    # Lcom/qonversion/android/sdk/dto/QonversionError;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchase:Lcom/android/billingclient/api/Purchase;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchaseInfo:Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    .line 11
    .line 12
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$product:Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 13
    .line 14
    invoke-static {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$storeFailedPurchaseIfNecessary(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/internal/purchase/Purchase;Lcom/qonversion/android/sdk/dto/products/QProduct;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$product:Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    :goto_0
    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$removePurchaseOptions(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 33
    .line 34
    invoke-static {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$shouldCalculatePermissionsLocally(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 41
    .line 42
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchase:Lcom/android/billingclient/api/Purchase;

    .line 43
    .line 44
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    .line 45
    .line 46
    invoke-static {v0, v1, v2, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$calculatePurchasePermissionsLocally(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    return-void
.end method

.method public onSuccess(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V
    .locals 2
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "launchResult"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$updateLaunchResult(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;->getPermissions$sdk_release()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->toEntitlementsMap(Ljava/util/Map;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$product:Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v1, 0x0

    .line 31
    :goto_0
    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$removePurchaseOptions(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchase:Lcom/android/billingclient/api/Purchase;

    .line 39
    .line 40
    invoke-interface {v0, p1, v1}, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;->onSuccess(Ljava/util/Map;Lcom/android/billingclient/api/Purchase;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 45
    .line 46
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getInternalConfig$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getEntitlementsUpdateListener()Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;->onEntitlementsUpdated(Ljava/util/Map;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 60
    .line 61
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getHandledPurchasesCache$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$handlePurchases$1$1;->$purchase:Lcom/android/billingclient/api/Purchase;

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;->saveHandledPurchase(Lcom/android/billingclient/api/Purchase;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method
