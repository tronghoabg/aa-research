package com.waze.bg.d;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g extends dm<h, g> implements fj {
    /* synthetic */ g(byte[] bArr) {
        super(h.DEFAULT_INSTANCE);
    }

    public final void a(int i2) {
        copyOnWrite();
        ((h) this.instance).setFromNode(i2);
    }

    public final void b(int i2) {
        copyOnWrite();
        ((h) this.instance).setToNode(i2);
    }

    private g() {
        throw null;
    }
}
