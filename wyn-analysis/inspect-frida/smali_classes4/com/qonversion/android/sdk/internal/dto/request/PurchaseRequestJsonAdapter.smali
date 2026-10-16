.class public final Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;
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
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u0019R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;",
        "Lhb/r;",
        "Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;",
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
        "(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;",
        "Lhb/C;",
        "writer",
        "value_",
        "Lef/C;",
        "toJson",
        "(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;)V",
        "Lhb/u;",
        "options",
        "Lhb/u;",
        "",
        "longAdapter",
        "Lhb/r;",
        "Lcom/qonversion/android/sdk/internal/dto/Environment;",
        "environmentAdapter",
        "stringAdapter",
        "nullableStringAdapter",
        "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;",
        "purchaseDetailsAdapter",
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
            "Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final environmentAdapter:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final longAdapter:Lhb/r;
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

.field private final purchaseDetailsAdapter:Lhb/r;
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
    const-string v7, "debug_mode"

    .line 10
    .line 11
    const-string v8, "purchase"

    .line 12
    .line 13
    const-string v1, "install_date"

    .line 14
    .line 15
    const-string v2, "device"

    .line 16
    .line 17
    const-string v3, "version"

    .line 18
    .line 19
    const-string v4, "access_token"

    .line 20
    .line 21
    const-string v5, "q_uid"

    .line 22
    .line 23
    const-string v6, "receipt"

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
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->options:Lhb/u;

    .line 34
    .line 35
    sget-object v0, Lff/x;->a:Lff/x;

    .line 36
    .line 37
    const-string v1, "installDate"

    .line 38
    .line 39
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 40
    .line 41
    invoke-virtual {p1, v2, v0, v1}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iput-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->longAdapter:Lhb/r;

    .line 46
    .line 47
    const-string v1, "device"

    .line 48
    .line 49
    const-class v2, Lcom/qonversion/android/sdk/internal/dto/Environment;

    .line 50
    .line 51
    invoke-virtual {p1, v2, v0, v1}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iput-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->environmentAdapter:Lhb/r;

    .line 56
    .line 57
    const-string v1, "version"

    .line 58
    .line 59
    const-class v2, Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {p1, v2, v0, v1}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iput-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->stringAdapter:Lhb/r;

    .line 66
    .line 67
    const-string v1, "clientUid"

    .line 68
    .line 69
    invoke-virtual {p1, v2, v0, v1}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iput-object v1, p0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->nullableStringAdapter:Lhb/r;

    .line 74
    .line 75
    const-string v1, "purchase"

    .line 76
    .line 77
    const-class v2, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;

    .line 78
    .line 79
    invoke-virtual {p1, v2, v0, v1}, Lhb/K;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lhb/r;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->purchaseDetailsAdapter:Lhb/r;

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public fromJson(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;
    .locals 34
    .param p1    # Lhb/w;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v13, "reader"

    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v1}, Lhb/w;->b()V

    const/4 v14, -0x1

    const/4 v2, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x9

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    .line 3
    :goto_0
    invoke-virtual {v1}, Lhb/w;->o()Z

    move-result v17

    const/16 v18, 0x8

    const/16 v3, -0x21

    const/16 v23, 0x7

    const-string v4, "install_date"

    const/16 v26, 0x6

    const-string v5, "installDate"

    const/16 v27, 0x5

    const-string v6, "access_token"

    const/16 v28, 0x4

    const-string v7, "accessToken"

    const/16 v29, 0x3

    const-string v8, "debug_mode"

    const/16 v30, 0x2

    const-string v9, "debugMode"

    const/16 v31, 0x1

    const-string v10, "device"

    const/16 v32, 0x0

    const-string v11, "version"

    const/16 v33, 0x0

    const-string v13, "purchase"

    if-eqz v17, :cond_7

    .line 4
    iget-object v12, v0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->options:Lhb/u;

    invoke-virtual {v1, v12}, Lhb/w;->W(Lhb/u;)I

    move-result v12

    packed-switch v12, :pswitch_data_0

    goto :goto_0

    .line 5
    :pswitch_0
    iget-object v3, v0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->purchaseDetailsAdapter:Lhb/r;

    invoke-virtual {v3, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v25, v3

    check-cast v25, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;

    if-eqz v25, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {v13, v13, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 7
    :pswitch_1
    iget-object v3, v0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v3, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v24, v3

    check-cast v24, Ljava/lang/String;

    if-eqz v24, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v9, v8, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 8
    :pswitch_2
    iget-object v2, v0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v2, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_2

    move v14, v3

    goto :goto_0

    :cond_2
    const-string v2, "receipt"

    invoke-static {v2, v2, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 9
    :pswitch_3
    iget-object v3, v0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->nullableStringAdapter:Lhb/r;

    invoke-virtual {v3, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v22, v3

    check-cast v22, Ljava/lang/String;

    goto :goto_0

    .line 10
    :pswitch_4
    iget-object v3, v0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v3, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v21, v3

    check-cast v21, Ljava/lang/String;

    if-eqz v21, :cond_3

    goto/16 :goto_0

    .line 11
    :cond_3
    invoke-static {v7, v6, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 12
    :pswitch_5
    iget-object v3, v0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {v3, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v20, v3

    check-cast v20, Ljava/lang/String;

    if-eqz v20, :cond_4

    goto/16 :goto_0

    :cond_4
    invoke-static {v11, v11, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 13
    :pswitch_6
    iget-object v3, v0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->environmentAdapter:Lhb/r;

    invoke-virtual {v3, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v19, v3

    check-cast v19, Lcom/qonversion/android/sdk/internal/dto/Environment;

    if-eqz v19, :cond_5

    goto/16 :goto_0

    :cond_5
    invoke-static {v10, v10, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 14
    :pswitch_7
    iget-object v3, v0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->longAdapter:Lhb/r;

    invoke-virtual {v3, v1}, Lhb/r;->fromJson(Lhb/w;)Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Ljava/lang/Long;

    if-eqz v15, :cond_6

    goto/16 :goto_0

    :cond_6
    invoke-static {v5, v4, v1}, Lib/f;->l(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 15
    :pswitch_8
    invoke-virtual {v1}, Lhb/w;->Y()V

    .line 16
    invoke-virtual {v1}, Lhb/w;->Z()V

    goto/16 :goto_0

    .line 17
    :cond_7
    invoke-virtual {v1}, Lhb/w;->h()V

    if-ne v14, v3, :cond_e

    .line 18
    new-instance v16, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;

    if-eqz v15, :cond_d

    .line 19
    invoke-virtual {v15}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    if-eqz v19, :cond_c

    if-eqz v20, :cond_b

    if-eqz v21, :cond_a

    .line 20
    const-string v3, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v24, :cond_9

    if-eqz v25, :cond_8

    move-object/from16 v23, v2

    .line 21
    invoke-direct/range {v16 .. v25}, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;-><init>(JLcom/qonversion/android/sdk/internal/dto/Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;)V

    return-object v16

    .line 22
    :cond_8
    invoke-static {v13, v13, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 23
    :cond_9
    invoke-static {v9, v8, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 24
    :cond_a
    invoke-static {v7, v6, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 25
    :cond_b
    invoke-static {v11, v11, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 26
    :cond_c
    invoke-static {v10, v10, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 27
    :cond_d
    invoke-static {v5, v4, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 28
    :cond_e
    iget-object v3, v0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    if-nez v3, :cond_f

    const/16 v12, 0xa

    .line 29
    new-array v3, v12, [Ljava/lang/Class;

    sget-object v12, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v12, v3, v32

    const-class v12, Lcom/qonversion/android/sdk/internal/dto/Environment;

    aput-object v12, v3, v31

    const-class v12, Ljava/lang/String;

    aput-object v12, v3, v30

    aput-object v12, v3, v29

    aput-object v12, v3, v28

    aput-object v12, v3, v27

    aput-object v12, v3, v26

    const-class v12, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;

    aput-object v12, v3, v23

    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v12, v3, v18

    sget-object v12, Lib/f;->c:Ljava/lang/Class;

    aput-object v12, v3, v16

    .line 30
    const-class v12, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;

    invoke-virtual {v12, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    .line 31
    iput-object v3, v0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->constructorRef:Ljava/lang/reflect/Constructor;

    .line 32
    const-string v12, "also(...)"

    invoke-static {v3, v12}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_f
    if-eqz v15, :cond_15

    if-eqz v19, :cond_14

    if-eqz v20, :cond_13

    if-eqz v21, :cond_12

    if-eqz v24, :cond_11

    if-eqz v25, :cond_10

    .line 33
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v12, 0xa

    .line 34
    new-array v4, v12, [Ljava/lang/Object;

    aput-object v15, v4, v32

    aput-object v19, v4, v31

    aput-object v20, v4, v30

    aput-object v21, v4, v29

    aput-object v22, v4, v28

    aput-object v2, v4, v27

    aput-object v24, v4, v26

    aput-object v25, v4, v23

    aput-object v1, v4, v18

    aput-object v33, v4, v16

    .line 35
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 36
    const-string v2, "newInstance(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;

    return-object v1

    :cond_10
    invoke-static {v13, v13, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 37
    :cond_11
    invoke-static {v9, v8, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 38
    :cond_12
    invoke-static {v7, v6, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 39
    :cond_13
    invoke-static {v11, v11, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 40
    :cond_14
    invoke-static {v10, v10, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

    move-result-object v1

    throw v1

    .line 41
    :cond_15
    invoke-static {v5, v4, v1}, Lib/f;->f(Ljava/lang/String;Ljava/lang/String;Lhb/w;)LE5/Q;

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
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->fromJson(Lhb/w;)Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;

    move-result-object p1

    return-object p1
.end method

.method public toJson(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;)V
    .locals 3
    .param p1    # Lhb/C;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lhb/C;->b()Lhb/C;

    .line 3
    const-string v0, "install_date"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 4
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->longAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;->getInstallDate()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 5
    const-string v0, "device"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->environmentAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;->getDevice()Lcom/qonversion/android/sdk/internal/dto/Environment;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 7
    const-string v0, "version"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 8
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 9
    const-string v0, "access_token"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 10
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;->getAccessToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 11
    const-string v0, "q_uid"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->nullableStringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;->getClientUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 13
    const-string v0, "receipt"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 14
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;->getReceipt()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 15
    const-string v0, "debug_mode"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->stringAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;->getDebugMode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lhb/r;->toJson(Lhb/C;Ljava/lang/Object;)V

    .line 17
    const-string v0, "purchase"

    invoke-virtual {p1, v0}, Lhb/C;->w(Ljava/lang/String;)Lhb/C;

    .line 18
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->purchaseDetailsAdapter:Lhb/r;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;->getPurchase()Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;

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
    check-cast p2, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;

    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequestJsonAdapter;->toJson(Lhb/C;Lcom/qonversion/android/sdk/internal/dto/request/PurchaseRequest;)V

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
    const-string v1, "GeneratedJsonAdapter(PurchaseRequest)"

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
