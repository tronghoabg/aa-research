package com.waze.bs;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k extends dm<l, k> implements fj {
    /* synthetic */ k(byte[] bArr) {
        super(l.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((l) this.instance).setSucceeded(z);
    }

    private k() {
        throw null;
    }
}
