.class public final Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QonversionInternal;->mainPurchaseCallback(Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\u00082\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ#\u0010\t\u001a\u00020\u00082\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "com/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1",
        "Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;",
        "",
        "",
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;",
        "entitlements",
        "Lcom/android/billingclient/api/Purchase;",
        "purchase",
        "Lef/C;",
        "onSuccess",
        "(Ljava/util/Map;Lcom/android/billingclient/api/Purchase;)V",
        "(Ljava/util/Map;)V",
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
.field final synthetic $purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QonversionInternal;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QonversionInternal;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;->$purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

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
    .locals 3
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
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QonversionInternal;

    .line 7
    .line 8
    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1$onError$1;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;->$purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    .line 11
    .line 12
    invoke-direct {v1, v2, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1$onError$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->access$postToMainThread(Lcom/qonversion/android/sdk/internal/QonversionInternal;Ltf/a;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public onSuccess(Ljava/util/Map;)V
    .locals 3
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;",
            ">;)V"
        }
    .end annotation

    const-string v0, "entitlements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QonversionInternal;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1$onSuccess$2;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;->$purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    invoke-direct {v1, v2, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1$onSuccess$2;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Ljava/util/Map;)V

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->access$postToMainThread(Lcom/qonversion/android/sdk/internal/QonversionInternal;Ltf/a;)V

    return-void
.end method

.method public onSuccess(Ljava/util/Map;Lcom/android/billingclient/api/Purchase;)V
    .locals 3
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/android/billingclient/api/Purchase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;",
            ">;",
            "Lcom/android/billingclient/api/Purchase;",
            ")V"
        }
    .end annotation

    const-string v0, "entitlements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "purchase"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QonversionInternal;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1$onSuccess$1;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;->$purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    invoke-direct {v1, v2, p1, p2}, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1$onSuccess$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Ljava/util/Map;Lcom/android/billingclient/api/Purchase;)V

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->access$postToMainThread(Lcom/qonversion/android/sdk/internal/QonversionInternal;Ltf/a;)V

    return-void
.end method
