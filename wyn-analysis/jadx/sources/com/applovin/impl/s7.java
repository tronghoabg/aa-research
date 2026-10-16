package com.applovin.impl;

import android.net.Uri;
import cb.AbstractC1593a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class s7 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private int f22783a;

    /* renamed from: b, reason: collision with root package name */
    private int f22784b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f22785c;

    /* renamed from: d, reason: collision with root package name */
    private x7 f22786d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f22787e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Map f22788f = new HashMap();

    private s7() {
    }

    public static s7 a(q8 q8Var, s7 s7Var, t7 t7Var, com.applovin.impl.sdk.k kVar) {
        q8 q8VarC;
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (s7Var == null) {
            try {
                s7Var = new s7();
            } catch (Throwable th) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastCompanionAd", "Error occurred while initializing", th);
                }
                kVar.D().a("VastCompanionAd", th);
                return null;
            }
        }
        if (s7Var.f22783a == 0 && s7Var.f22784b == 0) {
            int i5 = StringUtils.parseInt((String) q8Var.a().get("width"));
            int i10 = StringUtils.parseInt((String) q8Var.a().get("height"));
            if (i5 > 0 && i10 > 0) {
                s7Var.f22783a = i5;
                s7Var.f22784b = i10;
            }
        }
        s7Var.f22786d = x7.a(q8Var, s7Var.f22786d, kVar);
        if (s7Var.f22785c == null && (q8VarC = q8Var.c("CompanionClickThrough")) != null) {
            String strD = q8VarC.d();
            if (StringUtils.isValidString(strD)) {
                s7Var.f22785c = Uri.parse(strD);
            }
        }
        b8.a(q8Var.a("CompanionClickTracking"), s7Var.f22787e, t7Var, kVar);
        b8.a(q8Var, s7Var.f22788f, t7Var, kVar);
        return s7Var;
    }

    public Set b() {
        return this.f22787e;
    }

    public Uri c() {
        return this.f22785c;
    }

    public Map d() {
        return this.f22788f;
    }

    public x7 e() {
        return this.f22786d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7)) {
            return false;
        }
        s7 s7Var = (s7) obj;
        if (this.f22783a != s7Var.f22783a || this.f22784b != s7Var.f22784b) {
            return false;
        }
        Uri uri = this.f22785c;
        if (uri == null ? s7Var.f22785c != null : !uri.equals(s7Var.f22785c)) {
            return false;
        }
        x7 x7Var = this.f22786d;
        if (x7Var == null ? s7Var.f22786d != null : !x7Var.equals(s7Var.f22786d)) {
            return false;
        }
        Set set = this.f22787e;
        if (set == null ? s7Var.f22787e != null : !set.equals(s7Var.f22787e)) {
            return false;
        }
        Map map = this.f22788f;
        Map map2 = s7Var.f22788f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public int hashCode() {
        int i5 = ((this.f22783a * 31) + this.f22784b) * 31;
        Uri uri = this.f22785c;
        int iHashCode = (i5 + (uri != null ? uri.hashCode() : 0)) * 31;
        x7 x7Var = this.f22786d;
        int iHashCode2 = (iHashCode + (x7Var != null ? x7Var.hashCode() : 0)) * 31;
        Set set = this.f22787e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f22788f;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f22783a + ", height=" + this.f22784b + ", destinationUri=" + this.f22785c + ", nonVideoResource=" + this.f22786d + ", clickTrackers=" + this.f22787e + ", eventTrackers=" + this.f22788f + '}';
    }

    public static s7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        int i5 = JsonUtils.getInt(jSONObject, "width", 0);
        int i10 = JsonUtils.getInt(jSONObject, "height", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        Uri uri = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        x7 x7VarA = x7.a(JsonUtils.getJSONObject(jSONObject, "non_video_resource", (JSONObject) null), kVar);
        JSONArray jSONArrayM = AbstractC1593a.m("click_trackers", jSONObject);
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < jSONArrayM.length(); i11++) {
            z7 z7VarA = z7.a(JsonUtils.getJSONObject(jSONArrayM, i11, (JSONObject) null), kVar);
            if (z7VarA != null) {
                hashSet.add(z7VarA);
            }
        }
        s7 s7Var = new s7();
        s7Var.f22783a = i5;
        s7Var.f22784b = i10;
        s7Var.f22785c = uri;
        s7Var.f22786d = x7VarA;
        s7Var.f22787e.addAll(hashSet);
        return s7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "width", this.f22783a);
        JsonUtils.putInt(jSONObject, "height", this.f22784b);
        Uri uri = this.f22785c;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        x7 x7Var = this.f22786d;
        JsonUtils.putJSONObject(jSONObject, "non_video_resource", x7Var != null ? x7Var.a() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f22787e.iterator();
        while (it.hasNext()) {
            jSONArray.put(((z7) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        return jSONObject;
    }
}
