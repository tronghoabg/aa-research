package com.waze.bm.a.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class am extends dm<an, am> implements fj {
    /* synthetic */ am(byte[] bArr) {
        super(an.DEFAULT_INSTANCE);
    }

    public final void a(af afVar) {
        copyOnWrite();
        ((an) this.instance).setChatContext(afVar);
    }

    public final void b(aq aqVar) {
        copyOnWrite();
        ((an) this.instance).setTrigger(aqVar.build());
    }

    private am() {
        throw null;
    }
}
