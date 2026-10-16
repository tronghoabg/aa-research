package com.applovin.impl;

import cb.AbstractC1593a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1651n implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final String f22305a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22306b;

    /* renamed from: c, reason: collision with root package name */
    private final MaxAdFormat f22307c;

    /* renamed from: d, reason: collision with root package name */
    private final C1653o f22308d;

    /* renamed from: e, reason: collision with root package name */
    private final List f22309e;

    public C1651n(JSONObject jSONObject, Map map, com.applovin.impl.sdk.k kVar) {
        this.f22305a = JsonUtils.getString(jSONObject, MediationMetaData.KEY_NAME, "");
        this.f22306b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f22307c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArrayM = AbstractC1593a.m("waterfalls", jSONObject);
        this.f22309e = new ArrayList(jSONArrayM.length());
        for (int i5 = 0; i5 < jSONArrayM.length(); i5++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayM, i5, (JSONObject) null);
            if (jSONObject2 != null) {
                this.f22309e.add(new C1653o(jSONObject2, map, this.f22307c, kVar));
            }
        }
        this.f22308d = this.f22309e.isEmpty() ? null : (C1653o) this.f22309e.get(0);
    }

    public MaxAdFormat a() {
        return this.f22307c;
    }

    public String b() {
        MaxAdFormat maxAdFormat = this.f22307c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    public String c() {
        return this.f22305a;
    }

    public String d() {
        return this.f22306b;
    }

    public String e() {
        return "\n---------- " + this.f22306b + " ----------\nIdentifier - " + this.f22305a + "\nFormat     - " + b();
    }

    public C1653o f() {
        return this.f22308d;
    }

    public List g() {
        return this.f22309e;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1651n c1651n) {
        return this.f22306b.compareToIgnoreCase(c1651n.f22306b);
    }
}
