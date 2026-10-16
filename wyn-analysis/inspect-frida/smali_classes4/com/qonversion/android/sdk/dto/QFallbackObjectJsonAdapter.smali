.class public final Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;
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
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001aR.\u0010\u001e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u001d\u0018\u00010\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u001aR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;",
        "Lhb/r;",
        "Lcom/qonversion/android/sdk/dto/QFallbackObject;",
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
        "(Lhb/w;)Lcom/qonversion/android/sdk/dto/QFallbackObject;",
        "Lhb/C;",
        "writer",
        "value_",
        "Lef/C;",
        "toJson",
        "(Lhb/C;Lcom/qonversion/android/sdk/dto/QFallbackObject;)V",
        "Lhb/u;",
        "options",
        "Lhb/u;",
        "",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "mapOfStringQProductAdapter",
        "Lhb/r;",
        "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;",
        "nullableQOfferingsAdapter",
        "",
        "nullableMapOfStringListOfStringAdapter",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfigList;",
        "nullableQRemoteConfigListAdapter",
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
            "Lcom/qonversion/android/sdk/dto/QFallbackObject;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final mapOfStringQProductAdapter:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final nullableMapOfStringListOfStringAdapter:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final nullableQOfferingsAdapter:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final nullableQRemoteConfigListAdapter:Lhb/r;
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


