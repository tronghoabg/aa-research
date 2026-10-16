.class public final Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u00a2\u0006\u0002\u0008\u000fR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0080.\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;",
        "",
        "()V",
        "<set-?>",
        "Lcom/qonversion/android/sdk/internal/di/component/AppComponent;",
        "appComponent",
        "getAppComponent$sdk_release",
        "()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;",
        "buildAppComponent",
        "context",
        "Landroid/app/Application;",
        "internalConfig",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "appStateProvider",
        "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
        "buildAppComponent$sdk_release",
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


# static fields
.field public static final INSTANCE:Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;-><init>()V

    sput-object v0, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->INSTANCE:Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final buildAppComponent$sdk_release(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;)Lcom/qonversion/android/sdk/internal/di/component/AppComponent;
    .locals 2
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/InternalConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "internalConfig"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "appStateProvider"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;->builder()Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Lcom/qonversion/android/sdk/internal/di/module/AppModule;

    .line 21
    .line 22
    invoke-direct {v1, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/di/module/AppModule;-><init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->appModule(Lcom/qonversion/android/sdk/internal/di/module/AppModule;)Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance p2, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    .line 30
    .line 31
    invoke-direct {p2}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p2}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->repositoryModule(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;)Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance p2, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

    .line 39
    .line 40
    invoke-direct {p2}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p2}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->managersModule(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;)Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->build()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string p2, "build(...)"

    .line 52
    .line 53
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sput-object p1, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1
.end method

.method public final getAppComponent$sdk_release()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/qonversion/android/sdk/internal/di/QDependencyInjector;->appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "appComponent"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method
