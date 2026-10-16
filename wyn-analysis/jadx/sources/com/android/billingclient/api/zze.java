package com.android.billingclient.api;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import j$.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zze {

    /* renamed from: a, reason: collision with root package name */
    public final String f20159a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20160b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20161c;

    public /* synthetic */ zze(JSONObject jSONObject) {
        this.f20159a = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.f20160b = jSONObject.optString("productType");
        String strOptString = jSONObject.optString("offerToken");
        this.f20161c = true == strOptString.isEmpty() ? null : strOptString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zze)) {
            return false;
        }
        zze zzeVar = (zze) obj;
        return this.f20159a.equals(zzeVar.f20159a) && this.f20160b.equals(zzeVar.f20160b) && Objects.equals(this.f20161c, zzeVar.f20161c);
    }

    public final int hashCode() {
        return Objects.hash(this.f20159a, this.f20160b, this.f20161c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{id: ");
        sb2.append(this.f20159a);
        sb2.append(", type: ");
        sb2.append(this.f20160b);
        sb2.append(", offer token: ");
        return wg.b.c(sb2, this.f20161c, "}");
    }
}
