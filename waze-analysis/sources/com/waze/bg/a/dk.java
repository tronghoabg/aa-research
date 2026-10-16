package com.waze.bg.a;

import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dk extends com.google.v.dm<ej, dk> implements fj {
    /* synthetic */ dk(byte[] bArr) {
        super(ej.DEFAULT_INSTANCE);
    }

    public final void a(dq dqVar) {
        copyOnWrite();
        ((ej) this.instance).setCrash(dqVar);
    }

    public final void b(du duVar) {
        copyOnWrite();
        ((ej) this.instance).setHazardOnRoad(duVar);
    }

    public final void c(ea eaVar) {
        copyOnWrite();
        ((ej) this.instance).setPolice(eaVar);
    }

    public final void d(ee eeVar) {
        copyOnWrite();
        ((ej) this.instance).setTraffic(eeVar);
    }

    private dk() {
        throw null;
    }
}
