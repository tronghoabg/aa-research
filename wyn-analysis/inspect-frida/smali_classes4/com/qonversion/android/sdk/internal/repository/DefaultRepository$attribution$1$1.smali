.class final Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attribution$1$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attribution$1;->invoke(Lcom/qonversion/android/sdk/internal/CallBackKt;)V
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lzg/Q;",
        "Lcom/qonversion/android/sdk/internal/dto/BaseResponse;",
        "Lcom/qonversion/android/sdk/internal/dto/Response;",
        "it",
        "Lef/C;",
        "invoke",
        "(Lzg/Q;)V",
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

.field final synthetic $onSuccess:Ltf/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltf/a;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Ltf/a;Ltf/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;",
            "Ltf/a;",
            "Ltf/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attribution$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attribution$1$1;->$onSuccess:Ltf/a;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attribution$1$1;->$onError:Ltf/l;

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
    check-cast p1, Lzg/Q;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attribution$1$1;->invoke(Lzg/Q;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Lzg/Q;)V
    .locals 3
    .param p1    # Lzg/Q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzg/Q<",
            "Lcom/qonversion/android/sdk/internal/dto/BaseResponse<",
            "Lcom/qonversion/android/sdk/internal/dto/Response;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attribution$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$getLogger$p(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;)Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object v0

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attribution$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    invoke-static {v1, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$getLogMessage(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lzg/Q;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "AttributionRequest - "

    .line 3
    invoke-static {v2, v1, v0}, Lcom/google/android/gms/internal/consent_sdk/a;->z(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    .line 4
    iget-object v0, p1, Lzg/Q;->a:Lokhttp3/Response;

    invoke-virtual {v0}, Lokhttp3/Response;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attribution$1$1;->$onSuccess:Ltf/a;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ltf/a;->invoke()Ljava/lang/Object;

    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attribution$1$1;->$onError:Ltf/l;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$attribution$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    invoke-static {v1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$getErrorMapper$p(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;)Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getErrorFromResponse(Lzg/Q;)Lcom/qonversion/android/sdk/dto/QonversionError;

    move-result-object p1

    invoke-interface {v0, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
