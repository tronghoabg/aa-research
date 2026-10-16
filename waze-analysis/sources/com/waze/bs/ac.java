package com.waze.bs;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac extends dm<ad, ac> implements fj {
    /* synthetic */ ac(byte[] bArr) {
        super(ad.DEFAULT_INSTANCE);
    }

    public final void a(d dVar) {
        copyOnWrite();
        ((ad) this.instance).setChatContext(dVar);
    }

    public final void b(am amVar) {
        copyOnWrite();
        ((ad) this.instance).setTrigger(amVar);
    }

    private ac() {
        throw null;
    }
}
