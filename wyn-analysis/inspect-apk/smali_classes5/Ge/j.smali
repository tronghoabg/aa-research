.class public final LGe/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;
.implements Lcom/qonversion/android/sdk/listeners/QonversionOfferingsCallback;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LGe/u;


# direct methods
.method public constructor <init>(LGe/u;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LGe/j;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LGe/j;->b:LGe/u;

    return-void
.end method

.method public constructor <init>(LGe/u;LGe/t;)V
    .locals 0

    const/4 p2, 0x0

    iput p2, p0, LGe/j;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LGe/j;->b:LGe/u;

    return-void
.end method


# virtual methods
.method public final onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1

    .line 1
    iget v0, p0, LGe/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "error"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, LGe/c;->l(Lcom/qonversion/android/sdk/dto/QonversionError;)LGe/v;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, LGe/j;->b:LGe/u;

    .line 16
    .line 17
    invoke-interface {v0, p1}, LGe/u;->onError(LGe/v;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    const-string v0, "error"

    .line 22
    .line 23
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, LGe/c;->l(Lcom/qonversion/android/sdk/dto/QonversionError;)LGe/v;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p0, LGe/j;->b:LGe/u;

    .line 31
    .line 32
    invoke-interface {v0, p1}, LGe/u;->onError(LGe/v;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onSuccess()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    invoke-static {v0}, LGe/t;->a(Z)Ljava/util/Map;

    move-result-object v0

    .line 2
    iget-object v1, p0, LGe/j;->b:LGe/u;

    invoke-interface {v1, v0}, LGe/u;->onSuccess(Ljava/util/Map;)V

    return-void
.end method

.method public onSuccess(Lcom/qonversion/android/sdk/dto/offerings/QOfferings;)V
    .locals 3

    const-string v0, "offerings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->getMain()Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LGe/c;->f(Lcom/qonversion/android/sdk/dto/offerings/QOffering;)Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    :goto_0
    new-instance v1, Lef/k;

    const-string v2, "main"

    invoke-direct {v1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 5
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->getAvailableOfferings()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 7
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 8
    check-cast v2, Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    .line 9
    invoke-static {v2}, LGe/c;->f(Lcom/qonversion/android/sdk/dto/offerings/QOffering;)Ljava/util/Map;

    move-result-object v2

    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 11
    :cond_1
    new-instance p1, Lef/k;

    const-string v2, "availableOfferings"

    invoke-direct {p1, v2, v0}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x2

    .line 12
    new-array v0, v0, [Lef/k;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p1, v0, v1

    .line 13
    invoke-static {v0}, Lff/A;->R([Lef/k;)Ljava/util/Map;

    move-result-object p1

    .line 14
    iget-object v0, p0, LGe/j;->b:LGe/u;

    invoke-interface {v0, p1}, LGe/u;->onSuccess(Ljava/util/Map;)V

    return-void
.end method
