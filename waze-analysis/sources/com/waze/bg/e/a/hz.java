package com.waze.bg.e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class hz extends com.google.v.dm<ia, hz> implements com.google.v.fj {
    /* synthetic */ hz(byte[] bArr) {
        super(ia.DEFAULT_INSTANCE);
    }

    public final void a(cx cxVar) {
        copyOnWrite();
        ((ia) this.instance).setDestination(cxVar);
    }

    public final void b(int i2) {
        copyOnWrite();
        ((ia) this.instance).setLegacyRouteId(i2);
    }

    public final void c(gj gjVar) {
        copyOnWrite();
        ((ia) this.instance).setOrigin(gjVar);
    }

    public final void d(hf hfVar) {
        copyOnWrite();
        ((ia) this.instance).setRoutingOptions(hfVar);
    }

    public final void e(ht htVar) {
        copyOnWrite();
        ((ia) this.instance).setTimePreferences(htVar);
    }

    public final void f(ck ckVar) {
        copyOnWrite();
        ((ia) this.instance).setVehicleData(ckVar);
    }

    private hz() {
        throw null;
    }
}
