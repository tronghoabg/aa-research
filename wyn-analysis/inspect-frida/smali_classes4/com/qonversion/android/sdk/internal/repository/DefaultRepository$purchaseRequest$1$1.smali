.class final Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1;->invoke(Lcom/qonversion/android/sdk/internal/CallBackKt;)V
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
        "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
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
.field final synthetic $attemptIndex:I

.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

.field final synthetic $installDate:J

.field final synthetic $purchase:Lcom/qonversion/android/sdk/internal/purchase/Purchase;

.field final synthetic $qProductId:Ljava/lang/String;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;IJLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    iput p3, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$attemptIndex:I

    iput-wide p4, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$installDate:J

    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$purchase:Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    iput-object p7, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$qProductId:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lzg/Q;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->invoke(Lzg/Q;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Lzg/Q;)V
    .locals 13
    .param p1    # Lzg/Q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzg/Q<",
            "Lcom/qonversion/android/sdk/internal/dto/BaseResponse<",
            "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$getLogger$p(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;)Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object v0

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    invoke-static {v1, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$getLogMessage(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lzg/Q;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "purchaseRequest - "

    .line 3
    invoke-static {v2, v1, v0}, Lcom/google/android/gms/internal/consent_sdk/a;->z(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/logger/Logger;)V

    .line 4
    iget-object v0, p1, Lzg/Q;->b:Ljava/lang/Object;

    check-cast v0, Lcom/qonversion/android/sdk/internal/dto/BaseResponse;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/BaseResponse;->getSuccess()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/BaseResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;

    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;->onSuccess(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V

    return-void

    .line 7
    :cond_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    .line 8
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    .line 9
    invoke-static {v1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$getErrorMapper$p(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;)Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getErrorFromResponse(Lzg/Q;)Lcom/qonversion/android/sdk/dto/QonversionError;

    move-result-object v3

    .line 10
    iget-object p1, p1, Lzg/Q;->a:Lokhttp3/Response;

    iget p1, p1, Lokhttp3/Response;->d:I

    .line 11
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 12
    iget v5, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$attemptIndex:I

    .line 13
    new-instance v6, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1$1;

    iget-object v7, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    iget-wide v8, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$installDate:J

    iget-object v10, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$purchase:Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    iget-object v11, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$qProductId:Ljava/lang/String;

    iget-object v12, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    invoke-direct/range {v6 .. v12}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    invoke-static/range {v1 .. v6}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$handlePurchaseError(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/dto/QonversionError;Ljava/lang/Integer;ILtf/l;)V

    return-void
.end method
