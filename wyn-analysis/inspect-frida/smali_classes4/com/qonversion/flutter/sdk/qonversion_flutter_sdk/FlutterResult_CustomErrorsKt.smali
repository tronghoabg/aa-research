.class public final Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/FlutterResult_CustomErrorsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "noNecessaryDataError",
        "",
        "Lio/flutter/plugin/common/MethodChannel$Result;",
        "sandwichError",
        "error",
        "Lio/qonversion/sandwich/SandwichError;",
        "qonversion_flutter_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final noNecessaryDataError(Luc/q;)V
    .locals 3
    .param p0    # Luc/q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "Could not find necessary arguments"

    .line 7
    .line 8
    const-string v1, "Make sure you pass correct call arguments"

    .line 9
    .line 10
    const-string v2, "NoNecessaryDataError"

    .line 11
    .line 12
    invoke-interface {p0, v2, v0, v1}, Luc/q;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static final sandwichError(Luc/q;LGe/v;)V
    .locals 2
    .param p0    # Luc/q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # LGe/v;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "error"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, LGe/v;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, LGe/v;->b:Ljava/lang/String;

    .line 14
    .line 15
    iget-object p1, p1, LGe/v;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-interface {p0, v0, v1, p1}, Luc/q;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
