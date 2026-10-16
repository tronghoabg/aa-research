.class public final Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processIdentity(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "com/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1",
        "Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;",
        "",
        "qonversionUid",
        "Lef/C;",
        "onSuccess",
        "(Ljava/lang/String;)V",
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
.field final synthetic $currentUserID:Ljava/lang/String;

.field final synthetic $identityId:Ljava/lang/String;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->$currentUserID:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->$identityId:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
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
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$setProcessingPartnersIdentityId$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 13
    .line 14
    invoke-static {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$executeEntitlementsBlock(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 18
    .line 19
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getRemoteConfigManager$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->userChangingRequestFailedWithError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 27
    .line 28
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->$identityId:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$fireIdentityError(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public onSuccess(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "qonversionUid"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$setPendingPartnersIdentityId$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 13
    .line 14
    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$setProcessingPartnersIdentityId$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->$currentUserID:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    invoke-static {p1, v1, v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePendingRequests$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 32
    .line 33
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->$identityId:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$fireIdentitySuccess(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 40
    .line 41
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getInternalConfig$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/InternalConfig;->setUid(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 49
    .line 50
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getRemoteConfigManager$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->onUserUpdate()V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 58
    .line 59
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getLaunchResultCache$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->clearPermissionsCache()V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 67
    .line 68
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Identify:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    .line 69
    .line 70
    new-instance v1, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1$onSuccess$1;

    .line 71
    .line 72
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->$identityId:Ljava/lang/String;

    .line 73
    .line 74
    invoke-direct {v1, p1, v2}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1$onSuccess$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launch(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method
