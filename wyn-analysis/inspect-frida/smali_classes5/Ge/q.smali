.class public final LGe/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:LGe/t;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/Boolean;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/util/List;

.field public final synthetic h:Landroid/app/Activity;

.field public final synthetic i:LGe/n;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;LGe/t;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Landroid/app/Activity;LGe/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LGe/q;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, LGe/q;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, LGe/q;->c:LGe/t;

    .line 9
    .line 10
    iput-object p4, p0, LGe/q;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, LGe/q;->e:Ljava/lang/Boolean;

    .line 13
    .line 14
    iput-object p6, p0, LGe/q;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, LGe/q;->g:Ljava/util/List;

    .line 17
    .line 18
    iput-object p8, p0, LGe/q;->h:Landroid/app/Activity;

    .line 19
    .line 20
    iput-object p9, p0, LGe/q;->i:LGe/n;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LGe/q;->i:LGe/n;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LGe/n;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onSuccess(Ljava/util/Map;)V
    .locals 10

    .line 1
    const-string v0, "products"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LGe/q;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 13
    .line 14
    iget-object v1, p0, LGe/q;->b:Ljava/lang/String;

    .line 15
    .line 16
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 21
    .line 22
    iget-object v1, p0, LGe/q;->c:LGe/t;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v1, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;

    .line 28
    .line 29
    invoke-direct {v1}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;-><init>()V

    .line 30
    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->setOldProduct(Lcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v2, p0, LGe/q;->f:Ljava/lang/String;

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    :try_start_0
    invoke-static {v2}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;->valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 42
    .line 43
    .line 44
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    goto :goto_0

    .line 46
    :catch_0
    const/4 v2, 0x0

    .line 47
    :goto_0
    if-eqz v2, :cond_1

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->setUpdatePolicy(Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;

    .line 50
    .line 51
    .line 52
    :cond_1
    iget-object v2, p0, LGe/q;->d:Ljava/lang/String;

    .line 53
    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->setOfferId(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;

    .line 57
    .line 58
    .line 59
    :cond_2
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 60
    .line 61
    iget-object v3, p0, LGe/q;->e:Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_3

    .line 68
    .line 69
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->removeOffer()Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;

    .line 70
    .line 71
    .line 72
    :cond_3
    iget-object v2, p0, LGe/q;->g:Ljava/util/List;

    .line 73
    .line 74
    if-eqz v2, :cond_4

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->setContextKeys(Ljava/util/List;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;

    .line 77
    .line 78
    .line 79
    :cond_4
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->build()Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iget-object v2, p0, LGe/q;->h:Landroid/app/Activity;

    .line 84
    .line 85
    iget-object v3, p0, LGe/q;->i:LGe/n;

    .line 86
    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    if-eqz p1, :cond_5

    .line 90
    .line 91
    sget-object p1, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    .line 92
    .line 93
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-interface {p1, v2, v0, v1, v3}, Lcom/qonversion/android/sdk/Qonversion;->updatePurchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_5
    if-eqz v0, :cond_6

    .line 102
    .line 103
    sget-object p1, Lcom/qonversion/android/sdk/Qonversion;->Companion:Lcom/qonversion/android/sdk/Qonversion$Companion;

    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/Qonversion$Companion;->getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-interface {p1, v2, v0, v1, v3}, Lcom/qonversion/android/sdk/Qonversion;->purchase(Landroid/app/Activity;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_6
    new-instance v4, Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 114
    .line 115
    sget-object v5, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProductNotFound:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 116
    .line 117
    const/4 v8, 0x6

    .line 118
    const/4 v9, 0x0

    .line 119
    const/4 v6, 0x0

    .line 120
    const/4 v7, 0x0

    .line 121
    invoke-direct/range {v4 .. v9}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3, v4}, LGe/n;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 125
    .line 126
    .line 127
    :goto_1
    return-void
.end method
