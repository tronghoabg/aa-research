package com.waze.ak;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p extends dm<q, p> implements fj {
    /* synthetic */ p(byte[] bArr) {
        super(q.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((q) this.instance).setAlternativeRouteUuid(str);
    }

    public final void b(j jVar) {
        copyOnWrite();
        ((q) this.instance).setDestination(jVar);
    }

    public final void c(l lVar) {
        copyOnWrite();
        ((q) this.instance).setDistanceUnit(lVar);
    }

    public final void d(y yVar) {
        copyOnWrite();
        ((q) this.instance).setInstructionMode(yVar);
    }

    public final void e(af afVar) {
        copyOnWrite();
        ((q) this.instance).setVoiceCategory(afVar);
    }

    private p() {
        throw null;
    }
}
