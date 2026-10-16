.class public final Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/billingclient/api/PurchasesUpdatedListener;
.implements Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;
.implements Lcom/qonversion/android/sdk/internal/billing/BillingService;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;,
        Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001hBA\u0008\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013JK\u0010\u001c\u001a\u00020\u00192\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0018\u0010\u001b\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00190\u0017H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u00192\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008$\u0010%J\u001d\u0010(\u001a\u00020\u00192\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020&0\u0014H\u0016\u00a2\u0006\u0004\u0008(\u0010\u001fJ\u001d\u0010+\u001a\u00020\u00192\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020)0\u0014H\u0016\u00a2\u0006\u0004\u0008+\u0010\u001fJ=\u0010-\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0018\u0010,\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020)0\u0014\u0012\u0004\u0012\u00020\u00190\u0017H\u0016\u00a2\u0006\u0004\u0008-\u0010.J=\u0010/\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0018\u0010,\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020&0\u0014\u0012\u0004\u0012\u00020\u00190\u0017H\u0016\u00a2\u0006\u0004\u0008/\u0010.J?\u00104\u001a\u00020\u00192\u0006\u00101\u001a\u0002002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00190\u0017H\u0016\u00a2\u0006\u0004\u00084\u00105J\'\u00108\u001a\u00020\u00192\u0006\u00107\u001a\u0002062\u000e\u0010\'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0014H\u0016\u00a2\u0006\u0004\u00088\u00109J\u000f\u0010:\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008:\u0010;J\u0017\u0010=\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008=\u0010>JE\u0010E\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 2\u0006\u0010?\u001a\u00020\u00152\u0008\u0010@\u001a\u0004\u0018\u0001002\u0008\u0010A\u001a\u0004\u0018\u00010\n2\u0006\u0010B\u001a\u00020\u00152\u0008\u0010D\u001a\u0004\u0018\u00010CH\u0002\u00a2\u0006\u0004\u0008E\u0010FJ?\u0010I\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 2\u0006\u0010?\u001a\u00020\u00152\u0008\u0010@\u001a\u0004\u0018\u0001002\u0008\u0010A\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010H\u001a\u0004\u0018\u00010GH\u0002\u00a2\u0006\u0004\u0008I\u0010JJ\u0017\u0010L\u001a\u00020\u00192\u0006\u0010K\u001a\u000200H\u0002\u00a2\u0006\u0004\u0008L\u0010MJ\u0017\u0010N\u001a\u00020\u00192\u0006\u0010K\u001a\u000200H\u0002\u00a2\u0006\u0004\u0008N\u0010MJE\u0010R\u001a\u00020\u00192\u0006\u0010O\u001a\u0002022\u0018\u0010P\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020)0\u0014\u0012\u0004\u0012\u00020\u00190\u00172\u0012\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0002\u00a2\u0006\u0004\u0008R\u0010SJ+\u0010U\u001a\u0008\u0012\u0004\u0012\u00020)0\u00142\u0006\u0010O\u001a\u0002022\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020T0\u0014H\u0002\u00a2\u0006\u0004\u0008U\u0010VJ%\u0010X\u001a\u00020\u00192\u0014\u0010W\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0002\u00a2\u0006\u0004\u0008X\u0010YJ\u000f\u0010Z\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008Z\u0010;J!\u0010\\\u001a\u000c\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010[2\u0006\u0010?\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\\\u0010]R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010^R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010_R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010`R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010aR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010cR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010dR(\u0010f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00190\u00170e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008f\u0010g\u00a8\u0006i"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;",
        "Lcom/android/billingclient/api/PurchasesUpdatedListener;",
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;",
        "Lcom/qonversion/android/sdk/internal/billing/BillingService;",
        "Landroid/os/Handler;",
        "mainHandler",
        "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;",
        "purchasesListener",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "logger",
        "",
        "isAnalyticsMode",
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;",
        "billingClientHolder",
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;",
        "billingClientWrapper",
        "Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;",
        "legacyBillingClientWrapper",
        "<init>",
        "(Landroid/os/Handler;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;Lcom/qonversion/android/sdk/internal/logger/Logger;ZLcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;)V",
        "",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "products",
        "Lkotlin/Function1;",
        "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
        "Lef/C;",
        "onFailed",
        "onEnriched",
        "enrichStoreDataAsync",
        "(Ljava/util/List;Ltf/l;Ltf/l;)V",
        "enrichStoreData",
        "(Ljava/util/List;)V",
        "Landroid/app/Activity;",
        "activity",
        "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;",
        "purchaseModel",
        "purchase",
        "(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;)V",
        "Lcom/android/billingclient/api/Purchase;",
        "purchases",
        "consumePurchases",
        "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
        "historyRecords",
        "consumeHistoryRecords",
        "onCompleted",
        "queryPurchasesHistory",
        "(Ltf/l;Ltf/l;)V",
        "queryPurchases",
        "",
        "storeId",
        "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
        "onSuccess",
        "getStoreProductType",
        "(Ljava/lang/String;Ltf/l;Ltf/l;)V",
        "Lcom/android/billingclient/api/BillingResult;",
        "billingResult",
        "onPurchasesUpdated",
        "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V",
        "onBillingClientConnected",
        "()V",
        "error",
        "onBillingClientUnavailable",
        "(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V",
        "product",
        "offerId",
        "applyOffer",
        "oldProduct",
        "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;",
        "updatePolicy",
        "updatePurchase",
        "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)V",
        "Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;",
        "updatePurchaseInfo",
        "makePurchase",
        "(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)V",
        "purchaseToken",
        "consume",
        "(Ljava/lang/String;)V",
        "acknowledge",
        "productType",
        "onQueryHistoryCompleted",
        "onQueryHistoryFailed",
        "queryPurchaseHistoryAsync",
        "(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ltf/l;Ltf/l;)V",
        "Lcom/android/billingclient/api/PurchaseHistoryRecord;",
        "getPurchaseHistoryFromHistoryRecords",
        "(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ljava/util/List;)Ljava/util/List;",
        "request",
        "executeOnMainThread",
        "(Ltf/l;)V",
        "executeRequestsFromQueue",
        "Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;",
        "chooseBillingClientWrapperForProductPurchase",
        "(Lcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;",
        "Landroid/os/Handler;",
        "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "Z",
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;",
        "Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;",
        "Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;",
        "Ljava/util/concurrent/ConcurrentLinkedQueue;",
        "requestsQueue",
        "Ljava/util/concurrent/ConcurrentLinkedQueue;",
        "PurchasesListener",
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
.field private final billingClientHolder:Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final billingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final isAnalyticsMode:Z

