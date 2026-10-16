.class public final Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequestJsonAdapter;
.super Lhb/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhb/r;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u0019\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequestJsonAdapter;",
        "Lhb/r;",
        "Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;",
        "Lhb/K;",
        "moshi",
        "<init>",
        "(Lhb/K;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Lhb/w;",
        "reader",
        "fromJson",
        "(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;",
        "Lhb/C;",
        "writer",
        "value_",
        "Lef/C;",
        "toJson",
        "(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;)V",
        "Lhb/u;",
        "options",
        "Lhb/u;",
        "Lcom/qonversion/android/sdk/internal/dto/Environment;",
        "environmentAdapter",
        "Lhb/r;",
        "stringAdapter",
        "Lcom/qonversion/android/sdk/internal/dto/ProviderData;",
        "providerDataAdapter",
        "nullableStringAdapter",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final environmentAdapter:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final nullableStringAdapter:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final options:Lhb/u;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final providerDataAdapter:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final stringAdapter:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhb/K;)V
    .locals 5
    .param p1    # Lhb/K;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "moshi"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v0, "provider_data"

    .line 10
    .line 11
    const-string v1, "client_uid"

    .line 12
    .line 13
    const-string v2, "d"

    .line 14
    .line 15
    const-string v3, "v"

    .line 16
    .line 17
    const-string v4, "access_token"

    .line 18
    .line 19
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lhb/u;->a([Ljava/lang/String;)Lhb/u;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequestJsonAdapter;->options:Lhb/u;

    .line 28
    .line 29
    sget-object v0, Lff/x;->a:Lff/x;

    .line 30
    .line 31
    const-class v1, Lcom/qonversion/android/sdk/internal/dto/Environment;

    .line 32
    .line 33
    invoke-virtual {p1, v1, v0, v2}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iput-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequestJsonAdapter;->environmentAdapter:Lhb/r;

    .line 38
    .line 39
    const-class v1, Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p1, v1, v0, v3}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iput-object v2, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequestJsonAdapter;->stringAdapter:Lhb/r;

    .line 46
    .line 47
    const-string v2, "providerData"

    .line 48
    .line 49
    const-class v3, Lcom/qonversion/android/sdk/internal/dto/ProviderData;

    .line 50
    .line 51
    invoke-virtual {p1, v3, v0, v2}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iput-object v2, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequestJsonAdapter;->providerDataAdapter:Lhb/r;

    .line 56
    .line 57
    const-string v2, "clientUid"

    .line 58
    .line 59
    invoke-virtual {p1, v1, v0, v2}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequestJsonAdapter;->nullableStringAdapter:Lhb/r;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public fromJson(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;
    .locals 13
    .param p1    # Lhb/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "reader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lhb/w;->b()V

    const/4 v0, 0x0

    move-object v2, v0

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    .line 3
    :goto_0
    invoke-virtual {p1}, Lhb/w;->o()Z

    move-result v0

    const-string v1, "access_token"

    const-string v7, "accessToken"

    const-string v8, "provider_data"

    const-string v9, "providerData"

    const-string v10, "d"

    const-string v11, "v"

    if-eqz v0, :cond_a

    .line 4
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequestJsonAdapter;->options:Lhb/u;

    invoke-virtual {p1, v0}, Lhb/w;->W(Lhb/u;)I

    move-result v0

    const/4 v12, -0x1

    if-eq v0, v12, :cond_9

    if-eqz v0, :cond_7

    const/4 v10, 0x1

    if-eq v0, v10, :cond_5

    const/4 v10, 0x2

    if-eq v0, v10, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequestJsonAdapter;->nullableStringAdapter:Lhb/r;

    invoke-virtual {v0, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequestJsonAdapter;->providerDataAdapter:Lhb/r;

    invoke-virtual {v0, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/qonversion/android/sdk/internal/dto/ProviderData;

    if-eqz v5, :cond_2

    goto :goto_0

    .line 7
    :cond_2
    invoke-static {v9, v8, p1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 8
    :cond_3
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequestJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v0, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_4

    goto :goto_0

    .line 9
    :cond_4
    invoke-static {v7, v1, p1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 10
    :cond_5
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequestJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v0, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_6

    goto :goto_0

    :cond_6
    invoke-static {v11, v11, p1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 11
    :cond_7
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequestJsonAdapter;->environmentAdapter:Lhb/r;

    invoke-virtual {v0, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/qonversion/android/sdk/internal/dto/Environment;

    if-eqz v2, :cond_8

    goto :goto_0

    :cond_8
    invoke-static {v10, v10, p1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 12
    :cond_9
    invoke-virtual {p1}, Lhb/w;->Y()V

    .line 13
    invoke-virtual {p1}, Lhb/w;->Z()V

    goto :goto_0

    .line 14
    :cond_a
    invoke-virtual {p1}, Lhb/w;->h()V

    move-object v0, v1

    .line 15
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;

    if-eqz v2, :cond_e

    if-eqz v3, :cond_d

    if-eqz v4, :cond_c

    if-eqz v5, :cond_b

    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;-><init>(Lcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/ProviderData;Ljava/lang/String;)V

    return-object v1

    .line 16
    :cond_b
    invoke-static {v9, v8, p1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 17
    :cond_c
    invoke-static {v7, v0, p1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 18
    :cond_d
    invoke-static {v11, v11, p1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 19
    :cond_e
    invoke-static {v10, v10, p1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1
.end method

.method public bridge synthetic fromJson(Lhb/w;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequestJsonAdapter;->fromJson(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;)V
    .locals 2
    .param p1    # Lhb/C;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lhb/C;->b()Lhb/C;

    .line 3
    const-string v0, "d"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 4
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequestJsonAdapter;->environmentAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->getD()Lcom/qonversion/android/sdk/internal/dto/Environment;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 5
    const-string v0, "v"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequestJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->getV()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 7
    const-string v0, "access_token"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 8
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequestJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->getAccessToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 9
    const-string v0, "provider_data"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 10
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequestJsonAdapter;->providerDataAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->getProviderData()Lcom/qonversion/android/sdk/internal/dto/ProviderData;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 11
    const-string v0, "client_uid"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequestJsonAdapter;->nullableStringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;->getClientUid()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 13
    invoke-virtual {p1}, Lhb/C;->i()Lhb/C;

    return-void

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lhb/C;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;

    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequestJsonAdapter;->toJson(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/request/AttributionRequest;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/16 v0, 0x28

    .line 2
    .line 3
    const-string v1, "GeneratedJsonAdapter(AttributionRequest)"

    .line 4
    .line 5
    const-string v2, "toString(...)"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcb/a;->g(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
