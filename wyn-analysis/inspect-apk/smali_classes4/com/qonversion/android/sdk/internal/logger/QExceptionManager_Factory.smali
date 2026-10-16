.class public final Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;
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
.field private final headersProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private final intervalConfigProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private final moshiProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field

.field private final repositoryProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldf/a;Ldf/a;Ldf/a;Ldf/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;->repositoryProvider:Ldf/a;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;->intervalConfigProvider:Ldf/a;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;->headersProvider:Ldf/a;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;->moshiProvider:Ldf/a;

    .line 11
    .line 12
    return-void
.end method

.method public static create(Ldf/a;Ldf/a;Ldf/a;Ldf/a;)Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldf/a;",
            "Ldf/a;",
            "Ldf/a;",
            "Ldf/a;",
            ")",
            "Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;-><init>(Ldf/a;Ldf/a;Ldf/a;Ldf/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static newInstance(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lhb/K;)Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;
    .locals 1

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;-><init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lhb/K;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;
    .locals 5

    .line 2
    new-instance v0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;->repositoryProvider:Ldf/a;

    invoke-interface {v1}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/repository/QRepository;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;->intervalConfigProvider:Ldf/a;

    invoke-interface {v2}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/internal/InternalConfig;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;->headersProvider:Ldf/a;

    invoke-interface {v3}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;->moshiProvider:Ldf/a;

    invoke-interface {v4}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lhb/K;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;-><init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lhb/K;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;->get()Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;

    move-result-object v0

    return-object v0
.end method
