.class public final synthetic Lcom/qonversion/android/sdk/internal/billing/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/billingclient/api/PurchaseHistoryResponseListener;
.implements Lcom/android/billingclient/api/AcknowledgePurchaseResponseListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/qonversion/android/sdk/internal/billing/d;->a:I

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/d;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/d;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAcknowledgePurchaseResponse(Lcom/android/billingclient/api/BillingResult;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/d;->c:Ljava/lang/Object;

    check-cast v1, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;

    invoke-static {v1, p1, v0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$acknowledge$1;->a(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;Lcom/android/billingclient/api/BillingResult;Ljava/lang/String;)V

    return-void
.end method

.method public onPurchaseHistoryResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/qonversion/android/sdk/internal/billing/d;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/d;->b:Ljava/lang/Object;

    check-cast v0, Ltf/p;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/d;->c:Ljava/lang/Object;

    check-cast v1, Lcom/android/billingclient/api/SkuDetails;

    invoke-static {v0, v1, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistoryForProduct$1;->a(Ltf/p;Lcom/android/billingclient/api/SkuDetails;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/d;->b:Ljava/lang/Object;

    check-cast v0, Ltf/p;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/d;->c:Ljava/lang/Object;

    check-cast v1, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    invoke-static {v0, v1, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistoryForProduct$1;->a(Ltf/p;Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
