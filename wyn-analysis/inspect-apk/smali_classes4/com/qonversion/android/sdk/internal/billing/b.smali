.class public final synthetic Lcom/qonversion/android/sdk/internal/billing/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/billingclient/api/ProductDetailsResponseListener;
.implements Lcom/android/billingclient/api/PurchasesResponseListener;
.implements Lcom/android/billingclient/api/SkuDetailsResponseListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;

.field public final synthetic c:Ltf/l;

.field public final synthetic d:Ltf/l;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;Ljava/util/List;Ltf/l;Ltf/l;I)V
    .locals 0

    .line 1
    iput p5, p0, Lcom/qonversion/android/sdk/internal/billing/b;->a:I

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/b;->b:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/b;->e:Ljava/lang/Object;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/b;->c:Ltf/l;

    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/billing/b;->d:Ltf/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;Ltf/l;Lcom/android/billingclient/api/BillingClient;Ltf/l;I)V
    .locals 0

    .line 2
    iput p5, p0, Lcom/qonversion/android/sdk/internal/billing/b;->a:I

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/b;->b:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/b;->c:Ltf/l;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/b;->e:Ljava/lang/Object;

    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/billing/b;->d:Ltf/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProductDetailsResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/b;->b:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;

    move-object v1, v0

    check-cast v1, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/b;->e:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/b;->c:Ltf/l;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/billing/b;->d:Ltf/l;

    move-object v5, p1

    move-object v6, p2

    invoke-static/range {v1 .. v6}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryProductDetailsAsync$1;->a(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Ljava/util/List;Ltf/l;Ltf/l;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method

.method public onQueryPurchasesResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 11

    .line 1
    iget v0, p0, Lcom/qonversion/android/sdk/internal/billing/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/b;->e:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/android/billingclient/api/BillingClient;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/b;->b:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;

    move-object v1, v0

    check-cast v1, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/billing/b;->c:Ltf/l;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/billing/b;->d:Ltf/l;

    move-object v5, p1

    move-object v6, p2

    invoke-static/range {v1 .. v6}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1;->b(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Ltf/l;Lcom/android/billingclient/api/BillingClient;Ltf/l;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void

    :pswitch_0
    move-object v5, p1

    move-object v6, p2

    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/b;->e:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lcom/android/billingclient/api/BillingClient;

    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/b;->b:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;

    check-cast p1, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    move-object v10, v6

    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/billing/b;->c:Ltf/l;

    iget-object v8, p0, Lcom/qonversion/android/sdk/internal/billing/b;->d:Ltf/l;

    move-object v9, v5

    move-object v5, p1

    invoke-static/range {v5 .. v10}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchases$1;->b(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Ltf/l;Lcom/android/billingclient/api/BillingClient;Ltf/l;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onSkuDetailsResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/b;->b:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;

    move-object v1, v0

    check-cast v1, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/b;->e:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/b;->c:Ltf/l;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/billing/b;->d:Ltf/l;

    move-object v5, p1

    move-object v6, p2

    invoke-static/range {v1 .. v6}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$querySkuDetailsAsync$1;->a(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Ljava/util/List;Ltf/l;Ltf/l;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method
