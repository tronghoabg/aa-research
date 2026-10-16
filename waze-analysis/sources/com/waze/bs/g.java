package com.waze.bs;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends dm<h, g> implements fj {
    /* synthetic */ g(byte[] bArr) {
        super(h.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((h) this.instance).setSucceeded(z);
    }

    private g() {
        throw null;
    }
}
