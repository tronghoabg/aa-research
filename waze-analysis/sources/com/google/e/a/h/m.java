package com.google.e.a.h;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m extends dm<n, m> implements fj {
    /* synthetic */ m(byte[] bArr) {
        super(n.DEFAULT_INSTANCE);
    }

    public final void a(int i2) {
        copyOnWrite();
        ((n) this.instance).setKeySize(i2);
    }

    public final void b(p pVar) {
        copyOnWrite();
        ((n) this.instance).setParams(pVar);
    }

    private m() {
        throw null;
    }
}
