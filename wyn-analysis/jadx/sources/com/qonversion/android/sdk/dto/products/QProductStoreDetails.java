package com.qonversion.android.sdk.dto.products;

import com.android.billingclient.api.ProductDetails;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00104\u001a\u00020\u00122\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\n2\u0006\u00107\u001a\u00020\u0005J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u001e\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u001f\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010 \u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010!\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\bR\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0019\u0010+\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010,¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\b¨\u0006;"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;", "", "originalProductDetails", "Lcom/android/billingclient/api/ProductDetails;", "basePlanId", "", "(Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;)V", "getBasePlanId", "()Ljava/lang/String;", "basePlanSubscriptionOfferDetails", "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;", "getBasePlanSubscriptionOfferDetails", "()Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;", "defaultSubscriptionOfferDetails", "getDefaultSubscriptionOfferDetails", "description", "getDescription", "hasIntroOffer", "", "getHasIntroOffer", "()Z", "hasTrialOffer", "getHasTrialOffer", "hasTrialOrIntroOffer", "getHasTrialOrIntroOffer", "inAppOfferDetails", "Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;", "getInAppOfferDetails", "()Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;", "isInApp", "isInstallment", "isPrepaid", "isSubscription", MediationMetaData.KEY_NAME, "getName", "getOriginalProductDetails", "()Lcom/android/billingclient/api/ProductDetails;", InAppPurchaseMetaData.KEY_PRODUCT_ID, "getProductId", "productType", "Lcom/qonversion/android/sdk/dto/products/QProductType;", "getProductType", "()Lcom/qonversion/android/sdk/dto/products/QProductType;", "subscriptionOfferDetails", "", "getSubscriptionOfferDetails", "()Ljava/util/List;", "title", "getTitle", "component1", "component2", "copy", "equals", "other", "findOffer", "offerId", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QProductStoreDetails {

    @Nullable
    private final String basePlanId;

    @Nullable
    private final QProductOfferDetails basePlanSubscriptionOfferDetails;

    @Nullable
    private final QProductOfferDetails defaultSubscriptionOfferDetails;

    @NotNull
    private final String description;
    private final boolean hasIntroOffer;
    private final boolean hasTrialOffer;
    private final boolean hasTrialOrIntroOffer;

    @Nullable
    private final QProductInAppDetails inAppOfferDetails;
    private final boolean isInApp;
    private final boolean isInstallment;
    private final boolean isPrepaid;
    private final boolean isSubscription;

    @NotNull
    private final String name;

    @NotNull
    private final ProductDetails originalProductDetails;

    @NotNull
    private final String productId;

    @NotNull
    private final QProductType productType;

    @Nullable
    private final List<QProductOfferDetails> subscriptionOfferDetails;

    @NotNull
    private final String title;

    /* JADX WARN: Removed duplicated region for block: B:110:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public QProductStoreDetails(@org.jetbrains.annotations.NotNull com.android.billingclient.api.ProductDetails r8, @org.jetbrains.annotations.Nullable java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qonversion.android.sdk.dto.products.QProductStoreDetails.<init>(com.android.billingclient.api.ProductDetails, java.lang.String):void");
    }

    public static /* synthetic */ QProductStoreDetails copy$default(QProductStoreDetails qProductStoreDetails, ProductDetails productDetails, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            productDetails = qProductStoreDetails.originalProductDetails;
        }
        if ((i5 & 2) != 0) {
            str = qProductStoreDetails.basePlanId;
        }
        return qProductStoreDetails.copy(productDetails, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ProductDetails getOriginalProductDetails() {
        return this.originalProductDetails;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @NotNull
    public final QProductStoreDetails copy(@NotNull ProductDetails originalProductDetails, @Nullable String basePlanId) {
        AbstractC3340k.e(originalProductDetails, "originalProductDetails");
        return new QProductStoreDetails(originalProductDetails, basePlanId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QProductStoreDetails)) {
            return false;
        }
        QProductStoreDetails qProductStoreDetails = (QProductStoreDetails) other;
        return AbstractC3340k.a(this.originalProductDetails, qProductStoreDetails.originalProductDetails) && AbstractC3340k.a(this.basePlanId, qProductStoreDetails.basePlanId);
    }

    @Nullable
    public final QProductOfferDetails findOffer(@NotNull String offerId) {
        AbstractC3340k.e(offerId, "offerId");
        List<QProductOfferDetails> list = this.subscriptionOfferDetails;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (AbstractC3340k.a(((QProductOfferDetails) next).getOfferId(), offerId)) {
                obj = next;
                break;
            }
        }
        return (QProductOfferDetails) obj;
    }

    @Nullable
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @Nullable
    public final QProductOfferDetails getBasePlanSubscriptionOfferDetails() {
        return this.basePlanSubscriptionOfferDetails;
    }

    @Nullable
    public final QProductOfferDetails getDefaultSubscriptionOfferDetails() {
        return this.defaultSubscriptionOfferDetails;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final boolean getHasIntroOffer() {
        return this.hasIntroOffer;
    }

    public final boolean getHasTrialOffer() {
        return this.hasTrialOffer;
    }

    public final boolean getHasTrialOrIntroOffer() {
        return this.hasTrialOrIntroOffer;
    }

    @Nullable
    public final QProductInAppDetails getInAppOfferDetails() {
        return this.inAppOfferDetails;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ProductDetails getOriginalProductDetails() {
        return this.originalProductDetails;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final QProductType getProductType() {
        return this.productType;
    }

    @Nullable
    public final List<QProductOfferDetails> getSubscriptionOfferDetails() {
        return this.subscriptionOfferDetails;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.originalProductDetails.hashCode() * 31;
        String str = this.basePlanId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: isInApp, reason: from getter */
    public final boolean getIsInApp() {
        return this.isInApp;
    }

    /* renamed from: isInstallment, reason: from getter */
    public final boolean getIsInstallment() {
        return this.isInstallment;
    }

    /* renamed from: isPrepaid, reason: from getter */
    public final boolean getIsPrepaid() {
        return this.isPrepaid;
    }

    /* renamed from: isSubscription, reason: from getter */
    public final boolean getIsSubscription() {
        return this.isSubscription;
    }

    @NotNull
    public String toString() {
        return "QProductStoreDetails(originalProductDetails=" + this.originalProductDetails + ", basePlanId=" + this.basePlanId + ")";
    }
}
