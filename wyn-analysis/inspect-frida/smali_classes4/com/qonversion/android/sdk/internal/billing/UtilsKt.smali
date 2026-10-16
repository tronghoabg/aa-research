.class public final Lcom/qonversion/android/sdk/internal/billing/UtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/billing/UtilsKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\u001a\u0008\u0010\"\u001a\u00020#H\u0000\u001a\u000c\u0010$\u001a\u00020\u001c*\u00020#H\u0002\u001a\u000c\u0010%\u001a\u00020\u001c*\u00020\u0014H\u0000\u001a\u000c\u0010%\u001a\u00020\u001c*\u00020\u001dH\u0000\u001a\u000c\u0010%\u001a\u00020\u001c*\u00020 H\u0000\u001a\u000c\u0010%\u001a\u00020\u001c*\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\"\u0018\u0010\u0002\u001a\u00020\u0001*\u00020\u00068@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0007\"\u001e\u0010\u0008\u001a\u00020\t*\u00020\n8@X\u0080\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0018\u0010\u000f\u001a\u00020\u0001*\u00020\u00108@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012\"\u0018\u0010\u0013\u001a\u00020\t*\u00020\u00148@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0015\"\u0018\u0010\u0016\u001a\u00020\u0017*\u00020\u00188@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001a\"\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001c*\u00020\u001d8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001f\"\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001c*\u00020 8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010!\u00a8\u0006&"
    }
    d2 = {
        "MAX_BILLING_PHASES_DURATION_YEARS",
        "",
        "durationDays",
        "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;",
        "getDurationDays",
        "(Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;)I",
        "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;",
        "(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;)I",
        "hasAnyStoreDetails",
        "",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "getHasAnyStoreDetails$annotations",
        "(Lcom/qonversion/android/sdk/dto/products/QProduct;)V",
        "getHasAnyStoreDetails",
        "(Lcom/qonversion/android/sdk/dto/products/QProduct;)Z",
        "inDays",
        "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;",
        "getInDays",
        "(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;)I",
        "isOk",
        "Lcom/android/billingclient/api/BillingResult;",
        "(Lcom/android/billingclient/api/BillingResult;)Z",
        "pricePerMaxDuration",
        "",
        "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;",
        "getPricePerMaxDuration",
        "(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)D",
        "productId",
        "",
        "Lcom/android/billingclient/api/Purchase;",
        "getProductId",
        "(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;",
        "Lcom/android/billingclient/api/PurchaseHistoryRecord;",
        "(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/lang/String;",
        "getCurrentTimeInMillis",
        "",
        "convertLongToTime",
        "getDescription",
        "sdk_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final MAX_BILLING_PHASES_DURATION_YEARS:I = 0x37


# direct methods
.method private static final convertLongToTime(J)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/Date;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/text/SimpleDateFormat;

    .line 7
    .line 8
    const-string p1, "yyyy.MM.dd HH:mm"

    .line 9
    .line 10
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {p0, p1, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "format(...)"

    .line 22
    .line 23
    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object p0
.end method

.method public static final getCurrentTimeInMillis()J
    .locals 2

    .line 1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method private static final getDescription(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0xc

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    .line 25
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 26
    :pswitch_0
    const-string p0, "ITEM_NOT_OWNED"

    return-object p0

    .line 27
    :pswitch_1
    const-string p0, "ITEM_ALREADY_OWNED"

    return-object p0

    .line 28
    :pswitch_2
    const-string p0, "ERROR"

    return-object p0

    .line 29
    :pswitch_3
    const-string p0, "DEVELOPER_ERROR"

    return-object p0

    .line 30
    :pswitch_4
    const-string p0, "ITEM_UNAVAILABLE"

    return-object p0

    .line 31
    :pswitch_5
    const-string p0, "BILLING_UNAVAILABLE"

    return-object p0

    .line 32
    :pswitch_6
    const-string p0, "SERVICE_UNAVAILABLE"

    return-object p0

    .line 33
    :pswitch_7
    const-string p0, "USER_CANCELED"

    return-object p0

    .line 34
    :pswitch_8
    const-string p0, "OK"

    return-object p0

    .line 35
    :pswitch_9
    const-string p0, "SERVICE_DISCONNECTED"

    return-object p0

    .line 36
    :pswitch_a
    const-string p0, "FEATURE_NOT_SUPPORTED"

    return-object p0

    .line 37
    :cond_0
    const-string p0, "NETWORK_ERROR"

    return-object p0

    :pswitch_data_0
    .packed-switch -0x2
        :pswitch_a
        :pswitch_9
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

.method public static final getDescription(Lcom/android/billingclient/api/BillingResult;)Ljava/lang/String;
    .locals 1
    .param p0    # Lcom/android/billingclient/api/BillingResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result p0

    invoke-static {p0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDescription(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "It is a proxy of the Google BillingClient error: "

    .line 2
    invoke-static {v0, p0}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final getDescription(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;
    .locals 5
    .param p0    # Lcom/android/billingclient/api/Purchase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-static {p0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/android/billingclient/api/Purchase;->getOrderId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/android/billingclient/api/Purchase;->getPurchaseToken()Ljava/lang/String;

    move-result-object p0

    const-string v2, "ProductId: "

    const-string v3, "; OrderId: "

    const-string v4, "; PurchaseToken: "

    .line 17
    invoke-static {v2, v0, v3, v1, v4}, LA7/p0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final getDescription(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/lang/String;
    .locals 5
    .param p0    # Lcom/android/billingclient/api/PurchaseHistoryRecord;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-static {p0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/android/billingclient/api/PurchaseHistoryRecord;->getPurchaseTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->convertLongToTime(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/android/billingclient/api/PurchaseHistoryRecord;->getPurchaseToken()Ljava/lang/String;

    move-result-object p0

    const-string v2, "ProductId: "

    const-string v3, "; PurchaseTime: "

    const-string v4, "; PurchaseToken: "

    .line 8
    invoke-static {v2, v0, v3, v1, v4}, LA7/p0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final getDurationDays(Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;)I
    .locals 2
    .param p0    # Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getType()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    move-result-object v0

    sget-object v1, Lcom/qonversion/android/sdk/internal/billing/UtilsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    move-result-object v0

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDurationDays(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;)I

    move-result v0

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingCycleCount()I

    move-result p0

    mul-int/2addr p0, v0

    return p0
.end method

.method public static final getDurationDays(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;)I
    .locals 1
    .param p0    # Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->getUnit()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    move-result-object v0

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getInDays(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;)I

    move-result v0

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->getUnitCount()I

    move-result p0

    mul-int/2addr p0, v0

    return p0
.end method

.method public static final getHasAnyStoreDetails(Lcom/qonversion/android/sdk/dto/products/QProduct;)Z
    .locals 1
    .param p0    # Lcom/qonversion/android/sdk/dto/products/QProduct;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getSkuDetail()Lcom/android/billingclient/api/SkuDetails;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreDetails()Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 22
    return p0
.end method

.method public static synthetic getHasAnyStoreDetails$annotations(Lcom/qonversion/android/sdk/dto/products/QProduct;)V
    .locals 0

    return-void
.end method

.method public static final getInDays(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;)I
    .locals 2
    .param p0    # Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/qonversion/android/sdk/internal/billing/UtilsKt$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    aget p0, v0, p0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    if-eq p0, v0, :cond_4

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    if-eq p0, v0, :cond_3

    .line 19
    .line 20
    const/4 v0, 0x3

    .line 21
    if-eq p0, v0, :cond_2

    .line 22
    .line 23
    const/4 v0, 0x4

    .line 24
    if-eq p0, v0, :cond_1

    .line 25
    .line 26
    const/4 v0, 0x5

    .line 27
    if-ne p0, v0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return p0

    .line 31
    :cond_0
    new-instance p0, LE5/Q;

    .line 32
    .line 33
    const/16 v0, 0x9

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-direct {p0, v1, v0}, LE5/Q;-><init>(BI)V

    .line 37
    .line 38
    .line 39
    throw p0

    .line 40
    :cond_1
    const/16 p0, 0x16d

    .line 41
    .line 42
    return p0

    .line 43
    :cond_2
    const/16 p0, 0x1e

    .line 44
    .line 45
    return p0

    .line 46
    :cond_3
    const/4 p0, 0x7

    .line 47
    return p0

    .line 48
    :cond_4
    return v0
.end method

.method public static final getPricePerMaxDuration(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)D
    .locals 8
    .param p0    # Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Year:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getInDays(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    mul-int/lit8 v0, v0, 0x37

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getPricingPhases()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-wide/16 v1, 0x0

    .line 23
    .line 24
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_3

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 35
    .line 36
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->isBasePlan()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDurationDays(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_1

    .line 51
    .line 52
    int-to-double v4, v0

    .line 53
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDurationDays(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;)I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    int-to-double v6, p0

    .line 62
    div-double/2addr v4, v6

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    const-wide v4, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    :goto_1
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getPrice()Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getPriceAmountMicros()J

    .line 74
    .line 75
    .line 76
    move-result-wide v6

    .line 77
    long-to-double v6, v6

    .line 78
    mul-double/2addr v6, v4

    .line 79
    add-double/2addr v6, v1

    .line 80
    return-wide v6

    .line 81
    :cond_2
    invoke-static {v3}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDurationDays(Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;)I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    sub-int/2addr v0, v4

    .line 86
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->isTrial()Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-nez v4, :cond_0

    .line 91
    .line 92
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getPrice()Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v4}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getPriceAmountMicros()J

    .line 97
    .line 98
    .line 99
    move-result-wide v4

    .line 100
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingCycleCount()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    int-to-long v6, v3

    .line 105
    mul-long/2addr v4, v6

    .line 106
    long-to-double v3, v4

    .line 107
    add-double/2addr v1, v3

    .line 108
    goto :goto_0

    .line 109
    :cond_3
    return-wide v1
.end method

.method public static final getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;
    .locals 1
    .param p0    # Lcom/android/billingclient/api/Purchase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/android/billingclient/api/Purchase;->getProducts()Ljava/util/List;

    move-result-object p0

    const-string v0, "getProducts(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lff/o;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static final getProductId(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/lang/String;
    .locals 1
    .param p0    # Lcom/android/billingclient/api/PurchaseHistoryRecord;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/android/billingclient/api/PurchaseHistoryRecord;->getProducts()Ljava/util/List;

    move-result-object p0

    const-string v0, "getProducts(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lff/o;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static final isOk(Lcom/android/billingclient/api/BillingResult;)Z
    .locals 1
    .param p0    # Lcom/android/billingclient/api/BillingResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method
