package com.waze.ap.b;

import com.google.v.dm;
import com.google.v.fj;
import com.waze.ap.a.a.am;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i extends dm<j, i> implements fj {
    /* synthetic */ i(byte[] bArr) {
        super(j.DEFAULT_INSTANCE);
    }

    public final void a(am amVar) {
        copyOnWrite();
        ((j) this.instance).setTrigger(amVar);
    }

    private i() {
        throw null;
    }
}
