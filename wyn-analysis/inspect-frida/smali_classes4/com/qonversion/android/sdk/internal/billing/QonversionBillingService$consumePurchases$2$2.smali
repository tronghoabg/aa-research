.class final Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->consumePurchases(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n;",
        "Ltf/l;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
        "productType",
        "Lef/C;",
        "invoke",
        "(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $purchase:Lcom/android/billingclient/api/Purchase;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/android/billingclient/api/Purchase;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;->$purchase:Lcom/android/billingclient/api/Purchase;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;->invoke(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;)V
    .locals 2
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "productType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const-string v1, "getPurchaseToken(...)"

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;->$purchase:Lcom/android/billingclient/api/Purchase;

    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->isAcknowledged()Z

    move-result p1

    if-nez p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;->$purchase:Lcom/android/billingclient/api/Purchase;

    invoke-virtual {v0}, Lcom/android/billingclient/api/Purchase;->getPurchaseToken()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$acknowledge(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void

    .line 5
    :cond_2
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;->this$0:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;->$purchase:Lcom/android/billingclient/api/Purchase;

    invoke-virtual {v0}, Lcom/android/billingclient/api/Purchase;->getPurchaseToken()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->access$consume(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ljava/lang/String;)V

    return-void
.end method
