.class final Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$getProperties$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->getProperties(Ltf/l;Ltf/l;)V
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

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ltf/l;Ltf/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;",
            "Ltf/l;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$getProperties$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$getProperties$1;->$onSuccess:Ltf/l;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$getProperties$1;->$onError:Ltf/l;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$getProperties$1;->invoke()V

    sget-object v0, Lef/C;->a:Lef/C;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$getProperties$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->access$getRepository$p(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;)Lcom/qonversion/android/sdk/internal/repository/QRepository;

    move-result-object v0

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$getProperties$1;->$onSuccess:Ltf/l;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$getProperties$1;->$onError:Ltf/l;

    invoke-interface {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->getProperties(Ltf/l;Ltf/l;)V

    return-void
.end method
