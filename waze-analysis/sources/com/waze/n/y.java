package com.waze.n;

import com.google.v.dm;
import l.a.brf;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class y extends dm<z, y> implements aa {
    /* synthetic */ y(byte[] bArr) {
        super(z.DEFAULT_INSTANCE);
    }

    public final void a(b bVar) {
        copyOnWrite();
        ((z) this.instance).setMetadata(bVar);
    }

    public final void b(brf brfVar) {
        copyOnWrite();
        ((z) this.instance).setPayload(brfVar);
    }

    private y() {
        throw null;
    }
}
