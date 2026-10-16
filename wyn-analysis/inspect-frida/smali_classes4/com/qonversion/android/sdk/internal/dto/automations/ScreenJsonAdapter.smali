.class public final Lcom/qonversion/android/sdk/internal/dto/automations/ScreenJsonAdapter;
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
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/automations/ScreenJsonAdapter;",
        "Lhb/r;",
        "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;",
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
        "(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/automations/Screen;",
        "Lhb/C;",
        "writer",
        "value_",
        "Lef/C;",
        "toJson",
        "(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/automations/Screen;)V",
        "Lhb/u;",
        "options",
        "Lhb/u;",
        "stringAdapter",
        "Lhb/r;",
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
    const-string v0, "background"

    .line 10
    .line 11
    const-string v1, "object"

    .line 12
    .line 13
    const-string v2, "id"

    .line 14
    .line 15
    const-string v3, "body"

    .line 16
    .line 17
    const-string v4, "lang"

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
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/automations/ScreenJsonAdapter;->options:Lhb/u;

    .line 28
    .line 29
    sget-object v0, Lff/x;->a:Lff/x;

    .line 30
    .line 31
    const-class v1, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p1, v1, v0, v2}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/dto/automations/ScreenJsonAdapter;->stringAdapter:Lhb/r;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public fromJson(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/automations/Screen;
    .locals 14
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

    const-string v1, "body"

    const-string v7, "htmlPage"

    const-string v8, "object"

    const-string v9, "obj"

    const-string v10, "id"

    const-string v11, "lang"

    const-string v12, "background"

    if-eqz v0, :cond_b

    .line 4
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/automations/ScreenJsonAdapter;->options:Lhb/u;

    invoke-virtual {p1, v0}, Lhb/w;->W(Lhb/u;)I

    move-result v0

    const/4 v13, -0x1

    if-eq v0, v13, :cond_a

    if-eqz v0, :cond_8

    const/4 v10, 0x1

    if-eq v0, v10, :cond_6

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/automations/ScreenJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v0, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v9, v8, p1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 6
    :cond_2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/automations/ScreenJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v0, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {v12, v12, p1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 7
    :cond_4
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/automations/ScreenJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v0, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_5

    goto :goto_0

    :cond_5
    invoke-static {v11, v11, p1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 8
    :cond_6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/automations/ScreenJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v0, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_7

    goto :goto_0

    :cond_7
    invoke-static {v7, v1, p1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 9
    :cond_8
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/automations/ScreenJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v0, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_9

    goto :goto_0

    :cond_9
    invoke-static {v10, v10, p1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 10
    :cond_a
    invoke-virtual {p1}, Lhb/w;->Y()V

    .line 11
    invoke-virtual {p1}, Lhb/w;->Z()V

    goto/16 :goto_0

    .line 12
    :cond_b
    invoke-virtual {p1}, Lhb/w;->h()V

    move-object v0, v1

    .line 13
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/automations/Screen;

    if-eqz v2, :cond_10

    if-eqz v3, :cond_f

    if-eqz v4, :cond_e

    if-eqz v5, :cond_d

    if-eqz v6, :cond_c

    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/internal/dto/automations/Screen;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 14
    :cond_c
    invoke-static {v9, v8, p1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 15
    :cond_d
    invoke-static {v12, v12, p1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 16
    :cond_e
    invoke-static {v11, v11, p1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 17
    :cond_f
    invoke-static {v7, v0, p1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 18
    :cond_10
    invoke-static {v10, v10, p1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1
.end method

.method public bridge synthetic fromJson(Lhb/w;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/dto/automations/ScreenJsonAdapter;->fromJson(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/automations/Screen;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/automations/Screen;)V
    .locals 2
    .param p1    # Lhb/C;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/dto/automations/Screen;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lhb/C;->b()Lhb/C;

    .line 3
    const-string v0, "id"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 4
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/automations/ScreenJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/automations/Screen;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 5
    const-string v0, "body"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/automations/ScreenJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/automations/Screen;->getHtmlPage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 7
    const-string v0, "lang"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 8
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/automations/ScreenJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/automations/Screen;->getLang()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 9
    const-string v0, "background"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 10
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/automations/ScreenJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/automations/Screen;->getBackground()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 11
    const-string v0, "object"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/automations/ScreenJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/automations/Screen;->getObj()Ljava/lang/String;

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
    check-cast p2, Lcom/qonversion/android/sdk/internal/dto/automations/Screen;

    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/dto/automations/ScreenJsonAdapter;->toJson(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/automations/Screen;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/16 v0, 0x1c

    .line 2
    .line 3
    const-string v1, "GeneratedJsonAdapter(Screen)"

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
