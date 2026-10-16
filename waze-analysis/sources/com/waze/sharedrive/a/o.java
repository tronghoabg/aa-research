package com.waze.sharedrive.a;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o extends dm<p, o> implements fj {
    /* synthetic */ o(byte[] bArr) {
        super(p.DEFAULT_INSTANCE);
    }

    public final void a(String str) {
        copyOnWrite();
        ((p) this.instance).setName(str);
    }

    private o() {
        throw null;
    }
}
