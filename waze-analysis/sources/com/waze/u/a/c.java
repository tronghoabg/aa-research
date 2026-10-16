package com.waze.u.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends dm<g, c> implements fj {
    /* synthetic */ c(byte[] bArr) {
        super(g.DEFAULT_INSTANCE);
    }

    public final void a(d dVar) {
        copyOnWrite();
        ((g) this.instance).setEncoding(dVar);
    }

    public final void b(f fVar) {
        copyOnWrite();
        ((g) this.instance).setSampleRate(fVar);
    }

    private c() {
        throw null;
    }
}
