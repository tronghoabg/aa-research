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

/* renamed from: com.applovin.impl.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1653o {

    /* renamed from: a, reason: collision with root package name */
    private final String f22345a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22346b;

    /* renamed from: c, reason: collision with root package name */
    private final l8 f22347c;

    /* renamed from: d, reason: collision with root package name */
    private final List f22348d;

    /* renamed from: e, reason: collision with root package name */
    private final List f22349e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f22350f = false;

    public C1653o(JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        this.f22345a = JsonUtils.getString(jSONObject, MediationMetaData.KEY_NAME, "");
        this.f22346b = JsonUtils.getString(jSONObject, "experiment", null);
        this.f22347c = a(jSONObject);
        this.f22348d = a("bidders", jSONObject, map, maxAdFormat, kVar);
        this.f22349e = a("waterfall", jSONObject, map, maxAdFormat, kVar);
    }

    public List a() {
        return this.f22348d;
    }

    public String b() {
        return this.f22346b;
    }

    public String c() {
        return this.f22345a;
    }

    public l8 d() {
        return this.f22347c;
    }

    public List e() {
        return this.f22349e;
    }

    public boolean f() {
        return this.f22350f;
    }

    private l8 a(JSONObject jSONObject) {
        return new l8(JsonUtils.getJSONObject(jSONObject, "targeting"));
    }

    private List a(String str, JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        e3 e3Var;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayM = AbstractC1593a.m(str, jSONObject);
        for (int i5 = 0; i5 < jSONArrayM.length(); i5++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayM, i5, (JSONObject) null);
            if (jSONObject2 != null && (e3Var = (e3) map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (e3Var.D()) {
                    this.f22350f = true;
                }
                arrayList.add(new j8(jSONObject2, maxAdFormat, e3Var, kVar));
            }
        }
        return arrayList;
    }
}
