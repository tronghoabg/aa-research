package com.google.e.a.h;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bd extends dm<be, bd> implements fj {
    /* synthetic */ bd(byte[] bArr) {
        super(be.DEFAULT_INSTANCE);
    }

    public final void a(int i2) {
        copyOnWrite();
        ((be) this.instance).setKeySize(i2);
    }

    public final void b(bg bgVar) {
        copyOnWrite();
        ((be) this.instance).setParams(bgVar);
    }

    private bd() {
        throw null;
    }
}
