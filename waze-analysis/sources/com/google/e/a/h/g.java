package com.google.e.a.h;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g extends dm<h, g> implements fj {
    /* synthetic */ g(byte[] bArr) {
        super(h.DEFAULT_INSTANCE);
    }

    public final void a(r rVar) {
        copyOnWrite();
        ((h) this.instance).setAesCtrKey(rVar);
    }

    public final void b(bc bcVar) {
        copyOnWrite();
        ((h) this.instance).setHmacKey(bcVar);
    }

    private g() {
        throw null;
    }
}
