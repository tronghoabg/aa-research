.class public final Lcom/qonversion/android/sdk/dto/products/QProduct;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lhb/s;
    generateAdapter = true
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u00002\u00020\u0001B)\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0019\u0010\n\u001a\u00020\t2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ2\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008!\u0010\u001cJ\u0010\u0010#\u001a\u00020\"H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010)\u001a\u0004\u0008+\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010)\u001a\u0004\u0008,\u0010\u001cR*\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008.\u0010/\u0012\u0004\u00084\u00105\u001a\u0004\u00080\u00101\"\u0004\u00082\u00103R(\u00108\u001a\u0004\u0018\u0001062\u0008\u00107\u001a\u0004\u0018\u0001068\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;R$\u0010<\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008<\u0010)\u001a\u0004\u0008=\u0010\u001c\"\u0004\u0008>\u0010?R\u0013\u0010C\u001a\u0004\u0018\u00010@8F\u00a2\u0006\u0006\u001a\u0004\u0008A\u0010BR\u0013\u0010E\u001a\u0004\u0018\u00010@8F\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010BR\u0011\u0010I\u001a\u00020F8F\u00a2\u0006\u0006\u001a\u0004\u0008G\u0010HR\u0013\u0010K\u001a\u0004\u0018\u00010\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008J\u0010\u001c\u00a8\u0006L"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "",
        "",
        "qonversionID",
        "storeID",
        "basePlanID",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "offerId",
        "Lcom/qonversion/android/sdk/dto/QPurchaseModel;",
        "toPurchaseModel",
        "(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QPurchaseModel;",
        "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;",
        "offer",
        "(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)Lcom/qonversion/android/sdk/dto/QPurchaseModel;",
        "oldProductId",
        "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;",
        "updatePolicy",
        "Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;",
        "toPurchaseUpdateModel",
        "(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;",
        "Lcom/android/billingclient/api/ProductDetails;",
        "productDetails",
        "Lef/C;",
        "setStoreProductDetails$sdk_release",
        "(Lcom/android/billingclient/api/ProductDetails;)V",
        "setStoreProductDetails",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "toString",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getQonversionID",
        "getStoreID",
        "getBasePlanID",
        "Lcom/android/billingclient/api/SkuDetails;",
        "skuDetail",
        "Lcom/android/billingclient/api/SkuDetails;",
        "getSkuDetail",
        "()Lcom/android/billingclient/api/SkuDetails;",
        "setSkuDetail",
        "(Lcom/android/billingclient/api/SkuDetails;)V",
        "getSkuDetail$annotations",
        "()V",
        "Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;",
        "<set-?>",
        "storeDetails",
        "Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;",
        "getStoreDetails",
        "()Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;",
        "offeringID",
        "getOfferingID",
        "setOfferingID",
        "(Ljava/lang/String;)V",
        "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;",
        "getSubscriptionPeriod",
        "()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;",
        "subscriptionPeriod",
        "getTrialPeriod",
        "trialPeriod",
        "Lcom/qonversion/android/sdk/dto/products/QProductType;",
        "getType",
        "()Lcom/qonversion/android/sdk/dto/products/QProductType;",
        "type",
        "getPrettyPrice",
        "prettyPrice",
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
.field private final basePlanID:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private transient offeringID:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final qonversionID:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private transient skuDetail:Lcom/android/billingclient/api/SkuDetails;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private transient storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final storeID:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "store_id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "base_plan_id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string v0, "qonversionID"

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
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->qonversionID:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeID:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->basePlanID:Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/products/QProduct;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->qonversionID:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeID:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->basePlanID:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getSkuDetail$annotations()V
    .locals 0
    .annotation runtime Lef/c;
    .end annotation

    return-void
.end method

