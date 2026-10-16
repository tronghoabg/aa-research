package com.google.android.gms.ads.mediation.rtb;

import J6.a;
import J6.c;
import J6.g;
import J6.h;
import J6.l;
import J6.n;
import J6.q;
import L6.b;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class RtbAdapter extends a {
    public abstract void collectSignals(L6.a aVar, b bVar);

    public void loadRtbAppOpenAd(g gVar, c cVar) {
        loadAppOpenAd(gVar, cVar);
    }

    public void loadRtbBannerAd(h hVar, c cVar) {
        loadBannerAd(hVar, cVar);
    }

    public void loadRtbInterstitialAd(l lVar, c cVar) {
        loadInterstitialAd(lVar, cVar);
    }

    @Deprecated
    public void loadRtbNativeAd(n nVar, c cVar) {
        loadNativeAd(nVar, cVar);
    }

    public void loadRtbNativeAdMapper(n nVar, c cVar) throws RemoteException {
        loadNativeAdMapper(nVar, cVar);
    }

    public void loadRtbRewardedAd(q qVar, c cVar) {
        loadRewardedAd(qVar, cVar);
    }

    public void loadRtbRewardedInterstitialAd(q qVar, c cVar) {
        loadRewardedInterstitialAd(qVar, cVar);
    }
}
