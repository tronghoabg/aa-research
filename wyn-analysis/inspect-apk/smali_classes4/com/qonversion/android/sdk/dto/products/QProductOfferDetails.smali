.class public final Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010 \n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010+\u001a\u00020\u000e2\u0008\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020.H\u00d6\u0001J\t\u0010/\u001a\u00020\nH\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0010R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0008R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u000cR\u0011\u0010\u001d\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00060\"\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0017\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\n0\"\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010$R\u0013\u0010\'\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u0008\u00a8\u00060"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;",
        "",
        "originalOfferDetails",
        "Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;",
        "(Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;)V",
        "basePlan",
        "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;",
        "getBasePlan",
        "()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;",
        "basePlanId",
        "",
        "getBasePlanId",
        "()Ljava/lang/String;",
        "hasIntro",
        "",
        "getHasIntro",
        "()Z",
        "hasTrial",
        "getHasTrial",
        "hasTrialOrIntro",
        "getHasTrialOrIntro",
        "installmentPlanDetails",
        "Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;",
        "getInstallmentPlanDetails",
        "()Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;",
        "introPhase",
        "getIntroPhase",
        "offerId",
        "getOfferId",
        "offerToken",
        "getOfferToken",
        "getOriginalOfferDetails",
        "()Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;",
        "pricingPhases",
        "",
        "getPricingPhases",
        "()Ljava/util/List;",
        "tags",
        "getTags",
        "trialPhase",
        "getTrialPhase",
        "component1",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final basePlan:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final basePlanId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final hasIntro:Z

.field private final hasTrial:Z

.field private final hasTrialOrIntro:Z

.field private final installmentPlanDetails:Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final introPhase:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final offerId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final offerToken:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final originalOfferDetails:Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final pricingPhases:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final tags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final trialPhase:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;)V
    .locals 3
    .param p1    # Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "originalOfferDetails"

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
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->originalOfferDetails:Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;->getBasePlanId()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "getBasePlanId(...)"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->basePlanId:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;->getOfferId()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->offerId:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;->getOfferToken()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "getOfferToken(...)"

    .line 33
    .line 34
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->offerToken:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;->getOfferTags()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "getOfferTags(...)"

    .line 44
    .line 45
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->tags:Ljava/util/List;

    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;->getPricingPhases()Lcom/android/billingclient/api/ProductDetails$PricingPhases;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails$PricingPhases;->getPricingPhaseList()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const-string v0, "getPricingPhaseList(...)"

    .line 59
    .line 60
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    check-cast p1, Ljava/lang/Iterable;

    .line 64
    .line 65
    new-instance v0, Ljava/util/ArrayList;

    .line 66
    .line 67
    const/16 v1, 0xa

    .line 68
    .line 69
    invoke-static {p1, v1}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_0

    .line 85
    .line 86
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, Lcom/android/billingclient/api/ProductDetails$PricingPhase;

    .line 91
    .line 92
    new-instance v2, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 93
    .line 94
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-direct {v2, v1}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;-><init>(Lcom/android/billingclient/api/ProductDetails$PricingPhase;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->pricingPhases:Ljava/util/List;

    .line 105
    .line 106
    check-cast v0, Ljava/lang/Iterable;

    .line 107
    .line 108
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    const/4 v1, 0x0

    .line 117
    if-eqz v0, :cond_2

    .line 118
    .line 119
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    move-object v2, v0

    .line 124
    check-cast v2, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 125
    .line 126
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->isBasePlan()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_1

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_2
    move-object v0, v1

    .line 134
    :goto_1
    check-cast v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 135
    .line 136
    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->basePlan:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 137
    .line 138
    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->originalOfferDetails:Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;

    .line 139
    .line 140
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;->getInstallmentPlanDetails()Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    if-eqz p1, :cond_3

    .line 145
    .line 146
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;

    .line 147
    .line 148
    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;-><init>(Lcom/android/billingclient/api/ProductDetails$InstallmentPlanDetails;)V

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_3
    move-object v0, v1

    .line 153
    :goto_2
    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->installmentPlanDetails:Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;

    .line 154
    .line 155
    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->pricingPhases:Ljava/util/List;

    .line 156
    .line 157
    check-cast p1, Ljava/lang/Iterable;

    .line 158
    .line 159
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eqz v0, :cond_5

    .line 168
    .line 169
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    move-object v2, v0

    .line 174
    check-cast v2, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 175
    .line 176
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->isTrial()Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-eqz v2, :cond_4

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_5
    move-object v0, v1

    .line 184
    :goto_3
    check-cast v0, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 185
    .line 186
    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->trialPhase:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 187
    .line 188
    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->pricingPhases:Ljava/util/List;

    .line 189
    .line 190
    check-cast p1, Ljava/lang/Iterable;

    .line 191
    .line 192
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eqz v0, :cond_7

    .line 201
    .line 202
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    move-object v2, v0

    .line 207
    check-cast v2, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 208
    .line 209
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->isIntro()Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-eqz v2, :cond_6

    .line 214
    .line 215
    move-object v1, v0

    .line 216
    :cond_7
    check-cast v1, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 217
    .line 218
    iput-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->introPhase:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 219
    .line 220
    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->trialPhase:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 221
    .line 222
    const/4 v0, 0x0

    .line 223
    const/4 v2, 0x1

    .line 224
    if-eqz p1, :cond_8

    .line 225
    .line 226
    move p1, v2

    .line 227
    goto :goto_4

    .line 228
    :cond_8
    move p1, v0

    .line 229
    :goto_4
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->hasTrial:Z

    .line 230
    .line 231
    if-eqz v1, :cond_9

    .line 232
    .line 233
    move v1, v2

    .line 234
    goto :goto_5

    .line 235
    :cond_9
    move v1, v0

    .line 236
    :goto_5
    iput-boolean v1, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->hasIntro:Z

    .line 237
    .line 238
    if-nez p1, :cond_a

    .line 239
    .line 240
    if-eqz v1, :cond_b

    .line 241
    .line 242
    :cond_a
    move v0, v2

    .line 243
    :cond_b
    iput-boolean v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->hasTrialOrIntro:Z

    .line 244
    .line 245
    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->originalOfferDetails:Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->copy(Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;)Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->originalOfferDetails:Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;

    return-object v0
.end method

.method public final copy(Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;)Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;
    .locals 1
    .param p1    # Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "originalOfferDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;-><init>(Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;)V

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
    instance-of v1, p1, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->originalOfferDetails:Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;

    iget-object p1, p1, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->originalOfferDetails:Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getBasePlan()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->basePlan:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getBasePlanId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->basePlanId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHasIntro()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->hasIntro:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHasTrial()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->hasTrial:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHasTrialOrIntro()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->hasTrialOrIntro:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getInstallmentPlanDetails()Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->installmentPlanDetails:Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getIntroPhase()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->introPhase:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOfferId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->offerId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOfferToken()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->offerToken:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOriginalOfferDetails()Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->originalOfferDetails:Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPricingPhases()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->pricingPhases:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTags()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->tags:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTrialPhase()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->trialPhase:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->originalOfferDetails:Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->originalOfferDetails:Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "QProductOfferDetails(originalOfferDetails="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
