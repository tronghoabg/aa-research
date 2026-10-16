package com.google.e.a.h;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c extends dm<d, c> implements fj {
    /* synthetic */ c(byte[] bArr) {
        super(d.DEFAULT_INSTANCE);
    }

    public final void a(int i2) {
        copyOnWrite();
        ((d) this.instance).setKeySize(i2);
    }

    public final void b(f fVar) {
        copyOnWrite();
        ((d) this.instance).setParams(fVar);
    }

    private c() {
        throw null;
    }
}
