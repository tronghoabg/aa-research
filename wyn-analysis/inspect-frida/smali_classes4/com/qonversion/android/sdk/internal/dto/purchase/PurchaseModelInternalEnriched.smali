.class public final Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;
.super Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B3\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0002\u0010\rR\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;",
        "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;",
        "purchaseModel",
        "product",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "(Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/dto/products/QProduct;)V",
        "productId",
        "",
        "oldProduct",
        "updatePolicy",
        "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;",
        "options",
        "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
        "(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V",
        "getOldProduct",
        "()Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "getProduct",
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
.field private final oldProduct:Lcom/qonversion/android/sdk/dto/products/QProduct;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final product:Lcom/qonversion/android/sdk/dto/products/QProduct;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;Lcom/qonversion/android/sdk/dto/products/QProduct;)V
    .locals 7
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/dto/products/QProduct;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "purchaseModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "product"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->getProductId()Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->getOptions()Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;->getOldProduct$sdk_release()Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object v0

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 6
    :goto_1
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->getUpdatePolicy()Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    move-result-object v5

    .line 7
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->getOptions()Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    move-result-object v6

    move-object v1, p0

    move-object v3, p2

    .line 8
    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;-><init>(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/dto/products/QProduct;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/dto/products/QProduct;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/qonversion/android/sdk/dto/QPurchaseOptions;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "productId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "product"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    .line 1
    invoke-virtual {p3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0, p4, p5}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V

    .line 2
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->product:Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 3
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->oldProduct:Lcom/qonversion/android/sdk/dto/products/QProduct;

    return-void
.end method


# virtual methods
.method public final getOldProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->oldProduct:Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->product:Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 2
    .line 3
    return-object v0
.end method
