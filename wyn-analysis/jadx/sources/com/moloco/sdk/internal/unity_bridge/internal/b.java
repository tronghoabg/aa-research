package com.moloco.sdk.internal.unity_bridge.internal;

import android.os.Handler;
import com.applovin.impl.mediation.ads.f;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class b implements AdLoad.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f29759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterstitialAd f29761c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Handler f29762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MolocoUnityLoadCallback f29763e;

    public b(e eVar, String str, InterstitialAd interstitialAd, Handler handler, MolocoUnityLoadCallback molocoUnityLoadCallback) {
        this.f29759a = eVar;
        this.f29760b = str;
        this.f29761c = interstitialAd;
        this.f29762d = handler;
        this.f29763e = molocoUnityLoadCallback;
    }

    @Override // com.moloco.sdk.publisher.AdLoad.Listener
    public final void onAdLoadFailed(MolocoAdError molocoAdError) {
        AbstractC3340k.e(molocoAdError, "molocoAdError");
        this.f29762d.post(new f(this.f29763e, this.f29760b, molocoAdError, 10));
    }

    @Override // com.moloco.sdk.publisher.AdLoad.Listener
    public final void onAdLoadSuccess(MolocoAd molocoAd) {
        AbstractC3340k.e(molocoAd, "molocoAd");
        e eVar = this.f29759a;
        String str = this.f29760b;
        eVar.f29769a.put(str, this.f29761c);
        this.f29762d.post(new a(this.f29763e, str, 1));
    }
}
