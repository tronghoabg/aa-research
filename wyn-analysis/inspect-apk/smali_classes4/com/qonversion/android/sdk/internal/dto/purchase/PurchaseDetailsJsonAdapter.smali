.class public final Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;
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
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0018R\"\u0010\u001c\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u0018\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;",
        "Lhb/r;",
        "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;",
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
        "(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;",
        "Lhb/C;",
        "writer",
        "value_",
        "Lef/C;",
        "toJson",
        "(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;)V",
        "Lhb/u;",
        "options",
        "Lhb/u;",
        "stringAdapter",
        "Lhb/r;",
        "",
        "longAdapter",
        "",
        "nullableListOfStringAdapter",
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
    .locals 9
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
    const-string v5, "product"

    .line 10
    .line 11
    const-string v6, "product_id"

    .line 12
    .line 13
    const-string v1, "purchase_token"

    .line 14
    .line 15
    const-string v2, "purchase_time"

    .line 16
    .line 17
    const-string v3, "transaction_id"

    .line 18
    .line 19
    const-string v4, "original_transaction_id"

    .line 20
    .line 21
    const-string v7, "context_keys"

    .line 22
    .line 23
    const-string v8, "screen_uid"

    .line 24
    .line 25
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lhb/u;->a([Ljava/lang/String;)Lhb/u;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->options:Lhb/u;

    .line 34
    .line 35
    sget-object v0, Lff/x;->a:Lff/x;

    .line 36
    .line 37
    const-class v1, Ljava/lang/String;

    .line 38
    .line 39
    const-string v2, "purchaseToken"

    .line 40
    .line 41
    invoke-virtual {p1, v1, v0, v2}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iput-object v2, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->stringAdapter:Lhb/r;

    .line 46
    .line 47
    const-string v2, "purchaseTime"

    .line 48
    .line 49
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    invoke-virtual {p1, v3, v0, v2}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iput-object v2, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->longAdapter:Lhb/r;

    .line 56
    .line 57
    const-class v2, Ljava/util/List;

    .line 58
    .line 59
    const/4 v3, 0x1

    .line 60
    new-array v3, v3, [Ljava/lang/reflect/Type;

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    aput-object v1, v3, v4

    .line 64
    .line 65
    invoke-static {v2, v3}, Lhb/P;->f(Ljava/lang/Class;[Ljava/lang/reflect/Type;)Lib/d;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    const-string v3, "contextKeys"

    .line 70
    .line 71
    invoke-virtual {p1, v2, v0, v3}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    iput-object v2, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->nullableListOfStringAdapter:Lhb/r;

    .line 76
    .line 77
    const-string v2, "screenUid"

    .line 78
    .line 79
    invoke-virtual {p1, v1, v0, v2}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->nullableStringAdapter:Lhb/r;

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public fromJson(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;
    .locals 23
    .param p1    # Lhb/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "reader"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Lhb/w;->b()V

    const/4 v2, 0x0

    move-object v4, v2

    move-object v7, v4

    move-object v8, v7

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    .line 3
    :goto_0
    invoke-virtual {v1}, Lhb/w;->o()Z

    move-result v3

    const-string v5, "purchase_token"

    const-string v6, "purchaseToken"

    const-string v13, "purchase_time"

    const-string v14, "purchaseTime"

    const-string v15, "transaction_id"

    move-object/from16 v16, v2

    const-string v2, "transactionId"

    move/from16 v17, v3

    const-string v3, "original_transaction_id"

    move-object/from16 v18, v4

    const-string v4, "originalTransactionId"

    move-object/from16 v19, v7

    const-string v7, "product"

    move-object/from16 v20, v8

    const-string v8, "storeProductId"

    move-object/from16 v21, v9

    const-string v9, "product_id"

    move-object/from16 v22, v10

    const-string v10, "qProductId"

    if-eqz v17, :cond_6

    move-object/from16 v17, v11

    .line 4
    iget-object v11, v0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->options:Lhb/u;

    invoke-virtual {v1, v11}, Lhb/w;->W(Lhb/u;)I

    move-result v11

    packed-switch v11, :pswitch_data_0

    goto :goto_1

    .line 5
    :pswitch_0
    iget-object v2, v0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->nullableStringAdapter:Lhb/r;

    invoke-virtual {v2, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Ljava/lang/String;

    :goto_1
    move-object/from16 v2, v16

    :goto_2
    move-object/from16 v11, v17

    :goto_3
    move-object/from16 v4, v18

    :goto_4
    move-object/from16 v7, v19

    :goto_5
    move-object/from16 v8, v20

    :goto_6
    move-object/from16 v9, v21

    :goto_7
    move-object/from16 v10, v22

    goto :goto_0

    .line 6
    :pswitch_1
    iget-object v2, v0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->nullableListOfStringAdapter:Lhb/r;

    invoke-virtual {v2, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Ljava/util/List;

    move-object/from16 v2, v16

    goto :goto_3

    .line 7
    :pswitch_2
    iget-object v2, v0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v2, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_0

    move-object v10, v2

    move-object/from16 v2, v16

    move-object/from16 v11, v17

    move-object/from16 v4, v18

    move-object/from16 v7, v19

    move-object/from16 v8, v20

    move-object/from16 v9, v21

    goto :goto_0

    :cond_0
    invoke-static {v10, v9, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 8
    :pswitch_3
    iget-object v2, v0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v2, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ljava/lang/String;

    if-eqz v9, :cond_1

    move-object/from16 v2, v16

    move-object/from16 v11, v17

    move-object/from16 v4, v18

    move-object/from16 v7, v19

    move-object/from16 v8, v20

    goto :goto_7

    .line 9
    :cond_1
    invoke-static {v8, v7, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 10
    :pswitch_4
    iget-object v2, v0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v2, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Ljava/lang/String;

    if-eqz v8, :cond_2

    move-object/from16 v2, v16

    move-object/from16 v11, v17

    move-object/from16 v4, v18

    move-object/from16 v7, v19

    goto :goto_6

    .line 11
    :cond_2
    invoke-static {v4, v3, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 12
    :pswitch_5
    iget-object v3, v0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v3, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Ljava/lang/String;

    if-eqz v7, :cond_3

    move-object/from16 v2, v16

    move-object/from16 v11, v17

    move-object/from16 v4, v18

    goto :goto_5

    .line 13
    :cond_3
    invoke-static {v2, v15, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 14
    :pswitch_6
    iget-object v2, v0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->longAdapter:Lhb/r;

    invoke-virtual {v2, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    if-eqz v2, :cond_4

    goto/16 :goto_2

    .line 15
    :cond_4
    invoke-static {v14, v13, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 16
    :pswitch_7
    iget-object v2, v0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v2, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_5

    move-object/from16 v2, v16

    move-object/from16 v11, v17

    goto/16 :goto_4

    .line 17
    :cond_5
    invoke-static {v6, v5, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 18
    :pswitch_8
    invoke-virtual {v1}, Lhb/w;->Y()V

    .line 19
    invoke-virtual {v1}, Lhb/w;->Z()V

    goto/16 :goto_1

    :cond_6
    move-object/from16 v17, v11

    .line 20
    invoke-virtual {v1}, Lhb/w;->h()V

    move-object v11, v3

    .line 21
    new-instance v3, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;

    if-eqz v18, :cond_c

    if-eqz v16, :cond_b

    .line 22
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    if-eqz v19, :cond_a

    if-eqz v20, :cond_9

    if-eqz v21, :cond_8

    if-eqz v22, :cond_7

    move-object/from16 v11, v17

    move-object/from16 v4, v18

    move-object/from16 v7, v19

    move-object/from16 v8, v20

    move-object/from16 v9, v21

    move-object/from16 v10, v22

    .line 23
    invoke-direct/range {v3 .. v12}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v3

    :cond_7
    move-object v2, v9

    move-object v13, v10

    .line 24
    invoke-static {v13, v2, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 25
    :cond_8
    invoke-static {v8, v7, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 26
    :cond_9
    invoke-static {v4, v11, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 27
    :cond_a
    invoke-static {v2, v15, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 28
    :cond_b
    invoke-static {v14, v13, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 29
    :cond_c
    invoke-static {v6, v5, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_8
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
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->fromJson(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;)V
    .locals 3
    .param p1    # Lhb/C;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lhb/C;->b()Lhb/C;

    .line 3
    const-string v0, "purchase_token"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 4
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;->getPurchaseToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 5
    const-string v0, "purchase_time"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->longAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;->getPurchaseTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 7
    const-string v0, "transaction_id"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 8
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;->getTransactionId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 9
    const-string v0, "original_transaction_id"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 10
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;->getOriginalTransactionId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 11
    const-string v0, "product"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;->getStoreProductId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 13
    const-string v0, "product_id"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 14
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;->getQProductId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 15
    const-string v0, "context_keys"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->nullableListOfStringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;->getContextKeys()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 17
    const-string v0, "screen_uid"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 18
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->nullableStringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;->getScreenUid()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 19
    invoke-virtual {p1}, Lhb/C;->i()Lhb/C;

    return-void

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic toJson(Lhb/C;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;

    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;->toJson(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;)V

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
    const-string v1, "GeneratedJsonAdapter(PurchaseDetails)"

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
