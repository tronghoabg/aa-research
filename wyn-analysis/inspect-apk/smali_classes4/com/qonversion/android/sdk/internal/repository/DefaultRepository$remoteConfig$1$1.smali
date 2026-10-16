.class final Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1;->invoke(Lcom/qonversion/android/sdk/internal/CallBackKt;)V
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lzg/Q;",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
        "it",
        "Lef/C;",
        "invoke",
        "(Lzg/Q;)V",
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
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lzg/Q;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1$1;->invoke(Lzg/Q;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Lzg/Q;)V
    .locals 6
    .param p1    # Lzg/Q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzg/Q<",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
            ">;)V"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$getLogger$p(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;)Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object v0

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    invoke-static {v1, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$getLogMessage(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lzg/Q;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "remoteConfigRequest - "

    .line 3
    invoke-static {v2, v1, v0}, Lcom/google/android/gms/internal/consent_sdk/a;->z(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    .line 4
    iget-object v0, p1, Lzg/Q;->b:Ljava/lang/Object;

    check-cast v0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    if-nez v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    invoke-static {v1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$getErrorMapper$p(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;)Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getErrorFromResponse(Lzg/Q;)Lcom/qonversion/android/sdk/dto/QonversionError;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->isCorrect$sdk_release()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;

    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;->onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    return-void

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;

    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionError;

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->RemoteConfigurationNotAvailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void
.end method
