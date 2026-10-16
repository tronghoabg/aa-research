package com.applovin.impl;

import cb.AbstractC1593a;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h6 extends j5 {

    /* renamed from: g, reason: collision with root package name */
    private final JSONObject f21656g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f21657h;

    public h6(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessNativeAdResponse", kVar);
        this.f21656g = jSONObject;
        this.f21657h = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArrayM = AbstractC1593a.m("ads", this.f21656g);
        if (jSONArrayM.length() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Processing ad...");
            }
            this.f21766a.r0().a(new com.applovin.impl.sdk.nativeAd.b(JsonUtils.getJSONObject(jSONArrayM, 0, new JSONObject()), this.f21656g, this.f21657h, this.f21766a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.k(this.f21767b, "No ads were returned from the server");
        }
        o7.a("native_native", MaxAdFormat.NATIVE, this.f21656g, this.f21766a);
        this.f21657h.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}
