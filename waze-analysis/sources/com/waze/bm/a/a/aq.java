package com.waze.bm.a.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aq extends dm<aw, aq> implements fj {
    /* synthetic */ aq(byte[] bArr) {
        super(aw.DEFAULT_INSTANCE);
    }

    public final void a(ar arVar) {
        copyOnWrite();
        ((aw) this.instance).setFte(arVar.build());
    }

    public final void b(au auVar) {
        copyOnWrite();
        ((aw) this.instance).setUserInitiated(auVar.build());
    }

    private aq() {
        throw null;
    }
}
