.class public final Lcom/qonversion/android/sdk/internal/ErrorsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/ErrorsKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "toQonversionError",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "Lcom/qonversion/android/sdk/internal/billing/BillingError;",
        "",
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


# direct methods
.method public static final toQonversionError(Lcom/qonversion/android/sdk/internal/billing/BillingError;)Lcom/qonversion/android/sdk/dto/QonversionError;
    .locals 7
    .param p0    # Lcom/qonversion/android/sdk/internal/billing/BillingError;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/BillingError;->getBillingResponseCode()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    .line 2
    sget-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->Unknown:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    :goto_0
    move-object v2, v0

    goto :goto_1

    .line 3
    :pswitch_0
    sget-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProductNotOwned:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    goto :goto_0

    .line 4
    :pswitch_1
    sget-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProductAlreadyOwned:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    goto :goto_0

    .line 5
    :pswitch_2
    sget-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchaseInvalid:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    goto :goto_0

    .line 6
    :pswitch_3
    sget-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->StoreProductNotAvailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    goto :goto_0

    .line 7
    :pswitch_4
    sget-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->BillingUnavailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    goto :goto_0

    .line 8
    :pswitch_5
    sget-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchaseCanceled:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    goto :goto_0

    .line 9
    :pswitch_6
    sget-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->Unknown:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    goto :goto_0

    .line 10
    :pswitch_7
    sget-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PlayStoreError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    goto :goto_0

    .line 11
    :pswitch_8
    sget-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->FeatureNotSupported:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->NetworkConnectionFailed:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    goto :goto_0

    .line 13
    :goto_1
    sget-object v0, Lcom/qonversion/android/sdk/internal/ErrorsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 14
    const-string v0, ""

    goto :goto_2

    .line 15
    :cond_1
    const-string v0, "Please make sure that you are using the google account where purchases are allowed and the application was correctly signed and properly set up for billing."

    goto :goto_2

    .line 16
    :cond_2
    const-string v0, "Billing service is not connected to any Google account at the moment."

    .line 17
    :goto_2
    new-instance v1, Lcom/qonversion/android/sdk/dto/QonversionError;

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/billing/BillingError;->getMessage()Ljava/lang/String;

    move-result-object p0

    const-string v3, ". "

    .line 18
    invoke-static {p0, v3, v0}, LN0/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 19
    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch -0x2
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_7
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_7
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final toQonversionError(Ljava/lang/Throwable;)Lcom/qonversion/android/sdk/dto/QonversionError;
    .locals 9
    .param p0    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    instance-of v0, p0, Lorg/json/JSONException;

    const-string v1, ""

    if-eqz v0, :cond_1

    .line 27
    new-instance v2, Lcom/qonversion/android/sdk/dto/QonversionError;

    sget-object v3, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ResponseParsingFailed:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    check-cast p0, Lorg/json/JSONException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object v4, p0

    :goto_0
    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    .line 28
    :cond_1
    instance-of v0, p0, Ljava/io/IOException;

    if-eqz v0, :cond_3

    .line 29
    new-instance v2, Lcom/qonversion/android/sdk/dto/QonversionError;

    sget-object v3, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->NetworkConnectionFailed:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    check-cast p0, Ljava/io/IOException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    move-object v4, v1

    goto :goto_1

    :cond_2
    move-object v4, p0

    :goto_1
    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    .line 30
    :cond_3
    new-instance v3, Lcom/qonversion/android/sdk/dto/QonversionError;

    sget-object v4, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->Unknown:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_4

    move-object v5, v1

    goto :goto_2

    :cond_4
    move-object v5, p0

    :goto_2
    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method
