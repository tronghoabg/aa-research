package com.android.billingclient.api;

import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Purchase {

    /* renamed from: a, reason: collision with root package name */
    public final String f20056a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20057b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f20058c;

    @zzk
    public static final class PendingPurchaseUpdate {

        /* renamed from: a, reason: collision with root package name */
        public final JSONObject f20059a;

        public PendingPurchaseUpdate(JSONObject jSONObject) {
            this.f20059a = jSONObject;
        }

        public List<String> getProducts() {
            JSONArray jSONArrayOptJSONArray;
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = this.f20059a;
            if (jSONObject.has("productIds") && (jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds")) != null) {
                for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i5));
                }
            }
            return arrayList;
        }

        public String getPurchaseToken() {
            return this.f20059a.optString("purchaseToken");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PurchaseState {
        public static final int PENDING = 2;
        public static final int PURCHASED = 1;
        public static final int UNSPECIFIED_STATE = 0;
    }

    public Purchase(String str, String str2) throws JSONException {
        this.f20056a = str;
        this.f20057b = str2;
        this.f20058c = new JSONObject(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f20058c;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i5));
                }
            }
        } else if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
            arrayList.add(jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f20056a, purchase.getOriginalJson()) && TextUtils.equals(this.f20057b, purchase.getSignature());
    }

    public AccountIdentifiers getAccountIdentifiers() {
        JSONObject jSONObject = this.f20058c;
        String strOptString = jSONObject.optString("obfuscatedAccountId");
        String strOptString2 = jSONObject.optString("obfuscatedProfileId");
        if (strOptString == null && strOptString2 == null) {
            return null;
        }
        return new AccountIdentifiers(strOptString, strOptString2);
    }

    public String getDeveloperPayload() {
        return this.f20058c.optString("developerPayload");
    }

    public String getOrderId() {
        String strOptString = this.f20058c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    public String getOriginalJson() {
        return this.f20056a;
    }

    public String getPackageName() {
        return this.f20058c.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    }

    @zzk
    public PendingPurchaseUpdate getPendingPurchaseUpdate() {
        JSONObject jSONObjectOptJSONObject = this.f20058c.optJSONObject("pendingPurchaseUpdate");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new PendingPurchaseUpdate(jSONObjectOptJSONObject);
    }

    public List<String> getProducts() {
        return a();
    }

    public int getPurchaseState() {
        return this.f20058c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long getPurchaseTime() {
        return this.f20058c.optLong("purchaseTime");
    }

    public String getPurchaseToken() {
        JSONObject jSONObject = this.f20058c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int getQuantity() {
        return this.f20058c.optInt("quantity", 1);
    }

    public String getSignature() {
        return this.f20057b;
    }

    @Deprecated
    public ArrayList<String> getSkus() {
        return a();
    }

    public int hashCode() {
        return this.f20056a.hashCode();
    }

    public boolean isAcknowledged() {
        return this.f20058c.optBoolean("acknowledged", true);
    }

    public boolean isAutoRenewing() {
        return this.f20058c.optBoolean("autoRenewing");
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f20056a));
    }
}
