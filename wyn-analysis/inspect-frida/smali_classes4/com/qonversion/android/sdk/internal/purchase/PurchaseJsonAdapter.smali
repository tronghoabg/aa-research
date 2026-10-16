.class public final Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;
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
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0018R\"\u0010\u001d\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u0018\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;",
        "Lhb/r;",
        "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
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
        "(Lhb/w;)Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
        "Lhb/C;",
        "writer",
        "value_",
        "Lef/C;",
        "toJson",
        "(Lhb/C;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V",
        "Lhb/u;",
        "options",
        "Lhb/u;",
        "nullableStringAdapter",
        "Lhb/r;",
        "stringAdapter",
        "",
        "longAdapter",
        "",
        "nullableListOfStringAdapter",
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
.field private final longAdapter:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
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
    .locals 8
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
    const-string v4, "purchaseTime"

    .line 10
    .line 11
    const-string v5, "purchaseToken"

    .line 12
    .line 13
    const-string v1, "storeProductId"

    .line 14
    .line 15
    const-string v2, "orderId"

    .line 16
    .line 17
    const-string v3, "originalOrderId"

    .line 18
    .line 19
    const-string v6, "contextKeys"

    .line 20
    .line 21
    const-string v7, "screenUid"

    .line 22
    .line 23
    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lhb/u;->a([Ljava/lang/String;)Lhb/u;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->options:Lhb/u;

    .line 32
    .line 33
    sget-object v0, Lff/x;->a:Lff/x;

    .line 34
    .line 35
    const-class v1, Ljava/lang/String;

    .line 36
    .line 37
    const-string v2, "storeProductId"

    .line 38
    .line 39
    invoke-virtual {p1, v1, v0, v2}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iput-object v2, p0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->nullableStringAdapter:Lhb/r;

    .line 44
    .line 45
    const-string v2, "orderId"

    .line 46
    .line 47
    invoke-virtual {p1, v1, v0, v2}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iput-object v2, p0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->stringAdapter:Lhb/r;

    .line 52
    .line 53
    const-string v2, "purchaseTime"

    .line 54
    .line 55
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 56
    .line 57
    invoke-virtual {p1, v3, v0, v2}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iput-object v2, p0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->longAdapter:Lhb/r;

    .line 62
    .line 63
    const-class v2, Ljava/util/List;

    .line 64
    .line 65
    const/4 v3, 0x1

    .line 66
    new-array v3, v3, [Ljava/lang/reflect/Type;

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    aput-object v1, v3, v4

    .line 70
    .line 71
    invoke-static {v2, v3}, Lhb/P;->f(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lib/d;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    const-string v2, "contextKeys"

    .line 76
    .line 77
    invoke-virtual {p1, v1, v0, v2}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->nullableListOfStringAdapter:Lhb/r;

    .line 82
    .line 83
    return-void
.end method


# virtual methods
.method public fromJson(Lhb/w;)Lcom/qonversion/android/sdk/internal/purchase/Purchase;
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

    move-object v2, v0

    move-object v3, v2

    move-object v4, v3

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    .line 3
    :goto_0
    invoke-virtual {p1}, Lhb/w;->o()Z

    move-result v1

    const-string v5, "orderId"

    const-string v6, "originalOrderId"

    const-string v10, "purchaseTime"

    const-string v11, "purchaseToken"

    if-eqz v1, :cond_4

    .line 4
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->options:Lhb/u;

    invoke-virtual {p1, v1}, Lhb/w;->W(Lhb/u;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 5
    :pswitch_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->nullableStringAdapter:Lhb/r;

    invoke-virtual {v1, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Ljava/lang/String;

    goto :goto_0

    .line 6
    :pswitch_1
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->nullableListOfStringAdapter:Lhb/r;

    invoke-virtual {v1, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Ljava/util/List;

    goto :goto_0

    .line 7
    :pswitch_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v1, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ljava/lang/String;

    if-eqz v7, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    invoke-static {v11, v11, p1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 9
    :pswitch_3
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->longAdapter:Lhb/r;

    invoke-virtual {v0, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_1

    goto :goto_0

    .line 10
    :cond_1
    invoke-static {v10, v10, p1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 11
    :pswitch_4
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v1, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_2

    goto :goto_0

    .line 12
    :cond_2
    invoke-static {v6, v6, p1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 13
    :pswitch_5
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v1, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {v5, v5, p1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 14
    :pswitch_6
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->nullableStringAdapter:Lhb/r;

    invoke-virtual {v1, p1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    goto :goto_0

    .line 15
    :pswitch_7
    invoke-virtual {p1}, Lhb/w;->Y()V

    .line 16
    invoke-virtual {p1}, Lhb/w;->Z()V

    goto :goto_0

    .line 17
    :cond_4
    invoke-virtual {p1}, Lhb/w;->h()V

    .line 18
    new-instance v1, Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    if-eqz v3, :cond_8

    if-eqz v4, :cond_7

    if-eqz v0, :cond_6

    .line 19
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    if-eqz v7, :cond_5

    .line 20
    invoke-direct/range {v1 .. v9}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v1

    .line 21
    :cond_5
    invoke-static {v11, v11, p1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 22
    :cond_6
    invoke-static {v10, v10, p1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 23
    :cond_7
    invoke-static {v6, v6, p1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    .line 24
    :cond_8
    invoke-static {v5, v5, p1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object p1

    throw p1

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_7
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
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->fromJson(Lhb/w;)Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lhb/C;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V
    .locals 3
    .param p1    # Lhb/C;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/purchase/Purchase;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lhb/C;->b()Lhb/C;

    .line 3
    const-string v0, "storeProductId"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 4
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->nullableStringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->getStoreProductId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 5
    const-string v0, "orderId"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->getOrderId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 7
    const-string v0, "originalOrderId"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 8
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->getOriginalOrderId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 9
    const-string v0, "purchaseTime"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 10
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->longAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->getPurchaseTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 11
    const-string v0, "purchaseToken"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->getPurchaseToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 13
    const-string v0, "contextKeys"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 14
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->nullableListOfStringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->getContextKeys()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 15
    const-string v0, "screenUid"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->nullableStringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->getScreenUid()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 17
    invoke-virtual {p1}, Lhb/C;->i()Lhb/C;

    return-void

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lhb/C;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/purchase/PurchaseJsonAdapter;->toJson(Lhb/C;Lcom/qonversion/android/sdk/internal/purchase/Purchase;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/16 v0, 0x1e

    .line 2
    .line 3
    const-string v1, "GeneratedJsonAdapter(Purchase)"

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
