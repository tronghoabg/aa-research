.class public final Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u00103\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u00104\u001a\u00020\u00122\u0008\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\n2\u0006\u00107\u001a\u00020\u0005J\t\u00108\u001a\u000209H\u00d6\u0001J\t\u0010:\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0013\u0010\r\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000cR\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0008R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0014R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0014R\u0011\u0010\u001e\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0014R\u0011\u0010\u001f\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0014R\u0011\u0010 \u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0014R\u0011\u0010!\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0011\u0010%\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u0008R\u0011\u0010\'\u001a\u00020(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u0019\u0010+\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010,\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u0011\u0010/\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010\u0008\u00a8\u0006;"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;",
        "",
        "originalProductDetails",
        "Lcom/android/billingclient/api/ProductDetails;",
        "basePlanId",
        "",
        "(Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;)V",
        "getBasePlanId",
        "()Ljava/lang/String;",
        "basePlanSubscriptionOfferDetails",
        "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;",
        "getBasePlanSubscriptionOfferDetails",
        "()Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;",
        "defaultSubscriptionOfferDetails",
        "getDefaultSubscriptionOfferDetails",
        "description",
        "getDescription",
        "hasIntroOffer",
        "",
        "getHasIntroOffer",
        "()Z",
        "hasTrialOffer",
        "getHasTrialOffer",
        "hasTrialOrIntroOffer",
        "getHasTrialOrIntroOffer",
        "inAppOfferDetails",
        "Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;",
        "getInAppOfferDetails",
        "()Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;",
        "isInApp",
        "isInstallment",
        "isPrepaid",
        "isSubscription",
        "name",
        "getName",
        "getOriginalProductDetails",
        "()Lcom/android/billingclient/api/ProductDetails;",
        "productId",
        "getProductId",
        "productType",
        "Lcom/qonversion/android/sdk/dto/products/QProductType;",
        "getProductType",
        "()Lcom/qonversion/android/sdk/dto/products/QProductType;",
        "subscriptionOfferDetails",
        "",
        "getSubscriptionOfferDetails",
        "()Ljava/util/List;",
        "title",
        "getTitle",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "findOffer",
        "offerId",
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
.field private final basePlanId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final basePlanSubscriptionOfferDetails:Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final defaultSubscriptionOfferDetails:Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final description:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final hasIntroOffer:Z

.field private final hasTrialOffer:Z

.field private final hasTrialOrIntroOffer:Z

.field private final inAppOfferDetails:Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final isInApp:Z

.field private final isInstallment:Z

.field private final isPrepaid:Z

.field private final isSubscription:Z

