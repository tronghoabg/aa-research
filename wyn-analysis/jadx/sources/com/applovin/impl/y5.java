package com.applovin.impl;

import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class y5 extends a6 {

    /* renamed from: j, reason: collision with root package name */
    private final C1645k f23957j;

    public y5(C1645k c1645k, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super(C1666u.a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, kVar);
        this.f23957j = c1645k;
    }

    @Override // com.applovin.impl.s5
    public Map h() {
        HashMap map = new HashMap(2);
        map.put("adtoken", this.f23957j.b());
        map.put("adtoken_prefix", this.f23957j.d());
        return map;
    }
}
