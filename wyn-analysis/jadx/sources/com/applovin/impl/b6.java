package com.applovin.impl;

import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b6 extends z5 {

    /* renamed from: j, reason: collision with root package name */
    private final C1645k f21156j;

    public b6(C1645k c1645k, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super(C1666u.a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", kVar);
        this.f21156j = c1645k;
    }

    @Override // com.applovin.impl.s5
    public Map h() {
        HashMap map = new HashMap(2);
        map.put("adtoken", this.f21156j.b());
        map.put("adtoken_prefix", this.f21156j.d());
        return map;
    }
}
