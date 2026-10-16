.class final Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchases$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->queryPurchases(Ltf/l;Ltf/l;)V
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
.field final synthetic $onCompleted:Ltf/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltf/l;"
        }
    .end annotation
.end field

.field final synthetic $onFailed:Ltf/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltf/l;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Ltf/l;Ltf/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchases$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchases$1;->$onFailed:Ltf/l;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchases$1;->$onCompleted:Ltf/l;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Lcom/android/billingclient/api/BillingResult;Ltf/l;Ljava/util/List;Ltf/l;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchases$1;->invoke$lambda$3$lambda$2(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Lcom/android/billingclient/api/BillingResult;Ltf/l;Ljava/util/List;Ltf/l;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic b(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Ltf/l;Lcom/android/billingclient/api/BillingClient;Ltf/l;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchases$1;->invoke$lambda$3(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Ltf/l;Lcom/android/billingclient/api/BillingClient;Ltf/l;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V

    return-void
.end method

.method private static final invoke$lambda$3(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Ltf/l;Lcom/android/billingclient/api/BillingClient;Ltf/l;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 9

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$onFailed"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$this_withReadyClient"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$onCompleted"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "subsResult"

    .line 22
    .line 23
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "activeSubs"

    .line 27
    .line 28
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p4}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->isOk(Lcom/android/billingclient/api/BillingResult;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    const-string p2, "subscription"

    .line 38
    .line 39
    invoke-virtual {p0, p4, p2, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->handlePurchasesQueryError(Lcom/android/billingclient/api/BillingResult;Ljava/lang/String;Ltf/l;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    invoke-static {}, Lcom/android/billingclient/api/QueryPurchasesParams;->newBuilder()Lcom/android/billingclient/api/QueryPurchasesParams$Builder;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "inapp"

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/QueryPurchasesParams$Builder;->setProductType(Ljava/lang/String;)Lcom/android/billingclient/api/QueryPurchasesParams$Builder;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lcom/android/billingclient/api/QueryPurchasesParams$Builder;->build()Lcom/android/billingclient/api/QueryPurchasesParams;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-string v1, "build(...)"

    .line 58
    .line 59
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/e;

    .line 63
    .line 64
    const/4 v8, 0x0

    .line 65
    move-object v3, p0

    .line 66
    move-object v5, p1

    .line 67
    move-object v7, p3

    .line 68
    move-object v4, p4

    .line 69
    move-object v6, p5

    .line 70
    invoke-direct/range {v2 .. v8}, Lcom/qonversion/android/sdk/internal/billing/e;-><init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;Lcom/android/billingclient/api/BillingResult;Ltf/l;Ljava/util/List;Ltf/l;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2, v0, v2}, Lcom/android/billingclient/api/BillingClient;->queryPurchasesAsync(Lcom/android/billingclient/api/QueryPurchasesParams;Lcom/android/billingclient/api/PurchasesResponseListener;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method private static final invoke$lambda$3$lambda$2(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Lcom/android/billingclient/api/BillingResult;Ltf/l;Ljava/util/List;Ltf/l;Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$subsResult"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$onFailed"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$activeSubs"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "$onCompleted"

    .line 22
    .line 23
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "inAppsResult"

    .line 27
    .line 28
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "unconsumedInApp"

    .line 32
    .line 33
    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p5}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->isOk(Lcom/android/billingclient/api/BillingResult;)Z

    .line 37
    .line 38
    .line 39
    move-result p5

    .line 40
    if-nez p5, :cond_0

    .line 41
    .line 42
    const-string p3, "in-app"

    .line 43
    .line 44
    invoke-virtual {p0, p1, p3, p2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->handlePurchasesQueryError(Lcom/android/billingclient/api/BillingResult;Ljava/lang/String;Ltf/l;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    check-cast p3, Ljava/util/Collection;

    .line 49
    .line 50
    check-cast p6, Ljava/lang/Iterable;

    .line 51
    .line 52
    invoke-static {p6, p3}, Lff/o;->E0(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-interface {p4, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    const/4 p3, 0x0

    .line 64
    if-nez p2, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    move-object p1, p3

    .line 68
    :goto_0
    if-eqz p1, :cond_3

    .line 69
    .line 70
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    if-eqz p2, :cond_2

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    check-cast p2, Lcom/android/billingclient/api/Purchase;

    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->getLogger()Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 87
    .line 88
    .line 89
    move-result-object p3

    .line 90
    invoke-static {p2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-static {p2}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDescription(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    const-string p4, "queryPurchases() -> purchases cache is retrieved "

    .line 98
    .line 99
    invoke-static {p4, p2, p3}, Lcom/google/android/gms/internal/consent_sdk/a;->z(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    sget-object p3, Lef/C;->a:Lef/C;

    .line 104
    .line 105
    :cond_3
    if-nez p3, :cond_4

    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;->getLogger()Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    const-string p1, "queryPurchases() -> purchases cache is empty."

    .line 112
    .line 113
    invoke-interface {p0, p1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->release(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :cond_4
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/android/billingclient/api/BillingClient;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchases$1;->invoke(Lcom/android/billingclient/api/BillingClient;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Lcom/android/billingclient/api/BillingClient;)V
    .locals 8
    .param p1    # Lcom/android/billingclient/api/BillingClient;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "$this$withReadyClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/android/billingclient/api/QueryPurchasesParams;->newBuilder()Lcom/android/billingclient/api/QueryPurchasesParams$Builder;

    move-result-object v0

    .line 3
    const-string v1, "subs"

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/QueryPurchasesParams$Builder;->setProductType(Ljava/lang/String;)Lcom/android/billingclient/api/QueryPurchasesParams$Builder;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/android/billingclient/api/QueryPurchasesParams$Builder;->build()Lcom/android/billingclient/api/QueryPurchasesParams;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchases$1;->this$0:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchases$1;->$onFailed:Ltf/l;

    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper$queryPurchases$1;->$onCompleted:Ltf/l;

    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/b;

    const/4 v7, 0x1

    move-object v5, p1

    invoke-direct/range {v2 .. v7}, Lcom/qonversion/android/sdk/internal/billing/b;-><init>(Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapperBase;Ltf/l;Lcom/android/billingclient/api/BillingClient;Ltf/l;I)V

    invoke-virtual {v5, v0, v2}, Lcom/android/billingclient/api/BillingClient;->queryPurchasesAsync(Lcom/android/billingclient/api/QueryPurchasesParams;Lcom/android/billingclient/api/PurchasesResponseListener;)V

    return-void
.end method
