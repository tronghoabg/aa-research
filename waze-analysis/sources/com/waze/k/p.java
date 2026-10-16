package com.waze.k;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p extends dm<q, p> implements fj {
    /* synthetic */ p(byte[] bArr) {
        super(q.DEFAULT_INSTANCE);
    }

    public final void a(o oVar) {
        copyOnWrite();
        ((q) this.instance).setActionType(oVar);
    }

    public final void b(String str) {
        copyOnWrite();
        ((q) this.instance).setName(str);
    }

    private p() {
        throw null;
    }
}
