package com.waze.n;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ar extends dm<as, ar> implements fj {
    /* synthetic */ ar(byte[] bArr) {
        super(as.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((as) this.instance).addAllEvents(iterable);
    }

    public final void b(x xVar) {
        copyOnWrite();
        ((as) this.instance).setMetadata(xVar);
    }

    private ar() {
        throw null;
    }
}