.field private final legacyBillingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final logger:Lcom/qonversion/android/sdk/internal/logger/Logger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mainHandler:Landroid/os/Handler;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final purchasesListener:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final requestsQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Ltf/l;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;Lcom/qonversion/android/sdk/internal/logger/Logger;ZLcom/qonversion/android/sdk/internal/billing/BillingClientHolder;Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;)V
    .locals 1
    .param p1    # Landroid/os/Handler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/logger/Logger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "mainHandler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "purchasesListener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "logger"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "billingClientHolder"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "billingClientWrapper"

    .line 22
    .line 23
    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "legacyBillingClientWrapper"

    .line 27
    .line 28
    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->mainHandler:Landroid/os/Handler;

    .line 35
    .line 36
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->purchasesListener:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;

    .line 37
    .line 38
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 39
    .line 40
    iput-boolean p4, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->isAnalyticsMode:Z

    .line 41
    .line 42
    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->billingClientHolder:Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    .line 43
    .line 44
    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->billingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    .line 45
    .line 46
    iput-object p7, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->legacyBillingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    .line 47
    .line 48
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->requestsQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 54
    .line 55
    invoke-virtual {p5, p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->subscribeOnPurchasesUpdates(Lcom/android/billingclient/api/PurchasesUpdatedListener;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public static synthetic a(Ltf/l;Lcom/qonversion/android/sdk/internal/billing/BillingError;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->onBillingClientUnavailable$lambda$17$lambda$16$lambda$15(Ltf/l;Lcom/qonversion/android/sdk/internal/billing/BillingError;)V

    return-void
.end method

.method public static final synthetic access$acknowledge(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->acknowledge(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$chooseBillingClientWrapperForProductPurchase(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->chooseBillingClientWrapperForProductPurchase(Lcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$consume(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->consume(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$enrichStoreDataAsync$fetchProductDetails(Ljava/util/List;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ltf/l;Ltf/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->enrichStoreDataAsync$fetchProductDetails(Ljava/util/List;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ltf/l;Ltf/l;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getBillingClientWrapper$p(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->billingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getLegacyBillingClientWrapper$p(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->legacyBillingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)Lcom/qonversion/android/sdk/internal/logger/Logger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getPurchaseHistoryFromHistoryRecords(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->getPurchaseHistoryFromHistoryRecords(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ljava/util/List;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getPurchasesListener$p(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->purchasesListener:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$makePurchase(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->makePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$purchase$handlePurchase(Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->purchase$handlePurchase(Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$queryPurchaseHistoryAsync(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ltf/l;Ltf/l;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->queryPurchaseHistoryAsync(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ltf/l;Ltf/l;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$queryPurchasesHistory$fireOnFailed(Ltf/l;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/internal/billing/BillingError;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->queryPurchasesHistory$fireOnFailed(Ltf/l;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/internal/billing/BillingError;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final acknowledge(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "acknowledge() -> Acknowledging purchase with token "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$acknowledge$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$acknowledge$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->executeOnMainThread(Ltf/l;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static synthetic b(Ltf/l;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->executeRequestsFromQueue$lambda$14$lambda$13$lambda$12(Ltf/l;)V

    return-void
.end method

.method private final chooseBillingClientWrapperForProductPurchase(Lcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ")",
            "Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper<",
            "**>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreDetails()Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getBasePlanID()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isInApp()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    :cond_0
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->billingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_1
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getSkuDetail()Lcom/android/billingclient/api/SkuDetails;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->legacyBillingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_2
    const/4 p1, 0x0

    .line 32
    return-object p1
.end method

.method private final consume(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "consume() -> Consuming purchase with token "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consume$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consume$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->executeOnMainThread(Ltf/l;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private static final enrichStoreDataAsync$fetchProductDetails(Ljava/util/List;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ltf/l;Ltf/l;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;",
            "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Ljava/lang/Iterable;

    .line 3
    .line 4
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    move-object v3, v2

    .line 24
    check-cast v3, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 25
    .line 26
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    const/16 v2, 0xa

    .line 39
    .line 40
    invoke-static {v1, v2}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 62
    .line 63
    new-instance v3, Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;

    .line 64
    .line 65
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getBasePlanID()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    const/4 v7, 0x4

    .line 77
    const/4 v8, 0x0

    .line 78
    const/4 v6, 0x0

    .line 79
    invoke-direct/range {v3 .. v8}, Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    iget-object v1, p1, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->billingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    .line 87
    .line 88
    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$fetchProductDetails$1;

    .line 89
    .line 90
    invoke-direct {v2, p1, p0, p3}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$fetchProductDetails$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ljava/util/List;Ltf/l;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v0, p2, v2}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->withStoreDataLoaded(Ljava/util/List;Ltf/l;Ltf/a;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method private final executeOnMainThread(Ltf/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->requestsQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->billingClientHolder:Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->isConnected()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->billingClientHolder:Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->startConnection(Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder$ConnectionListener;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->executeRequestsFromQueue()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    :goto_0
    monitor-exit p0

    .line 27
    return-void

    .line 28
    :goto_1
    monitor-exit p0

    .line 29
    throw p1
.end method

.method private final executeRequestsFromQueue()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->billingClientHolder:Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;

    .line 3
    .line 4
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/billing/BillingClientHolder;->isConnected()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->requestsQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->requestsQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/AbstractQueue;->remove()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ltf/l;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->mainHandler:Landroid/os/Handler;

    .line 27
    .line 28
    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/a;

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-direct {v2, v0, v3}, Lcom/qonversion/android/sdk/internal/billing/a;-><init>(Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    monitor-exit p0

    .line 41
    return-void

    .line 42
    :goto_1
    monitor-exit p0

    .line 43
    throw v0
.end method

.method private static final executeRequestsFromQueue$lambda$14$lambda$13$lambda$12(Ltf/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method private final getPurchaseHistoryFromHistoryRecords(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/PurchaseHistoryRecord;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object p2, v2

    .line 15
    :goto_0
    const-string v1, "queryPurchaseHistoryAsync() -> purchase history for "

    .line 16
    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Iterable;

    .line 20
    .line 21
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lcom/android/billingclient/api/PurchaseHistoryRecord;

    .line 36
    .line 37
    new-instance v3, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;

    .line 38
    .line 39
    invoke-direct {v3, p1, v2}, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;-><init>(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Lcom/android/billingclient/api/PurchaseHistoryRecord;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 46
    .line 47
    invoke-static {v2}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDescription(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    new-instance v4, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v5, " is retrieved "

    .line 60
    .line 61
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-interface {v3, v2}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    sget-object v2, Lef/C;->a:Lef/C;

    .line 76
    .line 77
    :cond_2
    if-nez v2, :cond_3

    .line 78
    .line 79
    iget-object p2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 80
    .line 81
    new-instance v2, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string p1, " is empty."

    .line 90
    .line 91
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-interface {p2, p1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->release(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    return-object v0
.end method

.method private final makePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)V
    .locals 7

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v3, p1

    .line 5
    move-object v2, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    move-object v6, p5

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$makePurchase$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/dto/products/QProduct;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->executeOnMainThread(Ltf/l;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic makePurchase$default(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;ILjava/lang/Object;)V
    .locals 6

    .line 1
    and-int/lit8 p6, p6, 0x10

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const/4 p5, 0x0

    .line 6
    :cond_0
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move-object v2, p2

    .line 9
    move-object v3, p3

    .line 10
    move-object v4, p4

    .line 11
    move-object v5, p5

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->makePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private static final onBillingClientUnavailable$lambda$17$lambda$16$lambda$15(Ltf/l;Lcom/qonversion/android/sdk/internal/billing/BillingError;)V
    .locals 1

    .line 1
    const-string v0, "$error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final purchase$handlePurchase(Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;)V
    .locals 17

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getOldProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-virtual/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getOldProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getHasAnyStoreDetails(Lcom/qonversion/android/sdk/dto/products/QProduct;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    invoke-virtual/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->getOptions()Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;->getOfferId$sdk_release()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    move-object v5, v0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v5, v1

    .line 35
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->getOptions()Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;->getApplyOffer$sdk_release()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :cond_1
    move-object v6, v1

    .line 50
    invoke-virtual/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getOldProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-virtual/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->getUpdatePolicy()Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    move-object/from16 v2, p1

    .line 59
    .line 60
    move-object/from16 v3, p2

    .line 61
    .line 62
    invoke-direct/range {v2 .. v8}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->updatePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    invoke-virtual/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->getOptions()Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;->getOfferId$sdk_release()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    move-object v12, v0

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    move-object v12, v1

    .line 83
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->getOptions()Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;->getApplyOffer$sdk_release()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    :cond_4
    move-object v13, v1

    .line 98
    const/16 v15, 0x10

    .line 99
    .line 100
    const/16 v16, 0x0

    .line 101
    .line 102
    const/4 v14, 0x0

    .line 103
    move-object/from16 v9, p1

    .line 104
    .line 105
    move-object/from16 v10, p2

    .line 106
    .line 107
    invoke-static/range {v9 .. v16}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->makePurchase$default(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/internal/billing/UpdatePurchaseInfo;ILjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method private final queryPurchaseHistoryAsync(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ltf/l;Ltf/l;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 2
    .line 3
    sget-object v1, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->Companion:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType$Companion;

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v3, "queryPurchaseHistoryAsync() -> Querying purchase history for type "

    .line 8
    .line 9
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1, p3, p2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchaseHistoryAsync$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ltf/l;Ltf/l;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->executeOnMainThread(Ltf/l;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private static final queryPurchasesHistory$fireOnFailed(Ltf/l;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/qonversion/android/sdk/internal/billing/BillingError;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltf/l;",
            "Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;",
            "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p0, p2}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 5
    .line 6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v0, "queryPurchasesHistory() -> "

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p0, p1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method private final updatePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)V
    .locals 9

    .line 1
    invoke-direct {p0, p2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->chooseBillingClientWrapperForProductPurchase(Lcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;

    .line 9
    .line 10
    move-object v2, p0

    .line 11
    move-object v3, p1

    .line 12
    move-object v4, p2

    .line 13
    move-object v5, p3

    .line 14
    move-object v6, p4

    .line 15
    move-object v8, p5

    .line 16
    move-object v7, p6

    .line 17
    invoke-direct/range {v1 .. v8}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$updatePurchase$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/Boolean;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Lcom/qonversion/android/sdk/dto/products/QProduct;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v8, v1}, Lcom/qonversion/android/sdk/internal/billing/IBillingClientWrapper;->queryPurchaseHistoryForProduct(Lcom/qonversion/android/sdk/dto/products/QProduct;Ltf/p;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public consumeHistoryRecords(Ljava/util/List;)V
    .locals 4
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

    .line 1
    const-string v0, "historyRecords"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->isAnalyticsMode:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;->getType()Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sget-object v2, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    aget v1, v2, v1

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    const-string v3, "getPurchaseToken(...)"

    .line 43
    .line 44
    if-eq v1, v2, :cond_2

    .line 45
    .line 46
    const/4 v2, 0x2

    .line 47
    if-eq v1, v2, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;->getHistoryRecord()Lcom/android/billingclient/api/PurchaseHistoryRecord;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lcom/android/billingclient/api/PurchaseHistoryRecord;->getPurchaseToken()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->acknowledge(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;->getHistoryRecord()Lcom/android/billingclient/api/PurchaseHistoryRecord;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Lcom/android/billingclient/api/PurchaseHistoryRecord;->getPurchaseToken()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->consume(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    :goto_1
    return-void
.end method

.method public consumePurchases(Ljava/util/List;)V
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "purchases"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->isAnalyticsMode:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    move-object v2, v1

    .line 33
    check-cast v2, Lcom/android/billingclient/api/Purchase;

    .line 34
    .line 35
    invoke-virtual {v2}, Lcom/android/billingclient/api/Purchase;->getPurchaseState()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const/4 v3, 0x1

    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Lcom/android/billingclient/api/Purchase;

    .line 61
    .line 62
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    if-nez v1, :cond_3

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$1;

    .line 70
    .line 71
    invoke-direct {v2, p0, v1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance v3, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;

    .line 75
    .line 76
    invoke-direct {v3, p0, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$consumePurchases$2$2;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Lcom/android/billingclient/api/Purchase;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->getStoreProductType(Ljava/lang/String;Ltf/l;Ltf/l;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    :goto_2
    return-void
.end method

.method public enrichStoreData(Ljava/util/List;)V
    .locals 7
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "products"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Iterable;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->legacyBillingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Lcom/qonversion/android/sdk/internal/billing/LegacyBillingClientWrapper;->getStoreData(Ljava/lang/String;)Lcom/android/billingclient/api/SkuDetails;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->setSkuDetail(Lcom/android/billingclient/api/SkuDetails;)V

    .line 37
    .line 38
    .line 39
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getBasePlanID()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const/4 v5, 0x4

    .line 46
    const/4 v6, 0x0

    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->billingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    .line 52
    .line 53
    invoke-virtual {v2, v1}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->getStoreData(Lcom/qonversion/android/sdk/internal/dto/ProductStoreId;)Lcom/android/billingclient/api/ProductDetails;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-eqz v1, :cond_0

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->setStoreProductDetails$sdk_release(Lcom/android/billingclient/api/ProductDetails;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    return-void
.end method

.method public enrichStoreDataAsync(Ljava/util/List;Ltf/l;Ltf/l;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "products"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onFailed"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onEnriched"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, Ljava/lang/Iterable;

    .line 18
    .line 19
    instance-of v1, v0, Ljava/util/Collection;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    move-object v1, v0

    .line 24
    check-cast v1, Ljava/util/Collection;

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;

    .line 56
    .line 57
    invoke-direct {v0, p0, p2, p1, p3}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$enrichStoreDataAsync$2;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ltf/l;Ljava/util/List;Ltf/l;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->executeOnMainThread(Ltf/l;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    :goto_0
    invoke-interface {p3, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public getStoreProductType(Ljava/lang/String;Ltf/l;Ltf/l;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "storeId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onFailed"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onSuccess"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->billingClientWrapper:Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;

    .line 17
    .line 18
    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$getStoreProductType$1;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1, p3, p2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$getStoreProductType$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ljava/lang/String;Ltf/l;Ltf/l;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1, v1, p3}, Lcom/qonversion/android/sdk/internal/billing/BillingClientWrapper;->getStoreProductType(Ljava/lang/String;Ltf/l;Ltf/l;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public onBillingClientConnected()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->executeRequestsFromQueue()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onBillingClientUnavailable(Lcom/qonversion/android/sdk/internal/billing/BillingError;)V
    .locals 3
    .param p1    # Lcom/qonversion/android/sdk/internal/billing/BillingError;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->requestsQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->requestsQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/AbstractQueue;->remove()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ltf/l;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->mainHandler:Landroid/os/Handler;

    .line 24
    .line 25
    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/f;

    .line 26
    .line 27
    invoke-direct {v2, v0, p1}, Lcom/qonversion/android/sdk/internal/billing/f;-><init>(Ltf/l;Lcom/qonversion/android/sdk/internal/billing/BillingError;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    monitor-exit p0

    .line 37
    return-void

    .line 38
    :goto_1
    monitor-exit p0

    .line 39
    throw p1
.end method

.method public onPurchasesUpdated(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V
    .locals 6
    .param p1    # Lcom/android/billingclient/api/BillingResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/BillingResult;",
            "Ljava/util/List<",
            "+",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "billingResult"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->isOk(Lcom/android/billingclient/api/BillingResult;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDescription(Lcom/android/billingclient/api/BillingResult;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, "onPurchasesUpdated() -> purchases updated. "

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p1, " "

    .line 31
    .line 32
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->purchasesListener:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;

    .line 43
    .line 44
    invoke-interface {p1, p2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;->onPurchasesCompleted(Ljava/util/List;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDescription(Lcom/android/billingclient/api/BillingResult;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->purchasesListener:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;

    .line 53
    .line 54
    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/BillingError;

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-direct {v2, p1, v0}, Lcom/qonversion/android/sdk/internal/billing/BillingError;-><init>(ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    if-nez p2, :cond_1

    .line 64
    .line 65
    sget-object p1, Lff/v;->a:Lff/v;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    move-object p1, p2

    .line 69
    :goto_0
    invoke-interface {v1, v2, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$PurchasesListener;->onPurchasesFailed(Lcom/qonversion/android/sdk/internal/billing/BillingError;Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 73
    .line 74
    new-instance v1, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v2, "onPurchasesUpdated() -> failed to update purchases "

    .line 77
    .line 78
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    move-object p1, p2

    .line 92
    check-cast p1, Ljava/util/Collection;

    .line 93
    .line 94
    if-eqz p1, :cond_3

    .line 95
    .line 96
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_2

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 104
    .line 105
    move-object v0, p2

    .line 106
    check-cast v0, Ljava/lang/Iterable;

    .line 107
    .line 108
    sget-object v4, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$onPurchasesUpdated$1;->INSTANCE:Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$onPurchasesUpdated$1;

    .line 109
    .line 110
    const/4 v2, 0x0

    .line 111
    const/4 v3, 0x0

    .line 112
    const-string v1, ", "

    .line 113
    .line 114
    const/16 v5, 0x1e

    .line 115
    .line 116
    invoke-static/range {v0 .. v5}, Lff/o;->w0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltf/l;I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string v1, "Purchases: "

    .line 123
    .line 124
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-interface {p1, p2}, Lcom/qonversion/android/sdk/internal/logger/Logger;->release(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :cond_3
    :goto_1
    return-void
.end method

.method public purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;)V
    .locals 4
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "purchaseModel"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getHasAnyStoreDetails(Lcom/qonversion/android/sdk/dto/products/QProduct;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-static {p2, p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->purchase$handlePurchase(Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;->getOldProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v2, 0x2

    .line 34
    new-array v2, v2, [Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    aput-object v0, v2, v3

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    aput-object v1, v2, v0

    .line 41
    .line 42
    invoke-static {v2}, Lff/m;->s0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$purchase$1;

    .line 47
    .line 48
    invoke-direct {v1, p0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$purchase$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)V

    .line 49
    .line 50
    .line 51
    new-instance v2, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$purchase$2;

    .line 52
    .line 53
    invoke-direct {v2, p2, p0, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$purchase$2;-><init>(Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Landroid/app/Activity;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0, v1, v2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->enrichStoreDataAsync(Ljava/util/List;Ltf/l;Ltf/l;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public queryPurchases(Ltf/l;Ltf/l;)V
    .locals 2
    .param p1    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "onFailed"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onCompleted"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 12
    .line 13
    const-string v1, "queryPurchases() -> Querying purchases from cache for subs and inapp"

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchases$1;

    .line 19
    .line 20
    invoke-direct {v0, p1, p0, p2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchases$1;-><init>(Ltf/l;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ltf/l;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->executeOnMainThread(Ltf/l;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public queryPurchasesHistory(Ltf/l;Ltf/l;)V
    .locals 2
    .param p1    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ltf/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "onFailed"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onCompleted"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;->Subscription:Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;

    .line 12
    .line 13
    new-instance v1, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;

    .line 14
    .line 15
    invoke-direct {v1, p0, p2, p1}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$1;-><init>(Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;Ltf/l;Ltf/l;)V

    .line 16
    .line 17
    .line 18
    new-instance p2, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$2;

    .line 19
    .line 20
    invoke-direct {p2, p1, p0}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService$queryPurchasesHistory$2;-><init>(Ltf/l;Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0, v1, p2}, Lcom/qonversion/android/sdk/internal/billing/QonversionBillingService;->queryPurchaseHistoryAsync(Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;Ltf/l;Ltf/l;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
