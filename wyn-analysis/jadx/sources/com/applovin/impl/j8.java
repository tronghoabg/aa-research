package com.applovin.impl;

import cb.AbstractC1593a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j8 {

    /* renamed from: a, reason: collision with root package name */
    private final u2 f21789a;

    /* renamed from: b, reason: collision with root package name */
    private final a4 f21790b;

    /* renamed from: c, reason: collision with root package name */
    private final List f21791c;

    public j8(JSONObject jSONObject, MaxAdFormat maxAdFormat, e3 e3Var, com.applovin.impl.sdk.k kVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f21790b = new a4(jSONObject2, kVar);
        } else {
            this.f21790b = null;
        }
        this.f21789a = new u2(JsonUtils.getString(jSONObject, MediationMetaData.KEY_NAME, ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, e3Var);
        JSONArray jSONArrayM = AbstractC1593a.m("placements", jSONObject);
        this.f21791c = new ArrayList(jSONArrayM.length());
        for (int i5 = 0; i5 < jSONArrayM.length(); i5++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArrayM, i5, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f21791c.add(new a4(jSONObject3, kVar));
            }
        }
    }

    public a4 a() {
        return this.f21790b;
    }

    public u2 b() {
        return this.f21789a;
    }

    public List c() {
        return this.f21791c;
    }

    public boolean d() {
        return this.f21790b != null;
    }
}
