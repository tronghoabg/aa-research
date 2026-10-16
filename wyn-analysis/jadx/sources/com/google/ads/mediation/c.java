package com.google.ads.mediation;

import J6.m;
import x6.C4481l;

/* loaded from: classes3.dex */
public final class c extends I6.b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f26244a;

    /* renamed from: b, reason: collision with root package name */
    public final m f26245b;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, m mVar) {
        this.f26244a = abstractAdViewAdapter;
        this.f26245b = mVar;
    }

    @Override // x6.AbstractC4473d
    public final void onAdFailedToLoad(C4481l c4481l) {
        this.f26245b.onAdFailedToLoad(this.f26244a, c4481l);
    }

    @Override // x6.AbstractC4473d
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        I6.a aVar = (I6.a) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f26244a;
        abstractAdViewAdapter.mInterstitialAd = aVar;
        m mVar = this.f26245b;
        aVar.setFullScreenContentCallback(new d(abstractAdViewAdapter, mVar));
        mVar.onAdLoaded(abstractAdViewAdapter);
    }
}
