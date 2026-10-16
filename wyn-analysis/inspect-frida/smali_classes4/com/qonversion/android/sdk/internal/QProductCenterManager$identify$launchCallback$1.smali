.class public final Lcom/qonversion/android/sdk/internal/QProductCenterManager$identify$launchCallback$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QProductCenterManager;->identify(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "com/qonversion/android/sdk/internal/QProductCenterManager$identify$launchCallback$1",
        "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
        "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
        "launchResult",
        "Lef/C;",
        "onSuccess",
        "(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "error",
        "onError",
        "(Lcom/qonversion/android/sdk/dto/QonversionError;)V",
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
.field final synthetic $identityId:Ljava/lang/String;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$identify$launchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$identify$launchCallback$1;->$identityId:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 2
    .param p1    # Lcom/qonversion/android/sdk/dto/QonversionError;
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
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$identify$launchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$setProcessingPartnersIdentityId$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$identify$launchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getRemoteConfigManager$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->userChangingRequestFailedWithError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$identify$launchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 22
    .line 23
    invoke-static {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$executeEntitlementsBlock(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public onSuccess(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "launchResult"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$identify$launchCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$identify$launchCallback$1;->$identityId:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$processIdentity(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
