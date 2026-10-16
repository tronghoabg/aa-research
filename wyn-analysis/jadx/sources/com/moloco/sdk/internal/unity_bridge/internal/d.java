package com.moloco.sdk.internal.unity_bridge.internal;

import android.os.Handler;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class d implements InterstitialAdShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f29767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MolocoUnityShowCallback f29768b;

    public d(Handler handler, MolocoUnityShowCallback molocoUnityShowCallback) {
        this.f29767a = handler;
        this.f29768b = molocoUnityShowCallback;
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdClicked(MolocoAd molocoAd) {
        AbstractC3340k.e(molocoAd, "molocoAd");
        this.f29767a.post(new c(this.f29768b, molocoAd, 1));
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdHidden(MolocoAd molocoAd) {
        AbstractC3340k.e(molocoAd, "molocoAd");
        this.f29767a.post(new c(this.f29768b, molocoAd, 0));
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowFailed(MolocoAdError molocoAdError) {
        AbstractC3340k.e(molocoAdError, "molocoAdError");
        this.f29767a.post(new com.applovin.impl.sdk.nativeAd.e(4, this.f29768b, molocoAdError));
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public final void onAdShowSuccess(MolocoAd molocoAd) {
        AbstractC3340k.e(molocoAd, "molocoAd");
        this.f29767a.post(new c(this.f29768b, molocoAd, 2));
    }
}
