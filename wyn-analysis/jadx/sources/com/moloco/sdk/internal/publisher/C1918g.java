package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.internal.publisher.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1918g implements RewardedInterstitialAd, b0, FullscreenAd {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f29019a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29020b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.config.a f29021c;

    /* renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f29022d;

    public C1918g(l0 l0Var, String adUnitId, com.moloco.sdk.internal.services.config.a aVar, com.moloco.sdk.acm.recorder.c cVar) {
        AbstractC3340k.e(adUnitId, "adUnitId");
        this.f29019a = l0Var;
        this.f29020b = adUnitId;
        this.f29021c = aVar;
        this.f29022d = cVar;
    }

    @Override // com.moloco.sdk.internal.publisher.b0
    public final void a(long j8, long j10) {
        this.f29019a.a(j8, j10);
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public final void destroy() {
        this.f29019a.destroy();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final boolean isLoaded() {
        return this.f29019a.f29071p.k;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final void load(String bidResponseJson, AdLoad.Listener listener) {
        AbstractC3340k.e(bidResponseJson, "bidResponseJson");
        this.f29019a.load(bidResponseJson, listener);
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    public final void show(AdShowListener adShowListener) {
        C1920i c1920i = new C1920i((RewardedInterstitialAdShowListener) adShowListener, new C1917f(this, 0), (com.moloco.sdk.internal.B) com.moloco.sdk.internal.C.f28485a.getValue());
        boolean zContainsKey = this.f29021c.f29578b.containsKey("reward_on_skip_visible");
        l0 l0Var = this.f29019a;
        C1919h c1919h = new C1919h(c1920i, l0Var.c() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.f32379a, new C1917f(this, 1), this.f29020b, zContainsKey, new C1917f(this, 2), this.f29022d);
        l0Var.f29074s = new Ff.d(2, c1919h, this);
        l0Var.f29075t = new Af.q(c1919h, 9);
        l0Var.show(c1919h);
    }
}
