.class public final Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;
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
.field private final clientProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private final internalConfigProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private final module:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

.field private final moshiProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field


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
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->clientProvider:Ldf/a;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->moshiProvider:Ldf/a;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->internalConfigProvider:Ldf/a;

    .line 11
    .line 12
    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ldf/a;Ldf/a;Ldf/a;)Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;",
            "Ldf/a;",
            "Ldf/a;",
            "Ldf/a;",
            ")",
            "Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ldf/a;Ldf/a;Ldf/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static provideRetrofit(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Lokhttp3/OkHttpClient;Lhb/K;Lcom/qonversion/android/sdk/internal/InternalConfig;)Lzg/T;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;->provideRetrofit(Lokhttp3/OkHttpClient;Lhb/K;Lcom/qonversion/android/sdk/internal/InternalConfig;)Lzg/T;

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
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->get()Lzg/T;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzg/T;
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->clientProvider:Ldf/a;

    invoke-interface {v1}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lokhttp3/OkHttpClient;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->moshiProvider:Ldf/a;

    invoke-interface {v2}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhb/K;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->internalConfigProvider:Ldf/a;

    invoke-interface {v3}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/internal/InternalConfig;

    invoke-static {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->provideRetrofit(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Lokhttp3/OkHttpClient;Lhb/K;Lcom/qonversion/android/sdk/internal/InternalConfig;)Lzg/T;

    move-result-object v0

    return-object v0
.end method
