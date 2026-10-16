package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23148b;

    public /* synthetic */ d(Object obj, int i5) {
        this.f23147a = i5;
        this.f23148b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23147a) {
            case 0:
                ((AppLovinVastMediaView.e) this.f23148b).a();
                break;
            case 1:
                ((AppLovinVastMediaView.f) this.f23148b).a();
                break;
            default:
                ((AppLovinNativeAdImpl) this.f23148b).lambda$unregisterViewsForInteraction$0();
                break;
        }
    }
}
