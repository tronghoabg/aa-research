.class public final Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getLaunchCallback(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;
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
        "com/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1",
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
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1
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
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$setLaunchError$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 12
    .line 13
    invoke-static {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$handlePendingRequests(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$loadStoreProductsIfPossible(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public onSuccess(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V
    .locals 3
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
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$updateLaunchResult(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$setLaunchError$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-static {v0, v1, v2, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePendingRequests$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 24
    .line 25
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$loadStoreProductsIfPossible(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 29
    .line 30
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getProcessingPurchases$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Ljava/util/Collection;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 43
    .line 44
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getHandledPurchasesCache$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 49
    .line 50
    invoke-static {v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getProcessingPurchases$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Ljava/util/Collection;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;->saveHandledPurchases(Ljava/util/Collection;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 66
    .line 67
    invoke-static {v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getProcessingPurchases$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Ljava/lang/Iterable;

    .line 72
    .line 73
    invoke-static {v1}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->consumePurchases(Ljava/util/List;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 81
    .line 82
    sget-object v1, Lff/v;->a:Lff/v;

    .line 83
    .line 84
    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$setProcessingPurchases$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/List;)V

    .line 85
    .line 86
    .line 87
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 88
    .line 89
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$handleCachedPurchases(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$getLaunchCallback$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    .line 93
    .line 94
    if-eqz v0, :cond_1

    .line 95
    .line 96
    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;->onSuccess(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V

    .line 97
    .line 98
    .line 99
    :cond_1
    return-void
.end method
