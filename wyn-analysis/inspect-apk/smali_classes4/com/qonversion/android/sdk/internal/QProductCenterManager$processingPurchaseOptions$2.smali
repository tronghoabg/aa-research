.class final Lcom/qonversion/android/sdk/internal/QProductCenterManager$processingPurchaseOptions$2;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QProductCenterManager;-><init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;Lcom/qonversion/android/sdk/internal/services/QUserInfoService;Lcom/qonversion/android/sdk/internal/QIdentityManager;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n;",
        "Ltf/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "",
        "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processingPurchaseOptions$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processingPurchaseOptions$2;->invoke()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processingPurchaseOptions$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getPurchasesCache$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;->loadProcessingPurchasesOptions()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lff/A;->a0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    return-object v0
.end method
