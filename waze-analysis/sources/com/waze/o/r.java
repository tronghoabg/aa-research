package com.waze.o;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r extends dm<s, r> implements fj {
    /* synthetic */ r(byte[] bArr) {
        super(s.DEFAULT_INSTANCE);
    }

    public final void a() {
        copyOnWrite();
        ((s) this.instance).setIsSucceeded(true);
    }

    private r() {
        throw null;
    }
}
