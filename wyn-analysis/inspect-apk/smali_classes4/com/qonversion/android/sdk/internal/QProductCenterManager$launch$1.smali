.class public final Lcom/qonversion/android/sdk/internal/QProductCenterManager$launch$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/AdvertisingProvider$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launch(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "com/qonversion/android/sdk/internal/QProductCenterManager$launch$1",
        "Lcom/qonversion/android/sdk/internal/AdvertisingProvider$Callback;",
        "",
        "advertisingId",
        "Lef/C;",
        "onSuccess",
        "(Ljava/lang/String;)V",
        "",
        "t",
        "onFailure",
        "(Ljava/lang/Throwable;)V",
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
.field final synthetic $launchCallback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

.field final synthetic $requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$launch$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$launch$1;->$launchCallback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$launch$1;->$requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "t"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$launch$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$launch$1;->$launchCallback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$launch$1;->$requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 11
    .line 12
    invoke-static {p1, v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$continueLaunchWithPurchasesInfo(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public onSuccess(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "advertisingId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$launch$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$setAdvertisingID$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$launch$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$launch$1;->$launchCallback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$launch$1;->$requestTrigger:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 16
    .line 17
    invoke-static {p1, v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$continueLaunchWithPurchasesInfo(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
