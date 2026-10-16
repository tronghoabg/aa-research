package com.applovin.impl;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;

/* loaded from: classes.dex */
public final /* synthetic */ class P0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdViewEventListener f20825b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f20826c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdView f20827d;

    public /* synthetic */ P0(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, int i5) {
        this.f20824a = i5;
        this.f20825b = appLovinAdViewEventListener;
        this.f20826c = appLovinAd;
        this.f20827d = appLovinAdView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20824a) {
            case 0:
                t2.d(this.f20825b, this.f20826c, this.f20827d);
                break;
            case 1:
                t2.f(this.f20825b, this.f20826c, this.f20827d);
                break;
            default:
                t2.e(this.f20825b, this.f20826c, this.f20827d);
                break;
        }
    }
}
