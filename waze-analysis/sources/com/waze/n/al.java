package com.waze.n;

import com.google.v.dm;
import l.a.bri;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class al extends dm<am, al> implements an {
    /* synthetic */ al(byte[] bArr) {
        super(am.DEFAULT_INSTANCE);
    }

    public final void a(v vVar) {
        copyOnWrite();
        ((am) this.instance).setMetadata(vVar);
    }

    public final void b(bri briVar) {
        copyOnWrite();
        ((am) this.instance).setPayload(briVar);
    }

    private al() {
        throw null;
    }
}
