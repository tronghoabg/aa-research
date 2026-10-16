.class public final synthetic Lcom/qonversion/android/sdk/internal/billing/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/billingclient/api/PurchaseHistoryResponseListener;
.implements Lcom/android/billingclient/api/ConsumeResponseListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/qonversion/android/sdk/internal/billing/c;->a:I

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConsumeResponse(Lcom/android/billingclient/api/BillingResult;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/c;->b:Ljava/lang/Object;

    check-cast v0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;

    invoke-static {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$consume$1;->a(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;Lcom/android/billingclient/api/BillingResult;Ljava/lang/String;)V

    return-void
.end method

.method public onPurchaseHistoryResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/qonversion/android/sdk/internal/billing/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/c;->b:Ljava/lang/Object;

    check-cast v0, Ltf/p;

    invoke-static {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchaseHistory$1;->a(Ltf/p;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/c;->b:Ljava/lang/Object;

    check-cast v0, Ltf/p;

    invoke-static {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchaseHistory$1;->a(Ltf/p;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
