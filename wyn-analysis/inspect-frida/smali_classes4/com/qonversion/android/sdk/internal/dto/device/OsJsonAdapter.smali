.class public final Lcom/qonversion/android/sdk/internal/dto/device/OsJsonAdapter;
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
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/device/OsJsonAdapter;",
        "Lhb/r;",
        "Lcom/qonversion/android/sdk/internal/dto/device/Os;",
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
        "(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/device/Os;",
        "Lhb/C;",
        "writer",
        "value_",
        "Lef/C;",
        "toJson",
        "(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/device/Os;)V",
        "Lhb/u;",
        "options",
        "Lhb/u;",
        "stringAdapter",
        "Lhb/r;",
        "Ljava/lang/reflect/Constructor;",
        "constructorRef",
        "Ljava/lang/reflect/Constructor;",
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
.field private volatile constructorRef:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "Lcom/qonversion/android/sdk/internal/dto/device/Os;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
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
    .locals 3
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
    const-string v0, "version"

    .line 10
    .line 11
    const-string v1, "name"

    .line 12
    .line 13
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lhb/u;->a([Ljava/lang/String;)Lhb/u;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/device/OsJsonAdapter;->options:Lhb/u;

    .line 22
    .line 23
    sget-object v0, Lff/x;->a:Lff/x;

    .line 24
    .line 25
    const-class v2, Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p1, v2, v0, v1}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/dto/device/OsJsonAdapter;->stringAdapter:Lhb/r;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public fromJson(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/device/Os;
    .locals 11
    .param p1    # Lhb/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x4

    const/4 v4, 0x1

    const-string v5, "reader"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lhb/w;->b()V

    const/4 v5, 0x0

    const/4 v6, -0x1

    move-object v8, v5

    move-object v9, v8

    move v7, v6

    .line 3
    :goto_0
    invoke-virtual {p1}, Lhb/w;->o()Z

    move-result v10

    if-eqz v10, :cond_5

    .line 4
    iget-object v10, p0, Lcom/qonversion/android/sdk/internal/dto/device/OsJsonAdapter;->options:Lhb/u;

    invoke-virtual {p1, v10}, Lhb/w;->W(Lhb/u;)I

    move-result v10

    if-eq v10, v6, :cond_4

    if-eqz v10, :cond_2

    if-eq v10, v4, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v9, p0, Lcom/qonversion/android/sdk/internal/dto/device/OsJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v9, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    if-eqz v9, :cond_1

    and-int/lit8 v7, v7, -0x3

    goto :goto_0

    :cond_1
    const-string v0, "version"

    invoke-static {v0, v0, p1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 6
    :cond_2
    iget-object v8, p0, Lcom/qonversion/android/sdk/internal/dto/device/OsJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v8, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-eqz v8, :cond_3

    and-int/lit8 v7, v7, -0x2

    goto :goto_0

    :cond_3
    const-string v0, "name"

    invoke-static {v0, v0, p1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 7
    :cond_4
    invoke-virtual {p1}, Lhb/w;->Y()V

    .line 8
    invoke-virtual {p1}, Lhb/w;->Z()V

    goto :goto_0

    .line 9
    :cond_5
    invoke-virtual {p1}, Lhb/w;->h()V

    const/4 p1, -0x4

    if-ne v7, p1, :cond_6

    .line 10
    new-instance p1, Lcom/qonversion/android/sdk/internal/dto/device/Os;

    .line 11
    const-string v0, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p1, v8, v9}, Lcom/qonversion/android/sdk/internal/dto/device/Os;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    .line 14
    :cond_6
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/dto/device/OsJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez p1, :cond_7

    .line 15
    new-array p1, v3, [Ljava/lang/Class;

    const-class v6, Ljava/lang/String;

    aput-object v6, p1, v2

    aput-object v6, p1, v4

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v6, p1, v1

    sget-object v6, Lib/f;->c:Ljava/lang/Class;

    aput-object v6, p1, v0

    .line 16
    const-class v6, Lcom/qonversion/android/sdk/internal/dto/device/Os;

    invoke-virtual {v6, p1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    .line 17
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/dto/device/OsJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    .line 18
    const-string v6, "also(...)"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    :cond_7
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 20
    new-array v3, v3, [Ljava/lang/Object;

    aput-object v8, v3, v2

    aput-object v9, v3, v4

    aput-object v6, v3, v1

    aput-object v5, v3, v0

    .line 21
    invoke-virtual {p1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "newInstance(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/device/Os;

    return-object p1
.end method

.method public bridge synthetic fromJson(Lhb/w;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/dto/device/OsJsonAdapter;->fromJson(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/device/Os;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/device/Os;)V
    .locals 2
    .param p1    # Lhb/C;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/dto/device/Os;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lhb/C;->b()Lhb/C;

    .line 3
    const-string v0, "name"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 4
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/device/OsJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/device/Os;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 5
    const-string v0, "version"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/device/OsJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/device/Os;->getVersion()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 7
    invoke-virtual {p1}, Lhb/C;->i()Lhb/C;

    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lhb/C;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/qonversion/android/sdk/internal/dto/device/Os;

    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/dto/device/OsJsonAdapter;->toJson(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/device/Os;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    const-string v1, "GeneratedJsonAdapter(Os)"

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
