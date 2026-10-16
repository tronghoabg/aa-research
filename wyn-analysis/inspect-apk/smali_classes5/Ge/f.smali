.class public final LGe/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lce/a;


# instance fields
.field public final synthetic a:Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/NoCodesPlugin;


# direct methods
.method public constructor <init>(Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/NoCodesPlugin;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LGe/f;->a:Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/NoCodesPlugin;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lef/k;

    .line 2
    .line 3
    const-string v1, "screenId"

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lff/B;->E(Lef/k;)Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, LGe/d;->a:LGe/d;

    .line 13
    .line 14
    iget-object v1, p0, LGe/f;->a:Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/NoCodesPlugin;

    .line 15
    .line 16
    invoke-interface {v1, v0, p1}, LGe/e;->onNoCodesEvent(LGe/d;Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final b(Lae/f;)V
    .locals 2

    .line 1
    sget-object v0, LGe/d;->e:LGe/d;

    .line 2
    .line 3
    invoke-static {p1}, LGe/c;->c(Lae/f;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v1, p0, LGe/f;->a:Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/NoCodesPlugin;

    .line 8
    .line 9
    invoke-interface {v1, v0, p1}, LGe/e;->onNoCodesEvent(LGe/d;Ljava/util/Map;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    sget-object v0, LGe/d;->b:LGe/d;

    .line 2
    .line 3
    iget-object v1, p0, LGe/f;->a:Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/NoCodesPlugin;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v1, v0, v2}, LGe/e;->onNoCodesEvent(LGe/d;Ljava/util/Map;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final d(LG9/e;)V
    .locals 2

    .line 1
    sget-object v0, LGe/d;->f:LGe/d;

    .line 2
    .line 3
    invoke-static {p1}, LGe/c;->b(LG9/e;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v1, p0, LGe/f;->a:Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/NoCodesPlugin;

    .line 8
    .line 9
    invoke-interface {v1, v0, p1}, LGe/e;->onNoCodesEvent(LGe/d;Ljava/util/Map;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final e(Lae/f;)V
    .locals 2

    .line 1
    sget-object v0, LGe/d;->d:LGe/d;

    .line 2
    .line 3
    invoke-static {p1}, LGe/c;->c(Lae/f;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v1, p0, LGe/f;->a:Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/NoCodesPlugin;

    .line 8
    .line 9
    invoke-interface {v1, v0, p1}, LGe/e;->onNoCodesEvent(LGe/d;Ljava/util/Map;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final f(Lae/f;)V
    .locals 2

    .line 1
    sget-object v0, LGe/d;->c:LGe/d;

    .line 2
    .line 3
    invoke-static {p1}, LGe/c;->c(Lae/f;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v1, p0, LGe/f;->a:Lcom/qonversion/flutter/sdk/qonversion_flutter_sdk/NoCodesPlugin;

    .line 8
    .line 9
    invoke-interface {v1, v0, p1}, LGe/e;->onNoCodesEvent(LGe/d;Ljava/util/Map;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
