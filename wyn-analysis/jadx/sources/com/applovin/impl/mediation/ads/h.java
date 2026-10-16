package com.applovin.impl.mediation.ads;

import com.applovin.impl.c3;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22097b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22098c;

    public /* synthetic */ h(int i5, Object obj, Object obj2) {
        this.f22096a = i5;
        this.f22097b = obj;
        this.f22098c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22096a) {
            case 0:
                ((MaxNativeAdLoaderImpl.c) this.f22097b).a((MaxAd) this.f22098c);
                break;
            case 1:
                ((MaxFullscreenAdImpl) this.f22097b).a((Long) this.f22098c);
                break;
            case 2:
                ((MaxFullscreenAdImpl.b) this.f22097b).a((MaxAd) this.f22098c);
                break;
            default:
                ((MaxFullscreenAdImpl.b) this.f22097b).a((c3) this.f22098c);
                break;
        }
    }
}