# direct methods
.method public constructor <init>(Lhb/K;)V
    .locals 9
    .param p1    # Lhb/K;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const-string v3, "moshi"

    .line 5
    .line 6
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v3, "products"

    .line 13
    .line 14
    const-string v4, "offerings"

    .line 15
    .line 16
    const-string v5, "products_permissions"

    .line 17
    .line 18
    const-string v6, "remote_config_list"

    .line 19
    .line 20
    filled-new-array {v3, v4, v5, v6}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-static {v5}, Lhb/u;->a([Ljava/lang/String;)Lhb/u;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    iput-object v5, p0, Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;->options:Lhb/u;

    .line 29
    .line 30
    const-class v5, Ljava/lang/String;

    .line 31
    .line 32
    new-array v6, v0, [Ljava/lang/reflect/Type;

    .line 33
    .line 34
    aput-object v5, v6, v2

    .line 35
    .line 36
    const-class v7, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 37
    .line 38
    aput-object v7, v6, v1

    .line 39
    .line 40
    const-class v7, Ljava/util/Map;

    .line 41
    .line 42
    invoke-static {v7, v6}, Lhb/P;->f(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lib/d;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    sget-object v8, Lff/x;->a:Lff/x;

    .line 47
    .line 48
    invoke-virtual {p1, v6, v8, v3}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    iput-object v3, p0, Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;->mapOfStringQProductAdapter:Lhb/r;

    .line 53
    .line 54
    const-class v3, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;

    .line 55
    .line 56
    invoke-virtual {p1, v3, v8, v4}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    iput-object v3, p0, Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;->nullableQOfferingsAdapter:Lhb/r;

    .line 61
    .line 62
    const-class v3, Ljava/util/List;

    .line 63
    .line 64
    new-array v4, v1, [Ljava/lang/reflect/Type;

    .line 65
    .line 66
    aput-object v5, v4, v2

    .line 67
    .line 68
    invoke-static {v3, v4}, Lhb/P;->f(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lib/d;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    new-array v0, v0, [Ljava/lang/reflect/Type;

    .line 73
    .line 74
    aput-object v5, v0, v2

    .line 75
    .line 76
    aput-object v3, v0, v1

    .line 77
    .line 78
    invoke-static {v7, v0}, Lhb/P;->f(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lib/d;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v1, "productPermissions"

    .line 83
    .line 84
    invoke-virtual {p1, v0, v8, v1}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;->nullableMapOfStringListOfStringAdapter:Lhb/r;

    .line 89
    .line 90
    const-string v0, "remoteConfigList"

    .line 91
    .line 92
    const-class v1, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;

    .line 93
    .line 94
    invoke-virtual {p1, v1, v8, v0}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;->nullableQRemoteConfigListAdapter:Lhb/r;

    .line 99
    .line 100
    return-void
.end method


# virtual methods
.method public fromJson(Lhb/w;)Lcom/qonversion/android/sdk/dto/QFallbackObject;
    .locals 18
    .param p1    # Lhb/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const-string v9, "reader"

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Lhb/w;->b()V

    const/4 v9, 0x0

    const/4 v10, -0x1

    move-object v12, v9

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move v11, v10

    .line 3
    :goto_0
    invoke-virtual {v1}, Lhb/w;->o()Z

    move-result v16

    const/16 v17, 0x5

    const/4 v2, -0x2

    if-eqz v16, :cond_6

    const/16 v16, 0x4

    .line 4
    iget-object v3, v0, Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;->options:Lhb/u;

    invoke-virtual {v1, v3}, Lhb/w;->W(Lhb/u;)I

    move-result v3

    if-eq v3, v10, :cond_5

    if-eqz v3, :cond_3

    if-eq v3, v8, :cond_2

    if-eq v3, v7, :cond_1

    if-eq v3, v6, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v2, v0, Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;->nullableQRemoteConfigListAdapter:Lhb/r;

    invoke-virtual {v2, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;

    goto :goto_0

    .line 6
    :cond_1
    iget-object v2, v0, Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;->nullableMapOfStringListOfStringAdapter:Lhb/r;

    invoke-virtual {v2, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Ljava/util/Map;

    goto :goto_0

    .line 7
    :cond_2
    iget-object v2, v0, Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;->nullableQOfferingsAdapter:Lhb/r;

    invoke-virtual {v2, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;

    goto :goto_0

    .line 8
    :cond_3
    iget-object v3, v0, Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;->mapOfStringQProductAdapter:Lhb/r;

    invoke-virtual {v3, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Ljava/util/Map;

    if-eqz v12, :cond_4

    move v11, v2

    goto :goto_0

    .line 9
    :cond_4
    const-string v2, "products"

    invoke-static {v2, v2, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 10
    :cond_5
    invoke-virtual {v1}, Lhb/w;->Y()V

    .line 11
    invoke-virtual {v1}, Lhb/w;->Z()V

    goto :goto_0

    :cond_6
    const/16 v16, 0x4

    .line 12
    invoke-virtual {v1}, Lhb/w;->h()V

    if-ne v11, v2, :cond_7

    .line 13
    new-instance v1, Lcom/qonversion/android/sdk/dto/QFallbackObject;

    .line 14
    const-string v2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.qonversion.android.sdk.dto.products.QProduct>"

    invoke-static {v12, v2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {v1, v12, v13, v14, v15}, Lcom/qonversion/android/sdk/dto/QFallbackObject;-><init>(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/offerings/QOfferings;Ljava/util/Map;Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)V

    return-object v1

    .line 16
    :cond_7
    iget-object v1, v0, Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez v1, :cond_8

    .line 17
    new-array v1, v5, [Ljava/lang/Class;

    const-class v2, Ljava/util/Map;

    aput-object v2, v1, v4

    const-class v3, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;

    aput-object v3, v1, v8

    aput-object v2, v1, v7

    const-class v2, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;

    aput-object v2, v1, v6

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v2, v1, v16

    sget-object v2, Lib/f;->c:Ljava/lang/Class;

    aput-object v2, v1, v17

    .line 18
    const-class v2, Lcom/qonversion/android/sdk/dto/QFallbackObject;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    .line 19
    iput-object v1, v0, Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    .line 20
    const-string v2, "also(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    :cond_8
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 22
    new-array v3, v5, [Ljava/lang/Object;

    aput-object v12, v3, v4

    aput-object v13, v3, v8

    aput-object v14, v3, v7

    aput-object v15, v3, v6

    aput-object v2, v3, v16

    aput-object v9, v3, v17

    .line 23
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "newInstance(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/qonversion/android/sdk/dto/QFallbackObject;

    return-object v1
.end method

.method public bridge synthetic fromJson(Lhb/w;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;->fromJson(Lhb/w;)Lcom/qonversion/android/sdk/dto/QFallbackObject;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lhb/C;Lcom/qonversion/android/sdk/dto/QFallbackObject;)V
    .locals 2
    .param p1    # Lhb/C;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/dto/QFallbackObject;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lhb/C;->b()Lhb/C;

    .line 3
    const-string v0, "products"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 4
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;->mapOfStringQProductAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/QFallbackObject;->getProducts()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 5
    const-string v0, "offerings"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;->nullableQOfferingsAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/QFallbackObject;->getOfferings()Lcom/qonversion/android/sdk/dto/offerings/QOfferings;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 7
    const-string v0, "products_permissions"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 8
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;->nullableMapOfStringListOfStringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/QFallbackObject;->getProductPermissions()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 9
    const-string v0, "remote_config_list"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 10
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;->nullableQRemoteConfigListAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/QFallbackObject;->getRemoteConfigList()Lcom/qonversion/android/sdk/dto/QRemoteConfigList;

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
    check-cast p2, Lcom/qonversion/android/sdk/dto/QFallbackObject;

    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;->toJson(Lhb/C;Lcom/qonversion/android/sdk/dto/QFallbackObject;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/16 v0, 0x25

    .line 2
    .line 3
    const-string v1, "GeneratedJsonAdapter(QFallbackObject)"

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
