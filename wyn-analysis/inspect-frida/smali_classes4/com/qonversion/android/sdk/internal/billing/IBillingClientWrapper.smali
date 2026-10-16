.class public interface abstract Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper$DefaultImpls;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<StoreId:",
        "Ljava/lang/Object;",
        "StoreData:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008`\u0018\u0000*\u0006\u0008\u0000\u0010\u0001 \u0000*\u0006\u0008\u0001\u0010\u0002 \u00012\u00020\u0003J?\u0010\u000c\u001a\u00020\u00082\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\nH&\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000e\u001a\u00028\u0000H&\u00a2\u0006\u0004\u0008\u000f\u0010\u0010JS\u0010\u001b\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H&\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ3\u0010!\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u00132\u001a\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\u00080\u001dH&\u00a2\u0006\u0004\u0008!\u0010\"J9\u0010%\u001a\u00020\u00082\u0006\u0010$\u001a\u00020#2 \u0010 \u001a\u001c\u0012\u0004\u0012\u00020\u001e\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00080\u001dH&\u00a2\u0006\u0004\u0008%\u0010&J=\u0010(\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0018\u0010 \u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\'0\u0004\u0012\u0004\u0012\u00020\u00080\u0006H&\u00a2\u0006\u0004\u0008(\u0010)J\u0017\u0010+\u001a\u00020\u00082\u0006\u0010*\u001a\u00020\u0015H&\u00a2\u0006\u0004\u0008+\u0010,J\u0017\u0010-\u001a\u00020\u00082\u0006\u0010*\u001a\u00020\u0015H&\u00a2\u0006\u0004\u0008-\u0010,J?\u0010/\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u00152\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00080\u0006H&\u00a2\u0006\u0004\u0008/\u00100\u00a8\u00061"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;",
        "StoreId",
        "StoreData",
        "",
        "",
        "storeIds",
        "Lkotlin/Function1;",
        "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
        "Lef/C;",
        "onFailed",
        "Lkotlin/Function0;",
        "onReady",
        "withStoreDataLoaded",
        "(Ljava/util/List;Ltf/l;Ltf/a;)V",
        "storeId",
        "getStoreData",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "Landroid/app/Activity;",
        "activity",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "product",
        "",
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
        "productType",
        "queryPurchaseHistory",
        "(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ltf/p;)V",
        "Lcom/android/billingclient/api/Purchase;",
        "queryPurchases",
        "(Ltf/l;Ltf/l;)V",
        "purchaseToken",
        "consume",
        "(Ljava/lang/String;)V",
        "acknowledge",
        "onSuccess",
        "getStoreProductType",
        "(Ljava/lang/String;Ltf/l;Ltf/l;)V",
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


# virtual methods
.method public abstract acknowledge(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract consume(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract getStoreData(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TStoreId;)TStoreData;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getStoreProductType(Ljava/lang/String;Ltf/l;Ltf/l;)V
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
.end method

.method public abstract makePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;Ltf/l;)V
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
.end method

.method public abstract queryPurchaseHistory(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ltf/p;)V
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
.end method

.method public abstract queryPurchaseHistoryForProduct(Lcom/qonversion/android/sdk/dto/products/QProduct;Ltf/p;)V
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
.end method

.method public abstract queryPurchases(Ltf/l;Ltf/l;)V
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
.end method

.method public abstract withStoreDataLoaded(Ljava/util/List;Ltf/l;Ltf/a;)V
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
            "+TStoreId;>;",
            "Ltf/l;",
            "Ltf/a;",
            ")V"
        }
    .end annotation
.end method
