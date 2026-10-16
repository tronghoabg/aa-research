package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1645k {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21792a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21793b;

    /* renamed from: com.applovin.impl.k$a */
    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");


        /* renamed from: a, reason: collision with root package name */
        private final String f21798a;

        a(String str) {
            this.f21798a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f21798a;
        }
    }

    public C1645k(String str, com.applovin.impl.sdk.k kVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f21793b = str;
        this.f21792a = kVar;
    }

    public JSONObject a() {
        if (c() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f21793b.substring(d().length()), 0), "UTF-8"));
                this.f21792a.O();
                if (!com.applovin.impl.sdk.o.a()) {
                    return jSONObject;
                }
                this.f21792a.O().a("AdToken", "Decoded token into ad response: " + jSONObject);
                return jSONObject;
            } catch (JSONException e7) {
                this.f21792a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21792a.O().a("AdToken", "Unable to decode token '" + this.f21793b + "' into JSON", e7);
                }
                this.f21792a.D().a("AdToken", "decodeFullAdResponseStr", e7);
                return null;
            }
        } catch (UnsupportedEncodingException e10) {
            this.f21792a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21792a.O().a("AdToken", wg.b.c(new StringBuilder("Unable to process ad response from token '"), this.f21793b, "'"), e10);
            }
            this.f21792a.D().a("AdToken", "decodeFullAdResponse", e10);
            return null;
        }
    }

    public String b() {
        return this.f21793b;
    }

    public a c() {
        return a(y4.f23566C0) != null ? a.REGULAR : a(y4.f23573D0) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    public String d() {
        String strA = a(y4.f23566C0);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strA2 = a(y4.f23573D0);
        if (TextUtils.isEmpty(strA2)) {
            return null;
        }
        return strA2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1645k)) {
            return false;
        }
        String str = this.f21793b;
        String str2 = ((C1645k) obj).f21793b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f21793b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("AdToken{id=", StringUtils.prefixToIndex(32, this.f21793b), ", type=");
        sbW.append(c());
        sbW.append('}');
        return sbW.toString();
    }

    private String a(y4 y4Var) {
        for (String str : this.f21792a.c(y4Var)) {
            if (this.f21793b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }
}
