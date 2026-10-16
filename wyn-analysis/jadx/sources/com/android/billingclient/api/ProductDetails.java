package com.android.billingclient.api;

import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import ka.AbstractC3256n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ProductDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f20019a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f20020b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20021c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20022d;

    /* renamed from: e, reason: collision with root package name */
    public final String f20023e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20024f;

    /* renamed from: g, reason: collision with root package name */
    public final String f20025g;

    /* renamed from: h, reason: collision with root package name */
    public final String f20026h;

    /* renamed from: i, reason: collision with root package name */
    public final String f20027i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f20028j;
    public final ArrayList k;

    @zzj
    public static final class InstallmentPlanDetails {

        /* renamed from: a, reason: collision with root package name */
        public final int f20029a;

        /* renamed from: b, reason: collision with root package name */
        public final int f20030b;

        public InstallmentPlanDetails(JSONObject jSONObject) {
            this.f20029a = jSONObject.getInt("commitmentPaymentsCount");
            this.f20030b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        @zzj
        public int getInstallmentPlanCommitmentPaymentsCount() {
            return this.f20029a;
        }

        @zzj
        public int getSubsequentInstallmentPlanCommitmentPaymentsCount() {
            return this.f20030b;
        }
    }

    public static final class OneTimePurchaseOfferDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f20031a;

        /* renamed from: b, reason: collision with root package name */
        public final long f20032b;

        /* renamed from: c, reason: collision with root package name */
        public final String f20033c;

        /* renamed from: d, reason: collision with root package name */
        public final String f20034d;

        public OneTimePurchaseOfferDetails(JSONObject jSONObject) throws JSONException {
            this.f20031a = jSONObject.optString("formattedPrice");
            this.f20032b = jSONObject.optLong("priceAmountMicros");
            this.f20033c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.f20034d = true == strOptString.isEmpty() ? null : strOptString;
            jSONObject.optString("offerId").isEmpty();
            jSONObject.optString("purchaseOptionId").isEmpty();
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i5));
                }
            }
            com.google.android.gms.internal.play_billing.zzai.zzj(arrayList);
            if (jSONObject.has("fullPriceMicros")) {
                jSONObject.optLong("fullPriceMicros");
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.getInt("percentageDiscount");
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getLong("startTimeMillis");
                jSONObjectOptJSONObject2.getLong("endTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            if (jSONObjectOptJSONObject3 != null) {
                jSONObjectOptJSONObject3.getInt("maximumQuantity");
                jSONObjectOptJSONObject3.getInt("remainingQuantity");
            }
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject4.getLong("preorderReleaseTimeMillis");
                jSONObjectOptJSONObject4.getLong("preorderPresaleEndTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            if (jSONObjectOptJSONObject5 == null) {
                return;
            }
            jSONObjectOptJSONObject5.getString("rentalPeriod");
            jSONObjectOptJSONObject5.optString("rentalExpirationPeriod").isEmpty();
        }

        public String getFormattedPrice() {
            return this.f20031a;
        }

        public long getPriceAmountMicros() {
            return this.f20032b;
        }

        public String getPriceCurrencyCode() {
            return this.f20033c;
        }

        public final String zza() {
            return this.f20034d;
        }
    }

    public static final class PricingPhase {

        /* renamed from: a, reason: collision with root package name */
        public final String f20035a;

        /* renamed from: b, reason: collision with root package name */
        public final long f20036b;

        /* renamed from: c, reason: collision with root package name */
        public final String f20037c;

        /* renamed from: d, reason: collision with root package name */
        public final String f20038d;

        /* renamed from: e, reason: collision with root package name */
        public final int f20039e;

        /* renamed from: f, reason: collision with root package name */
        public final int f20040f;

        public PricingPhase(JSONObject jSONObject) {
            this.f20038d = jSONObject.optString("billingPeriod");
            this.f20037c = jSONObject.optString("priceCurrencyCode");
            this.f20035a = jSONObject.optString("formattedPrice");
            this.f20036b = jSONObject.optLong("priceAmountMicros");
            this.f20040f = jSONObject.optInt("recurrenceMode");
            this.f20039e = jSONObject.optInt("billingCycleCount");
        }

        public int getBillingCycleCount() {
            return this.f20039e;
        }

        public String getBillingPeriod() {
            return this.f20038d;
        }

        public String getFormattedPrice() {
            return this.f20035a;
        }

        public long getPriceAmountMicros() {
            return this.f20036b;
        }

        public String getPriceCurrencyCode() {
            return this.f20037c;
        }

        public int getRecurrenceMode() {
            return this.f20040f;
        }
    }

    public static class PricingPhases {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f20041a;

        public PricingPhases(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i5);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new PricingPhase(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f20041a = arrayList;
        }

        public List<PricingPhase> getPricingPhaseList() {
            return this.f20041a;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RecurrenceMode {
        public static final int FINITE_RECURRING = 2;
        public static final int INFINITE_RECURRING = 1;
        public static final int NON_RECURRING = 3;
    }

    public static final class SubscriptionOfferDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f20042a;

        /* renamed from: b, reason: collision with root package name */
        public final String f20043b;

        /* renamed from: c, reason: collision with root package name */
        public final String f20044c;

        /* renamed from: d, reason: collision with root package name */
        public final PricingPhases f20045d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f20046e;

        /* renamed from: f, reason: collision with root package name */
        public final InstallmentPlanDetails f20047f;

        public SubscriptionOfferDetails(JSONObject jSONObject) throws JSONException {
            this.f20042a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.f20043b = true == strOptString.isEmpty() ? null : strOptString;
            this.f20044c = jSONObject.getString("offerIdToken");
            this.f20045d = new PricingPhases(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f20047f = jSONObjectOptJSONObject != null ? new InstallmentPlanDetails(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                jSONObjectOptJSONObject2.optString("title");
                jSONObjectOptJSONObject2.optString(MediationMetaData.KEY_NAME);
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString("basePlanId");
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    new PricingPhase(jSONObjectOptJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i5));
                }
            }
            this.f20046e = arrayList;
        }

        public String getBasePlanId() {
            return this.f20042a;
        }

        @zzj
        public InstallmentPlanDetails getInstallmentPlanDetails() {
            return this.f20047f;
        }

        public String getOfferId() {
            return this.f20043b;
        }

        public List<String> getOfferTags() {
            return this.f20046e;
        }

        public String getOfferToken() {
            return this.f20044c;
        }

        public PricingPhases getPricingPhases() {
            return this.f20045d;
        }
    }

    public ProductDetails(String str) {
        this.f20019a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f20020b = jSONObject;
        String strOptString = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.f20021c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f20022d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f20023e = jSONObject.optString("title");
        this.f20024f = jSONObject.optString(MediationMetaData.KEY_NAME);
        this.f20025g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f20026h = jSONObject.optString("skuDetailsToken");
        this.f20027i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                arrayList.add(new SubscriptionOfferDetails(jSONArrayOptJSONArray.getJSONObject(i5)));
            }
            this.f20028j = arrayList;
        } else {
            this.f20028j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f20020b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f20020b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                arrayList2.add(new OneTimePurchaseOfferDetails(jSONArrayOptJSONArray2.getJSONObject(i10)));
            }
            this.k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.k = null;
        } else {
            arrayList2.add(new OneTimePurchaseOfferDetails(jSONObjectOptJSONObject));
            this.k = arrayList2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductDetails) {
            return TextUtils.equals(this.f20019a, ((ProductDetails) obj).f20019a);
        }
        return false;
    }

    public String getDescription() {
        return this.f20025g;
    }

    public String getName() {
        return this.f20024f;
    }

    public OneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails() {
        ArrayList arrayList = this.k;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (OneTimePurchaseOfferDetails) arrayList.get(0);
    }

    public String getProductId() {
        return this.f20021c;
    }

    public String getProductType() {
        return this.f20022d;
    }

    public List<SubscriptionOfferDetails> getSubscriptionOfferDetails() {
        return this.f20028j;
    }

    public String getTitle() {
        return this.f20023e;
    }

    public int hashCode() {
        return this.f20019a.hashCode();
    }

    public String toString() {
        String string = this.f20020b.toString();
        String strValueOf = String.valueOf(this.f20028j);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        AbstractC3256n.p(sb2, this.f20019a, "', parsedJson=", string, ", productId='");
        sb2.append(this.f20021c);
        sb2.append("', productType='");
        sb2.append(this.f20022d);
        sb2.append("', title='");
        sb2.append(this.f20023e);
        sb2.append("', productDetailsToken='");
        return AbstractC3256n.h(sb2, this.f20026h, "', subscriptionOfferDetails=", strValueOf, "}");
    }

    public final String zza() {
        return this.f20020b.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    }

    public String zzc() {
        return this.f20027i;
    }
}
