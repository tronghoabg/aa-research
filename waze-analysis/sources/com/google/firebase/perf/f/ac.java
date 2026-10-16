package com.google.firebase.perf.f;

import com.google.v.dm;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ac extends dm<ad, ac> implements ae {
    /* synthetic */ ac(byte[] bArr) {
        super(ad.DEFAULT_INSTANCE);
    }

    public final void a(f fVar) {
        copyOnWrite();
        ((ad) this.instance).setApplicationInfo(fVar.build());
    }

    public final void b(r rVar) {
        copyOnWrite();
        ((ad) this.instance).setGaugeMetric(rVar);
    }

    public final void c(ab abVar) {
        copyOnWrite();
        ((ad) this.instance).setNetworkRequestMetric(abVar);
    }

    public final void d(ao aoVar) {
        copyOnWrite();
        ((ad) this.instance).setTraceMetric(aoVar);
    }

    @Override // com.google.firebase.perf.f.ae
    public final r getGaugeMetric() {
        return ((ad) this.instance).getGaugeMetric();
    }

    @Override // com.google.firebase.perf.f.ae
    public final ab getNetworkRequestMetric() {
        return ((ad) this.instance).getNetworkRequestMetric();
    }

    @Override // com.google.firebase.perf.f.ae
    public final ao getTraceMetric() {
        return ((ad) this.instance).getTraceMetric();
    }

    @Override // com.google.firebase.perf.f.ae
    public final boolean hasGaugeMetric() {
        return ((ad) this.instance).hasGaugeMetric();
    }

    @Override // com.google.firebase.perf.f.ae
    public final boolean hasNetworkRequestMetric() {
        return ((ad) this.instance).hasNetworkRequestMetric();
    }

    @Override // com.google.firebase.perf.f.ae
    public final boolean hasTraceMetric() {
        return ((ad) this.instance).hasTraceMetric();
    }

    private ac() {
        throw null;
    }
}
