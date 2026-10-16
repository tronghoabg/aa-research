.class public interface abstract Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0008`\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J2\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\t2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00050\t2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bH&\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/converter/PurchaseConverter;",
        "",
        "convertPurchase",
        "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
        "purchase",
        "Lcom/android/billingclient/api/Purchase;",
        "options",
        "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
        "convertPurchases",
        "",
        "purchases",
        "",
        "",
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
.method public abstract convertPurchase(Lcom/android/billingclient/api/Purchase;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)Lcom/qonversion/android/sdk/internal/purchase/Purchase;
    .param p1    # Lcom/android/billingclient/api/Purchase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/dto/QPurchaseOptions;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract convertPurchases(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
