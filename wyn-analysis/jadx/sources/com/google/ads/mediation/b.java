package com.google.ads.mediation;

import D6.InterfaceC0358a;
import J6.i;
import com.google.android.gms.ads.AdListener;
import x6.C4481l;
import y6.f;

/* loaded from: classes3.dex */
public final class b extends AdListener implements f, InterfaceC0358a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f26242a;

    /* renamed from: b, reason: collision with root package name */
    public final i f26243b;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, i iVar) {
        this.f26242a = abstractAdViewAdapter;
        this.f26243b = iVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f26243b.onAdClicked(this.f26242a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f26243b.onAdClosed(this.f26242a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(C4481l c4481l) {
        this.f26243b.onAdFailedToLoad(this.f26242a, c4481l);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f26243b.onAdLoaded(this.f26242a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f26243b.onAdOpened(this.f26242a);
    }

    @Override // y6.f
    public final void onAppEvent(String str, String str2) {
        this.f26243b.zza(this.f26242a, str, str2);
    }
}
