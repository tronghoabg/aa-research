.class public final Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper_Factory;
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
.field private final helperProvider:Ldf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldf/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldf/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper_Factory;->helperProvider:Ldf/a;

    .line 5
    .line 6
    return-void
.end method

.method public static create(Ldf/a;)Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldf/a;",
            ")",
            "Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper_Factory;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper_Factory;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper_Factory;-><init>(Ldf/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static newInstance(Lcom/qonversion/android/sdk/internal/api/ApiHelper;)Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;
    .locals 1

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;-><init>(Lcom/qonversion/android/sdk/internal/api/ApiHelper;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;
    .locals 2

    .line 2
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper_Factory;->helperProvider:Ldf/a;

    invoke-interface {v1}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/api/ApiHelper;

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;-><init>(Lcom/qonversion/android/sdk/internal/api/ApiHelper;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper_Factory;->get()Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    move-result-object v0

    return-object v0
.end method
