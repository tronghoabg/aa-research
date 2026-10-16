.class public final Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H\u0007J\u0008\u0010\u0007\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;",
        "",
        "view",
        "Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;",
        "(Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;)V",
        "provideScreenProcessor",
        "Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;",
        "provideScreenView",
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
.field private final view:Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;)V
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "view"

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
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;->view:Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final provideScreenProcessor()Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ActivityScope;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final provideScreenView()Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ActivityScope;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;->view:Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    .line 2
    .line 3
    return-object v0
.end method
