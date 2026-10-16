package com.waze.bg.e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class he extends com.google.v.dm<hf, he> implements com.google.v.fj {
    /* synthetic */ he(byte[] bArr) {
        super(hf.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((hf) this.instance).setAllowUnknownDirections(z);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((hf) this.instance).setAvoidDangerZones(z);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((hf) this.instance).setAvoidDangerousTurns(z);
    }

    public final void d(boolean z) {
        copyOnWrite();
        ((hf) this.instance).setAvoidFerries(z);
    }

    public final void e(boolean z) {
        copyOnWrite();
        ((hf) this.instance).setAvoidLongTrails(z);
    }

    public final void f(boolean z) {
        copyOnWrite();
        ((hf) this.instance).setAvoidPrimaries(z);
    }

    public final void g(boolean z) {
        copyOnWrite();
        ((hf) this.instance).setAvoidTollRoads(z);
    }

    public final void h(boolean z) {
        copyOnWrite();
        ((hf) this.instance).setAvoidTrails(z);
    }

    public final void i(boolean z) {
        copyOnWrite();
        ((hf) this.instance).setDestinationInDangerZone(z);
    }

    public final void j(boolean z) {
        copyOnWrite();
        ((hf) this.instance).setIgnorePreferredRoutes(z);
    }

    public final void k(boolean z) {
        copyOnWrite();
        ((hf) this.instance).setOriginInDangerZone(z);
    }

    public final void l(boolean z) {
        copyOnWrite();
        ((hf) this.instance).setUsePeta(z);
    }

    private he() {
        throw null;
    }
}
