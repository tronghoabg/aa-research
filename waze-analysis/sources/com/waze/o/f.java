package com.waze.o;

import com.google.v.dm;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f extends dm<h, f> implements i {
    /* synthetic */ f(byte[] bArr) {
        super(h.DEFAULT_INSTANCE);
    }

    public final void a(long j2) {
        copyOnWrite();
        ((h) this.instance).setAltId(j2);
    }

    public final void b(g gVar) {
        copyOnWrite();
        ((h) this.instance).setColor(gVar);
    }

    public final void c(ao aoVar) {
        copyOnWrite();
        ((h) this.instance).setRouteDescription(aoVar);
    }

    private f() {
        throw null;
    }
}
