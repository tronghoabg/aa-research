.class public final Lcom/qonversion/android/sdk/automations/internal/ActivityProvider_Factory;
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
.field private final applicationProvider:Ldf/a;
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
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider_Factory;->applicationProvider:Ldf/a;

    .line 5
    .line 6
    return-void
.end method

.method public static create(Ldf/a;)Lcom/qonversion/android/sdk/automations/internal/ActivityProvider_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldf/a;",
            ")",
            "Lcom/qonversion/android/sdk/automations/internal/ActivityProvider_Factory;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider_Factory;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider_Factory;-><init>(Ldf/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static newInstance(Landroid/app/Application;)Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;
    .locals 1

    .line 1
    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;-><init>(Landroid/app/Application;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;
    .locals 2

    .line 2
    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;

    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider_Factory;->applicationProvider:Ldf/a;

    invoke-interface {v1}, Ldf/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;-><init>(Landroid/app/Application;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider_Factory;->get()Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;

    move-result-object v0

    return-object v0
.end method
