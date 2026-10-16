package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;

/* loaded from: classes.dex */
public final /* synthetic */ class Q0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f20830b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaxNativeAdListener f20831c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaxAd f20832d;

    public /* synthetic */ Q0(boolean z2, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, int i5) {
        this.f20829a = i5;
        this.f20830b = z2;
        this.f20831c = maxNativeAdListener;
        this.f20832d = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20829a) {
            case 0:
                t2.a(this.f20830b, this.f20831c, this.f20832d);
                break;
            default:
                t2.b(this.f20830b, this.f20831c, this.f20832d);
                break;
        }
    }
}
