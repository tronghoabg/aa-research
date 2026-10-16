package com.waze.n;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o extends dm<p, o> implements fj {
    /* synthetic */ o(byte[] bArr) {
        super(p.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((p) this.instance).setDriving(z);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((p) this.instance).setNavigating(z);
    }

    private o() {
        throw null;
    }
}
