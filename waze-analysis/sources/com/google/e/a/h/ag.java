package com.google.e.a.h;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ag extends dm<ah, ag> implements fj {
    /* synthetic */ ag(byte[] bArr) {
        super(ah.DEFAULT_INSTANCE);
    }

    public final void a(int i2) {
        copyOnWrite();
        ((ah) this.instance).setCiphertextSegmentSize(i2);
    }

    public final void b(int i2) {
        copyOnWrite();
        ((ah) this.instance).setDerivedKeySize(i2);
    }

    public final void c(ba baVar) {
        copyOnWrite();
        ((ah) this.instance).setHkdfHashType(baVar);
    }

    private ag() {
        throw null;
    }
}
