package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;

/* loaded from: classes.dex */
public final /* synthetic */ class O0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdDisplayListener f20821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f20822c;

    public /* synthetic */ O0(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd, int i5) {
        this.f20820a = i5;
        this.f20821b = appLovinAdDisplayListener;
        this.f20822c = appLovinAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20820a) {
            case 0:
                t2.c(this.f20821b, this.f20822c);
                break;
            default:
                t2.d(this.f20821b, this.f20822c);
                break;
        }
    }
}
