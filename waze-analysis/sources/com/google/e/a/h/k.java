package com.google.e.a.h;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k extends dm<l, k> implements fj {
    /* synthetic */ k(byte[] bArr) {
        super(l.DEFAULT_INSTANCE);
    }

    public final void a(com.google.v.v vVar) {
        copyOnWrite();
        ((l) this.instance).setKeyValue(vVar);
    }

    public final void b(p pVar) {
        copyOnWrite();
        ((l) this.instance).setParams(pVar);
    }

    private k() {
        throw null;
    }
}
