.class public final Lcom/qonversion/android/sdk/internal/services/QUserInfoService_Factory;
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
.field private final preferencesProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private final tokenStorageProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldf/a;Ldf/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService_Factory;->preferencesProvider:Ldf/a;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService_Factory;->tokenStorageProvider:Ldf/a;

    .line 7
    .line 8
    return-void
.end method

.method public static create(Ldf/a;Ldf/a;)Lcom/qonversion/android/sdk/internal/services/QUserInfoService_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldf/a;",
            "Ldf/a;",
            ")",
            "Lcom/qonversion/android/sdk/internal/services/QUserInfoService_Factory;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService_Factory;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService_Factory;-><init>(Ldf/a;Ldf/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static newInstance(Lcom/qonversion/android/sdk/internal/storage/Cache;Lcom/qonversion/android/sdk/internal/storage/TokenStorage;)Lcom/qonversion/android/sdk/internal/services/QUserInfoService;
    .locals 1

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;-><init>(Lcom/qonversion/android/sdk/internal/storage/Cache;Lcom/qonversion/android/sdk/internal/storage/TokenStorage;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/services/QUserInfoService;
    .locals 3

    .line 2
    new-instance v0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService_Factory;->preferencesProvider:Ldf/a;

    invoke-interface {v1}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/storage/Cache;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService_Factory;->tokenStorageProvider:Ldf/a;

    invoke-interface {v2}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/internal/storage/TokenStorage;

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;-><init>(Lcom/qonversion/android/sdk/internal/storage/Cache;Lcom/qonversion/android/sdk/internal/storage/TokenStorage;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService_Factory;->get()Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    move-result-object v0

    return-object v0
.end method
