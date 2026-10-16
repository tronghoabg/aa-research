package com.waze.n;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l extends dm<m, l> implements fj {
    /* synthetic */ l(byte[] bArr) {
        super(m.DEFAULT_INSTANCE);
    }

    public final void a(n nVar) {
        copyOnWrite();
        ((m) this.instance).setInCarDisplayMode(nVar);
    }

    public final void b(n nVar) {
        copyOnWrite();
        ((m) this.instance).setMobileDisplayMode(nVar);
    }

    private l() {
        throw null;
    }
}
