.class final Lcom/qonversion/android/sdk/internal/logger/QExceptionManager$sendCrashReportsInBackground$1$1$1$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->sendCrashReportsInBackground()V
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
.field final synthetic $filename:Ljava/lang/String;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager$sendCrashReportsInBackground$1$1$1$1;->this$0:Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager$sendCrashReportsInBackground$1$1$1$1;->$filename:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager$sendCrashReportsInBackground$1$1$1$1;->invoke()V

    sget-object v0, Lef/C;->a:Lef/C;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager$sendCrashReportsInBackground$1$1$1$1;->this$0:Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->access$getContextRef$p(Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager$sendCrashReportsInBackground$1$1$1$1;->$filename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z

    :cond_0
    return-void

    :cond_1
    const-string v0, "contextRef"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method
