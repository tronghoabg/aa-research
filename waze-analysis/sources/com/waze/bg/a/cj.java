package com.waze.bg.a;

import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cj extends com.google.v.dm<de, cj> implements fj {
    /* synthetic */ cj(byte[] bArr) {
        super(de.DEFAULT_INSTANCE);
    }

    public final void a(cg cgVar) {
        copyOnWrite();
        ((de) this.instance).setAnimal(cgVar);
    }

    public final void b(ci ciVar) {
        copyOnWrite();
        ((de) this.instance).setBlockedLane(ciVar);
    }

    public final void c(cn cnVar) {
        copyOnWrite();
        ((de) this.instance).setClosure(cnVar);
    }

    public final void d(cp cpVar) {
        copyOnWrite();
        ((de) this.instance).setCrash(cpVar);
    }

    public final void e(cr crVar) {
        copyOnWrite();
        ((de) this.instance).setHazardOnRoad(crVar);
    }

    public final void f(cv cvVar) {
        copyOnWrite();
        ((de) this.instance).setPersonalSafety(cvVar);
    }

    public final void g(cx cxVar) {
        copyOnWrite();
        ((de) this.instance).setPolice(cxVar);
    }

    public final void h(cz czVar) {
        copyOnWrite();
        ((de) this.instance).setTraffic(czVar);
    }

    public final void i(dd ddVar) {
        copyOnWrite();
        ((de) this.instance).setWeather(ddVar);
    }

    private cj() {
        throw null;
    }
}
