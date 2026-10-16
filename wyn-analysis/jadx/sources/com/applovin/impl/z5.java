package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class z5 extends s5 {

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f24011i;

    public z5(C1666u c1666u, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        this(c1666u, appLovinAdLoadListener, "TaskFetchNextAd", kVar);
    }

    @Override // com.applovin.impl.s5
    public j5 a(JSONObject jSONObject) {
        return new f6(jSONObject, this.f22779g, this.f24011i, this.f21766a);
    }

    @Override // com.applovin.impl.s5
    public String e() {
        return AbstractC1659r0.a(this.f21766a);
    }

    @Override // com.applovin.impl.s5
    public String f() {
        return AbstractC1659r0.b(this.f21766a);
    }

    public z5(C1666u c1666u, AppLovinAdLoadListener appLovinAdLoadListener, String str, com.applovin.impl.sdk.k kVar) {
        super(c1666u, str, kVar);
        this.f24011i = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.s5
    public void a(int i5, String str) {
        super.a(i5, str);
        AppLovinAdLoadListener appLovinAdLoadListener = this.f24011i;
        if (!(appLovinAdLoadListener instanceof m2)) {
            appLovinAdLoadListener.failedToReceiveAd(i5);
        } else {
            ((m2) this.f24011i).failedToReceiveAdV2(new AppLovinError(i5, str));
        }
    }
}
