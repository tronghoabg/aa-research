package com.waze.bm.a.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class au extends dm<av, au> implements fj {
    /* synthetic */ au(byte[] bArr) {
        super(av.DEFAULT_INSTANCE);
    }

    public final void a(com.waze.u.a.n nVar) {
        copyOnWrite();
        ((av) this.instance).setUserPrompt(nVar.build());
    }

    private au() {
        throw null;
    }
}
