.class public final LGe/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;


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
    iput-object p1, p0, LGe/o;->a:LGe/u;

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
    iget-object v0, p0, LGe/o;->a:LGe/u;

    .line 11
    .line 12
    invoke-interface {v0, p1}, LGe/u;->onError(LGe/v;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onSuccess(Lcom/qonversion/android/sdk/dto/QUser;)V
    .locals 3

    .line 1
    const-string v0, "user"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QUser;->getQonversionId()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lef/k;

    .line 11
    .line 12
    const-string v2, "qonversionId"

    .line 13
    .line 14
    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QUser;->getIdentityId()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v0, Lef/k;

    .line 22
    .line 23
    const-string v2, "identityId"

    .line 24
    .line 25
    invoke-direct {v0, v2, p1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x2

    .line 29
    new-array p1, p1, [Lef/k;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    aput-object v1, p1, v2

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    aput-object v0, p1, v1

    .line 36
    .line 37
    invoke-static {p1}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iget-object v0, p0, LGe/o;->a:LGe/u;

    .line 42
    .line 43
    invoke-interface {v0, p1}, LGe/u;->onSuccess(Ljava/util/Map;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
