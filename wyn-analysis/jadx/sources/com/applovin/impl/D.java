package com.applovin.impl;

import com.applovin.impl.C1628b1;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinPostbackListener;

/* loaded from: classes.dex */
public final /* synthetic */ class D implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20759c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20760d;

    public /* synthetic */ D(Object obj, Object obj2, int i5, int i10) {
        this.f20757a = i10;
        this.f20759c = obj;
        this.f20760d = obj2;
        this.f20758b = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20757a) {
            case 0:
                ((C1628b1) this.f20759c).b((C1628b1.c) this.f20760d, this.f20758b);
                break;
            case 1:
                t2.b((AppLovinAdRewardListener) this.f20759c, (AppLovinAd) this.f20760d, this.f20758b);
                break;
            default:
                t2.b((AppLovinPostbackListener) this.f20759c, (String) this.f20760d, this.f20758b);
                break;
        }
    }
}
