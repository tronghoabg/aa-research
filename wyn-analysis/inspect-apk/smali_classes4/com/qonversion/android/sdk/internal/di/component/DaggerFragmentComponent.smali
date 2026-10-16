.class public final Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/di/component/FragmentComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;
    }
.end annotation


# instance fields
.field private final appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

.field private provideScreenProcessorProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private provideScreenViewProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;Lcom/qonversion/android/sdk/internal/di/component/AppComponent;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->initialize(Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;Lcom/qonversion/android/sdk/internal/di/component/AppComponent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;Lcom/qonversion/android/sdk/internal/di/component/AppComponent;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;-><init>(Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;Lcom/qonversion/android/sdk/internal/di/component/AppComponent;)V

    return-void
.end method

.method public static builder()Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;
    .locals 2

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method private getScreenPresenter()Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;
    .locals 3

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 4
    .line 5
    invoke-interface {v1}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->repository()Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "Cannot return null from a non-@Nullable component method"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lka/e0;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->provideScreenViewProvider:Ldf/a;

    .line 15
    .line 16
    invoke-interface {v2}, Ldf/a;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;-><init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method private initialize(Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;Lcom/qonversion/android/sdk/internal/di/component/AppComponent;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/di/module/FragmentModule_ProvideScreenViewFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;)Lcom/qonversion/android/sdk/internal/di/module/FragmentModule_ProvideScreenViewFactory;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-static {p2}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->provideScreenViewProvider:Ldf/a;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/di/module/FragmentModule_ProvideScreenProcessorFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;)Lcom/qonversion/android/sdk/internal/di/module/FragmentModule_ProvideScreenProcessorFactory;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, LTb/a;->a(Ldf/a;)Ldf/a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->provideScreenProcessorProvider:Ldf/a;

    .line 20
    .line 21
    return-void
.end method

.method private injectScreenFragment(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->automationsManager()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lka/e0;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->injectAutomationsManager(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->getScreenPresenter()Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->injectPresenter(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->provideScreenProcessorProvider:Ldf/a;

    .line 23
    .line 24
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;

    .line 29
    .line 30
    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->injectScreenProcessor(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;)V

    .line 31
    .line 32
    .line 33
    return-object p1
.end method


# virtual methods
.method public inject(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->injectScreenFragment(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;

    .line 2
    .line 3
    .line 4
    return-void
.end method
