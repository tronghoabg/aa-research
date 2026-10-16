package com.google.ads.mediation;

import J6.m;
import x6.AbstractC4480k;

/* loaded from: classes3.dex */
public final class d extends AbstractC4480k {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f26246a;

    /* renamed from: b, reason: collision with root package name */
    public final m f26247b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, m mVar) {
        this.f26246a = abstractAdViewAdapter;
        this.f26247b = mVar;
    }

    @Override // x6.AbstractC4480k
    public final void onAdDismissedFullScreenContent() {
        this.f26247b.onAdClosed(this.f26246a);
    }

    @Override // x6.AbstractC4480k
    public final void onAdShowedFullScreenContent() {
        this.f26247b.onAdOpened(this.f26246a);
    }
}
