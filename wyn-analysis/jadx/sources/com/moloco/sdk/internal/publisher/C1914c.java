package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.internal.publisher.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1914c implements InterstitialAd, b0, FullscreenAd {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f29003a;

    public C1914c(l0 l0Var) {
        this.f29003a = l0Var;
    }

    @Override // com.moloco.sdk.internal.publisher.b0
    public final void a(long j8, long j10) {
        this.f29003a.a(j8, j10);
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public final void destroy() {
        this.f29003a.destroy();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final boolean isLoaded() {
        return this.f29003a.f29071p.k;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final void load(String bidResponseJson, AdLoad.Listener listener) {
        AbstractC3340k.e(bidResponseJson, "bidResponseJson");
        this.f29003a.load(bidResponseJson, listener);
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    public final void show(AdShowListener adShowListener) {
        this.f29003a.show(new C1916e((InterstitialAdShowListener) adShowListener));
    }
}
