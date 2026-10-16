.class public final Lcom/qonversion/android/sdk/internal/QAttributionManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0000\u0018\u00002\u00020\u0001B\u0019\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ)\u0010\u0010\u001a\u00020\u00082\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R$\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/QAttributionManager;",
        "",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "repository",
        "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
        "appStateProvider",
        "<init>",
        "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;)V",
        "Lef/C;",
        "onAppForeground",
        "()V",
        "",
        "",
        "data",
        "Lcom/qonversion/android/sdk/dto/QAttributionProvider;",
        "provider",
        "attribution",
        "(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/QAttributionProvider;)V",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
        "pendingAttributionProvider",
        "Lcom/qonversion/android/sdk/dto/QAttributionProvider;",
        "pendingData",
        "Ljava/util/Map;",
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
.field private final appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private pendingAttributionProvider:Lcom/qonversion/android/sdk/dto/QAttributionProvider;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private pendingData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/repository/QRepository;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "repository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "appStateProvider"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final attribution(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/QAttributionProvider;)V
    .locals 8
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/dto/QAttributionProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/qonversion/android/sdk/dto/QAttributionProvider;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "provider"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

    .line 12
    .line 13
    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;->getAppState()Lcom/qonversion/android/sdk/internal/AppState;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/AppState;->isBackground()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->pendingAttributionProvider:Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    .line 24
    .line 25
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->pendingData:Ljava/util/Map;

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 29
    .line 30
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/QAttributionProvider;->getId()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const/16 v6, 0xc

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    move-object v2, p1

    .line 40
    invoke-static/range {v1 .. v7}, Lcom/qonversion/android/sdk/internal/repository/QRepository$DefaultImpls;->attribution$default(Lcom/qonversion/android/sdk/internal/repository/QRepository;Ljava/util/Map;Ljava/lang/String;Ltf/a;Ltf/l;ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final onAppForeground()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->pendingAttributionProvider:Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    .line 2
    .line 3
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->pendingData:Ljava/util/Map;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-eqz v2, :cond_1

    .line 8
    .line 9
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QAttributionProvider;->getId()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const/16 v6, 0xc

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    invoke-static/range {v1 .. v7}, Lcom/qonversion/android/sdk/internal/repository/QRepository$DefaultImpls;->attribution$default(Lcom/qonversion/android/sdk/internal/repository/QRepository;Ljava/util/Map;Ljava/lang/String;Ltf/a;Ltf/l;ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->pendingData:Ljava/util/Map;

    .line 32
    .line 33
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->pendingAttributionProvider:Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    .line 34
    .line 35
    :cond_1
    :goto_0
    return-void
.end method
