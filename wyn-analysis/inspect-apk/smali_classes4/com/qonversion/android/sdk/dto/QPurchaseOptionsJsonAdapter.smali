.class public final Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;
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
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\"\u0010\u0018\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;",
        "Lhb/r;",
        "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
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
        "(Lhb/w;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
        "Lhb/C;",
        "writer",
        "value_",
        "Lef/C;",
        "toJson",
        "(Lhb/C;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V",
        "Lhb/u;",
        "options",
        "Lhb/u;",
        "",
        "nullableListOfStringAdapter",
        "Lhb/r;",
        "nullableStringAdapter",
        "",
        "booleanAdapter",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "nullableQProductAdapter",
        "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;",
        "nullableQPurchaseUpdatePolicyAdapter",
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
.field private final booleanAdapter:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private volatile constructorRef:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final nullableListOfStringAdapter:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final nullableQProductAdapter:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final nullableQPurchaseUpdatePolicyAdapter:Lhb/r;
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


# direct methods
.method public constructor <init>(Lhb/K;)V
    .locals 7
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
    const-string v3, "applyOffer"

    .line 10
    .line 11
    const-string v4, "oldProduct"

    .line 12
    .line 13
    const-string v1, "contextKeys"

    .line 14
    .line 15
    const-string v2, "offerId"

    .line 16
    .line 17
    const-string v5, "updatePolicy"

    .line 18
    .line 19
    const-string v6, "screenUid"

    .line 20
    .line 21
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lhb/u;->a([Ljava/lang/String;)Lhb/u;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->options:Lhb/u;

    .line 30
    .line 31
    const-class v0, Ljava/lang/String;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    new-array v1, v1, [Ljava/lang/reflect/Type;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    aput-object v0, v1, v2

    .line 38
    .line 39
    const-class v2, Ljava/util/List;

    .line 40
    .line 41
    invoke-static {v2, v1}, Lhb/P;->f(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lib/d;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sget-object v2, Lff/x;->a:Lff/x;

    .line 46
    .line 47
    const-string v3, "contextKeys"

    .line 48
    .line 49
    invoke-virtual {p1, v1, v2, v3}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iput-object v1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->nullableListOfStringAdapter:Lhb/r;

    .line 54
    .line 55
    const-string v1, "offerId"

    .line 56
    .line 57
    invoke-virtual {p1, v0, v2, v1}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->nullableStringAdapter:Lhb/r;

    .line 62
    .line 63
    const-string v0, "applyOffer"

    .line 64
    .line 65
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 66
    .line 67
    invoke-virtual {p1, v1, v2, v0}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->booleanAdapter:Lhb/r;

    .line 72
    .line 73
    const-string v0, "oldProduct"

    .line 74
    .line 75
    const-class v1, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 76
    .line 77
    invoke-virtual {p1, v1, v2, v0}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->nullableQProductAdapter:Lhb/r;

    .line 82
    .line 83
    const-string v0, "updatePolicy"

    .line 84
    .line 85
    const-class v1, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 86
    .line 87
    invoke-virtual {p1, v1, v2, v0}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->nullableQPurchaseUpdatePolicyAdapter:Lhb/r;

    .line 92
    .line 93
    return-void
.end method


# virtual methods
.method public fromJson(Lhb/w;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions;
    .locals 21
    .param p1    # Lhb/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x7

    const/4 v3, 0x6

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/16 v10, 0x8

    const-string v11, "reader"

    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 3
    invoke-virtual {v1}, Lhb/w;->b()V

    const/4 v12, 0x0

    const/4 v13, -0x1

    move-object v15, v12

    move-object/from16 v16, v15

    move-object/from16 v18, v16

    move-object/from16 v19, v18

    move-object/from16 v20, v19

    .line 4
    :goto_0
    invoke-virtual {v1}, Lhb/w;->o()Z

    move-result v14

    if-eqz v14, :cond_1

    .line 5
    iget-object v14, v0, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->options:Lhb/u;

    invoke-virtual {v1, v14}, Lhb/w;->W(Lhb/u;)I

    move-result v14

    packed-switch v14, :pswitch_data_0

    goto :goto_0

    .line 6
    :pswitch_0
    iget-object v14, v0, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->nullableStringAdapter:Lhb/r;

    invoke-virtual {v14, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v14

    move-object/from16 v20, v14

    check-cast v20, Ljava/lang/String;

    and-int/lit8 v13, v13, -0x21

    goto :goto_0

    .line 7
    :pswitch_1
    iget-object v14, v0, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->nullableQPurchaseUpdatePolicyAdapter:Lhb/r;

    invoke-virtual {v14, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v14

    move-object/from16 v19, v14

    check-cast v19, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    and-int/lit8 v13, v13, -0x11

    goto :goto_0

    .line 8
    :pswitch_2
    iget-object v14, v0, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->nullableQProductAdapter:Lhb/r;

    invoke-virtual {v14, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v14

    move-object/from16 v18, v14

    check-cast v18, Lcom/qonversion/android/sdk/dto/products/QProduct;

    and-int/lit8 v13, v13, -0x9

    goto :goto_0

    .line 9
    :pswitch_3
    iget-object v11, v0, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->booleanAdapter:Lhb/r;

    invoke-virtual {v11, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    if-eqz v11, :cond_0

    and-int/lit8 v13, v13, -0x5

    goto :goto_0

    :cond_0
    const-string v2, "applyOffer"

    invoke-static {v2, v2, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 10
    :pswitch_4
    iget-object v14, v0, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->nullableStringAdapter:Lhb/r;

    invoke-virtual {v14, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v14

    move-object/from16 v16, v14

    check-cast v16, Ljava/lang/String;

    and-int/lit8 v13, v13, -0x3

    goto :goto_0

    .line 11
    :pswitch_5
    iget-object v14, v0, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->nullableListOfStringAdapter:Lhb/r;

    invoke-virtual {v14, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Ljava/util/List;

    and-int/lit8 v13, v13, -0x2

    goto :goto_0

    .line 12
    :pswitch_6
    invoke-virtual {v1}, Lhb/w;->Y()V

    .line 13
    invoke-virtual {v1}, Lhb/w;->Z()V

    goto :goto_0

    .line 14
    :cond_1
    invoke-virtual {v1}, Lhb/w;->h()V

    const/16 v1, -0x40

    if-ne v13, v1, :cond_2

    .line 15
    new-instance v14, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    .line 16
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v17

    .line 17
    invoke-direct/range {v14 .. v20}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;-><init>(Ljava/util/List;Ljava/lang/String;ZLcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Ljava/lang/String;)V

    return-object v14

    .line 18
    :cond_2
    iget-object v1, v0, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez v1, :cond_3

    .line 19
    new-array v1, v10, [Ljava/lang/Class;

    const-class v14, Ljava/util/List;

    aput-object v14, v1, v9

    const-class v14, Ljava/lang/String;

    aput-object v14, v1, v8

    sget-object v17, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v17, v1, v7

    const-class v17, Lcom/qonversion/android/sdk/dto/products/QProduct;

    aput-object v17, v1, v6

    const-class v17, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    aput-object v17, v1, v5

    aput-object v14, v1, v4

    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v14, v1, v3

    sget-object v14, Lib/f;->c:Ljava/lang/Class;

    aput-object v14, v1, v2

    .line 20
    const-class v14, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    invoke-virtual {v14, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    .line 21
    iput-object v1, v0, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    .line 22
    const-string v14, "also(...)"

    invoke-static {v1, v14}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    :cond_3
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    .line 24
    new-array v10, v10, [Ljava/lang/Object;

    aput-object v15, v10, v9

    aput-object v16, v10, v8

    aput-object v11, v10, v7

    aput-object v18, v10, v6

    aput-object v19, v10, v5

    aput-object v20, v10, v4

    aput-object v13, v10, v3

    aput-object v12, v10, v2

    .line 25
    invoke-virtual {v1, v10}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "newInstance(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    return-object v1

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic fromJson(Lhb/w;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->fromJson(Lhb/w;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lhb/C;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V
    .locals 2
    .param p1    # Lhb/C;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/dto/QPurchaseOptions;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lhb/C;->b()Lhb/C;

    .line 3
    const-string v0, "contextKeys"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 4
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->nullableListOfStringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;->getContextKeys$sdk_release()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 5
    const-string v0, "offerId"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->nullableStringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;->getOfferId$sdk_release()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 7
    const-string v0, "applyOffer"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 8
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->booleanAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;->getApplyOffer$sdk_release()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 9
    const-string v0, "oldProduct"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 10
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->nullableQProductAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;->getOldProduct$sdk_release()Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 11
    const-string v0, "updatePolicy"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->nullableQPurchaseUpdatePolicyAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;->getUpdatePolicy$sdk_release()Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 13
    const-string v0, "screenUid"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 14
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->nullableStringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;->getScreenUid$sdk_release()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 15
    invoke-virtual {p1}, Lhb/C;->i()Lhb/C;

    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lhb/C;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/dto/QPurchaseOptionsJsonAdapter;->toJson(Lhb/C;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/16 v0, 0x26

    .line 2
    .line 3
    const-string v1, "GeneratedJsonAdapter(QPurchaseOptions)"

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
