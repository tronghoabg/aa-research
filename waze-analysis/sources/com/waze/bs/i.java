package com.waze.bs;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends dm<j, i> implements fj {
    /* synthetic */ i(byte[] bArr) {
        super(j.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((j) this.instance).setSucceeded(z);
    }

    private i() {
        throw null;
    }
}
