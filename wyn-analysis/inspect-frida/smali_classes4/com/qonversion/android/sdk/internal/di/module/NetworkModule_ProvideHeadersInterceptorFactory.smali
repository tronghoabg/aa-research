.class public final Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;
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
.field private final apiHeadersProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private final apiHelperProvider:Ldf/a;
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

.field private final module:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ldf/a;Ldf/a;Ldf/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;",
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
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->apiHeadersProvider:Ldf/a;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->configProvider:Ldf/a;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->apiHelperProvider:Ldf/a;

    .line 11
    .line 12
    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ldf/a;Ldf/a;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;",
            "Ldf/a;",
            "Ldf/a;",
            "Ldf/a;",
            ")",
            "Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ldf/a;Ldf/a;Ldf/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static provideHeadersInterceptor(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHelper;)Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;->provideHeadersInterceptor(Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHelper;)Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;

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
.method public get()Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->apiHeadersProvider:Ldf/a;

    invoke-interface {v1}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->configProvider:Ldf/a;

    invoke-interface {v2}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/internal/InternalConfig;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->apiHelperProvider:Ldf/a;

    invoke-interface {v3}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/internal/api/ApiHelper;

    invoke-static {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->provideHeadersInterceptor(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHelper;)Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->get()Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;

    move-result-object v0

    return-object v0
.end method
