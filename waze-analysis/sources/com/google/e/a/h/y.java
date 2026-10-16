package com.google.e.a.h;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class y extends dm<z, y> implements fj {
    /* synthetic */ y(byte[] bArr) {
        super(z.DEFAULT_INSTANCE);
    }

    public final void a(int i2) {
        copyOnWrite();
        ((z) this.instance).setKeySize(i2);
    }

    public final void b(ab abVar) {
        copyOnWrite();
        ((z) this.instance).setParams(abVar);
    }

    private y() {
        throw null;
    }
}
