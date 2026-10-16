package com.applovin.impl;

import com.applovin.impl.e6;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k6 extends j5 {

    /* renamed from: g, reason: collision with root package name */
    private final JSONObject f21816g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f21817h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f21818i;

    public k6(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderAppLovinAd", kVar);
        this.f21816g = jSONObject;
        this.f21817h = jSONObject2;
        this.f21818i = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.f21816g, this.f21817h, this.f21766a);
        boolean zBooleanValue = JsonUtils.getBoolean(this.f21816g, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean zBooleanValue2 = JsonUtils.getBoolean(this.f21816g, "vs_load_immediately", Boolean.TRUE).booleanValue();
        n5 n5Var = new n5(aVar, this.f21766a, this.f21818i);
        n5Var.c(zBooleanValue2);
        n5Var.b(zBooleanValue);
        this.f21766a.r0().a((j5) n5Var, e6.b.CACHING);
    }
}
