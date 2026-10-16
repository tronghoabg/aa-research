package com.google.e.a.h;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o extends dm<p, o> implements fj {
    /* synthetic */ o(byte[] bArr) {
        super(p.DEFAULT_INSTANCE);
    }

    public final void a(int i2) {
        copyOnWrite();
        ((p) this.instance).setCiphertextSegmentSize(i2);
    }

    public final void b(int i2) {
        copyOnWrite();
        ((p) this.instance).setDerivedKeySize(i2);
    }

    public final void c(ba baVar) {
        copyOnWrite();
        ((p) this.instance).setHkdfHashType(baVar);
    }

    public final void d(bf bfVar) {
        copyOnWrite();
        ((p) this.instance).setHmacParams(bfVar.build());
    }

    private o() {
        throw null;
    }
}
