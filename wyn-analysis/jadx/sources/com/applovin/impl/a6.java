package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a6 extends s5 {

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f20975i;

    public a6(C1666u c1666u, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super(c1666u, str, kVar);
        this.f20975i = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.s5
    public j5 a(JSONObject jSONObject) {
        return new h6(jSONObject, this.f20975i, this.f21766a);
    }

    @Override // com.applovin.impl.s5
    public String e() {
        return AbstractC1659r0.d(this.f21766a);
    }

    @Override // com.applovin.impl.s5
    public String f() {
        return AbstractC1659r0.e(this.f21766a);
    }

    @Override // com.applovin.impl.s5
    public void a(int i5, String str) {
        super.a(i5, str);
        this.f20975i.onNativeAdLoadFailed(new AppLovinError(i5, str));
    }
}
