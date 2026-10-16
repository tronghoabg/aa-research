package com.waze.bg.d;

import com.google.v.dm;
import com.google.v.fj;
import i.b.l.da;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c extends dm<d, c> implements fj {
    /* synthetic */ c(byte[] bArr) {
        super(d.DEFAULT_INSTANCE);
    }

    public final void a(da daVar) {
        copyOnWrite();
        ((d) this.instance).setGpsPosition(daVar);
    }

    public final void b(h hVar) {
        copyOnWrite();
        ((d) this.instance).setSegmentNodes(hVar);
    }

    private c() {
        throw null;
    }
}
