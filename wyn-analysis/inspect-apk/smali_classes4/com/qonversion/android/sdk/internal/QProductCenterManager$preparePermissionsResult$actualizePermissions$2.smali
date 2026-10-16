.class final Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$2;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QProductCenterManager;->preparePermissionsResult$actualizePermissions(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ltf/l;Ltf/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n;",
        "Ltf/l;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "error",
        "Lef/C;",
        "invoke",
        "(Lcom/qonversion/android/sdk/dto/QonversionError;)V",
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
.field final synthetic $onError:Ltf/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltf/l;"
        }
    .end annotation
.end field

.field final synthetic $onSuccess:Ltf/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltf/l;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ltf/l;Ltf/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/QProductCenterManager;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$2;->$onError:Ltf/l;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$2;->$onSuccess:Ltf/l;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/qonversion/android/sdk/dto/QonversionError;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$2;->invoke(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 2
    .param p1    # Lcom/qonversion/android/sdk/dto/QonversionError;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getLaunchResultCache$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getActualPermissions()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$2;->$onSuccess:Ltf/l;

    .line 4
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    sget-object v0, Lef/C;->a:Lef/C;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$2;->$onError:Ltf/l;

    invoke-interface {v0, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
