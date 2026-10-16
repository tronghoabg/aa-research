package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class R0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdRewardListener f20834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f20835c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f20836d;

    public /* synthetic */ R0(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map, int i5) {
        this.f20833a = i5;
        this.f20834b = appLovinAdRewardListener;
        this.f20835c = appLovinAd;
        this.f20836d = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20833a) {
            case 0:
                t2.d(this.f20834b, this.f20835c, this.f20836d);
                break;
            case 1:
                t2.e(this.f20834b, this.f20835c, this.f20836d);
                break;
            default:
                t2.f(this.f20834b, this.f20835c, this.f20836d);
                break;
        }
    }
}
