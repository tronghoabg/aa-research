package com.applovin.mediation.adapters;

import N.C0740o;
import Z.k;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.moloco.sdk.internal.publisher.H;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i;
import ef.C2515C;
import tf.p;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24071c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24072d;

    public /* synthetic */ e(MolocoMediationAdapter molocoMediationAdapter, MaxAdapterListener maxAdapterListener, MaxAdapterResponseParameters maxAdapterResponseParameters, int i5) {
        this.f24069a = i5;
        this.f24070b = molocoMediationAdapter;
        this.f24072d = maxAdapterListener;
        this.f24071c = maxAdapterResponseParameters;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24069a) {
            case 0:
                MolocoMediationAdapter molocoMediationAdapter = (MolocoMediationAdapter) this.f24070b;
                MaxAdapterResponseParameters maxAdapterResponseParameters = (MaxAdapterResponseParameters) this.f24071c;
                return molocoMediationAdapter.lambda$loadInterstitialAd$2((MaxInterstitialAdapterListener) this.f24072d, maxAdapterResponseParameters, (InterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
            case 1:
                MolocoMediationAdapter molocoMediationAdapter2 = (MolocoMediationAdapter) this.f24070b;
                MaxAdapterResponseParameters maxAdapterResponseParameters2 = (MaxAdapterResponseParameters) this.f24071c;
                return molocoMediationAdapter2.lambda$loadRewardedAd$3((MaxRewardedAdapterListener) this.f24072d, maxAdapterResponseParameters2, (RewardedInterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
            default:
                ((Integer) obj2).getClass();
                H.M((i) this.f24070b, (tf.a) this.f24072d, (k) this.f24071c, (C0740o) obj, 385);
                return C2515C.f34653a;
        }
    }

    public /* synthetic */ e(i iVar, tf.a aVar, k kVar, int i5) {
        this.f24069a = 2;
        this.f24070b = iVar;
        this.f24072d = aVar;
        this.f24071c = kVar;
    }
}
