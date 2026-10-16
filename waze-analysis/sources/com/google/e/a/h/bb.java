package com.google.e.a.h;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bb extends dm<bc, bb> implements fj {
    /* synthetic */ bb(byte[] bArr) {
        super(bc.DEFAULT_INSTANCE);
    }

    public final void a(com.google.v.v vVar) {
        copyOnWrite();
        ((bc) this.instance).setKeyValue(vVar);
    }

    public final void b(bg bgVar) {
        copyOnWrite();
        ((bc) this.instance).setParams(bgVar);
    }

    private bb() {
        throw null;
    }
}
