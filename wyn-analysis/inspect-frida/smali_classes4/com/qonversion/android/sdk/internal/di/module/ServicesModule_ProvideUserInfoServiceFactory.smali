.class public final Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;
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
.field private final cacheStorageProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private final module:Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;

.field private final tokenStorageProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;Ldf/a;Ldf/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;",
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
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;->cacheStorageProvider:Ldf/a;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;->tokenStorageProvider:Ldf/a;

    .line 9
    .line 10
    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;Ldf/a;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;",
            "Ldf/a;",
            "Ldf/a;",
            ")",
            "Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;Ldf/a;Ldf/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static provideUserInfoService(Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/storage/TokenStorage;)Lcom/qonversion/android/sdk/internal/services/QUserInfoService;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;->provideUserInfoService(Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/storage/TokenStorage;)Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

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
.method public get()Lcom/qonversion/android/sdk/internal/services/QUserInfoService;
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;->cacheStorageProvider:Ldf/a;

    invoke-interface {v1}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;->tokenStorageProvider:Ldf/a;

    invoke-interface {v2}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/internal/storage/TokenStorage;

    invoke-static {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;->provideUserInfoService(Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/storage/TokenStorage;)Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule_ProvideUserInfoServiceFactory;->get()Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    move-result-object v0

    return-object v0
.end method
