package com.waze.bm.a.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r extends dm<s, r> implements fj {
    /* synthetic */ r(byte[] bArr) {
        super(s.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((s) this.instance).setIsSuccessful(z);
    }

    private r() {
        throw null;
    }
}
