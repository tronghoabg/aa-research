package com.android.billingclient.api;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@zzl
/* loaded from: classes.dex */
public final class UserChoiceDetails {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f20079a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f20080b;

    @zzl
    public static class Product {

        /* renamed from: a, reason: collision with root package name */
        public final String f20081a;

        /* renamed from: b, reason: collision with root package name */
        public final String f20082b;

        /* renamed from: c, reason: collision with root package name */
        public final String f20083c;

        public Product(JSONObject jSONObject) {
            this.f20081a = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            this.f20082b = jSONObject.optString("productType");
            String strOptString = jSONObject.optString("offerToken");
            this.f20083c = true == strOptString.isEmpty() ? null : strOptString;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return this.f20081a.equals(product.getId()) && this.f20082b.equals(product.getType()) && Objects.equals(this.f20083c, product.getOfferToken());
        }

        public String getId() {
            return this.f20081a;
        }

        public String getOfferToken() {
            return this.f20083c;
        }

        public String getType() {
            return this.f20082b;
        }

        public int hashCode() {
            return Objects.hash(this.f20081a, this.f20082b, this.f20083c);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{id: ");
            sb2.append(this.f20081a);
            sb2.append(", type: ");
            sb2.append(this.f20082b);
            sb2.append(", offer token: ");
            return wg.b.c(sb2, this.f20083c, "}");
        }
    }

    public UserChoiceDetails(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.f20079a = jSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i5);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new Product(jSONObjectOptJSONObject));
                }
            }
        }
        this.f20080b = arrayList;
    }

    public String getExternalTransactionToken() {
        return this.f20079a.optString("externalTransactionToken");
    }

    public String getOriginalExternalTransactionId() {
        String strOptString = this.f20079a.optString("originalExternalTransactionId");
        if (strOptString.isEmpty()) {
            return null;
        }
        return strOptString;
    }

    public List<Product> getProducts() {
        return this.f20080b;
    }
}
