package com.applovin.impl;

import Va.M6;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class z7 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private String f24039a;

    /* renamed from: b, reason: collision with root package name */
    private String f24040b;

    /* renamed from: c, reason: collision with root package name */
    private String f24041c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24042d;

    /* renamed from: e, reason: collision with root package name */
    private long f24043e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f24044f = -1;

    private z7() {
    }

    public static z7 a(q8 q8Var, t7 t7Var, com.applovin.impl.sdk.k kVar) {
        List<String> listExplode;
        int size;
        long seconds;
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strD = q8Var.d();
            if (TextUtils.isEmpty(strD)) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().b("VastTracker", "Unable to create tracker. Could not find URL.");
                }
                return null;
            }
            z7 z7Var = new z7();
            z7Var.f24041c = strD;
            z7Var.f24039a = (String) q8Var.a().get("id");
            z7Var.f24040b = (String) q8Var.a().get("event");
            z7Var.f24042d = ((Boolean) kVar.a(y4.k5)).booleanValue();
            if (t7Var != null) {
                z7Var.f24042d = JsonUtils.getBoolean(t7Var.b(), "vast_fire_trackers_from_webview", Boolean.valueOf(z7Var.f24042d)).booleanValue();
            }
            z7Var.f24044f = a(z7Var.b(), t7Var);
            String str = (String) q8Var.a().get(MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
            if (StringUtils.isValidString(str)) {
                String strTrim = str.trim();
                if (strTrim.contains("%")) {
                    z7Var.f24044f = StringUtils.parseInt(strTrim.substring(0, strTrim.length() - 1));
                    return z7Var;
                }
                if (strTrim.contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER) && (size = (listExplode = CollectionUtils.explode(strTrim, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)).size()) > 0) {
                    int i5 = size - 1;
                    long j8 = 0;
                    for (int i10 = i5; i10 >= 0; i10--) {
                        String str2 = listExplode.get(i10);
                        if (StringUtils.isNumeric(str2)) {
                            int i11 = Integer.parseInt(str2);
                            if (i10 == i5) {
                                seconds = i11;
                            } else if (i10 == size - 2) {
                                seconds = TimeUnit.MINUTES.toSeconds(i11);
                            } else if (i10 == size - 3) {
                                seconds = TimeUnit.HOURS.toSeconds(i11);
                            }
                            j8 += seconds;
                        }
                    }
                    z7Var.f24043e = j8;
                    z7Var.f24044f = -1;
                }
            }
            return z7Var;
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastTracker", "Error occurred while initializing", th);
            }
            kVar.D().a("VastTracker", th);
            return null;
        }
    }

    public String b() {
        return this.f24040b;
    }

    public String c() {
        return this.f24041c;
    }

    public boolean d() {
        return this.f24042d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7)) {
            return false;
        }
        z7 z7Var = (z7) obj;
        if (this.f24043e != z7Var.f24043e || this.f24044f != z7Var.f24044f) {
            return false;
        }
        String str = this.f24039a;
        if (str == null ? z7Var.f24039a != null : !str.equals(z7Var.f24039a)) {
            return false;
        }
        String str2 = this.f24040b;
        if (str2 == null ? z7Var.f24040b == null : str2.equals(z7Var.f24040b)) {
            return this.f24041c.equals(z7Var.f24041c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f24039a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f24040b;
        int iC = N0.a.c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f24041c);
        long j8 = this.f24043e;
        return ((iC + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f24044f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastTracker{identifier='");
        sb2.append(this.f24039a);
        sb2.append("', event='");
        sb2.append(this.f24040b);
        sb2.append("', uriString='");
        sb2.append(this.f24041c);
        sb2.append("', offsetSeconds=");
        sb2.append(this.f24043e);
        sb2.append(", offsetPercent=");
        return M6.r(sb2, this.f24044f, '}');
    }

    public boolean a(long j8, int i5) {
        long j10 = this.f24043e;
        boolean z2 = j10 >= 0;
        boolean z10 = j8 >= j10;
        int i10 = this.f24044f;
        return (z2 && z10) || ((i10 >= 0) && (i5 >= i10));
    }

    private static int a(String str, t7 t7Var) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if (!"complete".equalsIgnoreCase(str)) {
            return -1;
        }
        if (t7Var != null) {
            return t7Var.g();
        }
        return 95;
    }

    public static z7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        z7 z7Var = new z7();
        String string = JsonUtils.getString(jSONObject, "uri_string", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        z7Var.f24041c = string;
        z7Var.f24039a = JsonUtils.getString(jSONObject, "identifier", "");
        z7Var.f24040b = JsonUtils.getString(jSONObject, "event", "");
        z7Var.f24043e = JsonUtils.getLong(jSONObject, "offset_seconds", -1L);
        z7Var.f24044f = JsonUtils.getInt(jSONObject, "offset_percent", -1);
        return z7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "identifier", this.f24039a);
        JsonUtils.putString(jSONObject, "event", this.f24040b);
        JsonUtils.putString(jSONObject, "uri_string", this.f24041c);
        JsonUtils.putLong(jSONObject, "offset_seconds", this.f24043e);
        JsonUtils.putInt(jSONObject, "offset_percent", this.f24044f);
        return jSONObject;
    }
}
