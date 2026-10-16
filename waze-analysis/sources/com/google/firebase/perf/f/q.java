package com.google.firebase.perf.f;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class q extends dm<r, q> implements fj {
    /* synthetic */ q(byte[] bArr) {
        super(r.DEFAULT_INSTANCE);
    }

    public final void a(d dVar) {
        copyOnWrite();
        ((r) this.instance).addAndroidMemoryReadings(dVar);
    }

    public final void b(k kVar) {
        copyOnWrite();
        ((r) this.instance).addCpuMetricReadings(kVar);
    }

    public final void c(p pVar) {
        copyOnWrite();
        ((r) this.instance).setGaugeMetadata(pVar);
    }

    public final void d(String str) {
        copyOnWrite();
        ((r) this.instance).setSessionId(str);
    }

    private q() {
        throw null;
    }
}
