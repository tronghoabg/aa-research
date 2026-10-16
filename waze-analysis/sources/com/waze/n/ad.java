package com.waze.n;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ad extends dm<ae, ad> implements fj {
    /* synthetic */ ad(byte[] bArr) {
        super(ae.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((ae) this.instance).addAllEvents(iterable);
    }

    public final void b(d dVar) {
        copyOnWrite();
        ((ae) this.instance).setMetadata(dVar);
    }

    private ad() {
        throw null;
    }
}
