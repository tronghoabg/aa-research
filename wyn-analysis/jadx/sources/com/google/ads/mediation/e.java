package com.google.ads.mediation;

import A6.l;
import A6.m;
import A6.n;
import J6.o;
import com.google.android.gms.ads.AdListener;
import x6.C4481l;

/* loaded from: classes3.dex */
public final class e extends AdListener implements n, m, l {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f26248a;

    /* renamed from: b, reason: collision with root package name */
    public final o f26249b;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, o oVar) {
        this.f26248a = abstractAdViewAdapter;
        this.f26249b = oVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f26249b.onAdClicked(this.f26248a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f26249b.onAdClosed(this.f26248a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(C4481l c4481l) {
        this.f26249b.onAdFailedToLoad(this.f26248a, c4481l);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f26249b.onAdImpression(this.f26248a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f26249b.onAdOpened(this.f26248a);
    }
}
