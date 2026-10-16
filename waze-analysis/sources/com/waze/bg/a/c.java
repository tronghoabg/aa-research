package com.waze.bg.a;

import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c extends com.google.v.dm<e, c> implements fj {
    /* synthetic */ c(byte[] bArr) {
        super(e.DEFAULT_INSTANCE);
    }

    public final void a(de deVar) {
        copyOnWrite();
        ((e) this.instance).setAlertDetails(deVar);
    }

    public final void b(int i2) {
        copyOnWrite();
        ((e) this.instance).setAzymuth(i2);
    }

    public final void c(com.waze.ca.e eVar) {
        copyOnWrite();
        ((e) this.instance).setReportTime(eVar);
    }

    public final void d(d dVar) {
        copyOnWrite();
        ((e) this.instance).setReportingManner(dVar);
    }

    public final void e(com.waze.bg.d.f fVar) {
        copyOnWrite();
        ((e) this.instance).setSegmentDirection(fVar);
    }

    public final void f(com.waze.bg.d.d dVar) {
        copyOnWrite();
        ((e) this.instance).setUserPosition(dVar);
    }

    private c() {
        throw null;
    }
}
