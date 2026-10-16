.class public final Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LSb/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LSb/a;"
    }
.end annotation


# instance fields
.field private final automationsManagerProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private final presenterProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private final screenProcessorProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldf/a;Ldf/a;Ldf/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldf/a;",
            "Ldf/a;",
            "Ldf/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->automationsManagerProvider:Ldf/a;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->presenterProvider:Ldf/a;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->screenProcessorProvider:Ldf/a;

    .line 9
    .line 10
    return-void
.end method

.method public static create(Ldf/a;Ldf/a;Ldf/a;)LSb/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldf/a;",
            "Ldf/a;",
            "Ldf/a;",
            ")",
            "LSb/a;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;-><init>(Ldf/a;Ldf/a;Ldf/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static injectAutomationsManager(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->automationsManager:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 2
    .line 3
    return-void
.end method

.method public static injectPresenter(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->presenter:Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    .line 2
    .line 3
    return-void
.end method

.method public static injectScreenProcessor(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->screenProcessor:Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->automationsManagerProvider:Ldf/a;

    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->injectAutomationsManager(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)V

    .line 3
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->presenterProvider:Ldf/a;

    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->injectPresenter(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;)V

    .line 4
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->screenProcessorProvider:Ldf/a;

    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->injectScreenProcessor(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->injectMembers(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)V

    return-void
.end method
