package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.d3;
import com.applovin.impl.g8;
import com.applovin.impl.h8;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;

/* loaded from: classes.dex */
public class b implements h8.a {

    /* renamed from: a, reason: collision with root package name */
    private final k f22074a;

    /* renamed from: b, reason: collision with root package name */
    private final d3 f22075b;

    /* renamed from: c, reason: collision with root package name */
    private final h8 f22076c;

    /* renamed from: d, reason: collision with root package name */
    private final g8 f22077d;

    /* renamed from: e, reason: collision with root package name */
    private final a.InterfaceC0014a f22078e;

    public b(d3 d3Var, ViewGroup viewGroup, a.InterfaceC0014a interfaceC0014a, k kVar) {
        this.f22074a = kVar;
        this.f22075b = d3Var;
        this.f22078e = interfaceC0014a;
        this.f22077d = new g8(viewGroup, kVar);
        h8 h8Var = new h8(viewGroup, kVar, this);
        this.f22076c = h8Var;
        h8Var.a(d3Var);
        kVar.O();
        if (o.a()) {
            kVar.O().a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    public void a() {
        this.f22076c.b();
    }

    public d3 b() {
        return this.f22075b;
    }

    public void c() {
        this.f22074a.O();
        if (o.a()) {
            this.f22074a.O().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f22075b.n0().compareAndSet(false, true)) {
            this.f22074a.O();
            if (o.a()) {
                this.f22074a.O().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f22075b.getNativeAd().isExpired()) {
                o.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f22074a.f().a(this.f22075b);
            }
            this.f22074a.X().processRawAdImpression(this.f22075b, this.f22078e);
        }
    }

    @Override // com.applovin.impl.h8.a
    public void onLogVisibilityImpression() {
        a(this.f22077d.a(this.f22075b));
    }

    private void a(long j8) {
        if (this.f22075b.o0().compareAndSet(false, true)) {
            this.f22074a.O();
            if (o.a()) {
                this.f22074a.O().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f22074a.X().processViewabilityAdImpressionPostback(this.f22075b, j8, this.f22078e);
        }
    }
}
