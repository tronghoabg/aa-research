.class public final LGe/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;


# instance fields
.field public final synthetic a:LGe/u;


# direct methods
.method public constructor <init>(LGe/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LGe/n;->a:LGe/u;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LGe/c;->l(Lcom/qonversion/android/sdk/dto/QonversionError;)LGe/v;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, LGe/n;->a:LGe/u;

    .line 11
    .line 12
    invoke-interface {v0, p1}, LGe/u;->onError(LGe/v;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onSuccess(Ljava/util/Map;)V
    .locals 1

    .line 1
    const-string v0, "entitlements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LGe/c;->a(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, LGe/n;->a:LGe/u;

    .line 11
    .line 12
    invoke-interface {v0, p1}, LGe/u;->onSuccess(Ljava/util/Map;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
