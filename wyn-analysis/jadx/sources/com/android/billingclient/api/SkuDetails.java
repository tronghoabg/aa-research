package com.android.billingclient.api;

import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class SkuDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f20073a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f20074b;

    public SkuDetails(String str) throws JSONException {
        this.f20073a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f20074b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f20073a, ((SkuDetails) obj).f20073a);
        }
        return false;
    }

    public String getDescription() {
        return this.f20074b.optString("description");
    }

    public String getFreeTrialPeriod() {
        return this.f20074b.optString("freeTrialPeriod");
    }

    public String getIconUrl() {
        return this.f20074b.optString("iconUrl");
    }

    public String getIntroductoryPrice() {
        return this.f20074b.optString("introductoryPrice");
    }

    public long getIntroductoryPriceAmountMicros() {
        return this.f20074b.optLong("introductoryPriceAmountMicros");
    }

    public int getIntroductoryPriceCycles() {
        return this.f20074b.optInt("introductoryPriceCycles");
    }

    public String getIntroductoryPricePeriod() {
        return this.f20074b.optString("introductoryPricePeriod");
    }

    public String getOriginalJson() {
        return this.f20073a;
    }

    public String getOriginalPrice() {
        JSONObject jSONObject = this.f20074b;
        return jSONObject.has("original_price") ? jSONObject.optString("original_price") : getPrice();
    }

    public long getOriginalPriceAmountMicros() {
        JSONObject jSONObject = this.f20074b;
        return jSONObject.has("original_price_micros") ? jSONObject.optLong("original_price_micros") : getPriceAmountMicros();
    }

    public String getPrice() {
        return this.f20074b.optString(InAppPurchaseMetaData.KEY_PRICE);
    }

    public long getPriceAmountMicros() {
        return this.f20074b.optLong("price_amount_micros");
    }

    public String getPriceCurrencyCode() {
        return this.f20074b.optString("price_currency_code");
    }

    public String getSku() {
        return this.f20074b.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
    }

    public String getSubscriptionPeriod() {
        return this.f20074b.optString("subscriptionPeriod");
    }

    public String getTitle() {
        return this.f20074b.optString("title");
    }

    public String getType() {
        return this.f20074b.optString("type");
    }

    public int hashCode() {
        return this.f20073a.hashCode();
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f20073a));
    }

    public int zza() {
        return this.f20074b.optInt("offer_type");
    }

    public String zzb() {
        return this.f20074b.optString("offer_id");
    }

    public String zzc() {
        JSONObject jSONObject = this.f20074b;
        String strOptString = jSONObject.optString("offerIdToken");
        return strOptString.isEmpty() ? jSONObject.optString("offer_id_token") : strOptString;
    }

    public final String zzd() {
        return this.f20074b.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    }

    public String zze() {
        return this.f20074b.optString("serializedDocid");
    }
}
