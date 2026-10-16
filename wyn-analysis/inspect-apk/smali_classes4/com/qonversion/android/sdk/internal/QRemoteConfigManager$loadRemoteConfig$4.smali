.class public final Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadRemoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "com/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4",
        "Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;",
        "Lef/C;",
        "onComplete",
        "()V",
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
.field final synthetic $contextKey:Ljava/lang/String;

.field final synthetic $loadingState:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;->$contextKey:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;->$loadingState:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->access$getRemoteConfigService$p(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;->$contextKey:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v2, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;

    .line 10
    .line 11
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;->$loadingState:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    .line 12
    .line 13
    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 14
    .line 15
    invoke-direct {v2, v3, v4, v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;-><init>(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;->loadRemoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
