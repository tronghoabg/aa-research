package com.waze.o;

import com.google.v.dm;
import com.google.v.fj;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l extends dm<m, l> implements fj {
    /* synthetic */ l(byte[] bArr) {
        super(m.DEFAULT_INSTANCE);
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(((m) this.instance).getAltRoutesList());
    }

    public final void b(Iterable iterable) {
        copyOnWrite();
        ((m) this.instance).addAllAltRoutes(iterable);
    }

    public final void c(ce ceVar) {
        copyOnWrite();
        ((m) this.instance).setDestination(ceVar);
    }

    public final void d(long j2) {
        copyOnWrite();
        ((m) this.instance).setRouteId(j2);
    }

    private l() {
        throw null;
    }
}
