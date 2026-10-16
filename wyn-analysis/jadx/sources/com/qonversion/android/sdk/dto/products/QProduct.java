package com.qonversion.android.sdk.dto.products;

import A7.AbstractC0279p0;
import Bf.k;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.SkuDetails;
import com.applovin.sdk.AppLovinEventParameters;
import com.qonversion.android.sdk.dto.QPurchaseModel;
import com.qonversion.android.sdk.dto.QPurchaseUpdateModel;
import com.qonversion.android.sdk.dto.QPurchaseUpdatePolicy;
import ef.InterfaceC2519c;
import hb.InterfaceC2812o;
import hb.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wg.b;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\n\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ2\u0010\u001f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001cR*\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b.\u0010/\u0012\u0004\b4\u00105\u001a\u0004\b0\u00101\"\u0004\b2\u00103R(\u00108\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u0001068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R$\u0010<\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010)\u001a\u0004\b=\u0010\u001c\"\u0004\b>\u0010?R\u0013\u0010C\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0013\u0010E\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bD\u0010BR\u0011\u0010I\u001a\u00020F8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0013\u0010K\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\bJ\u0010\u001c¨\u0006L"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QProduct;", "", "", "qonversionID", "storeID", "basePlanID", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "offerId", "Lcom/qonversion/android/sdk/dto/QPurchaseModel;", "toPurchaseModel", "(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QPurchaseModel;", "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;", "offer", "(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)Lcom/qonversion/android/sdk/dto/QPurchaseModel;", "oldProductId", "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;", "updatePolicy", "Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;", "toPurchaseUpdateModel", "(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;", "Lcom/android/billingclient/api/ProductDetails;", "productDetails", "Lef/C;", "setStoreProductDetails$sdk_release", "(Lcom/android/billingclient/api/ProductDetails;)V", "setStoreProductDetails", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QProduct;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQonversionID", "getStoreID", "getBasePlanID", "Lcom/android/billingclient/api/SkuDetails;", "skuDetail", "Lcom/android/billingclient/api/SkuDetails;", "getSkuDetail", "()Lcom/android/billingclient/api/SkuDetails;", "setSkuDetail", "(Lcom/android/billingclient/api/SkuDetails;)V", "getSkuDetail$annotations", "()V", "Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;", "<set-?>", "storeDetails", "Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;", "getStoreDetails", "()Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;", "offeringID", "getOfferingID", "setOfferingID", "(Ljava/lang/String;)V", "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;", "getSubscriptionPeriod", "()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;", "subscriptionPeriod", "getTrialPeriod", "trialPeriod", "Lcom/qonversion/android/sdk/dto/products/QProductType;", "getType", "()Lcom/qonversion/android/sdk/dto/products/QProductType;", "type", "getPrettyPrice", "prettyPrice", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QProduct {

    @Nullable
    private final String basePlanID;

    @Nullable
    private transient String offeringID;

    @NotNull
    private final String qonversionID;

    @Nullable
    private transient SkuDetails skuDetail;

    @Nullable
    private transient QProductStoreDetails storeDetails;

    @Nullable
    private final String storeID;

    public QProduct(@InterfaceC2812o(name = "id") @NotNull String qonversionID, @InterfaceC2812o(name = AppLovinEventParameters.IN_APP_PURCHASE_TRANSACTION_IDENTIFIER) @Nullable String str, @InterfaceC2812o(name = "base_plan_id") @Nullable String str2) {
        AbstractC3340k.e(qonversionID, "qonversionID");
        this.qonversionID = qonversionID;
        this.storeID = str;
        this.basePlanID = str2;
    }

    public static /* synthetic */ QProduct copy$default(QProduct qProduct, String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = qProduct.qonversionID;
        }
        if ((i5 & 2) != 0) {
            str2 = qProduct.storeID;
        }
        if ((i5 & 4) != 0) {
            str3 = qProduct.basePlanID;
        }
        return qProduct.copy(str, str2, str3);
    }

    @InterfaceC2519c
    public static /* synthetic */ void getSkuDetail$annotations() {
    }

    public static /* synthetic */ QPurchaseModel toPurchaseModel$default(QProduct qProduct, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        return qProduct.toPurchaseModel(str);
    }

    public static /* synthetic */ QPurchaseUpdateModel toPurchaseUpdateModel$default(QProduct qProduct, String str, QPurchaseUpdatePolicy qPurchaseUpdatePolicy, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            qPurchaseUpdatePolicy = null;
        }
        return qProduct.toPurchaseUpdateModel(str, qPurchaseUpdatePolicy);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getQonversionID() {
        return this.qonversionID;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getStoreID() {
        return this.storeID;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getBasePlanID() {
        return this.basePlanID;
    }

    @NotNull
    public final QProduct copy(@InterfaceC2812o(name = "id") @NotNull String qonversionID, @InterfaceC2812o(name = AppLovinEventParameters.IN_APP_PURCHASE_TRANSACTION_IDENTIFIER) @Nullable String storeID, @InterfaceC2812o(name = "base_plan_id") @Nullable String basePlanID) {
        AbstractC3340k.e(qonversionID, "qonversionID");
        return new QProduct(qonversionID, storeID, basePlanID);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QProduct)) {
            return false;
        }
        QProduct qProduct = (QProduct) other;
        return AbstractC3340k.a(this.qonversionID, qProduct.qonversionID) && AbstractC3340k.a(this.storeID, qProduct.storeID) && AbstractC3340k.a(this.basePlanID, qProduct.basePlanID);
    }

    @Nullable
    public final String getBasePlanID() {
        return this.basePlanID;
    }

    @Nullable
    public final String getOfferingID() {
        return this.offeringID;
    }

    @Nullable
    public final String getPrettyPrice() {
        QProductOfferDetails basePlanSubscriptionOfferDetails;
        QProductPricingPhase basePlan;
        QProductPrice price;
        QProductInAppDetails inAppOfferDetails;
        QProductPrice price2;
        if (getType() == QProductType.InApp) {
            QProductStoreDetails qProductStoreDetails = this.storeDetails;
            if (qProductStoreDetails == null || (inAppOfferDetails = qProductStoreDetails.getInAppOfferDetails()) == null || (price2 = inAppOfferDetails.getPrice()) == null) {
                return null;
            }
            return price2.getFormattedPrice();
        }
        QProductStoreDetails qProductStoreDetails2 = this.storeDetails;
        if ((qProductStoreDetails2 != null ? qProductStoreDetails2.getBasePlanSubscriptionOfferDetails() : null) == null) {
            SkuDetails skuDetails = this.skuDetail;
            if (skuDetails != null) {
                return skuDetails.getPrice();
            }
            return null;
        }
        QProductStoreDetails qProductStoreDetails3 = this.storeDetails;
        if (qProductStoreDetails3 == null || (basePlanSubscriptionOfferDetails = qProductStoreDetails3.getBasePlanSubscriptionOfferDetails()) == null || (basePlan = basePlanSubscriptionOfferDetails.getBasePlan()) == null || (price = basePlan.getPrice()) == null) {
            return null;
        }
        return price.getFormattedPrice();
    }

    @NotNull
    public final String getQonversionID() {
        return this.qonversionID;
    }

    @Nullable
    public final SkuDetails getSkuDetail() {
        return this.skuDetail;
    }

    @Nullable
    public final QProductStoreDetails getStoreDetails() {
        return this.storeDetails;
    }

    @Nullable
    public final String getStoreID() {
        return this.storeID;
    }

    @Nullable
    public final QSubscriptionPeriod getSubscriptionPeriod() {
        String subscriptionPeriod;
        QProductOfferDetails defaultSubscriptionOfferDetails;
        QProductStoreDetails qProductStoreDetails = this.storeDetails;
        if (qProductStoreDetails != null && (defaultSubscriptionOfferDetails = qProductStoreDetails.getDefaultSubscriptionOfferDetails()) != null) {
            QProductPricingPhase basePlan = defaultSubscriptionOfferDetails.getBasePlan();
            if (basePlan != null) {
                return basePlan.getBillingPeriod();
            }
            return null;
        }
        SkuDetails skuDetails = this.skuDetail;
        if (skuDetails != null && (subscriptionPeriod = skuDetails.getSubscriptionPeriod()) != null) {
            if (k.y0(subscriptionPeriod)) {
                subscriptionPeriod = null;
            }
            if (subscriptionPeriod != null) {
                return QSubscriptionPeriod.INSTANCE.from(subscriptionPeriod);
            }
        }
        return null;
    }

    @Nullable
    public final QSubscriptionPeriod getTrialPeriod() {
        String freeTrialPeriod;
        QProductOfferDetails defaultSubscriptionOfferDetails;
        QProductStoreDetails qProductStoreDetails = this.storeDetails;
        if (qProductStoreDetails != null && (defaultSubscriptionOfferDetails = qProductStoreDetails.getDefaultSubscriptionOfferDetails()) != null) {
            QProductPricingPhase trialPhase = defaultSubscriptionOfferDetails.getTrialPhase();
            if (trialPhase != null) {
                return trialPhase.getBillingPeriod();
            }
            return null;
        }
        SkuDetails skuDetails = this.skuDetail;
        if (skuDetails != null && (freeTrialPeriod = skuDetails.getFreeTrialPeriod()) != null) {
            if (k.y0(freeTrialPeriod)) {
                freeTrialPeriod = null;
            }
            if (freeTrialPeriod != null) {
                return QSubscriptionPeriod.INSTANCE.from(freeTrialPeriod);
            }
        }
        return null;
    }

    @NotNull
    public final QProductType getType() {
        String introductoryPricePeriod;
        List<QProductOfferDetails> subscriptionOfferDetails;
        QProductStoreDetails qProductStoreDetails = this.storeDetails;
        QProductType productType = (qProductStoreDetails == null || (((subscriptionOfferDetails = qProductStoreDetails.getSubscriptionOfferDetails()) == null || !(subscriptionOfferDetails.isEmpty() ^ true)) && qProductStoreDetails.getInAppOfferDetails() == null)) ? null : qProductStoreDetails.getProductType();
        if (productType != null && productType != QProductType.Unknown) {
            return productType;
        }
        SkuDetails skuDetails = this.skuDetail;
        if (AbstractC3340k.a(skuDetails != null ? skuDetails.getType() : null, "inapp")) {
            return QProductType.InApp;
        }
        if (getTrialPeriod() != null) {
            return QProductType.Trial;
        }
        SkuDetails skuDetails2 = this.skuDetail;
        return (skuDetails2 == null || (introductoryPricePeriod = skuDetails2.getIntroductoryPricePeriod()) == null || !(k.y0(introductoryPricePeriod) ^ true)) ? getSubscriptionPeriod() != null ? QProductType.Subscription : QProductType.Unknown : QProductType.Intro;
    }

    public int hashCode() {
        int iHashCode = this.qonversionID.hashCode() * 31;
        String str = this.storeID;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.basePlanID;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setOfferingID(@Nullable String str) {
        this.offeringID = str;
    }

    public final void setSkuDetail(@Nullable SkuDetails skuDetails) {
        this.skuDetail = skuDetails;
    }

    public final void setStoreProductDetails$sdk_release(@NotNull ProductDetails productDetails) {
        AbstractC3340k.e(productDetails, "productDetails");
        this.storeDetails = new QProductStoreDetails(productDetails, this.basePlanID);
    }

    @InterfaceC2519c
    @NotNull
    public final QPurchaseModel toPurchaseModel() {
        return toPurchaseModel$default(this, null, 1, null);
    }

    @InterfaceC2519c
    @NotNull
    public final QPurchaseUpdateModel toPurchaseUpdateModel(@NotNull String oldProductId) {
        AbstractC3340k.e(oldProductId, "oldProductId");
        return toPurchaseUpdateModel$default(this, oldProductId, null, 2, null);
    }

    @NotNull
    public String toString() {
        String str = this.qonversionID;
        String str2 = this.storeID;
        return b.c(AbstractC0279p0.r("QProduct(qonversionID=", str, ", storeID=", str2, ", basePlanID="), this.basePlanID, ")");
    }

    @InterfaceC2519c
    @NotNull
    public final QPurchaseModel toPurchaseModel(@Nullable String offerId) {
        return new QPurchaseModel(this.qonversionID, offerId);
    }

    @InterfaceC2519c
    @NotNull
    public final QPurchaseUpdateModel toPurchaseUpdateModel(@NotNull String oldProductId, @Nullable QPurchaseUpdatePolicy updatePolicy) {
        AbstractC3340k.e(oldProductId, "oldProductId");
        return new QPurchaseUpdateModel(this.qonversionID, oldProductId, updatePolicy, null, 8, null);
    }

    @InterfaceC2519c
    @NotNull
    public final QPurchaseModel toPurchaseModel(@Nullable QProductOfferDetails offer) {
        QPurchaseModel purchaseModel = toPurchaseModel(offer != null ? offer.getOfferId() : null);
        if (offer != null && offer.getOfferId() == null) {
            purchaseModel.removeOffer();
        }
        return purchaseModel;
    }
}
