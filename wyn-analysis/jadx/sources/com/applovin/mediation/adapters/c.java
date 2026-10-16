package com.applovin.mediation.adapters;

import android.app.Activity;
import android.os.Handler;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.NativeAd;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import tf.p;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24060c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24063f;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i5) {
        this.f24058a = i5;
        this.f24059b = obj;
        this.f24060c = obj2;
        this.f24061d = obj3;
        this.f24062e = obj4;
        this.f24063f = obj5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24058a) {
            case 0:
                MolocoMediationAdapter molocoMediationAdapter = (MolocoMediationAdapter) this.f24059b;
                MaxAdFormat maxAdFormat = (MaxAdFormat) this.f24060c;
                MaxAdapterResponseParameters maxAdapterResponseParameters = (MaxAdapterResponseParameters) this.f24062e;
                Activity activity = (Activity) this.f24063f;
                return molocoMediationAdapter.lambda$loadAdViewAd$4(maxAdFormat, (MaxAdViewAdapterListener) this.f24061d, maxAdapterResponseParameters, activity, (NativeAd) obj, (MolocoAdError.AdCreateError) obj2);
            default:
                InterstitialAd interstitialAd = (InterstitialAd) obj;
                MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) obj2;
                C2515C c2515c = C2515C.f34653a;
                Handler handler = (Handler) this.f24059b;
                String str = (String) this.f24061d;
                MolocoUnityLoadCallback molocoUnityLoadCallback = (MolocoUnityLoadCallback) this.f24063f;
                if (adCreateError != null) {
                    handler.post(new com.applovin.impl.mediation.ads.f(molocoUnityLoadCallback, str, adCreateError, 9));
                } else {
                    AbstractC3340k.c(interstitialAd, "null cannot be cast to non-null type com.moloco.sdk.publisher.InterstitialAd");
                    com.moloco.sdk.internal.unity_bridge.internal.e eVar = (com.moloco.sdk.internal.unity_bridge.internal.e) this.f24060c;
                    InterstitialAd interstitialAd2 = (InterstitialAd) eVar.f29769a.f9453a.get(str);
                    if (interstitialAd2 == null) {
                        interstitialAd.load((String) this.f24062e, new com.moloco.sdk.internal.unity_bridge.internal.b(eVar, str, interstitialAd, handler, molocoUnityLoadCallback));
                    } else if (interstitialAd2.isLoaded()) {
                        handler.post(new com.moloco.sdk.internal.unity_bridge.internal.a(molocoUnityLoadCallback, str, 0));
                    } else {
                        interstitialAd2.destroy();
                        interstitialAd.load((String) this.f24062e, new com.moloco.sdk.internal.unity_bridge.internal.b(eVar, str, interstitialAd, handler, molocoUnityLoadCallback));
                    }
                }
                return c2515c;
        }
    }
}
