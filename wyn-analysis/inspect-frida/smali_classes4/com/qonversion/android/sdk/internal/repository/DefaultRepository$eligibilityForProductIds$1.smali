.class final Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$eligibilityForProductIds$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->eligibilityForProductIds(Ljava/util/List;JLcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/CallBackKt;",
        "Lcom/qonversion/android/sdk/internal/dto/BaseResponse;",
        "Lcom/qonversion/android/sdk/internal/dto/eligibility/EligibilityResult;",
        "Lef/C;",
        "invoke",
        "(Lcom/qonversion/android/sdk/internal/CallBackKt;)V",
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
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$eligibilityForProductIds$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$eligibilityForProductIds$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/qonversion/android/sdk/internal/CallBackKt;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$eligibilityForProductIds$1;->invoke(Lcom/qonversion/android/sdk/internal/CallBackKt;)V

    sget-object p1, Lef/C;->a:Lef/C;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/internal/CallBackKt;)V
    .locals 3
    .param p1    # Lcom/qonversion/android/sdk/internal/CallBackKt;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/CallBackKt<",
            "Lcom/qonversion/android/sdk/internal/dto/BaseResponse<",
            "Lcom/qonversion/android/sdk/internal/dto/eligibility/EligibilityResult;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "$this$enqueue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$eligibilityForProductIds$1$1;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$eligibilityForProductIds$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$eligibilityForProductIds$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$eligibilityForProductIds$1$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V

    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/internal/CallBackKt;->setOnResponse(Ltf/l;)V

    .line 3
    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$eligibilityForProductIds$1$2;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$eligibilityForProductIds$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$eligibilityForProductIds$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$eligibilityForProductIds$1$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V

    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/internal/CallBackKt;->setOnFailure(Ltf/l;)V

    return-void
.end method
