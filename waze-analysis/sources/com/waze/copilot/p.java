package com.waze.copilot;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p extends dm<q, p> implements fj {
    /* synthetic */ p(byte[] bArr) {
        super(q.DEFAULT_INSTANCE);
    }

    public final void a(n nVar) {
        copyOnWrite();
        ((q) this.instance).addAssetInfo(nVar);
    }

    private p() {
        throw null;
    }
}
