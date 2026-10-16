.class public final Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;,
        Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0002\'(B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\"\u001a\u00020\u000e2\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0006H\u00d6\u0001J\t\u0010%\u001a\u00020&H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006)"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;",
        "",
        "originalPricingPhase",
        "Lcom/android/billingclient/api/ProductDetails$PricingPhase;",
        "(Lcom/android/billingclient/api/ProductDetails$PricingPhase;)V",
        "billingCycleCount",
        "",
        "getBillingCycleCount",
        "()I",
        "billingPeriod",
        "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;",
        "getBillingPeriod",
        "()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;",
        "isBasePlan",
        "",
        "()Z",
        "isIntro",
        "isTrial",
        "getOriginalPricingPhase",
        "()Lcom/android/billingclient/api/ProductDetails$PricingPhase;",
        "price",
        "Lcom/qonversion/android/sdk/dto/products/QProductPrice;",
        "getPrice",
        "()Lcom/qonversion/android/sdk/dto/products/QProductPrice;",
        "recurrenceMode",
        "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;",
        "getRecurrenceMode",
        "()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;",
        "type",
        "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;",
        "getType",
        "()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;",
        "component1",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "",
        "RecurrenceMode",
        "Type",
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
.field private final billingCycleCount:I

.field private final billingPeriod:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final isBasePlan:Z

.field private final isIntro:Z

.field private final isTrial:Z

.field private final originalPricingPhase:Lcom/android/billingclient/api/ProductDetails$PricingPhase;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final price:Lcom/qonversion/android/sdk/dto/products/QProductPrice;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final recurrenceMode:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final type:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/billingclient/api/ProductDetails$PricingPhase;)V
    .locals 6
    .param p1    # Lcom/android/billingclient/api/ProductDetails$PricingPhase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "originalPricingPhase"

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
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->originalPricingPhase:Lcom/android/billingclient/api/ProductDetails$PricingPhase;

    .line 10
    .line 11
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails$PricingPhase;->getPriceAmountMicros()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails$PricingPhase;->getPriceCurrencyCode()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, "getPriceCurrencyCode(...)"

    .line 22
    .line 23
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails$PricingPhase;->getFormattedPrice()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const-string v5, "getFormattedPrice(...)"

    .line 31
    .line 32
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->price:Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    .line 39
    .line 40
    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->Companion:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails$PricingPhase;->getBillingPeriod()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const-string v3, "getBillingPeriod(...)"

    .line 47
    .line 48
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v2}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;->from(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iput-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->billingPeriod:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails$PricingPhase;->getBillingCycleCount()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    iput v1, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->billingCycleCount:I

    .line 62
    .line 63
    sget-object v2, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;->Companion:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode$Companion;

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails$PricingPhase;->getRecurrenceMode()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-virtual {v2, p1}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode$Companion;->from(I)Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->recurrenceMode:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    .line 74
    .line 75
    sget-object v2, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;->FiniteRecurring:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    .line 76
    .line 77
    const/4 v3, 0x1

    .line 78
    if-eq p1, v2, :cond_0

    .line 79
    .line 80
    sget-object p1, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->Regular:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->isFree()Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_1

    .line 88
    .line 89
    sget-object p1, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->FreeTrial:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    if-ne v1, v3, :cond_2

    .line 93
    .line 94
    sget-object p1, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->DiscountedSinglePayment:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    if-le v1, v3, :cond_3

    .line 98
    .line 99
    sget-object p1, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->DiscountedRecurringPayment:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    sget-object p1, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->Unknown:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 103
    .line 104
    :goto_0
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->type:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 105
    .line 106
    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->FreeTrial:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 107
    .line 108
    const/4 v1, 0x0

    .line 109
    if-ne p1, v0, :cond_4

    .line 110
    .line 111
    move v0, v3

    .line 112
    goto :goto_1

    .line 113
    :cond_4
    move v0, v1

    .line 114
    :goto_1
    iput-boolean v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->isTrial:Z

    .line 115
    .line 116
    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->DiscountedSinglePayment:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 117
    .line 118
    if-eq p1, v0, :cond_6

    .line 119
    .line 120
    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->DiscountedRecurringPayment:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 121
    .line 122
    if-ne p1, v0, :cond_5

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_5
    move v0, v1

    .line 126
    goto :goto_3

    .line 127
    :cond_6
    :goto_2
    move v0, v3

    .line 128
    :goto_3
    iput-boolean v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->isIntro:Z

    .line 129
    .line 130
    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->Regular:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 131
    .line 132
    if-ne p1, v0, :cond_7

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_7
    move v3, v1

    .line 136
    :goto_4
    iput-boolean v3, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->isBasePlan:Z

    .line 137
    .line 138
    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;Lcom/android/billingclient/api/ProductDetails$PricingPhase;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->originalPricingPhase:Lcom/android/billingclient/api/ProductDetails$PricingPhase;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->copy(Lcom/android/billingclient/api/ProductDetails$PricingPhase;)Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/android/billingclient/api/ProductDetails$PricingPhase;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->originalPricingPhase:Lcom/android/billingclient/api/ProductDetails$PricingPhase;

    return-object v0
.end method

.method public final copy(Lcom/android/billingclient/api/ProductDetails$PricingPhase;)Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;
    .locals 1
    .param p1    # Lcom/android/billingclient/api/ProductDetails$PricingPhase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "originalPricingPhase"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;-><init>(Lcom/android/billingclient/api/ProductDetails$PricingPhase;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->originalPricingPhase:Lcom/android/billingclient/api/ProductDetails$PricingPhase;

    iget-object p1, p1, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->originalPricingPhase:Lcom/android/billingclient/api/ProductDetails$PricingPhase;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getBillingCycleCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->billingCycleCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getBillingPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->billingPeriod:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOriginalPricingPhase()Lcom/android/billingclient/api/ProductDetails$PricingPhase;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->originalPricingPhase:Lcom/android/billingclient/api/ProductDetails$PricingPhase;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPrice()Lcom/qonversion/android/sdk/dto/products/QProductPrice;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->price:Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRecurrenceMode()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->recurrenceMode:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getType()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->type:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->originalPricingPhase:Lcom/android/billingclient/api/ProductDetails$PricingPhase;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final isBasePlan()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->isBasePlan:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isIntro()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->isIntro:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isTrial()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->isTrial:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->originalPricingPhase:Lcom/android/billingclient/api/ProductDetails$PricingPhase;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "QProductPricingPhase(originalPricingPhase="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
