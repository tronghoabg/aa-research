package com.bytedance.sdk.openadsdk.core.dz;

import android.text.TextUtils;
import j$.util.Objects;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zjm {
    private final String moa;

    /* renamed from: oa, reason: collision with root package name */
    private final URL f25611oa;
    private final String uef;
    private final String yo;

    private zjm(String str, String str2, String str3, String str4) throws MalformedURLException {
        this.uef = str2;
        this.f25611oa = new URL(str);
        this.yo = str3;
        this.moa = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjm)) {
            return false;
        }
        zjm zjmVar = (zjm) obj;
        if (uef(this.uef, zjmVar.uef) && uef(this.f25611oa, zjmVar.f25611oa) && uef(this.yo, zjmVar.yo)) {
            return uef(this.moa, zjmVar.moa);
        }
        return false;
    }

    public int hashCode() {
        String str = this.uef;
        int iHashCode = (this.f25611oa.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.yo;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.moa;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String oa() {
        return this.yo;
    }

    public String uef() {
        return this.uef;
    }

    public URL yo() {
        return this.f25611oa;
    }

    private boolean uef(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static zjm uef(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new zjm(str, str2, str3, str4);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static zjm uef(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("apiFramework");
            String strOptString2 = jSONObject.optString("javascriptResourceUrl");
            if ("omid".equalsIgnoreCase(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                return new zjm(strOptString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static HashSet<zjm> uef(JSONArray jSONArray) {
        HashSet<zjm> hashSet = new HashSet<>();
        if (jSONArray != null) {
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                try {
                    hashSet.add(uef(jSONArray.getJSONObject(i5)));
                } catch (Throwable unused) {
                }
            }
        }
        return hashSet;
    }
}
