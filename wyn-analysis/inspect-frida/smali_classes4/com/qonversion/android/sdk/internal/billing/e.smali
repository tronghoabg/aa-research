.class public final synthetic Lcom/qonversion/android/sdk/internal/billing/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/billingclient/api/PurchasesResponseListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/android/billingclient/api/BillingResult;

.field public final synthetic c:Ltf/l;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Ltf/l;

.field public final synthetic f:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;


# direct methods
.method public synthetic constructor <init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;Lcom/android/billingclient/api/BillingResult;Ltf/l;Ljava/util/List;Ltf/l;I)V
    .locals 0

    .line 1
    iput p6, p0, Lcom/qonversion/android/sdk/internal/billing/e;->a:I

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/e;->f:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/e;->b:Lcom/android/billingclient/api/BillingResult;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/e;->c:Ltf/l;

    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/billing/e;->d:Ljava/util/List;

    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/billing/e;->e:Ltf/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onQueryPurchasesResponse(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 13

    .line 1
    iget v0, p0, Lcom/qonversion/android/sdk/internal/billing/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/billing/e;->d:Ljava/util/List;

    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/billing/e;->e:Ltf/l;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/e;->f:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;

    move-object v1, v0

    check-cast v1, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/billing/e;->b:Lcom/android/billingclient/api/BillingResult;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/e;->c:Ltf/l;

    move-object v6, p1

    move-object v7, p2

    invoke-static/range {v1 .. v7}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper$queryPurchases$1;->a(Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;Lcom/android/billingclient/api/BillingResult;Ltf/l;Ljava/util/List;Ltf/l;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void

    :pswitch_0
    move-object v6, p1

    move-object v7, p2

    iget-object v9, p0, Lcom/qonversion/android/sdk/internal/billing/e;->d:Ljava/util/List;

    iget-object v10, p0, Lcom/qonversion/android/sdk/internal/billing/e;->e:Ltf/l;

    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/e;->f:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;

    check-cast p1, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    move-object v12, v7

    iget-object v7, p0, Lcom/qonversion/android/sdk/internal/billing/e;->b:Lcom/android/billingclient/api/BillingResult;

    iget-object v8, p0, Lcom/qonversion/android/sdk/internal/billing/e;->c:Ltf/l;

    move-object v11, v6

    move-object v6, p1

    invoke-static/range {v6 .. v12}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchases$1;->a(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Lcom/android/billingclient/api/BillingResult;Ltf/l;Ljava/util/List;Ltf/l;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
