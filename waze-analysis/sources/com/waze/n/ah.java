package com.waze.n;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ah extends dm<ai, ah> implements fj {
    /* synthetic */ ah(byte[] bArr) {
        super(ai.DEFAULT_INSTANCE);
    }

    public final void a(d dVar) {
        copyOnWrite();
        ((ai) this.instance).setMetadata(dVar);
    }

    public final void b(l.b.c cVar) {
        copyOnWrite();
        ((ai) this.instance).setStat(cVar);
    }

    private ah() {
        throw null;
    }
}
