.class public final Lcom/qonversion/android/sdk/dto/offerings/QOfferingJsonAdapter;
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
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001c0\u001b0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u0018R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/offerings/QOfferingJsonAdapter;",
        "Lhb/r;",
        "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
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
        "(Lhb/w;)Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
        "Lhb/C;",
        "writer",
        "value_",
        "Lef/C;",
        "toJson",
        "(Lhb/C;Lcom/qonversion/android/sdk/dto/offerings/QOffering;)V",
        "Lhb/u;",
        "options",
        "Lhb/u;",
        "stringAdapter",
        "Lhb/r;",
        "Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;",
        "qOfferingTagAdapter",
        "",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "listOfQProductAdapter",
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
            "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final listOfQProductAdapter:Lhb/r;
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

.field private final qOfferingTagAdapter:Lhb/r;
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
    const-string v0, "id"

    .line 10
    .line 11
    const-string v1, "tag"

    .line 12
    .line 13
    const-string v2, "products"

    .line 14
    .line 15
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lhb/u;->a([Ljava/lang/String;)Lhb/u;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingJsonAdapter;->options:Lhb/u;

    .line 24
    .line 25
    sget-object v0, Lff/x;->a:Lff/x;

    .line 26
    .line 27
    const-string v3, "offeringID"

    .line 28
    .line 29
    const-class v4, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1, v4, v0, v3}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iput-object v3, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingJsonAdapter;->stringAdapter:Lhb/r;

    .line 36
    .line 37
    const-class v3, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    .line 38
    .line 39
    invoke-virtual {p1, v3, v0, v1}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingJsonAdapter;->qOfferingTagAdapter:Lhb/r;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    new-array v1, v1, [Ljava/lang/reflect/Type;

    .line 47
    .line 48
    const-class v3, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    aput-object v3, v1, v4

    .line 52
    .line 53
    const-class v3, Ljava/util/List;

    .line 54
    .line 55
    invoke-static {v3, v1}, Lhb/P;->f(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lib/d;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {p1, v1, v0, v2}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingJsonAdapter;->listOfQProductAdapter:Lhb/r;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public fromJson(Lhb/w;)Lcom/qonversion/android/sdk/dto/offerings/QOffering;
    .locals 19
    .param p1    # Lhb/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v5, 0x5

    const/4 v6, 0x2

    const/4 v7, 0x1

    const-string v8, "reader"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Lhb/w;->b()V

    const/4 v8, 0x0

    const/4 v9, -0x1

    move-object v11, v8

    move-object v12, v11

    move-object v13, v12

    move v10, v9

    .line 3
    :goto_0
    invoke-virtual {v1}, Lhb/w;->o()Z

    move-result v14

    const/4 v15, -0x5

    const/16 v16, 0x4

    const-string v2, "id"

    const/16 v17, 0x3

    const-string v3, "offeringID"

    const/16 v18, 0x0

    const-string v4, "tag"

    if-eqz v14, :cond_7

    .line 4
    iget-object v14, v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingJsonAdapter;->options:Lhb/u;

    invoke-virtual {v1, v14}, Lhb/w;->W(Lhb/u;)I

    move-result v14

    if-eq v14, v9, :cond_6

    if-eqz v14, :cond_4

    if-eq v14, v7, :cond_2

    if-eq v14, v6, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v2, v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingJsonAdapter;->listOfQProductAdapter:Lhb/r;

    invoke-virtual {v2, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Ljava/util/List;

    if-eqz v13, :cond_1

    move v10, v15

    goto :goto_0

    :cond_1
    const-string v2, "products"

    invoke-static {v2, v2, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 6
    :cond_2
    iget-object v2, v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingJsonAdapter;->qOfferingTagAdapter:Lhb/r;

    invoke-virtual {v2, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    if-eqz v12, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {v4, v4, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 7
    :cond_4
    iget-object v4, v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v4, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Ljava/lang/String;

    if-eqz v11, :cond_5

    goto :goto_0

    :cond_5
    invoke-static {v3, v2, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 8
    :cond_6
    invoke-virtual {v1}, Lhb/w;->Y()V

    .line 9
    invoke-virtual {v1}, Lhb/w;->Z()V

    goto :goto_0

    .line 10
    :cond_7
    invoke-virtual {v1}, Lhb/w;->h()V

    if-ne v10, v15, :cond_a

    .line 11
    new-instance v5, Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    if-eqz v11, :cond_9

    if-eqz v12, :cond_8

    .line 12
    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<com.qonversion.android.sdk.dto.products.QProduct>"

    invoke-static {v13, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {v5, v11, v12, v13}, Lcom/qonversion/android/sdk/dto/offerings/QOffering;-><init>(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;Ljava/util/List;)V

    return-object v5

    .line 14
    :cond_8
    invoke-static {v4, v4, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 15
    :cond_9
    invoke-static {v3, v2, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 16
    :cond_a
    iget-object v9, v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez v9, :cond_b

    .line 17
    new-array v9, v5, [Ljava/lang/Class;

    const-class v14, Ljava/lang/String;

    aput-object v14, v9, v18

    const-class v14, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    aput-object v14, v9, v7

    const-class v14, Ljava/util/List;

    aput-object v14, v9, v6

    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v14, v9, v17

    sget-object v14, Lib/f;->c:Ljava/lang/Class;

    aput-object v14, v9, v16

    .line 18
    const-class v14, Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    invoke-virtual {v14, v9}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    .line 19
    iput-object v9, v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    .line 20
    const-string v14, "also(...)"

    invoke-static {v9, v14}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_b
    if-eqz v11, :cond_d

    if-eqz v12, :cond_c

    .line 21
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 22
    new-array v2, v5, [Ljava/lang/Object;

    aput-object v11, v2, v18

    aput-object v12, v2, v7

    aput-object v13, v2, v6

    aput-object v1, v2, v17

    aput-object v8, v2, v16

    .line 23
    invoke-virtual {v9, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 24
    const-string v2, "newInstance(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    return-object v1

    :cond_c
    invoke-static {v4, v4, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 25
    :cond_d
    invoke-static {v3, v2, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1
.end method

.method public bridge synthetic fromJson(Lhb/w;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/dto/offerings/QOfferingJsonAdapter;->fromJson(Lhb/w;)Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lhb/C;Lcom/qonversion/android/sdk/dto/offerings/QOffering;)V
    .locals 2
    .param p1    # Lhb/C;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/dto/offerings/QOffering;
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
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->getOfferingID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 5
    const-string v0, "tag"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingJsonAdapter;->qOfferingTagAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->getTag()Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 7
    const-string v0, "products"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 8
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferingJsonAdapter;->listOfQProductAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->getProducts()Ljava/util/List;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 9
    invoke-virtual {p1}, Lhb/C;->i()Lhb/C;

    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lhb/C;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/dto/offerings/QOfferingJsonAdapter;->toJson(Lhb/C;Lcom/qonversion/android/sdk/dto/offerings/QOffering;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/16 v0, 0x1f

    .line 2
    .line 3
    const-string v1, "GeneratedJsonAdapter(QOffering)"

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
