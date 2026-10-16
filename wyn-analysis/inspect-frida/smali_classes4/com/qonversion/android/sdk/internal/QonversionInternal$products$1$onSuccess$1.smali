.class final Lcom/qonversion/android/sdk/internal/QonversionInternal$products$1$onSuccess$1;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QonversionInternal$products$1;->onSuccess(Ljava/util/Map;)V
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
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;

.field final synthetic $products:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$products$1$onSuccess$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$products$1$onSuccess$1;->$products:Ljava/util/Map;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QonversionInternal$products$1$onSuccess$1;->invoke()V

    sget-object v0, Lef/C;->a:Lef/C;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$products$1$onSuccess$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$products$1$onSuccess$1;->$products:Ljava/util/Map;

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;->onSuccess(Ljava/util/Map;)V

    return-void
.end method
