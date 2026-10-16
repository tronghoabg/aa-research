.class public final Lcom/qonversion/android/sdk/internal/QonversionInternal$remoteConfigList$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QonversionInternal;->remoteConfigList(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
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
        "com/qonversion/android/sdk/internal/QonversionInternal$remoteConfigList$1",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfigList;",
        "remoteConfigList",
        "Lef/C;",
        "onSuccess",
        "(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)V",
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
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QonversionInternal;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$remoteConfigList$1;->this$0:Lcom/qonversion/android/sdk/internal/QonversionInternal;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$remoteConfigList$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

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
    .locals 3
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
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$remoteConfigList$1;->this$0:Lcom/qonversion/android/sdk/internal/QonversionInternal;

    .line 7
    .line 8
    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$remoteConfigList$1$onError$1;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$remoteConfigList$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    .line 11
    .line 12
    invoke-direct {v1, v2, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$remoteConfigList$1$onError$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->access$postToMainThread(Lcom/qonversion/android/sdk/internal/QonversionInternal;Ltf/a;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)V
    .locals 3
    .param p1    # Lcom/qonversion/android/sdk/dto/QRemoteConfigList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "remoteConfigList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$remoteConfigList$1;->this$0:Lcom/qonversion/android/sdk/internal/QonversionInternal;

    .line 7
    .line 8
    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$remoteConfigList$1$onSuccess$1;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$remoteConfigList$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    .line 11
    .line 12
    invoke-direct {v1, v2, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$remoteConfigList$1$onSuccess$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->access$postToMainThread(Lcom/qonversion/android/sdk/internal/QonversionInternal;Ltf/a;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
