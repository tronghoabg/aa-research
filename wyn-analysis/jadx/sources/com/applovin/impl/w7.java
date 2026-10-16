package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class w7 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f23482a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23483b;

    private w7(String str, String str2) {
        this.f23482a = str;
        this.f23483b = str2;
    }

    public static w7 a(q8 q8Var, com.applovin.impl.sdk.k kVar) {
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            return new w7((String) q8Var.a().get("apiFramework"), q8Var.d());
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastJavaScriptResource", "Error occurred while initializing", th);
            }
            kVar.D().a("VastJavaScriptResource", th);
            return null;
        }
    }

    public String b() {
        return this.f23482a;
    }

    public String c() {
        return this.f23483b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            w7 w7Var = (w7) obj;
            String str = this.f23482a;
            if (str == null ? w7Var.f23482a != null : !str.equals(w7Var.f23482a)) {
                return false;
            }
            String str2 = this.f23483b;
            String str3 = w7Var.f23483b;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f23482a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f23483b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastJavaScriptResource{apiFramework='");
        sb2.append(this.f23482a);
        sb2.append("', javascriptResourceUrl='");
        return wg.b.c(sb2, this.f23483b, "'}");
    }

    public static w7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        return new w7(JsonUtils.getString(jSONObject, "api_framework", null), JsonUtils.getString(jSONObject, "javascript_resource_url", null));
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "api_framework", this.f23482a);
        JsonUtils.putString(jSONObject, "javascript_resource_url", this.f23483b);
        return jSONObject;
    }
}
