.class final Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QProductCenterManager;->restore(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V
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
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
        "historyRecords",
        "Lef/C;",
        "invoke",
        "(Ljava/util/List;)V",
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
.field final synthetic $requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;->$requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;->invoke(Ljava/util/List;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 7
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;)V"
        }
    .end annotation

    const-string v0, "historyRecords"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->getBillingService()Lcom/qonversion/android/sdk/internal/billing/BillingService;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingService;->consumeHistoryRecords(Ljava/util/List;)V

    .line 3
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getRepository$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/repository/QRepository;

    move-result-object v1

    .line 4
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getInstallDate$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)J

    move-result-wide v2

    .line 5
    new-instance v5, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3$1;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-direct {v5, v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/util/List;)V

    .line 6
    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$restore$3;->$requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    move-object v4, p1

    .line 7
    invoke-interface/range {v1 .. v6}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->restore(JLjava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    return-void
.end method
