package com.google.e.a.h;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bf extends dm<bg, bf> implements fj {
    /* synthetic */ bf(byte[] bArr) {
        super(bg.DEFAULT_INSTANCE);
    }

    public final void a(ba baVar) {
        copyOnWrite();
        ((bg) this.instance).setHash(baVar);
    }

    public final void b(int i2) {
        copyOnWrite();
        ((bg) this.instance).setTagSize(i2);
    }

    private bf() {
        throw null;
    }
}
