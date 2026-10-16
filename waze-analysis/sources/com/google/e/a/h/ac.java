package com.google.e.a.h;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ac extends dm<ad, ac> implements fj {
    /* synthetic */ ac(byte[] bArr) {
        super(ad.DEFAULT_INSTANCE);
    }

    public final void a(com.google.v.v vVar) {
        copyOnWrite();
        ((ad) this.instance).setKeyValue(vVar);
    }

    public final void b(ah ahVar) {
        copyOnWrite();
        ((ad) this.instance).setParams(ahVar);
    }

    private ac() {
        throw null;
    }
}
