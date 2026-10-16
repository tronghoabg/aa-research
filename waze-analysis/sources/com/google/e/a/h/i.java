package com.google.e.a.h;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i extends dm<j, i> implements fj {
    /* synthetic */ i(byte[] bArr) {
        super(j.DEFAULT_INSTANCE);
    }

    public final void a(t tVar) {
        copyOnWrite();
        ((j) this.instance).setAesCtrKeyFormat(tVar);
    }

    public final void b(be beVar) {
        copyOnWrite();
        ((j) this.instance).setHmacKeyFormat(beVar);
    }

    private i() {
        throw null;
    }
}
