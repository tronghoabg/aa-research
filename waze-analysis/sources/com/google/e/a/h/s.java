package com.google.e.a.h;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class s extends dm<t, s> implements fj {
    /* synthetic */ s(byte[] bArr) {
        super(t.DEFAULT_INSTANCE);
    }

    public final void a(int i2) {
        copyOnWrite();
        ((t) this.instance).setKeySize(i2);
    }

    public final void b(v vVar) {
        copyOnWrite();
        ((t) this.instance).setParams(vVar);
    }

    private s() {
        throw null;
    }
}
