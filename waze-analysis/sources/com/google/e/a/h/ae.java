package com.google.e.a.h;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ae extends dm<af, ae> implements fj {
    /* synthetic */ ae(byte[] bArr) {
        super(af.DEFAULT_INSTANCE);
    }

    public final void a(int i2) {
        copyOnWrite();
        ((af) this.instance).setKeySize(i2);
    }

    public final void b(ah ahVar) {
        copyOnWrite();
        ((af) this.instance).setParams(ahVar);
    }

    private ae() {
        throw null;
    }
}
