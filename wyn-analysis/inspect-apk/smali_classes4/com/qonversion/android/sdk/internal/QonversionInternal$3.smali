.class final Lcom/qonversion/android/sdk/internal/QonversionInternal$3;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QonversionInternal;-><init>(Lcom/qonversion/android/sdk/internal/InternalConfig;Landroid/app/Application;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n;",
        "Ltf/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lef/C;",
        "invoke",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $lifecycleHandler:Lcom/qonversion/android/sdk/internal/AppLifecycleHandler;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/AppLifecycleHandler;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$3;->$lifecycleHandler:Lcom/qonversion/android/sdk/internal/AppLifecycleHandler;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QonversionInternal$3;->invoke()V

    sget-object v0, Lef/C;->a:Lef/C;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 1
    sget-object v0, Landroidx/lifecycle/J;->i:Landroidx/lifecycle/J;

    .line 2
    iget-object v0, v0, Landroidx/lifecycle/J;->f:Landroidx/lifecycle/x;

    .line 3
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$3;->$lifecycleHandler:Lcom/qonversion/android/sdk/internal/AppLifecycleHandler;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/u;)V

    return-void
.end method
