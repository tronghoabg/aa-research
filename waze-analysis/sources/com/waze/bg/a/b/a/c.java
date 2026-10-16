package com.waze.bg.a.b.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c extends dm<d, c> implements fj {
    /* synthetic */ c(byte[] bArr) {
        super(d.DEFAULT_INSTANCE);
    }

    public final void a(int i2) {
        copyOnWrite();
        ((d) this.instance).setAzymuth(i2);
    }

    public final void b(com.waze.bg.d.d dVar) {
        copyOnWrite();
        ((d) this.instance).setPosition(dVar);
    }

    private c() {
        throw null;
    }
}
