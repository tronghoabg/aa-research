package com.applovin.impl;

import A.AbstractC0213f;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d8 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private Uri f21377a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f21378b;

    /* renamed from: c, reason: collision with root package name */
    private a f21379c;

    /* renamed from: d, reason: collision with root package name */
    private String f21380d;

    /* renamed from: e, reason: collision with root package name */
    private int f21381e;

    /* renamed from: f, reason: collision with root package name */
    private int f21382f;

    /* renamed from: g, reason: collision with root package name */
    private long f21383g;

    public enum a {
        Progressive,
        Streaming
    }

    private d8() {
    }

    public static d8 a(q8 q8Var, com.applovin.impl.sdk.k kVar) {
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strD = q8Var.d();
            if (!URLUtil.isValidUrl(strD)) {
                kVar.O();
                if (!com.applovin.impl.sdk.o.a()) {
                    return null;
                }
                kVar.O().b("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            }
            Uri uri = Uri.parse(strD);
            d8 d8Var = new d8();
            d8Var.f21377a = uri;
            d8Var.f21378b = uri;
            d8Var.f21383g = a(q8Var);
            d8Var.f21379c = a((String) q8Var.a().get("delivery"));
            d8Var.f21382f = StringUtils.parseInt((String) q8Var.a().get("height"));
            d8Var.f21381e = StringUtils.parseInt((String) q8Var.a().get("width"));
            d8Var.f21380d = ((String) q8Var.a().get("type")).toLowerCase(Locale.ENGLISH);
            return d8Var;
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastVideoFile", "Error occurred while initializing", th);
            }
            kVar.D().a("VastVideoFile", th);
            return null;
        }
    }

    public long b() {
        return this.f21383g;
    }

    public String c() {
        return this.f21380d;
    }

    public Uri d() {
        return this.f21377a;
    }

    public Uri e() {
        return this.f21378b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8)) {
            return false;
        }
        d8 d8Var = (d8) obj;
        if (this.f21381e != d8Var.f21381e || this.f21382f != d8Var.f21382f || this.f21383g != d8Var.f21383g) {
            return false;
        }
        Uri uri = this.f21377a;
        if (uri == null ? d8Var.f21377a != null : !uri.equals(d8Var.f21377a)) {
            return false;
        }
        Uri uri2 = this.f21378b;
        if (uri2 == null ? d8Var.f21378b != null : !uri2.equals(d8Var.f21378b)) {
            return false;
        }
        if (this.f21379c != d8Var.f21379c) {
            return false;
        }
        String str = this.f21380d;
        String str2 = d8Var.f21380d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        Uri uri = this.f21377a;
        int iHashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f21378b;
        int iHashCode2 = (iHashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.f21379c;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f21380d;
        return Long.valueOf(this.f21383g).hashCode() + ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f21381e) * 31) + this.f21382f) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastVideoFile{sourceVideoUri=");
        sb2.append(this.f21377a);
        sb2.append(", videoUri=");
        sb2.append(this.f21378b);
        sb2.append(", deliveryType=");
        sb2.append(this.f21379c);
        sb2.append(", fileType='");
        sb2.append(this.f21380d);
        sb2.append("', width=");
        sb2.append(this.f21381e);
        sb2.append(", height=");
        sb2.append(this.f21382f);
        sb2.append(", bitrate=");
        return AbstractC0213f.e(sb2, this.f21383g, '}');
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    private static long a(q8 q8Var) {
        Map mapA = q8Var.a();
        long j8 = StringUtils.parseLong((String) mapA.get("bitrate"), 0L);
        if (j8 != 0) {
            return j8;
        }
        return (StringUtils.parseLong((String) mapA.get("maxBitrate"), 0L) + StringUtils.parseLong((String) mapA.get("minBitrate"), 0L)) / 2;
    }

    public void a(Uri uri) {
        this.f21378b = uri;
    }

    public static d8 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "source_video_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Uri uri = Uri.parse(string);
        if (TextUtils.isEmpty(JsonUtils.getString(jSONObject, "video_uri", null))) {
            return null;
        }
        Uri uri2 = Uri.parse(string);
        String string2 = JsonUtils.getString(jSONObject, "file_type", null);
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        a aVarValueOf = a.valueOf(JsonUtils.getString(jSONObject, "delivery_type", a.Progressive.toString()));
        int i5 = JsonUtils.getInt(jSONObject, "width", 0);
        int i10 = JsonUtils.getInt(jSONObject, "height", 0);
        int i11 = JsonUtils.getInt(jSONObject, "bitrate", 0);
        d8 d8Var = new d8();
        d8Var.f21377a = uri;
        d8Var.f21378b = uri2;
        d8Var.f21379c = aVarValueOf;
        d8Var.f21380d = string2;
        d8Var.f21381e = i5;
        d8Var.f21382f = i10;
        d8Var.f21383g = i11;
        return d8Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        Uri uri = this.f21377a;
        if (uri != null) {
            JsonUtils.putString(jSONObject, "source_video_uri", uri.toString());
        }
        Uri uri2 = this.f21378b;
        if (uri2 != null) {
            JsonUtils.putString(jSONObject, "video_uri", uri2.toString());
        }
        a aVar = this.f21379c;
        JsonUtils.putString(jSONObject, "delivery_type", aVar == null ? null : aVar.toString());
        JsonUtils.putString(jSONObject, "file_type", this.f21380d);
        JsonUtils.putInt(jSONObject, "width", this.f21381e);
        JsonUtils.putInt(jSONObject, "height", this.f21382f);
        JsonUtils.putLong(jSONObject, "bitrate", this.f21383g);
        return jSONObject;
    }
}
