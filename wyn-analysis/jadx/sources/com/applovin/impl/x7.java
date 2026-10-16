package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class x7 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private a f23526a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f23527b;

    /* renamed from: c, reason: collision with root package name */
    private String f23528c;

    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private x7() {
    }

    public static x7 a(q8 q8Var, x7 x7Var, com.applovin.impl.sdk.k kVar) {
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (x7Var == null) {
            try {
                x7Var = new x7();
            } catch (Throwable th) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastNonVideoResource", "Error occurred while initializing", th);
                }
                kVar.D().a("VastNonVideoResource", th);
                return null;
            }
        }
        if (x7Var.f23527b == null && !StringUtils.isValidString(x7Var.f23528c)) {
            String strA = a(q8Var, "StaticResource");
            if (URLUtil.isValidUrl(strA)) {
                x7Var.f23527b = Uri.parse(strA);
                x7Var.f23526a = a.STATIC;
                return x7Var;
            }
            String strA2 = a(q8Var, "IFrameResource");
            if (StringUtils.isValidString(strA2)) {
                x7Var.f23526a = a.IFRAME;
                if (URLUtil.isValidUrl(strA2)) {
                    x7Var.f23527b = Uri.parse(strA2);
                    return x7Var;
                }
                x7Var.f23528c = strA2;
                return x7Var;
            }
            String strA3 = a(q8Var, "HTMLResource");
            if (StringUtils.isValidString(strA3)) {
                x7Var.f23526a = a.HTML;
                if (URLUtil.isValidUrl(strA3)) {
                    x7Var.f23527b = Uri.parse(strA3);
                    return x7Var;
                }
                x7Var.f23528c = strA3;
            }
        }
        return x7Var;
    }

    public String b() {
        return this.f23528c;
    }

    public Uri c() {
        return this.f23527b;
    }

    public a d() {
        return this.f23526a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7)) {
            return false;
        }
        x7 x7Var = (x7) obj;
        if (this.f23526a != x7Var.f23526a) {
            return false;
        }
        Uri uri = this.f23527b;
        if (uri == null ? x7Var.f23527b != null : !uri.equals(x7Var.f23527b)) {
            return false;
        }
        String str = this.f23528c;
        String str2 = x7Var.f23528c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        a aVar = this.f23526a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.f23527b;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f23528c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastNonVideoResource{type=");
        sb2.append(this.f23526a);
        sb2.append(", resourceUri=");
        sb2.append(this.f23527b);
        sb2.append(", resourceContents='");
        return wg.b.c(sb2, this.f23528c, "'}");
    }

    private static String a(q8 q8Var, String str) {
        q8 q8VarC = q8Var.c(str);
        if (q8VarC != null) {
            return q8VarC.d();
        }
        return null;
    }

    public void a(Uri uri) {
        this.f23527b = uri;
    }

    public void a(String str) {
        this.f23528c = str;
    }

    public static x7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "type", null);
        a aVarValueOf = string == null ? null : a.valueOf(string);
        String string2 = JsonUtils.getString(jSONObject, "resource_uri", null);
        Uri uri = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        x7 x7Var = new x7();
        x7Var.f23526a = aVarValueOf;
        x7Var.f23527b = uri;
        x7Var.f23528c = JsonUtils.getString(jSONObject, "resource_contents", null);
        return x7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        a aVar = this.f23526a;
        JsonUtils.putString(jSONObject, "type", aVar == null ? null : aVar.toString());
        Uri uri = this.f23527b;
        JsonUtils.putString(jSONObject, "resource_uri", uri != null ? uri.toString() : null);
        JsonUtils.putString(jSONObject, "resource_contents", this.f23528c);
        return jSONObject;
    }
}
