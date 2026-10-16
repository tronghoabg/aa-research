.class public final LGe/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;
.implements Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LGe/u;


# direct methods
.method public synthetic constructor <init>(LGe/u;I)V
    .locals 0

    .line 1
    iput p2, p0, LGe/l;->a:I

    iput-object p1, p0, LGe/l;->b:LGe/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1

    .line 1
    iget v0, p0, LGe/l;->a:I

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
    iget-object v0, p0, LGe/l;->b:LGe/u;

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
    iget-object v0, p0, LGe/l;->b:LGe/u;

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

.method public onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)V
    .locals 1

    const-string v0, "remoteConfigList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, LGe/c;->e(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, LGe/l;->b:LGe/u;

    invoke-interface {v0, p1}, LGe/u;->onSuccess(Ljava/util/Map;)V

    return-void
.end method

.method public onSuccess(Ljava/util/Map;)V
    .locals 5

    const-string v0, "eligibilities"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lff/B;->D(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 3
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 5
    check-cast v1, Ljava/util/Map$Entry;

    .line 6
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 7
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;

    .line 8
    const-string v3, "<this>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;->getStatus()Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->getType()Ljava/lang/String;

    move-result-object v1

    .line 10
    new-instance v3, Lef/k;

    const-string v4, "status"

    invoke-direct {v3, v4, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 11
    invoke-static {v3}, Lff/B;->E(Lef/k;)Ljava/util/Map;

    move-result-object v1

    .line 12
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 13
    :cond_0
    iget-object p1, p0, LGe/l;->b:LGe/u;

    invoke-interface {p1, v0}, LGe/u;->onSuccess(Ljava/util/Map;)V

    return-void
.end method
