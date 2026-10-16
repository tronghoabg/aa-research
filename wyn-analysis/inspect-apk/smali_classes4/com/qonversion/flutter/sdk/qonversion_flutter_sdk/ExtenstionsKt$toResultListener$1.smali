.class public final Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/ExtenstionsKt$toResultListener$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGe/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/ExtenstionsKt;->toResultListener(Luc/q;)LGe/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001e\u0010\u0006\u001a\u00020\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0008H\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "com/qonversion/flutter/sdk/qonversion_flutter_sdk/ExtenstionsKt$toResultListener$1",
        "Lio/qonversion/sandwich/ResultListener;",
        "onError",
        "",
        "error",
        "Lio/qonversion/sandwich/SandwichError;",
        "onSuccess",
        "data",
        "",
        "",
        "",
        "qonversion_flutter_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $this_toResultListener:Luc/q;


# direct methods
.method public constructor <init>(Luc/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/ExtenstionsKt$toResultListener$1;->$this_toResultListener:Luc/q;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onError(LGe/v;)V
    .locals 1

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/ExtenstionsKt$toResultListener$1;->$this_toResultListener:Luc/q;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/FlutterResult_CustomErrorsKt;->sandwichError(Luc/q;LGe/v;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onSuccess(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/ExtenstionsKt$toResultListener$1;->$this_toResultListener:Luc/q;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Luc/q;->a(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
