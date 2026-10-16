.class public final Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRateLimiterFactory;
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
.field private final module:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRateLimiterFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    .line 5
    .line 6
    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;)Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRateLimiterFactory;
    .locals 1

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRateLimiterFactory;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRateLimiterFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static provideRateLimiter(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;)Lcom/qonversion/android/sdk/internal/api/RateLimiter;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;->provideRateLimiter()Lcom/qonversion/android/sdk/internal/api/RateLimiter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 6
    .line 7
    invoke-static {p0, v0}, Lka/e0;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/api/RateLimiter;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRateLimiterFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRateLimiterFactory;->provideRateLimiter(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;)Lcom/qonversion/android/sdk/internal/api/RateLimiter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRateLimiterFactory;->get()Lcom/qonversion/android/sdk/internal/api/RateLimiter;

    move-result-object v0

    return-object v0
.end method
