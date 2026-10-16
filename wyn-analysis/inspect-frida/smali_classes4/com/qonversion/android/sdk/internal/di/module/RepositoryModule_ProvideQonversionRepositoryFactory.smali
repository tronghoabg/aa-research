.class public final Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldf/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldf/a;"
    }
.end annotation


# instance fields
.field private final apiErrorMapperProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private final configProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private final delayCalculatorProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private final environmentProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private final loggerProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private final module:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

.field private final retrofitProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ldf/a;Ldf/a;Ldf/a;Ldf/a;Ldf/a;Ldf/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;",
            "Ldf/a;",
            "Ldf/a;",
            "Ldf/a;",
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
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->retrofitProvider:Ldf/a;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->environmentProvider:Ldf/a;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->configProvider:Ldf/a;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->loggerProvider:Ldf/a;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->apiErrorMapperProvider:Ldf/a;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->delayCalculatorProvider:Ldf/a;

    .line 17
    .line 18
    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ldf/a;Ldf/a;Ldf/a;Ldf/a;Ldf/a;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;",
            "Ldf/a;",
            "Ldf/a;",
            "Ldf/a;",
            "Ldf/a;",
            "Ldf/a;",
            "Ldf/a;",
            ")",
            "Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    move-object v6, p5

    .line 9
    move-object v7, p6

    .line 10
    invoke-direct/range {v0 .. v7}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ldf/a;Ldf/a;Ldf/a;Ldf/a;Ldf/a;Ldf/a;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static provideQonversionRepository(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Lzg/T;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;)Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;->provideQonversionRepository(Lzg/T;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;)Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 6
    .line 7
    invoke-static {p0, p1}, Lka/e0;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;
    .locals 7

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->retrofitProvider:Ldf/a;

    invoke-interface {v1}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzg/T;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->environmentProvider:Ldf/a;

    invoke-interface {v2}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->configProvider:Ldf/a;

    invoke-interface {v3}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/internal/InternalConfig;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->loggerProvider:Ldf/a;

    invoke-interface {v4}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/qonversion/android/sdk/internal/logger/Logger;

    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->apiErrorMapperProvider:Ldf/a;

    invoke-interface {v5}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->delayCalculatorProvider:Ldf/a;

    invoke-interface {v6}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;

    invoke-static/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->provideQonversionRepository(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Lzg/T;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;)Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->get()Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    move-result-object v0

    return-object v0
.end method
