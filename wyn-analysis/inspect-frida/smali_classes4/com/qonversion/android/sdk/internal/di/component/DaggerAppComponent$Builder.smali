.class public final Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private appModule:Lcom/qonversion/android/sdk/internal/di/module/AppModule;

.field private managersModule:Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

.field private networkModule:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

.field private repositoryModule:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

.field private servicesModule:Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public appModule(Lcom/qonversion/android/sdk/internal/di/module/AppModule;)Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->appModule:Lcom/qonversion/android/sdk/internal/di/module/AppModule;

    .line 5
    .line 6
    return-object p0
.end method

.method public build()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->appModule:Lcom/qonversion/android/sdk/internal/di/module/AppModule;

    .line 2
    .line 3
    const-class v1, Lcom/qonversion/android/sdk/internal/di/module/AppModule;

    .line 4
    .line 5
    invoke-static {v1, v0}, Lka/e0;->h(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->repositoryModule:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->repositoryModule:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->networkModule:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    .line 24
    .line 25
    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->networkModule:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->managersModule:Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

    .line 35
    .line 36
    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->managersModule:Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

    .line 40
    .line 41
    :cond_2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->servicesModule:Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;

    .line 42
    .line 43
    if-nez v0, :cond_3

    .line 44
    .line 45
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;

    .line 46
    .line 47
    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->servicesModule:Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;

    .line 51
    .line 52
    :cond_3
    new-instance v1, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;

    .line 53
    .line 54
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->appModule:Lcom/qonversion/android/sdk/internal/di/module/AppModule;

    .line 55
    .line 56
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->repositoryModule:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    .line 57
    .line 58
    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->networkModule:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    .line 59
    .line 60
    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->managersModule:Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

    .line 61
    .line 62
    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->servicesModule:Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;

    .line 63
    .line 64
    const/4 v7, 0x0

    .line 65
    invoke-direct/range {v1 .. v7}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;-><init>(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;I)V

    .line 66
    .line 67
    .line 68
    return-object v1
.end method

.method public managersModule(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;)Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->managersModule:Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

    .line 5
    .line 6
    return-object p0
.end method

.method public networkModule(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;)Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->networkModule:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    .line 5
    .line 6
    return-object p0
.end method

.method public repositoryModule(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;)Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->repositoryModule:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    .line 5
    .line 6
    return-object p0
.end method

.method public servicesModule(Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;)Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->servicesModule:Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;

    .line 5
    .line 6
    return-object p0
.end method
