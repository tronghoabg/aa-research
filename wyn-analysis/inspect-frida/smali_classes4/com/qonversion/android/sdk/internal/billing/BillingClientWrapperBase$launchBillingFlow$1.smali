.class final Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$launchBillingFlow$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->launchBillingFlow(Landroid/app/Activity;Lcom/android/billingclient/api/BillingFlowParams;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n;",
        "Ltf/l;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lcom/android/billingclient/api/BillingClient;",
        "Lef/C;",
        "invoke",
        "(Lcom/android/billingclient/api/BillingClient;)V",
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
.field final synthetic $activity:Landroid/app/Activity;

.field final synthetic $params:Lcom/android/billingclient/api/BillingFlowParams;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/android/billingclient/api/BillingFlowParams;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$launchBillingFlow$1;->$activity:Landroid/app/Activity;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$launchBillingFlow$1;->$params:Lcom/android/billingclient/api/BillingFlowParams;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$launchBillingFlow$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/android/billingclient/api/BillingClient;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$launchBillingFlow$1;->invoke(Lcom/android/billingclient/api/BillingClient;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Lcom/android/billingclient/api/BillingClient;)V
    .locals 3
    .param p1    # Lcom/android/billingclient/api/BillingClient;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "$this$withReadyClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$launchBillingFlow$1;->$activity:Landroid/app/Activity;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$launchBillingFlow$1;->$params:Lcom/android/billingclient/api/BillingFlowParams;

    invoke-virtual {p1, v0, v1}, Lcom/android/billingclient/api/BillingClient;->launchBillingFlow(Landroid/app/Activity;Lcom/android/billingclient/api/BillingFlowParams;)Lcom/android/billingclient/api/BillingResult;

    move-result-object p1

    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->isOk(Lcom/android/billingclient/api/BillingResult;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 4
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase$launchBillingFlow$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;

    .line 5
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->getLogger()Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object v0

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDescription(Lcom/android/billingclient/api/BillingResult;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "launchBillingFlow() -> Failed to launch billing flow. "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    :cond_1
    return-void
.end method
