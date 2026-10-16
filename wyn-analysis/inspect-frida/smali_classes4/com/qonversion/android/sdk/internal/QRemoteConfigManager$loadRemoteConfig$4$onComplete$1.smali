.class public final Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;->onComplete()V
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
        "com/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
        "remoteConfig",
        "Lef/C;",
        "onSuccess",
        "(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V",
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
.field final synthetic $contextKey:Ljava/lang/String;

.field final synthetic $loadingState:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->$loadingState:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->$contextKey:Ljava/lang/String;

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
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/UtilsKt;->getShouldFireFallback(Lcom/qonversion/android/sdk/dto/QonversionError;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->$contextKey:Ljava/lang/String;

    .line 15
    .line 16
    new-instance v2, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onError$1;

    .line 17
    .line 18
    invoke-direct {v2, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onError$1;-><init>(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->access$fireToCallbacks(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/lang/String;Ltf/l;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 26
    .line 27
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->access$getFallbackData(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)Lcom/qonversion/android/sdk/dto/QFallbackObject;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_5

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QFallbackObject;->getRemoteConfigList()Lcom/qonversion/android/sdk/dto/QRemoteConfigList;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->$contextKey:Ljava/lang/String;

    .line 41
    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->getRemoteConfigForEmptyContextKey()Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->remoteConfigForContextKey(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :goto_0
    if-eqz v0, :cond_3

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    .line 56
    .line 57
    .line 58
    sget-object v0, Lef/C;->a:Lef/C;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    const/4 v0, 0x0

    .line 62
    :goto_1
    if-nez v0, :cond_4

    .line 63
    .line 64
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 65
    .line 66
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->$contextKey:Ljava/lang/String;

    .line 67
    .line 68
    new-instance v2, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onError$3;

    .line 69
    .line 70
    invoke-direct {v2, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onError$3;-><init>(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->access$fireToCallbacks(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/lang/String;Ltf/l;)V

    .line 74
    .line 75
    .line 76
    :cond_4
    return-void

    .line 77
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 78
    .line 79
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->$contextKey:Ljava/lang/String;

    .line 80
    .line 81
    new-instance v2, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onError$baseRemoteConfigList$1$1;

    .line 82
    .line 83
    invoke-direct {v2, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onError$baseRemoteConfigList$1$1;-><init>(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->access$fireToCallbacks(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/lang/String;Ltf/l;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V
    .locals 3
    .param p1    # Lcom/qonversion/android/sdk/dto/QRemoteConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "remoteConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->$loadingState:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->setLoadedConfig(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->$contextKey:Ljava/lang/String;

    .line 14
    .line 15
    new-instance v2, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onSuccess$1;

    .line 16
    .line 17
    invoke-direct {v2, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onSuccess$1;-><init>(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->access$fireToCallbacks(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/lang/String;Ltf/l;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
