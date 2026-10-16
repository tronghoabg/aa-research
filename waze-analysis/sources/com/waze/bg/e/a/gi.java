package com.waze.bg.e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gi extends com.google.v.dm<gj, gi> implements com.google.v.fj {
    /* synthetic */ gi(byte[] bArr) {
        super(gj.DEFAULT_INSTANCE);
    }

    public final void a(i.c.a.a.l lVar) {
        copyOnWrite();
        ((gj) this.instance).setAdditionalLocationInfo(lVar);
    }

    public final void b(ei eiVar) {
        copyOnWrite();
        ((gj) this.instance).setSnappedLocation(eiVar);
    }

    private gi() {
        throw null;
    }
}
