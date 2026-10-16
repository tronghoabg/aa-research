.class public final Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadRemoteConfigList(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
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
        "com/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$2",
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
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

.field final synthetic $contextKeys:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $includeEmptyContextKey:Z

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$2;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$2;->$contextKeys:Ljava/util/List;

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$2;->$includeEmptyContextKey:Z

    .line 6
    .line 7
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$2;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$2;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->access$getRemoteConfigService$p(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$2;->$contextKeys:Ljava/util/List;

    .line 8
    .line 9
    iget-boolean v2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$2;->$includeEmptyContextKey:Z

    .line 10
    .line 11
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$2;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 12
    .line 13
    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$2;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    .line 14
    .line 15
    invoke-static {v3, v1, v2, v4}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->access$getRemoteConfigListCallbackWrapper(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;->loadRemoteConfigs(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
