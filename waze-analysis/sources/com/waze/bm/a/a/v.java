package com.waze.bm.a.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v extends dm<w, v> implements fj {
    /* synthetic */ v(byte[] bArr) {
        super(w.DEFAULT_INSTANCE);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((w) this.instance).setIsSuccessful(z);
    }

    private v() {
        throw null;
    }
}
