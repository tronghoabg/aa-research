package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;

/* loaded from: classes.dex */
public final /* synthetic */ class L0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f20800b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaxAdViewAdListener f20801c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaxAd f20802d;

    public /* synthetic */ L0(boolean z2, MaxAdViewAdListener maxAdViewAdListener, MaxAd maxAd, int i5) {
        this.f20799a = i5;
        this.f20800b = z2;
        this.f20801c = maxAdViewAdListener;
        this.f20802d = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20799a) {
            case 0:
                t2.b(this.f20800b, this.f20801c, this.f20802d);
                break;
            default:
                t2.d(this.f20800b, this.f20801c, this.f20802d);
                break;
        }
    }
}
