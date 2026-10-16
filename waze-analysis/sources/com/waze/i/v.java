package com.waze.i;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class v extends dm<w, v> implements fj {
    /* synthetic */ v(byte[] bArr) {
        super(w.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((w) this.instance).setAuthenticationToken(str);
    }

    private v() {
        throw null;
    }
}
