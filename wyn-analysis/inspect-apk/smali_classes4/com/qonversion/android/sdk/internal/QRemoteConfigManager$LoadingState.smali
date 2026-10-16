.class public final Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LoadingState"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0000\u0018\u00002\u00020\u0001B+\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;",
        "",
        "loadedConfig",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
        "callbacks",
        "",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;",
        "isInProgress",
        "",
        "(Lcom/qonversion/android/sdk/dto/QRemoteConfig;Ljava/util/List;Z)V",
        "getCallbacks",
        "()Ljava/util/List;",
        "()Z",
        "setInProgress",
        "(Z)V",
        "getLoadedConfig",
        "()Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
        "setLoadedConfig",
        "(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V",
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
.field private final callbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private isInProgress:Z

.field private loadedConfig:Lcom/qonversion/android/sdk/dto/QRemoteConfig;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;-><init>(Lcom/qonversion/android/sdk/dto/QRemoteConfig;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/dto/QRemoteConfig;Ljava/util/List;Z)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/dto/QRemoteConfig;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "callbacks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->loadedConfig:Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    .line 4
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->callbacks:Ljava/util/List;

    .line 5
    iput-boolean p3, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->isInProgress:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/qonversion/android/sdk/dto/QRemoteConfig;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 6
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/4 p3, 0x0

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;-><init>(Lcom/qonversion/android/sdk/dto/QRemoteConfig;Ljava/util/List;Z)V

    return-void
.end method


# virtual methods
.method public final getCallbacks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->callbacks:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLoadedConfig()Lcom/qonversion/android/sdk/dto/QRemoteConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->loadedConfig:Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isInProgress()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->isInProgress:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setInProgress(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->isInProgress:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setLoadedConfig(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V
    .locals 0
    .param p1    # Lcom/qonversion/android/sdk/dto/QRemoteConfig;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->loadedConfig:Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    .line 2
    .line 3
    return-void
.end method
