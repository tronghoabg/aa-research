package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;

/* loaded from: classes.dex */
public final /* synthetic */ class M0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f20806b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f20807c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaxAd f20808d;

    public /* synthetic */ M0(boolean z2, MaxAdListener maxAdListener, MaxAd maxAd, int i5) {
        this.f20805a = i5;
        this.f20806b = z2;
        this.f20807c = maxAdListener;
        this.f20808d = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20805a) {
            case 0:
                t2.a(this.f20806b, this.f20807c, this.f20808d);
                break;
            case 1:
                t2.e(this.f20806b, this.f20807c, this.f20808d);
                break;
            case 2:
                t2.c(this.f20806b, this.f20807c, this.f20808d);
                break;
            default:
                t2.f(this.f20806b, this.f20807c, this.f20808d);
                break;
        }
    }
}