.method public static synthetic toPurchaseModel$default(Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/QPurchaseModel;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->toPurchaseModel(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QPurchaseModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic toPurchaseUpdateModel$default(Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/dto/products/QProduct;->toPurchaseUpdateModel(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->qonversionID:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeID:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->basePlanID:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QProduct;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "store_id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lhb/o;
            name = "base_plan_id"
        .end annotation

        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "qonversionID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProduct;

    invoke-direct {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/dto/products/QProduct;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

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
    instance-of v1, p1, Lcom/qonversion/android/sdk/dto/products/QProduct;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/dto/products/QProduct;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->qonversionID:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/products/QProduct;->qonversionID:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeID:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeID:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->basePlanID:Ljava/lang/String;

    iget-object p1, p1, Lcom/qonversion/android/sdk/dto/products/QProduct;->basePlanID:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getBasePlanID()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->basePlanID:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOfferingID()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->offeringID:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPrettyPrice()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getType()Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QProductType;->InApp:Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getInAppOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;->getPrice()Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getFormattedPrice()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0

    .line 31
    :cond_0
    return-object v2

    .line 32
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getBasePlanSubscriptionOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move-object v0, v2

    .line 42
    :goto_0
    if-eqz v0, :cond_4

    .line 43
    .line 44
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getBasePlanSubscriptionOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getBasePlan()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getPrice()Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getFormattedPrice()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0

    .line 71
    :cond_3
    return-object v2

    .line 72
    :cond_4
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->skuDetail:Lcom/android/billingclient/api/SkuDetails;

    .line 73
    .line 74
    if-eqz v0, :cond_5

    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/android/billingclient/api/SkuDetails;->getPrice()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0

    .line 81
    :cond_5
    return-object v2
.end method

.method public final getQonversionID()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->qonversionID:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSkuDetail()Lcom/android/billingclient/api/SkuDetails;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->skuDetail:Lcom/android/billingclient/api/SkuDetails;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStoreDetails()Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStoreID()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeID:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSubscriptionPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getDefaultSubscriptionOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getBasePlan()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :cond_0
    return-object v1

    .line 24
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->skuDetail:Lcom/android/billingclient/api/SkuDetails;

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/android/billingclient/api/SkuDetails;->getSubscriptionPeriod()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-static {v0}, LBf/k;->y0(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move-object v0, v1

    .line 42
    :goto_0
    if-eqz v0, :cond_3

    .line 43
    .line 44
    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->Companion:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;->from(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    :cond_3
    return-object v1
.end method

.method public final getTrialPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getDefaultSubscriptionOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getTrialPhase()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :cond_0
    return-object v1

    .line 24
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->skuDetail:Lcom/android/billingclient/api/SkuDetails;

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/android/billingclient/api/SkuDetails;->getFreeTrialPeriod()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-static {v0}, LBf/k;->y0(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move-object v0, v1

    .line 42
    :goto_0
    if-eqz v0, :cond_3

    .line 43
    .line 44
    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->Companion:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;->from(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0

    .line 51
    :cond_3
    return-object v1
.end method

.method public final getType()Lcom/qonversion/android/sdk/dto/products/QProductType;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getSubscriptionOfferDetails()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    check-cast v3, Ljava/util/Collection;

    .line 14
    .line 15
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    xor-int/2addr v3, v2

    .line 20
    if-ne v3, v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getInAppOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    :goto_0
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getProductType()Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object v0, v1

    .line 35
    :goto_1
    if-eqz v0, :cond_2

    .line 36
    .line 37
    sget-object v3, Lcom/qonversion/android/sdk/dto/products/QProductType;->Unknown:Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 38
    .line 39
    if-eq v0, v3, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->skuDetail:Lcom/android/billingclient/api/SkuDetails;

    .line 43
    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/android/billingclient/api/SkuDetails;->getType()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    :cond_3
    const-string v0, "inapp"

    .line 51
    .line 52
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QProductType;->InApp:Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_4
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getTrialPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-eqz v0, :cond_5

    .line 66
    .line 67
    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QProductType;->Trial:Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 68
    .line 69
    return-object v0

    .line 70
    :cond_5
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->skuDetail:Lcom/android/billingclient/api/SkuDetails;

    .line 71
    .line 72
    if-eqz v0, :cond_6

    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/android/billingclient/api/SkuDetails;->getIntroductoryPricePeriod()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-eqz v0, :cond_6

    .line 79
    .line 80
    invoke-static {v0}, LBf/k;->y0(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    xor-int/2addr v0, v2

    .line 85
    if-ne v0, v2, :cond_6

    .line 86
    .line 87
    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QProductType;->Intro:Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_6
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getSubscriptionPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-eqz v0, :cond_7

    .line 95
    .line 96
    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QProductType;->Subscription:Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 97
    .line 98
    return-object v0

    .line 99
    :cond_7
    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QProductType;->Unknown:Lcom/qonversion/android/sdk/dto/products/QProductType;

    .line 100
    .line 101
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->qonversionID:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeID:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->basePlanID:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final setOfferingID(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->offeringID:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setSkuDetail(Lcom/android/billingclient/api/SkuDetails;)V
    .locals 0
    .param p1    # Lcom/android/billingclient/api/SkuDetails;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->skuDetail:Lcom/android/billingclient/api/SkuDetails;

    .line 2
    .line 3
    return-void
.end method

.method public final setStoreProductDetails$sdk_release(Lcom/android/billingclient/api/ProductDetails;)V
    .locals 2
    .param p1    # Lcom/android/billingclient/api/ProductDetails;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "productDetails"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->basePlanID:Ljava/lang/String;

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;-><init>(Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    .line 14
    .line 15
    return-void
.end method

.method public final toPurchaseModel()Lcom/qonversion/android/sdk/dto/QPurchaseModel;
    .locals 2
    .annotation runtime Lef/c;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->toPurchaseModel$default(Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/QPurchaseModel;

    move-result-object v0

    return-object v0
.end method

.method public final toPurchaseModel(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)Lcom/qonversion/android/sdk/dto/QPurchaseModel;
    .locals 1
    .param p1    # Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lef/c;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getOfferId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->toPurchaseModel(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QPurchaseModel;

    move-result-object v0

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getOfferId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QPurchaseModel;->removeOffer()Lcom/qonversion/android/sdk/dto/QPurchaseModel;

    :cond_1
    return-object v0
.end method

.method public final toPurchaseModel(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QPurchaseModel;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lef/c;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    new-instance v0, Lcom/qonversion/android/sdk/dto/QPurchaseModel;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->qonversionID:Ljava/lang/String;

    invoke-direct {v0, v1, p1}, Lcom/qonversion/android/sdk/dto/QPurchaseModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final toPurchaseUpdateModel(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lef/c;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "oldProductId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->toPurchaseUpdateModel$default(Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;

    move-result-object p1

    return-object p1
.end method

.method public final toPurchaseUpdateModel(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lef/c;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "oldProductId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v1, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;

    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->qonversionID:Ljava/lang/String;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v7}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->qonversionID:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeID:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->basePlanID:Ljava/lang/String;

    .line 6
    .line 7
    const-string v3, "QProduct(qonversionID="

    .line 8
    .line 9
    const-string v4, ", storeID="

    .line 10
    .line 11
    const-string v5, ", basePlanID="

    .line 12
    .line 13
    invoke-static {v3, v0, v4, v1, v5}, LA7/p0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, ")"

    .line 18
    .line 19
    invoke-static {v0, v2, v1}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method
