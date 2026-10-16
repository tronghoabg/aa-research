.class public final Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;
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
.field private final module:Lcom/qonversion/android/sdk/internal/di/module/AppModule;

.field private final sharedPreferencesProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Ldf/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/AppModule;",
            "Ldf/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/AppModule;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;->sharedPreferencesProvider:Ldf/a;

    .line 7
    .line 8
    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/AppModule;",
            "Ldf/a;",
            ")",
            "Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Ldf/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static providePurchasesCache(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;)Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/di/module/AppModule;->providePurchasesCache(Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;)Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

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
.method public get()Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/AppModule;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;->sharedPreferencesProvider:Ldf/a;

    invoke-interface {v1}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;->providePurchasesCache(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;)Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;->get()Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    move-result-object v0

    return-object v0
.end method
