.class public final Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequestJsonAdapter;
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
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequestJsonAdapter;",
        "Lhb/r;",
        "Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequest;",
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
        "(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequest;",
        "Lhb/C;",
        "writer",
        "value_",
        "Lef/C;",
        "toJson",
        "(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequest;)V",
        "Lhb/u;",
        "options",
        "Lhb/u;",
        "stringAdapter",
        "Lhb/r;",
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
    .locals 4
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
    const-string v0, "device_id"

    .line 10
    .line 11
    const-string v1, "push_token"

    .line 12
    .line 13
    const-string v2, "access_token"

    .line 14
    .line 15
    const-string v3, "q_uid"

    .line 16
    .line 17
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lhb/u;->a([Ljava/lang/String;)Lhb/u;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequestJsonAdapter;->options:Lhb/u;

    .line 26
    .line 27
    sget-object v0, Lff/x;->a:Lff/x;

    .line 28
    .line 29
    const-string v1, "accessToken"

    .line 30
    .line 31
    const-class v2, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p1, v2, v0, v1}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iput-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequestJsonAdapter;->stringAdapter:Lhb/r;

    .line 38
    .line 39
    const-string v1, "clientUid"

    .line 40
    .line 41
    invoke-virtual {p1, v2, v0, v1}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequestJsonAdapter;->nullableStringAdapter:Lhb/r;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public fromJson(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequest;
    .locals 12
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

    move-object v1, v0

    move-object v2, v1

    move-object v3, v2

    .line 3
    :goto_0
    invoke-virtual {p1}, Lhb/w;->o()Z

    move-result v4

    const-string v5, "access_token"

    const-string v6, "accessToken"

    const-string v7, "device_id"

    const-string v8, "deviceId"

    const-string v9, "push_token"

    const-string v10, "pushToken"

    if-eqz v4, :cond_8

    .line 4
    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequestJsonAdapter;->options:Lhb/u;

    invoke-virtual {p1, v4}, Lhb/w;->W(Lhb/u;)I

    move-result v4

    const/4 v11, -0x1

    if-eq v4, v11, :cond_7

    if-eqz v4, :cond_5

    const/4 v5, 0x1

    if-eq v4, v5, :cond_4

    const/4 v5, 0x2

    if-eq v4, v5, :cond_2

    const/4 v5, 0x3

    if-eq v4, v5, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequestJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v3, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v10, v9, p1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 6
    :cond_2
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequestJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v2, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {v8, v7, p1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 7
    :cond_4
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequestJsonAdapter;->nullableStringAdapter:Lhb/r;

    invoke-virtual {v1, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_0

    .line 8
    :cond_5
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequestJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v0, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_6

    goto :goto_0

    .line 9
    :cond_6
    invoke-static {v6, v5, p1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 10
    :cond_7
    invoke-virtual {p1}, Lhb/w;->Y()V

    .line 11
    invoke-virtual {p1}, Lhb/w;->Z()V

    goto :goto_0

    .line 12
    :cond_8
    invoke-virtual {p1}, Lhb/w;->h()V

    .line 13
    new-instance v4, Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequest;

    if-eqz v0, :cond_b

    if-eqz v2, :cond_a

    if-eqz v3, :cond_9

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v4

    .line 14
    :cond_9
    invoke-static {v10, v9, p1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 15
    :cond_a
    invoke-static {v8, v7, p1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 16
    :cond_b
    invoke-static {v6, v5, p1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1
.end method

.method public bridge synthetic fromJson(Lhb/w;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequestJsonAdapter;->fromJson(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequest;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequest;)V
    .locals 2
    .param p1    # Lhb/C;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequest;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lhb/C;->b()Lhb/C;

    .line 3
    const-string v0, "access_token"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 4
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequestJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequest;->getAccessToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 5
    const-string v0, "q_uid"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequestJsonAdapter;->nullableStringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequest;->getClientUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 7
    const-string v0, "device_id"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 8
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequestJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequest;->getDeviceId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 9
    const-string v0, "push_token"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 10
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequestJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequest;->getPushToken()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 11
    invoke-virtual {p1}, Lhb/C;->i()Lhb/C;

    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lhb/C;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequest;

    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequestJsonAdapter;->toJson(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/request/SendPushTokenRequest;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/16 v0, 0x2a

    .line 2
    .line 3
    const-string v1, "GeneratedJsonAdapter(SendPushTokenRequest)"

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