.field private final name:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final originalProductDetails:Lcom/android/billingclient/api/ProductDetails;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final productId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final productType:Lcom/qonversion/android/sdk/dto/products/QProductType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final subscriptionOfferDetails:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;)V
    .locals 7
    .param p1    # Lcom/android/billingclient/api/ProductDetails;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string v0, "originalProductDetails"

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
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->originalProductDetails:Lcom/android/billingclient/api/ProductDetails;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->basePlanId:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails;->getProductId()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const-string v0, "getProductId(...)"

    .line 18
    .line 19
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->productId:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const-string v0, "getName(...)"

    .line 29
    .line 30
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iput-object p2, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->name:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails;->getTitle()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    const-string v0, "getTitle(...)"

    .line 40
    .line 41
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->title:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails;->getDescription()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    const-string v0, "getDescription(...)"

    .line 51
    .line 52
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iput-object p2, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->description:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails;->getSubscriptionOfferDetails()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const/4 p2, 0x0

    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    check-cast p1, Ljava/lang/Iterable;

    .line 65
    .line 66
    new-instance v0, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_1

    .line 80
    .line 81
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    move-object v2, v1

    .line 86
    check-cast v2, Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;

    .line 87
    .line 88
    invoke-virtual {v2}, Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;->getBasePlanId()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    iget-object v3, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->basePlanId:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_0

    .line 99
    .line 100
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 105
    .line 106
    const/16 v1, 0xa

    .line 107
    .line 108
    invoke-static {v0, v1}, Lff/p;->a0(Ljava/lang/Iterable;I)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_3

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    check-cast v1, Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;

    .line 130
    .line 131
    new-instance v2, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 132
    .line 133
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-direct {v2, v1}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;-><init>(Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;)V

    .line 137
    .line 138
    .line 139
    invoke-interface {p1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_2
    move-object p1, p2

    .line 144
    :cond_3
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->subscriptionOfferDetails:Ljava/util/List;

    .line 145
    .line 146
    if-eqz p1, :cond_8

    .line 147
    .line 148
    check-cast p1, Ljava/lang/Iterable;

    .line 149
    .line 150
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-nez v0, :cond_4

    .line 159
    .line 160
    move-object v0, p2

    .line 161
    goto :goto_2

    .line 162
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-nez v1, :cond_5

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_5
    move-object v1, v0

    .line 174
    check-cast v1, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 175
    .line 176
    invoke-static {v1}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getPricePerMaxDuration(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)D

    .line 177
    .line 178
    .line 179
    move-result-wide v1

    .line 180
    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    move-object v4, v3

    .line 185
    check-cast v4, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 186
    .line 187
    invoke-static {v4}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getPricePerMaxDuration(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)D

    .line 188
    .line 189
    .line 190
    move-result-wide v4

    .line 191
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Double;->compare(DD)I

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    if-lez v6, :cond_7

    .line 196
    .line 197
    move-object v0, v3

    .line 198
    move-wide v1, v4

    .line 199
    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    if-nez v3, :cond_6

    .line 204
    .line 205
    :goto_2
    check-cast v0, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_8
    move-object v0, p2

    .line 209
    :goto_3
    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->defaultSubscriptionOfferDetails:Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 210
    .line 211
    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->subscriptionOfferDetails:Ljava/util/List;

    .line 212
    .line 213
    const/4 v0, 0x1

    .line 214
    if-eqz p1, :cond_b

    .line 215
    .line 216
    check-cast p1, Ljava/lang/Iterable;

    .line 217
    .line 218
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    :cond_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    if-eqz v1, :cond_a

    .line 227
    .line 228
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    move-object v2, v1

    .line 233
    check-cast v2, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 234
    .line 235
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getPricingPhases()Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-ne v2, v0, :cond_9

    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_a
    move-object v1, p2

    .line 247
    :goto_4
    check-cast v1, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_b
    move-object v1, p2

    .line 251
    :goto_5
    iput-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->basePlanSubscriptionOfferDetails:Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 252
    .line 253
    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->originalProductDetails:Lcom/android/billingclient/api/ProductDetails;

    .line 254
    .line 255
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails;->getOneTimePurchaseOfferDetails()Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    if-eqz p1, :cond_c

    .line 260
    .line 261
    new-instance v1, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;

    .line 262
    .line 263
    invoke-direct {v1, p1}, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;-><init>(Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;)V

    .line 264
    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_c
    move-object v1, p2

    .line 268
    :goto_6
    iput-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->inAppOfferDetails:Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;

    .line 269
    .line 270
    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->subscriptionOfferDetails:Ljava/util/List;

    .line 271
    .line 272
    const/4 v1, 0x0

    .line 273
    if-eqz p1, :cond_f

    .line 274
    .line 275
    check-cast p1, Ljava/lang/Iterable;

    .line 276
    .line 277
    instance-of v2, p1, Ljava/util/Collection;

    .line 278
    .line 279
    if-eqz v2, :cond_d

    .line 280
    .line 281
    move-object v2, p1

    .line 282
    check-cast v2, Ljava/util/Collection;

    .line 283
    .line 284
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 285
    .line 286
    .line 287
    move-result v2

    .line 288
    if-eqz v2, :cond_d

    .line 289
    .line 290
    goto :goto_7

    .line 291
    :cond_d
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    :cond_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    if-eqz v2, :cond_f

    .line 300
    .line 301
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    check-cast v2, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 306
    .line 307
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getHasTrial()Z

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    if-eqz v2, :cond_e

    .line 312
    .line 313
    move p1, v0

    .line 314
    goto :goto_8

    .line 315
    :cond_f
    :goto_7
    move p1, v1

    .line 316
    :goto_8
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->hasTrialOffer:Z

    .line 317
    .line 318
    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->subscriptionOfferDetails:Ljava/util/List;

    .line 319
    .line 320
    if-eqz p1, :cond_12

    .line 321
    .line 322
    check-cast p1, Ljava/lang/Iterable;

    .line 323
    .line 324
    instance-of v2, p1, Ljava/util/Collection;

    .line 325
    .line 326
    if-eqz v2, :cond_10

    .line 327
    .line 328
    move-object v2, p1

    .line 329
    check-cast v2, Ljava/util/Collection;

    .line 330
    .line 331
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    if-eqz v2, :cond_10

    .line 336
    .line 337
    goto :goto_9

    .line 338
    :cond_10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    :cond_11
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    if-eqz v2, :cond_12

    .line 347
    .line 348
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    check-cast v2, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 353
    .line 354
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getHasIntro()Z

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    if-eqz v2, :cond_11

    .line 359
    .line 360
    move p1, v0

    .line 361
    goto :goto_a

    .line 362
    :cond_12
    :goto_9
    move p1, v1

    .line 363
    :goto_a
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->hasIntroOffer:Z

    .line 364
    .line 365
    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->subscriptionOfferDetails:Ljava/util/List;

    .line 366
    .line 367
    if-eqz p1, :cond_15

    .line 368
    .line 369
    check-cast p1, Ljava/lang/Iterable;

    .line 370
    .line 371
    instance-of v2, p1, Ljava/util/Collection;

    .line 372
    .line 373
    if-eqz v2, :cond_13

    .line 374
    .line 375
    move-object v2, p1

    .line 376
    check-cast v2, Ljava/util/Collection;

    .line 377
    .line 378
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    if-eqz v2, :cond_13

    .line 383
    .line 384
    goto :goto_b

    .line 385
    :cond_13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    :cond_14
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    if-eqz v2, :cond_15

    .line 394
    .line 395
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    check-cast v2, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 400
    .line 401
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getHasTrialOrIntro()Z

    .line 402
    .line 403
    .line 404
    move-result v2

    .line 405
    if-eqz v2, :cond_14

    .line 406
    .line 407
    move p1, v0

    .line 408
    goto :goto_c

    .line 409
    :cond_15
    :goto_b
    move p1, v1

    .line 410
    :goto_c
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->hasTrialOrIntroOffer:Z

    .line 411
    .line 412
    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->originalProductDetails:Lcom/android/billingclient/api/ProductDetails;

    .line 413
    .line 414
    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails;->getProductType()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 419
    .line 420
    .line 421
    move-result v2

    .line 422
    const v3, 0x360a33

    .line 423
    .line 424
    .line 425
    if-eq v2, v3, :cond_18

    .line 426
    .line 427
    const v3, 0x5fb1edc

    .line 428
    .line 429
    .line 430
    if-eq v2, v3, :cond_16

    .line 431
    .line 432
    goto :goto_d

    .line 433
    :cond_16
    const-string v2, "inapp"

    .line 434
    .line 435
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result p1

    .line 439
    if-nez p1, :cond_17

    .line 440
    .line 441
    goto :goto_d

    .line 442
    :cond_17
    sget-object p1, Lcom/qonversion/android/sdk/dto/products/QProductType;->InApp:Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 443
    .line 444
    goto :goto_f

    .line 445
    :cond_18
    const-string v2, "subs"

    .line 446
    .line 447
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    move-result p1

    .line 451
    if-nez p1, :cond_19

    .line 452
    .line 453
    :goto_d
    sget-object p1, Lcom/qonversion/android/sdk/dto/products/QProductType;->Unknown:Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 454
    .line 455
    goto :goto_f

    .line 456
    :cond_19
    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->defaultSubscriptionOfferDetails:Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 457
    .line 458
    if-eqz p1, :cond_1c

    .line 459
    .line 460
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getHasTrial()Z

    .line 461
    .line 462
    .line 463
    move-result v2

    .line 464
    if-eqz v2, :cond_1a

    .line 465
    .line 466
    sget-object p1, Lcom/qonversion/android/sdk/dto/products/QProductType;->Trial:Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 467
    .line 468
    goto :goto_e

    .line 469
    :cond_1a
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getHasIntro()Z

    .line 470
    .line 471
    .line 472
    move-result p1

    .line 473
    if-eqz p1, :cond_1b

    .line 474
    .line 475
    sget-object p1, Lcom/qonversion/android/sdk/dto/products/QProductType;->Intro:Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 476
    .line 477
    goto :goto_e

    .line 478
    :cond_1b
    sget-object p1, Lcom/qonversion/android/sdk/dto/products/QProductType;->Subscription:Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 479
    .line 480
    :goto_e
    if-nez p1, :cond_1d

    .line 481
    .line 482
    :cond_1c
    sget-object p1, Lcom/qonversion/android/sdk/dto/products/QProductType;->Unknown:Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 483
    .line 484
    :cond_1d
    :goto_f
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->productType:Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 485
    .line 486
    sget-object v2, Lcom/qonversion/android/sdk/dto/products/QProductType;->InApp:Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 487
    .line 488
    if-ne p1, v2, :cond_1e

    .line 489
    .line 490
    move v2, v0

    .line 491
    goto :goto_10

    .line 492
    :cond_1e
    move v2, v1

    .line 493
    :goto_10
    iput-boolean v2, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isInApp:Z

    .line 494
    .line 495
    sget-object v2, Lcom/qonversion/android/sdk/dto/products/QProductType;->Trial:Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 496
    .line 497
    if-eq p1, v2, :cond_20

    .line 498
    .line 499
    sget-object v2, Lcom/qonversion/android/sdk/dto/products/QProductType;->Subscription:Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 500
    .line 501
    if-ne p1, v2, :cond_1f

    .line 502
    .line 503
    goto :goto_11

    .line 504
    :cond_1f
    move p1, v1

    .line 505
    goto :goto_12

    .line 506
    :cond_20
    :goto_11
    move p1, v0

    .line 507
    :goto_12
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isSubscription:Z

    .line 508
    .line 509
    if-eqz p1, :cond_22

    .line 510
    .line 511
    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->basePlanSubscriptionOfferDetails:Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 512
    .line 513
    if-eqz v2, :cond_21

    .line 514
    .line 515
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getBasePlan()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    if-eqz v2, :cond_21

    .line 520
    .line 521
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getRecurrenceMode()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    goto :goto_13

    .line 526
    :cond_21
    move-object v2, p2

    .line 527
    :goto_13
    sget-object v3, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;->NonRecurring:Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    .line 528
    .line 529
    if-ne v2, v3, :cond_22

    .line 530
    .line 531
    move v2, v0

    .line 532
    goto :goto_14

    .line 533
    :cond_22
    move v2, v1

    .line 534
    :goto_14
    iput-boolean v2, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isPrepaid:Z

    .line 535
    .line 536
    if-eqz p1, :cond_24

    .line 537
    .line 538
    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->basePlanSubscriptionOfferDetails:Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 539
    .line 540
    if-eqz p1, :cond_23

    .line 541
    .line 542
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getInstallmentPlanDetails()Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;

    .line 543
    .line 544
    .line 545
    move-result-object p2

    .line 546
    :cond_23
    if-eqz p2, :cond_24

    .line 547
    .line 548
    goto :goto_15

    .line 549
    :cond_24
    move v0, v1

    .line 550
    :goto_15
    iput-boolean v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isInstallment:Z

    .line 551
    .line 552
    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->originalProductDetails:Lcom/android/billingclient/api/ProductDetails;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->basePlanId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->copy(Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/android/billingclient/api/ProductDetails;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->originalProductDetails:Lcom/android/billingclient/api/ProductDetails;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->basePlanId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;
    .locals 1
    .param p1    # Lcom/android/billingclient/api/ProductDetails;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "originalProductDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    invoke-direct {v0, p1, p2}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;-><init>(Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->originalProductDetails:Lcom/android/billingclient/api/ProductDetails;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->originalProductDetails:Lcom/android/billingclient/api/ProductDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->basePlanId:Ljava/lang/String;

    iget-object p1, p1, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->basePlanId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final findOffer(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "offerId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->subscriptionOfferDetails:Ljava/util/List;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    check-cast v0, Ljava/lang/Iterable;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    move-object v3, v2

    .line 28
    check-cast v3, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 29
    .line 30
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getOfferId()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    move-object v1, v2

    .line 41
    :cond_1
    check-cast v1, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 42
    .line 43
    :cond_2
    return-object v1
.end method

.method public final getBasePlanId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->basePlanId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getBasePlanSubscriptionOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->basePlanSubscriptionOfferDetails:Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDefaultSubscriptionOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->defaultSubscriptionOfferDetails:Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->description:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHasIntroOffer()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->hasIntroOffer:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHasTrialOffer()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->hasTrialOffer:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getHasTrialOrIntroOffer()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->hasTrialOrIntroOffer:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getInAppOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->inAppOfferDetails:Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOriginalProductDetails()Lcom/android/billingclient/api/ProductDetails;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->originalProductDetails:Lcom/android/billingclient/api/ProductDetails;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getProductId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->productId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getProductType()Lcom/qonversion/android/sdk/dto/products/QProductType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->productType:Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSubscriptionOfferDetails()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->subscriptionOfferDetails:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->originalProductDetails:Lcom/android/billingclient/api/ProductDetails;

    invoke-virtual {v0}, Lcom/android/billingclient/api/ProductDetails;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->basePlanId:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final isInApp()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isInApp:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isInstallment()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isInstallment:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isPrepaid()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isPrepaid:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isSubscription()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isSubscription:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->originalProductDetails:Lcom/android/billingclient/api/ProductDetails;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->basePlanId:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "QProductStoreDetails(originalProductDetails="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", basePlanId="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
