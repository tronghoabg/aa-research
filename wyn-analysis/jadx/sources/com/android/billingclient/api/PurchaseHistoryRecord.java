package com.android.billingclient.api;

import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PurchaseHistoryRecord {

    /* renamed from: a, reason: collision with root package name */
    public final String f20060a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20061b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f20062c;

    public PurchaseHistoryRecord(String str, String str2) throws JSONException {
        this.f20060a = str;
        this.f20061b = str2;
        this.f20062c = new JSONObject(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f20062c;
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
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f20060a, purchaseHistoryRecord.getOriginalJson()) && TextUtils.equals(this.f20061b, purchaseHistoryRecord.getSignature());
    }

    public String getDeveloperPayload() {
        return this.f20062c.optString("developerPayload");
    }

    public String getOriginalJson() {
        return this.f20060a;
    }

    public List<String> getProducts() {
        return a();
    }

    public long getPurchaseTime() {
        return this.f20062c.optLong("purchaseTime");
    }

    public String getPurchaseToken() {
        JSONObject jSONObject = this.f20062c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int getQuantity() {
        return this.f20062c.optInt("quantity", 1);
    }

    public String getSignature() {
        return this.f20061b;
    }

    @Deprecated
    public ArrayList<String> getSkus() {
        return a();
    }

    public int hashCode() {
        return this.f20060a.hashCode();
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f20060a));
    }
}
