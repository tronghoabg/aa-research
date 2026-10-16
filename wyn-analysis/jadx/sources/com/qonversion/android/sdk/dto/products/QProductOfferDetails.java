package com.qonversion.android.sdk.dto.products;

import com.android.billingclient.api.ProductDetails;
import ff.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0013\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\fR\u0011\u0010\u001d\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\"¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0013\u0010'\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\b¨\u00060"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;", "", "originalOfferDetails", "Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;", "(Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;)V", "basePlan", "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;", "getBasePlan", "()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;", "basePlanId", "", "getBasePlanId", "()Ljava/lang/String;", "hasIntro", "", "getHasIntro", "()Z", "hasTrial", "getHasTrial", "hasTrialOrIntro", "getHasTrialOrIntro", "installmentPlanDetails", "Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;", "getInstallmentPlanDetails", "()Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;", "introPhase", "getIntroPhase", "offerId", "getOfferId", "offerToken", "getOfferToken", "getOriginalOfferDetails", "()Lcom/android/billingclient/api/ProductDetails$SubscriptionOfferDetails;", "pricingPhases", "", "getPricingPhases", "()Ljava/util/List;", "tags", "getTags", "trialPhase", "getTrialPhase", "component1", "copy", "equals", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QProductOfferDetails {

    @Nullable
    private final QProductPricingPhase basePlan;

    @NotNull
    private final String basePlanId;
    private final boolean hasIntro;
    private final boolean hasTrial;
    private final boolean hasTrialOrIntro;

    @Nullable
    private final QProductInstallmentPlanDetails installmentPlanDetails;

    @Nullable
    private final QProductPricingPhase introPhase;

    @Nullable
    private final String offerId;

    @NotNull
    private final String offerToken;

    @NotNull
    private final ProductDetails.SubscriptionOfferDetails originalOfferDetails;

    @NotNull
    private final List<QProductPricingPhase> pricingPhases;

    @NotNull
    private final List<String> tags;

    @Nullable
    private final QProductPricingPhase trialPhase;

    public QProductOfferDetails(@NotNull ProductDetails.SubscriptionOfferDetails originalOfferDetails) {
        Object obj;
        Object next;
        Object next2;
        AbstractC3340k.e(originalOfferDetails, "originalOfferDetails");
        this.originalOfferDetails = originalOfferDetails;
        String basePlanId = originalOfferDetails.getBasePlanId();
        AbstractC3340k.d(basePlanId, "getBasePlanId(...)");
        this.basePlanId = basePlanId;
        this.offerId = originalOfferDetails.getOfferId();
        String offerToken = originalOfferDetails.getOfferToken();
        AbstractC3340k.d(offerToken, "getOfferToken(...)");
        this.offerToken = offerToken;
        List<String> offerTags = originalOfferDetails.getOfferTags();
        AbstractC3340k.d(offerTags, "getOfferTags(...)");
        this.tags = offerTags;
        List<ProductDetails.PricingPhase> pricingPhaseList = originalOfferDetails.getPricingPhases().getPricingPhaseList();
        AbstractC3340k.d(pricingPhaseList, "getPricingPhaseList(...)");
        List<ProductDetails.PricingPhase> list = pricingPhaseList;
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        for (ProductDetails.PricingPhase pricingPhase : list) {
            AbstractC3340k.b(pricingPhase);
            arrayList.add(new QProductPricingPhase(pricingPhase));
        }
        this.pricingPhases = arrayList;
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                if (((QProductPricingPhase) next).getIsBasePlan()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        this.basePlan = (QProductPricingPhase) next;
        ProductDetails.InstallmentPlanDetails installmentPlanDetails = this.originalOfferDetails.getInstallmentPlanDetails();
        this.installmentPlanDetails = installmentPlanDetails != null ? new QProductInstallmentPlanDetails(installmentPlanDetails) : null;
        Iterator<T> it2 = this.pricingPhases.iterator();
        while (true) {
            if (it2.hasNext()) {
                next2 = it2.next();
                if (((QProductPricingPhase) next2).getIsTrial()) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        this.trialPhase = (QProductPricingPhase) next2;
        Iterator<T> it3 = this.pricingPhases.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next3 = it3.next();
            if (((QProductPricingPhase) next3).getIsIntro()) {
                obj = next3;
                break;
            }
        }
        QProductPricingPhase qProductPricingPhase = (QProductPricingPhase) obj;
        this.introPhase = qProductPricingPhase;
        boolean z2 = this.trialPhase != null;
        this.hasTrial = z2;
        boolean z10 = qProductPricingPhase != null;
        this.hasIntro = z10;
        this.hasTrialOrIntro = z2 || z10;
    }

    public static /* synthetic */ QProductOfferDetails copy$default(QProductOfferDetails qProductOfferDetails, ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            subscriptionOfferDetails = qProductOfferDetails.originalOfferDetails;
        }
        return qProductOfferDetails.copy(subscriptionOfferDetails);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ProductDetails.SubscriptionOfferDetails getOriginalOfferDetails() {
        return this.originalOfferDetails;
    }

    @NotNull
    public final QProductOfferDetails copy(@NotNull ProductDetails.SubscriptionOfferDetails originalOfferDetails) {
        AbstractC3340k.e(originalOfferDetails, "originalOfferDetails");
        return new QProductOfferDetails(originalOfferDetails);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QProductOfferDetails) && AbstractC3340k.a(this.originalOfferDetails, ((QProductOfferDetails) other).originalOfferDetails);
    }

    @Nullable
    public final QProductPricingPhase getBasePlan() {
        return this.basePlan;
    }

    @NotNull
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final boolean getHasIntro() {
        return this.hasIntro;
    }

    public final boolean getHasTrial() {
        return this.hasTrial;
    }

    public final boolean getHasTrialOrIntro() {
        return this.hasTrialOrIntro;
    }

    @Nullable
    public final QProductInstallmentPlanDetails getInstallmentPlanDetails() {
        return this.installmentPlanDetails;
    }

    @Nullable
    public final QProductPricingPhase getIntroPhase() {
        return this.introPhase;
    }

    @Nullable
    public final String getOfferId() {
        return this.offerId;
    }

    @NotNull
    public final String getOfferToken() {
        return this.offerToken;
    }

    @NotNull
    public final ProductDetails.SubscriptionOfferDetails getOriginalOfferDetails() {
        return this.originalOfferDetails;
    }

    @NotNull
    public final List<QProductPricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    @NotNull
    public final List<String> getTags() {
        return this.tags;
    }

    @Nullable
    public final QProductPricingPhase getTrialPhase() {
        return this.trialPhase;
    }

    public int hashCode() {
        return this.originalOfferDetails.hashCode();
    }

    @NotNull
    public String toString() {
        return "QProductOfferDetails(originalOfferDetails=" + this.originalOfferDetails + ")";
    }
}
