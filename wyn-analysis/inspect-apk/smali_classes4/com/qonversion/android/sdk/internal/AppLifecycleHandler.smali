.class public final Lcom/qonversion/android/sdk/internal/AppLifecycleHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/AppLifecycleHandler;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Lcom/qonversion/android/sdk/internal/LifecycleDelegate;",
        "lifecycleDelegate",
        "<init>",
        "(Lcom/qonversion/android/sdk/internal/LifecycleDelegate;)V",
        "Landroidx/lifecycle/v;",
        "owner",
        "Lef/C;",
        "onStart",
        "(Landroidx/lifecycle/v;)V",
        "onStop",
        "Lcom/qonversion/android/sdk/internal/LifecycleDelegate;",
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
.field private final lifecycleDelegate:Lcom/qonversion/android/sdk/internal/LifecycleDelegate;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/LifecycleDelegate;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/internal/LifecycleDelegate;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "lifecycleDelegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/AppLifecycleHandler;->lifecycleDelegate:Lcom/qonversion/android/sdk/internal/LifecycleDelegate;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic onCreate(Landroidx/lifecycle/v;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/v;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, LVa/M6;->c(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/v;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/v;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onPause(Landroidx/lifecycle/v;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/v;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onResume(Landroidx/lifecycle/v;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/v;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, LVa/M6;->d(Landroidx/lifecycle/v;)V

    return-void
.end method

.method public onStart(Landroidx/lifecycle/v;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/v;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/AppLifecycleHandler;->lifecycleDelegate:Lcom/qonversion/android/sdk/internal/LifecycleDelegate;

    .line 7
    .line 8
    invoke-interface {p1}, Lcom/qonversion/android/sdk/internal/LifecycleDelegate;->onAppForeground()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onStop(Landroidx/lifecycle/v;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/v;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "owner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/AppLifecycleHandler;->lifecycleDelegate:Lcom/qonversion/android/sdk/internal/LifecycleDelegate;

    .line 7
    .line 8
    invoke-interface {p1}, Lcom/qonversion/android/sdk/internal/LifecycleDelegate;->onAppBackground()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
